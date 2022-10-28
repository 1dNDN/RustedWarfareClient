package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.p029h.AbstractC0590f;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
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
    public boolean m5466a() {
        return this.f656a;
    }

    /* renamed from: b */
    public boolean m5456b() {
        if (!this.f663h) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C0162g m5463a(C0136a c0136a, AbstractC0623y abstractC0623y) {
        C0162g c0162g = new C0162g(c0136a, false);
        c0162g.f656a = true;
        c0162g.f658c = true;
        c0162g.f659d = true;
        c0162g.f660e = true;
        c0162g.f662g = abstractC0623y;
        c0162g.m5460a(abstractC0623y);
        c0162g.f682A = 0;
        c0162g.m5442k();
        return c0162g;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f663h);
        streamWriter.WriteInteger(this.f664i);
        streamWriter.WriteInteger(this.f665j);
        streamWriter.WriteInteger(this.f687F.size());
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            streamWriter.m1419a((AbstractC0623y) it.next());
        }
        streamWriter.m1401c(7);
        streamWriter.mo1329a(false);
        streamWriter.mo1329a(this.f674s);
        streamWriter.mo1335a(this.f670o);
        streamWriter.WriteInteger(this.f688G.size());
        Iterator it2 = this.f688G.iterator();
        while (it2.hasNext()) {
            streamWriter.m1419a((AbstractC0623y) it2.next());
        }
        streamWriter.mo1329a(this.f683B);
        streamWriter.mo1329a(this.f656a);
        streamWriter.mo1329a(this.f658c);
        streamWriter.mo1329a(this.f659d);
        streamWriter.mo1329a(this.f660e);
        streamWriter.mo1329a(this.f661f);
        streamWriter.m1419a(this.f662g);
        streamWriter.WriteInteger(this.f682A);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m5458a(Reader reader) {
        this.f663h = reader.ReadBool();
        this.f664i = reader.ReadInt();
        this.f665j = reader.ReadInt();
        m5430q();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC0623y m1291p = reader.m1291p();
            if (m1291p != null) {
                m5460a(m1291p);
            }
        }
        byte m1304d = reader.m1304d();
        if (m1304d >= 1) {
            reader.ReadBool();
        }
        if (m1304d >= 2) {
            this.f674s = reader.ReadBool();
        }
        if (m1304d >= 3) {
            this.f670o = reader.m1300g();
        }
        if (m1304d >= 4) {
            this.f688G.clear();
            int ReadInt2 = reader.ReadInt();
            for (int i2 = 0; i2 < ReadInt2; i2++) {
                AbstractC0623y m1291p2 = reader.m1291p();
                if (m1291p2 != null) {
                    this.f688G.add(m1291p2);
                }
            }
        }
        if (m1304d >= 5) {
            this.f683B = reader.ReadBool();
        }
        if (m1304d >= 6) {
            this.f656a = reader.ReadBool();
            this.f658c = reader.ReadBool();
            this.f659d = reader.ReadBool();
            this.f660e = reader.ReadBool();
            this.f661f = reader.ReadBool();
            this.f662g = reader.m1291p();
        }
        if (m1304d >= 7) {
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
        super.m5364a(reader);
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
    protected void m5460a(AbstractC0623y abstractC0623y) {
        super.m5440a(abstractC0623y);
        this.f686E = m5443j();
    }

    /* renamed from: c */
    public void m5453c() {
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (!abstractC0244am.f1607bT && abstractC0244am.f1609bV == this.f760R && this.f682A > this.f687F.size() && (abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (!abstractC0623y.f1599bL && !abstractC0623y.f1600bM && abstractC0623y.f3947aA == null && this.f760R.m5523h(abstractC0623y) && this.f760R.m5521i(abstractC0623y)) {
                    if (this.f683B) {
                        if (abstractC0244am.mo3039h() != EnumC0246ao.f1704b) {
                            if (!this.f760R.m5572a(abstractC0623y, this.f761S, this.f762T) || (!m5456b() && C0758f.m2203a(0, 100) <= 2)) {
                                m5460a(abstractC0623y);
                            }
                        }
                    } else if (abstractC0244am.mo3039h() != EnumC0246ao.f1707e) {
                        if (!this.f760R.m5572a(abstractC0623y, this.f761S, this.f762T)) {
                        }
                        m5460a(abstractC0623y);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m5451d() {
        if (this.f682A <= this.f687F.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0244am m5465a(float f) {
        if (Core.m1087A().f6102by - (f * 1000.0f) < this.f684C) {
            return this.f685D;
        }
        return null;
    }

    /* renamed from: e */
    public AbstractC0244am m5449e() {
        AbstractC0244am m5465a = m5465a(6.0f);
        if (m5465a != null) {
            return m5465a;
        }
        return null;
    }

    /* renamed from: f */
    public AbstractC0244am m5447f() {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0244am m2925ab = ((AbstractC0623y) it.next()).m2925ab();
            if (m2925ab != null) {
                return m2925ab;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m5459a(C0749e c0749e, boolean z, AbstractC0244am abstractC0244am) {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (!z || abstractC0623y.m2910aq()) {
                if (abstractC0244am == null || this.f760R.m5570a(abstractC0623y, abstractC0244am)) {
                    c0749e.m2319a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: a */
    public void m5457a(String str) {
        this.f657b = str;
    }

    /* renamed from: a */
    public PointF m5462a(AbstractC0244am abstractC0244am) {
        PointF pointF = new PointF();
        pointF.f227a = this.f761S;
        pointF.f228b = this.f762T;
        float random = (float) (Math.random() * 360.0d);
        float m2136c = C0758f.m2136c(50.0f, 100.0f);
        pointF.f227a += C0758f.m2092i(random) * m2136c;
        pointF.f228b += C0758f.m2097h(random) * m2136c;
        if (abstractC0244am != null) {
            float m2123d = C0758f.m2123d(pointF.f227a, pointF.f228b, abstractC0244am.f6958el, abstractC0244am.f6959em);
            float m2136c2 = C0758f.m2136c(100.0f, 200.0f);
            pointF.f227a += C0758f.m2092i(m2123d) * (-m2136c2);
            pointF.f228b += C0758f.m2097h(m2123d) * (-m2136c2);
        }
        return pointF;
    }

    /* renamed from: b */
    public void m5455b(float f) {
        AbstractC0244am m5449e;
        super.m5438b(f);
        m5433n();
        this.f686E = m5443j();
        if (!this.f661f && (m5449e = m5449e()) != null && m5447f() == null) {
            if (m5461a(m5449e, false)) {
                m5457a("fighting attacker");
                C0749e m2422a = Core.m1087A().f6130cf.m2422a(this.f760R);
                m5459a(m2422a, true, m5449e);
                m2422a.m2327a(m5449e.f6958el, m5449e.f6959em, false);
                return;
            }
            m5457a("flight from attacker");
            PointF m5462a = m5462a(m5449e);
            this.f761S = m5462a.f227a;
            this.f762T = m5462a.f228b;
            if (this.f681z > 200.0f) {
                this.f681z = 200.0f;
            }
        }
    }

    /* renamed from: c */
    public void m5452c(float f) {
        Core m1087A = Core.m1087A();
        this.f679x += f;
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y != null && this.f684C < abstractC0623y.f1578br) {
                this.f684C = abstractC0623y.f1578br;
                this.f685D = abstractC0623y.f1579bs;
            }
        }
        m5433n();
        if (m5451d()) {
            this.f667l = C0758f.m2211a(this.f667l, f);
        } else if (this.f677v) {
        }
        this.f680y = C0758f.m2211a(this.f680y, f);
        this.f681z = C0758f.m2211a(this.f681z, f);
        this.f671p = C0758f.m2211a(this.f671p, f);
        if (!this.f677v && !this.f673r && !m5451d() && this.f680y == 0.0f) {
            this.f680y = 200 + C0758f.m2133c(200);
            m5453c();
        }
        if (!this.f677v || this.f672q) {
            if (!this.f672q) {
                this.f669n = C0758f.m2211a(this.f669n, f);
                if (this.f669n == 0.0f) {
                    if (this.f666k == null) {
                        this.f666k = m5446g();
                    }
                    if (this.f666k != null) {
                        PointF w = this.f666k.m5357w();
                        if (!m5464a(w.f227a, w.f228b)) {
                            this.f669n = 100.0f;
                            m5457a("random move: bad target");
                        } else {
                            this.f669n = 4000.0f;
                            this.f761S = w.f227a;
                            this.f762T = w.f228b;
                            m5457a("random move");
                        }
                    } else {
                        m5457a("random move: no linked base");
                    }
                }
            }
            if (this.f681z == 0.0f) {
                this.f681z = 800.0f;
                C0749e m2422a = m1087A.f6130cf.m2422a(this.f760R);
                Iterator it2 = this.f687F.iterator();
                while (it2.hasNext()) {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
                    boolean z = true;
                    if (m5361c(abstractC0623y2) < 28900.0f) {
                        z = false;
                    }
                    if (!this.f661f && abstractC0623y2.m2917aj() && !abstractC0623y2.m2910aq()) {
                        z = false;
                    }
                    if (z) {
                        m2422a.m2319a(abstractC0623y2);
                    }
                }
                if (this.f661f) {
                    m2422a.m2329a(this.f761S, this.f762T);
                } else {
                    m2422a.m2314b(this.f761S, this.f762T);
                }
            }
        }
        if (this.f663h) {
            m5448e(f);
        } else {
            m5450d(f);
        }
        if (this.f682A == 0 && this.f687F.size() == 0) {
            m5431p();
        }
        if (this.f658c) {
            if (this.f662g == null || this.f662g.f1607bT) {
                m5431p();
            }
        }
    }

    /* renamed from: g */
    C0164i m5446g() {
        float f = -1.0f;
        C0164i c0164i = null;
        Iterator it = this.f760R.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                if (m5454b(c0164i2.f761S, c0164i2.f762T)) {
                    float d = c0164i2.m5360d(this.f761S, this.f762T);
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
    public void m5450d(float f) {
        if (this.f666k == null || this.f666k.f764V) {
            m5442k();
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
                    m5442k();
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
                    C0164i m5569a = this.f760R.m5569a(this.f662g.mo3039h(), this.f662g.f6958el, this.f662g.f6959em, true);
                    if (m5569a != null) {
                        this.f666k = m5569a;
                    }
                    if (this.f666k != null) {
                        PointF w = this.f666k.m5357w();
                        this.f761S = w.f227a;
                        this.f762T = w.f228b;
                        if (this.f681z > 100.0f) {
                            this.f681z = 100.0f;
                        }
                        m5457a("moving to new base");
                    }
                }
            }
        }
        if (this.f666k != null) {
            for (int i = 0; i < 2; i++) {
                if (this.f671p == 0.0f) {
                    AbstractC0244am m5397g = this.f666k.m5397g();
                    if (m5397g == null) {
                        break;
                    } else if (m5461a(m5397g, false)) {
                        this.f678w = m5397g;
                        this.f671p = 500.0f;
                        this.f669n = 2000.0f;
                        if (!this.f661f) {
                            this.f761S = m5397g.f6958el;
                            this.f762T = m5397g.f6959em;
                        }
                        if (this.f681z > 100.0f) {
                            this.f681z = 100.0f;
                        }
                        m5457a("defending base");
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
    public void m5448e(float f) {
        Core m1087A = Core.m1087A();
        if (!this.f677v) {
            if (this.f667l == 0.0f) {
                this.f677v = true;
                this.f672q = true;
            }
        } else {
            if (this.f678w == null || !this.f678w.m4751bS() || this.f678w.f1607bT || !this.f673r) {
                this.f678w = this.f760R.m5543ao();
                if (this.f678w != null && !m5461a(this.f678w, true)) {
                    this.f678w = null;
                }
            }
            if (this.f678w != null) {
                if (this.f672q) {
                    this.f676u += f;
                    if (!this.f673r) {
                        this.f675t = C0758f.m2211a(this.f675t, f);
                        if (this.f675t == 0.0f) {
                            this.f675t = 20.0f;
                            m5445h();
                        }
                    } else {
                        boolean z = false;
                        Iterator it = this.f687F.iterator();
                        while (it.hasNext()) {
                            if (m5361c((AbstractC0623y) it.next()) > 28900.0f) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f672q = false;
                        }
                        Iterator it2 = this.f687F.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0623y) it2.next()).f1578br > m1087A.f6102by - 1000) {
                                this.f672q = false;
                                m5457a("Not staging due to damage");
                            }
                        }
                    }
                    if (this.f676u > 17000.0f) {
                        this.f672q = false;
                        m5457a("attacking target");
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
                                if (!this.f760R.m5570a(abstractC0623y, this.f678w)) {
                                    z3 = false;
                                }
                                if (z3 && !C0248aq.m4631a(abstractC0623y, this.f678w)) {
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
                            m5457a("cannot reach main target");
                        } else {
                            C0749e m2422a = m1087A.f6130cf.m2422a(this.f760R);
                            m2422a.m2316a(c1101m);
                            if (this.f678w != null && C0758f.m2203a(0, 100) < 80) {
                                m2422a.m2327a(this.f678w.f6958el, this.f678w.f6959em, true);
                            } else {
                                m2422a.m2320a(this.f678w, true);
                            }
                            m5457a("attacking main target");
                        }
                    }
                }
            }
        }
        if (this.f677v) {
            if (this.f687F.size() == 0) {
                m5431p();
            }
            if (this.f670o > 1000.0f && this.f687F.size() < 3) {
                m5431p();
            }
            if (this.f670o > 11000.0f) {
                m5431p();
            }
        }
    }

    /* renamed from: h */
    public void m5445h() {
        float f = this.f678w.f6958el;
        float f2 = this.f678w.f6959em;
        float m2123d = C0758f.m2123d(f, f2, this.f761S, this.f762T);
        float m2157b = C0758f.m2157b(f, f2, this.f761S, this.f762T);
        if (C0758f.m2203a(0, 100) < 80) {
            m2123d += C0758f.m2203a(-110, 110);
        }
        int i = (int) (m2157b * 0.6d);
        if (i < 720) {
            i = 720;
        }
        float m2203a = C0758f.m2203a(50, i);
        if (C0758f.m2203a(0, 100) < 80 && m2203a < 450.0f) {
            m2203a = C0758f.m2203a(450, i);
        }
        float m2092i = f + (C0758f.m2092i(m2123d) * m2203a);
        float m2097h = f2 + (C0758f.m2097h(m2123d) * m2203a);
        boolean z = true;
        if (!m5464a(m2092i, m2097h)) {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = false;
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y.mo3039h() == EnumC0246ao.f1704b) {
                z2 = true;
            }
            if (abstractC0623y.mo3039h() == EnumC0246ao.f1707e) {
                z3 = true;
            }
        }
        if (z2) {
            if (this.f760R.f567aF == 0 && !m5454b(m2092i, m2097h)) {
                z = false;
            }
            if (!this.f760R.m5582a(m2092i, m2097h, this.f678w.f6958el, this.f678w.f6959em, EnumC0246ao.f1704b) && C0758f.m2203a(0, 100) < 98) {
                z = false;
            }
        }
        if (z3) {
            if (!m5454b(m2092i, m2097h)) {
                z = false;
            }
            if (!this.f760R.m5582a(m2092i, m2097h, this.f678w.f6958el, this.f678w.f6959em, EnumC0246ao.f1707e)) {
                z = false;
            }
        }
        if (z) {
            this.f761S = m2092i;
            this.f762T = m2097h;
            this.f681z = 0.0f;
            this.f673r = true;
            this.f688G.clear();
            Iterator it2 = this.f687F.iterator();
            while (it2.hasNext()) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
                if (abstractC0623y2.mo3039h() != EnumC0246ao.f1707e && !this.f760R.m5572a(abstractC0623y2, this.f761S, this.f762T)) {
                    this.f688G.add(abstractC0623y2);
                }
            }
        }
    }

    /* renamed from: i */
    public EnumC0246ao m5444i() {
        return this.f686E;
    }

    /* renamed from: j */
    public EnumC0246ao m5443j() {
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
            } else if (((AbstractC0623y) it.next()).mo3039h() != EnumC0246ao.f1706d) {
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
                if (((AbstractC0623y) it2.next()).mo3039h() == EnumC0246ao.f1707e) {
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
            EnumC0246ao h = ((AbstractC0623y) it3.next()).mo3039h();
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
    public boolean m5464a(float f, float f2) {
        return !C1117y.m476a(f, f2, m5444i());
    }

    /* renamed from: b */
    public boolean m5454b(float f, float f2) {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            if (!this.f760R.m5572a((AbstractC0623y) it.next(), f, f2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m5461a(AbstractC0244am abstractC0244am, boolean z) {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (z || this.f760R.m5572a(abstractC0623y, abstractC0244am.f6958el, abstractC0244am.f6959em)) {
                if (C0248aq.m4631a(abstractC0623y, abstractC0244am)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m5442k() {
        PointF pointF = null;
        if (this.f658c && this.f662g != null) {
            this.f761S = this.f662g.f6958el;
            this.f762T = this.f662g.f6959em;
            this.f666k = this.f760R.m5534c(this.f662g.f6958el, this.f662g.f6959em);
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
                            if (c0164i.f690b == EnumC0165j.f733c && (c0164i.m5383u() > 2 || z)) {
                                if (pointF == null || C0758f.m2133c(this.f760R.f559ax + 2) == 0) {
                                    for (int i2 = 0; i2 < 10; i2++) {
                                        if (pointF == null) {
                                            PointF w = c0164i.m5357w();
                                            if (m5464a(w.f227a, w.f228b)) {
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
            pointF = this.f760R.m5549ai();
            this.f666k = null;
        }
        this.f761S = pointF.f227a;
        this.f762T = pointF.f228b;
    }
}
