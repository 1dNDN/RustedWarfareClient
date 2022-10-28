package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/aa.class */
public class C0636aa extends AbstractC0726bk {

    /* renamed from: a */
    int f4072a;

    /* renamed from: b */
    PointF f4073b = new PointF();

    /* renamed from: a */
    public void m2765a() {
        this.f4072a = 1;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(0);
        streamWriter.WriteInteger(this.f4072a);
    }

    /* renamed from: a */
    public void m2762a(Reader reader) {
        reader.ReadInt();
        this.f4072a = reader.ReadInt();
    }

    /* renamed from: a */
    public void m2764a(float f) {
    }

    /* renamed from: b */
    public C0637ab m2759b() {
        C0637ab c0637ab = new C0637ab(this);
        c0637ab.f4078e = this.f4072a;
        this.f4072a++;
        return c0637ab;
    }

    /* renamed from: c */
    public C0637ab m2758c() {
        C0637ab c0637ab = new C0637ab(this);
        c0637ab.f4078e = -1;
        c0637ab.f4075b = true;
        return c0637ab;
    }

    /* renamed from: a */
    public void m2760a(C1101m c1101m, AbstractC0623y abstractC0623y, C1101m c1101m2, float f, int i) {
        int i2 = 0;
        while (!c1101m2.isEmpty()) {
            AbstractC0623y abstractC0623y2 = null;
            float f2 = -1.0f;
            PointF pointF = null;
            int i3 = -1;
            Object[] m534a = c1101m2.m534a();
            Object[] m534a2 = c1101m.m534a();
            int size = c1101m.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) m534a2[i4];
                if (abstractC0623y3.f3921ac == abstractC0623y && !abstractC0623y3.f3927ai) {
                    float f3 = -1.0f;
                    PointF pointF2 = null;
                    int i5 = -1;
                    for (int i6 = 0; i6 < c1101m2.f6894a; i6++) {
                        PointF pointF3 = (PointF) m534a[i6];
                        float m2209a = C0758f.m2209a(abstractC0623y3.f6958el, abstractC0623y3.f6959em, abstractC0623y.f6958el + pointF3.f227a, abstractC0623y.f6959em + pointF3.f228b);
                        if (f3 == -1.0f || m2209a < f3) {
                            f3 = m2209a;
                            pointF2 = pointF3;
                            i5 = i6;
                        }
                    }
                    if (f3 > f2) {
                        abstractC0623y2 = abstractC0623y3;
                        f2 = f3;
                        pointF = pointF2;
                        i3 = i5;
                    }
                }
            }
            if (abstractC0623y2 != null) {
                i2++;
                abstractC0623y2.f3927ai = true;
                abstractC0623y2.f3928aj = pointF.f227a;
                abstractC0623y2.f3929ak = pointF.f228b;
                abstractC0623y2.f3930al = f;
                abstractC0623y2.f3932an = f2;
                abstractC0623y2.f3925ag = (short) (i + 1);
                c1101m2.remove(i3);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m2761a(C1101m c1101m, AbstractC0623y abstractC0623y) {
        while (true) {
            AbstractC0623y abstractC0623y2 = null;
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) it.next();
                if (abstractC0623y3.f3921ac == abstractC0623y && abstractC0623y3.f3932an > 0.0f && (abstractC0623y2 == null || abstractC0623y3.f3932an > abstractC0623y2.f3932an)) {
                    if (abstractC0623y3.f3927ai && abstractC0623y3.f3932an > 100.0f) {
                        abstractC0623y2 = abstractC0623y3;
                    }
                }
            }
            if (abstractC0623y2 != null) {
                abstractC0623y2.f3927ai = false;
                AbstractC0623y abstractC0623y4 = null;
                float f = 0.0f;
                AbstractC0623y abstractC0623y5 = abstractC0623y2;
                int m2204a = C0758f.m2204a((int) abstractC0623y5.f3932an);
                Iterator it2 = c1101m.iterator();
                while (it2.hasNext()) {
                    AbstractC0623y abstractC0623y6 = (AbstractC0623y) it2.next();
                    if (abstractC0623y6.f3921ac == abstractC0623y && abstractC0623y6.f3932an > 0.0f && abstractC0623y6 != abstractC0623y5) {
                        float m2134c = ((0 + C0758f.m2134c(abstractC0623y5.f6958el, abstractC0623y5.f6959em, abstractC0623y.f6958el + abstractC0623y6.f3928aj, abstractC0623y.f6959em + abstractC0623y6.f3929ak)) + C0758f.m2134c(abstractC0623y6.f6958el, abstractC0623y6.f6959em, abstractC0623y.f6958el + abstractC0623y5.f3928aj, abstractC0623y.f6959em + abstractC0623y5.f3929ak)) - (C0758f.m2204a((int) abstractC0623y6.f3932an) + m2204a);
                        if (m2134c < f) {
                            f = m2134c;
                            abstractC0623y4 = abstractC0623y6;
                        }
                    }
                }
                if (abstractC0623y4 != null) {
                    float f2 = abstractC0623y5.f3928aj;
                    float f3 = abstractC0623y5.f3929ak;
                    abstractC0623y5.f3928aj = abstractC0623y4.f3928aj;
                    abstractC0623y5.f3929ak = abstractC0623y4.f3929ak;
                    abstractC0623y5.f3932an = C0758f.m2209a(abstractC0623y5.f6958el, abstractC0623y5.f6959em, abstractC0623y.f6958el + abstractC0623y5.f3928aj, abstractC0623y.f6959em + abstractC0623y5.f3929ak);
                    abstractC0623y4.f3928aj = f2;
                    abstractC0623y4.f3929ak = f3;
                    abstractC0623y4.f3932an = C0758f.m2209a(abstractC0623y4.f6958el, abstractC0623y4.f6959em, abstractC0623y.f6958el + abstractC0623y4.f3928aj, abstractC0623y.f6959em + abstractC0623y4.f3929ak);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C1101m m2763a(int i, float f, float f2) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        int i5 = 6 / 2;
        float f3 = 2.0f + (f * 2.0f * 1.5f);
        C1101m c1101m = new C1101m();
        int i6 = i;
        if (i6 % 2 != 0) {
            i6++;
        }
        float m2092i = C0758f.m2092i(f2);
        float m2097h = C0758f.m2097h(f2);
        for (int i7 = 0; i7 < i6; i7++) {
            if (i3 % 2 == 0) {
                i2 = i5 + (i3 / 2);
            } else {
                i2 = i5 - ((i3 + 1) / 2);
            }
            float f4 = (i2 - i5) * f3;
            float f5 = (-i4) * f3;
            c1101m.add(new PointF((f5 * m2092i) - (f4 * m2097h), (f4 * m2092i) + (f5 * m2097h)));
            i3++;
            if (i3 > 6) {
                i3 = 0;
                i4++;
            }
        }
        return c1101m;
    }
}
