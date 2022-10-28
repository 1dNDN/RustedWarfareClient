package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p001a.AbstractC0012c;
import p000a.p001a.C0010b;

/* renamed from: com.corrodinggames.rts.gameFramework.i.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/an.class */
public class RunnableC0854an implements Runnable {

    /* renamed from: b */
    public static boolean f5694b = true;

    /* renamed from: r */
    private final C0831ad f5695r;

    /* renamed from: d */
    ServerSocket f5697d;

    /* renamed from: e */
    int f5698e;

    /* renamed from: f */
    boolean f5699f;

    /* renamed from: o */
    boolean f5708o;

    /* renamed from: p */
    boolean f5709p;

    /* renamed from: q */
    boolean f5710q;

    /* renamed from: a */
    public final boolean f5693a = false;

    /* renamed from: c */
    volatile boolean f5696c = true;

    /* renamed from: g */
    long f5700g = -1;

    /* renamed from: h */
    final boolean f5701h = false;

    /* renamed from: i */
    final boolean f5702i = true;

    /* renamed from: j */
    final Object f5703j = new Object();

    /* renamed from: k */
    ArrayList f5704k = new ArrayList();

    /* renamed from: l */
    final Object f5705l = new Object();

    /* renamed from: m */
    int f5706m = 0;

    /* renamed from: n */
    int f5707n = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0854an(C0831ad c0831ad) {
        this.f5695r = c0831ad;
    }

    /* renamed from: a */
    public boolean m1398a(InetAddress inetAddress, boolean z) {
        if (inetAddress == null) {
            LoggerMaybe.LogDebug2("isIpAllowed: inetAddress==null");
            return true;
        } else if (!f5694b) {
            return true;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f5700g + 60000) {
                this.f5700g = currentTimeMillis;
                synchronized (this.f5705l) {
                    this.f5704k.clear();
                }
                this.f5706m = 0;
                this.f5707n = 0;
                this.f5708o = false;
                this.f5709p = false;
                this.f5710q = false;
            }
            synchronized (this.f5705l) {
                boolean z2 = false;
                Iterator it = this.f5704k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0856ao c0856ao = (C0856ao) it.next();
                    if (inetAddress.equals(c0856ao.f5712a)) {
                        c0856ao.f5713b++;
                        int i = 30;
                        if (this.f5707n > 100) {
                            i = 10;
                        }
                        if (this.f5707n > 250) {
                            i = 5;
                        }
                        if (c0856ao.f5713b > i) {
                            if (!c0856ao.f5714c) {
                                c0856ao.f5714c = true;
                                LoggerMaybe.LogDebug2("DOS: Too many attempts:" + c0856ao.f5713b + " ip:" + inetAddress.toString());
                            }
                            if (c0856ao.f5713b > 300 && !c0856ao.f5715d) {
                                c0856ao.f5715d = true;
                                LoggerMaybe.LogDebug2("DOS: Excessive attempts:" + c0856ao.f5713b + " ip:" + inetAddress.toString());
                            }
                            return false;
                        }
                        z2 = true;
                    }
                }
                if (!z2) {
                    if (z) {
                        this.f5706m++;
                    }
                    if (this.f5704k.size() > 200) {
                        C0856ao c0856ao2 = null;
                        Iterator it2 = this.f5704k.iterator();
                        while (it2.hasNext()) {
                            C0856ao c0856ao3 = (C0856ao) it2.next();
                            if (c0856ao2 == null || c0856ao2.f5713b > c0856ao3.f5713b) {
                                c0856ao2 = c0856ao3;
                            }
                        }
                        if (c0856ao2 != null) {
                            this.f5704k.remove(c0856ao2);
                        }
                    }
                    C0856ao c0856ao4 = new C0856ao(this);
                    c0856ao4.f5712a = inetAddress;
                    this.f5704k.add(c0856ao4);
                }
                if (this.f5706m > 500) {
                    if (!this.f5709p) {
                        this.f5709p = true;
                        LoggerMaybe.LogDebug2("DOS: Too many unique attempts: " + this.f5706m + ". udp:" + this.f5699f);
                        return false;
                    }
                    return false;
                }
                int i2 = 0;
                int i3 = 0;
                Iterator it3 = this.f5695r.f5606bc.iterator();
                while (it3.hasNext()) {
                    Steam steam = (Steam) it3.next();
                    i3++;
                    if (steam.f5770e != null && inetAddress.equals(steam.f5770e)) {
                        i2++;
                    }
                }
                int i4 = 20;
                if (i3 > 150) {
                    i4 = 10;
                }
                if (i3 > 200) {
                    i4 = 5;
                }
                if (i2 > i4) {
                    if (!this.f5710q) {
                        this.f5710q = true;
                        LoggerMaybe.LogDebug2("DOS: Too open connections from same ip:" + inetAddress.toString() + " (count:" + i2 + ") max:" + i4);
                        return false;
                    }
                    return false;
                } else if (i3 > 300) {
                    if (!this.f5708o) {
                        this.f5708o = true;
                        LoggerMaybe.LogDebug2("DOS: Too open connections locking down:" + inetAddress.toString() + " (count:" + i3 + ")");
                        return false;
                    }
                    return false;
                } else {
                    this.f5707n++;
                    return true;
                }
            }
        }
    }

    /* renamed from: a */
    public void m1399a() {
        this.f5695r.LogError("Recreating server socket " + (this.f5699f ? "udp" : "tcp"));
        synchronized (this.f5703j) {
            if (this.f5697d != null) {
                try {
                    this.f5697d.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f5697d = null;
            }
            if (!this.f5696c) {
                throw new IOException("recreate on non-active socket");
            }
            m1397a(this.f5699f);
        }
    }

    /* renamed from: a */
    public void m1397a(boolean z) {
        this.f5698e = this.f5695r.socketPort;
        this.f5695r.LogError("starting socket.. " + (z ? "udp" : "tcp") + " port: " + this.f5698e);
        this.f5699f = z;
        if (!z) {
            this.f5697d = new ServerSocket(this.f5698e);
            return;
        }
        C0010b c0010b = new C0010b(this.f5695r.socketPort, 0, null, true);
        c0010b.m5717a(new C08551());
        this.f5697d = c0010b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.i.an$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/an$1.class */
    public class C08551 extends AbstractC0012c {
        C08551() {
        }

        /* renamed from: a */
        public boolean mo5708a(SocketAddress socketAddress) {
            if (socketAddress instanceof InetSocketAddress) {
                return RunnableC0854an.this.m1398a(((InetSocketAddress) socketAddress).getAddress(), false);
            }
            LoggerMaybe.LogDebug2("AcceptFilter: Unhandled SocketAddress type:" + socketAddress.getClass().getName());
            return true;
        }
    }

    public void run() {
        LoggerMaybe.m1007ap();
        Thread.currentThread().setName("NewConnectionWorker-" + (this.f5699f ? "udp" : "tcp") + " - " + this.f5698e);
        int i = 0;
        int i2 = 0;
        this.f5695r.LogError("reading..");
        while (this.f5696c) {
            try {
                Socket accept = this.f5697d.accept();
                try {
                    accept.setTcpNoDelay(true);
                    accept.setSoTimeout(15000);
                    String str = "<unknown>";
                    InetAddress inetAddress = accept.getInetAddress();
                    if (inetAddress != null) {
                        str = inetAddress.getHostAddress();
                    }
                    if (!m1398a(inetAddress, true)) {
                        accept.close();
                    } else {
                        Steam steam = new Steam(this.f5695r, accept);
                        String str2 = "Accepted new connection id:" + steam.f5768c + ".. (ip:" + str + ")";
                        if (this.f5699f) {
                            str2 = str2 + " (udp)";
                        }
                        this.f5695r.LogError(str2);
                        steam.f5773h = this.f5699f;
                        steam.f5770e = inetAddress;
                        steam.m1334d();
                        this.f5695r.f5606bc.add(steam);
                    }
                } catch (IOException e) {
                    LoggerMaybe.LogDebug2("Got IOException on new player connection");
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                if (this.f5696c) {
                    LoggerMaybe m1079A = LoggerMaybe.m1079A();
                    i++;
                    LoggerMaybe.LogDebug2("ServerSocket-accept(" + (this.f5699f ? "udp" : "tcp") + ") failed: " + e2.getMessage() + " (closed:" + this.f5697d.isClosed() + ")");
                    if (i > 100) {
                        LoggerMaybe.LogDebug2("Too many server socket fails");
                        m1396b();
                        return;
                    }
                    try {
                        m1399a();
                        if (i2 < 3 && m1079A.f6122bX.m1603C() > 0) {
                            String str3 = "Warning: server socket got closed and needed to be recreated, players were likely disconnected (but can rejoin).";
                            if (LoggerMaybe.f6210aZ) {
                                str3 = str3 + "\n This likely due to iOS removing sockets of background apps. Avoid minimising the game when hosting.";
                            }
                            LoggerMaybe.m1079A().m961i(str3);
                            i2++;
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        LoggerMaybe.m1079A().m961i("Warning server socket got closed and could not be recreated");
                        m1396b();
                        return;
                    }
                } else {
                    LoggerMaybe.LogDebug2("ServerSocket-accept(" + (this.f5699f ? "udp" : "tcp") + "): Got expected IOException after closed socket");
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void m1396b() {
        synchronized (this.f5703j) {
            this.f5696c = false;
            if (this.f5697d != null) {
                try {
                    this.f5697d.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f5697d = null;
            }
        }
    }
}
