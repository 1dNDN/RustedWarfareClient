package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h.class */
public class C0495h extends AbstractC0498i {

    /* renamed from: h */
    float f3475h;

    /* renamed from: i */
    float f3476i;

    /* renamed from: j */
    int f3477j;

    /* renamed from: a */
    static C0934e f3468a = null;

    /* renamed from: b */
    static C0934e f3469b = null;

    /* renamed from: c */
    static C0934e f3470c = null;

    /* renamed from: d */
    static C0934e[] f3471d = new C0934e[10];

    /* renamed from: e */
    static C0934e[] f3472e = new C0934e[10];

    /* renamed from: f */
    static C0934e[] f3473f = new C0934e[10];

    /* renamed from: g */
    static C0934e f3474g = null;

    /* renamed from: k */
    static AbstractC0224s f3478k = new AbstractC0228w(102) { // from class: com.corrodinggames.rts.game.units.d.h.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3029a() {
            return C0820a.m1687a("units.fabricator.upgrade.description", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("units.fabricator.upgrade.name", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3023c() {
            return EnumC0249ar.f1770J.mo4272c(2);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3265K() {
            return 3.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0495h c0495h = (C0495h) abstractC0244am;
            if (c0495h.f3430r != 1 || c0495h.mo3313a(m4507N(), z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            if (((C0495h) abstractC0244am).f3430r != 1) {
                return false;
            }
            return true;
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

    /* renamed from: l */
    static AbstractC0224s f3479l = new AbstractC0228w(103) { // from class: com.corrodinggames.rts.game.units.d.h.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3029a() {
            return C0820a.m1687a("units.fabricator.upgrade.descriptionT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("units.fabricator.upgrade.nameT3", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3023c() {
            return EnumC0249ar.f1770J.mo4272c(3);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
        /* renamed from: K */
        public float mo3265K() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0495h c0495h = (C0495h) abstractC0244am;
            if (c0495h.f3430r != 2 || c0495h.mo3313a(m4507N(), z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            if (((C0495h) abstractC0244am).f3430r != 2) {
                return false;
            }
            return true;
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

    /* renamed from: t */
    static ArrayList f3480t = new ArrayList();

    static {
        f3480t.add(f3478k);
        f3480t.add(f3479l);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f3475h);
        streamWriter.mo1314a(this.f3430r == 2);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3475h = reader.m1285g();
        boolean ReadBool = reader.ReadBool();
        if (reader.m1295b() < 51 && ReadBool) {
            mo3174a(2);
        }
        super.mo2291a(reader);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: R */
    public void mo3358R(int i) {
        mo3174a(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1770J;
    }

    /* renamed from: c */
    public static void m3355c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3468a = m1072A.f6113bO.mo221a(C0067R.drawable.power);
        f3469b = m1072A.f6113bO.mo221a(C0067R.drawable.power_t2);
        f3470c = m1072A.f6113bO.mo221a(C0067R.drawable.power_t3);
        f3471d = AbstractC0197n.m4627a(f3468a);
        f3472e = AbstractC0197n.m4627a(f3469b);
        f3473f = AbstractC0197n.m4627a(f3470c);
        f3474g = m1072A.f6113bO.mo221a(C0067R.drawable.power_dead);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3274K() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6116bR.m2339a(this.f6957el, this.f6958em, this.f6959en);
        this.f3885L = f3474g;
        m447S(0);
        this.f1606bS = false;
        m1072A.f6111bM.m2722a(C0631e.f4050p, 0.8f, this.f6957el, this.f6958em);
        m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
        C0745e m2309c = m1072A.f6116bR.m2309c(this.f6957el, this.f6958em, this.f6959en, -1127220);
        if (m2309c != null) {
            m2309c.f4735H = 0.15f;
            m2309c.f4734G = 1.0f;
            m2309c.f4792as = (short) 2;
            m2309c.f4750W = 35.0f;
            m2309c.f4751X = m2309c.f4750W;
            m2309c.f4749V = 0.0f;
            m2309c.f4730y = -14492382;
        }
        m2808bo();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3474g;
        }
        if (this.f1609bV == null) {
            return f3471d[f3471d.length - 1];
        }
        if (this.f3430r == 1) {
            return f3471d[this.f1609bV.m4650O()];
        }
        if (this.f3430r == 2) {
            return f3472e[this.f1609bV.m4650O()];
        }
        if (this.f3430r == 3) {
            return f3473f[this.f1609bV.m4650O()];
        }
        LoggerMaybe.LogDebug2("Unknown tech level:" + this.f3430r);
        return f3471d[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    public C0495h(boolean z) {
        super(z);
        this.f3476i = 0.0f;
        this.f3477j = 0;
        this.f3885L = f3468a;
        m2634a(this.f3885L, 3);
        this.f1621ch = 25.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 800.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5364a(-1, -1, 1, 1);
        this.f3427o.m5363a(this.f3426n);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
            return;
        }
        this.f3476i = C0758f.m2159a(this.f3476i, f);
        if (this.f3476i == 0.0f) {
            this.f3476i = 17.0f;
            this.f3477j++;
            if (this.f3477j > 5) {
                this.f3477j = 0;
            }
            if (this.f3477j <= 2) {
                this.f3431s = this.f3477j;
            } else {
                this.f3431s = 5 - this.f3477j;
            }
        }
        this.f3475h += f;
        if (this.f3475h > AbstractC0197n.f1378ao - 0.1f) {
            this.f3475h -= AbstractC0197n.f1378ao;
            this.f1609bV.m4618b(mo3354cw() * (AbstractC0197n.f1378ao / AbstractC0197n.f1377an));
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cw */
    public float mo3354cw() {
        if (this.f3430r == 1) {
            return 2.0f;
        }
        if (this.f3430r == 2) {
            return 7.0f;
        }
        return 14.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.InterfaceC0501l
    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        if (c0499j.f3494j.equals(f3478k.m4507N())) {
            mo3174a(2);
            m2947W();
        }
        if (c0499j.f3494j.equals(f3479l.m4507N())) {
            mo3174a(3);
            m2947W();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cl */
    public C0208c mo3267cl() {
        if (this.f3430r == 1) {
            return f3478k.m4507N();
        }
        if (this.f3430r == 2) {
            return f3479l.m4507N();
        }
        return AbstractC0224s.f1462i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3273V() {
        return this.f3430r;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3174a(int i) {
        AbstractC0197n.m4614b((AbstractC0244am) this);
        if (this.f3430r > i) {
            this.f3430r = 1;
            this.f1633ct = 800.0f;
            if (this.f1632cs > this.f1633ct) {
                this.f1632cs = this.f1633ct;
            }
        }
        if (this.f3430r < 2 && i >= 2) {
            this.f1633ct += 500.0f;
            this.f1632cs += 500.0f;
        }
        if (this.f3430r < 3 && i >= 3) {
            this.f1633ct += 1300.0f;
            this.f1632cs += 1300.0f;
        }
        this.f3430r = i;
        AbstractC0197n.m4598c(this);
        mo3303S();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3068N() {
        return f3480t;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cZ */
    public float mo3290cZ() {
        return super.mo3290cZ() - 8.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bp */
    public int mo3356bp() {
        return 12;
    }
}
