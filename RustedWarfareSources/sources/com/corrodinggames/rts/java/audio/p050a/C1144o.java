package com.corrodinggames.rts.java.audio.p050a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.java.audio.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/o.class */
public class C1144o implements Iterable {

    /* renamed from: a */
    public int f7060a;

    /* renamed from: b */
    Object[] f7061b;

    /* renamed from: c */
    Object[] f7062c;

    /* renamed from: d */
    int f7063d;

    /* renamed from: e */
    int f7064e;

    /* renamed from: f */
    private float f7065f;

    /* renamed from: g */
    private int f7066g;

    /* renamed from: h */
    private int f7067h;

    /* renamed from: i */
    private int f7068i;

    /* renamed from: j */
    private int f7069j;

    /* renamed from: k */
    private int f7070k;

    /* renamed from: l */
    private C1145p f7071l;

    /* renamed from: m */
    private C1145p f7072m;

    public C1144o() {
        this(51, 0.8f);
    }

    public C1144o(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + i);
        }
        int m327b = C1142m.m327b((int) Math.ceil(i / f));
        if (m327b > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + m327b);
        }
        this.f7063d = m327b;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f);
        }
        this.f7065f = f;
        this.f7068i = (int) (this.f7063d * f);
        this.f7067h = this.f7063d - 1;
        this.f7066g = 31 - Integer.numberOfTrailingZeros(this.f7063d);
        this.f7069j = Math.max(3, ((int) Math.ceil(Math.log(this.f7063d))) * 2);
        this.f7070k = Math.max(Math.min(this.f7063d, 8), ((int) Math.sqrt(this.f7063d)) / 8);
        this.f7061b = new Object[this.f7063d + this.f7069j];
        this.f7062c = new Object[this.f7061b.length];
    }

    /* renamed from: a */
    public Object m323a(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        return m317b(obj, obj2);
    }

    /* renamed from: b */
    private Object m317b(Object obj, Object obj2) {
        Object[] objArr = this.f7061b;
        int hashCode = obj.hashCode();
        int i = hashCode & this.f7067h;
        Object obj3 = objArr[i];
        if (obj.equals(obj3)) {
            Object obj4 = this.f7062c[i];
            this.f7062c[i] = obj2;
            return obj4;
        }
        int m316c = m316c(hashCode);
        Object obj5 = objArr[m316c];
        if (obj.equals(obj5)) {
            Object obj6 = this.f7062c[m316c];
            this.f7062c[m316c] = obj2;
            return obj6;
        }
        int m313d = m313d(hashCode);
        Object obj7 = objArr[m313d];
        if (obj.equals(obj7)) {
            Object obj8 = this.f7062c[m313d];
            this.f7062c[m313d] = obj2;
            return obj8;
        }
        int i2 = this.f7063d;
        int i3 = i2 + this.f7064e;
        while (i2 < i3) {
            if (!obj.equals(objArr[i2])) {
                i2++;
            } else {
                Object obj9 = this.f7062c[i2];
                this.f7062c[i2] = obj2;
                return obj9;
            }
        }
        if (obj3 == null) {
            objArr[i] = obj;
            this.f7062c[i] = obj2;
            int i4 = this.f7060a;
            this.f7060a = i4 + 1;
            if (i4 >= this.f7068i) {
                m319b(this.f7063d << 1);
                return null;
            }
            return null;
        } else if (obj5 == null) {
            objArr[m316c] = obj;
            this.f7062c[m316c] = obj2;
            int i5 = this.f7060a;
            this.f7060a = i5 + 1;
            if (i5 >= this.f7068i) {
                m319b(this.f7063d << 1);
                return null;
            }
            return null;
        } else if (obj7 == null) {
            objArr[m313d] = obj;
            this.f7062c[m313d] = obj2;
            int i6 = this.f7060a;
            this.f7060a = i6 + 1;
            if (i6 >= this.f7068i) {
                m319b(this.f7063d << 1);
                return null;
            }
            return null;
        } else {
            m322a(obj, obj2, i, obj3, m316c, obj5, m313d, obj7);
            return null;
        }
    }

    /* renamed from: c */
    private void m314c(Object obj, Object obj2) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.f7067h;
        Object obj3 = this.f7061b[i];
        if (obj3 == null) {
            this.f7061b[i] = obj;
            this.f7062c[i] = obj2;
            int i2 = this.f7060a;
            this.f7060a = i2 + 1;
            if (i2 >= this.f7068i) {
                m319b(this.f7063d << 1);
                return;
            }
            return;
        }
        int m316c = m316c(hashCode);
        Object obj4 = this.f7061b[m316c];
        if (obj4 == null) {
            this.f7061b[m316c] = obj;
            this.f7062c[m316c] = obj2;
            int i3 = this.f7060a;
            this.f7060a = i3 + 1;
            if (i3 >= this.f7068i) {
                m319b(this.f7063d << 1);
                return;
            }
            return;
        }
        int m313d = m313d(hashCode);
        Object obj5 = this.f7061b[m313d];
        if (obj5 == null) {
            this.f7061b[m313d] = obj;
            this.f7062c[m313d] = obj2;
            int i4 = this.f7060a;
            this.f7060a = i4 + 1;
            if (i4 >= this.f7068i) {
                m319b(this.f7063d << 1);
                return;
            }
            return;
        }
        m322a(obj, obj2, i, obj3, m316c, obj4, m313d, obj5);
    }

    /* renamed from: a */
    private void m322a(Object obj, Object obj2, int i, Object obj3, int i2, Object obj4, int i3, Object obj5) {
        Object obj6;
        Object obj7;
        Object[] objArr = this.f7061b;
        Object[] objArr2 = this.f7062c;
        int i4 = this.f7067h;
        int i5 = 0;
        int i6 = this.f7070k;
        while (true) {
            switch (C1142m.m329a(2)) {
                case 0:
                    obj6 = obj3;
                    obj7 = objArr2[i];
                    objArr[i] = obj;
                    objArr2[i] = obj2;
                    break;
                case 1:
                    obj6 = obj4;
                    obj7 = objArr2[i2];
                    objArr[i2] = obj;
                    objArr2[i2] = obj2;
                    break;
                default:
                    obj6 = obj5;
                    obj7 = objArr2[i3];
                    objArr[i3] = obj;
                    objArr2[i3] = obj2;
                    break;
            }
            int hashCode = obj6.hashCode();
            i = hashCode & i4;
            obj3 = objArr[i];
            if (obj3 == null) {
                objArr[i] = obj6;
                objArr2[i] = obj7;
                int i7 = this.f7060a;
                this.f7060a = i7 + 1;
                if (i7 >= this.f7068i) {
                    m319b(this.f7063d << 1);
                    return;
                }
                return;
            }
            i2 = m316c(hashCode);
            obj4 = objArr[i2];
            if (obj4 == null) {
                objArr[i2] = obj6;
                objArr2[i2] = obj7;
                int i8 = this.f7060a;
                this.f7060a = i8 + 1;
                if (i8 >= this.f7068i) {
                    m319b(this.f7063d << 1);
                    return;
                }
                return;
            }
            i3 = m313d(hashCode);
            obj5 = objArr[i3];
            if (obj5 == null) {
                objArr[i3] = obj6;
                objArr2[i3] = obj7;
                int i9 = this.f7060a;
                this.f7060a = i9 + 1;
                if (i9 >= this.f7068i) {
                    m319b(this.f7063d << 1);
                    return;
                }
                return;
            }
            i5++;
            if (i5 != i6) {
                obj = obj6;
                obj2 = obj7;
            } else {
                m312d(obj6, obj7);
                return;
            }
        }
    }

    /* renamed from: d */
    private void m312d(Object obj, Object obj2) {
        if (this.f7064e == this.f7069j) {
            m319b(this.f7063d << 1);
            m317b(obj, obj2);
            return;
        }
        int i = this.f7063d + this.f7064e;
        this.f7061b[i] = obj;
        this.f7062c[i] = obj2;
        this.f7064e++;
        this.f7060a++;
    }

    /* renamed from: a */
    public Object m324a(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode & this.f7067h;
        if (!obj.equals(this.f7061b[i])) {
            i = m316c(hashCode);
            if (!obj.equals(this.f7061b[i])) {
                i = m313d(hashCode);
                if (!obj.equals(this.f7061b[i])) {
                    return m311e(obj, null);
                }
            }
        }
        return this.f7062c[i];
    }

    /* renamed from: e */
    private Object m311e(Object obj, Object obj2) {
        Object[] objArr = this.f7061b;
        int i = this.f7063d;
        int i2 = i + this.f7064e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return this.f7062c[i];
            }
            i++;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m325a(int i) {
        this.f7064e--;
        int i2 = this.f7063d + this.f7064e;
        if (i < i2) {
            this.f7061b[i] = this.f7061b[i2];
            this.f7062c[i] = this.f7062c[i2];
            this.f7062c[i2] = null;
            return;
        }
        this.f7062c[i] = null;
    }

    /* renamed from: b */
    public boolean m318b(Object obj) {
        int hashCode = obj.hashCode();
        if (!obj.equals(this.f7061b[hashCode & this.f7067h])) {
            if (!obj.equals(this.f7061b[m316c(hashCode)])) {
                if (obj.equals(this.f7061b[m313d(hashCode)])) {
                    return true;
                }
                return m315c(obj);
            }
            return true;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m315c(Object obj) {
        Object[] objArr = this.f7061b;
        int i = this.f7063d;
        int i2 = i + this.f7064e;
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    private void m319b(int i) {
        int i2 = this.f7063d + this.f7064e;
        this.f7063d = i;
        this.f7068i = (int) (i * this.f7065f);
        this.f7067h = i - 1;
        this.f7066g = 31 - Integer.numberOfTrailingZeros(i);
        this.f7069j = Math.max(3, ((int) Math.ceil(Math.log(i))) * 2);
        this.f7070k = Math.max(Math.min(i, 8), ((int) Math.sqrt(i)) / 8);
        Object[] objArr = this.f7061b;
        Object[] objArr2 = this.f7062c;
        this.f7061b = new Object[i + this.f7069j];
        this.f7062c = new Object[i + this.f7069j];
        int i3 = this.f7060a;
        this.f7060a = 0;
        this.f7064e = 0;
        if (i3 > 0) {
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != null) {
                    m314c(obj, objArr2[i4]);
                }
            }
        }
    }

    /* renamed from: c */
    private int m316c(int i) {
        int i2 = i * (-1262997959);
        return (i2 ^ (i2 >>> this.f7066g)) & this.f7067h;
    }

    /* renamed from: d */
    private int m313d(int i) {
        int i2 = i * (-825114047);
        return (i2 ^ (i2 >>> this.f7066g)) & this.f7067h;
    }

    public int hashCode() {
        int i = 0;
        Object[] objArr = this.f7061b;
        Object[] objArr2 = this.f7062c;
        int i2 = this.f7063d + this.f7064e;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            if (obj != null) {
                i += obj.hashCode() * 31;
                Object obj2 = objArr2[i3];
                if (obj2 != null) {
                    i += obj2.hashCode();
                }
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1144o) {
            C1144o c1144o = (C1144o) obj;
            if (c1144o.f7060a != this.f7060a) {
                return false;
            }
            Object[] objArr = this.f7061b;
            Object[] objArr2 = this.f7062c;
            int i = this.f7063d + this.f7064e;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = objArr[i2];
                if (obj2 != null) {
                    Object obj3 = objArr2[i2];
                    if (obj3 == null) {
                        if (!c1144o.m318b(obj2) || c1144o.m324a(obj2) != null) {
                            return false;
                        }
                    } else if (!obj3.equals(c1144o.m324a(obj2))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return m321a(", ", true);
    }

    /* renamed from: a */
    private String m321a(String str, boolean z) {
        if (this.f7060a == 0) {
            return z ? "{}" : VariableScope.nullOrMissingString;
        }
        StringBuilder sb = new StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        Object[] objArr = this.f7061b;
        Object[] objArr2 = this.f7062c;
        int length = objArr.length;
        while (true) {
            int i = length;
            length--;
            if (i > 0) {
                Object obj = objArr[length];
                if (obj != null) {
                    sb.append(obj);
                    sb.append('=');
                    sb.append(objArr2[length]);
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            int i2 = length;
            length--;
            if (i2 <= 0) {
                break;
            }
            Object obj2 = objArr[length];
            if (obj2 != null) {
                sb.append(str);
                sb.append(obj2);
                sb.append('=');
                sb.append(objArr2[length]);
            }
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    @Override // java.lang.Iterable
    /* renamed from: a */
    public C1145p iterator() {
        return m320b();
    }

    /* renamed from: b */
    public C1145p m320b() {
        if (this.f7071l == null) {
            this.f7071l = new C1145p(this);
            this.f7072m = new C1145p(this);
        }
        if (!this.f7071l.f7080f) {
            this.f7071l.mo308c();
            this.f7071l.f7080f = true;
            this.f7072m.f7080f = false;
            return this.f7071l;
        }
        this.f7072m.mo308c();
        this.f7072m.f7080f = true;
        this.f7071l.f7080f = false;
        return this.f7072m;
    }
}
