package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p026e.C0531l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/c.class */
public class C0310c extends AbstractC0309b {

    /* renamed from: q */
    float f1857q;

    /* renamed from: r */
    boolean f1858r;

    /* renamed from: s */
    boolean f1859s;

    /* renamed from: t */
    float f1860t;

    /* renamed from: u */
    float f1861u;

    /* renamed from: v */
    protected Paint f1862v;

    /* renamed from: w */
    PointF f1863w;

    /* renamed from: x */
    Rect f1864x;

    /* renamed from: a */
    static C0934e f1848a = null;

    /* renamed from: b */
    static C0934e f1849b = null;

    /* renamed from: c */
    static C0934e f1850c = null;

    /* renamed from: d */
    static C0934e f1851d = null;

    /* renamed from: e */
    static C0934e[] f1852e = new C0934e[10];

    /* renamed from: f */
    static C0934e[] f1853f = new C0934e[10];

    /* renamed from: g */
    static C0934e[] f1854g = new C0934e[10];

    /* renamed from: o */
    static C0934e f1855o = null;

    /* renamed from: p */
    static C0934e f1856p = null;

    /* renamed from: y */
    public static final AbstractC0224s f1865y = new AbstractC0229x(151) { // from class: com.corrodinggames.rts.game.units.b.c.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3029a() {
            return "-Surface unit.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3026b() {
            return "Fly";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            return !((C0310c) abstractC0244am).f1858r;
        }
    };

    /* renamed from: z */
    public static final AbstractC0224s f1866z = new AbstractC0229x(152) { // from class: com.corrodinggames.rts.game.units.b.c.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3029a() {
            return "-Dive unit underwater.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3026b() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0310c) abstractC0244am).f1858r && ((AbstractC0623y) abstractC0244am).m4373cI();
        }
    };

    /* renamed from: A */
    static ArrayList f1867A = new ArrayList();

    static {
        f1867A.add(f1865y);
        f1867A.add(f1866z);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1314a(this.f1858r);
        streamWriter.mo1320a(this.f1860t);
        streamWriter.mo1320a(this.f1861u);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f1858r = reader.ReadBool();
        this.f1859s = !mo2995Q();
        if (reader.m1295b() >= 21) {
            this.f1860t = reader.m1285g();
        }
        if (reader.m1295b() >= 22) {
            this.f1861u = reader.m1285g();
        }
        m4204L();
        super.mo2291a(reader);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: Q */
    public boolean mo2995Q() {
        return this.f6959en < -1.0f;
    }

    /* renamed from: b */
    public boolean m4200b() {
        if (!this.f1858r || this.f6959en < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo2982h() {
        if (this.f1627cn) {
            return EnumC0246ao.f1706d;
        }
        if (m4200b()) {
            return EnumC0246ao.f1707e;
        }
        return EnumC0246ao.f1706d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1773M;
    }

    /* renamed from: f */
    public static void m4198f() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f1849b = m1072A.f6113bO.mo221a(C0067R.drawable.amphibious_jet);
        f1850c = m1072A.f6113bO.mo221a(C0067R.drawable.amphibious_jet_shadow);
        f1848a = m1072A.f6113bO.mo221a(C0067R.drawable.amphibious_jet_dead);
        f1852e = AbstractC0197n.m4627a(f1849b);
        C0934e mo221a = m1072A.f6113bO.mo221a(C0067R.drawable.amphibious_jet_p1);
        C0934e mo221a2 = m1072A.f6113bO.mo221a(C0067R.drawable.amphibious_jet_p2);
        f1853f = AbstractC0197n.m4627a(mo221a);
        f1854g = AbstractC0197n.m4627a(mo221a2);
        f1855o = m4419a(mo221a);
        f1856p = m4419a(mo221a2);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: aQ */
    public boolean mo4201aQ() {
        if (super.mo4201aQ()) {
            m4197f(true);
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo2285c(float f) {
        if (!super.mo2285c(f)) {
            return false;
        }
        if (this.f1607bT) {
            return true;
        }
        m4197f(false);
        if (!this.f1607bT) {
            for (int i = 0; i < mo3084bl(); i++) {
                if (i != m4203M()) {
                    float mo2985e = this.f1649cJ[i].f1717f / mo2985e(i);
                    if (mo2985e != 0.0f) {
                        LoggerMaybe m1072A = LoggerMaybe.m1072A();
                        PointF E = mo3073E(i);
                        m1072A.f6113bO.mo137i();
                        m1072A.f6113bO.mo168b(E.f227a - m1072A.f6144cv, (E.f228b - m1072A.f6145cw) - this.f6959en);
                        m1072A.f6113bO.mo228a(mo2985e * 0.7f, mo2985e * 0.7f);
                        m1072A.f6113bO.mo198a(C0531l.f3663e, 0.0f, 0.0f, (Paint) null);
                        m1072A.f6113bO.mo136j();
                    }
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public void m4197f(boolean z) {
        Paint paint;
        C0934e c0934e;
        float f;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!z) {
            paint = m2884aN();
        } else {
            this.f1862v.m5420a(50, 255, 255, 255);
            paint = this.f1862v;
        }
        for (int i = 0; i <= 1; i++) {
            PointF m4202a = m4202a(i, z);
            float f2 = m4202a.f227a - m1072A.f6144cv;
            float f3 = m4202a.f228b - m1072A.f6145cw;
            float mo3216d = mo3216d(false) - 90.0f;
            if (!z) {
                f3 -= this.f6959en;
            }
            if (i == 0) {
                if (z) {
                    c0934e = f1856p;
                } else {
                    c0934e = f1854g[this.f1609bV.m4650O()];
                }
                f = mo3216d + 0.0f;
            } else {
                if (z) {
                    c0934e = f1855o;
                } else {
                    c0934e = f1853f[this.f1609bV.m4650O()];
                }
                f = mo3216d - 0.0f;
            }
            m1072A.f6113bO.mo199a(c0934e, f2, f3, f, paint);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo3084bl() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo3089G(int i) {
        if (i == m4203M()) {
            return super.mo3089G(i);
        }
        float mo3216d = mo3216d(false) - 90.0f;
        PointF m4202a = m4202a(i, false);
        float f = m4202a.f227a;
        float f2 = m4202a.f228b;
        f3986bg.m5369a(f + (C0758f.m2040i(mo3216d) * 5.0f), f2 + (C0758f.m2045h(mo3216d) * 5.0f));
        return f3986bg;
    }

    /* renamed from: a */
    public PointF m4202a(int i, boolean z) {
        float mo3216d = mo3216d(false) - 90.0f;
        if (i == m4203M()) {
            throw new RuntimeException("index==2 is for base");
        }
        float f = this.f6957el;
        float f2 = this.f6958em;
        float m2106b = C0758f.m2106b(this.f1861u * 4.0f, 0.0f, 1.0f);
        float m2106b2 = C0758f.m2106b((this.f1861u * 2.0f) - 1.0f, 0.0f, 1.0f);
        float m2040i = f + (C0758f.m2040i(mo3216d) * (7.0f - (5.0f * m2106b)));
        float m2045h = f2 + (C0758f.m2045h(mo3216d) * (7.0f - (5.0f * m2106b)));
        float f3 = (-90) + (SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT * i);
        this.f1863w.m5369a(m2040i + (C0758f.m2040i(mo3216d + f3) * (12.0f - (5.0f * m2106b2))), m2045h + (C0758f.m2045h(mo3216d + f3) * (12.0f - (5.0f * m2106b2))));
        return this.f1863w;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f1848a;
        }
        return f1852e[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return f1850c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2988d(int i) {
        return f1851d;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2986e() {
        LoggerMaybe.m1072A().f6116bR.m2318b(this.f6957el, this.f6958em, this.f6959en);
        this.f3885L = f1848a;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    public C0310c(boolean z) {
        super(z);
        this.f1858r = true;
        this.f1859s = true;
        this.f1860t = 0.0f;
        this.f1861u = 0.0f;
        this.f1862v = new C0930ag();
        this.f1863w = new PointF();
        this.f1864x = new Rect();
        m2633b(f1849b);
        this.f1621ch = 12.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 530.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f1849b;
        this.f3886M = f1850c;
        this.f6959en = 0.0f;
        m447S(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo2981i() {
        return !m4200b();
    }

    /* renamed from: L */
    public void m4204L() {
        if (!this.f1859s) {
            m447S(1);
        } else {
            m447S(5);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        float f2;
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
            return;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f1857q += 2.0f * f;
        if (this.f1857q > 360.0f) {
            this.f1857q -= 360.0f;
        }
        if (this.f1858r) {
            f2 = 20.0f + (C0758f.m2045h(this.f1857q) * 1.5f);
        } else {
            f2 = -8.0f;
        }
        if (this.f1858r && !mo2995Q()) {
            this.f1861u = C0758f.m2158a(this.f1861u, 0.0f, 0.018f * f);
        } else {
            this.f1861u = C0758f.m2158a(this.f1861u, 1.0f, 0.018f * f);
        }
        if (C0758f.m2085c(this.f6959en - f2) > 3.0f) {
            float f3 = 0.6f;
            if (mo2995Q()) {
                f3 = 0.6f / 6.0f;
            }
            this.f1860t = C0758f.m2107b(this.f1860t, f3);
            this.f1860t = C0758f.m2158a(this.f1860t, f3, 0.006f * f);
        } else {
            this.f1860t = C0758f.m2158a(this.f1860t, 0.07f, 0.006f * f);
        }
        this.f6959en = C0758f.m2158a(this.f6959en, f2, this.f1860t * f);
        boolean z = false;
        if (this.f1859s && mo2995Q()) {
            if (!m4373cI()) {
                this.f1858r = true;
            } else {
                this.f1859s = false;
                m4204L();
                z = true;
            }
        }
        if (!this.f1859s && !mo2995Q()) {
            this.f1859s = true;
            m4204L();
            z = true;
        }
        if (z) {
            m1072A.f6116bR.m2332a(this.f6957el, this.f6958em, 0.0f, 0, 0.0f, 0.0f);
            for (int i = -180; i < 180; i += 45) {
                float f4 = this.f1618ce + i;
                C0745e m2317b = m1072A.f6116bR.m2317b((float) (this.f6957el + (Math.cos(Math.toRadians(f4)) * (-5.0d))), (float) (this.f6958em + (Math.sin(Math.toRadians(f4)) * (-5.0d))), 0.0f, f4);
                if (m2317b != null) {
                    m2317b.f4792as = (short) 2;
                    m2317b.f4726t = true;
                    m2317b.f4727u = 7.0f;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3060q(int i) {
        if (i == m4203M()) {
            return 0.0f;
        }
        return 45.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        if (i == m4203M()) {
            return;
        }
        PointF E = mo3073E(i);
        C0188f m4716a = C0188f.m4716a(this, E.f227a, E.f228b, this.f6959en, i);
        m4716a.f1043ar = Color.m5435a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        m4716a.f1021U = mo3060q(i);
        m4716a.f986l = abstractC0244am;
        m4716a.f982h = 10.0f;
        m4716a.f994t = 4.0f;
        m4716a.f998x = 2.0f;
        m4716a.f1068aQ = false;
        m4716a.f1001A = true;
        m4716a.f1013M = true;
        m4716a.f1035ai = 0.5f;
        m4716a.f1037ak = 1.0f;
        m4716a.f1038al = 0.1f;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6116bR.m2333a(E.f227a, E.f228b, this.f6959en, -1118482);
        m1072A.f6111bM.m2722a(C0631e.f4058x, 0.2f, this.f6957el, this.f6958em);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2978m() {
        if (m4200b()) {
            return 100.0f;
        }
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2992b(int i) {
        return 110.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo2985e(int i) {
        return 25 + (i * 10);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: f */
    public float mo2984f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2976z() {
        if (!mo2995Q()) {
            return 1.4f;
        }
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3006A() {
        if (!mo2995Q()) {
            return 3.8f;
        }
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3005B() {
        return 0.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2991c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo3059w(int i) {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: y */
    public float mo4196y(int i) {
        return 0.38f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo3002E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3004C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3003D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2979l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bi */
    public boolean mo3219bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bj */
    public boolean mo3218bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: i */
    public void mo3215i(float f) {
        if (!m2944Z()) {
            super.mo3215i(f);
            return;
        }
        this.f1618ce += f;
        if (this.f1618ce > 180.0f) {
            this.f1618ce -= 360.0f;
        }
        if (this.f1618ce < -180.0f) {
            this.f1618ce += 360.0f;
        }
    }

    /* renamed from: M */
    public int m4203M() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public float mo3216d(boolean z) {
        return this.f1649cJ[m4203M()].f1712a + 90.0f;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3067a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f1865y) {
            this.f1858r = true;
        }
        if (abstractC0224s == f1866z) {
            this.f1858r = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3068N() {
        return f1867A;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo2283e(float f) {
        super.mo2283e(f);
        C1117y.m470a(this, mo2978m());
    }
}
