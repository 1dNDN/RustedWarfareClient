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
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.builder;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3036b() {
        return this.f3589i;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3035c() {
        return this.f3590j;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0934e mo2957v() {
        if (this.f1609bV.f1317k == -1) {
            return null;
        }
        return f3588h[this.f1609bV.m4327O()];
    }

    /* renamed from: K */
    public static void m3168K() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3581a = m1071A.f6161bO.mo221a(C0067R.drawable.builder);
        f3582b = m1071A.f6161bO.mo221a(C0067R.drawable.builder_dead);
        f3583c = m4116a(f3581a, f3581a.mo386m(), f3581a.mo387l());
        f3584d = AbstractC0197n.m4304a(f3581a);
        f3585e = m1071A.f6161bO.mo221a(C0067R.drawable.builder_charge);
        f3586f = m1071A.f6161bO.mo221a(C0067R.drawable.builder_decharge);
        f3587g = m1071A.f6161bO.mo221a(C0067R.drawable.unit_icon_builder);
        f3588h = AbstractC0197n.m4304a(f3587g);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo2902a(AbstractC0244am abstractC0244am) {
        if (!abstractC0244am.mo3171q() && abstractC0244am.mo3288bI()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3582b;
        }
        return f3584d[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3583c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A();
        this.f3886L = f3582b;
        m447S(0);
        this.f1606bS = false;
        m2905a(EnumC0233ab.small);
        return true;
    }

    public C0519b(boolean z) {
        super(z);
        this.f3589i = new PointF[6];
        this.f3590j = new PointF[this.f3589i.length];
        f3591k = new Paint();
        f3591k.m5091a(40, 0, 255, 0);
        f3591k.mo893a(true);
        f3591k.m5094a(2.0f);
        f3591k.m5086a(Paint.Cap.ROUND);
        f3592l = new Paint();
        f3592l.m5083a(f3591k);
        f3592l.m5091a(55, 255, 60, 60);
        f3593m = new Paint();
        f3593m.m5091a(60, 255, 255, 255);
        m2620T(20);
        m2619U(20);
        this.f1621ch = 10.0f;
        this.f1622ci = this.f1621ch + 2.0f;
        this.f1633ct = 170.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3581a;
        for (int i = 0; i < this.f3589i.length; i++) {
            this.f3589i[i] = new PointF();
            this.f3590j[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3167a(float f, InterfaceC0469d interfaceC0469d) {
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

    /* renamed from: b */
    public static void m3165b(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        AbstractC0244am m2927X = abstractC0623y.m2927X();
        if (m2927X != null) {
            boolean m2926Y = abstractC0623y.m2926Y();
            if (!m2926Y && abstractC0623y.f3971aN) {
                return;
            }
            AbstractC0916l m1071A = AbstractC0916l.m1071A();
            PointF[] mo3036b = interfaceC0469d.mo3036b();
            Paint paint = f3591k;
            if (m2926Y) {
                paint = f3592l;
            }
            C1080ai m2790bn = abstractC0623y.m2790bn();
            for (PointF pointF : mo3036b) {
                float f2 = (m2927X.f6958el + pointF.f227a) - m1071A.f6194cv;
                float f3 = ((m2927X.f6959em - m2927X.f6960en) + pointF.f228b) - m1071A.f6195cw;
                m1071A.f6161bO.mo225a((m2790bn.f6849a + (pointF.f227a * 0.15f)) - m1071A.f6194cv, (((m2790bn.f6850b - m2790bn.f6851c) + (pointF.f228b * 0.15f)) - m1071A.f6195cw) - abstractC0623y.f6960en, f2, f3, paint);
                m1071A.f6161bO.mo135k();
                m1071A.f6161bO.mo168b(f2, f3);
                m1071A.f6161bO.mo228a(0.5f, 0.5f);
                if (m2926Y) {
                    m1071A.f6161bO.mo198a(f3586f, 0.0f, 0.0f, f3593m);
                } else {
                    m1071A.f6161bO.mo198a(f3585e, 0.0f, 0.0f, f3593m);
                }
                m1071A.f6161bO.mo134l();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (!this.f1607bT) {
            m3167a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo444a(float f, boolean z) {
        super.mo444a(f, z);
        if (!this.f1607bT) {
            m3165b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo2764e(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: f */
    public float mo2762f(int i) {
        return 1.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        if (!super.mo437c(f)) {
            return false;
        }
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (!this.f1607bT) {
            float mo2764e = this.f1649cJ[0].f1717f / mo2764e(0);
            if (mo2764e != 0.0f) {
                C1080ai bn = m2790bn();
                m1071A.f6161bO.mo137i();
                m1071A.f6161bO.mo168b(bn.f6849a - m1071A.f6194cv, (bn.f6850b - bn.f6851c) - m1071A.f6195cw);
                m1071A.f6161bO.mo228a(mo2764e, mo2764e);
                if (m2926Y()) {
                    m1071A.f6161bO.mo198a(f3586f, 0.0f, 0.0f, (Paint) null);
                } else {
                    m1071A.f6161bO.mo198a(f3585e, 0.0f, 0.0f, (Paint) null);
                }
                m1071A.f6161bO.mo136j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
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
        if (m4092cJ()) {
            return 0.6f;
        }
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        if (m4092cJ()) {
            return 1.7f;
        }
        return 3.8f;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3021a(AbstractC0224s abstractC0224s, boolean z) {
    }

    /* renamed from: a */
    public static void m3166a(ArrayList arrayList, int i) {
        arrayList.add(f3594n);
        arrayList.add(new C0227v(EnumC0249ar.extractor, 1, 1));
        arrayList.add(new C0227v(EnumC0249ar.turret, 1, 2));
        arrayList.add(new C0227v(EnumC0249ar.antiAirTurret, 1, 3));
        arrayList.add(new C0227v(EnumC0249ar.landFactory, 1, 4));
        arrayList.add(new C0227v(EnumC0249ar.airFactory, 1, 5));
        arrayList.add(new C0227v(EnumC0249ar.seaFactory, 1, 6));
        arrayList.add(new C0227v(EnumC0249ar.laserDefence, 1, 7));
        arrayList.add(new C0227v(EnumC0249ar.repairbay, 1, 8));
        arrayList.add(new C0227v(EnumC0249ar.fabricator, 1, 9));
        arrayList.add(new C0227v(EnumC0249ar.experimentalLandFactory, 1, 10));
        arrayList.add(new C0227v(EnumC0249ar.NukeLaucher, 1, 14));
        arrayList.add(new C0227v(EnumC0249ar.AntiNukeLaucher, 1, 15));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3022N() {
        return mo1708r().mo3452a(mo2929V());
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
    /* renamed from: g */
    public boolean mo3033g(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }
}
