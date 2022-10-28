package com.corrodinggames.rts.gameFramework.p042j;

import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.gameFramework.j.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/n.class */
public final class C0909n implements Comparable {

    /* renamed from: a */
    public short f6041a;

    /* renamed from: b */
    public short f6042b;

    /* renamed from: c */
    public int f6043c;

    /* renamed from: a */
    public final void m1115a(short s, short s2) {
        this.f6041a = s;
        this.f6042b = s2;
    }

    /* renamed from: a */
    public final void m1117a(int i, int i2, int i3) {
        int i4 = i2 - this.f6041a;
        int i5 = i3 - this.f6042b;
        int i6 = i4 > 0 ? i4 : -i4;
        int i7 = i5 > 0 ? i5 : -i5;
        this.f6043c = i + ((i6 + i7) * 11) + (C0758f.m2070c(i6, i7) * (-7));
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(C0909n c0909n) {
        if (this.f6043c == c0909n.f6043c) {
            if (this.f6041a - c0909n.f6041a != 0) {
                return this.f6041a - c0909n.f6041a;
            }
            return this.f6042b - c0909n.f6042b;
        }
        return this.f6043c - c0909n.f6043c;
    }

    public String toString() {
        return "PathOpenListNode [x=" + ((int) this.f6041a) + ", y=" + ((int) this.f6042b) + ", score=" + this.f6043c + "]";
    }
}
