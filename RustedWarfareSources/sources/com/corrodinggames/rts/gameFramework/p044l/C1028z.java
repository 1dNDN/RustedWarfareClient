package com.corrodinggames.rts.gameFramework.p044l;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/z.class */
public class C1028z implements InterfaceC1027y {

    /* renamed from: a */
    C0934e f6592a;

    /* renamed from: b */
    C0934e f6593b;

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public InterfaceC1027y mo201a(C0934e c0934e) {
        return mo160b(c0934e);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public InterfaceC1027y mo160b(C0934e c0934e) {
        return new C1028z();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public boolean mo230a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo214a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo169b() {
        this.f6592a = new C0934e();
        this.f6593b = new C0934e();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: d */
    public InterfaceC0941l mo147d() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo189a(InterfaceC0941l interfaceC0941l) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo204a(C0923a c0923a) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo221a(int i) {
        return mo215a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo215a(int i, boolean z) {
        return new C0934e();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo183a(InputStream inputStream, boolean z) {
        return new C0934e();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo218a(int i, int i2, boolean z) {
        return mo165b(i, i2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public C0934e mo165b(int i, int i2, boolean z) {
        return new C0934e();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: e */
    public void mo144e() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo199a(C0934e c0934e, float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo196a(C0934e c0934e, Rect rect, float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo193a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo158b(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        mo193a(c0934e, rect, rect2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo207a(Rect rect, Paint paint) {
        mo162b(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo172a(boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: f */
    public void mo141f() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo192a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo198a(C0934e c0934e, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo197a(C0934e c0934e, float f, float f2, Paint paint, float f3, float f4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo159b(C0934e c0934e, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo195a(C0934e c0934e, Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo194a(C0934e c0934e, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo191a(C0934e c0934e, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo166b(int i) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo217a(int i, PorterDuff.Mode mode) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo180a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo181a(String str, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo162b(Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo205a(RectF rectF, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: g */
    public void mo139g() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: h */
    public void mo138h() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: c */
    public void mo151c(Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo208a(Rect rect) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo206a(RectF rectF) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo223a(float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo167b(float f, float f2, float f3, Paint paint) {
        mo223a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo170a(float[] fArr, int i, int i2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: i */
    public void mo137i() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: j */
    public void mo136j() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: k */
    public void mo135k() {
        mo137i();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: l */
    public void mo134l() {
        mo136j();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo227a(float f, float f2, float f3) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo228a(float f, float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo226a(float f, float f2, float f3, float f4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo168b(float f, float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo188a(AbstractC0942m abstractC0942m) {
        abstractC0942m.mo854a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo225a(float f, float f2, float f3, float f4, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: m */
    public int mo133m() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: n */
    public int mo132n() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo220a(int i, int i2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: o */
    public void mo131o() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo213a(Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo203a(C0928ae c0928ae) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: p */
    public void mo130p() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: q */
    public void mo129q() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public int mo179a(String str, Paint paint) {
        return 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public int mo157b(String str, Paint paint) {
        return 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: r */
    public C0934e mo128r() {
        return this.f6593b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo190a(C0934e c0934e, File file) {
        throw new RuntimeException("writeImageToFile not yet supported");
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo178a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo156b(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: s */
    public float mo127s() {
        return 1.0f;
    }
}
