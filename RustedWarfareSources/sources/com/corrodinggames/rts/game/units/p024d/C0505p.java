package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p.class */
public class C0505p extends AbstractC0498i {

    /* renamed from: d */
    boolean f3516d;

    /* renamed from: e */
    boolean f3517e;

    /* renamed from: f */
    float f3518f;

    /* renamed from: i */
    PointF f3521i;

    /* renamed from: j */
    Rect f3522j;

    /* renamed from: a */
    static C0934e[] f3513a = new C0934e[10];

    /* renamed from: b */
    static C0934e[] f3514b = new C0934e[10];

    /* renamed from: c */
    static C0934e f3515c = null;

    /* renamed from: g */
    static C0934e f3519g = null;

    /* renamed from: h */
    static C0934e[] f3520h = new C0934e[10];

    /* renamed from: k */
    static AbstractC0224s f3523k = new C05061(102);

    /* renamed from: l */
    static ArrayList f3524l = new ArrayList();

    static {
        f3524l.add(f3523k);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f3516d);
        streamWriter.mo1335a(this.f1639cz);
        streamWriter.mo1329a(this.f3517e);
        streamWriter.mo1335a(this.f3518f);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3410a(Reader reader) {
        this.f3516d = reader.ReadBool();
        this.f1639cz = reader.m1300g();
        this.f3517e = reader.ReadBool();
        if (reader.m1310b() >= 38) {
            this.f3518f = reader.m1300g();
        }
        super.m3478a(reader);
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3520h[this.f1609bV.m5105O()];
    }

    /* renamed from: b */
    public static void m3409b() {
        Core m1087A = Core.m1087A();
        f3515c = m1087A.f6113bO.mo221a(C0067R.drawable.laser_defence_dead);
        C0934e mo221a = m1087A.f6113bO.mo221a(C0067R.drawable.laser_defence);
        C0934e mo221a2 = m1087A.f6113bO.mo221a(C0067R.drawable.laser_defence_t2);
        f3513a = AbstractC0197n.m5082a(mo221a);
        f3514b = AbstractC0197n.m5082a(mo221a2);
        mo221a.mo50n();
        mo221a2.mo50n();
        f3519g = m1087A.f6113bO.mo221a(C0067R.drawable.unit_icon_building_turrent);
        f3520h = AbstractC0197n.m5082a(f3519g);
    }

    /* renamed from: K */
    public boolean m3414K() {
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2391a(this.f6958el, this.f6959em, this.f6960en);
        this.f3885L = f3515c;
        m447S(0);
        this.f1606bS = false;
        m1087A.f6111bM.m2776a(C0631e.f4050p, 0.8f, this.f6958el, this.f6959em);
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3515c;
        }
        if (this.f1609bV == null) {
            return f3513a[f3513a.length - 1];
        }
        if (!this.f3516d) {
            return f3513a[this.f1609bV.m5105O()];
        }
        return f3514b[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    public C0505p(boolean z) {
        super(z);
        this.f3521i = new PointF();
        this.f3522j = new Rect();
        m2688a(f3513a[0], 2);
        this.f1639cz = 1.0f;
        this.f1621ch = 19.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 500.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = f3513a[f3513a.length - 1];
        this.f3426n.m5874a(0, 0, 1, 1);
        this.f3427o.m5874a(0, 0, 1, 1);
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        float f2;
        super.mo1762a(f);
        if (!m4751bS() || this.f1607bT) {
            return;
        }
        Core.m1087A();
        float f3 = 4.0E-4f * f;
        if (this.f3516d) {
            f3 += 2.0E-4f * f;
        }
        this.f1639cz = C0758f.m2210a(this.f1639cz, 1.0f, f3);
        if (this.f1639cz >= 1.0f) {
            this.f3517e = false;
        }
        this.f3518f -= f;
        this.f3521i.m5878a(mo3156E(0));
        if (this.f1639cz > 0.0f && !this.f3517e) {
            if (!this.f3516d) {
                f2 = 0.11f;
            } else {
                f2 = 0.05f;
            }
            if (m3411a(this, this.f3521i.f227a, this.f3521i.f228b, this.f6960en, mo3035m(), f2)) {
                this.f3518f = 3.0f;
            }
            if (this.f1639cz < 0.0f) {
                this.f1639cz = 0.0f;
                this.f3517e = true;
            }
        }
        if (this.f3517e) {
            this.f3431s = 1;
        } else {
            this.f3431s = 0;
        }
    }

    /* renamed from: a */
    public static boolean m3411a(AbstractC0623y abstractC0623y, float f, float f2, float f3, float f4, float f5) {
        Core m1087A = Core.m1087A();
        float f6 = f4 * f4;
        Object[] m534a = C0188f.f1083a.m534a();
        int i = C0188f.f1083a.f6894a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f = (C0188f) m534a[i2];
            if (!c0188f.f1001A && !c0188f.f1003C && ((c0188f.f1010J > 7.0f || (c0188f.f1010J > 2.0f && c0188f.f994t > 8.0f)) && !c0188f.f1071aS && ((c0188f.f6958el - f) * (c0188f.f6958el - f)) + ((c0188f.f6959em - f2) * (c0188f.f6959em - f2)) < f6 && c0188f.f6960en >= -1.0f)) {
                boolean z = false;
                if (c0188f.f986l != null && abstractC0623y.f1609bV.m5042d(c0188f.f986l.f1609bV)) {
                    z = true;
                }
                if (!z && c0188f.f984j != null && abstractC0623y.f1609bV.m5054c(c0188f.f984j.f1609bV)) {
                    z = true;
                }
                if (z) {
                    C0745e m2388a = m1087A.f6116bR.m2388a(f, f2, f3, c0188f.f6958el, c0188f.f6959em, c0188f.f6960en);
                    if (m2388a != null) {
                        m2388a.f4766W = 10.0f;
                        m2388a.f4767X = m2388a.f4766W;
                    }
                    C0745e m2365b = m1087A.f6116bR.m2365b(f, f2, f3, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                    if (m2365b != null) {
                        m2365b.f4760Q = 0.0f;
                        m2365b.f4761R = 0.0f;
                        m2365b.f4786aq = 4;
                        m2365b.f4766W = 39.0f;
                        m2365b.f4767X = m2365b.f4766W;
                        m2365b.f4736s = true;
                        m2365b.f4749F = 1.3f;
                        m2365b.f4751H = 1.1f;
                        m2365b.f4750G = 0.7f;
                    }
                    c0188f.f1008H -= 1.01f;
                    if (c0188f.f1008H <= 0.0f) {
                        c0188f.m5195d();
                        C0745e m2365b2 = m1087A.f6116bR.m2365b(c0188f.f6958el, c0188f.f6959em, c0188f.f6960en, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                        if (m2365b2 != null) {
                            m2365b2.f4760Q = 0.0f;
                            m2365b2.f4761R = 0.0f;
                            m2365b2.f4786aq = 4;
                            m2365b2.f4766W = 23.0f;
                            m2365b2.f4767X = m2365b2.f4766W;
                            m2365b2.f4736s = true;
                            m2365b2.f4749F = 0.9f;
                            m2365b2.f4751H = 0.5f;
                            m2365b2.f4750G = 0.2f;
                        }
                        m1087A.f6111bM.m2775a(C0631e.f4066F, 0.2f, 1.0f + C0758f.m2136c(-0.07f, 0.07f), c0188f.f6958el, c0188f.f6959em);
                    }
                    abstractC0623y.f1639cz -= f5;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public PointF mo3156E(int i) {
        f3985bf.m5879a(this.f6958el, this.f6959em - 13.0f);
        return f3985bf;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: m */
    public float mo3035m() {
        if (!this.f3516d) {
            return 160.0f;
        }
        return 210.0f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 4.0f;
    }

    /* renamed from: b */
    public boolean m3408b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        return super.mo3049c(f);
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1759y;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 1.0f;
    }

    /* renamed from: bV */
    public float mo3289bV() {
        if (this.f1639cz != 1.0f) {
            return this.f1639cz;
        }
        return super.mo3289bV();
    }

    /* renamed from: bW */
    public boolean mo3288bW() {
        return this.f3517e;
    }

    /* renamed from: bd */
    public float m3407bd() {
        return 1.0f;
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        if (c0499j.f3496j.equals(f3523k.m4910N())) {
            mo3356a(2);
            m3004W();
        }
    }

    /* renamed from: cl */
    public C0208c m3402cl() {
        if (!this.f3516d) {
            return f3523k.m4910N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: V */
    public int m3413V() {
        if (this.f3516d) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
        if (i == 1) {
            this.f3516d = false;
        } else if (i == 2 && !this.f3516d) {
            this.f3516d = true;
            this.f1633ct += 900.0f;
            this.f1632cs += 900.0f;
        }
        m3008S();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.p$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/p$1.class */
    final class C05061 extends AbstractC0228w {
        C05061(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return C0820a.m1731a("units.laserDefence.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("units.laserDefence.upgrade.name", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return EnumC0249ar.f1759y.m4615c(2);
        }

        /* renamed from: K */
        public float mo3369K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0505p c0505p = (C0505p) abstractC0244am;
            if (c0505p.f3516d || c0505p.mo3438a(m4910N(), z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            if (((C0505p) abstractC0244am).f3516d) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1467c;
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f3524l;
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
        C1117y.m470a(this, mo3035m());
    }

    /* renamed from: cX */
    public float m3405cX() {
        return Core.m1087A().f6110bL.f785n;
    }

    /* renamed from: cY */
    public float m3404cY() {
        return Core.m1087A().f6110bL.f786o;
    }

    /* renamed from: cZ */
    public float m3403cZ() {
        return super.m4708cZ() - 8.0f;
    }
}
