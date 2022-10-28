package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
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
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.e.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/k.class */
public class C0530k extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3652a = null;

    /* renamed from: b */
    static C0934e f3653b = null;

    /* renamed from: c */
    static C0934e f3654c = null;

    /* renamed from: d */
    static C0934e f3655d = null;

    /* renamed from: e */
    static C0934e[] f3656e = new C0934e[10];

    /* renamed from: f */
    static C0934e f3657f = null;

    /* renamed from: g */
    Rect f3658g;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.laserTank;
    }

    /* renamed from: c */
    public static void m3124c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3653b = m1071A.f6161bO.mo221a(C0067R.drawable.laser_tank_base);
        f3652a = m1071A.f6161bO.mo221a(C0067R.drawable.laser_tank_dead);
        f3654c = m1071A.f6161bO.mo221a(C0067R.drawable.laser_tank_turrent);
        f3655d = m1071A.f6161bO.mo221a(C0067R.drawable.laser_tank_charge);
        f3656e = AbstractC0197n.m4304a(f3653b);
        f3657f = m4116a(f3653b, f3653b.mo386m(), f3653b.mo387l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3652a;
        }
        return f3656e[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3657f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo2946F() {
        return AbstractC0916l.m1071A().f6163bQ.renderExtraShadows && !this.f1607bT;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return f3654c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A();
        this.f3886L = f3652a;
        m447S(0);
        this.f1606bS = false;
        m2905a(EnumC0233ab.small);
        return true;
    }

    public C0530k(boolean z) {
        super(z);
        this.f3658g = new Rect();
        m2616a(f3653b, 1);
        this.f1621ch = 14.0f;
        this.f1622ci = this.f1621ch + 2.0f;
        this.f1633ct = 300.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3653b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo2726q(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo2947E(i);
        C0188f m4395a = C0188f.m4395a(this, E.f227a, E.f228b);
        m4395a.f1028U = mo2726q(i);
        m4395a.f993l = abstractC0244am;
        m4395a.f989h = 8.0f;
        m4395a.f1009B = true;
        m4395a.f1008A = true;
        m4395a.f1076aQ = true;
        m4395a.f1051ar = Color.m5106a(80, 255, 0, 0);
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -1127220);
        m1071A.f6164bR.m2320a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
        m1071A.f6159bM.m2703a(C0631e.f4059y, 0.3f, E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bV */
    public float mo3126bV() {
        if (this.f1649cJ[0].f1716e > 0.0f) {
            return 1.0f - (this.f1649cJ[0].f1716e / mo2821b(0));
        }
        if (this.f1649cJ[0].f1717f != 0.0f) {
            return this.f1649cJ[0].f1717f / mo2764e(0);
        }
        return super.mo3126bV();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bW */
    public boolean mo3125bW() {
        return this.f1649cJ[0].f1716e > 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 190.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo2764e(int i) {
        return 80.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        if (!super.mo437c(f)) {
            return false;
        }
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C1117y.m462a((AbstractC0623y) this);
        if (!this.f1607bT) {
            float mo2764e = this.f1649cJ[0].f1717f / mo2764e(0);
            if (mo2764e != 0.0f) {
                PointF E = mo2947E(0);
                m1071A.f6161bO.mo137i();
                m1071A.f6161bO.mo168b(E.f227a - m1071A.f6194cv, E.f228b - m1071A.f6195cw);
                m1071A.f6161bO.mo228a(mo2764e, mo2764e);
                m1071A.f6161bO.mo198a(f3655d, 0.0f, 0.0f, (Paint) null);
                m1071A.f6161bO.mo136j();
                return true;
            }
            return true;
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
        return 0.12f;
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
        return 19.0f;
    }
}
