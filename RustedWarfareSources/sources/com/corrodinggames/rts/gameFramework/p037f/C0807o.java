package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.p044l.AbstractC0942m;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;

/* renamed from: com.corrodinggames.rts.gameFramework.f.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/o.class */
public class C0807o extends AbstractC0942m {

    /* renamed from: a */
    float[] f5357a;

    /* renamed from: b */
    int f5358b = 0;

    /* renamed from: c */
    Paint f5359c;

    /* renamed from: d */
    int f5360d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0807o(int i, Paint paint) {
        this.f5360d = i;
        this.f5357a = new float[i * 2];
        this.f5359c = paint;
    }

    /* renamed from: a */
    public final void m1713a(float f, float f2) {
        this.f5357a[this.f5358b] = f;
        this.f5357a[this.f5358b + 1] = f2;
        this.f5358b += 2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.AbstractC0942m
    /* renamed from: a */
    public void mo854a(InterfaceC1027y interfaceC1027y) {
        interfaceC1027y.mo170a(this.f5357a, 0, this.f5358b, this.f5359c);
        C0802k.m1728a(this);
    }
}
