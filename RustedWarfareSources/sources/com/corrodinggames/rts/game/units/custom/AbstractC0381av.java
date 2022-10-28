package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.av */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/av.class */
public abstract class AbstractC0381av extends AbstractC0377ar {
    /* renamed from: a */
    public abstract double mo3844a(C0451j c0451j);

    /* renamed from: b */
    public abstract void mo3840b(C0451j c0451j, double d);

    public AbstractC0381av(int i, String str) {
        super(i, str);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: a */
    public double mo3842a(C0451j c0451j, C0359aq c0359aq) {
        return mo3844a(c0451j);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: a */
    public void mo3843a(C0451j c0451j, double d) {
        c0451j.m3489dH();
        mo3840b(c0451j, d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: b */
    public boolean mo3841b() {
        return true;
    }
}
