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
import com.corrodinggames.rts.gameFramework.Core;
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
    public void m3452a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f3503e);
        streamWriter.WriteInteger(this.f3501c.size());
        Iterator it = this.f3501c.iterator();
        while (it.hasNext()) {
            ((AbstractC0726bk) it.next()).mo2441a(streamWriter);
        }
        streamWriter.mo1329a(this.f3500b != null);
        if (this.f3500b != null) {
            streamWriter.mo1335a(this.f3500b.f227a);
            streamWriter.mo1335a(this.f3500b.f228b);
        }
    }

    /* renamed from: a */
    public void m3451a(Reader reader) {
        this.f3503e = reader.m1300g();
        int ReadInt = reader.ReadInt();
        this.f3501c.clear();
        for (int i = 0; i < ReadInt; i++) {
            C0499j c0499j = new C0499j();
            c0499j.m3468a(reader);
            if (AbstractC0224s.m4896c(c0499j.f3496j)) {
                if (this.f3499a.m4788a(c0499j.f3496j) == null) {
                    Core.m997b("Factory", this.f3499a.mo1758r() + " no longer has the action:" + c0499j.f3496j);
                } else {
                    this.f3501c.add(c0499j);
                }
            } else {
                Core.m997b("Factory", "buildQueue has uIndex of -1, skipping");
            }
        }
        if (reader.m1310b() >= 5) {
            if (reader.ReadBool()) {
                if (this.f3500b == null) {
                    this.f3500b = new PointF();
                }
                this.f3500b.f227a = reader.m1300g();
                this.f3500b.f228b = reader.m1300g();
                return;
            }
            this.f3500b = null;
        }
    }

    /* renamed from: a */
    public AbstractC0244am m3453a(C0499j c0499j, float f, boolean z, float f2) {
        AbstractC0224s a = this.f3499a.m4788a(c0499j.f3496j);
        if (a == null) {
            C0831ad.m1587a("specialAction=null on completeQueueItem for item.uIndex:" + c0499j.f3496j + " id:" + this.f3499a.f6951ee, true);
            return null;
        }
        InterfaceC0303as mo6163i = a.mo6163i();
        if (mo6163i == null) {
            C0831ad.m1587a("unitType=null on completeQueueItem for item.uIndex:" + c0499j.f3496j + " id:" + this.f3499a.f6951ee, false);
            return null;
        }
        return m3456a(mo6163i, f, z, f2);
    }

    /* renamed from: a */
    public void m3458a(AbstractC0244am abstractC0244am, float f, boolean z) {
        abstractC0244am.f1623cj = 30.0f;
        if (this.f3499a instanceof C0490f) {
            abstractC0244am.f1623cj += 40.0f;
        }
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
            abstractC0623y.m2821j(90.0f);
            if (abstractC0623y.mo3033z() < 0.75d) {
                abstractC0244am.f1623cj += 30.0f;
            }
            if (abstractC0623y.mo3033z() < 0.55d) {
                abstractC0244am.f1623cj += 20.0f;
            }
            float f2 = z ? 0.0f : 1.0f;
            float m2092i = this.f3499a.f6958el + (C0758f.m2092i(abstractC0244am.f1618ce) * f);
            float m2097h = this.f3499a.f6959em + (C0758f.m2097h(abstractC0244am.f1618ce) * f);
            if (this.f3500b != null) {
                if (f != 0.0f) {
                    abstractC0623y.m2843d(m2092i, m2097h);
                }
                abstractC0623y.m2843d(this.f3500b.f227a + f2, this.f3500b.f228b);
                return;
            }
            float m2097h2 = m2092i - (C0758f.m2097h(abstractC0244am.f1618ce) * f2);
            float m2092i2 = m2097h + (C0758f.m2092i(abstractC0244am.f1618ce) * f2);
            if (f != 0.0f) {
                abstractC0623y.m2843d(m2097h2, m2092i2);
            }
        }
    }

    /* renamed from: a */
    public AbstractC0244am m3456a(InterfaceC0303as interfaceC0303as, float f, boolean z, float f2) {
        AbstractC0244am mo4485a = interfaceC0303as.mo4485a();
        mo4485a.f6958el = this.f3499a.f6958el;
        mo4485a.f6959em = this.f3499a.f6959em + 5.0f;
        mo4485a.f1618ce = 90.0f + f2;
        mo4485a.m4656f(this.f3499a.f1609bV);
        mo4485a.m4801B(this.f3499a);
        m3458a(mo4485a, f, z);
        Core m1087A = Core.m1087A();
        if (mo4485a.f1609bV == m1087A.f6099bs) {
            m1087A.f6117bS.f5116f.m1948a(mo4485a);
        }
        return mo4485a;
    }

    /* renamed from: a */
    public final boolean m3467a() {
        return this.f3501c.f6894a == 0;
    }

    /* renamed from: a */
    public C0499j m3460a(AbstractC0228w abstractC0228w, boolean z) {
        return m3459a(abstractC0228w, z, (PointF) null, (AbstractC0244am) null);
    }

    /* renamed from: a */
    public C0499j m3459a(AbstractC0228w abstractC0228w, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        C0499j c0499j = new C0499j();
        c0499j.f3496j = abstractC0228w.m4910N();
        c0499j.f3490h = pointF;
        c0499j.f3491i = abstractC0244am;
        if (c0499j.f3496j == null) {
            throw new RuntimeException("item.uIndex==null??");
        }
        c0499j.f3485a = 1;
        c0499j.f3486b = abstractC0228w.mo3369K();
        c0499j.f3494c = abstractC0228w.mo4866B();
        c0499j.f3495d = abstractC0228w.mo4862o_();
        c0499j.f3487e = abstractC0228w.m4908P();
        c0499j.f3488f = abstractC0228w.mo3078g();
        c0499j.f3489g = abstractC0228w.mo6163i();
        c0499j.f3493l = abstractC0228w.m4914H();
        if (!z) {
            AbstractC0197n.m5069b((AbstractC0244am) this.f3499a);
            if (c0499j.f3493l) {
                int i = 0;
                for (int i2 = 0; i2 < this.f3501c.size() && ((C0499j) this.f3501c.get(i2)).f3493l; i2++) {
                    i = i2 + 1;
                }
                if (i != 0 || this.f3501c.size() != 0) {
                }
                this.f3501c.add(i, c0499j);
            } else {
                this.f3501c.add(c0499j);
            }
            AbstractC0197n.m5053c(this.f3499a);
        } else {
            this.f3502d.add(c0499j);
        }
        return c0499j;
    }

    /* renamed from: b */
    public C0499j m3448b(AbstractC0228w abstractC0228w, boolean z) {
        if (z) {
            if (m3465a(abstractC0228w.m4910N(), true) > 0) {
                C0499j m3460a = m3460a(abstractC0228w, true);
                m3460a.f3492k = true;
                return m3460a;
            }
            return null;
        }
        C1101m c1101m = this.f3501c;
        ListIterator listIterator = c1101m.listIterator(c1101m.size());
        while (listIterator.hasPrevious()) {
            C0499j c0499j = (C0499j) listIterator.previous();
            if (c0499j.f3496j.equals(abstractC0228w.m4910N())) {
                AbstractC0197n.m5069b((AbstractC0244am) this.f3499a);
                listIterator.remove();
                AbstractC0197n.m5053c(this.f3499a);
                return c0499j;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m3454a(C0499j c0499j) {
        this.f3504f = c0499j;
        this.f3499a.m2881bC();
    }

    /* renamed from: b */
    public C0499j m3449b() {
        return this.f3504f;
    }

    /* renamed from: c */
    public C0424b m3445c() {
        if (this.f3504f == null || this.f3504f.f3495d == null) {
            return null;
        }
        return C0424b.m4117a(this.f3504f.f3495d, -(this.f3504f.f3486b * this.f3499a.m4687cv() * 60.0f));
    }

    /* renamed from: d */
    public AbstractC0224s m3443d() {
        if (this.f3504f != null) {
            return this.f3499a.m4788a(this.f3504f.f3496j);
        }
        return null;
    }

    /* renamed from: a */
    public void m3466a(float f) {
        if (!m3467a()) {
            C0499j c0499j = (C0499j) m3441f().get(0);
            if (this.f3504f != c0499j) {
                if (c0499j.f3497m < 0.0f) {
                    c0499j.f3497m = 0.0f;
                    ((InterfaceC0501l) this.f3499a).mo3436b(c0499j);
                }
                if (this.f3504f != null) {
                    this.f3503e = c0499j.f3497m;
                }
                m3454a(c0499j);
            }
            float cv = c0499j.f3486b * this.f3499a.m4687cv() * f;
            boolean z = false;
            if (c0499j.f3495d != null) {
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
                if (d2 > 0.0d && this.f3499a.f1609bV.f1359al.m4035a(c0499j.f3495d)) {
                    z2 = true;
                }
                if (!z2 && (d2 <= 0.0d || c0499j.f3495d.m4127c(this.f3499a, d2))) {
                    c0499j.f3498n += d2;
                } else {
                    if (!z2) {
                        this.f3499a.f1609bV.f1359al.m4034a(c0499j.f3495d, this.f3499a, d2);
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
                if (c0499j.f3488f && ((InterfaceC0501l) this.f3499a).mo3430dx()) {
                    this.f3503e = 1.0f;
                    return;
                }
                AbstractC0197n.m5069b((AbstractC0244am) this.f3499a);
                this.f3503e = 0.0f;
                c0499j.f3485a--;
                if (c0499j.f3485a <= 0) {
                    List m3441f = m3441f();
                    if (m3441f.size() == 0) {
                        Core.m998b("-------------buildQueue empty for:" + c0499j.f3496j);
                        Core.m998b("-------------");
                    } else {
                        m3441f.remove(0);
                    }
                }
                AbstractC0197n.m5053c(this.f3499a);
                ((InterfaceC0501l) this.f3499a).mo3437a(c0499j);
                return;
            }
            return;
        }
        m3454a((C0499j) null);
        this.f3503e = 0.0f;
        if (this.f3502d.f6894a > 0) {
            C0499j c0499j2 = (C0499j) this.f3502d.get(0);
            if (c0499j2.f3486b > 10.0f && c0499j2.f3497m <= 0.0f) {
                c0499j2.f3497m = 1.0f;
                AbstractC0224s a = this.f3499a.m4788a(c0499j2.f3496j);
                if (a != null && a.m4907Q()) {
                    a.m4899a(this.f3499a);
                }
            }
        }
    }

    /* renamed from: e */
    public void m3442e() {
        Iterator it = this.f3501c.iterator();
        while (it.hasNext()) {
            C0499j c0499j = (C0499j) it.next();
            if (this.f3499a.m4788a(c0499j.f3496j) == null) {
                m3446b(c0499j);
                m3444c(c0499j);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void m3450a(boolean z) {
        Iterator it = this.f3501c.iterator();
        while (it.hasNext()) {
            C0499j c0499j = (C0499j) it.next();
            if (z) {
                m3446b(c0499j);
            }
            m3444c(c0499j);
            it.remove();
        }
    }

    /* renamed from: b */
    private void m3446b(C0499j c0499j) {
        if (((InterfaceC0501l) this.f3499a).mo3435c(c0499j)) {
            if (c0499j.f3495d != null && c0499j.f3498n > 0.0d) {
                c0499j.f3495d.m4122a((AbstractC0244am) this.f3499a, c0499j.f3498n, true);
            }
            c0499j.f3494c.m4084h(this.f3499a);
        }
    }

    /* renamed from: c */
    private void m3444c(C0499j c0499j) {
    }

    /* renamed from: a */
    public int m3457a(InterfaceC0303as interfaceC0303as) {
        int i = 0;
        int i2 = this.f3501c.f6894a;
        if (i2 != 0) {
            Object[] m534a = this.f3501c.m534a();
            for (int i3 = 0; i3 < i2; i3++) {
                C0499j c0499j = (C0499j) m534a[i3];
                if (c0499j.f3488f && c0499j.f3489g == interfaceC0303as) {
                    i += c0499j.f3485a;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m3465a(C0208c c0208c, boolean z) {
        return m3464a(c0208c, z, false);
    }

    /* renamed from: a */
    public int m3455a(C0448g c0448g) {
        if (c0448g == null) {
            return this.f3501c.f6894a;
        }
        int i = 0;
        Iterator it = this.f3501c.iterator();
        while (it.hasNext()) {
            if (C0448g.m3961a(c0448g, ((C0499j) it.next()).f3487e)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m3464a(C0208c c0208c, boolean z, boolean z2) {
        int i = 0;
        if (this.f3501c.f6894a != 0) {
            Iterator it = this.f3501c.iterator();
            while (it.hasNext()) {
                C0499j c0499j = (C0499j) it.next();
                if (AbstractC0224s.f1462i == c0208c || c0499j.f3496j.equals(c0208c)) {
                    if (!z2 || c0499j.f3488f) {
                        i += c0499j.f3485a;
                    }
                }
            }
        }
        if (z && this.f3502d.f6894a != 0) {
            Iterator it2 = this.f3502d.iterator();
            while (it2.hasNext()) {
                C0499j c0499j2 = (C0499j) it2.next();
                if (AbstractC0224s.f1462i == c0208c || c0499j2.f3496j.equals(c0208c)) {
                    if (!z2 || c0499j2.f3488f) {
                        if (!c0499j2.f3492k) {
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
    public AbstractC0224s m3447b(InterfaceC0303as interfaceC0303as) {
        ArrayList N = this.f3499a.mo3174N();
        int size = N.size();
        for (int i = 0; i < size; i++) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) N.get(i);
            if (abstractC0224s != null && (abstractC0224s instanceof AbstractC0228w)) {
                AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
                if (abstractC0228w.mo6163i() == interfaceC0303as) {
                    return abstractC0228w;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0499j m3461a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (abstractC0224s instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
            if (!z) {
                if (abstractC0224s.mo3086a((AbstractC0244am) this.f3499a, false) && abstractC0224s.mo3084b(this.f3499a)) {
                    if ((!abstractC0228w.mo3078g() || this.f3499a.f1609bV.m5007u() < this.f3499a.f1609bV.m5006v()) && abstractC0228w.mo4866B().m4128c(this.f3499a)) {
                        return m3459a(abstractC0228w, false, pointF, abstractC0244am);
                    }
                    return null;
                }
                return null;
            }
            C0499j m3448b = m3448b(abstractC0228w, false);
            if (m3448b != null) {
                m3446b(m3448b);
                m3444c(m3448b);
                return m3448b;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m3462a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
            if (!z) {
                if (abstractC0224s.mo3086a((AbstractC0244am) this.f3499a, true)) {
                    if ((!abstractC0228w.mo3078g() || this.f3499a.f1609bV.m5007u() < this.f3499a.f1609bV.m5006v()) && abstractC0228w.mo4866B().m4103b(this.f3499a, abstractC0224s.m4907Q())) {
                        m3460a(abstractC0228w, true);
                    }
                }
            } else if (m3448b(abstractC0228w, true) != null) {
                abstractC0228w.mo4866B().m4087e(this.f3499a, abstractC0224s.m4907Q());
            }
        }
    }

    /* renamed from: a */
    public void m3463a(AbstractC0224s abstractC0224s) {
        if (this.f3502d.size() != 0) {
            C0499j c0499j = null;
            Iterator it = this.f3502d.iterator();
            while (it.hasNext()) {
                C0499j c0499j2 = (C0499j) it.next();
                if (c0499j2.f3496j.equals(abstractC0224s.m4910N())) {
                    c0499j = c0499j2;
                }
            }
            if (c0499j != null) {
                if (!c0499j.f3492k) {
                    c0499j.f3494c.m4087e(this.f3499a, abstractC0224s.m4907Q());
                } else {
                    c0499j.f3494c.m4089d(this.f3499a, abstractC0224s.m4907Q());
                }
                this.f3502d.remove(c0499j);
            }
        }
    }

    /* renamed from: f */
    public List m3441f() {
        return this.f3501c;
    }

    /* renamed from: g */
    public C1101m m3440g() {
        return this.f3501c;
    }
}
