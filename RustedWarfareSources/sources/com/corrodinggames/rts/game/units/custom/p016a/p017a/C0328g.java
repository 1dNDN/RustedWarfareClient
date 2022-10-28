package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/g.class */
public class C0328g extends AbstractC0321a {

    /* renamed from: a */
    C0428a f1968a;

    /* renamed from: b */
    C0428a f1969b;

    /* renamed from: c */
    double f1970c;

    /* renamed from: d */
    double f1971d;

    /* renamed from: e */
    float f1972e;

    /* renamed from: a */
    public static void m3979a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0428a m684a = c1072ab.m684a(c0453l, str, "convertResource_from", (C0428a) null, true);
        C0428a m684a2 = c1072ab.m684a(c0453l, str, "convertResource_to", (C0428a) null, true);
        if ((m684a != null || m684a2 != null) && (m684a == null || m684a2 == null)) {
            throw new C0412bm("[" + str + "] Both convertResource_from and convertResource_to are required together");
        }
        if (m684a != null && m684a2 != null) {
            C0328g c0328g = new C0328g();
            c0328g.f1968a = m684a;
            c0328g.f1969b = m684a2;
            c0328g.f1970c = c1072ab.m669a(str, "convertResource_minAmount", 0.0d);
            c0328g.f1971d = c1072ab.m619j(str, "convertResource_maxAmount");
            if (c0328g.f1970c < 0.0d) {
                throw new C0412bm("[" + str + "] convertResource_minAmount cannot be < 0");
            }
            if (c0328g.f1971d < 0.0d) {
                throw new C0412bm("[" + str + "] convertResource_maxAmount cannot be < 0");
            }
            if (c0328g.f1971d < c0328g.f1970c) {
                throw new C0412bm("[" + str + "] convertResource_maxAmount cannot be < convertResource_minAmount");
            }
            c0328g.f1972e = c1072ab.m661a(str, "convertResource_multiplyAmountBy", Float.valueOf(1.0f)).floatValue();
            c0339d.f2101ab.add(c0328g);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        double mo3651a = this.f1968a.mo3651a(c0451j);
        if (mo3651a > this.f1970c) {
            double m2152a = C0758f.m2152a(mo3651a, this.f1971d);
            this.f1968a.mo3649b(c0451j, -m2152a);
            this.f1969b.mo3649b(c0451j, m2152a * this.f1972e);
            return true;
        }
        return true;
    }
}
