package com.corrodinggames.rts.gameFramework.utility;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/aj.class */
public class C1081aj {

    /* renamed from: a */
    ConcurrentLinkedQueue f6852a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public void m570a(Runnable runnable) {
        this.f6852a.add(runnable);
    }

    /* renamed from: a */
    public void m571a() {
        while (true) {
            Runnable runnable = (Runnable) this.f6852a.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }
}
