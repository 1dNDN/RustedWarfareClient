package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/v.class */
public class C0464v extends C0463u {
    @Override // com.corrodinggames.rts.game.units.custom.C0463u
    /* renamed from: a */
    public void mo3360a() {
        if (!this.f3352e) {
            this.f3351d = C0453l.m3392n(this.f3350c);
            if (this.f3351d == null) {
                throw new C0412bm("Could not find customUnit target:" + m3363d() + " used on:" + this.f3348a + " in section:" + this.f3349b);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.C0463u
    /* renamed from: e */
    public C0453l mo3362c() {
        return (C0453l) this.f3351d;
    }
}
