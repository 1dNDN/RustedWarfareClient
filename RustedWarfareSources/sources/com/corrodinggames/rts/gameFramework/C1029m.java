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
    final /* synthetic */ LoggerMaybe f6596c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1029m(LoggerMaybe loggerMaybe) {
        this.f6596c = loggerMaybe;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m816a() {
        float m973e = this.f6596c.m973e(this.f6594a);
        if (this.f6595b.m5481k() != m973e) {
            if (this.f6595b instanceof C0930ag) {
                ((C0930ag) this.f6595b).m897c(m973e);
            } else {
                this.f6595b.mo899b(m973e);
            }
        }
    }
}
