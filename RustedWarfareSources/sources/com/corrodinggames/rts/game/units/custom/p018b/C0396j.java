package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0405bf;
import com.corrodinggames.rts.game.units.custom.C0411bl;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.p024d.C0505p;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/j.class */
public class C0396j extends AbstractC0387a {

    /* renamed from: a */
    public static final AbstractC0387a f2438a = new C0396j();

    /* renamed from: b */
    static final PointF f2439b = new PointF();

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo3798b(C0451j c0451j, float f) {
        C0453l c0453l = c0451j.f2863x;
        int mo2792bl = c0451j.mo2792bl();
        for (int i = 0; i < mo2792bl; i++) {
            C0411bl c0411bl = c0453l.f3255fO[i];
            if (c0411bl.f2604aj != null && c0451j.f1639cz > 0.0f && !c0451j.f2861v) {
                float floatValue = c0411bl.f2604aj.floatValue();
                f2439b.m5039a(c0451j.mo2947E(i));
                float mo2738m = c0451j.mo2738m();
                if (c0411bl.f2596ab < 99999.0f) {
                    mo2738m = c0411bl.f2596ab;
                }
                if (C0505p.m3213a(c0451j, f2439b.f227a, f2439b.f228b, c0451j.f6960en, mo2738m, floatValue)) {
                }
                if (c0451j.f1639cz < 0.0f) {
                    c0451j.f1639cz = 0.0f;
                    c0451j.f2861v = true;
                }
            }
            if (c0411bl.f2605ak != null) {
                m3812a(c0451j, c0411bl);
            }
        }
    }

    /* renamed from: a */
    public static void m3812a(C0451j c0451j, C0411bl c0411bl) {
        if (!c0451j.m3536a(c0411bl)) {
            return;
        }
        float f = c0411bl.f2606al;
        float f2 = c0411bl.f2607am;
        float f3 = c0411bl.f2608an;
        C0188f c0188f = null;
        C0449h c0449h = c0411bl.f2605ak;
        Object[] m534a = C0188f.f981a.m534a();
        int i = C0188f.f981a.f6894a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f2 = (C0188f) m534a[i2];
            if (c0188f2.f1064aE != null && c0188f2.f6960en > f3 && C0448g.m3572a(c0188f2.f1064aE, c0449h) && C0758f.m2147a(c0451j.f6958el, c0451j.f6959em, c0188f2.f6958el, c0188f2.f6959em) < f2 * f2 && ((C0758f.m2147a(c0451j.f6958el, c0451j.f6959em, c0188f2.f995n, c0188f2.f996o) < f * f || f < 0.0f) && ((c0188f2.f991j == null || (!c0188f2.f991j.f1609bV.m4264d(c0451j.f1609bV) && c0188f2.f991j.f1609bV != c0451j.f1609bV)) && c0188f2.f989h > 0.0f && !m3813a(c0188f2)))) {
                c0188f = c0188f2;
            }
        }
        if (c0188f != null) {
            c0451j.m3524b(c0411bl);
            C0188f m3541a = c0451j.m3541a((AbstractC0244am) null, c0188f.f6958el, c0188f.f6959em, c0411bl.f2547e, (C0405bf) null, 0);
            m3541a.f1062aC = true;
            m3541a.f998q = c0188f;
        }
    }

    /* renamed from: a */
    public static boolean m3813a(C0188f c0188f) {
        Object[] m534a = C0188f.f981a.m534a();
        int i = C0188f.f981a.f6894a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f2 = (C0188f) m534a[i2];
            if (c0188f2 != c0188f && c0188f2.f998q == c0188f) {
                return true;
            }
        }
        return false;
    }
}
