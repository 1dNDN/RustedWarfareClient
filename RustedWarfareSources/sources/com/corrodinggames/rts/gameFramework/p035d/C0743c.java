package com.corrodinggames.rts.gameFramework.p035d;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.gameFramework.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/c.class */
public final class C0743c {

    /* renamed from: h */
    public static boolean f4690h;

    /* renamed from: i */
    public int f4691i;

    /* renamed from: j */
    public int f4692j;

    /* renamed from: k */
    public static C0928ae f4693k;

    /* renamed from: l */
    public C0934e f4694l;

    /* renamed from: m */
    public C0934e f4695m;

    /* renamed from: s */
    public static C0747g[] f4701s;

    /* renamed from: f */
    public static C0745e[] f4688f = new C0745e[0];

    /* renamed from: g */
    public static int f4689g = 0;

    /* renamed from: n */
    public static final RectF f4696n = new RectF();

    /* renamed from: o */
    public static final Rect f4697o = new Rect();

    /* renamed from: p */
    public static final Rect f4698p = new Rect();

    /* renamed from: q */
    public static final Paint f4699q = new Paint();

    /* renamed from: r */
    public static final Paint f4700r = new Paint();

    /* renamed from: a */
    public int f4683a = 0;

    /* renamed from: b */
    public int f4684b = 80;

    /* renamed from: c */
    public int f4685c = 100;

    /* renamed from: d */
    public int f4686d = 110;

    /* renamed from: e */
    public int f4687e = 120;

    /* renamed from: t */
    EnumC0748h f4702t = null;

    /* renamed from: u */
    boolean f4703u = false;

    /* renamed from: v */
    boolean f4704v = false;

    /* renamed from: w */
    public final Paint f4705w = new Paint();

    /* renamed from: x */
    float f4706x = 0.0f;

    /* renamed from: a */
    public C0745e m2378a(EnumC0748h enumC0748h) {
        int i = 0;
        int m1004b = Core.m1087A().m1004b();
        if (m1004b < 13) {
            i = -this.f4692j;
        } else if (m1004b < 28) {
            i = -this.f4691i;
        }
        int i2 = this.f4683a;
        if (enumC0748h == EnumC0748h.f4832a && i2 > this.f4684b + i) {
            return null;
        }
        if (enumC0748h == EnumC0748h.f4833b && i2 > this.f4685c + i) {
            return null;
        }
        if (enumC0748h == EnumC0748h.f4834c && i2 > this.f4686d + i) {
            return null;
        }
        if (enumC0748h == EnumC0748h.f4835d && i2 > this.f4687e + i) {
            return null;
        }
        C0745e m2373a = m2373a(true, (EnumC0748h) null);
        if (m2373a == null && (enumC0748h == EnumC0748h.f4836e || enumC0748h == EnumC0748h.f4835d)) {
            m2373a = m2373a(false, EnumC0748h.f4834c);
        }
        if (m2373a != null) {
            if (!m2373a.f4733p) {
                m2373a.f4733p = true;
                this.f4683a++;
            }
            return m2373a;
        }
        return null;
    }

    /* renamed from: a */
    private C0745e m2373a(boolean z, EnumC0748h enumC0748h) {
        C0745e[] c0745eArr = f4688f;
        int length = c0745eArr.length;
        if (z && enumC0748h == null) {
            for (int i = 0; i < length; i++) {
                C0745e c0745e = c0745eArr[i];
                if (!c0745e.f4733p) {
                    if (f4689g == i) {
                        f4689g++;
                    }
                    return c0745e;
                }
            }
            return null;
        }
        for (C0745e c0745e2 : c0745eArr) {
            if ((!z || !c0745e2.f4733p) && (enumC0748h == null || c0745e2.f4735r.m2331a(enumC0748h))) {
                return c0745e2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m2391a(float f, float f2, float f3) {
        m2389a(f, f2, f3, 0.0f, 20.0f);
    }

    /* renamed from: a */
    public void m2389a(float f, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 7; i++) {
            C0745e m2370b = m2370b(f + C0758f.m2136c(-20.0f, 20.0f), f2 + C0758f.m2136c(-20.0f, 20.0f), f3);
            if (m2370b != null) {
                m2370b.f4765V = f4 + C0758f.m2136c(0.0f, f5);
                m2370b.f4780ak = C0758f.m2136c(0.3f, 0.6f);
            }
        }
    }

    /* renamed from: a */
    public float m2392a(float f, float f2) {
        return C0758f.m2136c(f, f2);
    }

    /* renamed from: b */
    public C0745e m2370b(float f, float f2, float f3) {
        m2394a();
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2365b != null) {
            m2365b.f4787ar = 1;
            m2365b.f4775af = true;
            m2365b.f4781al = 0.0f;
            m2365b.f4780ak = 0.5f;
            m2365b.f4777ah = 12;
            m2365b.f4786aq = 0;
            m2365b.f4766W = 35.0f;
            m2365b.f4767X = m2365b.f4766W - 10.0f;
            m2365b.f4736s = true;
            m2365b.f4749F = 0.7f;
            m2365b.f4769Z = m2392a(-180.0f, 180.0f);
            float m2392a = m2392a(0.8f, 1.0f);
            m2365b.f4751H = m2392a;
            m2365b.f4750G = m2392a;
        }
        return m2365b;
    }

    /* renamed from: c */
    public C0745e m2363c(float f, float f2, float f3) {
        m2394a();
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2365b != null) {
            m2365b.f4787ar = 13;
            m2365b.f4775af = true;
            m2365b.f4781al = 3.0f;
            m2365b.f4780ak = 0.5f;
            m2365b.f4777ah = 7;
            m2365b.f4786aq = 0;
            m2365b.f4766W = 35.0f;
            m2365b.f4767X = m2365b.f4766W - 10.0f;
            m2365b.f4736s = true;
            m2365b.f4749F = 1.0f;
            m2365b.f4751H = 0.5f;
            m2365b.f4750G = 0.5f;
        }
        return m2365b;
    }

    /* renamed from: a */
    public C0745e m2388a(float f, float f2, float f3, float f4, float f5, float f6) {
        Core m1087A = Core.m1087A();
        if (!m1087A.f6110bL.m5342a(f, f2, m1087A.f6099bs) && !m1087A.f6110bL.m5342a(f4, f5, m1087A.f6099bs)) {
            return null;
        }
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, true, EnumC0748h.f4834c);
        if (m2365b != null) {
            m2365b.f4784ao = false;
            m2365b.f4766W = 5.0f;
            m2365b.f4767X = m2365b.f4766W;
            m2365b.f4736s = true;
            m2365b.f4749F = 1.0f;
            m2365b.f4756M = true;
            m2365b.f4757N = f4;
            m2365b.f4758O = f5;
            m2365b.f4759P = f6;
        }
        return m2365b;
    }

    /* renamed from: a */
    public C0745e m2390a(float f, float f2, float f3, float f4) {
        return m2387a(f, f2, f3, f4, 0);
    }

    /* renamed from: a */
    public C0745e m2387a(float f, float f2, float f3, float f4, int i) {
        return m2386a(f, f2, f3, f4, i, 0);
    }

    /* renamed from: b */
    public C0745e m2367b(float f, float f2, float f3, float f4, int i) {
        return m2386a(f, f2, f3, f4, i, 1);
    }

    /* renamed from: a */
    public C0745e m2386a(float f, float f2, float f3, float f4, int i, int i2) {
        m2394a();
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2365b != null) {
            m2365b.f4724g = C0745e.f4727j;
            m2365b.f4775af = true;
            if (i2 == 1) {
                m2365b.f4787ar = 3;
                m2365b.f4781al = 1.0f;
                m2365b.f4780ak = 0.4f;
                m2365b.f4777ah = 4;
            } else {
                m2365b.f4787ar = 3;
                m2365b.f4781al = 0.0f;
                m2365b.f4780ak = 0.5f;
                m2365b.f4777ah = 3;
            }
            m2365b.f4769Z = f4;
            m2365b.f4786aq = 0;
            m2365b.f4766W = 20.0f;
            m2365b.f4767X = m2365b.f4766W;
            m2365b.f4736s = false;
            if (i != 0) {
                m2365b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: c */
    public C0745e m2362c(float f, float f2, float f3, float f4, int i) {
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4832a);
        if (m2365b != null) {
            m2365b.f4787ar = 4;
            m2365b.f4724g = C0745e.f4726i;
            m2365b.f4786aq = C0758f.m2203a(0, 2);
            m2365b.f4769Z = f4;
            m2365b.f4784ao = true;
            m2365b.f4760Q = C0758f.m2092i(f4) * 0.15f;
            m2365b.f4761R = C0758f.m2097h(f4) * 0.15f;
            m2365b.f4766W = 30.0f;
            m2365b.f4767X = m2365b.f4766W;
            m2365b.f4736s = true;
            m2365b.f4788as = (short) 1;
            m2365b.f4751H = 0.8f;
            m2365b.f4750G = 2.3f;
            if (i != 0) {
                m2365b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: a */
    public static void m2379a(C0745e c0745e, AbstractC1120w abstractC1120w) {
        if (c0745e == null) {
            return;
        }
        c0745e.f4719b = abstractC1120w;
        c0745e.f4753J -= abstractC1120w.f6958el;
        c0745e.f4754K -= abstractC1120w.f6959em;
        c0745e.f4755L -= abstractC1120w.f6960en;
    }

    /* renamed from: a */
    public C0745e m2377a(AbstractC1120w abstractC1120w, int i) {
        return m2376a(abstractC1120w, i, 0.5f);
    }

    /* renamed from: a */
    public C0745e m2376a(AbstractC1120w abstractC1120w, int i, float f) {
        m2372b();
        C0745e m2366b = m2366b(abstractC1120w.f6958el, abstractC1120w.f6959em, abstractC1120w.f6960en, i);
        if (m2366b != null) {
            m2366b.f4753J = 0.0f;
            m2366b.f4754K = 0.0f;
            m2366b.f4755L = 0.0f;
            m2366b.f4766W = 400.0f;
            m2366b.f4767X = m2366b.f4766W;
            m2366b.f4749F = 0.3f;
            m2366b.f4751H = f;
            m2366b.f4719b = abstractC1120w;
        }
        return m2366b;
    }

    /* renamed from: a */
    public C0745e m2385a(float f, float f2, float f3, int i) {
        if (this.f4702t == null && !this.f4704v) {
            m2394a();
        }
        return m2366b(f, f2, f3, i);
    }

    /* renamed from: b */
    public C0745e m2366b(float f, float f2, float f3, int i) {
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, true, EnumC0748h.f4833b);
        if (m2365b != null) {
            m2365b.f4722e = false;
            m2365b.f4724g = C0745e.f4725h;
            m2365b.f4787ar = 2;
            m2365b.f4766W = 10.0f;
            m2365b.f4767X = m2365b.f4766W;
            m2365b.f4736s = true;
            m2365b.f4749F = 0.5f;
            m2365b.f4788as = (short) 2;
            m2365b.f4721d = true;
            if (i != 0) {
                m2365b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: b */
    public C0745e m2369b(float f, float f2, float f3, float f4) {
        m2394a();
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
        if (m2365b != null) {
            m2365b.f4724g = C0745e.f4729l;
            m2365b.f4787ar = 0;
            m2365b.f4786aq = 13;
            m2365b.f4788as = (short) 1;
            m2365b.f4736s = true;
            m2365b.f4749F = 0.8f;
            m2365b.f4767X = 80.0f;
            m2365b.f4766W = m2365b.f4767X;
            m2365b.f4769Z = C0758f.m2136c(-180.0f, 180.0f);
            m2365b.f4751H = C0758f.m2136c(0.6f, 0.8f);
            m2365b.f4750G = 1.5f;
            m2365b.f4760Q = (C0758f.m2092i(f4) * 0.13f * C0758f.m2136c(1.0f, 1.5f)) + C0758f.m2136c(-0.01f, 0.01f);
            m2365b.f4761R = (C0758f.m2097h(f4) * 0.13f * C0758f.m2136c(1.0f, 1.5f)) + C0758f.m2136c(-0.01f, 0.01f);
        }
        return m2365b;
    }

    /* renamed from: a */
    public C0745e m2384a(float f, float f2, float f3, int i, float f4, float f5) {
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2365b != null) {
            m2365b.f4724g = C0745e.f4729l;
            m2365b.f4787ar = 6;
            m2365b.f4766W = 120.0f;
            m2365b.f4767X = m2365b.f4766W;
            m2365b.f4736s = true;
            m2365b.f4751H = 0.2f;
            m2365b.f4750G = 0.9f;
            m2365b.f4788as = (short) 1;
            m2365b.f4749F = 0.5f;
            m2365b.f4760Q = f4;
            m2365b.f4761R = f5;
            if (i != 0) {
                i = Color.m5948a(255, 0, 0, 200);
            }
            if (i != 0) {
                m2365b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: a */
    public void m2383a(float f, float f2, float f3, int i, float f4, float f5, float f6) {
        m2384a(f, f2, 0.0f, 0, 0.0f, 0.0f);
        for (int i2 = -180; i2 < 180; i2 += 45) {
            float f7 = f6 + i2;
            C0745e m2369b = m2369b(f + (C0758f.m2092i(f7) * (-5.0f)), f2 + (C0758f.m2097h(f7) * (-5.0f)), 0.0f, f7);
            if (m2369b != null) {
                m2369b.f4788as = (short) 2;
                m2369b.f4737t = true;
                m2369b.f4738u = 7.0f;
            }
        }
    }

    /* renamed from: c */
    public C0745e m2361c(float f, float f2, float f3, int i) {
        C0745e m2359d = m2359d(f, f2, f3, i);
        if (m2359d != null) {
            m2359d.f4787ar = 11;
        }
        return m2359d;
    }

    /* renamed from: d */
    public C0745e m2359d(float f, float f2, float f3, int i) {
        m2394a();
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2365b != null) {
            m2365b.f4787ar = 6;
            m2365b.f4766W = 30.0f;
            m2365b.f4767X = m2365b.f4766W;
            m2365b.f4736s = true;
            m2365b.f4751H = 0.2f;
            m2365b.f4750G = 1.3f;
            m2365b.f4788as = (short) 1;
            if (i != 0) {
                m2365b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2365b;
    }

    /* renamed from: d */
    public C0745e m2360d(float f, float f2, float f3) {
        C0745e m2368b = m2368b(f, f2, f3, 0.3f, 0.7f);
        if (m2368b != null) {
            m2368b.f4787ar = 14;
            m2368b.f4786aq = C0758f.m2203a(0, 5);
            m2368b.f4741x = 0.5f;
        }
        return m2368b;
    }

    /* renamed from: e */
    public C0745e m2358e(float f, float f2, float f3) {
        C0745e m2368b = m2368b(f, f2, f3, 1.0f, 1.0f);
        if (m2368b != null) {
        }
        return m2368b;
    }

    /* renamed from: b */
    public C0745e m2368b(float f, float f2, float f3, float f4, float f5) {
        m2372b();
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2365b != null) {
            m2365b.f4724g = C0745e.f4730m;
            m2365b.f4787ar = 12;
            m2365b.f4786aq = C0758f.m2203a(0, 7);
            m2365b.f4766W = C0758f.m2136c(400.0f, 800.0f);
            m2365b.f4767X = m2365b.f4766W - 150.0f;
            m2365b.f4736s = true;
            float m2136c = C0758f.m2136c(0.6f, 1.0f);
            m2365b.f4751H = m2136c;
            m2365b.f4750G = m2136c;
            m2365b.f4788as = (short) 2;
            m2365b.f4740w = true;
            m2365b.f4789at = true;
            float m2136c2 = C0758f.m2136c(-180.0f, 180.0f);
            float m2136c3 = C0758f.m2136c(0.4f, 1.2f) * f4;
            m2365b.f4760Q = C0758f.m2092i(m2136c2) * m2136c3;
            m2365b.f4761R = C0758f.m2097h(m2136c2) * m2136c3;
            m2365b.f4762S = C0758f.m2136c(0.6f, 2.7f) * f5;
            m2365b.f4769Z = C0758f.m2136c(-180.0f, 180.0f);
            m2365b.f4755L += 1.0f;
        }
        return m2365b;
    }

    /* renamed from: f */
    public C0745e m2357f(float f, float f2, float f3) {
        C0745e m2365b = m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
        if (m2365b != null) {
            m2365b.f4787ar = 8;
            m2365b.f4766W = 480.0f;
            m2365b.f4767X = m2365b.f4766W;
            m2365b.f4736s = false;
            m2365b.f4788as = (short) 1;
            m2365b.f4775af = true;
            m2365b.f4781al = 0.0f;
            m2365b.f4751H = 0.5f;
            m2365b.f4751H = 1.0f;
            int m2203a = C0758f.m2203a(0, 100);
            if (m2203a > 80) {
                m2365b.f4780ak = C0758f.m2136c(0.1f, 0.15f);
                m2365b.f4777ah = 15;
            } else if (m2203a > 60) {
                m2365b.f4780ak = C0758f.m2136c(0.06f, 0.16f);
                m2365b.f4778ai = true;
                m2365b.f4777ah = 6;
                m2365b.f4736s = true;
            } else {
                m2365b.f4780ak = C0758f.m2136c(0.06f, 0.16f);
                m2365b.f4778ai = true;
                m2365b.f4777ah = 3;
                m2365b.f4736s = true;
            }
        }
        return m2365b;
    }

    /* renamed from: b */
    public void m2364b(EnumC0748h enumC0748h) {
        this.f4702t = enumC0748h;
    }

    /* renamed from: a */
    public void m2394a() {
        this.f4703u = true;
    }

    /* renamed from: b */
    public void m2372b() {
        this.f4704v = true;
    }

    /* renamed from: a */
    public C0745e m2382a(float f, float f2, float f3, EnumC0744d enumC0744d, boolean z, EnumC0748h enumC0748h) {
        C0745e m2365b = m2365b(f, f2, f3, enumC0744d, z, enumC0748h);
        if (m2365b != null) {
            m2365b.f4734q = true;
        }
        return m2365b;
    }

    /* renamed from: b */
    public C0745e m2365b(float f, float f2, float f3, EnumC0744d enumC0744d, boolean z, EnumC0748h enumC0748h) {
        Core m1087A = Core.m1087A();
        if (this.f4702t != null) {
            enumC0748h = this.f4702t;
            this.f4702t = null;
        }
        boolean z2 = this.f4704v;
        this.f4704v = false;
        if (this.f4703u) {
            this.f4703u = false;
            if (!m1087A.f6252cO.m5855b(f, f2)) {
                return null;
            }
        }
        if (!z && m1087A.f6110bL != null && !m1087A.f6110bL.m5342a(f, f2, m1087A.f6099bs)) {
            return null;
        }
        if (m1087A.f6251cN.m5855b(f, f2)) {
            if (enumC0748h == EnumC0748h.f4832a) {
                enumC0748h = EnumC0748h.f4833b;
            } else if (enumC0748h == EnumC0748h.f4833b) {
                enumC0748h = EnumC0748h.f4834c;
            } else if (enumC0748h == EnumC0748h.f4834c) {
                enumC0748h = EnumC0748h.f4835d;
            }
        } else if (z2 || m1087A.f6252cO.m5855b(f, f2)) {
        }
        C0745e m2378a = m2378a(enumC0748h);
        if (m2378a == null) {
            return null;
        }
        m2378a.m2349c();
        m2378a.f4735r = enumC0748h;
        m2378a.f4787ar = 0;
        m2378a.f4784ao = true;
        m2378a.f4753J = f;
        m2378a.f4754K = f2;
        m2378a.f4755L = f3;
        m2378a.f4749F = 1.0f;
        if (enumC0744d == EnumC0744d.f4710d || enumC0744d == EnumC0744d.f4711e || enumC0744d == EnumC0744d.f4712f) {
            m2378a.f4786aq = 7;
            m2378a.f4766W = 12.0f;
            m2378a.f4736s = true;
            m2378a.f4761R = -0.3f;
            m2378a.f4749F = 0.7f;
            if (enumC0744d == EnumC0744d.f4712f) {
                m2378a.f4786aq = 3;
                m2378a.f4761R = -0.7f;
                m2378a.f4766W = 24.0f;
                m2378a.f4749F = 0.7f;
            }
            if (enumC0744d == EnumC0744d.f4711e) {
                m2378a.f4786aq = 4;
                m2378a.f4766W = 15.0f;
                m2378a.f4749F = 0.4f;
            }
        }
        if (enumC0744d == EnumC0744d.f4709c) {
            m2378a.f4786aq = 1;
            m2378a.f4766W = 25.0f;
            m2378a.f4736s = true;
        }
        if (enumC0744d == EnumC0744d.f4713g) {
            m2378a.f4786aq = 5;
            m2378a.f4766W = 42.0f;
            m2378a.f4736s = true;
            m2378a.f4761R = 0.1f;
            m2378a.f4749F = 2.0f;
        }
        if (enumC0744d == EnumC0744d.f4714h) {
            m2378a.f4786aq = 6;
            m2378a.f4766W = 39.0f;
            m2378a.f4736s = true;
            m2378a.f4761R = 0.1f;
            m2378a.f4749F = 2.0f;
        }
        if (enumC0744d == EnumC0744d.f4715i) {
            m2378a.f4786aq = 14;
            m2378a.f4766W = 39.0f;
            m2378a.f4736s = true;
            m2378a.f4761R = 0.1f;
            m2378a.f4749F = 0.7f;
        }
        m2378a.f4767X = m2378a.f4766W;
        return m2378a;
    }

    /* renamed from: a */
    public void m2380a(Context context) {
        int i;
        Core m1087A = Core.m1087A();
        this.f4705w.m5933a(130, 200, 0, 0);
        this.f4705w.mo5914a(true);
        this.f4705w.m5936a(2.0f);
        this.f4705w.m5928a(Paint.Cap.f201b);
        if (Core.f6207aW) {
            this.f4705w.m5936a(3.0f);
        }
        f4701s = new C0747g[20];
        C0747g c0747g = new C0747g();
        c0747g.f4820b = 25;
        c0747g.f4821c = 25;
        c0747g.f4822d = 1;
        c0747g.f4823e = 1;
        c0747g.f4824f = 26;
        c0747g.f4825g = 26;
        c0747g.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.effects, true);
        c0747g.f4819a = "effects";
        c0747g.m2333a();
        f4701s[0] = c0747g;
        C0747g c0747g2 = new C0747g();
        c0747g2.f4820b = 39;
        c0747g2.f4821c = 40;
        c0747g2.f4822d = 1;
        c0747g2.f4823e = 1;
        c0747g2.f4824f = 40;
        c0747g2.f4825g = 41;
        c0747g2.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.explode_big, true);
        c0747g2.f4819a = "explode_big";
        f4701s[1] = c0747g2;
        C0747g c0747g3 = new C0747g();
        c0747g3.f4829k = true;
        c0747g3.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.light_50, true);
        c0747g3.f4819a = "light_50";
        f4701s[2] = c0747g3;
        C0747g c0747g4 = new C0747g();
        c0747g4.f4820b = 20;
        c0747g4.f4821c = 25;
        c0747g4.f4822d = 0;
        c0747g4.f4823e = 0;
        c0747g4.f4824f = 20;
        c0747g4.f4825g = 25;
        c0747g4.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.flame, true);
        c0747g4.f4819a = "flame";
        f4701s[3] = c0747g4;
        C0747g c0747g5 = new C0747g();
        c0747g5.f4820b = 20;
        c0747g5.f4821c = 25;
        c0747g5.f4822d = 0;
        c0747g5.f4823e = 0;
        c0747g5.f4824f = c0747g5.f4820b;
        c0747g5.f4825g = c0747g5.f4821c;
        c0747g5.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.dust, true);
        c0747g5.f4819a = "dust";
        f4701s[4] = c0747g5;
        C0747g c0747g6 = new C0747g();
        c0747g6.f4820b = 50;
        c0747g6.f4821c = 40;
        c0747g6.f4822d = 0;
        c0747g6.f4823e = 0;
        c0747g6.f4824f = c0747g6.f4820b;
        c0747g6.f4825g = c0747g6.f4821c;
        c0747g6.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.smoke_black, true);
        c0747g6.f4819a = "smoke_black";
        c0747g6.m2333a();
        f4701s[5] = c0747g6;
        C0747g c0747g7 = new C0747g();
        c0747g7.f4820b = 50;
        c0747g7.f4821c = 50;
        c0747g7.f4822d = 0;
        c0747g7.f4823e = 0;
        c0747g7.f4824f = c0747g7.f4820b;
        c0747g7.f4825g = c0747g7.f4821c;
        c0747g7.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.shockwave, true);
        c0747g7.f4819a = "shockwave";
        f4701s[6] = c0747g7;
        C0747g c0747g8 = new C0747g();
        c0747g8.f4820b = 20;
        c0747g8.f4821c = 20;
        c0747g8.f4822d = 0;
        c0747g8.f4823e = 0;
        c0747g8.f4824f = c0747g8.f4820b;
        c0747g8.f4825g = c0747g8.f4821c;
        c0747g8.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.fire, true);
        c0747g8.f4819a = "fire";
        f4701s[7] = c0747g8;
        C0747g c0747g9 = new C0747g();
        c0747g9.f4820b = 20;
        c0747g9.f4821c = 30;
        c0747g9.f4824f = c0747g9.f4820b + 2;
        c0747g9.f4825g = c0747g9.f4821c;
        c0747g9.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.lava_bubble, true);
        c0747g9.f4819a = "lava_bubble";
        f4701s[8] = c0747g9;
        C0747g c0747g10 = new C0747g();
        c0747g10.f4820b = 28;
        c0747g10.f4821c = 28;
        c0747g10.f4822d = 0;
        c0747g10.f4823e = 0;
        c0747g10.f4824f = c0747g10.f4820b + 1;
        c0747g10.f4825g = c0747g10.f4821c + 1;
        c0747g10.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.effects2, true);
        c0747g10.f4819a = "effects2";
        f4701s[9] = c0747g10;
        C0747g c0747g11 = new C0747g();
        c0747g11.f4820b = 20;
        c0747g11.f4821c = 25;
        c0747g11.f4822d = 0;
        c0747g11.f4823e = 0;
        c0747g11.f4824f = 20;
        c0747g11.f4825g = 25;
        c0747g11.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.plasma_shot, true);
        c0747g11.f4819a = "plasma_shot";
        f4701s[10] = c0747g11;
        C0747g c0747g12 = new C0747g();
        c0747g12.f4820b = 104;
        c0747g12.f4821c = 104;
        c0747g12.f4822d = 0;
        c0747g12.f4823e = 0;
        c0747g12.f4824f = c0747g12.f4820b;
        c0747g12.f4825g = c0747g12.f4821c;
        c0747g12.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.shockwave_large, true);
        c0747g12.f4819a = "shockwave_large";
        f4701s[11] = c0747g12;
        C0747g c0747g13 = new C0747g();
        c0747g13.f4820b = 20;
        c0747g13.f4821c = 20;
        c0747g13.f4822d = 0;
        c0747g13.f4823e = 0;
        c0747g13.f4824f = c0747g13.f4820b;
        c0747g13.f4825g = c0747g13.f4821c;
        c0747g13.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.explode_bits, true);
        c0747g13.f4819a = "explode_bits";
        c0747g13.m2333a();
        f4701s[12] = c0747g13;
        C0747g c0747g14 = new C0747g();
        c0747g14.f4820b = 39;
        c0747g14.f4821c = 40;
        c0747g14.f4822d = 1;
        c0747g14.f4823e = 1;
        c0747g14.f4824f = 40;
        c0747g14.f4825g = 41;
        c0747g14.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.explode_big2, true);
        c0747g14.f4819a = "explode_big2";
        f4701s[13] = c0747g14;
        C0747g c0747g15 = new C0747g();
        c0747g15.f4820b = 20;
        c0747g15.f4821c = 20;
        c0747g15.f4822d = 0;
        c0747g15.f4823e = 0;
        c0747g15.f4824f = c0747g15.f4820b;
        c0747g15.f4825g = c0747g15.f4821c;
        c0747g15.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.explode_bits_bug, true);
        c0747g15.f4819a = "explode_bits_bug";
        c0747g15.m2333a();
        f4701s[14] = c0747g15;
        C0747g c0747g16 = new C0747g();
        c0747g16.f4820b = 20;
        c0747g16.f4821c = 20;
        c0747g16.f4822d = 0;
        c0747g16.f4823e = 0;
        c0747g16.f4824f = c0747g16.f4820b;
        c0747g16.f4825g = c0747g16.f4821c;
        c0747g16.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.projectiles, true);
        c0747g16.f4819a = "projectiles";
        c0747g16.m2333a();
        f4701s[15] = c0747g16;
        C0747g c0747g17 = new C0747g();
        c0747g17.f4820b = 20;
        c0747g17.f4821c = 20;
        c0747g17.f4822d = 0;
        c0747g17.f4823e = 0;
        c0747g17.f4824f = c0747g17.f4820b;
        c0747g17.f4825g = c0747g17.f4821c;
        c0747g17.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.projectiles2, true);
        c0747g17.f4819a = "projectiles2";
        c0747g17.m2333a();
        f4701s[16] = c0747g17;
        C0747g c0747g18 = new C0747g();
        c0747g18.f4820b = 30;
        c0747g18.f4821c = 30;
        c0747g18.f4822d = 0;
        c0747g18.f4823e = 0;
        c0747g18.f4824f = c0747g18.f4820b + 1;
        c0747g18.f4825g = c0747g18.f4821c + 1;
        c0747g18.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.effects3, true);
        c0747g18.f4819a = "effects3";
        f4701s[17] = c0747g18;
        C0747g c0747g19 = new C0747g();
        c0747g19.f4820b = 50;
        c0747g19.f4821c = 40;
        c0747g19.f4822d = 0;
        c0747g19.f4823e = 0;
        c0747g19.f4824f = c0747g19.f4820b;
        c0747g19.f4825g = c0747g19.f4821c;
        c0747g19.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.smoke_white, true);
        c0747g19.f4819a = "smoke_white";
        c0747g19.m2333a();
        f4701s[18] = c0747g19;
        C0747g c0747g20 = new C0747g();
        c0747g20.f4820b = 56;
        c0747g20.f4821c = 56;
        c0747g20.f4822d = 0;
        c0747g20.f4823e = 0;
        c0747g20.f4824f = c0747g20.f4820b;
        c0747g20.f4825g = c0747g20.f4821c;
        c0747g20.f4827i = m1087A.f6113bO.mo215a(C0067R.drawable.shockwave2, true);
        c0747g20.f4819a = "shockwave2";
        c0747g20.m2333a();
        f4701s[19] = c0747g20;
        if (Core.m1010au()) {
            i = 500;
            this.f4691i = 90;
            this.f4692j = 210;
        } else {
            i = 350;
            this.f4691i = 90;
            this.f4692j = 170;
        }
        f4688f = new C0745e[i];
        this.f4684b = i - 60;
        this.f4685c = i - 30;
        this.f4686d = i - 20;
        this.f4687e = i - 10;
        for (int i2 = 0; i2 < f4688f.length; i2++) {
            f4688f[i2] = new C0745e(this);
        }
    }

    /* renamed from: a */
    public int m2375a(String str) {
        for (int i = 0; i < f4701s.length; i++) {
            if (f4701s[i] != null) {
                if (f4701s[i].f4819a != null && f4701s[i].f4819a.equalsIgnoreCase(str)) {
                    return i;
                }
                if ((VariableScope.nullOrMissingString + i).equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void m2393a(float f) {
        Core m1087A = Core.m1087A();
        C0745e[] c0745eArr = f4688f;
        for (int i = 0; i < f4689g; i++) {
            C0745e c0745e = c0745eArr[i];
            if (c0745e.f4733p && !c0745e.f4734q) {
                c0745e.m2350b(f);
            }
        }
        if (f4690h) {
            while (f4689g > 0 && !c0745eArr[f4689g - 1].f4733p) {
                f4689g--;
            }
        }
        this.f4706x += f;
        if (this.f4706x > 10.0f) {
            this.f4706x = 0.0f;
            m1087A.f6110bL.m5344a(m1087A.f6142ct + C0758f.m2203a(0, (int) m1087A.f6148cz), m1087A.f6143cu + C0758f.m2203a(0, (int) m1087A.f6149cA));
            int i2 = m1087A.f6110bL.f801T;
            int i3 = m1087A.f6110bL.f802U;
            C0180g m5295d = m1087A.f6110bL.m5295d(i2, i3);
            if (m5295d != null && m5295d.f920g && !m5295d.f921h) {
                m1087A.f6110bL.m5340a(i2, i3);
                m2357f(m1087A.f6110bL.f801T + 10, (m1087A.f6110bL.f802U - 10) + 10, 0.0f);
            }
        }
    }

    /* renamed from: a */
    public int m2381a(float f, int i) {
        Core m1087A = Core.m1087A();
        int i2 = 0;
        C0745e[] c0745eArr = f4688f;
        if (i == 1) {
            for (int i3 = 0; i3 < f4689g; i3++) {
                C0745e c0745e = c0745eArr[i3];
                if (c0745e.f4733p) {
                    if (c0745e.f4734q) {
                        c0745e.m2350b(f);
                    }
                    if (!c0745e.f4732o && c0745e.f4789at && c0745e.m2352a(m1087A, true)) {
                        i2++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < f4689g; i4++) {
            C0745e c0745e2 = c0745eArr[i4];
            if (c0745e2.f4733p && !c0745e2.f4732o && c0745e2.f4788as == i && c0745e2.m2352a(m1087A, false)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public void m2371b(float f) {
        Core m1087A = Core.m1087A();
        C0745e[] c0745eArr = f4688f;
        for (int i = 0; i < f4689g; i++) {
            C0745e c0745e = c0745eArr[i];
            if (c0745e.f4733p && c0745e.f4732o) {
                c0745e.m2352a(m1087A, false);
            }
        }
    }

    /* renamed from: a */
    public void m2374a(boolean z) {
        if (z) {
            return;
        }
        for (int i = 0; i < f4688f.length; i++) {
            C0745e c0745e = f4688f[i];
            if (c0745e.f4733p) {
                c0745e.f4733p = false;
                this.f4683a--;
            }
        }
        if (this.f4683a != 0) {
            Core.m1046a("EffectEngine::removeAll: effectListActiveSize == " + this.f4683a);
        }
        f4689g = 0;
    }
}
