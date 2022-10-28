package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/z.class */
public class C0818z {

    /* renamed from: a */
    C1101m f5393a;

    /* renamed from: b */
    Rect f5394b;

    /* renamed from: c */
    Paint f5395c;

    /* renamed from: d */
    Paint f5396d;

    /* renamed from: a */
    public void m1738a(float f, float f2) {
        C0934e c0934e;
        Core m1087A = Core.m1087A();
        int i = 0;
        int m1928a = C0795d.m1928a(this.f5395c);
        Iterator it = this.f5393a.iterator();
        while (it.hasNext()) {
            C0776aa c0776aa = (C0776aa) it.next();
            int i2 = 0;
            C0814v c0814v = null;
            Iterator it2 = c0776aa.f5058a.iterator();
            while (it2.hasNext()) {
                C0814v c0814v2 = (C0814v) it2.next();
                if (c0814v != null) {
                    i2 += c0814v.mo1741a(this.f5395c);
                }
                int m5867d = ((int) ((f + i2) + this.f5394b.m5867d())) - (c0776aa.f5059b / 2);
                int i3 = (int) (f2 + this.f5394b.f231b + (m1928a / 2) + (i * m1928a));
                if (!(c0814v2 instanceof C0817y)) {
                    if (c0814v2 instanceof C0816x) {
                        C0816x c0816x = (C0816x) c0814v2;
                        m1087A.f6113bO.mo197a(c0816x.f5386a, m5867d, i3 - (c0934e.f6403q * c0816x.f5387b), C0813u.f5376c, 0.0f, c0816x.f5387b);
                    }
                    c0814v = c0814v2;
                } else {
                    C0817y c0817y = (C0817y) c0814v2;
                    m1087A.f6113bO.mo181a(c0817y.f5391d, m5867d, i3, c0817y.mo1740b(this.f5395c));
                    c0814v = c0814v2;
                }
            }
            i++;
        }
    }
}
