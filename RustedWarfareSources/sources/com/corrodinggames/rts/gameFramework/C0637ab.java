package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ab.class */
public class C0637ab {

    /* renamed from: a */
    C1101m f4074a = new C1101m();

    /* renamed from: b */
    boolean f4075b;

    /* renamed from: c */
    float f4076c;

    /* renamed from: d */
    float f4077d;

    /* renamed from: e */
    int f4078e;

    /* renamed from: f */
    boolean f4079f;

    /* renamed from: g */
    public C1101m f4080g;

    /* renamed from: h */
    final /* synthetic */ C0636aa f4081h;

    public C0637ab(C0636aa c0636aa) {
        this.f4081h = c0636aa;
    }

    /* renamed from: a */
    public void m2680a(AbstractC0623y abstractC0623y, C0305au c0305au) {
        c0305au.f1805i = this;
        this.f4079f = c0305au.f1806j;
    }

    /* renamed from: a */
    public void m2682a(C0305au c0305au) {
        C0305au m2834ar;
        Iterator it = this.f4074a.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (!abstractC0623y.f1607bT && (m2834ar = abstractC0623y.m2834ar()) != null && m2834ar.m4028b(c0305au)) {
                abstractC0623y.m2827ay();
            }
        }
    }

    /* renamed from: a */
    public void m2684a() {
        C0305au m2834ar;
        this.f4074a.clear();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.mo2940I() && (m2834ar = abstractC0623y.m2834ar()) != null && m2834ar.f1805i == this && abstractC0623y.mo2797bg()) {
                    this.f4074a.add(abstractC0623y);
                    this.f4076c = m2834ar.m4017g();
                    this.f4077d = m2834ar.m4015h();
                }
            }
        }
    }

    /* renamed from: a */
    public void m2681a(AbstractC0623y abstractC0623y) {
        abstractC0623y.f3922ab = this.f4078e;
        C0305au m2834ar = abstractC0623y.m2834ar();
        if (m2834ar != null) {
            m2834ar.f1805i = this;
        }
    }

    /* renamed from: b */
    public void m2677b() {
        C0727bl.m2370a();
        m2676c();
    }

    /* renamed from: a */
    public AbstractC0623y m2679a(C1101m c1101m, float f, float f2, boolean z) {
        float f3 = -1.0f;
        AbstractC0623y abstractC0623y = null;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) it.next();
            if (z || (abstractC0623y2.f3923ac == null && !abstractC0623y2.f3924ad)) {
                float m2095b = C0758f.m2095b(f, f2, abstractC0623y2.f6958el, abstractC0623y2.f6959em);
                if (abstractC0623y2.f3925ae) {
                    m2095b -= 160.0f;
                }
                if (f3 == -1.0f || m2095b < f3) {
                    f3 = m2095b;
                    abstractC0623y = abstractC0623y2;
                }
            }
        }
        return abstractC0623y;
    }

    /* renamed from: a */
    public C1101m m2683a(float f, float f2, boolean z) {
        C1101m c1101m = new C1101m(1);
        C1101m c1101m2 = new C1101m();
        c1101m2.clear();
        c1101m2.addAll(this.f4074a);
        while (true) {
            AbstractC0623y m2679a = m2679a(c1101m2, f, f2, true);
            if (m2679a != null) {
                c1101m.add(m2679a);
                c1101m2.remove(m2679a);
                c1101m2.removeAll(m2678a(c1101m2, m2679a, true, z));
            } else {
                return c1101m;
            }
        }
    }

    /* renamed from: a */
    public C1101m m2678a(C1101m c1101m, AbstractC0623y abstractC0623y, boolean z, boolean z2) {
        C1101m c1101m2 = new C1101m(1);
        c1101m2.clear();
        int i = 0;
        Object[] m534a = c1101m.m534a();
        int size = c1101m.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0623y) m534a[i2]).f3935ao = false;
        }
        for (int i3 = 0; i3 <= 2; i3++) {
            int size2 = c1101m.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m534a[i4];
                if (!abstractC0623y2.f3935ao && abstractC0623y2 != abstractC0623y && ((z || (abstractC0623y2.f3923ac == null && !abstractC0623y2.f3924ad)) && abstractC0623y2.mo2960h() == abstractC0623y.mo2960h())) {
                    float m2147a = C0758f.m2147a(abstractC0623y2.f6958el, abstractC0623y2.f6959em, abstractC0623y.f6958el, abstractC0623y.f6959em);
                    if ((i3 != 0 || m2147a <= 3600.0f) && ((i3 != 1 || m2147a <= 14400.0f) && (((z2 && m2147a < 160000.0f) || (m2147a < 40000.0f && i < 25)) && (z2 || C0758f.m2075c(abstractC0623y2.mo2713z() - abstractC0623y.mo2713z()) < 0.4f)))) {
                        abstractC0623y2.f3935ao = true;
                        c1101m2.add(abstractC0623y2);
                        i++;
                    }
                }
            }
        }
        return c1101m2;
    }

    /* renamed from: c */
    public void m2676c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0727bl.m2370a();
        m2684a();
        this.f4081h.f4073b.m5040a(0.0f, 0.0f);
        Iterator it = this.f4074a.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            this.f4081h.f4073b.m5038b(abstractC0623y.f6958el, abstractC0623y.f6959em);
        }
        this.f4081h.f4073b.m5040a(this.f4081h.f4073b.f227a / this.f4074a.size(), this.f4081h.f4073b.f228b / this.f4074a.size());
        float m2061d = C0758f.m2061d(this.f4081h.f4073b.f227a, this.f4081h.f4073b.f228b, this.f4076c, this.f4077d);
        Iterator it2 = this.f4074a.iterator();
        while (it2.hasNext()) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
            if (abstractC0623y2.f3927ag > 1) {
                abstractC0623y2.f3925ae = abstractC0623y2.f3924ad;
            } else {
                abstractC0623y2.f3925ae = false;
            }
            if (abstractC0623y2.f3925ae && abstractC0623y2.f3927ag > 7 && C0758f.m2075c(C0758f.m2073c(abstractC0623y2.f3932al, m2061d, 360.0f)) > 80.0f) {
                abstractC0623y2.f3925ae = false;
            }
            abstractC0623y2.m2877aB();
            abstractC0623y2.f3927ag = (short) 0;
            abstractC0623y2.f3933am = m1071A.f6145by;
            abstractC0623y2.f3922ab = this.f4078e;
        }
        int i = 0;
        while (true) {
            C0727bl.m2370a();
            AbstractC0623y m2679a = m2679a(this.f4074a, this.f4076c, this.f4077d, false);
            if (m2679a == null) {
                return;
            }
            m2679a.f3924ad = true;
            C0637ab c0637ab = null;
            if (i > 0) {
                c0637ab = this.f4081h.m2686b();
            }
            if (c0637ab != null) {
                c0637ab.f4080g = this.f4080g;
                c0637ab.m2681a(m2679a);
            }
            int i2 = 0;
            float f = 0.0f;
            Iterator it3 = m2678a(this.f4074a, m2679a, false, this.f4079f).iterator();
            while (it3.hasNext()) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) it3.next();
                if (abstractC0623y3.f1621ch > f) {
                    f = abstractC0623y3.f1621ch;
                }
                abstractC0623y3.m2890a(m2679a);
                if (c0637ab != null) {
                    c0637ab.m2681a(abstractC0623y3);
                }
                i2++;
            }
            if (m2679a != null) {
                m2679a.f3927ag = (short) (i2 + 1);
            }
            C1101m c1101m = new C1101m();
            Object[] m534a = this.f4074a.m534a();
            int size = this.f4074a.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0623y abstractC0623y4 = (AbstractC0623y) m534a[i3];
                if (abstractC0623y4.f3923ac == m2679a) {
                    c1101m.add(abstractC0623y4);
                }
            }
            C1101m m2690a = this.f4081h.m2690a(i2, f, m2061d);
            C0727bl.m2370a();
            this.f4081h.m2687a(c1101m, m2679a, m2690a, m2061d, i2);
            C0727bl.m2370a();
            this.f4081h.m2688a(c1101m, m2679a);
            i++;
        }
    }
}
