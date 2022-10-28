package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/g.class */
public class C1093g extends AbstractCollection implements Serializable, Cloneable {

    /* renamed from: b */
    private transient Object[] f6870b = new Object[16];

    /* renamed from: c */
    private transient int f6871c;

    /* renamed from: d */
    private transient int f6872d;

    /* renamed from: a */
    static final /* synthetic */ boolean f6873a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ int m559a(C1093g c1093g) {
        return c1093g.f6871c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ int m554b(C1093g c1093g) {
        return c1093g.f6872d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ Object[] m551c(C1093g c1093g) {
        return c1093g.f6870b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m558a(C1093g c1093g, int i) {
        return c1093g.m560a(i);
    }

    static {
        f6873a = !C1093g.class.desiredAssertionStatus();
    }

    /* renamed from: c */
    private void m552c() {
        if (!f6873a && this.f6871c != this.f6872d) {
            throw new AssertionError();
        }
        int i = this.f6871c;
        int length = this.f6870b.length;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new IllegalStateException("Sorry, deque too big");
        }
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f6870b, i, objArr, 0, i2);
        System.arraycopy(this.f6870b, 0, objArr, i2, i);
        this.f6870b = objArr;
        this.f6871c = 0;
        this.f6872d = length;
    }

    /* renamed from: a */
    private Object[] m556a(Object[] objArr) {
        if (this.f6871c < this.f6872d) {
            System.arraycopy(this.f6870b, this.f6871c, objArr, 0, size());
        } else if (this.f6871c > this.f6872d) {
            int length = this.f6870b.length - this.f6871c;
            System.arraycopy(this.f6870b, this.f6871c, objArr, 0, length);
            System.arraycopy(this.f6870b, 0, objArr, length, this.f6872d);
        }
        return objArr;
    }

    /* renamed from: a */
    public void m557a(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        this.f6870b[this.f6872d] = obj;
        int length = (this.f6872d + 1) & (this.f6870b.length - 1);
        this.f6872d = length;
        if (length == this.f6871c) {
            m552c();
        }
    }

    /* renamed from: a */
    public Object m561a() {
        int i = this.f6871c;
        Object obj = this.f6870b[i];
        if (obj == null) {
            return null;
        }
        this.f6870b[i] = null;
        this.f6871c = (i + 1) & (this.f6870b.length - 1);
        return obj;
    }

    /* renamed from: b */
    public boolean m553b(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f6870b.length - 1;
        int i = this.f6871c;
        while (true) {
            int i2 = i;
            Object obj2 = this.f6870b[i2];
            if (obj2 != null) {
                if (obj.equals(obj2)) {
                    m560a(i2);
                    return true;
                }
                i = (i2 + 1) & length;
            } else {
                return false;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        m557a(obj);
        return true;
    }

    /* renamed from: d */
    private void m550d() {
        if (!f6873a && this.f6870b[this.f6872d] != null) {
            throw new AssertionError();
        }
        if (!f6873a && (this.f6871c != this.f6872d ? this.f6870b[this.f6871c] == null || this.f6870b[(this.f6872d - 1) & (this.f6870b.length - 1)] == null : this.f6870b[this.f6871c] != null)) {
            throw new AssertionError();
        }
        if (!f6873a && this.f6870b[(this.f6871c - 1) & (this.f6870b.length - 1)] != null) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private boolean m560a(int i) {
        m550d();
        Object[] objArr = this.f6870b;
        int length = objArr.length - 1;
        int i2 = this.f6871c;
        int i3 = this.f6872d;
        int i4 = (i - i2) & length;
        int i5 = (i3 - i) & length;
        if (i4 >= ((i3 - i2) & length)) {
            throw new ConcurrentModificationException();
        }
        if (i4 < i5) {
            if (i2 <= i) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i4);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, i);
                objArr[0] = objArr[length];
                System.arraycopy(objArr, i2, objArr, i2 + 1, length - i2);
            }
            objArr[i2] = null;
            this.f6871c = (i2 + 1) & length;
            return false;
        } else if (i < i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i5);
            this.f6872d = i3 - 1;
            return true;
        } else {
            System.arraycopy(objArr, i + 1, objArr, i, length - i);
            objArr[length] = objArr[0];
            System.arraycopy(objArr, 1, objArr, 0, i3);
            this.f6872d = (i3 - 1) & length;
            return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return (this.f6872d - this.f6871c) & (this.f6870b.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f6871c == this.f6872d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C1095h(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f6870b.length - 1;
        int i = this.f6871c;
        while (true) {
            int i2 = i;
            Object obj2 = this.f6870b[i2];
            if (obj2 != null) {
                if (obj.equals(obj2)) {
                    return true;
                }
                i = (i2 + 1) & length;
            } else {
                return false;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return m553b(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int i = this.f6871c;
        int i2 = this.f6872d;
        if (i != i2) {
            this.f6872d = 0;
            this.f6871c = 0;
            int i3 = i;
            int length = this.f6870b.length - 1;
            do {
                this.f6870b[i3] = null;
                i3 = (i3 + 1) & length;
            } while (i3 != i2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return m556a(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        m556a(objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    /* renamed from: b */
    public C1093g clone() {
        try {
            C1093g c1093g = (C1093g) super.clone();
            c1093g.f6870b = (Object[]) this.f6870b.clone();
            return c1093g;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
