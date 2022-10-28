package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/e.class */
public class C0489e extends AbstractC0498i {

    /* renamed from: a */
    static C0934e f3432a = null;

    /* renamed from: b */
    static C0934e[] f3433b = new C0934e[10];

    /* renamed from: c */
    static C0934e f3434c = null;

    /* renamed from: d */
    static C0934e f3435d = null;

    /* renamed from: e */
    float f3436e;

    /* renamed from: f */
    public float f3437f;

    /* renamed from: g */
    public float f3438g;

    /* renamed from: h */
    public int f3439h;

    /* renamed from: i */
    public float f3440i;

    /* renamed from: j */
    public float f3441j;

    /* renamed from: k */
    float f3442k;

    /* renamed from: l */
    int f3443l;

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f3436e);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3524a(Reader reader) {
        this.f3436e = reader.m1300g();
        super.m3478a(reader);
    }

    /* renamed from: b */
    public static void m3522b() {
        Core m1087A = Core.m1087A();
        f3432a = m1087A.f6113bO.mo221a(C0067R.drawable.base);
        f3434c = m1087A.f6113bO.mo221a(C0067R.drawable.base_dead);
        f3435d = m1087A.f6113bO.mo221a(C0067R.drawable.base_back);
        f3433b = AbstractC0197n.m5082a(f3432a);
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1739e;
    }

    /* renamed from: K */
    public boolean m3526K() {
        Core m1087A = Core.m1087A();
        this.f3885L = f3434c;
        this.f3425m = null;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1505d);
        float f = this.f6958el;
        float f2 = this.f6959em;
        m1087A.f6116bR.m2364b(EnumC0748h.f4836e);
        C0745e m2385a = m1087A.f6116bR.m2385a(f, f2, this.f6960en, Color.m5948a(255, 255, 255, 255));
        if (m2385a != null) {
            m2385a.f4751H = 8.0f;
            m2385a.f4750G = 5.0f;
            m2385a.f4749F = 0.9f;
            m2385a.f4766W = 20.0f;
            m2385a.f4767X = m2385a.f4766W;
            m2385a.f4736s = true;
        }
        m1087A.f6116bR.m2364b(EnumC0748h.f4836e);
        C0745e m2361c = m1087A.f6116bR.m2361c(f, f2, 0.0f, -1127220);
        if (m2361c != null) {
            m2361c.f4751H = 0.2f;
            m2361c.f4750G = 2.0f;
            m2361c.f4788as = (short) 2;
            m2361c.f4766W = 45.0f;
            m2361c.f4767X = m2361c.f4766W;
            m2361c.f4765V = 0.0f;
        }
        m1087A.f6116bR.m2389a(this.f6958el, this.f6959em, this.f6960en, 40.0f, 70.0f);
        C0746f.m2348a(this.f6958el, this.f6959em);
        C0746f.m2340b(this.f6958el, this.f6959em).f4795a = 800.0f;
        return true;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
    }

    /* renamed from: S */
    public void m3525S() {
        super.m3008S();
        if (this.f1607bT) {
            this.f3425m = null;
        } else {
            this.f3425m = f3435d;
        }
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3434c;
        }
        return f3433b[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    public C0489e(boolean z) {
        super(z);
        this.f3442k = 20.0f;
        this.f3443l = 0;
        this.f3885L = f3432a;
        this.f3425m = f3435d;
        m2693T(53);
        m2692U(68);
        this.f1621ch = 30.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 4000.0f;
        this.f1632cs = this.f1633ct;
        m447S(3);
        this.f3426n.m5874a(-1, -1, 1, 1);
        this.f3427o.m5874a(-1, -1, 1, 2);
    }

    /* renamed from: cE */
    public RectF m3517cE() {
        RectF cE = super.m4729cE();
        cE.m5862a(6.0f, 0.0f);
        return cE;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        Core.m1087A();
        super.mo1762a(f);
        if (!m4751bS() || this.f1607bT) {
            return;
        }
        this.f3442k = C0758f.m2211a(this.f3442k, f);
        if (this.f3442k == 0.0f) {
            this.f3442k = 5.0f;
            this.f3443l++;
            if (this.f3443l > 6) {
                this.f3443l = 0;
                this.f3442k = 70.0f;
            }
            if (this.f3443l <= 3) {
                this.f3431s = this.f3443l;
            } else {
                this.f3431s = 6 - this.f3443l;
            }
        }
        this.f3437f += f;
        this.f3439h++;
        this.f3440i += 10.0f;
        if (this.f3441j > f) {
            this.f3441j = f;
        }
        this.f3438g += f;
        this.f3436e += f;
        if (this.f3436e > AbstractC0197n.f1378ao - 0.1f) {
            this.f3436e -= AbstractC0197n.f1378ao;
            this.f1609bV.m5073b(m3516cw() * (AbstractC0197n.f1378ao / AbstractC0197n.f1377an));
        }
    }

    /* renamed from: cw */
    public float m3516cw() {
        return 18.0f;
    }

    /* renamed from: q */
    public float mo3150q(int i) {
        return 70.0f;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        C0188f m5205a = C0188f.m5205a(this, this.f6958el, this.f6959em);
        PointF K = m3013K(i);
        m5205a.f1011K = K.f227a;
        m5205a.f1012L = K.f228b;
        m5205a.f1043ar = Color.m5948a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m5205a.f1021U = mo3150q(i);
        m5205a.f986l = abstractC0244am;
        m5205a.f982h = 180.0f;
        m5205a.f994t = 2.0f;
        m5205a.f992r = 5.0f;
        m5205a.f1059aH = true;
        m5205a.f1064aM = true;
        m5205a.f1068aQ = true;
        m5205a.f1058aG = true;
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2377a(m5205a, -1118720);
        m1087A.f6111bM.m2776a(C0631e.f4047m, 0.8f, this.f6958el, this.f6959em);
    }

    /* renamed from: m */
    public float mo3035m() {
        return 280.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 70.0f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 999.0f;
    }

    /* renamed from: b */
    public boolean m3521b(int i, float f) {
        return false;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return true;
    }

    /* renamed from: a */
    public static void m3523a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(EnumC0249ar.f1742h, 1));
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return mo1758r().mo4484a(m3005V());
    }

    /* renamed from: a */
    public float mo3052a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        if (f > 2500.0f) {
            f = 2500.0f;
        }
        return super.mo3052a(abstractC0244am, f, c0188f);
    }

    /* renamed from: bJ */
    public boolean m3520bJ() {
        return true;
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
        C1117y.m470a(this, mo3035m());
    }

    /* renamed from: s */
    public int m3515s() {
        return 20;
    }

    /* renamed from: bp */
    public int m3519bp() {
        return 35;
    }
}
