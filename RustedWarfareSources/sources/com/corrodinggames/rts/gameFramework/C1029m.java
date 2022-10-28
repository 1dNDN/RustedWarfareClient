package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m.class */
public class C1029m {

    /* renamed from: a */
    float f6594a;

    /* renamed from: b */
    Paint f6595b;

    /* renamed from: c */
    final /* synthetic */ Core f6596c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1029m(Core core) {
        this.f6596c = core;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m824a() {
        float m981e = this.f6596c.m981e(this.f6594a);
        if (this.f6595b.m5888k() != m981e) {
            if (this.f6595b instanceof C0930ag) {
                ((C0930ag) this.f6595b).m904c(m981e);
            } else {
                this.f6595b.mo5909b(m981e);
            }
        }
    }
}
