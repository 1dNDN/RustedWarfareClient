package com.corrodinggames.rts.gameFramework.p030a;

import android.util.Log;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.gameFramework.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/b.class */
public class C0628b extends AbstractC0635i {

    /* renamed from: a */
    C0627a f4025a;

    /* renamed from: b */
    int f4026b;

    /* renamed from: c */
    final /* synthetic */ C0627a f4027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0628b(C0627a c0627a, String str, AbstractC0634h abstractC0634h) {
        super(str, abstractC0634h);
        this.f4027c = c0627a;
        this.f4026b = -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i
    /* renamed from: a */
    public void mo74a(float f, float f2, int i, int i2, float f3) {
        C0629c c0629c = (C0629c) this.f4027c.f4020c.m611a();
        if (c0629c == null) {
            return;
        }
        c0629c.f4029b = f;
        c0629c.f4030c = f2;
        c0629c.f4032e = i2;
        c0629c.f4033f = f3;
        c0629c.f4028a = this;
        boolean z = false;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (m1071A != null && m1071A.f6163bQ != null && m1071A.f6163bQ.androidNoSoundPrioritiesDebug) {
            z = true;
        }
        if (z) {
            c0629c.f4031d = 0;
        } else {
            this.f4027c.f4022e--;
            if (this.f4027c.f4022e <= 1) {
                this.f4027c.f4022e = 1000;
            }
            c0629c.f4031d = this.f4027c.f4022e;
        }
        this.f4027c.f4018a.offer(c0629c);
    }

    /* renamed from: b */
    public void m2709b(float f, float f2, int i, int i2, float f3) {
        if (this.f4026b == 0) {
            Log.m4933d("RustedWarfare", "Sound not loaded");
        } else {
            if (this.f4025a.f4024g.play(this.f4026b, f, f2, i, i2, f3) == 0) {
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i
    /* renamed from: a */
    public int mo75a() {
        return 0;
    }
}
