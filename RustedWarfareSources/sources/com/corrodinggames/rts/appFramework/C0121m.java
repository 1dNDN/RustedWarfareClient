package com.corrodinggames.rts.appFramework;

/* renamed from: com.corrodinggames.rts.appFramework.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/m.class */
public class C0121m {

    /* renamed from: a */
    private int f496a;

    /* renamed from: b */
    private float[] f497b = new float[10];

    /* renamed from: c */
    private float[] f498c = new float[10];

    /* renamed from: d */
    private float[] f499d = new float[10];

    /* renamed from: e */
    private int[] f500e = new int[10];

    /* renamed from: f */
    private float f501f;

    /* renamed from: g */
    private float f502g;

    /* renamed from: h */
    private float f503h;

    /* renamed from: i */
    private float f504i;

    /* renamed from: j */
    private float f505j;

    /* renamed from: k */
    private boolean f506k;

    /* renamed from: l */
    private boolean f507l;

    /* renamed from: m */
    private boolean f508m;

    /* renamed from: n */
    private int f509n;

    /* renamed from: o */
    private boolean f510o;

    /* renamed from: p */
    private boolean f511p;

    /* renamed from: q */
    private boolean f512q;

    /* renamed from: r */
    private int f513r;

    public C0121m() {
        for (int i = 0; i < this.f497b.length; i++) {
            this.f497b[i] = 40.0f;
        }
        for (int i2 = 0; i2 < this.f498c.length; i2++) {
            this.f498c[i2] = 40.0f;
        }
    }

    /* renamed from: a */
    public int m4776a() {
        return this.f509n;
    }

    /* renamed from: b */
    public boolean m4773b() {
        return this.f508m;
    }

    /* renamed from: c */
    public void m4772c() {
        this.f508m = this.f506k;
        this.f509n = this.f496a;
    }

    /* renamed from: a */
    public void m4775a(float f, float f2) {
        this.f497b[0] = f;
        this.f498c[0] = f2;
        this.f501f = this.f497b[0];
        this.f502g = this.f498c[0];
        this.f505j = 0.0f;
        this.f504i = 0.0f;
    }

    /* renamed from: a */
    public void m4774a(float f, float f2, boolean z, int i) {
        int[] iArr;
        this.f513r = 0;
        this.f496a = z ? 1 : 0;
        if (i != -1) {
            iArr = C0120l.f495r;
            iArr[0] = i;
        }
        this.f497b[0] = f;
        this.f498c[0] = f2;
        this.f499d[0] = 0.0f;
        this.f500e[0] = 0;
        this.f506k = z;
        this.f507l = false;
        if (this.f506k) {
            this.f508m = this.f506k;
        }
        if (this.f496a > 0) {
            this.f509n = this.f496a;
        }
        this.f501f = this.f497b[0];
        this.f502g = this.f498c[0];
        this.f503h = this.f499d[0];
        this.f505j = 0.0f;
        this.f504i = 0.0f;
        this.f512q = false;
        this.f511p = false;
        this.f510o = false;
    }

    /* renamed from: d */
    public float[] m4771d() {
        return this.f497b;
    }

    /* renamed from: e */
    public int[] m4770e() {
        int[] iArr;
        iArr = C0120l.f495r;
        return iArr;
    }

    /* renamed from: f */
    public float[] m4769f() {
        return this.f498c;
    }
}
