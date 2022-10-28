package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/j.class */
public class C0939j implements InterfaceC0941l {

    /* renamed from: a */
    public Canvas f6445a;

    /* renamed from: b */
    boolean f6446b = false;

    public C0939j(Canvas canvas) {
        this.f6445a = canvas;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo844a(Rect rect) {
        this.f6445a.m5117a(rect);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo842a(RectF rectF) {
        this.f6445a.m5115a(rectF);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo838a(C0934e c0934e, float f, float f2, Paint paint) {
        this.f6445a.m5120a(C0924aa.m928a(c0934e), f, f2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo837a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        this.f6445a.m5119a(C0924aa.m928a(c0934e), rect, rect2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo836a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        this.f6445a.m5118a(C0924aa.m928a(c0934e), rect, rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo848a(float f, float f2, float f3, Paint paint) {
        this.f6445a.m5124a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo846a(int i, PorterDuff.Mode mode) {
        this.f6445a.m5122a(i, mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo847a(int i) {
        this.f6445a.m5123a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo849a(float f, float f2, float f3, float f4, Paint paint) {
        this.f6445a.m5125a(f, f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo827a(float[] fArr, int i, int i2, Paint paint) {
        this.f6445a.m5111a(fArr, i, i2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo843a(Rect rect, Paint paint) {
        this.f6445a.m5116a(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo841a(RectF rectF, Paint paint) {
        this.f6445a.m5114a(rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo830a(String str, float f, float f2, Paint paint) {
        this.f6445a.m5113a(str, f, f2, paint);
    }

    public boolean equals(Object obj) {
        return this.f6445a.equals(obj);
    }

    public int hashCode() {
        return this.f6445a.hashCode();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo853a() {
        this.f6445a.m5110b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo851a(float f, float f2, float f3) {
        this.f6445a.m5127a(f, f2, f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: b */
    public void mo826b() {
        this.f6445a.m5129a();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo850a(float f, float f2, float f3, float f4) {
        this.f6445a.m5126a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo852a(float f, float f2) {
        this.f6445a.m5109b(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo839a(C0934e c0934e) {
        this.f6445a.m5121a(c0934e.mo390b());
    }

    public String toString() {
        return this.f6445a.toString();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: b */
    public void mo825b(float f, float f2) {
        this.f6445a.m5128a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo828a(boolean z) {
        this.f6446b = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: c */
    public boolean mo823c() {
        return this.f6446b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo835a(AbstractC0942m abstractC0942m) {
        abstractC0942m.mo854a(AbstractC0916l.m1071A().f6161bO);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l
    /* renamed from: a */
    public void mo845a(Bitmap bitmap) {
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
        return false;
    }
}
