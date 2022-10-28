package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0727bl;

/* renamed from: com.corrodinggames.rts.a.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/m.class */
public class C0084m extends AbstractC0083l {
    /* renamed from: a */
    public void m4828a() {
        AbstractC0916l.m963e("Unit Reference tests");
        C0453l c0453l = C0453l.f2904b;
        AbstractC0623y m3426a = C0453l.m3426a(false, c0453l);
        m3426a.mo2819b(AbstractC0197n.f1314i);
        C0451j m3426a2 = C0453l.m3426a(false, c0453l);
        m3426a2.mo2819b(AbstractC0197n.f1314i);
        m3426a2.f6958el = 2.0f;
        C0451j m3426a3 = C0453l.m3426a(false, c0453l);
        m3426a3.mo2819b(AbstractC0197n.f1314i);
        m3426a3.f6958el = 3.0f;
        C0451j m3426a4 = C0453l.m3426a(false, c0453l);
        m3426a4.mo2819b(AbstractC0197n.f1314i);
        m3426a4.f6958el = 3.0f;
        m3426a2.m3556C(m3426a3);
        m3426a2.m3556C(m3426a4);
        C0451j m3426a5 = C0453l.m3426a(false, c0453l);
        m3426a5.mo2819b(AbstractC0197n.f1314i);
        AbstractC0244am m3426a6 = C0453l.m3426a(false, c0453l);
        m3426a6.mo2819b(AbstractC0197n.f1314i);
        AbstractC0244am m3426a7 = C0453l.m3426a(false, c0453l);
        m3426a7.mo2819b(AbstractC0197n.f1314i);
        m3426a.f1580bt = m3426a5;
        m3426a5.f1581bu = m3426a6;
        m3426a3.f1581bu = m3426a6;
        m3426a2.f1580bt = m3426a7;
        AbstractC0916l.m963e("=== unit reference tests == (runs:2)");
        Long valueOf = Long.valueOf(C0727bl.m2370a());
        for (int i = 0; i < 2; i++) {
            m4826a(m3426a, m4825a("self"), m3426a);
            m4826a(m3426a, m4825a("self.parent"), null);
            m4824a("self.unknown", true);
            m4826a(m3426a, m4825a("self.parent"), null);
            m4826a(m3426a, m4825a("nullUnit"), null);
            m4826a(m3426a, m4825a("self.customTarget1"), m3426a5);
            m4826a(m3426a, m4825a("self.customTarget1.customTarget2"), m3426a6);
            m4826a(m3426a, m4825a("self.customTarget2"), null);
            m4826a(m3426a, m4825a("self.nullUnit"), null);
            m4826a(m3426a, m4825a("nullUnit.nullUnit"), null);
            m4826a(m3426a3, m4825a("self.parent.customTarget1"), m3426a7);
            m4826a(m3426a2, m4825a("self.transporting(slot=0)"), m3426a3);
            m4826a(m3426a2, m4825a("self.transporting(SLOT=0)"), m3426a3);
            m4824a("self.transporting(MISS=0)", true);
            m4826a(m3426a2, m4825a("self.transporting(slot=3)"), null);
            m4826a(m3426a2, m4825a("self.transporting"), m3426a3);
            m4826a(m3426a2, m4825a("self.transporting(slot=0).customTarget2"), m3426a6);
            m4826a(m3426a2, m4825a("self.self.transporting(slot=0).customTarget2"), m3426a6);
            m4826a(m3426a2, m4825a("self.SELF.TRANsporting(slot=0).customTarget2"), m3426a6);
            m4826a(m3426a2, m4825a("self.SELF.transporting(slot=0).customTarget2"), m3426a6);
            m4827a(m3426a, m4825a("self.nearestUnit(withinRange=500, withTag='test', relation='any')"));
            m4824a(VariableScope.nullOrMissingString, true);
        }
        AbstractC0916l.m963e("Took: " + C0727bl.m2367a(valueOf.longValue(), Long.valueOf(C0727bl.m2370a()).longValue()));
    }

    /* renamed from: a */
    public void m4824a(String str, boolean z) {
        try {
            UnitReference.parseSingleUnitReferenceBlock(C0453l.f2904b, str);
            throw new RuntimeException("assertCreateError got no error for: " + str);
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class && e.getClass() != BooleanParseException.class) {
                throw new RuntimeException(e);
            }
            if (z) {
                AbstractC0916l.m963e("(debug)assertCreateError: " + str + " expected-error:" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public UnitReference m4825a(String str) {
        try {
            UnitReference parseSingleUnitReferenceBlock = UnitReference.parseSingleUnitReferenceBlock(C0453l.f2904b, str);
            if (parseSingleUnitReferenceBlock == null) {
                throw new RuntimeException("Null when parsing [" + str + "]");
            }
            return parseSingleUnitReferenceBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage() + " parsing [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public void m4826a(AbstractC0623y abstractC0623y, UnitReference unitReference, AbstractC0244am abstractC0244am) {
        AbstractC0244am abstractC0244am2 = unitReference.get(abstractC0623y);
        if (abstractC0244am2 != abstractC0244am) {
            throw new RuntimeException("assertSame type expected:" + AbstractC0244am.m4132A(abstractC0244am) + " got: " + AbstractC0244am.m4132A(abstractC0244am2));
        }
    }

    /* renamed from: a */
    public void m4827a(AbstractC0623y abstractC0623y, UnitReference unitReference) {
        unitReference.get(abstractC0623y);
    }
}
