package com.corrodinggames.rts.game.units.p026e;

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

/* renamed from: com.corrodinggames.rts.game.units.e.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/n.class */
public class C0533n extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3672a = null;

    /* renamed from: b */
    static C0934e f3673b = null;

    /* renamed from: c */
    static C0934e f3674c = null;

    /* renamed from: d */
    static C0934e f3675d = null;

    /* renamed from: e */
    static C0934e[] f3676e = new C0934e[10];

    /* renamed from: f */
    int f3677f;

    /* renamed from: g */
    float f3678g;

    /* renamed from: h */
    float f3679h;

    /* renamed from: i */
    Rect f3680i;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.tank;
    }

    /* renamed from: c */
    public static void m3117c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3673b = m1071A.f6161bO.mo221a(C0067R.drawable.tank2);
        f3672a = m1071A.f6161bO.mo221a(C0067R.drawable.tank2_dead);
        f3674c = m1071A.f6161bO.mo221a(C0067R.drawable.tank2_turret);
        f3675d = m1071A.f6161bO.mo221a(C0067R.drawable.tank2_shadow);
        f3676e = AbstractC0197n.m4304a(f3673b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3672a;
        }
        return f3676e[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3675d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo2946F() {
        return AbstractC0916l.m1071A().f6163bQ.renderExtraShadows && !this.f1607bT;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return f3674c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        this.f3886L = f3672a;
        m447S(0);
        this.f1606bS = false;
        m2905a(EnumC0233ab.small);
        return true;
    }

    public C0533n(boolean z) {
        super(z);
        this.f3680i = new Rect();
        m2616a(f3673b, 3);
        this.f1621ch = 11.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 210.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3673b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (!this.f1607bT && this.f1617cd != 0.0f) {
            this.f3678g += f;
            if (this.f3678g > 1.0f) {
                this.f3678g = 0.0f;
                this.f3677f++;
                if (this.f3677f > 2) {
                    this.f3677f = 0;
                }
            }
            if (this.f1617cd > 0.0f && this.f6955ei) {
                this.f3679h += f;
                if (this.f3679h > 9.0f) {
                    this.f3679h = 0.0f;
                    m3116f();
                }
            }
        }
    }

    /* renamed from: f */
    public void m3116f() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        int i = 0;
        while (i <= 1) {
            float f = i == 0 ? -20 : 20;
            m1071A.f6164bR.m2292c(this.f6958el + (C0758f.m2030i(this.f1618ce + 180.0f + f) * this.f1621ch), this.f6959em + (C0758f.m2035h(this.f1618ce + 180.0f + f) * this.f1621ch), this.f6960en, this.f1618ce + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo2947E(i);
        C0188f m4395a = C0188f.m4395a(this, E.f227a, E.f228b);
        PointF K = mo2937K(i);
        m4395a.f1018K = K.f227a;
        m4395a.f1019L = K.f228b;
        m4395a.f1028U = 30.0f;
        m4395a.f993l = abstractC0244am;
        m4395a.f989h = 60.0f;
        m4395a.f1001t = 3.0f;
        m4395a.f1023P = (short) 1;
        m4395a.f1005x = 1.0f;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -1127220);
        m1071A.f6164bR.m2320a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
        m1071A.f6159bM.m2702a(C0631e.f4051q, 0.3f, 1.0f + C0758f.m2074c(-0.07f, 0.07f), E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 4.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        if (!super.mo437c(f)) {
            return false;
        }
        C1117y.m462a((AbstractC0623y) this);
        if (!this.f1607bT) {
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.17f;
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
        return 20.0f;
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
        return super.m4115a(z, this.f3677f);
    }
}
