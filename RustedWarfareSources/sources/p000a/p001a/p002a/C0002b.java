package p000a.p001a.p002a;

/* renamed from: a.a.a.b */
/* loaded from: game-lib.jar:a/a/a/b.class */
public class C0002b extends AbstractC0008h {

    /* renamed from: a */
    private byte[] f0a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0002b() {
    }

    public C0002b(int i, int i2, byte[] bArr, int i3, int i4) {
        m5304a(64, i, 6);
        m5305a(i2);
        this.f0a = new byte[i4];
        System.arraycopy(bArr, i3, this.f0a, 0, i4);
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: b */
    public int mo5302b() {
        return this.f0a.length + super.mo5302b();
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    public String mo5306a() {
        return "DAT";
    }

    /* renamed from: c */
    public byte[] m5317c() {
        return this.f0a;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: d */
    public byte[] mo5299d() {
        byte[] mo5299d = super.mo5299d();
        System.arraycopy(this.f0a, 0, mo5299d, 6, this.f0a.length);
        return mo5299d;
    }

    @Override // p000a.p001a.p002a.AbstractC0008h
    /* renamed from: a */
    public void mo5303a(byte[] bArr, int i, int i2) {
        super.mo5303a(bArr, i, i2);
        this.f0a = new byte[i2 - 6];
        System.arraycopy(bArr, i + 6, this.f0a, 0, this.f0a.length);
    }
}
