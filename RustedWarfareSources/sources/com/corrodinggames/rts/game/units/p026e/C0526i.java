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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    float f3636e;

    /* renamed from: f */
    float f3637f;

    /* renamed from: g */
    boolean f3638g;

    /* renamed from: h */
    C1101m f3639h;

    /* renamed from: a */
    static C0934e f3640a = null;

    /* renamed from: b */
    static C0934e f3641b = null;

    /* renamed from: c */
    static C0934e f3642c = null;

    /* renamed from: d */
    static C0934e[] f3643d = new C0934e[10];

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
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f3636e);
        streamWriter.mo1320a(this.f3637f);
        streamWriter.mo1314a(this.f3638g);
        streamWriter.WriteInteger(this.f3639h.size());
        Iterator it = this.f3639h.iterator();
        while (it.hasNext()) {
            streamWriter.mo1318a((AbstractC0244am) it.next());
        }
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3636e = reader.m1285g();
        this.f3637f = reader.m1285g();
        this.f3638g = reader.ReadBool();
        this.f3639h.clear();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC0244am m1277o = reader.m1277o();
            if (m1277o != null) {
                this.f3639h.add(m1277o);
            }
        }
        super.mo2291a(reader);
    }

    /* renamed from: b */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1753s;
    }

    /* renamed from: c */
    public static void m3200c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3640a = m1072A.f6113bO.mo221a(C0067R.drawable.hovercraft);
        f3642c = m1072A.f6113bO.mo221a(C0067R.drawable.hovercraft_shadow);
        f3641b = m1072A.f6113bO.mo221a(C0067R.drawable.hovercraft_dead);
        f3643d = AbstractC0197n.m4627a(f3640a);
    }

    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3641b;
        }
        return f3643d[this.f1609bV.m4650O()];
    }

    /* renamed from: k */
    public C0934e mo2980k() {
        return f3642c;
    }

    /* renamed from: d */
    public C0934e mo2988d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean mo2986e() {
        this.f3885L = f3641b;
        m447S(0);
        this.f1606bS = false;
        m3193f(true);
        m2924a(EnumC0233ab.f1503b);
        return true;
    }

    /* renamed from: a */
    public void mo2635a() {
        m3193f(true);
        super.mo2635a();
    }

    /* renamed from: f */
    public void m3193f(boolean z) {
        Iterator it = this.f3639h.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            abstractC0244am.f1651cL = null;
            abstractC0244am.f6957el = this.f6957el + (C0758f.m2040i(this.f1618ce) * (-9.0f));
            abstractC0244am.f6958em = this.f6958em + (C0758f.m2045h(this.f1618ce) * (-9.0f));
            if (z) {
                abstractC0244am.m4350ci();
            }
        }
        this.f3639h.clear();
    }

    public C0526i(boolean z) {
        super(z);
        this.f3636e = 0.0f;
        this.f3639h = new C1101m();
        m2639T(20);
        m2638U(32);
        this.f1621ch = 15.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 450.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3640a;
        this.f3886M = f3642c;
    }

    /* renamed from: a */
    public static int m3208a(C1101m c1101m) {
        int i = 0;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            i += ((AbstractC0244am) it.next()).mo3227cu();
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m3207a(C1101m c1101m, int i, AbstractC0244am abstractC0244am) {
        if (m3208a(c1101m) + abstractC0244am.mo3227cu() <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: bX */
    public int m3203bX() {
        return m3208a(this.f3639h);
    }

    /* renamed from: bY */
    public int m3202bY() {
        return 4;
    }

    /* renamed from: a */
    public static boolean m3210a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, boolean z) {
        return m3209a(abstractC0244am, abstractC0244am2, z, 9.0f, -180.0f, 70.0f, 0.0f, 7.0f);
    }

    /* renamed from: a */
    public static boolean m3209a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, boolean z, float f, float f2, float f3, float f4, float f5) {
        float m2040i = (abstractC0244am.f6957el + (C0758f.m2040i(abstractC0244am.f1618ce + f2) * f5)) - (C0758f.m2045h(abstractC0244am.f1618ce + f2) * f4);
        float m2045h = abstractC0244am.f6958em + (C0758f.m2045h(abstractC0244am.f1618ce + f2) * f5) + (C0758f.m2040i(abstractC0244am.f1618ce + f2) * f4);
        float m2040i2 = m2040i + (C0758f.m2040i(abstractC0244am.f1618ce + 90.0f) * (z ? -f : f));
        float m2045h2 = m2045h + (C0758f.m2045h(abstractC0244am.f1618ce + 90.0f) * (z ? -f : f));
        if (!C1117y.m469a(abstractC0244am2, m2040i2, m2045h2)) {
            m2040i2 += 10.0f;
        }
        if (!C1117y.m469a(abstractC0244am2, m2040i2, m2045h2)) {
            m2040i2 -= 20.0f;
        }
        if (!C1117y.m469a(abstractC0244am2, m2040i2, m2045h2)) {
            m2040i2 -= 10.0f;
            m2045h2 += 10.0f;
        }
        if (!C1117y.m469a(abstractC0244am2, m2040i2, m2045h2)) {
            m2045h2 -= 20.0f;
        }
        if (!C1117y.m469a(abstractC0244am2, m2040i2, m2045h2)) {
            return false;
        }
        abstractC0244am2.f1651cL = null;
        abstractC0244am2.f6957el = m2040i2;
        abstractC0244am2.f6958em = m2045h2;
        abstractC0244am2.f1611bX += 0.1f;
        abstractC0244am2.f1618ce = abstractC0244am.f1618ce + f2;
        abstractC0244am2.f1604bQ = abstractC0244am;
        abstractC0244am2.f1605bR = 45.0f;
        if (abstractC0244am2 instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
            abstractC0623y.m2767j(abstractC0244am2.f1618ce);
            abstractC0623y.m2845az();
            abstractC0623y.m2789d(abstractC0244am2.f6957el + (C0758f.m2040i(abstractC0244am2.f1618ce + (z ? -f : f)) * f3), abstractC0244am2.f6958em + (C0758f.m2045h(abstractC0244am2.f1618ce + (z ? -f : f)) * f3));
            abstractC0623y.f3920ab = 0;
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (this.f1607bT || !m4396bS()) {
            return;
        }
        if (this.f1623cj == 0.0f && this.f6955ej != 3) {
            m447S(3);
        }
        if (this.f3638g && !m4372cJ() && !this.f1648cI) {
            this.f3637f = C0758f.m2159a(this.f3637f, f);
            if (this.f3637f == 0.0f) {
                this.f3637f = 30.0f;
                if (this.f3639h.size() == 0) {
                    this.f3638g = false;
                } else {
                    boolean z = this.f3639h.size() % 2 == 0;
                    AbstractC0244am abstractC0244am = (AbstractC0244am) this.f3639h.remove(this.f3639h.size() - 1);
                    if (!m3210a(this, abstractC0244am, z)) {
                        this.f3639h.add(abstractC0244am);
                    }
                    if (this.f3639h.size() == 0) {
                        this.f3638g = false;
                    }
                }
            }
        }
        this.f3636e += 4.0f * f;
        if (this.f3636e > 360.0f) {
            this.f3636e -= 360.0f;
        }
        if (!this.f3638g) {
            this.f6959en = C0758f.m2158a(this.f6959en, 3.0f + (C0758f.m2045h(this.f3636e) * 1.5f), 0.1f * f);
        } else {
            this.f6959en = C0758f.m2158a(this.f6959en, 0.0f, 0.1f * f);
        }
    }

    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: m */
    public float mo2978m() {
        return 30.0f;
    }

    /* renamed from: b */
    public float mo2992b(int i) {
        return 100.0f;
    }

    /* renamed from: z */
    public float mo2976z() {
        if (m4372cJ()) {
            return 1.2f;
        }
        return 0.9f;
    }

    /* renamed from: A */
    public float mo3006A() {
        if (m4372cJ()) {
            return 1.8f;
        }
        return 1.4f;
    }

    /* renamed from: B */
    public float mo3005B() {
        return 0.1f;
    }

    /* renamed from: C */
    public float mo3004C() {
        return 0.03f;
    }

    /* renamed from: D */
    public float mo3003D() {
        return 0.05f;
    }

    /* renamed from: c */
    public float mo2991c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean mo2979l() {
        return false;
    }

    /* renamed from: d */
    public boolean m3197d(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f3638g || !m3207a(this.f3639h, 4, abstractC0244am) || abstractC0244am == this) {
            return false;
        }
        if (this.f1609bV != abstractC0244am.f1609bV && !z) {
            return false;
        }
        return C1117y.m463a(abstractC0244am, true, true);
    }

    /* renamed from: e */
    public boolean m3195e(AbstractC0244am abstractC0244am, boolean z) {
        if (!m3197d(abstractC0244am, z)) {
            return false;
        }
        m3213C(abstractC0244am);
        return true;
    }

    /* renamed from: C */
    public void m3213C(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1651cL = this;
        this.f3639h.add(abstractC0244am);
        LoggerMaybe.m1072A().f6117bS.m1774l(abstractC0244am);
    }

    /* renamed from: e */
    public void mo4452e(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1651cL == this) {
            this.f3639h.remove(abstractC0244am);
            abstractC0244am.f1651cL = null;
            return;
        }
        LoggerMaybe.m958g("Unit is not being transported");
    }

    /* renamed from: bN */
    public float mo3075bN() {
        return 12000.0f;
    }

    /* renamed from: bA */
    public boolean mo4454bA() {
        return this.f3638g;
    }

    /* renamed from: L */
    public void m3212L() {
        this.f3638g = true;
        this.f3637f = 30.0f;
    }

    /* renamed from: M */
    public void m3211M() {
        this.f3638g = false;
    }

    /* renamed from: a */
    public void mo3067a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f3644i) {
            m3212L();
        }
        if (abstractC0224s == f3645j) {
            m3211M();
        }
    }

    /* renamed from: cq */
    public boolean m3198cq() {
        return true;
    }

    /* renamed from: bB */
    public int mo4453bB() {
        return this.f3639h.size();
    }

    /* renamed from: co */
    public C0208c m3199co() {
        return f3644i.m4507N();
    }

    /* renamed from: com.corrodinggames.rts.game.units.e.i$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i$1.class */
    final class C05271 extends AbstractC0229x {
        C05271(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3029a() {
            return "-Will unload all units when stopped";
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.unload", new Object[0]);
        }

        /* renamed from: b */
        public int mo3024b(AbstractC0244am abstractC0244am, boolean z) {
            return ((InterfaceC0242ak) abstractC0244am).mo4453bB();
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            return !((InterfaceC0242ak) abstractC0244am).mo4454bA() && ((InterfaceC0242ak) abstractC0244am).mo4451f() && ((InterfaceC0242ak) abstractC0244am).mo4453bB() > 0;
        }

        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            return ((InterfaceC0242ak) abstractC0244am).mo4450j();
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.e.i$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i$2.class */
    final class C05282 extends AbstractC0229x {
        C05282(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3029a() {
            return "-Stop unloading";
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.cancel", new Object[0]);
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            return ((InterfaceC0242ak) abstractC0244am).mo4454bA();
        }

        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            return mo3027a(abstractC0244am, false);
        }
    }

    /* renamed from: N */
    public ArrayList mo3068N() {
        return f3646k;
    }

    /* renamed from: f */
    public boolean mo4451f() {
        return !m4372cJ();
    }

    /* renamed from: j */
    public boolean mo4450j() {
        return true;
    }

    /* renamed from: bz */
    public C1101m m3201bz() {
        return this.f3639h;
    }
}
