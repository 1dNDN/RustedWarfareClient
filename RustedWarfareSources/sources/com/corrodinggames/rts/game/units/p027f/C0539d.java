package com.corrodinggames.rts.game.units.p027f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/d.class */
public final class C0539d extends AbstractC0540e {

    /* renamed from: a */
    public RectF f3725a = new RectF();

    /* renamed from: b */
    public float f3726b;

    /* renamed from: c */
    public float f3727c;

    /* renamed from: d */
    public float f3728d;

    /* renamed from: e */
    public float f3729e;

    /* renamed from: f */
    public float f3730f;

    /* renamed from: g */
    public float f3731g;

    /* renamed from: h */
    public float f3732h;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0540e
    /* renamed from: a */
    public final boolean mo3085a(AbstractC0244am abstractC0244am) {
        float f = abstractC0244am.f6958el;
        float f2 = abstractC0244am.f6959em;
        return this.f3726b <= f && f <= this.f3727c && this.f3728d <= f2 && f2 <= this.f3729e && C0758f.m2147a(this.f3730f, this.f3731g, f, f2) < this.f3732h;
    }
}
