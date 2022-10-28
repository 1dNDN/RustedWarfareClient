package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
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
    static final C0208c f3559g = C0208c.m4210a(String.valueOf(110));

    /* renamed from: b */
    public static void m3193b() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3553a = m1071A.f6161bO.mo221a(C0067R.drawable.sea_factory);
        f3554b = m1071A.f6161bO.mo221a(C0067R.drawable.sea_factory_t2);
        f3558f = m1071A.f6161bO.mo221a(C0067R.drawable.sea_factory_dead);
        f3556d = AbstractC0197n.m4304a(f3553a);
        f3557e = AbstractC0197n.m4304a(f3554b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.seaFactory;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3188K() {
        this.f3425m = null;
        this.f3886L = f3558f;
        m447S(0);
        this.f1606bS = false;
        m2905a(EnumC0233ab.large);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3558f;
        }
        if (this.f1609bV == null) {
            return f3556d[f3556d.length - 1];
        }
        if (this.f3430r == 1) {
            return f3556d[this.f1609bV.m4327O()];
        }
        return f3557e[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return null;
    }

    public C0512t(boolean z) {
        super(z);
        this.f3886L = f3553a;
        m2615b(f3553a);
        this.f1621ch = 45.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1000.0f;
        this.f1632cs = this.f1633ct;
        m447S(2);
        this.f3426n.m5035a(-1, -1, 1, 2);
        this.f3427o.m5035a(-2, -1, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3186a(C0499j c0499j) {
        if (c0499j.f3494j.equals(f3559g)) {
            mo2912a(2);
            m2928W();
            return;
        }
        super.mo3186a(c0499j);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i
    /* renamed from: ds */
    public int mo3190ds() {
        return -20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo2929V() {
        return this.f3430r;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2912a(int i) {
        if (i == 1) {
            this.f3430r = 1;
        } else if (i == 2 && this.f3430r == 1) {
            this.f3430r = 2;
        }
        mo2932S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cl */
    public C0208c mo3183cl() {
        if (this.f3430r == 1) {
            return f3559g;
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public static void m3194a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0513u());
        arrayList.add(new C0217l(EnumC0249ar.builderShip, 1));
        arrayList.add(new C0217l(EnumC0249ar.gunBoat, 2));
        arrayList.add(new C0217l(EnumC0249ar.missileShip, 3));
        arrayList.add(new C0217l(EnumC0249ar.hovercraft, 4));
        arrayList.add(new C0217l(EnumC0249ar.battleShip, 5));
        arrayList.add(new C0217l(EnumC0249ar.attackSubmarine, 6));
        if (i > 1) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3022N() {
        return mo1708r().mo3452a(mo2929V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bJ */
    public boolean mo3192bJ() {
        return true;
    }
}
