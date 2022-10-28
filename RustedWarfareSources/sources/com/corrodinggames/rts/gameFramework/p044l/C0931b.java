package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Rect;
import android.graphics.RectF;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.corrodinggames.rts.gameFramework.l.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/b.class */
public class C0931b {

    /* renamed from: a */
    EnumC0933d f6376a;

    /* renamed from: b */
    C0934e f6377b;

    /* renamed from: c */
    float f6378c;

    /* renamed from: d */
    float f6379d;

    /* renamed from: e */
    Rect f6380e;

    /* renamed from: f */
    RectF f6381f;

    /* renamed from: g */
    final /* synthetic */ C0923a f6382g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m886a(GL10 gl10) {
        if (this.f6382g.f6305i != this.f6377b.f6396h.intValue()) {
            gl10.glBindTexture(3553, this.f6377b.f6396h.intValue());
            this.f6382g.f6305i = this.f6377b.f6396h.intValue();
        }
        gl10.glPushMatrix();
        gl10.glLoadIdentity();
        if (this.f6376a == EnumC0933d.Rect) {
            gl10.glTranslatef(this.f6381f.f234a, (this.f6382g.f6299c - this.f6381f.f235b) - this.f6380e.m5029c(), 0.0f);
            C0926ac c0926ac = this.f6382g.f6304h;
            float mo386m = this.f6380e.f230a / this.f6377b.mo386m();
            float mo386m2 = this.f6380e.f232c / this.f6377b.mo386m();
            float mo387l = this.f6380e.f231b / this.f6377b.mo387l();
            float mo387l2 = this.f6380e.f233d / this.f6377b.mo387l();
            if (this.f6382g.f6306j == this.f6380e.m5029c() && this.f6382g.f6307k == this.f6380e.m5033b()) {
                c0926ac.m917a(0, 0, mo386m, mo387l2);
                c0926ac.m917a(1, 0, mo386m2, mo387l2);
                c0926ac.m917a(0, 1, mo386m, mo387l);
                c0926ac.m917a(1, 1, mo386m2, mo387l);
            } else {
                this.f6382g.f6306j = this.f6380e.m5029c();
                this.f6382g.f6307k = this.f6380e.m5033b();
                c0926ac.m916a(0, 0, 0.0f, 0.0f, 0.0f, mo386m, mo387l2, null);
                c0926ac.m916a(1, 0, this.f6380e.m5033b(), 0.0f, 0.0f, mo386m2, mo387l2, null);
                c0926ac.m916a(0, 1, 0.0f, this.f6380e.m5029c(), 0.0f, mo386m, mo387l, null);
                c0926ac.m916a(1, 1, this.f6380e.m5033b(), this.f6380e.m5029c(), 0.0f, mo386m2, mo387l, null);
            }
            c0926ac.m913b(gl10, true, false);
            gl10.glPopMatrix();
            return;
        }
        gl10.glTranslatef(this.f6378c, (this.f6382g.f6299c - this.f6379d) - this.f6377b.mo387l(), 0.0f);
        throw new RuntimeException("Not supported");
    }
}
