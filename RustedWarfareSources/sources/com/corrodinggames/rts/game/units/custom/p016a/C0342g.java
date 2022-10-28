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
import com.corrodinggames.rts.gameFramework.Core;
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
        this.f2151c = EnumC0340e.f2138b;
        String str = VariableScope.nullOrMissingString;
        m4898a((c0339d.f2056j != null ? str + c0339d.f2056j : str) + "_" + c0339d.f2048a);
        this.f2149a = c0339d;
        this.f2150b = c0463u;
        if (c0339d.f2080I != null) {
            this.f2150b = c0339d.f2080I;
        }
        this.f2151c = c0339d.f2136aK;
        if (this.f2151c == EnumC0340e.f2137a) {
            boolean z = false;
            boolean z2 = false;
            if (c0339d.f2093af != null && c0339d.f2094ag == null) {
                z2 = true;
            }
            if (c0339d.f2061p.m4096c()) {
                z = true;
                this.f2151c = EnumC0340e.f2139c;
            }
            if (z && !z2) {
                this.f2151c = EnumC0340e.f2139c;
            } else {
                this.f2151c = EnumC0340e.f2140d;
            }
            if (c0339d.f2079H != null) {
                this.f2151c = EnumC0340e.f2141e;
            }
        }
    }

    /* renamed from: P */
    public C0449h m4346P() {
        return this.f2149a.f2063r;
    }

    /* renamed from: F */
    public boolean m4351F() {
        return true;
    }

    /* renamed from: d */
    public boolean m4339d(AbstractC0244am abstractC0244am, boolean z) {
        return this.f2149a.f2126L;
    }

    /* renamed from: k */
    public boolean m4332k(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2128N;
    }

    /* renamed from: l */
    public boolean m4331l(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2129O;
    }

    /* renamed from: u */
    public boolean mo4857u() {
        return super.mo4857u();
    }

    /* renamed from: a */
    public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
        C0451j c0451j = (C0451j) abstractC0244am;
        if (!this.f2149a.f2127M && c0451j.mo3438a(m4910N(), z) > 0) {
            return false;
        }
        if (this.f2149a.f2065t != null) {
            if (z && m4345Q()) {
                if (!C0785ad.m1954a(this.f2149a.f2065t, c0451j)) {
                    return false;
                }
            } else if (!this.f2149a.f2065t.read(c0451j)) {
                return false;
            }
        }
        return super.mo3086a(abstractC0244am, z);
    }

    /* renamed from: g */
    public boolean mo4864g(AbstractC0244am abstractC0244am) {
        if (m4343a(abstractC0244am, -1)) {
            return true;
        }
        return super.mo4864g(abstractC0244am);
    }

    /* renamed from: a */
    public boolean m4343a(AbstractC0244am abstractC0244am, int i) {
        if (this.f2149a.f2070y != null && (i == -1 || i == 1)) {
            if (!(abstractC0244am instanceof C0451j)) {
                Core.m959n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1758r().mo4474i() + " is not a custom unit");
                return false;
            } else if (this.f2149a.f2070y.read((C0451j) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2149a.f2072A != null && (i == -1 || i == 2)) {
            if (!(abstractC0244am instanceof C0451j)) {
                Core.m959n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1758r().mo4474i() + " is not a custom unit");
                return false;
            } else if (this.f2149a.f2072A.read((C0451j) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2149a.f2074C != null) {
            if (i == -1 || i == 3) {
                if (!(abstractC0244am instanceof C0451j)) {
                    Core.m959n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1758r().mo4474i() + " is not a custom unit");
                    return false;
                } else if (this.f2149a.f2074C.read((C0451j) abstractC0244am)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public String m4333j(AbstractC0244am abstractC0244am) {
        if (m4343a(abstractC0244am, 1) && this.f2149a.f2071z != null) {
            return this.f2149a.f2071z.m4257b(abstractC0244am);
        }
        if (m4343a(abstractC0244am, 2) && this.f2149a.f2073B != null) {
            return this.f2149a.f2073B.m4257b(abstractC0244am);
        }
        if (m4343a(abstractC0244am, 3) && this.f2149a.f2075D != null) {
            return this.f2149a.f2075D.m4257b(abstractC0244am);
        }
        return super.m4884j(abstractC0244am);
    }

    /* renamed from: r */
    public boolean mo4861r(AbstractC0244am abstractC0244am) {
        C0451j c0451j = (C0451j) abstractC0244am;
        if (this.f2149a.f2066u != null) {
            if (m4345Q()) {
                return C0785ad.m1954a(this.f2149a.f2066u, c0451j);
            }
            return this.f2149a.f2066u.read(c0451j);
        }
        return super.mo3084b(abstractC0244am);
    }

    /* renamed from: b */
    public boolean mo3084b(AbstractC0244am abstractC0244am) {
        C0451j c0451j = (C0451j) abstractC0244am;
        if (this.f2149a.f2066u != null) {
            return this.f2149a.f2066u.read(c0451j);
        }
        return super.mo3084b(abstractC0244am);
    }

    /* renamed from: a */
    public boolean m4342a(AbstractC0244am abstractC0244am, AbstractC0197n abstractC0197n) {
        if (!this.f2149a.f2067v && !this.f2149a.f2068w) {
            return false;
        }
        if (abstractC0244am.f1609bV.m5042d(abstractC0197n)) {
            return this.f2149a.f2067v;
        }
        return this.f2149a.f2068w;
    }

    /* renamed from: o_ */
    public C0424b mo4862o_() {
        C0424b mo4359b = this.f1461h.mo4359b();
        if (mo4359b != null) {
            return mo4359b;
        }
        return this.f2149a.f2062q;
    }

    /* renamed from: b */
    public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2149a.f2118aF) {
            return this.f2149a.f2061p.m4119a(abstractC0244am, true);
        }
        return super.mo3083b(abstractC0244am, z);
    }

    /* renamed from: d */
    public String mo3129d() {
        return super.mo3129d();
    }

    /* renamed from: b */
    public String mo3085b() {
        String str = null;
        if (this.f2149a.f2050c != null) {
            str = this.f2149a.f2050c.m4258b();
        }
        return str;
    }

    /* renamed from: d */
    public String mo4951d(AbstractC0244am abstractC0244am) {
        InterfaceC0303as typeOrNull;
        String str = null;
        if (this.f2149a.f2050c != null) {
            str = this.f2149a.f2050c.m4257b(abstractC0244am);
        }
        if (this.f2149a.f2051d != null && (typeOrNull = this.f2149a.f2051d.getTypeOrNull(abstractC0244am)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo4478e();
        }
        if (this.f2149a.f2054g != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + this.f2149a.f2054g.m4224b();
        }
        return str;
    }

    /* renamed from: a */
    public String mo3088a() {
        String str = null;
        if (this.f2149a.f2055h != null) {
            str = this.f2149a.f2055h.m4258b();
        }
        return str;
    }

    /* renamed from: e */
    public String mo4950e(AbstractC0244am abstractC0244am) {
        AbstractC0244am unitReferenceOrNull;
        AbstractC0244am unitOrSharedUnit;
        InterfaceC0303as typeOrNull;
        String str = null;
        if (this.f2149a.f2055h != null) {
            str = this.f2149a.f2055h.m4257b(abstractC0244am);
        }
        if (this.f2149a.f2052e != null && (typeOrNull = this.f2149a.f2052e.getTypeOrNull(abstractC0244am)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            } else if (!str.equals(VariableScope.nullOrMissingString)) {
                str = str + " ";
            }
            str = str + typeOrNull.mo4477f();
        }
        if (this.f2149a.f2053f != null) {
            if (this.f2149a.f2053f.getUnitReferenceOrNull(abstractC0244am) != null) {
                if (str == null) {
                    str = VariableScope.nullOrMissingString;
                } else if (!str.equals(VariableScope.nullOrMissingString)) {
                    str = str + "\n\n";
                }
                str = str + C0760a.m2059a(unitReferenceOrNull, false, false, false);
            } else {
                if (this.f2149a.f2053f.getUnitOrSharedUnit(abstractC0244am) != null) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString;
                    } else if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + "\n\n";
                    }
                    str = str + C0760a.m2059a(unitOrSharedUnit, false, false, true);
                }
            }
        }
        return str;
    }

    /* renamed from: L */
    public boolean m4347L() {
        return this.f2149a.f2132T;
    }

    /* renamed from: K */
    public float mo3369K() {
        if (this.f2149a.f2130R >= 1.0f) {
            return 1000.0f;
        }
        return this.f2149a.f2130R;
    }

    /* renamed from: e */
    public EnumC0226u mo3081e() {
        return this.f2149a.f2122i;
    }

    /* renamed from: B */
    public C0424b mo4866B() {
        C0424b mo4366a = this.f1461h.mo4366a();
        if (mo4366a != null) {
            return mo4366a;
        }
        return this.f2149a.f2061p;
    }

    /* renamed from: c */
    public int mo3082c() {
        return mo4866B().m4126a();
    }

    /* renamed from: i */
    public InterfaceC0303as mo6163i() {
        if (this.f2150b == null) {
            return null;
        }
        return this.f2150b.mo3643c();
    }

    /* renamed from: y */
    public InterfaceC0303as mo4859y() {
        if (this.f2149a.f2080I != null) {
            return this.f2149a.f2080I.mo3643c();
        }
        return null;
    }

    /* renamed from: E */
    public InterfaceC0303as m4352E() {
        if (this.f2149a.f2079H != null) {
            return this.f2149a.f2079H.mo3643c();
        }
        return null;
    }

    /* renamed from: A */
    public boolean m4354A() {
        return true;
    }

    /* renamed from: g */
    public boolean mo3078g() {
        if (this.f2149a.f2080I != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public EnumC0225t mo3079f() {
        return this.f2149a.f2134aD;
    }

    /* renamed from: m */
    public boolean m4330m(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2077F.read((C0451j) abstractC0244am);
    }

    /* renamed from: n */
    public boolean m4329n(AbstractC0244am abstractC0244am) {
        if (this.f2149a.f2076E == null) {
            return false;
        }
        if (!(abstractC0244am instanceof C0451j)) {
            Core.m998b("ai_isHighPriority non customUnit:" + abstractC0244am.mo1758r().mo4474i());
            return false;
        }
        return this.f2149a.f2076E.read((C0451j) abstractC0244am);
    }

    /* renamed from: v */
    public EnumC0340e m4323v(AbstractC0244am abstractC0244am) {
        return this.f2151c;
    }

    /* renamed from: H */
    public boolean m4350H() {
        return this.f2149a.f2124J;
    }

    /* renamed from: I */
    public boolean m4349I() {
        return this.f2149a.f2125K;
    }

    /* renamed from: j */
    public C0934e mo4939j() {
        return this.f2149a.f2109av;
    }

    /* renamed from: h */
    public C0934e mo4948h(AbstractC0244am abstractC0244am) {
        if (this.f2149a.f2112ay != null && (abstractC0244am instanceof C0451j) && !C0785ad.m1954a(this.f2149a.f2112ay, (C0451j) abstractC0244am)) {
            return null;
        }
        return this.f2149a.f2110aw;
    }

    /* renamed from: J */
    public int m4348J() {
        return this.f2149a.f2111ax;
    }

    /* renamed from: i */
    public AbstractC0244am mo4947i(AbstractC0244am abstractC0244am) {
        if (this.f2149a.f2113az != null) {
            return this.f2149a.f2113az.getUnitOrSharedUnit(abstractC0244am);
        }
        return null;
    }

    /* renamed from: s */
    public boolean m4326s(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2114aA;
    }

    /* renamed from: t */
    public boolean m4325t(AbstractC0244am abstractC0244am) {
        return this.f2149a.f2115aB;
    }

    /* renamed from: a */
    public boolean mo4955a(AbstractC0244am abstractC0244am) {
        if (this.f2149a.f2116aC != null) {
            return C0785ad.m1954a(this.f2149a.f2116aC, (C0451j) abstractC0244am);
        }
        return false;
    }

    /* renamed from: Q */
    public boolean m4345Q() {
        return this.f2149a.f2060n;
    }

    /* renamed from: a */
    public void m4341a(AbstractC0623y abstractC0623y) {
        if (this.f2149a.f2091ad != null) {
            C0785ad.m1952b(abstractC0623y, this.f2149a.f2091ad);
        }
    }
}
