package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.gameFramework.f.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/y.class */
public class C0817y extends C0814v {

    /* renamed from: d */
    String f5391d;

    /* renamed from: e */
    final /* synthetic */ C0813u f5392e;

    @Override // com.corrodinggames.rts.gameFramework.p037f.C0814v
    /* renamed from: a */
    public int mo1691a(Paint paint) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        int mo157b = m1071A.f6161bO.mo157b(this.f5391d, mo1690b(paint));
        if (AbstractC0916l.m996as()) {
        }
        return mo157b;
    }

    /* renamed from: b */
    public Paint mo1690b(Paint paint) {
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0817y(C0813u c0813u, String str) {
        this.f5392e = c0813u;
        this.f5391d = str;
    }

    /* renamed from: b */
    public C0817y mo1689b(String str) {
        return new C0817y(this.f5392e, str);
    }
}
