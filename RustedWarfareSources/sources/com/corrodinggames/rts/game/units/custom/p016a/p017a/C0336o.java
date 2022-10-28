package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/o.class */
public class C0336o extends AbstractC0321a {

    /* renamed from: a */
    public C0413bn f2027a;

    /* renamed from: b */
    public int f2028b;

    /* renamed from: c */
    public C0449h f2029c;

    /* renamed from: d */
    public boolean f2030d;

    /* renamed from: e */
    public boolean f2031e;

    /* renamed from: f */
    public int f2032f = -1;

    /* renamed from: a */
    public static void m3971a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0413bn m3763a = C0413bn.m3763a(c0453l, c1072ab, str, str2 + "addUnitsIntoTransport");
        int intValue = c1072ab.m645b(str, str2 + "deleteNumUnitsFromTransport", (Integer) 0).intValue();
        C0449h m3568a = C0448g.m3568a(c1072ab.m644b(str, "deleteNumUnitsFromTransport_onlyWithTags", (String) null), (C0449h) null);
        boolean booleanValue = c1072ab.m663a(str, str2 + "startUnloadingTransport", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1072ab.m663a(str, str2 + "forceUnloadTransportNow", (Boolean) false).booleanValue();
        int intValue2 = c1072ab.m645b(str, str2 + "forceUnloadTransportNow_onlyOnSlot", (Integer) (-1)).intValue();
        if (intValue2 != -1 && !booleanValue2) {
            throw new C0412bm("forceUnloadTransportNow_onlyOnSlot expects forceUnloadTransportNow");
        }
        if (!m3763a.m3758b() || intValue > 0 || booleanValue || booleanValue2) {
            C0336o c0336o = new C0336o();
            if (!m3763a.m3758b()) {
                c0336o.f2027a = m3763a;
            }
            if (intValue > 0) {
                c0336o.f2028b = intValue;
                c0336o.f2029c = m3568a;
            }
            c0336o.f2030d = booleanValue;
            c0336o.f2031e = booleanValue2;
            c0336o.f2032f = intValue2;
            c0339d.f2101ab.add(c0336o);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f2028b != 0) {
            for (int i2 = 0; i2 < this.f2028b; i2++) {
                if (c0451j.f2867B.size() > 0) {
                    for (int size = c0451j.f2867B.size() - 1; size >= 0; size--) {
                        AbstractC0244am abstractC0244am2 = (AbstractC0244am) c0451j.f2867B.get(size);
                        if (abstractC0244am2 == null) {
                            AbstractC0916l.m982b("deleteNumUnitsFromTransport unit==null");
                        } else if (this.f2029c == null || C0448g.m3572a(this.f2029c, abstractC0244am2.mo3487dc())) {
                            c0451j.f2867B.remove(size);
                            c0451j.m3555D(abstractC0244am2);
                            if (abstractC0244am2 != null) {
                                abstractC0244am2.m4088ch();
                            }
                        }
                    }
                }
            }
        }
        if (this.f2027a != null) {
            C1101m c1101m = new C1101m();
            this.f2027a.m3760a(c1101m, c0451j.f1609bV, (AbstractC0244am) c0451j, false);
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am3 = (AbstractC0244am) it.next();
                abstractC0244am3.f6958el = c0451j.f6958el;
                abstractC0244am3.f6959em = c0451j.f6959em;
                abstractC0244am3.f6960en = c0451j.f6960en;
                c0451j.m3556C(abstractC0244am3);
            }
        }
        if (this.f2030d) {
            c0451j.m3549L();
        }
        if (this.f2031e) {
            for (int size2 = c0451j.f2867B.size() - 1; size2 >= 0; size2--) {
                if (this.f2032f == -1 || this.f2032f == size2) {
                    c0451j.m3539a((AbstractC0244am) c0451j.f2867B.get(size2), true, c0451j.f2867B.size() % 2 == 0);
                }
            }
            return true;
        }
        return true;
    }
}
