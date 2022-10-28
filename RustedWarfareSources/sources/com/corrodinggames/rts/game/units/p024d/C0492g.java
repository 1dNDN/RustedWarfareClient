package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0180g;
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
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g.class */
public class C0492g extends AbstractC0498i {

    /* renamed from: a */
    float f3451a;

    /* renamed from: b */
    int f3452b;

    /* renamed from: c */
    float f3453c;

    /* renamed from: d */
    int f3454d;

    /* renamed from: j */
    Rect f3460j;

    /* renamed from: k */
    Rect f3461k;

    /* renamed from: w */
    static ArrayList f3466w;

    /* renamed from: x */
    static ArrayList f3467x;

    /* renamed from: e */
    static C0934e[] f3455e = new C0934e[10];

    /* renamed from: f */
    static C0934e[] f3456f = new C0934e[10];

    /* renamed from: g */
    static C0934e[] f3457g = new C0934e[10];

    /* renamed from: h */
    static C0934e f3458h = null;

    /* renamed from: i */
    static C0934e f3459i = null;

    /* renamed from: l */
    public static int f3462l = 0;

    /* renamed from: t */
    static AbstractC0224s f3463t = new C04931(102);

    /* renamed from: u */
    static AbstractC0224s f3464u = new C04942(103);

    /* renamed from: v */
    static ArrayList f3465v = new ArrayList();

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f3451a);
        streamWriter.mo1329a(this.f3452b > 1);
        streamWriter.WriteInteger(this.f3452b);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3500a(Reader reader) {
        this.f3451a = reader.m1300g();
        int i = 1;
        if (reader.ReadBool()) {
            i = 2;
        }
        if (reader.m1310b() >= 31) {
            i = reader.ReadInt();
        }
        if (i != 1) {
            mo3356a(i);
        }
        super.m3478a(reader);
    }

    /* renamed from: b */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1735a;
    }

    static {
        f3465v.add(f3463t);
        f3466w = new ArrayList();
        f3466w.add(f3464u);
        f3467x = new ArrayList();
    }

    /* renamed from: c */
    public boolean m3496c(AbstractC0197n abstractC0197n) {
        Core m1087A = Core.m1087A();
        m1087A.f6110bL.m5344a(this.f6958el, this.f6959em);
        C0180g m5290e = m1087A.f6110bL.m5290e(m1087A.f6110bL.f801T, m1087A.f6110bL.f802U);
        if (m5290e == null || !m5290e.f922i) {
            return false;
        }
        return super.m2848c(abstractC0197n);
    }

    /* renamed from: c */
    public static void m3497c() {
        Core m1087A = Core.m1087A();
        C0934e mo221a = m1087A.f6113bO.mo221a(C0067R.drawable.extractor);
        C0934e mo221a2 = m1087A.f6113bO.mo221a(C0067R.drawable.extractor_t2);
        C0934e mo221a3 = m1087A.f6113bO.mo221a(C0067R.drawable.extractor_t3);
        f3459i = m1087A.f6113bO.mo221a(C0067R.drawable.extractor_dead);
        f3455e = AbstractC0197n.m5082a(mo221a);
        f3456f = AbstractC0197n.m5082a(mo221a2);
        f3457g = AbstractC0197n.m5082a(mo221a3);
        mo221a.mo50n();
        mo221a2.mo50n();
        mo221a3.mo50n();
        f3458h = m1087A.f6113bO.mo221a(C0067R.drawable.extractor_back);
    }

    /* renamed from: K */
    public boolean m3504K() {
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2391a(this.f6958el, this.f6959em, this.f6960en);
        this.f3885L = f3459i;
        this.f3425m = null;
        m447S(0);
        this.f1606bS = false;
        m1087A.f6111bM.m2776a(C0631e.f4050p, 0.8f, this.f6958el, this.f6959em);
        C0746f.m2348a(this.f6958el, this.f6959em).f4804j = -6684775;
        C0746f m2340b = C0746f.m2340b(this.f6958el, this.f6959em);
        m2340b.f4795a = 500.0f;
        m2340b.f4804j = -6684775;
        m1087A.f6116bR.m2364b(EnumC0748h.f4836e);
        C0745e m2361c = m1087A.f6116bR.m2361c(this.f6958el, this.f6959em, this.f6960en, -1127220);
        if (m2361c != null) {
            m2361c.f4751H = 0.15f;
            m2361c.f4750G = 1.0f;
            m2361c.f4788as = (short) 2;
            m2361c.f4766W = 35.0f;
            m2361c.f4767X = m2361c.f4766W;
            m2361c.f4765V = 0.0f;
            m2361c.f4742y = -13378253;
        }
        m2864bo();
        return false;
    }

    /* renamed from: bp */
    public int m3498bp() {
        return 16;
    }

    /* renamed from: S */
    public void m3502S() {
        super.m3008S();
        if (this.f1607bT) {
            this.f3425m = null;
        } else {
            this.f3425m = f3458h;
        }
    }

    /* renamed from: M */
    public boolean m3503M() {
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3459i;
        }
        if (this.f1609bV == null) {
            return f3455e[f3455e.length - 1];
        }
        if (this.f3452b == 3) {
            return f3457g[this.f1609bV.m5105O()];
        }
        if (this.f3452b == 2) {
            return f3456f[this.f1609bV.m5105O()];
        }
        return f3455e[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    public C0492g(boolean z) {
        super(z);
        this.f3452b = 1;
        this.f3453c = 0.0f;
        this.f3454d = 0;
        this.f3460j = new Rect();
        this.f3461k = new Rect();
        this.f3885L = f3455e[9];
        m2693T(37);
        m2692U(56);
        this.f1621ch = 18.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 800.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5874a(0, -1, 0, 0);
        this.f3427o.m5873a(this.f3426n);
        m3502S();
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (!m4751bS() || this.f1607bT) {
            return;
        }
        this.f3453c = C0758f.m2211a(this.f3453c, f * this.f3452b);
        if (this.f3453c == 0.0f) {
            this.f3453c = 17.0f;
            this.f3454d++;
            if (this.f3454d > 7) {
                this.f3454d = 0;
            }
            if (this.f3454d <= 3) {
                this.f3431s = this.f3454d;
            } else {
                this.f3431s = 7 - this.f3454d;
            }
        }
        this.f3451a += f;
        if (this.f3451a > AbstractC0197n.f1378ao - 0.1f) {
            this.f3451a -= AbstractC0197n.f1378ao;
            this.f1609bV.m5073b(m3494cw() * (AbstractC0197n.f1378ao / AbstractC0197n.f1377an));
        }
    }

    /* renamed from: cw */
    public float m3494cw() {
        if (this.f3452b == 3) {
            return 18.0f;
        }
        if (this.f3452b == 2) {
            return 12.0f;
        }
        return 8.0f;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        return super.mo3049c(f);
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    /* renamed from: m */
    public float mo3035m() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 0.0f;
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        if (c0499j.f3496j.equals(f3463t.m4910N())) {
            mo3356a(2);
            m3004W();
        }
        if (c0499j.f3496j.equals(f3464u.m4910N())) {
            mo3356a(3);
            m3004W();
        }
    }

    /* renamed from: cl */
    public C0208c m3495cl() {
        if (this.f3452b == 1) {
            return f3463t.m4910N();
        }
        if (this.f3452b == 2) {
            return f3464u.m4910N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: V */
    public int m3501V() {
        return this.f3452b;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
        AbstractC0197n.m5069b((AbstractC0244am) this);
        if (this.f3452b > i) {
            this.f3452b = 1;
            this.f1633ct = 800.0f;
            if (this.f1632cs > this.f1633ct) {
                this.f1632cs = this.f1633ct;
            }
        }
        if (this.f3452b < 2 && i >= 2) {
            this.f1633ct += 200.0f;
            this.f1632cs += 200.0f;
        }
        if (this.f3452b < 3 && i >= 3) {
            this.f1633ct += 1000.0f;
            this.f1632cs += 1000.0f;
        }
        this.f3452b = i;
        AbstractC0197n.m5053c(this);
        m3502S();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.g$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g$1.class */
    final class C04931 extends AbstractC0228w {
        C04931(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return C0820a.m1731a("units.extractor.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.upgradeT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return EnumC0249ar.f1735a.m4615c(2);
        }

        /* renamed from: K */
        public float mo3369K() {
            return 6.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0492g c0492g = (C0492g) abstractC0244am;
            if (c0492g.f3452b != 1 || c0492g.mo3438a(m4910N(), z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
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

    /* renamed from: com.corrodinggames.rts.game.units.d.g$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/g$2.class */
    final class C04942 extends AbstractC0228w {
        C04942(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return C0820a.m1731a("units.extractor.upgrade.descriptionT3", new Object[0]);
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.upgradeT3", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return EnumC0249ar.f1735a.m4615c(3);
        }

        /* renamed from: K */
        public float mo3369K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0492g c0492g = (C0492g) abstractC0244am;
            if (c0492g.f3452b != 2 || c0492g.mo3438a(m4910N(), z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
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
        if (this.f3452b == 1) {
            return f3465v;
        }
        if (this.f3452b == 2) {
            return f3466w;
        }
        return f3467x;
    }
}
