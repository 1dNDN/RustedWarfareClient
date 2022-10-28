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
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/a.class */
public class C0308a extends AbstractC0309b {

    /* renamed from: a */
    static C0934e f1834a = null;

    /* renamed from: b */
    static C0934e f1835b = null;

    /* renamed from: c */
    static C0934e f1836c = null;

    /* renamed from: d */
    static C0934e f1837d = null;

    /* renamed from: e */
    static C0934e[] f1838e = new C0934e[10];

    /* renamed from: f */
    float f1839f;

    /* renamed from: g */
    Rect f1840g;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.airShip;
    }

    /* renamed from: c */
    public static void m4008c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f1835b = m1071A.f6161bO.mo221a(C0067R.drawable.ship);
        f1836c = m1071A.f6161bO.mo221a(C0067R.drawable.ship_shadow);
        f1834a = m1071A.f6161bO.mo221a(C0067R.drawable.ship_dead);
        f1838e = AbstractC0197n.m4304a(f1835b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f1834a;
        }
        return f1838e[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f1836c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return f1837d;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A().f6164bR.m2300b(this.f6958el, this.f6959em, this.f6960en);
        this.f3886L = f1834a;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    public C0308a(boolean z) {
        super(z);
        this.f1840g = new Rect();
        m2620T(24);
        m2619U(22);
        this.f1621ch = 11.0f;
        this.f1622ci = this.f1621ch + 0.0f;
        this.f1633ct = 250.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f1835b;
        this.f3887M = f1836c;
        this.f6960en = 0.0f;
        this.f1839f = 0.18f;
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
        this.f6960en = C0758f.m2148a(this.f6960en, 20.0f, 0.3f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo2947E(i);
        C0188f m4393a = C0188f.m4393a(this, E.f227a, E.f228b, this.f6960en, i);
        PointF K = mo2937K(i);
        m4393a.f1018K = K.f227a;
        m4393a.f1019L = K.f228b;
        m4393a.f1028U = 30.0f;
        m4393a.f993l = abstractC0244am;
        m4393a.f989h = 75.0f;
        m4393a.f1001t = 6.0f;
        m4393a.f1005x = 2.0f;
        m4393a.f1006y = 4.0f;
        m4393a.f1051ar = Color.m5106a(250, 74, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 255);
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0745e m2320a = m1071A.f6164bR.m2320a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
        if (m2320a != null) {
            m2320a.f4787ar = 10;
        }
        m1071A.f6159bM.m2702a(C0631e.f4059y, 0.14f, 1.0f + C0758f.m2074c(-0.1f, 0.1f), E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 170.0f;
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
        return 2.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bm */
    public boolean mo2791bm() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo2717w(int i) {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo2948E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.16f;
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
    /* renamed from: ag */
    public boolean mo2845ag() {
        return false;
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
}
