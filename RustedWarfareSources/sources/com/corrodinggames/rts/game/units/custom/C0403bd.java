package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.custom.bd */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bd.class */
public class C0403bd extends AbstractC0544i {

    /* renamed from: a */
    public float f2494a;

    /* renamed from: b */
    public float f2495b;

    /* renamed from: c */
    public C0404be f2496c;

    /* renamed from: d */
    public int f2497d;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0623y == abstractC0244am) {
            return;
        }
        C0449h mo3487dc = abstractC0244am.mo3487dc();
        C0449h c0449h = this.f2496c.f2500c;
        if ((c0449h == null || (mo3487dc != null && C0448g.m3572a(c0449h, mo3487dc))) && C0758f.m2147a(this.f2494a, this.f2495b, abstractC0244am.f6958el, abstractC0244am.f6959em) < this.f2496c.f2503f) {
            if (abstractC0244am.f1624ck < 1.0f && this.f2496c.f2506i) {
                return;
            }
            if (this.f2496c.f2507j && !abstractC0244am.mo3288bI()) {
                return;
            }
            if (this.f2496c.f2501d != null && !abstractC0623y.f1609bV.m4312a(this.f2496c.f2501d, abstractC0244am.f1609bV)) {
                return;
            }
            this.f2497d++;
        }
    }
}
