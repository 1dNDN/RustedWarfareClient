package com.corrodinggames.rts.gameFramework;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/au.class */
public class C0663au extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0648am f4223a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0663au(C0648am c0648am) {
        this.f4223a = c0648am;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        float f;
        while (true) {
            synchronized (this.f4223a.f4166c) {
                this.f4223a.f4170g = true;
                if (!this.f4223a.f4169f) {
                    try {
                        this.f4223a.f4166c.wait(C0648am.f4164a.mo92e());
                    } catch (InterruptedException e) {
                    }
                }
                this.f4223a.f4169f = false;
                f = this.f4223a.f4167d;
            }
            synchronized (this.f4223a.f4165b) {
                if (!this.f4223a.m2637b(f)) {
                    return;
                }
            }
        }
    }
}
