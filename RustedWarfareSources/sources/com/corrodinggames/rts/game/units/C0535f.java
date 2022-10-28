package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0924aa;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f.class */
public class C0535f extends AbstractC0622x {

    /* renamed from: a */
    public float f3686a;

    /* renamed from: b */
    public float f3687b;

    /* renamed from: c */
    public float f3688c;

    /* renamed from: d */
    public float f3689d;

    /* renamed from: e */
    public float f3690e;

    /* renamed from: f */
    public float f3691f;

    /* renamed from: g */
    public boolean f3692g;

    /* renamed from: h */
    public float f3693h;

    /* renamed from: i */
    public boolean f3694i;

    /* renamed from: j */
    public float f3695j;

    /* renamed from: k */
    static Paint f3696k = new Paint();

    /* renamed from: l */
    static Paint f3697l;

    /* renamed from: m */
    static Paint f3698m;

    /* renamed from: n */
    static Paint f3699n;

    /* renamed from: o */
    static Paint f3700o;

    /* renamed from: p */
    static Paint f3701p;

    /* renamed from: q */
    boolean f3702q;

    /* renamed from: r */
    static final PointF f3703r;

    static {
        f3696k.m5936a(10.0f);
        f3696k.m5908b(Color.m5948a(100, 160, 0, 0));
        f3696k.m5926a(Paint.Style.f220b);
        f3698m = new Paint();
        f3698m.m5925a(f3696k);
        f3698m.m5908b(Color.m5948a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3697l = new Paint();
        f3697l.m5936a(2.0f);
        f3697l.m5908b(Color.m5948a(100, 160, 0, 0));
        f3697l.m5926a(Paint.Style.f220b);
        f3699n = new Paint();
        f3699n.m5925a(f3697l);
        f3699n.m5908b(Color.m5948a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3700o = new Paint();
        f3700o.m5936a(2.0f);
        f3700o.m5908b(Color.m5948a(50, 255, 255, 255));
        f3700o.m5926a(Paint.Style.f220b);
        f3701p = new Paint(f3700o);
        f3703r = new PointF();
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.m1401c(0);
        streamWriter.mo1335a(this.f3686a);
        streamWriter.mo1335a(this.f3687b);
        streamWriter.mo1335a(this.f3688c);
        streamWriter.mo1335a(this.f3689d);
        streamWriter.mo1335a(this.f3690e);
        streamWriter.mo1335a(this.f3691f);
        streamWriter.mo1329a(this.f3692g);
        streamWriter.mo1335a(this.f3693h);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3272a(Reader reader) {
        reader.m1304d();
        this.f3686a = reader.m1300g();
        this.f3687b = reader.m1300g();
        this.f3688c = reader.m1300g();
        this.f3689d = reader.m1300g();
        this.f3690e = reader.m1300g();
        this.f3691f = reader.m1300g();
        this.f3692g = reader.ReadBool();
        this.f3693h = reader.m1300g();
        super.m2961a(reader);
        if (!this.f1607bT) {
            Core.m1087A().f6121bW.m1780a(this);
        }
    }

    /* renamed from: b */
    public EnumC0249ar mo1758r() {
        if (this.f3702q) {
            return EnumC0249ar.f1784X;
        }
        return EnumC0249ar.f1783W;
    }

    /* renamed from: c */
    public static void m3269c() {
        Core.m1087A();
    }

    public C0535f(boolean z) {
        super(z);
        this.f3686a = 2000.0f;
        this.f3687b = 0.0f;
        this.f3688c = 0.0f;
        this.f3689d = 2000.0f;
        this.f3692g = true;
        this.f3693h = 1.0f;
    }

    /* renamed from: f */
    public C0535f m3268f() {
        Iterator it = AbstractC0244am.m4761bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if ((abstractC0244am instanceof C0535f) && !abstractC0244am.f1607bT && abstractC0244am != this) {
                C0535f c0535f = (C0535f) abstractC0244am;
                if (c0535f.f3702q == this.f3702q) {
                    return c0535f;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (this.f1607bT) {
            return;
        }
        if (this.f3692g) {
            this.f3692g = false;
            C0535f m3268f = m3268f();
            if (m3268f != null) {
                m3268f.f3690e = this.f6958el;
                m3268f.f3691f = this.f6959em;
                m3268f.f3689d = this.f3689d;
                m4700ch();
            } else {
                this.f3690e = this.f6958el;
                this.f3691f = this.f6959em;
                if (!this.f3702q) {
                    Core.LogDebug2("DamagingBorder created " + this.f3690e + "," + this.f3691f + " size:" + this.f3689d);
                }
                Core.m1087A().f6121bW.m1780a(this);
            }
        }
        if (this.f3702q) {
            this.f3686a = this.f3689d;
            this.f6958el = this.f3690e;
            this.f6959em = this.f3691f;
        } else if (this.f3686a > this.f3689d) {
            this.f3687b += 2.5E-4f * f;
            this.f3686a -= this.f3687b;
            this.f3694i = true;
            float m2157b = C0758f.m2157b(this.f6958el, this.f6959em, this.f3690e, this.f3691f);
            float m2123d = C0758f.m2123d(this.f6958el, this.f6959em, this.f3690e, this.f3691f);
            if (m2157b > 1.0f) {
                float f2 = this.f3687b;
                if (f2 > m2157b * f) {
                    f2 = m2157b * f;
                }
                this.f6958el += f2 * C0758f.m2092i(m2123d) * f;
                this.f6959em += f2 * C0758f.m2097h(m2123d) * f;
            }
        } else {
            this.f3694i = false;
            this.f6958el = (float) (this.f6958el + ((this.f3690e - this.f6958el) * 0.003d * f));
            this.f6959em = (float) (this.f6959em + ((this.f3691f - this.f6959em) * 0.003d * f));
        }
        if (this.f3686a < this.f3689d) {
            this.f3686a = this.f3689d;
            this.f3687b = 0.0f;
        }
        if (this.f3689d < 0.0f) {
            m4700ch();
            return;
        }
        this.f3688c -= f;
        if (!this.f1607bT && this.f3688c <= 0.0f && !this.f3702q) {
            this.f3688c = 2.0f;
            float m2092i = this.f3686a * C0758f.m2092i(45.0f);
            float f3 = this.f6958el - m2092i;
            float f4 = this.f6958el + m2092i;
            float f5 = this.f6959em - m2092i;
            float f6 = this.f6959em + m2092i;
            float f7 = this.f3686a * this.f3686a;
            Iterator it = AbstractC0244am.m4761bF().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am.f6958el <= f3 || abstractC0244am.f6958el >= f4 || abstractC0244am.f6959em <= f5 || abstractC0244am.f6959em >= f6) {
                    if (C0758f.m2209a(this.f6958el, this.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em) >= f7 && !abstractC0244am.f1607bT && !(abstractC0244am instanceof C0243al) && !abstractC0244am.mo1756u() && abstractC0244am.f1651cL == null) {
                        abstractC0244am.mo3052a(this, (0.5f + (abstractC0244am.f1632cs * 0.002f) + (abstractC0244am.f1633ct * 0.001f)) * this.f3693h, (C0188f) null);
                    }
                }
            }
        }
        if (!this.f3702q) {
            Core m1087A = Core.m1087A();
            this.f3695j += f;
            if (this.f3695j > 3.0f) {
                this.f3695j = 0.0f;
                int m2203a = m1087A.f6142ct + C0758f.m2203a(0, (int) m1087A.f6148cz);
                int m2203a2 = m1087A.f6143cu + C0758f.m2203a(0, (int) m1087A.f6149cA);
                if (C0758f.m2209a(this.f6958el, this.f6959em, m2203a, m2203a2) > (this.f3686a + 30.0f) * (this.f3686a + 30.0f)) {
                    m1087A.f6110bL.m5344a(m2203a, m2203a2);
                    m1087A.f6110bL.m5340a(m1087A.f6110bL.f801T, m1087A.f6110bL.f802U);
                    C0745e m2365b = m1087A.f6116bR.m2365b(m1087A.f6110bL.f801T + 10, (m1087A.f6110bL.f802U - 10) + 10, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4832a);
                    if (m2365b != null) {
                        m2365b.f4787ar = 19;
                        m2365b.f4769Z = C0758f.m2136c(-180.0f, 180.0f);
                        m2365b.f4736s = true;
                        m2365b.f4788as = (short) 1;
                        m2365b.f4749F = 0.7f;
                        m2365b.f4766W = 30.0f;
                        m2365b.f4767X = m2365b.f4766W;
                        m2365b.f4751H = 0.2f;
                        m2365b.f4750G = 1.2f;
                        m2365b.f4742y = Color.m5948a(255, 173, 12, 12);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public int m3267s() {
        return 0;
    }

    /* renamed from: t */
    public boolean mo1757t() {
        return true;
    }

    /* renamed from: u */
    public boolean mo1756u() {
        return true;
    }

    /* renamed from: a */
    public boolean m3271a(Core core) {
        return true;
    }

    /* renamed from: a */
    public void mo3053a(float f, boolean z) {
        C0535f m3268f;
        Core m1087A = Core.m1087A();
        float f2 = this.f6958el - m1087A.f6144cv;
        float f3 = this.f6959em - m1087A.f6145cw;
        Paint paint = this.f3694i ? f3698m : f3696k;
        if (this.f3702q) {
            paint = f3700o;
        }
        float f4 = this.f3686a;
        if (this.f3692g && (m3268f = m3268f()) != null) {
            f4 = m3268f.f3689d - 300.0f;
        }
        m1087A.f6113bO.mo223a(f2, f3, f4, paint);
    }

    /* renamed from: a */
    public boolean m3273a(int i, int i2) {
        Core m1087A = Core.m1087A();
        m1087A.f6113bO.mo137i();
        m1087A.f6113bO.mo208a(m1087A.f6121bW.f5302w);
        float m1776b = m1087A.f6121bW.m1776b(this.f3686a);
        Paint paint = this.f3694i ? f3699n : f3697l;
        if (this.f3702q) {
            paint = f3701p;
        }
        C0924aa.m942a(m1087A.f6113bO, i, i2, m1776b, paint);
        m1087A.f6113bO.mo136j();
        return true;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
        this.f3686a = i * 100;
        this.f3689d = i * 100;
    }

    /* renamed from: a */
    public boolean m3276a(float f, float f2) {
        return C0758f.m2209a(this.f3690e, this.f3691f, f, f2) >= this.f3689d * this.f3689d;
    }

    /* renamed from: a */
    public PointF m3275a(float f, float f2, float f3) {
        if (f3 > this.f3689d) {
            f3 = this.f3689d;
        }
        float m2123d = C0758f.m2123d(this.f6958el, this.f6959em, f, f2);
        float f4 = this.f3689d - f3;
        float m2092i = this.f6958el + (C0758f.m2092i(m2123d) * f4);
        float m2097h = this.f6959em + (C0758f.m2097h(m2123d) * f4);
        f3703r.f227a = m2092i;
        f3703r.f228b = m2097h;
        return f3703r;
    }
}
