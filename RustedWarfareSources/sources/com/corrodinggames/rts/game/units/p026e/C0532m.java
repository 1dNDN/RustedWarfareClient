package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/m.class */
public class C0532m extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3667a = null;

    /* renamed from: b */
    static C0934e f3668b = null;

    /* renamed from: c */
    static C0934e f3669c = null;

    /* renamed from: d */
    static C0934e[] f3670d = new C0934e[10];

    /* renamed from: e */
    Rect f3671e;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.megaTank;
    }

    /* renamed from: c */
    public static void m3120c() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        f3668b = m1071A.f6161bO.mo221a(C0067R.drawable.mega_tank);
        f3667a = m1071A.f6161bO.mo221a(C0067R.drawable.mega_tank_dead);
        f3669c = m1071A.f6161bO.mo221a(C0067R.drawable.mega_tank_turret);
        f3670d = AbstractC0197n.m4304a(f3668b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f3667a;
        }
        return f3670d[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return f3669c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2300b(this.f6958el, this.f6959em, this.f6960en);
        this.f3886L = f3667a;
        m447S(0);
        this.f1606bS = false;
        m1071A.f6159bM.m2703a(C0631e.f4049o, 0.8f, this.f6958el, this.f6959em);
        mo2787bq();
        return true;
    }

    public C0532m(boolean z) {
        super(z);
        this.f3671e = new Rect();
        m2620T(20);
        m2619U(25);
        this.f1621ch = 12.0f;
        this.f1622ci = this.f1621ch + 1.0f;
        this.f1633ct = 550.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f3668b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3027bN() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        if (!abstractC0244am.mo2959i()) {
            PointF E = mo2947E(i);
            C0188f m4395a = C0188f.m4395a(this, E.f227a, E.f228b);
            m4395a.f1051ar = Color.m5106a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            m4395a.f1028U = 50.0f;
            m4395a.f993l = abstractC0244am;
            m4395a.f989h = 60.0f;
            m4395a.f1001t = 3.0f;
            m4395a.f1005x = 2.0f;
            m4395a.f1076aQ = true;
            AbstractC0916l m1071A = AbstractC0916l.m1071A();
            m1071A.f6164bR.m2315a(E.f227a, E.f228b, this.f6960en, -1127220);
            m1071A.f6164bR.m2320a(E.f227a, E.f228b, this.f6960en, this.f1649cJ[i].f1712a);
            m1071A.f6159bM.m2703a(C0631e.f4055u, 0.3f, this.f6958el, this.f6959em);
            return;
        }
        C0188f m4395a2 = C0188f.m4395a(this, this.f6958el, this.f6959em);
        m4395a2.f1051ar = Color.m5106a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4395a2.f1028U = 40.0f;
        m4395a2.f993l = abstractC0244am;
        m4395a2.f989h = 190.0f;
        m4395a2.f1001t = 4.0f;
        m4395a2.f1067aH = true;
        m4395a2.f1068aI = 10.0f;
        m4395a2.f1069aJ = 15.0f;
        m4395a2.f1072aM = true;
        m4395a2.f1076aQ = true;
        AbstractC0916l.m1071A().f6159bM.m2703a(C0631e.f4047m, 0.2f, this.f6958el, this.f6959em);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        if (!super.mo437c(f)) {
            return false;
        }
        C1117y.m462a((AbstractC0623y) this);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2958l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo2846af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 12.0f;
    }
}
