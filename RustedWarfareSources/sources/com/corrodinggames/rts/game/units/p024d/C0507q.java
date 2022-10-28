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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f3527c);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f3527c = reader.ReadInt();
        super.mo2291a(reader);
    }

    /* renamed from: v */
    public C0934e mo2977v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3529e[this.f1609bV.m4650O()];
    }

    /* renamed from: b */
    public static void m3285b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3526b = m1072A.f6113bO.mo221a(C0067R.drawable.nuke_launcher_dead);
        C0934e mo221a = m1072A.f6113bO.mo221a(C0067R.drawable.nuke_launcher);
        f3525a = AbstractC0197n.m4627a(mo221a);
        mo221a.mo50n();
        f3528d = m1072A.f6113bO.mo221a(C0067R.drawable.unit_icon_building);
        f3529e = AbstractC0197n.m4627a(f3528d);
    }

    /* renamed from: bp */
    public int mo3356bp() {
        return 20;
    }

    /* renamed from: K */
    public boolean mo3274K() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f3885L = f3526b;
        m447S(0);
        this.f1606bS = false;
        m2924a(EnumC0233ab.f1509h);
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
        m1072A.f6116bR.m2337a(this.f6957el, this.f6958em, this.f6959en, 40.0f, 120.0f);
        return true;
    }

    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3526b;
        }
        return f3525a[this.f1609bV.m4650O()];
    }

    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    /* renamed from: a */
    public void mo3174a(int i) {
    }

    public C0507q(boolean z) {
        super(z);
        this.f3530f = new PointF();
        this.f3531g = new Rect();
        this.f3885L = f3525a[f3525a.length - 1];
        m2633b(this.f3885L);
        this.f1621ch = 40.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1500.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5364a(-2, -1, 2, 1);
        this.f3427o.m5364a(-2, -1, 2, 2);
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
        }
    }

    /* renamed from: E */
    public PointF mo3073E(int i) {
        f3985bf.m5369a(this.f6957el, this.f6958em - 3.0f);
        return f3985bf;
    }

    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: c */
    public float mo2991c(int i) {
        return 4.0f;
    }

    /* renamed from: b */
    public boolean mo3295b(int i, float f) {
        return false;
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        return super.mo2285c(f);
    }

    /* renamed from: c */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1763C;
    }

    /* renamed from: l */
    public boolean mo2979l() {
        return false;
    }

    /* renamed from: g */
    public float mo2983g(int i) {
        return 1.0f;
    }

    /* renamed from: bU */
    public float m3283bU() {
        return super.m3347bU();
    }

    /* renamed from: a */
    public void m3287a(float f, float f2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f3527c <= 0) {
            return;
        }
        if (C0758f.m2157a(this.f6957el, this.f6958em, f, f2) < 202500.0f) {
            if (this.f1609bV == m1072A.f6099bs) {
                m1072A.f6117bS.m1806b("Nuke target too close");
                return;
            }
            return;
        }
        this.f3527c--;
        PointF mo3073E = mo3073E(0);
        m3286a(this, mo3073E.f227a, mo3073E.f228b, f, f2).f983i = 5.0f;
        C0745e m2333a = m1072A.f6116bR.m2333a(mo3073E.f227a, mo3073E.f228b, this.f6959en, -1127220);
        if (m2333a != null) {
            m2333a.f4749V = 5.0f;
            m2333a.f4735H = 2.1f;
            m2333a.f4734G = 2.1f;
            m2333a.f4792as = (short) 2;
            m2333a.f4726t = true;
            m2333a.f4727u = 70.0f;
            m2333a.f4750W = 370.0f;
            m2333a.f4751X = m2333a.f4750W;
            m2333a.f4733F = 1.0f;
        }
        C0745e m2307d = m1072A.f6116bR.m2307d(mo3073E.f227a, mo3073E.f228b, 0.0f, -1);
        if (m2307d != null) {
            m2307d.f4735H = 1.0f;
            m2307d.f4734G = 3.1f;
            m2307d.f4792as = (short) 2;
            m2307d.f4750W = 170.0f;
            m2307d.f4751X = m2307d.f4750W;
            m2307d.f4749V = 5.0f + 20.0f;
        }
        m1072A.f6111bM.m2721a(C0631e.f4064D, 0.27f, 0.8f, mo3073E.f227a, mo3073E.f228b);
    }

    /* renamed from: a */
    public static C0188f m3286a(AbstractC0244am abstractC0244am, float f, float f2, float f3, float f4) {
        C0188f m4718a = C0188f.m4718a(abstractC0244am, f, f2);
        m4718a.m447S(10);
        m4718a.f1016P = (short) 0;
        m4718a.f1017Q = (short) 1;
        m4718a.f1018R = (short) 1;
        m4718a.f998x = 1.0f;
        m4718a.f1054aC = true;
        m4718a.f987m = true;
        m4718a.f988n = f3;
        m4718a.f989o = f4;
        m4718a.f982h = 99999.0f;
        m4718a.f994t = 0.1f;
        m4718a.f992r = 2.7f;
        m4718a.f1043ar = Color.m5435a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING);
        m4718a.f1021U = 300.0f;
        m4718a.f1059aH = true;
        m4718a.f1064aM = true;
        m4718a.f1068aQ = true;
        m4718a.f1003C = true;
        m4718a.f1004D = true;
        m4718a.f1060aI = 80.0f;
        m4718a.f1061aJ = 100.0f;
        m4718a.f1063aL = 1.1f;
        m4718a.f1025Y = 5400.0f;
        m4718a.f1026Z = 250.0f;
        m4718a.f1030ad = true;
        m4718a.f1031ae = false;
        m4718a.f1041ao = true;
        m4718a.f1023W = 75.0f;
        m4718a.f1024X = m4718a.f1023W;
        m4718a.f1077aY = true;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6116bR.m2312b(EnumC0748h.f4836e);
        C0745e m2325a = m1072A.f6116bR.m2325a(m4718a, -1118720);
        if (m2325a != null) {
            m2325a.f4750W = 1300.0f;
            m2325a.f4751X = m2325a.f4750W;
            m2325a.f4733F = 0.2f;
            m2325a.f4735H = 1.0f;
        }
        return m4718a;
    }

    /* renamed from: L */
    public void m3288L() {
        this.f3527c++;
    }

    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        if (c0499j.f3494j.equals(f3533i.m4507N())) {
            m3288L();
        }
    }

    /* renamed from: cl */
    public C0208c mo3267cl() {
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public void mo3116a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (z) {
            return;
        }
        if (abstractC0224s == f3532h) {
            if (pointF == null) {
                C0831ad.m1449g("action:" + f3532h.m4507N() + " needs point but it is missing");
                return;
            } else {
                m3287a(pointF.f227a, pointF.f228b);
                return;
            }
        }
        super.mo3116a(abstractC0224s, z, pointF, abstractC0244am);
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.q$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/q$1.class */
    final class C05081 extends AbstractC0224s {
        C05081(int i) {
            super(i);
        }

        /* renamed from: a */
        public String mo3029a() {
            return C0820a.m1687a("gui.actions.launchNuke", new Object[0]);
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.launchNuke", new Object[0]);
        }

        /* renamed from: c */
        public int mo3023c() {
            return 0;
        }

        /* renamed from: b */
        public int mo3024b(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0507q) abstractC0244am).f3527c;
        }

        /* renamed from: K */
        public EnumC0249ar mo5648i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3022e() {
            return EnumC0226u.f1481g;
        }

        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1470f;
        }

        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
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
        public boolean mo3019g() {
            return false;
        }

        /* renamed from: a */
        public String mo3029a() {
            return C0820a.m1687a("gui.actions.buildNuke.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("gui.actions.buildNuke", new Object[0]);
        }

        /* renamed from: c */
        public int mo3023c() {
            return 11000;
        }

        /* renamed from: K */
        public float mo3265K() {
            return 3.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0507q c0507q = (C0507q) abstractC0244am;
            if (c0507q.f3527c + c0507q.mo3313a(m4507N(), z) >= 4.0f) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1468d;
        }
    }

    /* renamed from: N */
    public ArrayList mo3068N() {
        return f3534j;
    }

    /* renamed from: e */
    public void mo2283e(float f) {
        super.mo2283e(f);
        C1117y.m452b((AbstractC0244am) this, 450.0f, false);
    }
}
