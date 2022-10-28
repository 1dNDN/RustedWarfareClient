package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;

/* renamed from: com.corrodinggames.rts.game.units.g.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/d.class */
public class C0553d extends AbstractC0547a {

    /* renamed from: b */
    float f3759b;

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0547a
    /* renamed from: b */
    public EnumC0549b mo3069b() {
        return EnumC0549b.movementSpeed;
    }

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0547a
    /* renamed from: a */
    public void mo3071a(AbstractC0623y abstractC0623y, C0859ar c0859ar) {
        c0859ar.mo1314a(this.f3759b);
        super.mo3071a(abstractC0623y, c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p028g.AbstractC0547a
    /* renamed from: a */
    public void mo3070a(AbstractC0623y abstractC0623y, C0876k c0876k) {
        this.f3759b = c0876k.m1279g();
        super.mo3070a(abstractC0623y, c0876k);
    }
}
