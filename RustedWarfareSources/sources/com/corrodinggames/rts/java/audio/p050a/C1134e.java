package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/e.class */
public class C1134e implements Iterable {

    /* renamed from: a */
    public int f7012a;

    /* renamed from: b */
    int[] f7013b;

    /* renamed from: c */
    Object[] f7014c;

    /* renamed from: d */
    int f7015d;

    /* renamed from: e */
    int f7016e;

    /* renamed from: f */
    Object f7017f;

    /* renamed from: g */
    boolean f7018g;

    /* renamed from: h */
    private float f7019h;

    /* renamed from: i */
    private int f7020i;

    /* renamed from: j */
    private int f7021j;

    /* renamed from: k */
    private int f7022k;

    /* renamed from: l */
    private int f7023l;

    /* renamed from: m */
    private int f7024m;

    /* renamed from: n */
    private C1135f f7025n;

    /* renamed from: o */
    private C1135f f7026o;

    public C1134e() {
        this(51, 0.8f);
    }

    public C1134e(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int m327b = C1142m.m327b((int) Math.ceil(i / f));
        if (m327b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + m327b);
        }
        this.f7015d = m327b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f7019h = f;
        this.f7022k = (int) (this.f7015d * f);
        this.f7021j = this.f7015d - 1;
        this.f7020i = 31 - Integer.numberOfTrailingZeros(this.f7015d);
        this.f7023l = Math.max(3, ((int) Math.ceil(Math.log(this.f7015d))) * 2);
        this.f7024m = Math.max(Math.min(this.f7015d, 8), ((int) Math.sqrt(this.f7015d)) / 8);
        this.f7013b = new int[this.f7015d + this.f7023l];
        this.f7014c = new Object[this.f7013b.length];
    }

    /* renamed from: a */
    public Object m367a(int i, Object obj) {
        if (i == 0) {
            Object obj2 = this.f7017f;
            this.f7017f = obj;
            if (!this.f7018g) {
                this.f7018g = true;
                this.f7012a++;
            }
            return obj2;
        }
        int[] iArr = this.f7013b;
        int i2 = i & this.f7021j;
        int i3 = iArr[i2];
        if (i3 == i) {
            Object obj3 = this.f7014c[i2];
            this.f7014c[i2] = obj;
            return obj3;
        }
        int m355h = m355h(i);
        int i4 = iArr[m355h];
        if (i4 == i) {
            Object obj4 = this.f7014c[m355h];
            this.f7014c[m355h] = obj;
            return obj4;
        }
        int m354i = m354i(i);
        int i5 = iArr[m354i];
        if (i5 == i) {
            Object obj5 = this.f7014c[m354i];
            this.f7014c[m354i] = obj;
            return obj5;
        }
        int i6 = this.f7015d;
        int i7 = i6 + this.f7016e;
        while (i6 < i7) {
            if (iArr[i6] != i) {
                i6++;
            } else {
                Object obj6 = this.f7014c[i6];
                this.f7014c[i6] = obj;
                return obj6;
            }
        }
        if (i3 == 0) {
            iArr[i2] = i;
            this.f7014c[i2] = obj;
            int i8 = this.f7012a;
            this.f7012a = i8 + 1;
            if (i8 >= this.f7022k) {
                m356g(this.f7015d << 1);
                return null;
            }
            return null;
        } else if (i4 == 0) {
            iArr[m355h] = i;
            this.f7014c[m355h] = obj;
            int i9 = this.f7012a;
            this.f7012a = i9 + 1;
            if (i9 >= this.f7022k) {
                m356g(this.f7015d << 1);
                return null;
            }
            return null;
        } else if (i5 == 0) {
            iArr[m354i] = i;
            this.f7014c[m354i] = obj;
            int i10 = this.f7012a;
            this.f7012a = i10 + 1;
            if (i10 >= this.f7022k) {
                m356g(this.f7015d << 1);
                return null;
            }
            return null;
        } else {
            m366a(i, obj, i2, i3, m355h, i4, m354i, i5);
            return null;
        }
    }

    /* renamed from: b */
    private void m363b(int i, Object obj) {
        if (i == 0) {
            this.f7017f = obj;
            this.f7018g = true;
            return;
        }
        int i2 = i & this.f7021j;
        int i3 = this.f7013b[i2];
        if (i3 == 0) {
            this.f7013b[i2] = i;
            this.f7014c[i2] = obj;
            int i4 = this.f7012a;
            this.f7012a = i4 + 1;
            if (i4 >= this.f7022k) {
                m356g(this.f7015d << 1);
                return;
            }
            return;
        }
        int m355h = m355h(i);
        int i5 = this.f7013b[m355h];
        if (i5 == 0) {
            this.f7013b[m355h] = i;
            this.f7014c[m355h] = obj;
            int i6 = this.f7012a;
            this.f7012a = i6 + 1;
            if (i6 >= this.f7022k) {
                m356g(this.f7015d << 1);
                return;
            }
            return;
        }
        int m354i = m354i(i);
        int i7 = this.f7013b[m354i];
        if (i7 == 0) {
            this.f7013b[m354i] = i;
            this.f7014c[m354i] = obj;
            int i8 = this.f7012a;
            this.f7012a = i8 + 1;
            if (i8 >= this.f7022k) {
                m356g(this.f7015d << 1);
                return;
            }
            return;
        }
        m366a(i, obj, i2, i3, m355h, i5, m354i, i7);
    }

    /* renamed from: a */
    private void m366a(int i, Object obj, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        Object obj2;
        int[] iArr = this.f7013b;
        Object[] objArr = this.f7014c;
        int i9 = this.f7021j;
        int i10 = 0;
        int i11 = this.f7024m;
        while (true) {
            switch (C1142m.m329a(2)) {
                case 0:
                    i8 = i3;
                    obj2 = objArr[i2];
                    iArr[i2] = i;
                    objArr[i2] = obj;
                    break;
                case 1:
                    i8 = i5;
                    obj2 = objArr[i4];
                    iArr[i4] = i;
                    objArr[i4] = obj;
                    break;
                default:
                    i8 = i7;
                    obj2 = objArr[i6];
                    iArr[i6] = i;
                    objArr[i6] = obj;
                    break;
            }
            i2 = i8 & i9;
            i3 = iArr[i2];
            if (i3 == 0) {
                iArr[i2] = i8;
                objArr[i2] = obj2;
                int i12 = this.f7012a;
                this.f7012a = i12 + 1;
                if (i12 >= this.f7022k) {
                    m356g(this.f7015d << 1);
                    return;
                }
                return;
            }
            i4 = m355h(i8);
            i5 = iArr[i4];
            if (i5 == 0) {
                iArr[i4] = i8;
                objArr[i4] = obj2;
                int i13 = this.f7012a;
                this.f7012a = i13 + 1;
                if (i13 >= this.f7022k) {
                    m356g(this.f7015d << 1);
                    return;
                }
                return;
            }
            i6 = m354i(i8);
            i7 = iArr[i6];
            if (i7 == 0) {
                iArr[i6] = i8;
                objArr[i6] = obj2;
                int i14 = this.f7012a;
                this.f7012a = i14 + 1;
                if (i14 >= this.f7022k) {
                    m356g(this.f7015d << 1);
                    return;
                }
                return;
            }
            i10++;
            if (i10 != i11) {
                i = i8;
                obj = obj2;
            } else {
                m361c(i8, obj2);
                return;
            }
        }
    }

    /* renamed from: c */
    private void m361c(int i, Object obj) {
        if (this.f7016e == this.f7023l) {
            m356g(this.f7015d << 1);
            m367a(i, obj);
            return;
        }
        int i2 = this.f7015d + this.f7016e;
        this.f7013b[i2] = i;
        this.f7014c[i2] = obj;
        this.f7016e++;
        this.f7012a++;
    }

    /* renamed from: a */
    public Object m368a(int i) {
        if (i == 0) {
            if (this.f7018g) {
                return this.f7017f;
            }
            return null;
        }
        int i2 = i & this.f7021j;
        if (this.f7013b[i2] != i) {
            i2 = m355h(i);
            if (this.f7013b[i2] != i) {
                i2 = m354i(i);
                if (this.f7013b[i2] != i) {
                    return m359d(i, null);
                }
            }
        }
        return this.f7014c[i2];
    }

    /* renamed from: d */
    private Object m359d(int i, Object obj) {
        int[] iArr = this.f7013b;
        int i2 = this.f7015d;
        int i3 = i2 + this.f7016e;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return this.f7014c[i2];
            }
            i2++;
        }
        return obj;
    }

    /* renamed from: b */
    public Object m364b(int i) {
        if (i == 0) {
            if (this.f7018g) {
                Object obj = this.f7017f;
                this.f7017f = null;
                this.f7018g = false;
                this.f7012a--;
                return obj;
            }
            return null;
        }
        int i2 = i & this.f7021j;
        if (this.f7013b[i2] == i) {
            this.f7013b[i2] = 0;
            Object obj2 = this.f7014c[i2];
            this.f7014c[i2] = null;
            this.f7012a--;
            return obj2;
        }
        int m355h = m355h(i);
        if (this.f7013b[m355h] == i) {
            this.f7013b[m355h] = 0;
            Object obj3 = this.f7014c[m355h];
            this.f7014c[m355h] = null;
            this.f7012a--;
            return obj3;
        }
        int m354i = m354i(i);
        if (this.f7013b[m354i] == i) {
            this.f7013b[m354i] = 0;
            Object obj4 = this.f7014c[m354i];
            this.f7014c[m354i] = null;
            this.f7012a--;
            return obj4;
        }
        return m362c(i);
    }

    /* renamed from: c */
    Object m362c(int i) {
        int[] iArr = this.f7013b;
        int i2 = this.f7015d;
        int i3 = i2 + this.f7016e;
        while (i2 < i3) {
            if (iArr[i2] != i) {
                i2++;
            } else {
                Object obj = this.f7014c[i2];
                m360d(i2);
                this.f7012a--;
                return obj;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m360d(int i) {
        this.f7016e--;
        int i2 = this.f7015d + this.f7016e;
        if (i < i2) {
            this.f7013b[i] = this.f7013b[i2];
            this.f7014c[i] = this.f7014c[i2];
            this.f7014c[i2] = null;
            return;
        }
        this.f7014c[i] = null;
    }

    /* renamed from: a */
    public void m369a() {
        if (this.f7012a == 0) {
            return;
        }
        int[] iArr = this.f7013b;
        Object[] objArr = this.f7014c;
        int i = this.f7015d + this.f7016e;
        while (true) {
            int i2 = i;
            i--;
            if (i2 > 0) {
                iArr[i] = 0;
                objArr[i] = null;
            } else {
                this.f7012a = 0;
                this.f7016e = 0;
                this.f7017f = null;
                this.f7018g = false;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean m358e(int i) {
        if (i == 0) {
            return this.f7018g;
        }
        if (this.f7013b[i & this.f7021j] != i) {
            if (this.f7013b[m355h(i)] != i) {
                if (this.f7013b[m354i(i)] != i) {
                    return m357f(i);
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m357f(int i) {
        int[] iArr = this.f7013b;
        int i2 = this.f7015d;
        int i3 = i2 + this.f7016e;
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return true;
            }
            i2++;
        }
        return false;
    }

    /* renamed from: g */
    private void m356g(int i) {
        int i2 = this.f7015d + this.f7016e;
        this.f7015d = i;
        this.f7022k = (int) (i * this.f7019h);
        this.f7021j = i - 1;
        this.f7020i = 31 - Integer.numberOfTrailingZeros(i);
        this.f7023l = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f7024m = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        int[] iArr = this.f7013b;
        Object[] objArr = this.f7014c;
        this.f7013b = new int[i + this.f7023l];
        this.f7014c = new Object[i + this.f7023l];
        int i3 = this.f7012a;
        this.f7012a = this.f7018g ? 1 : 0;
        this.f7016e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = iArr[i4];
                if (i5 != 0) {
                    m363b(i5, objArr[i4]);
                }
            }
        }
    }

    /* renamed from: h */
    private int m355h(int i) {
        int i2 = i * (-1262997959);
        return (i2 ^ (i2 >>> this.f7020i)) & this.f7021j;
    }

    /* renamed from: i */
    private int m354i(int i) {
        int i2 = i * (-825114047);
        return (i2 ^ (i2 >>> this.f7020i)) & this.f7021j;
    }

    public int hashCode() {
        int i = 0;
        if (this.f7018g && this.f7017f != null) {
            i = 0 + this.f7017f.hashCode();
        }
        int[] iArr = this.f7013b;
        Object[] objArr = this.f7014c;
        int i2 = this.f7015d + this.f7016e;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0) {
                i += i4 * 31;
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
        if (obj instanceof C1134e) {
            C1134e c1134e = (C1134e) obj;
            if (c1134e.f7012a == this.f7012a && c1134e.f7018g == this.f7018g) {
                if (this.f7018g) {
                    if (c1134e.f7017f == null) {
                        if (this.f7017f != null) {
                            return false;
                        }
                    } else if (!c1134e.f7017f.equals(this.f7017f)) {
                        return false;
                    }
                }
                int[] iArr = this.f7013b;
                Object[] objArr = this.f7014c;
                int i = this.f7015d + this.f7016e;
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = iArr[i2];
                    if (i3 != 0) {
                        Object obj2 = objArr[i2];
                        if (obj2 == null) {
                            if (!c1134e.m358e(i3) || c1134e.m368a(i3) != null) {
                                return false;
                            }
                        } else if (!obj2.equals(c1134e.m368a(i3))) {
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
        int i;
        if (this.f7012a == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('[');
        int[] iArr = this.f7013b;
        Object[] objArr = this.f7014c;
        int length = iArr.length;
        if (this.f7018g) {
            sb.append("0=");
            sb.append(this.f7017f);
        } else {
            do {
                int i2 = length;
                length--;
                if (i2 > 0) {
                    i = iArr[length];
                }
            } while (i == 0);
            sb.append(i);
            sb.append('=');
            sb.append(objArr[length]);
        }
        while (true) {
            int i3 = length;
            length--;
            if (i3 > 0) {
                int i4 = iArr[length];
                if (i4 != 0) {
                    sb.append(", ");
                    sb.append(i4);
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
        return m365b();
    }

    /* renamed from: b */
    public C1135f m365b() {
        if (this.f7025n == null) {
            this.f7025n = new C1135f(this);
            this.f7026o = new C1135f(this);
        }
        if (!this.f7025n.f7034e) {
            this.f7025n.mo352b();
            this.f7025n.f7034e = true;
            this.f7026o.f7034e = false;
            return this.f7025n;
        }
        this.f7026o.mo352b();
        this.f7026o.f7034e = true;
        this.f7025n.f7034e = false;
        return this.f7026o;
    }
}
