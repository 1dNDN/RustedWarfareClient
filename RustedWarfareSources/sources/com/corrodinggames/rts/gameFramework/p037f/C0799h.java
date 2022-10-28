package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Point;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;

/* renamed from: com.corrodinggames.rts.gameFramework.f.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/h.class */
public class C0799h {

    /* renamed from: a */
    static Point f5268a = new Point();

    /* renamed from: a */
    public static Point m1797a(int i, int i2, int i3) {
        C0180g m5290e;
        Core m1087A = Core.m1087A();
        m1087A.f6110bL.m5344a(i, i2);
        int i4 = m1087A.f6110bL.f801T;
        int i5 = m1087A.f6110bL.f802U;
        Point point = null;
        float f = -1.0f;
        for (int i6 = i4 - i3; i6 <= i4 + i3; i6++) {
            for (int i7 = i5 - i3; i7 <= i5 + i3; i7++) {
                if (m1087A.f6110bL.m5300c(i6, i7) && (m5290e = m1087A.f6110bL.m5290e(i6, i7)) != null && m5290e.f922i) {
                    AbstractC0244am m3534b = AbstractC0488d.m3534b(i6, i7);
                    if (m3534b != null && !m3534b.m4703ce()) {
                        m3534b = null;
                    }
                    if (m3534b == null) {
                        float m2209a = C0758f.m2209a(i4, i5, i6, i7);
                        if (f == -1.0f || f > m2209a) {
                            m1087A.f6110bL.m5340a(i6, i7);
                            f5268a.m5883a(m1087A.f6110bL.f801T, m1087A.f6110bL.f802U);
                            point = f5268a;
                            f = m2209a;
                        }
                    }
                }
            }
        }
        return point;
    }
}
