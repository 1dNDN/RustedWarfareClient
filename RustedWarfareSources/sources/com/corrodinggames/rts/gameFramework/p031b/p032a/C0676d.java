package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.opengl.GLES20;
import com.corrodinggames.rts.gameFramework.p031b.p032a.p033a.AbstractC0673b;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/d.class */
public class C0676d {

    /* renamed from: a */
    C0674b f4279a;

    /* renamed from: b */
    C0679g f4280b;

    /* renamed from: c */
    float[] f4281c;

    /* renamed from: e */
    int f4283e;

    /* renamed from: h */
    private float[] f4285h;

    /* renamed from: i */
    private int f4286i;

    /* renamed from: g */
    int f4287g;

    /* renamed from: d */
    int f4282d = 0;

    /* renamed from: f */
    int f4284f = 0;

    public C0676d(int i, AbstractC0673b abstractC0673b, C0674b c0674b) {
        this.f4279a = c0674b;
        this.f4281c = new float[i * 4 * 5];
        this.f4280b = new C0679g(i * 4, i * 6);
        this.f4283e = i;
        short[] sArr = new short[i * 6];
        int length = sArr.length;
        short s = 0;
        int i2 = 0;
        while (i2 < length) {
            sArr[i2 + 0] = (short) (s + 0);
            sArr[i2 + 1] = (short) (s + 1);
            sArr[i2 + 2] = (short) (s + 2);
            sArr[i2 + 3] = (short) (s + 2);
            sArr[i2 + 4] = (short) (s + 3);
            sArr[i2 + 5] = (short) (s + 0);
            i2 += 6;
            s = (short) (s + 4);
        }
        this.f4280b.m2574a(sArr, 0, length);
        this.f4286i = GLES20.glGetUniformLocation(abstractC0673b.m2609b(), "u_MVPMatrix");
    }

    /* renamed from: a */
    public void m2585a(float[] fArr) {
        this.f4284f = 0;
        this.f4282d = 0;
        this.f4285h = fArr;
        this.f4287g = -1;
    }

    /* renamed from: a */
    void m2586a(C0675c c0675c) {
        int i = c0675c.f4273b;
        if (this.f4287g == i) {
            return;
        }
        m2588a();
        GLES20.glBindTexture(3553, ((C0677e) this.f4279a.f4267s.get(i)).f4288a);
        this.f4287g = i;
    }

    /* renamed from: a */
    public void m2588a() {
        if (this.f4284f > 0) {
            GLES20.glUniformMatrix4fv(this.f4286i, 1, false, this.f4285h, 0);
            this.f4280b.m2575a(this.f4281c, 0, this.f4282d);
            this.f4280b.m2577a();
            this.f4280b.m2576a(4, 0, this.f4284f * 6);
            this.f4280b.m2573b();
            this.f4284f = 0;
            this.f4282d = 0;
        }
    }

    /* renamed from: a */
    public void m2587a(float f, float f2, float f3, float f4, C0675c c0675c) {
        if (this.f4284f == this.f4283e) {
            m2588a();
        }
        m2586a(c0675c);
        float f5 = f3 / 2.0f;
        float f6 = f4 / 2.0f;
        float f7 = f - f5;
        float f8 = f2 - f6;
        float f9 = f + f5;
        float f10 = f2 + f6;
        float[] fArr = this.f4281c;
        int i = this.f4282d;
        this.f4282d = i + 1;
        fArr[i] = f7;
        float[] fArr2 = this.f4281c;
        int i2 = this.f4282d;
        this.f4282d = i2 + 1;
        fArr2[i2] = f8;
        float[] fArr3 = this.f4281c;
        int i3 = this.f4282d;
        this.f4282d = i3 + 1;
        fArr3[i3] = c0675c.f4275d;
        float[] fArr4 = this.f4281c;
        int i4 = this.f4282d;
        this.f4282d = i4 + 1;
        fArr4[i4] = c0675c.f4278g;
        float[] fArr5 = this.f4281c;
        int i5 = this.f4282d;
        this.f4282d = i5 + 1;
        fArr5[i5] = f9;
        float[] fArr6 = this.f4281c;
        int i6 = this.f4282d;
        this.f4282d = i6 + 1;
        fArr6[i6] = f8;
        float[] fArr7 = this.f4281c;
        int i7 = this.f4282d;
        this.f4282d = i7 + 1;
        fArr7[i7] = c0675c.f4277f;
        float[] fArr8 = this.f4281c;
        int i8 = this.f4282d;
        this.f4282d = i8 + 1;
        fArr8[i8] = c0675c.f4278g;
        float[] fArr9 = this.f4281c;
        int i9 = this.f4282d;
        this.f4282d = i9 + 1;
        fArr9[i9] = f9;
        float[] fArr10 = this.f4281c;
        int i10 = this.f4282d;
        this.f4282d = i10 + 1;
        fArr10[i10] = f10;
        float[] fArr11 = this.f4281c;
        int i11 = this.f4282d;
        this.f4282d = i11 + 1;
        fArr11[i11] = c0675c.f4277f;
        float[] fArr12 = this.f4281c;
        int i12 = this.f4282d;
        this.f4282d = i12 + 1;
        fArr12[i12] = c0675c.f4276e;
        float[] fArr13 = this.f4281c;
        int i13 = this.f4282d;
        this.f4282d = i13 + 1;
        fArr13[i13] = f7;
        float[] fArr14 = this.f4281c;
        int i14 = this.f4282d;
        this.f4282d = i14 + 1;
        fArr14[i14] = f10;
        float[] fArr15 = this.f4281c;
        int i15 = this.f4282d;
        this.f4282d = i15 + 1;
        fArr15[i15] = c0675c.f4275d;
        float[] fArr16 = this.f4281c;
        int i16 = this.f4282d;
        this.f4282d = i16 + 1;
        fArr16[i16] = c0675c.f4276e;
        this.f4284f++;
    }
}
