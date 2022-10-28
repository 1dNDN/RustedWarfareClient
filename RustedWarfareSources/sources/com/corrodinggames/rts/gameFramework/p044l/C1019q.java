package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.gameFramework.l.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/q.class */
public final class C1019q {

    /* renamed from: a */
    public final C1101m f6547a = new C1101m();

    /* renamed from: b */
    public int f6548b;

    /* renamed from: c */
    public Class f6549c;

    public C1019q(Class cls) {
        this.f6549c = cls;
    }

    /* renamed from: a */
    public final Rect m821a(Rect rect) {
        if (this.f6548b >= this.f6547a.f6894a) {
            this.f6547a.add(new Rect());
        }
        Rect rect2 = (Rect) this.f6547a.m533a(this.f6548b);
        rect2.f231b = rect.f231b;
        rect2.f233d = rect.f233d;
        rect2.f230a = rect.f230a;
        rect2.f232c = rect.f232c;
        this.f6548b++;
        return rect2;
    }

    /* renamed from: a */
    public final RectF m820a(RectF rectF) {
        if (this.f6548b >= this.f6547a.f6894a) {
            this.f6547a.add(new RectF());
        }
        RectF rectF2 = (RectF) this.f6547a.m533a(this.f6548b);
        rectF2.f235b = rectF.f235b;
        rectF2.f237d = rectF.f237d;
        rectF2.f234a = rectF.f234a;
        rectF2.f236c = rectF.f236c;
        this.f6548b++;
        return rectF2;
    }

    /* renamed from: a */
    public final Paint m822a(Paint paint) {
        if (paint == null) {
            return null;
        }
        if (this.f6548b >= this.f6547a.f6894a) {
            this.f6547a.add(new Paint());
        }
        Paint paint2 = (Paint) this.f6547a.m533a(this.f6548b);
        paint2.m5083a(paint);
        this.f6548b++;
        return paint2;
    }
}
