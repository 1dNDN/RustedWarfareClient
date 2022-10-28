package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;

/* renamed from: com.corrodinggames.rts.game.units.custom.bh */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bh.class */
public class C0407bh extends AbstractC0544i {

    /* renamed from: a */
    C0188f f2519a;

    /* renamed from: b */
    C0408bi f2520b;

    /* renamed from: c */
    AbstractC0244am f2521c;

    /* renamed from: d */
    C0188f f2522d;

    /* renamed from: e */
    AbstractC0244am f2523e;

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
    }
}
