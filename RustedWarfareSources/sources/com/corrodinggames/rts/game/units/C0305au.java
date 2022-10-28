package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0637ab;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.game.units.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/au.class */
public final class C0305au {

    /* renamed from: a */
    EnumC0306av f1797a;

    /* renamed from: b */
    InterfaceC0303as f1798b;

    /* renamed from: c */
    C0208c f1799c;

    /* renamed from: d */
    int f1800d;

    /* renamed from: h */
    AbstractC0244am f1804h;

    /* renamed from: i */
    public C0637ab f1805i;

    /* renamed from: j */
    public boolean f1806j;

    /* renamed from: m */
    public boolean f1809m;

    /* renamed from: n */
    public boolean f1810n;

    /* renamed from: e */
    float f1801e = 1.0f;

    /* renamed from: f */
    float f1802f = 1.0f;

    /* renamed from: g */
    long f1803g = -1;

    /* renamed from: k */
    public float f1807k = -1.0f;

    /* renamed from: l */
    public float f1808l = -1.0f;

    /* renamed from: a */
    public boolean m4455a(C0305au c0305au) {
        if (C0758f.m2137c(this.f1801e - c0305au.f1801e) > 3.0f || C0758f.m2137c(this.f1802f - c0305au.f1802f) > 3.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m4449b(C0305au c0305au) {
        if (c0305au == null || this.f1797a != c0305au.f1797a || this.f1798b != c0305au.f1798b || C0758f.m2137c(this.f1801e - c0305au.f1801e) > 1.0f || C0758f.m2137c(this.f1802f - c0305au.f1802f) > 1.0f || this.f1800d != c0305au.f1800d || this.f1804h != c0305au.f1804h) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public InterfaceC0303as m4459a() {
        return this.f1798b;
    }

    /* renamed from: b */
    public int m4452b() {
        return this.f1800d;
    }

    /* renamed from: a */
    public void m4454a(StreamWriter streamWriter) {
        streamWriter.m1411a(this.f1797a);
        streamWriter.m1421a(this.f1798b);
        streamWriter.mo1335a(this.f1801e);
        streamWriter.mo1335a(this.f1802f);
        if (this.f1803g != -1) {
            streamWriter.m1424a(this.f1803g);
        } else {
            streamWriter.mo1333a(this.f1804h);
        }
        streamWriter.m1401c(this.f1800d);
        streamWriter.mo1335a(this.f1807k);
        streamWriter.mo1335a(this.f1808l);
        streamWriter.mo1329a(this.f1809m);
        streamWriter.mo1329a(this.f1806j);
        streamWriter.mo1329a(this.f1810n);
        C0208c.m4990a(streamWriter, this.f1799c);
    }

    /* renamed from: a */
    public void m4453a(Reader reader) {
        this.f1797a = (EnumC0306av) reader.m1308b(EnumC0306av.class);
        this.f1798b = reader.m1290q();
        this.f1801e = reader.m1300g();
        this.f1802f = reader.m1300g();
        this.f1803g = reader.m1293n();
        this.f1804h = null;
        if (reader.m1310b() >= 40) {
            this.f1800d = reader.m1304d();
        }
        if (reader.m1310b() >= 46) {
            this.f1807k = reader.m1300g();
            this.f1808l = reader.m1300g();
        }
        if (reader.m1310b() >= 58) {
            this.f1809m = reader.ReadBool();
        }
        if (reader.m1310b() >= 65) {
            this.f1806j = reader.ReadBool();
        }
        if (reader.m1310b() >= 79) {
            this.f1810n = reader.ReadBool();
        }
        if (reader.m1310b() >= 82) {
            this.f1799c = C0208c.m4989a(reader);
        }
    }

    /* renamed from: c */
    public void m4448c() {
        if (this.f1803g != -1) {
            this.f1804h = AbstractC1120w.m442a(this.f1803g, true);
            if (this.f1804h == null) {
                Core.m998b("convertUnitIds failed");
                if (this.f1797a != null) {
                    Core.m998b("convertUnitIds: type:" + this.f1797a.toString());
                }
                if (this.f1798b != null) {
                    Core.m998b("convertUnitIds: build:" + this.f1798b.toString());
                }
                Core.m998b("convertUnitIds: x:" + this.f1801e + ", y:" + this.f1802f);
            }
            this.f1803g = -1L;
        }
    }

    /* renamed from: d */
    public EnumC0306av m4444d() {
        return this.f1797a;
    }

    /* renamed from: e */
    public void m4442e() {
        this.f1797a = EnumC0306av.f1811a;
        this.f1798b = null;
        this.f1800d = 1;
        this.f1801e = 2.0f;
        this.f1802f = 2.0f;
        this.f1803g = -1L;
        this.f1804h = null;
        this.f1805i = null;
        this.f1807k = -1.0f;
        this.f1808l = -1.0f;
        this.f1809m = false;
        this.f1806j = false;
        this.f1810n = false;
        this.f1799c = null;
    }

    /* renamed from: f */
    public boolean m4440f() {
        return this.f1797a == EnumC0306av.f1812b || this.f1797a == EnumC0306av.f1814d || this.f1797a == EnumC0306av.f1817g || this.f1797a == EnumC0306av.f1815e || this.f1797a == EnumC0306av.f1819i || this.f1797a == EnumC0306av.f1821k || this.f1797a == EnumC0306av.f1823m || this.f1797a == EnumC0306av.f1824n;
    }

    /* renamed from: g */
    public float m4438g() {
        if (m4440f() && this.f1804h != null) {
            return this.f1804h.f6958el;
        }
        return this.f1801e;
    }

    /* renamed from: h */
    public float m4436h() {
        if (m4440f() && this.f1804h != null) {
            return this.f1804h.f6959em;
        }
        return this.f1802f;
    }

    /* renamed from: i */
    public AbstractC0244am m4434i() {
        return this.f1804h;
    }

    /* renamed from: a */
    public void m4458a(float f, float f2) {
        m4442e();
        this.f1797a = EnumC0306av.f1811a;
        this.f1801e = f;
        this.f1802f = f2;
    }

    /* renamed from: b */
    public void m4451b(float f, float f2) {
        m4442e();
        this.f1797a = EnumC0306av.f1818h;
        this.f1801e = f;
        this.f1802f = f2;
    }

    /* renamed from: a */
    public void m4456a(AbstractC0244am abstractC0244am) {
        m4442e();
        this.f1797a = EnumC0306av.f1812b;
        this.f1804h = abstractC0244am;
    }

    /* renamed from: a */
    public void m4457a(float f, float f2, InterfaceC0303as interfaceC0303as, int i) {
        m4442e();
        this.f1797a = EnumC0306av.f1813c;
        this.f1801e = f;
        this.f1802f = f2;
        this.f1798b = interfaceC0303as;
        this.f1800d = (byte) i;
    }

    /* renamed from: b */
    public void m4450b(AbstractC0244am abstractC0244am) {
        m4442e();
        this.f1797a = EnumC0306av.f1814d;
        this.f1804h = abstractC0244am;
    }

    /* renamed from: c */
    public void m4446c(AbstractC0244am abstractC0244am) {
        m4442e();
        this.f1797a = EnumC0306av.f1821k;
        this.f1804h = abstractC0244am;
    }

    /* renamed from: d */
    public void m4443d(AbstractC0244am abstractC0244am) {
        m4442e();
        this.f1797a = EnumC0306av.f1823m;
        this.f1804h = abstractC0244am;
    }

    /* renamed from: e */
    public void m4441e(AbstractC0244am abstractC0244am) {
        m4442e();
        this.f1797a = EnumC0306av.f1824n;
        this.f1804h = abstractC0244am;
    }

    /* renamed from: c */
    public void m4447c(float f, float f2) {
        m4442e();
        this.f1797a = EnumC0306av.f1820j;
        this.f1801e = f;
        this.f1802f = f2;
    }

    /* renamed from: f */
    public void m4439f(AbstractC0244am abstractC0244am) {
        m4442e();
        this.f1797a = EnumC0306av.f1817g;
        this.f1804h = abstractC0244am;
    }

    /* renamed from: g */
    public void m4437g(AbstractC0244am abstractC0244am) {
        m4442e();
        this.f1797a = EnumC0306av.f1815e;
        this.f1804h = abstractC0244am;
    }

    /* renamed from: h */
    public void m4435h(AbstractC0244am abstractC0244am) {
        m4442e();
        this.f1797a = EnumC0306av.f1819i;
        this.f1804h = abstractC0244am;
    }

    /* renamed from: c */
    public void m4445c(C0305au c0305au) {
        m4442e();
        this.f1797a = c0305au.f1797a;
        this.f1798b = c0305au.f1798b;
        this.f1801e = c0305au.f1801e;
        this.f1802f = c0305au.f1802f;
        this.f1804h = c0305au.f1804h;
        this.f1805i = c0305au.f1805i;
        this.f1800d = c0305au.f1800d;
        this.f1806j = c0305au.f1806j;
        this.f1799c = c0305au.f1799c;
    }

    /* renamed from: j */
    public long m4433j() {
        long j = 0;
        if (this.f1797a != null) {
            j = 0 + this.f1797a.ordinal();
        }
        return j;
    }

    /* renamed from: k */
    public void m4432k() {
        if (this.f1804h != null) {
            this.f1803g = this.f1804h.f6951ee;
            this.f1804h = null;
        }
        this.f1805i = null;
    }

    /* renamed from: l */
    public AbstractC0244am m4431l() {
        if (m4440f()) {
            return m4434i();
        }
        AbstractC0623y abstractC0623y = AbstractC0197n.f1371i.f1314s;
        abstractC0623y.f1618ce = 0.0f;
        abstractC0623y.f6958el = this.f1801e;
        abstractC0623y.f6959em = this.f1802f;
        abstractC0623y.f6960en = 0.0f;
        return abstractC0623y;
    }
}
