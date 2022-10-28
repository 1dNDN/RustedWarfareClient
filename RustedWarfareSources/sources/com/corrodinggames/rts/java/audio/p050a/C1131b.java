package com.corrodinggames.rts.java.audio.p050a;

/* renamed from: com.corrodinggames.rts.java.audio.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/b.class */
public class C1131b {

    /* renamed from: a */
    public float[] f7006a;

    /* renamed from: b */
    public int f7007b;

    /* renamed from: c */
    public boolean f7008c;

    public C1131b() {
        this(true, 16);
    }

    public C1131b(int i) {
        this(true, i);
    }

    public C1131b(boolean z, int i) {
        this.f7008c = z;
        this.f7006a = new float[i];
    }

    /* renamed from: a */
    public void m379a(float f) {
        float[] fArr = this.f7006a;
        if (this.f7007b == fArr.length) {
            fArr = m378a(Math.max(8, (int) (this.f7007b * 1.75f)));
        }
        int i = this.f7007b;
        this.f7007b = i + 1;
        fArr[i] = f;
    }

    /* renamed from: a */
    public void m377a(int i, float f) {
        if (i >= this.f7007b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f7007b);
        }
        this.f7006a[i] = f;
    }

    /* renamed from: b */
    public void m375b(int i, float f) {
        if (i > this.f7007b) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i + " > " + this.f7007b);
        }
        float[] fArr = this.f7006a;
        if (this.f7007b == fArr.length) {
            fArr = m378a(Math.max(8, (int) (this.f7007b * 1.75f)));
        }
        if (this.f7008c) {
            System.arraycopy(fArr, i, fArr, i + 1, this.f7007b - i);
        } else {
            fArr[this.f7007b] = fArr[i];
        }
        this.f7007b++;
        fArr[i] = f;
    }

    /* renamed from: a */
    public float m380a() {
        float[] fArr = this.f7006a;
        int i = this.f7007b - 1;
        this.f7007b = i;
        return fArr[i];
    }

    /* renamed from: b */
    public float m376b() {
        if (this.f7007b == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        return this.f7006a[0];
    }

    /* renamed from: c */
    public void m374c() {
        this.f7007b = 0;
    }

    /* renamed from: a */
    protected float[] m378a(int i) {
        float[] fArr = new float[i];
        System.arraycopy(this.f7006a, 0, fArr, 0, Math.min(this.f7007b, fArr.length));
        this.f7006a = fArr;
        return fArr;
    }

    public int hashCode() {
        if (this.f7008c) {
            float[] fArr = this.f7006a;
            int i = 1;
            int i2 = this.f7007b;
            for (int i3 = 0; i3 < i2; i3++) {
                i = (i * 31) + Float.floatToIntBits(fArr[i3]);
            }
            return i;
        }
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (this.f7008c && (obj instanceof C1131b)) {
            C1131b c1131b = (C1131b) obj;
            if (c1131b.f7008c && (i = this.f7007b) == c1131b.f7007b) {
                float[] fArr = this.f7006a;
                float[] fArr2 = c1131b.f7006a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (fArr[i2] != fArr2[i2]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        if (this.f7007b == 0) {
            return "[]";
        }
        float[] fArr = this.f7006a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(fArr[0]);
        for (int i = 1; i < this.f7007b; i++) {
            sb.append(", ");
            sb.append(fArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}
