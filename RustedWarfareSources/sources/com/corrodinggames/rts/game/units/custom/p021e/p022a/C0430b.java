package com.corrodinggames.rts.game.units.custom.p021e.p022a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0385az;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/b.class */
public class C0430b extends AbstractC0429a {
    public C0430b() {
        this.f2753s = true;
        this.f2752r = true;
        this.f2736b = "ammo";
        this.f2737c = C0385az.m3832a("ammo");
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public double mo3651a(AbstractC0244am abstractC0244am) {
        return abstractC0244am.f1642cC;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public void mo3650a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1642cC = (int) d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: b */
    public void mo3649b(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1642cC = (int) (abstractC0244am.f1642cC + d);
    }
}
