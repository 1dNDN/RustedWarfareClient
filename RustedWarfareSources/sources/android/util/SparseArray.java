package android.util;

import com.p005a.p006a.p007a.C0042a;

/* loaded from: game-lib.jar:android/util/SparseArray.class */
public class SparseArray implements Cloneable {

    /* renamed from: a */
    private static final Object f303a = new Object();

    /* renamed from: b */
    private boolean f304b;

    /* renamed from: c */
    private int[] f305c;

    /* renamed from: d */
    private Object[] f306d;

    /* renamed from: e */
    private int f307e;

    public SparseArray() {
        this(10);
    }

    public SparseArray(int i) {
        this.f304b = false;
        if (i == 0) {
            this.f305c = C0040a.f309b;
            this.f306d = C0040a.f311d;
        } else {
            int m4911c = C0042a.m4911c(i);
            this.f305c = new int[m4911c];
            this.f306d = new Object[m4911c];
        }
        this.f307e = 0;
    }

    /* renamed from: a */
    public SparseArray clone() {
        SparseArray sparseArray = null;
        try {
            sparseArray = (SparseArray) super.clone();
            sparseArray.f305c = (int[]) this.f305c.clone();
            sparseArray.f306d = (Object[]) this.f306d.clone();
        } catch (CloneNotSupportedException e) {
        }
        return sparseArray;
    }

    /* renamed from: a */
    public Object m4930a(int i) {
        return m4929a(i, null);
    }

    /* renamed from: a */
    public Object m4929a(int i, Object obj) {
        int m4922a = C0040a.m4922a(this.f305c, this.f307e, i);
        if (m4922a < 0 || this.f306d[m4922a] == f303a) {
            return obj;
        }
        return this.f306d[m4922a];
    }

    /* renamed from: c */
    private void m4925c() {
        int i = this.f307e;
        int i2 = 0;
        int[] iArr = this.f305c;
        Object[] objArr = this.f306d;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f303a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f304b = false;
        this.f307e = i2;
    }

    /* renamed from: b */
    public void m4926b(int i, Object obj) {
        int m4922a = C0040a.m4922a(this.f305c, this.f307e, i);
        if (m4922a >= 0) {
            this.f306d[m4922a] = obj;
            return;
        }
        int i2 = m4922a ^ (-1);
        if (i2 < this.f307e && this.f306d[i2] == f303a) {
            this.f305c[i2] = i;
            this.f306d[i2] = obj;
            return;
        }
        if (this.f304b && this.f307e >= this.f305c.length) {
            m4925c();
            i2 = C0040a.m4922a(this.f305c, this.f307e, i) ^ (-1);
        }
        if (this.f307e >= this.f305c.length) {
            int m4911c = C0042a.m4911c(this.f307e + 1);
            int[] iArr = new int[m4911c];
            Object[] objArr = new Object[m4911c];
            System.arraycopy(this.f305c, 0, iArr, 0, this.f305c.length);
            System.arraycopy(this.f306d, 0, objArr, 0, this.f306d.length);
            this.f305c = iArr;
            this.f306d = objArr;
        }
        if (this.f307e - i2 != 0) {
            System.arraycopy(this.f305c, i2, this.f305c, i2 + 1, this.f307e - i2);
            System.arraycopy(this.f306d, i2, this.f306d, i2 + 1, this.f307e - i2);
        }
        this.f305c[i2] = i;
        this.f306d[i2] = obj;
        this.f307e++;
    }

    /* renamed from: b */
    public int m4928b() {
        if (this.f304b) {
            m4925c();
        }
        return this.f307e;
    }

    /* renamed from: b */
    public int m4927b(int i) {
        if (this.f304b) {
            m4925c();
        }
        return this.f305c[i];
    }

    /* renamed from: c */
    public Object m4924c(int i) {
        if (this.f304b) {
            m4925c();
        }
        return this.f306d[i];
    }

    /* renamed from: c */
    public void m4923c(int i, Object obj) {
        if (this.f307e != 0 && i <= this.f305c[this.f307e - 1]) {
            m4926b(i, obj);
            return;
        }
        if (this.f304b && this.f307e >= this.f305c.length) {
            m4925c();
        }
        int i2 = this.f307e;
        if (i2 >= this.f305c.length) {
            int m4911c = C0042a.m4911c(i2 + 1);
            int[] iArr = new int[m4911c];
            Object[] objArr = new Object[m4911c];
            System.arraycopy(this.f305c, 0, iArr, 0, this.f305c.length);
            System.arraycopy(this.f306d, 0, objArr, 0, this.f306d.length);
            this.f305c = iArr;
            this.f306d = objArr;
        }
        this.f305c[i2] = i;
        this.f306d[i2] = obj;
        this.f307e = i2 + 1;
    }

    public String toString() {
        if (m4928b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f307e * 28);
        sb.append('{');
        for (int i = 0; i < this.f307e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m4927b(i));
            sb.append('=');
            Object m4924c = m4924c(i);
            if (m4924c != this) {
                sb.append(m4924c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
