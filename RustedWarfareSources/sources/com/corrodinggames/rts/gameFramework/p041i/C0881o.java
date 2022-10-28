package com.corrodinggames.rts.gameFramework.p041i;

import java.util.TimerTask;

/* renamed from: com.corrodinggames.rts.gameFramework.i.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/o.class */
class C0881o extends TimerTask {

    /* renamed from: a */
    int f5884a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0881o(int i) {
        this.f5884a = i;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        C0879n.m1258a(this.f5884a, -1);
    }
}
