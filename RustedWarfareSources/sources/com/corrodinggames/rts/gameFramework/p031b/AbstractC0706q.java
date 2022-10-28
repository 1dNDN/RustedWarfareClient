package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;

/* renamed from: com.corrodinggames.rts.gameFramework.b.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/q.class */
abstract class AbstractC0706q {

    /* renamed from: b */
    protected final String f4437b;

    /* renamed from: a */
    public int f4436a = -1;

    /* renamed from: c */
    public int f4438c = -1;

    /* renamed from: a */
    public abstract void mo2440a(int i);

    public AbstractC0706q(String str) {
        this.f4437b = str;
    }

    /* renamed from: a */
    public void m2442a(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.f4436a, 1, false, fArr, 0);
    }
}
