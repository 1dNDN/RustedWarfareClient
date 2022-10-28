package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Point;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.gameFramework.f.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/h.class */
public class C0799h {

    /* renamed from: a */
    static Point f5268a = new Point();

    /* renamed from: a */
    public static Point m1746a(int i, int i2, int i3) {
        C0180g m4480e;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6158bL.m4534a(i, i2);
        int i4 = m1071A.f6158bL.f828T;
        int i5 = m1071A.f6158bL.f829U;
        Point point = null;
        float f = -1.0f;
        for (int i6 = i4 - i3; i6 <= i4 + i3; i6++) {
            for (int i7 = i5 - i3; i7 <= i5 + i3; i7++) {
                if (m1071A.f6158bL.m4490c(i6, i7) && (m4480e = m1071A.f6158bL.m4480e(i6, i7)) != null && m4480e.f922i) {
                    AbstractC0244am m3289b = AbstractC0488d.m3289b(i6, i7);
                    if (m3289b != null && !m3289b.m4089ce()) {
                        m3289b = null;
                    }
                    if (m3289b == null) {
                        float m2147a = C0758f.m2147a(i4, i5, i6, i7);
                        if (f == -1.0f || f > m2147a) {
                            m1071A.f6158bL.m4530a(i6, i7);
                            f5268a.m5044a(m1071A.f6158bL.f828T, m1071A.f6158bL.f829U);
                            point = f5268a;
                            f = m2147a;
                        }
                    }
                }
            }
        }
        return point;
    }
}
