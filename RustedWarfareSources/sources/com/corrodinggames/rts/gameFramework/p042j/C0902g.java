package com.corrodinggames.rts.gameFramework.p042j;

/* renamed from: com.corrodinggames.rts.gameFramework.j.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/g.class */
public class C0902g {

    /* renamed from: a */
    int f5947a;

    /* renamed from: b */
    int f5948b;

    /* renamed from: c */
    int f5949c;

    /* renamed from: d */
    int f5950d;

    /* renamed from: e */
    byte[] f5951e;

    /* renamed from: f */
    byte[] f5952f;

    public C0902g(int i, int i2) {
        this.f5947a = i;
        this.f5948b = i2;
        this.f5951e = new byte[i * i2];
        this.f5952f = new byte[i * i2];
    }

    /* renamed from: a */
    public final byte m1197a(int i, int i2) {
        return this.f5951e[(i * this.f5948b) + i2];
    }

    /* renamed from: a */
    public final byte m1196a(C0911p c0911p) {
        return this.f5951e[(c0911p.f6074a * this.f5948b) + c0911p.f6075b];
    }

    /* renamed from: b */
    public boolean m1193b(C0911p c0911p) {
        return m1196a(c0911p) <= 0;
    }

    /* renamed from: a */
    public void m1195a(C0911p c0911p, byte b) {
        this.f5951e[(c0911p.f6074a * this.f5948b) + c0911p.f6075b] = b;
    }

    /* renamed from: a */
    public void m1194a(C0911p c0911p, boolean z) {
        this.f5952f[(c0911p.f6074a * this.f5948b) + c0911p.f6075b] = (byte) (z ? 1 : 0);
    }

    /* renamed from: c */
    public boolean m1192c(C0911p c0911p) {
        return this.f5952f[(c0911p.f6074a * this.f5948b) + c0911p.f6075b] == 1;
    }
}
