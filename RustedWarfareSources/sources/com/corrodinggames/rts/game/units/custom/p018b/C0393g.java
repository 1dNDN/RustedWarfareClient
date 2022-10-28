package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.C0384ay;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
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

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo3798b(C0451j c0451j, float f) {
        C0745e m2292c;
        C0453l c0453l = c0451j.f2863x;
        C0394h[] c0394hArr = c0451j.f2885dR;
        if (c0394hArr == null) {
            return;
        }
        if (f != 0.0f && c0451j.f2845f > 0.3d) {
            return;
        }
        C0399m dl = c0451j.m4079dl();
        if (dl != null && dl.f2464t) {
            return;
        }
        if (c0451j.f1651cL != null && dl == null) {
            for (C0394h c0394h : c0394hArr) {
                c0394h.f2426m = true;
            }
            return;
        }
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        float f2 = c0451j.f1618ce;
        if (c0453l.f3139dC) {
            f2 = c0451j.f1649cJ[c0453l.f3140dD.f2547e].f1712a;
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
        PointF n = c0451j.m2734n(15.0f);
        float f7 = n.f227a;
        float f8 = n.f228b;
        if (f7 != 0.0f || f8 != 0.0f) {
            float m2147a = C0758f.m2147a(0.0f, 0.0f, f7, f8);
            float m2061d = C0758f.m2061d(0.0f, 0.0f, f7, f8);
            float f9 = m2147a * 240.0f;
            if (f9 > 15.0f) {
                f9 = 15.0f;
            }
            f7 = C0758f.m2030i(m2061d) * f9;
            f8 = C0758f.m2035h(m2061d) * f9;
        }
        int i = 0;
        float f10 = 0.0f;
        int i2 = 0;
        for (int i3 = 0; i3 < c0394hArr.length; i3++) {
            C0394h c0394h2 = c0394hArr[i3];
            C0384ay c0384ay = c0453l.f2977aw[i3];
            boolean z2 = false;
            boolean z3 = false;
            if (c0394h2.f2426m) {
                z2 = true;
                c0394h2.f2426m = false;
                c0394h2.f2428o = true;
                if (c0394h2.f2427n) {
                    z3 = true;
                }
                c0394h2.f2427n = false;
            }
            if (!c0384ay.f2279h) {
                c0394h2.f2417d -= f5;
            }
            if (!c0384ay.f2283l) {
                if (z) {
                    c0394h2.f2415b -= f3;
                    c0394h2.f2416c -= f4;
                    c0394h2.f2428o = true;
                }
            } else if (z && f6 != 0.0f) {
                C0758f.f4890c.m5040a(c0394h2.f2415b, c0394h2.f2416c);
                C0758f.m2146a(0.0f, 0.0f, f6, C0758f.f4890c);
                c0394h2.f2415b = C0758f.f4890c.f227a;
                c0394h2.f2416c = C0758f.f4890c.f228b;
                c0394h2.f2422i += f6;
                c0394h2.f2428o = true;
            }
            if (!c0384ay.f2287p) {
                if (c0384ay.f2317T != 0.0f) {
                    c0394h2.f2431r += c0384ay.f2317T * f;
                    c0394h2.f2431r %= 360.0f;
                }
                if (c0394h2.f2428o) {
                    float m2030i = C0758f.m2030i(f2);
                    float m2035h = C0758f.m2035h(f2);
                    float f11 = c0384ay.f2275d + c0394h2.f2429p;
                    float f12 = c0384ay.f2276e + c0394h2.f2430q;
                    c0394h2.f2419f = (m2030i * f12) - (m2035h * f11);
                    c0394h2.f2420g = (m2035h * f12) + (m2030i * f11);
                    if (z2) {
                        c0394h2.f2415b = c0394h2.f2419f;
                        c0394h2.f2416c = c0394h2.f2420g;
                        c0394h2.f2422i = f2 + c0384ay.f2280i;
                        c0394h2.f2428o = true;
                        if (z3) {
                            c0394h2.f2415b *= 0.6f;
                            c0394h2.f2416c *= 0.6f;
                            c0394h2.f2417d = -3.0f;
                        }
                    }
                    if (!c0384ay.f2283l) {
                        c0394h2.f2419f += f7 * c0384ay.f2284m;
                        c0394h2.f2420g += f8 * c0384ay.f2284m;
                    }
                    c0394h2.f2421h = C0758f.m2147a(c0394h2.f2415b, c0394h2.f2416c, c0394h2.f2419f, c0394h2.f2420g);
                    if (c0394h2.f2421h > f10) {
                        i2 = i3;
                        f10 = c0394h2.f2421h;
                    }
                    if (c0394h2.f2424k && !c0384ay.f2283l) {
                        i++;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < c0394hArr.length; i4++) {
            C0394h c0394h3 = c0394hArr[i4];
            C0384ay c0384ay2 = c0453l.f2977aw[i4];
            if (!c0384ay2.f2287p) {
                float f13 = c0384ay2.f2278g;
                if (!c0384ay2.f2279h) {
                    f13 -= c0451j.f6960en;
                }
                float f14 = f13 + c0384ay2.f2277f;
                if (c0394h3.f2421h > 90000.0f) {
                    c0394h3.f2415b = c0384ay2.f2275d;
                    c0394h3.f2416c = c0384ay2.f2276e;
                } else if (c0394h3.f2421h > c0384ay2.f2312O * c0384ay2.f2312O) {
                    float m2061d2 = C0758f.m2061d(c0394h3.f2419f, c0394h3.f2420g, c0394h3.f2415b, c0394h3.f2416c);
                    c0394h3.f2415b = c0394h3.f2419f + (C0758f.m2030i(m2061d2) * c0384ay2.f2312O);
                    c0394h3.f2416c = c0394h3.f2420g + (C0758f.m2035h(m2061d2) * c0384ay2.f2312O);
                    c0394h3.f2424k = true;
                }
                if (!c0394h3.f2424k && c0394h3.f2417d <= f13 + 0.1f && i < c0384ay2.f2309L && (i4 == i2 || !c0384ay2.f2310M)) {
                    boolean z4 = false;
                    if (c0384ay2.f2285n) {
                        for (int i5 = 0; i5 < c0384ay2.f2316S.length; i5++) {
                            if (c0394hArr[c0384ay2.f2316S[i5]].f2424k) {
                                z4 = true;
                            }
                        }
                    }
                    float f15 = c0384ay2.f2308K;
                    if (z4) {
                        f15 = c0384ay2.f2311N;
                    }
                    if (c0394h3.f2421h > f15 * f15) {
                        c0394h3.f2424k = true;
                        i++;
                    }
                }
                if (c0384ay2.f2283l) {
                    c0394h3.f2424k = true;
                }
                if (c0394h3.f2424k) {
                    if (c0394h3.f2417d > f14 || c0384ay2.f2283l) {
                        float f16 = f * c0384ay2.f2290s;
                        if (c0394h3.f2421h <= f16 * f16) {
                            c0394h3.f2415b = c0394h3.f2419f;
                            c0394h3.f2416c = c0394h3.f2420g;
                            c0394h3.f2428o = true;
                            c0394h3.f2424k = false;
                        } else {
                            float m2061d3 = C0758f.m2061d(c0394h3.f2415b, c0394h3.f2416c, c0394h3.f2419f, c0394h3.f2420g);
                            c0394h3.f2415b += C0758f.m2030i(m2061d3) * f16;
                            c0394h3.f2416c += C0758f.m2035h(m2061d3) * f16;
                            c0394h3.f2428o = true;
                        }
                        if (c0384ay2.f2283l && c0394h3.f2417d > f13) {
                            c0394h3.f2417d -= f * c0384ay2.f2293v;
                            if (c0394h3.f2417d <= f13) {
                                c0394h3.f2417d = f13;
                            }
                        }
                        c0394h3.f2422i += C0758f.m2073c(c0394h3.f2422i, f2 + c0384ay2.f2280i, c0384ay2.f2292u * f);
                        c0394h3.f2423j = false;
                    } else if (c0394h3.f2418e < c0384ay2.f2291t) {
                        c0394h3.f2418e += f;
                    } else {
                        c0394h3.f2417d += f * c0384ay2.f2293v;
                    }
                } else {
                    c0394h3.f2418e = 0.0f;
                    if (c0394h3.f2417d > f13) {
                        c0394h3.f2417d -= f * c0384ay2.f2293v;
                        if (c0394h3.f2417d <= f13) {
                            c0394h3.f2417d = f13;
                            float f17 = c0451j.f6958el + c0394h3.f2415b;
                            float f18 = c0451j.f6959em + c0394h3.f2416c;
                            c0394h3.f2425l = C1117y.m451c(f17, f18);
                            if (c0384ay2.f2306I && !c0394h3.f2423j) {
                                c0394h3.f2423j = true;
                                if (c0394h3.f2425l) {
                                    if (m1071A.f6227dc && c0451j.f6955ei) {
                                        m1071A.f6164bR.m2314a(f17, f18, c0394h3.f2417d, 0, 0.0f, 0.0f);
                                    }
                                } else if (m1071A.f6226db && c0451j.f6955ei && (m2292c = m1071A.f6164bR.m2292c(f17, f18, c0394h3.f2417d, c0394h3.f2422i, 0)) != null) {
                                    m2292c.f4760Q = 0.0f;
                                    m2292c.f4761R = 0.0f;
                                    m2292c.f4751H = 1.6f;
                                    m2292c.f4750G = 2.8f;
                                }
                            }
                        }
                    } else if (c0394h3.f2425l && c0394h3.f2417d > (-3.0f) + f13) {
                        c0394h3.f2417d -= f * 0.3f;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3816a(C0451j c0451j, float f, boolean z, boolean z2) {
        C0394h[] c0394hArr = c0451j.f2885dR;
        if (c0394hArr == null) {
            return;
        }
        C0453l c0453l = c0451j.f2863x;
        float f2 = c0451j.f1618ce;
        if (c0453l.f3139dC) {
            f2 = c0451j.f1649cJ[c0453l.f3140dD.f2547e].f1712a;
        }
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (c0451j.f1628co || c0451j.f1627cn) {
            for (int i = 0; i < c0453l.f2977aw.length; i++) {
                c0394hArr[i].f2426m = true;
            }
            c0451j.m3475dy();
        }
        float mo3518cC = c0451j.mo3518cC();
        Paint paint = null;
        boolean z3 = m1071A.f6230df || c0451j.f1627cn;
        for (int i2 = 0; i2 < c0394hArr.length; i2++) {
            C0384ay c0384ay = c0453l.f2977aw[i2];
            if ((c0384ay.f2313P == z || c0384ay.f2301D != null) && c0384ay.f2314Q == z2 && !c0384ay.f2287p && (c0384ay.f2288q == null || !c0384ay.f2288q.read(c0451j))) {
                C0394h c0394h = c0394hArr[i2];
                if (c0394h.f2432s > 0.0f) {
                    float f3 = c0451j.f6960en + c0394h.f2417d;
                    if (paint == null) {
                        paint = c0451j.mo2865aN();
                    }
                    Paint paint2 = paint;
                    float f4 = 1.0f;
                    if (f3 < -0.3f) {
                        f4 = c0451j.m2741l(f3) * 0.003921569f;
                    }
                    if (c0394h.f2432s < 1.0f) {
                        f4 *= c0394h.f2432s;
                    }
                    if (f4 < 1.0f) {
                        int i3 = (int) (255.0f * f4);
                        if (paint2.m5055f() != i3) {
                            f2413d.m5083a(paint2);
                            int m5055f = f2413d.m5055f();
                            if (m5055f < i3) {
                                i3 = m5055f;
                            }
                            f2413d.m5064c(i3);
                            paint2 = f2413d;
                        }
                    }
                    float f5 = (c0451j.f6958el + c0394h.f2415b) - m1071A.f6194cv;
                    float f6 = (((c0451j.f6959em + c0394h.f2416c) - m1071A.f6195cw) - c0394h.f2417d) - c0451j.f6960en;
                    InterfaceC1027y interfaceC1027y = m1071A.f6161bO;
                    if (mo3518cC != 1.0f) {
                        interfaceC1027y.mo135k();
                        interfaceC1027y.mo226a(mo3518cC, mo3518cC, f5, f6);
                    }
                    if (c0384ay.f2301D != null && !z && m1071A.f6229de && c0394h.f2417d + c0451j.f6960en > 0.0f) {
                        interfaceC1027y.mo199a(c0384ay.f2301D, f5, f6 + c0394h.f2417d + c0451j.f6960en, c0394h.f2422i + c0394h.f2431r + c0384ay.f2315R, c0451j.m2933R());
                    }
                    if (c0384ay.f2313P == z) {
                        C0934e c0934e = c0384ay.f2299B;
                        if (c0384ay.f2300C != null) {
                            c0934e = c0384ay.f2300C[c0451j.f1609bV.m4327O()];
                        }
                        if (!c0384ay.f2305H && ((z3 || c0384ay.f2304G) && c0934e != null)) {
                            interfaceC1027y.mo199a(c0934e, f5, f6, c0394h.f2422i + c0394h.f2431r + c0384ay.f2315R, paint2);
                        }
                        C0934e c0934e2 = c0384ay.f2295x;
                        if (c0384ay.f2296y != null) {
                            c0934e2 = c0384ay.f2296y[c0451j.f1609bV.m4327O()];
                        }
                        if (c0934e2 != null && (z3 || c0384ay.f2303F)) {
                            float f7 = c0934e2.f6409u;
                            float f8 = f7;
                            float m2030i = C0758f.m2030i(f2);
                            float m2035h = C0758f.m2035h(f2);
                            float f9 = (m2030i * c0384ay.f2282k) - (m2035h * c0384ay.f2281j);
                            float f10 = (m2035h * c0384ay.f2282k) + (m2030i * c0384ay.f2281j);
                            float m2061d = C0758f.m2061d(c0394h.f2415b, c0394h.f2416c, f9, f10);
                            float m2147a = C0758f.m2147a(c0394h.f2415b, c0394h.f2416c, f9, f10);
                            if (m2147a < (f7 - 2.0f) * (f7 - 2.0f)) {
                                f8 = C0758f.m2142a((int) m2147a);
                            }
                            interfaceC1027y.mo135k();
                            interfaceC1027y.mo227a(m2061d + 90.0f, f5, f6);
                            f2411b.m5035a(0, (int) (f7 - f8), c0934e2.f6404p, (int) (f7 + f8));
                            f2412c.m5022a(f5 - c0934e2.f6406r, f6 - f8, f5 + c0934e2.f6406r, f6 + f8);
                            interfaceC1027y.mo192a(c0934e2, f2411b, f2412c, paint2);
                            interfaceC1027y.mo134l();
                        }
                        if (c0384ay.f2305H && ((z3 || c0384ay.f2304G) && c0934e != null)) {
                            interfaceC1027y.mo199a(c0934e, f5, f6, c0394h.f2422i + c0394h.f2431r + c0384ay.f2315R, paint2);
                        }
                    }
                    if (mo3518cC != 1.0f) {
                        interfaceC1027y.mo134l();
                    }
                }
            }
        }
    }
}
