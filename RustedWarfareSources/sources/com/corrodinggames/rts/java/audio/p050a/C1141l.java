package com.corrodinggames.rts.java.audio.p050a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.java.audio.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/l.class */
public class C1141l {

    /* renamed from: a */
    public boolean f7053a;

    /* renamed from: b */
    final C1138i f7054b;

    /* renamed from: c */
    int f7055c;

    /* renamed from: d */
    int f7056d;

    /* renamed from: e */
    boolean f7057e = true;

    public C1141l(C1138i c1138i) {
        this.f7054b = c1138i;
        mo333b();
    }

    /* renamed from: b */
    public void mo333b() {
        this.f7056d = -2;
        this.f7055c = -1;
        if (this.f7054b.f7041g) {
            this.f7053a = true;
        } else {
            m332c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m332c() {
        this.f7053a = false;
        long[] jArr = this.f7054b.f7036b;
        int i = this.f7054b.f7038d + this.f7054b.f7039e;
        do {
            int i2 = this.f7055c + 1;
            this.f7055c = i2;
            if (i2 >= i) {
                return;
            }
        } while (jArr[this.f7055c] == 0);
        this.f7053a = true;
    }

    public void remove() {
        if (this.f7056d == -1 && this.f7054b.f7041g) {
            this.f7054b.f7040f = null;
            this.f7054b.f7041g = false;
        } else if (this.f7056d < 0) {
            throw new IllegalStateException("next must be called before remove.");
        } else {
            if (this.f7056d >= this.f7054b.f7038d) {
                this.f7054b.m349a(this.f7056d);
                this.f7055c = this.f7056d - 1;
                m332c();
            } else {
                this.f7054b.f7036b[this.f7056d] = 0;
                this.f7054b.f7037c[this.f7056d] = null;
            }
        }
        this.f7056d = -2;
        this.f7054b.f7035a--;
    }
}
