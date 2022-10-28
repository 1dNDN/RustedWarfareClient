package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/n.class */
public class C1103n implements Iterator {

    /* renamed from: b */
    private int f6896b;

    /* renamed from: c */
    private int f6897c;

    /* renamed from: d */
    private int f6898d;

    /* renamed from: a */
    final /* synthetic */ C1101m f6899a;

    private C1103n(C1101m c1101m) {
        this.f6899a = c1101m;
        this.f6896b = this.f6899a.f6894a;
        this.f6897c = -1;
        this.f6898d = C1101m.m531a(this.f6899a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6896b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        C1101m c1101m = this.f6899a;
        int i = this.f6896b;
        if (C1101m.m528b(c1101m) != this.f6898d) {
            throw new ConcurrentModificationException();
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        this.f6896b = i - 1;
        Object[] objArr = c1101m.f6895b;
        int i2 = c1101m.f6894a - i;
        this.f6897c = i2;
        return objArr[i2];
    }

    @Override // java.util.Iterator
    public void remove() {
        Object[] objArr = this.f6899a.f6895b;
        int i = this.f6897c;
        if (C1101m.m526c(this.f6899a) != this.f6898d) {
            throw new ConcurrentModificationException();
        }
        if (i < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(objArr, i + 1, objArr, i, this.f6896b);
        C1101m c1101m = this.f6899a;
        int i2 = c1101m.f6894a - 1;
        c1101m.f6894a = i2;
        objArr[i2] = null;
        this.f6897c = -1;
        this.f6898d = C1101m.m525d(this.f6899a);
    }
}
