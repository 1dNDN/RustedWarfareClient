package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.corrodinggames.rts.game.units.d.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/k.class */
public class C0500k {

    /* renamed from: a */
    AbstractC0623y f3499a;

    /* renamed from: b */
    public PointF f3500b = null;

    /* renamed from: c */
    public final C1101m f3501c = new C1101m();

    /* renamed from: d */
    final C1101m f3502d = new C1101m();

    /* renamed from: e */
    public float f3503e;

    /* renamed from: f */
    C0499j f3504f;

    public C0500k(AbstractC0623y abstractC0623y) {
        this.f3499a = abstractC0623y;
    }

    /* renamed from: a */
    public void m3327a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f3503e);
        streamWriter.WriteInteger(this.f3501c.size());
        Iterator it = this.f3501c.iterator();
        while (it.hasNext()) {
            ((AbstractC0726bk) it.next()).mo2292a(streamWriter);
        }
        streamWriter.mo1314a(this.f3500b != null);
        if (this.f3500b != null) {
            streamWriter.mo1320a(this.f3500b.f227a);
            streamWriter.mo1320a(this.f3500b.f228b);
        }
    }

    /* renamed from: a */
    public void m3326a(Reader reader) {
        this.f3503e = reader.m1285g();
        int ReadInt = reader.ReadInt();
        this.f3501c.clear();
        for (int i = 0; i < ReadInt; i++) {
            C0499j c0499j = new C0499j();
            c0499j.m3343a(reader);
            if (AbstractC0224s.m4498c(c0499j.f3494j)) {
                if (this.f3499a.m4427a(c0499j.f3494j) == null) {
                    LoggerMaybe.m982b("Factory", this.f3499a.mo5649r() + " no longer has the action:" + c0499j.f3494j);
                } else {
                    this.f3501c.add(c0499j);
                }
            } else {
                LoggerMaybe.m982b("Factory", "buildQueue has uIndex of -1, skipping");
            }
        }
        if (reader.m1295b() >= 5) {
            if (reader.ReadBool()) {
                if (this.f3500b == null) {
                    this.f3500b = new PointF();
                }
                this.f3500b.f227a = reader.m1285g();
                this.f3500b.f228b = reader.m1285g();
                return;
            }
            this.f3500b = null;
        }
    }

    /* renamed from: a */
    public AbstractC0244am m3328a(C0499j c0499j, float f, boolean z, float f2) {
        AbstractC0224s a = this.f3499a.m4427a(c0499j.f3494j);
        if (a == null) {
            C0831ad.m1543a("specialAction=null on completeQueueItem for item.uIndex:" + c0499j.f3494j + " id:" + this.f3499a.f6951ee, true);
            return null;
        }
        InterfaceC0303as mo5648i = a.mo5648i();
        if (mo5648i == null) {
            C0831ad.m1543a("unitType=null on completeQueueItem for item.uIndex:" + c0499j.f3494j + " id:" + this.f3499a.f6951ee, false);
            return null;
        }
        return m3331a(mo5648i, f, z, f2);
    }

    /* renamed from: a */
    public void m3333a(AbstractC0244am abstractC0244am, float f, boolean z) {
        abstractC0244am.f1623cj = 30.0f;
        if (this.f3499a instanceof C0490f) {
            abstractC0244am.f1623cj += 40.0f;
        }
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
            abstractC0623y.m2767j(90.0f);
            if (abstractC0623y.mo2976z() < 0.75d) {
                abstractC0244am.f1623cj += 30.0f;
            }
            if (abstractC0623y.mo2976z() < 0.55d) {
                abstractC0244am.f1623cj += 20.0f;
            }
            float f2 = z ? 0.0f : 1.0f;
            float m2040i = this.f3499a.f6957el + (C0758f.m2040i(abstractC0244am.f1618ce) * f);
            float m2045h = this.f3499a.f6958em + (C0758f.m2045h(abstractC0244am.f1618ce) * f);
            if (this.f3500b != null) {
                if (f != 0.0f) {
                    abstractC0623y.m2789d(m2040i, m2045h);
                }
                abstractC0623y.m2789d(this.f3500b.f227a + f2, this.f3500b.f228b);
                return;
            }
            float m2045h2 = m2040i - (C0758f.m2045h(abstractC0244am.f1618ce) * f2);
            float m2040i2 = m2045h + (C0758f.m2040i(abstractC0244am.f1618ce) * f2);
            if (f != 0.0f) {
                abstractC0623y.m2789d(m2045h2, m2040i2);
            }
        }
    }

    /* renamed from: a */
    public AbstractC0244am m3331a(InterfaceC0303as interfaceC0303as, float f, boolean z, float f2) {
        AbstractC0244am mo4263a = interfaceC0303as.mo4263a();
        mo4263a.f6957el = this.f3499a.f6957el;
        mo4263a.f6958em = this.f3499a.f6958em + 5.0f;
        mo4263a.f1618ce = 90.0f + f2;
        mo4263a.m4312f(this.f3499a.f1609bV);
        mo4263a.m4437B(this.f3499a);
        m3333a(mo4263a, f, z);
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (mo4263a.f1609bV == m1072A.f6099bs) {
            m1072A.f6117bS.f5114f.m1904a(mo4263a);
        }
        return mo4263a;
    }

    /* renamed from: a */
    public final boolean m3342a() {
        return this.f3501c.f6894a == 0;
    }

    /* renamed from: a */
    public C0499j m3335a(AbstractC0228w abstractC0228w, boolean z) {
        return m3334a(abstractC0228w, z, (PointF) null, (AbstractC0244am) null);
    }

    /* renamed from: a */
    public C0499j m3334a(AbstractC0228w abstractC0228w, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        C0499j c0499j = new C0499j();
        c0499j.f3494j = abstractC0228w.m4507N();
        c0499j.f3492h = pointF;
        c0499j.f3493i = abstractC0244am;
        if (c0499j.f3494j == null) {
            throw new RuntimeException("item.uIndex==null??");
        }
        c0499j.f3485a = 1;
        c0499j.f3486b = abstractC0228w.mo3265K();
        c0499j.f3487c = abstractC0228w.mo4138B();
        c0499j.f3488d = abstractC0228w.mo4115o_();
        c0499j.f3489e = abstractC0228w.mo4131P();
        c0499j.f3490f = abstractC0228w.mo3019g();
        c0499j.f3491g = abstractC0228w.mo5648i();
        c0499j.f3496l = abstractC0228w.mo4135H();
        if (!z) {
            AbstractC0197n.m4614b((AbstractC0244am) this.f3499a);
            if (c0499j.f3496l) {
                int i = 0;
                for (int i2 = 0; i2 < this.f3501c.size() && ((C0499j) this.f3501c.get(i2)).f3496l; i2++) {
                    i = i2 + 1;
                }
                if (i != 0 || this.f3501c.size() != 0) {
                }
                this.f3501c.add(i, c0499j);
            } else {
                this.f3501c.add(c0499j);
            }
            AbstractC0197n.m4598c(this.f3499a);
        } else {
            this.f3502d.add(c0499j);
        }
        return c0499j;
    }

    /* renamed from: b */
    public C0499j m3323b(AbstractC0228w abstractC0228w, boolean z) {
        if (z) {
            if (m3340a(abstractC0228w.m4507N(), true) > 0) {
                C0499j m3335a = m3335a(abstractC0228w, true);
                m3335a.f3495k = true;
                return m3335a;
            }
            return null;
        }
        C1101m c1101m = this.f3501c;
        ListIterator listIterator = c1101m.listIterator(c1101m.size());
        while (listIterator.hasPrevious()) {
            C0499j c0499j = (C0499j) listIterator.previous();
            if (c0499j.f3494j.equals(abstractC0228w.m4507N())) {
                AbstractC0197n.m4614b((AbstractC0244am) this.f3499a);
                listIterator.remove();
                AbstractC0197n.m4598c(this.f3499a);
                return c0499j;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m3329a(C0499j c0499j) {
        this.f3504f = c0499j;
        this.f3499a.m2825bC();
    }

    /* renamed from: b */
    public C0499j m3324b() {
        return this.f3504f;
    }

    /* renamed from: c */
    public C0424b m3320c() {
        if (this.f3504f == null || this.f3504f.f3488d == null) {
            return null;
        }
        return C0424b.m3910a(this.f3504f.f3488d, -(this.f3504f.f3486b * this.f3499a.m4340cv() * 60.0f));
    }

    /* renamed from: d */
    public AbstractC0224s m3318d() {
        if (this.f3504f != null) {
            return this.f3499a.m4427a(this.f3504f.f3494j);
        }
        return null;
    }

    /* renamed from: a */
    public void m3341a(float f) {
        if (!m3342a()) {
            C0499j c0499j = (C0499j) m3316f().get(0);
            if (this.f3504f != c0499j) {
                if (c0499j.f3497m < 0.0f) {
                    c0499j.f3497m = 0.0f;
                    ((InterfaceC0501l) this.f3499a).mo3312b(c0499j);
                }
                if (this.f3504f != null) {
                    this.f3503e = c0499j.f3497m;
                }
                m3329a(c0499j);
            }
            float cv = c0499j.f3486b * this.f3499a.m4340cv() * f;
            boolean z = false;
            if (c0499j.f3488d != null) {
                if (this.f3503e + cv > 1.0f) {
                    cv = 1.0f - this.f3503e;
                    z = true;
                }
                double d = (this.f3503e + cv) - c0499j.f3498n;
                double d2 = 0.0d;
                if (z) {
                    d2 = 1.0d - c0499j.f3498n;
                } else if (d >= 0.009999999776482582d) {
                    d2 = ((int) (d / 0.009999999776482582d)) * 0.009999999776482582d;
                }
                boolean z2 = false;
                if (d2 > 0.0d && this.f3499a.f1609bV.f1359al.m3828a(c0499j.f3488d)) {
                    z2 = true;
                }
                if (!z2 && (d2 <= 0.0d || c0499j.f3488d.m3920c(this.f3499a, d2))) {
                    c0499j.f3498n += d2;
                } else {
                    if (!z2) {
                        this.f3499a.f1609bV.f1359al.m3827a(c0499j.f3488d, this.f3499a, d2);
                    }
                    cv = 0.0f;
                    z = false;
                }
            }
            this.f3503e += cv;
            if (z) {
                this.f3503e = 1.0f;
            }
            c0499j.f3497m = this.f3503e;
            if (this.f3503e >= 1.0f) {
                if (c0499j.f3490f && ((InterfaceC0501l) this.f3499a).mo3306dx()) {
                    this.f3503e = 1.0f;
                    return;
                }
                AbstractC0197n.m4614b((AbstractC0244am) this.f3499a);
                this.f3503e = 0.0f;
                c0499j.f3485a--;
                if (c0499j.f3485a <= 0) {
                    List m3316f = m3316f();
                    if (m3316f.size() == 0) {
                        LoggerMaybe.m983b("-------------buildQueue empty for:" + c0499j.f3494j);
                        LoggerMaybe.m983b("-------------");
                    } else {
                        m3316f.remove(0);
                    }
                }
                AbstractC0197n.m4598c(this.f3499a);
                ((InterfaceC0501l) this.f3499a).mo3272a(c0499j);
                return;
            }
            return;
        }
        m3329a((C0499j) null);
        this.f3503e = 0.0f;
        if (this.f3502d.f6894a > 0) {
            C0499j c0499j2 = (C0499j) this.f3502d.get(0);
            if (c0499j2.f3486b > 10.0f && c0499j2.f3497m <= 0.0f) {
                c0499j2.f3497m = 1.0f;
                AbstractC0224s a = this.f3499a.m4427a(c0499j2.f3494j);
                if (a != null && a.mo4130Q()) {
                    a.mo4127a(this.f3499a);
                }
            }
        }
    }

    /* renamed from: e */
    public void m3317e() {
        Iterator it = this.f3501c.iterator();
        while (it.hasNext()) {
            C0499j c0499j = (C0499j) it.next();
            if (this.f3499a.m4427a(c0499j.f3494j) == null) {
                m3321b(c0499j);
                m3319c(c0499j);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void m3325a(boolean z) {
        Iterator it = this.f3501c.iterator();
        while (it.hasNext()) {
            C0499j c0499j = (C0499j) it.next();
            if (z) {
                m3321b(c0499j);
            }
            m3319c(c0499j);
            it.remove();
        }
    }

    /* renamed from: b */
    private void m3321b(C0499j c0499j) {
        if (((InterfaceC0501l) this.f3499a).mo3311c(c0499j)) {
            if (c0499j.f3488d != null && c0499j.f3498n > 0.0d) {
                c0499j.f3488d.m3915a((AbstractC0244am) this.f3499a, c0499j.f3498n, true);
            }
            c0499j.f3487c.m3877h(this.f3499a);
        }
    }

    /* renamed from: c */
    private void m3319c(C0499j c0499j) {
    }

    /* renamed from: a */
    public int m3332a(InterfaceC0303as interfaceC0303as) {
        int i = 0;
        int i2 = this.f3501c.f6894a;
        if (i2 != 0) {
            Object[] m534a = this.f3501c.m534a();
            for (int i3 = 0; i3 < i2; i3++) {
                C0499j c0499j = (C0499j) m534a[i3];
                if (c0499j.f3490f && c0499j.f3491g == interfaceC0303as) {
                    i += c0499j.f3485a;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m3340a(C0208c c0208c, boolean z) {
        return m3339a(c0208c, z, false);
    }

    /* renamed from: a */
    public int m3330a(C0448g c0448g) {
        if (c0448g == null) {
            return this.f3501c.f6894a;
        }
        int i = 0;
        Iterator it = this.f3501c.iterator();
        while (it.hasNext()) {
            if (C0448g.m3754a(c0448g, ((C0499j) it.next()).f3489e)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m3339a(C0208c c0208c, boolean z, boolean z2) {
        int i = 0;
        if (this.f3501c.f6894a != 0) {
            Iterator it = this.f3501c.iterator();
            while (it.hasNext()) {
                C0499j c0499j = (C0499j) it.next();
                if (AbstractC0224s.f1462i == c0208c || c0499j.f3494j.equals(c0208c)) {
                    if (!z2 || c0499j.f3490f) {
                        i += c0499j.f3485a;
                    }
                }
            }
        }
        if (z && this.f3502d.f6894a != 0) {
            Iterator it2 = this.f3502d.iterator();
            while (it2.hasNext()) {
                C0499j c0499j2 = (C0499j) it2.next();
                if (AbstractC0224s.f1462i == c0208c || c0499j2.f3494j.equals(c0208c)) {
                    if (!z2 || c0499j2.f3490f) {
                        if (!c0499j2.f3495k) {
                            i += c0499j2.f3485a;
                        } else {
                            i -= c0499j2.f3485a;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public AbstractC0224s m3322b(InterfaceC0303as interfaceC0303as) {
        ArrayList N = this.f3499a.mo3068N();
        int size = N.size();
        for (int i = 0; i < size; i++) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) N.get(i);
            if (abstractC0224s != null && (abstractC0224s instanceof AbstractC0228w)) {
                AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
                if (abstractC0228w.mo5648i() == interfaceC0303as) {
                    return abstractC0228w;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0499j m3336a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (abstractC0224s instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
            if (!z) {
                if (abstractC0224s.mo3027a((AbstractC0244am) this.f3499a, false) && abstractC0224s.mo3025b(this.f3499a)) {
                    if ((!abstractC0228w.mo3019g() || this.f3499a.f1609bV.m4552u() < this.f3499a.f1609bV.m4551v()) && abstractC0228w.mo4138B().m3921c(this.f3499a)) {
                        return m3334a(abstractC0228w, false, pointF, abstractC0244am);
                    }
                    return null;
                }
                return null;
            }
            C0499j m3323b = m3323b(abstractC0228w, false);
            if (m3323b != null) {
                m3321b(m3323b);
                m3319c(m3323b);
                return m3323b;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m3337a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
            if (!z) {
                if (abstractC0224s.mo3027a((AbstractC0244am) this.f3499a, true)) {
                    if ((!abstractC0228w.mo3019g() || this.f3499a.f1609bV.m4552u() < this.f3499a.f1609bV.m4551v()) && abstractC0228w.mo4138B().m3896b(this.f3499a, abstractC0224s.mo4130Q())) {
                        m3335a(abstractC0228w, true);
                    }
                }
            } else if (m3323b(abstractC0228w, true) != null) {
                abstractC0228w.mo4138B().m3880e(this.f3499a, abstractC0224s.mo4130Q());
            }
        }
    }

    /* renamed from: a */
    public void m3338a(AbstractC0224s abstractC0224s) {
        if (this.f3502d.size() != 0) {
            C0499j c0499j = null;
            Iterator it = this.f3502d.iterator();
            while (it.hasNext()) {
                C0499j c0499j2 = (C0499j) it.next();
                if (c0499j2.f3494j.equals(abstractC0224s.m4507N())) {
                    c0499j = c0499j2;
                }
            }
            if (c0499j != null) {
                if (!c0499j.f3495k) {
                    c0499j.f3487c.m3880e(this.f3499a, abstractC0224s.mo4130Q());
                } else {
                    c0499j.f3487c.m3882d(this.f3499a, abstractC0224s.mo4130Q());
                }
                this.f3502d.remove(c0499j);
            }
        }
    }

    /* renamed from: f */
    public List m3316f() {
        return this.f3501c;
    }

    /* renamed from: g */
    public C1101m m3315g() {
        return this.f3501c;
    }
}
