package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.bi */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bi.class */
public class C0724bi {

    /* renamed from: a */
    C1101m f4556a = new C1101m();

    /* renamed from: a */
    public void m2373a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        if (this.f4556a.f6894a > 0) {
            Iterator it = this.f4556a.iterator();
            while (it.hasNext()) {
                ((AbstractC0723bh) it.next()).m2374a(abstractC0244am, abstractC0244am2, null);
            }
        }
    }
}
