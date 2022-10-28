package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/c.class */
public class C0520c extends AbstractC0525h {

    /* renamed from: a */
    static C0934e f3595a = null;

    /* renamed from: b */
    static C0934e f3596b = null;

    /* renamed from: c */
    static C0934e f3597c = null;

    /* renamed from: d */
    public static C0934e f3598d = null;

    /* renamed from: e */
    public static C0934e f3599e = null;

    /* renamed from: f */
    static C0934e[] f3600f = new C0934e[10];

    /* renamed from: g */
    int f3601g;

    /* renamed from: h */
    float f3602h;

    /* renamed from: i */
    C0188f f3603i;

    /* renamed from: j */
    Rect f3604j;

    /* renamed from: k */
    Paint f3605k;

    /* renamed from: b */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1775O;
    }

    /* renamed from: c */
    public static void m3334c() {
        Core m1087A = Core.m1087A();
        C0934e mo221a = m1087A.f6113bO.mo221a(C0067R.drawable.experimental_hovertank);
        f3600f = AbstractC0197n.m5082a(mo221a);
        f3595a = m1087A.f6113bO.mo221a(C0067R.drawable.experimental_hovertank_dead);
        f3596b = m1087A.f6113bO.mo221a(C0067R.drawable.experimental_hovertank_turret);
        f3597c = m4777a(mo221a, mo221a.mo386m() / 1, mo221a.mo387l());
        f3598d = m1087A.f6113bO.mo221a(C0067R.drawable.experimental_hovertank_shield);
        f3599e = m1087A.f6113bO.mo221a(C0067R.drawable.shield_mid);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        if (this.f3603i != null && this.f3603i.f6953eg) {
            this.f3603i = null;
        }
        streamWriter.m1415a(this.f3603i);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3336a(Reader reader) {
        this.f3603i = (C0188f) reader.m1315a(C0188f.class);
        super.m2961a(reader);
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3595a;
        }
        return f3600f[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return f3597c;
    }

    /* renamed from: F */
    public boolean mo3060F() {
        return Core.m1087A().settingEngine.renderExtraShadows && this.f6960en > -2.0f;
    }

    /* renamed from: G */
    public float mo3059G() {
        return 4.0f;
    }

    /* renamed from: H */
    public float mo3058H() {
        return 4.0f;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return f3596b;
    }

    /* renamed from: T */
    public C0934e m3337T() {
        return f3598d;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core.m1087A();
        this.f3885L = f3595a;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1506e);
        return true;
    }

    public C0520c(boolean z) {
        super(z);
        this.f3602h = 0.0f;
        this.f3604j = new Rect();
        this.f3605k = C1117y.m480a();
        m2688a(f3600f[7], 1);
        this.f1621ch = 30.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 3500.0f;
        this.f1632cs = this.f1633ct;
        this.f1638cy = 5000.0f;
        this.f1635cv = this.f1638cy;
        this.f3885L = f3600f[7];
    }

    /* renamed from: bV */
    public float mo3289bV() {
        if (this.f1638cy > 0.0f && this.f1635cv < this.f1638cy) {
            return this.f1635cv / this.f1638cy;
        }
        return super.mo3289bV();
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (this.f1607bT || !m4751bS()) {
            return;
        }
        if (!this.f1607bT) {
            if (this.f1623cj != 0.0f) {
                m447S(2);
            } else {
                m447S(4);
            }
        }
        if (this.f1648cI) {
        }
        this.f3602h += 1.0f * f;
        if (this.f3602h > 360.0f) {
            this.f3602h -= 360.0f;
        }
        this.f6960en = C0758f.m2210a(this.f6960en, 4.0f + (C0758f.m2097h(this.f3602h) * 2.0f), 0.1f * f);
        this.f1635cv = C0758f.m2210a(this.f1635cv, this.f1638cy, 0.25f * f);
        this.f1636cw = C0758f.m2210a(this.f1636cw, 0.0f, 4.0f * f);
        if (this.f1636cw > 50.0f) {
            this.f1636cw = 50.0f;
        }
        if (this.f3603i != null) {
            PointF E = mo3156E(0);
            this.f3603i.f6958el = E.f227a;
            this.f3603i.f6959em = E.f228b;
            this.f3603i.f6960en = this.f6960en;
            if (this.f3603i.f6953eg) {
                this.f3603i = null;
            }
        }
    }

    /* renamed from: bN */
    public float mo3158bN() {
        return 80000.0f;
    }

    /* renamed from: L */
    public float m3338L(int i) {
        return 0.0f;
    }

    /* renamed from: K */
    public PointF m3339K(int i) {
        PointF K = super.m3013K(i);
        if (this.f3603i != null) {
            K.f227a += this.f3603i.f1011K;
            K.f228b += this.f3603i.f1012L;
        }
        return K;
    }

    /* renamed from: q */
    public float mo3150q(int i) {
        return 0.0f;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        Core.m1087A();
        PointF E = mo3156E(i);
        if (this.f3603i != null) {
            boolean z = false;
            if (this.f3603i.f6953eg) {
                z = true;
            }
            if (this.f3603i.f986l != abstractC0244am) {
                z = true;
            }
            if (z) {
                this.f3603i = null;
            }
        }
        float mo3050b = mo3050b(i) + mo3042e(i) + 5.0f;
        if (this.f3603i != null) {
            this.f3603i.f982h = mo3050b;
            return;
        }
        C0188f m5205a = C0188f.m5205a(this, E.f227a, E.f228b);
        m5205a.f1021U = 380.0f;
        m5205a.f986l = abstractC0244am;
        m5205a.f982h = mo3050b;
        m5205a.f1002B = true;
        m5205a.f1001A = true;
        m5205a.f1068aQ = true;
        m5205a.f1005E = true;
        m5205a.f1010J = 70.0f;
        m5205a.f1006F = 230.0f;
        m5205a.f1037ak = 0.75f;
        m5205a.f6956ej = this.f6956ej;
        this.f3603i = m5205a;
    }

    /* renamed from: m */
    public float mo3035m() {
        return 180.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 8.0f;
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        return 8.0f;
    }

    /* renamed from: z */
    public float mo3033z() {
        return 0.6f;
    }

    /* renamed from: bc */
    public float mo3153bc() {
        return 1.0f;
    }

    /* renamed from: A */
    public float mo3065A() {
        return 1.1f;
    }

    /* renamed from: B */
    public float mo3064B() {
        return 0.03f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 1.5f;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 0.02f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 0.02f;
    }

    /* renamed from: a_ */
    public Rect mo3282a_(boolean z) {
        if (this.f1607bT && !z) {
            return super.mo3282a_(z);
        }
        if (z) {
            return super.mo3282a_(z);
        }
        int i = 0 + (this.f3601g * this.f4228ep);
        this.f3604j.m5874a(i, 0, i + this.f4228ep, 0 + this.f4229eq);
        return this.f3604j;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        C0934e m3337T;
        if (!super.mo3049c(f)) {
            return false;
        }
        C1117y.m462a((AbstractC0623y) this);
        if (!this.f1607bT) {
            float f2 = 0.0f;
            if (this.f3603i != null) {
                f2 = C0758f.m2159b(this.f3603i.m5193e(), 0.25f) * 3.0f;
            }
            C1117y.m460a(this, C0531l.f3663e, f2, 0);
        }
        Core m1087A = Core.m1087A();
        if (!this.f1607bT && this.f1635cv > 0.0f && this.f1637cx == 0.0f && (m3337T = m3337T()) != null) {
            this.f3605k.m5933a((int) ((0.09f + ((this.f1635cv / this.f1638cy) * 0.4f) + ((C0758f.m2159b(this.f1636cw, 50.0f) / 50.0f) * 0.5f)) * 255.0f), 255, 255, 255);
            m1087A.f6113bO.mo199a(m3337T, this.f6958el - m1087A.f6144cv, (this.f6959em - m1087A.f6145cw) - this.f6960en, mo3317d(false) - 90.0f, this.f3605k);
            return true;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return true;
    }

    /* renamed from: af */
    public boolean mo3160af() {
        return true;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 8.0f;
    }

    /* renamed from: G */
    public PointF mo3176G(int i) {
        f3986bg.m5879a(this.f6958el, this.f6959em);
        return f3986bg;
    }

    /* renamed from: bl */
    public int mo3169bl() {
        return 1;
    }

    /* renamed from: bi */
    public boolean mo3320bi() {
        return true;
    }

    /* renamed from: bj */
    public boolean mo3319bj() {
        return true;
    }

    /* renamed from: cu */
    public int mo3328cu() {
        return 5;
    }

    /* renamed from: db */
    public boolean mo3327db() {
        return true;
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
        C1117y.m470a(this, mo3035m());
    }
}
