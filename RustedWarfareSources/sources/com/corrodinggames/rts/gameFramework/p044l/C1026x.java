package com.corrodinggames.rts.gameFramework.p044l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.File;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/x.class */
public class C1026x implements InterfaceC1027y {

    /* renamed from: a */
    static C1026x f6564a;

    /* renamed from: b */
    static C0934e f6565b;

    /* renamed from: c */
    static int[] f6566c;

    /* renamed from: d */
    static Bitmap f6567d;

    /* renamed from: x */
    private Context f6568x;

    /* renamed from: y */
    private InterfaceC0941l f6569y;

    /* renamed from: z */
    private InterfaceC0941l f6570z;

    /* renamed from: A */
    private C0923a f6571A;

    /* renamed from: h */
    public boolean f6572h;

    /* renamed from: i */
    public Bitmap f6573i;

    /* renamed from: j */
    public C0934e f6574j;

    /* renamed from: k */
    public int f6575k;

    /* renamed from: l */
    public int f6576l;

    /* renamed from: B */
    private C1026x f6577B;

    /* renamed from: s */
    C0934e f6578s;

    /* renamed from: e */
    static IntBuffer f6579e = IntBuffer.allocate(0);

    /* renamed from: f */
    static IntBuffer f6580f = IntBuffer.allocate(0);

    /* renamed from: t */
    static final RectF f6581t = new RectF();

    /* renamed from: u */
    static final RectF f6582u = new RectF();

    /* renamed from: w */
    static Rect f6583w = new Rect();

    /* renamed from: g */
    boolean f6584g = false;

    /* renamed from: m */
    final Rect f6585m = new Rect();

    /* renamed from: n */
    final Rect f6586n = new Rect();

    /* renamed from: o */
    final RectF f6587o = new RectF();

    /* renamed from: p */
    final RectF f6588p = new RectF();

    /* renamed from: q */
    final Matrix f6589q = new Matrix();

    /* renamed from: r */
    final RectF f6590r = new RectF();

    /* renamed from: v */
    C1101m f6591v = new C1101m();

    /* renamed from: a */
    public InterfaceC1027y mo5759a(C0934e c0934e) {
        C1026x c1026x = (C1026x) mo5760b(c0934e);
        c1026x.f6572h = true;
        return c1026x;
    }

    /* renamed from: b */
    public InterfaceC1027y mo5760b(C0934e c0934e) {
        if (this.f6577B != null) {
            return this.f6577B.mo5760b(c0934e);
        }
        C1026x c1026x = new C1026x();
        c1026x.mo218a(this.f6568x);
        Canvas canvas = new Canvas();
        Bitmap mo395b = c0934e.mo395b();
        canvas.m5553a(mo395b);
        c1026x.f6569y = new C0939j(canvas);
        c1026x.f6570z = c1026x.f6569y;
        c1026x.f6573i = mo395b;
        c1026x.f6574j = c0934e;
        c1026x.f6577B = this;
        if (c0934e != null) {
            c1026x.f6575k = c0934e.mo390m();
            c1026x.f6576l = c0934e.mo391l();
        }
        return c1026x;
    }

    /* renamed from: a */
    public boolean mo234a() {
        return false;
    }

    /* renamed from: a */
    public void mo218a(Context context) {
        this.f6568x = context;
    }

    /* renamed from: b */
    public void mo174b() {
        this.f6578s = new C0927ad(mo225a(C0067R.drawable.error_outmem));
    }

    /* renamed from: t */
    private void m817t() {
        C1026x c1026x;
        if (f6564a != this) {
            f6564a = this;
            if (this.f6577B != null) {
                c1026x = this.f6577B;
            } else {
                c1026x = this;
            }
            if (c1026x.m819c()) {
                InterfaceC0941l interfaceC0941l = this.f6569y;
                if (this.f6577B != null) {
                    interfaceC0941l = this.f6577B.f6569y;
                }
                if (!this.f6572h) {
                    if (f6565b != null) {
                        interfaceC0941l.mo845a((C0934e) null);
                        f6565b = null;
                    }
                    if (this.f6577B != null) {
                        this.f6569y = this.f6570z;
                        return;
                    }
                    return;
                }
                if (this.f6577B != null) {
                    this.f6569y = interfaceC0941l;
                }
                if (this.f6574j != f6565b) {
                    this.f6569y.mo845a(this.f6574j);
                    f6565b = this.f6574j;
                    return;
                }
                return;
            }
            if (f6565b != null) {
                InterfaceC0941l interfaceC0941l2 = this.f6569y;
                if (this.f6577B != null) {
                    interfaceC0941l2 = this.f6577B.f6569y;
                }
                interfaceC0941l2.mo845a((C0934e) null);
                f6565b = null;
            }
            if (this.f6577B != null) {
                this.f6569y = this.f6570z;
            }
        }
    }

    /* renamed from: a */
    private void m822a(Paint paint, String str) {
        m821a(paint, true, str, (C0934e) null);
    }

    /* renamed from: b */
    private void m820b(Paint paint) {
        m821a(paint, false, (String) null, (C0934e) null);
    }

    /* renamed from: a */
    private void m823a(Paint paint, C0934e c0934e) {
        m821a(paint, false, (String) null, c0934e);
    }

    /* renamed from: c */
    public boolean m819c() {
        if ((this.f6569y instanceof C0944o) || (this.f6569y instanceof C0940k)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m821a(Paint paint, boolean z, String str, C0934e c0934e) {
        m817t();
    }

    /* renamed from: d */
    public InterfaceC0941l mo153d() {
        return this.f6569y;
    }

    /* renamed from: a */
    public void mo194a(InterfaceC0941l interfaceC0941l) {
        this.f6569y = interfaceC0941l;
    }

    /* renamed from: a */
    public void mo208a(C0923a c0923a) {
        this.f6571A = c0923a;
    }

    /* renamed from: a */
    public C0934e mo225a(int i) {
        return mo219a(i, true);
    }

    /* renamed from: a */
    public C0934e mo219a(int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.f145d;
        } else {
            options.inPreferredConfig = Bitmap.Config.f143b;
        }
        options.inScaled = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f6568x.mo5602e(), i, options);
        if (decodeResource == null) {
            throw new RuntimeException("Could not load image with resId:" + i);
        }
        return m824a(decodeResource);
    }

    /* renamed from: a */
    public C0934e mo188a(InputStream inputStream, boolean z) {
        if (inputStream == null) {
            throw new RuntimeException("loadImage: steam is null");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.f145d;
        } else {
            options.inPreferredConfig = Bitmap.Config.f143b;
        }
        options.inScaled = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (decodeStream == null) {
                LoggerMaybe.m965g("Could not load image from steam");
                return null;
            }
            Log.m5365d("RustedWarfare", "load a:" + z + " as " + decodeStream.m5565d());
            return m824a(decodeStream);
        } catch (OutOfMemoryError e) {
            LoggerMaybe.m1040a(EnumC1065u.f6745a, e);
            if (this.f6578s == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e);
            }
            return this.f6578s;
        }
    }

    /* renamed from: a */
    public C0934e m824a(Bitmap bitmap) {
        C0934e c0934e = new C0934e();
        c0934e.mo398a(bitmap);
        return c0934e;
    }

    /* renamed from: a */
    public C0934e mo222a(int i, int i2, boolean z) {
        return mo170b(i, i2, z);
    }

    /* renamed from: b */
    public C0934e mo170b(int i, int i2, boolean z) {
        Bitmap.Config config;
        if (z) {
            config = Bitmap.Config.f145d;
        } else {
            config = Bitmap.Config.f145d;
        }
        try {
            Bitmap m5579a = Bitmap.m5579a(i, i2, config);
            if (m5579a != null && !z && config == Bitmap.Config.f145d && Build.VERSION.SDK_INT >= 12) {
                m5579a.m5572a(false);
            }
            if (m5579a == null) {
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("createBitmap returned null, possible out of memory");
                LoggerMaybe.m1040a(EnumC1065u.f6746b, outOfMemoryError);
                if (this.f6578s == null) {
                    throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
                }
                return this.f6578s;
            }
            return m824a(m5579a);
        } catch (OutOfMemoryError e) {
            LoggerMaybe.m1040a(EnumC1065u.f6746b, e);
            if (this.f6578s == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e);
            }
            return this.f6578s;
        }
    }

    /* renamed from: e */
    public void mo150e() {
    }

    /* renamed from: a */
    public void mo204a(C0934e c0934e, float f, float f2, float f3, Paint paint) {
        InterfaceC0941l interfaceC0941l = this.f6569y;
        interfaceC0941l.mo832b();
        interfaceC0941l.mo857a(f3 + 90.0f, f, f2);
        mo165b(c0934e, f - c0934e.f6406t, f2 - c0934e.f6407u, paint);
        interfaceC0941l.mo859a();
    }

    /* renamed from: a */
    public void mo201a(C0934e c0934e, Rect rect, float f, float f2, float f3, Paint paint) {
        InterfaceC0941l interfaceC0941l = this.f6569y;
        interfaceC0941l.mo832b();
        int m5465b = rect.m5465b() >> 1;
        int m5461c = rect.m5461c() >> 1;
        this.f6588p.m5454a(f - m5465b, f2 - m5461c, f + m5465b, f2 + m5461c);
        interfaceC0941l.mo857a(f3 + 90.0f, f, f2);
        mo197a(c0934e, rect, this.f6588p, paint);
        interfaceC0941l.mo859a();
    }

    /* renamed from: a */
    public void mo198a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        if (m818c(c0934e) != null) {
            this.f6569y.mo843a(c0934e, rect, rect2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    /* renamed from: c */
    public Bitmap m818c(C0934e c0934e) {
        Bitmap mo395b = c0934e.mo395b();
        if (c0934e.f6394f != c0934e.f6393e) {
            c0934e.f6394f = c0934e.f6393e;
            mo153d().mo851a(mo395b);
        }
        return mo395b;
    }

    /* renamed from: b */
    public void mo164b(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        if (!this.f6584g) {
            mo198a(c0934e, rect, rect2, paint);
            return;
        }
        Bitmap m818c = m818c(c0934e);
        boolean m885f = c0934e.m885f();
        if (paint.m5487f() < 255) {
            m885f = true;
        }
        int m5570b = this.f6573i.m5570b();
        int m5567c = this.f6573i.m5567c();
        int m5570b2 = m818c.m5570b();
        m818c.m5567c();
        c0934e.mo59i();
        int[] iArr = c0934e.f6398j;
        if (f6567d != this.f6573i) {
            mo177a(false);
        }
        int[] iArr2 = f6566c;
        int i = rect2.f231b;
        int i2 = rect2.f233d;
        int i3 = rect2.f230a;
        int i4 = rect2.f232c;
        int i5 = rect.f231b;
        int i6 = rect.f233d;
        int i7 = rect.f230a;
        float f = 1.0f;
        float f2 = 1.0f;
        int i8 = rect.f232c - i7;
        int i9 = i6 - i5;
        int i10 = i4 - i3;
        int i11 = i2 - i;
        if (i11 != 0) {
            f = i9 / i11;
        }
        if (i10 != 0) {
            f2 = i8 / i10;
        }
        if (i < 0) {
            i5 = (int) (i5 + ((-i) * f));
            i = 0;
        }
        if (i2 > m5567c - 1) {
            i2 = m5567c - 1;
        }
        if (i > i2) {
            return;
        }
        if (i3 < 0) {
            i7 = (int) (i7 + ((-i3) * f2));
            i3 = 0;
        }
        if (i4 > m5570b - 1) {
            i4 = m5570b - 1;
        }
        if (i3 > i4) {
            return;
        }
        int i12 = i * m5570b;
        int i13 = i5 * m5570b2;
        int i14 = i2 * m5570b;
        float f3 = 0.0f;
        int i15 = i3;
        int i16 = i7;
        int i17 = i4;
        if (!m885f) {
            while (i12 < i14) {
                int i18 = i12 + i15;
                int i19 = i13 + (((int) f3) * m5570b2) + i16;
                float f4 = 0.0f;
                int i20 = i12 + i17;
                int i21 = i20 - 4;
                while (i18 < i21) {
                    iArr2[i18] = iArr[i19 + ((int) f4)];
                    float f5 = f4 + f2;
                    int i22 = i18 + 1;
                    iArr2[i22] = iArr[i19 + ((int) f5)];
                    float f6 = f5 + f2;
                    int i23 = i22 + 1;
                    iArr2[i23] = iArr[i19 + ((int) f6)];
                    float f7 = f6 + f2;
                    int i24 = i23 + 1;
                    iArr2[i24] = iArr[i19 + ((int) f7)];
                    f4 = f7 + f2;
                    i18 = i24 + 1;
                }
                while (i18 < i20) {
                    iArr2[i18] = iArr[i19 + ((int) f4)];
                    i18++;
                    f4 += f2;
                }
                i12 += m5570b;
                f3 += f;
            }
            return;
        }
        int m5489e = paint.m5489e() >>> 24;
        while (i12 < i14) {
            int i25 = i12 + i15;
            int i26 = i13 + (((int) f3) * m5570b2) + i16;
            float f8 = 0.0f;
            int i27 = i12 + i17;
            int i28 = -1;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i25 < i27) {
                int i32 = i26 + ((int) f8);
                if (i32 != i28) {
                    int i33 = iArr[i32];
                    i29 = ((i33 >>> 24) * m5489e) >> 8;
                    i30 = i33 & 16711935;
                    i31 = i33 & 65280;
                    if (i29 == 0) {
                        i25++;
                        f8 += f2;
                    } else {
                        i28 = i32;
                    }
                }
                int i34 = iArr2[i25];
                int i35 = i34 & 16711935;
                int i36 = i34 & 65280;
                iArr2[i25] = (-16777216) | ((i35 + (((i30 - i35) * i29) >> 8)) & 16711935) | ((i36 + (((i31 - i36) * i29) >> 8)) & 65280);
                i25++;
                f8 += f2;
            }
            i12 += m5570b;
            f3 += f;
        }
    }

    /* renamed from: a */
    public void mo211a(Rect rect, Paint paint) {
        if (!this.f6584g) {
            mo167b(rect, paint);
            return;
        }
        if (f6567d != this.f6573i) {
            mo177a(false);
        }
        int m5570b = this.f6573i.m5570b();
        int m5567c = this.f6573i.m5567c();
        int[] iArr = f6566c;
        int i = rect.f231b;
        int i2 = rect.f233d;
        int i3 = rect.f230a;
        int i4 = rect.f232c;
        if (i < 0) {
            i = 0;
        }
        if (i2 > m5567c - 1) {
            i2 = m5567c - 1;
        }
        if (i > i2) {
            return;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 > m5570b - 1) {
            i4 = m5570b - 1;
        }
        if (i3 > i4) {
            return;
        }
        int i5 = i * m5570b;
        int i6 = i2 * m5570b;
        int i7 = i3;
        int i8 = i4;
        int m5489e = paint.m5489e();
        int i9 = m5489e >>> 24;
        if (!(i9 < 255)) {
            while (i5 < i6) {
                int i10 = i5 + i8;
                for (int i11 = i5 + i7; i11 < i10; i11++) {
                    iArr[i11] = m5489e;
                }
                i5 += m5570b;
            }
            return;
        }
        int i12 = (m5489e >> 16) & 255;
        int i13 = (m5489e >> 8) & 255;
        int i14 = m5489e & 255;
        float f = i9 * 0.003921569f;
        int i15 = (int) (i12 * f);
        int i16 = (int) (i13 * f);
        int i17 = (int) (i14 * f);
        int i18 = 255 - i9;
        int i19 = (-16777216) | (i15 << 16) | (i16 << 8) | i17;
        while (i5 < i6) {
            int i20 = i5 + i8;
            for (int i21 = i5 + i7; i21 < i20; i21++) {
                int i22 = iArr[i21];
                iArr[i21] = (((((i22 & 16711935) * i18) >> 8) & 16711935) | ((((i22 & 65280) * i18) >> 8) & 65280)) + i19;
            }
            i5 += m5570b;
        }
    }

    /* renamed from: a */
    public void mo177a(boolean z) {
        this.f6584g = true;
        if (f6567d == this.f6573i) {
            return;
        }
        int m5570b = this.f6573i.m5570b();
        int m5567c = this.f6573i.m5567c();
        int i = m5570b * m5567c;
        if (f6566c == null || f6566c.length < i) {
            f6566c = new int[i];
        }
        if (!z) {
            this.f6573i.m5571a(f6566c, 0, m5570b, 0, 0, m5570b, m5567c);
        }
        f6567d = this.f6573i;
    }

    /* renamed from: f */
    public void mo147f() {
        this.f6584g = false;
        if (f6567d == this.f6573i) {
            int m5570b = this.f6573i.m5570b();
            this.f6573i.m5568b(f6566c, 0, m5570b, 0, 0, m5570b, this.f6573i.m5567c());
            f6567d = null;
        }
    }

    /* renamed from: a */
    public void mo197a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        if (m818c(c0934e) != null) {
            m823a(paint, c0934e);
            this.f6569y.mo842a(c0934e, rect, rectF, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    /* renamed from: a */
    public void mo203a(C0934e c0934e, float f, float f2, Paint paint) {
        mo165b(c0934e, f - c0934e.f6406t, f2 - c0934e.f6407u, paint);
    }

    /* renamed from: a */
    public void mo202a(C0934e c0934e, float f, float f2, Paint paint, float f3, float f4) {
        InterfaceC0941l interfaceC0941l = this.f6569y;
        interfaceC0941l.mo832b();
        if (f3 != 0.0f) {
            interfaceC0941l.mo857a(f3 + 90.0f, f, f2);
        }
        interfaceC0941l.mo856a(f4, f4, f, f2);
        m818c(c0934e);
        interfaceC0941l.mo844a(c0934e, f, f2, paint);
        interfaceC0941l.mo859a();
    }

    /* renamed from: b */
    public void mo165b(C0934e c0934e, float f, float f2, Paint paint) {
        if (m818c(c0934e) != null) {
            this.f6569y.mo844a(c0934e, f, f2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    /* renamed from: a */
    public void mo200a(C0934e c0934e, Rect rect, Paint paint) {
        mo199a(c0934e, rect, paint, 0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo199a(C0934e c0934e, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        C0924aa.m932a(this, c0934e, rect, paint, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo196a(C0934e c0934e, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        C0924aa.m931a(this, c0934e, rectF, paint, f, f2, i, i2);
    }

    /* renamed from: b */
    public void mo171b(int i) {
        m817t();
        this.f6569y.mo853a(i);
    }

    /* renamed from: a */
    public void mo221a(int i, PorterDuff.Mode mode) {
        m817t();
        this.f6569y.mo852a(i, mode);
    }

    /* renamed from: a */
    public void mo185a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
        float m5511a = paint.m5511a(str);
        f6582u.m5454a(f, f2, f + m5511a, f2 + mo184a(str, paint));
        f6581t.m5452a(f6582u);
        if (paint.m5482j() == Paint.Align.f196b) {
            f6581t.m5455a(-(m5511a / 2.0f), 0.0f);
        }
        C0758f.m2143a(f6581t, f3);
        m820b(paint2);
        this.f6569y.mo847a(f6581t, paint2);
        mo186a(str, f6582u.f234a + (f3 / 2.0f), f6582u.f237d - (f3 / 2.0f), paint);
    }

    /* renamed from: a */
    public void mo186a(String str, float f, float f2, Paint paint) {
        m822a(paint, str);
        this.f6569y.mo836a(str, f, f2, paint);
    }

    /* renamed from: b */
    public void mo167b(Rect rect, Paint paint) {
        m820b(paint);
        this.f6569y.mo849a(rect, paint);
    }

    /* renamed from: a */
    public void mo209a(RectF rectF, Paint paint) {
        m820b(paint);
        this.f6569y.mo847a(rectF, paint);
    }

    /* renamed from: g */
    public void mo145g() {
        if (this.f6591v.size() > 0) {
            synchronized (this.f6591v) {
                Iterator it = this.f6591v.iterator();
                while (it.hasNext()) {
                    this.f6569y.mo846a((C0928ae) it.next());
                }
                this.f6591v.clear();
            }
        }
    }

    /* renamed from: h */
    public void mo144h() {
        m817t();
    }

    /* renamed from: c */
    public void mo157c(Rect rect, Paint paint) {
        this.f6586n.m5467a(rect.f230a, rect.f231b, rect.f230a + rect.f232c, rect.f231b + rect.f233d);
        m820b(paint);
        mo153d().mo849a(this.f6586n, paint);
    }

    /* renamed from: a */
    public void mo212a(Rect rect) {
        if (this.f6573i != null) {
            rect = new Rect(rect);
            int m5567c = this.f6573i.m5567c() - this.f6576l;
        }
        mo153d().mo850a(rect);
    }

    /* renamed from: a */
    public void mo210a(RectF rectF) {
        if (this.f6573i != null) {
            rectF = new RectF(rectF);
            int m5567c = this.f6573i.m5567c() - this.f6576l;
        }
        mo153d().mo848a(rectF);
    }

    /* renamed from: a */
    public void mo227a(float f, float f2, float f3, Paint paint) {
        if (f3 < 50.0f) {
            C0924aa.m933a(this, f, f2, f3, paint, 1.0f);
            return;
        }
        m820b(paint);
        this.f6569y.mo854a(f, f2, f3, paint);
    }

    /* renamed from: b */
    public void mo172b(float f, float f2, float f3, Paint paint) {
        m820b(paint);
        this.f6569y.mo854a(f, f2, f3, paint);
    }

    /* renamed from: a */
    public void mo175a(float[] fArr, int i, int i2, Paint paint) {
        m820b(paint);
        mo153d().mo833a(fArr, i, i2, paint);
    }

    /* renamed from: i */
    public void mo143i() {
        m817t();
        this.f6569y.mo832b();
    }

    /* renamed from: j */
    public void mo142j() {
        m817t();
        this.f6569y.mo859a();
    }

    /* renamed from: k */
    public void mo141k() {
        m817t();
        this.f6569y.mo832b();
    }

    /* renamed from: l */
    public void mo140l() {
        m817t();
        this.f6569y.mo859a();
    }

    /* renamed from: a */
    public void mo231a(float f, float f2, float f3) {
        this.f6569y.mo857a(f, f2, f3);
    }

    /* renamed from: a */
    public void mo232a(float f, float f2) {
        this.f6569y.mo858a(f, f2);
    }

    /* renamed from: a */
    public void mo230a(float f, float f2, float f3, float f4) {
        this.f6569y.mo856a(f, f2, f3, f4);
    }

    /* renamed from: b */
    public void mo173b(float f, float f2) {
        this.f6569y.mo831b(f, f2);
    }

    /* renamed from: a */
    public void mo229a(float f, float f2, float f3, float f4, Paint paint) {
        m820b(paint);
        mo153d().mo855a(f, f2, f3, f4, paint);
    }

    /* renamed from: a */
    public void mo193a(AbstractC0942m abstractC0942m) {
        mo153d().mo841a(abstractC0942m);
    }

    /* renamed from: m */
    public int mo139m() {
        if (this.f6573i != null) {
            return this.f6575k;
        }
        return (int) LoggerMaybe.m1079A().f6134ck;
    }

    /* renamed from: n */
    public int mo138n() {
        if (this.f6573i != null) {
            return this.f6576l;
        }
        return (int) LoggerMaybe.m1079A().f6135cl;
    }

    /* renamed from: a */
    public void mo224a(int i, int i2) {
        this.f6575k = i;
        this.f6576l = i2;
    }

    /* renamed from: o */
    public void mo137o() {
        m820b((Paint) null);
        mo221a(0, PorterDuff.Mode.CLEAR);
    }

    /* renamed from: a */
    public void mo217a(Paint paint) {
    }

    /* renamed from: a */
    public void mo207a(C0928ae c0928ae) {
        if (c0928ae != null) {
            synchronized (this.f6591v) {
                this.f6591v.add(c0928ae);
            }
        }
    }

    /* renamed from: p */
    public void mo136p() {
        m817t();
        if (this.f6573i != null && (this.f6569y instanceof C0939j)) {
            mo153d().mo851a(this.f6573i);
        }
    }

    /* renamed from: q */
    public void mo135q() {
    }

    /* renamed from: a */
    public int mo184a(String str, Paint paint) {
        return (int) paint.m5481k();
    }

    /* renamed from: b */
    public int mo163b(String str, Paint paint) {
        paint.m5509a(str, 0, str.length(), f6583w);
        return f6583w.f230a + f6583w.m5465b();
    }

    /* renamed from: r */
    public C0934e mo134r() {
        return this.f6578s;
    }

    /* renamed from: a */
    public void mo195a(C0934e c0934e, File file) {
        throw new RuntimeException("writeImageToFile not yet supported");
    }

    /* renamed from: a */
    public void mo183a(Lock lock) {
        m817t();
        this.f6569y.mo835a(lock);
    }

    /* renamed from: b */
    public void mo162b(Lock lock) {
        m817t();
        this.f6569y.mo830b(lock);
    }

    /* renamed from: s */
    public float mo133s() {
        return 1.0f;
    }
}
