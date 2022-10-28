package com.corrodinggames.rts.gameFramework.p042j;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.j.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/b.class */
class C0897b implements Iterator {

    /* renamed from: b */
    private int f5914b;

    /* renamed from: c */
    private int f5915c;

    /* renamed from: d */
    private int f5916d;

    /* renamed from: a */
    final /* synthetic */ C0895a f5917a;

    private C0897b(C0895a c0895a) {
        this.f5917a = c0895a;
        this.f5914b = this.f5917a.f5912b;
        this.f5915c = -1;
        this.f5916d = C0895a.m1222a(this.f5917a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5914b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C0909n next() {
        C0895a c0895a = this.f5917a;
        int i = this.f5914b;
        if (C0895a.m1217b(c0895a) != this.f5916d) {
            throw new ConcurrentModificationException();
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        this.f5914b = i - 1;
        C0909n[] c0909nArr = c0895a.f5913c;
        int i2 = c0895a.f5912b - i;
        this.f5915c = i2;
        return c0909nArr[i2];
    }

    @Override // java.util.Iterator
    public void remove() {
        C0909n[] c0909nArr = this.f5917a.f5913c;
        int i = this.f5915c;
        if (C0895a.m1214c(this.f5917a) != this.f5916d) {
            throw new ConcurrentModificationException();
        }
        if (i < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(c0909nArr, i + 1, c0909nArr, i, this.f5914b);
        C0895a c0895a = this.f5917a;
        int i2 = c0895a.f5912b - 1;
        c0895a.f5912b = i2;
        c0909nArr[i2] = null;
        this.f5915c = -1;
        this.f5916d = C0895a.m1213d(this.f5917a);
    }
}
