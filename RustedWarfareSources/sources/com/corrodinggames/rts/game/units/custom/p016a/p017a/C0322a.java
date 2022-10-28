package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p020d.C0425c;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/a.class */
public class C0322a extends AbstractC0321a {

    /* renamed from: a */
    C0428a f1911a;

    /* renamed from: c */
    C0428a f1913c;

    /* renamed from: e */
    C0425c f1915e;

    /* renamed from: f */
    C0425c f1916f;

    /* renamed from: b */
    double f1912b = -1.7976931348623157E308d;

    /* renamed from: d */
    float f1914d = 1.0f;

    /* renamed from: a */
    public static void m3986a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0428a m684a = c1072ab.m684a(c0453l, str, str2 + "resourceAmount", (C0428a) null, true);
        if (m684a != null) {
            C0322a c0322a = new C0322a();
            c0322a.f1911a = m684a;
            c0322a.f1912b = c1072ab.m669a(str, str2 + "resourceAmount_setValue", -1.7976931348623157E308d);
            c0322a.f1913c = c1072ab.m684a(c0453l, str, str2 + "resourceAmount_addOtherResource", (C0428a) null, true);
            c0322a.f1914d = c1072ab.m661a(str, str2 + "resourceAmount_multiplyBy", Float.valueOf(1.0f)).floatValue();
            c0339d.f2101ab.add(c0322a);
        }
        C0425c m3691a = C0425c.m3691a(c0453l, c1072ab, str, str2 + "addResourcesWithLogic", null);
        C0425c m3691a2 = C0425c.m3691a(c0453l, c1072ab, str, str2 + "setResourcesWithLogic", null);
        if (m3691a != null || m3691a2 != null) {
            C0322a c0322a2 = new C0322a();
            c0322a2.f1916f = m3691a2;
            c0322a2.f1915e = m3691a;
            c0339d.f2101ab.add(c0322a2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        double mo3651a;
        if (this.f1911a != null) {
            if (this.f1912b != -1.7976931348623157E308d) {
                mo3651a = this.f1912b;
            } else {
                mo3651a = this.f1911a.mo3651a(c0451j);
            }
            if (this.f1913c != null) {
                mo3651a += this.f1913c.mo3651a(c0451j);
            }
            this.f1911a.mo3650a(c0451j, mo3651a * this.f1914d);
        }
        if (this.f1916f != null) {
            this.f1916f.m3685d(c0451j);
        }
        if (this.f1915e != null) {
            this.f1915e.m3684e(c0451j);
            return true;
        }
        return true;
    }
}
