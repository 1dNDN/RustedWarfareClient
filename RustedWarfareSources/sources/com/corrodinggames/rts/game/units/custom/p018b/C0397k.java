package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/k.class */
public class C0397k extends AbstractC0387a {

    /* renamed from: a */
    LogicBoolean f2440a;

    /* renamed from: b */
    float f2441b;

    /* renamed from: c */
    float f2442c;

    /* renamed from: d */
    int f2443d;

    /* renamed from: a */
    public static void m3811a(C0453l c0453l, C1072ab c1072ab) {
        if (c1072ab.m626g("movement_random")) {
            C0397k c0397k = new C0397k();
            c0397k.m3810a(c0453l, c1072ab, "movement_random", "movement_random");
            if (!LogicBoolean.isStaticFalse(c0397k.f2440a)) {
                c0453l.m3447a(c0397k);
            }
        }
    }

    /* renamed from: a */
    public void m3810a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        this.f2440a = c1072ab.m685a(c0453l, str, "enabled");
        this.f2441b = c1072ab.m621i(str, "speed");
        this.f2442c = c1072ab.m661a(str, "maxSpeed", Float.valueOf(5.0f)).floatValue();
        this.f2443d = c1072ab.m645b(str, "awayFromEdge", (Integer) 75).intValue();
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo3798b(C0451j c0451j, float f) {
        if (!this.f2440a.read(c0451j)) {
            return;
        }
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (c0451j.mo2795bi()) {
            if (C0758f.m2075c(c0451j.f1614ca) < this.f2442c) {
                c0451j.f1614ca += C0758f.m2087b(c0451j, -this.f2441b, this.f2441b, 1);
            }
            if (C0758f.m2075c(c0451j.f1615cb) < this.f2442c) {
                c0451j.f1615cb += C0758f.m2087b(c0451j, -this.f2441b, this.f2441b, 2);
            }
        } else {
            if (C0758f.m2075c(c0451j.f1617cd) < this.f2442c) {
                c0451j.f1617cd += C0758f.m2087b(c0451j, -this.f2441b, this.f2441b, 1);
            }
            c0451j.f1618ce += C0758f.m2087b(c0451j, -1.0f, 1.0f, 2);
        }
        if (this.f2443d > 0) {
            if (c0451j.f6959em > m1071A.f6158bL.m4470j() - this.f2443d) {
                c0451j.f1615cb -= C0758f.m2087b(c0451j, 0.0f, this.f2441b * 0.25f, 10);
            }
            if (c0451j.f6959em < this.f2443d) {
                c0451j.f1615cb += C0758f.m2087b(c0451j, 0.0f, this.f2441b * 0.25f, 11);
            }
            if (c0451j.f6958el > m1071A.f6158bL.m4471i() - this.f2443d) {
                c0451j.f1614ca -= C0758f.m2087b(c0451j, 0.0f, this.f2441b * 0.25f, 12);
            }
            if (c0451j.f6958el < this.f2443d) {
                c0451j.f1614ca += C0758f.m2087b(c0451j, 0.0f, this.f2441b * 0.25f, 13);
            }
        }
        c0451j.f3947ax = true;
    }
}
