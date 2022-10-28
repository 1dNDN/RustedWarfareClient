package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* renamed from: com.corrodinggames.rts.game.units.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/k.class */
public enum EnumC0216k {
    normal,
    attack,
    defend,
    nuke,
    build,
    upgrade,
    ok,
    no,
    happy,
    sad,
    retreat;

    /* renamed from: a */
    public String m4194a() {
        return " - " + m4193b();
    }

    /* renamed from: b */
    public String m4193b() {
        return C0820a.m1681a(m4192c(), new Object[0]);
    }

    /* renamed from: c */
    public String m4192c() {
        return "menus.ingame.ping.type." + name();
    }
}
