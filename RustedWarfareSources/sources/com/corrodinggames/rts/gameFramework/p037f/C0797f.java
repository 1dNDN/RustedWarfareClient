package com.corrodinggames.rts.gameFramework.p037f;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.game.units.EnumC0238ag;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0438e;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0431c;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0209d;
import com.corrodinggames.rts.game.units.p013a.C0210e;
import com.corrodinggames.rts.game.units.p013a.C0211f;
import com.corrodinggames.rts.game.units.p013a.C0212g;
import com.corrodinggames.rts.game.units.p013a.C0214i;
import com.corrodinggames.rts.game.units.p013a.C0215j;
import com.corrodinggames.rts.game.units.p013a.C0222q;
import com.corrodinggames.rts.game.units.p013a.C0223r;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0638ac;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0773j;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0763a;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0765c;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0767e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p045m.C1049f;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/f.class */
public final class C0797f extends AbstractC0726bk {

    /* renamed from: c */
    C0555h f5113c;

    /* renamed from: d */
    public C0760a f5114d;

    /* renamed from: e */
    public C0800i f5115e;

    /* renamed from: f */
    public C0787af f5116f;

    /* renamed from: q */
    double f5127q;

    /* renamed from: x */
    boolean f5134x;

    /* renamed from: y */
    boolean f5135y;

    /* renamed from: z */
    float f5136z;

    /* renamed from: A */
    public float f5137A;

    /* renamed from: B */
    public float f5138B;

    /* renamed from: Q */
    public AbstractC0244am f5153Q;

    /* renamed from: R */
    public float f5154R;

    /* renamed from: S */
    public int f5155S;

    /* renamed from: T */
    public float f5156T;

    /* renamed from: U */
    public AbstractC0244am f5157U;

    /* renamed from: W */
    public AbstractC0224s f5159W;

    /* renamed from: X */
    public int f5160X;

    /* renamed from: Y */
    public boolean f5161Y;

    /* renamed from: Z */
    public float f5162Z;

    /* renamed from: aa */
    public float f5163aa;

    /* renamed from: ab */
    public float f5164ab;

    /* renamed from: ac */
    public boolean f5165ac;

    /* renamed from: ad */
    public float f5166ad;

    /* renamed from: ae */
    public float f5167ae;

    /* renamed from: af */
    public float f5168af;

    /* renamed from: ag */
    public float f5169ag;

    /* renamed from: ah */
    public float f5170ah;

    /* renamed from: ai */
    public float f5171ai;

    /* renamed from: aj */
    public boolean f5172aj;

    /* renamed from: ak */
    public float f5173ak;

    /* renamed from: al */
    public float f5174al;

    /* renamed from: am */
    public int f5175am;

    /* renamed from: ao */
    public Paint f5177ao;

    /* renamed from: ap */
    public Paint f5178ap;

    /* renamed from: aq */
    public Paint f5179aq;

    /* renamed from: ar */
    public Paint f5180ar;

    /* renamed from: as */
    public Paint f5181as;

    /* renamed from: at */
    public Paint f5182at;

    /* renamed from: au */
    public Paint f5183au;

    /* renamed from: av */
    public Paint f5184av;

    /* renamed from: aw */
    public Paint f5185aw;

    /* renamed from: ax */
    public Paint f5186ax;

    /* renamed from: ay */
    public Paint f5187ay;

    /* renamed from: az */
    public Paint f5188az;

    /* renamed from: aA */
    public Paint f5189aA;

    /* renamed from: aB */
    public Paint f5190aB;

    /* renamed from: aC */
    public Paint f5191aC;

    /* renamed from: aD */
    public Paint f5192aD;

    /* renamed from: aE */
    Paint f5193aE;

    /* renamed from: aF */
    Paint f5194aF;

    /* renamed from: aG */
    Paint f5195aG;

    /* renamed from: aH */
    Paint f5196aH;

    /* renamed from: aI */
    Paint f5197aI;

    /* renamed from: aJ */
    Paint f5198aJ;

    /* renamed from: aK */
    C0930ag f5199aK;

    /* renamed from: aL */
    C0930ag f5200aL;

    /* renamed from: aM */
    C0930ag f5201aM;

    /* renamed from: aN */
    public float f5202aN;

    /* renamed from: aR */
    int f5206aR;

    /* renamed from: aT */
    public boolean f5208aT;

    /* renamed from: aX */
    boolean f5212aX;

    /* renamed from: aY */
    float f5213aY;

    /* renamed from: aZ */
    Paint f5214aZ;

    /* renamed from: ba */
    Paint f5215ba;

    /* renamed from: bs */
    String f5233bs;

    /* renamed from: bt */
    String f5234bt;

    /* renamed from: bu */
    C0385az f5235bu;

    /* renamed from: bv */
    String f5236bv;

    /* renamed from: bw */
    String f5237bw;

    /* renamed from: bx */
    String f5238bx;

    /* renamed from: bR */
    private int f5240bR;

    /* renamed from: bS */
    private int f5241bS;

    /* renamed from: bT */
    private int f5242bT;

    /* renamed from: bU */
    private int f5243bU;

    /* renamed from: bV */
    private int f5244bV;

    /* renamed from: bW */
    private int f5245bW;

    /* renamed from: bD */
    public static boolean f5250bD;

    /* renamed from: bI */
    long f5255bI;

    /* renamed from: bJ */
    boolean f5256bJ;

    /* renamed from: bM */
    public static AbstractC0244am f5259bM;

    /* renamed from: bQ */
    static boolean f5263bQ;

    /* renamed from: a */
    public static boolean f5111a = false;

    /* renamed from: bA */
    public static boolean f5247bA = false;

    /* renamed from: bB */
    public static boolean f5248bB = false;

    /* renamed from: bC */
    public static boolean f5249bC = false;

    /* renamed from: bP */
    static int f5262bP = 1;

    /* renamed from: b */
    public boolean f5112b = false;

    /* renamed from: g */
    C0210e f5117g = new C0210e();

    /* renamed from: h */
    C0211f f5118h = new C0211f();

    /* renamed from: i */
    C0214i f5119i = new C0214i();

    /* renamed from: j */
    C0209d f5120j = new C0209d();

    /* renamed from: k */
    public C0215j f5121k = new C0215j();

    /* renamed from: l */
    C0223r f5122l = new C0223r();

    /* renamed from: m */
    C0222q f5123m = new C0222q();

    /* renamed from: n */
    AbstractC0773j f5124n = new C0763a();

    /* renamed from: o */
    boolean f5125o = false;

    /* renamed from: p */
    public boolean f5126p = false;

    /* renamed from: r */
    float f5128r = 0.0f;

    /* renamed from: s */
    public float f5129s = 0.0f;

    /* renamed from: t */
    public float f5130t = 0.0f;

    /* renamed from: u */
    float f5131u = 40.0f;

    /* renamed from: v */
    float f5132v = 40.0f;

    /* renamed from: w */
    int f5133w = 0;

    /* renamed from: C */
    boolean f5139C = false;

    /* renamed from: D */
    boolean f5140D = false;

    /* renamed from: E */
    boolean f5141E = false;

    /* renamed from: F */
    boolean f5142F = false;

    /* renamed from: G */
    boolean f5143G = false;

    /* renamed from: H */
    float f5144H = 0.0f;

    /* renamed from: I */
    float f5145I = 0.0f;

    /* renamed from: J */
    float f5146J = 0.0f;

    /* renamed from: K */
    float f5147K = 0.0f;

    /* renamed from: L */
    float f5148L = 0.0f;

    /* renamed from: M */
    float f5149M = 0.0f;

    /* renamed from: N */
    boolean f5150N = false;

    /* renamed from: O */
    boolean f5151O = false;

    /* renamed from: P */
    boolean f5152P = false;

    /* renamed from: V */
    public final boolean f5158V = true;

    /* renamed from: an */
    public final Paint f5176an = new Paint();

    /* renamed from: aO */
    public float f5203aO = 0.0f;

    /* renamed from: aP */
    public float f5204aP = 0.0f;

    /* renamed from: aQ */
    public float f5205aQ = 0.0f;

    /* renamed from: aS */
    public float f5207aS = 0.0f;

    /* renamed from: aU */
    C0934e f5209aU = null;

    /* renamed from: aV */
    C0934e f5210aV = null;

    /* renamed from: aW */
    C0934e f5211aW = null;

    /* renamed from: bb */
    C0934e f5216bb = null;

    /* renamed from: bc */
    C0934e f5217bc = null;

    /* renamed from: bd */
    public C0934e f5218bd = null;

    /* renamed from: be */
    public C0934e f5219be = null;

    /* renamed from: bf */
    public C0934e f5220bf = null;

    /* renamed from: bg */
    C0934e f5221bg = null;

    /* renamed from: bh */
    final Rect f5222bh = new Rect();

    /* renamed from: bi */
    final Rect f5223bi = new Rect();

    /* renamed from: bj */
    final Rect f5224bj = new Rect();

    /* renamed from: bk */
    final Rect f5225bk = new Rect();

    /* renamed from: bl */
    final Rect f5226bl = new Rect();

    /* renamed from: bm */
    final Paint f5227bm = new Paint();

    /* renamed from: bn */
    final Paint f5228bn = new Paint();

    /* renamed from: bo */
    final Paint f5229bo = new C0930ag();

    /* renamed from: bp */
    public final Paint f5230bp = new C0930ag();

    /* renamed from: bq */
    final Paint f5231bq = new C0930ag();

    /* renamed from: br */
    final Paint f5232br = new Paint();

    /* renamed from: by */
    public ArrayList f5239by = new ArrayList();

    /* renamed from: bz */
    public boolean f5246bz = false;

    /* renamed from: bE */
    C0765c f5251bE = C0765c.m2016b(-1, -1);

    /* renamed from: bF */
    C0439f f5252bF = new C0439f();

    /* renamed from: bG */
    long f5253bG = -1;

    /* renamed from: bH */
    long f5254bH = -1;

    /* renamed from: bK */
    public C1112u f5257bK = new C1112u();

    /* renamed from: bL */
    public C1112u f5258bL = new C1112u();

    /* renamed from: bN */
    Paint f5260bN = new Paint();

    /* renamed from: bO */
    Rect f5261bO = new Rect();

    /* renamed from: a */
    public boolean m1911a() {
        if (Core.m1009av()) {
            return false;
        }
        return Core.m1087A().settingEngine.useCircleSelect;
    }

    /* renamed from: b */
    float m1860b() {
        return Math.min(this.f5128r * 2.5f, 290.0f) + 10.0f;
    }

    /* renamed from: c */
    float m1847c() {
        Core m1087A = Core.m1087A();
        float f = 0.7f;
        if (Core.m1010au()) {
            f = 0.9f;
        }
        if (m1087A.f6256cW < 1.0f) {
            float f2 = m1087A.f6256cW;
            if (f2 < 0.4d) {
                f2 = 0.4f;
            }
            f *= f2;
        }
        return f;
    }

    /* renamed from: a */
    public void m1865a(String str, int i) {
        this.f5114d.m2054a(str, i);
    }

    /* renamed from: b */
    public void m1849b(String str, int i) {
        this.f5114d.m2049b(str, i);
    }

    /* renamed from: a */
    public void m1866a(String str) {
        this.f5114d.m2055a(str);
    }

    /* renamed from: b */
    public void m1850b(String str) {
        this.f5114d.m2054a(str, 100);
    }

    /* renamed from: c */
    public void m1841c(String str) {
        this.f5114d.m2054a(str, 50);
    }

    /* renamed from: d */
    public void m1836d(String str) {
        this.f5114d.m2054a(str, 5);
    }

    /* renamed from: d */
    public void m1840d() {
        this.f5151O = false;
        this.f5152P = false;
        this.f5140D = false;
    }

    /* renamed from: a */
    public boolean m1909a(float f, float f2) {
        Core m1087A = Core.m1087A();
        if (!f5247bA || this.f5114d.f4978ar) {
            return f < m1087A.f6134ck - m1087A.f6138cp;
        } else if (m1087A.f6121bW.m1772c(f, f2) != null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public void m1835e() {
        if (this.f5114d != null) {
            this.f5114d.m2073a();
        }
    }

    /* renamed from: a */
    public void m1863a(boolean z) {
        if (z) {
            this.f5114d.m2031j();
            return;
        }
        Core m1087A = Core.m1087A();
        this.f5114d.m2030k();
        m1821k();
        this.f5126p = false;
        this.f5239by.clear();
        if (!z) {
            m1087A.f6237bt = 1.0f;
            m1087A.f6101bw = false;
            m1087A.f6100bv = false;
            m1087A.f6231bl = false;
            m1087A.f6233bn = false;
        }
        if (m1087A.m1075M() && m1087A.m1073O()) {
            m1087A.f6100bv = m1087A.f6122bX.f5483p;
        }
        C0785ad.m1958a();
        m1912J();
    }

    /* renamed from: f */
    public void m1832f() {
        f5247bA = false;
        f5248bB = false;
        f5249bC = false;
        if (Core.m1010au()) {
            f5247bA = true;
            f5248bB = true;
            f5111a = true;
            f5249bC = true;
        }
        if (Core.f6209aY) {
            f5247bA = true;
            f5248bB = true;
            f5249bC = true;
        }
        if (Core.m1012as() && !Core.m1087A().settingEngine.classicInterface) {
            f5247bA = true;
            f5248bB = true;
            f5249bC = true;
        }
    }

    /* renamed from: a */
    public void m1893a(Context context) {
        Core m1087A = Core.m1087A();
        if (Core.m1086B()) {
            this.f5246bz = true;
        }
        m1832f();
        this.f5233bs = C0820a.m1731a("gui.notAvailableInDemoText", new Object[0]);
        this.f5234bt = "Locked";
        this.f5235bu = C0385az.m4223b("gui.notEnoughResources");
        this.f5236bv = C0820a.m1731a("gui.cannotPlace.general", new Object[0]);
        this.f5237bw = C0820a.m1731a("gui.cannotPlace.needsResourcePool", new Object[0]);
        this.f5238bx = C0820a.m1731a("gui.cannotPlace.needsWater", new Object[0]);
        this.f5114d = new C0760a(m1087A, this);
        m1835e();
        this.f5115e = new C0800i(m1087A, this);
        this.f5116f = new C0787af(m1087A);
        this.f5209aU = m1087A.f6113bO.mo221a(C0067R.drawable.button_no);
        this.f5210aV = m1087A.f6113bO.mo221a(C0067R.drawable.button_yes);
        this.f5211aW = m1087A.f6113bO.mo221a(C0067R.drawable.button_more);
        this.f5214aZ = new Paint();
        this.f5214aZ.m5897d(true);
        this.f5215ba = new Paint();
        this.f5215ba.m5897d(true);
        this.f5215ba.m5933a(40, 255, 255, 255);
        this.f5216bb = m1087A.f6113bO.mo221a(C0067R.drawable.button_add);
        this.f5217bc = m1087A.f6113bO.mo221a(C0067R.drawable.button_subtract);
        this.f5218bd = m1087A.f6113bO.mo221a(C0067R.drawable.icon_rally);
        this.f5219be = m1087A.f6113bO.mo221a(C0067R.drawable.icon_upgrade);
        this.f5220bf = m1087A.f6113bO.mo215a(C0067R.drawable.metal_dark, false);
        this.f5221bg = m1087A.f6113bO.mo215a(C0067R.drawable.touch_indicator, false);
        this.f5231bq.m5933a(145, 0, 175, 0);
        this.f5231bq.m5936a(6.0f);
        C0930ag.m905b(this.f5231bq);
        this.f5230bp.mo5914a(true);
        this.f5177ao = new Paint();
        this.f5178ap = new C0930ag();
        this.f5178ap.m5933a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f5178ap.mo5914a(true);
        this.f5178ap.m5901c(true);
        this.f5178ap.mo5924a(Typeface.m5840a(Typeface.f246c, 1));
        m1087A.m1050a(this.f5178ap, 20.0f);
        this.f5178ap.m5929a(Paint.Align.f195a);
        this.f5181as = new C0930ag();
        this.f5181as.m5933a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f5181as.mo5914a(true);
        this.f5181as.m5901c(true);
        this.f5181as.mo5924a(Typeface.m5840a(Typeface.f246c, 1));
        m1087A.m1050a(this.f5181as, 18.0f);
        this.f5181as.m5929a(Paint.Align.f195a);
        this.f5179aq = new C0930ag();
        this.f5179aq.m5925a(this.f5178ap);
        this.f5179aq.m5933a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f5180ar = new C0930ag();
        this.f5180ar.m5908b(Color.m5948a(100, 0, 0, 0));
        this.f5180ar.m5926a(Paint.Style.f221c);
        this.f5182at = new C0930ag();
        this.f5182at.m5933a(100, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f5182at.m5929a(Paint.Align.f195a);
        this.f5182at.m5901c(true);
        this.f5182at.mo5914a(true);
        m1087A.m1050a(this.f5182at, 12.0f);
        C0930ag.m905b(this.f5182at);
        this.f5185aw = new C0930ag();
        if (this.f5246bz) {
            this.f5185aw.m5933a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f5185aw.m5933a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f5185aw.m5929a(Paint.Align.f196b);
        this.f5185aw.m5901c(true);
        this.f5185aw.mo5914a(true);
        m1087A.m1050a(this.f5185aw, 12.0f);
        C0930ag.m905b(this.f5185aw);
        Core.LogDebug2("smallTextPaint size: " + this.f5185aw.m5888k());
        this.f5184av = new C0930ag();
        this.f5184av.m5925a(this.f5185aw);
        m1087A.m1050a(this.f5184av, 10.0f);
        C0930ag.m905b(this.f5184av);
        this.f5183au = new C0930ag();
        this.f5183au.m5925a(this.f5185aw);
        m1087A.m1050a(this.f5183au, 8.0f);
        C0930ag.m905b(this.f5183au);
        this.f5186ax = new C0930ag();
        if (this.f5246bz) {
            this.f5186ax.m5933a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f5186ax.m5933a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f5186ax.m5929a(Paint.Align.f196b);
        this.f5186ax.m5901c(true);
        this.f5186ax.mo5914a(true);
        m1087A.m1050a(this.f5186ax, 20.0f);
        C0930ag.m905b(this.f5186ax);
        this.f5187ay = new C0930ag();
        this.f5187ay.m5933a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f5187ay.m5929a(Paint.Align.f196b);
        this.f5187ay.m5901c(true);
        this.f5187ay.mo5914a(true);
        m1087A.m1050a(this.f5187ay, 20.0f);
        C0930ag.m905b(this.f5187ay);
        this.f5191aC = new C0930ag();
        this.f5191aC.m5933a(150, 20, 20, 20);
        m1087A.m1051a(this.f5191aC);
        C0930ag.m905b(this.f5191aC);
        this.f5188az = new C0930ag();
        this.f5188az.m5925a(this.f5186ax);
        this.f5188az.m5933a(255, 128, 0, 0);
        m1087A.m1050a(this.f5188az, 14.0f);
        this.f5188az.m5929a(Paint.Align.f196b);
        C0930ag.m905b(this.f5188az);
        this.f5189aA = new C0930ag();
        this.f5189aA.m5925a(this.f5188az);
        this.f5189aA.m5933a(255, 220, 222, 49);
        this.f5190aB = new C0930ag();
        this.f5190aB.m5925a(this.f5186ax);
        m1087A.m1050a(this.f5190aB, 12.0f);
        this.f5190aB.m5933a(125, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.f5190aB.m5929a(Paint.Align.f196b);
        C0930ag.m905b(this.f5190aB);
        this.f5199aK = new C0930ag();
        this.f5199aK.m5908b(-16777216);
        this.f5199aK.mo5914a(true);
        this.f5199aK.m5901c(true);
        this.f5199aK.mo5924a(Typeface.m5840a(Typeface.f246c, 0));
        m1087A.m1050a(this.f5199aK, 14.0f);
        this.f5200aL = new C0930ag();
        this.f5200aL.m5925a(this.f5199aK);
        this.f5200aL.mo5924a(Typeface.m5840a(Typeface.f246c, 1));
        m1087A.m1050a(this.f5200aL, 16.0f);
        this.f5201aM = new C0930ag();
        this.f5201aM.m5925a(this.f5200aL);
        this.f5201aM.m5908b(Color.m5949a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 63, 80));
        m1087A.m1050a(this.f5201aM, 16.0f);
        this.f5193aE = new C0930ag();
        this.f5193aE.m5908b(-16777216);
        this.f5193aE.m5929a(Paint.Align.f196b);
        this.f5193aE.mo5914a(true);
        this.f5193aE.m5901c(true);
        this.f5193aE.mo5924a(Typeface.m5840a(Typeface.f246c, 0));
        m1087A.m1050a(this.f5193aE, 20.0f);
        this.f5194aF = new C0930ag();
        this.f5194aF.m5908b(-1);
        this.f5194aF.m5903c(160);
        if (Core.m1010au()) {
            this.f5194aF.m5903c(140);
        }
        m1087A.m1051a(this.f5194aF);
        this.f5195aG = new C0930ag();
        this.f5195aG.m5908b(-16777216);
        this.f5195aG.m5903c(210);
        m1087A.m1051a(this.f5195aG);
        this.f5198aJ = new C0930ag();
        this.f5198aJ.m5908b(-7829368);
        this.f5198aJ.m5903c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.f5198aJ.m5926a(Paint.Style.f220b);
        this.f5198aJ.m5936a(1.0f);
        m1087A.m1051a(this.f5198aJ);
        this.f5196aH = new C0930ag();
        this.f5196aH.m5908b(-16711936);
        this.f5196aH.m5903c(80);
        this.f5196aH.m5926a(Paint.Style.f219a);
        this.f5196aH.m5936a(4.0f);
        m1087A.m1051a(this.f5196aH);
        this.f5197aI = new C0930ag();
        this.f5197aI.m5908b(Color.m5948a(120, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 167, 49));
        this.f5197aI.m5926a(Paint.Style.f219a);
        this.f5197aI.m5936a(8.0f);
        m1087A.m1051a(this.f5197aI);
        this.f5192aD = new C0930ag();
        this.f5192aD.m5901c(true);
        this.f5192aD.mo5914a(true);
        m1087A.m1050a(this.f5192aD, 12.0f);
        C0930ag.m905b(this.f5192aD);
    }

    /* renamed from: g */
    public void m1829g() {
        this.f5115e.m1793b();
        this.f5116f.m1944b();
        this.f5256bJ = false;
    }

    /* renamed from: a */
    public void m1910a(float f) {
        Core m1087A = Core.m1087A();
        this.f5127q += f;
        this.f5203aO = C0758f.m2211a(this.f5203aO, f);
        this.f5204aP = C0758f.m2211a(this.f5204aP, f);
        this.f5207aS = C0758f.m2211a(this.f5207aS, 0.08f * f);
        this.f5205aQ = C0758f.m2211a(this.f5205aQ, f);
        this.f5136z += f;
        this.f5202aN += 0.05f * f;
        if (this.f5202aN > 1.0f) {
            this.f5202aN -= 1.0f;
            if (this.f5202aN > 1.0f) {
                this.f5202aN = 0.0f;
            }
        }
        m1087A.f6273dw = 4.0f * this.f5207aS;
        float f2 = 1.0f * f;
        if (!this.f5140D) {
            float f3 = this.f5148L * f;
            float f4 = this.f5149M * f;
            float m2101g = C0758f.m2101g(80.0f, f3);
            float m2101g2 = C0758f.m2101g(80.0f, f4);
            m1087A.f6146cx += m2101g;
            m1087A.f6147cy += m2101g2;
        } else {
            f2 *= 4.0f;
        }
        float m2157b = C0758f.m2157b(0.0f, 0.0f, this.f5148L, this.f5149M);
        float m2123d = C0758f.m2123d(0.0f, 0.0f, this.f5148L, this.f5149M);
        if (m2157b > 30.0f) {
            m2157b = 30.0f;
        }
        float m2211a = C0758f.m2211a(m2157b, f2);
        this.f5148L = C0758f.m2092i(m2123d) * m2211a;
        this.f5149M = C0758f.m2097h(m2123d) * m2211a;
        this.f5208aT = false;
        this.f5140D = m1087A.m1029ab() && m1087A.f6282dL[0] && this.f5203aO == 0.0f;
        if (this.f5204aP != 0.0f) {
            if (!this.f5140D) {
                this.f5204aP = 0.0f;
            }
            this.f5140D = false;
            this.f5139C = false;
        }
        boolean z = false;
        if (this.f5205aQ > 0.0f) {
            z = true;
        }
        if (m1087A.m1029ab() && m1087A.m1027ad() > 1) {
            z = true;
            this.f5205aQ = 4.0f;
        }
        if (z) {
            this.f5140D = false;
            this.f5139C = false;
            this.f5150N = false;
            this.f5128r = 0.0f;
        }
        this.f5143G = m1087A.m1026ae() > m1087A.f6153cE;
        this.f5151O = !this.f5140D && this.f5139C;
        this.f5152P = this.f5140D && !this.f5139C;
        if (Core.m1010au() && m1087A.settingEngine.mouseSupport) {
            this.f5131u = m1087A.m1026ae();
            this.f5132v = m1087A.m1025af();
        }
        if (!this.f5140D && !this.f5151O) {
            this.f5135y = false;
        }
        if (this.f5140D) {
            this.f5128r += f;
            this.f5129s = m1087A.m1002b(0);
            this.f5130t = m1087A.m994c(0);
            this.f5131u = this.f5129s;
            this.f5132v = this.f5130t;
            this.f5133w = m1087A.m986d(0);
            this.f5134x = m1909a(this.f5129s, this.f5130t);
            boolean z2 = false;
            if (this.f5134x && !this.f5139C) {
                if (this.f5136z < 30.0f) {
                    float m2209a = C0758f.m2209a(this.f5137A, this.f5138B, this.f5129s, this.f5130t);
                    float f5 = 10.0f * m1087A.f6132ci;
                    if (Core.m1011at()) {
                        f5 = (float) (f5 * 1.5d);
                    }
                    if (m2209a < f5 * f5) {
                        z2 = true;
                    }
                }
                this.f5136z = 0.0f;
                this.f5137A = this.f5129s;
                this.f5138B = this.f5130t;
            }
            if (z2) {
                this.f5135y = true;
            }
            if (!this.f5139C) {
                this.f5150N = false;
                this.f5144H = this.f5129s;
                this.f5145I = this.f5130t;
                this.f5146J = this.f5129s;
                this.f5147K = this.f5130t;
                this.f5141E = m1087A.f6121bW.m1772c(this.f5129s, this.f5130t) != null;
                this.f5142F = false;
                if (!this.f5141E) {
                    this.f5142F = this.f5129s > m1087A.f6153cE;
                }
            }
            this.f5139C = true;
        }
        if (this.f5140D && (this.f5128r <= 20.0f || !m1911a())) {
            float m2209a2 = C0758f.m2209a(this.f5144H, this.f5145I, this.f5129s, this.f5130t);
            if (!this.f5141E) {
                float f6 = 30.0f * m1087A.f6132ci;
                if (Core.m1010au() && m1087A.settingEngine.mouseSupport && m1087A.m980e(3)) {
                    f6 = 0.0f;
                }
                if (!this.f5150N && m2209a2 > f6 * f6) {
                    boolean z3 = false;
                    int i = 1;
                    if (m1087A.settingEngine.mouseOrders == 2) {
                        i = 2;
                    }
                    if ((!m1087A.settingEngine.mouseSupport || this.f5133w != i) && !m1842c(m1087A)) {
                        z3 = true;
                    }
                    if (z3) {
                        this.f5150N = true;
                    }
                    this.f5146J = this.f5129s;
                    this.f5147K = this.f5130t;
                }
            }
        }
        if (Core.m1010au() && !m1087A.f6081aq && m1087A.f6079ao != null && ((m1087A.f6079ao.mo245f() || Core.f6093aR) && (!this.f5140D || this.f5114d.f4911c))) {
            float f7 = (24.0f * m1087A.settingEngine.edgeScrollSpeed) / m1087A.f6256cW;
            float f8 = m1087A.f6146cx;
            float f9 = m1087A.f6147cy;
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (this.f5131u <= 1.0f) {
                f10 = 0.0f - (f7 * f);
            }
            if (this.f5131u >= m1087A.f6134ck - 1.0f) {
                f10 += f7 * f;
            }
            if (this.f5132v <= 1.0f) {
                f11 = 0.0f - (f7 * f);
            }
            if (this.f5132v >= m1087A.f6135cl - 1.0f) {
                f11 += f7 * f;
            }
            m1087A.f6146cx += f10;
            m1087A.f6147cy += f11;
            m1087A.m1072P();
            this.f5114d.f4936B.f234a -= (m1087A.f6146cx - f8) * m1087A.f6256cW;
            this.f5114d.f4936B.f235b -= (m1087A.f6147cy - f9) * m1087A.f6256cW;
        }
        C0638ac c0638ac = m1087A.f6118bT;
        if (m1087A.settingEngine.keyboardSupport) {
            if (m1087A.m1084D()) {
                float f12 = 12.0f * m1087A.settingEngine.scrollSpeed;
                if (c0638ac.f4097p.m2732b()) {
                    m1087A.f6146cx -= f12 * f;
                }
                if (c0638ac.f4098q.m2732b()) {
                    m1087A.f6146cx += f12 * f;
                }
                if (c0638ac.f4095n.m2732b()) {
                    m1087A.f6147cy -= f12 * f;
                }
                if (c0638ac.f4096o.m2732b()) {
                    m1087A.f6147cy += f12 * f;
                }
                if (c0638ac.f4099r.m2732b()) {
                    m1087A.f6254cU += 0.1f;
                }
                if (c0638ac.f4100s.m2732b()) {
                    m1087A.f6254cU -= 0.1f;
                }
            }
            if (c0638ac.f4106y.m2738a()) {
                m1821k();
                m1800x();
            }
            if (c0638ac.f4107z.m2738a()) {
                this.f5116f.m1940d();
            }
            if (c0638ac.f4108A.m2738a()) {
                m1821k();
                m1800x();
                Iterator it = AbstractC1120w.f6962eo.iterator();
                while (it.hasNext()) {
                    AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                    if (abstractC1120w instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                        if (!abstractC0623y.f1607bT && abstractC0623y.f1609bV == m1087A.f6099bs && abstractC0623y.mo3036l() && !abstractC0623y.m2916ak() && abstractC0623y.m2935aS()) {
                            m1822j(abstractC0623y);
                        }
                    }
                }
            }
            if (c0638ac.f4109B.m2738a()) {
                m1821k();
                m1800x();
                Iterator it2 = AbstractC1120w.f6962eo.iterator();
                while (it2.hasNext()) {
                    AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                    if (abstractC1120w2 instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w2;
                        if (abstractC0623y2.f1609bV == m1087A.f6099bs && abstractC0623y2.mo1758r() == EnumC0249ar.f1739e && !abstractC0623y2.f1607bT) {
                            m1822j(abstractC0623y2);
                            m1087A.m1003b(abstractC0623y2.f6958el, abstractC0623y2.f6959em);
                        }
                    }
                }
            }
            if (c0638ac.f4110C.m2738a()) {
                AbstractC0777ab.m1972a(this.f5239by, AbstractC0777ab.f5060a, AbstractC0777ab.f5061b);
            }
            if (c0638ac.f4111D.m2738a()) {
                AbstractC0777ab.m1972a(this.f5239by, AbstractC0777ab.f5062c, null);
            }
            if (c0638ac.f4112E.m2738a()) {
                AbstractC0777ab.m1972a(this.f5239by, AbstractC0777ab.f5063d, null);
            }
            if (c0638ac.f4113F.m2738a()) {
                AbstractC0777ab.m1972a(this.f5239by, AbstractC0777ab.f5064e, null);
            }
            if (c0638ac.f4114G.m2738a()) {
                AbstractC0777ab.m1972a(this.f5239by, AbstractC0777ab.f5065f, null);
            }
            if (c0638ac.f4105x.m2738a()) {
                this.f5114d.m2069a(12);
            }
            if (c0638ac.f4121N.m2738a() && m1921A() && m1920B()) {
                m1821k();
                this.f5157U = null;
                this.f5159W = this.f5117g;
                return;
            } else if (c0638ac.f4123P.m2738a() && m1798z()) {
                m1821k();
                this.f5157U = null;
                this.f5159W = this.f5118h;
                return;
            } else if (c0638ac.f4124Q.m2738a() && m1920B()) {
                m1821k();
                this.f5157U = null;
                this.f5159W = this.f5119i;
                return;
            } else {
                if (c0638ac.f4122O.m2738a()) {
                    m1803u();
                }
                if (c0638ac.f4103v.m2738a()) {
                    m1914H();
                }
                if (c0638ac.f4101t.m2738a() && m1087A.m1075M()) {
                    Core.LogDebug2("showing send chat");
                    this.f5114d.m2069a(13);
                }
                if (c0638ac.f4102u.m2738a() && m1087A.m1075M()) {
                    Core.LogDebug2("showing send team chat");
                    this.f5114d.m2069a(16);
                }
                if (m1087A.m1073O() || m1087A.f6126cb.m2464h()) {
                    if (c0638ac.f4119L.m2738a()) {
                        if (m1087A.f6237bt != 0.0f) {
                            if (!m1087A.f6126cb.m2464h()) {
                                C0831ad.m1588a((String) null, "Game paused");
                            }
                            m1087A.f6237bt = 0.0f;
                        } else {
                            m1087A.f6237bt = 1.0f;
                        }
                    }
                    boolean m2738a = c0638ac.f4117J.m2738a();
                    boolean m2738a2 = c0638ac.f4118K.m2738a();
                    if (m2738a || m2738a2) {
                        if (m2738a) {
                            boolean z4 = m1087A.f6237bt > 1.0f;
                            if (m1087A.f6237bt < 2.0f) {
                                m1087A.f6237bt = (float) (m1087A.f6237bt - 0.25d);
                            } else if (m1087A.f6237bt < 6.0f) {
                                m1087A.f6237bt = (float) (m1087A.f6237bt - 0.5d);
                            } else if (m1087A.f6237bt < 16.0f) {
                                m1087A.f6237bt -= 2.0f;
                            } else {
                                m1087A.f6237bt -= 4.0f;
                            }
                            if (m1087A.f6237bt < 0.0f) {
                                m1087A.f6237bt = 0.0f;
                            }
                            if (z4 && m1087A.f6237bt < 1.0f) {
                                m1087A.f6237bt = 1.0f;
                            }
                        } else if (m2738a2) {
                            boolean z5 = m1087A.f6237bt < 1.0f;
                            if (m1087A.f6237bt < 2.0f) {
                                m1087A.f6237bt = (float) (m1087A.f6237bt + 0.25d);
                            } else if (m1087A.f6237bt < 6.0f) {
                                m1087A.f6237bt = (float) (m1087A.f6237bt + 0.5d);
                            } else if (m1087A.f6237bt < 16.0f) {
                                m1087A.f6237bt += 2.0f;
                            } else {
                                m1087A.f6237bt += 4.0f;
                            }
                            if (m1087A.f6126cb.m2464h()) {
                                if (m1087A.f6237bt > 64.0f) {
                                    m1087A.f6237bt = 64.0f;
                                }
                            } else if (m1087A.f6237bt > 5.0f) {
                                m1087A.f6237bt = 5.0f;
                            }
                            if (z5 && m1087A.f6237bt > 1.0f) {
                                m1087A.f6237bt = 1.0f;
                            }
                        }
                        if (!m1087A.f6126cb.m2464h()) {
                            C0831ad.m1588a((String) null, "Game speed now: " + m1087A.f6237bt);
                        }
                    }
                } else if (c0638ac.f4119L.m2738a() && m1087A.f6122bX.IsServer && m1087A.f6122bX.f5539bm) {
                    m1087A.f6122bX.m1505e(!m1087A.f6122bX.f5515al);
                }
                m1087A.f6160cS = C0758f.m2211a(m1087A.f6160cS, f);
                if (c0638ac.f4132Y.m2738a()) {
                    m1087A.f6160cS = 180.0f;
                }
                if (m1087A.f6100bv && c0638ac.f4135ab.m2738a()) {
                    m1087A.f6231bl = !m1087A.f6231bl;
                    Core.LogDebug2("debugTempMode now: " + m1087A.f6231bl);
                    m1850b("debug: " + m1087A.f6231bl);
                }
                if (m1087A.f6100bv && m1087A.f6231bl && c0638ac.f4136ac.m2738a()) {
                    C0136a.f553ar = !C0136a.f553ar;
                    m1850b("AI debug view: " + C0136a.f553ar);
                }
                if (m1087A.f6100bv && m1087A.f6231bl && c0638ac.f4137ad.m2738a()) {
                    C1049f.f6658a = !C1049f.f6658a;
                    m1850b("Map debug: " + C1049f.f6658a);
                }
                if (m1087A.m1073O() || m1087A.f6126cb.m2464h()) {
                    if (m1087A.f6100bv) {
                        if (c0638ac.f4129V.m2738a()) {
                            m1087A.f6098bp = !m1087A.f6098bp;
                        }
                        if (c0638ac.f4130W.m2738a()) {
                            if (m1087A.f6237bt == 1.0f) {
                                m1087A.f6237bt = 0.1f;
                            } else {
                                m1087A.f6237bt = 1.0f;
                            }
                        }
                        if (c0638ac.f4131X.m2738a()) {
                            Core.LogDebug2("Adding test popup");
                            m1087A.f6122bX.m1627U();
                        }
                        if (c0638ac.f4133Z.m2738a()) {
                            m1087A.f6101bw = !m1087A.f6101bw;
                        }
                        if (c0638ac.f4134aa.m2738a()) {
                            Iterator it3 = AbstractC1120w.f6962eo.iterator();
                            while (it3.hasNext()) {
                                AbstractC1120w abstractC1120w3 = (AbstractC1120w) it3.next();
                                if (abstractC1120w3 instanceof AbstractC0623y) {
                                    AbstractC0623y abstractC0623y3 = (AbstractC0623y) abstractC1120w3;
                                    if (abstractC0623y3.f1644cE) {
                                        abstractC0623y3.m3006U();
                                    }
                                }
                            }
                        }
                    }
                    if (c0638ac.f4128U.m2738a()) {
                        m1087A.f6100bv = !m1087A.f6100bv;
                        if (m1087A.f6100bv) {
                            m1800x();
                        }
                    }
                }
            }
        }
        if (m1087A.f6100bv && !m1087A.m1073O() && !m1087A.f6126cb.m2464h()) {
            m1087A.f6100bv = false;
        }
        if (m1087A.f6100bv) {
            if (this.f5113c != null && (this.f5113c.f6953eg || this.f5113c.f1607bT)) {
                this.f5113c = null;
            }
            if (this.f5113c == null) {
                Core.LogDebug2("Creating new debug editor");
                this.f5113c = new C0555h(false);
                this.f5113c.m2894b(m1087A.f6099bs);
            }
            if (m1811p() == 0) {
                m1800x();
                m1822j(this.f5113c);
            }
            if (m1087A.settingEngine.liveReloading && m1087A.f6239bx % 100 == 0 && !m1087A.f6126cb.m2465g()) {
                C0348af.m4280c();
            }
        } else {
            if (this.f5113c != null && (this.f5113c.f6953eg || this.f5113c.f1607bT)) {
                this.f5113c = null;
            }
            if (this.f5113c != null && !m1087A.f6126cb.m2464h()) {
                m1827h();
            }
        }
        if (this.f5150N) {
            if (this.f5142F) {
                this.f5114d.f4977aq = this.f5147K - this.f5130t;
            } else {
                int i2 = 1;
                if (m1087A.settingEngine.mouseOrders == 2) {
                    i2 = 2;
                }
                if ((!m1087A.settingEngine.mouseSupport || this.f5133w != i2) && !m1842c(m1087A)) {
                    SettingsEngine settingsEngine = m1087A.settingEngine;
                    double d = this.f5146J - this.f5129s;
                    double d2 = this.f5147K - this.f5130t;
                    float m2157b2 = C0758f.m2157b(0.0f, 0.0f, (float) d, (float) d2);
                    double d3 = (d * settingsEngine.scrollSpeed) / m1087A.f6256cW;
                    double d4 = (d2 * settingsEngine.scrollSpeed) / m1087A.f6256cW;
                    if (f != 0.0f && m2157b2 > 50.0d * f) {
                        float f13 = 0.7f;
                        if (Core.m1010au()) {
                            f13 = 1.7f;
                        }
                        this.f5148L = (float) (d3 * f13);
                        this.f5149M = (float) (d4 * f13);
                    }
                    m1087A.f6146cx = (float) (m1087A.f6146cx + (d3 * 2.0d));
                    m1087A.f6147cy = (float) (m1087A.f6147cy + (d4 * 2.0d));
                }
            }
            this.f5146J = this.f5129s;
            this.f5147K = this.f5130t;
        }
        if (m1087A.settingEngine.mouseSupport && (this.f5251bE.f5006a != ((int) m1087A.m1026ae()) || this.f5251bE.f5007b != ((int) m1087A.m1025af()))) {
            this.f5251bE.f5006a = (int) m1087A.m1026ae();
            this.f5251bE.f5007b = (int) m1087A.m1025af();
            this.f5124n.m1989b(this.f5251bE);
        }
        if (this.f5151O && m1913I()) {
            this.f5124n.m1989b(C0765c.m2018a((int) this.f5131u, (int) this.f5132v));
        }
        this.f5124n.m1991b(f);
    }

    /* renamed from: h */
    public void m1827h() {
        if (this.f5113c != null) {
            m1818l(this.f5113c);
            this.f5113c.m4700ch();
            this.f5113c = null;
        }
    }

    /* renamed from: i */
    public C0555h m1825i() {
        return this.f5113c;
    }

    /* renamed from: a */
    public void m1879a(C0555h c0555h) {
        this.f5113c = c0555h;
    }

    /* renamed from: a */
    public boolean m1870a(Core core) {
        if (!core.settingEngine.keyboardSupport) {
            return false;
        }
        return core.m993c(59, 60);
    }

    /* renamed from: b */
    public boolean m1851b(Core core) {
        if (!core.settingEngine.keyboardSupport) {
            return false;
        }
        return core.m993c(113, 114);
    }

    /* renamed from: c */
    public boolean m1842c(Core core) {
        if (!core.settingEngine.keyboardSupport) {
            return false;
        }
        return core.m993c(57, 58);
    }

    /* renamed from: b */
    public void m1859b(float f) {
        Core m1087A = Core.m1087A();
        this.f5156T += 0.2f * f;
        if (this.f5156T > 360.0f) {
            this.f5156T -= 360.0f;
        }
        this.f5224bj.m5874a((int) (m1087A.f6134ck - m1087A.f6138cp), 0, (int) m1087A.f6134ck, (int) m1087A.f6135cl);
        if (!f5247bA) {
            if (this.f5246bz) {
                this.f5227bm.m5937a();
                this.f5227bm.m5908b(Color.m5948a(255, 33, 40, 52));
                this.f5227bm.m5926a(Paint.Style.f219a);
                m1087A.f6113bO.mo162b(this.f5224bj, this.f5227bm);
            } else {
                m1087A.f6113bO.mo195a(this.f5220bf, this.f5224bj, (Paint) null);
            }
            this.f5227bm.m5937a();
            this.f5227bm.m5908b(Color.m5948a(255, 0, 0, 0));
            this.f5227bm.m5926a(Paint.Style.f220b);
            m1087A.f6113bO.mo162b(this.f5224bj, this.f5227bm);
        }
        this.f5240bR = 0;
        this.f5242bT = 0;
        this.f5241bS = 0;
        this.f5244bV = this.f5245bW;
        this.f5245bW = 0;
        if (m1087A.f6126cb.m2464h() || (m1087A.f6099bs != null && m1087A.f6099bs.m5074b())) {
            AbstractC0623y m1807r = m1807r();
            if (m1807r != null) {
                m1867a(m1087A, m1807r.f1609bV, false, true);
            }
        } else {
            AbstractC0623y m1805s = m1805s();
            if (m1087A.f6099bs != null && m1087A.f6099bs != AbstractC0197n.f1371i && !m1087A.f6099bs.m5074b() && !m1087A.f6126cb.m2464h()) {
                m1867a(m1087A, m1087A.f6099bs, false, true);
            }
            if (m1805s != null && m1087A.f6099bs != m1805s.f1609bV && m1816m(m1805s)) {
                m1867a(m1087A, m1805s.f1609bV, true, true);
            }
        }
        if (m1087A.f6100bv && !m1087A.f6126cb.m2464h()) {
            String str = VariableScope.nullOrMissingString;
            if (m1087A.f6100bv) {
                str = str + "Editor Active\n";
            }
            if (m1087A.f6237bt != 1.0f) {
                str = str + "Game Speed: " + m1087A.f6237bt + "x\n";
            }
            if (m1087A.f6101bw) {
                str = str + "Invincible Units\n";
            }
            boolean z = false;
            Iterator it = AbstractC0197n.m5058c().iterator();
            while (it.hasNext()) {
                AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
                if (abstractC0197n instanceof C0136a) {
                    z = ((C0136a) abstractC0197n).f619bF > 0.0f;
                }
            }
            if (z) {
                str = str + "AIs frozen\n";
            }
            this.f5227bm.m5937a();
            this.f5227bm.m5908b(Color.m5948a(0, 0, 0, 0));
            this.f5227bm.m5926a(Paint.Style.f219a);
            float f2 = 70.0f * m1087A.f6132ci;
            float f3 = 40.0f;
            if (m1087A.f6134ck < 600.0f && m1087A.f6135cl > 650.0f) {
                f2 = 10.0f;
                f3 = 60.0f * m1087A.f6132ci;
            }
            m1087A.f6113bO.mo180a(str, f2, f3, this.f5181as, this.f5227bm, 6.0f);
        }
        m1823j();
        this.f5124n.m1981f();
    }

    /* renamed from: j */
    public void m1823j() {
        Core.m1087A();
    }

    /* renamed from: a */
    public void m1867a(Core core, AbstractC0197n abstractC0197n, boolean z, boolean z2) {
        if (abstractC0197n.f1309n) {
            m1869a(core, abstractC0197n, z, C0431c.f2762B, abstractC0197n.m5097W() + abstractC0197n.f1311p, (C0439f) null, 0, (C0428a) null);
        }
        if (z2) {
            this.f5252bF.m3986g(abstractC0197n.m5096X());
            Iterator it = C0428a.m4046e().iterator();
            while (it.hasNext()) {
                C0428a c0428a = (C0428a) it.next();
                if (c0428a.m4048c() && c0428a.f2749o) {
                    this.f5252bF.m3998c(c0428a);
                }
            }
            this.f5252bF.m3989e();
            m1868a(core, abstractC0197n, z, this.f5252bF);
        }
    }

    /* renamed from: a */
    public void m1868a(Core core, AbstractC0197n abstractC0197n, boolean z, C0439f c0439f) {
        Iterator it = c0439f.f2802b.iterator();
        while (it.hasNext()) {
            C0438e c0438e = (C0438e) it.next();
            if (!c0438e.f2799a.m4060a()) {
                m1869a(core, abstractC0197n, z, c0438e.f2799a, c0438e.f2800b, c0439f, 0, (C0428a) null);
            }
        }
    }

    /* renamed from: a */
    public boolean m1869a(Core core, AbstractC0197n abstractC0197n, boolean z, C0428a c0428a, double d, C0439f c0439f, int i, C0428a c0428a2) {
        float f;
        float f2;
        C0428a c0428a3;
        if (i == 0) {
            this.f5243bU = 0;
        }
        boolean z2 = false;
        if (i < 6 && c0439f != null && (c0428a3 = c0428a.f2743i) != null && ((c0428a.f2744j || d != 0.0d) && m1869a(core, abstractC0197n, z, c0428a3, c0439f.m4022a(c0428a3), c0439f, i + 1, c0428a))) {
            z2 = true;
        }
        if (d == 0.0d && !c0428a.f2749o) {
            if (z2) {
                return true;
            }
            return false;
        }
        String m4058a = c0428a.m4058a(d, true);
        int m5068b = abstractC0197n.m5068b(c0428a);
        int m5088a = abstractC0197n.m5088a(c0428a);
        if (m5088a != 0) {
            m4058a = m4058a + "(+" + m5068b + ")(-" + m5088a + ")";
        } else if (m5068b != 0) {
            if (m5068b >= 0) {
                m4058a = m4058a + "(+" + m5068b + ")";
            } else {
                m4058a = m4058a + "(" + m5068b + ")";
            }
        }
        int i2 = ((int) (core.f6134ck - core.f6138cp)) - this.f5243bU;
        Paint paint = this.f5178ap;
        if (z) {
            paint = this.f5179aq;
        } else {
            Integer m4044g = c0428a.m4044g();
            if (m4044g != null) {
                this.f5176an.m5925a(paint);
                paint = this.f5176an;
                paint.m5908b(m4044g.intValue());
            }
        }
        float mo157b = core.f6113bO.mo157b(m4058a, paint);
        float mo179a = core.f6113bO.mo179a(m4058a, paint);
        if (this.f5245bW < mo157b) {
            this.f5245bW = (int) mo157b;
        }
        int i3 = this.f5242bT;
        if (c0428a.f2755u) {
            i3 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        if (i3 == 0) {
            i4 = this.f5241bS;
        } else {
            i5 = this.f5240bR;
        }
        int i6 = 0;
        int i7 = 6;
        int i8 = 6;
        int i9 = 6;
        boolean z3 = false;
        float f3 = mo157b + 6 + 6;
        if (c0428a.f2745k) {
            f3 += 80.0f;
        }
        if (i2 < f3 && c0428a.f2743i != null) {
            z3 = true;
            this.f5240bR = (int) (this.f5240bR + mo179a + 6);
            i5 = this.f5240bR;
            i2 += this.f5243bU;
            this.f5243bU = 0;
        }
        if (i3 != 0) {
            i7 = 0;
        }
        if (c0428a2 != null && !c0428a2.f2745k) {
            i8 = 0;
        }
        if (z2 && !c0428a.f2745k) {
            i2 += 6;
            i9 = 0;
        }
        if (z2 && c0428a.f2745k && !z3) {
            i6 = core.f6113bO.mo157b("AA", paint);
        }
        int i10 = i2 - i6;
        C0934e m4041j = c0428a.m4041j();
        float f4 = 1.0f;
        if (m4041j != null) {
            float f5 = mo179a - 3.0f;
            if (f5 < 3.0f) {
                f5 = 3.0f;
            }
            f4 = C0795d.m1927a(m4041j, mo179a * 3.0f, f5);
            f = (m4041j.f6402p * f4) + 3.0f;
            i8 += (int) f;
        } else {
            f = 0.0f;
        }
        C0795d.m1925a(m4058a, ((i10 - mo157b) - i4) - 6, i5 + 6, paint, this.f5180ar, i8, i7, i9, 6);
        if (m4041j != null) {
            core.f6113bO.mo197a(m4041j, (int) (((f2 - (f / 2.0f)) - (m4041j.f6404r * f4)) - 3.0f), (int) (((i5 + 6) + (mo179a / 2.0f)) - (m4041j.f6405s * f4)), this.f5230bp, 0.0f, f4);
        }
        if (i == 0) {
            if (i3 == 0) {
                this.f5241bS = (int) (this.f5241bS + mo157b + i9 + i8);
            }
            if (this.f5242bT == i3) {
                this.f5240bR = (int) (this.f5240bR + mo179a + 6);
                this.f5242bT++;
            }
        }
        this.f5243bU = (int) (this.f5243bU + mo157b + i9 + i8 + i6);
        return true;
    }

    /* renamed from: b */
    public boolean m1848b(boolean z) {
        return m1861a(z, false, false);
    }

    /* renamed from: a */
    public boolean m1862a(boolean z, boolean z2) {
        return m1861a(z, true, z2);
    }

    /* renamed from: a */
    public boolean m1861a(boolean z, boolean z2, boolean z3) {
        Core m1087A = Core.m1087A();
        if (Core.m1010au()) {
            return false;
        }
        this.f5212aX = true;
        float f = m1087A.f6132ci * 0.6f;
        int i = (int) (100.0f * f);
        int i2 = (int) (10.0f * f);
        int i3 = (int) ((m1087A.f6135cl - ((int) (9.0f * f))) - (i * this.f5213aY));
        if (f5250bD) {
            i3 = (int) (i3 - m1087A.f6121bW.f5283d);
        }
        if (z3) {
            int i4 = ((int) (20.0f * f)) + i + ((int) (20.0f * f)) + i;
            this.f5225bk.m5874a(i2 + i4, i3, i2 + i4 + i, i3 + i);
            m1087A.f6113bO.mo197a(this.f5211aW, this.f5225bk.f230a, this.f5225bk.f231b, this.f5214aZ, 0.0f, f);
        } else if (z) {
            this.f5225bk.m5874a(i2, i3, i2 + i, i3 + i);
            m1087A.f6113bO.mo197a(this.f5210aV, this.f5225bk.f230a, this.f5225bk.f231b, this.f5214aZ, 0.0f, f);
        } else {
            int i5 = ((int) (20.0f * f)) + i;
            this.f5225bk.m5874a(i2 + i5, i3, i2 + i5 + i, i3 + i);
            m1087A.f6113bO.mo197a(this.f5209aU, this.f5225bk.f230a, this.f5225bk.f231b, this.f5214aZ, 0.0f, f);
        }
        if (this.f5151O && !this.f5150N) {
            C0758f.m2195a(this.f5225bk, 10.0f * f);
            if (this.f5225bk.m5871b((int) this.f5129s, (int) this.f5130t)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m1821k() {
        Core.m1087A();
        if (this.f5159W != null) {
            if (this.f5159W.mo3081e() == EnumC0226u.f1476b) {
                this.f5159W = null;
                this.f5161Y = false;
                this.f5165ac = false;
                this.f5157U = null;
                this.f5172aj = false;
                this.f5160X++;
            } else {
                this.f5159W = null;
            }
            this.f5175am = 0;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m1846c(float f) {
        float f2;
        float f3;
        Core m1087A = Core.m1087A();
        Point m1772c = m1087A.f6121bW.m1772c(this.f5129s, this.f5130t);
        if (m1772c != null) {
            f2 = m1772c.f224a;
            f3 = m1772c.f225b;
        } else {
            f2 = (this.f5129s / m1087A.f6256cW) + m1087A.f6144cv;
            f3 = (this.f5130t / m1087A.f6256cW) + m1087A.f6145cw;
        }
        this.f5162Z = C0758f.m2211a(this.f5162Z, f);
        this.f5224bj.m5874a((int) (m1087A.f6134ck - m1087A.f6138cp), 0, (int) m1087A.f6134ck, (int) m1087A.f6135cl);
        if (!f5247bA && ((this.f5151O || this.f5140D) && this.f5224bj.m5871b((int) this.f5129s, (int) this.f5130t))) {
            this.f5208aT = true;
        }
        this.f5114d.m2072a(f);
        this.f5114d.m2052b(f);
        this.f5154R += f;
        if (!m1087A.m948z()) {
            this.f5114d.m2071a(f, this.f5114d.m2043d(f));
            this.f5114d.m2034g(f);
            this.f5115e.m1795a(f);
            this.f5116f.m1949a(f);
            if (this.f5126p) {
                this.f5114d.m2047c(f);
            }
            this.f5114d.m2039e(f);
            this.f5114d.m2070a(f, true);
        }
        m1906a(f, f2, f3, m1772c);
        if (!m1087A.m948z() && !this.f5126p) {
            this.f5114d.m2047c(f);
        }
        boolean z = false;
        if (!this.f5150N) {
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            if (Core.m1010au() && m1087A.settingEngine.mouseSupport) {
                if (m1087A.settingEngine.mouseOrders == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (m1087A.settingEngine.mouseOrders == 1) {
                        if (m1087A.m980e(1)) {
                            z3 = true;
                        } else if (m1087A.m980e(2)) {
                            z4 = true;
                        }
                    } else if (m1087A.m980e(2)) {
                        z3 = true;
                    } else if (m1087A.m980e(1)) {
                        z4 = true;
                    }
                }
            }
            float f4 = f2;
            float f5 = f3;
            if (this.f5140D && m1772c != null && this.f5141E) {
                boolean z5 = false;
                if (!z2 && !z4) {
                    z5 = true;
                }
                z5 = (m1811p() == 0 || !m1920B()) ? true : true;
                if (z2 && this.f5128r > 20.0f) {
                    z5 = true;
                }
                if (z5) {
                    m1087A.m1003b(f4, f5);
                    z = true;
                }
            }
            if ((this.f5134x || (m1772c != null && (z2 || z4))) && !z && this.f5159W == null && this.f5151O) {
                if (this.f5128r > 30.0f) {
                    if (m1911a() && m1772c == null) {
                        m1800x();
                        m1857b(f4, f5, m1860b() / m1087A.f6256cW);
                        m1918D();
                    }
                } else {
                    m1087A.f6161cT = false;
                    if (!z2) {
                        if (z3) {
                            AbstractC0244am abstractC0244am = null;
                            if (m1772c == null) {
                                abstractC0244am = m1901a(f4, f5, true);
                            }
                            m1882a(abstractC0244am);
                        } else if (z4) {
                            AbstractC0244am abstractC0244am2 = null;
                            if (m1772c == null) {
                                abstractC0244am2 = m1901a(f4, f5, false);
                            }
                            boolean z6 = false;
                            if (abstractC0244am2 == null) {
                                z6 = true;
                            } else if (!m1880a(abstractC0244am2, false, f4, f5, m1772c)) {
                                z6 = true;
                            }
                            if (z6) {
                                m1845c(f4, f5, m1772c);
                            }
                        }
                    } else {
                        AbstractC0244am abstractC0244am3 = null;
                        AbstractC0244am abstractC0244am4 = null;
                        if (m1772c == null) {
                            abstractC0244am3 = m1901a(f4, f5, true);
                            abstractC0244am4 = m1901a(f4, f5, false);
                        }
                        if (abstractC0244am3 == null && abstractC0244am4 == null) {
                            m1845c(f4, f5, m1772c);
                        } else if (abstractC0244am4 != null) {
                            if (!m1880a(abstractC0244am4, true, f4, f5, m1772c)) {
                                if (!abstractC0244am4.mo1757t()) {
                                    m1882a(abstractC0244am4);
                                } else if (abstractC0244am3 != null) {
                                    m1882a(abstractC0244am3);
                                }
                            }
                        } else {
                            m1882a(abstractC0244am3);
                        }
                    }
                }
            }
        }
        if (this.f5159W == null && this.f5140D && !this.f5150N && !this.f5141E && !this.f5208aT) {
            this.f5177ao.m5926a(Paint.Style.f219a);
            this.f5177ao.m5936a(1.0f);
            if (this.f5128r > 20.0f && m1911a()) {
                float m1860b = m1860b();
                this.f5177ao.m5933a(100, 0, 255, 0);
                m1087A.f6113bO.mo223a(this.f5129s, this.f5130t, m1860b, this.f5177ao);
                this.f5177ao.m5926a(Paint.Style.f220b);
                this.f5177ao.m5936a(1.0f);
                this.f5177ao.m5933a(200, 0, 255, 0);
                m1087A.f6113bO.mo223a(this.f5129s, this.f5130t, m1860b, this.f5177ao);
            }
        }
        if (m1087A.f6230bk && m1087A.m1029ab() && m1087A.m1027ad() > 0) {
            Paint paint = new Paint();
            paint.m5903c(100);
            for (int i = 0; i < m1087A.m1027ad(); i++) {
                m1087A.f6113bO.mo137i();
                m1087A.f6113bO.mo226a(0.7f, 0.7f, m1087A.m1002b(i), m1087A.m994c(i));
                m1087A.f6113bO.mo198a(this.f5221bg, m1087A.m1002b(i), m1087A.m994c(i), paint);
                m1087A.f6113bO.mo136j();
            }
        }
        if (!this.f5140D) {
            this.f5128r = 0.0f;
            this.f5150N = false;
        }
        this.f5139C = this.f5140D;
        m1087A.m1028ac();
        if (f5263bQ) {
            m1912J();
            f5263bQ = false;
        }
    }

    /* renamed from: a */
    public void m1906a(float f, float f2, float f3, Point point) {
        Core m1087A = Core.m1087A();
        AbstractC0623y m2037f = this.f5114d.m2037f();
        if (this.f5212aX) {
            this.f5213aY = C0758f.m2210a(this.f5213aY, 1.0f, 0.05f * f);
            this.f5213aY = (float) (this.f5213aY + (0.08d * (1.0f - this.f5213aY)));
        } else {
            this.f5213aY = C0758f.m2210a(this.f5213aY, 0.0f, 0.3f * f);
        }
        this.f5212aX = false;
        if (this.f5159W != null) {
            if (this.f5159W instanceof C0212g) {
                C0212g c0212g = (C0212g) this.f5159W;
                if (c0212g.f1433b != null) {
                    m2037f = c0212g.f1433b;
                }
            }
            if (this.f5159W.mo3081e() == EnumC0226u.f1479e) {
                m1886a(this.f5159W, false, m2037f, false, true);
                if (m1848b(false) || m1817m()) {
                    m1821k();
                    this.f5151O = false;
                } else if (this.f5151O && !this.f5150N && !m1819l()) {
                    AbstractC0244am m1901a = m1901a(f2, f3, false);
                    if (m1901a != null && this.f5159W.mo4931o(m1901a)) {
                        m1852b(m1901a);
                        if (!m1870a(m1087A)) {
                            m1821k();
                        }
                    } else {
                        m1908a(f2, f3, 0.0f);
                    }
                    this.f5151O = false;
                }
            } else if (this.f5159W.mo3081e() == EnumC0226u.f1480f) {
                m1886a(this.f5159W, false, m2037f, false, true);
                if (m1848b(false) || m1817m()) {
                    m1821k();
                    this.f5151O = false;
                } else if (this.f5151O && !this.f5150N && !m1819l()) {
                    AbstractC0244am m1901a2 = m1901a(f2, f3, true);
                    if (m1901a2 != null && this.f5159W.mo4931o(m1901a2)) {
                        m1837d(m1901a2);
                        if (!m1870a(m1087A)) {
                            m1821k();
                        }
                    } else {
                        m1908a(f2, f3, 0.0f);
                    }
                    this.f5151O = false;
                }
            } else if (this.f5159W.mo3081e() == EnumC0226u.f1478d) {
                m1886a(this.f5159W, false, m2037f, false, true);
                if (m1848b(false) || m1817m()) {
                    m1821k();
                    this.f5151O = false;
                } else if (this.f5151O && !this.f5150N && !m1819l()) {
                    m1858b(f2, f3);
                    m1821k();
                    this.f5151O = false;
                }
            } else if (this.f5159W.mo3081e() == EnumC0226u.f1481g) {
                m1886a(this.f5159W, false, m2037f, false, true);
                AbstractC0623y m2037f2 = this.f5114d.m2037f();
                AbstractC0224s abstractC0224s = this.f5159W;
                if (this.f5159W instanceof C0212g) {
                    C0212g c0212g2 = (C0212g) abstractC0224s;
                    if (c0212g2.f1433b != null) {
                        m2037f2 = c0212g2.f1433b;
                    }
                    abstractC0224s = c0212g2.f1432a;
                }
                if (m2037f2 != null && (m2037f2 instanceof AbstractC0623y)) {
                    m1087A.f6113bO.mo137i();
                    m1087A.m1071Q();
                    ((AbstractC0623y) m2037f2).m2983a(abstractC0224s);
                    m1087A.f6113bO.mo136j();
                }
                boolean z = (!this.f5151O || this.f5150N || m1819l()) ? false : true;
                if (this.f5159W.mo3074p()) {
                    if (Core.m1009av()) {
                        z = m1815n() && this.f5134x && m1913I();
                    } else {
                        z = this.f5140D && this.f5134x && m1913I();
                    }
                }
                if (m1848b(false) || m1817m()) {
                    m1821k();
                    this.f5151O = false;
                } else if (z && point == null) {
                    boolean z2 = false;
                    if (m1889a(this.f5159W, f2, f3)) {
                        z2 = true;
                    }
                    if (!z2) {
                        m1853b(this.f5159W, f2, f3);
                        if (!m1870a(m1087A) && !this.f5159W.mo3075o()) {
                            m1821k();
                        }
                    } else {
                        m1908a(f2, f3, 0.0f);
                    }
                    this.f5151O = false;
                }
            } else if (this.f5159W.mo3081e() == EnumC0226u.f1482h) {
                m1886a(this.f5159W, false, m2037f, false, true);
                if (m1848b(false) || m1817m()) {
                    m1821k();
                    this.f5151O = false;
                } else if (this.f5151O && !this.f5150N && !m1819l()) {
                    m1839d(f2, f3, point);
                    if (!m1870a(m1087A)) {
                        m1821k();
                        this.f5151O = false;
                    }
                }
            } else if (this.f5159W.mo3081e() == EnumC0226u.f1486l) {
                m1886a(this.f5159W, false, m2037f, false, true);
                if (m1848b(false) || m1817m()) {
                    m1821k();
                    this.f5151O = false;
                } else if (this.f5151O && !this.f5150N && !m1819l()) {
                    AbstractC0244am m1901a3 = m1901a(f2, f3, true);
                    if (m1901a3 != null && this.f5159W.mo4931o(m1901a3)) {
                        m1833e(m1901a3);
                        m1821k();
                    } else {
                        m1908a(f2, f3, 0.0f);
                    }
                    this.f5151O = false;
                }
            } else if (this.f5159W.mo3081e() == EnumC0226u.f1487m) {
                m1886a(this.f5159W, false, m2037f, false, true);
                if (m1848b(false) || m1817m()) {
                    m1821k();
                    this.f5151O = false;
                } else if (this.f5151O && !this.f5150N && !m1819l()) {
                    m1903a(f2, f3, point, this.f5175am == 0);
                    this.f5175am++;
                }
            } else if (this.f5159W.mo3081e() == EnumC0226u.f1484j) {
                m1886a(this.f5159W, false, m2037f, false, true);
                if (m1848b(false) || m1817m()) {
                    m1821k();
                    this.f5151O = false;
                } else if (this.f5151O && !this.f5150N && !m1819l() && point == null) {
                    if (this.f5159W instanceof C0215j) {
                        m1904a(f2, f3, point, (C0215j) this.f5159W);
                    } else {
                        Core.m998b("orderBuildingSpecialAction is not a PingMapAction, it is: " + this.f5159W.getClass().getName());
                    }
                    m1821k();
                    this.f5151O = false;
                }
            } else if (this.f5159W.mo6163i() != null && this.f5159W.mo3081e() == EnumC0226u.f1476b) {
                m1905a(f2, f3, point);
            }
        }
    }

    /* renamed from: a */
    public void m1905a(float f, float f2, Point point) {
        boolean z;
        Point m1797a;
        Core m1087A = Core.m1087A();
        AbstractC0244am m2037f = this.f5114d.m2037f();
        boolean z2 = false;
        if (m2037f != null && m2037f.m4788a(this.f5159W.m4910N()) != null) {
            z2 = this.f5159W.mo3086a(m2037f, true) && !C0760a.m2066a(this.f5159W);
            if (!this.f5159W.mo3084b(m2037f)) {
                z2 = false;
            }
        }
        m1886a(this.f5159W, false, m2037f, !z2, true);
        float f3 = this.f5131u / m1087A.f6256cW;
        float f4 = this.f5132v / m1087A.f6256cW;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        if (Core.m1009av() && m1087A.settingEngine.mouseSupport) {
            z3 = true;
            z6 = this.f5143G;
        }
        if (z3) {
            if (m1815n()) {
                if (!this.f5172aj) {
                    this.f5172aj = true;
                    this.f5170ah = f3 + m1087A.f6144cv;
                    this.f5171ai = f4 + m1087A.f6145cw;
                }
            } else {
                this.f5172aj = false;
            }
            if (this.f5172aj) {
                float f5 = f3 - (this.f5170ah - m1087A.f6144cv);
                float f6 = f4 - (this.f5171ai - m1087A.f6145cw);
                if (C0758f.m2137c(f5) > 4.0f || C0758f.m2137c(f6) > 4.0f) {
                    z4 = true;
                }
            }
        }
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = false;
        if (Core.m1010au() && m1087A.settingEngine.mouseSupport) {
            z12 = true;
        }
        if (this.f5161Y && !z12) {
            if (z2) {
                if (!this.f5165ac && m1862a(true, false)) {
                    m1087A.f6111bM.m2770b(C0631e.f4042h, 0.5f);
                    this.f5151O = false;
                    z7 = true;
                }
                if (m1862a(true, true)) {
                    m1087A.f6111bM.m2770b(C0631e.f4042h, 0.5f);
                    this.f5151O = false;
                    z9 = true;
                }
            }
            if (m1862a(false, false)) {
                m1087A.f6111bM.m2770b(C0631e.f4043i, 0.7f);
                this.f5151O = false;
                z8 = true;
            }
        }
        boolean z13 = false;
        if (Core.m1009av() && m1087A.settingEngine.mouseSupport) {
            z13 = true;
        }
        if (this.f5151O && !this.f5150N) {
            z13 = true;
        }
        if (Core.m1011at()) {
            z5 = true;
            if (m1087A.m1027ad() == 2) {
                z13 = true;
                f3 = m1087A.m1002b(0) / m1087A.f6256cW;
                f4 = m1087A.m994c(0) / m1087A.f6256cW;
                float m1002b = m1087A.m1002b(1) / m1087A.f6256cW;
                this.f5172aj = true;
                this.f5170ah = m1002b;
                this.f5171ai = m1087A.m994c(1) / m1087A.f6256cW;
            } else if (this.f5151O && !this.f5150N) {
                this.f5172aj = false;
            }
            if (this.f5172aj) {
                z4 = true;
            }
        }
        if (z13) {
            this.f5161Y = true;
            this.f5163aa = f3 * m1087A.f6256cW;
            this.f5164ab = f4 * m1087A.f6256cW;
            if (!m1909a(m1087A.m1026ae(), m1087A.m1025af())) {
                this.f5161Y = false;
                z11 = false;
            }
        }
        float f7 = this.f5170ah;
        float f8 = this.f5171ai;
        if (z5) {
            f7 += m1087A.f6144cv + m1087A.f6139cq;
            f8 += m1087A.f6145cw + m1087A.f6140cr;
        }
        InterfaceC0303as mo6163i = this.f5159W.mo6163i();
        int mo4860t = this.f5159W.mo4860t();
        boolean z14 = false;
        if (Core.m1009av() && m1087A.settingEngine.mouseSupport && !m1087A.f6247cJ.m5871b((int) this.f5131u, (int) this.f5132v)) {
            z14 = true;
        }
        AbstractC0244am m4736c = AbstractC0244am.m4736c(mo6163i);
        if ((m4736c == null || !(m4736c instanceof AbstractC0623y)) && C0453l.f2903b != null) {
            m4736c = AbstractC0244am.m4736c(C0453l.f2903b);
        }
        if (this.f5161Y && !z14) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m4736c;
            m1087A.f6110bL.m5309b((this.f5163aa / m1087A.f6256cW) + m1087A.f6144cv, (this.f5164ab / m1087A.f6256cW) + m1087A.f6145cw);
            abstractC0623y.f6958el = m1087A.f6110bL.f801T;
            abstractC0623y.f6959em = m1087A.f6110bL.f802U;
            if (mo6163i.mo4467p()) {
                z4 = false;
                if (C0799h.m1797a((int) abstractC0623y.f6958el, (int) abstractC0623y.f6959em, 3) != null) {
                    abstractC0623y.f6958el = m1797a.f224a;
                    abstractC0623y.f6959em = m1797a.f225b;
                }
            }
            if (!abstractC0623y.m4758bI()) {
                abstractC0623y.f1618ce = 0.0f;
            } else {
                abstractC0623y.f1618ce = -90.0f;
            }
            abstractC0623y.f6958el += abstractC0623y.m4710cX();
            abstractC0623y.f6959em += abstractC0623y.m4709cY();
            abstractC0623y.m2894b(this.f5157U.f1609bV);
            abstractC0623y.mo3356a(mo4860t);
            abstractC0623y.f1627cn = true;
            String m2884b = abstractC0623y.m2884b(false, m1087A.f6099bs);
            if (C0741a.m2404a(m1087A.f6099bs, abstractC0623y, this.f5160X)) {
                m2884b = "{0}";
            }
            if (m1811p() == 1 && m2037f != null && (m2037f instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m2037f;
                if (!abstractC0623y2.m2936aR()) {
                    float m2209a = C0758f.m2209a(abstractC0623y2.f6958el, abstractC0623y2.f6959em, abstractC0623y.f6958el, abstractC0623y.f6959em);
                    float f9 = abstractC0623y2.mo3167f(abstractC0623y.mo1758r());
                    if (f9 > 800000.0f) {
                        z = true;
                    } else {
                        z = m2209a <= f9 * f9;
                    }
                    if (!z) {
                        m2884b = "{0}";
                    }
                }
            }
            if (z4) {
            }
            AbstractC0244am abstractC0244am = null;
            if (m1811p() == 1) {
                abstractC0244am = m2037f;
            }
            if (z2) {
                if (z4) {
                    if (Core.m1010au() || (Core.m1011at() && m1087A.m1027ad() == 2)) {
                        m1087A.f6113bO.mo225a(f3 * m1087A.f6256cW, f4 * m1087A.f6256cW, (f7 - m1087A.f6144cv) * m1087A.f6256cW, (f8 - m1087A.f6145cw) * m1087A.f6256cW, this.f5231bq);
                    } else {
                        m1087A.f6113bO.mo225a((abstractC0623y.f6958el - m1087A.f6144cv) * m1087A.f6256cW, (abstractC0623y.f6959em - m1087A.f6145cw) * m1087A.f6256cW, (f7 - m1087A.f6144cv) * m1087A.f6256cW, (f8 - m1087A.f6145cw) * m1087A.f6256cW, this.f5231bq);
                    }
                    m2884b = null;
                    m1878a(abstractC0623y, f7, f8, abstractC0623y.f6958el, abstractC0623y.f6959em, true, (ArrayList) null, abstractC0244am);
                } else {
                    m1877a(abstractC0623y, abstractC0623y.f6958el, abstractC0623y.f6959em, true, z6, abstractC0244am);
                }
            }
            abstractC0623y.mo3356a(1);
            if (z11 && m1813o()) {
                this.f5151O = false;
                if (m1870a(m1087A)) {
                    z9 = true;
                    z10 = true;
                } else {
                    z7 = true;
                }
            }
            if (m1817m()) {
                this.f5151O = false;
                z8 = true;
            }
            if (this.f5151O && !this.f5150N) {
                float f10 = f4;
                float f11 = this.f5173ak;
                float f12 = this.f5174al;
                if (C0758f.m2137c(f11 - f3) < 15.0f && C0758f.m2137c(f12 - f10) < 15.0f && this.f5162Z != 0.0f) {
                    this.f5151O = false;
                    m1087A.f6111bM.m2770b(C0631e.f4042h, 0.5f);
                    if (this.f5165ac) {
                        z9 = true;
                    } else {
                        z7 = true;
                    }
                }
                this.f5162Z = 80.0f;
                this.f5173ak = f3;
                this.f5174al = f4;
            }
            if ((z7 || z9) && z2) {
                if (m2884b != null) {
                    m1087A.f6111bM.m2770b(C0631e.f4046l, 0.7f);
                    if (m2884b != "{0}") {
                        String str = m2884b;
                        if (str == "{2}") {
                            str = this.f5237bw;
                        }
                        if (str == "{3}") {
                            str = this.f5238bx;
                        }
                        if (str == "{1}") {
                            str = this.f5236bv;
                        }
                        m1841c(str);
                    }
                } else {
                    float f13 = abstractC0623y.f6958el;
                    float f14 = abstractC0623y.f6959em;
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        m1878a(abstractC0623y, f7, f8, abstractC0623y.f6958el, abstractC0623y.f6959em, false, arrayList, (AbstractC0244am) null);
                    } else {
                        arrayList.add(new PointF(f13, f14));
                    }
                    int i = 0;
                    boolean z15 = true;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PointF pointF = (PointF) it.next();
                        if (this.f5159W.m4919A()) {
                            C0749e m1801w = m1801w();
                            m1876a(m1801w);
                            m1801w.m2323a(this.f5159W.m4910N(), pointF, (AbstractC0244am) null);
                        } else {
                            C0749e m1801w2 = m1801w();
                            if (z15) {
                                z15 = false;
                                if (z9) {
                                    if (!m1801w2.f4842e) {
                                        m1801w2.f4843f = true;
                                    }
                                    this.f5165ac = true;
                                }
                            } else {
                                m1801w2.f4842e = true;
                            }
                            AbstractC0623y m1805s = m1805s();
                            if (this.f5159W instanceof C0212g) {
                                AbstractC0623y abstractC0623y3 = ((C0212g) this.f5159W).f1433b;
                                m1801w2.m2319a(abstractC0623y3);
                                m1805s = abstractC0623y3;
                            } else {
                                m1876a(m1801w2);
                            }
                            m1801w2.m2328a(pointF.f227a, pointF.f228b, mo6163i, mo4860t);
                            if (m1805s != null) {
                                C0741a c0741a = new C0741a();
                                c0741a.f4649d = mo6163i;
                                c0741a.f4652g = pointF.f227a;
                                c0741a.f4653h = pointF.f228b;
                                c0741a.f4659n = true;
                                c0741a.f4660o = m1805s;
                                c0741a.f4650e = m1087A.f6099bs;
                                c0741a.f4651f = mo4860t;
                                c0741a.f4655j = m1087A.f6099bs;
                                c0741a.f4663r = this.f5160X;
                                c0741a.f4664s = 1.0f + (0.15f * i);
                                if (m1805s.m2905av() >= 29) {
                                    c0741a.f4662q = true;
                                }
                            }
                            i++;
                        }
                    }
                    this.f5203aO = 5.0f;
                    if (Core.m1009av()) {
                        this.f5203aO = 1.0f;
                    }
                    this.f5172aj = false;
                    if (!z9) {
                        if (i > 0) {
                            boolean z16 = true;
                            if (abstractC0623y != null && !m1810p(abstractC0623y)) {
                                z16 = false;
                            }
                            this.f5159W = null;
                            this.f5161Y = false;
                            this.f5165ac = false;
                            this.f5157U = null;
                            if (z16) {
                                m1800x();
                            }
                            this.f5160X++;
                        }
                    } else if (!z10) {
                        float f15 = abstractC0623y.f6958el;
                        float f16 = abstractC0623y.f6959em;
                        boolean z17 = false;
                        if (C0758f.m2137c(f15 - this.f5166ad) < (abstractC0623y.m4705cc().m5872b() * m1087A.f6110bL.f785n * 2.0f) + (3 * m1087A.f6110bL.f785n) && C0758f.m2137c(f16 - this.f5167ae) < (abstractC0623y.m4705cc().m5868c() * m1087A.f6110bL.f786o * 2.0f) + (3 * m1087A.f6110bL.f786o)) {
                            this.f5168af = f15 - this.f5166ad;
                            this.f5169ag = f16 - this.f5167ae;
                            if (C0758f.m2137c(this.f5168af) > C0758f.m2137c(this.f5169ag)) {
                                this.f5169ag = 0.0f;
                            } else {
                                this.f5168af = 0.0f;
                            }
                        }
                        if (abstractC0623y.m4705cc().m5868c() > abstractC0623y.m4705cc().m5872b() + 1) {
                            this.f5169ag = 0.0f;
                        }
                        this.f5166ad = f15;
                        this.f5167ae = f16;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        if (this.f5169ag < 0.0f) {
                            f17 = -1.0f;
                        }
                        if (this.f5168af < 0.0f) {
                            f18 = -1.0f;
                        }
                        if (this.f5169ag > 0.0f) {
                            f17 = 1.0f;
                        }
                        if (this.f5168af > 0.0f) {
                            f18 = 1.0f;
                        }
                        if (f18 == 0.0f && f17 == 0.0f) {
                            f18 = 1.0f;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        float f19 = f15 + (200.0f * f18);
                        float f20 = f16 + (200.0f * f17);
                        float f21 = (-abstractC0623y.m4710cX()) + 1.0f;
                        float f22 = (-abstractC0623y.m4709cY()) + 1.0f;
                        m1878a(abstractC0623y, f15 + f21, f16 + f22, f19 + f21, f20 + f22, false, arrayList2, (AbstractC0244am) null);
                        if (arrayList2.size() > 0) {
                            abstractC0623y.f6958el = ((PointF) arrayList2.get(0)).f227a;
                            abstractC0623y.f6959em = ((PointF) arrayList2.get(0)).f228b;
                            z17 = true;
                        }
                        if (!z17) {
                            m1878a(abstractC0623y, f15 + f21, f16 + f22, f15 + (200.0f * (-f18)) + f21, f16 + (200.0f * (-f17)) + f22, false, arrayList2, (AbstractC0244am) null);
                            if (arrayList2.size() > 0) {
                                abstractC0623y.f6958el = ((PointF) arrayList2.get(0)).f227a;
                                abstractC0623y.f6959em = ((PointF) arrayList2.get(0)).f228b;
                                z17 = true;
                            }
                        }
                        if (!z17) {
                            abstractC0623y.f6958el += 3 * m1087A.f6110bL.f785n;
                            abstractC0623y.f6959em += m1087A.f6110bL.f785n;
                        }
                        if (z17) {
                            float f23 = abstractC0623y.f6958el - f15;
                            float f24 = abstractC0623y.f6959em - f16;
                            float f25 = m1087A.f6146cx;
                            float f26 = m1087A.f6147cy;
                            m1087A.f6139cq += f23;
                            m1087A.f6140cr += f24;
                            m1087A.f6146cx += m1087A.f6139cq;
                            m1087A.f6147cy += m1087A.f6140cr;
                            float f27 = m1087A.f6146cx;
                            float f28 = m1087A.f6147cy;
                            m1087A.m1072P();
                            m1087A.f6139cq += m1087A.f6146cx - f27;
                            m1087A.f6140cr += m1087A.f6147cy - f28;
                            float f29 = (f25 + f23) - m1087A.f6146cx;
                            float f30 = (f26 + f24) - m1087A.f6147cy;
                            if (C0758f.m2137c(f29) > 1.0f) {
                                this.f5163aa += f29 * m1087A.f6256cW;
                            }
                            if (C0758f.m2137c(f30) > 1.0f) {
                                this.f5164ab += f30 * m1087A.f6256cW;
                            }
                            m1087A.f6146cx -= m1087A.f6139cq;
                            m1087A.f6147cy -= m1087A.f6140cr;
                        }
                    }
                }
            }
            if (z8) {
                m1821k();
                if (this.f5165ac) {
                    m1800x();
                }
            }
        }
    }

    /* renamed from: l */
    public boolean m1819l() {
        Core m1087A = Core.m1087A();
        if (Core.m1009av() && m1087A.settingEngine.mouseSupport && !m1817m() && !m1813o()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m1817m() {
        Core m1087A = Core.m1087A();
        if (Core.m1009av() && m1087A.settingEngine.mouseSupport && this.f5151O && !this.f5150N && !this.f5208aT) {
            int i = 1;
            int i2 = 2;
            if (m1087A.settingEngine.mousePlacement == 2) {
                i = 2;
                i2 = 1;
            }
            if (m1087A.m980e(i)) {
            }
            if (m1087A.m980e(i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1815n() {
        Core m1087A = Core.m1087A();
        if (Core.m1010au() && m1087A.settingEngine.mouseSupport) {
            if (this.f5151O || this.f5140D) {
                int i = 1;
                int i2 = 2;
                if (m1087A.settingEngine.mousePlacement == 2) {
                    i = 2;
                    i2 = 1;
                }
                if (m1087A.m980e(i)) {
                    return true;
                }
                if (m1087A.m980e(i2)) {
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1813o() {
        if (this.f5151O && !this.f5150N && !this.f5208aT) {
            return m1815n();
        }
        return false;
    }

    /* renamed from: a */
    public void m1882a(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        if (abstractC0244am != null && this.f5153Q == abstractC0244am && this.f5154R < 40.0f && !m1851b(m1087A)) {
            if (!m1870a(m1087A)) {
                m1800x();
            }
            m1826h(abstractC0244am);
        } else if (abstractC0244am != null) {
            if (!m1870a(m1087A) && !m1851b(m1087A)) {
                m1800x();
            }
            m1881a(abstractC0244am, m1851b(m1087A));
            this.f5153Q = abstractC0244am;
            this.f5154R = 0.0f;
        }
    }

    /* renamed from: a */
    public boolean m1880a(AbstractC0244am abstractC0244am, boolean z, float f, float f2, Point point) {
        Core.m1087A();
        AbstractC0197n m1809q = m1809q();
        boolean m5054c = m1809q.m5054c(abstractC0244am.f1609bV);
        if (m5054c && m1921A() && m1808q(abstractC0244am)) {
            m1843c(abstractC0244am);
            return true;
        }
        if (m1809q.m5042d(abstractC0244am.f1609bV) && ((abstractC0244am.f1632cs < abstractC0244am.f1633ct || abstractC0244am.f1624ck < 1.0f) && m1811p() != 0)) {
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            if (abstractC0244am.m4691cq() && m1814n(abstractC0244am)) {
                z3 = true;
            }
            Iterator it = this.f5258bL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                if (abstractC1120w instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                    if (!abstractC0623y.f1644cE) {
                        continue;
                    } else if (!m1816m(abstractC0623y)) {
                        z2 = false;
                        break;
                    } else if (!abstractC0623y.mo3172a(abstractC0244am)) {
                        z2 = false;
                        break;
                    } else {
                        if (abstractC0623y.m2935aS()) {
                            z5 = true;
                        }
                        C0305au m2909ar = abstractC0623y.m2909ar();
                        if (m2909ar != null && m2909ar.m4444d() == EnumC0306av.f1814d) {
                            z4 = true;
                        }
                    }
                }
            }
            if (z2 && (!z4 || !z3)) {
                if (z5) {
                    m1837d(abstractC0244am);
                    return true;
                }
                m1837d(abstractC0244am);
                return true;
            }
        }
        if (abstractC0244am.mo3352g() > 0.0f && m1811p() != 0) {
            boolean z6 = true;
            Iterator it2 = AbstractC1120w.f6962eo.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                if (abstractC1120w2 instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w2;
                    if (!abstractC0623y2.f1644cE) {
                        continue;
                    } else if (!m1816m(abstractC0623y2)) {
                        z6 = false;
                        break;
                    } else if (!abstractC0623y2.m4652h(abstractC0244am, true)) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6) {
                m1852b(abstractC0244am);
                return true;
            }
        }
        if (abstractC0244am.m4691cq() && m1814n(abstractC0244am)) {
            m1830f(abstractC0244am);
            return true;
        } else if (Core.m1010au() && m1920B() && m1812o(abstractC0244am)) {
            m1828g(abstractC0244am);
            return true;
        } else {
            boolean z7 = false;
            if ((!z || abstractC0244am.mo1757t()) && !m1809q.m5054c(abstractC0244am.f1609bV)) {
                if (abstractC0244am.m4758bI()) {
                    if (abstractC0244am.m4706cb().m5876a()) {
                        z7 = true;
                    }
                } else if (!abstractC0244am.f1606bS) {
                    z7 = true;
                }
                if (!z7 && !abstractC0244am.mo3038i() && m1919C()) {
                    z7 = true;
                }
            }
            if (!z7 && m5054c && m1921A()) {
                m1908a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en);
                return true;
            }
            return false;
        }
    }

    /* renamed from: p */
    public int m1811p() {
        return this.f5206aR;
    }

    /* renamed from: a */
    void m1876a(C0749e c0749e) {
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y.f1644cE && m1816m(abstractC0623y)) {
                    c0749e.m2319a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: q */
    public AbstractC0197n m1809q() {
        Core m1087A = Core.m1087A();
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1609bV == m1087A.f6099bs) {
                    return abstractC0623y.f1609bV;
                }
            }
        }
        Iterator it2 = this.f5258bL.iterator();
        while (it2.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it2.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am2;
                if (m1816m(abstractC0623y2)) {
                    return abstractC0623y2.f1609bV;
                }
            }
        }
        return m1087A.f6099bs;
    }

    /* renamed from: r */
    public AbstractC0623y m1807r() {
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                return (AbstractC0623y) abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: s */
    public AbstractC0623y m1805s() {
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (m1816m(abstractC0623y)) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1874a(C0749e c0749e, AbstractC0224s abstractC0224s, boolean z) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            c0749e.m2319a(((C0212g) abstractC0224s).f1433b);
            return;
        }
        C0208c m4910N = abstractC0224s.m4910N();
        AbstractC0623y abstractC0623y = null;
        int i = -99;
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y2.f1644cE && m1816m(abstractC0623y2) && (a = abstractC0623y2.m4788a(m4910N)) != null && a.mo3084b(abstractC0623y2) && (a.mo3086a((AbstractC0244am) abstractC0623y2, true) || z)) {
                    int i2 = 0;
                    if (abstractC0623y2 instanceof InterfaceC0501l) {
                        i2 = ((InterfaceC0501l) abstractC0623y2).mo3438a(m4910N, true);
                        if (abstractC0623y != null) {
                            if (!z) {
                                if (i2 >= i) {
                                    break;
                                }
                            } else if (i2 <= i) {
                                break;
                            }
                        }
                    }
                    abstractC0623y = abstractC0623y2;
                    i = i2;
                }
            }
        }
        if (abstractC0623y != null) {
            c0749e.m2319a(abstractC0623y);
        }
    }

    /* renamed from: a */
    boolean m1889a(AbstractC0224s abstractC0224s, float f, float f2) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            AbstractC0623y abstractC0623y = c0212g.f1433b;
            AbstractC0224s m4961m_ = c0212g.m4961m_();
            boolean z = false;
            if (m4961m_.mo3084b(abstractC0623y) && m4961m_.mo3086a((AbstractC0244am) abstractC0623y, true) && !abstractC0623y.m2982a(m4961m_, f, f2)) {
                z = true;
            }
            return z;
        }
        boolean z2 = false;
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y2.f1644cE && m1816m(abstractC0623y2) && (a = abstractC0623y2.m4788a(abstractC0224s.m4910N())) != null && a.mo3084b(abstractC0623y2) && a.mo3086a((AbstractC0244am) abstractC0623y2, true)) {
                    if (!abstractC0623y2.m2982a(a, f, f2)) {
                        z2 = true;
                    } else {
                        return false;
                    }
                }
            }
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1875a(C0749e c0749e, AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            c0749e.m2319a(((C0212g) abstractC0224s).f1433b);
            return;
        }
        C0208c m4910N = abstractC0224s.m4910N();
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y.f1644cE && m1816m(abstractC0623y) && (a = abstractC0623y.m4788a(m4910N)) != null && a.mo3084b(abstractC0623y)) {
                    c0749e.m2319a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m1887a(AbstractC0224s abstractC0224s, boolean z) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.mo3086a((AbstractC0244am) c0212g.f1433b, true);
        }
        C0208c m4910N = abstractC0224s.m4910N();
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1816m(abstractC0623y) && (a = abstractC0623y.m4788a(m4910N)) != null && a.mo3086a(abstractC0623y, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1890a(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        C0208c m4910N = abstractC0224s.m4910N();
        if (abstractC0224s.mo4943l_()) {
            return false;
        }
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.mo4955a((AbstractC0244am) c0212g.f1433b);
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1816m(abstractC0623y) && (a = abstractC0623y.m4788a(m4910N)) != null && a.mo4955a((AbstractC0244am) abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m1854b(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.mo3084b(c0212g.f1433b);
        }
        C0208c m4910N = abstractC0224s.m4910N();
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1816m(abstractC0623y) && (a = abstractC0623y.m4788a(m4910N)) != null && a.mo3084b(abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m1844c(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        boolean z = false;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.mo4864g(c0212g.f1433b);
        }
        C0208c m4910N = abstractC0224s.m4910N();
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1816m(abstractC0623y) && (a = abstractC0623y.m4788a(m4910N)) != null) {
                    if (!a.mo4864g(abstractC0623y)) {
                        return false;
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public String m1838d(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        String m4884j;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.m4965j(c0212g.f1433b);
        }
        C0208c m4910N = abstractC0224s.m4910N();
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1816m(abstractC0623y) && (a = abstractC0623y.m4788a(m4910N)) != null && a.mo4864g(abstractC0623y) && (m4884j = a.m4884j(abstractC0623y)) != null) {
                    return m4884j;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public C1112u m1834e(AbstractC0224s abstractC0224s) {
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            this.f5257bK.clear();
            if (c0212g.f1433b != null) {
                this.f5257bK.mo494a(c0212g.f1433b);
            }
            return this.f5257bK;
        }
        return this.f5258bL;
    }

    /* renamed from: f */
    public String m1831f(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        C1112u m1834e = m1834e(abstractC0224s);
        C0208c m4910N = abstractC0224s.m4910N();
        String str = null;
        boolean z = false;
        Iterator it = m1834e.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (m1816m(abstractC0623y) && (a = abstractC0623y.m4788a(m4910N)) != null) {
                    if (a.mo4866B() != null && !a.mo4866B().mo4075b(abstractC0623y)) {
                        String m4121a = a.mo4866B().m4121a((AbstractC0244am) abstractC0623y, 4, false);
                        if (m4121a != null) {
                            str = m4121a;
                        }
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return null;
        }
        return str;
    }

    /* renamed from: t */
    public boolean m1804t() {
        if (this.f5206aR == 0) {
            return false;
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (!abstractC0623y.f1644cE) {
                    continue;
                } else if (!m1816m(abstractC0623y)) {
                    return false;
                } else {
                    ArrayList N = abstractC0623y.mo3174N();
                    boolean z = false;
                    if (N != null) {
                        Iterator it2 = N.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0224s) it2.next()).mo3081e() == EnumC0226u.f1478d) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m1884a(EnumC0238ag enumC0238ag) {
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (m1816m(abstractC0623y) && m1883a(enumC0238ag, abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1883a(EnumC0238ag enumC0238ag, AbstractC0244am abstractC0244am) {
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
            if ((enumC0238ag == EnumC0238ag.f1530a || enumC0238ag == EnumC0238ag.f1531b) && !Core.m1055a(this.f5253bG, 1000L)) {
                return true;
            }
            if (enumC0238ag == EnumC0238ag.f1532c) {
                if (Core.m1087A().f6239bx < 10) {
                    return false;
                }
                if (!Core.m1055a(this.f5254bH, 1000L)) {
                    return true;
                }
            }
            if (abstractC0623y.m2979a(enumC0238ag)) {
                if (enumC0238ag == EnumC0238ag.f1530a || enumC0238ag == EnumC0238ag.f1531b) {
                    this.f5253bG = Core.m1067U();
                }
                if (enumC0238ag == EnumC0238ag.f1532c) {
                    this.f5254bH = Core.m1067U();
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void m1856b(float f, float f2, Point point) {
        Core m1087A = Core.m1087A();
        if (!m1920B()) {
            if (m1087A.settingEngine.quickRally && m1804t()) {
                m1858b(f, f2);
                return;
            }
            return;
        }
        C0749e m1801w = m1801w();
        m1801w.f4845h = true;
        m1801w.m2329a(f, f2);
        m1876a(m1801w);
        if (!m1884a(EnumC0238ag.f1531b)) {
            m1087A.f6111bM.m2770b(C0631e.f4040f, 0.2f);
        }
        C0745e m2382a = m1087A.f6116bR.m2382a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4786aq = 8;
            m2382a.f4766W = 30.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 2.0f;
            m2382a.f4751H = 2.8f * m1847c();
            m2382a.f4750G = 1.6f * m1847c();
            m2382a.f4752I = true;
        }
        if (point != null) {
            Point m1775b = m1087A.f6121bW.m1775b(point.f224a, point.f225b);
            C0745e m2382a2 = m1087A.f6116bR.m2382a(m1775b.f224a, m1775b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2382a2 != null) {
                m2382a2.f4732o = true;
                m2382a2.f4786aq = 8;
                m2382a2.f4766W = 35.0f;
                m2382a2.f4767X = m2382a.f4766W;
                m2382a2.f4736s = true;
                m2382a2.f4749F = 2.0f;
                m2382a2.f4751H = 1.3f;
                m2382a2.f4750G = 0.6f;
            }
        }
    }

    /* renamed from: c */
    public void m1845c(float f, float f2, Point point) {
        Core m1087A = Core.m1087A();
        if (this.f5135y && m1087A.settingEngine.doubleClickToAttackMove && m1921A() && m1920B()) {
            m1839d(f, f2, point);
        } else {
            m1856b(f, f2, point);
        }
    }

    /* renamed from: d */
    public void m1839d(float f, float f2, Point point) {
        Core m1087A = Core.m1087A();
        C0749e m1801w = m1801w();
        m1801w.f4845h = true;
        m1801w.m2314b(f, f2);
        m1876a(m1801w);
        if (!m1884a(EnumC0238ag.f1531b)) {
            m1087A.f6111bM.m2770b(C0631e.f4040f, 0.2f);
        }
        C0745e m2382a = m1087A.f6116bR.m2382a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4787ar = 17;
            m2382a.f4786aq = 2;
            m2382a.f4766W = 30.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 2.0f;
            m2382a.f4770aa = 1.0f;
            m2382a.f4751H = 1.9f * m1847c();
            m2382a.f4750G = 3.5f * m1847c();
            m2382a.f4752I = true;
        }
        if (point != null) {
            Point m1775b = m1087A.f6121bW.m1775b(point.f224a, point.f225b);
            C0745e m2382a2 = m1087A.f6116bR.m2382a(m1775b.f224a, m1775b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2382a2 != null) {
                m2382a2.f4732o = true;
                m2382a2.f4786aq = 9;
                m2382a2.f4766W = 35.0f;
                m2382a2.f4767X = m2382a.f4766W;
                m2382a2.f4736s = true;
                m2382a2.f4749F = 2.0f;
                m2382a2.f4751H = 1.3f;
                m2382a2.f4750G = 0.6f;
            }
        }
    }

    /* renamed from: u */
    public void m1803u() {
        Core m1087A = Core.m1087A();
        C0749e m1801w = m1801w();
        m1801w.m2302h();
        m1876a(m1801w);
        m1087A.f6111bM.m2770b(C0631e.f4040f, 0.2f);
    }

    /* renamed from: a */
    public void m1888a(AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, C0749e c0749e) {
        if (abstractC0224s instanceof C0342g) {
            C0342g c0342g = (C0342g) abstractC0224s;
            Core.m1087A();
        }
    }

    /* renamed from: b */
    public void m1853b(AbstractC0224s abstractC0224s, float f, float f2) {
        Core m1087A = Core.m1087A();
        PointF pointF = new PointF(f, f2);
        C0749e m1801w = m1801w();
        if (!abstractC0224s.m4913I()) {
            m1875a(m1801w, abstractC0224s);
        } else {
            m1874a(m1801w, abstractC0224s, false);
        }
        m1801w.m2323a(abstractC0224s.m4910N(), pointF, (AbstractC0244am) null);
        m1888a(abstractC0224s, pointF, (AbstractC0244am) null, m1801w);
        if (!abstractC0224s.mo3087a(f, f2)) {
            m1087A.f6111bM.m2770b(C0631e.f4040f, 0.2f);
            C0745e m2382a = m1087A.f6116bR.m2382a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2382a != null) {
                m2382a.f4786aq = 9;
                m2382a.f4766W = 60.0f;
                m2382a.f4767X = m2382a.f4766W;
                m2382a.f4736s = true;
                m2382a.f4749F = 2.0f;
                m2382a.f4751H = 3.8f * m1847c();
                m2382a.f4750G = 2.0f * m1847c();
                m2382a.f4752I = true;
                m2382a.f4770aa = 1.5f;
            }
        }
    }

    /* renamed from: b */
    public void m1852b(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        C0749e m1801w = m1801w();
        m1876a(m1801w);
        m1801w.m2308d(abstractC0244am);
        m1087A.f6111bM.m2770b(C0631e.f4040f, 0.2f);
        C0745e m2382a = m1087A.f6116bR.m2382a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4786aq = 12;
            m2382a.f4766W = 25.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 2.0f;
            m2382a.f4752I = true;
            m2382a.f4751H = 1.2f * m1847c();
            m2382a.f4750G = 1.8f * m1847c();
        }
    }

    /* renamed from: b */
    public void m1858b(float f, float f2) {
        Core m1087A = Core.m1087A();
        C0749e m1802v = m1802v();
        m1876a(m1802v);
        m1802v.m2326a(new PointF(f, f2));
        m1087A.f6111bM.m2770b(C0631e.f4040f, 0.2f);
        C0745e m2382a = m1087A.f6116bR.m2382a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4786aq = 8;
            m2382a.f4766W = 65.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 2.0f;
            m2382a.f4752I = true;
            m2382a.f4770aa = 2.0f;
            m2382a.f4751H = 2.0f * m1847c();
            m2382a.f4750G = 1.5f * m1847c();
        }
    }

    /* renamed from: a */
    public void m1904a(float f, float f2, Point point, C0215j c0215j) {
        Core m1087A = Core.m1087A();
        if (!m1087A.settingEngine.showMapPingsOnBattlefield && !m1087A.settingEngine.showMapPingsOnMinimap) {
            m1850b("Cannot send map ping, you have disabled both battlefield and minimap pings in your settings");
            return;
        }
        m1801w().m2323a(c0215j.m4910N(), new PointF(f, f2), (AbstractC0244am) null);
        if (this.f5255bI == 0 || this.f5255bI + 15000 < System.currentTimeMillis()) {
            this.f5255bI = System.currentTimeMillis();
            m1087A.f6122bX.m1475l("MAP PING - [i:" + c0215j.m4941K() + "]");
        }
    }

    /* renamed from: a */
    public void m1902a(float f, float f2, AbstractC0197n abstractC0197n, C0215j c0215j) {
        C0745e m2382a;
        Core m1087A = Core.m1087A();
        int ordinal = 7 + c0215j.f1443a.ordinal();
        if (!m1087A.settingEngine.showMapPingsOnBattlefield && !m1087A.settingEngine.showMapPingsOnMinimap) {
            if (!this.f5256bJ && !m1087A.f6126cb.m2464h()) {
                this.f5256bJ = true;
                this.f5115e.m1794a(null, "[WARNING: A player send a map ping, but you have disabled both battlefield and minimap pings in your settings]");
                return;
            }
            return;
        }
        if (m1087A.settingEngine.showMapPingsOnBattlefield) {
            C0745e m2382a2 = m1087A.f6116bR.m2382a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2382a2 != null) {
                m2382a2.f4787ar = 9;
                m2382a2.f4786aq = 6;
                m2382a2.f4749F = 0.7f;
                m2382a2.f4766W = 490.0f;
                m2382a2.f4767X = m2382a2.f4766W;
                m2382a2.f4736s = true;
                m2382a2.f4763T = 6.0f;
                m2382a2.f4764U = 60.0f;
                m2382a2.f4754K -= m2382a2.f4763T;
                m2382a2.f4751H = 2.0f * 1.0f;
                m2382a2.f4750G = m2382a2.f4751H;
                m2382a2.f4785ap = -0.5f;
                m2382a2.f4752I = true;
                if (abstractC0197n != null) {
                    m2382a2.f4742y = abstractC0197n.m5112H();
                    if (Core.m1012as()) {
                        m2382a2.f4746C = new LightingColorFilter(m2382a2.f4742y, 0);
                    }
                }
            }
            if (ordinal != -1 && (m2382a = m1087A.f6116bR.m2382a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e)) != null) {
                m2382a.f4787ar = 9;
                m2382a.f4786aq = ordinal;
                m2382a.f4766W = 490.0f;
                m2382a.f4767X = m2382a.f4766W;
                m2382a.f4736s = true;
                m2382a.f4749F = 1.2f;
                m2382a.f4763T = 6.0f;
                m2382a.f4764U = 60.0f;
                m2382a.f4754K -= m2382a.f4763T;
                m2382a.f4751H = 2.0f * 1.0f;
                m2382a.f4750G = m2382a.f4751H;
                m2382a.f4785ap = -0.7f;
                m2382a.f4752I = true;
            }
        }
        if (m1087A.settingEngine.showMapPingsOnMinimap) {
            Point m1775b = m1087A.f6121bW.m1775b(f, f2);
            C0745e m2382a3 = m1087A.f6116bR.m2382a(m1775b.f224a, m1775b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2382a3 != null) {
                m2382a3.f4732o = true;
                m2382a3.f4787ar = 9;
                m2382a3.f4786aq = 6;
                m2382a3.f4749F = 0.8f;
                m2382a3.f4766W = 470.0f;
                m2382a3.f4767X = m2382a3.f4766W;
                m2382a3.f4736s = true;
                m2382a3.f4754K -= 2.0f;
                m2382a3.f4763T = 2.0f;
                m2382a3.f4764U = 60.0f;
                m2382a3.f4785ap = -0.5f;
                if (abstractC0197n != null) {
                    m2382a3.f4742y = abstractC0197n.m5112H();
                    if (Core.m1012as()) {
                        m2382a3.f4746C = new LightingColorFilter(m2382a3.f4742y, 0);
                    }
                }
                m2382a3.f4751H = 1.0f;
                m2382a3.f4750G = 1.0f;
            }
            C0745e m2382a4 = m1087A.f6116bR.m2382a(m1775b.f224a, m1775b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2382a4 != null) {
                m2382a4.f4732o = true;
                m2382a4.f4787ar = 9;
                m2382a4.f4786aq = ordinal;
                m2382a4.f4766W = 470.0f;
                m2382a4.f4767X = m2382a4.f4766W;
                m2382a4.f4736s = true;
                m2382a4.f4749F = 0.8f;
                m2382a4.f4754K -= 2.0f;
                m2382a4.f4763T = 2.0f;
                m2382a4.f4764U = 60.0f;
                if (abstractC0197n != null) {
                }
                m2382a4.f4751H = 1.0f;
                m2382a4.f4750G = 1.0f;
                m2382a4.f4785ap = -0.7f;
            }
        }
    }

    /* renamed from: v */
    public C0749e m1802v() {
        Core m1087A = Core.m1087A();
        C0749e m2419b = m1087A.f6130cf.m2419b(m1087A.f6099bs);
        if (m1087A.f6122bX.lock1) {
            m2419b.f4854p = m1087A.f6099bs;
        }
        return m2419b;
    }

    /* renamed from: w */
    public C0749e m1801w() {
        Core m1087A = Core.m1087A();
        C0749e m1802v = m1802v();
        if (m1870a(m1087A)) {
            m1802v.f4842e = true;
        }
        return m1802v;
    }

    /* renamed from: c */
    public void m1843c(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        C0749e m1801w = m1801w();
        m1801w.m2321a(abstractC0244am);
        m1876a(m1801w);
        if (!m1884a(EnumC0238ag.f1530a)) {
            m1087A.f6111bM.m2770b(C0631e.f4038d, 1.0f);
        }
        C0745e m2382a = m1087A.f6116bR.m2382a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4719b = abstractC0244am;
            m2382a.f4753J = 0.0f;
            m2382a.f4754K = 0.0f;
            m2382a.f4755L = 0.0f;
            m2382a.f4786aq = 9;
            m2382a.f4766W = 35.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 1.5f;
            m2382a.f4752I = true;
            m2382a.f4770aa = 0.8f;
            m2382a.f4751H = 1.9f * m1847c();
            m2382a.f4750G = 3.3f * m1847c();
        }
        C0745e m2382a2 = m1087A.f6116bR.m2382a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a2 != null) {
            m2382a2.f4719b = abstractC0244am;
            m2382a2.f4753J = 0.0f;
            m2382a2.f4754K = 0.0f;
            m2382a2.f4755L = 0.0f;
            m2382a2.f4787ar = 17;
            m2382a2.f4786aq = 0;
            m2382a2.f4766W = 25.0f;
            m2382a2.f4767X = m2382a2.f4766W;
            m2382a2.f4736s = true;
            m2382a2.f4749F = 1.0f;
            m2382a2.f4752I = true;
            m2382a2.f4770aa = 0.8f;
            m2382a2.f4751H = 2.2f * m1847c();
            m2382a2.f4750G = 1.1f * m1847c();
        }
    }

    /* renamed from: d */
    public void m1837d(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        C0749e m1801w = m1801w();
        m1876a(m1801w);
        m1801w.m2313b(abstractC0244am);
        m1087A.f6111bM.m2770b(C0631e.f4038d, 1.0f);
        C0745e m2382a = m1087A.f6116bR.m2382a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4786aq = 10;
            m2382a.f4766W = 35.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 2.0f;
            m2382a.f4752I = true;
            m2382a.f4751H = 1.5f * m1847c();
            m2382a.f4750G = 2.2f * m1847c();
        }
    }

    /* renamed from: e */
    public void m1833e(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        C0749e m1801w = m1801w();
        m1876a(m1801w);
        m1801w.m2310c(abstractC0244am);
        m1087A.f6111bM.m2770b(C0631e.f4038d, 1.0f);
        C0745e m2382a = m1087A.f6116bR.m2382a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4787ar = 17;
            m2382a.f4786aq = 1;
            m2382a.f4766W = 40.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 1.0f;
            m2382a.f4752I = true;
            m2382a.f4770aa = 0.0f;
            m2382a.f4751H = 1.2f * m1847c();
            m2382a.f4750G = 1.9f * m1847c();
        }
    }

    /* renamed from: a */
    public void m1908a(float f, float f2, float f3) {
        Core m1087A = Core.m1087A();
        m1087A.f6111bM.m2770b(C0631e.f4046l, 0.2f);
        C0745e m2382a = m1087A.f6116bR.m2382a(f, f2, f3, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4787ar = 9;
            m2382a.f4786aq = 14;
            m2382a.f4766W = 10.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 2.0f;
            m2382a.f4770aa = 0.0f;
            m2382a.f4751H = 1.1f * m1847c();
            m2382a.f4750G = 1.6f * m1847c();
            m2382a.f4752I = true;
        }
    }

    /* renamed from: a */
    public void m1903a(float f, float f2, Point point, boolean z) {
        Core m1087A = Core.m1087A();
        C0749e m1801w = m1801w();
        m1876a(m1801w);
        m1801w.m2311c(f, f2);
        if (!z) {
            m1801w.f4842e = true;
        }
        m1087A.f6111bM.m2770b(C0631e.f4040f, 0.2f);
        C0745e m2382a = m1087A.f6116bR.m2382a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4787ar = 17;
            m2382a.f4786aq = 0;
            m2382a.f4766W = 40.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 2.0f;
            m2382a.f4770aa = 8.0f;
            m2382a.f4751H = 1.1f * m1847c();
            m2382a.f4750G = 1.9f * m1847c();
            m2382a.f4752I = true;
        }
        if (point != null) {
            Point m1775b = m1087A.f6121bW.m1775b(point.f224a, point.f225b);
            C0745e m2382a2 = m1087A.f6116bR.m2382a(m1775b.f224a, m1775b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2382a2 != null) {
                m2382a2.f4732o = true;
                m2382a2.f4786aq = 9;
                m2382a2.f4766W = 35.0f;
                m2382a2.f4767X = m2382a.f4766W;
                m2382a2.f4736s = true;
                m2382a2.f4749F = 2.0f;
                m2382a2.f4751H = 1.3f;
                m2382a2.f4750G = 0.6f;
            }
        }
    }

    /* renamed from: f */
    public void m1830f(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        C0749e m1801w = m1801w();
        m1876a(m1801w);
        m1801w.m2306e(abstractC0244am);
        m1087A.f6111bM.m2770b(C0631e.f4038d, 1.0f);
        C0745e m2382a = m1087A.f6116bR.m2382a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4786aq = 11;
            m2382a.f4766W = 25.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 2.0f;
            m2382a.f4752I = true;
            m2382a.f4751H = 1.8f * m1847c();
            m2382a.f4750G = 1.6f * m1847c();
        }
    }

    /* renamed from: g */
    public void m1828g(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        C0749e m1801w = m1801w();
        m1876a(m1801w);
        m1801w.m2304f(abstractC0244am);
        m1087A.f6111bM.m2770b(C0631e.f4038d, 1.0f);
        C0745e m2382a = m1087A.f6116bR.m2382a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2382a != null) {
            m2382a.f4786aq = 11;
            m2382a.f4766W = 25.0f;
            m2382a.f4767X = m2382a.f4766W;
            m2382a.f4736s = true;
            m2382a.f4749F = 2.0f;
            m2382a.f4752I = true;
            m2382a.f4751H = 1.8f * m1847c();
            m2382a.f4750G = 1.6f * m1847c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.corrodinggames.rts.game.units.AbstractC0244am m1901a(float r7, float r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p037f.C0797f.m1901a(float, float, boolean):com.corrodinggames.rts.game.units.am");
    }

    /* renamed from: b */
    public void m1857b(float f, float f2, float f3) {
        Core m1087A = Core.m1087A();
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0244am) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) abstractC1120w;
                if (!abstractC0244am.f1607bT && abstractC0244am.f1651cL == null && abstractC0244am.f1609bV == m1087A.f6099bs && C0758f.m2209a(f, f2, abstractC0244am.f6958el, abstractC0244am.f6959em - abstractC0244am.f6960en) < f3 * f3) {
                    m1822j(abstractC0244am);
                }
            }
        }
    }

    /* renamed from: h */
    public void m1826h(AbstractC0244am abstractC0244am) {
        this.f5153Q = null;
        Core m1087A = Core.m1087A();
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0244am) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) abstractC1120w;
                if (!abstractC0244am2.f1607bT && abstractC0244am2.f1651cL == null && abstractC0244am2.f1609bV == abstractC0244am.f1609bV && abstractC0244am2.mo3348p_() && C0760a.m2062a(abstractC0244am2, abstractC0244am) && (abstractC0244am2.f1609bV == m1087A.f6099bs || abstractC0244am2.m4703ce())) {
                    m1822j(abstractC0244am2);
                }
            }
        }
    }

    /* renamed from: x */
    public void m1800x() {
        this.f5153Q = null;
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0244am) {
                ((AbstractC0244am) abstractC1120w).f1644cE = false;
            }
        }
        this.f5206aR = 0;
        this.f5155S++;
        this.f5258bL.clear();
        m1912J();
    }

    /* renamed from: i */
    public boolean m1824i(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo1757t()) {
            return false;
        }
        AbstractC0197n abstractC0197n = Core.m1087A().f6099bs;
        if (abstractC0197n != null && abstractC0197n.m5054c(abstractC0244am.f1609bV) && !abstractC0244am.m4702cf()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m1822j(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1644cE) {
            return true;
        }
        if (!m1824i(abstractC0244am)) {
            return false;
        }
        m1820k(abstractC0244am);
        m1883a(EnumC0238ag.f1532c, abstractC0244am);
        return true;
    }

    /* renamed from: k */
    public void m1820k(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1644cE || !m1824i(abstractC0244am)) {
            return;
        }
        abstractC0244am.f1644cE = true;
        abstractC0244am.f1645cF = Core.m1087A().f6104bA;
        this.f5206aR++;
        if (!(abstractC0244am instanceof C0555h)) {
            f5259bM = abstractC0244am;
        }
        this.f5155S++;
        this.f5258bL.mo494a(abstractC0244am);
        m1912J();
    }

    /* renamed from: y */
    public static C0824b m1799y() {
        InterfaceC0303as mo1758r;
        AbstractC0244am abstractC0244am = f5259bM;
        if (abstractC0244am == null || (mo1758r = abstractC0244am.mo1758r()) == null || !(mo1758r instanceof C0453l)) {
            return null;
        }
        return ((C0453l) mo1758r).f2919I;
    }

    /* renamed from: a */
    public void m1881a(AbstractC0244am abstractC0244am, boolean z) {
        if (!z) {
            m1822j(abstractC0244am);
        } else if (abstractC0244am.f1644cE) {
            m1818l(abstractC0244am);
        } else {
            m1822j(abstractC0244am);
        }
    }

    /* renamed from: l */
    public void m1818l(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1644cE) {
            abstractC0244am.f1644cE = false;
            this.f5206aR--;
            this.f5258bL.remove(abstractC0244am);
            this.f5155S++;
            m1912J();
        }
    }

    /* renamed from: z */
    public boolean m1798z() {
        if (m1811p() == 0) {
            return false;
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1816m(abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: A */
    public boolean m1921A() {
        if (m1811p() == 0) {
            return false;
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1816m(abstractC0623y) && abstractC0623y.mo3036l()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public boolean m1920B() {
        if (m1811p() == 0) {
            return false;
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && abstractC0623y.m2935aS() && m1816m(abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public boolean m1919C() {
        if (m1811p() == 0) {
            return true;
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && !abstractC0623y.mo3038i()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: m */
    public boolean m1816m(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        if (abstractC0244am.m4713cU()) {
            return false;
        }
        if (abstractC0244am.f1609bV == m1087A.f6099bs) {
            return true;
        }
        if ((abstractC0244am.f1609bV != null && abstractC0244am.f1609bV.m5070b(m1087A.f6099bs)) || m1087A.f6100bv || m1087A.f6126cb.m2464h()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1814n(AbstractC0244am abstractC0244am) {
        if (m1811p() == 0) {
            return false;
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE && abstractC0623y != abstractC0244am && m1816m(abstractC0623y) && abstractC0244am.m4680d(abstractC0623y, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1812o(AbstractC0244am abstractC0244am) {
        if (m1811p() == 0) {
            return false;
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE && abstractC0623y != abstractC0244am && m1816m(abstractC0623y) && abstractC0623y.m4680d(abstractC0244am, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public boolean m1810p(AbstractC0244am abstractC0244am) {
        if (m1811p() == 0) {
            return false;
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE && abstractC0623y != abstractC0244am && m1816m(abstractC0623y) && abstractC0623y.mo3172a(abstractC0244am)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public boolean m1808q(AbstractC0244am abstractC0244am) {
        if (m1811p() == 0) {
            return false;
        }
        Iterator it = this.f5258bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE && abstractC0623y != abstractC0244am && m1816m(abstractC0623y) && C0248aq.m4631a(abstractC0623y, abstractC0244am)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    public void m1918D() {
    }

    /* renamed from: E */
    public boolean m1917E() {
        return false;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        this.f5114d.mo2441a(streamWriter);
        streamWriter.m1401c(1);
        streamWriter.WriteInteger(this.f5160X);
    }

    /* renamed from: a */
    public void m1871a(Reader reader, boolean z) {
        this.f5114d.m2056a(reader, z);
        if (reader.m1304d() >= 1) {
            this.f5160X = reader.ReadInt();
        }
    }

    /* renamed from: a */
    public void m1878a(AbstractC0623y abstractC0623y, float f, float f2, float f3, float f4, boolean z, ArrayList arrayList, AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        float f5 = abstractC0623y.f6958el;
        float f6 = abstractC0623y.f6959em;
        AbstractC0623y abstractC0623y2 = null;
        AbstractC0244am m4679d = AbstractC0244am.m4679d(abstractC0623y.mo1758r());
        if (!(m4679d instanceof AbstractC0623y)) {
            Core.LogDebug2("buildingBlockoutUnit not OrderableUnit is: " + m4679d.getClass().getName());
        } else {
            abstractC0623y2 = (AbstractC0623y) m4679d;
        }
        boolean z2 = false;
        m1087A.f6110bL.m5309b(f, f2);
        float f7 = m1087A.f6110bL.f801T;
        float f8 = m1087A.f6110bL.f802U;
        float cX = f7 + abstractC0623y.m4710cX();
        float cY = f8 + abstractC0623y.m4709cY();
        float cX2 = f3 + abstractC0623y.m4710cX();
        float cY2 = f4 + abstractC0623y.m4709cY();
        float m2157b = C0758f.m2157b(cX, cY, cX2, cY2);
        float m2123d = C0758f.m2123d(cX, cY, cX2, cY2);
        int i = 0;
        float f9 = 0.0f;
        while (true) {
            float f10 = f9;
            if (f10 <= m2157b) {
                m1087A.f6110bL.m5309b((cX + (C0758f.m2092i(m2123d) * f10)) - abstractC0623y.m4710cX(), (cY + (C0758f.m2097h(m2123d) * f10)) - abstractC0623y.m4709cY());
                float f11 = m1087A.f6110bL.f801T;
                float f12 = m1087A.f6110bL.f802U;
                float cX3 = f11 + abstractC0623y.m4710cX();
                float cY3 = f12 + abstractC0623y.m4709cY();
                abstractC0623y.f6958el = cX3;
                abstractC0623y.f6959em = cY3;
                if ((!z2 || abstractC0623y2 == null || (!C0741a.m2403a(abstractC0623y, abstractC0623y2) && !abstractC0623y.m2796r(abstractC0623y2))) && 0 == 0) {
                    boolean m1877a = m1877a(abstractC0623y, cX3, cY3, z, false, abstractC0244am);
                    if (arrayList != null && m1877a) {
                        arrayList.add(new PointF(cX3, cY3));
                    }
                    if (m1877a) {
                        i++;
                        if (i >= 29) {
                            return;
                        }
                    }
                    z2 = true;
                    if (abstractC0623y2 != null) {
                        abstractC0623y2.f6958el = cX3;
                        abstractC0623y2.f6959em = cY3;
                    }
                }
                f9 = f10 + m1087A.f6110bL.f787p;
            } else {
                abstractC0623y.f6958el = f5;
                abstractC0623y.f6959em = f6;
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean m1877a(AbstractC0623y abstractC0623y, float f, float f2, boolean z, boolean z2, AbstractC0244am abstractC0244am) {
        boolean z3;
        Core m1087A = Core.m1087A();
        float f3 = abstractC0623y.f6958el;
        float f4 = abstractC0623y.f6959em;
        abstractC0623y.f6958el = f;
        abstractC0623y.f6959em = f2;
        boolean m2848c = abstractC0623y.m2848c(m1087A.f6099bs);
        if (C0741a.m2404a(m1087A.f6099bs, abstractC0623y, this.f5160X)) {
            m2848c = false;
        }
        if (abstractC0244am != null && abstractC0244am != null && (abstractC0244am instanceof AbstractC0623y)) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
            if (!abstractC0623y2.m2936aR()) {
                float m2209a = C0758f.m2209a(abstractC0623y2.f6958el, abstractC0623y2.f6959em, abstractC0623y.f6958el, abstractC0623y.f6959em);
                float f5 = abstractC0623y2.mo3167f(abstractC0623y.mo1758r());
                if (f5 > 800000.0f) {
                    z3 = true;
                } else {
                    z3 = m2209a <= f5 * f5;
                }
                if (!z3) {
                    m2848c = false;
                }
            }
        }
        boolean z4 = abstractC0623y.f1627cn;
        abstractC0623y.f1627cn = true;
        abstractC0623y.f1630cq = m2848c;
        abstractC0623y.f1631cr = !m2848c;
        abstractC0623y.f1629cp = z2;
        if (z) {
            m1087A.f6113bO.mo135k();
            m1087A.m1071Q();
            abstractC0623y.m2844d(0.0f);
            abstractC0623y.mo3049c(0.0f);
            abstractC0623y.mo3053a(0.0f, false);
            float mo3035m = abstractC0623y.mo3035m();
            if (mo3035m > 30.0f) {
                C1117y.m465a((AbstractC0244am) abstractC0623y, mo3035m, true, true);
            }
            abstractC0623y.m4707ca();
            if (!z2) {
                abstractC0623y.m3010N(-1);
            }
            m1087A.f6113bO.mo134l();
        }
        abstractC0623y.f6958el = f3;
        abstractC0623y.f6959em = f4;
        abstractC0623y.f1629cp = false;
        abstractC0623y.f1627cn = z4;
        return m2848c;
    }

    /* renamed from: F */
    public void m1916F() {
        Core m1087A = Core.m1087A();
        m1087A.f6267dp = true;
        if (m1087A.f6102by < 1500 && m1087A.f6117bS.f5113c != null) {
            m1087A.f6268dq = true;
        }
        this.f5114d.m2024q();
    }

    /* renamed from: G */
    public void m1915G() {
        Core.m1087A().f6270ds = true;
        this.f5114d.m2023r();
    }

    /* renamed from: H */
    public void m1914H() {
        m1821k();
        this.f5157U = null;
        this.f5159W = this.f5121k;
    }

    /* renamed from: a */
    public void m1864a(String str, Rect rect, Paint paint, Paint paint2) {
        String[] m2130c;
        Paint paint3;
        Core m1087A = Core.m1087A();
        int i = 0;
        for (String str2 : C0758f.m2130c(str, '\n')) {
            if (i == 0) {
                paint3 = paint;
            } else {
                paint3 = paint2;
            }
            Paint paint4 = paint3;
            int m1928a = C0795d.m1928a(paint4);
            m1087A.f6113bO.mo181a(str2, rect.m5867d(), rect.f231b + (m1928a / 2) + (i * m1928a), paint4);
            i++;
        }
    }

    /* renamed from: a */
    public boolean m1886a(AbstractC0224s abstractC0224s, boolean z, AbstractC0244am abstractC0244am, boolean z2, boolean z3) {
        return m1885a(abstractC0224s, z, abstractC0244am, z2, false, -1.0f, z3);
    }

    /* renamed from: a */
    public boolean m1885a(AbstractC0224s abstractC0224s, boolean z, AbstractC0244am abstractC0244am, boolean z2, boolean z3, float f, boolean z4) {
        int i;
        int m5948a;
        Paint paint;
        Paint paint2;
        int m5948a2;
        int m5948a3;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        String m1838d;
        Core m1087A = Core.m1087A();
        String str = null;
        boolean z5 = false;
        boolean z6 = true;
        if (Core.m1009av()) {
            z6 = false;
        }
        if (abstractC0244am != null && abstractC0224s.m4881l(abstractC0244am)) {
            z6 = false;
        }
        if (z4) {
            z6 = false;
        }
        boolean z7 = false;
        boolean z8 = false;
        if (C0760a.m2066a(abstractC0224s)) {
            z7 = true;
            z8 = true;
        }
        if (m1844c(abstractC0224s)) {
            z7 = true;
            str = this.f5234bt;
            String m1838d2 = m1838d(abstractC0224s);
            if (m1838d2 != null) {
                str = m1838d2;
            }
        }
        if (!z7 && z2 && (m1838d = m1838d(abstractC0224s)) != null) {
            str = m1838d;
        }
        if (str == null) {
            float m2051b = this.f5114d.m2051b(abstractC0224s);
            if (m2051b > 0.0f) {
                str = C0758f.m2102g(m2051b / 1000.0f);
            }
        }
        String m1831f = m1831f(abstractC0224s);
        boolean z9 = m1831f != null;
        if (m1831f != null) {
        }
        if (z2 && str == null && m1831f != null) {
            str = this.f5235bu.m4224b();
        }
        C0813u c0813u = new C0813u();
        c0813u.f5377d = this.f5199aK;
        c0813u.f5378e = this.f5200aL;
        C0930ag c0930ag = null;
        if (z9) {
            c0930ag = this.f5201aM;
        }
        c0813u.m1746a(true);
        abstractC0224s.mo4953a(abstractC0244am, c0813u, null, c0930ag);
        if (str != null) {
            c0813u.m1747a("\n" + str, this.f5201aM);
        }
        c0813u.m1746a(false);
        abstractC0224s.mo4954a(abstractC0244am, c0813u);
        if (z8) {
            c0813u.m1745b();
            c0813u.m1747a(this.f5233bs, this.f5200aL);
        }
        this.f5222bh.f230a = 20;
        int i2 = (int) ((m1087A.f6134ck - m1087A.f6138cp) - 20);
        this.f5222bh.f232c = i2;
        boolean z10 = m1087A.settingEngine.showActionInfoHoverNearMouse;
        if (z) {
            i = (int) (m1087A.f6137co - 40.0f);
        } else {
            i = 40;
        }
        if (Core.m1011at() && f > 0.0f) {
            i = (int) f;
            z5 = true;
        }
        if (Core.m1010au() && z10 && z3) {
            i = (int) (m1087A.m1025af() - 40.0f);
        }
        this.f5222bh.f231b = i;
        this.f5222bh.f233d = this.f5222bh.f231b;
        boolean z11 = true;
        boolean z12 = true;
        int i3 = 7;
        if (Core.m1010au()) {
            if (!z10) {
                z11 = false;
                z12 = false;
            } else if (!z3) {
                z12 = false;
                z11 = true;
                i3 = 20;
            }
        } else if (!z) {
            z12 = false;
        }
        if (!Core.m1010au() || z || !z10 || !z3) {
        }
        if (str != null) {
        }
        C0930ag c0930ag2 = this.f5200aL;
        if (z2) {
            C0930ag c0930ag3 = this.f5201aM;
        }
        C0818z m1754a = c0813u.m1754a(this.f5222bh.m5872b(), z11);
        float m5867d = this.f5222bh.m5867d();
        this.f5222bh.f230a = (int) (m5867d - (m1754a.f5394b.m5872b() / 2));
        this.f5222bh.f232c = (int) (m5867d + (m1754a.f5394b.m5872b() / 2));
        this.f5222bh.f233d = this.f5222bh.f231b + m1754a.f5394b.m5868c();
        if (z11) {
            this.f5222bh.f230a = (int) (rect3.f230a - (i3 * m1087A.f6132ci));
            this.f5222bh.f232c = (int) (rect4.f232c + (i3 * m1087A.f6132ci));
        }
        if (z12) {
            this.f5222bh.m5875a((int) ((i2 - (7.0f * m1087A.f6132ci)) - this.f5222bh.f232c), 0);
        }
        this.f5223bi.m5873a(this.f5222bh);
        this.f5223bi.f231b -= 20;
        this.f5223bi.f233d += 15;
        int i4 = -1;
        if (abstractC0244am != null) {
            i4 = abstractC0224s.mo3083b(abstractC0244am, true);
        }
        if (abstractC0244am != null && z6 && i4 != -1) {
            this.f5223bi.f233d = (int) (rect2.f233d + (55.0f * m1087A.f6132ci));
        }
        if (this.f5223bi.f233d > m1087A.f6135cl) {
            int i5 = (int) (m1087A.f6135cl - this.f5223bi.f233d);
            this.f5222bh.m5875a(0, i5);
            this.f5223bi.m5875a(0, i5);
        }
        InterfaceC0303as mo6163i = abstractC0224s.mo6163i();
        if (!abstractC0224s.mo4865D()) {
            mo6163i = null;
        }
        if (mo6163i != null && abstractC0244am != null) {
            this.f5223bi.f231b = (int) (rect.f231b - (40.0f * m1087A.f6132ci));
        }
        if (z5) {
            int i6 = -this.f5222bh.m5868c();
            this.f5222bh.m5875a(0, i6);
            this.f5223bi.m5875a(0, i6);
        }
        if (0 != 0) {
            int i7 = (int) ((m1087A.f6135cl - 30.0f) - this.f5223bi.f233d);
            this.f5223bi.m5875a(0, i7);
            this.f5222bh.m5875a(0, i7);
        }
        if (this.f5223bi.f231b < 0) {
            int i8 = 0 - this.f5223bi.f231b;
            this.f5223bi.m5875a(0, i8);
            this.f5222bh.m5875a(0, i8);
        }
        if (this.f5223bi.f233d > m1087A.f6135cl - 20.0f) {
            int i9 = (int) ((m1087A.f6135cl - 20.0f) - this.f5223bi.f233d);
            this.f5223bi.m5875a(0, i9);
            this.f5222bh.m5875a(0, i9);
        }
        m1087A.f6113bO.mo162b(this.f5223bi, this.f5198aJ);
        m1087A.f6113bO.mo162b(this.f5223bi, this.f5194aF);
        if (z7) {
        }
        if (mo6163i != null && abstractC0244am != null) {
            EnumC0249ar.m4626a(mo6163i, this.f5223bi.m5867d(), this.f5223bi.f231b + (22.0f * m1087A.f6132ci), this.f5156T, 0.0f, abstractC0244am.f1609bV, 30.0f * m1087A.f6132ci, 100.0f * m1087A.f6132ci, false, false, abstractC0224s.mo4860t(), null);
        }
        m1754a.m1738a(this.f5222bh.m5867d(), this.f5222bh.f231b);
        if (abstractC0244am != null && i4 != -1 && z6) {
            float f2 = m1087A.f6132ci * 0.5f;
            int i10 = (int) (60.0f * f2);
            float m1929b = C0794c.m1929b(abstractC0244am, abstractC0224s, true);
            if (!z7 || i4 > 0) {
                this.f5193aE.m5908b(-16777216);
                if (m1929b != 0.0f) {
                    float m2158b = C0758f.m2158b((C0758f.m2137c(m1929b) * 0.5f) - 0.4f, 0.0f, 1.0f);
                    if (m1929b > 0.0f) {
                        m5948a = Color.m5948a(110, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                    } else {
                        m5948a = Color.m5948a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30, 30);
                    }
                    C0758f.m2202a(m5948a, this.f5193aE.m5896e(), m2158b);
                }
                float m1923b = (this.f5223bi.f233d - ((65.0f * f2) / 2.0f)) + (C0795d.m1923b(this.f5193aE) / 2);
                if (m1929b > 0.5d) {
                    m1923b += 1.0f;
                }
                if (m1929b < -0.5d) {
                    m1923b -= 1.0f;
                }
                m1087A.f6113bO.mo181a(VariableScope.nullOrMissingString + i4, this.f5223bi.m5867d(), m1923b, this.f5193aE);
            }
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = !z7 && m1887a(abstractC0224s, true);
            boolean z16 = i4 > 0 && abstractC0224s.m4891d(abstractC0244am, true);
            int m5867d2 = (int) (this.f5223bi.m5867d() + (60.0f * f2));
            int i11 = (int) (this.f5223bi.f233d - (65.0f * f2));
            this.f5225bk.m5874a(m5867d2, i11, m5867d2 + i10, i11 + i10);
            if (z15) {
                paint = this.f5214aZ;
            } else {
                paint = this.f5215ba;
            }
            if (m1929b > 0.0f) {
                float m2158b2 = C0758f.m2158b((C0758f.m2137c(m1929b) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (m1929b > 0.0f) {
                    m5948a3 = Color.m5948a(110, 210, 210, 210);
                } else {
                    m5948a3 = Color.m5948a(110, 210, 110, 110);
                }
                int m2202a = C0758f.m2202a(m5948a3, paint.m5896e(), m2158b2);
                paint = this.f5227bm;
                paint.m5908b(m2202a);
            }
            if (m1929b > 0.5d) {
                this.f5225bk.m5875a(0, 1);
            }
            m1087A.f6113bO.mo197a(this.f5216bb, this.f5225bk.f230a, this.f5225bk.f231b, paint, 0.0f, f2);
            C0758f.m2195a(this.f5225bk, this.f5225bk.m5872b() * 0.8f);
            if (this.f5151O && !this.f5150N && !z8 && this.f5225bk.m5871b((int) this.f5129s, (int) this.f5130t)) {
                this.f5151O = false;
                z13 = true;
            }
            int m5867d3 = (int) ((this.f5223bi.m5867d() - i10) - (60.0f * f2));
            int i12 = (int) (this.f5223bi.f233d - (65.0f * f2));
            this.f5225bk.m5874a(m5867d3, i12, m5867d3 + i10, i12 + i10);
            if (z16) {
                paint2 = this.f5214aZ;
            } else {
                paint2 = this.f5215ba;
            }
            if (m1929b < 0.0f) {
                float m2158b3 = C0758f.m2158b((C0758f.m2137c(m1929b) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (m1929b > 0.0f) {
                    m5948a2 = Color.m5948a(110, 210, 210, 210);
                } else {
                    m5948a2 = Color.m5948a(110, 210, 110, 110);
                }
                int m2202a2 = C0758f.m2202a(m5948a2, paint2.m5896e(), m2158b3);
                paint2 = this.f5227bm;
                paint2.m5908b(m2202a2);
            }
            if (m1929b < -0.5d) {
                this.f5225bk.m5875a(0, 1);
            }
            m1087A.f6113bO.mo197a(this.f5217bc, this.f5225bk.f230a, this.f5225bk.f231b, paint2, 0.0f, f2);
            C0758f.m2195a(this.f5225bk, this.f5225bk.m5872b() * 0.8f);
            if (this.f5151O && !this.f5150N && this.f5225bk.m5871b((int) this.f5129s, (int) this.f5130t)) {
                this.f5151O = false;
                z14 = true;
            }
            int i13 = 1;
            if ((z13 || z14) && abstractC0224s.mo3078g()) {
                if (m1870a(m1087A)) {
                    i13 = 5;
                }
                if (m1851b(m1087A)) {
                    i13 = 10;
                }
            }
            if (z13) {
                if (abstractC0224s.mo3078g() && m1087A.f6099bs.m5006v() <= m1087A.f6099bs.m5007u()) {
                    m1850b(this.f5114d.f4974an);
                }
                if (z15) {
                    m1087A.f6111bM.m2770b(C0631e.f4042h, 0.5f);
                    C0794c.m1930a(abstractC0244am, abstractC0224s, false, true);
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    C0749e m1802v = m1802v();
                    if (m1870a(m1087A)) {
                        m1802v.f4842e = true;
                    }
                    m1875a(m1802v, abstractC0224s);
                    m1802v.m2324a(abstractC0224s.m4867z());
                    m1888a(abstractC0224s, (PointF) null, (AbstractC0244am) null, m1802v);
                }
            }
            if (z14) {
                if (z16) {
                    C0794c.m1930a(abstractC0244am, abstractC0224s, true, true);
                    m1087A.f6111bM.m2770b(C0631e.f4043i, 0.5f);
                }
                for (int i15 = 0; i15 < i13; i15++) {
                    C0749e m1802v2 = m1802v();
                    m1875a(m1802v2, abstractC0224s);
                    m1802v2.f4844g = true;
                    m1802v2.m2324a(abstractC0224s.m4867z());
                }
            }
            if (!z13 && !z14 && this.f5151O && !this.f5150N && !this.f5223bi.m5871b((int) this.f5129s, (int) this.f5130t)) {
                return true;
            }
        }
        if (!z6 && Core.m1011at() && this.f5151O && !this.f5150N && !this.f5223bi.m5871b((int) this.f5129s, (int) this.f5130t)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m1891a(Rect rect, Paint paint, Paint paint2) {
        Core m1087A = Core.m1087A();
        if (f5247bA) {
            m1087A.f6113bO.mo194a(this.f5220bf, rect, paint2, rect.f230a, rect.f231b, 0, 0);
            if (paint != null) {
                int m5894f = paint.m5894f() + 0;
                if (m5894f > 255) {
                    m5894f = 255;
                }
                paint.m5903c(m5894f);
            }
        }
        if (paint != null) {
            m1087A.f6113bO.mo162b(rect, paint);
        }
    }

    /* renamed from: a */
    public void m1892a(Rect rect, int i, boolean z) {
        Core m1087A = Core.m1087A();
        this.f5232br.m5908b(i);
        this.f5232br.m5926a(Paint.Style.f220b);
        this.f5232br.m5936a(1.0f);
        m1087A.f6113bO.mo162b(rect, this.f5232br);
        if (this.f5246bz) {
            this.f5232br.m5908b(Color.m5948a(255, 116, 136, 160));
            int i2 = 1;
            if (z && rect.m5872b() > 100) {
                i2 = 2;
            }
            this.f5232br.m5936a(i2);
            this.f5226bl.m5873a(rect);
            this.f5226bl.f233d -= i2;
            this.f5226bl.f231b += i2;
            this.f5226bl.f230a += i2;
            this.f5226bl.f232c -= i2;
            m1087A.f6113bO.mo162b(this.f5226bl, this.f5232br);
        }
    }

    /* renamed from: a */
    public void m1897a(int i, int i2, int i3, int i4, String str, int i5, Paint paint, boolean z) {
        Core m1087A = Core.m1087A();
        this.f5224bj.m5874a(i, i2, i + i3, i2 + i4);
        this.f5232br.m5908b(i5);
        if (!z) {
            this.f5232br.m5926a(Paint.Style.f219a);
            m1087A.f6113bO.mo162b(this.f5224bj, this.f5232br);
        } else {
            m1891a(this.f5224bj, (Paint) null, this.f5232br);
        }
        int m5948a = Color.m5948a(255, 0, 0, 0);
        if (f5247bA) {
            m5948a = Color.m5948a(100, 0, 0, 0);
        }
        m1892a(this.f5224bj, m5948a, false);
        m1898a(i, i2, i3, i4, str, i5, paint);
    }

    /* renamed from: a */
    public void m1898a(int i, int i2, int i3, int i4, String str, int i5, Paint paint) {
        Core m1087A = Core.m1087A();
        this.f5224bj.m5874a(i, i2, i + i3, i2 + i4);
        if (Core.f6207aW) {
            m1087A.f6113bO.mo181a(str, this.f5224bj.m5867d(), this.f5224bj.m5866e() + (m1087A.f6113bO.mo179a(str, paint) / 2), paint);
        } else {
            m1087A.f6113bO.mo181a(str, this.f5224bj.m5867d(), this.f5224bj.m5866e() - ((paint.m5887l() + paint.m5886m()) / 2.0f), paint);
        }
    }

    /* renamed from: I */
    public boolean m1913I() {
        if (this.f5150N) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m1896a(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5) {
        return m1894a(i, i2, i3, i4, str, enumC0798g, z, i5, this.f5185aw, false);
    }

    /* renamed from: b */
    public boolean m1855b(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5) {
        return m1894a(i, i2, i3, i4, str, enumC0798g, z, i5, this.f5185aw, true);
    }

    /* renamed from: a */
    public boolean m1895a(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5, Paint paint) {
        return m1894a(i, i2, i3, i4, str, enumC0798g, z, i5, paint, false);
    }

    /* renamed from: a */
    public boolean m1894a(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5, Paint paint, boolean z2) {
        m1897a(i, i2, i3, i4, str, i5, paint, z2);
        return m1899a(i, i2, i3, i4, enumC0798g, z);
    }

    /* renamed from: a */
    public void m1907a(float f, float f2, float f3, float f4) {
        this.f5261bO.m5874a((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        if (this.f5261bO.m5871b((int) this.f5131u, (int) this.f5132v)) {
            this.f5143G = true;
            if (this.f5152P) {
                this.f5142F = true;
            }
        }
    }

    /* renamed from: a */
    public boolean m1899a(int i, int i2, int i3, int i4, EnumC0798g enumC0798g, boolean z) {
        m1907a(i, i2, i3, i4);
        this.f5224bj.m5874a(i, i2, i + i3, i2 + i4);
        if (((z && this.f5140D) || this.f5151O) && this.f5224bj.m5871b((int) this.f5129s, (int) this.f5130t)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1900a(int i, int i2, int i3, int i4, EnumC0798g enumC0798g) {
        this.f5224bj.m5874a(i, i2, i + i3, i2 + i4);
        if (this.f5152P && this.f5224bj.m5871b((int) this.f5129s, (int) this.f5130t)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public float m1806r(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        if (abstractC0244am.f1645cF < m1087A.f6104bA && abstractC0244am.f1645cF + 200 > m1087A.f6104bA) {
            return (1.0f - ((m1087A.f6104bA - abstractC0244am.f1645cF) / 200.0f)) * 6.0f;
        }
        return Core.m1087A().f6273dw;
    }

    /* renamed from: a */
    public void m1873a(C0767e c0767e) {
        Core m1087A = Core.m1087A();
        c0767e.m2011r_();
        c0767e.m1987c(m1087A.f6136cn);
        c0767e.m1984d(m1087A.f6137co);
        this.f5124n.m1994a(c0767e);
    }

    /* renamed from: J */
    public static void m1912J() {
        f5262bP++;
        f5263bQ = true;
    }
}
