package com.corrodinggames.rts.game.p012b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;

/* renamed from: com.corrodinggames.rts.game.b.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/h.class */
public class C0181h {

    /* renamed from: b */
    public C0934e f929b;

    /* renamed from: c */
    InterfaceC1027y f930c;

    /* renamed from: e */
    int f932e;

    /* renamed from: f */
    int f933f;

    /* renamed from: g */
    int f934g;

    /* renamed from: h */
    int f935h;

    /* renamed from: i */
    float f936i;

    /* renamed from: j */
    boolean f937j;

    /* renamed from: k */
    C0181h f938k;

    /* renamed from: l */
    static final Rect f939l = new Rect();

    /* renamed from: m */
    static final Rect f940m = new Rect();

    /* renamed from: n */
    static final Rect f941n = new Rect();

    /* renamed from: a */
    int f928a = 0;

    /* renamed from: d */
    Paint f931d = new Paint();

    /* renamed from: o */
    Rect f942o = new Rect();

    /* renamed from: p */
    int f943p = -1;

    public C0181h(float f, boolean z) {
        this.f936i = 1.0f;
        this.f936i = f;
        this.f937j = z;
        this.f932e = (int) (20.0f * f);
        this.f933f = (int) (20.0f * f);
        this.f934g = this.f932e + 2;
        this.f935h = this.f933f + 2;
        if (!z) {
            this.f938k = new C0181h(f, true);
        }
    }

    /* renamed from: a */
    public void m4429a() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        this.f929b = m1071A.f6161bO.mo165b(20 * this.f934g, 20 * this.f935h, this.f937j);
        this.f930c = m1071A.f6161bO.mo160b(this.f929b);
        if (this.f937j) {
            this.f929b.f6401m = true;
        }
        if (this.f938k != null) {
            this.f938k.m4429a();
        }
    }

    /* renamed from: b */
    public void m4420b() {
        this.f928a = 0;
        this.f930c.mo166b(-16777216);
        this.f930c.mo131o();
        this.f929b.mo46r();
        if (this.f938k != null) {
            this.f938k.m4420b();
        }
    }

    /* renamed from: a */
    public int m4423a(C0183j c0183j, int i) {
        int m4423a;
        c0183j.m4413a(i, f939l);
        if (this.f928a >= 400) {
            return -1;
        }
        boolean z = true;
        if (!this.f937j) {
            z = !m4422a(c0183j.f951b, f939l);
        }
        if (z) {
            int i2 = this.f928a;
            this.f928a++;
            m4426a(i2, c0183j.f951b, f939l);
            return i2;
        } else if (this.f938k != null && (m4423a = this.f938k.m4423a(c0183j, i)) != -1) {
            return m4423a + 500;
        } else {
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m4422a(C0934e c0934e, Rect rect) {
        int i = rect.f230a;
        int i2 = rect.f232c;
        int i3 = rect.f231b;
        int i4 = rect.f233d;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i > c0934e.mo386m()) {
            i = c0934e.mo386m();
        }
        if (i2 > c0934e.mo386m()) {
            i2 = c0934e.mo386m();
        }
        if (i3 > c0934e.mo387l()) {
            i3 = c0934e.mo387l();
        }
        if (i4 > c0934e.mo387l()) {
            i4 = c0934e.mo387l();
        }
        if (!c0934e.mo51k()) {
            AbstractC0916l.m963e("hasImageAlpha: Cannot get pixel data for: " + c0934e.mo64a());
            return true;
        }
        c0934e.mo43x();
        for (int i5 = i3; i5 < i4; i5++) {
            for (int i6 = i; i6 < i2; i6++) {
                if (Color.m5108a(c0934e.mo63a(i6, i5)) != 255) {
                    return true;
                }
            }
        }
        c0934e.mo42y();
        return false;
    }

    /* renamed from: c */
    public void m4418c() {
        this.f930c.mo130p();
        if (this.f938k != null) {
            this.f938k.m4418c();
        }
    }

    /* renamed from: a */
    public void m4426a(int i, C0934e c0934e, Rect rect) {
        Rect rect2 = new Rect();
        m4427a(i, rect2);
        boolean z = false;
        if (this.f936i < 1.0f) {
            z = true;
        }
        this.f931d.mo893a(z);
        this.f931d.m5058d(z);
        this.f931d.m5066b(z);
        m4421a(this.f930c, c0934e, rect, rect2, this.f931d);
    }

    /* renamed from: a */
    public static void m4421a(InterfaceC1027y interfaceC1027y, C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        for (int i = 0; i <= 3; i++) {
            m4425a(rect, f940m, i, 0);
            m4425a(rect2, f941n, i, 1);
            interfaceC1027y.mo193a(c0934e, f940m, f941n, paint);
        }
        for (int i2 = 0; i2 <= 3; i2++) {
            m4424a(rect, f940m, i2, 1, -1);
            m4424a(rect2, f941n, i2, 1, 0);
            interfaceC1027y.mo193a(c0934e, f940m, f941n, paint);
        }
        interfaceC1027y.mo193a(c0934e, rect, rect2, paint);
    }

    /* renamed from: a */
    public static Rect m4424a(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 0) {
            rect2.f230a = rect.f230a - 0;
            rect2.f232c = rect.f232c + 0;
            rect2.f231b = (rect.f231b - i2) - i3;
            rect2.f233d = rect.f231b - i3;
        } else if (i == 1) {
            rect2.f230a = rect.f232c + i3;
            rect2.f232c = rect.f232c + i2 + i3;
            rect2.f231b = rect.f231b - 0;
            rect2.f233d = rect.f233d + 0;
        } else if (i == 2) {
            rect2.f230a = rect.f230a - 0;
            rect2.f232c = rect.f232c + 0;
            rect2.f231b = rect.f233d + i3;
            rect2.f233d = rect.f233d + i2 + i3;
        } else {
            rect2.f230a = rect.f230a - i3;
            rect2.f232c = (rect.f230a - i2) - i3;
            rect2.f231b = rect.f231b - 0;
            rect2.f233d = rect.f233d + 0;
        }
        return rect2;
    }

    /* renamed from: a */
    public static Rect m4425a(Rect rect, Rect rect2, int i, int i2) {
        if (i == 0) {
            rect2.f230a = (rect.f232c - 1) + i2;
            rect2.f231b = rect.f231b - i2;
        } else if (i == 1) {
            rect2.f230a = (rect.f232c - 1) + i2;
            rect2.f231b = (rect.f233d - 1) + i2;
        } else if (i == 2) {
            rect2.f230a = rect.f230a - i2;
            rect2.f231b = (rect.f233d - 1) + i2;
        } else {
            rect2.f230a = rect.f230a - i2;
            rect2.f231b = rect.f231b - i2;
        }
        rect2.f232c = rect2.f230a + 1;
        rect2.f233d = rect2.f231b + 1;
        return rect2;
    }

    /* renamed from: a */
    public final C0934e m4428a(int i) {
        if (i >= 500) {
            return this.f938k.m4428a(i - 500);
        }
        return this.f929b;
    }

    /* renamed from: b */
    public final Rect m4419b(int i) {
        if (i >= 500) {
            return this.f938k.m4419b(i - 500);
        }
        if (this.f943p == i) {
            return this.f942o;
        }
        this.f943p = i;
        m4427a(i, this.f942o);
        return this.f942o;
    }

    /* renamed from: a */
    public void m4427a(int i, Rect rect) {
        int i2 = ((i % 20) * this.f934g) + 1;
        int i3 = (((int) (i * 0.05f)) * this.f935h) + 1;
        rect.f230a = i2;
        rect.f231b = i3;
        rect.f232c = i2 + this.f932e;
        rect.f233d = i3 + this.f933f;
    }
}
