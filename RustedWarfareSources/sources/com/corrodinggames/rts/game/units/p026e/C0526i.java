package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.e.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i.class */
public class C0526i extends AbstractC0525h implements InterfaceC0242ak {

    /* renamed from: e */
    float f3640e;

    /* renamed from: f */
    float f3641f;

    /* renamed from: g */
    boolean f3642g;

    /* renamed from: h */
    C1101m f3643h;

    /* renamed from: a */
    static C0934e f3636a = null;

    /* renamed from: b */
    static C0934e f3637b = null;

    /* renamed from: c */
    static C0934e f3638c = null;

    /* renamed from: d */
    static C0934e[] f3639d = new C0934e[10];

    /* renamed from: i */
    public static final AbstractC0224s f3644i = new C05271(109);

    /* renamed from: j */
    public static final AbstractC0224s f3645j = new C05282(110);

    /* renamed from: k */
    static ArrayList f3646k = new ArrayList();

    static {
        f3646k.add(f3644i);
        f3646k.add(f3645j);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f3640e);
        streamWriter.mo1335a(this.f3641f);
        streamWriter.mo1329a(this.f3642g);
        streamWriter.WriteInteger(this.f3643h.size());
        Iterator it = this.f3643h.iterator();
        while (it.hasNext()) {
            streamWriter.mo1333a((AbstractC0244am) it.next());
        }
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3309a(Reader reader) {
        this.f3640e = reader.m1300g();
        this.f3641f = reader.m1300g();
        this.f3642g = reader.ReadBool();
        this.f3643h.clear();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC0244am m1292o = reader.m1292o();
            if (m1292o != null) {
                this.f3643h.add(m1292o);
            }
        }
        super.m2961a(reader);
    }

    /* renamed from: b */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1753s;
    }

    /* renamed from: c */
    public static void m3300c() {
        Core m1087A = Core.m1087A();
        f3636a = m1087A.f6113bO.mo221a(C0067R.drawable.hovercraft);
        f3638c = m1087A.f6113bO.mo221a(C0067R.drawable.hovercraft_shadow);
        f3637b = m1087A.f6113bO.mo221a(C0067R.drawable.hovercraft_dead);
        f3639d = AbstractC0197n.m5082a(f3636a);
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3637b;
        }
        return f3639d[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return f3638c;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        this.f3885L = f3637b;
        m447S(0);
        this.f1606bS = false;
        m3293f(true);
        m2981a(EnumC0233ab.f1503b);
        return true;
    }

    /* renamed from: a */
    public void mo2689a() {
        m3293f(true);
        super.mo2689a();
    }

    /* renamed from: f */
    public void m3293f(boolean z) {
        Iterator it = this.f3643h.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            abstractC0244am.f1651cL = null;
            abstractC0244am.f6958el = this.f6958el + (C0758f.m2092i(this.f1618ce) * (-9.0f));
            abstractC0244am.f6959em = this.f6959em + (C0758f.m2097h(this.f1618ce) * (-9.0f));
            if (z) {
                abstractC0244am.m4699ci();
            }
        }
        this.f3643h.clear();
    }

    public C0526i(boolean z) {
        super(z);
        this.f3640e = 0.0f;
        this.f3643h = new C1101m();
        m2693T(20);
        m2692U(32);
        this.f1621ch = 15.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 450.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3636a;
        this.f3886M = f3638c;
    }

    /* renamed from: a */
    public static int m3308a(C1101m c1101m) {
        int i = 0;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            i += ((AbstractC0244am) it.next()).mo3328cu();
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m3307a(C1101m c1101m, int i, AbstractC0244am abstractC0244am) {
        if (m3308a(c1101m) + abstractC0244am.mo3328cu() <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: bX */
    public int m3303bX() {
        return m3308a(this.f3643h);
    }

    /* renamed from: bY */
    public int m3302bY() {
        return 4;
    }

    /* renamed from: a */
    public static boolean m3311a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, boolean z) {
        return m3310a(abstractC0244am, abstractC0244am2, z, 9.0f, -180.0f, 70.0f, 0.0f, 7.0f);
    }

    /* renamed from: a */
    public static boolean m3310a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, boolean z, float f, float f2, float f3, float f4, float f5) {
        float m2092i = (abstractC0244am.f6958el + (C0758f.m2092i(abstractC0244am.f1618ce + f2) * f5)) - (C0758f.m2097h(abstractC0244am.f1618ce + f2) * f4);
        float m2097h = abstractC0244am.f6959em + (C0758f.m2097h(abstractC0244am.f1618ce + f2) * f5) + (C0758f.m2092i(abstractC0244am.f1618ce + f2) * f4);
        float m2092i2 = m2092i + (C0758f.m2092i(abstractC0244am.f1618ce + 90.0f) * (z ? -f : f));
        float m2097h2 = m2097h + (C0758f.m2097h(abstractC0244am.f1618ce + 90.0f) * (z ? -f : f));
        if (!C1117y.m469a(abstractC0244am2, m2092i2, m2097h2)) {
            m2092i2 += 10.0f;
        }
        if (!C1117y.m469a(abstractC0244am2, m2092i2, m2097h2)) {
            m2092i2 -= 20.0f;
        }
        if (!C1117y.m469a(abstractC0244am2, m2092i2, m2097h2)) {
            m2092i2 -= 10.0f;
            m2097h2 += 10.0f;
        }
        if (!C1117y.m469a(abstractC0244am2, m2092i2, m2097h2)) {
            m2097h2 -= 20.0f;
        }
        if (!C1117y.m469a(abstractC0244am2, m2092i2, m2097h2)) {
            return false;
        }
        abstractC0244am2.f1651cL = null;
        abstractC0244am2.f6958el = m2092i2;
        abstractC0244am2.f6959em = m2097h2;
        abstractC0244am2.f1611bX += 0.1f;
        abstractC0244am2.f1618ce = abstractC0244am.f1618ce + f2;
        abstractC0244am2.f1604bQ = abstractC0244am;
        abstractC0244am2.f1605bR = 45.0f;
        if (abstractC0244am2 instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
            abstractC0623y.m2821j(abstractC0244am2.f1618ce);
            abstractC0623y.m2901az();
            abstractC0623y.m2843d(abstractC0244am2.f6958el + (C0758f.m2092i(abstractC0244am2.f1618ce + (z ? -f : f)) * f3), abstractC0244am2.f6959em + (C0758f.m2097h(abstractC0244am2.f1618ce + (z ? -f : f)) * f3));
            abstractC0623y.f3920ab = 0;
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (this.f1607bT || !m4751bS()) {
            return;
        }
        if (this.f1623cj == 0.0f && this.f6956ej != 3) {
            m447S(3);
        }
        if (this.f3642g && !m4724cJ() && !this.f1648cI) {
            this.f3641f = C0758f.m2211a(this.f3641f, f);
            if (this.f3641f == 0.0f) {
                this.f3641f = 30.0f;
                if (this.f3643h.size() == 0) {
                    this.f3642g = false;
                } else {
                    boolean z = this.f3643h.size() % 2 == 0;
                    AbstractC0244am abstractC0244am = (AbstractC0244am) this.f3643h.remove(this.f3643h.size() - 1);
                    if (!m3311a(this, abstractC0244am, z)) {
                        this.f3643h.add(abstractC0244am);
                    }
                    if (this.f3643h.size() == 0) {
                        this.f3642g = false;
                    }
                }
            }
        }
        this.f3640e += 4.0f * f;
        if (this.f3640e > 360.0f) {
            this.f3640e -= 360.0f;
        }
        if (!this.f3642g) {
            this.f6960en = C0758f.m2210a(this.f6960en, 3.0f + (C0758f.m2097h(this.f3640e) * 1.5f), 0.1f * f);
        } else {
            this.f6960en = C0758f.m2210a(this.f6960en, 0.0f, 0.1f * f);
        }
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: m */
    public float mo3035m() {
        return 30.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 100.0f;
    }

    /* renamed from: z */
    public float mo3033z() {
        if (m4724cJ()) {
            return 1.2f;
        }
        return 0.9f;
    }

    /* renamed from: A */
    public float mo3065A() {
        if (m4724cJ()) {
            return 1.8f;
        }
        return 1.4f;
    }

    /* renamed from: B */
    public float mo3064B() {
        return 0.1f;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 0.03f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 0.05f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: d */
    public boolean m3297d(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f3642g || !m3307a(this.f3643h, 4, abstractC0244am) || abstractC0244am == this) {
            return false;
        }
        if (this.f1609bV != abstractC0244am.f1609bV && !z) {
            return false;
        }
        return C1117y.m463a(abstractC0244am, true, true);
    }

    /* renamed from: e */
    public boolean m3295e(AbstractC0244am abstractC0244am, boolean z) {
        if (!m3297d(abstractC0244am, z)) {
            return false;
        }
        m3314C(abstractC0244am);
        return true;
    }

    /* renamed from: C */
    public void m3314C(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1651cL = this;
        this.f3643h.add(abstractC0244am);
        Core.m1087A().f6117bS.m1818l(abstractC0244am);
    }

    /* renamed from: e */
    public void mo4817e(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1651cL == this) {
            this.f3643h.remove(abstractC0244am);
            abstractC0244am.f1651cL = null;
            return;
        }
        Core.m973g("Unit is not being transported");
    }

    /* renamed from: bN */
    public float mo3158bN() {
        return 12000.0f;
    }

    /* renamed from: bA */
    public boolean mo4819bA() {
        return this.f3642g;
    }

    /* renamed from: L */
    public void m3313L() {
        this.f3642g = true;
        this.f3641f = 30.0f;
    }

    /* renamed from: M */
    public void m3312M() {
        this.f3642g = false;
    }

    /* renamed from: a */
    public void mo3173a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f3644i) {
            m3313L();
        }
        if (abstractC0224s == f3645j) {
            m3312M();
        }
    }

    /* renamed from: cq */
    public boolean m3298cq() {
        return true;
    }

    /* renamed from: bB */
    public int mo4818bB() {
        return this.f3643h.size();
    }

    /* renamed from: co */
    public C0208c m3299co() {
        return f3644i.m4910N();
    }

    /* renamed from: com.corrodinggames.rts.game.units.e.i$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i$1.class */
    final class C05271 extends AbstractC0229x {
        C05271(int i) {
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
            return ((InterfaceC0242ak) abstractC0244am).mo4818bB();
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return !((InterfaceC0242ak) abstractC0244am).mo4819bA() && ((InterfaceC0242ak) abstractC0244am).mo4816f() && ((InterfaceC0242ak) abstractC0244am).mo4818bB() > 0;
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            return ((InterfaceC0242ak) abstractC0244am).mo4815j();
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.e.i$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i$2.class */
    final class C05282 extends AbstractC0229x {
        C05282(int i) {
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
            return ((InterfaceC0242ak) abstractC0244am).mo4819bA();
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            return mo3086a(abstractC0244am, false);
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f3646k;
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
    public C1101m m3301bz() {
        return this.f3643h;
    }
}
