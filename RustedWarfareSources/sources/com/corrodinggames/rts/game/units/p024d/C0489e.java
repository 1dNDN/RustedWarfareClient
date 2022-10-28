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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f3436e);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3436e = reader.m1285g();
        super.mo2291a(reader);
    }

    /* renamed from: b */
    public static void m3372b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3432a = m1072A.f6113bO.mo221a(C0067R.drawable.base);
        f3434c = m1072A.f6113bO.mo221a(C0067R.drawable.base_dead);
        f3435d = m1072A.f6113bO.mo221a(C0067R.drawable.base_back);
        f3433b = AbstractC0197n.m4627a(f3432a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1739e;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3274K() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f3885L = f3434c;
        this.f3425m = null;
        m447S(0);
        this.f1606bS = false;
        m2924a(EnumC0233ab.f1505d);
        float f = this.f6957el;
        float f2 = this.f6958em;
        m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
        C0745e m2333a = m1072A.f6116bR.m2333a(f, f2, this.f6959en, Color.m5435a(255, 255, 255, 255));
        if (m2333a != null) {
            m2333a.f4735H = 8.0f;
            m2333a.f4734G = 5.0f;
            m2333a.f4733F = 0.9f;
            m2333a.f4750W = 20.0f;
            m2333a.f4751X = m2333a.f4750W;
            m2333a.f4725s = true;
        }
        m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
        C0745e m2309c = m1072A.f6116bR.m2309c(f, f2, 0.0f, -1127220);
        if (m2309c != null) {
            m2309c.f4735H = 0.2f;
            m2309c.f4734G = 2.0f;
            m2309c.f4792as = (short) 2;
            m2309c.f4750W = 45.0f;
            m2309c.f4751X = m2309c.f4750W;
            m2309c.f4749V = 0.0f;
        }
        m1072A.f6116bR.m2337a(this.f6957el, this.f6958em, this.f6959en, 40.0f, 70.0f);
        C0746f.m2296a(this.f6957el, this.f6958em);
        C0746f.m2288b(this.f6957el, this.f6958em).f4795a = 800.0f;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3174a(int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: S */
    public void mo3303S() {
        super.mo3303S();
        if (this.f1607bT) {
            this.f3425m = null;
        } else {
            this.f3425m = f3435d;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3434c;
        }
        return f3433b[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    public C0489e(boolean z) {
        super(z);
        this.f3442k = 20.0f;
        this.f3443l = 0;
        this.f3885L = f3432a;
        this.f3425m = f3435d;
        m2639T(53);
        m2638U(68);
        this.f1621ch = 30.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 4000.0f;
        this.f1632cs = this.f1633ct;
        m447S(3);
        this.f3426n.m5364a(-1, -1, 1, 1);
        this.f3427o.m5364a(-1, -1, 1, 2);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cE */
    public RectF mo3370cE() {
        RectF cE = super.mo3370cE();
        cE.m5352a(6.0f, 0.0f);
        return cE;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        LoggerMaybe.m1072A();
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
            return;
        }
        this.f3442k = C0758f.m2159a(this.f3442k, f);
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
            this.f1609bV.m4618b(mo3354cw() * (AbstractC0197n.f1378ao / AbstractC0197n.f1377an));
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cw */
    public float mo3354cw() {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: q */
    public float mo3060q(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        C0188f m4718a = C0188f.m4718a(this, this.f6957el, this.f6958em);
        PointF K = mo3237K(i);
        m4718a.f1011K = K.f227a;
        m4718a.f1012L = K.f228b;
        m4718a.f1043ar = Color.m5435a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4718a.f1021U = mo3060q(i);
        m4718a.f986l = abstractC0244am;
        m4718a.f982h = 180.0f;
        m4718a.f994t = 2.0f;
        m4718a.f992r = 5.0f;
        m4718a.f1059aH = true;
        m4718a.f1064aM = true;
        m4718a.f1068aQ = true;
        m4718a.f1058aG = true;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6116bR.m2325a(m4718a, -1118720);
        m1072A.f6111bM.m2722a(C0631e.f4047m, 0.8f, this.f6957el, this.f6958em);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2978m() {
        return 280.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2992b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2991c(int i) {
        return 999.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public boolean mo3295b(int i, float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0498i, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2979l() {
        return true;
    }

    /* renamed from: a */
    public static void m3373a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(EnumC0249ar.f1742h, 1));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3068N() {
        return mo3371c().mo4262a(mo3273V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public float mo2994a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        if (f > 2500.0f) {
            f = 2500.0f;
        }
        return super.mo2994a(abstractC0244am, f, c0188f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bJ */
    public boolean mo3269bJ() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo2283e(float f) {
        super.mo2283e(f);
        C1117y.m470a(this, mo2978m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: s */
    public int mo3169s() {
        return 20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: bp */
    public int mo3356bp() {
        return 35;
    }
}
