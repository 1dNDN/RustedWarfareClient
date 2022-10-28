package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab.class */
public abstract class AbstractC0777ab {

    /* renamed from: a */
    static AbstractC0777ab f5060a = new AbstractC0777ab() { // from class: com.corrodinggames.rts.gameFramework.f.ab.1
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0777ab
        /* renamed from: a */
        public boolean mo1913a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo2842aj() && !abstractC0623y.mo1706u() && abstractC0623y.m2835aq()) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: b */
    static AbstractC0777ab f5061b = new AbstractC0777ab() { // from class: com.corrodinggames.rts.gameFramework.f.ab.2
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0777ab
        /* renamed from: a */
        public boolean mo1913a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo2842aj() && !abstractC0623y.mo1706u()) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: c */
    static AbstractC0777ab f5062c = new AbstractC0777ab() { // from class: com.corrodinggames.rts.gameFramework.f.ab.3
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0777ab
        /* renamed from: a */
        public boolean mo1913a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo1708r() == EnumC0249ar.extractor) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: d */
    static AbstractC0777ab f5063d = new AbstractC0777ab() { // from class: com.corrodinggames.rts.gameFramework.f.ab.4
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0777ab
        /* renamed from: a */
        public boolean mo1913a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo1708r() == EnumC0249ar.fabricator && abstractC0623y.mo2929V() < 3) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: e */
    static AbstractC0777ab f5064e = new AbstractC0777ab() { // from class: com.corrodinggames.rts.gameFramework.f.ab.5
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0777ab
        /* renamed from: a */
        public boolean mo1913a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo1708r() == EnumC0249ar.landFactory) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: f */
    static AbstractC0777ab f5065f = new AbstractC0777ab() { // from class: com.corrodinggames.rts.gameFramework.f.ab.6
        @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0777ab
        /* renamed from: a */
        public boolean mo1913a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo1708r() == EnumC0249ar.airFactory) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: a */
    public abstract boolean mo1913a(AbstractC0623y abstractC0623y);

    AbstractC0777ab() {
    }

    /* renamed from: a */
    public static void m1914a(ArrayList arrayList, AbstractC0777ab abstractC0777ab, AbstractC0777ab abstractC0777ab2) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (m1071A.f6165bS.m1760p() != 1) {
            arrayList.clear();
        }
        AbstractC0623y m1754s = m1071A.f6165bS.m1754s();
        if (m1754s != null) {
            if (abstractC0777ab.mo1913a(m1754s) || (abstractC0777ab2 != null && abstractC0777ab2.mo1913a(m1754s))) {
                if (!arrayList.contains(m1754s)) {
                    arrayList.add(m1754s);
                }
            } else {
                arrayList.clear();
            }
        }
        AbstractC0623y m1915a = m1915a(arrayList, abstractC0777ab);
        if (m1915a == null && abstractC0777ab2 != null) {
            m1915a = m1915a(arrayList, abstractC0777ab2);
        }
        if (m1915a == null) {
            arrayList.clear();
            if (m1754s != null) {
                arrayList.add(m1754s);
            }
            m1915a = m1915a(arrayList, abstractC0777ab);
            if (m1915a == null && abstractC0777ab2 != null) {
                m1915a = m1915a(arrayList, abstractC0777ab2);
            }
        }
        if (m1915a != null) {
            m1071A.f6165bS.m1749x();
            m1071A.f6165bS.m1771j(m1915a);
            m1071A.m987b(m1915a.f6958el, m1915a.f6959em);
            arrayList.add(m1915a);
        }
    }

    /* renamed from: a */
    public static AbstractC0623y m1915a(ArrayList arrayList, AbstractC0777ab abstractC0777ab) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        AbstractC0623y abstractC0623y = null;
        float f = -1.0f;
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                if (m1071A.f6165bS.m1765m(abstractC0623y2) && abstractC0777ab.mo1913a(abstractC0623y2) && !arrayList.contains(abstractC0623y2)) {
                    float m2147a = C0758f.m2147a(m1071A.f6196cx + m1071A.f6206cH, m1071A.f6197cy + m1071A.f6207cI, abstractC0623y2.f6958el, abstractC0623y2.f6959em);
                    if (abstractC0623y == null || m2147a < f) {
                        f = m2147a;
                        abstractC0623y = abstractC0623y2;
                    }
                }
            }
        }
        return abstractC0623y;
    }
}
