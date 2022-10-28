package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i;
import com.corrodinggames.rts.java.audio.Sound;

/* renamed from: com.corrodinggames.rts.java.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/q.class */
public class C1187q extends AbstractC0635i {

    /* renamed from: a */
    Sound f7253a;

    /* renamed from: b */
    final /* synthetic */ C1185o f7254b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1187q(C1185o c1185o, String str, AbstractC0634h abstractC0634h) {
        super(str, abstractC0634h);
        this.f7254b = c1185o;
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i
    /* renamed from: a */
    public void mo74a(float f, float f2, int i, int i2, float f3) {
        C1186p c1186p = (C1186p) this.f7254b.f7243c.m611a();
        if (c1186p == null) {
            return;
        }
        c1186p.f7248b = f;
        c1186p.f7249c = f2;
        c1186p.f7250d = i;
        c1186p.f7251e = i2;
        c1186p.f7252f = f3;
        c1186p.f7247a = this;
        this.f7254b.f7242b.offer(c1186p);
    }

    /* renamed from: b */
    public void m73b(float f, float f2, int i, int i2, float f3) {
        if (this.f7253a == null) {
            AbstractC0916l.m963e("Sound not loaded");
            return;
        }
        synchronized (this.f7254b.m77b()) {
            this.f7253a.play(C0758f.m2046f(f, f2), f3, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i
    /* renamed from: a */
    public int mo75a() {
        return this.f7253a.getBytesUsed();
    }
}
