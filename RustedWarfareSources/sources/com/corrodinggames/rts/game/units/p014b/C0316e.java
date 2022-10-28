package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/e.class */
public class C0316e extends AbstractC0309b {

    /* renamed from: a */
    static C0934e f1880a = null;

    /* renamed from: b */
    static C0934e f1881b = null;

    /* renamed from: c */
    static C0934e f1882c = null;

    /* renamed from: d */
    static C0934e f1883d = null;

    /* renamed from: e */
    static C0934e[] f1884e = new C0934e[10];

    /* renamed from: f */
    float f1885f;

    /* renamed from: g */
    Rect f1886g;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.gunShip;
    }

    /* renamed from: c */
    public static void m3992c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f1881b = m1071A.f6161bO.mo221a(C0067R.drawable.gunship);
        f1882c = m1071A.f6161bO.mo221a(C0067R.drawable.gunship_shadow);
        f1880a = m1071A.f6161bO.mo221a(C0067R.drawable.gunship_dead);
        f1884e = AbstractC0197n.m4304a(f1881b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f1880a;
        }
        return f1884e[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f1882c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A().f6164bR.m2300b(this.f6958el, this.f6959em, this.f6960en);
        this.f3886L = f1880a;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    public C0316e(boolean z) {
        super(z);
        this.f1885f = 0.0f;
        this.f1886g = new Rect();
        m2620T(25);
        m2619U(35);
        this.f1621ch = 15.0f;
        this.f1622ci = this.f1621ch + 0.0f;
        this.f1633ct = 260.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f1881b;
        this.f3887M = f1882c;
        this.f6960en = 0.0f;
        m447S(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: I */
    public boolean mo2940I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo2959i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (this.f1607bT) {
            return;
        }
        this.f1885f += 2.0f * f;
        if (this.f1885f > 360.0f) {
            this.f1885f -= 360.0f;
        }
        this.f6960en = C0758f.m2148a(this.f6960en, 20.0f + (C0758f.m2035h(this.f1885f) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo2947E(int i) {
        float mo2758g = mo2758g(i);
        float f = this.f1618ce;
        f3989bf.m5040a(this.f6958el + (C0758f.m2030i(f) * mo2758g), this.f6959em + (C0758f.m2035h(f) * mo2758g));
        return f3989bf;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo2726q(int i) {
        return 35.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        PointF mo2947E = mo2947E(i);
        C0188f m4393a = C0188f.m4393a(this, mo2947E.f227a, mo2947E.f228b, this.f6960en, i);
        PointF K = mo2937K(i);
        m4393a.f1018K = K.f227a;
        m4393a.f1019L = K.f228b;
        m4393a.f1051ar = Color.m5106a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        m4393a.f1028U = mo2726q(i);
        m4393a.f993l = abstractC0244am;
        m4393a.f989h = 80.0f;
        m4393a.f1001t = 4.0f;
        m4393a.f1005x = 2.0f;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2315a(mo2947E.f227a, mo2947E.f228b, this.f6960en, -1127220);
        m1071A.f6164bR.m2320a(mo2947E.f227a, mo2947E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
        m1071A.f6159bM.m2703a(C0631e.f4055u, 0.3f, this.f6958el, this.f6959em);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        if (this.f6960en < 15.0f) {
            return 0.0f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bi */
    public boolean mo2795bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo2948E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.1f;
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
}
