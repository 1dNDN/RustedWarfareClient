package com.corrodinggames.rts.gameFramework.p042j;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.j.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/d.class */
public final class C0899d extends AbstractC0905j {

    /* renamed from: a */
    public static int f5918a;

    /* renamed from: b */
    public static int f5919b;

    /* renamed from: c */
    public static int f5920c;

    /* renamed from: d */
    public static int f5921d;

    /* renamed from: e */
    public static int f5922e;

    /* renamed from: f */
    public static int f5923f;

    /* renamed from: g */
    public static int f5924g;

    /* renamed from: h */
    public static double f5925h;

    /* renamed from: i */
    public static double f5926i;

    /* renamed from: j */
    int f5927j;

    /* renamed from: k */
    int f5928k;

    /* renamed from: l */
    int f5929l;

    /* renamed from: m */
    int f5930m;

    /* renamed from: n */
    int f5931n;

    /* renamed from: o */
    C0909n[] f5932o = new C0909n[975];

    /* renamed from: p */
    C1101m f5933p = new C1101m(100);

    /* renamed from: q */
    final PriorityQueue f5934q = new PriorityQueue();

    /* renamed from: r */
    final C1101m f5935r = new C1101m(300);

    /* renamed from: s */
    int f5936s;

    /* renamed from: t */
    int f5937t;

    /* renamed from: u */
    public static int f5938u;

    /* renamed from: c */
    private void m1208c() {
        if (this.f5928k == this.f5930m) {
            m1206d();
            return;
        }
        int i = this.f5931n;
        C0909n[] c0909nArr = this.f5932o;
        if (this.f5927j == -2) {
            for (int i2 = 0; i2 <= i; i2++) {
                int i3 = c0909nArr[i2].f6043c;
                if (this.f5928k == i3) {
                    this.f5927j = i2;
                    this.f5928k = i3;
                    return;
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 <= i; i6++) {
            int i7 = c0909nArr[i6].f6043c;
            if (i5 > i7) {
                i4 = i6;
                i5 = i7;
            }
        }
        if (this.f5928k != i5) {
            f5924g++;
        }
        this.f5927j = i4;
        this.f5928k = i5;
    }

    /* renamed from: a */
    private void m1211a(int i, C0909n c0909n) {
        this.f5932o[i] = c0909n;
        int i2 = c0909n.f6043c;
        if (this.f5927j == -1 || this.f5928k >= i2) {
            if (this.f5928k > i2) {
            }
            if (this.f5928k != i2) {
                f5924g++;
            }
            this.f5927j = i;
            this.f5928k = i2;
        }
        if (this.f5929l == -1 || this.f5930m < i2) {
            this.f5929l = i;
            this.f5930m = i2;
        }
    }

    /* renamed from: d */
    private void m1206d() {
        this.f5927j = -1;
        this.f5928k = Integer.MAX_VALUE;
        this.f5929l = -1;
        this.f5930m = Integer.MIN_VALUE;
        for (int i = 0; i <= this.f5931n; i++) {
            C0909n c0909n = this.f5932o[i];
            if (c0909n == null) {
                AbstractC0916l.m963e("n:" + i);
                AbstractC0916l.m963e("lowestBufferLastIndex:" + this.f5931n);
                throw new RuntimeException("null with n:" + i + ", lowestBufferLastIndex:" + this.f5931n);
            }
            int i2 = c0909n.f6043c;
            if (this.f5928k > i2) {
                this.f5927j = i;
                this.f5928k = i2;
            }
            if (this.f5930m < i2) {
                this.f5929l = i;
                this.f5930m = i2;
            }
        }
    }

    /* renamed from: e */
    private void m1205e() {
        if (this.f5931n < 30) {
            C0909n c0909n = (C0909n) this.f5934q.poll();
            if (c0909n != null) {
                m1209b(c0909n);
            }
            C0909n c0909n2 = (C0909n) this.f5934q.peek();
            if (c0909n2 != null) {
                this.f5936s = c0909n2.f6043c;
                return;
            }
            return;
        }
        this.f5936s = Integer.MAX_VALUE;
        C0909n c0909n3 = (C0909n) this.f5934q.peek();
        if (c0909n3 != null) {
            this.f5936s = c0909n3.f6043c;
        }
    }

    public C0899d() {
        m1204f();
    }

    /* renamed from: b */
    private void m1209b(C0909n c0909n) {
        this.f5931n++;
        m1211a(this.f5931n, c0909n);
        if (this.f5931n > f5918a) {
            f5918a = this.f5931n;
        }
    }

    /* renamed from: c */
    private void m1207c(C0909n c0909n) {
        this.f5934q.offer(c0909n);
        if (c0909n.f6043c < this.f5936s) {
            this.f5936s = c0909n.f6043c;
        }
        if (this.f5934q.size() > f5919b) {
            f5919b = this.f5934q.size();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j
    /* renamed from: a */
    public void mo1171a(C0909n c0909n) {
        f5921d++;
        boolean z = false;
        if (this.f5931n < this.f5932o.length - 1) {
            z = true;
        }
        if (z) {
            if (c0909n.f6043c <= this.f5936s) {
                m1209b(c0909n);
            } else {
                m1207c(c0909n);
            }
        } else if (c0909n.f6043c < this.f5930m) {
            C0909n c0909n2 = this.f5932o[this.f5929l];
            this.f5932o[this.f5929l] = c0909n;
            m1206d();
            m1207c(c0909n2);
        } else {
            m1207c(c0909n);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j
    /* renamed from: a */
    public C0909n mo1172a() {
        if (this.f5927j == -2) {
            int i = this.f5928k;
            m1208c();
            this.f5937t++;
            if (f5938u < this.f5937t) {
                f5938u = this.f5937t;
            }
            f5922e++;
            if (i == this.f5928k) {
                f5923f++;
            }
        } else {
            this.f5937t = 0;
        }
        if (this.f5928k < this.f5936s && this.f5927j != -1) {
            C0909n[] c0909nArr = this.f5932o;
            C0909n c0909n = c0909nArr[this.f5927j];
            if (this.f5931n != this.f5927j) {
                c0909nArr[this.f5927j] = c0909nArr[this.f5931n];
                c0909nArr[this.f5931n] = null;
            } else {
                c0909nArr[this.f5931n] = null;
            }
            this.f5931n--;
            this.f5927j = -2;
            return c0909n;
        }
        C0909n c0909n2 = (C0909n) this.f5934q.poll();
        m1205e();
        return c0909n2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j
    /* renamed from: b */
    public void mo1170b() {
        m1210a((C0908m) null);
    }

    /* renamed from: a */
    public void m1210a(C0908m c0908m) {
        for (int i = 0; i < this.f5932o.length; i++) {
            if (this.f5932o[i] != null) {
                if (c0908m != null) {
                    c0908m.m1120a(this.f5932o[i]);
                }
                this.f5932o[i] = null;
            }
        }
        this.f5931n = -1;
        Iterator it = this.f5934q.iterator();
        while (it.hasNext()) {
            C0909n c0909n = (C0909n) it.next();
            if (c0908m != null) {
                c0908m.m1120a(c0909n);
            }
        }
        this.f5934q.clear();
        m1204f();
    }

    /* renamed from: f */
    private void m1204f() {
        this.f5927j = -1;
        this.f5928k = Integer.MAX_VALUE;
        this.f5929l = -1;
        this.f5930m = Integer.MIN_VALUE;
        this.f5936s = Integer.MAX_VALUE;
    }
}
