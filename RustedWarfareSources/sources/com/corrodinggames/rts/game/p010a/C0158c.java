package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/c.class */
public class C0158c {

    /* renamed from: a */
    HashMap f646a = new HashMap();

    /* renamed from: b */
    HashMap f647b = new HashMap();

    /* renamed from: c */
    HashMap f648c = new HashMap();

    /* renamed from: a */
    public Integer m4661a(boolean z, InterfaceC0303as interfaceC0303as, boolean z2) {
        if (z) {
            return (Integer) this.f648c.get(interfaceC0303as);
        }
        if (!z2) {
            return (Integer) this.f647b.get(interfaceC0303as);
        }
        return (Integer) this.f646a.get(interfaceC0303as);
    }

    /* renamed from: a */
    public void m4660a(boolean z, InterfaceC0303as interfaceC0303as, boolean z2, Integer num) {
        if (z) {
            this.f648c.put(interfaceC0303as, num);
        } else if (!z2) {
            this.f647b.put(interfaceC0303as, num);
        } else {
            this.f646a.put(interfaceC0303as, num);
        }
    }

    /* renamed from: a */
    public void m4664a() {
        this.f646a.clear();
        this.f647b.clear();
    }

    /* renamed from: a */
    public void m4663a(InterfaceC0303as interfaceC0303as) {
        this.f646a.put(interfaceC0303as, null);
        this.f647b.put(interfaceC0303as, null);
    }

    /* renamed from: a */
    public void m4662a(AbstractC0623y abstractC0623y) {
        this.f648c.put(abstractC0623y.f1689dx, null);
    }

    /* renamed from: b */
    public void m4659b() {
        this.f648c.clear();
    }
}
