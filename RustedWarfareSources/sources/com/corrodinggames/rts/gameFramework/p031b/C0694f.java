package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.Map;

/* renamed from: com.corrodinggames.rts.gameFramework.b.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/f.class */
public class C0694f {

    /* renamed from: a */
    protected final InterfaceC0700k f4367a;

    /* renamed from: b */
    private Map f4368b;

    /* renamed from: c */
    private C0670a f4369c;

    /* renamed from: d */
    private C0696g f4370d;

    /* renamed from: e */
    private InterfaceC0685af f4371e;

    /* renamed from: a */
    public void m2528a(AbstractC0690b abstractC0690b) {
        this.f4367a.mo2463c(abstractC0690b);
    }

    /* renamed from: a */
    public void m2535a() {
        this.f4367a.mo2461d();
    }

    /* renamed from: b */
    public InterfaceC0700k m2525b() {
        return this.f4367a;
    }

    /* renamed from: a */
    public AbstractC0690b m2529a(Bitmap bitmap, C0934e c0934e, InterfaceC0685af interfaceC0685af) {
        this.f4371e = interfaceC0685af;
        AbstractC0690b m2530a = m2530a(bitmap, c0934e);
        if (interfaceC0685af instanceof C0698i) {
            m2530a = ((C0698i) interfaceC0685af).m2516a(m2530a, this.f4367a, new InterfaceC0699j() { // from class: com.corrodinggames.rts.gameFramework.b.f.1
                @Override // com.corrodinggames.rts.gameFramework.p031b.InterfaceC0699j
                /* renamed from: a */
                public void mo2515a(AbstractC0690b abstractC0690b, InterfaceC0685af interfaceC0685af2, boolean z) {
                    C0694f.this.f4367a.mo2491a(abstractC0690b, 0, 0, abstractC0690b.mo2546b(), abstractC0690b.mo2545c(), interfaceC0685af2, null);
                }
            });
        }
        return m2530a;
    }

    /* renamed from: a */
    public void m2531a(Bitmap bitmap) {
        AbstractC0690b abstractC0690b = (AbstractC0690b) this.f4368b.get(bitmap);
        if (abstractC0690b != null && (abstractC0690b instanceof AbstractC0687ah)) {
            ((AbstractC0687ah) abstractC0690b).m2558l();
        }
        m2525b().mo2495a(bitmap);
    }

    /* renamed from: a */
    public AbstractC0690b m2530a(Bitmap bitmap, C0934e c0934e) {
        C0693e c0693e = (AbstractC0690b) this.f4368b.get(bitmap);
        if (c0693e == null) {
            this.f4367a.mo2458e();
            m2524c();
            c0693e = new C0693e(bitmap);
            c0693e.mo2429c(m2525b());
            c0693e.f4362j = c0934e.m879d();
            C0703n.m2471b(c0693e.f4355e, c0693e.f4356f);
            this.f4368b.put(bitmap, c0693e);
            m2523d();
        }
        return c0693e;
    }

    /* renamed from: a */
    public void m2533a(float f, float f2, float f3, C0711v c0711v) {
        if (c0711v.m2433c() == Paint.Style.FILL) {
            this.f4370d.m2521a(0.5f);
        } else {
            float m2434b = c0711v.m2434b();
            if (m2434b == 0.0f) {
                m2434b = 1.0f;
            }
            this.f4370d.m2521a(m2434b / (2.0f * f3));
        }
        this.f4367a.mo2507a(f - f3, f2 - f3, f3, c0711v, this.f4370d);
    }

    /* renamed from: a */
    public void m2534a(float f, float f2, float f3, float f4, C0711v c0711v) {
        this.f4367a.mo2508a(f, f2, f3, f4, c0711v, this.f4369c);
    }

    /* renamed from: c */
    public void m2524c() {
        this.f4367a.mo2473b();
    }

    /* renamed from: d */
    public void m2523d() {
        this.f4367a.mo2465c();
    }

    /* renamed from: e */
    public void m2522e() {
        for (AbstractC0690b abstractC0690b : this.f4368b.values()) {
            abstractC0690b.mo2540j();
        }
        this.f4368b.clear();
    }

    protected void finalize() {
        super.finalize();
        m2522e();
    }

    /* renamed from: a */
    public void m2532a(int i, int i2, int i3, int i4) {
        this.f4367a.mo2501a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void m2527a(String str, float f, float f2, Paint paint) {
        this.f4367a.mo2483a(str, f, f2, paint);
    }

    /* renamed from: a */
    public void m2526a(float[] fArr, int i, int i2, C0711v c0711v) {
        this.f4367a.mo2478a(fArr, i, i2, c0711v, this.f4369c);
    }
}
