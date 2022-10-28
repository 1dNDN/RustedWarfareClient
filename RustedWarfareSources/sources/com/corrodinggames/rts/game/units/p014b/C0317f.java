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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f1895p);
        streamWriter.mo1320a(this.f1894o);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        if (reader.m1295b() >= 9) {
            this.f1895p = reader.m1285g();
            this.f1894o = reader.m1285g();
            if (reader.m1295b() == 8) {
                this.f1893g = reader.ReadBool();
            }
        } else {
            this.f1894o = 0.5f;
        }
        super.mo2291a(reader);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1746l;
    }

    /* renamed from: c */
    public static void m4173c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f1888b = m1072A.f6113bO.mo221a(C0067R.drawable.helicopter);
        f1889c = m1072A.f6113bO.mo221a(C0067R.drawable.helicopter_blades);
        f1890d = m1072A.f6113bO.mo221a(C0067R.drawable.helicopter_shadow);
        f1891e = m1072A.f6113bO.mo221a(C0067R.drawable.helicopter_shadow_blades);
        f1887a = m1072A.f6113bO.mo221a(C0067R.drawable.helicopter_dead);
        f1892f = AbstractC0197n.m4627a(f1888b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f1887a;
        }
        return f1892f[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return f1890d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2988d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2986e() {
        LoggerMaybe.m1072A().f6116bR.m2318b(this.f6957el, this.f6958em, this.f6959en);
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
        m2639T(26);
        m2638U(46);
        this.f1621ch = 13.0f;
        this.f1622ci = this.f1621ch + 2.0f;
        this.f1633ct = 150.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f1888b;
        this.f3886M = f1890d;
        this.f6959en = 0.0f;
        this.f1894o = 0.14f;
        this.f1896q = 0.0f;
        m447S(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: n */
    public void mo3249n() {
        super.mo3249n();
        this.f6959en = 20.0f;
        this.f1894o = 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: I */
    public boolean mo2998I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo2981i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (this.f1607bT) {
            return;
        }
        this.f1894o = C0758f.m2158a(this.f1894o, 0.5f, 0.003f * f);
        this.f1896q += 70.0f * this.f1894o * f;
        if (this.f1896q >= 360.0f) {
            this.f1896q -= 360.0f;
            this.f1896q += C0758f.m2137a(this, 0, 4);
        }
        if (this.f1894o > 0.4f) {
            this.f1895p += 2.0f * f;
            if (this.f1895p > 360.0f) {
                this.f1895p -= 360.0f;
            }
            this.f6959en = C0758f.m2158a(this.f6959en, 20.0f + (C0758f.m2045h(this.f1895p) * 1.5f), 0.1f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3073E(i);
        C0188f m4716a = C0188f.m4716a(this, E.f227a, E.f228b, this.f6959en, i);
        PointF K = mo3237K(i);
        m4716a.f1011K = K.f227a;
        m4716a.f1012L = K.f228b;
        m4716a.f1021U = 17.0f;
        m4716a.f986l = abstractC0244am;
        m4716a.f982h = 30.0f;
        m4716a.f994t = 8.0f;
        m4716a.f1019S = false;
        m4716a.f1043ar = Color.m5435a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        m4716a.f1001A = true;
        m4716a.f1069aR = false;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6111bM.m2721a(C0631e.f4053s, 0.2f, 1.0f + C0758f.m2084c(-0.08f, 0.08f), E.f227a, E.f228b);
        m1072A.f6116bR.m2338a(E.f227a, E.f228b, this.f6959en, this.f1649cJ[i].f1712a);
        m1072A.f6116bR.m2333a(E.f227a, E.f228b, this.f6959en, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2978m() {
        return 130.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2992b(int i) {
        return 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2976z() {
        if (this.f6959en < 15.0f) {
            return 0.0f;
        }
        return 2.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo3071bc() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3006A() {
        return 6.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3005B() {
        return 0.4f;
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
    /* renamed from: c */
    public float mo2991c(int i) {
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3182a_(boolean z) {
        return super.mo3182a_(z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo2285c(float f) {
        if (!super.mo2285c(f)) {
            return false;
        }
        if (!this.f1607bT) {
            Paint aN = m2884aN();
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            this.f1898s.m5364a(0, 0, f1889c.mo386m(), f1889c.mo387l());
            float f2 = this.f1896q;
            if (this.f1626cm) {
            }
            m1072A.f6113bO.mo196a(f1889c, this.f1898s, this.f6957el - LoggerMaybe.m1072A().f6144cv, (this.f6958em - LoggerMaybe.m1072A().f6145cw) - this.f6959en, f2, aN);
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3004C() {
        return 0.07f;
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
    /* renamed from: g */
    public float mo2983g(int i) {
        return 7.0f;
    }
}
