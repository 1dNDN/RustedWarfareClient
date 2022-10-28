package com.corrodinggames.rts.game.units.custom.p021e.p022a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.p021e.EnumC0435b;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a/c.class */
public class C0431c extends AbstractC0429a {
    public C0431c() {
        this.f2753s = true;
        this.f2752r = true;
        this.f2736b = "credits";
        this.f2737c = C0385az.m3832a("$");
        this.f2748n = true;
        this.f2750p = EnumC0435b.space;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public double mo3651a(AbstractC0244am abstractC0244am) {
        return abstractC0244am.f1609bV.f1321o;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public void mo3650a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1609bV.f1321o = d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: b */
    public void mo3649b(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1609bV.f1321o += d;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p021e.C0428a
    /* renamed from: a */
    public String mo3652a(boolean z) {
        return "$";
    }
}
