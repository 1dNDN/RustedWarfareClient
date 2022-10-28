package com.corrodinggames.rts.gameFramework.p031b;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: com.corrodinggames.rts.gameFramework.b.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/s.class */
class C0708s extends AbstractC0706q {
    public C0708s(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0706q
    /* renamed from: a */
    public void mo2440a(int i) {
        String str;
        if (this.f4438c != i) {
            this.f4436a = GLES20.glGetUniformLocation(i, this.f4437b);
            this.f4438c = i;
            C0703n.m2447p();
            if (this.f4436a == -1) {
                str = C0703n.f4379E;
                Log.m4933d(str, "loadHandle: Failed to find: " + this.f4437b);
            }
        }
    }
}
