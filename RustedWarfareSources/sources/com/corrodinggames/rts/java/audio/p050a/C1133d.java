package com.corrodinggames.rts.java.audio.p050a;

/* renamed from: com.corrodinggames.rts.java.audio.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/d.class */
public class C1133d {

    /* renamed from: a */
    public int[] f7009a;

    /* renamed from: b */
    public int f7010b;

    /* renamed from: c */
    public boolean f7011c;

    public C1133d() {
        this(true, 16);
    }

    public C1133d(boolean z, int i) {
        this.f7011c = z;
        this.f7009a = new int[i];
    }

    public C1133d(C1133d c1133d) {
        this.f7011c = c1133d.f7011c;
        this.f7010b = c1133d.f7010b;
        this.f7009a = new int[this.f7010b];
        System.arraycopy(c1133d.f7009a, 0, this.f7009a, 0, this.f7010b);
    }

    /* renamed from: a */
    public void m373a(int i) {
        int[] iArr = this.f7009a;
        if (this.f7010b == iArr.length) {
            iArr = m370d(Math.max(8, (int) (this.f7010b * 1.75f)));
        }
        int i2 = this.f7010b;
        this.f7010b = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    public int m372b(int i) {
        if (i >= this.f7010b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f7010b);
        }
        return this.f7009a[i];
    }

    /* renamed from: c */
    public int m371c(int i) {
        if (i >= this.f7010b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f7010b);
        }
        int[] iArr = this.f7009a;
        int i2 = iArr[i];
        this.f7010b--;
        if (this.f7011c) {
            System.arraycopy(iArr, i + 1, iArr, i, this.f7010b - i);
        } else {
            iArr[i] = iArr[this.f7010b];
        }
        return i2;
    }

    /* renamed from: d */
    protected int[] m370d(int i) {
        int[] iArr = new int[i];
        System.arraycopy(this.f7009a, 0, iArr, 0, Math.min(this.f7010b, iArr.length));
        this.f7009a = iArr;
        return iArr;
    }

    public int hashCode() {
        if (this.f7011c) {
            int[] iArr = this.f7009a;
            int i = 1;
            int i2 = this.f7010b;
            for (int i3 = 0; i3 < i2; i3++) {
                i = (i * 31) + iArr[i3];
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
        if (this.f7011c && (obj instanceof C1133d)) {
            C1133d c1133d = (C1133d) obj;
            if (c1133d.f7011c && (i = this.f7010b) == c1133d.f7010b) {
                int[] iArr = this.f7009a;
                int[] iArr2 = c1133d.f7009a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.f7009a[i2] != c1133d.f7009a[i2]) {
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
        if (this.f7010b == 0) {
            return "[]";
        }
        int[] iArr = this.f7009a;
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        sb.append(iArr[0]);
        for (int i = 1; i < this.f7010b; i++) {
            sb.append(", ");
            sb.append(iArr[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}
