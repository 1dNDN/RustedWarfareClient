package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/d.class */
public class C0795d {

    /* renamed from: a */
    static Rect f5103a = new Rect();

    /* renamed from: b */
    static ArrayList f5104b = new ArrayList();

    /* renamed from: c */
    static final RectF f5105c = new RectF();

    /* renamed from: d */
    static final RectF f5106d = new RectF();

    /* renamed from: a */
    public static int m1886a(Paint paint) {
        return LoggerMaybe.m1079A().f6113bO.mo184a("abcABC123!|", paint) + 4;
    }

    /* renamed from: b */
    public static int m1881b(Paint paint) {
        int mo184a = LoggerMaybe.m1079A().f6113bO.mo184a("abcABC123!|", paint);
        if (LoggerMaybe.f6209aY) {
            return mo184a + 2;
        }
        return mo184a;
    }

    /* renamed from: a */
    public static ArrayList m1882a(String str, Rect rect, Paint paint, Paint paint2, boolean z) {
        int lastIndexOf;
        f5104b.clear();
        String str2 = VariableScope.nullOrMissingString;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= str.length()) {
                break;
            }
            int m5513a = paint2.m5513a((CharSequence) str, i3, str.length(), true, rect.m5465b() - 5, (float[]) null);
            if (m5513a == 0) {
                break;
            }
            int indexOf = str.indexOf("\n", i3 + 1);
            if (indexOf != -1 && indexOf < i3 + m5513a) {
                m5513a = indexOf - i3;
            } else if (i3 + m5513a < str.length() && (lastIndexOf = str.substring(i3, i3 + m5513a).lastIndexOf(" ")) != -1 && lastIndexOf != 0) {
                m5513a = lastIndexOf;
            }
            String replaceAll = str.substring(i3, i3 + m5513a).replaceAll("(\\n)", VariableScope.nullOrMissingString);
            if (replaceAll.length() > str2.length()) {
                str2 = replaceAll;
                i = f5104b.size();
            }
            f5104b.add(replaceAll);
            i2 = i3 + m5513a;
        }
        rect.f233d = rect.f231b + (f5104b.size() * m1886a(paint2));
        if (z) {
            float m5460d = rect.m5460d();
            Paint paint3 = paint2;
            if (i == 0) {
                paint3 = paint;
            }
            float mo163b = LoggerMaybe.m1079A().f6113bO.mo163b(str2, paint3);
            if (mo163b < rect.m5465b()) {
                rect.f230a = (int) (m5460d - (mo163b / 2.0f));
                rect.f232c = (int) (m5460d + (mo163b / 2.0f));
            }
        }
        return f5104b;
    }

    /* renamed from: a */
    public static void m1883a(String str, float f, float f2, Paint paint, Paint paint2, float f3, float f4, float f5, float f6) {
        InterfaceC1027y interfaceC1027y = LoggerMaybe.m1079A().f6113bO;
        float mo163b = interfaceC1027y.mo163b(str, paint);
        f5106d.m5454a(f, f2, f + mo163b, f2 + interfaceC1027y.mo184a(str, paint));
        f5105c.m5452a(f5106d);
        if (paint.m5482j() == Paint.Align.f196b) {
            f5105c.m5455a(-(mo163b / 2.0f), 0.0f);
        }
        f5105c.f234a -= f3;
        f5105c.f235b -= f4;
        f5105c.f236c += f5;
        f5105c.f237d += f6;
        interfaceC1027y.mo209a(f5105c, paint2);
        interfaceC1027y.mo186a(str, f5106d.f234a, f5106d.f237d, paint);
    }

    /* renamed from: a */
    public static float m1885a(C0934e c0934e, float f, float f2) {
        return m1884a(c0934e, f, f2, f, f2);
    }

    /* renamed from: a */
    public static float m1884a(C0934e c0934e, float f, float f2, float f3, float f4) {
        float f5 = c0934e.f6402p;
        float f6 = c0934e.f6403q;
        float f7 = 1.0f;
        if (f5 * 1.0f < f) {
            float f8 = f / f5;
            if (f8 > 1.0f) {
                f7 = f8;
            }
        }
        if (f6 * f7 < f2) {
            float f9 = f2 / f6;
            if (f9 > f7) {
                f7 = f9;
            }
        }
        if (f5 * f7 > f3) {
            float f10 = f3 / f5;
            if (f10 < f7) {
                f7 = f10;
            }
        }
        if (f6 * f7 > f4) {
            float f11 = f4 / f6;
            if (f11 < f7) {
                f7 = f11;
            }
        }
        return f7;
    }
}
