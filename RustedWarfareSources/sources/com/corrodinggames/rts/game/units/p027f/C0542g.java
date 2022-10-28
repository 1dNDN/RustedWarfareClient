package com.corrodinggames.rts.game.units.p027f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/g.class */
public final class C0542g extends AbstractC0540e {

    /* renamed from: a */
    public RectF f3735a = new RectF();

    /* renamed from: b */
    public float f3736b;

    /* renamed from: c */
    public float f3737c;

    /* renamed from: d */
    public float f3738d;

    /* renamed from: e */
    public float f3739e;

    /* renamed from: a */
    public void m3086a(float f, float f2, float f3, float f4) {
        this.f3736b = f;
        this.f3737c = f3;
        this.f3738d = f2;
        this.f3739e = f4;
        this.f3735a.m5022a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0540e
    /* renamed from: a */
    public final boolean mo3085a(AbstractC0244am abstractC0244am) {
        float f = abstractC0244am.f6958el;
        float f2 = abstractC0244am.f6959em;
        return this.f3736b <= f && f <= this.f3737c && this.f3738d <= f2 && f2 <= this.f3739e;
    }
}
