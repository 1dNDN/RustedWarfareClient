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
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0243al;
import com.corrodinggames.rts.game.units.EnumC0249ar;
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
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.EnumC0729bm;
import com.corrodinggames.rts.gameFramework.EnumC1063s;
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
public class C0191i extends Core {

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
    public boolean m5185a() {
        if (this.f6117bS.f5126p) {
            return true;
        }
        if (this.f6279dG != null && this.f6279dG.mo105b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m5174a(boolean z) {
        if (!z || this.f6126cb.m2464h()) {
            if (this.f6117bS.f5126p || this.f6098bp) {
                return true;
            }
            if (this.f6081aq && !this.f6243bH) {
                return true;
            }
            if (this.f6241bF && this.f6279dG != null && this.f6279dG.mo105b()) {
                return true;
            }
        }
        if ((z && !this.f6122bX.f5539bm) || this.f6122bX.m1639I()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public int m5170b() {
        return this.f1235s;
    }

    /* renamed from: c */
    public boolean m5163c() {
        return this.f6186eg;
    }

    /* renamed from: d */
    public boolean m5159d() {
        return this.f6187eh;
    }

    /* renamed from: a */
    public synchronized void m5178a(Context context) {
        Log.m5772d("RustedWarfare", "--- ----------------- ----");
        Log.m5772d("RustedWarfare", "--- GameEngine:init() ----");
        Log.m5772d("RustedWarfare", "--- ----------------- ----");
        if (this.f6229bi) {
            Log.m5772d("RustedWarfare", "GameEngine init has already been called");
            return;
        }
        Core.LogDebug2("Version:" + m5144q());
        if (m1086B() && getClass().equals(C0191i.class)) {
            throw new RuntimeException("inSpace but class is:" + getClass());
        }
        System.gc();
        m971h("Asset Index");
        this.f6109bK = new C1096i(context);
        long m2440a = C0727bl.m2440a();
        this.f6128cd = new C0727bl(this);
        this.f6128cd.m2436a(EnumC0729bm.f4605C);
        if (f6205aU) {
            this.f6131ch = 1.0f;
        } else {
            DisplayMetrics displayMetrics = context.mo6012e().getDisplayMetrics();
            this.f6131ch = context.mo6012e().getDisplayMetrics().density;
            Core.LogDebug2("densityScaleRaw: " + this.f6131ch);
            m5181a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        this.f6131ch *= this.f1221e;
        Core.LogDebug2("densityScaleRaw*densityScaleMultiplier: " + this.f6131ch);
        if (Core.m999b(context)) {
            this.f6228ar = true;
        }
        this.f1247E = new C0171b();
        this.f6234bo = false;
        m971h("InputController");
        this.f6118bT = new C0638ac();
        this.f6118bT.m2748a();
        m971h("SettingsEngine");
        this.settingEngine = SettingsEngine.getInstance(context);
        this.settingEngine.loadMainExternalFolder(true);
        C0750a.m2286b();
        int i = 3;
        if (f6210aZ) {
            i = 1;
        }
        if (this.settingEngine.numIncompleteLoadAttempts > 1 || this.settingEngine.numLoadsSinceRunningGameOrNormalExit > i) {
            this.f6183ed = true;
            if (this.settingEngine.numIncompleteLoadAttempts > 2 || this.settingEngine.numLoadsSinceRunningGameOrNormalExit > 4) {
                this.settingEngine.forceEnglish = true;
                this.f6184ee = true;
            }
            if (this.settingEngine.numIncompleteLoadAttempts > 3) {
                this.settingEngine.newRender = false;
            }
            if (this.settingEngine.numIncompleteLoadAttempts > 4 || this.settingEngine.numLoadsSinceRunningGameOrNormalExit > 5) {
                Core.LogDebug2("Extra safe mode");
                this.f6186eg = true;
            }
            if (this.settingEngine.numIncompleteLoadAttempts > 5) {
                Core.LogDebug2("Extra safe mode x2");
                this.f6187eh = true;
            }
            if (this.settingEngine.numIncompleteLoadAttempts > 6) {
                Core.LogDebug2("Extra safe mode x3");
                this.settingEngine.newRender = false;
                this.settingEngine.shaderEffects = false;
                this.settingEngine.teamShaders = false;
            }
            if (this.settingEngine.newRender && this.settingEngine.numLoadsSinceRunningGameOrNormalExit > 15) {
                Core.LogDebug2("Disabling opengl mode");
                this.settingEngine.newRender = false;
            }
            Core.LogDebug2("starting game in safe mode, numIncompleteLoadAttempts:" + this.settingEngine.numIncompleteLoadAttempts + " numLoadsSinceRunningGameOrNormalExit:" + this.settingEngine.numLoadsSinceRunningGameOrNormalExit);
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
        this.settingEngine.numLoadsSinceRunningGameOrNormalExit++;
        this.settingEngine.numIncompleteLoadAttempts++;
        if (!this.settingEngine.save() && f6210aZ) {
            Core.LogDebug2("starting game in safe mode, failed to save settings");
            this.f6185ef = "failing to write preferences data";
            this.f6183ed = true;
        }
        RunnableC0737a.m2415a();
        this.f6132ci = m1066V();
        Core.LogDebug2("densityScale(): " + this.f6132ci);
        long m2440a2 = C0727bl.m2440a();
        C0820a.m1736a();
        C0727bl.m2435a("Locale.init took:", m2440a2);
        AbstractC0197n.m5111I();
        this.f1228l = new Paint();
        this.f1229m = new Paint();
        this.f1229m.m5933a(255, 255, 255, 255);
        this.f1229m.mo5914a(true);
        m1050a(this.f1229m, 16.0f);
        this.f1230n = new Paint();
        this.f1230n.m5933a(255, 255, 255, 255);
        this.f1230n.mo5914a(true);
        m1050a(this.f1230n, 16.0f);
        this.f1231o = new Paint();
        this.f1231o.m5933a(100, 255, 0, 0);
        m1050a(this.f1231o, 16.0f);
        this.f1232p = new Paint();
        this.f1232p.m5933a(100, 0, 255, 0);
        m1050a(this.f1232p, 16.0f);
        this.f6167dm = new Paint();
        this.f6168dn = new Paint();
        this.f6168dn.m5929a(Paint.Align.f196b);
        this.f6168dn.mo5914a(true);
        this.f6168dn.mo5924a(Typeface.m5840a(Typeface.f246c, 0));
        m1050a(this.f6168dn, 16.0f);
        this.f6169do = new Paint();
        this.f6169do.m5933a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE);
        this.f6169do.mo5914a(true);
        this.f6169do.m5929a(Paint.Align.f196b);
        m1050a(this.f6169do, 18.0f);
        this.f1240x = new Paint();
        this.f1240x.m5908b(-1);
        this.f1240x.m5903c(100);
        this.f1241y = new Paint();
        this.f1241y.m5908b(-7829368);
        this.f1241y.m5903c(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
        this.f1241y.m5926a(Paint.Style.f220b);
        this.f1241y.m5936a(1.0f);
        long m2440a3 = C0727bl.m2440a();
        m971h("AudioEngine");
        C0631e.m2772b();
        this.f6111bM = new C0631e();
        this.f6111bM.m2778a(context);
        C0727bl.m2435a("AudioEngine took:", m2440a3);
        m971h("MusicController");
        this.f6112bN = new C0648am();
        this.f6112bN.m2716a(context);
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
        m971h("graphics.init");
        this.f6113bO.mo214a(context);
        this.f6113bO.mo169b();
        C0894j.m1252a();
        m971h("Fonts");
        m1064X();
        m971h("effects.init");
        this.f6116bR = new C0743c();
        this.f6116bR.m2380a(context);
        m971h("minimapHandler");
        this.f6121bW = new C0802k();
        this.f6121bW.m1782a(context);
        if (f6133cj != null) {
            Core.LogDebug2("We have an initial screen size, can do early setup of image buffers");
            m971h("Map Buffers");
            m5167b(f6133cj.f224a, f6133cj.f225b);
            m5151j();
            C0173b.m5297d();
            C0173b.m5288f();
            this.f6121bW.m1769e();
            if (Core.m1005az()) {
                m971h("Setting up postprocessing");
                if (!m5153h()) {
                    Core.LogDebug2("Failed to setup postprocessing");
                }
            }
        }
        m971h("PathEngine");
        this.f6119bU = new C0907l();
        m971h("GroupController");
        this.f6120bV = new C0636aa();
        m971h("CollisionEngine");
        this.f6114bP = new C0626a();
        m971h("InterfaceEngine");
        this.f6117bS = new C0797f();
        this.f6117bS.m1893a(context);
        this.f1245C = C0720be.m2452c(context);
        m971h("NetworkEngine");
        this.f6122bX = new C0831ad();
        this.f6122bX.m1643E();
        m971h("StatsHandler");
        this.f6123bY = new C0722bg();
        m971h("ModEngine");
        this.f6124bZ = new C0823a();
        this.f6124bZ.m1722a();
        if (this.f6183ed) {
            this.f6124bZ.m1700g();
        }
        m971h("CommandController");
        this.f6130cf = new C0736c();
        m971h("GameSaver");
        this.f6125ca = new C1122y();
        m971h("ReplayEngine");
        this.f6126cb = new C0716ba();
        this.f6126cb.m2484a(context);
        m971h("UnitGeoIndex");
        this.f6127cc = new C0538c();
        m971h("Precalculating map fog");
        C0173b.m5303c();
        m971h("ScorchMark.load");
        C0195l.m5125b();
        m971h("Projectile.load");
        C0188f.m5196c();
        m971h("Emitter.load");
        C0746f.m2341b();
        m971h("Unit.loadAllUnits");
        long m2440a4 = C0727bl.m2440a();
        AbstractC0244am.m4759bH();
        C0727bl.m2435a("loadAllUnits took:", m2440a4);
        m971h("Loading custom unit data");
        long m2440a5 = C0727bl.m2440a();
        C0348af.m4272h();
        m971h("getAllUnitsChecksum");
        C0727bl.m2435a("CustomUnits took:", m2440a5);
        long m2440a6 = C0727bl.m2440a();
        this.f1220d = AbstractC0244am.m4754bM();
        C0727bl.m2435a("allUnitsChecksum took:", m2440a6);
        this.f1242z = new Paint();
        this.f1242z.m5933a(50, 255, 255, 255);
        m1083E();
        System.gc();
        this.f6229bi = true;
        Core.LogDebug2("Init completed");
        C0727bl.m2435a("Loading took:", m2440a);
        this.f6128cd.m2431b(EnumC0729bm.f4605C);
        this.f6128cd.m2434a(true, true);
        long m2440a7 = C0727bl.m2440a();
        m971h("Loading map data");
        if (!Core.f6083ay) {
            m5138w();
        }
        C0727bl.m2435a("loadAMenuMap took:", m2440a7);
        m971h("Last setup");
        m1016ao();
        this.f6122bX.m1474m();
        m971h("init complete");
        if (f6089aE) {
            EnumC0249ar.m4613s();
            System.exit(0);
        }
        if (f6090aF) {
            EnumC0249ar.m4614r();
            System.exit(0);
        }
        this.f6097bj = true;
    }

    /* renamed from: a */
    public void m5181a(int i, int i2) {
        float m2157b = C0758f.m2157b(0.0f, 0.0f, i, i2) / 1131.0f;
        Core.LogDebug2("defaultViewpointZoomDensity: " + m2157b);
        if (m2157b < 0.5f) {
            m2157b = 0.5f;
        }
        if (m2157b > 3.0f) {
            m2157b = 3.0f;
        }
        Core.LogDebug2("defaultViewpointZoomDensity after limit: " + m2157b);
        this.f6257cX = 1.0f;
        if (C0758f.m2137c(m2157b - 1.0f) > 0.1d) {
            this.f6257cX = m2157b;
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
    public void m5156e() {
        m1078J();
        m5155f();
    }

    /* renamed from: f */
    public void m5155f() {
        m5164b(false);
        this.f6242bG = false;
        this.f6243bH = false;
        this.f6241bF = false;
        this.f6098bp = false;
        this.f6117bS.f5126p = false;
    }

    /* renamed from: a */
    public synchronized void m5173a(boolean z, EnumC1063s enumC1063s) {
        m1078J();
        m5172a(z, false, enumC1063s);
    }

    /* renamed from: a */
    public void m5172a(boolean z, boolean z2, EnumC1063s enumC1063s) {
        ActivityC0097g mo242i;
        m5164b(z2);
        this.f6234bo = false;
        System.gc();
        this.f6244bI = true;
        this.f6242bG = false;
        this.f6098bp = false;
        this.f6241bF = false;
        this.f6102by = 0;
        this.f6245cg = false;
        this.f6122bX.m1615a(1L);
        this.f6239bx = 0;
        this.f6108bJ = 0;
        C0758f.m2216a();
        this.f6122bX.m1463t();
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
        if (!this.f6126cb.m2464h()) {
            if (!this.f6122bX.lock1) {
                C0348af.m4281b(true);
            } else {
                C0348af.m4276d();
            }
        }
        if (!this.f6122bX.lock1) {
            if (!this.f6126cb.m2464h() && z) {
                this.f6099bs = new C0187e(0);
                this.f6099bs.f1316u = "Player";
                for (int i = 1; i < 8; i++) {
                    new C0136a(i);
                }
                this.f6122bX.m1557aq();
            }
        } else {
            this.f6099bs = this.f6122bX.f5489z;
            if (this.f6099bs == null) {
                throw new RuntimeException("cannot find player's team");
            }
            if (this.f6099bs != AbstractC0197n.m5017k(this.f6099bs.f1306k)) {
                Core.m973g("Stale playerTeam");
            }
        }
        this.f6129ce = null;
        this.f6110bL = new C0173b();
        try {
            if (this.f6166dl != null) {
                InputStream m1284w = this.f6166dl.m1284w();
                try {
                    m1284w.reset();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f6110bL.m5323a(m1284w, z2);
            } else {
                this.f6110bL.m5317a(m1021aj(), z2);
            }
            if (!this.f6110bL.f803W) {
                LogDebug2("map did not load, returning");
                this.f6244bI = false;
                return;
            }
            this.f6106bC = this.settingEngine.teamUnitCapSinglePlayer;
            if (this.f6106bC < 1) {
                this.f6106bC = 1;
            }
            this.f6105bB = this.f6106bC;
            this.f6110bL.f843G = false;
            AbstractC0197n.m5036e();
            if (!z2) {
                C0453l.m3735E();
            }
            if (!this.f6122bX.lock1 && !this.f6126cb.m2464h()) {
                this.f6122bX.f5603aO.f5661h = 1.0f;
                this.f6122bX.f5603aO.f5653q = C0758f.m2203a(1, 1000000000);
            }
            this.f6108bJ = this.f6122bX.f5603aO.f5653q;
            LogDebug2("global Seed: " + this.f6108bJ);
            if (this.f6122bX.lock1) {
                if (!this.f6122bX.f5571F) {
                    this.f6105bB = this.f6122bX.f5601aM;
                    this.f6106bC = this.f6122bX.f5602aN;
                }
                Core.LogDebug2("Unit cap is now: " + this.f6106bC);
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
                    AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
                    if (m5017k != null) {
                        if (m5017k.f1337M == null) {
                            Core.LogDebug2("Fog null for team: " + m5017k.f1306k);
                        } else {
                            for (int i3 = 0; i3 < this.f6110bL.f792C; i3++) {
                                for (int i4 = 0; i4 < this.f6110bL.f793D; i4++) {
                                    m5017k.f1337M[i3][i4] = b;
                                }
                            }
                        }
                    }
                }
                int m1478k = this.f6122bX.m1478k();
                for (int i5 = 0; i5 < AbstractC0197n.f1365c; i5++) {
                    AbstractC0197n m5017k2 = AbstractC0197n.m5017k(i5);
                    if (m5017k2 != null) {
                        m5017k2.f1310o = m1478k;
                        if (m5017k2.f1317v) {
                            if (!m5017k2.f1319x) {
                                if (m5017k2.f1320y != null) {
                                    m5017k2.f1318w = m5017k2.f1320y.intValue();
                                } else {
                                    m5017k2.f1318w = this.f6122bX.f5603aO.f5659f;
                                }
                            } else {
                                m5017k2.m5047c("aiDifficulty is locked");
                            }
                        }
                        m5017k2.f1332H = this.f6122bX.f5603aO.f5652l;
                        boolean z3 = false;
                        boolean z4 = false;
                        int i6 = this.f6122bX.f5603aO.f5660g;
                        if (m5017k2.f1321z != null) {
                            i6 = m5017k2.f1321z.intValue();
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
                            Iterator it = AbstractC0244am.m4761bF().iterator();
                            while (it.hasNext()) {
                                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                                if ((abstractC0244am instanceof AbstractC0244am) && !abstractC0244am.f1607bT && abstractC0244am.f1609bV == m5017k2) {
                                    if (abstractC0244am.f1601bN && !z3) {
                                        z3 = true;
                                        f = Float.valueOf(abstractC0244am.f6958el);
                                        f2 = Float.valueOf(abstractC0244am.f6959em);
                                        if (!z5) {
                                            abstractC0244am.m4700ch();
                                        }
                                    }
                                    if (abstractC0244am.f1602bO && !z4) {
                                        z4 = true;
                                        f3 = Float.valueOf(abstractC0244am.f6958el);
                                        f4 = Float.valueOf(abstractC0244am.f6959em);
                                        if (!z6) {
                                            abstractC0244am.m4700ch();
                                        }
                                    }
                                }
                            }
                            if (f == null) {
                                f = f3;
                                f2 = f4;
                            }
                            if (f == null) {
                                Core.LogDebug2("placementLocation==null for team:" + m5017k2.f1306k);
                            } else {
                                float floatValue = f.floatValue();
                                float floatValue2 = f2.floatValue();
                                if (i6 == 2) {
                                    for (int i7 = 0; i7 <= 2; i7++) {
                                        if (i7 != 1) {
                                            AbstractC0244am mo4485a = EnumC0249ar.f1742h.mo4485a();
                                            mo4485a.m4768b(m5017k2);
                                            mo4485a.f6958el = (floatValue - 50.0f) + (i7 * 50);
                                            mo4485a.f6959em = floatValue2;
                                            AbstractC0197n.m5053c(mo4485a);
                                        }
                                    }
                                    for (int i8 = 0; i8 <= 2; i8++) {
                                        AbstractC0244am mo4485a2 = EnumC0249ar.f1757w.mo4485a();
                                        mo4485a2.m4768b(m5017k2);
                                        mo4485a2.f6958el = (floatValue - 50.0f) + (i8 * 50);
                                        mo4485a2.f6959em = floatValue2 + 50.0f;
                                        AbstractC0197n.m5053c(mo4485a2);
                                    }
                                } else if (i6 == 3 || i6 == 4) {
                                    for (int i9 = 0; i9 <= 2; i9++) {
                                        InterfaceC0303as m4623a = EnumC0249ar.m4623a("combatEngineer");
                                        if (m4623a == null) {
                                            C0831ad.m1493g("Could not find: combatEngineer on network.setup.startingUnits==3");
                                        } else {
                                            AbstractC0244am mo4485a3 = m4623a.mo4485a();
                                            mo4485a3.m4768b(m5017k2);
                                            mo4485a3.f6958el = (floatValue - 50.0f) + (i9 * 50);
                                            mo4485a3.f6959em = floatValue2 + 50.0f;
                                            AbstractC0197n.m5053c(mo4485a3);
                                        }
                                    }
                                } else if (i6 == 5) {
                                    InterfaceC0303as m4623a2 = EnumC0249ar.m4623a("experimentalSpider");
                                    if (m4623a2 == null) {
                                        C0831ad.m1493g("Could not find: experimentalSpider on network.setup.startingUnits==5");
                                    } else {
                                        AbstractC0244am mo4485a4 = m4623a2.mo4485a();
                                        mo4485a4.m4768b(m5017k2);
                                        mo4485a4.f6958el = floatValue;
                                        mo4485a4.f6959em = floatValue2;
                                        mo4485a4.f1618ce = 90.0f;
                                        mo4485a4.f6960en = 2.0f;
                                        mo4485a4.m4677da();
                                        AbstractC0197n.m5053c(mo4485a4);
                                    }
                                } else if (i6 != 9 && i6 > 10) {
                                    C0453l m3699c = C0453l.m3699c(i6);
                                    if (m3699c == null) {
                                        C0831ad.m1493g("Could not find starting unit on startingUnits==" + i6);
                                    } else {
                                        AbstractC0244am mo4485a5 = m3699c.mo4485a();
                                        mo4485a5.m4768b(m5017k2);
                                        mo4485a5.f6958el = floatValue;
                                        mo4485a5.f6959em = floatValue2;
                                        if (!mo4485a5.m4758bI()) {
                                            mo4485a5.f1618ce = 90.0f;
                                        }
                                        if (m3699c.f3125eG) {
                                            mo4485a5.m4677da();
                                            if (mo4485a5 instanceof C0451j) {
                                                ((C0451j) mo4485a5).m3778dz();
                                            }
                                        }
                                        AbstractC0197n.m5053c(mo4485a5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2 && (this.f6129ce == null || !this.f6129ce.f6674q)) {
                m1060a(0.0f, 0.0f);
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
                        m1003b(abstractC0244am2.f6958el, abstractC0244am2.f6959em);
                        z7 = true;
                    }
                }
                if (!z7) {
                    Iterator it3 = AbstractC0244am.f1590bD.iterator();
                    while (it3.hasNext()) {
                        AbstractC0244am abstractC0244am3 = (AbstractC0244am) it3.next();
                        if (abstractC0244am3.f1609bV == this.f6099bs && !abstractC0244am3.mo1757t() && !abstractC0244am3.mo1756u()) {
                            m1003b(abstractC0244am3.f6958el, abstractC0244am3.f6959em);
                        }
                    }
                }
                LogDebug2("there are " + i10 + " units on this map and " + i11 + " trees");
            }
            this.f1244B = C0720be.m2452c(this.f6227am).m2453b(m1021aj());
            this.f6119bU.m1168a(this.f6110bL, z2);
            this.f6121bW.m1781a(this.f6110bL, z2);
            this.f6130cf.m2423a();
            this.f6120bV.m2765a();
            if (!z2) {
                C0741a.m2409a();
            }
            this.f6125ca.m422a(z2);
            this.f6117bS.m1863a(z2);
            if (!z2) {
                this.f6117bS.m1800x();
                m5171aF();
                if (this.f6100bv) {
                    this.f6117bS.m1800x();
                }
            } else {
                this.f6117bS.m1800x();
            }
            this.f6127cc.m3255a(this.f6110bL);
            if (!z2) {
                this.f6112bN.m2708c();
            }
            this.f6123bY.m2451a();
            Iterator it4 = AbstractC0244am.f1590bD.iterator();
            while (it4.hasNext()) {
                AbstractC0244am abstractC0244am4 = (AbstractC0244am) it4.next();
                if (abstractC0244am4 instanceof AbstractC0623y) {
                    ((AbstractC0623y) abstractC0244am4).m2846c(false);
                }
            }
            this.f1244B.f4548e = true;
            this.f1245C.m2458a(this.f6227am);
            this.f6242bG = true;
            this.f6243bH = false;
            this.f6244bI = false;
            if (enumC1063s != EnumC1063s.f6739a && !this.settingEngine.hasPlayedGameOrSeenHelp) {
                this.settingEngine.hasPlayedGameOrSeenHelp = true;
                this.settingEngine.save();
            }
            for (int i12 = 0; i12 < 5; i12++) {
                System.gc();
            }
            if (!Core.f6205aU) {
                Log.LogVerbose("RustedWarfare", "getNativeHeapSize" + String.valueOf(Debug.getNativeHeapSize()));
                Log.LogVerbose("RustedWarfare", "getNativeHeapAllocatedSize" + String.valueOf(Debug.getNativeHeapAllocatedSize()));
                Log.LogVerbose("RustedWarfare", "getNativeHeapFreeSize" + String.valueOf(Debug.getNativeHeapFreeSize()));
                Log.LogVerbose("RustedWarfare", "Runtime.getRuntime().maxMemory()" + String.valueOf(Runtime.getRuntime().maxMemory()));
            }
            if (this.f6266dj != null) {
                this.f6266dj.m416a();
            }
            this.f1249G = 0.0f;
            if (this.f6122bX.f5571F && this.f6122bX.lock1) {
                Core.LogDebug2("Disabling network for singleplayer");
                this.f6122bX.lock1 = false;
            }
            if (!m1008aw()) {
                if (enumC1063s == EnumC1063s.f6741c) {
                    Core.LogDebug2("Not starting replay recording as we are loading a save");
                } else {
                    this.f6126cb.m2476a(z2);
                }
            }
            if (C0907l.f6011m) {
            }
        } catch (C0179f e2) {
            e2.printStackTrace();
            m1045a("Error loading map: " + e2.getMessage(), 1);
            if (f6204aT) {
                Core.LogDebug2("Crashing on allowed map error because automated testing is active");
                throw new RuntimeException(e2);
            }
            if (!this.f6122bX.lock1 && this.f6079ao != null && (mo242i = this.f6079ao.mo242i()) != null) {
                mo242i.mo111m();
            }
            m978e("Map Load Warning", m1039a(e2));
            this.f6244bI = false;
        }
    }

    /* renamed from: aF */
    private void m5171aF() {
        this.f6117bS.m1800x();
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am.f1609bV == this.f6099bs && (abstractC0244am instanceof AbstractC0623y) && abstractC0244am.m4769ak() && abstractC0244am.mo3348p_() && abstractC0244am.m4751bS() && !abstractC0244am.mo1756u() && !abstractC0244am.mo1757t()) {
                Core.LogDebug2("selectAnyOnScreenBuilder: found builder");
                this.f6117bS.m1822j(abstractC0244am);
                return;
            }
        }
        Core.LogDebug2("selectAnyOnScreenBuilder: no builder found");
    }

    /* renamed from: b */
    public void m5164b(boolean z) {
        synchronized (this.f6225aj) {
            if (this.f6079ao != null) {
                this.f6079ao.mo239l();
            }
            this.f6235bq = false;
            if (!z) {
                this.f6126cb.m2466f();
            }
            this.f6119bU.m1150c();
            C1104o m435dI = AbstractC1120w.m435dI();
            Iterator it = m435dI.iterator();
            while (it.hasNext()) {
                ((AbstractC1120w) it.next()).mo2689a();
            }
            AbstractC0244am.m4761bF();
            AbstractC1120w.m435dI();
            int size = m435dI.size();
            if (size != 0) {
                Core.m1046a("SHOULD_NOT_HAPPEN: we still had " + size + " objects in gameObjectListForLogic after removeAll");
                Iterator it2 = m435dI.iterator();
                while (it2.hasNext()) {
                    AbstractC1120w abstractC1120w = (AbstractC1120w) it2.next();
                    String str = "Object: " + abstractC1120w.f6951ee;
                    if (abstractC1120w instanceof AbstractC0244am) {
                        str = ((AbstractC0244am) abstractC1120w).m4733cA();
                    }
                    Core.m1046a("Remaining object: " + str);
                }
                if (Core.m1087A().m1062Z()) {
                    throw new RuntimeException("We still had " + size + " objects in gameObjectListForLogic after removeAll");
                }
            }
            AbstractC0244am.m4761bF().clear();
            AbstractC1120w.m435dI().clear();
            C0451j.m3799dB();
            this.f1265W.clear();
            if (!m1010au()) {
                this.f6112bN.m2704f();
            }
            this.f6116bR.m2374a(z);
            if (this.f6110bL != null) {
                this.f6110bL.m5282h();
                this.f6110bL = null;
            }
            if (this.f6129ce != null) {
                this.f6129ce = null;
            }
            if (this.f6127cc != null) {
                this.f6127cc.m3252b();
            }
            this.f1274af = null;
            this.f1275ag = null;
            this.f1226j = 0;
            AbstractC0197n.m5099U();
        }
    }

    /* renamed from: a */
    public void m5182a(float f, int i) {
        synchronized (this.f6225aj) {
            m5168b(f, i);
        }
    }

    /* renamed from: b */
    public void m5168b(float f, int i) {
        if (this.f6239bx == 2) {
            m1031aE();
        } else if (this.f6239bx % 10000 == 0 && this.f6239bx != 0) {
            m1031aE();
        }
        if (f6198aL && !this.f6094aS && m1012as() && Debug.getNativeHeapAllocatedSize() > 209715200) {
            Core.LogDebug2("getNativeHeapAllocatedSize: " + C0758f.m2100g((int) Debug.getNativeHeapAllocatedSize()));
            this.f6094aS = true;
        }
        m1032aD();
        this.f6288ea.m743a();
        this.f6289eb.m741b();
        this.f6128cd.m2436a(EnumC0729bm.f4577a);
        this.f6079ao = this.f6080ap;
        if (this.f6079ao.mo251b()) {
            this.f6128cd.m2436a(EnumC0729bm.f4578b);
            while (this.f1227k.peek() != null) {
                ((Runnable) this.f1227k.poll()).run();
            }
            if (!this.f6242bG) {
                if (this.f6081aq) {
                    return;
                }
                Log.m5772d("RustedWarfare", "game running without a loaded level!!!");
                m5154g();
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
                boolean z = this.settingEngine.numIncompleteLoadAttempts > 1;
                this.settingEngine.numIncompleteLoadAttempts = 0;
                if (this.f6183ed) {
                    this.settingEngine.numLoadsSinceRunningGameOrNormalExit = 0;
                }
                this.settingEngine.save();
                if (this.f6183ed && (this.f6184ee || this.f6124bZ.m1708c() > 0)) {
                    if (this.f6185ef != null) {
                        m990c("Safe mode", "Started game in safe mode due to " + this.f6185ef + ". Mods have been disabled.");
                    } else if (z) {
                        m990c("Safe mode", "Started game in safe mode due to failed loading attempts. Mods have been disabled.");
                    } else {
                        m990c("Safe mode", "Started game in safe mode due to multiple loads without starting a game or exiting. Mods have been disabled.");
                    }
                }
            }
            if (!this.f6243bH && this.f6242bG && this.settingEngine.numLoadsSinceRunningGameOrNormalExit != 0) {
                this.settingEngine.numLoadsSinceRunningGameOrNormalExit = 0;
                this.settingEngine.save();
            }
            this.f6125ca.m421b();
            float f2 = this.f6254cU * this.f6257cX;
            if (f2 != this.f6256cW) {
                float f3 = (this.f6163cZ / this.f6256cW) + this.f6146cx;
                float f4 = (this.f6164da / this.f6256cW) + this.f6147cy;
                this.f6256cW = f2;
                m5151j();
                if (this.f6162cY) {
                    m1060a(this.f6146cx - (((this.f6163cZ / this.f6256cW) + this.f6146cx) - f3), this.f6147cy - (((this.f6164da / this.f6256cW) + this.f6147cy) - f4));
                    this.f6162cY = false;
                }
            }
            if (this.f6139cq != 0.0f || this.f6140cr != 0.0f) {
                float f5 = 3.0f * f;
                float m2101g = this.f6139cq > 0.0f ? C0758f.m2101g(this.f6139cq, f5) : 0.0f;
                if (this.f6139cq < 0.0f) {
                    m2101g = C0758f.m2108f(this.f6139cq, -f5);
                }
                float f6 = m2101g + (0.15f * this.f6139cq);
                float m2101g2 = this.f6140cr > 0.0f ? C0758f.m2101g(this.f6140cr, f5) : 0.0f;
                if (this.f6140cr < 0.0f) {
                    m2101g2 = C0758f.m2108f(this.f6140cr, -f5);
                }
                float f7 = m2101g2 + (0.15f * this.f6140cr);
                if (C0758f.m2137c(this.f6139cq) <= f5) {
                    f6 = this.f6139cq;
                    this.f6139cq = 0.0f;
                } else {
                    this.f6139cq -= f6;
                }
                if (C0758f.m2137c(this.f6140cr) <= f5) {
                    f7 = this.f6140cr;
                    this.f6140cr = 0.0f;
                } else {
                    this.f6140cr -= f7;
                }
                this.f6146cx += f6;
                this.f6147cy += f7;
                m1060a(this.f6146cx, this.f6147cy);
                m1072P();
            }
            if (this.f6158cQ != this.f6159cR) {
                m5151j();
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
            m5158d(f);
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
                if (this.settingEngine.showFps) {
                    this.f1237u = this.f1235s + "fps";
                }
            }
            m1022ai();
            for (int i2 = 0; i2 < this.f6282dL.length; i2++) {
                this.f6282dL[i2] = true;
            }
            this.f6263dg = C0758f.m2211a(this.f6263dg, 0.1f * f);
            this.f6264dh = C0758f.m2211a(this.f6264dh, 0.1f * f);
            this.f6263dg = C0758f.m2159b(this.f6263dg, 5.0f);
            this.f6264dh = C0758f.m2159b(this.f6264dh, 5.0f);
            this.f6117bS.m1910a(f);
            m1072P();
            C0173b.m5288f();
            if (this.f6122bX.lock1) {
                float f8 = f;
                if (this.f6126cb.f4510t != 1) {
                    f8 *= this.f6126cb.f4510t;
                }
                this.f6122bX.m1620a(f8);
                if (!m5174a(true) && !this.f6122bX.f5504Y) {
                    this.f1249G += f8;
                    while (true) {
                        if (this.f1249G <= this.f6122bX.m1531c()) {
                            break;
                        } else if (this.f6122bX.m1639I()) {
                            this.f6122bX.f5504Y = true;
                            break;
                        } else {
                            this.f1249G -= this.f6122bX.m1531c();
                            this.f6122bX.m1618a(this.f6122bX.m1531c(), false);
                            if (this.f6122bX.f5504Y) {
                                break;
                            }
                            m5184a(this.f6122bX.m1531c());
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
                            if (this.f6122bX.f5510ae > this.f6122bX.m1531c() * 3.0f) {
                                this.f6122bX.f5510ae = 0.0f;
                                this.f6122bX.m1618a(this.f6122bX.m1531c(), true);
                                if (!this.f6122bX.f5504Y) {
                                    m5184a(this.f6122bX.m1531c());
                                }
                            }
                        }
                        if (this.f6122bX.f5511af) {
                            this.f6122bX.m1618a(this.f6122bX.m1531c(), true);
                            if (!this.f6122bX.f5504Y) {
                                m5184a(this.f6122bX.m1531c());
                            }
                        }
                        if (this.f6239bx < this.f6122bX.f5580X - 90) {
                            this.f6122bX.m1618a(this.f6122bX.m1531c(), true);
                            if (!this.f6122bX.f5504Y) {
                                m5184a(this.f6122bX.m1531c());
                            }
                        }
                        if (this.f6239bx < this.f6122bX.f5580X - 120) {
                            this.f6122bX.m1618a(this.f6122bX.m1531c(), true);
                            if (!this.f6122bX.f5504Y) {
                                m5184a(this.f6122bX.m1531c());
                            }
                        }
                        if (this.f6239bx < this.f6122bX.f5580X - 600) {
                            this.f6122bX.m1618a(this.f6122bX.m1531c(), true);
                            if (!this.f6122bX.f5504Y) {
                                m5184a(this.f6122bX.m1531c());
                            }
                        }
                    }
                }
            } else if (this.f6126cb.m2465g()) {
                float f9 = f;
                if (this.f6126cb.f4510t != 1) {
                    f9 *= this.f6126cb.f4510t;
                }
                if (this.f6237bt != 1.0f) {
                    f9 *= this.f6237bt;
                }
                if (!m5174a(false)) {
                    this.f1249G += f9;
                    while (this.f1249G > this.f6122bX.m1531c()) {
                        this.f1249G -= this.f6122bX.m1531c();
                        if (this.f6122bX.m1639I()) {
                            break;
                        }
                        m5184a(this.f6122bX.m1531c());
                    }
                }
                if (this.f1249G > 100.0f) {
                    this.f1249G = 100.0f;
                }
                if (this.f1249G < 0.0f) {
                    this.f1249G = 0.0f;
                }
            } else if (!m5174a(false)) {
                m5184a(f);
            }
            if (m5174a(false)) {
                try {
                    Thread.sleep(2L);
                } catch (Exception e2) {
                }
            }
            this.f6119bU.m1170a(f);
            this.f6111bM.m2771b(f);
            this.f6112bN.m2717a(f);
            this.f6118bT.m2742b();
            C1058a.m747a().mo294a(f);
            this.f6128cd.m2431b(EnumC0729bm.f4578b);
            this.f6128cd.m2436a(EnumC0729bm.f4579c);
            if (!this.f6272du) {
                if (this.f6113bO.mo230a()) {
                    m5175a((InterfaceC0941l) null, f);
                } else if (this.f6079ao.mo237n()) {
                    m5175a(this.f6079ao.mo249b(true), f);
                } else {
                    InterfaceC0096f interfaceC0096f = this.f6079ao;
                    this.f6079ao.mo254a(f, i);
                    if (interfaceC0096f.mo248c() && !interfaceC0096f.mo246e()) {
                        synchronized (interfaceC0096f.mo244g()) {
                            if (interfaceC0096f.mo248c() && !interfaceC0096f.mo246e()) {
                                this.f6128cd.m2436a(EnumC0729bm.f4599w);
                                InterfaceC0941l mo249b = interfaceC0096f.mo249b(true);
                                this.f6128cd.m2431b(EnumC0729bm.f4599w);
                                if (!interfaceC0096f.mo246e()) {
                                    if (mo249b != null) {
                                        if (mo249b.mo837c()) {
                                            Core.LogDebug2("gameengine draw: bufferedCanvas drawn on");
                                        }
                                        mo249b.mo842a(true);
                                    }
                                    if (mo249b == null) {
                                        Core.m976f("GameEngine gameViewCanvas is null after lockCanvas - " + interfaceC0096f.hashCode());
                                    }
                                    m5175a(mo249b, f);
                                    this.f6113bO.mo189a((InterfaceC0941l) null);
                                }
                                if (mo249b != null) {
                                    try {
                                        try {
                                            interfaceC0096f.mo253a(mo249b, true);
                                        } catch (IllegalArgumentException e3) {
                                            e3.printStackTrace();
                                            Core.m976f("GameEngine catch currentGameView - " + interfaceC0096f.hashCode());
                                            Core.m976f("GameEngine catch currentGameView.gameThreadSync - " + interfaceC0096f.mo244g().hashCode());
                                            interfaceC0096f.mo243h();
                                        }
                                    } catch (IllegalStateException e4) {
                                        e4.printStackTrace();
                                        Core.m976f("GameEngine catch currentGameView - " + interfaceC0096f.hashCode());
                                        Core.m976f("GameEngine catch currentGameView.gameThreadSync - " + interfaceC0096f.mo244g().hashCode());
                                    }
                                }
                            }
                        }
                    }
                    this.f6079ao.mo250b(f, i);
                }
            }
            this.f6272du = false;
            m1063Y();
            this.f6128cd.m2431b(EnumC0729bm.f4579c);
            if (this.f6271dt) {
                this.f6271dt = false;
                String m = m962l(this.f6165dk) != null ? m960m(this.f6165dk) : null;
                if (this.f6122bX.lock1) {
                    m = null;
                    new C0192a().start();
                }
                if (m != null) {
                    Core.LogDebug2("gotoNextLevel: Loading next level: " + m);
                    this.f6165dk = m;
                    this.f6117bS.f5115e.m1793b();
                    m5172a(true, false, EnumC1063s.f6740b);
                } else {
                    Core.LogDebug2("gotoNextLevel: No next level, finishing");
                    this.f6242bG = false;
                    ActivityC0097g mo242i = this.f6079ao.mo242i();
                    if (mo242i != null) {
                        mo242i.mo5591b();
                        mo242i.mo111m();
                    } else {
                        Core.LogDebug2("gotoNextLevel: Error getInGameActivity==null");
                    }
                }
            }
            if (!this.f6081aq && this.f6240bE && !this.f1225i) {
                LogDebug2("starting method trace");
                Debug.startMethodTracing("lukeTrace", 110000000);
                this.f1225i = true;
            }
            this.f6241bF = true;
            this.f6290ec.m743a();
            this.f6128cd.m2431b(EnumC0729bm.f4577a);
            this.f6128cd.m2433b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.i$a */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/i$a.class */
    public class C0192a extends Thread {
        C0192a() {
        }

        public void run() {
            C0191i.this.f6122bX.m1535b("gotoNextLevel");
        }
    }

    /* renamed from: g */
    public void m5154g() {
        ActivityC0097g mo242i = this.f6079ao.mo242i();
        if (mo242i != null) {
            if (!mo242i.m6022c()) {
                mo242i.mo5591b();
                return;
            } else {
                Core.m998b("stopAndClose: inGameActivity is isFinishing");
                return;
            }
        }
        Core.m998b("stopAndClose: Error getInGameActivity==null");
    }

    /* renamed from: a */
    public void m5184a(float f) {
        if (m1007ax() && f < 0.1f) {
            C0831ad.m1493g("updateAllGame1: deltaSpeed:" + f + " frame:" + this.f6239bx + " network.currentStepRate:" + this.f6122bX.m1531c());
        }
        if (this.f6237bt != 1.0f && !this.f6122bX.lock1 && !this.f6126cb.m2465g()) {
            f *= this.f6237bt;
        }
        float f2 = f * this.f1250H;
        this.f1251I = f2 + 2.0f;
        this.f1252J = f2;
        this.f6122bX.m1546b(f2);
        this.f6102by = (int) (this.f6102by + (f2 * 16.666666f));
        this.f6130cf.m2418c();
        this.f6126cb.m2486a(f2);
        this.f6239bx++;
        AbstractC0197n.m5027g(f2);
        if (this.f6110bL != null) {
            this.f6110bL.m5291e(f2);
        }
        if (m1007ax() && f2 < 0.1f) {
            C0831ad.m1493g("updateAllGame2: deltaSpeed:" + f2 + " frame:" + this.f6239bx);
        }
        AbstractC0244am.m4761bF();
        C1104o m435dI = AbstractC1120w.m435dI();
        Object[] m519b = m435dI.m519b();
        int size = m435dI.size();
        boolean ax = m1007ax();
        for (int i = 0; i < size; i++) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) m519b[i];
            if (ax && f2 != this.f1252J) {
                C0831ad.m1487h("JIT bug detected, attempting to correct. before object:" + abstractC1120w.f6951ee + " frame:" + this.f6239bx + " deltaSpeed:" + f2);
                f2 = this.f1252J;
            }
            abstractC1120w.mo1762a(f2);
        }
        if (m1007ax() && f2 < 0.1f) {
            C0831ad.m1493g("updateAllGame3: deltaSpeed:" + f2 + " frame:" + this.f6239bx);
        }
        int size2 = m435dI.f6901a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1108r c1108r = (C1108r) m435dI.f6901a.get(i2);
            if (c1108r.f6911a == EnumC1107q.add) {
                AbstractC1120w abstractC1120w2 = (AbstractC1120w) c1108r.f6912b;
                if (!abstractC1120w2.f6953eg) {
                    abstractC1120w2.mo1762a(f2);
                }
            }
        }
        this.f6128cd.m2436a(EnumC0729bm.f4589m);
        this.f6127cc.m3261a();
        this.f6128cd.m2431b(EnumC0729bm.f4589m);
        AbstractC0623y.m2833g(f2);
        C0451j.m3752s(f2);
        C0451j.m3926a(f2, 0);
        this.f1226j++;
        if (this.f1226j >= 1000) {
            this.f1226j = 0;
            int i3 = 0;
            Iterator it = AbstractC0244am.m4761bF().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am.f1607bT && !(abstractC0244am instanceof C0243al)) {
                    i3++;
                }
            }
            if (i3 > 70) {
                Iterator it2 = AbstractC0244am.m4761bF().iterator();
                while (it2.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it2.next();
                    if ((abstractC0244am2 instanceof AbstractC0244am) && abstractC0244am2.f1607bT && !(abstractC0244am2 instanceof C0243al) && abstractC0244am2.f1608bU < this.f6102by - 30000 && i3 > 70) {
                        abstractC0244am2.mo2689a();
                        i3--;
                    }
                }
            }
        }
        this.f6128cd.m2436a(EnumC0729bm.f4588l);
        AbstractC0197n.m5030f(f2);
        this.f6128cd.m2431b(EnumC0729bm.f4588l);
        C0741a.m2408a(f2);
        this.f6116bR.m2393a(f2);
        this.f1246D.m2397a(f2);
        C1117y.m479a(f2);
        if (this.f6129ce != null) {
            this.f6129ce.m769c(f2);
        }
        this.f6128cd.m2436a(EnumC0729bm.f4591o);
        this.f6120bV.m2764a(f2);
        this.f6128cd.m2431b(EnumC0729bm.f4591o);
        this.f6128cd.m2436a(EnumC0729bm.f4590n);
        this.f6121bW.m1788a(f2);
        this.f6128cd.m2431b(EnumC0729bm.f4590n);
        this.f6119bU.m1155b(f2);
    }

    /* renamed from: a */
    public void m5175a(InterfaceC0941l interfaceC0941l, float f) {
        synchronized (this.f6226ak) {
            m5165b(interfaceC0941l, f);
        }
    }

    /* renamed from: h */
    public boolean m5153h() {
        if (this.f1253K == null) {
            this.f1253K = new C0193j("assets/shaders/post_base.frag");
        }
        if (this.f1254L == null) {
            this.f1254L = new C0193j("assets/shaders/post_displacement.frag");
        }
        this.f1253K.m5134a(this.f6113bO);
        this.f1254L.m5134a(this.f6113bO);
        if (this.f1253K.f1285g || this.f1254L.f1285g) {
            if (!this.f1255M) {
                this.f1255M = true;
                Core.LogDebug2("setupPostprocessing: failed");
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m5177a(C0193j c0193j) {
        if (this.f1256N != null) {
            throw new RuntimeException("Layer already enabled");
        }
        this.f1256N = this.f6113bO;
        this.f6113bO = c0193j.f1280b;
        this.f6113bO.mo137i();
        this.f6113bO.mo208a(new Rect(0, 0, this.f6113bO.mo133m(), this.f6113bO.mo132n()));
        this.f6113bO.mo162b(c0193j.f1284f, c0193j.f1283e);
    }

    /* renamed from: b */
    public void m5166b(C0193j c0193j) {
        if (this.f1256N == null) {
            throw new RuntimeException("Layer not enabled");
        }
        this.f6113bO.mo136j();
        this.f6113bO.mo130p();
        this.f6113bO = this.f1256N;
        this.f1256N = null;
        this.f6113bO.mo162b(c0193j.f1284f, c0193j.f1283e);
    }

    /* renamed from: b */
    public void m5165b(InterfaceC0941l interfaceC0941l, float f) {
        if (interfaceC0941l == null) {
            m997b("drawAll", "canvas is null, not may not be available yet");
        } else if (f6086aB) {
        } else {
            this.f6113bO.mo189a(interfaceC0941l);
            this.f6113bO.mo204a(this.f6079ao.mo247d());
            this.f6113bO.mo139g();
            this.f6103bz++;
            C0937h.f6442G = 0.0f;
            if (this.f6271dt) {
                this.f6113bO.mo166b(Color.m5949a(0, 0, 0));
                this.f6113bO.mo181a("Loading..", this.f6136cn, this.f6137co, this.f6169do);
                return;
            }
            float f2 = this.f6246cm;
            if (f2 != 1.0f) {
                this.f6113bO.mo137i();
                this.f6113bO.mo228a(f2, f2);
            }
            boolean m1005az = Core.m1005az();
            if (m1005az && m972h(113) && m972h(44)) {
                m1005az = false;
            }
            if (m1005az && !m5153h()) {
                m1005az = false;
            }
            if (m1005az) {
                m5177a(this.f1253K);
                try {
                    this.f6113bO.mo166b(Color.m5949a(0, 0, 0));
                    this.f6128cd.m2436a(EnumC0729bm.f4580d);
                    m5161c((InterfaceC0941l) null, f);
                    this.f6128cd.m2431b(EnumC0729bm.f4580d);
                    m5166b(this.f1253K);
                    this.f1253K.m5132b();
                    if (!this.f1254L.m5135a()) {
                        m5177a(this.f1254L);
                        try {
                            this.f6113bO.mo166b(Color.m5949a(128, 128, 255));
                            m1071Q();
                            int m2381a = this.f6116bR.m2381a(f, 101);
                            this.f6116bR.f4694l = null;
                            m5166b(this.f1254L);
                            if (m2381a > 0) {
                                float mo127s = this.f6113bO.mo127s();
                                this.f1254L.f1282d.m922a("screenBase", this.f1253K.f1279a);
                                this.f1254L.f1282d.m919b("screenBaseSize", this.f1253K.f1279a);
                                this.f1254L.f1282d.m924a("u_resolution", this.f6134ck, this.f6135cl);
                                this.f1254L.f1282d.m925a("u_offsetBy", 0.2f * this.f6256cW);
                                this.f1254L.f1282d.m925a("u_uiScaling", mo127s);
                                this.f1254L.m5132b();
                            }
                        } catch (Throwable th) {
                            m5166b(this.f1254L);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    m5166b(this.f1253K);
                    throw th2;
                }
            } else {
                this.f6128cd.m2436a(EnumC0729bm.f4580d);
                m5161c(interfaceC0941l, f);
                this.f6128cd.m2431b(EnumC0729bm.f4580d);
            }
            if (!m948z()) {
                this.f6128cd.m2436a(EnumC0729bm.f4582f);
                m5157d(interfaceC0941l, f);
                this.f6128cd.m2431b(EnumC0729bm.f4582f);
            }
            if (this.settingEngine.showFps && this.f6160cS == 0.0f && !this.f6161cT && !this.f6159cR) {
                this.f6113bO.mo181a(this.f1237u, 100.0f, 35.0f, this.f1229m);
            }
            if (f1222f != null) {
                this.f6113bO.mo181a(f1222f, 100.0f, 85.0f, this.f1229m);
            }
            if (!this.f6081aq && (this.f6113bO.mo147d() != null || Core.f6207aW)) {
                this.f6117bS.m1846c(f);
            }
            C0451j.m3798dC();
            this.f6113bO.mo138h();
            if (f2 != 1.0f) {
                interfaceC0941l.mo867a();
            }
        }
    }

    /* renamed from: i */
    public boolean m5152i() {
        if (!this.settingEngine.showUnitIcons) {
            return false;
        }
        if (this.f6256cW >= 0.7d || this.f6152cD < this.f6110bL.m5281i() - 5.0f || this.f6149cA < this.f6110bL.m5280j() - 5.0f) {
            return m1086B() ? ((double) this.f6256cW) < 0.1d : m1010au() ? ((double) this.f6256cW) < 0.27d : ((double) this.f6256cW) < 0.4d;
        }
        return true;
    }

    /* renamed from: b */
    public void m5169b(float f) {
        boolean z = false;
        if (this.f6253cP.f230a < 0 || this.f6253cP.f231b < 0 || this.f6253cP.f232c > this.f6110bL.m5281i() || this.f6253cP.f233d > this.f6110bL.m5280j()) {
            z = true;
        }
        if (z) {
            this.f6113bO.mo166b(Color.m5949a(0, 0, 0));
        }
    }

    /* renamed from: c */
    public void m5162c(float f) {
    }

    /* renamed from: c */
    public void m5161c(InterfaceC0941l interfaceC0941l, float f) {
        if (!this.f6242bG) {
            return;
        }
        this.f6128cd.m2436a(EnumC0729bm.f4584h);
        this.f1266X.m508b();
        this.f6170dv = 0;
        boolean z = false;
        AbstractC1120w[] m514a = AbstractC0244am.f6962eo.m514a();
        int size = AbstractC1120w.f6962eo.size();
        for (int i = 0; i < size; i++) {
            AbstractC1120w abstractC1120w = m514a[i];
            boolean z2 = abstractC1120w.f6955ei;
            boolean m439a = abstractC1120w.m439a(this);
            abstractC1120w.f6955ei = m439a;
            if (z2 != m439a) {
                z = true;
            }
            if (m439a) {
                this.f1266X.mo509a(abstractC1120w);
            }
        }
        if (this.f1265W.size() != this.f1266X.size()) {
            z = true;
        }
        this.f6128cd.m2431b(EnumC0729bm.f4584h);
        this.f6128cd.m2436a(EnumC0729bm.f4585i);
        if (z) {
            C1109s c1109s = this.f1265W;
            this.f1265W = this.f1266X;
            this.f1266X = c1109s;
        }
        if (!m5152i()) {
            Collections.sort(this.f1265W, AbstractC1120w.f6952ef);
        }
        this.f6128cd.m2431b(EnumC0729bm.f4585i);
        this.f6128cd.m2436a(EnumC0729bm.f4593q);
        this.f6128cd.m2436a(EnumC0729bm.f4595s);
        this.f6113bO.mo137i();
        this.f6113bO.mo208a(this.f6247cJ);
        this.f6128cd.m2431b(EnumC0729bm.f4595s);
        this.f6128cd.m2436a(EnumC0729bm.f4594r);
        m5169b(f);
        this.f6128cd.m2431b(EnumC0729bm.f4594r);
        if (this.settingEngine.renderFancyWater) {
            if (this.f1257O == null) {
                this.f1257O = this.f6113bO.mo221a(C0067R.drawable.water_cloud);
            }
            if (this.f1258P == null) {
                this.f1258P = this.f6113bO.mo221a(C0067R.drawable.water_layer1);
            }
            if (this.f1259Q == null) {
                this.f1259Q = this.f6113bO.mo221a(C0067R.drawable.water_layer2);
            }
            this.f1261S.m5873a(this.f6247cJ);
            this.f1260R += 0.05f * f;
            if (this.f1260R > 100.0f) {
                this.f1260R -= 100.0f;
            }
            this.f6113bO.mo194a(this.f1257O, this.f1261S, (Paint) null, this.f6142ct / 6, this.f6143cu / 6, 1, 1);
            this.f1261S.m5873a(this.f6248cK);
            this.f1262T.m5860a(this.f6248cK);
            this.f6113bO.mo137i();
            m1071Q();
            this.f6113bO.mo191a(this.f1259Q, this.f1262T, (Paint) null, this.f6142ct + this.f1260R, this.f6143cu + this.f1260R, 0, 0);
            this.f6113bO.mo191a(this.f1258P, this.f1262T, (Paint) null, this.f6142ct, this.f6143cu, 0, 0);
            this.f6113bO.mo136j();
        }
        this.f6128cd.m2436a(EnumC0729bm.f4596t);
        if (this.f6110bL != null && m1014aq()) {
            this.f6110bL.m5296d(f);
        }
        this.f6128cd.m2431b(EnumC0729bm.f4596t);
        m1071Q();
        this.f6113bO.mo208a(this.f6248cK);
        boolean m5152i = m5152i();
        this.f6119bU.m1149c(f);
        this.f6128cd.m2431b(EnumC0729bm.f4593q);
        AbstractC1120w[] m514a2 = this.f1265W.m514a();
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
        if (!m5152i) {
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractC1120w abstractC1120w2 = m514a2[i2];
                if (abstractC1120w2.f6956ej == 0) {
                    abstractC1120w2.mo3049c(f);
                }
            }
        }
        C0741a.m2401b(f);
        this.f6128cd.m2436a(EnumC0729bm.f4583g);
        this.f6116bR.m2381a(f, 1);
        this.f6128cd.m2431b(EnumC0729bm.f4583g);
        this.f6128cd.m2436a(EnumC0729bm.f4592p);
        if (m5152i) {
            if (this.f6117bS.m1811p() == 0) {
                AbstractC0244am.f1595bH.m5933a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
                AbstractC0244am.f1596bI.m5933a(255, 255, 255, 255);
            } else {
                AbstractC0244am.f1595bH.m5933a(175, 175, 175, 175);
                AbstractC0244am.f1596bI.m5933a(255, 255, 255, 255);
            }
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC1120w abstractC1120w3 = m514a2[i3];
                if (!abstractC1120w3.m432f(f)) {
                    abstractC1120w3.mo3049c(f);
                }
            }
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC1120w abstractC1120w4 = m514a2[i4];
                abstractC1120w4.mo3053a(f, true);
                abstractC1120w4.m431p(f);
            }
        } else {
            for (int i5 = 0; i5 < size2; i5++) {
                m514a2[i5].m436d(f);
            }
            for (int i6 = 0; i6 < size; i6++) {
                AbstractC1120w abstractC1120w5 = m514a[i6];
                if (!abstractC1120w5.f6955ei) {
                    if (abstractC1120w5 instanceof AbstractC0244am) {
                        AbstractC0244am abstractC0244am = (AbstractC0244am) abstractC1120w5;
                        if (abstractC0244am.f1644cE) {
                            if (abstractC0244am.f1609bV != this.f6099bs && !abstractC0244am.m4703ce()) {
                            }
                        }
                    }
                }
                abstractC1120w5.mo3151e(f);
                if (!abstractC1120w5.f6955ei) {
                    abstractC1120w5.m431p(f);
                }
            }
            for (int i7 = 0; i7 < size2; i7++) {
                AbstractC1120w abstractC1120w6 = m514a2[i7];
                if (abstractC1120w6.f6956ej != 0 && abstractC1120w6.f6956ej != 10) {
                    abstractC1120w6.mo3049c(f);
                }
            }
            for (int i8 = 0; i8 < size2; i8++) {
                AbstractC1120w abstractC1120w7 = m514a2[i8];
                abstractC1120w7.mo3053a(f, false);
                abstractC1120w7.m431p(f);
            }
            AbstractC0197n.m5024h(f);
        }
        this.f6260dd = true;
        this.f6261de = true;
        this.f6128cd.m2431b(EnumC0729bm.f4592p);
        this.f6128cd.m2436a(EnumC0729bm.f4583g);
        this.f6116bR.m2381a(f, 2);
        this.f6128cd.m2431b(EnumC0729bm.f4583g);
        for (int i9 = 0; i9 < size2; i9++) {
            AbstractC1120w abstractC1120w8 = m514a2[i9];
            if (abstractC1120w8.f6956ej == 10) {
                abstractC1120w8.mo3049c(f);
            }
        }
        this.f1246D.m2395b(f);
        if (this.f6129ce != null) {
            this.f6129ce.m785a(f);
        }
        m5162c(f);
        C1117y.m457b(f);
        this.f6127cc.m3248c(f);
        this.f6128cd.m2436a(EnumC0729bm.f4581e);
        this.f6113bO.mo136j();
        this.f6128cd.m2431b(EnumC0729bm.f4581e);
    }

    /* renamed from: d */
    public void m5157d(InterfaceC0941l interfaceC0941l, float f) {
        this.f6117bS.m1859b(f);
        if (this.f6129ce != null) {
            this.f6129ce.m773b(f);
        }
        this.f6121bW.m1768e(f);
        this.f6116bR.m2371b(f);
        if (this.settingEngine.showFps && this.f6160cS == 0.0f) {
            this.f6128cd.m2430c();
        }
        if (this.f6245cg) {
            this.f6113bO.mo181a("Look Mode", this.f6136cn, this.f6137co, this.f6169do);
        }
        if (this.f6232bm) {
            int i = 20;
            for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
                if (m5017k != null && (m5017k instanceof C0136a)) {
                    C0136a c0136a = (C0136a) m5017k;
                    this.f6113bO.mo181a(c0136a.f1306k + "| c:" + c0136a.f1310o, 20.0f, i, this.f6167dm);
                    i += 20;
                }
            }
        }
    }

    /* renamed from: j */
    public void m5151j() {
        this.f6132ci = m1066V();
        m1065W();
        this.f6136cn = this.f6134ck / 2.0f;
        this.f6137co = this.f6135cl / 2.0f;
        this.f6138cp = (int) (this.f6135cl / 3.0f);
        float f = (int) (this.f6134ck / 3.0f);
        if (this.f6138cp > f) {
            this.f6138cp = f;
        }
        this.f6138cp = C0758f.m2158b(this.f6138cp, 60.0f, (int) (250.0f * this.f6132ci));
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
        this.f6247cJ.m5874a(0, 0, (int) this.f6153cE, (int) this.f6155cG);
        this.f6248cK.m5874a(0, 0, ((int) this.f6148cz) + 1, ((int) this.f6149cA) + 1);
        this.f6249cL.m5861a(0.0f, 0.0f, this.f6148cz + 1.0f, this.f6149cA + 1.0f);
        m1060a(f2 - this.f6156cH, f3 - this.f6157cI);
    }

    /* renamed from: b */
    public void m5167b(int i, int i2) {
        m5180a(i, i2, 1.0f);
    }

    /* renamed from: a */
    public void m5180a(int i, int i2, float f) {
        this.f6134ck = i;
        this.f6135cl = i2;
        this.f6246cm = f;
        m5151j();
    }

    /* renamed from: k */
    public String m5150k() {
        if (Core.f6208aX) {
            return "com.corrodinggames.rts.java";
        }
        if (Core.f6209aY) {
            return "com.corrodinggames.rts.gdx";
        }
        if (f6205aU) {
            return "com.corrodinggames.rts.server";
        }
        if (this.f6227am == null) {
            return "<null context>";
        }
        return this.f6227am.mo6009h();
    }

    /* renamed from: l */
    public String m5149l() {
        if (Core.f6208aX) {
            return "java";
        }
        if (Core.f6209aY) {
            return "java-gdx";
        }
        if (f6205aU) {
            return "dedicatedServer";
        }
        if (this.f6227am == null) {
            return "<null context>";
        }
        try {
            return this.f6227am.mo6011f().getInstallerPackageName(m5150k());
        } catch (IllegalArgumentException e) {
            return "IllegalArgumentException: " + e.getMessage();
        }
    }

    /* renamed from: m */
    public boolean m5148m() {
        if (m5140u().contains("p")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m5160c(boolean z) {
        if (f6205aU || z) {
            return 173;
        }
        try {
            return this.f6227am.mo6011f().getPackageInfo(this.f6227am.mo6009h(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public String m5147n() {
        if (!m1012as()) {
            return null;
        }
        try {
            Signature[] signatureArr = this.f6227am.mo6011f().getPackageInfo(this.f6227am.mo6009h(), 64).signatures;
            if (0 < signatureArr.length) {
                return C0758f.m2140b(signatureArr[0].toByteArray());
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: o */
    public boolean m5146o() {
        if (!Core.f6210aZ) {
            if (m5145p() || f6206aV) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: p */
    public boolean m5145p() {
        if (AbstractC0623y.class.getSimpleName().equals("OrderableUnit")) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public String m5144q() {
        String m5142s = m5142s();
        if ("1" != 0 && !VariableScope.nullOrMissingString.equals("1")) {
            m5142s = m5142s + "-1";
        }
        return m5142s;
    }

    /* renamed from: r */
    public void m5143r() {
        f1217a = null;
        m5142s();
    }

    /* renamed from: s */
    public String m5142s() {
        if (f1217a != null) {
            return f1217a;
        }
        String str = "v" + m5141t();
        if (!Core.f6190as || f6206aV) {
            str = "DEBUG BUILD - " + str;
        } else if (Core.f6191at) {
            str = "TESTING BUILD - " + str;
        } else if (str.contains("p")) {
            str = "BETA VERSION - " + str;
        }
        if (!Core.f6210aZ && m5145p()) {
            str = "RAW - " + str;
        }
        f1217a = str;
        return f1217a;
    }

    /* renamed from: t */
    public String m5141t() {
        return "1.15p10";
    }

    /* renamed from: u */
    public String m5140u() {
        return "1.15p10";
    }

    /* renamed from: v */
    public synchronized void m5139v() {
        this.f1271ac = false;
        if (this.f1270ab != null) {
            this.f1270ab.cancel();
            this.f1270ab = null;
        }
    }

    /* renamed from: a */
    public synchronized void m5179a(Activity activity, InterfaceC0096f interfaceC0096f, boolean z) {
        synchronized (this.f1272ad) {
            if (!f6205aU) {
                interfaceC0096f.mo255a();
            }
            this.f6078an = activity;
            this.f6081aq = z;
            this.f6159cR = this.f6081aq;
            if (z && !this.f6242bG && !this.f6244bI && !Core.f6083ay && !this.f6122bX.lock1) {
                m5138w();
            }
            InterfaceC0096f interfaceC0096f2 = this.f6080ap;
            if (this.f6079ao == null) {
                this.f6079ao = interfaceC0096f;
            }
            this.f6080ap = interfaceC0096f;
            if (interfaceC0096f2 != null && interfaceC0096f2 != interfaceC0096f) {
                interfaceC0096f2.mo241j();
            }
            if (interfaceC0096f != null) {
                interfaceC0096f.mo238m();
            }
            if (this.f6117bS != null) {
                this.f6117bS.m1835e();
            }
            m5139v();
            m1079I();
        }
    }

    /* renamed from: w */
    public synchronized void m5138w() {
        if (this.f1273ae > 20) {
            return;
        }
        int i = this.settingEngine.nextBackgroundMap;
        this.settingEngine.nextBackgroundMap++;
        if (this.settingEngine.nextBackgroundMap > 3) {
            this.settingEngine.nextBackgroundMap = 1;
        }
        this.settingEngine.save();
        int m2153b = C0758f.m2153b(i, 1, 3);
        this.f6166dl = null;
        this.f6165dk = "maps/menu_background/menu" + m2153b + ".tmx";
        try {
            AbstractC0197n.m5071b(10, true);
            for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                C0136a c0136a = new C0136a(i2);
                if (i2 == 0) {
                    this.f6099bs = c0136a;
                }
            }
            m5173a(false, EnumC1063s.f6739a);
            this.f6243bH = true;
            this.f6117bS.m1800x();
            if (!this.f6242bG) {
                Core.m973g("Menu load failed");
                this.f1273ae++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    void m5158d(float f) {
        if (this.f6081aq && !this.f6243bH) {
            if (this.f1275ag == null) {
                this.f1275ag = m5137x();
                if (this.f1274af == this.f1275ag) {
                    this.f1275ag = null;
                }
            }
            if (this.f1274af == null) {
                this.f1274af = this.f1275ag;
                this.f1275ag = null;
            }
            if (this.f1276ah != 0.0f && this.f1275ag != null) {
                m5183a(f, this.f1275ag.f6958el, this.f1275ag.f6959em, this.f1276ah * 0.5f);
            }
            if (this.f1274af != null) {
                boolean m5183a = m5183a(f, this.f1274af.f6958el, this.f1274af.f6959em, (1.0f - this.f1276ah) * 0.5f);
                if (C0758f.m2209a(this.f6146cx + this.f6156cH, this.f6147cy + this.f6157cI, this.f1274af.f6958el, this.f1274af.f6959em) < 6400.0f) {
                    m5183a = true;
                }
                if (m5183a) {
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
    AbstractC0244am m5176a(AbstractC0197n abstractC0197n) {
        int i = 0;
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (!abstractC0244am.mo1756u() && (abstractC0244am.f1609bV == abstractC0197n || abstractC0197n == null)) {
                i++;
            }
        }
        if (i > 0) {
            int m2203a = C0758f.m2203a(0, i - 1);
            int i2 = 0;
            Iterator it2 = AbstractC0244am.f1590bD.iterator();
            while (it2.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it2.next();
                if (!abstractC0244am2.mo1756u() && (abstractC0244am2.f1609bV == abstractC0197n || abstractC0197n == null)) {
                    if (i2 == m2203a) {
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
    AbstractC0244am m5137x() {
        AbstractC0244am m5176a = m5176a(this.f6099bs);
        if (m5176a != null) {
            return m5176a;
        }
        return m5176a((AbstractC0197n) null);
    }

    /* renamed from: a */
    public boolean m5183a(float f, float f2, float f3, float f4) {
        float m2123d = C0758f.m2123d(this.f6146cx + this.f6156cH, this.f6147cy + this.f6157cI, f2, f3);
        float m2209a = C0758f.m2209a(this.f6146cx + this.f6156cH, this.f6147cy + this.f6157cI, f2, f3);
        float f5 = f4 * f;
        float f6 = 15.0f;
        if (15.0f < f5 + 1.0f) {
            f6 = f5 + 1.0f;
        }
        if (m2209a < f6 * f6 || this.f6141cs) {
            return true;
        }
        this.f6150cB += C0758f.m2092i(m2123d) * f5;
        this.f6151cC += C0758f.m2097h(m2123d) * f5;
        if (C0758f.m2137c(this.f6150cB) >= 1.0f || C0758f.m2137c(this.f6151cC) >= 1.0f) {
            this.f6146cx += this.f6150cB;
            this.f6147cy += this.f6151cC;
            this.f6150cB = 0.0f;
            this.f6151cC = 0.0f;
            m1060a(this.f6146cx, this.f6147cy);
            return false;
        }
        return false;
    }

    /* renamed from: y */
    public int m5136y() {
        return this.f1220d;
    }
}
