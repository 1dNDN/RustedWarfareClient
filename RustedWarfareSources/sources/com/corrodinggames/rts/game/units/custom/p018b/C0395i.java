package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/i.class */
public class C0395i extends AbstractC0387a {

    /* renamed from: a */
    LogicBoolean f2433a;

    /* renamed from: b */
    float f2434b;

    /* renamed from: c */
    float f2435c;

    /* renamed from: d */
    C0449h f2436d;

    /* renamed from: e */
    boolean f2437e;

    /* renamed from: a */
    public static void m3815a(C0453l c0453l, C1072ab c1072ab) {
        if (c1072ab.m626g("movement_repelFromUnits")) {
            C0395i c0395i = new C0395i();
            c0395i.m3814a(c0453l, c1072ab, "movement_repelFromUnits", "movement_repelFromUnits");
            if (!LogicBoolean.isStaticFalse(c0395i.f2433a)) {
                c0453l.m3447a(c0395i);
            }
        }
    }

    /* renamed from: a */
    public void m3814a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        this.f2433a = c1072ab.m685a(c0453l, str, "enabled");
        this.f2434b = c1072ab.m621i(str, "speed");
        this.f2435c = c1072ab.m661a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.f2436d = C0448g.m3568a(c1072ab.m644b(str, "otherUnitHasTag", (String) null), (C0449h) null);
        this.f2437e = c1072ab.m663a(str, "onlySameTeam", (Boolean) false).booleanValue();
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo3798b(C0451j c0451j, float f) {
        if (!this.f2433a.read(c0451j)) {
        }
    }
}
