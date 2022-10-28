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
import com.corrodinggames.rts.gameFramework.Core;
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
    static AbstractC0224s f3478k = new C04961(102);

    /* renamed from: l */
    static AbstractC0224s f3479l = new C04972(103);

    /* renamed from: t */
    static ArrayList f3480t = new ArrayList();

    static {
        f3480t.add(f3478k);
        f3480t.add(f3479l);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f3475h);
        streamWriter.mo1329a(this.f3430r == 2);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3488a(Reader reader) {
        this.f3475h = reader.m1300g();
        boolean ReadBool = reader.ReadBool();
        if (reader.m1310b() < 51 && ReadBool) {
            mo3356a(2);
        }
        super.m3478a(reader);
    }

    /* renamed from: R */
    public void m3490R(int i) {
        mo3356a(i);
    }

    /* renamed from: b */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1770J;
    }

    /* renamed from: c */
    public static void m3485c() {
        Core m1087A = Core.m1087A();
        f3468a = m1087A.f6113bO.mo221a(C0067R.drawable.power);
        f3469b = m1087A.f6113bO.mo221a(C0067R.drawable.power_t2);
        f3470c = m1087A.f6113bO.mo221a(C0067R.drawable.power_t3);
        f3471d = AbstractC0197n.m5082a(f3468a);
        f3472e = AbstractC0197n.m5082a(f3469b);
        f3473f = AbstractC0197n.m5082a(f3470c);
        f3474g = m1087A.f6113bO.mo221a(C0067R.drawable.power_dead);
    }

    /* renamed from: K */
    public boolean m3491K() {
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2391a(this.f6958el, this.f6959em, this.f6960en);
        this.f3885L = f3474g;
        m447S(0);
        this.f1606bS = false;
        m1087A.f6111bM.m2776a(C0631e.f4050p, 0.8f, this.f6958el, this.f6959em);
        m1087A.f6116bR.m2364b(EnumC0748h.f4836e);
        C0745e m2361c = m1087A.f6116bR.m2361c(this.f6958el, this.f6959em, this.f6960en, -1127220);
        if (m2361c != null) {
            m2361c.f4751H = 0.15f;
            m2361c.f4750G = 1.0f;
            m2361c.f4788as = (short) 2;
            m2361c.f4766W = 35.0f;
            m2361c.f4767X = m2361c.f4766W;
            m2361c.f4765V = 0.0f;
            m2361c.f4742y = -14492382;
        }
        m2864bo();
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3474g;
        }
        if (this.f1609bV == null) {
            return f3471d[f3471d.length - 1];
        }
        if (this.f3430r == 1) {
            return f3471d[this.f1609bV.m5105O()];
        }
        if (this.f3430r == 2) {
            return f3472e[this.f1609bV.m5105O()];
        }
        if (this.f3430r == 3) {
            return f3473f[this.f1609bV.m5105O()];
        }
        Core.LogDebug2("Unknown tech level:" + this.f3430r);
        return f3471d[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    public C0495h(boolean z) {
        super(z);
        this.f3476i = 0.0f;
        this.f3477j = 0;
        this.f3885L = f3468a;
        m2688a(this.f3885L, 3);
        this.f1621ch = 25.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 800.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5874a(-1, -1, 1, 1);
        this.f3427o.m5873a(this.f3426n);
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (!m4751bS() || this.f1607bT) {
            return;
        }
        this.f3476i = C0758f.m2211a(this.f3476i, f);
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
            this.f1609bV.m5073b(m3482cw() * (AbstractC0197n.f1378ao / AbstractC0197n.f1377an));
        }
    }

    /* renamed from: cw */
    public float m3482cw() {
        if (this.f3430r == 1) {
            return 2.0f;
        }
        if (this.f3430r == 2) {
            return 7.0f;
        }
        return 14.0f;
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        if (c0499j.f3496j.equals(f3478k.m4910N())) {
            mo3356a(2);
            m3004W();
        }
        if (c0499j.f3496j.equals(f3479l.m4910N())) {
            mo3356a(3);
            m3004W();
        }
    }

    /* renamed from: cl */
    public C0208c m3483cl() {
        if (this.f3430r == 1) {
            return f3478k.m4910N();
        }
        if (this.f3430r == 2) {
            return f3479l.m4910N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: V */
    public int m3489V() {
        return this.f3430r;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
        AbstractC0197n.m5069b((AbstractC0244am) this);
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
        AbstractC0197n.m5053c(this);
        m3008S();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.h$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h$1.class */
    final class C04961 extends AbstractC0228w {
        C04961(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return C0820a.m1731a("units.fabricator.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("units.fabricator.upgrade.name", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return EnumC0249ar.f1770J.m4615c(2);
        }

        /* renamed from: K */
        public float mo3369K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0495h c0495h = (C0495h) abstractC0244am;
            if (c0495h.f3430r != 1 || c0495h.mo3438a(m4910N(), z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            if (((C0495h) abstractC0244am).f3430r != 1) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1467c;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.h$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/h$2.class */
    final class C04972 extends AbstractC0228w {
        C04972(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return C0820a.m1731a("units.fabricator.upgrade.descriptionT3", new Object[0]);
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("units.fabricator.upgrade.nameT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return EnumC0249ar.f1770J.m4615c(3);
        }

        /* renamed from: K */
        public float mo3369K() {
            return 2.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0495h c0495h = (C0495h) abstractC0244am;
            if (c0495h.f3430r != 2 || c0495h.mo3438a(m4910N(), z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            if (((C0495h) abstractC0244am).f3430r != 2) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1467c;
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f3480t;
    }

    /* renamed from: cZ */
    public float m3484cZ() {
        return super.m4708cZ() - 8.0f;
    }

    /* renamed from: bp */
    public int m3486bp() {
        return 12;
    }
}
