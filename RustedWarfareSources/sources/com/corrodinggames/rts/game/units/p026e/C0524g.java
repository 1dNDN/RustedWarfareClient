package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/g.class */
public class C0524g extends AbstractC0525h {

    /* renamed from: a */
    float f3627a;

    /* renamed from: b */
    static C0934e f3628b = null;

    /* renamed from: c */
    static C0934e f3629c = null;

    /* renamed from: d */
    static C0934e f3630d = null;

    /* renamed from: e */
    static C0934e[] f3631e = new C0934e[10];

    /* renamed from: f */
    Rect f3632f;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.hoverTank;
    }

    /* renamed from: c */
    public static void m3150c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3629c = m1071A.f6161bO.mo221a(C0067R.drawable.hover_tank);
        f3628b = m1071A.f6161bO.mo221a(C0067R.drawable.hover_tank_dead);
        f3630d = m1071A.f6161bO.mo221a(C0067R.drawable.hover_tank_shadow);
        f3631e = AbstractC0197n.m4304a(f3629c);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3628b;
        }
        return f3631e[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3630d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        this.f3886L = f3628b;
        m447S(0);
        this.f1606bS = false;
        m2905a(EnumC0233ab.small);
        return true;
    }

    public C0524g(boolean z) {
        super(z);
        this.f3627a = 0.0f;
        this.f3632f = new Rect();
        m2615b(f3629c);
        this.f1621ch = 7.0f;
        this.f1622ci = this.f1621ch + 2.0f;
        this.f1633ct = 150.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3629c;
        this.f3887M = f3630d;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0525h, com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (this.f1607bT || !m4103bS()) {
            return;
        }
        this.f3627a += 3.0f * f;
        if (this.f3627a > 360.0f) {
            this.f3627a -= 360.0f;
        }
        this.f6960en = C0758f.m2148a(this.f6960en, 4.0f + (C0758f.m2035h(this.f3627a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo2726q(int i) {
        return 23.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo2947E(i);
        C0188f m4393a = C0188f.m4393a(this, E.f227a, E.f228b, this.f6960en, i);
        PointF K = mo2937K(i);
        m4393a.f1018K = K.f227a;
        m4393a.f1019L = K.f228b;
        m4393a.f1051ar = Color.m5106a(255, 50, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4393a.f1028U = mo2726q(i);
        m4393a.f993l = abstractC0244am;
        m4393a.f989h = 85.0f;
        m4393a.f1001t = 2.0f;
        m4393a.f999r = 6.0f;
        m4393a.f1000s = 0.2f;
        m4393a.f1023P = (short) 6;
        m4393a.f1005x = 1.0f;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -14483678);
        m1071A.f6164bR.m2307a(m4393a, -16716288);
        m1071A.f6159bM.m2702a(C0631e.f4060z, 0.3f, 1.3f + C0758f.m2074c(-0.07f, 0.07f), E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo2948E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: i */
    public void mo2752i(float f) {
        this.f1618ce += f;
        if (this.f1618ce > 180.0f) {
            this.f1618ce -= 360.0f;
        }
        if (this.f1618ce < -180.0f) {
            this.f1618ce += 360.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bi */
    public boolean mo2795bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bj */
    public boolean mo2794bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo2717w(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public float mo3149d(boolean z) {
        return this.f1649cJ[0].f1712a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        return super.mo437c(f);
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
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.5f;
    }
}
