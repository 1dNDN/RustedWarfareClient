package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0618t;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0450i;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0436c;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p024d.C0489e;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0924aa;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.C0937h;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/n.class */
public abstract class AbstractC0197n extends AbstractC0726bk implements Comparable {

    /* renamed from: k */
    public int f1306k;

    /* renamed from: l */
    public final String f1307l = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";

    /* renamed from: m */
    public boolean f1308m;

    /* renamed from: n */
    public boolean f1309n;

    /* renamed from: o */
    public double f1310o;

    /* renamed from: p */
    public double f1311p;

    /* renamed from: q */
    public int f1312q;

    /* renamed from: r */
    public AbstractC0623y f1313r;

    /* renamed from: s */
    public AbstractC0623y f1314s;

    /* renamed from: t */
    public boolean f1315t;

    /* renamed from: u */
    public String f1316u;

    /* renamed from: v */
    public boolean f1317v;

    /* renamed from: w */
    public int f1318w;

    /* renamed from: x */
    public boolean f1319x;

    /* renamed from: y */
    public Integer f1320y;

    /* renamed from: z */
    public Integer f1321z;

    /* renamed from: A */
    public Integer f1322A;

    /* renamed from: B */
    public Integer f1323B;

    /* renamed from: C */
    public int f1324C;

    /* renamed from: as */
    private boolean f1325as;

    /* renamed from: at */
    private int f1326at;

    /* renamed from: D */
    public boolean f1327D;

    /* renamed from: au */
    private int f1328au;

    /* renamed from: E */
    public boolean f1329E;

    /* renamed from: F */
    public boolean f1330F;

    /* renamed from: G */
    public boolean f1331G;

    /* renamed from: H */
    public boolean f1332H;

    /* renamed from: I */
    public boolean f1333I;

    /* renamed from: J */
    public final Object f1334J;

    /* renamed from: K */
    public int f1335K;

    /* renamed from: L */
    public int f1336L;

    /* renamed from: M */
    public byte[][] f1337M;

    /* renamed from: N */
    public String f1338N;

    /* renamed from: O */
    public String f1339O;

    /* renamed from: P */
    public int f1340P;

    /* renamed from: Q */
    public int f1341Q;

    /* renamed from: R */
    public boolean f1342R;

    /* renamed from: S */
    public C0202s f1343S;

    /* renamed from: T */
    public boolean f1344T;

    /* renamed from: U */
    public byte f1345U;

    /* renamed from: V */
    public int f1346V;

    /* renamed from: W */
    public long f1347W;

    /* renamed from: X */
    public long f1348X;

    /* renamed from: Y */
    public int f1349Y;

    /* renamed from: Z */
    public boolean f1350Z;

    /* renamed from: aa */
    public boolean f1351aa;

    /* renamed from: ab */
    public int f1352ab;

    /* renamed from: ac */
    int f1353ac;

    /* renamed from: ad */
    public Paint f1354ad;

    /* renamed from: ae */
    public Paint f1355ae;

    /* renamed from: ah */
    int f1356ah;

    /* renamed from: aj */
    C0449h f1357aj;

    /* renamed from: ak */
    C0439f f1358ak;

    /* renamed from: al */
    public C0436c f1359al;

    /* renamed from: am */
    public float f1360am;

    /* renamed from: ap */
    long f1361ap;

    /* renamed from: aq */
    double f1362aq;

    /* renamed from: a */
    static C1101m f1363a = new C1101m();

    /* renamed from: b */
    static AbstractC0197n[] f1364b = new AbstractC0197n[0];

    /* renamed from: c */
    public static int f1365c = 10;

    /* renamed from: d */
    public static int f1366d = 0;

    /* renamed from: e */
    public static int f1367e = 100;

    /* renamed from: f */
    public static int f1368f = f1365c + f1366d;

    /* renamed from: g */
    public static final AbstractC0197n f1369g = new C0187e(-1, false, "<blank>");

    /* renamed from: h */
    public static final AbstractC0197n f1370h = new C0186d(-2);

    /* renamed from: i */
    public static final AbstractC0197n f1371i = new C0186d(-1);

    /* renamed from: ar */
    private static AbstractC0197n[] f1372ar = new AbstractC0197n[f1368f];

    /* renamed from: j */
    public static AbstractC0197n f1373j = new C0204u(-99);

    /* renamed from: af */
    static int[] f1374af = new int[10];

    /* renamed from: ag */
    static String[] f1375ag = new String[10];

    /* renamed from: ai */
    static int f1376ai = -99;

    /* renamed from: an */
    public static float f1377an = 40.0f;

    /* renamed from: ao */
    public static float f1378ao = 10.0f;

    /* renamed from: a */
    public int mo4313a(AbstractC0197n abstractC0197n) {
        int i = this.f1352ab - abstractC0197n.f1352ab;
        if (i != 0) {
            return i;
        }
        int i2 = this.f1306k - abstractC0197n.f1306k;
        if (i2 != 0) {
            return i2;
        }
        if (this.f1316u != null && abstractC0197n.f1316u != null) {
            return this.f1316u.compareTo(abstractC0197n.f1316u);
        }
        return 0;
    }

    /* renamed from: b */
    public void m4609b(StreamWriter streamWriter) {
        streamWriter.mo1355c(this.f1306k);
        streamWriter.WriteInteger((int) this.f1310o);
        streamWriter.WriteInteger(this.f1312q);
        streamWriter.mo1357b(this.f1316u);
        streamWriter.mo1314a(this.f1344T);
        if (streamWriter.m1379g() > 26) {
            streamWriter.WriteInteger(m4548y());
            streamWriter.mo1352d("lastPingTimeReceivedAt");
            streamWriter.mo1373a(this.f1347W);
        }
        if (streamWriter.m1379g() >= 55) {
            streamWriter.mo1314a(this.f1317v);
            streamWriter.WriteInteger(this.f1318w);
        }
        if (streamWriter.m1379g() >= 91) {
            streamWriter.WriteInteger(this.f1352ab);
            streamWriter.mo1355c(0);
        }
        if (streamWriter.m1379g() >= 97) {
            streamWriter.mo1314a(this.f1332H);
            streamWriter.mo1314a(this.f1333I);
        }
        if (streamWriter.m1379g() >= 125) {
            streamWriter.mo1314a(this.f1327D);
            streamWriter.mo1314a(this.f1325as);
            streamWriter.WriteInteger(this.f1326at);
        }
        if (streamWriter.m1379g() >= 149) {
            streamWriter.mo1357b(this.f1339O);
            streamWriter.WriteInteger(this.f1340P);
        }
        if (streamWriter.m1379g() >= 156) {
            streamWriter.m1381a(this.f1320y);
            streamWriter.m1381a(this.f1321z);
            streamWriter.m1381a(this.f1322A);
            streamWriter.m1381a(this.f1323B);
            streamWriter.WriteInteger(this.f1324C);
        }
    }

    /* renamed from: c */
    public void m4594c(StreamWriter streamWriter) {
        streamWriter.mo1355c(0);
        streamWriter.WriteInteger(m4548y());
        streamWriter.mo1314a(this.f1332H);
        streamWriter.mo1314a(this.f1333I);
    }

    /* renamed from: a */
    public void m4629a(Reader reader) {
        reader.m1289d();
        this.f1346V = reader.ReadInt();
        this.f1347W = System.currentTimeMillis();
        this.f1332H = reader.ReadBool();
        this.f1333I = reader.ReadBool();
    }

    /* renamed from: b */
    public void m4608b(Reader reader) {
        m4628a(reader, false);
    }

    /* renamed from: a */
    public void m4628a(Reader reader, boolean z) {
        if (!z) {
            m4574f((int) reader.m1289d());
            this.f1310o = reader.ReadInt();
            this.f1311p = 0.0d;
            this.f1312q = reader.ReadInt();
            this.f1316u = reader.ReadString();
            this.f1344T = reader.ReadBool();
        } else {
            reader.m1289d();
            reader.ReadInt();
            reader.ReadInt();
            reader.ReadString();
            reader.ReadBool();
        }
        if (reader.m1295b() >= 14) {
            this.f1346V = reader.ReadInt();
            reader.m1283i();
            this.f1347W = System.currentTimeMillis();
        }
        if (reader.m1295b() >= 34 && reader.m1291c() >= 55) {
            boolean ReadBool = reader.ReadBool();
            int ReadInt = reader.ReadInt();
            if (!z) {
                this.f1317v = ReadBool;
                this.f1318w = ReadInt;
            }
        } else if (LoggerMaybe.m1072A().f6122bX.lock1) {
            C0831ad.m1449g("AI was skipping in networked game, steam version:" + reader.m1291c());
        }
        if (reader.m1295b() >= 50 && reader.m1291c() >= 91) {
            this.f1352ab = reader.ReadInt();
            reader.m1289d();
        }
        if (reader.m1295b() >= 52 && reader.m1291c() >= 97) {
            this.f1332H = reader.ReadBool();
            this.f1333I = reader.ReadBool();
        }
        if (reader.m1295b() >= 70 && reader.m1291c() >= 125) {
            boolean ReadBool2 = reader.ReadBool();
            boolean ReadBool3 = reader.ReadBool();
            int ReadInt2 = reader.ReadInt();
            if (!z) {
                this.f1327D = ReadBool2;
                this.f1325as = ReadBool3;
                this.f1326at = ReadInt2;
            }
        }
        if (reader.m1295b() >= 90 && reader.m1291c() >= 149) {
            String ReadString = reader.ReadString();
            int ReadInt3 = reader.ReadInt();
            if (!z) {
                this.f1339O = ReadString;
                this.f1340P = ReadInt3;
            }
        }
        if (reader.m1295b() >= 93 && reader.m1291c() >= 156) {
            Integer ReadInt1 = reader.ReadInt1();
            Integer ReadInt12 = reader.ReadInt1();
            Integer ReadInt13 = reader.ReadInt1();
            Integer ReadInt14 = reader.ReadInt1();
            int ReadInt4 = reader.ReadInt();
            if (!z) {
                if (this.f1320y != ReadInt1) {
                    m4592c("readIn aiDifficultyOverride was:" + this.f1320y + " now:  " + ReadInt1);
                }
                this.f1320y = ReadInt1;
                this.f1321z = ReadInt12;
                this.f1322A = ReadInt13;
                this.f1323B = ReadInt14;
                this.f1324C = ReadInt4;
            }
        }
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1352d("Writing team: " + this.f1316u);
        m4609b(streamWriter);
        if (streamWriter.m1379g() >= 44) {
            streamWriter.mo1355c(4);
            streamWriter.mo1314a(this.f1330F);
            streamWriter.mo1314a(this.f1329E);
            streamWriter.mo1314a(true);
            if (1 != 0) {
                m4585d(streamWriter);
            }
            this.f1358ak.m3805a(streamWriter);
            C0448g.m3752a(this.f1357aj, streamWriter);
            streamWriter.mo1314a(this.f1319x);
        }
    }

    /* renamed from: c */
    public void m4593c(Reader reader) {
        m4608b(reader);
        if (reader.m1295b() >= 26) {
            byte m1289d = reader.m1289d();
            this.f1330F = reader.ReadBool();
            if (m1289d >= 1) {
                this.f1329E = reader.ReadBool();
            }
            if (reader.ReadBool()) {
                m4584d(reader);
            }
            if (m1289d >= 2) {
                this.f1358ak.m3804a(reader);
            }
            if (m1289d >= 3) {
                m4631a(C0448g.m3751a(reader));
            }
            if (m1289d >= 4) {
                this.f1319x = reader.ReadBool();
            }
        }
    }

    /* renamed from: d */
    public void m4585d(StreamWriter streamWriter) {
        LoggerMaybe.m1072A();
        streamWriter.mo1352d("-- Saving fog --");
        streamWriter.mo1314a(this.f1337M != null);
        if (this.f1337M != null) {
            streamWriter.WriteInteger(this.f1335K);
            streamWriter.WriteInteger(this.f1336L);
            for (int i = 0; i < this.f1335K; i++) {
                for (int i2 = 0; i2 < this.f1336L; i2++) {
                    streamWriter.mo1355c(this.f1337M[i][i2]);
                }
            }
        }
        streamWriter.mo1352d("--End fog--");
    }

    /* renamed from: d */
    public void m4584d(Reader reader) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (reader.ReadBool()) {
            this.f1335K = reader.ReadInt();
            this.f1336L = reader.ReadInt();
            int i = this.f1335K;
            int i2 = this.f1336L;
            if (m1072A.f6110bL != null) {
                i = m1072A.f6110bL.f792C;
                i2 = m1072A.f6110bL.f793D;
                if (this.f1335K != i || this.f1336L != i2) {
                    LoggerMaybe.m983b("Map size does not match fog size: " + this.f1335K + "!=" + i + "|" + this.f1336L + "!=" + i2);
                }
            }
            if (1 != 0) {
                this.f1337M = new byte[i][i2];
            } else {
                this.f1337M = null;
            }
            for (int i3 = 0; i3 < this.f1335K; i3++) {
                for (int i4 = 0; i4 < this.f1336L; i4++) {
                    if (1 != 0) {
                        this.f1337M[i3][i4] = reader.m1289d();
                    } else {
                        reader.m1289d();
                    }
                }
            }
            return;
        }
        this.f1337M = null;
    }

    /* renamed from: a */
    public void m4640a() {
        if (this.f1337M != null) {
            for (int i = 0; i < this.f1335K; i++) {
                for (int i2 = 0; i2 < this.f1336L; i2++) {
                    this.f1337M[i][i2] = 0;
                }
            }
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6099bs == this) {
            m1072A.f6121bW.f5320O = true;
            if (m1072A.f6110bL != null) {
                m1072A.f6110bL.m4792k();
                m1072A.f6110bL.m4797g();
            }
        }
    }

    /* renamed from: b */
    public boolean m4619b() {
        return this.f1312q == -3;
    }

    /* renamed from: a */
    public static ArrayList m4621a(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1368f; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && (z || abstractC0197n.m4619b())) {
                arrayList.add(abstractC0197n);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList m4603c() {
        return m4604b(false);
    }

    /* renamed from: b */
    public static ArrayList m4604b(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1368f; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && (z || !abstractC0197n.m4619b())) {
                arrayList.add(abstractC0197n);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static AbstractC0197n[] m4590d() {
        return f1364b;
    }

    /* renamed from: e */
    public static void m4581e() {
        C1101m c1101m = f1363a;
        c1101m.clear();
        c1101m.add(f1371i);
        c1101m.add(f1370h);
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                c1101m.add(abstractC0197n);
            }
        }
        if (f1364b.length != c1101m.f6894a) {
            f1364b = new AbstractC0197n[c1101m.f6894a];
        }
        int i2 = c1101m.f6894a;
        Object[] m534a = c1101m.m534a();
        for (int i3 = 0; i3 < i2; i3++) {
            f1364b[i3] = (AbstractC0197n) m534a[i3];
        }
    }

    /* renamed from: f */
    public static ArrayList m4576f() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && !abstractC0197n.m4619b()) {
                arrayList.add(Integer.valueOf(abstractC0197n.f1312q));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m4637a(int i, boolean z) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1365c; i3++) {
            AbstractC0197n abstractC0197n = f1372ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && !abstractC0197n.m4619b() && (!z || !abstractC0197n.f1317v)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: g */
    public static int m4573g() {
        int i = 0;
        for (int i2 = 0; i2 < f1365c; i2++) {
            AbstractC0197n abstractC0197n = f1372ar[i2];
            if (abstractC0197n != null && !abstractC0197n.m4619b() && !abstractC0197n.f1329E && !abstractC0197n.f1330F) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m4616b(int i, boolean z) {
        if (i < 10 || i == f1365c) {
            return;
        }
        if (i > f1367e) {
            throw new IOException("setMaxTeamId: " + i + " is over limit of:" + f1367e);
        }
        if (!z && i <= f1365c) {
            return;
        }
        int i2 = i + f1366d;
        AbstractC0197n[] abstractC0197nArr = new AbstractC0197n[i2];
        for (int i3 = 0; i3 < f1372ar.length; i3++) {
            AbstractC0197n abstractC0197n = f1372ar[i3];
            if (i3 < abstractC0197nArr.length) {
                abstractC0197nArr[i3] = abstractC0197n;
            }
        }
        f1372ar = abstractC0197nArr;
        f1365c = i;
        f1368f = i2;
    }

    /* renamed from: a */
    public static String m4638a(int i) {
        return i == 0 ? "A" : i == 1 ? "B" : i == 2 ? "C" : i == 3 ? "D" : i == 4 ? "E" : i == 5 ? "F" : i == 6 ? "G" : i == 7 ? "H" : i == 8 ? "I" : i == 9 ? "J" : i == 10 ? "K" : i == -3 ? "S" : VariableScope.nullOrMissingString + i;
    }

    /* renamed from: h */
    public String m4570h() {
        return m4638a(this.f1312q);
    }

    /* renamed from: i */
    public void m4567i() {
        this.f1327D = false;
        this.f1325as = false;
        this.f1326at = -9999;
    }

    /* renamed from: j */
    public boolean m4565j() {
        return this.f1327D;
    }

    /* renamed from: k */
    public boolean m4563k() {
        return this.f1326at >= 0;
    }

    /* renamed from: l */
    public void m4561l() {
        this.f1326at = LoggerMaybe.m1072A().f6102by;
    }

    /* renamed from: m */
    public boolean m4560m() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (((this.f1329E || this.f1330F) && !m1072A.f6122bX.f5603aO.f5652l) || this.f1317v || m4547z() || this.f1351aa) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m4617b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1365c; i3++) {
            AbstractC0197n abstractC0197n = f1372ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && abstractC0197n.m4563k() && abstractC0197n.m4560m()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m4601c(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1365c; i3++) {
            AbstractC0197n abstractC0197n = f1372ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && abstractC0197n.m4560m()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: n */
    public static void m4559n() {
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.m4643V();
            }
        }
        m4644U();
    }

    /* renamed from: o */
    public static void m4558o() {
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.f1326at = -9999;
            }
        }
    }

    /* renamed from: d */
    public static void m4588d(int i) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!m1072A.f6122bX.IsServer || m1072A.f6126cb.m2411h()) {
            return;
        }
        for (int i2 = 0; i2 < f1365c; i2++) {
            AbstractC0197n abstractC0197n = f1372ar[i2];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && !abstractC0197n.f1325as) {
                abstractC0197n.f1325as = true;
                C0749e m2368b = m1072A.f6130cf.m2368b();
                m2368b.f4842i = abstractC0197n;
                m2368b.f4850r = true;
                m2368b.f4853u = 100;
                m1072A.f6122bX.m1564a(m2368b);
            }
        }
    }

    /* renamed from: e */
    public static void m4579e(int i) {
        AbstractC0197n[] abstractC0197nArr;
        int i2 = -9999;
        for (int i3 = 0; i3 < f1365c; i3++) {
            AbstractC0197n abstractC0197n = f1372ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && abstractC0197n.m4563k() && abstractC0197n.m4560m() && abstractC0197n.f1326at > i2) {
                i2 = abstractC0197n.f1326at;
            }
        }
        if (i2 >= 0 && C1117y.m475a(i2, 120000)) {
            for (AbstractC0197n abstractC0197n2 : f1372ar) {
                if (abstractC0197n2 != null && abstractC0197n2.f1312q == i) {
                    abstractC0197n2.f1326at = -9999;
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m4615b(AbstractC0197n abstractC0197n) {
        if (m4557p() && abstractC0197n != null && m4587d(abstractC0197n)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m4557p() {
        if (this.f1332H || this.f1333I) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m4556q() {
        if (LoggerMaybe.m1072A().f6099bs == this) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m4591c(boolean z) {
        if (z) {
            this.f1340P = 1;
        } else {
            this.f1340P = 0;
        }
    }

    /* renamed from: r */
    public boolean m4555r() {
        return this.f1340P == 1;
    }

    /* renamed from: a */
    public final int m4620a(boolean z, boolean z2) {
        C0202s c0202s = this.f1343S;
        int i = c0202s.f1402c;
        if (z) {
            i += c0202s.f1405f;
        }
        if (z2) {
            i += c0202s.f1404e;
        }
        return i;
    }

    /* renamed from: s */
    public final int m4554s() {
        return this.f1343S.f1402c + this.f1343S.f1405f + this.f1343S.f1404e;
    }

    /* renamed from: a */
    public final int m4632a(C0448g c0448g, boolean z, boolean z2) {
        C0202s c0202s = this.f1343S;
        if (c0202s.f1403d == 0) {
            return 0;
        }
        C0199p c0199p = null;
        C0203t c0203t = c0202s.f1413n;
        C0199p[] c0199pArr = c0203t.f1416b;
        int i = 0;
        int i2 = c0203t.f1417c;
        while (true) {
            if (i >= i2) {
                break;
            }
            C0199p c0199p2 = c0199pArr[i];
            if (c0199p2.f1385a != c0448g) {
                i++;
            } else {
                c0199p = c0199p2;
                break;
            }
        }
        if (c0199p == null) {
            c0199p = c0202s.m4545a(c0448g);
            if (c0199p.f1389e > 50) {
                c0203t.m4539a(c0199p);
            }
            c0199p.f1389e = (short) (c0199p.f1389e + 1);
        }
        int i3 = c0199p.f1386b;
        if (z) {
            i3 += c0199p.f1387c;
        }
        if (z2) {
            i3 += c0199p.f1388d;
        }
        return i3;
    }

    /* renamed from: t */
    public boolean m4553t() {
        boolean z = false;
        C0202s m4577e = m4577e(false);
        if (this.f1343S.f1401b != m4577e.f1401b) {
            LoggerMaybe.m983b("unitCountExcludingBuildingsIncludingQueued: " + this.f1343S.f1401b + "!=" + m4577e.f1401b + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1400a != m4577e.f1400a) {
            LoggerMaybe.m983b("unitsMax: " + this.f1343S.f1400a + "!=" + m4577e.f1400a + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1406g != m4577e.f1406g) {
            LoggerMaybe.m983b("incomeRate: " + this.f1343S.f1406g + "!=" + m4577e.f1406g + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1405f != m4577e.f1405f) {
            LoggerMaybe.m983b("incompleteUnitCountOfAllTypes: " + this.f1343S.f1405f + "!=" + m4577e.f1405f + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1404e != m4577e.f1404e) {
            LoggerMaybe.m983b("queuedCountOfAllTypes: " + this.f1343S.f1404e + "!=" + m4577e.f1404e + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1402c != m4577e.f1402c) {
            LoggerMaybe.m983b("unitCountOfAllTypesOnlyCompleted: " + this.f1343S.f1402c + "!=" + m4577e.f1402c + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (!this.f1343S.f1407h.m3781e(m4577e.f1407h)) {
            LoggerMaybe.m983b("customIncomeRate: " + this.f1343S.f1407h + "!=" + m4577e.f1407h + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            LoggerMaybe.m983b("currentCaches:" + this.f1343S.f1407h.m3803a(false, true, 30, true, true));
            LoggerMaybe.m983b("targetUnitCache:" + m4577e.f1407h.m3803a(false, true, 30, true, true));
            this.f1353ac++;
            z = true;
        }
        if (!this.f1343S.f1411l.m3781e(m4577e.f1411l)) {
            LoggerMaybe.m983b("streamingRateNegative (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            LoggerMaybe.m983b("currentCaches:" + this.f1343S.f1411l.m3803a(false, true, 30, true, true));
            LoggerMaybe.m983b("targetUnitCache:" + m4577e.f1411l.m3803a(false, true, 30, true, true));
            this.f1353ac++;
            z = true;
        }
        if (!this.f1343S.f1410k.m3781e(m4577e.f1410k)) {
            LoggerMaybe.m983b("streamingRatePositive (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            LoggerMaybe.m983b("currentCaches:" + this.f1343S.f1410k.m3803a(false, true, 30, true, true));
            LoggerMaybe.m983b("targetUnitCache:" + m4577e.f1410k.m3803a(false, true, 30, true, true));
            this.f1353ac++;
            z = true;
        }
        if (z) {
        }
        return z;
    }

    /* renamed from: e */
    private C0202s m4577e(boolean z) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0202s c0202s = new C0202s();
        c0202s.f1400a = m1072A.f6105bB;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this) {
                c0202s.m4546a(abstractC0244am);
                if (z) {
                    abstractC0244am.f1610bW = true;
                }
            }
        }
        if (c0202s.f1400a > m1072A.f6106bC) {
            c0202s.f1400a = m1072A.f6106bC;
        }
        return c0202s;
    }

    /* renamed from: d */
    public void m4582d(boolean z) {
        if (!z && !this.f1342R) {
            return;
        }
        this.f1343S = m4577e(true);
        this.f1342R = false;
        if (this.f1341Q < this.f1343S.f1401b) {
            this.f1341Q = this.f1343S.f1401b;
        }
        if (!this.f1309n && this.f1343S.f1412m) {
            this.f1309n = true;
        }
        if (!this.f1308m && m4554s() > 0) {
            this.f1308m = true;
        }
        m4648Q();
    }

    /* renamed from: a */
    public int m4633a(C0428a c0428a) {
        return 0 - ((int) this.f1343S.f1411l.m3815a(c0428a));
    }

    /* renamed from: b */
    public int m4613b(C0428a c0428a) {
        int m3815a;
        if (c0428a == C0428a.f2762B) {
            m3815a = this.f1343S.f1406g;
        } else {
            m3815a = (int) this.f1343S.f1407h.m3815a(c0428a);
        }
        int m3815a2 = m3815a + ((int) this.f1343S.f1410k.m3815a(c0428a));
        LoggerMaybe.m1072A();
        boolean z = false;
        if (c0428a == C0428a.f2762B) {
            z = true;
        }
        if (z) {
            m3815a2 = (int) (m3815a2 * m4663B());
        }
        return m3815a2;
    }

    /* renamed from: u */
    public int m4552u() {
        return this.f1343S.f1401b;
    }

    /* renamed from: v */
    public int m4551v() {
        return this.f1343S.f1400a;
    }

    /* renamed from: w */
    public String m4550w() {
        int m4548y = m4548y();
        if (m4548y == -99) {
            return VariableScope.nullOrMissingString;
        }
        if (this.f1317v) {
            return VariableScope.nullOrMissingString;
        }
        if (m4548y == -2 || m4548y == -1) {
            return "(disconnected)";
        }
        return "(" + m4548y + ")";
    }

    /* renamed from: x */
    public String m4549x() {
        int m4548y = m4548y();
        if (m4548y == -99) {
            return "HOST";
        }
        if (this.f1317v) {
            return "-";
        }
        if (m4548y == -1) {
            return "N/A";
        }
        if (m4548y == -2) {
            return "-";
        }
        if (m4555r()) {
            return m4548y + " (HOST)";
        }
        return VariableScope.nullOrMissingString + m4548y;
    }

    /* renamed from: y */
    public int m4548y() {
        if (this.f1347W == -1) {
            return -2;
        }
        if (this.f1347W < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f1346V;
    }

    /* renamed from: z */
    public boolean m4547z() {
        if (this.f1347W != -1 && this.f1347W < System.currentTimeMillis() - 15000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo4538a(float f) {
        this.f1360am += f;
        if (this.f1360am > 90.0f) {
            this.f1360am = 0.0f;
            this.f1359al.m3829a();
        }
    }

    /* renamed from: A */
    public final int m4664A() {
        if (this.f1319x) {
            return this.f1318w;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if ((m1072A.f6122bX.lock1 || m1072A.f6126cb.m2412g()) && !m1072A.f6122bX.f5571F) {
            if (this.f1320y != null && this.f1320y.intValue() != this.f1318w) {
                m4592c("aiDifficultyOverride:  " + this.f1320y + "!=" + this.f1318w);
            }
            return this.f1318w;
        } else if (this.f1320y != null) {
            return this.f1320y.intValue();
        } else {
            return LoggerMaybe.m1072A().f6115bQ.aiDifficulty;
        }
    }

    /* renamed from: B */
    public final float m4663B() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.m1059N()) {
            return m1072A.f6122bX.f5603aO.f5661h;
        }
        return 1.0f;
    }

    /* renamed from: C */
    public final float m4662C() {
        float f;
        if (!this.f1317v) {
            return 1.0f;
        }
        int m4664A = m4664A();
        if (m4664A > 0) {
            f = 1.0f + (m4664A * 0.4f);
        } else {
            f = 1.0f + (m4664A * 0.3f);
        }
        if (m4664A == 3) {
            f += 1.5f;
        }
        if (f < 0.1f) {
            f = 0.1f;
        }
        return f;
    }

    /* renamed from: b */
    public final void m4618b(float f) {
        if (!this.f1317v) {
            m4602c(f);
        } else {
            m4602c(m4662C() * f);
        }
    }

    /* renamed from: c */
    public final void m4602c(float f) {
        m4589d(f * m4663B());
    }

    /* renamed from: d */
    public final void m4589d(float f) {
        this.f1310o += f;
        if (this.f1310o > 9.99999999E8d) {
            this.f1310o = 9.99999999E8d;
        }
    }

    /* renamed from: D */
    public static void m4661D() {
        try {
            m4616b(10, true);
            for (int i = 0; i < f1372ar.length; i++) {
                f1372ar[i] = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C0187e m4622a(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            LoggerMaybe.m983b("findExistingPlayer: No clientId id");
            return null;
        }
        for (int i = 0; i < f1372ar.length; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && str.equals(abstractC0197n.f1338N)) {
                if (abstractC0197n instanceof C0187e) {
                    return (C0187e) abstractC0197n;
                }
                LoggerMaybe.m983b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C0187e m4605b(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            LoggerMaybe.m983b("No id");
            return null;
        }
        for (int i = 0; i < f1372ar.length; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && str.equals(abstractC0197n.f1339O)) {
                if (abstractC0197n instanceof C0187e) {
                    return (C0187e) abstractC0197n;
                }
                LoggerMaybe.m983b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: E */
    public static int m4660E() {
        for (int i = 0; i < f1365c; i++) {
            if (f1372ar[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: F */
    public static int m4659F() {
        for (int i = f1365c; i < f1368f; i++) {
            if (f1372ar[i] == null) {
                return i;
            }
        }
        for (int i2 = f1365c - 1; i2 >= 0; i2--) {
            if (f1372ar[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: G */
    public void m4658G() {
        for (int i = 0; i < f1372ar.length; i++) {
            if (f1372ar[i] == this) {
                f1372ar[i] = null;
            }
        }
    }

    public AbstractC0197n() {
        this.f1306k = -1;
        this.f1307l = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";
        this.f1310o = 4000.0d;
        this.f1311p = 0.0d;
        this.f1313r = C0618t.m3011a(this);
        this.f1314s = C0618t.m3011a(this);
        this.f1315t = false;
        this.f1324C = -1;
        this.f1326at = -9999;
        this.f1328au = -9999;
        this.f1334J = new Object();
        this.f1342R = true;
        this.f1343S = new C0202s();
        this.f1346V = -1;
        this.f1347W = -1L;
        this.f1348X = -1L;
        this.f1349Y = -1;
        this.f1352ab = 0;
        this.f1354ad = new C0930ag();
        this.f1355ae = new C0930ag();
        this.f1356ah = -2;
        this.f1357aj = C0448g.f2837d;
        this.f1358ak = new C0439f();
        this.f1359al = new C0436c();
        this.f1361ap = -9999L;
        this.f1317v = this instanceof C0136a;
    }

    public AbstractC0197n(int i) {
        this(i, true);
    }

    public AbstractC0197n(int i, boolean z) {
        this();
        m4600c(i, z);
    }

    /* renamed from: f */
    public void m4574f(int i) {
        m4600c(i, true);
    }

    /* renamed from: c */
    public void m4600c(int i, boolean z) {
        if (this.f1306k != i) {
            if (z) {
                m4658G();
            }
            this.f1306k = i;
            this.f1312q = i;
            if (z && i != -3) {
                AbstractC0197n abstractC0197n = f1372ar[i];
                if (abstractC0197n != null) {
                    abstractC0197n.m4592c("Being replaced");
                }
                f1372ar[i] = this;
            }
            int m4657H = m4657H();
            this.f1354ad.m5398b(m4657H);
            this.f1355ae.m5398b(Color.m5435a(Color.m5437a(m4657H), (int) (Color.m5433b(m4657H) * 0.5f), (int) (Color.m5432c(m4657H) * 0.5f), (int) (Color.m5431d(m4657H) * 0.5f)));
        }
    }

    /* renamed from: a */
    public boolean m4639a(double d) {
        if (this.f1310o >= d || d == 0.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m4571g(int i) {
        if (this.f1310o + this.f1311p >= i || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m4599c(AbstractC0197n abstractC0197n) {
        return (abstractC0197n == f1371i || this == f1371i || this.f1312q == abstractC0197n.f1312q) ? false : true;
    }

    /* renamed from: d */
    public final boolean m4587d(AbstractC0197n abstractC0197n) {
        if (abstractC0197n == f1371i && this == f1371i) {
            return true;
        }
        return (abstractC0197n == f1371i || this == f1371i || this.f1312q != abstractC0197n.f1312q) ? false : true;
    }

    /* renamed from: H */
    public int m4657H() {
        return m4566i(m4650O());
    }

    /* renamed from: I */
    public static void m4656I() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        try {
            m4583d(m1072A.f6115bQ.teamColors);
        } catch (IllegalArgumentException e) {
            LoggerMaybe.m1026a("initColors: Failed to read setting: '" + m1072A.f6115bQ.teamColors + "': " + e.getMessage(), (Throwable) e);
            m4583d("#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4");
        }
        try {
            m4578e(m1072A.f6115bQ.teamColorsNames);
        } catch (IllegalArgumentException e2) {
            LoggerMaybe.m1026a("initColors: Failed to read setting: '" + m1072A.f6115bQ.teamColorsNames + "': " + e2.getMessage(), (Throwable) e2);
            m4578e("GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE");
        }
    }

    /* renamed from: d */
    private static void m4583d(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 hex colors");
        }
        for (int i = 0; i < 10; i++) {
            f1374af[i] = Color.m5434a(split[i]);
        }
    }

    /* renamed from: e */
    private static void m4578e(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 team color names");
        }
        for (int i = 0; i < 10; i++) {
            f1375ag[i] = split[i];
        }
    }

    /* renamed from: J */
    public int m4655J() {
        if (this.f1312q == -3) {
            return m4566i(-3);
        }
        return m4568h(this.f1306k);
    }

    /* renamed from: h */
    public static int m4568h(int i) {
        if (i >= f1365c) {
            return m4566i(-3);
        }
        return m4566i(i % 2);
    }

    /* renamed from: i */
    public static int m4566i(int i) {
        if (i >= 0 && i < 10) {
            return f1374af[i];
        }
        if (i == -3) {
            return Color.m5435a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 90, 90, 90);
        }
        return -7829368;
    }

    /* renamed from: K */
    public String m4654K() {
        if (this.f1306k == -1 || this.f1306k == -2) {
            return "GRAY";
        }
        return m4564j(m4650O());
    }

    /* renamed from: j */
    public static String m4564j(int i) {
        if (i >= 0 && i < 10) {
            return f1375ag[i];
        }
        return "GRAY";
    }

    /* renamed from: a */
    public static C0934e[] m4627a(C0934e c0934e) {
        return m4625a(c0934e, EnumC0198o.pureGreen, false);
    }

    /* renamed from: a */
    public static C0934e[] m4625a(C0934e c0934e, EnumC0198o enumC0198o, boolean z) {
        if (!z || c0934e.mo394A()) {
            return m4607b(c0934e, enumC0198o);
        }
        return m4626a(c0934e, enumC0198o);
    }

    /* renamed from: a */
    public static C0934e[] m4626a(C0934e c0934e, EnumC0198o enumC0198o) {
        C0934e[] c0934eArr = new C0934e[10];
        if ((LoggerMaybe.f6205aU && !LoggerMaybe.f6207aW) || enumC0198o == EnumC0198o.disabled) {
            for (int i = 0; i < c0934eArr.length; i++) {
                c0934eArr[i] = c0934e;
            }
            return c0934eArr;
        }
        C0934e[] m885a = c0934e.m885a(enumC0198o);
        if (m885a != null) {
            return m885a;
        }
        C0727bl c0727bl = LoggerMaybe.m1072A().f6128cd;
        c0727bl.m2384a(EnumC0729bm.init_unitcolour);
        for (int i2 = 0; i2 < c0934eArr.length; i2++) {
            int m4566i = m4566i(i2);
            if (i2 == 0) {
                c0934eArr[i2] = c0934e;
            } else {
                c0934eArr[i2] = new C0937h(c0934e, m4566i, enumC0198o, i2);
            }
        }
        c0727bl.m2379b(EnumC0729bm.init_unitcolour);
        c0934e.m884a(enumC0198o, c0934eArr);
        return c0934eArr;
    }

    /* renamed from: b */
    public static C0934e[] m4607b(C0934e c0934e, EnumC0198o enumC0198o) {
        C0934e[] c0934eArr = new C0934e[10];
        if ((LoggerMaybe.f6205aU && !LoggerMaybe.f6207aW) || enumC0198o == EnumC0198o.disabled || c0934e.mo394A()) {
            for (int i = 0; i < c0934eArr.length; i++) {
                c0934eArr[i] = c0934e;
            }
            return c0934eArr;
        }
        C0934e[] m885a = c0934e.m885a(enumC0198o);
        if (m885a != null) {
            return m885a;
        }
        C0727bl c0727bl = LoggerMaybe.m1072A().f6128cd;
        c0727bl.m2384a(EnumC0729bm.init_unitcolour);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = m4566i(i2);
            iArr2[i2] = i2;
        }
        for (int i3 = 0; i3 < c0934eArr.length; i3++) {
            if (i3 != 0) {
                c0934eArr[i3] = c0934e.mo54h();
                c0934eArr[i3].m882a("color(" + i3 + "):" + c0934e.mo64a());
                c0934eArr[i3].mo52j();
            }
        }
        c0934e.mo52j();
        if (enumC0198o == EnumC0198o.hueAdd) {
            m4606b(c0934e, c0934eArr, iArr);
        } else if (enumC0198o == EnumC0198o.hueShift) {
            m4623a(c0934e, c0934eArr, iArr, iArr2);
        } else {
            m4624a(c0934e, c0934eArr, iArr);
        }
        for (int i4 = 0; i4 < c0934eArr.length; i4++) {
            if (c0934eArr[i4] != null) {
                c0934eArr[i4].mo48p();
                c0934eArr[i4].mo45s();
            }
        }
        c0934e.mo46r();
        c0934eArr[0] = c0934e;
        c0727bl.m2379b(EnumC0729bm.init_unitcolour);
        c0934e.m884a(enumC0198o, c0934eArr);
        return c0934eArr;
    }

    /* renamed from: a */
    public static void m4624a(C0934e c0934e, C0934e[] c0934eArr, int[] iArr) {
        int m922b;
        int mo386m = c0934e.mo386m();
        int mo387l = c0934e.mo387l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m5433b(iArr[i]);
            iArr3[i] = Color.m5432c(iArr[i]);
            iArr4[i] = Color.m5431d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo387l; i2++) {
            for (int i3 = 0; i3 < mo386m; i3++) {
                int mo63a = c0934e.mo63a(i3, i2);
                int m931a = C0924aa.m931a(mo63a);
                if (m931a == 0) {
                    if (mo63a != 0) {
                        for (int i4 = 0; i4 < c0934eArr.length; i4++) {
                            if (c0934eArr[i4] != null) {
                                c0934eArr[i4].mo62a(i3, i2, 0);
                            }
                        }
                    }
                } else {
                    int m921c = C0924aa.m921c(mo63a);
                    if (m921c > 0 && (m922b = C0924aa.m922b(mo63a)) == C0924aa.m920d(mo63a)) {
                        if (m922b == 0) {
                            for (int i5 = 0; i5 < c0934eArr.length; i5++) {
                                if (c0934eArr[i5] != null) {
                                    c0934eArr[i5].mo62a(i3, i2, Color.m5435a(m931a, (iArr2[i5] * m921c) >> 8, (iArr3[i5] * m921c) >> 8, (iArr4[i5] * m921c) >> 8));
                                }
                            }
                        } else if (m921c != m922b) {
                            float f = (m921c * 0.003921569f) - (m922b * 0.003921569f);
                            for (int i6 = 0; i6 < c0934eArr.length; i6++) {
                                if (c0934eArr[i6] != null) {
                                    c0934eArr[i6].mo62a(i3, i2, Color.m5435a(m931a, C0758f.m2101b((int) (m922b + (iArr2[i6] * f)), 0, 255), C0758f.m2101b((int) (m922b + (iArr3[i6] * f)), 0, 255), C0758f.m2101b((int) (m922b + (iArr4[i6] * f)), 0, 255)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4623a(C0934e c0934e, C0934e[] c0934eArr, int[] iArr, int[] iArr2) {
        int m5431d;
        int mo386m = c0934e.mo386m();
        int mo387l = c0934e.mo387l();
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        int[] iArr5 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr3[i] = Color.m5433b(iArr[i]);
            iArr4[i] = Color.m5432c(iArr[i]);
            iArr5[i] = Color.m5431d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo387l; i2++) {
            for (int i3 = 0; i3 < mo386m; i3++) {
                int mo63a = c0934e.mo63a(i3, i2);
                int m5437a = Color.m5437a(mo63a);
                if (m5437a == 0) {
                    if (Color.m5433b(mo63a) > 0 || Color.m5432c(mo63a) > 0 || Color.m5431d(mo63a) > 0) {
                        for (int i4 = 0; i4 < c0934eArr.length; i4++) {
                            if (c0934eArr[i4] != null) {
                                c0934eArr[i4].mo62a(i3, i2, Color.m5435a(0, 0, 0, 0));
                            }
                        }
                    }
                } else {
                    int m5432c = Color.m5432c(mo63a);
                    int m5433b = Color.m5433b(mo63a);
                    float m2080c = C0758f.m2080c(C0758f.m2080c(m5433b, m5432c), Color.m5431d(mo63a));
                    float m2056f = C0758f.m2056f(C0758f.m2056f(C0758f.m2070d(m5433b - m5432c), C0758f.m2070d(m5432c - m5431d)), C0758f.m2070d(m5431d - m5433b));
                    if (m2056f > 15.0f) {
                        for (int i5 = 0; i5 < c0934eArr.length; i5++) {
                            if (c0934eArr[i5] != null) {
                                float f = m2056f / 255.0f;
                                c0934eArr[i5].mo62a(i3, i2, Color.m5435a(m5437a, C0758f.m2101b((int) (m2080c + (iArr3[i5] * f)), 0, 255), C0758f.m2101b((int) (m2080c + (iArr4[i5] * f)), 0, 255), C0758f.m2101b((int) (m2080c + (iArr5[i5] * f)), 0, 255)));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m4606b(C0934e c0934e, C0934e[] c0934eArr, int[] iArr) {
        int mo386m = c0934e.mo386m();
        int mo387l = c0934e.mo387l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m5433b(iArr[i]);
            iArr3[i] = Color.m5432c(iArr[i]);
            iArr4[i] = Color.m5431d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo386m; i2++) {
            for (int i3 = 0; i3 < mo387l; i3++) {
                int mo63a = c0934e.mo63a(i2, i3);
                int m5437a = Color.m5437a(mo63a);
                if (m5437a > 0) {
                    int m5433b = Color.m5433b(mo63a);
                    int m5432c = Color.m5432c(mo63a);
                    int m5431d = Color.m5431d(mo63a);
                    for (int i4 = 0; i4 < c0934eArr.length; i4++) {
                        int i5 = (int) (m5433b + (iArr2[i4] * 0.15f));
                        int i6 = (int) (m5432c + (iArr3[i4] * 0.15f));
                        int i7 = (int) (m5431d + (iArr4[i4] * 0.15f));
                        int m2101b = C0758f.m2101b(i5, 0, 255);
                        int m2101b2 = C0758f.m2101b(i6, 0, 255);
                        int m2101b3 = C0758f.m2101b(i7, 0, 255);
                        if (c0934eArr[i4] != null) {
                            c0934eArr[i4].mo62a(i2, i3, Color.m5435a(m5437a, m2101b, m2101b2, m2101b3));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static AbstractC0197n m4562k(int i) {
        if (i == -1) {
            return f1371i;
        }
        if (i == -2) {
            return f1370h;
        }
        if (i >= f1368f) {
            LoggerMaybe.m958g("team index too high: " + i);
            return null;
        } else if (i < 0) {
            LoggerMaybe.m958g("team index too low: " + i);
            return null;
        } else {
            return f1372ar[i];
        }
    }

    /* renamed from: e */
    public void m4580e(float f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f1356ah > 0) {
            this.f1356ah--;
            return;
        }
        if (this.f1356ah == -2) {
            this.f1356ah = this.f1306k;
        } else {
            this.f1356ah = 10;
        }
        if (!this.f1330F && !m1072A.f6126cb.m2411h()) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = m1072A.f6122bX.f5603aO.f5652l;
            boolean z5 = false;
            AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
            int size = AbstractC0244am.f1590bD.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m498a[i];
                if (abstractC0244am.f1609bV == this) {
                    if (!abstractC0244am.m4363cS()) {
                        z = true;
                        if (!this.f1329E && (abstractC0244am.mo3269bJ() || abstractC0244am.m4412ak())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z5 = true;
                    }
                } else if (z4 && abstractC0244am.f1609bV != null && abstractC0244am.f1609bV.m4587d(this) && !abstractC0244am.m4363cS()) {
                    z3 = true;
                }
            }
            if (!z && !z3) {
                boolean z6 = false;
                if (z5 && m1072A.f6239bx < 100 && m1072A.f6100bv) {
                    z6 = true;
                }
                this.f1330F = true;
                m4640a();
                Iterator it = AbstractC0244am.f1590bD.iterator();
                while (it.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
                    if (abstractC0244am2.f1609bV == this && !abstractC0244am2.mo1712u()) {
                        if (z6 && !abstractC0244am2.f1607bT && abstractC0244am2.m4363cS()) {
                            InterfaceC0303as mo5649r = abstractC0244am2.mo5649r();
                            String str = abstractC0244am2.m4380cA() + " Warning: This unit got ignored in defeated check and now being removed";
                            if ((mo5649r instanceof C0453l) && ((C0453l) mo5649r).f2956aN) {
                                str = str + " (Likely due to canNotBeDirectlyAttacked:true)";
                            }
                            C0831ad.m1544a((String) null, str);
                        }
                        abstractC0244am2.m4350ci();
                    }
                }
                m1072A.f6122bX.m1440i(this);
            }
            if (!z2 && !this.f1329E && !this.f1330F) {
                this.f1329E = true;
                m1072A.f6122bX.m1446h(this);
            }
        }
    }

    /* renamed from: a */
    public void m4630a(AbstractC0623y abstractC0623y) {
    }

    /* renamed from: b */
    public static void m4610b(AbstractC0623y abstractC0623y) {
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.m4630a(abstractC0623y);
            }
        }
    }

    /* renamed from: a */
    public static void m4634a(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1609bV != null && abstractC0244am.f1610bW && abstractC0244am.f1598bK) {
            AbstractC0197n abstractC0197n = abstractC0244am.f1609bV;
            abstractC0244am.f1610bW = false;
            abstractC0197n.f1343S.m4543b(abstractC0244am);
            abstractC0244am.m4327dh();
        }
    }

    /* renamed from: b */
    public static void m4614b(AbstractC0244am abstractC0244am) {
        m4634a(abstractC0244am);
    }

    /* renamed from: c */
    public static void m4598c(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1609bV != null && !abstractC0244am.f1610bW && abstractC0244am.f1598bK && !abstractC0244am.f1607bT) {
            abstractC0244am.f1610bW = true;
            AbstractC0197n abstractC0197n = abstractC0244am.f1609bV;
            abstractC0197n.f1343S.m4546a(abstractC0244am);
            abstractC0244am.m4328dg();
            if (!abstractC0197n.f1309n && abstractC0197n.f1343S.f1412m) {
                abstractC0197n.f1309n = true;
            }
            if (!abstractC0197n.f1308m) {
                abstractC0197n.f1308m = true;
            }
            abstractC0197n.m4648Q();
        }
    }

    /* renamed from: L */
    public static void m4653L() {
        f1371i.f1342R = true;
        f1370h.f1342R = true;
        Iterator it = m4603c().iterator();
        while (it.hasNext()) {
            ((AbstractC0197n) it.next()).f1342R = true;
        }
    }

    /* renamed from: M */
    public static void m4652M() {
        if (LoggerMaybe.m1072A().m1061L()) {
            LoggerMaybe.LogDebug2("Skipping updateAllCachesFromChangedMetadata due to desync risk");
            return;
        }
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.f1342R = true;
            }
        }
    }

    /* renamed from: f */
    public static void m4575f(float f) {
        int m4617b;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f1371i.mo4538a(f);
        f1370h.mo4538a(f);
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.mo4538a(f);
                abstractC0197n.m4580e(f);
                if (!abstractC0197n.f1325as && (m4617b = m4617b(abstractC0197n.f1312q)) > 0) {
                    if (m4617b >= m4601c(abstractC0197n.f1312q)) {
                        m4588d(abstractC0197n.f1312q);
                        m4558o();
                    } else {
                        m4579e(abstractC0197n.f1312q);
                    }
                }
                if (abstractC0197n.f1327D) {
                    if (abstractC0197n.f1328au < 0) {
                        abstractC0197n.f1328au = m1072A.f6102by;
                    }
                    if (!abstractC0197n.f1330F) {
                        int i2 = 0;
                        Iterator it = AbstractC0244am.f1590bD.iterator();
                        while (it.hasNext()) {
                            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                            if (abstractC0244am.f1609bV == abstractC0197n && !abstractC0244am.mo1712u()) {
                                boolean z = false;
                                int i3 = 1;
                                if (C1117y.m475a(abstractC0197n.f1328au, 16000)) {
                                    z = true;
                                    i3 = 50;
                                } else if (C1117y.m475a(abstractC0197n.f1328au, 6000)) {
                                    z = C0758f.m2137a(abstractC0244am, 0, 100) > 90;
                                    i3 = 20;
                                } else if (C1117y.m475a(abstractC0197n.f1328au, 2000)) {
                                    z = C0758f.m2137a(abstractC0244am, 0, 100) > 98;
                                    i3 = 2;
                                }
                                if (abstractC0244am instanceof C0489e) {
                                    z = true;
                                }
                                if (z) {
                                    abstractC0244am.f1632cs = -1.0f;
                                    i2++;
                                    if (i2 > i3) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (m1072A.m1058O() && m1072A.f6115bQ.aiDifficulty != f1376ai) {
            m1072A.f6122bX.m1513aq();
            f1376ai = m1072A.f6115bQ.aiDifficulty;
        }
    }

    /* renamed from: g */
    public static void m4572g(float f) {
        m4581e();
        for (AbstractC0197n abstractC0197n : m4590d()) {
            abstractC0197n.m4582d(false);
        }
    }

    /* renamed from: N */
    public static void m4651N() {
        f1371i.m4582d(false);
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && !abstractC0197n.m4619b() && !abstractC0197n.f1330F && !abstractC0197n.f1329E && !abstractC0197n.f1327D) {
                LoggerMaybe.m1072A().f6122bX.m1452g(abstractC0197n);
            }
        }
    }

    /* renamed from: h */
    public static void m4569h(float f) {
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && (abstractC0197n instanceof C0136a)) {
                ((C0136a) abstractC0197n).m5012i(f);
            }
        }
    }

    /* renamed from: O */
    public int m4650O() {
        if (this.f1324C == -1) {
            return m4649P();
        }
        return this.f1324C;
    }

    /* renamed from: P */
    public int m4649P() {
        AbstractC0197n abstractC0197n;
        if (this.f1306k == -1 || this.f1306k == -2) {
            return 5;
        }
        int i = this.f1306k;
        if (i >= 10) {
            i %= 10;
        }
        if (f1365c > 10 && (abstractC0197n = LoggerMaybe.m1072A().f6122bX.f5489z) != null && abstractC0197n != this && abstractC0197n.m4650O() == i) {
            if (i != 5) {
                i = 5;
            } else {
                i = 4;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public void m4648Q() {
    }

    /* renamed from: a */
    public void m4631a(C0449h c0449h) {
        this.f1357aj = c0449h;
    }

    /* renamed from: R */
    public C0449h m4647R() {
        return this.f1357aj;
    }

    /* renamed from: b */
    public void m4611b(C0449h c0449h) {
        C0449h m4647R = m4647R();
        if (m4647R == null || m4647R.m3743b() == 0) {
            m4631a(c0449h);
        } else if (C0448g.m3748b(m4647R, c0449h)) {
        } else {
            C0450i c0450i = new C0450i(m4647R);
            if (c0450i.m3740a(c0449h)) {
                m4631a(c0450i.m3742a());
            }
        }
    }

    /* renamed from: c */
    public void m4595c(C0449h c0449h) {
        C0449h m4647R = m4647R();
        if (m4647R == null || m4647R.m3743b() == 0 || !C0448g.m3753a(c0449h, m4647R)) {
            return;
        }
        C0450i c0450i = new C0450i(m4647R);
        if (c0450i.m3739b(c0449h)) {
            m4631a(c0450i.m3742a());
        }
    }

    /* renamed from: S */
    public C0439f m4646S() {
        return this.f1358ak;
    }

    /* renamed from: c */
    public double m4597c(C0428a c0428a) {
        return this.f1358ak.m3815a(c0428a);
    }

    /* renamed from: a */
    public boolean m4635a(EnumC0200q enumC0200q, AbstractC0197n abstractC0197n) {
        if (enumC0200q == EnumC0200q.own) {
            return abstractC0197n == this;
        } else if (enumC0200q == EnumC0200q.any) {
            return true;
        } else {
            if (enumC0200q == EnumC0200q.ally) {
                return m4587d(abstractC0197n);
            }
            if (enumC0200q == EnumC0200q.allyNotOwn) {
                return abstractC0197n != this && m4587d(abstractC0197n);
            } else if (enumC0200q == EnumC0200q.enemy) {
                return m4599c(abstractC0197n);
            } else {
                if (enumC0200q == EnumC0200q.neutral) {
                    return abstractC0197n == f1371i;
                } else if (enumC0200q == EnumC0200q.notOwn) {
                    return abstractC0197n != this;
                } else {
                    throw new RuntimeException("Unsupported type: " + enumC0200q);
                }
            }
        }
    }

    /* renamed from: d */
    public void m4586d(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: T */
    public void m4645T() {
        LoggerMaybe.LogDebug2("debugUnitCountByType for team:" + this.f1306k);
        C1101m c1101m = new C1101m();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this && !abstractC0244am.f1607bT) {
                InterfaceC0303as interfaceC0303as = abstractC0244am.f1689dx;
                boolean z = false;
                Iterator it = c1101m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0201r c0201r = (C0201r) it.next();
                    if (c0201r.f1398a == interfaceC0303as) {
                        c0201r.f1399b++;
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    C0201r c0201r2 = new C0201r();
                    c0201r2.f1398a = interfaceC0303as;
                    c0201r2.f1399b = 1;
                    c1101m.add(c0201r2);
                }
            }
        }
        LoggerMaybe.LogDebug2("--- Units ---");
        int i2 = 0;
        Iterator it2 = c1101m.iterator();
        while (it2.hasNext()) {
            C0201r c0201r3 = (C0201r) it2.next();
            if (!c0201r3.f1398a.mo4250k()) {
                LoggerMaybe.LogDebug2(c0201r3.f1398a.mo4252i() + " - count:" + c0201r3.f1399b);
                i2 += c0201r3.f1399b;
            }
        }
        LoggerMaybe.LogDebug2("total:" + i2);
        LoggerMaybe.LogDebug2("--- Buildings/Ignored in count ---");
        int i3 = 0;
        Iterator it3 = c1101m.iterator();
        while (it3.hasNext()) {
            C0201r c0201r4 = (C0201r) it3.next();
            if (c0201r4.f1398a.mo4250k()) {
                LoggerMaybe.LogDebug2(c0201r4.f1398a.mo4252i() + " - count:" + c0201r4.f1399b);
                i3 += c0201r4.f1399b;
            }
        }
        LoggerMaybe.LogDebug2("total:" + i3);
    }

    /* renamed from: c */
    public void m4592c(String str) {
        LoggerMaybe.LogDebug2("Team(id: " + this.f1306k + ", name:" + this.f1316u + "):" + str);
    }

    /* renamed from: b */
    public int m4612b(C0448g c0448g, boolean z, boolean z2) {
        int i = 0;
        if (this == f1371i) {
            return 0;
        }
        AbstractC0197n[] abstractC0197nArr = f1372ar;
        int i2 = f1365c;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC0197n abstractC0197n = abstractC0197nArr[i3];
            if (abstractC0197n != null && this != abstractC0197n && this.f1312q != abstractC0197n.f1312q) {
                if (c0448g == null) {
                    i += abstractC0197n.m4620a(z, z2);
                } else {
                    i += abstractC0197n.m4632a(c0448g, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public int m4596c(C0448g c0448g, boolean z, boolean z2) {
        int i = 0;
        AbstractC0197n[] abstractC0197nArr = f1372ar;
        int i2 = f1365c;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC0197n abstractC0197n = abstractC0197nArr[i3];
            if (abstractC0197n != null && this != abstractC0197n && m4587d(abstractC0197n)) {
                if (c0448g == null) {
                    i += abstractC0197n.m4620a(z, z2);
                } else {
                    i += abstractC0197n.m4632a(c0448g, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: U */
    public static void m4644U() {
        f1371i.m4643V();
        f1370h.m4643V();
    }

    /* renamed from: V */
    public void m4643V() {
        this.f1308m = false;
        this.f1309n = false;
        this.f1310o = 4000.0d;
        this.f1311p = 0.0d;
        this.f1356ah = -2;
        this.f1325as = false;
        this.f1326at = -9999;
        this.f1327D = false;
        this.f1328au = -9999;
        this.f1329E = false;
        this.f1330F = false;
        this.f1331G = false;
        this.f1332H = false;
        this.f1333I = false;
        this.f1359al.m3829a();
        this.f1360am = 0.0f;
        this.f1353ac = 0;
        this.f1341Q = 0;
        this.f1342R = true;
        this.f1343S = new C0202s();
        this.f1357aj = C0448g.f2837d;
        this.f1358ak = new C0439f();
    }

    /* renamed from: W */
    public double m4642W() {
        long currentTimeMillis = System.currentTimeMillis();
        if (C0758f.m2085c((float) (this.f1361ap - currentTimeMillis)) > 166.66666f) {
            this.f1361ap = currentTimeMillis;
            this.f1362aq = this.f1310o;
        }
        return this.f1362aq;
    }

    /* renamed from: X */
    public C0439f m4641X() {
        return m4646S();
    }
}
