package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/j.class */
public abstract class AbstractC0773j {

    /* renamed from: g */
    float f5031g;

    /* renamed from: h */
    float f5032h;

    /* renamed from: k */
    float f5035k;

    /* renamed from: l */
    float f5036l;

    /* renamed from: m */
    float f5037m;

    /* renamed from: n */
    float f5038n;

    /* renamed from: o */
    float f5039o;

    /* renamed from: p */
    float f5040p;

    /* renamed from: q */
    float f5041q;

    /* renamed from: r */
    float f5042r;

    /* renamed from: u */
    boolean f5045u;

    /* renamed from: v */
    AbstractC0773j f5046v;

    /* renamed from: y */
    float f5049y;

    /* renamed from: z */
    float f5050z;

    /* renamed from: B */
    AbstractC0772i f5052B;

    /* renamed from: e */
    static final PointF f5029e = new PointF();

    /* renamed from: f */
    static final RectF f5030f = new RectF();

    /* renamed from: A */
    static final PointF f5051A = new PointF();

    /* renamed from: i */
    float f5033i = 50.0f;

    /* renamed from: j */
    float f5034j = 50.0f;

    /* renamed from: s */
    boolean f5043s = false;

    /* renamed from: t */
    boolean f5044t = false;

    /* renamed from: w */
    C1101m f5047w = new C1101m();

    /* renamed from: x */
    EnumC0774k f5048x = EnumC0774k.vertical;

    /* renamed from: a */
    public String mo1959a() {
        return getClass().getSimpleName();
    }

    /* renamed from: d */
    public InterfaceC1027y m1937d() {
        return LoggerMaybe.m1079A().f6113bO;
    }

    /* renamed from: a */
    public RectF m1949a(RectF rectF, float f, float f2) {
        rectF.f234a = 0.0f + f;
        rectF.f235b = 0.0f + f2;
        rectF.f236c = 0.0f + this.f5033i + f;
        rectF.f237d = 0.0f + this.f5034j + f2;
        return rectF;
    }

    /* renamed from: a */
    public RectF m1950a(RectF rectF) {
        f5051A.f227a = this.f5031g;
        f5051A.f228b = this.f5032h;
        if (this.f5046v != null) {
            this.f5046v.m1951a(f5051A);
        }
        rectF.f234a = 0.0f + f5051A.f227a;
        rectF.f235b = 0.0f + f5051A.f228b;
        rectF.f236c = 0.0f + this.f5033i + f5051A.f227a;
        rectF.f237d = 0.0f + this.f5034j + f5051A.f228b;
        return rectF;
    }

    /* renamed from: b */
    public void mo1955b() {
        Iterator it = this.f5047w.iterator();
        while (it.hasNext()) {
            ((AbstractC0773j) it.next()).mo1955b();
        }
        this.f5049y = 0.0f;
        this.f5050z = 0.0f;
        if (this.f5048x != EnumC0774k.none) {
            if (this.f5048x == EnumC0774k.vertical) {
                float f = 0.0f;
                float f2 = 0.0f;
                Iterator it2 = this.f5047w.iterator();
                while (it2.hasNext()) {
                    AbstractC0773j abstractC0773j = (AbstractC0773j) it2.next();
                    if (abstractC0773j.f5033i > f) {
                        f = abstractC0773j.m1931g();
                    }
                    f2 += abstractC0773j.m1930h();
                }
                this.f5049y = f2;
                this.f5050z = f;
                m1942b(this.f5050z * 0.5f, this.f5049y * 0.5f, this.f5047w);
            } else if (this.f5048x == EnumC0774k.horizontal) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                Iterator it3 = this.f5047w.iterator();
                while (it3.hasNext()) {
                    AbstractC0773j abstractC0773j2 = (AbstractC0773j) it3.next();
                    if (abstractC0773j2.f5034j > f3) {
                        f3 = abstractC0773j2.m1930h();
                    }
                    f4 += abstractC0773j2.m1931g();
                }
                this.f5049y = f3;
                this.f5050z = f4;
                m1952a(this.f5050z * 0.5f, this.f5049y * 0.5f, this.f5047w);
            } else {
                throw new RuntimeException("Unknown layout style:" + this.f5048x);
            }
        }
        this.f5043s = false;
    }

    /* renamed from: a */
    public static void m1952a(float f, float f2, C1101m c1101m) {
        float f3 = 0.0f;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            f3 += ((AbstractC0773j) it.next()).m1931g();
        }
        float f4 = f - (f3 * 0.5f);
        Iterator it2 = c1101m.iterator();
        while (it2.hasNext()) {
            AbstractC0773j abstractC0773j = (AbstractC0773j) it2.next();
            float f5 = f4 + abstractC0773j.f5041q;
            abstractC0773j.f5031g = f5;
            f4 = f5 + abstractC0773j.f5033i + abstractC0773j.f5042r;
            abstractC0773j.m1936d(f2);
        }
    }

    /* renamed from: b */
    public static void m1942b(float f, float f2, C1101m c1101m) {
        float f3 = 0.0f;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            f3 += ((AbstractC0773j) it.next()).m1930h();
        }
        float f4 = f2 - (f3 * 0.5f);
        Iterator it2 = c1101m.iterator();
        while (it2.hasNext()) {
            AbstractC0773j abstractC0773j = (AbstractC0773j) it2.next();
            float f5 = f4 + abstractC0773j.f5039o;
            abstractC0773j.f5032h = f5;
            f4 = f5 + abstractC0773j.f5034j + abstractC0773j.f5040p;
            abstractC0773j.m1939c(f);
        }
    }

    /* renamed from: a */
    public void m1951a(PointF pointF) {
        if (this.f5046v != null) {
            this.f5046v.m1951a(pointF);
        }
        pointF.f227a += this.f5031g;
        pointF.f228b += this.f5032h;
    }

    /* renamed from: a */
    public void m1946a(AbstractC0773j abstractC0773j) {
        abstractC0773j.m1940b(this);
    }

    /* renamed from: b */
    public void m1940b(AbstractC0773j abstractC0773j) {
        m1945a(abstractC0773j, false);
    }

    /* renamed from: a */
    public void m1945a(AbstractC0773j abstractC0773j, boolean z) {
        if (this.f5046v == abstractC0773j) {
            return;
        }
        if (this.f5046v != null) {
            this.f5046v.f5047w.remove(this);
        }
        this.f5046v = abstractC0773j;
        if (abstractC0773j != null) {
            if (!z) {
                abstractC0773j.f5047w.add(this);
            } else {
                abstractC0773j.f5047w.add(0, this);
            }
        }
        m1935e();
    }

    /* renamed from: e */
    public void m1935e() {
        this.f5043s = true;
        if (this.f5046v != null) {
            this.f5046v.m1935e();
        }
    }

    /* renamed from: b */
    public void m1943b(float f) {
        if (this.f5047w.size() > 0) {
            Iterator it = this.f5047w.iterator();
            while (it.hasNext()) {
                ((AbstractC0773j) it.next()).m1943b(f);
            }
        }
    }

    /* renamed from: f */
    public void m1933f() {
        f5051A.f227a = this.f5031g;
        f5051A.f228b = this.f5032h;
        if (this.f5046v != null) {
            this.f5046v.m1951a(f5051A);
        }
        mo1928a(f5051A.f227a, f5051A.f228b);
        if (this.f5047w.size() > 0) {
            Iterator it = this.f5047w.iterator();
            while (it.hasNext()) {
                ((AbstractC0773j) it.next()).m1933f();
            }
        }
    }

    /* renamed from: a */
    public void mo1928a(float f, float f2) {
        if (this.f5044t) {
            C0770g.f5020d.m1961a(m1937d(), m1949a(new RectF(), f, f2));
        }
    }

    /* renamed from: a */
    public void m1947a(AbstractC0772i abstractC0772i) {
        this.f5052B = abstractC0772i;
    }

    /* renamed from: a */
    public boolean m1948a(C0765c c0765c) {
        if (c0765c.m1971a() && m1938c(c0765c)) {
            LoggerMaybe.LogDebug2("UI click " + mo1959a());
            if (this.f5052B != null) {
                return this.f5052B.mo1414a(c0765c);
            }
            return false;
        } else if (c0765c.m1969b()) {
            if (m1938c(c0765c)) {
                this.f5045u = true;
                return false;
            }
            this.f5045u = false;
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public boolean m1941b(C0765c c0765c) {
        if (this.f5047w.size() > 0) {
            Iterator it = this.f5047w.iterator();
            while (it.hasNext()) {
                if (((AbstractC0773j) it.next()).m1941b(c0765c)) {
                    return true;
                }
            }
        }
        if (m1948a(c0765c)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m1938c(C0765c c0765c) {
        m1950a(f5030f);
        return f5030f.m5448b(c0765c.f5006a, c0765c.f5007b);
    }

    /* renamed from: c */
    public void m1939c(float f) {
        this.f5031g = f - (this.f5033i * 0.5f);
    }

    /* renamed from: d */
    public void m1936d(float f) {
        this.f5032h = f - (this.f5034j * 0.5f);
    }

    /* renamed from: e */
    public void m1934e(float f) {
        this.f5039o = f;
        this.f5040p = f;
        this.f5041q = f;
        this.f5042r = f;
    }

    /* renamed from: f */
    public void m1932f(float f) {
        this.f5035k = f;
        this.f5036l = f;
        this.f5037m = f;
        this.f5038n = f;
    }

    /* renamed from: g */
    public float m1931g() {
        return this.f5041q + this.f5033i + this.f5042r;
    }

    /* renamed from: h */
    public float m1930h() {
        return this.f5039o + this.f5034j + this.f5040p;
    }

    /* renamed from: i */
    public void m1929i() {
        m1940b((AbstractC0773j) null);
    }
}
