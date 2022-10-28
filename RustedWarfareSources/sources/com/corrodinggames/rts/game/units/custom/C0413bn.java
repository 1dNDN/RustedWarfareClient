package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bn */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bn.class */
public class C0413bn {

    /* renamed from: a */
    C1101m f2634a;

    /* renamed from: a */
    public static C0413bn m3923a(String str, String str2, String str3) {
        return m3920b(null, str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0413bn m3927a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        return m3926a(c0453l, c1072ab.m649b(str, str2, (String) null), str, str2, false);
    }

    /* renamed from: b */
    public static C0413bn m3921b(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        return m3926a(c0453l, c1072ab.m649b(str, str2, (String) null), str, str2, true);
    }

    /* renamed from: a */
    public static C0413bn m3926a(C0453l c0453l, String str, String str2, String str3, boolean z) {
        if (c0453l == null) {
            throw new RuntimeException("meta==null");
        }
        return m3920b(c0453l, str, str2, str3, z);
    }

    /* renamed from: b */
    public static C0413bn m3920b(C0453l c0453l, String str, String str2, String str3, boolean z) {
        int m3930a;
        C0413bn c0413bn = new C0413bn();
        if (str == null || VariableScope.nullOrMissingString.equals(str) || "NONE".equalsIgnoreCase(str)) {
            return c0413bn;
        }
        Iterator it = C0758f.m2092b(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] m2054f = C0758f.m2054f(trim, "(");
                    if (m2054f == null) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
                    }
                    trim = m2054f[0];
                    str4 = m2054f[1].trim();
                }
                String[] split = trim.split("\\*");
                String str5 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                C0463u c0463u = new C0463u();
                c0463u.f3348a = str3;
                c0463u.f3349b = str2;
                c0463u.f3350c = str5;
                if (c0453l != null) {
                    c0453l.f2918p.add(c0463u);
                } else {
                    c0463u.mo3466a();
                }
                C0414bo c0414bo = new C0414bo(c0463u);
                if (c0413bn.f2634a == null) {
                    c0413bn.f2634a = new C1101m();
                }
                c0414bo.f2649d = i;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                    Iterator it2 = C0758f.m2120a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str6 = (String) it2.next();
                        if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] m2054f2 = C0758f.m2054f(str6, "=");
                            if (m2054f2 == null) {
                                throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                            }
                            String trim2 = m2054f2[0].trim();
                            String trim3 = m2054f2[1].trim();
                            if (trim2.equalsIgnoreCase("neutralTeam")) {
                                c0414bo.f2638e = C1072ab.m629g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("setToTeamOfLastAttacker")) {
                                c0414bo.f2640g = C1072ab.m629g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("aggressiveTeam")) {
                                c0414bo.f2639f = C1072ab.m629g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("spawnChance")) {
                                c0414bo.f2650h = C1072ab.m627h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                c0414bo.f2651i = C1072ab.m625i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("techLevel")) {
                                c0414bo.f2653m = C1072ab.m625i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("gridAlign")) {
                                c0414bo.f2652j = C1072ab.m629g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("skipIfOverlapping")) {
                                c0414bo.f2641k = C1072ab.m629g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("falling")) {
                                c0414bo.f2642l = C1072ab.m629g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("transportedUnitsToTransfer")) {
                                c0414bo.f2648w = (short) C1072ab.m625i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwaysStartDirAtZero")) {
                                c0414bo.f2643n = C1072ab.m629g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwayStartDirAtZero")) {
                                c0414bo.f2643n = C1072ab.m629g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetX")) {
                                c0414bo.f2654o = C1072ab.m627h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetY")) {
                                c0414bo.f2655p = C1072ab.m627h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                float m627h = C1072ab.m627h(str2, str3, trim3);
                                c0414bo.f2644s = m627h;
                                c0414bo.f2645t = m627h;
                            } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                c0414bo.f2644s = C1072ab.m627h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                c0414bo.f2645t = C1072ab.m627h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                c0414bo.f2656q = C1072ab.m627h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                c0414bo.f2646u = C1072ab.m627h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                c0414bo.f2657r = C1072ab.m627h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("addResources")) {
                                if (c0453l == null) {
                                    throw new C0412bm("[" + str2 + "]" + str3 + " addResources not supported from here");
                                }
                                try {
                                    c0414bo.f2647v = C0424b.m3875b(c0453l, trim3);
                                } catch (C0412bm e) {
                                    e.printStackTrace();
                                    throw new C0412bm("[" + str2 + "]" + str3 + " addResources:" + e.getMessage());
                                }
                            } else if (trim2.equalsIgnoreCase("spawnSource")) {
                                c0414bo.f2636b = C1072ab.m679a(trim3, c0453l, str2, str3, (LogicBoolean) null);
                            } else if (trim2.equalsIgnoreCase("copyWaypointsFrom")) {
                                c0414bo.f2637c = C1072ab.m679a(trim3, c0453l, str2, str3, (LogicBoolean) null);
                            } else {
                                throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                            }
                        }
                    }
                    if (c0414bo.f2640g && c0414bo.f2638e) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " Cannot set setToTeamOfLastAttacker and neutralTeam at same time in " + str);
                    }
                    if (c0414bo.f2639f && c0414bo.f2638e) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and neutralTeam at same time in " + str);
                    }
                    if (c0414bo.f2639f && c0414bo.f2640g) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and setToTeamOfLastAttacker at same time in " + str);
                    }
                }
                c0413bn.f2634a.add(c0414bo);
            }
        }
        if (z && (m3930a = c0413bn.m3930a()) > 1) {
            throw new C0412bm("[" + str2 + "]" + str3 + " Too many units: " + m3930a + ", only single unit is allowed here");
        }
        return c0413bn;
    }

    /* renamed from: a */
    public int m3930a() {
        if (this.f2634a == null || this.f2634a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f2634a.iterator();
        while (it.hasNext()) {
            i += ((C0414bo) it.next()).f2649d;
        }
        return i;
    }

    /* renamed from: b */
    public boolean m3922b() {
        if (this.f2634a == null || this.f2634a.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m3924a(C1101m c1101m, AbstractC0197n abstractC0197n, AbstractC0244am abstractC0244am, boolean z) {
        m3928a(0.0f, 0.0f, 0.0f, 0.0f, abstractC0197n, false, abstractC0244am, c1101m, z);
    }

    /* renamed from: a */
    public void m3929a(float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n, boolean z, AbstractC0244am abstractC0244am) {
        m3928a(f, f2, f3, f4, abstractC0197n, z, abstractC0244am, null, false);
    }

    /* renamed from: a */
    public void m3928a(float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n, boolean z, AbstractC0244am abstractC0244am, C1101m c1101m, boolean z2) {
        if (this.f2634a == null || this.f2634a.size() == 0) {
            return;
        }
        boolean z3 = false;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int i = 0;
        int i2 = 0;
        Iterator it = this.f2634a.iterator();
        while (it.hasNext()) {
            C0414bo c0414bo = (C0414bo) it.next();
            AbstractC0197n abstractC0197n2 = abstractC0197n;
            AbstractC0244am abstractC0244am2 = abstractC0244am;
            float f5 = f;
            float f6 = f2;
            float f7 = f3;
            float f8 = f4;
            if (c0414bo.f2636b != null) {
                if (!(abstractC0244am2 instanceof AbstractC0623y)) {
                    LoggerMaybe.m990b("spawnUnitsAt: sourceUnit!=OrderableUnit is:" + AbstractC0244am.m4518A(abstractC0244am2));
                } else {
                    AbstractC0244am readUnit = c0414bo.f2636b.readUnit((AbstractC0623y) abstractC0244am);
                    if (readUnit == null) {
                        LoggerMaybe.m990b("spawnUnitsAt: spawnSource==null");
                    } else {
                        abstractC0197n2 = readUnit.f1609bV;
                        abstractC0244am2 = readUnit;
                        f5 = readUnit.f6957el;
                        f6 = readUnit.f6958em;
                        f7 = readUnit.f6959en;
                        f8 = readUnit.f1618ce;
                        if (abstractC0197n2 == null) {
                            LoggerMaybe.m990b("spawnUnitsAt: newSpawnSource.team==null");
                        }
                    }
                }
            }
            if (!z2) {
                if (abstractC0197n2.m4628u() > abstractC0197n2.m4627v() + 300) {
                    z3 = true;
                }
            } else if (abstractC0197n2.m4696a(true, false) > abstractC0197n2.m4627v() + 20000) {
                z3 = true;
            }
            if (z3) {
                String str = VariableScope.nullOrMissingString;
                if (abstractC0244am2 != null) {
                    str = str + "source:" + abstractC0244am2.m4429cz();
                }
                LoggerMaybe.m990b("spawnUnitsAt: Skipping, too many units already on team:" + abstractC0197n2.f1306k + " count:" + abstractC0197n2.m4628u() + " " + str);
                if (LoggerMaybe.m1079A().f6231bl) {
                    abstractC0197n2.m4721T();
                }
            } else if (abstractC0197n2.m4630s() > abstractC0197n2.m4627v() + 25000) {
                String str2 = VariableScope.nullOrMissingString;
                if (abstractC0244am2 != null) {
                    str2 = str2 + "source:" + abstractC0244am2.m4429cz();
                }
                LoggerMaybe.m990b("spawnUnitsAt: Failsafe, too many units already on team (including ignored):" + abstractC0197n2.f1306k + " total count:" + abstractC0197n2.m4630s() + " " + str2);
                if (LoggerMaybe.m1079A().f6231bl) {
                    abstractC0197n2.m4721T();
                }
            } else {
                InterfaceC0303as mo5756c = c0414bo.f2635a.mo5756c();
                if (mo5756c != null) {
                    for (int i3 = 0; i3 < c0414bo.f2649d; i3++) {
                        i2++;
                        AbstractC0197n abstractC0197n3 = abstractC0197n2;
                        if (c0414bo.f2650h >= 1.0f || C0758f.m2141a(abstractC0244am2, 0.0f, 1.0f, i2) <= c0414bo.f2650h) {
                            if (c0414bo.f2640g) {
                                if (abstractC0244am2 != null && abstractC0244am2.f1579bs != null) {
                                    abstractC0197n3 = abstractC0244am2.f1579bs.f1609bV;
                                    if (abstractC0197n3 == null) {
                                        throw new RuntimeException("setToTeamOfLastAttacker targetTeam==null");
                                    }
                                }
                            }
                            if (i >= c0414bo.f2651i) {
                                continue;
                            } else {
                                AbstractC0244am mo4234a = mo5756c.mo4234a();
                                if (c0414bo.f2638e) {
                                    abstractC0197n3 = AbstractC0197n.f1371i;
                                }
                                if (c0414bo.f2639f) {
                                    abstractC0197n3 = AbstractC0197n.f1370h;
                                }
                                if (abstractC0197n3 == null) {
                                    throw new RuntimeException("Team==null");
                                }
                                mo4234a.m4405f(abstractC0197n3);
                                mo4234a.m4517B(abstractC0244am2);
                                mo4234a.f6957el = f5;
                                mo4234a.f6958em = f6;
                                mo4234a.f6959en = f7;
                                if (!mo4234a.m4485bI() && !c0414bo.f2643n) {
                                    mo4234a.f1618ce = f8;
                                }
                                mo4234a.f6959en += c0414bo.f2656q;
                                if (c0414bo.f2653m != -1 && (mo4234a instanceof AbstractC0623y)) {
                                    ((AbstractC0623y) mo4234a).mo3185a(c0414bo.f2653m);
                                }
                                float f9 = c0414bo.f2657r;
                                if (c0414bo.f2646u != 0.0f) {
                                    f9 += C0758f.m2141a(abstractC0244am2, -c0414bo.f2646u, c0414bo.f2646u, (i2 * 4) + 3);
                                }
                                if (f9 != 0.0f) {
                                    if (mo4234a instanceof AbstractC0623y) {
                                        ((AbstractC0623y) mo4234a).mo3226i(f9);
                                    } else {
                                        mo4234a.f1618ce += f9;
                                    }
                                }
                                mo4234a.f6957el += i3;
                                if (c0414bo.f2644s != 0.0f) {
                                    mo4234a.f6957el += C0758f.m2141a(abstractC0244am2, -c0414bo.f2644s, c0414bo.f2644s, (i2 * 2) + 1);
                                }
                                if (c0414bo.f2645t != 0.0f) {
                                    mo4234a.f6958em += C0758f.m2141a(abstractC0244am2, -c0414bo.f2645t, c0414bo.f2645t, (i2 * 3) + 2);
                                }
                                if (c0414bo.f2652j) {
                                    m1079A.f6110bL.m4926b(mo4234a.f6957el, mo4234a.f6958em);
                                    mo4234a.f6957el = m1079A.f6110bL.f801T;
                                    mo4234a.f6958em = m1079A.f6110bL.f802U;
                                    mo4234a.f6957el += mo4234a.mo3299cX();
                                    mo4234a.f6958em += mo4234a.mo3298cY();
                                }
                                mo4234a.f6957el += c0414bo.f2654o;
                                mo4234a.f6958em += c0414bo.f2655p;
                                i++;
                                if (c0414bo.f2641k && (mo4234a instanceof AbstractC0623y) && !((AbstractC0623y) mo4234a).m2800c((AbstractC0197n) null)) {
                                    mo4234a.m4439ch();
                                } else {
                                    if (c0414bo.f2642l && (mo4234a instanceof AbstractC0623y)) {
                                        mo4234a.m4424da();
                                    }
                                    if (c0414bo.f2647v != null) {
                                        c0414bo.f2647v.m3860h(mo4234a);
                                    }
                                    if (c0414bo.f2648w > 0 && abstractC0244am2 != null && (abstractC0244am2 instanceof C0451j)) {
                                        C0451j c0451j = (C0451j) abstractC0244am2;
                                        if (c0451j.f2867B != null) {
                                            for (int i4 = c0414bo.f2648w; i4 > 0; i4--) {
                                                int i5 = -1;
                                                int size = c0451j.f2867B.size() - 1;
                                                while (true) {
                                                    if (size >= 0) {
                                                        if (mo4234a.m4472c((AbstractC0244am) c0451j.f2867B.get(size), true)) {
                                                            i5 = size;
                                                            break;
                                                        } else {
                                                            size--;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                if (i5 == -1) {
                                                    break;
                                                }
                                                AbstractC0244am abstractC0244am3 = (AbstractC0244am) c0451j.f2867B.remove(i5);
                                                C1117y.m469a(abstractC0244am3, c0451j);
                                                c0451j.m3716D(abstractC0244am3);
                                                abstractC0244am3.f6957el = mo4234a.f6957el;
                                                abstractC0244am3.f6958em = mo4234a.f6958em;
                                                abstractC0244am3.f1618ce = mo4234a.f1618ce;
                                                if (abstractC0244am3 instanceof AbstractC0623y) {
                                                    ((AbstractC0623y) abstractC0244am3).m2853az();
                                                }
                                                if (!mo4234a.mo3206e(abstractC0244am3, true)) {
                                                    LoggerMaybe.m990b("transportedUnitsToTransfer failed for: " + abstractC0244am3.m4429cz() + " to: " + mo4234a.m4429cz());
                                                    abstractC0244am3.m4439ch();
                                                }
                                            }
                                        }
                                    }
                                    AbstractC0197n.m4674c(mo4234a);
                                    if (mo4234a.m4485bI() && (mo4234a instanceof AbstractC0623y)) {
                                        m1079A.f6119bU.m1157a((AbstractC0623y) mo4234a);
                                    }
                                    if (z && !mo4234a.mo1714u()) {
                                        LoggerMaybe.m1079A().f6117bS.m1778k(mo4234a);
                                    }
                                    if (c0414bo.f2637c != null) {
                                        if (!(mo4234a instanceof AbstractC0623y)) {
                                            LoggerMaybe.m990b("copyWaypointsFrom: spawnedUnit!=OrderableUnit is:" + AbstractC0244am.m4518A(abstractC0244am2));
                                        } else {
                                            AbstractC0244am readUnit2 = c0414bo.f2637c.readUnit((AbstractC0623y) abstractC0244am);
                                            if (readUnit2 != null) {
                                                if (!(readUnit2 instanceof AbstractC0623y)) {
                                                    LoggerMaybe.m990b("copyWaypointsFrom: copyWaypointsFrom!=OrderableUnit is:" + AbstractC0244am.m4518A(abstractC0244am2));
                                                } else {
                                                    AbstractC0623y.m2914a((AbstractC0623y) readUnit2, (AbstractC0623y) mo4234a);
                                                }
                                            }
                                        }
                                    }
                                    if (c1101m != null) {
                                        c1101m.add(mo4234a);
                                    }
                                }
                            }
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C0413bn m3925a(Reader reader, boolean z) {
        int ReadInt = reader.ReadInt();
        if (z && ReadInt == 0) {
            return null;
        }
        C0413bn c0413bn = new C0413bn();
        for (int i = 0; i < ReadInt; i++) {
            C0414bo c0414bo = new C0414bo(null);
            InterfaceC0303as m1277q = reader.m1277q();
            if (m1277q != null) {
                if (c0413bn.f2634a == null) {
                    c0413bn.f2634a = new C1101m();
                }
                c0414bo.f2635a = C0453l.m3554a(m1277q);
            }
            if (reader.m1297b() >= 75 && reader.ReadBool()) {
                c0414bo.f2649d = reader.ReadInt();
                c0414bo.f2638e = reader.ReadBool();
                c0414bo.f2640g = reader.ReadBool();
                if (reader.m1297b() >= 76) {
                    c0414bo.f2650h = reader.m1287g();
                }
            }
            if (m1277q != null) {
                c0413bn.f2634a.add(c0414bo);
            }
        }
        return c0413bn;
    }
}
