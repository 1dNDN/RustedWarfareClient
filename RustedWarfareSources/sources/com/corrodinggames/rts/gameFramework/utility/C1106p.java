package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/p.class */
public class C1106p implements Iterator {

    /* renamed from: b */
    private int f6904b;

    /* renamed from: c */
    private int f6905c;

    /* renamed from: d */
    private int f6906d;

    /* renamed from: a */
    final /* synthetic */ C1104o f6907a;

    private C1106p(C1104o c1104o) {
        this.f6907a = c1104o;
        this.f6904b = this.f6907a.f6902c;
        this.f6905c = -1;
        this.f6906d = C1104o.m521a(this.f6907a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6904b != 0;
    }

    @Override // java.util.Iterator
    public Object next() {
        C1104o c1104o = this.f6907a;
        int i = this.f6904b;
        if (C1104o.m518b(c1104o) != this.f6906d) {
            throw new ConcurrentModificationException();
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        this.f6904b = i - 1;
        Object[] objArr = c1104o.f6903d;
        int i2 = c1104o.f6902c - i;
        this.f6905c = i2;
        return objArr[i2];
    }

    @Override // java.util.Iterator
    public void remove() {
        Object[] objArr = this.f6907a.f6903d;
        int i = this.f6905c;
        if (C1104o.m516c(this.f6907a) != this.f6906d) {
            throw new ConcurrentModificationException();
        }
        if (i < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(objArr, i + 1, objArr, i, this.f6904b);
        C1104o c1104o = this.f6907a;
        int i2 = c1104o.f6902c - 1;
        c1104o.f6902c = i2;
        objArr[i2] = null;
        this.f6905c = -1;
        this.f6906d = C1104o.m515d(this.f6907a);
    }
}
