package com.corrodinggames.rts.gameFramework.p041i;

import java.io.IOException;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/au.class */
public class C0862au extends TimerTask {

    /* renamed from: c */
    private final C0831ad f5745c;

    /* renamed from: a */
    public boolean f5746a = true;

    /* renamed from: b */
    public long f5747b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0862au(C0831ad c0831ad) {
        this.f5745c = c0831ad;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f5745c.f5522aK != 0 && (currentTimeMillis > this.f5745c.f5522aK + 5 || currentTimeMillis < this.f5745c.f5522aK)) {
                this.f5745c.f5522aK = 0L;
                this.f5745c.m1587Q();
            }
            if (currentTimeMillis > this.f5747b + 1000 || currentTimeMillis < this.f5747b) {
                this.f5747b = currentTimeMillis;
                if (this.f5746a) {
                    StreamWriter streamWriter = new StreamWriter();
                    streamWriter.mo1373a(System.currentTimeMillis());
                    streamWriter.mo1355c(0);
                    this.f5745c.m1451g(streamWriter.mo1360b(108));
                } else {
                    this.f5745c.m1588P();
                }
                this.f5746a = !this.f5746a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
