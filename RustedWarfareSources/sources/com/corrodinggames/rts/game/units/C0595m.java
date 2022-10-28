package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/m.class */
public class C0595m extends AbstractC0229x {

    /* renamed from: a */
    boolean f3856a;

    /* renamed from: b */
    boolean f3857b;

    public C0595m(boolean z, boolean z2) {
        super("changeUnitTab" + z + "d:" + z2);
        this.f3856a = z;
        this.f3857b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        return mo3014d();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        C0555h m3063L = C0555h.m3063L();
        if (m3063L == null) {
            return "<NULL>";
        }
        if (this.f3857b) {
            return m3063L.f3793F.m3010a();
        }
        String str = VariableScope.nullOrMissingString;
        if (this.f3856a) {
            str = str + "<- ";
        }
        if (!this.f3856a) {
            str = str + " ->";
        }
        return str;
    }

    /* renamed from: n */
    public void m3011n() {
        C0555h m3063L = C0555h.m3063L();
        if (m3063L == null) {
            AbstractC0916l.m982b("Editor not active");
        } else if (this.f3857b) {
        } else {
            m3063L.f3793F = m3063L.f3793F.m3008a(this.f3856a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return "Change unit tab in editor";
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
        if (this.f3857b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        if (this.f3857b) {
            return EnumC0225t.infoOnly;
        }
        return super.mo2980f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        if (this.f3857b) {
            return EnumC0226u.infoOnly;
        }
        return super.mo2982e();
    }
}
