package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/o.class */
public final class C0944o extends AbstractC1023u {

    /* renamed from: b */
    int f6464b;

    /* renamed from: a */
    InterfaceC0941l f6463a = new C0939j(null);

    /* renamed from: c */
    final C1101m f6465c = new C1101m();

    /* renamed from: d */
    final C1019q f6466d = new C1019q(Paint.class);

    /* renamed from: e */
    final C1019q f6467e = new C1019q(Rect.class);

    /* renamed from: f */
    final C1019q f6468f = new C1019q(RectF.class);

    /* renamed from: g */
    final C1019q f6469g = new C1019q(Matrix.class);

    /* renamed from: h */
    final C1019q f6470h = new C1019q(C1020r.class);

    /* renamed from: i */
    final C1022t f6471i = new C1022t(200);

    /* renamed from: j */
    int f6472j = 0;

    /* renamed from: k */
    volatile boolean f6473k = false;

    public C0944o() {
        this.f6465c.add(this.f6466d);
        this.f6465c.add(this.f6467e);
        this.f6465c.add(this.f6468f);
        this.f6465c.add(this.f6469g);
        this.f6465c.add(this.f6470h);
    }

    /* renamed from: a */
    public final void m831a(EnumC0946p enumC0946p, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        C1022t c1022t = this.f6471i;
        int i = this.f6472j;
        if (i >= c1022t.f6557a) {
            c1022t.m819a(new C1021s(this));
        }
        C1021s c1021s = c1022t.f6558b[i];
        c1021s.f6550a = enumC0946p;
        Object[] objArr = c1021s.f6551b;
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
        objArr[4] = obj5;
        objArr[5] = obj6;
        objArr[6] = obj7;
        objArr[7] = obj8;
        objArr[8] = obj9;
        objArr[9] = obj10;
        this.f6472j++;
    }

    /* renamed from: a */
    public final void m832a(EnumC0946p enumC0946p, Object obj, Object obj2, Object obj3, Object obj4) {
        C1022t c1022t = this.f6471i;
        int i = this.f6472j;
        if (i >= c1022t.f6557a) {
            c1022t.m819a(new C1021s(this));
        }
        C1021s c1021s = c1022t.f6558b[i];
        c1021s.f6550a = enumC0946p;
        Object[] objArr = c1021s.f6551b;
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
        this.f6472j++;
    }

    /* renamed from: a */
    public final void m833a(EnumC0946p enumC0946p, Object obj, Object obj2) {
        C1022t c1022t = this.f6471i;
        int i = this.f6472j;
        if (i >= c1022t.f6557a) {
            c1022t.m819a(new C1021s(this));
        }
        C1021s c1021s = c1022t.f6558b[i];
        c1021s.f6550a = enumC0946p;
        Object[] objArr = c1021s.f6551b;
        objArr[0] = obj;
        objArr[1] = obj2;
        this.f6472j++;
    }

    /* renamed from: a */
    public final C1021s m834a(EnumC0946p enumC0946p) {
        C1022t c1022t = this.f6471i;
        int i = this.f6472j;
        if (i >= c1022t.f6557a) {
            c1022t.m819a(new C1021s(this));
        }
        C1021s c1021s = c1022t.f6558b[i];
        c1021s.f6550a = enumC0946p;
        this.f6472j++;
        return c1021s;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo828a(boolean z) {
        this.f6473k = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: c */
    public boolean mo823c() {
        return this.f6473k;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo844a(Rect rect) {
        m831a(EnumC0946p.clipRect_Rect, this.f6467e.m821a(rect), null, null, null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo842a(RectF rectF) {
        m831a(EnumC0946p.clipRect_RectF, this.f6468f.m820a(rectF), null, null, null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo838a(C0934e c0934e, float f, float f2, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6466d.m822a(paint);
        }
        C1021s m834a = m834a(EnumC0946p.drawBitmap_Bitmap_float_float_Paint);
        m834a.f6551b[0] = c0934e;
        m834a.f6551b[1] = paint;
        m834a.f6552c = f;
        m834a.f6553d = f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo837a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        Rect m821a = this.f6467e.m821a(rect);
        Rect m821a2 = this.f6467e.m821a(rect2);
        if (!(paint instanceof C0930ag)) {
            paint = this.f6466d.m822a(paint);
        }
        m832a(EnumC0946p.drawBitmap_Bitmap_Rect_Rect_Paint, c0934e, m821a, m821a2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo836a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        Rect m821a = this.f6467e.m821a(rect);
        RectF m820a = this.f6468f.m820a(rectF);
        if (!(paint instanceof C0930ag)) {
            paint = this.f6466d.m822a(paint);
        }
        m832a(EnumC0946p.drawBitmap_Bitmap_Rect_RectF_Paint, c0934e, m821a, m820a, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo848a(float f, float f2, float f3, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6466d.m822a(paint);
        }
        m832a(EnumC0946p.drawCircle_float_float_float_Paint, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo846a(int i, PorterDuff.Mode mode) {
        m833a(EnumC0946p.drawColor_int_Mode, Integer.valueOf(i), mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo847a(int i) {
        m831a(EnumC0946p.drawColor_int, Integer.valueOf(i), null, null, null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo849a(float f, float f2, float f3, float f4, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6466d.m822a(paint);
        }
        m831a(EnumC0946p.drawLine_float_float_float_float_Paint, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), paint, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo827a(float[] fArr, int i, int i2, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6466d.m822a(paint);
        }
        m831a(EnumC0946p.drawPoints_floatarray_int_int_Paint, fArr, Integer.valueOf(i), Integer.valueOf(i2), paint, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo843a(Rect rect, Paint paint) {
        Rect m821a = this.f6467e.m821a(rect);
        if (!(paint instanceof C0930ag)) {
            paint = this.f6466d.m822a(paint);
        }
        m833a(EnumC0946p.drawRect_Rect_Paint, m821a, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo841a(RectF rectF, Paint paint) {
        RectF m820a = this.f6468f.m820a(rectF);
        if (!(paint instanceof C0930ag)) {
            paint = this.f6466d.m822a(paint);
        }
        m833a(EnumC0946p.drawRect_RectF_Paint, m820a, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo830a(String str, float f, float f2, Paint paint) {
        if (!(paint instanceof C0930ag)) {
            paint = this.f6466d.m822a(paint);
        }
        m831a(EnumC0946p.drawText_String_float_float_Paint, str, Float.valueOf(f), Float.valueOf(f2), paint, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo853a() {
        m834a(EnumC0946p.restore);
        this.f6464b--;
        if (this.f6464b < 0) {
            AbstractC0916l.m957g("saveStackSize: " + this.f6464b);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo851a(float f, float f2, float f3) {
        C1021s m834a = m834a(EnumC0946p.rotate_float_float_float);
        m834a.f6552c = f;
        m834a.f6553d = f2;
        m834a.f6554e = f3;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: b */
    public void mo826b() {
        m834a(EnumC0946p.save);
        this.f6464b++;
        if (this.f6464b <= 0) {
            AbstractC0916l.m957g("saveStackSize (on save): " + this.f6464b);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo852a(float f, float f2) {
        C1021s m834a = m834a(EnumC0946p.scale_float_float);
        m834a.f6552c = f;
        m834a.f6553d = f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo850a(float f, float f2, float f3, float f4) {
        C1021s m834a = m834a(EnumC0946p.scale_float_float_float_float);
        m834a.f6552c = f;
        m834a.f6553d = f2;
        m834a.f6554e = f3;
        m834a.f6555f = f4;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo839a(C0934e c0934e) {
        m831a(EnumC0946p.setBitmap_Bitmap, c0934e, null, null, null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: b */
    public void mo825b(float f, float f2) {
        m833a(EnumC0946p.translate_float_float, Float.valueOf(f), Float.valueOf(f2));
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo835a(AbstractC0942m abstractC0942m) {
        m833a(EnumC0946p.runDrawTimeCallback_DrawTimeCallback, this, abstractC0942m);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo845a(Bitmap bitmap) {
        m833a(EnumC0946p.flushBitmap, bitmap, (Object) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo829a(Lock lock) {
        m833a(EnumC0946p.enterLock_object, lock, (Object) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: b */
    public void mo824b(Lock lock) {
        m833a(EnumC0946p.leaveLock_object, lock, (Object) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public boolean mo840a(C0928ae c0928ae) {
        m833a(EnumC0946p.compileShader_object, c0928ae, (Object) null);
        return true;
    }
}
