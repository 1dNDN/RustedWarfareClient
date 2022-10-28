package com.corrodinggames.rts.gameFramework.p040h;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
            m1677a(LoggerMaybe.m1079A().m944t());
        } catch (C0412bm e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static int m1676a(String str, int i) {
        String[] m2081c = C0758f.m2081c(str, '.');
        if (m2081c == null) {
            throw new C0412bm("Unexpected version format (Missing " + i + ")");
        }
        if (m2081c.length > 3) {
            throw new C0412bm("Unexpected version format (" + str + ")");
        }
        if (m2081c.length <= i) {
            return 0;
        }
        try {
            return Integer.valueOf(m2081c[i]).intValue();
        } catch (NumberFormatException e) {
            throw new C0412bm("Unexpected version format (Bad " + i + ")", e);
        }
    }

    /* renamed from: a */
    public static void m1677a(String str) {
        m1674a(str, LoggerMaybe.m1079A().m944t());
    }

    /* renamed from: b */
    public static String m1667b(String str) {
        return C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(C0758f.m2123a(str, "v", VariableScope.nullOrMissingString).trim(), "a", VariableScope.nullOrMissingString), "b", VariableScope.nullOrMissingString), "c", VariableScope.nullOrMissingString), "d", VariableScope.nullOrMissingString), "e", VariableScope.nullOrMissingString), "f", VariableScope.nullOrMissingString), "g", VariableScope.nullOrMissingString), "h1", VariableScope.nullOrMissingString), "h2", VariableScope.nullOrMissingString), "h3", VariableScope.nullOrMissingString), "h4", VariableScope.nullOrMissingString);
    }

    /* renamed from: a */
    public static void m1674a(String str, String str2) {
        String m1667b = m1667b(str2);
        String m1667b2 = m1667b(str);
        try {
            int i = 1000;
            int i2 = 1000;
            if (m1667b.contains("p")) {
                String[] m2054f = C0758f.m2054f(m1667b, "p");
                try {
                    i = Integer.valueOf(m2054f[1]).intValue();
                    m1667b = m2054f[0];
                } catch (NumberFormatException e) {
                    throw new C0412bm("Unexpected min version:" + m1667b2 + " (Bad build number)", e);
                }
            }
            if (m1667b2.contains("p")) {
                String[] m2054f2 = C0758f.m2054f(m1667b2, "p");
                try {
                    i2 = Integer.valueOf(m2054f2[1]).intValue();
                    m1667b2 = m2054f2[0];
                } catch (NumberFormatException e2) {
                    throw new C0412bm("Unexpected min version:" + m1667b2 + "(Bad build number)", e2);
                }
            }
            try {
                int m1676a = m1676a(m1667b, 0);
                int m1676a2 = m1676a(m1667b2, 0);
                int m1676a3 = m1676a(m1667b, 1);
                int m1676a4 = m1676a(m1667b2, 1);
                int m1676a5 = m1676a(m1667b, 2);
                int m1676a6 = m1676a(m1667b2, 2);
                if (m1676a2 < 1) {
                    throw new C0412bm("Min version cannot be less than v1.10");
                }
                if (m1676a2 > m1676a) {
                    throw new C0412bm("Requires version: " + m1667b2 + " or higher. (You have: " + m1667b + ")");
                }
                if (m1676a > m1676a2) {
                    return;
                }
                if (m1676a4 < 10 && m1676a2 == 1) {
                    throw new C0412bm("Min version cannot be less than v1.10");
                }
                if (m1676a4 > m1676a3) {
                    throw new C0412bm("Requires version: " + m1667b2 + " or higher. (You have: " + m1667b + ")");
                }
                if (m1676a3 > m1676a4) {
                    return;
                }
                if (m1676a6 > m1676a5) {
                    throw new C0412bm("Requires version: " + m1667b2 + " or higher. (You have: " + m1667b + ")");
                }
                if (m1676a5 <= m1676a6 && i2 > i) {
                    throw new C0412bm("Requires newer build: " + m1667b2 + " or higher. (You have: " + m1667b + ")");
                }
            } catch (C0412bm e3) {
                throw new C0412bm("Requires version: " + m1667b2 + " or higher. " + e3.getMessage(), e3);
            }
        } catch (RuntimeException e4) {
            throw new C0412bm("Requires version: " + m1667b2 + " or higher." + e4.getMessage(), e4);
        }
    }

    /* renamed from: a */
    public void m1680a() {
        m1653k();
        m1660f();
    }

    /* renamed from: a */
    public int m1671a(boolean z) {
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
    public int m1668b() {
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
    public int m1666c() {
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
    public void m1664d() {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            c0824b.f5423g = c0824b.f5422f;
            c0824b.f5424h = false;
        }
    }

    /* renamed from: e */
    public void m1662e() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
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
        m1079A.f6115bQ.modSettingsVersion = 1;
        m1079A.f6115bQ.modSettings = str;
    }

    /* renamed from: f */
    public void m1660f() {
        String[] split;
        boolean z;
        LoggerMaybe.LogDebug2("Loading mod selection");
        for (String str : LoggerMaybe.m1079A().f6115bQ.modSettings.split(",")) {
            String[] split2 = str.split("\\|");
            if (split2.length != 3) {
                LoggerMaybe.LogDebug2("loadSelection: wrong count (" + split2.length + "):" + str);
            } else {
                String str2 = split2[0];
                String str3 = split2[1];
                String str4 = split2[2];
                if (str4.equals("enabled")) {
                    z = false;
                } else if (str4.equals("disabled")) {
                    z = true;
                } else {
                    LoggerMaybe.LogDebug2("loadSelection: Unknown option:" + str);
                }
                C0824b m1665c = m1665c(str3);
                if (m1665c == null) {
                    LoggerMaybe.LogDebug2("loadSelection: Did not find mod in settings:" + str2);
                } else {
                    m1665c.f5422f = z;
                    m1665c.f5425i = true;
                }
            }
        }
    }

    /* renamed from: c */
    public C0824b m1665c(String str) {
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
    public C0824b m1679a(int i) {
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
    public void m1658g() {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            ((C0824b) it.next()).f5422f = true;
        }
    }

    /* renamed from: h */
    public int m1656h() {
        return this.f5415e.size();
    }

    /* renamed from: d */
    public C0824b m1663d(String str) {
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
    public C0824b m1661e(String str) {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.m1649a().equals(str)) {
                return c0824b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0824b m1673a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i) {
        C0824b m1665c = m1665c(str4);
        if (m1665c == null) {
            m1665c = new C0824b();
            m1665c.f5419c = str;
            m1665c.f5420d = str2;
            m1665c.f5421e = str4;
            m1665c.f5422f = !z;
        }
        if (m1665c.f5433q == null && str3 != null) {
            m1665c.f5433q = str3;
            m1665c.f5432p = m1665c.f5433q;
            m1665c.m1630n();
            if (m1665c.f5433q != null && m1665c.f5433q.toLowerCase(Locale.ROOT).contains("rwmod")) {
                m1665c.f5426j = true;
            }
        }
        m1665c.f5440x = i;
        m1665c.f5428l = true;
        m1665c.f5441y = z2;
        m1665c.f5442z = z3;
        if (!m1665c.f5442z) {
            m1665c.f5431o = "Storage: " + C0750a.m2228d(m1665c.f5433q);
        }
        m1665c.m1626r();
        synchronized (this.f5414d) {
            if (!this.f5415e.contains(m1665c)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f5415e);
                arrayList.add(m1665c);
                Collections.sort(arrayList);
                this.f5415e = arrayList;
            }
        }
        return m1665c;
    }

    /* renamed from: a */
    public void m1678a(C0824b c0824b) {
        synchronized (this.f5414d) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f5415e);
            arrayList.remove(c0824b);
            this.f5415e = arrayList;
        }
    }

    /* renamed from: a */
    public void m1672a(String str, boolean z, boolean z2) {
        LoggerMaybe.LogDebug2("loading mod custom units at:" + str);
        String[] m2223g = C0750a.m2223g(str);
        if (m2223g == null) {
            LoggerMaybe.m990b("getAllModList: ERROR");
            LoggerMaybe.m990b("getAllModList: Failed to load:" + str);
            return;
        }
        for (String str2 : m2223g) {
            String str3 = str + "/" + str2;
            if (C0750a.m2224f(str3) || str2.endsWith(".ini")) {
                String m2064e = C0758f.m2064e(str2);
                String str4 = str2;
                if (str4.contains("/")) {
                    str4 = str4.substring(str2.lastIndexOf("/") + 1);
                }
                m1673a(str4, str2, str3, m2064e, z, false, z2, 0);
            }
        }
    }

    /* renamed from: i */
    public ArrayList m1655i() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.m1631m()) {
                arrayList.addAll(c0824b.m1627q());
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public ArrayList m1654j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            if (c0824b.m1631m()) {
                arrayList.add(c0824b);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public ArrayList m1653k() {
        Iterator it = this.f5415e.iterator();
        while (it.hasNext()) {
            C0824b c0824b = (C0824b) it.next();
            c0824b.f5428l = false;
            if (c0824b.f5429m) {
                c0824b.f5428l = true;
            }
        }
        C1058a m739a = C1058a.m739a();
        if (m739a != null) {
            m739a.mo281l();
        } else {
            LoggerMaybe.LogDebug2("getAllModList: SteamEngine==null");
        }
        String m4037m = C0348af.m4037m();
        if (!C0750a.m2224f(m4037m)) {
            LoggerMaybe.LogDebug2("Modded Custom '" + m4037m + "' directory not found");
        } else {
            m1672a(m4037m, true, false);
        }
        String m4039k = C0348af.m4039k();
        if (!C0750a.m2224f(m4039k)) {
            LoggerMaybe.LogDebug2("Modded Custom '" + m4039k + "' directory not found");
        } else {
            m1672a(m4039k, false, true);
        }
        String m4038l = C0348af.m4038l();
        if (!C0750a.m2224f(m4038l)) {
            LoggerMaybe.LogDebug2("Modded Custom '" + m4038l + "' directory not found");
        } else {
            m1672a(m4038l, true, true);
        }
        Iterator it2 = this.f5415e.iterator();
        while (it2.hasNext()) {
            C0824b c0824b2 = (C0824b) it2.next();
            if (!c0824b2.f5428l) {
                LoggerMaybe.LogDebug2("Removing mod no longer found on system: " + c0824b2.m1649a());
                m1678a(c0824b2);
            }
        }
        LoggerMaybe.LogDebug2("========= Mods ===========");
        LoggerMaybe.LogDebug2("Number of mods:" + this.f5415e.size());
        Iterator it3 = this.f5415e.iterator();
        while (it3.hasNext()) {
            LoggerMaybe.LogDebug2("Mod: '" + ((C0824b) it3.next()).m1649a());
        }
        LoggerMaybe.LogDebug2("================================");
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6115bQ.lastModCount == -1 || m1079A.f6115bQ.modSettingsVersion < 1) {
            LoggerMaybe.LogDebug2("Disabling all new mods for first/new load");
            Iterator it4 = this.f5415e.iterator();
            while (it4.hasNext()) {
                ((C0824b) it4.next()).f5422f = true;
            }
            m1662e();
            m1079A.f6115bQ.save();
        } else if (this.f5415e.size() > m1079A.f6115bQ.lastModCount + 4) {
            LoggerMaybe.LogDebug2("Too many new mods found, not enabling new mods");
            LoggerMaybe.LogDebug2("Number of mods:" + this.f5415e.size() + " vs " + m1079A.f6115bQ.lastModCount);
            Iterator it5 = this.f5415e.iterator();
            while (it5.hasNext()) {
                C0824b c0824b3 = (C0824b) it5.next();
                if (!c0824b3.f5425i) {
                    c0824b3.f5422f = true;
                }
            }
            m1662e();
            m1079A.f6115bQ.save();
        }
        m1079A.f6115bQ.lastModCount = this.f5415e.size();
        return this.f5415e;
    }

    /* renamed from: l */
    public void m1652l() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        try {
            m1079A.f6236br = true;
            m1079A.m974e();
            m1670a(false, false);
            m1079A.m942w();
        } finally {
            m1079A.f6236br = false;
        }
    }

    /* renamed from: a */
    public void m1670a(boolean z, boolean z2) {
        LoggerMaybe.m1079A();
        C1075ae.m612b();
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
        m1653k();
        ArrayList arrayList = new ArrayList(C0453l.f2906d);
        if (!z2) {
            C0348af.m4042h();
        } else {
            C0348af.m4057b();
        }
        if (z) {
            int i = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0453l c0453l = (C0453l) it2.next();
                if (c0453l.f2937I != null && !c0453l.f2937I.f5422f && c0453l.f2937I.f5460R != null && C0453l.m3548a(c0453l) == null) {
                    LoggerMaybe.LogDebug2("Was missing: " + c0453l.f2940L);
                    C0453l.f2906d.add(c0453l);
                    i++;
                }
            }
            if (i > 0) {
                C0348af.m4045e();
            }
        }
        C0453l.m3563A();
        AbstractC0197n.m4728M();
        C0797f.m1870J();
    }

    /* renamed from: m */
    public void m1651m() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6279dG != null) {
            m1079A.f6279dG.mo109d();
        } else {
            LoggerMaybe.LogDebug2("No active callbacks");
        }
    }

    /* renamed from: a */
    public String[] m1669a(String[] strArr, String str) {
        String[] m2239a;
        LoggerMaybe.LogDebug2("addExtraMapsForPath: " + str);
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str2 : strArr) {
                arrayList.add(str2);
            }
        }
        if (LoggerMaybe.m1004as() && "/SD/rusted_warfare_maps".equals(str) && (m2239a = C0750a.m2239a("/SD/rustedWarfare/maps", true)) != null) {
            int length = m2239a.length;
            for (int i = 0; i < length; i++) {
                arrayList.add("NEW_PATH|maps2/" + m2239a[i]);
            }
        }
        Iterator it = m1659f(str).iterator();
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
    public ArrayList m1659f(String str) {
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
                LoggerMaybe.LogDebug2("Adding extra map:" + c0825c.f5465a);
                arrayList.add(c0825c);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public void m1650n() {
        this.f5416f.clear();
    }

    /* renamed from: a */
    public void m1675a(String str, C0824b c0824b) {
        C0825c c0825c = new C0825c(this);
        c0825c.f5465a = str;
        c0825c.f5467c = c0824b;
        if (c0824b.f5433q == null) {
            LoggerMaybe.m1038a("Skipping:" + str + " as mod sourceFolder is null");
            return;
        }
        String str2 = str;
        String str3 = c0824b.f5433q;
        if (str2.startsWith(str3)) {
            str2 = str2.substring(str3.length());
        } else {
            String m2216n = C0750a.m2216n(str2);
            if (m2216n.startsWith(str3)) {
                str2 = m2216n.substring(str3.length());
                LoggerMaybe.LogDebug2("Mod path:" + c0824b.f5433q + " in map path without tag:" + str2);
            } else {
                LoggerMaybe.m1038a("Mod path:" + c0824b.f5433q + " not in map path:" + str2);
            }
        }
        c0825c.f5466b = str2;
        c0824b.f5443A = true;
        c0824b.f5448F++;
        this.f5416f.add(c0825c);
    }

    /* renamed from: g */
    public C0824b m1657g(String str) {
        if (str.contains("MOD|")) {
            String[] split = str.split("/");
            if (split.length >= 2) {
                for (int length = split.length - 2; length >= 0; length--) {
                    String str2 = split[length];
                    if (str2.startsWith("MOD|")) {
                        String substring = str2.substring("MOD|".length());
                        C0824b m1665c = m1665c(substring);
                        if (m1665c == null) {
                            LoggerMaybe.LogDebug2("getLinkedModForFile: Failed to find mod with hash:" + substring);
                            return null;
                        }
                        return m1665c;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
