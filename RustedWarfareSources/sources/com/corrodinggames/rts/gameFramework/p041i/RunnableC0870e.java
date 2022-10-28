package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.utility.C1115w;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/e.class */
public final class RunnableC0870e implements Runnable {

    /* renamed from: b */
    OutputStream f5816b;

    /* renamed from: c */
    BufferedOutputStream f5817c;

    /* renamed from: d */
    DataOutputStream f5818d;

    /* renamed from: f */
    final /* synthetic */ C0867c f5819f;

    /* renamed from: a */
    Boolean f5820a = true;

    /* renamed from: e */
    C1115w f5821e = new C1115w();

    /* renamed from: a */
    public synchronized void m1323a(Packet packet) {
        if (this.f5819f.f5766a) {
            return;
        }
        this.f5819f.f5771f.add(packet);
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void m1324a() {
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void m1322b() {
        try {
            if (this.f5819f.f5771f.isEmpty() && !this.f5819f.f5766a && !this.f5819f.f5767b) {
                wait(10000L);
            }
        } catch (InterruptedException e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0870e(C0867c c0867c) {
        this.f5819f = c0867c;
        this.f5816b = c0867c.f5769d.getOutputStream();
        this.f5817c = new BufferedOutputStream(this.f5816b);
        this.f5818d = new DataOutputStream(this.f5817c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
        r6.f5819f.f5766a = true;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p041i.RunnableC0870e.run():void");
    }
}
