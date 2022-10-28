package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;
import android.util.Log;
import java.util.WeakHashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/b.class */
public abstract class AbstractC0690b implements InterfaceC0681ab {

    /* renamed from: a */
    protected int f4351a;

    /* renamed from: b */
    protected int f4352b;

    /* renamed from: c */
    protected int f4353c;

    /* renamed from: d */
    protected int f4354d;

    /* renamed from: e */
    protected int f4355e;

    /* renamed from: f */
    protected int f4356f;

    /* renamed from: g */
    protected float f4357g;

    /* renamed from: h */
    protected float f4358h;

    /* renamed from: l */
    private boolean f4359l;

    /* renamed from: m */
    private boolean f4360m;

    /* renamed from: i */
    public int f4361i;

    /* renamed from: j */
    public boolean f4362j;

    /* renamed from: k */
    protected InterfaceC0700k f4363k;

    /* renamed from: n */
    private static WeakHashMap f4364n = new WeakHashMap();

    /* renamed from: o */
    private static ThreadLocal f4365o = new ThreadLocal();

    /* renamed from: b */
    public abstract void mo2430b(InterfaceC0700k interfaceC0700k);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo2429c(InterfaceC0700k interfaceC0700k);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo2428g();

    /* renamed from: b */
    public abstract void mo2431b(int i);

    /* renamed from: h */
    public abstract int mo2427h();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0690b(InterfaceC0700k interfaceC0700k, int i, int i2) {
        this.f4351a = -1;
        this.f4353c = -1;
        this.f4354d = -1;
        this.f4363k = null;
        m2548a(interfaceC0700k);
        this.f4351a = i;
        this.f4352b = i2;
        synchronized (f4364n) {
            f4364n.put(this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0690b() {
        this(null, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m2548a(InterfaceC0700k interfaceC0700k) {
        this.f4363k = interfaceC0700k;
    }

    /* renamed from: a */
    public void m2551a(int i, int i2) {
        this.f4353c = i;
        this.f4354d = i2;
        this.f4355e = i > 0 ? m2552a(i) : 0;
        this.f4356f = i2 > 0 ? m2552a(i2) : 0;
        if (this.f4355e == 0) {
            this.f4357g = 0.0f;
        } else {
            this.f4357g = 1.0f / this.f4355e;
        }
        if (this.f4356f == 0) {
            this.f4358h = 0.0f;
        } else {
            this.f4358h = 1.0f / this.f4356f;
        }
        if (this.f4355e > 4096 || this.f4356f > 4096) {
            Log.m4939a("BasicTexture", String.format("secondBitmap is too large: %d x %d", Integer.valueOf(this.f4355e), Integer.valueOf(this.f4356f)), new Exception());
        }
    }

    /* renamed from: a */
    public static int m2552a(int i) {
        if (i <= 0 || i > 1073741824) {
            throw new IllegalArgumentException("n is invalid: " + i);
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 16);
        int i4 = i3 | (i3 >> 8);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 2);
        return (i6 | (i6 >> 1)) + 1;
    }

    /* renamed from: a */
    public int m2553a() {
        return this.f4351a;
    }

    /* renamed from: b */
    public int mo2546b() {
        return this.f4353c;
    }

    /* renamed from: c */
    public int mo2545c() {
        return this.f4354d;
    }

    /* renamed from: d */
    public int m2544d() {
        return this.f4355e;
    }

    /* renamed from: e */
    public int m2543e() {
        return this.f4356f;
    }

    /* renamed from: f */
    public boolean m2542f() {
        return this.f4359l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m2547a(boolean z) {
        this.f4359l = z;
    }

    /* renamed from: i */
    public boolean m2541i() {
        return this.f4352b == 1;
    }

    /* renamed from: j */
    public void mo2540j() {
        this.f4360m = true;
        m2539k();
    }

    /* renamed from: k */
    private void m2539k() {
        InterfaceC0700k interfaceC0700k = this.f4363k;
        if (interfaceC0700k != null && this.f4351a != -1) {
            interfaceC0700k.mo2494a(this);
            this.f4351a = -1;
        }
        this.f4352b = 0;
        m2548a((InterfaceC0700k) null);
    }

    protected void finalize() {
        f4365o.set(AbstractC0690b.class);
        mo2540j();
        f4365o.set(null);
    }

    /* renamed from: a */
    public void mo2550a(RectF rectF) {
        int mo2546b = mo2546b();
        int mo2545c = mo2545c();
        int m2544d = m2544d();
        int m2543e = m2543e();
        rectF.f234a /= m2544d;
        rectF.f236c /= m2544d;
        rectF.f235b /= m2543e;
        rectF.f237d /= m2543e;
        float f = mo2546b / m2544d;
        if (rectF.f236c > f) {
            rectF.f236c = f;
        }
        float f2 = mo2545c / m2543e;
        if (rectF.f237d > f2) {
            rectF.f237d = f2;
        }
    }

    /* renamed from: a */
    public void mo2549a(RectF rectF, RectF rectF2) {
        float mo2545c = mo2545c() / m2543e();
        float mo2546b = mo2546b() / m2544d();
        if (rectF.f236c > mo2546b) {
            rectF2.f236c = rectF2.f234a + ((rectF2.m5017b() * (mo2546b - rectF.f234a)) / rectF.m5017b());
        }
        if (rectF.f237d > mo2545c) {
            rectF2.f237d = rectF2.f235b + ((rectF2.m5013c() * (mo2545c - rectF.f235b)) / rectF.m5013c());
        }
    }
}
