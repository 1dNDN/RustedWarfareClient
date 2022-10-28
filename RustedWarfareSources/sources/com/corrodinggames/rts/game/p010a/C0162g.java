package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.p029h.AbstractC0590f;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/g.class */
public class C0162g extends AbstractC0163h {

    /* renamed from: a */
    boolean f656a;

    /* renamed from: b */
    String f657b;

    /* renamed from: c */
    boolean f658c;

    /* renamed from: d */
    boolean f659d;

    /* renamed from: e */
    boolean f660e;

    /* renamed from: f */
    boolean f661f;

    /* renamed from: g */
    AbstractC0623y f662g;

    /* renamed from: h */
    boolean f663h;

    /* renamed from: i */
    int f664i;

    /* renamed from: j */
    int f665j;

    /* renamed from: k */
    C0164i f666k;

    /* renamed from: l */
    float f667l;

    /* renamed from: m */
    float f668m;

    /* renamed from: n */
    float f669n;

    /* renamed from: o */
    float f670o;

    /* renamed from: p */
    float f671p;

    /* renamed from: q */
    boolean f672q;

    /* renamed from: r */
    boolean f673r;

    /* renamed from: s */
    boolean f674s;

    /* renamed from: t */
    float f675t;

    /* renamed from: u */
    float f676u;

    /* renamed from: v */
    boolean f677v;

    /* renamed from: w */
    AbstractC0244am f678w;

    /* renamed from: x */
    float f679x;

    /* renamed from: y */
    float f680y;

    /* renamed from: z */
    float f681z;

    /* renamed from: A */
    int f682A;

    /* renamed from: B */
    boolean f683B;

    /* renamed from: C */
    public int f684C;

    /* renamed from: D */
    public AbstractC0244am f685D;

    /* renamed from: E */
    EnumC0246ao f686E;

    /* renamed from: a */
    public boolean mo4950a() {
        return this.f656a;
    }

    /* renamed from: b */
    public boolean mo4948b() {
        if (!this.f663h) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C0162g m4967a(C0136a c0136a, AbstractC0623y abstractC0623y) {
        C0162g c0162g = new C0162g(c0136a, false);
        c0162g.f656a = true;
        c0162g.f658c = true;
        c0162g.f659d = true;
        c0162g.f660e = true;
        c0162g.f662g = abstractC0623y;
        c0162g.mo4949a(abstractC0623y);
        c0162g.f682A = 0;
        c0162g.m4951k();
        return c0162g;
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1314a(this.f663h);
        streamWriter.WriteInteger(this.f664i);
        streamWriter.WriteInteger(this.f665j);
        streamWriter.WriteInteger(this.f687F.size());
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            streamWriter.mo1369a((AbstractC0623y) it.next());
        }
        streamWriter.mo1355c(7);
        streamWriter.mo1314a(false);
        streamWriter.mo1314a(this.f674s);
        streamWriter.mo1320a(this.f670o);
        streamWriter.WriteInteger(this.f688G.size());
        Iterator it2 = this.f688G.iterator();
        while (it2.hasNext()) {
            streamWriter.mo1369a((AbstractC0623y) it2.next());
        }
        streamWriter.mo1314a(this.f683B);
        streamWriter.mo1314a(this.f656a);
        streamWriter.mo1314a(this.f658c);
        streamWriter.mo1314a(this.f659d);
        streamWriter.mo1314a(this.f660e);
        streamWriter.mo1314a(this.f661f);
        streamWriter.mo1369a(this.f662g);
        streamWriter.WriteInteger(this.f682A);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo4877a(Reader reader) {
        this.f663h = reader.ReadBool();
        this.f664i = reader.ReadInt();
        this.f665j = reader.ReadInt();
        m4940q();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC0623y m1276p = reader.m1276p();
            if (m1276p != null) {
                mo4949a(m1276p);
            }
        }
        byte m1289d = reader.m1289d();
        if (m1289d >= 1) {
            reader.ReadBool();
        }
        if (m1289d >= 2) {
            this.f674s = reader.ReadBool();
        }
        if (m1289d >= 3) {
            this.f670o = reader.m1285g();
        }
        if (m1289d >= 4) {
            this.f688G.clear();
            int ReadInt2 = reader.ReadInt();
            for (int i2 = 0; i2 < ReadInt2; i2++) {
                AbstractC0623y m1276p2 = reader.m1276p();
                if (m1276p2 != null) {
                    this.f688G.add(m1276p2);
                }
            }
        }
        if (m1289d >= 5) {
            this.f683B = reader.ReadBool();
        }
        if (m1289d >= 6) {
            this.f656a = reader.ReadBool();
            this.f658c = reader.ReadBool();
            this.f659d = reader.ReadBool();
            this.f660e = reader.ReadBool();
            this.f661f = reader.ReadBool();
            this.f662g = reader.m1276p();
        }
        if (m1289d >= 7) {
            this.f682A = reader.ReadInt();
        }
        if (!this.f683B) {
            Iterator it = this.f687F.iterator();
            while (it.hasNext()) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
                if (abstractC0623y instanceof AbstractC0590f) {
                    if (abstractC0623y != null && abstractC0623y.f3947aA == this) {
                        abstractC0623y.f3947aA = null;
                    }
                    if (abstractC0623y != null) {
                        this.f688G.remove(abstractC0623y);
                    }
                    it.remove();
                }
            }
        }
        super.mo4877a(reader);
    }

    public C0162g(C0136a c0136a) {
        super(c0136a);
        this.f663h = true;
        this.f667l = 1000.0f;
        this.f668m = 100.0f;
        this.f669n = 4000.0f;
        this.f670o = 0.0f;
        this.f671p = 1000.0f;
        this.f672q = false;
        this.f673r = false;
        this.f674s = false;
        this.f675t = 0.0f;
        this.f676u = 0.0f;
        this.f684C = -9999;
        this.f685D = null;
        this.f686E = EnumC0246ao.f1703a;
    }

    public C0162g(C0136a c0136a, boolean z) {
        this(c0136a);
        this.f663h = z;
    }

    /* renamed from: a */
    protected void mo4949a(AbstractC0623y abstractC0623y) {
        super.mo4949a(abstractC0623y);
        this.f686E = m4952j();
    }

    /* renamed from: c */
    public void m4961c() {
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (!abstractC0244am.f1607bT && abstractC0244am.f1609bV == this.f760R && this.f682A > this.f687F.size() && (abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (!abstractC0623y.f1599bL && !abstractC0623y.f1600bM && abstractC0623y.f3947aA == null && this.f760R.m5013h(abstractC0623y) && this.f760R.m5011i(abstractC0623y)) {
                    if (this.f683B) {
                        if (abstractC0244am.mo2982h() != EnumC0246ao.f1704b) {
                            if (!this.f760R.m5062a(abstractC0623y, this.f761S, this.f762T) || (!mo4948b() && C0758f.m2151a(0, 100) <= 2)) {
                                mo4949a(abstractC0623y);
                            }
                        }
                    } else if (abstractC0244am.mo2982h() != EnumC0246ao.f1707e) {
                        if (!this.f760R.m5062a(abstractC0623y, this.f761S, this.f762T)) {
                        }
                        mo4949a(abstractC0623y);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m4960d() {
        if (this.f682A <= this.f687F.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0244am m4969a(float f) {
        if (LoggerMaybe.m1072A().f6102by - (f * 1000.0f) < this.f684C) {
            return this.f685D;
        }
        return null;
    }

    /* renamed from: e */
    public AbstractC0244am m4958e() {
        AbstractC0244am m4969a = m4969a(6.0f);
        if (m4969a != null) {
            return m4969a;
        }
        return null;
    }

    /* renamed from: f */
    public AbstractC0244am m4956f() {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0244am m2869ab = ((AbstractC0623y) it.next()).m2869ab();
            if (m2869ab != null) {
                return m2869ab;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m4964a(C0749e c0749e, boolean z, AbstractC0244am abstractC0244am) {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (!z || abstractC0623y.m2854aq()) {
                if (abstractC0244am == null || this.f760R.m5060a(abstractC0623y, abstractC0244am)) {
                    c0749e.m2267a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: a */
    public void m4963a(String str) {
        this.f657b = str;
    }

    /* renamed from: a */
    public PointF m4966a(AbstractC0244am abstractC0244am) {
        PointF pointF = new PointF();
        pointF.f227a = this.f761S;
        pointF.f228b = this.f762T;
        float random = (float) (Math.random() * 360.0d);
        float m2084c = C0758f.m2084c(50.0f, 100.0f);
        pointF.f227a += C0758f.m2040i(random) * m2084c;
        pointF.f228b += C0758f.m2045h(random) * m2084c;
        if (abstractC0244am != null) {
            float m2071d = C0758f.m2071d(pointF.f227a, pointF.f228b, abstractC0244am.f6957el, abstractC0244am.f6958em);
            float m2084c2 = C0758f.m2084c(100.0f, 200.0f);
            pointF.f227a += C0758f.m2040i(m2071d) * (-m2084c2);
            pointF.f228b += C0758f.m2045h(m2071d) * (-m2084c2);
        }
        return pointF;
    }

    /* renamed from: b */
    public void mo4947b(float f) {
        AbstractC0244am m4958e;
        super.mo4947b(f);
        m4942n();
        this.f686E = m4952j();
        if (!this.f661f && (m4958e = m4958e()) != null && m4956f() == null) {
            if (m4965a(m4958e, false)) {
                m4963a("fighting attacker");
                C0749e m2370a = LoggerMaybe.m1072A().f6130cf.m2370a(this.f760R);
                m4964a(m2370a, true, m4958e);
                m2370a.m2275a(m4958e.f6957el, m4958e.f6958em, false);
                return;
            }
            m4963a("flight from attacker");
            PointF m4966a = m4966a(m4958e);
            this.f761S = m4966a.f227a;
            this.f762T = m4966a.f228b;
            if (this.f681z > 200.0f) {
                this.f681z = 200.0f;
            }
        }
    }

    /* renamed from: c */
    public void mo4945c(float f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f679x += f;
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y != null && this.f684C < abstractC0623y.f1578br) {
                this.f684C = abstractC0623y.f1578br;
                this.f685D = abstractC0623y.f1579bs;
            }
        }
        m4942n();
        if (m4960d()) {
            this.f667l = C0758f.m2159a(this.f667l, f);
        } else if (this.f677v) {
        }
        this.f680y = C0758f.m2159a(this.f680y, f);
        this.f681z = C0758f.m2159a(this.f681z, f);
        this.f671p = C0758f.m2159a(this.f671p, f);
        if (!this.f677v && !this.f673r && !m4960d() && this.f680y == 0.0f) {
            this.f680y = 200 + C0758f.m2081c(200);
            m4961c();
        }
        if (!this.f677v || this.f672q) {
            if (!this.f672q) {
                this.f669n = C0758f.m2159a(this.f669n, f);
                if (this.f669n == 0.0f) {
                    if (this.f666k == null) {
                        this.f666k = m4955g();
                    }
                    if (this.f666k != null) {
                        PointF w = this.f666k.m4870w();
                        if (!m4968a(w.f227a, w.f228b)) {
                            this.f669n = 100.0f;
                            m4963a("random move: bad target");
                        } else {
                            this.f669n = 4000.0f;
                            this.f761S = w.f227a;
                            this.f762T = w.f228b;
                            m4963a("random move");
                        }
                    } else {
                        m4963a("random move: no linked base");
                    }
                }
            }
            if (this.f681z == 0.0f) {
                this.f681z = 800.0f;
                C0749e m2370a = m1072A.f6130cf.m2370a(this.f760R);
                Iterator it2 = this.f687F.iterator();
                while (it2.hasNext()) {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
                    boolean z = true;
                    if (m4874c(abstractC0623y2) < 28900.0f) {
                        z = false;
                    }
                    if (!this.f661f && abstractC0623y2.m2861aj() && !abstractC0623y2.m2854aq()) {
                        z = false;
                    }
                    if (z) {
                        m2370a.m2267a(abstractC0623y2);
                    }
                }
                if (this.f661f) {
                    m2370a.m2277a(this.f761S, this.f762T);
                } else {
                    m2370a.m2262b(this.f761S, this.f762T);
                }
            }
        }
        if (this.f663h) {
            m4957e(f);
        } else {
            m4959d(f);
        }
        if (this.f682A == 0 && this.f687F.size() == 0) {
            mo4871p();
        }
        if (this.f658c) {
            if (this.f662g == null || this.f662g.f1607bT) {
                mo4871p();
            }
        }
    }

    /* renamed from: g */
    C0164i m4955g() {
        float f = -1.0f;
        C0164i c0164i = null;
        Iterator it = this.f760R.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                if (m4962b(c0164i2.f761S, c0164i2.f762T)) {
                    float d = c0164i2.m4873d(this.f761S, this.f762T);
                    if (c0164i == null || d < f) {
                        f = d;
                        c0164i = c0164i2;
                    }
                }
            }
        }
        return c0164i;
    }

    /* renamed from: d */
    public void m4959d(float f) {
        if (this.f666k == null || this.f666k.f764V) {
            m4951k();
        }
        if (this.f658c && this.f662g != null) {
            if (this.f660e && !this.f661f) {
                if (this.f662g.f1632cs / this.f662g.f1633ct < 0.5d) {
                    this.f661f = true;
                    if (this.f681z > 100.0f) {
                        this.f681z = 100.0f;
                    }
                }
                if (this.f678w == null) {
                    m4951k();
                }
            } else {
                if (this.f662g.f1632cs / this.f662g.f1633ct > 0.6d) {
                    this.f661f = false;
                }
                boolean z = false;
                if (this.f666k != null && !this.f666k.f708t) {
                    z = true;
                }
                if (!z) {
                    C0164i m5059a = this.f760R.m5059a(this.f662g.mo2982h(), this.f662g.f6957el, this.f662g.f6958em, true);
                    if (m5059a != null) {
                        this.f666k = m5059a;
                    }
                    if (this.f666k != null) {
                        PointF w = this.f666k.m4870w();
                        this.f761S = w.f227a;
                        this.f762T = w.f228b;
                        if (this.f681z > 100.0f) {
                            this.f681z = 100.0f;
                        }
                        m4963a("moving to new base");
                    }
                }
            }
        }
        if (this.f666k != null) {
            for (int i = 0; i < 2; i++) {
                if (this.f671p == 0.0f) {
                    AbstractC0244am m4908g = this.f666k.m4908g();
                    if (m4908g == null) {
                        break;
                    } else if (m4965a(m4908g, false)) {
                        this.f678w = m4908g;
                        this.f671p = 500.0f;
                        this.f669n = 2000.0f;
                        if (!this.f661f) {
                            this.f761S = m4908g.f6957el;
                            this.f762T = m4908g.f6958em;
                        }
                        if (this.f681z > 100.0f) {
                            this.f681z = 100.0f;
                        }
                        m4963a("defending base");
                    }
                }
            }
            if (this.f671p == 0.0f) {
                this.f661f = false;
                this.f678w = null;
            }
        }
    }

    /* renamed from: e */
    public void m4957e(float f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!this.f677v) {
            if (this.f667l == 0.0f) {
                this.f677v = true;
                this.f672q = true;
            }
        } else {
            if (this.f678w == null || !this.f678w.m4396bS() || this.f678w.f1607bT || !this.f673r) {
                this.f678w = this.f760R.m5033ao();
                if (this.f678w != null && !m4965a(this.f678w, true)) {
                    this.f678w = null;
                }
            }
            if (this.f678w != null) {
                if (this.f672q) {
                    this.f676u += f;
                    if (!this.f673r) {
                        this.f675t = C0758f.m2159a(this.f675t, f);
                        if (this.f675t == 0.0f) {
                            this.f675t = 20.0f;
                            m4954h();
                        }
                    } else {
                        boolean z = false;
                        Iterator it = this.f687F.iterator();
                        while (it.hasNext()) {
                            if (m4874c((AbstractC0623y) it.next()) > 28900.0f) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f672q = false;
                        }
                        Iterator it2 = this.f687F.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0623y) it2.next()).f1578br > m1072A.f6102by - 1000) {
                                this.f672q = false;
                                m4963a("Not staging due to damage");
                            }
                        }
                    }
                    if (this.f676u > 17000.0f) {
                        this.f672q = false;
                        m4963a("attacking target");
                    }
                } else {
                    this.f670o += f;
                    if (this.f681z == 0.0f) {
                        this.f681z = 800.0f;
                        boolean z2 = false;
                        AbstractList c1101m = new C1101m();
                        Iterator it3 = this.f687F.iterator();
                        while (it3.hasNext()) {
                            AbstractC0623y abstractC0623y = (AbstractC0623y) it3.next();
                            boolean z3 = true;
                            if (this.f678w != null) {
                                if (!this.f760R.m5060a(abstractC0623y, this.f678w)) {
                                    z3 = false;
                                }
                                if (z3 && !C0248aq.m4287a(abstractC0623y, this.f678w)) {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                z2 = true;
                                c1101m.add(abstractC0623y);
                            }
                        }
                        if (!z2) {
                            this.f672q = false;
                            m4963a("cannot reach main target");
                        } else {
                            C0749e m2370a = m1072A.f6130cf.m2370a(this.f760R);
                            m2370a.m2264a(c1101m);
                            if (this.f678w != null && C0758f.m2151a(0, 100) < 80) {
                                m2370a.m2275a(this.f678w.f6957el, this.f678w.f6958em, true);
                            } else {
                                m2370a.m2268a(this.f678w, true);
                            }
                            m4963a("attacking main target");
                        }
                    }
                }
            }
        }
        if (this.f677v) {
            if (this.f687F.size() == 0) {
                mo4871p();
            }
            if (this.f670o > 1000.0f && this.f687F.size() < 3) {
                mo4871p();
            }
            if (this.f670o > 11000.0f) {
                mo4871p();
            }
        }
    }

    /* renamed from: h */
    public void m4954h() {
        float f = this.f678w.f6957el;
        float f2 = this.f678w.f6958em;
        float m2071d = C0758f.m2071d(f, f2, this.f761S, this.f762T);
        float m2105b = C0758f.m2105b(f, f2, this.f761S, this.f762T);
        if (C0758f.m2151a(0, 100) < 80) {
            m2071d += C0758f.m2151a(-110, 110);
        }
        int i = (int) (m2105b * 0.6d);
        if (i < 720) {
            i = 720;
        }
        float m2151a = C0758f.m2151a(50, i);
        if (C0758f.m2151a(0, 100) < 80 && m2151a < 450.0f) {
            m2151a = C0758f.m2151a(450, i);
        }
        float m2040i = f + (C0758f.m2040i(m2071d) * m2151a);
        float m2045h = f2 + (C0758f.m2045h(m2071d) * m2151a);
        boolean z = true;
        if (!m4968a(m2040i, m2045h)) {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = false;
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y.mo2982h() == EnumC0246ao.f1704b) {
                z2 = true;
            }
            if (abstractC0623y.mo2982h() == EnumC0246ao.f1707e) {
                z3 = true;
            }
        }
        if (z2) {
            if (this.f760R.f567aF == 0 && !m4962b(m2040i, m2045h)) {
                z = false;
            }
            if (!this.f760R.m5072a(m2040i, m2045h, this.f678w.f6957el, this.f678w.f6958em, EnumC0246ao.f1704b) && C0758f.m2151a(0, 100) < 98) {
                z = false;
            }
        }
        if (z3) {
            if (!m4962b(m2040i, m2045h)) {
                z = false;
            }
            if (!this.f760R.m5072a(m2040i, m2045h, this.f678w.f6957el, this.f678w.f6958em, EnumC0246ao.f1707e)) {
                z = false;
            }
        }
        if (z) {
            this.f761S = m2040i;
            this.f762T = m2045h;
            this.f681z = 0.0f;
            this.f673r = true;
            this.f688G.clear();
            Iterator it2 = this.f687F.iterator();
            while (it2.hasNext()) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
                if (abstractC0623y2.mo2982h() != EnumC0246ao.f1707e && !this.f760R.m5062a(abstractC0623y2, this.f761S, this.f762T)) {
                    this.f688G.add(abstractC0623y2);
                }
            }
        }
    }

    /* renamed from: i */
    public EnumC0246ao m4953i() {
        return this.f686E;
    }

    /* renamed from: j */
    public EnumC0246ao m4952j() {
        if (this.f687F.size() == 0) {
            if (this.f683B) {
                return EnumC0246ao.f1707e;
            }
            return EnumC0246ao.f1704b;
        }
        boolean z = true;
        Iterator it = this.f687F.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((AbstractC0623y) it.next()).mo2982h() != EnumC0246ao.f1706d) {
                z = false;
                break;
            }
        }
        if (z) {
            return EnumC0246ao.f1706d;
        }
        if (this.f683B) {
            boolean z2 = true;
            Iterator it2 = this.f687F.iterator();
            while (it2.hasNext()) {
                if (((AbstractC0623y) it2.next()).mo2982h() == EnumC0246ao.f1707e) {
                    z2 = false;
                }
            }
            if (z2) {
                return EnumC0246ao.f1708f;
            }
            return EnumC0246ao.f1707e;
        }
        boolean z3 = true;
        Iterator it3 = this.f687F.iterator();
        while (it3.hasNext()) {
            EnumC0246ao h = ((AbstractC0623y) it3.next()).mo2982h();
            if (h == EnumC0246ao.f1704b || h == EnumC0246ao.f1709g) {
                z3 = false;
            }
        }
        if (z3) {
            return EnumC0246ao.f1708f;
        }
        return EnumC0246ao.f1704b;
    }

    /* renamed from: a */
    public boolean m4968a(float f, float f2) {
        return !C1117y.m476a(f, f2, m4953i());
    }

    /* renamed from: b */
    public boolean m4962b(float f, float f2) {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            if (!this.f760R.m5062a((AbstractC0623y) it.next(), f, f2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m4965a(AbstractC0244am abstractC0244am, boolean z) {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (z || this.f760R.m5062a(abstractC0623y, abstractC0244am.f6957el, abstractC0244am.f6958em)) {
                if (C0248aq.m4287a(abstractC0623y, abstractC0244am)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m4951k() {
        PointF pointF = null;
        if (this.f658c && this.f662g != null) {
            this.f761S = this.f662g.f6957el;
            this.f762T = this.f662g.f6958em;
            this.f666k = this.f760R.m5024c(this.f662g.f6957el, this.f662g.f6958em);
            return;
        }
        if (1 != 0) {
            int i = 0;
            while (i < 7) {
                boolean z = i > 3;
                if (pointF == null) {
                    Iterator it = this.f760R.f600bm.iterator();
                    while (it.hasNext()) {
                        AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
                        if (abstractC0170o instanceof C0164i) {
                            C0164i c0164i = (C0164i) abstractC0170o;
                            if (c0164i.f690b == EnumC0165j.f733c && (c0164i.m4894u() > 2 || z)) {
                                if (pointF == null || C0758f.m2081c(this.f760R.f559ax + 2) == 0) {
                                    for (int i2 = 0; i2 < 10; i2++) {
                                        if (pointF == null) {
                                            PointF w = c0164i.m4870w();
                                            if (m4968a(w.f227a, w.f228b)) {
                                                pointF = w;
                                            }
                                        }
                                    }
                                    this.f666k = c0164i;
                                }
                            }
                        }
                    }
                }
                i++;
            }
        }
        if (pointF == null) {
            pointF = this.f760R.m5039ai();
            this.f666k = null;
        }
        this.f761S = pointF.f227a;
        this.f762T = pointF.f228b;
    }
}
