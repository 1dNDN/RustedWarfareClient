package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p026e.C0526i;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d.class */
public class C0313d extends AbstractC0309b implements InterfaceC0242ak {

    /* renamed from: e */
    float f1872e;

    /* renamed from: f */
    float f1873f;

    /* renamed from: g */
    boolean f1874g;

    /* renamed from: o */
    C1101m f1875o;

    /* renamed from: p */
    Rect f1876p;

    /* renamed from: a */
    static C0934e f1868a = null;

    /* renamed from: b */
    static C0934e f1869b = null;

    /* renamed from: c */
    static C0934e f1870c = null;

    /* renamed from: d */
    static C0934e[] f1871d = new C0934e[10];

    /* renamed from: q */
    public static final AbstractC0224s f1877q = new C03141(109);

    /* renamed from: r */
    public static final AbstractC0224s f1878r = new C03152(110);

    /* renamed from: s */
    static ArrayList f1879s = new ArrayList();

    static {
        f1879s.add(f1877q);
        f1879s.add(f1878r);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f1872e);
        streamWriter.mo1335a(this.f1873f);
        streamWriter.mo1329a(this.f1874g);
        streamWriter.WriteInteger(this.f1875o.size());
        Iterator it = this.f1875o.iterator();
        while (it.hasNext()) {
            streamWriter.mo1333a((AbstractC0244am) it.next());
        }
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m4409a(Reader reader) {
        this.f1872e = reader.m1300g();
        this.f1873f = reader.m1300g();
        this.f1874g = reader.ReadBool();
        this.f1875o.clear();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC0244am m1292o = reader.m1292o();
            if (m1292o != null) {
                this.f1875o.add(m1292o);
            }
        }
        super.m4425a(reader);
    }

    /* renamed from: bX */
    public int m4405bX() {
        return C0526i.m3308a(this.f1875o);
    }

    /* renamed from: bY */
    public int m4404bY() {
        return 4;
    }

    /* renamed from: b */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1760z;
    }

    /* renamed from: c */
    public static void m4402c() {
        Core m1087A = Core.m1087A();
        f1869b = m1087A.f6113bO.mo221a(C0067R.drawable.dropship);
        f1870c = m1087A.f6113bO.mo221a(C0067R.drawable.dropship_shadow);
        f1868a = m1087A.f6113bO.mo221a(C0067R.drawable.dropship_dead);
        f1871d = AbstractC0197n.m5082a(f1869b);
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f1868a;
        }
        return f1871d[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return f1870c;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core.m1087A().f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
        this.f3885L = f1868a;
        m447S(0);
        this.f1606bS = false;
        m4394f(true);
        return true;
    }

    public C0313d(boolean z) {
        super(z);
        this.f1872e = 0.0f;
        this.f1875o = new C1101m();
        this.f1876p = new Rect();
        m2693T(45);
        m2692U(47);
        this.f1621ch = 20.0f;
        this.f1622ci = this.f1621ch + 0.0f;
        this.f1633ct = 500.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f1869b;
        this.f3886M = f1870c;
        this.f6960en = 0.0f;
    }

    /* renamed from: I */
    public boolean mo3057I() {
        return true;
    }

    /* renamed from: i */
    public boolean mo3038i() {
        return this.f6960en >= 4.0f;
    }

    /* renamed from: cr */
    public boolean m4399cr() {
        return true;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (this.f1607bT) {
            return;
        }
        boolean cJ = m4724cJ();
        if (this.f1874g && !cJ && !this.f1648cI && this.f6960en < 4.0f) {
            this.f1873f = C0758f.m2211a(this.f1873f, f);
            if (this.f1873f == 0.0f) {
                this.f1873f = 30.0f;
                if (this.f1875o.size() == 0) {
                    this.f1874g = false;
                } else {
                    boolean z = this.f1875o.size() % 2 == 0;
                    float m2092i = this.f6958el + (C0758f.m2092i(this.f1618ce) * (-9.0f));
                    float m2097h = this.f6959em + (C0758f.m2097h(this.f1618ce) * (-9.0f));
                    float m2092i2 = m2092i + (C0758f.m2092i(this.f1618ce + 90.0f) * (z ? -7 : 7)) + (C0758f.m2097h(this.f1618ce + 90.0f) * (z ? -7 : 7));
                    AbstractC0244am abstractC0244am = (AbstractC0244am) this.f1875o.remove(this.f1875o.size() - 1);
                    if (!C1117y.m469a(abstractC0244am, m2092i2, m2097h)) {
                        m2092i2 += 10.0f;
                    }
                    if (!C1117y.m469a(abstractC0244am, m2092i2, m2097h)) {
                        m2092i2 -= 20.0f;
                    }
                    if (!C1117y.m469a(abstractC0244am, m2092i2, m2097h)) {
                        m2092i2 -= 10.0f;
                        m2097h += 10.0f;
                    }
                    if (!C1117y.m469a(abstractC0244am, m2092i2, m2097h)) {
                        m2097h -= 20.0f;
                    }
                    if (!C1117y.m469a(abstractC0244am, m2092i2, m2097h)) {
                        this.f1875o.add(abstractC0244am);
                    } else {
                        abstractC0244am.f1651cL = null;
                        abstractC0244am.f6958el = m2092i2;
                        abstractC0244am.f6959em = m2097h;
                        abstractC0244am.f1611bX += 0.1f;
                        abstractC0244am.f1618ce = this.f1618ce + 180.0f;
                        abstractC0244am.f1604bQ = this;
                        abstractC0244am.f1605bR = 45.0f;
                        if (abstractC0244am instanceof AbstractC0623y) {
                            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                            abstractC0623y.m2901az();
                            abstractC0623y.m2843d(this.f6958el + (C0758f.m2092i(this.f1618ce) * (-66.0f)), this.f6959em + (C0758f.m2097h(this.f1618ce) * (-66.0f)));
                        }
                        if (this.f1875o.size() == 0) {
                            this.f1874g = false;
                        }
                    }
                }
            }
        }
        this.f1872e += 2.0f * f;
        if (this.f1872e > 360.0f) {
            this.f1872e -= 360.0f;
        }
        boolean mo3038i = mo3038i();
        if (m4751bS()) {
            if (m2910aq() && !cJ) {
                this.f6960en = C0758f.m2210a(this.f6960en, 2.0f, 0.4f * f);
            } else {
                this.f6960en = C0758f.m2210a(this.f6960en, 35.0f + (C0758f.m2097h(this.f1872e) * 1.5f), 0.35f * f);
            }
        }
        if (mo3038i != mo3038i()) {
            this.f3944ax = true;
            if (mo3038i()) {
                m447S(5);
            } else {
                m447S(2);
            }
        }
    }

    /* renamed from: E */
    public PointF mo3156E(int i) {
        float mo3040g = mo3040g(i);
        float f = this.f1618ce;
        f3985bf.m5879a(this.f6958el + (C0758f.m2092i(f) * mo3040g), this.f6959em + (C0758f.m2097h(f) * mo3040g));
        return f3985bf;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3156E = mo3156E(i);
        C0188f m5203a = C0188f.m5203a(this, mo3156E.f227a, mo3156E.f228b, this.f6960en, i);
        m5203a.f1043ar = Color.m5948a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        m5203a.f1021U = 35.0f;
        m5203a.f986l = abstractC0244am;
        m5203a.f982h = 80.0f;
        m5203a.f994t = 4.0f;
        m5203a.f998x = 2.0f;
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2385a(mo3156E.f227a, mo3156E.f228b, this.f6960en, -1127220);
        m1087A.f6116bR.m2390a(mo3156E.f227a, mo3156E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
        m1087A.f6111bM.m2776a(C0631e.f4055u, 0.3f, this.f6958el, this.f6959em);
    }

    /* renamed from: m */
    public float mo3035m() {
        return 140.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 40.0f;
    }

    /* renamed from: z */
    public float mo3033z() {
        return 2.3f;
    }

    /* renamed from: A */
    public float mo3065A() {
        return 1.4f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 99.0f;
    }

    /* renamed from: E */
    public boolean mo3061E() {
        return false;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 0.03f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 0.05f;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 15.0f;
    }

    /* renamed from: a */
    public void mo2689a() {
        m4394f(true);
        super.mo2689a();
    }

    /* renamed from: f */
    public void m4394f(boolean z) {
        Iterator it = this.f1875o.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            abstractC0244am.f1651cL = null;
            abstractC0244am.f6958el = this.f6958el + (C0758f.m2092i(this.f1618ce) * (-9.0f));
            abstractC0244am.f6959em = this.f6959em + (C0758f.m2097h(this.f1618ce) * (-9.0f));
            if (z) {
                abstractC0244am.m4699ci();
            }
        }
        this.f1875o.clear();
    }

    /* renamed from: bA */
    public boolean mo4819bA() {
        return this.f1874g;
    }

    /* renamed from: L */
    public void m4411L() {
        this.f1874g = true;
        this.f1873f = 30.0f;
    }

    /* renamed from: M */
    public void m4410M() {
        this.f1874g = false;
    }

    /* renamed from: bN */
    public float mo3158bN() {
        return 16000.0f;
    }

    /* renamed from: d */
    public boolean m4398d(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f1874g || !C0526i.m3307a(this.f1875o, 4, abstractC0244am) || abstractC0244am == this) {
            return false;
        }
        if (this.f1609bV != abstractC0244am.f1609bV && !z) {
            return false;
        }
        return C1117y.m463a(abstractC0244am, true, true);
    }

    /* renamed from: e */
    public boolean m4396e(AbstractC0244am abstractC0244am, boolean z) {
        if (!m4398d(abstractC0244am, z)) {
            return false;
        }
        m4412C(abstractC0244am);
        return true;
    }

    /* renamed from: C */
    public void m4412C(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1651cL = this;
        this.f1875o.add(abstractC0244am);
        Core.m1087A().f6117bS.m1818l(abstractC0244am);
    }

    /* renamed from: e */
    public void mo4817e(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1651cL == this) {
            this.f1875o.remove(abstractC0244am);
            abstractC0244am.f1651cL = null;
            return;
        }
        Core.m973g("Unit is not being transported");
    }

    /* renamed from: a */
    public void mo3173a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f1877q) {
            m4411L();
        }
        if (abstractC0224s == f1878r) {
            m4410M();
        }
    }

    /* renamed from: bB */
    public int mo4818bB() {
        return this.f1875o.size();
    }

    /* renamed from: cq */
    public boolean m4400cq() {
        return true;
    }

    /* renamed from: co */
    public C0208c m4401co() {
        return f1877q.m4910N();
    }

    /* renamed from: com.corrodinggames.rts.game.units.b.d$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d$1.class */
    final class C03141 extends AbstractC0229x {
        C03141(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Will unload all units when stopped";
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.unload", new Object[0]);
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0313d) abstractC0244am).f1875o.size();
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return (((C0313d) abstractC0244am).f1874g || ((AbstractC0623y) abstractC0244am).m4724cJ() || ((C0313d) abstractC0244am).f1875o.size() <= 0) ? false : true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.b.d$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d$2.class */
    final class C03152 extends AbstractC0229x {
        C03152(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Stop unloading";
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.cancel", new Object[0]);
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0313d) abstractC0244am).f1874g;
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            return mo3086a(abstractC0244am, false);
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f1879s;
    }

    /* renamed from: f */
    public boolean mo4816f() {
        return !m4724cJ();
    }

    /* renamed from: j */
    public boolean mo4815j() {
        return true;
    }

    /* renamed from: bz */
    public C1101m m4403bz() {
        return this.f1875o;
    }
}
