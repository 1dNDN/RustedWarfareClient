package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0212g;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/l.class */
public final class C0398l extends AbstractC0387a {

    /* renamed from: a */
    public static final C0398l f2444a = new C0398l();

    /* renamed from: a */
    public static void m3800a(C0453l c0453l, C1072ab c1072ab) {
        C1101m m632e = c1072ab.m632e("attachment_");
        if (m632e.size() > 0) {
            c0453l.m3447a(f2444a);
            short s = 0;
            Iterator it = m632e.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String substring = str.substring("attachment_".length());
                C0399m c0399m = new C0399m();
                m3809a(c0399m, c0453l, c1072ab, str, substring);
                c0399m.f2446b = substring;
                c0399m.f2445a = s;
                s = (short) (s + 1);
                c0453l.f2980az.add(c0399m);
            }
        }
    }

    /* renamed from: a */
    public static void m3809a(C0399m c0399m, C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        c0399m.f2447c = c1072ab.m621i(str, "x");
        c0399m.f2448d = c1072ab.m621i(str, "y");
        c0399m.f2449e = c1072ab.m661a(str, "height", Float.valueOf(c0399m.f2449e)).floatValue();
        c0399m.f2453i = c1072ab.m663a(str, "lockDir", Boolean.valueOf(c0399m.f2453i)).booleanValue();
        c0399m.f2454j = c1072ab.m663a(str, "redirectDamageToParent", Boolean.valueOf(c0399m.f2454j)).booleanValue();
        c0399m.f2455k = c1072ab.m663a(str, "redirectDamageToParent_shieldOnly", Boolean.valueOf(c0399m.f2455k)).booleanValue();
        if (!c0399m.f2454j && c0399m.f2455k) {
            throw new C0412bm("[" + str + "] redirectDamageToParent_shieldOnly requires redirectDamageToParent");
        }
        c0399m.f2456l = c1072ab.m663a(str, "canBeAttackedAndDamaged", Boolean.valueOf(c0399m.f2456l)).booleanValue();
        c0399m.f2457m = c1072ab.m663a(str, "isUnselectable", Boolean.valueOf(c0399m.f2457m)).booleanValue();
        c0399m.f2458n = c1072ab.m663a(str, "isUnselectableAsTarget", Boolean.valueOf(c0399m.f2457m)).booleanValue();
        c0399m.f2459o = c1072ab.m663a(str, "isVisible", Boolean.valueOf(c0399m.f2459o)).booleanValue();
        c0399m.f2460p = c1072ab.m663a(str, "showMiniHp", Boolean.valueOf(c0399m.f2460p)).booleanValue();
        c0399m.f2461q = c1072ab.m663a(str, "hideHp", Boolean.valueOf(c0399m.f2461q)).booleanValue();
        c0399m.f2484N = c1072ab.m682a(c0453l, str, "showAllActionsFrom", (LogicBoolean) null);
        if (LogicBoolean.isStaticFalse(c0399m.f2484N)) {
            c0399m.f2484N = null;
        }
        Float m661a = c1072ab.m661a(str, "idleDir", (Float) null);
        Float m661a2 = c1072ab.m661a(str, "idleDirReversing", (Float) null);
        if (m661a != null) {
            c0399m.f2450f = m661a.floatValue();
            c0399m.f2451g = m661a.floatValue();
        }
        if (m661a2 != null) {
            c0399m.f2451g = m661a2.floatValue();
        } else {
            c0399m.f2451g = c0399m.f2450f;
        }
        c0399m.f2452h = c1072ab.m663a(str, "resetRotationWhenNotAttacking", (Boolean) false).booleanValue();
        c0399m.f2462r = c1072ab.m663a(str, "rotateWithParent", Boolean.valueOf(c0399m.f2462r)).booleanValue();
        c0399m.f2463s = c1072ab.m663a(str, "lockLegMovement", Boolean.valueOf(c0399m.f2463s)).booleanValue();
        c0399m.f2464t = c1072ab.m663a(str, "freezeLegMovement", Boolean.valueOf(c0399m.f2464t)).booleanValue();
        c0399m.f2465u = c1072ab.m663a(str, "lockRotation", Boolean.valueOf(c0399m.f2465u)).booleanValue();
        if (c0399m.f2465u && c0399m.f2452h) {
            throw new C0412bm("[" + str + "] Cannot use lockRotation and resetRotationWhenIdle at same time");
        }
        c0399m.f2466v = c1072ab.m663a(str, "keepAliveWhenParentDies", Boolean.valueOf(c0399m.f2466v)).booleanValue();
        c0399m.f2467w = C0413bn.m3757b(c0453l, c1072ab, str, "onCreateSpawnUnitOf");
        if (c0399m.f2467w.m3758b()) {
            c0399m.f2467w = null;
        }
        c0399m.f2468x = c1072ab.m663a(str, "createIncompleteIfParentIs", Boolean.valueOf(c0399m.f2468x)).booleanValue();
        c0399m.f2469y = c1072ab.m663a(str, "onConvertKeepExistingUnitInSameSlot", Boolean.valueOf(c0399m.f2469y)).booleanValue();
        c0399m.f2470z = c1072ab.m663a(str, "onParentTeamChangeKeepCurrentTeam", Boolean.valueOf(c0399m.f2470z)).booleanValue();
        c0399m.f2472B = c1072ab.m663a(str, "setDrawLayerOnBottom", Boolean.valueOf(c0399m.f2472B)).booleanValue();
        if (c0399m.f2472B) {
            c0399m.f2471A = false;
        }
        c0399m.f2471A = c1072ab.m663a(str, "setDrawLayerOnTop", Boolean.valueOf(c0399m.f2471A)).booleanValue();
        if (c0399m.f2471A && c0399m.f2472B) {
            throw new C0412bm("[" + str + "] Cannot use setDrawLayerOnTop and setDrawLayerOnBottom at same time");
        }
        c0399m.f2474D = c1072ab.m663a(str, "addTransportedUnits", Boolean.valueOf(c0399m.f2474D)).booleanValue();
        c0399m.f2475E = c1072ab.m663a(str, "unloadInCurrentPosition", Boolean.valueOf(c0399m.f2475E)).booleanValue();
        c0399m.f2476F = c1072ab.m663a(str, "smoothlyBlendPositionWhenExistingUnitAdded", Boolean.valueOf(c0399m.f2476F)).booleanValue();
        if (c0399m.f2476F) {
            c0399m.f2477G = 500.0f;
        } else {
            c0399m.f2477G = 0.0f;
        }
        c0399m.f2478H = c1072ab.m663a(str, "deattachIfWantingToMove", Boolean.valueOf(c0399m.f2478H)).booleanValue();
        c0399m.f2479I = c1072ab.m663a(str, "hidden", Boolean.valueOf(c0399m.f2479I)).booleanValue();
        c0399m.f2480J = c1072ab.m663a(str, "prioritizeParentsMainTarget", Boolean.valueOf(c0399m.f2480J)).booleanValue();
        c0399m.f2481K = c1072ab.m663a(str, "onlyAttackParentsMainTarget", Boolean.valueOf(c0399m.f2481K)).booleanValue();
        c0399m.f2482L = c1072ab.m663a(str, "alwaysAllowedToAttackParentsMainTarget", Boolean.valueOf(c0399m.f2482L)).booleanValue();
        c0399m.f2483M = c1072ab.m663a(str, "canAttack", Boolean.valueOf(c0399m.f2483M)).booleanValue();
        c0399m.f2485O = c1072ab.m663a(str, "keepWaypointsNeedingMovement", Boolean.valueOf(c0399m.f2485O)).booleanValue();
        if (c0399m.f2474D) {
            c0453l.f2981aA = true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: a */
    public void mo3807a(C0451j c0451j, float f) {
        mo3798b(c0451j, f);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo3798b(C0451j c0451j, float f) {
        float f2;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0453l c0453l = c0451j.f2863x;
        C1101m c1101m = c0453l.f2980az;
        if (c1101m.f6894a == 0) {
            return;
        }
        if (c0453l.f2981aA) {
            Object[] m534a = c1101m.m534a();
            for (int i = 0; i < c1101m.f6894a; i++) {
                C0399m c0399m = (C0399m) m534a[i];
                if (c0399m.f2474D && c0451j.f2867B.f6894a > 0 && m3806a(c0451j, c0399m) == null) {
                    Iterator it = c0451j.f2867B.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                            if ((abstractC0244am instanceof AbstractC0623y) && abstractC0244am.f1652cM == null && c0451j.mo2887a((AbstractC0623y) abstractC0244am, c0399m)) {
                                abstractC0244am.f1651cL = null;
                                break;
                            }
                        }
                    }
                }
            }
        }
        C1101m c1101m2 = c0451j.f2868C;
        if (c1101m2 == null) {
            return;
        }
        float f3 = c0451j.f1618ce - c0451j.f2869D;
        c0451j.f2869D = c0451j.f1618ce;
        Object[] m534a2 = c1101m2.m534a();
        for (int i2 = c1101m2.f6894a - 1; i2 >= 0; i2--) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m534a2[i2];
            if (abstractC0623y != null) {
                if (abstractC0623y.f1607bT) {
                    abstractC0623y.m2780bx();
                    m534a2[i2] = null;
                } else {
                    if (c0451j.f1651cL != null) {
                        if (abstractC0623y.f1651cL == null) {
                            abstractC0623y.f1651cL = c0451j.f1651cL;
                            m1071A.f6165bS.m1767l(abstractC0623y);
                        }
                    } else if (abstractC0623y.f1651cL != null && abstractC0623y.f1651cL != c0451j) {
                        abstractC0623y.f1651cL = null;
                    }
                    C0399m c0399m2 = (C0399m) c1101m.get(i2);
                    float m2030i = C0758f.m2030i(c0451j.f1618ce);
                    float m2035h = C0758f.m2035h(c0451j.f1618ce);
                    float f4 = (m2030i * c0399m2.f2448d) - (m2035h * c0399m2.f2447c);
                    float f5 = (m2035h * c0399m2.f2448d) + (m2030i * c0399m2.f2447c);
                    float f6 = f4 + c0451j.f6958el;
                    float f7 = f5 + c0451j.f6959em;
                    float f8 = c0451j.f6960en + c0399m2.f2449e;
                    if (C1117y.m454b(abstractC0623y.f1654cO, (int) c0399m2.f2477G)) {
                        abstractC0623y.f6958el += (f6 - abstractC0623y.f6958el) * 0.05f;
                        abstractC0623y.f6959em += (f7 - abstractC0623y.f6959em) * 0.05f;
                        abstractC0623y.f6960en += (f8 - abstractC0623y.f6960en) * 0.05f;
                    } else {
                        abstractC0623y.f6958el = f6;
                        abstractC0623y.f6959em = f7;
                        abstractC0623y.f6960en = f8;
                    }
                    if (abstractC0623y.f1624ck < 1.0f && c0399m2.f2468x) {
                        abstractC0623y.m4071r(c0451j.f1624ck);
                        abstractC0623y.f1625cl = c0451j.f1624ck;
                    }
                    if (c0399m2.f2471A) {
                        if (abstractC0623y.f6956ej <= c0451j.f6956ej) {
                            int i3 = 0;
                            if (abstractC0623y instanceof C0451j) {
                                i3 = ((C0451j) abstractC0623y).f2863x.f3091cG;
                            }
                            abstractC0623y.f6956ej = c0451j.f6956ej;
                            abstractC0623y.f6957ek = c0451j.f6957ek + 1 + i3;
                        }
                    } else if (c0399m2.f2472B && abstractC0623y.f6956ej >= c0451j.f6956ej) {
                        abstractC0623y.f6956ej = c0451j.f6956ej;
                        abstractC0623y.f6957ek = c0451j.f6957ek - 1;
                    }
                    if (c0451j.f1620cg) {
                        f2 = c0451j.f1618ce + c0399m2.f2451g;
                    } else {
                        f2 = c0451j.f1618ce + c0399m2.f2450f;
                    }
                    if (!abstractC0623y.mo3288bI()) {
                        if (c0399m2.f2465u) {
                            abstractC0623y.mo2756h(f2);
                        } else {
                            if (f3 != 0.0f && c0399m2.f2462r) {
                                abstractC0623y.mo2752i(f3);
                            }
                            if (c0399m2.f2452h && abstractC0623y.f3898Q == null) {
                                abstractC0623y.m2777c(f, f2);
                            }
                        }
                    }
                    if (c0399m2.f2481K) {
                        abstractC0623y.f3898Q = c0451j.f3898Q;
                        abstractC0623y.f3899R = 5.0f;
                    }
                    if (c0399m2.f2482L && abstractC0623y.f3898Q == null) {
                        abstractC0623y.f3898Q = c0451j.f3898Q;
                    }
                    if (c0399m2.f2480J && c0451j.f3898Q != null && abstractC0623y.f3898Q != c0451j.f3898Q) {
                        boolean z = false;
                        if (c0399m2.f2482L) {
                            z = true;
                        }
                        if (abstractC0623y.m2897a(c0451j.f3898Q, z)) {
                            abstractC0623y.f3898Q = c0451j.f3898Q;
                            abstractC0623y.f3899R = 5.0f;
                        }
                    }
                    if (abstractC0623y instanceof C0451j) {
                        C0451j c0451j2 = (C0451j) abstractC0623y;
                        if (c0399m2.f2463s) {
                            c0451j2.f2881dN = c0451j2.f6958el;
                            c0451j2.f2881dN = c0451j2.f6959em;
                            c0451j2.f2883dP = c0451j2.f6960en;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3801a(C0451j c0451j, boolean z) {
        C1101m c1101m = c0451j.f2868C;
        if (c1101m == null) {
            return;
        }
        C1101m c1101m2 = c0451j.f2863x.f2980az;
        Object[] m534a = c1101m.m534a();
        for (int i = c1101m.f6894a - 1; i >= 0; i--) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m534a[i];
            if (abstractC0623y != null) {
                C0399m c0399m = (C0399m) c1101m2.get(i);
                abstractC0623y.m2780bx();
                m534a[i] = null;
                if (z && !c0399m.f2466v) {
                    abstractC0623y.m4088ch();
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo3799b(C0451j c0451j) {
        m3801a(c0451j, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: c */
    public void mo3797c(C0451j c0451j) {
        m3801a(c0451j, true);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: a */
    public void mo3808a(C0451j c0451j) {
        boolean z = false;
        C1101m c1101m = c0451j.f2863x.f2980az;
        Object[] m534a = c1101m.m534a();
        for (int i = c1101m.f6894a - 1; i >= 0; i--) {
            C0399m c0399m = (C0399m) m534a[i];
            if (c0399m.f2467w != null) {
                AbstractC0623y m3806a = m3806a(c0451j, c0399m);
                if (m3806a != null) {
                    if (!c0399m.f2469y) {
                        m3806a.m4088ch();
                    }
                }
                C1101m c1101m2 = new C1101m();
                c0399m.f2467w.m3760a(c1101m2, c0451j.f1609bV, (AbstractC0244am) c0451j, true);
                if (c1101m2.size() > 1) {
                    AbstractC0916l.m982b("onCreateSpawnUnitOf: created an extra " + (c1101m2.size() - 1) + " units");
                    for (int i2 = 1; i2 < c1101m2.size(); i2++) {
                        ((AbstractC0244am) c1101m2.get(i2)).m4088ch();
                    }
                }
                if (c1101m2.size() == 0) {
                    AbstractC0916l.m982b("onCreateSpawnUnitOf: Warning no units created");
                } else {
                    AbstractC0244am abstractC0244am = (AbstractC0244am) c1101m2.get(0);
                    if (!(abstractC0244am instanceof AbstractC0623y)) {
                        AbstractC0916l.m982b("onCreateSpawnUnitOf: Warning " + abstractC0244am.mo1708r().mo3403i() + " not an orderable unit type, cannot attach");
                        abstractC0244am.m4088ch();
                    } else {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                        if (c0451j.mo2887a(abstractC0623y, c0399m)) {
                            abstractC0623y.f1654cO = -9999;
                            if (c0451j.f1624ck < 1.0f && c0399m.f2468x) {
                                abstractC0623y.m4071r(c0451j.f1624ck);
                                abstractC0623y.f1625cl = c0451j.f1624ck;
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            mo3798b(c0451j, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: a */
    public void mo3804a(C0451j c0451j, C0453l c0453l) {
        C1101m c1101m = c0451j.f2868C;
        C1101m c1101m2 = c0451j.f2863x.f2980az;
        if (c1101m2.size() == 0) {
            c0451j.f2868C = null;
        } else if (c1101m != null) {
            for (int size = c1101m.size() - 1; size >= 0; size--) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) c1101m.get(size);
                if (abstractC0623y != null && size >= c1101m2.size()) {
                    abstractC0623y.m4088ch();
                    c1101m.remove(size);
                }
            }
            for (int size2 = c1101m.size() - 1; size2 >= 0; size2--) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) c1101m.get(size2);
                if (abstractC0623y2 != null) {
                    abstractC0623y2.f1653cN = (C0399m) c1101m2.get(size2);
                }
            }
        }
    }

    /* renamed from: a */
    public static C0399m m3802a(C0451j c0451j, short s) {
        C1101m c1101m = c0451j.f2863x.f2980az;
        if (c1101m.f6894a <= s) {
            return null;
        }
        return (C0399m) c1101m.get(s);
    }

    /* renamed from: a */
    public static AbstractC0623y m3806a(C0451j c0451j, C0399m c0399m) {
        short s;
        C1101m c1101m = c0451j.f2868C;
        if (c1101m == null || c1101m.f6894a <= (s = c0399m.f2445a)) {
            return null;
        }
        return (AbstractC0623y) c1101m.get(s);
    }

    /* renamed from: a */
    public static boolean m3805a(C0451j c0451j, C0399m c0399m, AbstractC0623y abstractC0623y) {
        C0453l c0453l = c0451j.f2863x;
        short s = c0399m.f2445a;
        if (c0453l.f2980az.f6894a <= s && abstractC0623y != null) {
            AbstractC0916l.m982b("setAttachedUnitLookup: slot:" + ((int) s) + " larger than max slot size:" + c0453l.f2980az.f6894a);
            return false;
        }
        if (c0451j.f2868C == null) {
            c0451j.f2868C = new C1101m();
        }
        C1101m c1101m = c0451j.f2868C;
        if (c1101m.size() == 0) {
            c0451j.f2869D = c0451j.f1618ce;
        }
        if (abstractC0623y == null && s >= c1101m.size()) {
            return true;
        }
        while (c1101m.size() <= s) {
            c1101m.add(null);
        }
        c1101m.set(s, abstractC0623y);
        return true;
    }

    /* renamed from: a */
    public static void m3803a(C0451j c0451j, C1101m c1101m, boolean z) {
        C0399m m4079dl;
        boolean read;
        C1101m c1101m2 = c0451j.f2868C;
        if (c1101m2 != null) {
            Iterator it = c1101m2.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am != null && (abstractC0244am instanceof AbstractC0623y) && (m4079dl = abstractC0244am.m4079dl()) != null && m4079dl.f2484N != null) {
                    Iterator it2 = abstractC0244am.mo3022N().iterator();
                    while (it2.hasNext()) {
                        AbstractC0224s abstractC0224s = (AbstractC0224s) it2.next();
                        if (z) {
                            read = C0785ad.m1902a(m4079dl.f2484N, c0451j);
                        } else {
                            read = m4079dl.f2484N.read(c0451j);
                        }
                        if (read) {
                            c1101m.add(new C0212g(abstractC0224s, (AbstractC0623y) abstractC0244am, abstractC0224s.m4185N()));
                        }
                    }
                }
            }
        }
    }
}
