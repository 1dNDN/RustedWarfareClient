package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.IOException;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.gameFramework.i.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/am.class */
public class RunnableC0853am implements Runnable {

    /* renamed from: a */
    String f5685a;

    /* renamed from: b */
    boolean f5686b;

    /* renamed from: c */
    boolean f5687c;

    /* renamed from: d */
    Thread f5688d;

    /* renamed from: e */
    public String f5689e;

    /* renamed from: f */
    Runnable f5690f;

    /* renamed from: g */
    public Socket f5691g;

    /* renamed from: h */
    boolean f5692h = false;

    public RunnableC0853am(String str, boolean z, Runnable runnable) {
        this.f5685a = str;
        this.f5686b = z;
        this.f5690f = runnable;
    }

    /* renamed from: a */
    public boolean m1401a() {
        if (!this.f5687c) {
            return false;
        }
        this.f5692h = true;
        return true;
    }

    /* renamed from: b */
    public void m1400b() {
        this.f5687c = true;
        this.f5688d = new Thread(this);
        this.f5688d.start();
    }

    public void run() {
        try {
            try {
                this.f5691g = C0831ad.m1491b(this.f5685a, this.f5686b);
                this.f5687c = false;
                if (!this.f5692h) {
                    this.f5690f.run();
                } else if (this.f5691g != null) {
                    try {
                        this.f5691g.close();
                        this.f5691g = null;
                        this.f5689e = "cancelled";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (C0844ag e2) {
                LoggerMaybe.LogDebug2("Cancelled connectSocketToServer");
                this.f5689e = "CANCELLED";
                this.f5687c = false;
                if (!this.f5692h) {
                    this.f5690f.run();
                } else if (this.f5691g != null) {
                    try {
                        this.f5691g.close();
                        this.f5691g = null;
                        this.f5689e = "cancelled";
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (IOException e4) {
                this.f5689e = e4.getMessage();
                e4.printStackTrace();
                this.f5687c = false;
                if (!this.f5692h) {
                    this.f5690f.run();
                } else if (this.f5691g != null) {
                    try {
                        this.f5691g.close();
                        this.f5691g = null;
                        this.f5689e = "cancelled";
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            this.f5687c = false;
            if (!this.f5692h) {
                this.f5690f.run();
            } else if (this.f5691g != null) {
                try {
                    this.f5691g.close();
                    this.f5691g = null;
                    this.f5689e = "cancelled";
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }
}
