package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/au.class */
public abstract class AbstractC0380au extends AbstractC0377ar {
    /* renamed from: a */
    public abstract double mo3846a(C0359aq c0359aq);

    /* renamed from: a */
    public abstract void mo3845a(C0359aq c0359aq, double d);

    public AbstractC0380au(int i, String str) {
        super(i, str);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: a */
    public double mo3842a(C0451j c0451j, C0359aq c0359aq) {
        return mo3846a(c0359aq);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: a */
    public void mo3843a(C0451j c0451j, double d) {
        c0451j.m3489dH();
        mo3845a(c0451j.f2864y, d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0377ar
    /* renamed from: b */
    public boolean mo3841b() {
        return false;
    }
}
