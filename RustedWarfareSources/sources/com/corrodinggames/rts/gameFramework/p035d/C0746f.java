package com.corrodinggames.rts.gameFramework.p035d;

import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.gameFramework.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/f.class */
public class C0746f extends AbstractC1120w {

    /* renamed from: a */
    public float f4795a;

    /* renamed from: c */
    float f4797c;

    /* renamed from: d */
    float f4798d;

    /* renamed from: e */
    float f4799e;

    /* renamed from: f */
    float f4800f;

    /* renamed from: g */
    float f4801g;

    /* renamed from: h */
    float f4802h;

    /* renamed from: i */
    C0745e f4803i;

    /* renamed from: m */
    float f4807m;

    /* renamed from: n */
    float f4808n;

    /* renamed from: o */
    float f4809o;

    /* renamed from: p */
    float f4810p;

    /* renamed from: q */
    float f4811q;

    /* renamed from: r */
    float f4812r;

    /* renamed from: s */
    EnumC0748h f4813s;

    /* renamed from: t */
    public float f4814t;

    /* renamed from: v */
    static C0745e f4816v;

    /* renamed from: w */
    static C0745e f4817w;

    /* renamed from: x */
    private final C0743c f4818x;

    /* renamed from: b */
    public boolean f4796b = true;

    /* renamed from: j */
    public int f4804j = 0;

    /* renamed from: k */
    public int f4805k = 0;

    /* renamed from: l */
    public int f4806l = -1;

    /* renamed from: u */
    public boolean f4815u = false;

    /* renamed from: b */
    public static void m2341b() {
        C0743c c0743c = Core.m1087A().f6116bR;
        C0745e c0745e = new C0745e(c0743c);
        m2345a(c0745e, false);
        c0745e.f4787ar = 18;
        c0745e.f4738u = 15.0f;
        f4816v = c0745e;
        C0745e c0745e2 = new C0745e(c0743c);
        m2339b(c0745e2, false);
        f4817w = c0745e2;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f6958el);
        streamWriter.mo1335a(this.f6959em);
        streamWriter.mo1335a(this.f4795a);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m2343a(Reader reader) {
        this.f6958el = reader.m1300g();
        this.f6959em = reader.m1300g();
        this.f4795a = reader.m1300g();
        this.f4796b = false;
        super.m440a(reader);
    }

    public C0746f(C0743c c0743c) {
        this.f4818x = c0743c;
    }

    /* renamed from: a */
    public static void m2345a(C0745e c0745e, boolean z) {
        c0745e.m2349c();
        c0745e.f4787ar = 5;
        if (z) {
            c0745e.f4786aq = C0758f.m2203a(0, 1);
        } else {
            c0745e.f4786aq = 0;
        }
        c0745e.f4769Z = 0.0f;
        c0745e.f4784ao = true;
        c0745e.f4760Q = 0.1f;
        c0745e.f4762S = 0.5f;
        c0745e.f4739v = true;
        c0745e.f4766W = 300.0f;
        c0745e.f4767X = c0745e.f4766W;
        c0745e.f4736s = true;
        c0745e.f4737t = true;
        c0745e.f4738u = 40.0f;
        c0745e.f4789at = false;
        c0745e.f4788as = (short) 2;
        c0745e.f4751H = 0.4f;
        c0745e.f4750G = 1.5f;
        c0745e.f4724g = C0745e.f4728k;
    }

    /* renamed from: b */
    public static void m2339b(C0745e c0745e, boolean z) {
        c0745e.m2349c();
        c0745e.f4787ar = 7;
        if (z) {
            c0745e.f4786aq = C0758f.m2203a(0, 3);
        } else {
            c0745e.f4786aq = 0;
        }
        c0745e.f4769Z = 0.0f;
        c0745e.f4784ao = true;
        c0745e.f4760Q = 0.0f;
        c0745e.f4762S = 0.2f;
        c0745e.f4739v = true;
        c0745e.f4766W = 50.0f;
        c0745e.f4767X = c0745e.f4766W;
        c0745e.f4736s = true;
        c0745e.f4737t = true;
        c0745e.f4738u = 10.0f;
        c0745e.f4789at = false;
        c0745e.f4788as = (short) 2;
        c0745e.f4724g = C0745e.f4731n;
    }

    /* renamed from: a */
    public static C0746f m2348a(float f, float f2) {
        C0746f m2347a = m2347a(f, f2, f4816v);
        m2347a.f4795a = 280.0f;
        m2347a.f4800f = 10.0f;
        m2347a.f4797c = 10.0f;
        m2347a.f4807m = 0.03f;
        m2347a.f4808n = 0.03f;
        m2347a.f4810p = 6.0f;
        m2347a.f4811q = 6.0f;
        m2347a.f4813s = EnumC0748h.f4832a;
        m2347a.f4812r = 180.0f;
        m2347a.f4804j = -16777216;
        return m2347a;
    }

    /* renamed from: b */
    public static C0746f m2340b(float f, float f2) {
        C0746f m2347a = m2347a(f, f2, f4817w);
        m2347a.f4795a = 330.0f;
        m2347a.f4800f = 10.0f;
        m2347a.f4797c = 10.0f;
        m2347a.f4807m = 0.1f;
        m2347a.f4808n = 0.03f;
        m2347a.f4810p = 4.0f;
        m2347a.f4811q = 4.0f;
        m2347a.f4813s = EnumC0748h.f4832a;
        return m2347a;
    }

    /* renamed from: a */
    public static C0746f m2347a(float f, float f2, C0745e c0745e) {
        C0743c c0743c = Core.m1087A().f6116bR;
        C0746f c0746f = new C0746f(c0743c);
        c0746f.f6958el = f;
        c0746f.f6959em = f2;
        c0746f.f4795a = 100.0f;
        c0746f.f4800f = 10.0f;
        c0746f.f4803i = c0745e;
        if (c0745e == null) {
            c0746f.f4803i = new C0745e(c0743c);
            Core.m998b("Error: Emitter create srcEffect==null");
        }
        return c0746f;
    }

    /* renamed from: c */
    public boolean m2338c() {
        return Core.m1087A().f6252cO.m5855b(this.f6958el, this.f6959em);
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        C0745e m2365b;
        this.f4814t = C0758f.m2211a(this.f4814t, f);
        if (this.f4814t > 0.0f) {
            return;
        }
        if (this.f4796b) {
            this.f4797c += f;
            if (this.f4797c > this.f4800f) {
                this.f4798d += f;
                if (this.f4798d > this.f4801g) {
                    this.f4798d = 0.0f;
                    this.f4799e += 1.0f;
                    if (this.f4799e > this.f4802h) {
                        this.f4797c = 0.0f;
                        this.f4799e = 0.0f;
                    }
                    if ((this.f4815u || m2338c()) && (m2365b = this.f4818x.m2365b(this.f6958el, this.f6959em, 0.0f, EnumC0744d.f4707a, false, this.f4813s)) != null) {
                        m2365b.m2353a(this.f4803i);
                        m2365b.f4760Q += C0758f.m2136c(-this.f4807m, this.f4807m);
                        m2365b.f4761R += C0758f.m2136c(-this.f4808n, this.f4808n);
                        m2365b.f4762S += C0758f.m2136c(-this.f4809o, this.f4809o);
                        m2365b.f4769Z = C0758f.m2136c(-this.f4812r, this.f4812r);
                        m2365b.f4753J = this.f6958el;
                        m2365b.f4754K = this.f6959em;
                        m2365b.f4753J += C0758f.m2136c(-this.f4810p, this.f4810p);
                        m2365b.f4754K += C0758f.m2136c(-this.f4811q, this.f4811q);
                        if (this.f4804j != 0) {
                            m2365b.f4742y = this.f4804j;
                        }
                        if (this.f4806l >= 0) {
                            m2365b.f4743z = this.f4805k;
                            m2365b.f4744A = this.f4806l;
                        }
                    }
                }
            }
        }
        this.f4795a -= f;
        if (this.f4795a < 0.0f) {
            mo2689a();
        }
    }

    /* renamed from: a */
    public boolean m2342a(Core core) {
        return false;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        return false;
    }

    /* renamed from: e */
    public void mo3151e(float f) {
    }

    /* renamed from: a */
    public void mo3053a(float f, boolean z) {
    }

    /* renamed from: d */
    public void m2336d(float f) {
    }

    /* renamed from: f */
    public boolean m2334f(float f) {
        return false;
    }
}
