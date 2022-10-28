package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/l.class */
public class C0594l extends AbstractC0229x {

    /* renamed from: a */
    boolean f3854a;

    /* renamed from: b */
    boolean f3855b;

    public C0594l(boolean z, boolean z2) {
        super("changeTypeFilter" + z + "d:" + z2);
        this.f3854a = z;
        this.f3855b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo2985b(AbstractC0244am abstractC0244am) {
        C0555h m3063L = C0555h.m3063L();
        return m3063L == null || m3063L.f3793F == EnumC0596n.types;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        if (this.f3855b) {
            C0555h m3063L = C0555h.m3063L();
            if (m3063L != null) {
                if (m3063L.f3792E != null) {
                    return m3063L.f3792E.m3005a();
                }
                return "All types";
            }
            return "Type Filter";
        } else if (this.f3854a) {
            return "<- Set type";
        } else {
            return "Set type ->";
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        if (!this.f3855b) {
            if (this.f3854a) {
                return "<-";
            }
            return "->";
        }
        C0555h m3063L = C0555h.m3063L();
        if (m3063L == null) {
            return "NA";
        }
        if (m3063L.f3792E == null) {
            return "All mods";
        }
        return m3063L.f3792E.m3005a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return "Change filtered type";
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
        if (this.f3855b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        if (this.f3855b) {
            return EnumC0225t.infoOnly;
        }
        return super.mo2980f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        if (this.f3855b) {
            return EnumC0226u.infoOnly;
        }
        return super.mo2982e();
    }
}
