package com.corrodinggames.rts.game.units.custom;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/t.class */
public class C0462t {

    /* renamed from: a */
    C1101m f3344a = new C1101m();

    /* renamed from: b */
    C1101m f3345b;

    /* renamed from: c */
    String f3346c;

    /* renamed from: d */
    String f3347d;

    /* renamed from: a */
    public void m3365a(C0453l c0453l) {
    }

    /* renamed from: b */
    public void m3364b(C0453l c0453l) {
        C1101m c1101m = new C1101m();
        Iterator it = this.f3344a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC0224s m3404h = c0453l.m3404h(str);
            if (m3404h == null) {
                throw new C0412bm("[" + this.f3347d + "]" + this.f3346c + " Could not find action:" + str + " on unit: " + c0453l.m3425b());
            }
            if (m3404h instanceof AbstractC0228w) {
                c1101m.add((AbstractC0228w) m3404h);
            } else {
                throw new C0412bm("[" + this.f3347d + "]" + this.f3346c + " Action:" + str + " on unit: " + c0453l.m3425b() + " doesn't have the right type");
            }
        }
        this.f3345b = c1101m;
    }

    /* renamed from: a */
    public void m3366a(C0451j c0451j, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f3345b == null) {
            C0831ad.m1443g("Action on " + c0451j.mo1708r().mo3403i() + " has not been linked");
            return;
        }
        Iterator it = this.f3345b.iterator();
        while (it.hasNext()) {
            c0451j.m3542a((AbstractC0224s) it.next(), pointF, abstractC0244am, i);
        }
    }

    /* renamed from: a */
    public C1101m m3368a() {
        if (this.f3345b == null) {
            C0831ad.m1443g("Action on [" + this.f3347d + "]" + this.f3346c + " has not been linked");
            return new C1101m();
        }
        return this.f3345b;
    }

    /* renamed from: a */
    public void m3367a(C0451j c0451j, PointF pointF, AbstractC0244am abstractC0244am) {
        if (this.f3345b == null) {
            C0831ad.m1443g("Action on " + c0451j.mo1708r().mo3403i() + " has not been linked");
            return;
        }
        Iterator it = this.f3345b.iterator();
        while (it.hasNext()) {
            c0451j.f2878dK.m3249a((AbstractC0228w) ((AbstractC0224s) it.next()), false, pointF, abstractC0244am);
        }
    }
}
