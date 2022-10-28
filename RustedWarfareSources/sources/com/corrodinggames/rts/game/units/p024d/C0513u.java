package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/u.class */
public class C0513u extends AbstractC0228w {
    public C0513u() {
        super(C0512t.f3559g.m4214a());
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return "-Allows factory to build Tech 2 units";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        return C0820a.m1681a("gui.actions.upgradeT2", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo2983c() {
        return EnumC0249ar.seaFactory.mo4044c(2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
    /* renamed from: K */
    public float mo3182K() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo2987a(AbstractC0244am abstractC0244am, boolean z) {
        C0512t c0512t = (C0512t) abstractC0244am;
        if (c0512t.f3430r != 1 || c0512t.mo3228a(m4185N(), z) > 0) {
            return false;
        }
        return super.mo2987a(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo2985b(AbstractC0244am abstractC0244am) {
        if (((C0512t) abstractC0244am).f3430r != 1) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: L */
    public EnumC0249ar mo2977i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        return EnumC0225t.upgrade;
    }
}
