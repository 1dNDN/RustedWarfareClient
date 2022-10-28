package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.e.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/j.class */
public abstract class AbstractC0529j extends AbstractC0621w {

    /* renamed from: dI */
    float f3647dI;

    /* renamed from: dJ */
    public static C0934e f3648dJ = null;

    /* renamed from: dK */
    public static C0934e f3649dK = null;

    /* renamed from: dL */
    public static C0934e[] f3650dL = new C0934e[10];

    /* renamed from: dM */
    public static C0934e[] f3651dM = new C0934e[10];

    public AbstractC0529j(boolean z) {
        super(z);
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        if (mo3327db()) {
            return f3651dM[this.f1609bV.m5105O()];
        }
        return f3650dL[this.f1609bV.m5105O()];
    }

    /* renamed from: dq */
    public static void m3291dq() {
        Core m1087A = Core.m1087A();
        f3648dJ = m1087A.f6113bO.mo221a(C0067R.drawable.unit_icon_land);
        if (f3648dJ == null) {
            throw new RuntimeException("IMAGE_ICON is null");
        }
        f3650dL = AbstractC0197n.m5082a(f3648dJ);
        f3649dK = m1087A.f6113bO.mo221a(C0067R.drawable.unit_icon_land_exp);
        if (f3649dK == null) {
            throw new RuntimeException("IMAGE_ICON_EXP is null");
        }
        f3651dM = AbstractC0197n.m5082a(f3649dK);
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (this.f1607bT) {
            float f2 = 0.0f;
            if (m4724cJ()) {
                f2 = -10.0f;
            }
            if (this.f6960en > f2) {
                if (this.f6960en > 0.0f && this.f3647dI < 0.4f) {
                    this.f3647dI = 0.4f;
                }
                this.f3647dI += 0.002f * f;
                this.f6960en -= this.f3647dI * f;
                if (this.f6960en <= f2) {
                    this.f6960en = f2;
                }
            }
        }
        if (m4751bS() && !this.f1607bT && !(this instanceof AbstractC0525h)) {
            if (this.f6960en < 0.0f) {
                this.f6960en += 0.2f * f;
                if (this.f6960en >= 0.0f) {
                    this.f6960en = 0.0f;
                }
            }
            if (this.f6960en > 0.0f) {
                this.f3647dI += 0.03f * f;
                if (this.f6960en < 0.0f) {
                    this.f3647dI = C0758f.m2159b(this.f3647dI, 0.2f);
                }
                this.f6960en -= this.f3647dI * f;
                if (this.f6960en <= 0.0f) {
                    if (this.f6960en < 0.0f) {
                        this.f6960en = 0.0f;
                    }
                    this.f3647dI = 0.0f;
                }
            }
        }
    }

    /* renamed from: h */
    public EnumC0246ao mo3039h() {
        return EnumC0246ao.f1704b;
    }
}
