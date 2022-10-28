package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.AbstractC0673b;
import com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.C0672a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/b.class */
public class C0674b {

    /* renamed from: a */
    AssetManager f4246a;

    /* renamed from: b */
    C0676d f4247b;

    /* renamed from: c */
    int f4248c;

    /* renamed from: d */
    int f4249d;

    /* renamed from: e */
    float f4250e;

    /* renamed from: f */
    float f4251f;

    /* renamed from: g */
    float f4252g;

    /* renamed from: h */
    float f4253h;

    /* renamed from: i */
    float f4254i;

    /* renamed from: j */
    int f4255j;

    /* renamed from: k */
    int f4256k;

    /* renamed from: l */
    int f4257l;

    /* renamed from: m */
    int f4258m;

    /* renamed from: n */
    float f4259n;

    /* renamed from: o */
    float f4260o;

    /* renamed from: p */
    float f4261p;

    /* renamed from: q */
    boolean f4262q;

    /* renamed from: x */
    private AbstractC0673b f4263x;

    /* renamed from: y */
    private int f4264y;

    /* renamed from: z */
    private int f4265z;

    /* renamed from: r */
    public Paint f4266r;

    /* renamed from: s */
    public ArrayList f4267s;

    /* renamed from: t */
    C0675c[][] f4268t;

    /* renamed from: u */
    boolean f4269u;

    /* renamed from: v */
    int f4270v;

    /* renamed from: w */
    public static boolean f4271w = true;

    /* renamed from: a */
    public C0675c m2625a(char c) {
        C0675c m2611b = m2611b(c);
        if (m2611b == null && this.f4269u) {
            m2610b("Loading glyph:" + c);
            m2608c(c);
            m2626a();
        }
        return m2611b;
    }

    /* renamed from: b */
    public C0675c m2611b(char c) {
        C0675c[] c0675cArr;
        if (c <= 65535 && (c0675cArr = this.f4268t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU]) != null) {
            return c0675cArr[c & 255];
        }
        return null;
    }

    /* renamed from: a */
    public void m2624a(char c, C0675c c0675c) {
        C0675c[] c0675cArr = this.f4268t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        if (c0675cArr == null) {
            c0675cArr = new C0675c[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_MEDIA_CONTEXT_MENU];
            this.f4268t[c / SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU] = c0675cArr;
        }
        c0675cArr[c & 255] = c0675c;
    }

    /* renamed from: c */
    public void m2608c(char c) {
        if (c > 65535) {
            return;
        }
        if (this.f4267s.size() == 0) {
            m2612b();
        }
        if (!((C0677e) this.f4267s.get(this.f4267s.size() - 1)).m2602a()) {
            if (this.f4267s.size() < this.f4270v) {
                m2612b();
            } else {
                return;
            }
        }
        m2624a(c, ((C0677e) this.f4267s.get(this.f4267s.size() - 1)).m2601a(c, this.f4266r));
    }

    /* renamed from: a */
    public void m2626a() {
        if (this.f4267s.size() > 0) {
            ((C0677e) this.f4267s.get(this.f4267s.size() - 1)).m2598c();
        }
    }

    /* renamed from: b */
    public void m2612b() {
        m2626a();
        this.f4267s.add(new C0677e(512, this.f4267s.size(), this.f4255j, this.f4256k, this.f4248c, this.f4249d));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.corrodinggames.rts.gameFramework.b.a.c[], com.corrodinggames.rts.gameFramework.b.a.c[][]] */
    public C0674b(AbstractC0673b abstractC0673b, AssetManager assetManager) {
        this.f4262q = true;
        this.f4267s = new ArrayList();
        this.f4268t = new C0675c[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        this.f4270v = Integer.MAX_VALUE;
        if (abstractC0673b == null) {
            abstractC0673b = new C0672a();
            abstractC0673b.mo2629a();
        }
        this.f4246a = assetManager;
        this.f4247b = new C0676d(24, abstractC0673b, this);
        this.f4248c = 0;
        this.f4249d = 0;
        this.f4250e = 0.0f;
        this.f4251f = 0.0f;
        this.f4252g = 0.0f;
        this.f4253h = 0.0f;
        this.f4254i = 0.0f;
        this.f4255j = 0;
        this.f4256k = 0;
        this.f4257l = 0;
        this.f4258m = 0;
        this.f4259n = 1.0f;
        this.f4260o = 1.0f;
        this.f4261p = 0.0f;
        this.f4263x = abstractC0673b;
        this.f4264y = GLES20.glGetUniformLocation(this.f4263x.m2627b(), "u_Color");
        this.f4265z = GLES20.glGetUniformLocation(this.f4263x.m2627b(), "u_Texture");
    }

    /* renamed from: a */
    public void m2613a(boolean z) {
        this.f4269u = z;
    }

    /* renamed from: a */
    public void m2620a(int i) {
        this.f4270v = i;
    }

    public C0674b(AssetManager assetManager) {
        this(null, assetManager);
    }

    /* renamed from: a */
    public boolean m2619a(Paint paint, int i, int i2, int i3) {
        if (this.f4266r != null) {
            throw new RuntimeException("Already loaded");
        }
        this.f4248c = i2;
        this.f4249d = i3;
        this.f4266r = paint;
        this.f4266r.mo900a(true);
        this.f4266r.mo899b(i);
        this.f4266r.m5349b(-1);
        Paint.FontMetrics m5326n = this.f4266r.m5326n();
        this.f4250e = (float) Math.ceil(Math.abs(m5326n.f208d) + Math.abs(m5326n.f205a));
        this.f4251f = (float) Math.ceil(Math.abs(m5326n.f206b));
        this.f4252g = (float) Math.ceil(Math.abs(m5326n.f207c));
        char[] cArr = new char[2];
        this.f4254i = 0.0f;
        this.f4253h = 0.0f;
        float[] fArr = new float[2];
        int i4 = 0;
        char c = ' ';
        while (true) {
            char c2 = c;
            if (c2 > '~') {
                break;
            }
            cArr[0] = c2;
            paint.m5351a(cArr, 0, 1, fArr);
            float f = fArr[0];
            if (f > this.f4253h) {
                this.f4253h = f;
            }
            i4++;
            c = (char) (c2 + 1);
        }
        this.f4254i = this.f4250e;
        this.f4255j = ((int) this.f4253h) + (2 * this.f4248c);
        this.f4256k = ((int) this.f4254i) + (2 * this.f4249d);
        char c3 = ' ';
        while (true) {
            char c4 = c3;
            if (c4 <= '~') {
                m2608c(c4);
                c3 = (char) (c4 + 1);
            } else {
                m2626a();
                return true;
            }
        }
    }

    /* renamed from: a */
    public void m2621a(float f, float f2, float f3, float f4, float[] fArr) {
        m2622a(f, f2, f3, f4);
        this.f4247b.m2603a(fArr);
    }

    /* renamed from: c */
    public static void m2609c() {
        int glGetError;
        if (f4271w && (glGetError = GLES20.glGetError()) != 0) {
            Log.m5216b("GLTEXT", "GL error: " + glGetError, new Throwable());
        }
    }

    /* renamed from: a */
    void m2622a(float f, float f2, float f3, float f4) {
        GLES20.glUseProgram(this.f4263x.m2627b());
        GLES20.glUniform4fv(this.f4264y, 1, new float[]{f, f2, f3, f4}, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glUniform1i(this.f4265z, 0);
        m2609c();
    }

    /* renamed from: d */
    public void m2607d() {
        this.f4247b.m2606a();
    }

    /* renamed from: a */
    public void m2614a(String str, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.f4256k * this.f4260o;
        float f8 = this.f4255j * this.f4259n;
        int length = str.length();
        float f9 = (f8 / 2.0f) - (this.f4248c * this.f4259n);
        float f10 = ((f7 / 2.0f) - (this.f4249d * this.f4260o)) - (this.f4252g * this.f4260o);
        if (this.f4262q) {
            f9 = (int) f9;
            f10 = (int) f10;
        }
        float f11 = f + f9;
        float f12 = f2 + f10;
        boolean z = false;
        if (f3 == 0.0f && f6 == 0.0f && f4 == 0.0f && f5 == 0.0f) {
            z = true;
        } else {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            Matrix.translateM(fArr, 0, f11, f12, f3);
            if (f6 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
                Matrix.rotateM(fArr, 0, f6, 0.0f, 0.0f, 1.0f);
                Matrix.rotateM(fArr, 0, f4, 1.0f, 0.0f, 0.0f);
                Matrix.rotateM(fArr, 0, f5, 0.0f, 1.0f, 0.0f);
            }
        }
        float f13 = 0.0f;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int i2 = charAt - ' ';
            if (i2 < 0 || i2 >= 96) {
            }
            float f14 = f13;
            float f15 = 0.0f;
            if (z) {
                f14 += f11;
                f15 = 0.0f + f12;
            }
            C0675c m2625a = m2625a(charAt);
            if (m2625a != null) {
                this.f4247b.m2605a(f14, f15, f8, f7, m2625a);
                float f16 = (m2625a.f4274c + this.f4261p) * this.f4259n;
                if (this.f4262q) {
                    f16 = (int) (f16 + 0.95f);
                }
                f13 += f16;
            }
        }
    }

    /* renamed from: a */
    public void m2615a(String str, float f, float f2, float f3, float f4) {
        m2614a(str, f, f2, f3, 0.0f, 0.0f, f4);
    }

    /* renamed from: a */
    public void m2616a(String str, float f, float f2, float f3) {
        m2615a(str, f, f2, 0.0f, f3);
    }

    /* renamed from: a */
    public void m2617a(String str, float f, float f2) {
        m2615a(str, f, f2, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public void m2623a(float f) {
        this.f4260o = f;
        this.f4259n = f;
    }

    /* renamed from: a */
    public float m2618a(String str) {
        float f = 0.0f;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            C0675c m2611b = m2611b(str.charAt(i));
            if (m2611b != null) {
                f += m2611b.f4274c * this.f4259n;
            }
        }
        return f + (length > 1 ? (length - 1) * this.f4261p * this.f4259n : 0.0f);
    }

    /* renamed from: b */
    public static void m2610b(String str) {
        Log.LogDebug("GLTEXT", "debug:" + str);
    }
}
