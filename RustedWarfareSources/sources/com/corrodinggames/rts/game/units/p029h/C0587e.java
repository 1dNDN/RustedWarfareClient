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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public static final AbstractC0224s f3842j = new AbstractC0229x(151) { // from class: com.corrodinggames.rts.game.units.h.e.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3029a() {
            return "-Surface unit. Allows it to fire missiles";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3026b() {
            return "Surface";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            return !((C0587e) abstractC0244am).f3833a;
        }
    };

    /* renamed from: k */
    public static final AbstractC0224s f3843k = new AbstractC0229x(152) { // from class: com.corrodinggames.rts.game.units.h.e.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3029a() {
            return "-Dive unit underwater. Evades most attacks";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3026b() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0587e) abstractC0244am).f3833a;
        }
    };

    /* renamed from: l */
    static ArrayList f3844l = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1314a(this.f3833a);
        streamWriter.mo1320a(this.f3835c);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3833a = reader.ReadBool();
        this.f3834b = !mo2995Q();
        if (reader.m1295b() >= 21) {
            this.f3835c = reader.m1285g();
        }
        m3069K();
        super.mo2291a(reader);
    }

    static {
        f3844l.add(f3842j);
        f3844l.add(f3843k);
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0934e mo2977v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3840h[this.f1609bV.m4650O()];
    }

    /* renamed from: b */
    public static void m3062b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3837e = m1072A.f6113bO.mo221a(C0067R.drawable.attack_submarine);
        f3838f = m4418a(f3837e, f3837e.mo386m(), f3837e.mo387l());
        f3836d = m1072A.f6113bO.mo221a(C0067R.drawable.attack_submarine_dead);
        f3839g = m1072A.f6113bO.mo221a(C0067R.drawable.unit_icon_water);
        f3840h = AbstractC0197n.m4627a(f3839g);
        f3841i = AbstractC0197n.m4627a(f3837e);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3001F() {
        return LoggerMaybe.m1072A().f6115bQ.renderExtraShadows && this.f6959en >= 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3000G() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo2999H() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3836d;
        }
        return f3841i[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return f3838f;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo2982h() {
        return EnumC0246ao.f1707e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1771K;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f
    /* renamed from: f */
    public boolean mo3056f() {
        if (!mo2995Q()) {
            return true;
        }
        return false;
    }

    public C0587e(boolean z) {
        super(z);
        this.f3833a = false;
        this.f3834b = true;
        this.f3835c = 0.0f;
        m2633b(f3837e);
        this.f1621ch = 15.0f;
        this.f1622ci = this.f1621ch - 2.0f;
        this.f1633ct = 260.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3837e;
    }

    /* renamed from: K */
    public void m3069K() {
        if (!this.f3834b) {
            m447S(1);
        } else {
            m447S(2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f
    /* renamed from: s */
    public void mo3055s(float f) {
        float f2;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f3833a) {
            f2 = 1.0f;
        } else {
            f2 = -8.0f;
        }
        if (C0758f.m2085c(this.f6959en - f2) > 2.0f) {
            this.f3835c = C0758f.m2158a(this.f3835c, 0.08f, 0.003f * f);
        } else {
            this.f3835c = C0758f.m2158a(this.f3835c, 0.02f, 0.003f * f);
        }
        this.f6959en = C0758f.m2158a(this.f6959en, f2, this.f3835c * f);
        boolean z = false;
        if (this.f3834b && mo2995Q()) {
            this.f3834b = false;
            m3069K();
            z = true;
        }
        if (!this.f3834b && !mo2995Q()) {
            this.f3834b = true;
            m3069K();
            z = true;
        }
        if (z) {
            m1072A.f6116bR.m2331a(this.f6957el, this.f6958em, 0.0f, 0, 0.0f, 0.0f, this.f1618ce);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2978m() {
        if (!mo2995Q()) {
            return 250.0f;
        }
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2992b(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo2985e(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2976z() {
        if (!mo2995Q()) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3006A() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3005B() {
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2991c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3059w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3004C() {
        return 0.018f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3003D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2988d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2979l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: Q */
    public boolean mo2995Q() {
        return this.f6959en < -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ah */
    public boolean mo3063ah() {
        if (!mo2995Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ae */
    public boolean mo3066ae() {
        if (!mo2995Q()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo3065af() {
        if (!mo2995Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: ag */
    public boolean mo3064ag() {
        if (!mo2995Q()) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3060q(int i) {
        return 42.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        if (!mo2995Q()) {
            PointF E = mo3073E(i);
            C0188f m4716a = C0188f.m4716a(this, E.f227a, E.f228b, this.f6959en, i);
            PointF K = mo3237K(i);
            m4716a.f1011K = K.f227a;
            m4716a.f1012L = K.f228b;
            m4716a.f1043ar = Color.m5435a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m4716a.f1021U = 42.0f;
            m4716a.f986l = abstractC0244am;
            m4716a.f982h = 190.0f;
            m4716a.f994t = 2.0f;
            m4716a.f1059aH = true;
            m4716a.f1064aM = true;
            m4716a.f1068aQ = true;
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            m1072A.f6111bM.m2722a(C0631e.f4047m, 0.8f, this.f6957el, this.f6958em);
            m1072A.f6116bR.m2333a(this.f6957el, this.f6958em, this.f6959en, -1118720);
            return;
        }
        PointF E2 = mo3073E(i);
        C0188f m4716a2 = C0188f.m4716a(this, E2.f227a, E2.f228b, this.f6959en, i);
        PointF K2 = mo3237K(i);
        m4716a2.f1011K = K2.f227a;
        m4716a2.f1012L = K2.f228b;
        m4716a2.f1043ar = Color.m5435a(255, 30, 30, 150);
        m4716a2.f998x = 1.0f;
        m4716a2.f1021U = 42.0f;
        m4716a2.f986l = abstractC0244am;
        m4716a2.f982h = 250.0f;
        m4716a2.f994t = 1.3f;
        m4716a2.f1059aH = false;
        m4716a2.f1064aM = true;
        m4716a2.f1068aQ = true;
        LoggerMaybe.m1072A();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2986e() {
        LoggerMaybe.m1072A().f6116bR.m2318b(this.f6957el, this.f6958em, this.f6959en);
        this.f3885L = f3836d;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3067a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f3842j) {
            this.f3833a = true;
        }
        if (abstractC0224s == f3843k) {
            this.f3833a = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3068N() {
        return f3844l;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo2283e(float f) {
        super.mo2283e(f);
        C1117y.m470a(this, mo2978m());
    }
}
