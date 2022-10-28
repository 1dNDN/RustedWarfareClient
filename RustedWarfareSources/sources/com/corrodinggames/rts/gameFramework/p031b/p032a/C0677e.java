package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/e.class */
public class C0677e {

    /* renamed from: a */
    int f4288a;

    /* renamed from: b */
    int f4289b;

    /* renamed from: c */
    Canvas f4290c;

    /* renamed from: d */
    public Bitmap f4291d;

    /* renamed from: e */
    int f4292e;

    /* renamed from: f */
    int f4293f;

    /* renamed from: g */
    int f4294g = 0;

    /* renamed from: h */
    int f4295h = 0;

    /* renamed from: i */
    int f4296i = 0;

    /* renamed from: j */
    int f4297j;

    /* renamed from: k */
    int f4298k;

    /* renamed from: l */
    int f4299l;

    /* renamed from: m */
    int f4300m;

    /* renamed from: n */
    int f4301n;

    /* renamed from: a */
    public boolean m2584a() {
        return this.f4294g < this.f4292e * this.f4293f;
    }

    public C0677e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f4299l = i2;
        this.f4289b = i;
        this.f4292e = i / i3;
        this.f4293f = i / i4;
        this.f4297j = i3;
        this.f4298k = i4;
        this.f4300m = i5;
        this.f4301n = i6;
    }

    /* renamed from: b */
    public void m2581b() {
        this.f4291d = Bitmap.m5147a(this.f4289b, this.f4289b, Bitmap.Config.ALPHA_8);
        this.f4290c = new Canvas();
        this.f4290c.m5121a(this.f4291d);
        this.f4291d.m5151a(0);
    }

    /* renamed from: c */
    public void m2580c() {
        if (this.f4291d == null) {
            return;
        }
        if (this.f4288a == 0) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            this.f4288a = iArr[0];
            if (this.f4288a == 0) {
                C0674b.m2592b("Failed to gen texture page");
                return;
            }
        }
        GLES20.glBindTexture(3553, this.f4288a);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLUtils.texImage2D(3553, 0, this.f4291d, 0);
    }

    /* renamed from: a */
    public C0675c m2583a(char c, Paint paint) {
        if (this.f4290c == null) {
            m2581b();
        }
        int i = this.f4294g / this.f4292e;
        int i2 = (this.f4294g % this.f4292e) * this.f4297j;
        int i3 = i * this.f4298k;
        float ceil = (float) Math.ceil(Math.abs(paint.m5046n().f207c));
        float[] fArr = new float[2];
        char[] cArr = {c};
        paint.m5071a(cArr, 0, 1, fArr);
        float f = (int) fArr[0];
        if (f > this.f4297j) {
            C0674b.m2592b("Warning chr is larger then cellWidth: " + c);
        }
        this.f4290c.m5112a(cArr, 0, 1, i2 + this.f4300m, (int) (((i3 + this.f4298k) - ceil) - this.f4301n), paint);
        C0675c c0675c = new C0675c();
        c0675c.f4272a = c;
        c0675c.f4273b = this.f4299l;
        m2582a(c0675c, i2, i3, this.f4297j, this.f4298k);
        c0675c.f4274c = f;
        this.f4294g++;
        return c0675c;
    }

    /* renamed from: a */
    private void m2582a(C0675c c0675c, float f, float f2, float f3, float f4) {
        c0675c.f4275d = f / this.f4289b;
        c0675c.f4276e = f2 / this.f4289b;
        c0675c.f4277f = c0675c.f4275d + (f3 / this.f4289b);
        c0675c.f4278g = c0675c.f4276e + (f4 / this.f4289b);
    }
}
