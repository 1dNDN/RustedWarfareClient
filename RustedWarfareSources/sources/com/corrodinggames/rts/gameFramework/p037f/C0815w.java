package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;

/* renamed from: com.corrodinggames.rts.gameFramework.f.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/w.class */
public class C0815w extends C0817y {

    /* renamed from: a */
    public Paint f5383a;

    /* renamed from: b */
    public int f5384b;

    /* renamed from: c */
    final /* synthetic */ C0813u f5385c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815w(C0813u c0813u, String str, Paint paint) {
        super(c0813u, str);
        this.f5385c = c0813u;
        this.f5384b = 0;
        this.f5383a = paint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815w(C0813u c0813u, String str, Paint paint, int i) {
        super(c0813u, str);
        this.f5385c = c0813u;
        this.f5384b = 0;
        this.f5383a = paint;
        this.f5384b = i;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0817y
    /* renamed from: b */
    public Paint mo1690b(Paint paint) {
        if (this.f5383a == null) {
            if (this.f5384b != 0) {
                C0813u.f5379f.m5083a(paint);
                C0813u.f5379f.m5069b(this.f5384b);
                return C0813u.f5379f;
            }
            return paint;
        } else if (this.f5384b != 0) {
            C0813u.f5379f.m5083a(this.f5383a);
            C0813u.f5379f.m5069b(this.f5384b);
            return C0813u.f5379f;
        } else {
            return this.f5383a;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0817y
    /* renamed from: a */
    public C0815w mo1689b(String str) {
        return new C0815w(this.f5385c, str, this.f5383a, this.f5384b);
    }
}
