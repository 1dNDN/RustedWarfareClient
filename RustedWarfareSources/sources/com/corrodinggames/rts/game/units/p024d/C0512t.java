package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/t.class */
public class C0512t extends AbstractC0498i {

    /* renamed from: a */
    static C0934e f3553a = null;

    /* renamed from: b */
    static C0934e f3554b = null;

    /* renamed from: c */
    static C0934e f3555c = null;

    /* renamed from: d */
    static C0934e[] f3556d = new C0934e[10];

    /* renamed from: e */
    static C0934e[] f3557e = new C0934e[10];

    /* renamed from: f */
    static C0934e f3558f = null;

    /* renamed from: g */
    static final C0208c f3559g = C0208c.m4988a(String.valueOf(110));

    /* renamed from: b */
    public static void m3374b() {
        Core m1087A = Core.m1087A();
        f3553a = m1087A.f6113bO.mo221a(C0067R.drawable.sea_factory);
        f3554b = m1087A.f6113bO.mo221a(C0067R.drawable.sea_factory_t2);
        f3558f = m1087A.f6113bO.mo221a(C0067R.drawable.sea_factory_dead);
        f3556d = AbstractC0197n.m5082a(f3553a);
        f3557e = AbstractC0197n.m5082a(f3554b);
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1738d;
    }

    /* renamed from: K */
    public boolean m3378K() {
        this.f3425m = null;
        this.f3885L = f3558f;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1505d);
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3558f;
        }
        if (this.f1609bV == null) {
            return f3556d[f3556d.length - 1];
        }
        if (this.f3430r == 1) {
            return f3556d[this.f1609bV.m5105O()];
        }
        return f3557e[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    public C0512t(boolean z) {
        super(z);
        this.f3885L = f3553a;
        m2687b(f3553a);
        this.f1621ch = 45.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1000.0f;
        this.f1632cs = this.f1633ct;
        m447S(2);
        this.f3426n.m5874a(-1, -1, 1, 2);
        this.f3427o.m5874a(-2, -1, 2, 4);
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        if (c0499j.f3496j.equals(f3559g)) {
            mo3356a(2);
            m3004W();
            return;
        }
        super.mo3437a(c0499j);
    }

    /* renamed from: ds */
    public int m3370ds() {
        return -20;
    }

    /* renamed from: V */
    public int m3377V() {
        return this.f3430r;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
        if (i == 1) {
            this.f3430r = 1;
        } else if (i == 2 && this.f3430r == 1) {
            this.f3430r = 2;
        }
        m3008S();
    }

    /* renamed from: cl */
    public C0208c m3371cl() {
        if (this.f3430r == 1) {
            return f3559g;
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public static void m3375a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0513u());
        arrayList.add(new C0217l(EnumC0249ar.f1772L, 1));
        arrayList.add(new C0217l(EnumC0249ar.f1750p, 2));
        arrayList.add(new C0217l(EnumC0249ar.f1749o, 3));
        arrayList.add(new C0217l(EnumC0249ar.f1753s, 4));
        arrayList.add(new C0217l(EnumC0249ar.f1755u, 5));
        arrayList.add(new C0217l(EnumC0249ar.f1771K, 6));
        if (i > 1) {
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return mo1758r().mo4484a(m3377V());
    }

    /* renamed from: bJ */
    public boolean m3373bJ() {
        return true;
    }
}
