package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/j.class */
public class C0592j extends AbstractC0229x {

    /* renamed from: a */
    boolean f3850a;

    /* renamed from: b */
    boolean f3851b;

    public C0592j(boolean z, boolean z2) {
        super("changeModFilter" + z + "d:" + z2);
        this.f3850a = z;
        this.f3851b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo2985b(AbstractC0244am abstractC0244am) {
        C0555h m3063L = C0555h.m3063L();
        return m3063L == null || m3063L.f3793F == EnumC0596n.modded;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        if (this.f3851b) {
            C0555h m3063L = C0555h.m3063L();
            if (m3063L != null) {
                if (m3063L.f3791D != null) {
                    return m3063L.f3791D.m1641a();
                }
                return "All mods";
            }
            return "Mod Filter";
        } else if (this.f3850a) {
            return "<- Set mod";
        } else {
            return "Set mod ->";
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        if (!this.f3851b) {
            if (this.f3850a) {
                return "<-";
            }
            return "->";
        }
        C0555h m3063L = C0555h.m3063L();
        if (m3063L == null) {
            return "NA";
        }
        if (m3063L.f3791D == null) {
            return "All mods";
        }
        return m3063L.f3791D.m1636b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return "Change filtered mod";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public float mo3013l() {
        if (!C0797f.f5248bB) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public int mo3012m() {
        if (this.f3851b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        if (this.f3851b) {
            return EnumC0225t.infoOnly;
        }
        return super.mo2980f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        if (this.f3851b) {
            return EnumC0226u.infoOnly;
        }
        return super.mo2982e();
    }
}
