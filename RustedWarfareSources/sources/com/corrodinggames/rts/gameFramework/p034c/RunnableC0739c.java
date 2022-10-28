package com.corrodinggames.rts.gameFramework.p034c;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.c.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c/c.class */
public class RunnableC0739c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RunnableC0737a f4637a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0739c(RunnableC0737a runnableC0737a) {
        this.f4637a = runnableC0737a;
    }

    public void run() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (this.f4637a.f4630f) {
            this.f4637a.f4630f = false;
            return;
        }
        if (RunnableC0737a.f4627c) {
            if (m1079A.f6110bL == null) {
                return;
            }
            m1079A.f6112bN.f4200F = true;
            if (!m1079A.f6112bN.m2652j()) {
                RunnableC0737a.f4629e += 1.0f;
            }
            if (RunnableC0737a.f4629e > 5.0f) {
                RunnableC0737a.f4629e = 0.0f;
                System.gc();
                System.gc();
                m1079A.f6112bN.m2657e();
            }
        }
        if (RunnableC0737a.f4628d && m1079A.f6110bL != null) {
            m1079A.f6110bL.m4901g();
        }
    }
}
