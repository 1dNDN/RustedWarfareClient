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
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
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
    public void m5064b(StreamWriter streamWriter) {
        streamWriter.m1401c(this.f1306k);
        streamWriter.WriteInteger((int) this.f1310o);
        streamWriter.WriteInteger(this.f1312q);
        streamWriter.m1404b(this.f1316u);
        streamWriter.mo1329a(this.f1344T);
        if (streamWriter.m1394g() > 26) {
            streamWriter.WriteInteger(m5003y());
            streamWriter.m1398d("lastPingTimeReceivedAt");
            streamWriter.m1424a(this.f1347W);
        }
        if (streamWriter.m1394g() >= 55) {
            streamWriter.mo1329a(this.f1317v);
            streamWriter.WriteInteger(this.f1318w);
        }
        if (streamWriter.m1394g() >= 91) {
            streamWriter.WriteInteger(this.f1352ab);
            streamWriter.m1401c(0);
        }
        if (streamWriter.m1394g() >= 97) {
            streamWriter.mo1329a(this.f1332H);
            streamWriter.mo1329a(this.f1333I);
        }
        if (streamWriter.m1394g() >= 125) {
            streamWriter.mo1329a(this.f1327D);
            streamWriter.mo1329a(this.f1325as);
            streamWriter.WriteInteger(this.f1326at);
        }
        if (streamWriter.m1394g() >= 149) {
            streamWriter.m1404b(this.f1339O);
            streamWriter.WriteInteger(this.f1340P);
        }
        if (streamWriter.m1394g() >= 156) {
            streamWriter.m1410a(this.f1320y);
            streamWriter.m1410a(this.f1321z);
            streamWriter.m1410a(this.f1322A);
            streamWriter.m1410a(this.f1323B);
            streamWriter.WriteInteger(this.f1324C);
        }
    }

    /* renamed from: c */
    public void m5049c(StreamWriter streamWriter) {
        streamWriter.m1401c(0);
        streamWriter.WriteInteger(m5003y());
        streamWriter.mo1329a(this.f1332H);
        streamWriter.mo1329a(this.f1333I);
    }

    /* renamed from: a */
    public void m5084a(Reader reader) {
        reader.m1304d();
        this.f1346V = reader.ReadInt();
        this.f1347W = System.currentTimeMillis();
        this.f1332H = reader.ReadBool();
        this.f1333I = reader.ReadBool();
    }

    /* renamed from: b */
    public void m5063b(Reader reader) {
        m5083a(reader, false);
    }

    /* renamed from: a */
    public void m5083a(Reader reader, boolean z) {
        if (!z) {
            m5029f((int) reader.m1304d());
            this.f1310o = reader.ReadInt();
            this.f1311p = 0.0d;
            this.f1312q = reader.ReadInt();
            this.f1316u = reader.ReadString();
            this.f1344T = reader.ReadBool();
        } else {
            reader.m1304d();
            reader.ReadInt();
            reader.ReadInt();
            reader.ReadString();
            reader.ReadBool();
        }
        if (reader.m1310b() >= 14) {
            this.f1346V = reader.ReadInt();
            reader.m1298i();
            this.f1347W = System.currentTimeMillis();
        }
        if (reader.m1310b() >= 34 && reader.m1306c() >= 55) {
            boolean ReadBool = reader.ReadBool();
            int ReadInt = reader.ReadInt();
            if (!z) {
                this.f1317v = ReadBool;
                this.f1318w = ReadInt;
            }
        } else if (Core.m1087A().f6122bX.lock1) {
            C0831ad.m1493g("AI was skipping in networked game, steam version:" + reader.m1306c());
        }
        if (reader.m1310b() >= 50 && reader.m1306c() >= 91) {
            this.f1352ab = reader.ReadInt();
            reader.m1304d();
        }
        if (reader.m1310b() >= 52 && reader.m1306c() >= 97) {
            this.f1332H = reader.ReadBool();
            this.f1333I = reader.ReadBool();
        }
        if (reader.m1310b() >= 70 && reader.m1306c() >= 125) {
            boolean ReadBool2 = reader.ReadBool();
            boolean ReadBool3 = reader.ReadBool();
            int ReadInt2 = reader.ReadInt();
            if (!z) {
                this.f1327D = ReadBool2;
                this.f1325as = ReadBool3;
                this.f1326at = ReadInt2;
            }
        }
        if (reader.m1310b() >= 90 && reader.m1306c() >= 149) {
            String ReadString = reader.ReadString();
            int ReadInt3 = reader.ReadInt();
            if (!z) {
                this.f1339O = ReadString;
                this.f1340P = ReadInt3;
            }
        }
        if (reader.m1310b() >= 93 && reader.m1306c() >= 156) {
            Integer ReadInt1 = reader.ReadInt1();
            Integer ReadInt12 = reader.ReadInt1();
            Integer ReadInt13 = reader.ReadInt1();
            Integer ReadInt14 = reader.ReadInt1();
            int ReadInt4 = reader.ReadInt();
            if (!z) {
                if (this.f1320y != ReadInt1) {
                    m5047c("readIn aiDifficultyOverride was:" + this.f1320y + " now:  " + ReadInt1);
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
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.m1398d("Writing team: " + this.f1316u);
        m5064b(streamWriter);
        if (streamWriter.m1394g() >= 44) {
            streamWriter.m1401c(4);
            streamWriter.mo1329a(this.f1330F);
            streamWriter.mo1329a(this.f1329E);
            streamWriter.mo1329a(true);
            if (1 != 0) {
                m5040d(streamWriter);
            }
            this.f1358ak.m4012a(streamWriter);
            C0448g.m3959a(this.f1357aj, streamWriter);
            streamWriter.mo1329a(this.f1319x);
        }
    }

    /* renamed from: c */
    public void m5048c(Reader reader) {
        m5063b(reader);
        if (reader.m1310b() >= 26) {
            byte m1304d = reader.m1304d();
            this.f1330F = reader.ReadBool();
            if (m1304d >= 1) {
                this.f1329E = reader.ReadBool();
            }
            if (reader.ReadBool()) {
                m5039d(reader);
            }
            if (m1304d >= 2) {
                this.f1358ak.m4011a(reader);
            }
            if (m1304d >= 3) {
                m5086a(C0448g.m3958a(reader));
            }
            if (m1304d >= 4) {
                this.f1319x = reader.ReadBool();
            }
        }
    }

    /* renamed from: d */
    public void m5040d(StreamWriter streamWriter) {
        Core.m1087A();
        streamWriter.m1398d("-- Saving fog --");
        streamWriter.mo1329a(this.f1337M != null);
        if (this.f1337M != null) {
            streamWriter.WriteInteger(this.f1335K);
            streamWriter.WriteInteger(this.f1336L);
            for (int i = 0; i < this.f1335K; i++) {
                for (int i2 = 0; i2 < this.f1336L; i2++) {
                    streamWriter.m1401c(this.f1337M[i][i2]);
                }
            }
        }
        streamWriter.m1398d("--End fog--");
    }

    /* renamed from: d */
    public void m5039d(Reader reader) {
        Core m1087A = Core.m1087A();
        if (reader.ReadBool()) {
            this.f1335K = reader.ReadInt();
            this.f1336L = reader.ReadInt();
            int i = this.f1335K;
            int i2 = this.f1336L;
            if (m1087A.f6110bL != null) {
                i = m1087A.f6110bL.f792C;
                i2 = m1087A.f6110bL.f793D;
                if (this.f1335K != i || this.f1336L != i2) {
                    Core.m998b("Map size does not match fog size: " + this.f1335K + "!=" + i + "|" + this.f1336L + "!=" + i2);
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
                        this.f1337M[i3][i4] = reader.m1304d();
                    } else {
                        reader.m1304d();
                    }
                }
            }
            return;
        }
        this.f1337M = null;
    }

    /* renamed from: a */
    public void m5095a() {
        if (this.f1337M != null) {
            for (int i = 0; i < this.f1335K; i++) {
                for (int i2 = 0; i2 < this.f1336L; i2++) {
                    this.f1337M[i][i2] = 0;
                }
            }
        }
        Core m1087A = Core.m1087A();
        if (m1087A.f6099bs == this) {
            m1087A.f6121bW.f5320O = true;
            if (m1087A.f6110bL != null) {
                m1087A.f6110bL.m5279k();
                m1087A.f6110bL.m5284g();
            }
        }
    }

    /* renamed from: b */
    public boolean m5074b() {
        return this.f1312q == -3;
    }

    /* renamed from: a */
    public static ArrayList m5076a(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1368f; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && (z || abstractC0197n.m5074b())) {
                arrayList.add(abstractC0197n);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList m5058c() {
        return m5059b(false);
    }

    /* renamed from: b */
    public static ArrayList m5059b(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1368f; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && (z || !abstractC0197n.m5074b())) {
                arrayList.add(abstractC0197n);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static AbstractC0197n[] m5045d() {
        return f1364b;
    }

    /* renamed from: e */
    public static void m5036e() {
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
    public static ArrayList m5031f() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && !abstractC0197n.m5074b()) {
                arrayList.add(Integer.valueOf(abstractC0197n.f1312q));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m5092a(int i, boolean z) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1365c; i3++) {
            AbstractC0197n abstractC0197n = f1372ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && !abstractC0197n.m5074b() && (!z || !abstractC0197n.f1317v)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: g */
    public static int m5028g() {
        int i = 0;
        for (int i2 = 0; i2 < f1365c; i2++) {
            AbstractC0197n abstractC0197n = f1372ar[i2];
            if (abstractC0197n != null && !abstractC0197n.m5074b() && !abstractC0197n.f1329E && !abstractC0197n.f1330F) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m5071b(int i, boolean z) {
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
    public static String m5093a(int i) {
        return i == 0 ? "A" : i == 1 ? "B" : i == 2 ? "C" : i == 3 ? "D" : i == 4 ? "E" : i == 5 ? "F" : i == 6 ? "G" : i == 7 ? "H" : i == 8 ? "I" : i == 9 ? "J" : i == 10 ? "K" : i == -3 ? "S" : VariableScope.nullOrMissingString + i;
    }

    /* renamed from: h */
    public String m5025h() {
        return m5093a(this.f1312q);
    }

    /* renamed from: i */
    public void m5022i() {
        this.f1327D = false;
        this.f1325as = false;
        this.f1326at = -9999;
    }

    /* renamed from: j */
    public boolean m5020j() {
        return this.f1327D;
    }

    /* renamed from: k */
    public boolean m5018k() {
        return this.f1326at >= 0;
    }

    /* renamed from: l */
    public void m5016l() {
        this.f1326at = Core.m1087A().f6102by;
    }

    /* renamed from: m */
    public boolean m5015m() {
        Core m1087A = Core.m1087A();
        if (((this.f1329E || this.f1330F) && !m1087A.f6122bX.f5603aO.f5652l) || this.f1317v || m5002z() || this.f1351aa) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m5072b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1365c; i3++) {
            AbstractC0197n abstractC0197n = f1372ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && abstractC0197n.m5018k() && abstractC0197n.m5015m()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m5056c(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1365c; i3++) {
            AbstractC0197n abstractC0197n = f1372ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && abstractC0197n.m5015m()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: n */
    public static void m5014n() {
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.m5098V();
            }
        }
        m5099U();
    }

    /* renamed from: o */
    public static void m5013o() {
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.f1326at = -9999;
            }
        }
    }

    /* renamed from: d */
    public static void m5043d(int i) {
        Core m1087A = Core.m1087A();
        if (!m1087A.f6122bX.IsServer || m1087A.f6126cb.m2464h()) {
            return;
        }
        for (int i2 = 0; i2 < f1365c; i2++) {
            AbstractC0197n abstractC0197n = f1372ar[i2];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && !abstractC0197n.f1325as) {
                abstractC0197n.f1325as = true;
                C0749e m2420b = m1087A.f6130cf.m2420b();
                m2420b.f4846i = abstractC0197n;
                m2420b.f4856r = true;
                m2420b.f4859u = 100;
                m1087A.f6122bX.m1608a(m2420b);
            }
        }
    }

    /* renamed from: e */
    public static void m5034e(int i) {
        AbstractC0197n[] abstractC0197nArr;
        int i2 = -9999;
        for (int i3 = 0; i3 < f1365c; i3++) {
            AbstractC0197n abstractC0197n = f1372ar[i3];
            if (abstractC0197n != null && abstractC0197n.f1312q == i && abstractC0197n.m5018k() && abstractC0197n.m5015m() && abstractC0197n.f1326at > i2) {
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
    public boolean m5070b(AbstractC0197n abstractC0197n) {
        if (m5012p() && abstractC0197n != null && m5042d(abstractC0197n)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m5012p() {
        if (this.f1332H || this.f1333I) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m5011q() {
        if (Core.m1087A().f6099bs == this) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m5046c(boolean z) {
        if (z) {
            this.f1340P = 1;
        } else {
            this.f1340P = 0;
        }
    }

    /* renamed from: r */
    public boolean m5010r() {
        return this.f1340P == 1;
    }

    /* renamed from: a */
    public final int m5075a(boolean z, boolean z2) {
        C0202s c0202s = this.f1343S;
        int i = c0202s.f1401c;
        if (z) {
            i += c0202s.f1404f;
        }
        if (z2) {
            i += c0202s.f1403e;
        }
        return i;
    }

    /* renamed from: s */
    public final int m5009s() {
        return this.f1343S.f1401c + this.f1343S.f1404f + this.f1343S.f1403e;
    }

    /* renamed from: a */
    public final int m5087a(C0448g c0448g, boolean z, boolean z2) {
        C0202s c0202s = this.f1343S;
        if (c0202s.f1402d == 0) {
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
            c0199p = c0202s.m5000a(c0448g);
            if (c0199p.f1389e > 50) {
                c0203t.m4994a(c0199p);
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
    public boolean m5008t() {
        boolean z = false;
        C0202s m5032e = m5032e(false);
        if (this.f1343S.f1400b != m5032e.f1400b) {
            Core.m998b("unitCountExcludingBuildingsIncludingQueued: " + this.f1343S.f1400b + "!=" + m5032e.f1400b + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1407a != m5032e.f1407a) {
            Core.m998b("unitsMax: " + this.f1343S.f1407a + "!=" + m5032e.f1407a + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1405g != m5032e.f1405g) {
            Core.m998b("incomeRate: " + this.f1343S.f1405g + "!=" + m5032e.f1405g + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1404f != m5032e.f1404f) {
            Core.m998b("incompleteUnitCountOfAllTypes: " + this.f1343S.f1404f + "!=" + m5032e.f1404f + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1403e != m5032e.f1403e) {
            Core.m998b("queuedCountOfAllTypes: " + this.f1343S.f1403e + "!=" + m5032e.f1403e + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (this.f1343S.f1401c != m5032e.f1401c) {
            Core.m998b("unitCountOfAllTypesOnlyCompleted: " + this.f1343S.f1401c + "!=" + m5032e.f1401c + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            this.f1353ac++;
            z = true;
        }
        if (!this.f1343S.f1408h.m3988e(m5032e.f1408h)) {
            Core.m998b("customIncomeRate: " + this.f1343S.f1408h + "!=" + m5032e.f1408h + " (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            Core.m998b("currentCaches:" + this.f1343S.f1408h.m4010a(false, true, 30, true, true));
            Core.m998b("targetUnitCache:" + m5032e.f1408h.m4010a(false, true, 30, true, true));
            this.f1353ac++;
            z = true;
        }
        if (!this.f1343S.f1412l.m3988e(m5032e.f1412l)) {
            Core.m998b("streamingRateNegative (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            Core.m998b("currentCaches:" + this.f1343S.f1412l.m4010a(false, true, 30, true, true));
            Core.m998b("targetUnitCache:" + m5032e.f1412l.m4010a(false, true, 30, true, true));
            this.f1353ac++;
            z = true;
        }
        if (!this.f1343S.f1411k.m3988e(m5032e.f1411k)) {
            Core.m998b("streamingRatePositive (team:" + this.f1306k + " fails: " + this.f1353ac + ")");
            Core.m998b("currentCaches:" + this.f1343S.f1411k.m4010a(false, true, 30, true, true));
            Core.m998b("targetUnitCache:" + m5032e.f1411k.m4010a(false, true, 30, true, true));
            this.f1353ac++;
            z = true;
        }
        if (z) {
        }
        return z;
    }

    /* renamed from: e */
    private C0202s m5032e(boolean z) {
        Core m1087A = Core.m1087A();
        C0202s c0202s = new C0202s();
        c0202s.f1407a = m1087A.f6105bB;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this) {
                c0202s.m5001a(abstractC0244am);
                if (z) {
                    abstractC0244am.f1610bW = true;
                }
            }
        }
        if (c0202s.f1407a > m1087A.f6106bC) {
            c0202s.f1407a = m1087A.f6106bC;
        }
        return c0202s;
    }

    /* renamed from: d */
    public void m5037d(boolean z) {
        if (!z && !this.f1342R) {
            return;
        }
        this.f1343S = m5032e(true);
        this.f1342R = false;
        if (this.f1341Q < this.f1343S.f1400b) {
            this.f1341Q = this.f1343S.f1400b;
        }
        if (!this.f1309n && this.f1343S.f1406m) {
            this.f1309n = true;
        }
        if (!this.f1308m && m5009s() > 0) {
            this.f1308m = true;
        }
        m5103Q();
    }

    /* renamed from: a */
    public int m5088a(C0428a c0428a) {
        return 0 - ((int) this.f1343S.f1412l.m4022a(c0428a));
    }

    /* renamed from: b */
    public int m5068b(C0428a c0428a) {
        int m4022a;
        if (c0428a == C0428a.f2762B) {
            m4022a = this.f1343S.f1405g;
        } else {
            m4022a = (int) this.f1343S.f1408h.m4022a(c0428a);
        }
        int m4022a2 = m4022a + ((int) this.f1343S.f1411k.m4022a(c0428a));
        Core.m1087A();
        boolean z = false;
        if (c0428a == C0428a.f2762B) {
            z = true;
        }
        if (z) {
            m4022a2 = (int) (m4022a2 * m5118B());
        }
        return m4022a2;
    }

    /* renamed from: u */
    public int m5007u() {
        return this.f1343S.f1400b;
    }

    /* renamed from: v */
    public int m5006v() {
        return this.f1343S.f1407a;
    }

    /* renamed from: w */
    public String m5005w() {
        int m5003y = m5003y();
        if (m5003y == -99) {
            return VariableScope.nullOrMissingString;
        }
        if (this.f1317v) {
            return VariableScope.nullOrMissingString;
        }
        if (m5003y == -2 || m5003y == -1) {
            return "(disconnected)";
        }
        return "(" + m5003y + ")";
    }

    /* renamed from: x */
    public String m5004x() {
        int m5003y = m5003y();
        if (m5003y == -99) {
            return "HOST";
        }
        if (this.f1317v) {
            return "-";
        }
        if (m5003y == -1) {
            return "N/A";
        }
        if (m5003y == -2) {
            return "-";
        }
        if (m5010r()) {
            return m5003y + " (HOST)";
        }
        return VariableScope.nullOrMissingString + m5003y;
    }

    /* renamed from: y */
    public int m5003y() {
        if (this.f1347W == -1) {
            return -2;
        }
        if (this.f1347W < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f1346V;
    }

    /* renamed from: z */
    public boolean m5002z() {
        if (this.f1347W != -1 && this.f1347W < System.currentTimeMillis() - 15000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo4993a(float f) {
        this.f1360am += f;
        if (this.f1360am > 90.0f) {
            this.f1360am = 0.0f;
            this.f1359al.m4036a();
        }
    }

    /* renamed from: A */
    public final int m5119A() {
        if (this.f1319x) {
            return this.f1318w;
        }
        Core m1087A = Core.m1087A();
        if ((m1087A.f6122bX.lock1 || m1087A.f6126cb.m2465g()) && !m1087A.f6122bX.f5571F) {
            if (this.f1320y != null && this.f1320y.intValue() != this.f1318w) {
                m5047c("aiDifficultyOverride:  " + this.f1320y + "!=" + this.f1318w);
            }
            return this.f1318w;
        } else if (this.f1320y != null) {
            return this.f1320y.intValue();
        } else {
            return Core.m1087A().settingEngine.aiDifficulty;
        }
    }

    /* renamed from: B */
    public final float m5118B() {
        Core m1087A = Core.m1087A();
        if (m1087A.m1074N()) {
            return m1087A.f6122bX.f5603aO.f5661h;
        }
        return 1.0f;
    }

    /* renamed from: C */
    public final float m5117C() {
        float f;
        if (!this.f1317v) {
            return 1.0f;
        }
        int m5119A = m5119A();
        if (m5119A > 0) {
            f = 1.0f + (m5119A * 0.4f);
        } else {
            f = 1.0f + (m5119A * 0.3f);
        }
        if (m5119A == 3) {
            f += 1.5f;
        }
        if (f < 0.1f) {
            f = 0.1f;
        }
        return f;
    }

    /* renamed from: b */
    public final void m5073b(float f) {
        if (!this.f1317v) {
            m5057c(f);
        } else {
            m5057c(m5117C() * f);
        }
    }

    /* renamed from: c */
    public final void m5057c(float f) {
        m5044d(f * m5118B());
    }

    /* renamed from: d */
    public final void m5044d(float f) {
        this.f1310o += f;
        if (this.f1310o > 9.99999999E8d) {
            this.f1310o = 9.99999999E8d;
        }
    }

    /* renamed from: D */
    public static void m5116D() {
        try {
            m5071b(10, true);
            for (int i = 0; i < f1372ar.length; i++) {
                f1372ar[i] = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C0187e m5077a(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            Core.m998b("findExistingPlayer: No clientId id");
            return null;
        }
        for (int i = 0; i < f1372ar.length; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && str.equals(abstractC0197n.f1338N)) {
                if (abstractC0197n instanceof C0187e) {
                    return (C0187e) abstractC0197n;
                }
                Core.m998b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C0187e m5060b(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            Core.m998b("No id");
            return null;
        }
        for (int i = 0; i < f1372ar.length; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && str.equals(abstractC0197n.f1339O)) {
                if (abstractC0197n instanceof C0187e) {
                    return (C0187e) abstractC0197n;
                }
                Core.m998b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: E */
    public static int m5115E() {
        for (int i = 0; i < f1365c; i++) {
            if (f1372ar[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: F */
    public static int m5114F() {
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
    public void m5113G() {
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
        this.f1313r = C0618t.m3071a(this);
        this.f1314s = C0618t.m3071a(this);
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
        m5055c(i, z);
    }

    /* renamed from: f */
    public void m5029f(int i) {
        m5055c(i, true);
    }

    /* renamed from: c */
    public void m5055c(int i, boolean z) {
        if (this.f1306k != i) {
            if (z) {
                m5113G();
            }
            this.f1306k = i;
            this.f1312q = i;
            if (z && i != -3) {
                AbstractC0197n abstractC0197n = f1372ar[i];
                if (abstractC0197n != null) {
                    abstractC0197n.m5047c("Being replaced");
                }
                f1372ar[i] = this;
            }
            int m5112H = m5112H();
            this.f1354ad.m5908b(m5112H);
            this.f1355ae.m5908b(Color.m5948a(Color.m5950a(m5112H), (int) (Color.m5946b(m5112H) * 0.5f), (int) (Color.m5945c(m5112H) * 0.5f), (int) (Color.m5944d(m5112H) * 0.5f)));
        }
    }

    /* renamed from: a */
    public boolean m5094a(double d) {
        if (this.f1310o >= d || d == 0.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m5026g(int i) {
        if (this.f1310o + this.f1311p >= i || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m5054c(AbstractC0197n abstractC0197n) {
        return (abstractC0197n == f1371i || this == f1371i || this.f1312q == abstractC0197n.f1312q) ? false : true;
    }

    /* renamed from: d */
    public final boolean m5042d(AbstractC0197n abstractC0197n) {
        if (abstractC0197n == f1371i && this == f1371i) {
            return true;
        }
        return (abstractC0197n == f1371i || this == f1371i || this.f1312q != abstractC0197n.f1312q) ? false : true;
    }

    /* renamed from: H */
    public int m5112H() {
        return m5021i(m5105O());
    }

    /* renamed from: I */
    public static void m5111I() {
        Core m1087A = Core.m1087A();
        try {
            m5038d(m1087A.settingEngine.teamColors);
        } catch (IllegalArgumentException e) {
            Core.m1041a("initColors: Failed to read setting: '" + m1087A.settingEngine.teamColors + "': " + e.getMessage(), (Throwable) e);
            m5038d("#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4");
        }
        try {
            m5033e(m1087A.settingEngine.teamColorsNames);
        } catch (IllegalArgumentException e2) {
            Core.m1041a("initColors: Failed to read setting: '" + m1087A.settingEngine.teamColorsNames + "': " + e2.getMessage(), (Throwable) e2);
            m5033e("GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE");
        }
    }

    /* renamed from: d */
    private static void m5038d(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 hex colors");
        }
        for (int i = 0; i < 10; i++) {
            f1374af[i] = Color.m5947a(split[i]);
        }
    }

    /* renamed from: e */
    private static void m5033e(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 team color names");
        }
        for (int i = 0; i < 10; i++) {
            f1375ag[i] = split[i];
        }
    }

    /* renamed from: J */
    public int m5110J() {
        if (this.f1312q == -3) {
            return m5021i(-3);
        }
        return m5023h(this.f1306k);
    }

    /* renamed from: h */
    public static int m5023h(int i) {
        if (i >= f1365c) {
            return m5021i(-3);
        }
        return m5021i(i % 2);
    }

    /* renamed from: i */
    public static int m5021i(int i) {
        if (i >= 0 && i < 10) {
            return f1374af[i];
        }
        if (i == -3) {
            return Color.m5948a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 90, 90, 90);
        }
        return -7829368;
    }

    /* renamed from: K */
    public String m5109K() {
        if (this.f1306k == -1 || this.f1306k == -2) {
            return "GRAY";
        }
        return m5019j(m5105O());
    }

    /* renamed from: j */
    public static String m5019j(int i) {
        if (i >= 0 && i < 10) {
            return f1375ag[i];
        }
        return "GRAY";
    }

    /* renamed from: a */
    public static C0934e[] m5082a(C0934e c0934e) {
        return m5080a(c0934e, EnumC0198o.f1379a, false);
    }

    /* renamed from: a */
    public static C0934e[] m5080a(C0934e c0934e, EnumC0198o enumC0198o, boolean z) {
        if (!z || c0934e.mo394A()) {
            return m5062b(c0934e, enumC0198o);
        }
        return m5081a(c0934e, enumC0198o);
    }

    /* renamed from: a */
    public static C0934e[] m5081a(C0934e c0934e, EnumC0198o enumC0198o) {
        C0934e[] c0934eArr = new C0934e[10];
        if ((Core.f6205aU && !Core.f6207aW) || enumC0198o == EnumC0198o.f1383e) {
            for (int i = 0; i < c0934eArr.length; i++) {
                c0934eArr[i] = c0934e;
            }
            return c0934eArr;
        }
        C0934e[] m898a = c0934e.m898a(enumC0198o);
        if (m898a != null) {
            return m898a;
        }
        C0727bl c0727bl = Core.m1087A().f6128cd;
        c0727bl.m2436a(EnumC0729bm.f4606D);
        for (int i2 = 0; i2 < c0934eArr.length; i2++) {
            int m5021i = m5021i(i2);
            if (i2 == 0) {
                c0934eArr[i2] = c0934e;
            } else {
                c0934eArr[i2] = new C0937h(c0934e, m5021i, enumC0198o, i2);
            }
        }
        c0727bl.m2431b(EnumC0729bm.f4606D);
        c0934e.m897a(enumC0198o, c0934eArr);
        return c0934eArr;
    }

    /* renamed from: b */
    public static C0934e[] m5062b(C0934e c0934e, EnumC0198o enumC0198o) {
        C0934e[] c0934eArr = new C0934e[10];
        if ((Core.f6205aU && !Core.f6207aW) || enumC0198o == EnumC0198o.f1383e || c0934e.mo394A()) {
            for (int i = 0; i < c0934eArr.length; i++) {
                c0934eArr[i] = c0934e;
            }
            return c0934eArr;
        }
        C0934e[] m898a = c0934e.m898a(enumC0198o);
        if (m898a != null) {
            return m898a;
        }
        C0727bl c0727bl = Core.m1087A().f6128cd;
        c0727bl.m2436a(EnumC0729bm.f4606D);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = m5021i(i2);
            iArr2[i2] = i2;
        }
        for (int i3 = 0; i3 < c0934eArr.length; i3++) {
            if (i3 != 0) {
                c0934eArr[i3] = c0934e.mo54h();
                c0934eArr[i3].m895a("color(" + i3 + "):" + c0934e.mo64a());
                c0934eArr[i3].mo52j();
            }
        }
        c0934e.mo52j();
        if (enumC0198o == EnumC0198o.f1380b) {
            m5061b(c0934e, c0934eArr, iArr);
        } else if (enumC0198o == EnumC0198o.f1382d) {
            m5078a(c0934e, c0934eArr, iArr, iArr2);
        } else {
            m5079a(c0934e, c0934eArr, iArr);
        }
        for (int i4 = 0; i4 < c0934eArr.length; i4++) {
            if (c0934eArr[i4] != null) {
                c0934eArr[i4].mo48p();
                c0934eArr[i4].mo45s();
            }
        }
        c0934e.mo46r();
        c0934eArr[0] = c0934e;
        c0727bl.m2431b(EnumC0729bm.f4606D);
        c0934e.m897a(enumC0198o, c0934eArr);
        return c0934eArr;
    }

    /* renamed from: a */
    public static void m5079a(C0934e c0934e, C0934e[] c0934eArr, int[] iArr) {
        int m937b;
        int mo386m = c0934e.mo386m();
        int mo387l = c0934e.mo387l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m5946b(iArr[i]);
            iArr3[i] = Color.m5945c(iArr[i]);
            iArr4[i] = Color.m5944d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo387l; i2++) {
            for (int i3 = 0; i3 < mo386m; i3++) {
                int mo63a = c0934e.mo63a(i3, i2);
                int m946a = C0924aa.m946a(mo63a);
                if (m946a == 0) {
                    if (mo63a != 0) {
                        for (int i4 = 0; i4 < c0934eArr.length; i4++) {
                            if (c0934eArr[i4] != null) {
                                c0934eArr[i4].mo62a(i3, i2, 0);
                            }
                        }
                    }
                } else {
                    int m936c = C0924aa.m936c(mo63a);
                    if (m936c > 0 && (m937b = C0924aa.m937b(mo63a)) == C0924aa.m935d(mo63a)) {
                        if (m937b == 0) {
                            for (int i5 = 0; i5 < c0934eArr.length; i5++) {
                                if (c0934eArr[i5] != null) {
                                    c0934eArr[i5].mo62a(i3, i2, Color.m5948a(m946a, (iArr2[i5] * m936c) >> 8, (iArr3[i5] * m936c) >> 8, (iArr4[i5] * m936c) >> 8));
                                }
                            }
                        } else if (m936c != m937b) {
                            float f = (m936c * 0.003921569f) - (m937b * 0.003921569f);
                            for (int i6 = 0; i6 < c0934eArr.length; i6++) {
                                if (c0934eArr[i6] != null) {
                                    c0934eArr[i6].mo62a(i3, i2, Color.m5948a(m946a, C0758f.m2153b((int) (m937b + (iArr2[i6] * f)), 0, 255), C0758f.m2153b((int) (m937b + (iArr3[i6] * f)), 0, 255), C0758f.m2153b((int) (m937b + (iArr4[i6] * f)), 0, 255)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5078a(C0934e c0934e, C0934e[] c0934eArr, int[] iArr, int[] iArr2) {
        int m5944d;
        int mo386m = c0934e.mo386m();
        int mo387l = c0934e.mo387l();
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        int[] iArr5 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr3[i] = Color.m5946b(iArr[i]);
            iArr4[i] = Color.m5945c(iArr[i]);
            iArr5[i] = Color.m5944d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo387l; i2++) {
            for (int i3 = 0; i3 < mo386m; i3++) {
                int mo63a = c0934e.mo63a(i3, i2);
                int m5950a = Color.m5950a(mo63a);
                if (m5950a == 0) {
                    if (Color.m5946b(mo63a) > 0 || Color.m5945c(mo63a) > 0 || Color.m5944d(mo63a) > 0) {
                        for (int i4 = 0; i4 < c0934eArr.length; i4++) {
                            if (c0934eArr[i4] != null) {
                                c0934eArr[i4].mo62a(i3, i2, Color.m5948a(0, 0, 0, 0));
                            }
                        }
                    }
                } else {
                    int m5945c = Color.m5945c(mo63a);
                    int m5946b = Color.m5946b(mo63a);
                    float m2132c = C0758f.m2132c(C0758f.m2132c(m5946b, m5945c), Color.m5944d(mo63a));
                    float m2108f = C0758f.m2108f(C0758f.m2108f(C0758f.m2122d(m5946b - m5945c), C0758f.m2122d(m5945c - m5944d)), C0758f.m2122d(m5944d - m5946b));
                    if (m2108f > 15.0f) {
                        for (int i5 = 0; i5 < c0934eArr.length; i5++) {
                            if (c0934eArr[i5] != null) {
                                float f = m2108f / 255.0f;
                                c0934eArr[i5].mo62a(i3, i2, Color.m5948a(m5950a, C0758f.m2153b((int) (m2132c + (iArr3[i5] * f)), 0, 255), C0758f.m2153b((int) (m2132c + (iArr4[i5] * f)), 0, 255), C0758f.m2153b((int) (m2132c + (iArr5[i5] * f)), 0, 255)));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m5061b(C0934e c0934e, C0934e[] c0934eArr, int[] iArr) {
        int mo386m = c0934e.mo386m();
        int mo387l = c0934e.mo387l();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m5946b(iArr[i]);
            iArr3[i] = Color.m5945c(iArr[i]);
            iArr4[i] = Color.m5944d(iArr[i]);
        }
        for (int i2 = 0; i2 < mo386m; i2++) {
            for (int i3 = 0; i3 < mo387l; i3++) {
                int mo63a = c0934e.mo63a(i2, i3);
                int m5950a = Color.m5950a(mo63a);
                if (m5950a > 0) {
                    int m5946b = Color.m5946b(mo63a);
                    int m5945c = Color.m5945c(mo63a);
                    int m5944d = Color.m5944d(mo63a);
                    for (int i4 = 0; i4 < c0934eArr.length; i4++) {
                        int i5 = (int) (m5946b + (iArr2[i4] * 0.15f));
                        int i6 = (int) (m5945c + (iArr3[i4] * 0.15f));
                        int i7 = (int) (m5944d + (iArr4[i4] * 0.15f));
                        int m2153b = C0758f.m2153b(i5, 0, 255);
                        int m2153b2 = C0758f.m2153b(i6, 0, 255);
                        int m2153b3 = C0758f.m2153b(i7, 0, 255);
                        if (c0934eArr[i4] != null) {
                            c0934eArr[i4].mo62a(i2, i3, Color.m5948a(m5950a, m2153b, m2153b2, m2153b3));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static AbstractC0197n m5017k(int i) {
        if (i == -1) {
            return f1371i;
        }
        if (i == -2) {
            return f1370h;
        }
        if (i >= f1368f) {
            Core.m973g("team index too high: " + i);
            return null;
        } else if (i < 0) {
            Core.m973g("team index too low: " + i);
            return null;
        } else {
            return f1372ar[i];
        }
    }

    /* renamed from: e */
    public void m5035e(float f) {
        Core m1087A = Core.m1087A();
        if (this.f1356ah > 0) {
            this.f1356ah--;
            return;
        }
        if (this.f1356ah == -2) {
            this.f1356ah = this.f1306k;
        } else {
            this.f1356ah = 10;
        }
        if (!this.f1330F && !m1087A.f6126cb.m2464h()) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = m1087A.f6122bX.f5603aO.f5652l;
            boolean z5 = false;
            AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
            int size = AbstractC0244am.f1590bD.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m498a[i];
                if (abstractC0244am.f1609bV == this) {
                    if (!abstractC0244am.m4715cS()) {
                        z = true;
                        if (!this.f1329E && (abstractC0244am.m4757bJ() || abstractC0244am.m4769ak())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z5 = true;
                    }
                } else if (z4 && abstractC0244am.f1609bV != null && abstractC0244am.f1609bV.m5042d(this) && !abstractC0244am.m4715cS()) {
                    z3 = true;
                }
            }
            if (!z && !z3) {
                boolean z6 = false;
                if (z5 && m1087A.f6239bx < 100 && m1087A.f6100bv) {
                    z6 = true;
                }
                this.f1330F = true;
                m5095a();
                Iterator it = AbstractC0244am.f1590bD.iterator();
                while (it.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
                    if (abstractC0244am2.f1609bV == this && !abstractC0244am2.mo1756u()) {
                        if (z6 && !abstractC0244am2.f1607bT && abstractC0244am2.m4715cS()) {
                            InterfaceC0303as mo1758r = abstractC0244am2.mo1758r();
                            String str = abstractC0244am2.m4733cA() + " Warning: This unit got ignored in defeated check and now being removed";
                            if ((mo1758r instanceof C0453l) && ((C0453l) mo1758r).f2956aN) {
                                str = str + " (Likely due to canNotBeDirectlyAttacked:true)";
                            }
                            C0831ad.m1588a((String) null, str);
                        }
                        abstractC0244am2.m4699ci();
                    }
                }
                m1087A.f6122bX.m1484i(this);
            }
            if (!z2 && !this.f1329E && !this.f1330F) {
                this.f1329E = true;
                m1087A.f6122bX.m1490h(this);
            }
        }
    }

    /* renamed from: a */
    public void m5085a(AbstractC0623y abstractC0623y) {
    }

    /* renamed from: b */
    public static void m5065b(AbstractC0623y abstractC0623y) {
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.m5085a(abstractC0623y);
            }
        }
    }

    /* renamed from: a */
    public static void m5089a(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1609bV != null && abstractC0244am.f1610bW && abstractC0244am.f1598bK) {
            AbstractC0197n abstractC0197n = abstractC0244am.f1609bV;
            abstractC0244am.f1610bW = false;
            abstractC0197n.f1343S.m4998b(abstractC0244am);
            abstractC0244am.m4672dh();
        }
    }

    /* renamed from: b */
    public static void m5069b(AbstractC0244am abstractC0244am) {
        m5089a(abstractC0244am);
    }

    /* renamed from: c */
    public static void m5053c(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1609bV != null && !abstractC0244am.f1610bW && abstractC0244am.f1598bK && !abstractC0244am.f1607bT) {
            abstractC0244am.f1610bW = true;
            AbstractC0197n abstractC0197n = abstractC0244am.f1609bV;
            abstractC0197n.f1343S.m5001a(abstractC0244am);
            abstractC0244am.m4673dg();
            if (!abstractC0197n.f1309n && abstractC0197n.f1343S.f1406m) {
                abstractC0197n.f1309n = true;
            }
            if (!abstractC0197n.f1308m) {
                abstractC0197n.f1308m = true;
            }
            abstractC0197n.m5103Q();
        }
    }

    /* renamed from: L */
    public static void m5108L() {
        f1371i.f1342R = true;
        f1370h.f1342R = true;
        Iterator it = m5058c().iterator();
        while (it.hasNext()) {
            ((AbstractC0197n) it.next()).f1342R = true;
        }
    }

    /* renamed from: M */
    public static void m5107M() {
        if (Core.m1087A().m1076L()) {
            Core.LogDebug2("Skipping updateAllCachesFromChangedMetadata due to desync risk");
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
    public static void m5030f(float f) {
        int m5072b;
        Core m1087A = Core.m1087A();
        f1371i.mo4993a(f);
        f1370h.mo4993a(f);
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null) {
                abstractC0197n.mo4993a(f);
                abstractC0197n.m5035e(f);
                if (!abstractC0197n.f1325as && (m5072b = m5072b(abstractC0197n.f1312q)) > 0) {
                    if (m5072b >= m5056c(abstractC0197n.f1312q)) {
                        m5043d(abstractC0197n.f1312q);
                        m5013o();
                    } else {
                        m5034e(abstractC0197n.f1312q);
                    }
                }
                if (abstractC0197n.f1327D) {
                    if (abstractC0197n.f1328au < 0) {
                        abstractC0197n.f1328au = m1087A.f6102by;
                    }
                    if (!abstractC0197n.f1330F) {
                        int i2 = 0;
                        Iterator it = AbstractC0244am.f1590bD.iterator();
                        while (it.hasNext()) {
                            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                            if (abstractC0244am.f1609bV == abstractC0197n && !abstractC0244am.mo1756u()) {
                                boolean z = false;
                                int i3 = 1;
                                if (C1117y.m475a(abstractC0197n.f1328au, 16000)) {
                                    z = true;
                                    i3 = 50;
                                } else if (C1117y.m475a(abstractC0197n.f1328au, 6000)) {
                                    z = C0758f.m2189a(abstractC0244am, 0, 100) > 90;
                                    i3 = 20;
                                } else if (C1117y.m475a(abstractC0197n.f1328au, 2000)) {
                                    z = C0758f.m2189a(abstractC0244am, 0, 100) > 98;
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
        if (m1087A.m1073O() && m1087A.settingEngine.aiDifficulty != f1376ai) {
            m1087A.f6122bX.m1557aq();
            f1376ai = m1087A.settingEngine.aiDifficulty;
        }
    }

    /* renamed from: g */
    public static void m5027g(float f) {
        m5036e();
        for (AbstractC0197n abstractC0197n : m5045d()) {
            abstractC0197n.m5037d(false);
        }
    }

    /* renamed from: N */
    public static void m5106N() {
        f1371i.m5037d(false);
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && !abstractC0197n.m5074b() && !abstractC0197n.f1330F && !abstractC0197n.f1329E && !abstractC0197n.f1327D) {
                Core.m1087A().f6122bX.m1496g(abstractC0197n);
            }
        }
    }

    /* renamed from: h */
    public static void m5024h(float f) {
        for (int i = 0; i < f1365c; i++) {
            AbstractC0197n abstractC0197n = f1372ar[i];
            if (abstractC0197n != null && (abstractC0197n instanceof C0136a)) {
                ((C0136a) abstractC0197n).m5522i(f);
            }
        }
    }

    /* renamed from: O */
    public int m5105O() {
        if (this.f1324C == -1) {
            return m5104P();
        }
        return this.f1324C;
    }

    /* renamed from: P */
    public int m5104P() {
        AbstractC0197n abstractC0197n;
        if (this.f1306k == -1 || this.f1306k == -2) {
            return 5;
        }
        int i = this.f1306k;
        if (i >= 10) {
            i %= 10;
        }
        if (f1365c > 10 && (abstractC0197n = Core.m1087A().f6122bX.f5489z) != null && abstractC0197n != this && abstractC0197n.m5105O() == i) {
            if (i != 5) {
                i = 5;
            } else {
                i = 4;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public void m5103Q() {
    }

    /* renamed from: a */
    public void m5086a(C0449h c0449h) {
        this.f1357aj = c0449h;
    }

    /* renamed from: R */
    public C0449h m5102R() {
        return this.f1357aj;
    }

    /* renamed from: b */
    public void m5066b(C0449h c0449h) {
        C0449h m5102R = m5102R();
        if (m5102R == null || m5102R.m3950b() == 0) {
            m5086a(c0449h);
        } else if (C0448g.m3955b(m5102R, c0449h)) {
        } else {
            C0450i c0450i = new C0450i(m5102R);
            if (c0450i.m3947a(c0449h)) {
                m5086a(c0450i.m3949a());
            }
        }
    }

    /* renamed from: c */
    public void m5050c(C0449h c0449h) {
        C0449h m5102R = m5102R();
        if (m5102R == null || m5102R.m3950b() == 0 || !C0448g.m3960a(c0449h, m5102R)) {
            return;
        }
        C0450i c0450i = new C0450i(m5102R);
        if (c0450i.m3946b(c0449h)) {
            m5086a(c0450i.m3949a());
        }
    }

    /* renamed from: S */
    public C0439f m5101S() {
        return this.f1358ak;
    }

    /* renamed from: c */
    public double m5052c(C0428a c0428a) {
        return this.f1358ak.m4022a(c0428a);
    }

    /* renamed from: a */
    public boolean m5090a(EnumC0200q enumC0200q, AbstractC0197n abstractC0197n) {
        if (enumC0200q == EnumC0200q.f1390a) {
            return abstractC0197n == this;
        } else if (enumC0200q == EnumC0200q.f1395f) {
            return true;
        } else {
            if (enumC0200q == EnumC0200q.f1391b) {
                return m5042d(abstractC0197n);
            }
            if (enumC0200q == EnumC0200q.f1392c) {
                return abstractC0197n != this && m5042d(abstractC0197n);
            } else if (enumC0200q == EnumC0200q.f1393d) {
                return m5054c(abstractC0197n);
            } else {
                if (enumC0200q == EnumC0200q.f1394e) {
                    return abstractC0197n == f1371i;
                } else if (enumC0200q == EnumC0200q.f1396g) {
                    return abstractC0197n != this;
                } else {
                    throw new RuntimeException("Unsupported type: " + enumC0200q);
                }
            }
        }
    }

    /* renamed from: d */
    public void m5041d(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: T */
    public void m5100T() {
        Core.LogDebug2("debugUnitCountByType for team:" + this.f1306k);
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
        Core.LogDebug2("--- Units ---");
        int i2 = 0;
        Iterator it2 = c1101m.iterator();
        while (it2.hasNext()) {
            C0201r c0201r3 = (C0201r) it2.next();
            if (!c0201r3.f1398a.mo4472k()) {
                Core.LogDebug2(c0201r3.f1398a.mo4474i() + " - count:" + c0201r3.f1399b);
                i2 += c0201r3.f1399b;
            }
        }
        Core.LogDebug2("total:" + i2);
        Core.LogDebug2("--- Buildings/Ignored in count ---");
        int i3 = 0;
        Iterator it3 = c1101m.iterator();
        while (it3.hasNext()) {
            C0201r c0201r4 = (C0201r) it3.next();
            if (c0201r4.f1398a.mo4472k()) {
                Core.LogDebug2(c0201r4.f1398a.mo4474i() + " - count:" + c0201r4.f1399b);
                i3 += c0201r4.f1399b;
            }
        }
        Core.LogDebug2("total:" + i3);
    }

    /* renamed from: c */
    public void m5047c(String str) {
        Core.LogDebug2("Team(id: " + this.f1306k + ", name:" + this.f1316u + "):" + str);
    }

    /* renamed from: b */
    public int m5067b(C0448g c0448g, boolean z, boolean z2) {
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
                    i += abstractC0197n.m5075a(z, z2);
                } else {
                    i += abstractC0197n.m5087a(c0448g, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public int m5051c(C0448g c0448g, boolean z, boolean z2) {
        int i = 0;
        AbstractC0197n[] abstractC0197nArr = f1372ar;
        int i2 = f1365c;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC0197n abstractC0197n = abstractC0197nArr[i3];
            if (abstractC0197n != null && this != abstractC0197n && m5042d(abstractC0197n)) {
                if (c0448g == null) {
                    i += abstractC0197n.m5075a(z, z2);
                } else {
                    i += abstractC0197n.m5087a(c0448g, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: U */
    public static void m5099U() {
        f1371i.m5098V();
        f1370h.m5098V();
    }

    /* renamed from: V */
    public void m5098V() {
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
        this.f1359al.m4036a();
        this.f1360am = 0.0f;
        this.f1353ac = 0;
        this.f1341Q = 0;
        this.f1342R = true;
        this.f1343S = new C0202s();
        this.f1357aj = C0448g.f2837d;
        this.f1358ak = new C0439f();
    }

    /* renamed from: W */
    public double m5097W() {
        long currentTimeMillis = System.currentTimeMillis();
        if (C0758f.m2137c((float) (this.f1361ap - currentTimeMillis)) > 166.66666f) {
            this.f1361ap = currentTimeMillis;
            this.f1362aq = this.f1310o;
        }
        return this.f1362aq;
    }

    /* renamed from: X */
    public C0439f m5096X() {
        return m5101S();
    }
}
