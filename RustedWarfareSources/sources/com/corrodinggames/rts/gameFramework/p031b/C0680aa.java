package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.corrodinggames.rts.gameFramework.b.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/aa.class */
public class C0680aa {

    /* renamed from: a */
    public final FloatBuffer f4312a;

    /* renamed from: b */
    public final ShortBuffer f4313b;

    /* renamed from: c */
    public int f4314c;

    /* renamed from: d */
    public int f4315d;

    /* renamed from: e */
    int[] f4316e;

    /* renamed from: f */
    int f4317f;

    /* renamed from: g */
    final /* synthetic */ C0714y f4318g;

    /* renamed from: a */
    public void m2570a(float[] fArr, int i, int i2) {
        this.f4312a.clear();
        int i3 = i + i2;
        this.f4312a.put(fArr, 0, i2);
        this.f4312a.flip();
        this.f4315d = i2;
    }

    /* renamed from: a */
    public void m2572a() {
        GLES20.glEnableVertexAttribArray(this.f4318g.f4458j.f4467a.f4436a);
        GLES20.glEnableVertexAttribArray(this.f4318g.f4458j.f4468b.f4436a);
        GLES20.glEnableVertexAttribArray(this.f4318g.f4458j.f4469c.f4436a);
    }

    /* renamed from: b */
    public void m2569b() {
        C0703n.m2448o();
        if (this.f4316e == null) {
            this.f4316e = new int[1];
            GLES20.glGenBuffers(1, this.f4316e, 0);
            C0703n.m2447p();
        }
        this.f4317f++;
        if (this.f4317f >= 1) {
            this.f4317f = 0;
        }
        GLES20.glBindBuffer(34962, this.f4316e[this.f4317f]);
        GLES20.glBufferData(34962, this.f4315d * 4, this.f4312a, 35040);
        GLES20.glVertexAttribPointer(this.f4318g.f4458j.f4467a.f4436a, 2, 5126, false, 32, 0);
        C0703n.m2448o();
        GLES20.glVertexAttribPointer(this.f4318g.f4458j.f4468b.f4436a, 2, 5126, false, 32, 8);
        C0703n.m2448o();
        GLES20.glVertexAttribPointer(this.f4318g.f4458j.f4469c.f4436a, 4, 5126, false, 32, 16);
        C0703n.m2448o();
    }

    /* renamed from: a */
    public void m2571a(int i, int i2, int i3) {
        if (this.f4313b != null) {
            GLES20.glDrawElements(i, i3, 5123, 0);
        } else {
            GLES20.glDrawArrays(i, i2, i3);
        }
    }

    /* renamed from: c */
    public void m2568c() {
        GLES20.glBindBuffer(34962, 0);
    }

    /* renamed from: d */
    public void m2567d() {
        GLES20.glBindBuffer(34963, this.f4314c);
        m2572a();
    }

    /* renamed from: e */
    public void m2566e() {
        GLES20.glDisableVertexAttribArray(this.f4318g.f4458j.f4468b.f4436a);
        GLES20.glDisableVertexAttribArray(this.f4318g.f4458j.f4469c.f4436a);
        GLES20.glBindBuffer(34963, 0);
    }
}
