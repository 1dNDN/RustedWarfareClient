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

/* renamed from: com.corrodinggames.rts.game.units.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/f.class */
public class C0523f extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3619a = null;

    /* renamed from: b */
    static C0934e f3620b = null;

    /* renamed from: c */
    static C0934e[] f3621c = new C0934e[10];

    /* renamed from: d */
    static C0934e f3622d = null;

    /* renamed from: e */
    int f3623e;

    /* renamed from: f */
    float f3624f;

    /* renamed from: g */
    float f3625g;

    /* renamed from: h */
    Rect f3626h;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.heavyTank;
    }

    /* renamed from: c */
    public static void m3153c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0934e mo221a = m1071A.f6161bO.mo221a(C0067R.drawable.heavy_tank);
        f3621c = AbstractC0197n.m4304a(mo221a);
        f3619a = m1071A.f6161bO.mo221a(C0067R.drawable.heavy_tank_dead);
        f3620b = m1071A.f6161bO.mo221a(C0067R.drawable.heavy_tank_turret);
        f3622d = m4116a(mo221a, mo221a.mo386m() / 3, mo221a.mo387l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3619a;
        }
        return f3621c[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3622d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return f3620b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo2946F() {
        return AbstractC0916l.m1071A().f6163bQ.renderExtraShadows && !this.f1607bT && this.f1624ck >= 1.0f && !this.f1628co;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo2944G() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo2942H() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        this.f3886L = f3619a;
        m447S(0);
        this.f1606bS = false;
        m2905a(EnumC0233ab.normal);
        return true;
    }

    public C0523f(boolean z) {
        super(z);
        this.f3626h = new Rect();
        m2616a(f3621c[7], 3);
        this.f1621ch = 15.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 600.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3621c[7];
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (!this.f1607bT && this.f1617cd != 0.0f) {
            this.f3624f += f;
            if (this.f3624f > 1.4d) {
                this.f3624f = 0.0f;
                this.f3623e++;
                if (this.f3623e > 2) {
                    this.f3623e = 0;
                }
            }
            if (this.f6955ei) {
                this.f3625g += f;
                if (this.f3625g > 9.0f) {
                    this.f3625g = 0.0f;
                    m3152f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m3152f() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        float f = this.f1618ce;
        if (this.f1617cd < 0.0f) {
            f += 180.0f;
        }
        int i = 0;
        while (i <= 1) {
            float f2 = i == 0 ? -20 : 20;
            m1071A.f6164bR.m2292c(this.f6958el + (C0758f.m2030i(f + 180.0f + f2) * this.f1621ch), this.f6959em + (C0758f.m2035h(f + 180.0f + f2) * this.f1621ch), this.f6960en, f + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3027bN() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo2726q(int i) {
        return 50.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (!abstractC0244am.mo2959i()) {
            PointF E = mo2947E(i);
            C0188f m4395a = C0188f.m4395a(this, E.f227a, E.f228b);
            PointF K = mo2937K(i);
            m4395a.f1018K = K.f227a;
            m4395a.f1019L = K.f228b;
            m4395a.f1051ar = Color.m5106a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            m4395a.f1028U = mo2726q(i);
            m4395a.f993l = abstractC0244am;
            m4395a.f989h = 60.0f;
            m4395a.f1001t = 4.0f;
            m4395a.f1005x = 2.0f;
            m4395a.f1076aQ = true;
            m4395a.f1007z = true;
            m1071A.f6164bR.m2307a(m4395a, -16716288);
            m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -1127220);
            m1071A.f6164bR.m2320a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
            m1071A.f6159bM.m2703a(C0631e.f4055u, 0.3f, this.f6958el, this.f6959em);
            return;
        }
        PointF E2 = mo2947E(i);
        E2.m5040a(this.f6958el, this.f6959em);
        C0188f m4395a2 = C0188f.m4395a(this, this.f6958el, this.f6959em);
        m4395a2.f1051ar = Color.m5106a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4395a2.f1028U = mo2726q(i);
        m4395a2.f993l = abstractC0244am;
        m4395a2.f989h = 190.0f;
        m4395a2.f1001t = 0.5f;
        m4395a2.f999r = 5.0f;
        m4395a2.f1067aH = true;
        m4395a2.f1068aI = 10.0f;
        m4395a2.f1069aJ = 15.0f;
        m4395a2.f1072aM = true;
        m4395a2.f1076aQ = true;
        m4395a2.f1066aG = true;
        m1071A.f6159bM.m2703a(C0631e.f4047m, 0.2f, this.f6958el, this.f6959em);
        m1071A.f6164bR.m2307a(m4395a2, -1118720);
        m1071A.f6164bR.m2315a(E2.f227a, E2.f228b, this.f6960en, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 70.0f;
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
    /* renamed from: A */
    public float mo2956A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo2717w(int i) {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.05f;
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
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3119a_(boolean z) {
        if (z) {
            return super.mo3119a_(z);
        }
        if (this.f1607bT) {
            return super.mo3119a_(z);
        }
        return super.m4115a(z, this.f3623e);
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo433e(float f) {
        super.mo433e(f);
        C1117y.m470a(this, mo2738m());
    }
}
