package com.corrodinggames.rts.game.units.custom;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/o.class */
public class C0457o {

    /* renamed from: a */
    String f3326a;

    /* renamed from: b */
    C0441f f3327b;

    /* renamed from: c */
    final /* synthetic */ C0453l f3328c;

    public C0457o(C0453l c0453l) {
        this.f3328c = c0453l;
    }

    /* renamed from: a */
    public void m3371a() {
        if (this.f3326a != null && m3370b() == null) {
            throw new RuntimeException("Failed to find animation:" + this.f3326a);
        }
    }

    /* renamed from: b */
    public C0441f m3370b() {
        if (this.f3326a == null) {
            return null;
        }
        if (this.f3327b != null) {
            return this.f3327b;
        }
        Iterator it = this.f3328c.f3126dp.iterator();
        while (it.hasNext()) {
            C0441f c0441f = (C0441f) it.next();
            if (c0441f.f2805a.equalsIgnoreCase(this.f3326a)) {
                this.f3327b = c0441f;
                return c0441f;
            }
        }
        return null;
    }
}
