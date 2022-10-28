package com.corrodinggames.rts.gameFramework.p045m.p046a;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p045m.C1030a;

/* renamed from: com.corrodinggames.rts.gameFramework.m.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/a/c.class */
public class C1033c extends AbstractC1031a {

    /* renamed from: a */
    Integer f6628a;

    /* renamed from: b */
    Integer f6629b;

    /* renamed from: c */
    AbstractC0197n f6630c;

    /* renamed from: d */
    InterfaceC0303as f6631d;

    /* renamed from: e */
    boolean f6632e;

    /* renamed from: f */
    boolean f6633f;

    /* renamed from: g */
    boolean f6634g;

    /* renamed from: h */
    boolean f6635h;

    /* renamed from: i */
    boolean f6636i;

    /* renamed from: j */
    boolean f6637j;

    /* renamed from: k */
    int f6638k;

    /* renamed from: l */
    boolean f6639l;

    /* renamed from: m */
    boolean f6640m;

    /* renamed from: n */
    boolean f6641n;

    /* renamed from: o */
    C0448g f6642o;

    /* renamed from: p */
    boolean f6643p;

    /* renamed from: d */
    public static C1033c m781d(C1030a c1030a) {
        C1033c c1033c = new C1033c();
        c1033c.f6628a = c1030a.m790d("maxUnits");
        int i = 1;
        if (c1033c.f6628a != null) {
            i = 0;
        }
        c1033c.f6629b = Integer.valueOf(c1030a.m804a("minUnits", i));
        c1033c.f6630c = c1030a.m809a();
        InterfaceC0303as interfaceC0303as = null;
        String m796b = c1030a.m796b("unitType");
        if (m796b != null) {
            interfaceC0303as = EnumC0249ar.m4052a(m796b);
            if (interfaceC0303as == null) {
                c1030a.m787g("Cound not find unitType:" + m796b);
            }
        }
        c1033c.f6631d = interfaceC0303as;
        c1033c.f6632e = c1030a.m800a("onlybuildings", "onlyBuildings", false);
        c1033c.f6634g = c1030a.m799a("onlyMainBuildings", false);
        c1033c.f6635h = c1030a.m799a("onlyOnResourcePool", false);
        c1033c.f6633f = c1030a.m800a("onlyidle", "onlyIdle", false);
        c1033c.f6638k = c1030a.m804a("onlyTechLevel", -1);
        c1033c.f6637j = c1030a.m799a("onlyBuilders", false);
        c1033c.f6636i = c1030a.m799a("onlyEmptyQueue", false);
        c1033c.f6639l = c1030a.m799a("onlyAttack", false);
        c1033c.f6640m = c1030a.m799a("onlyAttackAir", false);
        c1033c.f6641n = c1030a.m799a("onlyIfEmpty", false);
        String m796b2 = c1030a.m796b("onlyWithTag");
        if (m796b2 != null && !m796b2.equals(VariableScope.nullOrMissingString)) {
            try {
                c1033c.f6642o = C0448g.m3566b(m796b2);
            } catch (C0412bm e) {
                throw new C0179f(e.getMessage());
            }
        }
        c1033c.f6643p = c1030a.m799a("includeIncomplete", false);
        return c1033c;
    }

    @Override // com.corrodinggames.rts.gameFramework.p045m.p046a.AbstractC1031a
    /* renamed from: b */
    public boolean mo782b(C1030a c1030a) {
        return m780e(c1030a);
    }

    /* renamed from: e */
    public boolean m780e(C1030a c1030a) {
        int i = 0;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if ((this.f6630c == null || abstractC0244am.f1609bV == this.f6630c) && (abstractC0244am instanceof AbstractC0623y) && abstractC0244am.f1651cL == null && c1030a.m808a(abstractC0244am) && (this.f6631d == null || abstractC0244am.mo1708r() == this.f6631d)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if ((this.f6643p || abstractC0244am.m4103bS()) && ((!this.f6639l || abstractC0244am.mo2958l()) && ((!this.f6640m || (abstractC0244am.mo2958l() && abstractC0623y.mo2846af())) && ((!this.f6632e || abstractC0244am.mo3288bI()) && ((!this.f6634g || (abstractC0244am.mo3288bI() && abstractC0244am.mo3192bJ())) && ((!this.f6635h || abstractC0244am.mo1708r().mo3389p()) && ((!this.f6637j || abstractC0244am.mo2841ak()) && ((!this.f6633f || abstractC0623y.m2835aq()) && ((!this.f6636i || abstractC0623y.mo3263a((C0448g) null) <= 0) && ((this.f6638k == -1 || abstractC0244am.mo2929V() == this.f6638k) && ((this.f6642o == null || C0448g.m3573a(this.f6642o, abstractC0244am.mo3487dc())) && (!this.f6641n || abstractC0623y.mo2807bB() <= 0)))))))))))) {
                    i++;
                }
            }
        }
        if (i >= this.f6629b.intValue()) {
            if (this.f6628a == null || i <= this.f6628a.intValue()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
