package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.ao */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ao.class */
public enum EnumC0246ao {
    NONE,
    LAND,
    BUILDING,
    AIR,
    WATER,
    HOVER,
    OVER_CLIFF,
    OVER_CLIFF_WATER;

    /* renamed from: a */
    public static EnumC0246ao m4068a(String str, String str2) {
        EnumC0246ao[] values;
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            String str3 = VariableScope.nullOrMissingString;
            for (int i = 0; i < values().length; i++) {
                str3 = str3 + ", " + values[i].toString();
            }
            throw new IllegalArgumentException("Unknown movement type:'" + str + "' possible type:" + str3 + " on key:" + str2);
        }
    }
}
