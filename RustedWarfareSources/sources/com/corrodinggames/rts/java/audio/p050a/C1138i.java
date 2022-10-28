package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/i.class */
public class C1138i implements Iterable {

    /* renamed from: a */
    public int f7035a;

    /* renamed from: b */
    long[] f7036b;

    /* renamed from: c */
    Object[] f7037c;

    /* renamed from: d */
    int f7038d;

    /* renamed from: e */
    int f7039e;

    /* renamed from: f */
    Object f7040f;

    /* renamed from: g */
    boolean f7041g;

    /* renamed from: h */
    private float f7042h;

    /* renamed from: i */
    private int f7043i;

    /* renamed from: j */
    private int f7044j;

    /* renamed from: k */
    private int f7045k;

    /* renamed from: l */
    private int f7046l;

    /* renamed from: m */
    private int f7047m;

    /* renamed from: n */
    private C1139j f7048n;

    /* renamed from: o */
    private C1139j f7049o;

    public C1138i() {
        this(51, 0.8f);
    }

    public C1138i(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int m327b = C1142m.m327b((int) Math.ceil(i / f));
        if (m327b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + m327b);
        }
        this.f7038d = m327b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f7042h = f;
        this.f7045k = (int) (this.f7038d * f);
        this.f7044j = this.f7038d - 1;
        this.f7043i = 63 - Long.numberOfTrailingZeros(this.f7038d);
        this.f7046l = Math.max(3, ((int) Math.ceil(Math.log(this.f7038d))) * 2);
        this.f7047m = Math.max(Math.min(this.f7038d, 8), ((int) Math.sqrt(this.f7038d)) / 8);
        this.f7036b = new long[this.f7038d + this.f7046l];
        this.f7037c = new Object[this.f7036b.length];
    }

    /* renamed from: a */
    public Object m347a(long j, Object obj) {
        if (j == 0) {
            Object obj2 = this.f7040f;
            this.f7040f = obj;
            if (!this.f7041g) {
                this.f7041g = true;
                this.f7035a++;
            }
            return obj2;
        }
        long[] jArr = this.f7036b;
        int i = (int) (j & this.f7044j);
        long j2 = jArr[i];
        if (j2 == j) {
            Object obj3 = this.f7037c[i];
            this.f7037c[i] = obj;
            return obj3;
        }
        int m336f = m336f(j);
        long j3 = jArr[m336f];
        if (j3 == j) {
            Object obj4 = this.f7037c[m336f];
            this.f7037c[m336f] = obj;
            return obj4;
        }
        int m335g = m335g(j);
        long j4 = jArr[m335g];
        if (j4 == j) {
            Object obj5 = this.f7037c[m335g];
            this.f7037c[m335g] = obj;
            return obj5;
        }
        int i2 = this.f7038d;
        int i3 = i2 + this.f7039e;
        while (i2 < i3) {
            if (jArr[i2] != j) {
                i2++;
            } else {
                Object obj6 = this.f7037c[i2];
                this.f7037c[i2] = obj;
                return obj6;
            }
        }
        if (j2 == 0) {
            jArr[i] = j;
            this.f7037c[i] = obj;
            int i4 = this.f7035a;
            this.f7035a = i4 + 1;
            if (i4 >= this.f7045k) {
                m344b(this.f7038d << 1);
                return null;
            }
            return null;
        } else if (j3 == 0) {
            jArr[m336f] = j;
            this.f7037c[m336f] = obj;
            int i5 = this.f7035a;
            this.f7035a = i5 + 1;
            if (i5 >= this.f7045k) {
                m344b(this.f7038d << 1);
                return null;
            }
            return null;
        } else if (j4 == 0) {
            jArr[m335g] = j;
            this.f7037c[m335g] = obj;
            int i6 = this.f7035a;
            this.f7035a = i6 + 1;
            if (i6 >= this.f7045k) {
                m344b(this.f7038d << 1);
                return null;
            }
            return null;
        } else {
            m346a(j, obj, i, j2, m336f, j3, m335g, j4);
            return null;
        }
    }

    /* renamed from: b */
    private void m342b(long j, Object obj) {
        if (j == 0) {
            this.f7040f = obj;
            this.f7041g = true;
            return;
        }
        int i = (int) (j & this.f7044j);
        long j2 = this.f7036b[i];
        if (j2 == 0) {
            this.f7036b[i] = j;
            this.f7037c[i] = obj;
            int i2 = this.f7035a;
            this.f7035a = i2 + 1;
            if (i2 >= this.f7045k) {
                m344b(this.f7038d << 1);
                return;
            }
            return;
        }
        int m336f = m336f(j);
        long j3 = this.f7036b[m336f];
        if (j3 == 0) {
            this.f7036b[m336f] = j;
            this.f7037c[m336f] = obj;
            int i3 = this.f7035a;
            this.f7035a = i3 + 1;
            if (i3 >= this.f7045k) {
                m344b(this.f7038d << 1);
                return;
            }
            return;
        }
        int m335g = m335g(j);
        long j4 = this.f7036b[m335g];
        if (j4 == 0) {
            this.f7036b[m335g] = j;
            this.f7037c[m335g] = obj;
            int i4 = this.f7035a;
            this.f7035a = i4 + 1;
            if (i4 >= this.f7045k) {
                m344b(this.f7038d << 1);
                return;
            }
            return;
        }
        m346a(j, obj, i, j2, m336f, j3, m335g, j4);
    }

    /* renamed from: a */
    private void m346a(long j, Object obj, int i, long j2, int i2, long j3, int i3, long j4) {
        long j5;
        Object obj2;
        long[] jArr = this.f7036b;
        Object[] objArr = this.f7037c;
        int i4 = this.f7044j;
        int i5 = 0;
        int i6 = this.f7047m;
        while (true) {
            switch (C1142m.m329a(2)) {
                case 0:
                    j5 = j2;
                    obj2 = objArr[i];
                    jArr[i] = j;
                    objArr[i] = obj;
                    break;
                case 1:
                    j5 = j3;
                    obj2 = objArr[i2];
                    jArr[i2] = j;
                    objArr[i2] = obj;
                    break;
                default:
                    j5 = j4;
                    obj2 = objArr[i3];
                    jArr[i3] = j;
                    objArr[i3] = obj;
                    break;
            }
            i = (int) (j5 & i4);
            j2 = jArr[i];
            if (j2 == 0) {
                jArr[i] = j5;
                objArr[i] = obj2;
                int i7 = this.f7035a;
                this.f7035a = i7 + 1;
                if (i7 >= this.f7045k) {
                    m344b(this.f7038d << 1);
                    return;
                }
                return;
            }
            i2 = m336f(j5);
            j3 = jArr[i2];
            if (j3 == 0) {
                jArr[i2] = j5;
                objArr[i2] = obj2;
                int i8 = this.f7035a;
                this.f7035a = i8 + 1;
                if (i8 >= this.f7045k) {
                    m344b(this.f7038d << 1);
                    return;
                }
                return;
            }
            i3 = m335g(j5);
            j4 = jArr[i3];
            if (j4 == 0) {
                jArr[i3] = j5;
                objArr[i3] = obj2;
                int i9 = this.f7035a;
                this.f7035a = i9 + 1;
                if (i9 >= this.f7045k) {
                    m344b(this.f7038d << 1);
                    return;
                }
                return;
            }
            i5++;
            if (i5 != i6) {
                j = j5;
                obj = obj2;
            } else {
                m340c(j5, obj2);
                return;
            }
        }
    }

    /* renamed from: c */
    private void m340c(long j, Object obj) {
        if (this.f7039e == this.f7046l) {
            m344b(this.f7038d << 1);
            m347a(j, obj);
            return;
        }
        int i = this.f7038d + this.f7039e;
        this.f7036b[i] = j;
        this.f7037c[i] = obj;
        this.f7039e++;
        this.f7035a++;
    }

    /* renamed from: a */
    public Object m348a(long j) {
        if (j == 0) {
            if (this.f7041g) {
                return this.f7040f;
            }
            return null;
        }
        int i = (int) (j & this.f7044j);
        if (this.f7036b[i] != j) {
            i = m336f(j);
            if (this.f7036b[i] != j) {
                i = m335g(j);
                if (this.f7036b[i] != j) {
                    return m338d(j, null);
                }
            }
        }
        return this.f7037c[i];
    }

    /* renamed from: d */
    private Object m338d(long j, Object obj) {
        long[] jArr = this.f7036b;
        int i = this.f7038d;
        int i2 = i + this.f7039e;
        while (i < i2) {
            if (jArr[i] == j) {
                return this.f7037c[i];
            }
            i++;
        }
        return obj;
    }

    /* renamed from: b */
    public Object m343b(long j) {
        if (j == 0) {
            if (this.f7041g) {
                Object obj = this.f7040f;
                this.f7040f = null;
                this.f7041g = false;
                this.f7035a--;
                return obj;
            }
            return null;
        }
        int i = (int) (j & this.f7044j);
        if (this.f7036b[i] == j) {
            this.f7036b[i] = 0;
            Object obj2 = this.f7037c[i];
            this.f7037c[i] = null;
            this.f7035a--;
            return obj2;
        }
        int m336f = m336f(j);
        if (this.f7036b[m336f] == j) {
            this.f7036b[m336f] = 0;
            Object obj3 = this.f7037c[m336f];
            this.f7037c[m336f] = null;
            this.f7035a--;
            return obj3;
        }
        int m335g = m335g(j);
        if (this.f7036b[m335g] == j) {
            this.f7036b[m335g] = 0;
            Object obj4 = this.f7037c[m335g];
            this.f7037c[m335g] = null;
            this.f7035a--;
            return obj4;
        }
        return m341c(j);
    }

    /* renamed from: c */
    Object m341c(long j) {
        long[] jArr = this.f7036b;
        int i = this.f7038d;
        int i2 = i + this.f7039e;
        while (i < i2) {
            if (jArr[i] != j) {
                i++;
            } else {
                Object obj = this.f7037c[i];
                m349a(i);
                this.f7035a--;
                return obj;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m349a(int i) {
        this.f7039e--;
        int i2 = this.f7038d + this.f7039e;
        if (i < i2) {
            this.f7036b[i] = this.f7036b[i2];
            this.f7037c[i] = this.f7037c[i2];
            this.f7037c[i2] = null;
            return;
        }
        this.f7037c[i] = null;
    }

    /* renamed from: a */
    public void m350a() {
        if (this.f7035a == 0) {
            return;
        }
        long[] jArr = this.f7036b;
        Object[] objArr = this.f7037c;
        int i = this.f7038d + this.f7039e;
        while (true) {
            int i2 = i;
            i--;
            if (i2 > 0) {
                jArr[i] = 0;
                objArr[i] = null;
            } else {
                this.f7035a = 0;
                this.f7039e = 0;
                this.f7040f = null;
                this.f7041g = false;
                return;
            }
        }
    }

    /* renamed from: d */
    public boolean m339d(long j) {
        if (j == 0) {
            return this.f7041g;
        }
        if (this.f7036b[(int) (j & this.f7044j)] != j) {
            if (this.f7036b[m336f(j)] != j) {
                if (this.f7036b[m335g(j)] != j) {
                    return m337e(j);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m337e(long j) {
        long[] jArr = this.f7036b;
        int i = this.f7038d;
        int i2 = i + this.f7039e;
        while (i < i2) {
            if (jArr[i] == j) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    private void m344b(int i) {
        int i2 = this.f7038d + this.f7039e;
        this.f7038d = i;
        this.f7045k = (int) (i * this.f7042h);
        this.f7044j = i - 1;
        this.f7043i = 63 - Long.numberOfTrailingZeros(i);
        this.f7046l = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f7047m = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        long[] jArr = this.f7036b;
        Object[] objArr = this.f7037c;
        this.f7036b = new long[i + this.f7046l];
        this.f7037c = new Object[i + this.f7046l];
        int i3 = this.f7035a;
        this.f7035a = this.f7041g ? 1 : 0;
        this.f7039e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                long j = jArr[i4];
                if (j != 0) {
                    m342b(j, objArr[i4]);
                }
            }
        }
    }

    /* renamed from: f */
    private int m336f(long j) {
        long j2 = j * (-1262997959);
        return (int) ((j2 ^ (j2 >>> this.f7043i)) & this.f7044j);
    }

    /* renamed from: g */
    private int m335g(long j) {
        long j2 = j * (-825114047);
        return (int) ((j2 ^ (j2 >>> this.f7043i)) & this.f7044j);
    }

    public int hashCode() {
        int i = 0;
        if (this.f7041g && this.f7040f != null) {
            i = 0 + this.f7040f.hashCode();
        }
        long[] jArr = this.f7036b;
        Object[] objArr = this.f7037c;
        int i2 = this.f7038d + this.f7039e;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3];
            if (j != 0) {
                i += ((int) (j ^ (j >>> 32))) * 31;
                Object obj = objArr[i3];
                if (obj != null) {
                    i += obj.hashCode();
                }
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1138i) {
            C1138i c1138i = (C1138i) obj;
            if (c1138i.f7035a == this.f7035a && c1138i.f7041g == this.f7041g) {
                if (this.f7041g) {
                    if (c1138i.f7040f == null) {
                        if (this.f7040f != null) {
                            return false;
                        }
                    } else if (!c1138i.f7040f.equals(this.f7040f)) {
                        return false;
                    }
                }
                long[] jArr = this.f7036b;
                Object[] objArr = this.f7037c;
                int i = this.f7038d + this.f7039e;
                for (int i2 = 0; i2 < i; i2++) {
                    long j = jArr[i2];
                    if (j != 0) {
                        Object obj2 = objArr[i2];
                        if (obj2 == null) {
                            if (!c1138i.m339d(j) || c1138i.m348a(j) != null) {
                                return false;
                            }
                        } else if (!obj2.equals(c1138i.m348a(j))) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        if (this.f7035a == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        long[] jArr = this.f7036b;
        Object[] objArr = this.f7037c;
        int length = jArr.length;
        while (true) {
            int i = length;
            length--;
            if (i <= 0) {
                break;
            }
            long j = jArr[length];
            if (j != 0) {
                sb.append(j);
                sb.append('=');
                sb.append(objArr[length]);
                break;
            }
        }
        while (true) {
            int i2 = length;
            length--;
            if (i2 > 0) {
                long j2 = jArr[length];
                if (j2 != 0) {
                    sb.append(", ");
                    sb.append(j2);
                    sb.append('=');
                    sb.append(objArr[length]);
                }
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return m345b();
    }

    /* renamed from: b */
    public C1139j m345b() {
        if (this.f7048n == null) {
            this.f7048n = new C1139j(this);
            this.f7049o = new C1139j(this);
        }
        if (!this.f7048n.f7057e) {
            this.f7048n.mo333b();
            this.f7048n.f7057e = true;
            this.f7049o.f7057e = false;
            return this.f7048n;
        }
        this.f7049o.mo333b();
        this.f7049o.f7057e = true;
        this.f7048n.f7057e = false;
        return this.f7049o;
    }
}
