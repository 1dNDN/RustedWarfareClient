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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    C0555h f5111c;

    /* renamed from: d */
    public C0760a f5112d;

    /* renamed from: e */
    public C0800i f5113e;

    /* renamed from: f */
    public C0787af f5114f;

    /* renamed from: q */
    double f5115q;

    /* renamed from: x */
    boolean f5116x;

    /* renamed from: y */
    boolean f5117y;

    /* renamed from: z */
    float f5118z;

    /* renamed from: A */
    public float f5119A;

    /* renamed from: B */
    public float f5120B;

    /* renamed from: Q */
    public AbstractC0244am f5121Q;

    /* renamed from: R */
    public float f5122R;

    /* renamed from: S */
    public int f5123S;

    /* renamed from: T */
    public float f5124T;

    /* renamed from: U */
    public AbstractC0244am f5125U;

    /* renamed from: W */
    public AbstractC0224s f5126W;

    /* renamed from: X */
    public int f5127X;

    /* renamed from: Y */
    public boolean f5128Y;

    /* renamed from: Z */
    public float f5129Z;

    /* renamed from: aa */
    public float f5130aa;

    /* renamed from: ab */
    public float f5131ab;

    /* renamed from: ac */
    public boolean f5132ac;

    /* renamed from: ad */
    public float f5133ad;

    /* renamed from: ae */
    public float f5134ae;

    /* renamed from: af */
    public float f5135af;

    /* renamed from: ag */
    public float f5136ag;

    /* renamed from: ah */
    public float f5137ah;

    /* renamed from: ai */
    public float f5138ai;

    /* renamed from: aj */
    public boolean f5139aj;

    /* renamed from: ak */
    public float f5140ak;

    /* renamed from: al */
    public float f5141al;

    /* renamed from: am */
    public int f5142am;

    /* renamed from: ao */
    public Paint f5143ao;

    /* renamed from: ap */
    public Paint f5144ap;

    /* renamed from: aq */
    public Paint f5145aq;

    /* renamed from: ar */
    public Paint f5146ar;

    /* renamed from: as */
    public Paint f5147as;

    /* renamed from: at */
    public Paint f5148at;

    /* renamed from: au */
    public Paint f5149au;

    /* renamed from: av */
    public Paint f5150av;

    /* renamed from: aw */
    public Paint f5151aw;

    /* renamed from: ax */
    public Paint f5152ax;

    /* renamed from: ay */
    public Paint f5153ay;

    /* renamed from: az */
    public Paint f5154az;

    /* renamed from: aA */
    public Paint f5155aA;

    /* renamed from: aB */
    public Paint f5156aB;

    /* renamed from: aC */
    public Paint f5157aC;

    /* renamed from: aD */
    public Paint f5158aD;

    /* renamed from: aE */
    Paint f5159aE;

    /* renamed from: aF */
    Paint f5160aF;

    /* renamed from: aG */
    Paint f5161aG;

    /* renamed from: aH */
    Paint f5162aH;

    /* renamed from: aI */
    Paint f5163aI;

    /* renamed from: aJ */
    Paint f5164aJ;

    /* renamed from: aK */
    C0930ag f5165aK;

    /* renamed from: aL */
    C0930ag f5166aL;

    /* renamed from: aM */
    C0930ag f5167aM;

    /* renamed from: aN */
    public float f5168aN;

    /* renamed from: aR */
    int f5169aR;

    /* renamed from: aT */
    public boolean f5170aT;

    /* renamed from: aX */
    boolean f5171aX;

    /* renamed from: aY */
    float f5172aY;

    /* renamed from: aZ */
    Paint f5173aZ;

    /* renamed from: ba */
    Paint f5174ba;

    /* renamed from: bs */
    String f5175bs;

    /* renamed from: bt */
    String f5176bt;

    /* renamed from: bu */
    C0385az f5177bu;

    /* renamed from: bv */
    String f5178bv;

    /* renamed from: bw */
    String f5179bw;

    /* renamed from: bx */
    String f5180bx;

    /* renamed from: bR */
    private int f5181bR;

    /* renamed from: bS */
    private int f5182bS;

    /* renamed from: bT */
    private int f5183bT;

    /* renamed from: bU */
    private int f5184bU;

    /* renamed from: bV */
    private int f5185bV;

    /* renamed from: bW */
    private int f5186bW;

    /* renamed from: bD */
    public static boolean f5187bD;

    /* renamed from: bI */
    long f5188bI;

    /* renamed from: bJ */
    boolean f5189bJ;

    /* renamed from: bM */
    public static AbstractC0244am f5190bM;

    /* renamed from: bQ */
    static boolean f5191bQ;

    /* renamed from: a */
    public static boolean f5192a = false;

    /* renamed from: bA */
    public static boolean f5193bA = false;

    /* renamed from: bB */
    public static boolean f5194bB = false;

    /* renamed from: bC */
    public static boolean f5195bC = false;

    /* renamed from: bP */
    static int f5196bP = 1;

    /* renamed from: b */
    public boolean f5197b = false;

    /* renamed from: g */
    C0210e f5198g = new C0210e();

    /* renamed from: h */
    C0211f f5199h = new C0211f();

    /* renamed from: i */
    C0214i f5200i = new C0214i();

    /* renamed from: j */
    C0209d f5201j = new C0209d();

    /* renamed from: k */
    public C0215j f5202k = new C0215j();

    /* renamed from: l */
    C0223r f5203l = new C0223r();

    /* renamed from: m */
    C0222q f5204m = new C0222q();

    /* renamed from: n */
    AbstractC0773j f5205n = new C0763a();

    /* renamed from: o */
    boolean f5206o = false;

    /* renamed from: p */
    public boolean f5207p = false;

    /* renamed from: r */
    float f5208r = 0.0f;

    /* renamed from: s */
    public float f5209s = 0.0f;

    /* renamed from: t */
    public float f5210t = 0.0f;

    /* renamed from: u */
    float f5211u = 40.0f;

    /* renamed from: v */
    float f5212v = 40.0f;

    /* renamed from: w */
    int f5213w = 0;

    /* renamed from: C */
    boolean f5214C = false;

    /* renamed from: D */
    boolean f5215D = false;

    /* renamed from: E */
    boolean f5216E = false;

    /* renamed from: F */
    boolean f5217F = false;

    /* renamed from: G */
    boolean f5218G = false;

    /* renamed from: H */
    float f5219H = 0.0f;

    /* renamed from: I */
    float f5220I = 0.0f;

    /* renamed from: J */
    float f5221J = 0.0f;

    /* renamed from: K */
    float f5222K = 0.0f;

    /* renamed from: L */
    float f5223L = 0.0f;

    /* renamed from: M */
    float f5224M = 0.0f;

    /* renamed from: N */
    boolean f5225N = false;

    /* renamed from: O */
    boolean f5226O = false;

    /* renamed from: P */
    boolean f5227P = false;

    /* renamed from: V */
    public final boolean f5228V = true;

    /* renamed from: an */
    public final Paint f5229an = new Paint();

    /* renamed from: aO */
    public float f5230aO = 0.0f;

    /* renamed from: aP */
    public float f5231aP = 0.0f;

    /* renamed from: aQ */
    public float f5232aQ = 0.0f;

    /* renamed from: aS */
    public float f5233aS = 0.0f;

    /* renamed from: aU */
    C0934e f5234aU = null;

    /* renamed from: aV */
    C0934e f5235aV = null;

    /* renamed from: aW */
    C0934e f5236aW = null;

    /* renamed from: bb */
    C0934e f5237bb = null;

    /* renamed from: bc */
    C0934e f5238bc = null;

    /* renamed from: bd */
    public C0934e f5239bd = null;

    /* renamed from: be */
    public C0934e f5240be = null;

    /* renamed from: bf */
    public C0934e f5241bf = null;

    /* renamed from: bg */
    C0934e f5242bg = null;

    /* renamed from: bh */
    final Rect f5243bh = new Rect();

    /* renamed from: bi */
    final Rect f5244bi = new Rect();

    /* renamed from: bj */
    final Rect f5245bj = new Rect();

    /* renamed from: bk */
    final Rect f5246bk = new Rect();

    /* renamed from: bl */
    final Rect f5247bl = new Rect();

    /* renamed from: bm */
    final Paint f5248bm = new Paint();

    /* renamed from: bn */
    final Paint f5249bn = new Paint();

    /* renamed from: bo */
    final Paint f5250bo = new C0930ag();

    /* renamed from: bp */
    public final Paint f5251bp = new C0930ag();

    /* renamed from: bq */
    final Paint f5252bq = new C0930ag();

    /* renamed from: br */
    final Paint f5253br = new Paint();

    /* renamed from: by */
    public ArrayList f5254by = new ArrayList();

    /* renamed from: bz */
    public boolean f5255bz = false;

    /* renamed from: bE */
    C0765c f5256bE = C0765c.m1964b(-1, -1);

    /* renamed from: bF */
    C0439f f5257bF = new C0439f();

    /* renamed from: bG */
    long f5258bG = -1;

    /* renamed from: bH */
    long f5259bH = -1;

    /* renamed from: bK */
    public C1112u f5260bK = new C1112u();

    /* renamed from: bL */
    public C1112u f5261bL = new C1112u();

    /* renamed from: bN */
    Paint f5262bN = new Paint();

    /* renamed from: bO */
    Rect f5263bO = new Rect();

    /* renamed from: a */
    public boolean m1867a() {
        if (LoggerMaybe.m994av()) {
            return false;
        }
        return LoggerMaybe.m1072A().f6115bQ.useCircleSelect;
    }

    /* renamed from: b */
    float m1816b() {
        return Math.min(this.f5208r * 2.5f, 290.0f) + 10.0f;
    }

    /* renamed from: c */
    float m1803c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float f = 0.7f;
        if (LoggerMaybe.m995au()) {
            f = 0.9f;
        }
        if (m1072A.f6256cW < 1.0f) {
            float f2 = m1072A.f6256cW;
            if (f2 < 0.4d) {
                f2 = 0.4f;
            }
            f *= f2;
        }
        return f;
    }

    /* renamed from: a */
    public void m1821a(String str, int i) {
        this.f5112d.m2002a(str, i);
    }

    /* renamed from: b */
    public void m1805b(String str, int i) {
        this.f5112d.m1997b(str, i);
    }

    /* renamed from: a */
    public void m1822a(String str) {
        this.f5112d.m2003a(str);
    }

    /* renamed from: b */
    public void m1806b(String str) {
        this.f5112d.m2002a(str, 100);
    }

    /* renamed from: c */
    public void m1797c(String str) {
        this.f5112d.m2002a(str, 50);
    }

    /* renamed from: d */
    public void m1792d(String str) {
        this.f5112d.m2002a(str, 5);
    }

    /* renamed from: d */
    public void m1796d() {
        this.f5226O = false;
        this.f5227P = false;
        this.f5215D = false;
    }

    /* renamed from: a */
    public boolean m1865a(float f, float f2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!f5193bA || this.f5112d.f4949ar) {
            return f < m1072A.f6134ck - m1072A.f6138cp;
        } else if (m1072A.f6121bW.m1728c(f, f2) != null) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public void m1791e() {
        if (this.f5112d != null) {
            this.f5112d.m2021a();
        }
    }

    /* renamed from: a */
    public void m1819a(boolean z) {
        if (z) {
            this.f5112d.m1979j();
            return;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f5112d.m1978k();
        m1777k();
        this.f5207p = false;
        this.f5254by.clear();
        if (!z) {
            m1072A.f6237bt = 1.0f;
            m1072A.f6101bw = false;
            m1072A.f6100bv = false;
            m1072A.f6231bl = false;
            m1072A.f6233bn = false;
        }
        if (m1072A.m1060M() && m1072A.m1058O()) {
            m1072A.f6100bv = m1072A.f6122bX.f5483p;
        }
        C0785ad.m1914a();
        m1868J();
    }

    /* renamed from: f */
    public void m1788f() {
        f5193bA = false;
        f5194bB = false;
        f5195bC = false;
        if (LoggerMaybe.m995au()) {
            f5193bA = true;
            f5194bB = true;
            f5192a = true;
            f5195bC = true;
        }
        if (LoggerMaybe.f6209aY) {
            f5193bA = true;
            f5194bB = true;
            f5195bC = true;
        }
        if (LoggerMaybe.m997as() && !LoggerMaybe.m1072A().f6115bQ.classicInterface) {
            f5193bA = true;
            f5194bB = true;
            f5195bC = true;
        }
    }

    /* renamed from: a */
    public void m1849a(Context context) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (LoggerMaybe.m1071B()) {
            this.f5255bz = true;
        }
        m1788f();
        this.f5175bs = C0820a.m1687a("gui.notAvailableInDemoText", new Object[0]);
        this.f5176bt = "Locked";
        this.f5177bu = C0385az.m4010b("gui.notEnoughResources");
        this.f5178bv = C0820a.m1687a("gui.cannotPlace.general", new Object[0]);
        this.f5179bw = C0820a.m1687a("gui.cannotPlace.needsResourcePool", new Object[0]);
        this.f5180bx = C0820a.m1687a("gui.cannotPlace.needsWater", new Object[0]);
        this.f5112d = new C0760a(m1072A, this);
        m1791e();
        this.f5113e = new C0800i(m1072A, this);
        this.f5114f = new C0787af(m1072A);
        this.f5234aU = m1072A.f6113bO.mo221a(C0067R.drawable.button_no);
        this.f5235aV = m1072A.f6113bO.mo221a(C0067R.drawable.button_yes);
        this.f5236aW = m1072A.f6113bO.mo221a(C0067R.drawable.button_more);
        this.f5173aZ = new Paint();
        this.f5173aZ.m5387d(true);
        this.f5174ba = new Paint();
        this.f5174ba.m5387d(true);
        this.f5174ba.m5420a(40, 255, 255, 255);
        this.f5237bb = m1072A.f6113bO.mo221a(C0067R.drawable.button_add);
        this.f5238bc = m1072A.f6113bO.mo221a(C0067R.drawable.button_subtract);
        this.f5239bd = m1072A.f6113bO.mo221a(C0067R.drawable.icon_rally);
        this.f5240be = m1072A.f6113bO.mo221a(C0067R.drawable.icon_upgrade);
        this.f5241bf = m1072A.f6113bO.mo215a(C0067R.drawable.metal_dark, false);
        this.f5242bg = m1072A.f6113bO.mo215a(C0067R.drawable.touch_indicator, false);
        this.f5252bq.m5420a(145, 0, 175, 0);
        this.f5252bq.m5423a(6.0f);
        C0930ag.m892b(this.f5252bq);
        this.f5251bp.mo894a(true);
        this.f5143ao = new Paint();
        this.f5144ap = new C0930ag();
        this.f5144ap.m5420a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f5144ap.mo894a(true);
        this.f5144ap.m5391c(true);
        this.f5144ap.mo896a(Typeface.m5330a(Typeface.f246c, 1));
        m1072A.m1035a(this.f5144ap, 20.0f);
        this.f5144ap.m5416a(Paint.Align.f195a);
        this.f5147as = new C0930ag();
        this.f5147as.m5420a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f5147as.mo894a(true);
        this.f5147as.m5391c(true);
        this.f5147as.mo896a(Typeface.m5330a(Typeface.f246c, 1));
        m1072A.m1035a(this.f5147as, 18.0f);
        this.f5147as.m5416a(Paint.Align.f195a);
        this.f5145aq = new C0930ag();
        this.f5145aq.m5412a(this.f5144ap);
        this.f5145aq.m5420a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0);
        this.f5146ar = new C0930ag();
        this.f5146ar.m5398b(Color.m5435a(100, 0, 0, 0));
        this.f5146ar.m5413a(Paint.Style.f221c);
        this.f5148at = new C0930ag();
        this.f5148at.m5420a(100, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f5148at.m5416a(Paint.Align.f195a);
        this.f5148at.m5391c(true);
        this.f5148at.mo894a(true);
        m1072A.m1035a(this.f5148at, 12.0f);
        C0930ag.m892b(this.f5148at);
        this.f5151aw = new C0930ag();
        if (this.f5255bz) {
            this.f5151aw.m5420a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f5151aw.m5420a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f5151aw.m5416a(Paint.Align.f196b);
        this.f5151aw.m5391c(true);
        this.f5151aw.mo894a(true);
        m1072A.m1035a(this.f5151aw, 12.0f);
        C0930ag.m892b(this.f5151aw);
        LoggerMaybe.LogDebug2("smallTextPaint size: " + this.f5151aw.m5378k());
        this.f5150av = new C0930ag();
        this.f5150av.m5412a(this.f5151aw);
        m1072A.m1035a(this.f5150av, 10.0f);
        C0930ag.m892b(this.f5150av);
        this.f5149au = new C0930ag();
        this.f5149au.m5412a(this.f5151aw);
        m1072A.m1035a(this.f5149au, 8.0f);
        C0930ag.m892b(this.f5149au);
        this.f5152ax = new C0930ag();
        if (this.f5255bz) {
            this.f5152ax.m5420a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        } else {
            this.f5152ax.m5420a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        }
        this.f5152ax.m5416a(Paint.Align.f196b);
        this.f5152ax.m5391c(true);
        this.f5152ax.mo894a(true);
        m1072A.m1035a(this.f5152ax, 20.0f);
        C0930ag.m892b(this.f5152ax);
        this.f5153ay = new C0930ag();
        this.f5153ay.m5420a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
        this.f5153ay.m5416a(Paint.Align.f196b);
        this.f5153ay.m5391c(true);
        this.f5153ay.mo894a(true);
        m1072A.m1035a(this.f5153ay, 20.0f);
        C0930ag.m892b(this.f5153ay);
        this.f5157aC = new C0930ag();
        this.f5157aC.m5420a(150, 20, 20, 20);
        m1072A.m1036a(this.f5157aC);
        C0930ag.m892b(this.f5157aC);
        this.f5154az = new C0930ag();
        this.f5154az.m5412a(this.f5152ax);
        this.f5154az.m5420a(255, 128, 0, 0);
        m1072A.m1035a(this.f5154az, 14.0f);
        this.f5154az.m5416a(Paint.Align.f196b);
        C0930ag.m892b(this.f5154az);
        this.f5155aA = new C0930ag();
        this.f5155aA.m5412a(this.f5154az);
        this.f5155aA.m5420a(255, 220, 222, 49);
        this.f5156aB = new C0930ag();
        this.f5156aB.m5412a(this.f5152ax);
        m1072A.m1035a(this.f5156aB, 12.0f);
        this.f5156aB.m5420a(125, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.f5156aB.m5416a(Paint.Align.f196b);
        C0930ag.m892b(this.f5156aB);
        this.f5165aK = new C0930ag();
        this.f5165aK.m5398b(-16777216);
        this.f5165aK.mo894a(true);
        this.f5165aK.m5391c(true);
        this.f5165aK.mo896a(Typeface.m5330a(Typeface.f246c, 0));
        m1072A.m1035a(this.f5165aK, 14.0f);
        this.f5166aL = new C0930ag();
        this.f5166aL.m5412a(this.f5165aK);
        this.f5166aL.mo896a(Typeface.m5330a(Typeface.f246c, 1));
        m1072A.m1035a(this.f5166aL, 16.0f);
        this.f5167aM = new C0930ag();
        this.f5167aM.m5412a(this.f5166aL);
        this.f5167aM.m5398b(Color.m5436a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 63, 80));
        m1072A.m1035a(this.f5167aM, 16.0f);
        this.f5159aE = new C0930ag();
        this.f5159aE.m5398b(-16777216);
        this.f5159aE.m5416a(Paint.Align.f196b);
        this.f5159aE.mo894a(true);
        this.f5159aE.m5391c(true);
        this.f5159aE.mo896a(Typeface.m5330a(Typeface.f246c, 0));
        m1072A.m1035a(this.f5159aE, 20.0f);
        this.f5160aF = new C0930ag();
        this.f5160aF.m5398b(-1);
        this.f5160aF.m5393c(160);
        if (LoggerMaybe.m995au()) {
            this.f5160aF.m5393c(140);
        }
        m1072A.m1036a(this.f5160aF);
        this.f5161aG = new C0930ag();
        this.f5161aG.m5398b(-16777216);
        this.f5161aG.m5393c(210);
        m1072A.m1036a(this.f5161aG);
        this.f5164aJ = new C0930ag();
        this.f5164aJ.m5398b(-7829368);
        this.f5164aJ.m5393c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.f5164aJ.m5413a(Paint.Style.f220b);
        this.f5164aJ.m5423a(1.0f);
        m1072A.m1036a(this.f5164aJ);
        this.f5162aH = new C0930ag();
        this.f5162aH.m5398b(-16711936);
        this.f5162aH.m5393c(80);
        this.f5162aH.m5413a(Paint.Style.f219a);
        this.f5162aH.m5423a(4.0f);
        m1072A.m1036a(this.f5162aH);
        this.f5163aI = new C0930ag();
        this.f5163aI.m5398b(Color.m5435a(120, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 167, 49));
        this.f5163aI.m5413a(Paint.Style.f219a);
        this.f5163aI.m5423a(8.0f);
        m1072A.m1036a(this.f5163aI);
        this.f5158aD = new C0930ag();
        this.f5158aD.m5391c(true);
        this.f5158aD.mo894a(true);
        m1072A.m1035a(this.f5158aD, 12.0f);
        C0930ag.m892b(this.f5158aD);
    }

    /* renamed from: g */
    public void m1785g() {
        this.f5113e.m1749b();
        this.f5114f.m1900b();
        this.f5189bJ = false;
    }

    /* renamed from: a */
    public void m1866a(float f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f5115q += f;
        this.f5230aO = C0758f.m2159a(this.f5230aO, f);
        this.f5231aP = C0758f.m2159a(this.f5231aP, f);
        this.f5233aS = C0758f.m2159a(this.f5233aS, 0.08f * f);
        this.f5232aQ = C0758f.m2159a(this.f5232aQ, f);
        this.f5118z += f;
        this.f5168aN += 0.05f * f;
        if (this.f5168aN > 1.0f) {
            this.f5168aN -= 1.0f;
            if (this.f5168aN > 1.0f) {
                this.f5168aN = 0.0f;
            }
        }
        m1072A.f6273dw = 4.0f * this.f5233aS;
        float f2 = 1.0f * f;
        if (!this.f5215D) {
            float f3 = this.f5223L * f;
            float f4 = this.f5224M * f;
            float m2049g = C0758f.m2049g(80.0f, f3);
            float m2049g2 = C0758f.m2049g(80.0f, f4);
            m1072A.f6146cx += m2049g;
            m1072A.f6147cy += m2049g2;
        } else {
            f2 *= 4.0f;
        }
        float m2105b = C0758f.m2105b(0.0f, 0.0f, this.f5223L, this.f5224M);
        float m2071d = C0758f.m2071d(0.0f, 0.0f, this.f5223L, this.f5224M);
        if (m2105b > 30.0f) {
            m2105b = 30.0f;
        }
        float m2159a = C0758f.m2159a(m2105b, f2);
        this.f5223L = C0758f.m2040i(m2071d) * m2159a;
        this.f5224M = C0758f.m2045h(m2071d) * m2159a;
        this.f5170aT = false;
        this.f5215D = m1072A.m1014ab() && m1072A.f6282dL[0] && this.f5230aO == 0.0f;
        if (this.f5231aP != 0.0f) {
            if (!this.f5215D) {
                this.f5231aP = 0.0f;
            }
            this.f5215D = false;
            this.f5214C = false;
        }
        boolean z = false;
        if (this.f5232aQ > 0.0f) {
            z = true;
        }
        if (m1072A.m1014ab() && m1072A.m1012ad() > 1) {
            z = true;
            this.f5232aQ = 4.0f;
        }
        if (z) {
            this.f5215D = false;
            this.f5214C = false;
            this.f5225N = false;
            this.f5208r = 0.0f;
        }
        this.f5218G = m1072A.m1011ae() > m1072A.f6153cE;
        this.f5226O = !this.f5215D && this.f5214C;
        this.f5227P = this.f5215D && !this.f5214C;
        if (LoggerMaybe.m995au() && m1072A.f6115bQ.mouseSupport) {
            this.f5211u = m1072A.m1011ae();
            this.f5212v = m1072A.m1010af();
        }
        if (!this.f5215D && !this.f5226O) {
            this.f5117y = false;
        }
        if (this.f5215D) {
            this.f5208r += f;
            this.f5209s = m1072A.m987b(0);
            this.f5210t = m1072A.m979c(0);
            this.f5211u = this.f5209s;
            this.f5212v = this.f5210t;
            this.f5213w = m1072A.m971d(0);
            this.f5116x = m1865a(this.f5209s, this.f5210t);
            boolean z2 = false;
            if (this.f5116x && !this.f5214C) {
                if (this.f5118z < 30.0f) {
                    float m2157a = C0758f.m2157a(this.f5119A, this.f5120B, this.f5209s, this.f5210t);
                    float f5 = 10.0f * m1072A.f6132ci;
                    if (LoggerMaybe.m996at()) {
                        f5 = (float) (f5 * 1.5d);
                    }
                    if (m2157a < f5 * f5) {
                        z2 = true;
                    }
                }
                this.f5118z = 0.0f;
                this.f5119A = this.f5209s;
                this.f5120B = this.f5210t;
            }
            if (z2) {
                this.f5117y = true;
            }
            if (!this.f5214C) {
                this.f5225N = false;
                this.f5219H = this.f5209s;
                this.f5220I = this.f5210t;
                this.f5221J = this.f5209s;
                this.f5222K = this.f5210t;
                this.f5216E = m1072A.f6121bW.m1728c(this.f5209s, this.f5210t) != null;
                this.f5217F = false;
                if (!this.f5216E) {
                    this.f5217F = this.f5209s > m1072A.f6153cE;
                }
            }
            this.f5214C = true;
        }
        if (this.f5215D && (this.f5208r <= 20.0f || !m1867a())) {
            float m2157a2 = C0758f.m2157a(this.f5219H, this.f5220I, this.f5209s, this.f5210t);
            if (!this.f5216E) {
                float f6 = 30.0f * m1072A.f6132ci;
                if (LoggerMaybe.m995au() && m1072A.f6115bQ.mouseSupport && m1072A.m965e(3)) {
                    f6 = 0.0f;
                }
                if (!this.f5225N && m2157a2 > f6 * f6) {
                    boolean z3 = false;
                    int i = 1;
                    if (m1072A.f6115bQ.mouseOrders == 2) {
                        i = 2;
                    }
                    if ((!m1072A.f6115bQ.mouseSupport || this.f5213w != i) && !m1798c(m1072A)) {
                        z3 = true;
                    }
                    if (z3) {
                        this.f5225N = true;
                    }
                    this.f5221J = this.f5209s;
                    this.f5222K = this.f5210t;
                }
            }
        }
        if (LoggerMaybe.m995au() && !m1072A.f6081aq && m1072A.f6079ao != null && ((m1072A.f6079ao.mo245f() || LoggerMaybe.f6093aR) && (!this.f5215D || this.f5112d.f4957c))) {
            float f7 = (24.0f * m1072A.f6115bQ.edgeScrollSpeed) / m1072A.f6256cW;
            float f8 = m1072A.f6146cx;
            float f9 = m1072A.f6147cy;
            float f10 = 0.0f;
            float f11 = 0.0f;
            if (this.f5211u <= 1.0f) {
                f10 = 0.0f - (f7 * f);
            }
            if (this.f5211u >= m1072A.f6134ck - 1.0f) {
                f10 += f7 * f;
            }
            if (this.f5212v <= 1.0f) {
                f11 = 0.0f - (f7 * f);
            }
            if (this.f5212v >= m1072A.f6135cl - 1.0f) {
                f11 += f7 * f;
            }
            m1072A.f6146cx += f10;
            m1072A.f6147cy += f11;
            m1072A.m1057P();
            this.f5112d.f4972B.f234a -= (m1072A.f6146cx - f8) * m1072A.f6256cW;
            this.f5112d.f4972B.f235b -= (m1072A.f6147cy - f9) * m1072A.f6256cW;
        }
        C0638ac c0638ac = m1072A.f6118bT;
        if (m1072A.f6115bQ.keyboardSupport) {
            if (m1072A.m1069D()) {
                float f12 = 12.0f * m1072A.f6115bQ.scrollSpeed;
                if (c0638ac.f4097p.m2678b()) {
                    m1072A.f6146cx -= f12 * f;
                }
                if (c0638ac.f4098q.m2678b()) {
                    m1072A.f6146cx += f12 * f;
                }
                if (c0638ac.f4095n.m2678b()) {
                    m1072A.f6147cy -= f12 * f;
                }
                if (c0638ac.f4096o.m2678b()) {
                    m1072A.f6147cy += f12 * f;
                }
                if (c0638ac.f4099r.m2678b()) {
                    m1072A.f6254cU += 0.1f;
                }
                if (c0638ac.f4100s.m2678b()) {
                    m1072A.f6254cU -= 0.1f;
                }
            }
            if (c0638ac.f4106y.m2684a()) {
                m1777k();
                m1756x();
            }
            if (c0638ac.f4107z.m2684a()) {
                this.f5114f.m1896d();
            }
            if (c0638ac.f4108A.m2684a()) {
                m1777k();
                m1756x();
                Iterator it = AbstractC1120w.f6962eo.iterator();
                while (it.hasNext()) {
                    AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                    if (abstractC1120w instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                        if (!abstractC0623y.f1607bT && abstractC0623y.f1609bV == m1072A.f6099bs && abstractC0623y.mo2979l() && !abstractC0623y.m2860ak() && abstractC0623y.m2879aS()) {
                            m1778j(abstractC0623y);
                        }
                    }
                }
            }
            if (c0638ac.f4109B.m2684a()) {
                m1777k();
                m1756x();
                Iterator it2 = AbstractC1120w.f6962eo.iterator();
                while (it2.hasNext()) {
                    AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                    if (abstractC1120w2 instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w2;
                        if (abstractC0623y2.f1609bV == m1072A.f6099bs && abstractC0623y2.mo5649r() == EnumC0249ar.f1739e && !abstractC0623y2.f1607bT) {
                            m1778j(abstractC0623y2);
                            m1072A.m988b(abstractC0623y2.f6957el, abstractC0623y2.f6958em);
                        }
                    }
                }
            }
            if (c0638ac.f4110C.m2684a()) {
                AbstractC0777ab.m1923a(this.f5254by, AbstractC0777ab.f5060a, AbstractC0777ab.f5061b);
            }
            if (c0638ac.f4111D.m2684a()) {
                AbstractC0777ab.m1923a(this.f5254by, AbstractC0777ab.f5062c, null);
            }
            if (c0638ac.f4112E.m2684a()) {
                AbstractC0777ab.m1923a(this.f5254by, AbstractC0777ab.f5063d, null);
            }
            if (c0638ac.f4113F.m2684a()) {
                AbstractC0777ab.m1923a(this.f5254by, AbstractC0777ab.f5064e, null);
            }
            if (c0638ac.f4114G.m2684a()) {
                AbstractC0777ab.m1923a(this.f5254by, AbstractC0777ab.f5065f, null);
            }
            if (c0638ac.f4105x.m2684a()) {
                this.f5112d.m2017a(12);
            }
            if (c0638ac.f4121N.m2684a() && m1877A() && m1876B()) {
                m1777k();
                this.f5125U = null;
                this.f5126W = this.f5198g;
                return;
            } else if (c0638ac.f4123P.m2684a() && m1754z()) {
                m1777k();
                this.f5125U = null;
                this.f5126W = this.f5199h;
                return;
            } else if (c0638ac.f4124Q.m2684a() && m1876B()) {
                m1777k();
                this.f5125U = null;
                this.f5126W = this.f5200i;
                return;
            } else {
                if (c0638ac.f4122O.m2684a()) {
                    m1759u();
                }
                if (c0638ac.f4103v.m2684a()) {
                    m1870H();
                }
                if (c0638ac.f4101t.m2684a() && m1072A.m1060M()) {
                    LoggerMaybe.LogDebug2("showing send chat");
                    this.f5112d.m2017a(13);
                }
                if (c0638ac.f4102u.m2684a() && m1072A.m1060M()) {
                    LoggerMaybe.LogDebug2("showing send team chat");
                    this.f5112d.m2017a(16);
                }
                if (m1072A.m1058O() || m1072A.f6126cb.m2411h()) {
                    if (c0638ac.f4119L.m2684a()) {
                        if (m1072A.f6237bt != 0.0f) {
                            if (!m1072A.f6126cb.m2411h()) {
                                C0831ad.m1544a((String) null, "Game paused");
                            }
                            m1072A.f6237bt = 0.0f;
                        } else {
                            m1072A.f6237bt = 1.0f;
                        }
                    }
                    boolean m2684a = c0638ac.f4117J.m2684a();
                    boolean m2684a2 = c0638ac.f4118K.m2684a();
                    if (m2684a || m2684a2) {
                        if (m2684a) {
                            boolean z4 = m1072A.f6237bt > 1.0f;
                            if (m1072A.f6237bt < 2.0f) {
                                m1072A.f6237bt = (float) (m1072A.f6237bt - 0.25d);
                            } else if (m1072A.f6237bt < 6.0f) {
                                m1072A.f6237bt = (float) (m1072A.f6237bt - 0.5d);
                            } else if (m1072A.f6237bt < 16.0f) {
                                m1072A.f6237bt -= 2.0f;
                            } else {
                                m1072A.f6237bt -= 4.0f;
                            }
                            if (m1072A.f6237bt < 0.0f) {
                                m1072A.f6237bt = 0.0f;
                            }
                            if (z4 && m1072A.f6237bt < 1.0f) {
                                m1072A.f6237bt = 1.0f;
                            }
                        } else if (m2684a2) {
                            boolean z5 = m1072A.f6237bt < 1.0f;
                            if (m1072A.f6237bt < 2.0f) {
                                m1072A.f6237bt = (float) (m1072A.f6237bt + 0.25d);
                            } else if (m1072A.f6237bt < 6.0f) {
                                m1072A.f6237bt = (float) (m1072A.f6237bt + 0.5d);
                            } else if (m1072A.f6237bt < 16.0f) {
                                m1072A.f6237bt += 2.0f;
                            } else {
                                m1072A.f6237bt += 4.0f;
                            }
                            if (m1072A.f6126cb.m2411h()) {
                                if (m1072A.f6237bt > 64.0f) {
                                    m1072A.f6237bt = 64.0f;
                                }
                            } else if (m1072A.f6237bt > 5.0f) {
                                m1072A.f6237bt = 5.0f;
                            }
                            if (z5 && m1072A.f6237bt > 1.0f) {
                                m1072A.f6237bt = 1.0f;
                            }
                        }
                        if (!m1072A.f6126cb.m2411h()) {
                            C0831ad.m1544a((String) null, "Game speed now: " + m1072A.f6237bt);
                        }
                    }
                } else if (c0638ac.f4119L.m2684a() && m1072A.f6122bX.IsServer && m1072A.f6122bX.f5539bm) {
                    m1072A.f6122bX.m1461e(!m1072A.f6122bX.f5515al);
                }
                m1072A.f6160cS = C0758f.m2159a(m1072A.f6160cS, f);
                if (c0638ac.f4132Y.m2684a()) {
                    m1072A.f6160cS = 180.0f;
                }
                if (m1072A.f6100bv && c0638ac.f4135ab.m2684a()) {
                    m1072A.f6231bl = !m1072A.f6231bl;
                    LoggerMaybe.LogDebug2("debugTempMode now: " + m1072A.f6231bl);
                    m1806b("debug: " + m1072A.f6231bl);
                }
                if (m1072A.f6100bv && m1072A.f6231bl && c0638ac.f4136ac.m2684a()) {
                    C0136a.f553ar = !C0136a.f553ar;
                    m1806b("AI debug view: " + C0136a.f553ar);
                }
                if (m1072A.f6100bv && m1072A.f6231bl && c0638ac.f4137ad.m2684a()) {
                    C1049f.f6658a = !C1049f.f6658a;
                    m1806b("Map debug: " + C1049f.f6658a);
                }
                if (m1072A.m1058O() || m1072A.f6126cb.m2411h()) {
                    if (m1072A.f6100bv) {
                        if (c0638ac.f4129V.m2684a()) {
                            m1072A.f6098bp = !m1072A.f6098bp;
                        }
                        if (c0638ac.f4130W.m2684a()) {
                            if (m1072A.f6237bt == 1.0f) {
                                m1072A.f6237bt = 0.1f;
                            } else {
                                m1072A.f6237bt = 1.0f;
                            }
                        }
                        if (c0638ac.f4131X.m2684a()) {
                            LoggerMaybe.LogDebug2("Adding test popup");
                            m1072A.f6122bX.m1583U();
                        }
                        if (c0638ac.f4133Z.m2684a()) {
                            m1072A.f6101bw = !m1072A.f6101bw;
                        }
                        if (c0638ac.f4134aa.m2684a()) {
                            Iterator it3 = AbstractC1120w.f6962eo.iterator();
                            while (it3.hasNext()) {
                                AbstractC1120w abstractC1120w3 = (AbstractC1120w) it3.next();
                                if (abstractC1120w3 instanceof AbstractC0623y) {
                                    AbstractC0623y abstractC0623y3 = (AbstractC0623y) abstractC1120w3;
                                    if (abstractC0623y3.f1644cE) {
                                        abstractC0623y3.m2949U();
                                    }
                                }
                            }
                        }
                    }
                    if (c0638ac.f4128U.m2684a()) {
                        m1072A.f6100bv = !m1072A.f6100bv;
                        if (m1072A.f6100bv) {
                            m1756x();
                        }
                    }
                }
            }
        }
        if (m1072A.f6100bv && !m1072A.m1058O() && !m1072A.f6126cb.m2411h()) {
            m1072A.f6100bv = false;
        }
        if (m1072A.f6100bv) {
            if (this.f5111c != null && (this.f5111c.f6952eg || this.f5111c.f1607bT)) {
                this.f5111c = null;
            }
            if (this.f5111c == null) {
                LoggerMaybe.LogDebug2("Creating new debug editor");
                this.f5111c = new C0555h(false);
                this.f5111c.m2838b(m1072A.f6099bs);
            }
            if (m1767p() == 0) {
                m1756x();
                m1778j(this.f5111c);
            }
            if (m1072A.f6115bQ.liveReloading && m1072A.f6239bx % 100 == 0 && !m1072A.f6126cb.m2412g()) {
                C0348af.m4067c();
            }
        } else {
            if (this.f5111c != null && (this.f5111c.f6952eg || this.f5111c.f1607bT)) {
                this.f5111c = null;
            }
            if (this.f5111c != null && !m1072A.f6126cb.m2411h()) {
                m1783h();
            }
        }
        if (this.f5225N) {
            if (this.f5217F) {
                this.f5112d.f4948aq = this.f5222K - this.f5210t;
            } else {
                int i2 = 1;
                if (m1072A.f6115bQ.mouseOrders == 2) {
                    i2 = 2;
                }
                if ((!m1072A.f6115bQ.mouseSupport || this.f5213w != i2) && !m1798c(m1072A)) {
                    SettingsEngine settingsEngine = m1072A.f6115bQ;
                    double d = this.f5221J - this.f5209s;
                    double d2 = this.f5222K - this.f5210t;
                    float m2105b2 = C0758f.m2105b(0.0f, 0.0f, (float) d, (float) d2);
                    double d3 = (d * settingsEngine.scrollSpeed) / m1072A.f6256cW;
                    double d4 = (d2 * settingsEngine.scrollSpeed) / m1072A.f6256cW;
                    if (f != 0.0f && m2105b2 > 50.0d * f) {
                        float f13 = 0.7f;
                        if (LoggerMaybe.m995au()) {
                            f13 = 1.7f;
                        }
                        this.f5223L = (float) (d3 * f13);
                        this.f5224M = (float) (d4 * f13);
                    }
                    m1072A.f6146cx = (float) (m1072A.f6146cx + (d3 * 2.0d));
                    m1072A.f6147cy = (float) (m1072A.f6147cy + (d4 * 2.0d));
                }
            }
            this.f5221J = this.f5209s;
            this.f5222K = this.f5210t;
        }
        if (m1072A.f6115bQ.mouseSupport && (this.f5256bE.f5006a != ((int) m1072A.m1011ae()) || this.f5256bE.f5007b != ((int) m1072A.m1010af()))) {
            this.f5256bE.f5006a = (int) m1072A.m1011ae();
            this.f5256bE.f5007b = (int) m1072A.m1010af();
            this.f5205n.m1939b(this.f5256bE);
        }
        if (this.f5226O && m1869I()) {
            this.f5205n.m1939b(C0765c.m1966a((int) this.f5211u, (int) this.f5212v));
        }
        this.f5205n.m1941b(f);
    }

    /* renamed from: h */
    public void m1783h() {
        if (this.f5111c != null) {
            m1774l(this.f5111c);
            this.f5111c.m4351ch();
            this.f5111c = null;
        }
    }

    /* renamed from: i */
    public C0555h m1781i() {
        return this.f5111c;
    }

    /* renamed from: a */
    public void m1835a(C0555h c0555h) {
        this.f5111c = c0555h;
    }

    /* renamed from: a */
    public boolean m1826a(LoggerMaybe loggerMaybe) {
        if (!loggerMaybe.f6115bQ.keyboardSupport) {
            return false;
        }
        return loggerMaybe.m978c(59, 60);
    }

    /* renamed from: b */
    public boolean m1807b(LoggerMaybe loggerMaybe) {
        if (!loggerMaybe.f6115bQ.keyboardSupport) {
            return false;
        }
        return loggerMaybe.m978c(113, 114);
    }

    /* renamed from: c */
    public boolean m1798c(LoggerMaybe loggerMaybe) {
        if (!loggerMaybe.f6115bQ.keyboardSupport) {
            return false;
        }
        return loggerMaybe.m978c(57, 58);
    }

    /* renamed from: b */
    public void m1815b(float f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f5124T += 0.2f * f;
        if (this.f5124T > 360.0f) {
            this.f5124T -= 360.0f;
        }
        this.f5245bj.m5364a((int) (m1072A.f6134ck - m1072A.f6138cp), 0, (int) m1072A.f6134ck, (int) m1072A.f6135cl);
        if (!f5193bA) {
            if (this.f5255bz) {
                this.f5248bm.m5424a();
                this.f5248bm.m5398b(Color.m5435a(255, 33, 40, 52));
                this.f5248bm.m5413a(Paint.Style.f219a);
                m1072A.f6113bO.mo162b(this.f5245bj, this.f5248bm);
            } else {
                m1072A.f6113bO.mo195a(this.f5241bf, this.f5245bj, (Paint) null);
            }
            this.f5248bm.m5424a();
            this.f5248bm.m5398b(Color.m5435a(255, 0, 0, 0));
            this.f5248bm.m5413a(Paint.Style.f220b);
            m1072A.f6113bO.mo162b(this.f5245bj, this.f5248bm);
        }
        this.f5181bR = 0;
        this.f5183bT = 0;
        this.f5182bS = 0;
        this.f5185bV = this.f5186bW;
        this.f5186bW = 0;
        if (m1072A.f6126cb.m2411h() || (m1072A.f6099bs != null && m1072A.f6099bs.m4619b())) {
            AbstractC0623y m1763r = m1763r();
            if (m1763r != null) {
                m1823a(m1072A, m1763r.f1609bV, false, true);
            }
        } else {
            AbstractC0623y m1761s = m1761s();
            if (m1072A.f6099bs != null && m1072A.f6099bs != AbstractC0197n.f1371i && !m1072A.f6099bs.m4619b() && !m1072A.f6126cb.m2411h()) {
                m1823a(m1072A, m1072A.f6099bs, false, true);
            }
            if (m1761s != null && m1072A.f6099bs != m1761s.f1609bV && m1772m(m1761s)) {
                m1823a(m1072A, m1761s.f1609bV, true, true);
            }
        }
        if (m1072A.f6100bv && !m1072A.f6126cb.m2411h()) {
            String str = VariableScope.nullOrMissingString;
            if (m1072A.f6100bv) {
                str = str + "Editor Active\n";
            }
            if (m1072A.f6237bt != 1.0f) {
                str = str + "Game Speed: " + m1072A.f6237bt + "x\n";
            }
            if (m1072A.f6101bw) {
                str = str + "Invincible Units\n";
            }
            boolean z = false;
            Iterator it = AbstractC0197n.m4603c().iterator();
            while (it.hasNext()) {
                AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
                if (abstractC0197n instanceof C0136a) {
                    z = ((C0136a) abstractC0197n).f619bF > 0.0f;
                }
            }
            if (z) {
                str = str + "AIs frozen\n";
            }
            this.f5248bm.m5424a();
            this.f5248bm.m5398b(Color.m5435a(0, 0, 0, 0));
            this.f5248bm.m5413a(Paint.Style.f219a);
            float f2 = 70.0f * m1072A.f6132ci;
            float f3 = 40.0f;
            if (m1072A.f6134ck < 600.0f && m1072A.f6135cl > 650.0f) {
                f2 = 10.0f;
                f3 = 60.0f * m1072A.f6132ci;
            }
            m1072A.f6113bO.mo180a(str, f2, f3, this.f5147as, this.f5248bm, 6.0f);
        }
        m1779j();
        this.f5205n.m1931f();
    }

    /* renamed from: j */
    public void m1779j() {
        LoggerMaybe.m1072A();
    }

    /* renamed from: a */
    public void m1823a(LoggerMaybe loggerMaybe, AbstractC0197n abstractC0197n, boolean z, boolean z2) {
        if (abstractC0197n.f1309n) {
            m1825a(loggerMaybe, abstractC0197n, z, C0431c.f2762B, abstractC0197n.m4642W() + abstractC0197n.f1311p, (C0439f) null, 0, (C0428a) null);
        }
        if (z2) {
            this.f5257bF.m3779g(abstractC0197n.m4641X());
            Iterator it = C0428a.m3839e().iterator();
            while (it.hasNext()) {
                C0428a c0428a = (C0428a) it.next();
                if (c0428a.m3841c() && c0428a.f2749o) {
                    this.f5257bF.m3791c(c0428a);
                }
            }
            this.f5257bF.m3782e();
            m1824a(loggerMaybe, abstractC0197n, z, this.f5257bF);
        }
    }

    /* renamed from: a */
    public void m1824a(LoggerMaybe loggerMaybe, AbstractC0197n abstractC0197n, boolean z, C0439f c0439f) {
        Iterator it = c0439f.f2802b.iterator();
        while (it.hasNext()) {
            C0438e c0438e = (C0438e) it.next();
            if (!c0438e.f2799a.m3853a()) {
                m1825a(loggerMaybe, abstractC0197n, z, c0438e.f2799a, c0438e.f2800b, c0439f, 0, (C0428a) null);
            }
        }
    }

    /* renamed from: a */
    public boolean m1825a(LoggerMaybe loggerMaybe, AbstractC0197n abstractC0197n, boolean z, C0428a c0428a, double d, C0439f c0439f, int i, C0428a c0428a2) {
        float f;
        float f2;
        C0428a c0428a3;
        if (i == 0) {
            this.f5184bU = 0;
        }
        boolean z2 = false;
        if (i < 6 && c0439f != null && (c0428a3 = c0428a.f2743i) != null && ((c0428a.f2744j || d != 0.0d) && m1825a(loggerMaybe, abstractC0197n, z, c0428a3, c0439f.m3815a(c0428a3), c0439f, i + 1, c0428a))) {
            z2 = true;
        }
        if (d == 0.0d && !c0428a.f2749o) {
            if (z2) {
                return true;
            }
            return false;
        }
        String m3851a = c0428a.m3851a(d, true);
        int m4613b = abstractC0197n.m4613b(c0428a);
        int m4633a = abstractC0197n.m4633a(c0428a);
        if (m4633a != 0) {
            m3851a = m3851a + "(+" + m4613b + ")(-" + m4633a + ")";
        } else if (m4613b != 0) {
            if (m4613b >= 0) {
                m3851a = m3851a + "(+" + m4613b + ")";
            } else {
                m3851a = m3851a + "(" + m4613b + ")";
            }
        }
        int i2 = ((int) (loggerMaybe.f6134ck - loggerMaybe.f6138cp)) - this.f5184bU;
        Paint paint = this.f5144ap;
        if (z) {
            paint = this.f5145aq;
        } else {
            Integer m3837g = c0428a.m3837g();
            if (m3837g != null) {
                this.f5229an.m5412a(paint);
                paint = this.f5229an;
                paint.m5398b(m3837g.intValue());
            }
        }
        float mo157b = loggerMaybe.f6113bO.mo157b(m3851a, paint);
        float mo179a = loggerMaybe.f6113bO.mo179a(m3851a, paint);
        if (this.f5186bW < mo157b) {
            this.f5186bW = (int) mo157b;
        }
        int i3 = this.f5183bT;
        if (c0428a.f2755u) {
            i3 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        if (i3 == 0) {
            i4 = this.f5182bS;
        } else {
            i5 = this.f5181bR;
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
            this.f5181bR = (int) (this.f5181bR + mo179a + 6);
            i5 = this.f5181bR;
            i2 += this.f5184bU;
            this.f5184bU = 0;
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
            i6 = loggerMaybe.f6113bO.mo157b("AA", paint);
        }
        int i10 = i2 - i6;
        C0934e m3834j = c0428a.m3834j();
        float f4 = 1.0f;
        if (m3834j != null) {
            float f5 = mo179a - 3.0f;
            if (f5 < 3.0f) {
                f5 = 3.0f;
            }
            f4 = C0795d.m1883a(m3834j, mo179a * 3.0f, f5);
            f = (m3834j.f6402p * f4) + 3.0f;
            i8 += (int) f;
        } else {
            f = 0.0f;
        }
        C0795d.m1881a(m3851a, ((i10 - mo157b) - i4) - 6, i5 + 6, paint, this.f5146ar, i8, i7, i9, 6);
        if (m3834j != null) {
            loggerMaybe.f6113bO.mo197a(m3834j, (int) (((f2 - (f / 2.0f)) - (m3834j.f6404r * f4)) - 3.0f), (int) (((i5 + 6) + (mo179a / 2.0f)) - (m3834j.f6405s * f4)), this.f5251bp, 0.0f, f4);
        }
        if (i == 0) {
            if (i3 == 0) {
                this.f5182bS = (int) (this.f5182bS + mo157b + i9 + i8);
            }
            if (this.f5183bT == i3) {
                this.f5181bR = (int) (this.f5181bR + mo179a + 6);
                this.f5183bT++;
            }
        }
        this.f5184bU = (int) (this.f5184bU + mo157b + i9 + i8 + i6);
        return true;
    }

    /* renamed from: b */
    public boolean m1804b(boolean z) {
        return m1817a(z, false, false);
    }

    /* renamed from: a */
    public boolean m1818a(boolean z, boolean z2) {
        return m1817a(z, true, z2);
    }

    /* renamed from: a */
    public boolean m1817a(boolean z, boolean z2, boolean z3) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (LoggerMaybe.m995au()) {
            return false;
        }
        this.f5171aX = true;
        float f = m1072A.f6132ci * 0.6f;
        int i = (int) (100.0f * f);
        int i2 = (int) (10.0f * f);
        int i3 = (int) ((m1072A.f6135cl - ((int) (9.0f * f))) - (i * this.f5172aY));
        if (f5187bD) {
            i3 = (int) (i3 - m1072A.f6121bW.f5283d);
        }
        if (z3) {
            int i4 = ((int) (20.0f * f)) + i + ((int) (20.0f * f)) + i;
            this.f5246bk.m5364a(i2 + i4, i3, i2 + i4 + i, i3 + i);
            m1072A.f6113bO.mo197a(this.f5236aW, this.f5246bk.f230a, this.f5246bk.f231b, this.f5173aZ, 0.0f, f);
        } else if (z) {
            this.f5246bk.m5364a(i2, i3, i2 + i, i3 + i);
            m1072A.f6113bO.mo197a(this.f5235aV, this.f5246bk.f230a, this.f5246bk.f231b, this.f5173aZ, 0.0f, f);
        } else {
            int i5 = ((int) (20.0f * f)) + i;
            this.f5246bk.m5364a(i2 + i5, i3, i2 + i5 + i, i3 + i);
            m1072A.f6113bO.mo197a(this.f5234aU, this.f5246bk.f230a, this.f5246bk.f231b, this.f5173aZ, 0.0f, f);
        }
        if (this.f5226O && !this.f5225N) {
            C0758f.m2143a(this.f5246bk, 10.0f * f);
            if (this.f5246bk.m5361b((int) this.f5209s, (int) this.f5210t)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m1777k() {
        LoggerMaybe.m1072A();
        if (this.f5126W != null) {
            if (this.f5126W.mo3022e() == EnumC0226u.f1476b) {
                this.f5126W = null;
                this.f5128Y = false;
                this.f5132ac = false;
                this.f5125U = null;
                this.f5139aj = false;
                this.f5127X++;
            } else {
                this.f5126W = null;
            }
            this.f5142am = 0;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m1802c(float f) {
        float f2;
        float f3;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        Point m1728c = m1072A.f6121bW.m1728c(this.f5209s, this.f5210t);
        if (m1728c != null) {
            f2 = m1728c.f224a;
            f3 = m1728c.f225b;
        } else {
            f2 = (this.f5209s / m1072A.f6256cW) + m1072A.f6144cv;
            f3 = (this.f5210t / m1072A.f6256cW) + m1072A.f6145cw;
        }
        this.f5129Z = C0758f.m2159a(this.f5129Z, f);
        this.f5245bj.m5364a((int) (m1072A.f6134ck - m1072A.f6138cp), 0, (int) m1072A.f6134ck, (int) m1072A.f6135cl);
        if (!f5193bA && ((this.f5226O || this.f5215D) && this.f5245bj.m5361b((int) this.f5209s, (int) this.f5210t))) {
            this.f5170aT = true;
        }
        this.f5112d.m2020a(f);
        this.f5112d.m2000b(f);
        this.f5122R += f;
        if (!m1072A.m933z()) {
            this.f5112d.m2019a(f, this.f5112d.m1991d(f));
            this.f5112d.m1982g(f);
            this.f5113e.m1751a(f);
            this.f5114f.m1905a(f);
            if (this.f5207p) {
                this.f5112d.m1995c(f);
            }
            this.f5112d.m1987e(f);
            this.f5112d.m2018a(f, true);
        }
        m1862a(f, f2, f3, m1728c);
        if (!m1072A.m933z() && !this.f5207p) {
            this.f5112d.m1995c(f);
        }
        boolean z = false;
        if (!this.f5225N) {
            boolean z2 = true;
            boolean z3 = true;
            boolean z4 = true;
            if (LoggerMaybe.m995au() && m1072A.f6115bQ.mouseSupport) {
                if (m1072A.f6115bQ.mouseOrders == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    if (m1072A.f6115bQ.mouseOrders == 1) {
                        if (m1072A.m965e(1)) {
                            z3 = true;
                        } else if (m1072A.m965e(2)) {
                            z4 = true;
                        }
                    } else if (m1072A.m965e(2)) {
                        z3 = true;
                    } else if (m1072A.m965e(1)) {
                        z4 = true;
                    }
                }
            }
            float f4 = f2;
            float f5 = f3;
            if (this.f5215D && m1728c != null && this.f5216E) {
                boolean z5 = false;
                if (!z2 && !z4) {
                    z5 = true;
                }
                z5 = (m1767p() == 0 || !m1876B()) ? true : true;
                if (z2 && this.f5208r > 20.0f) {
                    z5 = true;
                }
                if (z5) {
                    m1072A.m988b(f4, f5);
                    z = true;
                }
            }
            if ((this.f5116x || (m1728c != null && (z2 || z4))) && !z && this.f5126W == null && this.f5226O) {
                if (this.f5208r > 30.0f) {
                    if (m1867a() && m1728c == null) {
                        m1756x();
                        m1813b(f4, f5, m1816b() / m1072A.f6256cW);
                        m1874D();
                    }
                } else {
                    m1072A.f6161cT = false;
                    if (!z2) {
                        if (z3) {
                            AbstractC0244am abstractC0244am = null;
                            if (m1728c == null) {
                                abstractC0244am = m1857a(f4, f5, true);
                            }
                            m1838a(abstractC0244am);
                        } else if (z4) {
                            AbstractC0244am abstractC0244am2 = null;
                            if (m1728c == null) {
                                abstractC0244am2 = m1857a(f4, f5, false);
                            }
                            boolean z6 = false;
                            if (abstractC0244am2 == null) {
                                z6 = true;
                            } else if (!m1836a(abstractC0244am2, false, f4, f5, m1728c)) {
                                z6 = true;
                            }
                            if (z6) {
                                m1801c(f4, f5, m1728c);
                            }
                        }
                    } else {
                        AbstractC0244am abstractC0244am3 = null;
                        AbstractC0244am abstractC0244am4 = null;
                        if (m1728c == null) {
                            abstractC0244am3 = m1857a(f4, f5, true);
                            abstractC0244am4 = m1857a(f4, f5, false);
                        }
                        if (abstractC0244am3 == null && abstractC0244am4 == null) {
                            m1801c(f4, f5, m1728c);
                        } else if (abstractC0244am4 != null) {
                            if (!m1836a(abstractC0244am4, true, f4, f5, m1728c)) {
                                if (!abstractC0244am4.mo1713t()) {
                                    m1838a(abstractC0244am4);
                                } else if (abstractC0244am3 != null) {
                                    m1838a(abstractC0244am3);
                                }
                            }
                        } else {
                            m1838a(abstractC0244am3);
                        }
                    }
                }
            }
        }
        if (this.f5126W == null && this.f5215D && !this.f5225N && !this.f5216E && !this.f5170aT) {
            this.f5143ao.m5413a(Paint.Style.f219a);
            this.f5143ao.m5423a(1.0f);
            if (this.f5208r > 20.0f && m1867a()) {
                float m1816b = m1816b();
                this.f5143ao.m5420a(100, 0, 255, 0);
                m1072A.f6113bO.mo223a(this.f5209s, this.f5210t, m1816b, this.f5143ao);
                this.f5143ao.m5413a(Paint.Style.f220b);
                this.f5143ao.m5423a(1.0f);
                this.f5143ao.m5420a(200, 0, 255, 0);
                m1072A.f6113bO.mo223a(this.f5209s, this.f5210t, m1816b, this.f5143ao);
            }
        }
        if (m1072A.f6230bk && m1072A.m1014ab() && m1072A.m1012ad() > 0) {
            Paint paint = new Paint();
            paint.m5393c(100);
            for (int i = 0; i < m1072A.m1012ad(); i++) {
                m1072A.f6113bO.mo137i();
                m1072A.f6113bO.mo226a(0.7f, 0.7f, m1072A.m987b(i), m1072A.m979c(i));
                m1072A.f6113bO.mo198a(this.f5242bg, m1072A.m987b(i), m1072A.m979c(i), paint);
                m1072A.f6113bO.mo136j();
            }
        }
        if (!this.f5215D) {
            this.f5208r = 0.0f;
            this.f5225N = false;
        }
        this.f5214C = this.f5215D;
        m1072A.m1013ac();
        if (f5191bQ) {
            m1868J();
            f5191bQ = false;
        }
    }

    /* renamed from: a */
    public void m1862a(float f, float f2, float f3, Point point) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0623y m1985f = this.f5112d.m1985f();
        if (this.f5171aX) {
            this.f5172aY = C0758f.m2158a(this.f5172aY, 1.0f, 0.05f * f);
            this.f5172aY = (float) (this.f5172aY + (0.08d * (1.0f - this.f5172aY)));
        } else {
            this.f5172aY = C0758f.m2158a(this.f5172aY, 0.0f, 0.3f * f);
        }
        this.f5171aX = false;
        if (this.f5126W != null) {
            if (this.f5126W instanceof C0212g) {
                C0212g c0212g = (C0212g) this.f5126W;
                if (c0212g.f1433b != null) {
                    m1985f = c0212g.f1433b;
                }
            }
            if (this.f5126W.mo3022e() == EnumC0226u.f1479e) {
                m1842a(this.f5126W, false, m1985f, false, true);
                if (m1804b(false) || m1773m()) {
                    m1777k();
                    this.f5226O = false;
                } else if (this.f5226O && !this.f5225N && !m1775l()) {
                    AbstractC0244am m1857a = m1857a(f2, f3, false);
                    if (m1857a != null && this.f5126W.mo4493o(m1857a)) {
                        m1808b(m1857a);
                        if (!m1826a(m1072A)) {
                            m1777k();
                        }
                    } else {
                        m1864a(f2, f3, 0.0f);
                    }
                    this.f5226O = false;
                }
            } else if (this.f5126W.mo3022e() == EnumC0226u.f1480f) {
                m1842a(this.f5126W, false, m1985f, false, true);
                if (m1804b(false) || m1773m()) {
                    m1777k();
                    this.f5226O = false;
                } else if (this.f5226O && !this.f5225N && !m1775l()) {
                    AbstractC0244am m1857a2 = m1857a(f2, f3, true);
                    if (m1857a2 != null && this.f5126W.mo4493o(m1857a2)) {
                        m1793d(m1857a2);
                        if (!m1826a(m1072A)) {
                            m1777k();
                        }
                    } else {
                        m1864a(f2, f3, 0.0f);
                    }
                    this.f5226O = false;
                }
            } else if (this.f5126W.mo3022e() == EnumC0226u.f1478d) {
                m1842a(this.f5126W, false, m1985f, false, true);
                if (m1804b(false) || m1773m()) {
                    m1777k();
                    this.f5226O = false;
                } else if (this.f5226O && !this.f5225N && !m1775l()) {
                    m1814b(f2, f3);
                    m1777k();
                    this.f5226O = false;
                }
            } else if (this.f5126W.mo3022e() == EnumC0226u.f1481g) {
                m1842a(this.f5126W, false, m1985f, false, true);
                AbstractC0623y m1985f2 = this.f5112d.m1985f();
                AbstractC0224s abstractC0224s = this.f5126W;
                if (this.f5126W instanceof C0212g) {
                    C0212g c0212g2 = (C0212g) abstractC0224s;
                    if (c0212g2.f1433b != null) {
                        m1985f2 = c0212g2.f1433b;
                    }
                    abstractC0224s = c0212g2.f1432a;
                }
                if (m1985f2 != null && (m1985f2 instanceof AbstractC0623y)) {
                    m1072A.f6113bO.mo137i();
                    m1072A.m1056Q();
                    ((AbstractC0623y) m1985f2).m2926a(abstractC0224s);
                    m1072A.f6113bO.mo136j();
                }
                boolean z = (!this.f5226O || this.f5225N || m1775l()) ? false : true;
                if (this.f5126W.mo3014p()) {
                    if (LoggerMaybe.m994av()) {
                        z = m1771n() && this.f5116x && m1869I();
                    } else {
                        z = this.f5215D && this.f5116x && m1869I();
                    }
                }
                if (m1804b(false) || m1773m()) {
                    m1777k();
                    this.f5226O = false;
                } else if (z && point == null) {
                    boolean z2 = false;
                    if (m1845a(this.f5126W, f2, f3)) {
                        z2 = true;
                    }
                    if (!z2) {
                        m1809b(this.f5126W, f2, f3);
                        if (!m1826a(m1072A) && !this.f5126W.mo3015o()) {
                            m1777k();
                        }
                    } else {
                        m1864a(f2, f3, 0.0f);
                    }
                    this.f5226O = false;
                }
            } else if (this.f5126W.mo3022e() == EnumC0226u.f1482h) {
                m1842a(this.f5126W, false, m1985f, false, true);
                if (m1804b(false) || m1773m()) {
                    m1777k();
                    this.f5226O = false;
                } else if (this.f5226O && !this.f5225N && !m1775l()) {
                    m1795d(f2, f3, point);
                    if (!m1826a(m1072A)) {
                        m1777k();
                        this.f5226O = false;
                    }
                }
            } else if (this.f5126W.mo3022e() == EnumC0226u.f1486l) {
                m1842a(this.f5126W, false, m1985f, false, true);
                if (m1804b(false) || m1773m()) {
                    m1777k();
                    this.f5226O = false;
                } else if (this.f5226O && !this.f5225N && !m1775l()) {
                    AbstractC0244am m1857a3 = m1857a(f2, f3, true);
                    if (m1857a3 != null && this.f5126W.mo4493o(m1857a3)) {
                        m1789e(m1857a3);
                        m1777k();
                    } else {
                        m1864a(f2, f3, 0.0f);
                    }
                    this.f5226O = false;
                }
            } else if (this.f5126W.mo3022e() == EnumC0226u.f1487m) {
                m1842a(this.f5126W, false, m1985f, false, true);
                if (m1804b(false) || m1773m()) {
                    m1777k();
                    this.f5226O = false;
                } else if (this.f5226O && !this.f5225N && !m1775l()) {
                    m1859a(f2, f3, point, this.f5142am == 0);
                    this.f5142am++;
                }
            } else if (this.f5126W.mo3022e() == EnumC0226u.f1484j) {
                m1842a(this.f5126W, false, m1985f, false, true);
                if (m1804b(false) || m1773m()) {
                    m1777k();
                    this.f5226O = false;
                } else if (this.f5226O && !this.f5225N && !m1775l() && point == null) {
                    if (this.f5126W instanceof C0215j) {
                        m1860a(f2, f3, point, (C0215j) this.f5126W);
                    } else {
                        LoggerMaybe.m983b("orderBuildingSpecialAction is not a PingMapAction, it is: " + this.f5126W.getClass().getName());
                    }
                    m1777k();
                    this.f5226O = false;
                }
            } else if (this.f5126W.mo5648i() != null && this.f5126W.mo3022e() == EnumC0226u.f1476b) {
                m1861a(f2, f3, point);
            }
        }
    }

    /* renamed from: a */
    public void m1861a(float f, float f2, Point point) {
        boolean z;
        Point m1753a;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0244am m1985f = this.f5112d.m1985f();
        boolean z2 = false;
        if (m1985f != null && m1985f.m4427a(this.f5126W.m4507N()) != null) {
            z2 = this.f5126W.mo3027a(m1985f, true) && !C0760a.m2014a(this.f5126W);
            if (!this.f5126W.mo3025b(m1985f)) {
                z2 = false;
            }
        }
        m1842a(this.f5126W, false, m1985f, !z2, true);
        float f3 = this.f5211u / m1072A.f6256cW;
        float f4 = this.f5212v / m1072A.f6256cW;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        if (LoggerMaybe.m994av() && m1072A.f6115bQ.mouseSupport) {
            z3 = true;
            z6 = this.f5218G;
        }
        if (z3) {
            if (m1771n()) {
                if (!this.f5139aj) {
                    this.f5139aj = true;
                    this.f5137ah = f3 + m1072A.f6144cv;
                    this.f5138ai = f4 + m1072A.f6145cw;
                }
            } else {
                this.f5139aj = false;
            }
            if (this.f5139aj) {
                float f5 = f3 - (this.f5137ah - m1072A.f6144cv);
                float f6 = f4 - (this.f5138ai - m1072A.f6145cw);
                if (C0758f.m2085c(f5) > 4.0f || C0758f.m2085c(f6) > 4.0f) {
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
        if (LoggerMaybe.m995au() && m1072A.f6115bQ.mouseSupport) {
            z12 = true;
        }
        if (this.f5128Y && !z12) {
            if (z2) {
                if (!this.f5132ac && m1818a(true, false)) {
                    m1072A.f6111bM.m2716b(C0631e.f4042h, 0.5f);
                    this.f5226O = false;
                    z7 = true;
                }
                if (m1818a(true, true)) {
                    m1072A.f6111bM.m2716b(C0631e.f4042h, 0.5f);
                    this.f5226O = false;
                    z9 = true;
                }
            }
            if (m1818a(false, false)) {
                m1072A.f6111bM.m2716b(C0631e.f4043i, 0.7f);
                this.f5226O = false;
                z8 = true;
            }
        }
        boolean z13 = false;
        if (LoggerMaybe.m994av() && m1072A.f6115bQ.mouseSupport) {
            z13 = true;
        }
        if (this.f5226O && !this.f5225N) {
            z13 = true;
        }
        if (LoggerMaybe.m996at()) {
            z5 = true;
            if (m1072A.m1012ad() == 2) {
                z13 = true;
                f3 = m1072A.m987b(0) / m1072A.f6256cW;
                f4 = m1072A.m979c(0) / m1072A.f6256cW;
                float m987b = m1072A.m987b(1) / m1072A.f6256cW;
                this.f5139aj = true;
                this.f5137ah = m987b;
                this.f5138ai = m1072A.m979c(1) / m1072A.f6256cW;
            } else if (this.f5226O && !this.f5225N) {
                this.f5139aj = false;
            }
            if (this.f5139aj) {
                z4 = true;
            }
        }
        if (z13) {
            this.f5128Y = true;
            this.f5130aa = f3 * m1072A.f6256cW;
            this.f5131ab = f4 * m1072A.f6256cW;
            if (!m1865a(m1072A.m1011ae(), m1072A.m1010af())) {
                this.f5128Y = false;
                z11 = false;
            }
        }
        float f7 = this.f5137ah;
        float f8 = this.f5138ai;
        if (z5) {
            f7 += m1072A.f6144cv + m1072A.f6139cq;
            f8 += m1072A.f6145cw + m1072A.f6140cr;
        }
        InterfaceC0303as mo5648i = this.f5126W.mo5648i();
        int mo4485t = this.f5126W.mo4485t();
        boolean z14 = false;
        if (LoggerMaybe.m994av() && m1072A.f6115bQ.mouseSupport && !m1072A.f6247cJ.m5361b((int) this.f5211u, (int) this.f5212v)) {
            z14 = true;
        }
        AbstractC0244am m4383c = AbstractC0244am.m4383c(mo5648i);
        if ((m4383c == null || !(m4383c instanceof AbstractC0623y)) && C0453l.f2903b != null) {
            m4383c = AbstractC0244am.m4383c(C0453l.f2903b);
        }
        if (this.f5128Y && !z14) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m4383c;
            m1072A.f6110bL.m4822b((this.f5130aa / m1072A.f6256cW) + m1072A.f6144cv, (this.f5131ab / m1072A.f6256cW) + m1072A.f6145cw);
            abstractC0623y.f6957el = m1072A.f6110bL.f801T;
            abstractC0623y.f6958em = m1072A.f6110bL.f802U;
            if (mo5648i.mo4245p()) {
                z4 = false;
                if (C0799h.m1753a((int) abstractC0623y.f6957el, (int) abstractC0623y.f6958em, 3) != null) {
                    abstractC0623y.f6957el = m1753a.f224a;
                    abstractC0623y.f6958em = m1753a.f225b;
                }
            }
            if (!abstractC0623y.m4402bI()) {
                abstractC0623y.f1618ce = 0.0f;
            } else {
                abstractC0623y.f1618ce = -90.0f;
            }
            abstractC0623y.f6957el += abstractC0623y.mo3292cX();
            abstractC0623y.f6958em += abstractC0623y.mo3291cY();
            abstractC0623y.m2838b(this.f5125U.f1609bV);
            abstractC0623y.mo3174a(mo4485t);
            abstractC0623y.f1627cn = true;
            String m2828b = abstractC0623y.m2828b(false, m1072A.f6099bs);
            if (C0741a.m2352a(m1072A.f6099bs, abstractC0623y, this.f5127X)) {
                m2828b = "{0}";
            }
            if (m1767p() == 1 && m1985f != null && (m1985f instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m1985f;
                if (!abstractC0623y2.m2880aR()) {
                    float m2157a = C0758f.m2157a(abstractC0623y2.f6957el, abstractC0623y2.f6958em, abstractC0623y.f6957el, abstractC0623y.f6958em);
                    float f9 = abstractC0623y2.mo3082f(abstractC0623y.mo5649r());
                    if (f9 > 800000.0f) {
                        z = true;
                    } else {
                        z = m2157a <= f9 * f9;
                    }
                    if (!z) {
                        m2828b = "{0}";
                    }
                }
            }
            if (z4) {
            }
            AbstractC0244am abstractC0244am = null;
            if (m1767p() == 1) {
                abstractC0244am = m1985f;
            }
            if (z2) {
                if (z4) {
                    if (LoggerMaybe.m995au() || (LoggerMaybe.m996at() && m1072A.m1012ad() == 2)) {
                        m1072A.f6113bO.mo225a(f3 * m1072A.f6256cW, f4 * m1072A.f6256cW, (f7 - m1072A.f6144cv) * m1072A.f6256cW, (f8 - m1072A.f6145cw) * m1072A.f6256cW, this.f5252bq);
                    } else {
                        m1072A.f6113bO.mo225a((abstractC0623y.f6957el - m1072A.f6144cv) * m1072A.f6256cW, (abstractC0623y.f6958em - m1072A.f6145cw) * m1072A.f6256cW, (f7 - m1072A.f6144cv) * m1072A.f6256cW, (f8 - m1072A.f6145cw) * m1072A.f6256cW, this.f5252bq);
                    }
                    m2828b = null;
                    m1834a(abstractC0623y, f7, f8, abstractC0623y.f6957el, abstractC0623y.f6958em, true, (ArrayList) null, abstractC0244am);
                } else {
                    m1833a(abstractC0623y, abstractC0623y.f6957el, abstractC0623y.f6958em, true, z6, abstractC0244am);
                }
            }
            abstractC0623y.mo3174a(1);
            if (z11 && m1769o()) {
                this.f5226O = false;
                if (m1826a(m1072A)) {
                    z9 = true;
                    z10 = true;
                } else {
                    z7 = true;
                }
            }
            if (m1773m()) {
                this.f5226O = false;
                z8 = true;
            }
            if (this.f5226O && !this.f5225N) {
                float f10 = f4;
                float f11 = this.f5140ak;
                float f12 = this.f5141al;
                if (C0758f.m2085c(f11 - f3) < 15.0f && C0758f.m2085c(f12 - f10) < 15.0f && this.f5129Z != 0.0f) {
                    this.f5226O = false;
                    m1072A.f6111bM.m2716b(C0631e.f4042h, 0.5f);
                    if (this.f5132ac) {
                        z9 = true;
                    } else {
                        z7 = true;
                    }
                }
                this.f5129Z = 80.0f;
                this.f5140ak = f3;
                this.f5141al = f4;
            }
            if ((z7 || z9) && z2) {
                if (m2828b != null) {
                    m1072A.f6111bM.m2716b(C0631e.f4046l, 0.7f);
                    if (m2828b != "{0}") {
                        String str = m2828b;
                        if (str == "{2}") {
                            str = this.f5179bw;
                        }
                        if (str == "{3}") {
                            str = this.f5180bx;
                        }
                        if (str == "{1}") {
                            str = this.f5178bv;
                        }
                        m1797c(str);
                    }
                } else {
                    float f13 = abstractC0623y.f6957el;
                    float f14 = abstractC0623y.f6958em;
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        m1834a(abstractC0623y, f7, f8, abstractC0623y.f6957el, abstractC0623y.f6958em, false, arrayList, (AbstractC0244am) null);
                    } else {
                        arrayList.add(new PointF(f13, f14));
                    }
                    int i = 0;
                    boolean z15 = true;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PointF pointF = (PointF) it.next();
                        if (this.f5126W.mo4139A()) {
                            C0749e m1757w = m1757w();
                            m1832a(m1757w);
                            m1757w.m2271a(this.f5126W.m4507N(), pointF, (AbstractC0244am) null);
                        } else {
                            C0749e m1757w2 = m1757w();
                            if (z15) {
                                z15 = false;
                                if (z9) {
                                    if (!m1757w2.f4855e) {
                                        m1757w2.f4856f = true;
                                    }
                                    this.f5132ac = true;
                                }
                            } else {
                                m1757w2.f4855e = true;
                            }
                            AbstractC0623y m1761s = m1761s();
                            if (this.f5126W instanceof C0212g) {
                                AbstractC0623y abstractC0623y3 = ((C0212g) this.f5126W).f1433b;
                                m1757w2.m2267a(abstractC0623y3);
                                m1761s = abstractC0623y3;
                            } else {
                                m1832a(m1757w2);
                            }
                            m1757w2.m2276a(pointF.f227a, pointF.f228b, mo5648i, mo4485t);
                            if (m1761s != null) {
                                C0741a c0741a = new C0741a();
                                c0741a.f4649d = mo5648i;
                                c0741a.f4652g = pointF.f227a;
                                c0741a.f4653h = pointF.f228b;
                                c0741a.f4659n = true;
                                c0741a.f4660o = m1761s;
                                c0741a.f4650e = m1072A.f6099bs;
                                c0741a.f4651f = mo4485t;
                                c0741a.f4655j = m1072A.f6099bs;
                                c0741a.f4663r = this.f5127X;
                                c0741a.f4664s = 1.0f + (0.15f * i);
                                if (m1761s.m2849av() >= 29) {
                                    c0741a.f4662q = true;
                                }
                            }
                            i++;
                        }
                    }
                    this.f5230aO = 5.0f;
                    if (LoggerMaybe.m994av()) {
                        this.f5230aO = 1.0f;
                    }
                    this.f5139aj = false;
                    if (!z9) {
                        if (i > 0) {
                            boolean z16 = true;
                            if (abstractC0623y != null && !m1766p(abstractC0623y)) {
                                z16 = false;
                            }
                            this.f5126W = null;
                            this.f5128Y = false;
                            this.f5132ac = false;
                            this.f5125U = null;
                            if (z16) {
                                m1756x();
                            }
                            this.f5127X++;
                        }
                    } else if (!z10) {
                        float f15 = abstractC0623y.f6957el;
                        float f16 = abstractC0623y.f6958em;
                        boolean z17 = false;
                        if (C0758f.m2085c(f15 - this.f5133ad) < (abstractC0623y.m4356cc().m5362b() * m1072A.f6110bL.f785n * 2.0f) + (3 * m1072A.f6110bL.f785n) && C0758f.m2085c(f16 - this.f5134ae) < (abstractC0623y.m4356cc().m5358c() * m1072A.f6110bL.f786o * 2.0f) + (3 * m1072A.f6110bL.f786o)) {
                            this.f5135af = f15 - this.f5133ad;
                            this.f5136ag = f16 - this.f5134ae;
                            if (C0758f.m2085c(this.f5135af) > C0758f.m2085c(this.f5136ag)) {
                                this.f5136ag = 0.0f;
                            } else {
                                this.f5135af = 0.0f;
                            }
                        }
                        if (abstractC0623y.m4356cc().m5358c() > abstractC0623y.m4356cc().m5362b() + 1) {
                            this.f5136ag = 0.0f;
                        }
                        this.f5133ad = f15;
                        this.f5134ae = f16;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        if (this.f5136ag < 0.0f) {
                            f17 = -1.0f;
                        }
                        if (this.f5135af < 0.0f) {
                            f18 = -1.0f;
                        }
                        if (this.f5136ag > 0.0f) {
                            f17 = 1.0f;
                        }
                        if (this.f5135af > 0.0f) {
                            f18 = 1.0f;
                        }
                        if (f18 == 0.0f && f17 == 0.0f) {
                            f18 = 1.0f;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        float f19 = f15 + (200.0f * f18);
                        float f20 = f16 + (200.0f * f17);
                        float f21 = (-abstractC0623y.mo3292cX()) + 1.0f;
                        float f22 = (-abstractC0623y.mo3291cY()) + 1.0f;
                        m1834a(abstractC0623y, f15 + f21, f16 + f22, f19 + f21, f20 + f22, false, arrayList2, (AbstractC0244am) null);
                        if (arrayList2.size() > 0) {
                            abstractC0623y.f6957el = ((PointF) arrayList2.get(0)).f227a;
                            abstractC0623y.f6958em = ((PointF) arrayList2.get(0)).f228b;
                            z17 = true;
                        }
                        if (!z17) {
                            m1834a(abstractC0623y, f15 + f21, f16 + f22, f15 + (200.0f * (-f18)) + f21, f16 + (200.0f * (-f17)) + f22, false, arrayList2, (AbstractC0244am) null);
                            if (arrayList2.size() > 0) {
                                abstractC0623y.f6957el = ((PointF) arrayList2.get(0)).f227a;
                                abstractC0623y.f6958em = ((PointF) arrayList2.get(0)).f228b;
                                z17 = true;
                            }
                        }
                        if (!z17) {
                            abstractC0623y.f6957el += 3 * m1072A.f6110bL.f785n;
                            abstractC0623y.f6958em += m1072A.f6110bL.f785n;
                        }
                        if (z17) {
                            float f23 = abstractC0623y.f6957el - f15;
                            float f24 = abstractC0623y.f6958em - f16;
                            float f25 = m1072A.f6146cx;
                            float f26 = m1072A.f6147cy;
                            m1072A.f6139cq += f23;
                            m1072A.f6140cr += f24;
                            m1072A.f6146cx += m1072A.f6139cq;
                            m1072A.f6147cy += m1072A.f6140cr;
                            float f27 = m1072A.f6146cx;
                            float f28 = m1072A.f6147cy;
                            m1072A.m1057P();
                            m1072A.f6139cq += m1072A.f6146cx - f27;
                            m1072A.f6140cr += m1072A.f6147cy - f28;
                            float f29 = (f25 + f23) - m1072A.f6146cx;
                            float f30 = (f26 + f24) - m1072A.f6147cy;
                            if (C0758f.m2085c(f29) > 1.0f) {
                                this.f5130aa += f29 * m1072A.f6256cW;
                            }
                            if (C0758f.m2085c(f30) > 1.0f) {
                                this.f5131ab += f30 * m1072A.f6256cW;
                            }
                            m1072A.f6146cx -= m1072A.f6139cq;
                            m1072A.f6147cy -= m1072A.f6140cr;
                        }
                    }
                }
            }
            if (z8) {
                m1777k();
                if (this.f5132ac) {
                    m1756x();
                }
            }
        }
    }

    /* renamed from: l */
    public boolean m1775l() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (LoggerMaybe.m994av() && m1072A.f6115bQ.mouseSupport && !m1773m() && !m1769o()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m1773m() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (LoggerMaybe.m994av() && m1072A.f6115bQ.mouseSupport && this.f5226O && !this.f5225N && !this.f5170aT) {
            int i = 1;
            int i2 = 2;
            if (m1072A.f6115bQ.mousePlacement == 2) {
                i = 2;
                i2 = 1;
            }
            if (m1072A.m965e(i)) {
            }
            if (m1072A.m965e(i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1771n() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (LoggerMaybe.m995au() && m1072A.f6115bQ.mouseSupport) {
            if (this.f5226O || this.f5215D) {
                int i = 1;
                int i2 = 2;
                if (m1072A.f6115bQ.mousePlacement == 2) {
                    i = 2;
                    i2 = 1;
                }
                if (m1072A.m965e(i)) {
                    return true;
                }
                if (m1072A.m965e(i2)) {
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1769o() {
        if (this.f5226O && !this.f5225N && !this.f5170aT) {
            return m1771n();
        }
        return false;
    }

    /* renamed from: a */
    public void m1838a(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (abstractC0244am != null && this.f5121Q == abstractC0244am && this.f5122R < 40.0f && !m1807b(m1072A)) {
            if (!m1826a(m1072A)) {
                m1756x();
            }
            m1782h(abstractC0244am);
        } else if (abstractC0244am != null) {
            if (!m1826a(m1072A) && !m1807b(m1072A)) {
                m1756x();
            }
            m1837a(abstractC0244am, m1807b(m1072A));
            this.f5121Q = abstractC0244am;
            this.f5122R = 0.0f;
        }
    }

    /* renamed from: a */
    public boolean m1836a(AbstractC0244am abstractC0244am, boolean z, float f, float f2, Point point) {
        LoggerMaybe.m1072A();
        AbstractC0197n m1765q = m1765q();
        boolean m4599c = m1765q.m4599c(abstractC0244am.f1609bV);
        if (m4599c && m1877A() && m1764q(abstractC0244am)) {
            m1799c(abstractC0244am);
            return true;
        }
        if (m1765q.m4587d(abstractC0244am.f1609bV) && ((abstractC0244am.f1632cs < abstractC0244am.f1633ct || abstractC0244am.f1624ck < 1.0f) && m1767p() != 0)) {
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            if (abstractC0244am.m4343cq() && m1770n(abstractC0244am)) {
                z3 = true;
            }
            Iterator it = this.f5261bL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                if (abstractC1120w instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                    if (!abstractC0623y.f1644cE) {
                        continue;
                    } else if (!m1772m(abstractC0623y)) {
                        z2 = false;
                        break;
                    } else if (!abstractC0623y.mo3087a(abstractC0244am)) {
                        z2 = false;
                        break;
                    } else {
                        if (abstractC0623y.m2879aS()) {
                            z5 = true;
                        }
                        C0305au m2853ar = abstractC0623y.m2853ar();
                        if (m2853ar != null && m2853ar.m4222d() == EnumC0306av.repair) {
                            z4 = true;
                        }
                    }
                }
            }
            if (z2 && (!z4 || !z3)) {
                if (z5) {
                    m1793d(abstractC0244am);
                    return true;
                }
                m1793d(abstractC0244am);
                return true;
            }
        }
        if (abstractC0244am.mo3250g() > 0.0f && m1767p() != 0) {
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
                    } else if (!m1772m(abstractC0623y2)) {
                        z6 = false;
                        break;
                    } else if (!abstractC0623y2.m4308h(abstractC0244am, true)) {
                        z6 = false;
                        break;
                    }
                }
            }
            if (z6) {
                m1808b(abstractC0244am);
                return true;
            }
        }
        if (abstractC0244am.m4343cq() && m1770n(abstractC0244am)) {
            m1786f(abstractC0244am);
            return true;
        } else if (LoggerMaybe.m995au() && m1876B() && m1768o(abstractC0244am)) {
            m1784g(abstractC0244am);
            return true;
        } else {
            boolean z7 = false;
            if ((!z || abstractC0244am.mo1713t()) && !m1765q.m4599c(abstractC0244am.f1609bV)) {
                if (abstractC0244am.m4402bI()) {
                    if (abstractC0244am.m4357cb().m5366a()) {
                        z7 = true;
                    }
                } else if (!abstractC0244am.f1606bS) {
                    z7 = true;
                }
                if (!z7 && !abstractC0244am.mo2981i() && m1875C()) {
                    z7 = true;
                }
            }
            if (!z7 && m4599c && m1877A()) {
                m1864a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en);
                return true;
            }
            return false;
        }
    }

    /* renamed from: p */
    public int m1767p() {
        return this.f5169aR;
    }

    /* renamed from: a */
    void m1832a(C0749e c0749e) {
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y.f1644cE && m1772m(abstractC0623y)) {
                    c0749e.m2267a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: q */
    public AbstractC0197n m1765q() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1609bV == m1072A.f6099bs) {
                    return abstractC0623y.f1609bV;
                }
            }
        }
        Iterator it2 = this.f5261bL.iterator();
        while (it2.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it2.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am2;
                if (m1772m(abstractC0623y2)) {
                    return abstractC0623y2.f1609bV;
                }
            }
        }
        return m1072A.f6099bs;
    }

    /* renamed from: r */
    public AbstractC0623y m1763r() {
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                return (AbstractC0623y) abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: s */
    public AbstractC0623y m1761s() {
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (m1772m(abstractC0623y)) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1830a(C0749e c0749e, AbstractC0224s abstractC0224s, boolean z) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            c0749e.m2267a(((C0212g) abstractC0224s).f1433b);
            return;
        }
        C0208c m4507N = abstractC0224s.m4507N();
        AbstractC0623y abstractC0623y = null;
        int i = -99;
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y2.f1644cE && m1772m(abstractC0623y2) && (a = abstractC0623y2.m4427a(m4507N)) != null && a.mo3025b(abstractC0623y2) && (a.mo3027a((AbstractC0244am) abstractC0623y2, true) || z)) {
                    int i2 = 0;
                    if (abstractC0623y2 instanceof InterfaceC0501l) {
                        i2 = ((InterfaceC0501l) abstractC0623y2).mo3313a(m4507N, true);
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
            c0749e.m2267a(abstractC0623y);
        }
    }

    /* renamed from: a */
    boolean m1845a(AbstractC0224s abstractC0224s, float f, float f2) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            AbstractC0623y abstractC0623y = c0212g.f1433b;
            AbstractC0224s m4523m_ = c0212g.m4523m_();
            boolean z = false;
            if (m4523m_.mo3025b(abstractC0623y) && m4523m_.mo3027a((AbstractC0244am) abstractC0623y, true) && !abstractC0623y.m2925a(m4523m_, f, f2)) {
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
                if (abstractC0623y2.f1644cE && m1772m(abstractC0623y2) && (a = abstractC0623y2.m4427a(abstractC0224s.m4507N())) != null && a.mo3025b(abstractC0623y2) && a.mo3027a((AbstractC0244am) abstractC0623y2, true)) {
                    if (!abstractC0623y2.m2925a(a, f, f2)) {
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
    public void m1831a(C0749e c0749e, AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            c0749e.m2267a(((C0212g) abstractC0224s).f1433b);
            return;
        }
        C0208c m4507N = abstractC0224s.m4507N();
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y.f1644cE && m1772m(abstractC0623y) && (a = abstractC0623y.m4427a(m4507N)) != null && a.mo3025b(abstractC0623y)) {
                    c0749e.m2267a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m1843a(AbstractC0224s abstractC0224s, boolean z) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.mo3027a((AbstractC0244am) c0212g.f1433b, true);
        }
        C0208c m4507N = abstractC0224s.m4507N();
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1772m(abstractC0623y) && (a = abstractC0623y.m4427a(m4507N)) != null && a.mo3027a(abstractC0623y, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1846a(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        C0208c m4507N = abstractC0224s.m4507N();
        if (abstractC0224s.mo4476l_()) {
            return false;
        }
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.mo3100a((AbstractC0244am) c0212g.f1433b);
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1772m(abstractC0623y) && (a = abstractC0623y.m4427a(m4507N)) != null && a.mo3100a((AbstractC0244am) abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m1810b(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.mo3025b(c0212g.f1433b);
        }
        C0208c m4507N = abstractC0224s.m4507N();
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1772m(abstractC0623y) && (a = abstractC0623y.m4427a(m4507N)) != null && a.mo3025b(abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m1800c(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        boolean z = false;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.mo4123g(c0212g.f1433b);
        }
        C0208c m4507N = abstractC0224s.m4507N();
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1772m(abstractC0623y) && (a = abstractC0623y.m4427a(m4507N)) != null) {
                    if (!a.mo4123g(abstractC0623y)) {
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
    public String m1794d(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        String mo4120j;
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            return c0212g.mo4120j(c0212g.f1433b);
        }
        C0208c m4507N = abstractC0224s.m4507N();
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1772m(abstractC0623y) && (a = abstractC0623y.m4427a(m4507N)) != null && a.mo4123g(abstractC0623y) && (mo4120j = a.mo4120j(abstractC0623y)) != null) {
                    return mo4120j;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public C1112u m1790e(AbstractC0224s abstractC0224s) {
        if (abstractC0224s instanceof C0212g) {
            C0212g c0212g = (C0212g) abstractC0224s;
            this.f5260bK.clear();
            if (c0212g.f1433b != null) {
                this.f5260bK.mo494a(c0212g.f1433b);
            }
            return this.f5260bK;
        }
        return this.f5261bL;
    }

    /* renamed from: f */
    public String m1787f(AbstractC0224s abstractC0224s) {
        AbstractC0224s a;
        C1112u m1790e = m1790e(abstractC0224s);
        C0208c m4507N = abstractC0224s.m4507N();
        String str = null;
        boolean z = false;
        Iterator it = m1790e.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (m1772m(abstractC0623y) && (a = abstractC0623y.m4427a(m4507N)) != null) {
                    if (a.mo4138B() != null && !a.mo4138B().mo3868b(abstractC0623y)) {
                        String m3914a = a.mo4138B().m3914a((AbstractC0244am) abstractC0623y, 4, false);
                        if (m3914a != null) {
                            str = m3914a;
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
    public boolean m1760t() {
        if (this.f5169aR == 0) {
            return false;
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (!abstractC0623y.f1644cE) {
                    continue;
                } else if (!m1772m(abstractC0623y)) {
                    return false;
                } else {
                    ArrayList N = abstractC0623y.mo3068N();
                    boolean z = false;
                    if (N != null) {
                        Iterator it2 = N.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0224s) it2.next()).mo3022e() == EnumC0226u.f1478d) {
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
    public boolean m1840a(EnumC0238ag enumC0238ag) {
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (m1772m(abstractC0623y) && m1839a(enumC0238ag, abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1839a(EnumC0238ag enumC0238ag, AbstractC0244am abstractC0244am) {
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
            if ((enumC0238ag == EnumC0238ag.attack || enumC0238ag == EnumC0238ag.move) && !LoggerMaybe.m1040a(this.f5258bG, 1000L)) {
                return true;
            }
            if (enumC0238ag == EnumC0238ag.newSelection) {
                if (LoggerMaybe.m1072A().f6239bx < 10) {
                    return false;
                }
                if (!LoggerMaybe.m1040a(this.f5259bH, 1000L)) {
                    return true;
                }
            }
            if (abstractC0623y.m2922a(enumC0238ag)) {
                if (enumC0238ag == EnumC0238ag.attack || enumC0238ag == EnumC0238ag.move) {
                    this.f5258bG = LoggerMaybe.m1052U();
                }
                if (enumC0238ag == EnumC0238ag.newSelection) {
                    this.f5259bH = LoggerMaybe.m1052U();
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void m1812b(float f, float f2, Point point) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!m1876B()) {
            if (m1072A.f6115bQ.quickRally && m1760t()) {
                m1814b(f, f2);
                return;
            }
            return;
        }
        C0749e m1757w = m1757w();
        m1757w.f4858h = true;
        m1757w.m2277a(f, f2);
        m1832a(m1757w);
        if (!m1840a(EnumC0238ag.move)) {
            m1072A.f6111bM.m2716b(C0631e.f4040f, 0.2f);
        }
        C0745e m2330a = m1072A.f6116bR.m2330a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4767aq = 8;
            m2330a.f4750W = 30.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 2.0f;
            m2330a.f4735H = 2.8f * m1803c();
            m2330a.f4734G = 1.6f * m1803c();
            m2330a.f4736I = true;
        }
        if (point != null) {
            Point m1731b = m1072A.f6121bW.m1731b(point.f224a, point.f225b);
            C0745e m2330a2 = m1072A.f6116bR.m2330a(m1731b.f224a, m1731b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2330a2 != null) {
                m2330a2.f4722o = true;
                m2330a2.f4767aq = 8;
                m2330a2.f4750W = 35.0f;
                m2330a2.f4751X = m2330a.f4750W;
                m2330a2.f4725s = true;
                m2330a2.f4733F = 2.0f;
                m2330a2.f4735H = 1.3f;
                m2330a2.f4734G = 0.6f;
            }
        }
    }

    /* renamed from: c */
    public void m1801c(float f, float f2, Point point) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f5117y && m1072A.f6115bQ.doubleClickToAttackMove && m1877A() && m1876B()) {
            m1795d(f, f2, point);
        } else {
            m1812b(f, f2, point);
        }
    }

    /* renamed from: d */
    public void m1795d(float f, float f2, Point point) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1757w = m1757w();
        m1757w.f4858h = true;
        m1757w.m2262b(f, f2);
        m1832a(m1757w);
        if (!m1840a(EnumC0238ag.move)) {
            m1072A.f6111bM.m2716b(C0631e.f4040f, 0.2f);
        }
        C0745e m2330a = m1072A.f6116bR.m2330a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4768ar = 17;
            m2330a.f4767aq = 2;
            m2330a.f4750W = 30.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 2.0f;
            m2330a.f4753aa = 1.0f;
            m2330a.f4735H = 1.9f * m1803c();
            m2330a.f4734G = 3.5f * m1803c();
            m2330a.f4736I = true;
        }
        if (point != null) {
            Point m1731b = m1072A.f6121bW.m1731b(point.f224a, point.f225b);
            C0745e m2330a2 = m1072A.f6116bR.m2330a(m1731b.f224a, m1731b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2330a2 != null) {
                m2330a2.f4722o = true;
                m2330a2.f4767aq = 9;
                m2330a2.f4750W = 35.0f;
                m2330a2.f4751X = m2330a.f4750W;
                m2330a2.f4725s = true;
                m2330a2.f4733F = 2.0f;
                m2330a2.f4735H = 1.3f;
                m2330a2.f4734G = 0.6f;
            }
        }
    }

    /* renamed from: u */
    public void m1759u() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1757w = m1757w();
        m1757w.m2250h();
        m1832a(m1757w);
        m1072A.f6111bM.m2716b(C0631e.f4040f, 0.2f);
    }

    /* renamed from: a */
    public void m1844a(AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, C0749e c0749e) {
        if (abstractC0224s instanceof C0342g) {
            C0342g c0342g = (C0342g) abstractC0224s;
            LoggerMaybe.m1072A();
        }
    }

    /* renamed from: b */
    public void m1809b(AbstractC0224s abstractC0224s, float f, float f2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        PointF pointF = new PointF(f, f2);
        C0749e m1757w = m1757w();
        if (!abstractC0224s.mo4134I()) {
            m1831a(m1757w, abstractC0224s);
        } else {
            m1830a(m1757w, abstractC0224s, false);
        }
        m1757w.m2271a(abstractC0224s.m4507N(), pointF, (AbstractC0244am) null);
        m1844a(abstractC0224s, pointF, (AbstractC0244am) null, m1757w);
        if (!abstractC0224s.mo3028a(f, f2)) {
            m1072A.f6111bM.m2716b(C0631e.f4040f, 0.2f);
            C0745e m2330a = m1072A.f6116bR.m2330a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2330a != null) {
                m2330a.f4767aq = 9;
                m2330a.f4750W = 60.0f;
                m2330a.f4751X = m2330a.f4750W;
                m2330a.f4725s = true;
                m2330a.f4733F = 2.0f;
                m2330a.f4735H = 3.8f * m1803c();
                m2330a.f4734G = 2.0f * m1803c();
                m2330a.f4736I = true;
                m2330a.f4753aa = 1.5f;
            }
        }
    }

    /* renamed from: b */
    public void m1808b(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1757w = m1757w();
        m1832a(m1757w);
        m1757w.m2256d(abstractC0244am);
        m1072A.f6111bM.m2716b(C0631e.f4040f, 0.2f);
        C0745e m2330a = m1072A.f6116bR.m2330a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4767aq = 12;
            m2330a.f4750W = 25.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 2.0f;
            m2330a.f4736I = true;
            m2330a.f4735H = 1.2f * m1803c();
            m2330a.f4734G = 1.8f * m1803c();
        }
    }

    /* renamed from: b */
    public void m1814b(float f, float f2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1758v = m1758v();
        m1832a(m1758v);
        m1758v.m2274a(new PointF(f, f2));
        m1072A.f6111bM.m2716b(C0631e.f4040f, 0.2f);
        C0745e m2330a = m1072A.f6116bR.m2330a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4767aq = 8;
            m2330a.f4750W = 65.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 2.0f;
            m2330a.f4736I = true;
            m2330a.f4753aa = 2.0f;
            m2330a.f4735H = 2.0f * m1803c();
            m2330a.f4734G = 1.5f * m1803c();
        }
    }

    /* renamed from: a */
    public void m1860a(float f, float f2, Point point, C0215j c0215j) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!m1072A.f6115bQ.showMapPingsOnBattlefield && !m1072A.f6115bQ.showMapPingsOnMinimap) {
            m1806b("Cannot send map ping, you have disabled both battlefield and minimap pings in your settings");
            return;
        }
        m1757w().m2271a(c0215j.m4507N(), new PointF(f, f2), (AbstractC0244am) null);
        if (this.f5188bI == 0 || this.f5188bI + 15000 < System.currentTimeMillis()) {
            this.f5188bI = System.currentTimeMillis();
            m1072A.f6122bX.m1431l("MAP PING - [i:" + c0215j.m4519K() + "]");
        }
    }

    /* renamed from: a */
    public void m1858a(float f, float f2, AbstractC0197n abstractC0197n, C0215j c0215j) {
        C0745e m2330a;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        int ordinal = 7 + c0215j.f1443a.ordinal();
        if (!m1072A.f6115bQ.showMapPingsOnBattlefield && !m1072A.f6115bQ.showMapPingsOnMinimap) {
            if (!this.f5189bJ && !m1072A.f6126cb.m2411h()) {
                this.f5189bJ = true;
                this.f5113e.m1750a(null, "[WARNING: A player send a map ping, but you have disabled both battlefield and minimap pings in your settings]");
                return;
            }
            return;
        }
        if (m1072A.f6115bQ.showMapPingsOnBattlefield) {
            C0745e m2330a2 = m1072A.f6116bR.m2330a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2330a2 != null) {
                m2330a2.f4768ar = 9;
                m2330a2.f4767aq = 6;
                m2330a2.f4733F = 0.7f;
                m2330a2.f4750W = 490.0f;
                m2330a2.f4751X = m2330a2.f4750W;
                m2330a2.f4725s = true;
                m2330a2.f4747T = 6.0f;
                m2330a2.f4748U = 60.0f;
                m2330a2.f4738K -= m2330a2.f4747T;
                m2330a2.f4735H = 2.0f * 1.0f;
                m2330a2.f4734G = m2330a2.f4735H;
                m2330a2.f4791ap = -0.5f;
                m2330a2.f4736I = true;
                if (abstractC0197n != null) {
                    m2330a2.f4730y = abstractC0197n.m4657H();
                    if (LoggerMaybe.m997as()) {
                        m2330a2.f4788C = new LightingColorFilter(m2330a2.f4730y, 0);
                    }
                }
            }
            if (ordinal != -1 && (m2330a = m1072A.f6116bR.m2330a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e)) != null) {
                m2330a.f4768ar = 9;
                m2330a.f4767aq = ordinal;
                m2330a.f4750W = 490.0f;
                m2330a.f4751X = m2330a.f4750W;
                m2330a.f4725s = true;
                m2330a.f4733F = 1.2f;
                m2330a.f4747T = 6.0f;
                m2330a.f4748U = 60.0f;
                m2330a.f4738K -= m2330a.f4747T;
                m2330a.f4735H = 2.0f * 1.0f;
                m2330a.f4734G = m2330a.f4735H;
                m2330a.f4791ap = -0.7f;
                m2330a.f4736I = true;
            }
        }
        if (m1072A.f6115bQ.showMapPingsOnMinimap) {
            Point m1731b = m1072A.f6121bW.m1731b(f, f2);
            C0745e m2330a3 = m1072A.f6116bR.m2330a(m1731b.f224a, m1731b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2330a3 != null) {
                m2330a3.f4722o = true;
                m2330a3.f4768ar = 9;
                m2330a3.f4767aq = 6;
                m2330a3.f4733F = 0.8f;
                m2330a3.f4750W = 470.0f;
                m2330a3.f4751X = m2330a3.f4750W;
                m2330a3.f4725s = true;
                m2330a3.f4738K -= 2.0f;
                m2330a3.f4747T = 2.0f;
                m2330a3.f4748U = 60.0f;
                m2330a3.f4791ap = -0.5f;
                if (abstractC0197n != null) {
                    m2330a3.f4730y = abstractC0197n.m4657H();
                    if (LoggerMaybe.m997as()) {
                        m2330a3.f4788C = new LightingColorFilter(m2330a3.f4730y, 0);
                    }
                }
                m2330a3.f4735H = 1.0f;
                m2330a3.f4734G = 1.0f;
            }
            C0745e m2330a4 = m1072A.f6116bR.m2330a(m1731b.f224a, m1731b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2330a4 != null) {
                m2330a4.f4722o = true;
                m2330a4.f4768ar = 9;
                m2330a4.f4767aq = ordinal;
                m2330a4.f4750W = 470.0f;
                m2330a4.f4751X = m2330a4.f4750W;
                m2330a4.f4725s = true;
                m2330a4.f4733F = 0.8f;
                m2330a4.f4738K -= 2.0f;
                m2330a4.f4747T = 2.0f;
                m2330a4.f4748U = 60.0f;
                if (abstractC0197n != null) {
                }
                m2330a4.f4735H = 1.0f;
                m2330a4.f4734G = 1.0f;
                m2330a4.f4791ap = -0.7f;
            }
        }
    }

    /* renamed from: v */
    public C0749e m1758v() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m2367b = m1072A.f6130cf.m2367b(m1072A.f6099bs);
        if (m1072A.f6122bX.lock1) {
            m2367b.f4848p = m1072A.f6099bs;
        }
        return m2367b;
    }

    /* renamed from: w */
    public C0749e m1757w() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1758v = m1758v();
        if (m1826a(m1072A)) {
            m1758v.f4855e = true;
        }
        return m1758v;
    }

    /* renamed from: c */
    public void m1799c(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1757w = m1757w();
        m1757w.m2269a(abstractC0244am);
        m1832a(m1757w);
        if (!m1840a(EnumC0238ag.attack)) {
            m1072A.f6111bM.m2716b(C0631e.f4038d, 1.0f);
        }
        C0745e m2330a = m1072A.f6116bR.m2330a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4718b = abstractC0244am;
            m2330a.f4737J = 0.0f;
            m2330a.f4738K = 0.0f;
            m2330a.f4739L = 0.0f;
            m2330a.f4767aq = 9;
            m2330a.f4750W = 35.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 1.5f;
            m2330a.f4736I = true;
            m2330a.f4753aa = 0.8f;
            m2330a.f4735H = 1.9f * m1803c();
            m2330a.f4734G = 3.3f * m1803c();
        }
        C0745e m2330a2 = m1072A.f6116bR.m2330a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a2 != null) {
            m2330a2.f4718b = abstractC0244am;
            m2330a2.f4737J = 0.0f;
            m2330a2.f4738K = 0.0f;
            m2330a2.f4739L = 0.0f;
            m2330a2.f4768ar = 17;
            m2330a2.f4767aq = 0;
            m2330a2.f4750W = 25.0f;
            m2330a2.f4751X = m2330a2.f4750W;
            m2330a2.f4725s = true;
            m2330a2.f4733F = 1.0f;
            m2330a2.f4736I = true;
            m2330a2.f4753aa = 0.8f;
            m2330a2.f4735H = 2.2f * m1803c();
            m2330a2.f4734G = 1.1f * m1803c();
        }
    }

    /* renamed from: d */
    public void m1793d(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1757w = m1757w();
        m1832a(m1757w);
        m1757w.m2261b(abstractC0244am);
        m1072A.f6111bM.m2716b(C0631e.f4038d, 1.0f);
        C0745e m2330a = m1072A.f6116bR.m2330a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4767aq = 10;
            m2330a.f4750W = 35.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 2.0f;
            m2330a.f4736I = true;
            m2330a.f4735H = 1.5f * m1803c();
            m2330a.f4734G = 2.2f * m1803c();
        }
    }

    /* renamed from: e */
    public void m1789e(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1757w = m1757w();
        m1832a(m1757w);
        m1757w.m2258c(abstractC0244am);
        m1072A.f6111bM.m2716b(C0631e.f4038d, 1.0f);
        C0745e m2330a = m1072A.f6116bR.m2330a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4768ar = 17;
            m2330a.f4767aq = 1;
            m2330a.f4750W = 40.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 1.0f;
            m2330a.f4736I = true;
            m2330a.f4753aa = 0.0f;
            m2330a.f4735H = 1.2f * m1803c();
            m2330a.f4734G = 1.9f * m1803c();
        }
    }

    /* renamed from: a */
    public void m1864a(float f, float f2, float f3) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6111bM.m2716b(C0631e.f4046l, 0.2f);
        C0745e m2330a = m1072A.f6116bR.m2330a(f, f2, f3, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4768ar = 9;
            m2330a.f4767aq = 14;
            m2330a.f4750W = 10.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 2.0f;
            m2330a.f4753aa = 0.0f;
            m2330a.f4735H = 1.1f * m1803c();
            m2330a.f4734G = 1.6f * m1803c();
            m2330a.f4736I = true;
        }
    }

    /* renamed from: a */
    public void m1859a(float f, float f2, Point point, boolean z) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1757w = m1757w();
        m1832a(m1757w);
        m1757w.m2259c(f, f2);
        if (!z) {
            m1757w.f4855e = true;
        }
        m1072A.f6111bM.m2716b(C0631e.f4040f, 0.2f);
        C0745e m2330a = m1072A.f6116bR.m2330a(f, f2, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4768ar = 17;
            m2330a.f4767aq = 0;
            m2330a.f4750W = 40.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 2.0f;
            m2330a.f4753aa = 8.0f;
            m2330a.f4735H = 1.1f * m1803c();
            m2330a.f4734G = 1.9f * m1803c();
            m2330a.f4736I = true;
        }
        if (point != null) {
            Point m1731b = m1072A.f6121bW.m1731b(point.f224a, point.f225b);
            C0745e m2330a2 = m1072A.f6116bR.m2330a(m1731b.f224a, m1731b.f225b, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
            if (m2330a2 != null) {
                m2330a2.f4722o = true;
                m2330a2.f4767aq = 9;
                m2330a2.f4750W = 35.0f;
                m2330a2.f4751X = m2330a.f4750W;
                m2330a2.f4725s = true;
                m2330a2.f4733F = 2.0f;
                m2330a2.f4735H = 1.3f;
                m2330a2.f4734G = 0.6f;
            }
        }
    }

    /* renamed from: f */
    public void m1786f(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1757w = m1757w();
        m1832a(m1757w);
        m1757w.m2254e(abstractC0244am);
        m1072A.f6111bM.m2716b(C0631e.f4038d, 1.0f);
        C0745e m2330a = m1072A.f6116bR.m2330a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4767aq = 11;
            m2330a.f4750W = 25.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 2.0f;
            m2330a.f4736I = true;
            m2330a.f4735H = 1.8f * m1803c();
            m2330a.f4734G = 1.6f * m1803c();
        }
    }

    /* renamed from: g */
    public void m1784g(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m1757w = m1757w();
        m1832a(m1757w);
        m1757w.m2252f(abstractC0244am);
        m1072A.f6111bM.m2716b(C0631e.f4038d, 1.0f);
        C0745e m2330a = m1072A.f6116bR.m2330a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, EnumC0744d.f4707a, true, EnumC0748h.f4836e);
        if (m2330a != null) {
            m2330a.f4767aq = 11;
            m2330a.f4750W = 25.0f;
            m2330a.f4751X = m2330a.f4750W;
            m2330a.f4725s = true;
            m2330a.f4733F = 2.0f;
            m2330a.f4736I = true;
            m2330a.f4735H = 1.8f * m1803c();
            m2330a.f4734G = 1.6f * m1803c();
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
    public com.corrodinggames.rts.game.units.AbstractC0244am m1857a(float r7, float r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p037f.C0797f.m1857a(float, float, boolean):com.corrodinggames.rts.game.units.am");
    }

    /* renamed from: b */
    public void m1813b(float f, float f2, float f3) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0244am) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) abstractC1120w;
                if (!abstractC0244am.f1607bT && abstractC0244am.f1651cL == null && abstractC0244am.f1609bV == m1072A.f6099bs && C0758f.m2157a(f, f2, abstractC0244am.f6957el, abstractC0244am.f6958em - abstractC0244am.f6959en) < f3 * f3) {
                    m1778j(abstractC0244am);
                }
            }
        }
    }

    /* renamed from: h */
    public void m1782h(AbstractC0244am abstractC0244am) {
        this.f5121Q = null;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0244am) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) abstractC1120w;
                if (!abstractC0244am2.f1607bT && abstractC0244am2.f1651cL == null && abstractC0244am2.f1609bV == abstractC0244am.f1609bV && abstractC0244am2.mo3246p_() && C0760a.m2010a(abstractC0244am2, abstractC0244am) && (abstractC0244am2.f1609bV == m1072A.f6099bs || abstractC0244am2.m4354ce())) {
                    m1778j(abstractC0244am2);
                }
            }
        }
    }

    /* renamed from: x */
    public void m1756x() {
        this.f5121Q = null;
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0244am) {
                ((AbstractC0244am) abstractC1120w).f1644cE = false;
            }
        }
        this.f5169aR = 0;
        this.f5123S++;
        this.f5261bL.clear();
        m1868J();
    }

    /* renamed from: i */
    public boolean m1780i(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo1713t()) {
            return false;
        }
        AbstractC0197n abstractC0197n = LoggerMaybe.m1072A().f6099bs;
        if (abstractC0197n != null && abstractC0197n.m4599c(abstractC0244am.f1609bV) && !abstractC0244am.m4353cf()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean m1778j(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1644cE) {
            return true;
        }
        if (!m1780i(abstractC0244am)) {
            return false;
        }
        m1776k(abstractC0244am);
        m1839a(EnumC0238ag.newSelection, abstractC0244am);
        return true;
    }

    /* renamed from: k */
    public void m1776k(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1644cE || !m1780i(abstractC0244am)) {
            return;
        }
        abstractC0244am.f1644cE = true;
        abstractC0244am.f1645cF = LoggerMaybe.m1072A().f6104bA;
        this.f5169aR++;
        if (!(abstractC0244am instanceof C0555h)) {
            f5190bM = abstractC0244am;
        }
        this.f5123S++;
        this.f5261bL.mo494a(abstractC0244am);
        m1868J();
    }

    /* renamed from: y */
    public static C0824b m1755y() {
        InterfaceC0303as mo5649r;
        AbstractC0244am abstractC0244am = f5190bM;
        if (abstractC0244am == null || (mo5649r = abstractC0244am.mo5649r()) == null || !(mo5649r instanceof C0453l)) {
            return null;
        }
        return ((C0453l) mo5649r).f2919I;
    }

    /* renamed from: a */
    public void m1837a(AbstractC0244am abstractC0244am, boolean z) {
        if (!z) {
            m1778j(abstractC0244am);
        } else if (abstractC0244am.f1644cE) {
            m1774l(abstractC0244am);
        } else {
            m1778j(abstractC0244am);
        }
    }

    /* renamed from: l */
    public void m1774l(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1644cE) {
            abstractC0244am.f1644cE = false;
            this.f5169aR--;
            this.f5261bL.remove(abstractC0244am);
            this.f5123S++;
            m1868J();
        }
    }

    /* renamed from: z */
    public boolean m1754z() {
        if (m1767p() == 0) {
            return false;
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1772m(abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: A */
    public boolean m1877A() {
        if (m1767p() == 0) {
            return false;
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && m1772m(abstractC0623y) && abstractC0623y.mo2979l()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: B */
    public boolean m1876B() {
        if (m1767p() == 0) {
            return false;
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && abstractC0623y.m2879aS() && m1772m(abstractC0623y)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public boolean m1875C() {
        if (m1767p() == 0) {
            return true;
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE && !abstractC0623y.mo2981i()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: m */
    public boolean m1772m(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (abstractC0244am.m4361cU()) {
            return false;
        }
        if (abstractC0244am.f1609bV == m1072A.f6099bs) {
            return true;
        }
        if ((abstractC0244am.f1609bV != null && abstractC0244am.f1609bV.m4615b(m1072A.f6099bs)) || m1072A.f6100bv || m1072A.f6126cb.m2411h()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m1770n(AbstractC0244am abstractC0244am) {
        if (m1767p() == 0) {
            return false;
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE && abstractC0623y != abstractC0244am && m1772m(abstractC0623y) && abstractC0244am.m4335d(abstractC0623y, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1768o(AbstractC0244am abstractC0244am) {
        if (m1767p() == 0) {
            return false;
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE && abstractC0623y != abstractC0244am && m1772m(abstractC0623y) && abstractC0623y.m4335d(abstractC0244am, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public boolean m1766p(AbstractC0244am abstractC0244am) {
        if (m1767p() == 0) {
            return false;
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE && abstractC0623y != abstractC0244am && m1772m(abstractC0623y) && abstractC0623y.mo3087a(abstractC0244am)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public boolean m1764q(AbstractC0244am abstractC0244am) {
        if (m1767p() == 0) {
            return false;
        }
        Iterator it = this.f5261bL.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE && abstractC0623y != abstractC0244am && m1772m(abstractC0623y) && C0248aq.m4287a(abstractC0623y, abstractC0244am)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    public void m1874D() {
    }

    /* renamed from: E */
    public boolean m1873E() {
        return false;
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        this.f5112d.mo2292a(streamWriter);
        streamWriter.mo1355c(1);
        streamWriter.WriteInteger(this.f5127X);
    }

    /* renamed from: a */
    public void m1827a(Reader reader, boolean z) {
        this.f5112d.m2004a(reader, z);
        if (reader.m1289d() >= 1) {
            this.f5127X = reader.ReadInt();
        }
    }

    /* renamed from: a */
    public void m1834a(AbstractC0623y abstractC0623y, float f, float f2, float f3, float f4, boolean z, ArrayList arrayList, AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float f5 = abstractC0623y.f6957el;
        float f6 = abstractC0623y.f6958em;
        AbstractC0623y abstractC0623y2 = null;
        AbstractC0244am m4334d = AbstractC0244am.m4334d(abstractC0623y.mo5649r());
        if (!(m4334d instanceof AbstractC0623y)) {
            LoggerMaybe.LogDebug2("buildingBlockoutUnit not OrderableUnit is: " + m4334d.getClass().getName());
        } else {
            abstractC0623y2 = (AbstractC0623y) m4334d;
        }
        boolean z2 = false;
        m1072A.f6110bL.m4822b(f, f2);
        float f7 = m1072A.f6110bL.f801T;
        float f8 = m1072A.f6110bL.f802U;
        float cX = f7 + abstractC0623y.mo3292cX();
        float cY = f8 + abstractC0623y.mo3291cY();
        float cX2 = f3 + abstractC0623y.mo3292cX();
        float cY2 = f4 + abstractC0623y.mo3291cY();
        float m2105b = C0758f.m2105b(cX, cY, cX2, cY2);
        float m2071d = C0758f.m2071d(cX, cY, cX2, cY2);
        int i = 0;
        float f9 = 0.0f;
        while (true) {
            float f10 = f9;
            if (f10 <= m2105b) {
                m1072A.f6110bL.m4822b((cX + (C0758f.m2040i(m2071d) * f10)) - abstractC0623y.mo3292cX(), (cY + (C0758f.m2045h(m2071d) * f10)) - abstractC0623y.mo3291cY());
                float f11 = m1072A.f6110bL.f801T;
                float f12 = m1072A.f6110bL.f802U;
                float cX3 = f11 + abstractC0623y.mo3292cX();
                float cY3 = f12 + abstractC0623y.mo3291cY();
                abstractC0623y.f6957el = cX3;
                abstractC0623y.f6958em = cY3;
                if ((!z2 || abstractC0623y2 == null || (!C0741a.m2351a(abstractC0623y, abstractC0623y2) && !abstractC0623y.m2742r(abstractC0623y2))) && 0 == 0) {
                    boolean m1833a = m1833a(abstractC0623y, cX3, cY3, z, false, abstractC0244am);
                    if (arrayList != null && m1833a) {
                        arrayList.add(new PointF(cX3, cY3));
                    }
                    if (m1833a) {
                        i++;
                        if (i >= 29) {
                            return;
                        }
                    }
                    z2 = true;
                    if (abstractC0623y2 != null) {
                        abstractC0623y2.f6957el = cX3;
                        abstractC0623y2.f6958em = cY3;
                    }
                }
                f9 = f10 + m1072A.f6110bL.f787p;
            } else {
                abstractC0623y.f6957el = f5;
                abstractC0623y.f6958em = f6;
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean m1833a(AbstractC0623y abstractC0623y, float f, float f2, boolean z, boolean z2, AbstractC0244am abstractC0244am) {
        boolean z3;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float f3 = abstractC0623y.f6957el;
        float f4 = abstractC0623y.f6958em;
        abstractC0623y.f6957el = f;
        abstractC0623y.f6958em = f2;
        boolean m2793c = abstractC0623y.m2793c(m1072A.f6099bs);
        if (C0741a.m2352a(m1072A.f6099bs, abstractC0623y, this.f5127X)) {
            m2793c = false;
        }
        if (abstractC0244am != null && abstractC0244am != null && (abstractC0244am instanceof AbstractC0623y)) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
            if (!abstractC0623y2.m2880aR()) {
                float m2157a = C0758f.m2157a(abstractC0623y2.f6957el, abstractC0623y2.f6958em, abstractC0623y.f6957el, abstractC0623y.f6958em);
                float f5 = abstractC0623y2.mo3082f(abstractC0623y.mo5649r());
                if (f5 > 800000.0f) {
                    z3 = true;
                } else {
                    z3 = m2157a <= f5 * f5;
                }
                if (!z3) {
                    m2793c = false;
                }
            }
        }
        boolean z4 = abstractC0623y.f1627cn;
        abstractC0623y.f1627cn = true;
        abstractC0623y.f1630cq = m2793c;
        abstractC0623y.f1631cr = !m2793c;
        abstractC0623y.f1629cp = z2;
        if (z) {
            m1072A.f6113bO.mo135k();
            m1072A.m1056Q();
            abstractC0623y.mo2284d(0.0f);
            abstractC0623y.mo2285c(0.0f);
            abstractC0623y.mo2294a(0.0f, false);
            float mo2978m = abstractC0623y.mo2978m();
            if (mo2978m > 30.0f) {
                C1117y.m465a((AbstractC0244am) abstractC0623y, mo2978m, true, true);
            }
            abstractC0623y.m4358ca();
            if (!z2) {
                abstractC0623y.m2953N(-1);
            }
            m1072A.f6113bO.mo134l();
        }
        abstractC0623y.f6957el = f3;
        abstractC0623y.f6958em = f4;
        abstractC0623y.f1629cp = false;
        abstractC0623y.f1627cn = z4;
        return m2793c;
    }

    /* renamed from: F */
    public void m1872F() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6267dp = true;
        if (m1072A.f6102by < 1500 && m1072A.f6117bS.f5111c != null) {
            m1072A.f6268dq = true;
        }
        this.f5112d.m1972q();
    }

    /* renamed from: G */
    public void m1871G() {
        LoggerMaybe.m1072A().f6270ds = true;
        this.f5112d.m1971r();
    }

    /* renamed from: H */
    public void m1870H() {
        m1777k();
        this.f5125U = null;
        this.f5126W = this.f5202k;
    }

    /* renamed from: a */
    public void m1820a(String str, Rect rect, Paint paint, Paint paint2) {
        String[] m2078c;
        Paint paint3;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        int i = 0;
        for (String str2 : C0758f.m2078c(str, '\n')) {
            if (i == 0) {
                paint3 = paint;
            } else {
                paint3 = paint2;
            }
            Paint paint4 = paint3;
            int m1884a = C0795d.m1884a(paint4);
            m1072A.f6113bO.mo181a(str2, rect.m5357d(), rect.f231b + (m1884a / 2) + (i * m1884a), paint4);
            i++;
        }
    }

    /* renamed from: a */
    public boolean m1842a(AbstractC0224s abstractC0224s, boolean z, AbstractC0244am abstractC0244am, boolean z2, boolean z3) {
        return m1841a(abstractC0224s, z, abstractC0244am, z2, false, -1.0f, z3);
    }

    /* renamed from: a */
    public boolean m1841a(AbstractC0224s abstractC0224s, boolean z, AbstractC0244am abstractC0244am, boolean z2, boolean z3, float f, boolean z4) {
        int i;
        int m5435a;
        Paint paint;
        Paint paint2;
        int m5435a2;
        int m5435a3;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        String m1794d;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        String str = null;
        boolean z5 = false;
        boolean z6 = true;
        if (LoggerMaybe.m994av()) {
            z6 = false;
        }
        if (abstractC0244am != null && abstractC0224s.mo4118l(abstractC0244am)) {
            z6 = false;
        }
        if (z4) {
            z6 = false;
        }
        boolean z7 = false;
        boolean z8 = false;
        if (C0760a.m2014a(abstractC0224s)) {
            z7 = true;
            z8 = true;
        }
        if (m1800c(abstractC0224s)) {
            z7 = true;
            str = this.f5176bt;
            String m1794d2 = m1794d(abstractC0224s);
            if (m1794d2 != null) {
                str = m1794d2;
            }
        }
        if (!z7 && z2 && (m1794d = m1794d(abstractC0224s)) != null) {
            str = m1794d;
        }
        if (str == null) {
            float m1999b = this.f5112d.m1999b(abstractC0224s);
            if (m1999b > 0.0f) {
                str = C0758f.m2050g(m1999b / 1000.0f);
            }
        }
        String m1787f = m1787f(abstractC0224s);
        boolean z9 = m1787f != null;
        if (m1787f != null) {
        }
        if (z2 && str == null && m1787f != null) {
            str = this.f5177bu.m4011b();
        }
        C0813u c0813u = new C0813u();
        c0813u.f5379d = this.f5165aK;
        c0813u.f5380e = this.f5166aL;
        C0930ag c0930ag = null;
        if (z9) {
            c0930ag = this.f5167aM;
        }
        c0813u.m1702a(true);
        abstractC0224s.mo4501a(abstractC0244am, c0813u, null, c0930ag);
        if (str != null) {
            c0813u.m1703a("\n" + str, this.f5167aM);
        }
        c0813u.m1702a(false);
        abstractC0224s.mo4502a(abstractC0244am, c0813u);
        if (z8) {
            c0813u.m1701b();
            c0813u.m1703a(this.f5175bs, this.f5166aL);
        }
        this.f5243bh.f230a = 20;
        int i2 = (int) ((m1072A.f6134ck - m1072A.f6138cp) - 20);
        this.f5243bh.f232c = i2;
        boolean z10 = m1072A.f6115bQ.showActionInfoHoverNearMouse;
        if (z) {
            i = (int) (m1072A.f6137co - 40.0f);
        } else {
            i = 40;
        }
        if (LoggerMaybe.m996at() && f > 0.0f) {
            i = (int) f;
            z5 = true;
        }
        if (LoggerMaybe.m995au() && z10 && z3) {
            i = (int) (m1072A.m1010af() - 40.0f);
        }
        this.f5243bh.f231b = i;
        this.f5243bh.f233d = this.f5243bh.f231b;
        boolean z11 = true;
        boolean z12 = true;
        int i3 = 7;
        if (LoggerMaybe.m995au()) {
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
        if (!LoggerMaybe.m995au() || z || !z10 || !z3) {
        }
        if (str != null) {
        }
        C0930ag c0930ag2 = this.f5166aL;
        if (z2) {
            C0930ag c0930ag3 = this.f5167aM;
        }
        C0818z m1710a = c0813u.m1710a(this.f5243bh.m5362b(), z11);
        float m5357d = this.f5243bh.m5357d();
        this.f5243bh.f230a = (int) (m5357d - (m1710a.f5394b.m5362b() / 2));
        this.f5243bh.f232c = (int) (m5357d + (m1710a.f5394b.m5362b() / 2));
        this.f5243bh.f233d = this.f5243bh.f231b + m1710a.f5394b.m5358c();
        if (z11) {
            this.f5243bh.f230a = (int) (rect3.f230a - (i3 * m1072A.f6132ci));
            this.f5243bh.f232c = (int) (rect4.f232c + (i3 * m1072A.f6132ci));
        }
        if (z12) {
            this.f5243bh.m5365a((int) ((i2 - (7.0f * m1072A.f6132ci)) - this.f5243bh.f232c), 0);
        }
        this.f5244bi.m5363a(this.f5243bh);
        this.f5244bi.f231b -= 20;
        this.f5244bi.f233d += 15;
        int i4 = -1;
        if (abstractC0244am != null) {
            i4 = abstractC0224s.mo3024b(abstractC0244am, true);
        }
        if (abstractC0244am != null && z6 && i4 != -1) {
            this.f5244bi.f233d = (int) (rect2.f233d + (55.0f * m1072A.f6132ci));
        }
        if (this.f5244bi.f233d > m1072A.f6135cl) {
            int i5 = (int) (m1072A.f6135cl - this.f5244bi.f233d);
            this.f5243bh.m5365a(0, i5);
            this.f5244bi.m5365a(0, i5);
        }
        InterfaceC0303as mo5648i = abstractC0224s.mo5648i();
        if (!abstractC0224s.mo4487D()) {
            mo5648i = null;
        }
        if (mo5648i != null && abstractC0244am != null) {
            this.f5244bi.f231b = (int) (rect.f231b - (40.0f * m1072A.f6132ci));
        }
        if (z5) {
            int i6 = -this.f5243bh.m5358c();
            this.f5243bh.m5365a(0, i6);
            this.f5244bi.m5365a(0, i6);
        }
        if (0 != 0) {
            int i7 = (int) ((m1072A.f6135cl - 30.0f) - this.f5244bi.f233d);
            this.f5244bi.m5365a(0, i7);
            this.f5243bh.m5365a(0, i7);
        }
        if (this.f5244bi.f231b < 0) {
            int i8 = 0 - this.f5244bi.f231b;
            this.f5244bi.m5365a(0, i8);
            this.f5243bh.m5365a(0, i8);
        }
        if (this.f5244bi.f233d > m1072A.f6135cl - 20.0f) {
            int i9 = (int) ((m1072A.f6135cl - 20.0f) - this.f5244bi.f233d);
            this.f5244bi.m5365a(0, i9);
            this.f5243bh.m5365a(0, i9);
        }
        m1072A.f6113bO.mo162b(this.f5244bi, this.f5164aJ);
        m1072A.f6113bO.mo162b(this.f5244bi, this.f5160aF);
        if (z7) {
        }
        if (mo5648i != null && abstractC0244am != null) {
            EnumC0249ar.m4283a(mo5648i, this.f5244bi.m5357d(), this.f5244bi.f231b + (22.0f * m1072A.f6132ci), this.f5124T, 0.0f, abstractC0244am.f1609bV, 30.0f * m1072A.f6132ci, 100.0f * m1072A.f6132ci, false, false, abstractC0224s.mo4485t(), null);
        }
        m1710a.m1694a(this.f5243bh.m5357d(), this.f5243bh.f231b);
        if (abstractC0244am != null && i4 != -1 && z6) {
            float f2 = m1072A.f6132ci * 0.5f;
            int i10 = (int) (60.0f * f2);
            float m1885b = C0794c.m1885b(abstractC0244am, abstractC0224s, true);
            if (!z7 || i4 > 0) {
                this.f5159aE.m5398b(-16777216);
                if (m1885b != 0.0f) {
                    float m2106b = C0758f.m2106b((C0758f.m2085c(m1885b) * 0.5f) - 0.4f, 0.0f, 1.0f);
                    if (m1885b > 0.0f) {
                        m5435a = Color.m5435a(110, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30);
                    } else {
                        m5435a = Color.m5435a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30, 30);
                    }
                    C0758f.m2150a(m5435a, this.f5159aE.m5386e(), m2106b);
                }
                float m1879b = (this.f5244bi.f233d - ((65.0f * f2) / 2.0f)) + (C0795d.m1879b(this.f5159aE) / 2);
                if (m1885b > 0.5d) {
                    m1879b += 1.0f;
                }
                if (m1885b < -0.5d) {
                    m1879b -= 1.0f;
                }
                m1072A.f6113bO.mo181a(VariableScope.nullOrMissingString + i4, this.f5244bi.m5357d(), m1879b, this.f5159aE);
            }
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = !z7 && m1843a(abstractC0224s, true);
            boolean z16 = i4 > 0 && abstractC0224s.mo4125d(abstractC0244am, true);
            int m5357d2 = (int) (this.f5244bi.m5357d() + (60.0f * f2));
            int i11 = (int) (this.f5244bi.f233d - (65.0f * f2));
            this.f5246bk.m5364a(m5357d2, i11, m5357d2 + i10, i11 + i10);
            if (z15) {
                paint = this.f5173aZ;
            } else {
                paint = this.f5174ba;
            }
            if (m1885b > 0.0f) {
                float m2106b2 = C0758f.m2106b((C0758f.m2085c(m1885b) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (m1885b > 0.0f) {
                    m5435a3 = Color.m5435a(110, 210, 210, 210);
                } else {
                    m5435a3 = Color.m5435a(110, 210, 110, 110);
                }
                int m2150a = C0758f.m2150a(m5435a3, paint.m5386e(), m2106b2);
                paint = this.f5248bm;
                paint.m5398b(m2150a);
            }
            if (m1885b > 0.5d) {
                this.f5246bk.m5365a(0, 1);
            }
            m1072A.f6113bO.mo197a(this.f5237bb, this.f5246bk.f230a, this.f5246bk.f231b, paint, 0.0f, f2);
            C0758f.m2143a(this.f5246bk, this.f5246bk.m5362b() * 0.8f);
            if (this.f5226O && !this.f5225N && !z8 && this.f5246bk.m5361b((int) this.f5209s, (int) this.f5210t)) {
                this.f5226O = false;
                z13 = true;
            }
            int m5357d3 = (int) ((this.f5244bi.m5357d() - i10) - (60.0f * f2));
            int i12 = (int) (this.f5244bi.f233d - (65.0f * f2));
            this.f5246bk.m5364a(m5357d3, i12, m5357d3 + i10, i12 + i10);
            if (z16) {
                paint2 = this.f5173aZ;
            } else {
                paint2 = this.f5174ba;
            }
            if (m1885b < 0.0f) {
                float m2106b3 = C0758f.m2106b((C0758f.m2085c(m1885b) * 0.7f) - 0.3f, 0.0f, 1.0f);
                if (m1885b > 0.0f) {
                    m5435a2 = Color.m5435a(110, 210, 210, 210);
                } else {
                    m5435a2 = Color.m5435a(110, 210, 110, 110);
                }
                int m2150a2 = C0758f.m2150a(m5435a2, paint2.m5386e(), m2106b3);
                paint2 = this.f5248bm;
                paint2.m5398b(m2150a2);
            }
            if (m1885b < -0.5d) {
                this.f5246bk.m5365a(0, 1);
            }
            m1072A.f6113bO.mo197a(this.f5238bc, this.f5246bk.f230a, this.f5246bk.f231b, paint2, 0.0f, f2);
            C0758f.m2143a(this.f5246bk, this.f5246bk.m5362b() * 0.8f);
            if (this.f5226O && !this.f5225N && this.f5246bk.m5361b((int) this.f5209s, (int) this.f5210t)) {
                this.f5226O = false;
                z14 = true;
            }
            int i13 = 1;
            if ((z13 || z14) && abstractC0224s.mo3019g()) {
                if (m1826a(m1072A)) {
                    i13 = 5;
                }
                if (m1807b(m1072A)) {
                    i13 = 10;
                }
            }
            if (z13) {
                if (abstractC0224s.mo3019g() && m1072A.f6099bs.m4551v() <= m1072A.f6099bs.m4552u()) {
                    m1806b(this.f5112d.f4947an);
                }
                if (z15) {
                    m1072A.f6111bM.m2716b(C0631e.f4042h, 0.5f);
                    C0794c.m1886a(abstractC0244am, abstractC0224s, false, true);
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    C0749e m1758v = m1758v();
                    if (m1826a(m1072A)) {
                        m1758v.f4855e = true;
                    }
                    m1831a(m1758v, abstractC0224s);
                    m1758v.m2272a(abstractC0224s.mo4488z());
                    m1844a(abstractC0224s, (PointF) null, (AbstractC0244am) null, m1758v);
                }
            }
            if (z14) {
                if (z16) {
                    C0794c.m1886a(abstractC0244am, abstractC0224s, true, true);
                    m1072A.f6111bM.m2716b(C0631e.f4043i, 0.5f);
                }
                for (int i15 = 0; i15 < i13; i15++) {
                    C0749e m1758v2 = m1758v();
                    m1831a(m1758v2, abstractC0224s);
                    m1758v2.f4857g = true;
                    m1758v2.m2272a(abstractC0224s.mo4488z());
                }
            }
            if (!z13 && !z14 && this.f5226O && !this.f5225N && !this.f5244bi.m5361b((int) this.f5209s, (int) this.f5210t)) {
                return true;
            }
        }
        if (!z6 && LoggerMaybe.m996at() && this.f5226O && !this.f5225N && !this.f5244bi.m5361b((int) this.f5209s, (int) this.f5210t)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m1847a(Rect rect, Paint paint, Paint paint2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (f5193bA) {
            m1072A.f6113bO.mo194a(this.f5241bf, rect, paint2, rect.f230a, rect.f231b, 0, 0);
            if (paint != null) {
                int m5384f = paint.m5384f() + 0;
                if (m5384f > 255) {
                    m5384f = 255;
                }
                paint.m5393c(m5384f);
            }
        }
        if (paint != null) {
            m1072A.f6113bO.mo162b(rect, paint);
        }
    }

    /* renamed from: a */
    public void m1848a(Rect rect, int i, boolean z) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f5253br.m5398b(i);
        this.f5253br.m5413a(Paint.Style.f220b);
        this.f5253br.m5423a(1.0f);
        m1072A.f6113bO.mo162b(rect, this.f5253br);
        if (this.f5255bz) {
            this.f5253br.m5398b(Color.m5435a(255, 116, 136, 160));
            int i2 = 1;
            if (z && rect.m5362b() > 100) {
                i2 = 2;
            }
            this.f5253br.m5423a(i2);
            this.f5247bl.m5363a(rect);
            this.f5247bl.f233d -= i2;
            this.f5247bl.f231b += i2;
            this.f5247bl.f230a += i2;
            this.f5247bl.f232c -= i2;
            m1072A.f6113bO.mo162b(this.f5247bl, this.f5253br);
        }
    }

    /* renamed from: a */
    public void m1853a(int i, int i2, int i3, int i4, String str, int i5, Paint paint, boolean z) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f5245bj.m5364a(i, i2, i + i3, i2 + i4);
        this.f5253br.m5398b(i5);
        if (!z) {
            this.f5253br.m5413a(Paint.Style.f219a);
            m1072A.f6113bO.mo162b(this.f5245bj, this.f5253br);
        } else {
            m1847a(this.f5245bj, (Paint) null, this.f5253br);
        }
        int m5435a = Color.m5435a(255, 0, 0, 0);
        if (f5193bA) {
            m5435a = Color.m5435a(100, 0, 0, 0);
        }
        m1848a(this.f5245bj, m5435a, false);
        m1854a(i, i2, i3, i4, str, i5, paint);
    }

    /* renamed from: a */
    public void m1854a(int i, int i2, int i3, int i4, String str, int i5, Paint paint) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f5245bj.m5364a(i, i2, i + i3, i2 + i4);
        if (LoggerMaybe.f6207aW) {
            m1072A.f6113bO.mo181a(str, this.f5245bj.m5357d(), this.f5245bj.m5356e() + (m1072A.f6113bO.mo179a(str, paint) / 2), paint);
        } else {
            m1072A.f6113bO.mo181a(str, this.f5245bj.m5357d(), this.f5245bj.m5356e() - ((paint.m5377l() + paint.m5376m()) / 2.0f), paint);
        }
    }

    /* renamed from: I */
    public boolean m1869I() {
        if (this.f5225N) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m1852a(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5) {
        return m1850a(i, i2, i3, i4, str, enumC0798g, z, i5, this.f5151aw, false);
    }

    /* renamed from: b */
    public boolean m1811b(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5) {
        return m1850a(i, i2, i3, i4, str, enumC0798g, z, i5, this.f5151aw, true);
    }

    /* renamed from: a */
    public boolean m1851a(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5, Paint paint) {
        return m1850a(i, i2, i3, i4, str, enumC0798g, z, i5, paint, false);
    }

    /* renamed from: a */
    public boolean m1850a(int i, int i2, int i3, int i4, String str, EnumC0798g enumC0798g, boolean z, int i5, Paint paint, boolean z2) {
        m1853a(i, i2, i3, i4, str, i5, paint, z2);
        return m1855a(i, i2, i3, i4, enumC0798g, z);
    }

    /* renamed from: a */
    public void m1863a(float f, float f2, float f3, float f4) {
        this.f5263bO.m5364a((int) f, (int) f2, (int) (f + f3), (int) (f2 + f4));
        if (this.f5263bO.m5361b((int) this.f5211u, (int) this.f5212v)) {
            this.f5218G = true;
            if (this.f5227P) {
                this.f5217F = true;
            }
        }
    }

    /* renamed from: a */
    public boolean m1855a(int i, int i2, int i3, int i4, EnumC0798g enumC0798g, boolean z) {
        m1863a(i, i2, i3, i4);
        this.f5245bj.m5364a(i, i2, i + i3, i2 + i4);
        if (((z && this.f5215D) || this.f5226O) && this.f5245bj.m5361b((int) this.f5209s, (int) this.f5210t)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1856a(int i, int i2, int i3, int i4, EnumC0798g enumC0798g) {
        this.f5245bj.m5364a(i, i2, i + i3, i2 + i4);
        if (this.f5227P && this.f5245bj.m5361b((int) this.f5209s, (int) this.f5210t)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public float m1762r(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (abstractC0244am.f1645cF < m1072A.f6104bA && abstractC0244am.f1645cF + 200 > m1072A.f6104bA) {
            return (1.0f - ((m1072A.f6104bA - abstractC0244am.f1645cF) / 200.0f)) * 6.0f;
        }
        return LoggerMaybe.m1072A().f6273dw;
    }

    /* renamed from: a */
    public void m1829a(C0767e c0767e) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        c0767e.m1959r_();
        c0767e.m1937c(m1072A.f6136cn);
        c0767e.m1934d(m1072A.f6137co);
        this.f5205n.m1944a(c0767e);
    }

    /* renamed from: J */
    public static void m1868J() {
        f5196bP++;
        f5191bQ = true;
    }
}
