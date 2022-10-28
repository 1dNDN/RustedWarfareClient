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
import com.corrodinggames.rts.gameFramework.Core;
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
    public void m3934K() {
        this.f2870E = new PointF[6];
        this.f2871F = new PointF[this.f2870E.length];
        for (int i = 0; i < this.f2870E.length; i++) {
            this.f2870E[i] = new PointF();
            this.f2871F[i] = new PointF();
        }
    }

    /* renamed from: b */
    public PointF[] mo3170b() {
        if (this.f2870E == null) {
            m3934K();
        }
        return this.f2870E;
    }

    /* renamed from: c */
    public PointF[] mo3168c() {
        if (this.f2870E == null) {
            m3934K();
        }
        return this.f2871F;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(11);
        streamWriter.mo1335a(this.f2844e);
        streamWriter.mo1335a(this.f2852m);
        streamWriter.mo1329a(this.f2853n);
        streamWriter.WriteInteger(this.f2867B.size());
        Iterator it = this.f2867B.iterator();
        while (it.hasNext()) {
            streamWriter.mo1333a((AbstractC0244am) it.next());
        }
        streamWriter.mo1329a(this.f2857r);
        streamWriter.mo1335a(this.f2854o);
        streamWriter.mo1335a(this.f2845f);
        streamWriter.mo1335a(this.f2858s);
        streamWriter.mo1329a(this.f2861v);
        byte b = 0;
        if (this.f2885dR != null) {
            b = (byte) this.f2885dR.length;
        }
        streamWriter.m1401c(b);
        if (this.f2885dR != null) {
            for (int i = 0; i < b; i++) {
                C0394h c0394h = this.f2885dR[i];
                streamWriter.mo1335a(c0394h.f2415b);
                streamWriter.mo1335a(c0394h.f2416c);
                streamWriter.mo1335a(c0394h.f2427d);
                streamWriter.mo1335a(c0394h.f2421i);
                streamWriter.mo1329a(c0394h.f2422k);
                streamWriter.mo1329a(c0394h.f2428j);
                streamWriter.mo1329a(c0394h.f2429m);
                streamWriter.mo1329a(c0394h.f2430n);
            }
        }
        this.f2878dK.m3452a(streamWriter);
        streamWriter.m1421a(this.f2865z);
        streamWriter.mo1329a(this.f2848i);
        streamWriter.mo1329a(this.f2847h);
        boolean z = this.f2894ea != this.f2863x.f2923N;
        streamWriter.mo1329a(z);
        if (z) {
            C0448g.m3959a(this.f2894ea, streamWriter);
        }
        C0359aq.m4251a(this.f2864y, this, streamWriter);
        streamWriter.mo1335a(this.f2856q);
        super.mo2441a(streamWriter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* renamed from: a */
    public void m3899a(Reader reader) {
        InterfaceC0303as m1290q;
        byte m1304d;
        C0394h c0394h;
        if (reader.m1310b() >= 32) {
            int ReadInt = reader.ReadInt();
            this.f2844e = reader.m1300g();
            this.f2852m = reader.m1300g();
            this.f2853n = reader.ReadBool();
            this.f2867B.clear();
            int ReadInt2 = reader.ReadInt();
            for (int i = 0; i < ReadInt2; i++) {
                AbstractC0244am m1292o = reader.m1292o();
                if (m1292o != null) {
                    this.f2867B.add(m1292o);
                }
            }
            if (ReadInt >= 1) {
                this.f2857r = reader.ReadBool();
            }
            if (ReadInt >= 2) {
                this.f2854o = reader.m1300g();
            }
            if (ReadInt >= 3) {
                this.f2845f = reader.m1300g();
                this.f2858s = reader.m1300g();
            }
            if (ReadInt >= 4) {
                this.f2861v = reader.ReadBool();
            }
            if (ReadInt >= 5 && (m1304d = reader.m1304d()) != 0) {
                m3780ds();
                if (this.f2885dR == null) {
                    Core.LogDebug2("readIn: legs==null but leg data found in save, this might be due to missing or changed mods");
                }
                for (int i2 = 0; i2 < m1304d; i2++) {
                    if (this.f2885dR == null) {
                        c0394h = new C0394h();
                    } else if (i2 >= this.f2885dR.length) {
                        Core.LogDebug2("readIn: legs " + ((int) i2) + ">=" + this.f2885dR.length);
                        c0394h = new C0394h();
                    } else {
                        c0394h = this.f2885dR[i2];
                    }
                    C0394h c0394h2 = c0394h;
                    c0394h2.f2415b = reader.m1300g();
                    c0394h2.f2416c = reader.m1300g();
                    c0394h2.f2427d = reader.m1300g();
                    c0394h2.f2421i = reader.m1300g();
                    c0394h2.f2422k = reader.ReadBool();
                    c0394h2.f2431o = true;
                    c0394h2.f2428j = reader.ReadBool();
                    c0394h2.f2429m = reader.ReadBool();
                    c0394h2.f2430n = reader.ReadBool();
                }
            }
            if (ReadInt >= 6) {
                this.f2878dK.m3451a(reader);
            }
            if (ReadInt >= 7 && (m1290q = reader.m1290q()) != null) {
                if (m1290q instanceof C0453l) {
                    this.f2865z = (C0453l) m1290q;
                } else {
                    Core.m998b("Got non CustomUnitMetadata object of:" + m1290q.mo4474i() + " loading real_meta");
                    this.f2865z = C0453l.f2903b;
                }
            }
            if (ReadInt >= 8) {
                this.f2848i = reader.ReadBool();
                this.f2847h = reader.ReadBool();
            }
            if (ReadInt >= 9 && reader.ReadBool()) {
                m3903a(C0448g.m3958a(reader), true);
            }
            if (ReadInt >= 10) {
                C0359aq.m4248a(this, reader, ReadInt);
            }
            if (ReadInt >= 11) {
                this.f2856q = reader.m1300g();
            }
        }
        super.m2961a(reader);
        if (this.f2885dR != null) {
            this.f2881dN = this.f6958el;
            this.f2882dO = this.f6959em;
            this.f2883dP = this.f6960en;
            this.f2884dQ = this.f1618ce;
        }
    }

    /* renamed from: cq */
    public boolean m3810cq() {
        return this.f2863x.f3263eK > 0;
    }

    /* renamed from: bB */
    public int mo4818bB() {
        return this.f2867B.size();
    }

    /* renamed from: bA */
    public boolean mo4819bA() {
        return this.f2853n;
    }

    /* renamed from: d */
    public boolean m3801d(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2863x.f3263eK == 0 || this.f2853n || this.f1624ck < 1.0f || !m3936G(abstractC0244am) || abstractC0244am == this) {
            return false;
        }
        if (this.f1609bV != abstractC0244am.f1609bV && !z && (!this.f2863x.f3029cz || this.f1609bV != AbstractC0197n.f1371i)) {
            return false;
        }
        if (this.f2863x.f3128eN != null && !this.f2863x.f3128eN.m3952a() && !C0448g.m3960a(this.f2863x.f3128eN, abstractC0244am.m4676dc())) {
            return false;
        }
        if (this.f2863x.f3264eO.size() > 0) {
            boolean z2 = false;
            Iterator it = this.f2863x.f3264eO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((EnumC0246ao) it.next()) == abstractC0244am.mo3039h()) {
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
    public boolean m3775e(AbstractC0244am abstractC0244am, boolean z) {
        if (!m3801d(abstractC0244am, z)) {
            return false;
        }
        m3942C(abstractC0244am);
        return true;
    }

    /* renamed from: C */
    public void m3942C(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1651cL = this;
        this.f2867B.add(abstractC0244am);
        if (this.f2863x.f3030cA && this.f1609bV == AbstractC0197n.f1371i) {
            m3777e(abstractC0244am.f1609bV);
        }
        m4783a(EnumC0347ae.f2183l, abstractC0244am);
        abstractC0244am.m4783a(EnumC0347ae.f2186o, this);
        Core.m1087A().f6117bS.m1818l(abstractC0244am);
    }

    /* renamed from: D */
    public void m3940D(AbstractC0244am abstractC0244am) {
        m4783a(EnumC0347ae.f2184m, abstractC0244am);
        abstractC0244am.m4783a(EnumC0347ae.f2187p, this);
        if (this.f2863x.f3031cB && this.f2867B.size() == 0) {
            m3777e(AbstractC0197n.f1371i);
        }
    }

    /* renamed from: e */
    public void mo4817e(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1651cL == this) {
            this.f2867B.remove(abstractC0244am);
            abstractC0244am.f1651cL = null;
            m3940D(abstractC0244am);
            return;
        }
        Core.m973g("Unit is not being transported");
    }

    /* renamed from: L */
    public void m3932L() {
        if (this.f2863x.f3263eK == 0) {
            return;
        }
        this.f2853n = true;
        this.f2852m = 30.0f;
    }

    /* renamed from: M */
    public void m3930M() {
        if (this.f2863x.f3263eK == 0) {
            return;
        }
        this.f2853n = false;
    }

    /* renamed from: g */
    public boolean m3767g(boolean z) {
        if (this.f2867B.size() == 0) {
            return false;
        }
        return m3869b((AbstractC0244am) this.f2867B.remove(this.f2867B.size() - 1), z, this.f2867B.size() % 2 == 0);
    }

    /* renamed from: a */
    public boolean m3912a(AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        this.f2867B.remove(abstractC0244am);
        return m3869b(abstractC0244am, z, z2);
    }

    /* renamed from: b */
    private boolean m3869b(AbstractC0244am abstractC0244am, boolean z, boolean z2) {
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
        float m2092i = (this.f6958el + (C0758f.m2092i(this.f1618ce + f) * f4)) - (C0758f.m2097h(this.f1618ce + f) * f3);
        float m2097h = this.f6959em + (C0758f.m2097h(this.f1618ce + f) * f4) + (C0758f.m2092i(this.f1618ce + f) * f3);
        float m2092i2 = m2092i + (C0758f.m2092i(this.f1618ce + 90.0f) * (z2 ? -7.0f : 7.0f));
        float m2097h2 = m2097h + (C0758f.m2097h(this.f1618ce + 90.0f) * (z2 ? -7.0f : 7.0f));
        if (!z && !m3861bI()) {
            if (!C1117y.m469a(abstractC0244am, m2092i2, m2097h2)) {
                m2092i2 += 10.0f;
            }
            if (!C1117y.m469a(abstractC0244am, m2092i2, m2097h2)) {
                m2092i2 -= 20.0f;
            }
            if (!C1117y.m469a(abstractC0244am, m2092i2, m2097h2)) {
                m2092i2 -= 10.0f;
                m2097h2 += 10.0f;
            }
            if (!C1117y.m469a(abstractC0244am, m2092i2, m2097h2)) {
                m2097h2 -= 20.0f;
            }
        }
        if (!z && !C1117y.m469a(abstractC0244am, m2092i2, m2097h2) && !m3861bI()) {
            z3 = false;
        } else {
            z3 = true;
            boolean z4 = false;
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1652cM == this) {
                    C0399m dl = abstractC0623y.m4668dl();
                    if (dl == null) {
                        Core.LogDebug2("Unload, attachment data is null");
                    }
                    if (dl != null) {
                        z4 = dl.f2459E;
                    }
                }
            }
            C1117y.m464a(abstractC0244am, this);
            float f5 = this.f1618ce + f;
            if (!z4) {
                abstractC0244am.f6958el = m2092i2;
                abstractC0244am.f6959em = m2097h2;
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
                    abstractC0623y2.m2821j(abstractC0244am.f1618ce);
                }
                if (!this.f2863x.f3134eU.read(this)) {
                    abstractC0623y2.m2901az();
                    if (f2 != 0.0f) {
                        abstractC0623y2.m2843d(abstractC0244am.f6958el + (C0758f.m2092i(f5 + (z2 ? -7.0f : 7.0f)) * f2), abstractC0244am.f6959em + (C0758f.m2097h(f5 + (z2 ? -7.0f : 7.0f)) * f2));
                    }
                    abstractC0623y2.f3920ab = 0;
                } else {
                    abstractC0623y2.m2946aH();
                }
            }
            if (!z4) {
                if (!this.f2863x.f3061dk) {
                    abstractC0244am.f6960en = this.f6960en;
                }
                abstractC0244am.f6960en += this.f2863x.f3060dj;
            }
            if (abstractC0244am instanceof C0451j) {
                ((C0451j) abstractC0244am).m3797dD();
            }
        }
        if (!z3) {
            this.f2867B.add(abstractC0244am);
        } else {
            m3940D(abstractC0244am);
        }
        return z3;
    }

    /* renamed from: bX */
    public int m3855bX() {
        if (this.f2863x.f3263eK == 0 || !this.f2863x.f2909w) {
            return -1;
        }
        return m3794dG();
    }

    /* renamed from: bY */
    public int m3854bY() {
        if (this.f2863x.f3263eK == 0 || !this.f2863x.f2909w) {
            return -1;
        }
        return this.f2863x.f3263eK;
    }

    /* renamed from: dq */
    public void m3782dq() {
        if (this.f2867B.f6894a > 0) {
            m3764h(this.f2863x.f3133eT.read(this));
        }
    }

    /* renamed from: h */
    public void m3764h(boolean z) {
        Iterator it = this.f2867B.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            abstractC0244am.f1651cL = null;
            abstractC0244am.f6958el = this.f6958el + (C0758f.m2092i(this.f1618ce) * (-9.0f));
            abstractC0244am.f6959em = this.f6959em + (C0758f.m2097h(this.f1618ce) * (-9.0f));
            if (z) {
                abstractC0244am.m4699ci();
            }
        }
        this.f2867B.clear();
    }

    /* renamed from: bu */
    public void m3843bu() {
        if (!this.f1607bT) {
            m4784a(EnumC0347ae.f2174c);
        }
        Object[] m534a = this.f2863x.f3196h.m534a();
        for (int i = this.f2863x.f3196h.f6894a - 1; i >= 0; i--) {
            ((AbstractC0387a) m534a[i]).mo4218b(this);
        }
        super.m2858bu();
    }

    /* renamed from: a */
    public void mo2689a() {
        m3782dq();
        Object[] m534a = this.f2863x.f3196h.m534a();
        for (int i = this.f2863x.f3196h.f6894a - 1; i >= 0; i--) {
            ((AbstractC0387a) m534a[i]).mo4217c(this);
        }
        AbstractC0197n.m5089a((AbstractC0244am) this);
        this.f2878dK.m3450a(true);
        super.mo2689a();
    }

    /* renamed from: dr */
    public C0453l mo1758r() {
        return this.f2863x;
    }

    /* renamed from: I */
    public boolean mo3057I() {
        if (this.f2863x.f2949aG || this.f2846g || this.f1652cM != null) {
            return false;
        }
        return true;
    }

    /* renamed from: aR */
    public boolean m3892aR() {
        if (this.f2863x.f3085dM) {
            return false;
        }
        C0399m dl = m4668dl();
        if (dl != null && !dl.f2465O) {
            return false;
        }
        return true;
    }

    /* renamed from: aS */
    public boolean m3891aS() {
        if (this.f2863x.f2949aG) {
            return false;
        }
        C0399m dl = m4668dl();
        if (dl != null && !dl.f2461H) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public EnumC0246ao mo3039h() {
        return this.f2863x.f3141ff;
    }

    /* renamed from: i */
    public boolean mo3038i() {
        return this.f2863x.f3141ff == EnumC0246ao.f1706d && this.f6960en >= 4.0f;
    }

    /* renamed from: Q */
    public boolean mo3054Q() {
        return this.f6960en <= -1.0f;
    }

    /* renamed from: ct */
    public boolean m3807ct() {
        if (mo3039h() == EnumC0246ao.f1707e) {
            return true;
        }
        return false;
    }

    /* renamed from: cr */
    public boolean m3809cr() {
        if (mo3039h() == EnumC0246ao.f1706d) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1 || this.f2863x.f2942ar == null) {
            return null;
        }
        return this.f2863x.f2942ar[this.f1609bV.m5105O()];
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT && this.f2863x.f3216am != null) {
            return this.f2863x.f3216am;
        }
        return this.f2863x.f3219aq[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return this.f2863x.f3218ao;
    }

    /* renamed from: F */
    public boolean mo3060F() {
        return Core.m1087A().settingEngine.renderExtraShadows && (!this.f1607bT || this.f6960en >= 1.0f) && this.f6960en >= -1.0f;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2559C != null && c0411bl.f2559C.read(this)) {
            return null;
        }
        if (c0411bl.f2594aE != null) {
            return c0411bl.f2594aE[this.f1609bV.m5105O()];
        }
        if (c0411bl.f2593aD != null) {
            return c0411bl.f2593aD;
        }
        if (this.f2863x.f3220as != null) {
            return this.f2863x.f3220as[this.f1609bV.m5105O()];
        }
        return this.f2863x.f3217an;
    }

    /* renamed from: h */
    public float m3766h(int i) {
        return this.f2863x.f3269fO[i].f2596aG;
    }

    /* renamed from: i */
    public float m3763i(int i) {
        return this.f2863x.f3269fO[i].f2597aH;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        AbstractC0197n abstractC0197n;
        Core m1087A = Core.m1087A();
        if (m3861bI()) {
            m1087A.f6119bU.m1165a(this);
        }
        if (this.f1624ck < 1.0f) {
            if (this.f2863x.f2989bx != null && this.f2863x.f2989bx.m3635b()) {
                this.f2863x.f2989bx.m3637a(this.f6958el, this.f6959em, this.f6960en, this.f1618ce, null);
                return false;
            } else if (this.f2863x.f2990by != null && this.f2863x.f2990by.m3635b()) {
                this.f2863x.f2990by.m3637a(this.f6958el, this.f6959em, this.f6960en, this.f1618ce, null);
                return false;
            } else {
                m2981a(EnumC0233ab.f1502a);
                return false;
            }
        }
        if (!this.f2863x.f3142fg) {
            m447S(0);
        }
        if (this.f2863x.f2990by != null && this.f2863x.f2990by.m3635b()) {
            this.f2863x.f2990by.m3637a(this.f6958el, this.f6959em, this.f6960en, this.f1618ce, null);
        }
        if (this.f2863x.f3232bB != -1) {
            m3915a((AbstractC0244am) null, this.f6958el, this.f6959em, this.f2863x.f3232bB, (C0405bf) null, 0);
        }
        if (this.f2863x.f2992bC != null) {
            if (this.f2863x.f2993bD && this.f1579bs != null && this.f1579bs.f1609bV != null) {
                abstractC0197n = this.f1579bs.f1609bV;
            } else {
                abstractC0197n = this.f1609bV;
            }
            if (!abstractC0197n.f1327D) {
                this.f2863x.f2992bC.m4153a(this.f6958el, this.f6959em, this.f6960en, this.f1618ce, abstractC0197n, this.f1644cE, this);
            }
        }
        this.f1606bS = false;
        if (!this.f2863x.f3142fg) {
            m3782dq();
        }
        if (this.f2863x.f2979bn) {
            boolean z = false;
            if (this.f2863x.f2983br && m1087A.m1074N() && m1087A.f6122bX.f5603aO.f5662i) {
                z = true;
            }
            if (!z) {
                C0188f m3396a = C0507q.m3396a(this, this.f6958el, this.f6959em, this.f6958el, this.f6959em);
                m3396a.f1059aH = false;
                m3396a.f1026Z = this.f2863x.f2980bo;
                m3396a.f1025Y = this.f2863x.f2981bp;
            }
        }
        if (this.f2863x.f2978bm != 0) {
            C0240ai c0240ai = new C0240ai(false);
            c0240ai.f6958el = this.f6958el;
            c0240ai.f6959em = this.f6959em;
            c0240ai.m4768b(AbstractC0197n.f1370h);
            AbstractC0197n.m5053c(c0240ai);
        }
        if (this.f2863x.f2991bz != null) {
            this.f2863x.f2991bz.m4161a(this.f6958el, this.f6959em, 1.0f);
        }
        if (this.f2863x.f3120eB) {
            if (this.f2863x.f2991bz == null) {
                m1087A.f6111bM.m2776a(C0631e.f4061A, 0.8f, this.f6958el, this.f6959em);
            }
            if (this.f2863x.f2986bu) {
                if (!mo3038i() && !this.f2863x.f3260eH) {
                    C0195l.m5129a(this, 1);
                }
                if (this.f2863x.f2985bt != null) {
                    m2980a(this.f2863x.f2985bt, true);
                } else if (this.f2863x.f2975bj) {
                    m2981a(EnumC0233ab.f1505d);
                }
            }
            if (this.f2863x.f3121eC) {
                for (int i = 0; i < m3845bp(); i++) {
                    m1087A.f6116bR.m2360d(this.f6958el, this.f6959em, this.f6960en);
                }
            }
        } else {
            if (this.f2885dR != null) {
                m3779dy();
                for (int i2 = 0; i2 < this.f2885dR.length; i2++) {
                    C0394h c0394h = this.f2885dR[i2];
                    C0384ay c0384ay = this.f2863x.f3223aw[i2];
                    float f = this.f6958el + c0394h.f2415b;
                    float f2 = this.f6959em + c0394h.f2416c;
                    if (c0384ay.f2309J && !c0384ay.f2281p && (c0384ay.f2282q == null || !c0384ay.f2282q.read(this))) {
                        if (!C1117y.m449d(f, f2) && !this.f2863x.f3260eH) {
                            C0195l.m5131a(f, f2);
                        }
                        m1087A.f6116bR.m2370b(f, f2, 0.0f);
                    }
                }
            }
            if (!mo3038i()) {
                if (this.f2863x.f2986bu) {
                    if (this.f2863x.f2985bt != null) {
                        m2980a(this.f2863x.f2985bt, true);
                    } else {
                        m2981a(EnumC0233ab.f1503b);
                    }
                }
            } else {
                if (this.f2863x.f2986bu) {
                    if (this.f2863x.f2985bt != null) {
                        m2980a(this.f2863x.f2985bt, false);
                    } else {
                        m1087A.f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
                    }
                }
                for (int i3 = 0; i3 < m3845bp(); i3++) {
                    m1087A.f6116bR.m2358e(this.f6958el, this.f6959em, this.f6960en);
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
    public void m3844bq() {
        if (!this.f2863x.f3260eH) {
            super.m2862bq();
        }
    }

    /* renamed from: U */
    public void m3928U() {
        float mo3182C;
        super.m3006U();
        for (int i = 0; i < this.f2863x.f3269fO.length; i++) {
            C0247ap c0247ap = this.f1649cJ[i];
            Core.LogDebug2("Dir was:" + c0247ap.f1712a + " for name:" + this.f2863x.f3269fO[i].f2543a);
            Core.LogDebug2("lockDelay:" + c0247ap.f1715d + " shootCooldown:" + c0247ap.f1716e);
            Core.LogDebug2("updateAndShouldResetTurret:" + m3876b(i, 0.0f));
            Core.LogDebug2("idleDir:" + mo3182C(i));
            Core.LogDebug2("diffDir:" + C0758f.m2135c(c0247ap.f1712a, mo3182C, 360.0f));
        }
    }

    /* renamed from: a */
    public void m3902a(C0453l c0453l, boolean z, boolean z2) {
        m3901a(c0453l, z, z2, (AbstractC0377ar[]) null);
    }

    /* renamed from: a */
    public void m3901a(C0453l c0453l, boolean z, boolean z2, AbstractC0377ar[] abstractC0377arArr) {
        Core m1087A = Core.m1087A();
        C0453l c0453l2 = this.f2863x;
        C0359aq c0359aq = this.f2864y;
        this.f2863x = c0453l;
        this.f1689dx = this.f2863x;
        this.f2864y = c0453l.f3246cJ;
        if (z2) {
            C0359aq.m4250a(this, c0359aq, c0453l2);
        } else if (abstractC0377arArr != null) {
            C0359aq.m4249a(this, c0359aq, abstractC0377arArr);
        }
        m4752bR();
        if (!z2) {
            m3760j(true);
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
                        C0411bl m3691e = c0453l2.m3691e(c0411bl.f2543a);
                        if (m3691e != null) {
                            c0247apArr[c0411bl.f2547e] = this.f1649cJ[m3691e.f2547e];
                            this.f1649cJ[m3691e.f2547e] = null;
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
                            c0247apArr[i3].m4638a(this.f1618ce);
                        }
                    }
                    this.f1649cJ = c0247apArr;
                }
            }
        } else {
            for (int i5 = 0; i5 < c0453l.f3269fO.length; i5++) {
                this.f1649cJ[i5].m4638a(this.f1618ce + m3944B(i5));
            }
        }
        if (this.f2863x.f3214ad) {
            m2691V(this.f2863x.f2934ae);
            m2690W(this.f2863x.f2935af);
        } else {
            m2693T(this.f2863x.f2934ae);
            m2692U(this.f2863x.f2935af);
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
            this.f6960en += this.f2863x.f3254dP;
        }
        float f = this.f1633ct;
        this.f1633ct = this.f2864y.f2240c;
        if (z) {
            m4650o(this.f1633ct);
        } else if (f == 0.0f) {
            m4650o(this.f1633ct);
        } else {
            m4650o((this.f1632cs / f) * this.f1633ct);
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
            m3008S();
        }
        if (this.f2863x.f2949aG && z) {
            this.f1618ce = -90.0f;
        }
        mo3047c_();
        if (!z && ((this.f1583bw != null || this.f1584bx != null) && (!C0424b.m4101b(this.f2863x.f3017cf, c0453l2.f3017cf) || !C0424b.m4101b(this.f2863x.f3019ch, c0453l2.f3019ch)))) {
            this.f1583bw = null;
            this.f1584bx = null;
        }
        if (!z) {
            boolean z4 = this.f2863x.mo4473j() != c0453l2.mo4473j();
            if (this.f2863x.mo4473j()) {
                this.f1615cb = 0.0f;
                this.f1614ca = 0.0f;
                if (c0453l2.mo4473j() && !this.f2863x.f3247cV.equals(c0453l2.f3247cV)) {
                    z4 = true;
                }
            }
            if (z4) {
                m1087A.f6119bU.m1165a(this);
            }
        }
        this.f2849j = 1.0f;
        if (this.f2863x.f3245cG != -2) {
        }
        if (!this.f1607bT) {
            m3797dD();
        }
        if (this.f2863x.f3122eD) {
        }
        m3780ds();
        m4675de().m4131a(this.f2863x);
        if (!z) {
            int mo3169bl = mo3169bl();
            for (int i6 = 0; i6 < mo3169bl; i6++) {
                C0247ap c0247ap = this.f1649cJ[i6];
                C0411bl c0411bl2 = this.f2863x.f3269fO[i6];
                if (c0411bl2 != null) {
                    if (c0247ap.f1716e > c0411bl2.f2601m) {
                        c0247ap.f1716e = c0411bl2.f2601m;
                    }
                    if (c0247ap.f1717f > c0411bl2.f2602n) {
                        c0247ap.f1717f = c0411bl2.f2602n;
                    }
                }
            }
        }
        if (!z) {
            if (!this.f2863x.f3051da) {
                this.f2878dK.f3500b = null;
            }
            if (this.f2863x.f3140fe != c0453l2.f3140fe) {
                m2946aH();
            }
        }
        if (this.f2863x.f3031cB && this.f2867B.size() == 0) {
            m2894b(AbstractC0197n.f1371i);
        }
        if (this.f1644cE && !m1087A.f6117bS.m1824i(this)) {
            m1087A.f6117bS.m1818l(this);
        }
        if (!z) {
            Object[] m534a = this.f2863x.f3196h.m534a();
            for (int i7 = this.f2863x.f3196h.f6894a - 1; i7 >= 0; i7--) {
                ((AbstractC0387a) m534a[i7]).mo4219a(this, c0453l2);
            }
            if (this.f1624ck >= 1.0f) {
                if (this.f2864y.f2251n > c0359aq.f2251n) {
                    m3838c(false);
                }
            } else {
                if ((this.f2863x.f3056df != -1 ? this.f2863x.f3056df : this.f2864y.f2251n) > (c0453l2.f3056df != -1 ? c0453l2.f3056df : c0359aq.f2251n)) {
                    m3838c(false);
                }
            }
        }
        if (this.f2848i && this.f2863x.f3066dt != null) {
            this.f2841b.m4065a(this.f2863x.f3066dt, 7, true);
        }
    }

    /* renamed from: c_ */
    public void mo3047c_() {
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
        m3902a(c0453l, true, false);
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        float f2;
        C0745e m2361c;
        float a;
        InterfaceC0303as mo3643c;
        float f3;
        float f4;
        float f5;
        C0745e m2369b;
        boolean z = this.f2848i;
        if (z) {
            this.f2848i = false;
            Object[] m534a = this.f2863x.f3196h.m534a();
            for (int i = this.f2863x.f3196h.f6894a - 1; i >= 0; i--) {
                ((AbstractC0387a) m534a[i]).mo4214a(this);
            }
            m3868b(EnumC0347ae.f2172a);
        }
        C0453l c0453l = this.f2863x;
        super.mo1762a(f);
        if (this.f1607bT && !this.f2851l) {
            if (this.f6960en > 0.0f) {
                if (c0453l.f3142fg && !(this.f1617cd == 0.0f && this.f1614ca == 0.0f && this.f1615cb == 0.0f)) {
                    this.f2845f += 0.017f * f;
                    this.f6960en -= this.f2845f * f;
                    PointF n = m2807n(f);
                    this.f6958el += n.f227a;
                    this.f6959em += n.f228b;
                    if (c0453l.f3140fe == EnumC0246ao.f1706d) {
                        Core m1087A = Core.m1087A();
                        this.f1680do += f;
                        this.f1678dm += f;
                        if (c0453l.f3143fh && this.f1680do > 9.0f) {
                            this.f1680do = C0758f.m2136c(1.0f, 3.0f);
                            C0745e m2365b = m1087A.f6116bR.m2365b(this.f6958el, this.f6959em, this.f6960en, EnumC0744d.f4707a, false, EnumC0748h.f4833b);
                            if (m2365b != null) {
                                m2365b.f4787ar = 0;
                                m2365b.f4786aq = 0;
                                m2365b.f4788as = (short) 2;
                                m2365b.f4736s = true;
                                m2365b.f4749F = 0.5f;
                                m2365b.f4767X = 60.0f;
                                m2365b.f4766W = 60.0f;
                                m2365b.f4751H = 0.9f;
                                m2365b.f4750G = 1.2f;
                                m2365b.f4789at = false;
                                m2365b.f4760Q = 0.0f;
                                m2365b.f4761R = 0.0f;
                            }
                        }
                        if (this.f1678dm > 7.0f) {
                            this.f1678dm = 0.0f;
                            C0745e m2365b2 = m1087A.f6116bR.m2365b(this.f6958el, this.f6959em, this.f6960en, EnumC0744d.f4707a, false, EnumC0748h.f4832a);
                            if (m2365b2 != null) {
                                C0746f.m2339b(m2365b2, true);
                                m2365b2.f4753J = this.f6958el;
                                m2365b2.f4754K = this.f6959em;
                                m2365b2.f4755L = this.f6960en;
                                m2365b2.f4760Q += C0758f.m2136c(-0.1f, 0.1f) + this.f1614ca;
                                m2365b2.f4761R += C0758f.m2136c(-0.1f, 0.1f) + this.f1615cb;
                                m2365b2.f4753J += C0758f.m2136c(-4.0f, 4.0f);
                                m2365b2.f4754K += C0758f.m2136c(-4.0f, 4.0f);
                            }
                        }
                    }
                } else {
                    this.f2845f += c0453l.f3257dU * f;
                    this.f6960en -= this.f2845f * f;
                }
            } else if (!this.f2850k) {
                this.f2850k = true;
                if (c0453l.f3142fg) {
                    m3782dq();
                    m447S(0);
                    if (c0453l.f3216am != null) {
                        this.f3885L = c0453l.f3216am;
                        this.f2840a = 0;
                        this.f4232et = true;
                    } else {
                        m4700ch();
                    }
                }
                if (this.f2845f > 0.5d) {
                    if (c0453l.f2988bw != null && c0453l.f2988bw.m3638a()) {
                        c0453l.f2988bw.m3637a(this.f6958el, this.f6959em, this.f6960en, this.f1618ce, null);
                    }
                    if (m4724cJ()) {
                        if (c0453l.f2987bv) {
                            m2981a(EnumC0233ab.f1502a);
                        }
                        if (m4725cI()) {
                            Core.m1087A().f6116bR.m2383a(this.f6958el, this.f6959em, 0.0f, 0, 0.0f, 0.0f, this.f1618ce);
                        }
                    } else if (c0453l.f2987bv) {
                        m2981a(EnumC0233ab.f1503b);
                    }
                }
                this.f2845f = 0.0f;
            } else if (m4724cJ()) {
                if (this.f6960en > -10.0f) {
                    this.f2845f += 8.0E-4f * f;
                    this.f6960en -= this.f2845f * f;
                    if (m4725cI()) {
                        this.f2859t += f;
                        if (this.f2859t > 30.0f) {
                            this.f2859t = 0.0f;
                            if (mo3348p_() && (m2369b = Core.m1087A().f6116bR.m2369b(this.f6958el, this.f6959em, this.f6960en, this.f1618ce)) != null) {
                                m2369b.f4760Q = 0.0f;
                                m2369b.f4761R = -0.1f;
                            }
                        }
                    }
                } else {
                    this.f2851l = true;
                }
            } else {
                this.f6960en = 0.0f;
                this.f2851l = true;
            }
        }
        if (this.f1607bT) {
            return;
        }
        Core m1087A2 = Core.m1087A();
        if (c0453l.f2973bh != 0.0f && this.f1624ck < 1.0f) {
            float f6 = this.f1624ck + (c0453l.f2973bh * f);
            if (f6 >= 1.0f) {
                AbstractC0197n.m5069b((AbstractC0244am) this);
                this.f1624ck = 1.0f;
                this.f1625cl = 1.0f;
                AbstractC0197n.m5053c(this);
            } else {
                this.f1624ck = f6;
                this.f1625cl = f6;
            }
        }
        if (!m4751bS()) {
            if (this.f1624ck < 1.0f) {
                if (c0453l.f3067du != null) {
                    this.f2841b.m4066a(c0453l.f3067du, 8);
                    this.f2841b.m4068a(f);
                } else if (c0453l.f3068dv != null) {
                    this.f2841b.m4066a(c0453l.f3068dv, 99);
                    this.f2841b.f2722b = this.f1624ck;
                    this.f2841b.f2724d = 0.0f;
                    this.f2841b.m4068a(f);
                }
            }
            Object[] m534a2 = c0453l.f3196h.m534a();
            for (int i2 = c0453l.f3196h.f6894a - 1; i2 >= 0; i2--) {
                ((AbstractC0387a) m534a2[i2]).mo4220a(this, f);
            }
            return;
        }
        Object[] m534a3 = c0453l.f3196h.m534a();
        for (int i3 = c0453l.f3196h.f6894a - 1; i3 >= 0; i3--) {
            ((AbstractC0387a) m534a3[i3]).mo4198b(this, f);
        }
        if (this.f2847h) {
            this.f2847h = false;
            m4784a(EnumC0347ae.f2173b);
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
                    m3842bv();
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
                this.f1636cw = C0758f.m2210a(this.f1636cw, 0.0f, c0453l.f3047cT * f);
                if (this.f1636cw > 50.0f) {
                    this.f1636cw = 50.0f;
                }
            }
        }
        this.f2878dK.m3466a(f);
        C0453l c0453l2 = this.f2863x;
        if (c0453l2.f3149fn) {
            C0519b.m3343a(f, this);
        }
        if (c0453l2.f3022cl) {
            this.f2854o += f;
            if (this.f2854o > c0453l2.f3023cp - 0.1f) {
                this.f2854o -= c0453l2.f3023cp;
                boolean read = c0453l2.f3025cv.read(this);
                if (this.f2855p != read) {
                    AbstractC0197n.m5089a((AbstractC0244am) this);
                    this.f2855p = read;
                    AbstractC0197n.m5053c(this);
                }
                if (this.f2855p) {
                    c0453l2.f3238cm.m4085g(this);
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
            this.f2841b.m4066a(c0453l2.f3251dq, 3);
        } else if (!this.f2841b.f2725e || this.f2841b.f2721a == c0453l2.f3252dr) {
            this.f2841b.m4066a(c0453l2.f3252dr, 2);
        }
        if (c0453l2.f2999bL) {
            if (c0453l2.f2997bJ && m1087A2.f6259dc) {
                if (this.f1617cd > 0.0f || (this.f1617cd < 0.0f && c0453l2.f2998bK)) {
                    this.f2859t += f;
                }
                if (this.f2859t > 10.0f) {
                    this.f2859t = 0.0f;
                    if (this.f6955ei && m4725cI()) {
                        float f7 = this.f1618ce + 180.0f;
                        if (this.f1617cd < 0.0f) {
                            f7 += 180.0f;
                        }
                        float f8 = this.f1621ch - 6.0f;
                        if (f8 < 4.0f) {
                            f8 = 4.0f;
                        }
                        m1087A2.f6116bR.m2369b(this.f6958el + (C0758f.m2092i(f7) * f8), this.f6959em + (C0758f.m2097h(f7) * f8), 0.0f, f7);
                    }
                }
            }
            if (m1087A2.f6258db && ((this.f1617cd > 0.0f || this.f1617cd < 0.0f) && this.f6955ei)) {
                this.f2843d += f;
                if (this.f2843d > c0453l2.f3005bR) {
                    this.f2843d = 0.0f;
                    if (this.f1617cd > 0.0f) {
                        if (c0453l2.f3002bO != null) {
                            c0453l2.f3002bO.m3637a(this.f6958el, this.f6959em, this.f6960en, this.f1618ce, this);
                        }
                    } else if (c0453l2.f3003bP != null) {
                        float f9 = this.f1618ce;
                        if (c0453l2.f3004bQ) {
                            f9 += 180.0f;
                        }
                        c0453l2.f3003bP.m3637a(this.f6958el, this.f6959em, this.f6960en, f9, this);
                    }
                    if (c0453l2.f3000bM && ((this.f1617cd > 0.0f || c0453l2.f3001bN) && !m4725cI())) {
                        int i4 = 0;
                        while (i4 <= 1) {
                            float f10 = i4 == 0 ? -20 : 20;
                            float f11 = this.f1618ce + 180.0f;
                            if (this.f1617cd < 0.0f) {
                                f10 += 180.0f;
                                f11 += 180.0f;
                            }
                            C0745e m2362c = m1087A2.f6116bR.m2362c(this.f6958el + (C0758f.m2092i(this.f1618ce + 180.0f + f10) * (this.f1621ch - 1.0f)), this.f6959em + (C0758f.m2097h(this.f1618ce + 180.0f + f10) * (this.f1621ch - 1.0f)), this.f6960en, f11 + C0758f.m2136c(-7.0f, 7.0f), 0);
                            if (m2362c != null) {
                                m2362c.f4760Q += C0758f.m2136c(-0.15f, 0.15f);
                                m2362c.f4761R += C0758f.m2136c(-0.15f, 0.15f);
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
                this.f2852m = C0758f.m2211a(this.f2852m, f);
                if (this.f2852m == 0.0f) {
                    this.f2852m = c0453l2.f3126eL;
                    if (this.f2867B.size() == 0) {
                        this.f2853n = false;
                    } else {
                        m3767g(false);
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
            m3797dD();
        }
        if ((c0453l2.f3140fe == EnumC0246ao.f1709g || c0453l2.f3140fe == EnumC0246ao.f1710h) && this.f1648cI) {
            if (m4726cH()) {
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
            boolean mo3038i = mo3038i();
            boolean z2 = false;
            if (c0453l2.f3086dN) {
                boolean cJ = m4724cJ();
                if (!this.f1648cI && !cJ && this.f2858s > 3.0f && (!c0453l2.f3087dO || m2910aq())) {
                    z2 = true;
                }
            }
            if (this.f1652cM == null) {
                if (z2) {
                    if (c0453l2.f3255dS < 0.0f) {
                        f4 = (C0758f.m2137c(this.f6960en - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f4 = c0453l2.f3255dS;
                    }
                    this.f6960en = C0758f.m2210a(this.f6960en, 2.0f, f4 * f);
                } else {
                    float m2097h = c0453l2.f3088dQ + (C0758f.m2097h(this.f2844e) * c0453l2.f3089dR);
                    if (c0453l2.f3255dS < 0.0f) {
                        f3 = (C0758f.m2137c(this.f6960en - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f3 = c0453l2.f3255dS;
                    }
                    this.f6960en = C0758f.m2210a(this.f6960en, m2097h, C0758f.m2159b(f3, (C0758f.m2137c(this.f6960en - m2097h) * 0.05f * 0.3f) + 0.1f) * f);
                }
                if (mo3038i != mo3038i()) {
                    this.f3944ax = true;
                    m3797dD();
                }
            }
        } else {
            float f12 = c0453l2.f3088dQ - c0453l2.f3089dR;
            if (this.f6960en < f12) {
                this.f6960en += 0.2f * f;
                if (this.f6960en >= f12) {
                    this.f6960en = f12;
                }
            }
            if ((c0453l2.f3088dQ != 0.0f || c0453l2.f3089dR != 0.0f || this.f6960en > 0.0f) && this.f1652cM == null) {
                float f13 = c0453l2.f3088dQ;
                if (c0453l2.f3089dR != 0.0f) {
                    this.f2844e += 2.0f * f;
                    if (this.f2844e > 360.0f) {
                        this.f2844e -= 360.0f;
                    }
                    f13 += C0758f.m2097h(this.f2844e) * c0453l2.f3089dR;
                }
                if (c0453l2.f3255dS < 0.0f) {
                    f2 = (C0758f.m2137c(this.f6960en - 2.0f) * 0.05f * 0.4f) + 0.2f;
                } else {
                    f2 = c0453l2.f3255dS;
                }
                this.f6960en = C0758f.m2210a(this.f6960en, f13, C0758f.m2159b(f2, (C0758f.m2137c(this.f6960en - f13) * 0.05f * 0.3f) + 0.1f) * f);
                boolean z3 = false;
                if (this.f6960en > c0453l2.f3088dQ + c0453l2.f3089dR + 1.0f) {
                    this.f2845f += c0453l2.f3256dT * f;
                    if (this.f6960en < 0.0f) {
                        this.f2845f = C0758f.m2159b(this.f2845f, 0.2f);
                    }
                    this.f6960en -= this.f2845f * f;
                    if (this.f2845f > 1.5d) {
                        this.f1680do += f;
                        if (this.f1680do > 0.5d) {
                            this.f1680do = 0.0f;
                            C0745e m2365b3 = m1087A2.f6116bR.m2365b(this.f6958el + C0758f.m2136c(-this.f1621ch, this.f1621ch), this.f6959em + C0758f.m2136c(-this.f1621ch, this.f1621ch), this.f6960en, EnumC0744d.f4707a, false, EnumC0748h.f4834c);
                            if (m2365b3 != null) {
                                m2365b3.f4787ar = 0;
                                m2365b3.f4786aq = 0;
                                m2365b3.f4788as = (short) 2;
                                m2365b3.f4736s = true;
                                m2365b3.f4737t = true;
                                m2365b3.f4738u = 40.0f;
                                m2365b3.f4784ao = true;
                                m2365b3.f4760Q = 0.1f;
                                m2365b3.f4762S = 0.0f;
                                m2365b3.f4739v = true;
                                m2365b3.f4749F = 0.4f;
                                m2365b3.f4767X = 380.0f;
                                m2365b3.f4766W = m2365b3.f4767X;
                                m2365b3.f4751H = 0.8f;
                                m2365b3.f4750G = 1.7f;
                                m2365b3.f4789at = false;
                                m2365b3.f4760Q += C0758f.m2136c(-0.04f, 0.04f);
                                m2365b3.f4761R += C0758f.m2136c(-0.04f, 0.04f);
                            }
                        }
                    }
                    if (this.f6960en <= c0453l2.f3088dQ + c0453l2.f3089dR + 1.0f) {
                        if (this.f2845f > 2.0f) {
                            z3 = true;
                        }
                        if (this.f6960en < c0453l2.f3088dQ + c0453l2.f3089dR) {
                            this.f6960en = c0453l2.f3088dQ + c0453l2.f3089dR;
                        }
                        this.f2845f = 0.0f;
                    }
                } else {
                    if (this.f2845f > 2.0f) {
                        z3 = true;
                    }
                    this.f2845f = 0.0f;
                }
                if (z3 && (m2361c = m1087A2.f6116bR.m2361c(this.f6958el, this.f6959em, this.f6960en, 0)) != null) {
                    m2361c.f4751H = 0.8f;
                    m2361c.f4750G = 1.4f;
                    m2361c.f4766W = 60.0f;
                    m2361c.f4767X = m2361c.f4766W;
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
            AbstractC0224s m3443d = this.f2878dK.m3443d();
            boolean z6 = false;
            if (m3443d != null) {
                if (m3443d instanceof C0342g) {
                    C0342g c0342g = (C0342g) m3443d;
                    C0339d c0339d = c0342g.f2149a;
                    boolean z7 = false;
                    z6 = c0342g.m4347L();
                    if (c0339d.f2057k != null && (mo3643c = c0339d.f2057k.mo3643c()) != null && (mo3643c instanceof C0453l)) {
                        z4 = true;
                        if (mo3643c != c0453l2) {
                            if (this.f2865z != null) {
                                AbstractC0197n.m5069b((AbstractC0244am) this);
                                m3901a(this.f2865z, false, false, this.f2866A);
                                this.f2865z = null;
                                this.f2866A = null;
                                c0453l2 = this.f2863x;
                                AbstractC0197n.m5053c(this);
                            }
                            AbstractC0197n.m5069b((AbstractC0244am) this);
                            this.f2865z = c0453l2;
                            this.f2866A = c0339d.f2058l;
                            m3901a((C0453l) mo3643c, false, false, c0339d.f2058l);
                            c0453l2 = this.f2863x;
                            AbstractC0197n.m5053c(this);
                        }
                    }
                    if (c0339d.f2084V != null) {
                        float floatValue = c0339d.f2084V.floatValue();
                        if (c0339d.f2087Y) {
                            float f14 = this.f6958el;
                            float f15 = this.f6959em;
                            C0499j m3449b = this.f2878dK.m3449b();
                            if (m3449b != null) {
                                float f16 = Float.MIN_VALUE;
                                float f17 = Float.MIN_VALUE;
                                if (m3449b.f3491i != null) {
                                    f16 = m3449b.f3491i.f6958el;
                                    f17 = m3449b.f3491i.f6959em;
                                } else if (m3449b.f3490h != null) {
                                    f16 = m3449b.f3490h.f227a;
                                    f17 = m3449b.f3490h.f228b;
                                }
                                if (f16 > Float.MIN_VALUE) {
                                    floatValue += C0758f.m2123d(f14, f15, f16, f17);
                                }
                            }
                        }
                        if (c0339d.f2088Z == null) {
                            a = m2996a(f, floatValue, true, c0339d.f2085W);
                        } else {
                            int i6 = c0339d.f2088Z.f2547e;
                            a = m2999a(f, floatValue, i6);
                            C0247ap c0247ap = this.f1649cJ[i6];
                            c0247ap.m4635b(5);
                            c0247ap.f1713b = c0247ap.f1712a;
                        }
                        if (c0339d.f2086X && C0758f.m2137c(a) > 5.0f) {
                            z7 = true;
                        }
                    }
                    if (c0339d.f2083U != null && !z7) {
                        this.f2841b.m4066a(c0339d.f2083U.m3651b(), 10);
                    }
                    if (z7) {
                        this.f2878dK.f3503e = 0.0f;
                    }
                }
                if (c0453l2.f3069dw != null && m3443d.mo6163i() != null && this.f2878dK.f3503e >= c0453l2.f3069dw.f2818q) {
                    this.f2841b.m4066a(c0453l2.f3069dw, 5);
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
            AbstractC0197n.m5069b((AbstractC0244am) this);
            m3901a(this.f2865z, false, false, this.f2866A);
            this.f2865z = null;
            this.f2866A = null;
            C0453l c0453l3 = this.f2863x;
            AbstractC0197n.m5053c(this);
        }
        this.f2841b.m4068a(f);
        m3877b(f, z);
        C0453l c0453l4 = this.f2863x;
    }

    /* renamed from: cw */
    public float m3805cw() {
        int i = this.f2863x.f3238cm.f2699b;
        if (!this.f2855p) {
            return 0.0f;
        }
        return i * this.f2863x.f3024cq;
    }

    /* renamed from: cx */
    public C0439f m3804cx() {
        if (!this.f2855p) {
            return C0439f.f2801a;
        }
        return this.f2863x.f3239cn;
    }

    /* renamed from: cy */
    public C0439f m3803cy() {
        if (!this.f2855p) {
            return C0439f.f2801a;
        }
        return this.f2863x.f3240co;
    }

    /* renamed from: a */
    public boolean mo3332a(int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        return m3906a(this.f2863x.f3269fO[i], i, abstractC0244am, z, z2);
    }

    /* renamed from: a */
    public final boolean m3907a(C0411bl c0411bl, int i, float f, float f2, boolean z) {
        Core m1087A = Core.m1087A();
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, f, f2);
        if (m2209a > c0411bl.f2580ae) {
            if (this.f1609bV == m1087A.f6099bs) {
                m1087A.f6117bS.m1850b("Location too far");
                return false;
            }
            return false;
        } else if (m2209a < c0411bl.f2620ah) {
            if (this.f1609bV == m1087A.f6099bs) {
                m1087A.f6117bS.m1850b("Location too close");
                return false;
            }
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m3906a(C0411bl c0411bl, int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        float f;
        if (!z && (c0411bl.f2565I || z2)) {
            float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
            if (m2209a > c0411bl.f2580ae || m2209a < c0411bl.f2620ah) {
                return false;
            }
        }
        if (!c0411bl.f2564H) {
            return true;
        }
        if (c0411bl.f2621ai != -1.0f) {
            if (c0411bl.f2609w != -1) {
                f = this.f1649cJ[c0411bl.f2609w].f1712a + c0411bl.f2551j;
            } else {
                f = this.f1618ce + c0411bl.f2551j;
            }
            if (C0758f.m2137c(C0758f.m2135c(f, C0758f.m2123d(this.f6958el, this.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em), 360.0f)) > c0411bl.f2621ai) {
                return false;
            }
        }
        if (c0411bl.f2570N != null && !c0411bl.f2570N.read(this)) {
            return false;
        }
        if (c0411bl.f2571O != null && !C0448g.m3960a(c0411bl.f2571O, abstractC0244am.m4676dc())) {
            return false;
        }
        if (c0411bl.f2572P != null && C0448g.m3960a(c0411bl.f2572P, abstractC0244am.m4676dc())) {
            return false;
        }
        if (abstractC0244am.mo3038i()) {
            if (c0411bl.f2566J != null) {
                return c0411bl.f2566J.read(this);
            }
            return true;
        } else if (abstractC0244am.mo3054Q()) {
            if (c0411bl.f2568L != null) {
                return c0411bl.f2568L.read(this);
            }
            return true;
        } else if (c0411bl.f2569M != null && !c0411bl.f2569M.read(this) && !abstractC0244am.m4727cG()) {
            return false;
        } else {
            if (c0411bl.f2567K != null) {
                return c0411bl.f2567K.read(this);
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (!c0411bl.f2611B || !m3906a(c0411bl, i, abstractC0244am, false, false)) {
            return;
        }
        for (int i2 = 0; i2 < this.f2863x.f3269fO.length; i2++) {
            C0411bl c0411bl2 = this.f2863x.f3269fO[i2];
            if (c0411bl2 != null && i2 != i && c0411bl2.f2584ao != null && c0411bl2.f2584ao == c0411bl && this.f1649cJ[i2].f1716e < 9000.0f - ((mo3050b(i) * 0.5f) - c0411bl2.f2602n)) {
                this.f1649cJ[i2].f1716e = 0.0f;
            }
        }
        if (c0411bl.f2609w != -1) {
            C0411bl c0411bl3 = this.f2863x.f3269fO[c0411bl.f2609w];
            if (!c0411bl3.f2611B && c0411bl3.f2604p != 0.0f) {
                this.f1649cJ[c0411bl.f2609w].f1716e = mo3050b(c0411bl.f2609w) + m3749t(c0411bl.f2609w);
            }
        }
        this.f2841b.m4065a(this.f2863x.f3253ds, 11, true);
        m3867b(c0411bl);
        m3915a(abstractC0244am, -1.0f, -1.0f, i, (C0405bf) null, 0);
    }

    /* renamed from: a */
    public boolean m3908a(C0411bl c0411bl) {
        if (c0411bl.f2608u > 0.0f && (c0411bl.f2608u > this.f1639cz || this.f2861v)) {
            return false;
        }
        if (c0411bl.f2555v != null && !c0411bl.f2555v.mo4075b(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m3867b(C0411bl c0411bl) {
        if (c0411bl.f2608u > 0.0f) {
            this.f1639cz -= c0411bl.f2608u;
            if (this.f1639cz < c0411bl.f2608u && this.f2863x.f3043cP) {
                this.f2861v = true;
            }
        }
        if (c0411bl.f2555v != null) {
            c0411bl.f2555v.mo4081a(this);
        }
    }

    /* renamed from: a */
    public static C0188f m3913a(AbstractC0244am abstractC0244am, int i, C0405bf c0405bf, float f, float f2, float f3, float f4) {
        C0188f m5203a = C0188f.m5203a(abstractC0244am, f, f2, f3, i);
        m3922a(m5203a, abstractC0244am, i, c0405bf, f, f2, f3, f4);
        return m5203a;
    }

    /* renamed from: a */
    public static void m3922a(C0188f c0188f, AbstractC0244am abstractC0244am, int i, C0405bf c0405bf, float f, float f2, float f3, float f4) {
        C0745e m2376a;
        Core m1087A = Core.m1087A();
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
            c0188f.f994t += C0758f.m2188a((AbstractC1120w) abstractC0244am, (int) ((-c0405bf.f1140aM) * 100.0f), (int) (c0405bf.f1140aM * 100.0f), 1) / 100.0f;
        }
        if (c0405bf.f1121T && i != -1) {
            c0188f.f1046au = abstractC0244am;
            if (abstractC0244am instanceof AbstractC0623y) {
                c0188f.f1047av = i;
                C1080ai m3025D = ((AbstractC0623y) abstractC0244am).m3025D(i);
                c0188f.f1048aw = m3025D.f6849a;
                c0188f.f1049ax = m3025D.f6850b;
                c0188f.f1050ay = abstractC0244am.f6960en + m3025D.f6851c;
            } else {
                c0188f.f1048aw = abstractC0244am.f6958el;
                c0188f.f1049ax = abstractC0244am.f6959em;
                c0188f.f1050ay = abstractC0244am.f6960en;
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
            int m5950a = Color.m5950a(c0188f.f1043ar);
            int m5946b = (int) (Color.m5946b(c0188f.f1043ar) * f5);
            int m5945c = (int) (Color.m5945c(c0188f.f1043ar) * f5);
            int m5944d = (int) (Color.m5944d(c0188f.f1043ar) * f5);
            int m5112H = abstractC0244am.f1609bV.m5112H();
            c0188f.f1043ar = Color.m5948a(m5950a, C0758f.m2153b((int) (m5946b + (Color.m5946b(m5112H) * c0405bf.f1199aG)), 0, 255), C0758f.m2153b((int) (m5945c + (Color.m5945c(m5112H) * c0405bf.f1199aG)), 0, 255), C0758f.m2153b((int) (m5944d + (Color.m5944d(m5112H) * c0405bf.f1199aG)), 0, 255));
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
            c0405bf.f1129ai.m3637a(c0188f.f6958el, c0188f.f6959em, c0188f.f6960en, c0188f.f1051az, c0188f);
        }
        if (c0405bf.f1184ao != -1) {
            boolean z = false;
            C0745e c0745e = c0188f.f1067aP;
            if (c0745e != null && c0745e.f4719b == c0188f && c0745e.f4721d && c0745e != null) {
                if (c0745e.f4766W < 150.0f) {
                    c0745e.f4766W = 200.0f;
                }
                z = true;
            }
            if (!z && (m2376a = m1087A.f6116bR.m2376a(c0188f, c0405bf.f1184ao, c0405bf.f1185ap)) != null) {
                if (c0405bf.f1134aq) {
                    m2376a.f4720c = true;
                }
                if (c0405bf.f1171L) {
                    c0188f.f1067aP = m2376a;
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
        c0188f.f6956ej = abstractC0244am.f6956ej;
        if (c0188f.f6956ej < 4 && f3 >= -1.0f) {
            c0188f.f6956ej = 4;
        }
        if (c0405bf.f1176U) {
            c0188f.f6956ej = 1;
        }
    }

    /* renamed from: a */
    public C0188f m3915a(AbstractC0244am abstractC0244am, float f, float f2, int i, C0405bf c0405bf, int i2) {
        C0405bf c0405bf2;
        Core m1087A = Core.m1087A();
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2590aA != null) {
            this.f2841b.m4065a(c0411bl.f2590aA.m3651b(), 6, true);
        }
        if (c0411bl.f2591aB > 0.0f) {
            m2900b(c0411bl.f2591aB);
        }
        if (c0411bl.f2592aC != null) {
            c0411bl.f2592aC.m3647a(this, new PointF(f, f2), abstractC0244am, i2 + 1);
        }
        if (c0405bf == null) {
            c0405bf2 = this.f2863x.f3174fP[c0411bl.m4155a(this)];
        } else {
            c0405bf2 = c0405bf;
        }
        PointF m3933K = m3933K(i);
        C1080ai m3941D = m3941D(i);
        if (c0411bl.f2598aI > 0) {
            for (int i3 = 0; i3 < c0411bl.f2598aI; i3++) {
                if (this.f2867B != null && this.f2867B.size() > 0) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) this.f2867B.remove(this.f2867B.size() - 1);
                    C0247ap c0247ap = this.f1649cJ[i];
                    C1117y.m464a(abstractC0244am2, this);
                    abstractC0244am2.f6958el = m3941D.f6849a;
                    abstractC0244am2.f6959em = m3941D.f6850b;
                    abstractC0244am2.f1618ce = c0247ap.f1712a;
                    if (abstractC0244am2 instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                        abstractC0623y.m2901az();
                        if (abstractC0244am != null) {
                            abstractC0623y.m2805n(abstractC0244am);
                        } else {
                            abstractC0623y.m2839e(f, f2);
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
            if (this.f2872G[i] != null && !this.f2872G[i].f6953eg) {
                c0188f = this.f2872G[i];
                c0188f.m5204a(this, m3941D.f6849a, m3941D.f6850b, this.f6960en + m3941D.f6851c);
                if (!c0405bf2.f1173N && c0188f.f1042ap != null) {
                    c0188f.f1042ap.clear();
                }
            }
        }
        this.f1588bB = (int) (this.f1588bB + 1 + this.f6951ee);
        float f3 = this.f1649cJ[i].f1712a;
        boolean z = false;
        if (c0188f == null) {
            c0188f = C0188f.m5203a(this, m3941D.f6849a, m3941D.f6850b, this.f6960en + m3941D.f6851c, i);
            if (c0405bf2.f1171L && c0405bf == null) {
                this.f2872G[i] = c0188f;
            }
        } else {
            c0188f.f981g = c0405bf2;
            z = true;
        }
        m3922a(c0188f, this, i, c0405bf2, m3941D.f6849a, m3941D.f6850b, this.f6960en + m3941D.f6851c, f3);
        c0405bf2.m4173a(this, c0188f, abstractC0244am, f, f2, mo3035m());
        if (!z && c0405bf2.f1119R == 0.0f && c0405bf2.f1120S == 0.0f) {
            c0188f.f1011K = m3933K.f227a;
            c0188f.f1012L = m3933K.f228b;
        }
        if (c0411bl.f2563G != null) {
            m1087A.f6116bR.m2385a(m3941D.f6849a, m3941D.f6850b, this.f6960en + m3941D.f6851c, c0411bl.f2563G.intValue());
        }
        if (c0411bl.f2561E != null) {
            c0411bl.f2561E.m3637a(m3941D.f6849a, m3941D.f6850b, this.f6960en + m3941D.f6851c, this.f1649cJ[i].f1712a, this);
        }
        if (c0411bl.f2560D != null) {
            c0411bl.f2560D.m4161a(m3941D.f6849a, m3941D.f6850b, 1.0f + C0758f.m2136c(-0.07f, 0.07f));
        }
        if (this.f2863x.f3099ee) {
            this.f3896Q = null;
        }
        if (c0411bl.f2588ay) {
            this.f1649cJ[i].f1721j = null;
        }
        if (this.f2863x.f2975bj && !this.f1607bT) {
            m3842bv();
        }
        if (this.f2863x.f2977bl && !this.f1607bT) {
            mo2689a();
            this.f1607bT = true;
        }
        return c0188f;
    }

    /* renamed from: m */
    public float mo3035m() {
        return this.f2864y.f2246i;
    }

    /* renamed from: y */
    public int mo3161y() {
        if (this.f2864y.f2252o != -1) {
            return this.f2864y.f2252o;
        }
        return super.mo3161y();
    }

    /* renamed from: u */
    public int mo3164u(AbstractC0244am abstractC0244am) {
        int mo4483a = abstractC0244am.mo1758r().mo4483a(this);
        if (this.f2863x.f3228aW != -1) {
            if (this.f2863x.f2965aX) {
                int i = (int) (this.f2863x.f3228aW + this.f1621ch);
                if (abstractC0244am != null) {
                    i = (int) (i + abstractC0244am.f1621ch);
                }
                return i + mo4483a;
            }
            return this.f2863x.f3228aW + mo4483a;
        }
        return mo3161y() + mo4483a;
    }

    /* renamed from: v */
    public int mo3163v(AbstractC0244am abstractC0244am) {
        int mo4483a = abstractC0244am.mo1758r().mo4483a(this);
        if (this.f2863x.f3229aY != -1) {
            if (this.f2863x.f2966aZ) {
                int i = (int) (this.f2863x.f3229aY + this.f1621ch);
                if (abstractC0244am != null) {
                    i = (int) (i + abstractC0244am.f1621ch);
                }
                return i + mo4483a;
            }
            return this.f2863x.f3229aY + mo4483a;
        }
        return mo3161y() + mo4483a;
    }

    /* renamed from: w */
    public boolean m3746w(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2966aZ;
    }

    /* renamed from: x */
    public boolean m3744x(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2965aX;
    }

    /* renamed from: cv */
    public float m3806cv() {
        return this.f2863x.f2971bf;
    }

    /* renamed from: c */
    public float m3839c(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2967ba;
    }

    /* renamed from: z */
    public float m3741z(AbstractC0244am abstractC0244am) {
        float f = this.f2863x.f2968bb;
        if (abstractC0244am.mo3352g() > 0.0f) {
            f = abstractC0244am.mo3352g() * this.f2863x.f3230bc;
        }
        return f;
    }

    /* renamed from: f */
    public float m3768f(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2969bd;
    }

    /* renamed from: b */
    public float m3872b(AbstractC0244am abstractC0244am) {
        return this.f2863x.f2970be;
    }

    /* renamed from: z */
    public float mo3033z() {
        return this.f2864y.f2247j * this.f2849j;
    }

    /* renamed from: aZ */
    public float m3887aZ() {
        return this.f2863x.f3102eh;
    }

    /* renamed from: ba */
    public float m3851ba() {
        return this.f2863x.f3103ei;
    }

    /* renamed from: A */
    public float mo3065A() {
        return this.f2864y.f2248k;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2574U != null) {
            return c0411bl.f2574U.floatValue();
        }
        return this.f2863x.f3094dZ;
    }

    /* renamed from: x */
    public float m3745x(int i) {
        return this.f2863x.f3269fO[i].f2612Q;
    }

    /* renamed from: w */
    public float mo3162w(int i) {
        return this.f2863x.f3269fO[i].f2615V;
    }

    /* renamed from: y */
    public float m3743y(int i) {
        return this.f2863x.f3269fO[i].f2616W;
    }

    /* renamed from: B */
    public float mo3064B() {
        return this.f2863x.f3105em;
    }

    /* renamed from: cC */
    public float m3837cC() {
        return this.f2863x.f3233bH * this.f2842c;
    }

    /* renamed from: p */
    public float m3755p(int i) {
        return this.f2863x.f3234bI;
    }

    /* renamed from: d */
    public float mo3317d(boolean z) {
        if (!this.f2863x.f3072dz) {
            return 0.0f;
        }
        if (z && this.f2863x.f3074dB) {
            return this.f1649cJ[this.f2863x.f3076dD.f2547e].f1712a + 90.0f;
        }
        if (this.f2863x.f3073dA) {
            return this.f1649cJ[this.f2863x.f3076dD.f2547e].f1712a + 90.0f;
        }
        return super.mo3317d(z);
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
    public PointF m3825cW() {
        PointF pointF = f2873H;
        C0453l c0453l = this.f2863x;
        if (c0453l.f3073dA && this.f1649cJ[c0453l.f3076dD.f2547e].f1716e != 0.0f && c0453l.f3076dD.f2604p != 0.0f) {
            pointF.m5878a(mo3176G(c0453l.f3076dD.f2547e));
            pointF.m5877b(-this.f6958el, -this.f6959em);
            return pointF;
        }
        pointF.f227a = 0.0f;
        pointF.f228b = 0.0f;
        return pointF;
    }

    /* renamed from: aP */
    public PointF m3893aP() {
        PointF m3825cW = m3825cW();
        f2874I.m5879a(m3825cW.f227a + this.f2863x.f3036cH, m3825cW.f228b + this.f2863x.f3037cI);
        return f2874I;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        C0934e m3929T;
        float f2;
        float f3;
        C0453l c0453l = this.f2863x;
        boolean z = this.f1607bT;
        if (this.f2885dR != null && !z) {
            C0393g.m4205a(this, f, false, false);
        }
        Core m1087A = Core.m1087A();
        InterfaceC1027y interfaceC1027y = m1087A.f6113bO;
        Paint m3894aN = m3894aN();
        float m3837cC = m3837cC();
        PointF m3825cW = m3825cW();
        m2937aQ();
        int i = c0453l.f3197i.f6894a;
        if (i > 0) {
            Object[] m534a = c0453l.f3197i.m534a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((AbstractC0387a) m534a[i2]).mo4210d(this, f);
            }
        }
        if (this.f4232et) {
            float f4 = (this.f6958el + m3825cW.f227a) - m1087A.f6144cv;
            float f5 = ((this.f6959em + m3825cW.f228b) - m1087A.f6145cw) - this.f6960en;
            if (m3837cC != 1.0f) {
                interfaceC1027y.mo135k();
                interfaceC1027y.mo226a(m3837cC, m3837cC, f4, f5);
            }
            interfaceC1027y.mo199a(this.f3885L, f4, f5, mo3317d(false) - 90.0f, m3894aN);
            if (m3837cC != 1.0f) {
                interfaceC1027y.mo134l();
            }
        } else {
            RectF m3836cE = m3836cE();
            float f6 = m3825cW.f227a;
            float f7 = m3825cW.f228b - this.f6960en;
            m3836cE.f234a += f6;
            m3836cE.f235b += f7;
            m3836cE.f236c += f6;
            m3836cE.f237d += f7;
            Rect mo3282a_ = mo3282a_(false);
            float f8 = (m3836cE.f234a + m3836cE.f236c) * 0.5f;
            float f9 = (m3836cE.f235b + m3836cE.f237d) * 0.5f;
            interfaceC1027y.mo135k();
            if (m3837cC != 1.0f) {
                interfaceC1027y.mo226a(m3837cC, m3837cC, f8, f9);
            }
            interfaceC1027y.mo227a(mo3317d(false), f8, f9);
            interfaceC1027y.mo192a(this.f3885L, mo3282a_, m3836cE, m3894aN);
            interfaceC1027y.mo134l();
        }
        if (i > 0) {
            Object[] m534a2 = c0453l.f3197i.m534a();
            for (int i3 = i - 1; i3 >= 0; i3--) {
                ((AbstractC0387a) m534a2[i3]).mo4209e(this, f);
            }
        }
        C1117y.m462a((AbstractC0623y) this);
        if (this.f2885dR != null && !z && c0453l.f3224ax) {
            C0393g.m4205a(this, f, true, false);
        }
        if (m3881ak() && c0453l.f3273fT != null && !z) {
            float mo3042e = this.f1649cJ[c0453l.f3273fT.f2547e].f1717f / mo3042e(c0453l.f3273fT.f2547e);
            if (mo3042e != 0.0f) {
                boolean z2 = true;
                boolean Y = m3002Y();
                if (Y && c0453l.f3010bW) {
                    z2 = false;
                } else if (!Y && c0453l.f3006bS) {
                    z2 = false;
                }
                if (z2 && c0453l.f3269fO[c0453l.f3273fT.f2547e].f2595aF == null) {
                    C1080ai bn = m2865bn();
                    m1087A.f6113bO.mo135k();
                    m1087A.f6113bO.mo168b(bn.f6849a - m1087A.f6144cv, ((bn.f6850b - bn.f6851c) - m1087A.f6145cw) - this.f6960en);
                    m1087A.f6113bO.mo228a(mo3042e, mo3042e);
                    if (Y) {
                        m1087A.f6113bO.mo198a(C0519b.f3586f, 0.0f, 0.0f, (Paint) null);
                    } else {
                        m1087A.f6113bO.mo198a(C0519b.f3585e, 0.0f, 0.0f, (Paint) null);
                    }
                    m1087A.f6113bO.mo134l();
                }
            }
        }
        if (c0453l.f3173fN && !z) {
            int mo3169bl = mo3169bl();
            for (int i4 = 0; i4 < mo3169bl; i4++) {
                float mo3042e2 = this.f1649cJ[i4].f1717f / mo3042e(i4);
                C0411bl c0411bl = c0453l.f3269fO[i4];
                if (c0411bl != null && mo3042e2 != 0.0f && c0411bl.f2595aF != null) {
                    C1117y.m460a(this, c0411bl.f2595aF, mo3042e2, i4);
                }
            }
        }
        if (!z && this.f1635cv > 0.0f && this.f1637cx == 0.0f && (m3929T = m3929T()) != null) {
            if (!c0453l.f3046cS) {
                f2 = 0.0f + 0.09f + ((this.f1635cv / this.f1638cy) * 0.4f) + ((C0758f.m2159b(this.f1636cw, 50.0f) / 50.0f) * 0.5f);
            } else {
                float m2159b = 0.0f + ((C0758f.m2159b(this.f1636cw, 50.0f) / 50.0f) * 0.5f);
                float f10 = this.f1636cw;
                if (f10 > 5.0f) {
                    f10 = 5.0f;
                }
                f2 = m2159b + ((f10 / 5.0f) * 0.2f);
            }
            if (f2 > 0.0f) {
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                if (this.f2875J == null) {
                    this.f2875J = C1117y.m480a();
                }
                Paint paint = this.f2875J;
                paint.m5933a((int) (f2 * 255.0f), 255, 255, 255);
                float f11 = this.f6958el - m1087A.f6144cv;
                float f12 = (this.f6959em - m1087A.f6145cw) - this.f6960en;
                if (!c0453l.f3222au) {
                    f3 = ((c0453l.f3054dd * 2) / 87.0f) * 1.25f;
                } else {
                    f3 = ((c0453l.f3054dd * 2) / m3929T.f6402p) * 1.25f;
                }
                m1087A.f6113bO.mo135k();
                m1087A.f6113bO.mo226a(f3, f3, f11, f12);
                m1087A.f6113bO.mo199a(m3929T, f11, f12, mo3317d(false) - 90.0f, paint);
                m1087A.f6113bO.mo134l();
            }
        }
        if (i > 0) {
            Object[] m534a3 = c0453l.f3197i.m534a();
            for (int i5 = i - 1; i5 >= 0; i5--) {
                ((AbstractC0387a) m534a3[i5]).mo4211c(this, f);
            }
            return true;
        }
        return true;
    }

    /* renamed from: T */
    public C0934e m3929T() {
        return this.f2863x.f3221at;
    }

    /* renamed from: C */
    public float mo3063C() {
        return this.f2863x.f3083dK;
    }

    /* renamed from: D */
    public float mo3062D() {
        return this.f2863x.f3084dL;
    }

    /* renamed from: bi */
    public boolean mo3320bi() {
        return this.f2863x.f3090dV;
    }

    /* renamed from: bj */
    public boolean mo3319bj() {
        return this.f2863x.f3091dW;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return this.f2863x.f3106en;
    }

    /* renamed from: ag */
    public boolean mo4430ag() {
        return this.f2863x.f3108ep.read(this);
    }

    /* renamed from: af */
    public boolean mo3160af() {
        return this.f2863x.f3107eo.read(this);
    }

    /* renamed from: ae */
    public boolean mo3155ae() {
        return this.f2863x.f3109eq.read(this);
    }

    /* renamed from: ah */
    public boolean m3883ah() {
        if (this.f2863x.f3110er == null) {
            return true;
        }
        return this.f2863x.f3110er.read(this);
    }

    /* renamed from: k */
    public boolean m3759k(AbstractC0244am abstractC0244am) {
        C0453l c0453l = this.f2863x;
        if (c0453l.f3111es) {
            if (c0453l.f3112et != null && !C0448g.m3960a(c0453l.f3112et, abstractC0244am.m4676dc())) {
                return false;
            }
            if (c0453l.f3113eu != null && C0448g.m3960a(c0453l.f3113eu, abstractC0244am.m4676dc())) {
                return false;
            }
            if (c0453l.f3114ev) {
                boolean z = false;
                for (int i = 0; i < c0453l.f3269fO.length; i++) {
                    C0411bl c0411bl = c0453l.f3269fO[i];
                    if ((c0411bl.f2572P == null || !C0448g.m3960a(c0411bl.f2572P, abstractC0244am.m4676dc())) && (c0411bl.f2571O == null || C0448g.m3960a(c0411bl.f2571O, abstractC0244am.m4676dc()))) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        if (abstractC0244am.mo3038i()) {
            return mo3160af();
        }
        if (abstractC0244am.mo3054Q()) {
            return mo3155ae();
        }
        if (!m3883ah() && !abstractC0244am.m4727cG()) {
            return false;
        }
        return mo4430ag();
    }

    /* renamed from: E */
    public boolean mo3061E() {
        return this.f2863x.f3115ew;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return this.f2863x.f3269fO[i].f2575X;
    }

    /* renamed from: z */
    public float m3742z(int i) {
        return this.f2863x.f3269fO[i].f2618ab;
    }

    /* renamed from: A */
    public float m3945A(int i) {
        return this.f2863x.f3269fO[i].f2620ah;
    }

    /* renamed from: B */
    public float m3944B(int i) {
        return this.f2863x.f3269fO[i].f2551j;
    }

    /* renamed from: C */
    public float mo3182C(int i) {
        float f;
        float f2;
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2609w != -1) {
            f = this.f1649cJ[c0411bl.f2609w].f1712a;
        } else {
            f = this.f1618ce;
        }
        if (this.f1620cg && mo3153bc() > 0.95d) {
            f2 = f + c0411bl.f2552k;
        } else {
            f2 = f + c0411bl.f2551j;
        }
        if (c0411bl.f2627ar != 0.0f) {
            return 999.0f;
        }
        return f2;
    }

    /* renamed from: bm */
    public boolean mo4428bm() {
        return this.f2863x.f3081dI;
    }

    /* renamed from: q */
    public float mo3150q(int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (!c0411bl.f2611B) {
            return 0.0f;
        }
        C0405bf c0405bf = this.f2863x.f3174fP[c0411bl.m4155a(this)];
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
    public float mo3050b(int i) {
        return this.f2863x.f3269fO[i].f2601m * this.f2864y.f2242e;
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        return this.f2863x.f3269fO[i].f2602n;
    }

    /* renamed from: f */
    public float mo3041f(int i) {
        return this.f2863x.f3269fO[i].f2603o;
    }

    /* renamed from: s */
    public boolean m3751s(int i) {
        return this.f2863x.f3269fO[i].f2607s;
    }

    /* renamed from: t */
    public float m3749t(int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2554t == 0.0f || c0411bl.f2602n == 0.0f) {
            return 0.0f;
        }
        return -(c0411bl.f2554t * (this.f1649cJ[i].f1717f / c0411bl.f2602n));
    }

    /* renamed from: r */
    public boolean m3754r(int i) {
        if (this.f2863x.f3269fO[i].f2611B) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m3870b(AbstractC0244am abstractC0244am, int i) {
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2562F != null) {
            PointF mo3156E = mo3156E(i);
            c0411bl.f2562F.m3637a(mo3156E.f227a, mo3156E.f228b, this.f6960en, this.f1649cJ[i].f1712a, this);
        }
    }

    /* renamed from: u */
    public boolean m3748u(int i) {
        if (!m3908a(this.f2863x.f3269fO[i])) {
            return false;
        }
        return super.m2792u(i);
    }

    /* renamed from: s */
    public int m3750s(AbstractC0244am abstractC0244am) {
        return this.f2863x.f3118ez;
    }

    /* renamed from: bO */
    public boolean mo4386bO() {
        return this.f2863x.f3120eB;
    }

    /* renamed from: bP */
    public boolean mo4385bP() {
        return this.f2863x.f3121eC;
    }

    /* renamed from: bN */
    public float mo3158bN() {
        return this.f2864y.f2239b;
    }

    /* renamed from: cF */
    public boolean m3835cF() {
        return this.f2863x.f2941ap;
    }

    /* renamed from: a_ */
    public Rect mo3282a_(boolean z) {
        float f;
        if (z && !this.f2863x.f2941ap) {
            return super.mo3282a_(z);
        }
        if (this.f1607bT) {
            return super.mo3282a_(z);
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
        return super.m4773a(z, i, i2);
    }

    /* renamed from: cE */
    public RectF m3836cE() {
        RectF cE = super.m4729cE();
        if (this.f2863x.f2939aj) {
            cE.m5862a(this.f2863x.f2936ag, this.f2863x.f2937ah - this.f2863x.f2938ai);
        }
        return cE;
    }

    /* renamed from: bl */
    public int mo3169bl() {
        if (this.f2863x == null) {
            return 1;
        }
        return this.f2863x.f3269fO.length;
    }

    /* renamed from: v */
    public int m3747v(int i) {
        return this.f2863x.f3269fO[i].f2610x;
    }

    /* renamed from: F */
    public C1080ai m3938F(int i) {
        return m3923a(i, false);
    }

    /* renamed from: G */
    public PointF mo3176G(int i) {
        C1080ai m3923a = m3923a(i, false);
        f2876dI.f227a = m3923a.f6849a;
        f2876dI.f228b = m3923a.f6850b;
        return f2876dI;
    }

    /* renamed from: a */
    public C1080ai m3923a(int i, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2609w == -1) {
            f = this.f6958el;
            f2 = this.f6959em;
            f3 = 0.0f;
            f4 = this.f1618ce;
        } else if (z) {
            throw new RuntimeException("Turret can not be attached to turret that is not attached to the body");
        } else {
            C1080ai m3923a = m3923a(c0411bl.f2609w, true);
            f = m3923a.f6849a;
            f2 = m3923a.f6850b;
            f3 = m3923a.f6851c;
            f4 = this.f1649cJ[c0411bl.f2609w].f1712a;
        }
        if (this.f1649cJ[i].f1716e > 0.0f && c0411bl.f2604p != 0.0f) {
            float f5 = 0.0f;
            float mo3050b = (mo3050b(i) + m3749t(i)) - this.f1649cJ[i].f1716e;
            if (mo3050b < c0411bl.f2605q) {
                f5 = (mo3050b / c0411bl.f2605q) * c0411bl.f2604p;
            } else if (mo3050b < c0411bl.f2605q + c0411bl.f2606r) {
                f5 = c0411bl.f2604p - (((mo3050b - c0411bl.f2605q) / c0411bl.f2606r) * c0411bl.f2604p);
            }
            if (f5 != 0.0f) {
                f += C0758f.m2092i(this.f1649cJ[i].f1712a) * f5;
                f2 += C0758f.m2097h(this.f1649cJ[i].f1712a) * f5;
            }
        }
        float f6 = c0411bl.f2548f;
        float f7 = c0411bl.f2549g;
        float f8 = c0411bl.f2550h;
        if (f6 != 0.0f || f7 != 0.0f) {
            float m2097h = C0758f.m2097h(f4);
            float m2092i = C0758f.m2092i(f4);
            f += (m2092i * f7) - (m2097h * f6);
            f2 += ((m2097h * f7) + (m2092i * f6)) * c0411bl.f2600i;
        }
        f2877dJ.f6849a = f;
        f2877dJ.f6850b = f2;
        f2877dJ.f6851c = f3 + f8;
        return f2877dJ;
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        if (this.f2865z != null) {
            return this.f2865z.mo4484a(m3927V());
        }
        return this.f2863x.mo4484a(m3927V());
    }

    /* renamed from: a */
    public AbstractC0224s m3921a(C0208c c0208c) {
        C0453l c0453l;
        if (this.f2865z != null) {
            c0453l = this.f2865z;
        } else {
            c0453l = this.f2863x;
        }
        return c0453l.m3732a(c0208c);
    }

    /* renamed from: V */
    public int m3927V() {
        return this.f2863x.f3020cj;
    }

    /* renamed from: e */
    public AbstractC0224s m3774e(InterfaceC0303as interfaceC0303as) {
        return this.f2878dK.m3447b(interfaceC0303as);
    }

    /* renamed from: a */
    public void m3917a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (abstractC0224s == C0526i.f3644i) {
            if (!z) {
                m3932L();
            } else {
                m3930M();
            }
        } else if (abstractC0224s == C0526i.f3645j) {
            if (!z) {
                m3930M();
            }
        } else {
            if (!z) {
                if (pointF != null && !m3919a(abstractC0224s, pointF.f227a, pointF.f228b)) {
                    return;
                }
                if (abstractC0224s instanceof C0342g) {
                    C0342g c0342g = (C0342g) abstractC0224s;
                    if (c0342g.f2149a.f2108au != null) {
                        Core m1087A = Core.m1087A();
                        if (this.f1609bV == m1087A.f6099bs && !m1087A.m1080H()) {
                            c0342g.f2149a.f2108au.m4163a();
                        }
                    }
                    if (c0342g.f2149a.f2104aq != null) {
                        c0342g.f2149a.f2104aq.m3637a(this.f6958el, this.f6959em, this.f6960en, this.f1618ce, this);
                    }
                }
            }
            if (z && (abstractC0224s instanceof C0342g) && !((C0342g) abstractC0224s).f2149a.f2126L) {
                return;
            }
            C0499j m3461a = this.f2878dK.m3461a(abstractC0224s, z, pointF, abstractC0244am);
            if (!z) {
                if (m3461a != null) {
                    m3910a(EnumC0347ae.f2177f, (AbstractC0244am) null, abstractC0224s.m4908P(), (VariableScope) null);
                }
            } else if (m3461a != null) {
                m3910a(EnumC0347ae.f2178g, (AbstractC0244am) null, abstractC0224s.m4908P(), (VariableScope) null);
            }
        }
    }

    /* renamed from: a */
    public void mo3173a(AbstractC0224s abstractC0224s, boolean z) {
        m3917a(abstractC0224s, z, (PointF) null, (AbstractC0244am) null);
    }

    /* renamed from: b */
    public void m3873b(AbstractC0224s abstractC0224s, boolean z) {
        this.f2878dK.m3462a(abstractC0224s, z);
    }

    /* renamed from: b */
    public void m3875b(AbstractC0224s abstractC0224s) {
        this.f2878dK.m3463a(abstractC0224s);
    }

    /* renamed from: a */
    public boolean m3919a(AbstractC0224s abstractC0224s, float f, float f2) {
        if (abstractC0224s instanceof C0342g) {
            Core m1087A = Core.m1087A();
            C0342g c0342g = (C0342g) abstractC0224s;
            if (c0342g.f2149a.f2093af != null && c0342g.f2149a.f2094ag == null) {
                if (c0342g.f2149a.f2093af.intValue() >= this.f2863x.f3269fO.length) {
                    m2957a("checkTargetedActionOrder: " + c0342g.f2149a.f2093af + " larger than max turret size");
                    return true;
                } else if (!m3907a(this.f2863x.f3269fO[c0342g.f2149a.f2093af.intValue()], c0342g.f2149a.f2093af.intValue(), f, f2, true)) {
                    return false;
                } else {
                    if (c0342g.f2149a.f2098ak != null && C1117y.m476a(f, f2, c0342g.f2149a.f2098ak)) {
                        if (this.f1609bV == m1087A.f6099bs) {
                            m1087A.f6117bS.m1850b("Invalid map location (Must be passable by " + c0342g.f2149a.f2098ak.name() + ")");
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
    public void m3920a(AbstractC0224s abstractC0224s) {
        AbstractC0224s m3921a;
        if ((abstractC0224s instanceof C0342g) && (m3921a = m3921a(abstractC0224s.m4910N())) != null) {
            C0342g c0342g = (C0342g) m3921a;
            Integer num = c0342g.f2149a.f2093af;
            if (num != null && c0342g.f2149a.f2094ag == null && num.intValue() < this.f2863x.f3269fO.length) {
                C0411bl c0411bl = this.f2863x.f3269fO[num.intValue()];
                if (c0411bl.f2619ag > 0.0f) {
                    C1117y.m452b((AbstractC0244am) this, c0411bl.f2619ag, true);
                }
                C1117y.m465a((AbstractC0244am) this, c0411bl.f2579ad, true, true);
            }
        }
        super.m2983a(abstractC0224s);
    }

    /* renamed from: a */
    public boolean m3918a(AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        PointF pointF2 = null;
        AbstractC0244am abstractC0244am2 = null;
        if (i > 0) {
            pointF2 = f2879dL;
            abstractC0244am2 = f2880dM;
        }
        f2879dL = pointF;
        f2880dM = abstractC0244am;
        boolean m3874b = m3874b(abstractC0224s, pointF, abstractC0244am, i);
        f2879dL = pointF2;
        f2880dM = abstractC0244am2;
        return m3874b;
    }

    /* renamed from: b */
    public boolean m3874b(AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        Core m1087A = Core.m1087A();
        if (i > 10) {
            return false;
        }
        abstractC0224s.m4902a(this, abstractC0244am);
        if (abstractC0224s instanceof C0342g) {
            C0342g c0342g = (C0342g) abstractC0224s;
            C0339d c0339d = c0342g.f2149a;
            if (c0339d.f2064s != null && !c0339d.f2064s.read(this)) {
                return true;
            }
            boolean z = false;
            if (c0339d.f2090ac != null) {
                this.f1639cz += c0342g.f2149a.f2090ac.floatValue();
                z = true;
            }
            if (c0339d.f2091ad != null) {
                c0339d.f2091ad.m4084h(this);
                z = true;
            }
            if (c0339d.f2092ae != null) {
                c0339d.f2092ae.m4122a((AbstractC0244am) this, this.f1609bV.m5117C(), true);
                z = true;
            }
            if (c0339d.f2117aE != null) {
                if (c0339d.f2117aE.read(this)) {
                    this.f1586bz = m1087A.f6102by;
                }
                z = true;
            }
            if (c0339d.f2093af != null) {
                PointF pointF2 = pointF;
                for (int i2 = 0; i2 < c0339d.f2097aj; i2++) {
                    if (c0339d.f2094ag != null) {
                        pointF2 = new PointF();
                        if (c0339d.f2095ah == null) {
                            pointF2.m5879a(this.f6958el, this.f6959em);
                        } else {
                            AbstractC0244am readUnit = c0339d.f2095ah.readUnit(this);
                            if (readUnit != null) {
                                pointF2.m5879a(readUnit.f6958el, readUnit.f6959em);
                            } else {
                                pointF2.m5879a(this.f6958el, this.f6959em);
                            }
                        }
                        float m2092i = C0758f.m2092i(this.f1618ce);
                        float m2097h = C0758f.m2097h(this.f1618ce);
                        float f = c0339d.f2094ag.f227a;
                        float f2 = c0339d.f2094ag.f228b;
                        pointF2.m5877b((m2092i * f2) - (m2097h * f), (m2097h * f2) + (m2092i * f));
                    }
                    if (pointF2 == null) {
                        C0831ad.m1493g("completeQueueItem:" + c0342g.m4910N() + " for fireTurretXAtGround needs points but it is missing");
                    } else {
                        m3915a((AbstractC0244am) null, pointF2.f227a, pointF2.f228b, c0342g.f2149a.f2093af.intValue(), c0342g.f2149a.f2096ai, i);
                    }
                }
                z = true;
            }
            if (c0339d.f2103ap != null) {
                c0339d.f2103ap.m3637a(this.f6958el, this.f6959em, this.f6960en, this.f1618ce, this);
                z = true;
            }
            if (c0339d.f2105ar != null) {
                c0339d.f2105ar.m4161a(this.f6958el, this.f6959em, 1.0f);
                z = true;
            }
            if (c0339d.f2106as != null && !m1087A.m1080H()) {
                c0339d.f2106as.m4163a();
                z = true;
            }
            if (c0339d.f2107at != null) {
                if (this.f1609bV == m1087A.f6099bs && !m1087A.m1080H()) {
                    c0339d.f2107at.m4163a();
                }
                z = true;
            }
            if (c0339d.f2133ab.f6894a > 0) {
                Object[] m534a = c0339d.f2133ab.m534a();
                for (int i3 = 0; i3 < c0339d.f2133ab.f6894a; i3++) {
                    if (((AbstractC0321a) m534a[i3]).mo4368a(this, abstractC0224s, pointF, abstractC0244am, i)) {
                        z = true;
                    }
                }
            }
            PointF pointF3 = pointF;
            AbstractC0244am abstractC0244am2 = abstractC0244am;
            if ((c0339d.f2101an != null || c0342g.f2149a.f2102ao != null) && c0339d.f2099al != null) {
                abstractC0244am2 = c0339d.f2099al.readUnit(this);
                pointF3 = new PointF();
                if (abstractC0244am2 != null) {
                    pointF3.f227a = abstractC0244am2.f6958el;
                    pointF3.f228b = abstractC0244am2.f6959em;
                } else {
                    pointF3.f227a = this.f6958el;
                    pointF3.f228b = this.f6959em;
                }
            }
            if (c0339d.f2101an != null) {
                if (c0339d.f2100am == null || c0339d.f2100am.read(this)) {
                    c0342g.f2149a.f2101an.m3647a(this, pointF3, abstractC0244am2, i + 1);
                }
                z = true;
            }
            if (c0342g.f2149a.f2102ao != null) {
                if (c0339d.f2100am == null || c0339d.f2100am.read(this)) {
                    c0342g.f2149a.f2102ao.m3648a(this, pointF3, abstractC0244am2);
                }
                z = true;
            }
            C0453l c0453l = null;
            if (c0339d.f2078G != null) {
                c0453l = c0339d.f2078G.mo3643c();
            }
            if (c0453l != null) {
                if (Core.f6193aw) {
                    Core.m998b(m4733cA() + ": converting unit: " + abstractC0224s.m4909O());
                }
                if (!(c0453l instanceof C0453l)) {
                    AbstractC0244am mo4485a = c0453l.mo4485a();
                    mo4485a.f6958el = this.f6958el;
                    mo4485a.f6959em = this.f6959em;
                    if (!mo4485a.m4758bI()) {
                        mo4485a.f1618ce = this.f1618ce;
                    }
                    mo4485a.m4656f(this.f1609bV);
                    mo4485a.m4801B(null);
                    float f3 = this.f1633ct;
                    float f4 = mo4485a.f1633ct;
                    if (f3 == 0.0f) {
                        mo4485a.m4650o(mo4485a.f1633ct);
                    } else {
                        mo4485a.m4650o((this.f1632cs / f3) * f4);
                    }
                    if (this.f1644cE) {
                        Core.m1087A().f6117bS.m1820k(mo4485a);
                    }
                    AbstractC0197n.m5053c(mo4485a);
                    m4700ch();
                } else {
                    C0449h c0449h = null;
                    if (c0339d.f2081P) {
                        c0449h = m3791dc();
                    }
                    AbstractC0197n.m5069b((AbstractC0244am) this);
                    this.f2865z = null;
                    m3901a(c0453l, false, false, c0339d.f2082Q);
                    if (c0449h != null) {
                        m3903a(c0449h, true);
                    }
                    m3008S();
                    this.f2878dK.m3442e();
                    this.f1587bA = Core.m1087A().f6102by;
                    AbstractC0197n.m5053c(this);
                }
                z = true;
                if (!c0342g.mo4866B().m4106b()) {
                    m3004W();
                }
            }
            if (!z && c0339d.f2059m) {
                Core.LogDebug2("completeQueueItem:" + c0342g.m4910N() + " had no effect (but should have)");
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo3436b(C0499j c0499j) {
        AbstractC0224s m3921a = m3921a(c0499j.f3496j);
        if (m3921a != null && (m3921a instanceof C0342g)) {
            C0339d c0339d = ((C0342g) m3921a).f2149a;
            if (c0339d.f2089aa != null) {
                f2893dZ.f227a = this.f6958el;
                f2893dZ.f228b = this.f6959em;
                c0339d.f2089aa.m3647a(this, f2893dZ, null, 0);
            }
        }
    }

    /* renamed from: c */
    public boolean mo3435c(C0499j c0499j) {
        return true;
    }

    /* renamed from: i */
    public void m3762i(boolean z) {
        this.f2878dK.m3450a(z);
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        float f;
        AbstractC0224s m3921a = m3921a(c0499j.f3496j);
        if (m3921a != null && m3918a(m3921a, c0499j.f3490h, c0499j.f3491i, 0)) {
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
        AbstractC0244am m3453a = this.f2878dK.m3453a(c0499j, f, this.f2857r, f2);
        if (m3453a != null) {
            m3937F(m3453a);
            AbstractC0197n.m5053c(m3453a);
            m4783a(EnumC0347ae.f2176e, m3453a);
        }
    }

    /* renamed from: E */
    public void m3939E(AbstractC0244am abstractC0244am) {
        float f = 0.0f;
        if (this.f2863x.f2949aG && this.f2863x.f3059di != null) {
            f = this.f1618ce + this.f2863x.f3059di.floatValue() + 90.0f;
        }
        abstractC0244am.f1618ce = 90.0f + f;
        float f2 = 70.0f;
        if (this.f2863x.f3062dl != null) {
            f2 = this.f2863x.f3062dl.floatValue();
        }
        this.f2878dK.m3458a(abstractC0244am, f2, this.f2857r);
    }

    /* renamed from: F */
    public void m3937F(AbstractC0244am abstractC0244am) {
        abstractC0244am.f6958el = this.f6958el + this.f2863x.f3057dg;
        abstractC0244am.f6959em = this.f6959em + this.f2863x.f3058dh;
        if (!this.f2863x.f2949aG) {
            float f = 180.0f;
            if (this.f2863x.f3059di != null) {
                f = this.f2863x.f3059di.floatValue();
            }
            float f2 = 70.0f;
            if (this.f2863x.f3062dl != null) {
                f2 = this.f2863x.f3062dl.floatValue();
            }
            boolean m3310a = C0526i.m3310a(this, abstractC0244am, this.f2857r, 7.0f, f, f2, this.f2863x.f3057dg, this.f2863x.f3058dh);
            if (!this.f2863x.f3061dk) {
                abstractC0244am.f6960en = this.f6960en;
            }
            abstractC0244am.f6960en += this.f2863x.f3060dj;
            if (abstractC0244am instanceof C0451j) {
                ((C0451j) abstractC0244am).m3797dD();
            }
            if ((mo3038i() || !m3310a || this.f2863x.f3132eS.read(this)) && m3810cq()) {
                m3942C(abstractC0244am);
            }
        }
        this.f2857r = !this.f2857r;
    }

    /* renamed from: by */
    public C0424b m3841by() {
        C1101m m3440g = this.f2878dK.m3440g();
        int size = m3440g.size();
        if (size == 0) {
            return C0424b.f2710a;
        }
        C0424b c0424b = new C0424b();
        Object[] m534a = m3440g.m534a();
        for (int i = 0; i < size; i++) {
            AbstractC0224s m3921a = m3921a(((C0499j) m534a[i]).f3496j);
            if (m3921a != null && (m3921a instanceof C0342g)) {
                C0342g c0342g = (C0342g) m3921a;
                if (c0342g.f2149a.f2090ac != null) {
                    c0424b.f2700c += c0342g.f2149a.f2090ac.floatValue();
                }
                if (c0342g.f2149a.f2091ad != null) {
                    C0424b c0424b2 = c0342g.f2149a.f2091ad;
                    if (!c0424b2.m4106b()) {
                        c0424b = C0424b.m4116a(c0424b, c0424b2);
                    }
                }
                if (c0342g.f2149a.f2092ae != null) {
                    C0424b c0424b3 = c0342g.f2149a.f2092ae;
                    if (!c0424b3.m4106b()) {
                        c0424b = C0424b.m4116a(c0424b, c0424b3);
                    }
                }
            }
        }
        return c0424b;
    }

    /* renamed from: dx */
    public boolean mo3430dx() {
        return this.f2863x.f3263eK > 0 && m3794dG() > this.f2863x.f3263eK;
    }

    /* renamed from: h */
    public int mo3428h(InterfaceC0303as interfaceC0303as) {
        return this.f2878dK.m3457a(interfaceC0303as);
    }

    /* renamed from: f */
    public int mo3429f(boolean z) {
        return this.f2878dK.m3464a(AbstractC0224s.f1462i, z, true);
    }

    /* renamed from: a */
    public int mo3438a(C0208c c0208c, boolean z) {
        return this.f2878dK.m3465a(c0208c, z);
    }

    /* renamed from: dt */
    public C0499j mo3434dt() {
        return this.f2878dK.m3449b();
    }

    /* renamed from: bD */
    public C0424b m3862bD() {
        return this.f2878dK.m3445c();
    }

    /* renamed from: du */
    public C1101m mo3433du() {
        return this.f2878dK.f3501c;
    }

    /* renamed from: dw */
    public void mo3431dw() {
        this.f2878dK.f3503e = 1.0f;
    }

    /* renamed from: dv */
    public boolean mo3432dv() {
        return this.f2878dK.m3467a();
    }

    /* renamed from: a */
    public int m3905a(C0448g c0448g) {
        return this.f2878dK.m3455a(c0448g);
    }

    /* renamed from: a */
    public void mo3439a(PointF pointF) {
        if (this.f2863x.f3051da) {
            this.f2878dK.f3500b = pointF;
        }
    }

    /* renamed from: a_ */
    public float m3886a_() {
        if (!this.f2863x.f2905s) {
            return -1.0f;
        }
        return super.m4772a_();
    }

    /* renamed from: bT */
    public boolean m3857bT() {
        return this.f2863x.f2906t;
    }

    /* renamed from: bU */
    public float m3856bU() {
        if (m4751bS() && !this.f2878dK.m3467a() && this.f2863x.f2911y) {
            return this.f2878dK.f3503e;
        }
        return super.m4749bU();
    }

    /* renamed from: bV */
    public float mo3289bV() {
        if (this.f2864y.f2241d > 0.0f && this.f1639cz < this.f2864y.f2241d && this.f2863x.f2907u) {
            return this.f1639cz / this.f2864y.f2241d;
        }
        if (this.f1638cy > 0.0f && this.f1635cv < this.f1638cy && this.f2863x.f2910x) {
            return this.f1635cv / this.f1638cy;
        }
        if (this.f2864y.f2241d == 0.0f && this.f1638cy == 0.0f) {
            if (this.f2863x.f3258ek != -1 && this.f1649cJ[this.f2863x.f3258ek].f1716e > 0.0f) {
                return 1.0f - (this.f1649cJ[this.f2863x.f3258ek].f1716e / mo3050b(this.f2863x.f3258ek));
            }
            if (this.f2863x.f3259el != -1 && this.f1649cJ[this.f2863x.f3259el].f1717f != 0.0f) {
                return this.f1649cJ[this.f2863x.f3259el].f1717f / mo3042e(this.f2863x.f3259el);
            }
        }
        return super.mo3289bV();
    }

    /* renamed from: f */
    public boolean m3771f(float f) {
        return super.m4658f(f);
    }

    /* renamed from: p */
    public void m3756p(float f) {
        int i = this.f2863x.f3197i.f6894a;
        if (i > 0) {
            Object[] m534a = this.f2863x.f3197i.m534a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((AbstractC0387a) m534a[i2]).mo4208f(this, f);
            }
        }
        super.m4649p(f);
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
    }

    /* renamed from: bZ */
    public void m3853bZ() {
        if (this.f2878dK.f3500b != null) {
            Core m1087A = Core.m1087A();
            m1087A.f6113bO.mo225a((int) (this.f6958el - m1087A.f6144cv), (int) (this.f6959em - m1087A.f6145cw), (int) (this.f2878dK.f3500b.f227a - m1087A.f6144cv), (int) (this.f2878dK.f3500b.f228b - m1087A.f6145cw), AbstractC0498i.f3481y);
        }
    }

    /* renamed from: ca */
    public void m3821ca() {
        boolean z = false;
        if ((this.f2864y.f2246i > 70.0f && this.f2863x.f3106en && this.f2863x.f3080dH == null) || (this.f2863x.f3080dH != null && this.f2863x.f3080dH.booleanValue())) {
            C1117y.m467a((AbstractC0244am) this, mo3035m(), true);
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
            int mo3169bl = mo3169bl();
            for (int i = 0; i < mo3169bl; i++) {
                C0411bl c0411bl = this.f2863x.f3269fO[i];
                if (c0411bl.f2583ak != null && c0411bl.f2622al > 0.0f) {
                    int i2 = 90;
                    if (z) {
                        i2 = 40;
                    }
                    C1117y.m468a((AbstractC0244am) this, c0411bl.f2622al, Color.m5948a(i2, 35, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 35), 1, true);
                }
            }
        }
    }

    /* renamed from: d */
    public void m3802d(float f) {
        super.m2844d(f);
        if (this.f1607bT) {
            return;
        }
        this.f1698dG.m4135a(f, this);
        if (this.f2863x.f3215ak != null) {
            Core m1087A = Core.m1087A();
            float f2 = this.f6958el - m1087A.f6144cv;
            float f3 = (this.f6959em - m1087A.f6145cw) - this.f6960en;
            float m3837cC = m3837cC();
            if (m3837cC != 1.0f) {
                m1087A.f6113bO.mo135k();
                m1087A.f6113bO.mo226a(m3837cC, m3837cC, f2, f3);
            }
            if (this.f2863x.f2940al) {
                int i = this.f2863x.f3215ak.f6402p;
                int i2 = this.f2863x.f3215ak.f6403q;
                int i3 = i / 2;
                int i4 = i2 / 2;
                f1684ds.m5861a(f2 - i3, f3 - i4, f2 + i3, f3 + i4);
                f1685dt.m5874a(0, 0, 0 + i, 0 + i2);
            } else {
                f1684ds.m5861a(f2 - this.f4230er, f3 - this.f4231es, f2 + this.f4230er, f3 + this.f4231es);
                f1685dt.m5874a(0, 0, 0 + this.f4228ep, 0 + this.f4229eq);
            }
            m1087A.f6113bO.mo192a(this.f2863x.f3215ak, f1685dt, f1684ds, m3894aN());
            if (m3837cC != 1.0f) {
                m1087A.f6113bO.mo134l();
            }
        }
        if (this.f2863x.f3225ay && this.f2885dR != null && !this.f1607bT) {
            C0393g.m4205a(this, f, false, true);
        }
    }

    /* renamed from: aM */
    public float m3895aM() {
        return this.f2863x.f3077dE;
    }

    /* renamed from: aN */
    public Paint m3894aN() {
        return super.m2940aN();
    }

    /* renamed from: aV */
    public boolean m3888aV() {
        return this.f2863x.f3122eD;
    }

    /* renamed from: bI */
    public boolean m3861bI() {
        return this.f2863x.f2949aG;
    }

    /* renamed from: q */
    public boolean mo3347q() {
        if (this.f1652cM != null && this.f1652cM.f1624ck < 1.0f) {
            return true;
        }
        return this.f2863x.f2952aJ;
    }

    /* renamed from: H */
    private boolean m3935H(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3347q() || abstractC0244am == this) {
            return false;
        }
        if (abstractC0244am.m4758bI()) {
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
    public boolean mo3172a(AbstractC0244am abstractC0244am) {
        if (this.f2863x.f3148fm != null && !C0448g.m3960a(this.f2863x.f3148fm, abstractC0244am.m4676dc())) {
            return false;
        }
        return m3935H(abstractC0244am);
    }

    /* renamed from: l */
    public boolean m3758l(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3352g() != 0.0f && m3765h(abstractC0244am, true)) {
            return true;
        }
        if (this.f2863x.f3147fl != null && !C0448g.m3960a(this.f2863x.f3147fl, abstractC0244am.m4676dc())) {
            return false;
        }
        return m3935H(abstractC0244am);
    }

    /* renamed from: m */
    public void m3757m(AbstractC0244am abstractC0244am) {
        C0637ab c0637ab;
        if (this.f2863x.f2974bi) {
            C0305au ar = m2909ar();
            if (ar != null && (c0637ab = ar.f1805i) != null) {
                c0637ab.m2755a(ar);
            }
            if (this.f1644cE && abstractC0244am != null) {
                Core.m1087A().f6117bS.m1820k(abstractC0244am);
            }
            m4700ch();
        }
    }

    /* renamed from: al */
    public boolean m3880al() {
        if (this.f2863x.f2974bi) {
            return true;
        }
        return false;
    }

    /* renamed from: aj */
    public boolean m3882aj() {
        return this.f2863x.f3150fo;
    }

    /* renamed from: cs */
    public boolean m3808cs() {
        return this.f2863x.f3171fL;
    }

    /* renamed from: ak */
    public boolean m3881ak() {
        return this.f2863x.f3149fn;
    }

    /* renamed from: g */
    public boolean mo3166g(AbstractC0244am abstractC0244am, boolean z) {
        if (!m3765h(abstractC0244am, z)) {
            return false;
        }
        if (z && abstractC0244am.m4735c((AbstractC0623y) this)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public boolean m3765h(AbstractC0244am abstractC0244am, boolean z) {
        if (!this.f2863x.f3144fi) {
            return false;
        }
        if (this.f2863x.f3145fj != null && !C0448g.m3960a(this.f2863x.f3145fj, abstractC0244am.m4676dc())) {
            return false;
        }
        return true;
    }

    /* renamed from: cR */
    public int m3829cR() {
        return this.f2863x.f3146fk;
    }

    /* renamed from: bJ */
    public boolean m3860bJ() {
        return this.f2863x.f3154fs;
    }

    /* renamed from: a */
    public void mo3053a(float f, boolean z) {
        super.mo3053a(f, z);
        if (!this.f1607bT && m3881ak()) {
            if (m3002Y()) {
                if (!this.f2863x.f3010bW) {
                    C0519b.m3341b(f, this);
                }
            } else if (!this.f2863x.f3006bS) {
                C0519b.m3341b(f, this);
            }
        }
    }

    /* renamed from: o */
    public boolean mo3350o() {
        return this.f2863x.f3026cw;
    }

    /* renamed from: p */
    public boolean mo3349p() {
        return this.f2863x.f3027cx;
    }

    /* renamed from: cN */
    public boolean m3833cN() {
        return this.f2863x.f3028cy;
    }

    /* renamed from: f */
    public void m3769f(AbstractC0197n abstractC0197n) {
        if (this.f2863x.f3032cC) {
            m2894b(AbstractC0197n.f1370h);
        } else if (this.f2863x.f3031cB && this.f2867B.size() == 0) {
            m2894b(AbstractC0197n.f1371i);
        } else {
            super.m4656f(abstractC0197n);
        }
    }

    /* renamed from: B */
    public void m3943B(AbstractC0244am abstractC0244am) {
        super.m4801B(abstractC0244am);
    }

    /* renamed from: g */
    public float mo3352g() {
        return this.f2863x.f3033cD;
    }

    /* renamed from: cP */
    public int m3831cP() {
        return this.f2863x.f3034cE;
    }

    /* renamed from: cQ */
    public C0449h m3830cQ() {
        return this.f2863x.f3035cF;
    }

    /* renamed from: cO */
    public void m3832cO() {
        if (this.f2863x.f2973bh == 0.0f && mo3352g() > 0.0f) {
            AbstractC0197n.m5069b((AbstractC0244am) this);
            this.f1624ck = 1.0f;
            AbstractC0197n.m5053c(this);
        }
    }

    /* renamed from: co */
    public C0208c m3811co() {
        if (this.f2863x.f3263eK != 0) {
            return C0526i.f3644i.m4910N();
        }
        return super.m4693co();
    }

    /* renamed from: L */
    public float m3931L(int i) {
        return this.f2863x.f3269fO[i].f2581af;
    }

    /* renamed from: K */
    public PointF m3933K(int i) {
        C0188f c0188f;
        PointF K = super.m3013K(i);
        if (this.f2863x.f3117ey) {
            if (this.f2863x.f3174fP[this.f2863x.f3269fO[i].m4155a(this)].f1172M && this.f2872G != null && (c0188f = this.f2872G[i]) != null && !c0188f.f6953eg) {
                K.f227a += c0188f.f1011K;
                K.f228b += c0188f.f1012L;
            }
        }
        return K;
    }

    /* renamed from: bd */
    public float m3850bd() {
        return this.f2864y.f2241d;
    }

    /* renamed from: be */
    public EnumC0307b m3849be() {
        return this.f2863x.f3095ea;
    }

    /* renamed from: bf */
    public boolean m3848bf() {
        if (this.f2863x.f3098ed) {
            return false;
        }
        if (this.f2863x.f3095ea == EnumC0307b.f1832d) {
            C0305au ar = m2909ar();
            if ((ar != null && (ar.m4444d() == EnumC0306av.f1818h || ar.m4444d() == EnumC0306av.f1820j)) || this.f3894O == EnumC0205a.f1418a) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: bW */
    public boolean mo3288bW() {
        return this.f2861v;
    }

    /* renamed from: bg */
    public boolean m3847bg() {
        return this.f2863x.f3101eg;
    }

    /* renamed from: bc */
    public float mo3153bc() {
        return this.f2863x.f3104ej;
    }

    /* renamed from: f */
    public void m3770f(float f, float f2) {
        super.m4657f(f, f2);
        m4784a(EnumC0347ae.f2179h);
        float f3 = this.f1618ce;
        if (this.f2863x.f3075dC) {
            f3 = this.f1649cJ[this.f2863x.f3076dD.f2547e].f1712a;
        }
        this.f2881dN = this.f6958el;
        this.f2882dO = this.f6959em;
        this.f2883dP = this.f6960en;
        this.f2884dQ = f3;
    }

    /* renamed from: ds */
    public void m3780ds() {
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
                c0394h.f2432s = this.f2863x.f3223aw[i].f2301r;
            }
            float f = this.f1618ce;
            if (this.f2863x.f3075dC) {
                f = this.f1649cJ[this.f2863x.f3076dD.f2547e].f1712a;
            }
            this.f2881dN = this.f6958el;
            this.f2882dO = this.f6959em;
            this.f2883dP = this.f6960en;
            this.f2884dQ = f;
            m3779dy();
            for (int i2 = 0; i2 < this.f2863x.f3223aw.length; i2++) {
                this.f2885dR[i2].f2429m = true;
            }
        }
    }

    /* renamed from: dy */
    public void m3779dy() {
        C0393g.f2410a.mo4198b(this, 0.0f);
    }

    /* renamed from: dz */
    public void m3778dz() {
        if (this.f2885dR != null) {
            for (int i = 0; i < this.f2885dR.length; i++) {
                this.f2885dR[i].f2430n = true;
                this.f2885dR[i].f2429m = true;
            }
            m3779dy();
        }
    }

    /* renamed from: aT */
    public int m3890aT() {
        if (this.f2863x.f3273fT == null) {
            return -1;
        }
        return this.f2863x.f3273fT.f2547e;
    }

    /* renamed from: s */
    public int m3753s() {
        return this.f2864y.f2251n;
    }

    /* renamed from: c */
    public void m3838c(boolean z) {
        C0453l c0453l = this.f2863x;
        Core m1087A = Core.m1087A();
        if (this.f1651cL != null || this.f1652cM != null) {
            return;
        }
        int i = this.f2864y.f2251n;
        if (this.f1624ck < 1.0f && c0453l.f3056df != -1) {
            i = c0453l.f3056df;
        }
        if (i > 0) {
            m1087A.f6110bL.m5343a(this.f6958el, this.f6959em, i, this.f1609bV, z);
        }
    }

    /* renamed from: cb */
    public Rect m3820cb() {
        return this.f2863x.f3247cV;
    }

    /* renamed from: cd */
    public Rect m3818cd() {
        return this.f2863x.f3249cX;
    }

    /* renamed from: cc */
    public Rect m3819cc() {
        return this.f2863x.f3248cW;
    }

    /* renamed from: b */
    public boolean m3876b(int i, float f) {
        float mo3182C;
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        if (c0411bl.f2628as != 0.0f) {
            boolean z = true;
            if (c0411bl.f2586av != null && !c0411bl.f2586av.read(this)) {
                z = false;
            }
            if (z) {
                C0247ap c0247ap = this.f1649cJ[i];
                if (c0411bl.f2627ar != 0.0f) {
                    mo3182C = c0247ap.f1712a;
                } else if (!c0411bl.f2626aq) {
                    mo3182C = c0247ap.f1713b;
                } else {
                    mo3182C = mo3182C(i);
                }
                c0247ap.f1722k += f;
                float f2 = f * c0411bl.f2585au;
                if (c0247ap.f1723l > 0.0f) {
                    if (c0247ap.f1723l < Float.POSITIVE_INFINITY && m2999a(f2, mo3182C + c0247ap.f1723l, i) == 0.0f) {
                        c0247ap.f1723l = Float.POSITIVE_INFINITY;
                    }
                } else if (c0247ap.f1723l > Float.NEGATIVE_INFINITY && m2999a(f2, mo3182C + c0247ap.f1723l, i) == 0.0f) {
                    c0247ap.f1723l = Float.NEGATIVE_INFINITY;
                }
                if (c0247ap.f1722k > c0411bl.f2629at) {
                    c0247ap.f1722k = -C0758f.m2189a(this, 0, (int) c0411bl.f2630aw);
                    float f3 = c0411bl.f2628as;
                    if (c0411bl.f2587ax > 0.0f) {
                        f3 += C0758f.m2149b(this, 0.0f, c0411bl.f2587ax, i);
                    }
                    c0247ap.f1723l = c0247ap.f1723l > 0.0f ? -f3 : f3;
                    return false;
                }
                return false;
            }
        }
        if (c0411bl.f2627ar != 0.0f) {
            this.f1649cJ[i].f1712a += c0411bl.f2627ar * f;
            if (this.f1649cJ[i].f1712a > 180.0f) {
                this.f1649cJ[i].f1712a -= 360.0f;
            }
            if (this.f1649cJ[i].f1712a < -180.0f) {
                this.f1649cJ[i].f1712a += 360.0f;
                return false;
            }
            return false;
        }
        return c0411bl.f2626aq;
    }

    /* renamed from: cu */
    public int mo3328cu() {
        return this.f2863x.f3265eX;
    }

    /* renamed from: dA */
    public ArrayList m3800dA() {
        f2886dS.clear();
        ArrayList mo3174N = mo3174N();
        if (mo3174N.size() != 0) {
            Iterator it = mo3174N.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                if (abstractC0224s instanceof C0342g) {
                    C0342g c0342g = (C0342g) abstractC0224s;
                    if (c0342g.f2151c == EnumC0340e.f2139c) {
                        f2886dS.add(c0342g);
                    }
                }
            }
        }
        return f2886dS;
    }

    /* renamed from: cl */
    public C0208c m3813cl() {
        ArrayList m3800dA = m3800dA();
        if (m3800dA.size() > 0) {
            return ((AbstractC0224s) m3800dA.get(0)).m4910N();
        }
        return null;
    }

    /* renamed from: a */
    public void m3897a(ArrayList arrayList) {
        arrayList.clear();
        ArrayList m3800dA = m3800dA();
        if (m3800dA.size() < 2) {
            return;
        }
        m3800dA.remove(0);
        Iterator it = m3800dA.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0224s) it.next()).m4910N());
        }
    }

    /* renamed from: cX */
    public float m3824cX() {
        return this.f2863x.f3049cY;
    }

    /* renamed from: cY */
    public float m3823cY() {
        return this.f2863x.f3050cZ;
    }

    /* renamed from: bv */
    public void m3842bv() {
        AbstractC0197n.m5089a((AbstractC0244am) this);
        this.f2878dK.m3450a(true);
        super.m2857bv();
    }

    /* renamed from: da */
    public void m3792da() {
        this.f6960en = 170.0f;
        this.f2845f = 1.5f;
        m3778dz();
        super.m4677da();
    }

    /* renamed from: db */
    public boolean mo3327db() {
        return this.f2863x.f3021ck;
    }

    /* renamed from: bp */
    public int m3845bp() {
        return this.f2863x.f2982bq;
    }

    /* renamed from: a */
    public void m3924a(int i, float f) {
        this.f1649cJ[i].f1712a += f;
        if (this.f2863x.f3272fS) {
            for (int i2 = 0; i2 < this.f2863x.f3269fO.length; i2++) {
                if (this.f2863x.f3269fO[i2].f2609w == i) {
                    this.f1649cJ[i2].f1712a += f;
                    this.f1649cJ[i2].m4637a(2);
                }
            }
        }
    }

    /* renamed from: cZ */
    public float m3822cZ() {
        return super.m4708cZ() + this.f2863x.f3055de;
    }

    /* renamed from: H */
    public float mo3181H(int i) {
        return this.f2863x.f3269fO[i].f2604p;
    }

    /* renamed from: I */
    public float mo3180I(int i) {
        return this.f2863x.f3269fO[i].f2605q;
    }

    /* renamed from: J */
    public float mo3179J(int i) {
        return this.f2863x.f3269fO[i].f2606r;
    }

    /* renamed from: a */
    public float mo3052a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        C0399m dl = m4668dl();
        if (dl != null && this.f1652cM != null && dl.f2453j) {
            int i = 0;
            if (c0188f != null) {
                i = c0188f.f1055aD;
            }
            if (i >= 0) {
                C0188f m5207a = C0188f.m5207a(c0188f);
                if (dl.f2454k) {
                    m5207a.f1039am = 0.0f;
                }
                f = this.f1652cM.mo3052a(abstractC0244am, f, m5207a);
                if (f < 0.0f) {
                    f = 0.0f;
                }
            }
        }
        if (mo3056J()) {
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
            m3910a(EnumC0347ae.f2185n, abstractC0244am, c0188f.f1056aE, (VariableScope) null);
        } else {
            m4783a(EnumC0347ae.f2185n, abstractC0244am);
        }
        return super.mo3052a(abstractC0244am, f, c0188f);
    }

    /* renamed from: aU */
    public float m3889aU() {
        return this.f2863x.f3079dG;
    }

    /* renamed from: ac */
    public boolean m3885ac() {
        if (!this.f2863x.f3100ef) {
            return false;
        }
        return super.m2924ac();
    }

    /* renamed from: a */
    public boolean m3916a(EnumC0238ag enumC0238ag) {
        if (enumC0238ag == EnumC0238ag.f1530a) {
            return this.f2863x.f3063dm.m4163a();
        }
        if (enumC0238ag == EnumC0238ag.f1531b) {
            return this.f2863x.f3064dn.m4163a();
        }
        if (enumC0238ag == EnumC0238ag.f1532c) {
            return this.f2863x.f3065do.m4163a();
        }
        return false;
    }

    /* renamed from: b */
    public void m3868b(EnumC0347ae enumC0347ae) {
        C0453l c0453l = this.f2863x;
        if (c0453l.f3282gn.f6894a == 0) {
            return;
        }
        Object[] m534a = c0453l.f3282gn.m534a();
        for (int i = c0453l.f3282gn.f6894a - 1; i >= 0; i--) {
            C0346ad c0346ad = (C0346ad) m534a[i];
            if (c0346ad.f2168a == enumC0347ae) {
                f2893dZ.f227a = this.f6958el;
                f2893dZ.f228b = this.f6959em;
                m3918a(c0346ad.f2169b, f2893dZ, (AbstractC0244am) null, 0);
            }
        }
    }

    /* renamed from: a */
    public void m3910a(EnumC0347ae enumC0347ae, AbstractC0244am abstractC0244am, C0449h c0449h, VariableScope variableScope) {
        C0452k c0452k;
        C0453l c0453l = this.f2863x;
        if (c0453l.f3282gn.f6894a == 0) {
            return;
        }
        Object[] m534a = c0453l.f3282gn.m534a();
        for (int i = c0453l.f3282gn.f6894a - 1; i >= 0; i--) {
            C0346ad c0346ad = (C0346ad) m534a[i];
            if (c0346ad.f2168a == enumC0347ae && (c0346ad.f2171d == null || C0448g.m3961a(c0346ad.f2171d, c0449h))) {
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
    public static void m3752s(float f) {
    }

    /* renamed from: dB */
    public static void m3799dB() {
        if (f2887dT.f6894a == 0) {
            return;
        }
        f2887dT = new C1101m();
    }

    /* renamed from: a */
    public static void m3926a(float f, int i) {
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
                f2893dZ.f227a = c0451j.f6958el;
                f2893dZ.f228b = c0451j.f6959em;
                PointF pointF = f2893dZ;
                LogicBoolean.setContextEventSource(c0452k);
                c0451j.m3918a(c0346ad.f2169b, pointF, (AbstractC0244am) null, 0);
                LogicBoolean.clearContext();
            }
        }
        if (i < 1 && i2 != f2887dT.f6894a) {
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                C0452k c0452k2 = (C0452k) f2887dT.remove(i4);
                c0452k2.m3740a();
                f2888dU.add(c0452k2);
            }
            m3926a(f, i + 1);
        }
        Object[] m534a2 = f2887dT.m534a();
        for (int i5 = f2887dT.f6894a - 1; i5 >= 0; i5--) {
            C0452k c0452k3 = (C0452k) m534a2[i5];
            c0452k3.m3740a();
            f2888dU.add(c0452k3);
        }
        f2887dT.clear();
    }

    /* renamed from: dC */
    public static void m3798dC() {
    }

    /* renamed from: b */
    public void m3877b(float f, boolean z) {
        C0453l c0453l = this.f2863x;
        if (!c0453l.f3175fV) {
            return;
        }
        if (this.f2862w != 0.0f) {
            this.f2862w = C0758f.m2211a(this.f2862w, f);
            if (this.f2862w == 0.0f) {
                z = true;
            } else {
                return;
            }
        }
        C0460r[] c0460rArr = c0453l.f3176fW;
        if (c0460rArr != null) {
            m3925a(f, c0460rArr);
            if (c0453l != this.f2863x) {
                return;
            }
        }
        C0460r[] c0460rArr2 = c0453l.f3177fX;
        if (c0460rArr2 != null && (((int) (Core.m1087A().f6239bx + this.f6951ee)) % 4 == 0 || z)) {
            m3925a(f, c0460rArr2);
            if (c0453l != this.f2863x) {
                return;
            }
        }
        C0460r[] c0460rArr3 = c0453l.f3178fY;
        if (c0460rArr3 != null) {
            if (((int) (Core.m1087A().f6239bx + this.f6951ee)) % 8 == 0 || z) {
                m3925a(f, c0460rArr3);
                if (c0453l != this.f2863x) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m3925a(float f, C0460r[] c0460rArr) {
        C0453l c0453l = this.f2863x;
        Core m1087A = Core.m1087A();
        for (C0460r c0460r : c0460rArr) {
            if (c0460r.f3336a.read(this)) {
                if (m1087A.f6231bl && m1087A.f6233bn && this.f1644cE) {
                    if (c0460r.f3339d != null) {
                        String str = VariableScope.nullOrMissingString + c0460r.f3339d.m4909O();
                    }
                    String str2 = "autoTrigger fired on: " + m4683cz() + " details: " + c0460r.f3336a.getDebugDetails(this);
                    Core.LogDebug2(str2);
                    m1087A.f6117bS.f5116f.m1945a(str2, 2000);
                }
                f2893dZ.f227a = this.f6958el;
                f2893dZ.f228b = this.f6959em;
                m3918a(c0460r.f3339d, f2893dZ, (AbstractC0244am) null, 0);
                this.f2862w = this.f2863x.f3235ca;
                if (c0453l != this.f2863x) {
                    return;
                }
            }
        }
    }

    /* renamed from: dc */
    public C0449h m3791dc() {
        return this.f2894ea;
    }

    /* renamed from: a */
    public void m3903a(C0449h c0449h, boolean z) {
        if (z) {
            this.f2894ea = c0449h;
            return;
        }
        AbstractC0197n.m5069b((AbstractC0244am) this);
        this.f2894ea = c0449h;
        AbstractC0197n.m5053c(this);
    }

    /* renamed from: j */
    public void m3760j(boolean z) {
        m3903a(this.f2863x.f2923N, z);
    }

    /* renamed from: a */
    public void m3904a(C0449h c0449h) {
        C0449h m3791dc = m3791dc();
        if (m3791dc == null || m3791dc.m3950b() == 0) {
            m3903a(c0449h, false);
        } else if (C0448g.m3955b(m3791dc, c0449h)) {
        } else {
            C0450i c0450i = new C0450i(m3791dc);
            if (c0450i.m3947a(c0449h)) {
                m3903a(c0450i.m3949a(), false);
            }
        }
    }

    /* renamed from: b */
    public void m3866b(C0449h c0449h) {
        C0449h m3791dc = m3791dc();
        if (m3791dc == null || m3791dc.m3950b() == 0 || !C0448g.m3960a(c0449h, m3791dc)) {
            return;
        }
        C0450i c0450i = new C0450i(m3791dc);
        if (c0450i.m3946b(c0449h)) {
            m3903a(c0450i.m3949a(), false);
        }
    }

    /* renamed from: dD */
    public final void m3797dD() {
        if (this.f2863x.f3140fe == EnumC0246ao.f1706d) {
            if (mo3038i()) {
                m447S(5);
            } else if (m3810cq() && this.f1623cj == 0.0f) {
                m447S(3);
            } else {
                m447S(2);
            }
        } else if (this.f1623cj == 0.0f) {
            m447S(this.f2863x.f3245cG);
        }
        this.f6957ek = 0;
    }

    /* renamed from: cj */
    public boolean m3815cj() {
        if (!this.f2863x.f3179gf) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo4816f() {
        return this.f2863x.f3138fb.read(this);
    }

    /* renamed from: j */
    public boolean mo4815j() {
        return true;
    }

    /* renamed from: D */
    public C1080ai m3941D(int i) {
        C0247ap c0247ap = this.f1649cJ[i];
        C0411bl c0411bl = this.f2863x.f3269fO[i];
        float f = c0411bl.f2575X;
        float f2 = c0411bl.f2576Y;
        if (c0411bl.f2617Z != 0.0f && c0247ap.f1724m) {
            f2 += c0411bl.f2617Z;
        }
        float f3 = mo3061E() ? this.f1618ce : c0247ap.f1712a;
        C1080ai m3938F = m3938F(i);
        float m2092i = C0758f.m2092i(f3);
        float m2097h = C0758f.m2097h(f3);
        float f4 = m3938F.f6849a;
        float f5 = m3938F.f6850b;
        float f6 = m3938F.f6851c;
        f2895eb.f6849a = f4 + ((m2092i * f) - (m2097h * f2));
        f2895eb.f6850b = f5 + (m2097h * f) + (m2092i * f2);
        f2895eb.f6851c = f6 + c0411bl.f2577aa;
        return f2895eb;
    }

    /* renamed from: E */
    public PointF mo3156E(int i) {
        C1080ai m3941D = m3941D(i);
        f2896ec.f227a = m3941D.f6849a;
        f2896ec.f228b = m3941D.f6850b;
        return f2896ec;
    }

    /* renamed from: ck */
    public boolean m3814ck() {
        return this.f2863x.f3169fH;
    }

    /* renamed from: cm */
    public float m3812cm() {
        return this.f2863x.f3267fI;
    }

    /* renamed from: a */
    public void m3914a(AbstractC0244am abstractC0244am, float f, int i) {
        if (this.f2863x.f3070dx != null) {
            this.f2841b.m4066a(this.f2863x.f3070dx, 5);
        }
        if (this.f2863x.f3006bS) {
            this.f3899T = C0758f.m2211a(this.f3899T, f);
            if (this.f3899T == 0.0f) {
                this.f3899T = this.f2863x.f3007bT;
                if (this.f2863x.f3008bU != null) {
                    C0247ap c0247ap = this.f1649cJ[i];
                    PointF mo3156E = mo3156E(i);
                    this.f2863x.f3008bU.m3637a(mo3156E.f227a, mo3156E.f228b, this.f6960en, c0247ap.f1712a, this);
                }
                if (this.f2863x.f3009bV != null) {
                    this.f2863x.f3009bV.m3637a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, abstractC0244am.f1618ce, abstractC0244am);
                    return;
                }
                return;
            }
            return;
        }
        super.m2977a(abstractC0244am, f, i);
    }

    /* renamed from: b */
    public void m3871b(AbstractC0244am abstractC0244am, float f, int i) {
        if (this.f2863x.f3071dy != null) {
            this.f2841b.m4066a(this.f2863x.f3071dy, 5);
        }
        if (this.f2863x.f3010bW) {
            this.f3899T = C0758f.m2211a(this.f3899T, f);
            if (this.f3899T == 0.0f) {
                this.f3899T = this.f2863x.f3011bX;
                if (this.f2863x.f3012bY != null) {
                    C0247ap c0247ap = this.f1649cJ[i];
                    PointF mo3156E = mo3156E(i);
                    this.f2863x.f3012bY.m3637a(mo3156E.f227a, mo3156E.f228b, this.f6960en, c0247ap.f1712a, this);
                }
                if (this.f2863x.f3013bZ != null) {
                    this.f2863x.f3013bZ.m3637a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0244am.f6960en, abstractC0244am.f1618ce, abstractC0244am);
                    return;
                }
                return;
            }
            return;
        }
        super.m2893b(abstractC0244am, f, i);
    }

    /* renamed from: cf */
    public boolean m3817cf() {
        return this.f2864y.f2250m;
    }

    /* renamed from: dE */
    public boolean m3796dE() {
        if (this.f2863x.f2930Y != null && !this.f2863x.f2930Y.read(this)) {
            return false;
        }
        if (!this.f2864y.f2250m) {
            Core m1087A = Core.m1087A();
            if (m1087A.f6099bs.m5054c(this.f1609bV) && !m1087A.f6099bs.m5074b()) {
                return false;
            }
        }
        C0399m dl = m4668dl();
        if (dl != null && !dl.f2470o) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo1757t() {
        C0399m dl = m4668dl();
        if (dl != null && dl.f2468m) {
            return true;
        }
        return this.f2863x.f2954aL;
    }

    /* renamed from: cT */
    public boolean m3827cT() {
        C0399m dl = m4668dl();
        if (dl != null && dl.f2469n) {
            return true;
        }
        return this.f2863x.f2955aM;
    }

    /* renamed from: d */
    public boolean mo3044d(AbstractC0244am abstractC0244am) {
        C0453l c0453l = this.f2863x;
        return ((c0453l.f2960aR != null && !C0448g.m3960a(c0453l.f2960aR, abstractC0244am.m4676dc())) || m3795dF() || c0453l.f2956aN) ? false : true;
    }

    /* renamed from: cU */
    public boolean m3826cU() {
        return this.f2863x.f2961aS;
    }

    /* renamed from: cS */
    public boolean m3828cS() {
        return this.f2863x.f2956aN || mo1756u() || (this.f1624ck < 1.0f && this.f2863x.f2973bh <= 0.0f);
    }

    /* renamed from: df */
    public C0449h m3790df() {
        return this.f2863x.f2924O;
    }

    /* renamed from: am */
    public float m3879am() {
        return this.f2863x.f3123eE;
    }

    /* renamed from: an */
    public boolean m3878an() {
        return super.m2913an() || this.f2863x.f3122eD;
    }

    /* renamed from: a */
    public boolean m3898a(Core core) {
        if (!core.f6251cN.m5855b(this.f6958el, this.f6959em)) {
            if (!this.f2863x.f2912A) {
                return false;
            }
            boolean z = false;
            if (this.f2863x.f2913B != null) {
                C0453l.f3186a.m5873a(this.f2863x.f2913B);
                C0453l.f3186a.m5875a((int) this.f6958el, (int) this.f6959em);
                if (core.f6253cP.m5869b(C0453l.f3186a)) {
                    z = true;
                }
            }
            if (core.f6251cN.m5855b(this.f6958el, this.f6959em - this.f6960en)) {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        if (this.f1651cL != null) {
            return false;
        }
        if ((this.f1653cN != null && this.f1653cN.f2483I) || !m4681d(core.f6099bs) || !m3796dE()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public AbstractC0623y m3909a(C0399m c0399m) {
        return C0398l.m4194a(this, c0399m);
    }

    /* renamed from: a */
    public C0399m m3896a(short s) {
        return C0398l.m4190a(this, s);
    }

    /* renamed from: a */
    public boolean m3900a(AbstractC0623y abstractC0623y, C0399m c0399m) {
        if (abstractC0623y == this) {
            return false;
        }
        if (c0399m == null) {
            Core.m998b("attachRequest: No attachedSlotData");
            return false;
        }
        AbstractC0623y m4194a = C0398l.m4194a(this, c0399m);
        if (m4194a != null) {
            Core.m998b("attachRequest: a unit is already in slot (parent:" + m4683cz() + " slot:" + c0399m.m4183b() + " existing:" + m4194a.m4732cB() + ")");
            return false;
        }
        Core m1087A = Core.m1087A();
        C0398l.m4193a(this, c0399m, abstractC0623y);
        abstractC0623y.f1652cM = this;
        abstractC0623y.f1653cN = c0399m;
        abstractC0623y.f1654cO = m1087A.f6102by;
        abstractC0623y.f1606bS = false;
        return true;
    }

    /* renamed from: b */
    public boolean m3865b(AbstractC0623y abstractC0623y) {
        if (abstractC0623y.f1652cM != this) {
            Core.m998b("deattachRequest: unit is not attached");
            return false;
        }
        C0399m c0399m = abstractC0623y.f1653cN;
        if (c0399m == null) {
            Core.m998b("deattachRequest: unit has no attachedSlotData");
            return false;
        }
        AbstractC0623y m4194a = C0398l.m4194a(this, c0399m);
        if (m4194a == null) {
            Core.m998b("deattachRequest: Failed, no unit in slot");
            Core.m973g("deattachRequest");
            return false;
        } else if (abstractC0623y != m4194a) {
            String str = "null";
            if (m4194a != null) {
                str = m4194a.m4683cz();
            }
            Core.m998b("deattachRequest: unit and slot don't match - requested:" + abstractC0623y.m4683cz() + " current:" + str);
            return false;
        } else {
            if (this.f2867B.remove(abstractC0623y)) {
                m3940D(abstractC0623y);
            }
            C0398l.m4193a(this, c0399m, (AbstractC0623y) null);
            abstractC0623y.f1652cM = null;
            abstractC0623y.f1653cN = null;
            abstractC0623y.mo3047c_();
            m4783a(EnumC0347ae.f2189r, this);
            return true;
        }
    }

    /* renamed from: dF */
    public boolean m3795dF() {
        C0399m dl = m4668dl();
        if (dl != null && !dl.f2467l) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public boolean mo3056J() {
        if (m3795dF() || this.f2863x.f2957aO) {
            return true;
        }
        return false;
    }

    /* renamed from: dg */
    public void m3789dg() {
        C0453l c0453l = this.f2863x;
        if (!c0453l.f3243ct.m4106b()) {
            c0453l.f3243ct.mo4081a(this);
        }
        if (!c0453l.f3244cu.m4106b() && this.f1624ck >= 1.0f) {
            c0453l.f3244cu.mo4081a(this);
        }
        super.m4673dg();
    }

    /* renamed from: dh */
    public void m3788dh() {
        C0453l c0453l = this.f2863x;
        if (!c0453l.f3243ct.m4106b()) {
            c0453l.f3243ct.m4084h(this);
        }
        if (!c0453l.f3244cu.m4106b() && this.f1624ck >= 1.0f) {
            c0453l.f3244cu.m4084h(this);
        }
        super.m4672dh();
    }

    /* renamed from: a */
    public void m3911a(C0305au c0305au) {
        m4784a(EnumC0347ae.f2181j);
        C0399m dl = m4668dl();
        if (dl != null && dl.f2461H) {
            EnumC0306av m4444d = c0305au.m4444d();
            if (m4444d == EnumC0306av.f1818h || m4444d == EnumC0306av.f1811a) {
                m2855bx();
            }
        }
    }

    /* renamed from: b_ */
    public boolean m3852b_() {
        C0453l c0453l = this.f2863x;
        if (!c0453l.f2959aQ && Core.m1087A().f6099bs.m5054c(this.f1609bV)) {
            return false;
        }
        return c0453l.f2958aP;
    }

    /* renamed from: di */
    public boolean m3787di() {
        return this.f2863x.f2931Z;
    }

    /* renamed from: dj */
    public boolean m3786dj() {
        return this.f2863x.f3261eI;
    }

    /* renamed from: dk */
    public boolean m3785dk() {
        return this.f2863x.f3262eJ;
    }

    /* renamed from: G */
    public boolean m3936G(AbstractC0244am abstractC0244am) {
        int m3794dG = m3794dG();
        int mo3328cu = abstractC0244am.mo3328cu();
        if (this.f2863x.f3127eM) {
            mo3328cu = 1;
        }
        if (m3794dG + mo3328cu <= this.f2863x.f3263eK) {
            return true;
        }
        return false;
    }

    /* renamed from: dG */
    public int m3794dG() {
        int i = 0;
        if (this.f2863x.f3127eM) {
            i = 0 + this.f2867B.size();
        } else if (this.f2867B.f6894a > 0) {
            Iterator it = this.f2867B.iterator();
            while (it.hasNext()) {
                i += ((AbstractC0244am) it.next()).mo3328cu();
            }
        }
        return i;
    }

    /* renamed from: e */
    public void m3777e(AbstractC0197n abstractC0197n) {
        C0399m m4668dl;
        if (this.f1609bV == abstractC0197n) {
            return;
        }
        super.m4663e(abstractC0197n);
        if (this.f2867B != null && !this.f2863x.f3135eV) {
            Iterator it = this.f2867B.iterator();
            while (it.hasNext()) {
                ((AbstractC0244am) it.next()).m4663e(abstractC0197n);
            }
        }
        if (this.f2868C != null) {
            Iterator it2 = this.f2868C.iterator();
            while (it2.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it2.next();
                if (abstractC0244am != null && (m4668dl = abstractC0244am.m4668dl()) != null && !m4668dl.f2458z) {
                    abstractC0244am.m4663e(abstractC0197n);
                }
            }
        }
        m4784a(EnumC0347ae.f2182k);
    }

    /* renamed from: cM */
    public C0424b m3834cM() {
        return this.f2863x.f3018cg;
    }

    /* renamed from: cg */
    public void m3816cg() {
        if (this.f2863x.f2984bs) {
            if (this.f1632cs <= -1.0f) {
                this.f1632cs = -1.0f;
                return;
            }
            return;
        }
        super.m4701cg();
    }

    /* renamed from: bz */
    public C1101m m3840bz() {
        return this.f2867B;
    }

    /* renamed from: e */
    public C1101m m3773e(boolean z) {
        this.f2897ed.clear();
        if (this.f2863x.f3226az.f6894a > 0) {
            C0398l.m4191a(this, this.f2897ed, z);
        }
        if (this.f2897ed.f6894a > 0) {
            return this.f2897ed;
        }
        return null;
    }

    /* renamed from: dm */
    public float m3784dm() {
        return this.f2863x.f3053dc;
    }

    /* renamed from: dn */
    public boolean m3783dn() {
        return this.f2863x.f3206z;
    }

    /* renamed from: dH */
    public void m3793dH() {
        if (this.f2864y.f2238a) {
            this.f2864y = this.f2864y.m4243b();
        }
    }
}
