package com.corrodinggames.rts.gameFramework.utility;

import android.content.Context;
import android.content.res.AssetManager;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/i.class */
public final class C1096i {

    /* renamed from: c */
    private ArrayList f6878c;

    /* renamed from: a */
    public Context f6879a;

    /* renamed from: b */
    boolean f6880b = true;

    public C1096i(Context context) {
        this.f6879a = context;
        m554a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.utility.i$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/i$1.class */
    public class C10971 extends Thread {
        C10971() {
        }

        public void run() {
            C1096i.this.m551b();
        }
    }

    /* renamed from: a */
    public void m554a() {
        new C10971().start();
    }

    /* renamed from: b */
    public void m551b() {
        synchronized (this) {
            if (this.f6878c != null) {
                return;
            }
            AssetManager mo5603d = this.f6879a.mo5603d();
            ArrayList arrayList = new ArrayList();
            try {
                LoggerMaybe.LogDebug2("------- createIndex -------");
                arrayList.addAll(m553a(mo5603d, VariableScope.nullOrMissingString, 1));
                this.f6878c = arrayList;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public ArrayList m553a(AssetManager assetManager, String str, int i) {
        ArrayList arrayList = new ArrayList();
        String[] m5586c = assetManager.m5586c(str);
        if (str.length() > 0) {
            str = str + "/";
        }
        if (i > 140) {
            throw new RuntimeException("dirLevel>140 for: " + str);
        }
        LoggerMaybe.LogDebug2("c:" + str);
        for (String str2 : m5586c) {
            String str3 = str + str2;
            boolean z = false;
            if (!str2.contains(".")) {
                z = true;
            }
            if (!str2.equals(".") && !str2.equals("..") && !str2.equals(VariableScope.nullOrMissingString)) {
                arrayList.add(str3);
                if (z) {
                    arrayList.addAll(m553a(assetManager, str3, i + 1));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public ArrayList m549c() {
        if (this.f6878c != null) {
            if (this.f6880b) {
                LoggerMaybe.LogDebug2("assetIndex: getFile was not blocked on load");
                this.f6880b = false;
            }
            return this.f6878c;
        }
        LoggerMaybe.m1059U();
        m551b();
        if (this.f6880b) {
            LoggerMaybe.LogDebug2("assetIndex: getFile is BLOCKED on load");
            this.f6880b = false;
        }
        return this.f6878c;
    }

    /* renamed from: a */
    public boolean m552a(String str) {
        if (str.endsWith(File.separator)) {
            str = str.substring(0, str.length() - 1);
        }
        String replace = str.replace("//", "/");
        Iterator it = m549c().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(replace)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public String[] m550b(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = str;
        if (str2.endsWith(File.separator)) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        int i = 0;
        Iterator it = m549c().iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str3.startsWith(str2)) {
                String substring = str3.substring(str2.length());
                if (substring.length() != 0 && substring.charAt(0) == File.separatorChar && substring.indexOf(File.separator, 1) == -1) {
                    i++;
                    arrayList.add(str3.substring((str2 + "/").length()));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
