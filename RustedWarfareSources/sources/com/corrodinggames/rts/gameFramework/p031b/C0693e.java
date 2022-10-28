package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/e.class */
public class C0693e extends AbstractC0687ah {

    /* renamed from: l */
    protected Bitmap f4366l;

    public C0693e(Bitmap bitmap) {
        this(bitmap, false);
    }

    public C0693e(Bitmap bitmap, boolean z) {
        super(z);
        this.f4366l = bitmap;
        this.f4345m = mo2536k();
        m2551a(this.f4345m.m5138b() + 0, this.f4345m.m5135c() + 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0687ah
    /* renamed from: a */
    protected void mo2537a(Bitmap bitmap) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0687ah
    /* renamed from: k */
    protected Bitmap mo2536k() {
        return this.f4366l;
    }
}
