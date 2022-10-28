package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.p018b.C0394h;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
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
    public void m3678a(C0441f c0441f, int i) {
        m3677a(c0441f, i, false);
    }

    /* renamed from: a */
    public void m3677a(C0441f c0441f, int i, boolean z) {
        if (c0441f == null || !c0441f.m3596a()) {
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
            m3673c();
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
    public void m3681a() {
        if (this.f2721a != null) {
            m3674b(true);
        }
        this.f2725e = false;
        this.f2721a = null;
        this.f2730j = -1;
    }

    /* renamed from: b */
    public void m3675b() {
        if (this.f2721a != null) {
            if (!this.f2727g) {
                float f = this.f2721a.f2813i;
                if (f > 0.0f) {
                    this.f2727g = true;
                    m3673c();
                    this.f2728h = false;
                    this.f2730j = -1;
                    this.f2731k = 1.0f;
                    this.f2732l = f;
                    return;
                }
            }
            m3674b(true);
        }
        this.f2725e = false;
        this.f2721a = null;
        this.f2730j = -1;
    }

    /* renamed from: a */
    public void m3680a(float f) {
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
            m3675b();
        }
        this.f2729i = false;
        if (this.f2725e) {
            if (this.f2731k > 0.0f) {
                this.f2731k -= this.f2732l * f;
            } else if (this.f2727g) {
                m3675b();
                return;
            }
            if (!this.f2727g && this.f2721a != null) {
                if (this.f2721a.f2811g) {
                    if (this.f2722b > this.f2721a.f2818n) {
                        m3676a(false);
                        this.f2722b = this.f2721a.f2818n;
                        this.f2724d = -1.0f;
                    } else if (this.f2722b < 0.0f) {
                        this.f2722b = 0.0f;
                        this.f2724d = 1.0f;
                        if (this.f2726f) {
                            m3675b();
                            if (!this.f2727g) {
                                return;
                            }
                        }
                    }
                } else {
                    if (this.f2722b > this.f2721a.f2818n) {
                        if (this.f2726f) {
                            m3676a(false);
                            m3675b();
                            if (!this.f2727g) {
                                return;
                            }
                        } else {
                            m3676a(false);
                            this.f2722b = 0.0f;
                            this.f2724d = 1.0f;
                        }
                    }
                    if (this.f2722b < 0.0f && !this.f2726f && f2 < 0.0f) {
                        this.f2722b = this.f2721a.f2818n;
                    }
                }
            }
            boolean z = false;
            if (this.f2727g) {
                z = true;
            }
            m3674b(z);
        }
    }

    /* renamed from: c */
    void m3673c() {
        C1101m c1101m = this.f2721a.f2816l;
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
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2429p;
                } else {
                    this.f2734n[i] = 0.0f;
                    AbstractC0916l.m982b("setBaseBlendValues: Target leg out of range for: " + this.f2733m.mo1708r().mo3403i());
                }
            } else if (enumC0422d == EnumC0422d.legY) {
                if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2430q;
                }
            } else if (enumC0422d == EnumC0422d.legDir) {
                if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                    this.f2733m.f2885dR[c0415c.f2659b].f2431r = C0758f.m2143a(this.f2733m.f2885dR[c0415c.f2659b].f2431r, false);
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2431r;
                }
            } else if (enumC0422d == EnumC0422d.legHeight) {
                if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2417d;
                }
            } else if (enumC0422d == EnumC0422d.legAlpha) {
                if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                    this.f2734n[i] = this.f2733m.f2885dR[c0415c.f2659b].f2432s;
                }
            } else if (enumC0422d != EnumC0422d.event) {
                this.f2734n[i] = 0.0f;
                AbstractC0916l.m982b("Unsupported blend type:" + enumC0422d);
            }
        }
    }

    /* renamed from: a */
    void m3676a(boolean z) {
        C1101m c1101m = this.f2721a.f2816l;
        for (int i = 0; i < c1101m.size(); i++) {
            C0415c c0415c = (C0415c) c1101m.get(i);
            if (c0415c.f2658a == EnumC0422d.event) {
                c0415c.m3752a(this.f2733m, this.f2723c, this.f2722b, z);
            }
        }
    }

    /* renamed from: b */
    void m3674b(boolean z) {
        float m3749b;
        C1101m c1101m = this.f2721a.f2816l;
        for (int i = 0; i < c1101m.size(); i++) {
            C0415c c0415c = (C0415c) c1101m.get(i);
            EnumC0422d enumC0422d = c0415c.f2658a;
            if (enumC0422d != EnumC0422d.frame || this.f2733m.f6955ei || z) {
                if (z) {
                    m3749b = 0.0f;
                    if (enumC0422d == EnumC0422d.scale) {
                        m3749b = 1.0f;
                    } else if (enumC0422d == EnumC0422d.frame) {
                        m3749b = this.f2733m.f2863x.f2952X;
                    } else if (enumC0422d == EnumC0422d.legAlpha) {
                        m3749b = 1.0f;
                        C0384ay[] c0384ayArr = this.f2733m.f2863x.f2977aw;
                        if (c0384ayArr != null && c0415c.f2659b < c0384ayArr.length) {
                            m3749b = c0384ayArr[c0415c.f2659b].f2289r;
                        }
                    }
                } else {
                    m3749b = c0415c.m3749b(this.f2722b);
                }
                if (this.f2731k > 0.0f && enumC0422d != EnumC0422d.frame) {
                    m3749b = (m3749b * (1.0f - this.f2731k)) + (this.f2734n[i] * this.f2731k);
                }
                if (enumC0422d == EnumC0422d.frame) {
                    this.f2733m.f2840a = (int) m3749b;
                } else if (enumC0422d == EnumC0422d.scale) {
                    this.f2733m.f2842c = m3749b;
                } else if (enumC0422d == EnumC0422d.legX) {
                    if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                        C0394h c0394h = this.f2733m.f2885dR[c0415c.f2659b];
                        c0394h.f2429p = m3749b;
                        c0394h.f2424k = true;
                        c0394h.f2428o = true;
                    }
                } else if (enumC0422d == EnumC0422d.legY) {
                    if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                        C0394h c0394h2 = this.f2733m.f2885dR[c0415c.f2659b];
                        c0394h2.f2430q = m3749b;
                        c0394h2.f2424k = true;
                        c0394h2.f2428o = true;
                    }
                } else if (enumC0422d == EnumC0422d.legDir) {
                    if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                        this.f2733m.f2885dR[c0415c.f2659b].f2431r = m3749b;
                    }
                } else if (enumC0422d == EnumC0422d.legHeight) {
                    if (this.f2733m.f2885dR != null && c0415c.f2659b < this.f2733m.f2885dR.length) {
                        this.f2733m.f2885dR[c0415c.f2659b].f2417d = m3749b;
                    }
                } else if (enumC0422d == EnumC0422d.legAlpha) {
                    C0394h[] c0394hArr = this.f2733m.f2885dR;
                    if (c0394hArr != null && c0415c.f2659b < c0394hArr.length) {
                        c0394hArr[c0415c.f2659b].f2432s = m3749b;
                    }
                } else if (enumC0422d != EnumC0422d.turretX && enumC0422d == EnumC0422d.event) {
                    c0415c.m3752a(this.f2733m, this.f2723c, this.f2722b, z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m3679a(C0441f c0441f) {
        return this.f2725e && this.f2721a == c0441f;
    }
}
