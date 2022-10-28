package com.corrodinggames.rts.gameFramework.p040h;

import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p036e.C0756g;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/b.class */
public class C0824b implements Comparable {

    /* renamed from: a */
    public int f5417a;

    /* renamed from: c */
    public String f5419c;

    /* renamed from: d */
    public String f5420d;

    /* renamed from: e */
    public String f5421e;

    /* renamed from: f */
    public boolean f5422f;

    /* renamed from: g */
    public boolean f5423g;

    /* renamed from: h */
    public boolean f5424h;

    /* renamed from: i */
    public boolean f5425i;

    /* renamed from: j */
    public boolean f5426j;

    /* renamed from: k */
    public long f5427k;

    /* renamed from: l */
    boolean f5428l;

    /* renamed from: m */
    public boolean f5429m;

    /* renamed from: n */
    public String f5430n;

    /* renamed from: o */
    public String f5431o;

    /* renamed from: p */
    public String f5432p;

    /* renamed from: q */
    public String f5433q;

    /* renamed from: r */
    public boolean f5434r;

    /* renamed from: s */
    public String f5435s;

    /* renamed from: t */
    public String f5436t;

    /* renamed from: u */
    public String f5437u;

    /* renamed from: v */
    public String f5438v;

    /* renamed from: w */
    public int f5439w;

    /* renamed from: x */
    public int f5440x;

    /* renamed from: y */
    public boolean f5441y;

    /* renamed from: z */
    public boolean f5442z;

    /* renamed from: A */
    public boolean f5443A = false;

    /* renamed from: B */
    public boolean f5444B = true;

    /* renamed from: C */
    public boolean f5445C;

    /* renamed from: D */
    public boolean f5446D;

    /* renamed from: E */
    public int f5447E;

    /* renamed from: F */
    public int f5448F;

    /* renamed from: G */
    public long f5449G;

    /* renamed from: H */
    public long f5450H;

    /* renamed from: I */
    public int f5451I;

    /* renamed from: J */
    public int f5452J;

    /* renamed from: L */
    public int f5454L;

    /* renamed from: M */
    public String f5455M;

    /* renamed from: N */
    public boolean f5456N;

    /* renamed from: O */
    public boolean f5457O;

    /* renamed from: P */
    public int f5458P;

    /* renamed from: Q */
    ArrayList f5459Q;

    /* renamed from: R */
    public String f5460R;

    /* renamed from: S */
    public String f5461S;

    /* renamed from: T */
    public String f5462T;

    /* renamed from: U */
    public ArrayList f5463U;

    /* renamed from: V */
    public ArrayList f5464V;

    /* renamed from: b */
    public static int f5418b = 1;

    /* renamed from: K */
    public static int f5453K = 1;

    public C0824b() {
        int i = f5453K;
        f5453K = i + 1;
        this.f5454L = i;
        this.f5459Q = new ArrayList();
        this.f5463U = new ArrayList();
        this.f5464V = new ArrayList();
        this.f5417a = f5418b;
        f5418b++;
    }

    /* renamed from: a */
    public String m1649a() {
        if (this.f5435s != null) {
            return this.f5435s;
        }
        if (this.f5436t != null) {
            return this.f5436t;
        }
        return this.f5419c;
    }

    /* renamed from: b */
    public String m1644b() {
        return C0758f.m2128a(m1649a(), 25);
    }

    /* renamed from: c */
    public String m1642c() {
        return C0758f.m2128a(m1649a(), 40);
    }

    /* renamed from: d */
    public int m1640d() {
        return this.f5454L;
    }

    /* renamed from: e */
    public String m1639e() {
        return m1638f();
    }

    /* renamed from: f */
    public String m1638f() {
        String str = VariableScope.nullOrMissingString;
        if (this.f5437u != null) {
            str = str + this.f5437u;
        }
        String str2 = "RAM:" + m1625s();
        if (this.f5430n != null) {
            str2 = str2 + " Storage: slow external unpacked";
        }
        if (LoggerMaybe.m1004as() && this.f5433q != null && C0750a.m2242a(this.f5433q) && !this.f5426j) {
            str2 = str2 + " Warning: slow external storage";
        }
        return str + "\n (" + str2 + ")";
    }

    /* renamed from: g */
    public String m1637g() {
        if (this.f5441y) {
            return this.f5433q;
        }
        return C0750a.m2226e(this.f5433q);
    }

    /* renamed from: h */
    public String m1636h() {
        if (this.f5441y) {
            return this.f5432p;
        }
        return C0750a.m2226e(this.f5432p);
    }

    /* renamed from: i */
    public String m1635i() {
        return new File(m1637g()).getAbsolutePath();
    }

    /* renamed from: j */
    public String m1634j() {
        return this.f5433q;
    }

    /* renamed from: k */
    public String m1633k() {
        return new File(m1637g()).getCanonicalPath();
    }

    /* renamed from: l */
    public String m1632l() {
        String str = this.f5461S;
        if (this.f5462T != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + this.f5462T;
        }
        if (str == null && this.f5463U.size() > 0) {
            str = VariableScope.nullOrMissingString;
            int i = 0;
            int i2 = 0;
            Iterator it = this.f5463U.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (i2 <= 2) {
                    if (str == null) {
                        str = str2;
                    } else {
                        str = str + "\n" + str2;
                    }
                } else {
                    i++;
                }
                i2++;
            }
            if (i > 0) {
                str = str + "\n" + i + " more warnings...";
            }
        }
        if ((!this.f5445C || str != null) && !this.f5446D && str == null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + "Not yet loaded, reload needed";
        }
        return str;
    }

    /* renamed from: m */
    public boolean m1631m() {
        return !this.f5422f && this.f5460R == null;
    }

    /* renamed from: a */
    public void m1646a(String str) {
        LoggerMaybe.m990b("Adding error for mod: " + m1644b() + ": " + str);
        if (this.f5460R == null) {
            if (!this.f5422f) {
                LoggerMaybe.m1079A().m961i(str);
            }
            this.f5460R = str;
        }
        this.f5464V.add(str);
    }

    /* renamed from: b */
    public void m1643b(String str) {
        if (this.f5463U.contains(str)) {
            return;
        }
        this.f5463U.add(str);
    }

    /* renamed from: a */
    public String m1645a(String str, int i) {
        String[] m2223g;
        String m1645a;
        if (i > 4 || (m2223g = C0750a.m2223g(str)) == null) {
            return null;
        }
        for (String str2 : m2223g) {
            if (str2.equalsIgnoreCase("mod-info.txt")) {
                return str + "/mod-info.txt";
            }
        }
        if (m2223g.length > 5) {
            return null;
        }
        int length = m2223g.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str3 = str + "/" + m2223g[i2];
            if (C0750a.m2224f(str3) && (m1645a = m1645a(str3, i + 1)) != null) {
                return m1645a;
            }
        }
        return null;
    }

    /* renamed from: n */
    public void m1630n() {
        if (LoggerMaybe.m1079A().m979d()) {
            LoggerMaybe.LogDebug2("SAFE MODE: skipping setSourceFolder");
        } else if (!C0756g.m2169f("mods-info", this.f5433q + "/mod-info.txt")) {
            String str = this.f5433q;
            if (str == null) {
                LoggerMaybe.LogDebug2("setSourceFolder: sourceFolder==null");
                return;
            }
            String[] m2171d = C0756g.m2171d("mods-dir-search", str);
            if (m2171d != null && m2171d.length == 1) {
                String str2 = str + "/" + m2171d[0];
                String str3 = str2 + "/mod-info.txt";
                if (C0750a.m2224f(str2) && C0750a.m2222h(str3)) {
                    LoggerMaybe.LogDebug2("Changing mod sourceFolder to:" + str2);
                    this.f5433q = str2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.io.InputStream] */
    /* renamed from: o */
    public C1072ab m1629o() {
        C1098j m2220j;
        String m1645a;
        if (this.f5433q == null) {
            LoggerMaybe.LogDebug2("No source yet for mod: " + this.f5419c);
            return null;
        }
        String str = this.f5433q + "/mod-info.txt";
        try {
            if (this.f5426j) {
                m2220j = C0756g.m2170e("mods-info", str);
            } else {
                m2220j = C0750a.m2220j(str);
            }
            if (m2220j == null && (m1645a = m1645a(this.f5433q, 1)) != null) {
                C1098j m2220j2 = C0750a.m2220j(str);
                if (m2220j2 != null) {
                    LoggerMaybe.m1038a("mod-info.txt cache seems to be invalid for: " + str);
                    C0756g.m2172c("mods-info", str);
                    m2220j = m2220j2;
                } else {
                    m1646a("No mod info at " + C0750a.m2228d(str) + " but found one nested at: " + C0750a.m2228d(m1645a) + " (Hint: This mod might have been extracted with an extra folder)");
                }
            }
            if (m2220j == null) {
                LoggerMaybe.LogDebug2("No mod info for: " + this.f5419c + " at " + str);
                return null;
            }
            try {
                return new C1072ab(m2220j, str);
            } catch (IOException e) {
                LoggerMaybe.LogDebug2("Error loading mod info for: " + this.f5419c + " at " + str);
                e.printStackTrace();
                m1643b("Error loading mod-info.txt: " + e.getMessage());
                return null;
            }
        } catch (Exception e2) {
            LoggerMaybe.LogDebug2("Error loading mod info for: " + this.f5419c + " at " + str);
            e2.printStackTrace();
            m1643b("Error loading mod-info.txt: " + e2.getMessage());
            return null;
        }
    }

    /* renamed from: p */
    public String m1628p() {
        String m1641c = m1641c("thumbnail");
        if (m1641c != null) {
            return m1635i() + "/" + m1641c;
        }
        return null;
    }

    /* renamed from: q */
    public ArrayList m1627q() {
        return this.f5459Q;
    }

    /* renamed from: c */
    public String m1641c(String str) {
        C1072ab m1629o = m1629o();
        if (m1629o == null) {
            return null;
        }
        return m1629o.m649b("mod", str, (String) null);
    }

    /* renamed from: r */
    public void m1626r() {
        if (LoggerMaybe.m1079A().m979d()) {
            LoggerMaybe.LogDebug2("SAFE MODE: refreshData: Skipping mod read");
            this.f5437u = "<< SAFE MODE ACTIVE: MOD DATA SKIPPED. RESTART IN NORMAL MODE. >>";
            return;
        }
        C1072ab m1629o = m1629o();
        if (m1629o == null) {
            return;
        }
        this.f5435s = m1629o.m649b("mod", "title", (String) null);
        this.f5437u = m1629o.m649b("mod", "description", (String) null);
        if (this.f5437u != null && this.f5437u.contains("\\n")) {
            this.f5437u = this.f5437u.replace("\\n", "\n");
        }
        this.f5438v = m1629o.m649b("mod", "minVersion", (String) null);
        if (this.f5438v != null && !this.f5438v.trim().equals(VariableScope.nullOrMissingString)) {
            try {
                C0823a.m1677a(this.f5438v);
            } catch (C0412bm e) {
                m1646a(e.getMessage());
            }
        }
        this.f5455M = m1629o.m649b("music", "sourceFolder", (String) null);
        this.f5456N = m1629o.m668a("music", "whenUsingUnitsFromThisMod_playExclusively", (Boolean) false).booleanValue();
        this.f5457O = m1629o.m668a("music", "addToNormalPlaylist", (Boolean) false).booleanValue();
        if (this.f5455M != null && m1631m()) {
            LoggerMaybe.LogDebug2("Loading music for: " + m1649a());
            String m2094b = C0758f.m2094b(this.f5433q, this.f5455M);
            String[] m2171d = C0756g.m2171d("mods-dir-music", m2094b);
            if (m2171d == null) {
                m1643b("Could not read target music folder: " + C0750a.m2226e(m2094b));
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str : m2171d) {
                    if (str.toLowerCase().endsWith(".ogg")) {
                        String m2094b2 = C0758f.m2094b(m2094b, str);
                        if (!this.f5459Q.contains(m2094b2)) {
                            LoggerMaybe.LogDebug2("Found music track: " + str);
                        }
                        arrayList.add(m2094b2);
                    }
                }
                this.f5459Q = arrayList;
                if (this.f5459Q.size() == 0) {
                    m1643b("Could not find any .ogg files in music folder: " + C0750a.m2226e(m2094b));
                }
            }
        }
        this.f5434r = true;
        String m1621w = m1621w();
        File file = new File(m1621w);
        if (file.exists() && !file.isDirectory()) {
            C1072ab c1072ab = null;
            try {
                c1072ab = new C1072ab(m1621w);
            } catch (IOException e2) {
                e2.printStackTrace();
                m1643b("IO error reading: " + C0750a.m2226e(m1621w));
            }
            if (c1072ab != null) {
                this.f5427k = c1072ab.m673a("steam", "id", 0L);
            }
        }
    }

    /* renamed from: w */
    private String m1621w() {
        return m1637g() + "/steam.dat";
    }

    /* renamed from: a */
    public boolean m1648a(long j) {
        this.f5427k = j;
        String m1621w = m1621w();
        try {
            PrintWriter printWriter = new PrintWriter(m1621w);
            printWriter.println("[steam]");
            printWriter.println("id: " + j);
            printWriter.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            LoggerMaybe.m1079A().m961i("IO error: Failed to save workshop id for mod at: " + m1621w);
            return false;
        }
    }

    /* renamed from: s */
    public String m1625s() {
        return VariableScope.nullOrMissingString + String.format("%.2f", Float.valueOf((float) (((this.f5449G + this.f5450H) / 1000.0d) / 1000.0d))) + " mb" + (this.f5445C ? " - disabled" : VariableScope.nullOrMissingString);
    }

    /* renamed from: t */
    public void m1624t() {
        LoggerMaybe.LogDebug2("Mod: '" + m1649a() + "' - Memory use:" + m1625s() + " " + (m1631m() ? VariableScope.nullOrMissingString : " (disabled)"));
    }

    /* renamed from: u */
    public boolean m1623u() {
        LoggerMaybe.LogDebug2("Trying to delete mod: '" + m1649a() + "'");
        String m1636h = m1636h();
        LoggerMaybe.LogDebug2("sourceFolder: '" + m1636h + "'");
        if (!m1622v()) {
            LoggerMaybe.LogDebug2("Mod: '" + m1649a() + "' - Cannot be deleted");
            return false;
        }
        File file = new File(m1636h);
        if (!C0750a.m2222h(file.getAbsolutePath())) {
            LoggerMaybe.LogDebug2("Mod: '" + m1649a() + "' - cannot delete: Not a file");
            return false;
        }
        boolean m2236b = C0750a.m2236b(file);
        LoggerMaybe.LogDebug2("Delete result: " + m2236b);
        return m2236b;
    }

    /* renamed from: v */
    public boolean m1622v() {
        if (this.f5442z) {
            return false;
        }
        if (LoggerMaybe.f6210aZ && this.f5426j) {
            return true;
        }
        if (LoggerMaybe.m1004as() && this.f5426j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int mo1647a(C0824b c0824b) {
        if (c0824b == null) {
            return 0;
        }
        int i = this.f5440x;
        int i2 = c0824b.f5440x;
        if (i != i2) {
            return i - i2;
        }
        String m1649a = m1649a();
        String m1649a2 = c0824b.m1649a();
        if (m1649a == null) {
            m1649a = VariableScope.nullOrMissingString;
        }
        if (m1649a2 == null) {
            m1649a2 = VariableScope.nullOrMissingString;
        }
        return m1649a.compareTo(m1649a2);
    }
}
