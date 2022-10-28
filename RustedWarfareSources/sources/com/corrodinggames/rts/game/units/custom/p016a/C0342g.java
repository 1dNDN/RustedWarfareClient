package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0463u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/g.class */
public class C0342g extends AbstractC0228w {

    /* renamed from: a */
    public C0339d f2149a;

    /* renamed from: b */
    public C0463u f2150b;

    /* renamed from: c */
    public EnumC0340e f2151c;

    public C0342g(C0339d c0339d, C0463u c0463u) {
        super((String) null);
        this.f2151c = EnumC0340e.disabled;
        String str = VariableScope.nullOrMissingString;
        m4178a((c0339d.f2057j != null ? str + c0339d.f2057j : str) + "_" + c0339d.f2048a);
        this.f2149a = c0339d;
        this.f2150b = c0463u;
        if (c0339d.f2082I != null) {
            this.f2150b = c0339d.f2082I;
        }
        this.f2151c = c0339d.f2136aK;
        if (this.f2151c == EnumC0340e.auto) {
            boolean z = false;
            boolean z2 = false;
            if (c0339d.f2105af != null && c0339d.f2106ag == null) {
                z2 = true;
            }
            if (c0339d.f2063p.m3708c()) {
                z = true;
                this.f2151c = EnumC0340e.upgrade;
            }
            if (z && !z2) {
                this.f2151c = EnumC0340e.upgrade;
            } else {
                this.f2151c = EnumC0340e.movementChange;
            }
            if (c0339d.f2081H != null) {
                this.f2151c = EnumC0340e.sameAsBuilding;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: P */
    public C0449h mo3950P() {
        return this.f2149a.f2065r;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: F */
    public boolean mo3955F() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public boolean mo3944d(AbstractC0244am abstractC0244am, boolean z) {
        return this.f2149a.f2085L;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: k */
    public boolean mo3938k(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2087N;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public boolean mo3937l(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2088O;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo3930u() {
        return super.mo3930u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo2987a(AbstractC0244am abstractC0244am, boolean z) {
        C0451j c0451j = (C0451j) abstractC0244am;
        if (!this.f2149a.f2086M && c0451j.mo3228a(m4185N(), z) > 0) {
            return false;
        }
        if (this.f2149a.f2067t != null) {
            if (z && mo3949Q()) {
                if (!C0785ad.m1902a(this.f2149a.f2067t, c0451j)) {
                    return false;
                }
            } else if (!this.f2149a.f2067t.read(c0451j)) {
                return false;
            }
        }
        return super.mo2987a(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3942g(AbstractC0244am abstractC0244am) {
        if (m3948a(abstractC0244am, -1)) {
            return true;
        }
        return super.mo3942g(abstractC0244am);
    }

    /* renamed from: a */
    public boolean m3948a(AbstractC0244am abstractC0244am, int i) {
        if (this.f2149a.f2072y != null && (i == -1 || i == 1)) {
            if (!(abstractC0244am instanceof C0451j)) {
                AbstractC0916l.m943n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1708r().mo3403i() + " is not a custom unit");
                return false;
            } else if (this.f2149a.f2072y.read((C0451j) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2149a.f2074A != null && (i == -1 || i == 2)) {
            if (!(abstractC0244am instanceof C0451j)) {
                AbstractC0916l.m943n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1708r().mo3403i() + " is not a custom unit");
                return false;
            } else if (this.f2149a.f2074A.read((C0451j) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2149a.f2076C != null) {
            if (i == -1 || i == 3) {
                if (!(abstractC0244am instanceof C0451j)) {
                    AbstractC0916l.m943n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1708r().mo3403i() + " is not a custom unit");
                    return false;
                } else if (this.f2149a.f2076C.read((C0451j) abstractC0244am)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public String mo3939j(AbstractC0244am abstractC0244am) {
        if (m3948a(abstractC0244am, 1) && this.f2149a.f2073z != null) {
            return this.f2149a.f2073z.m3863b(abstractC0244am);
        }
        if (m3948a(abstractC0244am, 2) && this.f2149a.f2075B != null) {
            return this.f2149a.f2075B.m3863b(abstractC0244am);
        }
        if (m3948a(abstractC0244am, 3) && this.f2149a.f2077D != null) {
            return this.f2149a.f2077D.m3863b(abstractC0244am);
        }
        return super.mo3939j(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: r */
    public boolean mo3933r(AbstractC0244am abstractC0244am) {
        C0451j c0451j = (C0451j) abstractC0244am;
        if (this.f2149a.f2068u != null) {
            if (mo3949Q()) {
                return C0785ad.m1902a(this.f2149a.f2068u, c0451j);
            }
            return this.f2149a.f2068u.read(c0451j);
        }
        return super.mo2985b(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo2985b(AbstractC0244am abstractC0244am) {
        C0451j c0451j = (C0451j) abstractC0244am;
        if (this.f2149a.f2068u != null) {
            return this.f2149a.f2068u.read(c0451j);
        }
        return super.mo2985b(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3947a(AbstractC0244am abstractC0244am, AbstractC0197n abstractC0197n) {
        if (!this.f2149a.f2069v && !this.f2149a.f2070w) {
            return false;
        }
        if (abstractC0244am.f1609bV.m4264d(abstractC0197n)) {
            return this.f2149a.f2069v;
        }
        return this.f2149a.f2070w;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: o_ */
    public C0424b mo3934o_() {
        C0424b mo3963b = this.f1461h.mo3963b();
        if (mo3963b != null) {
            return mo3963b;
        }
        return this.f2149a.f2064q;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo2984b(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2149a.f2131aF) {
            return this.f2149a.f2063p.m3731a(abstractC0244am, true);
        }
        return super.mo2984b(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        return super.mo3014d();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        String str = null;
        if (this.f2149a.f2050c != null) {
            str = this.f2149a.f2050c.m3864b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3945d(AbstractC0244am abstractC0244am) {
        InterfaceC0303as typeOrNull;
        String str = null;
        if (this.f2149a.f2050c != null) {
            str = this.f2149a.f2050c.m3863b(abstractC0244am);
        }
        if (this.f2149a.f2051d != null && (typeOrNull = this.f2149a.f2051d.getTypeOrNull(abstractC0244am)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo3411e();
        }
        if (this.f2149a.f2054g != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + this.f2149a.f2054g.m3830b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        String str = null;
        if (this.f2149a.f2055h != null) {
            str = this.f2149a.f2055h.m3864b();
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public String mo3943e(AbstractC0244am abstractC0244am) {
        AbstractC0244am unitReferenceOrNull;
        AbstractC0244am unitOrSharedUnit;
        InterfaceC0303as typeOrNull;
        String str = null;
        if (this.f2149a.f2055h != null) {
            str = this.f2149a.f2055h.m3863b(abstractC0244am);
        }
        if (this.f2149a.f2052e != null && (typeOrNull = this.f2149a.f2052e.getTypeOrNull(abstractC0244am)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo3409f();
        }
        if (this.f2149a.f2053f != null) {
            if (this.f2149a.f2053f.getUnitReferenceOrNull(abstractC0244am) != null) {
                if (str == null) {
                    str = VariableScope.nullOrMissingString;
                } else if (!str.equals(VariableScope.nullOrMissingString)) {
                    str = str + "\n\n";
                }
                str = str + C0760a.m1997a(unitReferenceOrNull, false, false, false);
            } else {
                if (this.f2149a.f2053f.getUnitOrSharedUnit(abstractC0244am) != null) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString;
                    } else if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + "\n\n";
                    }
                    str = str + C0760a.m1997a(unitOrSharedUnit, false, false, true);
                }
            }
        }
        return str;
    }

    /* renamed from: L */
    public boolean m3951L() {
        return this.f2149a.f2093T;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
    /* renamed from: K */
    public float mo3182K() {
        if (this.f2149a.f2091R >= 1.0f) {
            return 1000.0f;
        }
        return this.f2149a.f2091R;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        return this.f2149a.f2056i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: B */
    public C0424b mo3957B() {
        C0424b mo3970a = this.f1461h.mo3970a();
        if (mo3970a != null) {
            return mo3970a;
        }
        return this.f2149a.f2063p;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo2983c() {
        return mo3957B().m3738a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo2977i() {
        if (this.f2150b == null) {
            return null;
        }
        return this.f2150b.mo3362c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: y */
    public InterfaceC0303as mo3928y() {
        if (this.f2149a.f2082I != null) {
            return this.f2149a.f2082I.mo3362c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: E */
    public InterfaceC0303as mo3956E() {
        if (this.f2149a.f2081H != null) {
            return this.f2149a.f2081H.mo3362c();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: A */
    public boolean mo3958A() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        if (this.f2149a.f2082I != null) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        return this.f2149a.f2129aD;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public boolean mo3936m(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2079F.read((C0451j) abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n */
    public boolean mo3935n(AbstractC0244am abstractC0244am) {
        if (this.f2149a.f2078E == null) {
            return false;
        }
        if (!(abstractC0244am instanceof C0451j)) {
            AbstractC0916l.m982b("ai_isHighPriority non customUnit:" + abstractC0244am.mo1708r().mo3403i());
            return false;
        }
        return this.f2149a.f2078E.read((C0451j) abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: v */
    public EnumC0340e mo3929v(AbstractC0244am abstractC0244am) {
        return this.f2151c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: H */
    public boolean mo3954H() {
        return this.f2149a.f2083J;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: I */
    public boolean mo3953I() {
        return this.f2149a.f2084K;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public C0934e mo3041j() {
        return this.f2149a.f2121av;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public C0934e mo3941h(AbstractC0244am abstractC0244am) {
        if (this.f2149a.f2124ay != null && (abstractC0244am instanceof C0451j) && !C0785ad.m1902a(this.f2149a.f2124ay, (C0451j) abstractC0244am)) {
            return null;
        }
        return this.f2149a.f2122aw;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: J */
    public int mo3952J() {
        return this.f2149a.f2123ax;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public AbstractC0244am mo3940i(AbstractC0244am abstractC0244am) {
        if (this.f2149a.f2125az != null) {
            return this.f2149a.f2125az.getUnitOrSharedUnit(abstractC0244am);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo3932s(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2126aA;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public boolean mo3931t(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2127aB;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3043a(AbstractC0244am abstractC0244am) {
        if (this.f2149a.f2128aC != null) {
            return C0785ad.m1902a(this.f2149a.f2128aC, (C0451j) abstractC0244am);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: Q */
    public boolean mo3949Q() {
        return this.f2149a.f2061n;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo3946a(AbstractC0623y abstractC0623y) {
        if (this.f2149a.f2103ad != null) {
            C0785ad.m1900b(abstractC0623y, this.f2149a.f2103ad);
        }
    }
}
