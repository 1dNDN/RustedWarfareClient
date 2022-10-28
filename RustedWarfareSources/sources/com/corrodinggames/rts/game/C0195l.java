package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* renamed from: com.corrodinggames.rts.game.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/l.class */
public class C0195l extends AbstractC1120w {

    /* renamed from: a */
    int f1289a;

    /* renamed from: b */
    int f1290b;

    /* renamed from: e */
    EnumC0196m f1291e;

    /* renamed from: f */
    int f1292f;

    /* renamed from: h */
    static final Rect f1293h = new Rect();

    /* renamed from: i */
    static final Rect f1294i = new Rect();

    /* renamed from: j */
    static final Paint f1295j = C1117y.m463b();

    /* renamed from: k */
    static C0934e f1296k = null;

    /* renamed from: l */
    static C0934e f1297l = null;

    /* renamed from: m */
    static C0934e f1298m = null;

    /* renamed from: n */
    static final RectF f1299n = new RectF();

    /* renamed from: c */
    int f1300c = 50;

    /* renamed from: d */
    int f1301d = 40;

    /* renamed from: g */
    int f1302g = -1;

    /* renamed from: b */
    public static void m4746b() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        f1296k = m1079A.f6113bO.mo219a(C0067R.drawable.scorch_mark, true);
        f1296k.f6400m = true;
        f1297l = m1079A.f6113bO.mo219a(C0067R.drawable.scorch_mark_nuke, true);
        f1297l.f6400m = true;
        f1298m = m1079A.f6113bO.mo219a(C0067R.drawable.blood_mark, true);
        f1298m.f6400m = true;
    }

    public C0195l() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m452S(-1);
        this.f1292f = m1079A.f6102by;
    }

    /* renamed from: a */
    public static void m4750a(float f, float f2) {
        m4749a(f, f2, EnumC0196m.f1303a);
    }

    /* renamed from: a */
    public static void m4749a(float f, float f2, EnumC0196m enumC0196m) {
        if (!m4745b(f, f2, enumC0196m)) {
            return;
        }
        C0195l c0195l = new C0195l();
        c0195l.f6957el = f;
        c0195l.f6958em = f2;
        if (enumC0196m == EnumC0196m.f1303a) {
            c0195l.f1289a = 0;
            c0195l.f1290b = C0758f.m2139a(c0195l, 0, 3, 0);
        } else {
            c0195l.f1289a = 2;
        }
        if (c0195l.f1289a == 2) {
            c0195l.f1300c = f1297l.mo390m();
            c0195l.f1301d = f1297l.mo391l();
        }
        c0195l.f1291e = enumC0196m;
        c0195l.m4743d();
    }

    /* renamed from: a */
    public static void m4748a(AbstractC0623y abstractC0623y, int i) {
        if (!abstractC0623y.m4460cI()) {
            EnumC0196m enumC0196m = i == 2 ? EnumC0196m.f1304b : EnumC0196m.f1303a;
            if (!m4745b(abstractC0623y.f6957el, abstractC0623y.f6958em, enumC0196m)) {
                return;
            }
            C0195l c0195l = new C0195l();
            c0195l.f1289a = i;
            if (c0195l.f1289a == 2) {
                c0195l.f1300c = f1297l.mo390m();
                c0195l.f1301d = f1297l.mo391l();
            }
            c0195l.f6957el = abstractC0623y.f6957el;
            c0195l.f6958em = abstractC0623y.f6958em;
            c0195l.f1291e = enumC0196m;
            c0195l.f1290b = C0758f.m2139a(c0195l, 0, 3, 0);
            c0195l.m4743d();
        }
    }

    /* renamed from: b */
    public static boolean m4745b(float f, float f2, EnumC0196m enumC0196m) {
        int i = 0;
        int i2 = 0;
        int i3 = 25;
        if (enumC0196m == EnumC0196m.f1304b) {
            i3 = 45;
        }
        AbstractC1120w[] m519a = AbstractC1120w.f6962eo.m519a();
        int size = AbstractC1120w.f6962eo.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1120w abstractC1120w = m519a[i4];
            if (abstractC1120w instanceof C0195l) {
                C0195l c0195l = (C0195l) abstractC1120w;
                if (C0758f.m2088c(c0195l.f6957el - f) < i3 && C0758f.m2088c(c0195l.f6958em - f2) < i3 && c0195l.f1291e == enumC0196m) {
                    i++;
                    if (C0758f.m2088c(c0195l.f6957el - f) < 5 && C0758f.m2088c(c0195l.f6958em - f2) < 5) {
                        i2++;
                    }
                }
            }
        }
        if (i >= 3 || i2 >= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo3183a(LoggerMaybe loggerMaybe) {
        return false;
    }

    /* renamed from: f */
    public boolean m4741f(float f) {
        return false;
    }

    /* renamed from: c */
    public boolean mo3001c(float f) {
        return true;
    }

    /* renamed from: c */
    public RectF m4744c() {
        f1299n.f234a = this.f6957el - (this.f1300c * 0.5f);
        f1299n.f236c = this.f6957el + (this.f1300c * 0.5f);
        f1299n.f235b = this.f6958em - (this.f1301d * 0.5f);
        f1299n.f237d = this.f6958em + (this.f1301d * 0.5f);
        return f1299n;
    }

    /* renamed from: a */
    public void m4747a(InterfaceC1027y interfaceC1027y, int i, int i2, float f) {
        int i3;
        int i4 = this.f1290b * this.f1300c;
        C0934e c0934e = null;
        int i5 = this.f1300c;
        int i6 = this.f1301d;
        if (this.f1289a == 0) {
            c0934e = f1296k;
        } else if (this.f1289a == 1) {
            c0934e = f1298m;
        } else if (this.f1289a == 2) {
            c0934e = f1297l;
        }
        Rect rect = f1293h;
        Rect rect2 = f1294i;
        rect2.f230a = i4;
        rect2.f231b = 0;
        rect2.f232c = i4 + i5;
        rect2.f233d = 0 + i6;
        int i7 = ((int) this.f6957el) - i;
        int i8 = i5 >> 1;
        int i9 = i6 >> 1;
        float f2 = i7 - i8;
        rect.f230a = (int) (f2 * f);
        rect.f231b = (int) (((((int) this.f6958em) - i2) - i9) * f);
        rect.f232c = (int) ((i7 + i8) * f);
        rect.f233d = (int) ((i3 + i9) * f);
        interfaceC1027y.mo164b(c0934e, rect2, rect, f1295j);
    }

    /* renamed from: d */
    private void m4743d() {
        LoggerMaybe.m1079A().f6110bL.m4947a(this);
    }

    /* renamed from: e */
    public void mo3073e(float f) {
    }

    /* renamed from: a */
    public void mo3005a(float f, boolean z) {
    }

    /* renamed from: d */
    public void m4742d(float f) {
    }

    /* renamed from: a */
    public void mo1720a(float f) {
    }

    /* renamed from: a */
    public void mo1922a(C0859ar c0859ar) {
        c0859ar.mo1322a(this.f6957el);
        c0859ar.mo1322a(this.f6958em);
        c0859ar.mo1321a(this.f1289a);
        c0859ar.mo1321a(this.f1290b);
        c0859ar.mo1321a(this.f1300c);
        c0859ar.mo1321a(this.f1301d);
        c0859ar.mo1365a(this.f1291e);
        c0859ar.mo1321a(this.f1292f);
        super.mo1922a(c0859ar);
    }

    /* renamed from: a */
    public void mo3069a(Reader reader) {
        this.f6957el = reader.m1287g();
        this.f6958em = reader.m1287g();
        this.f1289a = reader.ReadInt();
        this.f1290b = reader.ReadInt();
        this.f1300c = reader.ReadInt();
        this.f1301d = reader.ReadInt();
        if (reader.m1297b() >= 87) {
            this.f1291e = (EnumC0196m) reader.m1295b(EnumC0196m.class);
            this.f1292f = reader.ReadInt();
        } else {
            this.f1291e = this.f1289a == 2 ? EnumC0196m.f1304b : EnumC0196m.f1303a;
            if (this.f1289a == 2) {
                this.f1300c = f1297l.mo390m();
                this.f1301d = f1297l.mo391l();
            }
        }
        super.mo3069a(reader);
    }
}
