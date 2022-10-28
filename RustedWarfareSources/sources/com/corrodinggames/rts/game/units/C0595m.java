package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.Core;
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

    /* renamed from: b */
    public String mo3085b() {
        return mo3129d();
    }

    /* renamed from: d */
    public String mo3129d() {
        C0555h m3216L = C0555h.m3216L();
        if (m3216L == null) {
            return "<NULL>";
        }
        if (this.f3857b) {
            return m3216L.f3793F.m3122a();
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
    public void m3123n() {
        C0555h m3216L = C0555h.m3216L();
        if (m3216L == null) {
            Core.m998b("Editor not active");
        } else if (this.f3857b) {
        } else {
            m3216L.f3793F = m3216L.f3793F.m3119a(this.f3856a);
        }
    }

    /* renamed from: a */
    public String mo3088a() {
        return "Change unit tab in editor";
    }

    /* renamed from: l */
    public float mo3128l() {
        if (!C0797f.f5248bB) {
            return 0.8f;
        }
        return 0.5f;
    }

    /* renamed from: m */
    public int mo3127m() {
        if (this.f3857b) {
            return 2;
        }
        return 4;
    }

    /* renamed from: f */
    public EnumC0225t mo3079f() {
        if (this.f3857b) {
            return EnumC0225t.f1471g;
        }
        return super.mo3079f();
    }

    /* renamed from: e */
    public EnumC0226u mo3081e() {
        if (this.f3857b) {
            return EnumC0226u.f1483i;
        }
        return super.mo3081e();
    }
}
