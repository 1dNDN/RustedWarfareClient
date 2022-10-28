package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/r.class */
abstract class AbstractC1147r implements Iterable, Iterator {

    /* renamed from: b */
    public boolean f7076b;

    /* renamed from: c */
    final C1144o f7077c;

    /* renamed from: d */
    int f7078d;

    /* renamed from: e */
    int f7079e;

    /* renamed from: f */
    boolean f7080f = true;

    public AbstractC1147r(C1144o c1144o) {
        this.f7077c = c1144o;
        mo308c();
    }

    /* renamed from: c */
    public void mo308c() {
        this.f7079e = -1;
        this.f7078d = -1;
        m307d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m307d() {
        this.f7076b = false;
        Object[] objArr = this.f7077c.f7061b;
        int i = this.f7077c.f7063d + this.f7077c.f7064e;
        do {
            int i2 = this.f7078d + 1;
            this.f7078d = i2;
            if (i2 >= i) {
                return;
            }
        } while (objArr[this.f7078d] == null);
        this.f7076b = true;
    }

    public void remove() {
        if (this.f7079e < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
        if (this.f7079e >= this.f7077c.f7063d) {
            this.f7077c.m325a(this.f7079e);
            this.f7078d = this.f7079e - 1;
            m307d();
        } else {
            this.f7077c.f7061b[this.f7079e] = null;
            this.f7077c.f7062c[this.f7079e] = null;
        }
        this.f7079e = -1;
        this.f7077c.f7060a--;
    }
}
