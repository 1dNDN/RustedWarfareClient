package com.corrodinggames.rts.java;

import android.content.ServerContext;
import android.graphics.Point;
import android.p003os.Looper;
import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.ActivityC0122n;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.AbstractC1057n;
import com.corrodinggames.rts.gameFramework.C0638ac;
import com.corrodinggames.rts.gameFramework.C0648am;
import com.corrodinggames.rts.gameFramework.C0664av;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p030a.C0632f;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0830ac;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0841ae;
import com.corrodinggames.rts.gameFramework.p041i.C0867c;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import com.corrodinggames.rts.gameFramework.p044l.C1026x;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.C1081aj;
import com.corrodinggames.rts.gameFramework.utility.C1100l;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.p051b.C1153a;
import com.corrodinggames.rts.java.p052c.C1157b;
import com.corrodinggames.rts.java.p053d.C1171a;
import com.corrodinggames.rts.p008a.RunnableC0069a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.Input;
import org.newdawn.slick.ScalableGame;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.VBORenderer;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/Main.class */
public class Main extends C0830ac {

    /* renamed from: a */
    public static boolean f6970a = false;

    /* renamed from: b */
    public static boolean f6971b = true;

    /* renamed from: c */
    public static String f6972c = "Rusted Warfare";

    /* renamed from: d */
    public C1170d f6973d;

    /* renamed from: h */
    public C0831ad f6977h;

    /* renamed from: i */
    C1153a f6978i;

    /* renamed from: j */
    public C1191u f6979j;

    /* renamed from: k */
    C1152b f6980k;

    /* renamed from: l */
    String[] f6981l;

    /* renamed from: m */
    static Main f6982m;

    /* renamed from: n */
    int f6983n;

    /* renamed from: p */
    C1171a f6985p;

    /* renamed from: r */
    Thread f6987r;

    /* renamed from: u */
    public boolean f6990u;

    /* renamed from: v */
    public int f6991v;

    /* renamed from: e */
    public String f6974e = "#28";

    /* renamed from: f */
    C1081aj f6975f = new C1081aj();

    /* renamed from: g */
    boolean f6976g = true;

    /* renamed from: o */
    long f6984o = System.nanoTime();

    /* renamed from: q */
    AbstractC1057n f6986q = new C1177i(this);

    /* renamed from: s */
    boolean f6988s = true;

    /* renamed from: t */
    Object f6989t = new Object();

    public static void main(String[] strArr) {
        f6982m = new Main();
        f6982m.m406a(strArr);
        new Runnable() { // from class: com.corrodinggames.rts.java.Main.1
            @Override // java.lang.Runnable
            public void run() {
                Main.f6982m.m398f();
            }
        };
    }

    /* renamed from: a */
    public static void m408a(String str) {
        AbstractC0916l.m963e(str);
    }

    /* renamed from: f */
    public void m398f() {
        C1100l c1100l = new C1100l(new InputStreamReader(System.in));
        while (this.f6976g) {
            try {
                String m539a = c1100l.m539a();
                if (m539a == null) {
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    m409a((C0867c) null, "ADMIN", m539a, true);
                }
            } catch (IOException e2) {
                if (this.f6983n < 3) {
                    AbstractC0916l.m963e("Error while reading stdin: " + e2.toString());
                    this.f6983n++;
                    if (this.f6983n == 3) {
                        AbstractC0916l.m963e("Too many stdin errors, ignoring");
                    }
                }
                try {
                    Thread.sleep(700L);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* renamed from: g */
    public void m397g() {
        final Semaphore semaphore = new Semaphore(0);
        Thread thread = new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.Main.2
            @Override // java.lang.Runnable
            public void run() {
                AbstractC0916l.m999ap();
                Looper.m4974a();
                semaphore.release(1);
                Looper.m4971c();
            }
        });
        thread.setDaemon(true);
        thread.start();
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized void m406a(String[] strArr) {
        float f;
        float f2;
        this.f6981l = strArr;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        Integer num = null;
        Integer num2 = null;
        AbstractC0916l.m963e("Reading args");
        String str = null;
        String str2 = null;
        int i = 0;
        while (i < strArr.length) {
            String lowerCase = strArr[i].trim().toLowerCase(Locale.ENGLISH);
            if (str != null) {
                if (str.equals("+connect_lobby")) {
                    m408a("connect lobby:" + lowerCase);
                    AbstractC0916l.f6105aK = lowerCase;
                    str = null;
                } else if (str.equals("-width")) {
                    num = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else if (str.equals("-height")) {
                    num2 = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else {
                    m408a("Unknown two_part_arg: " + str);
                    str = null;
                }
            } else if (lowerCase.equals("-debug")) {
                i++;
                if (i >= strArr.length) {
                    m408a("-debug requires parameters");
                    System.exit(1);
                }
                String str3 = strArr[i];
                RunnableC0069a.m4861a(Integer.parseInt(str3.split(":")[0]), str3.split(":")[1]);
            } else if (lowerCase.equals("-debugscript")) {
                i++;
                if (i >= strArr.length) {
                    m408a("-debugscript requires parameters");
                    System.exit(1);
                }
                RunnableC0069a.m4860a(strArr[i]);
            } else if (lowerCase.equals("-log")) {
                i++;
                if (i >= strArr.length) {
                    m408a("-log requires parameters");
                    System.exit(1);
                }
                String str4 = strArr[i];
                try {
                    PrintStream printStream = new PrintStream(str4);
                    System.setOut(printStream);
                    System.setErr(printStream);
                    AbstractC0916l.m963e("File logging started");
                } catch (FileNotFoundException e) {
                    AbstractC0916l.m1030a("Cannot open log file:" + str4);
                    e.printStackTrace();
                }
            } else if (!lowerCase.equals("-nologfile")) {
                if (lowerCase.equals("-lang")) {
                    i++;
                    if (i >= strArr.length) {
                        m408a("-lang requires parameters");
                        System.exit(1);
                    }
                    C0820a.f5401d = strArr[i];
                } else if (lowerCase.equals("-logcolor")) {
                    AbstractC0916l.f6092ax = true;
                } else if (lowerCase.equals("-nodisplay")) {
                    z = true;
                } else if (lowerCase.equals("-canvasgl")) {
                    AbstractC0916l.f6098aD = true;
                } else if (lowerCase.equals("-replay_debug")) {
                    AbstractC0916l.f6091aw = true;
                } else if (lowerCase.equals("-nopreferipv4")) {
                    z4 = true;
                } else if (lowerCase.equals("-noresources")) {
                    AbstractC0916l.f6096aB = true;
                } else if (lowerCase.equals("-nosound")) {
                    z2 = true;
                } else if (lowerCase.equals("-nomusic")) {
                    z3 = true;
                } else if (lowerCase.equals("-safemode")) {
                    AbstractC0916l.f6109aO = true;
                } else if (lowerCase.equals("-extrasafemode")) {
                    AbstractC0916l.f6110aP = true;
                } else if (lowerCase.equals("-disable_vbos")) {
                    z7 = true;
                } else if (lowerCase.equals("-disable_atlas")) {
                    AbstractC0916l.f6097aC = true;
                } else if (lowerCase.equals("-force_vbos")) {
                    z8 = true;
                } else if (lowerCase.equals("-allowsoftwarerender")) {
                    z5 = true;
                } else if (lowerCase.equals("-fullscreen")) {
                    z6 = true;
                } else if (lowerCase.equals("-nobackground")) {
                    AbstractC0916l.f6093ay = true;
                } else if (lowerCase.equals("-nomods")) {
                    AbstractC0916l.f6104aJ = true;
                } else if (lowerCase.equals("-printunits")) {
                    AbstractC0916l.f6099aE = true;
                } else if (lowerCase.equals("-outputunitimages")) {
                    AbstractC0916l.f6100aF = true;
                } else if (lowerCase.equals("-oldreplays")) {
                    AbstractC0916l.f6101aG = true;
                } else if (lowerCase.equals("-teamshaders")) {
                    AbstractC0916l.f6108aN = true;
                } else if (lowerCase.equals("-noteamshaders")) {
                    AbstractC0916l.f6108aN = false;
                } else if (lowerCase.equals("-devdebug")) {
                    i++;
                    if (i >= strArr.length) {
                        m408a("-debugscript requires parameters");
                        System.exit(1);
                    }
                    AbstractC0916l.f6111aQ = strArr[i];
                } else if (lowerCase.equals("-postprocessing")) {
                    AbstractC0916l.f6107aM = true;
                } else if (lowerCase.equals("-nopostprocessing")) {
                    AbstractC0916l.f6107aM = false;
                } else if (lowerCase.equals("-disabletextureread")) {
                    C1189s.f7264F = false;
                } else if (lowerCase.equals("-sandbox")) {
                    AbstractC0916l.f6103aI = true;
                } else if (lowerCase.equals("-steam")) {
                    AbstractC0916l.f6102aH = true;
                } else if (lowerCase.equals("-width") || lowerCase.equals("-height")) {
                    str = lowerCase;
                } else if (lowerCase.startsWith("+")) {
                    if (lowerCase.equals("+connect_lobby")) {
                        str = lowerCase;
                    } else {
                        m408a("Unknown steam option: " + lowerCase);
                    }
                } else if (lowerCase.trim().length() != 0) {
                    m408a("Unknown option: " + lowerCase);
                    str2 = "Unknown option: " + lowerCase;
                }
            }
            i++;
        }
        AbstractC0916l.m963e("Game arguments:");
        for (int i2 = 0; i2 < strArr.length; i2++) {
            m408a("arg: " + strArr[i2].trim().toLowerCase(Locale.ENGLISH));
        }
        if (str2 != null) {
            if (AbstractC0916l.f6102aH) {
                m408a("Unknown options but running anyway due to being in steam");
            } else {
                m408a("Exiting due to unknown option: " + str2);
                System.exit(1);
            }
        }
        AbstractC0916l.f6115aU = true;
        AbstractC0916l.m999ap();
        String property = System.getProperty("os.name");
        AbstractC0916l.m963e("OS name: " + property);
        AbstractC0916l.m963e("OS version: " + System.getProperty("os.version"));
        AbstractC0916l.m963e("LWJGL version: " + Sys.getVersion());
        AbstractC0916l.m963e("Build Number: " + this.f6974e);
        AbstractC0916l.m963e("Game Version: 1.15p10");
        AbstractC0916l.m963e("Game Code: 173");
        C0191i.f1218b = Sys.is64Bit();
        AbstractC0916l.m963e("Is 64bit: " + C0191i.f1218b);
        AbstractC0916l.m963e("JVM maxMemory:" + Runtime.getRuntime().maxMemory());
        AbstractC0916l.m963e("JVM totalMemory:" + Runtime.getRuntime().totalMemory());
        AbstractC0916l.m963e("JVM freeMemory:" + Runtime.getRuntime().freeMemory());
        if (property != null && property.toLowerCase().contains("mac os")) {
            C0191i.f1219c = true;
        }
        if (z4) {
            AbstractC0916l.m963e("Skipping preferIPv4Stack=true");
        } else {
            System.setProperty("java.net.preferIPv4Stack", "true");
        }
        if (AbstractC0916l.f6102aH) {
            C1058a.f6733a = new C1157b();
            AbstractC0916l.m963e("Early steam init");
            C1058a.m734a().mo289b();
            AbstractC0916l.m963e("Early steam init done.");
        } else {
            AbstractC0916l.m963e("steam not requested");
        }
        m397g();
        String str5 = f6972c;
        if (z) {
            str5 = VariableScope.nullOrMissingString;
        }
        Input.disableControllers();
        if (f6970a) {
            Renderer.setRenderer(2);
        }
        if (!z8 && C0191i.f1219c) {
            AbstractC0916l.m963e("Disabling vbo on mac (without force option)");
            z7 = true;
        }
        if (z7) {
            AbstractC0916l.m963e("disable_vbos requested");
            VBORenderer vBORenderer = Renderer.get();
            if (vBORenderer instanceof VBORenderer) {
                vBORenderer.disableVBOs();
            } else {
                AbstractC0916l.m963e("Failed to disable VBOs, wrong class");
            }
        }
        C1173e.m153c();
        this.f6979j = new C1191u(str5);
        this.f6979j.f7278b = this;
        this.f6979j.f7285i = z;
        this.f6979j.f7286j = z2;
        this.f6979j.f7287k = z3;
        if (z) {
            AbstractC0916l.m1030a("Skipping display mode call");
            f = 800.0f;
            f2 = 600.0f;
        } else {
            try {
                DisplayMode displayMode = Display.getDisplayMode();
                f = displayMode.getHeight();
                f2 = displayMode.getWidth();
            } catch (Exception e2) {
                AbstractC0916l.m1030a("Failed to get display mode, defaulting to min size");
                e2.printStackTrace();
                f = 800.0f;
                f2 = 600.0f;
            }
        }
        AbstractC0916l.m963e("screenHeight:" + f);
        AbstractC0916l.m963e("screenWidth:" + f2);
        int i3 = 1000;
        int i4 = 733;
        if (f > 800.0f) {
            i3 = 1000;
            i4 = 800;
        }
        if (f > 900.0f) {
            i3 = 1600;
            i4 = 900;
        }
        if (z) {
            i3 = 10;
            i4 = 10;
        }
        if (num != null) {
            AbstractC0916l.m963e("Overriding width to:" + num);
            i3 = num.intValue();
        }
        if (num2 != null) {
            AbstractC0916l.m963e("Overriding height to:" + num2);
            i4 = num2.intValue();
        }
        if (z5) {
            AbstractC0916l.m963e("allowSoftwareOpenGL is now on");
            System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
        }
        this.f6979j.f7288l = false;
        boolean z9 = z6;
        try {
            if (this.f6979j.f7288l) {
                this.f6979j.m38a(i3 * 2, i4 * 2);
                this.f6980k = new C1152b(new ScalableGame(this.f6979j, i3, i4), i3, i4, z9);
            } else {
                this.f6980k = new C1152b(this.f6979j, i3, i4, z9);
            }
            this.f6979j.f7279c = this.f6980k;
            Display.setResizable(true);
            this.f6987r = new Thread(new RunnableC1180j(this));
            this.f6987r.setDaemon(false);
            this.f6987r.start();
        } catch (SlickException e3) {
            throw new RuntimeException((Throwable) e3);
        }
    }

    /* renamed from: b */
    public void m402b(String str) {
        this.f6986q.mo108a(str, true);
    }

    /* renamed from: h */
    public synchronized void m396h() {
        m402b("displayModes");
        m402b("starting controllers");
        this.f6984o = System.nanoTime();
        AbstractC0916l.f6115aU = true;
        AbstractC0916l.f6122bb = true;
        if (!AbstractC0916l.f6096aB) {
            if (AbstractC0916l.f6098aD) {
                AbstractC0916l.f6118aX = true;
                AbstractC0916l.f6117aW = true;
                AbstractC0916l.f6127bg = C1026x.class;
            } else {
                AbstractC0916l.f6118aX = true;
                AbstractC0916l.f6117aW = true;
                AbstractC0916l.f6127bg = C1173e.class;
            }
        }
        if (this.f6979j != null && !this.f6979j.f7286j) {
            OpenALAudio openALAudio = new OpenALAudio(20, 9, 512);
            AbstractC0916l.m963e("openALAudio hasDevice:" + openALAudio.hasDevice());
            C0631e.f4037c = new C1185o(openALAudio);
            if (this.f6979j.f7287k) {
                AbstractC0916l.m963e("Music disabled");
                C0648am.f4164a = new C0664av();
            } else {
                C0648am.f4164a = new C1182l(openALAudio);
            }
        } else {
            AbstractC0916l.m982b("Disabling sound with NullSoundFactory");
            C0631e.f4037c = new C0632f();
            C0648am.f4164a = new C0664av();
        }
        C0879n.f5876d = new C1181k();
        C0638ac.f4083b = new C1193v();
        long m2370a = C0727bl.m2370a();
        m402b("loading libRocket");
        AbstractC0916l.m963e("start libRocket setup");
        this.f6973d = new C1170d();
        this.f6978i = C1153a.m296o();
        this.f6978i.f7085e = this;
        this.f6985p = new C1171a();
        this.f6978i.m4908a(this.f6985p, this.f6973d);
        this.f6985p.debug = false;
        this.f6985p.setup();
        m402b("libRocket - fonts");
        this.f6985p.loadFont("font/Delicious-Roman.otf");
        this.f6985p.loadFont("font/Delicious-Italic.otf");
        this.f6985p.loadFont("font/Delicious-Bold.otf");
        this.f6985p.loadFont("font/Delicious-BoldItalic.otf");
        this.f6985p.loadFont("font/Roboto-Regular.ttf");
        this.f6985p.loadFont("font/Roboto-Bold.ttf");
        AbstractC0916l.m963e("NotoSansCJKsc start");
        this.f6985p.loadFont("font/NotoSansCJKsc-Regular.otf", "notoSans");
        this.f6985p.loadFont("font/DroidSansFallback.ttf", "fallback");
        AbstractC0916l.m963e("NotoSansCJKsc end");
        this.f6978i.m4901c();
        AbstractC0916l.m963e("end libRocket setup");
        m402b("GuiEngine");
        C0727bl.m2365a("libRocket setup took:", m2370a);
        AbstractC0916l.f6249dy = this.f6974e;
        ServerContext serverContext = new ServerContext();
        m402b("GameEngine");
        AbstractC0916l.f6182cj = new Point(this.f6979j.f7277a.getWidth(), this.f6979j.f7277a.getHeight());
        AbstractC0916l m1036a = AbstractC0916l.m1036a(serverContext, this.f6986q);
        m402b("GameEngine ready");
        AbstractC0916l.m963e("version: " + m1036a.mo936t() + " " + m1036a.mo972c(false) + ":" + this.f6974e);
        this.f6978i.m4904b();
        RunnableC0069a.m4859b();
        this.f6977h = m1036a.f6170bX;
        m1036a.f6163bQ.showZoomButton = false;
        m1036a.f6163bQ.showUnitGroups = false;
        this.f6979j.m35a(this.f6973d);
        this.f6979j.m38a(1000, 800);
        long nanoTime = System.nanoTime();
        AbstractC0916l.m963e("-----------------------------");
        AbstractC0916l.m963e("----- Game init finished in:" + ((nanoTime - this.f6984o) / 1000000.0d) + " ms");
        m1036a.f6170bX.f5478d = this;
        m1036a.f6170bX.f5499y = "unset";
        if (!AbstractC0916l.f6093ay) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: b */
    public void mo405b() {
        this.f6975f.m570a(new Runnable() { // from class: com.corrodinggames.rts.java.Main.3
            @Override // java.lang.Runnable
            public void run() {
                AbstractC0916l m1071A = AbstractC0916l.m1071A();
                AbstractC0916l.m963e("got startGameEvent..");
                ActivityC0122n.m4759r();
                if (m1071A.f6158bL == null || !m1071A.f6158bL.f831W) {
                    AbstractC0916l.m963e("Not starting multiplayer game because map failed to load");
                    m1071A.f6170bX.m1518af();
                    return;
                }
                m1071A.f6170bX.f5601bt = true;
                m1071A.f6154bH = false;
                m1071A.f6085aq = false;
                Main.this.f6978i.m4900c(false);
                AbstractC0043a.m4910a().m4898e();
                Main.this.f6985p.getActiveDocument();
                if (Main.this.f6985p.f358c != null) {
                    Main.this.f6985p.f358c.getRoot().resumeNonMenu();
                    return;
                }
                AbstractC0916l.m963e("startGameEvent: scriptEngine==null");
                AbstractC0916l.m1053S();
            }
        });
    }

    /* renamed from: a */
    public void m414a(float f) {
        this.f6975f.m571a();
    }

    /* renamed from: a */
    public void m407a(boolean z) {
        this.f6976g = false;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (!z) {
            m1071A.f6170bX.m1412u();
        } else {
            m1071A.f6170bX.m1485b("shutdownServer");
        }
        try {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: a */
    public synchronized boolean mo410a(C0867c c0867c, String str, String str2) {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: b */
    public synchronized void mo403b(C0867c c0867c, String str, String str2) {
        m409a(c0867c, str, str2, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: c */
    public void mo401c() {
        ScriptEngine scriptEngine;
        if (!AbstractC0916l.m1071A().f6170bX.f5594bm && (scriptEngine = ScriptEngine.getInstance()) != null) {
            scriptEngine.addScriptToQueueIfNotAlreadyQueued("mp.refreshUI()");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: a */
    public synchronized void mo413a(final int i, final String str, final String str2, final C0867c c0867c) {
        if (this.f6985p != null && this.f6985p.f358c != null) {
            this.f6985p.f358c.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.Main.4
                @Override // java.lang.Runnable
                public void run() {
                    Main.this.f6985p.f358c.getRoot().receiveChatMessage(i, str, str2, c0867c);
                }
            });
        } else {
            AbstractC0916l.m1053S();
        }
    }

    /* renamed from: a */
    public synchronized void m409a(C0867c c0867c, String str, String str2, boolean z) {
        if (!z) {
            m408a(str + ": " + str2);
        }
        if (this.f6988s) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: a */
    public String mo411a(C0867c c0867c, String str) {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: c */
    public synchronized void mo400c(C0867c c0867c, String str, String str2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: b */
    public synchronized void mo404b(C0867c c0867c, String str) {
    }

    /* renamed from: i */
    public void m395i() {
        AbstractC0916l.m1071A();
        this.f6979j.m20g();
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: d */
    public void mo399d() {
        AbstractC0043a.m4910a().m4892n();
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0830ac
    /* renamed from: a */
    public void mo412a(C0841ae c0841ae) {
        AbstractC0043a.m4910a().m4907a(c0841ae);
    }
}
