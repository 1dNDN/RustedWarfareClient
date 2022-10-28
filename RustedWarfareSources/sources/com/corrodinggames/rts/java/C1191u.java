package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.appFramework.C0121m;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.C0193j;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p044l.C0943n;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.RunnableC0069a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.OpenGLException;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.imageout.ImageOut;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

/* renamed from: com.corrodinggames.rts.java.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/u.class */
public class C1191u extends BasicGame {

    /* renamed from: a */
    GameContainer f7277a;

    /* renamed from: b */
    Main f7278b;

    /* renamed from: c */
    C1152b f7279c;

    /* renamed from: d */
    C0943n f7280d;

    /* renamed from: e */
    AbstractC0916l f7281e;

    /* renamed from: f */
    C1170d f7282f;

    /* renamed from: g */
    boolean f7283g;

    /* renamed from: h */
    Object f7284h;

    /* renamed from: i */
    boolean f7285i;

    /* renamed from: j */
    boolean f7286j;

    /* renamed from: k */
    boolean f7287k;

    /* renamed from: l */
    boolean f7288l;

    /* renamed from: m */
    C1189s f7289m;

    /* renamed from: n */
    C1189s f7290n;

    /* renamed from: o */
    boolean f7291o;

    /* renamed from: p */
    boolean f7292p;

    /* renamed from: q */
    boolean f7293q;

    /* renamed from: r */
    boolean f7294r;

    /* renamed from: s */
    boolean f7295s;

    /* renamed from: t */
    int f7296t;

    /* renamed from: u */
    boolean f7297u;

    /* renamed from: v */
    boolean f7298v;

    /* renamed from: w */
    float f7299w;

    /* renamed from: x */
    float f7300x;

    /* renamed from: y */
    boolean f7301y;

    /* renamed from: X */
    private boolean[] f7302X;

    /* renamed from: z */
    int f7303z;

    /* renamed from: A */
    float f7304A;

    /* renamed from: B */
    float f7305B;

    /* renamed from: C */
    int f7306C;

    /* renamed from: D */
    int f7307D;

    /* renamed from: E */
    int f7308E;

    /* renamed from: F */
    int f7309F;

    /* renamed from: G */
    int f7310G;

    /* renamed from: H */
    int f7311H;

    /* renamed from: I */
    boolean f7312I;

    /* renamed from: J */
    boolean f7313J;

    /* renamed from: K */
    float f7314K;

    /* renamed from: L */
    int f7315L;

    /* renamed from: M */
    String f7316M;

    /* renamed from: N */
    String f7317N;

    /* renamed from: O */
    long f7318O;

    /* renamed from: P */
    float f7319P;

    /* renamed from: Q */
    int f7320Q;

    /* renamed from: R */
    int f7321R;

    /* renamed from: S */
    long f7322S;

    /* renamed from: T */
    float f7323T;

    /* renamed from: U */
    float f7324U;

    /* renamed from: V */
    int f7325V;

    /* renamed from: W */
    C0193j f7326W;

    public C1191u(String str) {
        super(str);
        this.f7283g = false;
        this.f7284h = new Object();
        this.f7285i = false;
        this.f7286j = false;
        this.f7287k = false;
        this.f7288l = false;
        this.f7292p = false;
        this.f7293q = false;
        this.f7294r = false;
        this.f7295s = false;
        this.f7297u = false;
        this.f7301y = false;
        this.f7302X = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP];
        this.f7303z = 0;
        this.f7304A = 0.0f;
        this.f7305B = 0.0f;
        this.f7306C = 0;
        this.f7307D = 0;
        this.f7314K = 0.0f;
        this.f7315L = 0;
        this.f7316M = VariableScope.nullOrMissingString;
        this.f7317N = VariableScope.nullOrMissingString;
        this.f7318O = -9999L;
        this.f7319P = 1.0f;
        this.f7320Q = 100;
        this.f7321R = 100;
        this.f7323T = 0.0f;
        this.f7324U = 0.0f;
    }

    public boolean closeRequested() {
        if (!this.f7285i && !RunnableC0069a.m4862a() && this.f7279c != null && !this.f7279c.isFullscreen()) {
            ScriptEngine.getInstance().addScriptToQueue("askQuitGame();");
            return false;
        }
        return true;
    }

    public void init(GameContainer gameContainer) {
        this.f7277a = gameContainer;
        gameContainer.setAlwaysRender(true);
        gameContainer.setForceExit(true);
        gameContainer.setShowFPS(false);
        gameContainer.setTargetFrameRate(300);
        if (AbstractC0916l.f6093ay) {
            gameContainer.setShowFPS(true);
            gameContainer.setTargetFrameRate(30);
        }
        gameContainer.setIcons(new String[]{"res/drawable/icon_window.png", "res/drawable/icon_window128.png", "res/drawable/icon_window24.png", "res/drawable/icon_window16.png"});
        gameContainer.setUpdateOnlyWhenVisible(false);
        gameContainer.getInput().enableKeyRepeat();
        this.f7289m = C1173e.m164b(C0067R.drawable.logo, true);
        this.f7290n = C1173e.m164b(C0067R.drawable.pointer, true);
        gameContainer.setMouseCursor(this.f7290n.mo72C(), 0, 0);
        this.f7322S = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m40a() {
        this.f7281e = AbstractC0916l.m1071A();
        if (this.f7277a.isVSyncRequested() != this.f7281e.f6163bQ.renderVsync) {
            try {
                this.f7277a.setVSync(this.f7281e.f6163bQ.renderVsync);
            } catch (OpenGLException e) {
                AbstractC0916l.m1025a("Error while changing vsync setting", (Throwable) e);
            }
        }
        if (this.f7281e.f6163bQ.highRefreshRate) {
            this.f7277a.setTargetFrameRate(300);
        } else {
            this.f7277a.setTargetFrameRate(120);
        }
        boolean z = false;
        if (this.f7281e.f6163bQ.enableMouseCapture && ((!this.f7281e.f6163bQ.slick2dFullScreen || this.f7281e.f6218cT) && !this.f7281e.f6085aq && !this.f7281e.mo1022a(false) && this.f7281e.f6137bq)) {
            z = true;
        }
        if (z != this.f7298v) {
            AbstractC0916l.m963e("Grabbing mouse:" + z);
            this.f7298v = z;
            if (!this.f7297u) {
                this.f7277a.setMouseGrabbed(this.f7298v);
            }
            if (this.f7298v) {
            }
            if (!this.f7298v) {
                Mouse.setCursorPosition((int) (this.f7299w * this.f7319P), (int) (Display.getHeight() - (this.f7300x * this.f7319P)));
            }
            AbstractC0916l.f6112aR = this.f7298v;
        }
        this.f7277a.setSmoothDeltas(this.f7281e.f6163bQ.renderSmoothDelta);
        if (this.f7291o != Display.isActive()) {
            this.f7291o = Display.isActive();
            if (this.f7291o) {
                m21f();
            }
        }
    }

    /* renamed from: b */
    public void m28b() {
        if (this.f7292p) {
            AbstractC0916l.m957g("loadingStartedThreaded");
            return;
        }
        this.f7292p = true;
        m25c();
    }

    /* renamed from: c */
    public void m25c() {
        if (this.f7293q) {
            AbstractC0916l.m957g("loadingStartedNonThreaded");
            return;
        }
        this.f7293q = true;
        if (this.f7278b == null) {
            this.f7278b = new Main();
        }
        this.f7278b.m396h();
        if (AbstractC0916l.f6103aI) {
            AbstractC0916l.m963e("switching to sandbox");
            ScriptEngine.getInstance().addScriptToQueue("open('sandboxOptions.rml', 'maps/skirmish/[z;p10]Crossing Large (10p).tmx'); loadConfigAndStartNewSandbox('maps/skirmish/[z;p10]Crossing Large (10p).tmx');");
        }
        this.f7294r = true;
    }

    /* renamed from: a */
    public void m35a(C1170d c1170d) {
        AbstractC0916l.m982b("SlickContainer:setup");
        this.f7281e = AbstractC0916l.m1071A();
        this.f7282f = c1170d;
        this.f7282f.f7148d = new C0121m();
        this.f7282f.f7145a = this.f7277a.getWidth();
        this.f7282f.f7146b = this.f7277a.getHeight();
        this.f7281e.mo985b(this.f7282f.f7145a, this.f7282f.f7146b);
        this.f7280d = new C0943n();
    }

    public void update(GameContainer gameContainer, int i) {
        this.f7296t = i;
    }

    /* renamed from: a */
    public int m39a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        AbstractC0916l.m963e("Unknown mouse button:" + i);
        return 0;
    }

    /* renamed from: a */
    public void m37a(int i, int i2, boolean z) {
        int i3;
        int i4;
        if (this.f7301y) {
            AbstractC0916l.m963e("mouseGrab:m:" + z + ",newX:" + i + ",newY:" + i2);
        }
        if (!this.f7298v) {
            this.f7299w = (int) (i / this.f7319P);
            this.f7300x = (int) (i2 / this.f7319P);
            return;
        }
        if (z) {
            if (this.f7297u) {
                i3 = i - this.f7320Q;
                i4 = i2 - this.f7321R;
            } else {
                i3 = i;
                i4 = i2;
            }
            this.f7299w += i3 / this.f7319P;
            this.f7300x += i4 / this.f7319P;
        } else {
            this.f7299w = (int) (i / this.f7319P);
            this.f7300x = (int) (i2 / this.f7319P);
        }
        if (this.f7299w < 0.0f) {
            this.f7299w = 0.0f;
        }
        if (this.f7300x < 0.0f) {
            this.f7300x = 0.0f;
        }
        if (this.f7282f != null) {
            if (this.f7299w > this.f7282f.m236o() - 1) {
                this.f7299w = this.f7282f.m236o() - 1;
            }
            if (this.f7300x > this.f7282f.m235p() - 1) {
                this.f7300x = this.f7282f.m235p() - 1;
                return;
            }
            return;
        }
        AbstractC0916l.m963e("processMouseGrab gameView==null");
    }

    public void mousePressed(int i, int i2, int i3) {
        int m39a;
        m37a(i2, i3, false);
        if (m23d()) {
            this.f7278b.f6985p.mouseMove((int) this.f7299w, (int) this.f7300x, 0);
            this.f7278b.f6985p.processMouseButtonDown(0, 0);
        } else if (this.f7282f != null && (m39a = m39a(i)) != 0) {
            this.f7282f.f7148d.m4774a(this.f7299w, this.f7300x, true, m39a);
        }
    }

    public void mouseDragged(int i, int i2, int i3, int i4) {
        m37a(i3, i4, true);
        if (m23d()) {
            this.f7278b.f6985p.mouseMove((int) this.f7299w, (int) this.f7300x, 0);
        } else if (this.f7282f != null) {
            this.f7282f.f7148d.m4775a(this.f7299w, this.f7300x);
        }
    }

    public void mouseMoved(int i, int i2, int i3, int i4) {
        m37a(i3, i4, true);
        if (m23d()) {
            this.f7278b.f6985p.mouseMove((int) this.f7299w, (int) this.f7300x, 0);
        } else if (this.f7282f != null) {
            this.f7282f.f7148d.m4775a(this.f7299w, this.f7300x);
        }
    }

    public void mouseReleased(int i, int i2, int i3) {
        int m39a;
        m37a(i2, i3, false);
        if (m23d()) {
            this.f7278b.f6985p.processMouseButtonUp(0, 0);
        } else if (this.f7282f != null && (m39a = m39a(i)) != 0) {
            this.f7282f.f7148d.m4774a(this.f7299w, this.f7300x, false, m39a);
        }
    }

    public void mouseWheelMoved(int i) {
        if (m23d()) {
            this.f7278b.f6985p.processMouseWheel((-(i / 120)) * 2, 0);
        } else if (this.f7281e != null) {
            this.f7281e.m949k(i);
        }
    }

    /* renamed from: d */
    boolean m23d() {
        if (this.f7278b != null && this.f7278b.f6985p != null && !this.f7278b.f6985p.m4881b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m27b(int i) {
        if (i >= this.f7302X.length || i < 0) {
            return false;
        }
        return this.f7302X[i];
    }

    /* renamed from: e */
    public int m22e() {
        int i = 0;
        if (m27b(42) || m27b(54)) {
            i = 0 + 2;
        }
        if (m27b(29) || m27b(157)) {
            i++;
        }
        if (m27b(56) || m27b(184)) {
            i += 4;
        }
        return i;
    }

    /* renamed from: a */
    public void m36a(int i, boolean z) {
        if (i >= this.f7302X.length || i < 0) {
            return;
        }
        this.f7302X[i] = z;
    }

    /* renamed from: f */
    public void m21f() {
        for (int i = 0; i < this.f7302X.length; i++) {
            if (this.f7302X[i]) {
                m24c(i);
            }
        }
    }

    public void keyPressed(int i, char c) {
        m36a(i, true);
        if (this.f7278b.f6978i == null) {
            AbstractC0916l.m963e("keyPressed: guiEngine==null");
        } else {
            this.f7278b.f6978i.m4909a(i, c);
        }
    }

    /* renamed from: c */
    public void m24c(int i) {
        keyReleased(i, (char) 0);
    }

    public void keyReleased(int i, char c) {
        m36a(i, false);
        if (m23d()) {
            Integer m720c = SlickToAndroidKeycodes.m720c(i);
            if (m720c != null) {
                this.f7278b.f6985p.processKeyUp(m720c.intValue(), m22e());
            } else if (!Character.isISOControl(c)) {
            }
        }
        if (this.f7281e != null) {
            this.f7281e.m984b(SlickToAndroidKeycodes.m722b(i), false);
        }
    }

    /* renamed from: a */
    public void m38a(int i, int i2) {
        this.f7308E = i;
        this.f7309F = i2;
        m20g();
    }

    /* renamed from: g */
    public void m20g() {
        if (this.f7288l || this.f7285i) {
            return;
        }
        try {
            boolean z = this.f7281e.f6163bQ.slick2dFullScreen;
            boolean z2 = this.f7281e.f6163bQ.slick2dBorderless;
            if (z2) {
                z = true;
            }
            int i = this.f7308E;
            int i2 = this.f7309F;
            if (z) {
                i = this.f7279c.getScreenWidth();
                i2 = this.f7279c.getScreenHeight();
                String str = this.f7281e.f6163bQ.slick2dFullScreenResolution;
                if (str == null) {
                    AbstractC0916l.m963e("fullScreenResolutionString is null");
                    str = "native";
                }
                if (!str.equals("native")) {
                    String[] split = str.split("x");
                    if (split.length != 2) {
                        AbstractC0916l.m982b("Unknown resolution format:" + str);
                    } else {
                        Integer m2024l = C0758f.m2024l(split[0]);
                        Integer m2024l2 = C0758f.m2024l(split[1]);
                        if (m2024l == null || m2024l2 == null) {
                            AbstractC0916l.m982b("Bad resolution int:" + str);
                        } else {
                            i = m2024l.intValue();
                            i2 = m2024l2.intValue();
                        }
                    }
                }
            }
            float f = 1.0f;
            if (i > 3360.0f || i2 > 1890.0f) {
                f = 2.0f;
            } else if (i > 2688.0f || i2 > 1512.0f) {
                f = 1.5f;
            }
            float f2 = f * this.f7281e.f6163bQ.uiRenderScale;
            AbstractC0916l.m963e("uiRenderScale:" + this.f7281e.f6163bQ.uiRenderScale);
            if (this.f7312I == z && this.f7313J == z2 && this.f7308E == this.f7310G && this.f7309F == this.f7311H && C0758f.m2034h(f2, this.f7319P)) {
                return;
            }
            int i3 = i;
            int i4 = i2;
            boolean z3 = this.f7313J != z2;
            this.f7319P = f2;
            this.f7310G = this.f7308E;
            this.f7311H = this.f7309F;
            this.f7312I = z;
            this.f7313J = z2;
            boolean z4 = false;
            if (z2 && z) {
                z4 = true;
            }
            System.setProperty("org.lwjgl.opengl.Window.undecorated", z4 ? "true" : "false");
            if (z) {
                AbstractC0916l.m963e("screen: " + this.f7279c.getScreenWidth() + ", " + this.f7279c.getScreenHeight());
                AbstractC0916l.m963e("container: " + this.f7277a.getWidth() + ", " + this.f7277a.getHeight());
                if (z2) {
                    this.f7279c.setDisplayMode(i3, i4, false);
                } else {
                    this.f7279c.setDisplayMode(i3, i4, true);
                }
            } else {
                boolean z5 = false;
                if (this.f7279c.isFullscreen()) {
                    z5 = true;
                }
                if (z3) {
                    z5 = true;
                    if (i3 > 2 && i4 > 2) {
                        this.f7279c.setDisplayMode(i3 - 1, i4 - 1, false);
                    }
                }
                if (z5) {
                    this.f7279c.setDisplayMode(i3, i4, false);
                    Display.setResizable(false);
                    Display.setResizable(true);
                } else {
                    SGL sgl = Renderer.get();
                    sgl.initDisplay(i3, i4);
                    sgl.enterOrtho(i3, i4);
                    Field declaredField = GameContainer.class.getDeclaredField("width");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f7279c, Integer.valueOf(i3));
                    Field declaredField2 = GameContainer.class.getDeclaredField("height");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.f7279c, Integer.valueOf(i4));
                }
            }
            this.f7320Q = Display.getWidth() / 2;
            this.f7321R = Display.getHeight() / 2;
            int i5 = (int) (i3 / this.f7319P);
            int i6 = (int) (i4 / this.f7319P);
            if (this.f7282f != null) {
                this.f7282f.f7145a = i5;
                this.f7282f.f7146b = i6;
            } else {
                AbstractC0916l.m963e("setResolution: gameView=null");
            }
            if (this.f7281e != null) {
                this.f7281e.mo985b(i5, i6);
                this.f7281e.m1049W();
            } else {
                AbstractC0916l.m963e("setResolution: game=null");
            }
            if (this.f7278b != null && this.f7278b.f6985p != null) {
                this.f7278b.f6985p.setDimensionsWrap(i5, i6);
            } else {
                AbstractC0916l.m963e("setResolution: main.libRocket=null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m33a(String str, boolean z) {
        boolean z2 = true;
        if (!str.startsWith("Loading units ")) {
            AbstractC0916l.m963e("--Now loading:" + str);
            z2 = false;
        }
        if (z) {
            this.f7317N = this.f7316M;
            this.f7316M = str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z2 && currentTimeMillis < this.f7318O + 10) {
            return;
        }
        this.f7318O = currentTimeMillis;
        Graphics m302a = this.f7279c.m302a();
        m32a((GameContainer) this.f7279c, m302a);
        this.f7279c.m301a(m302a);
    }

    /* renamed from: a */
    public void m32a(GameContainer gameContainer, Graphics graphics) {
        this.f7314K += this.f7296t;
        this.f7315L++;
        graphics.setColor(Color.black);
        graphics.clear();
        if (this.f7289m != null) {
            graphics.drawImage(this.f7289m.mo72C(), (Display.getWidth() / 2) - (this.f7289m.f6404p / 2), (Display.getHeight() / 2) - (this.f7289m.f6405q / 2));
        }
        String str = "Loading";
        for (int i = 0; i <= this.f7315L % 4; i++) {
            str = str + ".";
        }
        String m2049e = C0758f.m2049e("    " + str, 17);
        int width = graphics.getFont().getWidth(m2049e);
        int height = Display.getHeight() - 70;
        graphics.setColor(Color.white);
        graphics.drawString(m2049e, (Display.getWidth() / 2) - (width / 2), height);
        graphics.setColor(new Color(1.0f, 1.0f, 1.0f, 0.6f));
        graphics.drawString(this.f7316M, (Display.getWidth() / 2) - (graphics.getFont().getWidth(this.f7316M) / 2), height + 20);
    }

    /* renamed from: a */
    public void m34a(C1173e c1173e) {
        c1173e.mo135k();
        c1173e.mo228a(this.f7319P, this.f7319P);
    }

    /* renamed from: b */
    public void m26b(C1173e c1173e) {
        c1173e.mo134l();
    }

    /* renamed from: a */
    public void m30a(Graphics graphics, float f) {
        graphics.pushTransform();
        graphics.scale(f, f);
    }

    /* renamed from: a */
    public void m31a(Graphics graphics) {
        graphics.popTransform();
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        long currentTimeMillis = System.currentTimeMillis();
        float f = ((float) (currentTimeMillis - this.f7322S)) * 0.060000002f;
        int i = (int) (currentTimeMillis - this.f7322S);
        this.f7322S = currentTimeMillis;
        if (this.f7298v && this.f7297u && gameContainer.hasFocus()) {
            Mouse.setCursorPosition(this.f7320Q, this.f7321R);
        }
        if (!this.f7294r) {
            m32a(gameContainer, graphics);
            if (!this.f7295s) {
                this.f7295s = true;
            } else if (!this.f7292p) {
                m28b();
            }
        } else if (this.f7281e == null) {
            AbstractC0916l.m982b("render: game==null");
        } else {
            m40a();
            float f2 = this.f7296t * 0.060000002f;
            int width = Display.getWidth();
            int height = Display.getHeight();
            if (width != this.f7310G || height != this.f7311H) {
                if (this.f7306C != width || this.f7307D != height) {
                    this.f7306C = width;
                    this.f7307D = height;
                    this.f7305B = 0.0f;
                }
                this.f7305B += f2;
                this.f7304A += f2;
                if (this.f7304A > 300.0f || this.f7305B > 20.0f || this.f7304A > 0.0f) {
                    this.f7304A = 0.0f;
                    this.f7305B = 0.0f;
                    m38a(width, height);
                }
            }
            float f3 = this.f7319P;
            this.f7278b.m414a(f2);
            if (this.f7281e.f6163bQ.liveReloading) {
                this.f7303z++;
                if (this.f7303z > 30) {
                    this.f7303z = 0;
                    if (C1189s.f7256y != null) {
                        Iterator it = C1189s.f7256y.iterator();
                        while (it.hasNext()) {
                            ((C1189s) it.next()).mo44t();
                        }
                    }
                    if (!this.f7281e.m956h(48)) {
                        this.f7278b.f6985p.detectChangesAndReload();
                    }
                }
            }
            boolean z = false;
            C1173e c1173e = null;
            if (!this.f7281e.f6153bG) {
                graphics.setColor(Color.gray);
                graphics.resetTransform();
                graphics.clearClip();
                graphics.clear();
                if (!m23d() && !this.f7281e.f6155bI) {
                    this.f7325V++;
                    if (this.f7325V > 100) {
                        this.f7325V = 0;
                        AbstractC0916l.m963e("Fail safe menu");
                        AbstractC0043a.m4910a().m4904b();
                    }
                }
            } else {
                this.f7325V = 0;
            }
            boolean m2665a = this.f7281e.f6166bT.f4138ae.m2665a();
            boolean z2 = this.f7281e.f6132bl && this.f7281e.f6166bT.f4139af.m2665a();
            if (z2) {
                m2665a = true;
            }
            if (this.f7281e.f6153bG) {
                graphics.resetTransform();
                if (!this.f7281e.f6245du) {
                    graphics.clearClip();
                    graphics.clear();
                }
                graphics.setColor(Color.black);
                if (!AbstractC0916l.f6096aB) {
                    c1173e = (C1173e) this.f7281e.f6161bO;
                    if (c1173e != null) {
                        c1173e.f7163f = graphics;
                        c1173e.f7196L = this.f7319P;
                        z = true;
                        m34a(c1173e);
                    }
                }
                boolean z3 = this.f7281e.f6216cR;
                if (m2665a) {
                    this.f7281e.f6216cR = true;
                }
                this.f7281e.mo1042a(f2, this.f7296t);
                if (m2665a) {
                    this.f7281e.f6216cR = z3;
                }
                this.f7296t = 0;
                if (!AbstractC0916l.f6096aB && z) {
                    m26b(c1173e);
                }
            } else {
                this.f7281e.f6160bN.m2644a(f2);
            }
            m30a(graphics, f3);
            C1058a.m734a().mo294a(0.0f);
            this.f7278b.f6985p.f358c.update(f2);
            if (!this.f7278b.f6985p.m4881b()) {
                this.f7278b.f6985p.m233a(graphics);
                this.f7278b.f6985p.update();
                this.f7278b.f6985p.render();
                this.f7278b.f6985p.f358c.checkForErrors();
                this.f7278b.f6985p.debug = false;
            }
            this.f7278b.f6985p.postUpdate();
            m31a(graphics);
            if (this.f7285i) {
                graphics.clear();
            }
            if (this.f7298v && !m2665a && !this.f7281e.f6218cT) {
                graphics.drawImage(this.f7290n.mo72C(), this.f7299w * this.f7319P, this.f7300x * this.f7319P);
            }
            if (m2665a) {
                m29a(graphics, z2);
            }
            if (this.f7278b.f6990u) {
                this.f7278b.f6991v++;
                if (this.f7278b.f6991v > 2) {
                    this.f7278b.f6990u = false;
                    this.f7278b.f6991v = 0;
                    AbstractC0916l.m963e("Saving settings (queued)");
                    this.f7281e.f6163bQ.save();
                }
            }
        }
    }

    /* renamed from: a */
    public void m29a(Graphics graphics, boolean z) {
        C1170d c1170d = this.f7282f;
        int i = 10;
        int i2 = 10;
        if (c1170d != null) {
            i = c1170d.f7145a;
            i2 = c1170d.f7146b;
        }
        try {
            try {
                AbstractC0916l.m963e("Saving screenshot");
                File file = new File("screenshots");
                if (!file.exists()) {
                    file.mkdir();
                }
                final String str = "screenshot_" + C0758f.m2117a("d MMM yyyy HH.mm.ss") + ".png";
                final String str2 = "screenshots" + File.separator + str;
                if (!z) {
                    Image image = new Image(this.f7279c.getWidth(), this.f7279c.getHeight());
                    graphics.copyArea(image, 0, 0);
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ImageOut.write(image, "png", byteArrayOutputStream);
                    AbstractC0916l.m959f(null, "Saving screenshot: " + str);
                    new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.u.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                                fileOutputStream.close();
                                AbstractC0916l.m963e("Screenshot saved: " + str);
                            } catch (Exception e) {
                                e.printStackTrace();
                                AbstractC0916l.m943n("Failed to write screenshot:" + e.getMessage());
                            }
                        }
                    }).start();
                    if (c1170d != null) {
                        c1170d.f7145a = i;
                        c1170d.f7146b = i2;
                        return;
                    }
                    return;
                }
                if (this.f7326W == null) {
                    this.f7326W = new C0193j();
                }
                int i3 = (int) (c1170d.f7145a * 2.0f);
                int i4 = (int) (c1170d.f7146b * 2.0f);
                InterfaceC1027y interfaceC1027y = this.f7281e.f6161bO;
                this.f7326W.m4351a(interfaceC1027y, i3, i4, 0);
                C0191i c0191i = (C0191i) this.f7281e;
                boolean z2 = this.f7281e.f6216cR;
                c0191i.m4375a(this.f7326W);
                this.f7281e.f6216cR = true;
                try {
                    this.f7281e.f6161bO.mo166b(android.graphics.Color.m5107a(0, 0, 0));
                    c1170d.mo249b(true);
                    c0191i.mo985b(i3, i4);
                    c0191i.m4358j();
                    c0191i.mo1042a(0.0f, 0);
                    c0191i.mo985b(i, i2);
                    c0191i.m4358j();
                    c0191i.m4369b(this.f7326W);
                    this.f7281e.f6216cR = z2;
                    interfaceC1027y.mo190a(this.f7326W.f1279a, new File(str2));
                    AbstractC0916l.m959f(null, "Saving large screenshot: " + str);
                    if (c1170d != null) {
                        c1170d.f7145a = i;
                        c1170d.f7146b = i2;
                    }
                } catch (Throwable th) {
                    c0191i.m4369b(this.f7326W);
                    this.f7281e.f6216cR = z2;
                    throw th;
                }
            } catch (Throwable th2) {
                if (c1170d != null) {
                    c1170d.f7145a = i;
                    c1170d.f7146b = i2;
                }
                throw th2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            AbstractC0916l.m943n("Failed to take screenshot:" + e.getMessage());
            if (c1170d != null) {
                c1170d.f7145a = i;
                c1170d.f7146b = i2;
            }
        }
    }
}
