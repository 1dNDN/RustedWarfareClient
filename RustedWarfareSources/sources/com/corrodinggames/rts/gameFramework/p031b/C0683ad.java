package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ad.class */
public class C0683ad extends AbstractC0690b {

    /* renamed from: l */
    int f4331l = 9729;

    public C0683ad(InterfaceC0700k interfaceC0700k, int i, int i2) {
        m2551a(i, i2);
        this.f4351a = interfaceC0700k.mo2512a().mo2439a();
        interfaceC0700k.mo2460d(this);
        interfaceC0700k.mo2492a(this, 6408, 5121, 6408);
    }

    /* renamed from: a */
    public void m2563a(InterfaceC0700k interfaceC0700k, Bitmap bitmap, int i, int i2) {
        interfaceC0700k.mo2457f();
        int mo2428g = mo2428g();
        interfaceC0700k.mo2469b(this);
        C0703n.m2448o();
        GLUtils.texSubImage2D(mo2428g, 0, i, i2, bitmap, 6408, 5121);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: c */
    public boolean mo2429c(InterfaceC0700k interfaceC0700k) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public void mo2430b(InterfaceC0700k interfaceC0700k) {
        AbstractC0916l.m963e("BackingTexture prepare TODO");
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
        if (this.f4331l != i) {
            int mo2428g = mo2428g();
            GLES20.glTexParameterf(mo2428g, 10241, i);
            GLES20.glTexParameterf(mo2428g, 10240, i);
            this.f4331l = i;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: h */
    public int mo2427h() {
        return this.f4331l;
    }
}
