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
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/e.class */
public class C0522e extends AbstractC0525h {

    /* renamed from: a */
    float f3613a;

    /* renamed from: b */
    static C0934e f3614b = null;

    /* renamed from: c */
    static C0934e f3615c = null;

    /* renamed from: d */
    static C0934e f3616d = null;

    /* renamed from: e */
    static C0934e[] f3617e = new C0934e[10];

    /* renamed from: f */
    Rect f3618f;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.heavyHoverTank;
    }

    /* renamed from: c */
    public static void m3155c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3615c = m1071A.f6161bO.mo221a(C0067R.drawable.heavy_hover_tank);
        f3614b = m1071A.f6161bO.mo221a(C0067R.drawable.heavy_hover_tank_dead);
        f3616d = m1071A.f6161bO.mo221a(C0067R.drawable.heavy_hover_tank_shadow);
        f3617e = AbstractC0197n.m4304a(f3615c);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3614b;
        }
        return f3617e[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3616d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A();
        this.f3886L = f3614b;
        m447S(0);
        this.f1606bS = false;
        m2905a(EnumC0233ab.normal);
        return true;
    }

    public C0522e(boolean z) {
        super(z);
        this.f3613a = 0.0f;
        this.f3618f = new Rect();
        m2620T(24);
        m2619U(36);
        this.f1621ch = 11.0f;
        this.f1622ci = this.f1621ch + 2.0f;
        this.f1633ct = 450.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3615c;
        this.f3887M = f3616d;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0525h, com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (this.f1607bT || !m4103bS()) {
            return;
        }
        this.f3613a += 3.0f * f;
        if (this.f3613a > 360.0f) {
            this.f3613a -= 360.0f;
        }
        this.f6960en = C0758f.m2148a(this.f6960en, 4.0f + (C0758f.m2035h(this.f3613a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo2726q(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo2947E(i);
        C0188f m4393a = C0188f.m4393a(this, E.f227a, E.f228b, this.f6960en, i);
        PointF K = mo2937K(i);
        m4393a.f1018K = K.f227a;
        m4393a.f1019L = K.f228b;
        m4393a.f1051ar = Color.m5106a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0, 50);
        m4393a.f1028U = mo2726q(i);
        m4393a.f993l = abstractC0244am;
        m4393a.f989h = 95.0f;
        m4393a.f1001t = 1.0f;
        m4393a.f999r = 7.0f;
        m4393a.f1000s = 0.2f;
        m4393a.f1023P = (short) 7;
        m4393a.f1005x = 1.0f;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0745e m2315a = m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -56798);
        if (m2315a != null) {
            m2315a.f4749F = 0.7f;
            m2315a.f4766W = 30.0f;
            m2315a.f4767X = m2315a.f4766W;
            C0743c.m2309a(m2315a, this);
        }
        m1071A.f6164bR.m2307a(m4393a, -1179648);
        m1071A.f6159bM.m2703a(C0631e.f4060z, 0.3f, E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo2948E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 20.0f;
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
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 2.4f;
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
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo433e(float f) {
        super.mo433e(f);
        C1117y.m470a(this, mo2738m());
    }
}
