package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/a.class */
public class C0518a extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3577a = null;

    /* renamed from: b */
    static C0934e f3578b = null;

    /* renamed from: c */
    static C0934e f3579c = null;

    /* renamed from: d */
    static C0934e[] f3580d = new C0934e[10];

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.artillery;
    }

    /* renamed from: c */
    public static void m3169c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3577a = m1071A.f6161bO.mo221a(C0067R.drawable.artillery2);
        f3578b = m1071A.f6161bO.mo221a(C0067R.drawable.artillery1_dead);
        f3580d = AbstractC0197n.m4304a(f3577a);
        f3579c = m4117a(f3577a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3578b;
        }
        return f3580d[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3579c;
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
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A();
        this.f3886L = f3578b;
        m447S(0);
        this.f1606bS = false;
        m2905a(EnumC0233ab.normal);
        return true;
    }

    public C0518a(boolean z) {
        super(z);
        m2620T(28);
        m2619U(50);
        this.f1621ch = 18.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 140.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3577a;
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
        PointF K = mo2937K(i);
        m4395a.f1018K = K.f227a;
        m4395a.f1019L = K.f228b;
        m4395a.f989h = 150.0f;
        m4395a.f1001t = 4.0f;
        m4395a.f1076aQ = true;
        m4395a.f1051ar = Color.m5106a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        m4395a.f1025R = (short) 2;
        m4395a.f1023P = (short) 1;
        m4395a.f1005x = 0.9f;
        PointF m4128a = abstractC0244am.m4128a(E.f227a, E.f228b, m4395a.f1001t, m4395a.f989h, mo2738m());
        m4395a.f1062aC = true;
        m4395a.f994m = true;
        m4395a.f995n = m4128a.f227a;
        m4395a.f996o = m4128a.f228b;
        m4395a.f1032Y = 80.0f;
        m4395a.f1033Z = 45.0f;
        m4395a.f1034aa = true;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6159bM.m2703a(C0631e.f4052r, 0.3f, E.f227a, E.f228b);
        m1071A.f6164bR.m2320a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
        C0745e m2315a = m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -1118482);
        if (m2315a != null) {
            m2315a.f4766W = 15.0f;
            m2315a.f4767X = m2315a.f4766W;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bV */
    public float mo3126bV() {
        if (this.f1649cJ[0].f1716e > 0.0f) {
            return 1.0f - (this.f1649cJ[0].f1716e / mo2821b(0));
        }
        return super.mo3126bV();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 290.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 99.0f;
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
    /* renamed from: E */
    public boolean mo2948E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo433e(float f) {
        super.mo433e(f);
        C1117y.m470a(this, mo2738m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3027bN() {
        return 14000.0f;
    }
}
