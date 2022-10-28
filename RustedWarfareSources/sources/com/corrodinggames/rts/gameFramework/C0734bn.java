package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.bn */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bn.class */
public class C0734bn {

    /* renamed from: a */
    boolean f4608a;

    /* renamed from: b */
    int f4609b;

    /* renamed from: c */
    double f4610c;

    /* renamed from: d */
    double f4611d;

    /* renamed from: e */
    long f4612e;

    /* renamed from: f */
    String f4613f;

    public C0734bn(String str) {
        this.f4608a = true;
        this.f4613f = str;
    }

    public C0734bn(String str, boolean z) {
        this.f4608a = true;
        this.f4613f = str;
        this.f4608a = z;
    }

    /* renamed from: a */
    public void m2379a() {
        if (this.f4608a) {
            if (this.f4612e != 0) {
                this.f4612e = Long.MIN_VALUE;
            } else {
                this.f4612e = C0727bl.m2390a();
            }
        }
    }

    /* renamed from: b */
    public void m2378b() {
        if (this.f4608a) {
            double m2387a = C0727bl.m2387a(this.f4612e, C0727bl.m2390a());
            this.f4610c += m2387a;
            this.f4609b++;
            if (m2387a > this.f4611d) {
                this.f4611d = m2387a;
            }
            this.f4612e = 0L;
        }
    }

    /* renamed from: c */
    public String m2377c() {
        String str;
        if (this.f4608a) {
            if (this.f4609b > 0) {
                str = ((("{ #" + this.f4609b + " = ") + "peak:" + C0758f.m2164a(this.f4611d, 2) + "ms ") + "avg:" + C0758f.m2164a(this.f4610c / this.f4609b, 2) + "ms ") + "total:" + C0758f.m2164a(this.f4610c, 2) + "ms ";
            } else {
                str = "{ #0 = NA";
            }
            return str + "}";
        }
        return "{ Not enabled }";
    }

    /* renamed from: d */
    public void m2376d() {
        if (this.f4608a) {
            m2378b();
            m2375e();
        }
    }

    /* renamed from: e */
    public void m2375e() {
        if (this.f4608a && this.f4609b > 0) {
            LoggerMaybe.LogDebug2(LoggerMaybe.m1034a(this.f4613f + " - " + m2377c(), "\u001b[36m"));
            m2374f();
        }
    }

    /* renamed from: f */
    public void m2374f() {
        this.f4609b = 0;
        this.f4610c = 0.0d;
        this.f4611d = 0.0d;
    }
}
