package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.e.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/b.class */
public class C0519b extends AbstractC0529j implements InterfaceC0469d {

    /* renamed from: i */
    PointF[] f3589i;

    /* renamed from: j */
    PointF[] f3590j;

    /* renamed from: k */
    static Paint f3591k;

    /* renamed from: l */
    static Paint f3592l;

    /* renamed from: m */
    static Paint f3593m;

    /* renamed from: a */
    static C0934e f3581a = null;

    /* renamed from: b */
    public static C0934e f3582b = null;

    /* renamed from: c */
    static C0934e f3583c = null;

    /* renamed from: d */
    public static C0934e[] f3584d = new C0934e[10];

    /* renamed from: e */
    public static C0934e f3585e = null;

    /* renamed from: f */
    public static C0934e f3586f = null;

    /* renamed from: g */
    static C0934e f3587g = null;

    /* renamed from: h */
    public static C0934e[] f3588h = new C0934e[10];

    /* renamed from: n */
    static AbstractC0224s f3594n = new C0218m(false);

    /* renamed from: f */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1742h;
    }

    /* renamed from: b */
    public PointF[] mo3170b() {
        return this.f3589i;
    }

    /* renamed from: c */
    public PointF[] mo3168c() {
        return this.f3590j;
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3588h[this.f1609bV.m5105O()];
    }

    /* renamed from: K */
    public static void m3344K() {
        Core m1087A = Core.m1087A();
        f3581a = m1087A.f6113bO.mo221a(C0067R.drawable.builder);
        f3582b = m1087A.f6113bO.mo221a(C0067R.drawable.builder_dead);
        f3583c = m4777a(f3581a, f3581a.mo386m(), f3581a.mo387l());
        f3584d = AbstractC0197n.m5082a(f3581a);
        f3585e = m1087A.f6113bO.mo221a(C0067R.drawable.builder_charge);
        f3586f = m1087A.f6113bO.mo221a(C0067R.drawable.builder_decharge);
        f3587g = m1087A.f6113bO.mo221a(C0067R.drawable.unit_icon_builder);
        f3588h = AbstractC0197n.m5082a(f3587g);
    }

    /* renamed from: a */
    public boolean mo3172a(AbstractC0244am abstractC0244am) {
        if (!abstractC0244am.mo3347q() && abstractC0244am.m4758bI()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3582b;
        }
        return f3584d[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return f3583c;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core.m1087A();
        this.f3885L = f3582b;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1503b);
        return true;
    }

    public C0519b(boolean z) {
        super(z);
        this.f3589i = new PointF[6];
        this.f3590j = new PointF[this.f3589i.length];
        f3591k = new Paint();
        f3591k.m5933a(40, 0, 255, 0);
        f3591k.mo5914a(true);
        f3591k.m5936a(2.0f);
        f3591k.m5928a(Paint.Cap.f201b);
        f3592l = new Paint();
        f3592l.m5925a(f3591k);
        f3592l.m5933a(55, 255, 60, 60);
        f3593m = new Paint();
        f3593m.m5933a(60, 255, 255, 255);
        m2693T(20);
        m2692U(20);
        this.f1621ch = 10.0f;
        this.f1622ci = this.f1621ch + 2.0f;
        this.f1633ct = 170.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3581a;
        for (int i = 0; i < this.f3589i.length; i++) {
            this.f3589i[i] = new PointF();
            this.f3590j[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3343a(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        PointF[] mo3170b = interfaceC0469d.mo3170b();
        PointF[] mo3168c = interfaceC0469d.mo3168c();
        AbstractC0244am m3003X = abstractC0623y.m3003X();
        abstractC0623y.f3966aM = m3003X != null;
        if (m3003X != null) {
            for (int i = 0; i < mo3170b.length; i++) {
                PointF pointF = mo3170b[i];
                PointF pointF2 = mo3168c[i];
                pointF.f227a = C0758f.m2210a(pointF.f227a, pointF2.f227a, 0.1f * f);
                pointF.f228b = C0758f.m2210a(pointF.f228b, pointF2.f228b, 0.1f * f);
                pointF.f227a += (pointF2.f227a - pointF.f227a) * 0.04f * f;
                pointF.f228b += (pointF2.f228b - pointF.f228b) * 0.04f * f;
                float f2 = m3003X.f1621ch * 0.75f;
                if (C0758f.m2137c(pointF.f227a - pointF2.f227a) < 1.0f) {
                    pointF2.f227a = C0758f.m2125d(-f2, f2);
                }
                if (C0758f.m2137c(pointF.f228b - pointF2.f228b) < 1.0f) {
                    pointF2.f228b = C0758f.m2125d(-f2, f2);
                }
            }
        } else if (mo3170b[0].f227a != 0.0f || mo3170b[0].f228b != 0.0f) {
            for (int i2 = 0; i2 < mo3170b.length; i2++) {
                PointF pointF3 = mo3170b[i2];
                PointF pointF4 = mo3168c[i2];
                pointF3.f227a = 0.0f;
                pointF3.f228b = 0.0f;
                pointF4.f227a = 0.0f;
                pointF4.f228b = 0.0f;
            }
        }
    }

    /* renamed from: b */
    public static void m3341b(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        AbstractC0244am m3003X = abstractC0623y.m3003X();
        if (m3003X != null) {
            boolean m3002Y = abstractC0623y.m3002Y();
            if (!m3002Y && abstractC0623y.f3967aN) {
                return;
            }
            Core m1087A = Core.m1087A();
            PointF[] mo3170b = interfaceC0469d.mo3170b();
            Paint paint = f3591k;
            if (m3002Y) {
                paint = f3592l;
            }
            C1080ai m2865bn = abstractC0623y.m2865bn();
            for (PointF pointF : mo3170b) {
                float f2 = (m3003X.f6958el + pointF.f227a) - m1087A.f6144cv;
                float f3 = ((m3003X.f6959em - m3003X.f6960en) + pointF.f228b) - m1087A.f6145cw;
                m1087A.f6113bO.mo225a((m2865bn.f6849a + (pointF.f227a * 0.15f)) - m1087A.f6144cv, (((m2865bn.f6850b - m2865bn.f6851c) + (pointF.f228b * 0.15f)) - m1087A.f6145cw) - abstractC0623y.f6960en, f2, f3, paint);
                m1087A.f6113bO.mo135k();
                m1087A.f6113bO.mo168b(f2, f3);
                m1087A.f6113bO.mo228a(0.5f, 0.5f);
                if (m3002Y) {
                    m1087A.f6113bO.mo198a(f3586f, 0.0f, 0.0f, f3593m);
                } else {
                    m1087A.f6113bO.mo198a(f3585e, 0.0f, 0.0f, f3593m);
                }
                m1087A.f6113bO.mo134l();
            }
        }
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (!this.f1607bT) {
            m3343a(f, this);
        }
    }

    /* renamed from: a */
    public void mo3053a(float f, boolean z) {
        super.mo3053a(f, z);
        if (!this.f1607bT) {
            m3341b(f, this);
        }
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        return 30.0f;
    }

    /* renamed from: f */
    public float mo3041f(int i) {
        return 1.3f;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        if (!super.mo3049c(f)) {
            return false;
        }
        Core m1087A = Core.m1087A();
        if (!this.f1607bT) {
            float mo3042e = this.f1649cJ[0].f1717f / mo3042e(0);
            if (mo3042e != 0.0f) {
                C1080ai bn = m2865bn();
                m1087A.f6113bO.mo137i();
                m1087A.f6113bO.mo168b(bn.f6849a - m1087A.f6144cv, (bn.f6850b - bn.f6851c) - m1087A.f6145cw);
                m1087A.f6113bO.mo228a(mo3042e, mo3042e);
                if (m3002Y()) {
                    m1087A.f6113bO.mo198a(f3586f, 0.0f, 0.0f, (Paint) null);
                } else {
                    m1087A.f6113bO.mo198a(f3585e, 0.0f, 0.0f, (Paint) null);
                }
                m1087A.f6113bO.mo136j();
                return true;
            }
            return true;
        }
        return true;
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
            return 0.6f;
        }
        return 0.8f;
    }

    /* renamed from: A */
    public float mo3065A() {
        if (m4724cJ()) {
            return 1.7f;
        }
        return 3.8f;
    }

    /* renamed from: B */
    public float mo3064B() {
        return 0.35f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 0.04f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 0.1f;
    }

    /* renamed from: a */
    public void mo3173a(AbstractC0224s abstractC0224s, boolean z) {
    }

    /* renamed from: a */
    public static void m3342a(ArrayList arrayList, int i) {
        arrayList.add(f3594n);
        arrayList.add(new C0227v(EnumC0249ar.f1735a, 1, 1));
        arrayList.add(new C0227v(EnumC0249ar.f1740f, 1, 2));
        arrayList.add(new C0227v(EnumC0249ar.f1741g, 1, 3));
        arrayList.add(new C0227v(EnumC0249ar.f1736b, 1, 4));
        arrayList.add(new C0227v(EnumC0249ar.f1737c, 1, 5));
        arrayList.add(new C0227v(EnumC0249ar.f1738d, 1, 6));
        arrayList.add(new C0227v(EnumC0249ar.f1759y, 1, 7));
        arrayList.add(new C0227v(EnumC0249ar.f1762B, 1, 8));
        arrayList.add(new C0227v(EnumC0249ar.f1770J, 1, 9));
        arrayList.add(new C0227v(EnumC0249ar.f1767G, 1, 10));
        arrayList.add(new C0227v(EnumC0249ar.f1763C, 1, 14));
        arrayList.add(new C0227v(EnumC0249ar.f1764D, 1, 15));
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return mo1758r().mo4484a(m3005V());
    }

    /* renamed from: E */
    public boolean mo3061E() {
        return true;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 10.0f;
    }

    /* renamed from: F */
    public boolean mo3060F() {
        return Core.m1087A().settingEngine.renderExtraShadows && !this.f1607bT;
    }

    /* renamed from: G */
    public float mo3059G() {
        return 1.0f;
    }

    /* renamed from: H */
    public float mo3058H() {
        return 1.0f;
    }

    /* renamed from: g */
    public boolean mo3166g(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }
}
