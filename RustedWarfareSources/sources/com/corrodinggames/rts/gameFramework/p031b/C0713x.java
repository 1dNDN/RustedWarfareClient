package com.corrodinggames.rts.gameFramework.p031b;

import android.util.Log;

/* renamed from: com.corrodinggames.rts.gameFramework.b.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/x.class */
public class C0713x extends AbstractC0690b {

    /* renamed from: m */
    private final boolean f4446m;

    /* renamed from: n */
    private int f4447n;

    /* renamed from: l */
    protected boolean f4448l;

    public C0713x(int i, int i2, boolean z) {
        this(i, i2, z, 3553);
    }

    public C0713x(int i, int i2, boolean z, int i3) {
        this.f4447n = 3553;
        this.f4446m = z;
        m2551a(i, i2);
        this.f4447n = i3;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public void mo2430b(InterfaceC0700k interfaceC0700k) {
        this.f4351a = interfaceC0700k.mo2512a().mo2439a();
        if (this.f4447n == 3553) {
            interfaceC0700k.mo2492a(this, 6408, 5121, 6408);
        }
        interfaceC0700k.mo2460d(this);
        this.f4352b = 1;
        m2548a(interfaceC0700k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: c */
    public boolean mo2429c(InterfaceC0700k interfaceC0700k) {
        if (m2541i()) {
            return true;
        }
        Log.m4935c("RawTexture", "lost the content due to context change");
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: g */
    public int mo2428g() {
        return this.f4447n;
    }

    /* renamed from: k */
    public boolean m2426k() {
        return this.f4448l;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public void mo2431b(int i) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: h */
    public int mo2427h() {
        return 9729;
    }
}
