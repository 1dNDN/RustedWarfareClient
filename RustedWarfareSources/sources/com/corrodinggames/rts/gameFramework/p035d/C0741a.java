package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a.class */
public class C0741a {

    /* renamed from: a */
    float f4646a;

    /* renamed from: b */
    float f4647b;

    /* renamed from: c */
    public boolean f4648c;

    /* renamed from: d */
    public InterfaceC0303as f4649d;

    /* renamed from: e */
    public AbstractC0197n f4650e;

    /* renamed from: g */
    public float f4652g;

    /* renamed from: h */
    public float f4653h;

    /* renamed from: i */
    public boolean f4654i;

    /* renamed from: j */
    public AbstractC0197n f4655j;

    /* renamed from: k */
    public boolean f4656k;

    /* renamed from: l */
    public int f4657l;

    /* renamed from: m */
    public int f4658m;

    /* renamed from: n */
    public boolean f4659n;

    /* renamed from: o */
    public AbstractC0623y f4660o;

    /* renamed from: r */
    public int f4663r;

    /* renamed from: s */
    public float f4664s;

    /* renamed from: u */
    public boolean f4666u;

    /* renamed from: v */
    public AbstractC0244am f4667v;

    /* renamed from: D */
    static Paint f4675D;

    /* renamed from: w */
    public static C1104o f4668w = new C1104o();

    /* renamed from: x */
    static Point f4669x = new Point();

    /* renamed from: y */
    static RectF f4670y = new RectF();

    /* renamed from: z */
    static RectF f4671z = new RectF();

    /* renamed from: A */
    static RectF f4672A = new RectF();

    /* renamed from: E */
    static RectF f4676E = new RectF();

    /* renamed from: C */
    static Paint f4674C = new C0930ag();

    /* renamed from: f */
    public int f4651f = 1;

    /* renamed from: p */
    boolean f4661p = false;

    /* renamed from: q */
    public boolean f4662q = false;

    /* renamed from: t */
    public float f4665t = 0.04f;

    /* renamed from: B */
    Paint f4673B = new Paint();

    public C0741a() {
        f4668w.add(this);
        f4668w.m529a();
    }

    static {
        f4674C.m5523a(90, 0, 0, 255);
        f4674C.m5516a(Paint.Style.f220b);
        f4674C.m5526a(2.0f);
        f4675D = new C0930ag();
        f4675D.m5523a(40, 0, 0, 255);
        f4675D.m5516a(Paint.Style.f220b);
        f4675D.m5526a(2.0f);
    }

    /* renamed from: a */
    public static void m2359a() {
        f4668w.clear();
    }

    /* renamed from: a */
    public static void m2358a(float f) {
        Iterator it = f4668w.iterator();
        while (it.hasNext()) {
            ((C0741a) it.next()).m2350c(f);
        }
        f4668w.m529a();
    }

    /* renamed from: b */
    public static void m2351b(float f) {
        Object[] m524b = f4668w.m524b();
        int size = f4668w.size();
        for (int i = 0; i < size; i++) {
            ((C0741a) m524b[i]).m2349d(f);
        }
    }

    /* renamed from: a */
    public static boolean m2356a(AbstractC0197n abstractC0197n, int i, int i2, int i3) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6110bL.m4957a(i, i2);
        float f = m1079A.f6110bL.f801T + m1079A.f6110bL.f787p;
        float f2 = m1079A.f6110bL.f802U + m1079A.f6110bL.f788q;
        f4670y.m5454a(f, f2, f + 1.0f, f2 + 1.0f);
        return m2355a(abstractC0197n, f4670y, i3);
    }

    /* renamed from: a */
    public static boolean m2354a(AbstractC0197n abstractC0197n, AbstractC0623y abstractC0623y, int i) {
        f4670y = abstractC0623y.m4508a(LoggerMaybe.m1079A().f6110bL, f4670y);
        return m2355a(abstractC0197n, f4670y, i);
    }

    /* renamed from: a */
    public static boolean m2353a(AbstractC0623y abstractC0623y, AbstractC0623y abstractC0623y2) {
        C0173b c0173b = LoggerMaybe.m1079A().f6110bL;
        f4670y = abstractC0623y.m4508a(c0173b, f4670y);
        f4671z = abstractC0623y2.m4508a(c0173b, f4671z);
        if (C0758f.m2142a(f4670y, f4671z)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2355a(AbstractC0197n abstractC0197n, RectF rectF, int i) {
        C0173b c0173b = LoggerMaybe.m1079A().f6110bL;
        RectF rectF2 = f4672A;
        Iterator it = f4668w.iterator();
        while (it.hasNext()) {
            C0741a c0741a = (C0741a) it.next();
            if (c0741a.f4655j == abstractC0197n && c0741a.f4659n && (i == -1 || i == c0741a.f4663r)) {
                AbstractC0244am m4505a = AbstractC0244am.m4505a(c0741a.f4649d);
                if (m4505a == null) {
                    LoggerMaybe.LogDebug2("isTileRectOverBlueprint: Failed to get shared unit for: " + c0741a.f4649d);
                } else {
                    m4505a.f6957el = c0741a.f4652g;
                    m4505a.f6958em = c0741a.f4653h;
                    rectF2 = m4505a.m4508a(c0173b, rectF2);
                    if (C0758f.m2142a(rectF2, rectF)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C0741a m2357a(AbstractC0197n abstractC0197n, float f, float f2) {
        Iterator it = f4668w.iterator();
        while (it.hasNext()) {
            C0741a c0741a = (C0741a) it.next();
            if (c0741a.f4655j == abstractC0197n && c0741a.f4659n) {
                float m2160a = C0758f.m2160a(c0741a.f4652g, c0741a.f4653h, f, f2);
                float f3 = AbstractC0244am.m4505a(c0741a.f4649d).f1621ch + 1.0f;
                if (f3 < 20.0f) {
                    f3 = 20.0f;
                }
                if (m2160a < f3 * f3) {
                    return c0741a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m2352b() {
        if (this.f4659n) {
            if (this.f4660o == null || this.f4660o.f1607bT || !AbstractC0249ar.m4376a(this.f4649d, this.f4652g, this.f4653h, 0.0f, 0.0f, this.f4650e)) {
                return false;
            }
            return true;
        } else if (this.f4667v == null || this.f4667v.m4442ce()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public void m2350c(float f) {
        this.f4646a += 1.0f;
        this.f4647b += f;
        boolean z = false;
        this.f4664s = C0758f.m2162a(this.f4664s, this.f4665t * f);
        if (this.f4659n) {
            if (this.f4646a > 6.0f) {
                this.f4646a = 0.0f;
                boolean m2924a = this.f4660o.m2924a(this.f4649d, this.f4652g, this.f4653h);
                if (!this.f4661p && m2924a) {
                    this.f4661p = true;
                }
                if (!m2924a) {
                    if (this.f4661p) {
                        z = true;
                    } else if (this.f4647b > 180.0f) {
                        z = true;
                    }
                }
                if (!m2352b()) {
                    z = true;
                }
            }
        } else if (this.f4646a > 2.0f && !m2352b()) {
            z = true;
        }
        if (z) {
            this.f4648c = true;
            f4668w.m522b(this);
        }
    }

    /* renamed from: d */
    public void m2349d(float f) {
        AbstractC0244am m4471c;
        Rect m4444cc;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6099bs != this.f4655j || !m1079A.f6251cN.m5448b(this.f4652g, this.f4653h)) {
            return;
        }
        if (this.f4662q && !this.f4661p) {
            return;
        }
        float f2 = 0.0f;
        float f3 = this.f4652g;
        float f4 = this.f4653h;
        boolean z = false;
        boolean z2 = false;
        if (this.f4659n) {
            z2 = true;
        } else {
            z = true;
        }
        boolean z3 = true;
        if (this.f4654i) {
            z3 = false;
        }
        if (z2) {
            float f5 = this.f4664s;
            if (f5 <= 0.0f) {
                f2 = 0.0f;
            } else if (this.f4664s < 1.0f) {
                f2 = 1.0f - C0758f.m2043i(f5 * 90.0f);
            } else {
                f2 = 1.0f;
            }
        }
        if (z2 && this.f4664s < 1.0f && (m4471c = AbstractC0244am.m4471c(this.f4649d)) != null && m4471c.m4485bI() && (m4444cc = m4471c.m4444cc()) != null) {
            f4676E.m5453a(m4444cc);
            f4676E.f235b *= m1079A.f6110bL.f786o;
            f4676E.f237d *= m1079A.f6110bL.f786o;
            f4676E.f234a *= m1079A.f6110bL.f785n;
            f4676E.f236c *= m1079A.f6110bL.f785n;
            f4676E.m5455a(-(m4471c.mo3299cX() - m1079A.f6110bL.f787p), -(m4471c.mo3298cY() - m1079A.f6110bL.f788q));
            C0758f.m2143a(f4676E, (m1079A.f6110bL.f787p - 3) + (f2 * 5.0f));
            f4676E.m5455a(this.f4652g - m1079A.f6144cv, (this.f4653h - m1079A.f6145cw) - 0.0f);
            float f6 = 3.0f + (f2 * 7.0f);
            Paint paint = f4674C;
            if (this.f4664s <= 0.0f) {
                paint = f4675D;
            }
            m1079A.f6113bO.mo229a(f4676E.f234a - f6, f4676E.f235b, f4676E.f236c + f6, f4676E.f235b, paint);
            m1079A.f6113bO.mo229a(f4676E.f234a - f6, f4676E.f237d, f4676E.f236c + f6, f4676E.f237d, paint);
            m1079A.f6113bO.mo229a(f4676E.f234a, f4676E.f235b - f6, f4676E.f234a, f4676E.f237d + f6, paint);
            m1079A.f6113bO.mo229a(f4676E.f236c, f4676E.f235b - f6, f4676E.f236c, f4676E.f237d + f6, paint);
        }
        float f7 = 0.0f;
        if (z2) {
            f7 = 0.0f - (10.0f * f2);
        }
        AbstractC0249ar.m4374a(this.f4649d, f3, f4 + f7, 0.0f, 0.0f, this.f4650e, 1.0f, 500.0f, z, z2, this.f4651f, z3, null);
    }
}
