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
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/l.class */
public class C0531l extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3659a = null;

    /* renamed from: b */
    static C0934e f3660b = null;

    /* renamed from: c */
    static C0934e[] f3661c = new C0934e[10];

    /* renamed from: d */
    static C0934e f3662d = null;

    /* renamed from: e */
    public static C0934e f3663e = null;

    /* renamed from: f */
    int f3664f;

    /* renamed from: g */
    float f3665g;

    /* renamed from: h */
    Rect f3666h;

    /* renamed from: b */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1765E;
    }

    /* renamed from: c */
    public static void m3285c() {
        Core m1087A = Core.m1087A();
        C0934e mo221a = m1087A.f6113bO.mo221a(C0067R.drawable.mammoth_tank);
        f3661c = AbstractC0197n.m5082a(mo221a);
        f3659a = m1087A.f6113bO.mo221a(C0067R.drawable.mammoth_tank_dead);
        f3660b = m1087A.f6113bO.mo221a(C0067R.drawable.mammoth_tank_turret);
        f3663e = m1087A.f6113bO.mo221a(C0067R.drawable.lighting_charge);
        f3662d = m4777a(mo221a, mo221a.mo386m() / 2, mo221a.mo387l());
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3659a;
        }
        return f3661c[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return f3662d;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return f3660b;
    }

    /* renamed from: F */
    public boolean mo3060F() {
        return Core.m1087A().settingEngine.renderExtraShadows && this.f6960en > -2.0f && !this.f1607bT;
    }

    /* renamed from: G */
    public float mo3059G() {
        return 3.0f;
    }

    /* renamed from: H */
    public float mo3058H() {
        return 3.0f;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core.m1087A();
        this.f3885L = f3659a;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1506e);
        return true;
    }

    public C0531l(boolean z) {
        super(z);
        this.f3666h = new Rect();
        m2688a(f3661c[7], 2);
        this.f1621ch = 21.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 2900.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3661c[7];
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (this.f1648cI) {
            this.f3665g += f;
            if (this.f3665g > 3.0f) {
                this.f3665g = 0.0f;
                this.f3664f = 1 - this.f3664f;
            }
        }
    }

    /* renamed from: bN */
    public float mo3158bN() {
        return 14000.0f;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3156E(i);
        C0188f m5205a = C0188f.m5205a(this, E.f227a, E.f228b);
        m5205a.f1043ar = Color.m5948a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        m5205a.f1021U = 260.0f;
        m5205a.f986l = abstractC0244am;
        m5205a.f982h = 20.0f;
        m5205a.f994t = 4.0f;
        m5205a.f998x = 2.0f;
        m5205a.f1068aQ = true;
        m5205a.f1001A = true;
        m5205a.f1013M = true;
        m5205a.f1035ai = 0.5f;
        m5205a.f1037ak = 1.0f;
        m5205a.f1038al = 0.0f;
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2385a(E.f227a, E.f228b, this.f6960en, -1118482);
        m1087A.f6111bM.m2776a(C0631e.f4058x, 0.2f, this.f6958el, this.f6959em);
    }

    /* renamed from: m */
    public float mo3035m() {
        return 210.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 140.0f;
    }

    /* renamed from: z */
    public float mo3033z() {
        return 0.5f;
    }

    /* renamed from: bc */
    public float mo3153bc() {
        return 1.0f;
    }

    /* renamed from: A */
    public float mo3065A() {
        return 1.0f;
    }

    /* renamed from: B */
    public float mo3064B() {
        return 0.5f;
    }

    /* renamed from: w */
    public float mo3162w(int i) {
        return 0.08f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 2.5f;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 0.04f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 0.08f;
    }

    /* renamed from: a_ */
    public Rect mo3282a_(boolean z) {
        if (this.f1607bT && !z) {
            return super.mo3282a_(z);
        }
        return super.m4774a(z, this.f3664f);
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        if (!super.mo3049c(f)) {
            return false;
        }
        C1117y.m462a((AbstractC0623y) this);
        C1117y.m460a(this, f3663e, this.f1649cJ[0].f1717f / mo3042e(0), 0);
        return true;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return true;
    }

    /* renamed from: af */
    public boolean mo3160af() {
        return true;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 22.0f;
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        return 60.0f;
    }
}
