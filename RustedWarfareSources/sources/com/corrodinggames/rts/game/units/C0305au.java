package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0637ab;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    AbstractC0244am f1801h;

    /* renamed from: i */
    public C0637ab f1802i;

    /* renamed from: j */
    public boolean f1803j;

    /* renamed from: m */
    public boolean f1804m;

    /* renamed from: n */
    public boolean f1805n;

    /* renamed from: e */
    float f1806e = 1.0f;

    /* renamed from: f */
    float f1807f = 1.0f;

    /* renamed from: g */
    long f1808g = -1;

    /* renamed from: k */
    public float f1809k = -1.0f;

    /* renamed from: l */
    public float f1810l = -1.0f;

    /* renamed from: a */
    public boolean m4233a(C0305au c0305au) {
        if (C0758f.m2085c(this.f1806e - c0305au.f1806e) > 3.0f || C0758f.m2085c(this.f1807f - c0305au.f1807f) > 3.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m4227b(C0305au c0305au) {
        if (c0305au == null || this.f1797a != c0305au.f1797a || this.f1798b != c0305au.f1798b || C0758f.m2085c(this.f1806e - c0305au.f1806e) > 1.0f || C0758f.m2085c(this.f1807f - c0305au.f1807f) > 1.0f || this.f1800d != c0305au.f1800d || this.f1801h != c0305au.f1801h) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public InterfaceC0303as m4237a() {
        return this.f1798b;
    }

    /* renamed from: b */
    public int m4230b() {
        return this.f1800d;
    }

    /* renamed from: a */
    public void m4232a(StreamWriter streamWriter) {
        streamWriter.mo1363a(this.f1797a);
        streamWriter.mo1370a(this.f1798b);
        streamWriter.mo1320a(this.f1806e);
        streamWriter.mo1320a(this.f1807f);
        if (this.f1808g != -1) {
            streamWriter.mo1373a(this.f1808g);
        } else {
            streamWriter.mo1318a(this.f1801h);
        }
        streamWriter.mo1355c(this.f1800d);
        streamWriter.mo1320a(this.f1809k);
        streamWriter.mo1320a(this.f1810l);
        streamWriter.mo1314a(this.f1804m);
        streamWriter.mo1314a(this.f1803j);
        streamWriter.mo1314a(this.f1805n);
        C0208c.m4535a(streamWriter, this.f1799c);
    }

    /* renamed from: a */
    public void m4231a(Reader reader) {
        this.f1797a = (EnumC0306av) reader.m1293b(EnumC0306av.class);
        this.f1798b = reader.m1275q();
        this.f1806e = reader.m1285g();
        this.f1807f = reader.m1285g();
        this.f1808g = reader.m1278n();
        this.f1801h = null;
        if (reader.m1295b() >= 40) {
            this.f1800d = reader.m1289d();
        }
        if (reader.m1295b() >= 46) {
            this.f1809k = reader.m1285g();
            this.f1810l = reader.m1285g();
        }
        if (reader.m1295b() >= 58) {
            this.f1804m = reader.ReadBool();
        }
        if (reader.m1295b() >= 65) {
            this.f1803j = reader.ReadBool();
        }
        if (reader.m1295b() >= 79) {
            this.f1805n = reader.ReadBool();
        }
        if (reader.m1295b() >= 82) {
            this.f1799c = C0208c.m4534a(reader);
        }
    }

    /* renamed from: c */
    public void m4226c() {
        if (this.f1808g != -1) {
            this.f1801h = AbstractC1120w.m442a(this.f1808g, true);
            if (this.f1801h == null) {
                LoggerMaybe.m983b("convertUnitIds failed");
                if (this.f1797a != null) {
                    LoggerMaybe.m983b("convertUnitIds: type:" + this.f1797a.toString());
                }
                if (this.f1798b != null) {
                    LoggerMaybe.m983b("convertUnitIds: build:" + this.f1798b.toString());
                }
                LoggerMaybe.m983b("convertUnitIds: x:" + this.f1806e + ", y:" + this.f1807f);
            }
            this.f1808g = -1L;
        }
    }

    /* renamed from: d */
    public EnumC0306av m4222d() {
        return this.f1797a;
    }

    /* renamed from: e */
    public void m4220e() {
        this.f1797a = EnumC0306av.move;
        this.f1798b = null;
        this.f1800d = 1;
        this.f1806e = 2.0f;
        this.f1807f = 2.0f;
        this.f1808g = -1L;
        this.f1801h = null;
        this.f1802i = null;
        this.f1809k = -1.0f;
        this.f1810l = -1.0f;
        this.f1804m = false;
        this.f1803j = false;
        this.f1805n = false;
        this.f1799c = null;
    }

    /* renamed from: f */
    public boolean m4218f() {
        return this.f1797a == EnumC0306av.attack || this.f1797a == EnumC0306av.repair || this.f1797a == EnumC0306av.reclaim || this.f1797a == EnumC0306av.loadInto || this.f1797a == EnumC0306av.loadUp || this.f1797a == EnumC0306av.guard || this.f1797a == EnumC0306av.touchTarget || this.f1797a == EnumC0306av.follow;
    }

    /* renamed from: g */
    public float m4216g() {
        if (m4218f() && this.f1801h != null) {
            return this.f1801h.f6957el;
        }
        return this.f1806e;
    }

    /* renamed from: h */
    public float m4214h() {
        if (m4218f() && this.f1801h != null) {
            return this.f1801h.f6958em;
        }
        return this.f1807f;
    }

    /* renamed from: i */
    public AbstractC0244am m4212i() {
        return this.f1801h;
    }

    /* renamed from: a */
    public void m4236a(float f, float f2) {
        m4220e();
        this.f1797a = EnumC0306av.move;
        this.f1806e = f;
        this.f1807f = f2;
    }

    /* renamed from: b */
    public void m4229b(float f, float f2) {
        m4220e();
        this.f1797a = EnumC0306av.attackMove;
        this.f1806e = f;
        this.f1807f = f2;
    }

    /* renamed from: a */
    public void m4234a(AbstractC0244am abstractC0244am) {
        m4220e();
        this.f1797a = EnumC0306av.attack;
        this.f1801h = abstractC0244am;
    }

    /* renamed from: a */
    public void m4235a(float f, float f2, InterfaceC0303as interfaceC0303as, int i) {
        m4220e();
        this.f1797a = EnumC0306av.build;
        this.f1806e = f;
        this.f1807f = f2;
        this.f1798b = interfaceC0303as;
        this.f1800d = (byte) i;
    }

    /* renamed from: b */
    public void m4228b(AbstractC0244am abstractC0244am) {
        m4220e();
        this.f1797a = EnumC0306av.repair;
        this.f1801h = abstractC0244am;
    }

    /* renamed from: c */
    public void m4224c(AbstractC0244am abstractC0244am) {
        m4220e();
        this.f1797a = EnumC0306av.guard;
        this.f1801h = abstractC0244am;
    }

    /* renamed from: d */
    public void m4221d(AbstractC0244am abstractC0244am) {
        m4220e();
        this.f1797a = EnumC0306av.touchTarget;
        this.f1801h = abstractC0244am;
    }

    /* renamed from: e */
    public void m4219e(AbstractC0244am abstractC0244am) {
        m4220e();
        this.f1797a = EnumC0306av.follow;
        this.f1801h = abstractC0244am;
    }

    /* renamed from: c */
    public void m4225c(float f, float f2) {
        m4220e();
        this.f1797a = EnumC0306av.patrol;
        this.f1806e = f;
        this.f1807f = f2;
    }

    /* renamed from: f */
    public void m4217f(AbstractC0244am abstractC0244am) {
        m4220e();
        this.f1797a = EnumC0306av.reclaim;
        this.f1801h = abstractC0244am;
    }

    /* renamed from: g */
    public void m4215g(AbstractC0244am abstractC0244am) {
        m4220e();
        this.f1797a = EnumC0306av.loadInto;
        this.f1801h = abstractC0244am;
    }

    /* renamed from: h */
    public void m4213h(AbstractC0244am abstractC0244am) {
        m4220e();
        this.f1797a = EnumC0306av.loadUp;
        this.f1801h = abstractC0244am;
    }

    /* renamed from: c */
    public void m4223c(C0305au c0305au) {
        m4220e();
        this.f1797a = c0305au.f1797a;
        this.f1798b = c0305au.f1798b;
        this.f1806e = c0305au.f1806e;
        this.f1807f = c0305au.f1807f;
        this.f1801h = c0305au.f1801h;
        this.f1802i = c0305au.f1802i;
        this.f1800d = c0305au.f1800d;
        this.f1803j = c0305au.f1803j;
        this.f1799c = c0305au.f1799c;
    }

    /* renamed from: j */
    public long m4211j() {
        long j = 0;
        if (this.f1797a != null) {
            j = 0 + this.f1797a.ordinal();
        }
        return j;
    }

    /* renamed from: k */
    public void m4210k() {
        if (this.f1801h != null) {
            this.f1808g = this.f1801h.f6951ee;
            this.f1801h = null;
        }
        this.f1802i = null;
    }

    /* renamed from: l */
    public AbstractC0244am m4209l() {
        if (m4218f()) {
            return m4212i();
        }
        AbstractC0623y abstractC0623y = AbstractC0197n.f1371i.f1314s;
        abstractC0623y.f1618ce = 0.0f;
        abstractC0623y.f6957el = this.f1806e;
        abstractC0623y.f6958em = this.f1807f;
        abstractC0623y.f6959en = 0.0f;
        return abstractC0623y;
    }
}
