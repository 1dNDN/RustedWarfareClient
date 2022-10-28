package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;

/* renamed from: com.corrodinggames.rts.gameFramework.l.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/i.class */
public class C0938i extends C0928ae {

    /* renamed from: a */
    int f6443a;

    /* renamed from: b */
    boolean f6444b;

    public C0938i(String str, boolean z) {
        super(str);
        this.f6443a = -99;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0928ae
    /* renamed from: a */
    public boolean mo865a() {
        return this.f6444b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0928ae
    /* renamed from: b */
    public boolean mo863b() {
        boolean z = false;
        if (-16711936 != this.f6443a) {
            m909a("teamColor", -16711936);
            z = true;
            this.f6443a = -16711936;
        }
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0928ae
    /* renamed from: a */
    public boolean mo864a(Paint paint, C0934e c0934e) {
        boolean z = false;
        if (c0934e instanceof C0937h) {
            C0937h c0937h = (C0937h) c0934e;
            if (c0937h.f6439D != this.f6443a) {
                m909a("teamColor", c0937h.f6439D);
                z = true;
                this.f6443a = c0937h.f6439D;
            }
        }
        super.mo864a(paint, c0934e);
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0928ae
    /* renamed from: c */
    public void mo862c() {
        super.mo862c();
    }
}
