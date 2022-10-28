package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0122n;
import com.corrodinggames.rts.game.C0187e;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.i.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/c.class */
public class Steam {

    /* renamed from: W */
    private final C0831ad f5765W;

    /* renamed from: c */
    public int f5766c;

    /* renamed from: d */
    public Socket f5767d;

    /* renamed from: e */
    InetAddress f5768e;

    /* renamed from: g */
    public long f5769g;

    /* renamed from: h */
    public boolean f5770h;

    /* renamed from: i */
    public boolean Connected;

    /* renamed from: j */
    public Steam f5772j;

    /* renamed from: l */
    Packet f5773l;

    /* renamed from: m */
    public String f5774m;

    /* renamed from: n */
    public String f5775n;

    /* renamed from: o */
    public String RelayId;

    /* renamed from: p */
    public boolean f5777p;

    /* renamed from: q */
    public boolean f5778q;

    /* renamed from: r */
    public boolean f5779r;

    /* renamed from: s */
    public boolean f5780s;

    /* renamed from: t */
    public boolean f5781t;

    /* renamed from: u */
    public boolean f5782u;

    /* renamed from: v */
    public boolean f5783v;

    /* renamed from: w */
    public boolean f5784w;

    /* renamed from: x */
    public int f5785x;

    /* renamed from: y */
    public int f5786y;

    /* renamed from: z */
    public C0187e f5787z;

    /* renamed from: F */
    RunnableC0869d f5788F;

    /* renamed from: G */
    RunnableC0870e f5789G;

    /* renamed from: H */
    Thread f5790H;

    /* renamed from: I */
    Thread f5791I;

    /* renamed from: L */
    public String f5792L;

    /* renamed from: M */
    public int f5793M;

    /* renamed from: N */
    public boolean f5794N;

    /* renamed from: O */
    public boolean f5795O;

    /* renamed from: P */
    public int f5796P;

    /* renamed from: Q */
    public boolean f5797Q;

    /* renamed from: R */
    public int f5798R;

    /* renamed from: S */
    public long f5799S;

    /* renamed from: T */
    public boolean f5800T;

    /* renamed from: U */
    volatile int f5801U;

    /* renamed from: V */
    volatile int f5802V;

    /* renamed from: a */
    volatile boolean f5803a = false;

    /* renamed from: b */
    volatile boolean f5804b = false;

    /* renamed from: f */
    ConcurrentLinkedQueue f5805f = new ConcurrentLinkedQueue();

    /* renamed from: k */
    public int f5806k = -1;

    /* renamed from: A */
    int f5807A = -1;

    /* renamed from: B */
    long f5808B = -1;

    /* renamed from: C */
    boolean f5809C = false;

    /* renamed from: D */
    boolean f5810D = false;

    /* renamed from: E */
    public int GameVersion = 999999;

    /* renamed from: J */
    boolean f5812J = false;

    /* renamed from: K */
    boolean f5813K = false;

    public Steam(C0831ad c0831ad, Socket socket) {
        this.f5765W = c0831ad;
        this.f5767d = socket;
        synchronized (this.f5765W.f5609bg) {
            this.f5766c = this.f5765W.f5608bf;
            this.f5765W.f5608bf++;
        }
        this.f5793M = C0758f.m2153a(1, 1000000);
    }

    /* renamed from: a */
    public boolean m1344a() {
        if (this.f5799S < System.currentTimeMillis() - 10000) {
            this.f5799S = System.currentTimeMillis();
            this.f5798R = 0;
        }
        if (this.f5798R > 100) {
            if (!this.f5800T) {
                this.f5800T = true;
                LogDebug("Command limit was reached");
                return true;
            }
            return true;
        }
        this.f5798R++;
        return false;
    }

    /* renamed from: b */
    public int m1336b() {
        if (this.f5808B == -1) {
            return -2;
        }
        if (this.f5808B < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f5807A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m1334c() {
        C0187e c0187e = this.f5787z;
        if (c0187e != null) {
            return c0187e.f1306k;
        }
        return -1;
    }

    /* renamed from: d */
    public synchronized void m1332d() {
        this.f5789G = new RunnableC0870e(this);
        this.f5791I = new Thread(this.f5789G);
        this.f5791I.setDaemon(true);
        this.f5791I.start();
        this.f5788F = new RunnableC0869d(this);
        this.f5790H = new Thread(this.f5788F);
        this.f5790H.setDaemon(true);
        this.f5790H.start();
    }

    /* renamed from: i */
    private void m1326i() {
        C0187e c0187e;
        this.f5803a = true;
        if (this.f5765W.IsServer && !this.f5765W.m1430n() && (c0187e = this.f5787z) != null) {
            this.f5787z = null;
            if (this.f5765W.m1475d(c0187e) == null) {
                c0187e.m4658G();
                this.f5765W.m1590P();
                ActivityC0122n.m5091o();
            }
        }
        if (this.f5790H != null) {
            this.f5790H.interrupt();
        }
        this.f5765W.m1497b(this);
        this.f5777p = false;
        if (this.f5778q) {
            this.f5765W.m1482c(this, "Closing");
        }
    }

    /* renamed from: j */
    private synchronized void m1325j() {
        if (this.f5803a) {
            return;
        }
        this.f5804b = true;
        if (this.f5789G != null) {
            this.f5789G.m1323a();
        }
        if (this.f5790H != null) {
            this.f5790H.interrupt();
        }
        this.f5765W.m1497b(this);
    }

    /* renamed from: a */
    public void m1340a(String str) {
        StreamWriter streamWriter = new StreamWriter();
        if (str == null) {
            str = "NULL";
        }
        try {
            streamWriter.WriteUTF(str);
            m1343a(streamWriter.mo1360b(111));
            m1325j();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m1338a(boolean z, boolean z2) {
        m1337a(z, z2, "Time out");
    }

    /* renamed from: e */
    public String m1330e() {
        String str = "<null>";
        if (this.f5787z != null) {
            str = this.f5787z.f1316u;
        }
        return str;
    }

    /* renamed from: f */
    public String m1329f() {
        InetAddress inetAddress;
        if (this.f5772j != null) {
            return this.f5775n;
        }
        try {
            Socket socket = this.f5767d;
            if (socket != null && (inetAddress = socket.getInetAddress()) != null) {
                return inetAddress.getHostAddress();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public String m1328g() {
        if (this.f5772j != null) {
            return this.f5775n == null ? "<forwarded unknown>" : this.f5775n;
        }
        String str = "<no socket>";
        try {
            Socket socket = this.f5767d;
            if (socket != null) {
                str = "<no bond socket>";
                InetAddress inetAddress = socket.getInetAddress();
                if (inetAddress != null) {
                    str = inetAddress.getHostAddress();
                }
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "<socket error>";
        }
    }

    /* renamed from: a */
    public synchronized void m1337a(boolean z, boolean z2, String str) {
        if (!this.f5803a) {
            LogDebug("handleRemoteDisconnect");
            String str2 = null;
            if (this.f5787z != null) {
                str2 = this.f5787z.f1316u;
            }
            String str3 = null;
            if (this.f5787z != null) {
                String str4 = "player";
                String str5 = VariableScope.nullOrMissingString;
                if (this.f5787z.m4619b()) {
                    str4 = "spectator";
                } else if (this.f5765W.f5539bm) {
                    str5 = this.f5787z.m4620a(false, false) == 0 ? " (Had no units)" : " (Team " + this.f5787z.m4570h() + ")";
                }
                str3 = str4 + " '" + this.f5787z.f1316u + "' disconnected" + str5;
            } else if (this.f5777p) {
                if (this.f5780s && this.f5778q) {
                    str3 = "relay server disconnected";
                } else {
                    str3 = "a player disconnected";
                }
            }
            if (!this.f5765W.IsServer) {
                str3 = "The server disconnected";
            }
            if (str3 != null && str != null) {
                str3 = str3 + "  (" + C0831ad.m1439i(str) + ")";
            }
            m1326i();
            if (str3 != null) {
                boolean z3 = false;
                if (this.f5787z != null && this.f5765W.IsServer && this.f5765W.m1475d(this.f5787z) != null) {
                    z3 = true;
                }
                if (!z3) {
                    if (!this.f5765W.IsServer) {
                        this.f5765W.m1457f(str3);
                    } else {
                        this.f5765W.m1437j(str3);
                    }
                } else {
                    LogDebug("Not sending: '" + str3 + "' still another active connection");
                }
            }
            this.f5765W.f5562d.mo404b(this, str2);
        } else {
            LogDebug("handleRemoteDisconnect: connection is already disconnecting");
        }
        if (!z2 && this.f5789G != null) {
            this.f5789G.m1323a();
        }
        if (z2) {
            this.f5812J = true;
        }
        if (z) {
            this.f5813K = true;
        }
        if (this.f5812J && this.f5813K) {
            try {
                this.f5767d.close();
            } catch (IOException e) {
                LoggerMaybe.m1026a("Error while closing network socket", (Throwable) e);
            }
            this.f5791I = null;
            this.f5790H = null;
            this.f5789G = null;
            this.f5788F = null;
            if (this.f5805f != null) {
                this.f5805f.clear();
            }
        }
    }

    /* renamed from: a */
    public void m1339a(String str, Throwable th) {
        LoggerMaybe.m1026a(m1331d(str), th);
    }

    /* renamed from: b */
    public void m1335b(String str) {
        LoggerMaybe.m983b(m1331d(str));
    }

    /* renamed from: c */
    public void LogDebug(String str) {
        LoggerMaybe.LogDebug2(m1331d(str));
    }

    /* renamed from: d */
    public String m1331d(String str) {
        C0187e c0187e;
        String str2 = "id:" + this.f5766c + ": " + str;
        if (this.f5787z != null) {
            str2 = str2 + " (Player:" + c0187e.f1316u + ")";
        }
        return str2;
    }

    /* renamed from: a */
    public void m1343a(Packet packet) {
        if (this.f5789G == null && this.f5803a) {
            return;
        }
        this.f5789G.m1322a(packet);
    }

    /* renamed from: h */
    public boolean m1327h() {
        return !this.f5803a;
    }

    public void finalize() {
        try {
            if (this.f5767d == null || this.f5767d.isClosed()) {
                return;
            }
            LoggerMaybe.LogDebug2("Connection::finalize called on unclosed socket (index:" + this.f5766c + ")");
            if (this.f5767d.getInetAddress() == null) {
                LoggerMaybe.LogDebug2("Skipping possible steam socket");
            }
            try {
                this.f5767d.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }
}
