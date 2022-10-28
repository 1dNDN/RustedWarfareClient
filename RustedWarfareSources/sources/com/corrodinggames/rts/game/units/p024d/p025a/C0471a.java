package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p024d.C0499j;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public C0934e mo2986v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3373d[this.f1609bV.m4726O()];
    }

    /* renamed from: b */
    public static void m3453b() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        f3370a = m1079A.f6113bO.mo225a(C0067R.drawable.anti_air_top);
        f3371b = m1079A.f6113bO.mo225a(C0067R.drawable.anti_air_top_l2);
        f3372c = m1079A.f6113bO.mo225a(C0067R.drawable.unit_icon_building_air_turrent);
        f3373d = AbstractC0197n.m4703a(f3372c);
    }

    public C0471a(boolean z) {
        super(z);
        this.f1633ct = 800.0f;
        this.f1632cs = this.f1633ct;
    }

    /* renamed from: m */
    public float mo2987m() {
        if (!this.f3376j) {
            return 250.0f;
        }
        return 320.0f;
    }

    /* renamed from: b */
    public float mo3002b(int i) {
        if (!this.f3376j) {
            return 80.0f;
        }
        return 70.0f;
    }

    /* renamed from: e */
    public float mo2994e(int i) {
        if (!this.f3376j) {
            return super.mo2994e(i);
        }
        if (i == 2) {
            return 25.0f;
        }
        return super.mo2994e(i);
    }

    /* renamed from: E */
    public PointF mo3086E(int i) {
        if (!this.f3376j || i == 0) {
            return super.mo3086E(i);
        }
        float f = mo3013E() ? this.f1618ce : this.f1649cJ[i].f1712a;
        PointF G = mo3102G(i);
        float f2 = f + (i == 1 ? -30.0f : 30.0f);
        f3985bf.m5472a(G.f227a + (C0758f.m2043i(f2) * 10.0f), G.f228b + (C0758f.m2048h(f2) * 10.0f));
        return f3985bf;
    }

    /* renamed from: a */
    public void mo3003a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3086E = mo3086E(i);
        C0188f m4822a = C0188f.m4822a(this, mo3086E.f227a, mo3086E.f228b);
        PointF K = mo3248K(i);
        m4822a.f1011K = K.f227a;
        m4822a.f1012L = K.f228b;
        m4822a.f994t = 0.3f;
        m4822a.f992r = 6.0f;
        if (!this.f3376j) {
            m4822a.f1043ar = Color.m5538a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m4822a.f1021U = 60.0f;
            m4822a.f982h = 220.0f;
        } else {
            m4822a.f1043ar = Color.m5538a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50, 50);
            m4822a.f1021U = 60.0f;
            m4822a.f982h = 250.0f;
            m4822a.f994t = 0.5f;
            m4822a.f992r = 7.0f;
        }
        m4822a.f1016P = (short) 4;
        m4822a.f998x = 1.0f;
        m4822a.f986l = abstractC0244am;
        m4822a.f1059aH = false;
        m4822a.f1060aI = 0.0f;
        m4822a.f1061aJ = 0.0f;
        m4822a.f1064aM = true;
        m4822a.f1068aQ = true;
        m4822a.f1058aG = true;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6111bM.m2727a(C0631e.f4047m, 0.3f, 1.0f + C0758f.m2087c(-0.07f, 0.07f), mo3086E.f227a, mo3086E.f228b);
        m1079A.f6116bR.m2327a(m4822a, -1118720);
        m1079A.f6116bR.m2335a(mo3086E.f227a, mo3086E.f228b, this.f6959en, -1127220);
    }

    /* renamed from: c */
    public AbstractC0249ar mo5755r() {
        if (this.f3376j) {
            return AbstractC0249ar.f1788T;
        }
        return AbstractC0249ar.f1749g;
    }

    /* renamed from: d */
    public C0934e mo2997d(int i) {
        if (!this.f3376j) {
            return f3370a;
        }
        return f3371b;
    }

    /* renamed from: af */
    public boolean mo3078af() {
        return true;
    }

    /* renamed from: ag */
    public boolean mo3077ag() {
        return false;
    }

    /* renamed from: s */
    public void mo3450s(float f) {
        if (this.f1649cJ[0].m4388a()) {
            this.f1649cJ[0].f1712a += mo3000c(0) * f * 0.1f;
        }
    }

    /* renamed from: g */
    public float mo2992g(int i) {
        return 9.0f;
    }

    /* renamed from: c */
    public float mo3000c(int i) {
        return 6.0f;
    }

    /* renamed from: B */
    public float mo3016B() {
        return 1.0f;
    }

    /* renamed from: u */
    public boolean mo3449u(int i) {
        if (!this.f3376j) {
            return super.mo3449u(i);
        }
        if (i == 0) {
            return false;
        }
        return super.mo3449u(i);
    }

    /* renamed from: v */
    public int mo3448v(int i) {
        if (!this.f3376j) {
            return -1;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        return -1;
    }

    /* renamed from: bl */
    public int mo3097bl() {
        return 3;
    }

    /* renamed from: r */
    public boolean mo3451r(int i) {
        if (!this.f3376j && i > 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        if (c0499j.f3494j.equals(f3374e.m4582N())) {
            mo3185a(2);
            m2956W();
        }
    }

    /* renamed from: cl */
    public C0208c mo3269cl() {
        if (!this.f3376j) {
            return f3374e.m4582N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public void mo3454a(ArrayList arrayList) {
        arrayList.clear();
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.a.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/a$1.class */
    final class C04721 extends AbstractC0228w {
        C04721(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3030g() {
            return false;
        }

        /* renamed from: a */
        public String mo3040a() {
            return "-Increases HP, attack damage, and range";
        }

        /* renamed from: b */
        public String mo3037b() {
            return "Upgrade";
        }

        /* renamed from: c */
        public int mo3034c() {
            return 1200;
        }

        /* renamed from: K */
        public float mo3268K() {
            return 0.001f;
        }

        /* renamed from: a */
        public boolean mo3038a(AbstractC0244am abstractC0244am, boolean z) {
            C0473b c0473b = (C0473b) abstractC0244am;
            if (c0473b.f3376j || c0473b.mo3319a(m4582N(), z) > 0) {
                return false;
            }
            return super.mo3038a(abstractC0244am, z);
        }

        /* renamed from: b */
        public boolean mo3036b(AbstractC0244am abstractC0244am) {
            if (((C0473b) abstractC0244am).f3376j) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        public AbstractC0249ar mo5754i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3031f() {
            return EnumC0225t.f1467c;
        }
    }

    /* renamed from: a */
    public void mo3185a(int i) {
        if (i == 1) {
            this.f3376j = false;
        } else if (i == 2 && !this.f3376j) {
            this.f3376j = true;
            this.f1633ct += 600.0f;
            this.f1632cs += 600.0f;
        }
    }

    /* renamed from: N */
    public ArrayList mo3081N() {
        return f3375f;
    }
}
