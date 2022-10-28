package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/u.class */
public final class C1112u extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final AbstractC0244am[] f6921a = new AbstractC0244am[0];

    /* renamed from: b */
    public int f6922b;

    /* renamed from: c */
    transient AbstractC0244am[] f6923c = f6921a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ int m486d(C1112u c1112u) {
        int i = c1112u.modCount + 1;
        c1112u.modCount = i;
        return i;
    }

    /* renamed from: a */
    public AbstractC0244am[] m498a() {
        return this.f6923c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean add(AbstractC0244am abstractC0244am) {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        int i = this.f6922b;
        if (i == abstractC0244amArr.length) {
            AbstractC0244am[] abstractC0244amArr2 = new AbstractC0244am[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(abstractC0244amArr, 0, abstractC0244amArr2, 0, i);
            abstractC0244amArr = abstractC0244amArr2;
            this.f6923c = abstractC0244amArr2;
        }
        abstractC0244amArr[i] = abstractC0244am;
        this.f6922b = i + 1;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m490b(AbstractC0244am abstractC0244am) {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        int i = this.f6922b;
        if (i == abstractC0244amArr.length) {
            AbstractC0244am[] abstractC0244amArr2 = new AbstractC0244am[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(abstractC0244amArr, 0, abstractC0244amArr2, 0, i);
            abstractC0244amArr = abstractC0244amArr2;
            this.f6923c = abstractC0244amArr2;
        }
        abstractC0244amArr[i] = abstractC0244am;
        this.f6922b = i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, AbstractC0244am abstractC0244am) {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        int i2 = this.f6922b;
        if (i > i2 || i < 0) {
            m496a(i, i2);
        }
        if (i2 < abstractC0244amArr.length) {
            System.arraycopy(abstractC0244amArr, i, abstractC0244amArr, i + 1, i2 - i);
        } else {
            AbstractC0244am[] abstractC0244amArr2 = new AbstractC0244am[m488c(i2)];
            System.arraycopy(abstractC0244amArr, 0, abstractC0244amArr2, 0, i);
            System.arraycopy(abstractC0244amArr, i, abstractC0244amArr2, i + 1, i2 - i);
            abstractC0244amArr = abstractC0244amArr2;
            this.f6923c = abstractC0244amArr2;
        }
        abstractC0244amArr[i] = abstractC0244am;
        this.f6922b = i2 + 1;
        this.modCount++;
    }

    /* renamed from: c */
    private static int m488c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        AbstractC0244am[] abstractC0244amArr = (AbstractC0244am[]) collection.toArray();
        int length = abstractC0244amArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC0244am[] abstractC0244amArr2 = this.f6923c;
        int i = this.f6922b;
        int i2 = i + length;
        if (i2 > abstractC0244amArr2.length) {
            AbstractC0244am[] abstractC0244amArr3 = new AbstractC0244am[m488c(i2 - 1)];
            System.arraycopy(abstractC0244amArr2, 0, abstractC0244amArr3, 0, i);
            abstractC0244amArr2 = abstractC0244amArr3;
            this.f6923c = abstractC0244amArr3;
        }
        System.arraycopy(abstractC0244amArr, 0, abstractC0244amArr2, i, length);
        this.f6922b = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f6922b;
        if (i > i2 || i < 0) {
            m496a(i, i2);
        }
        AbstractC0244am[] abstractC0244amArr = (AbstractC0244am[]) collection.toArray();
        int length = abstractC0244amArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC0244am[] abstractC0244amArr2 = this.f6923c;
        int i3 = i2 + length;
        if (i3 <= abstractC0244amArr2.length) {
            System.arraycopy(abstractC0244amArr2, i, abstractC0244amArr2, i + length, i2 - i);
        } else {
            AbstractC0244am[] abstractC0244amArr3 = new AbstractC0244am[m488c(i3 - 1)];
            System.arraycopy(abstractC0244amArr2, 0, abstractC0244amArr3, 0, i);
            System.arraycopy(abstractC0244amArr2, i, abstractC0244amArr3, i + length, i2 - i);
            abstractC0244amArr2 = abstractC0244amArr3;
            this.f6923c = abstractC0244amArr3;
        }
        System.arraycopy(abstractC0244amArr, 0, abstractC0244amArr2, i, length);
        this.f6922b = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m496a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f6922b != 0) {
            Arrays.fill(this.f6923c, 0, this.f6922b, (Object) null);
            this.f6922b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C1112u c1112u = (C1112u) super.clone();
            c1112u.f6923c = (AbstractC0244am[]) this.f6923c.clone();
            return c1112u;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public AbstractC0244am get(int i) {
        if (i >= this.f6922b) {
            m496a(i, this.f6922b);
        }
        return this.f6923c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6922b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f6922b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        int i = this.f6922b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(abstractC0244amArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (abstractC0244amArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        int i = this.f6922b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(abstractC0244amArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (abstractC0244amArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        if (obj != null) {
            for (int i = this.f6922b - 1; i >= 0; i--) {
                if (obj.equals(abstractC0244amArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f6922b - 1; i2 >= 0; i2--) {
            if (abstractC0244amArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public AbstractC0244am remove(int i) {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        int i2 = this.f6922b;
        if (i >= i2) {
            m496a(i, i2);
        }
        AbstractC0244am abstractC0244am = abstractC0244amArr[i];
        int i3 = i2 - 1;
        System.arraycopy(abstractC0244amArr, i + 1, abstractC0244amArr, i, i3 - i);
        abstractC0244amArr[i3] = null;
        this.f6922b = i3;
        this.modCount++;
        return abstractC0244am;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        int i = this.f6922b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(abstractC0244amArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(abstractC0244amArr, i2 + 1, abstractC0244amArr, i2, i3 - i2);
                    abstractC0244amArr[i3] = null;
                    this.f6922b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (abstractC0244amArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(abstractC0244amArr, i4 + 1, abstractC0244amArr, i4, i5 - i4);
                abstractC0244amArr[i5] = null;
                this.f6922b = i5;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        if (i == i2) {
            return;
        }
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        int i3 = this.f6922b;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f6922b);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f6922b);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(abstractC0244amArr, i2, abstractC0244amArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(abstractC0244amArr, i3 - i4, i3, (Object) null);
        this.f6922b = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public AbstractC0244am set(int i, AbstractC0244am abstractC0244am) {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        if (i >= this.f6922b) {
            m496a(i, this.f6922b);
        }
        AbstractC0244am abstractC0244am2 = abstractC0244amArr[i];
        abstractC0244amArr[i] = abstractC0244am;
        return abstractC0244am2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f6922b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f6923c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f6922b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f6923c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C1114v(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        int i = 1;
        int i2 = this.f6922b;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC0244am abstractC0244am = abstractC0244amArr[i3];
            i = (31 * i) + (abstractC0244am == null ? 0 : abstractC0244am.hashCode());
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int i = this.f6922b;
        if (list.size() != i) {
            return false;
        }
        AbstractC0244am[] abstractC0244amArr = this.f6923c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                AbstractC0244am abstractC0244am = abstractC0244amArr[i2];
                Object obj2 = list.get(i2);
                if (abstractC0244am == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!abstractC0244am.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC0244am abstractC0244am2 = abstractC0244amArr[i3];
            Object next = it.next();
            if (abstractC0244am2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!abstractC0244am2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}
