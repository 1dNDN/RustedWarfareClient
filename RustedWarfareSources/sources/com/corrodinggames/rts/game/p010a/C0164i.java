package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.game.units.p024d.C0489e;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.game.units.p027f.C0541f;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/i.class */
public class C0164i extends AbstractC0170o {

    /* renamed from: a */
    float f689a;

    /* renamed from: b */
    EnumC0165j f690b;

    /* renamed from: c */
    EnumC0166k f691c;

    /* renamed from: d */
    float f692d;

    /* renamed from: e */
    float f693e;

    /* renamed from: f */
    float f694f;

    /* renamed from: g */
    float f695g;

    /* renamed from: h */
    int f696h;

    /* renamed from: i */
    float f697i;

    /* renamed from: j */
    float f698j;

    /* renamed from: k */
    float f699k;

    /* renamed from: l */
    float f700l;

    /* renamed from: m */
    float f701m;

    /* renamed from: n */
    boolean f702n;

    /* renamed from: o */
    boolean f703o;

    /* renamed from: p */
    C1101m f704p;

    /* renamed from: q */
    C1112u f705q;

    /* renamed from: r */
    C1112u f706r;

    /* renamed from: s */
    boolean f707s;

    /* renamed from: t */
    boolean f708t;

    /* renamed from: u */
    float f709u;

    /* renamed from: v */
    float f710v;

    /* renamed from: w */
    PointF f711w;

    /* renamed from: x */
    PointF f712x;

    /* renamed from: y */
    int f713y;

    /* renamed from: z */
    InterfaceC0303as f714z;

    /* renamed from: A */
    C0424b f715A;

    /* renamed from: B */
    C0424b f716B;

    /* renamed from: C */
    int f717C;

    /* renamed from: D */
    int f718D;

    /* renamed from: E */
    String f719E;

    /* renamed from: F */
    int f720F;

    /* renamed from: G */
    int f721G;

    /* renamed from: H */
    boolean f722H;

    /* renamed from: I */
    int f723I;

    /* renamed from: J */
    int f724J;

    /* renamed from: K */
    int f725K;

    /* renamed from: L */
    int f726L;

    /* renamed from: M */
    boolean f727M;

    /* renamed from: N */
    ArrayList f728N;

    /* renamed from: O */
    InterfaceC0303as f729O;

    /* renamed from: P */
    C0424b f730P;

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1363a(this.f690b);
        streamWriter.mo1363a(this.f691c);
        streamWriter.mo1320a(this.f692d);
        streamWriter.mo1320a(this.f693e);
        streamWriter.mo1320a(this.f694f);
        streamWriter.mo1320a(this.f695g);
        streamWriter.mo1320a(this.f697i);
        streamWriter.mo1320a(this.f698j);
        streamWriter.mo1320a(this.f699k);
        streamWriter.mo1320a(this.f700l);
        streamWriter.mo1355c(4);
        streamWriter.mo1320a(this.f710v);
        streamWriter.mo1320a(this.f701m);
        streamWriter.mo1314a(this.f702n);
        streamWriter.mo1314a(this.f703o);
        streamWriter.WriteInteger(this.f696h);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo4877a(Reader reader) {
        this.f690b = (EnumC0165j) reader.m1293b(EnumC0165j.class);
        this.f691c = (EnumC0166k) reader.m1293b(EnumC0166k.class);
        this.f692d = reader.m1285g();
        this.f693e = reader.m1285g();
        this.f694f = reader.m1285g();
        this.f695g = reader.m1285g();
        this.f697i = reader.m1285g();
        this.f698j = reader.m1285g();
        this.f699k = reader.m1285g();
        this.f700l = reader.m1285g();
        byte m1289d = reader.m1289d();
        if (m1289d >= 1) {
            this.f710v = reader.m1285g();
        }
        if (m1289d >= 2) {
            this.f701m = reader.m1285g();
        }
        if (m1289d >= 3) {
            this.f702n = reader.ReadBool();
            this.f703o = reader.ReadBool();
        }
        if (m1289d >= 4) {
            this.f696h = reader.ReadInt();
        }
        super.mo4877a(reader);
    }

    public C0164i(C0136a c0136a, float f, float f2) {
        super(c0136a, f, f2);
        this.f692d = -1.0f;
        this.f695g = 100.0f;
        this.f697i = 50.0f;
        this.f698j = 50.0f;
        this.f704p = new C1101m();
        this.f705q = new C1112u();
        this.f706r = new C1112u();
        this.f710v = 0.0f;
        this.f711w = new PointF();
        this.f712x = new PointF();
        this.f722H = false;
        this.f728N = new ArrayList();
    }

    /* renamed from: a */
    public PointF m4938a() {
        C0180g m4803e;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        PointF pointF = null;
        int i = (int) (this.f763U * m1072A.f6110bL.f789r);
        m1072A.f6110bL.m4857a(this.f761S, this.f762T);
        int i2 = m1072A.f6110bL.f801T;
        int i3 = m1072A.f6110bL.f802U;
        for (int i4 = i2 - i; i4 <= i2 + i; i4++) {
            for (int i5 = i3 - i; i5 <= i3 + i; i5++) {
                if (m1072A.f6110bL.m4813c(i4, i5) && (m4803e = m1072A.f6110bL.m4803e(i4, i5)) != null && m4803e.f922i) {
                    AbstractC0244am m3379b = AbstractC0488d.m3379b(i4, i5);
                    boolean z = false;
                    if (m3379b == null) {
                        z = true;
                    }
                    if (m3379b != null && (m3379b instanceof AbstractC0623y) && !((AbstractC0623y) m3379b).mo5649r().mo4245p()) {
                        z = true;
                    }
                    if (z) {
                        m1072A.f6110bL.m4853a(i4, i5);
                        if (pointF == null || C0758f.m2151a(0, 100) < 50) {
                            this.f711w.m5369a(m1072A.f6110bL.f801T + m1072A.f6110bL.f787p, m1072A.f6110bL.f802U + m1072A.f6110bL.f788q);
                            pointF = this.f711w;
                        }
                    }
                }
            }
        }
        return pointF;
    }

    /* renamed from: a */
    public void m4925a(AbstractC0623y abstractC0623y) {
        this.f705q.remove(abstractC0623y);
    }

    /* renamed from: b */
    public void m4920b() {
        this.f704p.clear();
        this.f705q.clear();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && !abstractC0244am.f1607bT && !abstractC0244am.mo1712u() && m4934a(abstractC0244am)) {
                this.f705q.mo494a(abstractC0244am);
                InterfaceC0303as interfaceC0303as = abstractC0244am.f1689dx;
                if (!this.f704p.contains(interfaceC0303as)) {
                    this.f704p.add(interfaceC0303as);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m4931a(InterfaceC0303as interfaceC0303as) {
        if (m4927a(interfaceC0303as, false, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4918b(InterfaceC0303as interfaceC0303as) {
        if ((LoggerMaybe.m1072A().f6228ar && !interfaceC0303as.mo4265C()) || interfaceC0303as.mo4241w()) {
            return false;
        }
        Object[] m534a = this.f704p.m534a();
        int size = this.f704p.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0303as interfaceC0303as2 = (InterfaceC0303as) m534a[i];
            AbstractC0244am[] m498a = this.f705q.m498a();
            int i2 = 0;
            int size2 = this.f705q.size();
            while (true) {
                if (i2 < size2) {
                    AbstractC0244am abstractC0244am = m498a[i2];
                    if (abstractC0244am.mo5649r() != interfaceC0303as2 || !(abstractC0244am instanceof AbstractC0623y)) {
                        i2++;
                    } else if (((AbstractC0623y) abstractC0244am).m2834b(interfaceC0303as, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public InterfaceC0303as m4917c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f760R.f585aX) {
            return null;
        }
        int m4936a = m4936a(this.f760R.f615bB);
        InterfaceC0303as interfaceC0303as = null;
        float f = -1.0f;
        Iterator it = EnumC0249ar.f1791ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as2 = (InterfaceC0303as) it.next();
            if (interfaceC0303as2.mo4251j() && m4918b(interfaceC0303as2)) {
                int m5056a = this.f760R.m5056a(interfaceC0303as2, EnumC0157b.include);
                int m4915c = m4915c(interfaceC0303as2);
                boolean z = false;
                if (interfaceC0303as2 instanceof C0453l) {
                    z = true;
                    C0453l c0453l = (C0453l) interfaceC0303as2;
                    if (c0453l.f3268fJ.size() != 0) {
                        Iterator it2 = c0453l.f3268fJ.iterator();
                        while (it2.hasNext()) {
                            InterfaceC0303as interfaceC0303as3 = (InterfaceC0303as) it2.next();
                            m5056a += this.f760R.m5056a(interfaceC0303as3, EnumC0157b.include);
                            m4915c += m4915c(interfaceC0303as3);
                        }
                    }
                }
                float f2 = -2.0f;
                if (interfaceC0303as2.mo4245p() && !z) {
                    int i = m4915c;
                    if (m4938a() != null && C0758f.m2151a(0, 100) < 90) {
                        if (i == 0) {
                            if (this.f760R.f1310o < 5000.0d) {
                                f2 = 0.98f;
                            } else {
                                f2 = 0.58f;
                            }
                        }
                        if (i == 1) {
                            f2 = 0.55f;
                        }
                        if (i == 2) {
                            f2 = 0.4f;
                        }
                        if (i >= 3) {
                            f2 = 0.25f / i;
                        }
                        if (m5056a >= 3) {
                            f2 = (float) (f2 * 0.6d);
                        }
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1736b && (m5056a < 5 || m4936a == 0)) {
                    if (m5056a == 0) {
                        f2 = 0.8f;
                    } else if (m4915c < 2) {
                        f2 = 0.46f / (m5056a + (m4915c * 2));
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1738d && this.f760R.m5044ad() && (m5056a < 5 || m4936a == 0)) {
                    if (m5056a == 0) {
                        f2 = 0.3f;
                    } else if (m4915c < 1) {
                        f2 = 0.1f / (m5056a + (m4915c * 2));
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1737c && (m5056a < 5 || m4936a == 0)) {
                    if (m5056a == 0) {
                        f2 = 0.48f;
                    } else if (m4915c < 2) {
                        f2 = 0.29f / (m5056a + m4915c);
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1740f) {
                    if (m4915c == 0) {
                        f2 = 0.47f;
                    } else if (m4915c < 3) {
                        f2 = 0.35f / m4915c;
                    } else if (m4915c < 4) {
                        f2 = 0.025f / m4915c;
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1759y && m4915c == 0) {
                    f2 = 0.018f;
                }
                if (interfaceC0303as2 == EnumC0249ar.f1762B && m4915c == 0) {
                    f2 = 0.02f;
                }
                if (interfaceC0303as2 == EnumC0249ar.f1741g) {
                    if (m4915c == 0) {
                        f2 = 0.42f;
                    } else if (this.f760R.m5075Y()) {
                        if (m4915c < 4) {
                            f2 = 0.3f / m4915c;
                        }
                    } else if (m4915c < 3) {
                        f2 = 0.3f / m4915c;
                    } else if (m4915c < 4) {
                        f2 = 0.02f / m4915c;
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1770J && this.f760R.f1310o > 2000.0d && m4915c < 5) {
                    if (m5056a == 0) {
                        f2 = 0.11f;
                    } else {
                        f2 = 0.07f / ((0.2f * m5056a) + m4915c);
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1764D && ((!m1072A.m1059N() || !m1072A.f6122bX.f5603aO.f5662i) && this.f760R.f1310o > 2200.0d && m5056a < 4)) {
                    if (m5056a == 0) {
                        f2 = 0.06f;
                    } else if (m4915c < 1) {
                        f2 = 0.05f / (m5056a + (m4915c * 2));
                    }
                }
                if (z) {
                    C0453l c0453l2 = (C0453l) interfaceC0303as2;
                    if (!c0453l2.f3156fu && ((m5056a < c0453l2.f3157fv || c0453l2.f3157fv == -1) && (m4915c < c0453l2.f3158fw || c0453l2.f3158fw == -1))) {
                        f2 = c0453l2.f3159fx;
                        if (m4915c < c0453l2.f3160fy) {
                            f2 = c0453l2.f3161fz;
                        }
                        if (m4915c == 0) {
                            f2 += c0453l2.f3162fA;
                        }
                        if (m5056a == 0) {
                            f2 += c0453l2.f3163fB;
                        }
                        if (interfaceC0303as2.mo4245p() && m4938a() == null) {
                            f2 = -2.0f;
                        }
                    }
                }
                if (this.f760R.m5074Z() && interfaceC0303as2 == EnumC0249ar.f1767G && this.f760R.f1310o > 15000.0d) {
                    if (m5056a == 0) {
                        f2 = 0.04f;
                    }
                    if (this.f760R.f1310o > 55000.0d && m5056a == 1) {
                        f2 = 0.03f;
                    }
                }
                if (f2 >= 0.0f && (f2 > f || C0758f.m2084c(0.0f, 1.0f) < 0.01d)) {
                    f = f2;
                    interfaceC0303as = interfaceC0303as2;
                }
            }
        }
        this.f694f = f;
        return interfaceC0303as;
    }

    /* renamed from: a */
    public int m4936a(AbstractC0159d abstractC0159d) {
        int i = 0;
        Iterator it = abstractC0159d.f650c.iterator();
        while (it.hasNext()) {
            i += m4915c(((C0160e) it.next()).f653a);
        }
        return i;
    }

    /* renamed from: c */
    public int m4915c(InterfaceC0303as interfaceC0303as) {
        int i = 0;
        C1112u c1112u = this.f705q;
        AbstractC0244am[] m498a = c1112u.m498a();
        int size = c1112u.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == this.f760R && abstractC0244am.f1689dx == interfaceC0303as && m4934a(abstractC0244am)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public int m4914d() {
        int i = 0;
        C1112u c1112u = this.f705q;
        AbstractC0244am[] m498a = c1112u.m498a();
        int size = c1112u.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == this.f760R && (abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (m4922a(abstractC0623y, false) && !abstractC0623y.f1599bL && abstractC0623y.f3947aA == null && this.f760R.m5013h(abstractC0623y) && this.f760R.m5011i(abstractC0623y)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m4911e() {
        return this.f725K;
    }

    /* renamed from: f */
    public boolean m4910f() {
        return m4906h() != 0;
    }

    /* renamed from: g */
    public AbstractC0244am m4908g() {
        float f = this.f763U + 120.0f;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f6957el + f > this.f761S && abstractC0244am.f6957el - f < this.f761S && abstractC0244am.f6958em + f > this.f762T && abstractC0244am.f6958em - f < this.f762T && abstractC0244am.f1609bV != this.f760R && m4878a(abstractC0244am, 120.0f) && abstractC0244am.f1609bV.m4599c(this.f760R) && this.f760R.m5009j(abstractC0244am)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: h */
    public int m4906h() {
        return m4937a(60.0f);
    }

    /* renamed from: a */
    public int m4937a(float f) {
        int i = 0;
        float f2 = this.f763U + f;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f6957el + f2 > this.f761S && abstractC0244am.f6957el - f2 < this.f761S && abstractC0244am.f6958em + f2 > this.f762T && abstractC0244am.f6958em - f2 < this.f762T && abstractC0244am.f1609bV != this.f760R && m4878a(abstractC0244am, f) && abstractC0244am.f1609bV.m4599c(this.f760R) && abstractC0244am.mo2979l() && this.f760R.m5009j(abstractC0244am)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public void m4905i() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0244am m4908g = m4908g();
        if (m4908g != null) {
            C0749e m2370a = m1072A.f6130cf.m2370a(this.f760R);
            AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
            int size = AbstractC0244am.f1590bD.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m498a[i];
                if (abstractC0244am instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                    if (abstractC0244am.f1609bV == this.f760R && this.f760R.m5025b(abstractC0244am, m4908g) && this.f760R.m5011i(abstractC0623y) && abstractC0623y.m2854aq()) {
                        if (!abstractC0244am.f1599bL) {
                            if (C0136a.m5061a(abstractC0244am, this.f761S, this.f762T, 800.0f)) {
                                m2370a.m2267a(abstractC0623y);
                            }
                        } else if (C0136a.m5061a(abstractC0244am, this.f761S, this.f762T, 540.0f)) {
                            m2370a.m2267a(abstractC0623y);
                        }
                    }
                }
            }
            m2370a.m2269a(m4908g);
        }
    }

    /* renamed from: a */
    public boolean m4934a(AbstractC0244am abstractC0244am) {
        return m4932a(abstractC0244am, false);
    }

    /* renamed from: a */
    public boolean m4932a(AbstractC0244am abstractC0244am, boolean z) {
        if ((abstractC0244am instanceof AbstractC0623y) && ((AbstractC0623y) abstractC0244am).f3948aB == this) {
            if (!z || m4876b(abstractC0244am)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4922a(AbstractC0623y abstractC0623y, boolean z) {
        if (abstractC0623y.f3948aB == this) {
            if (!z || m4876b(abstractC0623y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public int m4904j() {
        int i = 0;
        Iterator it = m4903k().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (this.f760R != abstractC0244am.f1609bV && abstractC0244am.f1609bV.m4599c(this.f760R) && (abstractC0244am instanceof AbstractC0623y) && m4876b(abstractC0244am)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: k */
    public C0541f m4903k() {
        return LoggerMaybe.m1072A().f6127cc.m3152b(this.f761S, this.f762T, this.f763U);
    }

    /* renamed from: x */
    private AbstractC0623y m4892x() {
        return m4930a((InterfaceC0303as) null, (PointF) null, true);
    }

    /* renamed from: y */
    private AbstractC0623y m4891y() {
        return m4909f(null);
    }

    /* renamed from: f */
    private AbstractC0623y m4909f(InterfaceC0303as interfaceC0303as) {
        return m4930a(interfaceC0303as, (PointF) null, false);
    }

    /* renamed from: a */
    private AbstractC0623y m4930a(InterfaceC0303as interfaceC0303as, PointF pointF, boolean z) {
        if (this.f725K == 0) {
            return null;
        }
        this.f713y = 0;
        float f = Float.MAX_VALUE;
        AbstractC0623y abstractC0623y = null;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (interfaceC0303as != null && ((m1072A.f6228ar && !interfaceC0303as.mo4265C()) || interfaceC0303as.mo4241w())) {
            return null;
        }
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && m4934a(abstractC0244am) && abstractC0244am.f1651cL == null && abstractC0244am.m4413aj() && (abstractC0244am instanceof AbstractC0623y) && this.f760R.m5011i(abstractC0244am)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                if (C0161f.m4973a(abstractC0623y2) && (!z || abstractC0623y2.mo2998I())) {
                    this.f713y++;
                    if (interfaceC0303as == null || abstractC0623y2.m2834b(interfaceC0303as, true)) {
                        boolean z2 = false;
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = C0758f.m2157a(pointF.f227a, pointF.f228b, abstractC0244am.f6957el, abstractC0244am.f6958em);
                        }
                        if (abstractC0623y == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (C0758f.m2084c(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            abstractC0623y = (AbstractC0623y) abstractC0244am;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return abstractC0623y;
    }

    /* renamed from: a */
    private AbstractC0623y m4933a(AbstractC0244am abstractC0244am, PointF pointF, boolean z) {
        if (this.f726L == 0) {
            return null;
        }
        float f = Float.MAX_VALUE;
        AbstractC0623y abstractC0623y = null;
        LoggerMaybe.m1072A();
        AbstractC0244am[] m498a = this.f705q.m498a();
        int size = this.f705q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am2 = m498a[i];
            if (abstractC0244am2.f1609bV == this.f760R && m4934a(abstractC0244am2) && abstractC0244am2.f1651cL == null) {
                InterfaceC0303as mo5649r = abstractC0244am2.mo5649r();
                if (mo5649r.mo4247n() && (abstractC0244am2 instanceof AbstractC0623y) && this.f760R.m5011i(abstractC0244am2)) {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am2;
                    if (C0161f.m4970b(abstractC0623y2) && ((!z || abstractC0623y2.mo2998I()) && (abstractC0244am == null || abstractC0623y2.m4308h(abstractC0244am, true)))) {
                        boolean z2 = false;
                        if (mo5649r instanceof C0453l) {
                            C0453l c0453l = (C0453l) mo5649r;
                            if (c0453l.f3167fF != null && !m4926a(c0453l.f3167fF)) {
                            }
                        }
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = C0758f.m2157a(pointF.f227a, pointF.f228b, abstractC0244am2.f6957el, abstractC0244am2.f6958em);
                        }
                        if (abstractC0623y == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (C0758f.m2084c(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            abstractC0623y = (AbstractC0623y) abstractC0244am2;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return abstractC0623y;
    }

    /* renamed from: g */
    private boolean m4907g(InterfaceC0303as interfaceC0303as) {
        PointF e;
        AbstractC0623y m4930a;
        this.f714z = interfaceC0303as;
        this.f715A = null;
        this.f716B = null;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (interfaceC0303as.mo4245p()) {
            e = m4938a();
        } else {
            e = m4872e(interfaceC0303as);
        }
        if (e == null || (m4930a = m4930a(interfaceC0303as, e, false)) == null) {
            return false;
        }
        if (interfaceC0303as == EnumC0249ar.f1738d) {
            int m450c = C1117y.m450c(e.f227a, e.f228b, EnumC0246ao.f1707e);
            this.f760R.getClass();
            if (m450c < 3000) {
                return false;
            }
        }
        int i = 1;
        AbstractC0224s m2913a = m4930a.m2913a(interfaceC0303as, true);
        if (m2913a != null) {
            i = m2913a.mo4485t();
        } else {
            LoggerMaybe.m983b("buildBuilding: could not find getBuildUnitAction for builder this shouldn't happen:" + interfaceC0303as.mo4252i());
        }
        if (!m2913a.mo3025b(m4930a) || !m2913a.mo3027a((AbstractC0244am) m4930a, false)) {
            if (!this.f760R.m5054a(m2913a.mo4138B(), m4930a)) {
                this.f715A = m2913a.mo4138B();
                this.f716B = this.f715A.m3876i(m4930a);
                return true;
            }
            return true;
        } else if (m2913a.mo4139A()) {
            C0749e m2370a = m1072A.f6130cf.m2370a(this.f760R);
            m2370a.m2267a(m4930a);
            m2370a.m2271a(m2913a.m4507N(), e, (AbstractC0244am) null);
            return true;
        } else {
            C0749e m2370a2 = m1072A.f6130cf.m2370a(this.f760R);
            m2370a2.m2267a(m4930a);
            m2370a2.m2276a(e.f227a, e.f228b, interfaceC0303as, i);
            return true;
        }
    }

    /* renamed from: z */
    private boolean m4890z() {
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && m4934a(abstractC0244am) && abstractC0244am.m4396bS() && !abstractC0244am.mo1712u() && (abstractC0244am instanceof AbstractC0623y) && ((AbstractC0623y) abstractC0244am).m2862ai()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4926a(C0449h c0449h) {
        C0449h m4331dc;
        AbstractC0244am[] m498a = this.f705q.m498a();
        int size = this.f705q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && abstractC0244am.m4396bS() && (m4331dc = abstractC0244am.m4331dc()) != null && C0448g.m3753a(c0449h, m4331dc)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private AbstractC0623y m4927a(InterfaceC0303as interfaceC0303as, boolean z, boolean z2) {
        AbstractC0244am[] m498a = this.f705q.m498a();
        int size = this.f705q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && abstractC0244am.m4396bS() && this.f760R.m5011i(abstractC0244am) && (abstractC0244am instanceof InterfaceC0501l) && (abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                InterfaceC0501l interfaceC0501l = (InterfaceC0501l) abstractC0244am;
                AbstractC0224s m4316e = abstractC0244am.m4316e(interfaceC0303as);
                if (m4316e != null && ((interfaceC0501l.mo3308dv() || !z) && !m4316e.mo4117m(abstractC0244am) && m4316e.mo3025b(abstractC0623y) && m4316e.mo3027a((AbstractC0244am) abstractC0623y, false) && ((!(abstractC0244am instanceof C0489e) || interfaceC0303as.mo4248m() || m4894u() <= 2 || this.f707s || !z) && (!z2 || abstractC0623y.f3949aC)))) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m4935a(AbstractC0159d abstractC0159d, boolean z) {
        Iterator it = abstractC0159d.m4983a().iterator();
        while (it.hasNext()) {
            if (m4929a(((C0160e) it.next()).f653a, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m4929a(InterfaceC0303as interfaceC0303as, boolean z) {
        return m4928a(interfaceC0303as, z, 1);
    }

    /* renamed from: a */
    private boolean m4928a(InterfaceC0303as interfaceC0303as, boolean z, int i) {
        if (i < 1) {
            LoggerMaybe.m982b("AI", "buildUnit: quantity cannot be < 1");
            return false;
        }
        AbstractC0623y m4927a = m4927a(interfaceC0303as, true, z);
        if (m4927a == null) {
        }
        if (m4927a == null) {
            return false;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0224s e = m4927a.m4316e(interfaceC0303as);
        if (e == null) {
            LoggerMaybe.m982b("AI", "buildUnit: action is null!");
            return false;
        } else if (!e.mo3025b(m4927a)) {
            LoggerMaybe.m982b("AI", "buildUnit: isAvailable==false");
            return false;
        } else if (!e.mo3027a((AbstractC0244am) m4927a, false)) {
            LoggerMaybe.m982b("AI", "buildUnit: isActive==false");
            return false;
        } else if (e.mo4123g(m4927a)) {
            return false;
        } else {
            if (e.mo4486k_() && m1072A.f6228ar) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                C0749e m2370a = m1072A.f6130cf.m2370a(this.f760R);
                m2370a.m2267a(m4927a);
                m2370a.m2272a(e.mo4488z());
            }
            return true;
        }
    }

    /* renamed from: l */
    C0164i m4902l() {
        C0164i c0164i;
        float f = -1.0f;
        C0164i c0164i2 = null;
        Iterator it = this.f760R.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0164i) && (c0164i = (C0164i) abstractC0170o) != this && c0164i.m4911e() > 1) {
                float a = c0164i.m4879a(this);
                if (c0164i2 == null || a < f) {
                    f = a;
                    c0164i2 = c0164i;
                }
            }
        }
        return c0164i2;
    }

    /* renamed from: m */
    public void m4901m() {
        AbstractC0623y m4892x;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0164i m4902l = m4902l();
        if (m4902l != null && m4902l.m4911e() > 1 && (m4892x = m4902l.m4892x()) != null) {
            PointF w = m4870w();
            if (C1117y.m469a(m4892x, w.f227a, w.f228b)) {
                boolean m5062a = this.f760R.m5062a(m4892x, w.f227a, w.f228b);
                if (m5062a || this.f760R.f567aF != 0) {
                    C0749e m2370a = m1072A.f6130cf.m2370a(this.f760R);
                    m2370a.m2267a(m4892x);
                    m2370a.m2277a(w.f227a, w.f228b);
                    this.f696h++;
                    this.f695g = C0758f.m2151a(1800, 2500);
                    if (this.f696h >= 2) {
                        this.f695g += 11000.0f;
                    }
                    m4902l.f725K--;
                    if (!m5062a) {
                        boolean z = true;
                        if (m4892x.f3947aA != null) {
                            if (!m4892x.f3947aA.mo4950a()) {
                                m4892x.f3947aA.m4946b(m4892x);
                            } else {
                                z = false;
                                if (!m4892x.f3947aA.f688G.contains(m4892x)) {
                                    m4892x.f3947aA.f688G.add(m4892x);
                                }
                            }
                        }
                        if (z) {
                            C0167l c0167l = new C0167l(this.f760R);
                            c0167l.m4887c(m4892x);
                            c0167l.f761S = w.f227a;
                            c0167l.f762T = w.f228b;
                        }
                        this.f695g = C0758f.m2151a(12000, 14000);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    private AbstractC0244am m4939A() {
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && m4932a(abstractC0244am, true) && abstractC0244am.m4402bI() && (abstractC0244am.f1632cs < abstractC0244am.f1633ct - 1.0f || abstractC0244am.f1624ck < 1.0f)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: n */
    public void m4900n() {
        LoggerMaybe.m1072A();
        if (this.f706r.size() == 0 || this.f707s) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            InterfaceC0303as m4976c = this.f760R.f613bz.m4976c();
            if (m4976c != null && m4931a(m4976c) && m4912d(m4976c)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m4912d(com.corrodinggames.rts.game.units.InterfaceC0303as r5) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.p010a.C0164i.m4912d(com.corrodinggames.rts.game.units.as):boolean");
    }

    /* renamed from: o */
    public void m4899o() {
        AbstractC0244am m4897r;
        if (this.f706r.size() != 0 && (m4897r = m4897r()) != null) {
            this.f712x.m5369a(m4897r.f6957el, m4897r.f6958em);
            AbstractC0623y m4933a = m4933a(m4897r, this.f712x, true);
            if (m4933a != null) {
                m4924a(m4933a, m4897r);
            }
        }
    }

    /* renamed from: q */
    public void m4898q() {
        AbstractC0623y abstractC0623y;
        C0305au m2853ar;
        AbstractC0244am m4212i;
        if (this.f706r.size() != 0 && this.f716B != null) {
            AbstractC0244am[] m498a = this.f705q.m498a();
            int size = this.f705q.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m498a[i];
                if (abstractC0244am.f1609bV == this.f760R && m4934a(abstractC0244am) && abstractC0244am.f1651cL == null && abstractC0244am.mo5649r().mo4247n() && (abstractC0244am instanceof AbstractC0623y) && this.f760R.m5011i(abstractC0244am) && C0758f.m2084c(0.0f, 1.0f) <= 0.3d && (m2853ar = (abstractC0623y = (AbstractC0623y) abstractC0244am).m2853ar()) != null && m2853ar.m4222d() == EnumC0306av.reclaim && (m4212i = m2853ar.m4212i()) != null && m4212i.mo3250g() > 0.0f && !this.f716B.m3885c(m4212i.m4370cL())) {
                    m4924a(abstractC0623y, m4897r());
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    public AbstractC0244am m4897r() {
        AbstractC0244am abstractC0244am = null;
        for (int i = 0; i < 20; i++) {
            abstractC0244am = this.f706r.mo497a(C0758f.m2151a(0, this.f706r.size() - 1));
            if (abstractC0244am == null || this.f716B == null || this.f716B.m3885c(abstractC0244am.m4370cL())) {
                break;
            }
        }
        return abstractC0244am;
    }

    /* renamed from: a */
    public void m4924a(AbstractC0623y abstractC0623y, AbstractC0244am abstractC0244am) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (abstractC0623y.mo3081g(abstractC0244am, true)) {
            C0749e m2370a = m1072A.f6130cf.m2370a(this.f760R);
            m2370a.m2267a(abstractC0623y);
            m2370a.m2256d(abstractC0244am);
        }
    }

    /* renamed from: s */
    public void m4896s() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0244am m4939A = m4939A();
        if (m4939A != null) {
            this.f712x.m5369a(m4939A.f6957el, m4939A.f6958em);
            AbstractC0623y m4930a = m4930a((InterfaceC0303as) null, this.f712x, true);
            if (m4930a != null && m4930a.mo3087a(m4939A) && m4939A.m4315e(m4930a) < 2) {
                C0749e m2370a = m1072A.f6130cf.m2370a(this.f760R);
                m2370a.m2267a(m4930a);
                m2370a.m2261b(m4939A);
            }
        }
    }

    /* renamed from: b */
    public void m4919b(float f) {
        m4916c(f);
        int i = this.f724J;
        int i2 = this.f723I;
        m4920b();
        this.f702n = m4890z();
        if (this.f702n) {
            this.f703o = true;
        }
        if (i >= 1) {
            m4896s();
        }
        if (this.f727M && this.f723I > 0) {
            m4900n();
            m4898q();
            m4899o();
        }
        if (i < 2 && this.f697i == 0.0f) {
            this.f697i = 300.0f;
            int m5066a = this.f760R.m5066a(this.f760R.f612by, EnumC0157b.include);
            if (!this.f707s || m5066a <= 2) {
                boolean z = C0758f.m2151a(0, 100) < 5;
                if (!z && m4935a(this.f760R.f612by, true)) {
                    this.f722H = false;
                    this.f697i = 900.0f;
                } else {
                    if (!z) {
                        this.f722H = true;
                    }
                    if (!this.f707s && this.f710v == 0.0f && i < 1 && this.f695g == 0.0f) {
                        m4901m();
                    }
                }
            }
        }
        int m4904j = m4904j();
        if (i == 0 && i2 == 0) {
            this.f699k += f;
            if (m4904j > 2) {
                this.f699k += 2.0f * f;
            }
            if (m4904j > 5) {
                this.f699k += 4.0f * f;
            }
        } else {
            this.f699k = C0758f.m2159a(this.f699k, f);
        }
        if (this.f699k > 11000.0f) {
            mo4871p();
        }
        if (this.f690b == EnumC0165j.f731a && ((i != 0 && i2 != 0) || (i2 > 5 && m4904j == 0))) {
            this.f700l += f;
            if (this.f700l > 2000.0f) {
                this.f690b = EnumC0165j.f733c;
            }
        }
        m4895t();
    }

    /* renamed from: t */
    public void m4895t() {
        if (this.f690b == null) {
            LoggerMaybe.m1031a("fixOverlaps: this.state==null");
            LoggerMaybe.m1031a("id:" + this.f759Q);
            LoggerMaybe.m1031a("x:" + this.f761S);
            LoggerMaybe.m1031a("y:" + this.f762T);
            LoggerMaybe.m1031a("radius:" + this.f763U);
            if (this.f760R != null) {
                LoggerMaybe.m1031a("team:" + this.f760R.f1306k);
                return;
            }
            return;
        }
        Iterator it = this.f760R.f599bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0164i) && abstractC0170o != this) {
                C0164i c0164i = (C0164i) abstractC0170o;
                if (C0758f.m2157a(this.f761S, this.f762T, c0164i.f761S, c0164i.f762T) < 400.0f) {
                    if (c0164i.f690b == null) {
                        LoggerMaybe.m1031a("fixOverlaps: targetBase.state==null");
                    } else if (c0164i.f690b.m4889a() < this.f690b.m4889a()) {
                        c0164i.mo4871p();
                    } else {
                        mo4871p();
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public int m4894u() {
        return this.f723I;
    }

    /* renamed from: c */
    public void m4916c(float f) {
        this.f723I = 0;
        this.f724J = 0;
        this.f726L = 0;
        this.f725K = 0;
        this.f727M = false;
        this.f706r.clear();
        if (1 != 0) {
            Iterator it = m4903k().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am.mo3250g() > 0.0f && m4876b(abstractC0244am)) {
                    this.f727M = true;
                    this.f706r.mo494a(abstractC0244am);
                }
            }
        }
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am2 = m498a[i];
            if (abstractC0244am2.f1609bV == this.f760R && (abstractC0244am2 instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (m4922a(abstractC0623y, false) && abstractC0244am2.m4396bS() && this.f760R.m5011i(abstractC0244am2) && !abstractC0244am2.mo1712u()) {
                    InterfaceC0303as mo5649r = abstractC0244am2.mo5649r();
                    if (mo5649r.mo4251j()) {
                        this.f723I++;
                    }
                    if (mo5649r.mo4248m()) {
                        this.f724J++;
                        if (C0161f.m4973a(abstractC0623y)) {
                            this.f725K++;
                        }
                    }
                    if (mo5649r.mo4247n()) {
                        this.f726L++;
                    }
                    if (abstractC0244am2 instanceof InterfaceC0501l) {
                        this.f724J += ((InterfaceC0501l) abstractC0244am2).mo3304h(EnumC0249ar.f1742h);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m4913d(float f) {
        InterfaceC0303as m4917c;
        this.f707s = m4910f();
        this.f708t = this.f707s;
        if (this.f707s) {
            this.f710v += f;
            this.f709u = 100.0f;
        } else {
            this.f710v = 0.0f;
        }
        if (this.f710v > 6000.0f) {
            this.f707s = false;
        }
        this.f701m = C0758f.m2159a(this.f701m, f);
        this.f693e = C0758f.m2159a(this.f693e, f);
        this.f695g = C0758f.m2159a(this.f695g, f);
        this.f697i = C0758f.m2159a(this.f697i, f);
        this.f698j = C0758f.m2159a(this.f698j, f);
        if (this.f707s && this.f698j == 0.0f) {
            this.f698j = 100 + (this.f759Q % 15);
            if (!this.f760R.f585aX) {
                m4905i();
            }
        }
        if (this.f693e <= 0.0f) {
            this.f693e = 270 + (this.f759Q % 15);
            if (this.f760R.m5075Y()) {
                this.f693e = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3 + (this.f759Q % 15);
            }
            if (this.f694f < 0.2d) {
                this.f693e += 180.0f;
            }
            if (this.f694f < 0.08d) {
                this.f693e += 180.0f;
            }
            if ((m4891y() != null) && (m4917c = m4917c()) != null && ((this.f694f > 0.8d || this.f760R.m4639a(1300.0d)) && ((this.f694f > 0.4d || this.f760R.m4639a(1700.0d)) && ((this.f694f > 0.2d || this.f760R.m4639a(2100.0d)) && ((this.f694f > 0.1d || this.f760R.m4639a(2800.0d)) && ((this.f694f > 0.05d || this.f760R.m4639a(3100.0d)) && (this.f694f > 0.01d || this.f760R.m4639a(4800.0d)))))))) {
                this.f717C++;
                if (!m4907g(m4917c)) {
                    this.f693e -= 120.0f;
                    this.f718D++;
                }
            }
        }
        float m4894u = m4894u() / 3.0f;
        if (m4894u < 1.0f) {
            m4894u = 1.0f;
        }
        if (this.f707s) {
            this.f692d = (float) (this.f692d + (f * 0.015d));
        }
        if (this.f694f < 0.6d) {
            if (this.f760R.f588ba < 2) {
                this.f692d = (float) (this.f692d + (f * 7.0E-4d * m4894u));
            } else if (this.f760R.m4639a(1200.0d)) {
                this.f692d = (float) (this.f692d + (f * 1.0E-4d * m4894u));
            }
            if (this.f760R.m4639a(1600.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.001d));
            }
            if (this.f760R.m4639a(2200.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.001d));
            }
            if (this.f760R.m4639a(2600.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.001d));
            }
            if (this.f760R.m4639a(8000.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.005d));
            }
            if (this.f760R.m4639a(9000.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.01d));
            }
            if (this.f760R.m4639a(10100.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.01d));
            }
            if (this.f760R.m4639a(30000.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.05d));
            }
        }
        if (this.f760R.m4639a(5000.0d)) {
            this.f692d = (float) (this.f692d + (f * 0.001d));
        }
        if (!this.f760R.m4639a(800.0d) && !this.f707s && this.f692d > 1.2f) {
            this.f692d = 1.2f;
        }
        if (this.f692d > 3.5f) {
            this.f692d = 3.5f;
        }
        for (int i = 0; i < 12; i++) {
            m4893v();
            if (this.f692d < 3.0f) {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m4921a(ArrayList arrayList, AbstractC0159d abstractC0159d, EnumC0246ao enumC0246ao, int i) {
        this.f728N.clear();
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0303as m4982a = abstractC0159d.m4982a(enumC0246ao);
            if (m4982a != null && !this.f728N.contains(m4982a)) {
                this.f728N.add(m4982a);
            }
        }
        arrayList.addAll(this.f728N);
    }

    /* renamed from: v */
    public void m4893v() {
        EnumC0246ao enumC0246ao;
        AbstractC0244am m4908g;
        int m4914d = m4914d();
        int i = 12;
        int i2 = 50;
        if (this.f760R.m5075Y()) {
            i2 = 65;
            i = 16;
        }
        boolean a = this.f760R.m4639a(25000.0d);
        ArrayList arrayList = new ArrayList();
        boolean m5043ae = this.f760R.m5043ae();
        boolean m5042af = this.f760R.m5042af();
        float f = 0.4f;
        float f2 = 0.3f;
        if (!this.f760R.f594bg) {
            f = 0.1f;
            f2 = 0.5f;
        }
        if (!this.f760R.f595bh) {
            f = 0.2f;
            f2 = 0.1f;
        }
        float m2084c = C0758f.m2084c(0.0f, 1.0f);
        if (m2084c < f) {
            enumC0246ao = EnumC0246ao.f1704b;
        } else if (m2084c < f + f2) {
            enumC0246ao = EnumC0246ao.f1708f;
        } else {
            enumC0246ao = EnumC0246ao.f1706d;
        }
        if ((this.f760R.m4639a(1300.0d) && this.f692d >= 1.0f) || (this.f760R.m4639a(300.0d) && this.f692d >= 3.0f)) {
            if (this.f760R.m5044ad() && this.f760R.f589bb < i && C0758f.m2081c(100) < 35) {
                m4921a(arrayList, this.f760R.f607bt, null, 2);
                if (a) {
                }
            }
            if (m4914d < 3 && this.f760R.f587aZ < i2) {
                if (enumC0246ao == EnumC0246ao.f1704b) {
                    m4921a(arrayList, this.f760R.f604bq, null, 4);
                    if (a) {
                    }
                } else if (enumC0246ao == EnumC0246ao.f1708f) {
                    m4921a(arrayList, this.f760R.f605br, null, 4);
                    if (a) {
                    }
                } else {
                    m4921a(arrayList, this.f760R.f606bs, null, 4);
                    if (a) {
                    }
                }
            }
            if (this.f692d >= 1.0f && m5043ae && this.f701m == 0.0f) {
                int m5066a = this.f760R.m5066a(this.f760R.f610bw, EnumC0157b.include);
                int m5066a2 = m5066a + this.f760R.m5066a(this.f760R.f611bx, EnumC0157b.include);
                int m5037ak = this.f760R.m5037ak();
                if ((this.f760R.m4639a(1700.0d) || m5037ak > 10 || (this.f760R.f598bk == 0 && m5037ak >= 1 && m5066a == 0)) && (m5066a2 < 3 || (m5037ak > 20 && m5066a2 < 5))) {
                    if (m5042af && m5066a2 < 2) {
                        m4921a(arrayList, this.f760R.f609bv, null, 2);
                    } else {
                        m4921a(arrayList, this.f760R.f609bv, EnumC0246ao.f1706d, 2);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            this.f720F++;
        }
        while (arrayList.size() != 0) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) arrayList.remove(arrayList.size() - 1);
            AbstractC0244am m4407b = AbstractC0244am.m4407b(interfaceC0303as);
            boolean z = true;
            if (this.f707s && C0758f.m2081c(100) < 10 && (m4908g = m4908g()) != null && !this.f760R.m5025b(m4407b, m4908g)) {
                this.f720F++;
                z = false;
            }
            if (z) {
                if (m4929a(interfaceC0303as, false)) {
                    this.f720F++;
                    this.f760R.f617bD.m4988a(interfaceC0303as);
                    this.f692d -= 1.0f;
                    if (this.f760R.m5014g(m4407b)) {
                        this.f701m = 1000.0f;
                        this.f760R.f598bk++;
                        return;
                    }
                    return;
                }
                this.f721G++;
            }
        }
    }

    /* renamed from: a */
    public void m4923a(AbstractC0623y abstractC0623y, C0424b c0424b, boolean z) {
        this.f729O = abstractC0623y.mo5649r();
        if (z) {
            this.f730P = null;
            this.f716B = null;
            return;
        }
        this.f730P = c0424b;
        this.f716B = c0424b.m3876i(abstractC0623y);
    }
}
