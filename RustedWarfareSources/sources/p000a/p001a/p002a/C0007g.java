package p000a.p001a.p002a;

import java.io.IOException;

/* renamed from: a.a.a.g */
/* loaded from: game-lib.jar:a/a/a/g.class */
public class C0007g extends AbstractC0008h {

    /* renamed from: a */
    private int f2a;

    /* renamed from: b */
    private int f3b;

    /* renamed from: c */
    private int f4c;

    /* renamed from: d */
    private int f5d;

    /* renamed from: e */
    private int f6e;

    /* renamed from: f */
    private int f7f;

    /* renamed from: g */
    private int f8g;

    /* renamed from: h */
    private int f9h;

    /* renamed from: i */
    private int f10i;

    /* renamed from: j */
    private int f11j;

    /* renamed from: k */
    private int f12k;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0007g() {
    }

    public C0007g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        m5304a(-128, i, 22);
        this.f2a = 1;
        this.f3b = i2;
        this.f4c = 1;
        this.f5d = i3;
        this.f6e = i4;
        this.f7f = i5;
        this.f8g = i6;
        this.f9h = i7;
        this.f10i = i8;
        this.f11j = i9;
        this.f12k = i10;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    public String mo5306a() {
        return "SYN";
    }

    /* renamed from: c */
    public int m5315c() {
        return this.f3b;
    }

    /* renamed from: e */
    public int m5314e() {
        return this.f5d;
    }

    /* renamed from: f */
    public int m5313f() {
        return this.f6e;
    }

    /* renamed from: g */
    public int m5312g() {
        return this.f7f;
    }

    /* renamed from: h */
    public int m5311h() {
        return this.f8g;
    }

    /* renamed from: i */
    public int m5310i() {
        return this.f9h;
    }

    /* renamed from: j */
    public int m5309j() {
        return this.f10i;
    }

    /* renamed from: k */
    public int m5308k() {
        return this.f11j;
    }

    /* renamed from: l */
    public int m5307l() {
        return this.f12k;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: d */
    public byte[] mo5299d() {
        byte[] mo5299d = super.mo5299d();
        mo5299d[4] = (byte) ((this.f2a << 4) & 255);
        mo5299d[5] = (byte) (this.f3b & 255);
        mo5299d[6] = (byte) (this.f4c & 255);
        mo5299d[7] = 0;
        mo5299d[8] = (byte) ((this.f5d >>> 8) & 255);
        mo5299d[9] = (byte) ((this.f5d >>> 0) & 255);
        mo5299d[10] = (byte) ((this.f6e >>> 8) & 255);
        mo5299d[11] = (byte) ((this.f6e >>> 0) & 255);
        mo5299d[12] = (byte) ((this.f7f >>> 8) & 255);
        mo5299d[13] = (byte) ((this.f7f >>> 0) & 255);
        mo5299d[14] = (byte) ((this.f8g >>> 8) & 255);
        mo5299d[15] = (byte) ((this.f8g >>> 0) & 255);
        mo5299d[16] = (byte) (this.f9h & 255);
        mo5299d[17] = (byte) (this.f10i & 255);
        mo5299d[18] = (byte) (this.f11j & 255);
        mo5299d[19] = (byte) (this.f12k & 255);
        return mo5299d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    public void mo5303a(byte[] bArr, int i, int i2) {
        super.mo5303a(bArr, i, i2);
        if (i2 < 22) {
            throw new IOException("Invalid SYN segment");
        }
        this.f2a = (bArr[i + 4] & 255) >>> 4;
        if (this.f2a != 1) {
            throw new IOException("Invalid RUDP version:" + this.f2a);
        }
        this.f3b = bArr[i + 5] & 255;
        this.f4c = bArr[i + 6] & 255;
        this.f5d = ((bArr[i + 8] & 255) << 8) | ((bArr[i + 9] & 255) << 0);
        this.f6e = ((bArr[i + 10] & 255) << 8) | ((bArr[i + 11] & 255) << 0);
        this.f7f = ((bArr[i + 12] & 255) << 8) | ((bArr[i + 13] & 255) << 0);
        this.f8g = ((bArr[i + 14] & 255) << 8) | ((bArr[i + 15] & 255) << 0);
        this.f9h = bArr[i + 16] & 255;
        this.f10i = bArr[i + 17] & 255;
        this.f11j = bArr[i + 18] & 255;
        this.f12k = bArr[i + 19] & 255;
    }
}
