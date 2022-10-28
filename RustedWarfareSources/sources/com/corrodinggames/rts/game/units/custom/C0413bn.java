package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
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
    public static C0413bn m4147a(String str, String str2, String str3) {
        return m4144b(null, str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0413bn m4151a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        return m4150a(c0453l, c1072ab.m656b(str, str2, (String) null), str, str2, false);
    }

    /* renamed from: b */
    public static C0413bn m4145b(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        return m4150a(c0453l, c1072ab.m656b(str, str2, (String) null), str, str2, true);
    }

    /* renamed from: a */
    public static C0413bn m4150a(C0453l c0453l, String str, String str2, String str3, boolean z) {
        if (c0453l == null) {
            throw new RuntimeException("meta==null");
        }
        return m4144b(c0453l, str, str2, str3, z);
    }

    /* renamed from: b */
    public static C0413bn m4144b(C0453l c0453l, String str, String str2, String str3, boolean z) {
        int m4154a;
        C0413bn c0413bn = new C0413bn();
        if (str == null || VariableScope.nullOrMissingString.equals(str) || "NONE".equalsIgnoreCase(str)) {
            return c0413bn;
        }
        Iterator it = C0758f.m2141b(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] m2103f = C0758f.m2103f(trim, "(");
                    if (m2103f == null) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
                    }
                    trim = m2103f[0];
                    str4 = m2103f[1].trim();
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
                    c0453l.f3204p.add(c0463u);
                } else {
                    c0463u.mo3641a();
                }
                C0414bo c0414bo = new C0414bo(c0463u);
                if (c0413bn.f2634a == null) {
                    c0413bn.f2634a = new C1101m();
                }
                c0414bo.f2638d = i;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                    Iterator it2 = C0758f.m2169a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str6 = (String) it2.next();
                        if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] m2103f2 = C0758f.m2103f(str6, "=");
                            if (m2103f2 == null) {
                                throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                            }
                            String trim2 = m2103f2[0].trim();
                            String trim3 = m2103f2[1].trim();
                            if (trim2.equalsIgnoreCase("neutralTeam")) {
                                c0414bo.f2639e = C1072ab.m636g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("setToTeamOfLastAttacker")) {
                                c0414bo.f2641g = C1072ab.m636g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("aggressiveTeam")) {
                                c0414bo.f2640f = C1072ab.m636g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("spawnChance")) {
                                c0414bo.f2642h = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                c0414bo.f2643i = C1072ab.m632i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("techLevel")) {
                                c0414bo.f2647m = C1072ab.m632i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("gridAlign")) {
                                c0414bo.f2644j = C1072ab.m636g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("skipIfOverlapping")) {
                                c0414bo.f2645k = C1072ab.m636g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("falling")) {
                                c0414bo.f2646l = C1072ab.m636g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("transportedUnitsToTransfer")) {
                                c0414bo.f2657w = (short) C1072ab.m632i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwaysStartDirAtZero")) {
                                c0414bo.f2648n = C1072ab.m636g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwayStartDirAtZero")) {
                                c0414bo.f2648n = C1072ab.m636g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetX")) {
                                c0414bo.f2649o = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetY")) {
                                c0414bo.f2650p = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                float m634h = C1072ab.m634h(str2, str3, trim3);
                                c0414bo.f2653s = m634h;
                                c0414bo.f2654t = m634h;
                            } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                c0414bo.f2653s = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                c0414bo.f2654t = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                c0414bo.f2651q = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                c0414bo.f2655u = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                c0414bo.f2652r = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("addResources")) {
                                if (c0453l == null) {
                                    throw new C0412bm("[" + str2 + "]" + str3 + " addResources not supported from here");
                                }
                                try {
                                    c0414bo.f2656v = C0424b.m4099b(c0453l, trim3);
                                } catch (C0412bm e) {
                                    e.printStackTrace();
                                    throw new C0412bm("[" + str2 + "]" + str3 + " addResources:" + e.getMessage());
                                }
                            } else if (trim2.equalsIgnoreCase("spawnSource")) {
                                c0414bo.f2636b = C1072ab.m686a(trim3, c0453l, str2, str3, (LogicBoolean) null);
                            } else if (trim2.equalsIgnoreCase("copyWaypointsFrom")) {
                                c0414bo.f2637c = C1072ab.m686a(trim3, c0453l, str2, str3, (LogicBoolean) null);
                            } else {
                                throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                            }
                        }
                    }
                    if (c0414bo.f2641g && c0414bo.f2639e) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " Cannot set setToTeamOfLastAttacker and neutralTeam at same time in " + str);
                    }
                    if (c0414bo.f2640f && c0414bo.f2639e) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and neutralTeam at same time in " + str);
                    }
                    if (c0414bo.f2640f && c0414bo.f2641g) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and setToTeamOfLastAttacker at same time in " + str);
                    }
                }
                c0413bn.f2634a.add(c0414bo);
            }
        }
        if (z && (m4154a = c0413bn.m4154a()) > 1) {
            throw new C0412bm("[" + str2 + "]" + str3 + " Too many units: " + m4154a + ", only single unit is allowed here");
        }
        return c0413bn;
    }

    /* renamed from: a */
    public int m4154a() {
        if (this.f2634a == null || this.f2634a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f2634a.iterator();
        while (it.hasNext()) {
            i += ((C0414bo) it.next()).f2638d;
        }
        return i;
    }

    /* renamed from: b */
    public boolean m4146b() {
        if (this.f2634a == null || this.f2634a.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m4148a(C1101m c1101m, AbstractC0197n abstractC0197n, AbstractC0244am abstractC0244am, boolean z) {
        m4152a(0.0f, 0.0f, 0.0f, 0.0f, abstractC0197n, false, abstractC0244am, c1101m, z);
    }

    /* renamed from: a */
    public void m4153a(float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n, boolean z, AbstractC0244am abstractC0244am) {
        m4152a(f, f2, f3, f4, abstractC0197n, z, abstractC0244am, null, false);
    }

    /* renamed from: a */
    public void m4152a(float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n, boolean z, AbstractC0244am abstractC0244am, C1101m c1101m, boolean z2) {
        if (this.f2634a == null || this.f2634a.size() == 0) {
            return;
        }
        boolean z3 = false;
        Core m1087A = Core.m1087A();
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
                    Core.m998b("spawnUnitsAt: sourceUnit!=OrderableUnit is:" + AbstractC0244am.m4802A(abstractC0244am2));
                } else {
                    AbstractC0244am readUnit = c0414bo.f2636b.readUnit((AbstractC0623y) abstractC0244am);
                    if (readUnit == null) {
                        Core.m998b("spawnUnitsAt: spawnSource==null");
                    } else {
                        abstractC0197n2 = readUnit.f1609bV;
                        abstractC0244am2 = readUnit;
                        f5 = readUnit.f6958el;
                        f6 = readUnit.f6959em;
                        f7 = readUnit.f6960en;
                        f8 = readUnit.f1618ce;
                        if (abstractC0197n2 == null) {
                            Core.m998b("spawnUnitsAt: newSpawnSource.team==null");
                        }
                    }
                }
            }
            if (!z2) {
                if (abstractC0197n2.m5007u() > abstractC0197n2.m5006v() + 300) {
                    z3 = true;
                }
            } else if (abstractC0197n2.m5075a(true, false) > abstractC0197n2.m5006v() + 20000) {
                z3 = true;
            }
            if (z3) {
                String str = VariableScope.nullOrMissingString;
                if (abstractC0244am2 != null) {
                    str = str + "source:" + abstractC0244am2.m4683cz();
                }
                Core.m998b("spawnUnitsAt: Skipping, too many units already on team:" + abstractC0197n2.f1306k + " count:" + abstractC0197n2.m5007u() + " " + str);
                if (Core.m1087A().f6231bl) {
                    abstractC0197n2.m5100T();
                }
            } else if (abstractC0197n2.m5009s() > abstractC0197n2.m5006v() + 25000) {
                String str2 = VariableScope.nullOrMissingString;
                if (abstractC0244am2 != null) {
                    str2 = str2 + "source:" + abstractC0244am2.m4683cz();
                }
                Core.m998b("spawnUnitsAt: Failsafe, too many units already on team (including ignored):" + abstractC0197n2.f1306k + " total count:" + abstractC0197n2.m5009s() + " " + str2);
                if (Core.m1087A().f6231bl) {
                    abstractC0197n2.m5100T();
                }
            } else {
                InterfaceC0303as mo3643c = c0414bo.f2635a.mo3643c();
                if (mo3643c != null) {
                    for (int i3 = 0; i3 < c0414bo.f2638d; i3++) {
                        i2++;
                        AbstractC0197n abstractC0197n3 = abstractC0197n2;
                        if (c0414bo.f2642h >= 1.0f || C0758f.m2190a(abstractC0244am2, 0.0f, 1.0f, i2) <= c0414bo.f2642h) {
                            if (c0414bo.f2641g) {
                                if (abstractC0244am2 != null && abstractC0244am2.f1579bs != null) {
                                    abstractC0197n3 = abstractC0244am2.f1579bs.f1609bV;
                                    if (abstractC0197n3 == null) {
                                        throw new RuntimeException("setToTeamOfLastAttacker targetTeam==null");
                                    }
                                }
                            }
                            if (i >= c0414bo.f2643i) {
                                continue;
                            } else {
                                AbstractC0244am mo4485a = mo3643c.mo4485a();
                                if (c0414bo.f2639e) {
                                    abstractC0197n3 = AbstractC0197n.f1371i;
                                }
                                if (c0414bo.f2640f) {
                                    abstractC0197n3 = AbstractC0197n.f1370h;
                                }
                                if (abstractC0197n3 == null) {
                                    throw new RuntimeException("Team==null");
                                }
                                mo4485a.m4656f(abstractC0197n3);
                                mo4485a.m4801B(abstractC0244am2);
                                mo4485a.f6958el = f5;
                                mo4485a.f6959em = f6;
                                mo4485a.f6960en = f7;
                                if (!mo4485a.m4758bI() && !c0414bo.f2648n) {
                                    mo4485a.f1618ce = f8;
                                }
                                mo4485a.f6960en += c0414bo.f2651q;
                                if (c0414bo.f2647m != -1 && (mo4485a instanceof AbstractC0623y)) {
                                    ((AbstractC0623y) mo4485a).mo3356a(c0414bo.f2647m);
                                }
                                float f9 = c0414bo.f2652r;
                                if (c0414bo.f2655u != 0.0f) {
                                    f9 += C0758f.m2190a(abstractC0244am2, -c0414bo.f2655u, c0414bo.f2655u, (i2 * 4) + 3);
                                }
                                if (f9 != 0.0f) {
                                    if (mo4485a instanceof AbstractC0623y) {
                                        ((AbstractC0623y) mo4485a).mo3316i(f9);
                                    } else {
                                        mo4485a.f1618ce += f9;
                                    }
                                }
                                mo4485a.f6958el += i3;
                                if (c0414bo.f2653s != 0.0f) {
                                    mo4485a.f6958el += C0758f.m2190a(abstractC0244am2, -c0414bo.f2653s, c0414bo.f2653s, (i2 * 2) + 1);
                                }
                                if (c0414bo.f2654t != 0.0f) {
                                    mo4485a.f6959em += C0758f.m2190a(abstractC0244am2, -c0414bo.f2654t, c0414bo.f2654t, (i2 * 3) + 2);
                                }
                                if (c0414bo.f2644j) {
                                    m1087A.f6110bL.m5309b(mo4485a.f6958el, mo4485a.f6959em);
                                    mo4485a.f6958el = m1087A.f6110bL.f801T;
                                    mo4485a.f6959em = m1087A.f6110bL.f802U;
                                    mo4485a.f6958el += mo4485a.m4710cX();
                                    mo4485a.f6959em += mo4485a.m4709cY();
                                }
                                mo4485a.f6958el += c0414bo.f2649o;
                                mo4485a.f6959em += c0414bo.f2650p;
                                i++;
                                if (c0414bo.f2645k && (mo4485a instanceof AbstractC0623y) && !((AbstractC0623y) mo4485a).m2848c((AbstractC0197n) null)) {
                                    mo4485a.m4700ch();
                                } else {
                                    if (c0414bo.f2646l && (mo4485a instanceof AbstractC0623y)) {
                                        mo4485a.m4677da();
                                    }
                                    if (c0414bo.f2656v != null) {
                                        c0414bo.f2656v.m4084h(mo4485a);
                                    }
                                    if (c0414bo.f2657w > 0 && abstractC0244am2 != null && (abstractC0244am2 instanceof C0451j)) {
                                        C0451j c0451j = (C0451j) abstractC0244am2;
                                        if (c0451j.f2867B != null) {
                                            for (int i4 = c0414bo.f2657w; i4 > 0; i4--) {
                                                int i5 = -1;
                                                int size = c0451j.f2867B.size() - 1;
                                                while (true) {
                                                    if (size >= 0) {
                                                        if (mo4485a.m4737c((AbstractC0244am) c0451j.f2867B.get(size), true)) {
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
                                                C1117y.m464a(abstractC0244am3, c0451j);
                                                c0451j.m3940D(abstractC0244am3);
                                                abstractC0244am3.f6958el = mo4485a.f6958el;
                                                abstractC0244am3.f6959em = mo4485a.f6959em;
                                                abstractC0244am3.f1618ce = mo4485a.f1618ce;
                                                if (abstractC0244am3 instanceof AbstractC0623y) {
                                                    ((AbstractC0623y) abstractC0244am3).m2901az();
                                                }
                                                if (!mo4485a.m4662e(abstractC0244am3, true)) {
                                                    Core.m998b("transportedUnitsToTransfer failed for: " + abstractC0244am3.m4683cz() + " to: " + mo4485a.m4683cz());
                                                    abstractC0244am3.m4700ch();
                                                }
                                            }
                                        }
                                    }
                                    AbstractC0197n.m5053c(mo4485a);
                                    if (mo4485a.m4758bI() && (mo4485a instanceof AbstractC0623y)) {
                                        m1087A.f6119bU.m1165a((AbstractC0623y) mo4485a);
                                    }
                                    if (z && !mo4485a.mo1756u()) {
                                        Core.m1087A().f6117bS.m1820k(mo4485a);
                                    }
                                    if (c0414bo.f2637c != null) {
                                        if (!(mo4485a instanceof AbstractC0623y)) {
                                            Core.m998b("copyWaypointsFrom: spawnedUnit!=OrderableUnit is:" + AbstractC0244am.m4802A(abstractC0244am2));
                                        } else {
                                            AbstractC0244am readUnit2 = c0414bo.f2637c.readUnit((AbstractC0623y) abstractC0244am);
                                            if (readUnit2 != null) {
                                                if (!(readUnit2 instanceof AbstractC0623y)) {
                                                    Core.m998b("copyWaypointsFrom: copyWaypointsFrom!=OrderableUnit is:" + AbstractC0244am.m4802A(abstractC0244am2));
                                                } else {
                                                    AbstractC0623y.m2962a((AbstractC0623y) readUnit2, (AbstractC0623y) mo4485a);
                                                }
                                            }
                                        }
                                    }
                                    if (c1101m != null) {
                                        c1101m.add(mo4485a);
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
    public static C0413bn m4149a(Reader reader, boolean z) {
        int ReadInt = reader.ReadInt();
        if (z && ReadInt == 0) {
            return null;
        }
        C0413bn c0413bn = new C0413bn();
        for (int i = 0; i < ReadInt; i++) {
            C0414bo c0414bo = new C0414bo(null);
            InterfaceC0303as m1290q = reader.m1290q();
            if (m1290q != null) {
                if (c0413bn.f2634a == null) {
                    c0413bn.f2634a = new C1101m();
                }
                c0414bo.f2635a = C0453l.m3730a(m1290q);
            }
            if (reader.m1310b() >= 75 && reader.ReadBool()) {
                c0414bo.f2638d = reader.ReadInt();
                c0414bo.f2639e = reader.ReadBool();
                c0414bo.f2641g = reader.ReadBool();
                if (reader.m1310b() >= 76) {
                    c0414bo.f2642h = reader.m1300g();
                }
            }
            if (m1290q != null) {
                c0413bn.f2634a.add(c0414bo);
            }
        }
        return c0413bn;
    }
}
