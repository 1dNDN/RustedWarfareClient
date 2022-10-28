package com.corrodinggames.rts.game.p010a.p011a;

import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a/c.class */
public abstract class AbstractC0155c extends AbstractC0150a {

    /* renamed from: a */
    C1112u f640a = new C1112u();

    /* renamed from: c */
    public abstract boolean mo4668c(C0136a c0136a, AbstractC0623y abstractC0623y);

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public void mo4673a(C0876k c0876k) {
        super.mo4673a(c0876k);
        int m1280f = c0876k.m1280f();
        for (int i = 0; i < m1280f; i++) {
            AbstractC0623y m1270p = c0876k.m1270p();
            if (m1270p != null) {
                this.f640a.add(m1270p);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public void mo4674a(C0859ar c0859ar) {
        super.mo4674a(c0859ar);
        c0859ar.mo1313a(this.f640a.size());
        Iterator it = this.f640a.iterator();
        while (it.hasNext()) {
            c0859ar.mo1363a((AbstractC0623y) it.next());
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public void mo4675a(C0136a c0136a, AbstractC0623y abstractC0623y) {
        if (mo4668c(c0136a, abstractC0623y) && !this.f640a.contains(abstractC0623y)) {
            this.f640a.add(abstractC0623y);
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: b */
    public void mo4672b(C0136a c0136a, AbstractC0623y abstractC0623y) {
    }
}
