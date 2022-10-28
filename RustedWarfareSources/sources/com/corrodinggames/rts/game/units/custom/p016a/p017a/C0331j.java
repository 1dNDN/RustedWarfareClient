package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0359aq;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0462t;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p028g.C0554e;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/j.class */
public class C0331j extends AbstractC0321a {

    /* renamed from: a */
    boolean f1980a;

    /* renamed from: b */
    boolean f1981b;

    /* renamed from: c */
    boolean f1982c;

    /* renamed from: d */
    LogicBoolean f1983d;

    /* renamed from: f */
    boolean f1985f;

    /* renamed from: g */
    float f1986g;

    /* renamed from: h */
    float f1987h;

    /* renamed from: i */
    C0462t f1988i;

    /* renamed from: j */
    boolean f1989j;

    /* renamed from: k */
    boolean f1990k;

    /* renamed from: m */
    C1080ai f1992m;

    /* renamed from: n */
    boolean f1993n;

    /* renamed from: o */
    VariableScope.CachedWriter f1994o;

    /* renamed from: e */
    int f1984e = Integer.MIN_VALUE;

    /* renamed from: l */
    float f1991l = -1.0f;

    /* renamed from: a */
    public static void m3976a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m663a(str, str2 + "resetUnitStats", (Boolean) false).booleanValue();
        String m644b = c1072ab.m644b(str, str2 + "setUnitStats", (String) null);
        if (booleanValue || m644b != null) {
            C0331j c0331j = new C0331j();
            c0331j.f1993n = booleanValue;
            if (m644b != null) {
                c0331j.f1994o = C0359aq.m3852a(m644b, c0453l, str, str2 + "setUnitStats");
            }
            c0339d.f2101ab.add(c0331j);
        }
        boolean booleanValue2 = c1072ab.m663a(str, str2 + "deleteSelf", (Boolean) false).booleanValue();
        if (booleanValue2) {
            C0331j c0331j2 = new C0331j();
            c0331j2.f1980a = booleanValue2;
            c0339d.f2101ab.add(c0331j2);
        }
        boolean booleanValue3 = c1072ab.m663a(str, str2 + "switchToNeutralTeam", (Boolean) false).booleanValue();
        boolean booleanValue4 = c1072ab.m663a(str, str2 + "switchToAggressiveTeam", (Boolean) false).booleanValue();
        LogicBoolean m681a = c1072ab.m681a(c0453l, str, str2 + "switchToTeam", (LogicBoolean) null, LogicBoolean.ReturnType.number);
        if (booleanValue3 || booleanValue4 || m681a != null) {
            C0331j c0331j3 = new C0331j();
            c0331j3.f1981b = booleanValue3;
            c0331j3.f1982c = booleanValue4;
            c0331j3.f1983d = m681a;
            c0339d.f2101ab.add(c0331j3);
        }
        int intValue = c1072ab.m645b(str, str2 + "setBodyRotation", (Integer) Integer.MIN_VALUE).intValue();
        if (intValue != Integer.MIN_VALUE) {
            C0331j c0331j4 = new C0331j();
            c0331j4.f1984e = intValue;
            c0339d.f2101ab.add(c0331j4);
        }
        float floatValue = c1072ab.m661a(str, str2 + "setBuilt", Float.valueOf(-1.0f)).floatValue();
        if (floatValue > 1.0f) {
            throw new C0412bm("[" + str + "] setBuilt cannot be greater than 1");
        }
        boolean booleanValue5 = c1072ab.m663a(str, str2 + "clearAllActionCooldowns", (Boolean) false).booleanValue();
        float floatValue2 = c1072ab.m639c(str, str2 + "addAllActionCooldownsTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue2 == 0.0f) {
            floatValue2 = c1072ab.m639c(str, str2 + "addAllActionCooldownsFor", Float.valueOf(0.0f)).floatValue();
        }
        float floatValue3 = c1072ab.m639c(str, str2 + "addActionCooldownTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue3 == 0.0f) {
            floatValue3 = c1072ab.m639c(str, str2 + "addActionCooldownFor", Float.valueOf(0.0f)).floatValue();
        }
        C0462t m680a = c1072ab.m680a(c0453l, str, str2 + "addActionCooldownApplyToActions", (C0462t) null);
        C1080ai m664a = c1072ab.m664a(str, str2 + "offsetSelfAbsolute", (C1080ai) null);
        if (m680a != null && floatValue3 <= 0.0f) {
            throw new C0412bm("[" + str + "]addActionCooldownApplyToActions requires addActionCooldownTime to be set");
        }
        boolean booleanValue6 = c1072ab.m663a(str, str2 + "removeAllQueuedItemsWithoutRefund", (Boolean) false).booleanValue();
        boolean booleanValue7 = c1072ab.m663a(str, str2 + "refundAllQueuedItems", (Boolean) false).booleanValue();
        if (booleanValue6 && booleanValue7) {
            throw new C0412bm("[" + str + "]Cannot set removeAllQueuedActionsWithoutRefund and refundAllQueuedActions at the same time, pick one.");
        }
        if (floatValue3 > 0.0f || floatValue2 > 0.0f || booleanValue5 || floatValue >= 0.0f || m664a != null || booleanValue6 || booleanValue7) {
            C0331j c0331j5 = new C0331j();
            c0331j5.f1985f = booleanValue5;
            c0331j5.f1986g = floatValue2;
            c0331j5.f1987h = floatValue3;
            c0331j5.f1988i = m680a;
            c0331j5.f1991l = floatValue;
            c0331j5.f1992m = m664a;
            c0331j5.f1989j = booleanValue6;
            c0331j5.f1990k = booleanValue7;
            c0339d.f2101ab.add(c0331j5);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        AbstractC0197n m4239k;
        if (this.f1993n) {
            c0451j.f2864y = c0451j.f2863x.f3094cJ;
            c0451j.f1633ct = c0451j.f2864y.f2240c;
            if (c0451j.f1632cs > c0451j.f1633ct) {
                c0451j.m4073o(c0451j.f1633ct);
            }
            c0451j.f1638cy = c0451j.f2864y.f2244g;
            if (c0451j.f1635cv > c0451j.f1638cy) {
                c0451j.f1635cv = c0451j.f1638cy;
            }
        }
        if (this.f1994o != null) {
            this.f1994o.writeToUnit(c0451j);
            C0424b.m3702d(c0451j);
        }
        if (this.f1980a) {
            c0451j.m4088ch();
            if (c0451j.mo3288bI()) {
                AbstractC0916l.m1071A().f6167bU.m1149a(c0451j);
            }
        }
        if (this.f1981b) {
            c0451j.mo3473e(AbstractC0197n.f1314i);
        }
        if (this.f1982c) {
            c0451j.mo3473e(AbstractC0197n.f1313h);
        }
        if (this.f1983d != null && (m4239k = AbstractC0197n.m4239k((int) this.f1983d.readNumber(c0451j))) != null) {
            c0451j.mo3473e(m4239k);
        }
        if (this.f1984e != Integer.MIN_VALUE) {
            c0451j.mo2756h(this.f1984e);
        }
        if (this.f1985f) {
            C0554e.m3066c(c0451j, AbstractC0224s.f1462i);
        }
        if (this.f1989j) {
            c0451j.m3466i(false);
        }
        if (this.f1990k) {
            c0451j.m3466i(true);
        }
        if (this.f1986g > 0.0f) {
            C0554e.m3072a(c0451j, AbstractC0224s.f1462i, (int) this.f1986g);
        }
        if (this.f1987h > 0.0f) {
            if (this.f1988i == null) {
                C0554e.m3072a(c0451j, abstractC0224s.m4185N(), (int) this.f1987h);
            } else {
                Iterator it = this.f1988i.m3368a().iterator();
                while (it.hasNext()) {
                    C0554e.m3072a(c0451j, ((AbstractC0224s) it.next()).m4185N(), (int) this.f1987h);
                }
            }
        }
        if (this.f1991l >= 0.0f) {
            c0451j.m4071r(this.f1991l);
            c0451j.f1625cl = this.f1991l;
        }
        if (this.f1992m != null) {
            c0451j.m2824b(c0451j.f6958el + this.f1992m.f6849a, c0451j.f6959em + this.f1992m.f6850b);
            c0451j.f6960en += this.f1992m.f6851c;
            c0451j.f1648cI = true;
            return true;
        }
        return true;
    }
}
