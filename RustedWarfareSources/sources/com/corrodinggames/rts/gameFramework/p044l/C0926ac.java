package com.corrodinggames.rts.gameFramework.p044l;

import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

/* renamed from: com.corrodinggames.rts.gameFramework.l.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/ac.class */
class C0926ac {

    /* renamed from: b */
    private FloatBuffer f6327b;

    /* renamed from: c */
    private FloatBuffer f6328c;

    /* renamed from: d */
    private FloatBuffer f6329d;

    /* renamed from: e */
    private IntBuffer f6330e;

    /* renamed from: f */
    private IntBuffer f6331f;

    /* renamed from: g */
    private IntBuffer f6332g;

    /* renamed from: h */
    private CharBuffer f6333h;

    /* renamed from: i */
    private Buffer f6334i;

    /* renamed from: j */
    private Buffer f6335j;

    /* renamed from: k */
    private Buffer f6336k;

    /* renamed from: l */
    private int f6337l;

    /* renamed from: m */
    private int f6338m;

    /* renamed from: n */
    private int f6339n;

    /* renamed from: o */
    private int f6340o;

    /* renamed from: p */
    private boolean f6341p;

    /* renamed from: q */
    private int f6342q;

    /* renamed from: r */
    private int f6343r;

    /* renamed from: s */
    private int f6344s;

    /* renamed from: t */
    private int f6345t;

    /* renamed from: a */
    static final /* synthetic */ boolean f6346a;

    static {
        f6346a = !C0926ac.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m917a(int i, int i2, float f, float f2) {
        if (i < 0 || i >= this.f6338m) {
            throw new IllegalArgumentException("i");
        }
        if (i2 < 0 || i2 >= this.f6339n) {
            throw new IllegalArgumentException("j");
        }
        int i3 = ((this.f6338m * i2) + i) * 2;
        if (this.f6337l == 5126) {
            this.f6328c.put(i3, f);
            this.f6328c.put(i3 + 1, f2);
            return;
        }
        this.f6331f.put(i3, (int) (f * 65536.0f));
        this.f6331f.put(i3 + 1, (int) (f2 * 65536.0f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m916a(int i, int i2, float f, float f2, float f3, float f4, float f5, float[] fArr) {
        if (i < 0 || i >= this.f6338m) {
            throw new IllegalArgumentException("i");
        }
        if (i2 < 0 || i2 >= this.f6339n) {
            throw new IllegalArgumentException("j");
        }
        int i3 = (this.f6338m * i2) + i;
        int i4 = i3 * 3;
        int i5 = i3 * 2;
        int i6 = i3 * 4;
        if (this.f6337l == 5126) {
            this.f6327b.put(i4, f);
            this.f6327b.put(i4 + 1, f2);
            this.f6327b.put(i4 + 2, f3);
            this.f6328c.put(i5, f4);
            this.f6328c.put(i5 + 1, f5);
            if (fArr != null) {
                this.f6329d.put(i6, fArr[0]);
                this.f6329d.put(i6 + 1, fArr[1]);
                this.f6329d.put(i6 + 2, fArr[2]);
                this.f6329d.put(i6 + 3, fArr[3]);
                return;
            }
            return;
        }
        this.f6330e.put(i4, (int) (f * 65536.0f));
        this.f6330e.put(i4 + 1, (int) (f2 * 65536.0f));
        this.f6330e.put(i4 + 2, (int) (f3 * 65536.0f));
        this.f6331f.put(i5, (int) (f4 * 65536.0f));
        this.f6331f.put(i5 + 1, (int) (f5 * 65536.0f));
        if (fArr != null) {
            this.f6332g.put(i6, (int) (fArr[0] * 65536.0f));
            this.f6332g.put(i6 + 1, (int) (fArr[1] * 65536.0f));
            this.f6332g.put(i6 + 2, (int) (fArr[2] * 65536.0f));
            this.f6332g.put(i6 + 3, (int) (fArr[3] * 65536.0f));
        }
    }

    /* renamed from: a */
    public static void m914a(GL10 gl10, boolean z, boolean z2) {
        gl10.glEnableClientState(32884);
        if (z) {
            gl10.glEnableClientState(32888);
            gl10.glEnable(3553);
        } else {
            gl10.glDisableClientState(32888);
            gl10.glDisable(3553);
        }
        if (z2) {
            gl10.glEnableClientState(32886);
        } else {
            gl10.glDisableClientState(32886);
        }
    }

    /* renamed from: b */
    public void m913b(GL10 gl10, boolean z, boolean z2) {
        if (!this.f6341p) {
            gl10.glVertexPointer(3, this.f6337l, 0, this.f6334i);
            if (z) {
                gl10.glTexCoordPointer(2, this.f6337l, 0, this.f6335j);
            }
            if (z2) {
                gl10.glColorPointer(4, this.f6337l, 0, this.f6336k);
            }
            gl10.glDrawElements(4, this.f6340o, 5123, this.f6333h);
            return;
        }
        GL11 gl11 = (GL11) gl10;
        gl11.glBindBuffer(34962, this.f6342q);
        gl11.glVertexPointer(3, this.f6337l, 0, 0);
        if (z) {
            gl11.glBindBuffer(34962, this.f6344s);
            gl11.glTexCoordPointer(2, this.f6337l, 0, 0);
        }
        if (z2) {
            gl11.glBindBuffer(34962, this.f6345t);
            gl11.glColorPointer(4, this.f6337l, 0, 0);
        }
        gl11.glBindBuffer(34963, this.f6343r);
        gl11.glDrawElements(4, this.f6340o, 5123, 0);
        gl11.glBindBuffer(34962, 0);
        gl11.glBindBuffer(34963, 0);
    }

    /* renamed from: a */
    public static void m915a(GL10 gl10) {
        gl10.glDisableClientState(32884);
    }
}
