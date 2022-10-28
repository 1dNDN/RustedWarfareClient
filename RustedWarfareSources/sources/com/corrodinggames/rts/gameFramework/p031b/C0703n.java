package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.opengl.GLES11Ext;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.p031b.p032a.C0674b;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0929af;
import com.corrodinggames.rts.gameFramework.p044l.C0940k;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.corrodinggames.rts.gameFramework.b.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/n.class */
public class C0703n implements InterfaceC0700k {

    /* renamed from: a */
    public C0682ac f4378a;

    /* renamed from: H */
    private Map f4382H;

    /* renamed from: I */
    private float[] f4383I;

    /* renamed from: J */
    private int f4384J;

    /* renamed from: b */
    int f4385b;

    /* renamed from: c */
    int f4386c;

    /* renamed from: d */
    float[] f4387d;

    /* renamed from: K */
    private int f4388K;

    /* renamed from: L */
    private int f4389L;

    /* renamed from: M */
    private int f4390M;

    /* renamed from: N */
    private int f4391N;

    /* renamed from: O */
    private int f4392O;

    /* renamed from: P */
    private int f4393P;

    /* renamed from: Q */
    private InterfaceC0697h f4394Q;

    /* renamed from: R */
    private InterfaceC0702m f4395R;

    /* renamed from: e */
    AbstractC0706q[] f4396e;

    /* renamed from: f */
    AbstractC0706q[] f4397f;

    /* renamed from: g */
    AbstractC0706q[] f4398g;

    /* renamed from: S */
    private final C0712w f4399S;

    /* renamed from: T */
    private int f4400T;

    /* renamed from: U */
    private int[] f4401U;

    /* renamed from: V */
    private ArrayList f4402V;

    /* renamed from: W */
    private final float[] f4403W;

    /* renamed from: X */
    private final float[] f4404X;

    /* renamed from: Y */
    private final RectF f4405Y;

    /* renamed from: Z */
    private final RectF f4406Z;

    /* renamed from: aa */
    private final int[] f4407aa;

    /* renamed from: h */
    boolean f4409h;

    /* renamed from: i */
    C0714y f4410i;

    /* renamed from: j */
    C0694f f4411j;

    /* renamed from: k */
    float[] f4412k;

    /* renamed from: l */
    C0707r f4413l;

    /* renamed from: m */
    public int f4414m;

    /* renamed from: n */
    C1101m f4415n;

    /* renamed from: o */
    static RectF f4416o;

    /* renamed from: p */
    int f4417p;

    /* renamed from: q */
    boolean f4418q;

    /* renamed from: r */
    boolean f4419r;

    /* renamed from: s */
    int f4420s;

    /* renamed from: t */
    C0928ae f4421t;

    /* renamed from: u */
    public int f4422u;

    /* renamed from: v */
    static int f4423v;

    /* renamed from: w */
    static int f4424w;

    /* renamed from: x */
    InterfaceC0681ab f4425x;

    /* renamed from: A */
    C1101m f4428A;

    /* renamed from: B */
    C0705p f4429B;

    /* renamed from: C */
    public static C0940k f4430C;

    /* renamed from: D */
    FloatBuffer f4431D;

    /* renamed from: E */
    private static final String f4379E = C0703n.class.getSimpleName();

    /* renamed from: F */
    private static final float[] f4380F = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: G */
    private static final float[] f4381G = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: ab */
    private static final InterfaceC0710u f4408ab = new C0709t();

    /* renamed from: y */
    public static boolean f4426y = false;

    /* renamed from: z */
    static int f4427z = 0;

    /* renamed from: a */
    private int m2500a(int i, int i2, AbstractC0706q[] abstractC0706qArr, int[] iArr) {
        int glCreateProgram = GLES20.glCreateProgram();
        m2447p();
        if (glCreateProgram == 0) {
            throw new RuntimeException("Cannot create GL program: " + GLES20.glGetError());
        }
        GLES20.glAttachShader(glCreateProgram, i);
        m2447p();
        GLES20.glAttachShader(glCreateProgram, i2);
        m2447p();
        GLES20.glLinkProgram(glCreateProgram);
        m2447p();
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.m4933d(f4379E, "======= ERROR =========");
            Log.m4933d(f4379E, "Could not link program: ");
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
            Log.m4933d(f4379E, glGetProgramInfoLog);
            GLES20.glDeleteProgram(glCreateProgram);
            throw new RuntimeException("Cannot link GL program: " + glGetProgramInfoLog);
        }
        m2476a(abstractC0706qArr, glCreateProgram);
        return glCreateProgram;
    }

    /* renamed from: a */
    private static void m2476a(AbstractC0706q[] abstractC0706qArr, int i) {
        for (AbstractC0706q abstractC0706q : abstractC0706qArr) {
            abstractC0706q.mo2440a(i);
        }
    }

    /* renamed from: a */
    private static String m2498a(int i, String str) {
        String[] split;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        for (String str2 : str.split("\n")) {
            if (!z && str2.contains("version")) {
                z = true;
            } else {
                if (z) {
                }
                if (!str2.equals(str2)) {
                    AbstractC0916l.m963e("Changing: " + str2 + " to " + str2);
                }
                stringBuffer.append(str2);
                stringBuffer.append("\n");
            }
        }
        if (!z) {
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static int m2470b(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (str == null) {
            throw new RuntimeException("Shader Compilation Failed: shaderCode==null");
        }
        GLES20.glShaderSource(glCreateShader, m2498a(i, str));
        m2448o();
        GLES20.glCompileShader(glCreateShader);
        m2448o();
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String str2 = "Shader Compilation Failed: " + GLES20.glGetShaderInfoLog(glCreateShader);
            Log.m4933d(f4379E, str2);
            throw new RuntimeException(str2);
        }
        return glCreateShader;
    }

    /* renamed from: a */
    public void m2505a(int i, int i2) {
        this.f4385b = i;
        this.f4386c = i2;
        m2448o();
        Matrix.setIdentityM(this.f4383I, this.f4384J);
        Matrix.orthoM(this.f4387d, 0, 0.0f, i, 0.0f, i2, -1.0f, 1.0f);
        m2448o();
        if (m2445r() == null) {
            this.f4388K = i;
            this.f4389L = i2;
            Matrix.translateM(this.f4383I, this.f4384J, 0.0f, i2, 0.0f);
            Matrix.scaleM(this.f4383I, this.f4384J, 1.0f, -1.0f, 1.0f);
            m2448o();
        }
        GLES20.glViewport(0, 0, this.f4385b, this.f4386c);
        m2456g();
    }

    /* renamed from: a */
    public void m2496a(int i, AbstractC0706q[] abstractC0706qArr) {
        m2448o();
        mo2457f();
        m2448o();
        m2506a(i);
        GLES20.glUniformMatrix4fv(abstractC0706qArr[5].f4436a, 1, false, this.f4387d, 0);
        m2448o();
    }

    /* renamed from: g */
    public void m2456g() {
        if (this.f4390M != 0) {
            m2496a(this.f4390M, this.f4396e);
        }
        if (this.f4391N != 0) {
            m2496a(this.f4391N, this.f4397f);
        }
        if (this.f4392O != 0) {
            m2496a(this.f4392O, this.f4398g);
        }
    }

    /* renamed from: a */
    public void m2480a(float[] fArr) {
        GLES20.glClearColor(fArr[1], fArr[2], fArr[3], fArr[0]);
        m2448o();
        GLES20.glClear(16384);
        m2448o();
    }

    /* renamed from: h */
    public float m2455h() {
        return 1.0f;
    }

    /* renamed from: a */
    public void m2510a(float f, float f2) {
        int i = this.f4384J;
        float[] fArr = this.f4383I;
        int i2 = i + 12;
        fArr[i2] = fArr[i2] + (fArr[i + 0] * f) + (fArr[i + 4] * f2);
        int i3 = i + 13;
        fArr[i3] = fArr[i3] + (fArr[i + 1] * f) + (fArr[i + 5] * f2);
        int i4 = i + 14;
        fArr[i4] = fArr[i4] + (fArr[i + 2] * f) + (fArr[i + 6] * f2);
        int i5 = i + 15;
        fArr[i5] = fArr[i5] + (fArr[i + 3] * f) + (fArr[i + 7] * f2);
    }

    /* renamed from: a */
    public void m2509a(float f, float f2, float f3) {
        Matrix.scaleM(this.f4383I, this.f4384J, f, f2, f3);
    }

    /* renamed from: a */
    public void m2511a(float f) {
        if (f == 0.0f) {
            return;
        }
        m2479a(this.f4383I, this.f4384J, f);
    }

    /* renamed from: a */
    public final void m2479a(float[] fArr, int i, float f) {
        float m2035h = C0758f.m2035h(f);
        float m2030i = C0758f.m2030i(f);
        if (f == 90.0f) {
            m2035h = 1.0f;
            m2030i = 0.0f;
        }
        float f2 = fArr[0 + i];
        float f3 = fArr[1 + i];
        float f4 = fArr[2 + i];
        float f5 = fArr[3 + i];
        float f6 = fArr[4 + i];
        float f7 = fArr[5 + i];
        float f8 = fArr[6 + i];
        float f9 = fArr[7 + i];
        float f10 = (f2 * m2030i) + (f6 * m2035h);
        float f11 = (f3 * m2030i) + (f7 * m2035h);
        float f12 = (f4 * m2030i) + (f8 * m2035h);
        float f13 = (f5 * m2030i) + (f9 * m2035h);
        int i2 = 0 + i;
        fArr[i2 + 0] = f10;
        fArr[i2 + 1] = f11;
        fArr[i2 + 2] = f12;
        fArr[i2 + 3] = f13;
        float f14 = (f2 * (-m2035h)) + (f6 * m2030i);
        float f15 = (f3 * (-m2035h)) + (f7 * m2030i);
        float f16 = (f4 * (-m2035h)) + (f8 * m2030i);
        float f17 = (f5 * (-m2035h)) + (f9 * m2030i);
        int i3 = 4 + i;
        fArr[i3 + 0] = f14;
        fArr[i3 + 1] = f15;
        fArr[i3 + 2] = f16;
        fArr[i3 + 3] = f17;
    }

    /* renamed from: i */
    public float[] m2454i() {
        float[] fArr = this.f4383I;
        int i = this.f4384J;
        float[] fArr2 = this.f4412k;
        for (int i2 = 0; i2 < 16; i2++) {
            fArr2[i2] = fArr[i + i2];
        }
        return fArr2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: b */
    public void mo2473b() {
        if (1 != 0) {
            int i = this.f4384J;
            this.f4384J += 16;
            if (this.f4383I.length <= this.f4384J + 16) {
                this.f4383I = Arrays.copyOf(this.f4383I, this.f4383I.length * 2);
            }
            for (int i2 = 0; i2 < 16; i2++) {
                this.f4383I[this.f4384J + i2] = this.f4383I[i + i2];
            }
        }
        m2453j();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: c */
    public void mo2465c() {
        this.f4384J -= 16;
        if (this.f4384J < 0) {
            AbstractC0916l.m957g("restore: error mCurrentMatrixIndex: " + this.f4384J);
            this.f4384J = 0;
        }
        m2452k();
    }

    /* renamed from: j */
    public void m2453j() {
        C1101m c1101m = this.f4415n;
        this.f4414m++;
        if (this.f4414m >= c1101m.f6894a) {
            c1101m.add(new C0707r());
        }
        C0707r c0707r = (C0707r) c1101m.get(this.f4414m);
        this.f4413l.m2441a(c0707r);
        this.f4413l = c0707r;
    }

    /* renamed from: k */
    public void m2452k() {
        C1101m c1101m = this.f4415n;
        this.f4414m--;
        if (this.f4414m < 0) {
            AbstractC0916l.m957g("popTransformStack: error currentTransformIndex: " + this.f4414m);
            c1101m.set(0, new C0707r());
            this.f4414m = 0;
        }
        this.f4413l = (C0707r) c1101m.get(this.f4414m);
        m2481a(false);
    }

    /* renamed from: a */
    public void m2481a(boolean z) {
        RectF rectF = this.f4413l.f4439a;
        if (f4416o == rectF && !z) {
            return;
        }
        mo2458e();
        if (rectF != null) {
            GLES20.glEnable(3089);
            GLES20.glScissor((int) rectF.f234a, (int) (this.f4389L - rectF.f237d), (int) rectF.m5017b(), (int) rectF.m5013c());
        } else {
            GLES20.glDisable(3089);
        }
        f4416o = rectF;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2507a(float f, float f2, float f3, C0711v c0711v, InterfaceC0697h interfaceC0697h) {
        m2485a(interfaceC0697h);
        m2503a(5, 0, 4, f, f2, 2.0f * f3, 2.0f * f3, c0711v.m2438a(), 0.0f);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2508a(float f, float f2, float f3, float f4, C0711v c0711v, InterfaceC0697h interfaceC0697h) {
        m2485a(interfaceC0697h);
        m2502a(3, 4, 2, f, f2, f3 - f, f4 - f2, c0711v);
        this.f4400T++;
    }

    /* renamed from: a */
    private void m2502a(int i, int i2, int i3, float f, float f2, float f3, float f4, C0711v c0711v) {
        m2503a(i, i2, i3, f, f2, f3, f4, c0711v.m2438a(), c0711v.m2434b());
    }

    /* renamed from: a */
    private void m2503a(int i, int i2, int i3, float f, float f2, float f3, float f4, int i4, float f5) {
        m2504a(i2, i4, f5);
        if (this.f4395R != null) {
            this.f4395R.m2513a(this.f4390M, this.f4394Q);
        }
        m2475a(this.f4396e, i, i3, f, f2, f3, f4, (InterfaceC0701l) null);
    }

    /* renamed from: a */
    public void m2506a(int i) {
        if (this.f4417p != i) {
            GLES20.glUseProgram(i);
            m2448o();
            this.f4419r = false;
            this.f4417p = i;
        }
    }

    /* renamed from: a */
    private void m2504a(int i, int i2, float f) {
        mo2457f();
        m2506a(this.f4390M);
        if (f > 0.0f) {
            GLES20.glLineWidth(f * this.f4383I[this.f4384J]);
            m2448o();
        } else {
            GLES20.glLineWidth(1.0f);
            m2448o();
        }
        float[] m2472b = m2472b(i2);
        m2467b(true);
        GLES20.glBlendColor(m2472b[0], m2472b[1], m2472b[2], m2472b[3]);
        m2448o();
        GLES20.glUniform4fv(this.f4396e[2].f4436a, 1, m2472b, 0);
        m2466b(this.f4396e, i);
        m2448o();
    }

    /* renamed from: b */
    float[] m2472b(int i) {
        float m2455h = ((i >>> 24) & 255) * 0.003921569f * m2455h();
        float f = ((i >>> 16) & 255) * 0.003921569f * m2455h;
        float f2 = ((i >>> 8) & 255) * 0.003921569f * m2455h;
        this.f4404X[0] = f;
        this.f4404X[1] = f2;
        this.f4404X[2] = (i & 255) * 0.003921569f * m2455h;
        this.f4404X[3] = m2455h;
        return this.f4404X;
    }

    /* renamed from: b */
    private void m2467b(boolean z) {
        if (z) {
            if (!this.f4418q) {
                GLES20.glEnable(3042);
                m2448o();
                this.f4418q = true;
            }
        } else if (this.f4418q) {
            GLES20.glDisable(3042);
            m2448o();
            this.f4418q = false;
        }
    }

    /* renamed from: l */
    public void m2451l() {
        m2468b((C0928ae) null);
        this.f4419r = false;
        this.f4417p = -1;
        this.f4425x = null;
        this.f4418q = false;
        m2447p();
        mo2457f();
    }

    /* renamed from: b */
    private void m2466b(AbstractC0706q[] abstractC0706qArr, int i) {
        if (!this.f4419r || this.f4420s != i) {
            GLES20.glBindBuffer(34962, this.f4393P);
            m2448o();
            GLES20.glVertexAttribPointer(abstractC0706qArr[0].f4436a, 2, 5126, false, 8, i * 8);
            m2448o();
            GLES20.glBindBuffer(34962, 0);
            m2448o();
            this.f4419r = true;
            this.f4420s = i;
        }
    }

    /* renamed from: a */
    private void m2475a(AbstractC0706q[] abstractC0706qArr, int i, int i2, float f, float f2, float f3, float f4, InterfaceC0701l interfaceC0701l) {
        m2477a(abstractC0706qArr, f, f2, f3, f4, interfaceC0701l);
        int i3 = abstractC0706qArr[0].f4436a;
        GLES20.glEnableVertexAttribArray(i3);
        m2448o();
        GLES20.glDrawArrays(i, 0, i2);
        m2448o();
        GLES20.glDisableVertexAttribArray(i3);
        m2448o();
    }

    /* renamed from: a */
    private void m2477a(AbstractC0706q[] abstractC0706qArr, float f, float f2, float f3, float f4, InterfaceC0701l interfaceC0701l) {
        if (interfaceC0701l != null) {
            GLES20.glUniformMatrix4fv(abstractC0706qArr[1].f4436a, 1, false, interfaceC0701l.m2514a(this.f4388K, this.f4389L, f, f2, f3, f4), 0);
            m2448o();
            return;
        }
        Matrix.translateM(this.f4403W, 0, this.f4383I, this.f4384J, f, f2, 0.0f);
        Matrix.scaleM(this.f4403W, 0, f3, f4, 1.0f);
        GLES20.glUniformMatrix4fv(abstractC0706qArr[1].f4436a, 1, false, this.f4403W, 0);
        m2448o();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2491a(AbstractC0690b abstractC0690b, int i, int i2, int i3, int i4, InterfaceC0685af interfaceC0685af, InterfaceC0701l interfaceC0701l) {
        if (i3 <= 0 || i4 <= 0) {
            return;
        }
        m2499a(abstractC0690b.mo2428g(), interfaceC0685af);
        C0686ag.m2562a(abstractC0690b, this.f4405Y);
        this.f4406Z.m5022a(i, i2, i + i3, i2 + i4);
        abstractC0690b.mo2550a(this.f4405Y);
        abstractC0690b.mo2549a(this.f4405Y, this.f4406Z);
        m2487a(abstractC0690b, this.f4405Y, this.f4406Z, interfaceC0701l);
    }

    /* renamed from: a */
    public void m2484a(C0928ae c0928ae) {
        if (this.f4421t == c0928ae) {
            return;
        }
        if (c0928ae == null && this.f4421t != null && this.f4421t.mo865a()) {
            if (this.f4421t.mo863b()) {
                mo2458e();
                m2450m();
                return;
            }
            return;
        }
        m2468b(c0928ae);
    }

    /* renamed from: b */
    public void m2468b(C0928ae c0928ae) {
        if (this.f4421t == c0928ae) {
            return;
        }
        mo2457f();
        if (c0928ae != null) {
            if (c0928ae.f6359n == 0) {
                m2459d(c0928ae);
            }
            if (c0928ae.f6359n == 0) {
                this.f4421t = null;
                return;
            }
            this.f4410i.f4458j = (C0715z) c0928ae.f6362q;
        }
        if (c0928ae == null) {
            this.f4410i.f4458j = this.f4410i.f4457i;
        }
        this.f4421t = c0928ae;
    }

    /* renamed from: c */
    public void m2462c(C0928ae c0928ae) {
        C0929af[] c0929afArr;
        for (C0929af c0929af : c0928ae.f6361p) {
            if (c0929af.f6367c || c0929af.f6370f != null) {
                c0929af.f6367c = false;
                if (c0929af.f6366b == -1) {
                    c0929af.f6366b = GLES20.glGetUniformLocation(c0928ae.f6359n, c0929af.f6365a);
                    if (c0929af.f6366b == -1 && !c0929af.f6368d) {
                        c0929af.f6368d = true;
                        c0928ae.m906b("Unknown parameter: " + c0929af.f6365a);
                        return;
                    }
                }
                if (c0929af.f6370f != null) {
                    AbstractC0690b m2530a = this.f4411j.m2530a(c0929af.f6370f.mo390b(), c0929af.f6370f);
                    if (c0929af.f6371g) {
                        GLES20.glUniform2f(c0929af.f6366b, m2530a.f4355e, m2530a.f4356f);
                    } else {
                        int m2553a = m2530a.m2553a();
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, m2553a);
                        GLES20.glUniform1i(c0929af.f6366b, 1);
                        GLES20.glActiveTexture(33984);
                    }
                } else if (c0929af.f6369e.length == 1) {
                    GLES20.glUniform1f(c0929af.f6366b, c0929af.f6369e[0]);
                } else if (c0929af.f6369e.length == 2) {
                    GLES20.glUniform2f(c0929af.f6366b, c0929af.f6369e[0], c0929af.f6369e[1]);
                } else if (c0929af.f6369e.length == 4) {
                    GLES20.glUniform4f(c0929af.f6366b, c0929af.f6369e[0], c0929af.f6369e[1], c0929af.f6369e[2], c0929af.f6369e[3]);
                } else {
                    c0928ae.m906b("Unhandled parameter size: " + c0929af.f6365a + " - " + c0929af.f6369e.length);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m2459d(C0928ae c0928ae) {
        if (c0928ae.f6360o != 0) {
            return false;
        }
        if (c0928ae.f6359n != 0 && !c0928ae.f6358m) {
            return true;
        }
        m2447p();
        c0928ae.f6358m = false;
        c0928ae.m906b("== Compiling shader ==");
        C0715z c0715z = new C0715z();
        c0928ae.f6362q = c0715z;
        try {
            c0928ae.f6359n = m2474a(c0715z.f4472f, this.f4410i.f4456h.m2538a(), c0928ae.f6351f);
        } catch (RuntimeException e) {
            c0928ae.m904c("Failed to compile shader: " + e.getMessage());
            e.printStackTrace();
            c0928ae.f6360o = 1;
        }
        if (c0928ae.f6360o != 0 && c0928ae.f6359n == 0) {
            c0928ae.m904c("Shader program_handle == 0");
            c0928ae.f6360o = 1;
        }
        m2447p();
        return true;
    }

    /* renamed from: a */
    public void m2488a(AbstractC0690b abstractC0690b, RectF rectF, RectF rectF2, InterfaceC0685af interfaceC0685af, InterfaceC0701l interfaceC0701l) {
        if (rectF2.m5017b() <= 0.0f || rectF2.m5013c() <= 0.0f) {
            return;
        }
        m2499a(abstractC0690b.mo2428g(), interfaceC0685af);
        this.f4405Y.m5020a(rectF);
        this.f4406Z.m5020a(rectF2);
        abstractC0690b.mo2550a(this.f4405Y);
        abstractC0690b.mo2549a(this.f4405Y, this.f4406Z);
        m2487a(abstractC0690b, this.f4405Y, this.f4406Z, interfaceC0701l);
    }

    /* renamed from: a */
    private void m2487a(AbstractC0690b abstractC0690b, RectF rectF, RectF rectF2, InterfaceC0701l interfaceC0701l) {
        if (!this.f4409h) {
            m2467b(true);
            this.f4410i.m2421a(this.f4421t);
            this.f4409h = true;
        }
        this.f4410i.m2424a(this.f4422u);
        this.f4410i.m2422a(abstractC0690b, rectF, rectF2, m2454i());
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: f */
    public void mo2457f() {
        if (this.f4409h) {
            this.f4410i.m2417d();
            this.f4409h = false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: e */
    public void mo2458e() {
        if (this.f4409h) {
            this.f4410i.m2418c();
        }
    }

    /* renamed from: m */
    public void m2450m() {
        this.f4410i.m2420b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public boolean mo2494a(AbstractC0690b abstractC0690b) {
        boolean m2541i = abstractC0690b.m2541i();
        if (m2541i) {
            m2464c(abstractC0690b.f4355e, abstractC0690b.f4356f);
            synchronized (this.f4399S) {
                this.f4399S.m2432a(abstractC0690b.m2553a());
            }
        }
        return m2541i;
    }

    /* renamed from: b */
    public static void m2471b(int i, int i2) {
        f4423v++;
        f4424w += i * i2 * 4;
    }

    /* renamed from: c */
    public static void m2464c(int i, int i2) {
        f4423v--;
        f4424w -= (i * i2) * 4;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: d */
    public void mo2461d() {
        m2486a((AbstractC0690b) this.f4402V.remove(this.f4402V.size() - 1), m2445r());
        mo2465c();
        m2451l();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: c */
    public void mo2463c(AbstractC0690b abstractC0690b) {
        mo2473b();
        AbstractC0690b m2445r = m2445r();
        this.f4402V.add(abstractC0690b);
        m2486a(m2445r, abstractC0690b);
    }

    /* renamed from: r */
    private AbstractC0690b m2445r() {
        return (AbstractC0690b) this.f4402V.get(this.f4402V.size() - 1);
    }

    /* renamed from: a */
    private void m2486a(AbstractC0690b abstractC0690b, AbstractC0690b abstractC0690b2) {
        mo2457f();
        if (abstractC0690b == null && abstractC0690b2 != null) {
            if (abstractC0690b2.mo2428g() == 3553) {
                GLES20.glGenFramebuffers(1, this.f4401U, 0);
                m2448o();
                GLES20.glBindFramebuffer(36160, this.f4401U[0]);
                m2448o();
            } else {
                GLES11Ext.glGenFramebuffersOES(1, this.f4401U, 0);
                m2448o();
                GLES11Ext.glBindFramebufferOES(36160, this.f4401U[0]);
                m2448o();
            }
        } else if (abstractC0690b != null && abstractC0690b2 == null) {
            if (abstractC0690b.mo2428g() == 3553) {
                GLES20.glBindFramebuffer(36160, 0);
                m2448o();
                GLES20.glDeleteFramebuffers(1, this.f4401U, 0);
                m2448o();
            } else {
                GLES11Ext.glBindFramebufferOES(36160, 0);
                m2448o();
                GLES11Ext.glDeleteFramebuffersOES(1, this.f4401U, 0);
                m2448o();
            }
        }
        if (abstractC0690b2 == null) {
            m2505a(this.f4388K, this.f4389L);
            return;
        }
        m2505a(abstractC0690b2.mo2546b(), abstractC0690b2.mo2545c());
        if (!abstractC0690b2.m2541i()) {
            abstractC0690b2.mo2430b(this);
        }
        if (abstractC0690b2.mo2428g() == 3553) {
            GLES20.glFramebufferTexture2D(36160, 36064, abstractC0690b2.mo2428g(), abstractC0690b2.m2553a(), 0);
            m2448o();
            m2444s();
            return;
        }
        GLES11Ext.glFramebufferTexture2DOES(36160, 36064, abstractC0690b2.mo2428g(), abstractC0690b2.m2553a(), 0);
        m2448o();
        m2443t();
    }

    /* renamed from: s */
    private static void m2444s() {
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            String str = VariableScope.nullOrMissingString;
            switch (glCheckFramebufferStatus) {
                case 36054:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                    break;
                case 36055:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                    break;
                case 36057:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                    break;
                case 36061:
                    str = "GL_FRAMEBUFFER_UNSUPPORTED";
                    break;
            }
            throw new RuntimeException(str + ":" + Integer.toHexString(glCheckFramebufferStatus));
        }
    }

    /* renamed from: t */
    private static void m2443t() {
        int glCheckFramebufferStatusOES = GLES11Ext.glCheckFramebufferStatusOES(36160);
        if (glCheckFramebufferStatusOES != 36053) {
            String str = VariableScope.nullOrMissingString;
            switch (glCheckFramebufferStatusOES) {
                case 36054:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                    break;
                case 36055:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                    break;
                case 36057:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                    break;
                case 36061:
                    str = "GL_FRAMEBUFFER_UNSUPPORTED";
                    break;
            }
            throw new RuntimeException(str + ":" + Integer.toHexString(glCheckFramebufferStatusOES));
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: d */
    public void mo2460d(AbstractC0690b abstractC0690b) {
        int mo2428g = abstractC0690b.mo2428g();
        mo2469b(abstractC0690b);
        m2448o();
        GLES20.glTexParameteri(mo2428g, 10242, 33071);
        GLES20.glTexParameteri(mo2428g, 10243, 33071);
        int mo2427h = abstractC0690b.mo2427h();
        GLES20.glTexParameterf(mo2428g, 10241, mo2427h);
        GLES20.glTexParameterf(mo2428g, 10240, mo2427h);
    }

    /* renamed from: a */
    public void m2493a(AbstractC0690b abstractC0690b, int i) {
        if (abstractC0690b.mo2427h() != i && abstractC0690b.m2553a() != -1) {
            mo2469b(abstractC0690b);
            abstractC0690b.mo2431b(i);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: b */
    public void mo2469b(AbstractC0690b abstractC0690b) {
        if (this.f4425x == abstractC0690b) {
        }
        mo2458e();
        GLES20.glBindTexture(abstractC0690b.mo2428g(), abstractC0690b.m2553a());
        this.f4425x = abstractC0690b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2492a(AbstractC0690b abstractC0690b, int i, int i2, int i3) {
        int mo2428g = abstractC0690b.mo2428g();
        mo2469b(abstractC0690b);
        m2448o();
        GLES20.glTexImage2D(mo2428g, 0, i3, abstractC0690b.m2544d(), abstractC0690b.m2543e(), 0, i, i2, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2489a(AbstractC0690b abstractC0690b, Bitmap bitmap, int i) {
        int mo2428g = abstractC0690b.mo2428g();
        mo2469b(abstractC0690b);
        m2448o();
        if (i == 0) {
            GLUtils.texImage2D(mo2428g, 0, bitmap, 0);
        } else {
            GLUtils.texImage2D(mo2428g, 0, i, bitmap, 0);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2490a(AbstractC0690b abstractC0690b, int i, int i2, Bitmap bitmap, int i3, int i4) {
        int mo2428g = abstractC0690b.mo2428g();
        mo2469b(abstractC0690b);
        m2448o();
        GLUtils.texSubImage2D(mo2428g, 0, i, i2, bitmap, i3, i4);
    }

    /* renamed from: a */
    public static void m2482a(String str, Throwable th) {
        if (f4427z > 1000) {
            return;
        }
        f4427z++;
        if (th != null) {
            Log.m4936b(f4379E, str, th);
        } else {
            Log.m4933d(f4379E, str);
        }
    }

    /* renamed from: n */
    public static void m2449n() {
        int i;
        int i2 = 255;
        int glGetError = GLES20.glGetError();
        while (true) {
            i = glGetError;
            if (i == 0 || i2 <= 0) {
                break;
            }
            i2--;
            glGetError = GLES20.glGetError();
        }
        if (i != 0) {
            m2482a("clearGlError: Failed to clear", (Throwable) null);
        }
    }

    /* renamed from: o */
    public static void m2448o() {
        int glGetError;
        if (f4426y && (glGetError = GLES20.glGetError()) != 0) {
            m2482a("GL error: " + glGetError, new Throwable());
            m2449n();
        }
    }

    /* renamed from: p */
    public static void m2447p() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            m2482a("GL error: " + glGetError, new Throwable());
            m2449n();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public InterfaceC0710u mo2512a() {
        return f4408ab;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2501a(int i, int i2, int i3, int i4) {
        float f = this.f4383I[this.f4384J];
        this.f4413l.f4439a = new RectF();
        this.f4413l.f4439a.f234a = i;
        this.f4413l.f4439a.f236c = i3;
        this.f4413l.f4439a.f235b = i2;
        this.f4413l.f4439a.f237d = i4;
        this.f4413l.f4439a.f234a *= f;
        this.f4413l.f4439a.f236c *= f;
        this.f4413l.f4439a.f235b *= f;
        this.f4413l.f4439a.f237d *= f;
        m2481a(false);
    }

    /* renamed from: a */
    private void m2485a(InterfaceC0697h interfaceC0697h) {
        if (interfaceC0697h == null) {
            throw new NullPointerException("draw shape filter is null.");
        }
        this.f4394Q = interfaceC0697h;
        if (this.f4382H.containsKey(interfaceC0697h)) {
            int i = this.f4390M;
            this.f4390M = ((Integer) this.f4382H.get(interfaceC0697h)).intValue();
            m2476a(this.f4396e, this.f4390M);
            if (i != this.f4390M) {
                m2496a(this.f4390M, this.f4396e);
                return;
            }
            return;
        }
        this.f4390M = m2474a(this.f4396e, interfaceC0697h.mo2520a(), interfaceC0697h.mo2519b());
        m2496a(this.f4390M, this.f4396e);
        this.f4382H.put(interfaceC0697h, Integer.valueOf(this.f4390M));
    }

    /* renamed from: a */
    private void m2499a(int i, InterfaceC0685af interfaceC0685af) {
        if (interfaceC0685af == null) {
            throw new NullPointerException("Texture filter is null.");
        }
    }

    /* renamed from: a */
    public int m2474a(AbstractC0706q[] abstractC0706qArr, String str, String str2) {
        return m2500a(m2470b(35633, str), m2470b(35632, str2), abstractC0706qArr, this.f4407aa);
    }

    /* renamed from: a */
    public C0705p m2497a(int i, boolean z, boolean z2) {
        AbstractC0916l.m963e("Loading new font size:" + i + " bold:" + z + " unicode:" + z2);
        try {
            C0705p c0705p = new C0705p(this);
            c0705p.f4432a = i;
            c0705p.f4433b = z;
            Paint paint = new Paint();
            paint.m5062c(true);
            paint.mo893a(true);
            if (!z) {
                paint.mo895a(Typeface.m5001a(Typeface.f242c, 0));
            } else {
                paint.mo895a(Typeface.m5001a(Typeface.f242c, 1));
            }
            c0705p.f4434c = new C0674b(null);
            c0705p.f4434c.m2601a(paint, i, 3, 2);
            c0705p.f4434c.m2595a(true);
            c0705p.f4434c.m2602a(12);
            this.f4428A.add(c0705p);
            return c0705p;
        } catch (OutOfMemoryError e) {
            AbstractC0916l.m1032a(EnumC1065u.gameFont, e);
            C0705p c0705p2 = new C0705p(this);
            c0705p2.f4432a = i;
            c0705p2.f4433b = z;
            if (this.f4429B != null) {
                c0705p2.f4434c = this.f4429B.f4434c;
            }
            this.f4428A.add(c0705p2);
            return c0705p2;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2483a(String str, float f, float f2, Paint paint) {
        mo2457f();
        boolean z = false;
        Typeface m5051i = paint.m5051i();
        if (m5051i != null) {
            z = m5051i.m5003a();
        }
        int m5049k = (int) paint.m5049k();
        if (m5049k > 42) {
            m5049k = 42;
        }
        if (m5049k < 10) {
            m5049k = 10;
        }
        if (m5049k % 2 != 0) {
        }
        boolean m2022n = C0758f.m2022n(str);
        if (m2022n) {
            m5049k = 24;
        }
        if (this.f4429B == null) {
            this.f4429B = m2497a(24, false, true);
        }
        C0705p c0705p = null;
        Iterator it = this.f4428A.iterator();
        while (it.hasNext()) {
            C0705p c0705p2 = (C0705p) it.next();
            if (c0705p2.f4432a == m5049k && c0705p2.f4433b == z) {
                c0705p = c0705p2;
            }
        }
        if (c0705p == null) {
            c0705p = m2497a(m5049k, z, m2022n);
        }
        if (c0705p.f4434c == null) {
            m2482a("font.glText==null", (Throwable) null);
            return;
        }
        C0674b c0674b = c0705p.f4434c;
        m2447p();
        int m5057e = paint.m5057e();
        float m5108a = Color.m5108a(m5057e) * 0.003921569f;
        float m5104b = Color.m5104b(m5057e) * 0.003921569f * m5108a;
        float m5103c = Color.m5103c(m5057e) * 0.003921569f * m5108a;
        float m5102d = Color.m5102d(m5057e) * 0.003921569f * m5108a;
        float m5049k2 = paint.m5049k();
        if (m5049k2 != c0705p.f4432a) {
        }
        c0674b.m2603a(m5104b, m5103c, m5102d, m5108a, this.f4387d);
        c0674b.m2605a(m5049k2 / c0705p.f4432a);
        m2447p();
        if (paint.m5050j() == Paint.Align.CENTER) {
            c0674b.m2599a(str, f - ((int) (c0674b.m2600a(str) * 0.5f)), this.f4386c - f2);
        } else {
            c0674b.m2598a(str, f, this.f4386c - f2, 0.0f);
        }
        m2447p();
        c0674b.m2589d();
        m2451l();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2478a(float[] fArr, int i, int i2, C0711v c0711v, InterfaceC0697h interfaceC0697h) {
        if (this.f4431D == null || this.f4431D.capacity() < i2 * 4) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 * 4) + 10);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.f4431D = allocateDirect.asFloatBuffer();
        }
        this.f4431D.clear();
        this.f4431D.put(fArr, i, i2);
        this.f4431D.flip();
        this.f4431D.position(0);
        float m2434b = c0711v.m2434b();
        int m2438a = c0711v.m2438a();
        if (m2434b == 0.0f) {
            m2434b = 1.0f;
        }
        m2485a(interfaceC0697h);
        m2504a(0, m2438a, m2434b);
        if (this.f4395R != null) {
            this.f4395R.m2513a(this.f4390M, this.f4394Q);
        }
        AbstractC0706q[] abstractC0706qArr = this.f4396e;
        int i3 = abstractC0706qArr[0].f4436a;
        GLES20.glEnableVertexAttribArray(i3);
        m2448o();
        GLES20.glVertexAttribPointer(i3, 2, 5126, false, 0, (Buffer) this.f4431D);
        m2477a(abstractC0706qArr, 0.0f, 0.0f, 1.0f, 1.0f, (InterfaceC0701l) null);
        GLES20.glDrawArrays(0, 0, i2 / 2);
        m2448o();
        GLES20.glDisableVertexAttribArray(i3);
        m2448o();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0700k
    /* renamed from: a */
    public void mo2495a(Bitmap bitmap) {
        if (this.f4378a != null) {
            this.f4378a.m2564b(bitmap);
        }
    }
}
