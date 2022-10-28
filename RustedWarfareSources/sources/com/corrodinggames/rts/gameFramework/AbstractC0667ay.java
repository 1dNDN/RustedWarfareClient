package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.gameFramework.ay */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ay.class */
public abstract class AbstractC0667ay extends AbstractC0668az {

    /* renamed from: ep */
    public int f4228ep;

    /* renamed from: eq */
    public int f4229eq;

    /* renamed from: er */
    public float f4230er;

    /* renamed from: es */
    public float f4231es;

    /* renamed from: et */
    public boolean f4232et;

    /* renamed from: b */
    public void m2615b(C0934e c0934e) {
        m2620T(c0934e.f6404p);
        m2619U(c0934e.f6405q);
        this.f4232et = true;
    }

    /* renamed from: a */
    public void m2616a(C0934e c0934e, int i) {
        m2620T(c0934e.f6404p / i);
        m2619U(c0934e.f6405q);
        this.f4232et = false;
    }

    /* renamed from: T */
    public void m2620T(int i) {
        this.f4228ep = i;
        this.f4230er = i / 2;
    }

    /* renamed from: U */
    public void m2619U(int i) {
        this.f4229eq = i;
        this.f4231es = i / 2;
    }

    /* renamed from: V */
    public void m2618V(int i) {
        this.f4228ep = i;
        this.f4230er = i / 2.0f;
    }

    /* renamed from: W */
    public void m2617W(int i) {
        this.f4229eq = i;
        this.f4231es = i / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0667ay(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo446a() {
        super.mo446a();
    }
}
