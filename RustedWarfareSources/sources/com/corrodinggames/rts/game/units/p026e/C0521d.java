package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/d.class */
public class C0521d extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3606a = null;

    /* renamed from: b */
    static C0934e f3607b = null;

    /* renamed from: c */
    static C0934e f3608c = null;

    /* renamed from: d */
    static C0934e[] f3609d = new C0934e[10];

    /* renamed from: e */
    int f3610e;

    /* renamed from: f */
    float f3611f;

    /* renamed from: g */
    Rect f3612g;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.experimentalTank;
    }

    /* renamed from: c */
    public static void m3159c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0934e mo221a = m1071A.f6161bO.mo221a(C0067R.drawable.experimental_tank);
        f3609d = AbstractC0197n.m4304a(mo221a);
        f3606a = m1071A.f6161bO.mo221a(C0067R.drawable.experimental_tank_dead);
        f3607b = m1071A.f6161bO.mo221a(C0067R.drawable.experimental_tank_turret);
        f3608c = m4116a(mo221a, mo221a.mo386m() / 2, mo221a.mo387l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3606a;
        }
        return f3609d[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3608c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo2946F() {
        return AbstractC0916l.m1071A().f6163bQ.renderExtraShadows && this.f6960en > -2.0f && this.f1624ck >= 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo2944G() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo2942H() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        if (m3161R(i)) {
            return null;
        }
        return f3607b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A();
        m2905a(EnumC0233ab.largeUnit);
        this.f3886L = f3606a;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    public C0521d(boolean z) {
        super(z);
        this.f3612g = new Rect();
        m2616a(f3609d[7], 2);
        this.f1621ch = 37.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 6000.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3609d[7];
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (!this.f1607bT) {
            if (this.f1623cj != 0.0f) {
                m447S(2);
            } else {
                m447S(4);
            }
        }
        if (this.f1648cI) {
            this.f3611f += f;
            if (this.f3611f > 5.0f) {
                this.f3611f = 0.0f;
                this.f3610e = 1 - this.f3610e;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3027bN() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        if (!m3161R(i)) {
            PointF E = mo2947E(i);
            C0188f m4395a = C0188f.m4395a(this, E.f227a, E.f228b);
            PointF K = mo2937K(i);
            m4395a.f1018K = K.f227a;
            m4395a.f1019L = K.f228b;
            m4395a.f1051ar = Color.m5106a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
            m4395a.f989h = 120.0f;
            m4395a.f1001t = 5.0f;
            m4395a.f993l = abstractC0244am;
            m4395a.f1032Y = 60.0f;
            m4395a.f1028U = 40.0f;
            m4395a.f1033Z = 45.0f;
            m4395a.f1034aa = true;
            m4395a.f1005x = 2.0f;
            m4395a.f1076aQ = true;
            m4395a.f1023P = (short) 9;
            m4395a.f1005x = 1.0f;
            m4395a.f6956ej = this.f6956ej;
            AbstractC0916l m1071A = AbstractC0916l.m1071A();
            m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, 16745216);
            m1071A.f6164bR.m2320a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
            m1071A.f6164bR.m2307a(m4395a, -1127220);
            m1071A.f6159bM.m2703a(C0631e.f4056v, 0.3f, this.f6958el, this.f6959em);
            return;
        }
        PointF E2 = mo2947E(i);
        E2.m5040a(this.f6958el, this.f6959em);
        C0188f m4395a2 = C0188f.m4395a(this, this.f6958el, this.f6959em);
        m4395a2.f1051ar = Color.m5106a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4395a2.f1028U = 60.0f;
        m4395a2.f993l = abstractC0244am;
        m4395a2.f989h = 190.0f;
        m4395a2.f1001t = 3.0f;
        m4395a2.f999r = 6.0f;
        m4395a2.f1067aH = true;
        m4395a2.f1068aI = 10.0f;
        m4395a2.f1069aJ = 15.0f;
        m4395a2.f1072aM = true;
        m4395a2.f1076aQ = true;
        m4395a2.f1066aG = true;
        m4395a2.f6956ej = this.f6956ej;
        AbstractC0916l m1071A2 = AbstractC0916l.m1071A();
        m1071A2.f6159bM.m2703a(C0631e.f4047m, 0.2f, this.f6958el, this.f6959em);
        m1071A2.f6164bR.m2307a(m4395a2, -1118720);
        m1071A2.f6164bR.m2315a(E2.f227a, E2.f228b, this.f6960en, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo2908a(int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        if (!z && z2 && !m2753h(abstractC0244am)) {
            return false;
        }
        if (m3161R(i)) {
            if (!abstractC0244am.mo2959i()) {
                return false;
            }
            return true;
        } else if (abstractC0244am.mo2959i()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 310.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        if (m3161R(i)) {
            i -= 4;
        }
        return 110 - (i * 20);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo2764e(int i) {
        if (m3161R(i)) {
            i -= 4;
        }
        return i * 20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo2801bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bh */
    public int mo2796bh() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo2717w(int i) {
        if (m3161R(i)) {
            return 1.0f;
        }
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        if (m3161R(i)) {
            return 4.5f;
        }
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3119a_(boolean z) {
        if (this.f1607bT && !z) {
            return super.mo3119a_(z);
        }
        if (z) {
            return super.mo3119a_(z);
        }
        int i = 0 + (this.f3610e * this.f4228ep);
        this.f3612g.m5035a(i, 0, i + this.f4228ep, 0 + this.f4229eq);
        return this.f3612g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        if (!super.mo437c(f)) {
            return false;
        }
        C1117y.m462a((AbstractC0623y) this);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2958l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo2846af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo2943G(int i) {
        PointF G = super.mo2943G(i);
        float f = G.f227a;
        float f2 = G.f228b;
        if (!m3161R(i)) {
            if (i <= 1) {
                f += C0758f.m2030i(this.f1618ce) * 5.0f;
                f2 += C0758f.m2035h(this.f1618ce) * 5.0f;
            }
            float f3 = (-45) + (90 * i);
            f += C0758f.m2030i(this.f1618ce + f3) * 18.0f;
            f2 += C0758f.m2035h(this.f1618ce + f3) * 18.0f;
        }
        f3990bg.m5040a(f, f2);
        return f3990bg;
    }

    /* renamed from: R */
    public boolean m3161R(int i) {
        if (i >= 4) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2792bl() {
        return 6;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo433e(float f) {
        super.mo433e(f);
        C1117y.m470a(this, mo2738m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cu */
    public int mo3158cu() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: db */
    public boolean mo3157db() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo2941H(int i) {
        return -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: I */
    public float mo2939I(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: J */
    public float mo2938J(int i) {
        return 12.0f;
    }
}
