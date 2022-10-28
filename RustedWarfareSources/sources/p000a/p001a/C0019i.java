package p000a.p001a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.i */
/* loaded from: game-lib.jar:a/a/i.class */
public class C0019i {

    /* renamed from: a */
    private int f83a;

    /* renamed from: b */
    private int f84b;

    /* renamed from: c */
    private int f85c;

    /* renamed from: d */
    private int f86d;

    /* renamed from: e */
    private int f87e;

    /* renamed from: a */
    public synchronized int m5222a() {
        int m5258b;
        m5258b = C0017h.m5258b(this.f83a);
        this.f83a = m5258b;
        return m5258b;
    }

    /* renamed from: a */
    public synchronized int m5221a(int i) {
        this.f83a = i;
        return this.f83a;
    }

    /* renamed from: b */
    public synchronized int m5219b(int i) {
        this.f84b = i;
        return this.f84b;
    }

    /* renamed from: b */
    public synchronized int m5220b() {
        return this.f84b;
    }

    /* renamed from: c */
    public synchronized void m5218c() {
        this.f85c++;
    }

    /* renamed from: d */
    public synchronized int m5217d() {
        return this.f85c;
    }

    /* renamed from: e */
    public synchronized int m5216e() {
        int i = this.f85c;
        this.f85c = 0;
        return i;
    }

    /* renamed from: f */
    public synchronized void m5215f() {
        this.f86d++;
    }

    /* renamed from: g */
    public synchronized int m5214g() {
        return this.f86d;
    }

    /* renamed from: h */
    public synchronized int m5213h() {
        int i = this.f86d;
        this.f86d = 0;
        return i;
    }

    /* renamed from: i */
    public synchronized void m5212i() {
        this.f87e++;
    }

    /* renamed from: j */
    public synchronized int m5211j() {
        return this.f87e;
    }

    /* renamed from: k */
    public synchronized int m5210k() {
        int i = this.f87e;
        this.f87e = 0;
        return i;
    }

    /* renamed from: l */
    public synchronized void m5209l() {
        this.f86d = 0;
        this.f87e = 0;
        this.f85c = 0;
    }
}
