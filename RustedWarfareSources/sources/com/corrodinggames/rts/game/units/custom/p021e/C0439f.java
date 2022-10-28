package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/f.class */
public final class C0439f {

    /* renamed from: a */
    public static final C0439f f2801a = new C0439f().m3821a();

    /* renamed from: b */
    public final C1101m f2802b = new C1101m();

    /* renamed from: c */
    boolean f2803c;

    /* renamed from: a */
    public C0439f m3821a() {
        this.f2803c = true;
        return this;
    }

    /* renamed from: b */
    public void m3802b() {
        this.f2802b.clear();
    }

    /* renamed from: c */
    public boolean m3792c() {
        if (this.f2802b.f6894a == 0) {
            return true;
        }
        int i = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0438e) m534a[i2]).f2800b != 0.0d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public double m3815a(C0428a c0428a) {
        int i = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a == c0428a) {
                return c0438e.f2800b;
            }
        }
        return 0.0d;
    }

    /* renamed from: b */
    public double m3800b(C0428a c0428a) {
        int i = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C0438e c0438e = (C0438e) m534a[i3];
            if (c0438e.f2799a == c0428a) {
                i2 = (int) (i2 + c0438e.f2800b);
            }
            if (c0438e.f2799a.f2754t == c0428a) {
                i2 = (int) (i2 + c0438e.f2800b);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void m3813a(C0439f c0439f) {
        m3802b();
        m3798b(c0439f);
    }

    /* renamed from: a */
    public void m3814a(C0428a c0428a, double d) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a == c0428a) {
                c0438e.f2800b = d;
                return;
            }
        }
        C0438e c0438e2 = new C0438e(c0428a);
        c0438e2.f2800b = d;
        this.f2802b.add(c0438e2);
    }

    /* renamed from: a */
    public void m3820a(double d) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            ((C0438e) m534a[i2]).f2800b *= d;
        }
    }

    /* renamed from: b */
    public void m3799b(C0428a c0428a, double d) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        C1101m c1101m = this.f2802b;
        int i = c1101m.f6894a;
        Object[] m534a = c1101m.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a == c0428a) {
                c0438e.f2800b += d;
                return;
            }
        }
        C0438e c0438e2 = new C0438e(c0428a);
        c0438e2.f2800b = d;
        c1101m.add(c0438e2);
    }

    /* renamed from: c */
    public void m3790c(C0428a c0428a, double d) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        C1101m c1101m = this.f2802b;
        int i = c1101m.f6894a;
        Object[] m534a = c1101m.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a == c0428a) {
                c0438e.f2800b += d;
                return;
            }
        }
        C0438e c0438e2 = new C0438e(c0428a);
        c0438e2.f2800b = d;
        c1101m.add(c0438e2);
    }

    /* renamed from: d */
    public void m3785d(C0428a c0428a, double d) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        m3799b(c0428a, -d);
    }

    /* renamed from: a */
    public void m3816a(C0424b c0424b, double d, double d2) {
        if (c0424b.f2699b >= d && c0424b.f2699b <= d2) {
            m3790c(C0428a.f2762B, c0424b.f2699b);
        }
        m3811a(c0424b.f2708k, d, d2);
    }

    /* renamed from: b */
    public void m3801b(C0424b c0424b, double d, double d2) {
        if (c0424b.f2699b >= d && c0424b.f2699b <= d2) {
            m3790c(C0428a.f2762B, -c0424b.f2699b);
        }
        m3796b(c0424b.f2708k, d, d2);
    }

    /* renamed from: a */
    public void m3817a(C0424b c0424b) {
        m3790c(C0428a.f2762B, c0424b.f2699b);
        m3798b(c0424b.f2708k);
    }

    /* renamed from: b */
    public void m3798b(C0439f c0439f) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            m3799b(c0438e.f2799a, c0438e.f2800b);
        }
    }

    /* renamed from: a */
    public void m3811a(C0439f c0439f, double d, double d2) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2800b >= d && c0438e.f2800b <= d2) {
                m3799b(c0438e.f2799a, c0438e.f2800b);
            }
        }
    }

    /* renamed from: a */
    public void m3812a(C0439f c0439f, double d) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            m3799b(c0438e.f2799a, c0438e.f2800b * d);
        }
    }

    /* renamed from: c */
    public void m3789c(C0439f c0439f) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            m3785d(c0438e.f2799a, c0438e.f2800b);
        }
    }

    /* renamed from: b */
    public void m3796b(C0439f c0439f, double d, double d2) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2800b >= d && c0438e.f2800b <= d2) {
                m3785d(c0438e.f2799a, c0438e.f2800b);
            }
        }
    }

    /* renamed from: a */
    public static C0439f m3807a(C0439f c0439f, C0439f c0439f2) {
        C0439f c0439f3 = new C0439f();
        c0439f3.m3798b(c0439f);
        c0439f3.m3798b(c0439f2);
        return c0439f3;
    }

    /* renamed from: b */
    public static C0439f m3793b(C0439f c0439f, C0439f c0439f2) {
        C0439f c0439f3 = new C0439f();
        c0439f3.m3798b(c0439f);
        c0439f3.m3789c(c0439f2);
        return c0439f3;
    }

    /* renamed from: b */
    public static C0439f m3797b(C0439f c0439f, double d) {
        C0439f c0439f2 = new C0439f();
        c0439f2.m3812a(c0439f, d);
        return c0439f2;
    }

    /* renamed from: d */
    public static C0439f m3784d(C0439f c0439f) {
        C0439f c0439f2 = new C0439f();
        c0439f2.m3798b(c0439f);
        return c0439f2;
    }

    /* renamed from: a */
    public static int m3810a(C0439f c0439f, AbstractC0244am abstractC0244am) {
        double m4421a;
        int i = 9999;
        int i2 = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i3 = 0; i3 < i2; i3++) {
            C0438e c0438e = (C0438e) m534a[i3];
            if (c0438e.f2800b > 0.0d) {
                if (c0438e.f2799a.f2752r) {
                    m4421a = abstractC0244am.f1609bV.m4597c(c0438e.f2799a);
                } else {
                    m4421a = abstractC0244am.m4421a(c0438e.f2799a);
                }
                i = C0758f.m2080c(i, (int) (m4421a / c0438e.f2800b));
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m3795b(C0439f c0439f, AbstractC0244am abstractC0244am) {
        double m4421a;
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a.f2752r) {
                m4421a = abstractC0244am.f1609bV.m4597c(c0438e.f2799a);
            } else {
                m4421a = abstractC0244am.m4421a(c0438e.f2799a);
            }
            if (c0438e.f2800b > m4421a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m3809a(C0439f c0439f, AbstractC0244am abstractC0244am, double d) {
        double m4421a;
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a.f2752r) {
                m4421a = abstractC0244am.f1609bV.m4597c(c0438e.f2799a);
            } else {
                m4421a = abstractC0244am.m4421a(c0438e.f2799a);
            }
            if (c0438e.f2800b * d > m4421a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static void m3788c(C0439f c0439f, AbstractC0244am abstractC0244am) {
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a.f2752r) {
                abstractC0244am.f1609bV.m4646S().m3785d(c0438e.f2799a, c0438e.f2800b);
            } else {
                abstractC0244am.mo1715dd().m3785d(c0438e.f2799a, c0438e.f2800b);
            }
        }
    }

    /* renamed from: b */
    public static void m3794b(C0439f c0439f, AbstractC0244am abstractC0244am, double d) {
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a.f2752r) {
                abstractC0244am.f1609bV.m4646S().m3785d(c0438e.f2799a, c0438e.f2800b * d);
            } else {
                abstractC0244am.mo1715dd().m3785d(c0438e.f2799a, c0438e.f2800b * d);
            }
        }
    }

    /* renamed from: d */
    public static void m3783d(C0439f c0439f, AbstractC0244am abstractC0244am) {
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a.f2752r) {
                abstractC0244am.f1609bV.m4646S().m3799b(c0438e.f2799a, c0438e.f2800b);
            } else {
                abstractC0244am.mo1715dd().m3799b(c0438e.f2799a, c0438e.f2800b);
            }
        }
    }

    /* renamed from: c */
    public static void m3787c(C0439f c0439f, AbstractC0244am abstractC0244am, double d) {
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a.f2752r) {
                abstractC0244am.f1609bV.m4646S().m3799b(c0438e.f2799a, c0438e.f2800b * d);
            } else {
                abstractC0244am.mo1715dd().m3799b(c0438e.f2799a, c0438e.f2800b * d);
            }
        }
    }

    /* renamed from: a */
    public static boolean m3808a(C0439f c0439f, AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        boolean z = false;
        int i = c0439f.f2802b.f6894a;
        Object[] m534a = c0439f.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            C0428a c0428a = c0438e.f2799a;
            double d = c0438e.f2800b;
            if (d != 0.0d) {
                double mo3832a = c0428a.mo3832a(abstractC0244am);
                double mo3832a2 = c0428a.mo3832a(abstractC0244am2);
                if (d >= 0.0d) {
                    if (mo3832a > 0.0d) {
                        double m2162a = C0758f.m2162a(mo3832a, d);
                        c0428a.mo3830b(abstractC0244am, -m2162a);
                        c0428a.mo3830b(abstractC0244am2, m2162a);
                        z = true;
                    }
                } else if (mo3832a2 > 0.0d) {
                    double m2162a2 = C0758f.m2162a(mo3832a2, -d);
                    c0428a.mo3830b(abstractC0244am2, -m2162a2);
                    c0428a.mo3830b(abstractC0244am, m2162a2);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public String m3803a(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        C0813u c0813u = new C0813u();
        m3806a(c0813u, z, z2, i, z3, z4, null, 0);
        return c0813u.m1711a();
    }

    /* renamed from: a */
    public void m3806a(C0813u c0813u, boolean z, boolean z2, int i, boolean z3, boolean z4, AbstractC0244am abstractC0244am, int i2) {
        String str;
        int i3 = this.f2802b.f6894a;
        if (i3 == 0) {
            return;
        }
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i4 = 0;
        Object[] m534a = this.f2802b.m534a();
        for (int i5 = 0; i5 < i3; i5++) {
            C0438e c0438e = (C0438e) m534a[i5];
            if ((c0438e.f2800b > 0.0d || z4) && i4 < i) {
                C0428a c0428a = c0438e.f2799a;
                if (z3 || !c0428a.m3853a()) {
                    boolean z5 = false;
                    if (c0428a.f2757w != null && c0428a.f2758x) {
                        z5 = true;
                        int m1699c = c0813u.m1699c() - 2;
                        if (m1699c < 2) {
                            m1699c = 2;
                        }
                        c0813u.m1707a(c0428a.f2757w, m1699c * 3, m1699c);
                    }
                    String str2 = c0428a.m3850a(c0438e.f2800b, false, z5) + str;
                    boolean z6 = false;
                    int i6 = 0;
                    if (c0428a.f2746l != null && c0428a.f2747m) {
                        z6 = true;
                        i6 = c0428a.f2746l.intValue();
                    }
                    if (abstractC0244am != null && c0428a.mo3832a(abstractC0244am) < c0438e.f2800b) {
                        z6 = true;
                        i6 = i2;
                    }
                    if (z6) {
                        c0813u.m1705a(str2, i6);
                    } else {
                        c0813u.m1700b(str2);
                    }
                    i4++;
                }
            }
        }
    }

    /* renamed from: a */
    public void m3805a(StreamWriter streamWriter) {
        if (this.f2802b.f6894a == 0) {
            streamWriter.mo1355c(-1);
            return;
        }
        streamWriter.mo1355c(0);
        streamWriter.mo1315a((short) this.f2802b.f6894a);
        int i = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            streamWriter.WriteUTF(c0438e.f2799a.f2736b);
            streamWriter.m1385a(c0438e.f2800b);
        }
    }

    /* renamed from: a */
    public void m3804a(Reader reader) {
        if (this.f2803c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (reader.m1289d() == -1) {
            return;
        }
        int m1270v = reader.m1270v();
        this.f2802b.clear();
        for (int i = 0; i < m1270v; i++) {
            C0428a m3843b = C0428a.m3843b(reader.ReadUTF());
            double m1284h = reader.m1284h();
            if (m3843b != null && m1284h != 0.0d) {
                this.f2802b.add(new C0438e(m3843b, m1284h));
            }
        }
    }

    /* renamed from: d */
    public int m3786d() {
        int i = 0;
        int i2 = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i3 = 0; i3 < i2; i3++) {
            if (((C0438e) m534a[i3]).f2800b != 0.0d) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public boolean m3781e(C0439f c0439f) {
        if (m3786d() != c0439f.m3786d()) {
            return false;
        }
        int i = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (!C0758f.m2110b(c0438e.f2800b, c0439f.m3815a(c0438e.f2799a))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m3780f(C0439f c0439f) {
        int i = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2800b > 0.0d && c0439f.m3800b(c0438e.f2799a) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0439f m3819a(AbstractC0244am abstractC0244am) {
        double m4421a;
        C0439f c0439f = new C0439f();
        int i = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0438e c0438e = (C0438e) m534a[i2];
            if (c0438e.f2799a.f2752r) {
                m4421a = abstractC0244am.f1609bV.m4597c(c0438e.f2799a);
            } else {
                m4421a = abstractC0244am.m4421a(c0438e.f2799a);
            }
            if (m4421a < c0438e.f2800b) {
                c0439f.m3799b(c0438e.f2799a, c0438e.f2800b - m4421a);
            }
        }
        if (c0439f.m3792c()) {
            return f2801a;
        }
        return c0439f;
    }

    /* renamed from: a */
    public String m3818a(AbstractC0244am abstractC0244am, String str, int i, boolean z) {
        double m4421a;
        String str2 = null;
        int i2 = 0;
        int i3 = this.f2802b.f6894a;
        Object[] m534a = this.f2802b.m534a();
        for (int i4 = 0; i4 < i3; i4++) {
            C0438e c0438e = (C0438e) m534a[i4];
            if (z || !c0438e.f2799a.m3853a()) {
                if (c0438e.f2799a.f2752r) {
                    m4421a = abstractC0244am.f1609bV.m4597c(c0438e.f2799a);
                } else {
                    m4421a = abstractC0244am.m4421a(c0438e.f2799a);
                }
                if (m4421a < c0438e.f2800b) {
                    double d = c0438e.f2800b - m4421a;
                    String m3836h = c0438e.f2799a.m3836h();
                    if (str2 == null) {
                        str2 = m3836h;
                    } else {
                        str2 = str2 + str + m3836h;
                    }
                    i2++;
                    if (i2 > i) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return str2;
    }

    /* renamed from: g */
    public void m3779g(C0439f c0439f) {
        m3802b();
        m3798b(c0439f);
    }

    /* renamed from: c */
    public void m3791c(C0428a c0428a) {
        C1101m c1101m = this.f2802b;
        int i = c1101m.f6894a;
        Object[] m534a = c1101m.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0438e) m534a[i2]).f2799a == c0428a) {
                return;
            }
        }
        C0438e c0438e = new C0438e(c0428a);
        c0438e.f2800b = 0.0d;
        c1101m.add(c0438e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.custom.e.f$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/f$1.class */
    public class C04401 implements Comparator {
        C04401() {
        }

        /* renamed from: a */
        public int mo3778a(C0438e c0438e, C0438e c0438e2) {
            if (c0438e.f2799a == null || c0438e2.f2799a == null) {
                return 0;
            }
            return Float.compare(c0438e.f2799a.f2756v, c0438e2.f2799a.f2756v);
        }
    }

    /* renamed from: e */
    public void m3782e() {
        Collections.sort(this.f2802b, new C04401());
    }
}
