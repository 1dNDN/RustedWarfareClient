package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.Core;

/* renamed from: com.corrodinggames.rts.game.units.a.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/q.class */
public class C0222q extends AbstractC0221p {
    public C0222q() {
        super("c__cut_chat");
    }

    /* renamed from: b */
    public String mo3085b() {
        return "Team Chat";
    }

    /* renamed from: a */
    public String mo3088a() {
        return "Send a team chat message to your allies";
    }

    /* renamed from: c */
    public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
        Core.m1087A().f6117bS.f5114d.m2026o();
        return true;
    }

    /* renamed from: M */
    public C0639ad m4923M() {
        return Core.m1087A().f6118bT.f4102u;
    }
}
