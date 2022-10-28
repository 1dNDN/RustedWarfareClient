package com.corrodinggames.rts.game.units.p026e;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.e.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/o.class */
public class C0534o extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3681a = null;

    /* renamed from: b */
    static C0934e f3682b = null;

    /* renamed from: c */
    static C0934e f3683c = null;

    /* renamed from: d */
    static C0934e[] f3684d = new C0934e[10];

    /* renamed from: e */
    Rect f3685e;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.tankDestroyer;
    }

    /* renamed from: c */
    public static void m3114c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3682b = m1071A.f6161bO.mo221a(C0067R.drawable.tank2);
        f3681a = m1071A.f6161bO.mo221a(C0067R.drawable.tank2_dead);
        f3683c = m1071A.f6161bO.mo221a(C0067R.drawable.tank2_turret);
        f3684d = AbstractC0197n.m4304a(f3682b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3681a;
        }
        return f3684d[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return f3683c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2300b(this.f6958el, this.f6959em, this.f6960en);
        this.f3886L = f3681a;
        m447S(0);
        this.f1606bS = false;
        m1071A.f6159bM.m2703a(C0631e.f4049o, 0.8f, this.f6958el, this.f6959em);
        mo2787bq();
        return true;
    }

    public C0534o(boolean z) {
        super(z);
        this.f3685e = new Rect();
        m2620T(16);
        m2619U(30);
        this.f1621ch = 11.0f;
        this.f1622ci = this.f1621ch + 2.0f;
        this.f1633ct = 350.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3682b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo2947E(i);
        C0188f m4395a = C0188f.m4395a(this, E.f227a, E.f228b);
        m4395a.f1028U = 35.0f;
        m4395a.f993l = abstractC0244am;
        m4395a.f989h = 60.0f;
        m4395a.f1001t = 3.0f;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -1127220);
        m1071A.f6164bR.m2320a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
        m1071A.f6159bM.m2703a(C0631e.f4051q, 0.3f, E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 150.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 1.9f;
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
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 10.0f;
    }
}
