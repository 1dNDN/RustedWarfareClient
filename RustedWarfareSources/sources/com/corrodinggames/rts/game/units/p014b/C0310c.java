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
import com.corrodinggames.rts.gameFramework.Core;
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
    public static final AbstractC0224s f1865y = new C03111(151);

    /* renamed from: z */
    public static final AbstractC0224s f1866z = new C03122(152);

    /* renamed from: A */
    static ArrayList f1867A = new ArrayList();

    static {
        f1867A.add(f1865y);
        f1867A.add(f1866z);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f1858r);
        streamWriter.mo1335a(this.f1860t);
        streamWriter.mo1335a(this.f1861u);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m4421a(Reader reader) {
        this.f1858r = reader.ReadBool();
        this.f1859s = !mo3054Q();
        if (reader.m1310b() >= 21) {
            this.f1860t = reader.m1300g();
        }
        if (reader.m1310b() >= 22) {
            this.f1861u = reader.m1300g();
        }
        m4424L();
        super.m4425a(reader);
    }

    /* renamed from: Q */
    public boolean mo3054Q() {
        return this.f6960en < -1.0f;
    }

    /* renamed from: b */
    public boolean m4417b() {
        if (!this.f1858r || this.f6960en < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public EnumC0246ao mo3039h() {
        if (this.f1627cn) {
            return EnumC0246ao.f1706d;
        }
        if (m4417b()) {
            return EnumC0246ao.f1707e;
        }
        return EnumC0246ao.f1706d;
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1773M;
    }

    /* renamed from: f */
    public static void m4415f() {
        Core m1087A = Core.m1087A();
        f1849b = m1087A.f6113bO.mo221a(C0067R.drawable.amphibious_jet);
        f1850c = m1087A.f6113bO.mo221a(C0067R.drawable.amphibious_jet_shadow);
        f1848a = m1087A.f6113bO.mo221a(C0067R.drawable.amphibious_jet_dead);
        f1852e = AbstractC0197n.m5082a(f1849b);
        C0934e mo221a = m1087A.f6113bO.mo221a(C0067R.drawable.amphibious_jet_p1);
        C0934e mo221a2 = m1087A.f6113bO.mo221a(C0067R.drawable.amphibious_jet_p2);
        f1853f = AbstractC0197n.m5082a(mo221a);
        f1854g = AbstractC0197n.m5082a(mo221a2);
        f1855o = m4778a(mo221a);
        f1856p = m4778a(mo221a2);
    }

    /* renamed from: aQ */
    public boolean m4420aQ() {
        if (super.m2937aQ()) {
            m4414f(true);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        if (!super.mo3049c(f)) {
            return false;
        }
        if (this.f1607bT) {
            return true;
        }
        m4414f(false);
        if (!this.f1607bT) {
            for (int i = 0; i < mo3169bl(); i++) {
                if (i != m4423M()) {
                    float mo3042e = this.f1649cJ[i].f1717f / mo3042e(i);
                    if (mo3042e != 0.0f) {
                        Core m1087A = Core.m1087A();
                        PointF E = mo3156E(i);
                        m1087A.f6113bO.mo137i();
                        m1087A.f6113bO.mo168b(E.f227a - m1087A.f6144cv, (E.f228b - m1087A.f6145cw) - this.f6960en);
                        m1087A.f6113bO.mo228a(mo3042e * 0.7f, mo3042e * 0.7f);
                        m1087A.f6113bO.mo198a(C0531l.f3663e, 0.0f, 0.0f, (Paint) null);
                        m1087A.f6113bO.mo136j();
                    }
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public void m4414f(boolean z) {
        Paint paint;
        C0934e c0934e;
        float f;
        Core m1087A = Core.m1087A();
        if (!z) {
            paint = m2940aN();
        } else {
            this.f1862v.m5933a(50, 255, 255, 255);
            paint = this.f1862v;
        }
        for (int i = 0; i <= 1; i++) {
            PointF m4422a = m4422a(i, z);
            float f2 = m4422a.f227a - m1087A.f6144cv;
            float f3 = m4422a.f228b - m1087A.f6145cw;
            float mo3317d = mo3317d(false) - 90.0f;
            if (!z) {
                f3 -= this.f6960en;
            }
            if (i == 0) {
                if (z) {
                    c0934e = f1856p;
                } else {
                    c0934e = f1854g[this.f1609bV.m5105O()];
                }
                f = mo3317d + 0.0f;
            } else {
                if (z) {
                    c0934e = f1855o;
                } else {
                    c0934e = f1853f[this.f1609bV.m5105O()];
                }
                f = mo3317d - 0.0f;
            }
            m1087A.f6113bO.mo199a(c0934e, f2, f3, f, paint);
        }
    }

    /* renamed from: bl */
    public int mo3169bl() {
        return 3;
    }

    /* renamed from: G */
    public PointF mo3176G(int i) {
        if (i == m4423M()) {
            return super.mo3176G(i);
        }
        float mo3317d = mo3317d(false) - 90.0f;
        PointF m4422a = m4422a(i, false);
        float f = m4422a.f227a;
        float f2 = m4422a.f228b;
        f3986bg.m5879a(f + (C0758f.m2092i(mo3317d) * 5.0f), f2 + (C0758f.m2097h(mo3317d) * 5.0f));
        return f3986bg;
    }

    /* renamed from: a */
    public PointF m4422a(int i, boolean z) {
        float mo3317d = mo3317d(false) - 90.0f;
        if (i == m4423M()) {
            throw new RuntimeException("index==2 is for base");
        }
        float f = this.f6958el;
        float f2 = this.f6959em;
        float m2158b = C0758f.m2158b(this.f1861u * 4.0f, 0.0f, 1.0f);
        float m2158b2 = C0758f.m2158b((this.f1861u * 2.0f) - 1.0f, 0.0f, 1.0f);
        float m2092i = f + (C0758f.m2092i(mo3317d) * (7.0f - (5.0f * m2158b)));
        float m2097h = f2 + (C0758f.m2097h(mo3317d) * (7.0f - (5.0f * m2158b)));
        float f3 = (-90) + (SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT * i);
        this.f1863w.m5879a(m2092i + (C0758f.m2092i(mo3317d + f3) * (12.0f - (5.0f * m2158b2))), m2097h + (C0758f.m2097h(mo3317d + f3) * (12.0f - (5.0f * m2158b2))));
        return this.f1863w;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f1848a;
        }
        return f1852e[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return f1850c;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return f1851d;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core.m1087A().f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
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
        m2687b(f1849b);
        this.f1621ch = 12.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 530.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f1849b;
        this.f3886M = f1850c;
        this.f6960en = 0.0f;
        m447S(5);
    }

    /* renamed from: i */
    public boolean mo3038i() {
        return !m4417b();
    }

    /* renamed from: L */
    public void m4424L() {
        if (!this.f1859s) {
            m447S(1);
        } else {
            m447S(5);
        }
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        float f2;
        super.mo1762a(f);
        if (!m4751bS() || this.f1607bT) {
            return;
        }
        Core m1087A = Core.m1087A();
        this.f1857q += 2.0f * f;
        if (this.f1857q > 360.0f) {
            this.f1857q -= 360.0f;
        }
        if (this.f1858r) {
            f2 = 20.0f + (C0758f.m2097h(this.f1857q) * 1.5f);
        } else {
            f2 = -8.0f;
        }
        if (this.f1858r && !mo3054Q()) {
            this.f1861u = C0758f.m2210a(this.f1861u, 0.0f, 0.018f * f);
        } else {
            this.f1861u = C0758f.m2210a(this.f1861u, 1.0f, 0.018f * f);
        }
        if (C0758f.m2137c(this.f6960en - f2) > 3.0f) {
            float f3 = 0.6f;
            if (mo3054Q()) {
                f3 = 0.6f / 6.0f;
            }
            this.f1860t = C0758f.m2159b(this.f1860t, f3);
            this.f1860t = C0758f.m2210a(this.f1860t, f3, 0.006f * f);
        } else {
            this.f1860t = C0758f.m2210a(this.f1860t, 0.07f, 0.006f * f);
        }
        this.f6960en = C0758f.m2210a(this.f6960en, f2, this.f1860t * f);
        boolean z = false;
        if (this.f1859s && mo3054Q()) {
            if (!m4725cI()) {
                this.f1858r = true;
            } else {
                this.f1859s = false;
                m4424L();
                z = true;
            }
        }
        if (!this.f1859s && !mo3054Q()) {
            this.f1859s = true;
            m4424L();
            z = true;
        }
        if (z) {
            m1087A.f6116bR.m2384a(this.f6958el, this.f6959em, 0.0f, 0, 0.0f, 0.0f);
            for (int i = -180; i < 180; i += 45) {
                float f4 = this.f1618ce + i;
                C0745e m2369b = m1087A.f6116bR.m2369b((float) (this.f6958el + (Math.cos(Math.toRadians(f4)) * (-5.0d))), (float) (this.f6959em + (Math.sin(Math.toRadians(f4)) * (-5.0d))), 0.0f, f4);
                if (m2369b != null) {
                    m2369b.f4788as = (short) 2;
                    m2369b.f4737t = true;
                    m2369b.f4738u = 7.0f;
                }
            }
        }
    }

    /* renamed from: q */
    public float mo3150q(int i) {
        if (i == m4423M()) {
            return 0.0f;
        }
        return 45.0f;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        if (i == m4423M()) {
            return;
        }
        PointF E = mo3156E(i);
        C0188f m5203a = C0188f.m5203a(this, E.f227a, E.f228b, this.f6960en, i);
        m5203a.f1043ar = Color.m5948a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        m5203a.f1021U = mo3150q(i);
        m5203a.f986l = abstractC0244am;
        m5203a.f982h = 10.0f;
        m5203a.f994t = 4.0f;
        m5203a.f998x = 2.0f;
        m5203a.f1068aQ = false;
        m5203a.f1001A = true;
        m5203a.f1013M = true;
        m5203a.f1035ai = 0.5f;
        m5203a.f1037ak = 1.0f;
        m5203a.f1038al = 0.1f;
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2385a(E.f227a, E.f228b, this.f6960en, -1118482);
        m1087A.f6111bM.m2776a(C0631e.f4058x, 0.2f, this.f6958el, this.f6959em);
    }

    /* renamed from: m */
    public float mo3035m() {
        if (m4417b()) {
            return 100.0f;
        }
        return 170.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 110.0f;
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        return 25 + (i * 10);
    }

    /* renamed from: f */
    public float mo3041f(int i) {
        return 0.2f;
    }

    /* renamed from: z */
    public float mo3033z() {
        if (!mo3054Q()) {
            return 1.4f;
        }
        return 0.4f;
    }

    /* renamed from: A */
    public float mo3065A() {
        if (!mo3054Q()) {
            return 3.8f;
        }
        return 1.5f;
    }

    /* renamed from: B */
    public float mo3064B() {
        return 0.3f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 4.0f;
    }

    /* renamed from: w */
    public float mo3162w(int i) {
        return 0.35f;
    }

    /* renamed from: y */
    public float m4413y(int i) {
        return 0.38f;
    }

    /* renamed from: E */
    public boolean mo3061E() {
        return false;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 0.03f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 0.1f;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return true;
    }

    /* renamed from: bi */
    public boolean mo3320bi() {
        return true;
    }

    /* renamed from: bj */
    public boolean mo3319bj() {
        return true;
    }

    /* renamed from: i */
    public void mo3316i(float f) {
        if (!m3001Z()) {
            super.mo3316i(f);
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
    public int m4423M() {
        return 2;
    }

    /* renamed from: d */
    public float mo3317d(boolean z) {
        return this.f1649cJ[m4423M()].f1712a + 90.0f;
    }

    /* renamed from: ah */
    public boolean m4418ah() {
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

    /* renamed from: a */
    public void mo3173a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f1865y) {
            this.f1858r = true;
        }
        if (abstractC0224s == f1866z) {
            this.f1858r = false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.b.c$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/c$1.class */
    final class C03111 extends AbstractC0229x {
        C03111(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Surface unit.";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Fly";
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return !((C0310c) abstractC0244am).f1858r;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.b.c$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/c$2.class */
    final class C03122 extends AbstractC0229x {
        C03122(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Dive unit underwater.";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Dive";
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0310c) abstractC0244am).f1858r && ((AbstractC0623y) abstractC0244am).m4725cI();
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f1867A;
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
        C1117y.m470a(this, mo3035m());
    }
}
