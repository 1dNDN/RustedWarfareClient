package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ah.class */
public class C0239ah extends AbstractC0544i {

    /* renamed from: a */
    public int f1534a;

    /* renamed from: b */
    public float[] f1535b = new float[31];

    /* renamed from: c */
    public boolean[] f1536c = new boolean[31];

    /* renamed from: d */
    int f1537d;

    /* renamed from: e */
    public boolean f1538e;

    /* renamed from: f */
    public boolean f1539f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0239ah(boolean z) {
        this.f1538e = z;
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
    public void m4147a(AbstractC0623y abstractC0623y) {
        float m2810b = abstractC0623y.m2810b(false);
        this.f1537d = abstractC0623y.mo2792bl();
        for (int i = 0; i < this.f1537d; i++) {
            float mo2712z = abstractC0623y.mo2712z(i);
            if (mo2712z > m2810b) {
                mo2712z = m2810b;
            }
            this.f1535b[i] = (mo2712z * mo2712z) + 1.0f;
            this.f1536c[i] = false;
            if (abstractC0623y.mo2718v(i) == -1 && abstractC0623y.f1649cJ[i].f1721j == null) {
                this.f1536c[i] = true;
            }
        }
        this.f1539f = true;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0544i
    public void setup(AbstractC0623y abstractC0623y, float f) {
        this.f1534a = 0;
        if (!this.f1539f) {
            throw new RuntimeException("PassiveTargetCallback not ready");
        }
        this.f1539f = false;
    }

    @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0545j
    public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
        if (abstractC0623y.m2816b(abstractC0244am, true)) {
            this.f1534a++;
            if (this.f1538e) {
                if (!(abstractC0244am instanceof AbstractC0623y)) {
                    return;
                }
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                if (!abstractC0623y2.mo2958l() || !abstractC0623y2.mo2742k(abstractC0623y)) {
                    return;
                }
            }
            float m2147a = C0758f.m2147a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
            for (int i = 0; i < this.f1537d; i++) {
                if (this.f1536c[i] && abstractC0623y.mo2908a(i, abstractC0244am, true, false) && m2147a < this.f1535b[i] && m2147a > abstractC0623y.mo2955A(i)) {
                    this.f1535b[i] = m2147a;
                    abstractC0623y.f1649cJ[i].f1721j = abstractC0244am;
                }
            }
        }
    }
}
