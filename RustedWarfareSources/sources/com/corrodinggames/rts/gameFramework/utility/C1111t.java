package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/t.class */
public class C1111t implements Iterator {

    /* renamed from: b */
    private int f6917b;

    /* renamed from: c */
    private int f6918c;

    /* renamed from: d */
    private int f6919d;

    /* renamed from: a */
    final /* synthetic */ C1109s f6920a;

    private C1111t(C1109s c1109s) {
        int i;
        this.f6920a = c1109s;
        this.f6917b = this.f6920a.f6914b;
        this.f6918c = -1;
        i = this.f6920a.modCount;
        this.f6919d = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6917b != 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public AbstractC1120w next() {
        int i;
        int i2;
        C1109s c1109s = this.f6920a;
        int i3 = this.f6917b;
        i = c1109s.modCount;
        if (i != this.f6919d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f6920a.f6916d).append(" (modCount:");
            i2 = this.f6920a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.f6919d).append(")").toString());
        } else if (i3 == 0) {
            throw new NoSuchElementException();
        } else {
            this.f6917b = i3 - 1;
            AbstractC1120w[] abstractC1120wArr = c1109s.f6915c;
            int i4 = c1109s.f6914b - i3;
            this.f6918c = i4;
            return abstractC1120wArr[i4];
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        int i;
        int i2;
        AbstractC1120w[] abstractC1120wArr = this.f6920a.f6915c;
        int i3 = this.f6918c;
        i = this.f6920a.modCount;
        if (i != this.f6919d) {
            StringBuilder append = new StringBuilder().append("on:").append(this.f6920a.f6916d).append(" (modCount:");
            i2 = this.f6920a.modCount;
            throw new ConcurrentModificationException(append.append(i2).append(" expectedModCount:").append(this.f6919d).append(")").toString());
        } else if (i3 < 0) {
            throw new IllegalStateException();
        } else {
            System.arraycopy(abstractC1120wArr, i3 + 1, abstractC1120wArr, i3, this.f6917b);
            C1109s c1109s = this.f6920a;
            int i4 = c1109s.f6914b - 1;
            c1109s.f6914b = i4;
            abstractC1120wArr[i4] = null;
            this.f6918c = -1;
            this.f6919d = C1109s.m500f(this.f6920a);
        }
    }
}
