package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e.class */
public class C0587e extends AbstractC0590f {

    /* renamed from: a */
    boolean f3833a;

    /* renamed from: b */
    boolean f3834b;

    /* renamed from: c */
    float f3835c;

    /* renamed from: d */
    static C0934e f3836d = null;

    /* renamed from: e */
    static C0934e f3837e = null;

    /* renamed from: f */
    static C0934e f3838f = null;

    /* renamed from: g */
    public static C0934e f3839g = null;

    /* renamed from: h */
    public static C0934e[] f3840h = new C0934e[10];

    /* renamed from: i */
    static C0934e[] f3841i = new C0934e[10];

    /* renamed from: j */
    public static final AbstractC0224s f3842j = new C05881(151);

    /* renamed from: k */
    public static final AbstractC0224s f3843k = new C05892(152);

    /* renamed from: l */
    static ArrayList f3844l = new ArrayList();

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f3833a);
        streamWriter.mo1335a(this.f3835c);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3146a(Reader reader) {
        this.f3833a = reader.ReadBool();
        this.f3834b = !mo3054Q();
        if (reader.m1310b() >= 21) {
            this.f3835c = reader.m1300g();
        }
        m3149K();
        super.m3133a(reader);
    }

    static {
        f3844l.add(f3842j);
        f3844l.add(f3843k);
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3840h[this.f1609bV.m5105O()];
    }

    /* renamed from: b */
    public static void m3141b() {
        Core m1087A = Core.m1087A();
        f3837e = m1087A.f6113bO.mo221a(C0067R.drawable.attack_submarine);
        f3838f = m4777a(f3837e, f3837e.mo386m(), f3837e.mo387l());
        f3836d = m1087A.f6113bO.mo221a(C0067R.drawable.attack_submarine_dead);
        f3839g = m1087A.f6113bO.mo221a(C0067R.drawable.unit_icon_water);
        f3840h = AbstractC0197n.m5082a(f3839g);
        f3841i = AbstractC0197n.m5082a(f3837e);
    }

    /* renamed from: F */
    public boolean mo3060F() {
        return Core.m1087A().settingEngine.renderExtraShadows && this.f6960en >= 0.0f;
    }

    /* renamed from: G */
    public float mo3059G() {
        return 0.0f;
    }

    /* renamed from: H */
    public float mo3058H() {
        return 0.0f;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3836d;
        }
        return f3841i[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return f3838f;
    }

    /* renamed from: h */
    public EnumC0246ao mo3039h() {
        return EnumC0246ao.f1707e;
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1771K;
    }

    /* renamed from: f */
    public boolean m3138f() {
        if (!mo3054Q()) {
            return true;
        }
        return false;
    }

    public C0587e(boolean z) {
        super(z);
        this.f3833a = false;
        this.f3834b = true;
        this.f3835c = 0.0f;
        m2687b(f3837e);
        this.f1621ch = 15.0f;
        this.f1622ci = this.f1621ch - 2.0f;
        this.f1633ct = 260.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3837e;
    }

    /* renamed from: K */
    public void m3149K() {
        if (!this.f3834b) {
            m447S(1);
        } else {
            m447S(2);
        }
    }

    /* renamed from: s */
    public void m3136s(float f) {
        float f2;
        Core m1087A = Core.m1087A();
        if (this.f3833a) {
            f2 = 1.0f;
        } else {
            f2 = -8.0f;
        }
        if (C0758f.m2137c(this.f6960en - f2) > 2.0f) {
            this.f3835c = C0758f.m2210a(this.f3835c, 0.08f, 0.003f * f);
        } else {
            this.f3835c = C0758f.m2210a(this.f3835c, 0.02f, 0.003f * f);
        }
        this.f6960en = C0758f.m2210a(this.f6960en, f2, this.f3835c * f);
        boolean z = false;
        if (this.f3834b && mo3054Q()) {
            this.f3834b = false;
            m3149K();
            z = true;
        }
        if (!this.f3834b && !mo3054Q()) {
            this.f3834b = true;
            m3149K();
            z = true;
        }
        if (z) {
            m1087A.f6116bR.m2383a(this.f6958el, this.f6959em, 0.0f, 0, 0.0f, 0.0f, this.f1618ce);
        }
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (!m4751bS() || this.f1607bT) {
        }
    }

    /* renamed from: m */
    public float mo3035m() {
        if (!mo3054Q()) {
            return 250.0f;
        }
        return 180.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 170.0f;
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        return 10.0f;
    }

    /* renamed from: z */
    public float mo3033z() {
        if (!mo3054Q()) {
            return 0.8f;
        }
        return 0.45f;
    }

    /* renamed from: A */
    public float mo3065A() {
        return 1.2f;
    }

    /* renamed from: B */
    public float mo3064B() {
        return 0.06f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 2.5f;
    }

    /* renamed from: w */
    public float mo3162w(int i) {
        return 0.08f;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 0.018f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 0.1f;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return null;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return true;
    }

    /* renamed from: Q */
    public boolean mo3054Q() {
        return this.f6960en < -1.0f;
    }

    /* renamed from: ah */
    public boolean m3142ah() {
        if (!mo3054Q()) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public boolean mo3155ae() {
        if (!mo3054Q()) {
            return false;
        }
        return true;
    }

    /* renamed from: af */
    public boolean mo3160af() {
        if (!mo3054Q()) {
            return true;
        }
        return false;
    }

    /* renamed from: ag */
    public boolean mo4430ag() {
        if (!mo3054Q()) {
            return true;
        }
        return true;
    }

    /* renamed from: q */
    public float mo3150q(int i) {
        return 42.0f;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        if (!mo3054Q()) {
            PointF E = mo3156E(i);
            C0188f m5203a = C0188f.m5203a(this, E.f227a, E.f228b, this.f6960en, i);
            PointF K = m3013K(i);
            m5203a.f1011K = K.f227a;
            m5203a.f1012L = K.f228b;
            m5203a.f1043ar = Color.m5948a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m5203a.f1021U = 42.0f;
            m5203a.f986l = abstractC0244am;
            m5203a.f982h = 190.0f;
            m5203a.f994t = 2.0f;
            m5203a.f1059aH = true;
            m5203a.f1064aM = true;
            m5203a.f1068aQ = true;
            Core m1087A = Core.m1087A();
            m1087A.f6111bM.m2776a(C0631e.f4047m, 0.8f, this.f6958el, this.f6959em);
            m1087A.f6116bR.m2385a(this.f6958el, this.f6959em, this.f6960en, -1118720);
            return;
        }
        PointF E2 = mo3156E(i);
        C0188f m5203a2 = C0188f.m5203a(this, E2.f227a, E2.f228b, this.f6960en, i);
        PointF K2 = m3013K(i);
        m5203a2.f1011K = K2.f227a;
        m5203a2.f1012L = K2.f228b;
        m5203a2.f1043ar = Color.m5948a(255, 30, 30, 150);
        m5203a2.f998x = 1.0f;
        m5203a2.f1021U = 42.0f;
        m5203a2.f986l = abstractC0244am;
        m5203a2.f982h = 250.0f;
        m5203a2.f994t = 1.3f;
        m5203a2.f1059aH = false;
        m5203a2.f1064aM = true;
        m5203a2.f1068aQ = true;
        Core.m1087A();
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core.m1087A().f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
        this.f3885L = f3836d;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    /* renamed from: a */
    public void mo3173a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f3842j) {
            this.f3833a = true;
        }
        if (abstractC0224s == f3843k) {
            this.f3833a = false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h.e$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e$1.class */
    final class C05881 extends AbstractC0229x {
        C05881(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Surface unit. Allows it to fire missiles";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Surface";
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return !((C0587e) abstractC0244am).f3833a;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h.e$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/e$2.class */
    final class C05892 extends AbstractC0229x {
        C05892(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Dive unit underwater. Evades most attacks";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Dive";
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0587e) abstractC0244am).f3833a;
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f3844l;
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
        C1117y.m470a(this, mo3035m());
    }
}
