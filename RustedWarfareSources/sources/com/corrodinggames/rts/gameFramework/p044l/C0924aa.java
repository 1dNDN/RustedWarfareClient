package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p037f.C0795d;

/* renamed from: com.corrodinggames.rts.gameFramework.l.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/aa.class */
public final class C0924aa {

    /* renamed from: b */
    static float f6314b;

    /* renamed from: c */
    static float f6315c;

    /* renamed from: d */
    static float f6316d;

    /* renamed from: f */
    static C0925ab[] f6318f;

    /* renamed from: g */
    static Paint f6319g;

    /* renamed from: a */
    static int f6313a = -1;

    /* renamed from: e */
    public static final Rect f6317e = new Rect();

    /* renamed from: h */
    static final Rect f6320h = new Rect();

    /* renamed from: i */
    static final Rect f6321i = new Rect();

    /* renamed from: j */
    static final RectF f6322j = new RectF();

    /* renamed from: a */
    public static final Bitmap m944a(C0934e c0934e) {
        return c0934e.mo390b();
    }

    /* renamed from: a */
    public static void m938a(String str, float f, float f2, Paint paint) {
        Core m1087A = Core.m1087A();
        String[] m2130c = C0758f.m2130c(str, '\n');
        float m1923b = C0795d.m1923b(paint);
        float length = (m2130c.length - 1) * m1923b;
        int i = 0;
        for (String str2 : m2130c) {
            m1087A.f6113bO.mo181a(str2, f, (f2 - (length / 2.0f)) + (i * m1923b) + (m1923b / 2.0f), paint);
            i++;
        }
    }

    /* renamed from: a */
    public static void m942a(InterfaceC1027y interfaceC1027y, float f, float f2, float f3, Paint paint) {
        if (Core.m1012as()) {
            m943a(interfaceC1027y, f, f2, f3, 40, paint, Core.m1087A().f6253cP);
        } else {
            interfaceC1027y.mo223a(f, f2, f3, paint);
        }
    }

    /* renamed from: a */
    public static C0925ab m947a(float f, float f2, boolean z, InterfaceC1027y interfaceC1027y) {
        int i;
        int i2;
        int i3 = (int) f2;
        int i4 = 0;
        if (((int) f) > 20) {
            i4 = 1;
            i = 60;
        } else {
            i = 30;
        }
        int i5 = 0;
        if (i3 >= 2) {
            i5 = 1;
            i2 = 2;
        } else {
            i2 = 1;
        }
        int i6 = i4 + (i5 * 2) + (z ? 0 : 2 + (2 * 2));
        if (f6318f == null) {
            f6318f = new C0925ab[((2 + (2 * 2)) * 2) + 1];
        }
        if (f6318f[i6] != null) {
            if (f6318f[i6].f6324b != i) {
                Core.LogDebug2("Mismatch on index: " + i6 + " size:" + i);
            }
            return f6318f[i6];
        }
        C0925ab c0925ab = new C0925ab();
        c0925ab.f6326d = m945a(i, i2, z, interfaceC1027y);
        c0925ab.f6324b = i;
        c0925ab.f6323a = i2;
        c0925ab.f6325c = z;
        f6318f[i6] = c0925ab;
        return c0925ab;
    }

    /* renamed from: a */
    public static C0934e m945a(int i, int i2, boolean z, InterfaceC1027y interfaceC1027y) {
        Paint paint = new Paint();
        paint.m5908b(-1);
        paint.m5926a(z ? Paint.Style.f219a : Paint.Style.f220b);
        paint.m5936a(i2);
        C0934e mo165b = interfaceC1027y.mo165b((i * 2) + 4, (i * 2) + 4, true);
        InterfaceC1027y mo160b = interfaceC1027y.mo160b(mo165b);
        mo160b.mo167b(i + 2, i + 2, i, paint);
        mo160b.mo130p();
        mo165b.mo48p();
        mo160b.mo129q();
        return mo165b;
    }

    /* renamed from: a */
    public static void m941a(InterfaceC1027y interfaceC1027y, float f, float f2, float f3, Paint paint, float f4) {
        if (f6319g == null) {
            f6319g = new Paint();
            f6319g.mo5914a(true);
            f6319g.m5905b(true);
        }
        int m5896e = paint.m5896e();
        if (Core.m1012as()) {
            f6319g.m5930a(new LightingColorFilter(m5896e, 0));
        }
        f6319g.m5908b(m5896e);
        C0925ab m947a = m947a(f3 * f4, paint.m5892g(), paint.m5900d() == Paint.Style.f219a, interfaceC1027y);
        float f5 = f3 / m947a.f6324b;
        float f6 = (-f3) - (f5 * 2.0f);
        interfaceC1027y.mo197a(m947a.f6326d, f + f6, f2 + f6, f6319g, 0.0f, f5);
    }

    /* renamed from: a */
    public static void m943a(InterfaceC1027y interfaceC1027y, float f, float f2, float f3, int i, Paint paint, Rect rect) {
        if (f6313a != i) {
            f6313a = i;
            f6314b = 6.283185f / i;
            f6315c = C0758f.m2092i(f6314b);
            f6316d = C0758f.m2097h(f6314b);
        }
        float f4 = f6315c;
        float f5 = f6316d;
        int i2 = ((int) (f6314b * f3 * 0.5f)) + 50;
        f6317e.f230a = rect.f230a - i2;
        f6317e.f231b = rect.f231b - i2;
        f6317e.f232c = rect.f232c + i2;
        f6317e.f233d = rect.f233d + i2;
        float f6 = f3;
        float f7 = 0.0f;
        int i3 = i + 1;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z = true;
        for (int i4 = 0; i4 < i3; i4++) {
            float f12 = f6 + f;
            float f13 = f7 + f2;
            if (z) {
                z = false;
                f8 = f12;
                f9 = f13;
            } else if (f6317e.m5871b((int) f12, (int) f13) || f6317e.m5871b((int) f10, (int) f11)) {
                interfaceC1027y.mo225a(f12, f13, f10, f11, paint);
            }
            f10 = f12;
            f11 = f13;
            float f14 = f6;
            f6 = (f4 * f6) - (f5 * f7);
            f7 = (f5 * f14) + (f4 * f7);
        }
        if (f6317e.m5871b((int) f8, (int) f9) || f6317e.m5871b((int) f10, (int) f11)) {
            interfaceC1027y.mo225a(f8, f9, f10, f11, paint);
        }
    }

    /* renamed from: a */
    public static final int m946a(int i) {
        return i >>> 24;
    }

    /* renamed from: b */
    public static final int m937b(int i) {
        return (i >> 16) & 255;
    }

    /* renamed from: c */
    public static final int m936c(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: d */
    public static final int m935d(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public static void m940a(InterfaceC1027y interfaceC1027y, C0934e c0934e, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        int mo386m = c0934e.mo386m();
        int mo387l = c0934e.mo387l();
        if (i != 0) {
            i %= c0934e.mo386m();
            if (i < 0) {
                i += c0934e.mo386m();
            }
        }
        if (i2 != 0) {
            i2 %= c0934e.mo387l();
            if (i2 < 0) {
                i2 += c0934e.mo387l();
            }
        }
        int i5 = rect.f230a - i;
        int i6 = rect.f231b - i2;
        int i7 = mo386m - i3;
        int i8 = mo387l - i4;
        if (i7 <= 0 || i8 <= 0) {
            return;
        }
        int i9 = 0;
        while (i5 < rect.f232c) {
            while (i6 < rect.f233d) {
                i9++;
                if (i9 > 2000) {
                    Core.LogDebug2("tileImage hit limit");
                    return;
                }
                int i10 = rect.f232c - i5;
                if (i10 > mo386m) {
                    i10 = mo386m;
                }
                int i11 = rect.f233d - i6;
                if (i11 > mo387l) {
                    i11 = mo387l;
                }
                if (i11 > 0 && i10 > 0) {
                    f6320h.m5874a(0, 0, i10, i11);
                    f6321i.m5874a(i5, i6, i5 + i10, i6 + i11);
                    int i12 = f6321i.f230a - rect.f230a;
                    if (i12 < 0) {
                        f6320h.f230a -= i12;
                        f6321i.f230a -= i12;
                    }
                    int i13 = f6321i.f231b - rect.f231b;
                    if (i13 < 0) {
                        f6320h.f231b -= i13;
                        f6321i.f231b -= i13;
                    }
                    interfaceC1027y.mo193a(c0934e, f6320h, f6321i, paint);
                    i6 += i8;
                }
                i5 += i7;
                i6 = rect.f231b - i2;
            }
            i5 += i7;
            i6 = rect.f231b - i2;
        }
    }

    /* renamed from: a */
    public static void m939a(InterfaceC1027y interfaceC1027y, C0934e c0934e, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        Rect rect;
        Rect rect2;
        int mo386m = c0934e.mo386m();
        int mo387l = c0934e.mo387l();
        if (f != 0.0f) {
            f %= mo386m;
            if (f < 0.0f) {
                f += mo386m;
            }
        }
        if (f2 != 0.0f) {
            f2 %= mo387l;
            if (f2 < 0.0f) {
                f2 += mo387l;
            }
        }
        float f3 = rectF.f234a - f;
        float f4 = rectF.f235b - f2;
        int i3 = 0;
        int i4 = mo386m - i;
        int i5 = mo387l - i2;
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        while (f3 < rectF.f236c) {
            while (f4 < rectF.f237d) {
                i3++;
                if (i3 > 2000) {
                    Core.LogDebug2("tileImage hit limit");
                    return;
                }
                float f5 = rectF.f236c - f3;
                if (f5 > mo386m) {
                    f5 = mo386m;
                }
                float f6 = rectF.f237d - f4;
                if (f6 > mo387l) {
                    f6 = mo387l;
                }
                if (f6 > 0.0f && f5 > 0.0f) {
                    f6320h.m5874a(0, 0, (int) f5, (int) f6);
                    f6322j.m5861a(f3, f4, f3 + f5, f4 + f6);
                    float f7 = f6322j.f234a - rectF.f234a;
                    if (f7 < 0.0f) {
                        f6320h.f230a = (int) (rect2.f230a - f7);
                        f6322j.f234a -= f7;
                    }
                    float f8 = f6322j.f235b - rectF.f235b;
                    if (f8 < 0.0f) {
                        f6320h.f231b = (int) (rect.f231b - f8);
                        f6322j.f235b -= f8;
                    }
                    interfaceC1027y.mo192a(c0934e, f6320h, f6322j, paint);
                    f4 += i5;
                }
                f3 += i4;
                f4 = rectF.f235b - f2;
            }
            f3 += i4;
            f4 = rectF.f235b - f2;
        }
    }
}
