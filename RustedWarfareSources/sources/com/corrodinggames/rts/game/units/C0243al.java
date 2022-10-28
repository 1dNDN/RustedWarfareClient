package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
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
    public static void m4808b() {
        Core m1087A = Core.m1087A();
        f1564a[0] = m1087A.f6113bO.mo221a(C0067R.drawable.palm_tree);
        f1564a[1] = m1087A.f6113bO.mo221a(C0067R.drawable.trees);
        f1564a[2] = m1087A.f6113bO.mo221a(C0067R.drawable.trees_snow);
        f1565b = m1087A.f6113bO.mo221a(C0067R.drawable.palm_leaves);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f1567d);
        streamWriter.WriteInteger(this.f1569f);
        streamWriter.mo1335a(this.f1570g);
        streamWriter.mo1329a(this.f1571h);
        streamWriter.mo1335a(this.f1572i);
        streamWriter.m1401c(2);
        streamWriter.mo1335a(this.f1575l);
        streamWriter.WriteInteger(this.f1568e);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m4813a(Reader reader) {
        this.f1567d = reader.ReadInt();
        this.f1569f = reader.ReadInt();
        this.f1570g = reader.m1300g();
        this.f1571h = reader.ReadBool();
        this.f1572i = reader.m1300g();
        byte m1304d = reader.m1304d();
        if (m1304d >= 1) {
            this.f1575l = reader.m1300g();
        } else {
            this.f1575l = 1.0f;
        }
        if (m1304d >= 2) {
            this.f1568e = reader.ReadInt();
        } else {
            this.f1568e = 0;
        }
        m4807b(this.f1567d, this.f1568e);
        super.m4779a(reader);
        if (this.f1607bT) {
            this.f1576m = false;
        }
    }

    /* renamed from: c */
    public C0934e m4805c() {
        return this.f1566c;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        m4803f();
        return true;
    }

    public C0243al(boolean z) {
        super(z);
        this.f1569f = 0;
        this.f1573j = 0;
        this.f1574k = 0;
        this.f1575l = 1.0f;
        this.f1576m = false;
        m4807b(1, -1);
        this.f1621ch = 3.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 100.0f;
        this.f1632cs = this.f1633ct;
        this.f1618ce = -90.0f;
        m447S(3);
    }

    /* renamed from: a_ */
    public void m4811a_(String str) {
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
            m4807b(Integer.parseInt(str), i);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("Tree type format error:" + str);
        }
    }

    /* renamed from: b */
    public void m4807b(int i, int i2) {
        this.f1567d = i;
        this.f1568e = i2;
        if (this.f1567d == 0) {
            m2693T(27);
            m2692U(41);
            this.f1573j = 1;
            this.f1574k = 1;
            this.f1566c = f1564a[0];
        } else if (this.f1567d == 1 || this.f1567d == 2) {
            if (i2 == -1) {
                i2 = C0758f.m2201a(0, 4, (int) this.f6951ee);
            }
            if (i2 < 0 || i2 > 4) {
                throw new RuntimeException("Tree subType out of range:" + i2);
            }
            m2693T(25);
            m2692U(30);
            if (this.f1567d == 1) {
                this.f1566c = f1564a[1];
            } else {
                this.f1566c = f1564a[2];
            }
            this.f1573j = 0;
            this.f1574k = 30 * i2;
            if (i2 == 0) {
                this.f1575l = C0758f.m2207a(1.0f, 1.2f, ((int) this.f6951ee) + 1);
            } else {
                this.f1575l = C0758f.m2207a(1.0f, 2.0f, ((int) this.f6951ee) + 1);
            }
            this.f1576m = true;
        } else {
            throw new RuntimeException("Tree type:" + this.f1567d + " is not supported");
        }
    }

    /* renamed from: a */
    public void mo1762a(float f) {
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
                this.f1572i = C0758f.m2211a(this.f1572i, 0.1f * f);
                this.f1569f = 2;
            } else if (this.f1569f > 1) {
                this.f1569f = 1;
            }
        }
    }

    /* renamed from: a_ */
    public Rect mo3282a_(boolean z) {
        int i = this.f1573j;
        int i2 = this.f1574k;
        int i3 = i + (this.f1569f * (this.f4228ep + 1));
        f1692dA.m5874a(i3, i2, i3 + this.f4228ep, i2 + this.f4229eq);
        return f1692dA;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        C0934e m4805c = m4805c();
        Core m1087A = Core.m1087A();
        if (m1087A.f6256cW < 0.15d) {
            return false;
        }
        f1684ds.m5859a(m4729cE());
        f1684ds.m5862a(0.0f, (int) (-this.f6960en));
        float m5850d = f1684ds.m5850d();
        float m5849e = f1684ds.m5849e();
        f1685dt.m5873a(mo3282a_(false));
        InterfaceC1027y interfaceC1027y = m1087A.f6113bO;
        interfaceC1027y.mo135k();
        if (this.f1575l != 1.0f) {
            interfaceC1027y.mo226a(this.f1575l, this.f1575l, m5850d, m5849e);
        }
        if (this.f1576m) {
            f1685dt.m5875a(this.f4228ep, 0);
            m1087A.f6113bO.mo192a(m4805c, f1685dt, f1684ds, (Paint) null);
            f1685dt.m5875a(-this.f4228ep, 0);
        }
        interfaceC1027y.mo227a(mo3317d(false), m5850d, m5849e);
        interfaceC1027y.mo192a(m4805c, f1685dt, f1684ds, (Paint) null);
        interfaceC1027y.mo134l();
        return true;
    }

    /* renamed from: h */
    public EnumC0246ao mo3039h() {
        return EnumC0246ao.f1703a;
    }

    /* renamed from: i */
    public boolean mo3038i() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo3054Q() {
        return false;
    }

    /* renamed from: aj */
    public boolean m4810aj() {
        return false;
    }

    /* renamed from: ak */
    public boolean m4809ak() {
        return false;
    }

    /* renamed from: p_ */
    public boolean mo3348p_() {
        return true;
    }

    /* renamed from: b_ */
    public boolean m4806b_() {
        return false;
    }

    /* renamed from: d */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1761A;
    }

    /* renamed from: a */
    public boolean m4814a(AbstractC0244am abstractC0244am, float f) {
        if (!this.f1571h) {
            if (this.f1572i == 0.0f) {
            }
            this.f1632cs -= (((abstractC0244am.mo3158bN() / 3000.0f) * this.f1633ct) * 0.06f) * f;
            this.f1572i = 1.0f;
            this.f1679dn = 1000.0f;
            if (this.f1632cs <= 0.0f) {
                this.f1618ce = C0758f.m2123d(this.f6958el, this.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em) + 180.0f;
                m4803f();
            }
            if (!this.f1571h) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public void m4803f() {
        if (!this.f1571h) {
            Core m1087A = Core.m1087A();
            this.f1569f = 2;
            this.f1570g = 0.0f;
            m447S(0);
            this.f1606bS = false;
            this.f1607bT = true;
            this.f1608bU = m1087A.f6102by;
            this.f1571h = true;
            this.f1576m = false;
            for (int i = 0; i < 1; i++) {
                m1087A.f6116bR.m2394a();
                C0745e m2365b = m1087A.f6116bR.m2365b(this.f6958el + C0758f.m2136c(-12.0f, 12.0f), this.f6959em + C0758f.m2136c(-12.0f, 12.0f), this.f6960en, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                if (m2365b != null) {
                    m2365b.f4787ar = 9;
                    m2365b.f4786aq = C0758f.m2203a(4, 5);
                    m2365b.f4769Z = C0758f.m2136c(-180.0f, 180.0f);
                    m2365b.f4784ao = true;
                    m2365b.f4755L = 5.0f + C0758f.m2136c(0.0f, 3.0f);
                    m2365b.f4760Q = C0758f.m2136c(-0.05f, 0.05f) + (C0758f.m2092i(this.f1618ce) * 0.4f);
                    m2365b.f4761R = C0758f.m2136c(-0.05f, 0.05f) + (C0758f.m2097h(this.f1618ce) * 0.4f);
                    m2365b.f4740w = true;
                    m2365b.f4741x = 0.2f;
                    m2365b.f4751H = 0.4f * this.f1575l;
                    m2365b.f4750G = 0.4f * this.f1575l;
                    m2365b.f4766W = 90 + C0758f.m2203a(0, 40);
                    m2365b.f4767X = m2365b.f4766W;
                    m2365b.f4736s = true;
                    m2365b.f4788as = (short) 2;
                }
            }
            float m2092i = this.f6958el + (C0758f.m2092i(this.f1618ce) * (this.f4229eq - 5));
            float m2097h = this.f6959em + (C0758f.m2097h(this.f1618ce) * (this.f4229eq - 5));
            boolean z = true;
            for (int i2 = 0; i2 < 1; i2++) {
                m1087A.f6116bR.m2394a();
                C0745e m2365b2 = m1087A.f6116bR.m2365b(m2092i + C0758f.m2136c(-17, 17), m2097h + C0758f.m2136c(-17, 17), this.f6960en, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                if (m2365b2 != null) {
                    m2365b2.f4787ar = 9;
                    m2365b2.f4786aq = C0758f.m2203a(4, 5);
                    if (z) {
                        z = false;
                        m2365b2.f4786aq = 3;
                    }
                    m2365b2.f4769Z = C0758f.m2136c(-180.0f, 180.0f);
                    m2365b2.f4784ao = true;
                    if (m2365b2.f4786aq == 3) {
                        m2365b2.f4760Q = C0758f.m2136c(-0.05f, 0.05f);
                        m2365b2.f4761R = C0758f.m2136c(-0.05f, 0.05f);
                        m2365b2.f4751H = 1.5f * this.f1575l;
                        m2365b2.f4750G = 2.2f * this.f1575l;
                        m2365b2.f4766W = 90 + C0758f.m2203a(0, 40);
                        m2365b2.f4788as = (short) 2;
                    } else {
                        m2365b2.f4760Q = C0758f.m2136c(-0.05f, 0.05f);
                        m2365b2.f4761R = C0758f.m2136c(-0.05f, 0.0f);
                        m2365b2.f4751H = 1.3f;
                        m2365b2.f4750G = 1.3f;
                        m2365b2.f4766W = 60 + C0758f.m2203a(0, 40);
                        m2365b2.f4788as = (short) 1;
                    }
                    m2365b2.f4767X = m2365b2.f4766W;
                    m2365b2.f4736s = true;
                }
            }
            if (this.f1567d == 1 || this.f1567d == 2) {
                this.f6958el += C0758f.m2092i(this.f1618ce) * ((this.f4229eq / 2) - 3);
                this.f6959em += C0758f.m2097h(this.f1618ce) * ((this.f4229eq / 2) - 3);
            }
        }
    }

    /* renamed from: n */
    public void mo3351n() {
        super.mo3351n();
        this.f1618ce = C0758f.m2205a((this.f6959em * 5.0f) + (this.f6958el * 3.0f), false);
        if (this.f1567d == 0) {
            this.f1569f = ((int) ((this.f6959em * 5.0f) + (this.f6958el * 3.0f))) % 1;
        }
        if (this.f1567d == 1) {
        }
    }

    /* renamed from: a_ */
    public float m4812a_() {
        return -1.0f;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: a */
    public float mo3052a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        boolean z = this.f1607bT;
        float a = super.mo3052a(abstractC0244am, f, c0188f);
        if (!z && this.f1607bT && c0188f != null) {
            this.f1618ce = C0758f.m2123d(this.f6958el, this.f6959em, c0188f.f6958el, c0188f.f6959em) + 180.0f;
        }
        return a;
    }

    /* renamed from: q */
    public boolean mo3347q() {
        return true;
    }

    /* renamed from: t */
    public boolean mo1757t() {
        return true;
    }
}
