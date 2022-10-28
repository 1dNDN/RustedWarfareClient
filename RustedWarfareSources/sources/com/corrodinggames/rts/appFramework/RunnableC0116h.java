package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.appFramework.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/h.class */
public class RunnableC0116h implements Runnable {

    /* renamed from: a */
    public String f472a;

    /* renamed from: b */
    final /* synthetic */ ActivityC0097g f473b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0116h(ActivityC0097g activityC0097g) {
        this.f473b = activityC0097g;
    }

    public void run() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.m1069K();
        m1079A.f6125ca.m424b(this.f472a, false);
        m1079A.m1071I();
        if (this.f473b.f441e != null && this.f473b.f441e.isShowing()) {
            this.f473b.m5613b(0);
        }
    }
}
