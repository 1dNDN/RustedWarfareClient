package com.corrodinggames.rts.game.units;

import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.gameFramework.Core;
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
    public static void m3095a(EnumC0612r enumC0612r, PointF pointF) {
        float f = pointF.f227a;
        float f2 = pointF.f228b;
        Core m1087A = Core.m1087A();
        C0173b c0173b = m1087A.f6110bL;
        if (c0173b == null) {
            Core.LogDebug2("setTerrainType called without map loaded");
            return;
        }
        int i = (int) (f * c0173b.f789r);
        int i2 = (int) (f2 * c0173b.f790s);
        if (!c0173b.m5300c(i, i2)) {
            Core.LogDebug2("setTerrainType out of map range");
        } else if (c0173b.f833u == null) {
            Core.LogDebug2("setTerrainType mainLayer missing");
        } else {
            if (!c0173b.f799R) {
                if (c0173b.f800S) {
                    return;
                }
                try {
                    if (c0173b.f834v == null) {
                        c0173b.f834v = new C0178e(c0173b, "grounddetails", c0173b.f792C, c0173b.f793D);
                        c0173b.f837z.add(c0173b.f834v);
                    }
                    if (c0173b.f835w == null) {
                        c0173b.f835w = new C0178e(c0173b, "grounddetails2", c0173b.f792C, c0173b.f793D);
                        c0173b.f837z.add(c0173b.f835w);
                    }
                    c0173b.f833u.f913w = true;
                    c0173b.f834v.f913w = true;
                    c0173b.f835w.f913w = true;
                } catch (C0179f e) {
                    e.printStackTrace();
                    m1087A.m990c("Failed to edit map", e.getMessage());
                    c0173b.f800S = true;
                    return;
                }
            }
            try {
                C0180g m5321a = c0173b.m5321a(enumC0612r.mo3072b(), 0, 0);
                if (m5321a == null) {
                    Core.LogDebug2("setTerrainType mapTile==null");
                    return;
                }
                C0180g m5252a = c0173b.f833u.m5252a(i, i2);
                if (f3872b == i && f3873c == i2 && C0180g.m5242a(f3874d, m5321a)) {
                    return;
                }
                Core.LogDebug2("setTerrainType changing " + m5252a.f915b + " to " + m5321a.f915b + " at:" + i2 + "," + i2);
                c0173b.f833u.m5251a(i, i2, m5321a, false);
                c0173b.f834v.m5251a(i, i2, null, false);
                c0173b.f835w.m5251a(i, i2, null, false);
                f3872b = i;
                f3873c = i2;
                f3874d = m5321a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Point(i, i2));
                for (int i3 = 0; i3 <= 4; i3++) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Point point = (Point) it.next();
                        m3092a(enumC0612r, m5321a, point.f224a, point.f225b, arrayList2);
                    }
                    arrayList = arrayList2;
                }
                c0173b.m5284g();
                m1087A.f6119bU.m1168a(c0173b, false);
            } catch (C0179f e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m3092a(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2, ArrayList arrayList) {
        String mo3073a;
        C0173b c0173b = Core.m1087A().f6110bL;
        for (int i3 = -1; i3 <= 1; i3++) {
            for (int i4 = -1; i4 <= 1; i4++) {
                int i5 = i + i3;
                int i6 = i2 + i4;
                if (c0173b.m5300c(i5, i6) && ((i3 != 0 || i4 != 0) && (mo3073a = enumC0612r.mo3073a()) != null && m3093a(enumC0612r, c0180g, i5, i6, i3, i4, mo3073a))) {
                    arrayList.add(new Point(i5, i6));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3090a(int[] iArr, C0617s c0617s) {
        for (int i : iArr) {
            f3871a[i + 128] = c0617s;
        }
    }

    /* renamed from: a */
    public static void m3099a() {
        f3871a = new C0617s[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        m3090a(m3098a(1), new C0617s(2, 2));
        m3090a(m3098a(2), new C0617s(0, 2));
        m3090a(m3098a(4), new C0617s(0, 0));
        m3090a(m3098a(8), new C0617s(2, 0));
        m3090a(m3097a(16, 1, 2), new C0617s(1, 2));
        m3090a(m3097a(32, 2, 4), new C0617s(0, 1));
        m3090a(m3097a(64, 8, 4), new C0617s(1, 0));
        m3090a(m3097a(-128, 1, 8), new C0617s(2, 1));
        m3090a(m3097a(16 + 32, 2, 1, 4), new C0617s(0, 6));
        m3090a(m3097a(32 + 64, 4, 8, 2), new C0617s(0, 4));
        m3090a(m3097a(64 - 128, 8, 4, 1), new C0617s(2, 4));
        m3090a(m3097a((-128) + 16, 1, 8, 2), new C0617s(2, 6));
        m3090a(m3098a(1 + 2), new C0617s(1, 1));
        m3090a(m3098a(2 + 4), new C0617s(1, 1));
        m3090a(m3098a(4 + 8), new C0617s(1, 1));
        m3090a(m3098a(8 + 1), new C0617s(1, 1));
        m3090a(m3097a(16 + 32 + 64, 1, 2, 4, 8), new C0617s(1, 1));
        m3090a(m3097a((32 + 64) - 128, 1, 2, 4, 8), new C0617s(1, 1));
        m3090a(m3097a((64 - 128) + 16, 1, 2, 4, 8), new C0617s(1, 1));
        m3090a(m3097a((-128) + 16 + 32, 1, 2, 4, 8), new C0617s(1, 1));
        m3090a(m3097a(16 + 64, 1, 2, 8, 4), new C0617s(1, 1));
        m3090a(m3097a((-128) + 32, 1, 2, 8, 4), new C0617s(1, 1));
        m3090a(m3098a(1 + 4), new C0617s(1, 1));
        m3090a(m3098a(2 + 8), new C0617s(1, 1));
        m3090a(m3097a(16 + 4, 2, 1), new C0617s(1, 1));
        m3090a(m3097a(64 + 2, 4, 8), new C0617s(1, 1));
        m3090a(m3097a((-128) + 2, 1, 8), new C0617s(1, 1));
        m3090a(m3097a(32 + 1, 2, 4), new C0617s(1, 1));
        m3090a(m3097a(16 + 4 + 8, 2, 1), new C0617s(1, 1));
        m3090a(m3097a(64 + 2 + 1, 4, 8), new C0617s(1, 1));
        m3090a(m3097a((-128) + 2 + 4, 1, 8), new C0617s(1, 1));
        m3090a(m3097a(32 + 1 + 8, 2, 4), new C0617s(1, 1));
        m3090a(m3098a(-1), new C0617s(1, 1));
    }

    /* renamed from: a */
    private static int[] m3098a(int i) {
        return new int[]{i};
    }

    /* renamed from: a */
    private static int[] m3097a(int i, int... iArr) {
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
    public static boolean m3093a(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2, int i3, int i4, String str) {
        C0180g m5321a;
        boolean z = false;
        C0173b c0173b = Core.m1087A().f6110bL;
        byte m3089b = m3089b(enumC0612r, c0180g, i, i2);
        if (f3871a == null) {
            m3099a();
        }
        C0617s c0617s = f3871a[m3089b + 128];
        if (c0617s == null) {
            return false;
        }
        if (c0617s.f3881a == 1 && c0617s.f3882b == 1) {
            c0173b.f833u.m5251a(i, i2, c0180g, false);
            m5321a = null;
            z = true;
        } else {
            try {
                m5321a = c0173b.m5321a(str, c0617s.f3881a, c0617s.f3882b);
            } catch (C0179f e) {
                e.printStackTrace();
                return false;
            }
        }
        m3091a(enumC0612r, c0180g, m5321a, i, i2);
        return z;
    }

    /* renamed from: a */
    public static void m3091a(EnumC0612r enumC0612r, C0180g c0180g, C0180g c0180g2, int i, int i2) {
        C0173b c0173b = Core.m1087A().f6110bL;
        C0180g m5252a = c0173b.f833u.m5252a(i, i2);
        C0180g m5252a2 = c0173b.f834v.m5252a(i, i2);
        C0180g m5252a3 = c0173b.f835w.m5252a(i, i2);
        EnumC0612r m3096a = m3096a(m5252a2);
        EnumC0612r m3096a2 = m3096a(m5252a3);
        if (m3096a == enumC0612r) {
            c0173b.f834v.m5251a(i, i2, null, false);
            m5252a2 = null;
        }
        if (m3096a2 == enumC0612r) {
            c0173b.f835w.m5251a(i, i2, null, false);
            m5252a3 = null;
            m3096a2 = null;
        }
        if (m5252a2 == null && m5252a3 != null) {
            c0173b.f834v.m5251a(i, i2, m5252a3, false);
            c0173b.f835w.m5251a(i, i2, null, false);
            m5252a2 = m5252a3;
            m5252a3 = null;
        }
        if (C0180g.m5242a(m5252a, c0180g) || c0180g2 == null) {
            return;
        }
        if (m5252a2 != null) {
            if (m5252a3 != null) {
                c0173b.f834v.m5251a(i, i2, m5252a3, false);
            }
            c0173b.f835w.m5251a(i, i2, c0180g2, false);
            return;
        }
        c0173b.f834v.m5251a(i, i2, c0180g2, false);
    }

    /* renamed from: a */
    public static EnumC0612r m3096a(C0180g c0180g) {
        EnumC0612r[] values;
        if (c0180g == null) {
            return null;
        }
        C0173b c0173b = Core.m1087A().f6110bL;
        for (EnumC0612r enumC0612r : EnumC0612r.values()) {
            String str = c0180g.f914a.f950a;
            if (str != null && str.equals(enumC0612r.mo3072b())) {
                return enumC0612r;
            }
            if (str != null && str.equals(enumC0612r.mo3073a())) {
                return enumC0612r;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3094a(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2) {
        C0173b c0173b = Core.m1087A().f6110bL;
        if (c0173b.m5300c(i, i2) && C0180g.m5242a(c0173b.f833u.m5252a(i, i2), c0180g)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static byte m3089b(EnumC0612r enumC0612r, C0180g c0180g, int i, int i2) {
        byte b = 0;
        C0173b c0173b = Core.m1087A().f6110bL;
        int i3 = c0173b.f792C;
        int i4 = c0173b.f793D;
        if (i >= 1) {
            if (m3094a(enumC0612r, c0180g, i - 1, i2)) {
                b = (byte) (0 - 128);
            }
            if (i2 >= 1 && m3094a(enumC0612r, c0180g, i - 1, i2 - 1)) {
                b = (byte) (b + 1);
            }
            if (i2 < i4 - 1 && m3094a(enumC0612r, c0180g, i - 1, i2 + 1)) {
                b = (byte) (b + 8);
            }
        }
        if (i2 >= 1) {
            if (m3094a(enumC0612r, c0180g, i, i2 - 1)) {
                b = (byte) (b + 16);
            }
            if (i < i3 - 1 && m3094a(enumC0612r, c0180g, i + 1, i2 - 1)) {
                b = (byte) (b + 2);
            }
        }
        if (i < i3 - 1 && m3094a(enumC0612r, c0180g, i + 1, i2)) {
            b = (byte) (b + 32);
        }
        if (i2 < i4 - 1) {
            if (m3094a(enumC0612r, c0180g, i, i2 + 1)) {
                b = (byte) (b + 64);
            }
            if (i < i3 - 1 && m3094a(enumC0612r, c0180g, i + 1, i2 + 1)) {
                b = (byte) (b + 4);
            }
        }
        return b;
    }
}
