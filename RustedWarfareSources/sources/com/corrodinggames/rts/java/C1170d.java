package com.corrodinggames.rts.java;

import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.appFramework.C0121m;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p044l.C0923a;
import com.corrodinggames.rts.gameFramework.p044l.C0943n;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC0941l;

/* renamed from: com.corrodinggames.rts.java.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d.class */
public class C1170d implements InterfaceC0096f {

    /* renamed from: a */
    public int f7145a;

    /* renamed from: b */
    public int f7146b;

    /* renamed from: d */
    C0121m f7148d;

    /* renamed from: e */
    public Object f7149e = new Object();

    /* renamed from: f */
    public Object f7150f = new Object();

    /* renamed from: g */
    C0943n f7151g = new C0943n();

    /* renamed from: c */
    ActivityC1176h f7147c = new ActivityC1176h();

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: j */
    public void mo241j() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: a */
    public void mo255a() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: b */
    public boolean mo251b() {
        return true;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: c */
    public boolean mo248c() {
        return false;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: d */
    public C0923a mo247d() {
        return null;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: e */
    public boolean mo246e() {
        return false;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: f */
    public boolean mo245f() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (m1071A != null && m1071A.f6163bQ.slick2dFullScreen) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: g */
    public Object mo244g() {
        return null;
    }

    /* renamed from: o */
    public int m236o() {
        return this.f7145a;
    }

    /* renamed from: p */
    public int m235p() {
        return this.f7146b;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: h */
    public void mo243h() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: i */
    public ActivityC0097g mo242i() {
        return this.f7147c;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: k */
    public C0121m mo240k() {
        return this.f7148d;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: a */
    public void mo254a(float f, int i) {
        synchronized (this.f7150f) {
            this.f7150f.notifyAll();
        }
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: b */
    public void mo250b(float f, int i) {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: l */
    public void mo239l() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: b */
    public InterfaceC0941l mo249b(boolean z) {
        return this.f7151g;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: a */
    public void mo253a(InterfaceC0941l interfaceC0941l, boolean z) {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: m */
    public void mo238m() {
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: n */
    public boolean mo237n() {
        return true;
    }

    @Override // com.corrodinggames.rts.appFramework.InterfaceC0096f
    /* renamed from: a */
    public void mo252a(boolean z) {
    }
}
