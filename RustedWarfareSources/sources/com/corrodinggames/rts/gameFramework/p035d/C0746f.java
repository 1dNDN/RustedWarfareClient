package com.corrodinggames.rts.gameFramework.p035d;

import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.gameFramework.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/f.class */
public class C0746f extends AbstractC1120w {

    /* renamed from: a */
    public float f4795a;

    /* renamed from: c */
    float f4796c;

    /* renamed from: d */
    float f4797d;

    /* renamed from: e */
    float f4798e;

    /* renamed from: f */
    float f4799f;

    /* renamed from: g */
    float f4800g;

    /* renamed from: h */
    float f4801h;

    /* renamed from: i */
    C0745e f4802i;

    /* renamed from: m */
    float f4803m;

    /* renamed from: n */
    float f4804n;

    /* renamed from: o */
    float f4805o;

    /* renamed from: p */
    float f4806p;

    /* renamed from: q */
    float f4807q;

    /* renamed from: r */
    float f4808r;

    /* renamed from: s */
    EnumC0748h f4809s;

    /* renamed from: t */
    public float f4810t;

    /* renamed from: v */
    static C0745e f4811v;

    /* renamed from: w */
    static C0745e f4812w;

    /* renamed from: x */
    private final C0743c f4813x;

    /* renamed from: b */
    public boolean f4814b = true;

    /* renamed from: j */
    public int f4815j = 0;

    /* renamed from: k */
    public int f4816k = 0;

    /* renamed from: l */
    public int f4817l = -1;

    /* renamed from: u */
    public boolean f4818u = false;

    /* renamed from: b */
    public static void m2289b() {
        C0743c c0743c = LoggerMaybe.m1072A().f6116bR;
        C0745e c0745e = new C0745e(c0743c);
        m2293a(c0745e, false);
        c0745e.f4768ar = 18;
        c0745e.f4727u = 15.0f;
        f4811v = c0745e;
        C0745e c0745e2 = new C0745e(c0743c);
        m2287b(c0745e2, false);
        f4812w = c0745e2;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f6957el);
        streamWriter.mo1320a(this.f6958em);
        streamWriter.mo1320a(this.f4795a);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f6957el = reader.m1285g();
        this.f6958em = reader.m1285g();
        this.f4795a = reader.m1285g();
        this.f4814b = false;
        super.mo2291a(reader);
    }

    public C0746f(C0743c c0743c) {
        this.f4813x = c0743c;
    }

    /* renamed from: a */
    public static void m2293a(C0745e c0745e, boolean z) {
        c0745e.m2297c();
        c0745e.f4768ar = 5;
        if (z) {
            c0745e.f4767aq = C0758f.m2151a(0, 1);
        } else {
            c0745e.f4767aq = 0;
        }
        c0745e.f4752Z = 0.0f;
        c0745e.f4790ao = true;
        c0745e.f4744Q = 0.1f;
        c0745e.f4746S = 0.5f;
        c0745e.f4728v = true;
        c0745e.f4750W = 300.0f;
        c0745e.f4751X = c0745e.f4750W;
        c0745e.f4725s = true;
        c0745e.f4726t = true;
        c0745e.f4727u = 40.0f;
        c0745e.f4793at = false;
        c0745e.f4792as = (short) 2;
        c0745e.f4735H = 0.4f;
        c0745e.f4734G = 1.5f;
        c0745e.f4721g = C0745e.f4775k;
    }

    /* renamed from: b */
    public static void m2287b(C0745e c0745e, boolean z) {
        c0745e.m2297c();
        c0745e.f4768ar = 7;
        if (z) {
            c0745e.f4767aq = C0758f.m2151a(0, 3);
        } else {
            c0745e.f4767aq = 0;
        }
        c0745e.f4752Z = 0.0f;
        c0745e.f4790ao = true;
        c0745e.f4744Q = 0.0f;
        c0745e.f4746S = 0.2f;
        c0745e.f4728v = true;
        c0745e.f4750W = 50.0f;
        c0745e.f4751X = c0745e.f4750W;
        c0745e.f4725s = true;
        c0745e.f4726t = true;
        c0745e.f4727u = 10.0f;
        c0745e.f4793at = false;
        c0745e.f4792as = (short) 2;
        c0745e.f4721g = C0745e.f4778n;
    }

    /* renamed from: a */
    public static C0746f m2296a(float f, float f2) {
        C0746f m2295a = m2295a(f, f2, f4811v);
        m2295a.f4795a = 280.0f;
        m2295a.f4799f = 10.0f;
        m2295a.f4796c = 10.0f;
        m2295a.f4803m = 0.03f;
        m2295a.f4804n = 0.03f;
        m2295a.f4806p = 6.0f;
        m2295a.f4807q = 6.0f;
        m2295a.f4809s = EnumC0748h.f4832a;
        m2295a.f4808r = 180.0f;
        m2295a.f4815j = -16777216;
        return m2295a;
    }

    /* renamed from: b */
    public static C0746f m2288b(float f, float f2) {
        C0746f m2295a = m2295a(f, f2, f4812w);
        m2295a.f4795a = 330.0f;
        m2295a.f4799f = 10.0f;
        m2295a.f4796c = 10.0f;
        m2295a.f4803m = 0.1f;
        m2295a.f4804n = 0.03f;
        m2295a.f4806p = 4.0f;
        m2295a.f4807q = 4.0f;
        m2295a.f4809s = EnumC0748h.f4832a;
        return m2295a;
    }

    /* renamed from: a */
    public static C0746f m2295a(float f, float f2, C0745e c0745e) {
        C0743c c0743c = LoggerMaybe.m1072A().f6116bR;
        C0746f c0746f = new C0746f(c0743c);
        c0746f.f6957el = f;
        c0746f.f6958em = f2;
        c0746f.f4795a = 100.0f;
        c0746f.f4799f = 10.0f;
        c0746f.f4802i = c0745e;
        if (c0745e == null) {
            c0746f.f4802i = new C0745e(c0743c);
            LoggerMaybe.m983b("Error: Emitter create srcEffect==null");
        }
        return c0746f;
    }

    /* renamed from: c */
    public boolean m2286c() {
        return LoggerMaybe.m1072A().f6252cO.m5345b(this.f6957el, this.f6958em);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        C0745e m2313b;
        this.f4810t = C0758f.m2159a(this.f4810t, f);
        if (this.f4810t > 0.0f) {
            return;
        }
        if (this.f4814b) {
            this.f4796c += f;
            if (this.f4796c > this.f4799f) {
                this.f4797d += f;
                if (this.f4797d > this.f4800g) {
                    this.f4797d = 0.0f;
                    this.f4798e += 1.0f;
                    if (this.f4798e > this.f4801h) {
                        this.f4796c = 0.0f;
                        this.f4798e = 0.0f;
                    }
                    if ((this.f4818u || m2286c()) && (m2313b = this.f4813x.m2313b(this.f6957el, this.f6958em, 0.0f, EnumC0744d.f4707a, false, this.f4809s)) != null) {
                        m2313b.m2301a(this.f4802i);
                        m2313b.f4744Q += C0758f.m2084c(-this.f4803m, this.f4803m);
                        m2313b.f4745R += C0758f.m2084c(-this.f4804n, this.f4804n);
                        m2313b.f4746S += C0758f.m2084c(-this.f4805o, this.f4805o);
                        m2313b.f4752Z = C0758f.m2084c(-this.f4808r, this.f4808r);
                        m2313b.f4737J = this.f6957el;
                        m2313b.f4738K = this.f6958em;
                        m2313b.f4737J += C0758f.m2084c(-this.f4806p, this.f4806p);
                        m2313b.f4738K += C0758f.m2084c(-this.f4807q, this.f4807q);
                        if (this.f4815j != 0) {
                            m2313b.f4730y = this.f4815j;
                        }
                        if (this.f4817l >= 0) {
                            m2313b.f4731z = this.f4816k;
                            m2313b.f4787A = this.f4817l;
                        }
                    }
                }
            }
        }
        this.f4795a -= f;
        if (this.f4795a < 0.0f) {
            mo2635a();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public boolean mo2290a(LoggerMaybe loggerMaybe) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo2285c(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo2283e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2294a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: d */
    public void mo2284d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: f */
    public boolean mo2282f(float f) {
        return false;
    }
}
