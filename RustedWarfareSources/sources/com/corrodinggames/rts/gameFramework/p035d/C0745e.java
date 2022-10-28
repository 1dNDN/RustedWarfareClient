package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.C0382aw;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/e.class */
public final class C0745e {

    /* renamed from: az */
    private final C0743c f4717az;

    /* renamed from: b */
    public AbstractC1120w f4719b;

    /* renamed from: c */
    public boolean f4720c;

    /* renamed from: d */
    public boolean f4721d;

    /* renamed from: g */
    public int f4724g;

    /* renamed from: o */
    public boolean f4732o;

    /* renamed from: p */
    public boolean f4733p;

    /* renamed from: q */
    public boolean f4734q;

    /* renamed from: s */
    public boolean f4736s;

    /* renamed from: t */
    public boolean f4737t;

    /* renamed from: u */
    public float f4738u;

    /* renamed from: v */
    public boolean f4739v;

    /* renamed from: w */
    public boolean f4740w;

    /* renamed from: y */
    public int f4742y;

    /* renamed from: z */
    public int f4743z;

    /* renamed from: B */
    public short f4745B;

    /* renamed from: F */
    public float f4749F;

    /* renamed from: G */
    public float f4750G;

    /* renamed from: H */
    public float f4751H;

    /* renamed from: I */
    public boolean f4752I;

    /* renamed from: J */
    public float f4753J;

    /* renamed from: K */
    public float f4754K;

    /* renamed from: L */
    public float f4755L;

    /* renamed from: M */
    public boolean f4756M;

    /* renamed from: N */
    public float f4757N;

    /* renamed from: O */
    public float f4758O;

    /* renamed from: P */
    public float f4759P;

    /* renamed from: Q */
    public float f4760Q;

    /* renamed from: R */
    public float f4761R;

    /* renamed from: S */
    public float f4762S;

    /* renamed from: T */
    public float f4763T;

    /* renamed from: U */
    public float f4764U;

    /* renamed from: V */
    public float f4765V;

    /* renamed from: W */
    public float f4766W;

    /* renamed from: X */
    public float f4767X;

    /* renamed from: Z */
    public float f4769Z;

    /* renamed from: aa */
    public float f4770aa;

    /* renamed from: ab */
    public String f4771ab;

    /* renamed from: ac */
    public Paint f4772ac;

    /* renamed from: ad */
    public float f4773ad;

    /* renamed from: ae */
    public float f4774ae;

    /* renamed from: af */
    public boolean f4775af;

    /* renamed from: ag */
    public int f4776ag;

    /* renamed from: ah */
    public int f4777ah;

    /* renamed from: ai */
    public boolean f4778ai;

    /* renamed from: aj */
    public boolean f4779aj;

    /* renamed from: ak */
    public float f4780ak;

    /* renamed from: al */
    public float f4781al;

    /* renamed from: am */
    public boolean f4782am;

    /* renamed from: an */
    public boolean f4783an;

    /* renamed from: aq */
    public int f4786aq;

    /* renamed from: ar */
    public int f4787ar;

    /* renamed from: av */
    public float f4791av;

    /* renamed from: aw */
    public int f4792aw;

    /* renamed from: ax */
    public boolean f4793ax;

    /* renamed from: h */
    public static int f4725h = 1;

    /* renamed from: i */
    public static int f4726i = 2;

    /* renamed from: j */
    public static int f4727j = 3;

    /* renamed from: k */
    public static int f4728k = 4;

    /* renamed from: l */
    public static int f4729l = 5;

    /* renamed from: m */
    public static int f4730m = 6;

    /* renamed from: n */
    public static int f4731n = 7;

    /* renamed from: D */
    public static LightingColorFilter f4747D = null;

    /* renamed from: E */
    public static int f4748E = 0;

    /* renamed from: ay */
    public static C0930ag[] f4794ay = new C0930ag[128];

    /* renamed from: a */
    public C0382aw f4718a = C0382aw.defaultEffectTemplate;

    /* renamed from: e */
    public boolean f4722e = true;

    /* renamed from: f */
    public boolean f4723f = false;

    /* renamed from: r */
    public EnumC0748h f4735r = EnumC0748h.f4832a;

    /* renamed from: x */
    public float f4741x = 1.0f;

    /* renamed from: A */
    public float f4744A = -1.0f;

    /* renamed from: C */
    public LightingColorFilter f4746C = null;

    /* renamed from: Y */
    public float f4768Y = 0.0f;

    /* renamed from: ao */
    public boolean f4784ao = false;

    /* renamed from: ap */
    public float f4785ap = 0.0f;

    /* renamed from: as */
    public short f4788as = 2;

    /* renamed from: at */
    public boolean f4789at = false;

    /* renamed from: au */
    public C0930ag f4790au = m2356a();

    /* JADX INFO: Access modifiers changed from: protected */
    public C0745e(C0743c c0743c) {
        this.f4717az = c0743c;
    }

    static {
        for (int i = 0; i < f4794ay.length; i++) {
            f4794ay[i] = m2356a();
            f4794ay[i].m5903c((int) ((i / (f4794ay.length - 1)) * 255.0f));
        }
    }

    /* renamed from: a */
    public static C0930ag m2356a() {
        return C1117y.m458b();
    }

    /* renamed from: a */
    public C0930ag m2355a(float f) {
        int length = (int) (f * (f4794ay.length - 1));
        if (length < 0) {
            length = 0;
        }
        if (length > f4794ay.length - 1) {
            length = f4794ay.length - 1;
        }
        return f4794ay[length];
    }

    /* renamed from: b */
    public void m2351b() {
        if (this.f4733p) {
            this.f4733p = false;
            this.f4717az.f4683a--;
            C0743c.f4690h = true;
            if (this.f4718a.alsoEmitEffectsOnDeath != null && this.f4745B < 20) {
                float f = this.f4753J;
                float f2 = this.f4754K;
                float f3 = this.f4755L;
                if (this.f4719b != null) {
                    f += this.f4719b.f6958el;
                    f2 += this.f4719b.f6959em;
                    f3 += this.f4719b.f6960en;
                }
                this.f4718a.alsoEmitEffectsOnDeath.m3636a(f, f2, f3, this.f4769Z, this.f4719b, 0, this.f4745B);
            }
        }
    }

    /* renamed from: c */
    public void m2349c() {
        this.f4718a = C0382aw.defaultEffectTemplate;
        this.f4735r = EnumC0748h.f4832a;
        this.f4719b = null;
        this.f4720c = false;
        this.f4721d = false;
        this.f4722e = true;
        this.f4723f = false;
        this.f4724g = 0;
        this.f4732o = false;
        this.f4734q = false;
        this.f4753J = 0.0f;
        this.f4754K = 0.0f;
        this.f4756M = false;
        this.f4757N = 0.0f;
        this.f4758O = 0.0f;
        this.f4759P = 0.0f;
        this.f4755L = 0.0f;
        this.f4788as = (short) 2;
        this.f4784ao = false;
        this.f4785ap = 0.0f;
        this.f4775af = false;
        this.f4781al = 0.0f;
        this.f4780ak = 0.0f;
        this.f4777ah = 0;
        this.f4778ai = false;
        this.f4779aj = false;
        this.f4782am = false;
        this.f4783an = false;
        this.f4786aq = 0;
        this.f4787ar = 0;
        this.f4765V = 0.0f;
        this.f4766W = 15.0f;
        this.f4767X = this.f4766W;
        this.f4768Y = 0.0f;
        this.f4736s = false;
        this.f4737t = false;
        this.f4738u = 0.0f;
        this.f4750G = 1.0f;
        this.f4751H = 1.0f;
        this.f4752I = false;
        this.f4739v = false;
        this.f4740w = false;
        this.f4741x = 1.0f;
        this.f4749F = 1.0f;
        this.f4769Z = 0.0f;
        this.f4770aa = 0.0f;
        this.f4760Q = 0.0f;
        this.f4761R = 0.0f;
        this.f4762S = 0.0f;
        this.f4763T = 0.0f;
        this.f4764U = 0.0f;
        this.f4771ab = null;
        this.f4772ac = null;
        this.f4773ad = 0.0f;
        this.f4774ae = 0.0f;
        this.f4745B = (short) 0;
        this.f4742y = -1;
        this.f4746C = null;
        this.f4743z = -1;
        this.f4744A = -1.0f;
        this.f4790au.m5930a((ColorFilter) null);
        this.f4793ax = false;
        this.f4790au.m908a((C0928ae) null);
        this.f4789at = false;
    }

    /* renamed from: a */
    public void m2353a(C0745e c0745e) {
        this.f4718a = c0745e.f4718a;
        this.f4735r = c0745e.f4735r;
        this.f4724g = c0745e.f4724g;
        this.f4719b = c0745e.f4719b;
        this.f4720c = c0745e.f4720c;
        this.f4721d = c0745e.f4721d;
        this.f4722e = c0745e.f4722e;
        this.f4732o = c0745e.f4732o;
        this.f4734q = c0745e.f4734q;
        this.f4753J = c0745e.f4753J;
        this.f4754K = c0745e.f4754K;
        this.f4756M = c0745e.f4756M;
        this.f4757N = c0745e.f4757N;
        this.f4758O = c0745e.f4758O;
        this.f4759P = c0745e.f4759P;
        this.f4755L = c0745e.f4755L;
        this.f4788as = c0745e.f4788as;
        this.f4784ao = c0745e.f4784ao;
        this.f4785ap = c0745e.f4785ap;
        this.f4775af = c0745e.f4775af;
        this.f4781al = c0745e.f4781al;
        this.f4780ak = c0745e.f4780ak;
        this.f4777ah = c0745e.f4777ah;
        this.f4778ai = c0745e.f4778ai;
        this.f4779aj = c0745e.f4779aj;
        this.f4782am = c0745e.f4778ai;
        this.f4783an = c0745e.f4783an;
        this.f4786aq = c0745e.f4786aq;
        this.f4787ar = c0745e.f4787ar;
        this.f4765V = c0745e.f4765V;
        this.f4766W = c0745e.f4766W;
        this.f4767X = c0745e.f4767X;
        this.f4768Y = c0745e.f4768Y;
        this.f4736s = c0745e.f4736s;
        this.f4737t = c0745e.f4737t;
        this.f4738u = c0745e.f4738u;
        this.f4750G = c0745e.f4750G;
        this.f4751H = c0745e.f4751H;
        this.f4752I = c0745e.f4752I;
        this.f4739v = c0745e.f4739v;
        this.f4740w = c0745e.f4740w;
        this.f4741x = c0745e.f4741x;
        this.f4749F = c0745e.f4749F;
        this.f4769Z = c0745e.f4769Z;
        this.f4770aa = c0745e.f4770aa;
        this.f4760Q = c0745e.f4760Q;
        this.f4761R = c0745e.f4761R;
        this.f4762S = c0745e.f4762S;
        this.f4763T = c0745e.f4763T;
        this.f4764U = c0745e.f4764U;
        this.f4771ab = c0745e.f4771ab;
        this.f4772ac = c0745e.f4772ac;
        this.f4773ad = c0745e.f4773ad;
        this.f4774ae = c0745e.f4774ae;
        this.f4745B = c0745e.f4745B;
        this.f4742y = c0745e.f4742y;
        this.f4743z = c0745e.f4743z;
        this.f4744A = c0745e.f4744A;
        this.f4746C = c0745e.f4746C;
        this.f4789at = c0745e.f4789at;
    }

    /* renamed from: b */
    public void m2350b(float f) {
        this.f4765V = C0758f.m2211a(this.f4765V, f);
        if (this.f4765V > 0.0f) {
            return;
        }
        this.f4766W -= f;
        if (this.f4719b != null && this.f4719b.f6953eg && !this.f4718a.liveAfterAttachedDies) {
            this.f4766W = -1.0f;
        }
        if (this.f4766W < 0.0f) {
            m2351b();
            return;
        }
        if (this.f4775af) {
            if (this.f4782am) {
                this.f4781al -= this.f4780ak * f;
            } else {
                this.f4781al += this.f4780ak * f;
            }
            if (this.f4778ai) {
                if (!this.f4782am) {
                    if (this.f4781al >= this.f4777ah + 1) {
                        this.f4782am = true;
                        this.f4781al = this.f4777ah;
                    }
                } else if (this.f4781al < this.f4776ag) {
                    if (!this.f4779aj) {
                        m2351b();
                        return;
                    } else {
                        this.f4782am = false;
                        this.f4781al = this.f4776ag;
                    }
                }
            } else if (this.f4781al >= this.f4777ah + 1) {
                if (!this.f4779aj) {
                    m2351b();
                    return;
                }
                this.f4781al = this.f4776ag;
            }
            this.f4786aq = (int) this.f4781al;
        }
        if (this.f4739v) {
            this.f4762S -= (this.f4762S * 0.002f) * f;
            this.f4760Q -= f * 0.0015f;
        }
        if (this.f4740w) {
            if (this.f4755L > 0.0f) {
                this.f4762S -= (0.1f * this.f4741x) * f;
            } else {
                if (this.f4762S < 0.0f) {
                    this.f4762S = -this.f4762S;
                    this.f4762S *= 0.5f;
                    this.f4762S = C0758f.m2211a(this.f4762S, 1.3f);
                }
                if (this.f4755L < 0.0f) {
                    this.f4755L = 0.0f;
                }
                if (this.f4762S < 0.2d) {
                    this.f4788as = (short) 1;
                }
                this.f4760Q = C0758f.m2211a(this.f4760Q, 0.15f * f);
                this.f4761R = C0758f.m2211a(this.f4761R, 0.15f * f);
                this.f4770aa = C0758f.m2211a(this.f4770aa, 1.0f * f);
            }
        }
        this.f4753J += this.f4760Q * f;
        this.f4754K += this.f4761R * f;
        this.f4755L += this.f4762S * f;
        this.f4769Z += this.f4770aa * f;
        if (this.f4718a.trailEffect != null) {
            this.f4768Y += f;
            if (this.f4768Y > this.f4718a.trailEffectRate) {
                this.f4768Y = 0.0f;
                if (this.f4745B < 20) {
                    float f2 = this.f4753J;
                    float f3 = this.f4754K;
                    float f4 = this.f4755L;
                    if (this.f4719b != null) {
                        f2 += this.f4719b.f6958el;
                        f3 += this.f4719b.f6959em;
                        f4 += this.f4719b.f6960en;
                    }
                    this.f4718a.trailEffect.m3636a(f2, f3, f4, this.f4769Z, this.f4719b, 0, this.f4745B);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2354a(int i, C0747g c0747g, Rect rect) {
        int i2 = 0;
        if (i >= c0747g.f4826h) {
            i2 = 0 + (i / c0747g.f4826h);
            i %= c0747g.f4826h;
        }
        int i3 = c0747g.f4822d + (i * c0747g.f4824f);
        int i4 = c0747g.f4823e + (i2 * c0747g.f4825g);
        rect.f230a = i3;
        rect.f231b = i4;
        rect.f232c = i3 + c0747g.f4820b;
        rect.f233d = i4 + c0747g.f4821c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v152, types: [android.graphics.Paint] */
    /* renamed from: a */
    public boolean m2352a(Core core, boolean z) {
        C0747g c0747g;
        PointF m2124d;
        float f;
        C0930ag c0930ag;
        Rect rect = C0743c.f4697o;
        RectF rectF = C0743c.f4696n;
        if (this.f4765V > 0.0f) {
            return false;
        }
        if (z && this.f4755L < 1.0f) {
            return false;
        }
        if (this.f4718a.imageStrip != null) {
            c0747g = this.f4718a.imageStrip;
        } else {
            c0747g = C0743c.f4701s[this.f4787ar];
        }
        if (!c0747g.f4829k) {
            m2354a(this.f4786aq, c0747g, rect);
        } else {
            rect.m5874a(0, 0, c0747g.f4827i.mo386m(), c0747g.f4827i.mo387l());
        }
        if (!z) {
            m2124d = C0758f.m2124d(this.f4753J, this.f4754K, this.f4755L);
        } else {
            m2124d = C0758f.m2124d(this.f4753J, this.f4754K, 0.0f);
        }
        float f2 = 1.0f;
        if (this.f4751H != 1.0f || this.f4750G != 1.0f || this.f4752I) {
            f2 = C0758f.m2107f(this.f4751H, this.f4750G, 1.0f - (this.f4766W / this.f4767X));
            if (this.f4752I && !this.f4732o) {
                f2 = f2 * (1.0f / core.f6256cW) * core.f6132ci;
            }
        }
        rectF.m5861a(m2124d.f227a, m2124d.f228b, m2124d.f227a + rect.m5872b(), m2124d.f228b + rect.m5868c());
        if (this.f4784ao) {
            rectF.m5862a((-rectF.m5856b()) / 2.0f, (-rectF.m5852c()) / 2.0f);
        }
        if (this.f4785ap != 0.0f) {
            rectF.m5862a(0.0f, rectF.m5852c() * this.f4785ap * f2);
        }
        if (this.f4719b != null) {
            if (!z) {
                if (!this.f4720c) {
                    rectF.m5862a(this.f4719b.f6958el, this.f4719b.f6959em - this.f4719b.f6960en);
                } else {
                    rectF.m5862a(this.f4719b.f6958el, this.f4719b.f6959em);
                }
            } else {
                rectF.m5862a(this.f4719b.f6958el, this.f4719b.f6959em);
            }
        }
        if ((!this.f4732o || this.f4756M) && !C0758f.m2194a(core.f6250cM, rectF)) {
            return false;
        }
        if (!this.f4722e && !this.f4732o && !this.f4723f) {
            if (!core.f6110bL.m5342a(rectF.m5850d(), rectF.m5849e(), core.f6099bs)) {
                return false;
            }
            this.f4723f = true;
        }
        if (!this.f4732o) {
            rectF.m5862a(-core.f6144cv, -core.f6145cw);
        }
        if (this.f4763T != 0.0f) {
            rectF.m5862a(0.0f, C0758f.m2097h(((this.f4767X - this.f4766W) / this.f4764U) * 360.0f) * this.f4763T);
        }
        float f3 = this.f4767X - this.f4766W;
        float f4 = 1.0f;
        float f5 = 1.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        boolean z2 = false;
        if (this.f4742y != -1) {
            f4 = Color.m5950a(this.f4742y) * 0.003921569f;
            int m5946b = Color.m5946b(this.f4742y);
            int m5945c = Color.m5945c(this.f4742y);
            int m5944d = Color.m5944d(this.f4742y);
            if (m5946b != 255 || m5945c != 255 || m5944d != 255) {
                z2 = true;
                f5 = m5946b * 0.003921569f;
                f6 = m5945c * 0.003921569f;
                f7 = m5944d * 0.003921569f;
            }
        }
        if (this.f4744A >= 0.0f) {
            float m5950a = Color.m5950a(this.f4743z) * 0.003921569f;
            float m5946b2 = Color.m5946b(this.f4743z) * 0.003921569f;
            float m5945c2 = Color.m5945c(this.f4743z) * 0.003921569f;
            float m5944d2 = Color.m5944d(this.f4743z) * 0.003921569f;
            if (this.f4744A <= f3) {
                f4 = m5950a;
                z2 = true;
                f5 = m5946b2;
                f6 = m5945c2;
                f7 = m5944d2;
            } else {
                float f8 = f3 / this.f4744A;
                float f9 = 1.0f - f8;
                f4 = (f4 * f9) + (m5950a * f8);
                z2 = true;
                f5 = (f5 * f9) + (m5946b2 * f8);
                f6 = (f6 * f9) + (m5945c2 * f8);
                f7 = (f7 * f9) + (m5944d2 * f8);
            }
        }
        if (this.f4736s && f3 >= this.f4738u) {
            f = f4 * (this.f4766W / (this.f4767X - this.f4738u)) * this.f4749F;
        } else if (this.f4737t && f3 < this.f4738u) {
            f = f4 * (f3 / this.f4738u) * this.f4749F;
        } else {
            f = f4 * this.f4749F;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        boolean z3 = false;
        InterfaceC1027y interfaceC1027y = core.f6113bO;
        if (this.f4769Z != 0.0f) {
            if (0 == 0) {
                z3 = true;
                interfaceC1027y.mo135k();
            }
            interfaceC1027y.mo227a(this.f4769Z + 90.0f, rectF.m5850d(), rectF.m5849e());
        }
        if (f2 != 1.0f) {
            if (!z3) {
                z3 = true;
                interfaceC1027y.mo135k();
            }
            interfaceC1027y.mo226a(f2, f2, rectF.m5850d(), rectF.m5849e());
        }
        if (z) {
            f = C0758f.m2158b(f / 3.0f, 0.0f, 1.0f);
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
            z2 = true;
        }
        if (z2 && Core.m1012as() && !z && this.f4746C == null) {
            int m2152b = C0758f.m2152b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            if (f4747D != null && f4748E == m2152b) {
                this.f4746C = f4747D;
            } else {
                f4747D = new LightingColorFilter(m2152b, 0);
                f4748E = m2152b;
                this.f4746C = f4747D;
            }
        }
        LightingColorFilter lightingColorFilter = this.f4746C;
        if (lightingColorFilter != null) {
            if (!this.f4793ax) {
                this.f4790au.m5930a(lightingColorFilter);
                this.f4793ax = true;
            }
            z2 = true;
        } else if (this.f4793ax) {
            this.f4790au.m5930a((ColorFilter) null);
            this.f4793ax = false;
        }
        if (this.f4788as == 101) {
            if (C0743c.f4693k == null) {
                Core.LogDebug2("Loading displacement shader");
                try {
                    C0743c.f4693k = new C0928ae("assets/shaders/post_displacement.frag");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (this.f4717az.f4694l != null) {
                C0928ae c0928ae = C0743c.f4693k;
                c0928ae.m922a("screenBase", this.f4717az.f4694l);
                c0928ae.m919b("screenBaseSize", this.f4717az.f4694l);
                c0928ae.m924a("u_resolution", core.f6134ck, core.f6135cl);
                c0928ae.m925a("u_offsetBy", 0.12f * core.f6256cW);
                this.f4790au.m908a(c0928ae);
                z2 = true;
            }
        }
        if (!z2) {
            c0930ag = m2355a(f);
        } else {
            c0930ag = this.f4790au;
            int m2152b2 = C0758f.m2152b(255, (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f));
            float f10 = this.f4791av - f;
            if (f10 < -0.01f || f10 > 0.01f || this.f4792aw != m2152b2) {
                this.f4791av = f;
                this.f4792aw = m2152b2;
                this.f4790au.m5908b(C0758f.m2152b((int) (f * 255.0f), (int) (f5 * 255.0f), (int) (f6 * 255.0f), (int) (f7 * 255.0f)));
            }
        }
        if (this.f4771ab != null) {
            C0930ag c0930ag2 = c0930ag;
            if (this.f4772ac != null) {
                c0930ag2 = this.f4772ac;
            }
            interfaceC1027y.mo181a(this.f4771ab, rectF.m5850d() + this.f4773ad, rectF.m5849e() + this.f4774ae, c0930ag2);
        }
        if (this.f4756M) {
            PointF m2124d2 = C0758f.m2124d(this.f4757N, this.f4758O, this.f4759P);
            interfaceC1027y.mo225a(rectF.f234a, rectF.f235b, m2124d2.f227a - core.f6144cv, m2124d2.f228b - core.f6145cw, this.f4717az.f4705w);
        } else if (z) {
            if (c0747g.f4828j != null) {
                interfaceC1027y.mo192a(c0747g.f4828j, rect, rectF, c0930ag);
            }
        } else {
            interfaceC1027y.mo192a(c0747g.f4827i, rect, rectF, c0930ag);
        }
        if (z3) {
            interfaceC1027y.mo134l();
            return true;
        }
        return true;
    }
}
