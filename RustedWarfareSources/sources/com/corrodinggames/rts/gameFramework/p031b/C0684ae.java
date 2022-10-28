package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ae.class */
public class C0684ae extends AbstractC0690b {

    /* renamed from: l */
    C0683ad f4332l;

    /* renamed from: m */
    public float f4333m;

    /* renamed from: n */
    public float f4334n;

    /* renamed from: o */
    public int f4335o;

    /* renamed from: p */
    public int f4336p;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: c */
    public boolean mo2429c(InterfaceC0700k interfaceC0700k) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: g */
    public int mo2428g() {
        return 3553;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public void mo2431b(int i) {
        this.f4332l.mo2431b(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: h */
    public int mo2427h() {
        return this.f4332l.mo2427h();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: a */
    public void mo2550a(RectF rectF) {
        float f = this.f4357g;
        float f2 = this.f4358h;
        rectF.f234a = (rectF.f234a * f) + this.f4333m;
        rectF.f236c = (rectF.f236c * f) + this.f4333m;
        rectF.f235b = (rectF.f235b * f2) + this.f4334n;
        rectF.f237d = (rectF.f237d * f2) + this.f4334n;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: a */
    public void mo2549a(RectF rectF, RectF rectF2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public void mo2430b(InterfaceC0700k interfaceC0700k) {
        AbstractC0916l.m963e("SubTexture prepare TODO");
    }
}
