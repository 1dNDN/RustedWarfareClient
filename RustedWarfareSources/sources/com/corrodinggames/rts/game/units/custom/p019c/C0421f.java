package com.corrodinggames.rts.game.units.custom.p019c;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/f.class */
public class C0421f extends AbstractC0544i {

    /* renamed from: a */
    public C0418c f2684a;

    /* renamed from: b */
    public C0416a f2685b;

    /* renamed from: c */
    public AbstractC0244am f2686c;

    /* renamed from: d */
    public float f2687d;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -3;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
        return abstractC0623y.f1609bV;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        C0449h mo3486df;
        if (abstractC0623y != abstractC0244am && (mo3486df = abstractC0244am.mo3486df()) != null && C0448g.m3572a(this.f2685b.f2665a, mo3486df)) {
            if (abstractC0623y.f1609bV != abstractC0244am.f1609bV) {
                if (abstractC0623y.f1609bV.m4264d(abstractC0244am.f1609bV)) {
                    if (!this.f2685b.f2666b) {
                        return;
                    }
                } else if (!abstractC0623y.f1609bV.m4276c(abstractC0244am.f1609bV) || !this.f2685b.f2667c) {
                    return;
                }
            }
            float m2147a = C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
            if (m2147a < this.f2687d) {
                C0420e m3744a = this.f2684a.m3744a(this.f2685b, false);
                if (m3744a == null || m3744a.m3741a(abstractC0244am) == null) {
                    this.f2686c = abstractC0244am;
                    this.f2687d = m2147a;
                }
            }
        }
    }
}
