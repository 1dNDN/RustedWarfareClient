package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0639ad;

/* renamed from: com.corrodinggames.rts.game.units.a.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/q.class */
public class C0222q extends AbstractC0221p {
    public C0222q() {
        super("c__cut_chat");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        return "Team Chat";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return "Send a team chat message to your allies";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public boolean mo3042c(AbstractC0244am abstractC0244am, boolean z) {
        AbstractC0916l.m1071A().f6165bS.f5114d.m1965o();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: M */
    public C0639ad mo4186M() {
        return AbstractC0916l.m1071A().f6166bT.f4102u;
    }
}
