package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;

/* renamed from: com.corrodinggames.rts.game.units.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/l.class */
public class C0217l extends AbstractC0228w {

    /* renamed from: a */
    InterfaceC0303as f1458a;

    public C0217l(InterfaceC0303as interfaceC0303as, Integer num) {
        super("u_" + interfaceC0303as.mo3379v());
        InterfaceC0303as m3417c = C0453l.m3417c(interfaceC0303as);
        if (m3417c != null) {
            interfaceC0303as = m3417c;
            m4178a("u_" + interfaceC0303as.mo3379v());
        }
        if (num != null) {
            this.f1460g = num.intValue();
        }
        this.f1458a = interfaceC0303as;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return this.f1458a.mo3409f() + "\n\n" + C0760a.m1997a(AbstractC0244am.m4100c(this.f1458a), false, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        return this.f1458a.mo3411e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo2983c() {
        return mo3957B().m3738a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: B */
    public C0424b mo3957B() {
        C0424b mo3970a = this.f1461h.mo3970a();
        if (mo3970a != null) {
            return mo3970a;
        }
        return this.f1458a.mo3380u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: o_ */
    public C0424b mo3934o_() {
        C0424b mo3963b = this.f1461h.mo3963b();
        if (mo3963b != null) {
            return mo3963b;
        }
        return this.f1458a.mo3457B();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo2977i() {
        return this.f1458a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
    /* renamed from: K */
    public float mo3182K() {
        return this.f1458a.mo3455D();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        return EnumC0225t.queueUnit;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: k_ */
    public boolean mo4165k_() {
        return !this.f1458a.mo3456C();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3942g(AbstractC0244am abstractC0244am) {
        if (mo2977i().mo3378w()) {
            return true;
        }
        return super.mo3942g(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        return true;
    }
}
