package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.gameFramework.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/g.class */
public final class C0747g {

    /* renamed from: a */
    public String f4819a;

    /* renamed from: b */
    public int f4820b = 25;

    /* renamed from: c */
    public int f4821c = 25;

    /* renamed from: d */
    public int f4822d = 1;

    /* renamed from: e */
    public int f4823e = 1;

    /* renamed from: f */
    public int f4824f = 26;

    /* renamed from: g */
    public int f4825g = 26;

    /* renamed from: h */
    public int f4826h = Integer.MAX_VALUE;

    /* renamed from: i */
    public C0934e f4827i = null;

    /* renamed from: j */
    public C0934e f4828j = null;

    /* renamed from: k */
    public boolean f4829k = false;

    /* renamed from: l */
    static final Rect f4830l = new Rect();

    /* renamed from: m */
    static final RectF f4831m = new RectF();

    /* renamed from: a */
    public void m2333a() {
        this.f4828j = this.f4827i.mo54h();
        this.f4828j.mo52j();
        for (int i = 0; i < this.f4828j.mo386m(); i++) {
            for (int i2 = 0; i2 < this.f4828j.mo387l(); i2++) {
                this.f4828j.mo62a(i, i2, Color.m5948a(Color.m5950a(this.f4828j.mo63a(i, i2)), 0, 0, 0));
            }
        }
        this.f4828j.mo48p();
        this.f4828j.mo45s();
    }

    /* renamed from: a */
    public void m2332a(int i, float f, float f2, Paint paint) {
        Rect rect = f4830l;
        RectF rectF = f4831m;
        Core m1087A = Core.m1087A();
        int i2 = i;
        int i3 = 0;
        if (i2 >= this.f4826h) {
            i3 = 0 + (i2 / this.f4826h);
            i2 %= this.f4826h;
        }
        int i4 = this.f4822d + (i2 * this.f4824f);
        int i5 = this.f4823e + (i3 * this.f4825g);
        f4830l.m5874a(i4, i5, i4 + this.f4820b, i5 + this.f4821c);
        rectF.m5861a(f, f2, f + rect.m5872b(), f2 + rect.m5868c());
        if (1 != 0) {
            rectF.m5862a((-rectF.m5856b()) / 2.0f, (-rectF.m5852c()) / 2.0f);
        }
        m1087A.f6113bO.mo192a(this.f4827i, rect, rectF, paint);
    }
}
