package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/f.class */
public class C0317f extends AbstractC0309b {

    /* renamed from: a */
    static C0934e f1887a = null;

    /* renamed from: b */
    static C0934e f1888b = null;

    /* renamed from: c */
    static C0934e f1889c = null;

    /* renamed from: d */
    static C0934e f1890d = null;

    /* renamed from: e */
    static C0934e f1891e = null;

    /* renamed from: f */
    static C0934e[] f1892f = new C0934e[10];

    /* renamed from: g */
    boolean f1893g;

    /* renamed from: o */
    float f1894o;

    /* renamed from: p */
    float f1895p;

    /* renamed from: q */
    float f1896q;

    /* renamed from: r */
    Rect f1897r;

    /* renamed from: s */
    Rect f1898s;

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f1895p);
        streamWriter.mo1335a(this.f1894o);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m4390a(Reader reader) {
        if (reader.m1310b() >= 9) {
            this.f1895p = reader.m1300g();
            this.f1894o = reader.m1300g();
            if (reader.m1310b() == 8) {
                this.f1893g = reader.ReadBool();
            }
        } else {
            this.f1894o = 0.5f;
        }
        super.m4425a(reader);
    }

    /* renamed from: b */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1746l;
    }

    /* renamed from: c */
    public static void m4388c() {
        Core m1087A = Core.m1087A();
        f1888b = m1087A.f6113bO.mo221a(C0067R.drawable.helicopter);
        f1889c = m1087A.f6113bO.mo221a(C0067R.drawable.helicopter_blades);
        f1890d = m1087A.f6113bO.mo221a(C0067R.drawable.helicopter_shadow);
        f1891e = m1087A.f6113bO.mo221a(C0067R.drawable.helicopter_shadow_blades);
        f1887a = m1087A.f6113bO.mo221a(C0067R.drawable.helicopter_dead);
        f1892f = AbstractC0197n.m5082a(f1888b);
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f1887a;
        }
        return f1892f[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return f1890d;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core.m1087A().f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
        this.f3885L = f1887a;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    public C0317f(boolean z) {
        super(z);
        this.f1893g = false;
        this.f1895p = 0.0f;
        this.f1897r = new Rect();
        this.f1898s = new Rect();
        m2693T(26);
        m2692U(46);
        this.f1621ch = 13.0f;
        this.f1622ci = this.f1621ch + 2.0f;
        this.f1633ct = 150.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f1888b;
        this.f3886M = f1890d;
        this.f6960en = 0.0f;
        this.f1894o = 0.14f;
        this.f1896q = 0.0f;
        m447S(5);
    }

    /* renamed from: n */
    public void mo3351n() {
        super.mo3351n();
        this.f6960en = 20.0f;
        this.f1894o = 0.5f;
    }

    /* renamed from: I */
    public boolean mo3057I() {
        return true;
    }

    /* renamed from: i */
    public boolean mo3038i() {
        return true;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (this.f1607bT) {
            return;
        }
        this.f1894o = C0758f.m2210a(this.f1894o, 0.5f, 0.003f * f);
        this.f1896q += 70.0f * this.f1894o * f;
        if (this.f1896q >= 360.0f) {
            this.f1896q -= 360.0f;
            this.f1896q += C0758f.m2189a(this, 0, 4);
        }
        if (this.f1894o > 0.4f) {
            this.f1895p += 2.0f * f;
            if (this.f1895p > 360.0f) {
                this.f1895p -= 360.0f;
            }
            this.f6960en = C0758f.m2210a(this.f6960en, 20.0f + (C0758f.m2097h(this.f1895p) * 1.5f), 0.1f * f);
        }
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3156E(i);
        C0188f m5203a = C0188f.m5203a(this, E.f227a, E.f228b, this.f6960en, i);
        PointF K = m3013K(i);
        m5203a.f1011K = K.f227a;
        m5203a.f1012L = K.f228b;
        m5203a.f1021U = 17.0f;
        m5203a.f986l = abstractC0244am;
        m5203a.f982h = 30.0f;
        m5203a.f994t = 8.0f;
        m5203a.f1019S = false;
        m5203a.f1043ar = Color.m5948a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        m5203a.f1001A = true;
        m5203a.f1069aR = false;
        Core m1087A = Core.m1087A();
        m1087A.f6111bM.m2775a(C0631e.f4053s, 0.2f, 1.0f + C0758f.m2136c(-0.08f, 0.08f), E.f227a, E.f228b);
        m1087A.f6116bR.m2390a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
        m1087A.f6116bR.m2385a(E.f227a, E.f228b, this.f6960en, -1118720);
    }

    /* renamed from: m */
    public float mo3035m() {
        return 130.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 60.0f;
    }

    /* renamed from: z */
    public float mo3033z() {
        if (this.f6960en < 15.0f) {
            return 0.0f;
        }
        return 2.2f;
    }

    /* renamed from: bc */
    public float mo3153bc() {
        return 0.1f;
    }

    /* renamed from: A */
    public float mo3065A() {
        return 6.0f;
    }

    /* renamed from: B */
    public float mo3064B() {
        return 0.4f;
    }

    /* renamed from: bi */
    public boolean mo3320bi() {
        return true;
    }

    /* renamed from: bj */
    public boolean mo3319bj() {
        return true;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 16.0f;
    }

    /* renamed from: a_ */
    public Rect mo3282a_(boolean z) {
        return super.mo3282a_(z);
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        if (!super.mo3049c(f)) {
            return false;
        }
        if (!this.f1607bT) {
            Paint aN = m2940aN();
            Core m1087A = Core.m1087A();
            this.f1898s.m5874a(0, 0, f1889c.mo386m(), f1889c.mo387l());
            float f2 = this.f1896q;
            if (this.f1626cm) {
            }
            m1087A.f6113bO.mo196a(f1889c, this.f1898s, this.f6958el - Core.m1087A().f6144cv, (this.f6959em - Core.m1087A().f6145cw) - this.f6960en, f2, aN);
            return true;
        }
        return true;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 0.07f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 0.1f;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return true;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 7.0f;
    }
}
