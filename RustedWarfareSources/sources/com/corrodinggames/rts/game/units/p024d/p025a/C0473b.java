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
import com.corrodinggames.rts.gameFramework.Core;
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
    boolean f3384j;

    /* renamed from: k */
    int f3385k;

    /* renamed from: l */
    AbstractC0478c f3386l;

    /* renamed from: H */
    boolean f3397H;

    /* renamed from: I */
    float f3398I;

    /* renamed from: J */
    float f3399J;

    /* renamed from: dI */
    boolean f3400dI;

    /* renamed from: dJ */
    Rect f3401dJ;

    /* renamed from: g */
    static C0934e f3376g = null;

    /* renamed from: a */
    private static C0934e f3377a = null;

    /* renamed from: b */
    private static C0934e f3378b = null;

    /* renamed from: c */
    private static C0934e f3379c = null;

    /* renamed from: d */
    private static C0934e f3380d = null;

    /* renamed from: e */
    private static C0934e f3381e = null;

    /* renamed from: h */
    static C0934e[] f3382h = new C0934e[10];

    /* renamed from: i */
    static C0934e f3383i = null;

    /* renamed from: t */
    static String f3387t = "gun";

    /* renamed from: u */
    static String f3388u = "gunT2";

    /* renamed from: v */
    static String f3389v = "gunT3";

    /* renamed from: w */
    static String f3390w = "artillery";

    /* renamed from: x */
    static String f3391x = "flamethrower";

    /* renamed from: C */
    static String f3392C = "aa_t1";

    /* renamed from: D */
    static String f3393D = "aa_t2";

    /* renamed from: E */
    static String f3394E = "aa_flak";

    /* renamed from: F */
    static C0934e f3395F = null;

    /* renamed from: G */
    static C0934e[] f3396G = new C0934e[10];

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
    public static /* synthetic */ PointF m3610a(C0473b c0473b, int i) {
        return super.mo3156E(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dA */
    public static /* synthetic */ C0934e m3591dA() {
        return f3377a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dB */
    public static /* synthetic */ C0934e m3590dB() {
        return f3378b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ PointF m3604b(C0473b c0473b, int i) {
        return super.mo3156E(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dC */
    public static /* synthetic */ C0934e m3589dC() {
        return f3379c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ PointF m3599c(C0473b c0473b, int i) {
        return super.mo3156E(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dD */
    public static /* synthetic */ C0934e m3588dD() {
        return f3380d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dE */
    public static /* synthetic */ C0934e m3587dE() {
        return f3381e;
    }

    /* renamed from: a */
    static /* synthetic */ void m3611a(C0473b c0473b) {
        c0473b.m3004W();
    }

    /* renamed from: b */
    static /* synthetic */ void m3605b(C0473b c0473b) {
        c0473b.m3004W();
    }

    /* renamed from: c */
    static /* synthetic */ void m3600c(C0473b c0473b) {
        c0473b.m3004W();
    }

    /* renamed from: d */
    static /* synthetic */ void m3592d(C0473b c0473b) {
        c0473b.m3004W();
    }

    static {
        f3406dO.add(f3402dK);
        f3406dO.add(f3403dL);
        f3406dO.add(f3404dM);
        f3406dO.add(f3405dN);
    }

    /* renamed from: L */
    public int m3613L() {
        return this.f3386l.mo3565b();
    }

    /* renamed from: H */
    public float mo3181H(int i) {
        return this.f3386l.mo3572h(i);
    }

    /* renamed from: a_ */
    public void m3607a_(String str) {
        m3603b(str);
    }

    /* renamed from: b */
    public void m3603b(String str) {
        if (!this.f3386l.m3575a(str)) {
            AbstractC0478c abstractC0478c = this.f3386l;
            this.f3386l = m3598c(str);
            this.f3386l.mo3566a(abstractC0478c);
        }
    }

    /* renamed from: c */
    public AbstractC0478c m3598c(String str) {
        if (str.equals(f3387t)) {
            return new C0483h(this);
        }
        if (str.equals(f3388u)) {
            return new C0481f(this);
        }
        if (str.equals(f3389v)) {
            return new C0482g(this);
        }
        if (str.equals(f3390w)) {
            return new C0479d(this);
        }
        if (str.equals(f3391x)) {
            return new C0480e(this);
        }
        return null;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f3384j);
        streamWriter.mo1329a(this.f3385k == 1);
        streamWriter.WriteUTF(this.f3386l.mo3563c());
        streamWriter.WriteInteger(this.f3385k);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3609a(Reader reader) {
        boolean ReadBool = reader.ReadBool();
        if (ReadBool) {
            mo3356a(2);
        }
        if (reader.m1310b() >= 27) {
            this.f3385k = reader.ReadBool() ? 1 : 0;
        }
        if (reader.m1310b() >= 35) {
            String ReadUTF = reader.ReadUTF();
            if (!this.f3386l.m3575a(ReadUTF)) {
                m3603b(ReadUTF);
            }
            this.f3385k = reader.ReadInt();
        } else if (ReadBool && !(this instanceof C0471a)) {
            m3603b(f3388u);
        }
        super.m3478a(reader);
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3396G[this.f1609bV.m5105O()];
    }

    /* renamed from: dy */
    public static void m3586dy() {
        Core m1087A = Core.m1087A();
        f3376g = m1087A.f6113bO.mo221a(C0067R.drawable.turret_base);
        f3383i = m1087A.f6113bO.mo221a(C0067R.drawable.turret_base_dead);
        f3377a = m1087A.f6113bO.mo221a(C0067R.drawable.turret_top);
        f3378b = m1087A.f6113bO.mo221a(C0067R.drawable.turret_top_l2);
        f3379c = m1087A.f6113bO.mo221a(C0067R.drawable.turret_top_l3);
        f3380d = m1087A.f6113bO.mo221a(C0067R.drawable.turret_top_artillery);
        f3381e = m1087A.f6113bO.mo221a(C0067R.drawable.turret_top_flame);
        f3382h = AbstractC0197n.m5082a(f3376g);
        f3395F = m1087A.f6113bO.mo221a(C0067R.drawable.unit_icon_building_turrent);
        f3396G = AbstractC0197n.m5082a(f3395F);
    }

    /* renamed from: K */
    public boolean m3614K() {
        this.f3885L = f3383i;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1505d);
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3383i;
        }
        if (this.f1609bV == null) {
            return f3382h[f3382h.length - 1];
        }
        return f3382h[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return this.f3386l.mo3561d(i);
    }

    public C0473b(boolean z) {
        super(z);
        this.f3386l = new C0483h(this);
        this.f3397H = true;
        this.f3401dJ = new Rect();
        m2693T(35);
        m2692U(42);
        this.f1621ch = 16.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 700.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3376g;
        this.f1649cJ[0].f1712a = C0758f.m2189a(this, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        this.f3426n.m5874a(0, 0, 1, 1);
        this.f3427o.m5874a(0, 0, 1, 1);
    }

    /* renamed from: s */
    public void m3584s(float f) {
        if (this.f1649cJ[0].m4639a()) {
            if (this.f3397H) {
                this.f3398I = this.f1649cJ[0].f1712a;
                this.f3397H = false;
                this.f3399J = C0758f.m2189a(this, 0, 120);
            }
            this.f3399J += f;
            if (this.f3399J > 450.0f) {
                this.f3399J = C0758f.m2189a(this, 0, 30);
                this.f3400dI = !this.f3400dI;
            }
            if (this.f3399J < 120.0f) {
                if (this.f3400dI) {
                    m2999a(f * 0.3f, this.f3398I - 20.0f, 0);
                    return;
                } else {
                    m2999a(f * 0.3f, this.f3398I + 20.0f, 0);
                    return;
                }
            }
            return;
        }
        this.f3397H = true;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (m4751bS()) {
            this.f3386l.mo3569a(f);
        }
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        this.f3386l.mo3567a(abstractC0244am, i);
    }

    /* renamed from: m */
    public float mo3035m() {
        return this.f3386l.mo3570a();
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return this.f3386l.mo3568a(i);
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return this.f3386l.mo3574e(i);
    }

    /* renamed from: w */
    public float mo3162w(int i) {
        return this.f3386l.mo3573f(i);
    }

    /* renamed from: b */
    public boolean m3606b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        if (!super.mo3049c(f)) {
            return false;
        }
        if (!this.f1607bT) {
            m3585dz();
            return true;
        }
        return true;
    }

    /* renamed from: dz */
    void m3585dz() {
        Core m1087A = Core.m1087A();
        C0934e mo3045d = mo3045d(0);
        PointF mo3176G = mo3176G(0);
        m1087A.f6113bO.mo199a(mo3045d, mo3176G.f227a - Core.m1087A().f6144cv, mo3176G.f228b - Core.m1087A().f6145cw, this.f1649cJ[0].f1712a, mo3353f());
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1740f;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return true;
    }

    /* renamed from: af */
    public boolean mo3160af() {
        return false;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return this.f3386l.mo3560g(i);
    }

    /* renamed from: M */
    public void m3612M(int i) {
        if (mo3050b(i) < 10.0f) {
            return;
        }
        super.m3011M(i);
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        AbstractC0224s a = m4788a(c0499j.f3496j);
        if (a != null) {
            a.mo4949f(this);
        } else {
            C0831ad.m1587a("specialAction=null on completeQueueItem(turret) for item.uIndex:" + c0499j.f3496j + " id:" + this.f6951ee, true);
        }
    }

    /* renamed from: cl */
    public C0208c m3593cl() {
        if (m3613L() == 1) {
            return f3402dK.m4910N();
        }
        if (this.f3386l instanceof C0481f) {
            return f3403dL.m4910N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public void m3608a(ArrayList arrayList) {
        arrayList.clear();
        if (m3613L() == 1) {
            arrayList.add(f3404dM.m4910N());
            arrayList.add(f3405dN.m4910N());
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$1.class */
    final class C04741 extends AbstractC0228w {
        C04741(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Increases HP, attack damage, and range";
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.upgradeToGunT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return 1000;
        }

        /* renamed from: K */
        public float mo3369K() {
            return 0.001f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0473b c0473b = (C0473b) abstractC0244am;
            if (c0473b.m3613L() != 1 || c0473b.mo3438a(AbstractC0224s.f1462i, z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            if (((C0473b) abstractC0244am).m3613L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1467c;
        }

        /* renamed from: f */
        public void mo4949f(AbstractC0244am abstractC0244am) {
            C0473b c0473b = (C0473b) abstractC0244am;
            c0473b.m3603b(C0473b.f3388u);
            C0473b.m3611a(c0473b);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$2.class */
    final class C04752 extends AbstractC0228w {
        C04752(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Extra attack damage, and range.\n-Large amount of HP\n-Self repair";
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.upgradeToGunT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return 11000;
        }

        /* renamed from: K */
        public float mo3369K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            if (((C0473b) abstractC0244am).mo3438a(AbstractC0224s.f1462i, z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            if (!(((C0473b) abstractC0244am).f3386l instanceof C0481f)) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1467c;
        }

        /* renamed from: f */
        public void mo4949f(AbstractC0244am abstractC0244am) {
            C0473b c0473b = (C0473b) abstractC0244am;
            c0473b.m3603b(C0473b.f3389v);
            C0473b.m3605b(c0473b);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$3.class */
    final class C04763 extends AbstractC0228w {
        C04763(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Large increase in range";
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.upgradeToArtillery", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return 1600;
        }

        /* renamed from: K */
        public float mo3369K() {
            return 4.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0473b c0473b = (C0473b) abstractC0244am;
            if (c0473b.m3613L() != 1 || c0473b.mo3438a(AbstractC0224s.f1462i, z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            if (((C0473b) abstractC0244am).m3613L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1467c;
        }

        /* renamed from: f */
        public void mo4949f(AbstractC0244am abstractC0244am) {
            C0473b c0473b = (C0473b) abstractC0244am;
            c0473b.m3603b(C0473b.f3390w);
            C0473b.m3600c(c0473b);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.b$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/b$4.class */
    final class C04774 extends AbstractC0228w {
        C04774(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Short range area affect\n-Adds self-repair";
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.upgradeToFlamethrower", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return 700;
        }

        /* renamed from: K */
        public float mo3369K() {
            return 0.002f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0473b c0473b = (C0473b) abstractC0244am;
            if (c0473b.m3613L() != 1 || c0473b.mo3438a(AbstractC0224s.f1462i, z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            if (((C0473b) abstractC0244am).m3613L() != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1467c;
        }

        /* renamed from: f */
        public void mo4949f(AbstractC0244am abstractC0244am) {
            C0473b c0473b = (C0473b) abstractC0244am;
            c0473b.m3603b(C0473b.f3391x);
            C0473b.m3592d(c0473b);
        }
    }

    /* renamed from: a */
    public void mo3356a(int i) {
        if (i == 1) {
            this.f3384j = false;
        } else if (i == 2 && !this.f3384j) {
            this.f3384j = true;
        }
    }

    /* renamed from: E */
    public PointF mo3156E(int i) {
        return this.f3386l.mo3571c(i);
    }

    /* renamed from: bU */
    public float m3602bU() {
        if (this.f1649cJ[0].f1716e > 0.0f && this.f3386l.m3575a(f3390w)) {
            return 1.0f - (this.f1649cJ[0].f1716e / mo3050b(0));
        }
        return super.m3474bU();
    }

    /* renamed from: G */
    public PointF mo3176G(int i) {
        f3986bg.m5878a(super.mo3176G(i));
        f3986bg.m5877b(0.0f, -5.0f);
        return f3986bg;
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f3406dO;
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
        C1117y.m470a(this, mo3035m());
    }

    /* renamed from: cX */
    public float m3596cX() {
        return Core.m1087A().f6110bL.f785n;
    }

    /* renamed from: cY */
    public float m3595cY() {
        return Core.m1087A().f6110bL.f786o;
    }

    /* renamed from: cZ */
    public float m3594cZ() {
        return super.m4708cZ() - 8.0f;
    }

    /* renamed from: cK */
    public int m3597cK() {
        return this.f3386l.mo3562d();
    }

    /* renamed from: q */
    public float mo3150q(int i) {
        return this.f3386l.mo3564b(i);
    }
}
