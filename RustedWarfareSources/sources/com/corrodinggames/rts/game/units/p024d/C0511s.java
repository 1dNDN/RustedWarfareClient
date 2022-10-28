package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.d.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/s.class */
public class C0511s extends AbstractC0544i {

    /* renamed from: a */
    public float f3545a;

    /* renamed from: b */
    public boolean f3546b;

    /* renamed from: c */
    public boolean f3547c;

    /* renamed from: d */
    AbstractC0197n f3548d;

    /* renamed from: e */
    AbstractC0244am f3549e;

    /* renamed from: f */
    float f3550f;

    /* renamed from: g */
    float f3551g;

    /* renamed from: h */
    boolean f3552h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0511s(boolean z) {
        this.f3546b = z;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return null;
    }

    /* renamed from: a */
    public void m3195a(float f, boolean z) {
        this.f3545a = f * f;
        this.f3552h = z;
        this.f3547c = true;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
        this.f3549e = null;
        this.f3550f = -1.0f;
        this.f3551g = -1.0f;
        this.f3548d = abstractC0623y.f1609bV;
        if (!this.f3547c) {
            throw new RuntimeException("AutoRepairCallback not ready");
        }
        this.f3547c = false;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0623y == abstractC0244am) {
            return;
        }
        if ((abstractC0244am.f1632cs < abstractC0244am.f1633ct || abstractC0244am.f1624ck < 1.0f) && !abstractC0244am.f1607bT && abstractC0244am.f1651cL == null && this.f3548d.m4264d(abstractC0244am.f1609bV) && abstractC0623y.mo2902a(abstractC0244am)) {
            float m2147a = C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
            if (m2147a < this.f3545a) {
                if (abstractC0244am.f1624ck < 1.0f && abstractC0623y.m2757g(abstractC0244am) != null) {
                    return;
                }
                boolean z = false;
                if (!this.f3552h) {
                    if (this.f3550f == -1.0f || this.f3550f > abstractC0244am.f1632cs) {
                        z = true;
                    }
                } else if (this.f3551g == -1.0f || this.f3551g > m2147a) {
                    z = true;
                }
                if (z && abstractC0244am.mo3175g() == 0.0f) {
                    this.f3550f = abstractC0244am.f1632cs;
                    this.f3551g = m2147a;
                    this.f3549e = abstractC0244am;
                }
            }
        }
    }
}
