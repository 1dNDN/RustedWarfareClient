package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ac.class */
public class C0234ac extends AbstractC0544i {

    /* renamed from: a */
    public float f1511a;

    /* renamed from: b */
    public float f1512b;

    /* renamed from: c */
    public C0449h f1513c;

    /* renamed from: d */
    public float f1514d;

    /* renamed from: e */
    public AbstractC0244am f1515e;

    /* renamed from: f */
    public boolean f1516f;

    /* renamed from: g */
    public boolean f1517g = false;

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
        if (this.f1516f && abstractC0244am.mo3175g() <= 0.0f) {
            return;
        }
        float m2147a = C0758f.m2147a(this.f1511a, this.f1512b, abstractC0244am.f6958el, abstractC0244am.f6959em);
        if (m2147a < this.f1514d) {
            if (abstractC0244am.f1624ck < 1.0f && !this.f1517g) {
                return;
            }
            if (this.f1513c != null && !C0448g.m3572a(this.f1513c, abstractC0244am.mo3487dc())) {
                return;
            }
            if ((this.f1516f && !abstractC0623y.mo3033g(abstractC0244am, true)) || abstractC0244am.f1651cL != null) {
                return;
            }
            this.f1515e = abstractC0244am;
            this.f1514d = m2147a;
        }
    }
}
