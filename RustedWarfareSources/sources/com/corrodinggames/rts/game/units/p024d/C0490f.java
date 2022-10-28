package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f.class */
public class C0490f extends AbstractC0498i {

    /* renamed from: f */
    boolean f3444f;

    /* renamed from: a */
    static C0934e f3445a = null;

    /* renamed from: b */
    static C0934e f3446b = null;

    /* renamed from: c */
    static C0934e[] f3447c = new C0934e[10];

    /* renamed from: d */
    static C0934e[] f3448d = new C0934e[10];

    /* renamed from: e */
    static C0934e f3449e = null;

    /* renamed from: g */
    static AbstractC0224s f3450g = new AbstractC0228w(110) { // from class: com.corrodinggames.rts.game.units.d.f.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3029a() {
            return "-Allows factory to build Tech 2 units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.upgradeT2", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3023c() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3265K() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0490f c0490f = (C0490f) abstractC0244am;
            if (c0490f.f3444f || c0490f.mo3313a(m4507N(), z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1467c;
        }
    };

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1314a(this.f3444f);
        streamWriter.mo1355c(0);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        if (reader.ReadBool()) {
            m3369L();
        }
        reader.m1289d();
        super.mo2291a(reader);
    }

    /* renamed from: b */
    public static void m3367b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3445a = m1072A.f6113bO.mo221a(C0067R.drawable.experimental_unit_factory_front);
        f3446b = m1072A.f6113bO.mo221a(C0067R.drawable.experimental_unit_factory_base);
        f3449e = m1072A.f6113bO.mo221a(C0067R.drawable.experimental_unit_factory_dead);
        f3447c = AbstractC0197n.m4627a(f3445a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1767G;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3274K() {
        LoggerMaybe.m1072A();
        this.f3425m = null;
        this.f3885L = f3449e;
        m447S(0);
        this.f1606bS = false;
        m2924a(EnumC0233ab.f1509h);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3174a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3449e;
        }
        if (this.f1609bV == null) {
            return f3447c[f3447c.length - 1];
        }
        if (!this.f3444f) {
            return f3447c[this.f1609bV.m4650O()];
        }
        return f3448d[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: S */
    public void mo3303S() {
        super.mo3303S();
        if (this.f1607bT) {
            this.f3425m = null;
        } else {
            this.f3425m = f3446b;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    public C0490f(boolean z) {
        super(z);
        this.f3885L = f3445a;
        this.f3425m = f3446b;
        m2633b(this.f3885L);
        this.f1621ch = 55.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 3200.0f;
        this.f1632cs = this.f1633ct;
        m447S(4);
        this.f3426n.m5364a(-2, -2, 2, 2);
        this.f3427o.m5364a(-2, -2, 2, 4);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        if (c0499j.f3494j.equals(f3450g.m4507N())) {
            m3369L();
        } else {
            super.mo3272a(c0499j);
        }
    }

    /* renamed from: L */
    public void m3369L() {
        if (!this.f3444f) {
            this.f3444f = true;
            mo3303S();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cl */
    public C0208c mo3267cl() {
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public static void m3368a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(EnumC0249ar.f1766F, 2));
        arrayList.add(new C0217l(EnumC0249ar.f1775O, 3));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3068N() {
        return mo3366c().mo4262a(mo3273V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bJ */
    public boolean mo3269bJ() {
        return true;
    }
}
