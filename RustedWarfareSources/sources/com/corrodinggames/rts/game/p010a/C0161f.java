package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.C0758f;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/f.class */
public class C0161f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m4648a(AbstractC0623y abstractC0623y) {
        C0305au m2834ar;
        boolean z = false;
        if (abstractC0623y.m2835aq()) {
            z = true;
        }
        if (!z && (m2834ar = abstractC0623y.m2834ar()) != null && m2834ar.m4023d() == EnumC0306av.reclaim) {
            z = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m4645b(AbstractC0623y abstractC0623y) {
        boolean z = false;
        if (abstractC0623y.m2835aq()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static Object m4646a(AbstractList abstractList) {
        int size = abstractList.size();
        if (size == 0) {
            return null;
        }
        return abstractList.get(C0758f.m2141a(0, size - 1));
    }

    /* renamed from: a */
    public static boolean m4647a(AbstractC0623y abstractC0623y, C0448g c0448g) {
        InterfaceC0303as r = abstractC0623y.mo1708r();
        if ((r instanceof C0453l) && C0448g.m3573a(c0448g, ((C0453l) r).f3234ft)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static AbstractC0224s m4649a(C0136a c0136a, AbstractC0623y abstractC0623y, EnumC0340e enumC0340e) {
        ArrayList N = abstractC0623y.mo3022N();
        ArrayList m4709al = c0136a.m4709al();
        Iterator it = N.iterator();
        while (it.hasNext()) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
            if (abstractC0224s.mo3929v(abstractC0623y) == enumC0340e) {
                m4709al.add(abstractC0224s);
            }
        }
        if (m4709al.size() > 0) {
            return (AbstractC0224s) m4646a(m4709al);
        }
        return null;
    }
}
