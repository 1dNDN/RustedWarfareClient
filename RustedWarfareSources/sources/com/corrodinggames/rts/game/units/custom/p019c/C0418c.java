package com.corrodinggames.rts.game.units.custom.p019c;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0878m;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/c.class */
public class C0418c {

    /* renamed from: d */
    C1101m f2672d = new C1101m();

    /* renamed from: f */
    public static C0421f f2673f;

    /* renamed from: a */
    static final Rect f2674a = new Rect();

    /* renamed from: b */
    static final RectF f2675b = new RectF();

    /* renamed from: c */
    static final Paint f2676c = new Paint();

    /* renamed from: e */
    static Paint f2677e = new Paint();

    static {
        f2677e.m5933a(255, 0, 0, 200);
        f2673f = new C0421f();
    }

    /* renamed from: a */
    public void m4131a(C0453l c0453l) {
        Object[] m534a = this.f2672d.m534a();
        for (int i = this.f2672d.f6894a - 1; i >= 0; i--) {
            C0420e c0420e = (C0420e) m534a[i];
            C0416a m3725a = c0453l.m3725a(c0420e.f2682a.f2671g);
            if (m3725a != null) {
                c0420e.f2682a = m3725a;
                while (c0420e.f2683b.size() > c0420e.f2682a.f2668d) {
                    c0420e.f2683b.remove(c0420e.f2683b.size() - 1);
                }
            } else {
                this.f2672d.remove(i);
            }
        }
    }

    /* renamed from: a */
    public C0420e m4132a(C0416a c0416a, boolean z) {
        int i = this.f2672d.f6894a;
        Object[] m534a = this.f2672d.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0420e c0420e = (C0420e) m534a[i2];
            if (c0420e.f2682a == c0416a) {
                return c0420e;
            }
        }
        if (z) {
            C0420e c0420e2 = new C0420e(c0416a);
            this.f2672d.add(c0420e2);
            return c0420e2;
        }
        return null;
    }

    /* renamed from: a */
    public int m4133a(C0416a c0416a) {
        C0420e m4132a = m4132a(c0416a, false);
        if (m4132a == null) {
            return 0;
        }
        return m4132a.f2683b.f6894a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [android.graphics.Paint] */
    /* renamed from: a */
    public void m4135a(float f, AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        int i = this.f2672d.f6894a;
        if (i == 0) {
            return;
        }
        Object[] m534a = this.f2672d.m534a();
        for (int i2 = 0; i2 < i; i2++) {
            C0420e c0420e = (C0420e) m534a[i2];
            C0416a c0416a = c0420e.f2682a;
            int i3 = c0420e.f2683b.f6894a;
            Object[] m534a2 = c0420e.f2683b.m534a();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                C0419d c0419d = (C0419d) m534a2[i4];
                if (c0419d.f2680c) {
                    AbstractC0244am abstractC0244am2 = c0419d.f2678a;
                    if (c0416a.f2669e != null) {
                        C0934e c0934e = c0416a.f2669e;
                        float f2 = abstractC0244am.f6958el - Core.m1087A().f6144cv;
                        float f3 = ((abstractC0244am.f6959em - Core.m1087A().f6145cw) - abstractC0244am.f6960en) - 10.0f;
                        float f4 = c0934e.f6407u;
                        float m2123d = C0758f.m2123d(abstractC0244am.f6958el, abstractC0244am.f6959em - abstractC0244am.f6960en, abstractC0244am2.f6958el, abstractC0244am2.f6959em - abstractC0244am2.f6960en);
                        float m2209a = C0758f.m2209a(abstractC0244am.f6958el, abstractC0244am.f6959em - abstractC0244am.f6960en, abstractC0244am2.f6958el, abstractC0244am2.f6959em - abstractC0244am2.f6960en);
                        if (m2209a < (c0934e.f6403q - 2) * (c0934e.f6403q - 2)) {
                            f4 = C0758f.m2204a((int) m2209a);
                        }
                        m1087A.f6113bO.mo135k();
                        m1087A.f6113bO.mo227a(m2123d + 90.0f, f2, f3);
                        f2674a.m5874a(0, (int) (c0934e.f6403q - f4), c0934e.f6402p, c0934e.f6403q);
                        f2675b.m5861a(f2 - c0934e.f6404r, f3 - f4, f2 + c0934e.f6404r, f3);
                        C0930ag c0930ag = C0930ag.f6372r;
                        if (c0419d.f2681d != 0.0f) {
                            c0930ag = f2676c;
                            int abs = (int) Math.abs(c0419d.f2681d * 5.0f);
                            if (abs > 250) {
                                abs = 250;
                            }
                            c0930ag.m5933a(255, 255, 255 - abs, 255 - abs);
                        }
                        m1087A.f6113bO.mo192a(c0934e, f2674a, f2675b, c0930ag);
                        m1087A.f6113bO.mo134l();
                    }
                    if (c0416a.f2670f != null) {
                        m1087A.f6113bO.mo225a(abstractC0244am.f6958el - m1087A.f6144cv, (abstractC0244am.f6959em - m1087A.f6145cw) - abstractC0244am.f6960en, abstractC0244am2.f6958el - m1087A.f6144cv, (abstractC0244am2.f6959em - m1087A.f6145cw) - abstractC0244am2.f6960en, c0416a.f2670f);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m4130a(StreamWriter streamWriter) {
        if (this.f2672d.f6894a == 0) {
            streamWriter.m1401c(-1);
            return;
        }
        streamWriter.m1401c(0);
        short size = (short) this.f2672d.size();
        streamWriter.mo1330a(size);
        Object[] m534a = this.f2672d.m534a();
        for (int i = 0; i < size; i++) {
            C0420e c0420e = (C0420e) m534a[i];
            streamWriter.m1420a(c0420e.f2682a.f2671g);
            streamWriter.mo1330a((short) c0420e.f2683b.size());
            Iterator it = c0420e.f2683b.iterator();
            while (it.hasNext()) {
                C0419d c0419d = (C0419d) it.next();
                streamWriter.mo1333a(c0419d.f2678a);
                streamWriter.mo1329a(c0419d.f2679b);
                streamWriter.mo1329a(c0419d.f2680c);
            }
        }
    }

    /* renamed from: a */
    public void m4134a(AbstractC0244am abstractC0244am, Reader reader) {
        if (reader.m1304d() == -1) {
            return;
        }
        int m1285v = reader.m1285v();
        this.f2672d.clear();
        for (int i = 0; i < m1285v; i++) {
            C0448g m1294m = reader.m1294m();
            C0416a c0416a = null;
            if (abstractC0244am instanceof C0451j) {
                c0416a = ((C0451j) abstractC0244am).f2863x.m3725a(m1294m);
            }
            C0420e c0420e = null;
            if (c0416a != null) {
                c0420e = new C0420e(c0416a);
                this.f2672d.add(c0420e);
            }
            int m1285v2 = reader.m1285v();
            for (int i2 = 0; i2 < m1285v2; i2++) {
                C0419d c0419d = new C0419d();
                c0419d.f2678a = reader.m1317a(EnumC0878m.f5870a);
                c0419d.f2679b = reader.ReadBool();
                c0419d.f2680c = reader.ReadBool();
                if (c0419d.f2678a != null && c0420e != null) {
                    c0420e.f2683b.add(c0419d);
                }
            }
        }
    }
}
