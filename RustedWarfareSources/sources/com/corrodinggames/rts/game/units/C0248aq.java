package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p042j.C0904i;
import com.corrodinggames.rts.gameFramework.p042j.C0907l;

/* renamed from: com.corrodinggames.rts.game.units.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/aq.class */
public final class C0248aq {

    /* renamed from: a */
    public static final Paint f1725a = new Paint();

    /* renamed from: b */
    static final Point f1726b = new Point();

    /* renamed from: c */
    static final Rect f1727c = new Rect();

    /* renamed from: d */
    static final PointF f1728d = new PointF();

    /* renamed from: e */
    static final PointF f1729e = new PointF();

    /* renamed from: f */
    static final PointF f1730f = new PointF();

    /* renamed from: g */
    static final PointF f1731g = new PointF();

    /* renamed from: h */
    static final PointF f1732h = new PointF();

    /* renamed from: i */
    static final PointF f1733i = new PointF();

    /* renamed from: j */
    static final PointF f1734j = new PointF();

    /* renamed from: a */
    private static Point m4632a(EnumC0246ao enumC0246ao, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C0907l c0907l = Core.m1087A().f6119bU;
        C0904i m1167a = c0907l.m1167a(enumC0246ao);
        int m2122d = C0758f.m2122d(i3 - i);
        int m2122d2 = C0758f.m2122d(i4 - i2);
        int i8 = i;
        int i9 = i2;
        int i10 = 1 + m2122d + m2122d2;
        int i11 = i3 > i ? 1 : -1;
        int i12 = i4 > i2 ? 1 : -1;
        int i13 = m2122d - m2122d2;
        int i14 = m2122d * 2;
        int i15 = m2122d2 * 2;
        int i16 = 0;
        while (i10 > 0) {
            int i17 = i8;
            int i18 = i9;
            if (i6 != 0 && c0907l.m1148c(m1167a, i17, i18) < i6) {
                f1726b.m5883a(i17, i18);
                return f1726b;
            }
            if (i5 != 0) {
                int m1152b = c0907l.m1152b(m1167a, i17, i18);
                if (m1152b == -1) {
                    f1726b.m5883a(i17, i18);
                    return f1726b;
                }
                if (i7 > 0) {
                    i7--;
                } else {
                    i16 += m1152b;
                }
                if (i16 >= i5) {
                    f1726b.m5883a(i17, i18);
                    return f1726b;
                }
            } else if (c0907l.m1164a(m1167a, i17, i18)) {
                f1726b.m5883a(i17, i18);
                return f1726b;
            }
            if (i13 > 0) {
                i8 += i11;
                i13 -= i15;
            } else if (i13 < 0) {
                i9 += i12;
                i13 += i14;
            } else if (i13 == 0) {
                i8 += i11;
                i9 += i12;
                i13 = (i13 - i15) + i14;
                i10--;
            }
            i10--;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m4634a(EnumC0246ao enumC0246ao, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        Core m1087A = Core.m1087A();
        m1087A.f6119bU.m1162a(m1087A.f6119bU.m1167a(enumC0246ao), true);
        return m4630b(enumC0246ao, f, f2, f3, f4, i, i2, i3);
    }

    /* renamed from: b */
    public static boolean m4630b(EnumC0246ao enumC0246ao, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        C0173b c0173b = Core.m1087A().f6110bL;
        c0173b.m5344a(f, f2);
        int i4 = c0173b.f801T;
        int i5 = c0173b.f802U;
        c0173b.m5344a(f3, f4);
        return m4632a(enumC0246ao, i4, i5, c0173b.f801T, c0173b.f802U, i, i2, i3) == null;
    }

    /* renamed from: a */
    public static PointF m4633a(EnumC0246ao enumC0246ao, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        C0907l c0907l = Core.m1087A().f6119bU;
        f1727c.m5874a(i, i2, i + 1, i2 + 1);
        f1728d.m5879a(f, f2);
        f1729e.m5879a(f3, f4);
        f1730f.m5878a(f1729e);
        boolean z2 = true;
        f1731g.m5879a(f1727c.f230a, f1727c.f233d);
        f1732h.m5879a(f1727c.f232c, f1727c.f231b);
        f1733i.m5879a(f1727c.f230a, f1727c.f231b);
        f1734j.m5879a(f1727c.f232c, f1727c.f233d);
        if (f1728d.f228b < f1729e.f228b) {
            if ((z || !c0907l.m1166a(enumC0246ao, i, i2 - 1)) && C0758f.m2197a(f1728d, f1729e, f1733i, f1732h)) {
                z2 = true;
            }
        } else {
            if ((z || !c0907l.m1166a(enumC0246ao, i, i2 + 1)) && C0758f.m2197a(f1728d, f1729e, f1731g, f1734j)) {
                z2 = true;
            }
        }
        if (f1728d.f227a < f1729e.f227a) {
            if ((z || !c0907l.m1166a(enumC0246ao, i - 1, i2)) && C0758f.m2197a(f1728d, f1729e, f1733i, f1731g)) {
                z2 = true;
            }
        } else {
            if ((z || !c0907l.m1166a(enumC0246ao, i + 1, i2)) && C0758f.m2197a(f1728d, f1729e, f1732h, f1734j)) {
                z2 = false;
            }
        }
        if (z2) {
            return null;
        }
        if (!z2) {
            f1730f.f227a = i + 1 + 0.01f;
        }
        if (z2) {
            f1730f.f227a = i - 0.01f;
        }
        if (z2) {
            f1730f.f228b = i2 + 1 + 0.01f;
        }
        if (z2) {
            f1730f.f228b = i2 - 0.01f;
        }
        return f1730f;
    }

    /* renamed from: a */
    public static boolean m4631a(AbstractC0623y abstractC0623y, AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1651cL != null || !abstractC0623y.m2815k(abstractC0244am) || !abstractC0244am.mo3044d((AbstractC0244am) abstractC0623y)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m4629b(AbstractC0623y abstractC0623y, AbstractC0244am abstractC0244am) {
        if (!m4631a(abstractC0623y, abstractC0244am) || !abstractC0623y.m2826h(abstractC0244am) || !abstractC0623y.m2822i(abstractC0244am)) {
            return false;
        }
        return true;
    }
}
