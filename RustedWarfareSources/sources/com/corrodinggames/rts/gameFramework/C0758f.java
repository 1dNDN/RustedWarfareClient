package com.corrodinggames.rts.gameFramework;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f.class */
public final class C0758f {

    /* renamed from: a */
    static final Random f4888a = new Random();

    /* renamed from: b */
    static final Random f4889b = new Random();

    /* renamed from: c */
    public static final PointF f4890c = new PointF();

    /* renamed from: j */
    private static final byte[] f4891j = new byte[1001];

    /* renamed from: d */
    static final PointF f4892d;

    /* renamed from: e */
    static final PointF f4893e;

    /* renamed from: f */
    static final PointF f4894f;

    /* renamed from: g */
    static final PointF f4895g;

    /* renamed from: h */
    static final PointF f4896h;

    /* renamed from: k */
    private static final char[] f4897k;

    /* renamed from: l */
    private static final float[] f4898l;

    /* renamed from: m */
    private static final float[] f4899m;

    /* renamed from: n */
    private static final float[] f4900n;

    /* renamed from: o */
    private static final float[] f4901o;

    /* renamed from: p */
    private static final float[] f4902p;

    /* renamed from: q */
    private static final float[] f4903q;

    /* renamed from: r */
    private static final float[] f4904r;

    /* renamed from: s */
    private static final float[] f4905s;

    /* renamed from: i */
    static int f4906i;

    /* renamed from: t */
    private static final float[] f4907t;

    /* renamed from: u */
    private static final float[] f4908u;

    static {
        for (int i = 0; i < f4891j.length; i++) {
            f4891j[i] = (byte) StrictMath.round(m2163a(i));
        }
        f4892d = new PointF();
        f4893e = new PointF();
        f4894f = new PointF();
        f4895g = new PointF();
        f4896h = new PointF();
        f4897k = new char[36];
        for (int i2 = 0; i2 < 10; i2++) {
            f4897k[i2] = (char) (48 + i2);
        }
        for (int i3 = 10; i3 < 36; i3++) {
            f4897k[i3] = (char) ((97 + i3) - 10);
        }
        f4898l = new float[1025];
        f4899m = new float[1025];
        f4900n = new float[1025];
        f4901o = new float[1025];
        f4902p = new float[1025];
        f4903q = new float[1025];
        f4904r = new float[1025];
        f4905s = new float[1025];
        for (int i4 = 0; i4 <= 1024; i4++) {
            f4898l[i4] = (float) ((StrictMath.atan(i4 / 1024.0f) * 3.1415927410125732d) / 3.141592653589793d);
            f4899m[i4] = 1.5707964f - f4898l[i4];
            f4900n[i4] = -f4898l[i4];
            f4901o[i4] = f4898l[i4] - 1.5707964f;
            f4902p[i4] = 3.1415927f - f4898l[i4];
            f4903q[i4] = f4898l[i4] + 1.5707964f;
            f4904r[i4] = f4898l[i4] - 3.1415927f;
            f4905s[i4] = (-1.5707964f) - f4898l[i4];
        }
        f4906i = 0;
        f4907t = new float[8192];
        f4908u = new float[8192];
        for (int i5 = 0; i5 < 8192; i5++) {
            f4907t[i5] = (float) StrictMath.sin(((i5 + 0.5f) / 8192.0f) * 6.2831855f);
            f4908u[i5] = (float) StrictMath.cos(((i5 + 0.5f) / 8192.0f) * 6.2831855f);
        }
    }

    /* renamed from: a */
    public static final void m2167a() {
        f4889b.setSeed(0L);
    }

    /* renamed from: a */
    public static final int m2140a(AbstractC0244am abstractC0244am, int i, int i2) {
        return m2139a((AbstractC1120w) abstractC0244am, i, i2, 0);
    }

    /* renamed from: a */
    public static final float m2141a(AbstractC0244am abstractC0244am, float f, float f2, int i) {
        if (abstractC0244am == null) {
            return m2152a((int) (f * 1000.0f), (int) (f2 * 1000.0f), i) * 0.001f;
        }
        return m2139a((AbstractC1120w) abstractC0244am, (int) (f * 1000.0f), (int) (f2 * 1000.0f), i) * 0.001f;
    }

    /* renamed from: b */
    public static final float m2100b(AbstractC0244am abstractC0244am, float f, float f2, int i) {
        return m2139a((AbstractC1120w) abstractC0244am, (int) (f * 1000.0f), (int) (f2 * 1000.0f), i) * 0.001f;
    }

    /* renamed from: a */
    public static final int m2139a(AbstractC1120w abstractC1120w, int i, int i2, int i3) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (i >= i2) {
            if (i > i2) {
                LoggerMaybe.m990b("min>max");
            }
            return i;
        }
        int i4 = m1079A.f6239bx + 1;
        int i5 = (int) (((int) (((int) (((int) (((int) (m1079A.f6108bJ + (abstractC1120w.f6951ee * 1313))) + (abstractC1120w.f6957el * 13.0f))) + (abstractC1120w.f6958em * 13.0f))) + (abstractC1120w.f6957el * 130.0f))) + (abstractC1120w.f6958em * 130.0f));
        if (abstractC1120w instanceof AbstractC0244am) {
            int i6 = ((AbstractC0244am) abstractC1120w).f1588bB;
            i5 = i5 + (i6 * 13131) + (i6 * i4);
        }
        int i7 = ((((int) ((i5 + ((i3 * 133) * i2)) + ((i3 * abstractC1120w.f6951ee) + i3))) + (i3 * (i4 * 1313))) + ((i4 * 13) + (i4 % 10))) % (i2 - i);
        if (i7 < 0) {
            i7 = -i7;
        }
        return i7 + i;
    }

    /* renamed from: a */
    public static final float m2158a(float f, float f2, int i) {
        return m2152a((int) (f * 100.0f), (int) (f2 * 100.0f), i) / 100.0f;
    }

    /* renamed from: b */
    public static final float m2107b(float f, float f2, int i) {
        return m2152a((int) (f * 1000.0f), (int) (f2 * 1000.0f), i) / 1000.0f;
    }

    /* renamed from: a */
    public static final int m2152a(int i, int i2, int i3) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (i >= i2) {
            if (i > i2) {
                LoggerMaybe.m990b("min>max");
            }
            return i;
        }
        int i4 = i2 - i;
        int i5 = ((((m1079A.f6108bJ + ((i3 * 133333333) * i4)) + (i3 * 13131313)) + (i3 * (m1079A.f6239bx * 13131313))) + ((m1079A.f6239bx * 1313131313) + (m1079A.f6239bx % 10))) % i4;
        if (i5 < 0) {
            i5 = -i5;
        }
        int i6 = i5 + i;
        if (i6 < i || i6 > i2) {
            LoggerMaybe.m990b("notRandInt number not in range: " + i6 + " min:" + i + " max:" + i2);
        }
        return i6;
    }

    /* renamed from: a */
    public static String m2130a(String str) {
        return new SimpleDateFormat(str).format(Calendar.getInstance().getTime());
    }

    /* renamed from: a */
    public static final void m2136a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static final String m2137a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        byteArrayOutputStream.close();
        inputStream.close();
        return byteArrayOutputStream.toString();
    }

    /* renamed from: a */
    public static final float m2163a(float f) {
        return (float) StrictMath.sqrt(f);
    }

    /* renamed from: a */
    public static final int m2155a(int i) {
        if (i > 1000 || i < 0) {
            return StrictMath.round(m2163a(i));
        }
        return f4891j[i];
    }

    /* renamed from: a */
    public static final float m2162a(float f, float f2) {
        if (f > f2) {
            return f - f2;
        }
        if (f < (-f2)) {
            return f + f2;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static final float m2161a(float f, float f2, float f3) {
        if (f > f2 + f3) {
            return f - f3;
        }
        if (f < f2 - f3) {
            return f + f3;
        }
        return f2;
    }

    /* renamed from: b */
    public static final float m2110b(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        if (f < (-f2)) {
            return -f2;
        }
        return f;
    }

    /* renamed from: b */
    public static final float m2109b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: b */
    public static final int m2104b(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    /* renamed from: b */
    public static final int m2106b(int i) {
        if (i > 255) {
            return 255;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    public static final void m2159a(float f, float f2, float f3, PointF pointF) {
        float m2048h = m2048h(f3);
        float m2043i = m2043i(f3);
        pointF.f227a -= f;
        pointF.f228b -= f2;
        float f4 = (pointF.f227a * m2043i) - (pointF.f228b * m2048h);
        float f5 = (pointF.f227a * m2048h) + (pointF.f228b * m2043i);
        pointF.f227a = f4 + f;
        pointF.f228b = f5 + f2;
    }

    /* renamed from: a */
    public static final float m2160a(float f, float f2, float f3, float f4) {
        return ((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4));
    }

    /* renamed from: b */
    public static final float m2108b(float f, float f2, float f3, float f4) {
        return (float) StrictMath.sqrt(((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4)));
    }

    /* renamed from: c */
    public static final int m2085c(float f, float f2, float f3, float f4) {
        return m2155a((int) (((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4))));
    }

    /* renamed from: a */
    public static final int m2151a(int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        if (i5 < 0) {
            i5 = -i5;
        }
        if (i6 < 0) {
            i6 = -i6;
        }
        return i5 > i6 ? i5 : i6;
    }

    /* renamed from: a */
    public static final float m2156a(float f, boolean z) {
        if (!z) {
            while (true) {
                if (f <= 180.0f && f >= -180.0f) {
                    break;
                }
                if (f > 180.0f) {
                    f -= 360.0f;
                }
                if (f < -180.0f) {
                    f += 360.0f;
                }
            }
        } else {
            while (true) {
                if (f <= 360.0f && f >= 0.0f) {
                    break;
                }
                if (f > 360.0f) {
                    f -= 360.0f;
                }
                if (f < 0.0f) {
                    f += 360.0f;
                }
            }
        }
        return f;
    }

    /* renamed from: c */
    public static final float m2086c(float f, float f2, float f3) {
        float f4 = (f2 % 360.0f) - (f % 360.0f);
        if (f4 > 180.0f) {
            f4 -= 360.0f;
        }
        if (f4 < -180.0f) {
            f4 += 360.0f;
        }
        return f4 > f3 ? f3 : f4 < (-f3) ? -f3 : f4;
    }

    /* renamed from: d */
    public static final float m2074d(float f, float f2, float f3, float f4) {
        return m2111b(m2042i(f4 - f2, f3 - f));
    }

    /* renamed from: a */
    public static final boolean m2148a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        float f = ((pointF4.f228b - pointF3.f228b) * (pointF2.f227a - pointF.f227a)) - ((pointF4.f227a - pointF3.f227a) * (pointF2.f228b - pointF.f228b));
        float f2 = ((pointF4.f227a - pointF3.f227a) * (pointF.f228b - pointF3.f228b)) - ((pointF4.f228b - pointF3.f228b) * (pointF.f227a - pointF3.f227a));
        float f3 = ((pointF2.f227a - pointF.f227a) * (pointF.f228b - pointF3.f228b)) - ((pointF2.f228b - pointF.f228b) * (pointF.f227a - pointF3.f227a));
        if (f == 0.0f) {
            if (f2 != 0.0f || f3 == 0.0f) {
                return false;
            }
            return false;
        }
        float f4 = f2 / f;
        float f5 = f3 / f;
        return f4 >= 0.0f && f4 <= 1.0f && f5 >= 0.0f && f5 <= 1.0f;
    }

    /* renamed from: c */
    public static final float m2087c(float f, float f2) {
        return (f4888a.nextFloat() * (f2 - f)) + f;
    }

    /* renamed from: d */
    public static final float m2076d(float f, float f2) {
        return (f4888a.nextFloat() * (f2 - f)) + f;
    }

    /* renamed from: c */
    public static final int m2084c(int i) {
        if (i == 0) {
            return 0;
        }
        return f4888a.nextInt(i);
    }

    /* renamed from: a */
    public static int m2154a(int i, int i2) {
        int nextInt;
        if (i2 == i) {
            nextInt = 0;
        } else {
            nextInt = f4888a.nextInt((i2 - i) + 1);
        }
        return i + nextInt;
    }

    /* renamed from: a */
    public static final void m2147a(Rect rect) {
        if (rect.f232c < rect.f230a) {
            int i = rect.f232c;
            rect.f232c = rect.f230a;
            rect.f230a = i;
        }
        if (rect.f233d < rect.f231b) {
            int i2 = rect.f233d;
            rect.f233d = rect.f231b;
            rect.f231b = i2;
        }
    }

    /* renamed from: a */
    public static final void m2144a(RectF rectF) {
        if (rectF.f236c < rectF.f234a) {
            float f = rectF.f236c;
            rectF.f236c = rectF.f234a;
            rectF.f234a = f;
        }
        if (rectF.f237d < rectF.f235b) {
            float f2 = rectF.f237d;
            rectF.f237d = rectF.f235b;
            rectF.f235b = f2;
        }
    }

    /* renamed from: d */
    public static final PointF m2075d(float f, float f2, float f3) {
        f4896h.m5472a(f, f2 - f3);
        return f4896h;
    }

    /* renamed from: b */
    public static final float m2111b(float f) {
        return f * 57.29578f;
    }

    /* renamed from: e */
    public static final float m2067e(float f, float f2) {
        return (float) StrictMath.pow(f, f2);
    }

    /* renamed from: a */
    public static final double m2166a(double d) {
        return d < 0.0d ? -d : d;
    }

    /* renamed from: c */
    public static final float m2088c(float f) {
        return f < 0.0f ? -f : f;
    }

    /* renamed from: d */
    public static final int m2073d(int i) {
        return i < 0 ? -i : i;
    }

    /* renamed from: b */
    public static final int m2105b(int i, int i2) {
        return i > i2 ? i : i2;
    }

    /* renamed from: c */
    public static final int m2083c(int i, int i2) {
        return i < i2 ? i : i2;
    }

    /* renamed from: f */
    public static final float m2059f(float f, float f2) {
        return f > f2 ? f : f2;
    }

    /* renamed from: g */
    public static final float m2052g(float f, float f2) {
        return f < f2 ? f : f2;
    }

    /* renamed from: h */
    public static final boolean m2047h(float f, float f2) {
        return m2088c(f - f2) < 0.05f;
    }

    /* renamed from: a */
    public static final double m2165a(double d, double d2) {
        return d < d2 ? d : d2;
    }

    /* renamed from: e */
    public static boolean m2066e(float f, float f2, float f3) {
        if (m2088c(m2088c(f) - m2088c(f2)) < f3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static float m2077d(float f) {
        return (int) (f + 0.5f);
    }

    /* renamed from: e */
    public static final int m2068e(float f) {
        if (f > 0.0f) {
            return (int) f;
        }
        if (f < 0.0f) {
            return ((int) f) - 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m2143a(RectF rectF, float f) {
        rectF.f234a -= f;
        rectF.f235b -= f;
        rectF.f236c += f;
        rectF.f237d += f;
    }

    /* renamed from: a */
    public static void m2146a(Rect rect, float f) {
        rect.f230a = (int) (rect.f230a - f);
        rect.f231b = (int) (rect.f231b - f);
        rect.f232c = (int) (rect.f232c + f);
        rect.f233d = (int) (rect.f233d + f);
    }

    /* renamed from: b */
    public static void m2101b(Rect rect, float f) {
        rect.f230a = (int) (rect.f230a - f);
        rect.f231b = (int) (rect.f231b - f);
        rect.f232c = (int) (rect.f232c + (f * 2.0f));
        rect.f233d = (int) (rect.f233d + (f * 2.0f));
    }

    /* renamed from: e */
    public static String m2065e(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(f4897k[f4888a.nextInt(f4897k.length)]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m2115b() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m2119a(boolean z) {
        return z ? "true" : "false";
    }

    /* renamed from: b */
    public static String m2114b(double d) {
        if (d == ((int) d)) {
            return VariableScope.nullOrMissingString + ((int) d);
        }
        return VariableScope.nullOrMissingString + d;
    }

    /* renamed from: f */
    public static String m2060f(float f) {
        return m2157a(f, 2);
    }

    /* renamed from: c */
    public static String m2089c(double d) {
        if (d == ((int) d)) {
            return VariableScope.nullOrMissingString + ((int) d);
        }
        return m2112b(d, 2);
    }

    /* renamed from: a */
    public static String m2157a(float f, int i) {
        if (f == ((int) f)) {
            return VariableScope.nullOrMissingString + ((int) f);
        }
        return m2112b(f, i);
    }

    /* renamed from: a */
    public static String m2164a(double d, int i) {
        if (d == ((int) d)) {
            return VariableScope.nullOrMissingString + ((int) d);
        }
        return m2112b(d, i);
    }

    /* renamed from: g */
    public static String m2053g(float f) {
        if (((int) (f * 10.0f)) == ((int) f) * 10) {
            return VariableScope.nullOrMissingString + ((int) f) + "s";
        }
        return m2112b(f, 1) + "s";
    }

    /* renamed from: b */
    public static String m2112b(double d, int i) {
        String str = VariableScope.nullOrMissingString + d;
        int indexOf = str.indexOf(".");
        if (indexOf == -1) {
            return str;
        }
        if (str.indexOf("E") != -1) {
            return String.format("%." + i + "f", Double.valueOf(d));
        }
        int i2 = indexOf + i + 1;
        if (i2 > str.length()) {
            i2 = str.length();
        }
        return str.substring(0, i2);
    }

    /* renamed from: a */
    public static String m2128a(String str, int i) {
        if (str == null) {
            return null;
        }
        if (str.length() < i) {
            return str;
        }
        return str.substring(0, Math.min(str.length(), i));
    }

    /* renamed from: b */
    public static String m2095b(String str, int i) {
        if (str == null) {
            return null;
        }
        if (str.length() < i) {
            return str;
        }
        int i2 = i - 3;
        if (i2 < 1) {
            i2 = 1;
        }
        return str.substring(0, Math.min(str.length(), i2)) + "...";
    }

    /* renamed from: b */
    public static String m2097b(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 should be supported", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("MD5 should be supported", e2);
        }
    }

    /* renamed from: c */
    public static String m2082c(String str) {
        return m2128a(m2118a(m2056f(str)), 14);
    }

    /* renamed from: d */
    public static String m2072d(String str) {
        return m2128a(m2118a(m2056f(str)), 4);
    }

    /* renamed from: c */
    public static String m2080c(String str, int i) {
        String m2118a = m2118a(m2056f(str));
        for (int i2 = 0; i2 < i; i2++) {
            m2118a = m2118a(m2056f(m2118a));
        }
        return m2118a;
    }

    /* renamed from: e */
    public static String m2064e(String str) {
        return m2118a(m2056f(str));
    }

    /* renamed from: f */
    static byte[] m2056f(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            return messageDigest.digest(str.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static String m2118a(byte[] bArr) {
        return String.format("%0" + (bArr.length * 2) + "X", new BigInteger(1, bArr));
    }

    /* renamed from: b */
    public static String m2091b(byte[] bArr) {
        return m2118a(m2078c(bArr));
    }

    /* renamed from: c */
    static byte[] m2078c(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            return messageDigest.digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static int m2090c() {
        int availableProcessors;
        int i = 1;
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists()) {
                i = file.listFiles(new C0759a()).length;
            }
        } catch (Exception e) {
            e.printStackTrace();
            i = 1;
        }
        if (i == 1 && (availableProcessors = Runtime.getRuntime().availableProcessors()) > 1) {
            i = availableProcessors;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f$a */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f$a.class */
    public class C0759a implements FileFilter {
        C0759a() {
        }

        public boolean accept(File file) {
            if (file != null && Pattern.matches("cpu[0-9]+", file.getName())) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m2117a(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* renamed from: f */
    public static float m2058f(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public static int m2153a(int i, int i2, float f) {
        int m5540a = Color.m5540a(i);
        int m5536b = Color.m5536b(i);
        int m5535c = Color.m5535c(i);
        int m5534d = Color.m5534d(i);
        return Color.m5538a((int) m2058f(m5540a, Color.m5540a(i2), f), (int) m2058f(m5536b, Color.m5536b(i2), f), (int) m2058f(m5535c, Color.m5535c(i2), f), (int) m2058f(m5534d, Color.m5534d(i2), f));
    }

    /* renamed from: d */
    public static String m2070d(String str, int i) {
        String str2 = VariableScope.nullOrMissingString;
        for (int i2 = 0; i2 <= i; i2++) {
            str2 = str2 + str;
        }
        return str2;
    }

    /* renamed from: e */
    public static String m2062e(String str, int i) {
        for (int length = str.length(); length < i; length++) {
            str = str + " ";
        }
        return str;
    }

    /* renamed from: a */
    public static String m2127a(String str, int i, String str2) {
        for (int length = str.length(); length < i; length++) {
            str = str2 + str;
        }
        return str;
    }

    /* renamed from: f */
    public static String m2055f(String str, int i) {
        return String.format("%1$-" + i + "s", str);
    }

    /* renamed from: a */
    public static String m2134a(Class cls, int i) {
        Field[] fields;
        try {
            for (Field field : cls.getFields()) {
                if (field.getInt(null) == i) {
                    return field.getName();
                }
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: f */
    public static String m2057f(int i) {
        String m2134a = m2134a(C0067R.drawable.class, i);
        if (m2134a != null) {
            return C0750a.m2241a("res/drawable", m2134a);
        }
        String m2134a2 = m2134a(C0067R.raw.class, i);
        if (m2134a2 != null) {
            return C0750a.m2241a("res/raw", m2134a2);
        }
        return null;
    }

    /* renamed from: g */
    public static final String m2051g(int i) {
        if (-1000 < i && i < 1000) {
            return i + " B";
        }
        int i2 = 0;
        while (i2 < "kMGTPE".length() && (i <= -999950 || i >= 999950)) {
            i /= 1000;
            i2++;
        }
        return String.format("%.1f %cB", Double.valueOf(i / 1000.0d), Character.valueOf("kMGTPE".charAt(i2)));
    }

    /* renamed from: h */
    public static final String m2046h(int i) {
        return String.format("#%06X", Integer.valueOf(16777215 & i));
    }

    /* renamed from: g */
    public static final String m2050g(String str) {
        if (str == null) {
            return null;
        }
        return new File(str).getName().replaceFirst("[.][^.]+$", VariableScope.nullOrMissingString);
    }

    /* renamed from: h */
    public static final String m2045h(String str) {
        if (str.contains("\\")) {
            str = str.replace('\\', '/');
        }
        return new File(str).getParent();
    }

    /* renamed from: a */
    public static final boolean m2145a(Rect rect, RectF rectF) {
        return ((float) rect.f230a) < rectF.f236c && rectF.f234a < ((float) rect.f232c) && ((float) rect.f231b) < rectF.f237d && rectF.f235b < ((float) rect.f233d);
    }

    /* renamed from: a */
    public static final boolean m2142a(RectF rectF, RectF rectF2) {
        return rectF.f234a < rectF2.f236c && rectF2.f234a < rectF.f236c && rectF.f235b < rectF2.f237d && rectF2.f235b < rectF.f237d;
    }

    /* renamed from: b */
    public static final int m2103b(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static final long m2149a(long j, long j2) {
        return (j2 - j) / 1000000;
    }

    /* renamed from: a */
    public static final int m2129a(String str, char c) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public static final String m2041i(String str) {
        return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("${", "$ {");
    }

    /* renamed from: a */
    public static String m2138a(File file) {
        int read;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                int length = bArr.length;
                int i = 0;
                while (i < length && (read = fileInputStream.read(bArr, i, length - i)) != -1) {
                    i += read;
                }
                String str = new String(bArr, Charset.forName("UTF-8"));
                fileInputStream.close();
                return str;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: b */
    public static String m2099b(InputStream inputStream) {
        int read;
        try {
            try {
                byte[] bArr = new byte[inputStream.available()];
                int length = bArr.length;
                int i = 0;
                while (i < length && (read = inputStream.read(bArr, i, length - i)) != -1) {
                    i += read;
                }
                String str = new String(bArr, Charset.forName("UTF-8"));
                inputStream.close();
                return str;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static final String m2133a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static final String m2098b(Exception exc) {
        return m2132a(exc, false);
    }

    /* renamed from: a */
    public static final String m2132a(Exception exc, boolean z) {
        Throwable th;
        String message = exc.getMessage();
        if (message == null) {
            message = exc.getClass().getName();
        } else {
            boolean z2 = false;
            if (exc instanceof NumberFormatException) {
                z2 = true;
            }
            if (exc instanceof ArrayIndexOutOfBoundsException) {
                z2 = true;
            }
            if (z2 || z) {
                message = exc.getClass().getName() + " - " + message;
            }
        }
        if (message != null && message.startsWith("java.io.IOException")) {
            message = message.substring("java.io.".length());
        }
        Throwable th2 = exc;
        while (true) {
            th = th2;
            if (th != null) {
                Throwable cause = th.getCause();
                if (cause == null || cause == exc || cause == th) {
                    break;
                }
                th2 = cause;
            } else {
                break;
            }
        }
        if (th != null && th != exc) {
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = th.getClass().getName();
            }
            boolean z3 = true;
            if (message2.equals(message)) {
                z3 = false;
            }
            if (message != null && message.contains(message2)) {
                z3 = false;
            }
            if (z3) {
                message = message + " caused by (" + message2 + ")";
            }
        }
        return message;
    }

    /* renamed from: j */
    public static String m2039j(String str) {
        if (str.endsWith("\n")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: a */
    public static String m2125a(String str, String str2) {
        if (str.endsWith(str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    /* renamed from: k */
    public static String m2038k(String str) {
        return new File(str).getName();
    }

    /* renamed from: b */
    public static String m2094b(String str, String str2) {
        if (str2.startsWith("/") || str2.startsWith("\\")) {
            str2 = str2.substring(1);
        }
        if (str.endsWith("/")) {
            return str + str2;
        }
        if (str.endsWith("\\")) {
            str = str.substring(0, str.length() - 1);
        }
        return str + "/" + str2;
    }

    /* renamed from: a */
    public static String m2135a(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: l */
    public static Integer m2037l(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            LoggerMaybe.LogDebug2(e.toString());
            return null;
        }
    }

    /* renamed from: m */
    public static Long m2036m(String str) {
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException e) {
            LoggerMaybe.LogDebug2(e.toString());
            return null;
        }
    }

    /* renamed from: n */
    public static boolean m2035n(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < length) {
                int codePointAt = str.codePointAt(i2);
                if (codePointAt > 128) {
                    return true;
                }
                i = i2 + Character.charCount(codePointAt);
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static String m2150a(long j) {
        int[] m2102b;
        String str;
        if (m2102b(j)[0] == 0) {
            str = m2127a(VariableScope.nullOrMissingString + m2102b[1], 2, "0") + ":" + m2127a(VariableScope.nullOrMissingString + m2102b[2], 2, "0");
        } else {
            str = m2127a(VariableScope.nullOrMissingString + m2102b[0], 2, "0") + ":" + m2127a(VariableScope.nullOrMissingString + m2102b[1], 2, "0") + ":" + m2127a(VariableScope.nullOrMissingString + m2102b[2], 2, "0");
        }
        return str;
    }

    /* renamed from: b */
    public static int[] m2102b(long j) {
        int i = ((int) j) / 3600;
        int i2 = ((int) j) - (i * 3600);
        int i3 = i2 / 60;
        return new int[]{i, i3, i2 - (i3 * 60)};
    }

    /* renamed from: i */
    public static final float m2042i(float f, float f2) {
        try {
            if (f2 >= 0.0f) {
                if (f >= 0.0f) {
                    if (f2 >= f) {
                        return f4898l[(int) (((1024.0f * f) / f2) + 0.5d)];
                    }
                    return f4899m[(int) (((1024.0f * f2) / f) + 0.5d)];
                } else if (f2 >= (-f)) {
                    return f4900n[(int) ((((-1024.0f) * f) / f2) + 0.5d)];
                } else {
                    return f4901o[(int) ((((-1024.0f) * f2) / f) + 0.5d)];
                }
            } else if (f >= 0.0f) {
                if ((-f2) >= f) {
                    return f4902p[(int) ((((-1024.0f) * f) / f2) + 0.5d)];
                }
                return f4903q[(int) ((((-1024.0f) * f2) / f) + 0.5d)];
            } else if (f2 <= f) {
                return f4904r[(int) (((1024.0f * f) / f2) + 0.5d)];
            } else {
                return f4905s[(int) (((1024.0f * f2) / f) + 0.5d)];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            if (f4906i < 100) {
                LoggerMaybe.LogDebug2("atan2 slow fallback for y:" + f + " x:" + f2);
                f4906i++;
            }
            return (float) StrictMath.atan2(f, f2);
        }
    }

    /* renamed from: h */
    public static final float m2048h(float f) {
        return f4907t[((int) (f * 22.755556f)) & 8191];
    }

    /* renamed from: i */
    public static final float m2043i(float f) {
        return f4908u[((int) (f * 22.755556f)) & 8191];
    }

    /* renamed from: o */
    public static String m2034o(String str) {
        if (str.contains("&")) {
            str = str.replace("&lt;", "<").replace("&gt;", ">").replace("&apos;", "'").replace("&quot;", "\"").replace("&amp;", "&");
        }
        return str;
    }

    /* renamed from: p */
    public static String m2033p(String str) {
        if (str == null || str.length() < 2) {
            return null;
        }
        char charAt = str.charAt(0);
        if ((charAt != '\"' && charAt != '\'') || str.charAt(str.length() - 1) != charAt) {
            return null;
        }
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++) {
            char charAt2 = str.charAt(i);
            boolean z2 = z;
            z = false;
            if (!z2) {
                if (charAt2 == '\\') {
                    z = true;
                } else if (charAt2 == charAt) {
                    return null;
                }
            }
            sb.append(charAt2);
        }
        return sb.toString();
    }

    /* renamed from: q */
    public static String m2032q(String str) {
        char[] charArray;
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            boolean z2 = z;
            z = false;
            if (!z2 && c == '\\') {
                z = true;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m2123a(String str, String str2, String str3) {
        if (!m2079c(str, str2)) {
            return str;
        }
        return str.replace(str2, str3);
    }

    /* renamed from: c */
    public static final boolean m2079c(String str, String str2) {
        return str.indexOf(str2) > -1;
    }

    /* renamed from: b */
    public static final boolean m2096b(String str, char c) {
        return str.indexOf(c) > -1;
    }

    /* renamed from: c */
    public static String[] m2081c(String str, char c) {
        int i;
        if (str.length() == 0) {
            return new String[]{VariableScope.nullOrMissingString};
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i3;
            int indexOf = str.indexOf(c, i);
            if (indexOf == -1) {
                break;
            }
            i2++;
            i3 = indexOf + 1;
        }
        if (i2 == 0) {
            return new String[]{str};
        }
        int length = str.length();
        if (i == length) {
            if (i2 == length) {
                return new String[0];
            }
            do {
                i--;
            } while (str.charAt(i - 1) == c);
            i2 -= str.length() - i;
            length = i;
        }
        String[] strArr = new String[i2 + 1];
        int i4 = 0;
        for (int i5 = 0; i5 != i2; i5++) {
            int indexOf2 = str.indexOf(c, i4);
            strArr[i5] = str.substring(i4, indexOf2);
            i4 = indexOf2 + 1;
        }
        strArr[i2] = str.substring(i4, length);
        return strArr;
    }

    /* renamed from: a */
    public static String m2116a(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (z) {
                z = false;
            } else {
                stringBuffer.append(",");
            }
            if (str.contains("\\")) {
                str = str.replace("\\", "\\\\");
            }
            if (str.contains(",")) {
                str = str.replace(",", "\\,");
            }
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    /* renamed from: r */
    public static String[] m2031r(String str) {
        return m2071d(str, ',');
    }

    /* renamed from: d */
    public static String[] m2071d(String str, char c) {
        char[] charArray;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            boolean z2 = z;
            z = false;
            if (!z2) {
                if (c2 == '\\') {
                    z = true;
                } else if (c2 == c) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            }
            sb.append(c2);
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
        if (arrayList.size() == 0) {
            arrayList.add(VariableScope.nullOrMissingString);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: e */
    public static String[] m2063e(String str, char c) {
        char[] charArray;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            boolean z4 = z;
            z = false;
            if (!z4) {
                if (c2 == '\\') {
                    z = true;
                }
                if (!z3 && c2 == '\'') {
                    z2 = !z2;
                }
                if (!z2 && c2 == '\"') {
                    z3 = !z3;
                }
            }
            if (c2 == c && !z2 && !z3 && !z2) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c2);
            }
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: s */
    public static int m2030s(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '(') {
                i++;
            } else if (charAt == ')') {
                i--;
            }
        }
        return i;
    }

    /* renamed from: t */
    public static int m2029t(String str) {
        char[] charArray;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (char c : str.toCharArray()) {
            boolean z4 = z;
            z = false;
            if (!z4) {
                if (c == '\\') {
                    z = true;
                }
                if (!z3 && c == '\'') {
                    z2 = !z2;
                }
                if (!z2 && c == '\"') {
                    z3 = !z3;
                }
            }
            if (!z2 && !z3) {
                if (c == '(') {
                    i++;
                } else if (c == ')') {
                    i--;
                }
            }
        }
        return i;
    }

    /* renamed from: g */
    public static int m2049g(String str, int i) {
        if (str.charAt(i) != '(') {
            LoggerMaybe.m990b("getBracketEnd: Did not start on a bracket");
            return -1;
        } else if (i + 1 >= str.length()) {
            return -1;
        } else {
            int i2 = 1;
            for (int i3 = i + 1; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '(') {
                    i2++;
                } else if (charAt == ')') {
                    i2--;
                }
                if (i2 == 0) {
                    return i3;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static String[] m2121a(String str, String str2, boolean z) {
        return !str.contains(str2) ? new String[]{str} : (String[]) m2092b(str, str2, z).toArray(new String[0]);
    }

    /* renamed from: b */
    public static ArrayList m2092b(String str, String str2, boolean z) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        int length = str2.length();
        int length2 = str.length();
        int i2 = 0;
        while (i2 < length2) {
            char charAt2 = str.charAt(i2);
            if (charAt2 == '(') {
                i++;
            } else if (charAt2 == ')') {
                i--;
            }
            if (i == 0) {
                boolean z2 = false;
                if (charAt == charAt2 && (length == 1 || str.indexOf(str2, i2) == i2)) {
                    z2 = true;
                }
                if (z2 && (!z || (!m2044h(str, i2 - 1) && !m2044h(str, i2 + str2.length())))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2 += str2.length() - 1;
                    i2++;
                }
            }
            stringBuffer.append(charAt2);
            i2++;
        }
        arrayList.add(stringBuffer.toString());
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m2120a(String str, String str2, boolean z, boolean z2) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        int length = str2.length();
        int length2 = str.length();
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        if (str2.equals("-")) {
            z6 = true;
        }
        char c = 0;
        char c2 = 0;
        String str3 = str;
        if (z2) {
            str3 = str.toLowerCase(Locale.ROOT);
        }
        int i2 = 0;
        while (i2 < length2) {
            char charAt2 = str3.charAt(i2);
            char charAt3 = str.charAt(i2);
            if (c2 != ' ') {
                c = c2;
            }
            c2 = charAt2;
            boolean z7 = z3;
            z3 = false;
            if (!z7) {
                if (charAt2 == '\\') {
                    z3 = true;
                }
                if (!z5 && charAt2 == '\'') {
                    z4 = !z4;
                }
                if (!z4 && charAt2 == '\"') {
                    z5 = !z5;
                }
            }
            if (!(z4 || z5)) {
                if (charAt2 == '(') {
                    i++;
                } else if (charAt2 == ')') {
                    i--;
                }
                if (i == 0 && charAt == charAt2 && ((length == 1 || str3.indexOf(str2, i2) == i2) && ((!z || (!m2044h(str, i2 - 1) && !m2044h(str, i2 + str2.length()))) && (!z6 || (c != '*' && c != '/' && c != '+'))))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer.setLength(0);
                    i2 += str2.length() - 1;
                    i2++;
                }
            }
            stringBuffer.append(charAt3);
            i2++;
        }
        arrayList.add(stringBuffer.toString());
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m2122a(String str, String str2, String str3, boolean z) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        char charAt2 = str3.charAt(0);
        int length = str2.length();
        int length2 = str3.length();
        int length3 = str.length();
        int i2 = 0;
        while (i2 < length3) {
            char charAt3 = str.charAt(i2);
            if (charAt3 == '(') {
                i++;
            } else if (charAt3 == ')') {
                i--;
            }
            if (i == 0) {
                if (charAt == charAt3 && ((length == 1 || str.indexOf(str2, i2) == i2) && (!z || (!m2044h(str, i2 - 1) && !m2044h(str, i2 + str2.length()))))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2 += str2.length() - 1;
                } else if (charAt2 == charAt3 && ((length2 == 1 || str.indexOf(str3, i2) == i2) && (!z || (!m2044h(str, i2 - 1) && !m2044h(str, i2 + str3.length()))))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2 += str3.length() - 1;
                }
                i2++;
            }
            stringBuffer.append(charAt3);
            i2++;
        }
        arrayList.add(stringBuffer.toString());
        return arrayList;
    }

    /* renamed from: d */
    public static int m2069d(String str, String str2) {
        return m2124a(str, str2, 0);
    }

    /* renamed from: a */
    public static int m2124a(String str, String str2, int i) {
        int i2 = 0;
        char charAt = str2.charAt(0);
        int length = str2.length();
        for (int i3 = i; i3 < str.length(); i3++) {
            char charAt2 = str.charAt(i3);
            if (charAt2 == '(') {
                i2++;
            } else if (charAt2 == ')') {
                i2--;
            }
            if (i2 == 0 && charAt == charAt2 && (length == 1 || str.indexOf(str2, i3) == i3)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static boolean m2044h(String str, int i) {
        if (i < 0 || i >= str.length()) {
            return false;
        }
        char charAt = str.charAt(i);
        return Character.isLetter(charAt) || Character.isDigit(charAt);
    }

    /* renamed from: u */
    public static boolean m2028u(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && charAt != '.' && (charAt != '-' || i != 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m2027v(String str) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && (charAt != '-' || i != 0)) {
                if (!z && charAt == '.') {
                    z = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m2040j(float f, float f2) {
        return m2088c(f - f2) < 1.0E-7f;
    }

    /* renamed from: b */
    public static boolean m2113b(double d, double d2) {
        return m2166a(d - d2) < 1.0000000116860974E-7d;
    }

    /* renamed from: e */
    public static final boolean m2061e(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    public static final boolean m2131a(Integer num, Integer num2) {
        if (num == null) {
            return num2 == null;
        }
        return num.equals(num2);
    }

    /* renamed from: w */
    public static final String m2026w(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() < 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase(Locale.ROOT);
    }

    /* renamed from: b */
    public static int m2093b(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        int indexOf2 = str.indexOf(str3);
        if (indexOf == -1) {
            return indexOf2;
        }
        if (indexOf2 != -1 && indexOf >= indexOf2) {
            return indexOf2;
        }
        return indexOf;
    }

    /* renamed from: a */
    public static int m2126a(String str, int i, String[] strArr) {
        int i2 = -1;
        for (String str2 : strArr) {
            int m2124a = m2124a(str, str2, i);
            if (m2124a != -1 && (i2 > m2124a || i2 == -1)) {
                i2 = m2124a;
            }
        }
        return i2;
    }

    /* renamed from: x */
    public static String m2025x(String str) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '-') {
                z = !z;
            } else if (charAt != '+' && charAt != ' ') {
                if (z) {
                    return "-" + str.substring(i);
                }
                if (i == 0) {
                    return str;
                }
                return str.substring(i);
            }
        }
        return str;
    }

    /* renamed from: f */
    public static String[] m2054f(String str, String str2) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        return new String[]{str.substring(0, indexOf), str.substring(indexOf + str2.length())};
    }
}
