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
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/c.class */
public class C0324c extends AbstractC0544i {

    /* renamed from: a */
    public boolean f1940a;

    /* renamed from: b */
    public C0449h f1941b;

    /* renamed from: c */
    public float f1942c;

    /* renamed from: d */
    public boolean f1943d;

    /* renamed from: e */
    public EnumC0200q f1944e;

    /* renamed from: f */
    public boolean f1945f;

    /* renamed from: g */
    public C1101m f1946g = new C1101m();

    /* renamed from: h */
    public AbstractC0244am f1947h;

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
        if (this.f1941b == null || (mo3487dc != null && C0448g.m3572a(this.f1941b, mo3487dc))) {
            float m2147a = C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
            if (m2147a < this.f1942c) {
                if (abstractC0244am.f1624ck < 1.0f && !this.f1943d) {
                    return;
                }
                if (this.f1944e != null && !abstractC0623y.f1609bV.m4312a(this.f1944e, abstractC0244am.f1609bV)) {
                    return;
                }
                if (this.f1940a && !C1117y.m453b(abstractC0623y, abstractC0244am.f6958el, abstractC0244am.f6959em)) {
                    return;
                }
                if (!this.f1945f) {
                    this.f1947h = abstractC0244am;
                    this.f1942c = m2147a;
                    return;
                }
                this.f1946g.add(abstractC0244am);
            }
        }
    }
}
