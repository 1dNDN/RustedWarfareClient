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
import com.corrodinggames.rts.gameFramework.Core;
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
    Core f4910b;

    /* renamed from: e */
    public boolean f4913e;

    /* renamed from: f */
    public float f4914f;

    /* renamed from: n */
    C0930ag f4922n;

    /* renamed from: o */
    C0930ag f4923o;

    /* renamed from: q */
    Paint f4925q;

    /* renamed from: r */
    Paint f4926r;

    /* renamed from: s */
    Paint f4927s;

    /* renamed from: t */
    Paint f4928t;

    /* renamed from: u */
    Paint f4929u;

    /* renamed from: v */
    Paint f4930v;

    /* renamed from: G */
    boolean f4941G;

    /* renamed from: H */
    float f4942H;

    /* renamed from: I */
    float f4943I;

    /* renamed from: J */
    float f4944J;

    /* renamed from: K */
    int f4945K;

    /* renamed from: L */
    boolean f4946L;

    /* renamed from: M */
    float f4947M;

    /* renamed from: N */
    float f4948N;

    /* renamed from: O */
    float f4949O;

    /* renamed from: P */
    float f4950P;

    /* renamed from: Q */
    float f4951Q;

    /* renamed from: R */
    float f4952R;

    /* renamed from: S */
    int f4953S;

    /* renamed from: T */
    float f4954T;

    /* renamed from: U */
    float f4955U;

    /* renamed from: ac */
    AbstractC0244am f4963ac;

    /* renamed from: ad */
    AbstractC0224s f4964ad;

    /* renamed from: ae */
    float f4965ae;

    /* renamed from: af */
    long f4966af;

    /* renamed from: ag */
    float f4967ag;

    /* renamed from: ah */
    float f4968ah;

    /* renamed from: ai */
    String f4969ai;

    /* renamed from: aj */
    String f4970aj;

    /* renamed from: ak */
    String f4971ak;

    /* renamed from: al */
    String f4972al;

    /* renamed from: am */
    String f4973am;

    /* renamed from: an */
    public String f4974an;

    /* renamed from: aq */
    public float f4977aq;

    /* renamed from: ar */
    public boolean f4978ar;

    /* renamed from: aE */
    float f4991aE;

    /* renamed from: aJ */
    int f4996aJ;

    /* renamed from: aa */
    static Paint f4961aa = new Paint();

    /* renamed from: ab */
    static PorterDuffColorFilter f4962ab = new PorterDuffColorFilter(Color.m5949a(200, 255, 200), PorterDuff.Mode.MULTIPLY);

    /* renamed from: aK */
    static String f4997aK = C0820a.m1731a("gui.rategame.text", new Object[0]);

    /* renamed from: aL */
    static String f4998aL = C0820a.m1731a("gui.rategame.yes", new Object[0]);

    /* renamed from: aM */
    static String f4999aM = C0820a.m1731a("gui.rategame.no", new Object[0]);

    /* renamed from: c */
    public boolean f4911c = false;

    /* renamed from: d */
    public boolean f4912d = false;

    /* renamed from: g */
    Paint f4915g = new Paint();

    /* renamed from: h */
    Paint f4916h = new Paint();

    /* renamed from: i */
    Paint f4917i = new Paint();

    /* renamed from: j */
    Paint f4918j = new Paint();

    /* renamed from: k */
    Paint f4919k = new Paint();

    /* renamed from: l */
    Paint f4920l = new Paint();

    /* renamed from: m */
    Paint f4921m = new Paint();

    /* renamed from: p */
    Paint f4924p = new Paint();

    /* renamed from: w */
    Rect f4931w = new Rect();

    /* renamed from: x */
    RectF f4932x = new RectF();

    /* renamed from: y */
    Rect f4933y = new Rect();

    /* renamed from: z */
    Rect f4934z = new Rect();

    /* renamed from: A */
    RectF f4935A = new RectF();

    /* renamed from: B */
    RectF f4936B = new RectF();

    /* renamed from: C */
    Rect f4937C = new Rect();

    /* renamed from: D */
    RectF f4938D = new RectF();

    /* renamed from: E */
    Rect f4939E = new Rect();

    /* renamed from: F */
    RectF f4940F = new RectF();

    /* renamed from: V */
    C0934e f4956V = null;

    /* renamed from: W */
    C0934e f4957W = null;

    /* renamed from: X */
    C0934e f4958X = null;

    /* renamed from: Y */
    C0934e f4959Y = null;

    /* renamed from: Z */
    C0934e f4960Z = null;

    /* renamed from: ao */
    String f4975ao = null;

    /* renamed from: ap */
    float f4976ap = 0.0f;

    /* renamed from: as */
    ArrayList f4979as = new ArrayList();

    /* renamed from: at */
    C0230y f4980at = new C0230y(false);

    /* renamed from: au */
    C0230y f4981au = new C0230y(true);

    /* renamed from: av */
    C0209d f4982av = new C0209d();

    /* renamed from: aw */
    ArrayList f4983aw = new ArrayList();

    /* renamed from: ax */
    ArrayList f4984ax = new ArrayList();

    /* renamed from: ay */
    C1101m f4985ay = new C1101m();

    /* renamed from: az */
    ArrayList f4986az = new ArrayList();

    /* renamed from: aA */
    RectF f4987aA = new RectF();

    /* renamed from: aB */
    HashMap f4988aB = new HashMap();

    /* renamed from: aC */
    ArrayList f4989aC = new ArrayList();

    /* renamed from: aD */
    Rect f4990aD = new Rect();

    /* renamed from: aF */
    ArrayList f4992aF = new ArrayList();

    /* renamed from: aG */
    boolean f4993aG = false;

    /* renamed from: aH */
    float f4994aH = 0.0f;

    /* renamed from: aI */
    float f4995aI = 0.0f;

    /* renamed from: aN */
    boolean f5000aN = false;

    /* renamed from: aO */
    float f5001aO = 0.0f;

    /* renamed from: aP */
    MenuC0810r f5002aP = new MenuC0810r();

    /* renamed from: aQ */
    ArrayList f5003aQ = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0760a(Core core, C0797f c0797f) {
        this.f4909a = c0797f;
        this.f4910b = core;
        m2053b();
    }

    /* renamed from: a */
    public void m2073a() {
        this.f4969ai = C0820a.m1731a("gui.unselectall", new Object[0]);
        this.f4970aj = C0820a.m1731a("gui.common.allyUnit", new Object[0]);
        this.f4971ak = C0820a.m1731a("gui.common.enemyUnit", new Object[0]);
        this.f4972al = C0820a.m1731a("gui.common.neutralUnit", new Object[0]);
        this.f4973am = C0820a.m1731a("gui.infoText.ownedBy", new Object[0]);
        this.f4974an = C0820a.m1731a("gui.infoText.unitCapReached", new Object[0]);
    }

    /* renamed from: b */
    public void m2053b() {
        m2073a();
        this.f4956V = this.f4910b.f6113bO.mo221a(C0067R.drawable.zoom_button);
        this.f4957W = this.f4910b.f6113bO.mo221a(C0067R.drawable.lock_icon_menu);
        this.f4958X = this.f4910b.f6113bO.mo221a(C0067R.drawable.pause);
        this.f4959Y = this.f4910b.f6113bO.mo221a(C0067R.drawable.replay_pause);
        this.f4960Z = this.f4910b.f6113bO.mo221a(C0067R.drawable.fast);
        f4961aa.m5933a(255, 30, 30, 30);
        f4961aa.m5930a(f4962ab);
        f4961aa.m5897d(true);
        this.f4925q = new Paint();
        this.f4925q.mo5914a(true);
        this.f4925q.m5929a(Paint.Align.f196b);
        this.f4925q.m5933a(255, 0, 255, 0);
        this.f4910b.m1050a(this.f4925q, 34.0f);
        this.f4926r = new Paint();
        this.f4926r.mo5914a(true);
        this.f4926r.m5929a(Paint.Align.f196b);
        this.f4926r.m5933a(255, 255, 0, 0);
        this.f4910b.m1050a(this.f4926r, 32.0f);
        this.f4927s = new Paint();
        this.f4927s.mo5914a(true);
        this.f4927s.m5929a(Paint.Align.f195a);
        this.f4927s.m5933a(255, 0, 255, 0);
        this.f4910b.m1050a(this.f4927s, 16.0f);
        this.f4928t = new Paint();
        this.f4928t.mo5914a(true);
        this.f4928t.m5929a(Paint.Align.f197c);
        this.f4928t.m5933a(255, 0, 255, 0);
        this.f4910b.m1050a(this.f4928t, 16.0f);
        this.f4929u = new Paint();
        this.f4929u.m5933a(255, 255, 255, 255);
        this.f4929u.m5929a(Paint.Align.f195a);
        this.f4929u.m5901c(true);
        this.f4929u.mo5914a(true);
        this.f4930v = new Paint();
        this.f4930v.m5933a(255, 255, 255, 255);
        this.f4930v.m5929a(Paint.Align.f195a);
        this.f4930v.m5901c(true);
        this.f4930v.mo5914a(true);
        this.f4922n = new C0930ag();
        this.f4922n.m5908b(Color.m5948a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 255, 255, 255));
        this.f4922n.m903o();
        this.f4923o = new C0930ag();
        this.f4923o.m5908b(Color.m5948a(133, 255, 255, 255));
        this.f4923o.m903o();
        this.f4989aC.clear();
        int i = 0;
        while (i < 10) {
            this.f4989aC.add(new C0784ac(this, i < 3));
            i++;
        }
        m2029l();
    }

    /* renamed from: s */
    private float m2022s() {
        float f = 4.6f / this.f4910b.f6257cX;
        if (f > 4.6f) {
            f = 4.6f;
        }
        return f;
    }

    /* renamed from: t */
    private float m2021t() {
        return m2020u() / this.f4910b.f6257cX;
    }

    /* renamed from: u */
    private float m2020u() {
        if (this.f4910b.f6153cE / this.f4910b.f6110bL.m5281i() < this.f4910b.f6155cG / this.f4910b.f6110bL.m5280j()) {
            return this.f4910b.f6153cE / this.f4910b.f6110bL.m5281i();
        }
        return this.f4910b.f6155cG / this.f4910b.f6110bL.m5280j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2072a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.f4910b.settingEngine.showZoomButton) {
            float f6 = this.f4910b.f6132ci * 0.7f;
            int i = (int) (50.0f * f6);
            int i2 = (int) this.f4910b.f6137co;
            float m1093c = C0913a.m1093c();
            if (m1093c > 20.0f) {
                i = (int) (i + (m1093c - 20.0f));
            }
            if (this.f4941G) {
                this.f4931w.m5874a(i - 4, (int) (i2 - (50.0f * this.f4910b.f6132ci)), i + 4, (int) (i2 + (50.0f * this.f4910b.f6132ci)));
                this.f4917i.m5937a();
                this.f4917i.m5908b(Color.m5948a(255, 0, 0, 0));
                this.f4910b.f6113bO.mo162b(this.f4931w, this.f4917i);
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
            this.f4931w.m5874a((int) (i - f10), (int) (f5 - f11), (int) (i + f10), (int) (f5 + f11));
            if (!this.f4941G) {
                f4961aa.m5933a(140, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_KATAKANA_HIRAGANA);
            } else {
                f4961aa.m5933a(255, 255, 255, 255);
            }
            this.f4910b.f6113bO.mo197a(this.f4956V, this.f4931w.f230a, this.f4931w.f231b, f4961aa, 0.0f, f6);
            boolean z = this.f4941G;
            if (!this.f4941G && this.f4909a.m1900a(this.f4931w.f230a, this.f4931w.f231b, this.f4931w.m5872b(), this.f4931w.m5868c(), EnumC0798g.f5265b)) {
                this.f4941G = true;
                this.f4942H = this.f4909a.f5130t;
            }
            if (!this.f4909a.f5140D) {
                this.f4941G = false;
            }
            if (this.f4941G) {
                this.f4943I += f;
                this.f4909a.m1840d();
                float f12 = this.f4909a.f5130t - this.f4942H;
                if (f12 > 180.0f) {
                    f12 = 180.0f;
                }
                if (f12 < -180.0f) {
                    f12 = -180.0f;
                }
                float f13 = f12 * this.f4910b.f6254cU;
                if (f13 > 2.0f) {
                    this.f4910b.f6254cU -= (5.0E-4f * C0758f.m2137c(f13)) * f;
                    this.f4910b.f6255cV = false;
                    if (this.f4910b.f6254cU < m2021t()) {
                        this.f4910b.f6254cU = m2021t();
                        this.f4910b.f6255cV = true;
                    }
                } else if (f13 < -2.0f) {
                    this.f4910b.f6254cU += 5.0E-4f * C0758f.m2137c(f13) * f;
                    this.f4910b.f6255cV = false;
                    if (this.f4910b.f6254cU > m2022s()) {
                        this.f4910b.f6254cU = m2022s();
                        this.f4910b.f6255cV = true;
                    }
                }
            } else {
                if (!z || this.f4943I < 12.0f) {
                }
                this.f4943I = 0.0f;
            }
        }
        if (this.f4910b.settingEngine.mouseSupport) {
            if (this.f4909a.m1909a(this.f4910b.m1026ae(), this.f4910b.m1025af()) && !this.f4909a.f5143G) {
                int m1023ah = this.f4910b.m1023ah();
                if (m1023ah != 0) {
                    this.f4944J += (m1023ah / 120.0f) * 0.18f;
                }
                if (this.f4944J > 1.0f) {
                    this.f4944J = 1.0f;
                }
                if (this.f4944J < -1.0f) {
                    this.f4944J = -1.0f;
                }
            }
            if (this.f4944J != 0.0f) {
                float f14 = 0.0032f * f;
                if (this.f4944J < 0.0f) {
                    f14 = -f14;
                }
                float f15 = f14 + (this.f4944J * 0.18f * f);
                float f16 = this.f4944J;
                this.f4944J = C0758f.m2211a(this.f4944J, C0758f.m2137c(f15));
                if (this.f4944J == 0.0f) {
                    f15 = f16;
                }
                float f17 = f15 * this.f4910b.f6254cU;
                this.f4910b.f6254cU += f17;
                this.f4910b.f6162cY = true;
                this.f4910b.f6163cZ = this.f4910b.m1026ae();
                this.f4910b.f6164da = this.f4910b.m1025af();
                if (f17 != 0.0f) {
                    this.f4910b.f6255cV = false;
                }
            }
        }
        if (this.f4910b.settingEngine.gestureZoom && this.f4910b.m1029ab() && this.f4910b.m1027ad() >= 3) {
            this.f4955U = 20.0f;
        }
        if (this.f4955U < 10.0f) {
            this.f4946L = false;
        }
        if (this.f4955U > 0.0f) {
            this.f4955U = C0758f.m2211a(this.f4955U, f);
            boolean z2 = this.f4910b.m1029ab() && this.f4910b.m1027ad() >= 3;
            this.f4909a.f5203aO = 3.0f;
            float f18 = 0.0f;
            float f19 = 0.0f;
            if (z2) {
                for (int i3 = 0; i3 < this.f4910b.m1027ad(); i3++) {
                    f18 += this.f4910b.m1002b(i3);
                    f19 += this.f4910b.m994c(i3);
                }
                f2 = f18 / this.f4910b.m1027ad();
                f3 = f19 / this.f4910b.m1027ad();
                f4 = 0.0f;
                for (int i4 = 0; i4 < this.f4910b.m1027ad(); i4++) {
                    f4 += C0758f.m2157b(f2, f3, this.f4910b.m1002b(i4), this.f4910b.m994c(i4));
                }
            } else {
                f2 = this.f4950P;
                f3 = this.f4951Q;
                f4 = this.f4952R;
            }
            if (this.f4946L && this.f4953S != this.f4910b.m1027ad()) {
                this.f4946L = false;
            }
            if (!this.f4946L && z2) {
                this.f4946L = true;
                this.f4947M = f2;
                this.f4948N = f3;
                this.f4949O = f4;
                this.f4954T = this.f4910b.f6254cU;
                this.f4950P = f2;
                this.f4951Q = f3;
                this.f4952R = f4;
                this.f4953S = this.f4910b.m1027ad();
            }
            if (z2) {
                float f20 = (this.f4951Q - f3) * 2.0f * this.f4910b.f6254cU;
                this.f4910b.f6254cU += (f20 / 250.0f) / this.f4910b.f6132ci;
                this.f4910b.f6255cV = false;
                float f21 = this.f4952R - f4;
                if (0 != 0) {
                    this.f4910b.f6254cU -= (f21 / 350.0f) / this.f4910b.f6132ci;
                    this.f4910b.f6255cV = false;
                }
                this.f4950P = f2;
                this.f4951Q = f3;
                this.f4952R = f4;
                this.f4953S = this.f4910b.m1027ad();
                for (int i5 = 0; i5 < this.f4910b.m1027ad(); i5++) {
                    this.f4910b.f6113bO.mo225a(f2, f3, this.f4910b.m1002b(i5), this.f4910b.m994c(i5), this.f4909a.f5196aH);
                }
                this.f4910b.f6113bO.mo225a(f2, f3, f2, this.f4948N, this.f4909a.f5197aI);
                this.f4910b.f6113bO.mo223a(f2, f3, 6.0f, this.f4909a.f5196aH);
            }
        }
        if (this.f4910b.f6254cU > m2022s()) {
            this.f4910b.f6254cU = m2022s();
            this.f4910b.f6255cV = true;
        }
        if (this.f4910b.f6254cU < m2021t()) {
            this.f4910b.f6254cU = m2021t();
            this.f4910b.f6255cV = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2052b(float f) {
        this.f4913e = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 7;
        if (Core.m1009av()) {
            i = 14;
        }
        if (this.f4910b.m1029ab() && this.f4909a.f5159W == null) {
            boolean m1842c = this.f4909a.m1842c(this.f4910b);
            int i2 = 1;
            if (this.f4910b.settingEngine.mouseOrders == 2) {
                i2 = 2;
            }
            int m977f = this.f4910b.m977f(i2);
            if (m1842c || (this.f4910b.settingEngine.mouseSupport && m977f != -1 && !this.f4909a.f5141E && !this.f4909a.f5142F)) {
                float m1002b = this.f4910b.m1002b(0);
                float m994c = this.f4910b.m994c(0);
                if (m977f != -1) {
                    m1002b = this.f4910b.m1002b(m977f);
                    m994c = this.f4910b.m994c(m977f);
                }
                if (!this.f4911c) {
                    z2 = true;
                    this.f4936B.f234a = (int) m1002b;
                    this.f4936B.f235b = (int) m994c;
                }
                this.f4936B.f236c = (int) m1002b;
                this.f4936B.f237d = (int) m994c;
                if (Math.abs(this.f4936B.f234a - this.f4936B.f236c) > i || Math.abs(this.f4936B.f235b - this.f4936B.f237d) > i) {
                    this.f4912d = true;
                }
                z = true;
            } else if (this.f4910b.m1027ad() == 2 && this.f4955U == 0.0f) {
                this.f4936B.f234a = (int) this.f4910b.m1002b(0);
                this.f4936B.f235b = (int) this.f4910b.m994c(0);
                this.f4936B.f236c = (int) this.f4910b.m1002b(1);
                this.f4936B.f237d = (int) this.f4910b.m994c(1);
                this.f4912d = false;
                z = true;
            }
            if (z) {
                this.f4914f += f;
                if (this.f4914f < 18.0f) {
                    z3 = true;
                }
            } else {
                this.f4914f = 0.0f;
            }
            if (z) {
                this.f4911c = true;
                if (Math.abs(this.f4936B.f234a - this.f4936B.f236c) > i || Math.abs(this.f4936B.f235b - this.f4936B.f237d) > i) {
                    this.f4937C.f233d = (int) this.f4936B.f237d;
                    this.f4937C.f231b = (int) this.f4936B.f235b;
                    this.f4937C.f230a = (int) this.f4936B.f234a;
                    this.f4937C.f232c = (int) this.f4936B.f236c;
                    C0758f.m2196a(this.f4937C);
                    this.f4915g.m5908b(Color.m5948a(255, 0, 255, 0));
                    this.f4915g.m5926a(Paint.Style.f220b);
                    this.f4915g.m5936a(1.0f);
                    this.f4910b.f6113bO.mo162b(this.f4937C, this.f4915g);
                    this.f4913e = true;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (this.f4911c && !z) {
            if (z3 && this.f4910b.m1027ad() == 3) {
                z5 = true;
            } else {
                z4 = true;
            }
        }
        if (z5) {
            this.f4912d = false;
            this.f4911c = false;
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
                this.f4912d = false;
                this.f4911c = false;
            }
            this.f4938D.m5859a(this.f4936B);
            C0758f.m2193a(this.f4938D);
            if (Math.abs(this.f4938D.f234a - this.f4938D.f236c) > i || Math.abs(this.f4938D.f235b - this.f4938D.f237d) > i) {
                this.f4938D.f237d /= this.f4910b.f6256cW;
                this.f4938D.f235b /= this.f4910b.f6256cW;
                this.f4938D.f234a /= this.f4910b.f6256cW;
                this.f4938D.f236c /= this.f4910b.f6256cW;
                this.f4938D.m5862a(this.f4910b.f6142ct, this.f4910b.f6143cu);
                this.f4909a.f5203aO = 4.0f;
                this.f4909a.f5204aP = 40.0f;
                this.f4909a.f5151O = false;
                boolean m1870a = this.f4909a.m1870a(this.f4910b);
                boolean m1851b = this.f4909a.m1851b(this.f4910b);
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = false;
                if (this.f4910b.settingEngine.smartSelection_v2) {
                    Iterator it2 = AbstractC1120w.f6962eo.iterator();
                    while (it2.hasNext()) {
                        AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                        if (abstractC1120w2 instanceof AbstractC0623y) {
                            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w2;
                            if (m2058a(abstractC0623y) && (!m1870a || !abstractC0623y.f1646cG)) {
                                if (!abstractC0623y.m4758bI()) {
                                    z6 = false;
                                }
                                if (abstractC0623y.m2935aS() && abstractC0623y.mo3036l()) {
                                    z7 = false;
                                }
                            }
                        }
                    }
                }
                if (m1851b) {
                    z6 = true;
                }
                Iterator it3 = AbstractC1120w.f6962eo.iterator();
                while (it3.hasNext()) {
                    AbstractC1120w abstractC1120w3 = (AbstractC1120w) it3.next();
                    if (abstractC1120w3 instanceof AbstractC0318c) {
                        AbstractC0318c abstractC0318c2 = (AbstractC0318c) abstractC1120w3;
                        boolean z9 = false;
                        if (m2058a(abstractC0318c2)) {
                            z9 = true;
                            if (!z6 && abstractC0318c2.m4758bI()) {
                                z9 = false;
                            }
                            if (!z7 && abstractC0318c2.m4769ak() && !abstractC0318c2.mo3036l()) {
                                z9 = false;
                            }
                        }
                        if (m1851b) {
                            if (z9) {
                                z9 = !abstractC0318c2.f1646cG;
                            } else if (abstractC0318c2.f1646cG) {
                                z9 = true;
                            }
                        } else if (m1870a && abstractC0318c2.f1646cG) {
                            z9 = true;
                        }
                        if (z9) {
                            this.f4909a.m1822j(abstractC0318c2);
                            if (z4 && abstractC0318c2.f1645cF + 900 < this.f4910b.f6104bA && ((!m1870a && !m1851b) || !abstractC0318c2.f1646cG)) {
                                z8 = true;
                            }
                        } else {
                            this.f4909a.m1818l(abstractC0318c2);
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
                this.f4909a.m1918D();
            }
        }
    }

    /* renamed from: a */
    private boolean m2058a(AbstractC0318c abstractC0318c) {
        if (!abstractC0318c.f1607bT && abstractC0318c.f1651cL == null) {
            float f = abstractC0318c.f6958el;
            float f2 = abstractC0318c.f6959em - abstractC0318c.f6960en;
            if (f2 <= 0.0f) {
                f2 += abstractC0318c.f6960en;
            }
            if (this.f4938D.m5855b(f, f2)) {
                if ((this.f4909a.m1816m(abstractC0318c) || this.f4910b.f6099bs.m5074b()) && !abstractC0318c.mo1757t()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m2054a(String str, int i) {
        this.f4975ao = str;
        this.f4976ap = i;
    }

    /* renamed from: b */
    public void m2049b(String str, int i) {
        if (this.f4976ap <= 0.0f || str.equals(this.f4975ao)) {
            this.f4975ao = str;
            this.f4976ap = i;
        }
    }

    /* renamed from: a */
    public void m2055a(String str) {
        if (this.f4976ap > 0.0f && str.equals(this.f4975ao)) {
            this.f4976ap = 0.0f;
        }
    }

    /* renamed from: c */
    public void m2047c(float f) {
        if (this.f4976ap > 0.0f && this.f4975ao != null) {
            this.f4976ap = C0758f.m2211a(this.f4976ap, f);
            this.f4910b.f6113bO.mo180a(this.f4975ao, this.f4910b.f6136cn, this.f4910b.f6137co, this.f4909a.f5186ax, this.f4909a.f5191aC, 8.0f);
        }
    }

    /* renamed from: a */
    public static boolean m2066a(AbstractC0224s abstractC0224s) {
        return Core.m1087A().f6228ar && abstractC0224s.mo4863k_();
    }

    /* renamed from: c */
    public void m2048c() {
        this.f4945K = 0;
    }

    /* renamed from: a */
    public C0639ad m2065a(AbstractC0224s abstractC0224s, int i, ArrayList arrayList) {
        Core m1087A = Core.m1087A();
        if (!Core.m1010au()) {
            return null;
        }
        if (abstractC0224s.m4911M() != null) {
            return abstractC0224s.m4911M();
        }
        if ((abstractC0224s instanceof C0219n) || (abstractC0224s instanceof C0209d)) {
            return null;
        }
        if (abstractC0224s.mo3079f() == EnumC0225t.f1466b) {
            return m1087A.f6118bT.f4127T;
        }
        if (abstractC0224s.mo3081e() == EnumC0226u.f1487m) {
            return m1087A.f6118bT.f4124Q;
        }
        if (abstractC0224s.mo3081e() == EnumC0226u.f1486l) {
            return m1087A.f6118bT.f4123P;
        }
        if (abstractC0224s.mo3081e() == EnumC0226u.f1479e) {
            return m1087A.f6118bT.f4125R;
        }
        if (abstractC0224s.mo3079f() == EnumC0225t.f1467c) {
            int i2 = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s2 = (AbstractC0224s) it.next();
                if (abstractC0224s2 != abstractC0224s && abstractC0224s2.mo3079f() == EnumC0225t.f1467c && this.f4909a.m1854b(abstractC0224s2)) {
                    i2++;
                }
            }
            if (i2 == 0) {
                return m1087A.f6118bT.f4126S;
            }
        }
        EnumC0225t mo3079f = abstractC0224s.mo3079f();
        if (mo3079f == EnumC0225t.f1471g || mo3079f == EnumC0225t.f1472h || mo3079f == EnumC0225t.f1473i) {
            return null;
        }
        C0639ad c0639ad = null;
        C0639ad[] c0639adArr = m1087A.f6118bT.f4140ag;
        if (this.f4945K < c0639adArr.length) {
            c0639ad = c0639adArr[this.f4945K];
            this.f4945K++;
        }
        return c0639ad;
    }

    /* renamed from: d */
    public ArrayList m2044d() {
        this.f4983aw.clear();
        AbstractC0244am[] m498a = this.f4909a.f5258bL.m498a();
        int size = this.f4909a.f5258bL.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0303as mo1758r = m498a[i].mo1758r();
            if (!this.f4983aw.contains(mo1758r)) {
                this.f4983aw.add(mo1758r);
            }
        }
        return this.f4983aw;
    }

    /* renamed from: a */
    public ArrayList m2061a(AbstractC0244am abstractC0244am, ArrayList arrayList) {
        C1101m m4659e;
        ArrayList mo3174N;
        int i = 0;
        this.f4979as.clear();
        int m1811p = this.f4909a.m1811p();
        if (m1811p == 0) {
            if (this.f4910b.settingEngine.showChatAndPingShortcuts && this.f4910b.m1076L()) {
                this.f4979as.add(0, this.f4909a.f5122l);
                this.f4979as.add(0, this.f4909a.f5123m);
            }
            return this.f4979as;
        }
        if (C0797f.f5247bA && abstractC0244am != null && !(abstractC0244am instanceof C0555h)) {
            this.f4979as.add(this.f4980at);
            this.f4979as.add(this.f4981au);
        }
        if (abstractC0244am == null) {
        }
        if (abstractC0244am != null) {
            i = this.f4979as.size();
            if (abstractC0244am.f1644cE) {
                if (this.f4909a.m1816m(abstractC0244am)) {
                    ArrayList mo3174N2 = abstractC0244am.mo3174N();
                    if (mo3174N2 != null) {
                        this.f4979as.addAll(mo3174N2);
                    }
                } else {
                    ArrayList mo3174N3 = abstractC0244am.mo3174N();
                    if (mo3174N3 != null) {
                        this.f4979as.addAll(mo3174N3);
                    }
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) arrayList.get(i2);
                if (this.f4909a.m1816m(abstractC0244am2) && ((abstractC0244am2.mo1758r() != abstractC0244am.mo1758r() || abstractC0244am2.m4796V() != abstractC0244am.m4796V()) && (mo3174N = abstractC0244am2.mo3174N()) != null)) {
                    Iterator it = mo3174N.iterator();
                    while (it.hasNext()) {
                        AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                        boolean z = false;
                        Iterator it2 = this.f4979as.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0224s) it2.next()).m4910N().equals(abstractC0224s.m4910N())) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f4979as.add(abstractC0224s);
                        }
                    }
                }
            }
        }
        boolean z2 = false;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0244am abstractC0244am3 = (AbstractC0244am) arrayList.get(i3);
            if (this.f4909a.m1816m(abstractC0244am3) && (abstractC0244am3 instanceof AbstractC0623y) && !((AbstractC0623y) abstractC0244am3).m2935aS()) {
                z2 = true;
            }
        }
        AbstractC0244am m2040e = m2040e();
        if (!z2 && m2040e != null && this.f4909a.m1816m(m2040e)) {
            this.f4979as.add(i, this.f4909a.f5118h);
            this.f4979as.add(i, this.f4909a.f5119i);
        }
        boolean z3 = false;
        if (C0797f.f5247bA && (this.f4910b.settingEngine.showSelectedUnitsList || m1811p == 1)) {
            z3 = true;
        }
        if (Core.m1012as() && m1811p > 0) {
            z3 = true;
        }
        if (z3 && !(abstractC0244am instanceof C0555h)) {
            if (m1811p == 1 && m2040e != null && (m4659e = m2040e.m4659e(true)) != null && m4659e.size() > 0) {
                for (int i4 = 0; i4 < m4659e.f6894a; i4++) {
                    AbstractC0224s abstractC0224s2 = (AbstractC0224s) m4659e.get(i4);
                    if (abstractC0224s2 instanceof C0212g) {
                        C0212g c0212g = (C0212g) abstractC0224s2;
                        Iterator it3 = this.f4985ay.iterator();
                        while (it3.hasNext()) {
                            C0212g c0212g2 = (C0212g) it3.next();
                            if (c0212g2.m4971a(c0212g)) {
                                m4659e.set(i4, c0212g2);
                            }
                        }
                    }
                }
                this.f4985ay.clear();
                Iterator it4 = m4659e.iterator();
                while (it4.hasNext()) {
                    AbstractC0224s abstractC0224s3 = (AbstractC0224s) it4.next();
                    if (abstractC0224s3 instanceof C0212g) {
                        this.f4985ay.add((C0212g) abstractC0224s3);
                    }
                    this.f4979as.add(abstractC0224s3);
                }
            }
            ArrayList m2044d = m2044d();
            this.f4984ax.clear();
            Iterator it5 = m2044d.iterator();
            while (it5.hasNext()) {
                C0231z mo4480d = ((InterfaceC0303as) it5.next()).mo4480d();
                mo4480d.m4846K();
                this.f4984ax.add(mo4480d);
            }
            Collections.sort(this.f4984ax);
            if (C0797f.f5247bA) {
                Collections.reverse(this.f4984ax);
            }
            Iterator it6 = this.f4984ax.iterator();
            while (it6.hasNext()) {
                C0231z c0231z = (C0231z) it6.next();
                if (C0797f.f5247bA) {
                    this.f4979as.add(0, c0231z);
                } else {
                    this.f4979as.add(c0231z);
                }
            }
        }
        return this.f4979as;
    }

    /* renamed from: e */
    AbstractC0244am m2040e() {
        if (this.f4909a.f5258bL.size() > 0) {
            return this.f4909a.f5258bL.mo497a(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC0244am m2037f() {
        AbstractC0244am abstractC0244am = null;
        if (this.f4909a.f5206aR > 0) {
            AbstractC0244am[] m498a = this.f4909a.f5258bL.m498a();
            int i = 0;
            int size = this.f4909a.f5258bL.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                AbstractC0244am abstractC0244am2 = m498a[i];
                if (abstractC0244am2.f1644cE) {
                    if (abstractC0244am == null) {
                        abstractC0244am = abstractC0244am2;
                    } else if (!m2062a(abstractC0244am, abstractC0244am2)) {
                        abstractC0244am = null;
                        break;
                    } else if (abstractC0244am.m4796V() > abstractC0244am2.m4796V()) {
                        abstractC0244am = abstractC0244am2;
                    }
                }
                i++;
            }
        }
        return abstractC0244am;
    }

    /* renamed from: a */
    public static boolean m2062a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        InterfaceC0303as mo1758r = abstractC0244am.mo1758r();
        InterfaceC0303as mo1758r2 = abstractC0244am2.mo1758r();
        if (mo1758r == mo1758r2) {
            return true;
        }
        if ((mo1758r instanceof C0453l) && (mo1758r2 instanceof C0453l)) {
            C0453l c0453l = (C0453l) mo1758r;
            C0453l c0453l2 = (C0453l) mo1758r2;
            if (c0453l.f3268fJ.contains(mo1758r2)) {
                return true;
            }
            if (c0453l.f3172fM != null && C0448g.m3960a(c0453l.f3172fM, c0453l2.mo4462x())) {
                return true;
            }
            if (c0453l2.f3172fM != null && C0448g.m3960a(c0453l2.f3172fM, c0453l.mo4462x())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    ArrayList m2035g() {
        this.f4986az.clear();
        AbstractC0244am[] m498a = this.f4909a.f5258bL.m498a();
        int size = this.f4909a.f5258bL.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                this.f4986az.add((AbstractC0623y) abstractC0244am);
            }
        }
        return this.f4986az;
    }

    /* renamed from: h */
    float m2033h() {
        return C0758f.m2158b((this.f4910b.f6135cl / 14.0f) / this.f4910b.f6132ci, 25.0f * this.f4910b.f6132ci, 40.0f * this.f4910b.f6132ci);
    }

    /* renamed from: c */
    private boolean m2046c(AbstractC0224s abstractC0224s) {
        if (abstractC0224s.mo4924s()) {
            return true;
        }
        if (abstractC0224s instanceof C0212g) {
            return this.f4909a.m1816m(((C0212g) abstractC0224s).f1433b);
        }
        ArrayList m2035g = m2035g();
        C0208c m4910N = abstractC0224s.m4910N();
        Iterator it = m2035g.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y.m4788a(m4910N) != null && this.f4909a.m1816m(abstractC0623y)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2064a(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        C0213h c0213h = null;
        if (abstractC0224s instanceof C0213h) {
            c0213h = (C0213h) abstractC0224s;
        }
        if (c0213h != null && c0213h.f1440d == C0797f.f5262bP) {
            return c0213h.f1441e;
        }
        boolean m2050b = m2050b(abstractC0224s, arrayList);
        if (c0213h != null) {
            c0213h.f1440d = C0797f.f5262bP;
            c0213h.f1441e = m2050b;
        }
        return m2050b;
    }

    /* renamed from: b */
    private boolean m2050b(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        if (abstractC0224s.mo4924s()) {
            return true;
        }
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            if (!c0212g.mo4861r(c0212g.f1433b)) {
                return false;
            }
            if (this.f4909a.m1816m(c0212g.f1433b) || c0212g.m4969a(c0212g.f1433b, this.f4910b.f6099bs)) {
                return true;
            }
            return false;
        }
        C0208c m4910N = abstractC0224s.m4910N();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0623y) it.next();
            AbstractC0224s a = abstractC0244am.m4788a(m4910N);
            if (a != null && a.mo4861r(abstractC0244am) && (this.f4909a.m1816m(abstractC0244am) || a.m4903a(abstractC0244am, this.f4910b.f6099bs))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m2045c(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        if (abstractC0224s.mo4924s()) {
            return true;
        }
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            if (c0212g.mo3086a((AbstractC0244am) c0212g.f1433b, true)) {
                return true;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0623y) it.next();
            AbstractC0224s a = abstractC0244am.m4788a(abstractC0224s.m4910N());
            if (a != null && a.mo3086a(abstractC0244am, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private float m2041d(AbstractC0224s abstractC0224s, ArrayList arrayList) {
        int i = 0;
        float f = -1.0f;
        if (abstractC0224s.mo4943l_()) {
            return -1.0f;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0623y) it.next();
            AbstractC0224s a = abstractC0244am.m4788a(abstractC0224s.m4910N());
            if (a != null) {
                float mo4858p = a.mo4858p(abstractC0244am);
                if (mo4858p > f) {
                    f = mo4858p;
                    i++;
                }
            }
        }
        return f;
    }

    /* renamed from: d */
    private C0554e m2042d(AbstractC0224s abstractC0224s) {
        float f = -1.0f;
        C0554e c0554e = null;
        if (abstractC0224s.mo4943l_()) {
            return null;
        }
        if (abstractC0224s instanceof C0212g) {
            C0554e m3221b = C0554e.m3221b(((C0212g) abstractC0224s).f1433b, abstractC0224s.m4910N());
            if (m3221b != null) {
                if (-1.0f < m3221b.m3237a()) {
                    f = m3221b.m3237a();
                    c0554e = m3221b;
                }
            } else {
                return null;
            }
        }
        Iterator it = this.f4909a.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.m4788a(abstractC0224s.m4910N()) == null) {
                    continue;
                } else {
                    C0554e m3221b2 = C0554e.m3221b(abstractC0623y, abstractC0224s.m4910N());
                    if (m3221b2 != null) {
                        if (f < m3221b2.m3237a()) {
                            f = m3221b2.m3237a();
                            c0554e = m3221b2;
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
    private float m2038e(AbstractC0224s abstractC0224s) {
        C0554e m2042d = m2042d(abstractC0224s);
        if (m2042d == null) {
            return 0.0f;
        }
        return m2042d.m3220c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m2051b(AbstractC0224s abstractC0224s) {
        C0554e m2042d = m2042d(abstractC0224s);
        if (m2042d == null) {
            return 0.0f;
        }
        return m2042d.m3218d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m2043d(float f) {
        ArrayList m2061a;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        C0930ag c0930ag;
        Rect rect;
        Rect rect2;
        int m5948a;
        int m1023ah;
        this.f4978ar = false;
        int i = 1;
        if (C0797f.f5248bB) {
            i = 2;
        }
        int i2 = 0;
        boolean z = false;
        C0794c.m1932a(f);
        ArrayList m2035g = m2035g();
        AbstractC0244am m2037f = m2037f();
        ArrayList arrayList = null;
        if (this.f4909a.f5159W != null) {
            arrayList = this.f4909a.f5159W.mo4938q(m2037f);
        }
        if (arrayList != null) {
            m2061a = arrayList;
        } else {
            m2061a = m2061a(m2037f, m2035g);
        }
        if (m2037f == null && m2061a.size() > 0) {
            m2037f = m2040e();
            if (m2037f == null && C0453l.f2903b != null) {
                m2037f = AbstractC0244am.m4736c(C0453l.f2903b);
            }
        }
        this.f4909a.f5125o = false;
        if (m2061a.contains(this.f4909a.f5118h)) {
            this.f4909a.f5125o = true;
        }
        if (m2037f == null) {
            m2037f = m2040e();
        }
        boolean z2 = true;
        if (m2037f == null) {
            this.f4966af = -1L;
        }
        if (m2037f != null && m2061a.size() > 0) {
            ArrayList arrayList2 = m2061a;
            float f8 = 2.0f;
            float m2033h = m2033h();
            float f9 = 2.0f;
            float f10 = m2033h + 2.0f;
            boolean z3 = false;
            if (!C0797f.f5250bD) {
                f2 = this.f4910b.f6121bW.m1777b() + 2;
                f3 = this.f4910b.f6134ck - this.f4910b.f6121bW.f5282c;
                f4 = this.f4910b.f6121bW.f5282c;
            } else {
                f2 = this.f4910b.f6121bW.f5281b;
                f3 = this.f4910b.f6121bW.f5282c;
                f4 = this.f4910b.f6121bW.f5282c;
                z3 = true;
            }
            if (C0797f.f5247bA) {
                m2033h += 15.0f * this.f4910b.f6132ci;
                float f11 = f10 + (15.0f * this.f4910b.f6132ci);
                f8 = 5.0f;
                if (Core.m1011at()) {
                    f8 = 2.0f;
                }
                f10 = f11 + 2.0f;
                f9 = 2.0f + 2.0f;
                f2 += 3.0f;
            }
            if (!C0797f.f5111a) {
                boolean z4 = true;
                if (this.f4909a.f5113c != null && this.f4909a.f5206aR == 1 && this.f4909a.f5113c.f1644cE) {
                    z4 = false;
                }
                if (z4) {
                    f2 = f2 + m2032i() + 2.0f;
                }
            }
            int i3 = 0;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                if (m2064a(abstractC0224s, m2035g)) {
                    i3++;
                    float mo3128l = f10 * abstractC0224s.mo3128l();
                    int i4 = i;
                    if (abstractC0224s.mo3127m() > 0) {
                        i4 = abstractC0224s.mo3127m();
                    }
                    float f15 = f4 / i4;
                    boolean z5 = false;
                    if ((f13 + f15) - 0.1f >= f4) {
                        z5 = true;
                    }
                    if (!z5 && f12 > 0.0f && mo3128l + 0.1f < f12) {
                        z5 = true;
                    }
                    if (z5) {
                        f14 += f12;
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    if (f12 < mo3128l) {
                        f12 = mo3128l;
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
            if (this.f4910b.settingEngine.showUnitGroups) {
                f5 = this.f4910b.f6155cG - (34.0f * this.f4910b.f6132ci);
            } else {
                f5 = this.f4910b.f6155cG;
            }
            this.f4966af = m2037f.f6951ee;
            float f19 = f18 - ((int) m2037f.f1577bq);
            float f20 = 0.0f;
            float f21 = 1.0f + (m2033h * 0.25f);
            boolean z6 = f16 - m2037f.f1577bq > f5 + f21;
            boolean z7 = m2037f.f1577bq > f21;
            this.f4978ar = z6 || z7;
            if (this.f4910b.settingEngine.mouseSupport && !this.f4909a.m1909a(this.f4910b.m1026ae(), this.f4910b.m1025af()) && (m1023ah = this.f4910b.m1023ah()) != 0) {
                f20 = -(m1023ah / 120.0f);
            }
            float f22 = 0.0f;
            if (z6) {
                this.f4931w.f230a = (int) (f3 + 2.0f);
                this.f4931w.f232c = (int) ((f3 + f4) - 2.0f);
                this.f4931w.f231b = (int) (f5 - (m2033h * 0.4f));
                this.f4931w.f233d = (int) (this.f4931w.f231b + (m2033h * 0.4f));
                if (this.f4909a.m1895a(this.f4931w.f230a, this.f4931w.f231b, this.f4931w.m5872b(), this.f4931w.m5868c(), "\\/", EnumC0798g.f5264a, false, Color.m5948a(80, 100, 150, 100), this.f4909a.f5185aw) && this.f4909a.m1913I()) {
                    f22 = 0.0f + (3.0f * f10);
                    this.f4909a.f5151O = false;
                }
                if (f20 > 0.0f) {
                    this.f4977aq = (float) (this.f4977aq + (0.5d * f10));
                }
                f5 -= (f10 * 0.4f) + 2.0f;
            }
            if (z7) {
                this.f4931w.f230a = (int) (f3 + 2.0f);
                this.f4931w.f232c = (int) ((f3 + f4) - 2.0f);
                this.f4931w.f231b = (int) f17;
                this.f4931w.f233d = (int) (this.f4931w.f231b + (m2033h * 0.4f));
                if (this.f4909a.m1895a(this.f4931w.f230a, this.f4931w.f231b, this.f4931w.m5872b(), this.f4931w.m5868c(), "/\\", EnumC0798g.f5264a, false, Color.m5948a(80, 100, 150, 100), this.f4909a.f5185aw) && this.f4909a.m1913I()) {
                    f22 -= 3.0f * f10;
                    this.f4909a.f5151O = false;
                }
                if (f20 < 0.0f) {
                    this.f4977aq = (float) (this.f4977aq - (0.5d * f10));
                }
                f17 += (f10 * 0.4f) + 2.0f;
            }
            this.f4910b.f6113bO.mo137i();
            this.f4987aA.m5861a(0.0f, f17 - 1.0f, this.f4910b.f6134ck, f5 + 1.0f);
            this.f4910b.f6113bO.mo206a(this.f4987aA);
            if (Core.m1011at()) {
                if (this.f4966af != m2037f.f6951ee) {
                    this.f4967ag = 0.0f;
                    this.f4968ah = m2037f.f1577bq;
                } else if (this.f4977aq != 0.0f) {
                    this.f4967ag = this.f4977aq;
                } else {
                    if (!this.f4909a.f5140D) {
                        this.f4977aq += this.f4967ag * f;
                    }
                    this.f4967ag = C0758f.m2211a(this.f4967ag, f);
                }
            }
            m2037f.f1577bq += this.f4977aq + f22;
            this.f4977aq = 0.0f;
            int i5 = (int) (f16 - f5);
            if (i5 > 0) {
                if (m2037f.f1577bq > i5 + 0.0f) {
                    m2037f.f1577bq = i5 + 0.0f;
                }
                if (m2037f.f1577bq < 0.0f - 0.0f) {
                    m2037f.f1577bq = 0.0f - 0.0f;
                }
            } else {
                m2037f.f1577bq = 0.0f;
            }
            int i6 = -1;
            float f23 = 0.0f;
            float f24 = 0.0f;
            float f25 = 0.0f;
            m2048c();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AbstractC0224s abstractC0224s2 = (AbstractC0224s) it2.next();
                if (m2064a(abstractC0224s2, m2035g)) {
                    i2++;
                    boolean m2045c = m2045c(abstractC0224s2, m2035g);
                    i6++;
                    float mo3128l2 = m2033h * abstractC0224s2.mo3128l();
                    int i7 = i;
                    if (abstractC0224s2.mo3127m() > 0) {
                        i7 = abstractC0224s2.mo3127m();
                    }
                    float f26 = f4 / i7;
                    if (!z3) {
                        f6 = mo3128l2;
                        f7 = f26;
                    } else {
                        f6 = f26;
                        f7 = mo3128l2;
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
                        this.f4931w.f230a = (int) (f3 + f8);
                        this.f4931w.f232c = (int) ((this.f4931w.f230a + f26) - (f8 * 2.0f));
                        this.f4931w.f231b = (int) (f23 + f19);
                        this.f4931w.f233d = (int) (this.f4931w.f231b + mo3128l2);
                        this.f4931w.m5875a((int) f25, 0);
                    } else {
                        this.f4931w.f230a = (int) (f3 + f8 + f23);
                        this.f4931w.f232c = (int) ((this.f4931w.f230a + f26) - (f8 * 2.0f));
                        this.f4931w.f231b = (int) f19;
                        this.f4931w.f233d = (int) (this.f4931w.f231b + mo3128l2);
                        this.f4931w.m5875a(0, (int) f25);
                    }
                    boolean z9 = true;
                    this.f4932x.m5860a(this.f4931w);
                    if (!this.f4932x.m5853b(this.f4987aA)) {
                        z9 = false;
                    }
                    f25 += f7;
                    EnumC0225t mo3079f = abstractC0224s2.mo3079f();
                    boolean z10 = false;
                    z10 = (mo3079f == EnumC0225t.f1471g || mo3079f == EnumC0225t.f1472h || mo3079f == EnumC0225t.f1473i) ? true : true;
                    boolean m2066a = m2066a(abstractC0224s2);
                    boolean mo4927G = abstractC0224s2.mo4927G();
                    Paint paint = this.f4918j;
                    boolean z11 = m2045c;
                    if (mo3079f == EnumC0225t.f1473i) {
                        z11 = true;
                    }
                    if (z11) {
                        paint.m5908b(Color.m5948a(70, 100, 100, 100));
                    } else {
                        paint.m5908b(Color.m5948a(50, 170, 100, 100));
                    }
                    if (m2066a) {
                        paint.m5908b(Color.m5948a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100));
                    }
                    boolean z12 = false;
                    boolean z13 = false;
                    if (this.f4963ac == m2037f && this.f4964ad == abstractC0224s2) {
                        z12 = true;
                    }
                    if (this.f4909a.f5159W == abstractC0224s2) {
                        z12 = true;
                        z13 = true;
                    }
                    if (z12) {
                        paint.m5908b(Color.m5948a(80, 100, 100, 200));
                    }
                    if (z13) {
                        paint.m5908b(Color.m5948a(80, 100, 200, 100));
                    }
                    if (mo4927G) {
                        paint.m5903c((int) (paint.m5894f() * 0.7f));
                        c0930ag = this.f4923o;
                    } else {
                        c0930ag = this.f4922n;
                    }
                    float f27 = 0.0f;
                    if (z9) {
                        f27 = C0794c.m1929b(m2037f, abstractC0224s2, false);
                        if (abstractC0224s2.mo3079f() != EnumC0225t.f1472h) {
                            boolean m1890a = this.f4909a.m1890a(abstractC0224s2);
                            float f28 = 0.0f;
                            if (m1890a) {
                                f28 = C0758f.m2137c(C0758f.m2092i((((float) (Core.m1067U() % 1000)) / 1000.0f) * 180.0f));
                            }
                            if (f27 != 0.0f) {
                                float m2158b = C0758f.m2158b((C0758f.m2137c(f27) * 0.7f) - 0.3f, 0.0f, 1.0f);
                                if (f27 > 0.0f) {
                                    m5948a = Color.m5948a(110, 210, 210, 210);
                                } else {
                                    m5948a = Color.m5948a(110, 210, 110, 110);
                                }
                                int m2202a = C0758f.m2202a(m5948a, paint.m5896e(), m2158b);
                                paint = this.f4917i;
                                paint.m5908b(m2202a);
                            }
                            this.f4909a.m1891a(this.f4931w, paint, c0930ag);
                            float m2041d = m2041d(abstractC0224s2, m2035g);
                            if (m2041d >= 0.0f) {
                                this.f4920l.m5933a(80, 0, 0, 100);
                                this.f4939E.m5873a(this.f4931w);
                                this.f4939E.f232c = (int) (rect2.f232c - ((1.0f - m2041d) * this.f4939E.m5872b()));
                                this.f4910b.f6113bO.mo162b(this.f4939E, this.f4920l);
                                this.f4921m.m5933a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                this.f4910b.f6113bO.mo225a(this.f4939E.f232c, this.f4939E.f231b, this.f4939E.f232c, this.f4939E.f233d, this.f4920l);
                            } else {
                                float m2038e = m2038e(abstractC0224s2);
                                if (m2038e > 0.0f) {
                                    this.f4920l.m5933a(80, 100, 0, 0);
                                    this.f4939E.m5873a(this.f4931w);
                                    this.f4939E.f232c = (int) (rect.f232c - ((1.0f - m2038e) * this.f4939E.m5872b()));
                                    this.f4910b.f6113bO.mo162b(this.f4939E, this.f4920l);
                                    this.f4921m.m5933a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 148, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2, 255);
                                    this.f4910b.f6113bO.mo225a(this.f4939E.f232c, this.f4939E.f231b, this.f4939E.f232c, this.f4939E.f233d, this.f4920l);
                                }
                            }
                            int m5948a2 = Color.m5948a(255, 0, 0, 0);
                            if (C0797f.f5247bA) {
                                m5948a2 = Color.m5948a(100, 0, 0, 0);
                                if (mo4927G) {
                                    m5948a2 = Color.m5948a(50, 155, 155, 155);
                                }
                            }
                            boolean z14 = false;
                            if (m1890a) {
                                z14 = true;
                                m5948a2 = Color.m5948a((int) (100.0f + (150.0f * f28)), 255, 255, 255);
                            }
                            this.f4909a.m1892a(this.f4931w, m5948a2, z14);
                        }
                    }
                    C0639ad m2065a = m2065a(abstractC0224s2, i6, arrayList2);
                    if (m2065a != null && z9) {
                        this.f4910b.f6113bO.mo181a(m2065a.m2729c(), this.f4931w.f230a + 3, this.f4931w.f231b + this.f4910b.f6113bO.mo179a("A", this.f4909a.f5182at) + 1.0f, this.f4909a.f5182at);
                    }
                    boolean z15 = false;
                    InterfaceC0303as mo6163i = abstractC0224s2.mo6163i();
                    C0934e mo4939j = abstractC0224s2.mo4939j();
                    AbstractC0244am mo4947i = abstractC0224s2.mo4947i(m2037f);
                    if (mo4947i != null) {
                        mo6163i = mo4947i.mo1758r();
                    }
                    if (mo4939j == null && mo6163i != null) {
                        mo4939j = mo6163i.mo4460z();
                    }
                    if (mo4939j != null) {
                        Rect mo4937v = abstractC0224s2.mo4937v();
                        if (mo4937v == null) {
                            mo4937v = this.f4939E;
                            mo4937v.m5874a(0, 0, mo4939j.mo386m(), mo4939j.mo387l());
                        }
                        float m5868c = (this.f4931w.m5868c() * 0.7f) / mo4937v.m5868c();
                        int m5867d = (int) (this.f4931w.m5867d() - ((mo4937v.m5872b() * 0.5f) * m5868c));
                        int m5866e = (int) (this.f4931w.m5866e() - ((mo4937v.m5868c() * 0.5f) * m5868c));
                        this.f4924p.m5933a(100, 255, 255, 255);
                        RectF rectF = this.f4940F;
                        rectF.m5861a(m5867d, m5866e, m5867d + (mo4937v.m5872b() * m5868c), m5866e + (mo4937v.m5868c() * m5868c));
                        this.f4910b.f6113bO.mo192a(mo4939j, mo4937v, rectF, this.f4924p);
                        z15 = true;
                    } else if (mo6163i != null) {
                        float m5867d2 = this.f4931w.m5867d();
                        float m5866e2 = this.f4931w.m5866e();
                        if (f27 > 0.5d) {
                            m5866e2 += 1.0f;
                        }
                        if (f27 < -0.5d) {
                            m5866e2 -= 1.0f;
                        }
                        float m5868c2 = this.f4931w.m5868c() * 0.7f;
                        float m5868c3 = this.f4931w.m5868c() * 0.95f;
                        if (C0797f.f5247bA) {
                            m5868c2 = this.f4931w.m5868c() * 0.4f;
                            m5868c3 = this.f4931w.m5868c() * 0.85f;
                        }
                        this.f4935A.m5860a(this.f4931w);
                        if (this.f4935A.m5853b(this.f4987aA)) {
                            this.f4910b.f6113bO.mo137i();
                            this.f4910b.f6113bO.mo206a(this.f4935A);
                            EnumC0249ar.m4626a(mo6163i, m5867d2, m5866e2, 0.0f, 0.0f, m2037f.f1609bV, m5868c2, m5868c3, false, false, abstractC0224s2.mo4860t(), mo4947i);
                            if (mo4947i != null) {
                                float m4772a_ = mo4947i.m4772a_();
                                float m4749bU = mo4947i.m4749bU();
                                if (m4749bU != -1.0f && abstractC0224s2.m4873t(m2037f)) {
                                    int m2152b = C0758f.m2152b(200, 0, 0, 150);
                                    int m2152b2 = C0758f.m2152b(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
                                    Paint m473a = C1117y.m473a(m2152b, Paint.Style.f219a);
                                    Paint m473a2 = C1117y.m473a(m2152b2, Paint.Style.f220b);
                                    int m5856b = ((int) (this.f4935A.m5856b() / 3.0f)) - 3;
                                    int i8 = m5856b * 2;
                                    this.f4940F.m5861a(m5867d2 - m5856b, m5866e2 + 0, (m5867d2 - m5856b) + (i8 * m4749bU), m5866e2 + 0 + 3);
                                    this.f4910b.f6113bO.mo205a(this.f4940F, m473a);
                                    this.f4940F.m5861a(m5867d2 - m5856b, m5866e2 + 0, (m5867d2 - m5856b) + i8, m5866e2 + 0 + 3);
                                    this.f4910b.f6113bO.mo205a(this.f4940F, m473a2);
                                } else if (m4772a_ != -1.0f && abstractC0224s2.m4874s(m2037f)) {
                                    int m2152b3 = C0758f.m2152b(200, 0, 150, 0);
                                    int m2152b4 = C0758f.m2152b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                                    Paint m473a3 = C1117y.m473a(m2152b3, Paint.Style.f219a);
                                    Paint m473a4 = C1117y.m473a(m2152b4, Paint.Style.f220b);
                                    int m5856b2 = ((int) (this.f4935A.m5856b() / 3.0f)) - 3;
                                    int i9 = m5856b2 * 2;
                                    this.f4940F.m5861a(m5867d2 - m5856b2, m5866e2 + 0, (m5867d2 - m5856b2) + (i9 * m4772a_), m5866e2 + 0 + 3);
                                    this.f4910b.f6113bO.mo205a(this.f4940F, m473a3);
                                    this.f4940F.m5861a(m5867d2 - m5856b2, m5866e2 + 0, (m5867d2 - m5856b2) + i9, m5866e2 + 0 + 3);
                                    this.f4910b.f6113bO.mo205a(this.f4940F, m473a4);
                                }
                            }
                            this.f4910b.f6113bO.mo136j();
                        }
                        z15 = true;
                    }
                    C0934e mo4948h = abstractC0224s2.mo4948h(m2037f);
                    if (mo4948h != null) {
                        Rect mo4937v2 = abstractC0224s2.mo4937v();
                        if (mo4937v2 == null) {
                            mo4937v2 = this.f4939E;
                            mo4937v2.m5874a(0, 0, mo4948h.mo386m(), mo4948h.mo387l());
                        }
                        float m5868c4 = (this.f4931w.m5868c() * 0.7f) / mo4937v2.m5868c();
                        int m5867d3 = (int) (this.f4931w.m5867d() - ((mo4937v2.m5872b() * 0.5f) * m5868c4));
                        int m5866e3 = (int) (this.f4931w.m5866e() - ((mo4937v2.m5868c() * 0.5f) * m5868c4));
                        this.f4924p.m5908b(abstractC0224s2.m4912J());
                        RectF rectF2 = this.f4940F;
                        rectF2.m5861a(m5867d3, m5866e3, m5867d3 + (mo4937v2.m5872b() * m5868c4), m5866e3 + (mo4937v2.m5868c() * m5868c4));
                        this.f4910b.f6113bO.mo192a(mo4948h, mo4937v2, rectF2, this.f4924p);
                        z15 = true;
                    }
                    if (z9) {
                        String mo3129d = abstractC0224s2.mo3129d();
                        if (m2066a) {
                            this.f4910b.f6113bO.mo198a(this.f4957W, this.f4931w.f230a + 25, this.f4931w.m5864g(), (Paint) null);
                        }
                        if (this.f4910b.f6113bO.mo157b(mo3129d, this.f4909a.f5185aw) > this.f4931w.m5872b() - 2) {
                            if (this.f4910b.f6113bO.mo157b(mo3129d, this.f4909a.f5184av) > this.f4931w.m5872b() - 2) {
                                this.f4917i.m5925a(this.f4909a.f5183au);
                            } else {
                                this.f4917i.m5925a(this.f4909a.f5184av);
                            }
                        } else {
                            this.f4917i.m5925a(this.f4909a.f5185aw);
                        }
                        if (!z11) {
                            this.f4917i.m5908b(Color.m5948a(255, 0, 100, 0));
                        }
                        if (mo3079f == EnumC0225t.f1466b) {
                            this.f4917i.m5933a(255, 255, 255, 255);
                        } else if (mo3079f == EnumC0225t.f1467c || mo3079f == EnumC0225t.f1470f) {
                            if (!z11) {
                                this.f4917i.m5933a(255, 19, 101, 94);
                            } else {
                                this.f4917i.m5933a(255, 39, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_2);
                            }
                        } else if (mo3079f == EnumC0225t.f1468d) {
                            InterfaceC0303as mo6163i2 = abstractC0224s2.mo6163i();
                            if (mo6163i2 != null && mo6163i2.mo4476g() > 1) {
                                if (!z11) {
                                    this.f4917i.m5933a(255, 117, 120, 15);
                                } else {
                                    this.f4917i.m5933a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                                }
                            }
                        } else if (z10) {
                            this.f4917i.m5933a(155, 255, 255, 255);
                        }
                        int mo179a = this.f4910b.f6113bO.mo179a(mo3129d, this.f4917i);
                        float m5864g = this.f4931w.m5864g() + (mo179a / 2);
                        if (z10) {
                            m5864g = this.f4931w.m5864g();
                        }
                        if (z15 && !mo3129d.contains("\n")) {
                            if (z10) {
                                m5864g = (this.f4931w.f233d - (mo179a / 2)) - 1;
                            } else {
                                m5864g = this.f4931w.f233d - 6;
                            }
                        }
                        if (z10) {
                            C0924aa.m938a(mo3129d, this.f4931w.m5865f(), m5864g, this.f4917i);
                        } else {
                            this.f4910b.f6113bO.mo181a(mo3129d, this.f4931w.m5865f(), m5864g, this.f4917i);
                        }
                    }
                    boolean z16 = false;
                    boolean z17 = false;
                    boolean z18 = false;
                    if (m2065a != null && m2065a.m2738a()) {
                        z16 = true;
                        z18 = true;
                    }
                    this.f4933y.m5873a(this.f4931w);
                    if (Core.m1011at()) {
                        C0758f.m2150b(this.f4933y, 2.0f);
                    }
                    this.f4909a.m1907a(this.f4933y.f230a, this.f4933y.f231b, this.f4933y.m5872b(), this.f4933y.m5868c());
                    if (!this.f4912d && this.f4933y.m5871b((int) this.f4909a.f5131u, (int) this.f4909a.f5132v) && this.f4987aA.m5855b((int) this.f4909a.f5131u, (int) this.f4909a.f5132v)) {
                        z = true;
                        if (Core.m1010au()) {
                            z17 = true;
                        }
                        if ((this.f4909a.f5151O || this.f4909a.f5140D) && this.f4909a.f5151O && this.f4909a.m1913I()) {
                            this.f4909a.f5151O = false;
                            z16 = true;
                        }
                    }
                    if (Core.m1010au() && this.f4909a.f5159W == null) {
                        if (z17) {
                            this.f4963ac = m2037f;
                            this.f4964ad = abstractC0224s2;
                            this.f4965ae = f23 + f19;
                        } else if (AbstractC0224s.m4905a(this.f4964ad, abstractC0224s2)) {
                            this.f4963ac = null;
                            this.f4964ad = null;
                        }
                    }
                    boolean z19 = false;
                    if (z16 && !z18 && this.f4910b.settingEngine.mouseSupport && this.f4910b.m980e(2)) {
                        z19 = true;
                    }
                    if (z16) {
                        C0797f.m1912J();
                        if (abstractC0224s2.mo4952c(m2037f, z19)) {
                            z16 = false;
                        }
                        if (this.f4910b.f6126cb.m2464h()) {
                            z16 = false;
                        }
                        if (!m2046c(abstractC0224s2)) {
                            z16 = false;
                        }
                    }
                    if (z16) {
                        if (abstractC0224s2.mo3081e() == EnumC0226u.f1475a || abstractC0224s2.mo3081e() == EnumC0226u.f1477c) {
                            this.f4909a.f5159W = null;
                            boolean z20 = false;
                            if (z18) {
                                z20 = true;
                            } else if (!abstractC0224s2.mo4857u()) {
                                z20 = true;
                            } else {
                                if (abstractC0224s2.m4882k(m2037f)) {
                                    z20 = true;
                                } else if (this.f4963ac == m2037f && AbstractC0224s.m4905a(this.f4964ad, abstractC0224s2)) {
                                    z20 = true;
                                }
                                this.f4963ac = m2037f;
                                this.f4964ad = abstractC0224s2;
                                this.f4965ae = f23 + f19;
                            }
                            if (z20) {
                                int i10 = 1;
                                if (abstractC0224s2.mo3078g()) {
                                    if (this.f4909a.m1870a(this.f4910b)) {
                                        i10 = 5;
                                    }
                                    if (this.f4909a.m1851b(this.f4910b)) {
                                        i10 = 10;
                                    }
                                }
                                boolean z21 = false;
                                if (!z18) {
                                    boolean z22 = false;
                                    if (m2037f != null && abstractC0224s2.mo3083b(m2037f, false) != -1) {
                                        z22 = true;
                                    }
                                    if (z19 && z22) {
                                        z21 = true;
                                    }
                                }
                                if (m2066a(abstractC0224s2)) {
                                    this.f4910b.f6111bM.m2770b(C0631e.f4046l, 0.8f);
                                } else if (!m2045c && !z21) {
                                    this.f4910b.f6111bM.m2770b(C0631e.f4046l, 0.8f);
                                } else {
                                    boolean mo3078g = abstractC0224s2.mo3078g();
                                    if (mo3078g && !z21 && this.f4910b.f6099bs.m5006v() <= this.f4910b.f6099bs.m5007u()) {
                                        this.f4909a.m1850b(this.f4974an);
                                    }
                                    if (mo3078g) {
                                        if (!z21) {
                                            this.f4910b.f6111bM.m2770b(C0631e.f4042h, 0.5f);
                                        } else {
                                            this.f4910b.f6111bM.m2770b(C0631e.f4043i, 0.5f);
                                        }
                                    } else {
                                        this.f4910b.f6111bM.m2770b(C0631e.f4041g, 0.8f);
                                    }
                                    C0794c.m1930a(m2037f, abstractC0224s2, z21, false);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        C0749e m1801w = this.f4909a.m1801w();
                                        if (!abstractC0224s2.m4913I()) {
                                            this.f4909a.m1875a(m1801w, abstractC0224s2);
                                        } else {
                                            this.f4909a.m1874a(m1801w, abstractC0224s2, z21);
                                        }
                                        if (z21) {
                                            m1801w.f4844g = true;
                                        }
                                        m1801w.m2324a(abstractC0224s2.m4867z());
                                        if (!z21) {
                                            this.f4909a.m1888a(abstractC0224s2, (PointF) null, (AbstractC0244am) null, m1801w);
                                        }
                                    }
                                }
                            }
                        } else if (abstractC0224s2.mo3081e() == EnumC0226u.f1487m || abstractC0224s2.mo3081e() == EnumC0226u.f1486l || abstractC0224s2.mo3081e() == EnumC0226u.f1484j) {
                            if (z19) {
                                if (abstractC0224s2 != null && abstractC0224s2.equals(this.f4909a.f5159W)) {
                                    this.f4909a.m1821k();
                                }
                            } else if (!m2045c) {
                                this.f4910b.f6111bM.m2770b(C0631e.f4046l, 0.8f);
                            } else {
                                C0794c.m1930a(m2037f, abstractC0224s2, false, false);
                                this.f4963ac = null;
                                this.f4964ad = null;
                                this.f4909a.f5159W = abstractC0224s2;
                            }
                        } else if (abstractC0224s2.mo3081e() == EnumC0226u.f1478d || abstractC0224s2.mo3081e() == EnumC0226u.f1479e || abstractC0224s2.mo3081e() == EnumC0226u.f1480f || abstractC0224s2.mo3081e() == EnumC0226u.f1481g) {
                            boolean z23 = false;
                            boolean z24 = false;
                            if (abstractC0224s2.mo3081e() == EnumC0226u.f1481g) {
                                z24 = true;
                            }
                            if (z19 && z24) {
                                z23 = true;
                            }
                            if (!z23) {
                                Core.LogDebug2("Clicked button: actionActive: " + m2045c);
                                if (!m2045c) {
                                    this.f4910b.f6111bM.m2770b(C0631e.f4046l, 0.8f);
                                } else {
                                    C0794c.m1930a(m2037f, abstractC0224s2, false, false);
                                    this.f4963ac = null;
                                    this.f4964ad = null;
                                    this.f4909a.f5159W = abstractC0224s2;
                                }
                            } else {
                                C0749e m1801w2 = this.f4909a.m1801w();
                                if (!abstractC0224s2.m4913I()) {
                                    this.f4909a.m1875a(m1801w2, abstractC0224s2);
                                } else {
                                    this.f4909a.m1874a(m1801w2, abstractC0224s2, z23);
                                }
                                m1801w2.f4844g = true;
                                m1801w2.m2324a(abstractC0224s2.m4867z());
                            }
                        } else if (abstractC0224s2.mo3081e() == EnumC0226u.f1476b) {
                            if (m2066a(abstractC0224s2)) {
                                this.f4910b.f6111bM.m2770b(C0631e.f4046l, 0.8f);
                            } else if (!m2045c) {
                                this.f4910b.f6111bM.m2770b(C0631e.f4046l, 0.8f);
                            } else {
                                this.f4910b.f6111bM.m2770b(C0631e.f4041g, 0.8f);
                            }
                            C0794c.m1930a(m2037f, abstractC0224s2, false, false);
                            this.f4963ac = null;
                            this.f4964ad = null;
                            if (this.f4909a.f5159W == null) {
                                this.f4909a.f5165ac = false;
                            }
                            this.f4909a.f5157U = m2037f;
                            this.f4909a.f5159W = abstractC0224s2;
                            this.f4909a.f5162Z = 0.0f;
                            this.f4909a.f5173ak = -99.0f;
                            this.f4909a.f5174al = -99.0f;
                            if (!this.f4909a.f5161Y) {
                                this.f4909a.f5163aa = this.f4910b.f6156cH * this.f4910b.f6256cW;
                                this.f4909a.f5164ab = this.f4910b.f6157cI * this.f4910b.f6256cW;
                            }
                            this.f4909a.f5161Y = true;
                            this.f4910b.f6110bL.m5292e();
                        } else if (abstractC0224s2.mo3081e() == EnumC0226u.f1485k) {
                            C0794c.m1930a(m2037f, abstractC0224s2, false, false);
                            abstractC0224s2.m4895c(m2037f);
                        } else if (abstractC0224s2.mo3081e() == EnumC0226u.f1483i) {
                            if (abstractC0224s2.m4918C()) {
                                this.f4963ac = m2037f;
                                this.f4964ad = abstractC0224s2;
                                this.f4965ae = f23 + f19;
                                this.f4909a.f5159W = null;
                            }
                        } else {
                            throw new RuntimeException("unknown gui action:" + abstractC0224s2.mo3081e());
                        }
                    }
                    if (this.f4964ad == abstractC0224s2) {
                        z2 = m2045c;
                    }
                }
            }
            this.f4910b.f6113bO.mo136j();
            this.f4987aA.m5848f();
        }
        if (m2037f != null && m2037f == this.f4963ac) {
            if (this.f4964ad != null) {
                boolean z25 = true;
                if (Core.m1010au()) {
                    z25 = false;
                }
                boolean z26 = false;
                if (this.f4964ad.mo4857u()) {
                    z26 = true;
                }
                if (Core.m1010au() && this.f4964ad.mo3077h()) {
                    z26 = true;
                }
                if (z26) {
                    boolean z27 = true;
                    if (!z2) {
                        z27 = false;
                    }
                    if (this.f4909a.m1885a(this.f4964ad, z25, this.f4963ac, !z27, true, this.f4965ae, false)) {
                        this.f4963ac = null;
                    }
                }
            }
        } else {
            this.f4963ac = null;
        }
        if (Core.m1010au() && !z) {
            this.f4963ac = null;
            this.f4964ad = null;
        }
        return i2;
    }

    /* renamed from: i */
    float m2032i() {
        return (float) (C0758f.m2158b((this.f4910b.f6135cl / 14.0f) / this.f4910b.f6132ci, 25.0f * this.f4910b.f6132ci, 40.0f * this.f4910b.f6132ci) * 0.9d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2071a(float f, int i) {
        boolean z = true;
        if (i == 0) {
            z = true;
        }
        if (C0797f.f5111a) {
            z = false;
        }
        if (this.f4909a.f5206aR > 0) {
            if (this.f4909a.f5113c != null && this.f4909a.f5206aR == 1 && this.f4909a.f5113c.f1644cE) {
                z = false;
            }
            if (z) {
                if (this.f4909a.m1855b((int) ((this.f4910b.f6134ck - this.f4910b.f6121bW.f5282c) + 2.0f), this.f4910b.f6121bW.m1777b() + 2, (int) (this.f4910b.f6121bW.f5282c - 4.0f), (int) m2032i(), this.f4969ai, EnumC0798g.f5266c, false, Color.m5948a(140, 100, 100, 100)) && !this.f4909a.f5150N) {
                    this.f4909a.m1840d();
                    this.f4909a.m1821k();
                    this.f4909a.m1800x();
                }
            }
            AbstractC0197n abstractC0197n = null;
            boolean z2 = false;
            this.f4988aB.clear();
            AbstractC0244am abstractC0244am = null;
            AbstractC0244am[] m498a = this.f4909a.f5258bL.m498a();
            int size = this.f4909a.f5258bL.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0244am abstractC0244am2 = m498a[i2];
                if (abstractC0244am2.f1644cE) {
                    abstractC0244am = abstractC0244am2;
                    if (this.f4909a.m1816m(abstractC0244am2)) {
                        InterfaceC0303as mo1758r = abstractC0244am2.mo1758r();
                        Integer num = (Integer) this.f4988aB.get(mo1758r);
                        if (num == null) {
                            this.f4988aB.put(mo1758r, 1);
                        } else {
                            this.f4988aB.put(mo1758r, Integer.valueOf(num.intValue() + 1));
                        }
                        z2 = true;
                    } else {
                        abstractC0197n = abstractC0244am2.f1609bV;
                    }
                }
            }
            boolean z3 = this.f4910b.f6100bv;
            if (abstractC0197n != null && this.f4910b.f6099bs != null && abstractC0197n.m5070b(this.f4910b.f6099bs)) {
                z3 = true;
            }
            int m2033h = (int) m2033h();
            int i3 = m2033h + 2;
            int i4 = (int) (10.0f * this.f4910b.f6132ci);
            float m1777b = this.f4910b.f6121bW.m1777b() + m2033h + 30;
            float f2 = (this.f4910b.f6134ck - this.f4910b.f6138cp) + i4;
            float f3 = m1777b + 5.0f;
            if (abstractC0244am != null) {
                f3 = f3 + i3 + (i3 * i);
                if (this.f4909a.f5125o) {
                    f3 -= (2 * i3) * 0.4f;
                }
            }
            this.f4931w.m5874a((int) f2, (int) f3, (int) ((f2 + this.f4910b.f6138cp) - (i4 * 2)), (int) (f3 + m2033h));
            boolean z4 = false;
            if (!C0797f.f5249bC) {
                if (i < 3 && !z2 && abstractC0197n != null) {
                    Paint paint = this.f4909a.f5188az;
                    if (this.f4910b.f6099bs.m5042d(abstractC0197n)) {
                        paint = this.f4909a.f5189aA;
                    }
                    this.f4909a.m1864a(m2067a(abstractC0197n), this.f4931w, paint, paint);
                    z4 = true;
                }
                if (this.f4909a.m1811p() == 1 && abstractC0244am != null) {
                    if (abstractC0244am.m4692cp() <= 3 || (abstractC0197n != null && !z3)) {
                        String m2060a = m2060a(abstractC0244am, false);
                        if (z4) {
                            m2060a = "\n" + ("\n" + ("\n" + m2060a));
                        }
                        Paint paint2 = this.f4917i;
                        paint2.m5937a();
                        paint2.m5908b(Color.m5948a(50, 100, 100, 100));
                        this.f4909a.m1864a(m2060a, this.f4931w, this.f4909a.f5190aB, this.f4909a.f5190aB);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public String m2067a(AbstractC0197n abstractC0197n) {
        String str = VariableScope.nullOrMissingString;
        boolean z = false;
        if (this.f4910b.f6099bs.m5074b()) {
            z = true;
        } else if (this.f4910b.f6099bs.m5042d(abstractC0197n)) {
            str = str + this.f4970aj;
        } else if (this.f4910b.f6099bs.m5054c(abstractC0197n)) {
            str = str + this.f4971ak;
        } else {
            z = true;
        }
        if (z) {
            if (abstractC0197n == AbstractC0197n.f1371i) {
                str = str + this.f4972al;
            } else {
                str = str + "Team - " + abstractC0197n.m5025h();
            }
        }
        String str2 = str + "\n";
        if (abstractC0197n.f1316u != null) {
            str2 = str2 + abstractC0197n.f1316u;
        }
        if (!abstractC0197n.f1317v && this.f4910b.m1075M() && abstractC0197n.m5002z()) {
            str2 = (str2 + "\n") + "(disconnected)";
        }
        return str2;
    }

    /* renamed from: a */
    public String m2060a(AbstractC0244am abstractC0244am, boolean z) {
        String str;
        String str2 = VariableScope.nullOrMissingString;
        if (z) {
            str2 = str2 + abstractC0244am.mo1758r().mo4478e() + "\n";
        }
        if (abstractC0244am.mo3352g() > 0.0f) {
            str = str2 + C0424b.m4117a(abstractC0244am.m4722cL(), abstractC0244am.f1632cs / abstractC0244am.f1633ct).m4107a(true, true, 3, false);
        } else {
            str = str2 + ((int) Math.ceil(abstractC0244am.f1632cs)) + "/" + ((int) abstractC0244am.f1633ct) + "\n";
        }
        if (abstractC0244am.f1638cy != 0.0f) {
            str = str + "(" + ((int) abstractC0244am.f1635cv) + "/" + ((int) abstractC0244am.f1638cy) + ")\n";
        }
        C0424b m4665do = abstractC0244am.m4665do();
        C0439f m4685cx = abstractC0244am.m4685cx();
        if (m4665do != null) {
            m4685cx = C0439f.m3991d(m4685cx);
            m4685cx.m4024a(m4665do);
        }
        if (!m4685cx.m3999c()) {
            Iterator it = m4685cx.f2802b.iterator();
            while (it.hasNext()) {
                C0438e c0438e = (C0438e) it.next();
                if (c0438e.f2800b != 0.0d && !c0438e.f2799a.m4060a()) {
                    str = str + c0438e.f2799a.m4057a(c0438e.f2800b, true, false) + "\n";
                }
            }
        }
        return C0758f.m2088j(str);
    }

    /* renamed from: a */
    public static String m2063a(AbstractC0224s abstractC0224s, boolean z) {
        String str;
        AbstractC0228w abstractC0228w;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        String str2 = VariableScope.nullOrMissingString;
        if (abstractC0224s instanceof AbstractC0228w) {
            if (((AbstractC0228w) abstractC0224s).mo3369K() < 1.0f) {
                Core m1087A = Core.m1087A();
                float f = -1.0f;
                AbstractC0244am[] m498a = m1087A.f6117bS.f5258bL.m498a();
                int size = m1087A.f6117bS.f5258bL.size();
                for (int i = 0; i < size; i++) {
                    float m4687cv = m498a[i].m4687cv();
                    if (f == -1.0f || m4687cv < f) {
                        f = m4687cv;
                    }
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                str2 = str2 + C0758f.m2102g((1.0f / ((abstractC0228w.mo3369K() * f) * 60.0f)) + 1.0E-4f) + str;
            }
        }
        return C0758f.m2174a(str2, str);
    }

    /* renamed from: a */
    public static String m2059a(AbstractC0244am abstractC0244am, boolean z, boolean z2, boolean z3) {
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
            str2 = str2 + abstractC0244am.mo1758r().mo4478e() + str;
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
        C0424b m4665do = abstractC0244am.m4665do();
        float m4686cw = abstractC0244am.m4686cw();
        if (m4665do != null) {
            m4686cw += m4665do.m4126a();
        }
        if (m4686cw != 0.0f) {
            if (m4686cw < 0.0f) {
                str2 = str2 + "Income: -$" + C0758f.m2206a(-m4686cw, 1) + str;
            } else {
                str2 = str2 + "Income: +$" + C0758f.m2206a(m4686cw, 1) + str;
            }
        }
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
            if (abstractC0623y.m2875bd() != 0.0f && !z3) {
                str2 = str2 + "Energy: " + C0758f.m2109f(abstractC0244am.f1639cz) + "/" + C0758f.m2109f(abstractC0623y.m2875bd()) + str;
            }
            float mo3033z = abstractC0623y.mo3033z();
            if (!abstractC0623y.m2936aR()) {
                mo3033z = 0.0f;
            }
            if (mo3033z != 0.0f) {
                str2 = str2 + "Speed: " + C0758f.m2109f(mo3033z) + str;
            }
            if (abstractC0623y.mo3036l()) {
                ArrayList m2930aX = abstractC0623y.m2930aX();
                if (m2930aX.size() > 0) {
                    String str3 = str2 + "Attack: ";
                    boolean z4 = true;
                    Iterator it = m2930aX.iterator();
                    while (it.hasNext()) {
                        C0232aa c0232aa = (C0232aa) it.next();
                        if (!z4) {
                            str3 = str3 + ", ";
                        }
                        z4 = false;
                        String str4 = str3 + C0758f.m2109f(c0232aa.f1498a);
                        if (c0232aa.f1501d > 1) {
                            str4 = str4 + "x" + c0232aa.f1501d;
                        }
                        str3 = str4 + "/" + C0758f.m2109f(c0232aa.m4839a()) + "s";
                    }
                    str2 = str3 + str;
                }
            }
            float mo3035m = abstractC0623y.mo3035m();
            if (!abstractC0623y.mo3036l()) {
                mo3035m = 0.0f;
            }
            if (mo3035m != 0.0f) {
                str2 = str2 + "Range: " + C0758f.m2109f(mo3035m) + str;
            }
            if (z3 && abstractC0623y.m4698cj()) {
                str2 = str2 + "Upgradable" + str;
            }
        }
        if (!z3 && abstractC0244am.f1658cS > 0) {
            str2 = str2 + "Kills: " + abstractC0244am.f1658cS + str;
        }
        boolean z5 = false;
        if (Core.m1087A().f6231bl) {
            InterfaceC0303as mo1758r = abstractC0244am.mo1758r();
            str2 = ((str2 + "\n") + "--Debug--" + str) + "name: " + mo1758r.mo4474i() + str;
            if ((mo1758r instanceof C0453l) && (c0824b = ((C0453l) mo1758r).f2919I) != null) {
                str2 = str2 + "(mod: " + C0758f.m2177a(c0824b.m1691a(), 30) + ")" + str;
            }
            if (abstractC0244am.f6951ee != 0) {
                str2 = str2 + "id: " + abstractC0244am.f6951ee + str;
            }
            if (abstractC0244am.f1643cD != 0) {
                String str5 = VariableScope.nullOrMissingString;
                for (int i = 0; i < 32; i++) {
                    if (C0424b.m4124a(abstractC0244am.f1643cD, i)) {
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
                str2 = (str2 + "x: " + C0758f.m2109f(abstractC0244am.f6958el) + str) + "y: " + C0758f.m2109f(abstractC0244am.f6959em) + str;
            }
            if (abstractC0244am.f1614ca != 0.0f || abstractC0244am.f1615cb != 0.0f) {
                str2 = str2 + "x/y speed: " + C0758f.m2109f(abstractC0244am.f1614ca) + ", " + C0758f.m2109f(abstractC0244am.f1615cb) + str;
            }
            if (!abstractC0244am.f1627cn) {
                str2 = (str2 + "height: " + C0758f.m2109f(abstractC0244am.f6960en) + str) + "dir: " + C0758f.m2109f(abstractC0244am.f1618ce) + str;
            }
            if (abstractC0244am.f1624ck < 1.0f) {
                str2 = str2 + "built: " + C0758f.m2109f(abstractC0244am.f1624ck) + str;
            }
            if (abstractC0244am instanceof C0451j) {
                C0451j c0451j2 = (C0451j) abstractC0244am;
                str2 = (str2 + "frame: " + c0451j2.f2840a + str) + "drawLayer: " + c0451j2.f6956ej + str;
                if (c0451j2.m3791dc() != null) {
                    str2 = str2 + "tags: " + c0451j2.m3791dc() + str;
                }
                if (c0451j2.f1652cM != null) {
                    str2 = str2 + "attachedTo: " + c0451j2.f1652cM.m4683cz() + str;
                }
                if (c0451j2.f1580bt != null && !c0451j2.f1580bt.f1607bT) {
                    str2 = str2 + "customTarget1: " + c0451j2.f1580bt.m4683cz() + str;
                }
                if (c0451j2.f1581bu != null && !c0451j2.f1581bu.f1607bT) {
                    str2 = str2 + "customTarget2: " + c0451j2.f1581bu.m4683cz() + str;
                }
                if (c0451j2.f1586bz != -9999) {
                    str2 = str2 + "customTimer: " + C0758f.m2102g(c0451j2.f1586bz / 1000.0f) + str;
                }
                if (c0451j2.f1582bv != null && !c0451j2.f1582bv.isEmpty()) {
                    str2 = str2 + "-- memory --: " + str + c0451j2.f1582bv.debugMemory(true, true) + str;
                }
            }
            z5 = true;
        }
        C0439f mo1759dd = abstractC0244am.mo1759dd();
        if (mo1759dd != null && !mo1759dd.m3999c()) {
            String m4010a = mo1759dd.m4010a(z2, true, 10, z5, false);
            if (!m4010a.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + m4010a + str;
            }
        }
        return C0758f.m2174a(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m2031j() {
        Iterator it = this.f4989aC.iterator();
        while (it.hasNext()) {
            ((C0784ac) it.next()).f5074h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m2030k() {
        Iterator it = this.f4989aC.iterator();
        while (it.hasNext()) {
            ((C0784ac) it.next()).m1962b();
        }
        this.f4975ao = null;
        this.f4976ap = 0.0f;
    }

    /* renamed from: a */
    void m2068a(int i, int i2, int i3, String str, String str2, Paint paint, float f) {
        int i4 = (int) (i3 * 2.5d);
        int i5 = (int) (40.0f * this.f4910b.f6132ci);
        int i6 = i + (i3 / 2);
        int i7 = (int) ((i2 - i5) - (35.0f * this.f4910b.f6132ci));
        this.f4990aD.m5874a(i6 - (i4 / 2), i7, i4, i5);
        this.f4909a.m1897a(this.f4990aD.f230a, this.f4990aD.f231b, this.f4990aD.f232c, this.f4990aD.f233d, VariableScope.nullOrMissingString, Color.m5948a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, 100), this.f4909a.f5185aw, false);
        this.f4931w.m5874a(this.f4990aD.f230a, this.f4990aD.f231b, this.f4990aD.f232c, this.f4990aD.f233d);
        Rect rect = this.f4931w;
        rect.f232c = (int) (rect.f232c * f);
        this.f4910b.f6113bO.mo151c(this.f4931w, paint);
        this.f4910b.f6113bO.mo181a(str, i6, i7 + ((this.f4909a.f5185aw.m5888k() + 5.0f) * 1.0f), this.f4909a.f5185aw);
        this.f4910b.f6113bO.mo181a(str2, i6, i7 + ((this.f4909a.f5185aw.m5888k() + 5.0f) * 2.0f), this.f4909a.f5185aw);
    }

    /* renamed from: l */
    void m2029l() {
        this.f4992aF.clear();
        this.f4992aF.add(new C07611("Finish game"));
        this.f4992aF.add(new C07622("Keep playing"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a$1.class */
    public class C07611 extends AbstractC0793b {
        C07611(String str) {
            super(C0760a.this, str);
        }

        /* renamed from: a */
        void mo1934a() {
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
        void mo1934a() {
            C0760a.this.f4910b.f6268dq = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2039e(float f) {
        String str;
        boolean z = false;
        if ((this.f4910b.f6267dp || this.f4910b.f6270ds) && !this.f4910b.f6268dq) {
            z = true;
        }
        if (!this.f4910b.f6267dp) {
            this.f4993aG = false;
        } else if (!this.f4993aG) {
            this.f4993aG = true;
            if (!this.f4910b.f6228ar && this.f4910b.settingEngine.numberOfWins >= 5 && !this.f4910b.settingEngine.rateGameShown && Core.f6192au) {
                this.f5000aN = true;
                this.f4910b.settingEngine.rateGameShown = true;
                this.f4910b.settingEngine.save();
            }
        }
        if (!z) {
            this.f4994aH = 0.0f;
            this.f4996aJ = 0;
        }
        if (!z || this.f4910b.f6239bx >= 120 || this.f4910b.f6117bS.f5113c != null) {
        }
        if (z && !this.f4909a.f5126p) {
            this.f4994aH += f;
            if (this.f4910b.f6239bx < 120) {
                this.f4994aH = 100000.0f;
            }
            boolean z2 = this.f4994aH > 80.0f;
            boolean z3 = this.f4994aH > 100.0f;
            boolean z4 = this.f4994aH > 160.0f;
            if (this.f4996aJ == 0) {
                this.f4996aJ = 1;
            }
            int m1057a = this.f4910b.m1057a(210);
            this.f4931w.f230a = (int) ((this.f4910b.f6153cE / 2.0f) - (m1057a / 2));
            this.f4931w.f232c = (int) ((this.f4910b.f6153cE / 2.0f) + (m1057a / 2));
            int m1057a2 = this.f4910b.m1057a(30);
            int m1057a3 = m1057a2 + this.f4910b.m1057a(30);
            int m1057a4 = this.f4910b.m1057a(40) + (m1057a3 * this.f4992aF.size());
            float f2 = this.f4910b.f6137co - (m1057a4 / 2);
            if (f2 > 50.0f) {
                f2 /= 2.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            this.f4931w.f231b = (int) f2;
            this.f4931w.f233d = this.f4931w.f231b + m1057a4;
            if (z2) {
                this.f4910b.f6113bO.mo195a(this.f4909a.f5220bf, this.f4931w, (Paint) null);
                this.f4910b.f6113bO.mo162b(this.f4931w, this.f4909a.f5198aJ);
            }
            Rect rect = new Rect(this.f4931w);
            int m1057a5 = this.f4931w.f231b + this.f4910b.m1057a(20);
            int m1057a6 = this.f4910b.m1057a(140);
            int i = (int) ((this.f4910b.f6153cE / 2.0f) - (m1057a6 / 2));
            int m5948a = Color.m5948a(140, 100, 100, 100);
            int i2 = i + (m1057a6 / 2);
            Paint paint = this.f4925q;
            String str2 = "Victory!";
            if (this.f4910b.f6270ds) {
                str2 = "Defeat";
            }
            float f3 = 1.0f;
            if (this.f4994aH < 95.0f) {
                f3 = this.f4994aH / 95.0f;
            }
            int m2092i = (int) (m1057a5 - (C0758f.m2092i(f3 * 90.0f) * 100.0f));
            paint.m5918a(str2, 0, str2.length(), this.f4934z);
            this.f4910b.f6113bO.mo181a(str2, i2, m2092i - ((paint.m5887l() + paint.m5886m()) / 2.0f), paint);
            if (this.f4994aH < 100.0f && !this.f4910b.f6270ds) {
                this.f4995aI += f;
                if (this.f4995aI > 0.5f) {
                    this.f4995aI = 0.0f;
                    this.f4910b.f6116bR.m2364b(EnumC0748h.f4836e);
                    this.f4910b.f6116bR.m2372b();
                    C0745e m2366b = this.f4910b.f6116bR.m2366b(0.0f, 0.0f, 0.0f, Color.m5948a(255, C0758f.m2203a(0, 255), C0758f.m2203a(0, 255), C0758f.m2203a(0, 255)));
                    if (m2366b != null) {
                        m2366b.f4732o = true;
                        m2366b.f4753J = i2 + C0758f.m2136c(-70.0f, 70.0f);
                        m2366b.f4754K = m2092i + C0758f.m2136c(-15.0f, 15.0f);
                        m2366b.f4754K += this.f4910b.f6137co / 2.0f;
                        m2366b.f4755L += this.f4910b.f6137co / 2.0f;
                        m2366b.f4766W = C0758f.m2136c(140.0f, 380.0f);
                        m2366b.f4767X = m2366b.f4766W;
                        m2366b.f4736s = true;
                        m2366b.f4737t = true;
                        m2366b.f4738u = 5.0f;
                        m2366b.f4749F = 2.0f;
                        m2366b.f4761R = C0758f.m2136c(-2.7f, 2.7f);
                        m2366b.f4760Q = C0758f.m2136c(-12.7f, 12.7f);
                        m2366b.f4751H = 0.4f;
                        m2366b.f4750G = 0.2f;
                        m2366b.f4762S = C0758f.m2136c(2.0f, 4.0f);
                        m2366b.f4741x = 2.0f;
                        m2366b.f4740w = true;
                    }
                }
            }
            int m5868c = m1057a5 + this.f4934z.m5868c();
            int i3 = rect.f233d + 30;
            this.f4927s.m5918a("123|", 0, "123|".length(), this.f4934z);
            float m5868c2 = this.f4934z.m5868c() + 6;
            float f4 = 1.5f;
            Iterator it = this.f5003aQ.iterator();
            while (it.hasNext()) {
                C0796e c0796e = (C0796e) it.next();
                if (z4) {
                    if (c0796e.f5110d != 1.0f && f4 > 0.0f) {
                        c0796e.f5110d = C0758f.m2210a(c0796e.f5110d, 1.0f, 0.01f * f4 * f);
                        f4 -= 1.0f - c0796e.f5110d;
                    }
                    float m2158b = C0758f.m2158b(c0796e.f5110d, 0.0f, 1.0f);
                    if (c0796e.f5108b != null) {
                        str = c0796e.f5108b;
                    } else {
                        str = VariableScope.nullOrMissingString + ((int) (c0796e.f5109c * m2158b));
                        if (m2158b <= 0.0f) {
                            str = " ";
                        }
                    }
                    String str3 = c0796e.f5107a;
                    float m2158b2 = C0758f.m2158b(c0796e.f5110d * 2.2f, 0.0f, 1.0f);
                    int i4 = 0;
                    if (m2158b2 > 0.0f) {
                        i4 = (int) (str3.length() * m2158b2);
                    }
                    int m2153b = C0758f.m2153b(i4, 0, str3.length());
                    String str4 = VariableScope.nullOrMissingString;
                    if (m2153b > 0 && m2153b < str3.length() - 1) {
                        str4 = "_";
                    }
                    this.f4910b.f6113bO.mo181a(str3.substring(0, m2153b) + str4 + C0758f.m2119d(" ", (str3.length() + str4.length()) - m2153b), i2 - (8.0f * this.f4927s.m5888k()), i3, this.f4927s);
                    this.f4910b.f6113bO.mo181a(str, i2 + (8.0f * this.f4927s.m5888k()), i3, this.f4928t);
                    i3 = (int) (i3 + m5868c2);
                }
            }
            for (int i5 = 0; i5 < this.f4992aF.size(); i5++) {
                if (z3) {
                    AbstractC0793b abstractC0793b = (AbstractC0793b) this.f4992aF.get(i5);
                    if (this.f4909a.m1895a(i, m5868c, m1057a6, m1057a2, abstractC0793b.m1933b(), EnumC0798g.f5264a, false, m5948a, this.f4909a.f5186ax)) {
                        this.f5000aN = false;
                        abstractC0793b.mo1934a();
                    }
                }
                m5868c += m1057a3;
            }
            if (this.f5000aN) {
                m2036f(f);
            }
        }
    }

    /* renamed from: f */
    void m2036f(float f) {
        int m1057a = this.f4910b.m1057a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        int i = (int) ((this.f4910b.f6153cE / 2.0f) - (m1057a / 2));
        int m1057a2 = this.f4910b.m1057a(120);
        int i2 = (int) (this.f4910b.f6155cG - m1057a2);
        this.f4931w.m5874a(i, i2, m1057a, m1057a2);
        this.f4910b.f6113bO.mo162b(this.f4931w, this.f4909a.f5198aJ);
        int i3 = i + (m1057a / 2);
        Paint paint = this.f4925q;
        String str = f4997aK;
        paint.m5918a(str, 0, str.length(), this.f4934z);
        this.f4910b.f6113bO.mo181a(str, i3, i2 - ((paint.m5887l() + paint.m5886m()) / 2.0f), paint);
        int m5868c = i2 + this.f4934z.m5868c();
        int m1057a3 = this.f4910b.m1057a(70);
        int m1057a4 = this.f4910b.m1057a(30);
        int m1057a5 = ((i + (m1057a / 2)) - this.f4910b.m1057a(10)) - m1057a3;
        int m5948a = Color.m5948a(140, 100, 100, 100);
        if (this.f4909a.m1895a(m1057a5, m5868c, m1057a3, m1057a4, f4998aL, EnumC0798g.f5264a, false, m5948a, this.f4909a.f5186ax)) {
            this.f5000aN = false;
            InterfaceC0096f interfaceC0096f = this.f4910b.f6079ao;
            if (interfaceC0096f == null) {
                Core.m998b("showRateNow: gameView==null");
                return;
            }
            ActivityC0097g mo242i = interfaceC0096f.mo242i();
            if (mo242i == null) {
                Core.m998b("showRateNow: inGameActivity==null");
                return;
            }
            mo242i.m5627l();
        }
        if (this.f4909a.m1895a(i + (m1057a / 2) + this.f4910b.m1057a(10), m5868c, m1057a3, m1057a4, f4999aM, EnumC0798g.f5264a, false, m5948a, this.f4909a.f5186ax)) {
            this.f5000aN = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2070a(float f, boolean z) {
        int i;
        int i2;
        float f2 = this.f4910b.f6132ci * 0.7f;
        if (Core.m1011at() && f2 < 0.7d) {
            f2 = 0.7f;
        }
        int mo386m = (int) (this.f4958X.mo386m() * f2);
        int i3 = 4 + (mo386m / 2);
        int i4 = 4 + (mo386m / 2);
        if (this.f4910b.m974g(111)) {
            boolean z2 = false;
            if (!this.f4909a.f5126p) {
                z2 = this.f4909a.m1821k();
            }
            if (!z2) {
                this.f4909a.f5126p = !this.f4909a.f5126p;
            }
        }
        if (this.f4909a.f5126p) {
            this.f4991aE += 0.008f * f;
            if (this.f4991aE > 1.0f) {
                this.f4991aE = 0.0f;
            }
            this.f4916h.m5903c(150 + ((int) (100.0f * C0758f.m2097h(this.f4991aE * 180.0f))));
        } else {
            this.f4991aE = 0.0f;
            this.f4916h.m5903c(80);
        }
        this.f4934z.m5874a(i3, i4, i3 + mo386m, i4 + mo386m);
        this.f4934z.m5875a(-(mo386m / 2), -(mo386m / 2));
        if (z) {
            this.f4910b.f6113bO.mo197a(this.f4958X, this.f4934z.f230a, this.f4934z.f231b, this.f4916h, 0.0f, f2);
            if (this.f4910b.settingEngine.newRender) {
                this.f4939E.m5874a(this.f4934z.m5867d() - 4, this.f4934z.m5866e() - 4, this.f4934z.m5867d() + 4, this.f4934z.m5866e() + 4);
                this.f4924p.m5933a(100, 0, 155, 0);
                this.f4910b.f6113bO.mo162b(this.f4939E, this.f4924p);
            }
        }
        if (Core.m1011at()) {
            C0758f.m2195a(this.f4934z, 4.0f);
        }
        if (this.f4909a.f5151O && !this.f4909a.f5150N && this.f4934z.m5871b((int) this.f4909a.f5129s, (int) this.f4909a.f5130t)) {
            this.f4909a.f5151O = false;
            this.f4909a.f5126p = !this.f4909a.f5126p;
        }
        if (this.f4910b.f6126cb.m2464h()) {
            this.f4916h.m5903c(80);
            if (this.f4910b.f6126cb.f4510t != 1) {
                this.f4916h.m5903c(200);
            }
            int i5 = (int) (this.f4960Z.f6403q * this.f4910b.f6132ci * 1.6f);
            int i6 = (int) (this.f4910b.f6153cE / 2.0f);
            int m5888k = 7 + ((int) this.f4909a.f5187ay.m5888k());
            this.f4910b.f6113bO.mo181a(C0758f.m2199a(this.f4910b.f6102by / 1000), i6, m5888k, this.f4909a.f5187ay);
            int i7 = m5888k + (i5 / 2) + 10;
            int i8 = i6 + (i5 / 2) + 5;
            this.f4934z.m5874a(i8, i7, i8 + i5, i7 + i5);
            this.f4934z.m5875a((-this.f4934z.m5872b()) / 2, (-this.f4934z.m5868c()) / 2);
            if (z) {
                this.f4910b.f6113bO.mo197a(this.f4960Z, this.f4934z.f230a, this.f4934z.f231b, this.f4916h, 0.0f, i5 / i);
            }
            if (this.f4909a.f5151O && !this.f4909a.f5150N && this.f4934z.m5871b((int) this.f4909a.f5129s, (int) this.f4909a.f5130t)) {
                this.f4909a.f5151O = false;
                this.f4910b.f6126cb.m2474b();
            }
            if (this.f4910b.f6237bt != 1.0f && z) {
                this.f4910b.f6113bO.mo181a("x" + this.f4910b.f6237bt, this.f4934z.m5867d() + (i5 / 2), this.f4934z.m5866e(), this.f4909a.f5185aw);
            }
            C0934e c0934e = this.f4959Y;
            int i9 = (int) (c0934e.f6403q * this.f4910b.f6132ci * 1.6f);
            int i10 = i8 - (i9 + 5);
            this.f4934z.m5874a(i10, i7, i10 + i9, i7 + i9);
            this.f4934z.m5875a((-this.f4934z.m5872b()) / 2, (-this.f4934z.m5868c()) / 2);
            if (z) {
                this.f4910b.f6113bO.mo197a(c0934e, this.f4934z.f230a, this.f4934z.f231b, this.f4916h, 0.0f, i9 / i2);
            }
            if (this.f4909a.f5151O && !this.f4909a.f5150N && this.f4934z.m5871b((int) this.f4909a.f5129s, (int) this.f4909a.f5130t)) {
                this.f4909a.f5151O = false;
                this.f4910b.f6126cb.m2487a();
            }
        }
        if (this.f4909a.f5126p) {
            this.f4910b.f6161cT = false;
            int m1057a = this.f4910b.m1057a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
            this.f4931w.f230a = (int) ((this.f4910b.f6153cE / 2.0f) - (m1057a / 2));
            this.f4931w.f232c = (int) ((this.f4910b.f6153cE / 2.0f) + (m1057a / 2));
            int m1057a2 = this.f4910b.m1057a(30);
            int m1057a3 = m1057a2 + this.f4910b.m1057a(15);
            Menu m2025p = m2025p();
            int m1057a4 = this.f4910b.m1057a(40) + (m1057a3 * (1 + m2025p.size()));
            this.f4931w.f231b = (int) (this.f4910b.f6137co - (m1057a4 / 2));
            this.f4931w.f233d = (int) (this.f4910b.f6137co + (m1057a4 / 2));
            if (z) {
                this.f4910b.f6113bO.mo195a(this.f4909a.f5220bf, this.f4931w, (Paint) null);
                this.f4910b.f6113bO.mo162b(this.f4931w, this.f4909a.f5198aJ);
            }
            int m1057a5 = this.f4931w.f231b + this.f4910b.m1057a(40);
            int m1057a6 = this.f4910b.m1057a(140);
            int i11 = (int) ((this.f4910b.f6153cE / 2.0f) - (m1057a6 / 2));
            int m5948a = Color.m5948a(140, 100, 100, 100);
            if (this.f4909a.m1895a(i11, m1057a5, m1057a6, m1057a2, C0820a.m1731a("menus.ingame.resume", new Object[0]), EnumC0798g.f5264a, false, m5948a, this.f4909a.f5186ax)) {
                this.f4909a.f5151O = false;
                this.f4909a.f5204aP = 40.0f;
                this.f4909a.f5126p = false;
            }
            int i12 = m1057a5 + m1057a3;
            for (int i13 = 0; i13 < m2025p.size(); i13++) {
                MenuItem item = m2025p.getItem(i13);
                if (this.f4909a.m1895a(i11, i12, m1057a6, m1057a2, item.getTitle().toString(), EnumC0798g.f5264a, false, m5948a, this.f4909a.f5186ax)) {
                    m2069a(item.getItemId());
                    this.f4909a.f5151O = false;
                    this.f4909a.f5204aP = 40.0f;
                }
                i12 += m1057a3;
            }
        }
    }

    /* renamed from: m */
    public void m2028m() {
        m2069a(20);
    }

    /* renamed from: n */
    public void m2027n() {
        m2069a(21);
    }

    /* renamed from: o */
    public void m2026o() {
        m2069a(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2069a(int i) {
        InterfaceC0096f interfaceC0096f = this.f4910b.f6079ao;
        if (interfaceC0096f == null) {
            Core.m998b("selectMenuOption: gameView==null");
            return;
        }
        ActivityC0097g mo242i = interfaceC0096f.mo242i();
        if (mo242i == null) {
            Core.m998b("selectMenuOption: inGameActivity==null");
        } else {
            mo242i.mo115c(i);
        }
    }

    /* renamed from: p */
    Menu m2025p() {
        this.f5002aP.clear();
        InterfaceC0096f interfaceC0096f = this.f4910b.f6079ao;
        if (interfaceC0096f == null) {
            Core.m998b("selectMenuOption: gameView==null");
            return this.f5002aP;
        }
        ActivityC0097g mo242i = interfaceC0096f.mo242i();
        if (mo242i == null) {
            Core.m998b("selectMenuOption: inGameActivity==null");
            return this.f5002aP;
        }
        mo242i.mo6024a(this.f5002aP);
        return this.f5002aP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m2034g(float f) {
        String str;
        int i = (int) (this.f4910b.f6155cG - (30.0f * this.f4910b.f6132ci));
        int i2 = (int) ((this.f4910b.f6134ck - this.f4910b.f6138cp) + 10.0f);
        int i3 = ((int) (this.f4910b.f6138cp - 20.0f)) / 3;
        int i4 = i3 - 5;
        for (int i5 = 0; i5 < this.f4989aC.size(); i5++) {
            C0784ac c0784ac = (C0784ac) this.f4989aC.get(i5);
            if (c0784ac.f5074h) {
                c0784ac.m1959e();
                c0784ac.f5074h = false;
            }
            c0784ac.m1960d();
            if (this.f4910b.settingEngine.keyboardSupport && i5 < this.f4910b.f6118bT.f4142ai.length) {
                if (this.f4910b.f6118bT.f4144ak[i5].m2738a()) {
                    c0784ac.m1962b();
                    c0784ac.m1961c();
                }
                if (this.f4910b.f6118bT.f4143aj[i5].m2738a()) {
                    this.f4909a.m1821k();
                    c0784ac.m1965a();
                }
                if (this.f4910b.f6118bT.f4142ai[i5].m2738a()) {
                    this.f4909a.m1821k();
                    this.f4909a.m1800x();
                    c0784ac.m1965a();
                }
            }
            if (this.f4910b.settingEngine.showUnitGroups && i5 < 3) {
                if (c0784ac.f5067a.size() == 0) {
                    if (this.f4909a.f5246bz) {
                        str = "Empty";
                    } else {
                        str = "(" + (i5 + 1) + ")";
                    }
                } else {
                    str = VariableScope.nullOrMissingString + c0784ac.f5067a.size();
                }
                boolean z = false;
                c0784ac.f5070d = C0758f.m2211a(c0784ac.f5070d, 0.01f * f);
                c0784ac.f5071e = C0758f.m2211a(c0784ac.f5071e, 0.01f * f);
                c0784ac.f5072f = C0758f.m2211a(c0784ac.f5072f, 0.01f * f);
                if (this.f4909a.m1896a(i2, i, i4, (int) (31.0f * this.f4910b.f6132ci), str, EnumC0798g.f5264a, true, Color.m5948a(50, (int) (100.0f + (c0784ac.f5072f * 100.0f)), (int) (100.0f + (c0784ac.f5071e * 100.0f)), (int) (100.0f + (c0784ac.f5070d * 100.0f)))) && this.f4909a.f5159W == null && !this.f4909a.f5150N) {
                    z = true;
                    c0784ac.f5068b += f;
                    this.f4909a.m1840d();
                    float f2 = 1.0f;
                    this.f4917i.m5937a();
                    this.f4917i.m5908b(Color.m5948a(120, 200, 0, 0));
                    if (c0784ac.f5068b < 50.0f) {
                        f2 = c0784ac.f5068b / 50.0f;
                        this.f4917i.m5908b(Color.m5948a((int) (150.0f + (f2 * 40.0f)), 0, 200, 0));
                        m2068a(i2, i, i4, "Select Group", "(Hold for more..)", this.f4917i, f2);
                    } else if (c0784ac.f5068b < 100.0f) {
                        f2 = (c0784ac.f5068b - 50.0f) / 50.0f;
                        this.f4917i.m5908b(Color.m5948a((int) (150.0f + (f2 * 40.0f)), 200, 0, 0));
                        m2068a(i2, i, i4, "Add to Group", "(Hold for more..)", this.f4917i, f2);
                    } else {
                        m2068a(i2, i, i4, "Replace Group", VariableScope.nullOrMissingString, this.f4917i, 0.0f);
                    }
                    int i6 = (int) (31.0f * this.f4910b.f6132ci);
                    this.f4931w.m5874a(i2, (int) ((i + i6) - (i6 * f2)), i2 + i4, i + i6);
                    this.f4910b.f6113bO.mo162b(this.f4931w, this.f4917i);
                }
                if (!z) {
                    if (c0784ac.f5068b != 0.0f && !this.f4909a.f5140D) {
                        if (c0784ac.f5068b > 100.0f) {
                            c0784ac.m1962b();
                            c0784ac.m1961c();
                            c0784ac.f5072f = 1.0f;
                        } else if (c0784ac.f5068b > 50.0f) {
                            c0784ac.m1961c();
                            this.f4909a.m1821k();
                            this.f4909a.m1800x();
                            c0784ac.m1965a();
                            c0784ac.f5071e = 1.0f;
                        } else if (c0784ac.f5067a.size() != 0) {
                            this.f4909a.m1821k();
                            this.f4909a.m1800x();
                            c0784ac.m1965a();
                            c0784ac.f5070d = 1.0f;
                        } else {
                            c0784ac.m1962b();
                            c0784ac.m1961c();
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
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f4989aC.size());
        Iterator it = this.f4989aC.iterator();
        while (it.hasNext()) {
            ((C0784ac) it.next()).mo2441a(streamWriter);
        }
        streamWriter.m1401c(0);
    }

    /* renamed from: a */
    public void m2056a(Reader reader, boolean z) {
        if (!z) {
            this.f4989aC.clear();
        }
        int ReadInt = reader.ReadInt();
        int i = 0;
        while (i < ReadInt) {
            C0784ac c0784ac = new C0784ac(this, i < 3);
            c0784ac.m1963a(reader);
            if (!z) {
                this.f4989aC.add(c0784ac);
            }
            i++;
        }
        reader.m1304d();
    }

    /* renamed from: q */
    public void m2024q() {
        this.f5003aQ = C0796e.m1922a();
    }

    /* renamed from: r */
    public void m2023r() {
        this.f5003aQ = C0796e.m1922a();
    }
}
