package com.corrodinggames.rts.java;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.p044l.AbstractC0942m;
import com.corrodinggames.rts.gameFramework.p044l.C0923a;
import com.corrodinggames.rts.gameFramework.p044l.C0924aa;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0929af;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.C0935f;
import com.corrodinggames.rts.gameFramework.p044l.C0936g;
import com.corrodinggames.rts.gameFramework.p044l.C1024v;
import com.corrodinggames.rts.gameFramework.p044l.EnumC1025w;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.java.p049a.C1129a;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.GlyphPage;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.imageout.ImageOut;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.ImageIOImageData;
import org.newdawn.slick.opengl.PNGImageData;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.LineStripRenderer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.util.FastTrig;
import org.newdawn.slick.util.ResourceLoader;

/* renamed from: com.corrodinggames.rts.java.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/e.class */
public final class C1173e implements InterfaceC1027y {

    /* renamed from: b */
    public boolean f7159b;

    /* renamed from: f */
    public Graphics f7163f;

    /* renamed from: g */
    public C0934e f7164g;

    /* renamed from: h */
    public int f7165h;

    /* renamed from: i */
    public int f7166i;

    /* renamed from: j */
    public C0935f f7167j;

    /* renamed from: r */
    public static C1128a f7176r;

    /* renamed from: s */
    public static C1128a f7177s;

    /* renamed from: t */
    public static C1128a f7178t;

    /* renamed from: y */
    boolean f7183y;

    /* renamed from: J */
    static RectF f7194J;

    /* renamed from: K */
    static RectF f7195K;

    /* renamed from: M */
    static RectF f7197M;

    /* renamed from: Q */
    float f7201Q;

    /* renamed from: R */
    float f7202R;

    /* renamed from: S */
    float f7203S;

    /* renamed from: X */
    private static LineStripRenderer f7204X;

    /* renamed from: c */
    public static final Color f7160c = new Color(0, 0, 0, 255);

    /* renamed from: d */
    public static final Color f7161d = new Color(0, 0, 0, 255);

    /* renamed from: e */
    public static final Color f7162e = new Color(0, 0, 0, 255);

    /* renamed from: k */
    public static Graphics f7168k = null;

    /* renamed from: l */
    static C1173e f7169l = null;

    /* renamed from: m */
    public static C0928ae f7170m = null;

    /* renamed from: W */
    private static SGL f7171W = Renderer.get();

    /* renamed from: A */
    public static final Color f7185A = new Color(0, 0, 0, 255);

    /* renamed from: B */
    static float f7186B = -1.0f;

    /* renamed from: E */
    static ArrayList f7189E = new ArrayList();

    /* renamed from: I */
    static Paint f7193I = new C0930ag();

    /* renamed from: H */
    static Paint f7192H = new Paint();

    /* renamed from: a */
    public boolean f7158a = true;

    /* renamed from: n */
    final Rect f7172n = new Rect();

    /* renamed from: o */
    final Rect f7173o = new Rect();

    /* renamed from: p */
    final RectF f7174p = new RectF();

    /* renamed from: q */
    final PointF f7175q = new PointF();

    /* renamed from: u */
    ArrayList f7179u = new ArrayList();

    /* renamed from: v */
    int f7180v = -1;

    /* renamed from: w */
    Paint f7181w = null;

    /* renamed from: x */
    C1189s f7182x = null;

    /* renamed from: z */
    final Paint f7184z = new Paint();

    /* renamed from: C */
    C1174f f7187C = new C1174f(this);

    /* renamed from: D */
    byte[] f7188D = new byte[4];

    /* renamed from: F */
    int f7190F = 0;

    /* renamed from: G */
    RectF f7191G = new RectF();

    /* renamed from: L */
    public float f7196L = 1.0f;

    /* renamed from: N */
    FloatBuffer f7198N = BufferUtils.createFloatBuffer(3);

    /* renamed from: O */
    float[] f7199O = new float[0];

    /* renamed from: P */
    int f7200P = -1;

    /* renamed from: T */
    C1175g f7205T = new C1175g();

    /* renamed from: U */
    C1101m f7206U = new C1101m();

    /* renamed from: V */
    C1101m f7207V = new C1101m();

    static {
        f7192H.m5091a(255, 255, 0, 0);
        f7192H.m5084a(Paint.Style.STROKE);
        f7194J = new RectF();
        f7195K = new RectF();
        f7204X = Renderer.getLineStripRenderer();
    }

    /* renamed from: c */
    public static void m153c() {
        f7171W = Renderer.get();
    }

    /* renamed from: t */
    public Color m126t() {
        return f7160c;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: c */
    public C1173e mo201a(C0934e c0934e) {
        C1173e mo160b = mo160b(c0934e);
        mo160b.f7167j = this.f7167j;
        return mo160b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: d */
    public C1173e mo160b(C0934e c0934e) {
        C1173e c1173e = new C1173e();
        try {
            c1173e.f7163f = m142e(c0934e).mo72C().getGraphics();
            c1173e.f7164g = c0934e;
            if (c0934e != null) {
                c1173e.f7165h = c0934e.mo386m();
                c1173e.f7166i = c0934e.mo387l();
            }
            return c1173e;
        } catch (SlickException e) {
            throw new RuntimeException((Throwable) e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: m */
    public int mo133m() {
        if (this.f7164g != null) {
            return this.f7165h;
        }
        return (int) AbstractC0916l.m1071A().f6183ck;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: n */
    public int mo132n() {
        if (this.f7164g != null) {
            return this.f7166i;
        }
        return (int) AbstractC0916l.m1071A().f6184cl;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo220a(int i, int i2) {
        this.f7165h = i;
        this.f7166i = i2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public boolean mo230a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo214a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo169b() {
        f7176r = new C1128a((C1189s) mo221a(C0067R.drawable.error_outmem));
        f7176r.m881a("Out of memory");
        f7177s = new C1128a((C1189s) mo221a(C0067R.drawable.error_general));
        f7177s.m881a("General Error");
        f7178t = new C1128a((C1189s) mo221a(C0067R.drawable.error_toolargethumb));
        f7177s.m881a("Too Large Thumbnail Error");
        if (!AbstractC0916l.f6097aC) {
            this.f7167j = new C0935f(1024, 1024);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: d */
    public InterfaceC0941l mo147d() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo189a(InterfaceC0941l interfaceC0941l) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo204a(C0923a c0923a) {
    }

    /* renamed from: a */
    public static boolean m182a(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) > 255) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    Font m187a(C1174f c1174f, String str, boolean z) {
        C1174f m186a = m186a(c1174f, z);
        if (m186a.m118a(str)) {
            return m186a.f7211d;
        }
        UnicodeFont unicodeFont = m186a.f7211d;
        int i = 0;
        for (GlyphPage glyphPage : unicodeFont.getGlyphPages()) {
            i += glyphPage.getGlyphs().size();
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            str.charAt(i2);
            if (0 == 0) {
            }
        }
        unicodeFont.getGlyphPages().size();
        unicodeFont.addGlyphs(str);
        try {
            unicodeFont.loadGlyphs();
            int i3 = 0;
            for (GlyphPage glyphPage2 : unicodeFont.getGlyphPages()) {
                i3 += glyphPage2.getGlyphs().size();
            }
            unicodeFont.getGlyphPages().size();
            if (i != i3) {
                AbstractC0916l.m963e("new glypth, " + i3 + " " + m186a.toString() + " for text:" + str);
            }
            m186a.m117b(str);
            return m186a.f7211d;
        } catch (SlickException e) {
            throw new RuntimeException((Throwable) e);
        }
    }

    /* renamed from: a */
    C1174f m186a(C1174f c1174f, boolean z) {
        Iterator it = this.f7179u.iterator();
        while (it.hasNext()) {
            C1174f c1174f2 = (C1174f) it.next();
            if (c1174f2.f7208a == c1174f.f7208a && c1174f2.f7209b == c1174f.f7209b && c1174f2.f7210c == c1174f.f7210c) {
                return c1174f2;
            }
        }
        C1174f clone = c1174f.clone();
        AbstractC0916l.m963e("New font:" + clone.f7208a + " bold:" + clone.f7209b);
        if (z) {
        }
        String str = "font/Roboto-Regular.ttf";
        if (clone.f7209b) {
            str = "font/Roboto-Bold.ttf";
        }
        if (clone.f7210c) {
            str = "font/DroidSansFallback.ttf";
        }
        try {
            UnicodeFont unicodeFont = new UnicodeFont(java.awt.Font.createFont(0, ResourceLoader.getResourceAsStream(str)).deriveFont(clone.f7208a));
            unicodeFont.addAsciiGlyphs();
            unicodeFont.getEffects().add(new ColorEffect(new java.awt.Color(255, 255, 255)));
            try {
                unicodeFont.loadGlyphs();
            } catch (SlickException e) {
                throw new RuntimeException((Throwable) e);
            } catch (OutOfMemoryError e2) {
                AbstractC0916l.m1032a(EnumC1065u.gameImage, e2);
            }
            AbstractC0916l.m963e("loadGlyphs");
            clone.f7211d = unicodeFont;
            this.f7179u.add(clone);
            return clone;
        } catch (FontFormatException e3) {
            throw new RuntimeException((Throwable) e3);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public void m211a(Paint paint, String str) {
        m209a(paint, true, str, (C1189s) null, (C0934e) null);
    }

    /* renamed from: b */
    public void m163b(Paint paint) {
        m209a(paint, false, (String) null, (C1189s) null, (C0934e) null);
    }

    /* renamed from: a */
    public void m212a(Paint paint, C1189s c1189s, C0934e c0934e) {
        m209a(paint, false, (String) null, c1189s, c0934e);
    }

    /* renamed from: u */
    public void m125u() {
        m121y();
        Graphics.setCurrent(this.f7163f);
        m155b(true);
        this.f7159b = true;
        f7186B = -1.0f;
        Color.setRebindRequired();
        this.f7181w = this.f7184z;
        f7169l = this;
    }

    /* renamed from: a */
    public void m209a(Paint paint, boolean z, String str, C1189s c1189s, C0934e c0934e) {
        boolean m5065c;
        boolean z2 = false;
        if (f7168k != this.f7163f) {
            m125u();
            z2 = true;
            f7168k = this.f7163f;
        }
        if ((paint == null || (paint instanceof C0930ag)) && this.f7181w == paint && this.f7182x == c1189s && !z) {
            C0928ae c0928ae = null;
            if (this.f7158a) {
                if (paint != null && (paint instanceof C0930ag)) {
                    c0928ae = ((C0930ag) paint).m887q();
                }
                if (c0934e != null && c0928ae == null) {
                    c0928ae = c0934e.mo885B();
                }
            }
            if (f7170m == c0928ae) {
                if (f7170m != null && f7170m.mo864a(paint, c0934e)) {
                    this.f7163f.flushBuffer();
                    m161b(f7170m);
                    return;
                }
                return;
            }
        }
        this.f7181w = paint;
        this.f7182x = c1189s;
        boolean z3 = c1189s == null && !z;
        if (this.f7180v != Graphics.MODE_NORMAL) {
            this.f7180v = Graphics.MODE_NORMAL;
            this.f7163f.setDrawMode(this.f7180v);
        }
        if (z2 && this.f7164g != null) {
            f7171W.glEnable(3042);
            f7171W.glColorMask(true, true, true, true);
            GL14.glBlendFuncSeparate(770, 771, 770, 1);
        }
        if (paint == null) {
            m5065c = false;
            m177a(Color.white);
            if (z3) {
                m229a(1.0f);
            }
            if (z) {
                this.f7163f.resetFont();
            }
        } else {
            m5065c = paint.m5065c();
        }
        if (this.f7158a) {
            C0928ae c0928ae2 = null;
            if (paint != null && (paint instanceof C0930ag)) {
                c0928ae2 = ((C0930ag) paint).m887q();
            }
            if (c0934e != null && c0928ae2 == null) {
                c0928ae2 = c0934e.mo885B();
            }
            if (f7170m != c0928ae2) {
                this.f7163f.flushBuffer();
                if (c0928ae2 == null) {
                    m124v();
                } else {
                    c0928ae2.m901f();
                    if (!m150c(c0928ae2)) {
                        if (f7170m != null) {
                            m124v();
                        }
                    } else {
                        c0928ae2.mo864a(paint, c0934e);
                        m161b(c0928ae2);
                    }
                }
                f7170m = c0928ae2;
            } else if (f7170m != null && f7170m.mo864a(paint, c0934e)) {
                this.f7163f.flushBuffer();
                m161b(f7170m);
            }
        }
        if (c1189s != null) {
            if ((c1189s.f7263E == 1) != m5065c) {
                this.f7163f.flushBuffer();
                int i = m5065c ? 1 : 2;
                c1189s.mo72C().setFilter(i);
                c1189s.f7263E = i;
            }
        }
        if (paint != null) {
            boolean z4 = true;
            ColorFilter m5052h = paint.m5052h();
            if (m5052h != null) {
                if (m5052h instanceof LightingColorFilter) {
                    LightingColorFilter lightingColorFilter = (LightingColorFilter) m5052h;
                    if (lightingColorFilter.f157a != 0 && lightingColorFilter.f157a != -1) {
                        int i2 = lightingColorFilter.f157a;
                        f7161d.r = android.graphics.Color.m5104b(i2) * 0.003921569f;
                        f7161d.g = android.graphics.Color.m5103c(i2) * 0.003921569f;
                        f7161d.b = android.graphics.Color.m5102d(i2) * 0.003921569f;
                        f7161d.a = android.graphics.Color.m5108a(i2) * 0.003921569f;
                        m216a(paint.m5057e(), f7162e);
                        f7161d.r *= f7162e.r;
                        f7161d.g *= f7162e.g;
                        f7161d.b *= f7162e.b;
                        f7161d.a *= f7162e.a;
                        m177a(f7161d);
                        this.f7180v = Graphics.MODE_ADD;
                        this.f7163f.setDrawMode(this.f7180v);
                        f7171W.glEnable(3042);
                        f7171W.glColorMask(true, true, true, true);
                        f7171W.glBlendFunc(770, 1);
                        z4 = false;
                    }
                } else if (m5052h instanceof C1024v) {
                    C1024v c1024v = (C1024v) m5052h;
                    if (c1024v.f6559a == EnumC1025w.copy) {
                        m140f(paint.m5057e());
                        this.f7180v = 99;
                        f7171W.glEnable(3042);
                        f7171W.glColorMask(true, true, true, true);
                        f7171W.glBlendFunc(1, 1);
                        z4 = false;
                    } else if (c1024v.f6559a == EnumC1025w.additive) {
                        m140f(paint.m5057e());
                        this.f7180v = 99;
                        f7171W.glEnable(3042);
                        f7171W.glColorMask(true, true, true, true);
                        f7171W.glBlendFunc(774, 771);
                        z4 = false;
                    }
                }
            }
            if (z4) {
                m140f(paint.m5057e());
            }
            if (z3) {
                if (paint.m5053g() != 0.0f) {
                    m229a(paint.m5053g());
                } else {
                    m229a(1.0f);
                }
            }
            if (z) {
                this.f7163f.setFont(m210a(paint, str, true));
            }
        }
    }

    /* renamed from: v */
    public void m124v() {
        GL20.glUseProgram(0);
    }

    /* renamed from: b */
    public void m161b(C0928ae c0928ae) {
        C0929af[] c0929afArr;
        for (C0929af c0929af : c0928ae.f6361p) {
            if (c0929af.f6367c) {
                c0929af.f6367c = false;
                if (c0929af.f6366b == -1) {
                    c0929af.f6366b = GL20.glGetUniformLocation(c0928ae.f6359n, c0929af.f6365a);
                    if (c0929af.f6366b == -1 && !c0929af.f6368d) {
                        c0929af.f6368d = true;
                        c0928ae.m906b("Unknown parameter: " + c0929af.f6365a);
                        int glGetProgrami = GL20.glGetProgrami(c0928ae.f6359n, 35718);
                        int glGetProgrami2 = GL20.glGetProgrami(c0928ae.f6359n, 35719);
                        for (int i = 0; i < glGetProgrami; i++) {
                            c0928ae.m906b("Possible parameter: " + GL20.glGetActiveUniform(c0928ae.f6359n, i, glGetProgrami2));
                        }
                        return;
                    }
                }
                if (c0929af.f6370f != null) {
                    Texture texture = m142e(c0929af.f6370f).mo72C().getTexture();
                    if (c0929af.f6371g) {
                        GL20.glUniform2f(c0929af.f6366b, texture.getTextureWidth(), texture.getTextureHeight());
                    } else {
                        int textureID = texture.getTextureID();
                        c0928ae.m906b("Updating texture to:" + textureID);
                        GL20.glUniform1i(c0929af.f6366b, 1);
                        GL13.glActiveTexture(33985);
                        GL11.glBindTexture(3553, textureID);
                        GL13.glActiveTexture(33984);
                    }
                } else if (c0929af.f6369e.length == 1) {
                    GL20.glUniform1f(c0929af.f6366b, c0929af.f6369e[0]);
                } else if (c0929af.f6369e.length == 2) {
                    GL20.glUniform2f(c0929af.f6366b, c0929af.f6369e[0], c0929af.f6369e[1]);
                } else if (c0929af.f6369e.length == 4) {
                    GL20.glUniform4f(c0929af.f6366b, c0929af.f6369e[0], c0929af.f6369e[1], c0929af.f6369e[2], c0929af.f6369e[3]);
                } else {
                    c0928ae.m906b("Unhandled parameter size: " + c0929af.f6365a + " - " + c0929af.f6369e.length);
                }
            }
        }
    }

    /* renamed from: c */
    public boolean m150c(C0928ae c0928ae) {
        if (c0928ae.f6360o != 0) {
            return false;
        }
        if (c0928ae.f6359n != 0 && !c0928ae.f6358m) {
            GL20.glUseProgram(c0928ae.f6359n);
            return true;
        }
        c0928ae.f6358m = false;
        c0928ae.m906b("Compiling shader");
        c0928ae.f6352g = m202a(c0928ae, 35633, c0928ae.f6350e);
        c0928ae.f6353h = m202a(c0928ae, 35632, c0928ae.f6351f);
        if (c0928ae.f6360o != 0) {
            return false;
        }
        c0928ae.f6359n = GL20.glCreateProgram();
        if (c0928ae.f6359n == 0) {
            c0928ae.m904c("could not create program; check ShaderProgram.isSupported()");
            return false;
        }
        GL20.glAttachShader(c0928ae.f6359n, c0928ae.f6352g);
        GL20.glAttachShader(c0928ae.f6359n, c0928ae.f6353h);
        GL20.glLinkProgram(c0928ae.f6359n);
        int glGetProgrami = GL20.glGetProgrami(c0928ae.f6359n, 35714);
        String glGetProgramInfoLog = GL20.glGetProgramInfoLog(c0928ae.f6359n, GL20.glGetProgrami(c0928ae.f6359n, 35716));
        if (glGetProgramInfoLog != null && glGetProgramInfoLog.length() != 0) {
            c0928ae.f6349d = glGetProgramInfoLog + "\n" + c0928ae.f6349d;
        }
        if (c0928ae.f6349d != null) {
            c0928ae.f6349d = c0928ae.f6349d.trim();
        }
        if (glGetProgrami == 0) {
            c0928ae.m904c(c0928ae.f6349d.length() != 0 ? c0928ae.f6349d : "Could not link program");
            return false;
        }
        GL20.glUseProgram(c0928ae.f6359n);
        return true;
    }

    /* renamed from: a */
    protected int m202a(C0928ae c0928ae, int i, String str) {
        int glCreateShader = GL20.glCreateShader(i);
        if (glCreateShader == 0) {
            c0928ae.m904c("could not create shader object; check ShaderProgram.isSupported()");
        }
        GL20.glShaderSource(glCreateShader, str);
        GL20.glCompileShader(glCreateShader);
        int glGetShaderi = GL20.glGetShaderi(glCreateShader, 35713);
        int glGetShaderi2 = GL20.glGetShaderi(glCreateShader, 35716);
        String m143e = m143e(i);
        String glGetShaderInfoLog = GL20.glGetShaderInfoLog(glCreateShader, glGetShaderi2);
        if (glGetShaderInfoLog != null && glGetShaderInfoLog.length() != 0) {
            c0928ae.f6349d += m143e + " compile log:\n" + glGetShaderInfoLog + "\n";
        }
        if (glGetShaderi == 0) {
            c0928ae.m904c(c0928ae.f6349d.length() != 0 ? c0928ae.f6349d : "Could not compile " + m143e(i));
        }
        return glCreateShader;
    }

    /* renamed from: e */
    private String m143e(int i) {
        if (i == 35632) {
            return "FRAGMENT_SHADER";
        }
        if (i == 35633) {
            return "VERTEX_SHADER";
        }
        return "shader";
    }

    /* renamed from: f */
    private void m140f(int i) {
        m216a(i, f7185A);
        m177a(f7185A);
    }

    /* renamed from: a */
    private void m177a(Color color) {
        Color color2 = f7160c;
        if (this.f7159b) {
            this.f7159b = false;
        } else if (color2.r == color.r && color2.g == color.g && color2.b == color.b && color2.a == color.a) {
            return;
        }
        color2.a = color.a;
        color2.r = color.r;
        color2.g = color.g;
        color2.b = color.b;
        this.f7163f.setColor(color2);
    }

    /* renamed from: a */
    public void m229a(float f) {
        if (f7186B != f) {
            f7186B = f;
            this.f7163f.setLineWidth(f);
        }
    }

    /* renamed from: a */
    public Font m210a(Paint paint, String str, boolean z) {
        C1174f c1174f = this.f7187C;
        c1174f.f7208a = (int) paint.m5049k();
        if (m122x()) {
            c1174f.f7208a = (int) (c1174f.f7208a * this.f7196L);
        }
        Typeface m5051i = paint.m5051i();
        c1174f.f7209b = false;
        if (m5051i != null) {
            c1174f.f7209b = m5051i.m5003a();
        }
        c1174f.f7210c = false;
        if (m182a(str)) {
            c1174f.f7210c = true;
        }
        return m187a(c1174f, str, z);
    }

    /* renamed from: a */
    public static void m173a(ImageData imageData, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int texWidth = (i + (i2 * imageData.getTexWidth())) * i7;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            byteBuffer.put(texWidth, (byte) i5);
            byteBuffer.put(texWidth + 1, (byte) i4);
            byteBuffer.put(texWidth + 2, (byte) i3);
            byteBuffer.put(texWidth + 3, (byte) i6);
            return;
        }
        byteBuffer.put(texWidth, (byte) i3);
        byteBuffer.put(texWidth + 1, (byte) i4);
        byteBuffer.put(texWidth + 2, (byte) i5);
        byteBuffer.put(texWidth + 3, (byte) i6);
    }

    /* renamed from: a */
    public static int m174a(ImageData imageData, ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int texWidth = (i + (i2 * imageData.getTexWidth())) * i3;
        if (i3 == 4) {
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            i6 = byteBuffer.get(texWidth) & 255;
            i5 = byteBuffer.get(texWidth + 1) & 255;
            i4 = byteBuffer.get(texWidth + 2) & 255;
        } else {
            i4 = byteBuffer.get(texWidth) & 255;
            i5 = byteBuffer.get(texWidth + 1) & 255;
            i6 = byteBuffer.get(texWidth + 2) & 255;
        }
        if (i3 < 4) {
            i7 = 255;
        } else {
            i7 = byteBuffer.get(texWidth + 3) & 255;
        }
        return m219a(i7, i4, i5, i6);
    }

    /* renamed from: a */
    public static final int m219a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static Color m216a(int i, Color color) {
        color.r = ((i >> 16) & 255) * 0.003921569f;
        color.g = ((i >> 8) & 255) * 0.003921569f;
        color.b = (i & 255) * 0.003921569f;
        color.a = (i >>> 24) * 0.003921569f;
        return color;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo221a(int i) {
        return mo215a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: e */
    public void mo144e() {
        m123w();
    }

    /* renamed from: w */
    public static void m123w() {
        if (f7189E.size() == 0) {
            return;
        }
        Iterator it = f7189E.iterator();
        while (it.hasNext()) {
            ((C1189s) it.next()).m66I();
        }
        f7189E.clear();
    }

    /* renamed from: a */
    public static void m185a(C1189s c1189s) {
        f7189E.add(c1189s);
        if (f7189E.size() > 15) {
            m123w();
        }
    }

    /* renamed from: b */
    public static C1189s m164b(int i, boolean z) {
        String m2044f = C0758f.m2044f(i);
        try {
            FileInputStream fileInputStream = new FileInputStream(m2044f);
            ImageData m184a = m184a(fileInputStream);
            fileInputStream.close();
            return m175a(m184a, m2044f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (OutOfMemoryError e2) {
            AbstractC0916l.m1032a(EnumC1065u.gameImage, e2);
            if (f7176r == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e2);
            }
            return f7176r;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo215a(int i, boolean z) {
        return m164b(i, z);
    }

    /* renamed from: a */
    public static ImageData m184a(InputStream inputStream) {
        PNGImageData c1129a;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                bufferedInputStream.mark(Integer.MAX_VALUE);
                PNGImageData pNGImageData = new PNGImageData();
                pNGImageData.loadImage(bufferedInputStream);
                c1129a = pNGImageData;
            } catch (IOException e) {
                bufferedInputStream.reset();
                AbstractC0916l.m963e("PNG load failed: " + e.getMessage());
                AbstractC0916l.m963e("Attempting load with ImageIO..");
                ImageIOImageData imageIOImageData = new ImageIOImageData();
                c1129a = new C1129a(imageIOImageData, imageIOImageData.loadImage(bufferedInputStream, false, (int[]) null));
            }
            return c1129a;
        } finally {
            bufferedInputStream.close();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo183a(InputStream inputStream, boolean z) {
        try {
            String str = null;
            if (inputStream instanceof C1098j) {
                str = ((C1098j) inputStream).m540d();
            } else {
                AbstractC0916l.m982b("loadImage InputStream is not AssetInputStream");
                AbstractC0916l.m1053S();
            }
            this.f7190F++;
            return m175a(m184a(inputStream), str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (OutOfMemoryError e2) {
            AbstractC0916l.m1032a(EnumC1065u.gameImage, e2);
            if (f7176r == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e2);
            }
            return f7176r;
        }
    }

    /* renamed from: a */
    public static C1189s m175a(ImageData imageData, String str) {
        C1189s c1189s = new C1189s();
        c1189s.mo57a(imageData, str, false);
        m185a(c1189s);
        return c1189s;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo218a(int i, int i2, boolean z) {
        C1189s c1189s = new C1189s();
        try {
            c1189s.mo59a(new Image(i, i2), (String) null);
            m185a(c1189s);
            return c1189s;
        } catch (SlickException e) {
            throw new RuntimeException((Throwable) e);
        } catch (OutOfMemoryError e2) {
            AbstractC0916l.m1032a(EnumC1065u.gameImageCreate, e2);
            if (f7176r == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e2);
            }
            return f7176r;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public C0934e mo165b(int i, int i2, boolean z) {
        return m175a((ImageData) new ImageBuffer(i, i2), (String) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo199a(C0934e c0934e, float f, float f2, float f3, Paint paint) {
        mo135k();
        mo227a(f3 + 90.0f, f, f2);
        m148c(c0934e, f - c0934e.f6406r, f2 - c0934e.f6407s, paint);
        mo134l();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo196a(C0934e c0934e, Rect rect, float f, float f2, float f3, Paint paint) {
        mo135k();
        mo227a(f3, f, f2);
        this.f7191G.m5022a(f - c0934e.f6406r, f2 - c0934e.f6407s, c0934e.f6404p, c0934e.f6405q);
        mo192a(c0934e, rect, this.f7191G, paint);
        mo134l();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo193a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        this.f7191G.m5021a(rect2);
        mo192a(c0934e, rect, this.f7191G, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo158b(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        this.f7191G.m5021a(rect2);
        mo192a(c0934e, rect, this.f7191G, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo207a(Rect rect, Paint paint) {
        this.f7191G.m5021a(rect);
        mo205a(this.f7191G, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo172a(boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: f */
    public void mo141f() {
    }

    /* renamed from: e */
    private final C1189s m142e(C0934e c0934e) {
        return (C1189s) c0934e.mo389c();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo192a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        m200a(c0934e, rectF.f234a, rectF.f235b, rectF.f236c, rectF.f237d, rect.f230a, rect.f231b, rect.f232c, rect.f233d, paint);
    }

    /* renamed from: c */
    private void m148c(C0934e c0934e, float f, float f2, Paint paint) {
        float mo386m = c0934e.mo386m();
        float mo387l = c0934e.mo387l();
        m200a(c0934e, f, f2, f + mo386m, f2 + mo387l, 0.0f, 0.0f, mo386m, mo387l, paint);
    }

    /* renamed from: a */
    private void m200a(C0934e c0934e, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        C0936g m874a;
        C1175g c1175g = this.f7205T;
        float f9 = f3 - f;
        float f10 = f4 - f2;
        if (c1175g.f7217c != -90.0f) {
            float f11 = f9 / 2.0f;
            float f12 = f10 / 2.0f;
            float f13 = (f + f11) - c1175g.f7221g;
            float f14 = (f2 + f12) - c1175g.f7222h;
            if ((f13 != 0.0f || f14 != 0.0f) && (f13 > 0.01f || f14 > 0.01f || f13 < -0.01f || f14 < -0.01f)) {
                PointF pointF = this.f7175q;
                pointF.f227a = f13;
                pointF.f228b = f14;
                m222a(c1175g.f7217c + 180.0f, pointF);
                float f15 = (pointF.f227a + c1175g.f7221g) - f11;
                float f16 = (pointF.f228b + c1175g.f7222h) - f12;
                f3 += f15 - f;
                f4 += f16 - f2;
                f = f15;
                f2 = f16;
            }
        }
        C1189s m142e = m142e(c0934e);
        if (this.f7167j != null && m142e.mo386m() < 450 && m142e.mo387l() < 100 && (m874a = this.f7167j.m874a(m142e)) != null) {
            m142e = m142e(m874a.f6425a);
            if (f5 < 0.0f) {
                f += -f5;
                f5 = 0.0f;
            }
            if (f6 < 0.0f) {
                f2 += -f6;
                f6 = 0.0f;
            }
            if (f7 > m874a.f6428d) {
                f3 += -(m874a.f6428d - f7);
                f7 = m874a.f6428d;
            }
            if (f8 > m874a.f6429e) {
                f4 += -(m874a.f6429e - f8);
                f8 = m874a.f6429e;
            }
            f5 += m874a.f6426b;
            f7 += m874a.f6426b;
            f6 += m874a.f6427c;
            f8 += m874a.f6427c;
        }
        float f17 = f * c1175g.f7218d;
        float f18 = f2 * c1175g.f7219e;
        float f19 = (f3 - f) * c1175g.f7218d;
        float f20 = (f4 - f2) * c1175g.f7219e;
        float f21 = f17 + c1175g.f7215a;
        float f22 = f18 + c1175g.f7216b;
        float f23 = f19 / 2.0f;
        float f24 = f20 / 2.0f;
        m212a(paint, m142e, c0934e);
        Image mo72C = m142e.mo72C();
        if (mo72C == null) {
            m142e.mo68G();
            throw new RuntimeException("getSlickImage==null");
        } else {
            m176a(mo72C, f21 + f23, f22 + f24, f19, f20, f5, f6, f7, f8, m126t(), c1175g.f7217c);
        }
    }

    /* renamed from: a */
    private void m176a(Image image, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Color color, float f9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Graphics.setCurrent(this.f7163f);
        image.startUse();
        if (color != null) {
            color.bind();
        }
        float f18 = f3 / 2.0f;
        float f19 = f4 / 2.0f;
        float width = (f5 / image.getWidth()) * image.getTextureWidth();
        float height = (f6 / image.getHeight()) * image.getTextureHeight();
        float width2 = ((f7 - f5) / image.getWidth()) * image.getTextureWidth();
        float height2 = ((f8 - f6) / image.getHeight()) * image.getTextureHeight();
        float f20 = f9 + 90.0f;
        if (f20 == 0.0f) {
            f10 = (-f18) + f;
            f11 = (-f19) + f2;
            f12 = f18 + f;
            f13 = (-f19) + f2;
            f14 = (-f18) + f;
            f15 = f19 + f2;
            f16 = f18 + f;
            f17 = f19 + f2;
        } else {
            float m2030i = C0758f.m2030i(f20);
            float m2035h = C0758f.m2035h(f20);
            float f21 = f18 * m2030i;
            float f22 = f19 * m2030i;
            float f23 = f18 * m2035h;
            float f24 = f19 * m2035h;
            f10 = (-f21) + f24 + f;
            f11 = ((-f23) - f22) + f2;
            f12 = f21 + f24 + f;
            f13 = (f23 - f22) + f2;
            f14 = ((-f21) - f24) + f;
            f15 = (-f23) + f22 + f2;
            f16 = (f21 - f24) + f;
            f17 = f23 + f22 + f2;
        }
        f7171W.glTexCoord2f(width, height);
        f7171W.glVertex3f(f10, f11, 0.0f);
        f7171W.glTexCoord2f(width, height + height2);
        f7171W.glVertex3f(f14, f15, 0.0f);
        f7171W.glTexCoord2f(width + width2, height + height2);
        f7171W.glVertex3f(f16, f17, 0.0f);
        f7171W.glTexCoord2f(width + width2, height);
        f7171W.glVertex3f(f12, f13, 0.0f);
        image.endUse();
        this.f7163f.getColor().bind();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo198a(C0934e c0934e, float f, float f2, Paint paint) {
        mo159b(c0934e, f - c0934e.f6408t, f2 - c0934e.f6409u, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo197a(C0934e c0934e, float f, float f2, Paint paint, float f3, float f4) {
        mo135k();
        mo168b(f, f2);
        mo228a(f4, f4);
        mo227a(f3, f, f2);
        m148c(c0934e, 0.0f, 0.0f, paint);
        mo134l();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo159b(C0934e c0934e, float f, float f2, Paint paint) {
        m148c(c0934e, f, f2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo195a(C0934e c0934e, Rect rect, Paint paint) {
        mo194a(c0934e, rect, paint, 0, 0, 0, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo194a(C0934e c0934e, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        C0924aa.m924a(this, c0934e, rect, paint, i, i2, i3, i4);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo191a(C0934e c0934e, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        C0924aa.m923a(this, c0934e, rectF, paint, f, f2, i, i2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo166b(int i) {
        if (f7169l != this) {
            m125u();
        }
        m155b(false);
        this.f7181w = null;
        this.f7163f.setBackground(m216a(i, f7162e));
        this.f7163f.clear();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: o */
    public void mo131o() {
        if (f7169l != this) {
            m125u();
        }
        this.f7181w = null;
        this.f7163f.clearAlphaMap();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo217a(int i, PorterDuff.Mode mode) {
        this.f7181w = null;
        if (mode != PorterDuff.Mode.CLEAR) {
            mo166b(i);
            return;
        }
        mo166b(i);
        this.f7163f.clearAlphaMap();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo180a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
        float mo157b = mo157b(str, paint);
        f7194J.m5022a(f, f2, f + mo157b, f2 + mo179a(str, paint));
        C0758f.m2130a(f7194J, f3);
        f7195K.m5020a(f7194J);
        if (paint.m5050j() == Paint.Align.CENTER) {
            f7194J.m5023a(-(mo157b / 2.0f), 0.0f);
        }
        mo205a(f7194J, paint2);
        mo181a(str, f7195K.f234a + f3, f7195K.f237d - f3, paint);
    }

    /* renamed from: x */
    boolean m122x() {
        if (!AbstractC0916l.m1071A().f6163bQ.resizeFontWithUIScale || this.f7196L == 1.0f) {
            return false;
        }
        if (this.f7196L < 1.0f) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo181a(String str, float f, float f2, Paint paint) {
        if (m122x()) {
            mo135k();
            float f3 = 1.0f / this.f7196L;
            mo228a(f3, f3);
            f *= this.f7196L;
            f2 *= this.f7196L;
        }
        float f4 = f * this.f7205T.f7218d;
        float f5 = f2 * this.f7205T.f7219e;
        float f6 = f4 + this.f7205T.f7215a;
        float f7 = f5 + this.f7205T.f7216b;
        m211a(paint, str);
        int i = 0;
        if (paint.m5050j() == Paint.Align.CENTER) {
            i = 0 - (this.f7163f.getFont().getWidth(str) / 2);
        } else if (paint.m5050j() == Paint.Align.RIGHT) {
            i = 0 - this.f7163f.getFont().getWidth(str);
        }
        this.f7163f.drawString(str, (int) (f6 + i), (int) (f7 + (0 - this.f7163f.getFont().getLineHeight())));
        if (m122x()) {
            mo134l();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo162b(Rect rect, Paint paint) {
        this.f7191G.m5021a(rect);
        mo205a(this.f7191G, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo205a(RectF rectF, Paint paint) {
        m163b(paint);
        if (paint.m5061d() == Paint.Style.FILL || paint.m5061d() == Paint.Style.FILL_AND_STROKE) {
            TextureImpl.bindNone();
            f7171W.glBegin(7);
            float f = rectF.f234a;
            float f2 = rectF.f235b;
            float f3 = rectF.f236c;
            float f4 = rectF.f237d;
            float f5 = f * this.f7205T.f7218d;
            float f6 = f2 * this.f7205T.f7219e;
            float f7 = f5 + this.f7205T.f7215a;
            float f8 = f6 + this.f7205T.f7216b;
            float f9 = f3 * this.f7205T.f7218d;
            float f10 = f4 * this.f7205T.f7219e;
            float f11 = f9 + this.f7205T.f7215a;
            float f12 = f10 + this.f7205T.f7216b;
            f7171W.glVertex2f(f7, f8);
            f7171W.glVertex2f(f11, f8);
            f7171W.glVertex2f(f11, f12);
            f7171W.glVertex2f(f7, f12);
            f7171W.glEnd();
            return;
        }
        float f13 = rectF.f234a;
        float f14 = rectF.f235b;
        float m5017b = rectF.m5017b();
        float m5013c = rectF.m5013c();
        float f15 = f13 * this.f7205T.f7218d;
        float f16 = f14 * this.f7205T.f7219e;
        this.f7163f.drawRect(f15 + this.f7205T.f7215a, f16 + this.f7205T.f7216b, m5017b * this.f7205T.f7218d, m5013c * this.f7205T.f7219e);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: g */
    public void mo139g() {
        mo144e();
        f7197M = null;
        if (this.f7167j != null) {
            this.f7167j.m870c();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: h */
    public void mo138h() {
        m121y();
        if (this.f7167j != null) {
            this.f7167j.m869d();
        }
        if (this.f7158a && f7170m != null) {
            m124v();
            f7170m = null;
        }
        this.f7181w = null;
        f7197M = null;
        this.f7159b = true;
        f7186B = -1.0f;
        this.f7183y = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: c */
    public void mo151c(Rect rect, Paint paint) {
        this.f7173o.m5035a(rect.f230a, rect.f231b, rect.f230a + rect.f232c, rect.f231b + rect.f233d);
        mo162b(this.f7173o, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo208a(Rect rect) {
        if (rect != null) {
            this.f7205T.f7220f = new RectF(rect);
            this.f7205T.f7220f.f234a *= this.f7205T.f7218d;
            this.f7205T.f7220f.f236c *= this.f7205T.f7218d;
            this.f7205T.f7220f.f235b *= this.f7205T.f7219e;
            this.f7205T.f7220f.f237d *= this.f7205T.f7219e;
            this.f7205T.f7220f.m5023a(this.f7205T.f7215a, this.f7205T.f7216b);
        } else {
            this.f7205T.f7220f = null;
        }
        m155b(false);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo206a(RectF rectF) {
        if (rectF != null) {
            this.f7205T.f7220f = new RectF(rectF);
            this.f7205T.f7220f.f234a *= this.f7205T.f7218d;
            this.f7205T.f7220f.f236c *= this.f7205T.f7218d;
            this.f7205T.f7220f.f235b *= this.f7205T.f7219e;
            this.f7205T.f7220f.f237d *= this.f7205T.f7219e;
            this.f7205T.f7220f.m5023a(this.f7205T.f7215a, this.f7205T.f7216b);
        } else {
            this.f7205T.f7220f = null;
        }
        m155b(false);
    }

    /* renamed from: b */
    public void m155b(boolean z) {
        RectF rectF = this.f7205T.f7220f;
        if (f7197M == rectF && !z) {
            return;
        }
        m121y();
        if (rectF != null) {
            f7171W.glEnable(3089);
            f7171W.glScissor((int) rectF.f234a, (int) ((mo132n() * this.f7196L) - rectF.f237d), (int) rectF.m5017b(), (int) rectF.m5013c());
        } else {
            f7171W.glDisable(3089);
        }
        f7197M = rectF;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo167b(float f, float f2, float f3, Paint paint) {
        float f4 = f * this.f7205T.f7218d;
        float f5 = f2 * this.f7205T.f7219e;
        float f6 = f4 + this.f7205T.f7215a;
        float f7 = f5 + this.f7205T.f7216b;
        float f8 = f3 * this.f7205T.f7218d;
        m163b(paint);
        if (paint.m5061d() == Paint.Style.STROKE) {
            int i = 40;
            if (f8 > 100.0f) {
                i = 60;
            }
            m224a(f6, f7, f8, i);
            return;
        }
        this.f7163f.fillOval(f6 - f8, f7 - f8, f8 * 2.0f, f8 * 2.0f);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo223a(float f, float f2, float f3, Paint paint) {
        float f4 = this.f7205T.f7218d;
        if (f3 * f4 < 25.0f && paint.m5061d() == Paint.Style.STROKE) {
            C0924aa.m925a(this, f, f2, f3, paint, f4);
        } else {
            mo167b(f, f2, f3, paint);
        }
    }

    /* renamed from: c */
    public FloatBuffer m152c(int i) {
        if (this.f7198N.capacity() < i) {
            this.f7198N = BufferUtils.createFloatBuffer(i);
        }
        return this.f7198N;
    }

    /* renamed from: a */
    public FloatBuffer m171a(float[] fArr, int i) {
        FloatBuffer m152c = m152c(i);
        m152c.clear();
        m152c.put(fArr, 0, i);
        m152c.flip();
        return m152c;
    }

    /* renamed from: d */
    public float[] m146d(int i) {
        if (this.f7199O.length < i) {
            this.f7199O = new float[i];
        }
        return this.f7199O;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo170a(float[] fArr, int i, int i2, Paint paint) {
        if (i2 == 0) {
            return;
        }
        boolean z = true;
        if (Main.f6971b) {
            z = false;
        }
        float m5053g = paint.m5053g();
        float f = 1.0f;
        float f2 = 0.0f;
        if (m5053g > 1.0f) {
            f = 1.0f + ((m5053g - 1.0f) * 0.5f);
            f2 = 0.0f + ((m5053g - 1.0f) * 0.5f);
        }
        float f3 = this.f7205T.f7218d;
        float f4 = this.f7205T.f7219e;
        float f5 = this.f7205T.f7215a;
        float f6 = this.f7205T.f7216b;
        if (z) {
            float[] m146d = m146d(i2 * 4);
            int i3 = i2 * 4;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5 += 8) {
                float f7 = fArr[i4];
                float f8 = fArr[i4 + 1];
                float f9 = f7 - f2;
                float f10 = f7 + f;
                float f11 = f8 - f2;
                float f12 = f8 + f;
                m146d[i5 + 0] = f9;
                m146d[i5 + 1] = f11;
                m146d[i5 + 2] = f10;
                m146d[i5 + 3] = f11;
                m146d[i5 + 4] = f10;
                m146d[i5 + 5] = f12;
                m146d[i5 + 6] = f9;
                m146d[i5 + 7] = f12;
                i4 += 2;
            }
            m154b(m146d, 0, i2 * 4, paint);
            return;
        }
        m163b(paint);
        TextureImpl.bindNone();
        f7171W.glBegin(7);
        int i6 = i + i2;
        for (int i7 = i; i7 < i6; i7 += 2) {
            float f13 = fArr[i7] * f3;
            float f14 = fArr[i7 + 1] * f4;
            float f15 = f13 + f5;
            float f16 = f14 + f6;
            float f17 = f15 - f2;
            float f18 = f15 + f;
            float f19 = f16 - f2;
            float f20 = f16 + f;
            f7171W.glVertex2f(f17, f19);
            f7171W.glVertex2f(f18, f19);
            f7171W.glVertex2f(f18, f20);
            f7171W.glVertex2f(f17, f20);
        }
        f7171W.glEnd();
    }

    /* renamed from: b */
    public void m154b(float[] fArr, int i, int i2, Paint paint) {
        boolean z = Main.f6970a;
        if (z) {
            GL11.glDisableClientState(32886);
        }
        m163b(paint);
        TextureImpl.bindNone();
        GL11.glEnableClientState(32884);
        GL11.glVertexPointer(2, 0, m171a(fArr, i2));
        GL11.glDrawArrays(7, i, i2 / 2);
        if (z) {
            GL11.glEnableClientState(32886);
        }
    }

    /* renamed from: a */
    public void m224a(float f, float f2, float f3, int i) {
        Graphics.setCurrent(this.f7163f);
        TextureImpl.bindNone();
        if (this.f7200P != i) {
            this.f7200P = i;
            this.f7201Q = 6.283185f / i;
            this.f7202R = (float) FastTrig.cos(this.f7201Q);
            this.f7203S = (float) FastTrig.sin(this.f7201Q);
        }
        float f4 = this.f7202R;
        float f5 = this.f7203S;
        float f6 = f3;
        float f7 = 0.0f;
        f7204X.start();
        int i2 = i + 1;
        float f8 = f6 + f;
        float f9 = 0.0f + f2;
        for (int i3 = 0; i3 < i2; i3++) {
            f7204X.vertex(f6 + f, f7 + f2);
            float f10 = f6;
            f6 = (f4 * f6) - (f5 * f7);
            f7 = (f5 * f10) + (f4 * f7);
        }
        f7204X.end();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: i */
    public void mo137i() {
        m120z();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: j */
    public void mo136j() {
        m231A();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: k */
    public void mo135k() {
        m120z();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: l */
    public void mo134l() {
        m231A();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo227a(float f, float f2, float f3) {
        this.f7205T.f7217c += f;
        this.f7205T.f7221g = f2;
        this.f7205T.f7222h = f3;
    }

    /* renamed from: a */
    public static void m222a(float f, PointF pointF) {
        float m2035h = C0758f.m2035h(f);
        float m2030i = C0758f.m2030i(f);
        float f2 = pointF.f227a;
        float f3 = pointF.f228b;
        pointF.f227a = (m2030i * f3) - (m2035h * f2);
        pointF.f228b = (m2035h * f3) + (m2030i * f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo228a(float f, float f2) {
        this.f7205T.f7218d *= f;
        this.f7205T.f7219e *= f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo226a(float f, float f2, float f3, float f4) {
        mo168b(f3, f4);
        mo228a(f, f2);
        mo168b(-f3, -f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo168b(float f, float f2) {
        this.f7205T.f7215a += f * this.f7205T.f7218d;
        this.f7205T.f7216b += f2 * this.f7205T.f7219e;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo188a(AbstractC0942m abstractC0942m) {
        abstractC0942m.mo854a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo225a(float f, float f2, float f3, float f4, Paint paint) {
        m163b(paint);
        float f5 = f * this.f7205T.f7218d;
        float f6 = f2 * this.f7205T.f7219e;
        float f7 = f5 + this.f7205T.f7215a;
        float f8 = f6 + this.f7205T.f7216b;
        float f9 = f3 * this.f7205T.f7218d;
        float f10 = f4 * this.f7205T.f7219e;
        this.f7163f.drawLine(f7, f8, f9 + this.f7205T.f7215a, f10 + this.f7205T.f7216b);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo213a(Paint paint) {
        m210a(paint, VariableScope.nullOrMissingString, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo203a(C0928ae c0928ae) {
        if (this.f7158a) {
            m150c(c0928ae);
            m124v();
            f7170m = null;
        }
    }

    /* renamed from: y */
    public void m121y() {
        this.f7163f.flushBuffer();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: p */
    public void mo130p() {
        this.f7163f.flushBuffer();
        this.f7181w = null;
        this.f7163f.flush();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: q */
    public void mo129q() {
        if (this.f7163f != null) {
            this.f7163f.destroy();
        }
        this.f7163f = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public int mo179a(String str, Paint paint) {
        m211a(paint, str);
        int lineHeight = this.f7163f.getFont().getLineHeight();
        if (m122x()) {
            lineHeight = (int) (lineHeight / this.f7196L);
        }
        return lineHeight;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public int mo157b(String str, Paint paint) {
        m211a(paint, str);
        int width = this.f7163f.getFont().getWidth(str);
        if (m122x()) {
            width = (int) (width / this.f7196L);
        }
        return width;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: r */
    public C0934e mo128r() {
        return f7176r;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo190a(C0934e c0934e, File file) {
        C1189s m142e = m142e(c0934e);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            ImageOut.write(m142e.mo72C(), "png", bufferedOutputStream);
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SlickException e2) {
            throw new RuntimeException((Throwable) e2);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo178a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo156b(Lock lock) {
    }

    /* renamed from: z */
    public void m120z() {
        C1175g c1175g;
        this.f7206U.add(this.f7205T);
        if (this.f7207V.f6894a == 0) {
            c1175g = new C1175g();
        } else {
            c1175g = (C1175g) this.f7207V.m527c();
        }
        this.f7205T.m116a(c1175g);
        this.f7205T = c1175g;
    }

    /* renamed from: A */
    public void m231A() {
        if (this.f7206U.size() == 0) {
            throw new RuntimeException("tranform stack is empty");
        }
        this.f7207V.add(this.f7205T);
        this.f7205T = (C1175g) this.f7206U.m527c();
        m155b(false);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: s */
    public float mo127s() {
        return this.f7196L;
    }
}
