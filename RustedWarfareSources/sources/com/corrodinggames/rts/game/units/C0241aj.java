package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;

/* renamed from: com.corrodinggames.rts.game.units.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aj.class */
public class C0241aj extends AbstractC0544i {

    /* renamed from: a */
    float f1561a;

    /* renamed from: b */
    float f1562b;

    /* renamed from: c */
    public C0240ai f1563c;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
        this.f1563c = null;
    }

    /* renamed from: a */
    public void m4138a(float f, float f2) {
        this.f1561a = f;
        this.f1562b = f2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        if ((abstractC0244am instanceof C0240ai) && !abstractC0244am.f1607bT && abstractC0244am.m4102c(this.f1561a, this.f1562b, 0.0f)) {
            this.f1563c = (C0240ai) abstractC0244am;
        }
    }
}
