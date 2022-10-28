package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0621w;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0240ai;
import com.corrodinggames.rts.game.units.C0247ap;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0238ag;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a;
import com.corrodinggames.rts.game.units.custom.p018b.C0393g;
import com.corrodinggames.rts.game.units.custom.p018b.C0394h;
import com.corrodinggames.rts.game.units.custom.p018b.C0398l;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p024d.AbstractC0498i;
import com.corrodinggames.rts.game.units.p024d.C0499j;
import com.corrodinggames.rts.game.units.p024d.C0500k;
import com.corrodinggames.rts.game.units.p024d.C0507q;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.game.units.p026e.C0526i;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0637ab;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1080ai;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/j.class */
public class C0451j extends AbstractC0621w implements InterfaceC0242ak, InterfaceC0469d, InterfaceC0501l {

    /* renamed from: a */
    public int f2840a;

    /* renamed from: b */
    public final C0427e f2841b;

    /* renamed from: c */
    float f2842c;

    /* renamed from: d */
    float f2843d;

    /* renamed from: e */
    float f2844e;

    /* renamed from: f */
    public float f2845f;

    /* renamed from: g */
    boolean f2846g;

    /* renamed from: h */
    public boolean f2847h;

    /* renamed from: i */
    public boolean f2848i;

    /* renamed from: j */
    float f2849j;

    /* renamed from: k */
    boolean f2850k;

    /* renamed from: l */
    boolean f2851l;

    /* renamed from: m */
    float f2852m;

    /* renamed from: n */
    boolean f2853n;

    /* renamed from: o */
    float f2854o;

    /* renamed from: p */
    public boolean f2855p;

    /* renamed from: q */
    float f2856q;

    /* renamed from: r */
    boolean f2857r;

    /* renamed from: s */
    float f2858s;

    /* renamed from: t */
    float f2859t;

    /* renamed from: u */
    public float f2860u;

    /* renamed from: v */
    public boolean f2861v;

    /* renamed from: w */
    float f2862w;

    /* renamed from: x */
    public C0453l f2863x;

    /* renamed from: y */
    public C0359aq f2864y;

    /* renamed from: z */
    public C0453l f2865z;

    /* renamed from: A */
    public AbstractC0377ar[] f2866A;

    /* renamed from: B */
    public final C1101m f2867B;

    /* renamed from: C */
    public C1101m f2868C;

    /* renamed from: D */
    public float f2869D;

    /* renamed from: E */
    PointF[] f2870E;

    /* renamed from: F */
    PointF[] f2871F;

    /* renamed from: G */
    C0188f[] f2872G;

    /* renamed from: J */
    Paint f2875J;

    /* renamed from: dK */
    final C0500k f2878dK;

    /* renamed from: dL */
    public static PointF f2879dL;

    /* renamed from: dM */
    public static AbstractC0244am f2880dM;

    /* renamed from: dN */
    public float f2881dN;

    /* renamed from: dO */
    public float f2882dO;

    /* renamed from: dP */
    public float f2883dP;

    /* renamed from: dQ */
    public float f2884dQ;

    /* renamed from: dR */
    public C0394h[] f2885dR;

    /* renamed from: dV */
    static boolean f2889dV;

    /* renamed from: dW */
    static final HashMap f2890dW;

    /* renamed from: dX */
    static int f2891dX;

    /* renamed from: dY */
    static String f2892dY;

    /* renamed from: dZ */
    static final PointF f2893dZ;

    /* renamed from: ea */
    C0449h f2894ea;

    /* renamed from: eb */
    protected static final C1080ai f2895eb;

    /* renamed from: ec */
    protected static final PointF f2896ec;

    /* renamed from: ed */
    C1101m f2897ed;

    /* renamed from: H */
    static final PointF f2873H = new PointF();

    /* renamed from: I */
    static PointF f2874I = new PointF();

    /* renamed from: dI */
    protected static final PointF f2876dI = new PointF();

    /* renamed from: dJ */
    protected static final C1080ai f2877dJ = new C1080ai();

    /* renamed from: dS */
    static ArrayList f2886dS = new ArrayList();

    /* renamed from: dT */
    public static C1101m f2887dT = new C1101m();

    /* renamed from: dU */
    public static C1101m f2888dU = new C1101m();

    /* renamed from: K */
    public void m3727K() {
        this.f2870E = new PointF[6];
        this.f2871F = new PointF[this.f2870E.length];
        for (int i = 0; i < this.f2870E.length; i++) {
            this.f2870E[i] = new PointF();
            this.f2871F[i] = new PointF();
        }
    }

    /* renamed from: b */
    public PointF[] mo3085b() {
        if (this.f2870E == null) {
            m3727K();
        }
        return this.f2870E;
    }

    /* renamed from: c */
    public PointF[] mo3083c() {
        if (this.f2870E == null) {
            m3727K();
        }
        return this.f2871F;
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(11);
        streamWriter.mo1320a(this.f2844e);
        streamWriter.mo1320a(this.f2852m);
        streamWriter.mo1314a(this.f2853n);
        streamWriter.WriteInteger(this.f2867B.size());
        Iterator it = this.f2867B.iterator();
        while (it.hasNext()) {
            streamWriter.mo1318a((AbstractC0244am) it.next());
        }
        streamWriter.mo1314a(this.f2857r);
        streamWriter.mo1320a(this.f2854o);
        streamWriter.mo1320a(this.f2845f);
        streamWriter.mo1320a(this.f2858s);
        streamWriter.mo1314a(this.f2861v);
        byte b = 0;
        if (this.f2885dR != null) {
            b = (byte) this.f2885dR.length;
        }
        streamWriter.mo1355c(b);
        if (this.f2885dR != null) {
            for (int i = 0; i < b; i++) {
                C0394h c0394h = this.f2885dR[i];
                streamWriter.mo1320a(c0394h.f2415b);
                streamWriter.mo1320a(c0394h.f2416c);
                streamWriter.mo1320a(c0394h.f2417d);
                streamWriter.mo1320a(c0394h.f2422i);
                streamWriter.mo1314a(c0394h.f2424k);
                streamWriter.mo1314a(c0394h.f2423j);
                streamWriter.mo1314a(c0394h.f2426m);
                streamWriter.mo1314a(c0394h.f2427n);
            }
        }
        this.f2878dK.m3327a(streamWriter);
        streamWriter.mo1370a(this.f2865z);
        streamWriter.mo1314a(this.f2848i);
        streamWriter.mo1314a(this.f2847h);
        boolean z = this.f2894ea != this.f2863x.f2923N;
        streamWriter.mo1314a(z);
        if (z) {
            C0448g.m3752a(this.f2894ea, streamWriter);
        }
        C0359aq.m4038a(this.f2864y, this, streamWriter);
        streamWriter.mo1320a(this.f2856q);
        super.mo2292a(streamWriter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        InterfaceC0303as m1275q;
        byte m1289d;
        C0394h c0394h;
        if (reader.m1295b() >= 32) {
            int ReadInt = reader.ReadInt();
            this.f2844e = reader.m1285g();
            this.f2852m = reader.m1285g();
            this.f2853n = reader.ReadBool();
            this.f2867B.clear();
            int ReadInt2 = reader.ReadInt();
            for (int i = 0; i < ReadInt2; i++) {
                AbstractC0244am m1277o = reader.m1277o();
                if (m1277o != null) {
                    this.f2867B.add(m1277o);
                }
            }
            if (ReadInt >= 1) {
                this.f2857r = reader.ReadBool();
            }
            if (ReadInt >= 2) {
                this.f2854o = reader.m1285g();
            }
            if (ReadInt >= 3) {
                this.f2845f = reader.m1285g();
                this.f2858s = reader.m1285g();
            }
            if (ReadInt >= 4) {
                this.f2861v = reader.ReadBool();
            }
            if (ReadInt >= 5 && (m1289d = reader.m1289d()) != 0) {
                m3597ds();
                if (this.f2885dR == null) {
                    LoggerMaybe.LogDebug2("readIn: legs==null but leg data found in save, this might be due to missing or changed mods");
                }
                for (int i2 = 0; i2 < m1289d; i2++) {
                    if (this.f2885dR == null) {
                        c0394h = new C0394h();
                    } else if (i2 >= this.f2885dR.length) {
                        LoggerMaybe.LogDebug2("readIn: legs " + ((int) i2) + ">=" + this.f2885dR.length);
                        c0394h = new C0394h();
                    } else {
                        c0394h = this.f2885dR[i2];
                    }
                    C0394h c0394h2 = c0394h;
                    c0394h2.f2415b = reader.m1285g();
                    c0394h2.f2416c = reader.m1285g();
                    c0394h2.f2417d = reader.m1285g();
                    c0394h2.f2422i = reader.m1285g();
                    c0394h2.f2424k = reader.ReadBool();
                    c0394h2.f2428o = true;
                    c0394h2.f2423j = reader.ReadBool();
                    c0394h2.f2426m = reader.ReadBool();
                    c0394h2.f2427n = reader.ReadBool();
                }
            }
            if (ReadInt >= 6) {
                this.f2878dK.m3326a(reader);
            }
            if (ReadInt >= 7 && (m1275q = reader.m1275q()) != null) {
                if (m1275q instanceof C0453l) {
                    this.f2865z = (C0453l) m1275q;
                } else {
                    LoggerMaybe.m983b("Got non CustomUnitMetadata object of:" + m1275q.mo4252i() + " loading real_meta");
                    this.f2865z = C0453l.f2903b;
                }
            }
            if (ReadInt >= 8) {
                this.f2848i = reader.ReadBool();
                this.f2847h = reader.ReadBool();
            }
            if (ReadInt >= 9 && reader.ReadBool()) {
                m3701a(C0448g.m3751a(reader), true);
            }
            if (ReadInt >= 10) {
                C0359aq.m4035a(this, reader, ReadInt);
            }
            if (ReadInt >= 11) {
                this.f2856q = reader.m1285g();
            }
        }
        super.mo2291a(reader);
        if (this.f2885dR != null) {
            this.f2881dN = this.f6957el;
            this.f2882dO = this.f6958em;
            this.f2883dP = this.f6959en;
            this.f2884dQ = this.f1618ce;
        }
    }

    /* renamed from: cq */
    public boolean m3624cq() {
        return this.f2863x.f3263eK > 0;
    }

    /* renamed from: bB */
    public int mo4453bB() {
        return this.f2867B.size();
    }

    /* renamed from: bA */
    public boolean mo4454bA() {
        return this.f2853n;
    }

    /* renamed from: d */
    public boolean m3618d(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2863x.f3263eK == 0 || this.f2853n || this.f1624ck < 1.0f || !m3729G(abstractC0244am) || abstractC0244am == this) {
            return false;
        }
        if (this.f1609bV != abstractC0244am.f1609bV && !z && (!this.f2863x.f3029cz || this.f1609bV != AbstractC0197n.f1371i)) {
            return false;
        }
        if (this.f2863x.f3128eN != null && !this.f2863x.f3128eN.m3745a() && !C0448g.m3753a(this.f2863x.f3128eN, abstractC0244am.m4331dc())) {
            return false;
        }
        if (this.f2863x.f3264eO.size() > 0) {
            boolean z2 = false;
            Iterator it = this.f2863x.f3264eO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((EnumC0246ao) it.next()) == abstractC0244am.mo2982h()) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                return false;
            }
        }
        return C1117y.m463a(abstractC0244am, this.f2863x.f3129eP, this.f2863x.f3130eQ);
    }

    /* renamed from: e */
    public boolean m3592e(AbstractC0244am abstractC0244am, boolean z) {
        if (!m3618d(abstractC0244am, z)) {
            return false;
        }
        m3735C(abstractC0244am);
        return true;
    }

    /* renamed from: C */
    public void m3735C(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1651cL = this;
        this.f2867B.add(abstractC0244am);
        if (this.f2863x.f3030cA && this.f1609bV == AbstractC0197n.f1371i) {
            m3594e(abstractC0244am.f1609bV);
        }
        m4423a(EnumC0347ae.f2183l, abstractC0244am);
        abstractC0244am.m4423a(EnumC0347ae.f2186o, this);
        LoggerMaybe.m1072A().f6117bS.m1774l(abstractC0244am);
    }

    /* renamed from: D */
    public void m3733D(AbstractC0244am abstractC0244am) {
        m4423a(EnumC0347ae.f2184m, abstractC0244am);
        abstractC0244am.m4423a(EnumC0347ae.f2187p, this);
        if (this.f2863x.f3031cB && this.f2867B.size() == 0) {
            m3594e(AbstractC0197n.f1371i);
        }
    }

    /* renamed from: e */
    public void mo4452e(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1651cL == this) {
            this.f2867B.remove(abstractC0244am);
            abstractC0244am.f1651cL = null;
            m3733D(abstractC0244am);
            return;
        }
        LoggerMaybe.m958g("Unit is not being transported");
    }

    /* renamed from: L */
    public void m3726L() {
        if (this.f2863x.f3263eK == 0) {
            return;
        }
        this.f2853n = true;
        this.f2852m = 30.0f;
    }

    /* renamed from: M */
    public void m3725M() {
        if (this.f2863x.f3263eK == 0) {
            return;
        }
        this.f2853n = false;
    }

    /* renamed from: g */
    public boolean m3585g(boolean z) {
        if (this.f2867B.size() == 0) {
            return false;
        }
        return m3674b((AbstractC0244am) this.f2867B.remove(this.f2867B.size() - 1), z, this.f2867B.size() % 2 == 0);
    }

    /* renamed from: a */
    public boolean m3710a(AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        this.f2867B.remove(abstractC0244am);
        return m3674b(abstractC0244am, z, z2);
    }

    /* renamed from: b */
    private boolean m3674b(AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        boolean z3;
        float f = 180.0f;
        if (this.f2863x.f3059di != null) {
            f = this.f2863x.f3059di.floatValue();
        }
        float f2 = 70.0f;
        if (this.f2863x.f3062dl != null) {
            f2 = this.f2863x.f3062dl.floatValue();
        }
        float f3 = this.f2863x.f3057dg;
        float f4 = this.f2863x.f3058dh;
        float m2040i = (this.f6957el + (C0758f.m2040i(this.f1618ce + f) * f4)) - (C0758f.m2045h(this.f1618ce + f) * f3);
        float m2045h = this.f6958em + (C0758f.m2045h(this.f1618ce + f) * f4) + (C0758f.m2040i(this.f1618ce + f) * f3);
        float m2040i2 = m2040i + (C0758f.m2040i(this.f1618ce + 90.0f) * (z2 ? -7.0f : 7.0f));
        float m2045h2 = m2045h + (C0758f.m2045h(this.f1618ce + 90.0f) * (z2 ? -7.0f : 7.0f));
        if (!z && !m3666bI()) {
            if (!C1117y.m469a(abstractC0244am, m2040i2, m2045h2)) {
                m2040i2 += 10.0f;
            }
            if (!C1117y.m469a(abstractC0244am, m2040i2, m2045h2)) {
                m2040i2 -= 20.0f;
            }
            if (!C1117y.m469a(abstractC0244am, m2040i2, m2045h2)) {
                m2040i2 -= 10.0f;
                m2045h2 += 10.0f;
            }
            if (!C1117y.m469a(abstractC0244am, m2040i2, m2045h2)) {
                m2045h2 -= 20.0f;
            }
        }
        if (!z && !C1117y.m469a(abstractC0244am, m2040i2, m2045h2) && !m3666bI()) {
            z3 = false;
        } else {
            z3 = true;
            boolean z4 = false;
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1652cM == this) {
                    C0399m dl = abstractC0623y.m4323dl();
                    if (dl == null) {
                        LoggerMaybe.LogDebug2("Unload, attachment data is null");
                    }
                    if (dl != null) {
                        z4 = dl.f2475E;
                    }
                }
            }
            C1117y.m464a(abstractC0244am, this);
            float f5 = this.f1618ce + f;
            if (!z4) {
                abstractC0244am.f6957el = m2040i2;
                abstractC0244am.f6958em = m2045h2;
                abstractC0244am.f1618ce = f5;
                abstractC0244am.f1615cb = 0.0f;
                abstractC0244am.f1614ca = 0.0f;
                abstractC0244am.f1611bX = 0.0f;
                abstractC0244am.f1612bY = 0.0f;
                abstractC0244am.f1611bX += 0.1f;
            }
            abstractC0244am.f1604bQ = this;
            abstractC0244am.f1605bR = 45.0f;
            if (z4) {
                abstractC0244am.f1605bR = 85.0f;
            }
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                if (!z4) {
                    abstractC0623y2.m2767j(abstractC0244am.f1618ce);
                }
                if (!this.f2863x.f3134eU.read(this)) {
                    abstractC0623y2.m2845az();
                    if (f2 != 0.0f) {
                        abstractC0623y2.m2789d(abstractC0244am.f6957el + (C0758f.m2040i(f5 + (z2 ? -7.0f : 7.0f)) * f2), abstractC0244am.f6958em + (C0758f.m2045h(f5 + (z2 ? -7.0f : 7.0f)) * f2));
                    }
                    abstractC0623y2.f3920ab = 0;
                } else {
                    abstractC0623y2.m2890aH();
                }
            }
            if (!z4) {
                if (!this.f2863x.f3061dk) {
                    abstractC0244am.f6959en = this.f6959en;
                }
                abstractC0244am.f6959en += this.f2863x.f3060dj;
            }
            if (abstractC0244am instanceof C0451j) {
                ((C0451j) abstractC0244am).m3614dD();
            }
        }
        if (!z3) {
            this.f2867B.add(abstractC0244am);
        } else {
            m3733D(abstractC0244am);
        }
        return z3;
    }

    /* renamed from: bX */
    public int m3661bX() {
        if (this.f2863x.f3263eK == 0 || !this.f2863x.f2909w) {
            return -1;
        }
        return m3611dG();
    }

    /* renamed from: bY */
    public int m3660bY() {
        if (this.f2863x.f3263eK == 0 || !this.f2863x.f2909w) {
            return -1;
        }
        return this.f2863x.f3263eK;
    }

    /* renamed from: dq */
    public void m3599dq() {
        if (this.f2867B.f6894a > 0) {
            m3582h(this.f2863x.f3133eT.read(this));
        }
    }

    /* renamed from: h */
    public void m3582h(boolean z) {
        Iterator it = this.f2867B.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            abstractC0244am.f1651cL = null;
            abstractC0244am.f6957el = this.f6957el + (C0758f.m2040i(this.f1618ce) * (-9.0f));
            abstractC0244am.f6958em = this.f6958em + (C0758f.m2045h(this.f1618ce) * (-9.0f));
            if (z) {
                abstractC0244am.m4350ci();
            }
        }
        this.f2867B.clear();
    }

    /* renamed from: bu */
    public void m3651bu() {
        if (!this.f1607bT) {
            m4424a(EnumC0347ae.f2174c);
        }
        Object[] m534a = this.f2863x.f3196h.m534a();
        for (int i = this.f2863x.f3196h.f6894a - 1; i >= 0; i--) {
            ((AbstractC0387a) m534a[i]).mo3980b(this);
        }
        super.m2802bu();
    }

    /* renamed from: a */
    public void mo2635a() {
        m3599dq();
        Object[] m534a = this.f2863x.f3196h.m534a();
        for (int i = this.f2863x.f3196h.f6894a - 1; i >= 0; i--) {
            ((AbstractC0387a) m534a[i]).mo3978c(this);
        }
        AbstractC0197n.m4634a((AbstractC0244am) this);
        this.f2878dK.m3325a(true);
        super.mo2635a();
    }

    /* renamed from: dr */
    public C0453l mo5649r() {
        return this.f2863x;
    }

    /* renamed from: I */
    public boolean mo2998I() {
        if (this.f2863x.f2949aG || this.f2846g || this.f1652cM != null) {
            return false;
        }
        return true;
    }

    /* renamed from: aR */
    public boolean m3693aR() {
        if (this.f2863x.f3085dM) {
            return false;
        }
        C0399m dl = m4323dl();
        if (dl != null && !dl.f2485O) {
            return false;
        }
        return true;
    }

    /* renamed from: aS */
    public boolean m3692aS() {
        if (this.f2863x.f2949aG) {
            return false;
        }
        C0399m dl = m4323dl();
        if (dl != null && !dl.f2478H) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public EnumC0246ao mo2982h() {
        return this.f2863x.f3141ff;
    }

    /* renamed from: i */
    public boolean mo2981i() {
        return this.f2863x.f3141ff == EnumC0246ao.f1706d && this.f6959en >= 4.0f;
    }

    /* renamed from: Q */
    public boolean mo2995Q() {
        return this.f6959en <= -1.0f;
    }

    /* renamed from: ct */
    public boolean mo3057ct() {
        if (mo2982h() == EnumC0246ao.f1707e) {
            return true;
        }
        return false;
    }

    /* renamed from: cr */
    public boolean m3623cr() {
        if (mo2982h() == EnumC0246ao.f1706d) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public C0934e mo2977v() {
        if (this.f1609bV.f1306k == -1 || this.f2863x.f2942ar == null) {
            return null;
        }
        return this.f2863x.f2942ar[this.f1609bV.m4650O()];
    }

    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT && this.f2863x.f3216am != null) {
            return this.f2863x.f3216am;
        }
        return this.f2863x.f3219aq[this.f1609bV.m4650O()];
    }

    /* renamed from: k */
    public C0934e mo2980k() {
        return this.f2863x.f3218ao;
    }

    /* renamed from: F */
    public boolean mo3001F() {
        return LoggerMaybe.m1072A().f6115bQ.renderExtraShadows && (!this.f1607bT || this.f6959en >= 1.0f) && this.f6959en >= -1.0f;
    }

    /* renamed from: d */
    public C0934e mo2988d(int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2571C != null && c0411bl.f2571C.read(this)) {
            return null;
        }
        if (c0411bl.f2625aE != null) {
            return c0411bl.f2625aE[this.f1609bV.m4650O()];
        }
        if (c0411bl.f2624aD != null) {
            return c0411bl.f2624aD;
        }
        if (this.f2863x.f3220as != null) {
            return this.f2863x.f3220as[this.f1609bV.m4650O()];
        }
        return this.f2863x.f3217an;
    }

    /* renamed from: h */
    public float m3584h(int i) {
        return this.f2863x.f3269fO[i].f2627aG;
    }

    /* renamed from: i */
    public float m3581i(int i) {
        return this.f2863x.f3269fO[i].f2628aH;
    }

    /* renamed from: e */
    public boolean mo2986e() {
        AbstractC0197n abstractC0197n;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m3666bI()) {
            m1072A.f6119bU.m1150a(this);
        }
        if (this.f1624ck < 1.0f) {
            if (this.f2863x.f2989bx != null && this.f2863x.f2989bx.m3457b()) {
                this.f2863x.f2989bx.m3459a(this.f6957el, this.f6958em, this.f6959en, this.f1618ce, null);
                return false;
            } else if (this.f2863x.f2990by != null && this.f2863x.f2990by.m3457b()) {
                this.f2863x.f2990by.m3459a(this.f6957el, this.f6958em, this.f6959en, this.f1618ce, null);
                return false;
            } else {
                m2924a(EnumC0233ab.f1502a);
                return false;
            }
        }
        if (!this.f2863x.f3142fg) {
            m447S(0);
        }
        if (this.f2863x.f2990by != null && this.f2863x.f2990by.m3457b()) {
            this.f2863x.f2990by.m3459a(this.f6957el, this.f6958em, this.f6959en, this.f1618ce, null);
        }
        if (this.f2863x.f3232bB != -1) {
            m3713a((AbstractC0244am) null, this.f6957el, this.f6958em, this.f2863x.f3232bB, (C0405bf) null, 0);
        }
        if (this.f2863x.f2992bC != null) {
            if (this.f2863x.f2993bD && this.f1579bs != null && this.f1579bs.f1609bV != null) {
                abstractC0197n = this.f1579bs.f1609bV;
            } else {
                abstractC0197n = this.f1609bV;
            }
            if (!abstractC0197n.f1327D) {
                this.f2863x.f2992bC.m3946a(this.f6957el, this.f6958em, this.f6959en, this.f1618ce, abstractC0197n, this.f1644cE, this);
            }
        }
        this.f1606bS = false;
        if (!this.f2863x.f3142fg) {
            m3599dq();
        }
        if (this.f2863x.f2979bn) {
            boolean z = false;
            if (this.f2863x.f2983br && m1072A.m1059N() && m1072A.f6122bX.f5603aO.f5662i) {
                z = true;
            }
            if (!z) {
                C0188f m3286a = C0507q.m3286a(this, this.f6957el, this.f6958em, this.f6957el, this.f6958em);
                m3286a.f1059aH = false;
                m3286a.f1026Z = this.f2863x.f2980bo;
                m3286a.f1025Y = this.f2863x.f2981bp;
            }
        }
        if (this.f2863x.f2978bm != 0) {
            C0240ai c0240ai = new C0240ai(false);
            c0240ai.f6957el = this.f6957el;
            c0240ai.f6958em = this.f6958em;
            c0240ai.m4411b(AbstractC0197n.f1370h);
            AbstractC0197n.m4598c(c0240ai);
        }
        if (this.f2863x.f2991bz != null) {
            this.f2863x.f2991bz.m3954a(this.f6957el, this.f6958em, 1.0f);
        }
        if (this.f2863x.f3120eB) {
            if (this.f2863x.f2991bz == null) {
                m1072A.f6111bM.m2722a(C0631e.f4061A, 0.8f, this.f6957el, this.f6958em);
            }
            if (this.f2863x.f2986bu) {
                if (!mo2981i() && !this.f2863x.f3260eH) {
                    C0195l.m4670a(this, 1);
                }
                if (this.f2863x.f2985bt != null) {
                    m2923a(this.f2863x.f2985bt, true);
                } else if (this.f2863x.f2975bj) {
                    m2924a(EnumC0233ab.f1505d);
                }
            }
            if (this.f2863x.f3121eC) {
                for (int i = 0; i < mo3356bp(); i++) {
                    m1072A.f6116bR.m2308d(this.f6957el, this.f6958em, this.f6959en);
                }
            }
        } else {
            if (this.f2885dR != null) {
                m3596dy();
                for (int i2 = 0; i2 < this.f2885dR.length; i2++) {
                    C0394h c0394h = this.f2885dR[i2];
                    C0384ay c0384ay = this.f2863x.f3223aw[i2];
                    float f = this.f6957el + c0394h.f2415b;
                    float f2 = this.f6958em + c0394h.f2416c;
                    if (c0384ay.f2307J && !c0384ay.f2287p && (c0384ay.f2288q == null || !c0384ay.f2288q.read(this))) {
                        if (!C1117y.m449d(f, f2) && !this.f2863x.f3260eH) {
                            C0195l.m4672a(f, f2);
                        }
                        m1072A.f6116bR.m2318b(f, f2, 0.0f);
                    }
                }
            }
            if (!mo2981i()) {
                if (this.f2863x.f2986bu) {
                    if (this.f2863x.f2985bt != null) {
                        m2923a(this.f2863x.f2985bt, true);
                    } else {
                        m2924a(EnumC0233ab.f1503b);
                    }
                }
            } else {
                if (this.f2863x.f2986bu) {
                    if (this.f2863x.f2985bt != null) {
                        m2923a(this.f2863x.f2985bt, false);
                    } else {
                        m1072A.f6116bR.m2318b(this.f6957el, this.f6958em, this.f6959en);
                    }
                }
                for (int i3 = 0; i3 < mo3356bp(); i3++) {
                    m1072A.f6116bR.m2306e(this.f6957el, this.f6958em, this.f6959en);
                }
            }
        }
        if (this.f2863x.f3142fg) {
            return true;
        }
        if (this.f2863x.f3216am != null) {
            this.f3885L = this.f2863x.f3216am;
            this.f2840a = 0;
            this.f4232et = true;
            return true;
        }
        return false;
    }

    /* renamed from: bq */
    public void m3652bq() {
        if (!this.f2863x.f3260eH) {
            super.m2806bq();
        }
    }

    /* renamed from: U */
    public void m3724U() {
        float mo3095C;
        super.m2949U();
        for (int i = 0; i < this.f2863x.f3269fO.length; i++) {
            C0247ap c0247ap = this.f1649cJ[i];
            LoggerMaybe.LogDebug2("Dir was:" + c0247ap.f1712a + " for name:" + this.f2863x.f3269fO[i].f2543a);
            LoggerMaybe.LogDebug2("lockDelay:" + c0247ap.f1715d + " shootCooldown:" + c0247ap.f1716e);
            LoggerMaybe.LogDebug2("updateAndShouldResetTurret:" + mo3295b(i, 0.0f));
            LoggerMaybe.LogDebug2("idleDir:" + mo3095C(i));
            LoggerMaybe.LogDebug2("diffDir:" + C0758f.m2083c(c0247ap.f1712a, mo3095C, 360.0f));
        }
    }

    /* renamed from: a */
    public void m3700a(C0453l c0453l, boolean z, boolean z2) {
        m3699a(c0453l, z, z2, (AbstractC0377ar[]) null);
    }

    /* renamed from: a */
    public void m3699a(C0453l c0453l, boolean z, boolean z2, AbstractC0377ar[] abstractC0377arArr) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0453l c0453l2 = this.f2863x;
        C0359aq c0359aq = this.f2864y;
        this.f2863x = c0453l;
        this.f1689dx = this.f2863x;
        this.f2864y = c0453l.f3246cJ;
        if (z2) {
            C0359aq.m4037a(this, c0359aq, c0453l2);
        } else if (abstractC0377arArr != null) {
            C0359aq.m4036a(this, c0359aq, abstractC0377arArr);
        }
        m4397bR();
        if (!z2) {
            m3578j(true);
        }
        if (!z) {
            if (c0453l.f3269fO.length > 1) {
                boolean z3 = true;
                if (c0453l.f3269fO.length != c0453l2.f3269fO.length) {
                    z3 = false;
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= c0453l.f3269fO.length) {
                            break;
                        }
                        if (c0453l.f3269fO[i].f2543a.equalsIgnoreCase(c0453l2.f3269fO[i].f2543a)) {
                            i++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (!z3) {
                    C0247ap[] c0247apArr = new C0247ap[c0453l.f3269fO.length];
                    for (int i2 = 0; i2 < c0453l.f3269fO.length; i2++) {
                        C0411bl c0411bl = c0453l.f3269fO[i2];
                        C0411bl m3513e = c0453l2.m3513e(c0411bl.f2543a);
                        if (m3513e != null) {
                            c0247apArr[c0411bl.f2547e] = this.f1649cJ[m3513e.f2547e];
                            this.f1649cJ[m3513e.f2547e] = null;
                        }
                    }
                    for (int i3 = 0; i3 < c0453l.f3269fO.length; i3++) {
                        if (c0247apArr[i3] == null) {
                            int i4 = 0;
                            while (true) {
                                if (i4 < c0453l.f3269fO.length) {
                                    if (this.f1649cJ[i4] == null) {
                                        i4++;
                                    } else {
                                        c0247apArr[i3] = this.f1649cJ[i4];
                                        this.f1649cJ[i4] = null;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (c0247apArr[i3] == null) {
                                c0247apArr[i3] = new C0247ap();
                            }
                            c0247apArr[i3].m4294a(this.f1618ce);
                        }
                    }
                    this.f1649cJ = c0247apArr;
                }
            }
        } else {
            for (int i5 = 0; i5 < c0453l.f3269fO.length; i5++) {
                this.f1649cJ[i5].m4294a(this.f1618ce + m3737B(i5));
            }
        }
        if (this.f2863x.f3214ad) {
            m2637V(this.f2863x.f2934ae);
            m2636W(this.f2863x.f2935af);
        } else {
            m2639T(this.f2863x.f2934ae);
            m2638U(this.f2863x.f2935af);
        }
        this.f4232et = false;
        this.f1621ch = this.f2863x.f3048cU;
        this.f1622ci = this.f2863x.f3052db;
        if (this.f1607bT) {
            this.f2840a = 0;
        } else {
            this.f2840a = this.f2863x.f2929X;
        }
        this.f2846g = false;
        if (z) {
            this.f6959en += this.f2863x.f3254dP;
        }
        float f = this.f1633ct;
        this.f1633ct = this.f2864y.f2240c;
        if (z) {
            m4306o(this.f1633ct);
        } else if (f == 0.0f) {
            m4306o(this.f1633ct);
        } else {
            m4306o((this.f1632cs / f) * this.f1633ct);
        }
        float f2 = this.f1638cy;
        this.f1638cy = this.f2864y.f2244g;
        if (this.f2863x.f3038cK) {
            if (this.f1635cv > this.f1638cy) {
                this.f1635cv = this.f1638cy;
            }
        } else if (z) {
            this.f1635cv = this.f1638cy;
        } else if (f2 == 0.0f) {
            this.f1635cv = this.f1638cy;
        } else {
            this.f1635cv = (this.f1635cv / f2) * this.f1638cy;
        }
        if (this.f2863x.f3040cM) {
            if (this.f1639cz > this.f2864y.f2241d) {
                this.f1639cz = this.f2864y.f2241d;
            }
        } else if (z) {
            this.f1639cz = this.f2864y.f2241d * this.f2863x.f3044cQ;
        } else if (c0359aq.f2241d == 0.0f) {
            this.f1639cz = this.f2864y.f2241d;
        } else {
            this.f1639cz = (this.f1639cz / c0359aq.f2241d) * this.f2864y.f2241d;
        }
        if (this.f1609bV == null) {
            this.f3885L = this.f2863x.f3213ac;
        } else {
            mo3303S();
        }
        if (this.f2863x.f2949aG && z) {
            this.f1618ce = -90.0f;
        }
        mo2990c_();
        if (!z && ((this.f1583bw != null || this.f1584bx != null) && (!C0424b.m3894b(this.f2863x.f3017cf, c0453l2.f3017cf) || !C0424b.m3894b(this.f2863x.f3019ch, c0453l2.f3019ch)))) {
            this.f1583bw = null;
            this.f1584bx = null;
        }
        if (!z) {
            boolean z4 = this.f2863x.mo4251j() != c0453l2.mo4251j();
            if (this.f2863x.mo4251j()) {
                this.f1615cb = 0.0f;
                this.f1614ca = 0.0f;
                if (c0453l2.mo4251j() && !this.f2863x.f3247cV.equals(c0453l2.f3247cV)) {
                    z4 = true;
                }
            }
            if (z4) {
                m1072A.f6119bU.m1150a(this);
            }
        }
        this.f2849j = 1.0f;
        if (this.f2863x.f3245cG != -2) {
        }
        if (!this.f1607bT) {
            m3614dD();
        }
        if (this.f2863x.f3122eD) {
        }
        m3597ds();
        m4330de().m3924a(this.f2863x);
        if (!z) {
            int mo3084bl = mo3084bl();
            for (int i6 = 0; i6 < mo3084bl; i6++) {
                C0247ap c0247ap = this.f1649cJ[i6];
                C0411bl c0411bl2 = this.f2863x.f3269fO[i6];
                if (c0411bl2 != null) {
                    if (c0247ap.f1716e > c0411bl2.f2555m) {
                        c0247ap.f1716e = c0411bl2.f2555m;
                    }
                    if (c0247ap.f1717f > c0411bl2.f2556n) {
                        c0247ap.f1717f = c0411bl2.f2556n;
                    }
                }
            }
        }
        if (!z) {
            if (!this.f2863x.f3051da) {
                this.f2878dK.f3500b = null;
            }
            if (this.f2863x.f3140fe != c0453l2.f3140fe) {
                m2890aH();
            }
        }
        if (this.f2863x.f3031cB && this.f2867B.size() == 0) {
            m2838b(AbstractC0197n.f1371i);
        }
        if (this.f1644cE && !m1072A.f6117bS.m1780i(this)) {
            m1072A.f6117bS.m1774l(this);
        }
        if (!z) {
            Object[] m534a = this.f2863x.f3196h.m534a();
            for (int i7 = this.f2863x.f3196h.f6894a - 1; i7 >= 0; i7--) {
                ((AbstractC0387a) m534a[i7]).mo3985a(this, c0453l2);
            }
            if (this.f1624ck >= 1.0f) {
                if (this.f2864y.f2251n > c0359aq.f2251n) {
                    m3647c(false);
                }
            } else {
                if ((this.f2863x.f3056df != -1 ? this.f2863x.f3056df : this.f2864y.f2251n) > (c0453l2.f3056df != -1 ? c0453l2.f3056df : c0359aq.f2251n)) {
                    m3647c(false);
                }
            }
        }
        if (this.f2848i && this.f2863x.f3066dt != null) {
            this.f2841b.m3858a(this.f2863x.f3066dt, 7, true);
        }
    }

    /* renamed from: c_ */
    public void mo2990c_() {
        if (this.f2863x.f2949aG) {
            this.f1606bS = false;
        } else if (!this.f1607bT) {
            this.f1606bS = true;
            if (this.f2863x.f3119eA) {
                this.f1606bS = false;
            }
        } else {
            this.f1606bS = false;
        }
        if (this.f1652cM != null) {
            this.f1606bS = false;
        }
    }

    public C0451j(boolean z, C0453l c0453l) {
        super(z);
        this.f2841b = new C0427e(this);
        this.f2842c = 1.0f;
        this.f2847h = true;
        this.f2848i = true;
        this.f2849j = 1.0f;
        this.f2850k = false;
        this.f2855p = true;
        this.f2867B = new C1101m();
        this.f2868C = null;
        this.f2870E = null;
        this.f2871F = null;
        this.f2878dK = new C0500k(this);
        this.f2885dR = null;
        this.f2897ed = new C1101m();
        m3700a(c0453l, true, false);
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        float f2;
        C0745e m2309c;
        float a;
        InterfaceC0303as mo3465c;
        float f3;
        float f4;
        float f5;
        C0745e m2317b;
        boolean z = this.f2848i;
        if (z) {
            this.f2848i = false;
            Object[] m534a = this.f2863x.f3196h.m534a();
            for (int i = this.f2863x.f3196h.f6894a - 1; i >= 0; i--) {
                ((AbstractC0387a) m534a[i]).mo3989a(this);
            }
            m3673b(EnumC0347ae.f2172a);
        }
        C0453l c0453l = this.f2863x;
        super.mo1718a(f);
        if (this.f1607bT && !this.f2851l) {
            if (this.f6959en > 0.0f) {
                if (c0453l.f3142fg && !(this.f1617cd == 0.0f && this.f1614ca == 0.0f && this.f1615cb == 0.0f)) {
                    this.f2845f += 0.017f * f;
                    this.f6959en -= this.f2845f * f;
                    PointF n = m2753n(f);
                    this.f6957el += n.f227a;
                    this.f6958em += n.f228b;
                    if (c0453l.f3140fe == EnumC0246ao.f1706d) {
                        LoggerMaybe m1072A = LoggerMaybe.m1072A();
                        this.f1680do += f;
                        this.f1678dm += f;
                        if (c0453l.f3143fh && this.f1680do > 9.0f) {
                            this.f1680do = C0758f.m2084c(1.0f, 3.0f);
                            C0745e m2313b = m1072A.f6116bR.m2313b(this.f6957el, this.f6958em, this.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
                            if (m2313b != null) {
                                m2313b.f4768ar = 0;
                                m2313b.f4767aq = 0;
                                m2313b.f4792as = (short) 2;
                                m2313b.f4725s = true;
                                m2313b.f4733F = 0.5f;
                                m2313b.f4751X = 60.0f;
                                m2313b.f4750W = 60.0f;
                                m2313b.f4735H = 0.9f;
                                m2313b.f4734G = 1.2f;
                                m2313b.f4793at = false;
                                m2313b.f4744Q = 0.0f;
                                m2313b.f4745R = 0.0f;
                            }
                        }
                        if (this.f1678dm > 7.0f) {
                            this.f1678dm = 0.0f;
                            C0745e m2313b2 = m1072A.f6116bR.m2313b(this.f6957el, this.f6958em, this.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4832a);
                            if (m2313b2 != null) {
                                C0746f.m2287b(m2313b2, true);
                                m2313b2.f4737J = this.f6957el;
                                m2313b2.f4738K = this.f6958em;
                                m2313b2.f4739L = this.f6959en;
                                m2313b2.f4744Q += C0758f.m2084c(-0.1f, 0.1f) + this.f1614ca;
                                m2313b2.f4745R += C0758f.m2084c(-0.1f, 0.1f) + this.f1615cb;
                                m2313b2.f4737J += C0758f.m2084c(-4.0f, 4.0f);
                                m2313b2.f4738K += C0758f.m2084c(-4.0f, 4.0f);
                            }
                        }
                    }
                } else {
                    this.f2845f += c0453l.f3257dU * f;
                    this.f6959en -= this.f2845f * f;
                }
            } else if (!this.f2850k) {
                this.f2850k = true;
                if (c0453l.f3142fg) {
                    m3599dq();
                    m447S(0);
                    if (c0453l.f3216am != null) {
                        this.f3885L = c0453l.f3216am;
                        this.f2840a = 0;
                        this.f4232et = true;
                    } else {
                        m4351ch();
                    }
                }
                if (this.f2845f > 0.5d) {
                    if (c0453l.f2988bw != null && c0453l.f2988bw.m3460a()) {
                        c0453l.f2988bw.m3459a(this.f6957el, this.f6958em, this.f6959en, this.f1618ce, null);
                    }
                    if (m4372cJ()) {
                        if (c0453l.f2987bv) {
                            m2924a(EnumC0233ab.f1502a);
                        }
                        if (m4373cI()) {
                            LoggerMaybe.m1072A().f6116bR.m2331a(this.f6957el, this.f6958em, 0.0f, 0, 0.0f, 0.0f, this.f1618ce);
                        }
                    } else if (c0453l.f2987bv) {
                        m2924a(EnumC0233ab.f1503b);
                    }
                }
                this.f2845f = 0.0f;
            } else if (m4372cJ()) {
                if (this.f6959en > -10.0f) {
                    this.f2845f += 8.0E-4f * f;
                    this.f6959en -= this.f2845f * f;
                    if (m4373cI()) {
                        this.f2859t += f;
                        if (this.f2859t > 30.0f) {
                            this.f2859t = 0.0f;
                            if (mo3246p_() && (m2317b = LoggerMaybe.m1072A().f6116bR.m2317b(this.f6957el, this.f6958em, this.f6959en, this.f1618ce)) != null) {
                                m2317b.f4744Q = 0.0f;
                                m2317b.f4745R = -0.1f;
                            }
                        }
                    }
                } else {
                    this.f2851l = true;
                }
            } else {
                this.f6959en = 0.0f;
                this.f2851l = true;
            }
        }
        if (this.f1607bT) {
            return;
        }
        LoggerMaybe m1072A2 = LoggerMaybe.m1072A();
        if (c0453l.f2973bh != 0.0f && this.f1624ck < 1.0f) {
            float f6 = this.f1624ck + (c0453l.f2973bh * f);
            if (f6 >= 1.0f) {
                AbstractC0197n.m4614b((AbstractC0244am) this);
                this.f1624ck = 1.0f;
                this.f1625cl = 1.0f;
                AbstractC0197n.m4598c(this);
            } else {
                this.f1624ck = f6;
                this.f1625cl = f6;
            }
        }
        if (!m4396bS()) {
            if (this.f1624ck < 1.0f) {
                if (c0453l.f3067du != null) {
                    this.f2841b.m3859a(c0453l.f3067du, 8);
                    this.f2841b.m3861a(f);
                } else if (c0453l.f3068dv != null) {
                    this.f2841b.m3859a(c0453l.f3068dv, 99);
                    this.f2841b.f2722b = this.f1624ck;
                    this.f2841b.f2724d = 0.0f;
                    this.f2841b.m3861a(f);
                }
            }
            Object[] m534a2 = c0453l.f3196h.m534a();
            for (int i2 = c0453l.f3196h.f6894a - 1; i2 >= 0; i2--) {
                ((AbstractC0387a) m534a2[i2]).mo3988a(this, f);
            }
            return;
        }
        Object[] m534a3 = c0453l.f3196h.m534a();
        for (int i3 = c0453l.f3196h.f6894a - 1; i3 >= 0; i3--) {
            ((AbstractC0387a) m534a3[i3]).mo3979b(this, f);
        }
        if (this.f2847h) {
            this.f2847h = false;
            m4424a(EnumC0347ae.f2173b);
        }
        if (this.f2864y.f2253p != 0.0f && (this.f1632cs < this.f1633ct || this.f2864y.f2253p < 0.0f)) {
            this.f1632cs += this.f2864y.f2253p * f;
            if (this.f1632cs > this.f1633ct) {
                this.f1632cs = this.f1633ct;
            }
        }
        if (this.f2864y.f2241d != 0.0f) {
            if (!this.f2861v) {
                f5 = c0453l.f3041cN;
            } else {
                f5 = c0453l.f3042cO;
            }
            if (this.f1639cz < this.f2864y.f2241d || f5 < 0.0f) {
                this.f1639cz += f5 * f;
            }
            if (this.f1639cz >= this.f2864y.f2241d) {
                this.f1639cz = this.f2864y.f2241d;
                this.f2861v = false;
            }
            if (this.f1639cz <= 0.0f) {
                if (c0453l.f2976bk) {
                    m3650bv();
                    return;
                }
                this.f1639cz = 0.0f;
            }
        }
        if (this.f1638cy != 0.0f) {
            if (this.f2864y.f2245h != 0.0f) {
                this.f1635cv += this.f2864y.f2245h * f;
                if (this.f1635cv > this.f1638cy) {
                    this.f1635cv = this.f1638cy;
                }
            }
            if (this.f1635cv < 0.0f) {
                this.f1635cv = 0.0f;
            }
            if (this.f1636cw != 0.0f) {
                this.f1636cw -= (this.f1636cw * 0.02f) * f;
                this.f1636cw = C0758f.m2158a(this.f1636cw, 0.0f, c0453l.f3047cT * f);
                if (this.f1636cw > 50.0f) {
                    this.f1636cw = 50.0f;
                }
            }
        }
        this.f2878dK.m3341a(f);
        C0453l c0453l2 = this.f2863x;
        if (c0453l2.f3149fn) {
            C0519b.m3241a(f, this);
        }
        if (c0453l2.f3022cl) {
            this.f2854o += f;
            if (this.f2854o > c0453l2.f3023cp - 0.1f) {
                this.f2854o -= c0453l2.f3023cp;
                boolean read = c0453l2.f3025cv.read(this);
                if (this.f2855p != read) {
                    AbstractC0197n.m4634a((AbstractC0244am) this);
                    this.f2855p = read;
                    AbstractC0197n.m4598c(this);
                }
                if (this.f2855p) {
                    c0453l2.f3238cm.m3878g(this);
                }
            }
        }
        if (c0453l2.f3241cr != null) {
            this.f2856q += f;
            if (this.f2856q > c0453l2.f3242cs) {
                this.f2856q = 0.0f;
                c0453l2.f3241cr.writeToUnit(this);
            }
        }
        if (this.f1648cI) {
            this.f2841b.m3859a(c0453l2.f3251dq, 3);
        } else if (!this.f2841b.f2725e || this.f2841b.f2721a == c0453l2.f3252dr) {
            this.f2841b.m3859a(c0453l2.f3252dr, 2);
        }
        if (c0453l2.f2999bL) {
            if (c0453l2.f2997bJ && m1072A2.f6259dc) {
                if (this.f1617cd > 0.0f || (this.f1617cd < 0.0f && c0453l2.f2998bK)) {
                    this.f2859t += f;
                }
                if (this.f2859t > 10.0f) {
                    this.f2859t = 0.0f;
                    if (this.f6954ei && m4373cI()) {
                        float f7 = this.f1618ce + 180.0f;
                        if (this.f1617cd < 0.0f) {
                            f7 += 180.0f;
                        }
                        float f8 = this.f1621ch - 6.0f;
                        if (f8 < 4.0f) {
                            f8 = 4.0f;
                        }
                        m1072A2.f6116bR.m2317b(this.f6957el + (C0758f.m2040i(f7) * f8), this.f6958em + (C0758f.m2045h(f7) * f8), 0.0f, f7);
                    }
                }
            }
            if (m1072A2.f6258db && ((this.f1617cd > 0.0f || this.f1617cd < 0.0f) && this.f6954ei)) {
                this.f2843d += f;
                if (this.f2843d > c0453l2.f3005bR) {
                    this.f2843d = 0.0f;
                    if (this.f1617cd > 0.0f) {
                        if (c0453l2.f3002bO != null) {
                            c0453l2.f3002bO.m3459a(this.f6957el, this.f6958em, this.f6959en, this.f1618ce, this);
                        }
                    } else if (c0453l2.f3003bP != null) {
                        float f9 = this.f1618ce;
                        if (c0453l2.f3004bQ) {
                            f9 += 180.0f;
                        }
                        c0453l2.f3003bP.m3459a(this.f6957el, this.f6958em, this.f6959en, f9, this);
                    }
                    if (c0453l2.f3000bM && ((this.f1617cd > 0.0f || c0453l2.f3001bN) && !m4373cI())) {
                        int i4 = 0;
                        while (i4 <= 1) {
                            float f10 = i4 == 0 ? -20 : 20;
                            float f11 = this.f1618ce + 180.0f;
                            if (this.f1617cd < 0.0f) {
                                f10 += 180.0f;
                                f11 += 180.0f;
                            }
                            C0745e m2310c = m1072A2.f6116bR.m2310c(this.f6957el + (C0758f.m2040i(this.f1618ce + 180.0f + f10) * (this.f1621ch - 1.0f)), this.f6958em + (C0758f.m2045h(this.f1618ce + 180.0f + f10) * (this.f1621ch - 1.0f)), this.f6959en, f11 + C0758f.m2084c(-7.0f, 7.0f), 0);
                            if (m2310c != null) {
                                m2310c.f4744Q += C0758f.m2084c(-0.15f, 0.15f);
                                m2310c.f4745R += C0758f.m2084c(-0.15f, 0.15f);
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        if (c0453l2.f3263eK > 0) {
            if (c0453l2.f3136eW != 0.0f && this.f2867B.f6894a > 0) {
                Object[] m534a4 = this.f2867B.m534a();
                for (int i5 = 0; i5 < this.f2867B.f6894a; i5++) {
                    AbstractC0244am abstractC0244am = (AbstractC0244am) m534a4[i5];
                    if (abstractC0244am.f1632cs < abstractC0244am.f1633ct || c0453l2.f3136eW < 0.0f) {
                        abstractC0244am.f1632cs += c0453l2.f3136eW * f;
                        if (abstractC0244am.f1632cs > abstractC0244am.f1633ct) {
                            abstractC0244am.f1632cs = abstractC0244am.f1633ct;
                        }
                    }
                }
            }
            if (this.f2853n && c0453l2.f3137fa.read(this)) {
                this.f2852m = C0758f.m2159a(this.f2852m, f);
                if (this.f2852m == 0.0f) {
                    this.f2852m = c0453l2.f3126eL;
                    if (this.f2867B.size() == 0) {
                        this.f2853n = false;
                    } else {
                        m3585g(false);
                        if (this.f2867B.size() == 0) {
                            this.f2853n = false;
                        }
                    }
                }
            }
        }
        if (this.f1648cI) {
            this.f2858s = 0.0f;
        } else {
            this.f2858s += f;
        }
        if (c0453l2.f3140fe != EnumC0246ao.f1706d && this.f1652cM == null) {
            m3614dD();
        }
        if ((c0453l2.f3140fe == EnumC0246ao.f1709g || c0453l2.f3140fe == EnumC0246ao.f1710h) && this.f1648cI) {
            if (m4374cH()) {
                this.f2849j = 0.7f;
            } else {
                this.f2849j = 1.0f;
            }
        }
        if (c0453l2.f3140fe == EnumC0246ao.f1706d) {
            this.f2844e += 2.0f * f;
            if (this.f2844e > 360.0f) {
                this.f2844e -= 360.0f;
            }
            boolean mo2981i = mo2981i();
            boolean z2 = false;
            if (c0453l2.f3086dN) {
                boolean cJ = m4372cJ();
                if (!this.f1648cI && !cJ && this.f2858s > 3.0f && (!c0453l2.f3087dO || m2854aq())) {
                    z2 = true;
                }
            }
            if (this.f1652cM == null) {
                if (z2) {
                    if (c0453l2.f3255dS < 0.0f) {
                        f4 = (C0758f.m2085c(this.f6959en - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f4 = c0453l2.f3255dS;
                    }
                    this.f6959en = C0758f.m2158a(this.f6959en, 2.0f, f4 * f);
                } else {
                    float m2045h = c0453l2.f3088dQ + (C0758f.m2045h(this.f2844e) * c0453l2.f3089dR);
                    if (c0453l2.f3255dS < 0.0f) {
                        f3 = (C0758f.m2085c(this.f6959en - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f3 = c0453l2.f3255dS;
                    }
                    this.f6959en = C0758f.m2158a(this.f6959en, m2045h, C0758f.m2107b(f3, (C0758f.m2085c(this.f6959en - m2045h) * 0.05f * 0.3f) + 0.1f) * f);
                }
                if (mo2981i != mo2981i()) {
                    this.f3944ax = true;
                    m3614dD();
                }
            }
        } else {
            float f12 = c0453l2.f3088dQ - c0453l2.f3089dR;
            if (this.f6959en < f12) {
                this.f6959en += 0.2f * f;
                if (this.f6959en >= f12) {
                    this.f6959en = f12;
                }
            }
            if ((c0453l2.f3088dQ != 0.0f || c0453l2.f3089dR != 0.0f || this.f6959en > 0.0f) && this.f1652cM == null) {
                float f13 = c0453l2.f3088dQ;
                if (c0453l2.f3089dR != 0.0f) {
                    this.f2844e += 2.0f * f;
                    if (this.f2844e > 360.0f) {
                        this.f2844e -= 360.0f;
                    }
                    f13 += C0758f.m2045h(this.f2844e) * c0453l2.f3089dR;
                }
                if (c0453l2.f3255dS < 0.0f) {
                    f2 = (C0758f.m2085c(this.f6959en - 2.0f) * 0.05f * 0.4f) + 0.2f;
                } else {
                    f2 = c0453l2.f3255dS;
                }
                this.f6959en = C0758f.m2158a(this.f6959en, f13, C0758f.m2107b(f2, (C0758f.m2085c(this.f6959en - f13) * 0.05f * 0.3f) + 0.1f) * f);
                boolean z3 = false;
                if (this.f6959en > c0453l2.f3088dQ + c0453l2.f3089dR + 1.0f) {
                    this.f2845f += c0453l2.f3256dT * f;
                    if (this.f6959en < 0.0f) {
                        this.f2845f = C0758f.m2107b(this.f2845f, 0.2f);
                    }
                    this.f6959en -= this.f2845f * f;
                    if (this.f2845f > 1.5d) {
                        this.f1680do += f;
                        if (this.f1680do > 0.5d) {
                            this.f1680do = 0.0f;
                            C0745e m2313b3 = m1072A2.f6116bR.m2313b(this.f6957el + C0758f.m2084c(-this.f1621ch, this.f1621ch), this.f6958em + C0758f.m2084c(-this.f1621ch, this.f1621ch), this.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                            if (m2313b3 != null) {
                                m2313b3.f4768ar = 0;
                                m2313b3.f4767aq = 0;
                                m2313b3.f4792as = (short) 2;
                                m2313b3.f4725s = true;
                                m2313b3.f4726t = true;
                                m2313b3.f4727u = 40.0f;
                                m2313b3.f4790ao = true;
                                m2313b3.f4744Q = 0.1f;
                                m2313b3.f4746S = 0.0f;
                                m2313b3.f4728v = true;
                                m2313b3.f4733F = 0.4f;
                                m2313b3.f4751X = 380.0f;
                                m2313b3.f4750W = m2313b3.f4751X;
                                m2313b3.f4735H = 0.8f;
                                m2313b3.f4734G = 1.7f;
                                m2313b3.f4793at = false;
                                m2313b3.f4744Q += C0758f.m2084c(-0.04f, 0.04f);
                                m2313b3.f4745R += C0758f.m2084c(-0.04f, 0.04f);
                            }
                        }
                    }
                    if (this.f6959en <= c0453l2.f3088dQ + c0453l2.f3089dR + 1.0f) {
                        if (this.f2845f > 2.0f) {
                            z3 = true;
                        }
                        if (this.f6959en < c0453l2.f3088dQ + c0453l2.f3089dR) {
                            this.f6959en = c0453l2.f3088dQ + c0453l2.f3089dR;
                        }
                        this.f2845f = 0.0f;
                    }
                } else {
                    if (this.f2845f > 2.0f) {
                        z3 = true;
                    }
                    this.f2845f = 0.0f;
                }
                if (z3 && (m2309c = m1072A2.f6116bR.m2309c(this.f6957el, this.f6958em, this.f6959en, 0)) != null) {
                    m2309c.f4735H = 0.8f;
                    m2309c.f4734G = 1.4f;
                    m2309c.f4750W = 60.0f;
                    m2309c.f4751X = m2309c.f4750W;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (c0453l2.f2972bg) {
            z5 = true;
        }
        if (this.f2865z != null && this.f2865z.f2972bg) {
            z5 = true;
        }
        if (z5) {
            AbstractC0224s m3318d = this.f2878dK.m3318d();
            boolean z6 = false;
            if (m3318d != null) {
                if (m3318d instanceof C0342g) {
                    C0342g c0342g = (C0342g) m3318d;
                    C0339d c0339d = c0342g.f2149a;
                    boolean z7 = false;
                    z6 = c0342g.m4132L();
                    if (c0339d.f2058k != null && (mo3465c = c0339d.f2058k.mo3465c()) != null && (mo3465c instanceof C0453l)) {
                        z4 = true;
                        if (mo3465c != c0453l2) {
                            if (this.f2865z != null) {
                                AbstractC0197n.m4614b((AbstractC0244am) this);
                                m3699a(this.f2865z, false, false, this.f2866A);
                                this.f2865z = null;
                                this.f2866A = null;
                                c0453l2 = this.f2863x;
                                AbstractC0197n.m4598c(this);
                            }
                            AbstractC0197n.m4614b((AbstractC0244am) this);
                            this.f2865z = c0453l2;
                            this.f2866A = c0339d.f2059l;
                            m3699a((C0453l) mo3465c, false, false, c0339d.f2059l);
                            c0453l2 = this.f2863x;
                            AbstractC0197n.m4598c(this);
                        }
                    }
                    if (c0339d.f2095V != null) {
                        float floatValue = c0339d.f2095V.floatValue();
                        if (c0339d.f2098Y) {
                            float f14 = this.f6957el;
                            float f15 = this.f6958em;
                            C0499j m3324b = this.f2878dK.m3324b();
                            if (m3324b != null) {
                                float f16 = Float.MIN_VALUE;
                                float f17 = Float.MIN_VALUE;
                                if (m3324b.f3493i != null) {
                                    f16 = m3324b.f3493i.f6957el;
                                    f17 = m3324b.f3493i.f6958em;
                                } else if (m3324b.f3492h != null) {
                                    f16 = m3324b.f3492h.f227a;
                                    f17 = m3324b.f3492h.f228b;
                                }
                                if (f16 > Float.MIN_VALUE) {
                                    floatValue += C0758f.m2071d(f14, f15, f16, f17);
                                }
                            }
                        }
                        if (c0339d.f2099Z == null) {
                            a = m2939a(f, floatValue, true, c0339d.f2096W);
                        } else {
                            int i6 = c0339d.f2099Z.f2547e;
                            a = m2942a(f, floatValue, i6);
                            C0247ap c0247ap = this.f1649cJ[i6];
                            c0247ap.m4291b(5);
                            c0247ap.f1713b = c0247ap.f1712a;
                        }
                        if (c0339d.f2097X && C0758f.m2085c(a) > 5.0f) {
                            z7 = true;
                        }
                    }
                    if (c0339d.f2094U != null && !z7) {
                        this.f2841b.m3859a(c0339d.f2094U.m3473b(), 10);
                    }
                    if (z7) {
                        this.f2878dK.f3503e = 0.0f;
                    }
                }
                if (c0453l2.f3069dw != null && m3318d.mo5648i() != null && this.f2878dK.f3503e >= c0453l2.f3069dw.f2821q) {
                    this.f2841b.m3859a(c0453l2.f3069dw, 5);
                }
            }
            this.f2846g = z6;
            if (this.f2846g) {
                this.f1614ca = 0.0f;
                this.f1615cb = 0.0f;
                this.f1617cd = 0.0f;
            }
        }
        if (this.f2865z != null && !z4) {
            AbstractC0197n.m4614b((AbstractC0244am) this);
            m3699a(this.f2865z, false, false, this.f2866A);
            this.f2865z = null;
            this.f2866A = null;
            C0453l c0453l3 = this.f2863x;
            AbstractC0197n.m4598c(this);
        }
        this.f2841b.m3861a(f);
        m3680b(f, z);
        C0453l c0453l4 = this.f2863x;
    }

    /* renamed from: cw */
    public float mo3354cw() {
        int i = this.f2863x.f3238cm.f2699b;
        if (!this.f2855p) {
            return 0.0f;
        }
        return i * this.f2863x.f3024cq;
    }

    /* renamed from: cx */
    public C0439f m3620cx() {
        if (!this.f2855p) {
            return C0439f.f2801a;
        }
        return this.f2863x.f3239cn;
    }

    /* renamed from: cy */
    public C0439f m3619cy() {
        if (!this.f2855p) {
            return C0439f.f2801a;
        }
        return this.f2863x.f3240co;
    }

    /* renamed from: a */
    public boolean mo3231a(int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        return m3704a(this.f2863x.f3269fO[i], i, abstractC0244am, z, z2);
    }

    /* renamed from: a */
    public final boolean m3705a(C0411bl c0411bl, int i, float f, float f2, boolean z) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f, f2);
        if (m2157a > c0411bl.f2599ae) {
            if (this.f1609bV == m1072A.f6099bs) {
                m1072A.f6117bS.m1806b("Location too far");
                return false;
            }
            return false;
        } else if (m2157a < c0411bl.f2602ah) {
            if (this.f1609bV == m1072A.f6099bs) {
                m1072A.f6117bS.m1806b("Location too close");
                return false;
            }
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m3704a(C0411bl c0411bl, int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        float f;
        if (!z && (c0411bl.f2577I || z2)) {
            float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, abstractC0244am.f6957el, abstractC0244am.f6958em);
            if (m2157a > c0411bl.f2599ae || m2157a < c0411bl.f2602ah) {
                return false;
            }
        }
        if (!c0411bl.f2576H) {
            return true;
        }
        if (c0411bl.f2603ai != -1.0f) {
            if (c0411bl.f2565w != -1) {
                f = this.f1649cJ[c0411bl.f2565w].f1712a + c0411bl.f2552j;
            } else {
                f = this.f1618ce + c0411bl.f2552j;
            }
            if (C0758f.m2085c(C0758f.m2083c(f, C0758f.m2071d(this.f6957el, this.f6958em, abstractC0244am.f6957el, abstractC0244am.f6958em), 360.0f)) > c0411bl.f2603ai) {
                return false;
            }
        }
        if (c0411bl.f2582N != null && !c0411bl.f2582N.read(this)) {
            return false;
        }
        if (c0411bl.f2583O != null && !C0448g.m3753a(c0411bl.f2583O, abstractC0244am.m4331dc())) {
            return false;
        }
        if (c0411bl.f2584P != null && C0448g.m3753a(c0411bl.f2584P, abstractC0244am.m4331dc())) {
            return false;
        }
        if (abstractC0244am.mo2981i()) {
            if (c0411bl.f2578J != null) {
                return c0411bl.f2578J.read(this);
            }
            return true;
        } else if (abstractC0244am.mo2995Q()) {
            if (c0411bl.f2580L != null) {
                return c0411bl.f2580L.read(this);
            }
            return true;
        } else if (c0411bl.f2581M != null && !c0411bl.f2581M.read(this) && !abstractC0244am.m4375cG()) {
            return false;
        } else {
            if (c0411bl.f2579K != null) {
                return c0411bl.f2579K.read(this);
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (!c0411bl.f2570B || !m3704a(c0411bl, i, abstractC0244am, false, false)) {
            return;
        }
        for (int i2 = 0; i2 < this.f2863x.f3269fO.length; i2++) {
            C0411bl c0411bl2 = this.f2863x.f3269fO[i2];
            if (c0411bl2 != null && i2 != i && c0411bl2.f2609ao != null && c0411bl2.f2609ao == c0411bl && this.f1649cJ[i2].f1716e < 9000.0f - ((mo2992b(i) * 0.5f) - c0411bl2.f2556n)) {
                this.f1649cJ[i2].f1716e = 0.0f;
            }
        }
        if (c0411bl.f2565w != -1) {
            C0411bl c0411bl3 = this.f2863x.f3269fO[c0411bl.f2565w];
            if (!c0411bl3.f2570B && c0411bl3.f2558p != 0.0f) {
                this.f1649cJ[c0411bl.f2565w].f1716e = mo2992b(c0411bl.f2565w) + m3569t(c0411bl.f2565w);
            }
        }
        this.f2841b.m3858a(this.f2863x.f3253ds, 11, true);
        m3672b(c0411bl);
        m3713a(abstractC0244am, -1.0f, -1.0f, i, (C0405bf) null, 0);
    }

    /* renamed from: a */
    public boolean m3706a(C0411bl c0411bl) {
        if (c0411bl.f2563u > 0.0f && (c0411bl.f2563u > this.f1639cz || this.f2861v)) {
            return false;
        }
        if (c0411bl.f2564v != null && !c0411bl.f2564v.mo3868b(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m3672b(C0411bl c0411bl) {
        if (c0411bl.f2563u > 0.0f) {
            this.f1639cz -= c0411bl.f2563u;
            if (this.f1639cz < c0411bl.f2563u && this.f2863x.f3043cP) {
                this.f2861v = true;
            }
        }
        if (c0411bl.f2564v != null) {
            c0411bl.f2564v.mo3874a(this);
        }
    }

    /* renamed from: a */
    public static C0188f m3711a(AbstractC0244am abstractC0244am, int i, C0405bf c0405bf, float f, float f2, float f3, float f4) {
        C0188f m4716a = C0188f.m4716a(abstractC0244am, f, f2, f3, i);
        m3719a(m4716a, abstractC0244am, i, c0405bf, f, f2, f3, f4);
        return m4716a;
    }

    /* renamed from: a */
    public static void m3719a(C0188f c0188f, AbstractC0244am abstractC0244am, int i, C0405bf c0405bf, float f, float f2, float f3, float f4) {
        C0745e m2324a;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        c0188f.f1051az = f4;
        c0188f.f1072aT = f4;
        if (abstractC0244am == null) {
            throw new RuntimeException("Source cannot be null");
        }
        c0188f.f981g = c0405bf;
        c0188f.f1007G = c0405bf.f1137aI;
        c0188f.f1069aR = c0405bf.f1201aJ;
        c0188f.f1021U = c0405bf.f1100b;
        c0188f.f1025Y = c0405bf.f1101c;
        if (!c0405bf.f1141aN && (abstractC0244am instanceof C0451j)) {
            C0451j c0451j = (C0451j) abstractC0244am;
            c0188f.f1021U *= c0451j.f2864y.f2243f;
            c0188f.f1025Y *= c0451j.f2864y.f2243f;
        }
        c0188f.f1026Z = c0405bf.f1153i;
        if (c0405bf.f1156l) {
            c0188f.f1027aa = false;
            c0188f.f1028ab = true;
        } else {
            c0188f.f1027aa = !c0405bf.f1155k;
        }
        c0188f.f1029ac = c0405bf.f1158n;
        if (c0405bf.f1157m) {
            c0188f.f1030ad = true;
            c0188f.f1031ae = false;
        }
        c0188f.f1004D = c0405bf.f1160p;
        c0188f.f1077aY = c0405bf.f1161q;
        c0188f.f1078aZ = c0405bf.f1162r;
        if (c0405bf.f1159o < 0.5d) {
            c0188f.f1003C = true;
        } else {
            c0188f.f1008H = c0405bf.f1159o;
        }
        c0188f.f982h = c0405bf.f1108v;
        c0188f.f983i = c0405bf.f1107u;
        c0188f.f994t = c0405bf.f1165w;
        if (c0405bf.f1140aM != 0.0f) {
            c0188f.f994t += C0758f.m2136a((AbstractC1120w) abstractC0244am, (int) ((-c0405bf.f1140aM) * 100.0f), (int) (c0405bf.f1140aM * 100.0f), 1) / 100.0f;
        }
        if (c0405bf.f1121T && i != -1) {
            c0188f.f1046au = abstractC0244am;
            if (abstractC0244am instanceof AbstractC0623y) {
                c0188f.f1047av = i;
                C1080ai m2968D = ((AbstractC0623y) abstractC0244am).m2968D(i);
                c0188f.f1048aw = m2968D.f6849a;
                c0188f.f1049ax = m2968D.f6850b;
                c0188f.f1050ay = abstractC0244am.f6959en + m2968D.f6851c;
            } else {
                c0188f.f1048aw = abstractC0244am.f6957el;
                c0188f.f1049ax = abstractC0244am.f6958em;
                c0188f.f1050ay = abstractC0244am.f6959en;
            }
        }
        c0188f.f997w = c0405bf.f1113D;
        c0188f.f995u = c0405bf.f1114E;
        c0188f.f996v = c0405bf.f1115F;
        c0188f.f1032af = c0405bf.f1142aO;
        c0188f.f1033ag = c0405bf.f1143aP;
        c0188f.f1034ah = c0405bf.f1144aQ;
        c0188f.f1035ai = c0405bf.f1202aR;
        c0188f.f1037ak = c0405bf.f1203aS;
        c0188f.f1038al = c0405bf.f1204aT;
        c0188f.f1039am = c0405bf.f1205aU;
        c0188f.f1040an = c0405bf.f1145aV;
        if (c0405bf.f1206aW > 0.0f) {
            c0188f.f1041ao = true;
            c0188f.f1023W = c0405bf.f1206aW;
            c0188f.f1024X = c0188f.f1023W;
        }
        c0188f.f1043ar = c0405bf.f1197aE;
        if (c0405bf.f1199aG != 0.0f) {
            float f5 = c0405bf.f1200aH;
            int m5437a = Color.m5437a(c0188f.f1043ar);
            int m5433b = (int) (Color.m5433b(c0188f.f1043ar) * f5);
            int m5432c = (int) (Color.m5432c(c0188f.f1043ar) * f5);
            int m5431d = (int) (Color.m5431d(c0188f.f1043ar) * f5);
            int m4657H = abstractC0244am.f1609bV.m4657H();
            c0188f.f1043ar = Color.m5435a(m5437a, C0758f.m2101b((int) (m5433b + (Color.m5433b(m4657H) * c0405bf.f1199aG)), 0, 255), C0758f.m2101b((int) (m5432c + (Color.m5432c(m4657H) * c0405bf.f1199aG)), 0, 255), C0758f.m2101b((int) (m5431d + (Color.m5431d(m4657H) * c0405bf.f1199aG)), 0, 255));
        }
        c0188f.f1016P = c0405bf.f1166x;
        c0188f.f1018R = c0405bf.f1109y;
        c0188f.f1019S = !c0405bf.f1110A;
        c0188f.f1017Q = c0405bf.f1167z;
        if (c0405bf.f1111B != null) {
            c0188f.f1016P = (short) 0;
            c0188f.f1018R = (short) 0;
        }
        c0188f.f998x = c0405bf.f1198aF;
        c0188f.f987m = c0405bf.f1163s;
        c0188f.f1001A = c0405bf.f1168I;
        c0188f.f1013M = c0405bf.f1177V;
        c0188f.f1002B = c0405bf.f1178W;
        c0188f.f1059aH = c0405bf.f1180ae;
        c0188f.f1058aG = c0405bf.f1191aw;
        c0188f.f1064aM = c0405bf.f1181af;
        if (c0405bf.f1129ai != null) {
            c0405bf.f1129ai.m3459a(c0188f.f6957el, c0188f.f6958em, c0188f.f6959en, c0188f.f1051az, c0188f);
        }
        if (c0405bf.f1184ao != -1) {
            boolean z = false;
            C0745e c0745e = c0188f.f1067aP;
            if (c0745e != null && c0745e.f4718b == c0188f && c0745e.f4720d && c0745e != null) {
                if (c0745e.f4750W < 150.0f) {
                    c0745e.f4750W = 200.0f;
                }
                z = true;
            }
            if (!z && (m2324a = m1072A.f6116bR.m2324a(c0188f, c0405bf.f1184ao, c0405bf.f1185ap)) != null) {
                if (c0405bf.f1134aq) {
                    m2324a.f4719c = true;
                }
                if (c0405bf.f1171L) {
                    c0188f.f1067aP = m2324a;
                }
            }
        }
        c0188f.f1068aQ = c0405bf.f1186ar;
        if (c0405bf.f1187as != -1.0f) {
            c0188f.f1060aI = c0405bf.f1187as;
        }
        if (c0405bf.f1188at != -1.0f) {
            c0188f.f1061aJ = c0405bf.f1188at;
        }
        c0188f.f1063aL = -1.0f;
        if (c0405bf.f1189au != -1.0f) {
            c0188f.f992r = c0405bf.f1189au;
        }
        c0188f.f993s = c0405bf.f1190av;
        if (c0405bf.f1148aZ != null) {
        }
        c0188f.f1056aE = c0405bf.f1152bd;
        c0188f.f6955ej = abstractC0244am.f6955ej;
        if (c0188f.f6955ej < 4 && f3 >= -1.0f) {
            c0188f.f6955ej = 4;
        }
        if (c0405bf.f1176U) {
            c0188f.f6955ej = 1;
        }
    }

    /* renamed from: a */
    public C0188f m3713a(AbstractC0244am abstractC0244am, float f, float f2, int i, C0405bf c0405bf, int i2) {
        C0405bf c0405bf2;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2621aA != null) {
            this.f2841b.m3858a(c0411bl.f2621aA.m3473b(), 6, true);
        }
        if (c0411bl.f2622aB > 0.0f) {
            m2844b(c0411bl.f2622aB);
        }
        if (c0411bl.f2623aC != null) {
            c0411bl.f2623aC.m3469a(this, new PointF(f, f2), abstractC0244am, i2 + 1);
        }
        if (c0405bf == null) {
            c0405bf2 = this.f2863x.f3174fP[c0411bl.m3948a(this)];
        } else {
            c0405bf2 = c0405bf;
        }
        PointF mo3237K = mo3237K(i);
        C1080ai m3734D = m3734D(i);
        if (c0411bl.f2629aI > 0) {
            for (int i3 = 0; i3 < c0411bl.f2629aI; i3++) {
                if (this.f2867B != null && this.f2867B.size() > 0) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) this.f2867B.remove(this.f2867B.size() - 1);
                    C0247ap c0247ap = this.f1649cJ[i];
                    C1117y.m464a(abstractC0244am2, this);
                    abstractC0244am2.f6957el = m3734D.f6849a;
                    abstractC0244am2.f6958em = m3734D.f6850b;
                    abstractC0244am2.f1618ce = c0247ap.f1712a;
                    if (abstractC0244am2 instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                        abstractC0623y.m2845az();
                        if (abstractC0244am != null) {
                            abstractC0623y.m2751n(abstractC0244am);
                        } else {
                            abstractC0623y.m2785e(f, f2);
                        }
                    }
                }
            }
        }
        C0188f c0188f = null;
        if (c0405bf2.f1171L && c0405bf == null) {
            if (this.f2872G == null) {
                this.f2872G = new C0188f[31];
            }
            if (this.f2872G[i] != null && !this.f2872G[i].f6952eg) {
                c0188f = this.f2872G[i];
                c0188f.m4717a(this, m3734D.f6849a, m3734D.f6850b, this.f6959en + m3734D.f6851c);
                if (!c0405bf2.f1173N && c0188f.f1042ap != null) {
                    c0188f.f1042ap.clear();
                }
            }
        }
        this.f1588bB = (int) (this.f1588bB + 1 + this.f6951ee);
        float f3 = this.f1649cJ[i].f1712a;
        boolean z = false;
        if (c0188f == null) {
            c0188f = C0188f.m4716a(this, m3734D.f6849a, m3734D.f6850b, this.f6959en + m3734D.f6851c, i);
            if (c0405bf2.f1171L && c0405bf == null) {
                this.f2872G[i] = c0188f;
            }
        } else {
            c0188f.f981g = c0405bf2;
            z = true;
        }
        m3719a(c0188f, this, i, c0405bf2, m3734D.f6849a, m3734D.f6850b, this.f6959en + m3734D.f6851c, f3);
        c0405bf2.m3966a(this, c0188f, abstractC0244am, f, f2, mo2978m());
        if (!z && c0405bf2.f1119R == 0.0f && c0405bf2.f1120S == 0.0f) {
            c0188f.f1011K = mo3237K.f227a;
            c0188f.f1012L = mo3237K.f228b;
        }
        if (c0411bl.f2575G != null) {
            m1072A.f6116bR.m2333a(m3734D.f6849a, m3734D.f6850b, this.f6959en + m3734D.f6851c, c0411bl.f2575G.intValue());
        }
        if (c0411bl.f2573E != null) {
            c0411bl.f2573E.m3459a(m3734D.f6849a, m3734D.f6850b, this.f6959en + m3734D.f6851c, this.f1649cJ[i].f1712a, this);
        }
        if (c0411bl.f2572D != null) {
            c0411bl.f2572D.m3954a(m3734D.f6849a, m3734D.f6850b, 1.0f + C0758f.m2084c(-0.07f, 0.07f));
        }
        if (this.f2863x.f3099ee) {
            this.f3896Q = null;
        }
        if (c0411bl.f2619ay) {
            this.f1649cJ[i].f1721j = null;
        }
        if (this.f2863x.f2975bj && !this.f1607bT) {
            m3650bv();
        }
        if (this.f2863x.f2977bl && !this.f1607bT) {
            mo2635a();
            this.f1607bT = true;
        }
        return c0188f;
    }

    /* renamed from: m */
    public float mo2978m() {
        return this.f2864y.f2246i;
    }

    /* renamed from: y */
    public int mo3077y() {
        if (this.f2864y.f2252o != -1) {
            return this.f2864y.f2252o;
        }
        return super.mo3077y();
    }

    /* renamed from: u */
    public int mo3079u(AbstractC0244am abstractC0244am) {
        int mo4261a = abstractC0244am.mo5649r().mo4261a(this);
        if (this.f2863x.f3228aW != -1) {
            if (this.f2863x.f2965aX) {
                int i = (int) (this.f2863x.f3228aW + this.f1621ch);
                if (abstractC0244am != null) {
                    i = (int) (i + abstractC0244am.f1621ch);
                }
                return i + mo4261a;
            }
            return this.f2863x.f3228aW + mo4261a;
        }
        return mo3077y() + mo4261a;
    }

    /* renamed from: v */
    public int mo3078v(AbstractC0244am abstractC0244am) {
        int mo4261a = abstractC0244am.mo5649r().mo4261a(this);
        if (this.f2863x.f3229aY != -1) {
            if (this.f2863x.f2966aZ) {
                int i = (int) (this.f2863x.f3229aY + this.f1621ch);
                if (abstractC0244am != null) {
                    i = (int) (i + abstractC0244am.f1621ch);
                }
                return i + mo4261a;
            }
            return this.f2863x.f3229aY + mo4261a;
        }
        return mo3077y() + mo4261a;
    }

    /* renamed from: w */
    public boolean m3568w(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2966aZ;
    }

    /* renamed from: x */
    public boolean m3566x(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2965aX;
    }

    /* renamed from: cv */
    public float m3621cv() {
        return this.f2863x.f2971bf;
    }

    /* renamed from: c */
    public float mo3112c(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2967ba;
    }

    /* renamed from: z */
    public float m3563z(AbstractC0244am abstractC0244am) {
        float f = this.f2863x.f2968bb;
        if (abstractC0244am.mo3250g() > 0.0f) {
            f = abstractC0244am.mo3250g() * this.f2863x.f3230bc;
        }
        return f;
    }

    /* renamed from: f */
    public float m3586f(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2969bd;
    }

    /* renamed from: b */
    public float mo3113b(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2970be;
    }

    /* renamed from: z */
    public float mo2976z() {
        return this.f2864y.f2247j * this.f2849j;
    }

    /* renamed from: aZ */
    public float m3688aZ() {
        return this.f2863x.f3102eh;
    }

    /* renamed from: ba */
    public float m3657ba() {
        return this.f2863x.f3103ei;
    }

    /* renamed from: A */
    public float mo3006A() {
        return this.f2864y.f2248k;
    }

    /* renamed from: c */
    public float mo2991c(int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2589U != null) {
            return c0411bl.f2589U.floatValue();
        }
        return this.f2863x.f3094dZ;
    }

    /* renamed from: x */
    public float m3567x(int i) {
        return this.f2863x.f3269fO[i].f2585Q;
    }

    /* renamed from: w */
    public float mo3059w(int i) {
        return this.f2863x.f3269fO[i].f2590V;
    }

    /* renamed from: y */
    public float mo4196y(int i) {
        return this.f2863x.f3269fO[i].f2591W;
    }

    /* renamed from: B */
    public float mo3005B() {
        return this.f2863x.f3105em;
    }

    /* renamed from: cC */
    public float m3646cC() {
        return this.f2863x.f3233bH * this.f2842c;
    }

    /* renamed from: p */
    public float m3573p(int i) {
        return this.f2863x.f3234bI;
    }

    /* renamed from: d */
    public float mo3216d(boolean z) {
        if (!this.f2863x.f3072dz) {
            return 0.0f;
        }
        if (z && this.f2863x.f3074dB) {
            return this.f1649cJ[this.f2863x.f3076dD.f2547e].f1712a + 90.0f;
        }
        if (this.f2863x.f3073dA) {
            return this.f1649cJ[this.f2863x.f3076dD.f2547e].f1712a + 90.0f;
        }
        return super.mo3216d(z);
    }

    static {
        for (int i = 0; i < 10; i++) {
            f2888dU.add(new C0452k());
        }
        f2889dV = true;
        f2890dW = new HashMap();
        f2891dX = 0;
        f2892dY = VariableScope.nullOrMissingString;
        f2893dZ = new PointF();
        f2895eb = new C1080ai();
        f2896ec = new PointF();
    }

    /* renamed from: cW */
    public PointF m3635cW() {
        PointF pointF = f2873H;
        C0453l c0453l = this.f2863x;
        if (c0453l.f3073dA && this.f1649cJ[c0453l.f3076dD.f2547e].f1716e != 0.0f && c0453l.f3076dD.f2558p != 0.0f) {
            pointF.m5368a(mo3089G(c0453l.f3076dD.f2547e));
            pointF.m5367b(-this.f6957el, -this.f6958em);
            return pointF;
        }
        pointF.f227a = 0.0f;
        pointF.f228b = 0.0f;
        return pointF;
    }

    /* renamed from: aP */
    public PointF m3694aP() {
        PointF m3635cW = m3635cW();
        f2874I.m5369a(m3635cW.f227a + this.f2863x.f3036cH, m3635cW.f228b + this.f2863x.f3037cI);
        return f2874I;
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        C0934e mo3235T;
        float f2;
        float f3;
        C0453l c0453l = this.f2863x;
        boolean z = this.f1607bT;
        if (this.f2885dR != null && !z) {
            C0393g.m3997a(this, f, false, false);
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        InterfaceC1027y interfaceC1027y = m1072A.f6113bO;
        Paint m3695aN = m3695aN();
        float m3646cC = m3646cC();
        PointF m3635cW = m3635cW();
        mo4201aQ();
        int i = c0453l.f3197i.f6894a;
        if (i > 0) {
            Object[] m534a = c0453l.f3197i.m534a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((AbstractC0387a) m534a[i2]).mo4002d(this, f);
            }
        }
        if (this.f4232et) {
            float f4 = (this.f6957el + m3635cW.f227a) - m1072A.f6144cv;
            float f5 = ((this.f6958em + m3635cW.f228b) - m1072A.f6145cw) - this.f6959en;
            if (m3646cC != 1.0f) {
                interfaceC1027y.mo135k();
                interfaceC1027y.mo226a(m3646cC, m3646cC, f4, f5);
            }
            interfaceC1027y.mo199a(this.f3885L, f4, f5, mo3216d(false) - 90.0f, m3695aN);
            if (m3646cC != 1.0f) {
                interfaceC1027y.mo134l();
            }
        } else {
            RectF mo3370cE = mo3370cE();
            float f6 = m3635cW.f227a;
            float f7 = m3635cW.f228b - this.f6959en;
            mo3370cE.f234a += f6;
            mo3370cE.f235b += f7;
            mo3370cE.f236c += f6;
            mo3370cE.f237d += f7;
            Rect mo3182a_ = mo3182a_(false);
            float f8 = (mo3370cE.f234a + mo3370cE.f236c) * 0.5f;
            float f9 = (mo3370cE.f235b + mo3370cE.f237d) * 0.5f;
            interfaceC1027y.mo135k();
            if (m3646cC != 1.0f) {
                interfaceC1027y.mo226a(m3646cC, m3646cC, f8, f9);
            }
            interfaceC1027y.mo227a(mo3216d(false), f8, f9);
            interfaceC1027y.mo192a(this.f3885L, mo3182a_, mo3370cE, m3695aN);
            interfaceC1027y.mo134l();
        }
        if (i > 0) {
            Object[] m534a2 = c0453l.f3197i.m534a();
            for (int i3 = i - 1; i3 >= 0; i3--) {
                ((AbstractC0387a) m534a2[i3]).mo4001e(this, f);
            }
        }
        C1117y.m462a((AbstractC0623y) this);
        if (this.f2885dR != null && !z && c0453l.f3224ax) {
            C0393g.m3997a(this, f, true, false);
        }
        if (m3684ak() && c0453l.f3273fT != null && !z) {
            float mo2985e = this.f1649cJ[c0453l.f3273fT.f2547e].f1717f / mo2985e(c0453l.f3273fT.f2547e);
            if (mo2985e != 0.0f) {
                boolean z2 = true;
                boolean Y = m2945Y();
                if (Y && c0453l.f3010bW) {
                    z2 = false;
                } else if (!Y && c0453l.f3006bS) {
                    z2 = false;
                }
                if (z2 && c0453l.f3269fO[c0453l.f3273fT.f2547e].f2626aF == null) {
                    C1080ai bn = m2809bn();
                    m1072A.f6113bO.mo135k();
                    m1072A.f6113bO.mo168b(bn.f6849a - m1072A.f6144cv, ((bn.f6850b - bn.f6851c) - m1072A.f6145cw) - this.f6959en);
                    m1072A.f6113bO.mo228a(mo2985e, mo2985e);
                    if (Y) {
                        m1072A.f6113bO.mo198a(C0519b.f3586f, 0.0f, 0.0f, (Paint) null);
                    } else {
                        m1072A.f6113bO.mo198a(C0519b.f3585e, 0.0f, 0.0f, (Paint) null);
                    }
                    m1072A.f6113bO.mo134l();
                }
            }
        }
        if (c0453l.f3173fN && !z) {
            int mo3084bl = mo3084bl();
            for (int i4 = 0; i4 < mo3084bl; i4++) {
                float mo2985e2 = this.f1649cJ[i4].f1717f / mo2985e(i4);
                C0411bl c0411bl = c0453l.f3269fO[i4];
                if (c0411bl != null && mo2985e2 != 0.0f && c0411bl.f2626aF != null) {
                    C1117y.m460a(this, c0411bl.f2626aF, mo2985e2, i4);
                }
            }
        }
        if (!z && this.f1635cv > 0.0f && this.f1637cx == 0.0f && (mo3235T = mo3235T()) != null) {
            if (!c0453l.f3046cS) {
                f2 = 0.0f + 0.09f + ((this.f1635cv / this.f1638cy) * 0.4f) + ((C0758f.m2107b(this.f1636cw, 50.0f) / 50.0f) * 0.5f);
            } else {
                float m2107b = 0.0f + ((C0758f.m2107b(this.f1636cw, 50.0f) / 50.0f) * 0.5f);
                float f10 = this.f1636cw;
                if (f10 > 5.0f) {
                    f10 = 5.0f;
                }
                f2 = m2107b + ((f10 / 5.0f) * 0.2f);
            }
            if (f2 > 0.0f) {
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                if (this.f2875J == null) {
                    this.f2875J = C1117y.m480a();
                }
                Paint paint = this.f2875J;
                paint.m5420a((int) (f2 * 255.0f), 255, 255, 255);
                float f11 = this.f6957el - m1072A.f6144cv;
                float f12 = (this.f6958em - m1072A.f6145cw) - this.f6959en;
                if (!c0453l.f3222au) {
                    f3 = ((c0453l.f3054dd * 2) / 87.0f) * 1.25f;
                } else {
                    f3 = ((c0453l.f3054dd * 2) / mo3235T.f6402p) * 1.25f;
                }
                m1072A.f6113bO.mo135k();
                m1072A.f6113bO.mo226a(f3, f3, f11, f12);
                m1072A.f6113bO.mo199a(mo3235T, f11, f12, mo3216d(false) - 90.0f, paint);
                m1072A.f6113bO.mo134l();
            }
        }
        if (i > 0) {
            Object[] m534a3 = c0453l.f3197i.m534a();
            for (int i5 = i - 1; i5 >= 0; i5--) {
                ((AbstractC0387a) m534a3[i5]).mo4003c(this, f);
            }
            return true;
        }
        return true;
    }

    /* renamed from: T */
    public C0934e mo3235T() {
        return this.f2863x.f3221at;
    }

    /* renamed from: C */
    public float mo3004C() {
        return this.f2863x.f3083dK;
    }

    /* renamed from: D */
    public float mo3003D() {
        return this.f2863x.f3084dL;
    }

    /* renamed from: bi */
    public boolean mo3219bi() {
        return this.f2863x.f3090dV;
    }

    /* renamed from: bj */
    public boolean mo3218bj() {
        return this.f2863x.f3091dW;
    }

    /* renamed from: l */
    public boolean mo2979l() {
        return this.f2863x.f3106en;
    }

    /* renamed from: ag */
    public boolean mo3064ag() {
        return this.f2863x.f3108ep.read(this);
    }

    /* renamed from: af */
    public boolean mo3065af() {
        return this.f2863x.f3107eo.read(this);
    }

    /* renamed from: ae */
    public boolean mo3066ae() {
        return this.f2863x.f3109eq.read(this);
    }

    /* renamed from: ah */
    public boolean mo3063ah() {
        if (this.f2863x.f3110er == null) {
            return true;
        }
        return this.f2863x.f3110er.read(this);
    }

    /* renamed from: k */
    public boolean m3577k(AbstractC0244am abstractC0244am) {
        C0453l c0453l = this.f2863x;
        if (c0453l.f3111es) {
            if (c0453l.f3112et != null && !C0448g.m3753a(c0453l.f3112et, abstractC0244am.m4331dc())) {
                return false;
            }
            if (c0453l.f3113eu != null && C0448g.m3753a(c0453l.f3113eu, abstractC0244am.m4331dc())) {
                return false;
            }
            if (c0453l.f3114ev) {
                boolean z = false;
                for (int i = 0; i < c0453l.f3269fO.length; i++) {
                    C0411bl c0411bl = c0453l.f3269fO[i];
                    if ((c0411bl.f2584P == null || !C0448g.m3753a(c0411bl.f2584P, abstractC0244am.m4331dc())) && (c0411bl.f2583O == null || C0448g.m3753a(c0411bl.f2583O, abstractC0244am.m4331dc()))) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        if (abstractC0244am.mo2981i()) {
            return mo3065af();
        }
        if (abstractC0244am.mo2995Q()) {
            return mo3066ae();
        }
        if (!mo3063ah() && !abstractC0244am.m4375cG()) {
            return false;
        }
        return mo3064ag();
    }

    /* renamed from: E */
    public boolean mo3002E() {
        return this.f2863x.f3115ew;
    }

    /* renamed from: g */
    public float mo2983g(int i) {
        return this.f2863x.f3269fO[i].f2592X;
    }

    /* renamed from: z */
    public float m3564z(int i) {
        return this.f2863x.f3269fO[i].f2596ab;
    }

    /* renamed from: A */
    public float m3738A(int i) {
        return this.f2863x.f3269fO[i].f2602ah;
    }

    /* renamed from: B */
    public float m3737B(int i) {
        return this.f2863x.f3269fO[i].f2552j;
    }

    /* renamed from: C */
    public float mo3095C(int i) {
        float f;
        float f2;
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2565w != -1) {
            f = this.f1649cJ[c0411bl.f2565w].f1712a;
        } else {
            f = this.f1618ce;
        }
        if (this.f1620cg && mo3071bc() > 0.95d) {
            f2 = f + c0411bl.f2553k;
        } else {
            f2 = f + c0411bl.f2552j;
        }
        if (c0411bl.f2612ar != 0.0f) {
            return 999.0f;
        }
        return f2;
    }

    /* renamed from: bm */
    public boolean mo4207bm() {
        return this.f2863x.f3081dI;
    }

    /* renamed from: q */
    public float mo3060q(int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (!c0411bl.f2570B) {
            return 0.0f;
        }
        C0405bf c0405bf = this.f2863x.f3174fP[c0411bl.m3948a(this)];
        float f = 0.0f;
        if (!c0405bf.f1163s) {
            f = 0.0f + c0405bf.f1100b;
        }
        float f2 = f + c0405bf.f1101c;
        if (!c0405bf.f1141aN) {
            f2 *= this.f2864y.f2243f;
        }
        return f2;
    }

    /* renamed from: b */
    public float mo2992b(int i) {
        return this.f2863x.f3269fO[i].f2555m * this.f2864y.f2242e;
    }

    /* renamed from: e */
    public float mo2985e(int i) {
        return this.f2863x.f3269fO[i].f2556n;
    }

    /* renamed from: f */
    public float mo2984f(int i) {
        return this.f2863x.f3269fO[i].f2557o;
    }

    /* renamed from: s */
    public boolean m3571s(int i) {
        return this.f2863x.f3269fO[i].f2561s;
    }

    /* renamed from: t */
    public float m3569t(int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2562t == 0.0f || c0411bl.f2556n == 0.0f) {
            return 0.0f;
        }
        return -(c0411bl.f2562t * (this.f1649cJ[i].f1717f / c0411bl.f2556n));
    }

    /* renamed from: r */
    public boolean mo3448r(int i) {
        if (this.f2863x.f3269fO[i].f2570B) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m3675b(AbstractC0244am abstractC0244am, int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2574F != null) {
            PointF mo3073E = mo3073E(i);
            c0411bl.f2574F.m3459a(mo3073E.f227a, mo3073E.f228b, this.f6959en, this.f1649cJ[i].f1712a, this);
        }
    }

    /* renamed from: u */
    public boolean mo3446u(int i) {
        if (!m3706a(this.f2863x.f3269fO[i])) {
            return false;
        }
        return super.mo3446u(i);
    }

    /* renamed from: s */
    public int m3570s(AbstractC0244am abstractC0244am) {
        return this.f2863x.f3118ez;
    }

    /* renamed from: bO */
    public boolean mo4171bO() {
        return this.f2863x.f3120eB;
    }

    /* renamed from: bP */
    public boolean mo4170bP() {
        return this.f2863x.f3121eC;
    }

    /* renamed from: bN */
    public float mo3075bN() {
        return this.f2864y.f2239b;
    }

    /* renamed from: cF */
    public boolean m3645cF() {
        return this.f2863x.f2941ap;
    }

    /* renamed from: a_ */
    public Rect mo3182a_(boolean z) {
        float f;
        if (z && !this.f2863x.f2941ap) {
            return super.mo3182a_(z);
        }
        if (this.f1607bT) {
            return super.mo3182a_(z);
        }
        C0453l c0453l = this.f2863x;
        int i = this.f2840a;
        int i2 = 0;
        C0455m c0455m = c0453l.f3078dF;
        if (this.f2841b.f2721a != null && this.f2841b.f2721a.f2815k != null) {
            c0455m = this.f2841b.f2721a.f2815k;
        }
        if (c0455m != null) {
            float f2 = c0455m.f3312b;
            if (f2 < 0.0f) {
                f2 = -f2;
                f = -this.f1618ce;
                if (c0455m.f3311a) {
                    f = -this.f1649cJ[c0453l.f3076dD.f2547e].f1712a;
                }
            } else {
                f = this.f1618ce;
                if (c0455m.f3311a) {
                    f = this.f1649cJ[c0453l.f3076dD.f2547e].f1712a;
                }
            }
            int i3 = (int) (360.0f / f2);
            int i4 = ((int) (((f - c0455m.f3315e) - (f2 * 0.5f)) / f2)) % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            if (c0455m.f3313c > 0) {
                i += i4 * c0455m.f3313c;
            }
            if (c0455m.f3314d > 0) {
                i2 = 0 + (i4 * c0455m.f3314d);
            }
        }
        if (i >= c0453l.f3210U) {
            i2 += i / c0453l.f3210U;
            i %= c0453l.f3210U;
        }
        return super.m4416a(z, i, i2);
    }

    /* renamed from: cE */
    public RectF mo3370cE() {
        RectF cE = super.mo3370cE();
        if (this.f2863x.f2939aj) {
            cE.m5352a(this.f2863x.f2936ag, this.f2863x.f2937ah - this.f2863x.f2938ai);
        }
        return cE;
    }

    /* renamed from: bl */
    public int mo3084bl() {
        if (this.f2863x == null) {
            return 1;
        }
        return this.f2863x.f3269fO.length;
    }

    /* renamed from: v */
    public int mo3445v(int i) {
        return this.f2863x.f3269fO[i].f2566x;
    }

    /* renamed from: F */
    public C1080ai m3731F(int i) {
        return m3720a(i, false);
    }

    /* renamed from: G */
    public PointF mo3089G(int i) {
        C1080ai m3720a = m3720a(i, false);
        f2876dI.f227a = m3720a.f6849a;
        f2876dI.f228b = m3720a.f6850b;
        return f2876dI;
    }

    /* renamed from: a */
    public C1080ai m3720a(int i, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2565w == -1) {
            f = this.f6957el;
            f2 = this.f6958em;
            f3 = 0.0f;
            f4 = this.f1618ce;
        } else if (z) {
            throw new RuntimeException("Turret can not be attached to turret that is not attached to the body");
        } else {
            C1080ai m3720a = m3720a(c0411bl.f2565w, true);
            f = m3720a.f6849a;
            f2 = m3720a.f6850b;
            f3 = m3720a.f6851c;
            f4 = this.f1649cJ[c0411bl.f2565w].f1712a;
        }
        if (this.f1649cJ[i].f1716e > 0.0f && c0411bl.f2558p != 0.0f) {
            float f5 = 0.0f;
            float mo2992b = (mo2992b(i) + m3569t(i)) - this.f1649cJ[i].f1716e;
            if (mo2992b < c0411bl.f2559q) {
                f5 = (mo2992b / c0411bl.f2559q) * c0411bl.f2558p;
            } else if (mo2992b < c0411bl.f2559q + c0411bl.f2560r) {
                f5 = c0411bl.f2558p - (((mo2992b - c0411bl.f2559q) / c0411bl.f2560r) * c0411bl.f2558p);
            }
            if (f5 != 0.0f) {
                f += C0758f.m2040i(this.f1649cJ[i].f1712a) * f5;
                f2 += C0758f.m2045h(this.f1649cJ[i].f1712a) * f5;
            }
        }
        float f6 = c0411bl.f2548f;
        float f7 = c0411bl.f2549g;
        float f8 = c0411bl.f2550h;
        if (f6 != 0.0f || f7 != 0.0f) {
            float m2045h = C0758f.m2045h(f4);
            float m2040i = C0758f.m2040i(f4);
            f += (m2040i * f7) - (m2045h * f6);
            f2 += ((m2045h * f7) + (m2040i * f6)) * c0411bl.f2551i;
        }
        f2877dJ.f6849a = f;
        f2877dJ.f6850b = f2;
        f2877dJ.f6851c = f3 + f8;
        return f2877dJ;
    }

    /* renamed from: N */
    public ArrayList mo3068N() {
        if (this.f2865z != null) {
            return this.f2865z.mo4262a(mo3273V());
        }
        return this.f2863x.mo4262a(mo3273V());
    }

    /* renamed from: a */
    public AbstractC0224s m3718a(C0208c c0208c) {
        C0453l c0453l;
        if (this.f2865z != null) {
            c0453l = this.f2865z;
        } else {
            c0453l = this.f2863x;
        }
        return c0453l.m3554a(c0208c);
    }

    /* renamed from: V */
    public int mo3273V() {
        return this.f2863x.f3020cj;
    }

    /* renamed from: e */
    public AbstractC0224s m3591e(InterfaceC0303as interfaceC0303as) {
        return this.f2878dK.m3322b(interfaceC0303as);
    }

    /* renamed from: a */
    public void mo3116a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (abstractC0224s == C0526i.f3644i) {
            if (!z) {
                m3726L();
            } else {
                m3725M();
            }
        } else if (abstractC0224s == C0526i.f3645j) {
            if (!z) {
                m3725M();
            }
        } else {
            if (!z) {
                if (pointF != null && !m3716a(abstractC0224s, pointF.f227a, pointF.f228b)) {
                    return;
                }
                if (abstractC0224s instanceof C0342g) {
                    C0342g c0342g = (C0342g) abstractC0224s;
                    if (c0342g.f2149a.f2120au != null) {
                        LoggerMaybe m1072A = LoggerMaybe.m1072A();
                        if (this.f1609bV == m1072A.f6099bs && !m1072A.m1065H()) {
                            c0342g.f2149a.f2120au.m3956a();
                        }
                    }
                    if (c0342g.f2149a.f2116aq != null) {
                        c0342g.f2149a.f2116aq.m3459a(this.f6957el, this.f6958em, this.f6959en, this.f1618ce, this);
                    }
                }
            }
            if (z && (abstractC0224s instanceof C0342g) && !((C0342g) abstractC0224s).f2149a.f2085L) {
                return;
            }
            C0499j m3336a = this.f2878dK.m3336a(abstractC0224s, z, pointF, abstractC0244am);
            if (!z) {
                if (m3336a != null) {
                    m3708a(EnumC0347ae.f2177f, (AbstractC0244am) null, abstractC0224s.mo4131P(), (VariableScope) null);
                }
            } else if (m3336a != null) {
                m3708a(EnumC0347ae.f2178g, (AbstractC0244am) null, abstractC0224s.mo4131P(), (VariableScope) null);
            }
        }
    }

    /* renamed from: a */
    public void mo3067a(AbstractC0224s abstractC0224s, boolean z) {
        mo3116a(abstractC0224s, z, (PointF) null, (AbstractC0244am) null);
    }

    /* renamed from: b */
    public void m3677b(AbstractC0224s abstractC0224s, boolean z) {
        this.f2878dK.m3337a(abstractC0224s, z);
    }

    /* renamed from: b */
    public void m3679b(AbstractC0224s abstractC0224s) {
        this.f2878dK.m3338a(abstractC0224s);
    }

    /* renamed from: a */
    public boolean m3716a(AbstractC0224s abstractC0224s, float f, float f2) {
        if (abstractC0224s instanceof C0342g) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            C0342g c0342g = (C0342g) abstractC0224s;
            if (c0342g.f2149a.f2105af != null && c0342g.f2149a.f2106ag == null) {
                if (c0342g.f2149a.f2105af.intValue() >= this.f2863x.f3269fO.length) {
                    m2901a("checkTargetedActionOrder: " + c0342g.f2149a.f2105af + " larger than max turret size");
                    return true;
                } else if (!m3705a(this.f2863x.f3269fO[c0342g.f2149a.f2105af.intValue()], c0342g.f2149a.f2105af.intValue(), f, f2, true)) {
                    return false;
                } else {
                    if (c0342g.f2149a.f2110ak != null && C1117y.m476a(f, f2, c0342g.f2149a.f2110ak)) {
                        if (this.f1609bV == m1072A.f6099bs) {
                            m1072A.f6117bS.m1806b("Invalid map location (Must be passable by " + c0342g.f2149a.f2110ak.name() + ")");
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m3717a(AbstractC0224s abstractC0224s) {
        AbstractC0224s m3718a;
        if ((abstractC0224s instanceof C0342g) && (m3718a = m3718a(abstractC0224s.m4507N())) != null) {
            C0342g c0342g = (C0342g) m3718a;
            Integer num = c0342g.f2149a.f2105af;
            if (num != null && c0342g.f2149a.f2106ag == null && num.intValue() < this.f2863x.f3269fO.length) {
                C0411bl c0411bl = this.f2863x.f3269fO[num.intValue()];
                if (c0411bl.f2601ag > 0.0f) {
                    C1117y.m452b((AbstractC0244am) this, c0411bl.f2601ag, true);
                }
                C1117y.m465a((AbstractC0244am) this, c0411bl.f2598ad, true, true);
            }
        }
        super.m2926a(abstractC0224s);
    }

    /* renamed from: a */
    public boolean m3715a(AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        PointF pointF2 = null;
        AbstractC0244am abstractC0244am2 = null;
        if (i > 0) {
            pointF2 = f2879dL;
            abstractC0244am2 = f2880dM;
        }
        f2879dL = pointF;
        f2880dM = abstractC0244am;
        boolean m3678b = m3678b(abstractC0224s, pointF, abstractC0244am, i);
        f2879dL = pointF2;
        f2880dM = abstractC0244am2;
        return m3678b;
    }

    /* renamed from: b */
    public boolean m3678b(AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (i > 10) {
            return false;
        }
        abstractC0224s.mo4503a(this, abstractC0244am);
        if (abstractC0224s instanceof C0342g) {
            C0342g c0342g = (C0342g) abstractC0224s;
            C0339d c0339d = c0342g.f2149a;
            if (c0339d.f2066s != null && !c0339d.f2066s.read(this)) {
                return true;
            }
            boolean z = false;
            if (c0339d.f2102ac != null) {
                this.f1639cz += c0342g.f2149a.f2102ac.floatValue();
                z = true;
            }
            if (c0339d.f2103ad != null) {
                c0339d.f2103ad.m3877h(this);
                z = true;
            }
            if (c0339d.f2104ae != null) {
                c0339d.f2104ae.m3915a((AbstractC0244am) this, this.f1609bV.m4662C(), true);
                z = true;
            }
            if (c0339d.f2130aE != null) {
                if (c0339d.f2130aE.read(this)) {
                    this.f1586bz = m1072A.f6102by;
                }
                z = true;
            }
            if (c0339d.f2105af != null) {
                PointF pointF2 = pointF;
                for (int i2 = 0; i2 < c0339d.f2109aj; i2++) {
                    if (c0339d.f2106ag != null) {
                        pointF2 = new PointF();
                        if (c0339d.f2107ah == null) {
                            pointF2.m5369a(this.f6957el, this.f6958em);
                        } else {
                            AbstractC0244am readUnit = c0339d.f2107ah.readUnit(this);
                            if (readUnit != null) {
                                pointF2.m5369a(readUnit.f6957el, readUnit.f6958em);
                            } else {
                                pointF2.m5369a(this.f6957el, this.f6958em);
                            }
                        }
                        float m2040i = C0758f.m2040i(this.f1618ce);
                        float m2045h = C0758f.m2045h(this.f1618ce);
                        float f = c0339d.f2106ag.f227a;
                        float f2 = c0339d.f2106ag.f228b;
                        pointF2.m5367b((m2040i * f2) - (m2045h * f), (m2045h * f2) + (m2040i * f));
                    }
                    if (pointF2 == null) {
                        C0831ad.m1449g("completeQueueItem:" + c0342g.m4507N() + " for fireTurretXAtGround needs points but it is missing");
                    } else {
                        m3713a((AbstractC0244am) null, pointF2.f227a, pointF2.f228b, c0342g.f2149a.f2105af.intValue(), c0342g.f2149a.f2108ai, i);
                    }
                }
                z = true;
            }
            if (c0339d.f2115ap != null) {
                c0339d.f2115ap.m3459a(this.f6957el, this.f6958em, this.f6959en, this.f1618ce, this);
                z = true;
            }
            if (c0339d.f2117ar != null) {
                c0339d.f2117ar.m3954a(this.f6957el, this.f6958em, 1.0f);
                z = true;
            }
            if (c0339d.f2118as != null && !m1072A.m1065H()) {
                c0339d.f2118as.m3956a();
                z = true;
            }
            if (c0339d.f2119at != null) {
                if (this.f1609bV == m1072A.f6099bs && !m1072A.m1065H()) {
                    c0339d.f2119at.m3956a();
                }
                z = true;
            }
            if (c0339d.f2101ab.f6894a > 0) {
                Object[] m534a = c0339d.f2101ab.m534a();
                for (int i3 = 0; i3 < c0339d.f2101ab.f6894a; i3++) {
                    if (((AbstractC0321a) m534a[i3]).mo4153a(this, abstractC0224s, pointF, abstractC0244am, i)) {
                        z = true;
                    }
                }
            }
            PointF pointF3 = pointF;
            AbstractC0244am abstractC0244am2 = abstractC0244am;
            if ((c0339d.f2113an != null || c0342g.f2149a.f2114ao != null) && c0339d.f2111al != null) {
                abstractC0244am2 = c0339d.f2111al.readUnit(this);
                pointF3 = new PointF();
                if (abstractC0244am2 != null) {
                    pointF3.f227a = abstractC0244am2.f6957el;
                    pointF3.f228b = abstractC0244am2.f6958em;
                } else {
                    pointF3.f227a = this.f6957el;
                    pointF3.f228b = this.f6958em;
                }
            }
            if (c0339d.f2113an != null) {
                if (c0339d.f2112am == null || c0339d.f2112am.read(this)) {
                    c0342g.f2149a.f2113an.m3469a(this, pointF3, abstractC0244am2, i + 1);
                }
                z = true;
            }
            if (c0342g.f2149a.f2114ao != null) {
                if (c0339d.f2112am == null || c0339d.f2112am.read(this)) {
                    c0342g.f2149a.f2114ao.m3470a(this, pointF3, abstractC0244am2);
                }
                z = true;
            }
            C0453l c0453l = null;
            if (c0339d.f2080G != null) {
                c0453l = c0339d.f2080G.mo3465c();
            }
            if (c0453l != null) {
                if (LoggerMaybe.f6193aw) {
                    LoggerMaybe.m983b(m4380cA() + ": converting unit: " + abstractC0224s.m4506O());
                }
                if (!(c0453l instanceof C0453l)) {
                    AbstractC0244am mo4263a = c0453l.mo4263a();
                    mo4263a.f6957el = this.f6957el;
                    mo4263a.f6958em = this.f6958em;
                    if (!mo4263a.m4402bI()) {
                        mo4263a.f1618ce = this.f1618ce;
                    }
                    mo4263a.m4312f(this.f1609bV);
                    mo4263a.m4437B(null);
                    float f3 = this.f1633ct;
                    float f4 = mo4263a.f1633ct;
                    if (f3 == 0.0f) {
                        mo4263a.m4306o(mo4263a.f1633ct);
                    } else {
                        mo4263a.m4306o((this.f1632cs / f3) * f4);
                    }
                    if (this.f1644cE) {
                        LoggerMaybe.m1072A().f6117bS.m1776k(mo4263a);
                    }
                    AbstractC0197n.m4598c(mo4263a);
                    m4351ch();
                } else {
                    C0449h c0449h = null;
                    if (c0339d.f2089P) {
                        c0449h = m3608dc();
                    }
                    AbstractC0197n.m4614b((AbstractC0244am) this);
                    this.f2865z = null;
                    m3699a(c0453l, false, false, c0339d.f2090Q);
                    if (c0449h != null) {
                        m3701a(c0449h, true);
                    }
                    mo3303S();
                    this.f2878dK.m3317e();
                    this.f1587bA = LoggerMaybe.m1072A().f6102by;
                    AbstractC0197n.m4598c(this);
                }
                z = true;
                if (!c0342g.mo4138B().m3899b()) {
                    m2947W();
                }
            }
            if (!z && c0339d.f2060m) {
                LoggerMaybe.LogDebug2("completeQueueItem:" + c0342g.m4507N() + " had no effect (but should have)");
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo3312b(C0499j c0499j) {
        AbstractC0224s m3718a = m3718a(c0499j.f3494j);
        if (m3718a != null && (m3718a instanceof C0342g)) {
            C0339d c0339d = ((C0342g) m3718a).f2149a;
            if (c0339d.f2100aa != null) {
                f2893dZ.f227a = this.f6957el;
                f2893dZ.f228b = this.f6958em;
                c0339d.f2100aa.m3469a(this, f2893dZ, null, 0);
            }
        }
    }

    /* renamed from: c */
    public boolean mo3311c(C0499j c0499j) {
        return true;
    }

    /* renamed from: i */
    public void m3580i(boolean z) {
        this.f2878dK.m3325a(z);
    }

    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        float f;
        AbstractC0224s m3718a = m3718a(c0499j.f3494j);
        if (m3718a != null && m3715a(m3718a, c0499j.f3492h, c0499j.f3493i, 0)) {
            return;
        }
        float f2 = 0.0f;
        if (this.f2863x.f2949aG && this.f2863x.f3059di != null) {
            f2 = this.f1618ce + this.f2863x.f3059di.floatValue() + 90.0f;
        }
        if (this.f2863x.f3062dl != null) {
            f = this.f2863x.f3062dl.floatValue();
        } else if (this.f2878dK.f3500b != null) {
            f = this.f1621ch * 3.0f;
        } else {
            f = this.f1621ch * 2.0f;
        }
        AbstractC0244am m3328a = this.f2878dK.m3328a(c0499j, f, this.f2857r, f2);
        if (m3328a != null) {
            m3730F(m3328a);
            AbstractC0197n.m4598c(m3328a);
            m4423a(EnumC0347ae.f2176e, m3328a);
        }
    }

    /* renamed from: E */
    public void m3732E(AbstractC0244am abstractC0244am) {
        float f = 0.0f;
        if (this.f2863x.f2949aG && this.f2863x.f3059di != null) {
            f = this.f1618ce + this.f2863x.f3059di.floatValue() + 90.0f;
        }
        abstractC0244am.f1618ce = 90.0f + f;
        float f2 = 70.0f;
        if (this.f2863x.f3062dl != null) {
            f2 = this.f2863x.f3062dl.floatValue();
        }
        this.f2878dK.m3333a(abstractC0244am, f2, this.f2857r);
    }

    /* renamed from: F */
    public void m3730F(AbstractC0244am abstractC0244am) {
        abstractC0244am.f6957el = this.f6957el + this.f2863x.f3057dg;
        abstractC0244am.f6958em = this.f6958em + this.f2863x.f3058dh;
        if (!this.f2863x.f2949aG) {
            float f = 180.0f;
            if (this.f2863x.f3059di != null) {
                f = this.f2863x.f3059di.floatValue();
            }
            float f2 = 70.0f;
            if (this.f2863x.f3062dl != null) {
                f2 = this.f2863x.f3062dl.floatValue();
            }
            boolean m3209a = C0526i.m3209a(this, abstractC0244am, this.f2857r, 7.0f, f, f2, this.f2863x.f3057dg, this.f2863x.f3058dh);
            if (!this.f2863x.f3061dk) {
                abstractC0244am.f6959en = this.f6959en;
            }
            abstractC0244am.f6959en += this.f2863x.f3060dj;
            if (abstractC0244am instanceof C0451j) {
                ((C0451j) abstractC0244am).m3614dD();
            }
            if ((mo2981i() || !m3209a || this.f2863x.f3132eS.read(this)) && m3624cq()) {
                m3735C(abstractC0244am);
            }
        }
        this.f2857r = !this.f2857r;
    }

    /* renamed from: by */
    public C0424b m3649by() {
        C1101m m3315g = this.f2878dK.m3315g();
        int size = m3315g.size();
        if (size == 0) {
            return C0424b.f2710a;
        }
        C0424b c0424b = new C0424b();
        Object[] m534a = m3315g.m534a();
        for (int i = 0; i < size; i++) {
            AbstractC0224s m3718a = m3718a(((C0499j) m534a[i]).f3494j);
            if (m3718a != null && (m3718a instanceof C0342g)) {
                C0342g c0342g = (C0342g) m3718a;
                if (c0342g.f2149a.f2102ac != null) {
                    c0424b.f2700c += c0342g.f2149a.f2102ac.floatValue();
                }
                if (c0342g.f2149a.f2103ad != null) {
                    C0424b c0424b2 = c0342g.f2149a.f2103ad;
                    if (!c0424b2.m3899b()) {
                        c0424b = C0424b.m3909a(c0424b, c0424b2);
                    }
                }
                if (c0342g.f2149a.f2104ae != null) {
                    C0424b c0424b3 = c0342g.f2149a.f2104ae;
                    if (!c0424b3.m3899b()) {
                        c0424b = C0424b.m3909a(c0424b, c0424b3);
                    }
                }
            }
        }
        return c0424b;
    }

    /* renamed from: dx */
    public boolean mo3306dx() {
        return this.f2863x.f3263eK > 0 && m3611dG() > this.f2863x.f3263eK;
    }

    /* renamed from: h */
    public int mo3304h(InterfaceC0303as interfaceC0303as) {
        return this.f2878dK.m3332a(interfaceC0303as);
    }

    /* renamed from: f */
    public int mo3305f(boolean z) {
        return this.f2878dK.m3339a(AbstractC0224s.f1462i, z, true);
    }

    /* renamed from: a */
    public int mo3313a(C0208c c0208c, boolean z) {
        return this.f2878dK.m3340a(c0208c, z);
    }

    /* renamed from: dt */
    public C0499j mo3310dt() {
        return this.f2878dK.m3324b();
    }

    /* renamed from: bD */
    public C0424b m3667bD() {
        return this.f2878dK.m3320c();
    }

    /* renamed from: du */
    public C1101m mo3309du() {
        return this.f2878dK.f3501c;
    }

    /* renamed from: dw */
    public void mo3307dw() {
        this.f2878dK.f3503e = 1.0f;
    }

    /* renamed from: dv */
    public boolean mo3308dv() {
        return this.f2878dK.m3342a();
    }

    /* renamed from: a */
    public int m3703a(C0448g c0448g) {
        return this.f2878dK.m3330a(c0448g);
    }

    /* renamed from: a */
    public void mo3314a(PointF pointF) {
        if (this.f2863x.f3051da) {
            this.f2878dK.f3500b = pointF;
        }
    }

    /* renamed from: a_ */
    public float m3687a_() {
        if (!this.f2863x.f2905s) {
            return -1.0f;
        }
        return super.m4415a_();
    }

    /* renamed from: bT */
    public boolean m3663bT() {
        return this.f2863x.f2906t;
    }

    /* renamed from: bU */
    public float m3662bU() {
        if (m4396bS() && !this.f2878dK.m3342a() && this.f2863x.f2911y) {
            return this.f2878dK.f3503e;
        }
        return super.m4394bU();
    }

    /* renamed from: bV */
    public float mo3189bV() {
        if (this.f2864y.f2241d > 0.0f && this.f1639cz < this.f2864y.f2241d && this.f2863x.f2907u) {
            return this.f1639cz / this.f2864y.f2241d;
        }
        if (this.f1638cy > 0.0f && this.f1635cv < this.f1638cy && this.f2863x.f2910x) {
            return this.f1635cv / this.f1638cy;
        }
        if (this.f2864y.f2241d == 0.0f && this.f1638cy == 0.0f) {
            if (this.f2863x.f3258ek != -1 && this.f1649cJ[this.f2863x.f3258ek].f1716e > 0.0f) {
                return 1.0f - (this.f1649cJ[this.f2863x.f3258ek].f1716e / mo2992b(this.f2863x.f3258ek));
            }
            if (this.f2863x.f3259el != -1 && this.f1649cJ[this.f2863x.f3259el].f1717f != 0.0f) {
                return this.f1649cJ[this.f2863x.f3259el].f1717f / mo2985e(this.f2863x.f3259el);
            }
        }
        return super.mo3189bV();
    }

    /* renamed from: f */
    public boolean mo2282f(float f) {
        return super.mo2282f(f);
    }

    /* renamed from: p */
    public void m3574p(float f) {
        int i = this.f2863x.f3197i.f6894a;
        if (i > 0) {
            Object[] m534a = this.f2863x.f3197i.m534a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((AbstractC0387a) m534a[i2]).mo4000f(this, f);
            }
        }
        super.m4305p(f);
    }

    /* renamed from: e */
    public void mo2283e(float f) {
        super.mo2283e(f);
    }

    /* renamed from: bZ */
    public void m3659bZ() {
        if (this.f2878dK.f3500b != null) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            m1072A.f6113bO.mo225a((int) (this.f6957el - m1072A.f6144cv), (int) (this.f6958em - m1072A.f6145cw), (int) (this.f2878dK.f3500b.f227a - m1072A.f6144cv), (int) (this.f2878dK.f3500b.f228b - m1072A.f6145cw), AbstractC0498i.f3481y);
        }
    }

    /* renamed from: ca */
    public void m3634ca() {
        boolean z = false;
        if ((this.f2864y.f2246i > 70.0f && this.f2863x.f3106en && this.f2863x.f3080dH == null) || (this.f2863x.f3080dH != null && this.f2863x.f3080dH.booleanValue())) {
            C1117y.m467a((AbstractC0244am) this, mo2978m(), true);
            z = true;
        } else if (this.f2863x.f2949aG && this.f2864y.f2252o > 50 && !this.f2863x.f3106en) {
            C1117y.m467a((AbstractC0244am) this, this.f2864y.f2252o, true);
            z = true;
        }
        if (this.f2863x.f3203o.size() != 0) {
            Iterator it = this.f2863x.f3203o.iterator();
            while (it.hasNext()) {
                C1117y.m467a((AbstractC0244am) this, ((C0466x) it.next()).f3356a, true);
                z = true;
            }
        }
        if (this.f2863x.f2995bF) {
            int mo3084bl = mo3084bl();
            for (int i = 0; i < mo3084bl; i++) {
                C0411bl c0411bl = this.f2863x.f3269fO[i];
                if (c0411bl.f2605ak != null && c0411bl.f2606al > 0.0f) {
                    int i2 = 90;
                    if (z) {
                        i2 = 40;
                    }
                    C1117y.m468a((AbstractC0244am) this, c0411bl.f2606al, Color.m5435a(i2, 35, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 35), 1, true);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo2284d(float f) {
        super.mo2284d(f);
        if (this.f1607bT) {
            return;
        }
        this.f1698dG.m3928a(f, this);
        if (this.f2863x.f3215ak != null) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            float f2 = this.f6957el - m1072A.f6144cv;
            float f3 = (this.f6958em - m1072A.f6145cw) - this.f6959en;
            float m3646cC = m3646cC();
            if (m3646cC != 1.0f) {
                m1072A.f6113bO.mo135k();
                m1072A.f6113bO.mo226a(m3646cC, m3646cC, f2, f3);
            }
            if (this.f2863x.f2940al) {
                int i = this.f2863x.f3215ak.f6402p;
                int i2 = this.f2863x.f3215ak.f6403q;
                int i3 = i / 2;
                int i4 = i2 / 2;
                f1684ds.m5351a(f2 - i3, f3 - i4, f2 + i3, f3 + i4);
                f1685dt.m5364a(0, 0, 0 + i, 0 + i2);
            } else {
                f1684ds.m5351a(f2 - this.f4230er, f3 - this.f4231es, f2 + this.f4230er, f3 + this.f4231es);
                f1685dt.m5364a(0, 0, 0 + this.f4228ep, 0 + this.f4229eq);
            }
            m1072A.f6113bO.mo192a(this.f2863x.f3215ak, f1685dt, f1684ds, m3695aN());
            if (m3646cC != 1.0f) {
                m1072A.f6113bO.mo134l();
            }
        }
        if (this.f2863x.f3225ay && this.f2885dR != null && !this.f1607bT) {
            C0393g.m3997a(this, f, false, true);
        }
    }

    /* renamed from: aM */
    public float m3696aM() {
        return this.f2863x.f3077dE;
    }

    /* renamed from: aN */
    public Paint m3695aN() {
        return super.m2884aN();
    }

    /* renamed from: aV */
    public boolean m3689aV() {
        return this.f2863x.f3122eD;
    }

    /* renamed from: bI */
    public boolean m3666bI() {
        return this.f2863x.f2949aG;
    }

    /* renamed from: q */
    public boolean mo3245q() {
        if (this.f1652cM != null && this.f1652cM.f1624ck < 1.0f) {
            return true;
        }
        return this.f2863x.f2952aJ;
    }

    /* renamed from: H */
    private boolean m3728H(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3245q() || abstractC0244am == this) {
            return false;
        }
        if (abstractC0244am.m4402bI()) {
            if (this.f2863x.f2962aT) {
                return true;
            }
            return false;
        } else if (this.f2863x.f2963aU) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo3087a(AbstractC0244am abstractC0244am) {
        if (this.f2863x.f3148fm != null && !C0448g.m3753a(this.f2863x.f3148fm, abstractC0244am.m4331dc())) {
            return false;
        }
        return m3728H(abstractC0244am);
    }

    /* renamed from: l */
    public boolean m3576l(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3250g() != 0.0f && m3583h(abstractC0244am, true)) {
            return true;
        }
        if (this.f2863x.f3147fl != null && !C0448g.m3753a(this.f2863x.f3147fl, abstractC0244am.m4331dc())) {
            return false;
        }
        return m3728H(abstractC0244am);
    }

    /* renamed from: m */
    public void m3575m(AbstractC0244am abstractC0244am) {
        C0637ab c0637ab;
        if (this.f2863x.f2974bi) {
            C0305au ar = m2853ar();
            if (ar != null && (c0637ab = ar.f1802i) != null) {
                c0637ab.m2701a(ar);
            }
            if (this.f1644cE && abstractC0244am != null) {
                LoggerMaybe.m1072A().f6117bS.m1776k(abstractC0244am);
            }
            m4351ch();
        }
    }

    /* renamed from: al */
    public boolean m3683al() {
        if (this.f2863x.f2974bi) {
            return true;
        }
        return false;
    }

    /* renamed from: aj */
    public boolean m3685aj() {
        return this.f2863x.f3150fo;
    }

    /* renamed from: cs */
    public boolean m3622cs() {
        return this.f2863x.f3171fL;
    }

    /* renamed from: ak */
    public boolean m3684ak() {
        return this.f2863x.f3149fn;
    }

    /* renamed from: g */
    public boolean mo3081g(AbstractC0244am abstractC0244am, boolean z) {
        if (!m3583h(abstractC0244am, z)) {
            return false;
        }
        if (z && abstractC0244am.m4382c((AbstractC0623y) this)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public boolean m3583h(AbstractC0244am abstractC0244am, boolean z) {
        if (!this.f2863x.f3144fi) {
            return false;
        }
        if (this.f2863x.f3145fj != null && !C0448g.m3753a(this.f2863x.f3145fj, abstractC0244am.m4331dc())) {
            return false;
        }
        return true;
    }

    /* renamed from: cR */
    public int m3639cR() {
        return this.f2863x.f3146fk;
    }

    /* renamed from: bJ */
    public boolean mo3269bJ() {
        return this.f2863x.f3154fs;
    }

    /* renamed from: a */
    public void mo2294a(float f, boolean z) {
        super.mo2294a(f, z);
        if (!this.f1607bT && m3684ak()) {
            if (m2945Y()) {
                if (!this.f2863x.f3010bW) {
                    C0519b.m3239b(f, this);
                }
            } else if (!this.f2863x.f3006bS) {
                C0519b.m3239b(f, this);
            }
        }
    }

    /* renamed from: o */
    public boolean mo3248o() {
        return this.f2863x.f3026cw;
    }

    /* renamed from: p */
    public boolean mo3247p() {
        return this.f2863x.f3027cx;
    }

    /* renamed from: cN */
    public boolean m3643cN() {
        return this.f2863x.f3028cy;
    }

    /* renamed from: f */
    public void m3587f(AbstractC0197n abstractC0197n) {
        if (this.f2863x.f3032cC) {
            m2838b(AbstractC0197n.f1370h);
        } else if (this.f2863x.f3031cB && this.f2867B.size() == 0) {
            m2838b(AbstractC0197n.f1371i);
        } else {
            super.m4312f(abstractC0197n);
        }
    }

    /* renamed from: B */
    public void m3736B(AbstractC0244am abstractC0244am) {
        super.m4437B(abstractC0244am);
    }

    /* renamed from: g */
    public float mo3250g() {
        return this.f2863x.f3033cD;
    }

    /* renamed from: cP */
    public int m3641cP() {
        return this.f2863x.f3034cE;
    }

    /* renamed from: cQ */
    public C0449h m3640cQ() {
        return this.f2863x.f3035cF;
    }

    /* renamed from: cO */
    public void m3642cO() {
        if (this.f2863x.f2973bh == 0.0f && mo3250g() > 0.0f) {
            AbstractC0197n.m4614b((AbstractC0244am) this);
            this.f1624ck = 1.0f;
            AbstractC0197n.m4598c(this);
        }
    }

    /* renamed from: co */
    public C0208c m3625co() {
        if (this.f2863x.f3263eK != 0) {
            return C0526i.f3644i.m4507N();
        }
        return super.m4345co();
    }

    /* renamed from: L */
    public float mo3236L(int i) {
        return this.f2863x.f3269fO[i].f2600af;
    }

    /* renamed from: K */
    public PointF mo3237K(int i) {
        C0188f c0188f;
        PointF K = super.mo3237K(i);
        if (this.f2863x.f3117ey) {
            if (this.f2863x.f3174fP[this.f2863x.f3269fO[i].m3948a(this)].f1172M && this.f2872G != null && (c0188f = this.f2872G[i]) != null && !c0188f.f6952eg) {
                K.f227a += c0188f.f1011K;
                K.f228b += c0188f.f1012L;
            }
        }
        return K;
    }

    /* renamed from: bd */
    public float mo3294bd() {
        return this.f2864y.f2241d;
    }

    /* renamed from: be */
    public EnumC0307b m3656be() {
        return this.f2863x.f3095ea;
    }

    /* renamed from: bf */
    public boolean m3655bf() {
        if (this.f2863x.f3098ed) {
            return false;
        }
        if (this.f2863x.f3095ea == EnumC0307b.bomber) {
            C0305au ar = m2853ar();
            if ((ar != null && (ar.m4222d() == EnumC0306av.attackMove || ar.m4222d() == EnumC0306av.patrol)) || this.f3894O == EnumC0205a.outOfRange) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: bW */
    public boolean mo3188bW() {
        return this.f2861v;
    }

    /* renamed from: bg */
    public boolean m3654bg() {
        return this.f2863x.f3101eg;
    }

    /* renamed from: bc */
    public float mo3071bc() {
        return this.f2863x.f3104ej;
    }

    /* renamed from: f */
    public void m3588f(float f, float f2) {
        super.m4313f(f, f2);
        m4424a(EnumC0347ae.f2179h);
        float f3 = this.f1618ce;
        if (this.f2863x.f3075dC) {
            f3 = this.f1649cJ[this.f2863x.f3076dD.f2547e].f1712a;
        }
        this.f2881dN = this.f6957el;
        this.f2882dO = this.f6958em;
        this.f2883dP = this.f6959en;
        this.f2884dQ = f3;
    }

    /* renamed from: ds */
    public void m3597ds() {
        if (this.f2863x.f3223aw == null && this.f2885dR == null) {
            return;
        }
        if (this.f2863x.f3223aw == null || this.f2863x.f3223aw.length == 0) {
            this.f2885dR = null;
        } else if (this.f2885dR == null || this.f2885dR.length != this.f2863x.f3223aw.length) {
            this.f2885dR = new C0394h[this.f2863x.f3223aw.length];
            for (int i = 0; i < this.f2863x.f3223aw.length; i++) {
                C0394h c0394h = new C0394h();
                this.f2885dR[i] = c0394h;
                c0394h.f2414a = i;
                c0394h.f2432s = this.f2863x.f3223aw[i].f2289r;
            }
            float f = this.f1618ce;
            if (this.f2863x.f3075dC) {
                f = this.f1649cJ[this.f2863x.f3076dD.f2547e].f1712a;
            }
            this.f2881dN = this.f6957el;
            this.f2882dO = this.f6958em;
            this.f2883dP = this.f6959en;
            this.f2884dQ = f;
            m3596dy();
            for (int i2 = 0; i2 < this.f2863x.f3223aw.length; i2++) {
                this.f2885dR[i2].f2426m = true;
            }
        }
    }

    /* renamed from: dy */
    public void m3596dy() {
        C0393g.f2410a.mo3979b(this, 0.0f);
    }

    /* renamed from: dz */
    public void m3595dz() {
        if (this.f2885dR != null) {
            for (int i = 0; i < this.f2885dR.length; i++) {
                this.f2885dR[i].f2427n = true;
                this.f2885dR[i].f2426m = true;
            }
            m3596dy();
        }
    }

    /* renamed from: aT */
    public int m3691aT() {
        if (this.f2863x.f3273fT == null) {
            return -1;
        }
        return this.f2863x.f3273fT.f2547e;
    }

    /* renamed from: s */
    public int mo3169s() {
        return this.f2864y.f2251n;
    }

    /* renamed from: c */
    public void m3647c(boolean z) {
        C0453l c0453l = this.f2863x;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f1651cL != null || this.f1652cM != null) {
            return;
        }
        int i = this.f2864y.f2251n;
        if (this.f1624ck < 1.0f && c0453l.f3056df != -1) {
            i = c0453l.f3056df;
        }
        if (i > 0) {
            m1072A.f6110bL.m4856a(this.f6957el, this.f6958em, i, this.f1609bV, z);
        }
    }

    /* renamed from: cb */
    public Rect m3633cb() {
        return this.f2863x.f3247cV;
    }

    /* renamed from: cd */
    public Rect m3631cd() {
        return this.f2863x.f3249cX;
    }

    /* renamed from: cc */
    public Rect m3632cc() {
        return this.f2863x.f3248cW;
    }

    /* renamed from: b */
    public boolean mo3295b(int i, float f) {
        float mo3095C;
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2613as != 0.0f) {
            boolean z = true;
            if (c0411bl.f2616av != null && !c0411bl.f2616av.read(this)) {
                z = false;
            }
            if (z) {
                C0247ap c0247ap = this.f1649cJ[i];
                if (c0411bl.f2612ar != 0.0f) {
                    mo3095C = c0247ap.f1712a;
                } else if (!c0411bl.f2611aq) {
                    mo3095C = c0247ap.f1713b;
                } else {
                    mo3095C = mo3095C(i);
                }
                c0247ap.f1722k += f;
                float f2 = f * c0411bl.f2615au;
                if (c0247ap.f1723l > 0.0f) {
                    if (c0247ap.f1723l < Float.POSITIVE_INFINITY && m2942a(f2, mo3095C + c0247ap.f1723l, i) == 0.0f) {
                        c0247ap.f1723l = Float.POSITIVE_INFINITY;
                    }
                } else if (c0247ap.f1723l > Float.NEGATIVE_INFINITY && m2942a(f2, mo3095C + c0247ap.f1723l, i) == 0.0f) {
                    c0247ap.f1723l = Float.NEGATIVE_INFINITY;
                }
                if (c0247ap.f1722k > c0411bl.f2614at) {
                    c0247ap.f1722k = -C0758f.m2137a(this, 0, (int) c0411bl.f2617aw);
                    float f3 = c0411bl.f2613as;
                    if (c0411bl.f2618ax > 0.0f) {
                        f3 += C0758f.m2097b(this, 0.0f, c0411bl.f2618ax, i);
                    }
                    c0247ap.f1723l = c0247ap.f1723l > 0.0f ? -f3 : f3;
                    return false;
                }
                return false;
            }
        }
        if (c0411bl.f2612ar != 0.0f) {
            this.f1649cJ[i].f1712a += c0411bl.f2612ar * f;
            if (this.f1649cJ[i].f1712a > 180.0f) {
                this.f1649cJ[i].f1712a -= 360.0f;
            }
            if (this.f1649cJ[i].f1712a < -180.0f) {
                this.f1649cJ[i].f1712a += 360.0f;
                return false;
            }
            return false;
        }
        return c0411bl.f2611aq;
    }

    /* renamed from: cu */
    public int mo3227cu() {
        return this.f2863x.f3265eX;
    }

    /* renamed from: dA */
    public ArrayList m3617dA() {
        f2886dS.clear();
        ArrayList mo3068N = mo3068N();
        if (mo3068N.size() != 0) {
            Iterator it = mo3068N.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                if (abstractC0224s instanceof C0342g) {
                    C0342g c0342g = (C0342g) abstractC0224s;
                    if (c0342g.f2151c == EnumC0340e.upgrade) {
                        f2886dS.add(c0342g);
                    }
                }
            }
        }
        return f2886dS;
    }

    /* renamed from: cl */
    public C0208c mo3267cl() {
        ArrayList m3617dA = m3617dA();
        if (m3617dA.size() > 0) {
            return ((AbstractC0224s) m3617dA.get(0)).m4507N();
        }
        return null;
    }

    /* renamed from: a */
    public void mo3451a(ArrayList arrayList) {
        arrayList.clear();
        ArrayList m3617dA = m3617dA();
        if (m3617dA.size() < 2) {
            return;
        }
        m3617dA.remove(0);
        Iterator it = m3617dA.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0224s) it.next()).m4507N());
        }
    }

    /* renamed from: cX */
    public float mo3292cX() {
        return this.f2863x.f3049cY;
    }

    /* renamed from: cY */
    public float mo3291cY() {
        return this.f2863x.f3050cZ;
    }

    /* renamed from: bv */
    public void m3650bv() {
        AbstractC0197n.m4634a((AbstractC0244am) this);
        this.f2878dK.m3325a(true);
        super.m2801bv();
    }

    /* renamed from: da */
    public void m3609da() {
        this.f6959en = 170.0f;
        this.f2845f = 1.5f;
        m3595dz();
        super.m4332da();
    }

    /* renamed from: db */
    public boolean mo3226db() {
        return this.f2863x.f3021ck;
    }

    /* renamed from: bp */
    public int mo3356bp() {
        return this.f2863x.f2982bq;
    }

    /* renamed from: a */
    public void m3721a(int i, float f) {
        this.f1649cJ[i].f1712a += f;
        if (this.f2863x.f3272fS) {
            for (int i2 = 0; i2 < this.f2863x.f3269fO.length; i2++) {
                if (this.f2863x.f3269fO[i2].f2565w == i) {
                    this.f1649cJ[i2].f1712a += f;
                    this.f1649cJ[i2].m4293a(2);
                }
            }
        }
    }

    /* renamed from: cZ */
    public float mo3290cZ() {
        return super.mo3290cZ() + this.f2863x.f3055de;
    }

    /* renamed from: H */
    public float mo3094H(int i) {
        return this.f2863x.f3269fO[i].f2558p;
    }

    /* renamed from: I */
    public float mo3093I(int i) {
        return this.f2863x.f3269fO[i].f2559q;
    }

    /* renamed from: J */
    public float mo3092J(int i) {
        return this.f2863x.f3269fO[i].f2560r;
    }

    /* renamed from: a */
    public float mo2994a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        C0399m dl = m4323dl();
        if (dl != null && this.f1652cM != null && dl.f2454j) {
            int i = 0;
            if (c0188f != null) {
                i = c0188f.f1055aD;
            }
            if (i >= 0) {
                C0188f m4720a = C0188f.m4720a(c0188f);
                if (dl.f2455k) {
                    m4720a.f1039am = 0.0f;
                }
                f = this.f1652cM.mo2994a(abstractC0244am, f, m4720a);
                if (f < 0.0f) {
                    f = 0.0f;
                }
            }
        }
        if (mo2997J()) {
            f = 0.0f;
        }
        if (this.f2864y.f2249l > 0.0f && f > this.f2863x.f3039cL) {
            float f2 = this.f2864y.f2249l;
            if (c0188f != null) {
                f2 -= c0188f.f1040an;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            f -= f2;
            if (f < this.f2863x.f3039cL) {
                f = this.f2863x.f3039cL;
            }
        }
        if (c0188f != null) {
            m3708a(EnumC0347ae.f2185n, abstractC0244am, c0188f.f1056aE, (VariableScope) null);
        } else {
            m4423a(EnumC0347ae.f2185n, abstractC0244am);
        }
        return super.mo2994a(abstractC0244am, f, c0188f);
    }

    /* renamed from: aU */
    public float m3690aU() {
        return this.f2863x.f3079dG;
    }

    /* renamed from: ac */
    public boolean m3686ac() {
        if (!this.f2863x.f3100ef) {
            return false;
        }
        return super.m2868ac();
    }

    /* renamed from: a */
    public boolean m3714a(EnumC0238ag enumC0238ag) {
        if (enumC0238ag == EnumC0238ag.attack) {
            return this.f2863x.f3063dm.m3956a();
        }
        if (enumC0238ag == EnumC0238ag.move) {
            return this.f2863x.f3064dn.m3956a();
        }
        if (enumC0238ag == EnumC0238ag.newSelection) {
            return this.f2863x.f3065do.m3956a();
        }
        return false;
    }

    /* renamed from: b */
    public void m3673b(EnumC0347ae enumC0347ae) {
        C0453l c0453l = this.f2863x;
        if (c0453l.f3282gn.f6894a == 0) {
            return;
        }
        Object[] m534a = c0453l.f3282gn.m534a();
        for (int i = c0453l.f3282gn.f6894a - 1; i >= 0; i--) {
            C0346ad c0346ad = (C0346ad) m534a[i];
            if (c0346ad.f2168a == enumC0347ae) {
                f2893dZ.f227a = this.f6957el;
                f2893dZ.f228b = this.f6958em;
                m3715a(c0346ad.f2169b, f2893dZ, (AbstractC0244am) null, 0);
            }
        }
    }

    /* renamed from: a */
    public void m3708a(EnumC0347ae enumC0347ae, AbstractC0244am abstractC0244am, C0449h c0449h, VariableScope variableScope) {
        C0452k c0452k;
        C0453l c0453l = this.f2863x;
        if (c0453l.f3282gn.f6894a == 0) {
            return;
        }
        Object[] m534a = c0453l.f3282gn.m534a();
        for (int i = c0453l.f3282gn.f6894a - 1; i >= 0; i--) {
            C0346ad c0346ad = (C0346ad) m534a[i];
            if (c0346ad.f2168a == enumC0347ae && (c0346ad.f2171d == null || C0448g.m3754a(c0346ad.f2171d, c0449h))) {
                if (f2888dU.size() > 0) {
                    c0452k = (C0452k) f2888dU.m530b();
                } else {
                    c0452k = new C0452k();
                }
                c0452k.f2898a = c0346ad;
                c0452k.f2899b = this;
                c0452k.f2900c = abstractC0244am;
                c0452k.f2901d = c0449h;
                c0452k.f2902e = variableScope;
                f2887dT.add(c0452k);
            }
        }
    }

    /* renamed from: s */
    public static void m3572s(float f) {
    }

    /* renamed from: dB */
    public static void m3616dB() {
        if (f2887dT.f6894a == 0) {
            return;
        }
        f2887dT = new C1101m();
    }

    /* renamed from: a */
    public static void m3723a(float f, int i) {
        if (f2887dT.f6894a == 0) {
            return;
        }
        Object[] m534a = f2887dT.m534a();
        int i2 = f2887dT.f6894a;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            C0452k c0452k = (C0452k) m534a[i3];
            C0346ad c0346ad = c0452k.f2898a;
            C0451j c0451j = c0452k.f2899b;
            if (c0346ad.f2170c == c0451j.f2863x) {
                f2893dZ.f227a = c0451j.f6957el;
                f2893dZ.f228b = c0451j.f6958em;
                PointF pointF = f2893dZ;
                LogicBoolean.setContextEventSource(c0452k);
                c0451j.m3715a(c0346ad.f2169b, pointF, (AbstractC0244am) null, 0);
                LogicBoolean.clearContext();
            }
        }
        if (i < 1 && i2 != f2887dT.f6894a) {
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                C0452k c0452k2 = (C0452k) f2887dT.remove(i4);
                c0452k2.m3562a();
                f2888dU.add(c0452k2);
            }
            m3723a(f, i + 1);
        }
        Object[] m534a2 = f2887dT.m534a();
        for (int i5 = f2887dT.f6894a - 1; i5 >= 0; i5--) {
            C0452k c0452k3 = (C0452k) m534a2[i5];
            c0452k3.m3562a();
            f2888dU.add(c0452k3);
        }
        f2887dT.clear();
    }

    /* renamed from: dC */
    public static void m3615dC() {
    }

    /* renamed from: b */
    public void m3680b(float f, boolean z) {
        C0453l c0453l = this.f2863x;
        if (!c0453l.f3175fV) {
            return;
        }
        if (this.f2862w != 0.0f) {
            this.f2862w = C0758f.m2159a(this.f2862w, f);
            if (this.f2862w == 0.0f) {
                z = true;
            } else {
                return;
            }
        }
        C0460r[] c0460rArr = c0453l.f3176fW;
        if (c0460rArr != null) {
            m3722a(f, c0460rArr);
            if (c0453l != this.f2863x) {
                return;
            }
        }
        C0460r[] c0460rArr2 = c0453l.f3177fX;
        if (c0460rArr2 != null && (((int) (LoggerMaybe.m1072A().f6239bx + this.f6951ee)) % 4 == 0 || z)) {
            m3722a(f, c0460rArr2);
            if (c0453l != this.f2863x) {
                return;
            }
        }
        C0460r[] c0460rArr3 = c0453l.f3178fY;
        if (c0460rArr3 != null) {
            if (((int) (LoggerMaybe.m1072A().f6239bx + this.f6951ee)) % 8 == 0 || z) {
                m3722a(f, c0460rArr3);
                if (c0453l != this.f2863x) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m3722a(float f, C0460r[] c0460rArr) {
        C0453l c0453l = this.f2863x;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        for (C0460r c0460r : c0460rArr) {
            if (c0460r.f3336a.read(this)) {
                if (m1072A.f6231bl && m1072A.f6233bn && this.f1644cE) {
                    if (c0460r.f3339d != null) {
                        String str = VariableScope.nullOrMissingString + c0460r.f3339d.m4506O();
                    }
                    String str2 = "autoTrigger fired on: " + m4337cz() + " details: " + c0460r.f3336a.getDebugDetails(this);
                    LoggerMaybe.LogDebug2(str2);
                    m1072A.f6117bS.f5114f.m1901a(str2, 2000);
                }
                f2893dZ.f227a = this.f6957el;
                f2893dZ.f228b = this.f6958em;
                m3715a(c0460r.f3339d, f2893dZ, (AbstractC0244am) null, 0);
                this.f2862w = this.f2863x.f3235ca;
                if (c0453l != this.f2863x) {
                    return;
                }
            }
        }
    }

    /* renamed from: dc */
    public C0449h m3608dc() {
        return this.f2894ea;
    }

    /* renamed from: a */
    public void m3701a(C0449h c0449h, boolean z) {
        if (z) {
            this.f2894ea = c0449h;
            return;
        }
        AbstractC0197n.m4614b((AbstractC0244am) this);
        this.f2894ea = c0449h;
        AbstractC0197n.m4598c(this);
    }

    /* renamed from: j */
    public void m3578j(boolean z) {
        m3701a(this.f2863x.f2923N, z);
    }

    /* renamed from: a */
    public void m3702a(C0449h c0449h) {
        C0449h m3608dc = m3608dc();
        if (m3608dc == null || m3608dc.m3743b() == 0) {
            m3701a(c0449h, false);
        } else if (C0448g.m3748b(m3608dc, c0449h)) {
        } else {
            C0450i c0450i = new C0450i(m3608dc);
            if (c0450i.m3740a(c0449h)) {
                m3701a(c0450i.m3742a(), false);
            }
        }
    }

    /* renamed from: b */
    public void m3671b(C0449h c0449h) {
        C0449h m3608dc = m3608dc();
        if (m3608dc == null || m3608dc.m3743b() == 0 || !C0448g.m3753a(c0449h, m3608dc)) {
            return;
        }
        C0450i c0450i = new C0450i(m3608dc);
        if (c0450i.m3739b(c0449h)) {
            m3701a(c0450i.m3742a(), false);
        }
    }

    /* renamed from: dD */
    public final void m3614dD() {
        if (this.f2863x.f3140fe == EnumC0246ao.f1706d) {
            if (mo2981i()) {
                m447S(5);
            } else if (m3624cq() && this.f1623cj == 0.0f) {
                m447S(3);
            } else {
                m447S(2);
            }
        } else if (this.f1623cj == 0.0f) {
            m447S(this.f2863x.f3245cG);
        }
        this.f6956ek = 0;
    }

    /* renamed from: cj */
    public boolean m3628cj() {
        if (!this.f2863x.f3179gf) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo4451f() {
        return this.f2863x.f3138fb.read(this);
    }

    /* renamed from: j */
    public boolean mo4450j() {
        return true;
    }

    /* renamed from: D */
    public C1080ai m3734D(int i) {
        C0247ap c0247ap = this.f1649cJ[i];
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        float f = c0411bl.f2592X;
        float f2 = c0411bl.f2593Y;
        if (c0411bl.f2594Z != 0.0f && c0247ap.f1724m) {
            f2 += c0411bl.f2594Z;
        }
        float f3 = mo3002E() ? this.f1618ce : c0247ap.f1712a;
        C1080ai m3731F = m3731F(i);
        float m2040i = C0758f.m2040i(f3);
        float m2045h = C0758f.m2045h(f3);
        float f4 = m3731F.f6849a;
        float f5 = m3731F.f6850b;
        float f6 = m3731F.f6851c;
        f2895eb.f6849a = f4 + ((m2040i * f) - (m2045h * f2));
        f2895eb.f6850b = f5 + (m2045h * f) + (m2040i * f2);
        f2895eb.f6851c = f6 + c0411bl.f2595aa;
        return f2895eb;
    }

    /* renamed from: E */
    public PointF mo3073E(int i) {
        C1080ai m3734D = m3734D(i);
        f2896ec.f227a = m3734D.f6849a;
        f2896ec.f228b = m3734D.f6850b;
        return f2896ec;
    }

    /* renamed from: ck */
    public boolean m3627ck() {
        return this.f2863x.f3169fH;
    }

    /* renamed from: cm */
    public float m3626cm() {
        return this.f2863x.f3267fI;
    }

    /* renamed from: a */
    public void m3712a(AbstractC0244am abstractC0244am, float f, int i) {
        if (this.f2863x.f3070dx != null) {
            this.f2841b.m3859a(this.f2863x.f3070dx, 5);
        }
        if (this.f2863x.f3006bS) {
            this.f3899T = C0758f.m2159a(this.f3899T, f);
            if (this.f3899T == 0.0f) {
                this.f3899T = this.f2863x.f3007bT;
                if (this.f2863x.f3008bU != null) {
                    C0247ap c0247ap = this.f1649cJ[i];
                    PointF mo3073E = mo3073E(i);
                    this.f2863x.f3008bU.m3459a(mo3073E.f227a, mo3073E.f228b, this.f6959en, c0247ap.f1712a, this);
                }
                if (this.f2863x.f3009bV != null) {
                    this.f2863x.f3009bV.m3459a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, abstractC0244am.f1618ce, abstractC0244am);
                    return;
                }
                return;
            }
            return;
        }
        super.m2920a(abstractC0244am, f, i);
    }

    /* renamed from: b */
    public void m3676b(AbstractC0244am abstractC0244am, float f, int i) {
        if (this.f2863x.f3071dy != null) {
            this.f2841b.m3859a(this.f2863x.f3071dy, 5);
        }
        if (this.f2863x.f3010bW) {
            this.f3899T = C0758f.m2159a(this.f3899T, f);
            if (this.f3899T == 0.0f) {
                this.f3899T = this.f2863x.f3011bX;
                if (this.f2863x.f3012bY != null) {
                    C0247ap c0247ap = this.f1649cJ[i];
                    PointF mo3073E = mo3073E(i);
                    this.f2863x.f3012bY.m3459a(mo3073E.f227a, mo3073E.f228b, this.f6959en, c0247ap.f1712a, this);
                }
                if (this.f2863x.f3013bZ != null) {
                    this.f2863x.f3013bZ.m3459a(abstractC0244am.f6957el, abstractC0244am.f6958em, abstractC0244am.f6959en, abstractC0244am.f1618ce, abstractC0244am);
                    return;
                }
                return;
            }
            return;
        }
        super.m2837b(abstractC0244am, f, i);
    }

    /* renamed from: cf */
    public boolean m3630cf() {
        return this.f2864y.f2250m;
    }

    /* renamed from: dE */
    public boolean m3613dE() {
        if (this.f2863x.f2930Y != null && !this.f2863x.f2930Y.read(this)) {
            return false;
        }
        if (!this.f2864y.f2250m) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            if (m1072A.f6099bs.m4599c(this.f1609bV) && !m1072A.f6099bs.m4619b()) {
                return false;
            }
        }
        C0399m dl = m4323dl();
        if (dl != null && !dl.f2459o) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo1713t() {
        C0399m dl = m4323dl();
        if (dl != null && dl.f2457m) {
            return true;
        }
        return this.f2863x.f2954aL;
    }

    /* renamed from: cT */
    public boolean m3637cT() {
        C0399m dl = m4323dl();
        if (dl != null && dl.f2458n) {
            return true;
        }
        return this.f2863x.f2955aM;
    }

    /* renamed from: d */
    public boolean mo2987d(AbstractC0244am abstractC0244am) {
        C0453l c0453l = this.f2863x;
        return ((c0453l.f2960aR != null && !C0448g.m3753a(c0453l.f2960aR, abstractC0244am.m4331dc())) || m3612dF() || c0453l.f2956aN) ? false : true;
    }

    /* renamed from: cU */
    public boolean m3636cU() {
        return this.f2863x.f2961aS;
    }

    /* renamed from: cS */
    public boolean m3638cS() {
        return this.f2863x.f2956aN || mo1712u() || (this.f1624ck < 1.0f && this.f2863x.f2973bh <= 0.0f);
    }

    /* renamed from: df */
    public C0449h m3607df() {
        return this.f2863x.f2924O;
    }

    /* renamed from: am */
    public float m3682am() {
        return this.f2863x.f3123eE;
    }

    /* renamed from: an */
    public boolean m3681an() {
        return super.m2857an() || this.f2863x.f3122eD;
    }

    /* renamed from: a */
    public boolean mo2290a(LoggerMaybe loggerMaybe) {
        if (!loggerMaybe.f6251cN.m5345b(this.f6957el, this.f6958em)) {
            if (!this.f2863x.f2912A) {
                return false;
            }
            boolean z = false;
            if (this.f2863x.f2913B != null) {
                C0453l.f3186a.m5363a(this.f2863x.f2913B);
                C0453l.f3186a.m5365a((int) this.f6957el, (int) this.f6958em);
                if (loggerMaybe.f6253cP.m5359b(C0453l.f3186a)) {
                    z = true;
                }
            }
            if (loggerMaybe.f6251cN.m5345b(this.f6957el, this.f6958em - this.f6959en)) {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        if (this.f1651cL != null) {
            return false;
        }
        if ((this.f1653cN != null && this.f1653cN.f2479I) || !m4336d(loggerMaybe.f6099bs) || !m3613dE()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public AbstractC0623y m3707a(C0399m c0399m) {
        return C0398l.m3987a(this, c0399m);
    }

    /* renamed from: a */
    public C0399m m3697a(short s) {
        return C0398l.m3983a(this, s);
    }

    /* renamed from: a */
    public boolean m3698a(AbstractC0623y abstractC0623y, C0399m c0399m) {
        if (abstractC0623y == this) {
            return false;
        }
        if (c0399m == null) {
            LoggerMaybe.m983b("attachRequest: No attachedSlotData");
            return false;
        }
        AbstractC0623y m3987a = C0398l.m3987a(this, c0399m);
        if (m3987a != null) {
            LoggerMaybe.m983b("attachRequest: a unit is already in slot (parent:" + m4337cz() + " slot:" + c0399m.m3976b() + " existing:" + m3987a.m4379cB() + ")");
            return false;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0398l.m3986a(this, c0399m, abstractC0623y);
        abstractC0623y.f1652cM = this;
        abstractC0623y.f1653cN = c0399m;
        abstractC0623y.f1654cO = m1072A.f6102by;
        abstractC0623y.f1606bS = false;
        return true;
    }

    /* renamed from: b */
    public boolean m3670b(AbstractC0623y abstractC0623y) {
        if (abstractC0623y.f1652cM != this) {
            LoggerMaybe.m983b("deattachRequest: unit is not attached");
            return false;
        }
        C0399m c0399m = abstractC0623y.f1653cN;
        if (c0399m == null) {
            LoggerMaybe.m983b("deattachRequest: unit has no attachedSlotData");
            return false;
        }
        AbstractC0623y m3987a = C0398l.m3987a(this, c0399m);
        if (m3987a == null) {
            LoggerMaybe.m983b("deattachRequest: Failed, no unit in slot");
            LoggerMaybe.m958g("deattachRequest");
            return false;
        } else if (abstractC0623y != m3987a) {
            String str = "null";
            if (m3987a != null) {
                str = m3987a.m4337cz();
            }
            LoggerMaybe.m983b("deattachRequest: unit and slot don't match - requested:" + abstractC0623y.m4337cz() + " current:" + str);
            return false;
        } else {
            if (this.f2867B.remove(abstractC0623y)) {
                m3733D(abstractC0623y);
            }
            C0398l.m3986a(this, c0399m, (AbstractC0623y) null);
            abstractC0623y.f1652cM = null;
            abstractC0623y.f1653cN = null;
            abstractC0623y.mo2990c_();
            m4423a(EnumC0347ae.f2189r, this);
            return true;
        }
    }

    /* renamed from: dF */
    public boolean m3612dF() {
        C0399m dl = m4323dl();
        if (dl != null && !dl.f2456l) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public boolean mo2997J() {
        if (m3612dF() || this.f2863x.f2957aO) {
            return true;
        }
        return false;
    }

    /* renamed from: dg */
    public void m3606dg() {
        C0453l c0453l = this.f2863x;
        if (!c0453l.f3243ct.m3899b()) {
            c0453l.f3243ct.mo3874a(this);
        }
        if (!c0453l.f3244cu.m3899b() && this.f1624ck >= 1.0f) {
            c0453l.f3244cu.mo3874a(this);
        }
        super.m4328dg();
    }

    /* renamed from: dh */
    public void m3605dh() {
        C0453l c0453l = this.f2863x;
        if (!c0453l.f3243ct.m3899b()) {
            c0453l.f3243ct.m3877h(this);
        }
        if (!c0453l.f3244cu.m3899b() && this.f1624ck >= 1.0f) {
            c0453l.f3244cu.m3877h(this);
        }
        super.m4327dh();
    }

    /* renamed from: a */
    public void m3709a(C0305au c0305au) {
        m4424a(EnumC0347ae.f2181j);
        C0399m dl = m4323dl();
        if (dl != null && dl.f2478H) {
            EnumC0306av m4222d = c0305au.m4222d();
            if (m4222d == EnumC0306av.attackMove || m4222d == EnumC0306av.move) {
                m2799bx();
            }
        }
    }

    /* renamed from: b_ */
    public boolean m3658b_() {
        C0453l c0453l = this.f2863x;
        if (!c0453l.f2959aQ && LoggerMaybe.m1072A().f6099bs.m4599c(this.f1609bV)) {
            return false;
        }
        return c0453l.f2958aP;
    }

    /* renamed from: di */
    public boolean m3604di() {
        return this.f2863x.f2931Z;
    }

    /* renamed from: dj */
    public boolean m3603dj() {
        return this.f2863x.f3261eI;
    }

    /* renamed from: dk */
    public boolean m3602dk() {
        return this.f2863x.f3262eJ;
    }

    /* renamed from: G */
    public boolean m3729G(AbstractC0244am abstractC0244am) {
        int m3611dG = m3611dG();
        int mo3227cu = abstractC0244am.mo3227cu();
        if (this.f2863x.f3127eM) {
            mo3227cu = 1;
        }
        if (m3611dG + mo3227cu <= this.f2863x.f3263eK) {
            return true;
        }
        return false;
    }

    /* renamed from: dG */
    public int m3611dG() {
        int i = 0;
        if (this.f2863x.f3127eM) {
            i = 0 + this.f2867B.size();
        } else if (this.f2867B.f6894a > 0) {
            Iterator it = this.f2867B.iterator();
            while (it.hasNext()) {
                i += ((AbstractC0244am) it.next()).mo3227cu();
            }
        }
        return i;
    }

    /* renamed from: e */
    public void m3594e(AbstractC0197n abstractC0197n) {
        C0399m m4323dl;
        if (this.f1609bV == abstractC0197n) {
            return;
        }
        super.m4318e(abstractC0197n);
        if (this.f2867B != null && !this.f2863x.f3135eV) {
            Iterator it = this.f2867B.iterator();
            while (it.hasNext()) {
                ((AbstractC0244am) it.next()).m4318e(abstractC0197n);
            }
        }
        if (this.f2868C != null) {
            Iterator it2 = this.f2868C.iterator();
            while (it2.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it2.next();
                if (abstractC0244am != null && (m4323dl = abstractC0244am.m4323dl()) != null && !m4323dl.f2470z) {
                    abstractC0244am.m4318e(abstractC0197n);
                }
            }
        }
        m4424a(EnumC0347ae.f2182k);
    }

    /* renamed from: cM */
    public C0424b m3644cM() {
        return this.f2863x.f3018cg;
    }

    /* renamed from: cg */
    public void m3629cg() {
        if (this.f2863x.f2984bs) {
            if (this.f1632cs <= -1.0f) {
                this.f1632cs = -1.0f;
                return;
            }
            return;
        }
        super.m4352cg();
    }

    /* renamed from: bz */
    public C1101m m3648bz() {
        return this.f2867B;
    }

    /* renamed from: e */
    public C1101m m3590e(boolean z) {
        this.f2897ed.clear();
        if (this.f2863x.f3226az.f6894a > 0) {
            C0398l.m3984a(this, this.f2897ed, z);
        }
        if (this.f2897ed.f6894a > 0) {
            return this.f2897ed;
        }
        return null;
    }

    /* renamed from: dm */
    public float m3601dm() {
        return this.f2863x.f3053dc;
    }

    /* renamed from: dn */
    public boolean m3600dn() {
        return this.f2863x.f3206z;
    }

    /* renamed from: dH */
    public void m3610dH() {
        if (this.f2864y.f2238a) {
            this.f2864y = this.f2864y.m4030b();
        }
    }
}
