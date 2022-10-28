package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/a.class */
public abstract class AbstractC0423a {
    /* renamed from: a */
    public abstract void mo3693a(AbstractC0244am abstractC0244am);

    /* renamed from: b */
    public abstract boolean mo3687b(AbstractC0244am abstractC0244am);

    /* renamed from: a */
    public abstract void mo3692a(AbstractC0244am abstractC0244am, double d);

    /* renamed from: b */
    public abstract boolean mo3686b(AbstractC0244am abstractC0244am, double d);

    /* renamed from: c */
    public boolean m3740c(AbstractC0244am abstractC0244am) {
        if (mo3687b(abstractC0244am)) {
            mo3693a(abstractC0244am);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m3739c(AbstractC0244am abstractC0244am, double d) {
        if (mo3686b(abstractC0244am, d)) {
            mo3692a(abstractC0244am, d);
            return true;
        }
        return false;
    }
}
