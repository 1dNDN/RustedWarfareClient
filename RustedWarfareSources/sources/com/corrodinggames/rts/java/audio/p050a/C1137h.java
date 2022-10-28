package com.corrodinggames.rts.java.audio.p050a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.java.audio.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/h.class */
public class C1137h {

    /* renamed from: a */
    public boolean f7030a;

    /* renamed from: b */
    final C1134e f7031b;

    /* renamed from: c */
    int f7032c;

    /* renamed from: d */
    int f7033d;

    /* renamed from: e */
    boolean f7034e = true;

    public C1137h(C1134e c1134e) {
        this.f7031b = c1134e;
        mo352b();
    }

    /* renamed from: b */
    public void mo352b() {
        this.f7033d = -2;
        this.f7032c = -1;
        if (this.f7031b.f7018g) {
            this.f7030a = true;
        } else {
            m351c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m351c() {
        this.f7030a = false;
        int[] iArr = this.f7031b.f7013b;
        int i = this.f7031b.f7015d + this.f7031b.f7016e;
        do {
            int i2 = this.f7032c + 1;
            this.f7032c = i2;
            if (i2 >= i) {
                return;
            }
        } while (iArr[this.f7032c] == 0);
        this.f7030a = true;
    }

    public void remove() {
        if (this.f7033d == -1 && this.f7031b.f7018g) {
            this.f7031b.f7017f = null;
            this.f7031b.f7018g = false;
        } else if (this.f7033d < 0) {
            throw new IllegalStateException("next must be called before remove.");
        } else {
            if (this.f7033d >= this.f7031b.f7015d) {
                this.f7031b.m360d(this.f7033d);
                this.f7032c = this.f7033d - 1;
                m351c();
            } else {
                this.f7031b.f7013b[this.f7033d] = 0;
                this.f7031b.f7014c[this.f7033d] = null;
            }
        }
        this.f7033d = -2;
        this.f7031b.f7012a--;
    }
}
