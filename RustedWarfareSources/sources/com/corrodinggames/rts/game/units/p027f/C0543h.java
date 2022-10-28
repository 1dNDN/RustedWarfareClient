package com.corrodinggames.rts.game.units.p027f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/h.class */
public final class C0543h extends AbstractC0540e {

    /* renamed from: a */
    public RectF f3740a = new RectF();

    /* renamed from: b */
    public float f3741b;

    /* renamed from: c */
    public float f3742c;

    /* renamed from: d */
    public float f3743d;

    /* renamed from: e */
    public float f3744e;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0540e
    /* renamed from: a */
    public final boolean mo3085a(AbstractC0244am abstractC0244am) {
        float f = abstractC0244am.f1621ch;
        float f2 = abstractC0244am.f6958el;
        float f3 = abstractC0244am.f6959em;
        return this.f3741b - f <= f2 && f2 <= this.f3742c + f && this.f3743d - f <= f3 && f3 <= this.f3744e + f;
    }
}
