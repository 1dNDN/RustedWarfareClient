package com.corrodinggames.rts.gameFramework.p031b.p032a.p033a;

import com.corrodinggames.rts.gameFramework.p031b.p032a.C0678f;
import com.corrodinggames.rts.gameFramework.p031b.p032a.EnumC0671a;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/a/b.class */
public abstract class AbstractC0673b {

    /* renamed from: a */
    private int f4242a;

    /* renamed from: b */
    private int f4243b;

    /* renamed from: c */
    private int f4244c;

    /* renamed from: d */
    private boolean f4245d = false;

    /* renamed from: a */
    public void mo2611a() {
        m2610a(null, null, null);
    }

    /* renamed from: a */
    public void m2610a(String str, String str2, EnumC0671a[] enumC0671aArr) {
        this.f4243b = C0678f.m2578a(35633, str);
        this.f4244c = C0678f.m2578a(35632, str2);
        this.f4242a = C0678f.m2579a(this.f4243b, this.f4244c, enumC0671aArr);
        this.f4245d = true;
    }

    /* renamed from: b */
    public int m2609b() {
        return this.f4242a;
    }
}
