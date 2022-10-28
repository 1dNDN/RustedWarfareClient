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
import com.corrodinggames.rts.gameFramework.Core;
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
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.m1411a(this.f690b);
        streamWriter.m1411a(this.f691c);
        streamWriter.mo1335a(this.f692d);
        streamWriter.mo1335a(this.f693e);
        streamWriter.mo1335a(this.f694f);
        streamWriter.mo1335a(this.f695g);
        streamWriter.mo1335a(this.f697i);
        streamWriter.mo1335a(this.f698j);
        streamWriter.mo1335a(this.f699k);
        streamWriter.mo1335a(this.f700l);
        streamWriter.m1401c(4);
        streamWriter.mo1335a(this.f710v);
        streamWriter.mo1335a(this.f701m);
        streamWriter.mo1329a(this.f702n);
        streamWriter.mo1329a(this.f703o);
        streamWriter.WriteInteger(this.f696h);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m5411a(Reader reader) {
        this.f690b = (EnumC0165j) reader.m1308b(EnumC0165j.class);
        this.f691c = (EnumC0166k) reader.m1308b(EnumC0166k.class);
        this.f692d = reader.m1300g();
        this.f693e = reader.m1300g();
        this.f694f = reader.m1300g();
        this.f695g = reader.m1300g();
        this.f697i = reader.m1300g();
        this.f698j = reader.m1300g();
        this.f699k = reader.m1300g();
        this.f700l = reader.m1300g();
        byte m1304d = reader.m1304d();
        if (m1304d >= 1) {
            this.f710v = reader.m1300g();
        }
        if (m1304d >= 2) {
            this.f701m = reader.m1300g();
        }
        if (m1304d >= 3) {
            this.f702n = reader.ReadBool();
            this.f703o = reader.ReadBool();
        }
        if (m1304d >= 4) {
            this.f696h = reader.ReadInt();
        }
        super.m5364a(reader);
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
    public PointF m5428a() {
        C0180g m5290e;
        Core m1087A = Core.m1087A();
        PointF pointF = null;
        int i = (int) (this.f763U * m1087A.f6110bL.f789r);
        m1087A.f6110bL.m5344a(this.f761S, this.f762T);
        int i2 = m1087A.f6110bL.f801T;
        int i3 = m1087A.f6110bL.f802U;
        for (int i4 = i2 - i; i4 <= i2 + i; i4++) {
            for (int i5 = i3 - i; i5 <= i3 + i; i5++) {
                if (m1087A.f6110bL.m5300c(i4, i5) && (m5290e = m1087A.f6110bL.m5290e(i4, i5)) != null && m5290e.f922i) {
                    AbstractC0244am m3534b = AbstractC0488d.m3534b(i4, i5);
                    boolean z = false;
                    if (m3534b == null) {
                        z = true;
                    }
                    if (m3534b != null && (m3534b instanceof AbstractC0623y) && !((AbstractC0623y) m3534b).mo1758r().mo4467p()) {
                        z = true;
                    }
                    if (z) {
                        m1087A.f6110bL.m5340a(i4, i5);
                        if (pointF == null || C0758f.m2203a(0, 100) < 50) {
                            this.f711w.m5879a(m1087A.f6110bL.f801T + m1087A.f6110bL.f787p, m1087A.f6110bL.f802U + m1087A.f6110bL.f788q);
                            pointF = this.f711w;
                        }
                    }
                }
            }
        }
        return pointF;
    }

    /* renamed from: a */
    public void m5415a(AbstractC0623y abstractC0623y) {
        this.f705q.remove(abstractC0623y);
    }

    /* renamed from: b */
    public void m5409b() {
        this.f704p.clear();
        this.f705q.clear();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && !abstractC0244am.f1607bT && !abstractC0244am.mo1756u() && m5424a(abstractC0244am)) {
                this.f705q.mo494a(abstractC0244am);
                InterfaceC0303as interfaceC0303as = abstractC0244am.f1689dx;
                if (!this.f704p.contains(interfaceC0303as)) {
                    this.f704p.add(interfaceC0303as);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m5421a(InterfaceC0303as interfaceC0303as) {
        if (m5417a(interfaceC0303as, false, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m5407b(InterfaceC0303as interfaceC0303as) {
        if ((Core.m1087A().f6228ar && !interfaceC0303as.mo4487C()) || interfaceC0303as.mo4463w()) {
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
                    if (abstractC0244am.mo1758r() != interfaceC0303as2 || !(abstractC0244am instanceof AbstractC0623y)) {
                        i2++;
                    } else if (((AbstractC0623y) abstractC0244am).m2890b(interfaceC0303as, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public InterfaceC0303as m5406c() {
        Core m1087A = Core.m1087A();
        if (this.f760R.f585aX) {
            return null;
        }
        int m5426a = m5426a(this.f760R.f615bB);
        InterfaceC0303as interfaceC0303as = null;
        float f = -1.0f;
        Iterator it = EnumC0249ar.f1791ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as2 = (InterfaceC0303as) it.next();
            if (interfaceC0303as2.mo4473j() && m5407b(interfaceC0303as2)) {
                int m5566a = this.f760R.m5566a(interfaceC0303as2, EnumC0157b.f643a);
                int m5404c = m5404c(interfaceC0303as2);
                boolean z = false;
                if (interfaceC0303as2 instanceof C0453l) {
                    z = true;
                    C0453l c0453l = (C0453l) interfaceC0303as2;
                    if (c0453l.f3268fJ.size() != 0) {
                        Iterator it2 = c0453l.f3268fJ.iterator();
                        while (it2.hasNext()) {
                            InterfaceC0303as interfaceC0303as3 = (InterfaceC0303as) it2.next();
                            m5566a += this.f760R.m5566a(interfaceC0303as3, EnumC0157b.f643a);
                            m5404c += m5404c(interfaceC0303as3);
                        }
                    }
                }
                float f2 = -2.0f;
                if (interfaceC0303as2.mo4467p() && !z) {
                    int i = m5404c;
                    if (m5428a() != null && C0758f.m2203a(0, 100) < 90) {
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
                        if (m5566a >= 3) {
                            f2 = (float) (f2 * 0.6d);
                        }
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1736b && (m5566a < 5 || m5426a == 0)) {
                    if (m5566a == 0) {
                        f2 = 0.8f;
                    } else if (m5404c < 2) {
                        f2 = 0.46f / (m5566a + (m5404c * 2));
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1738d && this.f760R.m5554ad() && (m5566a < 5 || m5426a == 0)) {
                    if (m5566a == 0) {
                        f2 = 0.3f;
                    } else if (m5404c < 1) {
                        f2 = 0.1f / (m5566a + (m5404c * 2));
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1737c && (m5566a < 5 || m5426a == 0)) {
                    if (m5566a == 0) {
                        f2 = 0.48f;
                    } else if (m5404c < 2) {
                        f2 = 0.29f / (m5566a + m5404c);
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1740f) {
                    if (m5404c == 0) {
                        f2 = 0.47f;
                    } else if (m5404c < 3) {
                        f2 = 0.35f / m5404c;
                    } else if (m5404c < 4) {
                        f2 = 0.025f / m5404c;
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1759y && m5404c == 0) {
                    f2 = 0.018f;
                }
                if (interfaceC0303as2 == EnumC0249ar.f1762B && m5404c == 0) {
                    f2 = 0.02f;
                }
                if (interfaceC0303as2 == EnumC0249ar.f1741g) {
                    if (m5404c == 0) {
                        f2 = 0.42f;
                    } else if (this.f760R.m5585Y()) {
                        if (m5404c < 4) {
                            f2 = 0.3f / m5404c;
                        }
                    } else if (m5404c < 3) {
                        f2 = 0.3f / m5404c;
                    } else if (m5404c < 4) {
                        f2 = 0.02f / m5404c;
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1770J && this.f760R.f1310o > 2000.0d && m5404c < 5) {
                    if (m5566a == 0) {
                        f2 = 0.11f;
                    } else {
                        f2 = 0.07f / ((0.2f * m5566a) + m5404c);
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.f1764D && ((!m1087A.m1074N() || !m1087A.f6122bX.f5603aO.f5662i) && this.f760R.f1310o > 2200.0d && m5566a < 4)) {
                    if (m5566a == 0) {
                        f2 = 0.06f;
                    } else if (m5404c < 1) {
                        f2 = 0.05f / (m5566a + (m5404c * 2));
                    }
                }
                if (z) {
                    C0453l c0453l2 = (C0453l) interfaceC0303as2;
                    if (!c0453l2.f3156fu && ((m5566a < c0453l2.f3157fv || c0453l2.f3157fv == -1) && (m5404c < c0453l2.f3158fw || c0453l2.f3158fw == -1))) {
                        f2 = c0453l2.f3159fx;
                        if (m5404c < c0453l2.f3160fy) {
                            f2 = c0453l2.f3161fz;
                        }
                        if (m5404c == 0) {
                            f2 += c0453l2.f3162fA;
                        }
                        if (m5566a == 0) {
                            f2 += c0453l2.f3163fB;
                        }
                        if (interfaceC0303as2.mo4467p() && m5428a() == null) {
                            f2 = -2.0f;
                        }
                    }
                }
                if (this.f760R.m5584Z() && interfaceC0303as2 == EnumC0249ar.f1767G && this.f760R.f1310o > 15000.0d) {
                    if (m5566a == 0) {
                        f2 = 0.04f;
                    }
                    if (this.f760R.f1310o > 55000.0d && m5566a == 1) {
                        f2 = 0.03f;
                    }
                }
                if (f2 >= 0.0f && (f2 > f || C0758f.m2136c(0.0f, 1.0f) < 0.01d)) {
                    f = f2;
                    interfaceC0303as = interfaceC0303as2;
                }
            }
        }
        this.f694f = f;
        return interfaceC0303as;
    }

    /* renamed from: a */
    public int m5426a(AbstractC0159d abstractC0159d) {
        int i = 0;
        Iterator it = abstractC0159d.f650c.iterator();
        while (it.hasNext()) {
            i += m5404c(((C0160e) it.next()).f653a);
        }
        return i;
    }

    /* renamed from: c */
    public int m5404c(InterfaceC0303as interfaceC0303as) {
        int i = 0;
        C1112u c1112u = this.f705q;
        AbstractC0244am[] m498a = c1112u.m498a();
        int size = c1112u.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == this.f760R && abstractC0244am.f1689dx == interfaceC0303as && m5424a(abstractC0244am)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public int m5403d() {
        int i = 0;
        C1112u c1112u = this.f705q;
        AbstractC0244am[] m498a = c1112u.m498a();
        int size = c1112u.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == this.f760R && (abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (m5412a(abstractC0623y, false) && !abstractC0623y.f1599bL && abstractC0623y.f3947aA == null && this.f760R.m5523h(abstractC0623y) && this.f760R.m5521i(abstractC0623y)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m5400e() {
        return this.f725K;
    }

    /* renamed from: f */
    public boolean m5399f() {
        return m5395h() != 0;
    }

    /* renamed from: g */
    public AbstractC0244am m5397g() {
        float f = this.f763U + 120.0f;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f6958el + f > this.f761S && abstractC0244am.f6958el - f < this.f761S && abstractC0244am.f6959em + f > this.f762T && abstractC0244am.f6959em - f < this.f762T && abstractC0244am.f1609bV != this.f760R && m5365a(abstractC0244am, 120.0f) && abstractC0244am.f1609bV.m5054c(this.f760R) && this.f760R.m5519j(abstractC0244am)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: h */
    public int m5395h() {
        return m5427a(60.0f);
    }

    /* renamed from: a */
    public int m5427a(float f) {
        int i = 0;
        float f2 = this.f763U + f;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f6958el + f2 > this.f761S && abstractC0244am.f6958el - f2 < this.f761S && abstractC0244am.f6959em + f2 > this.f762T && abstractC0244am.f6959em - f2 < this.f762T && abstractC0244am.f1609bV != this.f760R && m5365a(abstractC0244am, f) && abstractC0244am.f1609bV.m5054c(this.f760R) && abstractC0244am.mo3036l() && this.f760R.m5519j(abstractC0244am)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public void m5394i() {
        Core m1087A = Core.m1087A();
        AbstractC0244am m5397g = m5397g();
        if (m5397g != null) {
            C0749e m2422a = m1087A.f6130cf.m2422a(this.f760R);
            AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
            int size = AbstractC0244am.f1590bD.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m498a[i];
                if (abstractC0244am instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                    if (abstractC0244am.f1609bV == this.f760R && this.f760R.m5535b(abstractC0244am, m5397g) && this.f760R.m5521i(abstractC0623y) && abstractC0623y.m2910aq()) {
                        if (!abstractC0244am.f1599bL) {
                            if (C0136a.m5571a(abstractC0244am, this.f761S, this.f762T, 800.0f)) {
                                m2422a.m2319a(abstractC0623y);
                            }
                        } else if (C0136a.m5571a(abstractC0244am, this.f761S, this.f762T, 540.0f)) {
                            m2422a.m2319a(abstractC0623y);
                        }
                    }
                }
            }
            m2422a.m2321a(m5397g);
        }
    }

    /* renamed from: a */
    public boolean m5424a(AbstractC0244am abstractC0244am) {
        return m5422a(abstractC0244am, false);
    }

    /* renamed from: a */
    public boolean m5422a(AbstractC0244am abstractC0244am, boolean z) {
        if ((abstractC0244am instanceof AbstractC0623y) && ((AbstractC0623y) abstractC0244am).f3948aB == this) {
            if (!z || m5363b(abstractC0244am)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m5412a(AbstractC0623y abstractC0623y, boolean z) {
        if (abstractC0623y.f3948aB == this) {
            if (!z || m5363b(abstractC0623y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public int m5393j() {
        int i = 0;
        Iterator it = m5392k().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (this.f760R != abstractC0244am.f1609bV && abstractC0244am.f1609bV.m5054c(this.f760R) && (abstractC0244am instanceof AbstractC0623y) && m5363b(abstractC0244am)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: k */
    public C0541f m5392k() {
        return Core.m1087A().f6127cc.m3250b(this.f761S, this.f762T, this.f763U);
    }

    /* renamed from: x */
    private AbstractC0623y m5381x() {
        return m5420a((InterfaceC0303as) null, (PointF) null, true);
    }

    /* renamed from: y */
    private AbstractC0623y m5380y() {
        return m5398f(null);
    }

    /* renamed from: f */
    private AbstractC0623y m5398f(InterfaceC0303as interfaceC0303as) {
        return m5420a(interfaceC0303as, (PointF) null, false);
    }

    /* renamed from: a */
    private AbstractC0623y m5420a(InterfaceC0303as interfaceC0303as, PointF pointF, boolean z) {
        if (this.f725K == 0) {
            return null;
        }
        this.f713y = 0;
        float f = Float.MAX_VALUE;
        AbstractC0623y abstractC0623y = null;
        Core m1087A = Core.m1087A();
        if (interfaceC0303as != null && ((m1087A.f6228ar && !interfaceC0303as.mo4487C()) || interfaceC0303as.mo4463w())) {
            return null;
        }
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && m5424a(abstractC0244am) && abstractC0244am.f1651cL == null && abstractC0244am.m4770aj() && (abstractC0244am instanceof AbstractC0623y) && this.f760R.m5521i(abstractC0244am)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                if (C0161f.m5470a(abstractC0623y2) && (!z || abstractC0623y2.mo3057I())) {
                    this.f713y++;
                    if (interfaceC0303as == null || abstractC0623y2.m2890b(interfaceC0303as, true)) {
                        boolean z2 = false;
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = C0758f.m2209a(pointF.f227a, pointF.f228b, abstractC0244am.f6958el, abstractC0244am.f6959em);
                        }
                        if (abstractC0623y == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (C0758f.m2136c(0.0f, 1.0f) < 0.2d) {
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
    private AbstractC0623y m5423a(AbstractC0244am abstractC0244am, PointF pointF, boolean z) {
        if (this.f726L == 0) {
            return null;
        }
        float f = Float.MAX_VALUE;
        AbstractC0623y abstractC0623y = null;
        Core.m1087A();
        AbstractC0244am[] m498a = this.f705q.m498a();
        int size = this.f705q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am2 = m498a[i];
            if (abstractC0244am2.f1609bV == this.f760R && m5424a(abstractC0244am2) && abstractC0244am2.f1651cL == null) {
                InterfaceC0303as mo1758r = abstractC0244am2.mo1758r();
                if (mo1758r.mo4469n() && (abstractC0244am2 instanceof AbstractC0623y) && this.f760R.m5521i(abstractC0244am2)) {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am2;
                    if (C0161f.m5467b(abstractC0623y2) && ((!z || abstractC0623y2.mo3057I()) && (abstractC0244am == null || abstractC0623y2.m4652h(abstractC0244am, true)))) {
                        boolean z2 = false;
                        if (mo1758r instanceof C0453l) {
                            C0453l c0453l = (C0453l) mo1758r;
                            if (c0453l.f3167fF != null && !m5416a(c0453l.f3167fF)) {
                            }
                        }
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = C0758f.m2209a(pointF.f227a, pointF.f228b, abstractC0244am2.f6958el, abstractC0244am2.f6959em);
                        }
                        if (abstractC0623y == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (C0758f.m2136c(0.0f, 1.0f) < 0.2d) {
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
    private boolean m5396g(InterfaceC0303as interfaceC0303as) {
        PointF e;
        AbstractC0623y m5420a;
        this.f714z = interfaceC0303as;
        this.f715A = null;
        this.f716B = null;
        Core m1087A = Core.m1087A();
        if (interfaceC0303as.mo4467p()) {
            e = m5428a();
        } else {
            e = m5359e(interfaceC0303as);
        }
        if (e == null || (m5420a = m5420a(interfaceC0303as, e, false)) == null) {
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
        AbstractC0224s m2970a = m5420a.m2970a(interfaceC0303as, true);
        if (m2970a != null) {
            i = m2970a.mo4860t();
        } else {
            Core.m998b("buildBuilding: could not find getBuildUnitAction for builder this shouldn't happen:" + interfaceC0303as.mo4474i());
        }
        if (!m2970a.mo3084b(m5420a) || !m2970a.mo3086a((AbstractC0244am) m5420a, false)) {
            if (!this.f760R.m5564a(m2970a.mo4866B(), m5420a)) {
                this.f715A = m2970a.mo4866B();
                this.f716B = this.f715A.m4083i(m5420a);
                return true;
            }
            return true;
        } else if (m2970a.m4919A()) {
            C0749e m2422a = m1087A.f6130cf.m2422a(this.f760R);
            m2422a.m2319a(m5420a);
            m2422a.m2323a(m2970a.m4910N(), e, (AbstractC0244am) null);
            return true;
        } else {
            C0749e m2422a2 = m1087A.f6130cf.m2422a(this.f760R);
            m2422a2.m2319a(m5420a);
            m2422a2.m2328a(e.f227a, e.f228b, interfaceC0303as, i);
            return true;
        }
    }

    /* renamed from: z */
    private boolean m5379z() {
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && m5424a(abstractC0244am) && abstractC0244am.m4751bS() && !abstractC0244am.mo1756u() && (abstractC0244am instanceof AbstractC0623y) && ((AbstractC0623y) abstractC0244am).m2918ai()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m5416a(C0449h c0449h) {
        C0449h m4676dc;
        AbstractC0244am[] m498a = this.f705q.m498a();
        int size = this.f705q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && abstractC0244am.m4751bS() && (m4676dc = abstractC0244am.m4676dc()) != null && C0448g.m3960a(c0449h, m4676dc)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private AbstractC0623y m5417a(InterfaceC0303as interfaceC0303as, boolean z, boolean z2) {
        AbstractC0244am[] m498a = this.f705q.m498a();
        int size = this.f705q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && abstractC0244am.m4751bS() && this.f760R.m5521i(abstractC0244am) && (abstractC0244am instanceof InterfaceC0501l) && (abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                InterfaceC0501l interfaceC0501l = (InterfaceC0501l) abstractC0244am;
                AbstractC0224s m4661e = abstractC0244am.m4661e(interfaceC0303as);
                if (m4661e != null && ((interfaceC0501l.mo3432dv() || !z) && !m4661e.m4879m(abstractC0244am) && m4661e.mo3084b(abstractC0623y) && m4661e.mo3086a((AbstractC0244am) abstractC0623y, false) && ((!(abstractC0244am instanceof C0489e) || interfaceC0303as.mo4470m() || m5383u() <= 2 || this.f707s || !z) && (!z2 || abstractC0623y.f3949aC)))) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m5425a(AbstractC0159d abstractC0159d, boolean z) {
        Iterator it = abstractC0159d.m5480a().iterator();
        while (it.hasNext()) {
            if (m5419a(((C0160e) it.next()).f653a, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m5419a(InterfaceC0303as interfaceC0303as, boolean z) {
        return m5418a(interfaceC0303as, z, 1);
    }

    /* renamed from: a */
    private boolean m5418a(InterfaceC0303as interfaceC0303as, boolean z, int i) {
        if (i < 1) {
            Core.m997b("AI", "buildUnit: quantity cannot be < 1");
            return false;
        }
        AbstractC0623y m5417a = m5417a(interfaceC0303as, true, z);
        if (m5417a == null) {
        }
        if (m5417a == null) {
            return false;
        }
        Core m1087A = Core.m1087A();
        AbstractC0224s e = m5417a.m4661e(interfaceC0303as);
        if (e == null) {
            Core.m997b("AI", "buildUnit: action is null!");
            return false;
        } else if (!e.mo3084b(m5417a)) {
            Core.m997b("AI", "buildUnit: isAvailable==false");
            return false;
        } else if (!e.mo3086a((AbstractC0244am) m5417a, false)) {
            Core.m997b("AI", "buildUnit: isActive==false");
            return false;
        } else if (e.mo4864g(m5417a)) {
            return false;
        } else {
            if (e.mo4863k_() && m1087A.f6228ar) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                C0749e m2422a = m1087A.f6130cf.m2422a(this.f760R);
                m2422a.m2319a(m5417a);
                m2422a.m2324a(e.m4867z());
            }
            return true;
        }
    }

    /* renamed from: l */
    C0164i m5391l() {
        C0164i c0164i;
        float f = -1.0f;
        C0164i c0164i2 = null;
        Iterator it = this.f760R.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0164i) && (c0164i = (C0164i) abstractC0170o) != this && c0164i.m5400e() > 1) {
                float a = c0164i.m5366a(this);
                if (c0164i2 == null || a < f) {
                    f = a;
                    c0164i2 = c0164i;
                }
            }
        }
        return c0164i2;
    }

    /* renamed from: m */
    public void m5390m() {
        AbstractC0623y m5381x;
        Core m1087A = Core.m1087A();
        C0164i m5391l = m5391l();
        if (m5391l != null && m5391l.m5400e() > 1 && (m5381x = m5391l.m5381x()) != null) {
            PointF w = m5357w();
            if (C1117y.m469a(m5381x, w.f227a, w.f228b)) {
                boolean m5572a = this.f760R.m5572a(m5381x, w.f227a, w.f228b);
                if (m5572a || this.f760R.f567aF != 0) {
                    C0749e m2422a = m1087A.f6130cf.m2422a(this.f760R);
                    m2422a.m2319a(m5381x);
                    m2422a.m2329a(w.f227a, w.f228b);
                    this.f696h++;
                    this.f695g = C0758f.m2203a(1800, 2500);
                    if (this.f696h >= 2) {
                        this.f695g += 11000.0f;
                    }
                    m5391l.f725K--;
                    if (!m5572a) {
                        boolean z = true;
                        if (m5381x.f3947aA != null) {
                            if (!m5381x.f3947aA.m5441a()) {
                                m5381x.f3947aA.m5437b(m5381x);
                            } else {
                                z = false;
                                if (!m5381x.f3947aA.f688G.contains(m5381x)) {
                                    m5381x.f3947aA.f688G.add(m5381x);
                                }
                            }
                        }
                        if (z) {
                            C0167l c0167l = new C0167l(this.f760R);
                            c0167l.m5375c(m5381x);
                            c0167l.f761S = w.f227a;
                            c0167l.f762T = w.f228b;
                        }
                        this.f695g = C0758f.m2203a(12000, 14000);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    private AbstractC0244am m5429A() {
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this.f760R && m5422a(abstractC0244am, true) && abstractC0244am.m4758bI() && (abstractC0244am.f1632cs < abstractC0244am.f1633ct - 1.0f || abstractC0244am.f1624ck < 1.0f)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: n */
    public void m5389n() {
        Core.m1087A();
        if (this.f706r.size() == 0 || this.f707s) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            InterfaceC0303as m5473c = this.f760R.f613bz.m5473c();
            if (m5473c != null && m5421a(m5473c) && m5401d(m5473c)) {
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
    public boolean m5401d(com.corrodinggames.rts.game.units.InterfaceC0303as r5) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.p010a.C0164i.m5401d(com.corrodinggames.rts.game.units.as):boolean");
    }

    /* renamed from: o */
    public void m5388o() {
        AbstractC0244am m5386r;
        if (this.f706r.size() != 0 && (m5386r = m5386r()) != null) {
            this.f712x.m5879a(m5386r.f6958el, m5386r.f6959em);
            AbstractC0623y m5423a = m5423a(m5386r, this.f712x, true);
            if (m5423a != null) {
                m5414a(m5423a, m5386r);
            }
        }
    }

    /* renamed from: q */
    public void m5387q() {
        AbstractC0623y abstractC0623y;
        C0305au m2909ar;
        AbstractC0244am m4434i;
        if (this.f706r.size() != 0 && this.f716B != null) {
            AbstractC0244am[] m498a = this.f705q.m498a();
            int size = this.f705q.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m498a[i];
                if (abstractC0244am.f1609bV == this.f760R && m5424a(abstractC0244am) && abstractC0244am.f1651cL == null && abstractC0244am.mo1758r().mo4469n() && (abstractC0244am instanceof AbstractC0623y) && this.f760R.m5521i(abstractC0244am) && C0758f.m2136c(0.0f, 1.0f) <= 0.3d && (m2909ar = (abstractC0623y = (AbstractC0623y) abstractC0244am).m2909ar()) != null && m2909ar.m4444d() == EnumC0306av.f1817g && (m4434i = m2909ar.m4434i()) != null && m4434i.mo3352g() > 0.0f && !this.f716B.m4092c(m4434i.m4722cL())) {
                    m5414a(abstractC0623y, m5386r());
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    public AbstractC0244am m5386r() {
        AbstractC0244am abstractC0244am = null;
        for (int i = 0; i < 20; i++) {
            abstractC0244am = this.f706r.mo497a(C0758f.m2203a(0, this.f706r.size() - 1));
            if (abstractC0244am == null || this.f716B == null || this.f716B.m4092c(abstractC0244am.m4722cL())) {
                break;
            }
        }
        return abstractC0244am;
    }

    /* renamed from: a */
    public void m5414a(AbstractC0623y abstractC0623y, AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        if (abstractC0623y.mo3166g(abstractC0244am, true)) {
            C0749e m2422a = m1087A.f6130cf.m2422a(this.f760R);
            m2422a.m2319a(abstractC0623y);
            m2422a.m2308d(abstractC0244am);
        }
    }

    /* renamed from: s */
    public void m5385s() {
        Core m1087A = Core.m1087A();
        AbstractC0244am m5429A = m5429A();
        if (m5429A != null) {
            this.f712x.m5879a(m5429A.f6958el, m5429A.f6959em);
            AbstractC0623y m5420a = m5420a((InterfaceC0303as) null, this.f712x, true);
            if (m5420a != null && m5420a.mo3172a(m5429A) && m5429A.m4660e(m5420a) < 2) {
                C0749e m2422a = m1087A.f6130cf.m2422a(this.f760R);
                m2422a.m2319a(m5420a);
                m2422a.m2313b(m5429A);
            }
        }
    }

    /* renamed from: b */
    public void m5408b(float f) {
        m5405c(f);
        int i = this.f724J;
        int i2 = this.f723I;
        m5409b();
        this.f702n = m5379z();
        if (this.f702n) {
            this.f703o = true;
        }
        if (i >= 1) {
            m5385s();
        }
        if (this.f727M && this.f723I > 0) {
            m5389n();
            m5387q();
            m5388o();
        }
        if (i < 2 && this.f697i == 0.0f) {
            this.f697i = 300.0f;
            int m5576a = this.f760R.m5576a(this.f760R.f612by, EnumC0157b.f643a);
            if (!this.f707s || m5576a <= 2) {
                boolean z = C0758f.m2203a(0, 100) < 5;
                if (!z && m5425a(this.f760R.f612by, true)) {
                    this.f722H = false;
                    this.f697i = 900.0f;
                } else {
                    if (!z) {
                        this.f722H = true;
                    }
                    if (!this.f707s && this.f710v == 0.0f && i < 1 && this.f695g == 0.0f) {
                        m5390m();
                    }
                }
            }
        }
        int m5393j = m5393j();
        if (i == 0 && i2 == 0) {
            this.f699k += f;
            if (m5393j > 2) {
                this.f699k += 2.0f * f;
            }
            if (m5393j > 5) {
                this.f699k += 4.0f * f;
            }
        } else {
            this.f699k = C0758f.m2211a(this.f699k, f);
        }
        if (this.f699k > 11000.0f) {
            m5358p();
        }
        if (this.f690b == EnumC0165j.f731a && ((i != 0 && i2 != 0) || (i2 > 5 && m5393j == 0))) {
            this.f700l += f;
            if (this.f700l > 2000.0f) {
                this.f690b = EnumC0165j.f733c;
            }
        }
        m5384t();
    }

    /* renamed from: t */
    public void m5384t() {
        if (this.f690b == null) {
            Core.m1046a("fixOverlaps: this.state==null");
            Core.m1046a("id:" + this.f759Q);
            Core.m1046a("x:" + this.f761S);
            Core.m1046a("y:" + this.f762T);
            Core.m1046a("radius:" + this.f763U);
            if (this.f760R != null) {
                Core.m1046a("team:" + this.f760R.f1306k);
                return;
            }
            return;
        }
        Iterator it = this.f760R.f599bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0164i) && abstractC0170o != this) {
                C0164i c0164i = (C0164i) abstractC0170o;
                if (C0758f.m2209a(this.f761S, this.f762T, c0164i.f761S, c0164i.f762T) < 400.0f) {
                    if (c0164i.f690b == null) {
                        Core.m1046a("fixOverlaps: targetBase.state==null");
                    } else if (c0164i.f690b.m5378a() < this.f690b.m5378a()) {
                        c0164i.m5358p();
                    } else {
                        m5358p();
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public int m5383u() {
        return this.f723I;
    }

    /* renamed from: c */
    public void m5405c(float f) {
        this.f723I = 0;
        this.f724J = 0;
        this.f726L = 0;
        this.f725K = 0;
        this.f727M = false;
        this.f706r.clear();
        if (1 != 0) {
            Iterator it = m5392k().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am.mo3352g() > 0.0f && m5363b(abstractC0244am)) {
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
                if (m5412a(abstractC0623y, false) && abstractC0244am2.m4751bS() && this.f760R.m5521i(abstractC0244am2) && !abstractC0244am2.mo1756u()) {
                    InterfaceC0303as mo1758r = abstractC0244am2.mo1758r();
                    if (mo1758r.mo4473j()) {
                        this.f723I++;
                    }
                    if (mo1758r.mo4470m()) {
                        this.f724J++;
                        if (C0161f.m5470a(abstractC0623y)) {
                            this.f725K++;
                        }
                    }
                    if (mo1758r.mo4469n()) {
                        this.f726L++;
                    }
                    if (abstractC0244am2 instanceof InterfaceC0501l) {
                        this.f724J += ((InterfaceC0501l) abstractC0244am2).mo3428h(EnumC0249ar.f1742h);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m5402d(float f) {
        InterfaceC0303as m5406c;
        this.f707s = m5399f();
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
        this.f701m = C0758f.m2211a(this.f701m, f);
        this.f693e = C0758f.m2211a(this.f693e, f);
        this.f695g = C0758f.m2211a(this.f695g, f);
        this.f697i = C0758f.m2211a(this.f697i, f);
        this.f698j = C0758f.m2211a(this.f698j, f);
        if (this.f707s && this.f698j == 0.0f) {
            this.f698j = 100 + (this.f759Q % 15);
            if (!this.f760R.f585aX) {
                m5394i();
            }
        }
        if (this.f693e <= 0.0f) {
            this.f693e = 270 + (this.f759Q % 15);
            if (this.f760R.m5585Y()) {
                this.f693e = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3 + (this.f759Q % 15);
            }
            if (this.f694f < 0.2d) {
                this.f693e += 180.0f;
            }
            if (this.f694f < 0.08d) {
                this.f693e += 180.0f;
            }
            if ((m5380y() != null) && (m5406c = m5406c()) != null && ((this.f694f > 0.8d || this.f760R.m5094a(1300.0d)) && ((this.f694f > 0.4d || this.f760R.m5094a(1700.0d)) && ((this.f694f > 0.2d || this.f760R.m5094a(2100.0d)) && ((this.f694f > 0.1d || this.f760R.m5094a(2800.0d)) && ((this.f694f > 0.05d || this.f760R.m5094a(3100.0d)) && (this.f694f > 0.01d || this.f760R.m5094a(4800.0d)))))))) {
                this.f717C++;
                if (!m5396g(m5406c)) {
                    this.f693e -= 120.0f;
                    this.f718D++;
                }
            }
        }
        float m5383u = m5383u() / 3.0f;
        if (m5383u < 1.0f) {
            m5383u = 1.0f;
        }
        if (this.f707s) {
            this.f692d = (float) (this.f692d + (f * 0.015d));
        }
        if (this.f694f < 0.6d) {
            if (this.f760R.f588ba < 2) {
                this.f692d = (float) (this.f692d + (f * 7.0E-4d * m5383u));
            } else if (this.f760R.m5094a(1200.0d)) {
                this.f692d = (float) (this.f692d + (f * 1.0E-4d * m5383u));
            }
            if (this.f760R.m5094a(1600.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.001d));
            }
            if (this.f760R.m5094a(2200.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.001d));
            }
            if (this.f760R.m5094a(2600.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.001d));
            }
            if (this.f760R.m5094a(8000.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.005d));
            }
            if (this.f760R.m5094a(9000.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.01d));
            }
            if (this.f760R.m5094a(10100.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.01d));
            }
            if (this.f760R.m5094a(30000.0d)) {
                this.f692d = (float) (this.f692d + (f * 0.05d));
            }
        }
        if (this.f760R.m5094a(5000.0d)) {
            this.f692d = (float) (this.f692d + (f * 0.001d));
        }
        if (!this.f760R.m5094a(800.0d) && !this.f707s && this.f692d > 1.2f) {
            this.f692d = 1.2f;
        }
        if (this.f692d > 3.5f) {
            this.f692d = 3.5f;
        }
        for (int i = 0; i < 12; i++) {
            m5382v();
            if (this.f692d < 3.0f) {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m5410a(ArrayList arrayList, AbstractC0159d abstractC0159d, EnumC0246ao enumC0246ao, int i) {
        this.f728N.clear();
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0303as m5479a = abstractC0159d.m5479a(enumC0246ao);
            if (m5479a != null && !this.f728N.contains(m5479a)) {
                this.f728N.add(m5479a);
            }
        }
        arrayList.addAll(this.f728N);
    }

    /* renamed from: v */
    public void m5382v() {
        EnumC0246ao enumC0246ao;
        AbstractC0244am m5397g;
        int m5403d = m5403d();
        int i = 12;
        int i2 = 50;
        if (this.f760R.m5585Y()) {
            i2 = 65;
            i = 16;
        }
        boolean a = this.f760R.m5094a(25000.0d);
        ArrayList arrayList = new ArrayList();
        boolean m5553ae = this.f760R.m5553ae();
        boolean m5552af = this.f760R.m5552af();
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
        float m2136c = C0758f.m2136c(0.0f, 1.0f);
        if (m2136c < f) {
            enumC0246ao = EnumC0246ao.f1704b;
        } else if (m2136c < f + f2) {
            enumC0246ao = EnumC0246ao.f1708f;
        } else {
            enumC0246ao = EnumC0246ao.f1706d;
        }
        if ((this.f760R.m5094a(1300.0d) && this.f692d >= 1.0f) || (this.f760R.m5094a(300.0d) && this.f692d >= 3.0f)) {
            if (this.f760R.m5554ad() && this.f760R.f589bb < i && C0758f.m2133c(100) < 35) {
                m5410a(arrayList, this.f760R.f607bt, null, 2);
                if (a) {
                }
            }
            if (m5403d < 3 && this.f760R.f587aZ < i2) {
                if (enumC0246ao == EnumC0246ao.f1704b) {
                    m5410a(arrayList, this.f760R.f604bq, null, 4);
                    if (a) {
                    }
                } else if (enumC0246ao == EnumC0246ao.f1708f) {
                    m5410a(arrayList, this.f760R.f605br, null, 4);
                    if (a) {
                    }
                } else {
                    m5410a(arrayList, this.f760R.f606bs, null, 4);
                    if (a) {
                    }
                }
            }
            if (this.f692d >= 1.0f && m5553ae && this.f701m == 0.0f) {
                int m5576a = this.f760R.m5576a(this.f760R.f610bw, EnumC0157b.f643a);
                int m5576a2 = m5576a + this.f760R.m5576a(this.f760R.f611bx, EnumC0157b.f643a);
                int m5547ak = this.f760R.m5547ak();
                if ((this.f760R.m5094a(1700.0d) || m5547ak > 10 || (this.f760R.f598bk == 0 && m5547ak >= 1 && m5576a == 0)) && (m5576a2 < 3 || (m5547ak > 20 && m5576a2 < 5))) {
                    if (m5552af && m5576a2 < 2) {
                        m5410a(arrayList, this.f760R.f609bv, null, 2);
                    } else {
                        m5410a(arrayList, this.f760R.f609bv, EnumC0246ao.f1706d, 2);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            this.f720F++;
        }
        while (arrayList.size() != 0) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) arrayList.remove(arrayList.size() - 1);
            AbstractC0244am m4763b = AbstractC0244am.m4763b(interfaceC0303as);
            boolean z = true;
            if (this.f707s && C0758f.m2133c(100) < 10 && (m5397g = m5397g()) != null && !this.f760R.m5535b(m4763b, m5397g)) {
                this.f720F++;
                z = false;
            }
            if (z) {
                if (m5419a(interfaceC0303as, false)) {
                    this.f720F++;
                    this.f760R.f617bD.m5485a(interfaceC0303as);
                    this.f692d -= 1.0f;
                    if (this.f760R.m5524g(m4763b)) {
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
    public void m5413a(AbstractC0623y abstractC0623y, C0424b c0424b, boolean z) {
        this.f729O = abstractC0623y.mo1758r();
        if (z) {
            this.f730P = null;
            this.f716B = null;
            return;
        }
        this.f730P = c0424b;
        this.f716B = c0424b.m4083i(abstractC0623y);
    }
}
