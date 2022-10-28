package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;

/* renamed from: com.corrodinggames.rts.gameFramework.b.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/y.class */
public class C0714y {

    /* renamed from: a */
    C0680aa f4449a;

    /* renamed from: b */
    float[] f4450b;

    /* renamed from: c */
    int f4451c;

    /* renamed from: d */
    int f4452d;

    /* renamed from: e */
    int f4453e;

    /* renamed from: f */
    C0703n f4454f;

    /* renamed from: g */
    int f4455g;

    /* renamed from: h */
    C0692d f4456h;

    /* renamed from: i */
    final C0715z f4457i;

    /* renamed from: j */
    public C0715z f4458j;

    /* renamed from: k */
    AbstractC0690b f4459k;

    /* renamed from: l */
    C0928ae f4460l;

    /* renamed from: m */
    boolean f4461m;

    /* renamed from: n */
    int f4462n;

    /* renamed from: o */
    float f4463o;

    /* renamed from: p */
    float f4464p;

    /* renamed from: q */
    float f4465q;

    /* renamed from: r */
    float f4466r;

    /* renamed from: a */
    public void m2421a(C0928ae c0928ae) {
        this.f4453e = 0;
        this.f4451c = 0;
        this.f4459k = null;
        m2419b(c0928ae);
        m2425a();
        C0703n.m2448o();
        this.f4449a.m2567d();
    }

    /* renamed from: a */
    public void m2425a() {
        this.f4458j.f4470d.m2442a(this.f4454f.f4387d);
    }

    /* renamed from: b */
    public void m2420b() {
        this.f4461m = true;
    }

    /* renamed from: b */
    void m2419b(C0928ae c0928ae) {
        if (c0928ae != null) {
            this.f4454f.m2506a(c0928ae.f6359n);
            this.f4454f.m2462c(c0928ae);
            this.f4461m = false;
        } else {
            this.f4454f.m2506a(this.f4455g);
        }
        this.f4460l = c0928ae;
    }

    /* renamed from: a */
    void m2423a(AbstractC0690b abstractC0690b) {
        int m2553a;
        if (this.f4459k == abstractC0690b) {
            return;
        }
        if (this.f4459k != null && (m2553a = this.f4459k.m2553a()) == abstractC0690b.m2553a() && m2553a != -1) {
            return;
        }
        m2418c();
        GLES20.glActiveTexture(33984);
        C0703n.m2448o();
        abstractC0690b.mo2429c(this.f4454f);
        GLES20.glBindTexture(abstractC0690b.mo2428g(), abstractC0690b.m2553a());
        C0703n.m2448o();
        GLES20.glUniform1i(this.f4458j.f4471e.f4436a, 0);
        C0703n.m2448o();
        this.f4459k = abstractC0690b;
    }

    /* renamed from: c */
    public void m2418c() {
        if (this.f4453e > 0) {
            C0703n.m2448o();
            this.f4449a.m2570a(this.f4450b, 0, this.f4451c);
            this.f4449a.m2569b();
            C0703n.m2448o();
            this.f4449a.m2571a(4, 0, this.f4453e * 6);
            this.f4449a.m2568c();
            C0703n.m2448o();
            this.f4453e = 0;
            this.f4451c = 0;
        }
    }

    /* renamed from: d */
    public void m2417d() {
        m2418c();
        this.f4459k = null;
        this.f4449a.m2566e();
    }

    /* renamed from: a */
    public void m2424a(int i) {
        if (this.f4462n == i) {
            return;
        }
        this.f4462n = i;
        float f = ((i >>> 24) & 255) * 0.003921569f * 1.0f;
        float f2 = ((i >>> 16) & 255) * 0.003921569f * f;
        this.f4463o = f2;
        this.f4464p = ((i >>> 8) & 255) * 0.003921569f * f;
        this.f4465q = (i & 255) * 0.003921569f * f;
        this.f4466r = f;
    }

    /* renamed from: a */
    public void m2422a(AbstractC0690b abstractC0690b, RectF rectF, RectF rectF2, float[] fArr) {
        if (this.f4453e == this.f4452d) {
            m2418c();
        }
        m2423a(abstractC0690b);
        if (this.f4461m && this.f4460l != null) {
            this.f4454f.m2462c(this.f4460l);
            this.f4461m = false;
        }
        float f = rectF2.f234a;
        float f2 = rectF2.f237d;
        float f3 = rectF2.f236c;
        float f4 = rectF2.f235b;
        float f5 = rectF.f234a;
        float f6 = rectF.f235b;
        float f7 = rectF.f236c;
        float f8 = rectF.f237d;
        float f9 = this.f4463o;
        float f10 = this.f4464p;
        float f11 = this.f4465q;
        float f12 = this.f4466r;
        float f13 = fArr[0];
        float f14 = fArr[4];
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float[] fArr2 = this.f4450b;
        int i = this.f4451c;
        this.f4451c = i + 1;
        fArr2[i] = (f * f13) + (f2 * f14) + f17;
        float[] fArr3 = this.f4450b;
        int i2 = this.f4451c;
        this.f4451c = i2 + 1;
        fArr3[i2] = (f * f15) + (f2 * f16) + f18;
        float[] fArr4 = this.f4450b;
        int i3 = this.f4451c;
        this.f4451c = i3 + 1;
        fArr4[i3] = f5;
        float[] fArr5 = this.f4450b;
        int i4 = this.f4451c;
        this.f4451c = i4 + 1;
        fArr5[i4] = f8;
        float[] fArr6 = this.f4450b;
        int i5 = this.f4451c;
        this.f4451c = i5 + 1;
        fArr6[i5] = f9;
        float[] fArr7 = this.f4450b;
        int i6 = this.f4451c;
        this.f4451c = i6 + 1;
        fArr7[i6] = f10;
        float[] fArr8 = this.f4450b;
        int i7 = this.f4451c;
        this.f4451c = i7 + 1;
        fArr8[i7] = f11;
        float[] fArr9 = this.f4450b;
        int i8 = this.f4451c;
        this.f4451c = i8 + 1;
        fArr9[i8] = f12;
        float[] fArr10 = this.f4450b;
        int i9 = this.f4451c;
        this.f4451c = i9 + 1;
        fArr10[i9] = (f3 * f13) + (f2 * f14) + f17;
        float[] fArr11 = this.f4450b;
        int i10 = this.f4451c;
        this.f4451c = i10 + 1;
        fArr11[i10] = (f3 * f15) + (f2 * f16) + f18;
        float[] fArr12 = this.f4450b;
        int i11 = this.f4451c;
        this.f4451c = i11 + 1;
        fArr12[i11] = f7;
        float[] fArr13 = this.f4450b;
        int i12 = this.f4451c;
        this.f4451c = i12 + 1;
        fArr13[i12] = f8;
        float[] fArr14 = this.f4450b;
        int i13 = this.f4451c;
        this.f4451c = i13 + 1;
        fArr14[i13] = f9;
        float[] fArr15 = this.f4450b;
        int i14 = this.f4451c;
        this.f4451c = i14 + 1;
        fArr15[i14] = f10;
        float[] fArr16 = this.f4450b;
        int i15 = this.f4451c;
        this.f4451c = i15 + 1;
        fArr16[i15] = f11;
        float[] fArr17 = this.f4450b;
        int i16 = this.f4451c;
        this.f4451c = i16 + 1;
        fArr17[i16] = f12;
        float[] fArr18 = this.f4450b;
        int i17 = this.f4451c;
        this.f4451c = i17 + 1;
        fArr18[i17] = (f3 * f13) + (f4 * f14) + f17;
        float[] fArr19 = this.f4450b;
        int i18 = this.f4451c;
        this.f4451c = i18 + 1;
        fArr19[i18] = (f3 * f15) + (f4 * f16) + f18;
        float[] fArr20 = this.f4450b;
        int i19 = this.f4451c;
        this.f4451c = i19 + 1;
        fArr20[i19] = f7;
        float[] fArr21 = this.f4450b;
        int i20 = this.f4451c;
        this.f4451c = i20 + 1;
        fArr21[i20] = f6;
        float[] fArr22 = this.f4450b;
        int i21 = this.f4451c;
        this.f4451c = i21 + 1;
        fArr22[i21] = f9;
        float[] fArr23 = this.f4450b;
        int i22 = this.f4451c;
        this.f4451c = i22 + 1;
        fArr23[i22] = f10;
        float[] fArr24 = this.f4450b;
        int i23 = this.f4451c;
        this.f4451c = i23 + 1;
        fArr24[i23] = f11;
        float[] fArr25 = this.f4450b;
        int i24 = this.f4451c;
        this.f4451c = i24 + 1;
        fArr25[i24] = f12;
        float[] fArr26 = this.f4450b;
        int i25 = this.f4451c;
        this.f4451c = i25 + 1;
        fArr26[i25] = (f * f13) + (f4 * f14) + f17;
        float[] fArr27 = this.f4450b;
        int i26 = this.f4451c;
        this.f4451c = i26 + 1;
        fArr27[i26] = (f * f15) + (f4 * f16) + f18;
        float[] fArr28 = this.f4450b;
        int i27 = this.f4451c;
        this.f4451c = i27 + 1;
        fArr28[i27] = f5;
        float[] fArr29 = this.f4450b;
        int i28 = this.f4451c;
        this.f4451c = i28 + 1;
        fArr29[i28] = f6;
        float[] fArr30 = this.f4450b;
        int i29 = this.f4451c;
        this.f4451c = i29 + 1;
        fArr30[i29] = f9;
        float[] fArr31 = this.f4450b;
        int i30 = this.f4451c;
        this.f4451c = i30 + 1;
        fArr31[i30] = f10;
        float[] fArr32 = this.f4450b;
        int i31 = this.f4451c;
        this.f4451c = i31 + 1;
        fArr32[i31] = f11;
        float[] fArr33 = this.f4450b;
        int i32 = this.f4451c;
        this.f4451c = i32 + 1;
        fArr33[i32] = f12;
        this.f4453e++;
    }
}
