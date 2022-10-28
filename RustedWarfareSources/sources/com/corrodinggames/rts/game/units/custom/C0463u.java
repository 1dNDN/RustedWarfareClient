package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.InterfaceC0303as;

/* renamed from: com.corrodinggames.rts.game.units.custom.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/u.class */
public class C0463u {

    /* renamed from: a */
    String f3348a;

    /* renamed from: b */
    String f3349b;

    /* renamed from: c */
    String f3350c;

    /* renamed from: d */
    InterfaceC0303as f3351d;

    /* renamed from: e */
    boolean f3352e;

    /* renamed from: f */
    public boolean f3353f;

    /* renamed from: a */
    public void mo3360a() {
        if (!this.f3352e) {
            this.f3351d = C0453l.m3382s(this.f3350c);
            if (this.f3351d == null) {
                if (this.f3353f) {
                    throw new C0412bm("Could not find unit type:" + this.f3350c + " used on:" + this.f3348a + " in section:" + this.f3349b + " (Note: Prefix with 'unitref' if not using a unit type here)");
                }
                throw new C0412bm("Could not find unit type:" + this.f3350c + " used on:" + this.f3348a + " in section:" + this.f3349b);
            }
        }
    }

    /* renamed from: b */
    public void mo3359b() {
    }

    /* renamed from: c */
    public InterfaceC0303as mo3362c() {
        return this.f3351d;
    }

    /* renamed from: d */
    public String m3363d() {
        if (this.f3352e) {
            if (this.f3351d != null) {
                return this.f3351d.mo3403i();
            }
            return "(Error: known type is null)";
        }
        return this.f3350c;
    }
}
