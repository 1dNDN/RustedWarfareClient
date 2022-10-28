package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/d.class */
public class C0075d extends AbstractC0083l {

    /* renamed from: a */
    int f393a;

    /* renamed from: a */
    public void m4840a() {
        AbstractC0916l.m963e("Running unit tests - maths (v3)");
        C0758f.m2029i(100.0f, 100.0f);
        C0758f.m2029i(0.0f, 100.0f);
        C0758f.m2029i(100.0f, 0.0f);
        C0758f.m2029i(0.0f, -100.0f);
        C0758f.m2029i(-100.0f, 0.0f);
        C0758f.m2029i(0.0f, 0.0f);
        AbstractC0916l.m963e("fast_atan2 - NaN");
        C0758f.m2029i(Float.NaN, 0.0f);
        C0758f.m2029i(0.0f, Float.NaN);
        C0758f.m2029i(Float.NaN, Float.NaN);
        AbstractC0916l.m963e("fast_atan2 - Max");
        C0758f.m2029i(Float.MAX_VALUE, 0.0f);
        C0758f.m2029i(Float.MIN_VALUE, 0.0f);
        C0758f.m2029i(0.0f, Float.MAX_VALUE);
        C0758f.m2029i(0.0f, Float.MIN_VALUE);
        AbstractC0916l.m963e("fast_atan2 - NaN+Max");
        C0758f.m2029i(Float.MAX_VALUE, Float.NaN);
        C0758f.m2029i(Float.MIN_VALUE, Float.MAX_VALUE);
        C0758f.m2029i(Float.MAX_VALUE, Float.MIN_VALUE);
        C0758f.m2029i(900000.0f, 900000.0f);
        C0758f.m2029i(3.4028236E33f, 3.4028236E33f);
        C0758f.m2029i(3.4028236E34f, 3.4028236E34f);
        C0758f.m2029i(3.4028234E35f, 3.4028234E35f);
        C0758f.m2029i(3.4028236E36f, 3.4028236E36f);
        C0758f.m2029i(3.4028235E37f, 3.4028235E37f);
        C0758f.m2029i(Float.MAX_VALUE, Float.MAX_VALUE);
        AbstractC0916l.m963e("fast_atan2 - max,max");
        C0758f.m2029i(Float.MAX_VALUE, Float.MAX_VALUE);
        C0758f.m2029i(Float.MIN_VALUE, Float.MIN_VALUE);
        AbstractC0916l.m963e("cos/sin");
        C0085n.m4822a(C0758f.m2030i(0.0f), 1.0f);
        C0085n.m4822a(C0758f.m2030i(360.0f), 1.0f);
        C0085n.m4822a(C0758f.m2030i(10800.0f), 1.0f);
        C0085n.m4822a(C0758f.m2030i(45.0f), 0.70710677f);
        C0085n.m4822a(C0758f.m2030i(90.0f), 0.0f);
        C0085n.m4822a(C0758f.m2030i(450.0f), 0.0f);
        C0085n.m4822a(C0758f.m2030i(10890.0f), 0.0f);
        C0085n.m4822a(C0758f.m2035h(0.0f), 0.0f);
        C0085n.m4822a(C0758f.m2035h(90.0f), 1.0f);
        C0758f.m2030i(-999999.0f);
        C0758f.m2030i(999999.0f);
        C0758f.m2030i(Float.MAX_VALUE);
        C0758f.m2030i(Float.MIN_VALUE);
        C0758f.m2035h(Float.MAX_VALUE);
        C0758f.m2035h(Float.MIN_VALUE);
        AbstractC0916l.m963e("diff sin(0):  " + String.format("%.12f", Float.valueOf(C0758f.m2035h(0.0f) - ((float) StrictMath.sin(0.0d)))));
        AbstractC0916l.m963e("diff sin(45): " + String.format("%.12f", Float.valueOf(C0758f.m2035h(45.0f) - ((float) StrictMath.sin(0.7853981633974483d)))));
        AbstractC0916l.m963e("diff sin(90): " + String.format("%.12f", Float.valueOf(C0758f.m2035h(90.0f) - ((float) StrictMath.sin(1.5707963267948966d)))));
        AbstractC0916l.m963e("diff sin(180):" + String.format("%.12f", Float.valueOf(C0758f.m2035h(180.0f) - ((float) StrictMath.sin(3.141592653589793d)))));
        AbstractC0916l.m963e("diff sin(360):" + String.format("%.12f", Float.valueOf(C0758f.m2035h(360.0f) - ((float) StrictMath.sin(6.283185307179586d)))));
        AbstractC0916l.m963e("Testing squareroot");
        for (int i = 0; i < 1005; i++) {
            C0085n.m4822a(C0758f.m2142a(i), C0758f.m2064d(C0758f.m2150a(i)));
        }
        int i2 = 0;
        AbstractC0916l.m963e("=== cos/sin tests (runs:5)");
        Long valueOf = Long.valueOf(C0727bl.m2370a());
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 2000; i4++) {
                if (C0758f.m2030i(i4) == 0.0f) {
                    i2++;
                }
                if (C0758f.m2035h(i4) == 0.0f) {
                    i2++;
                }
            }
        }
        double m2367a = C0727bl.m2367a(valueOf.longValue(), Long.valueOf(C0727bl.m2370a()).longValue());
        this.f393a += i2;
        AbstractC0916l.m963e("Took: " + m2367a);
    }
}
