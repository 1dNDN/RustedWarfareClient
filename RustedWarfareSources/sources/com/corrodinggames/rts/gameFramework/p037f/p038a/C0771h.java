package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p037f.C0795d;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/h.class */
public class C0771h extends AbstractC0773j {

    /* renamed from: a */
    String f5025a;

    /* renamed from: b */
    Paint f5026b = new C0930ag();

    /* renamed from: c */
    C0770g f5027c = C0770g.f5019c;

    /* renamed from: d */
    ArrayList f5028d;

    public C0771h() {
        this.f5026b.m5087a(Paint.Align.CENTER);
        this.f5026b.m5069b(-16777216);
        m1946a(18.0f);
    }

    /* renamed from: a */
    public void m1946a(float f) {
        AbstractC0916l.m1071A().m1034a(this.f5026b, f);
        m1924e();
    }

    /* renamed from: a */
    public void m1945a(int i) {
        this.f5026b.m5069b(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0773j
    /* renamed from: a */
    public String mo1942a() {
        return super.mo1942a() + " (text:" + this.f5025a + ")";
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0773j
    /* renamed from: a */
    public void mo1917a(float f, float f2) {
        int m1876a;
        super.mo1917a(f, f2);
        InterfaceC1027y d = m1926d();
        RectF a = m1938a(new RectF(), f, f2);
        this.f5027c.m1948a(d, a);
        if (this.f5025a == null) {
            return;
        }
        if (this.f5028d == null) {
            d.mo181a(this.f5025a, a.m5011d(), a.f237d - this.f5036l, this.f5026b);
            return;
        }
        int i = 0;
        Iterator it = this.f5028d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Paint paint = this.f5026b;
            d.mo181a(str, a.m5011d(), a.f235b + this.f5035k + C0795d.m1876a(paint) + (i * m1876a), paint);
            i++;
        }
    }

    /* renamed from: a */
    public void m1944a(String str) {
        this.f5025a = str;
        m1924e();
    }

    /* renamed from: c */
    public Rect m1943c() {
        RectF a = m1938a(new RectF(), 0.0f, 0.0f);
        Rect rect = new Rect();
        rect.f233d = (int) a.f237d;
        rect.f231b = (int) a.f235b;
        rect.f230a = (int) a.f234a;
        rect.f232c = (int) a.f236c;
        rect.f232c = 10000;
        return rect;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0773j
    /* renamed from: b */
    public void mo1933b() {
        Rect m1943c;
        super.mo1933b();
        m1926d();
        this.f5028d = new ArrayList(C0795d.m1872a(this.f5025a, m1943c(), this.f5026b, this.f5026b, true));
        this.f5033i = m1943c.m5033b();
        this.f5034j = m1943c.m5029c();
        this.f5033i += this.f5037m + this.f5038n;
        this.f5034j += this.f5035k + this.f5036l;
    }
}
