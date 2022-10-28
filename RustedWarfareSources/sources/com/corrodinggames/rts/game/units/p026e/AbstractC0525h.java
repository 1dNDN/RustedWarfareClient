package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
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

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        if (mo3327db()) {
            return AbstractC0529j.f3651dM[this.f1609bV.m5105O()];
        }
        return f3635n[this.f1609bV.m5105O()];
    }

    /* renamed from: K */
    public static void m3315K() {
        f3634m = Core.m1087A().f6113bO.mo221a(C0067R.drawable.unit_icon_hover);
        f3635n = AbstractC0197n.m5082a(f3634m);
    }

    /* renamed from: h */
    public EnumC0246ao mo3039h() {
        return EnumC0246ao.f1708f;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (m4751bS() && !this.f1607bT && m4724cJ()) {
            if (this.f1617cd > 0.0f) {
                this.f3633l += f;
            }
            if (this.f3633l > 10.0f) {
                this.f3633l = 0.0f;
                if (mo3348p_()) {
                    C0745e m2365b = Core.m1087A().f6116bR.m2365b(this.f6958el + (C0758f.m2092i(this.f1618ce) * 4.0f), this.f6959em + (C0758f.m2097h(this.f1618ce) * 4.0f), 0.0f, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
                    if (m2365b != null) {
                        m2365b.f4787ar = 0;
                        m2365b.f4786aq = 13;
                        m2365b.f4788as = (short) 1;
                        m2365b.f4736s = true;
                        m2365b.f4749F = 0.8f;
                        m2365b.f4767X = 80.0f;
                        m2365b.f4766W = 80.0f;
                        m2365b.f4760Q = (-C0758f.m2092i(this.f1618ce)) * 0.1f;
                        m2365b.f4761R = (-C0758f.m2097h(this.f1618ce)) * 0.1f;
                        m2365b.f4769Z = C0758f.m2136c(-180.0f, 180.0f);
                    }
                }
            }
        }
    }
}
