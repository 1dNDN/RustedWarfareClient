package com.corrodinggames.rts.gameFramework.p041i;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.appFramework.ActivityC0088a;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.ActivityC0122n;
import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0187e;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0401bb;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p024d.C0489e;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0765c;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0767e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import p000a.p001a.C0017h;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ad.class */
public final class C0831ad {

    /* renamed from: f */
    ArrayList f5475f;

    /* renamed from: g */
    public boolean f5476g;

    /* renamed from: i */
    public boolean f5477i;

    /* renamed from: j */
    public float f5478j;

    /* renamed from: k */
    public float f5479k;

    /* renamed from: m */
    public int socketPort;

    /* renamed from: n */
    public String f5481n;

    /* renamed from: o */
    public boolean f5482o;

    /* renamed from: p */
    public boolean f5483p;

    /* renamed from: q */
    public boolean f5484q;

    /* renamed from: s */
    public boolean f5485s;

    /* renamed from: u */
    public String f5486u;

    /* renamed from: y */
    public String f5487y;

    /* renamed from: bT */
    private boolean f5488bT;

    /* renamed from: z */
    public AbstractC0197n f5489z;

    /* renamed from: A */
    public boolean f5490A;

    /* renamed from: C */
    public boolean IsServer;

    /* renamed from: D */
    public boolean f5492D;

    /* renamed from: E */
    public String f5493E;

    /* renamed from: G */
    public boolean f5494G;

    /* renamed from: H */
    public boolean f5495H;

    /* renamed from: K */
    public Float f5496K;

    /* renamed from: L */
    public String f5497L;

    /* renamed from: N */
    public boolean f5498N;

    /* renamed from: O */
    public int f5499O;

    /* renamed from: P */
    public int f5500P;

    /* renamed from: Q */
    public int f5501Q;

    /* renamed from: R */
    public int f5502R;

    /* renamed from: S */
    public String ServerUUID;

    /* renamed from: Y */
    public boolean f5504Y;

    /* renamed from: Z */
    public float f5505Z;

    /* renamed from: aa */
    boolean f5506aa;

    /* renamed from: ab */
    public float f5507ab;

    /* renamed from: ac */
    public float f5508ac;

    /* renamed from: ad */
    public boolean f5509ad;

    /* renamed from: ae */
    public float f5510ae;

    /* renamed from: af */
    public boolean f5511af;

    /* renamed from: ag */
    public boolean f5512ag;

    /* renamed from: aj */
    public boolean f5513aj;

    /* renamed from: ak */
    public boolean f5514ak;

    /* renamed from: al */
    public boolean f5515al;

    /* renamed from: am */
    public long f5516am;

    /* renamed from: aD */
    public boolean f5517aD;

    /* renamed from: aF */
    public int f5518aF;

    /* renamed from: aG */
    public int f5519aG;

    /* renamed from: aH */
    public int f5520aH;

    /* renamed from: aI */
    public static boolean f5521aI;

    /* renamed from: aK */
    long f5522aK;

    /* renamed from: aL */
    public boolean f5523aL;

    /* renamed from: aQ */
    public Reader f5524aQ;

    /* renamed from: aR */
    public Reader f5525aR;

    /* renamed from: aT */
    Thread f5526aT;

    /* renamed from: aU */
    RunnableC0854an f5527aU;

    /* renamed from: aV */
    Thread f5528aV;

    /* renamed from: aW */
    RunnableC0854an f5529aW;

    /* renamed from: aX */
    Timer f5530aX;

    /* renamed from: aY */
    C0862au f5531aY;

    /* renamed from: aZ */
    Thread f5532aZ;

    /* renamed from: ba */
    RunnableC0842af f5533ba;

    /* renamed from: be */
    boolean f5534be;

    /* renamed from: bi */
    String f5535bi;

    /* renamed from: bj */
    public String f5536bj;

    /* renamed from: bk */
    public Boolean f5537bk;

    /* renamed from: bl */
    public Boolean f5538bl;

    /* renamed from: bm */
    public boolean f5539bm;

    /* renamed from: bq */
    public float f5540bq;

    /* renamed from: br */
    public boolean f5541br;

    /* renamed from: bs */
    public boolean f5542bs;

    /* renamed from: bt */
    public boolean f5543bt;

    /* renamed from: bu */
    public boolean f5544bu;

    /* renamed from: bv */
    public boolean f5545bv;

    /* renamed from: bw */
    public String f5546bw;

    /* renamed from: bz */
    public C0187e f5547bz;

    /* renamed from: bA */
    public C0187e f5548bA;

    /* renamed from: bD */
    float f5549bD;

    /* renamed from: bE */
    float f5550bE;

    /* renamed from: bF */
    int f5551bF;

    /* renamed from: bG */
    int f5552bG;

    /* renamed from: bL */
    public boolean f5553bL;

    /* renamed from: bO */
    static ArrayList f5554bO;

    /* renamed from: bQ */
    Timer f5555bQ;

    /* renamed from: bS */
    RunnableC0853am f5556bS;

    /* renamed from: a */
    public static final boolean f5557a = false;

    /* renamed from: b */
    public static boolean f5558b = true;

    /* renamed from: c */
    public static boolean f5559c = false;

    /* renamed from: r */
    public static boolean f5560r = true;

    /* renamed from: bR */
    public static C0841ae f5561bR = new C0841ae();

    /* renamed from: d */
    public C0830ac f5562d = new C0830ac();

    /* renamed from: h */
    public int f5563h = 25;

    /* renamed from: l */
    public boolean f5564l = false;

    /* renamed from: t */
    public int f5565t = 5005;

    /* renamed from: v */
    public boolean f5566v = false;

    /* renamed from: w */
    public long f5567w = 1;

    /* renamed from: x */
    public boolean f5568x = false;

    /* renamed from: bU */
    private boolean f5569bU = false;

    /* renamed from: B */
    public volatile boolean lock1 = false;

    /* renamed from: F */
    public boolean f5571F = false;

    /* renamed from: I */
    public int f5572I = 0;

    /* renamed from: bV */
    private volatile float f5573bV = 1.0f;

    /* renamed from: J */
    public volatile float f5574J = 1.0f;

    /* renamed from: M */
    public ArrayList f5575M = new ArrayList();

    /* renamed from: T */
    public int RemoteServerKey = -1;

    /* renamed from: U */
    public int f5577U = -1;

    /* renamed from: V */
    public int f5578V = -1;

    /* renamed from: W */
    public int ServerKey = C0758f.m2203a(1, 9000000);

    /* renamed from: X */
    public int f5580X = 0;

    /* renamed from: ah */
    public int f5581ah = -1;

    /* renamed from: ai */
    public int f5582ai = 300;

    /* renamed from: an */
    public ArrayList f5583an = new ArrayList();

    /* renamed from: ao */
    public C0851ak f5584ao = new C0851ak(this, "Unit Pos");

    /* renamed from: ap */
    public C0851ak f5585ap = new C0851ak(this, "Unit Dir", false);

    /* renamed from: aq */
    public C0851ak f5586aq = new C0851ak(this, "Unit Hp");

    /* renamed from: ar */
    public C0851ak f5587ar = new C0851ak(this, "Unit Id");

    /* renamed from: as */
    public C0851ak f5588as = new C0851ak(this, "Waypoints");

    /* renamed from: at */
    public C0851ak f5589at = new C0851ak(this, "Waypoints Pos");

    /* renamed from: au */
    public C0851ak f5590au = new C0851ak(this, "Team Credits");

    /* renamed from: av */
    public C0851ak f5591av = new C0851ak(this, "UnitPaths");

    /* renamed from: aw */
    public C0851ak f5592aw = new C0851ak(this, "Unit Count");

    /* renamed from: ax */
    public C0851ak f5593ax = new C0851ak(this, "Team Info", false);

    /* renamed from: ay */
    public C0851ak f5594ay = new C0851ak(this, "Team 1 Credits", false);

    /* renamed from: az */
    public C0851ak f5595az = new C0851ak(this, "Team 2 Credits", false);

    /* renamed from: aA */
    public C0851ak f5596aA = new C0851ak(this, "Team 3 Credits", false);

    /* renamed from: aB */
    public C0851ak f5597aB = new C0851ak(this, "Command center2", false);

    /* renamed from: aC */
    public C0851ak f5598aC = new C0851ak(this, "Command center3", false);

    /* renamed from: aE */
    public boolean f5599aE = true;

    /* renamed from: aJ */
    float f5600aJ = 0.0f;

    /* renamed from: aM */
    public int f5601aM = 5;

    /* renamed from: aN */
    public int f5602aN = 5;

    /* renamed from: aO */
    public C0845ah f5603aO = new C0845ah();

    /* renamed from: aP */
    public String f5604aP = null;

    /* renamed from: aS */
    public C0827a f5605aS = new C0827a();

    /* renamed from: bc */
    public ConcurrentLinkedQueue f5606bc = new ConcurrentLinkedQueue();

    /* renamed from: bd */
    ConcurrentLinkedQueue f5607bd = new ConcurrentLinkedQueue();

    /* renamed from: bf */
    volatile int f5608bf = 1;

    /* renamed from: bg */
    Object f5609bg = new Object();

    /* renamed from: bn */
    public boolean f5610bn = false;

    /* renamed from: bo */
    boolean f5611bo = false;

    /* renamed from: bp */
    boolean f5612bp = false;

    /* renamed from: bx */
    public String f5613bx = null;

    /* renamed from: by */
    public ConcurrentLinkedQueue f5614by = new ConcurrentLinkedQueue();

    /* renamed from: bB */
    public final Object f5615bB = new Object();

    /* renamed from: bC */
    public boolean f5616bC = false;

    /* renamed from: bH */
    boolean f5617bH = false;

    /* renamed from: bI */
    boolean f5618bI = false;

    /* renamed from: bJ */
    public Socket globalSocket = null;

    /* renamed from: bK */
    public String f5620bK = null;

    /* renamed from: bM */
    boolean f5621bM = false;

    /* renamed from: bN */
    boolean f5622bN = false;

    /* renamed from: bP */
    final Object f5623bP = new Object();

    /* renamed from: e */
    public int GameVersion = Core.m1087A().m988c(true);

    /* renamed from: bh */
    String f5625bh = C0758f.m2114e(40);

    /* renamed from: bb */
    Steam f5626bb = new Steam(this, null);

    /* renamed from: a */
    public C0850aj m1602a(Steam steam) {
        String m1344f = steam.m1344f();
        long currentTimeMillis = System.currentTimeMillis();
        if (m1344f == null) {
            steam.m1350b("Is banned: No target");
            return null;
        }
        synchronized (this.f5575M) {
            Iterator it = this.f5575M.iterator();
            while (it.hasNext()) {
                C0850aj c0850aj = (C0850aj) it.next();
                if (m1344f.equals(c0850aj.f5673a) && c0850aj.f5674b > currentTimeMillis) {
                    return c0850aj;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public boolean m1595a(Steam steam, String str, int i) {
        if (steam == null) {
            Core.m998b("Ban failed: No connection");
            return false;
        }
        String m1344f = steam.m1344f();
        if (m1344f == null) {
            steam.m1350b("Ban failed: No target");
            return false;
        }
        C0850aj c0850aj = new C0850aj();
        c0850aj.f5673a = steam.m1344f();
        c0850aj.f5674b = System.currentTimeMillis() + (i * 1000);
        c0850aj.f5675c = str;
        synchronized (this.f5575M) {
            m1547b();
            this.f5575M.add(c0850aj);
        }
        steam.LogDebug("Banned " + m1344f + " for " + i + "s");
        return true;
    }

    /* renamed from: a */
    public void m1621a() {
        synchronized (this.f5575M) {
            this.f5575M.clear();
        }
    }

    /* renamed from: b */
    public void m1547b() {
        synchronized (this.f5575M) {
            int i = 0;
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = this.f5575M.iterator();
            while (it.hasNext()) {
                i++;
                boolean z = false;
                if (((C0850aj) it.next()).f5674b < currentTimeMillis) {
                    z = true;
                }
                if (i > 1000) {
                    z = true;
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public String m1590a(String str) {
        String replace = str.trim().replace(" ", "_");
        this.f5487y = replace;
        Core m1087A = Core.m1087A();
        if (this.f5487y != null && !this.f5487y.equals(m1087A.settingEngine.lastNetworkPlayerName)) {
            m1087A.settingEngine.lastNetworkPlayerName = this.f5487y;
            m1087A.settingEngine.save();
        }
        return replace;
    }

    /* renamed from: a */
    public void m1619a(float f, String str) {
        if (f < 0.1d) {
            m1587a("setCurrentStepRate:" + f + " is too small, source:" + str, true);
        } else {
            this.f5573bV = f;
        }
    }

    /* renamed from: c */
    public float m1531c() {
        return this.f5573bV;
    }

    /* renamed from: d */
    public void m1520d() {
        Iterator it = this.f5583an.iterator();
        while (it.hasNext()) {
            ((C0851ak) it.next()).f5677b = 0L;
        }
    }

    /* renamed from: a */
    public void m1604a(StreamWriter streamWriter) {
        Core m1087A = Core.m1087A();
        streamWriter.m1401c(0);
        this.f5603aO.m1448a(streamWriter);
        streamWriter.WriteInteger(m1087A.f6105bB);
        streamWriter.WriteInteger(m1087A.f6106bC);
    }

    /* renamed from: a */
    public void m1591a(Reader reader) {
        Core m1087A = Core.m1087A();
        reader.m1304d();
        this.f5603aO.m1447a(reader);
        m1087A.f6105bB = reader.ReadInt();
        m1087A.f6106bC = reader.ReadInt();
    }

    /* renamed from: e */
    public C0845ah m1511e() {
        C0845ah c0845ah;
        if (this.IsServer) {
            c0845ah = this.f5603aO;
        } else if (this.f5495H) {
            c0845ah = this.f5603aO.m1445c();
        } else {
            c0845ah = null;
            Core.m997b("getChangeableSetup", "Clicked but not server or proxy controller");
        }
        return c0845ah;
    }

    /* renamed from: f */
    public void m1504f() {
        if (this.f5571F) {
            Core.m1087A().settingEngine.aiDifficulty = this.f5603aO.f5659f;
        }
        if (!this.IsServer && !this.f5571F) {
            return;
        }
        if (this.f5539bm) {
            Core.m973g("updateAIDifficulty with gameHasBeenStarted=true");
        } else {
            for (int i = 0; i < AbstractC0197n.f1365c; i++) {
                AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
                if (m5017k != null) {
                    m1611a(m5017k);
                }
            }
        }
        m1557aq();
    }

    /* renamed from: a */
    public void m1611a(AbstractC0197n abstractC0197n) {
        if (abstractC0197n.f1317v) {
            abstractC0197n.m5047c("aiDifficultyOverride=" + abstractC0197n.f1320y);
            if (abstractC0197n.f1320y != null) {
                abstractC0197n.f1318w = abstractC0197n.f1320y.intValue();
            } else {
                abstractC0197n.f1318w = this.f5603aO.f5659f;
            }
        }
    }

    /* renamed from: b */
    public boolean m1544b(AbstractC0197n abstractC0197n) {
        boolean z = false;
        if (abstractC0197n.f1317v) {
            String str = "AI - " + m1545b(abstractC0197n.m5119A());
            if (!str.equals(abstractC0197n.f1316u)) {
                abstractC0197n.f1316u = str;
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m1606a(C0845ah c0845ah) {
        if (this.IsServer) {
            m1504f();
            m1632P();
            m1636L();
            ActivityC0122n.m5601o();
        } else if (this.f5495H) {
            m1542b(c0845ah);
        } else {
            Core.LogDebug2("applyChangedSetup but not server or proxy controller");
        }
    }

    /* renamed from: b */
    private void m1542b(C0845ah c0845ah) {
        Core m1087A = Core.m1087A();
        Core.LogDebug2("applyProxyControl");
        C0845ah c0845ah2 = this.f5603aO;
        if (!c0845ah2.f5655b.equals(c0845ah.f5655b)) {
            m1087A.f6122bX.m1477k("-map '" + C0750a.m2265n(ActivityC0117i.m5622e(c0845ah.f5655b)) + "'");
        }
        if (c0845ah2.f5658e != c0845ah.f5658e) {
            m1087A.f6122bX.m1477k("-revealedmap " + (!c0845ah.f5658e ? "true" : "false"));
        }
        if (c0845ah2.f5657d != c0845ah.f5657d) {
            m1087A.f6122bX.m1477k("-fog " + m1087A.f6122bX.m1617a(c0845ah.f5657d));
        }
        if (c0845ah2.f5656c != c0845ah.f5656c) {
            m1087A.f6122bX.m1477k("-credits " + m1087A.f6122bX.m1510e(c0845ah.f5656c));
        }
        if (!C0758f.m2089j(c0845ah2.f5661h, c0845ah.f5661h)) {
            m1087A.f6122bX.m1477k("-income " + C0758f.m2206a(c0845ah.f5661h, 1));
        }
        if (c0845ah2.f5662i != c0845ah.f5662i) {
            m1087A.f6122bX.m1477k("-nukes " + (!c0845ah.f5662i ? "true" : "false"));
        }
        if (c0845ah2.f5659f != c0845ah.f5659f) {
            m1087A.f6122bX.m1477k("-ai " + c0845ah.f5659f);
        }
        if (c0845ah2.f5660g != c0845ah.f5660g) {
            m1087A.f6122bX.m1477k("-startingunits " + c0845ah.f5660g);
        }
        if (c0845ah2.f5652l != c0845ah.f5652l) {
            m1087A.f6122bX.m1477k("-sharedControl " + (c0845ah.f5652l ? "true" : "false"));
        }
    }

    /* renamed from: g */
    public String m1498g() {
        if (this.f5603aO.f5657d == 0) {
            return "No fog";
        }
        if (this.f5603aO.f5657d == 1) {
            return "Basic fog";
        }
        if (this.f5603aO.f5657d == 2) {
            return "Line of Sight";
        }
        return "Unknown";
    }

    /* renamed from: a */
    public String m1617a(int i) {
        if (i == 0) {
            return "off";
        }
        if (i == 1) {
            return "basic";
        }
        if (i == 2) {
            return "los";
        }
        return "Unknown";
    }

    /* renamed from: b */
    public String m1545b(int i) {
        return m1529c(i);
    }

    /* renamed from: c */
    public String m1529c(int i) {
        if (i == -2) {
            return "Very Easy";
        }
        if (i == -1) {
            return "Easy";
        }
        if (i == 0) {
            return "Medium";
        }
        if (i == 1) {
            return "Hard";
        }
        if (i == 2) {
            return "Very Hard";
        }
        if (i == 3) {
            return "Impossible";
        }
        return "Unknown";
    }

    /* renamed from: h */
    public String m1492h() {
        return m1518d(this.f5603aO.f5660g);
    }

    /* renamed from: i */
    public ArrayList m1486i() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 4; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        arrayList.addAll(C0453l.m3664s());
        return arrayList;
    }

    /* renamed from: d */
    public String m1518d(int i) {
        if (i == 1) {
            return "Normal (1 builder)";
        }
        if (i == 2) {
            return "Small Army";
        }
        if (i == 3) {
            return "3 Engineers";
        }
        if (i == 4) {
            return "3 Engineers (No Command Center)";
        }
        if (i == 5) {
            return "Experimental Spider";
        }
        if (i == 9) {
            return "Custom";
        }
        C0453l m3699c = C0453l.m3699c(i);
        if (m3699c != null) {
            return m3699c.mo4478e();
        }
        return "Unknown";
    }

    /* renamed from: j */
    public String m1480j() {
        if (this.f5603aO.f5656c == 0) {
            return "Default ($" + m1478k() + ")";
        }
        return "$" + m1478k();
    }

    /* renamed from: k */
    public final int m1478k() {
        return m1510e(this.f5603aO.f5656c);
    }

    /* renamed from: e */
    public int m1510e(int i) {
        if (i == 0) {
            return 4000;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1000;
        }
        if (i == 3) {
            return 2000;
        }
        if (i == 4) {
            return 5000;
        }
        if (i == 5) {
            return 10000;
        }
        if (i == 6) {
            return 50000;
        }
        if (i == 7) {
            return 100000;
        }
        if (i == 8) {
            return 200000;
        }
        return 999;
    }

    /* renamed from: l */
    public String m1476l() {
        return C0750a.m2265n(this.f5604aP);
    }

    /* renamed from: m */
    public void m1474m() {
        new C1101m();
        C0758f.m2155b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU);
        C0857ap.m1434a(5.0f, 6.0f, 7.0f);
        C0858aq.m1428a(5);
        this.f5546bw = C0858aq.m1429a();
        this.f5545bv = true;
    }

    /* renamed from: n */
    public boolean m1472n() {
        return this.f5539bm;
    }

    /* renamed from: o */
    public boolean m1470o() {
        return this.f5562d.m1648e();
    }

    /* renamed from: a */
    public synchronized void m1581a(boolean z, String str, Boolean bool) {
        this.f5538bl = Boolean.valueOf(z);
        this.f5536bj = str;
        this.f5537bk = bool;
        ActivityC0122n.m5601o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1592a(C0872g c0872g) {
        Iterator it = this.f5614by.iterator();
        while (it.hasNext()) {
            C0872g c0872g2 = (C0872g) it.next();
            if (c0872g2.f5823a && c0872g2.f5825c.equals(c0872g.f5825c) && c0872g2.f5829g == c0872g.f5829g) {
                c0872g2.f5837o = m1468p();
            }
        }
        c0872g.f5837o = m1468p();
        this.f5614by.add(c0872g);
        ActivityC0129p.m5595l();
    }

    /* renamed from: p */
    public long m1468p() {
        return System.currentTimeMillis();
    }

    public C0831ad() {
        this.f5626bb.f5781p = true;
        this.f5547bz = new C0187e(-3, false);
        this.f5547bz.f1316u = "SPECTATOR";
        this.f5548bA = new C0187e(-1, false);
        this.f5548bA.f1316u = "ADMIN";
    }

    /* renamed from: q */
    public void m1466q() {
        m1583a(false);
    }

    /* renamed from: r */
    public void m1465r() {
        m1583a(true);
    }

    /* renamed from: s */
    public void m1464s() {
        this.f5569bU = false;
        this.f5488bT = false;
        this.f5489z = null;
        this.f5483p = false;
        this.f5580X = 0;
        this.f5572I = 0;
        this.f5567w = 1L;
        m1619a(1.0f, "new");
        this.f5505Z = 10.0f;
        this.f5498N = false;
        this.f5501Q = 10;
        this.f5502R = 0;
        this.f5504Y = false;
        this.f5506aa = false;
        this.f5515al = false;
        this.f5514ak = false;
        this.f5507ab = 0.0f;
        this.f5508ac = 0.0f;
        this.f5509ad = false;
        this.f5511af = false;
        this.f5539bm = false;
        this.f5611bo = false;
        this.f5612bp = false;
        this.f5540bq = 0.0f;
        this.f5610bn = false;
        this.f5541br = false;
        this.f5542bs = false;
        this.f5543bt = false;
        this.f5544bu = false;
        this.f5512ag = false;
        this.f5581ah = -1;
        this.f5516am = 0L;
        this.f5617bH = false;
        m1520d();
        this.f5517aD = false;
        this.f5599aE = true;
        this.f5518aF = 0;
        this.f5519aG = 0;
        this.f5520aH = 0;
        this.f5600aJ = 0.0f;
        this.f5549bD = 0.0f;
        this.f5550bE = 0.0f;
        this.f5551bF = 0;
        this.f5552bG = -1000;
        C0857ap.f5725i = 55;
        C0857ap.f5726j = 66;
    }

    /* renamed from: a */
    public void m1583a(boolean z) {
        this.lock1 = false;
        this.IsServer = false;
        this.f5475f = null;
        this.f5571F = false;
        this.f5492D = false;
        this.f5493E = null;
        this.f5568x = false;
        this.f5495H = false;
        this.f5494G = false;
        this.f5523aL = false;
        this.f5490A = false;
        m1464s();
        this.ServerUUID = null;
        this.socketPort = 0;
        this.f5477i = false;
        this.f5478j = 0.0f;
        this.f5479k = 0.0f;
        this.f5622bN = false;
        this.f5525aR = null;
        this.f5602aN = Core.m1087A().settingEngine.teamUnitCapHostedGame;
        if (this.f5602aN < 1) {
            this.f5602aN = 1;
        }
        this.f5601aM = this.f5602aN;
        this.f5603aO.f5660g = 1;
        this.f5603aO.f5661h = 1.0f;
        this.f5603aO.f5662i = false;
        this.f5603aO.f5663j = false;
        this.f5603aO.f5652l = false;
        this.f5603aO.f5656c = 0;
        this.f5603aO.f5665m = false;
        this.f5603aO.f5666n = false;
        this.f5603aO.f5667o = true;
        this.f5603aO.f5668p = false;
        this.f5603aO.f5653q = 0;
        m1621a();
        this.f5605aS.m1655c();
        Core.m1087A().f6117bS.m1829g();
        if ("<CHAT ONLY>".equals(this.f5603aO.f5655b)) {
            Core.LogDebug2("Chat only map selection - restarting");
            this.f5603aO.m1449a();
        }
        if (!z) {
            AbstractC0197n.m5116D();
        }
        C0348af.m4281b(this.f5482o);
    }

    /* renamed from: t */
    public void m1463t() {
    }

    /* renamed from: b */
    public synchronized void m1535b(String str) {
        Core m1087A = Core.m1087A();
        Core.LogDebug2("Disconnect: " + str);
        if (this.IsServer) {
            m1556ar();
            C0879n.m1260d();
            if (this.f5527aU != null) {
                this.f5527aU.m1436b();
                try {
                    if (this.f5526aT != null) {
                        this.f5526aT.join();
                    }
                } catch (InterruptedException e) {
                }
                this.f5527aU = null;
                this.f5526aT = null;
            }
            if (this.f5529aW != null) {
                this.f5529aW.m1436b();
                try {
                    if (this.f5528aV != null) {
                        this.f5528aV.join();
                    }
                } catch (InterruptedException e2) {
                }
                this.f5529aW = null;
                this.f5528aV = null;
            }
            if (this.f5530aX != null) {
                this.f5530aX.cancel();
                this.f5530aX = null;
                this.f5531aY = null;
            }
            if (this.f5533ba != null) {
                this.f5533ba.m1450b();
                this.f5533ba = null;
                this.f5532aZ = null;
            }
        }
        m1467p(str);
        C1058a.m747a().mo279j();
        synchronized (this.f5615bB) {
            this.lock1 = false;
            this.IsServer = false;
            this.f5571F = false;
            this.f5475f = null;
            try {
                wait(50L);
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            this.f5539bm = false;
            m1087A.f6126cb.m2470d();
            m1087A.m982e();
            m1561am();
            this.f5616bC = false;
            this.f5615bB.notifyAll();
        }
    }

    /* renamed from: u */
    public void m1462u() {
        synchronized (this.f5615bB) {
            if (this.lock1) {
                this.f5616bC = true;
                try {
                    this.f5615bB.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public void m1539b(Steam steam) {
        this.f5606bc.remove(steam);
    }

    /* renamed from: ay */
    private synchronized void m1549ay() {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            if (((Steam) it.next()).f5766a) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    void m1579a(byte[] bArr, Steam steam) {
        if (!Core.m1008aw()) {
            Log.m5772d("RustedWarfare", "Ignoring incoming resync tagged as debug only");
        } else if (steam.f5786u) {
            Log.m5772d("RustedWarfare", "Ignoring desync client save, as past desync was already saved");
        } else {
            steam.f5786u = true;
            Log.m5772d("RustedWarfare", "Saving client save for debugging");
            File file = new File("desyncs/" + ("desync_" + C0758f.m2179a("d MMM yyyy HH.mm.ss") + "_" + steam.f5768c));
            file.getParentFile().mkdirs();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: v */
    public void m1461v() {
        if (this.f5617bH) {
            return;
        }
        Core.LogDebug2("Adding quick resync command");
        Core m1087A = Core.m1087A();
        C0749e m2420b = m1087A.f6130cf.m2420b();
        m2420b.f4846i = AbstractC0197n.f1371i;
        m2420b.f4856r = true;
        m2420b.f4859u = 200;
        m1087A.f6122bX.m1608a(m2420b);
        this.f5617bH = true;
    }

    /* renamed from: w */
    public void m1460w() {
        Core m1087A = Core.m1087A();
        StreamWriter streamWriter = new StreamWriter();
        m1087A.f6125ca.m428a(streamWriter);
        try {
            streamWriter.m1427a();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] m1399d = streamWriter.m1399d();
        streamWriter.m1393h();
        if (this.IsServer) {
            Iterator it = this.f5606bc.iterator();
            while (it.hasNext()) {
                Steam steam = (Steam) it.next();
                if (steam.f5788w) {
                    steam.f5788w = false;
                    steam.f5787v = false;
                    m1593a(steam, m1399d, this.f5564l, false);
                }
            }
        }
        Core.LogDebug2("Loading quick resync save data (bytes:" + m1399d.length + ")");
        Reader reader = new Reader(m1399d);
        m1087A.m1040a("Game resync (quick)...", true);
        int i = m1087A.f6239bx;
        int i2 = m1087A.f6102by;
        m1087A.f6125ca.m427a(reader, true, true, true);
        m1087A.f6239bx = i;
        m1087A.f6102by = i2;
        this.f5580X = m1087A.f6239bx + 1;
        this.f5512ag = false;
        this.f5581ah = this.f5580X + 1;
        this.f5516am = 0L;
        Iterator it2 = this.f5606bc.iterator();
        while (it2.hasNext()) {
            ((Steam) it2.next()).f5787v = false;
        }
        this.f5617bH = false;
        this.f5520aH++;
        this.f5549bD = 0.0f;
        this.f5550bE = 0.0f;
        if (this.f5551bF < 1) {
            this.f5551bF++;
        }
        this.f5552bG = m1087A.f6239bx;
    }

    /* renamed from: x */
    public synchronized void m1459x() {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5788w) {
                throw new RuntimeException("Player: " + steam.m1345e() + " has complete desync");
            }
            if (steam.f5787v) {
                throw new RuntimeException("Player: " + steam.m1345e() + " has minor desync");
            }
            if (steam.f5789x == 0) {
                throw new RuntimeException("Player: " + steam.m1345e() + " has no sync matches");
            }
        }
    }

    /* renamed from: d */
    private synchronized void m1519d(float f) {
        Core.m1087A();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        this.f5549bD += f;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5788w) {
                z = true;
            }
            if (steam.f5787v) {
                if (this.f5476g) {
                    Core.LogDebug2("desync_count:" + steam.f5790y + " lastResyncTimer:" + this.f5549bD);
                }
                if (steam.f5790y < 4 || this.f5549bD > 3600.0f) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            this.f5550bE += f;
            if (f5559c && this.f5550bE > 5.0f) {
                z2 = true;
            }
            if (this.f5551bF == 0) {
                if (this.f5550bE > 60.0f) {
                    z2 = true;
                }
            } else if (this.f5551bF == 1) {
                if (this.f5550bE > 420.0f) {
                    z2 = true;
                }
            } else if (this.f5551bF == 2) {
                if (this.f5550bE > 3600.0f) {
                    z2 = true;
                }
            } else if (this.f5551bF == 3 && this.f5550bE > 14400.0f) {
                z2 = true;
            }
        }
        if (f5521aI && z2) {
            Core.LogDebug2("disableDesyncFixing==true, running quick resync instead");
            z2 = false;
            z = true;
        }
        if (!z2 && z) {
            if (f5558b) {
                m1461v();
            } else {
                z2 = true;
            }
        }
        if (z2) {
            String str = VariableScope.nullOrMissingString;
            Iterator it2 = this.f5606bc.iterator();
            while (it2.hasNext()) {
                Steam steam2 = (Steam) it2.next();
                if (steam2.f5788w || steam2.f5787v) {
                    if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + ", ";
                    }
                    str = str + steam2.m1345e();
                }
            }
            m1479j("Resyncing game for " + str + "...");
            m1548az();
            m1580a(this.f5564l, false, true);
        }
    }

    /* renamed from: az */
    private void m1548az() {
        Core m1087A = Core.m1087A();
        this.f5549bD = 0.0f;
        this.f5550bE = 0.0f;
        this.f5551bF++;
        this.f5552bG = m1087A.f6239bx;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            steam.f5788w = false;
            steam.f5787v = false;
            steam.f5789x = 0;
        }
    }

    /* renamed from: c */
    public void m1523c(String str) {
        m1467p(str);
    }

    /* renamed from: p */
    private void m1467p(String str) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            ((Steam) it.next()).m1355a(str);
        }
        this.f5606bc.clear();
        this.f5607bd.clear();
        this.f5608bf = 1;
        this.f5534be = false;
    }

    /* renamed from: y */
    public long m1458y() {
        if (0 != 0) {
            Core.LogDebug2("New id set:" + this.f5567w + 1);
            Core.m1069S();
        }
        long j = this.f5567w;
        this.f5567w = j + 1;
        if (j == 0) {
            Core.LogDebug2("getNextUnitId: id==0");
            Core.m1069S();
        }
        return j;
    }

    /* renamed from: z */
    public long m1457z() {
        return this.f5567w;
    }

    /* renamed from: a */
    public void m1615a(long j) {
        this.f5567w = j;
    }

    /* renamed from: a */
    public boolean m1582a(boolean z, int i) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5781p && steam.m1342h() && !steam.f5784s && !steam.f5795D) {
                if (z) {
                    m1479j("Still waiting on: " + steam.m1345e());
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public int m1647A() {
        int i = 0;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5781p && steam.m1342h() && !steam.f5784s) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public int m1646B() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5781p && steam.m1342h() && !steam.f5784s) {
                C0187e c0187e = steam.f5791z;
                if (c0187e != null) {
                    if (!arrayList.contains(c0187e)) {
                        arrayList.add(c0187e);
                    }
                }
                i++;
            }
        }
        return i;
    }

    /* renamed from: C */
    public int m1645C() {
        int i = 0;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5781p && !steam.f5784s) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public int m1644D() {
        int m1646B = 0 + m1646B();
        if (!Core.m1008aw()) {
            m1646B++;
        }
        return m1646B;
    }

    /* renamed from: d */
    public void LogError(String str) {
        Log.LogDebug("RustedWarfare", "network:" + str);
    }

    /* renamed from: e */
    public static void m1506e(String str) {
        Core.LogDebug2("network debug: " + str);
    }

    /* renamed from: f */
    public void m1499f(String str) {
        Log.m5772d("RustedWarfare", "reportProblem:" + str);
        if (this.f5539bm) {
            m1538b((Steam) null, -1, (String) null, str);
        } else {
            m1538b((Steam) null, -1, (String) null, str);
        }
    }

    /* renamed from: g */
    public static void m1493g(String str) {
        m1587a(str, false);
    }

    /* renamed from: h */
    public static void m1487h(String str) {
        m1587a(str, true);
    }

    /* renamed from: a */
    public static void m1587a(String str, boolean z) {
        String str2;
        C0831ad c0831ad = Core.m1087A().f6122bX;
        String str3 = "desync:" + str;
        Core.m998b(str3);
        Core.m1069S();
        c0831ad.f5518aF++;
        if (c0831ad.f5599aE) {
            if (c0831ad.f5518aF > 2 || f5521aI) {
                z = true;
            }
            if (c0831ad.f5518aF > 10) {
                str2 = "<suppressing desync errors>";
                c0831ad.f5599aE = false;
                z = true;
            } else {
                str2 = str3;
            }
            if (z) {
                str2 = "-i " + str2;
            }
            c0831ad.m1473m(str2);
        }
    }

    /* renamed from: a */
    public static void m1588a(String str, String str2) {
        Core m1087A = Core.m1087A();
        m1087A.f6126cb.m2485a(-1, str, str2, m1087A.f6239bx);
        if (m1087A.f6117bS != null && m1087A.f6117bS.f5115e != null) {
            m1087A.f6117bS.f5115e.m1794a(str, str2);
        } else {
            Core.m973g("interfaceEngine/messageInterface==null");
        }
    }

    /* renamed from: E */
    public void m1643E() {
    }

    /* renamed from: a */
    public void m1608a(C0749e c0749e) {
        Core m1087A = Core.m1087A();
        c0749e.f4840c = this.f5580X;
        c0749e.m2303g();
        m1087A.f6130cf.f4621b.add(c0749e);
    }

    /* renamed from: F */
    public void m1642F() {
        C0851ak c0851ak;
        C0851ak c0851ak2;
        C0851ak c0851ak3;
        this.f5581ah = Core.m1087A().f6239bx;
        this.f5516am = 0L;
        m1520d();
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                this.f5516am = ((float) this.f5516am) + (abstractC0623y.f6958el * 1000.0f);
                this.f5516am = ((float) this.f5516am) + (abstractC0623y.f6959em * 1000.0f);
                this.f5516am = ((float) this.f5516am) + (abstractC0623y.f1632cs * 1.0f);
                this.f5516am += abstractC0623y.f6951ee;
                this.f5584ao.f5677b += Float.floatToRawIntBits(abstractC0623y.f6958el);
                this.f5584ao.f5677b += Float.floatToRawIntBits(abstractC0623y.f6959em);
                this.f5585ap.f5677b += Float.floatToRawIntBits(abstractC0623y.f1618ce);
                this.f5586aq.f5677b = ((float) c0851ak.f5677b) + abstractC0623y.f1632cs;
                this.f5587ar.f5677b += abstractC0623y.f6951ee;
                if (abstractC1120w instanceof C0489e) {
                    C0489e c0489e = (C0489e) abstractC0623y;
                    this.f5597aB.f5677b = ((float) c0851ak3.f5677b) + (c0489e.f3437f * 2.0f);
                    this.f5598aC.f5677b += c0489e.f3439h;
                }
                C0305au m2909ar = abstractC0623y.m2909ar();
                if (m2909ar != null) {
                    this.f5588as.f5677b += m2909ar.m4433j();
                    this.f5589at.f5677b = ((float) c0851ak2.f5677b) + (m2909ar.m4438g() * 1000.0f);
                }
                this.f5591av.f5677b += abstractC0623y.m2942aL();
            }
        }
        for (int i = 0; i < AbstractC0197n.f1365c; i++) {
            AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
            if (m5017k != null) {
                this.f5590au.f5677b += (int) m5017k.f1310o;
                if (i == 0) {
                    this.f5594ay.f5677b += (int) m5017k.f1310o;
                }
                if (i == 1) {
                    this.f5595az.f5677b += (int) m5017k.f1310o;
                }
                if (i == 2) {
                    this.f5596aA.f5677b += (int) m5017k.f1310o;
                }
                this.f5592aw.f5677b += m5017k.m5007u();
                this.f5593ax.f5677b += i + (m5017k.f1318w * 100) + (m5017k.f1312q * 1000) + ((m5017k.f1317v ? i : 0) * 10000);
            }
        }
        if (this.f5581ah == 0) {
            Core.LogDebug2("Frame 0 checksum: " + this.f5516am);
        }
        this.f5517aD = false;
    }

    /* renamed from: G */
    public void m1641G() {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (!steam.f5781p || steam.m1351b() == -2 || steam.m1351b() > 500 || steam.m1351b() < 0) {
            }
        }
    }

    /* renamed from: H */
    public void m1640H() {
        Core m1087A = Core.m1087A();
        String str = VariableScope.nullOrMissingString;
        for (AbstractC0197n abstractC0197n : AbstractC0197n.m5076a(true)) {
            if (abstractC0197n != null) {
                String str2 = "unnamed";
                if (abstractC0197n.f1316u != null) {
                    str2 = abstractC0197n.f1316u;
                }
                str = str + "•" + abstractC0197n.m5109K().toLowerCase() + " [Team " + abstractC0197n.m5025h() + "] - " + str2 + (" " + abstractC0197n.m5005w()) + "\n";
            }
        }
        Core.LogDebug2("showPlayerListPopup(): Showing playlist messagebox.");
        m1087A.m990c("Players", str);
    }

    /* renamed from: a */
    public void m1620a(float f) {
        Steam m1625W;
        Core m1087A = Core.m1087A();
        this.f5600aJ += f;
        if (this.f5612bp) {
            if (this.f5540bq > 0.0f) {
                this.f5540bq -= f / 60.0f;
                Core.m1087A().f6117bS.m1865a("Returning to battleroom in " + ((int) this.f5540bq) + "...", 3500);
            } else {
                Core.LogDebug2("Sending returnToBattleroomEvent...");
                this.f5612bp = false;
                m1482i((Steam) null);
            }
        }
        if (this.f5611bo) {
            m1575aD();
        }
        if (this.f5600aJ > 60.0f) {
            m1641G();
            this.f5600aJ = 0.0f;
        }
        if (this.f5539bm && !this.f5610bn) {
            this.f5610bn = true;
            int i = 0;
            int i2 = 0;
            Iterator it = AbstractC0197n.m5031f().iterator();
            while (it.hasNext()) {
                int m5092a = AbstractC0197n.m5092a(((Integer) it.next()).intValue(), false);
                if (m5092a > i2) {
                    i2 = m5092a;
                }
                i++;
            }
            if (i > 2 && i2 <= 1) {
                this.f5541br = true;
            }
        }
        if (!this.IsServer && !this.f5569bU) {
            m1570ad();
            this.f5569bU = true;
        }
        if (this.IsServer) {
            if (!this.f5506aa) {
                if (m1582a(false, 0)) {
                    this.f5505Z = C0758f.m2211a(this.f5505Z, f);
                    if (this.f5505Z == 0.0f) {
                        this.f5506aa = true;
                        m1588a(VariableScope.nullOrMissingString, "<All players ready>");
                        this.f5562d.m1654a();
                    }
                } else {
                    this.f5507ab += f;
                    this.f5508ac += f;
                    if (this.f5507ab > 900.0f) {
                        this.f5506aa = true;
                        m1588a(VariableScope.nullOrMissingString, "Starting game without all players ready!");
                    } else if (this.f5508ac > 180.0f) {
                        this.f5508ac = 0.0f;
                        m1582a(true, (int) ((900.0f - this.f5507ab) / 60.0f));
                    }
                }
            }
            if (this.f5506aa) {
                boolean z = false;
                if (this.f5514ak) {
                    z = true;
                }
                if (this.f5515al) {
                    z = true;
                }
                if ((m1087A.f6239bx >= this.f5580X - this.f5502R) & (!z)) {
                    int i3 = this.f5580X + this.f5501Q;
                    this.f5499O++;
                    boolean z2 = false;
                    for (int i4 = 0; i4 < AbstractC0197n.f1365c; i4++) {
                        AbstractC0197n m5017k = AbstractC0197n.m5017k(i4);
                        if (m5017k != null && m5017k.f1345U != 0 && !m5017k.m5002z() && m5017k.f1345U < 40) {
                            z2 = true;
                        }
                    }
                    if (m1087A.m1004b() != 0 && m1087A.m1004b() < 40 && !Core.m1008aw()) {
                        z2 = true;
                    }
                    if (z2) {
                        this.f5500P++;
                    }
                    if (this.f5499O > 8) {
                        float f2 = 1.0f;
                        if (this.f5500P > 4) {
                            f2 = 2.0f;
                        }
                        if (this.f5496K != null) {
                            f2 = this.f5496K.floatValue();
                        }
                        if (f2 != m1531c()) {
                            Core.LogDebug2("Changing step rate to " + f2);
                            C0749e m2420b = m1087A.f6130cf.m2420b();
                            m2420b.f4846i = AbstractC0197n.f1371i;
                            m2420b.f4856r = true;
                            m2420b.f4857s = f2;
                            m1608a(m2420b);
                        }
                        this.f5499O = 0;
                        this.f5500P = 0;
                    }
                    StreamWriter streamWriter = new StreamWriter();
                    try {
                        streamWriter.WriteInteger(i3);
                        int i5 = 0;
                        Iterator it2 = m1087A.f6130cf.f4621b.iterator();
                        while (it2.hasNext()) {
                            if (((C0749e) it2.next()).f4840c == this.f5580X) {
                                i5++;
                            }
                        }
                        streamWriter.WriteInteger(i5);
                        Iterator it3 = m1087A.f6130cf.f4621b.iterator();
                        while (it3.hasNext()) {
                            C0749e c0749e = (C0749e) it3.next();
                            if (c0749e.f4840c == this.f5580X) {
                                c0749e.m2318a(streamWriter);
                            }
                        }
                        Packet m1407b = streamWriter.m1407b(10);
                        m1407b.f5742e = true;
                        m1516d(m1407b);
                        this.f5580X = i3;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        if (!m1087A.f6130cf.f4623d.isEmpty()) {
            Iterator it4 = m1087A.f6130cf.f4623d.iterator();
            while (it4.hasNext()) {
                C0749e c0749e2 = (C0749e) it4.next();
                if (0 != 0) {
                    m1087A.f6130cf.f4622c.add(c0749e2);
                    it4.remove();
                } else {
                    if (!c0749e2.f4863x) {
                        c0749e2.m2315b();
                    }
                    if (c0749e2.m2330a()) {
                        m1087A.f6130cf.f4622c.add(c0749e2);
                        it4.remove();
                    }
                }
            }
        }
        if (!this.IsServer) {
            if (!m1087A.f6130cf.f4622c.isEmpty()) {
                Iterator it5 = m1087A.f6130cf.f4622c.iterator();
                while (it5.hasNext()) {
                    C0749e c0749e3 = (C0749e) it5.next();
                    if (!c0749e3.m2307e()) {
                        c0749e3.m2300j();
                        StreamWriter streamWriter2 = new StreamWriter();
                        try {
                            c0749e3.m2318a(streamWriter2);
                            m1516d(streamWriter2.m1407b(20));
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
                m1087A.f6130cf.f4622c.clear();
            }
        } else if (!m1087A.f6130cf.f4622c.isEmpty()) {
            Iterator it6 = m1087A.f6130cf.f4622c.iterator();
            while (it6.hasNext()) {
                C0749e c0749e4 = (C0749e) it6.next();
                if (!c0749e4.m2307e()) {
                    if (!c0749e4.m2298l()) {
                        m1493g("Skipped command issued from server");
                    } else {
                        c0749e4.m2300j();
                        m1608a(c0749e4);
                    }
                }
            }
            m1087A.f6130cf.f4622c.clear();
        }
        while (!this.f5607bd.isEmpty()) {
            Packet packet = (Packet) this.f5607bd.remove();
            try {
                m1603a(packet);
            } catch (IOException e3) {
                String str = "None";
                Steam steam = packet.steam;
                if (steam != null) {
                    str = steam.m1343g();
                    String message = e3.getMessage();
                    if (message == null) {
                        message = "IO error";
                    }
                    steam.m1355a(message);
                    m1493g("IO error on processGamePacket for " + steam.m1345e());
                }
                Core.m1041a("Error on processGamePacket ip:" + str, (Throwable) e3);
            }
        }
        if (this.IsServer) {
            if (!this.lock1) {
                Core.LogDebug2("Skipping server updates, not networked");
            } else {
                m1549ay();
                if (!this.f5513aj) {
                    m1519d(f);
                }
            }
        }
        if (!this.IsServer && this.lock1) {
            boolean z3 = false;
            Iterator it7 = this.f5606bc.iterator();
            while (it7.hasNext()) {
                Steam steam2 = (Steam) it7.next();
                if (steam2.f5781p && !steam2.f5766a) {
                    z3 = true;
                }
            }
            if (this.f5544bu && m1472n()) {
                m1087A.f6117bS.m1850b("Game ended by server.");
                ActivityC0122n.m5601o();
            } else if (!z3 && m1472n()) {
                m1087A.f6117bS.m1850b("Server Disconnected.");
                ActivityC0122n.m5601o();
            }
            if (z3 && this.f5504Y && !this.IsServer && (m1625W = m1625W()) != null && m1625W.f5812U > 20000) {
                String str2 = "Receiving network data: " + m1625W.f5813V + "/" + m1625W.f5812U;
                Core.LogDebug2(str2);
                m1087A.f6117bS.m1836d(str2);
            }
        }
        if (this.lock1) {
            if (this.f5515al) {
                m1087A.f6117bS.m1849b("Game paused.", 100);
            } else {
                m1087A.f6117bS.m1866a("Game paused.");
            }
        }
        if (m1087A.f6239bx < this.f5580X) {
            this.f5504Y = false;
        }
        if (this.f5616bC) {
            m1535b("queDisconnect");
        }
    }

    /* renamed from: b */
    public void m1546b(float f) {
        Core m1087A = Core.m1087A();
        if (this.lock1 && (this.f5581ah + this.f5582ai < m1087A.f6239bx || this.f5581ah == -1)) {
            m1642F();
            m1087A.f6126cb.m2472c();
        }
        if ((this.lock1 || m1087A.f6126cb.m2464h()) && this.f5498N) {
            this.f5498N = false;
            m1460w();
        }
        if (this.lock1 && this.IsServer && !this.f5517aD && this.f5581ah + (this.f5582ai / 2) < m1087A.f6239bx && this.f5581ah != -1) {
            try {
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.WriteInteger(this.f5581ah);
                streamWriter.m1424a(this.f5516am);
                streamWriter.WriteInteger(this.f5583an.size());
                Iterator it = this.f5583an.iterator();
                while (it.hasNext()) {
                    streamWriter.m1424a(((C0851ak) it.next()).f5677b);
                }
                m1489h(streamWriter.m1407b(30));
                if (this.f5476g) {
                    Core.LogDebug2("Sent checksum to client [" + this.f5581ah + "]");
                }
                this.f5517aD = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: I */
    public boolean m1639I() {
        Core m1087A = Core.m1087A();
        if (m1087A.f6119bU.m1145e()) {
            if (!this.f5618bI) {
                Core.LogDebug2("shouldGameBePaused: isGoingToBlockThisFrame()==true: " + m1087A.f6119bU.m1144f());
            }
            this.f5618bI = true;
            return true;
        }
        if (this.f5618bI) {
            Core.LogDebug2("shouldGameBePaused: isGoingToBlockThisFrame()==false");
        }
        this.f5618bI = false;
        return false;
    }

    /* renamed from: a */
    public void m1618a(float f, boolean z) {
        Core m1087A = Core.m1087A();
        if (m1087A.f6239bx >= this.f5580X) {
            if (m1087A.f6239bx > this.f5580X) {
                throw new RuntimeException("game frame:" + m1087A.f6239bx + " is greater then nest step:" + this.f5580X);
            }
            this.f5504Y = true;
        }
        if (z && m1639I()) {
            this.f5504Y = true;
        }
    }

    /* renamed from: a */
    public void m1603a(Packet packet) {
        Core m1087A = Core.m1087A();
        if (m1540b(packet)) {
            LogError("filtered packet (type:" + packet.MsgId + ")");
            return;
        }
        switch (packet.MsgId) {
            case 10:
                if (this.IsServer) {
                    LogError("we are a server! we don't follow orders");
                    return;
                } else if (packet.steam.f5785t) {
                    LogError("ignoring command");
                    return;
                } else {
                    Reader reader = new Reader(packet);
                    int ReadInt = reader.ReadInt();
                    int ReadInt2 = reader.ReadInt();
                    for (int i = 0; i < ReadInt2; i++) {
                        C0749e m2420b = m1087A.f6130cf.m2420b();
                        m2420b.f4840c = this.f5580X;
                        m2420b.m2317a(reader);
                        m1608a(m2420b);
                    }
                    if (ReadInt < this.f5580X) {
                        m1493g("New nextBlockingFrame:" + ReadInt + " is smaller than current step:" + this.f5580X);
                    }
                    this.f5580X = ReadInt;
                    return;
                }
            case 20:
                if (!this.IsServer) {
                    LogError("we are not a server! skipping");
                    return;
                }
                Reader reader2 = new Reader(packet);
                Steam steam = packet.steam;
                if (!steam.m1359a()) {
                    C0187e c0187e = steam.f5791z;
                    if (c0187e == null) {
                        LogError("Player is null for message ADDCLIENTCOMMAND, skipping");
                        return;
                    }
                    C0749e m2420b2 = m1087A.f6130cf.m2420b();
                    m2420b2.m2317a(reader2);
                    m2420b2.f4854p = c0187e;
                    if (m2420b2.f4856r) {
                        LogError("Got system action from client, ignoring (" + steam.f5768c + ")");
                        m2420b2.f4856r = false;
                    }
                    if (m2420b2.m2312c() == null) {
                        m1493g("Invalid command from '" + c0187e.f1316u + "', no team found");
                        return;
                    } else if (!m2420b2.m2298l()) {
                        m1493g("Ignored command from '" + c0187e.f1316u + "', check failed");
                        return;
                    } else {
                        m1608a(m2420b2);
                        return;
                    }
                }
                return;
            case 30:
                Steam steam2 = packet.steam;
                Reader reader3 = new Reader(packet);
                int ReadInt3 = reader3.ReadInt();
                long m1298i = reader3.m1298i();
                if (this.f5512ag) {
                    LogError("PACKET_SYNCCHECKSUM: skipping frame:" + ReadInt3 + ", we were told to wait for resync");
                    return;
                }
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.m1401c(0);
                streamWriter.WriteInteger(ReadInt3);
                streamWriter.WriteInteger(this.f5581ah);
                if (this.f5581ah != ReadInt3 || this.f5516am == 0) {
                    streamWriter.mo1329a(false);
                    Log.m5772d("RustedWarfare", "got remoteSyncFrame for:" + ReadInt3 + " needed:" + this.f5581ah + " lastSyncCheckSum:" + this.f5516am);
                } else {
                    streamWriter.mo1329a(true);
                    Log.m5772d("RustedWarfare", "Running checksum");
                    streamWriter.m1424a(m1298i);
                    streamWriter.m1424a(this.f5516am);
                    boolean z = false;
                    if (m1298i != this.f5516am) {
                        m1493g("Checksum doesn't match. Got:" + m1298i + " expected:" + this.f5516am);
                        z = true;
                        Core.LogDebug2("--- Desync for frame: " + ReadInt3 + " ---");
                        Iterator it = AbstractC0197n.m5058c().iterator();
                        while (it.hasNext()) {
                            ((AbstractC0197n) it.next()).m5008t();
                        }
                    } else {
                        this.f5519aG++;
                    }
                    int ReadInt4 = reader3.ReadInt();
                    if (ReadInt4 != this.f5583an.size()) {
                        Log.m5772d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    streamWriter.m1396e("checkList");
                    streamWriter.WriteInteger(ReadInt4);
                    streamWriter.WriteInteger(this.f5583an.size());
                    Iterator it2 = this.f5583an.iterator();
                    while (it2.hasNext()) {
                        C0851ak c0851ak = (C0851ak) it2.next();
                        long m1298i2 = reader3.m1298i();
                        streamWriter.m1424a(m1298i2);
                        streamWriter.m1424a(c0851ak.f5677b);
                        if (m1298i2 != c0851ak.f5677b && c0851ak.f5678c) {
                            m1493g("[" + ReadInt3 + "] check(" + c0851ak.f5676a + "): " + m1298i2 + "!=" + c0851ak.f5677b);
                            z = true;
                        }
                    }
                    streamWriter.mo1332a("checkList");
                    streamWriter.mo1329a(z);
                }
                if (!this.IsServer) {
                    SendPacket(steam2, streamWriter.m1407b(31));
                    return;
                }
                return;
            case 31:
                if (!this.IsServer) {
                    LogError("we are not a server, but got PACKET_SYNCCHECKSUM_STATUS");
                    return;
                }
                Steam steam3 = packet.steam;
                Reader reader4 = new Reader(packet);
                reader4.m1304d();
                int ReadInt5 = reader4.ReadInt();
                int ReadInt6 = reader4.ReadInt();
                if (reader4.ReadBool()) {
                    reader4.m1298i();
                    reader4.m1298i();
                    reader4.m1307b("checkList");
                    reader4.ReadInt();
                    if (reader4.ReadInt() != this.f5583an.size()) {
                        Log.m5772d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    Iterator it3 = this.f5583an.iterator();
                    while (it3.hasNext()) {
                        C0851ak c0851ak2 = (C0851ak) it3.next();
                        long m1298i3 = reader4.m1298i();
                        long m1298i4 = reader4.m1298i();
                        if (m1298i3 != m1298i4) {
                            Core.m998b(c0851ak2.f5676a + " Checksum [" + ReadInt5 + "]. server:" + m1298i3 + " client:" + m1298i4);
                        }
                    }
                    reader4.m1303d("checkList");
                    boolean ReadBool = reader4.ReadBool();
                    if (this.f5552bG >= ReadInt5) {
                        LogError("Not marking desync, already resynced before frame: " + this.f5552bG + "<=" + ReadInt5);
                        return;
                    }
                    if (!steam3.f5787v && ReadBool) {
                        steam3.f5790y++;
                    }
                    steam3.f5787v = ReadBool;
                    if (!ReadBool) {
                        if (this.f5476g) {
                            Core.LogDebug2("checksum: client checksum match [" + ReadInt5 + "]");
                        }
                        steam3.f5789x++;
                        return;
                    }
                    Core.LogDebug2("client:" + steam3.m1345e() + " desync [" + ReadInt5 + "]");
                    if (this.f5513aj && !this.f5514ak) {
                        m1493g("pauseOnDesync is active, pausing");
                        this.f5514ak = true;
                        return;
                    }
                    return;
                } else if (this.f5476g) {
                    Core.LogDebug2("checksum for:" + steam3.m1345e() + " frameMatch==false client:" + ReadInt6 + " server:[" + ReadInt5 + "]");
                    return;
                } else {
                    return;
                }
            case 35:
                Reader reader5 = new Reader(packet);
                reader5.m1304d();
                int ReadInt7 = reader5.ReadInt();
                int ReadInt8 = reader5.ReadInt();
                float m1300g = reader5.m1300g();
                float m1300g2 = reader5.m1300g();
                if (!this.IsServer && m1300g < 0.1d) {
                    m1587a("resync packet with setCurrentStepRate:" + m1300g + " is too small", true);
                }
                Steam steam4 = packet.steam;
                if (steam4.f5785t) {
                    LogError("ignoring resync command");
                    return;
                }
                boolean ReadBool2 = reader5.ReadBool();
                if (reader5.ReadBool()) {
                    if (!this.IsServer) {
                        LogError("we are not a server, but got a debug game save! skipping");
                        return;
                    } else {
                        m1579a(reader5.m1305c("gameSave"), steam4);
                        return;
                    }
                }
                Core.LogDebug2("Reloading from network save");
                if (ReadBool2 && !this.IsServer) {
                    m1580a(false, true, false);
                }
                byte[] m1305c = reader5.m1305c("gameSave");
                Core.LogDebug2("Save size: " + m1305c.length);
                if (this.f5564l) {
                    m1579a(m1305c, steam4);
                }
                m1087A.f6126cb.m2475a(m1305c, m1087A.f6239bx, ReadInt7, ReadInt8, m1300g, m1300g2);
                Reader reader6 = new Reader(m1305c);
                m1087A.m1040a("Resyncing game from server...", true);
                m1087A.f6125ca.m427a(reader6, true, true, true);
                m1087A.m1063Y();
                this.f5520aH++;
                m1087A.f6239bx = ReadInt7;
                m1087A.f6102by = ReadInt8;
                this.f5580X = ReadInt7 + 1;
                this.f5512ag = false;
                this.f5581ah = this.f5580X + 1;
                this.f5516am = 0L;
                if (m1300g < 0.1d) {
                    m1587a("resync setCurrentStepRate:" + m1300g + " is too small", true);
                }
                m1619a(m1300g, "rsync");
                this.f5574J = m1300g2;
                return;
            default:
                LogError("we did not handle packet:" + packet.MsgId);
                return;
        }
    }

    /* renamed from: b */
    public synchronized boolean m1540b(Packet packet) {
        Steam steam;
        if (this.IsServer && (steam = packet.steam) != null && !steam.f5781p && packet.MsgId != 105 && packet.MsgId != 110 && packet.MsgId != 111 && packet.MsgId != 108 && packet.MsgId != 160) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public synchronized void HandlePacket(Packet packet) {
        int i;
        String relayId;
        Core m1087A = Core.m1087A();
        if (m1540b(packet)) {
            LogError("filtered packet (type:" + packet.MsgId + ")");
            return;
        }
        switch (packet.MsgId) {
            case 105:
                LogError("got PACKET_GET_SERVER_INFO");
                if (!this.IsServer) {
                    LogError("we are not a server! skipping");
                    return;
                }
                return;
            case 106:
                if (this.IsServer) {
                    LogError("we are a server! we don't follow orders");
                    return;
                }
                Reader reader = new Reader(packet);
                Steam steam = packet.steam;
                reader.ReadUTF();
                reader.ReadInt();
                this.f5603aO.f5654a = (EnumC0846ai) reader.m1308b(EnumC0846ai.class);
                this.f5603aO.f5655b = reader.ReadUTF();
                this.f5603aO.f5656c = reader.ReadInt();
                this.f5603aO.f5657d = reader.ReadInt();
                this.f5603aO.f5658e = reader.ReadBool();
                this.f5603aO.f5659f = reader.ReadInt();
                byte m1304d = reader.m1304d();
                this.f5494G = reader.ReadBool();
                this.f5495H = reader.ReadBool();
                this.f5523aL = true;
                if (m1304d >= 1) {
                    this.f5601aM = reader.ReadInt();
                    this.f5602aN = reader.ReadInt();
                }
                if (m1304d >= 2) {
                    this.f5603aO.f5660g = reader.ReadInt();
                    this.f5603aO.f5661h = reader.m1300g();
                    this.f5603aO.f5662i = reader.ReadBool();
                    this.f5603aO.f5663j = reader.ReadBool();
                }
                if (m1304d >= 3 && reader.ReadBool()) {
                    try {
                        C0453l.m3720a(reader);
                        this.f5568x = true;
                    } catch (C0401bb e) {
                        m1535b("Missing unit:" + e.getMessage() + " d:" + e.f2631b);
                        m1534b("Server sync mismatch", e.getMessage());
                        if (!Core.m1010au()) {
                            m1087A.m969i(e.getMessage());
                        }
                        String str = "Server sync mismatch";
                        if (e.f2488a != null) {
                            str = e.f2488a;
                        }
                        m1087A.m983d(str, e.getMessage());
                        return;
                    }
                }
                if (m1304d >= 4) {
                    this.f5603aO.f5652l = reader.ReadBool();
                }
                if (m1304d >= 5) {
                    this.f5603aO.f5665m = reader.ReadBool();
                }
                if (m1304d >= 6) {
                    this.f5603aO.f5666n = reader.ReadBool();
                }
                if (m1304d >= 7) {
                    this.f5603aO.f5667o = reader.ReadBool();
                    this.f5603aO.f5668p = reader.ReadBool();
                }
                if (m1304d >= 8) {
                    this.f5603aO.f5653q = reader.ReadInt();
                }
                ActivityC0122n.m5601o();
                return;
            case 107:
            case 114:
            case 119:
            case 121:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 162:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 171:
            case SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_POWER /* 177 */:
            default:
                LogError("we did not handle packet:" + packet.MsgId);
                return;
            case 108:
                Steam steam2 = packet.steam;
                Reader reader2 = new Reader(packet);
                long m1298i = reader2.m1298i();
                reader2.m1304d();
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.m1424a(m1298i);
                streamWriter.m1401c(1);
                int m1004b = m1087A.m1004b();
                if (m1004b > 130) {
                    m1004b = 130;
                }
                streamWriter.m1401c(m1004b);
                SendPacket(steam2, streamWriter.m1407b(109));
                return;
            case 109:
                if (!this.IsServer) {
                    LogError("we are not a server! skipping");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Steam steam3 = packet.steam;
                Reader reader3 = new Reader(packet);
                long m1298i2 = reader3.m1298i();
                byte b = 0;
                if (reader3.m1304d() >= 1) {
                    b = reader3.m1304d();
                }
                int i2 = (int) (currentTimeMillis - m1298i2);
                steam3.f5792A = i2;
                steam3.f5793B = currentTimeMillis;
                if (steam3.f5791z != null) {
                    steam3.f5791z.f1346V = i2;
                    steam3.f5791z.f1347W = currentTimeMillis;
                    steam3.f5791z.f1345U = b;
                }
                if (steam3.f5782q && this.IsServer && this.f5492D && this.f5489z != null) {
                    this.f5489z.f1346V = i2;
                    this.f5489z.f1347W = currentTimeMillis;
                }
                if (!this.f5539bm) {
                    ActivityC0122n.m5601o();
                    return;
                }
                return;
            case 110:
                LogError("got REGISTER_CONNECTION");
                if (!this.IsServer) {
                    LogError("we are not a server! skipping");
                    return;
                }
                Reader reader4 = new Reader(packet);
                Steam steam4 = packet.steam;
                reader4.ReadUTF();
                int ReadInt = reader4.ReadInt();
                int ReadInt2 = reader4.ReadInt();
                int ReadInt3 = reader4.ReadInt();
                String ReadUTF = reader4.ReadUTF();
                String ReadString = reader4.ReadString();
                String str2 = null;
                steam4.GameVersion = ReadInt2;
                if (ReadInt >= 1) {
                    steam4.f5803L = reader4.ReadUTF();
                }
                if (ReadInt >= 2) {
                    str2 = reader4.ReadUTF();
                }
                int i3 = -1;
                if (ReadInt >= 3) {
                    i3 = reader4.ReadInt();
                }
                String str3 = "MISSING";
                if (ReadInt >= 4) {
                    str3 = reader4.ReadUTF();
                }
                String str4 = VariableScope.nullOrMissingString;
                if (ReadInt >= 5) {
                    str4 = reader4.ReadUTF();
                }
                if (ReadUTF.length() > 20) {
                    m1596a(steam4, "Your username is too long");
                    steam4.m1355a("kicked");
                    return;
                }
                String m1469o = m1469o(ReadUTF);
                if (m1469o.length() < 2) {
                    m1596a(steam4, "Your username is too short");
                    steam4.m1355a("kicked");
                    return;
                }
                C0187e c0187e = null;
                if (str2 != null) {
                    c0187e = AbstractC0197n.m5077a(str2);
                    if (c0187e != null) {
                        LogError("Existing player: " + c0187e.f1306k + " - " + c0187e.f1316u);
                    }
                }
                C0850aj m1602a = m1602a(steam4);
                if (m1602a != null) {
                    Core.LogDebug2("Connection banned for " + m1602a.m1442b() + " more seconds");
                    m1596a(steam4, m1602a.m1443a());
                    steam4.m1355a("kicked");
                    return;
                }
                String m1650a = this.f5562d.m1650a(steam4, m1469o, ReadInt2, ReadInt3, steam4.f5803L, c0187e);
                if (m1650a != null) {
                    m1596a(steam4, m1650a);
                    steam4.m1355a("kicked");
                    return;
                } else if (ReadInt2 < this.GameVersion && !this.f5566v) {
                    m1596a(steam4, "Game is out of date, please update to v" + m1087A.m952t());
                    steam4.m1355a("kicked");
                    return;
                } else if (ReadInt2 > this.GameVersion && !this.f5566v) {
                    m1596a(steam4, "Your client is newer then the server. Server is on: v" + m1087A.m952t());
                    steam4.m1355a("kicked");
                    return;
                } else if (!this.f5566v && i3 != m1087A.m949y()) {
                    Core.LogDebug2("New Player kicked: Unit checksum mismatch: clientUnitsChecksum=" + i3 + " game.getAllUnitsChecksum():" + m1087A.m949y());
                    m1596a(steam4, "Your core units are different to the server's core units. Game can not be synchronized");
                    steam4.m1355a("kicked");
                    return;
                } else {
                    if (!this.f5566v) {
                        String m1497g = m1497g(steam4.f5804M);
                        if (!m1497g.equals(str3)) {
                            Core.LogDebug2("New Player kicked: Integrity Check Failed: expectedResponse=" + m1497g + " clientResponse=" + str3);
                            m1596a(steam4, "Your 'Rusted Warfare' client is different to the server. Game can not be synchronized.");
                            steam4.m1355a("kicked");
                            return;
                        }
                    }
                    if (!this.f5539bm && this.f5603aO.f5668p) {
                        m1596a(steam4, "Room is locked. New players cannot join this server.");
                        steam4.m1355a("kicked");
                        return;
                    } else if (this.f5539bm && c0187e == null && !this.f5485s) {
                        m1596a(steam4, "A game has already been started on this server");
                        steam4.m1355a("kicked");
                        return;
                    } else if (this.f5481n != null && c0187e == null && !C0758f.m2113e(this.f5481n).equals(ReadString)) {
                        if (ReadString == null) {
                            Core.m997b("processSystemPacket", "Player tried to join but needs a password");
                        } else {
                            Core.m997b("processSystemPacket", "Player tried to join but had an incorrect password");
                        }
                        m1515d(steam4);
                        return;
                    } else {
                        if (!m1491h(this.ServerKey).equals(str4)) {
                            steam4.LogDebug("no extra");
                            steam4.f5805N = true;
                        }
                        if (steam4.f5791z == null) {
                            synchronized (this.f5623bP) {
                                if (c0187e == null) {
                                    i = AbstractC0197n.m5115E();
                                } else {
                                    i = c0187e.f1306k;
                                }
                                if (i == -1 && !this.f5566v) {
                                    m1596a(steam4, "No free slots on server");
                                    steam4.m1355a("no free slots");
                                    return;
                                }
                                String mo411a = this.f5562d.mo411a(steam4, m1469o);
                                if (mo411a != null) {
                                    m1596a(steam4, mo411a);
                                    steam4.m1355a("kicked");
                                } else {
                                    C0857ap.m1433a(steam4);
                                    if (!this.f5566v && steam4.f5806O) {
                                        m1596a(steam4, VariableScope.nullOrMissingString);
                                        steam4.m1355a("kicked");
                                        return;
                                    }
                                    String str5 = null;
                                    if (c0187e != null) {
                                        steam4.f5791z = c0187e;
                                        String str6 = VariableScope.nullOrMissingString;
                                        if (this.f5539bm) {
                                            if (c0187e.m5074b()) {
                                                str6 = " (Spectator)";
                                            } else {
                                                str6 = " (Team " + c0187e.m5025h() + ")";
                                            }
                                        }
                                        m1479j("'" + steam4.f5791z.f1316u + "' reconnected. " + str6);
                                        steam4.f5788w = true;
                                        str5 = c0187e.f1316u;
                                        c0187e.f1339O = steam4.f5778m;
                                    } else {
                                        if (this.f5566v && i == -1) {
                                            steam4.f5791z = new C0187e(-3);
                                        } else {
                                            steam4.f5791z = new C0187e(i);
                                            steam4.f5791z.f1312q = i % 2;
                                        }
                                        if (this.f5539bm && this.f5485s) {
                                            steam4.f5788w = true;
                                        }
                                    }
                                    if (c0187e == null && m1469o != null) {
                                        ArrayList m1550ax = m1550ax();
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < 10) {
                                                boolean z = false;
                                                String str7 = m1469o;
                                                if (i4 > 0) {
                                                    str7 = str7 + "(" + i4 + ")";
                                                }
                                                Iterator it = m1550ax.iterator();
                                                while (it.hasNext()) {
                                                    if (str7.equalsIgnoreCase(((AbstractC0197n) it.next()).f1316u)) {
                                                        z = true;
                                                    }
                                                }
                                                if (z) {
                                                    i4++;
                                                } else {
                                                    m1469o = str7;
                                                }
                                            }
                                        }
                                    }
                                    steam4.f5791z.f1316u = m1469o;
                                    steam4.f5791z.f1338N = str2;
                                    steam4.f5791z.f1339O = steam4.f5778m;
                                    steam4.GameVersion = ReadInt2;
                                    Core.m997b("processSystemPacket", "New player: " + m1469o + ", networkVersion:" + steam4.GameVersion + " existing:" + (c0187e != null));
                                    steam4.f5781p = true;
                                    if (c0187e == null) {
                                        this.f5562d.m1653a(steam4.f5791z);
                                    }
                                    ActivityC0122n.m5601o();
                                    m1507e(steam4);
                                    m1525c(steam4);
                                    this.f5562d.mo400c(steam4, m1469o, str5);
                                    if ((c0187e != null || this.f5485s) && this.f5539bm) {
                                        m1594a(steam4, true);
                                    }
                                }
                                return;
                            }
                        }
                        Core.m997b("processSystemPacket", "This connection already has a player");
                        return;
                    }
                }
            case 111:
                Reader reader5 = new Reader(packet);
                Steam steam5 = packet.steam;
                String str8 = null;
                try {
                    str8 = reader5.ReadUTF();
                } catch (IOException e2) {
                    Core.m1041a("Error reading disconnect reason", (Throwable) e2);
                }
                LogError("Got a disconnect packet:" + str8);
                if (steam5 != null) {
                    steam5.m1352a(false, false, str8);
                }
                if (!this.IsServer) {
                }
                return;
            case 112:
                if (!this.IsServer) {
                    LogError("we are not a server! skipping");
                    return;
                }
                Steam steam6 = packet.steam;
                Reader reader6 = new Reader(packet);
                steam6.f5794C = reader6.ReadBool();
                steam6.f5795D = reader6.ReadBool();
                return;
            case 113:
                if (this.IsServer) {
                    LogError("we are a server! skipping: " + packet.MsgId);
                    return;
                } else {
                    m1607a(f5561bR);
                    return;
                }
            case 115:
                if (this.IsServer) {
                    LogError("we are a server! we don't follow orders");
                    return;
                }
                Reader reader7 = new Reader(packet);
                reader7.m1309b(packet.steam.GameVersion);
                Steam steam7 = packet.steam;
                int ReadInt4 = reader7.ReadInt();
                AbstractC0197n abstractC0197n = null;
                int i5 = 8;
                boolean z2 = false;
                if (reader7.m1306c() >= 90) {
                    boolean z3 = false;
                    if (reader7.m1306c() >= 141) {
                        z3 = true;
                        z2 = reader7.ReadBool();
                    }
                    i5 = reader7.ReadInt();
                    AbstractC0197n.m5071b(i5, false);
                    reader7.m1313a("teams", z3);
                    if (i5 > AbstractC0197n.f1365c) {
                        throw new IOException("Cannot load:" + i5 + " teams");
                    }
                } else if (this.f5539bm) {
                    m1493g("Warning old team system used in started game, stream version:" + reader7.m1306c());
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    C0187e m5017k = AbstractC0197n.m5017k(i6);
                    if (!reader7.ReadBool()) {
                        if (m5017k != null) {
                            if (this.f5539bm) {
                                m1493g("Warning team:" + i6 + " removed while game is running");
                            }
                            m5017k.m5113G();
                        }
                    } else {
                        reader7.ReadInt();
                        if (m5017k == null) {
                            if (this.f5539bm) {
                                m1493g("Warning team:" + i6 + " added while game is running");
                            }
                            if (!this.IsServer && (m5017k instanceof C0136a)) {
                                m1493g("Warning we are a client with an AI team");
                            }
                            m5017k = new C0187e(i6);
                        }
                        if (z2) {
                            m5017k.m5084a(reader7);
                        } else {
                            m5017k.m5083a(reader7, this.f5539bm);
                        }
                    }
                    if (m5017k != null && m5017k.f1306k == ReadInt4) {
                        abstractC0197n = m5017k;
                    }
                }
                if (reader7.m1306c() >= 90) {
                    reader7.m1303d("teams");
                }
                this.f5489z = abstractC0197n;
                this.f5603aO.f5657d = reader7.ReadInt();
                this.f5603aO.f5656c = reader7.ReadInt();
                this.f5603aO.f5658e = reader7.ReadBool();
                this.f5603aO.f5659f = reader7.ReadInt();
                byte m1304d2 = reader7.m1304d();
                this.f5601aM = reader7.ReadInt();
                this.f5602aN = reader7.ReadInt();
                if (m1304d2 >= 2) {
                    this.f5603aO.f5660g = reader7.ReadInt();
                    this.f5603aO.f5661h = reader7.m1300g();
                    this.f5603aO.f5662i = reader7.ReadBool();
                    this.f5603aO.f5663j = reader7.ReadBool();
                }
                if (m1304d2 >= 3 && reader7.ReadBool()) {
                    try {
                        C0453l.m3720a(reader7);
                        this.f5568x = true;
                    } catch (C0401bb e3) {
                        m1535b("Missing unit:" + e3.getMessage() + " d:" + e3.f2631b);
                        m1534b("Connection Failed", e3.getMessage());
                        if (!Core.m1010au()) {
                            m1087A.m969i(e3.getMessage());
                        }
                        m1087A.m983d("Connection Failed", e3.getMessage());
                        return;
                    }
                }
                if (m1304d2 >= 4) {
                    this.f5603aO.f5652l = reader7.ReadBool();
                }
                if (m1304d2 >= 5) {
                    this.f5515al = reader7.ReadBool();
                }
                ActivityC0122n.m5601o();
                return;
            case 116:
                if (this.IsServer) {
                    LogError("we are a server! we don't follow orders");
                    return;
                }
                Reader reader8 = new Reader(packet);
                Steam steam8 = packet.steam;
                reader8.ReadInt();
                boolean ReadBool = reader8.ReadBool();
                if (ReadBool && !this.f5544bu) {
                    this.f5544bu = ReadBool;
                    return;
                }
                return;
            case 117:
                Steam steam9 = packet.steam;
                if (this.IsServer && !steam9.f5782q) {
                    LogError("we are a server! skipping: " + packet.MsgId);
                    return;
                }
                Reader reader9 = new Reader(packet);
                reader9.m1304d();
                int ReadInt5 = reader9.ReadInt();
                String ReadUTF2 = reader9.ReadUTF();
                C0841ae c0841ae = new C0841ae();
                c0841ae.f5643d = true;
                c0841ae.f5642c = ReadInt5;
                c0841ae.f5641b = ReadUTF2;
                m1607a(c0841ae);
                return;
            case 118:
                return;
            case 120:
                if (this.IsServer) {
                    LogError("error, we are a server but got: PACKET_START_GAME");
                    return;
                }
                Reader reader10 = new Reader(packet);
                reader10.m1304d();
                this.f5603aO.f5654a = (EnumC0846ai) reader10.m1308b(EnumC0846ai.class);
                if (this.f5603aO.f5654a == EnumC0846ai.f5671c) {
                    this.f5524aQ = reader10.m1286u();
                } else if (this.f5603aO.f5654a == EnumC0846ai.f5670b) {
                    this.f5525aR = reader10.m1286u();
                }
                this.f5604aP = reader10.ReadUTF();
                m1577aB();
                return;
            case 122:
                if (this.IsServer) {
                    LogError("error, we are a server but got: PACKET_RETURN_TO_BATTLEROOM");
                    return;
                } else {
                    m1576aC();
                    return;
                }
            case 140:
                if (!this.IsServer) {
                    LogError("we are not a server! skipping");
                    return;
                }
                Steam steam10 = packet.steam;
                Reader reader11 = new Reader(packet);
                C0187e c0187e2 = steam10.f5791z;
                if (c0187e2 == null) {
                    if (steam10.f5782q) {
                        LogError("Allowing message from non player on forwarding connection");
                        c0187e2 = this.f5548bA;
                    } else {
                        LogError("player is null for message, skipping");
                        return;
                    }
                }
                String ReadUTF3 = reader11.ReadUTF();
                reader11.m1304d();
                String m1481i = m1481i(ReadUTF3);
                if (this.f5562d.mo410a(steam10, c0187e2.f1316u, m1481i)) {
                    if (this.f5605aS.m1660a(steam10, 60000) > this.f5563h) {
                        if (C0758f.m2198a(steam10.f5772g, System.nanoTime()) > 60000) {
                            steam10.f5772g = System.nanoTime();
                            m1479j("Anti-spam: Too many messages from '" + steam10.m1345e() + "'");
                        }
                        if (this.f5476g) {
                            Core.LogDebug2("extraDebug:" + m1481i);
                            return;
                        }
                        return;
                    }
                    m1599a(steam10, c0187e2, c0187e2.f1316u, m1481i);
                    this.f5562d.mo403b(steam10, c0187e2.f1316u, m1481i);
                    m1537b(steam10, c0187e2, c0187e2.f1316u, m1481i);
                    return;
                }
                return;
            case 141:
                if (this.IsServer && !packet.steam.f5782q) {
                    LogError("error, we are a server but got: PACKET_RECEIVE_CHAT_FROM_SERVER");
                    return;
                }
                Reader reader12 = new Reader(packet);
                String ReadUTF4 = reader12.ReadUTF();
                byte m1304d3 = reader12.m1304d();
                String ReadString2 = reader12.ReadString();
                reader12.ReadInt();
                int i7 = -1;
                if (m1304d3 >= 3) {
                    i7 = reader12.ReadInt();
                }
                m1538b((Steam) null, i7, ReadString2, ReadUTF4);
                return;
            case 150:
                if (this.IsServer) {
                    LogError("error, we are a server but got: PACKET_SEND_KICK");
                    return;
                }
                String m1727c = C0820a.m1727c(new Reader(packet).ReadUTF());
                LogError("we got kicked, reason:" + m1727c);
                m1535b("I was kicked");
                m1534b("Kicked", "Kicked: " + m1727c);
                m1087A.m983d("Kicked", "Kicked: " + m1727c);
                m1087A.m969i("Kicked: " + m1727c);
                return;
            case 151:
                Steam steam11 = packet.steam;
                if (this.IsServer && !steam11.f5782q) {
                    LogError("error, we are a server but got: 151");
                    return;
                }
                long m2440a = C0727bl.m2440a();
                Reader reader13 = new Reader(packet);
                int ReadInt6 = reader13.ReadInt();
                int ReadInt7 = reader13.ReadInt();
                if (reader13.ReadBool()) {
                    C0857ap.f5725i = reader13.ReadInt();
                }
                if (reader13.ReadBool()) {
                    C0857ap.f5726j = reader13.ReadInt();
                }
                String str9 = VariableScope.nullOrMissingString;
                if (ReadInt7 == 0) {
                    str9 = VariableScope.nullOrMissingString + C0857ap.f5725i;
                }
                if (ReadInt7 == 1) {
                    str9 = VariableScope.nullOrMissingString + C0857ap.f5726j;
                }
                if (ReadInt7 == 2) {
                    str9 = m1497g(C0857ap.f5725i);
                }
                if (ReadInt7 == 3) {
                    str9 = C0758f.m2131c(C0857ap.f5725i + "|" + C0857ap.f5726j);
                }
                if (ReadInt7 == 4) {
                    str9 = C0758f.m2131c(C0857ap.f5725i + "|" + C0857ap.f5726j);
                }
                if (ReadInt7 == 5 || ReadInt7 == 6) {
                    String ReadUTF5 = reader13.ReadUTF();
                    String ReadUTF6 = reader13.ReadUTF();
                    int ReadInt8 = reader13.ReadInt();
                    if (ReadInt7 == 6) {
                        ReadUTF6 = ReadUTF6 + C0857ap.f5725i;
                    }
                    if (ReadInt8 > 10000000) {
                        str9 = "max";
                    } else {
                        str9 = "-1";
                        int i8 = 0;
                        while (true) {
                            if (i8 <= ReadInt8) {
                                if (!C0758f.m2131c(ReadUTF6 + i8).equals(ReadUTF5)) {
                                    i8++;
                                } else {
                                    str9 = VariableScope.nullOrMissingString + i8;
                                }
                            }
                        }
                    }
                }
                if (ReadInt7 == 7) {
                    String ReadUTF7 = reader13.ReadUTF();
                    int ReadInt9 = reader13.ReadInt();
                    if (ReadInt9 > 10000) {
                        str9 = "max";
                    } else {
                        str9 = VariableScope.nullOrMissingString;
                        for (int i9 = 0; i9 < ReadInt9; i9++) {
                            str9 = str9 + ReadUTF7;
                        }
                    }
                }
                float m2438a = C0727bl.m2438a(m2440a);
                StreamWriter streamWriter2 = new StreamWriter();
                streamWriter2.WriteInteger(ReadInt6);
                streamWriter2.WriteInteger(ReadInt7);
                streamWriter2.WriteUTF(str9);
                streamWriter2.mo1335a(m2438a);
                SendPacket(steam11, streamWriter2.m1407b(152));
                return;
            case 160:
                Reader reader14 = new Reader(packet); // Preregister Connection
                Steam steam12 = packet.steam;
                reader14.ReadUTF(); // Package name
                int ProtocolVersion = reader14.ReadInt();
                reader14.ReadInt(); // Game Version
                if (ProtocolVersion >= 1) {
                    reader14.ReadInt(); // Another Game Version
                }
                if (steam12.Connected) {
                    Core.LogDebug2("steam: request info packet");
                }
                if (ProtocolVersion >= 2 && (relayId = reader14.ReadString()) != null) { // Relay Id
                    steam12.LogDebug("Using query string: " + relayId);
                    steam12.RelayId = relayId;
                }
                if (ProtocolVersion >= 3) {
                    reader14.ReadUTF(); // Nickname
                }
                if (ProtocolVersion >= 4) {
                    reader14.ReadUTF();
                    String SteamMisc = reader14.ReadUTF();
                    if (Core.m1008aw()) {
                        steam12.LogDebug("Misc: " + SteamMisc);
                    }
                }
                SendRegisterConnection(steam12);
                return;
            case 161:
                if (this.IsServer) { // Register Connection
                    LogError("we are a server! we don't PREREGISTER_INFO");
                    return;
                }
                Reader reader15 = new Reader(packet);
                Steam steam13 = packet.steam;
                if (steam13.Connected) {
                    Core.LogDebug2("steam: got info packet");
                }
                reader15.ReadUTF(); // server id
                int ProtocolVersion2 = reader15.ReadInt();
                int GameVersion = reader15.ReadInt();
                reader15.ReadInt(); // another game version
                reader15.ReadUTF(); // pkg name
                this.ServerUUID = reader15.ReadUTF();
                steam13.GameVersion = GameVersion;
                if (ProtocolVersion2 >= 1) {
                    this.RemoteServerKey = reader15.ReadInt();
                }
                if (ProtocolVersion2 >= 2) {
                    this.f5577U = reader15.ReadInt();
                    this.f5578V = reader15.ReadInt();
                }
                if (this.f5622bN) {
                    LogError("PACKET_SEND_PREREGISTER_INFO: Register connection has already been sent (resending)");
                }
                m1488h(steam13);
                return;
            case 163:
                if (this.IsServer) {
                    LogError("we are already a server");
                    return;
                }
                Reader reader16 = new Reader(packet);
                reader16.m1304d();
                int ReadInt10 = reader16.ReadInt();
                reader16.ReadInt();
                reader16.ReadString();
                LogError("Relay version: " + ReadInt10);
                return;
            case 170:
                LogError("Got 'become server' packet");
                if (this.IsServer) {
                    LogError("we are already a server");
                    return;
                }
                Steam steam14 = packet.steam;
                Reader reader17 = new Reader(packet);
                byte m1304d4 = reader17.m1304d();
                boolean ReadBool2 = reader17.ReadBool();
                boolean ReadBool3 = reader17.ReadBool();
                String ReadString3 = reader17.ReadString();
                boolean ReadBool4 = reader17.ReadBool();
                boolean ReadBool5 = reader17.ReadBool();
                String ReadString4 = reader17.ReadString();
                boolean z4 = false;
                if (m1304d4 >= 1) {
                    z4 = reader17.ReadBool();
                }
                String str10 = null;
                if (m1304d4 >= 2) {
                    str10 = reader17.ReadString();
                }
                LogError("Multicast:" + z4);
                steam14.f5783r = z4;
                if (ReadBool2) {
                    steam14.f5782q = true;
                }
                if (ReadBool3) {
                    steam14.f5784s = true;
                }
                this.f5492D = true;
                this.f5493E = ReadString4;
                m1087A.f6122bX.f5481n = null;
                m1087A.f6122bX.f5482o = ReadBool4;
                m1087A.f6122bX.f5484q = ReadBool5;
                m1521c(false);
                if (str10 != null) {
                    if (this.f5489z != null) {
                        this.f5489z.f1339O = str10;
                    } else {
                        Core.LogDebug2("Become server: No local team");
                    }
                }
                if (m1087A.f6122bX.f5484q) {
                }
                if (ReadString3 != null) {
                    m1087A.settingEngine.networkServerId = ReadString3;
                }
                if (m1087A.f6239bx > 60) {
                    this.f5506aa = true;
                }
                if (!this.f5568x && !this.f5539bm) {
                    Core.LogDebug2("enableAllCustomUnitsPossible mods:" + this.f5482o);
                    C0348af.m4281b(this.f5482o);
                    this.f5568x = true;
                    return;
                }
                return;
            case 172:
                Steam steam15 = packet.steam;
                if (!steam15.f5782q) {
                    LogError("forwarding not allowed on this connection");
                    return;
                }
                LogError("got FORWARD_CLIENT_ADD");
                Reader reader18 = new Reader(packet);
                byte m1304d5 = reader18.m1304d();
                int ReadInt11 = reader18.ReadInt();
                String ReadUTF8 = reader18.ReadUTF();
                String ReadString5 = reader18.ReadString();
                String str11 = null;
                if (m1304d5 >= 1) {
                    str11 = reader18.ReadString();
                }
                if (m1601a(steam15, ReadInt11) != null) {
                    LogError("Not adding client:" + ReadInt11 + " already exists");
                    return;
                } else if (m1600a(steam15, ReadInt11, ReadUTF8, str11) != null && ReadString5 != null) {
                    C0187e m5060b = AbstractC0197n.m5060b(ReadUTF8);
                    if (m5060b == null) {
                        LogError("PACKET_FORWARD_CLIENT_ADD: Failed to find existing player with id:" + ReadUTF8);
                        Iterator it2 = AbstractC0197n.m5058c().iterator();
                        while (it2.hasNext()) {
                            AbstractC0197n abstractC0197n2 = (AbstractC0197n) it2.next();
                            if (abstractC0197n2 != null) {
                                LogError("option: " + abstractC0197n2.f1316u + " - " + abstractC0197n2.f1339O + " - localPlayer:" + (this.f5489z == abstractC0197n2));
                            }
                        }
                        return;
                    }
                    m5060b.f1338N = ReadString5;
                    return;
                } else {
                    return;
                }
            case 173:
                Steam steam16 = packet.steam;
                if (!steam16.f5782q) {
                    LogError("forwarding not allowed on this connection");
                    return;
                }
                LogError("got FORWARD_CLIENT_REMOVE");
                Reader reader19 = new Reader(packet);
                reader19.m1304d();
                Steam m1601a = m1601a(steam16, reader19.ReadInt());
                if (m1601a != null) {
                    m1536b(m1601a, (String) null);
                    return;
                }
                return;
            case 174:
                Steam steam17 = packet.steam;
                if (!steam17.f5782q) {
                    LogError("forwarding not allowed on this connection");
                    return;
                }
                Reader reader20 = new Reader(packet);
                int ReadInt12 = reader20.ReadInt();
                byte[] m1287t = reader20.m1287t();
                Steam m1601a2 = m1601a(steam17, ReadInt12);
                if (m1601a2 == null) {
                    LogError("PACKET_FORWARD_CLIENT_FROM failed, cannot find client");
                    return;
                } else if (!(m1601a2.f5769d instanceof C0873h)) {
                    LogError("PACKET_FORWARD_CLIENT_FROM failed, socket is wrong type");
                    return;
                } else {
                    ((C0873h) m1601a2.f5769d).f5853d.m1320a(m1287t);
                    return;
                }
            case 175:
                LogError("got PACKET_FORWARD_CLIENT_TO");
                return;
            case 176:
                LogError("got PACKET_FORWARD_CLIENT_TO_REPEATED");
                return;
            case SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_INPUT /* 178 */:
                LogError("got PACKET_RECONNECT_TO");
                Steam steam18 = packet.steam;
                if (this.IsServer && !steam18.f5782q) {
                    LogError("we are a server, ");
                    return;
                }
                Reader reader21 = new Reader(packet);
                reader21.m1304d();
                reader21.ReadInt();
                boolean ReadBool6 = reader21.ReadBool();
                int ReadInt13 = reader21.ReadInt();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < ReadInt13; i10++) {
                    arrayList.add(reader21.ReadUTF());
                }
                m1584a(arrayList, ReadBool6);
                return;
        }
    }

    /* renamed from: i */
    public static String m1481i(String str) {
        char[] charArray;
        if (str == null) {
            return null;
        }
        if (str.length() > 250) {
            str = str.substring(0, 250);
        }
        if (str.contains("\n")) {
            str = str.replace("\n", "?");
        }
        String replace = str.replace("��", ".");
        boolean z = false;
        char[] charArray2 = replace.toCharArray();
        int length = charArray2.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (!Character.isISOControl(charArray2[i])) {
                    i++;
                } else {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            for (char c : replace.toCharArray()) {
                if (!Character.isISOControl(c)) {
                    sb.append(c);
                }
            }
            replace = sb.toString();
        }
        return replace;
    }

    /* renamed from: J */
    public void m1638J() {
        Core.m1087A().f6117bS.f5114d.m2027n();
    }

    /* renamed from: K */
    public void m1637K() {
        m1534b((String) null, (String) null);
    }

    /* renamed from: b */
    public void m1534b(String str, String str2) {
        ActivityC0122n.m5606a(str, str2);
        this.f5562d.mo399d();
    }

    /* renamed from: L */
    public synchronized void m1636L() {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5781p) {
                m1525c(steam);
            }
        }
    }

    /* renamed from: c */
    public synchronized void m1525c(Steam steam) {
        if (!this.IsServer) {
            LogError("sendServerInfo: we are not a server!");
            return;
        }
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.WriteUTF("com.corrodinggames.rts");
            streamWriter.WriteInteger(this.GameVersion);
            streamWriter.m1411a(this.f5603aO.f5654a);
            if (this.f5566v) {
                streamWriter.WriteUTF("<CHAT ONLY>");
            } else {
                streamWriter.WriteUTF(this.f5603aO.f5655b == null ? "<NULL>" : C0750a.m2265n(this.f5603aO.f5655b));
            }
            streamWriter.WriteInteger(this.f5603aO.f5656c);
            streamWriter.WriteInteger(this.f5603aO.f5657d);
            streamWriter.mo1329a(this.f5603aO.f5658e);
            streamWriter.WriteInteger(this.f5603aO.f5659f);
            streamWriter.m1401c(8);
            streamWriter.mo1329a(this.f5562d.m1652a(steam));
            streamWriter.mo1329a(this.f5562d.m1649b(steam));
            streamWriter.WriteInteger(this.f5601aM);
            streamWriter.WriteInteger(this.f5602aN);
            streamWriter.WriteInteger(this.f5603aO.f5660g);
            streamWriter.mo1335a(this.f5603aO.f5661h);
            streamWriter.mo1329a(this.f5603aO.f5662i);
            streamWriter.mo1329a(this.f5603aO.f5663j);
            if (this.f5566v) {
                streamWriter.mo1329a(false);
            } else {
                streamWriter.mo1329a(true);
                C0453l.m3721a(streamWriter);
            }
            streamWriter.mo1329a(this.f5603aO.f5652l);
            streamWriter.mo1329a(this.f5603aO.f5665m);
            streamWriter.mo1329a(this.f5603aO.f5666n);
            streamWriter.mo1329a(this.f5603aO.f5667o);
            streamWriter.mo1329a(this.f5603aO.f5668p);
            streamWriter.WriteInteger(this.f5603aO.f5653q);
            SendPacket(steam, streamWriter.m1407b(106));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public synchronized void m1596a(Steam steam, String str) {
        if (!this.IsServer) {
            LogError("sendKick: we are not a server!");
            return;
        }
        LogError("kicking client reason:" + str);
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.WriteUTF(str);
            SendPacket(steam, streamWriter.m1407b(150));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public synchronized void m1515d(Steam steam) {
        if (!this.IsServer) {
            LogError("sendIncorrectPassword: we are not a server!");
            return;
        }
        LogError("sendIncorrectPassword");
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.WriteInteger(0);
            SendPacket(steam, streamWriter.m1407b(113));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: M */
    public void m1635M() {
        if (this.IsServer) {
            for (int i = 0; i < AbstractC0197n.f1368f; i++) {
                AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
                if (m5017k != null) {
                    if (this.f5566v) {
                        m5017k.f1352ab = 0;
                    } else if (m5017k.m5074b()) {
                        m5017k.f1352ab = 100;
                    } else {
                        m5017k.f1352ab = m5017k.f1312q;
                    }
                    if (m5017k.m5074b()) {
                        m5017k.f1324C = -1;
                    } else {
                        int m5104P = m5017k.m5104P();
                        if (m5017k.f1323B != null) {
                            m5104P = m5017k.f1323B.intValue();
                        } else if (m1616a(m5104P, (AbstractC0197n) null)) {
                            m5104P = -1;
                        }
                        m5017k.f1324C = m5104P;
                    }
                }
            }
            for (int i2 = 0; i2 < AbstractC0197n.f1368f; i2++) {
                AbstractC0197n m5017k2 = AbstractC0197n.m5017k(i2);
                if (m5017k2 != null && m5017k2.f1324C == -1 && !m5017k2.m5074b()) {
                    m5017k2.f1324C = m1634N();
                }
            }
        }
    }

    /* renamed from: N */
    public int m1634N() {
        for (int i = 0; i < 10; i++) {
            if (!m1503f(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public boolean m1503f(int i) {
        for (int i2 = 0; i2 < AbstractC0197n.f1368f; i2++) {
            AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
            if (m5017k != null && m5017k.f1324C == i && !m5017k.m5074b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1616a(int i, AbstractC0197n abstractC0197n) {
        for (int i2 = 0; i2 < AbstractC0197n.f1368f; i2++) {
            AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
            if (m5017k != null && m5017k != abstractC0197n && m5017k.f1323B != null && m5017k.f1323B.intValue() == i && !m5017k.m5074b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public void m1633O() {
        if (this.IsServer) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = Core.m1087A().f6102by;
            if (this.f5489z != null && !this.f5492D) {
                this.f5489z.f1346V = -99;
                this.f5489z.f1347W = currentTimeMillis;
            }
            m1635M();
            for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
                if (m5017k != null) {
                    m5017k.m5046c(this.f5489z == m5017k);
                    if (!this.f5539bm) {
                    }
                    if (this.f5539bm && !this.f5571F && !m5017k.f1317v) {
                        boolean z = false;
                        if (m5017k.m5002z()) {
                            z = true;
                        }
                        long j = 60000;
                        if (m5017k.f1349Y > 180000) {
                            j = 160000;
                        }
                        boolean z2 = false;
                        if (this.f5506aa) {
                            if (m5017k.f1348X == -1) {
                                m5017k.f1348X = currentTimeMillis;
                                m5017k.f1349Y = i;
                            }
                            if ((this.f5514ak || this.f5515al) && !m5017k.f1351aa) {
                                m5017k.f1348X = currentTimeMillis;
                                m5017k.f1349Y = i;
                            }
                            if (m5017k.f1348X + j < currentTimeMillis) {
                                z2 = true;
                            }
                        }
                        if (m5017k.f1351aa != z2) {
                            m5017k.f1351aa = z2;
                        }
                        if (z2) {
                            z = true;
                            if (!m5017k.f1350Z) {
                                if (!(m5017k.f1330F || m5017k.f1329E || m5017k.f1333I || m5017k.m5074b())) {
                                    m5017k.f1350Z = true;
                                }
                            }
                        }
                        if (m5017k.f1333I != z) {
                            if (z && !m5017k.f1330F && !m5017k.f1329E && !m5017k.f1332H && !m5017k.m5074b()) {
                                String str = "-t [Sharing control due to disconnect]";
                                if (z2) {
                                    str = "-t [Sharing control due to afk]";
                                }
                                Core.LogDebug2(m5017k.f1316u + " - " + str);
                                if (AbstractC0197n.m5092a(m5017k.f1312q, true) > 1) {
                                    m1599a((Steam) null, m5017k, m5017k.f1316u, str);
                                }
                            }
                            m5017k.f1333I = z;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: P */
    public void m1632P() {
        if (this.f5522aK == 0) {
            this.f5522aK = System.currentTimeMillis();
        }
    }

    /* renamed from: Q */
    public void m1631Q() {
        this.f5522aK = 0L;
        m1507e((Steam) null);
    }

    /* renamed from: e */
    public void m1507e(Steam steam) {
        if (!this.IsServer) {
            LogError("sendUpdatePlayer: we are not a server!");
            return;
        }
        m1633O();
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam2 = (Steam) it.next();
            if (steam2.f5781p) {
                StreamWriter streamWriter = new StreamWriter(steam2.GameVersion);
                try {
                    streamWriter.WriteInteger(steam2.m1349c());
                    int i = AbstractC0197n.f1365c;
                    boolean z = false;
                    if (streamWriter.m1394g() >= 90) {
                        boolean z2 = false;
                        if (streamWriter.m1394g() >= 141) {
                            z2 = true;
                            if (this.f5539bm && steam2.f5808Q) {
                                z = true;
                            }
                            streamWriter.mo1329a(z);
                        }
                        streamWriter.WriteInteger(i);
                        streamWriter.mo1331a("teams", z2);
                    } else {
                        i = 8;
                        if (!this.f5566v) {
                            LogError("sendUpdatePlayer: warning saving with lower team count");
                        }
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
                        streamWriter.mo1329a(m5017k != null);
                        if (m5017k != null) {
                            int i3 = 0;
                            if (m5017k instanceof C0136a) {
                                i3 = 1;
                            }
                            streamWriter.WriteInteger(i3);
                            if (z) {
                                m5017k.m5049c(streamWriter);
                            } else {
                                m5017k.m5064b(streamWriter);
                            }
                        }
                    }
                    if (streamWriter.m1394g() >= 90) {
                        streamWriter.mo1332a("teams");
                    }
                    streamWriter.WriteInteger(this.f5603aO.f5657d);
                    streamWriter.WriteInteger(this.f5603aO.f5656c);
                    streamWriter.mo1329a(this.f5603aO.f5658e);
                    streamWriter.WriteInteger(this.f5603aO.f5659f);
                    streamWriter.m1401c(5);
                    streamWriter.WriteInteger(this.f5601aM);
                    streamWriter.WriteInteger(this.f5602aN);
                    streamWriter.WriteInteger(this.f5603aO.f5660g);
                    streamWriter.mo1335a(this.f5603aO.f5661h);
                    streamWriter.mo1329a(this.f5603aO.f5662i);
                    streamWriter.mo1329a(this.f5603aO.f5663j);
                    streamWriter.mo1329a(false);
                    streamWriter.mo1329a(this.f5603aO.f5652l);
                    streamWriter.mo1329a(this.f5515al);
                    int i4 = -1;
                    if (steam == steam2 && steam2.GameVersion <= 26) {
                        i4 = 1000;
                    }
                    steam2.f5808Q = true;
                    SendPacket(steam2, streamWriter.m1425a(115, i4));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: R */
    public synchronized boolean m1630R() {
        if (m1629S()) {
            this.f5483p = true;
            this.f5603aO.f5657d = 0;
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public synchronized boolean m1629S() {
        if (this.lock1) {
            m1535b("Started singleplayer");
        }
        Core m1087A = Core.m1087A();
        m1465r();
        this.lock1 = true;
        this.IsServer = true;
        this.f5571F = true;
        this.f5603aO.f5654a = m1087A.m1018am();
        this.f5603aO.f5655b = m1087A.m1019al();
        m1573aa();
        this.f5489z = m1087A.f6099bs;
        ActivityC0122n.m5601o();
        this.socketPort = m1087A.settingEngine.networkPort;
        LogError("singleplayer server started");
        return true;
    }

    /* renamed from: aA */
    private void m1578aA() {
        this.f5603aO.f5653q = C0758f.m2203a(1, 1000000000);
    }

    /* renamed from: b */
    public synchronized boolean m1532b(boolean z) {
        if (this.lock1) {
            throw new RuntimeException("networking already started");
        }
        m1466q();
        this.lock1 = true;
        this.IsServer = true;
        m1573aa();
        m1578aA();
        Core m1087A = Core.m1087A();
        m1521c(z);
        ActivityC0122n.m5601o();
        this.socketPort = m1087A.settingEngine.networkPort;
        C1058a.m747a().mo280i();
        this.f5527aU = new RunnableC0854an(this);
        try {
            this.f5527aU.m1437a(false);
            this.f5526aT = new Thread(this.f5527aU);
            this.f5526aT.setDaemon(true);
            this.f5526aT.start();
            if (1 != 0) {
                this.f5529aW = new RunnableC0854an(this);
                try {
                    this.f5529aW.m1437a(true);
                    this.f5528aV = new Thread(this.f5529aW);
                    this.f5528aV.start();
                } catch (IOException e) {
                    e.printStackTrace();
                    m1087A.m1045a("Could not open udp port:" + this.socketPort + ", check this port is not in use or change the port in the game settings", 1);
                    m1535b("Could not open udp port");
                    return false;
                }
            }
            m1561am();
            if (this.f5484q) {
                C0879n.m1265b();
            }
            this.f5538bl = null;
            if (f5560r) {
                C0879n.m1281a();
            }
            LogError("server started");
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            m1087A.m1045a("Could not open tcp port:" + this.socketPort + ", check this port is not in use or change the port in the game settings", 1);
            m1535b("Could not open tcp port");
            return false;
        }
    }

    /* renamed from: c */
    public void m1521c(boolean z) {
        int i;
        this.IsServer = true;
        Core m1087A = Core.m1087A();
        if (this.f5489z == null) {
            C0187e c0187e = null;
            if (!z) {
                i = AbstractC0197n.m5115E();
                if (i == -1) {
                    throw new RuntimeException("playerId is -1 for server player");
                }
            } else {
                c0187e = this.f5548bA;
                i = this.f5548bA.f1306k;
            }
            if (c0187e == null) {
                c0187e = new C0187e(i);
                c0187e.f1316u = this.f5487y;
                m1087A.f6099bs = c0187e;
            }
            this.f5489z = c0187e;
        }
        if (this.f5531aY == null) {
            Core.LogDebug2("pingerTask starting");
            this.f5531aY = new C0862au(this);
            this.f5530aX = new Timer();
            this.f5530aX.schedule(this.f5531aY, 100L, 100L);
        } else {
            Core.LogDebug2("pingerTask already active");
        }
        ActivityC0122n.m5601o();
    }

    /* renamed from: T */
    public boolean m1628T() {
        return Core.m1087A().settingEngine.udpInMultiplayer;
    }

    /* renamed from: a */
    public RunnableC0853am m1586a(String str, boolean z, Runnable runnable) {
        RunnableC0853am runnableC0853am = new RunnableC0853am(str, z, runnable);
        runnableC0853am.m1440b();
        return runnableC0853am;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.net.Socket] */
    /* renamed from: b */
    public static Socket m1533b(String str, boolean z) {
        C0017h c0017h;
        String str2;
        Core m1087A = Core.m1087A();
        Core.LogDebug2("Connect to server: " + str + " (force tcp:" + z + ")");
        boolean z2 = false;
        String trim = str.trim();
        if (trim.startsWith("get|")) {
            String[] split = trim.split("\\|");
            try {
                String str3 = split[0];
                String str4 = split[1];
                int parseInt = Integer.parseInt(split[2]);
                boolean parseBoolean = Boolean.parseBoolean(split[3]);
                Integer.parseInt(split[4]);
                if (parseBoolean) {
                    m1087A.f6122bX.f5481n = null;
                    final Object obj = new Object();
                    C0841ae c0841ae = new C0841ae() { // from class: com.corrodinggames.rts.gameFramework.i.ad.1
                        @Override // com.corrodinggames.rts.gameFramework.p041i.C0841ae
                        /* renamed from: a */
                        public void mo1455a(String str5) {
                            Core m1087A2 = Core.m1087A();
                            Core.LogDebug2("Entered password");
                            if (m1087A2.f6122bX.IsServer) {
                                Core.m1046a("Cannot enter a password when we are a server");
                            } else {
                                m1087A2.f6122bX.f5481n = str5;
                            }
                            synchronized (obj) {
                                obj.notify();
                            }
                        }

                        @Override // com.corrodinggames.rts.gameFramework.p041i.C0841ae
                        /* renamed from: a */
                        public void mo1456a() {
                            synchronized (obj) {
                                obj.notify();
                            }
                        }
                    };
                    Core.LogDebug2("Asking for password..");
                    synchronized (obj) {
                        m1607a(c0841ae);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (m1087A.f6122bX.f5481n == null) {
                        Core.m998b("No password entered");
                        throw new C0844ag();
                    }
                    Core.LogDebug2("Password has been entered");
                }
                String str5 = null;
                if (parseBoolean) {
                    str5 = m1087A.f6122bX.f5481n;
                    if (str5 == null) {
                        throw new IOException("This server requires a password but no password was provided");
                    }
                }
                final Object obj2 = new Object();
                C0890w c0890w = new C0890w() { // from class: com.corrodinggames.rts.gameFramework.i.ad.2
                    @Override // com.corrodinggames.rts.gameFramework.p041i.C0890w
                    /* renamed from: a */
                    public void mo1254a(String str6) {
                        super.mo1254a(str6);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }

                    @Override // com.corrodinggames.rts.gameFramework.p041i.C0890w
                    /* renamed from: a */
                    public void mo1253a(String str6, EnumC0891x enumC0891x, Exception exc) {
                        super.mo1253a(str6, enumC0891x, exc);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }
                };
                synchronized (obj2) {
                    C0879n.m1278a(c0890w, str4, parseInt, str5);
                    try {
                        obj2.wait(15000L);
                    } catch (InterruptedException e2) {
                    }
                }
                if (c0890w.f5904b != null) {
                    throw new IOException(c0890w.f5904b);
                }
                if (c0890w.f5903a == null) {
                    throw new IOException("Failed to get game server info.");
                }
                return m1533b(c0890w.f5903a, z);
            } catch (NumberFormatException e3) {
                e3.printStackTrace();
                throw new IOException("Bad server connect string");
            }
        }
        if (trim.toLowerCase(Locale.ENGLISH).endsWith(".relay")) {
            trim = trim + ".corrodinggames.com";
        }
        if (trim.startsWith("[TCP]")) {
            trim = trim.substring("[TCP]".length());
            z = true;
        }
        if (trim.length() > 4 && !trim.contains(":") && !trim.contains(".") && !trim.equals("localhost") && !trim.contains("/") && !trim.contains("\\")) {
            String str6 = (VariableScope.nullOrMissingString + trim.charAt(0)) + ".relay.corrodinggames.com/" + trim;
            Core.LogDebug2("Converting connect string to: " + str6);
            trim = str6;
        }
        m1087A.f6122bX.f5497L = null;
        if (trim.contains("/") || trim.contains("\\")) {
            int indexOf = trim.indexOf("/");
            int indexOf2 = trim.indexOf("\\");
            if (indexOf == -1) {
                indexOf = trim.length();
            }
            if (indexOf2 == -1) {
                indexOf2 = trim.length();
            }
            int m2132c = C0758f.m2132c(indexOf, indexOf2);
            String trim2 = trim.substring(m2132c + 1).trim();
            if (!trim2.equals(VariableScope.nullOrMissingString)) {
                m1087A.f6122bX.f5497L = trim2;
            }
            trim = trim.substring(0, m2132c);
        }
        String str7 = trim;
        int i = 5123;
        String[] split2 = trim.split(":");
        if (split2.length > 1) {
            str7 = null;
            for (int i2 = 0; i2 < split2.length - 1; i2++) {
                if (str7 == null) {
                    str2 = VariableScope.nullOrMissingString;
                } else {
                    str2 = str7 + ":";
                }
                str7 = str2 + split2[i2];
            }
            String str8 = split2[split2.length - 1];
            try {
                i = Integer.parseInt(str8);
            } catch (NumberFormatException e4) {
                String str9 = "Bad port number:" + str8;
                e4.printStackTrace();
                throw new IOException(str9);
            }
        }
        if (!z && m1087A.f6122bX.m1628T()) {
            z2 = true;
        }
        int i3 = 7000;
        Core.LogDebug2(VariableScope.nullOrMissingString);
        Core.LogDebug2("===============================");
        Core.LogDebug2("Connect to: " + trim);
        if (!z2) {
            c0017h = new Socket();
            Core.LogDebug2("connecting to Server.. (tcp)");
        } else {
            c0017h = new C0017h();
            Core.LogDebug2("connecting to Server.. (udp)");
            i3 = 5000;
        }
        c0017h.setTcpNoDelay(true);
        try {
            try {
                c0017h.connect(new InetSocketAddress(InetAddress.getByName(str7), i), i3);
                return c0017h;
            } catch (UnknownHostException e5) {
                String str10 = "Failed to connect to host";
                if (z2) {
                    str10 = str10 + " (udp)";
                }
                Core.LogDebug2("UnknownHostException.." + str10);
                e5.printStackTrace();
                throw new IOException(str10, e5);
            } catch (IOException e6) {
                String str11 = "Failed to connect to host";
                if (z2) {
                    str11 = str11 + " (udp)";
                }
                String str12 = str11 + " - " + e6.getMessage();
                Core.LogDebug2("IOException.." + str12);
                e6.printStackTrace();
                throw new IOException(str12, e6);
            }
        } catch (IllegalArgumentException e7) {
            Core.m998b("IllegalArgumentException..Incorrect server format");
            e7.printStackTrace();
            throw new IOException("Incorrect server format", e7);
        }
    }

    /* renamed from: U */
    public void m1627U() {
        final Core m1087A = Core.m1087A();
        final C0767e m2013a = C0767e.m2013a(C0820a.m1731a("menus.ingame.multiplayerReconnect.message", new Object[0]), false);
        m2013a.m2014a(C0820a.m1731a("menus.ingame.resume", new Object[0]), new AbstractC0772i() { // from class: com.corrodinggames.rts.gameFramework.i.ad.3
            @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i
            /* renamed from: a */
            public boolean mo1454a(C0765c c0765c) {
                m2013a.m1977i();
                return true;
            }
        });
        m2013a.m2014a(C0820a.m1731a("menus.ingame.reconnect", new Object[0]), new AbstractC0772i() { // from class: com.corrodinggames.rts.gameFramework.i.ad.4
            @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i
            /* renamed from: a */
            public boolean mo1454a(C0765c c0765c) {
                m2013a.m1977i();
                C0831ad.this.m1626V();
                return true;
            }
        });
        m2013a.m2014a(C0820a.m1731a("menus.ingame.disconnect", new Object[0]), new AbstractC0772i() { // from class: com.corrodinggames.rts.gameFramework.i.ad.5
            @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i
            /* renamed from: a */
            public boolean mo1454a(C0765c c0765c) {
                m2013a.m1977i();
                m1087A.m1047a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.i.ad.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0831ad.this.m1535b("already disconnected");
                        m1087A.f6117bS.f5114d.m2028m();
                    }
                });
                return true;
            }
        });
        m1087A.f6117bS.m1873a(m2013a);
        this.f5553bL = true;
    }

    /* renamed from: V */
    public synchronized boolean m1626V() {
        Socket socket = this.globalSocket;
        if (socket == null) {
            Core.LogDebug2("reconnectToServer: lastConnectedTo==null");
            return false;
        }
        Core.LogDebug2("reconnectToServer attempted");
        if (this.lock1) {
            Core.LogDebug2("reconnectToServer: disconnecting");
            m1535b("reconnecting");
        }
        if (socket.getInetAddress() == null) {
            Core.LogDebug2("reconnectToServer: lastConnectedTo.getInetAddress()==null");
            return false;
        }
        String str = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
        Core.LogDebug2("reconnectToServer: connecting to: " + str);
        try {
            return m1585a(m1533b(str, false));
        } catch (C0844ag e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public synchronized boolean m1585a(Socket socket) {
        if (this.lock1) {
            m1535b("starting new");
        }
        if (socket == null) {
            throw new RuntimeException("connectedSocket==null");
        }
        m1466q();
        Core.m1087A();
        this.socketPort = socket.getPort();
        this.lock1 = true;
        this.IsServer = false;
        LogError("connected to Server..");
        Steam steam = new Steam(this, socket);
        steam.f5781p = true;
        steam.m1347d();
        this.f5606bc.add(steam);
        SendPreregisterConnection(steam);
        m1561am();
        this.globalSocket = socket;
        return true;
    }

    /* renamed from: c */
    public Steam m1528c(AbstractC0197n abstractC0197n) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5791z == abstractC0197n) {
                return steam;
            }
        }
        return null;
    }

    /* renamed from: d */
    public Steam m1517d(AbstractC0197n abstractC0197n) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (!steam.f5766a && steam.f5791z == abstractC0197n) {
                return steam;
            }
        }
        return null;
    }

    /* renamed from: W */
    public Steam m1625W() {
        if (this.IsServer) {
            return null;
        }
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (!steam.f5766a) {
                return steam;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m1516d(Packet packet) {
        if (!this.lock1) {
            Core.LogDebug2("Skipping sendPacketToAll, not networked");
        } else {
            m1483i(packet);
        }
    }

    /* renamed from: i */
    private void m1483i(Packet packet) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5781p && !steam.f5766a && !steam.f5784s) {
                steam.m1358a(packet);
            }
        }
    }

    /* renamed from: e */
    public void m1508e(Packet packet) {
        if (!this.lock1) {
            Core.LogDebug2("Skipping sendPacketToAllIncludingRelay, not networked");
            return;
        }
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5781p && !steam.f5766a) {
                steam.m1358a(packet);
            }
        }
    }

    /* renamed from: f */
    public void sendPacketToServer(Packet packet) {
        if (!this.lock1) {
            Core.LogDebug2("Skipping sendPacketToServer, not networked");
        } else if (this.IsServer) {
            throw new RuntimeException("We are a server");
        } else {
            m1516d(packet);
        }
    }

    /* renamed from: g */
    public void m1495g(Packet packet) {
        if (!this.lock1) {
            Core.LogDebug2("Skipping sendPacketToClients, not networked");
        } else if (!this.IsServer) {
            throw new RuntimeException("We are not a server");
        } else {
            m1508e(packet);
        }
    }

    /* renamed from: h */
    public void m1489h(Packet packet) {
        if (!this.lock1) {
            Core.LogDebug2("Skipping sendPacketToClients, not networked");
        } else if (!this.IsServer) {
            throw new RuntimeException("We are not a server");
        } else {
            m1516d(packet);
        }
    }

    /* renamed from: a */
    public void SendPacket(Steam steam, Packet packet) {
        if (!this.lock1) {
            Core.LogDebug2("Skipping sendPacketOnConnection, not networked");
        } else {
            steam.m1358a(packet);
        }
    }

    /* renamed from: X */
    public void m1624X() {
        if (this.IsServer) {
            LogError("registerConnection: We are a server");
        }
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            m1488h((Steam) it.next());
        }
    }

    /* renamed from: Y */
    public void m1623Y() {
        Core m1087A = Core.m1087A();
        m1087A.settingEngine.networkClientId = null;
        if (this.ServerUUID == null) {
            Core.LogDebug2("generateNewClientId: serverUUID==null");
            this.ServerUUID = "x";
        }
        m1622Z();
        m1087A.settingEngine.save();
    }

    /* renamed from: Z */
    public String m1622Z() {
        Core m1087A = Core.m1087A();
        boolean z = false;
        if (m1087A.settingEngine.networkClientId == null) {
            z = true;
        }
        if (!this.f5621bM) {
            this.f5621bM = true;
            if (Core.m1010au()) {
                String m1563ak = m1563ak();
                if (!m1563ak.equals(m1087A.settingEngine.networkClientIdMachineKey)) {
                    if (m1087A.settingEngine.networkClientIdMachineKey != null) {
                        Core.LogDebug2("Machine appears to have changed: " + m1087A.settingEngine.networkClientIdMachineKey + " vs " + m1563ak);
                    }
                    m1087A.settingEngine.networkClientIdMachineKey = m1563ak;
                    z = true;
                }
            }
        }
        if (z) {
            Core.LogDebug2("new networkClientId needed");
            m1087A.settingEngine.networkClientId = UUID.randomUUID().toString();
            m1087A.settingEngine.save();
        }
        String str = m1087A.settingEngine.networkClientId;
        if (this.ServerUUID == null) {
            throw new RuntimeException("getOwnClientIdHashed: serverUUID==null");
        }
        return C0758f.m2113e(str + this.ServerUUID);
    }

    /* renamed from: aa */
    public void m1573aa() {
        Core m1087A = Core.m1087A();
        m1087A.settingEngine.networkServerId = UUID.randomUUID().toString();
        m1087A.settingEngine.save();
    }

    /* renamed from: ab */
    public String m1572ab() {
        Core m1087A = Core.m1087A();
        if (m1087A.settingEngine.networkServerId == null) {
            m1573aa();
        }
        return m1087A.settingEngine.networkServerId;
    }

    /* renamed from: ac */
    public String m1571ac() {
        Core m1087A = Core.m1087A();
        if (this.IsServer) {
            return m1087A.settingEngine.networkServerId;
        }
        return this.ServerUUID;
    }

    /* renamed from: f */
    public void SendPreregisterConnection(Steam steam) {
        StreamWriter streamWriter = new StreamWriter();
        try {
            int i = 1;
            if (Core.m1010au()) {
                i = 2;
            }
            if (Core.f6210aZ) {
                i = 3;
            }
            streamWriter.WriteUTF("com.corrodinggames.rts");
            streamWriter.WriteInteger(4);
            streamWriter.WriteInteger(this.GameVersion);
            streamWriter.WriteInteger(i);
            streamWriter.m1404b(this.f5497L);
            streamWriter.WriteUTF(this.f5487y);
            streamWriter.WriteUTF(C0820a.m1728c());
            String str = VariableScope.nullOrMissingString;
            if (Core.f6204aT) {
                str = str + "d";
            }
            streamWriter.WriteUTF(str);
            SendPacket(steam, streamWriter.m1407b(160));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void SendRegisterConnection(Steam steam) {
        StreamWriter streamWriter = new StreamWriter();
        try {
            Core m1087A = Core.m1087A();
            streamWriter.WriteUTF("com.corrodinggames.rts"); // Server id
            streamWriter.WriteInteger(2); // Protocol version
            streamWriter.WriteInteger(this.GameVersion); // Game version
            streamWriter.WriteInteger(m1087A.m988c(true)); // Another game version
            streamWriter.WriteUTF(m1087A.m966k()); // Pkg name
            streamWriter.WriteUTF(m1572ab()); // ServerUUID
            streamWriter.WriteInteger(steam.f5804M);
            streamWriter.WriteInteger(this.ServerKey);
            streamWriter.WriteInteger(0);
            SendPacket(steam, streamWriter.m1407b(161));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public void m1488h(Steam steam) {
        Core.LogDebug2("sendRegisterConnection...");
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.WriteUTF("com.corrodinggames.rts");
            streamWriter.WriteInteger(5);
            streamWriter.WriteInteger(this.GameVersion);
            Core m1087A = Core.m1087A();
            streamWriter.WriteInteger(m1087A.m988c(true));
            streamWriter.WriteUTF(this.f5487y);
            String str = null;
            if (this.f5481n != null) {
                str = C0758f.m2113e(this.f5481n);
            }
            streamWriter.m1404b(str);
            streamWriter.WriteUTF(m1087A.m966k());
            streamWriter.WriteUTF(m1622Z());
            streamWriter.WriteInteger(m1087A.m949y());
            streamWriter.WriteUTF(m1497g(this.RemoteServerKey));
            streamWriter.WriteUTF(m1491h(this.f5577U));
            SendPacket(steam, streamWriter.m1407b(110));
            this.f5622bN = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public String m1497g(int i) {
        String str = (((((((((((VariableScope.nullOrMissingString + "c:" + i) + "m:" + ((i * 87) + 24)) + "0:" + (m1510e(0) * 11 * i)) + "1:" + ((m1510e(1) * 12) + i)) + "2:" + (m1510e(2) * 13 * i)) + "3:" + ((m1510e(3) * 14) + i)) + "4:" + (m1510e(4) * 15 * i)) + "5:" + ((m1510e(5) * 16) + i)) + "6:" + (m1510e(6) * 17 * i)) + "7:" + (m1510e(7) * 18 * i)) + "8:" + (m1510e(8) * 19 * i)) + "t1:" + (AbstractC0197n.f1373j.f1310o * 11.0d * i);
        int i2 = 5 * i;
        if (m1478k() != m1510e(this.f5603aO.f5656c)) {
            i2 = 7 * i;
        }
        return str + "d:" + i2;
    }

    /* renamed from: h */
    public String m1491h(int i) {
        return C0758f.m2095h(i);
    }

    /* renamed from: ad */
    public void m1570ad() {
        if (this.IsServer) {
            throw new RuntimeException("We are a server");
        }
        Core m1087A = Core.m1087A();
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.mo1329a(this.f5488bT);
            streamWriter.mo1329a(m1087A.f6235bq);
            sendPacketToServer(streamWriter.m1407b(112));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public void m1479j(String str) {
        if (!this.IsServer) {
            LogError("cannot send sendSystemMessage:" + str + ", we are not a server");
        } else if (!this.lock1 || this.f5571F) {
            LogError("cannot send sendSystemMessage:" + str + ", not networked");
        } else {
            Core.LogDebug2("sendSystemMessage:" + str);
            m1599a((Steam) null, (AbstractC0197n) null, (String) null, str);
        }
    }

    /* renamed from: k */
    public void m1477k(String str) {
        m1473m("-qc " + str);
    }

    /* renamed from: l */
    public void m1475l(String str) {
        boolean z = true;
        String str2 = null;
        if (str != null) {
            String trim = str.trim();
            if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
                String trim2 = trim.substring(1).trim();
                int indexOf = trim2.indexOf(" ");
                if (indexOf == -1) {
                    indexOf = trim2.length();
                }
                str2 = trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
            }
        }
        if ("share".equals(str2)) {
            z = false;
        }
        if ("t".equals(str2)) {
            z = false;
        }
        if (z) {
            str = "-t " + str;
        }
        m1473m(str);
    }

    /* renamed from: m */
    public void m1473m(String str) {
        if (!this.lock1) {
            Core.LogDebug2("sendChatMessage: not networked:" + str);
            m1538b((Steam) null, -1, (String) null, str);
        } else if (this.IsServer) {
            m1599a((Steam) null, this.f5489z, this.f5487y, str);
            m1537b((Steam) null, this.f5489z, this.f5487y, str);
        } else {
            try {
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.WriteUTF(str);
                streamWriter.m1401c(0);
                sendPacketToServer(streamWriter.m1407b(140));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public void m1599a(Steam steam, AbstractC0197n abstractC0197n, String str, String str2) {
        m1598a(steam, abstractC0197n, str, str2, null);
    }

    /* renamed from: a */
    public void m1598a(Steam steam, AbstractC0197n abstractC0197n, String str, String str2, Steam steam2) {
        C0187e c0187e;
        try {
            boolean z = false;
            boolean z2 = false;
            String m1471n = m1471n(str2);
            if ("t".equalsIgnoreCase(m1471n)) {
                if (abstractC0197n != null) {
                    z = true;
                    str2 = "[TEAM] " + str2.substring("-t".length());
                } else {
                    Core.m998b("toOnlyTeams failed team==null");
                }
            }
            if (abstractC0197n != null && "surrender".equalsIgnoreCase(m1471n)) {
                z = true;
                str2 = "[TEAM] " + str2;
            }
            if (abstractC0197n != null && "i".equalsIgnoreCase(m1471n)) {
                z2 = true;
                str2 = "[INFO] " + str2.substring("-i".length());
            }
            if (abstractC0197n != null && "qc".equalsIgnoreCase(m1471n)) {
                z2 = true;
                str2 = "[COMMAND] " + str2.substring("-qc".length());
            }
            if (!z2 && abstractC0197n != null && abstractC0197n != this.f5547bz && abstractC0197n != this.f5548bA && !this.f5562d.m1651a(steam, abstractC0197n, str2, z)) {
                z2 = true;
            }
            StreamWriter streamWriter = new StreamWriter();
            streamWriter.WriteUTF(str2);
            streamWriter.m1401c(3);
            streamWriter.m1404b(str);
            streamWriter.m1418a(steam);
            int i = -1;
            if (abstractC0197n != null) {
                i = abstractC0197n.f1306k;
            }
            streamWriter.WriteInteger(i);
            Packet m1407b = streamWriter.m1407b(141);
            if (z) {
                Iterator it = this.f5606bc.iterator();
                while (it.hasNext()) {
                    Steam steam3 = (Steam) it.next();
                    if (steam3.f5781p && !steam3.f5766a && (c0187e = steam3.f5791z) != null && c0187e.m5042d(abstractC0197n)) {
                        steam3.m1358a(m1407b);
                    }
                }
                AbstractC0197n abstractC0197n2 = this.f5489z;
                if (abstractC0197n2 != null && abstractC0197n2.m5042d(abstractC0197n)) {
                    m1538b(steam, i, str, str2);
                }
            } else if (z2) {
                Core.m998b("info message:" + m1522c(str, str2));
            } else {
                if (steam2 != null) {
                    SendPacket(steam2, m1407b);
                } else {
                    m1495g(m1407b);
                }
                m1538b(steam, i, str, str2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public static String m1471n(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
            String trim2 = trim.substring(1).trim();
            int indexOf = trim2.indexOf(" ");
            if (indexOf == -1) {
                indexOf = trim2.length();
            }
            return trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
        }
        return null;
    }

    /* renamed from: c */
    public static String m1522c(String str, String str2) {
        if (str != null) {
            return str + ": " + str2;
        }
        return str2;
    }

    /* renamed from: b */
    private void m1538b(Steam steam, int i, String str, String str2) {
        if (!this.lock1 && str2.startsWith("-i ")) {
            return;
        }
        if (!this.lock1 && str2.startsWith("-qc ")) {
            return;
        }
        String m1727c = C0820a.m1727c(str2);
        if (str != null) {
            m1513d("New Message", str + ": " + m1727c);
        }
        Steam steam2 = null;
        if (this.IsServer) {
            steam2 = steam;
        }
        this.f5605aS.m1661a(i, str, m1727c, steam2);
        this.f5562d.mo413a(i, str, m1727c, steam);
        boolean z = false;
        if (this.f5539bm) {
            z = true;
        }
        if (!this.lock1) {
            z = true;
        }
        if (z) {
            m1588a(str, m1727c);
            return;
        }
        String m1522c = m1522c(str, m1727c);
        if (!Core.f6205aU) {
            ActivityC0122n.m5605d(m1522c);
        }
    }

    /* renamed from: a */
    public void m1593a(Steam steam, byte[] bArr, boolean z, boolean z2) {
        Core m1087A = Core.m1087A();
        try {
            StreamWriter streamWriter = new StreamWriter();
            streamWriter.m1401c(0);
            streamWriter.WriteInteger(m1087A.f6239bx);
            streamWriter.WriteInteger(m1087A.f6102by);
            streamWriter.mo1335a(m1531c());
            streamWriter.mo1335a(1.0f);
            streamWriter.mo1329a(z);
            streamWriter.mo1329a(z2);
            streamWriter.m1396e("gameSave");
            streamWriter.m1403b(bArr);
            streamWriter.mo1332a("gameSave");
            SendPacket(steam, streamWriter.m1407b(35));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m1580a(boolean z, boolean z2, boolean z3) {
        Core m1087A = Core.m1087A();
        try {
            StreamWriter streamWriter = new StreamWriter();
            streamWriter.m1401c(0);
            streamWriter.WriteInteger(m1087A.f6239bx);
            streamWriter.WriteInteger(m1087A.f6102by);
            streamWriter.mo1335a(m1531c());
            streamWriter.mo1335a(1.0f);
            streamWriter.mo1329a(z);
            streamWriter.mo1329a(z2);
            streamWriter.m1396e("gameSave");
            m1087A.f6125ca.m428a(streamWriter);
            streamWriter.mo1332a("gameSave");
            if (z) {
            }
            Packet m1407b = streamWriter.m1407b(35);
            m1516d(m1407b);
            if (z3) {
                if (!this.IsServer) {
                    throw new RuntimeException("sendResyncSave: reloadCreatedSave: We are not a server");
                }
                m1407b.steam = this.f5626bb;
                m1603a(m1407b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ae */
    public boolean m1569ae() {
        m1631Q();
        m1636L();
        return m1594a((Steam) null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m1594a(com.corrodinggames.rts.gameFramework.p041i.Steam r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p041i.C0831ad.m1594a(com.corrodinggames.rts.gameFramework.i.c, boolean):boolean");
    }

    /* renamed from: af */
    public void m1568af() {
        this.f5542bs = true;
        Core.LogDebug2("onStartGameFailed");
        if (this.IsServer) {
            this.f5539bm = false;
            m1479j("Map load failed.");
            return;
        }
        m1535b("Map load failed");
    }

    /* renamed from: aB */
    private void m1577aB() {
        this.f5611bo = false;
        this.f5539bm = true;
        this.f5542bs = false;
        this.f5543bt = false;
        Core.LogDebug2("Starting new network game (" + m1571ac() + ")");
        if (this.f5484q && this.IsServer) {
            C0879n.m1262c();
        }
        if (!Core.f6205aU) {
            ActivityC0122n.m5600p();
        }
        this.f5562d.mo405b();
    }

    /* renamed from: ag */
    public void m1567ag() {
        m1530c(5.0f);
    }

    /* renamed from: c */
    public void m1530c(float f) {
        if (!this.IsServer) {
            throw new RuntimeException("We are not a server");
        }
        if (this.f5612bp) {
            return;
        }
        Core.LogDebug2("Setting up return to battleroom timer...");
        this.f5540bq = f;
        this.f5612bp = true;
        m1479j("Game ended by host. Returning to battleroom in " + ((int) f) + " seconds...");
    }

    /* renamed from: i */
    public void m1482i(Steam steam) {
        if (!this.IsServer) {
            throw new RuntimeException("We are not a server");
        }
        try {
            StreamWriter streamWriter = new StreamWriter();
            streamWriter.m1401c(0);
            Packet m1407b = streamWriter.m1407b(122);
            if (steam == null) {
                m1489h(m1407b);
            } else {
                SendPacket(steam, m1407b);
            }
            m1576aC();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: aC */
    private void m1576aC() {
        this.f5611bo = true;
    }

    /* renamed from: aD */
    private void m1575aD() {
        Core.LogDebug2("----- returnToBattleroom -----");
        this.f5611bo = false;
        Core m1087A = Core.m1087A();
        m1087A.f6126cb.m2470d();
        AbstractC0197n abstractC0197n = this.f5489z;
        m1464s();
        this.f5489z = abstractC0197n;
        m1087A.f6239bx = 0;
        m1087A.f6102by = 0;
        AbstractC0197n.m5014n();
        if (this.IsServer) {
            m1578aA();
        }
        m1638J();
        if (this.f5484q && this.IsServer) {
            C0879n.m1262c();
        }
        if (!Core.f6205aU) {
        }
    }

    /* renamed from: ah */
    public String m1566ah() {
        ArrayList m1564aj = m1564aj();
        if (m1564aj == null || m1564aj.size() == 0) {
            return null;
        }
        return (String) m1564aj.get(0);
    }

    /* renamed from: ai */
    public String m1565ai() {
        ArrayList m1564aj = m1564aj();
        if (m1564aj == null || m1564aj.size() == 0) {
            return null;
        }
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = m1564aj.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z) {
                z = false;
            } else {
                str = str + ", ";
            }
            str = str + str2;
        }
        return str;
    }

    /* renamed from: aj */
    public ArrayList m1564aj() {
        ArrayList m1512d;
        if (f5554bO != null) {
            return new ArrayList(f5554bO);
        }
        long m2440a = C0727bl.m2440a();
        ArrayList m1512d2 = m1512d(true);
        if (m1512d2 != null && m1512d2.size() > 0) {
            m1512d = m1512d2;
        } else {
            m1512d = m1512d(false);
        }
        double m2438a = C0727bl.m2438a(m2440a);
        if (m2438a > 2.0d) {
            Core.m998b("getLocalIpAddressList was slow, taking:" + C0727bl.m2439a(m2438a));
        }
        if (m2438a > 10.0d && m1512d != null && m1512d.size() > 0) {
            Core.LogDebug2("getLocalIpAddressList: creating cache");
            f5554bO = new ArrayList(m1512d);
        }
        return m1512d;
    }

    /* renamed from: ak */
    public String m1563ak() {
        String str = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (true) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                byte[] hardwareAddress = networkInterfaces.nextElement().getHardwareAddress();
                if (hardwareAddress != null) {
                    String trim = new String(hardwareAddress).trim();
                    if (trim.length() > 2) {
                        str = trim;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str != null) {
            return C0758f.m2131c(str);
        }
        return "[blank]";
    }

    /* renamed from: d */
    public ArrayList m1512d(boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        String str = nextElement.getHostAddress().toString();
                        if (!str.contains("%")) {
                            if (!z) {
                                arrayList.add(str);
                            } else if (str.contains(".")) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
        } catch (SocketException e) {
            Log.m5772d("RustedWarfare", e.toString());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: al */
    public InetAddress m1562al() {
        try {
            DhcpInfo dhcpInfo = ((WifiManager) Core.m1087A().f6227am.mo6014c("wifi")).getDhcpInfo();
            int i = (dhcpInfo.ipAddress & dhcpInfo.netmask) | (dhcpInfo.netmask ^ (-1));
            byte[] bArr = new byte[4];
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
            }
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public void m1513d(String str, String str2) {
        if (Core.f6205aU) {
            return;
        }
        Core m1087A = Core.m1087A();
        if (this.f5571F || m1087A.f6126cb.m2464h()) {
            return;
        }
        if (ActivityC0122n.m5604l()) {
            m1485i(2);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) m1087A.f6227am.mo6014c("notification");
        PendingIntent activity = PendingIntent.getActivity(m1087A.f6227am, 0, new Intent(m1087A.f6227am, ActivityC0088a.class), 2);
        if (Build.VERSION.SDK_INT >= 11) {
            Notification.Builder builder = new Notification.Builder(m1087A.f6227am);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText(str + ": " + str2);
            builder.setSmallIcon(C0067R.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(false);
            builder.setAutoCancel(true);
            m1613a(notificationManager);
            m1614a(builder, "multiplayerChatId");
            notificationManager.notify(2, builder.getNotification());
        }
    }

    /* renamed from: am */
    public void m1561am() {
        Core m1087A = Core.m1087A();
        if (this.lock1 && m1087A != null && m1087A.m1076L()) {
            m1574aE();
        } else {
            m1485i(1);
        }
    }

    /* renamed from: a */
    private void m1614a(Notification.Builder builder, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                builder.getClass().getDeclaredMethod("setChannelId", String.class).invoke(builder, str);
            } catch (Exception e) {
                Core.m1041a("setChannelId failed", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private void m1613a(NotificationManager notificationManager) {
        m1612a(notificationManager, "multiplayerChatId", "Multiplayer Chat");
        m1612a(notificationManager, "multiplayerStatusId", "Multiplayer Status");
    }

    /* renamed from: a */
    private void m1612a(NotificationManager notificationManager, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls = Class.forName("android.app.NotificationChannel");
                notificationManager.getClass().getDeclaredMethod("createNotificationChannel", cls).invoke(notificationManager, cls.getDeclaredConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance(str, str2, 3));
            } catch (Exception e) {
                Core.m1041a("Creating notification channel failed", (Throwable) e);
            }
        }
    }

    /* renamed from: aE */
    private void m1574aE() {
        if (Core.f6205aU) {
            return;
        }
        Core m1087A = Core.m1087A();
        PendingIntent activity = PendingIntent.getActivity(m1087A.f6227am, 0, new Intent(m1087A.f6227am, ActivityC0088a.class), 2);
        NotificationManager notificationManager = (NotificationManager) m1087A.f6227am.mo6014c("notification");
        if (Build.VERSION.SDK_INT >= 11) {
            if (Build.VERSION.SDK_INT >= 26) {
            }
            Notification.Builder builder = new Notification.Builder(m1087A.f6227am);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText("A multiplayer game is in progress");
            builder.setSmallIcon(C0067R.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(true);
            m1613a(notificationManager);
            m1614a(builder, "multiplayerStatusId");
            if (Build.VERSION.SDK_INT >= 16) {
                builder.build();
            }
            notificationManager.notify(1, builder.getNotification());
        }
    }

    /* renamed from: i */
    private void m1485i(int i) {
        if (Core.f6205aU) {
            return;
        }
        ((NotificationManager) Core.m1087A().f6227am.mo6014c("notification")).cancel(i);
    }

    /* renamed from: an */
    public int m1560an() {
        int i = 0;
        for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
            AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
            if (m5017k != null && !m5017k.f1317v) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: ao */
    public int m1559ao() {
        int i = 0;
        for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
            if (AbstractC0197n.m5017k(i2) != null) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public void m1509e(AbstractC0197n abstractC0197n) {
        if (this.IsServer) {
            m1502f(abstractC0197n);
        } else if (this.f5495H) {
            m1477k("-kick " + (abstractC0197n.f1306k + 1));
        } else {
            Core.m998b("kickTeamAndAttachedPlayer: but not server or proxy controller");
        }
    }

    /* renamed from: f */
    public void m1502f(AbstractC0197n abstractC0197n) {
        if (abstractC0197n instanceof C0136a) {
            abstractC0197n.m5113G();
        } else if (this.f5489z == abstractC0197n) {
            Core.m997b("kickTeamAndAttachedPlayer", "Cannot kick self");
            return;
        } else {
            Steam m1528c = m1528c(abstractC0197n);
            if (m1528c == null) {
                m1493g("Kick player: cannot find connection for team");
            } else {
                int i = Core.m1087A().settingEngine.banTimeInSecondsAfterKick;
                if (i > 0) {
                    m1595a(m1528c, "Temporarily banned due to recent kick", i);
                }
                m1596a(m1528c, "Kicked by host");
                m1528c.m1355a("Kicked by host");
            }
            abstractC0197n.m5113G();
        }
        m1632P();
        ActivityC0122n.m5601o();
    }

    /* renamed from: ap */
    public void m1558ap() {
        Core m1087A = Core.m1087A();
        if (!this.IsServer) {
            Core.m997b("addAIToGame", "We are not a server");
            return;
        }
        int m5115E = AbstractC0197n.m5115E();
        if (m5115E == -1) {
            m1087A.m1045a("No free slots for AI", 1);
        }
        C0136a c0136a = new C0136a(m5115E);
        c0136a.f1316u = "AI";
        c0136a.f1312q = m5115E % 2;
        c0136a.f1318w = this.f5603aO.f5659f;
        m1557aq();
        m1087A.f6122bX.f5562d.m1653a(c0136a);
        m1087A.f6122bX.m1507e((Steam) null);
        ActivityC0122n.m5601o();
    }

    /* renamed from: aq */
    public boolean m1557aq() {
        if (!this.IsServer && this.lock1) {
            Core.m997b("updateNamesOfAI", "We are not a server");
            return false;
        }
        boolean z = false;
        for (int i = 0; i < AbstractC0197n.f1365c; i++) {
            AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
            if (m5017k != null && m1544b(m5017k)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m1610a(AbstractC0197n abstractC0197n, int i) {
        synchronized (this.f5623bP) {
            m1527c(abstractC0197n, i);
        }
    }

    /* renamed from: c */
    private void m1527c(AbstractC0197n abstractC0197n, int i) {
        if (abstractC0197n.f1306k != i) {
            int i2 = abstractC0197n.f1306k;
            int i3 = abstractC0197n.f1312q;
            boolean z = false;
            if (i == -3) {
                z = true;
                i = AbstractC0197n.m5114F();
                if (i == -1) {
                    m1506e("No free spectator slots");
                    return;
                }
            }
            AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
            abstractC0197n.m5029f(i);
            abstractC0197n.f1312q = i3;
            if (z) {
                abstractC0197n.f1312q = -3;
            }
            if (m5017k != null) {
                int i4 = m5017k.f1312q;
                m5017k.m5029f(i2);
                if (i4 == -3) {
                    m5017k.f1312q = -3;
                } else {
                    m5017k.f1312q = i3;
                }
            }
            m1635M();
            m1632P();
        }
    }

    /* renamed from: a */
    public void m1605a(EnumC0852al enumC0852al) {
        synchronized (this.f5623bP) {
            m1541b(enumC0852al);
        }
    }

    /* renamed from: b */
    private synchronized void m1541b(EnumC0852al enumC0852al) {
        if (!Core.m1087A().f6122bX.IsServer) {
            Core.LogDebug2("Not server");
            return;
        }
        if (enumC0852al == EnumC0852al.f5680a) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < AbstractC0197n.f1365c; i++) {
                AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
                if (m5017k != null) {
                    arrayList.add(m5017k);
                }
            }
            Collections.shuffle(arrayList);
            int size = arrayList.size() / 2;
            if (arrayList.size() % 2 != 0) {
                size += C0758f.m2203a(0, 1);
            }
            if (size >= arrayList.size()) {
                size = arrayList.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0197n) arrayList.get(i3)).m5029f(i2);
                i2 += 2;
                ((AbstractC0197n) arrayList.get(i3)).f1312q = 0;
            }
            int i4 = 1;
            for (int i5 = 0 + size; i5 < arrayList.size(); i5++) {
                ((AbstractC0197n) arrayList.get(i5)).m5029f(i4);
                i4 += 2;
                ((AbstractC0197n) arrayList.get(i5)).f1312q = 1;
            }
        } else if (enumC0852al == EnumC0852al.f5681b) {
            ArrayList arrayList2 = new ArrayList();
            for (int i6 = 0; i6 < AbstractC0197n.f1365c; i6++) {
                AbstractC0197n m5017k2 = AbstractC0197n.m5017k(i6);
                if (m5017k2 != null) {
                    arrayList2.add(m5017k2);
                }
            }
            Collections.shuffle(arrayList2);
            int size2 = arrayList2.size() / 3;
            if (size2 >= arrayList2.size()) {
                size2 = arrayList2.size();
            }
            int i7 = 0;
            for (int i8 = 0; i8 < size2; i8++) {
                AbstractC0197n abstractC0197n = (AbstractC0197n) arrayList2.get(i8);
                abstractC0197n.m5029f(i7);
                abstractC0197n.f1312q = 0;
                i7 += 3;
                arrayList2.set(i8, null);
            }
            int i9 = 0 + size2;
            int size3 = i9 + (arrayList2.size() / 3);
            if (size3 >= arrayList2.size()) {
                size3 = arrayList2.size();
            }
            if (i9 >= arrayList2.size()) {
                i9 = arrayList2.size();
            }
            int i10 = 1;
            for (int i11 = i9; i11 < size3; i11++) {
                AbstractC0197n abstractC0197n2 = (AbstractC0197n) arrayList2.get(i11);
                abstractC0197n2.m5029f(i10);
                abstractC0197n2.f1312q = 1;
                i10 += 3;
                arrayList2.set(i11, null);
            }
            int i12 = i9 + size2;
            if (i12 >= arrayList2.size()) {
                i12 = arrayList2.size();
            }
            int i13 = 2;
            for (int i14 = i12; i14 < arrayList2.size(); i14++) {
                AbstractC0197n abstractC0197n3 = (AbstractC0197n) arrayList2.get(i14);
                if (i13 >= AbstractC0197n.f1365c) {
                    abstractC0197n3.m5029f(i13);
                    abstractC0197n3.f1312q = 2;
                    i13 += 3;
                    arrayList2.set(i14, null);
                }
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                AbstractC0197n abstractC0197n4 = (AbstractC0197n) arrayList2.get(i15);
                if (abstractC0197n4 != null) {
                    for (int i16 = 0; i16 < AbstractC0197n.f1365c; i16++) {
                        if (AbstractC0197n.m5017k(i16) == null) {
                            abstractC0197n4.m5029f(i16);
                            abstractC0197n4.f1312q = 2;
                            arrayList2.set(i15, null);
                        }
                    }
                }
            }
        } else if (enumC0852al == EnumC0852al.f5682c) {
            ArrayList arrayList3 = new ArrayList();
            for (int i17 = 0; i17 < AbstractC0197n.f1365c; i17++) {
                AbstractC0197n m5017k3 = AbstractC0197n.m5017k(i17);
                if (m5017k3 != null) {
                    arrayList3.add(m5017k3);
                }
            }
            Collections.shuffle(arrayList3);
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ((AbstractC0197n) arrayList3.get(i19)).m5029f(i18);
                ((AbstractC0197n) arrayList3.get(i19)).f1312q = i18;
                i18++;
            }
        } else if (enumC0852al == EnumC0852al.f5683d) {
            ArrayList arrayList4 = new ArrayList();
            for (int i20 = 0; i20 < AbstractC0197n.f1365c; i20++) {
                AbstractC0197n m5017k4 = AbstractC0197n.m5017k(i20);
                if (m5017k4 != null) {
                    arrayList4.add(m5017k4);
                }
            }
            Collections.shuffle(arrayList4);
            int i21 = 0;
            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                int m5114F = AbstractC0197n.m5114F();
                if (m5114F != -1) {
                    ((AbstractC0197n) arrayList4.get(i22)).m5029f(m5114F);
                }
                ((AbstractC0197n) arrayList4.get(i22)).f1312q = -3;
                i21++;
            }
        } else {
            throw new RuntimeException("overrideTeamLayout: unhandled layout: " + enumC0852al);
        }
        m1635M();
    }

    /* renamed from: a */
    public void m1609a(AbstractC0197n abstractC0197n, int i, Integer num) {
        String str = VariableScope.nullOrMissingString;
        if (num != null) {
            str = " " + num;
        }
        if (!this.f5495H && this.f5489z == abstractC0197n) {
            m1477k("-self_move " + (i + 1) + str);
        } else {
            m1477k("-move " + (abstractC0197n.f1306k + 1) + " " + (i + 1) + str);
        }
    }

    /* renamed from: b */
    public void m1543b(AbstractC0197n abstractC0197n, int i) {
        if (i != -1) {
            i++;
        }
        if (!this.f5495H && this.f5489z == abstractC0197n) {
            m1477k("-self_team " + i);
        } else {
            m1477k("-team " + (abstractC0197n.f1306k + 1) + " " + i);
        }
    }

    /* renamed from: g */
    public void m1496g(AbstractC0197n abstractC0197n) {
        if (!abstractC0197n.f1331G) {
            abstractC0197n.f1331G = true;
            String str = abstractC0197n.f1316u;
            if (str == null) {
                str = "Player - " + (abstractC0197n.f1306k + 1) + VariableScope.nullOrMissingString;
            }
            m1479j(str + " is victorious!");
        }
    }

    /* renamed from: h */
    public void m1490h(AbstractC0197n abstractC0197n) {
        String str;
        Core m1087A = Core.m1087A();
        boolean z = false;
        String str2 = abstractC0197n.f1316u;
        if (str2 == null) {
            str2 = "Player - " + (abstractC0197n.f1306k + 1) + VariableScope.nullOrMissingString;
        }
        String str3 = str2 + " was defeated";
        if (!this.f5541br) {
            str = str3 + " (Team: " + abstractC0197n.m5025h() + ")";
        } else {
            int m5028g = AbstractC0197n.m5028g();
            str = str3 + " (" + m5028g + " players remaining)";
            if (m5028g == 1) {
                z = true;
            }
        }
        if (!m1087A.m1075M() && m1087A.f6239bx < 60) {
            Core.LogDebug2("Not showing defeated message: " + str);
            str = null;
        }
        if (abstractC0197n.f1327D) {
            str = null;
        }
        if (str != null) {
            m1479j(str);
        }
        if (z) {
            AbstractC0197n.m5106N();
        }
    }

    /* renamed from: i */
    public void m1484i(AbstractC0197n abstractC0197n) {
        String str;
        String str2;
        Core m1087A = Core.m1087A();
        String str3 = abstractC0197n.f1316u;
        if (str3 == null) {
            str3 = "Player - " + (abstractC0197n.f1306k + 1) + VariableScope.nullOrMissingString;
        }
        boolean z = false;
        if (m1087A.f6239bx < 10) {
            str = str3 + " had no starting units";
        } else {
            str = str3 + " has been wiped out";
        }
        if (!this.f5541br) {
            str2 = str + " (Team: " + abstractC0197n.m5025h() + ")";
        } else {
            int m5028g = AbstractC0197n.m5028g();
            str2 = str + " (" + m5028g + " players remaining)";
            if (m5028g == 1) {
                z = true;
            }
        }
        if (!m1087A.m1075M() && m1087A.f6239bx < 60) {
            Core.LogDebug2("Not showing defeated message: " + str2);
            str2 = null;
        }
        if (abstractC0197n.f1327D) {
            str2 = null;
        }
        if (abstractC0197n.m5074b()) {
            str2 = null;
        }
        if (str2 != null) {
            m1479j(str2);
        }
        if (z) {
            AbstractC0197n.m5106N();
        }
    }

    /* renamed from: ar */
    public synchronized void m1556ar() {
        if (this.f5555bQ != null) {
            this.f5555bQ.cancel();
            this.f5555bQ = null;
        }
    }

    /* renamed from: as */
    public synchronized void m1555as() {
        if (this.f5484q && this.IsServer && this.f5555bQ == null) {
            this.f5555bQ = new Timer();
            this.f5555bQ.schedule(new TimerTask() { // from class: com.corrodinggames.rts.gameFramework.i.ad.6
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    C0879n.m1262c();
                }
            }, 60000L, 60000L);
        }
    }

    /* renamed from: at */
    public String m1554at() {
        Core m1087A = Core.m1087A();
        String str = VariableScope.nullOrMissingString;
        if (m1087A.f6122bX.IsServer && !m1087A.f6122bX.f5571F) {
            String m1565ai = m1087A.f6122bX.m1565ai();
            if (this.f5492D) {
                if (this.f5493E != null) {
                    str = str + this.f5493E;
                }
            } else if (m1565ai != null) {
                String str2 = "Local IP address: " + m1565ai + " port: " + m1087A.f6122bX.socketPort;
                if (m1087A.f6122bX.f5538bl != null) {
                    if (!m1087A.f6122bX.f5538bl.booleanValue()) {
                        str2 = str2 + "\nUnable to get a public IP address, check your internet connection";
                    } else if (m1087A.f6122bX.f5536bj != null && m1087A.f6122bX.f5537bk != null) {
                        str2 = str2 + "\nYour public address is " + (m1087A.f6122bX.f5537bk.booleanValue() ? "<Open>" : "<CLOSED>") + " to the internet";
                    }
                } else {
                    str2 = str2 + "\nRetrieving your public IP...";
                }
                str = str + str2;
            } else {
                str = str + "You do not have a network connection";
            }
        }
        if (m1087A.m1073O()) {
            if (this.f5483p) {
                str = str + "SandBox Mode!\nPlace any unit, Control all teams, Special powers";
            } else {
                str = str + "Local skirmish";
            }
        }
        boolean z = true;
        if (Core.m1012as() && m1087A.f6122bX.IsServer) {
            z = false;
        }
        if (str.length() != 0) {
            str = str + "\n";
            if (Core.m1010au()) {
                str = str + "\n";
            }
        }
        if (m1087A.f6122bX.f5523aL || m1087A.f6122bX.IsServer) {
            if (z) {
                if (m1087A.f6122bX.f5603aO.f5654a != null) {
                    str = str + "Game Mode: " + m1087A.f6122bX.f5603aO.f5654a.mo1444a();
                }
                if (m1087A.f6122bX.f5603aO.f5655b != null) {
                    str = str + "\nMap: " + ActivityC0117i.m5622e(m1087A.f6122bX.f5603aO.f5655b);
                }
            }
            str = (str + "\nStarting Credits: " + m1087A.f6122bX.m1480j()) + "\nFog: " + m1087A.f6122bX.m1498g();
            if (m1087A.f6122bX.f5603aO.f5660g != 1) {
                str = str + "\nStarting Units: " + m1087A.f6122bX.m1492h();
            }
            if (m1087A.f6122bX.f5603aO.f5661h != 1.0f) {
                str = str + "\n" + C0758f.m2206a(m1087A.f6122bX.f5603aO.f5661h, 1) + "X income";
            }
            if (m1087A.f6122bX.f5603aO.f5662i) {
                str = str + "\nNo nukes";
            }
            if (m1087A.f6122bX.f5603aO.f5652l) {
                str = str + "\nShared control: On";
            }
            if (this.IsServer) {
                if (m1087A.f6122bX.f5481n != null) {
                    str = str + "\nPassword Protection: On";
                }
                if (!m1087A.f6122bX.f5484q && !m1087A.f6122bX.f5571F) {
                    str = str + "\nServer Visibility: Hidden";
                }
                if (m1087A.f6122bX.f5482o && !m1087A.f6122bX.f5571F) {
                    ArrayList m1696j = m1087A.f6124bZ.m1696j();
                    str = str + "\n-- Required Mods: --\n";
                    int i = 0;
                    Iterator it = m1696j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0824b c0824b = (C0824b) it.next();
                        if (i > 2 && i < m1696j.size() - 1) {
                            str = str + VariableScope.nullOrMissingString + (m1696j.size() - i) + " more mods...";
                            break;
                        }
                        i++;
                        String m1686b = c0824b.m1686b();
                        m1686b.replace("\"", "'");
                        m1686b.replace(";", ".");
                        str = str + " mod: \"" + m1686b + "\"\n";
                    }
                }
            }
        }
        return str;
    }

    /* renamed from: au */
    public String m1553au() {
        if (!this.f5482o) {
            return null;
        }
        ArrayList m1696j = Core.m1087A().f6124bZ.m1696j();
        String str = VariableScope.nullOrMissingString;
        int i = 0;
        Iterator it = m1696j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0824b c0824b = (C0824b) it.next();
            if (i != 0) {
                str = str + "; ";
            }
            if (i > 1 && i < m1696j.size() - 1) {
                str = str + VariableScope.nullOrMissingString + (m1696j.size() - i) + " more...";
                break;
            }
            i++;
            String m1686b = c0824b.m1686b();
            m1686b.replace(";", ".");
            str = str + m1686b;
        }
        return str;
    }

    /* renamed from: av */
    public String m1552av() {
        Core m1087A = Core.m1087A();
        if (m1087A.f6122bX.f5603aO.f5655b == null || m1087A.f6122bX.f5603aO.f5654a == null) {
            return null;
        }
        if (m1087A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5669a) {
            return "maps/skirmish/" + m1087A.f6122bX.f5603aO.f5655b;
        }
        if (m1087A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5670b) {
            return "/SD/rusted_warfare_maps/" + m1087A.f6122bX.f5603aO.f5655b;
        }
        Core.LogDebug2("getNetworkMapPath: unhandled type:" + m1087A.f6122bX.f5603aO.f5654a);
        return null;
    }

    /* renamed from: aw */
    public boolean m1551aw() {
        return this.IsServer || this.f5495H;
    }

    /* renamed from: a */
    public void m1589a(String str, Steam steam) {
        Core.LogDebug2("sendCommandError: " + str);
        if (steam == null) {
            m1538b((Steam) null, -1, (String) null, str);
        } else {
            m1598a(null, null, null, str, steam);
        }
    }

    /* renamed from: b */
    public boolean m1537b(Steam steam, AbstractC0197n abstractC0197n, String str, String str2) {
        int i;
        AbstractC0197n m5017k;
        String str3 = null;
        String str4 = VariableScope.nullOrMissingString;
        String[] strArr = new String[0];
        String trim = str2.trim();
        boolean z = false;
        if (trim.startsWith("-qc ")) {
            trim = trim.substring("-qc ".length()).trim();
            z = true;
        }
        if ((trim.startsWith("-") || trim.startsWith(".") || trim.startsWith("_")) && trim.length() >= 2) {
            String trim2 = trim.substring(1).trim();
            int indexOf = trim2.indexOf(" ");
            if (indexOf == -1) {
                indexOf = trim2.length();
            }
            str3 = trim2.substring(0, indexOf).toLowerCase(Locale.ENGLISH);
            if (indexOf != -1 && trim2.length() >= indexOf + 1) {
                str4 = trim2.substring(indexOf + 1).trim();
                strArr = str4.split(" ");
            }
        }
        if (str3 == null) {
            return false;
        }
        if (z && !"self_move".equals(str3) && !"self_team".equals(str3)) {
            return false;
        }
        if ("pause".equals(str3) || "unpause".equals(str3)) {
            if (abstractC0197n == null) {
                m1589a("[Could not find player]", steam);
                return true;
            } else if ((!this.IsServer || abstractC0197n != this.f5489z) && !this.f5562d.m1649b(steam)) {
                m1589a("[Only the host can change pause state]", steam);
                return true;
            } else if (!this.f5539bm) {
                m1589a("[Game not yet started]", steam);
                return true;
            } else {
                boolean z2 = !this.f5515al;
                if ("unpause".equals(str3)) {
                    z2 = false;
                }
                m1505e(z2);
                return true;
            }
        } else if ("endgame".equals(str3)) {
            if (abstractC0197n == null) {
                m1589a("[Could not find player]", steam);
                return true;
            } else if (!this.IsServer || abstractC0197n != this.f5489z) {
                m1589a("[Only the host can end game]", steam);
                return true;
            } else if (!this.f5539bm) {
                m1589a("[Game not yet started]", steam);
                return true;
            } else {
                m1567ag();
                return true;
            }
        } else if ("teamlock".equals(str3)) {
            if (abstractC0197n == null) {
                m1589a("[Could not find player]", steam);
                return true;
            } else if ((!this.IsServer || abstractC0197n != this.f5489z) && !this.f5562d.m1649b(steam)) {
                m1589a("[Only the host can change teamlock]", steam);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                this.f5603aO.f5665m = true;
                m1589a("[teams are locked]", steam);
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                this.f5603aO.f5665m = false;
                m1589a("[teams are unlocked]", steam);
                return true;
            } else {
                m1589a("[Expected true or false]", steam);
                return true;
            }
        } else if ("roomlock".equals(str3)) {
            if (abstractC0197n == null) {
                m1589a("[Could not find player]", steam);
                return true;
            } else if (!this.IsServer || abstractC0197n != this.f5489z) {
                m1589a("[Only the host can change roomlock]", steam);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                this.f5603aO.f5668p = true;
                m1589a("[room is locked]", steam);
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                this.f5603aO.f5668p = false;
                m1589a("[room is unlocked]", steam);
                return true;
            } else {
                m1589a("[Expected true or false]", steam);
                return true;
            }
        } else if ("share".equals(str3)) {
            if (abstractC0197n == null) {
                m1589a("[Could not find player]", steam);
                return true;
            } else if (!this.f5603aO.f5652l) {
                m1589a("[Shared control is not enabled in this game]", steam);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                if (!abstractC0197n.f1332H) {
                    abstractC0197n.f1332H = true;
                    m1479j("[shared control now on for " + str + "]");
                    return true;
                }
                m1479j("[shared control already on for " + str + "]");
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                if (abstractC0197n.f1332H) {
                    abstractC0197n.f1332H = false;
                    m1479j("[shared control now off for " + str + "]");
                    return true;
                }
                m1479j("[shared control already off for " + str + "]");
                return true;
            } else {
                m1589a("[Expected true or false]", steam);
                return true;
            }
        } else if ("self_move".equals(str3)) {
            if (abstractC0197n == null) {
                m1589a("[Cannot Move - Player not found]", steam);
                return true;
            } else if (this.f5539bm) {
                m1589a("[Cannot Move '" + abstractC0197n.f1316u + "' - Game has been started]", steam);
                return true;
            } else if (m1470o()) {
                m1589a("[Cannot Move '" + abstractC0197n.f1316u + "' - Game is starting]", steam);
                return true;
            } else if (this.f5603aO.f5665m) {
                m1589a("[Cannot Move '" + abstractC0197n.f1316u + "' - Teams locked]", steam);
                return true;
            } else if (strArr.length > 0) {
                try {
                    int intValue = Integer.valueOf(strArr[0]).intValue();
                    Integer num = null;
                    if (strArr.length > 1) {
                        try {
                            num = Integer.valueOf(strArr[1]);
                            if (num.intValue() != -1 && (num.intValue() < 1 || num.intValue() > 99)) {
                                m1589a("[Cannot Move Team - Ally group - Out of range]", steam);
                                return true;
                            }
                        } catch (NumberFormatException e) {
                            m1589a("[Cannot Move '" + abstractC0197n.f1316u + "' - ally group '" + strArr[1] + "' is not a number]", steam);
                            return true;
                        }
                    }
                    boolean z3 = false;
                    if (intValue - 1 == -3) {
                        if (!this.f5603aO.f5667o) {
                            m1589a("[Spectators are disabled on this server]", steam);
                            return true;
                        }
                        synchronized (this.f5623bP) {
                            intValue = AbstractC0197n.m5114F();
                            if (intValue != -1) {
                                m1610a(abstractC0197n, -3);
                            }
                        }
                        z3 = true;
                    }
                    int i2 = abstractC0197n.f1312q;
                    boolean z4 = i2 == -3;
                    if (!z3) {
                        if (intValue < 1 || intValue > AbstractC0197n.f1365c) {
                            m1589a("[Cannot Move '" + abstractC0197n.f1316u + "' - target slotId must between 1-" + AbstractC0197n.f1365c + "]", steam);
                            return true;
                        }
                        synchronized (this.f5623bP) {
                            if (this.f5489z != abstractC0197n && (m5017k = AbstractC0197n.m5017k(intValue - 1)) != null && !m5017k.f1317v && !m5017k.m5074b()) {
                                m1589a("[Cannot move '" + abstractC0197n.f1316u + "' to slot: " + intValue + " - Player: " + m5017k.f1316u + " is in that slot.]", steam);
                                return true;
                            }
                            m1610a(abstractC0197n, intValue - 1);
                        }
                    }
                    abstractC0197n.f1312q = i2;
                    if (num != null) {
                        if (num.intValue() == -1) {
                            abstractC0197n.f1312q = abstractC0197n.f1306k % 2;
                        } else {
                            abstractC0197n.f1312q = num.intValue();
                        }
                    }
                    if (this.f5603aO.f5666n) {
                        abstractC0197n.f1312q = abstractC0197n.f1306k % 2;
                    }
                    if (z3) {
                        abstractC0197n.f1312q = -3;
                    }
                    if (z3) {
                        if (!z4) {
                            m1479j("Player '" + abstractC0197n.f1316u + "' is now a spectator");
                        }
                    } else {
                        m1479j("Player '" + abstractC0197n.f1316u + "' moved themselves to: " + intValue);
                    }
                    m1632P();
                    ActivityC0122n.m5601o();
                    return true;
                } catch (NumberFormatException e2) {
                    m1589a("[Cannot Move '" + abstractC0197n.f1316u + "' - team '" + strArr[0] + "' is not a number]", steam);
                    return true;
                }
            } else {
                m1589a("[Cannot Move '" + abstractC0197n.f1316u + "' - No target]", steam);
                return true;
            }
        } else if ("self_team".equals(str3)) {
            if (abstractC0197n == null) {
                m1589a("[Cannot Set Team - Player not found]", steam);
                return true;
            } else if (this.f5539bm) {
                m1589a("[" + abstractC0197n.f1316u + ": Cannot Set Team - Game has been started]", steam);
                return true;
            } else if (m1470o()) {
                m1589a("[" + abstractC0197n.f1316u + ": Cannot Set Team - Game is starting]", steam);
                return true;
            } else if (this.f5603aO.f5665m) {
                m1589a("[" + abstractC0197n.f1316u + ": Cannot Set Team - Teams locked]", steam);
                return true;
            } else if (this.f5603aO.f5666n) {
                return true;
            } else {
                try {
                    int intValue2 = Integer.valueOf(str4).intValue();
                    if (intValue2 == -1) {
                        i = abstractC0197n.f1306k % 2;
                    } else if (intValue2 < 1 || intValue2 > 99) {
                        m1589a("[Cannot Set Team - Out of range]", steam);
                        return true;
                    } else {
                        i = intValue2 - 1;
                    }
                    if (abstractC0197n.f1312q != i) {
                        abstractC0197n.f1312q = i;
                        m1589a("Player '" + abstractC0197n.f1316u + "' team changed to: " + intValue2, steam);
                    }
                    m1632P();
                    ActivityC0122n.m5601o();
                    return true;
                } catch (NumberFormatException e3) {
                    m1473m("'" + str4 + "' is not a number");
                    return true;
                }
            }
        } else if ("surrender".equals(str3)) {
            if (!this.f5539bm) {
                m1589a("[Cannot Surrender - Game has not started]", steam);
                return true;
            } else if (abstractC0197n == null) {
                m1589a("[Could not find player]", steam);
                return true;
            } else if (!abstractC0197n.m5018k()) {
                Core.LogDebug2(str + ": Is voting to surrender");
                abstractC0197n.m5016l();
                m1599a(steam, abstractC0197n, str, "-t [Votes to surrender " + (AbstractC0197n.m5072b(abstractC0197n.f1312q) + "/" + AbstractC0197n.m5056c(abstractC0197n.f1312q)) + "]");
                return true;
            } else {
                Core.LogDebug2(str + ": Is already voting to surrender but updating timestamp");
                abstractC0197n.m5016l();
                return true;
            }
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static void m1607a(final C0841ae c0841ae) {
        Core m1087A = Core.m1087A();
        if (m1087A.f6122bX != null) {
            m1087A.f6122bX.f5562d.mo412a(c0841ae);
        }
        if (Core.f6205aU) {
            return;
        }
        C0090c.m5643a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.i.ad.7
            @Override // java.lang.Runnable
            public void run() {
                ActivityC0122n.m5607a(C0841ae.this);
            }
        });
    }

    /* renamed from: ax */
    public ArrayList m1550ax() {
        ArrayList m5058c;
        synchronized (this.f5623bP) {
            m5058c = AbstractC0197n.m5058c();
        }
        return m5058c;
    }

    /* renamed from: e */
    public void m1505e(boolean z) {
        this.f5515al = z;
        if (this.f5515al) {
            m1479j("Game Paused");
        } else {
            m1479j("Game unpaused");
        }
    }

    /* renamed from: b */
    public void m1536b(Steam steam, String str) {
        steam.m1352a(false, false, str);
    }

    /* renamed from: c */
    public void m1524c(Steam steam, String str) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam2 = (Steam) it.next();
            if (steam2.f5775j == steam) {
                m1536b(steam2, str);
            }
        }
    }

    /* renamed from: a */
    public Steam m1600a(Steam steam, int i, String str, String str2) {
        Core m1087A = Core.m1087A();
        Steam steam2 = new Steam(this, new C0873h(steam, i));
        steam2.f5776k = i;
        steam2.f5775j = steam;
        steam2.f5778m = str;
        steam2.f5779n = str2;
        try {
            steam2.m1347d();
            m1087A.f6122bX.f5606bc.add(steam2);
            m1087A.f6122bX.m1631Q();
            return steam2;
        } catch (IOException e) {
            e.printStackTrace();
            steam2.m1355a("crash");
            return null;
        }
    }

    /* renamed from: a */
    public Steam m1601a(Steam steam, int i) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam2 = (Steam) it.next();
            if (steam2.f5776k == i && steam2.f5775j == steam) {
                return steam2;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static String m1469o(String str) {
        String str2;
        char[] charArray;
        String replace = str.trim().replace("\n", ".").replace("\r", ".").replace("\t", ".").replace("��", ".").replace(" ", "_");
        while (true) {
            str2 = replace;
            if (!str2.startsWith(".") && !str2.startsWith("-") && !str2.startsWith(" ")) {
                break;
            }
            replace = str2.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str2.toCharArray()) {
            if (!Character.isISOControl(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m1584a(ArrayList arrayList, final boolean z) {
        if (this.f5556bS != null) {
            Core.LogDebug2("startJoinServerInternalThread: Already joining");
        } else if (arrayList.size() == 0) {
            Core.LogDebug2("startJoinServerInternalThread: no servers");
        } else {
            this.f5556bS = m1586a((String) arrayList.get(0), false, new Runnable() { // from class: com.corrodinggames.rts.gameFramework.i.ad.8
                @Override // java.lang.Runnable
                public void run() {
                    Core m1087A = Core.m1087A();
                    Core.LogDebug2("startJoinServerInternalThread callback");
                    RunnableC0853am runnableC0853am = C0831ad.this.f5556bS;
                    C0831ad.this.f5556bS = null;
                    if (runnableC0853am == null) {
                        Core.LogDebug2("startJoinServerInternalThread callback gameConnector==null");
                    } else if (runnableC0853am.f5689e != null) {
                        Core.LogDebug2("startJoinServerInternalThread failed to connect: " + runnableC0853am.f5689e);
                        if (z) {
                            m1087A.f6122bX.m1535b("Reconnect failed: " + runnableC0853am.f5689e);
                            C0831ad.this.m1534b("Reconnect failed", "reconnect failed");
                            m1087A.m983d("Reconnect failed", "Reconnect failed: " + runnableC0853am.f5689e);
                            m1087A.m969i("Reconnect failed: " + runnableC0853am.f5689e);
                        }
                    } else {
                        try {
                            m1087A.f6122bX.m1535b("starting new");
                            m1087A.f6122bX.m1585a(runnableC0853am.f5691g);
                        } catch (IOException e) {
                            m1087A.m990c(e.getMessage(), "Connection failed");
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }
}
