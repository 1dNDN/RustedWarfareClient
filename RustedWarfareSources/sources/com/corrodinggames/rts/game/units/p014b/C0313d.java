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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f1872e);
        streamWriter.mo1320a(this.f1873f);
        streamWriter.mo1314a(this.f1874g);
        streamWriter.WriteInteger(this.f1875o.size());
        Iterator it = this.f1875o.iterator();
        while (it.hasNext()) {
            streamWriter.mo1318a((AbstractC0244am) it.next());
        }
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f1872e = reader.m1285g();
        this.f1873f = reader.m1285g();
        this.f1874g = reader.ReadBool();
        this.f1875o.clear();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC0244am m1277o = reader.m1277o();
            if (m1277o != null) {
                this.f1875o.add(m1277o);
            }
        }
        super.mo2291a(reader);
    }

    /* renamed from: bX */
    public int m4189bX() {
        return C0526i.m3208a(this.f1875o);
    }

    /* renamed from: bY */
    public int m4188bY() {
        return 4;
    }

    /* renamed from: b */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1760z;
    }

    /* renamed from: c */
    public static void m4186c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f1869b = m1072A.f6113bO.mo221a(C0067R.drawable.dropship);
        f1870c = m1072A.f6113bO.mo221a(C0067R.drawable.dropship_shadow);
        f1868a = m1072A.f6113bO.mo221a(C0067R.drawable.dropship_dead);
        f1871d = AbstractC0197n.m4627a(f1869b);
    }

    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f1868a;
        }
        return f1871d[this.f1609bV.m4650O()];
    }

    /* renamed from: k */
    public C0934e mo2980k() {
        return f1870c;
    }

    /* renamed from: d */
    public C0934e mo2988d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean mo2986e() {
        LoggerMaybe.m1072A().f6116bR.m2318b(this.f6957el, this.f6958em, this.f6959en);
        this.f3885L = f1868a;
        m447S(0);
        this.f1606bS = false;
        m4178f(true);
        return true;
    }

    public C0313d(boolean z) {
        super(z);
        this.f1872e = 0.0f;
        this.f1875o = new C1101m();
        this.f1876p = new Rect();
        m2639T(45);
        m2638U(47);
        this.f1621ch = 20.0f;
        this.f1622ci = this.f1621ch + 0.0f;
        this.f1633ct = 500.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f1869b;
        this.f3886M = f1870c;
        this.f6959en = 0.0f;
    }

    /* renamed from: I */
    public boolean mo2998I() {
        return true;
    }

    /* renamed from: i */
    public boolean mo2981i() {
        return this.f6959en >= 4.0f;
    }

    /* renamed from: cr */
    public boolean m4183cr() {
        return true;
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (this.f1607bT) {
            return;
        }
        boolean cJ = m4372cJ();
        if (this.f1874g && !cJ && !this.f1648cI && this.f6959en < 4.0f) {
            this.f1873f = C0758f.m2159a(this.f1873f, f);
            if (this.f1873f == 0.0f) {
                this.f1873f = 30.0f;
                if (this.f1875o.size() == 0) {
                    this.f1874g = false;
                } else {
                    boolean z = this.f1875o.size() % 2 == 0;
                    float m2040i = this.f6957el + (C0758f.m2040i(this.f1618ce) * (-9.0f));
                    float m2045h = this.f6958em + (C0758f.m2045h(this.f1618ce) * (-9.0f));
                    float m2040i2 = m2040i + (C0758f.m2040i(this.f1618ce + 90.0f) * (z ? -7 : 7)) + (C0758f.m2045h(this.f1618ce + 90.0f) * (z ? -7 : 7));
                    AbstractC0244am abstractC0244am = (AbstractC0244am) this.f1875o.remove(this.f1875o.size() - 1);
                    if (!C1117y.m469a(abstractC0244am, m2040i2, m2045h)) {
                        m2040i2 += 10.0f;
                    }
                    if (!C1117y.m469a(abstractC0244am, m2040i2, m2045h)) {
                        m2040i2 -= 20.0f;
                    }
                    if (!C1117y.m469a(abstractC0244am, m2040i2, m2045h)) {
                        m2040i2 -= 10.0f;
                        m2045h += 10.0f;
                    }
                    if (!C1117y.m469a(abstractC0244am, m2040i2, m2045h)) {
                        m2045h -= 20.0f;
                    }
                    if (!C1117y.m469a(abstractC0244am, m2040i2, m2045h)) {
                        this.f1875o.add(abstractC0244am);
                    } else {
                        abstractC0244am.f1651cL = null;
                        abstractC0244am.f6957el = m2040i2;
                        abstractC0244am.f6958em = m2045h;
                        abstractC0244am.f1611bX += 0.1f;
                        abstractC0244am.f1618ce = this.f1618ce + 180.0f;
                        abstractC0244am.f1604bQ = this;
                        abstractC0244am.f1605bR = 45.0f;
                        if (abstractC0244am instanceof AbstractC0623y) {
                            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                            abstractC0623y.m2845az();
                            abstractC0623y.m2789d(this.f6957el + (C0758f.m2040i(this.f1618ce) * (-66.0f)), this.f6958em + (C0758f.m2045h(this.f1618ce) * (-66.0f)));
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
        boolean mo2981i = mo2981i();
        if (m4396bS()) {
            if (m2854aq() && !cJ) {
                this.f6959en = C0758f.m2158a(this.f6959en, 2.0f, 0.4f * f);
            } else {
                this.f6959en = C0758f.m2158a(this.f6959en, 35.0f + (C0758f.m2045h(this.f1872e) * 1.5f), 0.35f * f);
            }
        }
        if (mo2981i != mo2981i()) {
            this.f3944ax = true;
            if (mo2981i()) {
                m447S(5);
            } else {
                m447S(2);
            }
        }
    }

    /* renamed from: E */
    public PointF mo3073E(int i) {
        float mo2983g = mo2983g(i);
        float f = this.f1618ce;
        f3985bf.m5369a(this.f6957el + (C0758f.m2040i(f) * mo2983g), this.f6958em + (C0758f.m2045h(f) * mo2983g));
        return f3985bf;
    }

    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3073E = mo3073E(i);
        C0188f m4716a = C0188f.m4716a(this, mo3073E.f227a, mo3073E.f228b, this.f6959en, i);
        m4716a.f1043ar = Color.m5435a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        m4716a.f1021U = 35.0f;
        m4716a.f986l = abstractC0244am;
        m4716a.f982h = 80.0f;
        m4716a.f994t = 4.0f;
        m4716a.f998x = 2.0f;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6116bR.m2333a(mo3073E.f227a, mo3073E.f228b, this.f6959en, -1127220);
        m1072A.f6116bR.m2338a(mo3073E.f227a, mo3073E.f228b, this.f6959en, this.f1649cJ[i].f1712a);
        m1072A.f6111bM.m2722a(C0631e.f4055u, 0.3f, this.f6957el, this.f6958em);
    }

    /* renamed from: m */
    public float mo2978m() {
        return 140.0f;
    }

    /* renamed from: b */
    public float mo2992b(int i) {
        return 40.0f;
    }

    /* renamed from: z */
    public float mo2976z() {
        return 2.3f;
    }

    /* renamed from: A */
    public float mo3006A() {
        return 1.4f;
    }

    /* renamed from: c */
    public float mo2991c(int i) {
        return 99.0f;
    }

    /* renamed from: E */
    public boolean mo3002E() {
        return false;
    }

    /* renamed from: C */
    public float mo3004C() {
        return 0.03f;
    }

    /* renamed from: D */
    public float mo3003D() {
        return 0.05f;
    }

    /* renamed from: l */
    public boolean mo2979l() {
        return false;
    }

    /* renamed from: g */
    public float mo2983g(int i) {
        return 15.0f;
    }

    /* renamed from: a */
    public void mo2635a() {
        m4178f(true);
        super.mo2635a();
    }

    /* renamed from: f */
    public void m4178f(boolean z) {
        Iterator it = this.f1875o.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            abstractC0244am.f1651cL = null;
            abstractC0244am.f6957el = this.f6957el + (C0758f.m2040i(this.f1618ce) * (-9.0f));
            abstractC0244am.f6958em = this.f6958em + (C0758f.m2045h(this.f1618ce) * (-9.0f));
            if (z) {
                abstractC0244am.m4350ci();
            }
        }
        this.f1875o.clear();
    }

    /* renamed from: bA */
    public boolean mo4454bA() {
        return this.f1874g;
    }

    /* renamed from: L */
    public void m4194L() {
        this.f1874g = true;
        this.f1873f = 30.0f;
    }

    /* renamed from: M */
    public void m4193M() {
        this.f1874g = false;
    }

    /* renamed from: bN */
    public float mo3075bN() {
        return 16000.0f;
    }

    /* renamed from: d */
    public boolean m4182d(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f1874g || !C0526i.m3207a(this.f1875o, 4, abstractC0244am) || abstractC0244am == this) {
            return false;
        }
        if (this.f1609bV != abstractC0244am.f1609bV && !z) {
            return false;
        }
        return C1117y.m463a(abstractC0244am, true, true);
    }

    /* renamed from: e */
    public boolean m4180e(AbstractC0244am abstractC0244am, boolean z) {
        if (!m4182d(abstractC0244am, z)) {
            return false;
        }
        m4195C(abstractC0244am);
        return true;
    }

    /* renamed from: C */
    public void m4195C(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1651cL = this;
        this.f1875o.add(abstractC0244am);
        LoggerMaybe.m1072A().f6117bS.m1774l(abstractC0244am);
    }

    /* renamed from: e */
    public void mo4452e(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1651cL == this) {
            this.f1875o.remove(abstractC0244am);
            abstractC0244am.f1651cL = null;
            return;
        }
        LoggerMaybe.m958g("Unit is not being transported");
    }

    /* renamed from: a */
    public void mo3067a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f1877q) {
            m4194L();
        }
        if (abstractC0224s == f1878r) {
            m4193M();
        }
    }

    /* renamed from: bB */
    public int mo4453bB() {
        return this.f1875o.size();
    }

    /* renamed from: cq */
    public boolean m4184cq() {
        return true;
    }

    /* renamed from: co */
    public C0208c m4185co() {
        return f1877q.m4507N();
    }

    /* renamed from: com.corrodinggames.rts.game.units.b.d$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d$1.class */
    final class C03141 extends AbstractC0229x {
        C03141(int i) {
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
            return ((C0313d) abstractC0244am).f1875o.size();
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            return (((C0313d) abstractC0244am).f1874g || ((AbstractC0623y) abstractC0244am).m4372cJ() || ((C0313d) abstractC0244am).f1875o.size() <= 0) ? false : true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.b.d$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d$2.class */
    final class C03152 extends AbstractC0229x {
        C03152(int i) {
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
            return ((C0313d) abstractC0244am).f1874g;
        }

        /* renamed from: b */
        public boolean mo3025b(AbstractC0244am abstractC0244am) {
            return mo3027a(abstractC0244am, false);
        }
    }

    /* renamed from: N */
    public ArrayList mo3068N() {
        return f1879s;
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
    public C1101m m4187bz() {
        return this.f1875o;
    }
}
