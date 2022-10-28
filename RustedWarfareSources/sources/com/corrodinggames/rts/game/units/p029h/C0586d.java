package com.corrodinggames.rts.game.units.p029h;

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
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/d.class */
public class C0586d extends AbstractC0590f {

    /* renamed from: a */
    static C0934e f3827a = null;

    /* renamed from: b */
    static C0934e f3828b = null;

    /* renamed from: c */
    static C0934e f3829c = null;

    /* renamed from: d */
    static C0934e[] f3830d = new C0934e[10];

    /* renamed from: e */
    static PointF f3831e = new PointF();

    /* renamed from: f */
    Rect f3832f;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.missileShip;
    }

    /* renamed from: c */
    public static void m3024c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3828b = m1071A.f6161bO.mo221a(C0067R.drawable.scout_ship);
        f3827a = m1071A.f6161bO.mo221a(C0067R.drawable.scout_ship_dead);
        f3829c = m4116a(f3828b, f3828b.mo386m(), f3828b.mo387l());
        f3830d = AbstractC0197n.m4304a(f3828b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3827a;
        }
        return f3830d[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3829c;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A().f6164bR.m2300b(this.f6958el, this.f6959em, this.f6960en);
        this.f3886L = f3827a;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    public C0586d(boolean z) {
        super(z);
        this.f3832f = new Rect();
        m2620T(17);
        m2619U(31);
        this.f1621ch = 15.0f;
        this.f1622ci = this.f1621ch - 2.0f;
        this.f1633ct = 350.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3828b;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo2947E(int i) {
        float f = this.f1618ce;
        f3831e.m5040a(this.f6958el + (C0758f.m2030i(f) * 6.0f), this.f6959em + (C0758f.m2035h(f) * 6.0f));
        return f3831e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo2726q(int i) {
        return 62.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        PointF mo2947E = mo2947E(i);
        if (!abstractC0244am.mo2965Q()) {
            C0188f m4393a = C0188f.m4393a(this, mo2947E.f227a, mo2947E.f228b, this.f6960en, i);
            PointF K = mo2937K(i);
            m4393a.f1018K = K.f227a;
            m4393a.f1019L = K.f228b;
            m4393a.f1051ar = Color.m5106a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m4393a.f1028U = 62.0f;
            m4393a.f993l = abstractC0244am;
            m4393a.f989h = 190.0f;
            m4393a.f1001t = 2.0f;
            m4393a.f1067aH = true;
            m4393a.f1072aM = true;
            m4393a.f1076aQ = true;
            m1071A.f6159bM.m2703a(C0631e.f4047m, 0.8f, this.f6958el, this.f6959em);
            m1071A.f6164bR.m2315a(this.f6958el, this.f6959em, this.f6960en, -1118720);
            m1071A.f6164bR.m2307a(m4393a, -1118720);
            return;
        }
        C0188f m4393a2 = C0188f.m4393a(this, mo2947E.f227a, mo2947E.f228b, this.f6960en - 1.0f, i);
        m4393a2.f1051ar = Color.m5106a(255, 0, 0, 150);
        m4393a2.f1005x = 1.0f;
        m4393a2.f1028U = 42.0f;
        m4393a2.f993l = abstractC0244am;
        m4393a2.f989h = 220.0f;
        m4393a2.f1001t = 1.9f;
        m4393a2.f1072aM = true;
        m4393a2.f1076aQ = true;
        m1071A.f6159bM.m2703a(C0631e.f4047m, 0.8f, this.f6958el, this.f6959em);
        m1071A.f6164bR.m2315a(this.f6958el, this.f6959em, this.f6960en, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 200.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 1.2f;
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
    /* renamed from: c */
    public float mo2775c(int i) {
        return 99.0f;
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
        return super.mo437c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2958l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ae */
    public boolean mo2847ae() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo433e(float f) {
        super.mo433e(f);
        C1117y.m470a(this, mo2738m());
    }
}
