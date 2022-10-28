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
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/l.class */
public class C0531l extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3659a = null;

    /* renamed from: b */
    static C0934e f3660b = null;

    /* renamed from: c */
    static C0934e[] f3661c = new C0934e[10];

    /* renamed from: d */
    static C0934e f3662d = null;

    /* renamed from: e */
    public static C0934e f3663e = null;

    /* renamed from: f */
    int f3664f;

    /* renamed from: g */
    float f3665g;

    /* renamed from: h */
    Rect f3666h;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.mammothTank;
    }

    /* renamed from: c */
    public static void m3122c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0934e mo221a = m1071A.f6161bO.mo221a(C0067R.drawable.mammoth_tank);
        f3661c = AbstractC0197n.m4304a(mo221a);
        f3659a = m1071A.f6161bO.mo221a(C0067R.drawable.mammoth_tank_dead);
        f3660b = m1071A.f6161bO.mo221a(C0067R.drawable.mammoth_tank_turret);
        f3663e = m1071A.f6161bO.mo221a(C0067R.drawable.lighting_charge);
        f3662d = m4116a(mo221a, mo221a.mo386m() / 2, mo221a.mo387l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3659a;
        }
        return f3661c[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3662d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return f3660b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo2946F() {
        return AbstractC0916l.m1071A().f6163bQ.renderExtraShadows && this.f6960en > -2.0f && !this.f1607bT;
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
        AbstractC0916l.m1071A();
        this.f3886L = f3659a;
        m447S(0);
        this.f1606bS = false;
        m2905a(EnumC0233ab.largeUnit);
        return true;
    }

    public C0531l(boolean z) {
        super(z);
        this.f3666h = new Rect();
        m2616a(f3661c[7], 2);
        this.f1621ch = 21.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 2900.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3661c[7];
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (this.f1648cI) {
            this.f3665g += f;
            if (this.f3665g > 3.0f) {
                this.f3665g = 0.0f;
                this.f3664f = 1 - this.f3664f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3027bN() {
        return 14000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo2947E(i);
        C0188f m4395a = C0188f.m4395a(this, E.f227a, E.f228b);
        m4395a.f1051ar = Color.m5106a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        m4395a.f1028U = 260.0f;
        m4395a.f993l = abstractC0244am;
        m4395a.f989h = 20.0f;
        m4395a.f1001t = 4.0f;
        m4395a.f1005x = 2.0f;
        m4395a.f1076aQ = true;
        m4395a.f1008A = true;
        m4395a.f1020M = true;
        m4395a.f1042ai = 0.5f;
        m4395a.f1044ak = 1.0f;
        m4395a.f1045al = 0.0f;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -1118482);
        m1071A.f6159bM.m2703a(C0631e.f4058x, 0.2f, this.f6958el, this.f6959em);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo2801bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo2717w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.04f;
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
        return super.m4115a(z, this.f3664f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        if (!super.mo437c(f)) {
            return false;
        }
        C1117y.m462a((AbstractC0623y) this);
        C1117y.m460a(this, f3663e, this.f1649cJ[0].f1717f / mo2764e(0), 0);
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
        return 22.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo2764e(int i) {
        return 60.0f;
    }
}
