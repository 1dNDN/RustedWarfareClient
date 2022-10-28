package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;

/* renamed from: com.corrodinggames.rts.game.units.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/al.class */
public class C0243al extends AbstractC0620v {

    /* renamed from: a */
    static C0934e[] f1564a = new C0934e[3];

    /* renamed from: b */
    static C0934e f1565b = null;

    /* renamed from: c */
    C0934e f1566c;

    /* renamed from: d */
    int f1567d;

    /* renamed from: e */
    int f1568e;

    /* renamed from: f */
    int f1569f;

    /* renamed from: g */
    float f1570g;

    /* renamed from: h */
    boolean f1571h;

    /* renamed from: i */
    float f1572i;

    /* renamed from: j */
    int f1573j;

    /* renamed from: k */
    int f1574k;

    /* renamed from: l */
    float f1575l;

    /* renamed from: m */
    boolean f1576m;

    /* renamed from: b */
    public static void m4444b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f1564a[0] = m1072A.f6113bO.mo221a(C0067R.drawable.palm_tree);
        f1564a[1] = m1072A.f6113bO.mo221a(C0067R.drawable.trees);
        f1564a[2] = m1072A.f6113bO.mo221a(C0067R.drawable.trees_snow);
        f1565b = m1072A.f6113bO.mo221a(C0067R.drawable.palm_leaves);
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f1567d);
        streamWriter.WriteInteger(this.f1569f);
        streamWriter.mo1320a(this.f1570g);
        streamWriter.mo1314a(this.f1571h);
        streamWriter.mo1320a(this.f1572i);
        streamWriter.mo1355c(2);
        streamWriter.mo1320a(this.f1575l);
        streamWriter.WriteInteger(this.f1568e);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f1567d = reader.ReadInt();
        this.f1569f = reader.ReadInt();
        this.f1570g = reader.m1285g();
        this.f1571h = reader.ReadBool();
        this.f1572i = reader.m1285g();
        byte m1289d = reader.m1289d();
        if (m1289d >= 1) {
            this.f1575l = reader.m1285g();
        } else {
            this.f1575l = 1.0f;
        }
        if (m1289d >= 2) {
            this.f1568e = reader.ReadInt();
        } else {
            this.f1568e = 0;
        }
        m4443b(this.f1567d, this.f1568e);
        super.mo2291a(reader);
        if (this.f1607bT) {
            this.f1576m = false;
        }
    }

    /* renamed from: c */
    public C0934e m4441c() {
        return this.f1566c;
    }

    /* renamed from: e */
    public boolean mo2986e() {
        m4439f();
        return true;
    }

    public C0243al(boolean z) {
        super(z);
        this.f1569f = 0;
        this.f1573j = 0;
        this.f1574k = 0;
        this.f1575l = 1.0f;
        this.f1576m = false;
        m4443b(1, -1);
        this.f1621ch = 3.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 100.0f;
        this.f1632cs = this.f1633ct;
        this.f1618ce = -90.0f;
        m447S(3);
    }

    /* renamed from: a_ */
    public void m4447a_(String str) {
        int i = -1;
        String[] split = str.split("\\.");
        if (split.length != 0 && split.length != 1) {
            if (split.length == 2) {
                str = split[0];
                try {
                    i = Integer.parseInt(split[1]);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Tree sub type format error:" + split[1]);
                }
            } else {
                throw new RuntimeException("Tree sub unknown format with parts:" + split.length);
            }
        }
        try {
            m4443b(Integer.parseInt(str), i);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("Tree type format error:" + str);
        }
    }

    /* renamed from: b */
    public void m4443b(int i, int i2) {
        this.f1567d = i;
        this.f1568e = i2;
        if (this.f1567d == 0) {
            m2639T(27);
            m2638U(41);
            this.f1573j = 1;
            this.f1574k = 1;
            this.f1566c = f1564a[0];
        } else if (this.f1567d == 1 || this.f1567d == 2) {
            if (i2 == -1) {
                i2 = C0758f.m2149a(0, 4, (int) this.f6951ee);
            }
            if (i2 < 0 || i2 > 4) {
                throw new RuntimeException("Tree subType out of range:" + i2);
            }
            m2639T(25);
            m2638U(30);
            if (this.f1567d == 1) {
                this.f1566c = f1564a[1];
            } else {
                this.f1566c = f1564a[2];
            }
            this.f1573j = 0;
            this.f1574k = 30 * i2;
            if (i2 == 0) {
                this.f1575l = C0758f.m2155a(1.0f, 1.2f, ((int) this.f6951ee) + 1);
            } else {
                this.f1575l = C0758f.m2155a(1.0f, 2.0f, ((int) this.f6951ee) + 1);
            }
            this.f1576m = true;
        } else {
            throw new RuntimeException("Tree type:" + this.f1567d + " is not supported");
        }
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        if (this.f1567d == 0) {
            if (this.f1571h) {
                if (this.f1569f < 4) {
                    this.f1570g += f;
                    if (this.f1570g > 5.0f) {
                        this.f1570g = 0.0f;
                        this.f1569f++;
                    }
                }
            } else if (this.f1572i != 0.0f) {
                this.f1572i = C0758f.m2159a(this.f1572i, 0.1f * f);
                this.f1569f = 2;
            } else if (this.f1569f > 1) {
                this.f1569f = 1;
            }
        }
    }

    /* renamed from: a_ */
    public Rect mo3182a_(boolean z) {
        int i = this.f1573j;
        int i2 = this.f1574k;
        int i3 = i + (this.f1569f * (this.f4228ep + 1));
        f1692dA.m5364a(i3, i2, i3 + this.f4228ep, i2 + this.f4229eq);
        return f1692dA;
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        C0934e m4441c = m4441c();
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6256cW < 0.15d) {
            return false;
        }
        f1684ds.m5349a(mo3370cE());
        f1684ds.m5352a(0.0f, (int) (-this.f6959en));
        float m5340d = f1684ds.m5340d();
        float m5339e = f1684ds.m5339e();
        f1685dt.m5363a(mo3182a_(false));
        InterfaceC1027y interfaceC1027y = m1072A.f6113bO;
        interfaceC1027y.mo135k();
        if (this.f1575l != 1.0f) {
            interfaceC1027y.mo226a(this.f1575l, this.f1575l, m5340d, m5339e);
        }
        if (this.f1576m) {
            f1685dt.m5365a(this.f4228ep, 0);
            m1072A.f6113bO.mo192a(m4441c, f1685dt, f1684ds, (Paint) null);
            f1685dt.m5365a(-this.f4228ep, 0);
        }
        interfaceC1027y.mo227a(mo3216d(false), m5340d, m5339e);
        interfaceC1027y.mo192a(m4441c, f1685dt, f1684ds, (Paint) null);
        interfaceC1027y.mo134l();
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

    /* renamed from: aj */
    public boolean m4446aj() {
        return false;
    }

    /* renamed from: ak */
    public boolean m4445ak() {
        return false;
    }

    /* renamed from: p_ */
    public boolean mo3246p_() {
        return true;
    }

    /* renamed from: b_ */
    public boolean m4442b_() {
        return false;
    }

    /* renamed from: d */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1761A;
    }

    /* renamed from: a */
    public boolean m4449a(AbstractC0244am abstractC0244am, float f) {
        if (!this.f1571h) {
            if (this.f1572i == 0.0f) {
            }
            this.f1632cs -= (((abstractC0244am.mo3075bN() / 3000.0f) * this.f1633ct) * 0.06f) * f;
            this.f1572i = 1.0f;
            this.f1679dn = 1000.0f;
            if (this.f1632cs <= 0.0f) {
                this.f1618ce = C0758f.m2071d(this.f6957el, this.f6958em, abstractC0244am.f6957el, abstractC0244am.f6958em) + 180.0f;
                m4439f();
            }
            if (!this.f1571h) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public void m4439f() {
        if (!this.f1571h) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            this.f1569f = 2;
            this.f1570g = 0.0f;
            m447S(0);
            this.f1606bS = false;
            this.f1607bT = true;
            this.f1608bU = m1072A.f6102by;
            this.f1571h = true;
            this.f1576m = false;
            for (int i = 0; i < 1; i++) {
                m1072A.f6116bR.m2342a();
                C0745e m2313b = m1072A.f6116bR.m2313b(this.f6957el + C0758f.m2084c(-12.0f, 12.0f), this.f6958em + C0758f.m2084c(-12.0f, 12.0f), this.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                if (m2313b != null) {
                    m2313b.f4768ar = 9;
                    m2313b.f4767aq = C0758f.m2151a(4, 5);
                    m2313b.f4752Z = C0758f.m2084c(-180.0f, 180.0f);
                    m2313b.f4790ao = true;
                    m2313b.f4739L = 5.0f + C0758f.m2084c(0.0f, 3.0f);
                    m2313b.f4744Q = C0758f.m2084c(-0.05f, 0.05f) + (C0758f.m2040i(this.f1618ce) * 0.4f);
                    m2313b.f4745R = C0758f.m2084c(-0.05f, 0.05f) + (C0758f.m2045h(this.f1618ce) * 0.4f);
                    m2313b.f4729w = true;
                    m2313b.f4786x = 0.2f;
                    m2313b.f4735H = 0.4f * this.f1575l;
                    m2313b.f4734G = 0.4f * this.f1575l;
                    m2313b.f4750W = 90 + C0758f.m2151a(0, 40);
                    m2313b.f4751X = m2313b.f4750W;
                    m2313b.f4725s = true;
                    m2313b.f4792as = (short) 2;
                }
            }
            float m2040i = this.f6957el + (C0758f.m2040i(this.f1618ce) * (this.f4229eq - 5));
            float m2045h = this.f6958em + (C0758f.m2045h(this.f1618ce) * (this.f4229eq - 5));
            boolean z = true;
            for (int i2 = 0; i2 < 1; i2++) {
                m1072A.f6116bR.m2342a();
                C0745e m2313b2 = m1072A.f6116bR.m2313b(m2040i + C0758f.m2084c(-17, 17), m2045h + C0758f.m2084c(-17, 17), this.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                if (m2313b2 != null) {
                    m2313b2.f4768ar = 9;
                    m2313b2.f4767aq = C0758f.m2151a(4, 5);
                    if (z) {
                        z = false;
                        m2313b2.f4767aq = 3;
                    }
                    m2313b2.f4752Z = C0758f.m2084c(-180.0f, 180.0f);
                    m2313b2.f4790ao = true;
                    if (m2313b2.f4767aq == 3) {
                        m2313b2.f4744Q = C0758f.m2084c(-0.05f, 0.05f);
                        m2313b2.f4745R = C0758f.m2084c(-0.05f, 0.05f);
                        m2313b2.f4735H = 1.5f * this.f1575l;
                        m2313b2.f4734G = 2.2f * this.f1575l;
                        m2313b2.f4750W = 90 + C0758f.m2151a(0, 40);
                        m2313b2.f4792as = (short) 2;
                    } else {
                        m2313b2.f4744Q = C0758f.m2084c(-0.05f, 0.05f);
                        m2313b2.f4745R = C0758f.m2084c(-0.05f, 0.0f);
                        m2313b2.f4735H = 1.3f;
                        m2313b2.f4734G = 1.3f;
                        m2313b2.f4750W = 60 + C0758f.m2151a(0, 40);
                        m2313b2.f4792as = (short) 1;
                    }
                    m2313b2.f4751X = m2313b2.f4750W;
                    m2313b2.f4725s = true;
                }
            }
            if (this.f1567d == 1 || this.f1567d == 2) {
                this.f6957el += C0758f.m2040i(this.f1618ce) * ((this.f4229eq / 2) - 3);
                this.f6958em += C0758f.m2045h(this.f1618ce) * ((this.f4229eq / 2) - 3);
            }
        }
    }

    /* renamed from: n */
    public void mo3249n() {
        super.mo3249n();
        this.f1618ce = C0758f.m2153a((this.f6958em * 5.0f) + (this.f6957el * 3.0f), false);
        if (this.f1567d == 0) {
            this.f1569f = ((int) ((this.f6958em * 5.0f) + (this.f6957el * 3.0f))) % 1;
        }
        if (this.f1567d == 1) {
        }
    }

    /* renamed from: a_ */
    public float m4448a_() {
        return -1.0f;
    }

    /* renamed from: l */
    public boolean mo2979l() {
        return false;
    }

    /* renamed from: a */
    public float mo2994a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        boolean z = this.f1607bT;
        float a = super.mo2994a(abstractC0244am, f, c0188f);
        if (!z && this.f1607bT && c0188f != null) {
            this.f1618ce = C0758f.m2071d(this.f6957el, this.f6958em, c0188f.f6957el, c0188f.f6958em) + 180.0f;
        }
        return a;
    }

    /* renamed from: q */
    public boolean mo3245q() {
        return true;
    }

    /* renamed from: t */
    public boolean mo1713t() {
        return true;
    }
}
