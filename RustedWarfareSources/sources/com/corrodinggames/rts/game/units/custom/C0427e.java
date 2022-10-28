package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.p018b.C0394h;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e.class */
public final class C0427e {

    /* renamed from: a */
    public C0441f f2721a;

    /* renamed from: b */
    float f2722b;

    /* renamed from: c */
    float f2723c;

    /* renamed from: g */
    boolean f2727g;

    /* renamed from: h */
    boolean f2728h;

    /* renamed from: i */
    boolean f2729i;

    /* renamed from: j */
    int f2730j;

    /* renamed from: m */
    C0451j f2733m;

    /* renamed from: n */
    float[] f2734n;

    /* renamed from: d */
    float f2724d = 1.0f;

    /* renamed from: e */
    boolean f2725e = false;

    /* renamed from: f */
    boolean f2726f = false;

    /* renamed from: k */
    float f2731k = 0.0f;

    /* renamed from: l */
    float f2732l = 0.05f;

    public C0427e(C0451j c0451j) {
        this.f2733m = c0451j;
    }

    /* renamed from: a */
    public void m4066a(C0441f c0441f, int i) {
        m4065a(c0441f, i, false);
    }

    /* renamed from: a */
    public void m4065a(C0441f c0441f, int i, boolean z) {
        if (c0441f == null || !c0441f.m3984a()) {
            return;
        }
        if ((this.f2729i || (this.f2726f && this.f2725e)) && i <= this.f2730j && (!z || c0441f != this.f2721a)) {
            return;
        }
        this.f2729i = true;
        if (c0441f != this.f2721a || z || this.f2727g) {
            float f = 0.0f;
            if (this.f2721a != null && this.f2725e) {
                f = this.f2721a.f2813i;
            }
            this.f2721a = c0441f;
            this.f2730j = i;
            m4061c();
            this.f2726f = z;
            if (z) {
                this.f2728h = false;
            } else {
                this.f2728h = true;
            }
            this.f2722b = -1.0f;
            this.f2723c = -1.0f;
            this.f2724d = 1.0f;
            this.f2727g = false;
            float f2 = c0441f.f2812h;
            if (f > f2) {
                f2 = f;
            }
            if (f2 > 0.0f) {
                this.f2731k = 1.0f;
                this.f2732l = f2;
            } else {
                this.f2731k = 0.0f;
            }
        }
        this.f2725e = true;
    }

    /* renamed from: a */
    public void m4069a() {
        if (this.f2721a != null) {
            m4062b(true);
        }
        this.f2725e = false;
        this.f2721a = null;
        this.f2730j = -1;
    }

    /* renamed from: b */
    public void m4063b() {
        if (this.f2721a != null) {
            if (!this.f2727g) {
                float f = this.f2721a.f2813i;
                if (f > 0.0f) {
                    this.f2727g = true;
                    m4061c();
                    this.f2728h = false;
                    this.f2730j = -1;
                    this.f2731k = 1.0f;
                    this.f2732l = f;
                    return;
                }
            }
            m4062b(true);
        }
        this.f2725e = false;
        this.f2721a = null;
        this.f2730j = -1;
    }

    /* renamed from: a */
    public void m4068a(float f) {
        if (!this.f2725e) {
            return;
        }
        this.f2723c = this.f2722b;
        if (this.f2722b < 0.0f) {
            this.f2722b = 0.0f;
        }
        float f2 = this.f2724d;
        if (this.f2721a != null && this.f2721a.f2814j != null) {
            f2 *= this.f2721a.f2814j.readNumber(this.f2733m);
        }
        this.f2722b += f2 * f;
        if (this.f2728h && !this.f2729i) {
            m4063b();
        }
        this.f2729i = false;
        if (this.f2725e) {
            if (this.f2731k > 0.0f) {
                this.f2731k -= this.f2732l * f;
            } else if (this.f2727g) {
                m4063b();
                return;
            }
            if (!this.f2727g && this.f2721a != null) {
                if (this.f2721a.f2811g) {
                    if (this.f2722b > this.f2721a.f2816n) {
                        m4064a(false);
                        this.f2722b = this.f2721a.f2816n;
                        this.f2724d = -1.0f;
                    } else if (this.f2722b < 0.0f) {
                        this.f2722b = 0.0f;
                        this.f2724d = 1.0f;
                        if (this.f2726f) {
                            m4063b();
                            if (!this.f2727g) {
                                return;
                            }
                        }
                    }
                } else {
                    if (this.f2722b > this.f2721a.f2816n) {
                        if (this.f2726f) {
                            m4064a(false);
                            m4063b();
                            if (!this.f2727g) {
                                return;
                            }
                        } else {
                            m4064a(false);
                            this.f2722b = 0.0f;
                            this.f2724d = 1.0f;
                        }
                    }
                    if (this.f2722b < 0.0f && !this.f2726f && f2 < 0.0f) {
                        this.f2722b = this.f2721a.f2816n;
                    }
                }
            }
            boolean z = false;
            if (this.f2727g) {
                z = true;
            }
            m4062b(z);
        }
    }

    /* renamed from: c */
    void m4061c() {
        C1101m c1101m = this.f2721a.f2819l;
        if (this.f2734n == null || this.f2734n.length < c1101m.size()) {
            this.f2734n = new float[c1101m.size()];
        }
        for (int i = 0; i < c1101m.size(); i++) {
            C0415c c0415c = (C0415c) c1101m.get(i);
            EnumC0422d enumC0422d = c0415c.f2658a;
            if (enumC0422d == EnumC0422d.scale) {
                this.f2734n[i] = this.f2733m.f2842c;
            } else if (enumC0422d == EnumC0422d.frame) {
                this.f2734n[i] = -99.0f;
            } else if (enumC0422d == EnumC0422d.legX) {
                if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2424p;
                } else {
                    this.f2734n[i] = 0.0f;
                    Core.m998b("setBaseBlendValues: Target leg out of range for: " + this.f2733m.mo1758r().mo4474i());
                }
            } else if (enumC0422d == EnumC0422d.legY) {
                if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2425q;
                }
            } else if (enumC0422d == EnumC0422d.legDir) {
                if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                    this.f2733m.f2885dR[c0415c.f2659b].f2426r = C0758f.m2205a(this.f2733m.f2885dR[c0415c.f2659b].f2426r, false);
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2426r;
                }
            } else if (enumC0422d == EnumC0422d.legHeight) {
                if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2427d;
                }
            } else if (enumC0422d == EnumC0422d.legAlpha) {
                if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2432s;
                }
            } else if (enumC0422d != EnumC0422d.event) {
                this.f2734n[i] = 0.0f;
                Core.m998b("Unsupported blend type:" + enumC0422d);
            }
        }
    }

    /* renamed from: a */
    void m4064a(boolean z) {
        C1101m c1101m = this.f2721a.f2819l;
        for (int i = 0; i < c1101m.size(); i++) {
            C0415c c0415c = (C0415c) c1101m.get(i);
            if (c0415c.f2658a == EnumC0422d.event) {
                c0415c.m4140a(this.f2733m, this.f2723c, this.f2722b, z);
            }
        }
    }

    /* renamed from: b */
    void m4062b(boolean z) {
        float m4137b;
        C1101m c1101m = this.f2721a.f2819l;
        for (int i = 0; i < c1101m.size(); i++) {
            C0415c c0415c = (C0415c) c1101m.get(i);
            EnumC0422d enumC0422d = c0415c.f2658a;
            if (enumC0422d != EnumC0422d.frame || this.f2733m.f6955ei || z) {
                if (z) {
                    m4137b = 0.0f;
                    if (enumC0422d == EnumC0422d.scale) {
                        m4137b = 1.0f;
                    } else if (enumC0422d == EnumC0422d.frame) {
                        m4137b = this.f2733m.f2863x.f2929X;
                    } else if (enumC0422d == EnumC0422d.legAlpha) {
                        m4137b = 1.0f;
                        C0384ay[] c0384ayArr = this.f2733m.f2863x.f3223aw;
                        if (c0384ayArr != null && c0415c.f2659b < c0384ayArr.length) {
                            m4137b = c0384ayArr[c0415c.f2659b].f2301r;
                        }
                    }
                } else {
                    m4137b = c0415c.m4137b(this.f2722b);
                }
                if (this.f2731k > 0.0f && enumC0422d != EnumC0422d.frame) {
                    m4137b = (m4137b * (1.0f - this.f2731k)) + (this.f2734n[i] * this.f2731k);
                }
                if (enumC0422d == EnumC0422d.frame) {
                    this.f2733m.f2840a = (int) m4137b;
                } else if (enumC0422d == EnumC0422d.scale) {
                    this.f2733m.f2842c = m4137b;
                } else if (enumC0422d == EnumC0422d.legX) {
                    if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                        C0394h c0394h = this.f2733m.f2885dR[c0415c.f2659b];
                        c0394h.f2424p = m4137b;
                        c0394h.f2422k = true;
                        c0394h.f2431o = true;
                    }
                } else if (enumC0422d == EnumC0422d.legY) {
                    if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                        C0394h c0394h2 = this.f2733m.f2885dR[c0415c.f2659b];
                        c0394h2.f2425q = m4137b;
                        c0394h2.f2422k = true;
                        c0394h2.f2431o = true;
                    }
                } else if (enumC0422d == EnumC0422d.legDir) {
                    if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                        this.f2733m.f2885dR[c0415c.f2659b].f2426r = m4137b;
                    }
                } else if (enumC0422d == EnumC0422d.legHeight) {
                    if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                        this.f2733m.f2885dR[c0415c.f2659b].f2427d = m4137b;
                    }
                } else if (enumC0422d == EnumC0422d.legAlpha) {
                    C0394h[] c0394hArr = this.f2733m.f2885dR;
                    if (c0394hArr != null && c0415c.f2659b < c0394hArr.length) {
                        c0394hArr[c0415c.f2659b].f2432s = m4137b;
                    }
                } else if (enumC0422d != EnumC0422d.turretX && enumC0422d == EnumC0422d.event) {
                    c0415c.m4140a(this.f2733m, this.f2723c, this.f2722b, z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m4067a(C0441f c0441f) {
        return this.f2725e && this.f2721a == c0441f;
    }
}
