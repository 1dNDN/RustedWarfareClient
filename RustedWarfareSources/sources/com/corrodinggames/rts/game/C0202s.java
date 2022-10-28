package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p024d.C0499j;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/s.class */
public final class C0202s {

    /* renamed from: b */
    public int f1401b;

    /* renamed from: c */
    public int f1402c;

    /* renamed from: d */
    public int f1403d;

    /* renamed from: e */
    public int f1404e;

    /* renamed from: f */
    public int f1405f;

    /* renamed from: g */
    public int f1406g;

    /* renamed from: m */
    public boolean f1412m;

    /* renamed from: a */
    public int f1400a = 5;

    /* renamed from: h */
    public C0439f f1407h = new C0439f();

    /* renamed from: i */
    public C0439f f1408i = new C0439f();

    /* renamed from: j */
    public C0439f f1409j = new C0439f();

    /* renamed from: k */
    public C0439f f1410k = new C0439f();

    /* renamed from: l */
    public C0439f f1411l = new C0439f();

    /* renamed from: n */
    public C0203t f1413n = new C0203t();

    /* renamed from: o */
    public C0203t f1414o = new C0203t();

    /* renamed from: a */
    public void m4223a(AbstractC0244am abstractC0244am) {
        this.f1403d++;
        if (abstractC0244am.f1624ck < 1.0f) {
            this.f1405f++;
        } else {
            this.f1402c++;
        }
        if (!abstractC0244am.mo1708r().mo3399k()) {
            this.f1401b++;
        }
        if (!this.f1412m && !abstractC0244am.mo1706u() && abstractC0244am.mo1708r().mo3376y()) {
            this.f1412m = true;
        }
        C0424b m4078do = abstractC0244am.m4078do();
        if (m4078do != null) {
            this.f1410k.m3635a(m4078do, 0.0d, Double.MAX_VALUE);
            this.f1411l.m3635a(m4078do, -1.7976931348623157E308d, 0.0d);
        }
        if (abstractC0244am instanceof InterfaceC0501l) {
            InterfaceC0501l interfaceC0501l = (InterfaceC0501l) abstractC0244am;
            int mo3220f = interfaceC0501l.mo3220f(false);
            this.f1401b += mo3220f;
            this.f1404e += mo3220f;
            if (mo3220f != 0) {
                m4221a(interfaceC0501l);
            }
        }
        m4218c(abstractC0244am);
        float mo3266cw = abstractC0244am.mo3266cw();
        if (mo3266cw != 0.0f && abstractC0244am.f1624ck >= 1.0f) {
            this.f1406g = (int) (this.f1406g + mo3266cw);
        }
        C0439f mo3497cy = abstractC0244am.mo3497cy();
        if (!mo3497cy.m3611c() && abstractC0244am.f1624ck >= 1.0f) {
            this.f1407h.m3617b(mo3497cy);
            this.f1408i.m3630a(mo3497cy, 0.0d, Double.MAX_VALUE);
            this.f1409j.m3630a(mo3497cy, -1.7976931348623157E308d, 0.0d);
        }
    }

    /* renamed from: b */
    public void m4220b(AbstractC0244am abstractC0244am) {
        this.f1403d--;
        if (abstractC0244am.f1624ck < 1.0f) {
            this.f1405f--;
        } else {
            this.f1402c--;
        }
        if (!abstractC0244am.mo1708r().mo3399k()) {
            this.f1401b--;
        }
        C0424b m4078do = abstractC0244am.m4078do();
        if (m4078do != null) {
            this.f1410k.m3620b(m4078do, 0.0d, Double.MAX_VALUE);
            this.f1411l.m3620b(m4078do, -1.7976931348623157E308d, 0.0d);
        }
        if (abstractC0244am instanceof InterfaceC0501l) {
            InterfaceC0501l interfaceC0501l = (InterfaceC0501l) abstractC0244am;
            int mo3220f = interfaceC0501l.mo3220f(false);
            this.f1401b -= mo3220f;
            this.f1404e -= mo3220f;
            if (mo3220f != 0) {
                m4219b(interfaceC0501l);
            }
        }
        m4217d(abstractC0244am);
        float mo3266cw = abstractC0244am.mo3266cw();
        if (mo3266cw != 0.0f && abstractC0244am.f1624ck >= 1.0f) {
            this.f1406g = (int) (this.f1406g - mo3266cw);
        }
        C0439f mo3497cy = abstractC0244am.mo3497cy();
        if (!mo3497cy.m3611c() && abstractC0244am.f1624ck >= 1.0f) {
            this.f1407h.m3608c(mo3497cy);
            this.f1408i.m3615b(mo3497cy, 0.0d, Double.MAX_VALUE);
            this.f1409j.m3615b(mo3497cy, -1.7976931348623157E308d, 0.0d);
        }
    }

    /* renamed from: c */
    private final void m4218c(AbstractC0244am abstractC0244am) {
        C0449h mo3487dc = abstractC0244am.mo3487dc();
        if (mo3487dc != null) {
            for (C0448g c0448g : mo3487dc.f2838a) {
                C0199p m4222a = m4222a(c0448g);
                if (abstractC0244am.f1624ck < 1.0f) {
                    m4222a.f1387c++;
                } else {
                    m4222a.f1386b++;
                }
            }
        }
    }

    /* renamed from: d */
    private final void m4217d(AbstractC0244am abstractC0244am) {
        C0449h mo3487dc = abstractC0244am.mo3487dc();
        if (mo3487dc != null) {
            for (C0448g c0448g : mo3487dc.f2838a) {
                C0199p m4222a = m4222a(c0448g);
                if (abstractC0244am.f1624ck < 1.0f) {
                    m4222a.f1387c--;
                } else {
                    m4222a.f1386b--;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m4221a(InterfaceC0501l interfaceC0501l) {
        InterfaceC0303as interfaceC0303as;
        C0449h mo3377x;
        C1101m mo3224du = interfaceC0501l.mo3224du();
        if (mo3224du.f6894a != 0) {
            Iterator it = mo3224du.iterator();
            while (it.hasNext()) {
                C0499j c0499j = (C0499j) it.next();
                if (c0499j.f3490f && (interfaceC0303as = c0499j.f3491g) != null && (mo3377x = interfaceC0303as.mo3377x()) != null) {
                    for (C0448g c0448g : mo3377x.f2838a) {
                        m4222a(c0448g).f1388d += c0499j.f3485a;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final void m4219b(InterfaceC0501l interfaceC0501l) {
        InterfaceC0303as interfaceC0303as;
        C0449h mo3377x;
        C1101m mo3224du = interfaceC0501l.mo3224du();
        if (mo3224du.f6894a != 0) {
            Iterator it = mo3224du.iterator();
            while (it.hasNext()) {
                C0499j c0499j = (C0499j) it.next();
                if (c0499j.f3490f && (interfaceC0303as = c0499j.f3491g) != null && (mo3377x = interfaceC0303as.mo3377x()) != null) {
                    for (C0448g c0448g : mo3377x.f2838a) {
                        m4222a(c0448g).f1388d -= c0499j.f3485a;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C0199p m4222a(C0448g c0448g) {
        C0199p[] c0199pArr = this.f1414o.f1416b;
        int i = this.f1414o.f1417c;
        for (int i2 = 0; i2 < i; i2++) {
            C0199p c0199p = c0199pArr[i2];
            if (c0199p.f1385a == c0448g) {
                return c0199p;
            }
            if (c0199p.f1385a == null) {
                c0199p.f1385a = c0448g;
                return c0199p;
            }
        }
        C0199p c0199p2 = new C0199p();
        c0199p2.f1385a = c0448g;
        this.f1414o.m4216a(c0199p2);
        return c0199p2;
    }
}
