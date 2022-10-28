package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ag.class */
public class C0686ag {
    /* renamed from: a */
    public static void m2562a(AbstractC0690b abstractC0690b, RectF rectF) {
        int i = 0;
        int i2 = 0;
        int mo2546b = abstractC0690b.mo2546b();
        int mo2545c = abstractC0690b.mo2545c();
        if (abstractC0690b.m2542f()) {
            i = 1;
            i2 = 1;
            mo2546b--;
            mo2545c--;
        }
        rectF.m5022a(i, i2, mo2546b, mo2545c);
    }
}
