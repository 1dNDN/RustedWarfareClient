package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.game.units.custom.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/at.class */
public class C0379at extends VariableScope.CachedWriter.WriterElement {

    /* renamed from: a */
    public AbstractC0377ar f2259a;

    /* renamed from: b */
    public LogicBoolean f2260b;

    /* renamed from: c */
    public VariableScope.CachedWriter.Operator f2261c;

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterElement
    public void writeToUnit(AbstractC0623y abstractC0623y) {
        if (!(abstractC0623y instanceof C0451j)) {
            AbstractC0916l.m943n("Cannot change data on non custom unit:" + AbstractC0244am.m4132A(abstractC0623y));
            return;
        }
        this.f2259a.m3847a((C0451j) abstractC0623y, this.f2260b, this.f2261c);
    }
}
