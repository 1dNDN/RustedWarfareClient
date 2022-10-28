package com.corrodinggames.rts.game.units.p027f;

import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.utility.C1112u;

/* renamed from: com.corrodinggames.rts.game.units.f.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/c.class */
public final class C0538c {

    /* renamed from: a */
    int f3712a;

    /* renamed from: b */
    int f3713b;

    /* renamed from: c */
    float f3714c;

    /* renamed from: d */
    float f3715d;

    /* renamed from: e */
    public C0536a[][] f3716e = null;

    /* renamed from: f */
    C0539d f3717f = new C0539d();

    /* renamed from: g */
    C0542g f3718g = new C0542g();

    /* renamed from: h */
    C0543h f3719h = new C0543h();

    /* renamed from: i */
    final C1112u f3720i = new C1112u();

    /* renamed from: j */
    final C0541f f3721j = new C0541f();

    /* renamed from: k */
    final Rect f3722k = new Rect();

    /* renamed from: l */
    final int f3723l = 32;

    /* renamed from: m */
    int f3724m;

    /* renamed from: a */
    public void m3170a(float f, float f2, float f3, AbstractC0623y abstractC0623y, float f4, AbstractC0544i abstractC0544i) {
        this.f3718g.m3157a(f - f3, f2 - f3, f + f3, f2 + f3);
        m3168a(this.f3718g.f3735a, this.f3718g, abstractC0623y, f4, abstractC0544i);
    }

    /* renamed from: a */
    public final C0541f m3171a(float f, float f2, float f3) {
        C1112u c1112u = this.f3720i;
        c1112u.clear();
        m3169a(f, f2, f3, c1112u);
        this.f3721j.m3158a(c1112u);
        return this.f3721j;
    }

    /* renamed from: a */
    public final void m3169a(float f, float f2, float f3, C1112u c1112u) {
        C0536a[][] c0536aArr = this.f3716e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int m3172a = m3172a(f4);
        int m3172a2 = m3172a(f5);
        int m3163b = m3163b(f6);
        int m3163b2 = m3163b(f7);
        for (int i = m3172a; i <= m3172a2; i++) {
            for (int i2 = m3163b; i2 <= m3163b2; i2++) {
                C0537b c0537b = c0536aArr[i][i2].f3704a;
                AbstractC0244am[] m3176a = c0537b.m3176a();
                int i3 = c0537b.f3710b;
                for (int i4 = 0; i4 < i3; i4++) {
                    AbstractC0244am abstractC0244am = m3176a[i4];
                    float f8 = abstractC0244am.f6957el;
                    float f9 = abstractC0244am.f6958em;
                    if (f4 <= f8 && f8 <= f5 && f6 <= f9 && f9 <= f7) {
                        c1112u.mo499a(abstractC0244am);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final C0541f m3162b(float f, float f2, float f3) {
        C1112u c1112u = this.f3720i;
        c1112u.clear();
        m3161b(f, f2, f3, c1112u);
        this.f3721j.m3158a(c1112u);
        return this.f3721j;
    }

    /* renamed from: b */
    public final void m3161b(float f, float f2, float f3, C1112u c1112u) {
        C0536a[][] c0536aArr = this.f3716e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int m3172a = m3172a(f4 - 50.0f);
        int m3172a2 = m3172a(f5 + 50.0f);
        int m3163b = m3163b(f6 - 50.0f);
        int m3163b2 = m3163b(f7 + 50.0f);
        for (int i = m3172a; i <= m3172a2; i++) {
            for (int i2 = m3163b; i2 <= m3163b2; i2++) {
                C0537b c0537b = c0536aArr[i][i2].f3704a;
                AbstractC0244am[] m3176a = c0537b.m3176a();
                int i3 = c0537b.f3710b;
                for (int i4 = 0; i4 < i3; i4++) {
                    AbstractC0244am abstractC0244am = m3176a[i4];
                    float f8 = abstractC0244am.f6957el;
                    float f9 = abstractC0244am.f6958em;
                    float f10 = abstractC0244am.f1621ch;
                    if (f4 - f10 <= f8 && f8 <= f5 + f10 && f6 - f10 <= f9 && f9 <= f7 + f10) {
                        c1112u.m495b(abstractC0244am);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3166a(AbstractC0197n abstractC0197n, float f, float f2, float f3, C1112u c1112u) {
        C0536a[][] c0536aArr = this.f3716e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int m3172a = m3172a(f4 - 50.0f);
        int m3172a2 = m3172a(f5 + 50.0f);
        int m3163b = m3163b(f6 - 50.0f);
        int m3163b2 = m3163b(f7 + 50.0f);
        int i = abstractC0197n.f1306k;
        for (int i2 = m3172a; i2 <= m3172a2; i2++) {
            for (int i3 = m3163b; i3 <= m3163b2; i3++) {
                C0537b c0537b = c0536aArr[i2][i3].f3705b[i];
                AbstractC0244am[] m3176a = c0537b.m3176a();
                int i4 = c0537b.f3710b;
                for (int i5 = 0; i5 < i4; i5++) {
                    AbstractC0244am abstractC0244am = m3176a[i5];
                    float f8 = abstractC0244am.f6957el;
                    float f9 = abstractC0244am.f6958em;
                    float f10 = abstractC0244am.f1621ch;
                    if (f4 - f10 <= f8 && f8 <= f5 + f10 && f6 - f10 <= f9 && f9 <= f7 + f10) {
                        c1112u.m495b(abstractC0244am);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3168a(RectF rectF, AbstractC0540e abstractC0540e, AbstractC0623y abstractC0623y, float f, AbstractC0544i abstractC0544i) {
        C0536a[][] c0536aArr = this.f3716e;
        int m3172a = m3172a(rectF.f234a);
        int m3172a2 = m3172a(rectF.f236c);
        int m3163b = m3163b(rectF.f235b);
        int m3163b2 = m3163b(rectF.f237d);
        AbstractC0197n abstractC0197n = null;
        int excludeTeam = abstractC0544i.excludeTeam(abstractC0623y);
        if (excludeTeam != -2 && excludeTeam != -3) {
            abstractC0197n = AbstractC0197n.m4638k(excludeTeam);
        }
        AbstractC0197n onlyEnemiesOfTeam = abstractC0544i.onlyEnemiesOfTeam(abstractC0623y);
        AbstractC0197n onlyTeam = abstractC0544i.onlyTeam(abstractC0623y);
        abstractC0544i.setup(abstractC0623y, f);
        if (onlyEnemiesOfTeam == null && onlyTeam == null) {
            for (int i = m3172a; i <= m3172a2; i++) {
                for (int i2 = m3163b; i2 <= m3163b2; i2++) {
                    C0537b c0537b = c0536aArr[i][i2].f3704a;
                    AbstractC0244am[] m3176a = c0537b.m3176a();
                    int i3 = c0537b.f3710b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        AbstractC0244am abstractC0244am = m3176a[i4];
                        if ((abstractC0197n == null || abstractC0244am.f1609bV != abstractC0197n) && abstractC0540e.mo3156a(abstractC0244am)) {
                            abstractC0544i.callback(abstractC0623y, f, abstractC0244am);
                        }
                    }
                }
            }
        } else if (onlyTeam != null) {
            int i5 = onlyTeam.f1306k;
            if (i5 == -1) {
                for (int i6 = m3172a; i6 <= m3172a2; i6++) {
                    for (int i7 = m3163b; i7 <= m3163b2; i7++) {
                        C0537b c0537b2 = c0536aArr[i6][i7].f3707d;
                        if (c0537b2.f3710b > 0) {
                            AbstractC0244am[] m3176a2 = c0537b2.m3176a();
                            int i8 = c0537b2.f3710b;
                            for (int i9 = 0; i9 < i8; i9++) {
                                AbstractC0244am abstractC0244am2 = m3176a2[i9];
                                if (abstractC0540e.mo3156a(abstractC0244am2)) {
                                    abstractC0544i.callback(abstractC0623y, f, abstractC0244am2);
                                }
                            }
                        }
                    }
                }
            } else if (i5 == -2) {
                for (int i10 = m3172a; i10 <= m3172a2; i10++) {
                    for (int i11 = m3163b; i11 <= m3163b2; i11++) {
                        C0537b c0537b3 = c0536aArr[i10][i11].f3706c;
                        if (c0537b3.f3710b > 0) {
                            AbstractC0244am[] m3176a3 = c0537b3.m3176a();
                            int i12 = c0537b3.f3710b;
                            for (int i13 = 0; i13 < i12; i13++) {
                                AbstractC0244am abstractC0244am3 = m3176a3[i13];
                                if (abstractC0540e.mo3156a(abstractC0244am3)) {
                                    abstractC0544i.callback(abstractC0623y, f, abstractC0244am3);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i14 = m3172a; i14 <= m3172a2; i14++) {
                    for (int i15 = m3163b; i15 <= m3163b2; i15++) {
                        C0537b c0537b4 = c0536aArr[i14][i15].f3705b[i5];
                        if (c0537b4.f3710b > 0) {
                            AbstractC0244am[] m3176a4 = c0537b4.m3176a();
                            int i16 = c0537b4.f3710b;
                            for (int i17 = 0; i17 < i16; i17++) {
                                AbstractC0244am abstractC0244am4 = m3176a4[i17];
                                if (abstractC0540e.mo3156a(abstractC0244am4)) {
                                    abstractC0544i.callback(abstractC0623y, f, abstractC0244am4);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (onlyEnemiesOfTeam != AbstractC0197n.f1370h) {
                for (int i18 = m3172a; i18 <= m3172a2; i18++) {
                    for (int i19 = m3163b; i19 <= m3163b2; i19++) {
                        C0537b c0537b5 = c0536aArr[i18][i19].f3706c;
                        if (c0537b5.f3710b > 0) {
                            AbstractC0244am[] m3176a5 = c0537b5.m3176a();
                            int i20 = c0537b5.f3710b;
                            for (int i21 = 0; i21 < i20; i21++) {
                                AbstractC0244am abstractC0244am5 = m3176a5[i21];
                                if (abstractC0540e.mo3156a(abstractC0244am5)) {
                                    abstractC0544i.callback(abstractC0623y, f, abstractC0244am5);
                                }
                            }
                        }
                    }
                }
            }
            int i22 = this.f3724m;
            for (int i23 = 0; i23 <= i22; i23++) {
                AbstractC0197n m4638k = AbstractC0197n.m4638k(i23);
                if (m4638k != null && onlyEnemiesOfTeam != m4638k && onlyEnemiesOfTeam.m4675c(m4638k)) {
                    for (int i24 = m3172a; i24 <= m3172a2; i24++) {
                        for (int i25 = m3163b; i25 <= m3163b2; i25++) {
                            C0537b c0537b6 = c0536aArr[i24][i25].f3705b[i23];
                            if (c0537b6.f3710b > 0) {
                                AbstractC0244am[] m3176a6 = c0537b6.m3176a();
                                int i26 = c0537b6.f3710b;
                                for (int i27 = 0; i27 < i26; i27++) {
                                    AbstractC0244am abstractC0244am6 = m3176a6[i27];
                                    if (abstractC0540e.mo3156a(abstractC0244am6)) {
                                        abstractC0544i.callback(abstractC0623y, f, abstractC0244am6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int m3172a(float f) {
        int i = (int) (f * this.f3714c);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    /* renamed from: b */
    public final int m3163b(float f) {
        int i = (int) (f * this.f3715d);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    /* renamed from: a */
    public void m3173a() {
        float f = this.f3714c;
        float f2 = this.f3715d;
        AbstractC0244am[] m503a = AbstractC0244am.f1590bD.m503a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m503a[i];
            if (abstractC0244am.f1607bT || ((int) (abstractC0244am.f6957el * f)) != abstractC0244am.f1675dj || ((int) (abstractC0244am.f6958em * f2)) != abstractC0244am.f1676dk || abstractC0244am.f1609bV == null || abstractC0244am.f1677dl != abstractC0244am.f1609bV.f1306k) {
                m3165a(abstractC0244am);
            }
        }
    }

    /* renamed from: a */
    public void m3165a(AbstractC0244am abstractC0244am) {
        if (this.f3716e == null) {
            if (LoggerMaybe.m1079A().f6239bx != 0) {
                LoggerMaybe.m990b("updateUnitGeoIndex: areaList not active");
            }
            abstractC0244am.f1675dj = -1;
            abstractC0244am.f1676dk = -1;
        } else if (abstractC0244am.f1607bT) {
            if (abstractC0244am.f1675dj != -1 && abstractC0244am.f1676dk != -1) {
                this.f3716e[abstractC0244am.f1675dj][abstractC0244am.f1676dk].m3177b(abstractC0244am);
                abstractC0244am.f1675dj = -1;
                abstractC0244am.f1676dk = -1;
            }
        } else {
            int m3172a = m3172a(abstractC0244am.f6957el);
            int m3163b = m3163b(abstractC0244am.f6958em);
            int i = -2;
            if (abstractC0244am.f1609bV != null) {
                i = abstractC0244am.f1609bV.f1306k;
            }
            if (abstractC0244am.f1675dj == m3172a && abstractC0244am.f1676dk == m3163b && abstractC0244am.f1677dl == i) {
                return;
            }
            if (abstractC0244am.f1675dj != -1 && abstractC0244am.f1676dk != -1) {
                this.f3716e[abstractC0244am.f1675dj][abstractC0244am.f1676dk].m3177b(abstractC0244am);
            }
            abstractC0244am.f1675dj = m3172a;
            abstractC0244am.f1676dk = m3163b;
            abstractC0244am.f1677dl = i;
            if (i > this.f3724m && this.f3724m < AbstractC0197n.f1365c) {
                this.f3724m = i;
            }
            this.f3716e[abstractC0244am.f1675dj][abstractC0244am.f1676dk].m3178a(abstractC0244am);
        }
    }

    /* renamed from: a */
    public void m3167a(C0173b c0173b) {
        this.f3716e = new C0536a[32][32];
        this.f3724m = 0;
        for (int i = 0; i < 32; i++) {
            for (int i2 = 0; i2 < 32; i2++) {
                this.f3716e[i][i2] = new C0536a();
            }
        }
        this.f3712a = (c0173b.f792C * c0173b.f785n) / 32;
        this.f3713b = (c0173b.f793D * c0173b.f786o) / 32;
        this.f3714c = 1.0f / this.f3712a;
        this.f3715d = 1.0f / this.f3713b;
    }

    /* renamed from: b */
    public void m3164b() {
        this.f3716e = null;
    }

    /* renamed from: c */
    public void m3160c(float f) {
    }
}
