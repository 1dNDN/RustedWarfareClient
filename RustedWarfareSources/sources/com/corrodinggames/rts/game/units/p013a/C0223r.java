package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.Core;

/* renamed from: com.corrodinggames.rts.game.units.a.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/r.class */
public class C0223r extends AbstractC0221p {
    public C0223r() {
        super("c__cut_ping");
    }

    /* renamed from: b */
    public String mo3085b() {
        return "Map Ping";
    }

    /* renamed from: a */
    public String mo3088a() {
        return "Send a map ping to your allies";
    }

    /* renamed from: c */
    public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
        Core.m1087A().f6117bS.m1914H();
        return true;
    }

    /* renamed from: M */
    public C0639ad m4921M() {
        return Core.m1087A().f6118bT.f4103v;
    }
}
