package com.corrodinggames.rts.game.units.custom.p021e.p022a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0385az;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/f.class */
public class C0434f extends AbstractC0429a {
    public C0434f() {
        this.f2753s = true;
        this.f2752r = true;
        this.f2736b = "shield";
        this.f2737c = C0385az.m3832a("shield");
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public double mo3651a(AbstractC0244am abstractC0244am) {
        return abstractC0244am.f1635cv;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public void mo3650a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1635cv = (float) d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: b */
    public void mo3649b(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1635cv = (float) (abstractC0244am.f1635cv + d);
    }
}
