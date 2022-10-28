package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.e.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/h.class */
public abstract class AbstractC0525h extends AbstractC0529j {

    /* renamed from: l */
    float f3633l;

    /* renamed from: m */
    public static C0934e f3634m = null;

    /* renamed from: n */
    public static C0934e[] f3635n = new C0934e[10];

    public AbstractC0525h(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0934e mo2957v() {
        if (this.f1609bV.f1317k == -1) {
            return null;
        }
        if (mo3157db()) {
            return AbstractC0529j.f3651dM[this.f1609bV.m4327O()];
        }
        return f3635n[this.f1609bV.m4327O()];
    }

    /* renamed from: K */
    public static void m3148K() {
        f3634m = AbstractC0916l.m1071A().f6161bO.mo221a(C0067R.drawable.unit_icon_hover);
        f3635n = AbstractC0197n.m4304a(f3634m);
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo2960h() {
        return EnumC0246ao.HOVER;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (m4103bS() && !this.f1607bT && m4092cJ()) {
            if (this.f1617cd > 0.0f) {
                this.f3633l += f;
            }
            if (this.f3633l > 10.0f) {
                this.f3633l = 0.0f;
                if (mo2727p_()) {
                    C0745e m2295b = AbstractC0916l.m1071A().f6164bR.m2295b(this.f6958el + (C0758f.m2030i(this.f1618ce) * 4.0f), this.f6959em + (C0758f.m2035h(this.f1618ce) * 4.0f), 0.0f, EnumC0744d.custom, false, EnumC0748h.low);
                    if (m2295b != null) {
                        m2295b.f4787ar = 0;
                        m2295b.f4786aq = 13;
                        m2295b.f4788as = (short) 1;
                        m2295b.f4736s = true;
                        m2295b.f4749F = 0.8f;
                        m2295b.f4767X = 80.0f;
                        m2295b.f4766W = 80.0f;
                        m2295b.f4760Q = (-C0758f.m2030i(this.f1618ce)) * 0.1f;
                        m2295b.f4761R = (-C0758f.m2035h(this.f1618ce)) * 0.1f;
                        m2295b.f4769Z = C0758f.m2074c(-180.0f, 180.0f);
                    }
                }
            }
        }
    }
}
