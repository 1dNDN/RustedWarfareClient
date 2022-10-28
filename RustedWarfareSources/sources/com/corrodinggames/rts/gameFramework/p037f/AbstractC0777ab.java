package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab.class */
public abstract class AbstractC0777ab {

    /* renamed from: a */
    static AbstractC0777ab f5060a = new C07781();

    /* renamed from: b */
    static AbstractC0777ab f5061b = new C07792();

    /* renamed from: c */
    static AbstractC0777ab f5062c = new C07803();

    /* renamed from: d */
    static AbstractC0777ab f5063d = new C07814();

    /* renamed from: e */
    static AbstractC0777ab f5064e = new C07825();

    /* renamed from: f */
    static AbstractC0777ab f5065f = new C07836();

    /* renamed from: a */
    public abstract boolean m1974a(AbstractC0623y abstractC0623y);

    AbstractC0777ab() {
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$1.class */
    final class C07781 extends AbstractC0777ab {
        C07781() {
        }

        /* renamed from: a */
        public boolean m1971a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.m2917aj() && !abstractC0623y.mo1756u() && abstractC0623y.m2910aq()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$2.class */
    final class C07792 extends AbstractC0777ab {
        C07792() {
        }

        /* renamed from: a */
        public boolean m1970a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.m2917aj() && !abstractC0623y.mo1756u()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$3.class */
    final class C07803 extends AbstractC0777ab {
        C07803() {
        }

        /* renamed from: a */
        public boolean m1969a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo1758r() == EnumC0249ar.f1735a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$4.class */
    final class C07814 extends AbstractC0777ab {
        C07814() {
        }

        /* renamed from: a */
        public boolean m1968a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo1758r() == EnumC0249ar.f1770J && abstractC0623y.m3005V() < 3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$5.class */
    final class C07825 extends AbstractC0777ab {
        C07825() {
        }

        /* renamed from: a */
        public boolean m1967a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo1758r() == EnumC0249ar.f1736b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$6.class */
    final class C07836 extends AbstractC0777ab {
        C07836() {
        }

        /* renamed from: a */
        public boolean m1966a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo1758r() == EnumC0249ar.f1737c) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m1972a(ArrayList arrayList, AbstractC0777ab abstractC0777ab, AbstractC0777ab abstractC0777ab2) {
        Core m1087A = Core.m1087A();
        if (m1087A.f6117bS.m1811p() != 1) {
            arrayList.clear();
        }
        AbstractC0623y m1805s = m1087A.f6117bS.m1805s();
        if (m1805s != null) {
            if (abstractC0777ab.m1974a(m1805s) || (abstractC0777ab2 != null && abstractC0777ab2.m1974a(m1805s))) {
                if (!arrayList.contains(m1805s)) {
                    arrayList.add(m1805s);
                }
            } else {
                arrayList.clear();
            }
        }
        AbstractC0623y m1973a = m1973a(arrayList, abstractC0777ab);
        if (m1973a == null && abstractC0777ab2 != null) {
            m1973a = m1973a(arrayList, abstractC0777ab2);
        }
        if (m1973a == null) {
            arrayList.clear();
            if (m1805s != null) {
                arrayList.add(m1805s);
            }
            m1973a = m1973a(arrayList, abstractC0777ab);
            if (m1973a == null && abstractC0777ab2 != null) {
                m1973a = m1973a(arrayList, abstractC0777ab2);
            }
        }
        if (m1973a != null) {
            m1087A.f6117bS.m1800x();
            m1087A.f6117bS.m1822j(m1973a);
            m1087A.m1003b(m1973a.f6958el, m1973a.f6959em);
            arrayList.add(m1973a);
        }
    }

    /* renamed from: a */
    public static AbstractC0623y m1973a(ArrayList arrayList, AbstractC0777ab abstractC0777ab) {
        Core m1087A = Core.m1087A();
        AbstractC0623y abstractC0623y = null;
        float f = -1.0f;
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                if (m1087A.f6117bS.m1816m(abstractC0623y2) && abstractC0777ab.m1974a(abstractC0623y2) && !arrayList.contains(abstractC0623y2)) {
                    float m2209a = C0758f.m2209a(m1087A.f6146cx + m1087A.f6156cH, m1087A.f6147cy + m1087A.f6157cI, abstractC0623y2.f6958el, abstractC0623y2.f6959em);
                    if (abstractC0623y == null || m2209a < f) {
                        f = m2209a;
                        abstractC0623y = abstractC0623y2;
                    }
                }
            }
        }
        return abstractC0623y;
    }
}
