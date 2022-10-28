package android.graphics;

/* loaded from: game-lib.jar:android/graphics/Rect.class */
public final class Rect {

    /* renamed from: a */
    public int f230a;

    /* renamed from: b */
    public int f231b;

    /* renamed from: c */
    public int f232c;

    /* renamed from: d */
    public int f233d;

    public Rect() {
    }

    public Rect(int i, int i2, int i3, int i4) {
        this.f230a = i;
        this.f231b = i2;
        this.f232c = i3;
        this.f233d = i4;
    }

    public Rect(Rect rect) {
        this.f230a = rect.f230a;
        this.f231b = rect.f231b;
        this.f232c = rect.f232c;
        this.f233d = rect.f233d;
    }

    public boolean equals(Object obj) {
        Rect rect = (Rect) obj;
        return rect != null && this.f230a == rect.f230a && this.f231b == rect.f231b && this.f232c == rect.f232c && this.f233d == rect.f233d;
    }

    public String toString() {
        return "Rect(" + this.f230a + ", " + this.f231b + ", " + this.f232c + ", " + this.f233d + ")";
    }

    /* renamed from: a */
    public final boolean m5037a() {
        return this.f230a >= this.f232c || this.f231b >= this.f233d;
    }

    /* renamed from: b */
    public final int m5033b() {
        return this.f232c - this.f230a;
    }

    /* renamed from: c */
    public final int m5029c() {
        return this.f233d - this.f231b;
    }

    /* renamed from: d */
    public final int m5028d() {
        return (this.f230a + this.f232c) >> 1;
    }

    /* renamed from: e */
    public final int m5027e() {
        return (this.f231b + this.f233d) >> 1;
    }

    /* renamed from: f */
    public final float m5026f() {
        return (this.f230a + this.f232c) * 0.5f;
    }

    /* renamed from: g */
    public final float m5025g() {
        return (this.f231b + this.f233d) * 0.5f;
    }

    /* renamed from: a */
    public void m5035a(int i, int i2, int i3, int i4) {
        this.f230a = i;
        this.f231b = i2;
        this.f232c = i3;
        this.f233d = i4;
    }

    /* renamed from: a */
    public void m5034a(Rect rect) {
        this.f230a = rect.f230a;
        this.f231b = rect.f231b;
        this.f232c = rect.f232c;
        this.f233d = rect.f233d;
    }

    /* renamed from: a */
    public void m5036a(int i, int i2) {
        this.f230a += i;
        this.f231b += i2;
        this.f232c += i;
        this.f233d += i2;
    }

    /* renamed from: b */
    public boolean m5032b(int i, int i2) {
        return this.f230a < this.f232c && this.f231b < this.f233d && i >= this.f230a && i < this.f232c && i2 >= this.f231b && i2 < this.f233d;
    }

    /* renamed from: b */
    public boolean m5030b(Rect rect) {
        return this.f230a < this.f232c && this.f231b < this.f233d && this.f230a <= rect.f230a && this.f231b <= rect.f231b && this.f232c >= rect.f232c && this.f233d >= rect.f233d;
    }

    /* renamed from: b */
    public boolean m5031b(int i, int i2, int i3, int i4) {
        return this.f230a < i3 && i < this.f232c && this.f231b < i4 && i2 < this.f233d;
    }
}
