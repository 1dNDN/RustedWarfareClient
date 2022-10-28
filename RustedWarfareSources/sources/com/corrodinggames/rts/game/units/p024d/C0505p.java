package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p.class */
public class C0505p extends AbstractC0498i {

    /* renamed from: d */
    boolean f3516d;

    /* renamed from: e */
    boolean f3517e;

    /* renamed from: f */
    float f3518f;

    /* renamed from: i */
    PointF f3521i;

    /* renamed from: j */
    Rect f3522j;

    /* renamed from: a */
    static C0934e[] f3513a = new C0934e[10];

    /* renamed from: b */
    static C0934e[] f3514b = new C0934e[10];

    /* renamed from: c */
    static C0934e f3515c = null;

    /* renamed from: g */
    static C0934e f3519g = null;

    /* renamed from: h */
    static C0934e[] f3520h = new C0934e[10];

    /* renamed from: k */
    static AbstractC0224s f3523k = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.p.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3029a() {
            return C0820a.m1687a("units.laserDefence.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("units.laserDefence.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3023c() {
            return EnumC0249ar.f1759y.mo4272c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3265K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0505p c0505p = (C0505p) abstractC0244am;
            if (c0505p.f3516d || c0505p.mo3313a(m4507N(), z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            if (((C0505p) abstractC0244am).f3516d) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1467c;
        }
    };

    /* renamed from: l */
    static ArrayList f3524l = new ArrayList();

    static {
        f3524l.add(f3523k);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1314a(this.f3516d);
        streamWriter.mo1320a(this.f1639cz);
        streamWriter.mo1314a(this.f3517e);
        streamWriter.mo1320a(this.f3518f);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3516d = reader.ReadBool();
        this.f1639cz = reader.m1285g();
        this.f3517e = reader.ReadBool();
        if (reader.m1295b() >= 38) {
            this.f3518f = reader.m1285g();
        }
        super.mo2291a(reader);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0934e mo2977v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3520h[this.f1609bV.m4650O()];
    }

    /* renamed from: b */
    public static void m3296b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3515c = m1072A.f6113bO.mo221a(C0067R.drawable.laser_defence_dead);
        C0934e mo221a = m1072A.f6113bO.mo221a(C0067R.drawable.laser_defence);
        C0934e mo221a2 = m1072A.f6113bO.mo221a(C0067R.drawable.laser_defence_t2);
        f3513a = AbstractC0197n.m4627a(mo221a);
        f3514b = AbstractC0197n.m4627a(mo221a2);
        mo221a.mo50n();
        mo221a2.mo50n();
        f3519g = m1072A.f6113bO.mo221a(C0067R.drawable.unit_icon_building_turrent);
        f3520h = AbstractC0197n.m4627a(f3519g);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3274K() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6116bR.m2339a(this.f6957el, this.f6958em, this.f6959en);
        this.f3885L = f3515c;
        m447S(0);
        this.f1606bS = false;
        m1072A.f6111bM.m2722a(C0631e.f4050p, 0.8f, this.f6957el, this.f6958em);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3515c;
        }
        if (this.f1609bV == null) {
            return f3513a[f3513a.length - 1];
        }
        if (!this.f3516d) {
            return f3513a[this.f1609bV.m4650O()];
        }
        return f3514b[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    public C0505p(boolean z) {
        super(z);
        this.f3521i = new PointF();
        this.f3522j = new Rect();
        m2634a(f3513a[0], 2);
        this.f1639cz = 1.0f;
        this.f1621ch = 19.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 500.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3513a[f3513a.length - 1];
        this.f3426n.m5364a(0, 0, 1, 1);
        this.f3427o.m5364a(0, 0, 1, 1);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        float f2;
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
            return;
        }
        LoggerMaybe.m1072A();
        float f3 = 4.0E-4f * f;
        if (this.f3516d) {
            f3 += 2.0E-4f * f;
        }
        this.f1639cz = C0758f.m2158a(this.f1639cz, 1.0f, f3);
        if (this.f1639cz >= 1.0f) {
            this.f3517e = false;
        }
        this.f3518f -= f;
        this.f3521i.m5368a(mo3073E(0));
        if (this.f1639cz > 0.0f && !this.f3517e) {
            if (!this.f3516d) {
                f2 = 0.11f;
            } else {
                f2 = 0.05f;
            }
            if (m3297a(this, this.f3521i.f227a, this.f3521i.f228b, this.f6959en, mo2978m(), f2)) {
                this.f3518f = 3.0f;
            }
            if (this.f1639cz < 0.0f) {
                this.f1639cz = 0.0f;
                this.f3517e = true;
            }
        }
        if (this.f3517e) {
            this.f3431s = 1;
        } else {
            this.f3431s = 0;
        }
    }

    /* renamed from: a */
    public static boolean m3297a(AbstractC0623y abstractC0623y, float f, float f2, float f3, float f4, float f5) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float f6 = f4 * f4;
        Object[] m534a = C0188f.f1083a.m534a();
        int i = C0188f.f1083a.f6894a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f = (C0188f) m534a[i2];
            if (!c0188f.f1001A && !c0188f.f1003C && ((c0188f.f1010J > 7.0f || (c0188f.f1010J > 2.0f && c0188f.f994t > 8.0f)) && !c0188f.f1071aS && ((c0188f.f6957el - f) * (c0188f.f6957el - f)) + ((c0188f.f6958em - f2) * (c0188f.f6958em - f2)) < f6 && c0188f.f6959en >= -1.0f)) {
                boolean z = false;
                if (c0188f.f986l != null && abstractC0623y.f1609bV.m4587d(c0188f.f986l.f1609bV)) {
                    z = true;
                }
                if (!z && c0188f.f984j != null && abstractC0623y.f1609bV.m4599c(c0188f.f984j.f1609bV)) {
                    z = true;
                }
                if (z) {
                    C0745e m2336a = m1072A.f6116bR.m2336a(f, f2, f3, c0188f.f6957el, c0188f.f6958em, c0188f.f6959en);
                    if (m2336a != null) {
                        m2336a.f4750W = 10.0f;
                        m2336a.f4751X = m2336a.f4750W;
                    }
                    C0745e m2313b = m1072A.f6116bR.m2313b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                    if (m2313b != null) {
                        m2313b.f4744Q = 0.0f;
                        m2313b.f4745R = 0.0f;
                        m2313b.f4767aq = 4;
                        m2313b.f4750W = 39.0f;
                        m2313b.f4751X = m2313b.f4750W;
                        m2313b.f4725s = true;
                        m2313b.f4733F = 1.3f;
                        m2313b.f4735H = 1.1f;
                        m2313b.f4734G = 0.7f;
                    }
                    c0188f.f1008H -= 1.01f;
                    if (c0188f.f1008H <= 0.0f) {
                        c0188f.m4710d();
                        C0745e m2313b2 = m1072A.f6116bR.m2313b(c0188f.f6957el, c0188f.f6958em, c0188f.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                        if (m2313b2 != null) {
                            m2313b2.f4744Q = 0.0f;
                            m2313b2.f4745R = 0.0f;
                            m2313b2.f4767aq = 4;
                            m2313b2.f4750W = 23.0f;
                            m2313b2.f4751X = m2313b2.f4750W;
                            m2313b2.f4725s = true;
                            m2313b2.f4733F = 0.9f;
                            m2313b2.f4735H = 0.5f;
                            m2313b2.f4734G = 0.2f;
                        }
                        m1072A.f6111bM.m2721a(C0631e.f4066F, 0.2f, 1.0f + C0758f.m2084c(-0.07f, 0.07f), c0188f.f6957el, c0188f.f6958em);
                    }
                    abstractC0623y.f1639cz -= f5;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo3073E(int i) {
        f3985bf.m5369a(this.f6957el, this.f6958em - 13.0f);
        return f3985bf;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2978m() {
        if (!this.f3516d) {
            return 160.0f;
        }
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2991c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public boolean mo3295b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo2285c(float f) {
        return super.mo2285c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1759y;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2979l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2983g(int i) {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bV */
    public float mo3189bV() {
        if (this.f1639cz != 1.0f) {
            return this.f1639cz;
        }
        return super.mo3189bV();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bW */
    public boolean mo3188bW() {
        return this.f3517e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bd */
    public float mo3294bd() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        if (c0499j.f3494j.equals(f3523k.m4507N())) {
            mo3174a(2);
            m2947W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cl */
    public C0208c mo3267cl() {
        if (!this.f3516d) {
            return f3523k.m4507N();
        }
        return AbstractC0224s.f1462i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3273V() {
        if (this.f3516d) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3174a(int i) {
        if (i == 1) {
            this.f3516d = false;
        } else if (i == 2 && !this.f3516d) {
            this.f3516d = true;
            this.f1633ct += 900.0f;
            this.f1632cs += 900.0f;
        }
        mo3303S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3068N() {
        return f3524l;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo2283e(float f) {
        super.mo2283e(f);
        C1117y.m470a(this, mo2978m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cX */
    public float mo3292cX() {
        return LoggerMaybe.m1072A().f6110bL.f785n;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cY */
    public float mo3291cY() {
        return LoggerMaybe.m1072A().f6110bL.f786o;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cZ */
    public float mo3290cZ() {
        return super.mo3290cZ() - 8.0f;
    }
}
