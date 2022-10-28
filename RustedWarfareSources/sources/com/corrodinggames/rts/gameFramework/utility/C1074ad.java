package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ad.class */
public class C1074ad {

    /* renamed from: a */
    private final Object[] f6835a;

    /* renamed from: b */
    private int f6836b;

    /* renamed from: c */
    private final boolean f6837c = false;

    public C1074ad(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f6835a = new Object[i];
    }

    /* renamed from: a */
    public Object m611a() {
        if (this.f6836b > 0) {
            int i = this.f6836b - 1;
            Object obj = this.f6835a[i];
            this.f6835a[i] = null;
            this.f6836b--;
            return obj;
        }
        return null;
    }

    /* renamed from: a */
    public boolean m610a(Object obj) {
        if (this.f6836b < this.f6835a.length) {
            this.f6835a[this.f6836b] = obj;
            this.f6836b++;
            return true;
        }
        return false;
    }
}
