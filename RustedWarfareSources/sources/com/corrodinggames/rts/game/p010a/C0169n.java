package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/n.class */
public class C0169n extends AbstractC0163h {

    /* renamed from: a */
    boolean f740a;

    /* renamed from: b */
    int f741b;

    /* renamed from: c */
    int f742c;

    /* renamed from: d */
    C0164i f743d;

    /* renamed from: e */
    float f744e;

    /* renamed from: f */
    float f745f;

    /* renamed from: g */
    float f746g;

    /* renamed from: h */
    float f747h;

    /* renamed from: i */
    float f748i;

    /* renamed from: j */
    float f749j;

    /* renamed from: k */
    float f750k;

    /* renamed from: l */
    int f751l;

    /* renamed from: m */
    AbstractC0163h f752m;

    /* renamed from: n */
    AbstractC0623y f753n;

    /* renamed from: o */
    float f754o;

    /* renamed from: p */
    boolean f755p;

    /* renamed from: q */
    boolean f756q;

    /* renamed from: r */
    float f757r;

    /* renamed from: s */
    float f758s;

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f740a);
        streamWriter.WriteInteger(this.f741b);
        streamWriter.WriteInteger(this.f742c);
        streamWriter.WriteInteger(this.f687F.size());
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            streamWriter.m1419a((AbstractC0623y) it.next());
        }
        streamWriter.m1401c(5);
        streamWriter.WriteInteger(this.f760R.m5575a(this.f752m));
        streamWriter.mo1329a(this.f756q);
        streamWriter.m1419a(this.f753n);
        streamWriter.mo1335a(this.f754o);
        streamWriter.mo1329a(this.f755p);
        streamWriter.mo1335a(this.f757r);
        streamWriter.mo1335a(this.f758s);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m5373a(Reader reader) {
        this.f740a = reader.ReadBool();
        this.f741b = reader.ReadInt();
        this.f742c = reader.ReadInt();
        m5430q();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            AbstractC0623y m1291p = reader.m1291p();
            if (m1291p != null) {
                if (!this.f760R.m5524g(m1291p)) {
                    Core.m998b("TransporterGroup:readIn: Unit is not transporterUnit");
                } else {
                    m5440a(m1291p);
                }
            }
        }
        byte m1304d = reader.m1304d();
        if (m1304d >= 1) {
            this.f752m = (AbstractC0163h) this.f760R.m5514m(reader.ReadInt());
        }
        if (m1304d >= 2) {
            this.f756q = reader.ReadBool();
        }
        if (m1304d >= 3) {
            this.f753n = reader.m1291p();
        }
        if (m1304d >= 4) {
            this.f754o = reader.m1300g();
            this.f755p = reader.ReadBool();
        }
        if (m1304d >= 5) {
            this.f757r = reader.m1300g();
            this.f758s = reader.m1300g();
        }
        super.m5364a(reader);
    }

    public C0169n(C0136a c0136a) {
        super(c0136a);
        this.f744e = 100.0f;
        this.f745f = 4000.0f;
        this.f746g = 100.0f;
        this.f754o = 0.0f;
        this.f755p = false;
    }

    /* renamed from: c */
    public void m5371c() {
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (!abstractC0244am.f1607bT && abstractC0244am.f1609bV == this.f760R && this.f751l > this.f687F.size() && (abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (!abstractC0623y.f1600bM && abstractC0623y.f3947aA == null && this.f760R.m5524g(abstractC0623y) && this.f760R.m5521i(abstractC0623y)) {
                    m5440a(abstractC0623y);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m5369d() {
        return this.f752m != null;
    }

    /* renamed from: c */
    public void m5370c(float f) {
        Core m1087A = Core.m1087A();
        this.f747h += f;
        m5433n();
        if (this.f751l <= this.f687F.size()) {
        }
        this.f748i = C0758f.m2211a(this.f748i, f);
        this.f749j = C0758f.m2211a(this.f749j, f);
        this.f750k = C0758f.m2211a(this.f750k, f);
        if (!m5369d() && !this.f756q && this.f751l > this.f687F.size() && this.f748i == 0.0f) {
            this.f748i = 300.0f;
            m5371c();
        }
        if (!m5369d() && this.f687F.size() != 0) {
            if (!m5369d()) {
                this.f745f = C0758f.m2211a(this.f745f, f);
                if (this.f745f == 0.0f) {
                    this.f745f = 4000.0f;
                    if (this.f743d != null) {
                        PointF w = this.f743d.m5357w();
                        this.f761S = w.f227a;
                        this.f762T = w.f228b;
                    }
                }
            }
            if (this.f749j == 0.0f) {
                this.f749j = 400.0f;
                C0749e m2422a = m1087A.f6130cf.m2422a(this.f760R);
                Iterator it = this.f687F.iterator();
                while (it.hasNext()) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
                    if (m5361c(abstractC0623y) > 28900.0f && !abstractC0623y.m2904aw()) {
                        m2422a.m2319a(abstractC0623y);
                    } else if (((InterfaceC0242ak) abstractC0623y).mo4818bB() != 0) {
                        C0208c co = abstractC0623y.m4693co();
                        C0749e m2422a2 = m1087A.f6130cf.m2422a(this.f760R);
                        m2422a2.m2319a(abstractC0623y);
                        m2422a2.m2324a(co);
                    }
                }
                m2422a.m2329a(this.f761S, this.f762T);
            }
            if (this.f752m == null) {
                this.f746g = C0758f.m2211a(this.f746g, f);
                if (this.f746g == 0.0f) {
                    this.f746g = 100.0f;
                    if (C0758f.m2203a(0, 100) < 80) {
                        m5374a(f, true);
                    }
                    if (this.f752m == null) {
                        m5374a(f, false);
                    }
                }
            }
        }
        if (this.f752m != null && this.f752m.f764V) {
            this.f752m = null;
        }
        if (!this.f756q) {
            if (this.f752m != null) {
                ArrayList arrayList = this.f752m.f688G;
                if (this.f753n != null && (this.f753n.f1607bT || this.f753n.f1651cL != null || this.f753n.f1652cM != null)) {
                    arrayList.remove(this.f753n);
                    this.f753n = null;
                }
                if (this.f753n == null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) it2.next();
                        if (abstractC0623y2.f1651cL == null) {
                            Iterator it3 = this.f687F.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                } else if (((AbstractC0623y) it3.next()).m4680d((AbstractC0244am) abstractC0623y2, false)) {
                                    this.f753n = abstractC0623y2;
                                    break;
                                }
                            }
                        }
                    }
                    if (this.f753n == null) {
                        this.f756q = true;
                        this.f749j = 0.0f;
                        this.f750k = 0.0f;
                        this.f757r = this.f752m.f761S;
                        this.f758s = this.f752m.f762T;
                    }
                }
                if (this.f753n != null) {
                    if (this.f749j == 0.0f) {
                        this.f749j = 400.0f;
                        C0749e m2422a3 = m1087A.f6130cf.m2422a(this.f760R);
                        Iterator it4 = this.f687F.iterator();
                        while (it4.hasNext()) {
                            m2422a3.m2319a((AbstractC0623y) it4.next());
                        }
                        m2422a3.m2329a(this.f753n.f6958el, this.f753n.f6959em);
                    }
                    if (this.f750k == 0.0f) {
                        this.f750k = 80.0f;
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            AbstractC0623y abstractC0623y3 = (AbstractC0623y) it5.next();
                            Iterator it6 = this.f687F.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    AbstractC0623y abstractC0623y4 = (AbstractC0623y) it6.next();
                                    if (abstractC0623y4.m4680d((AbstractC0244am) abstractC0623y3, false) && C0758f.m2209a(abstractC0623y4.f6958el, abstractC0623y4.f6959em, abstractC0623y3.f6958el, abstractC0623y3.f6959em) < 14400.0f) {
                                        C0749e m2422a4 = m1087A.f6130cf.m2422a(this.f760R);
                                        m2422a4.m2319a(abstractC0623y3);
                                        m2422a4.m2306e(abstractC0623y4);
                                        break;
                                    }
                                }
                            }
                        }
                        boolean z = false;
                        Iterator it7 = this.f687F.iterator();
                        while (it7.hasNext()) {
                            if (((AbstractC0623y) it7.next()).m4680d((AbstractC0244am) this.f753n, false)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f753n = null;
                        }
                    }
                }
            }
        } else if (this.f752m == null) {
            m5368e();
        } else {
            if (this.f749j == 0.0f) {
                this.f749j = 400.0f;
                float m2136c = this.f752m.f761S + C0758f.m2136c(-40.0f, 40.0f);
                float m2136c2 = this.f752m.f762T + C0758f.m2136c(-40.0f, 40.0f);
                if (this.f754o > 600.0f) {
                    m2136c += C0758f.m2136c(-300.0f, 300.0f);
                    m2136c2 += C0758f.m2136c(-300.0f, 300.0f);
                }
                if (this.f754o > 1200.0f) {
                    m2136c += C0758f.m2136c(-300.0f, 300.0f);
                    m2136c2 += C0758f.m2136c(-300.0f, 300.0f);
                }
                if (C1117y.m476a(m2136c, m2136c2, EnumC0246ao.f1704b)) {
                    m2136c += C0758f.m2136c(-100.0f, 100.0f);
                    m2136c2 += C0758f.m2136c(-100.0f, 100.0f);
                }
                if (C1117y.m476a(m2136c, m2136c2, EnumC0246ao.f1704b)) {
                    m2136c += C0758f.m2136c(-200.0f, 200.0f);
                    m2136c2 += C0758f.m2136c(-200.0f, 200.0f);
                }
                if (C1117y.m476a(m2136c, m2136c2, EnumC0246ao.f1704b)) {
                    m2136c += C0758f.m2136c(-200.0f, 200.0f);
                    m2136c2 += C0758f.m2136c(-200.0f, 200.0f);
                }
                if (C1117y.m476a(m2136c, m2136c2, EnumC0246ao.f1704b)) {
                    this.f749j = 30.0f;
                } else {
                    this.f757r = m2136c;
                    this.f758s = m2136c2;
                    C0749e m2422a5 = m1087A.f6130cf.m2422a(this.f760R);
                    Iterator it8 = this.f687F.iterator();
                    while (it8.hasNext()) {
                        AbstractC0623y abstractC0623y5 = (AbstractC0623y) it8.next();
                        if (((InterfaceC0242ak) abstractC0623y5).mo4818bB() != 0) {
                            if (C0758f.m2209a(abstractC0623y5.f6958el, abstractC0623y5.f6959em, this.f757r, this.f758s) > 1600.0f) {
                                m2422a5.m2319a(abstractC0623y5);
                            }
                        } else {
                            C0749e m2422a6 = m1087A.f6130cf.m2422a(this.f760R);
                            m2422a6.m2319a(abstractC0623y5);
                            m2422a6.m2329a(this.f761S, this.f762T);
                        }
                    }
                    m2422a5.m2329a(this.f757r, this.f758s);
                }
            }
            if (this.f750k == 0.0f) {
                this.f750k = 100.0f;
                Iterator it9 = this.f687F.iterator();
                while (it9.hasNext()) {
                    AbstractC0623y abstractC0623y6 = (AbstractC0623y) it9.next();
                    if (C0758f.m2209a(abstractC0623y6.f6958el, abstractC0623y6.f6959em, this.f757r, this.f758s) < 6400.0f) {
                        this.f755p = true;
                        C0208c co2 = abstractC0623y6.m4693co();
                        C0749e m2422a7 = m1087A.f6130cf.m2422a(this.f760R);
                        m2422a7.m2319a(abstractC0623y6);
                        m2422a7.m2324a(co2);
                    }
                }
            }
            if (this.f755p) {
                this.f752m.m5432o();
                this.f754o += f;
            }
            boolean z2 = false;
            Iterator it10 = this.f687F.iterator();
            while (it10.hasNext()) {
                AbstractC0623y abstractC0623y7 = (AbstractC0623y) it10.next();
                if (!abstractC0623y7.f1607bT && ((InterfaceC0242ak) abstractC0623y7).mo4818bB() != 0) {
                    z2 = true;
                }
            }
            if (!z2 || this.f754o > 1700.0f) {
                m5368e();
            }
        }
        if (this.f747h > 1500.0f && this.f687F.size() == 0) {
            m5431p();
        }
    }

    /* renamed from: e */
    public void m5368e() {
        this.f756q = false;
        this.f752m = null;
        this.f754o = 0.0f;
        this.f749j = 0.0f;
        this.f750k = 0.0f;
        this.f755p = false;
        m5367f();
    }

    /* renamed from: a */
    public void m5374a(float f, boolean z) {
        Iterator it = this.f760R.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof AbstractC0163h) && !(abstractC0170o instanceof C0169n) && (!z || (abstractC0170o instanceof C0167l))) {
                AbstractC0163h abstractC0163h = (AbstractC0163h) abstractC0170o;
                if (abstractC0163h.f688G.size() != 0 && !abstractC0163h.m5434m()) {
                    this.f752m = abstractC0163h;
                    this.f753n = null;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public C0164i m5372a(boolean z) {
        C0164i c0164i = null;
        Iterator it = this.f760R.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                if (!c0164i2.f707s || !z) {
                    if (c0164i2.f690b == EnumC0165j.f733c) {
                        c0164i = c0164i2;
                        if (C0758f.m2133c(3) == 0) {
                            return c0164i;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return c0164i;
    }

    /* renamed from: f */
    public void m5367f() {
        PointF pointF = null;
        if (1 != 0) {
            this.f743d = m5372a(true);
            if (this.f743d == null) {
                this.f743d = m5372a(false);
            }
            if (this.f743d != null) {
                pointF = this.f743d.m5357w();
            }
        }
        if (pointF == null) {
            pointF = this.f760R.m5549ai();
            this.f743d = null;
        }
        this.f761S = pointF.f227a;
        this.f762T = pointF.f228b;
    }
}
