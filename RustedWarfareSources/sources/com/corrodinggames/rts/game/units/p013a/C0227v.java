package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;

/* renamed from: com.corrodinggames.rts.game.units.a.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/v.class */
public class C0227v extends AbstractC0224s {

    /* renamed from: a */
    InterfaceC0303as f1489a;

    /* renamed from: b */
    int f1490b;

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C0227v c0227v = (C0227v) obj;
        if (this.f1490b != c0227v.f1490b || this.f1489a != c0227v.f1489a) {
            return false;
        }
        return super.equals(obj);
    }

    public C0227v(InterfaceC0303as interfaceC0303as) {
        this(interfaceC0303as, 1, null);
    }

    public C0227v(InterfaceC0303as interfaceC0303as, int i, Integer num) {
        super("b_" + interfaceC0303as.mo3379v());
        this.f1490b = 1;
        InterfaceC0303as m3417c = C0453l.m3417c(interfaceC0303as);
        if (m3417c != null) {
            interfaceC0303as = m3417c;
            m4178a("b_" + interfaceC0303as.mo3379v());
        }
        if (i != 1) {
            m4178a(m4185N() + "_" + i);
        }
        this.f1489a = interfaceC0303as;
        this.f1490b = i;
        if (num != null) {
            this.f1460g = num.intValue();
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo2977i() {
        return this.f1489a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: y */
    public InterfaceC0303as mo3928y() {
        return this.f1489a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public int mo4164t() {
        return this.f1490b;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        String mo3409f = mo2977i().mo3409f();
        AbstractC0244am m4100c = AbstractC0244am.m4100c(mo2977i());
        if (this.f1490b != 1 && (m4100c instanceof AbstractC0623y)) {
            ((AbstractC0623y) m4100c).mo2912a(this.f1490b);
        }
        String str = mo3409f + "\n\n" + C0760a.m1997a(m4100c, false, false, true);
        if (this.f1490b != 1 && (m4100c instanceof AbstractC0623y)) {
            ((AbstractC0623y) m4100c).mo2912a(1);
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        InterfaceC0303as mo2977i = mo2977i();
        String mo3411e = mo2977i().mo3411e();
        if (!(mo2977i instanceof C0453l)) {
            if (mo4164t() == 2) {
                mo3411e = mo3411e + " T-2";
            }
            if (mo4164t() == 3) {
                mo3411e = mo3411e + " T-3";
            }
        }
        return mo3411e;
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
        return mo2977i().mo3413d(mo4164t());
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: o_ */
    public C0424b mo3934o_() {
        C0424b mo3963b = this.f1461h.mo3963b();
        if (mo3963b != null) {
            return mo3963b;
        }
        return mo2977i().mo3457B();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo2984b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        return EnumC0226u.placeBuilding;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        return EnumC0225t.building;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: k_ */
    public boolean mo4165k_() {
        return !mo2977i().mo3456C();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3942g(AbstractC0244am abstractC0244am) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (((mo2977i() == EnumC0249ar.AntiNukeLaucher || mo2977i() == EnumC0249ar.NukeLaucher) && m1071A.m1058N() && m1071A.f6170bX.f5570aO.f5660i) || mo2977i().mo3378w()) {
            return true;
        }
        return super.mo3942g(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo3930u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: D */
    public boolean mo4166D() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: p */
    public float mo4163p(AbstractC0244am abstractC0244am) {
        AbstractC0244am m2927X;
        if ((abstractC0244am instanceof AbstractC0623y) && (m2927X = ((AbstractC0623y) abstractC0244am).m2927X()) != null && m2927X.f1624ck < 1.0f && m2927X.mo1708r() == mo2977i()) {
            return m2927X.f1624ck;
        }
        return -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: r */
    public boolean mo3933r(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo3966a(abstractC0244am, true);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo2985b(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo3966a(abstractC0244am, false);
    }
}
