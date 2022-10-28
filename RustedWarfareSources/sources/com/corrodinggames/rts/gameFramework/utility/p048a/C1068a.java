package com.corrodinggames.rts.gameFramework.utility.p048a;

import android.net.Uri;
import com.corrodinggames.rts.appFramework.android.AndroidSAF;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1076af;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/a.class */
public class C1068a extends AbstractC1076af {

    /* renamed from: a */
    static AndroidSAF f6798a = AndroidSAF.getInstance();

    /* renamed from: b */
    static HashMap f6799b = new HashMap();

    /* renamed from: c */
    public static int f6800c = 1;

    /* renamed from: h */
    public static void m712h(String str) {
        AbstractC0916l.m963e("Saf: " + str);
    }

    /* renamed from: i */
    public static void m711i(String str) {
    }

    /* renamed from: j */
    public static void m710j(String str) {
        AbstractC0916l.m963e("Saf: " + str);
    }

    /* renamed from: k */
    public static void m709k(String str) {
    }

    /* renamed from: l */
    public static boolean m708l(String str) {
        if (str.contains(".[saflink]/") || str.contains(".[saflink]\\") || str.endsWith(".[saflink]")) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static String m707m(String str) {
        int indexOf = str.indexOf(".[saflink]/");
        int indexOf2 = str.indexOf(".[saflink]\\");
        if (indexOf2 != -1 && (indexOf2 < indexOf || indexOf == -1)) {
            indexOf = indexOf2;
        }
        if (indexOf == -1 && str.endsWith(".[saflink]")) {
            indexOf = str.length() - ".[saflink]".length();
        }
        if (indexOf == -1) {
            throw new RuntimeException("Could not find saf link in path: " + str);
        }
        return str.substring(0, indexOf + ".[saflink]".length());
    }

    /* renamed from: d */
    public static C1069b m713d(String str, boolean z) {
        String m707m = m707m(str);
        synchronized (f6799b) {
            C1069b c1069b = (C1069b) f6799b.get(m707m);
            if (c1069b == null) {
                C0750a.m2221b("Folder link no longer open");
                return null;
            }
            return c1069b;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: a */
    public void mo604a() {
        synchronized (f6799b) {
            for (C1069b c1069b : f6799b.values()) {
                c1069b.m705a();
            }
        }
    }

    /* renamed from: a */
    public static String m715a(Uri uri, boolean z) {
        AbstractC0916l.m963e("createSAFLink: " + uri);
        synchronized (f6799b) {
            String str = "/saf-virtual/" + f6800c + ".[saflink]";
            f6800c++;
            if (m714a(uri, z, str) == null) {
                return null;
            }
            return str;
        }
    }

    /* renamed from: a */
    public static C1069b m714a(Uri uri, boolean z, String str) {
        C1069b c1069b;
        AbstractC0916l.m963e("createSAFLink: " + uri + " to " + str);
        synchronized (f6799b) {
            if (((C1069b) f6799b.get(str)) != null) {
                AbstractC0916l.m982b("createSAFLink: Already open");
            }
            c1069b = new C1069b(uri, z);
            try {
                c1069b.m701b();
                f6799b.put(str, c1069b);
            } catch (IOException e) {
                e.printStackTrace();
                C0750a.m2221b("Failed to list files: " + e.getMessage());
                return null;
            }
        }
        return c1069b;
    }

    /* renamed from: n */
    public static String m706n(String str) {
        String substring = str.substring(m707m(str).length());
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
            String[] m2068c = C0758f.m2068c(substring, '/');
            ArrayList arrayList = new ArrayList(m2068c.length);
            int i = 0;
            for (int length = m2068c.length - 1; length >= 0; length--) {
                if (m2068c[length].equals("..")) {
                    i++;
                } else if (i > 0) {
                    i--;
                } else {
                    arrayList.add(0, m2068c[length]);
                }
            }
            if (i != 0) {
                m710j("getPathInZip: Backtracking attempt out of zip: " + substring);
            }
            substring = C0758f.m2122a("/", arrayList);
        }
        return substring;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: a */
    public boolean mo603a(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return true;
        }
        C1069b m713d = m713d(str, true);
        if (m713d == null) {
            m712h("fileExists failed to open for: " + str);
            return false;
        }
        try {
            return m713d.m704a(m706n(str));
        } catch (IOException e) {
            m711i("fileExists failed for: " + str);
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: f */
    public String mo592f(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return str;
        }
        C1069b m713d = m713d(str, true);
        if (m713d == null) {
            m710j("convertAbstractPathForDebug failed for: " + str);
            return str;
        }
        return m713d.f6803c + "/" + m706n(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: d */
    public boolean mo596d(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return true;
        }
        C1069b m713d = m713d(str, true);
        if (m713d == null) {
            return false;
        }
        try {
            return m713d.m693h(m706n(str));
        } catch (IOException e) {
            m711i("isDirectory failed for: " + str);
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: e */
    public boolean mo594e(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            m711i("createDirectory on root path: " + str);
            return false;
        }
        C1069b m713d = m713d(str, true);
        if (m713d == null) {
            m710j("createDirectory failed for: " + str);
            return false;
        }
        try {
            return m713d.m691j(m706n(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: b */
    public String[] mo600b(String str) {
        C1069b m713d = m713d(str, true);
        if (m713d == null) {
            return null;
        }
        try {
            return m713d.m694g(m706n(str));
        } catch (IOException e) {
            e.printStackTrace();
            C0750a.m2221b("Failed to open saf, " + e.getMessage());
            return null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: a */
    public long mo601a(String str, boolean z) {
        C1069b m713d = m713d(str, z);
        if (m713d == null) {
            m710j("saf==null: for '" + str + "'");
            return -1L;
        }
        return m713d.m697d(m706n(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: b */
    public C1098j mo599b(String str, boolean z) {
        C1069b m713d = m713d(str, z);
        if (m713d == null) {
            m710j("openAssetSteam: saf==null: for '" + str + "'");
            return null;
        }
        String m706n = m706n(str);
        try {
            C1098j m700b = m713d.m700b(m706n);
            if (m700b == null) {
                m709k("openAssetSteam: Failed to find: '" + m706n + "' in: '" + str + "'");
            }
            return m700b;
        } catch (IOException e) {
            e.printStackTrace();
            m710j("Error opening: '" + m706n + "' in: '" + str + "'");
            return null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: g */
    public long mo591g(String str) {
        C1069b m713d = m713d(str, true);
        if (m713d == null) {
            m712h("saf==null: for '" + str + "'");
            return 0L;
        }
        try {
            return m713d.m698c(m706n(str));
        } catch (IOException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: c */
    public OutputStream mo597c(String str, boolean z) {
        C1069b m713d = m713d(str, true);
        if (m713d == null) {
            return null;
        }
        String m706n = m706n(str);
        OutputStream m702a = m713d.m702a(m706n, z);
        if (m702a == null) {
            m710j("Failed to find: '" + m706n + "' in: '" + str + "'");
        }
        return m702a;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: a */
    public boolean mo602a(String str, String str2) {
        m712h("Rename: " + str + " to " + str2);
        C1069b m713d = m713d(str, true);
        if (m713d == null) {
            return false;
        }
        String m706n = m706n(str);
        String m706n2 = m706n(str2);
        m711i("Relative path: " + m706n + " to " + m706n2);
        return m713d.m703a(m706n, m706n2);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1076af
    /* renamed from: c */
    public boolean mo598c(String str) {
        m712h("deleteFile: " + str);
        C1069b m713d = m713d(str, true);
        if (m713d == null) {
            m710j("saf==null: for deleteFile: '" + str + "'");
            return false;
        }
        return m713d.m696e(m706n(str));
    }
}
