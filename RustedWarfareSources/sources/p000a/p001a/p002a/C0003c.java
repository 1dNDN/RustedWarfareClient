package p000a.p001a.p002a;

/* renamed from: a.a.a.c */
/* loaded from: game-lib.jar:a/a/a/c.class */
public class C0003c extends C0001a {

    /* renamed from: a */
    private int[] f1a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0003c() {
    }

    public C0003c(int i, int i2, int[] iArr) {
        m5304a(32, i, 6 + iArr.length);
        m5305a(i2);
        this.f1a = iArr;
    }

    @Override // p000a.p001a.p002a.C0001a, p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    public String mo5306a() {
        return "EAK";
    }

    /* renamed from: c */
    public int[] m5316c() {
        return this.f1a;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: d */
    public byte[] mo5299d() {
        byte[] d = super.mo5299d();
        for (int i = 0; i < this.f1a.length; i++) {
            d[4 + i] = (byte) (this.f1a[i] & 255);
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    public void mo5303a(byte[] bArr, int i, int i2) {
        super.mo5303a(bArr, i, i2);
        this.f1a = new int[i2 - 6];
        for (int i3 = 0; i3 < this.f1a.length; i3++) {
            this.f1a[i3] = bArr[i + 4 + i3] & 255;
        }
    }
}
