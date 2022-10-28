package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/e.class */
public class C0391e {

    /* renamed from: a */
    public C0934e f2398a;

    /* renamed from: b */
    public C0934e[] f2399b;

    /* renamed from: c */
    public int f2400c;

    /* renamed from: d */
    public int f2401d;

    /* renamed from: e */
    public int f2402e = 1;

    /* renamed from: f */
    public int f2403f = 1;

    /* renamed from: a */
    public void m3817a(C0390d c0390d) {
        int i = this.f2398a.f6404p;
        int i2 = this.f2398a.f6405q;
        this.f2400c = i;
        this.f2401d = i2;
        if (c0390d.f2373J > 0) {
            this.f2400c = c0390d.f2373J;
        } else if (c0390d.f2372I > 0) {
            this.f2400c = i / c0390d.f2372I;
        }
        if (c0390d.f2374K > 0) {
            this.f2401d = c0390d.f2374K;
        }
        if (this.f2400c > 0) {
            this.f2403f = i / this.f2400c;
        }
        if (this.f2401d > 0) {
            this.f2402e = i2 / this.f2401d;
        }
        if (this.f2403f <= 0) {
            this.f2403f = 1;
        }
        if (this.f2402e <= 0) {
            this.f2402e = 1;
        }
    }
}
