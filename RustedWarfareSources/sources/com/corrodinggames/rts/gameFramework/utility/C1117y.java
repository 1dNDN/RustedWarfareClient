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
import com.corrodinggames.rts.gameFramework.Core;
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
        f6940a.m5933a(205, 255, 0, 0);
        f6940a.m5926a(Paint.Style.f220b);
        f6943d = new Rect();
        f6944e = new RectF();
        f6945f = new Paint();
        f6946g = new C1118z[30];
        f6947h = false;
    }

    /* renamed from: a */
    public static void m470a(AbstractC0244am abstractC0244am, float f) {
        m465a(abstractC0244am, f, false, false);
    }

    /* renamed from: a */
    public static void m467a(AbstractC0244am abstractC0244am, float f, boolean z) {
        m465a(abstractC0244am, f, z, false);
    }

    /* renamed from: a */
    public static boolean m471a(AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        if (abstractC0244am.f1644cE && m1087A.f6117bS.m1811p() == 1 && !m1087A.f6117bS.f5114d.f4913e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m465a(AbstractC0244am abstractC0244am, float f, boolean z, boolean z2) {
        Core m1087A = Core.m1087A();
        if (m471a(abstractC0244am) || z) {
            float f2 = abstractC0244am.f6958el - m1087A.f6144cv;
            float f3 = abstractC0244am.f6959em - m1087A.f6145cw;
            Paint paint = AbstractC0244am.f1670de;
            if (z2) {
                paint = AbstractC0244am.f1671df;
            }
            m1087A.f6113bO.mo223a(f2, f3, f, paint);
        }
    }

    /* renamed from: a */
    public static void m468a(AbstractC0244am abstractC0244am, float f, int i, int i2, boolean z) {
        Core m1087A = Core.m1087A();
        if ((abstractC0244am.f1644cE && m1087A.f6117bS.m1811p() < 10) || z) {
            float f2 = abstractC0244am.f6958el - m1087A.f6144cv;
            float f3 = abstractC0244am.f6959em - m1087A.f6145cw;
            Paint paint = AbstractC0244am.f1674di;
            paint.m5908b(i);
            paint.m5936a(i2);
            m1087A.f6113bO.mo223a(f2, f3, f, paint);
        }
    }

    /* renamed from: b */
    public static void m452b(AbstractC0244am abstractC0244am, float f, boolean z) {
        m466a(abstractC0244am, f, z, AbstractC0244am.f1672dg);
    }

    /* renamed from: a */
    public static void m466a(AbstractC0244am abstractC0244am, float f, boolean z, Paint paint) {
        Core m1087A = Core.m1087A();
        if (m471a(abstractC0244am) || z) {
            m1087A.f6113bO.mo223a(abstractC0244am.f6958el - m1087A.f6144cv, abstractC0244am.f6959em - m1087A.f6145cw, f, paint);
        }
    }

    /* renamed from: a */
    public static void m459a(C0934e c0934e, float f, float f2, float f3, float f4, float f5, Paint paint, int i, int i2, int i3) {
        Core m1087A = Core.m1087A();
        int i4 = 0 + (i3 * i);
        f6943d.m5874a(i4, 0, i4 + i, 0 + i2);
        float f6 = f5 * 0.5f;
        float f7 = f2 - f3;
        float f8 = i * f6;
        float f9 = i2 * f6;
        f6944e.m5861a(f - f8, f7 - f9, f + f8, f7 + f9);
        InterfaceC1027y interfaceC1027y = m1087A.f6113bO;
        interfaceC1027y.mo135k();
        interfaceC1027y.mo227a(f4 + 90.0f, f, f7);
        if (f5 != 1.0f) {
            interfaceC1027y.mo226a(f5, f5, f, f7);
        }
        interfaceC1027y.mo192a(c0934e, f6943d, f6944e, paint);
        interfaceC1027y.mo134l();
    }

    /* renamed from: a */
    public static boolean m463a(AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        if (abstractC0244am.m4691cq() && z2) {
            return false;
        }
        if ((z && ((abstractC0244am instanceof AbstractC0309b) || (abstractC0244am instanceof AbstractC0590f))) || abstractC0244am.m4758bI()) {
            return false;
        }
        if ((z && (abstractC0244am.m4688ct() || abstractC0244am.m4690cr())) || abstractC0244am.mo3055P() || abstractC0244am.f1651cL != null || abstractC0244am.f1652cM != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Paint m480a() {
        C0930ag c0930ag = new C0930ag();
        if (Core.m1087A().settingEngine.renderAntiAlias) {
            c0930ag.mo5914a(true);
            c0930ag.m5897d(true);
            c0930ag.m5905b(true);
        } else {
            c0930ag.mo5914a(false);
            c0930ag.m5897d(false);
            c0930ag.m5905b(false);
        }
        return c0930ag;
    }

    /* renamed from: b */
    public static C0930ag m458b() {
        C0930ag c0930ag = new C0930ag();
        c0930ag.mo5914a(false);
        c0930ag.m5897d(false);
        c0930ag.m5905b(false);
        return c0930ag;
    }

    /* renamed from: a */
    public static void m462a(AbstractC0623y abstractC0623y) {
        if (!abstractC0623y.f1607bT) {
            int mo3169bl = abstractC0623y.mo3169bl();
            for (int i = 0; i < mo3169bl; i++) {
                m461a(abstractC0623y, i);
            }
        }
    }

    /* renamed from: a */
    public static void m460a(AbstractC0623y abstractC0623y, C0934e c0934e, float f, int i) {
        if (!abstractC0623y.f1607bT && f != 0.0f) {
            Core m1087A = Core.m1087A();
            C1080ai m3025D = abstractC0623y.m3025D(i);
            m1087A.f6113bO.mo135k();
            m1087A.f6113bO.mo168b(m3025D.f6849a - m1087A.f6144cv, ((m3025D.f6850b - m3025D.f6851c) - abstractC0623y.f6960en) - m1087A.f6145cw);
            m1087A.f6113bO.mo228a(f, f);
            m1087A.f6113bO.mo198a(c0934e, 0.0f, 0.0f, (Paint) null);
            m1087A.f6113bO.mo134l();
        }
    }

    /* renamed from: a */
    public static void m461a(AbstractC0623y abstractC0623y, int i) {
        C0934e mo3045d = abstractC0623y.mo3045d(i);
        if (mo3045d == null) {
            return;
        }
        float m2802p = abstractC0623y.m2802p(i);
        Paint m2940aN = abstractC0623y.m2940aN();
        Core m1087A = Core.m1087A();
        C1080ai m3021F = abstractC0623y.m3021F(i);
        float f = m3021F.f6849a - Core.m1087A().f6144cv;
        float f2 = ((m3021F.f6850b - Core.m1087A().f6145cw) - abstractC0623y.f6960en) - m3021F.f6851c;
        InterfaceC1027y interfaceC1027y = m1087A.f6113bO;
        interfaceC1027y.mo135k();
        if (m2802p != 1.0f) {
            interfaceC1027y.mo226a(m2802p, m2802p, f, f2);
        }
        interfaceC1027y.mo227a(abstractC0623y.f1649cJ[i].f1712a + 90.0f, f, f2);
        interfaceC1027y.mo159b(mo3045d, (f - mo3045d.f6406t) - abstractC0623y.m2827h(i), (f2 - mo3045d.f6407u) - abstractC0623y.m2823i(i), m2940aN);
        interfaceC1027y.mo134l();
    }

    /* renamed from: a */
    public static boolean m469a(AbstractC0244am abstractC0244am, float f, float f2) {
        return !m476a(f, f2, abstractC0244am.mo3039h());
    }

    /* renamed from: a */
    public static boolean m476a(float f, float f2, EnumC0246ao enumC0246ao) {
        C0907l c0907l = Core.m1087A().f6119bU;
        C0173b c0173b = Core.m1087A().f6110bL;
        c0173b.m5344a(f, f2);
        return c0907l.m1166a(enumC0246ao, c0173b.f801T, c0173b.f802U);
    }

    /* renamed from: b */
    public static short m455b(float f, float f2, EnumC0246ao enumC0246ao) {
        C0907l c0907l = Core.m1087A().f6119bU;
        C0173b c0173b = Core.m1087A().f6110bL;
        C0904i m1167a = c0907l.m1167a(enumC0246ao);
        if (m1167a.f5963g == null) {
            return (short) -3;
        }
        c0173b.m5344a(f, f2);
        int i = c0173b.f801T;
        int i2 = c0173b.f802U;
        if (!c0173b.m5300c(i, i2)) {
            return (short) -2;
        }
        return m1167a.f5963g[(i * m1167a.f5959c) + i2];
    }

    /* renamed from: c */
    public static int m450c(float f, float f2, EnumC0246ao enumC0246ao) {
        short m455b = m455b(f, f2, enumC0246ao);
        if (m455b == -3 || m455b == -2 || m455b == -1 || m455b == 0) {
            return 0;
        }
        Integer num = (Integer) Core.m1087A().f6119bU.m1167a(enumC0246ao).f5964h.get(Short.valueOf(m455b));
        if (num == null) {
            Core.m998b("Could not find groupSize for:" + ((int) m455b) + " at X:" + f + " y:" + f2);
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static boolean m478a(float f, float f2) {
        C0173b c0173b = Core.m1087A().f6110bL;
        if (c0173b == null) {
            Core.LogDebug2("isInMap called without map loaded");
            return false;
        }
        return c0173b.m5300c((int) (f * c0173b.f789r), (int) (f2 * c0173b.f790s));
    }

    /* renamed from: b */
    public static boolean m456b(float f, float f2) {
        Core m1087A = Core.m1087A();
        C0173b c0173b = m1087A.f6110bL;
        if (c0173b == null) {
            Core.LogDebug2("isOverClift called without map loaded");
            return false;
        }
        return m1087A.f6119bU.m1154b((int) (f * c0173b.f789r), (int) (f2 * c0173b.f790s));
    }

    /* renamed from: c */
    public static boolean m451c(float f, float f2) {
        Core m1087A = Core.m1087A();
        C0173b c0173b = m1087A.f6110bL;
        if (c0173b == null) {
            Core.LogDebug2("isOverWater called without map loaded");
            return false;
        }
        return m1087A.f6119bU.m1169a((int) (f * c0173b.f789r), (int) (f2 * c0173b.f790s));
    }

    /* renamed from: d */
    public static boolean m449d(float f, float f2) {
        Core m1087A = Core.m1087A();
        C0173b c0173b = m1087A.f6110bL;
        if (c0173b == null) {
            Core.LogDebug2("isOverLiquid called without map loaded");
            return false;
        }
        C0180g m5301c = c0173b.m5301c(f, f2);
        if (m5301c == null) {
            return false;
        }
        if (m5301c.f918e || m5301c.f920g) {
            return true;
        }
        return m1087A.f6119bU.m1169a((int) (f * c0173b.f789r), (int) (f2 * c0173b.f790s));
    }

    /* renamed from: a */
    public static final Paint m474a(int i, int i2, int i3, int i4, Paint.Style style) {
        return m473a(C0758f.m2152b(i, i2, i3, i4), style);
    }

    /* renamed from: a */
    public static final Paint m473a(int i, Paint.Style style) {
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
            Core.m998b("----- getCachingPaint --- Paint fallback was needed!!");
        }
        f6945f.m5908b(i);
        f6945f.m5926a(style);
        return f6945f;
    }

    /* renamed from: a */
    public static void m479a(float f) {
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
    public static void m457b(float f) {
        if (f6942c.size() == 0) {
            return;
        }
        Core m1087A = Core.m1087A();
        Iterator it = f6942c.iterator();
        while (it.hasNext()) {
            C1071aa c1071aa = (C1071aa) it.next();
            float f2 = c1071aa.f6817b.f234a;
            float f3 = c1071aa.f6817b.f235b;
            float f4 = c1071aa.f6817b.f236c;
            float f5 = c1071aa.f6817b.f237d;
            if (c1071aa.f6819d) {
                f2 -= Core.m1087A().f6144cv;
                f3 -= Core.m1087A().f6145cw;
                f4 -= Core.m1087A().f6144cv;
                f5 -= Core.m1087A().f6145cw;
            }
            if (c1071aa.f6818c) {
                m1087A.f6113bO.mo225a(f2, f3, f4, f5, c1071aa.f6816a);
            } else {
                if (c1071aa.f6819d) {
                }
                m1087A.f6113bO.mo205a(c1071aa.f6817b, c1071aa.f6816a);
            }
            if (c1071aa.f6821f != null) {
                m1087A.f6113bO.mo137i();
                m1087A.m1070R();
                float f6 = f4;
                float f7 = f5;
                if (c1071aa.f6819d) {
                    f6 *= m1087A.f6256cW;
                    f7 *= m1087A.f6256cW;
                }
                m1087A.f6113bO.mo181a(c1071aa.f6821f, f6, f7, c1071aa.f6816a);
                m1087A.f6113bO.mo136j();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m475a(int i, int i2) {
        int i3 = Core.m1087A().f6102by;
        if (i + i2 < i3 || i3 < i - 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m454b(int i, int i2) {
        int i3 = Core.m1087A().f6102by;
        if (i >= 0 && i + i2 >= i3 && i <= i3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m477a(float f, float f2, float f3, float f4, EnumC0246ao enumC0246ao) {
        if (enumC0246ao == EnumC0246ao.f1706d || enumC0246ao == EnumC0246ao.f1703a) {
            return true;
        }
        short m455b = m455b(f, f2, enumC0246ao);
        short m455b2 = m455b(f3, f4, enumC0246ao);
        if (m455b == -3 || m455b2 == -3) {
            String str = "null";
            if (enumC0246ao != null) {
                str = enumC0246ao.name();
            }
            Core.m973g("pathPossible: no isolatedGroups found! (" + str + ")");
        }
        if (m455b != -1 && m455b2 != -1 && m455b != -2 && m455b2 != -2 && m455b == m455b2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m453b(AbstractC0244am abstractC0244am, float f, float f2) {
        return m477a(abstractC0244am.f6958el, abstractC0244am.f6959em, f, f2, abstractC0244am.mo3039h());
    }

    /* renamed from: a */
    public static void m472a(AbstractC0197n abstractC0197n, PointF pointF) {
        Core m1087A = Core.m1087A();
        for (int i = 0; i <= 2; i++) {
            Iterator it = AbstractC0244am.m4761bF().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if ((abstractC0244am instanceof AbstractC0244am) && !abstractC0244am.f1607bT && abstractC0244am.f1609bV == abstractC0197n) {
                    if (i == 0 && abstractC0244am.f1601bN) {
                        pointF.m5879a(abstractC0244am.f6958el, abstractC0244am.f6959em);
                        return;
                    } else if (i == 1 && abstractC0244am.f1602bO) {
                        pointF.m5879a(abstractC0244am.f6958el, abstractC0244am.f6959em);
                        return;
                    } else if (i == 2) {
                        pointF.m5879a(abstractC0244am.f6958el, abstractC0244am.f6959em);
                        return;
                    }
                }
            }
        }
        pointF.m5879a(m1087A.f6110bL.m5281i() / 2.0f, m1087A.f6110bL.m5280j() / 2.0f);
    }

    /* renamed from: a */
    public static void m464a(AbstractC0244am abstractC0244am, AbstractC0623y abstractC0623y) {
        abstractC0244am.f1651cL = null;
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
            if (abstractC0623y2.f1652cM == abstractC0623y) {
                if (abstractC0623y2.m4668dl() == null) {
                    Core.LogDebug2("Unload, attachment data is null");
                }
                abstractC0623y2.m2855bx();
            }
        }
    }
}
