package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/k.class */
public class C0332k extends AbstractC0321a {

    /* renamed from: a */
    public C0413bn f1995a;

    /* renamed from: b */
    public C0413bn f1996b;

    /* renamed from: a */
    public static void m3975a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0413bn m3763a = C0413bn.m3763a(c0453l, c1072ab, str, str2 + "produceUnits");
        if (!m3763a.m3758b()) {
            C0332k c0332k = new C0332k();
            c0332k.f1995a = m3763a;
            c0339d.f2101ab.add(c0332k);
        }
        C0413bn m3763a2 = C0413bn.m3763a(c0453l, c1072ab, str, str2 + "spawnUnits");
        if (!m3763a2.m3758b()) {
            C0332k c0332k2 = new C0332k();
            c0332k2.f1996b = m3763a2;
            c0339d.f2101ab.add(c0332k2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f1995a != null) {
            C1101m c1101m = new C1101m();
            this.f1995a.m3760a(c1101m, c0451j.f1609bV, (AbstractC0244am) c0451j, false);
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
                c0451j.m3554E(abstractC0244am2);
                c0451j.m3553F(abstractC0244am2);
            }
        }
        if (this.f1996b != null) {
            this.f1996b.m3765a(c0451j.f6958el, c0451j.f6959em, c0451j.f6960en, c0451j.f1618ce, c0451j.f1609bV, false, c0451j);
            return true;
        }
        return true;
    }
}
