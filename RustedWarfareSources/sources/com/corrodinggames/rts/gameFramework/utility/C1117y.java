package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.p014b.AbstractC0309b;
import com.corrodinggames.rts.game.units.p029h.AbstractC0590f;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p042j.C0904i;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/y.class */
public final class C1117y {

    /* renamed from: a */
    static final Paint f6940a = new Paint();

    /* renamed from: b */
    static final RectF f6941b = new RectF();

    /* renamed from: c */
    static ArrayList f6942c = new ArrayList();

    /* renamed from: d */
    static final Rect f6943d;

    /* renamed from: e */
    static final RectF f6944e;

    /* renamed from: f */
    static Paint f6945f;

    /* renamed from: g */
    static C1118z[] f6946g;

    /* renamed from: h */
    static boolean f6947h;

    static {
        f6940a.m5523a(205, 255, 0, 0);
        f6940a.m5516a(Paint.Style.f220b);
        f6943d = new Rect();
        f6944e = new RectF();
        f6945f = new Paint();
        f6946g = new C1118z[30];
        f6947h = false;
    }

    /* renamed from: a */
    public static void m475a(AbstractC0244am abstractC0244am, float f) {
        m470a(abstractC0244am, f, false, false);
    }

    /* renamed from: a */
    public static void m472a(AbstractC0244am abstractC0244am, float f, boolean z) {
        m470a(abstractC0244am, f, z, false);
    }

    /* renamed from: a */
    public static boolean m476a(AbstractC0244am abstractC0244am) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (abstractC0244am.f1644cE && m1079A.f6117bS.m1769p() == 1 && !m1079A.f6117bS.f5114d.f4913e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m470a(AbstractC0244am abstractC0244am, float f, boolean z, boolean z2) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m476a(abstractC0244am) || z) {
            float f2 = abstractC0244am.f6957el - m1079A.f6144cv;
            float f3 = abstractC0244am.f6958em - m1079A.f6145cw;
            Paint paint = AbstractC0244am.f1670de;
            if (z2) {
                paint = AbstractC0244am.f1671df;
            }
            m1079A.f6113bO.mo227a(f2, f3, f, paint);
        }
    }

    /* renamed from: a */
    public static void m473a(AbstractC0244am abstractC0244am, float f, int i, int i2, boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if ((abstractC0244am.f1644cE && m1079A.f6117bS.m1769p() < 10) || z) {
            float f2 = abstractC0244am.f6957el - m1079A.f6144cv;
            float f3 = abstractC0244am.f6958em - m1079A.f6145cw;
            Paint paint = AbstractC0244am.f1674di;
            paint.m5501b(i);
            paint.m5526a(i2);
            m1079A.f6113bO.mo227a(f2, f3, f, paint);
        }
    }

    /* renamed from: b */
    public static void m457b(AbstractC0244am abstractC0244am, float f, boolean z) {
        m471a(abstractC0244am, f, z, AbstractC0244am.f1672dg);
    }

    /* renamed from: a */
    public static void m471a(AbstractC0244am abstractC0244am, float f, boolean z, Paint paint) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m476a(abstractC0244am) || z) {
            m1079A.f6113bO.mo227a(abstractC0244am.f6957el - m1079A.f6144cv, abstractC0244am.f6958em - m1079A.f6145cw, f, paint);
        }
    }

    /* renamed from: a */
    public static void m464a(C0934e c0934e, float f, float f2, float f3, float f4, float f5, Paint paint, int i, int i2, int i3) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int i4 = 0 + (i3 * i);
        f6943d.m5467a(i4, 0, i4 + i, 0 + i2);
        float f6 = f5 * 0.5f;
        float f7 = f2 - f3;
        float f8 = i * f6;
        float f9 = i2 * f6;
        f6944e.m5454a(f - f8, f7 - f9, f + f8, f7 + f9);
        InterfaceC1027y interfaceC1027y = m1079A.f6113bO;
        interfaceC1027y.mo141k();
        interfaceC1027y.mo231a(f4 + 90.0f, f, f7);
        if (f5 != 1.0f) {
            interfaceC1027y.mo230a(f5, f5, f, f7);
        }
        interfaceC1027y.mo197a(c0934e, f6943d, f6944e, paint);
        interfaceC1027y.mo140l();
    }

    /* renamed from: a */
    public static boolean m468a(AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        if (abstractC0244am.mo3209cq() && z2) {
            return false;
        }
        if ((z && ((abstractC0244am instanceof AbstractC0309b) || (abstractC0244am instanceof AbstractC0590f))) || abstractC0244am.m4485bI()) {
            return false;
        }
        if ((z && (abstractC0244am.mo3068ct() || abstractC0244am.mo4161cr())) || abstractC0244am.mo3007P() || abstractC0244am.f1651cL != null || abstractC0244am.f1652cM != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Paint m485a() {
        C0930ag c0930ag = new C0930ag();
        if (LoggerMaybe.m1079A().f6115bQ.renderAntiAlias) {
            c0930ag.mo900a(true);
            c0930ag.m5490d(true);
            c0930ag.m5498b(true);
        } else {
            c0930ag.mo900a(false);
            c0930ag.m5490d(false);
            c0930ag.m5498b(false);
        }
        return c0930ag;
    }

    /* renamed from: b */
    public static C0930ag m463b() {
        C0930ag c0930ag = new C0930ag();
        c0930ag.mo900a(false);
        c0930ag.m5490d(false);
        c0930ag.m5498b(false);
        return c0930ag;
    }

    /* renamed from: a */
    public static void m467a(AbstractC0623y abstractC0623y) {
        if (!abstractC0623y.f1607bT) {
            int mo3097bl = abstractC0623y.mo3097bl();
            for (int i = 0; i < mo3097bl; i++) {
                m466a(abstractC0623y, i);
            }
        }
    }

    /* renamed from: a */
    public static void m465a(AbstractC0623y abstractC0623y, C0934e c0934e, float f, int i) {
        if (!abstractC0623y.f1607bT && f != 0.0f) {
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            C1080ai m2977D = abstractC0623y.m2977D(i);
            m1079A.f6113bO.mo141k();
            m1079A.f6113bO.mo173b(m2977D.f6849a - m1079A.f6144cv, ((m2977D.f6850b - m2977D.f6851c) - abstractC0623y.f6959en) - m1079A.f6145cw);
            m1079A.f6113bO.mo232a(f, f);
            m1079A.f6113bO.mo203a(c0934e, 0.0f, 0.0f, (Paint) null);
            m1079A.f6113bO.mo140l();
        }
    }

    /* renamed from: a */
    public static void m466a(AbstractC0623y abstractC0623y, int i) {
        C0934e mo2997d = abstractC0623y.mo2997d(i);
        if (mo2997d == null) {
            return;
        }
        float m2754p = abstractC0623y.m2754p(i);
        Paint m2892aN = abstractC0623y.m2892aN();
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C1080ai m2973F = abstractC0623y.m2973F(i);
        float f = m2973F.f6849a - LoggerMaybe.m1079A().f6144cv;
        float f2 = ((m2973F.f6850b - LoggerMaybe.m1079A().f6145cw) - abstractC0623y.f6959en) - m2973F.f6851c;
        InterfaceC1027y interfaceC1027y = m1079A.f6113bO;
        interfaceC1027y.mo141k();
        if (m2754p != 1.0f) {
            interfaceC1027y.mo230a(m2754p, m2754p, f, f2);
        }
        interfaceC1027y.mo231a(abstractC0623y.f1649cJ[i].f1712a + 90.0f, f, f2);
        interfaceC1027y.mo165b(mo2997d, (f - mo2997d.f6406t) - abstractC0623y.m2779h(i), (f2 - mo2997d.f6407u) - abstractC0623y.m2775i(i), m2892aN);
        interfaceC1027y.mo140l();
    }

    /* renamed from: a */
    public static boolean m474a(AbstractC0244am abstractC0244am, float f, float f2) {
        return !m481a(f, f2, abstractC0244am.mo2991h());
    }

    /* renamed from: a */
    public static boolean m481a(float f, float f2, EnumC0246ao enumC0246ao) {
        C0907l c0907l = LoggerMaybe.m1079A().f6119bU;
        C0173b c0173b = LoggerMaybe.m1079A().f6110bL;
        c0173b.m4961a(f, f2);
        return c0907l.m1158a(enumC0246ao, c0173b.f801T, c0173b.f802U);
    }

    /* renamed from: b */
    public static short m460b(float f, float f2, EnumC0246ao enumC0246ao) {
        C0907l c0907l = LoggerMaybe.m1079A().f6119bU;
        C0173b c0173b = LoggerMaybe.m1079A().f6110bL;
        C0904i m1159a = c0907l.m1159a(enumC0246ao);
        if (m1159a.f5963g == null) {
            return (short) -3;
        }
        c0173b.m4961a(f, f2);
        int i = c0173b.f801T;
        int i2 = c0173b.f802U;
        if (!c0173b.m4917c(i, i2)) {
            return (short) -2;
        }
        return m1159a.f5963g[(i * m1159a.f5959c) + i2];
    }

    /* renamed from: c */
    public static int m455c(float f, float f2, EnumC0246ao enumC0246ao) {
        short m460b = m460b(f, f2, enumC0246ao);
        if (m460b == -3 || m460b == -2 || m460b == -1 || m460b == 0) {
            return 0;
        }
        Integer num = (Integer) LoggerMaybe.m1079A().f6119bU.m1159a(enumC0246ao).f5964h.get(Short.valueOf(m460b));
        if (num == null) {
            LoggerMaybe.m990b("Could not find groupSize for:" + ((int) m460b) + " at X:" + f + " y:" + f2);
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static boolean m483a(float f, float f2) {
        C0173b c0173b = LoggerMaybe.m1079A().f6110bL;
        if (c0173b == null) {
            LoggerMaybe.LogDebug2("isInMap called without map loaded");
            return false;
        }
        return c0173b.m4917c((int) (f * c0173b.f789r), (int) (f2 * c0173b.f790s));
    }

    /* renamed from: b */
    public static boolean m461b(float f, float f2) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0173b c0173b = m1079A.f6110bL;
        if (c0173b == null) {
            LoggerMaybe.LogDebug2("isOverClift called without map loaded");
            return false;
        }
        return m1079A.f6119bU.m1146b((int) (f * c0173b.f789r), (int) (f2 * c0173b.f790s));
    }

    /* renamed from: c */
    public static boolean m456c(float f, float f2) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0173b c0173b = m1079A.f6110bL;
        if (c0173b == null) {
            LoggerMaybe.LogDebug2("isOverWater called without map loaded");
            return false;
        }
        return m1079A.f6119bU.m1161a((int) (f * c0173b.f789r), (int) (f2 * c0173b.f790s));
    }

    /* renamed from: d */
    public static boolean m454d(float f, float f2) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0173b c0173b = m1079A.f6110bL;
        if (c0173b == null) {
            LoggerMaybe.LogDebug2("isOverLiquid called without map loaded");
            return false;
        }
        C0180g m4918c = c0173b.m4918c(f, f2);
        if (m4918c == null) {
            return false;
        }
        if (m4918c.f918e || m4918c.f920g) {
            return true;
        }
        return m1079A.f6119bU.m1161a((int) (f * c0173b.f789r), (int) (f2 * c0173b.f790s));
    }

    /* renamed from: a */
    public static final Paint m479a(int i, int i2, int i3, int i4, Paint.Style style) {
        return m478a(C0758f.m2103b(i, i2, i3, i4), style);
    }

    /* renamed from: a */
    public static final Paint m478a(int i, Paint.Style style) {
        for (int i2 = 0; i2 < f6946g.length; i2++) {
            if (f6946g[i2] == null) {
                C1118z c1118z = new C1118z(i, style);
                f6946g[i2] = c1118z;
                return c1118z.f6950c;
            }
            C1118z c1118z2 = f6946g[i2];
            if (c1118z2.f6948a == i && c1118z2.f6949b == style) {
                return c1118z2.f6950c;
            }
        }
        if (!f6947h) {
            f6947h = true;
            LoggerMaybe.m990b("----- getCachingPaint --- Paint fallback was needed!!");
        }
        f6945f.m5501b(i);
        f6945f.m5516a(style);
        return f6945f;
    }

    /* renamed from: a */
    public static void m484a(float f) {
        if (f6942c.size() == 0) {
            return;
        }
        Iterator it = f6942c.iterator();
        while (it.hasNext()) {
            C1071aa c1071aa = (C1071aa) it.next();
            if (c1071aa.f6820e <= 0.0f) {
                it.remove();
            } else {
                c1071aa.f6820e -= f;
                if (f == 0.0f && c1071aa.f6820e < 1.0f) {
                    c1071aa.f6820e = -1.0f;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m462b(float f) {
        if (f6942c.size() == 0) {
            return;
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        Iterator it = f6942c.iterator();
        while (it.hasNext()) {
            C1071aa c1071aa = (C1071aa) it.next();
            float f2 = c1071aa.f6817b.f234a;
            float f3 = c1071aa.f6817b.f235b;
            float f4 = c1071aa.f6817b.f236c;
            float f5 = c1071aa.f6817b.f237d;
            if (c1071aa.f6819d) {
                f2 -= LoggerMaybe.m1079A().f6144cv;
                f3 -= LoggerMaybe.m1079A().f6145cw;
                f4 -= LoggerMaybe.m1079A().f6144cv;
                f5 -= LoggerMaybe.m1079A().f6145cw;
            }
            if (c1071aa.f6818c) {
                m1079A.f6113bO.mo229a(f2, f3, f4, f5, c1071aa.f6816a);
            } else {
                if (c1071aa.f6819d) {
                }
                m1079A.f6113bO.mo209a(c1071aa.f6817b, c1071aa.f6816a);
            }
            if (c1071aa.f6821f != null) {
                m1079A.f6113bO.mo143i();
                m1079A.m1062R();
                float f6 = f4;
                float f7 = f5;
                if (c1071aa.f6819d) {
                    f6 *= m1079A.f6256cW;
                    f7 *= m1079A.f6256cW;
                }
                m1079A.f6113bO.mo186a(c1071aa.f6821f, f6, f7, c1071aa.f6816a);
                m1079A.f6113bO.mo142j();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m480a(int i, int i2) {
        int i3 = LoggerMaybe.m1079A().f6102by;
        if (i + i2 < i3 || i3 < i - 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m459b(int i, int i2) {
        int i3 = LoggerMaybe.m1079A().f6102by;
        if (i >= 0 && i + i2 >= i3 && i <= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m482a(float f, float f2, float f3, float f4, EnumC0246ao enumC0246ao) {
        if (enumC0246ao == EnumC0246ao.f1706d || enumC0246ao == EnumC0246ao.f1703a) {
            return true;
        }
        short m460b = m460b(f, f2, enumC0246ao);
        short m460b2 = m460b(f3, f4, enumC0246ao);
        if (m460b == -3 || m460b2 == -3) {
            String str = "null";
            if (enumC0246ao != null) {
                str = enumC0246ao.name();
            }
            LoggerMaybe.m965g("pathPossible: no isolatedGroups found! (" + str + ")");
        }
        if (m460b != -1 && m460b2 != -1 && m460b != -2 && m460b2 != -2 && m460b == m460b2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m458b(AbstractC0244am abstractC0244am, float f, float f2) {
        return m482a(abstractC0244am.f6957el, abstractC0244am.f6958em, f, f2, abstractC0244am.mo2991h());
    }

    /* renamed from: a */
    public static void m477a(AbstractC0197n abstractC0197n, PointF pointF) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        for (int i = 0; i <= 2; i++) {
            Iterator it = AbstractC0244am.m4488bF().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if ((abstractC0244am instanceof AbstractC0244am) && !abstractC0244am.f1607bT && abstractC0244am.f1609bV == abstractC0197n) {
                    if (i == 0 && abstractC0244am.f1601bN) {
                        pointF.m5472a(abstractC0244am.f6957el, abstractC0244am.f6958em);
                        return;
                    } else if (i == 1 && abstractC0244am.f1602bO) {
                        pointF.m5472a(abstractC0244am.f6957el, abstractC0244am.f6958em);
                        return;
                    } else if (i == 2) {
                        pointF.m5472a(abstractC0244am.f6957el, abstractC0244am.f6958em);
                        return;
                    }
                }
            }
        }
        pointF.m5472a(m1079A.f6110bL.m4898i() / 2.0f, m1079A.f6110bL.m4897j() / 2.0f);
    }

    /* renamed from: a */
    public static void m469a(AbstractC0244am abstractC0244am, AbstractC0623y abstractC0623y) {
        abstractC0244am.f1651cL = null;
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
            if (abstractC0623y2.f1652cM == abstractC0623y) {
                if (abstractC0623y2.m4415dl() == null) {
                    LoggerMaybe.LogDebug2("Unload, attachment data is null");
                }
                abstractC0623y2.m2807bx();
            }
        }
    }
}
