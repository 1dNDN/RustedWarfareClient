package com.corrodinggames.rts.gameFramework;

import android.os.Process;

/* renamed from: com.corrodinggames.rts.gameFramework.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/z.class */
public class C1123z extends Thread {

    /* renamed from: a */
    static int f6967a = 0;

    /* renamed from: b */
    public boolean f6968b;

    /* renamed from: c */
    long f6969c;

    /* renamed from: a */
    public synchronized void m415a(boolean z) {
        this.f6968b = z;
    }

    public C1123z() {
        super("GameThread" + f6967a);
        this.f6968b = true;
        f6967a++;
    }

    public void run() {
        long j;
        Core.m1015ap();
        if (!Core.f6205aU) {
            Process.setThreadPriority(-4);
        }
        m416a();
        long j2 = this.f6969c;
        Core m1087A = Core.m1087A();
        while (this.f6968b) {
            long nanoTime = System.nanoTime();
            long j3 = this.f6969c;
            m416a();
            m1087A.m1058a(((float) (this.f6969c - j3)) * 0.060000002f, (int) (this.f6969c - j3));
            if (!m1087A.settingEngine.batterySaving) {
            }
            if (m1087A.settingEngine.batterySaving) {
                j = 32258064;
            } else if (m1087A.settingEngine.highRefreshRate) {
                j = 3333333;
            } else {
                j = 16393442;
            }
            long round = Math.round((float) (j - (System.nanoTime() - nanoTime)));
            if (round > 0) {
                long nanoTime2 = System.nanoTime();
                while (true) {
                    long nanoTime3 = System.nanoTime() - nanoTime2;
                    if (nanoTime3 <= round && nanoTime3 >= 0) {
                        long j4 = (long) ((round - nanoTime3) / 1000000.0d);
                        if (j4 > 1) {
                            try {
                                Thread.sleep(j4);
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m416a() {
        this.f6969c = System.currentTimeMillis();
    }
}
