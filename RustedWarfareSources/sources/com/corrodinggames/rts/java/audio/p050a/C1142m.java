package com.corrodinggames.rts.java.audio.p050a;

import java.util.Random;

/* renamed from: com.corrodinggames.rts.java.audio.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/m.class */
public final class C1142m {

    /* renamed from: a */
    public static Random f7058a = new Random();

    /* renamed from: a */
    public static float m331a(float f) {
        return C1143n.f7059a[((int) (f * 2607.5945f)) & 16383];
    }

    /* renamed from: b */
    public static float m328b(float f) {
        return C1143n.f7059a[((int) ((f + 1.5707964f) * 2607.5945f)) & 16383];
    }

    /* renamed from: a */
    public static int m329a(int i) {
        return f7058a.nextInt(i + 1);
    }

    /* renamed from: b */
    public static int m327b(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    /* renamed from: a */
    public static float m330a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }
}
