package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.Core;

/* renamed from: com.corrodinggames.rts.game.units.custom.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ar.class */
public abstract class AbstractC0377ar {

    /* renamed from: a */
    int f2256a;

    /* renamed from: b */
    String f2257b;

    /* renamed from: a */
    public abstract double mo4236a(C0451j c0451j, C0359aq c0359aq);

    /* renamed from: a */
    public abstract void mo4237a(C0451j c0451j, double d);

    /* renamed from: b */
    public abstract boolean mo4235b();

    public AbstractC0377ar(int i, String str) {
        this.f2256a = i;
        this.f2257b = str;
    }

    /* renamed from: a */
    public LogicBoolean.ReturnType m4242a() {
        return LogicBoolean.ReturnType.number;
    }

    /* renamed from: a */
    public final void m4241a(C0451j c0451j, LogicBoolean logicBoolean, VariableScope.CachedWriter.Operator operator) {
        c0451j.m3793dH();
        double readNumber = logicBoolean.readNumber(c0451j);
        if (operator == VariableScope.CachedWriter.Operator.set) {
            mo4237a(c0451j, readNumber);
        } else if (operator == VariableScope.CachedWriter.Operator.add) {
            mo4237a(c0451j, mo4236a(c0451j, c0451j.f2864y) + readNumber);
        } else if (operator == VariableScope.CachedWriter.Operator.subtract) {
            mo4237a(c0451j, mo4236a(c0451j, c0451j.f2864y) - readNumber);
        } else {
            Core.m959n("setUnitDataFromLogic: unsupported operator");
        }
    }
}
