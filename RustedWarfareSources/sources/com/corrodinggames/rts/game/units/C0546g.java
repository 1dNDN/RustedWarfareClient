package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.p026e.AbstractC0529j;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.builder;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3036b() {
        return this.f3746b;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3035c() {
        return this.f3747c;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0934e mo2957v() {
        if (this.f1609bV.f1317k == -1) {
            return null;
        }
        return f3650dL[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo2902a(AbstractC0244am abstractC0244am) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return C0519b.f3582b;
        }
        return C0519b.f3584d[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2300b(this.f6958el, this.f6959em, this.f6960en);
        this.f3886L = C0519b.f3582b;
        m447S(0);
        this.f1606bS = false;
        m1071A.f6159bM.m2703a(C0631e.f4049o, 0.8f, this.f6958el, this.f6959em);
        mo2787bq();
        return true;
    }

    public C0546g(boolean z) {
        super(z);
        this.f3746b = new PointF[6];
        this.f3747c = new PointF[this.f3746b.length];
        f3748d = new Paint();
        f3748d.m5091a(40, 0, 255, 0);
        f3748d.mo893a(true);
        f3748d.m5094a(2.0f);
        f3748d.m5086a(Paint.Cap.ROUND);
        f3749e = new Paint();
        f3749e.m5083a(f3748d);
        f3749e.m5091a(55, 255, 60, 60);
        f3750f = new Paint();
        f3750f.m5091a(60, 255, 255, 255);
        m2620T(20);
        m2619U(20);
        this.f1621ch = 10.0f;
        this.f6958el = -1000.0f;
        this.f6959em = -1000.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 170000.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = C0519b.f3582b;
        for (int i = 0; i < this.f3746b.length; i++) {
            this.f3746b[i] = new PointF();
            this.f3747c[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3084a(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        PointF[] mo3036b = interfaceC0469d.mo3036b();
        PointF[] mo3035c = interfaceC0469d.mo3035c();
        AbstractC0244am m2927X = abstractC0623y.m2927X();
        abstractC0623y.f3970aM = m2927X != null;
        if (m2927X != null) {
            for (int i = 0; i < mo3036b.length; i++) {
                PointF pointF = mo3036b[i];
                PointF pointF2 = mo3035c[i];
                pointF.f227a = C0758f.m2148a(pointF.f227a, pointF2.f227a, 0.1f * f);
                pointF.f228b = C0758f.m2148a(pointF.f228b, pointF2.f228b, 0.1f * f);
                pointF.f227a += (pointF2.f227a - pointF.f227a) * 0.04f * f;
                pointF.f228b += (pointF2.f228b - pointF.f228b) * 0.04f * f;
                float f2 = m2927X.f1621ch * 0.75f;
                if (C0758f.m2075c(pointF.f227a - pointF2.f227a) < 1.0f) {
                    pointF2.f227a = C0758f.m2063d(-f2, f2);
                }
                if (C0758f.m2075c(pointF.f228b - pointF2.f228b) < 1.0f) {
                    pointF2.f228b = C0758f.m2063d(-f2, f2);
                }
            }
        } else if (mo3036b[0].f227a != 0.0f || mo3036b[0].f228b != 0.0f) {
            for (int i2 = 0; i2 < mo3036b.length; i2++) {
                PointF pointF3 = mo3036b[i2];
                PointF pointF4 = mo3035c[i2];
                pointF3.f227a = 0.0f;
                pointF3.f228b = 0.0f;
                pointF4.f227a = 0.0f;
                pointF4.f228b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (!this.f1607bT) {
            m3084a(f, this);
        }
        this.f1632cs = this.f1633ct;
        this.f3751g++;
        this.f3752h += f;
        this.f3753i += f;
        AbstractC0916l.m1071A();
        if (this.f3745a) {
            AbstractC0916l.m963e("Stress test active");
            for (int i = 0; i < 6000; i++) {
                m3082w();
            }
            m4088ch();
        } else if (this.f3753i > 3.0f) {
            this.f3753i = 0.0f;
            m3082w();
        }
    }

    /* renamed from: w */
    public void m3082w() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        this.f3754j++;
        InterfaceC0303as interfaceC0303as = (InterfaceC0303as) EnumC0249ar.f1791ae.get(C0758f.m2126a((AbstractC1120w) this, 0, EnumC0249ar.f1791ae.size() - 1, 1 + this.f3754j));
        boolean z = true;
        if (C0453l.f2904b == interfaceC0303as) {
            z = false;
        }
        if (interfaceC0303as == EnumC0249ar.spreadingFire) {
            z = false;
        }
        if (z) {
            AbstractC0244am mo3453a = interfaceC0303as.mo3453a();
            mo3453a.f6958el = C0758f.m2126a((AbstractC1120w) this, 200, ((int) m1071A.f6158bL.m4471i()) - 200, 2 + this.f3751g + this.f3754j);
            mo3453a.f6959em = C0758f.m2126a((AbstractC1120w) this, 200, ((int) m1071A.f6158bL.m4470j()) - 200, 3 + this.f3751g + this.f3754j + (this.f3754j * 9));
            try {
                mo3453a.m4129Q(C0758f.m2126a((AbstractC1120w) this, 0, 3, 4 + this.f3751g + this.f3754j + (this.f3754j * 9)));
                AbstractC0197n.m4275c(mo3453a);
                if (mo3453a.mo1706u()) {
                    mo3453a.mo446a();
                }
                if (mo3453a.mo3522bO()) {
                    mo3453a.mo446a();
                }
            } catch (C0179f e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo444a(float f, boolean z) {
        if (!this.f1607bT) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo2764e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: f */
    public float mo2762f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        if (!super.mo437c(f)) {
            return false;
        }
        AbstractC0916l.m1071A();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: x */
    public boolean mo2716x() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: y */
    public int mo3029y() {
        return 850000;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public float mo3055b(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public float mo3054c(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        if (m4092cJ()) {
            return 4.7f;
        }
        return 4.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2958l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo2948E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo2946F() {
        return AbstractC0916l.m1071A().f6163bQ.renderExtraShadows && !this.f1607bT;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo2944G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo2942H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public boolean mo1706u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: I */
    public boolean mo2940I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public boolean mo2962d(AbstractC0244am abstractC0244am) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: J */
    public boolean mo2967J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public float mo2964a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        return super.mo2964a(abstractC0244am, 0.0f, c0188f);
    }
}
