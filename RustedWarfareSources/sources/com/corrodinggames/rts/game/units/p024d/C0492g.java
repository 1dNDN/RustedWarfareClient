package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g.class */
public class C0492g extends AbstractC0498i {

    /* renamed from: a */
    float f3451a;

    /* renamed from: b */
    int f3452b;

    /* renamed from: c */
    float f3453c;

    /* renamed from: d */
    int f3454d;

    /* renamed from: j */
    Rect f3455j;

    /* renamed from: k */
    Rect f3456k;

    /* renamed from: w */
    static ArrayList f3457w;

    /* renamed from: x */
    static ArrayList f3458x;

    /* renamed from: e */
    static C0934e[] f3459e = new C0934e[10];

    /* renamed from: f */
    static C0934e[] f3460f = new C0934e[10];

    /* renamed from: g */
    static C0934e[] f3461g = new C0934e[10];

    /* renamed from: h */
    static C0934e f3462h = null;

    /* renamed from: i */
    static C0934e f3463i = null;

    /* renamed from: l */
    public static int f3464l = 0;

    /* renamed from: t */
    static AbstractC0224s f3465t = new C04931(102);

    /* renamed from: u */
    static AbstractC0224s f3466u = new C04942(103);

    /* renamed from: v */
    static ArrayList f3467v = new ArrayList();

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f3451a);
        streamWriter.mo1314a(this.f3452b > 1);
        streamWriter.WriteInteger(this.f3452b);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3451a = reader.m1285g();
        int i = 1;
        if (reader.ReadBool()) {
            i = 2;
        }
        if (reader.m1295b() >= 31) {
            i = reader.ReadInt();
        }
        if (i != 1) {
            mo3174a(i);
        }
        super.mo2291a(reader);
    }

    /* renamed from: b */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1735a;
    }

    static {
        f3467v.add(f3465t);
        f3457w = new ArrayList();
        f3457w.add(f3466u);
        f3458x = new ArrayList();
    }

    /* renamed from: c */
    public boolean m3361c(AbstractC0197n abstractC0197n) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6110bL.m4857a(this.f6957el, this.f6958em);
        C0180g m4803e = m1072A.f6110bL.m4803e(m1072A.f6110bL.f801T, m1072A.f6110bL.f802U);
        if (m4803e == null || !m4803e.f922i) {
            return false;
        }
        return super.m2793c(abstractC0197n);
    }

    /* renamed from: c */
    public static void m3362c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0934e mo221a = m1072A.f6113bO.mo221a(C0067R.drawable.extractor);
        C0934e mo221a2 = m1072A.f6113bO.mo221a(C0067R.drawable.extractor_t2);
        C0934e mo221a3 = m1072A.f6113bO.mo221a(C0067R.drawable.extractor_t3);
        f3463i = m1072A.f6113bO.mo221a(C0067R.drawable.extractor_dead);
        f3459e = AbstractC0197n.m4627a(mo221a);
        f3460f = AbstractC0197n.m4627a(mo221a2);
        f3461g = AbstractC0197n.m4627a(mo221a3);
        mo221a.mo50n();
        mo221a2.mo50n();
        mo221a3.mo50n();
        f3462h = m1072A.f6113bO.mo221a(C0067R.drawable.extractor_back);
    }

    /* renamed from: K */
    public boolean mo3274K() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6116bR.m2339a(this.f6957el, this.f6958em, this.f6959en);
        this.f3885L = f3463i;
        this.f3425m = null;
        m447S(0);
        this.f1606bS = false;
        m1072A.f6111bM.m2722a(C0631e.f4050p, 0.8f, this.f6957el, this.f6958em);
        C0746f.m2296a(this.f6957el, this.f6958em).f4815j = -6684775;
        C0746f m2288b = C0746f.m2288b(this.f6957el, this.f6958em);
        m2288b.f4795a = 500.0f;
        m2288b.f4815j = -6684775;
        m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
        C0745e m2309c = m1072A.f6116bR.m2309c(this.f6957el, this.f6958em, this.f6959en, -1127220);
        if (m2309c != null) {
            m2309c.f4735H = 0.15f;
            m2309c.f4734G = 1.0f;
            m2309c.f4792as = (short) 2;
            m2309c.f4750W = 35.0f;
            m2309c.f4751X = m2309c.f4750W;
            m2309c.f4749V = 0.0f;
            m2309c.f4730y = -13378253;
        }
        m2808bo();
        return false;
    }

    /* renamed from: bp */
    public int mo3356bp() {
        return 16;
    }

    /* renamed from: S */
    public void mo3303S() {
        super.mo3303S();
        if (this.f1607bT) {
            this.f3425m = null;
        } else {
            this.f3425m = f3462h;
        }
    }

    /* renamed from: M */
    public boolean m3364M() {
        return true;
    }

    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3463i;
        }
        if (this.f1609bV == null) {
            return f3459e[f3459e.length - 1];
        }
        if (this.f3452b == 3) {
            return f3461g[this.f1609bV.m4650O()];
        }
        if (this.f3452b == 2) {
            return f3460f[this.f1609bV.m4650O()];
        }
        return f3459e[this.f1609bV.m4650O()];
    }

    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    public C0492g(boolean z) {
        super(z);
        this.f3452b = 1;
        this.f3453c = 0.0f;
        this.f3454d = 0;
        this.f3455j = new Rect();
        this.f3456k = new Rect();
        this.f3885L = f3459e[9];
        m2639T(37);
        m2638U(56);
        this.f1621ch = 18.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 800.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5364a(0, -1, 0, 0);
        this.f3427o.m5363a(this.f3426n);
        mo3303S();
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
            return;
        }
        this.f3453c = C0758f.m2159a(this.f3453c, f * this.f3452b);
        if (this.f3453c == 0.0f) {
            this.f3453c = 17.0f;
            this.f3454d++;
            if (this.f3454d > 7) {
                this.f3454d = 0;
            }
            if (this.f3454d <= 3) {
                this.f3431s = this.f3454d;
            } else {
                this.f3431s = 7 - this.f3454d;
            }
        }
        this.f3451a += f;
        if (this.f3451a > AbstractC0197n.f1378ao - 0.1f) {
            this.f3451a -= AbstractC0197n.f1378ao;
            this.f1609bV.m4618b(mo3354cw() * (AbstractC0197n.f1378ao / AbstractC0197n.f1377an));
        }
    }

    /* renamed from: cw */
    public float mo3354cw() {
        if (this.f3452b == 3) {
            return 18.0f;
        }
        if (this.f3452b == 2) {
            return 12.0f;
        }
        return 8.0f;
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        return super.mo2285c(f);
    }

    /* renamed from: l */
    public boolean mo2979l() {
        return false;
    }

    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    /* renamed from: m */
    public float mo2978m() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo2992b(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public float mo2991c(int i) {
        return 0.0f;
    }

    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        if (c0499j.f3494j.equals(f3465t.m4507N())) {
            mo3174a(2);
            m2947W();
        }
        if (c0499j.f3494j.equals(f3466u.m4507N())) {
            mo3174a(3);
            m2947W();
        }
    }

    /* renamed from: cl */
    public C0208c mo3267cl() {
        if (this.f3452b == 1) {
            return f3465t.m4507N();
        }
        if (this.f3452b == 2) {
            return f3466u.m4507N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: V */
    public int mo3273V() {
        return this.f3452b;
    }

    /* renamed from: a */
    public void mo3174a(int i) {
        AbstractC0197n.m4614b((AbstractC0244am) this);
        if (this.f3452b > i) {
            this.f3452b = 1;
            this.f1633ct = 800.0f;
            if (this.f1632cs > this.f1633ct) {
                this.f1632cs = this.f1633ct;
            }
        }
        if (this.f3452b < 2 && i >= 2) {
            this.f1633ct += 200.0f;
            this.f1632cs += 200.0f;
        }
        if (this.f3452b < 3 && i >= 3) {
            this.f1633ct += 1000.0f;
            this.f1632cs += 1000.0f;
        }
        this.f3452b = i;
        AbstractC0197n.m4598c(this);
        mo3303S();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.g$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g$1.class */
    final class C04931 extends AbstractC0228w {
        C04931(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        /* renamed from: a */
        public String mo3029a() {
            return C0820a.m1687a("units.extractor.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.upgradeT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo3023c() {
            return EnumC0249ar.f1735a.mo4272c(2);
        }

        /* renamed from: K */
        public float mo3265K() {
            return 6.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0492g c0492g = (C0492g) abstractC0244am;
            if (c0492g.f3452b != 1 || c0492g.mo3313a(m4507N(), z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1467c;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.g$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g$2.class */
    final class C04942 extends AbstractC0228w {
        C04942(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        /* renamed from: a */
        public String mo3029a() {
            return C0820a.m1687a("units.extractor.upgrade.descriptionT3", new Object[0]);
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.upgradeT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo3023c() {
            return EnumC0249ar.f1735a.mo4272c(3);
        }

        /* renamed from: K */
        public float mo3265K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0492g c0492g = (C0492g) abstractC0244am;
            if (c0492g.f3452b != 2 || c0492g.mo3313a(m4507N(), z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1467c;
        }
    }

    /* renamed from: N */
    public ArrayList mo3068N() {
        if (this.f3452b == 1) {
            return f3467v;
        }
        if (this.f3452b == 2) {
            return f3457w;
        }
        return f3458x;
    }
}
