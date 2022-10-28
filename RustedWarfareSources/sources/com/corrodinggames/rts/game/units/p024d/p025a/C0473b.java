package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p024d.AbstractC0498i;
import com.corrodinggames.rts.game.units.p024d.C0499j;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b.class */
public class C0473b extends AbstractC0498i {

    /* renamed from: j */
    boolean f3376j;

    /* renamed from: k */
    int f3377k;

    /* renamed from: l */
    AbstractC0478c f3378l;

    /* renamed from: H */
    boolean f3379H;

    /* renamed from: I */
    float f3380I;

    /* renamed from: J */
    float f3381J;

    /* renamed from: dI */
    boolean f3382dI;

    /* renamed from: dJ */
    Rect f3383dJ;

    /* renamed from: g */
    static C0934e f3384g = null;

    /* renamed from: a */
    private static C0934e f3385a = null;

    /* renamed from: b */
    private static C0934e f3386b = null;

    /* renamed from: c */
    private static C0934e f3387c = null;

    /* renamed from: d */
    private static C0934e f3388d = null;

    /* renamed from: e */
    private static C0934e f3389e = null;

    /* renamed from: h */
    static C0934e[] f3390h = new C0934e[10];

    /* renamed from: i */
    static C0934e f3391i = null;

    /* renamed from: t */
    static String f3392t = "gun";

    /* renamed from: u */
    static String f3393u = "gunT2";

    /* renamed from: v */
    static String f3394v = "gunT3";

    /* renamed from: w */
    static String f3395w = "artillery";

    /* renamed from: x */
    static String f3396x = "flamethrower";

    /* renamed from: C */
    static String f3397C = "aa_t1";

    /* renamed from: D */
    static String f3398D = "aa_t2";

    /* renamed from: E */
    static String f3399E = "aa_flak";

    /* renamed from: F */
    static C0934e f3400F = null;

    /* renamed from: G */
    static C0934e[] f3401G = new C0934e[10];

    /* renamed from: dK */
    public static AbstractC0224s f3402dK = new C04741(101);

    /* renamed from: dL */
    public static AbstractC0224s f3403dL = new C04752(104);

    /* renamed from: dM */
    public static AbstractC0224s f3404dM = new C04763(102);

    /* renamed from: dN */
    public static AbstractC0224s f3405dN = new C04774(103);

    /* renamed from: dO */
    static ArrayList f3406dO = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ PointF m3440a(C0473b c0473b, int i) {
        return super.mo3073E(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dA */
    public static /* synthetic */ C0934e m3427dA() {
        return f3385a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dB */
    public static /* synthetic */ C0934e m3426dB() {
        return f3386b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ PointF m3436b(C0473b c0473b, int i) {
        return super.mo3073E(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dC */
    public static /* synthetic */ C0934e m3425dC() {
        return f3387c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ PointF m3431c(C0473b c0473b, int i) {
        return super.mo3073E(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dD */
    public static /* synthetic */ C0934e m3424dD() {
        return f3388d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dE */
    public static /* synthetic */ C0934e m3423dE() {
        return f3389e;
    }

    /* renamed from: a */
    static /* synthetic */ void m3441a(C0473b c0473b) {
        c0473b.m2947W();
    }

    /* renamed from: b */
    static /* synthetic */ void m3437b(C0473b c0473b) {
        c0473b.m2947W();
    }

    /* renamed from: c */
    static /* synthetic */ void m3432c(C0473b c0473b) {
        c0473b.m2947W();
    }

    /* renamed from: d */
    static /* synthetic */ void m3428d(C0473b c0473b) {
        c0473b.m2947W();
    }

    static {
        f3406dO.add(f3402dK);
        f3406dO.add(f3403dL);
        f3406dO.add(f3404dM);
        f3406dO.add(f3405dN);
    }

    /* renamed from: L */
    public int m3443L() {
        return this.f3378l.mo3401b();
    }

    /* renamed from: H */
    public float mo3094H(int i) {
        return this.f3378l.mo3408h(i);
    }

    /* renamed from: a_ */
    public void m3438a_(String str) {
        m3435b(str);
    }

    /* renamed from: b */
    public void m3435b(String str) {
        if (!this.f3378l.m3411a(str)) {
            AbstractC0478c abstractC0478c = this.f3378l;
            this.f3378l = m3430c(str);
            this.f3378l.mo3402a(abstractC0478c);
        }
    }

    /* renamed from: c */
    public AbstractC0478c m3430c(String str) {
        if (str.equals(f3392t)) {
            return new C0483h(this);
        }
        if (str.equals(f3393u)) {
            return new C0481f(this);
        }
        if (str.equals(f3394v)) {
            return new C0482g(this);
        }
        if (str.equals(f3395w)) {
            return new C0479d(this);
        }
        if (str.equals(f3396x)) {
            return new C0480e(this);
        }
        return null;
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1314a(this.f3376j);
        streamWriter.mo1314a(this.f3377k == 1);
        streamWriter.WriteUTF(this.f3378l.mo3399c());
        streamWriter.WriteInteger(this.f3377k);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        boolean ReadBool = reader.ReadBool();
        if (ReadBool) {
            mo3174a(2);
        }
        if (reader.m1295b() >= 27) {
            this.f3377k = reader.ReadBool() ? 1 : 0;
        }
        if (reader.m1295b() >= 35) {
            String ReadUTF = reader.ReadUTF();
            if (!this.f3378l.m3411a(ReadUTF)) {
                m3435b(ReadUTF);
            }
            this.f3377k = reader.ReadInt();
        } else if (ReadBool && !(this instanceof C0471a)) {
            m3435b(f3393u);
        }
        super.mo2291a(reader);
    }

    /* renamed from: v */
    public C0934e mo2977v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3401G[this.f1609bV.m4650O()];
    }

    /* renamed from: dy */
    public static void m3422dy() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3384g = m1072A.f6113bO.mo221a(C0067R.drawable.turret_base);
        f3391i = m1072A.f6113bO.mo221a(C0067R.drawable.turret_base_dead);
        f3385a = m1072A.f6113bO.mo221a(C0067R.drawable.turret_top);
        f3386b = m1072A.f6113bO.mo221a(C0067R.drawable.turret_top_l2);
        f3387c = m1072A.f6113bO.mo221a(C0067R.drawable.turret_top_l3);
        f3388d = m1072A.f6113bO.mo221a(C0067R.drawable.turret_top_artillery);
        f3389e = m1072A.f6113bO.mo221a(C0067R.drawable.turret_top_flame);
        f3390h = AbstractC0197n.m4627a(f3384g);
        f3400F = m1072A.f6113bO.mo221a(C0067R.drawable.unit_icon_building_turrent);
        f3401G = AbstractC0197n.m4627a(f3400F);
    }

    /* renamed from: K */
    public boolean mo3274K() {
        this.f3885L = f3391i;
        m447S(0);
        this.f1606bS = false;
        m2924a(EnumC0233ab.f1505d);
        return true;
    }

    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3391i;
        }
        if (this.f1609bV == null) {
            return f3390h[f3390h.length - 1];
        }
        return f3390h[this.f1609bV.m4650O()];
    }

    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    /* renamed from: d */
    public C0934e mo2988d(int i) {
        return this.f3378l.mo3397d(i);
    }

    public C0473b(boolean z) {
        super(z);
        this.f3378l = new C0483h(this);
        this.f3379H = true;
        this.f3383dJ = new Rect();
        m2639T(35);
        m2638U(42);
        this.f1621ch = 16.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 700.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3384g;
        this.f1649cJ[0].f1712a = C0758f.m2137a(this, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        this.f3426n.m5364a(0, 0, 1, 1);
        this.f3427o.m5364a(0, 0, 1, 1);
    }

    /* renamed from: s */
    public void mo3447s(float f) {
        if (this.f1649cJ[0].m4295a()) {
            if (this.f3379H) {
                this.f3380I = this.f1649cJ[0].f1712a;
                this.f3379H = false;
                this.f3381J = C0758f.m2137a(this, 0, 120);
            }
            this.f3381J += f;
            if (this.f3381J > 450.0f) {
                this.f3381J = C0758f.m2137a(this, 0, 30);
                this.f3382dI = !this.f3382dI;
            }
            if (this.f3381J < 120.0f) {
                if (this.f3382dI) {
                    m2942a(f * 0.3f, this.f3380I - 20.0f, 0);
                    return;
                } else {
                    m2942a(f * 0.3f, this.f3380I + 20.0f, 0);
                    return;
                }
            }
            return;
        }
        this.f3379H = true;
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (m4396bS()) {
            this.f3378l.mo3405a(f);
        }
    }

    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        this.f3378l.mo3403a(abstractC0244am, i);
    }

    /* renamed from: m */
    public float mo2978m() {
        return this.f3378l.mo3406a();
    }

    /* renamed from: b */
    public float mo2992b(int i) {
        return this.f3378l.mo3404a(i);
    }

    /* renamed from: c */
    public float mo2991c(int i) {
        return this.f3378l.mo3410e(i);
    }

    /* renamed from: w */
    public float mo3059w(int i) {
        return this.f3378l.mo3409f(i);
    }

    /* renamed from: b */
    public boolean mo3295b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        if (!super.mo2285c(f)) {
            return false;
        }
        if (!this.f1607bT) {
            m3421dz();
            return true;
        }
        return true;
    }

    /* renamed from: dz */
    void m3421dz() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0934e mo2988d = mo2988d(0);
        PointF mo3089G = mo3089G(0);
        m1072A.f6113bO.mo199a(mo2988d, mo3089G.f227a - LoggerMaybe.m1072A().f6144cv, mo3089G.f228b - LoggerMaybe.m1072A().f6145cw, this.f1649cJ[0].f1712a, mo3251f());
    }

    /* renamed from: c */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1740f;
    }

    /* renamed from: l */
    public boolean mo2979l() {
        return true;
    }

    /* renamed from: af */
    public boolean mo3065af() {
        return false;
    }

    /* renamed from: g */
    public float mo2983g(int i) {
        return this.f3378l.mo3396g(i);
    }

    /* renamed from: M */
    public void m3442M(int i) {
        if (mo2992b(i) < 10.0f) {
            return;
        }
        super.m2954M(i);
    }

    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        AbstractC0224s a = m4427a(c0499j.f3494j);
        if (a != null) {
            a.mo4494f(this);
        } else {
            C0831ad.m1543a("specialAction=null on completeQueueItem(turret) for item.uIndex:" + c0499j.f3494j + " id:" + this.f6951ee, true);
        }
    }

    /* renamed from: cl */
    public C0208c mo3267cl() {
        if (m3443L() == 1) {
            return f3402dK.m4507N();
        }
        if (this.f3378l instanceof C0481f) {
            return f3403dL.m4507N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public void mo3451a(ArrayList arrayList) {
        arrayList.clear();
        if (m3443L() == 1) {
            arrayList.add(f3404dM.m4507N());
            arrayList.add(f3405dN.m4507N());
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$1.class */
    final class C04741 extends AbstractC0228w {
        C04741(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        /* renamed from: a */
        public String mo3029a() {
            return "-Increases HP, attack damage, and range";
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.upgradeToGunT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo3023c() {
            return 1000;
        }

        /* renamed from: K */
        public float mo3265K() {
            return 0.001f;
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0473b c0473b = (C0473b) abstractC0244am;
            if (c0473b.m3443L() != 1 || c0473b.mo3313a(AbstractC0224s.f1462i, z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            if (((C0473b) abstractC0244am).m3443L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1467c;
        }

        /* renamed from: f */
        public void mo4494f(AbstractC0244am abstractC0244am) {
            C0473b c0473b = (C0473b) abstractC0244am;
            c0473b.m3435b(C0473b.f3393u);
            C0473b.m3441a(c0473b);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$2.class */
    final class C04752 extends AbstractC0228w {
        C04752(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        /* renamed from: a */
        public String mo3029a() {
            return "-Extra attack damage, and range.\n-Large amount of HP\n-Self repair";
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.upgradeToGunT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo3023c() {
            return 11000;
        }

        /* renamed from: K */
        public float mo3265K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            if (((C0473b) abstractC0244am).mo3313a(AbstractC0224s.f1462i, z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            if (!(((C0473b) abstractC0244am).f3378l instanceof C0481f)) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1467c;
        }

        /* renamed from: f */
        public void mo4494f(AbstractC0244am abstractC0244am) {
            C0473b c0473b = (C0473b) abstractC0244am;
            c0473b.m3435b(C0473b.f3394v);
            C0473b.m3437b(c0473b);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$3.class */
    final class C04763 extends AbstractC0228w {
        C04763(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        /* renamed from: a */
        public String mo3029a() {
            return "-Large increase in range";
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.upgradeToArtillery", new Object[0]);
        }

        /* renamed from: c */
        public int mo3023c() {
            return 1600;
        }

        /* renamed from: K */
        public float mo3265K() {
            return 4.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0473b c0473b = (C0473b) abstractC0244am;
            if (c0473b.m3443L() != 1 || c0473b.mo3313a(AbstractC0224s.f1462i, z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            if (((C0473b) abstractC0244am).m3443L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1467c;
        }

        /* renamed from: f */
        public void mo4494f(AbstractC0244am abstractC0244am) {
            C0473b c0473b = (C0473b) abstractC0244am;
            c0473b.m3435b(C0473b.f3395w);
            C0473b.m3432c(c0473b);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$4.class */
    final class C04774 extends AbstractC0228w {
        C04774(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        /* renamed from: a */
        public String mo3029a() {
            return "-Short range area affect\n-Adds self-repair";
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.upgradeToFlamethrower", new Object[0]);
        }

        /* renamed from: c */
        public int mo3023c() {
            return 700;
        }

        /* renamed from: K */
        public float mo3265K() {
            return 0.002f;
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0473b c0473b = (C0473b) abstractC0244am;
            if (c0473b.m3443L() != 1 || c0473b.mo3313a(AbstractC0224s.f1462i, z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            if (((C0473b) abstractC0244am).m3443L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1467c;
        }

        /* renamed from: f */
        public void mo4494f(AbstractC0244am abstractC0244am) {
            C0473b c0473b = (C0473b) abstractC0244am;
            c0473b.m3435b(C0473b.f3396x);
            C0473b.m3428d(c0473b);
        }
    }

    /* renamed from: a */
    public void mo3174a(int i) {
        if (i == 1) {
            this.f3376j = false;
        } else if (i == 2 && !this.f3376j) {
            this.f3376j = true;
        }
    }

    /* renamed from: E */
    public PointF mo3073E(int i) {
        return this.f3378l.mo3407c(i);
    }

    /* renamed from: bU */
    public float m3434bU() {
        if (this.f1649cJ[0].f1716e > 0.0f && this.f3378l.m3411a(f3395w)) {
            return 1.0f - (this.f1649cJ[0].f1716e / mo2992b(0));
        }
        return super.m3347bU();
    }

    /* renamed from: G */
    public PointF mo3089G(int i) {
        f3986bg.m5368a(super.mo3089G(i));
        f3986bg.m5367b(0.0f, -5.0f);
        return f3986bg;
    }

    /* renamed from: N */
    public ArrayList mo3068N() {
        return f3406dO;
    }

    /* renamed from: e */
    public void mo2283e(float f) {
        super.mo2283e(f);
        C1117y.m470a(this, mo2978m());
    }

    /* renamed from: cX */
    public float mo3292cX() {
        return LoggerMaybe.m1072A().f6110bL.f785n;
    }

    /* renamed from: cY */
    public float mo3291cY() {
        return LoggerMaybe.m1072A().f6110bL.f786o;
    }

    /* renamed from: cZ */
    public float mo3290cZ() {
        return super.mo3290cZ() - 8.0f;
    }

    /* renamed from: cK */
    public int m3429cK() {
        return this.f3378l.mo3398d();
    }

    /* renamed from: q */
    public float mo3060q(int i) {
        return this.f3378l.mo3400b(i);
    }
}
