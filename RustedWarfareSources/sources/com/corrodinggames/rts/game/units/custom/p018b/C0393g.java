package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.C0384ay;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/g.class */
public class C0393g extends AbstractC0387a {

    /* renamed from: a */
    public static final AbstractC0387a f2410a = new C0393g();

    /* renamed from: b */
    static final Rect f2411b = new Rect();

    /* renamed from: c */
    static final RectF f2412c = new RectF();

    /* renamed from: d */
    static final Paint f2413d = new Paint();

    /* renamed from: b */
    public void mo4198b(C0451j c0451j, float f) {
        C0745e m2362c;
        C0453l c0453l = c0451j.f2863x;
        C0394h[] c0394hArr = c0451j.f2885dR;
        if (c0394hArr == null) {
            return;
        }
        if (f != 0.0f && c0451j.f2845f > 0.3d) {
            return;
        }
        C0399m dl = c0451j.m4668dl();
        if (dl != null && dl.f2475t) {
            return;
        }
        if (c0451j.f1651cL != null && dl == null) {
            for (C0394h c0394h : c0394hArr) {
                c0394h.f2429m = true;
            }
            return;
        }
        Core m1087A = Core.m1087A();
        float f2 = c0451j.f1618ce;
        if (c0453l.f3075dC) {
            f2 = c0451j.f1649cJ[c0453l.f3076dD.f2547e].f1712a;
        }
        float f3 = c0451j.f6958el - c0451j.f2881dN;
        float f4 = c0451j.f6959em - c0451j.f2882dO;
        float f5 = c0451j.f6960en - c0451j.f2883dP;
        float f6 = f2 - c0451j.f2884dQ;
        boolean z = (f3 == 0.0f && f4 == 0.0f && f6 == 0.0f) ? false : true;
        c0451j.f2881dN = c0451j.f6958el;
        c0451j.f2882dO = c0451j.f6959em;
        c0451j.f2883dP = c0451j.f6960en;
        c0451j.f2884dQ = f2;
        PointF n = c0451j.m2807n(15.0f);
        float f7 = n.f227a;
        float f8 = n.f228b;
        if (f7 != 0.0f || f8 != 0.0f) {
            float m2209a = C0758f.m2209a(0.0f, 0.0f, f7, f8);
            float m2123d = C0758f.m2123d(0.0f, 0.0f, f7, f8);
            float f9 = m2209a * 240.0f;
            if (f9 > 15.0f) {
                f9 = 15.0f;
            }
            f7 = C0758f.m2092i(m2123d) * f9;
            f8 = C0758f.m2097h(m2123d) * f9;
        }
        int i = 0;
        float f10 = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < c0394hArr.length; i3++) {
            C0394h c0394h2 = c0394hArr[i3];
            C0384ay c0384ay = c0453l.f3223aw[i3];
            boolean z2 = false;
            boolean z3 = false;
            if (c0394h2.f2429m) {
                z2 = true;
                c0394h2.f2429m = false;
                c0394h2.f2431o = true;
                if (c0394h2.f2430n) {
                    z3 = true;
                }
                c0394h2.f2430n = false;
            }
            if (!c0384ay.f2297h) {
                c0394h2.f2427d -= f5;
            }
            if (!c0384ay.f2280l) {
                if (z) {
                    c0394h2.f2415b -= f3;
                    c0394h2.f2416c -= f4;
                    c0394h2.f2431o = true;
                }
            } else if (z && f6 != 0.0f) {
                C0758f.f4890c.m5879a(c0394h2.f2415b, c0394h2.f2416c);
                C0758f.m2208a(0.0f, 0.0f, f6, C0758f.f4890c);
                c0394h2.f2415b = C0758f.f4890c.f227a;
                c0394h2.f2416c = C0758f.f4890c.f228b;
                c0394h2.f2421i += f6;
                c0394h2.f2431o = true;
            }
            if (!c0384ay.f2281p) {
                if (c0384ay.f2294T != 0.0f) {
                    c0394h2.f2426r += c0384ay.f2294T * f;
                    c0394h2.f2426r %= 360.0f;
                }
                if (c0394h2.f2431o) {
                    float m2092i = C0758f.m2092i(f2);
                    float m2097h = C0758f.m2097h(f2);
                    float f11 = c0384ay.f2275d + c0394h2.f2424p;
                    float f12 = c0384ay.f2276e + c0394h2.f2425q;
                    c0394h2.f2418f = (m2092i * f12) - (m2097h * f11);
                    c0394h2.f2419g = (m2097h * f12) + (m2092i * f11);
                    if (z2) {
                        c0394h2.f2415b = c0394h2.f2418f;
                        c0394h2.f2416c = c0394h2.f2419g;
                        c0394h2.f2421i = f2 + c0384ay.f2277i;
                        c0394h2.f2431o = true;
                        if (z3) {
                            c0394h2.f2415b *= 0.6f;
                            c0394h2.f2416c *= 0.6f;
                            c0394h2.f2427d = -3.0f;
                        }
                    }
                    if (!c0384ay.f2280l) {
                        c0394h2.f2418f += f7 * c0384ay.f2298m;
                        c0394h2.f2419g += f8 * c0384ay.f2298m;
                    }
                    c0394h2.f2420h = C0758f.m2209a(c0394h2.f2415b, c0394h2.f2416c, c0394h2.f2418f, c0394h2.f2419g);
                    if (c0394h2.f2420h > f10) {
                        i2 = i3;
                        f10 = c0394h2.f2420h;
                    }
                    if (c0394h2.f2422k && !c0384ay.f2280l) {
                        i++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < c0394hArr.length; i4++) {
            C0394h c0394h3 = c0394hArr[i4];
            C0384ay c0384ay2 = c0453l.f3223aw[i4];
            if (!c0384ay2.f2281p) {
                float f13 = c0384ay2.f2296g;
                if (!c0384ay2.f2297h) {
                    f13 -= c0451j.f6960en;
                }
                float f14 = f13 + c0384ay2.f2295f;
                if (c0394h3.f2420h > 90000.0f) {
                    c0394h3.f2415b = c0384ay2.f2275d;
                    c0394h3.f2416c = c0384ay2.f2276e;
                } else if (c0394h3.f2420h > c0384ay2.f2314O * c0384ay2.f2314O) {
                    float m2123d2 = C0758f.m2123d(c0394h3.f2418f, c0394h3.f2419g, c0394h3.f2415b, c0394h3.f2416c);
                    c0394h3.f2415b = c0394h3.f2418f + (C0758f.m2092i(m2123d2) * c0384ay2.f2314O);
                    c0394h3.f2416c = c0394h3.f2419g + (C0758f.m2097h(m2123d2) * c0384ay2.f2314O);
                    c0394h3.f2422k = true;
                }
                if (!c0394h3.f2422k && c0394h3.f2427d <= f13 + 0.1f && i < c0384ay2.f2311L && (i4 == i2 || !c0384ay2.f2312M)) {
                    boolean z4 = false;
                    if (c0384ay2.f2299n) {
                        for (int i5 = 0; i5 < c0384ay2.f2293S.length; i5++) {
                            if (c0394hArr[c0384ay2.f2293S[i5]].f2422k) {
                                z4 = true;
                            }
                        }
                    }
                    float f15 = c0384ay2.f2310K;
                    if (z4) {
                        f15 = c0384ay2.f2313N;
                    }
                    if (c0394h3.f2420h > f15 * f15) {
                        c0394h3.f2422k = true;
                        i++;
                    }
                }
                if (c0384ay2.f2280l) {
                    c0394h3.f2422k = true;
                }
                if (c0394h3.f2422k) {
                    if (c0394h3.f2427d > f14 || c0384ay2.f2280l) {
                        float f16 = f * c0384ay2.f2302s;
                        if (c0394h3.f2420h <= f16 * f16) {
                            c0394h3.f2415b = c0394h3.f2418f;
                            c0394h3.f2416c = c0394h3.f2419g;
                            c0394h3.f2431o = true;
                            c0394h3.f2422k = false;
                        } else {
                            float m2123d3 = C0758f.m2123d(c0394h3.f2415b, c0394h3.f2416c, c0394h3.f2418f, c0394h3.f2419g);
                            c0394h3.f2415b += C0758f.m2092i(m2123d3) * f16;
                            c0394h3.f2416c += C0758f.m2097h(m2123d3) * f16;
                            c0394h3.f2431o = true;
                        }
                        if (c0384ay2.f2280l && c0394h3.f2427d > f13) {
                            c0394h3.f2427d -= f * c0384ay2.f2305v;
                            if (c0394h3.f2427d <= f13) {
                                c0394h3.f2427d = f13;
                            }
                        }
                        c0394h3.f2421i += C0758f.m2135c(c0394h3.f2421i, f2 + c0384ay2.f2277i, c0384ay2.f2304u * f);
                        c0394h3.f2428j = false;
                    } else if (c0394h3.f2417e < c0384ay2.f2303t) {
                        c0394h3.f2417e += f;
                    } else {
                        c0394h3.f2427d += f * c0384ay2.f2305v;
                    }
                } else {
                    c0394h3.f2417e = 0.0f;
                    if (c0394h3.f2427d > f13) {
                        c0394h3.f2427d -= f * c0384ay2.f2305v;
                        if (c0394h3.f2427d <= f13) {
                            c0394h3.f2427d = f13;
                            float f17 = c0451j.f6958el + c0394h3.f2415b;
                            float f18 = c0451j.f6959em + c0394h3.f2416c;
                            c0394h3.f2423l = C1117y.m451c(f17, f18);
                            if (c0384ay2.f2308I && !c0394h3.f2428j) {
                                c0394h3.f2428j = true;
                                if (c0394h3.f2423l) {
                                    if (m1087A.f6259dc && c0451j.f6955ei) {
                                        m1087A.f6116bR.m2384a(f17, f18, c0394h3.f2427d, 0, 0.0f, 0.0f);
                                    }
                                } else if (m1087A.f6258db && c0451j.f6955ei && (m2362c = m1087A.f6116bR.m2362c(f17, f18, c0394h3.f2427d, c0394h3.f2421i, 0)) != null) {
                                    m2362c.f4760Q = 0.0f;
                                    m2362c.f4761R = 0.0f;
                                    m2362c.f4751H = 1.6f;
                                    m2362c.f4750G = 2.8f;
                                }
                            }
                        }
                    } else if (c0394h3.f2423l && c0394h3.f2427d > (-3.0f) + f13) {
                        c0394h3.f2427d -= f * 0.3f;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4205a(C0451j c0451j, float f, boolean z, boolean z2) {
        C0394h[] c0394hArr = c0451j.f2885dR;
        if (c0394hArr == null) {
            return;
        }
        C0453l c0453l = c0451j.f2863x;
        float f2 = c0451j.f1618ce;
        if (c0453l.f3075dC) {
            f2 = c0451j.f1649cJ[c0453l.f3076dD.f2547e].f1712a;
        }
        Core m1087A = Core.m1087A();
        if (c0451j.f1628co || c0451j.f1627cn) {
            for (int i = 0; i < c0453l.f3223aw.length; i++) {
                c0394hArr[i].f2429m = true;
            }
            c0451j.m3779dy();
        }
        float m3837cC = c0451j.m3837cC();
        Paint paint = null;
        boolean z3 = m1087A.f6262df || c0451j.f1627cn;
        for (int i2 = 0; i2 < c0394hArr.length; i2++) {
            C0384ay c0384ay = c0453l.f3223aw[i2];
            if ((c0384ay.f2315P == z || c0384ay.f2290D != null) && c0384ay.f2316Q == z2 && !c0384ay.f2281p && (c0384ay.f2282q == null || !c0384ay.f2282q.read(c0451j))) {
                C0394h c0394h = c0394hArr[i2];
                if (c0394h.f2432s > 0.0f) {
                    float f3 = c0451j.f6960en + c0394h.f2427d;
                    if (paint == null) {
                        paint = c0451j.m3894aN();
                    }
                    Paint paint2 = paint;
                    float f4 = 1.0f;
                    if (f3 < -0.3f) {
                        f4 = c0451j.m2814l(f3) * 0.003921569f;
                    }
                    if (c0394h.f2432s < 1.0f) {
                        f4 *= c0394h.f2432s;
                    }
                    if (f4 < 1.0f) {
                        int i3 = (int) (255.0f * f4);
                        if (paint2.m5894f() != i3) {
                            f2413d.m5925a(paint2);
                            int m5894f = f2413d.m5894f();
                            if (m5894f < i3) {
                                i3 = m5894f;
                            }
                            f2413d.m5903c(i3);
                            paint2 = f2413d;
                        }
                    }
                    float f5 = (c0451j.f6958el + c0394h.f2415b) - m1087A.f6144cv;
                    float f6 = (((c0451j.f6959em + c0394h.f2416c) - m1087A.f6145cw) - c0394h.f2427d) - c0451j.f6960en;
                    InterfaceC1027y interfaceC1027y = m1087A.f6113bO;
                    if (m3837cC != 1.0f) {
                        interfaceC1027y.mo135k();
                        interfaceC1027y.mo226a(m3837cC, m3837cC, f5, f6);
                    }
                    if (c0384ay.f2290D != null && !z && m1087A.f6261de && c0394h.f2427d + c0451j.f6960en > 0.0f) {
                        interfaceC1027y.mo199a(c0384ay.f2290D, f5, f6 + c0394h.f2427d + c0451j.f6960en, c0394h.f2421i + c0394h.f2426r + c0384ay.f2317R, c0451j.m3009R());
                    }
                    if (c0384ay.f2315P == z) {
                        C0934e c0934e = c0384ay.f2288B;
                        if (c0384ay.f2289C != null) {
                            c0934e = c0384ay.f2289C[c0451j.f1609bV.m5105O()];
                        }
                        if (!c0384ay.f2292H && ((z3 || c0384ay.f2307G) && c0934e != null)) {
                            interfaceC1027y.mo199a(c0934e, f5, f6, c0394h.f2421i + c0394h.f2426r + c0384ay.f2317R, paint2);
                        }
                        C0934e c0934e2 = c0384ay.f2284x;
                        if (c0384ay.f2285y != null) {
                            c0934e2 = c0384ay.f2285y[c0451j.f1609bV.m5105O()];
                        }
                        if (c0934e2 != null && (z3 || c0384ay.f2306F)) {
                            float f7 = c0934e2.f6407u;
                            float f8 = f7;
                            float m2092i = C0758f.m2092i(f2);
                            float m2097h = C0758f.m2097h(f2);
                            float f9 = (m2092i * c0384ay.f2279k) - (m2097h * c0384ay.f2278j);
                            float f10 = (m2097h * c0384ay.f2279k) + (m2092i * c0384ay.f2278j);
                            float m2123d = C0758f.m2123d(c0394h.f2415b, c0394h.f2416c, f9, f10);
                            float m2209a = C0758f.m2209a(c0394h.f2415b, c0394h.f2416c, f9, f10);
                            if (m2209a < (f7 - 2.0f) * (f7 - 2.0f)) {
                                f8 = C0758f.m2204a((int) m2209a);
                            }
                            interfaceC1027y.mo135k();
                            interfaceC1027y.mo227a(m2123d + 90.0f, f5, f6);
                            f2411b.m5874a(0, (int) (f7 - f8), c0934e2.f6402p, (int) (f7 + f8));
                            f2412c.m5861a(f5 - c0934e2.f6404r, f6 - f8, f5 + c0934e2.f6404r, f6 + f8);
                            interfaceC1027y.mo192a(c0934e2, f2411b, f2412c, paint2);
                            interfaceC1027y.mo134l();
                        }
                        if (c0384ay.f2292H && ((z3 || c0384ay.f2307G) && c0934e != null)) {
                            interfaceC1027y.mo199a(c0934e, f5, f6, c0394h.f2421i + c0394h.f2426r + c0384ay.f2317R, paint2);
                        }
                    }
                    if (m3837cC != 1.0f) {
                        interfaceC1027y.mo134l();
                    }
                }
            }
        }
    }
}
