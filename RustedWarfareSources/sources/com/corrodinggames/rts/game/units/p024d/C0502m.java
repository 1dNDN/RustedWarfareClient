package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/m.class */
public class C0502m extends AbstractC0498i {

    /* renamed from: g */
    boolean f3511g;

    /* renamed from: a */
    static C0934e f3505a = null;

    /* renamed from: b */
    static C0934e f3506b = null;

    /* renamed from: c */
    static C0934e f3507c = null;

    /* renamed from: d */
    static C0934e[] f3508d = new C0934e[10];

    /* renamed from: e */
    static C0934e[] f3509e = new C0934e[10];

    /* renamed from: f */
    static C0934e f3510f = null;

    /* renamed from: h */
    static final C0208c f3512h = C0208c.m4533a(String.valueOf(110));

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1314a(this.f3511g);
        streamWriter.mo1355c(0);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        if (reader.ReadBool()) {
            mo3174a(2);
        }
        reader.m1289d();
        super.mo2291a(reader);
    }

    /* renamed from: b */
    public static void m3301b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3505a = m1072A.f6113bO.mo221a(C0067R.drawable.land_factory_front);
        f3506b = m1072A.f6113bO.mo221a(C0067R.drawable.land_factory_front_t2);
        f3507c = m1072A.f6113bO.mo221a(C0067R.drawable.land_factory_back);
        f3510f = m1072A.f6113bO.mo221a(C0067R.drawable.land_factory_dead);
        f3508d = AbstractC0197n.m4627a(f3505a);
        f3509e = AbstractC0197n.m4627a(f3506b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1736b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3274K() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6116bR.m2339a(this.f6957el, this.f6958em, this.f6959en);
        this.f3425m = null;
        this.f3885L = f3510f;
        m447S(0);
        this.f1606bS = false;
        m1072A.f6111bM.m2722a(C0631e.f4050p, 0.8f, this.f6957el, this.f6958em);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: S */
    public void mo3303S() {
        super.mo3303S();
        if (this.f1607bT) {
            this.f3425m = null;
        } else {
            this.f3425m = f3507c;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3510f;
        }
        if (this.f1609bV == null) {
            return f3508d[f3508d.length - 1];
        }
        if (!this.f3511g) {
            return f3508d[this.f1609bV.m4650O()];
        }
        return f3509e[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    public C0502m(boolean z) {
        super(z);
        this.f3885L = f3505a;
        this.f3425m = f3507c;
        m2633b(this.f3885L);
        this.f1621ch = 30.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1200.0f;
        this.f1632cs = this.f1633ct;
        m447S(3);
        this.f3426n.m5364a(-1, -1, 1, 1);
        this.f3427o.m5364a(-1, -1, 1, 3);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        if (f3512h.m4536a(c0499j.f3494j)) {
            mo3174a(2);
            m2947W();
            return;
        }
        super.mo3272a(c0499j);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3174a(int i) {
        if (i == 1) {
            this.f3511g = false;
        } else if (i == 2 && !this.f3511g) {
            this.f3511g = true;
        }
        mo3303S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cl */
    public C0208c mo3267cl() {
        if (!this.f3511g) {
            return f3512h;
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public static void m3302a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        if (i == 1) {
            arrayList.add(new C0503n());
        }
        arrayList.add(new C0217l(EnumC0249ar.f1742h, 1));
        arrayList.add(new C0217l(EnumC0249ar.f1743i, 2));
        arrayList.add(new C0217l(EnumC0249ar.f1744j, 3));
        arrayList.add(new C0217l(EnumC0249ar.f1745k, 4));
        if (i >= 2) {
            arrayList.add(new C0217l(EnumC0249ar.f1753s, 5));
            arrayList.add(new C0217l(EnumC0249ar.f1757w, 6));
            arrayList.add(new C0217l(EnumC0249ar.f1758x, 7));
            arrayList.add(new C0217l(EnumC0249ar.f1752r, 8));
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3068N() {
        return mo5649r().mo4262a(mo3273V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3273V() {
        if (this.f3511g) {
            return 2;
        }
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i
    /* renamed from: dr */
    public C0500k mo3299dr() {
        return new C0504o(this);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bJ */
    public boolean mo3269bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cZ */
    public float mo3290cZ() {
        return super.mo3290cZ() - 8.0f;
    }
}
