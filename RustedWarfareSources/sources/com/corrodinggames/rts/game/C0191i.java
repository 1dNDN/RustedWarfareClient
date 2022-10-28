package com.corrodinggames.rts.game;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Debug;
import android.util.DisplayMetrics;
import android.util.Log;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0243al;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p027f.C0538c;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0626a;
import com.corrodinggames.rts.gameFramework.C0636aa;
import com.corrodinggames.rts.gameFramework.C0638ac;
import com.corrodinggames.rts.gameFramework.C0648am;
import com.corrodinggames.rts.gameFramework.C0716ba;
import com.corrodinggames.rts.gameFramework.C0720be;
import com.corrodinggames.rts.gameFramework.C0721bf;
import com.corrodinggames.rts.gameFramework.C0722bg;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0736c;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.C1122y;
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
import com.corrodinggames.rts.gameFramework.EnumC1063s;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p034c.RunnableC0737a;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p035d.C0742b;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p037f.C0802k;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0823a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.C0937h;
import com.corrodinggames.rts.gameFramework.p044l.C1026x;
import com.corrodinggames.rts.gameFramework.p044l.C1028z;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.C1096i;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import com.corrodinggames.rts.gameFramework.utility.C1108r;
import com.corrodinggames.rts.gameFramework.utility.C1109s;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.EnumC1107q;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.game.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/i.class */
public class C0191i extends LoggerMaybe {

    /* renamed from: a */
    public static String f1217a;

    /* renamed from: b */
    public static boolean f1218b;

    /* renamed from: c */
    public static boolean f1219c;

    /* renamed from: d */
    int f1220d;

    /* renamed from: e */
    public float f1221e;

    /* renamed from: f */
    public static String f1222f = null;

    /* renamed from: g */
    RunnableC0194k[] f1223g;

    /* renamed from: h */
    String f1224h;

    /* renamed from: i */
    public boolean f1225i;

    /* renamed from: j */
    public int f1226j;

    /* renamed from: k */
    public ConcurrentLinkedQueue f1227k;

    /* renamed from: l */
    Paint f1228l;

    /* renamed from: m */
    Paint f1229m;

    /* renamed from: n */
    Paint f1230n;

    /* renamed from: o */
    Paint f1231o;

    /* renamed from: p */
    Paint f1232p;

    /* renamed from: q */
    int f1233q;

    /* renamed from: r */
    int f1234r;

    /* renamed from: s */
    int f1235s;

    /* renamed from: t */
    float f1236t;

    /* renamed from: u */
    public String f1237u;

    /* renamed from: v */
    Rect f1238v;

    /* renamed from: w */
    public ArrayList f1239w;

    /* renamed from: x */
    Paint f1240x;

    /* renamed from: y */
    Paint f1241y;

    /* renamed from: z */
    Paint f1242z;

    /* renamed from: A */
    public Paint f1243A;

    /* renamed from: B */
    public C0721bf f1244B;

    /* renamed from: C */
    public C0720be f1245C;

    /* renamed from: D */
    public C0742b f1246D;

    /* renamed from: E */
    AbstractC0135a f1247E;

    /* renamed from: F */
    boolean f1248F;

    /* renamed from: G */
    float f1249G;

    /* renamed from: H */
    public float f1250H;

    /* renamed from: I */
    public float f1251I;

    /* renamed from: J */
    public float f1252J;

    /* renamed from: K */
    C0193j f1253K;

    /* renamed from: L */
    C0193j f1254L;

    /* renamed from: M */
    boolean f1255M;

    /* renamed from: N */
    InterfaceC1027y f1256N;

    /* renamed from: O */
    C0934e f1257O;

    /* renamed from: P */
    C0934e f1258P;

    /* renamed from: Q */
    C0934e f1259Q;

    /* renamed from: R */
    float f1260R;

    /* renamed from: S */
    Rect f1261S;

    /* renamed from: T */
    RectF f1262T;

    /* renamed from: U */
    public C0934e f1263U;

    /* renamed from: V */
    public C0934e f1264V;

    /* renamed from: W */
    C1109s f1265W;

    /* renamed from: X */
    C1109s f1266X;

    /* renamed from: Y */
    Matrix f1267Y;

    /* renamed from: Z */
    public ArrayList f1268Z;

    /* renamed from: aa */
    public ArrayList f1269aa;

    /* renamed from: ab */
    Timer f1270ab;

    /* renamed from: ac */
    boolean f1271ac;

    /* renamed from: ad */
    Object f1272ad;

    /* renamed from: ae */
    int f1273ae;

    /* renamed from: af */
    AbstractC0244am f1274af;

    /* renamed from: ag */
    AbstractC0244am f1275ag;

    /* renamed from: ah */
    float f1276ah;

    /* renamed from: ai */
    boolean f1277ai;

    public C0191i(Context context) {
        super(context);
        this.f1221e = 1.0f;
        this.f1223g = new RunnableC0194k[6];
        this.f1225i = false;
        this.f1226j = 0;
        this.f1227k = new ConcurrentLinkedQueue();
        this.f1233q = 0;
        this.f1234r = 0;
        this.f1235s = 0;
        this.f1236t = 16.0f;
        this.f1237u = "0fps";
        this.f1238v = new Rect();
        this.f1239w = new ArrayList();
        this.f1243A = new Paint();
        this.f1246D = new C0742b();
        this.f1249G = 0.0f;
        this.f1250H = 1.0f;
        this.f1260R = 0.0f;
        this.f1261S = new Rect();
        this.f1262T = new RectF();
        this.f1263U = null;
        this.f1264V = null;
        this.f1265W = new C1109s("allOnScreenObjects");
        this.f1266X = new C1109s("allOnScreenObjectsDirty");
        this.f1267Y = new Matrix();
        this.f1268Z = new ArrayList();
        this.f1269aa = new ArrayList();
        this.f1272ad = new Object();
        this.f1273ae = 0;
    }

    /* renamed from: a */
    public boolean m4804a() {
        if (this.f6117bS.f5126p) {
            return true;
        }
        if (this.f6279dG != null && this.f6279dG.mo111b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4793a(boolean z) {
        if (!z || this.f6126cb.m2413h()) {
            if (this.f6117bS.f5126p || this.f6098bp) {
                return true;
            }
            if (this.f6081aq && !this.f6243bH) {
                return true;
            }
            if (this.f6241bF && this.f6279dG != null && this.f6279dG.mo111b()) {
                return true;
            }
        }
        if ((z && !this.f6122bX.f5539bm) || this.f6122bX.m1597I()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public int m4789b() {
        return this.f1235s;
    }

    /* renamed from: c */
    public boolean m4782c() {
        return this.f6186eg;
    }

    /* renamed from: d */
    public boolean m4778d() {
        return this.f6187eh;
    }

    /* renamed from: a */
    public synchronized void m4797a(Context context) {
        Log.m5365d("RustedWarfare", "--- ----------------- ----");
        Log.m5365d("RustedWarfare", "--- GameEngine:init() ----");
        Log.m5365d("RustedWarfare", "--- ----------------- ----");
        if (this.f6229bi) {
            Log.m5365d("RustedWarfare", "GameEngine init has already been called");
            return;
        }
        LoggerMaybe.LogDebug2("Version:" + m4763q());
        if (m1078B() && getClass().equals(C0191i.class)) {
            throw new RuntimeException("inSpace but class is:" + getClass());
        }
        System.gc();
        m963h("Asset Index");
        this.f6109bK = new C1096i(context);
        long m2390a = C0727bl.m2390a();
        this.f6128cd = new C0727bl(this);
        this.f6128cd.m2386a(EnumC0729bm.f4605C);
        if (f6205aU) {
            this.f6131ch = 1.0f;
        } else {
            DisplayMetrics displayMetrics = context.mo5602e().getDisplayMetrics();
            this.f6131ch = context.mo5602e().getDisplayMetrics().density;
            LoggerMaybe.LogDebug2("densityScaleRaw: " + this.f6131ch);
            m4800a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        this.f6131ch *= this.f1221e;
        LoggerMaybe.LogDebug2("densityScaleRaw*densityScaleMultiplier: " + this.f6131ch);
        if (LoggerMaybe.m991b(context)) {
            this.f6228ar = true;
        }
        this.f1247E = new C0171b();
        this.f6234bo = false;
        m963h("InputController");
        this.f6118bT = new C0638ac();
        this.f6118bT.m2700a();
        m963h("SettingsEngine");
        this.f6115bQ = SettingsEngine.getInstance(context);
        this.f6115bQ.loadMainExternalFolder(true);
        C0750a.m2237b();
        int i = 3;
        if (f6210aZ) {
            i = 1;
        }
        if (this.f6115bQ.numIncompleteLoadAttempts > 1 || this.f6115bQ.numLoadsSinceRunningGameOrNormalExit > i) {
            this.f6183ed = true;
            if (this.f6115bQ.numIncompleteLoadAttempts > 2 || this.f6115bQ.numLoadsSinceRunningGameOrNormalExit > 4) {
                this.f6115bQ.forceEnglish = true;
                this.f6184ee = true;
            }
            if (this.f6115bQ.numIncompleteLoadAttempts > 3) {
                this.f6115bQ.newRender = false;
            }
            if (this.f6115bQ.numIncompleteLoadAttempts > 4 || this.f6115bQ.numLoadsSinceRunningGameOrNormalExit > 5) {
                LoggerMaybe.LogDebug2("Extra safe mode");
                this.f6186eg = true;
            }
            if (this.f6115bQ.numIncompleteLoadAttempts > 5) {
                LoggerMaybe.LogDebug2("Extra safe mode x2");
                this.f6187eh = true;
            }
            if (this.f6115bQ.numIncompleteLoadAttempts > 6) {
                LoggerMaybe.LogDebug2("Extra safe mode x3");
                this.f6115bQ.newRender = false;
                this.f6115bQ.shaderEffects = false;
                this.f6115bQ.teamShaders = false;
            }
            if (this.f6115bQ.newRender && this.f6115bQ.numLoadsSinceRunningGameOrNormalExit > 15) {
                LoggerMaybe.LogDebug2("Disabling opengl mode");
                this.f6115bQ.newRender = false;
            }
            LoggerMaybe.LogDebug2("starting game in safe mode, numIncompleteLoadAttempts:" + this.f6115bQ.numIncompleteLoadAttempts + " numLoadsSinceRunningGameOrNormalExit:" + this.f6115bQ.numLoadsSinceRunningGameOrNormalExit);
        }
        if (f6201aO) {
            this.f6183ed = true;
            this.f6185ef = "<forced by command line>";
        }
        if (f6202aP) {
            this.f6183ed = true;
            this.f6186eg = true;
            this.f6187eh = true;
            this.f6185ef = "<forced by command line>";
        }
        this.f6115bQ.numLoadsSinceRunningGameOrNormalExit++;
        this.f6115bQ.numIncompleteLoadAttempts++;
        if (!this.f6115bQ.save() && f6210aZ) {
            LoggerMaybe.LogDebug2("starting game in safe mode, failed to save settings");
            this.f6185ef = "failing to write preferences data";
            this.f6183ed = true;
        }
        RunnableC0737a.m2365a();
        this.f6132ci = m1058V();
        LoggerMaybe.LogDebug2("densityScale(): " + this.f6132ci);
        long m2390a2 = C0727bl.m2390a();
        C0820a.m1694a();
        C0727bl.m2385a("Locale.init took:", m2390a2);
        AbstractC0197n.m4732I();
        this.f1228l = new Paint();
        this.f1229m = new Paint();
        this.f1229m.m5523a(255, 255, 255, 255);
        this.f1229m.mo900a(true);
        m1042a(this.f1229m, 16.0f);
        this.f1230n = new Paint();
        this.f1230n.m5523a(255, 255, 255, 255);
        this.f1230n.mo900a(true);
        m1042a(this.f1230n, 16.0f);
        this.f1231o = new Paint();
        this.f1231o.m5523a(100, 255, 0, 0);
        m1042a(this.f1231o, 16.0f);
        this.f1232p = new Paint();
        this.f1232p.m5523a(100, 0, 255, 0);
        m1042a(this.f1232p, 16.0f);
        this.f6167dm = new Paint();
        this.f6168dn = new Paint();
        this.f6168dn.m5519a(Paint.Align.f196b);
        this.f6168dn.mo900a(true);
        this.f6168dn.mo902a(Typeface.m5433a(Typeface.f246c, 0));
        m1042a(this.f6168dn, 16.0f);
        this.f6169do = new Paint();
        this.f6169do.m5523a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.f6169do.mo900a(true);
        this.f6169do.m5519a(Paint.Align.f196b);
        m1042a(this.f6169do, 18.0f);
        this.f1240x = new Paint();
        this.f1240x.m5501b(-1);
        this.f1240x.m5496c(100);
        this.f1241y = new Paint();
        this.f1241y.m5501b(-7829368);
        this.f1241y.m5496c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.f1241y.m5516a(Paint.Style.f220b);
        this.f1241y.m5526a(1.0f);
        long m2390a3 = C0727bl.m2390a();
        m963h("AudioEngine");
        C0631e.m2724b();
        this.f6111bM = new C0631e();
        this.f6111bM.m2730a(context);
        C0727bl.m2385a("AudioEngine took:", m2390a3);
        m963h("MusicController");
        this.f6112bN = new C0648am();
        this.f6112bN.m2668a(context);
        if (f6096bh != null) {
            LogDebug2("init(): using Graphics instance");
            this.f6113bO = f6096bh;
        } else if (f6095bg != null) {
            LogDebug2("init(): using GraphicsSlick2d");
            try {
                this.f6113bO = (InterfaceC1027y) f6095bg.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        } else if (f6205aU) {
            this.f6113bO = new C1028z();
        } else {
            this.f6113bO = new C1026x();
        }
        m963h("graphics.init");
        this.f6113bO.mo218a(context);
        this.f6113bO.mo174b();
        C0894j.m1239a();
        m963h("Fonts");
        m1056X();
        m963h("effects.init");
        this.f6116bR = new C0743c();
        this.f6116bR.m2330a(context);
        m963h("minimapHandler");
        this.f6121bW = new C0802k();
        this.f6121bW.m1740a(context);
        if (f6133cj != null) {
            LoggerMaybe.LogDebug2("We have an initial screen size, can do early setup of image buffers");
            m963h("Map Buffers");
            m4786b(f6133cj.f224a, f6133cj.f225b);
            m4770j();
            C0173b.m4914d();
            C0173b.m4905f();
            this.f6121bW.m1727e();
            if (LoggerMaybe.m997az()) {
                m963h("Setting up postprocessing");
                if (!m4772h()) {
                    LoggerMaybe.LogDebug2("Failed to setup postprocessing");
                }
            }
        }
        m963h("PathEngine");
        this.f6119bU = new C0907l();
        m963h("GroupController");
        this.f6120bV = new C0636aa();
        m963h("CollisionEngine");
        this.f6114bP = new C0626a();
        m963h("InterfaceEngine");
        this.f6117bS = new C0797f();
        this.f6117bS.m1851a(context);
        this.f1245C = C0720be.m2401c(context);
        m963h("NetworkEngine");
        this.f6122bX = new C0831ad();
        this.f6122bX.m1601E();
        m963h("StatsHandler");
        this.f6123bY = new C0722bg();
        m963h("ModEngine");
        this.f6124bZ = new C0823a();
        this.f6124bZ.m1680a();
        if (this.f6183ed) {
            this.f6124bZ.m1658g();
        }
        m963h("CommandController");
        this.f6130cf = new C0736c();
        m963h("GameSaver");
        this.f6125ca = new C1122y();
        m963h("ReplayEngine");
        this.f6126cb = new C0716ba();
        this.f6126cb.m2433a(context);
        m963h("UnitGeoIndex");
        this.f6127cc = new C0538c();
        m963h("Precalculating map fog");
        C0173b.m4920c();
        m963h("ScorchMark.load");
        C0195l.m4746b();
        m963h("Projectile.load");
        C0188f.m4815c();
        m963h("Emitter.load");
        C0746f.m2292b();
        m963h("Unit.loadAllUnits");
        long m2390a4 = C0727bl.m2390a();
        AbstractC0244am.m4486bH();
        C0727bl.m2385a("loadAllUnits took:", m2390a4);
        m963h("Loading custom unit data");
        long m2390a5 = C0727bl.m2390a();
        C0348af.m4042h();
        m963h("getAllUnitsChecksum");
        C0727bl.m2385a("CustomUnits took:", m2390a5);
        long m2390a6 = C0727bl.m2390a();
        this.f1220d = AbstractC0244am.m4482bM();
        C0727bl.m2385a("allUnitsChecksum took:", m2390a6);
        this.f1242z = new Paint();
        this.f1242z.m5523a(50, 255, 255, 255);
        m1075E();
        System.gc();
        this.f6229bi = true;
        LoggerMaybe.LogDebug2("Init completed");
        C0727bl.m2385a("Loading took:", m2390a);
        this.f6128cd.m2381b(EnumC0729bm.f4605C);
        this.f6128cd.m2384a(true, true);
        long m2390a7 = C0727bl.m2390a();
        m963h("Loading map data");
        if (!LoggerMaybe.f6083ay) {
            m4757w();
        }
        C0727bl.m2385a("loadAMenuMap took:", m2390a7);
        m963h("Last setup");
        m1008ao();
        this.f6122bX.m1432m();
        m963h("init complete");
        if (f6089aE) {
            AbstractC0249ar.m4362s();
            System.exit(0);
        }
        if (f6090aF) {
            AbstractC0249ar.m4363r();
            System.exit(0);
        }
        this.f6097bj = true;
    }

    /* renamed from: a */
    public void m4800a(int i, int i2) {
        float m2108b = C0758f.m2108b(0.0f, 0.0f, i, i2) / 1131.0f;
        LoggerMaybe.LogDebug2("defaultViewpointZoomDensity: " + m2108b);
        if (m2108b < 0.5f) {
            m2108b = 0.5f;
        }
        if (m2108b > 3.0f) {
            m2108b = 3.0f;
        }
        LoggerMaybe.LogDebug2("defaultViewpointZoomDensity after limit: " + m2108b);
        this.f6257cX = 1.0f;
        if (C0758f.m2088c(m2108b - 1.0f) > 0.1d) {
            this.f6257cX = m2108b;
            if (this.f6257cX > 2.0f) {
                this.f6257cX = 2.0f;
            }
            if (this.f6257cX < 0.5f) {
                this.f6257cX = 0.5f;
            }
            this.f6256cW = this.f6254cU * this.f6257cX;
        }
    }

    /* renamed from: e */
    public void m4775e() {
        m1070J();
        m4774f();
    }

    /* renamed from: f */
    public void m4774f() {
        m4783b(false);
        this.f6242bG = false;
        this.f6243bH = false;
        this.f6241bF = false;
        this.f6098bp = false;
        this.f6117bS.f5126p = false;
    }

    /* renamed from: a */
    public synchronized void m4792a(boolean z, EnumC1063s enumC1063s) {
        m1070J();
        m4791a(z, false, enumC1063s);
    }

    /* renamed from: a */
    public void m4791a(boolean z, boolean z2, EnumC1063s enumC1063s) {
        ActivityC0097g mo246i;
        m4783b(z2);
        this.f6234bo = false;
        System.gc();
        this.f6244bI = true;
        this.f6242bG = false;
        this.f6098bp = false;
        this.f6241bF = false;
        this.f6102by = 0;
        this.f6245cg = false;
        this.f6122bX.m1573a(1L);
        this.f6239bx = 0;
        this.f6108bJ = 0;
        C0758f.m2167a();
        this.f6122bX.m1421t();
        if (!z2) {
            this.f6267dp = false;
            this.f6268dq = false;
            this.f6269dr = 0.0f;
            this.f6271dt = false;
            this.f6270ds = false;
        }
        this.f1226j = 0;
        if (!z2) {
            this.f6254cU = 1.0f;
        }
        this.f6273dw = 0.0f;
        if (!this.f6126cb.m2413h()) {
            if (!this.f6122bX.lock1) {
                C0348af.m4051b(true);
            } else {
                C0348af.m4046d();
            }
        }
        if (!this.f6122bX.lock1) {
            if (!this.f6126cb.m2413h() && z) {
                this.f6099bs = new C0187e(0);
                this.f6099bs.f1316u = "Player";
                for (int i = 1; i < 8; i++) {
                    new C0136a(i);
                }
                this.f6122bX.m1515aq();
            }
        } else {
            this.f6099bs = this.f6122bX.f5489z;
            if (this.f6099bs == null) {
                throw new RuntimeException("cannot find player's team");
            }
            if (this.f6099bs != AbstractC0197n.m4638k(this.f6099bs.f1306k)) {
                LoggerMaybe.m965g("Stale playerTeam");
            }
        }
        this.f6129ce = null;
        this.f6110bL = new C0173b();
        try {
            if (this.f6166dl != null) {
                InputStream m1271w = this.f6166dl.m1271w();
                try {
                    m1271w.reset();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f6110bL.m4940a(m1271w, z2);
            } else {
                this.f6110bL.m4934a(m1013aj(), z2);
            }
            if (!this.f6110bL.f803W) {
                LogDebug2("map did not load, returning");
                this.f6244bI = false;
                return;
            }
            this.f6106bC = this.f6115bQ.teamUnitCapSinglePlayer;
            if (this.f6106bC < 1) {
                this.f6106bC = 1;
            }
            this.f6105bB = this.f6106bC;
            this.f6110bL.f843G = false;
            AbstractC0197n.m4657e();
            if (!z2) {
                C0453l.m3559E();
            }
            if (!this.f6122bX.lock1 && !this.f6126cb.m2413h()) {
                this.f6122bX.f5603aO.f5661h = 1.0f;
                this.f6122bX.f5603aO.f5653q = C0758f.m2154a(1, 1000000000);
            }
            this.f6108bJ = this.f6122bX.f5603aO.f5653q;
            LogDebug2("global Seed: " + this.f6108bJ);
            if (this.f6122bX.lock1) {
                if (!this.f6122bX.f5571F) {
                    this.f6105bB = this.f6122bX.f5601aM;
                    this.f6106bC = this.f6122bX.f5602aN;
                }
                LoggerMaybe.LogDebug2("Unit cap is now: " + this.f6106bC);
                if (this.f6122bX.f5603aO.f5657d == 0) {
                    this.f6110bL.f841E = false;
                    this.f6110bL.f842F = false;
                } else if (this.f6122bX.f5603aO.f5657d == 1) {
                    this.f6110bL.f841E = true;
                    this.f6110bL.f842F = false;
                } else if (this.f6122bX.f5603aO.f5657d == 2) {
                    this.f6110bL.f841E = true;
                    this.f6110bL.f842F = true;
                }
                this.f6110bL.f843G = this.f6122bX.f5603aO.f5658e;
                byte b = 10;
                if (this.f6122bX.f5603aO.f5658e) {
                    b = 10;
                }
                for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                    AbstractC0197n m4638k = AbstractC0197n.m4638k(i2);
                    if (m4638k != null) {
                        if (m4638k.f1337M == null) {
                            LoggerMaybe.LogDebug2("Fog null for team: " + m4638k.f1306k);
                        } else {
                            for (int i3 = 0; i3 < this.f6110bL.f792C; i3++) {
                                for (int i4 = 0; i4 < this.f6110bL.f793D; i4++) {
                                    m4638k.f1337M[i3][i4] = b;
                                }
                            }
                        }
                    }
                }
                int m1436k = this.f6122bX.m1436k();
                for (int i5 = 0; i5 < AbstractC0197n.f1365c; i5++) {
                    AbstractC0197n m4638k2 = AbstractC0197n.m4638k(i5);
                    if (m4638k2 != null) {
                        m4638k2.f1310o = m1436k;
                        if (m4638k2.f1317v) {
                            if (!m4638k2.f1319x) {
                                if (m4638k2.f1320y != null) {
                                    m4638k2.f1318w = m4638k2.f1320y.intValue();
                                } else {
                                    m4638k2.f1318w = this.f6122bX.f5603aO.f5659f;
                                }
                            } else {
                                m4638k2.m4668c("aiDifficulty is locked");
                            }
                        }
                        m4638k2.f1332H = this.f6122bX.f5603aO.f5652l;
                        boolean z3 = false;
                        boolean z4 = false;
                        int i6 = this.f6122bX.f5603aO.f5660g;
                        if (m4638k2.f1321z != null) {
                            i6 = m4638k2.f1321z.intValue();
                        }
                        if (i6 != 1) {
                            boolean z5 = true;
                            boolean z6 = true;
                            Float f = null;
                            Float f2 = null;
                            Float f3 = null;
                            Float f4 = null;
                            z6 = (i6 == 5 || i6 == 4 || i6 > 10) ? false : false;
                            z5 = (i6 == 5 || i6 == 4 || i6 == 3 || i6 > 10) ? false : false;
                            if (i6 == 9) {
                                z6 = false;
                                z5 = false;
                            }
                            Iterator it = AbstractC0244am.m4488bF().iterator();
                            while (it.hasNext()) {
                                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                                if ((abstractC0244am instanceof AbstractC0244am) && !abstractC0244am.f1607bT && abstractC0244am.f1609bV == m4638k2) {
                                    if (abstractC0244am.f1601bN && !z3) {
                                        z3 = true;
                                        f = Float.valueOf(abstractC0244am.f6957el);
                                        f2 = Float.valueOf(abstractC0244am.f6958em);
                                        if (!z5) {
                                            abstractC0244am.m4439ch();
                                        }
                                    }
                                    if (abstractC0244am.f1602bO && !z4) {
                                        z4 = true;
                                        f3 = Float.valueOf(abstractC0244am.f6957el);
                                        f4 = Float.valueOf(abstractC0244am.f6958em);
                                        if (!z6) {
                                            abstractC0244am.m4439ch();
                                        }
                                    }
                                }
                            }
                            if (f == null) {
                                f = f3;
                                f2 = f4;
                            }
                            if (f == null) {
                                LoggerMaybe.LogDebug2("placementLocation==null for team:" + m4638k2.f1306k);
                            } else {
                                float floatValue = f.floatValue();
                                float floatValue2 = f2.floatValue();
                                if (i6 == 2) {
                                    for (int i7 = 0; i7 <= 2; i7++) {
                                        if (i7 != 1) {
                                            AbstractC0244am mo4234a = AbstractC0249ar.f1750h.mo4234a();
                                            mo4234a.m4492b(m4638k2);
                                            mo4234a.f6957el = (floatValue - 50.0f) + (i7 * 50);
                                            mo4234a.f6958em = floatValue2;
                                            AbstractC0197n.m4674c(mo4234a);
                                        }
                                    }
                                    for (int i8 = 0; i8 <= 2; i8++) {
                                        AbstractC0244am mo4234a2 = AbstractC0249ar.f1765w.mo4234a();
                                        mo4234a2.m4492b(m4638k2);
                                        mo4234a2.f6957el = (floatValue - 50.0f) + (i8 * 50);
                                        mo4234a2.f6958em = floatValue2 + 50.0f;
                                        AbstractC0197n.m4674c(mo4234a2);
                                    }
                                } else if (i6 == 3 || i6 == 4) {
                                    for (int i9 = 0; i9 <= 2; i9++) {
                                        InterfaceC0303as m4372a = AbstractC0249ar.m4372a("combatEngineer");
                                        if (m4372a == null) {
                                            C0831ad.m1451g("Could not find: combatEngineer on network.setup.startingUnits==3");
                                        } else {
                                            AbstractC0244am mo4234a3 = m4372a.mo4234a();
                                            mo4234a3.m4492b(m4638k2);
                                            mo4234a3.f6957el = (floatValue - 50.0f) + (i9 * 50);
                                            mo4234a3.f6958em = floatValue2 + 50.0f;
                                            AbstractC0197n.m4674c(mo4234a3);
                                        }
                                    }
                                } else if (i6 == 5) {
                                    InterfaceC0303as m4372a2 = AbstractC0249ar.m4372a("experimentalSpider");
                                    if (m4372a2 == null) {
                                        C0831ad.m1451g("Could not find: experimentalSpider on network.setup.startingUnits==5");
                                    } else {
                                        AbstractC0244am mo4234a4 = m4372a2.mo4234a();
                                        mo4234a4.m4492b(m4638k2);
                                        mo4234a4.f6957el = floatValue;
                                        mo4234a4.f6958em = floatValue2;
                                        mo4234a4.f1618ce = 90.0f;
                                        mo4234a4.f6959en = 2.0f;
                                        mo4234a4.m4424da();
                                        AbstractC0197n.m4674c(mo4234a4);
                                    }
                                } else if (i6 != 9 && i6 > 10) {
                                    C0453l m3523c = C0453l.m3523c(i6);
                                    if (m3523c == null) {
                                        C0831ad.m1451g("Could not find starting unit on startingUnits==" + i6);
                                    } else {
                                        AbstractC0244am mo4234a5 = m3523c.mo4234a();
                                        mo4234a5.m4492b(m4638k2);
                                        mo4234a5.f6957el = floatValue;
                                        mo4234a5.f6958em = floatValue2;
                                        if (!mo4234a5.m4485bI()) {
                                            mo4234a5.f1618ce = 90.0f;
                                        }
                                        if (m3523c.f3195eG) {
                                            mo4234a5.m4424da();
                                            if (mo4234a5 instanceof C0451j) {
                                                ((C0451j) mo4234a5).m3593dz();
                                            }
                                        }
                                        AbstractC0197n.m4674c(mo4234a5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2 && (this.f6129ce == null || !this.f6129ce.f6674q)) {
                m1052a(0.0f, 0.0f);
                int i10 = 0;
                int i11 = 0;
                boolean z7 = false;
                Iterator it2 = AbstractC0244am.f1590bD.iterator();
                while (it2.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it2.next();
                    if (abstractC0244am2 instanceof C0243al) {
                        i11++;
                    } else {
                        i10++;
                    }
                    if (abstractC0244am2.f1609bV == this.f6099bs && abstractC0244am2.f1602bO) {
                        m995b(abstractC0244am2.f6957el, abstractC0244am2.f6958em);
                        z7 = true;
                    }
                }
                if (!z7) {
                    Iterator it3 = AbstractC0244am.f1590bD.iterator();
                    while (it3.hasNext()) {
                        AbstractC0244am abstractC0244am3 = (AbstractC0244am) it3.next();
                        if (abstractC0244am3.f1609bV == this.f6099bs && !abstractC0244am3.mo1715t() && !abstractC0244am3.mo1714u()) {
                            m995b(abstractC0244am3.f6957el, abstractC0244am3.f6958em);
                        }
                    }
                }
                LogDebug2("there are " + i10 + " units on this map and " + i11 + " trees");
            }
            this.f1244B = C0720be.m2401c(this.f6227am).m2402b(m1013aj());
            this.f6119bU.m1160a(this.f6110bL, z2);
            this.f6121bW.m1739a(this.f6110bL, z2);
            this.f6130cf.m2373a();
            this.f6120bV.m2717a();
            if (!z2) {
                C0741a.m2359a();
            }
            this.f6125ca.m427a(z2);
            this.f6117bS.m1821a(z2);
            if (!z2) {
                this.f6117bS.m1758x();
                m4790aF();
                if (this.f6100bv) {
                    this.f6117bS.m1758x();
                }
            } else {
                this.f6117bS.m1758x();
            }
            this.f6127cc.m3167a(this.f6110bL);
            if (!z2) {
                this.f6112bN.m2660c();
            }
            this.f6123bY.m2400a();
            Iterator it4 = AbstractC0244am.f1590bD.iterator();
            while (it4.hasNext()) {
                AbstractC0244am abstractC0244am4 = (AbstractC0244am) it4.next();
                if (abstractC0244am4 instanceof AbstractC0623y) {
                    ((AbstractC0623y) abstractC0244am4).m2798c(false);
                }
            }
            this.f1244B.f4548e = true;
            this.f1245C.m2407a(this.f6227am);
            this.f6242bG = true;
            this.f6243bH = false;
            this.f6244bI = false;
            if (enumC1063s != EnumC1063s.f6739a && !this.f6115bQ.hasPlayedGameOrSeenHelp) {
                this.f6115bQ.hasPlayedGameOrSeenHelp = true;
                this.f6115bQ.save();
            }
            for (int i12 = 0; i12 < 5; i12++) {
                System.gc();
            }
            if (!LoggerMaybe.f6205aU) {
                Log.LogVerbose("RustedWarfare", "getNativeHeapSize" + String.valueOf(Debug.getNativeHeapSize()));
                Log.LogVerbose("RustedWarfare", "getNativeHeapAllocatedSize" + String.valueOf(Debug.getNativeHeapAllocatedSize()));
                Log.LogVerbose("RustedWarfare", "getNativeHeapFreeSize" + String.valueOf(Debug.getNativeHeapFreeSize()));
                Log.LogVerbose("RustedWarfare", "Runtime.getRuntime().maxMemory()" + String.valueOf(Runtime.getRuntime().maxMemory()));
            }
            if (this.f6266dj != null) {
                this.f6266dj.m421a();
            }
            this.f1249G = 0.0f;
            if (this.f6122bX.f5571F && this.f6122bX.lock1) {
                LoggerMaybe.LogDebug2("Disabling network for singleplayer");
                this.f6122bX.lock1 = false;
            }
            if (!m1000aw()) {
                if (enumC1063s == EnumC1063s.f6741c) {
                    LoggerMaybe.LogDebug2("Not starting replay recording as we are loading a save");
                } else {
                    this.f6126cb.m2425a(z2);
                }
            }
            if (C0907l.f6011m) {
            }
        } catch (C0179f e2) {
            e2.printStackTrace();
            m1037a("Error loading map: " + e2.getMessage(), 1);
            if (f6204aT) {
                LoggerMaybe.LogDebug2("Crashing on allowed map error because automated testing is active");
                throw new RuntimeException(e2);
            }
            if (!this.f6122bX.lock1 && this.f6079ao != null && (mo246i = this.f6079ao.mo246i()) != null) {
                mo246i.mo117m();
            }
            m970e("Map Load Warning", m1031a(e2));
            this.f6244bI = false;
        }
    }

    /* renamed from: aF */
    private void m4790aF() {
        this.f6117bS.m1758x();
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am.f1609bV == this.f6099bs && (abstractC0244am instanceof AbstractC0623y) && abstractC0244am.mo4538ak() && abstractC0244am.mo3257p_() && abstractC0244am.m4479bS() && !abstractC0244am.mo1714u() && !abstractC0244am.mo1715t()) {
                LoggerMaybe.LogDebug2("selectAnyOnScreenBuilder: found builder");
                this.f6117bS.m1780j(abstractC0244am);
                return;
            }
        }
        LoggerMaybe.LogDebug2("selectAnyOnScreenBuilder: no builder found");
    }

    /* renamed from: b */
    public void m4783b(boolean z) {
        synchronized (this.f6225aj) {
            if (this.f6079ao != null) {
                this.f6079ao.mo243l();
            }
            this.f6235bq = false;
            if (!z) {
                this.f6126cb.m2415f();
            }
            this.f6119bU.m1142c();
            C1104o m440dI = AbstractC1120w.m440dI();
            Iterator it = m440dI.iterator();
            while (it.hasNext()) {
                ((AbstractC1120w) it.next()).mo2638a();
            }
            AbstractC0244am.m4488bF();
            AbstractC1120w.m440dI();
            int size = m440dI.size();
            if (size != 0) {
                LoggerMaybe.m1038a("SHOULD_NOT_HAPPEN: we still had " + size + " objects in gameObjectListForLogic after removeAll");
                Iterator it2 = m440dI.iterator();
                while (it2.hasNext()) {
                    AbstractC1120w abstractC1120w = (AbstractC1120w) it2.next();
                    String str = "Object: " + abstractC1120w.f6951ee;
                    if (abstractC1120w instanceof AbstractC0244am) {
                        str = ((AbstractC0244am) abstractC1120w).m4468cA();
                    }
                    LoggerMaybe.m1038a("Remaining object: " + str);
                }
                if (LoggerMaybe.m1079A().m1054Z()) {
                    throw new RuntimeException("We still had " + size + " objects in gameObjectListForLogic after removeAll");
                }
            }
            AbstractC0244am.m4488bF().clear();
            AbstractC1120w.m440dI().clear();
            C0451j.m3614dB();
            this.f1265W.clear();
            if (!m1002au()) {
                this.f6112bN.m2656f();
            }
            this.f6116bR.m2324a(z);
            if (this.f6110bL != null) {
                this.f6110bL.m4899h();
                this.f6110bL = null;
            }
            if (this.f6129ce != null) {
                this.f6129ce = null;
            }
            if (this.f6127cc != null) {
                this.f6127cc.m3164b();
            }
            this.f1274af = null;
            this.f1275ag = null;
            this.f1226j = 0;
            AbstractC0197n.m4720U();
        }
    }

    /* renamed from: a */
    public void m4801a(float f, int i) {
        synchronized (this.f6225aj) {
            m4787b(f, i);
        }
    }

    /* renamed from: b */
    public void m4787b(float f, int i) {
        if (this.f6239bx == 2) {
            m1023aE();
        } else if (this.f6239bx % 10000 == 0 && this.f6239bx != 0) {
            m1023aE();
        }
        if (f6198aL && !this.f6094aS && m1004as() && Debug.getNativeHeapAllocatedSize() > 209715200) {
            LoggerMaybe.LogDebug2("getNativeHeapAllocatedSize: " + C0758f.m2051g((int) Debug.getNativeHeapAllocatedSize()));
            this.f6094aS = true;
        }
        m1024aD();
        this.f6288ea.m736a();
        this.f6289eb.m734b();
        this.f6128cd.m2386a(EnumC0729bm.f4577a);
        this.f6079ao = this.f6080ap;
        if (this.f6079ao.mo255b()) {
            this.f6128cd.m2386a(EnumC0729bm.f4578b);
            while (this.f1227k.peek() != null) {
                ((Runnable) this.f1227k.poll()).run();
            }
            if (!this.f6242bG) {
                if (this.f6081aq) {
                    return;
                }
                Log.m5365d("RustedWarfare", "game running without a loaded level!!!");
                m4773g();
                try {
                    Thread.sleep(10L);
                    return;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.f6235bq = true;
            if (!this.f1248F && this.f6239bx > 5) {
                this.f1248F = true;
                boolean z = this.f6115bQ.numIncompleteLoadAttempts > 1;
                this.f6115bQ.numIncompleteLoadAttempts = 0;
                if (this.f6183ed) {
                    this.f6115bQ.numLoadsSinceRunningGameOrNormalExit = 0;
                }
                this.f6115bQ.save();
                if (this.f6183ed && (this.f6184ee || this.f6124bZ.m1666c() > 0)) {
                    if (this.f6185ef != null) {
                        m982c("Safe mode", "Started game in safe mode due to " + this.f6185ef + ". Mods have been disabled.");
                    } else if (z) {
                        m982c("Safe mode", "Started game in safe mode due to failed loading attempts. Mods have been disabled.");
                    } else {
                        m982c("Safe mode", "Started game in safe mode due to multiple loads without starting a game or exiting. Mods have been disabled.");
                    }
                }
            }
            if (!this.f6243bH && this.f6242bG && this.f6115bQ.numLoadsSinceRunningGameOrNormalExit != 0) {
                this.f6115bQ.numLoadsSinceRunningGameOrNormalExit = 0;
                this.f6115bQ.save();
            }
            this.f6125ca.m426b();
            float f2 = this.f6254cU * this.f6257cX;
            if (f2 != this.f6256cW) {
                float f3 = (this.f6163cZ / this.f6256cW) + this.f6146cx;
                float f4 = (this.f6164da / this.f6256cW) + this.f6147cy;
                this.f6256cW = f2;
                m4770j();
                if (this.f6162cY) {
                    m1052a(this.f6146cx - (((this.f6163cZ / this.f6256cW) + this.f6146cx) - f3), this.f6147cy - (((this.f6164da / this.f6256cW) + this.f6147cy) - f4));
                    this.f6162cY = false;
                }
            }
            if (this.f6139cq != 0.0f || this.f6140cr != 0.0f) {
                float f5 = 3.0f * f;
                float m2052g = this.f6139cq > 0.0f ? C0758f.m2052g(this.f6139cq, f5) : 0.0f;
                if (this.f6139cq < 0.0f) {
                    m2052g = C0758f.m2059f(this.f6139cq, -f5);
                }
                float f6 = m2052g + (0.15f * this.f6139cq);
                float m2052g2 = this.f6140cr > 0.0f ? C0758f.m2052g(this.f6140cr, f5) : 0.0f;
                if (this.f6140cr < 0.0f) {
                    m2052g2 = C0758f.m2059f(this.f6140cr, -f5);
                }
                float f7 = m2052g2 + (0.15f * this.f6140cr);
                if (C0758f.m2088c(this.f6139cq) <= f5) {
                    f6 = this.f6139cq;
                    this.f6139cq = 0.0f;
                } else {
                    this.f6139cq -= f6;
                }
                if (C0758f.m2088c(this.f6140cr) <= f5) {
                    f7 = this.f6140cr;
                    this.f6140cr = 0.0f;
                } else {
                    this.f6140cr -= f7;
                }
                this.f6146cx += f6;
                this.f6147cy += f7;
                m1052a(this.f6146cx, this.f6147cy);
                m1064P();
            }
            if (this.f6158cQ != this.f6159cR) {
                m4770j();
            }
            if (f > 3.0f) {
                f = 3.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (this.f6238bu >= 0.0f) {
                f = this.f6238bu;
            }
            this.f6104bA = (int) (this.f6104bA + (f * 16.666666f));
            m4777d(f);
            this.f1233q += i;
            this.f1234r++;
            if (this.f1234r >= 40) {
                if (this.f1233q == 0) {
                    this.f1233q = 1;
                }
                this.f1235s = (int) (((this.f1234r * 1000) / this.f1233q) + 0.5f);
                this.f1236t = this.f1233q / this.f1234r;
                this.f1233q = 0;
                this.f1234r = 0;
                if (this.f6115bQ.showFps) {
                    this.f1237u = this.f1235s + "fps";
                }
            }
            m1014ai();
            for (int i2 = 0; i2 < this.f6282dL.length; i2++) {
                this.f6282dL[i2] = true;
            }
            this.f6263dg = C0758f.m2162a(this.f6263dg, 0.1f * f);
            this.f6264dh = C0758f.m2162a(this.f6264dh, 0.1f * f);
            this.f6263dg = C0758f.m2110b(this.f6263dg, 5.0f);
            this.f6264dh = C0758f.m2110b(this.f6264dh, 5.0f);
            this.f6117bS.m1868a(f);
            m1064P();
            C0173b.m4905f();
            if (this.f6122bX.lock1) {
                float f8 = f;
                if (this.f6126cb.f4510t != 1) {
                    f8 *= this.f6126cb.f4510t;
                }
                this.f6122bX.m1578a(f8);
                if (!m4793a(true) && !this.f6122bX.f5504Y) {
                    this.f1249G += f8;
                    while (true) {
                        if (this.f1249G <= this.f6122bX.m1489c()) {
                            break;
                        } else if (this.f6122bX.m1597I()) {
                            this.f6122bX.f5504Y = true;
                            break;
                        } else {
                            this.f1249G -= this.f6122bX.m1489c();
                            this.f6122bX.m1576a(this.f6122bX.m1489c(), false);
                            if (this.f6122bX.f5504Y) {
                                break;
                            }
                            m4803a(this.f6122bX.m1489c());
                        }
                    }
                    if (!this.f6122bX.IsServer) {
                        if (this.f6122bX.f5511af || this.f6122bX.f5509ad) {
                            if (this.f6122bX.f5511af && this.f6122bX.f5509ad && this.f6239bx < (this.f6122bX.f5580X - this.f6122bX.f5501Q) - 5) {
                                this.f6122bX.LogError("nearly within frame range");
                                this.f6122bX.f5511af = false;
                            }
                            if (this.f6239bx > this.f6122bX.f5580X - 6) {
                                this.f6122bX.LogError("we have back within frame range");
                                this.f6122bX.f5511af = false;
                                this.f6122bX.f5509ad = false;
                            }
                        }
                        if (!this.f6122bX.f5509ad && this.f6239bx < (this.f6122bX.f5580X - this.f6122bX.f5501Q) - 10) {
                            this.f6122bX.LogError("we are slightly out of frame range, speeding up");
                            this.f6122bX.f5509ad = true;
                        }
                        if (!this.f6122bX.f5511af && this.f6239bx < (this.f6122bX.f5580X - this.f6122bX.f5501Q) - 30) {
                            this.f6122bX.LogError("we are out of frame range, fast forwarding (" + this.f6239bx + "->" + this.f6122bX.f5580X + ")");
                            this.f6122bX.f5511af = true;
                        }
                        if (!this.f6122bX.f5511af && this.f6122bX.f5509ad) {
                            this.f6122bX.f5510ae += f;
                            if (this.f6122bX.f5510ae > this.f6122bX.m1489c() * 3.0f) {
                                this.f6122bX.f5510ae = 0.0f;
                                this.f6122bX.m1576a(this.f6122bX.m1489c(), true);
                                if (!this.f6122bX.f5504Y) {
                                    m4803a(this.f6122bX.m1489c());
                                }
                            }
                        }
                        if (this.f6122bX.f5511af) {
                            this.f6122bX.m1576a(this.f6122bX.m1489c(), true);
                            if (!this.f6122bX.f5504Y) {
                                m4803a(this.f6122bX.m1489c());
                            }
                        }
                        if (this.f6239bx < this.f6122bX.f5580X - 90) {
                            this.f6122bX.m1576a(this.f6122bX.m1489c(), true);
                            if (!this.f6122bX.f5504Y) {
                                m4803a(this.f6122bX.m1489c());
                            }
                        }
                        if (this.f6239bx < this.f6122bX.f5580X - 120) {
                            this.f6122bX.m1576a(this.f6122bX.m1489c(), true);
                            if (!this.f6122bX.f5504Y) {
                                m4803a(this.f6122bX.m1489c());
                            }
                        }
                        if (this.f6239bx < this.f6122bX.f5580X - 600) {
                            this.f6122bX.m1576a(this.f6122bX.m1489c(), true);
                            if (!this.f6122bX.f5504Y) {
                                m4803a(this.f6122bX.m1489c());
                            }
                        }
                    }
                }
            } else if (this.f6126cb.m2414g()) {
                float f9 = f;
                if (this.f6126cb.f4510t != 1) {
                    f9 *= this.f6126cb.f4510t;
                }
                if (this.f6237bt != 1.0f) {
                    f9 *= this.f6237bt;
                }
                if (!m4793a(false)) {
                    this.f1249G += f9;
                    while (this.f1249G > this.f6122bX.m1489c()) {
                        this.f1249G -= this.f6122bX.m1489c();
                        if (this.f6122bX.m1597I()) {
                            break;
                        }
                        m4803a(this.f6122bX.m1489c());
                    }
                }
                if (this.f1249G > 100.0f) {
                    this.f1249G = 100.0f;
                }
                if (this.f1249G < 0.0f) {
                    this.f1249G = 0.0f;
                }
            } else if (!m4793a(false)) {
                m4803a(f);
            }
            if (m4793a(false)) {
                try {
                    Thread.sleep(2L);
                } catch (Exception e2) {
                }
            }
            this.f6119bU.m1162a(f);
            this.f6111bM.m2723b(f);
            this.f6112bN.m2669a(f);
            this.f6118bT.m2694b();
            C1058a.m739a().mo298a(f);
            this.f6128cd.m2381b(EnumC0729bm.f4578b);
            this.f6128cd.m2386a(EnumC0729bm.f4579c);
            if (!this.f6272du) {
                if (this.f6113bO.mo234a()) {
                    m4794a((InterfaceC0941l) null, f);
                } else if (this.f6079ao.mo241n()) {
                    m4794a(this.f6079ao.mo253b(true), f);
                } else {
                    InterfaceC0096f interfaceC0096f = this.f6079ao;
                    this.f6079ao.mo258a(f, i);
                    if (interfaceC0096f.mo252c() && !interfaceC0096f.mo250e()) {
                        synchronized (interfaceC0096f.mo248g()) {
                            if (interfaceC0096f.mo252c() && !interfaceC0096f.mo250e()) {
                                this.f6128cd.m2386a(EnumC0729bm.f4599w);
                                InterfaceC0941l mo253b = interfaceC0096f.mo253b(true);
                                this.f6128cd.m2381b(EnumC0729bm.f4599w);
                                if (!interfaceC0096f.mo250e()) {
                                    if (mo253b != null) {
                                        if (mo253b.mo829c()) {
                                            LoggerMaybe.LogDebug2("gameengine draw: bufferedCanvas drawn on");
                                        }
                                        mo253b.mo834a(true);
                                    }
                                    if (mo253b == null) {
                                        LoggerMaybe.m968f("GameEngine gameViewCanvas is null after lockCanvas - " + interfaceC0096f.hashCode());
                                    }
                                    m4794a(mo253b, f);
                                    this.f6113bO.mo194a((InterfaceC0941l) null);
                                }
                                if (mo253b != null) {
                                    try {
                                        try {
                                            interfaceC0096f.mo257a(mo253b, true);
                                        } catch (IllegalArgumentException e3) {
                                            e3.printStackTrace();
                                            LoggerMaybe.m968f("GameEngine catch currentGameView - " + interfaceC0096f.hashCode());
                                            LoggerMaybe.m968f("GameEngine catch currentGameView.gameThreadSync - " + interfaceC0096f.mo248g().hashCode());
                                            interfaceC0096f.mo247h();
                                        }
                                    } catch (IllegalStateException e4) {
                                        e4.printStackTrace();
                                        LoggerMaybe.m968f("GameEngine catch currentGameView - " + interfaceC0096f.hashCode());
                                        LoggerMaybe.m968f("GameEngine catch currentGameView.gameThreadSync - " + interfaceC0096f.mo248g().hashCode());
                                    }
                                }
                            }
                        }
                    }
                    this.f6079ao.mo254b(f, i);
                }
            }
            this.f6272du = false;
            m1055Y();
            this.f6128cd.m2381b(EnumC0729bm.f4579c);
            if (this.f6271dt) {
                this.f6271dt = false;
                String m = m954l(this.f6165dk) != null ? m952m(this.f6165dk) : null;
                if (this.f6122bX.lock1) {
                    m = null;
                    new C0192a().start();
                }
                if (m != null) {
                    LoggerMaybe.LogDebug2("gotoNextLevel: Loading next level: " + m);
                    this.f6165dk = m;
                    this.f6117bS.f5115e.m1751b();
                    m4791a(true, false, EnumC1063s.f6740b);
                } else {
                    LoggerMaybe.LogDebug2("gotoNextLevel: No next level, finishing");
                    this.f6242bG = false;
                    ActivityC0097g mo246i = this.f6079ao.mo246i();
                    if (mo246i != null) {
                        mo246i.mo5212b();
                        mo246i.mo117m();
                    } else {
                        LoggerMaybe.LogDebug2("gotoNextLevel: Error getInGameActivity==null");
                    }
                }
            }
            if (!this.f6081aq && this.f6240bE && !this.f1225i) {
                LogDebug2("starting method trace");
                Debug.startMethodTracing("lukeTrace", 110000000);
                this.f1225i = true;
            }
            this.f6241bF = true;
            this.f6290ec.m736a();
            this.f6128cd.m2381b(EnumC0729bm.f4577a);
            this.f6128cd.m2383b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.i$a */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/i$a.class */
    public class C0192a extends Thread {
        C0192a() {
        }

        public void run() {
            C0191i.this.f6122bX.m1493b("gotoNextLevel");
        }
    }

    /* renamed from: g */
    public void m4773g() {
        ActivityC0097g mo246i = this.f6079ao.mo246i();
        if (mo246i != null) {
            if (!mo246i.m5612c()) {
                mo246i.mo5212b();
                return;
            } else {
                LoggerMaybe.m990b("stopAndClose: inGameActivity is isFinishing");
                return;
            }
        }
        LoggerMaybe.m990b("stopAndClose: Error getInGameActivity==null");
    }

    /* renamed from: a */
    public void m4803a(float f) {
        if (m999ax() && f < 0.1f) {
            C0831ad.m1451g("updateAllGame1: deltaSpeed:" + f + " frame:" + this.f6239bx + " network.currentStepRate:" + this.f6122bX.m1489c());
        }
        if (this.f6237bt != 1.0f && !this.f6122bX.lock1 && !this.f6126cb.m2414g()) {
            f *= this.f6237bt;
        }
        float f2 = f * this.f1250H;
        this.f1251I = f2 + 2.0f;
        this.f1252J = f2;
        this.f6122bX.m1504b(f2);
        this.f6102by = (int) (this.f6102by + (f2 * 16.666666f));
        this.f6130cf.m2368c();
        this.f6126cb.m2435a(f2);
        this.f6239bx++;
        AbstractC0197n.m4648g(f2);
        if (this.f6110bL != null) {
            this.f6110bL.m4908e(f2);
        }
        if (m999ax() && f2 < 0.1f) {
            C0831ad.m1451g("updateAllGame2: deltaSpeed:" + f2 + " frame:" + this.f6239bx);
        }
        AbstractC0244am.m4488bF();
        C1104o m440dI = AbstractC1120w.m440dI();
        Object[] m524b = m440dI.m524b();
        int size = m440dI.size();
        boolean ax = m999ax();
        for (int i = 0; i < size; i++) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) m524b[i];
            if (ax && f2 != this.f1252J) {
                C0831ad.m1445h("JIT bug detected, attempting to correct. before object:" + abstractC1120w.f6951ee + " frame:" + this.f6239bx + " deltaSpeed:" + f2);
                f2 = this.f1252J;
            }
            abstractC1120w.mo1720a(f2);
        }
        if (m999ax() && f2 < 0.1f) {
            C0831ad.m1451g("updateAllGame3: deltaSpeed:" + f2 + " frame:" + this.f6239bx);
        }
        int size2 = m440dI.f6901a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1108r c1108r = (C1108r) m440dI.f6901a.get(i2);
            if (c1108r.f6911a == EnumC1107q.f6908a) {
                AbstractC1120w abstractC1120w2 = (AbstractC1120w) c1108r.f6912b;
                if (!abstractC1120w2.f6952eg) {
                    abstractC1120w2.mo1720a(f2);
                }
            }
        }
        this.f6128cd.m2386a(EnumC0729bm.f4589m);
        this.f6127cc.m3173a();
        this.f6128cd.m2381b(EnumC0729bm.f4589m);
        AbstractC0623y.m2785g(f2);
        C0451j.m3574s(f2);
        C0451j.m3706a(f2, 0);
        this.f1226j++;
        if (this.f1226j >= 1000) {
            this.f1226j = 0;
            int i3 = 0;
            Iterator it = AbstractC0244am.m4488bF().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am.f1607bT && !(abstractC0244am instanceof C0243al)) {
                    i3++;
                }
            }
            if (i3 > 70) {
                Iterator it2 = AbstractC0244am.m4488bF().iterator();
                while (it2.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it2.next();
                    if ((abstractC0244am2 instanceof AbstractC0244am) && abstractC0244am2.f1607bT && !(abstractC0244am2 instanceof C0243al) && abstractC0244am2.f1608bU < this.f6102by - 30000 && i3 > 70) {
                        abstractC0244am2.mo2638a();
                        i3--;
                    }
                }
            }
        }
        this.f6128cd.m2386a(EnumC0729bm.f4588l);
        AbstractC0197n.m4651f(f2);
        this.f6128cd.m2381b(EnumC0729bm.f4588l);
        C0741a.m2358a(f2);
        this.f6116bR.m2343a(f2);
        this.f1246D.m2347a(f2);
        C1117y.m484a(f2);
        if (this.f6129ce != null) {
            this.f6129ce.m761c(f2);
        }
        this.f6128cd.m2386a(EnumC0729bm.f4591o);
        this.f6120bV.m2716a(f2);
        this.f6128cd.m2381b(EnumC0729bm.f4591o);
        this.f6128cd.m2386a(EnumC0729bm.f4590n);
        this.f6121bW.m1746a(f2);
        this.f6128cd.m2381b(EnumC0729bm.f4590n);
        this.f6119bU.m1147b(f2);
    }

    /* renamed from: a */
    public void m4794a(InterfaceC0941l interfaceC0941l, float f) {
        synchronized (this.f6226ak) {
            m4784b(interfaceC0941l, f);
        }
    }

    /* renamed from: h */
    public boolean m4772h() {
        if (this.f1253K == null) {
            this.f1253K = new C0193j("assets/shaders/post_base.frag");
        }
        if (this.f1254L == null) {
            this.f1254L = new C0193j("assets/shaders/post_displacement.frag");
        }
        this.f1253K.m4753a(this.f6113bO);
        this.f1254L.m4753a(this.f6113bO);
        if (this.f1253K.f1285g || this.f1254L.f1285g) {
            if (!this.f1255M) {
                this.f1255M = true;
                LoggerMaybe.LogDebug2("setupPostprocessing: failed");
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m4796a(C0193j c0193j) {
        if (this.f1256N != null) {
            throw new RuntimeException("Layer already enabled");
        }
        this.f1256N = this.f6113bO;
        this.f6113bO = c0193j.f1280b;
        this.f6113bO.mo143i();
        this.f6113bO.mo212a(new Rect(0, 0, this.f6113bO.mo139m(), this.f6113bO.mo138n()));
        this.f6113bO.mo167b(c0193j.f1284f, c0193j.f1283e);
    }

    /* renamed from: b */
    public void m4785b(C0193j c0193j) {
        if (this.f1256N == null) {
            throw new RuntimeException("Layer not enabled");
        }
        this.f6113bO.mo142j();
        this.f6113bO.mo136p();
        this.f6113bO = this.f1256N;
        this.f1256N = null;
        this.f6113bO.mo167b(c0193j.f1284f, c0193j.f1283e);
    }

    /* renamed from: b */
    public void m4784b(InterfaceC0941l interfaceC0941l, float f) {
        if (interfaceC0941l == null) {
            m989b("drawAll", "canvas is null, not may not be available yet");
        } else if (f6086aB) {
        } else {
            this.f6113bO.mo194a(interfaceC0941l);
            this.f6113bO.mo208a(this.f6079ao.mo251d());
            this.f6113bO.mo145g();
            this.f6103bz++;
            C0937h.f6442G = 0.0f;
            if (this.f6271dt) {
                this.f6113bO.mo171b(Color.m5539a(0, 0, 0));
                this.f6113bO.mo186a("Loading..", this.f6136cn, this.f6137co, this.f6169do);
                return;
            }
            float f2 = this.f6246cm;
            if (f2 != 1.0f) {
                this.f6113bO.mo143i();
                this.f6113bO.mo232a(f2, f2);
            }
            boolean m997az = LoggerMaybe.m997az();
            if (m997az && m964h(113) && m964h(44)) {
                m997az = false;
            }
            if (m997az && !m4772h()) {
                m997az = false;
            }
            if (m997az) {
                m4796a(this.f1253K);
                try {
                    this.f6113bO.mo171b(Color.m5539a(0, 0, 0));
                    this.f6128cd.m2386a(EnumC0729bm.f4580d);
                    m4780c((InterfaceC0941l) null, f);
                    this.f6128cd.m2381b(EnumC0729bm.f4580d);
                    m4785b(this.f1253K);
                    this.f1253K.m4751b();
                    if (!this.f1254L.m4754a()) {
                        m4796a(this.f1254L);
                        try {
                            this.f6113bO.mo171b(Color.m5539a(128, 128, 255));
                            m1063Q();
                            int m2331a = this.f6116bR.m2331a(f, 101);
                            this.f6116bR.f4687l = null;
                            m4785b(this.f1254L);
                            if (m2331a > 0) {
                                float mo133s = this.f6113bO.mo133s();
                                this.f1254L.f1282d.m915a("screenBase", this.f1253K.f1279a);
                                this.f1254L.f1282d.m912b("screenBaseSize", this.f1253K.f1279a);
                                this.f1254L.f1282d.m917a("u_resolution", this.f6134ck, this.f6135cl);
                                this.f1254L.f1282d.m918a("u_offsetBy", 0.2f * this.f6256cW);
                                this.f1254L.f1282d.m918a("u_uiScaling", mo133s);
                                this.f1254L.m4751b();
                            }
                        } catch (Throwable th) {
                            m4785b(this.f1254L);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    m4785b(this.f1253K);
                    throw th2;
                }
            } else {
                this.f6128cd.m2386a(EnumC0729bm.f4580d);
                m4780c(interfaceC0941l, f);
                this.f6128cd.m2381b(EnumC0729bm.f4580d);
            }
            if (!m940z()) {
                this.f6128cd.m2386a(EnumC0729bm.f4582f);
                m4776d(interfaceC0941l, f);
                this.f6128cd.m2381b(EnumC0729bm.f4582f);
            }
            if (this.f6115bQ.showFps && this.f6160cS == 0.0f && !this.f6161cT && !this.f6159cR) {
                this.f6113bO.mo186a(this.f1237u, 100.0f, 35.0f, this.f1229m);
            }
            if (f1222f != null) {
                this.f6113bO.mo186a(f1222f, 100.0f, 85.0f, this.f1229m);
            }
            if (!this.f6081aq && (this.f6113bO.mo153d() != null || LoggerMaybe.f6207aW)) {
                this.f6117bS.m1804c(f);
            }
            C0451j.m3613dC();
            this.f6113bO.mo144h();
            if (f2 != 1.0f) {
                interfaceC0941l.mo859a();
            }
        }
    }

    /* renamed from: i */
    public boolean m4771i() {
        if (!this.f6115bQ.showUnitIcons) {
            return false;
        }
        if (this.f6256cW >= 0.7d || this.f6152cD < this.f6110bL.m4898i() - 5.0f || this.f6149cA < this.f6110bL.m4897j() - 5.0f) {
            return m1078B() ? ((double) this.f6256cW) < 0.1d : m1002au() ? ((double) this.f6256cW) < 0.27d : ((double) this.f6256cW) < 0.4d;
        }
        return true;
    }

    /* renamed from: b */
    public void m4788b(float f) {
        boolean z = false;
        if (this.f6253cP.f230a < 0 || this.f6253cP.f231b < 0 || this.f6253cP.f232c > this.f6110bL.m4898i() || this.f6253cP.f233d > this.f6110bL.m4897j()) {
            z = true;
        }
        if (z) {
            this.f6113bO.mo171b(Color.m5539a(0, 0, 0));
        }
    }

    /* renamed from: c */
    public void m4781c(float f) {
    }

    /* renamed from: c */
    public void m4780c(InterfaceC0941l interfaceC0941l, float f) {
        if (!this.f6242bG) {
            return;
        }
        this.f6128cd.m2386a(EnumC0729bm.f4584h);
        this.f1266X.m513b();
        this.f6170dv = 0;
        boolean z = false;
        AbstractC1120w[] m519a = AbstractC0244am.f6962eo.m519a();
        int size = AbstractC1120w.f6962eo.size();
        for (int i = 0; i < size; i++) {
            AbstractC1120w abstractC1120w = m519a[i];
            boolean z2 = abstractC1120w.f6954ei;
            boolean mo3183a = abstractC1120w.mo3183a(this);
            abstractC1120w.f6954ei = mo3183a;
            if (z2 != mo3183a) {
                z = true;
            }
            if (mo3183a) {
                this.f1266X.mo514a(abstractC1120w);
            }
        }
        if (this.f1265W.size() != this.f1266X.size()) {
            z = true;
        }
        this.f6128cd.m2381b(EnumC0729bm.f4584h);
        this.f6128cd.m2386a(EnumC0729bm.f4585i);
        if (z) {
            C1109s c1109s = this.f1265W;
            this.f1265W = this.f1266X;
            this.f1266X = c1109s;
        }
        if (!m4771i()) {
            Collections.sort(this.f1265W, AbstractC1120w.f6960ef);
        }
        this.f6128cd.m2381b(EnumC0729bm.f4585i);
        this.f6128cd.m2386a(EnumC0729bm.f4593q);
        this.f6128cd.m2386a(EnumC0729bm.f4595s);
        this.f6113bO.mo143i();
        this.f6113bO.mo212a(this.f6247cJ);
        this.f6128cd.m2381b(EnumC0729bm.f4595s);
        this.f6128cd.m2386a(EnumC0729bm.f4594r);
        m4788b(f);
        this.f6128cd.m2381b(EnumC0729bm.f4594r);
        if (this.f6115bQ.renderFancyWater) {
            if (this.f1257O == null) {
                this.f1257O = this.f6113bO.mo225a(C0067R.drawable.water_cloud);
            }
            if (this.f1258P == null) {
                this.f1258P = this.f6113bO.mo225a(C0067R.drawable.water_layer1);
            }
            if (this.f1259Q == null) {
                this.f1259Q = this.f6113bO.mo225a(C0067R.drawable.water_layer2);
            }
            this.f1261S.m5466a(this.f6247cJ);
            this.f1260R += 0.05f * f;
            if (this.f1260R > 100.0f) {
                this.f1260R -= 100.0f;
            }
            this.f6113bO.mo199a(this.f1257O, this.f1261S, (Paint) null, this.f6142ct / 6, this.f6143cu / 6, 1, 1);
            this.f1261S.m5466a(this.f6248cK);
            this.f1262T.m5453a(this.f6248cK);
            this.f6113bO.mo143i();
            m1063Q();
            this.f6113bO.mo196a(this.f1259Q, this.f1262T, (Paint) null, this.f6142ct + this.f1260R, this.f6143cu + this.f1260R, 0, 0);
            this.f6113bO.mo196a(this.f1258P, this.f1262T, (Paint) null, this.f6142ct, this.f6143cu, 0, 0);
            this.f6113bO.mo142j();
        }
        this.f6128cd.m2386a(EnumC0729bm.f4596t);
        if (this.f6110bL != null && m1006aq()) {
            this.f6110bL.m4913d(f);
        }
        this.f6128cd.m2381b(EnumC0729bm.f4596t);
        m1063Q();
        this.f6113bO.mo212a(this.f6248cK);
        boolean m4771i = m4771i();
        this.f6119bU.m1141c(f);
        this.f6128cd.m2381b(EnumC0729bm.f4593q);
        AbstractC1120w[] m519a2 = this.f1265W.m519a();
        int size2 = this.f1265W.size();
        this.f6258db = true;
        this.f6259dc = true;
        this.f6260dd = true;
        this.f6261de = true;
        this.f6262df = true;
        if (this.f6256cW < 0.45d) {
            this.f6260dd = false;
            this.f6258db = false;
            this.f6262df = false;
        }
        if (this.f6256cW < 0.3d) {
            this.f6261de = false;
            this.f6259dc = false;
        }
        if (!m4771i) {
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractC1120w abstractC1120w2 = m519a2[i2];
                if (abstractC1120w2.f6955ej == 0) {
                    abstractC1120w2.mo3001c(f);
                }
            }
        }
        C0741a.m2351b(f);
        this.f6128cd.m2386a(EnumC0729bm.f4583g);
        this.f6116bR.m2331a(f, 1);
        this.f6128cd.m2381b(EnumC0729bm.f4583g);
        this.f6128cd.m2386a(EnumC0729bm.f4592p);
        if (m4771i) {
            if (this.f6117bS.m1769p() == 0) {
                AbstractC0244am.f1595bH.m5523a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
                AbstractC0244am.f1596bI.m5523a(255, 255, 255, 255);
            } else {
                AbstractC0244am.f1595bH.m5523a(175, 175, 175, 175);
                AbstractC0244am.f1596bI.m5523a(255, 255, 255, 255);
            }
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC1120w abstractC1120w3 = m519a2[i3];
                if (!abstractC1120w3.m437f(f)) {
                    abstractC1120w3.mo3001c(f);
                }
            }
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC1120w abstractC1120w4 = m519a2[i4];
                abstractC1120w4.mo3005a(f, true);
                abstractC1120w4.m436p(f);
            }
        } else {
            for (int i5 = 0; i5 < size2; i5++) {
                m519a2[i5].m441d(f);
            }
            for (int i6 = 0; i6 < size; i6++) {
                AbstractC1120w abstractC1120w5 = m519a[i6];
                if (!abstractC1120w5.f6954ei) {
                    if (abstractC1120w5 instanceof AbstractC0244am) {
                        AbstractC0244am abstractC0244am = (AbstractC0244am) abstractC1120w5;
                        if (abstractC0244am.f1644cE) {
                            if (abstractC0244am.f1609bV != this.f6099bs && !abstractC0244am.m4442ce()) {
                            }
                        }
                    }
                }
                abstractC1120w5.mo3073e(f);
                if (!abstractC1120w5.f6954ei) {
                    abstractC1120w5.m436p(f);
                }
            }
            for (int i7 = 0; i7 < size2; i7++) {
                AbstractC1120w abstractC1120w6 = m519a2[i7];
                if (abstractC1120w6.f6955ej != 0 && abstractC1120w6.f6955ej != 10) {
                    abstractC1120w6.mo3001c(f);
                }
            }
            for (int i8 = 0; i8 < size2; i8++) {
                AbstractC1120w abstractC1120w7 = m519a2[i8];
                abstractC1120w7.mo3005a(f, false);
                abstractC1120w7.m436p(f);
            }
            AbstractC0197n.m4645h(f);
        }
        this.f6260dd = true;
        this.f6261de = true;
        this.f6128cd.m2381b(EnumC0729bm.f4592p);
        this.f6128cd.m2386a(EnumC0729bm.f4583g);
        this.f6116bR.m2331a(f, 2);
        this.f6128cd.m2381b(EnumC0729bm.f4583g);
        for (int i9 = 0; i9 < size2; i9++) {
            AbstractC1120w abstractC1120w8 = m519a2[i9];
            if (abstractC1120w8.f6955ej == 10) {
                abstractC1120w8.mo3001c(f);
            }
        }
        this.f1246D.m2345b(f);
        if (this.f6129ce != null) {
            this.f6129ce.m777a(f);
        }
        m4781c(f);
        C1117y.m462b(f);
        this.f6127cc.m3160c(f);
        this.f6128cd.m2386a(EnumC0729bm.f4581e);
        this.f6113bO.mo142j();
        this.f6128cd.m2381b(EnumC0729bm.f4581e);
    }

    /* renamed from: d */
    public void m4776d(InterfaceC0941l interfaceC0941l, float f) {
        this.f6117bS.m1817b(f);
        if (this.f6129ce != null) {
            this.f6129ce.m765b(f);
        }
        this.f6121bW.m1726e(f);
        this.f6116bR.m2321b(f);
        if (this.f6115bQ.showFps && this.f6160cS == 0.0f) {
            this.f6128cd.m2380c();
        }
        if (this.f6245cg) {
            this.f6113bO.mo186a("Look Mode", this.f6136cn, this.f6137co, this.f6169do);
        }
        if (this.f6232bm) {
            int i = 20;
            for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                AbstractC0197n m4638k = AbstractC0197n.m4638k(i2);
                if (m4638k != null && (m4638k instanceof C0136a)) {
                    C0136a c0136a = (C0136a) m4638k;
                    this.f6113bO.mo186a(c0136a.f1306k + "| c:" + c0136a.f1310o, 20.0f, i, this.f6167dm);
                    i += 20;
                }
            }
        }
    }

    /* renamed from: j */
    public void m4770j() {
        this.f6132ci = m1058V();
        m1057W();
        this.f6136cn = this.f6134ck / 2.0f;
        this.f6137co = this.f6135cl / 2.0f;
        this.f6138cp = (int) (this.f6135cl / 3.0f);
        float f = (int) (this.f6134ck / 3.0f);
        if (this.f6138cp > f) {
            this.f6138cp = f;
        }
        this.f6138cp = C0758f.m2109b(this.f6138cp, 60.0f, (int) (250.0f * this.f6132ci));
        float f2 = this.f6146cx + this.f6156cH;
        float f3 = this.f6147cy + this.f6157cI;
        if (this.f6159cR) {
            this.f6153cE = this.f6134ck;
            this.f6154cF = this.f6134ck;
        } else {
            this.f6154cF = (this.f6134ck - this.f6138cp) + 1.0f;
            if (C0797f.f5247bA) {
                this.f6153cE = this.f6134ck;
            } else {
                this.f6153cE = this.f6154cF;
            }
        }
        if (this.f6153cE < 1.0f) {
            this.f6153cE = 1.0f;
        }
        if (this.f6154cF < 1.0f) {
            this.f6154cF = 1.0f;
        }
        if (this.f6158cQ != this.f6159cR) {
            if (!this.f6159cR) {
                f2 -= (this.f6138cp / 2.0f) / this.f6256cW;
            } else {
                f2 += (this.f6138cp / 2.0f) / this.f6256cW;
            }
        }
        this.f6158cQ = this.f6159cR;
        this.f6155cG = this.f6135cl;
        this.f6148cz = this.f6153cE / this.f6256cW;
        this.f6149cA = this.f6155cG / this.f6256cW;
        this.f6152cD = this.f6154cF / this.f6256cW;
        this.f6156cH = this.f6148cz / 2.0f;
        this.f6157cI = this.f6149cA / 2.0f;
        this.f6247cJ.m5467a(0, 0, (int) this.f6153cE, (int) this.f6155cG);
        this.f6248cK.m5467a(0, 0, ((int) this.f6148cz) + 1, ((int) this.f6149cA) + 1);
        this.f6249cL.m5454a(0.0f, 0.0f, this.f6148cz + 1.0f, this.f6149cA + 1.0f);
        m1052a(f2 - this.f6156cH, f3 - this.f6157cI);
    }

    /* renamed from: b */
    public void m4786b(int i, int i2) {
        m4799a(i, i2, 1.0f);
    }

    /* renamed from: a */
    public void m4799a(int i, int i2, float f) {
        this.f6134ck = i;
        this.f6135cl = i2;
        this.f6246cm = f;
        m4770j();
    }

    /* renamed from: k */
    public String m4769k() {
        if (LoggerMaybe.f6208aX) {
            return "com.corrodinggames.rts.java";
        }
        if (LoggerMaybe.f6209aY) {
            return "com.corrodinggames.rts.gdx";
        }
        if (f6205aU) {
            return "com.corrodinggames.rts.server";
        }
        if (this.f6227am == null) {
            return "<null context>";
        }
        return this.f6227am.mo5599h();
    }

    /* renamed from: l */
    public String m4768l() {
        if (LoggerMaybe.f6208aX) {
            return "java";
        }
        if (LoggerMaybe.f6209aY) {
            return "java-gdx";
        }
        if (f6205aU) {
            return "dedicatedServer";
        }
        if (this.f6227am == null) {
            return "<null context>";
        }
        try {
            return this.f6227am.mo5601f().getInstallerPackageName(m4769k());
        } catch (IllegalArgumentException e) {
            return "IllegalArgumentException: " + e.getMessage();
        }
    }

    /* renamed from: m */
    public boolean m4767m() {
        if (m4759u().contains("p")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m4779c(boolean z) {
        if (f6205aU || z) {
            return 173;
        }
        try {
            return this.f6227am.mo5601f().getPackageInfo(this.f6227am.mo5599h(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public String m4766n() {
        if (!m1004as()) {
            return null;
        }
        try {
            Signature[] signatureArr = this.f6227am.mo5601f().getPackageInfo(this.f6227am.mo5599h(), 64).signatures;
            if (0 < signatureArr.length) {
                return C0758f.m2091b(signatureArr[0].toByteArray());
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: o */
    public boolean m4765o() {
        if (!LoggerMaybe.f6210aZ) {
            if (m4764p() || f6206aV) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m4764p() {
        if (AbstractC0623y.class.getSimpleName().equals("OrderableUnit")) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public String m4763q() {
        String m4761s = m4761s();
        if ("1" != 0 && !VariableScope.nullOrMissingString.equals("1")) {
            m4761s = m4761s + "-1";
        }
        return m4761s;
    }

    /* renamed from: r */
    public void m4762r() {
        f1217a = null;
        m4761s();
    }

    /* renamed from: s */
    public String m4761s() {
        if (f1217a != null) {
            return f1217a;
        }
        String str = "v" + m4760t();
        if (!LoggerMaybe.f6190as || f6206aV) {
            str = "DEBUG BUILD - " + str;
        } else if (LoggerMaybe.f6191at) {
            str = "TESTING BUILD - " + str;
        } else if (str.contains("p")) {
            str = "BETA VERSION - " + str;
        }
        if (!LoggerMaybe.f6210aZ && m4764p()) {
            str = "RAW - " + str;
        }
        f1217a = str;
        return f1217a;
    }

    /* renamed from: t */
    public String m4760t() {
        return "1.15p10";
    }

    /* renamed from: u */
    public String m4759u() {
        return "1.15p10";
    }

    /* renamed from: v */
    public synchronized void m4758v() {
        this.f1271ac = false;
        if (this.f1270ab != null) {
            this.f1270ab.cancel();
            this.f1270ab = null;
        }
    }

    /* renamed from: a */
    public synchronized void m4798a(Activity activity, InterfaceC0096f interfaceC0096f, boolean z) {
        synchronized (this.f1272ad) {
            if (!f6205aU) {
                interfaceC0096f.mo259a();
            }
            this.f6078an = activity;
            this.f6081aq = z;
            this.f6159cR = this.f6081aq;
            if (z && !this.f6242bG && !this.f6244bI && !LoggerMaybe.f6083ay && !this.f6122bX.lock1) {
                m4757w();
            }
            InterfaceC0096f interfaceC0096f2 = this.f6080ap;
            if (this.f6079ao == null) {
                this.f6079ao = interfaceC0096f;
            }
            this.f6080ap = interfaceC0096f;
            if (interfaceC0096f2 != null && interfaceC0096f2 != interfaceC0096f) {
                interfaceC0096f2.mo245j();
            }
            if (interfaceC0096f != null) {
                interfaceC0096f.mo242m();
            }
            if (this.f6117bS != null) {
                this.f6117bS.m1793e();
            }
            m4758v();
            m1071I();
        }
    }

    /* renamed from: w */
    public synchronized void m4757w() {
        if (this.f1273ae > 20) {
            return;
        }
        int i = this.f6115bQ.nextBackgroundMap;
        this.f6115bQ.nextBackgroundMap++;
        if (this.f6115bQ.nextBackgroundMap > 3) {
            this.f6115bQ.nextBackgroundMap = 1;
        }
        this.f6115bQ.save();
        int m2104b = C0758f.m2104b(i, 1, 3);
        this.f6166dl = null;
        this.f6165dk = "maps/menu_background/menu" + m2104b + ".tmx";
        try {
            AbstractC0197n.m4692b(10, true);
            for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                C0136a c0136a = new C0136a(i2);
                if (i2 == 0) {
                    this.f6099bs = c0136a;
                }
            }
            m4792a(false, EnumC1063s.f6739a);
            this.f6243bH = true;
            this.f6117bS.m1758x();
            if (!this.f6242bG) {
                LoggerMaybe.m965g("Menu load failed");
                this.f1273ae++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    void m4777d(float f) {
        if (this.f6081aq && !this.f6243bH) {
            if (this.f1275ag == null) {
                this.f1275ag = m4756x();
                if (this.f1274af == this.f1275ag) {
                    this.f1275ag = null;
                }
            }
            if (this.f1274af == null) {
                this.f1274af = this.f1275ag;
                this.f1275ag = null;
            }
            if (this.f1276ah != 0.0f && this.f1275ag != null) {
                m4802a(f, this.f1275ag.f6957el, this.f1275ag.f6958em, this.f1276ah * 0.5f);
            }
            if (this.f1274af != null) {
                boolean m4802a = m4802a(f, this.f1274af.f6957el, this.f1274af.f6958em, (1.0f - this.f1276ah) * 0.5f);
                if (C0758f.m2160a(this.f6146cx + this.f6156cH, this.f6147cy + this.f6157cI, this.f1274af.f6957el, this.f1274af.f6958em) < 6400.0f) {
                    m4802a = true;
                }
                if (m4802a) {
                    this.f1277ai = true;
                }
            }
            if (this.f1277ai) {
                this.f1276ah += 0.01f * f;
                if (this.f1276ah >= 1.0f) {
                    this.f1276ah = 0.0f;
                    this.f1274af = null;
                    this.f1277ai = false;
                }
            }
        }
    }

    /* renamed from: a */
    AbstractC0244am m4795a(AbstractC0197n abstractC0197n) {
        int i = 0;
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (!abstractC0244am.mo1714u() && (abstractC0244am.f1609bV == abstractC0197n || abstractC0197n == null)) {
                i++;
            }
        }
        if (i > 0) {
            int m2154a = C0758f.m2154a(0, i - 1);
            int i2 = 0;
            Iterator it2 = AbstractC0244am.f1590bD.iterator();
            while (it2.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it2.next();
                if (!abstractC0244am2.mo1714u() && (abstractC0244am2.f1609bV == abstractC0197n || abstractC0197n == null)) {
                    if (i2 == m2154a) {
                        return abstractC0244am2;
                    }
                    i2++;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: x */
    AbstractC0244am m4756x() {
        AbstractC0244am m4795a = m4795a(this.f6099bs);
        if (m4795a != null) {
            return m4795a;
        }
        return m4795a((AbstractC0197n) null);
    }

    /* renamed from: a */
    public boolean m4802a(float f, float f2, float f3, float f4) {
        float m2074d = C0758f.m2074d(this.f6146cx + this.f6156cH, this.f6147cy + this.f6157cI, f2, f3);
        float m2160a = C0758f.m2160a(this.f6146cx + this.f6156cH, this.f6147cy + this.f6157cI, f2, f3);
        float f5 = f4 * f;
        float f6 = 15.0f;
        if (15.0f < f5 + 1.0f) {
            f6 = f5 + 1.0f;
        }
        if (m2160a < f6 * f6 || this.f6141cs) {
            return true;
        }
        this.f6150cB += C0758f.m2043i(m2074d) * f5;
        this.f6151cC += C0758f.m2048h(m2074d) * f5;
        if (C0758f.m2088c(this.f6150cB) >= 1.0f || C0758f.m2088c(this.f6151cC) >= 1.0f) {
            this.f6146cx += this.f6150cB;
            this.f6147cy += this.f6151cC;
            this.f6150cB = 0.0f;
            this.f6151cC = 0.0f;
            m1052a(this.f6146cx, this.f6147cy);
            return false;
        }
        return false;
    }

    /* renamed from: y */
    public int m4755y() {
        return this.f1220d;
    }
}
