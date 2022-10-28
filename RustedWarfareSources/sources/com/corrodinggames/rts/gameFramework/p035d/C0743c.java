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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.gameFramework.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/c.class */
public final class C0743c {

    /* renamed from: h */
    public static boolean f4683h;

    /* renamed from: i */
    public int f4684i;

    /* renamed from: j */
    public int f4685j;

    /* renamed from: k */
    public static C0928ae f4686k;

    /* renamed from: l */
    public C0934e f4687l;

    /* renamed from: m */
    public C0934e f4688m;

    /* renamed from: s */
    public static C0747g[] f4689s;

    /* renamed from: f */
    public static C0745e[] f4690f = new C0745e[0];

    /* renamed from: g */
    public static int f4691g = 0;

    /* renamed from: n */
    public static final RectF f4692n = new RectF();

    /* renamed from: o */
    public static final Rect f4693o = new Rect();

    /* renamed from: p */
    public static final Rect f4694p = new Rect();

    /* renamed from: q */
    public static final Paint f4695q = new Paint();

    /* renamed from: r */
    public static final Paint f4696r = new Paint();

    /* renamed from: a */
    public int f4697a = 0;

    /* renamed from: b */
    public int f4698b = 80;

    /* renamed from: c */
    public int f4699c = 100;

    /* renamed from: d */
    public int f4700d = 110;

    /* renamed from: e */
    public int f4701e = 120;

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
    public C0745e m2328a(EnumC0748h enumC0748h) {
        int i = 0;
        int m996b = LoggerMaybe.m1079A().m996b();
        if (m996b < 13) {
            i = -this.f4685j;
        } else if (m996b < 28) {
            i = -this.f4684i;
        }
        int i2 = this.f4697a;
        if (enumC0748h == EnumC0748h.f4832a && i2 > this.f4698b + i) {
            return null;
        }
        if (enumC0748h == EnumC0748h.f4833b && i2 > this.f4699c + i) {
            return null;
        }
        if (enumC0748h == EnumC0748h.f4834c && i2 > this.f4700d + i) {
            return null;
        }
        if (enumC0748h == EnumC0748h.f4835d && i2 > this.f4701e + i) {
            return null;
        }
        C0745e m2323a = m2323a(true, (EnumC0748h) null);
        if (m2323a == null && (enumC0748h == EnumC0748h.f4836e || enumC0748h == EnumC0748h.f4835d)) {
            m2323a = m2323a(false, EnumC0748h.f4834c);
        }
        if (m2323a != null) {
            if (!m2323a.f4733p) {
                m2323a.f4733p = true;
                this.f4697a++;
            }
            return m2323a;
        }
        return null;
    }

    /* renamed from: a */
    private C0745e m2323a(boolean z, EnumC0748h enumC0748h) {
        C0745e[] c0745eArr = f4690f;
        int length = c0745eArr.length;
        if (z && enumC0748h == null) {
            for (int i = 0; i < length; i++) {
                C0745e c0745e = c0745eArr[i];
                if (!c0745e.f4733p) {
                    if (f4691g == i) {
                        f4691g++;
                    }
                    return c0745e;
                }
            }
            return null;
        }
        for (C0745e c0745e2 : c0745eArr) {
            if ((!z || !c0745e2.f4733p) && (enumC0748h == null || c0745e2.f4735r.m2282a(enumC0748h))) {
                return c0745e2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m2341a(float f, float f2, float f3) {
        m2339a(f, f2, f3, 0.0f, 20.0f);
    }

    /* renamed from: a */
    public void m2339a(float f, float f2, float f3, float f4, float f5) {
        for (int i = 0; i < 7; i++) {
            C0745e m2320b = m2320b(f + C0758f.m2087c(-20.0f, 20.0f), f2 + C0758f.m2087c(-20.0f, 20.0f), f3);
            if (m2320b != null) {
                m2320b.f4765V = f4 + C0758f.m2087c(0.0f, f5);
                m2320b.f4780ak = C0758f.m2087c(0.3f, 0.6f);
            }
        }
    }

    /* renamed from: a */
    public float m2342a(float f, float f2) {
        return C0758f.m2087c(f, f2);
    }

    /* renamed from: b */
    public C0745e m2320b(float f, float f2, float f3) {
        m2344a();
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2315b != null) {
            m2315b.f4787ar = 1;
            m2315b.f4775af = true;
            m2315b.f4781al = 0.0f;
            m2315b.f4780ak = 0.5f;
            m2315b.f4777ah = 12;
            m2315b.f4786aq = 0;
            m2315b.f4766W = 35.0f;
            m2315b.f4767X = m2315b.f4766W - 10.0f;
            m2315b.f4736s = true;
            m2315b.f4749F = 0.7f;
            m2315b.f4769Z = m2342a(-180.0f, 180.0f);
            float m2342a = m2342a(0.8f, 1.0f);
            m2315b.f4751H = m2342a;
            m2315b.f4750G = m2342a;
        }
        return m2315b;
    }

    /* renamed from: c */
    public C0745e m2313c(float f, float f2, float f3) {
        m2344a();
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2315b != null) {
            m2315b.f4787ar = 13;
            m2315b.f4775af = true;
            m2315b.f4781al = 3.0f;
            m2315b.f4780ak = 0.5f;
            m2315b.f4777ah = 7;
            m2315b.f4786aq = 0;
            m2315b.f4766W = 35.0f;
            m2315b.f4767X = m2315b.f4766W - 10.0f;
            m2315b.f4736s = true;
            m2315b.f4749F = 1.0f;
            m2315b.f4751H = 0.5f;
            m2315b.f4750G = 0.5f;
        }
        return m2315b;
    }

    /* renamed from: a */
    public C0745e m2338a(float f, float f2, float f3, float f4, float f5, float f6) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (!m1079A.f6110bL.m4959a(f, f2, m1079A.f6099bs) && !m1079A.f6110bL.m4959a(f4, f5, m1079A.f6099bs)) {
            return null;
        }
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, true, EnumC0748h.f4834c);
        if (m2315b != null) {
            m2315b.f4784ao = false;
            m2315b.f4766W = 5.0f;
            m2315b.f4767X = m2315b.f4766W;
            m2315b.f4736s = true;
            m2315b.f4749F = 1.0f;
            m2315b.f4756M = true;
            m2315b.f4757N = f4;
            m2315b.f4758O = f5;
            m2315b.f4759P = f6;
        }
        return m2315b;
    }

    /* renamed from: a */
    public C0745e m2340a(float f, float f2, float f3, float f4) {
        return m2337a(f, f2, f3, f4, 0);
    }

    /* renamed from: a */
    public C0745e m2337a(float f, float f2, float f3, float f4, int i) {
        return m2336a(f, f2, f3, f4, i, 0);
    }

    /* renamed from: b */
    public C0745e m2317b(float f, float f2, float f3, float f4, int i) {
        return m2336a(f, f2, f3, f4, i, 1);
    }

    /* renamed from: a */
    public C0745e m2336a(float f, float f2, float f3, float f4, int i, int i2) {
        m2344a();
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2315b != null) {
            m2315b.f4724g = C0745e.f4727j;
            m2315b.f4775af = true;
            if (i2 == 1) {
                m2315b.f4787ar = 3;
                m2315b.f4781al = 1.0f;
                m2315b.f4780ak = 0.4f;
                m2315b.f4777ah = 4;
            } else {
                m2315b.f4787ar = 3;
                m2315b.f4781al = 0.0f;
                m2315b.f4780ak = 0.5f;
                m2315b.f4777ah = 3;
            }
            m2315b.f4769Z = f4;
            m2315b.f4786aq = 0;
            m2315b.f4766W = 20.0f;
            m2315b.f4767X = m2315b.f4766W;
            m2315b.f4736s = false;
            if (i != 0) {
                m2315b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2315b;
    }

    /* renamed from: c */
    public C0745e m2312c(float f, float f2, float f3, float f4, int i) {
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4832a);
        if (m2315b != null) {
            m2315b.f4787ar = 4;
            m2315b.f4724g = C0745e.f4726i;
            m2315b.f4786aq = C0758f.m2154a(0, 2);
            m2315b.f4769Z = f4;
            m2315b.f4784ao = true;
            m2315b.f4760Q = C0758f.m2043i(f4) * 0.15f;
            m2315b.f4761R = C0758f.m2048h(f4) * 0.15f;
            m2315b.f4766W = 30.0f;
            m2315b.f4767X = m2315b.f4766W;
            m2315b.f4736s = true;
            m2315b.f4788as = (short) 1;
            m2315b.f4751H = 0.8f;
            m2315b.f4750G = 2.3f;
            if (i != 0) {
                m2315b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2315b;
    }

    /* renamed from: a */
    public static void m2329a(C0745e c0745e, AbstractC1120w abstractC1120w) {
        if (c0745e == null) {
            return;
        }
        c0745e.f4719b = abstractC1120w;
        c0745e.f4753J -= abstractC1120w.f6957el;
        c0745e.f4754K -= abstractC1120w.f6958em;
        c0745e.f4755L -= abstractC1120w.f6959en;
    }

    /* renamed from: a */
    public C0745e m2327a(AbstractC1120w abstractC1120w, int i) {
        return m2326a(abstractC1120w, i, 0.5f);
    }

    /* renamed from: a */
    public C0745e m2326a(AbstractC1120w abstractC1120w, int i, float f) {
        m2322b();
        C0745e m2316b = m2316b(abstractC1120w.f6957el, abstractC1120w.f6958em, abstractC1120w.f6959en, i);
        if (m2316b != null) {
            m2316b.f4753J = 0.0f;
            m2316b.f4754K = 0.0f;
            m2316b.f4755L = 0.0f;
            m2316b.f4766W = 400.0f;
            m2316b.f4767X = m2316b.f4766W;
            m2316b.f4749F = 0.3f;
            m2316b.f4751H = f;
            m2316b.f4719b = abstractC1120w;
        }
        return m2316b;
    }

    /* renamed from: a */
    public C0745e m2335a(float f, float f2, float f3, int i) {
        if (this.f4702t == null && !this.f4704v) {
            m2344a();
        }
        return m2316b(f, f2, f3, i);
    }

    /* renamed from: b */
    public C0745e m2316b(float f, float f2, float f3, int i) {
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, true, EnumC0748h.f4833b);
        if (m2315b != null) {
            m2315b.f4722e = false;
            m2315b.f4724g = C0745e.f4725h;
            m2315b.f4787ar = 2;
            m2315b.f4766W = 10.0f;
            m2315b.f4767X = m2315b.f4766W;
            m2315b.f4736s = true;
            m2315b.f4749F = 0.5f;
            m2315b.f4788as = (short) 2;
            m2315b.f4721d = true;
            if (i != 0) {
                m2315b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2315b;
    }

    /* renamed from: b */
    public C0745e m2319b(float f, float f2, float f3, float f4) {
        m2344a();
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
        if (m2315b != null) {
            m2315b.f4724g = C0745e.f4729l;
            m2315b.f4787ar = 0;
            m2315b.f4786aq = 13;
            m2315b.f4788as = (short) 1;
            m2315b.f4736s = true;
            m2315b.f4749F = 0.8f;
            m2315b.f4767X = 80.0f;
            m2315b.f4766W = m2315b.f4767X;
            m2315b.f4769Z = C0758f.m2087c(-180.0f, 180.0f);
            m2315b.f4751H = C0758f.m2087c(0.6f, 0.8f);
            m2315b.f4750G = 1.5f;
            m2315b.f4760Q = (C0758f.m2043i(f4) * 0.13f * C0758f.m2087c(1.0f, 1.5f)) + C0758f.m2087c(-0.01f, 0.01f);
            m2315b.f4761R = (C0758f.m2048h(f4) * 0.13f * C0758f.m2087c(1.0f, 1.5f)) + C0758f.m2087c(-0.01f, 0.01f);
        }
        return m2315b;
    }

    /* renamed from: a */
    public C0745e m2334a(float f, float f2, float f3, int i, float f4, float f5) {
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2315b != null) {
            m2315b.f4724g = C0745e.f4729l;
            m2315b.f4787ar = 6;
            m2315b.f4766W = 120.0f;
            m2315b.f4767X = m2315b.f4766W;
            m2315b.f4736s = true;
            m2315b.f4751H = 0.2f;
            m2315b.f4750G = 0.9f;
            m2315b.f4788as = (short) 1;
            m2315b.f4749F = 0.5f;
            m2315b.f4760Q = f4;
            m2315b.f4761R = f5;
            if (i != 0) {
                i = Color.m5538a(255, 0, 0, 200);
            }
            if (i != 0) {
                m2315b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2315b;
    }

    /* renamed from: a */
    public void m2333a(float f, float f2, float f3, int i, float f4, float f5, float f6) {
        m2334a(f, f2, 0.0f, 0, 0.0f, 0.0f);
        for (int i2 = -180; i2 < 180; i2 += 45) {
            float f7 = f6 + i2;
            C0745e m2319b = m2319b(f + (C0758f.m2043i(f7) * (-5.0f)), f2 + (C0758f.m2048h(f7) * (-5.0f)), 0.0f, f7);
            if (m2319b != null) {
                m2319b.f4788as = (short) 2;
                m2319b.f4737t = true;
                m2319b.f4738u = 7.0f;
            }
        }
    }

    /* renamed from: c */
    public C0745e m2311c(float f, float f2, float f3, int i) {
        C0745e m2309d = m2309d(f, f2, f3, i);
        if (m2309d != null) {
            m2309d.f4787ar = 11;
        }
        return m2309d;
    }

    /* renamed from: d */
    public C0745e m2309d(float f, float f2, float f3, int i) {
        m2344a();
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2315b != null) {
            m2315b.f4787ar = 6;
            m2315b.f4766W = 30.0f;
            m2315b.f4767X = m2315b.f4766W;
            m2315b.f4736s = true;
            m2315b.f4751H = 0.2f;
            m2315b.f4750G = 1.3f;
            m2315b.f4788as = (short) 1;
            if (i != 0) {
                m2315b.f4746C = new LightingColorFilter(i, 0);
            }
        }
        return m2315b;
    }

    /* renamed from: d */
    public C0745e m2310d(float f, float f2, float f3) {
        C0745e m2318b = m2318b(f, f2, f3, 0.3f, 0.7f);
        if (m2318b != null) {
            m2318b.f4787ar = 14;
            m2318b.f4786aq = C0758f.m2154a(0, 5);
            m2318b.f4741x = 0.5f;
        }
        return m2318b;
    }

    /* renamed from: e */
    public C0745e m2308e(float f, float f2, float f3) {
        C0745e m2318b = m2318b(f, f2, f3, 1.0f, 1.0f);
        if (m2318b != null) {
        }
        return m2318b;
    }

    /* renamed from: b */
    public C0745e m2318b(float f, float f2, float f3, float f4, float f5) {
        m2322b();
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
        if (m2315b != null) {
            m2315b.f4724g = C0745e.f4730m;
            m2315b.f4787ar = 12;
            m2315b.f4786aq = C0758f.m2154a(0, 7);
            m2315b.f4766W = C0758f.m2087c(400.0f, 800.0f);
            m2315b.f4767X = m2315b.f4766W - 150.0f;
            m2315b.f4736s = true;
            float m2087c = C0758f.m2087c(0.6f, 1.0f);
            m2315b.f4751H = m2087c;
            m2315b.f4750G = m2087c;
            m2315b.f4788as = (short) 2;
            m2315b.f4740w = true;
            m2315b.f4789at = true;
            float m2087c2 = C0758f.m2087c(-180.0f, 180.0f);
            float m2087c3 = C0758f.m2087c(0.4f, 1.2f) * f4;
            m2315b.f4760Q = C0758f.m2043i(m2087c2) * m2087c3;
            m2315b.f4761R = C0758f.m2048h(m2087c2) * m2087c3;
            m2315b.f4762S = C0758f.m2087c(0.6f, 2.7f) * f5;
            m2315b.f4769Z = C0758f.m2087c(-180.0f, 180.0f);
            m2315b.f4755L += 1.0f;
        }
        return m2315b;
    }

    /* renamed from: f */
    public C0745e m2307f(float f, float f2, float f3) {
        C0745e m2315b = m2315b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
        if (m2315b != null) {
            m2315b.f4787ar = 8;
            m2315b.f4766W = 480.0f;
            m2315b.f4767X = m2315b.f4766W;
            m2315b.f4736s = false;
            m2315b.f4788as = (short) 1;
            m2315b.f4775af = true;
            m2315b.f4781al = 0.0f;
            m2315b.f4751H = 0.5f;
            m2315b.f4751H = 1.0f;
            int m2154a = C0758f.m2154a(0, 100);
            if (m2154a > 80) {
                m2315b.f4780ak = C0758f.m2087c(0.1f, 0.15f);
                m2315b.f4777ah = 15;
            } else if (m2154a > 60) {
                m2315b.f4780ak = C0758f.m2087c(0.06f, 0.16f);
                m2315b.f4778ai = true;
                m2315b.f4777ah = 6;
                m2315b.f4736s = true;
            } else {
                m2315b.f4780ak = C0758f.m2087c(0.06f, 0.16f);
                m2315b.f4778ai = true;
                m2315b.f4777ah = 3;
                m2315b.f4736s = true;
            }
        }
        return m2315b;
    }

    /* renamed from: b */
    public void m2314b(EnumC0748h enumC0748h) {
        this.f4702t = enumC0748h;
    }

    /* renamed from: a */
    public void m2344a() {
        this.f4703u = true;
    }

    /* renamed from: b */
    public void m2322b() {
        this.f4704v = true;
    }

    /* renamed from: a */
    public C0745e m2332a(float f, float f2, float f3, EnumC0744d enumC0744d, boolean z, EnumC0748h enumC0748h) {
        C0745e m2315b = m2315b(f, f2, f3, enumC0744d, z, enumC0748h);
        if (m2315b != null) {
            m2315b.f4734q = true;
        }
        return m2315b;
    }

    /* renamed from: b */
    public C0745e m2315b(float f, float f2, float f3, EnumC0744d enumC0744d, boolean z, EnumC0748h enumC0748h) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (this.f4702t != null) {
            enumC0748h = this.f4702t;
            this.f4702t = null;
        }
        boolean z2 = this.f4704v;
        this.f4704v = false;
        if (this.f4703u) {
            this.f4703u = false;
            if (!m1079A.f6252cO.m5448b(f, f2)) {
                return null;
            }
        }
        if (!z && m1079A.f6110bL != null && !m1079A.f6110bL.m4959a(f, f2, m1079A.f6099bs)) {
            return null;
        }
        if (m1079A.f6251cN.m5448b(f, f2)) {
            if (enumC0748h == EnumC0748h.f4832a) {
                enumC0748h = EnumC0748h.f4833b;
            } else if (enumC0748h == EnumC0748h.f4833b) {
                enumC0748h = EnumC0748h.f4834c;
            } else if (enumC0748h == EnumC0748h.f4834c) {
                enumC0748h = EnumC0748h.f4835d;
            }
        } else if (z2 || m1079A.f6252cO.m5448b(f, f2)) {
        }
        C0745e m2328a = m2328a(enumC0748h);
        if (m2328a == null) {
            return null;
        }
        m2328a.m2299c();
        m2328a.f4735r = enumC0748h;
        m2328a.f4787ar = 0;
        m2328a.f4784ao = true;
        m2328a.f4753J = f;
        m2328a.f4754K = f2;
        m2328a.f4755L = f3;
        m2328a.f4749F = 1.0f;
        if (enumC0744d == EnumC0744d.f4710d || enumC0744d == EnumC0744d.f4711e || enumC0744d == EnumC0744d.f4712f) {
            m2328a.f4786aq = 7;
            m2328a.f4766W = 12.0f;
            m2328a.f4736s = true;
            m2328a.f4761R = -0.3f;
            m2328a.f4749F = 0.7f;
            if (enumC0744d == EnumC0744d.f4712f) {
                m2328a.f4786aq = 3;
                m2328a.f4761R = -0.7f;
                m2328a.f4766W = 24.0f;
                m2328a.f4749F = 0.7f;
            }
            if (enumC0744d == EnumC0744d.f4711e) {
                m2328a.f4786aq = 4;
                m2328a.f4766W = 15.0f;
                m2328a.f4749F = 0.4f;
            }
        }
        if (enumC0744d == EnumC0744d.f4709c) {
            m2328a.f4786aq = 1;
            m2328a.f4766W = 25.0f;
            m2328a.f4736s = true;
        }
        if (enumC0744d == EnumC0744d.f4713g) {
            m2328a.f4786aq = 5;
            m2328a.f4766W = 42.0f;
            m2328a.f4736s = true;
            m2328a.f4761R = 0.1f;
            m2328a.f4749F = 2.0f;
        }
        if (enumC0744d == EnumC0744d.f4714h) {
            m2328a.f4786aq = 6;
            m2328a.f4766W = 39.0f;
            m2328a.f4736s = true;
            m2328a.f4761R = 0.1f;
            m2328a.f4749F = 2.0f;
        }
        if (enumC0744d == EnumC0744d.f4715i) {
            m2328a.f4786aq = 14;
            m2328a.f4766W = 39.0f;
            m2328a.f4736s = true;
            m2328a.f4761R = 0.1f;
            m2328a.f4749F = 0.7f;
        }
        m2328a.f4767X = m2328a.f4766W;
        return m2328a;
    }

    /* renamed from: a */
    public void m2330a(Context context) {
        int i;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        this.f4705w.m5523a(130, 200, 0, 0);
        this.f4705w.mo900a(true);
        this.f4705w.m5526a(2.0f);
        this.f4705w.m5518a(Paint.Cap.f201b);
        if (LoggerMaybe.f6207aW) {
            this.f4705w.m5526a(3.0f);
        }
        f4689s = new C0747g[20];
        C0747g c0747g = new C0747g();
        c0747g.f4820b = 25;
        c0747g.f4821c = 25;
        c0747g.f4822d = 1;
        c0747g.f4823e = 1;
        c0747g.f4824f = 26;
        c0747g.f4825g = 26;
        c0747g.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.effects, true);
        c0747g.f4819a = "effects";
        c0747g.m2284a();
        f4689s[0] = c0747g;
        C0747g c0747g2 = new C0747g();
        c0747g2.f4820b = 39;
        c0747g2.f4821c = 40;
        c0747g2.f4822d = 1;
        c0747g2.f4823e = 1;
        c0747g2.f4824f = 40;
        c0747g2.f4825g = 41;
        c0747g2.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.explode_big, true);
        c0747g2.f4819a = "explode_big";
        f4689s[1] = c0747g2;
        C0747g c0747g3 = new C0747g();
        c0747g3.f4829k = true;
        c0747g3.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.light_50, true);
        c0747g3.f4819a = "light_50";
        f4689s[2] = c0747g3;
        C0747g c0747g4 = new C0747g();
        c0747g4.f4820b = 20;
        c0747g4.f4821c = 25;
        c0747g4.f4822d = 0;
        c0747g4.f4823e = 0;
        c0747g4.f4824f = 20;
        c0747g4.f4825g = 25;
        c0747g4.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.flame, true);
        c0747g4.f4819a = "flame";
        f4689s[3] = c0747g4;
        C0747g c0747g5 = new C0747g();
        c0747g5.f4820b = 20;
        c0747g5.f4821c = 25;
        c0747g5.f4822d = 0;
        c0747g5.f4823e = 0;
        c0747g5.f4824f = c0747g5.f4820b;
        c0747g5.f4825g = c0747g5.f4821c;
        c0747g5.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.dust, true);
        c0747g5.f4819a = "dust";
        f4689s[4] = c0747g5;
        C0747g c0747g6 = new C0747g();
        c0747g6.f4820b = 50;
        c0747g6.f4821c = 40;
        c0747g6.f4822d = 0;
        c0747g6.f4823e = 0;
        c0747g6.f4824f = c0747g6.f4820b;
        c0747g6.f4825g = c0747g6.f4821c;
        c0747g6.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.smoke_black, true);
        c0747g6.f4819a = "smoke_black";
        c0747g6.m2284a();
        f4689s[5] = c0747g6;
        C0747g c0747g7 = new C0747g();
        c0747g7.f4820b = 50;
        c0747g7.f4821c = 50;
        c0747g7.f4822d = 0;
        c0747g7.f4823e = 0;
        c0747g7.f4824f = c0747g7.f4820b;
        c0747g7.f4825g = c0747g7.f4821c;
        c0747g7.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.shockwave, true);
        c0747g7.f4819a = "shockwave";
        f4689s[6] = c0747g7;
        C0747g c0747g8 = new C0747g();
        c0747g8.f4820b = 20;
        c0747g8.f4821c = 20;
        c0747g8.f4822d = 0;
        c0747g8.f4823e = 0;
        c0747g8.f4824f = c0747g8.f4820b;
        c0747g8.f4825g = c0747g8.f4821c;
        c0747g8.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.fire, true);
        c0747g8.f4819a = "fire";
        f4689s[7] = c0747g8;
        C0747g c0747g9 = new C0747g();
        c0747g9.f4820b = 20;
        c0747g9.f4821c = 30;
        c0747g9.f4824f = c0747g9.f4820b + 2;
        c0747g9.f4825g = c0747g9.f4821c;
        c0747g9.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.lava_bubble, true);
        c0747g9.f4819a = "lava_bubble";
        f4689s[8] = c0747g9;
        C0747g c0747g10 = new C0747g();
        c0747g10.f4820b = 28;
        c0747g10.f4821c = 28;
        c0747g10.f4822d = 0;
        c0747g10.f4823e = 0;
        c0747g10.f4824f = c0747g10.f4820b + 1;
        c0747g10.f4825g = c0747g10.f4821c + 1;
        c0747g10.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.effects2, true);
        c0747g10.f4819a = "effects2";
        f4689s[9] = c0747g10;
        C0747g c0747g11 = new C0747g();
        c0747g11.f4820b = 20;
        c0747g11.f4821c = 25;
        c0747g11.f4822d = 0;
        c0747g11.f4823e = 0;
        c0747g11.f4824f = 20;
        c0747g11.f4825g = 25;
        c0747g11.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.plasma_shot, true);
        c0747g11.f4819a = "plasma_shot";
        f4689s[10] = c0747g11;
        C0747g c0747g12 = new C0747g();
        c0747g12.f4820b = 104;
        c0747g12.f4821c = 104;
        c0747g12.f4822d = 0;
        c0747g12.f4823e = 0;
        c0747g12.f4824f = c0747g12.f4820b;
        c0747g12.f4825g = c0747g12.f4821c;
        c0747g12.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.shockwave_large, true);
        c0747g12.f4819a = "shockwave_large";
        f4689s[11] = c0747g12;
        C0747g c0747g13 = new C0747g();
        c0747g13.f4820b = 20;
        c0747g13.f4821c = 20;
        c0747g13.f4822d = 0;
        c0747g13.f4823e = 0;
        c0747g13.f4824f = c0747g13.f4820b;
        c0747g13.f4825g = c0747g13.f4821c;
        c0747g13.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.explode_bits, true);
        c0747g13.f4819a = "explode_bits";
        c0747g13.m2284a();
        f4689s[12] = c0747g13;
        C0747g c0747g14 = new C0747g();
        c0747g14.f4820b = 39;
        c0747g14.f4821c = 40;
        c0747g14.f4822d = 1;
        c0747g14.f4823e = 1;
        c0747g14.f4824f = 40;
        c0747g14.f4825g = 41;
        c0747g14.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.explode_big2, true);
        c0747g14.f4819a = "explode_big2";
        f4689s[13] = c0747g14;
        C0747g c0747g15 = new C0747g();
        c0747g15.f4820b = 20;
        c0747g15.f4821c = 20;
        c0747g15.f4822d = 0;
        c0747g15.f4823e = 0;
        c0747g15.f4824f = c0747g15.f4820b;
        c0747g15.f4825g = c0747g15.f4821c;
        c0747g15.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.explode_bits_bug, true);
        c0747g15.f4819a = "explode_bits_bug";
        c0747g15.m2284a();
        f4689s[14] = c0747g15;
        C0747g c0747g16 = new C0747g();
        c0747g16.f4820b = 20;
        c0747g16.f4821c = 20;
        c0747g16.f4822d = 0;
        c0747g16.f4823e = 0;
        c0747g16.f4824f = c0747g16.f4820b;
        c0747g16.f4825g = c0747g16.f4821c;
        c0747g16.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.projectiles, true);
        c0747g16.f4819a = "projectiles";
        c0747g16.m2284a();
        f4689s[15] = c0747g16;
        C0747g c0747g17 = new C0747g();
        c0747g17.f4820b = 20;
        c0747g17.f4821c = 20;
        c0747g17.f4822d = 0;
        c0747g17.f4823e = 0;
        c0747g17.f4824f = c0747g17.f4820b;
        c0747g17.f4825g = c0747g17.f4821c;
        c0747g17.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.projectiles2, true);
        c0747g17.f4819a = "projectiles2";
        c0747g17.m2284a();
        f4689s[16] = c0747g17;
        C0747g c0747g18 = new C0747g();
        c0747g18.f4820b = 30;
        c0747g18.f4821c = 30;
        c0747g18.f4822d = 0;
        c0747g18.f4823e = 0;
        c0747g18.f4824f = c0747g18.f4820b + 1;
        c0747g18.f4825g = c0747g18.f4821c + 1;
        c0747g18.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.effects3, true);
        c0747g18.f4819a = "effects3";
        f4689s[17] = c0747g18;
        C0747g c0747g19 = new C0747g();
        c0747g19.f4820b = 50;
        c0747g19.f4821c = 40;
        c0747g19.f4822d = 0;
        c0747g19.f4823e = 0;
        c0747g19.f4824f = c0747g19.f4820b;
        c0747g19.f4825g = c0747g19.f4821c;
        c0747g19.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.smoke_white, true);
        c0747g19.f4819a = "smoke_white";
        c0747g19.m2284a();
        f4689s[18] = c0747g19;
        C0747g c0747g20 = new C0747g();
        c0747g20.f4820b = 56;
        c0747g20.f4821c = 56;
        c0747g20.f4822d = 0;
        c0747g20.f4823e = 0;
        c0747g20.f4824f = c0747g20.f4820b;
        c0747g20.f4825g = c0747g20.f4821c;
        c0747g20.f4827i = m1079A.f6113bO.mo219a(C0067R.drawable.shockwave2, true);
        c0747g20.f4819a = "shockwave2";
        c0747g20.m2284a();
        f4689s[19] = c0747g20;
        if (LoggerMaybe.m1002au()) {
            i = 500;
            this.f4684i = 90;
            this.f4685j = 210;
        } else {
            i = 350;
            this.f4684i = 90;
            this.f4685j = 170;
        }
        f4690f = new C0745e[i];
        this.f4698b = i - 60;
        this.f4699c = i - 30;
        this.f4700d = i - 20;
        this.f4701e = i - 10;
        for (int i2 = 0; i2 < f4690f.length; i2++) {
            f4690f[i2] = new C0745e(this);
        }
    }

    /* renamed from: a */
    public int m2325a(String str) {
        for (int i = 0; i < f4689s.length; i++) {
            if (f4689s[i] != null) {
                if (f4689s[i].f4819a != null && f4689s[i].f4819a.equalsIgnoreCase(str)) {
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
    public void m2343a(float f) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0745e[] c0745eArr = f4690f;
        for (int i = 0; i < f4691g; i++) {
            C0745e c0745e = c0745eArr[i];
            if (c0745e.f4733p && !c0745e.f4734q) {
                c0745e.m2300b(f);
            }
        }
        if (f4683h) {
            while (f4691g > 0 && !c0745eArr[f4691g - 1].f4733p) {
                f4691g--;
            }
        }
        this.f4706x += f;
        if (this.f4706x > 10.0f) {
            this.f4706x = 0.0f;
            m1079A.f6110bL.m4961a(m1079A.f6142ct + C0758f.m2154a(0, (int) m1079A.f6148cz), m1079A.f6143cu + C0758f.m2154a(0, (int) m1079A.f6149cA));
            int i2 = m1079A.f6110bL.f801T;
            int i3 = m1079A.f6110bL.f802U;
            C0180g m4912d = m1079A.f6110bL.m4912d(i2, i3);
            if (m4912d != null && m4912d.f920g && !m4912d.f921h) {
                m1079A.f6110bL.m4957a(i2, i3);
                m2307f(m1079A.f6110bL.f801T + 10, (m1079A.f6110bL.f802U - 10) + 10, 0.0f);
            }
        }
    }

    /* renamed from: a */
    public int m2331a(float f, int i) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int i2 = 0;
        C0745e[] c0745eArr = f4690f;
        if (i == 1) {
            for (int i3 = 0; i3 < f4691g; i3++) {
                C0745e c0745e = c0745eArr[i3];
                if (c0745e.f4733p) {
                    if (c0745e.f4734q) {
                        c0745e.m2300b(f);
                    }
                    if (!c0745e.f4732o && c0745e.f4789at && c0745e.m2302a(m1079A, true)) {
                        i2++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < f4691g; i4++) {
            C0745e c0745e2 = c0745eArr[i4];
            if (c0745e2.f4733p && !c0745e2.f4732o && c0745e2.f4788as == i && c0745e2.m2302a(m1079A, false)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public void m2321b(float f) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0745e[] c0745eArr = f4690f;
        for (int i = 0; i < f4691g; i++) {
            C0745e c0745e = c0745eArr[i];
            if (c0745e.f4733p && c0745e.f4732o) {
                c0745e.m2302a(m1079A, false);
            }
        }
    }

    /* renamed from: a */
    public void m2324a(boolean z) {
        if (z) {
            return;
        }
        for (int i = 0; i < f4690f.length; i++) {
            C0745e c0745e = f4690f[i];
            if (c0745e.f4733p) {
                c0745e.f4733p = false;
                this.f4697a--;
            }
        }
        if (this.f4697a != 0) {
            LoggerMaybe.m1038a("EffectEngine::removeAll: effectListActiveSize == " + this.f4697a);
        }
        f4691g = 0;
    }
}
