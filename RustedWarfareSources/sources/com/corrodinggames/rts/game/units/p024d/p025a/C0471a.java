package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p024d.C0499j;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a.class */
public class C0471a extends C0473b {

    /* renamed from: a */
    static C0934e f3370a = null;

    /* renamed from: b */
    static C0934e f3371b = null;

    /* renamed from: c */
    static C0934e f3372c = null;

    /* renamed from: d */
    static C0934e[] f3373d = new C0934e[10];

    /* renamed from: e */
    public static AbstractC0224s f3374e = new C04721(102);

    /* renamed from: f */
    static ArrayList f3375f = new ArrayList();

    static {
        f3375f.add(f3374e);
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3373d[this.f1609bV.m5105O()];
    }

    /* renamed from: b */
    public static void m3622b() {
        Core m1087A = Core.m1087A();
        f3370a = m1087A.f6113bO.mo221a(C0067R.drawable.anti_air_top);
        f3371b = m1087A.f6113bO.mo221a(C0067R.drawable.anti_air_top_l2);
        f3372c = m1087A.f6113bO.mo221a(C0067R.drawable.unit_icon_building_air_turrent);
        f3373d = AbstractC0197n.m5082a(f3372c);
    }

    public C0471a(boolean z) {
        super(z);
        this.f1633ct = 800.0f;
        this.f1632cs = this.f1633ct;
    }

    /* renamed from: m */
    public float mo3035m() {
        if (!this.f3384j) {
            return 250.0f;
        }
        return 320.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        if (!this.f3384j) {
            return 80.0f;
        }
        return 70.0f;
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        if (!this.f3384j) {
            return super.mo3042e(i);
        }
        if (i == 2) {
            return 25.0f;
        }
        return super.mo3042e(i);
    }

    /* renamed from: E */
    public PointF mo3156E(int i) {
        if (!this.f3384j || i == 0) {
            return super.mo3156E(i);
        }
        float f = mo3061E() ? this.f1618ce : this.f1649cJ[i].f1712a;
        PointF G = mo3176G(i);
        float f2 = f + (i == 1 ? -30.0f : 30.0f);
        f3985bf.m5879a(G.f227a + (C0758f.m2092i(f2) * 10.0f), G.f228b + (C0758f.m2097h(f2) * 10.0f));
        return f3985bf;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3156E = mo3156E(i);
        C0188f m5205a = C0188f.m5205a(this, mo3156E.f227a, mo3156E.f228b);
        PointF K = m3013K(i);
        m5205a.f1011K = K.f227a;
        m5205a.f1012L = K.f228b;
        m5205a.f994t = 0.3f;
        m5205a.f992r = 6.0f;
        if (!this.f3384j) {
            m5205a.f1043ar = Color.m5948a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m5205a.f1021U = 60.0f;
            m5205a.f982h = 220.0f;
        } else {
            m5205a.f1043ar = Color.m5948a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50, 50);
            m5205a.f1021U = 60.0f;
            m5205a.f982h = 250.0f;
            m5205a.f994t = 0.5f;
            m5205a.f992r = 7.0f;
        }
        m5205a.f1016P = (short) 4;
        m5205a.f998x = 1.0f;
        m5205a.f986l = abstractC0244am;
        m5205a.f1059aH = false;
        m5205a.f1060aI = 0.0f;
        m5205a.f1061aJ = 0.0f;
        m5205a.f1064aM = true;
        m5205a.f1068aQ = true;
        m5205a.f1058aG = true;
        Core m1087A = Core.m1087A();
        m1087A.f6111bM.m2775a(C0631e.f4047m, 0.3f, 1.0f + C0758f.m2136c(-0.07f, 0.07f), mo3156E.f227a, mo3156E.f228b);
        m1087A.f6116bR.m2377a(m5205a, -1118720);
        m1087A.f6116bR.m2385a(mo3156E.f227a, mo3156E.f228b, this.f6960en, -1127220);
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        if (this.f3384j) {
            return EnumC0249ar.f1780T;
        }
        return EnumC0249ar.f1741g;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        if (!this.f3384j) {
            return f3370a;
        }
        return f3371b;
    }

    /* renamed from: af */
    public boolean mo3160af() {
        return true;
    }

    /* renamed from: ag */
    public boolean mo4430ag() {
        return false;
    }

    /* renamed from: s */
    public void m3618s(float f) {
        if (this.f1649cJ[0].m4639a()) {
            this.f1649cJ[0].f1712a += mo3048c(0) * f * 0.1f;
        }
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 9.0f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 6.0f;
    }

    /* renamed from: B */
    public float mo3064B() {
        return 1.0f;
    }

    /* renamed from: u */
    public boolean m3617u(int i) {
        if (!this.f3384j) {
            return super.m2792u(i);
        }
        if (i == 0) {
            return false;
        }
        return super.m2792u(i);
    }

    /* renamed from: v */
    public int m3616v(int i) {
        if (!this.f3384j) {
            return -1;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        return -1;
    }

    /* renamed from: bl */
    public int mo3169bl() {
        return 3;
    }

    /* renamed from: r */
    public boolean m3619r(int i) {
        if (!this.f3384j && i > 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        if (c0499j.f3496j.equals(f3374e.m4910N())) {
            mo3356a(2);
            m3004W();
        }
    }

    /* renamed from: cl */
    public C0208c m3620cl() {
        if (!this.f3384j) {
            return f3374e.m4910N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public void m3624a(ArrayList arrayList) {
        arrayList.clear();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a$1.class */
    final class C04721 extends AbstractC0228w {
        C04721(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Increases HP, attack damage, and range";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Upgrade";
        }

        /* renamed from: c */
        public int mo3082c() {
            return 1200;
        }

        /* renamed from: K */
        public float mo3369K() {
            return 0.001f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0473b c0473b = (C0473b) abstractC0244am;
            if (c0473b.f3384j || c0473b.mo3438a(m4910N(), z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            if (((C0473b) abstractC0244am).f3384j) {
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

    /* renamed from: a */
    public void mo3356a(int i) {
        if (i == 1) {
            this.f3384j = false;
        } else if (i == 2 && !this.f3384j) {
            this.f3384j = true;
            this.f1633ct += 600.0f;
            this.f1632cs += 600.0f;
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f3375f;
    }
}
