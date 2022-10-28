package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/a.class */
public class C0583a extends AbstractC0590f {

    /* renamed from: a */
    static C0934e f3807a = null;

    /* renamed from: b */
    static C0934e f3808b = null;

    /* renamed from: c */
    static C0934e f3809c = null;

    /* renamed from: d */
    static C0934e f3810d = null;

    /* renamed from: e */
    static C0934e[] f3811e = new C0934e[10];

    /* renamed from: f */
    Rect f3812f;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.battleShip;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3027bN() {
        return 9000.0f;
    }

    /* renamed from: c */
    public static void m3039c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3808b = m1071A.f6161bO.mo221a(C0067R.drawable.battle_ship_t2);
        f3807a = m1071A.f6161bO.mo221a(C0067R.drawable.battle_ship_t2_dead);
        f3809c = m1071A.f6161bO.mo221a(C0067R.drawable.battle_ship_t2_turret);
        f3811e = AbstractC0197n.m4304a(f3808b);
        f3810d = m4116a(f3808b, f3808b.mo386m(), f3808b.mo387l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3807a;
        }
        return f3811e[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return f3809c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3810d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo2946F() {
        return AbstractC0916l.m1071A().f6163bQ.renderExtraShadows && this.f6960en > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo2944G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo2942H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A().f6164bR.m2300b(this.f6958el, this.f6959em, this.f6960en);
        this.f3886L = f3807a;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    public C0583a(boolean z) {
        super(z);
        this.f3812f = new Rect();
        m2615b(f3808b);
        this.f1621ch = 20.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1200.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3808b;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo2726q(int i) {
        return 65.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo2947E(i);
        C0188f m4393a = C0188f.m4393a(this, E.f227a, E.f228b, this.f6960en, i);
        PointF K = mo2937K(i);
        m4393a.f1018K = K.f227a;
        m4393a.f1019L = K.f228b;
        m4393a.f1028U = mo2726q(i);
        m4393a.f993l = abstractC0244am;
        m4393a.f989h = 80.0f;
        m4393a.f1005x = 2.0f;
        m4393a.f1001t = 4.0f;
        m4393a.f1026S = true;
        m4393a.f1051ar = Color.m5106a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        m4393a.f1076aQ = true;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6159bM.m2703a(C0631e.f4052r, 0.2f, E.f227a, E.f228b);
        m1071A.f6164bR.m2307a(m4393a, -1118720);
        C0745e m2320a = m1071A.f6164bR.m2320a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
        if (m2320a != null) {
            C0743c.m2309a(m2320a, this);
        }
        m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo2801bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2951C(int i) {
        if (this.f1620cg && mo2801bc() > 0.95d) {
            if (i == 0) {
                return this.f1618ce + 140.0f;
            }
            return this.f1618ce - 140.0f;
        }
        return this.f1618ce;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 1.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo2717w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.1f;
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
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2792bl() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo2943G(int i) {
        float f;
        PointF G = super.mo2943G(i);
        float f2 = G.f227a;
        float f3 = G.f228b;
        if (i == 0) {
            f = 22.0f;
        } else {
            f = 4.0f;
        }
        f3990bg.m5040a(f2 + (C0758f.m2030i(this.f1618ce) * f), f3 + (C0758f.m2035h(this.f1618ce) * f));
        return f3990bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 120 - (i * 28);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo2764e(int i) {
        return i * 30;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo433e(float f) {
        super.mo433e(f);
        C1117y.m470a(this, mo2738m());
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
