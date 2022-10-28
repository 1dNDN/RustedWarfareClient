package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/m.class */
public class C0455m {

    /* renamed from: a */
    public boolean f3311a;

    /* renamed from: b */
    public float f3312b;

    /* renamed from: c */
    public int f3313c;

    /* renamed from: d */
    public int f3314d;

    /* renamed from: e */
    public float f3315e;

    /* renamed from: a */
    public static C0455m m3373a(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        C0455m c0455m = new C0455m();
        c0455m.f3311a = c1072ab.m663a(str, str2 + "direction_useMainTurret", (Boolean) false).booleanValue();
        c0455m.f3312b = c1072ab.m661a(str, str2 + "direction_units", Float.valueOf(0.0f)).floatValue();
        c0455m.f3313c = c1072ab.m645b(str, str2 + "direction_strideX", (Integer) (-1)).intValue();
        c0455m.f3314d = c1072ab.m645b(str, str2 + "direction_strideY", (Integer) (-1)).intValue();
        c0455m.f3315e = c1072ab.m661a(str, str2 + "direction_starting", Float.valueOf(0.0f)).floatValue();
        if (c0455m.f3312b == 0.0f) {
            return null;
        }
        return c0455m;
    }
}
