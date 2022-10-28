package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/i.class */
public class C0450i {

    /* renamed from: a */
    public C1101m f2839a = new C1101m();

    public C0450i() {
    }

    public C0450i(C0449h c0449h) {
        if (c0449h == null) {
            return;
        }
        for (C0448g c0448g : c0449h.f2838a) {
            this.f2839a.add(c0448g);
        }
    }

    /* renamed from: a */
    public boolean m3559a(C0449h c0449h) {
        if (c0449h == null) {
            return false;
        }
        boolean z = false;
        for (C0448g c0448g : c0449h.f2838a) {
            if (m3560a(c0448g)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m3560a(C0448g c0448g) {
        if (!this.f2839a.contains(c0448g)) {
            this.f2839a.add(c0448g);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m3558b(C0449h c0449h) {
        if (c0449h == null) {
            return false;
        }
        boolean z = false;
        for (C0448g c0448g : c0449h.f2838a) {
            if (this.f2839a.remove(c0448g)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public C0449h m3561a() {
        if (this.f2839a.size() == 0) {
            return C0448g.f2837d;
        }
        return new C0449h((C0448g[]) this.f2839a.toArray(C0448g.f2836c));
    }
}
