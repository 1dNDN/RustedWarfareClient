package com.corrodinggames.rts.gameFramework.p040h;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.h.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/a.class */
public class C0823a {

    /* renamed from: a */
    public static String f5411a;

    /* renamed from: b */
    public static String f5412b;

    /* renamed from: c */
    public C0824b f5413c = new C0824b();

    /* renamed from: d */
    Object f5414d = new Object();

    /* renamed from: e */
    ArrayList f5415e = new ArrayList();

    /* renamed from: f */
    ArrayList f5416f = new ArrayList();

    public C0823a() {
        try {
            m1719a(Core.m1087A().m952t());
        } catch (C0412bm e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static int m1718a(String str, int i) {
        String[] m2130c = C0758f.m2130c(str, '.');
        if (m2130c == null) {
            throw new C0412bm("Unexpected version format (Missing " + i + ")");
        }
        if (m2130c.length > 3) {
            throw new C0412bm("Unexpected version format (" + str + ")");
        }
        if (m2130c.length <= i) {
            return 0;
        }
        try {
            return Integer.valueOf(m2130c[i]).intValue();
        } catch (NumberFormatException e) {
            throw new C0412bm("Unexpected version format (Bad " + i + ")", e);
        }
    }

    /* renamed from: a */
    public static void m1719a(String str) {
        m1716a(str, Core.m1087A().m952t());
    }

    /* renamed from: b */
    public static String m1709b(String str) {
        return C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(C0758f.m2172a(str, "v", VariableScope.nullOrMissingString).trim(), "a", VariableScope.nullOrMissingString), "b", VariableScope.nullOrMissingString), "c", VariableScope.nullOrMissingString), "d", VariableScope.nullOrMissingString), "e", VariableScope.nullOrMissingString), "f", VariableScope.nullOrMissingString), "g", VariableScope.nullOrMissingString), "h1", VariableScope.nullOrMissingString), "h2", VariableScope.nullOrMissingString), "h3", VariableScope.nullOrMissingString), "h4", VariableScope.nullOrMissingString);
    }

    /* renamed from: a */
    public static void m1716a(String str, String str2) {
        String m1709b = m1709b(str2);
        String m1709b2 = m1709b(str);
        try {
            int i = 1000;
            int i2 = 1000;
            if (m1709b.contains("p")) {
                String[] m2103f = C0758f.m2103f(m1709b, "p");
                try {
                    i = Integer.valueOf(m2103f[1]).intValue();
                    m1709b = m2103f[0];
                } catch (NumberFormatException e) {
                    throw new C0412bm("Unexpected min version:" + m1709b2 + " (Bad build number)", e);
                }
            }
            if (m1709b2.contains("p")) {
                String[] m2103f2 = C0758f.m2103f(m1709b2, "p");
                try {
                    i2 = Integer.valueOf(m2103f2[1]).intValue();
                    m1709b2 = m2103f2[0];
                } catch (NumberFormatException e2) {
                    throw new C0412bm("Unexpected min version:" + m1709b2 + "(Bad build number)", e2);
                }
            }
            try {
                int m1718a = m1718a(m1709b, 0);
                int m1718a2 = m1718a(m1709b2, 0);
                int m1718a3 = m1718a(m1709b, 1);
                int m1718a4 = m1718a(m1709b2, 1);
                int m1718a5 = m1718a(m1709b, 2);
                int m1718a6 = m1718a(m1709b2, 2);
                if (m1718a2 < 1) {
                    throw new C0412bm("Min version cannot be less than v1.10");
                }
                if (m1718a2 > m1718a) {
                    throw new C0412bm("Requires version: " + m1709b2 + " or higher. (You have: " + m1709b + ")");
                }
                if (m1718a > m1718a2) {
                    return;
                }
                if (m1718a4 < 10 && m1718a2 == 1) {
                    throw new C0412bm("Min version cannot be less than v1.10");
                }
                if (m1718a4 > m1718a3) {
                    throw new C0412bm("Requires version: " + m1709b2 + " or higher. (You have: " + m1709b + ")");
                }
                if (m1718a3 > m1718a4) {
                    return;
                }
                if (m1718a6 > m1718a5) {
                    throw new C0412bm("Requires version: " + m1709b2 + " or higher. (You have: " + m1709b + ")");
                }
                if (m1718a5 <= m1718a6 && i2 > i) {
                    throw new C0412bm("Requires newer build: " + m1709b2 + " or higher. (You have: " + m1709b + ")");
                }
            } catch (C0412bm e3) {
                throw new C0412bm("Requires version: " + m1709b2 + " or higher. " + e3.getMessage(), e3);
            }
        } catch (RuntimeException e4) {
            throw new C0412bm("Requires version: " + m1709b2 + " or higher." + e4.getMessage(), e4);
        }
    }

    /* renamed from: a */
    public void m1722a() {
        m1695k();
        m1702f();
    }

    /* renamed from: a */
    public int m1713a(boolean z) {
        int i = 0;
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (!c0824b.f5422f && !c0824b.f5446D && (!z || c0824b.f5460R == null)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public int m1710b() {
        int i = 0;
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (!c0824b.f5422f && c0824b.f5460R != null) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public int m1708c() {
        int i = 0;
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            if (!((C0824b) it.next()).f5442z) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public void m1706d() {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            c0824b.f5423g = c0824b.f5422f;
            c0824b.f5424h = false;
        }
    }

    /* renamed from: e */
    public void m1704e() {
        Core m1087A = Core.m1087A();
        String str = VariableScope.nullOrMissingString;
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            String replace = c0824b.f5419c.replace(",", " ").replace("|", " ");
            if (replace.length() > 15) {
                replace = replace.substring(12) + "...";
            }
            if (str.length() != 0) {
                str = str + ",";
            }
            str = str + replace + "|" + c0824b.f5421e + "|" + (c0824b.f5422f ? "disabled" : "enabled");
        }
        m1087A.settingEngine.modSettingsVersion = 1;
        m1087A.settingEngine.modSettings = str;
    }

    /* renamed from: f */
    public void m1702f() {
        String[] split;
        boolean z;
        Core.LogDebug2("Loading mod selection");
        for (String str : Core.m1087A().settingEngine.modSettings.split(",")) {
            String[] split2 = str.split("\\|");
            if (split2.length != 3) {
                Core.LogDebug2("loadSelection: wrong count (" + split2.length + "):" + str);
            } else {
                String str2 = split2[0];
                String str3 = split2[1];
                String str4 = split2[2];
                if (str4.equals("enabled")) {
                    z = false;
                } else if (str4.equals("disabled")) {
                    z = true;
                } else {
                    Core.LogDebug2("loadSelection: Unknown option:" + str);
                }
                C0824b m1707c = m1707c(str3);
                if (m1707c == null) {
                    Core.LogDebug2("loadSelection: Did not find mod in settings:" + str2);
                } else {
                    m1707c.f5422f = z;
                    m1707c.f5425i = true;
                }
            }
        }
    }

    /* renamed from: c */
    public C0824b m1707c(String str) {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.f5421e.equals(str)) {
                return c0824b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0824b m1721a(int i) {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.f5454L == i) {
                return c0824b;
            }
        }
        return null;
    }

    /* renamed from: g */
    public void m1700g() {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            ((C0824b) it.next()).f5422f = true;
        }
    }

    /* renamed from: h */
    public int m1698h() {
        return this.f5415e.size();
    }

    /* renamed from: d */
    public C0824b m1705d(String str) {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.f5420d.equals(str)) {
                return c0824b;
            }
        }
        return null;
    }

    /* renamed from: e */
    public C0824b m1703e(String str) {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.m1691a().equals(str)) {
                return c0824b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0824b m1715a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i) {
        C0824b m1707c = m1707c(str4);
        if (m1707c == null) {
            m1707c = new C0824b();
            m1707c.f5419c = str;
            m1707c.f5420d = str2;
            m1707c.f5421e = str4;
            m1707c.f5422f = !z;
        }
        if (m1707c.f5433q == null && str3 != null) {
            m1707c.f5433q = str3;
            m1707c.f5432p = m1707c.f5433q;
            m1707c.m1672n();
            if (m1707c.f5433q != null && m1707c.f5433q.toLowerCase(Locale.ROOT).contains("rwmod")) {
                m1707c.f5426j = true;
            }
        }
        m1707c.f5440x = i;
        m1707c.f5428l = true;
        m1707c.f5441y = z2;
        m1707c.f5442z = z3;
        if (!m1707c.f5442z) {
            m1707c.f5431o = "Storage: " + C0750a.m2277d(m1707c.f5433q);
        }
        m1707c.m1668r();
        synchronized (this.f5414d) {
            if (!this.f5415e.contains(m1707c)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f5415e);
                arrayList.add(m1707c);
                Collections.sort(arrayList);
                this.f5415e = arrayList;
            }
        }
        return m1707c;
    }

    /* renamed from: a */
    public void m1720a(C0824b c0824b) {
        synchronized (this.f5414d) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f5415e);
            arrayList.remove(c0824b);
            this.f5415e = arrayList;
        }
    }

    /* renamed from: a */
    public void m1714a(String str, boolean z, boolean z2) {
        Core.LogDebug2("loading mod custom units at:" + str);
        String[] m2272g = C0750a.m2272g(str);
        if (m2272g == null) {
            Core.m998b("getAllModList: ERROR");
            Core.m998b("getAllModList: Failed to load:" + str);
            return;
        }
        for (String str2 : m2272g) {
            String str3 = str + "/" + str2;
            if (C0750a.m2273f(str3) || str2.endsWith(".ini")) {
                String m2113e = C0758f.m2113e(str2);
                String str4 = str2;
                if (str4.contains("/")) {
                    str4 = str4.substring(str2.lastIndexOf("/") + 1);
                }
                m1715a(str4, str2, str3, m2113e, z, false, z2, 0);
            }
        }
    }

    /* renamed from: i */
    public ArrayList m1697i() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.m1673m()) {
                arrayList.addAll(c0824b.m1669q());
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public ArrayList m1696j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.m1673m()) {
                arrayList.add(c0824b);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public ArrayList m1695k() {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            c0824b.f5428l = false;
            if (c0824b.f5429m) {
                c0824b.f5428l = true;
            }
        }
        C1058a m747a = C1058a.m747a();
        if (m747a != null) {
            m747a.mo277l();
        } else {
            Core.LogDebug2("getAllModList: SteamEngine==null");
        }
        String m4267m = C0348af.m4267m();
        if (!C0750a.m2273f(m4267m)) {
            Core.LogDebug2("Modded Custom '" + m4267m + "' directory not found");
        } else {
            m1714a(m4267m, true, false);
        }
        String m4269k = C0348af.m4269k();
        if (!C0750a.m2273f(m4269k)) {
            Core.LogDebug2("Modded Custom '" + m4269k + "' directory not found");
        } else {
            m1714a(m4269k, false, true);
        }
        String m4268l = C0348af.m4268l();
        if (!C0750a.m2273f(m4268l)) {
            Core.LogDebug2("Modded Custom '" + m4268l + "' directory not found");
        } else {
            m1714a(m4268l, true, true);
        }
        Iterator it2 = this.f5415e.iterator();
        while (it2.hasNext()) {
            C0824b c0824b2 = (C0824b) it2.next();
            if (!c0824b2.f5428l) {
                Core.LogDebug2("Removing mod no longer found on system: " + c0824b2.m1691a());
                m1720a(c0824b2);
            }
        }
        Core.LogDebug2("========= Mods ===========");
        Core.LogDebug2("Number of mods:" + this.f5415e.size());
        Iterator it3 = this.f5415e.iterator();
        while (it3.hasNext()) {
            Core.LogDebug2("Mod: '" + ((C0824b) it3.next()).m1691a());
        }
        Core.LogDebug2("================================");
        Core m1087A = Core.m1087A();
        if (m1087A.settingEngine.lastModCount == -1 || m1087A.settingEngine.modSettingsVersion < 1) {
            Core.LogDebug2("Disabling all new mods for first/new load");
            Iterator it4 = this.f5415e.iterator();
            while (it4.hasNext()) {
                ((C0824b) it4.next()).f5422f = true;
            }
            m1704e();
            m1087A.settingEngine.save();
        } else if (this.f5415e.size() > m1087A.settingEngine.lastModCount + 4) {
            Core.LogDebug2("Too many new mods found, not enabling new mods");
            Core.LogDebug2("Number of mods:" + this.f5415e.size() + " vs " + m1087A.settingEngine.lastModCount);
            Iterator it5 = this.f5415e.iterator();
            while (it5.hasNext()) {
                C0824b c0824b3 = (C0824b) it5.next();
                if (!c0824b3.f5425i) {
                    c0824b3.f5422f = true;
                }
            }
            m1704e();
            m1087A.settingEngine.save();
        }
        m1087A.settingEngine.lastModCount = this.f5415e.size();
        return this.f5415e;
    }

    /* renamed from: l */
    public void m1694l() {
        Core m1087A = Core.m1087A();
        try {
            m1087A.f6236br = true;
            m1087A.m982e();
            m1712a(false, false);
            m1087A.m950w();
        } finally {
            m1087A.f6236br = false;
        }
    }

    /* renamed from: a */
    public void m1712a(boolean z, boolean z2) {
        Core.m1087A();
        C1075ae.m619b();
        if (!z2) {
            Iterator it = this.f5415e.iterator();
            while (it.hasNext()) {
                C0824b c0824b = (C0824b) it.next();
                c0824b.f5460R = null;
                c0824b.f5464V.clear();
                c0824b.f5461S = null;
                c0824b.f5463U.clear();
                c0824b.f5445C = false;
                c0824b.f5446D = false;
                c0824b.f5447E = 0;
                c0824b.f5448F = 0;
                c0824b.f5449G = 0L;
                c0824b.f5450H = 0L;
                c0824b.f5451I = 0;
                c0824b.f5452J = 0;
            }
        }
        m1695k();
        ArrayList arrayList = new ArrayList(C0453l.f3188d);
        if (!z2) {
            C0348af.m4272h();
        } else {
            C0348af.m4287b();
        }
        if (z) {
            int i = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0453l c0453l = (C0453l) it2.next();
                if (c0453l.f2919I != null && !c0453l.f2919I.f5422f && c0453l.f2919I.f5460R != null && C0453l.m3724a(c0453l) == null) {
                    Core.LogDebug2("Was missing: " + c0453l.f2922L);
                    C0453l.f3188d.add(c0453l);
                    i++;
                }
            }
            if (i > 0) {
                C0348af.m4275e();
            }
        }
        C0453l.m3739A();
        AbstractC0197n.m5107M();
        C0797f.m1912J();
    }

    /* renamed from: m */
    public void m1693m() {
        Core m1087A = Core.m1087A();
        if (m1087A.f6279dG != null) {
            m1087A.f6279dG.mo103d();
        } else {
            Core.LogDebug2("No active callbacks");
        }
    }

    /* renamed from: a */
    public String[] m1711a(String[] strArr, String str) {
        String[] m2288a;
        Core.LogDebug2("addExtraMapsForPath: " + str);
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str2 : strArr) {
                arrayList.add(str2);
            }
        }
        if (Core.m1012as() && "/SD/rusted_warfare_maps".equals(str) && (m2288a = C0750a.m2288a("/SD/rustedWarfare/maps", true)) != null) {
            int length = m2288a.length;
            for (int i = 0; i < length; i++) {
                arrayList.add("NEW_PATH|maps2/" + m2288a[i]);
            }
        }
        Iterator it = m1701f(str).iterator();
        while (it.hasNext()) {
            C0825c c0825c = (C0825c) it.next();
            arrayList.add("MOD|" + c0825c.f5467c.f5421e + "/" + c0825c.f5466b);
        }
        if (strArr == null && arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: f */
    public ArrayList m1701f(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5416f.iterator();
        while (it.hasNext()) {
            C0825c c0825c = (C0825c) it.next();
            boolean z = false;
            if (str.startsWith("mod/") && str.startsWith("mod/" + c0825c.f5467c.f5421e)) {
                z = true;
            }
            if (!c0825c.f5467c.f5422f && str.startsWith("/SD/rusted_warfare_maps")) {
                z = true;
            }
            if (z) {
                Core.LogDebug2("Adding extra map:" + c0825c.f5465a);
                arrayList.add(c0825c);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public void m1692n() {
        this.f5416f.clear();
    }

    /* renamed from: a */
    public void m1717a(String str, C0824b c0824b) {
        C0825c c0825c = new C0825c(this);
        c0825c.f5465a = str;
        c0825c.f5467c = c0824b;
        if (c0824b.f5433q == null) {
            Core.m1046a("Skipping:" + str + " as mod sourceFolder is null");
            return;
        }
        String str2 = str;
        String str3 = c0824b.f5433q;
        if (str2.startsWith(str3)) {
            str2 = str2.substring(str3.length());
        } else {
            String m2265n = C0750a.m2265n(str2);
            if (m2265n.startsWith(str3)) {
                str2 = m2265n.substring(str3.length());
                Core.LogDebug2("Mod path:" + c0824b.f5433q + " in map path without tag:" + str2);
            } else {
                Core.m1046a("Mod path:" + c0824b.f5433q + " not in map path:" + str2);
            }
        }
        c0825c.f5466b = str2;
        c0824b.f5443A = true;
        c0824b.f5448F++;
        this.f5416f.add(c0825c);
    }

    /* renamed from: g */
    public C0824b m1699g(String str) {
        if (str.contains("MOD|")) {
            String[] split = str.split("/");
            if (split.length >= 2) {
                for (int length = split.length - 2; length >= 0; length--) {
                    String str2 = split[length];
                    if (str2.startsWith("MOD|")) {
                        String substring = str2.substring("MOD|".length());
                        C0824b m1707c = m1707c(substring);
                        if (m1707c == null) {
                            Core.LogDebug2("getLinkedModForFile: Failed to find mod with hash:" + substring);
                            return null;
                        }
                        return m1707c;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
