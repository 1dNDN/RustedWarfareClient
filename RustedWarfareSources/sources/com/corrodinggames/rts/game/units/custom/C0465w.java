package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/w.class */
public class C0465w extends C0464v {

    /* renamed from: g */
    String f3354g;

    /* renamed from: h */
    C0405bf f3355h;

    @Override // com.corrodinggames.rts.game.units.custom.C0464v, com.corrodinggames.rts.game.units.custom.C0463u
    /* renamed from: a */
    public void mo3360a() {
    }

    @Override // com.corrodinggames.rts.game.units.custom.C0463u
    /* renamed from: b */
    public void mo3359b() {
        super.mo3360a();
        this.f3355h = mo3362c().m3408f(this.f3354g);
        if (this.f3355h == null) {
            throw new C0412bm("Could not find projectile:" + this.f3354g + " on unit target:" + m3363d() + " used on:" + this.f3348a + " in section:" + this.f3349b);
        }
    }

    /* renamed from: f */
    public C0405bf m3358f() {
        return this.f3355h;
    }
}
