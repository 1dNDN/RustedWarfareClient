package com.corrodinggames.rts.gameFramework.p042j;

/* renamed from: com.corrodinggames.rts.gameFramework.j.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/e.class */
public final class C0900e extends AbstractC0905j {

    /* renamed from: a */
    boolean f5939a;

    /* renamed from: b */
    int f5940b;

    /* renamed from: c */
    final C0895a f5941c = new C0895a(100);

    /* renamed from: d */
    final C0895a f5942d = new C0895a(900);

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j
    /* renamed from: a */
    public void mo1171a(C0909n c0909n) {
        int i = c0909n.f6043c;
        if (i <= this.f5940b) {
            if (i == this.f5940b) {
                this.f5941c.m1216b(c0909n);
                return;
            }
            m1202c();
            this.f5940b = i;
            this.f5941c.add(c0909n);
            return;
        }
        this.f5942d.m1216b(c0909n);
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j
    /* renamed from: a */
    public C0909n mo1172a() {
        if (this.f5941c.f5912b > 0) {
            return this.f5941c.m1220b();
        }
        if (this.f5942d.f5912b == 0) {
            this.f5940b = Integer.MAX_VALUE;
            return null;
        }
        m1201d();
        return this.f5941c.m1220b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j
    /* renamed from: b */
    public void mo1170b() {
        m1203a((C0908m) null);
    }

    /* renamed from: a */
    public void m1203a(C0908m c0908m) {
        if (c0908m != null) {
            C0909n[] m1226a = this.f5941c.m1226a();
            for (int i = this.f5941c.f5912b - 1; i >= 0; i--) {
                c0908m.m1120a(m1226a[i]);
            }
            C0909n[] m1226a2 = this.f5942d.m1226a();
            for (int i2 = this.f5942d.f5912b - 1; i2 >= 0; i2--) {
                c0908m.m1120a(m1226a2[i2]);
            }
        }
        this.f5941c.clear();
        this.f5942d.clear();
        this.f5940b = Integer.MAX_VALUE;
        this.f5939a = true;
    }

    /* renamed from: c */
    private void m1202c() {
        C0909n[] m1226a = this.f5941c.m1226a();
        int i = this.f5941c.f5912b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5942d.add(m1226a[i2]);
        }
        this.f5941c.clear();
    }

    /* renamed from: d */
    private void m1201d() {
        int i = Integer.MAX_VALUE;
        C0895a c0895a = this.f5942d;
        C0909n[] m1226a = c0895a.m1226a();
        for (int i2 = c0895a.f5912b - 1; i2 >= 0; i2--) {
            int i3 = m1226a[i2].f6043c;
            if (i3 < i) {
                i = i3;
            }
        }
        for (int i4 = c0895a.f5912b - 1; i4 >= 0; i4--) {
            C0909n c0909n = m1226a[i4];
            if (c0909n.f6043c == i) {
                this.f5941c.add(c0909n);
                int i5 = c0895a.f5912b - 1;
                m1226a[i4] = m1226a[i5];
                m1226a[i5] = null;
                c0895a.f5912b = i5;
            }
        }
        this.f5940b = i;
    }
}
