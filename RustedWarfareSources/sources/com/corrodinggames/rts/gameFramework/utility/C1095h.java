package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/h.class */
class C1095h implements Iterator {

    /* renamed from: b */
    private int f6874b;

    /* renamed from: c */
    private int f6875c;

    /* renamed from: d */
    private int f6876d;

    /* renamed from: a */
    final /* synthetic */ C1093g f6877a;

    private C1095h(C1093g c1093g) {
        this.f6877a = c1093g;
        this.f6874b = C1093g.m559a(this.f6877a);
        this.f6875c = C1093g.m554b(this.f6877a);
        this.f6876d = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6874b != this.f6875c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f6874b == this.f6875c) {
            throw new NoSuchElementException();
        }
        Object obj = C1093g.m551c(this.f6877a)[this.f6874b];
        if (C1093g.m554b(this.f6877a) != this.f6875c || obj == null) {
            throw new ConcurrentModificationException();
        }
        this.f6876d = this.f6874b;
        this.f6874b = (this.f6874b + 1) & (C1093g.m551c(this.f6877a).length - 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f6876d < 0) {
            throw new IllegalStateException();
        }
        if (C1093g.m558a(this.f6877a, this.f6876d)) {
            this.f6874b = (this.f6874b - 1) & (C1093g.m551c(this.f6877a).length - 1);
            this.f6875c = C1093g.m554b(this.f6877a);
        }
        this.f6876d = -1;
    }
}
