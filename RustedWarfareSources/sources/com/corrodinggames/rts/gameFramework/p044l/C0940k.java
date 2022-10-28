package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b;
import com.corrodinggames.rts.gameFramework.p031b.C0682ac;
import com.corrodinggames.rts.gameFramework.p031b.C0691c;
import com.corrodinggames.rts.gameFramework.p031b.C0694f;
import com.corrodinggames.rts.gameFramework.p031b.C0703n;
import com.corrodinggames.rts.gameFramework.p031b.C0711v;
import com.corrodinggames.rts.gameFramework.p031b.InterfaceC0701l;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/k.class */
public class C0940k implements InterfaceC0941l {

    /* renamed from: a */
    public C0694f f6447a;

    /* renamed from: b */
    public C0703n f6448b;

    /* renamed from: c */
    C0711v f6449c;

    /* renamed from: e */
    Rect f6451e;

    /* renamed from: f */
    RectF f6452f;

    /* renamed from: g */
    C0691c f6453g;

    /* renamed from: h */
    RectF f6454h;

    /* renamed from: i */
    float[] f6455i;

    /* renamed from: j */
    static C0934e f6456j;

    /* renamed from: n */
    C0934e f6460n;

    /* renamed from: o */
    boolean f6461o;

    /* renamed from: d */
    public static boolean f6450d = false;

    /* renamed from: k */
    static Rect f6457k = new Rect(0, 0, 1, 1);

    /* renamed from: l */
    static Paint f6458l = new Paint();

    /* renamed from: m */
    static Rect f6459m = new Rect();

    /* renamed from: b */
    public void m857b(C0934e c0934e) {
        this.f6447a.m2528a(this.f6447a.m2529a(c0934e.mo390b(), c0934e, this.f6453g));
    }

    /* renamed from: d */
    public void m855d() {
        this.f6447a.m2535a();
    }

    /* renamed from: a */
    public C0711v m860a(Paint paint) {
        this.f6448b.m2484a((C0928ae) null);
        if (paint == null) {
            return null;
        }
        this.f6449c.m2435a(paint.m5061d());
        this.f6449c.m2436a(paint.m5057e());
        this.f6449c.m2437a(paint.m5053g());
        return this.f6449c;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo844a(Rect rect) {
        this.f6447a.m2532a(rect.f230a, rect.f231b, rect.f232c, rect.f233d);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo842a(RectF rectF) {
        this.f6447a.m2532a((int) rectF.f234a, (int) rectF.f235b, (int) rectF.f236c, (int) rectF.f237d);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo838a(C0934e c0934e, float f, float f2, Paint paint) {
        this.f6451e.m5035a(0, 0, c0934e.mo386m(), c0934e.mo387l());
        this.f6452f.m5022a(f, f2, f + c0934e.mo386m(), f2 + c0934e.mo387l());
        m856b(c0934e, this.f6451e, this.f6452f, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo837a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        this.f6452f.m5021a(rect2);
        m856b(c0934e, rect, this.f6452f, paint);
    }

    /* renamed from: a */
    public AbstractC0690b m861a(Bitmap bitmap, C0934e c0934e) {
        AbstractC0690b m2565a;
        C0703n c0703n = this.f6448b;
        if (c0703n.f4378a == null) {
            c0703n.f4378a = new C0682ac(c0703n, 1024, 1024);
        }
        if (bitmap.m5138b() < 450 && bitmap.m5135c() < 100 && (m2565a = c0703n.f4378a.m2565a(bitmap)) != null) {
            return m2565a;
        }
        return this.f6447a.m2529a(bitmap, c0934e, this.f6453g);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo836a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        m856b(c0934e, rect, rectF, paint);
    }

    /* renamed from: b */
    public void m856b(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        Bitmap m928a = C0924aa.m928a(c0934e);
        this.f6454h.m5021a(rect);
        if (m928a == null) {
            throw new RuntimeException("bitmap==null. sourceImage: " + c0934e.mo64a());
        }
        AbstractC0690b m861a = m861a(m928a, c0934e);
        C0703n c0703n = this.f6448b;
        boolean z = true;
        if (paint == null) {
            c0703n.f4422u = -1;
        } else {
            int m5057e = paint.m5057e();
            if (m5057e != -1 && paint.m5052h() == null) {
                m5057e = Color.m5106a(Color.m5108a(m5057e), 255, 255, 255);
            }
            c0703n.f4422u = m5057e;
            if (paint instanceof C0930ag) {
                z = ((C0930ag) paint).m888p();
            } else {
                z = paint.m5065c();
            }
        }
        c0703n.m2493a(m861a, z ? 9729 : 9728);
        C0928ae c0928ae = null;
        if (paint instanceof C0930ag) {
            c0928ae = ((C0930ag) paint).m887q();
        }
        if (c0934e != null && c0928ae == null) {
            c0928ae = c0934e.mo885B();
        }
        if (c0928ae != null) {
            boolean mo864a = c0928ae.mo864a(paint, c0934e);
            this.f6448b.m2484a(c0928ae);
            if (mo864a) {
                this.f6448b.mo2458e();
                this.f6448b.m2450m();
            }
        } else {
            this.f6448b.m2484a((C0928ae) null);
        }
        c0703n.m2488a(m861a, this.f6454h, rectF, this.f6453g, (InterfaceC0701l) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo845a(Bitmap bitmap) {
        this.f6447a.m2531a(bitmap);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo848a(float f, float f2, float f3, Paint paint) {
        this.f6447a.m2533a(f, f2, f3, m860a(paint));
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo846a(int i, PorterDuff.Mode mode) {
        this.f6448b.m2480a(m858b(i));
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo847a(int i) {
        this.f6448b.m2480a(m858b(i));
    }

    /* renamed from: b */
    float[] m858b(int i) {
        float f = ((i >>> 24) & 255) * 0.003921569f * 1.0f;
        float f2 = ((i >>> 16) & 255) * 0.003921569f * f;
        float f3 = ((i >>> 8) & 255) * 0.003921569f * f;
        this.f6455i[0] = f;
        this.f6455i[1] = f2;
        this.f6455i[2] = f3;
        this.f6455i[3] = (i & 255) * 0.003921569f * f;
        return this.f6455i;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo849a(float f, float f2, float f3, float f4, Paint paint) {
        this.f6447a.m2534a(f, f2, f3, f4, m860a(paint));
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo827a(float[] fArr, int i, int i2, Paint paint) {
        this.f6447a.m2526a(fArr, i, i2, m860a(paint));
    }

    /* renamed from: b */
    public void m859b(float f, float f2, float f3, float f4, Paint paint) {
        if (f6456j == null) {
            Bitmap m5147a = Bitmap.m5147a(1, 1, Bitmap.Config.ARGB_8888);
            m5147a.m5149a(0, 0, -1);
            C0934e c0934e = new C0934e();
            c0934e.mo393a(m5147a);
            f6456j = c0934e;
            f6458l.mo893a(false);
            f6458l.m5088a(new LightingColorFilter(-1, -16777216));
        }
        f6458l.m5069b(paint.m5057e());
        if (paint.m5061d() == Paint.Style.STROKE) {
            float m5053g = paint.m5053g();
            if (m5053g == 0.0f) {
                m5053g = 1.0f;
            }
            this.f6452f.m5022a(f, f2, f3, f2 + m5053g);
            m856b(f6456j, f6457k, this.f6452f, f6458l);
            this.f6452f.m5022a(f, f4, f3, f4 + m5053g);
            m856b(f6456j, f6457k, this.f6452f, f6458l);
            this.f6452f.m5022a(f, f2, f + m5053g, f4);
            m856b(f6456j, f6457k, this.f6452f, f6458l);
            this.f6452f.m5022a(f3, f2, f3 + m5053g, f4);
            m856b(f6456j, f6457k, this.f6452f, f6458l);
            return;
        }
        this.f6452f.m5022a(f, f2, f3, f4);
        m856b(f6456j, f6457k, this.f6452f, f6458l);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo843a(Rect rect, Paint paint) {
        m859b(rect.f230a, rect.f231b, rect.f232c, rect.f233d, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo841a(RectF rectF, Paint paint) {
        m859b(rectF.f234a, rectF.f235b, rectF.f236c, rectF.f237d, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo830a(String str, float f, float f2, Paint paint) {
        this.f6448b.m2468b((C0928ae) null);
        C0703n.f4430C = this;
        this.f6447a.m2527a(str, f, f2, paint);
    }

    public boolean equals(Object obj) {
        return this.f6447a.equals(obj);
    }

    public int hashCode() {
        return this.f6447a.hashCode();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo853a() {
        this.f6448b.mo2465c();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo851a(float f, float f2, float f3) {
        C0703n c0703n = this.f6448b;
        c0703n.m2510a(f2, f3);
        c0703n.m2511a(f);
        c0703n.m2510a(-f2, -f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: b */
    public void mo826b() {
        this.f6448b.mo2473b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo850a(float f, float f2, float f3, float f4) {
        C0703n c0703n = this.f6448b;
        c0703n.m2510a(f3, f4);
        c0703n.m2509a(f, f2, 1.0f);
        c0703n.m2510a(-f3, -f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo852a(float f, float f2) {
        this.f6448b.m2509a(f, f2, 1.0f);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo839a(C0934e c0934e) {
        if (this.f6460n != null) {
            m855d();
        }
        if (c0934e != null) {
            m857b(c0934e);
        }
        this.f6460n = c0934e;
    }

    public String toString() {
        return this.f6447a.toString();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: b */
    public void mo825b(float f, float f2) {
        this.f6448b.m2510a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo828a(boolean z) {
        this.f6461o = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: c */
    public boolean mo823c() {
        return this.f6461o;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo835a(AbstractC0942m abstractC0942m) {
        abstractC0942m.mo854a(AbstractC0916l.m1071A().f6161bO);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo829a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: b */
    public void mo824b(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public boolean mo840a(C0928ae c0928ae) {
        return this.f6448b.m2459d(c0928ae);
    }
}
