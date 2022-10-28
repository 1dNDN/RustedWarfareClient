package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.i.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/j.class */
public class C0875j extends OutputStream {

    /* renamed from: a */
    boolean f5859a = true;

    /* renamed from: b */
    final /* synthetic */ C0873h f5860b;

    public C0875j(C0873h c0873h) {
        this.f5860b = c0873h;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        AbstractC0916l.m957g("SteamSocketOutputStream: Slow write: " + i);
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f5860b.f5852c) {
            AbstractC0916l.m963e("cannot write steam socket closed");
        } else {
            AbstractC0916l.m963e("Forwarded message to client: " + this.f5860b.f5851b + " with old method");
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
