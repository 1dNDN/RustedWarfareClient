package com.corrodinggames.rts.game.units;

import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/p.class */
public class C0609p {

    /* renamed from: a */
    static C0617s[] f3871a;

    /* renamed from: b */
    static int f3872b;

    /* renamed from: c */
    static int f3873c;

    /* renamed from: d */
    static C0180g f3874d;

    /* renamed from: a */
    public static void m2996a(EnumC0612r enumC0612r, PointF pointF) {
        float f = pointF.f227a;
        float f2 = pointF.f228b;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0173b c0173b = m1071A.f6158bL;
        if (c0173b == null) {
            AbstractC0916l.m963e("setTerrainType called without map loaded");
            return;
        }
        int i = (int) (f * c0173b.f799r);
        int i2 = (int) (f2 * c0173b.f800s);
        if (!c0173b.m4490c(i, i2)) {
            AbstractC0916l.m963e("setTerrainType out of map range");
        } else if (c0173b.f802u == null) {
            AbstractC0916l.m963e("setTerrainType mainLayer missing");
        } else {
            if (!c0173b.f826R) {
                if (c0173b.f827S) {
                    return;
                }
                try {
                    if (c0173b.f803v == null) {
                        c0173b.f803v = new C0178e(c0173b, "grounddetails", c0173b.f811C, c0173b.f812D);
                        c0173b.f807z.add(c0173b.f803v);
                    }
                    if (c0173b.f804w == null) {
                        c0173b.f804w = new C0178e(c0173b, "grounddetails2", c0173b.f811C, c0173b.f812D);
                        c0173b.f807z.add(c0173b.f804w);
                    }
                    c0173b.f802u.f913w = true;
                    c0173b.f803v.f913w = true;
                    c0173b.f804w.f913w = true;
                } catch (C0179f e) {
                    e.printStackTrace();
                    m1071A.m974c("Failed to edit map", e.getMessage());
                    c0173b.f827S = true;
                    return;
                }
            }
            try {
                C0180g m4511a = c0173b.m4511a(enumC0612r.mo2972b(), 0, 0);
                if (m4511a == null) {
                    AbstractC0916l.m963e("setTerrainType mapTile==null");
                    return;
                }
                C0180g m4442a = c0173b.f802u.m4442a(i, i2);
                if (f3872b == i && f3873c == i2 && C0180g.m4432a(f3874d, m4511a)) {
                    return;
                }
                AbstractC0916l.m963e("setTerrainType changing " + m4442a.f915b + " to " + m4511a.f915b + " at:" + i2 + "," + i2);
                c0173b.f802u.m4441a(i, i2, m4511a, false);
                c0173b.f803v.m4441a(i, i2, null, false);
                c0173b.f804w.m4441a(i, i2, null, false);
                f3872b = i;
                f3873c = i2;
                f3874d = m4511a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Point(i, i2));
                for (int i3 = 0; i3 <= 4; i3++) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Point point = (Point) it.next();
                        m2993a(enumC0612r, m4511a, point.f224a, point.f225b, arrayList2);
                    }
                    arrayList = arrayList2;
                }
                c0173b.m4474g();
                m1071A.f6167bU.m1152a(c0173b, false);
            } catch (C0179f e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m2993a(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2, ArrayList arrayList) {
        String mo2973a;
        C0173b c0173b = AbstractC0916l.m1071A().f6158bL;
        for (int i3 = -1; i3 <= 1; i3++) {
            for (int i4 = -1; i4 <= 1; i4++) {
                int i5 = i + i3;
                int i6 = i2 + i4;
                if (c0173b.m4490c(i5, i6) && ((i3 != 0 || i4 != 0) && (mo2973a = enumC0612r.mo2973a()) != null && m2994a(enumC0612r, c0180g, i5, i6, i3, i4, mo2973a))) {
                    arrayList.add(new Point(i5, i6));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2991a(int[] iArr, C0617s c0617s) {
        for (int i : iArr) {
            f3871a[i + 128] = c0617s;
        }
    }

    /* renamed from: a */
    public static void m3000a() {
        f3871a = new C0617s[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        m2991a(m2999a(1), new C0617s(2, 2));
        m2991a(m2999a(2), new C0617s(0, 2));
        m2991a(m2999a(4), new C0617s(0, 0));
        m2991a(m2999a(8), new C0617s(2, 0));
        m2991a(m2998a(16, 1, 2), new C0617s(1, 2));
        m2991a(m2998a(32, 2, 4), new C0617s(0, 1));
        m2991a(m2998a(64, 8, 4), new C0617s(1, 0));
        m2991a(m2998a(-128, 1, 8), new C0617s(2, 1));
        m2991a(m2998a(16 + 32, 2, 1, 4), new C0617s(0, 6));
        m2991a(m2998a(32 + 64, 4, 8, 2), new C0617s(0, 4));
        m2991a(m2998a(64 - 128, 8, 4, 1), new C0617s(2, 4));
        m2991a(m2998a((-128) + 16, 1, 8, 2), new C0617s(2, 6));
        m2991a(m2999a(1 + 2), new C0617s(1, 1));
        m2991a(m2999a(2 + 4), new C0617s(1, 1));
        m2991a(m2999a(4 + 8), new C0617s(1, 1));
        m2991a(m2999a(8 + 1), new C0617s(1, 1));
        m2991a(m2998a(16 + 32 + 64, 1, 2, 4, 8), new C0617s(1, 1));
        m2991a(m2998a((32 + 64) - 128, 1, 2, 4, 8), new C0617s(1, 1));
        m2991a(m2998a((64 - 128) + 16, 1, 2, 4, 8), new C0617s(1, 1));
        m2991a(m2998a((-128) + 16 + 32, 1, 2, 4, 8), new C0617s(1, 1));
        m2991a(m2998a(16 + 64, 1, 2, 8, 4), new C0617s(1, 1));
        m2991a(m2998a((-128) + 32, 1, 2, 8, 4), new C0617s(1, 1));
        m2991a(m2999a(1 + 4), new C0617s(1, 1));
        m2991a(m2999a(2 + 8), new C0617s(1, 1));
        m2991a(m2998a(16 + 4, 2, 1), new C0617s(1, 1));
        m2991a(m2998a(64 + 2, 4, 8), new C0617s(1, 1));
        m2991a(m2998a((-128) + 2, 1, 8), new C0617s(1, 1));
        m2991a(m2998a(32 + 1, 2, 4), new C0617s(1, 1));
        m2991a(m2998a(16 + 4 + 8, 2, 1), new C0617s(1, 1));
        m2991a(m2998a(64 + 2 + 1, 4, 8), new C0617s(1, 1));
        m2991a(m2998a((-128) + 2 + 4, 1, 8), new C0617s(1, 1));
        m2991a(m2998a(32 + 1 + 8, 2, 4), new C0617s(1, 1));
        m2991a(m2999a(-1), new C0617s(1, 1));
    }

    /* renamed from: a */
    private static int[] m2999a(int i) {
        return new int[]{i};
    }

    /* renamed from: a */
    private static int[] m2998a(int i, int... iArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        if (iArr.length == 1) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
        } else if (iArr.length == 2) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
        } else if (iArr.length == 3) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
        } else if (iArr.length == 4) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[2] + iArr[3]));
        } else {
            throw new RuntimeException("unhandled:" + iArr.length);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    public static boolean m2994a(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2, int i3, int i4, String str) {
        C0180g m4511a;
        boolean z = false;
        C0173b c0173b = AbstractC0916l.m1071A().f6158bL;
        byte m2990b = m2990b(enumC0612r, c0180g, i, i2);
        if (f3871a == null) {
            m3000a();
        }
        C0617s c0617s = f3871a[m2990b + 128];
        if (c0617s == null) {
            return false;
        }
        if (c0617s.f3881a == 1 && c0617s.f3882b == 1) {
            c0173b.f802u.m4441a(i, i2, c0180g, false);
            m4511a = null;
            z = true;
        } else {
            try {
                m4511a = c0173b.m4511a(str, c0617s.f3881a, c0617s.f3882b);
            } catch (C0179f e) {
                e.printStackTrace();
                return false;
            }
        }
        m2992a(enumC0612r, c0180g, m4511a, i, i2);
        return z;
    }

    /* renamed from: a */
    public static void m2992a(EnumC0612r enumC0612r, C0180g c0180g, C0180g c0180g2, int i, int i2) {
        C0173b c0173b = AbstractC0916l.m1071A().f6158bL;
        C0180g m4442a = c0173b.f802u.m4442a(i, i2);
        C0180g m4442a2 = c0173b.f803v.m4442a(i, i2);
        C0180g m4442a3 = c0173b.f804w.m4442a(i, i2);
        EnumC0612r m2997a = m2997a(m4442a2);
        EnumC0612r m2997a2 = m2997a(m4442a3);
        if (m2997a == enumC0612r) {
            c0173b.f803v.m4441a(i, i2, null, false);
            m4442a2 = null;
        }
        if (m2997a2 == enumC0612r) {
            c0173b.f804w.m4441a(i, i2, null, false);
            m4442a3 = null;
            m2997a2 = null;
        }
        if (m4442a2 == null && m4442a3 != null) {
            c0173b.f803v.m4441a(i, i2, m4442a3, false);
            c0173b.f804w.m4441a(i, i2, null, false);
            m4442a2 = m4442a3;
            m4442a3 = null;
        }
        if (C0180g.m4432a(m4442a, c0180g) || c0180g2 == null) {
            return;
        }
        if (m4442a2 != null) {
            if (m4442a3 != null) {
                c0173b.f803v.m4441a(i, i2, m4442a3, false);
            }
            c0173b.f804w.m4441a(i, i2, c0180g2, false);
            return;
        }
        c0173b.f803v.m4441a(i, i2, c0180g2, false);
    }

    /* renamed from: a */
    public static EnumC0612r m2997a(C0180g c0180g) {
        EnumC0612r[] values;
        if (c0180g == null) {
            return null;
        }
        C0173b c0173b = AbstractC0916l.m1071A().f6158bL;
        for (EnumC0612r enumC0612r : EnumC0612r.values()) {
            String str = c0180g.f914a.f950a;
            if (str != null && str.equals(enumC0612r.mo2972b())) {
                return enumC0612r;
            }
            if (str != null && str.equals(enumC0612r.mo2973a())) {
                return enumC0612r;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m2995a(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2) {
        C0173b c0173b = AbstractC0916l.m1071A().f6158bL;
        if (c0173b.m4490c(i, i2) && C0180g.m4432a(c0173b.f802u.m4442a(i, i2), c0180g)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static byte m2990b(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2) {
        byte b = 0;
        C0173b c0173b = AbstractC0916l.m1071A().f6158bL;
        int i3 = c0173b.f811C;
        int i4 = c0173b.f812D;
        if (i >= 1) {
            if (m2995a(enumC0612r, c0180g, i - 1, i2)) {
                b = (byte) (0 - 128);
            }
            if (i2 >= 1 && m2995a(enumC0612r, c0180g, i - 1, i2 - 1)) {
                b = (byte) (b + 1);
            }
            if (i2 < i4 - 1 && m2995a(enumC0612r, c0180g, i - 1, i2 + 1)) {
                b = (byte) (b + 8);
            }
        }
        if (i2 >= 1) {
            if (m2995a(enumC0612r, c0180g, i, i2 - 1)) {
                b = (byte) (b + 16);
            }
            if (i < i3 - 1 && m2995a(enumC0612r, c0180g, i + 1, i2 - 1)) {
                b = (byte) (b + 2);
            }
        }
        if (i < i3 - 1 && m2995a(enumC0612r, c0180g, i + 1, i2)) {
            b = (byte) (b + 32);
        }
        if (i2 < i4 - 1) {
            if (m2995a(enumC0612r, c0180g, i, i2 + 1)) {
                b = (byte) (b + 64);
            }
            if (i < i3 - 1 && m2995a(enumC0612r, c0180g, i + 1, i2 + 1)) {
                b = (byte) (b + 4);
            }
        }
        return b;
    }
}
