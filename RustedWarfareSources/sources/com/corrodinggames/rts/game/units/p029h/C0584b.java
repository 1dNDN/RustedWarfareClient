package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.h.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/b.class */
public class C0584b extends AbstractC0590f implements InterfaceC0469d {

    /* renamed from: f */
    PointF[] f3818f;

    /* renamed from: g */
    PointF[] f3819g;

    /* renamed from: h */
    Rect f3820h;

    /* renamed from: a */
    static C0934e f3813a = null;

    /* renamed from: b */
    static C0934e f3814b = null;

    /* renamed from: c */
    static C0934e f3815c = null;

    /* renamed from: d */
    static C0934e f3816d = null;

    /* renamed from: e */
    static C0934e[] f3817e = new C0934e[10];

    /* renamed from: i */
    static AbstractC0224s f3821i = new C0218m(false);

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0934e mo2957v() {
        if (this.f1609bV.f1317k == -1) {
            return null;
        }
        return C0519b.f3588h[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: q_ */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.builderShip;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3036b() {
        return this.f3818f;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3035c() {
        return this.f3819g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3027bN() {
        return 6000.0f;
    }

    /* renamed from: K */
    public static void m3038K() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3814b = m1071A.f6161bO.mo221a(C0067R.drawable.builder_ship);
        f3813a = m1071A.f6161bO.mo221a(C0067R.drawable.builder_ship_dead);
        f3815c = m1071A.f6161bO.mo221a(C0067R.drawable.builder_ship_turret);
        f3817e = AbstractC0197n.m4304a(f3814b);
        f3816d = m4116a(f3814b, f3814b.mo386m(), f3814b.mo387l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3813a;
        }
        return f3817e[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return f3815c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return f3816d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo2946F() {
        return AbstractC0916l.m1071A().f6163bQ.renderExtraShadows && this.f6960en > -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo2944G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo2942H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l.m1071A().f6164bR.m2300b(this.f6958el, this.f6959em, this.f6960en);
        this.f3886L = f3813a;
        m447S(0);
        this.f1606bS = false;
        return true;
    }

    public C0584b(boolean z) {
        super(z);
        this.f3818f = new PointF[6];
        this.f3819g = new PointF[this.f3818f.length];
        this.f3820h = new Rect();
        m2615b(f3814b);
        this.f1621ch = 13.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 500.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3814b;
        for (int i = 0; i < this.f3818f.length; i++) {
            this.f3818f[i] = new PointF();
            this.f3819g[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo2954B() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 3.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: w */
    public float mo2717w(int i) {
        return 0.25f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0590f, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (!this.f1607bT) {
            C0519b.m3167a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo444a(float f, boolean z) {
        super.mo444a(f, z);
        if (!this.f1607bT) {
            C0519b.m3165b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        if (!super.mo437c(f)) {
            return false;
        }
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C1117y.m462a((AbstractC0623y) this);
        if (!this.f1607bT) {
            float mo2764e = this.f1649cJ[0].f1717f / mo2764e(0);
            if (mo2764e != 0.0f) {
                PointF E = mo2947E(0);
                m1071A.f6161bO.mo137i();
                m1071A.f6161bO.mo168b(E.f227a - m1071A.f6194cv, (E.f228b - m1071A.f6195cw) - this.f6960en);
                m1071A.f6161bO.mo228a(mo2764e, mo2764e);
                if (m2926Y()) {
                    m1071A.f6161bO.mo198a(C0519b.f3586f, 0.0f, 0.0f, (Paint) null);
                } else {
                    m1071A.f6161bO.mo198a(C0519b.f3585e, 0.0f, 0.0f, (Paint) null);
                }
                m1071A.f6161bO.mo136j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2958l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2792bl() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public PointF mo2943G(int i) {
        f3990bg.m5040a(this.f6958el + (C0758f.m2030i(this.f1618ce) * 8.0f), this.f6959em + (C0758f.m2035h(this.f1618ce) * 8.0f));
        return f3990bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 120 - (i * 28);
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo2902a(AbstractC0244am abstractC0244am) {
        if (!abstractC0244am.mo3171q() && abstractC0244am.mo3288bI()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3021a(AbstractC0224s abstractC0224s, boolean z) {
    }

    /* renamed from: a */
    public static void m3037a(ArrayList arrayList, int i) {
        arrayList.add(f3821i);
        arrayList.add(new C0227v(EnumC0249ar.extractor, 1, 1));
        arrayList.add(new C0227v(EnumC0249ar.turret, 1, 2));
        arrayList.add(new C0227v(EnumC0249ar.antiAirTurret, 1, 3));
        arrayList.add(new C0227v(EnumC0249ar.landFactory, 1, 4));
        arrayList.add(new C0227v(EnumC0249ar.airFactory, 1, 5));
        arrayList.add(new C0227v(EnumC0249ar.seaFactory, 1, 6));
        arrayList.add(new C0227v(EnumC0249ar.fabricator, 1, 7));
        arrayList.add(new C0227v(EnumC0249ar.laserDefence, 1, 8));
        arrayList.add(new C0227v(EnumC0249ar.repairbay, 1, 9));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3022N() {
        return mo1708r().mo3452a(mo2929V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: y */
    public int mo3029y() {
        return 145;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: g */
    public boolean mo3033g(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public float mo3034f(InterfaceC0303as interfaceC0303as) {
        int mo3029y = mo3029y();
        int mo3450a = interfaceC0303as.mo3450a(this);
        if (mo3450a == 0 && interfaceC0303as.mo3389p()) {
            mo3450a = 110;
        }
        return mo3029y + mo3450a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public int mo3031u(AbstractC0244am abstractC0244am) {
        return (int) mo3034f(abstractC0244am.mo1708r());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public int mo3030v(AbstractC0244am abstractC0244am) {
        return (int) mo3034f(abstractC0244am.mo1708r());
    }
}
