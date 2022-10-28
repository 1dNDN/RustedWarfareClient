package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/n.class */
public class C0335n extends AbstractC0544i {

    /* renamed from: a */
    public C0449h f2022a;

    /* renamed from: b */
    public float f2023b;

    /* renamed from: c */
    public boolean f2024c;

    /* renamed from: d */
    public EnumC0200q f2025d;

    /* renamed from: e */
    public C1101m f2026e;

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        C0449h mo3487dc = abstractC0244am.mo3487dc();
        if ((this.f2022a == null || (mo3487dc != null && C0448g.m3572a(this.f2022a, mo3487dc))) && C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em) < this.f2023b) {
            if (abstractC0244am.f1624ck < 1.0f && !this.f2024c) {
                return;
            }
            if (this.f2025d != null && !abstractC0623y.f1609bV.m4312a(this.f2025d, abstractC0244am.f1609bV)) {
                return;
            }
            this.f2026e.add(abstractC0244am);
        }
    }
}
