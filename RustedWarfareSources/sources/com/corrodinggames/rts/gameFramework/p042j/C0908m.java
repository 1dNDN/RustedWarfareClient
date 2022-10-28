package com.corrodinggames.rts.gameFramework.p042j;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.gameFramework.j.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/m.class */
public final class C0908m {

    /* renamed from: a */
    int f6036a;

    /* renamed from: b */
    int f6037b;

    /* renamed from: c */
    public static int f6038c;

    /* renamed from: e */
    final C0900e f6040e = new C0900e();

    /* renamed from: d */
    final C0895a f6039d = new C0895a(1000 + 100);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0908m() {
        for (int i = 0; i < 1000; i++) {
            this.f6039d.add(new C0909n());
        }
    }

    /* renamed from: a */
    C0909n m1123a() {
        if (this.f6039d.f5912b == 0) {
            f6038c++;
            return new C0909n();
        }
        return this.f6039d.m1220b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1120a(C0909n c0909n) {
        if (c0909n != null) {
            this.f6039d.m1216b(c0909n);
        }
    }

    /* renamed from: b */
    void m1119b() {
        if (this.f6039d.size() > 50000) {
            AbstractC0916l.m963e("PathOpenList: resetPool:memoryPool over 50000 clearing");
            this.f6039d.clear();
        }
        this.f6040e.m1203a(this);
    }

    /* renamed from: a */
    public void m1122a(int i, int i2) {
        m1119b();
        this.f6036a = i;
        this.f6037b = i2;
    }

    /* renamed from: a */
    public final void m1121a(int i, short s, short s2) {
        C0909n m1123a = m1123a();
        m1123a.m1115a(s, s2);
        m1123a.m1117a(i, this.f6036a, this.f6037b);
        this.f6040e.mo1171a(m1123a);
    }

    /* renamed from: c */
    public final C0909n m1118c() {
        C0909n mo1172a = this.f6040e.mo1172a();
        if (mo1172a != null) {
            m1120a(mo1172a);
        }
        return mo1172a;
    }
}
