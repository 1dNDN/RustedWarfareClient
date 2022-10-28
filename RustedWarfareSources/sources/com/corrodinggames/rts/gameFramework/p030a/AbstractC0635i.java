package com.corrodinggames.rts.gameFramework.p030a;

import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.gameFramework.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/i.class */
public abstract class AbstractC0635i {

    /* renamed from: e */
    public String f4069e;

    /* renamed from: g */
    public boolean f4071g;

    /* renamed from: d */
    public float f4068d = 1.0f;

    /* renamed from: f */
    public boolean f4070f = false;

    /* renamed from: a */
    public abstract void mo74a(float f, float f2, int i, int i2, float f3);

    /* renamed from: a */
    public abstract int mo75a();

    public AbstractC0635i(String str, AbstractC0634h abstractC0634h) {
        this.f4069e = C0758f.m2037g(str);
        if (abstractC0634h != null) {
            abstractC0634h.f4067h.put(this.f4069e, this);
        }
    }
}
