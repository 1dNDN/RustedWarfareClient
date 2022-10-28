package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0122n;
import com.corrodinggames.rts.game.C0187e;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
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
    public int f5768c;

    /* renamed from: d */
    public Socket f5769d;

    /* renamed from: e */
    InetAddress f5770e;

    /* renamed from: g */
    public long f5772g;

    /* renamed from: h */
    public boolean f5773h;

    /* renamed from: i */
    public boolean Connected;

    /* renamed from: j */
    public Steam f5775j;

    /* renamed from: l */
    Packet f5777l;

    /* renamed from: m */
    public String f5778m;

    /* renamed from: n */
    public String f5779n;

    /* renamed from: o */
    public String RelayId;

    /* renamed from: p */
    public boolean f5781p;

    /* renamed from: q */
    public boolean f5782q;

    /* renamed from: r */
    public boolean f5783r;

    /* renamed from: s */
    public boolean f5784s;

    /* renamed from: t */
    public boolean f5785t;

    /* renamed from: u */
    public boolean f5786u;

    /* renamed from: v */
    public boolean f5787v;

    /* renamed from: w */
    public boolean f5788w;

    /* renamed from: x */
    public int f5789x;

    /* renamed from: y */
    public int f5790y;

    /* renamed from: z */
    public C0187e f5791z;

    /* renamed from: F */
    RunnableC0869d f5797F;

    /* renamed from: G */
    RunnableC0870e f5798G;

    /* renamed from: H */
    Thread f5799H;

    /* renamed from: I */
    Thread f5800I;

    /* renamed from: L */
    public String f5803L;

    /* renamed from: M */
    public int f5804M;

    /* renamed from: N */
    public boolean f5805N;

    /* renamed from: O */
    public boolean f5806O;

    /* renamed from: P */
    public int f5807P;

    /* renamed from: Q */
    public boolean f5808Q;

    /* renamed from: R */
    public int f5809R;

    /* renamed from: S */
    public long f5810S;

    /* renamed from: T */
    public boolean f5811T;

    /* renamed from: U */
    volatile int f5812U;

    /* renamed from: V */
    volatile int f5813V;

    /* renamed from: a */
    volatile boolean f5766a = false;

    /* renamed from: b */
    volatile boolean f5767b = false;

    /* renamed from: f */
    ConcurrentLinkedQueue f5771f = new ConcurrentLinkedQueue();

    /* renamed from: k */
    public int f5776k = -1;

    /* renamed from: A */
    int f5792A = -1;

    /* renamed from: B */
    long f5793B = -1;

    /* renamed from: C */
    boolean f5794C = false;

    /* renamed from: D */
    boolean f5795D = false;

    /* renamed from: E */
    public int GameVersion = 999999;

    /* renamed from: J */
    boolean f5801J = false;

    /* renamed from: K */
    boolean f5802K = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m1356a(Steam steam, boolean z, boolean z2) {
        steam.m1353a(z, z2);
    }

    /* renamed from: a */
    static /* synthetic */ C0831ad m1357a(Steam steam) {
        return steam.f5765W;
    }

    public Steam(C0831ad c0831ad, Socket socket) {
        this.f5765W = c0831ad;
        this.f5769d = socket;
        synchronized (this.f5765W.f5609bg) {
            this.f5768c = this.f5765W.f5608bf;
            this.f5765W.f5608bf++;
        }
        this.f5804M = C0758f.m2203a(1, 1000000);
    }

    /* renamed from: a */
    public boolean m1359a() {
        if (this.f5810S < System.currentTimeMillis() - 10000) {
            this.f5810S = System.currentTimeMillis();
            this.f5809R = 0;
        }
        if (this.f5809R > 100) {
            if (!this.f5811T) {
                this.f5811T = true;
                LogDebug("Command limit was reached");
                return true;
            }
            return true;
        }
        this.f5809R++;
        return false;
    }

    /* renamed from: b */
    public int m1351b() {
        if (this.f5793B == -1) {
            return -2;
        }
        if (this.f5793B < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f5792A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m1349c() {
        C0187e c0187e = this.f5791z;
        if (c0187e != null) {
            return c0187e.f1306k;
        }
        return -1;
    }

    /* renamed from: d */
    public synchronized void m1347d() {
        this.f5798G = new RunnableC0870e(this);
        this.f5800I = new Thread(this.f5798G);
        this.f5800I.setDaemon(true);
        this.f5800I.start();
        this.f5797F = new RunnableC0869d(this, null);
        this.f5799H = new Thread(this.f5797F);
        this.f5799H.setDaemon(true);
        this.f5799H.start();
    }

    /* renamed from: i */
    private void m1341i() {
        C0187e c0187e;
        this.f5766a = true;
        if (this.f5765W.IsServer && !this.f5765W.m1472n() && (c0187e = this.f5791z) != null) {
            this.f5791z = null;
            if (this.f5765W.m1517d(c0187e) == null) {
                c0187e.m5113G();
                this.f5765W.m1632P();
                ActivityC0122n.m5601o();
            }
        }
        if (this.f5799H != null) {
            this.f5799H.interrupt();
        }
        this.f5765W.m1539b(this);
        this.f5781p = false;
        if (this.f5782q) {
            this.f5765W.m1524c(this, "Closing");
        }
    }

    /* renamed from: j */
    private synchronized void m1340j() {
        if (this.f5766a) {
            return;
        }
        this.f5767b = true;
        if (this.f5798G != null) {
            this.f5798G.m1338a();
        }
        if (this.f5799H != null) {
            this.f5799H.interrupt();
        }
        this.f5765W.m1539b(this);
    }

    /* renamed from: a */
    public void m1355a(String str) {
        StreamWriter streamWriter = new StreamWriter();
        if (str == null) {
            str = "NULL";
        }
        try {
            streamWriter.WriteUTF(str);
            m1358a(streamWriter.m1407b(111));
            m1340j();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m1353a(boolean z, boolean z2) {
        m1352a(z, z2, "Time out");
    }

    /* renamed from: e */
    public String m1345e() {
        String str = "<null>";
        if (this.f5791z != null) {
            str = this.f5791z.f1316u;
        }
        return str;
    }

    /* renamed from: f */
    public String m1344f() {
        InetAddress inetAddress;
        if (this.f5775j != null) {
            return this.f5779n;
        }
        try {
            Socket socket = this.f5769d;
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
    public String m1343g() {
        if (this.f5775j != null) {
            return this.f5779n == null ? "<forwarded unknown>" : this.f5779n;
        }
        String str = "<no socket>";
        try {
            Socket socket = this.f5769d;
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
    public synchronized void m1352a(boolean z, boolean z2, String str) {
        if (!this.f5766a) {
            LogDebug("handleRemoteDisconnect");
            String str2 = null;
            if (this.f5791z != null) {
                str2 = this.f5791z.f1316u;
            }
            String str3 = null;
            if (this.f5791z != null) {
                String str4 = "player";
                String str5 = VariableScope.nullOrMissingString;
                if (this.f5791z.m5074b()) {
                    str4 = "spectator";
                } else if (this.f5765W.f5539bm) {
                    str5 = this.f5791z.m5075a(false, false) == 0 ? " (Had no units)" : " (Team " + this.f5791z.m5025h() + ")";
                }
                str3 = str4 + " '" + this.f5791z.f1316u + "' disconnected" + str5;
            } else if (this.f5781p) {
                if (this.f5784s && this.f5782q) {
                    str3 = "relay server disconnected";
                } else {
                    str3 = "a player disconnected";
                }
            }
            if (!this.f5765W.IsServer) {
                str3 = "The server disconnected";
            }
            if (str3 != null && str != null) {
                str3 = str3 + "  (" + C0831ad.m1481i(str) + ")";
            }
            m1341i();
            if (str3 != null) {
                boolean z3 = false;
                if (this.f5791z != null && this.f5765W.IsServer && this.f5765W.m1517d(this.f5791z) != null) {
                    z3 = true;
                }
                if (!z3) {
                    if (!this.f5765W.IsServer) {
                        this.f5765W.m1499f(str3);
                    } else {
                        this.f5765W.m1479j(str3);
                    }
                } else {
                    LogDebug("Not sending: '" + str3 + "' still another active connection");
                }
            }
            this.f5765W.f5562d.mo404b(this, str2);
        } else {
            LogDebug("handleRemoteDisconnect: connection is already disconnecting");
        }
        if (!z2 && this.f5798G != null) {
            this.f5798G.m1338a();
        }
        if (z2) {
            this.f5801J = true;
        }
        if (z) {
            this.f5802K = true;
        }
        if (this.f5801J && this.f5802K) {
            try {
                this.f5769d.close();
            } catch (IOException e) {
                Core.m1041a("Error while closing network socket", (Throwable) e);
            }
            this.f5800I = null;
            this.f5799H = null;
            this.f5798G = null;
            this.f5797F = null;
            if (this.f5771f != null) {
                this.f5771f.clear();
            }
        }
    }

    /* renamed from: a */
    public void m1354a(String str, Throwable th) {
        Core.m1041a(m1346d(str), th);
    }

    /* renamed from: b */
    public void m1350b(String str) {
        Core.m998b(m1346d(str));
    }

    /* renamed from: c */
    public void LogDebug(String str) {
        Core.LogDebug2(m1346d(str));
    }

    /* renamed from: d */
    public String m1346d(String str) {
        C0187e c0187e;
        String str2 = "id:" + this.f5768c + ": " + str;
        if (this.f5791z != null) {
            str2 = str2 + " (Player:" + c0187e.f1316u + ")";
        }
        return str2;
    }

    /* renamed from: a */
    public void m1358a(Packet packet) {
        if (this.f5798G == null && this.f5766a) {
            return;
        }
        this.f5798G.m1337a(packet);
    }

    /* renamed from: h */
    public boolean m1342h() {
        return !this.f5766a;
    }

    public void finalize() {
        try {
            if (this.f5769d == null || this.f5769d.isClosed()) {
                return;
            }
            Core.LogDebug2("Connection::finalize called on unclosed socket (index:" + this.f5768c + ")");
            if (this.f5769d.getInetAddress() == null) {
                Core.LogDebug2("Skipping possible steam socket");
            }
            try {
                this.f5769d.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }
}
