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
import com.corrodinggames.rts.gameFramework.Core;
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
    public boolean m3541M() {
        return false;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f3430r);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3535a(Reader reader) {
        if (reader.m1310b() >= 15) {
            m3540R(reader.ReadInt());
        }
        super.m2961a(reader);
    }

    /* renamed from: a */
    public static boolean m3539a(InterfaceC0303as interfaceC0303as, float f, float f2, AbstractC0197n abstractC0197n) {
        Core m1087A = Core.m1087A();
        AbstractC0623y abstractC0623y = (AbstractC0623y) AbstractC0244am.m4785a(interfaceC0303as);
        m1087A.f6110bL.m5309b(f, f2);
        abstractC0623y.f6958el = m1087A.f6110bL.f801T + abstractC0623y.m4710cX();
        abstractC0623y.f6959em = m1087A.f6110bL.f802U + abstractC0623y.m4710cX();
        abstractC0623y.m2894b(abstractC0197n);
        return abstractC0623y.m2848c((AbstractC0197n) null);
    }

    /* renamed from: R */
    public void m3540R(int i) {
        this.f3430r = i;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return null;
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3429q[this.f1609bV.m5105O()];
    }

    /* renamed from: dq */
    public static void m3529dq() {
        f3428p = Core.m1087A().f6113bO.mo221a(C0067R.drawable.unit_icon_building);
        f3429q = AbstractC0197n.m5082a(f3428p);
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
    public void mo3047c_() {
        this.f1606bS = false;
    }

    /* renamed from: K */
    public boolean m3542K() {
        m2981a(EnumC0233ab.f1505d);
        return false;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core.m1087A().f6119bU.m1165a(this);
        if (this.f1624ck < 1.0f) {
            m2981a(EnumC0233ab.f1502a);
            return false;
        }
        this.f3431s = 0;
        return m3542K();
    }

    /* renamed from: cc */
    public Rect m3531cc() {
        return this.f3427o;
    }

    /* renamed from: cb */
    public Rect m3532cb() {
        return this.f3426n;
    }

    /* renamed from: a */
    public static boolean m3538a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, int i3) {
        Core m1087A = Core.m1087A();
        C0173b c0173b = m1087A.f6110bL;
        if (!c0173b.m5300c(i, i2)) {
            return false;
        }
        boolean z = false;
        if (c0173b.f841E && m1087A.f6099bs.f1337M != null) {
            if (!c0173b.f843G && m1087A.f6099bs.f1337M[i][i2] == 10) {
                return false;
            }
            z = m1087A.f6099bs.f1337M[i][i2] >= 5;
        }
        if (m3537a(abstractC0623y, interfaceC0303as, enumC0246ao, i, i2, z)) {
            if (interfaceC0303as.mo4467p()) {
                C0180g m5290e = c0173b.m5290e(i, i2);
                if (m5290e != null && m5290e.f922i) {
                    return true;
                }
                return false;
            } else if (C0741a.m2406a(m1087A.f6099bs, i, i2, i3)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3537a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z) {
        return m3536a(abstractC0623y, interfaceC0303as, enumC0246ao, i, i2, z, null) == null;
    }

    /* renamed from: a */
    public static String m3536a(AbstractC0623y abstractC0623y, InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao, int i, int i2, boolean z, AbstractC0197n abstractC0197n) {
        String m4179a;
        Core m1087A = Core.m1087A();
        if (!m1087A.f6110bL.m5300c(i, i2)) {
            return "{0}";
        }
        C0402bc mo4466q = interfaceC0303as.mo4466q();
        if (mo4466q != null && (m4179a = mo4466q.m4179a(abstractC0623y, i, i2)) != null) {
            return m4179a;
        }
        if (interfaceC0303as == EnumC0249ar.f1738d || enumC0246ao == EnumC0246ao.f1707e) {
            if (!m1087A.f6119bU.m1164a(m1087A.f6119bU.f6019A, i, i2)) {
                return null;
            }
            return "{3}";
        }
        C0180g m5290e = m1087A.f6110bL.m5290e(i, i2);
        if (m5290e != null && m5290e.f922i) {
            if (interfaceC0303as.mo4467p()) {
                return null;
            }
            return "{0}";
        } else if (enumC0246ao == EnumC0246ao.f1706d) {
            return null;
        } else {
            if (enumC0246ao == EnumC0246ao.f1708f) {
                if (!m1087A.f6119bU.m1164a(m1087A.f6119bU.f6021C, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.f1709g) {
                if (!m1087A.f6119bU.m1164a(m1087A.f6119bU.f6022D, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (enumC0246ao == EnumC0246ao.f1710h) {
                if (!m1087A.f6119bU.m1164a(m1087A.f6119bU.f6023E, i, i2)) {
                    return null;
                }
                return "{0}";
            } else if (m1087A.f6119bU.m1163a(m1087A.f6119bU.f6018z, i, i2, z)) {
                boolean z2 = false;
                if (abstractC0197n != null && !m1087A.f6110bL.m5339a(i, i2, abstractC0197n)) {
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
    public static AbstractC0244am m3534b(int i, int i2) {
        Core m1087A = Core.m1087A();
        m1087A.f6110bL.m5340a(i, i2);
        float f = m1087A.f6110bL.f801T + m1087A.f6110bL.f787p;
        float f2 = m1087A.f6110bL.f802U + m1087A.f6110bL.f788q;
        Iterator it = m1087A.f6127cc.m3250b(f, f2, 0.0f).iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am.m4758bI() && !abstractC0244am.f1607bT && abstractC0244am.m4739c(f, f2, 0.0f)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
    }

    /* renamed from: g */
    public static AbstractC0244am m3528g(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            throw new RuntimeException("type is null");
        }
        return interfaceC0303as.mo4485a();
    }

    /* renamed from: I */
    public boolean mo3057I() {
        return false;
    }

    /* renamed from: h */
    public EnumC0246ao mo3039h() {
        return EnumC0246ao.f1703a;
    }

    /* renamed from: i */
    public boolean mo3038i() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo3054Q() {
        return false;
    }

    /* renamed from: z */
    public float mo3033z() {
        return 0.0f;
    }

    /* renamed from: A */
    public float mo3065A() {
        return 0.0f;
    }

    /* renamed from: x */
    public boolean m3527x() {
        return false;
    }

    /* renamed from: f */
    public Paint mo3353f() {
        int m5948a;
        Core m1087A = Core.m1087A();
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (this.f1624ck < 1.0f) {
            m5948a = Color.m5948a((int) (40.0f + (this.f1624ck * 200.0f)), 140, 255, 140);
            porterDuffColorFilter = f3976aW;
        } else {
            m5948a = Color.m5948a(255, 255, 255, 255);
        }
        if (this.f1627cn) {
            if (this.f1630cq) {
                m5948a = Color.m5948a(200, 20, 255, 20);
                porterDuffColorFilter = f3977aX;
            }
            if (this.f1631cr) {
                m5948a = Color.m5948a(200, 255, 20, 20);
                porterDuffColorFilter = f3978aY;
            }
            if (this.f1628co) {
                m5948a = Color.m5948a(70, 70, 70, 245);
                porterDuffColorFilter = f3979aZ;
                if (this.f1631cr) {
                    m5948a = Color.m5948a(70, 255, 20, 20);
                    porterDuffColorFilter = f3978aY;
                }
            }
            if (this.f1629cp) {
                m5948a = Color.m5948a(150, 100, 100, 100);
            }
        }
        boolean z = m1087A.settingEngine.renderAntiAlias;
        if (!m4671di()) {
            z = false;
            if (m1087A.f6256cW < 1.0f) {
                z = true;
            }
        }
        if (this.f1626cm) {
            z = EnumC0249ar.f1793ag;
        }
        return m2985a(m5948a, porterDuffColorFilter, z);
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        Core m1087A = Core.m1087A();
        int i = this.f3431s * this.f4228ep;
        RectF cE = m4729cE();
        f1685dt.m5874a(i, 0, i + this.f4228ep, 0 + this.f4229eq);
        m1087A.f6113bO.mo192a(this.f3885L, f1685dt, cE, mo3353f());
        return true;
    }

    /* renamed from: d */
    public void m3530d(float f) {
        super.m2844d(f);
        if (this.f3425m == null) {
            return;
        }
        Core m1087A = Core.m1087A();
        if (m3541M()) {
            m1087A.f6113bO.mo159b(this.f3425m, (this.f6958el - ((int) (this.f3425m.f6406t + 0.1f))) - m1087A.f6144cv, (this.f6959em - ((int) (this.f3425m.f6407u + 0.1f))) - m1087A.f6145cw, mo3353f());
            return;
        }
        RectF cE = m4729cE();
        f1685dt.m5874a(0, 0, 0 + this.f4228ep, 0 + this.f4229eq);
        m1087A.f6113bO.mo192a(this.f3425m, f1685dt, cE, mo3353f());
    }

    /* renamed from: bI */
    public boolean m3533bI() {
        return true;
    }
}
