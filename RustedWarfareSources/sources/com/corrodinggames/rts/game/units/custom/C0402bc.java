package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bc */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bc.class */
public final class C0402bc {

    /* renamed from: a */
    C1101m f2489a = new C1101m();

    /* renamed from: b */
    C1101m f2490b = new C1101m();

    /* renamed from: c */
    boolean f2491c;

    /* renamed from: d */
    boolean f2492d;

    /* renamed from: e */
    public static final C0403bd f2493e = new C0403bd();

    /* renamed from: a */
    public static C0402bc m3793a(C0453l c0453l, C1072ab c1072ab) {
        C0402bc c0402bc = new C0402bc();
        c0402bc.m3789b(c0453l, c1072ab);
        if (c0402bc.f2490b.size() == 0) {
            return null;
        }
        Iterator it = c0402bc.f2489a.iterator();
        while (it.hasNext()) {
            C0448g c0448g = (C0448g) it.next();
            if (c0448g != null) {
                int i = 0;
                C0404be c0404be = null;
                Iterator it2 = c0402bc.f2490b.iterator();
                while (it2.hasNext()) {
                    C0404be c0404be2 = (C0404be) it2.next();
                    if (c0404be2.f2499b == c0448g) {
                        i++;
                        c0404be = c0404be2;
                    }
                }
                if (i == 1) {
                    c0453l.m3384r("[placementRule_" + c0404be.f2498a + "]anyRuleInGroup: No other rule with this same group name found");
                }
            }
        }
        return c0402bc;
    }

    /* renamed from: b */
    public void m3789b(C0453l c0453l, C1072ab c1072ab) {
        Iterator it = c1072ab.m632e("placementRule_").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.substring("placementRule_".length());
            C0404be c0404be = new C0404be();
            c0404be.f2498a = substring;
            c0404be.m3786a(c0453l, c1072ab, str);
            if (c0404be.m3787a()) {
                if (!this.f2489a.contains(c0404be.f2499b)) {
                    this.f2489a.add(c0404be.f2499b);
                }
                if (c0404be.f2511n) {
                    if (!c0404be.f2513p) {
                        this.f2491c = true;
                    } else {
                        this.f2492d = true;
                    }
                }
                this.f2490b.add(c0404be);
            }
        }
    }

    /* renamed from: a */
    public String m3792a(AbstractC0623y abstractC0623y, float f, float f2) {
        if (!this.f2491c) {
            return null;
        }
        return m3788b(abstractC0623y, f, f2);
    }

    /* renamed from: a */
    public String m3791a(AbstractC0623y abstractC0623y, int i, int i2) {
        if (!this.f2492d) {
            return null;
        }
        C0173b c0173b = AbstractC0916l.m1071A().f6158bL;
        c0173b.m4496b(i, i2);
        return m3788b(abstractC0623y, c0173b.f828T, c0173b.f829U);
    }

    /* renamed from: b */
    public String m3788b(AbstractC0623y abstractC0623y, float f, float f2) {
        boolean z;
        Iterator it = this.f2489a.iterator();
        while (it.hasNext()) {
            C0448g c0448g = (C0448g) it.next();
            boolean z2 = false;
            boolean z3 = false;
            C0404be c0404be = null;
            Iterator it2 = this.f2490b.iterator();
            while (it2.hasNext()) {
                C0404be c0404be2 = (C0404be) it2.next();
                if (c0404be2.f2499b == c0448g && c0404be2.f2511n) {
                    if (!m3790a(abstractC0623y, c0404be2, f, f2)) {
                        if (c0404be == null) {
                            c0404be = c0404be2;
                        }
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
            }
            if (c0448g == null) {
                z = !z3;
            } else {
                z = z2;
            }
            if (!z && c0404be != null) {
                if (c0404be.f2512o != null) {
                    return c0404be.f2512o.m3830b();
                }
                return "{0}";
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m3790a(AbstractC0623y abstractC0623y, C0404be c0404be, float f, float f2) {
        f2493e.f2494a = f + c0404be.f2504g;
        f2493e.f2495b = f2 + c0404be.f2505h;
        f2493e.f2496c = c0404be;
        f2493e.f2497d = 0;
        AbstractC0916l.m1071A().f6175cc.m3099a(f2493e.f2494a, f2493e.f2495b, c0404be.f2502e, abstractC0623y, 0.0f, f2493e);
        if (f2493e.f2497d >= c0404be.f2508k && f2493e.f2497d <= c0404be.f2509l) {
            return true;
        }
        return false;
    }
}
