package com.corrodinggames.rts.gameFramework.p031b.p032a;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/g.class */
public class C0679g {

    /* renamed from: a */
    public final int f4302a = 2;

    /* renamed from: b */
    public final int f4303b = this.f4302a + 2;

    /* renamed from: c */
    public final int f4304c = this.f4303b * 4;

    /* renamed from: d */
    public final IntBuffer f4305d;

    /* renamed from: e */
    public final ShortBuffer f4306e;

    /* renamed from: f */
    public int f4307f;

    /* renamed from: g */
    public int f4308g;

    /* renamed from: h */
    final int[] f4309h;

    /* renamed from: i */
    private int f4310i;

    /* renamed from: j */
    private int f4311j;

    public C0679g(int i, int i2) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * this.f4304c);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f4305d = allocateDirect.asIntBuffer();
        if (i2 > 0) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i2 * 2);
            allocateDirect2.order(ByteOrder.nativeOrder());
            this.f4306e = allocateDirect2.asShortBuffer();
        } else {
            this.f4306e = null;
        }
        this.f4307f = 0;
        this.f4308g = 0;
        this.f4309h = new int[(i * this.f4304c) / 4];
        this.f4310i = EnumC0671a.A_TexCoordinate.m2613a();
        this.f4311j = EnumC0671a.A_Position.m2613a();
    }

    /* renamed from: a */
    public void m2575a(float[] fArr, int i, int i2) {
        this.f4305d.clear();
        int i3 = i + i2;
        int i4 = i;
        int i5 = 0;
        while (i4 < i3) {
            this.f4309h[i5] = Float.floatToRawIntBits(fArr[i4]);
            i4++;
            i5++;
        }
        this.f4305d.put(this.f4309h, 0, i2);
        this.f4305d.flip();
        this.f4307f = i2 / this.f4303b;
    }

    /* renamed from: a */
    public void m2574a(short[] sArr, int i, int i2) {
        this.f4306e.clear();
        this.f4306e.put(sArr, i, i2);
        this.f4306e.flip();
        this.f4308g = i2;
    }

    /* renamed from: a */
    public void m2577a() {
        this.f4305d.position(0);
        GLES20.glVertexAttribPointer(this.f4311j, this.f4302a, 5126, false, this.f4304c, (Buffer) this.f4305d);
        GLES20.glEnableVertexAttribArray(this.f4311j);
        this.f4305d.position(this.f4302a);
        GLES20.glVertexAttribPointer(this.f4310i, 2, 5126, false, this.f4304c, (Buffer) this.f4305d);
        GLES20.glEnableVertexAttribArray(this.f4310i);
    }

    /* renamed from: a */
    public void m2576a(int i, int i2, int i3) {
        if (this.f4306e != null) {
            this.f4306e.position(i2);
            GLES20.glDrawElements(i, i3, 5123, this.f4306e);
            return;
        }
        GLES20.glDrawArrays(i, i2, i3);
    }

    /* renamed from: b */
    public void m2573b() {
        GLES20.glDisableVertexAttribArray(this.f4310i);
    }
}
