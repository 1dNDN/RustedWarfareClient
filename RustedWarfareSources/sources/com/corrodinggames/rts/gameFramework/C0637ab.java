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
    public void m2753a(AbstractC0623y abstractC0623y, C0305au c0305au) {
        c0305au.f1805i = this;
        this.f4079f = c0305au.f1806j;
    }

    /* renamed from: a */
    public void m2755a(C0305au c0305au) {
        C0305au m2909ar;
        Iterator it = this.f4074a.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (!abstractC0623y.f1607bT && (m2909ar = abstractC0623y.m2909ar()) != null && m2909ar.m4449b(c0305au)) {
                abstractC0623y.m2902ay();
            }
        }
    }

    /* renamed from: a */
    public void m2757a() {
        C0305au m2909ar;
        this.f4074a.clear();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.mo3057I() && (m2909ar = abstractC0623y.m2909ar()) != null && m2909ar.f1805i == this && abstractC0623y.m2872bg()) {
                    this.f4074a.add(abstractC0623y);
                    this.f4076c = m2909ar.m4438g();
                    this.f4077d = m2909ar.m4436h();
                }
            }
        }
    }

    /* renamed from: a */
    public void m2754a(AbstractC0623y abstractC0623y) {
        abstractC0623y.f3920ab = this.f4078e;
        C0305au m2909ar = abstractC0623y.m2909ar();
        if (m2909ar != null) {
            m2909ar.f1805i = this;
        }
    }

    /* renamed from: b */
    public void m2750b() {
        C0727bl.m2440a();
        m2749c();
    }

    /* renamed from: a */
    public AbstractC0623y m2752a(C1101m c1101m, float f, float f2, boolean z) {
        float f3 = -1.0f;
        AbstractC0623y abstractC0623y = null;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) it.next();
            if (z || (abstractC0623y2.f3921ac == null && !abstractC0623y2.f3922ad)) {
                float m2157b = C0758f.m2157b(f, f2, abstractC0623y2.f6958el, abstractC0623y2.f6959em);
                if (abstractC0623y2.f3923ae) {
                    m2157b -= 160.0f;
                }
                if (f3 == -1.0f || m2157b < f3) {
                    f3 = m2157b;
                    abstractC0623y = abstractC0623y2;
                }
            }
        }
        return abstractC0623y;
    }

    /* renamed from: a */
    public C1101m m2756a(float f, float f2, boolean z) {
        C1101m c1101m = new C1101m(1);
        C1101m c1101m2 = new C1101m();
        c1101m2.clear();
        c1101m2.addAll(this.f4074a);
        while (true) {
            AbstractC0623y m2752a = m2752a(c1101m2, f, f2, true);
            if (m2752a != null) {
                c1101m.add(m2752a);
                c1101m2.remove(m2752a);
                c1101m2.removeAll(m2751a(c1101m2, m2752a, true, z));
            } else {
                return c1101m;
            }
        }
    }

    /* renamed from: a */
    public C1101m m2751a(C1101m c1101m, AbstractC0623y abstractC0623y, boolean z, boolean z2) {
        C1101m c1101m2 = new C1101m(1);
        c1101m2.clear();
        int i = 0;
        Object[] m534a = c1101m.m534a();
        int size = c1101m.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0623y) m534a[i2]).f3933ao = false;
        }
        for (int i3 = 0; i3 <= 2; i3++) {
            int size2 = c1101m.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m534a[i4];
                if (!abstractC0623y2.f3933ao && abstractC0623y2 != abstractC0623y && ((z || (abstractC0623y2.f3921ac == null && !abstractC0623y2.f3922ad)) && abstractC0623y2.mo3039h() == abstractC0623y.mo3039h())) {
                    float m2209a = C0758f.m2209a(abstractC0623y2.f6958el, abstractC0623y2.f6959em, abstractC0623y.f6958el, abstractC0623y.f6959em);
                    if ((i3 != 0 || m2209a <= 3600.0f) && ((i3 != 1 || m2209a <= 14400.0f) && (((z2 && m2209a < 160000.0f) || (m2209a < 40000.0f && i < 25)) && (z2 || C0758f.m2137c(abstractC0623y2.mo3033z() - abstractC0623y.mo3033z()) < 0.4f)))) {
                        abstractC0623y2.f3933ao = true;
                        c1101m2.add(abstractC0623y2);
                        i++;
                    }
                }
            }
        }
        return c1101m2;
    }

    /* renamed from: c */
    public void m2749c() {
        Core m1087A = Core.m1087A();
        C0727bl.m2440a();
        m2757a();
        this.f4081h.f4073b.m5879a(0.0f, 0.0f);
        Iterator it = this.f4074a.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            this.f4081h.f4073b.m5877b(abstractC0623y.f6958el, abstractC0623y.f6959em);
        }
        this.f4081h.f4073b.m5879a(this.f4081h.f4073b.f227a / this.f4074a.size(), this.f4081h.f4073b.f228b / this.f4074a.size());
        float m2123d = C0758f.m2123d(this.f4081h.f4073b.f227a, this.f4081h.f4073b.f228b, this.f4076c, this.f4077d);
        Iterator it2 = this.f4074a.iterator();
        while (it2.hasNext()) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
            if (abstractC0623y2.f3925ag > 1) {
                abstractC0623y2.f3923ae = abstractC0623y2.f3922ad;
            } else {
                abstractC0623y2.f3923ae = false;
            }
            if (abstractC0623y2.f3923ae && abstractC0623y2.f3925ag > 7 && C0758f.m2137c(C0758f.m2135c(abstractC0623y2.f3930al, m2123d, 360.0f)) > 80.0f) {
                abstractC0623y2.f3923ae = false;
            }
            abstractC0623y2.m2952aB();
            abstractC0623y2.f3925ag = (short) 0;
            abstractC0623y2.f3931am = m1087A.f6102by;
            abstractC0623y2.f3920ab = this.f4078e;
        }
        int i = 0;
        while (true) {
            C0727bl.m2440a();
            AbstractC0623y m2752a = m2752a(this.f4074a, this.f4076c, this.f4077d, false);
            if (m2752a == null) {
                return;
            }
            m2752a.f3922ad = true;
            C0637ab c0637ab = null;
            if (i > 0) {
                c0637ab = this.f4081h.m2759b();
            }
            if (c0637ab != null) {
                c0637ab.f4080g = this.f4080g;
                c0637ab.m2754a(m2752a);
            }
            int i2 = 0;
            float f = 0.0f;
            Iterator it3 = m2751a(this.f4074a, m2752a, false, this.f4079f).iterator();
            while (it3.hasNext()) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) it3.next();
                if (abstractC0623y3.f1621ch > f) {
                    f = abstractC0623y3.f1621ch;
                }
                abstractC0623y3.m2966a(m2752a);
                if (c0637ab != null) {
                    c0637ab.m2754a(abstractC0623y3);
                }
                i2++;
            }
            if (m2752a != null) {
                m2752a.f3925ag = (short) (i2 + 1);
            }
            C1101m c1101m = new C1101m();
            Object[] m534a = this.f4074a.m534a();
            int size = this.f4074a.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0623y abstractC0623y4 = (AbstractC0623y) m534a[i3];
                if (abstractC0623y4.f3921ac == m2752a) {
                    c1101m.add(abstractC0623y4);
                }
            }
            C1101m m2763a = this.f4081h.m2763a(i2, f, m2123d);
            C0727bl.m2440a();
            this.f4081h.m2760a(c1101m, m2752a, m2763a, m2123d, i2);
            C0727bl.m2440a();
            this.f4081h.m2761a(c1101m, m2752a);
            i++;
        }
    }
}
