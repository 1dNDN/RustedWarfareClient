package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ae.class */
public class C0236ae extends AbstractC0544i {

    /* renamed from: a */
    public int f1524a;

    /* renamed from: b */
    public float f1525b;

    /* renamed from: c */
    public boolean f1526c;

    /* renamed from: d */
    public boolean f1527d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0236ae(boolean z) {
        this.f1526c = z;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public int excludeTeam(AbstractC0623y abstractC0623y) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
        return abstractC0623y.f1609bV;
    }

    /* renamed from: a */
    public void m4150a(float f) {
        this.f1525b = (f * f) + 1.0f;
        this.f1527d = true;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
        this.f1524a = 0;
        if (!this.f1527d) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f1527d = false;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0623y.m2816b(abstractC0244am, true)) {
            this.f1524a++;
            if (this.f1526c) {
                if (!(abstractC0244am instanceof AbstractC0623y)) {
                    return;
                }
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                if (!abstractC0623y2.mo2958l() || !abstractC0623y2.mo2742k(abstractC0623y)) {
                    return;
                }
            }
            float m2147a = C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
            if (m2147a < this.f1525b) {
                this.f1525b = m2147a;
                abstractC0623y.f3898Q = abstractC0244am;
            }
        }
    }
}
