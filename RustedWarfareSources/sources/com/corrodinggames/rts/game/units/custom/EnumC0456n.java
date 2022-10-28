package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/n.class */
enum EnumC0456n {
    move,
    attack,
    idle,
    created,
    underConstruction,
    underConstructionWithLinkedBuiltTime,
    queuedUnits,
    repair,
    reclaim;

    /* renamed from: a */
    public static EnumC0456n m3372a(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
