package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
        f3696k.m5423a(10.0f);
        f3696k.m5398b(Color.m5435a(100, 160, 0, 0));
        f3696k.m5413a(Paint.Style.f220b);
        f3698m = new Paint();
        f3698m.m5412a(f3696k);
        f3698m.m5398b(Color.m5435a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3697l = new Paint();
        f3697l.m5423a(2.0f);
        f3697l.m5398b(Color.m5435a(100, 160, 0, 0));
        f3697l.m5413a(Paint.Style.f220b);
        f3699n = new Paint();
        f3699n.m5412a(f3697l);
        f3699n.m5398b(Color.m5435a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3700o = new Paint();
        f3700o.m5423a(2.0f);
        f3700o.m5398b(Color.m5435a(50, 255, 255, 255));
        f3700o.m5413a(Paint.Style.f220b);
        f3701p = new Paint(f3700o);
        f3703r = new PointF();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1355c(0);
        streamWriter.mo1320a(this.f3686a);
        streamWriter.mo1320a(this.f3687b);
        streamWriter.mo1320a(this.f3688c);
        streamWriter.mo1320a(this.f3689d);
        streamWriter.mo1320a(this.f3690e);
        streamWriter.mo1320a(this.f3691f);
        streamWriter.mo1314a(this.f3692g);
        streamWriter.mo1320a(this.f3693h);
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        reader.m1289d();
        this.f3686a = reader.m1285g();
        this.f3687b = reader.m1285g();
        this.f3688c = reader.m1285g();
        this.f3689d = reader.m1285g();
        this.f3690e = reader.m1285g();
        this.f3691f = reader.m1285g();
        this.f3692g = reader.ReadBool();
        this.f3693h = reader.m1285g();
        super.mo2291a(reader);
        if (!this.f1607bT) {
            LoggerMaybe.m1072A().f6121bW.m1736a(this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5649r() {
        if (this.f3702q) {
            return EnumC0249ar.f1784X;
        }
        return EnumC0249ar.f1783W;
    }

    /* renamed from: c */
    public static void m3171c() {
        LoggerMaybe.m1072A();
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
    public C0535f m3170f() {
        Iterator it = AbstractC0244am.m4405bF().iterator();
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0622x, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (this.f1607bT) {
            return;
        }
        if (this.f3692g) {
            this.f3692g = false;
            C0535f m3170f = m3170f();
            if (m3170f != null) {
                m3170f.f3690e = this.f6957el;
                m3170f.f3691f = this.f6958em;
                m3170f.f3689d = this.f3689d;
                m4351ch();
            } else {
                this.f3690e = this.f6957el;
                this.f3691f = this.f6958em;
                if (!this.f3702q) {
                    LoggerMaybe.LogDebug2("DamagingBorder created " + this.f3690e + "," + this.f3691f + " size:" + this.f3689d);
                }
                LoggerMaybe.m1072A().f6121bW.m1736a(this);
            }
        }
        if (this.f3702q) {
            this.f3686a = this.f3689d;
            this.f6957el = this.f3690e;
            this.f6958em = this.f3691f;
        } else if (this.f3686a > this.f3689d) {
            this.f3687b += 2.5E-4f * f;
            this.f3686a -= this.f3687b;
            this.f3694i = true;
            float m2105b = C0758f.m2105b(this.f6957el, this.f6958em, this.f3690e, this.f3691f);
            float m2071d = C0758f.m2071d(this.f6957el, this.f6958em, this.f3690e, this.f3691f);
            if (m2105b > 1.0f) {
                float f2 = this.f3687b;
                if (f2 > m2105b * f) {
                    f2 = m2105b * f;
                }
                this.f6957el += f2 * C0758f.m2040i(m2071d) * f;
                this.f6958em += f2 * C0758f.m2045h(m2071d) * f;
            }
        } else {
            this.f3694i = false;
            this.f6957el = (float) (this.f6957el + ((this.f3690e - this.f6957el) * 0.003d * f));
            this.f6958em = (float) (this.f6958em + ((this.f3691f - this.f6958em) * 0.003d * f));
        }
        if (this.f3686a < this.f3689d) {
            this.f3686a = this.f3689d;
            this.f3687b = 0.0f;
        }
        if (this.f3689d < 0.0f) {
            m4351ch();
            return;
        }
        this.f3688c -= f;
        if (!this.f1607bT && this.f3688c <= 0.0f && !this.f3702q) {
            this.f3688c = 2.0f;
            float m2040i = this.f3686a * C0758f.m2040i(45.0f);
            float f3 = this.f6957el - m2040i;
            float f4 = this.f6957el + m2040i;
            float f5 = this.f6958em - m2040i;
            float f6 = this.f6958em + m2040i;
            float f7 = this.f3686a * this.f3686a;
            Iterator it = AbstractC0244am.m4405bF().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am.f6957el <= f3 || abstractC0244am.f6957el >= f4 || abstractC0244am.f6958em <= f5 || abstractC0244am.f6958em >= f6) {
                    if (C0758f.m2157a(this.f6957el, this.f6958em, abstractC0244am.f6957el, abstractC0244am.f6958em) >= f7 && !abstractC0244am.f1607bT && !(abstractC0244am instanceof C0243al) && !abstractC0244am.mo1712u() && abstractC0244am.f1651cL == null) {
                        abstractC0244am.mo2994a(this, (0.5f + (abstractC0244am.f1632cs * 0.002f) + (abstractC0244am.f1633ct * 0.001f)) * this.f3693h, (C0188f) null);
                    }
                }
            }
        }
        if (!this.f3702q) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            this.f3695j += f;
            if (this.f3695j > 3.0f) {
                this.f3695j = 0.0f;
                int m2151a = m1072A.f6142ct + C0758f.m2151a(0, (int) m1072A.f6148cz);
                int m2151a2 = m1072A.f6143cu + C0758f.m2151a(0, (int) m1072A.f6149cA);
                if (C0758f.m2157a(this.f6957el, this.f6958em, m2151a, m2151a2) > (this.f3686a + 30.0f) * (this.f3686a + 30.0f)) {
                    m1072A.f6110bL.m4857a(m2151a, m2151a2);
                    m1072A.f6110bL.m4853a(m1072A.f6110bL.f801T, m1072A.f6110bL.f802U);
                    C0745e m2313b = m1072A.f6116bR.m2313b(m1072A.f6110bL.f801T + 10, (m1072A.f6110bL.f802U - 10) + 10, 0.0f, EnumC0744d.f4707a, true, EnumC0748h.f4832a);
                    if (m2313b != null) {
                        m2313b.f4768ar = 19;
                        m2313b.f4752Z = C0758f.m2084c(-180.0f, 180.0f);
                        m2313b.f4725s = true;
                        m2313b.f4792as = (short) 1;
                        m2313b.f4733F = 0.7f;
                        m2313b.f4750W = 30.0f;
                        m2313b.f4751X = m2313b.f4750W;
                        m2313b.f4735H = 0.2f;
                        m2313b.f4734G = 1.2f;
                        m2313b.f4730y = Color.m5435a(255, 173, 12, 12);
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: s */
    public int mo3169s() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: t */
    public boolean mo1713t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0622x, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public boolean mo1712u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public boolean mo2290a(LoggerMaybe loggerMaybe) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0622x, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2294a(float f, boolean z) {
        C0535f m3170f;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float f2 = this.f6957el - m1072A.f6144cv;
        float f3 = this.f6958em - m1072A.f6145cw;
        Paint paint = this.f3694i ? f3698m : f3696k;
        if (this.f3702q) {
            paint = f3700o;
        }
        float f4 = this.f3686a;
        if (this.f3692g && (m3170f = m3170f()) != null) {
            f4 = m3170f.f3689d - 300.0f;
        }
        m1072A.f6113bO.mo223a(f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public boolean mo3173a(int i, int i2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6113bO.mo137i();
        m1072A.f6113bO.mo208a(m1072A.f6121bW.f5302w);
        float m1732b = m1072A.f6121bW.m1732b(this.f3686a);
        Paint paint = this.f3694i ? f3699n : f3697l;
        if (this.f3702q) {
            paint = f3701p;
        }
        C0924aa.m927a(m1072A.f6113bO, i, i2, m1732b, paint);
        m1072A.f6113bO.mo136j();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3174a(int i) {
        this.f3686a = i * 100;
        this.f3689d = i * 100;
    }

    /* renamed from: a */
    public boolean m3176a(float f, float f2) {
        return C0758f.m2157a(this.f3690e, this.f3691f, f, f2) >= this.f3689d * this.f3689d;
    }

    /* renamed from: a */
    public PointF m3175a(float f, float f2, float f3) {
        if (f3 > this.f3689d) {
            f3 = this.f3689d;
        }
        float m2071d = C0758f.m2071d(this.f6957el, this.f6958em, f, f2);
        float f4 = this.f3689d - f3;
        float m2040i = this.f6957el + (C0758f.m2040i(m2071d) * f4);
        float m2045h = this.f6958em + (C0758f.m2045h(m2071d) * f4);
        f3703r.f227a = m2040i;
        f3703r.f228b = m2045h;
        return f3703r;
    }
}
