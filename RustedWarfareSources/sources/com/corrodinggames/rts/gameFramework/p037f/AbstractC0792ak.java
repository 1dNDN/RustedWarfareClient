package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.C0758f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.ak */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ak.class */
public abstract class AbstractC0792ak implements Comparable {

    /* renamed from: c */
    long f5088c;

    /* renamed from: d */
    long f5089d = 5000;

    /* renamed from: e */
    float f5090e;

    /* renamed from: f */
    float f5091f;

    /* renamed from: g */
    String f5092g;

    /* renamed from: h */
    boolean f5093h;

    /* renamed from: i */
    boolean f5094i;

    /* renamed from: b */
    public abstract void mo1884b(AbstractC0792ak abstractC0792ak);

    /* renamed from: a */
    public abstract String mo1887a();

    public AbstractC0792ak(float f, float f2) {
        this.f5090e = f;
        this.f5091f = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(AbstractC0792ak abstractC0792ak) {
        return (int) (abstractC0792ak.f5088c - this.f5088c);
    }

    /* renamed from: a */
    public boolean mo1886a(AbstractC0792ak abstractC0792ak) {
        if (this.f5088c + mo1885b() < System.currentTimeMillis() || C0758f.m2147a(this.f5090e, this.f5091f, abstractC0792ak.f5090e, abstractC0792ak.f5091f) > 90000.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    protected long mo1885b() {
        return 5000L;
    }
}
