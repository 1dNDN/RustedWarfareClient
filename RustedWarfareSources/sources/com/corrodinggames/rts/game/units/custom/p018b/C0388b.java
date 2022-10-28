package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.p024d.C0510r;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/b.class */
public class C0388b extends AbstractC0387a {

    /* renamed from: a */
    public static final AbstractC0387a f2327a = new C0388b();

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo3798b(C0451j c0451j, float f) {
        c0451j.f2860u += f;
        if (c0451j.f2860u > 40.0f && c0451j.m2835aq()) {
            c0451j.f2860u = 0.0f;
            C0510r.m3197a((AbstractC0623y) c0451j, f, 0.0f, false);
        }
    }
}
