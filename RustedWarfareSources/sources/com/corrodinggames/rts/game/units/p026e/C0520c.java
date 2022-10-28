package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/c.class */
public class C0520c extends AbstractC0525h {

    /* renamed from: a */
    static C0934e f3595a = null;

    /* renamed from: b */
    static C0934e f3596b = null;

    /* renamed from: c */
    static C0934e f3597c = null;

    /* renamed from: d */
    public static C0934e f3598d = null;

    /* renamed from: e */
    public static C0934e f3599e = null;

    /* renamed from: f */
    static C0934e[] f3600f = new C0934e[10];

    /* renamed from: g */
    int f3601g;

    /* renamed from: h */
    float f3602h;

    /* renamed from: i */
    C0188f f3603i;

    /* renamed from: j */
    Rect f3604j;

    /* renamed from: k */
    Paint f3605k;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1775O;
    }

    /* renamed from: c */
    public static void m3233c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0934e mo221a = m1072A.f6113bO.mo221a(C0067R.drawable.experimental_hovertank);
        f3600f = AbstractC0197n.m4627a(mo221a);
        f3595a = m1072A.f6113bO.mo221a(C0067R.drawable.experimental_hovertank_dead);
        f3596b = m1072A.f6113bO.mo221a(C0067R.drawable.experimental_hovertank_turret);
        f3597c = m4418a(mo221a, mo221a.mo386m() / 1, mo221a.mo387l());
        f3598d = m1072A.f6113bO.mo221a(C0067R.drawable.experimental_hovertank_shield);
        f3599e = m1072A.f6113bO.mo221a(C0067R.drawable.shield_mid);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        if (this.f3603i != null && this.f3603i.f6952eg) {
            this.f3603i = null;
        }
        streamWriter.mo1367a(this.f3603i);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3603i = (C0188f) reader.m1300a(C0188f.class);
        super.mo2291a(reader);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3595a;
        }
        return f3600f[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return f3597c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3001F() {
        return LoggerMaybe.m1072A().f6115bQ.renderExtraShadows && this.f6959en > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3000G() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo2999H() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2988d(int i) {
        return f3596b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: T */
    public C0934e mo3235T() {
        return f3598d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2986e() {
        LoggerMaybe.m1072A();
        this.f3885L = f3595a;
        m447S(0);
        this.f1606bS = false;
        m2924a(EnumC0233ab.f1506e);
        return true;
    }

    public C0520c(boolean z) {
        super(z);
        this.f3602h = 0.0f;
        this.f3604j = new Rect();
        this.f3605k = C1117y.m480a();
        m2634a(f3600f[7], 1);
        this.f1621ch = 30.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 3500.0f;
        this.f1632cs = this.f1633ct;
        this.f1638cy = 5000.0f;
        this.f1635cv = this.f1638cy;
        this.f3885L = f3600f[7];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bV */
    public float mo3189bV() {
        if (this.f1638cy > 0.0f && this.f1635cv < this.f1638cy) {
            return this.f1635cv / this.f1638cy;
        }
        return super.mo3189bV();
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0525h, com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (this.f1607bT || !m4396bS()) {
            return;
        }
        if (!this.f1607bT) {
            if (this.f1623cj != 0.0f) {
                m447S(2);
            } else {
                m447S(4);
            }
        }
        if (this.f1648cI) {
        }
        this.f3602h += 1.0f * f;
        if (this.f3602h > 360.0f) {
            this.f3602h -= 360.0f;
        }
        this.f6959en = C0758f.m2158a(this.f6959en, 4.0f + (C0758f.m2045h(this.f3602h) * 2.0f), 0.1f * f);
        this.f1635cv = C0758f.m2158a(this.f1635cv, this.f1638cy, 0.25f * f);
        this.f1636cw = C0758f.m2158a(this.f1636cw, 0.0f, 4.0f * f);
        if (this.f1636cw > 50.0f) {
            this.f1636cw = 50.0f;
        }
        if (this.f3603i != null) {
            PointF E = mo3073E(0);
            this.f3603i.f6957el = E.f227a;
            this.f3603i.f6958em = E.f228b;
            this.f3603i.f6959en = this.f6959en;
            if (this.f3603i.f6952eg) {
                this.f3603i = null;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3075bN() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: L */
    public float mo3236L(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: K */
    public PointF mo3237K(int i) {
        PointF K = super.mo3237K(i);
        if (this.f3603i != null) {
            K.f227a += this.f3603i.f1011K;
            K.f228b += this.f3603i.f1012L;
        }
        return K;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3060q(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        LoggerMaybe.m1072A();
        PointF E = mo3073E(i);
        if (this.f3603i != null) {
            boolean z = false;
            if (this.f3603i.f6952eg) {
                z = true;
            }
            if (this.f3603i.f986l != abstractC0244am) {
                z = true;
            }
            if (z) {
                this.f3603i = null;
            }
        }
        float mo2992b = mo2992b(i) + mo2985e(i) + 5.0f;
        if (this.f3603i != null) {
            this.f3603i.f982h = mo2992b;
            return;
        }
        C0188f m4718a = C0188f.m4718a(this, E.f227a, E.f228b);
        m4718a.f1021U = 380.0f;
        m4718a.f986l = abstractC0244am;
        m4718a.f982h = mo2992b;
        m4718a.f1002B = true;
        m4718a.f1001A = true;
        m4718a.f1068aQ = true;
        m4718a.f1005E = true;
        m4718a.f1010J = 70.0f;
        m4718a.f1006F = 230.0f;
        m4718a.f1037ak = 0.75f;
        m4718a.f6955ej = this.f6955ej;
        this.f3603i = m4718a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2978m() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2992b(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo2985e(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2976z() {
        return 0.6f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bc */
    public float mo3071bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3006A() {
        return 1.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3005B() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2991c(int i) {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3004C() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3003D() {
        return 0.02f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3182a_(boolean z) {
        if (this.f1607bT && !z) {
            return super.mo3182a_(z);
        }
        if (z) {
            return super.mo3182a_(z);
        }
        int i = 0 + (this.f3601g * this.f4228ep);
        this.f3604j.m5364a(i, 0, i + this.f4228ep, 0 + this.f4229eq);
        return this.f3604j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo2285c(float f) {
        C0934e mo3235T;
        if (!super.mo2285c(f)) {
            return false;
        }
        C1117y.m462a((AbstractC0623y) this);
        if (!this.f1607bT) {
            float f2 = 0.0f;
            if (this.f3603i != null) {
                f2 = C0758f.m2107b(this.f3603i.m4709e(), 0.25f) * 3.0f;
            }
            C1117y.m460a(this, C0531l.f3663e, f2, 0);
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!this.f1607bT && this.f1635cv > 0.0f && this.f1637cx == 0.0f && (mo3235T = mo3235T()) != null) {
            this.f3605k.m5420a((int) ((0.09f + ((this.f1635cv / this.f1638cy) * 0.4f) + ((C0758f.m2107b(this.f1636cw, 50.0f) / 50.0f) * 0.5f)) * 255.0f), 255, 255, 255);
            m1072A.f6113bO.mo199a(mo3235T, this.f6957el - m1072A.f6144cv, (this.f6958em - m1072A.f6145cw) - this.f6959en, mo3216d(false) - 90.0f, this.f3605k);
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2979l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo3065af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2983g(int i) {
        return 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo3089G(int i) {
        f3986bg.m5369a(this.f6957el, this.f6958em);
        return f3986bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo3084bl() {
        return 1;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cu */
    public int mo3227cu() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: db */
    public boolean mo3226db() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo2283e(float f) {
        super.mo2283e(f);
        C1117y.m470a(this, mo2978m());
    }
}
