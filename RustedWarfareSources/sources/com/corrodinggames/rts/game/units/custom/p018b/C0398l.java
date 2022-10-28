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
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
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
    public static void m4188a(C0453l c0453l, C1072ab c1072ab) {
        C1101m m644e = c1072ab.m644e("attachment_");
        if (m644e.size() > 0) {
            c0453l.m3728a(f2444a);
            short s = 0;
            Iterator it = m644e.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String substring = str.substring("attachment_".length());
                C0399m c0399m = new C0399m();
                m4197a(c0399m, c0453l, c1072ab, str, substring);
                c0399m.f2446b = substring;
                c0399m.f2445a = s;
                s = (short) (s + 1);
                c0453l.f3226az.add(c0399m);
            }
        }
    }

    /* renamed from: a */
    public static void m4197a(C0399m c0399m, C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        c0399m.f2447c = c1072ab.m633i(str, "x");
        c0399m.f2448d = c1072ab.m633i(str, "y");
        c0399m.f2449e = c1072ab.m673a(str, "height", Float.valueOf(c0399m.f2449e)).floatValue();
        c0399m.f2452i = c1072ab.m675a(str, "lockDir", Boolean.valueOf(c0399m.f2452i)).booleanValue();
        c0399m.f2453j = c1072ab.m675a(str, "redirectDamageToParent", Boolean.valueOf(c0399m.f2453j)).booleanValue();
        c0399m.f2454k = c1072ab.m675a(str, "redirectDamageToParent_shieldOnly", Boolean.valueOf(c0399m.f2454k)).booleanValue();
        if (!c0399m.f2453j && c0399m.f2454k) {
            throw new C0412bm("[" + str + "] redirectDamageToParent_shieldOnly requires redirectDamageToParent");
        }
        c0399m.f2467l = c1072ab.m675a(str, "canBeAttackedAndDamaged", Boolean.valueOf(c0399m.f2467l)).booleanValue();
        c0399m.f2468m = c1072ab.m675a(str, "isUnselectable", Boolean.valueOf(c0399m.f2468m)).booleanValue();
        c0399m.f2469n = c1072ab.m675a(str, "isUnselectableAsTarget", Boolean.valueOf(c0399m.f2468m)).booleanValue();
        c0399m.f2470o = c1072ab.m675a(str, "isVisible", Boolean.valueOf(c0399m.f2470o)).booleanValue();
        c0399m.f2471p = c1072ab.m675a(str, "showMiniHp", Boolean.valueOf(c0399m.f2471p)).booleanValue();
        c0399m.f2472q = c1072ab.m675a(str, "hideHp", Boolean.valueOf(c0399m.f2472q)).booleanValue();
        c0399m.f2464N = c1072ab.m694a(c0453l, str, "showAllActionsFrom", (LogicBoolean) null);
        if (LogicBoolean.isStaticFalse(c0399m.f2464N)) {
            c0399m.f2464N = null;
        }
        Float m673a = c1072ab.m673a(str, "idleDir", (Float) null);
        Float m673a2 = c1072ab.m673a(str, "idleDirReversing", (Float) null);
        if (m673a != null) {
            c0399m.f2450f = m673a.floatValue();
            c0399m.f2466g = m673a.floatValue();
        }
        if (m673a2 != null) {
            c0399m.f2466g = m673a2.floatValue();
        } else {
            c0399m.f2466g = c0399m.f2450f;
        }
        c0399m.f2451h = c1072ab.m675a(str, "resetRotationWhenNotAttacking", (Boolean) false).booleanValue();
        c0399m.f2473r = c1072ab.m675a(str, "rotateWithParent", Boolean.valueOf(c0399m.f2473r)).booleanValue();
        c0399m.f2474s = c1072ab.m675a(str, "lockLegMovement", Boolean.valueOf(c0399m.f2474s)).booleanValue();
        c0399m.f2475t = c1072ab.m675a(str, "freezeLegMovement", Boolean.valueOf(c0399m.f2475t)).booleanValue();
        c0399m.f2455u = c1072ab.m675a(str, "lockRotation", Boolean.valueOf(c0399m.f2455u)).booleanValue();
        if (c0399m.f2455u && c0399m.f2451h) {
            throw new C0412bm("[" + str + "] Cannot use lockRotation and resetRotationWhenIdle at same time");
        }
        c0399m.f2476v = c1072ab.m675a(str, "keepAliveWhenParentDies", Boolean.valueOf(c0399m.f2476v)).booleanValue();
        c0399m.f2456w = C0413bn.m4145b(c0453l, c1072ab, str, "onCreateSpawnUnitOf");
        if (c0399m.f2456w.m4146b()) {
            c0399m.f2456w = null;
        }
        c0399m.f2477x = c1072ab.m675a(str, "createIncompleteIfParentIs", Boolean.valueOf(c0399m.f2477x)).booleanValue();
        c0399m.f2457y = c1072ab.m675a(str, "onConvertKeepExistingUnitInSameSlot", Boolean.valueOf(c0399m.f2457y)).booleanValue();
        c0399m.f2458z = c1072ab.m675a(str, "onParentTeamChangeKeepCurrentTeam", Boolean.valueOf(c0399m.f2458z)).booleanValue();
        c0399m.f2479B = c1072ab.m675a(str, "setDrawLayerOnBottom", Boolean.valueOf(c0399m.f2479B)).booleanValue();
        if (c0399m.f2479B) {
            c0399m.f2478A = false;
        }
        c0399m.f2478A = c1072ab.m675a(str, "setDrawLayerOnTop", Boolean.valueOf(c0399m.f2478A)).booleanValue();
        if (c0399m.f2478A && c0399m.f2479B) {
            throw new C0412bm("[" + str + "] Cannot use setDrawLayerOnTop and setDrawLayerOnBottom at same time");
        }
        c0399m.f2481D = c1072ab.m675a(str, "addTransportedUnits", Boolean.valueOf(c0399m.f2481D)).booleanValue();
        c0399m.f2459E = c1072ab.m675a(str, "unloadInCurrentPosition", Boolean.valueOf(c0399m.f2459E)).booleanValue();
        c0399m.f2482F = c1072ab.m675a(str, "smoothlyBlendPositionWhenExistingUnitAdded", Boolean.valueOf(c0399m.f2482F)).booleanValue();
        if (c0399m.f2482F) {
            c0399m.f2460G = 500.0f;
        } else {
            c0399m.f2460G = 0.0f;
        }
        c0399m.f2461H = c1072ab.m675a(str, "deattachIfWantingToMove", Boolean.valueOf(c0399m.f2461H)).booleanValue();
        c0399m.f2483I = c1072ab.m675a(str, "hidden", Boolean.valueOf(c0399m.f2483I)).booleanValue();
        c0399m.f2484J = c1072ab.m675a(str, "prioritizeParentsMainTarget", Boolean.valueOf(c0399m.f2484J)).booleanValue();
        c0399m.f2462K = c1072ab.m675a(str, "onlyAttackParentsMainTarget", Boolean.valueOf(c0399m.f2462K)).booleanValue();
        c0399m.f2463L = c1072ab.m675a(str, "alwaysAllowedToAttackParentsMainTarget", Boolean.valueOf(c0399m.f2463L)).booleanValue();
        c0399m.f2485M = c1072ab.m675a(str, "canAttack", Boolean.valueOf(c0399m.f2485M)).booleanValue();
        c0399m.f2465O = c1072ab.m675a(str, "keepWaypointsNeedingMovement", Boolean.valueOf(c0399m.f2465O)).booleanValue();
        if (c0399m.f2481D) {
            c0453l.f2944aA = true;
        }
    }

    /* renamed from: a */
    public void mo4220a(C0451j c0451j, float f) {
        mo4198b(c0451j, f);
    }

    /* renamed from: b */
    public void mo4198b(C0451j c0451j, float f) {
        float f2;
        Core m1087A = Core.m1087A();
        C0453l c0453l = c0451j.f2863x;
        C1101m c1101m = c0453l.f3226az;
        if (c1101m.f6894a == 0) {
            return;
        }
        if (c0453l.f2944aA) {
            Object[] m534a = c1101m.m534a();
            for (int i = 0; i < c1101m.f6894a; i++) {
                C0399m c0399m = (C0399m) m534a[i];
                if (c0399m.f2481D && c0451j.f2867B.f6894a > 0 && m4194a(c0451j, c0399m) == null) {
                    Iterator it = c0451j.f2867B.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                            if ((abstractC0244am instanceof AbstractC0623y) && abstractC0244am.f1652cM == null && c0451j.m3900a((AbstractC0623y) abstractC0244am, c0399m)) {
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
                    abstractC0623y.m2855bx();
                    m534a2[i2] = null;
                } else {
                    if (c0451j.f1651cL != null) {
                        if (abstractC0623y.f1651cL == null) {
                            abstractC0623y.f1651cL = c0451j.f1651cL;
                            m1087A.f6117bS.m1818l(abstractC0623y);
                        }
                    } else if (abstractC0623y.f1651cL != null && abstractC0623y.f1651cL != c0451j) {
                        abstractC0623y.f1651cL = null;
                    }
                    C0399m c0399m2 = (C0399m) c1101m.get(i2);
                    float m2092i = C0758f.m2092i(c0451j.f1618ce);
                    float m2097h = C0758f.m2097h(c0451j.f1618ce);
                    float f4 = (m2092i * c0399m2.f2448d) - (m2097h * c0399m2.f2447c);
                    float f5 = (m2097h * c0399m2.f2448d) + (m2092i * c0399m2.f2447c);
                    float f6 = f4 + c0451j.f6958el;
                    float f7 = f5 + c0451j.f6959em;
                    float f8 = c0451j.f6960en + c0399m2.f2449e;
                    if (C1117y.m454b(abstractC0623y.f1654cO, (int) c0399m2.f2460G)) {
                        abstractC0623y.f6958el += (f6 - abstractC0623y.f6958el) * 0.05f;
                        abstractC0623y.f6959em += (f7 - abstractC0623y.f6959em) * 0.05f;
                        abstractC0623y.f6960en += (f8 - abstractC0623y.f6960en) * 0.05f;
                    } else {
                        abstractC0623y.f6958el = f6;
                        abstractC0623y.f6959em = f7;
                        abstractC0623y.f6960en = f8;
                    }
                    if (abstractC0623y.f1624ck < 1.0f && c0399m2.f2477x) {
                        abstractC0623y.m4647r(c0451j.f1624ck);
                        abstractC0623y.f1625cl = c0451j.f1624ck;
                    }
                    if (c0399m2.f2478A) {
                        if (abstractC0623y.f6956ej <= c0451j.f6956ej) {
                            int i3 = 0;
                            if (abstractC0623y instanceof C0451j) {
                                i3 = ((C0451j) abstractC0623y).f2863x.f3245cG;
                            }
                            abstractC0623y.f6956ej = c0451j.f6956ej;
                            abstractC0623y.f6957ek = c0451j.f6957ek + 1 + i3;
                        }
                    } else if (c0399m2.f2479B && abstractC0623y.f6956ej >= c0451j.f6956ej) {
                        abstractC0623y.f6956ej = c0451j.f6956ej;
                        abstractC0623y.f6957ek = c0451j.f6957ek - 1;
                    }
                    if (c0451j.f1620cg) {
                        f2 = c0451j.f1618ce + c0399m2.f2466g;
                    } else {
                        f2 = c0451j.f1618ce + c0399m2.f2450f;
                    }
                    if (!abstractC0623y.m4758bI()) {
                        if (c0399m2.f2455u) {
                            abstractC0623y.m2829h(f2);
                        } else {
                            if (f3 != 0.0f && c0399m2.f2473r) {
                                abstractC0623y.mo3316i(f3);
                            }
                            if (c0399m2.f2451h && abstractC0623y.f3896Q == null) {
                                abstractC0623y.m2851c(f, f2);
                            }
                        }
                    }
                    if (c0399m2.f2462K) {
                        abstractC0623y.f3896Q = c0451j.f3896Q;
                        abstractC0623y.f3897R = 5.0f;
                    }
                    if (c0399m2.f2463L && abstractC0623y.f3896Q == null) {
                        abstractC0623y.f3896Q = c0451j.f3896Q;
                    }
                    if (c0399m2.f2484J && c0451j.f3896Q != null && abstractC0623y.f3896Q != c0451j.f3896Q) {
                        boolean z = false;
                        if (c0399m2.f2463L) {
                            z = true;
                        }
                        if (abstractC0623y.m2973a(c0451j.f3896Q, z)) {
                            abstractC0623y.f3896Q = c0451j.f3896Q;
                            abstractC0623y.f3897R = 5.0f;
                        }
                    }
                    if (abstractC0623y instanceof C0451j) {
                        C0451j c0451j2 = (C0451j) abstractC0623y;
                        if (c0399m2.f2474s) {
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
    public void m4189a(C0451j c0451j, boolean z) {
        C1101m c1101m = c0451j.f2868C;
        if (c1101m == null) {
            return;
        }
        C1101m c1101m2 = c0451j.f2863x.f3226az;
        Object[] m534a = c1101m.m534a();
        for (int i = c1101m.f6894a - 1; i >= 0; i--) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m534a[i];
            if (abstractC0623y != null) {
                C0399m c0399m = (C0399m) c1101m2.get(i);
                abstractC0623y.m2855bx();
                m534a[i] = null;
                if (z && !c0399m.f2476v) {
                    abstractC0623y.m4700ch();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo4218b(C0451j c0451j) {
        m4189a(c0451j, true);
    }

    /* renamed from: c */
    public void mo4217c(C0451j c0451j) {
        m4189a(c0451j, true);
    }

    /* renamed from: a */
    public void mo4214a(C0451j c0451j) {
        boolean z = false;
        C1101m c1101m = c0451j.f2863x.f3226az;
        Object[] m534a = c1101m.m534a();
        for (int i = c1101m.f6894a - 1; i >= 0; i--) {
            C0399m c0399m = (C0399m) m534a[i];
            if (c0399m.f2456w != null) {
                AbstractC0623y m4194a = m4194a(c0451j, c0399m);
                if (m4194a != null) {
                    if (!c0399m.f2457y) {
                        m4194a.m4700ch();
                    }
                }
                C1101m c1101m2 = new C1101m();
                c0399m.f2456w.m4148a(c1101m2, c0451j.f1609bV, (AbstractC0244am) c0451j, true);
                if (c1101m2.size() > 1) {
                    Core.m998b("onCreateSpawnUnitOf: created an extra " + (c1101m2.size() - 1) + " units");
                    for (int i2 = 1; i2 < c1101m2.size(); i2++) {
                        ((AbstractC0244am) c1101m2.get(i2)).m4700ch();
                    }
                }
                if (c1101m2.size() == 0) {
                    Core.m998b("onCreateSpawnUnitOf: Warning no units created");
                } else {
                    AbstractC0244am abstractC0244am = (AbstractC0244am) c1101m2.get(0);
                    if (!(abstractC0244am instanceof AbstractC0623y)) {
                        Core.m998b("onCreateSpawnUnitOf: Warning " + abstractC0244am.mo1758r().mo4474i() + " not an orderable unit type, cannot attach");
                        abstractC0244am.m4700ch();
                    } else {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                        if (c0451j.m3900a(abstractC0623y, c0399m)) {
                            abstractC0623y.f1654cO = -9999;
                            if (c0451j.f1624ck < 1.0f && c0399m.f2477x) {
                                abstractC0623y.m4647r(c0451j.f1624ck);
                                abstractC0623y.f1625cl = c0451j.f1624ck;
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        if (z) {
            mo4198b(c0451j, 0.0f);
        }
    }

    /* renamed from: a */
    public void mo4219a(C0451j c0451j, C0453l c0453l) {
        C1101m c1101m = c0451j.f2868C;
        C1101m c1101m2 = c0451j.f2863x.f3226az;
        if (c1101m2.size() == 0) {
            c0451j.f2868C = null;
        } else if (c1101m != null) {
            for (int size = c1101m.size() - 1; size >= 0; size--) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) c1101m.get(size);
                if (abstractC0623y != null && size >= c1101m2.size()) {
                    abstractC0623y.m4700ch();
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
    public static C0399m m4190a(C0451j c0451j, short s) {
        C1101m c1101m = c0451j.f2863x.f3226az;
        if (c1101m.f6894a <= s) {
            return null;
        }
        return (C0399m) c1101m.get(s);
    }

    /* renamed from: a */
    public static AbstractC0623y m4194a(C0451j c0451j, C0399m c0399m) {
        short s;
        C1101m c1101m = c0451j.f2868C;
        if (c1101m == null || c1101m.f6894a <= (s = c0399m.f2445a)) {
            return null;
        }
        return (AbstractC0623y) c1101m.get(s);
    }

    /* renamed from: a */
    public static boolean m4193a(C0451j c0451j, C0399m c0399m, AbstractC0623y abstractC0623y) {
        C0453l c0453l = c0451j.f2863x;
        short s = c0399m.f2445a;
        if (c0453l.f3226az.f6894a <= s && abstractC0623y != null) {
            Core.m998b("setAttachedUnitLookup: slot:" + ((int) s) + " larger than max slot size:" + c0453l.f3226az.f6894a);
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
    public static void m4191a(C0451j c0451j, C1101m c1101m, boolean z) {
        C0399m m4668dl;
        boolean read;
        C1101m c1101m2 = c0451j.f2868C;
        if (c1101m2 != null) {
            Iterator it = c1101m2.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am != null && (abstractC0244am instanceof AbstractC0623y) && (m4668dl = abstractC0244am.m4668dl()) != null && m4668dl.f2464N != null) {
                    Iterator it2 = abstractC0244am.mo3174N().iterator();
                    while (it2.hasNext()) {
                        AbstractC0224s abstractC0224s = (AbstractC0224s) it2.next();
                        if (z) {
                            read = C0785ad.m1954a(m4668dl.f2464N, c0451j);
                        } else {
                            read = m4668dl.f2464N.read(c0451j);
                        }
                        if (read) {
                            c1101m.add(new C0212g(abstractC0224s, (AbstractC0623y) abstractC0244am, abstractC0224s.m4910N()));
                        }
                    }
                }
            }
        }
    }
}
