package com.corrodinggames.rts.game.units.p024d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c.class */
public class C0485c extends AbstractC0498i {

    /* renamed from: c */
    boolean f3415c;

    /* renamed from: d */
    int f3416d;

    /* renamed from: e */
    float f3417e;

    /* renamed from: h */
    PointF f3420h;

    /* renamed from: i */
    Rect f3421i;

    /* renamed from: a */
    static C0934e[] f3413a = new C0934e[10];

    /* renamed from: b */
    static C0934e f3414b = null;

    /* renamed from: f */
    static C0934e f3418f = null;

    /* renamed from: g */
    static C0934e[] f3419g = new C0934e[10];

    /* renamed from: j */
    static AbstractC0224s f3422j = new C04861(145);

    /* renamed from: k */
    static AbstractC0224s f3423k = new C04872(144);

    /* renamed from: l */
    static ArrayList f3424l = new ArrayList();

    static {
        f3424l.add(f3422j);
        f3424l.add(f3423k);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f3415c);
        streamWriter.WriteInteger(this.f3416d);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3554a(Reader reader) {
        this.f3415c = reader.ReadBool();
        if (reader.m1310b() >= 30) {
            this.f3416d = reader.ReadInt();
        }
        super.m3478a(reader);
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3419g[this.f1609bV.m5105O()];
    }

    /* renamed from: b */
    public static void m3552b() {
        Core m1087A = Core.m1087A();
        f3414b = m1087A.f6113bO.mo221a(C0067R.drawable.antinuke_launcher_dead);
        C0934e mo221a = m1087A.f6113bO.mo221a(C0067R.drawable.antinuke_launcher);
        f3413a = AbstractC0197n.m5082a(mo221a);
        mo221a.mo50n();
        f3418f = m1087A.f6113bO.mo221a(C0067R.drawable.unit_icon_building_turrent);
        f3419g = AbstractC0197n.m5082a(f3418f);
    }

    /* renamed from: K */
    public boolean m3558K() {
        Core.m1087A();
        this.f3885L = f3414b;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1509h);
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3414b;
        }
        return f3413a[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
    }

    public C0485c(boolean z) {
        super(z);
        this.f3420h = new PointF();
        this.f3421i = new Rect();
        this.f3885L = f3413a[f3413a.length - 1];
        m2687b(this.f3885L);
        this.f1621ch = 24.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 2800.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5874a(-1, -1, 1, 1);
        this.f3427o.m5874a(-1, -1, 1, 1);
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (m4751bS() && !this.f1607bT && this.f3416d > 0) {
            C0188f c0188f = null;
            this.f3417e = C0758f.m2211a(this.f3417e, f);
            if (this.f3417e == 0.0f) {
                this.f3417e = 15.0f;
                Iterator it = C0188f.f1083a.iterator();
                while (it.hasNext()) {
                    C0188f c0188f2 = (C0188f) it.next();
                    if (c0188f2.f1004D && c0188f2.f6960en > 50.0f && C0758f.m2209a(this.f6958el, this.f6959em, c0188f2.f6958el, c0188f2.f6959em) < 2200.0f * 2200.0f && C0758f.m2209a(this.f6958el, this.f6959em, c0188f2.f988n, c0188f2.f989o) < 1000000.0f && (c0188f2.f984j == null || (!c0188f2.f984j.f1609bV.m5042d(this.f1609bV) && c0188f2.f984j.f1609bV != this.f1609bV))) {
                        if (!m3555a(c0188f2)) {
                            c0188f = c0188f2;
                        }
                    }
                }
            }
            if (c0188f != null) {
                m3550b(c0188f);
            }
        }
    }

    /* renamed from: a */
    public boolean m3555a(C0188f c0188f) {
        Object[] m534a = C0188f.f1083a.m534a();
        int i = C0188f.f1083a.f6894a;
        for (int i2 = 0; i2 < i; i2++) {
            C0188f c0188f2 = (C0188f) m534a[i2];
            if (c0188f2 != c0188f && c0188f2.f991q == c0188f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m3550b(C0188f c0188f) {
        Core m1087A = Core.m1087A();
        if (this.f3416d <= 0) {
            return;
        }
        this.f3416d--;
        PointF mo3156E = mo3156E(0);
        C0188f m5205a = C0188f.m5205a(this, mo3156E.f227a, mo3156E.f228b);
        m5205a.m447S(10);
        m5205a.f1016P = (short) 10;
        m5205a.f1018R = (short) 0;
        m5205a.f998x = 1.0f;
        m5205a.f1054aC = true;
        m5205a.f991q = c0188f;
        m5205a.f982h = 99999.0f;
        m5205a.f994t = 0.2f;
        m5205a.f992r = 6.5f;
        m5205a.f1043ar = Color.m5948a(255, 80, 60, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
        m5205a.f1021U = 600.0f;
        m5205a.f1059aH = true;
        m5205a.f1064aM = true;
        m5205a.f1068aQ = true;
        m5205a.f1003C = true;
        m5205a.f1060aI = 80.0f;
        m5205a.f1061aJ = 100.0f;
        m5205a.f1063aL = 2.0f;
        m1087A.f6116bR.m2385a(mo3156E.f227a, mo3156E.f228b, this.f6960en, -1127220);
        C0745e m2359d = m1087A.f6116bR.m2359d(mo3156E.f227a, mo3156E.f228b, 0.0f, -1);
        if (m2359d != null) {
            m2359d.f4751H = 0.5f;
            m2359d.f4750G = 2.1f;
            m2359d.f4788as = (short) 2;
            m2359d.f4766W = 90.0f;
            m2359d.f4767X = m2359d.f4766W;
            m2359d.f4765V = 0.0f;
        }
        m1087A.f6111bM.m2775a(C0631e.f4064D, 0.15f, 1.5f, mo3156E.f227a, mo3156E.f228b);
    }

    /* renamed from: E */
    public PointF mo3156E(int i) {
        f3985bf.m5879a(this.f6958el, this.f6959em - 9.0f);
        return f3985bf;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: m */
    public float mo3035m() {
        return 1000.0f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 4.0f;
    }

    /* renamed from: b */
    public boolean m3551b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        return super.mo3049c(f);
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1764D;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 1.0f;
    }

    /* renamed from: bU */
    public float m3549bU() {
        return super.m3474bU();
    }

    /* renamed from: L */
    public void m3557L() {
        this.f3416d++;
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        if (c0499j.f3496j.equals(f3423k.m4910N())) {
            m3557L();
        }
    }

    /* renamed from: cl */
    public C0208c m3545cl() {
        if (this.f3416d < 4) {
            return f3423k.m4910N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: cj */
    public boolean m3546cj() {
        return false;
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.c$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c$1.class */
    final class C04861 extends AbstractC0224s {
        C04861(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return VariableScope.nullOrMissingString;
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.antiNukeCount", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return 0;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            if (mo3083b(abstractC0244am, false) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: K */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3081e() {
            return EnumC0226u.f1475a;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1465a;
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0485c) abstractC0244am).f3416d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.c$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/c$2.class */
    final class C04872 extends AbstractC0228w {
        C04872(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return C0820a.m1731a("gui.actions.buildAntiNuke.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.buildAntiNuke", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return 4000;
        }

        /* renamed from: K */
        public float mo3369K() {
            return 7.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0485c c0485c = (C0485c) abstractC0244am;
            if (c0485c.f3416d + c0485c.mo3438a(m4910N(), z) >= 12.0f) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: L */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1468d;
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f3424l;
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
    }

    /* renamed from: O */
    public void m3556O() {
    }

    /* renamed from: ca */
    public void m3547ca() {
        C1117y.m465a((AbstractC0244am) this, 990.0f, false, true);
    }

    /* renamed from: a */
    public boolean m3553a(Core core) {
        if (this.f1644cE) {
            return true;
        }
        return super.m4776a(core);
    }

    /* renamed from: a */
    public float mo3052a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        if (f > 2600.0f) {
            f = 2600.0f;
        }
        return super.mo3052a(abstractC0244am, f, c0188f);
    }
}
