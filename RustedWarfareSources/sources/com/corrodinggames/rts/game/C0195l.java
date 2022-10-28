package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
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
    static final Paint f1295j = C1117y.m458b();

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
    public static void m5125b() {
        Core m1087A = Core.m1087A();
        f1296k = m1087A.f6113bO.mo215a(C0067R.drawable.scorch_mark, true);
        f1296k.f6400m = true;
        f1297l = m1087A.f6113bO.mo215a(C0067R.drawable.scorch_mark_nuke, true);
        f1297l.f6400m = true;
        f1298m = m1087A.f6113bO.mo215a(C0067R.drawable.blood_mark, true);
        f1298m.f6400m = true;
    }

    public C0195l() {
        Core m1087A = Core.m1087A();
        m447S(-1);
        this.f1292f = m1087A.f6102by;
    }

    /* renamed from: a */
    public static void m5131a(float f, float f2) {
        m5130a(f, f2, EnumC0196m.f1303a);
    }

    /* renamed from: a */
    public static void m5130a(float f, float f2, EnumC0196m enumC0196m) {
        if (!m5124b(f, f2, enumC0196m)) {
            return;
        }
        C0195l c0195l = new C0195l();
        c0195l.f6958el = f;
        c0195l.f6959em = f2;
        if (enumC0196m == EnumC0196m.f1303a) {
            c0195l.f1289a = 0;
            c0195l.f1290b = C0758f.m2188a(c0195l, 0, 3, 0);
        } else {
            c0195l.f1289a = 2;
        }
        if (c0195l.f1289a == 2) {
            c0195l.f1300c = f1297l.mo386m();
            c0195l.f1301d = f1297l.mo387l();
        }
        c0195l.f1291e = enumC0196m;
        c0195l.m5122d();
    }

    /* renamed from: a */
    public static void m5129a(AbstractC0623y abstractC0623y, int i) {
        if (!abstractC0623y.m4725cI()) {
            EnumC0196m enumC0196m = i == 2 ? EnumC0196m.f1304b : EnumC0196m.f1303a;
            if (!m5124b(abstractC0623y.f6958el, abstractC0623y.f6959em, enumC0196m)) {
                return;
            }
            C0195l c0195l = new C0195l();
            c0195l.f1289a = i;
            if (c0195l.f1289a == 2) {
                c0195l.f1300c = f1297l.mo386m();
                c0195l.f1301d = f1297l.mo387l();
            }
            c0195l.f6958el = abstractC0623y.f6958el;
            c0195l.f6959em = abstractC0623y.f6959em;
            c0195l.f1291e = enumC0196m;
            c0195l.f1290b = C0758f.m2188a(c0195l, 0, 3, 0);
            c0195l.m5122d();
        }
    }

    /* renamed from: b */
    public static boolean m5124b(float f, float f2, EnumC0196m enumC0196m) {
        int i = 0;
        int i2 = 0;
        int i3 = 25;
        if (enumC0196m == EnumC0196m.f1304b) {
            i3 = 45;
        }
        AbstractC1120w[] m514a = AbstractC1120w.f6962eo.m514a();
        int size = AbstractC1120w.f6962eo.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1120w abstractC1120w = m514a[i4];
            if (abstractC1120w instanceof C0195l) {
                C0195l c0195l = (C0195l) abstractC1120w;
                if (C0758f.m2137c(c0195l.f6958el - f) < i3 && C0758f.m2137c(c0195l.f6959em - f2) < i3 && c0195l.f1291e == enumC0196m) {
                    i++;
                    if (C0758f.m2137c(c0195l.f6958el - f) < 5 && C0758f.m2137c(c0195l.f6959em - f2) < 5) {
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
    public boolean m5126a(Core core) {
        return false;
    }

    /* renamed from: f */
    public boolean m5120f(float f) {
        return false;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        return true;
    }

    /* renamed from: c */
    public RectF m5123c() {
        f1299n.f234a = this.f6958el - (this.f1300c * 0.5f);
        f1299n.f236c = this.f6958el + (this.f1300c * 0.5f);
        f1299n.f235b = this.f6959em - (this.f1301d * 0.5f);
        f1299n.f237d = this.f6959em + (this.f1301d * 0.5f);
        return f1299n;
    }

    /* renamed from: a */
    public void m5127a(InterfaceC1027y interfaceC1027y, int i, int i2, float f) {
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
        int i7 = ((int) this.f6958el) - i;
        int i8 = i5 >> 1;
        int i9 = i6 >> 1;
        float f2 = i7 - i8;
        rect.f230a = (int) (f2 * f);
        rect.f231b = (int) (((((int) this.f6959em) - i2) - i9) * f);
        rect.f232c = (int) ((i7 + i8) * f);
        rect.f233d = (int) ((i3 + i9) * f);
        interfaceC1027y.mo158b(c0934e, rect2, rect, f1295j);
    }

    /* renamed from: d */
    private void m5122d() {
        Core.m1087A().f6110bL.m5330a(this);
    }

    /* renamed from: e */
    public void mo3151e(float f) {
    }

    /* renamed from: a */
    public void mo3053a(float f, boolean z) {
    }

    /* renamed from: d */
    public void m5121d(float f) {
    }

    /* renamed from: a */
    public void mo1762a(float f) {
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1335a(this.f6958el);
        streamWriter.mo1335a(this.f6959em);
        streamWriter.WriteInteger(this.f1289a);
        streamWriter.WriteInteger(this.f1290b);
        streamWriter.WriteInteger(this.f1300c);
        streamWriter.WriteInteger(this.f1301d);
        streamWriter.m1411a(this.f1291e);
        streamWriter.WriteInteger(this.f1292f);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m5128a(Reader reader) {
        this.f6958el = reader.m1300g();
        this.f6959em = reader.m1300g();
        this.f1289a = reader.ReadInt();
        this.f1290b = reader.ReadInt();
        this.f1300c = reader.ReadInt();
        this.f1301d = reader.ReadInt();
        if (reader.m1310b() >= 87) {
            this.f1291e = (EnumC0196m) reader.m1308b(EnumC0196m.class);
            this.f1292f = reader.ReadInt();
        } else {
            this.f1291e = this.f1289a == 2 ? EnumC0196m.f1304b : EnumC0196m.f1303a;
            if (this.f1289a == 2) {
                this.f1300c = f1297l.mo386m();
                this.f1301d = f1297l.mo387l();
            }
        }
        super.m440a(reader);
    }
}
