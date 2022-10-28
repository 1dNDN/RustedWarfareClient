package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.AbstractC0429a;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/c.class */
public class C0436c {

    /* renamed from: a */
    public final C1101m f2771a = new C1101m();

    /* renamed from: a */
    public void m3645a(C0428a c0428a) {
        if (!this.f2771a.contains(c0428a)) {
            this.f2771a.add(c0428a);
        }
    }

    /* renamed from: a */
    public void m3643a(C0439f c0439f, AbstractC0244am abstractC0244am, double d) {
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a.mo3651a(abstractC0244am) < c0438e.f2800b * d) {
                m3645a(c0438e.f2799a);
            }
        }
    }

    /* renamed from: a */
    public void m3646a(C0424b c0424b, AbstractC0244am abstractC0244am, double d) {
        if (!c0424b.f2710k.m3611c()) {
            m3643a(c0424b.f2710k, abstractC0244am, d);
        }
        if (c0424b.f2701b > 0 && abstractC0244am.f1609bV.f1321o < c0424b.f2701b * d) {
            m3645a(AbstractC0429a.f2762B);
        }
    }

    /* renamed from: a */
    public boolean m3644a(C0439f c0439f) {
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2771a.contains(((C0438e) m534a[i2]).f2799a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3647a(C0424b c0424b) {
        if (c0424b.f2701b > 0 && this.f2771a.contains(AbstractC0429a.f2762B)) {
            return true;
        }
        if (!c0424b.f2710k.m3611c() && m3644a(c0424b.f2710k)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m3648a() {
        this.f2771a.clear();
    }
}
