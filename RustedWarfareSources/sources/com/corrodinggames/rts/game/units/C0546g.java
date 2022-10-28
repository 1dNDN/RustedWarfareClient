package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.p026e.AbstractC0529j;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g.class */
public class C0546g extends AbstractC0529j implements InterfaceC0469d {

    /* renamed from: a */
    public boolean f3745a;

    /* renamed from: b */
    PointF[] f3746b;

    /* renamed from: c */
    PointF[] f3747c;

    /* renamed from: d */
    static Paint f3748d;

    /* renamed from: e */
    static Paint f3749e;

    /* renamed from: f */
    static Paint f3750f;

    /* renamed from: g */
    int f3751g;

    /* renamed from: h */
    float f3752h;

    /* renamed from: i */
    float f3753i;

    /* renamed from: j */
    int f3754j;

    /* renamed from: f */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1742h;
    }

    /* renamed from: b */
    public PointF[] mo3170b() {
        return this.f3746b;
    }

    /* renamed from: c */
    public PointF[] mo3168c() {
        return this.f3747c;
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3650dL[this.f1609bV.m5105O()];
    }

    /* renamed from: a */
    public boolean mo3172a(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return C0519b.f3582b;
        }
        return C0519b.f3584d[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
        this.f3885L = C0519b.f3582b;
        m447S(0);
        this.f1606bS = false;
        m1087A.f6111bM.m2776a(C0631e.f4049o, 0.8f, this.f6958el, this.f6959em);
        m2862bq();
        return true;
    }

    public C0546g(boolean z) {
        super(z);
        this.f3746b = new PointF[6];
        this.f3747c = new PointF[this.f3746b.length];
        f3748d = new Paint();
        f3748d.m5933a(40, 0, 255, 0);
        f3748d.mo5914a(true);
        f3748d.m5936a(2.0f);
        f3748d.m5928a(Paint.Cap.f201b);
        f3749e = new Paint();
        f3749e.m5925a(f3748d);
        f3749e.m5933a(55, 255, 60, 60);
        f3750f = new Paint();
        f3750f.m5933a(60, 255, 255, 255);
        m2693T(20);
        m2692U(20);
        this.f1621ch = 10.0f;
        this.f6958el = -1000.0f;
        this.f6959em = -1000.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 170000.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = C0519b.f3582b;
        for (int i = 0; i < this.f3746b.length; i++) {
            this.f3746b[i] = new PointF();
            this.f3747c[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3243a(float f, InterfaceC0469d interfaceC0469d) {
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

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (!this.f1607bT) {
            m3243a(f, this);
        }
        this.f1632cs = this.f1633ct;
        this.f3751g++;
        this.f3752h += f;
        this.f3753i += f;
        Core.m1087A();
        if (this.f3745a) {
            Core.LogDebug2("Stress test active");
            for (int i = 0; i < 6000; i++) {
                m3239w();
            }
            m4700ch();
        } else if (this.f3753i > 3.0f) {
            this.f3753i = 0.0f;
            m3239w();
        }
    }

    /* renamed from: w */
    public void m3239w() {
        Core m1087A = Core.m1087A();
        this.f3754j++;
        InterfaceC0303as interfaceC0303as = (InterfaceC0303as) EnumC0249ar.f1791ae.get(C0758f.m2188a((AbstractC1120w) this, 0, EnumC0249ar.f1791ae.size() - 1, 1 + this.f3754j));
        boolean z = true;
        if (C0453l.f2903b == interfaceC0303as) {
            z = false;
        }
        if (interfaceC0303as == EnumC0249ar.f1779S) {
            z = false;
        }
        if (z) {
            AbstractC0244am mo4485a = interfaceC0303as.mo4485a();
            mo4485a.f6958el = C0758f.m2188a((AbstractC1120w) this, 200, ((int) m1087A.f6110bL.m5281i()) - 200, 2 + this.f3751g + this.f3754j);
            mo4485a.f6959em = C0758f.m2188a((AbstractC1120w) this, 200, ((int) m1087A.f6110bL.m5280j()) - 200, 3 + this.f3751g + this.f3754j + (this.f3754j * 9));
            try {
                mo4485a.m4797Q(C0758f.m2188a((AbstractC1120w) this, 0, 3, 4 + this.f3751g + this.f3754j + (this.f3754j * 9)));
                AbstractC0197n.m5053c(mo4485a);
                if (mo4485a.mo1756u()) {
                    mo4485a.mo2689a();
                }
                if (mo4485a.mo4386bO()) {
                    mo4485a.mo2689a();
                }
            } catch (C0179f e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public void mo3053a(float f, boolean z) {
        if (!this.f1607bT) {
        }
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float mo3041f(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        if (!super.mo3049c(f)) {
            return false;
        }
        Core.m1087A();
        return true;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: x */
    public boolean m3238x() {
        return false;
    }

    /* renamed from: y */
    public int mo3161y() {
        return 850000;
    }

    /* renamed from: b */
    public float m3242b(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
    }

    /* renamed from: c */
    public float m3241c(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
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
        return 0.0f;
    }

    /* renamed from: A */
    public float mo3065A() {
        if (m4724cJ()) {
            return 4.7f;
        }
        return 4.8f;
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

    /* renamed from: u */
    public boolean mo1756u() {
        return true;
    }

    /* renamed from: I */
    public boolean mo3057I() {
        return false;
    }

    /* renamed from: d */
    public boolean mo3044d(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: J */
    public boolean mo3056J() {
        return true;
    }

    /* renamed from: a */
    public float mo3052a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        return super.mo3052a(abstractC0244am, 0.0f, c0188f);
    }
}
