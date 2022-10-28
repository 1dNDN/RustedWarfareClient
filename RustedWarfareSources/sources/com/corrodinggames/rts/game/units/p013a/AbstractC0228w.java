package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.p024d.C0499j;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;

/* renamed from: com.corrodinggames.rts.game.units.a.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/w.class */
public abstract class AbstractC0228w extends AbstractC0224s {
    public AbstractC0228w(int i) {
        super(i);
    }

    public AbstractC0228w(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo2984b(AbstractC0244am abstractC0244am, boolean z) {
        if (!(abstractC0244am instanceof InterfaceC0501l)) {
            return 99;
        }
        return ((InterfaceC0501l) abstractC0244am).mo3228a(m4185N(), z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: p */
    public float mo4163p(AbstractC0244am abstractC0244am) {
        C0499j mo3225dt;
        if (!(abstractC0244am instanceof InterfaceC0501l) || (mo3225dt = ((InterfaceC0501l) abstractC0244am).mo3225dt()) == null || !m4174d(mo3225dt.f3494j)) {
            return -1.0f;
        }
        float f = mo3225dt.f3497m;
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: K */
    public float mo3182K() {
        return 0.01f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo3930u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        return EnumC0226u.popupQueue;
    }
}
