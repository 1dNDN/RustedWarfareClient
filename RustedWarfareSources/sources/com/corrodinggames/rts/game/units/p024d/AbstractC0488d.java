package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0402bc;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/d.class */
public abstract class AbstractC0488d extends AbstractC0623y {

    /* renamed from: m */
    C0934e f3425m;

    /* renamed from: n */
    public Rect f3426n;

    /* renamed from: o */
    public Rect f3427o;

    /* renamed from: p */
    public static C0934e f3428p = null;

    /* renamed from: q */
    public static C0934e[] f3429q = new C0934e[10];

    /* renamed from: r */
    int f3430r;

    /* renamed from: s */
    int f3431s;

    /* renamed from: M */
    public boolean m3384M() {
        return false;
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f3430r);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        if (reader.m1295b() >= 15) {
            mo3358R(reader.ReadInt());
        }
        super.mo2291a(reader);
    }

    /* renamed from: a */
    public static boolean m3383a(InterfaceC0303as interfaceC0303as, float f, float f2, AbstractC0197n abstractC0197n) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0623y abstractC0623y = (AbstractC0623y) AbstractC0244am.m4425a(interfaceC0303as);
        m1072A.f6110bL.m4822b(f, f2);
        abstractC0623y.f6957el = m1072A.f6110bL.f801T + abstractC0623y.mo3292cX();
        abstractC0623y.f6958em = m1072A.f6110bL.f802U + abstractC0623y.mo3292cX();
        abstractC0623y.m2838b(abstractC0197n);
        return abstractC0623y.m2793c((AbstractC0197n) null);
    }

    /* renamed from: R */
    public void mo3358R(int i) {
        this.f3430r = i;
    }

    /* renamed from: d */
    public C0934e mo2988d(int i) {
        return null;
    }

    /* renamed from: v */
    public C0934e mo2977v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3429q[this.f1609bV.m4650O()];
    }

    /* renamed from: dq */
    public static void m3375dq() {
        f3428p = LoggerMaybe.m1072A().f6113bO.mo221a(C0067R.drawable.unit_icon_building);
        f3429q = AbstractC0197n.m4627a(f3428p);
    }

    public AbstractC0488d(boolean z) {
        super(z);
        this.f3426n = new Rect();
        this.f3427o = new Rect();
        this.f3430r = 1;
        this.f3431s = 0;
        this.f1618ce = -90.0f;
        this.f1606bS = false;
    }

    /* renamed from: c_ */
    public void mo2990c_() {
        this.f1606bS = false;
    }

    /* renamed from: K */
    public boolean mo3274K() {
        m2924a(EnumC0233ab.f1505d);
        return false;
    }

    /* renamed from: e */
    public boolean mo2986e() {
        LoggerMaybe.m1072A().f6119bU.m1150a(this);
        if (this.f1624ck < 1.0f) {
            m2924a(EnumC0233ab.f1502a);
            return false;
        }
        this.f3431s = 0;
        return mo3274K();
    }

    /* renamed from: cc */
    public Rect m3376cc() {
        return this.f3427o;
    }

    /* renamed from: cb */
    public Rect m3377cb() {
        return this.f3426n;
    }

    /* renamed from: a */
    public static boolean m3382a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, int i3) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0173b c0173b = m1072A.f6110bL;
        if (!c0173b.m4813c(i, i2)) {
            return false;
        }
        boolean z = false;
        if (c0173b.f841E && m1072A.f6099bs.f1337M != null) {
            if (!c0173b.f843G && m1072A.f6099bs.f1337M[i][i2] == 10) {
                return false;
            }
            z = m1072A.f6099bs.f1337M[i][i2] >= 5;
        }
        if (m3381a(abstractC0623y, interfaceC0303as, enumC0246ao, i, i2, z)) {
            if (interfaceC0303as.mo4245p()) {
                C0180g m4803e = c0173b.m4803e(i, i2);
                if (m4803e != null && m4803e.f922i) {
                    return true;
                }
                return false;
            } else if (C0741a.m2354a(m1072A.f6099bs, i, i2, i3)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3381a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z) {
        return m3380a(abstractC0623y, interfaceC0303as, enumC0246ao, i, i2, z, null) == null;
    }

    /* renamed from: a */
    public static String m3380a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z, AbstractC0197n abstractC0197n) {
        String m3972a;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!m1072A.f6110bL.m4813c(i, i2)) {
            return "{0}";
        }
        C0402bc mo4244q = interfaceC0303as.mo4244q();
        if (mo4244q != null && (m3972a = mo4244q.m3972a(abstractC0623y, i, i2)) != null) {
            return m3972a;
        }
        if (interfaceC0303as == EnumC0249ar.f1738d || enumC0246ao == EnumC0246ao.f1707e) {
            if (!m1072A.f6119bU.m1149a(m1072A.f6119bU.f6019A, i, i2)) {
                return null;
            }
            return "{3}";
        }
        C0180g m4803e = m1072A.f6110bL.m4803e(i, i2);
        if (m4803e != null && m4803e.f922i) {
            if (interfaceC0303as.mo4245p()) {
                return null;
            }
            return "{0}";
        } else if (enumC0246ao == EnumC0246ao.f1706d) {
            return null;
        } else {
            if (enumC0246ao == EnumC0246ao.f1708f) {
                if (!m1072A.f6119bU.m1149a(m1072A.f6119bU.f6021C, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.f1709g) {
                if (!m1072A.f6119bU.m1149a(m1072A.f6119bU.f6022D, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.f1710h) {
                if (!m1072A.f6119bU.m1149a(m1072A.f6119bU.f6023E, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (m1072A.f6119bU.m1148a(m1072A.f6119bU.f6018z, i, i2, z)) {
                boolean z2 = false;
                if (abstractC0197n != null && !m1072A.f6110bL.m4852a(i, i2, abstractC0197n)) {
                    z2 = true;
                }
                if (!z2) {
                    return "{0}";
                }
                return null;
            } else {
                return null;
            }
        }
    }

    /* renamed from: b */
    public static AbstractC0244am m3379b(int i, int i2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6110bL.m4853a(i, i2);
        float f = m1072A.f6110bL.f801T + m1072A.f6110bL.f787p;
        float f2 = m1072A.f6110bL.f802U + m1072A.f6110bL.f788q;
        Iterator it = m1072A.f6127cc.m3152b(f, f2, 0.0f).iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am.m4402bI() && !abstractC0244am.f1607bT && abstractC0244am.m4385c(f, f2, 0.0f)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo3174a(int i) {
    }

    /* renamed from: g */
    public static AbstractC0244am m3374g(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            throw new RuntimeException("type is null");
        }
        return interfaceC0303as.mo4263a();
    }

    /* renamed from: I */
    public boolean mo2998I() {
        return false;
    }

    /* renamed from: h */
    public EnumC0246ao mo2982h() {
        return EnumC0246ao.f1703a;
    }

    /* renamed from: i */
    public boolean mo2981i() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo2995Q() {
        return false;
    }

    /* renamed from: z */
    public float mo2976z() {
        return 0.0f;
    }

    /* renamed from: A */
    public float mo3006A() {
        return 0.0f;
    }

    /* renamed from: x */
    public boolean mo3109x() {
        return false;
    }

    /* renamed from: f */
    public Paint mo3251f() {
        int m5435a;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.f1624ck < 1.0f) {
            m5435a = Color.m5435a((int) (40.0f + (this.f1624ck * 200.0f)), 140, 255, 140);
            porterDuffColorFilter = f3976aW;
        } else {
            m5435a = Color.m5435a(255, 255, 255, 255);
        }
        if (this.f1627cn) {
            if (this.f1630cq) {
                m5435a = Color.m5435a(200, 20, 255, 20);
                porterDuffColorFilter = f3977aX;
            }
            if (this.f1631cr) {
                m5435a = Color.m5435a(200, 255, 20, 20);
                porterDuffColorFilter = f3978aY;
            }
            if (this.f1628co) {
                m5435a = Color.m5435a(70, 70, 70, 245);
                porterDuffColorFilter = f3979aZ;
                if (this.f1631cr) {
                    m5435a = Color.m5435a(70, 255, 20, 20);
                    porterDuffColorFilter = f3978aY;
                }
            }
            if (this.f1629cp) {
                m5435a = Color.m5435a(150, 100, 100, 100);
            }
        }
        boolean z = m1072A.f6115bQ.renderAntiAlias;
        if (!m4326di()) {
            z = false;
            if (m1072A.f6256cW < 1.0f) {
                z = true;
            }
        }
        if (this.f1626cm) {
            z = EnumC0249ar.f1793ag;
        }
        return m2928a(m5435a, porterDuffColorFilter, z);
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        int i = this.f3431s * this.f4228ep;
        RectF cE = mo3370cE();
        f1685dt.m5364a(i, 0, i + this.f4228ep, 0 + this.f4229eq);
        m1072A.f6113bO.mo192a(this.f3885L, f1685dt, cE, mo3251f());
        return true;
    }

    /* renamed from: d */
    public void mo2284d(float f) {
        super.mo2284d(f);
        if (this.f3425m == null) {
            return;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m3384M()) {
            m1072A.f6113bO.mo159b(this.f3425m, (this.f6957el - ((int) (this.f3425m.f6406t + 0.1f))) - m1072A.f6144cv, (this.f6958em - ((int) (this.f3425m.f6407u + 0.1f))) - m1072A.f6145cw, mo3251f());
            return;
        }
        RectF cE = mo3370cE();
        f1685dt.m5364a(0, 0, 0 + this.f4228ep, 0 + this.f4229eq);
        m1072A.f6113bO.mo192a(this.f3425m, f1685dt, cE, mo3251f());
    }

    /* renamed from: bI */
    public boolean m3378bI() {
        return true;
    }
}
