package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.d.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/w.class */
public class C0516w extends AbstractC0498i {

    /* renamed from: a */
    static C0934e f3571a = null;

    /* renamed from: b */
    static C0934e[] f3572b = new C0934e[10];

    /* renamed from: c */
    static C0934e f3573c = null;

    /* renamed from: b */
    public static void m3180b() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3571a = m1071A.f6161bO.mo221a(C0067R.drawable.wall_v);
        f3573c = m1071A.f6161bO.mo221a(C0067R.drawable.wall_v);
        f3572b = AbstractC0197n.m4304a(f3571a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3573c;
        }
        if (this.f1609bV == null) {
            return f3572b[f3572b.length - 1];
        }
        return f3572b[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2912a(int i) {
    }

    public C0516w(boolean z) {
        super(z);
        m2615b(f3571a);
        this.f1621ch = 15.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 700.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3571a;
        this.f3426n.m5035a(0, 0, 1, 0);
        this.f3427o.m5035a(0, 0, 1, 0);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.wall_v;
    }
}
