package com.corrodinggames.rts.gameFramework.p030a;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.gameFramework.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/d.class */
public class C0630d extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0627a f4034a;

    public C0630d(C0627a c0627a) {
        this.f4034a = c0627a;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        while (true) {
            try {
                C0629c c0629c = (C0629c) this.f4034a.f4018a.take();
                c0629c.m2708a();
                this.f4034a.f4020c.m610a(c0629c);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
