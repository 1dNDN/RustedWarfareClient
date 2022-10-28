package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ag.class */
public class C1077ag extends AbstractC1076af {

    /* renamed from: a */
    static HashMap f6841a = new HashMap();

    /* renamed from: h */
    public static void m590h(String str) {
        Core.LogDebug2("Zip: " + str);
    }

    /* renamed from: a */
    public boolean mo615a(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        C1079ah m595d = m595d(str, true);
        if (m595d == null) {
            return false;
        }
        return m595d.m579c(m586l(str));
    }

    /* renamed from: f */
    public String mo606f(String str) {
        return str;
    }

    /* renamed from: i */
    public static boolean m589i(String str) {
        if (str.contains(".rwmod/") || str.contains(".rwmod\\") || str.endsWith(".rwmod")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo608d(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        C1079ah m595d = m595d(str, true);
        if (m595d == null) {
            return false;
        }
        return m595d.m578d(m586l(str));
    }

    /* renamed from: e */
    public boolean mo607e(String str) {
        m590h("createDirectory not supported in zip files: " + str);
        return false;
    }

    /* renamed from: b */
    public String[] mo612b(String str) {
        C1079ah m595d = m595d(str, true);
        if (m595d == null) {
            return null;
        }
        return m595d.m577e(m586l(str));
    }

    /* renamed from: a */
    public long mo613a(String str, boolean z) {
        C1079ah m595d = m595d(str, z);
        if (m595d == null) {
            return -1L;
        }
        return m595d.m574h(m586l(str));
    }

    /* renamed from: b */
    public C1098j mo611b(String str, boolean z) {
        C1079ah m595d = m595d(str, z);
        if (m595d == null) {
            return null;
        }
        return m595d.m573i(m586l(str));
    }

    /* renamed from: g */
    public long mo605g(String str) {
        String m588j = m588j(str);
        AbstractC1076af m618b = C1075ae.m618b(m588j);
        if (m618b != null) {
            return m618b.mo605g(m588j);
        }
        return new File(m588j).lastModified();
    }

    /* renamed from: c */
    public OutputStream mo609c(String str, boolean z) {
        m590h("writableOutputSteam not supported in zip files: " + str);
        return null;
    }

    /* renamed from: a */
    public boolean mo614a(String str, String str2) {
        m590h("Rename not supported in zip files: " + str + " to " + str2);
        return false;
    }

    /* renamed from: c */
    public boolean mo610c(String str) {
        m590h("Delete not supported in zip files: " + str);
        return false;
    }

    /* renamed from: j */
    public static String m588j(String str) {
        int indexOf = str.indexOf(".rwmod/");
        int indexOf2 = str.indexOf(".rwmod\\");
        if (indexOf2 != -1 && (indexOf2 < indexOf || indexOf == -1)) {
            indexOf = indexOf2;
        }
        if (indexOf == -1 && str.endsWith(".rwmod")) {
            indexOf = str.length() - ".rwmod".length();
        }
        if (indexOf == -1) {
            throw new RuntimeException("Could not find .rwmod in path: " + str);
        }
        return str.substring(0, indexOf + ".rwmod".length());
    }

    /* renamed from: d */
    public static C1079ah m595d(String str, boolean z) {
        C1079ah c1079ah;
        String m2275e;
        String m588j = m588j(str);
        synchronized (f6841a) {
            C1079ah c1079ah2 = (C1079ah) f6841a.get(m588j);
            if (c1079ah2 == null) {
                if (z) {
                    m2275e = m588j;
                } else {
                    m2275e = C0750a.m2275e(m588j);
                }
                try {
                    try {
                        c1079ah2 = new C1079ah(m588j, m2275e);
                        f6841a.put(m588j, c1079ah2);
                    } catch (IllegalArgumentException e) {
                        m590h("Failed to open source zip: '" + m2275e + "'");
                        e.printStackTrace();
                        C0750a.m2283b("Failed to open zip, " + e.getMessage());
                        return null;
                    }
                } catch (IOException e2) {
                    m590h("Failed to open source zip: '" + m2275e + "'");
                    e2.printStackTrace();
                    String str2 = "Failed to open zip, " + e2.getMessage();
                    if (C0750a.m2273f(m2275e)) {
                        m590h("isDirectory: " + m2275e);
                        str2 = "Failed to open .rwmod file (Appears to be a directory!). Please remove .rwmod from any folder names.";
                    }
                    C0750a.m2283b(str2 + VariableScope.nullOrMissingString);
                    return null;
                }
            }
            c1079ah = c1079ah2;
        }
        return c1079ah;
    }

    /* renamed from: e */
    public static void m593e(String str, boolean z) {
        String m588j = m588j(str);
        synchronized (f6841a) {
            C1079ah c1079ah = (C1079ah) f6841a.remove(m588j);
            if (c1079ah != null) {
                Core.LogDebug2("Closing zip file: " + m588j);
                new Thread(new RunnableC10781(m588j, c1079ah)).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.utility.ag$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ag$1.class */
    public final class RunnableC10781 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6842a;

        /* renamed from: b */
        final /* synthetic */ C1079ah f6843b;

        RunnableC10781(String str, C1079ah c1079ah) {
            this.f6842a = str;
            this.f6843b = c1079ah;
        }

        public void run() {
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Core.LogDebug2("Running delayed close of zip: " + this.f6842a);
            this.f6843b.m585a();
        }
    }

    /* renamed from: k */
    public void m587k(String str) {
        m593e(str, false);
    }

    /* renamed from: a */
    public void mo616a() {
    }

    /* renamed from: l */
    public static String m586l(String str) {
        String substring = str.substring(m588j(str).length());
        if (substring.startsWith("/") || substring.startsWith("\\")) {
            substring = substring.substring(1);
        }
        if (substring.startsWith("/") || substring.startsWith("\\")) {
            substring = substring.substring(1);
        }
        if (substring.contains("\\")) {
            substring = substring.replace("\\", "/");
        }
        if (substring.contains("..")) {
            String[] m2130c = C0758f.m2130c(substring, '/');
            ArrayList arrayList = new ArrayList(m2130c.length);
            int i = 0;
            for (int length = m2130c.length - 1; length >= 0; length--) {
                if (m2130c[length].equals("..")) {
                    i++;
                } else if (i > 0) {
                    i--;
                } else {
                    arrayList.add(0, m2130c[length]);
                }
            }
            if (i != 0) {
                m590h("getPathInZip: Backtracking attempt out of zip: " + substring);
            }
            substring = C0758f.m2184a("/", arrayList);
        }
        return substring;
    }
}
