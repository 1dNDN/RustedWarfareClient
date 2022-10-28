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
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q.class */
public class C0507q extends AbstractC0498i {

    /* renamed from: c */
    int f3527c;

    /* renamed from: f */
    PointF f3530f;

    /* renamed from: g */
    Rect f3531g;

    /* renamed from: a */
    static C0934e[] f3525a = new C0934e[10];

    /* renamed from: b */
    static C0934e f3526b = null;

    /* renamed from: d */
    static C0934e f3528d = null;

    /* renamed from: e */
    static C0934e[] f3529e = new C0934e[10];

    /* renamed from: h */
    static AbstractC0224s f3532h = new C05081(142);

    /* renamed from: i */
    static AbstractC0224s f3533i = new C05092(143);

    /* renamed from: j */
    static ArrayList f3534j = new ArrayList();

    static {
        f3534j.add(f3532h);
        f3534j.add(f3533i);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f3527c);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3394a(Reader reader) {
        this.f3527c = reader.ReadInt();
        super.m3478a(reader);
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3529e[this.f1609bV.m5105O()];
    }

    /* renamed from: b */
    public static void m3393b() {
        Core m1087A = Core.m1087A();
        f3526b = m1087A.f6113bO.mo221a(C0067R.drawable.nuke_launcher_dead);
        C0934e mo221a = m1087A.f6113bO.mo221a(C0067R.drawable.nuke_launcher);
        f3525a = AbstractC0197n.m5082a(mo221a);
        mo221a.mo50n();
        f3528d = m1087A.f6113bO.mo221a(C0067R.drawable.unit_icon_building);
        f3529e = AbstractC0197n.m5082a(f3528d);
    }

    /* renamed from: bp */
    public int m3390bp() {
        return 20;
    }

    /* renamed from: K */
    public boolean m3400K() {
        Core m1087A = Core.m1087A();
        this.f3885L = f3526b;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1509h);
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
        m1087A.f6116bR.m2389a(this.f6958el, this.f6959em, this.f6960en, 40.0f, 120.0f);
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3526b;
        }
        return f3525a[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
    }

    public C0507q(boolean z) {
        super(z);
        this.f3530f = new PointF();
        this.f3531g = new Rect();
        this.f3885L = f3525a[f3525a.length - 1];
        m2687b(this.f3885L);
        this.f1621ch = 40.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1500.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5874a(-2, -1, 2, 1);
        this.f3427o.m5874a(-2, -1, 2, 2);
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (!m4751bS() || this.f1607bT) {
        }
    }

    /* renamed from: E */
    public PointF mo3156E(int i) {
        f3985bf.m5879a(this.f6958el, this.f6959em - 3.0f);
        return f3985bf;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 4.0f;
    }

    /* renamed from: b */
    public boolean m3392b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        return super.mo3049c(f);
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1763C;
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
    public float m3391bU() {
        return super.m3474bU();
    }

    /* renamed from: a */
    public void m3398a(float f, float f2) {
        Core m1087A = Core.m1087A();
        if (this.f3527c <= 0) {
            return;
        }
        if (C0758f.m2209a(this.f6958el, this.f6959em, f, f2) < 202500.0f) {
            if (this.f1609bV == m1087A.f6099bs) {
                m1087A.f6117bS.m1850b("Nuke target too close");
                return;
            }
            return;
        }
        this.f3527c--;
        PointF mo3156E = mo3156E(0);
        m3396a(this, mo3156E.f227a, mo3156E.f228b, f, f2).f983i = 5.0f;
        C0745e m2385a = m1087A.f6116bR.m2385a(mo3156E.f227a, mo3156E.f228b, this.f6960en, -1127220);
        if (m2385a != null) {
            m2385a.f4765V = 5.0f;
            m2385a.f4751H = 2.1f;
            m2385a.f4750G = 2.1f;
            m2385a.f4788as = (short) 2;
            m2385a.f4737t = true;
            m2385a.f4738u = 70.0f;
            m2385a.f4766W = 370.0f;
            m2385a.f4767X = m2385a.f4766W;
            m2385a.f4749F = 1.0f;
        }
        C0745e m2359d = m1087A.f6116bR.m2359d(mo3156E.f227a, mo3156E.f228b, 0.0f, -1);
        if (m2359d != null) {
            m2359d.f4751H = 1.0f;
            m2359d.f4750G = 3.1f;
            m2359d.f4788as = (short) 2;
            m2359d.f4766W = 170.0f;
            m2359d.f4767X = m2359d.f4766W;
            m2359d.f4765V = 5.0f + 20.0f;
        }
        m1087A.f6111bM.m2775a(C0631e.f4064D, 0.27f, 0.8f, mo3156E.f227a, mo3156E.f228b);
    }

    /* renamed from: a */
    public static C0188f m3396a(AbstractC0244am abstractC0244am, float f, float f2, float f3, float f4) {
        C0188f m5205a = C0188f.m5205a(abstractC0244am, f, f2);
        m5205a.m447S(10);
        m5205a.f1016P = (short) 0;
        m5205a.f1017Q = (short) 1;
        m5205a.f1018R = (short) 1;
        m5205a.f998x = 1.0f;
        m5205a.f1054aC = true;
        m5205a.f987m = true;
        m5205a.f988n = f3;
        m5205a.f989o = f4;
        m5205a.f982h = 99999.0f;
        m5205a.f994t = 0.1f;
        m5205a.f992r = 2.7f;
        m5205a.f1043ar = Color.m5948a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING);
        m5205a.f1021U = 300.0f;
        m5205a.f1059aH = true;
        m5205a.f1064aM = true;
        m5205a.f1068aQ = true;
        m5205a.f1003C = true;
        m5205a.f1004D = true;
        m5205a.f1060aI = 80.0f;
        m5205a.f1061aJ = 100.0f;
        m5205a.f1063aL = 1.1f;
        m5205a.f1025Y = 5400.0f;
        m5205a.f1026Z = 250.0f;
        m5205a.f1030ad = true;
        m5205a.f1031ae = false;
        m5205a.f1041ao = true;
        m5205a.f1023W = 75.0f;
        m5205a.f1024X = m5205a.f1023W;
        m5205a.f1077aY = true;
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2364b(EnumC0748h.f4836e);
        C0745e m2377a = m1087A.f6116bR.m2377a(m5205a, -1118720);
        if (m2377a != null) {
            m2377a.f4766W = 1300.0f;
            m2377a.f4767X = m2377a.f4766W;
            m2377a.f4749F = 0.2f;
            m2377a.f4751H = 1.0f;
        }
        return m5205a;
    }

    /* renamed from: L */
    public void m3399L() {
        this.f3527c++;
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        if (c0499j.f3496j.equals(f3533i.m4910N())) {
            m3399L();
        }
    }

    /* renamed from: cl */
    public C0208c m3388cl() {
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public void m3397a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (z) {
            return;
        }
        if (abstractC0224s == f3532h) {
            if (pointF == null) {
                C0831ad.m1493g("action:" + f3532h.m4910N() + " needs point but it is missing");
                return;
            } else {
                m3398a(pointF.f227a, pointF.f228b);
                return;
            }
        }
        super.m4787a(abstractC0224s, z, pointF, abstractC0244am);
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.q$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q$1.class */
    final class C05081 extends AbstractC0224s {
        C05081(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3088a() {
            return C0820a.m1731a("gui.actions.launchNuke", new Object[0]);
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.launchNuke", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return 0;
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0507q) abstractC0244am).f3527c;
        }

        /* renamed from: K */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3081e() {
            return EnumC0226u.f1481g;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1470f;
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0507q) abstractC0244am).f3527c > 0;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.q$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q$2.class */
    final class C05092 extends AbstractC0228w {
        C05092(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return C0820a.m1731a("gui.actions.buildNuke.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.buildNuke", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return 11000;
        }

        /* renamed from: K */
        public float mo3369K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0507q c0507q = (C0507q) abstractC0244am;
            if (c0507q.f3527c + c0507q.mo3438a(m4910N(), z) >= 4.0f) {
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
        return f3534j;
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
        C1117y.m452b((AbstractC0244am) this, 450.0f, false);
    }
}
