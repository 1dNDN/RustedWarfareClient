package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ai.class */
public class C0240ai extends AbstractC0620v {

    /* renamed from: b */
    C0934e f1541b;

    /* renamed from: c */
    int f1542c;

    /* renamed from: d */
    int f1543d;

    /* renamed from: e */
    float f1544e;

    /* renamed from: f */
    float f1545f;

    /* renamed from: g */
    int f1546g;

    /* renamed from: h */
    int f1547h;

    /* renamed from: i */
    float f1548i;

    /* renamed from: j */
    float f1549j;

    /* renamed from: k */
    boolean f1550k;

    /* renamed from: l */
    float f1551l;

    /* renamed from: m */
    float f1552m;

    /* renamed from: n */
    float f1553n;

    /* renamed from: o */
    float f1554o;

    /* renamed from: p */
    float f1555p;

    /* renamed from: q */
    float f1556q;

    /* renamed from: r */
    boolean f1557r;

    /* renamed from: u */
    Rect f1560u;

    /* renamed from: a */
    static C0934e[] f1540a = new C0934e[2];

    /* renamed from: s */
    static Point f1558s = new Point();

    /* renamed from: t */
    public static C0241aj f1559t = new C0241aj();

    /* renamed from: b */
    public static void m4462b() {
        f1540a[0] = LoggerMaybe.m1072A().f6113bO.mo221a(C0067R.drawable.fire);
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f1542c);
        streamWriter.WriteInteger(this.f1543d);
        streamWriter.mo1320a(this.f1544e);
        streamWriter.mo1355c(0);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f1542c = reader.ReadInt();
        this.f1543d = reader.ReadInt();
        this.f1544e = reader.m1285g();
        reader.m1289d();
        super.mo2291a(reader);
    }

    /* renamed from: c */
    public C0934e m4459c() {
        return this.f1541b;
    }

    /* renamed from: e */
    public boolean mo2986e() {
        return false;
    }

    public C0240ai(boolean z) {
        super(z);
        this.f1543d = 0;
        this.f1546g = 0;
        this.f1547h = 0;
        this.f1550k = false;
        this.f1560u = new Rect();
        m4466a(0);
        this.f1621ch = 20.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 100.0f;
        this.f1632cs = this.f1633ct;
        this.f1618ce = -90.0f;
        this.f1606bS = false;
        this.f1554o = 0.05f;
        this.f1555p = 120.0f;
        m447S(3);
    }

    /* renamed from: c_ */
    public void mo2990c_() {
        this.f1606bS = false;
    }

    /* renamed from: a */
    public void m4466a(int i) {
        this.f1542c = i;
        if (this.f1542c == 0) {
            m2639T(20);
            m2638U(20);
            this.f1546g = 0;
            this.f1547h = 0;
            this.f1541b = f1540a[0];
            return;
        }
        throw new RuntimeException("Fire type:" + this.f1542c + " is not supported");
    }

    /* renamed from: d */
    public void m4458d() {
        this.f1550k = true;
        this.f1548i = C0758f.m2136a((AbstractC1120w) this, -5, 5, 1);
        this.f1549j = C0758f.m2136a((AbstractC1120w) this, -5, 5, 2);
        this.f1544e = C0758f.m2136a((AbstractC1120w) this, 1, 10, 3);
        this.f1543d = C0758f.m2136a((AbstractC1120w) this, 0, 2, 4);
        this.f1545f = C0758f.m2136a((AbstractC1120w) this, 7, 13, 5);
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0173b c0173b = m1072A.f6110bL;
        m1072A.f6110bL.m4857a(this.f6957el, this.f6958em);
        int i = m1072A.f6110bL.f801T;
        int i2 = m1072A.f6110bL.f802U;
        if (!c0173b.m4813c(i, i2)) {
            this.f1551l = 0.0f;
            this.f1552m = 0.0f;
            this.f1553n = 2.0f;
            return;
        }
        C0180g m4765a = m1072A.f6110bL.f833u.m4765a(i, i2);
        boolean z = false;
        if (m4765a.f918e || m4765a.f921h || m4765a.f924k || m4765a.f919f) {
            z = true;
        }
        if (z) {
            this.f1551l = 0.0f;
            this.f1552m = 0.0f;
            this.f1553n = 2.0f;
            return;
        }
        this.f1551l = 5.0E-4f;
        this.f1552m = 1.0f;
        this.f1553n = 0.3f;
        this.f1554o += C0758f.m2136a((AbstractC1120w) this, 0, 10, 10) / 1000.0f;
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (!this.f1550k) {
            m4458d();
        }
        if (this.f1554o < this.f1552m) {
            this.f1554o += this.f1551l * f;
            if (this.f1554o > this.f1552m) {
                this.f1554o = this.f1552m;
            }
        }
        if (this.f1554o > this.f1553n) {
            this.f1556q = (float) (this.f1556q + (0.01d * f));
            if ((!this.f1557r && this.f1556q > 1.0f) || this.f1556q > 8.0f) {
                this.f1556q = C0758f.m2136a((AbstractC1120w) this, 0, 10, 10) / 1000.0f;
                m4457f();
            }
        }
        this.f1544e += f;
        if (this.f1544e > 10.0f) {
            this.f1544e = 0.0f;
            this.f1543d++;
            if (this.f1543d > 3) {
                this.f1543d = 0;
            }
        }
        if (this.f1554o < 0.0f) {
            m4387bv();
        }
    }

    /* renamed from: f */
    public void m4457f() {
        this.f1557r = true;
        m4461b(-1, -1);
        m4461b(0, -1);
        m4461b(1, -1);
        m4461b(-1, 0);
        m4461b(1, 0);
        m4461b(-1, 1);
        m4461b(0, 1);
        m4461b(1, 1);
    }

    /* renamed from: b */
    public void m4461b(int i, int i2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float f = (int) (this.f6957el + (i * m1072A.f6110bL.f785n));
        float f2 = (int) (this.f6958em + (i2 * m1072A.f6110bL.f786o));
        if (m4467a(f, f2) == null) {
            C0240ai c0240ai = new C0240ai(false);
            c0240ai.f6957el = f;
            c0240ai.f6958em = f2;
            c0240ai.m4411b(this.f1609bV);
            m1072A.f6127cc.m3155a(c0240ai);
            AbstractC0197n.m4598c(c0240ai);
            this.f1557r = false;
        }
    }

    /* renamed from: a */
    public static C0240ai m4467a(float f, float f2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f1559t.m4455a(f, f2);
        m1072A.f6127cc.m3160a(f, f2, 30.0f, null, 1.0f, f1559t);
        return f1559t.f1563c;
    }

    /* renamed from: a_ */
    public Rect mo3182a_(boolean z) {
        int i = this.f1546g;
        int i2 = this.f1547h;
        int i3 = i + (this.f1543d * this.f4228ep);
        f1692dA.m5364a(i3, i2, i3 + this.f4228ep, i2 + this.f4229eq);
        return f1692dA;
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        C0934e m4459c = m4459c();
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f1684ds.m5349a(mo3370cE());
        f1684ds.m5352a(0.0f, (int) (-this.f6959en));
        f1684ds.m5352a(this.f1548i, this.f1549j);
        f1685dt.m5363a(mo3182a_(false));
        m1072A.f6113bO.mo135k();
        float m5340d = f1684ds.m5340d();
        float m5339e = f1684ds.m5339e();
        m1072A.f6113bO.mo227a(mo3216d(false), m5340d, m5339e);
        m1072A.f6113bO.mo226a(this.f1554o * 2.7f, this.f1554o * 2.7f, m5340d, m5339e);
        m1072A.f6113bO.mo192a(m4459c, f1685dt, f1684ds, (Paint) null);
        m1072A.f6113bO.mo134l();
        return true;
    }

    /* renamed from: h */
    public EnumC0246ao mo2982h() {
        return EnumC0246ao.f1703a;
    }

    /* renamed from: i */
    public boolean mo2981i() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo2995Q() {
        return false;
    }

    /* renamed from: ak */
    public boolean m4463ak() {
        return false;
    }

    /* renamed from: aj */
    public boolean m4464aj() {
        return false;
    }

    /* renamed from: p_ */
    public boolean mo3246p_() {
        return true;
    }

    /* renamed from: b_ */
    public boolean m4460b_() {
        return false;
    }

    /* renamed from: m */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1779S;
    }

    /* renamed from: n */
    public void mo3249n() {
        super.mo3249n();
    }

    /* renamed from: a_ */
    public float m4465a_() {
        return -1.0f;
    }

    /* renamed from: l */
    public boolean mo2979l() {
        return false;
    }

    /* renamed from: P */
    public boolean mo2996P() {
        return true;
    }

    /* renamed from: a */
    public float mo2994a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        this.f1554o -= f / 100.0f;
        return super.mo2994a(abstractC0244am, 0.0f, c0188f);
    }
}
