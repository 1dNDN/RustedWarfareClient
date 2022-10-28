package com.corrodinggames.rts.gameFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Debug;
import android.p003os.Handler;
import android.p003os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Toast;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p027f.C0538c;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p037f.C0802k;
import com.corrodinggames.rts.gameFramework.p040h.C0823a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;
import com.corrodinggames.rts.gameFramework.p043k.C0913a;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.p045m.C1049f;
import com.corrodinggames.rts.gameFramework.utility.C1066a;
import com.corrodinggames.rts.gameFramework.utility.C1087d;
import com.corrodinggames.rts.gameFramework.utility.C1096i;
import com.corrodinggames.rts.gameFramework.utility.InterfaceC1091e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l.class */
public abstract class LoggerMaybe {

    /* renamed from: an */
    public Context f6078an;

    /* renamed from: ao */
    public InterfaceC0096f f6079ao;

    /* renamed from: ap */
    public InterfaceC0096f f6080ap;

    /* renamed from: aq */
    public boolean f6081aq;

    /* renamed from: av */
    public static Throwable f6082av;

    /* renamed from: ay */
    public static boolean f6083ay;

    /* renamed from: az */
    public static boolean f6084az;

    /* renamed from: aA */
    public static boolean f6085aA;

    /* renamed from: aB */
    public static boolean f6086aB;

    /* renamed from: aC */
    public static boolean f6087aC;

    /* renamed from: aD */
    public static boolean f6088aD;

    /* renamed from: aE */
    public static boolean f6089aE;

    /* renamed from: aF */
    public static boolean f6090aF;

    /* renamed from: aG */
    public static boolean f6091aG;

    /* renamed from: aJ */
    public static boolean f6092aJ;

    /* renamed from: aR */
    public static boolean f6093aR;

    /* renamed from: aS */
    public boolean f6094aS;

    /* renamed from: bg */
    public static Class f6095bg;

    /* renamed from: bh */
    public static InterfaceC1027y f6096bh;

    /* renamed from: bj */
    public boolean f6097bj;

    /* renamed from: bp */
    public boolean f6098bp;

    /* renamed from: bs */
    public AbstractC0197n f6099bs;

    /* renamed from: bv */
    public boolean f6100bv;

    /* renamed from: bw */
    public boolean f6101bw;

    /* renamed from: by */
    public int f6102by;

    /* renamed from: bz */
    public int f6103bz;

    /* renamed from: bA */
    public int f6104bA;

    /* renamed from: bB */
    public int f6105bB;

    /* renamed from: bC */
    public int f6106bC;

    /* renamed from: bD */
    public boolean f6107bD;

    /* renamed from: bJ */
    public int f6108bJ;

    /* renamed from: bK */
    public C1096i f6109bK;

    /* renamed from: bL */
    public C0173b f6110bL;

    /* renamed from: bM */
    public C0631e f6111bM;

    /* renamed from: bN */
    public C0648am f6112bN;

    /* renamed from: bO */
    public InterfaceC1027y f6113bO;

    /* renamed from: bP */
    public C0626a f6114bP;

    /* renamed from: bQ */
    public SettingsEngine f6115bQ;

    /* renamed from: bR */
    public C0743c f6116bR;

    /* renamed from: bS */
    public C0797f f6117bS;

    /* renamed from: bT */
    public C0638ac f6118bT;

    /* renamed from: bU */
    public C0907l f6119bU;

    /* renamed from: bV */
    public C0636aa f6120bV;

    /* renamed from: bW */
    public C0802k f6121bW;

    /* renamed from: bX */
    public C0831ad f6122bX;

    /* renamed from: bY */
    public C0722bg f6123bY;

    /* renamed from: bZ */
    public C0823a f6124bZ;

    /* renamed from: ca */
    public C1122y f6125ca;

    /* renamed from: cb */
    public C0716ba f6126cb;

    /* renamed from: cc */
    public C0538c f6127cc;

    /* renamed from: cd */
    public C0727bl f6128cd;

    /* renamed from: ce */
    public C1049f f6129ce;

    /* renamed from: cf */
    public C0736c f6130cf;

    /* renamed from: ch */
    public float f6131ch;

    /* renamed from: ci */
    public float f6132ci;

    /* renamed from: cj */
    public static Point f6133cj;

    /* renamed from: ck */
    public float f6134ck;

    /* renamed from: cl */
    public float f6135cl;

    /* renamed from: cn */
    public float f6136cn;

    /* renamed from: co */
    public float f6137co;

    /* renamed from: cp */
    public float f6138cp;

    /* renamed from: cq */
    public float f6139cq;

    /* renamed from: cr */
    public float f6140cr;

    /* renamed from: cs */
    public boolean f6141cs;

    /* renamed from: ct */
    public int f6142ct;

    /* renamed from: cu */
    public int f6143cu;

    /* renamed from: cv */
    public float f6144cv;

    /* renamed from: cw */
    public float f6145cw;

    /* renamed from: cx */
    public float f6146cx;

    /* renamed from: cy */
    public float f6147cy;

    /* renamed from: cz */
    public float f6148cz;

    /* renamed from: cA */
    public float f6149cA;

    /* renamed from: cB */
    public float f6150cB;

    /* renamed from: cC */
    public float f6151cC;

    /* renamed from: cD */
    public float f6152cD;

    /* renamed from: cE */
    public float f6153cE;

    /* renamed from: cF */
    public float f6154cF;

    /* renamed from: cG */
    public float f6155cG;

    /* renamed from: cH */
    public float f6156cH;

    /* renamed from: cI */
    public float f6157cI;

    /* renamed from: cQ */
    public boolean f6158cQ;

    /* renamed from: cR */
    public boolean f6159cR;

    /* renamed from: cS */
    public float f6160cS;

    /* renamed from: cT */
    public boolean f6161cT;

    /* renamed from: cY */
    public boolean f6162cY;

    /* renamed from: cZ */
    public float f6163cZ;

    /* renamed from: da */
    public float f6164da;

    /* renamed from: dk */
    public String f6165dk;

    /* renamed from: dl */
    public Reader f6166dl;

    /* renamed from: dm */
    public Paint f6167dm;

    /* renamed from: dn */
    public Paint f6168dn;

    /* renamed from: do */
    public Paint f6169do;

    /* renamed from: dv */
    public int f6170dv;

    /* renamed from: dz */
    float f6171dz;

    /* renamed from: dD */
    public String f6172dD;

    /* renamed from: dE */
    public String f6173dE;

    /* renamed from: dF */
    public String f6174dF;

    /* renamed from: dJ */
    String f6175dJ;

    /* renamed from: dK */
    String f6176dK;

    /* renamed from: e */
    private int f6177e;

    /* renamed from: dO */
    static byte[] f6178dO;

    /* renamed from: dR */
    static C1087d f6179dR;

    /* renamed from: dU */
    static boolean f6180dU;

    /* renamed from: dW */
    static boolean f6181dW;

    /* renamed from: dX */
    static boolean f6182dX;

    /* renamed from: ed */
    public boolean f6183ed;

    /* renamed from: ee */
    public boolean f6184ee;

    /* renamed from: ef */
    public String f6185ef;

    /* renamed from: eg */
    public boolean f6186eg;

    /* renamed from: eh */
    public boolean f6187eh;

    /* renamed from: ei */
    static int f6188ei;

    /* renamed from: al */
    protected static LoggerMaybe f6189al = null;

    /* renamed from: as */
    public static boolean f6190as = true;

    /* renamed from: at */
    public static boolean f6191at = false;

    /* renamed from: au */
    public static boolean f6192au = false;

    /* renamed from: aw */
    public static boolean f6193aw = false;

    /* renamed from: ax */
    public static boolean f6194ax = false;

    /* renamed from: aH */
    public static boolean f6195aH = false;

    /* renamed from: aI */
    public static boolean f6196aI = false;

    /* renamed from: aK */
    public static String f6197aK = null;

    /* renamed from: aL */
    public static boolean f6198aL = false;

    /* renamed from: aM */
    public static boolean f6199aM = false;

    /* renamed from: aN */
    public static boolean f6200aN = false;

    /* renamed from: aO */
    public static boolean f6201aO = false;

    /* renamed from: aP */
    public static boolean f6202aP = false;

    /* renamed from: aQ */
    public static String f6203aQ = null;

    /* renamed from: aT */
    public static boolean f6204aT = false;

    /* renamed from: aU */
    public static boolean f6205aU = false;

    /* renamed from: aV */
    public static boolean f6206aV = false;

    /* renamed from: aW */
    public static boolean f6207aW = false;

    /* renamed from: aX */
    public static boolean f6208aX = false;

    /* renamed from: aY */
    public static boolean f6209aY = false;

    /* renamed from: aZ */
    public static boolean f6210aZ = false;

    /* renamed from: ba */
    public static String f6211ba = null;

    /* renamed from: bb */
    public static boolean f6212bb = false;

    /* renamed from: bc */
    public static boolean f6213bc = true;

    /* renamed from: bd */
    public static boolean f6214bd = true;

    /* renamed from: be */
    public static boolean f6215be = false;

    /* renamed from: bf */
    public static boolean f6216bf = false;

    /* renamed from: dx */
    public static AbstractC1059o f6217dx = new C1119v();

    /* renamed from: dy */
    public static String f6218dy = Build.VERSION.RELEASE;

    /* renamed from: dN */
    public static boolean f6219dN = false;

    /* renamed from: dP */
    static byte[] f6220dP = new byte[1000];

    /* renamed from: dQ */
    static byte[] f6221dQ = new byte[1000];

    /* renamed from: dS */
    static boolean f6222dS = false;

    /* renamed from: dT */
    static int f6223dT = 0;

    /* renamed from: dV */
    static EnumC1065u f6224dV = null;

    /* renamed from: aj */
    public final Object f6225aj = new Object();

    /* renamed from: ak */
    public final Object f6226ak = new Object();

    /* renamed from: am */
    public Context f6227am = null;

    /* renamed from: ar */
    public boolean f6228ar = false;

    /* renamed from: bi */
    public boolean f6229bi = false;

    /* renamed from: bk */
    public boolean f6230bk = false;

    /* renamed from: bl */
    public boolean f6231bl = false;

    /* renamed from: bm */
    public boolean f6232bm = false;

    /* renamed from: bn */
    public boolean f6233bn = false;

    /* renamed from: bo */
    public boolean f6234bo = false;

    /* renamed from: bq */
    public boolean f6235bq = false;

    /* renamed from: br */
    public boolean f6236br = false;

    /* renamed from: bt */
    public float f6237bt = 1.0f;

    /* renamed from: bu */
    public float f6238bu = -1.0f;

    /* renamed from: bx */
    public int f6239bx = 0;

    /* renamed from: bE */
    public boolean f6240bE = false;

    /* renamed from: bF */
    public volatile boolean f6241bF = false;

    /* renamed from: bG */
    public volatile boolean f6242bG = false;

    /* renamed from: bH */
    public volatile boolean f6243bH = false;

    /* renamed from: bI */
    public volatile boolean f6244bI = false;

    /* renamed from: cg */
    public boolean f6245cg = false;

    /* renamed from: cm */
    public float f6246cm = 1.0f;

    /* renamed from: cJ */
    public final Rect f6247cJ = new Rect();

    /* renamed from: cK */
    public final Rect f6248cK = new Rect();

    /* renamed from: cL */
    public final RectF f6249cL = new RectF();

    /* renamed from: cM */
    public final Rect f6250cM = new Rect();

    /* renamed from: cN */
    public final RectF f6251cN = new RectF();

    /* renamed from: cO */
    public final RectF f6252cO = new RectF();

    /* renamed from: cP */
    public final Rect f6253cP = new Rect();

    /* renamed from: cU */
    public float f6254cU = 1.0f;

    /* renamed from: cV */
    public boolean f6255cV = false;

    /* renamed from: cW */
    public float f6256cW = 1.0f;

    /* renamed from: cX */
    public float f6257cX = 1.0f;

    /* renamed from: db */
    public boolean f6258db = true;

    /* renamed from: dc */
    public boolean f6259dc = true;

    /* renamed from: dd */
    public boolean f6260dd = true;

    /* renamed from: de */
    public boolean f6261de = true;

    /* renamed from: df */
    public boolean f6262df = true;

    /* renamed from: dg */
    public float f6263dg = 0.0f;

    /* renamed from: dh */
    public float f6264dh = 0.0f;

    /* renamed from: di */
    public boolean f6265di = false;

    /* renamed from: dj */
    protected C1123z f6266dj = null;

    /* renamed from: dp */
    public boolean f6267dp = false;

    /* renamed from: dq */
    public boolean f6268dq = false;

    /* renamed from: dr */
    public float f6269dr = 0.0f;

    /* renamed from: ds */
    public boolean f6270ds = false;

    /* renamed from: dt */
    public boolean f6271dt = false;

    /* renamed from: du */
    public boolean f6272du = false;

    /* renamed from: dw */
    public float f6273dw = 0.0f;

    /* renamed from: dA */
    boolean f6274dA = false;

    /* renamed from: dB */
    ArrayList f6275dB = new ArrayList();

    /* renamed from: dC */
    final Handler f6276dC = new Handler(Looper.m5404b());

    /* renamed from: a */
    private Runnable f6277a = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.l.1
        @Override // java.lang.Runnable
        public void run() {
            String str = LoggerMaybe.this.f6172dD;
            try {
                if (str == null) {
                    LoggerMaybe.m990b("Cannot show toast, no message");
                } else {
                    Toast.makeText(LoggerMaybe.this.f6227am, str, 1).show();
                }
            } catch (Exception e) {
                LoggerMaybe.m990b("Error showing toast: " + ((Object) str));
                e.printStackTrace();
            }
        }
    };

    /* renamed from: b */
    private Runnable f6278b = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.l.2
        @Override // java.lang.Runnable
        public void run() {
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.gameFramework.l.2.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    LoggerMaybe.this.f6098bp = false;
                }
            };
            DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: com.corrodinggames.rts.gameFramework.l.2.2
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    LoggerMaybe.this.f6098bp = false;
                }
            };
            LoggerMaybe.LogDebug2("showMessageBoxRunnable context:" + LoggerMaybe.this.f6227am.getClass().getName());
            try {
                new AlertDialog.Builder(LoggerMaybe.this.f6227am).setIcon(17301543).setTitle(LoggerMaybe.this.f6173dE).setMessage(LoggerMaybe.this.f6174dF).setOnCancelListener(onCancelListener).setPositiveButton("Ok", onClickListener).show();
            } catch (WindowManager.BadTokenException e) {
                LoggerMaybe.m990b("Failed to show message: " + LoggerMaybe.this.f6174dF);
                e.printStackTrace();
            }
        }
    };

    /* renamed from: dG */
    public AbstractC1057n f6279dG = null;

    /* renamed from: dH */
    transient String f6280dH = null;

    /* renamed from: dI */
    Object f6281dI = new Object();

    /* renamed from: dL */
    public boolean[] f6282dL = new boolean[10];

    /* renamed from: dM */
    protected ConcurrentLinkedQueue f6283dM = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private boolean[] f6284c = new boolean[KeyEvent.m5353a() + 1];

    /* renamed from: d */
    private boolean[] f6285d = new boolean[KeyEvent.m5353a() + 1];

    /* renamed from: dY */
    public byte f6286dY = 42;

    /* renamed from: dZ */
    public byte f6287dZ = 42;

    /* renamed from: ea */
    public final C1061q f6288ea = new C1061q();

    /* renamed from: eb */
    public final C1061q f6289eb = new C1061q();

    /* renamed from: ec */
    public final C1061q f6290ec = new C1061q();

    /* renamed from: a */
    public abstract void m1045a(Context context);

    /* renamed from: a */
    public abstract boolean m1053a();

    /* renamed from: a */
    public abstract boolean m1030a(boolean z);

    /* renamed from: a */
    public abstract void m1046a(Activity activity, InterfaceC0096f interfaceC0096f, boolean z);

    /* renamed from: b */
    public abstract void m993b(int i, int i2);

    /* renamed from: c */
    public abstract int m980c(boolean z);

    /* renamed from: m */
    public abstract boolean m953m();

    /* renamed from: o */
    public abstract boolean m950o();

    /* renamed from: k */
    public abstract String m958k();

    /* renamed from: l */
    public abstract String m955l();

    /* renamed from: q */
    public abstract String m947q();

    /* renamed from: s */
    public abstract String m945s();

    /* renamed from: t */
    public abstract String m944t();

    /* renamed from: r */
    public abstract void m946r();

    /* renamed from: u */
    public abstract String m943u();

    /* renamed from: a */
    public abstract void m1028a(boolean z, boolean z2, EnumC1063s enumC1063s);

    /* renamed from: a */
    public abstract void m1029a(boolean z, EnumC1063s enumC1063s);

    /* renamed from: e */
    public abstract void m974e();

    /* renamed from: w */
    public abstract void m942w();

    /* renamed from: a */
    public abstract void m1050a(float f, int i);

    /* renamed from: y */
    public abstract int m941y();

    /* renamed from: b */
    public abstract int m996b();

    /* renamed from: c */
    public abstract boolean m987c();

    /* renamed from: d */
    public abstract boolean m979d();

    /* renamed from: b */
    public static boolean m991b(Context context) {
        String mo5599h;
        if (f6205aU) {
            mo5599h = "dedicatedServer";
        } else {
            mo5599h = context.mo5600g().mo5599h();
        }
        Log.m5365d("RustedWarfare", "packageName:" + mo5599h);
        if (mo5599h.contains("rtsdemo")) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m940z() {
        return this.f6159cR || this.f6160cS > 0.0f || this.f6161cT;
    }

    /* renamed from: A */
    public static final LoggerMaybe m1079A() {
        return f6189al;
    }

    /* renamed from: B */
    public static final boolean m1078B() {
        return f6215be;
    }

    /* renamed from: C */
    public static final boolean m1077C() {
        return f6216bf;
    }

    /* renamed from: c */
    public void m984c(Context context) {
        C0090c.m5238a(context);
        this.f6227am = context;
    }

    /* renamed from: a */
    public static synchronized LoggerMaybe m1044a(Context context, AbstractC1057n abstractC1057n) {
        if (f6189al != null) {
            if (abstractC1057n != null) {
                f6189al.f6279dG = abstractC1057n;
            }
            f6189al.m984c(context);
            return f6189al;
        }
        f6189al = f6217dx.mo453a(context);
        LogDebug2("Created new gameEngine of:" + f6189al.getClass().getName());
        if (abstractC1057n != null) {
            f6189al.f6279dG = abstractC1057n;
        }
        f6189al.m1045a(context);
        return f6189al;
    }

    public LoggerMaybe(Context context) {
        Log.m5365d("RustedWarfare", "GameEngine:GameEngine()");
        if (f6189al != null) {
            throw new RuntimeException("gameEngine already created");
        }
        m984c(context);
        f6189al = this;
    }

    protected void finalize() {
        Log.m5365d("RustedWarfare", "GameEngine:finalize()");
        super.finalize();
    }

    /* renamed from: D */
    public boolean m1076D() {
        return true;
    }

    /* renamed from: E */
    public void m1075E() {
    }

    /* renamed from: F */
    public String m1074F() {
        if (m1002au()) {
            return "PC";
        }
        if (f6210aZ) {
            String m1089a = C0913a.m1089a();
            if (m1089a != null) {
                return "IOS - " + m1089a;
            }
            return "IOS";
        } else if (f6205aU) {
            return "SERVER";
        } else {
            return Build.MODEL;
        }
    }

    /* renamed from: G */
    public String m1073G() {
        return f6218dy;
    }

    /* renamed from: H */
    public boolean m1072H() {
        if (this.f6243bH) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public synchronized void m1071I() {
        LogDebug2("--- setRunning ---");
        if (!m1002au() && !f6210aZ) {
            this.f6112bN.m2654h();
        }
        if (!f6207aW && !f6212bb && this.f6266dj == null) {
            this.f6266dj = new C1123z();
            this.f6266dj.m420a(true);
            this.f6266dj.start();
        }
    }

    /* renamed from: J */
    public synchronized void m1070J() {
        LogDebug2("--- setStoppedIfNotInGameThread ---");
        if (Thread.currentThread() != this.f6266dj) {
            m1069K();
        }
    }

    /* renamed from: K */
    public synchronized void m1069K() {
        LogDebug2("--- setStopped ---");
        if (this.f6266dj == null) {
            Log.m5365d("RustedWarfare", "gameThread already null");
            return;
        }
        if (!m1002au()) {
            this.f6112bN.m2656f();
        }
        this.f6266dj.m420a(false);
        if (Thread.currentThread() != this.f6266dj) {
            boolean z = true;
            while (z) {
                try {
                    this.f6266dj.join();
                    z = false;
                } catch (InterruptedException e) {
                }
            }
            Log.m5365d("RustedWarfare", "thread stop");
        } else {
            m965g("currentThread is game thread");
        }
        this.f6266dj = null;
        if (this.f6079ao != null) {
            this.f6079ao.mo243l();
        }
        if (this.f6240bE) {
            Debug.stopMethodTracing();
        }
    }

    /* renamed from: L */
    public boolean m1068L() {
        if (this.f6122bX == null || !this.f6122bX.lock1 || this.f6122bX.f5571F || this.f6126cb.m2413h()) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public boolean m1067M() {
        if (this.f6122bX == null) {
            return false;
        }
        return this.f6122bX.lock1;
    }

    /* renamed from: N */
    public boolean m1066N() {
        if (this.f6122bX == null) {
            return false;
        }
        return this.f6122bX.f5571F || this.f6122bX.lock1 || this.f6126cb.m2413h();
    }

    /* renamed from: O */
    public boolean m1065O() {
        if (this.f6122bX == null || this.f6122bX.f5571F) {
            return true;
        }
        return (this.f6122bX.lock1 || this.f6126cb.m2413h()) ? false : true;
    }

    /* renamed from: P */
    public void m1064P() {
        this.f6141cs = false;
        if (this.f6146cx < 0.0f) {
            this.f6146cx = 0.0f;
            this.f6141cs = true;
        }
        if (this.f6147cy < 0.0f) {
            this.f6147cy = 0.0f;
            this.f6141cs = true;
        }
        if (this.f6110bL != null) {
            if (this.f6146cx > this.f6110bL.m4898i() - this.f6152cD) {
                this.f6146cx = this.f6110bL.m4898i() - this.f6152cD;
                this.f6141cs = true;
            }
            if (this.f6147cy > this.f6110bL.m4897j() - this.f6149cA) {
                this.f6147cy = this.f6110bL.m4897j() - this.f6149cA;
                this.f6141cs = true;
            }
            if (this.f6152cD > this.f6110bL.m4898i()) {
                this.f6146cx = (this.f6110bL.m4898i() / 2.0f) - (this.f6152cD / 2.0f);
                this.f6141cs = true;
            }
            if (this.f6149cA > this.f6110bL.m4897j()) {
                this.f6147cy = (this.f6110bL.m4897j() / 2.0f) - (this.f6149cA / 2.0f);
                this.f6141cs = true;
            }
        }
        m1052a(this.f6146cx, this.f6147cy);
    }

    /* renamed from: a */
    public void m1052a(float f, float f2) {
        this.f6146cx = f;
        this.f6147cy = f2;
        this.f6142ct = (int) this.f6146cx;
        this.f6143cu = (int) this.f6147cy;
        this.f6144cv = ((int) (this.f6146cx * this.f6256cW)) / this.f6256cW;
        this.f6145cw = ((int) (this.f6147cy * this.f6256cW)) / this.f6256cW;
        int i = 90;
        if (m1078B()) {
            i = 210;
        }
        this.f6250cM.m5467a((int) (this.f6146cx - i), (int) (this.f6147cy - i), (int) (this.f6146cx + this.f6148cz + i), (int) (this.f6147cy + this.f6149cA + i));
        this.f6251cN.m5453a(this.f6250cM);
        this.f6253cP.m5467a((int) this.f6146cx, (int) this.f6147cy, (int) (this.f6146cx + this.f6148cz), (int) (this.f6147cy + this.f6149cA));
        this.f6252cO.m5454a((int) (this.f6146cx - 300), (int) (this.f6147cy - 300), (int) (this.f6146cx + this.f6148cz + 300), (int) (this.f6147cy + this.f6149cA + 300));
    }

    /* renamed from: b */
    public void m995b(float f, float f2) {
        m1052a(f - (this.f6152cD / 2.0f), f2 - (this.f6149cA / 2.0f));
    }

    /* renamed from: d */
    public static boolean m977d(Context context) {
        if (f6205aU) {
            return false;
        }
        if (Build.MODEL.equals("GT-I9100") || Build.MODEL.equals("GT-I9300")) {
            try {
                WifiInfo connectionInfo = ((WifiManager) context.mo5604c("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    if ("BlueStacks".equals(connectionInfo.getSSID())) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* renamed from: Q */
    public void m1063Q() {
        if (this.f6256cW != 1.0f) {
            this.f6113bO.mo232a(this.f6256cW, this.f6256cW);
        }
    }

    /* renamed from: R */
    public void m1062R() {
        if (this.f6256cW != 1.0f) {
            this.f6113bO.mo232a(1.0f / this.f6256cW, 1.0f / this.f6256cW);
        }
    }

    /* renamed from: a */
    public static void m1035a(String str, Exception exc) {
        LogDebug2(str);
        exc.printStackTrace();
    }

    /* renamed from: a */
    public static String m1034a(String str, String str2) {
        if (f6194ax && !str.contains("\u001b[0m")) {
            str = str2 + str + "\u001b[0m";
        }
        return str;
    }

    /* renamed from: a */
    public static void m1038a(String str) {
        LogDebug2(m1034a("--- ERROR: " + str, "\u001b[31m"));
    }

    /* renamed from: b */
    public static void m990b(String str) {
        LogDebug2(m1034a(str, "\u001b[33m"));
    }

    /* renamed from: a */
    public static void m1033a(String str, Throwable th) {
        m990b(str);
        LogDebug2(VariableScope.nullOrMissingString + th.toString());
        LogDebug2("cause:" + th.getCause());
        th.printStackTrace();
    }

    /* renamed from: c */
    public static void LogDebug(String str) {
        if (f6208aX) {
            Log.LogDebug("RustedWarfare", str);
        } else {
            Log.LogDebug("RustedWarfare", str);
        }
    }

    /* renamed from: d */
    public static void m976d(String str) {
        LogDebug(str);
    }

    /* renamed from: e */
    public static void LogDebug2(String str) {
        LogDebug(str);
    }

    /* renamed from: b */
    public static void m989b(String str, String str2) {
        LogDebug(str + ":" + str2);
    }

    /* renamed from: f */
    public static synchronized void m968f(String str) {
        LogDebug(str + " (at " + System.nanoTime() + ")");
    }

    /* renamed from: S */
    public static void m1061S() {
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            LogDebug2(stackTraceElement.toString());
        }
    }

    /* renamed from: T */
    public static String m1060T() {
        StackTraceElement[] stackTrace;
        String str = VariableScope.nullOrMissingString;
        for (int i = 0; i < new Throwable().getStackTrace().length; i++) {
            str = str + stackTrace[i].toString() + "\n";
        }
        return str;
    }

    /* renamed from: g */
    public static void m965g(String str) {
        m990b(str);
        m1061S();
    }

    /* renamed from: U */
    public static long m1059U() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static final boolean m1047a(long j, long j2) {
        long m1059U = m1059U();
        if (j + j2 < m1059U || m1059U < j - 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public float m1058V() {
        float f = this.f6131ch;
        if (this.f6115bQ != null) {
            f = f * this.f6115bQ.renderDensity * this.f6115bQ.uiRenderScale;
            if (this.f6115bQ.renderDoubleScale) {
                return f / 2.0f;
            }
        }
        return f;
    }

    /* renamed from: e */
    public int m973e(float f) {
        return (int) ((f * this.f6132ci) + 0.5f);
    }

    /* renamed from: a */
    public int m1049a(int i) {
        return (int) ((i * this.f6132ci) + 0.5f);
    }

    /* renamed from: W */
    public void m1057W() {
        if (this.f6171dz != this.f6132ci) {
            LogDebug2("Density size changed, refreshing fonts");
            synchronized (this.f6275dB) {
                Iterator it = this.f6275dB.iterator();
                while (it.hasNext()) {
                    ((C1029m) it.next()).m816a();
                }
            }
            this.f6171dz = this.f6132ci;
            if (this.f6113bO != null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public void m1056X() {
        Iterator it = this.f6275dB.iterator();
        while (it.hasNext()) {
            this.f6113bO.mo217a(((C1029m) it.next()).f6595b);
        }
        this.f6274dA = true;
    }

    /* renamed from: a */
    public void m1043a(Paint paint) {
        m1042a(paint, 16.0f);
    }

    /* renamed from: a */
    public void m1042a(Paint paint, float f) {
        C1029m c1029m = new C1029m(this);
        c1029m.f6594a = f;
        c1029m.f6595b = paint;
        c1029m.m816a();
        synchronized (this.f6275dB) {
            this.f6275dB.add(c1029m);
        }
        if (this.f6274dA) {
            this.f6113bO.mo217a(c1029m.f6595b);
        }
    }

    /* renamed from: h */
    public void m963h(String str) {
        m1032a(str, true);
    }

    /* renamed from: a */
    public void m1032a(String str, boolean z) {
        this.f6280dH = str;
        if (this.f6279dG != null) {
            this.f6279dG.mo114a(str, z);
        }
    }

    /* renamed from: Y */
    public void m1055Y() {
        this.f6280dH = null;
    }

    /* renamed from: i */
    public void m961i(String str) {
        m1037a(str, 1);
    }

    /* renamed from: a */
    public void m1037a(String str, int i) {
        if (f6205aU) {
            LogDebug2("alert:" + str);
        } else if (str == null) {
            m965g("Cannot show alert, no message text");
        } else {
            this.f6172dD = str;
            this.f6276dC.m5414a(this.f6277a);
        }
        if (this.f6279dG != null) {
            this.f6279dG.mo116a(str, i);
        }
    }

    /* renamed from: Z */
    public boolean m1054Z() {
        if (this.f6279dG != null) {
            return this.f6279dG.mo110c();
        }
        return false;
    }

    /* renamed from: a */
    public void m1036a(String str, C0385az c0385az) {
        String str2 = null;
        if (c0385az != null) {
            str2 = c0385az.m3994b();
        }
        m982c(str, str2);
    }

    /* renamed from: c */
    public void m982c(String str, String str2) {
        if (this.f6279dG != null) {
            this.f6279dG.mo115a(str, str2);
        }
        if (f6205aU) {
            if (this.f6279dG == null) {
                m990b("showMessageBox: not showing due to non-android:" + str2);
                return;
            }
            return;
        }
        this.f6098bp = true;
        this.f6173dE = str;
        this.f6174dF = str2;
        this.f6276dC.m5414a(this.f6278b);
    }

    /* renamed from: aa */
    public void m1022aa() {
        synchronized (this.f6281dI) {
            if (this.f6175dJ != null) {
                m982c(this.f6176dK, this.f6175dJ);
                this.f6175dJ = null;
                this.f6176dK = null;
            }
        }
    }

    /* renamed from: d */
    public void m975d(String str, String str2) {
        this.f6176dK = str;
        this.f6175dJ = str2;
        if (f6207aW) {
            m1022aa();
        } else {
            new Thread() { // from class: com.corrodinggames.rts.gameFramework.l.3
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        sleep(3000L);
                    } catch (InterruptedException e) {
                    }
                    LoggerMaybe.this.m1022aa();
                }
            }.start();
        }
    }

    /* renamed from: ab */
    public boolean m1021ab() {
        if (this.f6081aq || this.f6079ao.mo244k() == null) {
            return false;
        }
        return this.f6079ao.mo244k().m5204b();
    }

    /* renamed from: ac */
    public void m1020ac() {
        if (this.f6079ao.mo244k() == null) {
            return;
        }
        this.f6079ao.mo244k().m5203c();
    }

    /* renamed from: ad */
    public int m1019ad() {
        if (this.f6081aq) {
            return 0;
        }
        return this.f6079ao.mo244k().m5207a();
    }

    /* renamed from: ae */
    public float m1018ae() {
        return m994b(0);
    }

    /* renamed from: af */
    public float m1017af() {
        return m986c(0);
    }

    /* renamed from: b */
    public float m994b(int i) {
        if (this.f6115bQ.renderDoubleScale) {
            return this.f6079ao.mo244k().m5202d()[i] / 2.0f;
        }
        return this.f6079ao.mo244k().m5202d()[i];
    }

    /* renamed from: c */
    public float m986c(int i) {
        if (this.f6115bQ.renderDoubleScale) {
            return this.f6079ao.mo244k().m5200f()[i] / 2.0f;
        }
        return this.f6079ao.mo244k().m5200f()[i];
    }

    /* renamed from: d */
    public int m978d(int i) {
        return this.f6079ao.mo244k().m5201e()[i];
    }

    /* renamed from: e */
    public boolean m972e(int i) {
        if (i != 1 && i != 2 && i != 3) {
            throw new RuntimeException("Unknown mouseButton:" + i);
        }
        if (m969f(i) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m969f(int i) {
        if (i == 0) {
            throw new RuntimeException("finding state of 0 doesn't make sense");
        }
        int[] m5201e = this.f6079ao.mo244k().m5201e();
        for (int i2 = 0; i2 < m5201e.length; i2++) {
            if (m5201e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public boolean m966g(int i) {
        if (i < this.f6284c.length && i >= 0 && this.f6284c[i] && this.f6285d[i]) {
            this.f6285d[i] = false;
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m964h(int i) {
        if (i >= this.f6284c.length || i < 0) {
            return false;
        }
        return this.f6284c[i];
    }

    /* renamed from: a */
    public boolean m1048a(int i, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        int m1016ag = m1016ag();
        if ((i & 2) != 0) {
            if ((m1016ag & 2) == 0) {
                z2 = false;
            }
        } else if ((m1016ag & 2) != 0) {
            z3 = false;
        }
        if ((i & 1) != 0) {
            if ((m1016ag & 1) == 0) {
                z2 = false;
            }
        } else if ((m1016ag & 1) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            if ((m1016ag & 4) == 0) {
                z2 = false;
            }
        } else if ((m1016ag & 4) != 0) {
            z3 = false;
        }
        if (z) {
            return z2;
        }
        return z2 && z3;
    }

    /* renamed from: i */
    public boolean m962i(int i) {
        if (i == 59 || i == 60 || i == 113 || i == 114 || i == 57 || i == 58) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static String m960j(int i) {
        String str = VariableScope.nullOrMissingString;
        if ((i & 2) != 0) {
            str = str + "shift+";
        }
        if ((i & 1) != 0) {
            str = str + "ctrl+";
        }
        if ((i & 4) != 0) {
            str = str + "alt+";
        }
        return str;
    }

    /* renamed from: ag */
    public int m1016ag() {
        int i = 0;
        if (m964h(59) || m964h(60)) {
            i = 0 + 2;
        }
        if (m964h(113) || m964h(114)) {
            i++;
        }
        if (m964h(57) || m964h(58)) {
            i += 4;
        }
        return i;
    }

    /* renamed from: c */
    public boolean m985c(int i, int i2) {
        boolean z = false;
        boolean z2 = false;
        if (i >= 0 && i < this.f6284c.length) {
            z = this.f6284c[i];
        }
        if (i2 >= 0 && i2 < this.f6284c.length) {
            z2 = this.f6284c[i2];
        }
        return z || z2;
    }

    /* renamed from: b */
    public void m992b(int i, boolean z) {
        if (i >= 0 && i < this.f6284c.length) {
            this.f6284c[i] = z;
            if (z) {
                this.f6285d[i] = z;
                return;
            }
            return;
        }
        LogDebug2("setKeyState: Key out of range:" + i);
    }

    /* renamed from: k */
    public void m957k(int i) {
        this.f6283dM.add(new C1064t(this, i));
    }

    /* renamed from: ah */
    public int m1015ah() {
        return this.f6177e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ai */
    public void m1014ai() {
        this.f6177e = 0;
        while (true) {
            C1060p c1060p = (C1060p) this.f6283dM.poll();
            if (c1060p != null) {
                if (c1060p instanceof C1062r) {
                    C1062r c1062r = (C1062r) c1060p;
                    if (c1062r.f6737c >= this.f6284c.length || c1062r.f6737c < 0) {
                        m989b("updateKeyState", "keyCode (" + c1062r.f6737c + ") is out of range");
                    } else {
                        this.f6284c[c1062r.f6737c] = !c1062r.f6738d;
                        this.f6285d[c1062r.f6737c] = !c1062r.f6738d;
                    }
                } else if (c1060p instanceof C1064t) {
                    this.f6177e += ((C1064t) c1060p).f6743c;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public static String m959j(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: k */
    public static String m956k(String str) {
        int i;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            i = 0;
        } else {
            i = lastIndexOf + 1;
        }
        return str.substring(i);
    }

    /* renamed from: l */
    public static Integer m954l(String str) {
        String m956k = m956k(str);
        LogDebug2("getMapLevel for :" + str + " file:" + m956k);
        Matcher matcher = Pattern.compile("^l(\\d*);.*").matcher(m956k);
        if (matcher.matches()) {
            LogDebug2("getMapLevel:" + str + ":" + Integer.parseInt(matcher.group(1)));
            return Integer.valueOf(Integer.parseInt(matcher.group(1)));
        }
        return null;
    }

    /* renamed from: m */
    public static String m952m(String str) {
        LoggerMaybe m1079A = m1079A();
        Integer m954l = m954l(str);
        if (m954l == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        String substring = str.substring(0, lastIndexOf);
        String[] m2239a = C0750a.m2239a(substring, true);
        if (m2239a == null) {
            return null;
        }
        for (String str2 : m2239a) {
            Integer m954l2 = m954l(str2);
            if (m954l2 != null && m954l2.intValue() > m954l.intValue() && (!m1079A.f6228ar || ActivityC0117i.m5218a(str2, substring + "/" + str2))) {
                return substring + "/" + str2;
            }
        }
        return null;
    }

    /* renamed from: aj */
    public String m1013aj() {
        return this.f6165dk;
    }

    /* renamed from: ak */
    public String m1012ak() {
        String str = this.f6165dk;
        if ((this.f6165dk == null || VariableScope.nullOrMissingString.equals(this.f6165dk)) && m1067M()) {
            str = this.f6122bX.m1434l();
        }
        return ActivityC0117i.m5215e(ActivityC0117i.m5216d(str));
    }

    /* renamed from: al */
    public String m1011al() {
        return ActivityC0117i.m5216d(this.f6165dk);
    }

    /* renamed from: am */
    public EnumC0846ai m1010am() {
        if (ActivityC0117i.m5213g(this.f6165dk)) {
            return EnumC0846ai.f5670b;
        }
        return EnumC0846ai.f5669a;
    }

    /* renamed from: a */
    public static String m1031a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    /* renamed from: b */
    public static String m988b(Throwable th) {
        String replace;
        Throwable th2;
        String message = th.getMessage();
        if (message == null) {
            replace = th.getClass().getName();
        } else {
            replace = message.replace("java.lang.RuntimeException: ", VariableScope.nullOrMissingString).replace("java.lang.RuntimeException: ", VariableScope.nullOrMissingString);
        }
        Throwable th3 = th;
        while (true) {
            th2 = th3;
            if (th2 != null) {
                Throwable cause = th2.getCause();
                if (cause == null || cause == th || cause == th2) {
                    break;
                }
                th3 = cause;
            } else {
                break;
            }
        }
        if (th2 != null && th2 != th) {
            String message2 = th2.getMessage();
            if (message2 == null) {
                message2 = th2.getClass().getName();
            }
            if (!message2.equals(replace)) {
                replace = replace + " caused by (" + message2 + ")";
            }
        }
        return replace;
    }

    /* renamed from: an */
    public static File m1009an() {
        C0750a.m2229d();
        String str = "/SD/rustedWarfare/crashes.txt";
        if (m1004as()) {
            str = "/SD/rustedWarfare/crashes.txt";
        }
        return new File(C0750a.m2226e(str));
    }

    /* renamed from: e */
    public static void m970e(String str, String str2) {
        try {
            PrintWriter printWriter = new PrintWriter(C0750a.m2243a(m1009an(), true));
            printWriter.write("\r\n" + str + " (at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + " - 1.15p10" + VariableScope.nullOrMissingString + ")\n");
            printWriter.write(str2 + "\r\n");
            printWriter.close();
        } catch (Throwable th) {
            LogDebug2("Exception in writeCrashToFile");
            th.printStackTrace();
        }
    }

    /* renamed from: ao */
    public static void m1008ao() {
        if (!f6191at || f6205aU) {
            return;
        }
        if (f6179dR != null) {
            m990b("setupANRWatchDog: activeANRWatchDog!=null");
            return;
        }
        f6179dR = new C1087d(4000);
        f6179dR.m569a(new InterfaceC1091e() { // from class: com.corrodinggames.rts.gameFramework.l.4
            @Override // com.corrodinggames.rts.gameFramework.utility.InterfaceC1091e
            /* renamed from: a */
            public void mo568a(C1066a c1066a) {
                if (LoggerMaybe.f6222dS) {
                    LoggerMaybe.m990b("activeANRWatchDog: ANR already detected");
                }
                LoggerMaybe.f6222dS = true;
                LoggerMaybe.m990b("activeANRWatchDog: ANR detected");
                String m1031a = LoggerMaybe.m1031a(c1066a);
                C0879n.m1262a("detectedANR", m1031a);
                try {
                    Thread.sleep(400L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(C1122y.m429a("lastFreeze", VariableScope.nullOrMissingString, true));
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    printStream.print(m1031a);
                    printStream.close();
                    fileOutputStream.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        });
        f6179dR.start();
        m990b("setupANRWatchDog: running");
    }

    /* renamed from: ap */
    public static void m1007ap() {
        if (f6178dO == null && m1002au()) {
            f6178dO = new byte[2500000];
            f6178dO[0] = 2;
            f6178dO[f6178dO.length - 1] = 5;
        }
        if (f6085aA) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
            if (!(uncaughtExceptionHandler instanceof C0826i)) {
                Thread.currentThread().setUncaughtExceptionHandler(new C0826i(uncaughtExceptionHandler));
                return;
            }
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(defaultUncaughtExceptionHandler instanceof C0826i)) {
            Thread.setDefaultUncaughtExceptionHandler(new C0826i(defaultUncaughtExceptionHandler));
        }
    }

    /* renamed from: aq */
    public boolean m1006aq() {
        return true;
    }

    /* renamed from: ar */
    public boolean m1005ar() {
        return true;
    }

    /* renamed from: n */
    public static void m951n(String str) {
        LoggerMaybe m1079A = m1079A();
        if (m1079A != null) {
            f6223dT++;
            if (f6223dT < 1000) {
                m990b("reportProblem: " + str);
            }
            if (f6223dT < 10) {
                m1079A.m1037a(str, 1);
            }
        }
    }

    /* renamed from: as */
    public static boolean m1004as() {
        return !f6205aU;
    }

    /* renamed from: at */
    public static boolean m1003at() {
        return !f6207aW || f6210aZ;
    }

    /* renamed from: au */
    public static boolean m1002au() {
        return f6207aW && !f6210aZ;
    }

    /* renamed from: av */
    public static boolean m1001av() {
        return f6207aW && !f6210aZ;
    }

    /* renamed from: aw */
    public static boolean m1000aw() {
        return f6205aU && !f6207aW;
    }

    /* renamed from: ax */
    public boolean m999ax() {
        return this.f6122bX.lock1 || this.f6126cb.m2413h();
    }

    /* renamed from: a */
    public void m1041a(AbstractC0244am abstractC0244am, float f) {
        this.f6121bW.m1743a((int) abstractC0244am.f6957el, (int) abstractC0244am.f6958em, f, abstractC0244am);
        this.f6117bS.f5116f.m1899c(abstractC0244am);
    }

    /* renamed from: ay */
    public static boolean m998ay() {
        LoggerMaybe m1079A = m1079A();
        if (m1079A != null && m1079A.f6115bQ.teamShaders && (m1079A.f6115bQ.newRender || !m1004as())) {
            return true;
        }
        return f6200aN;
    }

    /* renamed from: az */
    public static boolean m997az() {
        LoggerMaybe m1079A = m1079A();
        if (m1079A != null && m1079A.f6115bQ.shaderEffects && (m1079A.f6115bQ.newRender || !m1004as())) {
            return true;
        }
        return f6199aM;
    }

    /* renamed from: aA */
    public static boolean m1027aA() {
        LoggerMaybe m1079A = m1079A();
        if (m1079A != null && m1079A.f6115bQ.shaderEffects && (m1079A.f6115bQ.newRender || !m1004as())) {
            return true;
        }
        return f6199aM;
    }

    /* renamed from: aB */
    public static void m1026aB() {
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : Long.valueOf(maxMemory)));
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
    }

    /* renamed from: aC */
    public Context m1025aC() {
        return this.f6227am;
    }

    /* renamed from: f */
    public static void m967f(String str, String str2) {
        LoggerMaybe m1079A = m1079A();
        if (m1079A == null) {
            return;
        }
        if (m1079A.f6117bS != null && m1079A.f6117bS.f5115e != null) {
            m1079A.f6117bS.f5115e.m1752a(str, str2);
        } else {
            m965g("addMessage: interfaceEngine/messageInterface==null");
        }
    }

    /* renamed from: a */
    public static void m1040a(EnumC1065u enumC1065u, Throwable th) {
        f6220dP = null;
        LogDebug2("reportCaughtOutOfMemory:" + f6224dV);
        if (f6224dV != null) {
            return;
        }
        f6224dV = enumC1065u;
        if (th != null) {
            m981c(th);
        }
        m1026aB();
    }

    /* renamed from: c */
    public static void m981c(Throwable th) {
        try {
            th.printStackTrace();
        } catch (Throwable th2) {
            LogDebug2("Failed to print stacktrace");
        }
    }

    /* renamed from: aD */
    public void m1024aD() {
        if (f6181dW && !f6182dX) {
            f6182dX = true;
            String str = "Warning game has less than 5mb of free space remaining. A larger battle might cause a crash. ";
            int m1656h = this.f6124bZ.m1656h();
            if (m1656h > 1) {
                str = str + "This is often caused by large mods, you currently have: " + m1656h + " mods loaded. ";
            }
            m982c("Warning: Low memory detected", str);
        }
        if (!f6180dU && f6224dV != null) {
            LogDebug2("Showing out of memory message");
            f6180dU = true;
            String str2 = "trying to load data";
            if (f6224dV == EnumC1065u.f6745a) {
                str2 = "trying to load game textures";
            } else if (f6224dV == EnumC1065u.f6746b) {
                str2 = "trying to create a texture";
            } else if (f6224dV == EnumC1065u.f6747c) {
                str2 = "trying to colour new texture";
            } else if (f6224dV == EnumC1065u.f6748d) {
                str2 = "trying to create texture buffer for on-screen fog fading";
            } else if (f6224dV == EnumC1065u.f6749e) {
                str2 = "trying to create game fonts";
            } else if (f6224dV == EnumC1065u.f6750f) {
                str2 = "trying to load game sounds";
            } else if (f6224dV == EnumC1065u.f6751g) {
                str2 = "trying to load UI textures";
            }
            String str3 = "The game ran out of memory " + str2 + ". ";
            int m1656h2 = this.f6124bZ.m1656h();
            if (m1656h2 > 1) {
                str3 = str3 + "This is often caused by large mods, you currently have: " + m1656h2 + " mods. ";
            }
            if (m1002au() && !C0191i.f1218b) {
                str3 = str3 + "You are also using the 32 bit version, switching to the 64 bit version might help. ";
            }
            m982c("Warning: Out Of Memory", str3);
        }
    }

    /* renamed from: aE */
    public void m1023aE() {
        try {
            byte[] bArr = new byte[5000000];
            bArr[0] = this.f6286dY;
            this.f6287dZ = bArr[1];
        } catch (OutOfMemoryError e) {
            System.gc();
            LogDebug2("Low memory detected");
            e.printStackTrace();
            f6181dW = true;
        }
    }

    /* renamed from: a */
    public void m1039a(Runnable runnable) {
        this.f6289eb.m735a(runnable);
    }

    /* renamed from: a */
    public final boolean m1051a(float f, float f2, float f3) {
        return this.f6249cL.f234a < f + f3 && f - f3 < this.f6249cL.f236c && this.f6249cL.f235b < f2 + f3 && f2 - f3 < this.f6249cL.f237d;
    }

    /* renamed from: o */
    public static boolean m949o(String str) {
        if (f6203aQ == null) {
            return false;
        }
        return f6203aQ.contains(str);
    }

    /* renamed from: p */
    public static void m948p(String str) {
        C0831ad c0831ad = m1079A().f6122bX;
        String str2 = VariableScope.nullOrMissingString + str;
        m990b(str2);
        m1061S();
        f6188ei++;
        if (f6188ei < 10 && c0831ad != null) {
            c0831ad.m1431m(str2);
        }
    }
}
