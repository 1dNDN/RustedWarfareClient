package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Menu;
import android.view.MenuItem;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0318c;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0232aa;
import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0438e;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0209d;
import com.corrodinggames.rts.game.units.p013a.C0212g;
import com.corrodinggames.rts.game.units.p013a.C0213h;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.game.units.p013a.C0230y;
import com.corrodinggames.rts.game.units.p013a.C0231z;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p028g.C0554e;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p043k.C0913a;
import com.corrodinggames.rts.gameFramework.p044l.C0924aa;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a.class */
public class C0760a extends AbstractC0726bk {

    /* renamed from: a */
    C0797f f4909a;

    /* renamed from: b */
    LoggerMaybe f4910b;

    /* renamed from: e */
    public boolean f4911e;

    /* renamed from: f */
    public float f4912f;

    /* renamed from: n */
    C0930ag f4913n;

    /* renamed from: o */
    C0930ag f4914o;

    /* renamed from: q */
    Paint f4915q;

    /* renamed from: r */
    Paint f4916r;

    /* renamed from: s */
    Paint f4917s;

    /* renamed from: t */
    Paint f4918t;

    /* renamed from: u */
    Paint f4919u;

    /* renamed from: v */
    Paint f4920v;

    /* renamed from: G */
    boolean f4921G;

    /* renamed from: H */
    float f4922H;

    /* renamed from: I */
    float f4923I;

    /* renamed from: J */
    float f4924J;

    /* renamed from: K */
    int f4925K;

    /* renamed from: L */
    boolean f4926L;

    /* renamed from: M */
    float f4927M;

    /* renamed from: N */
    float f4928N;

    /* renamed from: O */
    float f4929O;

    /* renamed from: P */
    float f4930P;

    /* renamed from: Q */
    float f4931Q;

    /* renamed from: R */
    float f4932R;

    /* renamed from: S */
    int f4933S;

    /* renamed from: T */
    float f4934T;

    /* renamed from: U */
    float f4935U;

    /* renamed from: ac */
    AbstractC0244am f4936ac;

    /* renamed from: ad */
    AbstractC0224s f4937ad;

    /* renamed from: ae */
    float f4938ae;

    /* renamed from: af */
    long f4939af;

    /* renamed from: ag */
    float f4940ag;

    /* renamed from: ah */
    float f4941ah;

    /* renamed from: ai */
    String f4942ai;

    /* renamed from: aj */
    String f4943aj;

    /* renamed from: ak */
    String f4944ak;

    /* renamed from: al */
    String f4945al;

    /* renamed from: am */
    String f4946am;

    /* renamed from: an */
    public String f4947an;

    /* renamed from: aq */
    public float f4948aq;

    /* renamed from: ar */
    public boolean f4949ar;

    /* renamed from: aE */
    float f4950aE;

    /* renamed from: aJ */
    int f4951aJ;

    /* renamed from: aa */
    static Paint f4952aa = new Paint();

    /* renamed from: ab */
    static PorterDuffColorFilter f4953ab = new PorterDuffColorFilter(Color.m5436a(200, 255, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aK */
    static String f4954aK = C0820a.m1687a("gui.rategame.text", new Object[0]);

    /* renamed from: aL */
    static String f4955aL = C0820a.m1687a("gui.rategame.yes", new Object[0]);

    /* renamed from: aM */
    static String f4956aM = C0820a.m1687a("gui.rategame.no", new Object[0]);

    /* renamed from: c */
    public boolean f4957c = false;

    /* renamed from: d */
    public boolean f4958d = false;

    /* renamed from: g */
    Paint f4959g = new Paint();

    /* renamed from: h */
    Paint f4960h = new Paint();

    /* renamed from: i */
    Paint f4961i = new Paint();

    /* renamed from: j */
    Paint f4962j = new Paint();

    /* renamed from: k */
    Paint f4963k = new Paint();

    /* renamed from: l */
    Paint f4964l = new Paint();

    /* renamed from: m */
    Paint f4965m = new Paint();

    /* renamed from: p */
    Paint f4966p = new Paint();

    /* renamed from: w */
    Rect f4967w = new Rect();

    /* renamed from: x */
    RectF f4968x = new RectF();

    /* renamed from: y */
    Rect f4969y = new Rect();

    /* renamed from: z */
    Rect f4970z = new Rect();

    /* renamed from: A */
    RectF f4971A = new RectF();

    /* renamed from: B */
    RectF f4972B = new RectF();

    /* renamed from: C */
    Rect f4973C = new Rect();

    /* renamed from: D */
    RectF f4974D = new RectF();

    /* renamed from: E */
    Rect f4975E = new Rect();

    /* renamed from: F */
    RectF f4976F = new RectF();

    /* renamed from: V */
    C0934e f4977V = null;

    /* renamed from: W */
    C0934e f4978W = null;

    /* renamed from: X */
    C0934e f4979X = null;

    /* renamed from: Y */
    C0934e f4980Y = null;

    /* renamed from: Z */
    C0934e f4981Z = null;

    /* renamed from: ao */
    String f4982ao = null;

    /* renamed from: ap */
    float f4983ap = 0.0f;

    /* renamed from: as */
    ArrayList f4984as = new ArrayList();

    /* renamed from: at */
    C0230y f4985at = new C0230y(false);

    /* renamed from: au */
    C0230y f4986au = new C0230y(true);

    /* renamed from: av */
    C0209d f4987av = new C0209d();

    /* renamed from: aw */
    ArrayList f4988aw = new ArrayList();

    /* renamed from: ax */
    ArrayList f4989ax = new ArrayList();

    /* renamed from: ay */
    C1101m f4990ay = new C1101m();

    /* renamed from: az */
    ArrayList f4991az = new ArrayList();

    /* renamed from: aA */
    RectF f4992aA = new RectF();

    /* renamed from: aB */
    HashMap f4993aB = new HashMap();

    /* renamed from: aC */
    ArrayList f4994aC = new ArrayList();

    /* renamed from: aD */
    Rect f4995aD = new Rect();

    /* renamed from: aF */
    ArrayList f4996aF = new ArrayList();

    /* renamed from: aG */
    boolean f4997aG = false;

    /* renamed from: aH */
    float f4998aH = 0.0f;

    /* renamed from: aI */
    float f4999aI = 0.0f;

    /* renamed from: aN */
    boolean f5000aN = false;

    /* renamed from: aO */
    float f5001aO = 0.0f;

    /* renamed from: aP */
    MenuC0810r f5002aP = new MenuC0810r();

    /* renamed from: aQ */
    ArrayList f5003aQ = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0760a(LoggerMaybe loggerMaybe, C0797f c0797f) {
        this.f4909a = c0797f;
        this.f4910b = loggerMaybe;
        m2001b();
    }

    /* renamed from: a */
    public void m2021a() {
        this.f4942ai = C0820a.m1687a("gui.unselectall", new Object[0]);
        this.f4943aj = C0820a.m1687a("gui.common.allyUnit", new Object[0]);
        this.f4944ak = C0820a.m1687a("gui.common.enemyUnit", new Object[0]);
        this.f4945al = C0820a.m1687a("gui.common.neutralUnit", new Object[0]);
        this.f4946am = C0820a.m1687a("gui.infoText.ownedBy", new Object[0]);
        this.f4947an = C0820a.m1687a("gui.infoText.unitCapReached", new Object[0]);
    }

    /* renamed from: b */
    public void m2001b() {
        m2021a();
        this.f4977V = this.f4910b.f6113bO.mo221a(C0067R.drawable.zoom_button);
        this.f4978W = this.f4910b.f6113bO.mo221a(C0067R.drawable.lock_icon_menu);
        this.f4979X = this.f4910b.f6113bO.mo221a(C0067R.drawable.pause);
        this.f4980Y = this.f4910b.f6113bO.mo221a(C0067R.drawable.replay_pause);
        this.f4981Z = this.f4910b.f6113bO.mo221a(C0067R.drawable.fast);
        f4952aa.m5420a(255, 30, 30, 30);
        f4952aa.m5417a(f4953ab);
        f4952aa.m5387d(true);
        this.f4915q = new Paint();
        this.f4915q.mo894a(true);
        this.f4915q.m5416a(Paint.Align.f196b);
        this.f4915q.m5420a(255, 0, 255, 0);
        this.f4910b.m1035a(this.f4915q, 34.0f);
        this.f4916r = new Paint();
        this.f4916r.mo894a(true);
        this.f4916r.m5416a(Paint.Align.f196b);
        this.f4916r.m5420a(255, 255, 0, 0);
        this.f4910b.m1035a(this.f4916r, 32.0f);
        this.f4917s = new Paint();
        this.f4917s.mo894a(true);
        this.f4917s.m5416a(Paint.Align.f195a);
        this.f4917s.m5420a(255, 0, 255, 0);
        this.f4910b.m1035a(this.f4917s, 16.0f);
        this.f4918t = new Paint();
        this.f4918t.mo894a(true);
        this.f4918t.m5416a(Paint.Align.f197c);
        this.f4918t.m5420a(255, 0, 255, 0);
        this.f4910b.m1035a(this.f4918t, 16.0f);
        this.f4919u = new Paint();
        this.f4919u.m5420a(255, 255, 255, 255);
        this.f4919u.m5416a(Paint.Align.f195a);
        this.f4919u.m5391c(true);
        this.f4919u.mo894a(true);
        this.f4920v = new Paint();
        this.f4920v.m5420a(255, 255, 255, 255);
        this.f4920v.m5416a(Paint.Align.f195a);
        this.f4920v.m5391c(true);
        this.f4920v.mo894a(true);
        this.f4913n = new C0930ag();
        this.f4913n.m5398b(Color.m5435a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 255, 255, 255));
        this.f4913n.m890o();
        this.f4914o = new C0930ag();
        this.f4914o.m5398b(Color.m5435a(133, 255, 255, 255));
        this.f4914o.m890o();
        this.f4994aC.clear();
        int i = 0;
        while (i < 10) {
            this.f4994aC.add(new C0784ac(this, i < 3));
            i++;
        }
        m1977l();
    }

    /* renamed from: s */
    private float m1970s() {
        float f = 4.6f / this.f4910b.f6257cX;
        if (f > 4.6f) {
            f = 4.6f;
        }
        return f;
    }

    /* renamed from: t */
    private float m1969t() {
        return m1968u() / this.f4910b.f6257cX;
    }

    /* renamed from: u */
    private float m1968u() {
        if (this.f4910b.f6153cE / this.f4910b.f6110bL.m4794i() < this.f4910b.f6155cG / this.f4910b.f6110bL.m4793j()) {
            return this.f4910b.f6153cE / this.f4910b.f6110bL.m4794i();
        }
        return this.f4910b.f6155cG / this.f4910b.f6110bL.m4793j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2020a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.f4910b.f6115bQ.showZoomButton) {
            float f6 = this.f4910b.f6132ci * 0.7f;
            int i = (int) (50.0f * f6);
            int i2 = (int) this.f4910b.f6137co;
            float m1078c = C0913a.m1078c();
            if (m1078c > 20.0f) {
                i = (int) (i + (m1078c - 20.0f));
            }
            if (this.f4921G) {
                this.f4967w.m5364a(i - 4, (int) (i2 - (50.0f * this.f4910b.f6132ci)), i + 4, (int) (i2 + (50.0f * this.f4910b.f6132ci)));
                this.f4961i.m5424a();
                this.f4961i.m5398b(Color.m5435a(255, 0, 0, 0));
                this.f4910b.f6113bO.mo162b(this.f4967w, this.f4961i);
            }
            float f7 = i2;
            if (this.f4910b.f6254cU > 1.0f) {
                f5 = f7 - (((this.f4910b.f6254cU - 1.0f) * 3.0f) * this.f4910b.f6132ci);
            } else {
                f5 = f7 + (((this.f4910b.f6254cU * (-20.0f)) + 20.0f + 1.0f) * this.f4910b.f6132ci);
            }
            float f8 = 48.0f * f6;
            float f9 = 54.0f * f6;
            float f10 = f8 / 2.0f;
            float f11 = f9 / 2.0f;
            if (f5 < f11) {
                f5 = f11;
            }
            if (f5 > this.f4910b.f6135cl - f11) {
                f5 = (int) (this.f4910b.f6135cl - f11);
            }
            this.f4967w.m5364a((int) (i - f10), (int) (f5 - f11), (int) (i + f10), (int) (f5 + f11));
            if (!this.f4921G) {
                f4952aa.m5420a(140, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA);
            } else {
                f4952aa.m5420a(255, 255, 255, 255);
            }
            this.f4910b.f6113bO.mo197a(this.f4977V, this.f4967w.f230a, this.f4967w.f231b, f4952aa, 0.0f, f6);
            boolean z = this.f4921G;
            if (!this.f4921G && this.f4909a.m1856a(this.f4967w.f230a, this.f4967w.f231b, this.f4967w.m5362b(), this.f4967w.m5358c(), EnumC0798g.zoomButton)) {
                this.f4921G = true;
                this.f4922H = this.f4909a.f5210t;
            }
            if (!this.f4909a.f5215D) {
                this.f4921G = false;
            }
            if (this.f4921G) {
                this.f4923I += f;
                this.f4909a.m1796d();
                float f12 = this.f4909a.f5210t - this.f4922H;
                if (f12 > 180.0f) {
                    f12 = 180.0f;
                }
                if (f12 < -180.0f) {
                    f12 = -180.0f;
                }
                float f13 = f12 * this.f4910b.f6254cU;
                if (f13 > 2.0f) {
                    this.f4910b.f6254cU -= (5.0E-4f * C0758f.m2085c(f13)) * f;
                    this.f4910b.f6255cV = false;
                    if (this.f4910b.f6254cU < m1969t()) {
                        this.f4910b.f6254cU = m1969t();
                        this.f4910b.f6255cV = true;
                    }
                } else if (f13 < -2.0f) {
                    this.f4910b.f6254cU += 5.0E-4f * C0758f.m2085c(f13) * f;
                    this.f4910b.f6255cV = false;
                    if (this.f4910b.f6254cU > m1970s()) {
                        this.f4910b.f6254cU = m1970s();
                        this.f4910b.f6255cV = true;
                    }
                }
            } else {
                if (!z || this.f4923I < 12.0f) {
                }
                this.f4923I = 0.0f;
            }
        }
        if (this.f4910b.f6115bQ.mouseSupport) {
            if (this.f4909a.m1865a(this.f4910b.m1011ae(), this.f4910b.m1010af()) && !this.f4909a.f5218G) {
                int m1008ah = this.f4910b.m1008ah();
                if (m1008ah != 0) {
                    this.f4924J += (m1008ah / 120.0f) * 0.18f;
                }
                if (this.f4924J > 1.0f) {
                    this.f4924J = 1.0f;
                }
                if (this.f4924J < -1.0f) {
                    this.f4924J = -1.0f;
                }
            }
            if (this.f4924J != 0.0f) {
                float f14 = 0.0032f * f;
                if (this.f4924J < 0.0f) {
                    f14 = -f14;
                }
                float f15 = f14 + (this.f4924J * 0.18f * f);
                float f16 = this.f4924J;
                this.f4924J = C0758f.m2159a(this.f4924J, C0758f.m2085c(f15));
                if (this.f4924J == 0.0f) {
                    f15 = f16;
                }
                float f17 = f15 * this.f4910b.f6254cU;
                this.f4910b.f6254cU += f17;
                this.f4910b.f6162cY = true;
                this.f4910b.f6163cZ = this.f4910b.m1011ae();
                this.f4910b.f6164da = this.f4910b.m1010af();
                if (f17 != 0.0f) {
                    this.f4910b.f6255cV = false;
                }
            }
        }
        if (this.f4910b.f6115bQ.gestureZoom && this.f4910b.m1014ab() && this.f4910b.m1012ad() >= 3) {
            this.f4935U = 20.0f;
        }
        if (this.f4935U < 10.0f) {
            this.f4926L = false;
        }
        if (this.f4935U > 0.0f) {
            this.f4935U = C0758f.m2159a(this.f4935U, f);
            boolean z2 = this.f4910b.m1014ab() && this.f4910b.m1012ad() >= 3;
            this.f4909a.f5230aO = 3.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            if (z2) {
                for (int i3 = 0; i3 < this.f4910b.m1012ad(); i3++) {
                    f18 += this.f4910b.m987b(i3);
                    f19 += this.f4910b.m979c(i3);
                }
                f2 = f18 / this.f4910b.m1012ad();
                f3 = f19 / this.f4910b.m1012ad();
                f4 = 0.0f;
                for (int i4 = 0; i4 < this.f4910b.m1012ad(); i4++) {
                    f4 += C0758f.m2105b(f2, f3, this.f4910b.m987b(i4), this.f4910b.m979c(i4));
                }
            } else {
                f2 = this.f4930P;
                f3 = this.f4931Q;
                f4 = this.f4932R;
            }
            if (this.f4926L && this.f4933S != this.f4910b.m1012ad()) {
                this.f4926L = false;
            }
            if (!this.f4926L && z2) {
                this.f4926L = true;
                this.f4927M = f2;
                this.f4928N = f3;
                this.f4929O = f4;
                this.f4934T = this.f4910b.f6254cU;
                this.f4930P = f2;
                this.f4931Q = f3;
                this.f4932R = f4;
                this.f4933S = this.f4910b.m1012ad();
            }
            if (z2) {
                float f20 = (this.f4931Q - f3) * 2.0f * this.f4910b.f6254cU;
                this.f4910b.f6254cU += (f20 / 250.0f) / this.f4910b.f6132ci;
                this.f4910b.f6255cV = false;
                float f21 = this.f4932R - f4;
                if (0 != 0) {
                    this.f4910b.f6254cU -= (f21 / 350.0f) / this.f4910b.f6132ci;
                    this.f4910b.f6255cV = false;
                }
                this.f4930P = f2;
                this.f4931Q = f3;
                this.f4932R = f4;
                this.f4933S = this.f4910b.m1012ad();
                for (int i5 = 0; i5 < this.f4910b.m1012ad(); i5++) {
                    this.f4910b.f6113bO.mo225a(f2, f3, this.f4910b.m987b(i5), this.f4910b.m979c(i5), this.f4909a.f5162aH);
                }
                this.f4910b.f6113bO.mo225a(f2, f3, f2, this.f4928N, this.f4909a.f5163aI);
                this.f4910b.f6113bO.mo223a(f2, f3, 6.0f, this.f4909a.f5162aH);
            }
        }
        if (this.f4910b.f6254cU > m1970s()) {
            this.f4910b.f6254cU = m1970s();
            this.f4910b.f6255cV = true;
        }
        if (this.f4910b.f6254cU < m1969t()) {
            this.f4910b.f6254cU = m1969t();
            this.f4910b.f6255cV = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2000b(float f) {
        this.f4911e = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 7;
        if (LoggerMaybe.m994av()) {
            i = 14;
        }
        if (this.f4910b.m1014ab() && this.f4909a.f5126W == null) {
            boolean m1798c = this.f4909a.m1798c(this.f4910b);
            int i2 = 1;
            if (this.f4910b.f6115bQ.mouseOrders == 2) {
                i2 = 2;
            }
            int m962f = this.f4910b.m962f(i2);
            if (m1798c || (this.f4910b.f6115bQ.mouseSupport && m962f != -1 && !this.f4909a.f5216E && !this.f4909a.f5217F)) {
                float m987b = this.f4910b.m987b(0);
                float m979c = this.f4910b.m979c(0);
                if (m962f != -1) {
                    m987b = this.f4910b.m987b(m962f);
                    m979c = this.f4910b.m979c(m962f);
                }
                if (!this.f4957c) {
                    z2 = true;
                    this.f4972B.f234a = (int) m987b;
                    this.f4972B.f235b = (int) m979c;
                }
                this.f4972B.f236c = (int) m987b;
                this.f4972B.f237d = (int) m979c;
                if (Math.abs(this.f4972B.f234a - this.f4972B.f236c) > i || Math.abs(this.f4972B.f235b - this.f4972B.f237d) > i) {
                    this.f4958d = true;
                }
                z = true;
            } else if (this.f4910b.m1012ad() == 2 && this.f4935U == 0.0f) {
                this.f4972B.f234a = (int) this.f4910b.m987b(0);
                this.f4972B.f235b = (int) this.f4910b.m979c(0);
                this.f4972B.f236c = (int) this.f4910b.m987b(1);
                this.f4972B.f237d = (int) this.f4910b.m979c(1);
                this.f4958d = false;
                z = true;
            }
            if (z) {
                this.f4912f += f;
                if (this.f4912f < 18.0f) {
                    z3 = true;
                }
            } else {
                this.f4912f = 0.0f;
            }
            if (z) {
                this.f4957c = true;
                if (Math.abs(this.f4972B.f234a - this.f4972B.f236c) > i || Math.abs(this.f4972B.f235b - this.f4972B.f237d) > i) {
                    this.f4973C.f233d = (int) this.f4972B.f237d;
                    this.f4973C.f231b = (int) this.f4972B.f235b;
                    this.f4973C.f230a = (int) this.f4972B.f234a;
                    this.f4973C.f232c = (int) this.f4972B.f236c;
                    C0758f.m2144a(this.f4973C);
                    this.f4959g.m5398b(Color.m5435a(255, 0, 255, 0));
                    this.f4959g.m5413a(Paint.Style.f220b);
                    this.f4959g.m5423a(1.0f);
                    this.f4910b.f6113bO.mo162b(this.f4973C, this.f4959g);
                    this.f4911e = true;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (this.f4957c && !z) {
            if (z3 && this.f4910b.m1012ad() == 3) {
                z5 = true;
            } else {
                z4 = true;
            }
        }
        if (z5) {
            this.f4958d = false;
            this.f4957c = false;
        }
        if ((z && !z3) || z4) {
            if (z2) {
                Iterator it = AbstractC1120w.f6962eo.iterator();
                while (it.hasNext()) {
                    AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                    if (abstractC1120w instanceof AbstractC0318c) {
                        AbstractC0318c abstractC0318c = (AbstractC0318c) abstractC1120w;
                        abstractC0318c.f1646cG = abstractC0318c.f1644cE;
                    }
                }
            }
            if (z4) {
                this.f4958d = false;
                this.f4957c = false;
            }
            this.f4974D.m5349a(this.f4972B);
            C0758f.m2141a(this.f4974D);
            if (Math.abs(this.f4974D.f234a - this.f4974D.f236c) > i || Math.abs(this.f4974D.f235b - this.f4974D.f237d) > i) {
                this.f4974D.f237d /= this.f4910b.f6256cW;
                this.f4974D.f235b /= this.f4910b.f6256cW;
                this.f4974D.f234a /= this.f4910b.f6256cW;
                this.f4974D.f236c /= this.f4910b.f6256cW;
                this.f4974D.m5352a(this.f4910b.f6142ct, this.f4910b.f6143cu);
                this.f4909a.f5230aO = 4.0f;
                this.f4909a.f5231aP = 40.0f;
                this.f4909a.f5226O = false;
                boolean m1826a = this.f4909a.m1826a(this.f4910b);
                boolean m1807b = this.f4909a.m1807b(this.f4910b);
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = false;
                if (this.f4910b.f6115bQ.smartSelection_v2) {
                    Iterator it2 = AbstractC1120w.f6962eo.iterator();
                    while (it2.hasNext()) {
                        AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                        if (abstractC1120w2 instanceof AbstractC0623y) {
                            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w2;
                            if (m2006a(abstractC0623y) && (!m1826a || !abstractC0623y.f1646cG)) {
                                if (!abstractC0623y.m4402bI()) {
                                    z6 = false;
                                }
                                if (abstractC0623y.m2879aS() && abstractC0623y.mo2979l()) {
                                    z7 = false;
                                }
                            }
                        }
                    }
                }
                if (m1807b) {
                    z6 = true;
                }
                Iterator it3 = AbstractC1120w.f6962eo.iterator();
                while (it3.hasNext()) {
                    AbstractC1120w abstractC1120w3 = (AbstractC1120w) it3.next();
                    if (abstractC1120w3 instanceof AbstractC0318c) {
                        AbstractC0318c abstractC0318c2 = (AbstractC0318c) abstractC1120w3;
                        boolean z9 = false;
                        if (m2006a(abstractC0318c2)) {
                            z9 = true;
                            if (!z6 && abstractC0318c2.m4402bI()) {
                                z9 = false;
                            }
                            if (!z7 && abstractC0318c2.m4412ak() && !abstractC0318c2.mo2979l()) {
                                z9 = false;
                            }
                        }
                        if (m1807b) {
                            if (z9) {
                                z9 = !abstractC0318c2.f1646cG;
                            } else if (abstractC0318c2.f1646cG) {
                                z9 = true;
                            }
                        } else if (m1826a && abstractC0318c2.f1646cG) {
                            z9 = true;
                        }
                        if (z9) {
                            this.f4909a.m1778j(abstractC0318c2);
                            if (z4 && abstractC0318c2.f1645cF + 900 < this.f4910b.f6104bA && ((!m1826a && !m1807b) || !abstractC0318c2.f1646cG)) {
                                z8 = true;
                            }
                        } else {
                            this.f4909a.m1774l(abstractC0318c2);
                        }
                    }
                }
                if (z8) {
                    Iterator it4 = AbstractC1120w.f6962eo.iterator();
                    while (it4.hasNext()) {
                        AbstractC1120w abstractC1120w4 = (AbstractC1120w) it4.next();
                        if (abstractC1120w4 instanceof AbstractC0318c) {
                            ((AbstractC0318c) abstractC1120w4).f1645cF = this.f4910b.f6104bA;
                        }
                    }
                }
                this.f4909a.m1874D();
            }
        }
    }

    /* renamed from: a */
    private boolean m2006a(AbstractC0318c abstractC0318c) {
        if (!abstractC0318c.f1607bT && abstractC0318c.f1651cL == null) {
            float f = abstractC0318c.f6957el;
            float f2 = abstractC0318c.f6958em - abstractC0318c.f6959en;
            if (f2 <= 0.0f) {
                f2 += abstractC0318c.f6959en;
            }
            if (this.f4974D.m5345b(f, f2)) {
                if ((this.f4909a.m1772m(abstractC0318c) || this.f4910b.f6099bs.m4619b()) && !abstractC0318c.mo1713t()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m2002a(String str, int i) {
        this.f4982ao = str;
        this.f4983ap = i;
    }

    /* renamed from: b */
    public void m1997b(String str, int i) {
        if (this.f4983ap <= 0.0f || str.equals(this.f4982ao)) {
            this.f4982ao = str;
            this.f4983ap = i;
        }
    }

    /* renamed from: a */
    public void m2003a(String str) {
        if (this.f4983ap > 0.0f && str.equals(this.f4982ao)) {
            this.f4983ap = 0.0f;
        }
    }

    /* renamed from: c */
    public void m1995c(float f) {
        if (this.f4983ap > 0.0f && this.f4982ao != null) {
            this.f4983ap = C0758f.m2159a(this.f4983ap, f);
            this.f4910b.f6113bO.mo180a(this.f4982ao, this.f4910b.f6136cn, this.f4910b.f6137co, this.f4909a.f5152ax, this.f4909a.f5157aC, 8.0f);
        }
    }

    /* renamed from: a */
    public static boolean m2014a(AbstractC0224s abstractC0224s) {
        return LoggerMaybe.m1072A().f6228ar && abstractC0224s.mo4486k_();
    }

    /* renamed from: c */
    public void m1996c() {
        this.f4925K = 0;
    }

    /* renamed from: a */
    public C0639ad m2013a(AbstractC0224s abstractC0224s, int i, ArrayList arrayList) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!LoggerMaybe.m995au()) {
            return null;
        }
        if (abstractC0224s.mo4508M() != null) {
            return abstractC0224s.mo4508M();
        }
        if ((abstractC0224s instanceof C0219n) || (abstractC0224s instanceof C0209d)) {
            return null;
        }
        if (abstractC0224s.mo3020f() == EnumC0225t.f1466b) {
            return m1072A.f6118bT.f4127T;
        }
        if (abstractC0224s.mo3022e() == EnumC0226u.f1487m) {
            return m1072A.f6118bT.f4124Q;
        }
        if (abstractC0224s.mo3022e() == EnumC0226u.f1486l) {
            return m1072A.f6118bT.f4123P;
        }
        if (abstractC0224s.mo3022e() == EnumC0226u.f1479e) {
            return m1072A.f6118bT.f4125R;
        }
        if (abstractC0224s.mo3020f() == EnumC0225t.f1467c) {
            int i2 = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s2 = (AbstractC0224s) it.next();
                if (abstractC0224s2 != abstractC0224s && abstractC0224s2.mo3020f() == EnumC0225t.f1467c && this.f4909a.m1810b(abstractC0224s2)) {
                    i2++;
                }
            }
            if (i2 == 0) {
                return m1072A.f6118bT.f4126S;
            }
        }
        EnumC0225t mo3020f = abstractC0224s.mo3020f();
        if (mo3020f == EnumC0225t.f1471g || mo3020f == EnumC0225t.f1472h || mo3020f == EnumC0225t.f1473i) {
            return null;
        }
        C0639ad c0639ad = null;
        C0639ad[] c0639adArr = m1072A.f6118bT.f4140ag;
        if (this.f4925K < c0639adArr.length) {
            c0639ad = c0639adArr[this.f4925K];
            this.f4925K++;
        }
        return c0639ad;
    }

    /* renamed from: d */
    public ArrayList m1992d() {
        this.f4988aw.clear();
        AbstractC0244am[] m498a = this.f4909a.f5261bL.m498a();
        int size = this.f4909a.f5261bL.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0303as mo5649r = m498a[i].mo5649r();
            if (!this.f4988aw.contains(mo5649r)) {
                this.f4988aw.add(mo5649r);
            }
        }
        return this.f4988aw;
    }

    /* renamed from: a */
    public ArrayList m2009a(AbstractC0244am abstractC0244am, ArrayList arrayList) {
        C1101m m4314e;
        ArrayList mo3068N;
        int i = 0;
        this.f4984as.clear();
        int m1767p = this.f4909a.m1767p();
        if (m1767p == 0) {
            if (this.f4910b.f6115bQ.showChatAndPingShortcuts && this.f4910b.m1061L()) {
                this.f4984as.add(0, this.f4909a.f5203l);
                this.f4984as.add(0, this.f4909a.f5204m);
            }
            return this.f4984as;
        }
        if (C0797f.f5193bA && abstractC0244am != null && !(abstractC0244am instanceof C0555h)) {
            this.f4984as.add(this.f4985at);
            this.f4984as.add(this.f4986au);
        }
        if (abstractC0244am == null) {
        }
        if (abstractC0244am != null) {
            i = this.f4984as.size();
            if (abstractC0244am.f1644cE) {
                if (this.f4909a.m1772m(abstractC0244am)) {
                    ArrayList mo3068N2 = abstractC0244am.mo3068N();
                    if (mo3068N2 != null) {
                        this.f4984as.addAll(mo3068N2);
                    }
                } else {
                    ArrayList mo3068N3 = abstractC0244am.mo3068N();
                    if (mo3068N3 != null) {
                        this.f4984as.addAll(mo3068N3);
                    }
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) arrayList.get(i2);
                if (this.f4909a.m1772m(abstractC0244am2) && ((abstractC0244am2.mo5649r() != abstractC0244am.mo5649r() || abstractC0244am2.mo3273V() != abstractC0244am.mo3273V()) && (mo3068N = abstractC0244am2.mo3068N()) != null)) {
                    Iterator it = mo3068N.iterator();
                    while (it.hasNext()) {
                        AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                        boolean z = false;
                        Iterator it2 = this.f4984as.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0224s) it2.next()).m4507N().equals(abstractC0224s.m4507N())) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f4984as.add(abstractC0224s);
                        }
                    }
                }
            }
        }
        boolean z2 = false;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0244am abstractC0244am3 = (AbstractC0244am) arrayList.get(i3);
            if (this.f4909a.m1772m(abstractC0244am3) && (abstractC0244am3 instanceof AbstractC0623y) && !((AbstractC0623y) abstractC0244am3).m2879aS()) {
                z2 = true;
            }
        }
        AbstractC0244am m1988e = m1988e();
        if (!z2 && m1988e != null && this.f4909a.m1772m(m1988e)) {
            this.f4984as.add(i, this.f4909a.f5199h);
            this.f4984as.add(i, this.f4909a.f5200i);
        }
        boolean z3 = false;
        if (C0797f.f5193bA && (this.f4910b.f6115bQ.showSelectedUnitsList || m1767p == 1)) {
            z3 = true;
        }
        if (LoggerMaybe.m997as() && m1767p > 0) {
            z3 = true;
        }
        if (z3 && !(abstractC0244am instanceof C0555h)) {
            if (m1767p == 1 && m1988e != null && (m4314e = m1988e.m4314e(true)) != null && m4314e.size() > 0) {
                for (int i4 = 0; i4 < m4314e.f6894a; i4++) {
                    AbstractC0224s abstractC0224s2 = (AbstractC0224s) m4314e.get(i4);
                    if (abstractC0224s2 instanceof C0212g) {
                        C0212g c0212g = (C0212g) abstractC0224s2;
                        Iterator it3 = this.f4990ay.iterator();
                        while (it3.hasNext()) {
                            C0212g c0212g2 = (C0212g) it3.next();
                            if (c0212g2.m4524a(c0212g)) {
                                m4314e.set(i4, c0212g2);
                            }
                        }
                    }
                }
                this.f4990ay.clear();
                Iterator it4 = m4314e.iterator();
                while (it4.hasNext()) {
                    AbstractC0224s abstractC0224s3 = (AbstractC0224s) it4.next();
                    if (abstractC0224s3 instanceof C0212g) {
                        this.f4990ay.add((C0212g) abstractC0224s3);
                    }
                    this.f4984as.add(abstractC0224s3);
                }
            }
            ArrayList m1992d = m1992d();
            this.f4989ax.clear();
            Iterator it5 = m1992d.iterator();
            while (it5.hasNext()) {
                C0231z mo4258d = ((InterfaceC0303as) it5.next()).mo4258d();
                mo4258d.m4478K();
                this.f4989ax.add(mo4258d);
            }
            Collections.sort(this.f4989ax);
            if (C0797f.f5193bA) {
                Collections.reverse(this.f4989ax);
            }
            Iterator it6 = this.f4989ax.iterator();
            while (it6.hasNext()) {
                C0231z c0231z = (C0231z) it6.next();
                if (C0797f.f5193bA) {
                    this.f4984as.add(0, c0231z);
                } else {
                    this.f4984as.add(c0231z);
                }
            }
        }
        return this.f4984as;
    }

    /* renamed from: e */
    AbstractC0244am m1988e() {
        if (this.f4909a.f5261bL.size() > 0) {
            return this.f4909a.f5261bL.mo497a(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC0244am m1985f() {
        AbstractC0244am abstractC0244am = null;
        if (this.f4909a.f5169aR > 0) {
            AbstractC0244am[] m498a = this.f4909a.f5261bL.m498a();
            int i = 0;
            int size = this.f4909a.f5261bL.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                AbstractC0244am abstractC0244am2 = m498a[i];
                if (abstractC0244am2.f1644cE) {
                    if (abstractC0244am == null) {
                        abstractC0244am = abstractC0244am2;
                    } else if (!m2010a(abstractC0244am, abstractC0244am2)) {
                        abstractC0244am = null;
                        break;
                    } else if (abstractC0244am.mo3273V() > abstractC0244am2.mo3273V()) {
                        abstractC0244am = abstractC0244am2;
                    }
                }
                i++;
            }
        }
        return abstractC0244am;
    }

    /* renamed from: a */
    public static boolean m2010a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        InterfaceC0303as mo5649r = abstractC0244am.mo5649r();
        InterfaceC0303as mo5649r2 = abstractC0244am2.mo5649r();
        if (mo5649r == mo5649r2) {
            return true;
        }
        if ((mo5649r instanceof C0453l) && (mo5649r2 instanceof C0453l)) {
            C0453l c0453l = (C0453l) mo5649r;
            C0453l c0453l2 = (C0453l) mo5649r2;
            if (c0453l.f3268fJ.contains(mo5649r2)) {
                return true;
            }
            if (c0453l.f3172fM != null && C0448g.m3753a(c0453l.f3172fM, c0453l2.mo4240x())) {
                return true;
            }
            if (c0453l2.f3172fM != null && C0448g.m3753a(c0453l2.f3172fM, c0453l.mo4240x())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    ArrayList m1983g() {
        this.f4991az.clear();
        AbstractC0244am[] m498a = this.f4909a.f5261bL.m498a();
        int size = this.f4909a.f5261bL.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                this.f4991az.add((AbstractC0623y) abstractC0244am);
            }
        }
        return this.f4991az;
    }

    /* renamed from: h */
    float m1981h() {
        return C0758f.m2106b((this.f4910b.f6135cl / 14.0f) / this.f4910b.f6132ci, 25.0f * this.f4910b.f6132ci, 40.0f * this.f4910b.f6132ci);
    }

    /* renamed from: c */
    private boolean m1994c(AbstractC0224s abstractC0224s) {
        if (abstractC0224s.mo4475s()) {
            return true;
        }
        if (abstractC0224s instanceof C0212g) {
            return this.f4909a.m1772m(((C0212g) abstractC0224s).f1433b);
        }
        ArrayList m1983g = m1983g();
        C0208c m4507N = abstractC0224s.m4507N();
        Iterator it = m1983g.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y.m4427a(m4507N) != null && this.f4909a.m1772m(abstractC0623y)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2012a(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        C0213h c0213h = null;
        if (abstractC0224s instanceof C0213h) {
            c0213h = (C0213h) abstractC0224s;
        }
        if (c0213h != null && c0213h.f1440d == C0797f.f5196bP) {
            return c0213h.f1441e;
        }
        boolean m1998b = m1998b(abstractC0224s, arrayList);
        if (c0213h != null) {
            c0213h.f1440d = C0797f.f5196bP;
            c0213h.f1441e = m1998b;
        }
        return m1998b;
    }

    /* renamed from: b */
    private boolean m1998b(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        if (abstractC0224s.mo4475s()) {
            return true;
        }
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            if (!c0212g.mo4114r(c0212g.f1433b)) {
                return false;
            }
            if (this.f4909a.m1772m(c0212g.f1433b) || c0212g.mo4128a(c0212g.f1433b, this.f4910b.f6099bs)) {
                return true;
            }
            return false;
        }
        C0208c m4507N = abstractC0224s.m4507N();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0623y) it.next();
            AbstractC0224s a = abstractC0244am.m4427a(m4507N);
            if (a != null && a.mo4114r(abstractC0244am) && (this.f4909a.m1772m(abstractC0244am) || a.mo4128a(abstractC0244am, this.f4910b.f6099bs))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m1993c(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        if (abstractC0224s.mo4475s()) {
            return true;
        }
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            if (c0212g.mo3027a((AbstractC0244am) c0212g.f1433b, true)) {
                return true;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0623y) it.next();
            AbstractC0224s a = abstractC0244am.m4427a(abstractC0224s.m4507N());
            if (a != null && a.mo3027a(abstractC0244am, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private float m1989d(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        int i = 0;
        float f = -1.0f;
        if (abstractC0224s.mo4476l_()) {
            return -1.0f;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0623y) it.next();
            AbstractC0224s a = abstractC0244am.m4427a(abstractC0224s.m4507N());
            if (a != null) {
                float mo4484p = a.mo4484p(abstractC0244am);
                if (mo4484p > f) {
                    f = mo4484p;
                    i++;
                }
            }
        }
        return f;
    }

    /* renamed from: d */
    private C0554e m1990d(AbstractC0224s abstractC0224s) {
        float f = -1.0f;
        C0554e c0554e = null;
        if (abstractC0224s.mo4476l_()) {
            return null;
        }
        if (abstractC0224s instanceof C0212g) {
            C0554e m3126b = C0554e.m3126b(((C0212g) abstractC0224s).f1433b, abstractC0224s.m4507N());
            if (m3126b != null) {
                if (-1.0f < m3126b.m3142a()) {
                    f = m3126b.m3142a();
                    c0554e = m3126b;
                }
            } else {
                return null;
            }
        }
        Iterator it = this.f4909a.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.m4427a(abstractC0224s.m4507N()) == null) {
                    continue;
                } else {
                    C0554e m3126b2 = C0554e.m3126b(abstractC0623y, abstractC0224s.m4507N());
                    if (m3126b2 != null) {
                        if (f < m3126b2.m3142a()) {
                            f = m3126b2.m3142a();
                            c0554e = m3126b2;
                        }
                    } else {
                        return null;
                    }
                }
            }
        }
        if (c0554e == null) {
            return null;
        }
        return c0554e;
    }

    /* renamed from: e */
    private float m1986e(AbstractC0224s abstractC0224s) {
        C0554e m1990d = m1990d(abstractC0224s);
        if (m1990d == null) {
            return 0.0f;
        }
        return m1990d.m3125c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m1999b(AbstractC0224s abstractC0224s) {
        C0554e m1990d = m1990d(abstractC0224s);
        if (m1990d == null) {
            return 0.0f;
        }
        return m1990d.m3123d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m1991d(float f) {
        ArrayList m2009a;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        C0930ag c0930ag;
        Rect rect;
        Rect rect2;
        int m5435a;
        int m1008ah;
        this.f4949ar = false;
        int i = 1;
        if (C0797f.f5194bB) {
            i = 2;
        }
        int i2 = 0;
        boolean z = false;
        C0794c.m1888a(f);
        ArrayList m1983g = m1983g();
        AbstractC0244am m1985f = m1985f();
        ArrayList arrayList = null;
        if (this.f4909a.f5126W != null) {
            arrayList = this.f4909a.f5126W.mo4492q(m1985f);
        }
        if (arrayList != null) {
            m2009a = arrayList;
        } else {
            m2009a = m2009a(m1985f, m1983g);
        }
        if (m1985f == null && m2009a.size() > 0) {
            m1985f = m1988e();
            if (m1985f == null && C0453l.f2903b != null) {
                m1985f = AbstractC0244am.m4383c(C0453l.f2903b);
            }
        }
        this.f4909a.f5206o = false;
        if (m2009a.contains(this.f4909a.f5199h)) {
            this.f4909a.f5206o = true;
        }
        if (m1985f == null) {
            m1985f = m1988e();
        }
        boolean z2 = true;
        if (m1985f == null) {
            this.f4939af = -1L;
        }
        if (m1985f != null && m2009a.size() > 0) {
            ArrayList arrayList2 = m2009a;
            float f8 = 2.0f;
            float m1981h = m1981h();
            float f9 = 2.0f;
            float f10 = m1981h + 2.0f;
            boolean z3 = false;
            if (!C0797f.f5187bD) {
                f2 = this.f4910b.f6121bW.m1733b() + 2;
                f3 = this.f4910b.f6134ck - this.f4910b.f6121bW.f5282c;
                f4 = this.f4910b.f6121bW.f5282c;
            } else {
                f2 = this.f4910b.f6121bW.f5281b;
                f3 = this.f4910b.f6121bW.f5282c;
                f4 = this.f4910b.f6121bW.f5282c;
                z3 = true;
            }
            if (C0797f.f5193bA) {
                m1981h += 15.0f * this.f4910b.f6132ci;
                float f11 = f10 + (15.0f * this.f4910b.f6132ci);
                f8 = 5.0f;
                if (LoggerMaybe.m996at()) {
                    f8 = 2.0f;
                }
                f10 = f11 + 2.0f;
                f9 = 2.0f + 2.0f;
                f2 += 3.0f;
            }
            if (!C0797f.f5192a) {
                boolean z4 = true;
                if (this.f4909a.f5111c != null && this.f4909a.f5169aR == 1 && this.f4909a.f5111c.f1644cE) {
                    z4 = false;
                }
                if (z4) {
                    f2 = f2 + m1980i() + 2.0f;
                }
            }
            int i3 = 0;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                if (m2012a(abstractC0224s, m1983g)) {
                    i3++;
                    float mo3053l = f10 * abstractC0224s.mo3053l();
                    int i4 = i;
                    if (abstractC0224s.mo3052m() > 0) {
                        i4 = abstractC0224s.mo3052m();
                    }
                    float f15 = f4 / i4;
                    boolean z5 = false;
                    if ((f13 + f15) - 0.1f >= f4) {
                        z5 = true;
                    }
                    if (!z5 && f12 > 0.0f && mo3053l + 0.1f < f12) {
                        z5 = true;
                    }
                    if (z5) {
                        f14 += f12;
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    if (f12 < mo3053l) {
                        f12 = mo3053l;
                    }
                    f13 += f15;
                }
            }
            if (f13 > 0.0f) {
                f14 += f12;
            }
            float f16 = f2 + f14;
            float f17 = f2;
            float f18 = f2 + 1.0f;
            if (this.f4910b.f6115bQ.showUnitGroups) {
                f5 = this.f4910b.f6155cG - (34.0f * this.f4910b.f6132ci);
            } else {
                f5 = this.f4910b.f6155cG;
            }
            this.f4939af = m1985f.f6951ee;
            float f19 = f18 - ((int) m1985f.f1577bq);
            float f20 = 0.0f;
            float f21 = 1.0f + (m1981h * 0.25f);
            boolean z6 = f16 - m1985f.f1577bq > f5 + f21;
            boolean z7 = m1985f.f1577bq > f21;
            this.f4949ar = z6 || z7;
            if (this.f4910b.f6115bQ.mouseSupport && !this.f4909a.m1865a(this.f4910b.m1011ae(), this.f4910b.m1010af()) && (m1008ah = this.f4910b.m1008ah()) != 0) {
                f20 = -(m1008ah / 120.0f);
            }
            float f22 = 0.0f;
            if (z6) {
                this.f4967w.f230a = (int) (f3 + 2.0f);
                this.f4967w.f232c = (int) ((f3 + f4) - 2.0f);
                this.f4967w.f231b = (int) (f5 - (m1981h * 0.4f));
                this.f4967w.f233d = (int) (this.f4967w.f231b + (m1981h * 0.4f));
                if (this.f4909a.m1851a(this.f4967w.f230a, this.f4967w.f231b, this.f4967w.m5362b(), this.f4967w.m5358c(), "\\/", EnumC0798g.none, false, Color.m5435a(80, 100, 150, 100), this.f4909a.f5151aw) && this.f4909a.m1869I()) {
                    f22 = 0.0f + (3.0f * f10);
                    this.f4909a.f5226O = false;
                }
                if (f20 > 0.0f) {
                    this.f4948aq = (float) (this.f4948aq + (0.5d * f10));
                }
                f5 -= (f10 * 0.4f) + 2.0f;
            }
            if (z7) {
                this.f4967w.f230a = (int) (f3 + 2.0f);
                this.f4967w.f232c = (int) ((f3 + f4) - 2.0f);
                this.f4967w.f231b = (int) f17;
                this.f4967w.f233d = (int) (this.f4967w.f231b + (m1981h * 0.4f));
                if (this.f4909a.m1851a(this.f4967w.f230a, this.f4967w.f231b, this.f4967w.m5362b(), this.f4967w.m5358c(), "/\\", EnumC0798g.none, false, Color.m5435a(80, 100, 150, 100), this.f4909a.f5151aw) && this.f4909a.m1869I()) {
                    f22 -= 3.0f * f10;
                    this.f4909a.f5226O = false;
                }
                if (f20 < 0.0f) {
                    this.f4948aq = (float) (this.f4948aq - (0.5d * f10));
                }
                f17 += (f10 * 0.4f) + 2.0f;
            }
            this.f4910b.f6113bO.mo137i();
            this.f4992aA.m5351a(0.0f, f17 - 1.0f, this.f4910b.f6134ck, f5 + 1.0f);
            this.f4910b.f6113bO.mo206a(this.f4992aA);
            if (LoggerMaybe.m996at()) {
                if (this.f4939af != m1985f.f6951ee) {
                    this.f4940ag = 0.0f;
                    this.f4941ah = m1985f.f1577bq;
                } else if (this.f4948aq != 0.0f) {
                    this.f4940ag = this.f4948aq;
                } else {
                    if (!this.f4909a.f5215D) {
                        this.f4948aq += this.f4940ag * f;
                    }
                    this.f4940ag = C0758f.m2159a(this.f4940ag, f);
                }
            }
            m1985f.f1577bq += this.f4948aq + f22;
            this.f4948aq = 0.0f;
            int i5 = (int) (f16 - f5);
            if (i5 > 0) {
                if (m1985f.f1577bq > i5 + 0.0f) {
                    m1985f.f1577bq = i5 + 0.0f;
                }
                if (m1985f.f1577bq < 0.0f - 0.0f) {
                    m1985f.f1577bq = 0.0f - 0.0f;
                }
            } else {
                m1985f.f1577bq = 0.0f;
            }
            int i6 = -1;
            float f23 = 0.0f;
            float f24 = 0.0f;
            float f25 = 0.0f;
            m1996c();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AbstractC0224s abstractC0224s2 = (AbstractC0224s) it2.next();
                if (m2012a(abstractC0224s2, m1983g)) {
                    i2++;
                    boolean m1993c = m1993c(abstractC0224s2, m1983g);
                    i6++;
                    float mo3053l2 = m1981h * abstractC0224s2.mo3053l();
                    int i7 = i;
                    if (abstractC0224s2.mo3052m() > 0) {
                        i7 = abstractC0224s2.mo3052m();
                    }
                    float f26 = f4 / i7;
                    if (!z3) {
                        f6 = mo3053l2;
                        f7 = f26;
                    } else {
                        f6 = f26;
                        f7 = mo3053l2;
                    }
                    boolean z8 = false;
                    if ((f25 + f7) - 0.1f > f4) {
                        z8 = true;
                    }
                    if (!z8 && f24 > 0.0f && f6 + 0.1f < f24) {
                        z8 = true;
                    }
                    if (z8) {
                        f23 += f24 + f9;
                        f24 = 0.0f;
                        f25 = 0.0f;
                    }
                    if (f24 < f6) {
                        f24 = f6;
                    }
                    if (!z3) {
                        this.f4967w.f230a = (int) (f3 + f8);
                        this.f4967w.f232c = (int) ((this.f4967w.f230a + f26) - (f8 * 2.0f));
                        this.f4967w.f231b = (int) (f23 + f19);
                        this.f4967w.f233d = (int) (this.f4967w.f231b + mo3053l2);
                        this.f4967w.m5365a((int) f25, 0);
                    } else {
                        this.f4967w.f230a = (int) (f3 + f8 + f23);
                        this.f4967w.f232c = (int) ((this.f4967w.f230a + f26) - (f8 * 2.0f));
                        this.f4967w.f231b = (int) f19;
                        this.f4967w.f233d = (int) (this.f4967w.f231b + mo3053l2);
                        this.f4967w.m5365a(0, (int) f25);
                    }
                    boolean z9 = true;
                    this.f4968x.m5350a(this.f4967w);
                    if (!this.f4968x.m5343b(this.f4992aA)) {
                        z9 = false;
                    }
                    f25 += f7;
                    EnumC0225t mo3020f = abstractC0224s2.mo3020f();
                    boolean z10 = false;
                    z10 = (mo3020f == EnumC0225t.f1471g || mo3020f == EnumC0225t.f1472h || mo3020f == EnumC0225t.f1473i) ? true : true;
                    boolean m2014a = m2014a(abstractC0224s2);
                    boolean mo4479G = abstractC0224s2.mo4479G();
                    Paint paint = this.f4962j;
                    boolean z11 = m1993c;
                    if (mo3020f == EnumC0225t.f1473i) {
                        z11 = true;
                    }
                    if (z11) {
                        paint.m5398b(Color.m5435a(70, 100, 100, 100));
                    } else {
                        paint.m5398b(Color.m5435a(50, 170, 100, 100));
                    }
                    if (m2014a) {
                        paint.m5398b(Color.m5435a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100));
                    }
                    boolean z12 = false;
                    boolean z13 = false;
                    if (this.f4936ac == m1985f && this.f4937ad == abstractC0224s2) {
                        z12 = true;
                    }
                    if (this.f4909a.f5126W == abstractC0224s2) {
                        z12 = true;
                        z13 = true;
                    }
                    if (z12) {
                        paint.m5398b(Color.m5435a(80, 100, 100, 200));
                    }
                    if (z13) {
                        paint.m5398b(Color.m5435a(80, 100, 200, 100));
                    }
                    if (mo4479G) {
                        paint.m5393c((int) (paint.m5384f() * 0.7f));
                        c0930ag = this.f4914o;
                    } else {
                        c0930ag = this.f4913n;
                    }
                    float f27 = 0.0f;
                    if (z9) {
                        f27 = C0794c.m1885b(m1985f, abstractC0224s2, false);
                        if (abstractC0224s2.mo3020f() != EnumC0225t.f1472h) {
                            boolean m1846a = this.f4909a.m1846a(abstractC0224s2);
                            float f28 = 0.0f;
                            if (m1846a) {
                                f28 = C0758f.m2085c(C0758f.m2040i((((float) (LoggerMaybe.m1052U() % 1000)) / 1000.0f) * 180.0f));
                            }
                            if (f27 != 0.0f) {
                                float m2106b = C0758f.m2106b((C0758f.m2085c(f27) * 0.7f) - 0.3f, 0.0f, 1.0f);
                                if (f27 > 0.0f) {
                                    m5435a = Color.m5435a(110, 210, 210, 210);
                                } else {
                                    m5435a = Color.m5435a(110, 210, 110, 110);
                                }
                                int m2150a = C0758f.m2150a(m5435a, paint.m5386e(), m2106b);
                                paint = this.f4961i;
                                paint.m5398b(m2150a);
                            }
                            this.f4909a.m1847a(this.f4967w, paint, c0930ag);
                            float m1989d = m1989d(abstractC0224s2, m1983g);
                            if (m1989d >= 0.0f) {
                                this.f4964l.m5420a(80, 0, 0, 100);
                                this.f4975E.m5363a(this.f4967w);
                                this.f4975E.f232c = (int) (rect2.f232c - ((1.0f - m1989d) * this.f4975E.m5362b()));
                                this.f4910b.f6113bO.mo162b(this.f4975E, this.f4964l);
                                this.f4965m.m5420a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                this.f4910b.f6113bO.mo225a(this.f4975E.f232c, this.f4975E.f231b, this.f4975E.f232c, this.f4975E.f233d, this.f4964l);
                            } else {
                                float m1986e = m1986e(abstractC0224s2);
                                if (m1986e > 0.0f) {
                                    this.f4964l.m5420a(80, 100, 0, 0);
                                    this.f4975E.m5363a(this.f4967w);
                                    this.f4975E.f232c = (int) (rect.f232c - ((1.0f - m1986e) * this.f4975E.m5362b()));
                                    this.f4910b.f6113bO.mo162b(this.f4975E, this.f4964l);
                                    this.f4965m.m5420a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                    this.f4910b.f6113bO.mo225a(this.f4975E.f232c, this.f4975E.f231b, this.f4975E.f232c, this.f4975E.f233d, this.f4964l);
                                }
                            }
                            int m5435a2 = Color.m5435a(255, 0, 0, 0);
                            if (C0797f.f5193bA) {
                                m5435a2 = Color.m5435a(100, 0, 0, 0);
                                if (mo4479G) {
                                    m5435a2 = Color.m5435a(50, 155, 155, 155);
                                }
                            }
                            boolean z14 = false;
                            if (m1846a) {
                                z14 = true;
                                m5435a2 = Color.m5435a((int) (100.0f + (150.0f * f28)), 255, 255, 255);
                            }
                            this.f4909a.m1848a(this.f4967w, m5435a2, z14);
                        }
                    }
                    C0639ad m2013a = m2013a(abstractC0224s2, i6, arrayList2);
                    if (m2013a != null && z9) {
                        this.f4910b.f6113bO.mo181a(m2013a.m2675c(), this.f4967w.f230a + 3, this.f4967w.f231b + this.f4910b.f6113bO.mo179a("A", this.f4909a.f5148at) + 1.0f, this.f4909a.f5148at);
                    }
                    boolean z15 = false;
                    InterfaceC0303as mo5648i = abstractC0224s2.mo5648i();
                    C0934e mo3098j = abstractC0224s2.mo3098j();
                    AbstractC0244am mo4121i = abstractC0224s2.mo4121i(m1985f);
                    if (mo4121i != null) {
                        mo5648i = mo4121i.mo5649r();
                    }
                    if (mo3098j == null && mo5648i != null) {
                        mo3098j = mo5648i.mo4238z();
                    }
                    if (mo3098j != null) {
                        Rect mo4490v = abstractC0224s2.mo4490v();
                        if (mo4490v == null) {
                            mo4490v = this.f4975E;
                            mo4490v.m5364a(0, 0, mo3098j.mo386m(), mo3098j.mo387l());
                        }
                        float m5358c = (this.f4967w.m5358c() * 0.7f) / mo4490v.m5358c();
                        int m5357d = (int) (this.f4967w.m5357d() - ((mo4490v.m5362b() * 0.5f) * m5358c));
                        int m5356e = (int) (this.f4967w.m5356e() - ((mo4490v.m5358c() * 0.5f) * m5358c));
                        this.f4966p.m5420a(100, 255, 255, 255);
                        RectF rectF = this.f4976F;
                        rectF.m5351a(m5357d, m5356e, m5357d + (mo4490v.m5362b() * m5358c), m5356e + (mo4490v.m5358c() * m5358c));
                        this.f4910b.f6113bO.mo192a(mo3098j, mo4490v, rectF, this.f4966p);
                        z15 = true;
                    } else if (mo5648i != null) {
                        float m5357d2 = this.f4967w.m5357d();
                        float m5356e2 = this.f4967w.m5356e();
                        if (f27 > 0.5d) {
                            m5356e2 += 1.0f;
                        }
                        if (f27 < -0.5d) {
                            m5356e2 -= 1.0f;
                        }
                        float m5358c2 = this.f4967w.m5358c() * 0.7f;
                        float m5358c3 = this.f4967w.m5358c() * 0.95f;
                        if (C0797f.f5193bA) {
                            m5358c2 = this.f4967w.m5358c() * 0.4f;
                            m5358c3 = this.f4967w.m5358c() * 0.85f;
                        }
                        this.f4971A.m5350a(this.f4967w);
                        if (this.f4971A.m5343b(this.f4992aA)) {
                            this.f4910b.f6113bO.mo137i();
                            this.f4910b.f6113bO.mo206a(this.f4971A);
                            EnumC0249ar.m4283a(mo5648i, m5357d2, m5356e2, 0.0f, 0.0f, m1985f.f1609bV, m5358c2, m5358c3, false, false, abstractC0224s2.mo4485t(), mo4121i);
                            if (mo4121i != null) {
                                float m4415a_ = mo4121i.m4415a_();
                                float m4394bU = mo4121i.m4394bU();
                                if (m4394bU != -1.0f && abstractC0224s2.mo4112t(m1985f)) {
                                    int m2100b = C0758f.m2100b(200, 0, 0, 150);
                                    int m2100b2 = C0758f.m2100b(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
                                    Paint m473a = C1117y.m473a(m2100b, Paint.Style.f219a);
                                    Paint m473a2 = C1117y.m473a(m2100b2, Paint.Style.f220b);
                                    int m5346b = ((int) (this.f4971A.m5346b() / 3.0f)) - 3;
                                    int i8 = m5346b * 2;
                                    this.f4976F.m5351a(m5357d2 - m5346b, m5356e2 + 0, (m5357d2 - m5346b) + (i8 * m4394bU), m5356e2 + 0 + 3);
                                    this.f4910b.f6113bO.mo205a(this.f4976F, m473a);
                                    this.f4976F.m5351a(m5357d2 - m5346b, m5356e2 + 0, (m5357d2 - m5346b) + i8, m5356e2 + 0 + 3);
                                    this.f4910b.f6113bO.mo205a(this.f4976F, m473a2);
                                } else if (m4415a_ != -1.0f && abstractC0224s2.mo4113s(m1985f)) {
                                    int m2100b3 = C0758f.m2100b(200, 0, 150, 0);
                                    int m2100b4 = C0758f.m2100b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                                    Paint m473a3 = C1117y.m473a(m2100b3, Paint.Style.f219a);
                                    Paint m473a4 = C1117y.m473a(m2100b4, Paint.Style.f220b);
                                    int m5346b2 = ((int) (this.f4971A.m5346b() / 3.0f)) - 3;
                                    int i9 = m5346b2 * 2;
                                    this.f4976F.m5351a(m5357d2 - m5346b2, m5356e2 + 0, (m5357d2 - m5346b2) + (i9 * m4415a_), m5356e2 + 0 + 3);
                                    this.f4910b.f6113bO.mo205a(this.f4976F, m473a3);
                                    this.f4976F.m5351a(m5357d2 - m5346b2, m5356e2 + 0, (m5357d2 - m5346b2) + i9, m5356e2 + 0 + 3);
                                    this.f4910b.f6113bO.mo205a(this.f4976F, m473a4);
                                }
                            }
                            this.f4910b.f6113bO.mo136j();
                        }
                        z15 = true;
                    }
                    C0934e mo4122h = abstractC0224s2.mo4122h(m1985f);
                    if (mo4122h != null) {
                        Rect mo4490v2 = abstractC0224s2.mo4490v();
                        if (mo4490v2 == null) {
                            mo4490v2 = this.f4975E;
                            mo4490v2.m5364a(0, 0, mo4122h.mo386m(), mo4122h.mo387l());
                        }
                        float m5358c4 = (this.f4967w.m5358c() * 0.7f) / mo4490v2.m5358c();
                        int m5357d3 = (int) (this.f4967w.m5357d() - ((mo4490v2.m5362b() * 0.5f) * m5358c4));
                        int m5356e3 = (int) (this.f4967w.m5356e() - ((mo4490v2.m5358c() * 0.5f) * m5358c4));
                        this.f4966p.m5398b(abstractC0224s2.mo4133J());
                        RectF rectF2 = this.f4976F;
                        rectF2.m5351a(m5357d3, m5356e3, m5357d3 + (mo4490v2.m5362b() * m5358c4), m5356e3 + (mo4490v2.m5358c() * m5358c4));
                        this.f4910b.f6113bO.mo192a(mo4122h, mo4490v2, rectF2, this.f4966p);
                        z15 = true;
                    }
                    if (z9) {
                        String mo3054d = abstractC0224s2.mo3054d();
                        if (m2014a) {
                            this.f4910b.f6113bO.mo198a(this.f4978W, this.f4967w.f230a + 25, this.f4967w.m5354g(), (Paint) null);
                        }
                        if (this.f4910b.f6113bO.mo157b(mo3054d, this.f4909a.f5151aw) > this.f4967w.m5362b() - 2) {
                            if (this.f4910b.f6113bO.mo157b(mo3054d, this.f4909a.f5150av) > this.f4967w.m5362b() - 2) {
                                this.f4961i.m5412a(this.f4909a.f5149au);
                            } else {
                                this.f4961i.m5412a(this.f4909a.f5150av);
                            }
                        } else {
                            this.f4961i.m5412a(this.f4909a.f5151aw);
                        }
                        if (!z11) {
                            this.f4961i.m5398b(Color.m5435a(255, 0, 100, 0));
                        }
                        if (mo3020f == EnumC0225t.f1466b) {
                            this.f4961i.m5420a(255, 255, 255, 255);
                        } else if (mo3020f == EnumC0225t.f1467c || mo3020f == EnumC0225t.f1470f) {
                            if (!z11) {
                                this.f4961i.m5420a(255, 19, 101, 94);
                            } else {
                                this.f4961i.m5420a(255, 39, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2);
                            }
                        } else if (mo3020f == EnumC0225t.f1468d) {
                            InterfaceC0303as mo5648i2 = abstractC0224s2.mo5648i();
                            if (mo5648i2 != null && mo5648i2.mo4254g() > 1) {
                                if (!z11) {
                                    this.f4961i.m5420a(255, 117, 120, 15);
                                } else {
                                    this.f4961i.m5420a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                                }
                            }
                        } else if (z10) {
                            this.f4961i.m5420a(155, 255, 255, 255);
                        }
                        int mo179a = this.f4910b.f6113bO.mo179a(mo3054d, this.f4961i);
                        float m5354g = this.f4967w.m5354g() + (mo179a / 2);
                        if (z10) {
                            m5354g = this.f4967w.m5354g();
                        }
                        if (z15 && !mo3054d.contains("\n")) {
                            if (z10) {
                                m5354g = (this.f4967w.f233d - (mo179a / 2)) - 1;
                            } else {
                                m5354g = this.f4967w.f233d - 6;
                            }
                        }
                        if (z10) {
                            C0924aa.m923a(mo3054d, this.f4967w.m5355f(), m5354g, this.f4961i);
                        } else {
                            this.f4910b.f6113bO.mo181a(mo3054d, this.f4967w.m5355f(), m5354g, this.f4961i);
                        }
                    }
                    boolean z16 = false;
                    boolean z17 = false;
                    boolean z18 = false;
                    if (m2013a != null && m2013a.m2684a()) {
                        z16 = true;
                        z18 = true;
                    }
                    this.f4969y.m5363a(this.f4967w);
                    if (LoggerMaybe.m996at()) {
                        C0758f.m2098b(this.f4969y, 2.0f);
                    }
                    this.f4909a.m1863a(this.f4969y.f230a, this.f4969y.f231b, this.f4969y.m5362b(), this.f4969y.m5358c());
                    if (!this.f4958d && this.f4969y.m5361b((int) this.f4909a.f5211u, (int) this.f4909a.f5212v) && this.f4992aA.m5345b((int) this.f4909a.f5211u, (int) this.f4909a.f5212v)) {
                        z = true;
                        if (LoggerMaybe.m995au()) {
                            z17 = true;
                        }
                        if ((this.f4909a.f5226O || this.f4909a.f5215D) && this.f4909a.f5226O && this.f4909a.m1869I()) {
                            this.f4909a.f5226O = false;
                            z16 = true;
                        }
                    }
                    if (LoggerMaybe.m995au() && this.f4909a.f5126W == null) {
                        if (z17) {
                            this.f4936ac = m1985f;
                            this.f4937ad = abstractC0224s2;
                            this.f4938ae = f23 + f19;
                        } else if (AbstractC0224s.m4504a(this.f4937ad, abstractC0224s2)) {
                            this.f4936ac = null;
                            this.f4937ad = null;
                        }
                    }
                    boolean z19 = false;
                    if (z16 && !z18 && this.f4910b.f6115bQ.mouseSupport && this.f4910b.m965e(2)) {
                        z19 = true;
                    }
                    if (z16) {
                        C0797f.m1868J();
                        if (abstractC0224s2.mo3099c(m1985f, z19)) {
                            z16 = false;
                        }
                        if (this.f4910b.f6126cb.m2411h()) {
                            z16 = false;
                        }
                        if (!m1994c(abstractC0224s2)) {
                            z16 = false;
                        }
                    }
                    if (z16) {
                        if (abstractC0224s2.mo3022e() == EnumC0226u.f1475a || abstractC0224s2.mo3022e() == EnumC0226u.f1477c) {
                            this.f4909a.f5126W = null;
                            boolean z20 = false;
                            if (z18) {
                                z20 = true;
                            } else if (!abstractC0224s2.mo4111u()) {
                                z20 = true;
                            } else {
                                if (abstractC0224s2.mo4119k(m1985f)) {
                                    z20 = true;
                                } else if (this.f4936ac == m1985f && AbstractC0224s.m4504a(this.f4937ad, abstractC0224s2)) {
                                    z20 = true;
                                }
                                this.f4936ac = m1985f;
                                this.f4937ad = abstractC0224s2;
                                this.f4938ae = f23 + f19;
                            }
                            if (z20) {
                                int i10 = 1;
                                if (abstractC0224s2.mo3019g()) {
                                    if (this.f4909a.m1826a(this.f4910b)) {
                                        i10 = 5;
                                    }
                                    if (this.f4909a.m1807b(this.f4910b)) {
                                        i10 = 10;
                                    }
                                }
                                boolean z21 = false;
                                if (!z18) {
                                    boolean z22 = false;
                                    if (m1985f != null && abstractC0224s2.mo3024b(m1985f, false) != -1) {
                                        z22 = true;
                                    }
                                    if (z19 && z22) {
                                        z21 = true;
                                    }
                                }
                                if (m2014a(abstractC0224s2)) {
                                    this.f4910b.f6111bM.m2716b(C0631e.f4046l, 0.8f);
                                } else if (!m1993c && !z21) {
                                    this.f4910b.f6111bM.m2716b(C0631e.f4046l, 0.8f);
                                } else {
                                    boolean mo3019g = abstractC0224s2.mo3019g();
                                    if (mo3019g && !z21 && this.f4910b.f6099bs.m4551v() <= this.f4910b.f6099bs.m4552u()) {
                                        this.f4909a.m1806b(this.f4947an);
                                    }
                                    if (mo3019g) {
                                        if (!z21) {
                                            this.f4910b.f6111bM.m2716b(C0631e.f4042h, 0.5f);
                                        } else {
                                            this.f4910b.f6111bM.m2716b(C0631e.f4043i, 0.5f);
                                        }
                                    } else {
                                        this.f4910b.f6111bM.m2716b(C0631e.f4041g, 0.8f);
                                    }
                                    C0794c.m1886a(m1985f, abstractC0224s2, z21, false);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        C0749e m1757w = this.f4909a.m1757w();
                                        if (!abstractC0224s2.mo4134I()) {
                                            this.f4909a.m1831a(m1757w, abstractC0224s2);
                                        } else {
                                            this.f4909a.m1830a(m1757w, abstractC0224s2, z21);
                                        }
                                        if (z21) {
                                            m1757w.f4857g = true;
                                        }
                                        m1757w.m2272a(abstractC0224s2.mo4488z());
                                        if (!z21) {
                                            this.f4909a.m1844a(abstractC0224s2, (PointF) null, (AbstractC0244am) null, m1757w);
                                        }
                                    }
                                }
                            }
                        } else if (abstractC0224s2.mo3022e() == EnumC0226u.f1487m || abstractC0224s2.mo3022e() == EnumC0226u.f1486l || abstractC0224s2.mo3022e() == EnumC0226u.f1484j) {
                            if (z19) {
                                if (abstractC0224s2 != null && abstractC0224s2.equals(this.f4909a.f5126W)) {
                                    this.f4909a.m1777k();
                                }
                            } else if (!m1993c) {
                                this.f4910b.f6111bM.m2716b(C0631e.f4046l, 0.8f);
                            } else {
                                C0794c.m1886a(m1985f, abstractC0224s2, false, false);
                                this.f4936ac = null;
                                this.f4937ad = null;
                                this.f4909a.f5126W = abstractC0224s2;
                            }
                        } else if (abstractC0224s2.mo3022e() == EnumC0226u.f1478d || abstractC0224s2.mo3022e() == EnumC0226u.f1479e || abstractC0224s2.mo3022e() == EnumC0226u.f1480f || abstractC0224s2.mo3022e() == EnumC0226u.f1481g) {
                            boolean z23 = false;
                            boolean z24 = false;
                            if (abstractC0224s2.mo3022e() == EnumC0226u.f1481g) {
                                z24 = true;
                            }
                            if (z19 && z24) {
                                z23 = true;
                            }
                            if (!z23) {
                                LoggerMaybe.LogDebug2("Clicked button: actionActive: " + m1993c);
                                if (!m1993c) {
                                    this.f4910b.f6111bM.m2716b(C0631e.f4046l, 0.8f);
                                } else {
                                    C0794c.m1886a(m1985f, abstractC0224s2, false, false);
                                    this.f4936ac = null;
                                    this.f4937ad = null;
                                    this.f4909a.f5126W = abstractC0224s2;
                                }
                            } else {
                                C0749e m1757w2 = this.f4909a.m1757w();
                                if (!abstractC0224s2.mo4134I()) {
                                    this.f4909a.m1831a(m1757w2, abstractC0224s2);
                                } else {
                                    this.f4909a.m1830a(m1757w2, abstractC0224s2, z23);
                                }
                                m1757w2.f4857g = true;
                                m1757w2.m2272a(abstractC0224s2.mo4488z());
                            }
                        } else if (abstractC0224s2.mo3022e() == EnumC0226u.f1476b) {
                            if (m2014a(abstractC0224s2)) {
                                this.f4910b.f6111bM.m2716b(C0631e.f4046l, 0.8f);
                            } else if (!m1993c) {
                                this.f4910b.f6111bM.m2716b(C0631e.f4046l, 0.8f);
                            } else {
                                this.f4910b.f6111bM.m2716b(C0631e.f4041g, 0.8f);
                            }
                            C0794c.m1886a(m1985f, abstractC0224s2, false, false);
                            this.f4936ac = null;
                            this.f4937ad = null;
                            if (this.f4909a.f5126W == null) {
                                this.f4909a.f5132ac = false;
                            }
                            this.f4909a.f5125U = m1985f;
                            this.f4909a.f5126W = abstractC0224s2;
                            this.f4909a.f5129Z = 0.0f;
                            this.f4909a.f5140ak = -99.0f;
                            this.f4909a.f5141al = -99.0f;
                            if (!this.f4909a.f5128Y) {
                                this.f4909a.f5130aa = this.f4910b.f6156cH * this.f4910b.f6256cW;
                                this.f4909a.f5131ab = this.f4910b.f6157cI * this.f4910b.f6256cW;
                            }
                            this.f4909a.f5128Y = true;
                            this.f4910b.f6110bL.m4805e();
                        } else if (abstractC0224s2.mo3022e() == EnumC0226u.f1485k) {
                            C0794c.m1886a(m1985f, abstractC0224s2, false, false);
                            abstractC0224s2.mo4497c(m1985f);
                        } else if (abstractC0224s2.mo3022e() == EnumC0226u.f1483i) {
                            if (abstractC0224s2.mo4480C()) {
                                this.f4936ac = m1985f;
                                this.f4937ad = abstractC0224s2;
                                this.f4938ae = f23 + f19;
                                this.f4909a.f5126W = null;
                            }
                        } else {
                            throw new RuntimeException("unknown gui action:" + abstractC0224s2.mo3022e());
                        }
                    }
                    if (this.f4937ad == abstractC0224s2) {
                        z2 = m1993c;
                    }
                }
            }
            this.f4910b.f6113bO.mo136j();
            this.f4992aA.m5338f();
        }
        if (m1985f != null && m1985f == this.f4936ac) {
            if (this.f4937ad != null) {
                boolean z25 = true;
                if (LoggerMaybe.m995au()) {
                    z25 = false;
                }
                boolean z26 = false;
                if (this.f4937ad.mo4111u()) {
                    z26 = true;
                }
                if (LoggerMaybe.m995au() && this.f4937ad.mo3018h()) {
                    z26 = true;
                }
                if (z26) {
                    boolean z27 = true;
                    if (!z2) {
                        z27 = false;
                    }
                    if (this.f4909a.m1841a(this.f4937ad, z25, this.f4936ac, !z27, true, this.f4938ae, false)) {
                        this.f4936ac = null;
                    }
                }
            }
        } else {
            this.f4936ac = null;
        }
        if (LoggerMaybe.m995au() && !z) {
            this.f4936ac = null;
            this.f4937ad = null;
        }
        return i2;
    }

    /* renamed from: i */
    float m1980i() {
        return (float) (C0758f.m2106b((this.f4910b.f6135cl / 14.0f) / this.f4910b.f6132ci, 25.0f * this.f4910b.f6132ci, 40.0f * this.f4910b.f6132ci) * 0.9d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2019a(float f, int i) {
        boolean z = true;
        if (i == 0) {
            z = true;
        }
        if (C0797f.f5192a) {
            z = false;
        }
        if (this.f4909a.f5169aR > 0) {
            if (this.f4909a.f5111c != null && this.f4909a.f5169aR == 1 && this.f4909a.f5111c.f1644cE) {
                z = false;
            }
            if (z) {
                if (this.f4909a.m1811b((int) ((this.f4910b.f6134ck - this.f4910b.f6121bW.f5282c) + 2.0f), this.f4910b.f6121bW.m1733b() + 2, (int) (this.f4910b.f6121bW.f5282c - 4.0f), (int) m1980i(), this.f4942ai, EnumC0798g.unselectAllButton, false, Color.m5435a(140, 100, 100, 100)) && !this.f4909a.f5225N) {
                    this.f4909a.m1796d();
                    this.f4909a.m1777k();
                    this.f4909a.m1756x();
                }
            }
            AbstractC0197n abstractC0197n = null;
            boolean z2 = false;
            this.f4993aB.clear();
            AbstractC0244am abstractC0244am = null;
            AbstractC0244am[] m498a = this.f4909a.f5261bL.m498a();
            int size = this.f4909a.f5261bL.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0244am abstractC0244am2 = m498a[i2];
                if (abstractC0244am2.f1644cE) {
                    abstractC0244am = abstractC0244am2;
                    if (this.f4909a.m1772m(abstractC0244am2)) {
                        InterfaceC0303as mo5649r = abstractC0244am2.mo5649r();
                        Integer num = (Integer) this.f4993aB.get(mo5649r);
                        if (num == null) {
                            this.f4993aB.put(mo5649r, 1);
                        } else {
                            this.f4993aB.put(mo5649r, Integer.valueOf(num.intValue() + 1));
                        }
                        z2 = true;
                    } else {
                        abstractC0197n = abstractC0244am2.f1609bV;
                    }
                }
            }
            boolean z3 = this.f4910b.f6100bv;
            if (abstractC0197n != null && this.f4910b.f6099bs != null && abstractC0197n.m4615b(this.f4910b.f6099bs)) {
                z3 = true;
            }
            int m1981h = (int) m1981h();
            int i3 = m1981h + 2;
            int i4 = (int) (10.0f * this.f4910b.f6132ci);
            float m1733b = this.f4910b.f6121bW.m1733b() + m1981h + 30;
            float f2 = (this.f4910b.f6134ck - this.f4910b.f6138cp) + i4;
            float f3 = m1733b + 5.0f;
            if (abstractC0244am != null) {
                f3 = f3 + i3 + (i3 * i);
                if (this.f4909a.f5206o) {
                    f3 -= (2 * i3) * 0.4f;
                }
            }
            this.f4967w.m5364a((int) f2, (int) f3, (int) ((f2 + this.f4910b.f6138cp) - (i4 * 2)), (int) (f3 + m1981h));
            boolean z4 = false;
            if (!C0797f.f5195bC) {
                if (i < 3 && !z2 && abstractC0197n != null) {
                    Paint paint = this.f4909a.f5154az;
                    if (this.f4910b.f6099bs.m4587d(abstractC0197n)) {
                        paint = this.f4909a.f5155aA;
                    }
                    this.f4909a.m1820a(m2015a(abstractC0197n), this.f4967w, paint, paint);
                    z4 = true;
                }
                if (this.f4909a.m1767p() == 1 && abstractC0244am != null) {
                    if (abstractC0244am.m4344cp() <= 3 || (abstractC0197n != null && !z3)) {
                        String m2008a = m2008a(abstractC0244am, false);
                        if (z4) {
                            m2008a = "\n" + ("\n" + ("\n" + m2008a));
                        }
                        Paint paint2 = this.f4961i;
                        paint2.m5424a();
                        paint2.m5398b(Color.m5435a(50, 100, 100, 100));
                        this.f4909a.m1820a(m2008a, this.f4967w, this.f4909a.f5156aB, this.f4909a.f5156aB);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public String m2015a(AbstractC0197n abstractC0197n) {
        String str = VariableScope.nullOrMissingString;
        boolean z = false;
        if (this.f4910b.f6099bs.m4619b()) {
            z = true;
        } else if (this.f4910b.f6099bs.m4587d(abstractC0197n)) {
            str = str + this.f4943aj;
        } else if (this.f4910b.f6099bs.m4599c(abstractC0197n)) {
            str = str + this.f4944ak;
        } else {
            z = true;
        }
        if (z) {
            if (abstractC0197n == AbstractC0197n.f1371i) {
                str = str + this.f4945al;
            } else {
                str = str + "Team - " + abstractC0197n.m4570h();
            }
        }
        String str2 = str + "\n";
        if (abstractC0197n.f1316u != null) {
            str2 = str2 + abstractC0197n.f1316u;
        }
        if (!abstractC0197n.f1317v && this.f4910b.m1060M() && abstractC0197n.m4547z()) {
            str2 = (str2 + "\n") + "(disconnected)";
        }
        return str2;
    }

    /* renamed from: a */
    public String m2008a(AbstractC0244am abstractC0244am, boolean z) {
        String str;
        String str2 = VariableScope.nullOrMissingString;
        if (z) {
            str2 = str2 + abstractC0244am.mo5649r().mo4256e() + "\n";
        }
        if (abstractC0244am.mo3250g() > 0.0f) {
            str = str2 + C0424b.m3910a(abstractC0244am.m4370cL(), abstractC0244am.f1632cs / abstractC0244am.f1633ct).m3900a(true, true, 3, false);
        } else {
            str = str2 + ((int) Math.ceil(abstractC0244am.f1632cs)) + "/" + ((int) abstractC0244am.f1633ct) + "\n";
        }
        if (abstractC0244am.f1638cy != 0.0f) {
            str = str + "(" + ((int) abstractC0244am.f1635cv) + "/" + ((int) abstractC0244am.f1638cy) + ")\n";
        }
        C0424b m4320do = abstractC0244am.m4320do();
        C0439f m4339cx = abstractC0244am.m4339cx();
        if (m4320do != null) {
            m4339cx = C0439f.m3784d(m4339cx);
            m4339cx.m3817a(m4320do);
        }
        if (!m4339cx.m3792c()) {
            Iterator it = m4339cx.f2802b.iterator();
            while (it.hasNext()) {
                C0438e c0438e = (C0438e) it.next();
                if (c0438e.f2800b != 0.0d && !c0438e.f2799a.m3853a()) {
                    str = str + c0438e.f2799a.m3850a(c0438e.f2800b, true, false) + "\n";
                }
            }
        }
        return C0758f.m2036j(str);
    }

    /* renamed from: a */
    public static String m2011a(AbstractC0224s abstractC0224s, boolean z) {
        String str;
        AbstractC0228w abstractC0228w;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        if (abstractC0224s instanceof AbstractC0228w) {
            if (((AbstractC0228w) abstractC0224s).mo3265K() < 1.0f) {
                LoggerMaybe m1072A = LoggerMaybe.m1072A();
                float f = -1.0f;
                AbstractC0244am[] m498a = m1072A.f6117bS.f5261bL.m498a();
                int size = m1072A.f6117bS.f5261bL.size();
                for (int i = 0; i < size; i++) {
                    float m4340cv = m498a[i].m4340cv();
                    if (f == -1.0f || m4340cv < f) {
                        f = m4340cv;
                    }
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                str2 = str2 + C0758f.m2050g((1.0f / ((abstractC0228w.mo3265K() * f) * 60.0f)) + 1.0E-4f) + str;
            }
        }
        return C0758f.m2122a(str2, str);
    }

    /* renamed from: a */
    public static String m2007a(AbstractC0244am abstractC0244am, boolean z, boolean z2, boolean z3) {
        String str;
        C0824b c0824b;
        float f;
        if (z2) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        C0451j c0451j = null;
        C0453l c0453l = null;
        if (abstractC0244am instanceof C0451j) {
            c0451j = (C0451j) abstractC0244am;
            c0453l = c0451j.f2863x;
        }
        if (z) {
            str2 = str2 + abstractC0244am.mo5649r().mo4256e() + str;
        }
        if (c0453l == null || !c0453l.f2956aN) {
            if (!z3) {
                str2 = str2 + "HP: " + ((int) Math.ceil(abstractC0244am.f1632cs)) + "/" + ((int) abstractC0244am.f1633ct) + str;
            } else {
                str2 = str2 + "HP: " + ((int) abstractC0244am.f1633ct) + str;
            }
        }
        if (abstractC0244am.f1638cy != 0.0f) {
            if (!z3) {
                str2 = str2 + "Shield: " + ((int) abstractC0244am.f1635cv) + "/" + ((int) abstractC0244am.f1638cy) + str;
            } else {
                str2 = str2 + "Shield: " + ((int) abstractC0244am.f1638cy) + str;
            }
        }
        if (c0451j != null) {
            if (c0451j.f2864y.f2249l >= 1.0f) {
                str2 = str2 + "Armour: " + ((int) f) + str;
            }
        }
        C0424b m4320do = abstractC0244am.m4320do();
        float mo3354cw = abstractC0244am.mo3354cw();
        if (m4320do != null) {
            mo3354cw += m4320do.m3919a();
        }
        if (mo3354cw != 0.0f) {
            if (mo3354cw < 0.0f) {
                str2 = str2 + "Income: -$" + C0758f.m2154a(-mo3354cw, 1) + str;
            } else {
                str2 = str2 + "Income: +$" + C0758f.m2154a(mo3354cw, 1) + str;
            }
        }
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
            if (abstractC0623y.mo3294bd() != 0.0f && !z3) {
                str2 = str2 + "Energy: " + C0758f.m2057f(abstractC0244am.f1639cz) + "/" + C0758f.m2057f(abstractC0623y.mo3294bd()) + str;
            }
            float mo2976z = abstractC0623y.mo2976z();
            if (!abstractC0623y.m2880aR()) {
                mo2976z = 0.0f;
            }
            if (mo2976z != 0.0f) {
                str2 = str2 + "Speed: " + C0758f.m2057f(mo2976z) + str;
            }
            if (abstractC0623y.mo2979l()) {
                ArrayList m2874aX = abstractC0623y.m2874aX();
                if (m2874aX.size() > 0) {
                    String str3 = str2 + "Attack: ";
                    boolean z4 = true;
                    Iterator it = m2874aX.iterator();
                    while (it.hasNext()) {
                        C0232aa c0232aa = (C0232aa) it.next();
                        if (!z4) {
                            str3 = str3 + ", ";
                        }
                        z4 = false;
                        String str4 = str3 + C0758f.m2057f(c0232aa.f1498a);
                        if (c0232aa.f1501d > 1) {
                            str4 = str4 + "x" + c0232aa.f1501d;
                        }
                        str3 = str4 + "/" + C0758f.m2057f(c0232aa.m4473a()) + "s";
                    }
                    str2 = str3 + str;
                }
            }
            float mo2978m = abstractC0623y.mo2978m();
            if (!abstractC0623y.mo2979l()) {
                mo2978m = 0.0f;
            }
            if (mo2978m != 0.0f) {
                str2 = str2 + "Range: " + C0758f.m2057f(mo2978m) + str;
            }
            if (z3 && abstractC0623y.m4349cj()) {
                str2 = str2 + "Upgradable" + str;
            }
        }
        if (!z3 && abstractC0244am.f1658cS > 0) {
            str2 = str2 + "Kills: " + abstractC0244am.f1658cS + str;
        }
        boolean z5 = false;
        if (LoggerMaybe.m1072A().f6231bl) {
            InterfaceC0303as mo5649r = abstractC0244am.mo5649r();
            str2 = ((str2 + "\n") + "--Debug--" + str) + "name: " + mo5649r.mo4252i() + str;
            if ((mo5649r instanceof C0453l) && (c0824b = ((C0453l) mo5649r).f2919I) != null) {
                str2 = str2 + "(mod: " + C0758f.m2125a(c0824b.m1647a(), 30) + ")" + str;
            }
            if (abstractC0244am.f6951ee != 0) {
                str2 = str2 + "id: " + abstractC0244am.f6951ee + str;
            }
            if (abstractC0244am.f1643cD != 0) {
                String str5 = VariableScope.nullOrMissingString;
                for (int i = 0; i < 32; i++) {
                    if (C0424b.m3917a(abstractC0244am.f1643cD, i)) {
                        if (str5.length() > 0) {
                            str5 = str5 + ",";
                        }
                        str5 = str5 + i;
                    }
                }
                str2 = str2 + "flags: " + str5 + str;
            }
            if (abstractC0244am.f1642cC != 0) {
                str2 = str2 + "ammo: " + abstractC0244am.f1642cC + str;
            }
            if (!abstractC0244am.f1627cn) {
                str2 = (str2 + "x: " + C0758f.m2057f(abstractC0244am.f6957el) + str) + "y: " + C0758f.m2057f(abstractC0244am.f6958em) + str;
            }
            if (abstractC0244am.f1614ca != 0.0f || abstractC0244am.f1615cb != 0.0f) {
                str2 = str2 + "x/y speed: " + C0758f.m2057f(abstractC0244am.f1614ca) + ", " + C0758f.m2057f(abstractC0244am.f1615cb) + str;
            }
            if (!abstractC0244am.f1627cn) {
                str2 = (str2 + "height: " + C0758f.m2057f(abstractC0244am.f6959en) + str) + "dir: " + C0758f.m2057f(abstractC0244am.f1618ce) + str;
            }
            if (abstractC0244am.f1624ck < 1.0f) {
                str2 = str2 + "built: " + C0758f.m2057f(abstractC0244am.f1624ck) + str;
            }
            if (abstractC0244am instanceof C0451j) {
                C0451j c0451j2 = (C0451j) abstractC0244am;
                str2 = (str2 + "frame: " + c0451j2.f2840a + str) + "drawLayer: " + c0451j2.f6955ej + str;
                if (c0451j2.m3608dc() != null) {
                    str2 = str2 + "tags: " + c0451j2.m3608dc() + str;
                }
                if (c0451j2.f1652cM != null) {
                    str2 = str2 + "attachedTo: " + c0451j2.f1652cM.m4337cz() + str;
                }
                if (c0451j2.f1580bt != null && !c0451j2.f1580bt.f1607bT) {
                    str2 = str2 + "customTarget1: " + c0451j2.f1580bt.m4337cz() + str;
                }
                if (c0451j2.f1581bu != null && !c0451j2.f1581bu.f1607bT) {
                    str2 = str2 + "customTarget2: " + c0451j2.f1581bu.m4337cz() + str;
                }
                if (c0451j2.f1586bz != -9999) {
                    str2 = str2 + "customTimer: " + C0758f.m2050g(c0451j2.f1586bz / 1000.0f) + str;
                }
                if (c0451j2.f1582bv != null && !c0451j2.f1582bv.isEmpty()) {
                    str2 = str2 + "-- memory --: " + str + c0451j2.f1582bv.debugMemory(true, true) + str;
                }
            }
            z5 = true;
        }
        C0439f mo1715dd = abstractC0244am.mo1715dd();
        if (mo1715dd != null && !mo1715dd.m3792c()) {
            String m3803a = mo1715dd.m3803a(z2, true, 10, z5, false);
            if (!m3803a.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + m3803a + str;
            }
        }
        return C0758f.m2122a(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m1979j() {
        Iterator it = this.f4994aC.iterator();
        while (it.hasNext()) {
            ((C0784ac) it.next()).f5074h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m1978k() {
        Iterator it = this.f4994aC.iterator();
        while (it.hasNext()) {
            ((C0784ac) it.next()).m1918b();
        }
        this.f4982ao = null;
        this.f4983ap = 0.0f;
    }

    /* renamed from: a */
    void m2016a(int i, int i2, int i3, String str, String str2, Paint paint, float f) {
        int i4 = (int) (i3 * 2.5d);
        int i5 = (int) (40.0f * this.f4910b.f6132ci);
        int i6 = i + (i3 / 2);
        int i7 = (int) ((i2 - i5) - (35.0f * this.f4910b.f6132ci));
        this.f4995aD.m5364a(i6 - (i4 / 2), i7, i4, i5);
        this.f4909a.m1853a(this.f4995aD.f230a, this.f4995aD.f231b, this.f4995aD.f232c, this.f4995aD.f233d, VariableScope.nullOrMissingString, Color.m5435a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, 100), this.f4909a.f5151aw, false);
        this.f4967w.m5364a(this.f4995aD.f230a, this.f4995aD.f231b, this.f4995aD.f232c, this.f4995aD.f233d);
        Rect rect = this.f4967w;
        rect.f232c = (int) (rect.f232c * f);
        this.f4910b.f6113bO.mo151c(this.f4967w, paint);
        this.f4910b.f6113bO.mo181a(str, i6, i7 + ((this.f4909a.f5151aw.m5378k() + 5.0f) * 1.0f), this.f4909a.f5151aw);
        this.f4910b.f6113bO.mo181a(str2, i6, i7 + ((this.f4909a.f5151aw.m5378k() + 5.0f) * 2.0f), this.f4909a.f5151aw);
    }

    /* renamed from: l */
    void m1977l() {
        this.f4996aF.clear();
        this.f4996aF.add(new C07611("Finish game"));
        this.f4996aF.add(new C07622("Keep playing"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a$1.class */
    public class C07611 extends AbstractC0793b {
        C07611(String str) {
            super(C0760a.this, str);
        }

        /* renamed from: a */
        void mo1890a() {
            C0760a.this.f4910b.f6271dt = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f.a$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a$2.class */
    public class C07622 extends AbstractC0793b {
        C07622(String str) {
            super(C0760a.this, str);
        }

        /* renamed from: a */
        void mo1890a() {
            C0760a.this.f4910b.f6268dq = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1987e(float f) {
        String str;
        boolean z = false;
        if ((this.f4910b.f6267dp || this.f4910b.f6270ds) && !this.f4910b.f6268dq) {
            z = true;
        }
        if (!this.f4910b.f6267dp) {
            this.f4997aG = false;
        } else if (!this.f4997aG) {
            this.f4997aG = true;
            if (!this.f4910b.f6228ar && this.f4910b.f6115bQ.numberOfWins >= 5 && !this.f4910b.f6115bQ.rateGameShown && LoggerMaybe.f6192au) {
                this.f5000aN = true;
                this.f4910b.f6115bQ.rateGameShown = true;
                this.f4910b.f6115bQ.save();
            }
        }
        if (!z) {
            this.f4998aH = 0.0f;
            this.f4951aJ = 0;
        }
        if (!z || this.f4910b.f6239bx >= 120 || this.f4910b.f6117bS.f5111c != null) {
        }
        if (z && !this.f4909a.f5207p) {
            this.f4998aH += f;
            if (this.f4910b.f6239bx < 120) {
                this.f4998aH = 100000.0f;
            }
            boolean z2 = this.f4998aH > 80.0f;
            boolean z3 = this.f4998aH > 100.0f;
            boolean z4 = this.f4998aH > 160.0f;
            if (this.f4951aJ == 0) {
                this.f4951aJ = 1;
            }
            int m1042a = this.f4910b.m1042a(210);
            this.f4967w.f230a = (int) ((this.f4910b.f6153cE / 2.0f) - (m1042a / 2));
            this.f4967w.f232c = (int) ((this.f4910b.f6153cE / 2.0f) + (m1042a / 2));
            int m1042a2 = this.f4910b.m1042a(30);
            int m1042a3 = m1042a2 + this.f4910b.m1042a(30);
            int m1042a4 = this.f4910b.m1042a(40) + (m1042a3 * this.f4996aF.size());
            float f2 = this.f4910b.f6137co - (m1042a4 / 2);
            if (f2 > 50.0f) {
                f2 /= 2.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            this.f4967w.f231b = (int) f2;
            this.f4967w.f233d = this.f4967w.f231b + m1042a4;
            if (z2) {
                this.f4910b.f6113bO.mo195a(this.f4909a.f5241bf, this.f4967w, (Paint) null);
                this.f4910b.f6113bO.mo162b(this.f4967w, this.f4909a.f5164aJ);
            }
            Rect rect = new Rect(this.f4967w);
            int m1042a5 = this.f4967w.f231b + this.f4910b.m1042a(20);
            int m1042a6 = this.f4910b.m1042a(140);
            int i = (int) ((this.f4910b.f6153cE / 2.0f) - (m1042a6 / 2));
            int m5435a = Color.m5435a(140, 100, 100, 100);
            int i2 = i + (m1042a6 / 2);
            Paint paint = this.f4915q;
            String str2 = "Victory!";
            if (this.f4910b.f6270ds) {
                str2 = "Defeat";
            }
            float f3 = 1.0f;
            if (this.f4998aH < 95.0f) {
                f3 = this.f4998aH / 95.0f;
            }
            int m2040i = (int) (m1042a5 - (C0758f.m2040i(f3 * 90.0f) * 100.0f));
            paint.m5406a(str2, 0, str2.length(), this.f4970z);
            this.f4910b.f6113bO.mo181a(str2, i2, m2040i - ((paint.m5377l() + paint.m5376m()) / 2.0f), paint);
            if (this.f4998aH < 100.0f && !this.f4910b.f6270ds) {
                this.f4999aI += f;
                if (this.f4999aI > 0.5f) {
                    this.f4999aI = 0.0f;
                    this.f4910b.f6116bR.m2312b(EnumC0748h.f4836e);
                    this.f4910b.f6116bR.m2320b();
                    C0745e m2314b = this.f4910b.f6116bR.m2314b(0.0f, 0.0f, 0.0f, Color.m5435a(255, C0758f.m2151a(0, 255), C0758f.m2151a(0, 255), C0758f.m2151a(0, 255)));
                    if (m2314b != null) {
                        m2314b.f4722o = true;
                        m2314b.f4737J = i2 + C0758f.m2084c(-70.0f, 70.0f);
                        m2314b.f4738K = m2040i + C0758f.m2084c(-15.0f, 15.0f);
                        m2314b.f4738K += this.f4910b.f6137co / 2.0f;
                        m2314b.f4739L += this.f4910b.f6137co / 2.0f;
                        m2314b.f4750W = C0758f.m2084c(140.0f, 380.0f);
                        m2314b.f4751X = m2314b.f4750W;
                        m2314b.f4725s = true;
                        m2314b.f4726t = true;
                        m2314b.f4727u = 5.0f;
                        m2314b.f4733F = 2.0f;
                        m2314b.f4745R = C0758f.m2084c(-2.7f, 2.7f);
                        m2314b.f4744Q = C0758f.m2084c(-12.7f, 12.7f);
                        m2314b.f4735H = 0.4f;
                        m2314b.f4734G = 0.2f;
                        m2314b.f4746S = C0758f.m2084c(2.0f, 4.0f);
                        m2314b.f4786x = 2.0f;
                        m2314b.f4729w = true;
                    }
                }
            }
            int m5358c = m1042a5 + this.f4970z.m5358c();
            int i3 = rect.f233d + 30;
            this.f4917s.m5406a("123|", 0, "123|".length(), this.f4970z);
            float m5358c2 = this.f4970z.m5358c() + 6;
            float f4 = 1.5f;
            Iterator it = this.f5003aQ.iterator();
            while (it.hasNext()) {
                C0796e c0796e = (C0796e) it.next();
                if (z4) {
                    if (c0796e.f5110d != 1.0f && f4 > 0.0f) {
                        c0796e.f5110d = C0758f.m2158a(c0796e.f5110d, 1.0f, 0.01f * f4 * f);
                        f4 -= 1.0f - c0796e.f5110d;
                    }
                    float m2106b = C0758f.m2106b(c0796e.f5110d, 0.0f, 1.0f);
                    if (c0796e.f5108b != null) {
                        str = c0796e.f5108b;
                    } else {
                        str = VariableScope.nullOrMissingString + ((int) (c0796e.f5109c * m2106b));
                        if (m2106b <= 0.0f) {
                            str = " ";
                        }
                    }
                    String str3 = c0796e.f5107a;
                    float m2106b2 = C0758f.m2106b(c0796e.f5110d * 2.2f, 0.0f, 1.0f);
                    int i4 = 0;
                    if (m2106b2 > 0.0f) {
                        i4 = (int) (str3.length() * m2106b2);
                    }
                    int m2101b = C0758f.m2101b(i4, 0, str3.length());
                    String str4 = VariableScope.nullOrMissingString;
                    if (m2101b > 0 && m2101b < str3.length() - 1) {
                        str4 = "_";
                    }
                    this.f4910b.f6113bO.mo181a(str3.substring(0, m2101b) + str4 + C0758f.m2067d(" ", (str3.length() + str4.length()) - m2101b), i2 - (8.0f * this.f4917s.m5378k()), i3, this.f4917s);
                    this.f4910b.f6113bO.mo181a(str, i2 + (8.0f * this.f4917s.m5378k()), i3, this.f4918t);
                    i3 = (int) (i3 + m5358c2);
                }
            }
            for (int i5 = 0; i5 < this.f4996aF.size(); i5++) {
                if (z3) {
                    AbstractC0793b abstractC0793b = (AbstractC0793b) this.f4996aF.get(i5);
                    if (this.f4909a.m1851a(i, m5358c, m1042a6, m1042a2, abstractC0793b.m1889b(), EnumC0798g.none, false, m5435a, this.f4909a.f5152ax)) {
                        this.f5000aN = false;
                        abstractC0793b.mo1890a();
                    }
                }
                m5358c += m1042a3;
            }
            if (this.f5000aN) {
                m1984f(f);
            }
        }
    }

    /* renamed from: f */
    void m1984f(float f) {
        int m1042a = this.f4910b.m1042a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        int i = (int) ((this.f4910b.f6153cE / 2.0f) - (m1042a / 2));
        int m1042a2 = this.f4910b.m1042a(120);
        int i2 = (int) (this.f4910b.f6155cG - m1042a2);
        this.f4967w.m5364a(i, i2, m1042a, m1042a2);
        this.f4910b.f6113bO.mo162b(this.f4967w, this.f4909a.f5164aJ);
        int i3 = i + (m1042a / 2);
        Paint paint = this.f4915q;
        String str = f4954aK;
        paint.m5406a(str, 0, str.length(), this.f4970z);
        this.f4910b.f6113bO.mo181a(str, i3, i2 - ((paint.m5377l() + paint.m5376m()) / 2.0f), paint);
        int m5358c = i2 + this.f4970z.m5358c();
        int m1042a3 = this.f4910b.m1042a(70);
        int m1042a4 = this.f4910b.m1042a(30);
        int m1042a5 = ((i + (m1042a / 2)) - this.f4910b.m1042a(10)) - m1042a3;
        int m5435a = Color.m5435a(140, 100, 100, 100);
        if (this.f4909a.m1851a(m1042a5, m5358c, m1042a3, m1042a4, f4955aL, EnumC0798g.none, false, m5435a, this.f4909a.f5152ax)) {
            this.f5000aN = false;
            InterfaceC0096f interfaceC0096f = this.f4910b.f6079ao;
            if (interfaceC0096f == null) {
                LoggerMaybe.m983b("showRateNow: gameView==null");
                return;
            }
            ActivityC0097g mo242i = interfaceC0096f.mo242i();
            if (mo242i == null) {
                LoggerMaybe.m983b("showRateNow: inGameActivity==null");
                return;
            }
            mo242i.m5117l();
        }
        if (this.f4909a.m1851a(i + (m1042a / 2) + this.f4910b.m1042a(10), m5358c, m1042a3, m1042a4, f4956aM, EnumC0798g.none, false, m5435a, this.f4909a.f5152ax)) {
            this.f5000aN = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2018a(float f, boolean z) {
        int i;
        int i2;
        float f2 = this.f4910b.f6132ci * 0.7f;
        if (LoggerMaybe.m996at() && f2 < 0.7d) {
            f2 = 0.7f;
        }
        int mo386m = (int) (this.f4979X.mo386m() * f2);
        int i3 = 4 + (mo386m / 2);
        int i4 = 4 + (mo386m / 2);
        if (this.f4910b.m959g(111)) {
            boolean z2 = false;
            if (!this.f4909a.f5207p) {
                z2 = this.f4909a.m1777k();
            }
            if (!z2) {
                this.f4909a.f5207p = !this.f4909a.f5207p;
            }
        }
        if (this.f4909a.f5207p) {
            this.f4950aE += 0.008f * f;
            if (this.f4950aE > 1.0f) {
                this.f4950aE = 0.0f;
            }
            this.f4960h.m5393c(150 + ((int) (100.0f * C0758f.m2045h(this.f4950aE * 180.0f))));
        } else {
            this.f4950aE = 0.0f;
            this.f4960h.m5393c(80);
        }
        this.f4970z.m5364a(i3, i4, i3 + mo386m, i4 + mo386m);
        this.f4970z.m5365a(-(mo386m / 2), -(mo386m / 2));
        if (z) {
            this.f4910b.f6113bO.mo197a(this.f4979X, this.f4970z.f230a, this.f4970z.f231b, this.f4960h, 0.0f, f2);
            if (this.f4910b.f6115bQ.newRender) {
                this.f4975E.m5364a(this.f4970z.m5357d() - 4, this.f4970z.m5356e() - 4, this.f4970z.m5357d() + 4, this.f4970z.m5356e() + 4);
                this.f4966p.m5420a(100, 0, 155, 0);
                this.f4910b.f6113bO.mo162b(this.f4975E, this.f4966p);
            }
        }
        if (LoggerMaybe.m996at()) {
            C0758f.m2143a(this.f4970z, 4.0f);
        }
        if (this.f4909a.f5226O && !this.f4909a.f5225N && this.f4970z.m5361b((int) this.f4909a.f5209s, (int) this.f4909a.f5210t)) {
            this.f4909a.f5226O = false;
            this.f4909a.f5207p = !this.f4909a.f5207p;
        }
        if (this.f4910b.f6126cb.m2411h()) {
            this.f4960h.m5393c(80);
            if (this.f4910b.f6126cb.f4510t != 1) {
                this.f4960h.m5393c(200);
            }
            int i5 = (int) (this.f4981Z.f6403q * this.f4910b.f6132ci * 1.6f);
            int i6 = (int) (this.f4910b.f6153cE / 2.0f);
            int m5378k = 7 + ((int) this.f4909a.f5153ay.m5378k());
            this.f4910b.f6113bO.mo181a(C0758f.m2147a(this.f4910b.f6102by / 1000), i6, m5378k, this.f4909a.f5153ay);
            int i7 = m5378k + (i5 / 2) + 10;
            int i8 = i6 + (i5 / 2) + 5;
            this.f4970z.m5364a(i8, i7, i8 + i5, i7 + i5);
            this.f4970z.m5365a((-this.f4970z.m5362b()) / 2, (-this.f4970z.m5358c()) / 2);
            if (z) {
                this.f4910b.f6113bO.mo197a(this.f4981Z, this.f4970z.f230a, this.f4970z.f231b, this.f4960h, 0.0f, i5 / i);
            }
            if (this.f4909a.f5226O && !this.f4909a.f5225N && this.f4970z.m5361b((int) this.f4909a.f5209s, (int) this.f4909a.f5210t)) {
                this.f4909a.f5226O = false;
                this.f4910b.f6126cb.m2421b();
            }
            if (this.f4910b.f6237bt != 1.0f && z) {
                this.f4910b.f6113bO.mo181a("x" + this.f4910b.f6237bt, this.f4970z.m5357d() + (i5 / 2), this.f4970z.m5356e(), this.f4909a.f5151aw);
            }
            C0934e c0934e = this.f4980Y;
            int i9 = (int) (c0934e.f6403q * this.f4910b.f6132ci * 1.6f);
            int i10 = i8 - (i9 + 5);
            this.f4970z.m5364a(i10, i7, i10 + i9, i7 + i9);
            this.f4970z.m5365a((-this.f4970z.m5362b()) / 2, (-this.f4970z.m5358c()) / 2);
            if (z) {
                this.f4910b.f6113bO.mo197a(c0934e, this.f4970z.f230a, this.f4970z.f231b, this.f4960h, 0.0f, i9 / i2);
            }
            if (this.f4909a.f5226O && !this.f4909a.f5225N && this.f4970z.m5361b((int) this.f4909a.f5209s, (int) this.f4909a.f5210t)) {
                this.f4909a.f5226O = false;
                this.f4910b.f6126cb.m2434a();
            }
        }
        if (this.f4909a.f5207p) {
            this.f4910b.f6161cT = false;
            int m1042a = this.f4910b.m1042a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
            this.f4967w.f230a = (int) ((this.f4910b.f6153cE / 2.0f) - (m1042a / 2));
            this.f4967w.f232c = (int) ((this.f4910b.f6153cE / 2.0f) + (m1042a / 2));
            int m1042a2 = this.f4910b.m1042a(30);
            int m1042a3 = m1042a2 + this.f4910b.m1042a(15);
            Menu m1973p = m1973p();
            int m1042a4 = this.f4910b.m1042a(40) + (m1042a3 * (1 + m1973p.size()));
            this.f4967w.f231b = (int) (this.f4910b.f6137co - (m1042a4 / 2));
            this.f4967w.f233d = (int) (this.f4910b.f6137co + (m1042a4 / 2));
            if (z) {
                this.f4910b.f6113bO.mo195a(this.f4909a.f5241bf, this.f4967w, (Paint) null);
                this.f4910b.f6113bO.mo162b(this.f4967w, this.f4909a.f5164aJ);
            }
            int m1042a5 = this.f4967w.f231b + this.f4910b.m1042a(40);
            int m1042a6 = this.f4910b.m1042a(140);
            int i11 = (int) ((this.f4910b.f6153cE / 2.0f) - (m1042a6 / 2));
            int m5435a = Color.m5435a(140, 100, 100, 100);
            if (this.f4909a.m1851a(i11, m1042a5, m1042a6, m1042a2, C0820a.m1687a("menus.ingame.resume", new Object[0]), EnumC0798g.none, false, m5435a, this.f4909a.f5152ax)) {
                this.f4909a.f5226O = false;
                this.f4909a.f5231aP = 40.0f;
                this.f4909a.f5207p = false;
            }
            int i12 = m1042a5 + m1042a3;
            for (int i13 = 0; i13 < m1973p.size(); i13++) {
                MenuItem item = m1973p.getItem(i13);
                if (this.f4909a.m1851a(i11, i12, m1042a6, m1042a2, item.getTitle().toString(), EnumC0798g.none, false, m5435a, this.f4909a.f5152ax)) {
                    m2017a(item.getItemId());
                    this.f4909a.f5226O = false;
                    this.f4909a.f5231aP = 40.0f;
                }
                i12 += m1042a3;
            }
        }
    }

    /* renamed from: m */
    public void m1976m() {
        m2017a(20);
    }

    /* renamed from: n */
    public void m1975n() {
        m2017a(21);
    }

    /* renamed from: o */
    public void m1974o() {
        m2017a(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2017a(int i) {
        InterfaceC0096f interfaceC0096f = this.f4910b.f6079ao;
        if (interfaceC0096f == null) {
            LoggerMaybe.m983b("selectMenuOption: gameView==null");
            return;
        }
        ActivityC0097g mo242i = interfaceC0096f.mo242i();
        if (mo242i == null) {
            LoggerMaybe.m983b("selectMenuOption: inGameActivity==null");
        } else {
            mo242i.mo115c(i);
        }
    }

    /* renamed from: p */
    Menu m1973p() {
        this.f5002aP.clear();
        InterfaceC0096f interfaceC0096f = this.f4910b.f6079ao;
        if (interfaceC0096f == null) {
            LoggerMaybe.m983b("selectMenuOption: gameView==null");
            return this.f5002aP;
        }
        ActivityC0097g mo242i = interfaceC0096f.mo242i();
        if (mo242i == null) {
            LoggerMaybe.m983b("selectMenuOption: inGameActivity==null");
            return this.f5002aP;
        }
        mo242i.mo5125a(this.f5002aP);
        return this.f5002aP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1982g(float f) {
        String str;
        int i = (int) (this.f4910b.f6155cG - (30.0f * this.f4910b.f6132ci));
        int i2 = (int) ((this.f4910b.f6134ck - this.f4910b.f6138cp) + 10.0f);
        int i3 = ((int) (this.f4910b.f6138cp - 20.0f)) / 3;
        int i4 = i3 - 5;
        for (int i5 = 0; i5 < this.f4994aC.size(); i5++) {
            C0784ac c0784ac = (C0784ac) this.f4994aC.get(i5);
            if (c0784ac.f5074h) {
                c0784ac.m1915e();
                c0784ac.f5074h = false;
            }
            c0784ac.m1916d();
            if (this.f4910b.f6115bQ.keyboardSupport && i5 < this.f4910b.f6118bT.f4142ai.length) {
                if (this.f4910b.f6118bT.f4144ak[i5].m2684a()) {
                    c0784ac.m1918b();
                    c0784ac.m1917c();
                }
                if (this.f4910b.f6118bT.f4143aj[i5].m2684a()) {
                    this.f4909a.m1777k();
                    c0784ac.m1921a();
                }
                if (this.f4910b.f6118bT.f4142ai[i5].m2684a()) {
                    this.f4909a.m1777k();
                    this.f4909a.m1756x();
                    c0784ac.m1921a();
                }
            }
            if (this.f4910b.f6115bQ.showUnitGroups && i5 < 3) {
                if (c0784ac.f5067a.size() == 0) {
                    if (this.f4909a.f5255bz) {
                        str = "Empty";
                    } else {
                        str = "(" + (i5 + 1) + ")";
                    }
                } else {
                    str = VariableScope.nullOrMissingString + c0784ac.f5067a.size();
                }
                boolean z = false;
                c0784ac.f5070d = C0758f.m2159a(c0784ac.f5070d, 0.01f * f);
                c0784ac.f5071e = C0758f.m2159a(c0784ac.f5071e, 0.01f * f);
                c0784ac.f5072f = C0758f.m2159a(c0784ac.f5072f, 0.01f * f);
                if (this.f4909a.m1852a(i2, i, i4, (int) (31.0f * this.f4910b.f6132ci), str, EnumC0798g.none, true, Color.m5435a(50, (int) (100.0f + (c0784ac.f5072f * 100.0f)), (int) (100.0f + (c0784ac.f5071e * 100.0f)), (int) (100.0f + (c0784ac.f5070d * 100.0f)))) && this.f4909a.f5126W == null && !this.f4909a.f5225N) {
                    z = true;
                    c0784ac.f5068b += f;
                    this.f4909a.m1796d();
                    float f2 = 1.0f;
                    this.f4961i.m5424a();
                    this.f4961i.m5398b(Color.m5435a(120, 200, 0, 0));
                    if (c0784ac.f5068b < 50.0f) {
                        f2 = c0784ac.f5068b / 50.0f;
                        this.f4961i.m5398b(Color.m5435a((int) (150.0f + (f2 * 40.0f)), 0, 200, 0));
                        m2016a(i2, i, i4, "Select Group", "(Hold for more..)", this.f4961i, f2);
                    } else if (c0784ac.f5068b < 100.0f) {
                        f2 = (c0784ac.f5068b - 50.0f) / 50.0f;
                        this.f4961i.m5398b(Color.m5435a((int) (150.0f + (f2 * 40.0f)), 200, 0, 0));
                        m2016a(i2, i, i4, "Add to Group", "(Hold for more..)", this.f4961i, f2);
                    } else {
                        m2016a(i2, i, i4, "Replace Group", VariableScope.nullOrMissingString, this.f4961i, 0.0f);
                    }
                    int i6 = (int) (31.0f * this.f4910b.f6132ci);
                    this.f4967w.m5364a(i2, (int) ((i + i6) - (i6 * f2)), i2 + i4, i + i6);
                    this.f4910b.f6113bO.mo162b(this.f4967w, this.f4961i);
                }
                if (!z) {
                    if (c0784ac.f5068b != 0.0f && !this.f4909a.f5215D) {
                        if (c0784ac.f5068b > 100.0f) {
                            c0784ac.m1918b();
                            c0784ac.m1917c();
                            c0784ac.f5072f = 1.0f;
                        } else if (c0784ac.f5068b > 50.0f) {
                            c0784ac.m1917c();
                            this.f4909a.m1777k();
                            this.f4909a.m1756x();
                            c0784ac.m1921a();
                            c0784ac.f5071e = 1.0f;
                        } else if (c0784ac.f5067a.size() != 0) {
                            this.f4909a.m1777k();
                            this.f4909a.m1756x();
                            c0784ac.m1921a();
                            c0784ac.f5070d = 1.0f;
                        } else {
                            c0784ac.m1918b();
                            c0784ac.m1917c();
                            c0784ac.f5071e = 1.0f;
                        }
                    }
                    if (!z) {
                        c0784ac.f5068b = 0.0f;
                    }
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f4994aC.size());
        Iterator it = this.f4994aC.iterator();
        while (it.hasNext()) {
            ((C0784ac) it.next()).mo2292a(streamWriter);
        }
        streamWriter.mo1355c(0);
    }

    /* renamed from: a */
    public void m2004a(Reader reader, boolean z) {
        if (!z) {
            this.f4994aC.clear();
        }
        int ReadInt = reader.ReadInt();
        int i = 0;
        while (i < ReadInt) {
            C0784ac c0784ac = new C0784ac(this, i < 3);
            c0784ac.m1919a(reader);
            if (!z) {
                this.f4994aC.add(c0784ac);
            }
            i++;
        }
        reader.m1289d();
    }

    /* renamed from: q */
    public void m1972q() {
        this.f5003aQ = C0796e.m1878a();
    }

    /* renamed from: r */
    public void m1971r() {
        this.f5003aQ = C0796e.m1878a();
    }
}
