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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public int ServerKey = C0758f.m2151a(1, 9000000);

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
    public int GameVersion = LoggerMaybe.m1072A().mo973c(true);

    /* renamed from: bh */
    String f5625bh = C0758f.m2062e(40);

    /* renamed from: bb */
    Steam f5626bb = new Steam(this, null);

    /* renamed from: a */
    public C0850aj m1558a(Steam steam) {
        String m1329f = steam.m1329f();
        long currentTimeMillis = System.currentTimeMillis();
        if (m1329f == null) {
            steam.m1335b("Is banned: No target");
            return null;
        }
        synchronized (this.f5575M) {
            Iterator it = this.f5575M.iterator();
            while (it.hasNext()) {
                C0850aj c0850aj = (C0850aj) it.next();
                if (m1329f.equals(c0850aj.f5673a) && c0850aj.f5674b > currentTimeMillis) {
                    return c0850aj;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public boolean m1551a(Steam steam, String str, int i) {
        if (steam == null) {
            LoggerMaybe.m983b("Ban failed: No connection");
            return false;
        }
        String m1329f = steam.m1329f();
        if (m1329f == null) {
            steam.m1335b("Ban failed: No target");
            return false;
        }
        C0850aj c0850aj = new C0850aj();
        c0850aj.f5673a = steam.m1329f();
        c0850aj.f5674b = System.currentTimeMillis() + (i * 1000);
        c0850aj.f5675c = str;
        synchronized (this.f5575M) {
            m1503b();
            this.f5575M.add(c0850aj);
        }
        steam.LogDebug("Banned " + m1329f + " for " + i + "s");
        return true;
    }

    /* renamed from: a */
    public void m1577a() {
        synchronized (this.f5575M) {
            this.f5575M.clear();
        }
    }

    /* renamed from: b */
    public void m1503b() {
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
    public String m1546a(String str) {
        String replace = str.trim().replace(" ", "_");
        this.f5487y = replace;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f5487y != null && !this.f5487y.equals(m1072A.f6115bQ.lastNetworkPlayerName)) {
            m1072A.f6115bQ.lastNetworkPlayerName = this.f5487y;
            m1072A.f6115bQ.save();
        }
        return replace;
    }

    /* renamed from: a */
    public void m1575a(float f, String str) {
        if (f < 0.1d) {
            m1543a("setCurrentStepRate:" + f + " is too small, source:" + str, true);
        } else {
            this.f5573bV = f;
        }
    }

    /* renamed from: c */
    public float m1487c() {
        return this.f5573bV;
    }

    /* renamed from: d */
    public void m1476d() {
        Iterator it = this.f5583an.iterator();
        while (it.hasNext()) {
            ((C0851ak) it.next()).f5677b = 0L;
        }
    }

    /* renamed from: a */
    public void m1560a(StreamWriter streamWriter) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        streamWriter.mo1355c(0);
        this.f5603aO.m1406a(streamWriter);
        streamWriter.WriteInteger(m1072A.f6105bB);
        streamWriter.WriteInteger(m1072A.f6106bC);
    }

    /* renamed from: a */
    public void m1547a(Reader reader) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        reader.m1289d();
        this.f5603aO.m1405a(reader);
        m1072A.f6105bB = reader.ReadInt();
        m1072A.f6106bC = reader.ReadInt();
    }

    /* renamed from: e */
    public C0845ah m1467e() {
        C0845ah c0845ah;
        if (this.IsServer) {
            c0845ah = this.f5603aO;
        } else if (this.f5495H) {
            c0845ah = this.f5603aO.m1403c();
        } else {
            c0845ah = null;
            LoggerMaybe.m982b("getChangeableSetup", "Clicked but not server or proxy controller");
        }
        return c0845ah;
    }

    /* renamed from: f */
    public void m1460f() {
        if (this.f5571F) {
            LoggerMaybe.m1072A().f6115bQ.aiDifficulty = this.f5603aO.f5659f;
        }
        if (!this.IsServer && !this.f5571F) {
            return;
        }
        if (this.f5539bm) {
            LoggerMaybe.m958g("updateAIDifficulty with gameHasBeenStarted=true");
        } else {
            for (int i = 0; i < AbstractC0197n.f1365c; i++) {
                AbstractC0197n m4562k = AbstractC0197n.m4562k(i);
                if (m4562k != null) {
                    m1567a(m4562k);
                }
            }
        }
        m1513aq();
    }

    /* renamed from: a */
    public void m1567a(AbstractC0197n abstractC0197n) {
        if (abstractC0197n.f1317v) {
            abstractC0197n.m4592c("aiDifficultyOverride=" + abstractC0197n.f1320y);
            if (abstractC0197n.f1320y != null) {
                abstractC0197n.f1318w = abstractC0197n.f1320y.intValue();
            } else {
                abstractC0197n.f1318w = this.f5603aO.f5659f;
            }
        }
    }

    /* renamed from: b */
    public boolean m1500b(AbstractC0197n abstractC0197n) {
        boolean z = false;
        if (abstractC0197n.f1317v) {
            String str = "AI - " + m1501b(abstractC0197n.m4664A());
            if (!str.equals(abstractC0197n.f1316u)) {
                abstractC0197n.f1316u = str;
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m1562a(C0845ah c0845ah) {
        if (this.IsServer) {
            m1460f();
            m1588P();
            m1592L();
            ActivityC0122n.m5091o();
        } else if (this.f5495H) {
            m1498b(c0845ah);
        } else {
            LoggerMaybe.LogDebug2("applyChangedSetup but not server or proxy controller");
        }
    }

    /* renamed from: b */
    private void m1498b(C0845ah c0845ah) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        LoggerMaybe.LogDebug2("applyProxyControl");
        C0845ah c0845ah2 = this.f5603aO;
        if (!c0845ah2.f5655b.equals(c0845ah.f5655b)) {
            m1072A.f6122bX.m1433k("-map '" + C0750a.m2213n(ActivityC0117i.m5112e(c0845ah.f5655b)) + "'");
        }
        if (c0845ah2.f5658e != c0845ah.f5658e) {
            m1072A.f6122bX.m1433k("-revealedmap " + (!c0845ah.f5658e ? "true" : "false"));
        }
        if (c0845ah2.f5657d != c0845ah.f5657d) {
            m1072A.f6122bX.m1433k("-fog " + m1072A.f6122bX.m1573a(c0845ah.f5657d));
        }
        if (c0845ah2.f5656c != c0845ah.f5656c) {
            m1072A.f6122bX.m1433k("-credits " + m1072A.f6122bX.m1466e(c0845ah.f5656c));
        }
        if (!C0758f.m2037j(c0845ah2.f5661h, c0845ah.f5661h)) {
            m1072A.f6122bX.m1433k("-income " + C0758f.m2154a(c0845ah.f5661h, 1));
        }
        if (c0845ah2.f5662i != c0845ah.f5662i) {
            m1072A.f6122bX.m1433k("-nukes " + (!c0845ah.f5662i ? "true" : "false"));
        }
        if (c0845ah2.f5659f != c0845ah.f5659f) {
            m1072A.f6122bX.m1433k("-ai " + c0845ah.f5659f);
        }
        if (c0845ah2.f5660g != c0845ah.f5660g) {
            m1072A.f6122bX.m1433k("-startingunits " + c0845ah.f5660g);
        }
        if (c0845ah2.f5652l != c0845ah.f5652l) {
            m1072A.f6122bX.m1433k("-sharedControl " + (c0845ah.f5652l ? "true" : "false"));
        }
    }

    /* renamed from: g */
    public String m1454g() {
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
    public String m1573a(int i) {
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
    public String m1501b(int i) {
        return m1485c(i);
    }

    /* renamed from: c */
    public String m1485c(int i) {
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
    public String m1448h() {
        return m1474d(this.f5603aO.f5660g);
    }

    /* renamed from: i */
    public ArrayList m1442i() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 4; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        arrayList.addAll(C0453l.m3486s());
        return arrayList;
    }

    /* renamed from: d */
    public String m1474d(int i) {
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
        C0453l m3521c = C0453l.m3521c(i);
        if (m3521c != null) {
            return m3521c.mo4256e();
        }
        return "Unknown";
    }

    /* renamed from: j */
    public String m1436j() {
        if (this.f5603aO.f5656c == 0) {
            return "Default ($" + m1434k() + ")";
        }
        return "$" + m1434k();
    }

    /* renamed from: k */
    public final int m1434k() {
        return m1466e(this.f5603aO.f5656c);
    }

    /* renamed from: e */
    public int m1466e(int i) {
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
    public String m1432l() {
        return C0750a.m2213n(this.f5604aP);
    }

    /* renamed from: m */
    public void m1430m() {
        new C1101m();
        C0758f.m2103b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU);
        C0857ap.m1392a(5.0f, 6.0f, 7.0f);
        C0858aq.m1386a(5);
        this.f5546bw = C0858aq.m1387a();
        this.f5545bv = true;
    }

    /* renamed from: n */
    public boolean m1428n() {
        return this.f5539bm;
    }

    /* renamed from: o */
    public boolean m1426o() {
        return this.f5562d.m1604e();
    }

    /* renamed from: a */
    public synchronized void m1537a(boolean z, String str, Boolean bool) {
        this.f5538bl = Boolean.valueOf(z);
        this.f5536bj = str;
        this.f5537bk = bool;
        ActivityC0122n.m5091o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1548a(C0872g c0872g) {
        Iterator it = this.f5614by.iterator();
        while (it.hasNext()) {
            C0872g c0872g2 = (C0872g) it.next();
            if (c0872g2.f5823a && c0872g2.f5825c.equals(c0872g.f5825c) && c0872g2.f5829g == c0872g.f5829g) {
                c0872g2.f5836o = m1424p();
            }
        }
        c0872g.f5836o = m1424p();
        this.f5614by.add(c0872g);
        ActivityC0129p.m5085l();
    }

    /* renamed from: p */
    public long m1424p() {
        return System.currentTimeMillis();
    }

    public C0831ad() {
        this.f5626bb.f5777p = true;
        this.f5547bz = new C0187e(-3, false);
        this.f5547bz.f1316u = "SPECTATOR";
        this.f5548bA = new C0187e(-1, false);
        this.f5548bA.f1316u = "ADMIN";
    }

    /* renamed from: q */
    public void m1422q() {
        m1539a(false);
    }

    /* renamed from: r */
    public void m1421r() {
        m1539a(true);
    }

    /* renamed from: s */
    public void m1420s() {
        this.f5569bU = false;
        this.f5488bT = false;
        this.f5489z = null;
        this.f5483p = false;
        this.f5580X = 0;
        this.f5572I = 0;
        this.f5567w = 1L;
        m1575a(1.0f, "new");
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
        m1476d();
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
    public void m1539a(boolean z) {
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
        m1420s();
        this.ServerUUID = null;
        this.socketPort = 0;
        this.f5477i = false;
        this.f5478j = 0.0f;
        this.f5479k = 0.0f;
        this.f5622bN = false;
        this.f5525aR = null;
        this.f5602aN = LoggerMaybe.m1072A().f6115bQ.teamUnitCapHostedGame;
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
        m1577a();
        this.f5605aS.m1611c();
        LoggerMaybe.m1072A().f6117bS.m1785g();
        if ("<CHAT ONLY>".equals(this.f5603aO.f5655b)) {
            LoggerMaybe.LogDebug2("Chat only map selection - restarting");
            this.f5603aO.m1407a();
        }
        if (!z) {
            AbstractC0197n.m4661D();
        }
        C0348af.m4068b(this.f5482o);
    }

    /* renamed from: t */
    public void m1419t() {
    }

    /* renamed from: b */
    public synchronized void m1491b(String str) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        LoggerMaybe.LogDebug2("Disconnect: " + str);
        if (this.IsServer) {
            m1512ar();
            C0879n.m1245d();
            if (this.f5527aU != null) {
                this.f5527aU.m1394b();
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
                this.f5529aW.m1394b();
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
                this.f5533ba.m1408b();
                this.f5533ba = null;
                this.f5532aZ = null;
            }
        }
        m1423p(str);
        C1058a.m734a().mo279j();
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
            m1072A.f6126cb.m2417d();
            m1072A.mo967e();
            m1517am();
            this.f5616bC = false;
            this.f5615bB.notifyAll();
        }
    }

    /* renamed from: u */
    public void m1418u() {
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
    public void m1495b(Steam steam) {
        this.f5606bc.remove(steam);
    }

    /* renamed from: ay */
    private synchronized void m1505ay() {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            if (((Steam) it.next()).f5803a) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    void m1535a(byte[] bArr, Steam steam) {
        if (!LoggerMaybe.m993aw()) {
            Log.m5262d("RustedWarfare", "Ignoring incoming resync tagged as debug only");
        } else if (steam.f5782u) {
            Log.m5262d("RustedWarfare", "Ignoring desync client save, as past desync was already saved");
        } else {
            steam.f5782u = true;
            Log.m5262d("RustedWarfare", "Saving client save for debugging");
            File file = new File("desyncs/" + ("desync_" + C0758f.m2127a("d MMM yyyy HH.mm.ss") + "_" + steam.f5766c));
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
    public void m1417v() {
        if (this.f5617bH) {
            return;
        }
        LoggerMaybe.LogDebug2("Adding quick resync command");
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0749e m2368b = m1072A.f6130cf.m2368b();
        m2368b.f4842i = AbstractC0197n.f1371i;
        m2368b.f4850r = true;
        m2368b.f4853u = 200;
        m1072A.f6122bX.m1564a(m2368b);
        this.f5617bH = true;
    }

    /* renamed from: w */
    public void m1416w() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        StreamWriter streamWriter = new StreamWriter();
        m1072A.f6125ca.m428a(streamWriter);
        try {
            streamWriter.mo1375a();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] mo1353d = streamWriter.mo1353d();
        streamWriter.m1378h();
        if (this.IsServer) {
            Iterator it = this.f5606bc.iterator();
            while (it.hasNext()) {
                Steam steam = (Steam) it.next();
                if (steam.f5784w) {
                    steam.f5784w = false;
                    steam.f5783v = false;
                    m1549a(steam, mo1353d, this.f5564l, false);
                }
            }
        }
        LoggerMaybe.LogDebug2("Loading quick resync save data (bytes:" + mo1353d.length + ")");
        Reader reader = new Reader(mo1353d);
        m1072A.m1025a("Game resync (quick)...", true);
        int i = m1072A.f6239bx;
        int i2 = m1072A.f6102by;
        m1072A.f6125ca.m427a(reader, true, true, true);
        m1072A.f6239bx = i;
        m1072A.f6102by = i2;
        this.f5580X = m1072A.f6239bx + 1;
        this.f5512ag = false;
        this.f5581ah = this.f5580X + 1;
        this.f5516am = 0L;
        Iterator it2 = this.f5606bc.iterator();
        while (it2.hasNext()) {
            ((Steam) it2.next()).f5783v = false;
        }
        this.f5617bH = false;
        this.f5520aH++;
        this.f5549bD = 0.0f;
        this.f5550bE = 0.0f;
        if (this.f5551bF < 1) {
            this.f5551bF++;
        }
        this.f5552bG = m1072A.f6239bx;
    }

    /* renamed from: x */
    public synchronized void m1415x() {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5784w) {
                throw new RuntimeException("Player: " + steam.m1330e() + " has complete desync");
            }
            if (steam.f5783v) {
                throw new RuntimeException("Player: " + steam.m1330e() + " has minor desync");
            }
            if (steam.f5785x == 0) {
                throw new RuntimeException("Player: " + steam.m1330e() + " has no sync matches");
            }
        }
    }

    /* renamed from: d */
    private synchronized void m1475d(float f) {
        LoggerMaybe.m1072A();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        this.f5549bD += f;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5784w) {
                z = true;
            }
            if (steam.f5783v) {
                if (this.f5476g) {
                    LoggerMaybe.LogDebug2("desync_count:" + steam.f5786y + " lastResyncTimer:" + this.f5549bD);
                }
                if (steam.f5786y < 4 || this.f5549bD > 3600.0f) {
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
            LoggerMaybe.LogDebug2("disableDesyncFixing==true, running quick resync instead");
            z2 = false;
            z = true;
        }
        if (!z2 && z) {
            if (f5558b) {
                m1417v();
            } else {
                z2 = true;
            }
        }
        if (z2) {
            String str = VariableScope.nullOrMissingString;
            Iterator it2 = this.f5606bc.iterator();
            while (it2.hasNext()) {
                Steam steam2 = (Steam) it2.next();
                if (steam2.f5784w || steam2.f5783v) {
                    if (!str.equals(VariableScope.nullOrMissingString)) {
                        str = str + ", ";
                    }
                    str = str + steam2.m1330e();
                }
            }
            m1435j("Resyncing game for " + str + "...");
            m1504az();
            m1536a(this.f5564l, false, true);
        }
    }

    /* renamed from: az */
    private void m1504az() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f5549bD = 0.0f;
        this.f5550bE = 0.0f;
        this.f5551bF++;
        this.f5552bG = m1072A.f6239bx;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            steam.f5784w = false;
            steam.f5783v = false;
            steam.f5785x = 0;
        }
    }

    /* renamed from: c */
    public void m1479c(String str) {
        m1423p(str);
    }

    /* renamed from: p */
    private void m1423p(String str) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            ((Steam) it.next()).m1340a(str);
        }
        this.f5606bc.clear();
        this.f5607bd.clear();
        this.f5608bf = 1;
        this.f5534be = false;
    }

    /* renamed from: y */
    public long m1414y() {
        if (0 != 0) {
            LoggerMaybe.LogDebug2("New id set:" + this.f5567w + 1);
            LoggerMaybe.m1054S();
        }
        long j = this.f5567w;
        this.f5567w = j + 1;
        if (j == 0) {
            LoggerMaybe.LogDebug2("getNextUnitId: id==0");
            LoggerMaybe.m1054S();
        }
        return j;
    }

    /* renamed from: z */
    public long m1413z() {
        return this.f5567w;
    }

    /* renamed from: a */
    public void m1571a(long j) {
        this.f5567w = j;
    }

    /* renamed from: a */
    public boolean m1538a(boolean z, int i) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5777p && steam.m1327h() && !steam.f5780s && !steam.f5810D) {
                if (z) {
                    m1435j("Still waiting on: " + steam.m1330e());
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public int m1603A() {
        int i = 0;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5777p && steam.m1327h() && !steam.f5780s) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public int m1602B() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5777p && steam.m1327h() && !steam.f5780s) {
                C0187e c0187e = steam.f5787z;
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
    public int m1601C() {
        int i = 0;
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5777p && !steam.f5780s) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public int m1600D() {
        int m1602B = 0 + m1602B();
        if (!LoggerMaybe.m993aw()) {
            m1602B++;
        }
        return m1602B;
    }

    /* renamed from: d */
    public void LogError(String str) {
        Log.LogDebug("RustedWarfare", "network:" + str);
    }

    /* renamed from: e */
    public static void m1462e(String str) {
        LoggerMaybe.LogDebug2("network debug: " + str);
    }

    /* renamed from: f */
    public void m1455f(String str) {
        Log.m5262d("RustedWarfare", "reportProblem:" + str);
        if (this.f5539bm) {
            m1494b((Steam) null, -1, (String) null, str);
        } else {
            m1494b((Steam) null, -1, (String) null, str);
        }
    }

    /* renamed from: g */
    public static void m1449g(String str) {
        m1543a(str, false);
    }

    /* renamed from: h */
    public static void m1443h(String str) {
        m1543a(str, true);
    }

    /* renamed from: a */
    public static void m1543a(String str, boolean z) {
        String str2;
        C0831ad c0831ad = LoggerMaybe.m1072A().f6122bX;
        String str3 = "desync:" + str;
        LoggerMaybe.m983b(str3);
        LoggerMaybe.m1054S();
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
            c0831ad.m1429m(str2);
        }
    }

    /* renamed from: a */
    public static void m1544a(String str, String str2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6126cb.m2432a(-1, str, str2, m1072A.f6239bx);
        if (m1072A.f6117bS != null && m1072A.f6117bS.f5113e != null) {
            m1072A.f6117bS.f5113e.m1750a(str, str2);
        } else {
            LoggerMaybe.m958g("interfaceEngine/messageInterface==null");
        }
    }

    /* renamed from: E */
    public void m1599E() {
    }

    /* renamed from: a */
    public void m1564a(C0749e c0749e) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        c0749e.f4840c = this.f5580X;
        c0749e.m2251g();
        m1072A.f6130cf.f4621b.add(c0749e);
    }

    /* renamed from: F */
    public void m1598F() {
        C0851ak c0851ak;
        C0851ak c0851ak2;
        C0851ak c0851ak3;
        this.f5581ah = LoggerMaybe.m1072A().f6239bx;
        this.f5516am = 0L;
        m1476d();
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                this.f5516am = ((float) this.f5516am) + (abstractC0623y.f6957el * 1000.0f);
                this.f5516am = ((float) this.f5516am) + (abstractC0623y.f6958em * 1000.0f);
                this.f5516am = ((float) this.f5516am) + (abstractC0623y.f1632cs * 1.0f);
                this.f5516am += abstractC0623y.f6951ee;
                this.f5584ao.f5677b += Float.floatToRawIntBits(abstractC0623y.f6957el);
                this.f5584ao.f5677b += Float.floatToRawIntBits(abstractC0623y.f6958em);
                this.f5585ap.f5677b += Float.floatToRawIntBits(abstractC0623y.f1618ce);
                this.f5586aq.f5677b = ((float) c0851ak.f5677b) + abstractC0623y.f1632cs;
                this.f5587ar.f5677b += abstractC0623y.f6951ee;
                if (abstractC1120w instanceof C0489e) {
                    C0489e c0489e = (C0489e) abstractC0623y;
                    this.f5597aB.f5677b = ((float) c0851ak3.f5677b) + (c0489e.f3437f * 2.0f);
                    this.f5598aC.f5677b += c0489e.f3439h;
                }
                C0305au m2853ar = abstractC0623y.m2853ar();
                if (m2853ar != null) {
                    this.f5588as.f5677b += m2853ar.m4211j();
                    this.f5589at.f5677b = ((float) c0851ak2.f5677b) + (m2853ar.m4216g() * 1000.0f);
                }
                this.f5591av.f5677b += abstractC0623y.m2886aL();
            }
        }
        for (int i = 0; i < AbstractC0197n.f1365c; i++) {
            AbstractC0197n m4562k = AbstractC0197n.m4562k(i);
            if (m4562k != null) {
                this.f5590au.f5677b += (int) m4562k.f1310o;
                if (i == 0) {
                    this.f5594ay.f5677b += (int) m4562k.f1310o;
                }
                if (i == 1) {
                    this.f5595az.f5677b += (int) m4562k.f1310o;
                }
                if (i == 2) {
                    this.f5596aA.f5677b += (int) m4562k.f1310o;
                }
                this.f5592aw.f5677b += m4562k.m4552u();
                this.f5593ax.f5677b += i + (m4562k.f1318w * 100) + (m4562k.f1312q * 1000) + ((m4562k.f1317v ? i : 0) * 10000);
            }
        }
        if (this.f5581ah == 0) {
            LoggerMaybe.LogDebug2("Frame 0 checksum: " + this.f5516am);
        }
        this.f5517aD = false;
    }

    /* renamed from: G */
    public void m1597G() {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (!steam.f5777p || steam.m1336b() == -2 || steam.m1336b() > 500 || steam.m1336b() < 0) {
            }
        }
    }

    /* renamed from: H */
    public void m1596H() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        String str = VariableScope.nullOrMissingString;
        for (AbstractC0197n abstractC0197n : AbstractC0197n.m4621a(true)) {
            if (abstractC0197n != null) {
                String str2 = "unnamed";
                if (abstractC0197n.f1316u != null) {
                    str2 = abstractC0197n.f1316u;
                }
                str = str + "•" + abstractC0197n.m4654K().toLowerCase() + " [Team " + abstractC0197n.m4570h() + "] - " + str2 + (" " + abstractC0197n.m4550w()) + "\n";
            }
        }
        LoggerMaybe.LogDebug2("showPlayerListPopup(): Showing playlist messagebox.");
        m1072A.m975c("Players", str);
    }

    /* renamed from: a */
    public void m1576a(float f) {
        Steam m1581W;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f5600aJ += f;
        if (this.f5612bp) {
            if (this.f5540bq > 0.0f) {
                this.f5540bq -= f / 60.0f;
                LoggerMaybe.m1072A().f6117bS.m1821a("Returning to battleroom in " + ((int) this.f5540bq) + "...", 3500);
            } else {
                LoggerMaybe.LogDebug2("Sending returnToBattleroomEvent...");
                this.f5612bp = false;
                m1438i((Steam) null);
            }
        }
        if (this.f5611bo) {
            m1531aD();
        }
        if (this.f5600aJ > 60.0f) {
            m1597G();
            this.f5600aJ = 0.0f;
        }
        if (this.f5539bm && !this.f5610bn) {
            this.f5610bn = true;
            int i = 0;
            int i2 = 0;
            Iterator it = AbstractC0197n.m4576f().iterator();
            while (it.hasNext()) {
                int m4637a = AbstractC0197n.m4637a(((Integer) it.next()).intValue(), false);
                if (m4637a > i2) {
                    i2 = m4637a;
                }
                i++;
            }
            if (i > 2 && i2 <= 1) {
                this.f5541br = true;
            }
        }
        if (!this.IsServer && !this.f5569bU) {
            m1526ad();
            this.f5569bU = true;
        }
        if (this.IsServer) {
            if (!this.f5506aa) {
                if (m1538a(false, 0)) {
                    this.f5505Z = C0758f.m2159a(this.f5505Z, f);
                    if (this.f5505Z == 0.0f) {
                        this.f5506aa = true;
                        m1544a(VariableScope.nullOrMissingString, "<All players ready>");
                        this.f5562d.m1610a();
                    }
                } else {
                    this.f5507ab += f;
                    this.f5508ac += f;
                    if (this.f5507ab > 900.0f) {
                        this.f5506aa = true;
                        m1544a(VariableScope.nullOrMissingString, "Starting game without all players ready!");
                    } else if (this.f5508ac > 180.0f) {
                        this.f5508ac = 0.0f;
                        m1538a(true, (int) ((900.0f - this.f5507ab) / 60.0f));
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
                if ((m1072A.f6239bx >= this.f5580X - this.f5502R) & (!z)) {
                    int i3 = this.f5580X + this.f5501Q;
                    this.f5499O++;
                    boolean z2 = false;
                    for (int i4 = 0; i4 < AbstractC0197n.f1365c; i4++) {
                        AbstractC0197n m4562k = AbstractC0197n.m4562k(i4);
                        if (m4562k != null && m4562k.f1345U != 0 && !m4562k.m4547z() && m4562k.f1345U < 40) {
                            z2 = true;
                        }
                    }
                    if (m1072A.mo989b() != 0 && m1072A.mo989b() < 40 && !LoggerMaybe.m993aw()) {
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
                        if (f2 != m1487c()) {
                            LoggerMaybe.LogDebug2("Changing step rate to " + f2);
                            C0749e m2368b = m1072A.f6130cf.m2368b();
                            m2368b.f4842i = AbstractC0197n.f1371i;
                            m2368b.f4850r = true;
                            m2368b.f4851s = f2;
                            m1564a(m2368b);
                        }
                        this.f5499O = 0;
                        this.f5500P = 0;
                    }
                    StreamWriter streamWriter = new StreamWriter();
                    try {
                        streamWriter.WriteInteger(i3);
                        int i5 = 0;
                        Iterator it2 = m1072A.f6130cf.f4621b.iterator();
                        while (it2.hasNext()) {
                            if (((C0749e) it2.next()).f4840c == this.f5580X) {
                                i5++;
                            }
                        }
                        streamWriter.WriteInteger(i5);
                        Iterator it3 = m1072A.f6130cf.f4621b.iterator();
                        while (it3.hasNext()) {
                            C0749e c0749e = (C0749e) it3.next();
                            if (c0749e.f4840c == this.f5580X) {
                                c0749e.m2266a(streamWriter);
                            }
                        }
                        Packet mo1360b = streamWriter.mo1360b(10);
                        mo1360b.f5742e = true;
                        m1472d(mo1360b);
                        this.f5580X = i3;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        if (!m1072A.f6130cf.f4623d.isEmpty()) {
            Iterator it4 = m1072A.f6130cf.f4623d.iterator();
            while (it4.hasNext()) {
                C0749e c0749e2 = (C0749e) it4.next();
                if (0 != 0) {
                    m1072A.f6130cf.f4622c.add(c0749e2);
                    it4.remove();
                } else {
                    if (!c0749e2.f4864x) {
                        c0749e2.m2263b();
                    }
                    if (c0749e2.m2278a()) {
                        m1072A.f6130cf.f4622c.add(c0749e2);
                        it4.remove();
                    }
                }
            }
        }
        if (!this.IsServer) {
            if (!m1072A.f6130cf.f4622c.isEmpty()) {
                Iterator it5 = m1072A.f6130cf.f4622c.iterator();
                while (it5.hasNext()) {
                    C0749e c0749e3 = (C0749e) it5.next();
                    if (!c0749e3.m2255e()) {
                        c0749e3.m2248j();
                        StreamWriter streamWriter2 = new StreamWriter();
                        try {
                            c0749e3.m2266a(streamWriter2);
                            m1472d(streamWriter2.mo1360b(20));
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
                m1072A.f6130cf.f4622c.clear();
            }
        } else if (!m1072A.f6130cf.f4622c.isEmpty()) {
            Iterator it6 = m1072A.f6130cf.f4622c.iterator();
            while (it6.hasNext()) {
                C0749e c0749e4 = (C0749e) it6.next();
                if (!c0749e4.m2255e()) {
                    if (!c0749e4.m2246l()) {
                        m1449g("Skipped command issued from server");
                    } else {
                        c0749e4.m2248j();
                        m1564a(c0749e4);
                    }
                }
            }
            m1072A.f6130cf.f4622c.clear();
        }
        while (!this.f5607bd.isEmpty()) {
            Packet packet = (Packet) this.f5607bd.remove();
            try {
                m1559a(packet);
            } catch (IOException e3) {
                String str = "None";
                Steam steam = packet.steam;
                if (steam != null) {
                    str = steam.m1328g();
                    String message = e3.getMessage();
                    if (message == null) {
                        message = "IO error";
                    }
                    steam.m1340a(message);
                    m1449g("IO error on processGamePacket for " + steam.m1330e());
                }
                LoggerMaybe.m1026a("Error on processGamePacket ip:" + str, (Throwable) e3);
            }
        }
        if (this.IsServer) {
            if (!this.lock1) {
                LoggerMaybe.LogDebug2("Skipping server updates, not networked");
            } else {
                m1505ay();
                if (!this.f5513aj) {
                    m1475d(f);
                }
            }
        }
        if (!this.IsServer && this.lock1) {
            boolean z3 = false;
            Iterator it7 = this.f5606bc.iterator();
            while (it7.hasNext()) {
                Steam steam2 = (Steam) it7.next();
                if (steam2.f5777p && !steam2.f5803a) {
                    z3 = true;
                }
            }
            if (this.f5544bu && m1428n()) {
                m1072A.f6117bS.m1806b("Game ended by server.");
                ActivityC0122n.m5091o();
            } else if (!z3 && m1428n()) {
                m1072A.f6117bS.m1806b("Server Disconnected.");
                ActivityC0122n.m5091o();
            }
            if (z3 && this.f5504Y && !this.IsServer && (m1581W = m1581W()) != null && m1581W.f5801U > 20000) {
                String str2 = "Receiving network data: " + m1581W.f5802V + "/" + m1581W.f5801U;
                LoggerMaybe.LogDebug2(str2);
                m1072A.f6117bS.m1792d(str2);
            }
        }
        if (this.lock1) {
            if (this.f5515al) {
                m1072A.f6117bS.m1805b("Game paused.", 100);
            } else {
                m1072A.f6117bS.m1822a("Game paused.");
            }
        }
        if (m1072A.f6239bx < this.f5580X) {
            this.f5504Y = false;
        }
        if (this.f5616bC) {
            m1491b("queDisconnect");
        }
    }

    /* renamed from: b */
    public void m1502b(float f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.lock1 && (this.f5581ah + this.f5582ai < m1072A.f6239bx || this.f5581ah == -1)) {
            m1598F();
            m1072A.f6126cb.m2419c();
        }
        if ((this.lock1 || m1072A.f6126cb.m2411h()) && this.f5498N) {
            this.f5498N = false;
            m1416w();
        }
        if (this.lock1 && this.IsServer && !this.f5517aD && this.f5581ah + (this.f5582ai / 2) < m1072A.f6239bx && this.f5581ah != -1) {
            try {
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.WriteInteger(this.f5581ah);
                streamWriter.mo1373a(this.f5516am);
                streamWriter.WriteInteger(this.f5583an.size());
                Iterator it = this.f5583an.iterator();
                while (it.hasNext()) {
                    streamWriter.mo1373a(((C0851ak) it.next()).f5677b);
                }
                m1445h(streamWriter.mo1360b(30));
                if (this.f5476g) {
                    LoggerMaybe.LogDebug2("Sent checksum to client [" + this.f5581ah + "]");
                }
                this.f5517aD = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: I */
    public boolean m1595I() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6119bU.m1130e()) {
            if (!this.f5618bI) {
                LoggerMaybe.LogDebug2("shouldGameBePaused: isGoingToBlockThisFrame()==true: " + m1072A.f6119bU.m1129f());
            }
            this.f5618bI = true;
            return true;
        }
        if (this.f5618bI) {
            LoggerMaybe.LogDebug2("shouldGameBePaused: isGoingToBlockThisFrame()==false");
        }
        this.f5618bI = false;
        return false;
    }

    /* renamed from: a */
    public void m1574a(float f, boolean z) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6239bx >= this.f5580X) {
            if (m1072A.f6239bx > this.f5580X) {
                throw new RuntimeException("game frame:" + m1072A.f6239bx + " is greater then nest step:" + this.f5580X);
            }
            this.f5504Y = true;
        }
        if (z && m1595I()) {
            this.f5504Y = true;
        }
    }

    /* renamed from: a */
    public void m1559a(Packet packet) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1496b(packet)) {
            LogError("filtered packet (type:" + packet.MsgId + ")");
            return;
        }
        switch (packet.MsgId) {
            case 10:
                if (this.IsServer) {
                    LogError("we are a server! we don't follow orders");
                    return;
                } else if (packet.steam.f5781t) {
                    LogError("ignoring command");
                    return;
                } else {
                    Reader reader = new Reader(packet);
                    int ReadInt = reader.ReadInt();
                    int ReadInt2 = reader.ReadInt();
                    for (int i = 0; i < ReadInt2; i++) {
                        C0749e m2368b = m1072A.f6130cf.m2368b();
                        m2368b.f4840c = this.f5580X;
                        m2368b.m2265a(reader);
                        m1564a(m2368b);
                    }
                    if (ReadInt < this.f5580X) {
                        m1449g("New nextBlockingFrame:" + ReadInt + " is smaller than current step:" + this.f5580X);
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
                if (!steam.m1344a()) {
                    C0187e c0187e = steam.f5787z;
                    if (c0187e == null) {
                        LogError("Player is null for message ADDCLIENTCOMMAND, skipping");
                        return;
                    }
                    C0749e m2368b2 = m1072A.f6130cf.m2368b();
                    m2368b2.m2265a(reader2);
                    m2368b2.f4848p = c0187e;
                    if (m2368b2.f4850r) {
                        LogError("Got system action from client, ignoring (" + steam.f5766c + ")");
                        m2368b2.f4850r = false;
                    }
                    if (m2368b2.m2260c() == null) {
                        m1449g("Invalid command from '" + c0187e.f1316u + "', no team found");
                        return;
                    } else if (!m2368b2.m2246l()) {
                        m1449g("Ignored command from '" + c0187e.f1316u + "', check failed");
                        return;
                    } else {
                        m1564a(m2368b2);
                        return;
                    }
                }
                return;
            case 30:
                Steam steam2 = packet.steam;
                Reader reader3 = new Reader(packet);
                int ReadInt3 = reader3.ReadInt();
                long m1283i = reader3.m1283i();
                if (this.f5512ag) {
                    LogError("PACKET_SYNCCHECKSUM: skipping frame:" + ReadInt3 + ", we were told to wait for resync");
                    return;
                }
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.mo1355c(0);
                streamWriter.WriteInteger(ReadInt3);
                streamWriter.WriteInteger(this.f5581ah);
                if (this.f5581ah != ReadInt3 || this.f5516am == 0) {
                    streamWriter.mo1314a(false);
                    Log.m5262d("RustedWarfare", "got remoteSyncFrame for:" + ReadInt3 + " needed:" + this.f5581ah + " lastSyncCheckSum:" + this.f5516am);
                } else {
                    streamWriter.mo1314a(true);
                    Log.m5262d("RustedWarfare", "Running checksum");
                    streamWriter.mo1373a(m1283i);
                    streamWriter.mo1373a(this.f5516am);
                    boolean z = false;
                    if (m1283i != this.f5516am) {
                        m1449g("Checksum doesn't match. Got:" + m1283i + " expected:" + this.f5516am);
                        z = true;
                        LoggerMaybe.LogDebug2("--- Desync for frame: " + ReadInt3 + " ---");
                        Iterator it = AbstractC0197n.m4603c().iterator();
                        while (it.hasNext()) {
                            ((AbstractC0197n) it.next()).m4553t();
                        }
                    } else {
                        this.f5519aG++;
                    }
                    int ReadInt4 = reader3.ReadInt();
                    if (ReadInt4 != this.f5583an.size()) {
                        Log.m5262d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    streamWriter.mo1350e("checkList");
                    streamWriter.WriteInteger(ReadInt4);
                    streamWriter.WriteInteger(this.f5583an.size());
                    Iterator it2 = this.f5583an.iterator();
                    while (it2.hasNext()) {
                        C0851ak c0851ak = (C0851ak) it2.next();
                        long m1283i2 = reader3.m1283i();
                        streamWriter.mo1373a(m1283i2);
                        streamWriter.mo1373a(c0851ak.f5677b);
                        if (m1283i2 != c0851ak.f5677b && c0851ak.f5678c) {
                            m1449g("[" + ReadInt3 + "] check(" + c0851ak.f5676a + "): " + m1283i2 + "!=" + c0851ak.f5677b);
                            z = true;
                        }
                    }
                    streamWriter.mo1317a("checkList");
                    streamWriter.mo1314a(z);
                }
                if (!this.IsServer) {
                    SendPacket(steam2, streamWriter.mo1360b(31));
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
                reader4.m1289d();
                int ReadInt5 = reader4.ReadInt();
                int ReadInt6 = reader4.ReadInt();
                if (reader4.ReadBool()) {
                    reader4.m1283i();
                    reader4.m1283i();
                    reader4.m1292b("checkList");
                    reader4.ReadInt();
                    if (reader4.ReadInt() != this.f5583an.size()) {
                        Log.m5262d("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                    }
                    Iterator it3 = this.f5583an.iterator();
                    while (it3.hasNext()) {
                        C0851ak c0851ak2 = (C0851ak) it3.next();
                        long m1283i3 = reader4.m1283i();
                        long m1283i4 = reader4.m1283i();
                        if (m1283i3 != m1283i4) {
                            LoggerMaybe.m983b(c0851ak2.f5676a + " Checksum [" + ReadInt5 + "]. server:" + m1283i3 + " client:" + m1283i4);
                        }
                    }
                    reader4.m1288d("checkList");
                    boolean ReadBool = reader4.ReadBool();
                    if (this.f5552bG >= ReadInt5) {
                        LogError("Not marking desync, already resynced before frame: " + this.f5552bG + "<=" + ReadInt5);
                        return;
                    }
                    if (!steam3.f5783v && ReadBool) {
                        steam3.f5786y++;
                    }
                    steam3.f5783v = ReadBool;
                    if (!ReadBool) {
                        if (this.f5476g) {
                            LoggerMaybe.LogDebug2("checksum: client checksum match [" + ReadInt5 + "]");
                        }
                        steam3.f5785x++;
                        return;
                    }
                    LoggerMaybe.LogDebug2("client:" + steam3.m1330e() + " desync [" + ReadInt5 + "]");
                    if (this.f5513aj && !this.f5514ak) {
                        m1449g("pauseOnDesync is active, pausing");
                        this.f5514ak = true;
                        return;
                    }
                    return;
                } else if (this.f5476g) {
                    LoggerMaybe.LogDebug2("checksum for:" + steam3.m1330e() + " frameMatch==false client:" + ReadInt6 + " server:[" + ReadInt5 + "]");
                    return;
                } else {
                    return;
                }
            case 35:
                Reader reader5 = new Reader(packet);
                reader5.m1289d();
                int ReadInt7 = reader5.ReadInt();
                int ReadInt8 = reader5.ReadInt();
                float m1285g = reader5.m1285g();
                float m1285g2 = reader5.m1285g();
                if (!this.IsServer && m1285g < 0.1d) {
                    m1543a("resync packet with setCurrentStepRate:" + m1285g + " is too small", true);
                }
                Steam steam4 = packet.steam;
                if (steam4.f5781t) {
                    LogError("ignoring resync command");
                    return;
                }
                boolean ReadBool2 = reader5.ReadBool();
                if (reader5.ReadBool()) {
                    if (!this.IsServer) {
                        LogError("we are not a server, but got a debug game save! skipping");
                        return;
                    } else {
                        m1535a(reader5.m1290c("gameSave"), steam4);
                        return;
                    }
                }
                LoggerMaybe.LogDebug2("Reloading from network save");
                if (ReadBool2 && !this.IsServer) {
                    m1536a(false, true, false);
                }
                byte[] m1290c = reader5.m1290c("gameSave");
                LoggerMaybe.LogDebug2("Save size: " + m1290c.length);
                if (this.f5564l) {
                    m1535a(m1290c, steam4);
                }
                m1072A.f6126cb.m2422a(m1290c, m1072A.f6239bx, ReadInt7, ReadInt8, m1285g, m1285g2);
                Reader reader6 = new Reader(m1290c);
                m1072A.m1025a("Resyncing game from server...", true);
                m1072A.f6125ca.m427a(reader6, true, true, true);
                m1072A.m1048Y();
                this.f5520aH++;
                m1072A.f6239bx = ReadInt7;
                m1072A.f6102by = ReadInt8;
                this.f5580X = ReadInt7 + 1;
                this.f5512ag = false;
                this.f5581ah = this.f5580X + 1;
                this.f5516am = 0L;
                if (m1285g < 0.1d) {
                    m1543a("resync setCurrentStepRate:" + m1285g + " is too small", true);
                }
                m1575a(m1285g, "rsync");
                this.f5574J = m1285g2;
                return;
            default:
                LogError("we did not handle packet:" + packet.MsgId);
                return;
        }
    }

    /* renamed from: b */
    public synchronized boolean m1496b(Packet packet) {
        Steam steam;
        if (this.IsServer && (steam = packet.steam) != null && !steam.f5777p && packet.MsgId != 105 && packet.MsgId != 110 && packet.MsgId != 111 && packet.MsgId != 108 && packet.MsgId != 160) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public synchronized void HandlePacket(Packet packet) {
        int i;
        String relayId;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1496b(packet)) {
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
                this.f5603aO.f5654a = (EnumC0846ai) reader.m1293b(EnumC0846ai.class);
                this.f5603aO.f5655b = reader.ReadUTF();
                this.f5603aO.f5656c = reader.ReadInt();
                this.f5603aO.f5657d = reader.ReadInt();
                this.f5603aO.f5658e = reader.ReadBool();
                this.f5603aO.f5659f = reader.ReadInt();
                byte m1289d = reader.m1289d();
                this.f5494G = reader.ReadBool();
                this.f5495H = reader.ReadBool();
                this.f5523aL = true;
                if (m1289d >= 1) {
                    this.f5601aM = reader.ReadInt();
                    this.f5602aN = reader.ReadInt();
                }
                if (m1289d >= 2) {
                    this.f5603aO.f5660g = reader.ReadInt();
                    this.f5603aO.f5661h = reader.m1285g();
                    this.f5603aO.f5662i = reader.ReadBool();
                    this.f5603aO.f5663j = reader.ReadBool();
                }
                if (m1289d >= 3 && reader.ReadBool()) {
                    try {
                        C0453l.m3542a(reader);
                        this.f5568x = true;
                    } catch (C0401bb e) {
                        m1491b("Missing unit:" + e.getMessage() + " d:" + e.f2631b);
                        m1490b("Server sync mismatch", e.getMessage());
                        if (!LoggerMaybe.m995au()) {
                            m1072A.m954i(e.getMessage());
                        }
                        String str = "Server sync mismatch";
                        if (e.f2488a != null) {
                            str = e.f2488a;
                        }
                        m1072A.m968d(str, e.getMessage());
                        return;
                    }
                }
                if (m1289d >= 4) {
                    this.f5603aO.f5652l = reader.ReadBool();
                }
                if (m1289d >= 5) {
                    this.f5603aO.f5665m = reader.ReadBool();
                }
                if (m1289d >= 6) {
                    this.f5603aO.f5666n = reader.ReadBool();
                }
                if (m1289d >= 7) {
                    this.f5603aO.f5667o = reader.ReadBool();
                    this.f5603aO.f5668p = reader.ReadBool();
                }
                if (m1289d >= 8) {
                    this.f5603aO.f5653q = reader.ReadInt();
                }
                ActivityC0122n.m5091o();
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
                long m1283i = reader2.m1283i();
                reader2.m1289d();
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.mo1373a(m1283i);
                streamWriter.mo1355c(1);
                int mo989b = m1072A.mo989b();
                if (mo989b > 130) {
                    mo989b = 130;
                }
                streamWriter.mo1355c(mo989b);
                SendPacket(steam2, streamWriter.mo1360b(109));
                return;
            case 109:
                if (!this.IsServer) {
                    LogError("we are not a server! skipping");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                Steam steam3 = packet.steam;
                Reader reader3 = new Reader(packet);
                long m1283i2 = reader3.m1283i();
                byte b = 0;
                if (reader3.m1289d() >= 1) {
                    b = reader3.m1289d();
                }
                int i2 = (int) (currentTimeMillis - m1283i2);
                steam3.f5807A = i2;
                steam3.f5808B = currentTimeMillis;
                if (steam3.f5787z != null) {
                    steam3.f5787z.f1346V = i2;
                    steam3.f5787z.f1347W = currentTimeMillis;
                    steam3.f5787z.f1345U = b;
                }
                if (steam3.f5778q && this.IsServer && this.f5492D && this.f5489z != null) {
                    this.f5489z.f1346V = i2;
                    this.f5489z.f1347W = currentTimeMillis;
                }
                if (!this.f5539bm) {
                    ActivityC0122n.m5091o();
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
                    steam4.f5792L = reader4.ReadUTF();
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
                    m1552a(steam4, "Your username is too long");
                    steam4.m1340a("kicked");
                    return;
                }
                String m1425o = m1425o(ReadUTF);
                if (m1425o.length() < 2) {
                    m1552a(steam4, "Your username is too short");
                    steam4.m1340a("kicked");
                    return;
                }
                C0187e c0187e = null;
                if (str2 != null) {
                    c0187e = AbstractC0197n.m4622a(str2);
                    if (c0187e != null) {
                        LogError("Existing player: " + c0187e.f1306k + " - " + c0187e.f1316u);
                    }
                }
                C0850aj m1558a = m1558a(steam4);
                if (m1558a != null) {
                    LoggerMaybe.LogDebug2("Connection banned for " + m1558a.m1400b() + " more seconds");
                    m1552a(steam4, m1558a.m1401a());
                    steam4.m1340a("kicked");
                    return;
                }
                String m1606a = this.f5562d.m1606a(steam4, m1425o, ReadInt2, ReadInt3, steam4.f5792L, c0187e);
                if (m1606a != null) {
                    m1552a(steam4, m1606a);
                    steam4.m1340a("kicked");
                    return;
                } else if (ReadInt2 < this.GameVersion && !this.f5566v) {
                    m1552a(steam4, "Game is out of date, please update to v" + m1072A.mo937t());
                    steam4.m1340a("kicked");
                    return;
                } else if (ReadInt2 > this.GameVersion && !this.f5566v) {
                    m1552a(steam4, "Your client is newer then the server. Server is on: v" + m1072A.mo937t());
                    steam4.m1340a("kicked");
                    return;
                } else if (!this.f5566v && i3 != m1072A.mo934y()) {
                    LoggerMaybe.LogDebug2("New Player kicked: Unit checksum mismatch: clientUnitsChecksum=" + i3 + " game.getAllUnitsChecksum():" + m1072A.mo934y());
                    m1552a(steam4, "Your core units are different to the server's core units. Game can not be synchronized");
                    steam4.m1340a("kicked");
                    return;
                } else {
                    if (!this.f5566v) {
                        String m1453g = m1453g(steam4.f5793M);
                        if (!m1453g.equals(str3)) {
                            LoggerMaybe.LogDebug2("New Player kicked: Integrity Check Failed: expectedResponse=" + m1453g + " clientResponse=" + str3);
                            m1552a(steam4, "Your 'Rusted Warfare' client is different to the server. Game can not be synchronized.");
                            steam4.m1340a("kicked");
                            return;
                        }
                    }
                    if (!this.f5539bm && this.f5603aO.f5668p) {
                        m1552a(steam4, "Room is locked. New players cannot join this server.");
                        steam4.m1340a("kicked");
                        return;
                    } else if (this.f5539bm && c0187e == null && !this.f5485s) {
                        m1552a(steam4, "A game has already been started on this server");
                        steam4.m1340a("kicked");
                        return;
                    } else if (this.f5481n != null && c0187e == null && !C0758f.m2061e(this.f5481n).equals(ReadString)) {
                        if (ReadString == null) {
                            LoggerMaybe.m982b("processSystemPacket", "Player tried to join but needs a password");
                        } else {
                            LoggerMaybe.m982b("processSystemPacket", "Player tried to join but had an incorrect password");
                        }
                        m1471d(steam4);
                        return;
                    } else {
                        if (!m1447h(this.ServerKey).equals(str4)) {
                            steam4.LogDebug("no extra");
                            steam4.f5794N = true;
                        }
                        if (steam4.f5787z == null) {
                            synchronized (this.f5623bP) {
                                if (c0187e == null) {
                                    i = AbstractC0197n.m4660E();
                                } else {
                                    i = c0187e.f1306k;
                                }
                                if (i == -1 && !this.f5566v) {
                                    m1552a(steam4, "No free slots on server");
                                    steam4.m1340a("no free slots");
                                    return;
                                }
                                String mo411a = this.f5562d.mo411a(steam4, m1425o);
                                if (mo411a != null) {
                                    m1552a(steam4, mo411a);
                                    steam4.m1340a("kicked");
                                } else {
                                    C0857ap.m1391a(steam4);
                                    if (!this.f5566v && steam4.f5795O) {
                                        m1552a(steam4, VariableScope.nullOrMissingString);
                                        steam4.m1340a("kicked");
                                        return;
                                    }
                                    String str5 = null;
                                    if (c0187e != null) {
                                        steam4.f5787z = c0187e;
                                        String str6 = VariableScope.nullOrMissingString;
                                        if (this.f5539bm) {
                                            if (c0187e.m4619b()) {
                                                str6 = " (Spectator)";
                                            } else {
                                                str6 = " (Team " + c0187e.m4570h() + ")";
                                            }
                                        }
                                        m1435j("'" + steam4.f5787z.f1316u + "' reconnected. " + str6);
                                        steam4.f5784w = true;
                                        str5 = c0187e.f1316u;
                                        c0187e.f1339O = steam4.f5774m;
                                    } else {
                                        if (this.f5566v && i == -1) {
                                            steam4.f5787z = new C0187e(-3);
                                        } else {
                                            steam4.f5787z = new C0187e(i);
                                            steam4.f5787z.f1312q = i % 2;
                                        }
                                        if (this.f5539bm && this.f5485s) {
                                            steam4.f5784w = true;
                                        }
                                    }
                                    if (c0187e == null && m1425o != null) {
                                        ArrayList m1506ax = m1506ax();
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < 10) {
                                                boolean z = false;
                                                String str7 = m1425o;
                                                if (i4 > 0) {
                                                    str7 = str7 + "(" + i4 + ")";
                                                }
                                                Iterator it = m1506ax.iterator();
                                                while (it.hasNext()) {
                                                    if (str7.equalsIgnoreCase(((AbstractC0197n) it.next()).f1316u)) {
                                                        z = true;
                                                    }
                                                }
                                                if (z) {
                                                    i4++;
                                                } else {
                                                    m1425o = str7;
                                                }
                                            }
                                        }
                                    }
                                    steam4.f5787z.f1316u = m1425o;
                                    steam4.f5787z.f1338N = str2;
                                    steam4.f5787z.f1339O = steam4.f5774m;
                                    steam4.GameVersion = ReadInt2;
                                    LoggerMaybe.m982b("processSystemPacket", "New player: " + m1425o + ", networkVersion:" + steam4.GameVersion + " existing:" + (c0187e != null));
                                    steam4.f5777p = true;
                                    if (c0187e == null) {
                                        this.f5562d.m1609a(steam4.f5787z);
                                    }
                                    ActivityC0122n.m5091o();
                                    m1463e(steam4);
                                    m1481c(steam4);
                                    this.f5562d.mo400c(steam4, m1425o, str5);
                                    if ((c0187e != null || this.f5485s) && this.f5539bm) {
                                        m1550a(steam4, true);
                                    }
                                }
                                return;
                            }
                        }
                        LoggerMaybe.m982b("processSystemPacket", "This connection already has a player");
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
                    LoggerMaybe.m1026a("Error reading disconnect reason", (Throwable) e2);
                }
                LogError("Got a disconnect packet:" + str8);
                if (steam5 != null) {
                    steam5.m1337a(false, false, str8);
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
                steam6.f5809C = reader6.ReadBool();
                steam6.f5810D = reader6.ReadBool();
                return;
            case 113:
                if (this.IsServer) {
                    LogError("we are a server! skipping: " + packet.MsgId);
                    return;
                } else {
                    m1563a(f5561bR);
                    return;
                }
            case 115:
                if (this.IsServer) {
                    LogError("we are a server! we don't follow orders");
                    return;
                }
                Reader reader7 = new Reader(packet);
                reader7.m1294b(packet.steam.GameVersion);
                Steam steam7 = packet.steam;
                int ReadInt4 = reader7.ReadInt();
                AbstractC0197n abstractC0197n = null;
                int i5 = 8;
                boolean z2 = false;
                if (reader7.m1291c() >= 90) {
                    boolean z3 = false;
                    if (reader7.m1291c() >= 141) {
                        z3 = true;
                        z2 = reader7.ReadBool();
                    }
                    i5 = reader7.ReadInt();
                    AbstractC0197n.m4616b(i5, false);
                    reader7.m1298a("teams", z3);
                    if (i5 > AbstractC0197n.f1365c) {
                        throw new IOException("Cannot load:" + i5 + " teams");
                    }
                } else if (this.f5539bm) {
                    m1449g("Warning old team system used in started game, stream version:" + reader7.m1291c());
                }
                for (int i6 = 0; i6 < i5; i6++) {
                    C0187e m4562k = AbstractC0197n.m4562k(i6);
                    if (!reader7.ReadBool()) {
                        if (m4562k != null) {
                            if (this.f5539bm) {
                                m1449g("Warning team:" + i6 + " removed while game is running");
                            }
                            m4562k.m4658G();
                        }
                    } else {
                        reader7.ReadInt();
                        if (m4562k == null) {
                            if (this.f5539bm) {
                                m1449g("Warning team:" + i6 + " added while game is running");
                            }
                            if (!this.IsServer && (m4562k instanceof C0136a)) {
                                m1449g("Warning we are a client with an AI team");
                            }
                            m4562k = new C0187e(i6);
                        }
                        if (z2) {
                            m4562k.m4629a(reader7);
                        } else {
                            m4562k.m4628a(reader7, this.f5539bm);
                        }
                    }
                    if (m4562k != null && m4562k.f1306k == ReadInt4) {
                        abstractC0197n = m4562k;
                    }
                }
                if (reader7.m1291c() >= 90) {
                    reader7.m1288d("teams");
                }
                this.f5489z = abstractC0197n;
                this.f5603aO.f5657d = reader7.ReadInt();
                this.f5603aO.f5656c = reader7.ReadInt();
                this.f5603aO.f5658e = reader7.ReadBool();
                this.f5603aO.f5659f = reader7.ReadInt();
                byte m1289d2 = reader7.m1289d();
                this.f5601aM = reader7.ReadInt();
                this.f5602aN = reader7.ReadInt();
                if (m1289d2 >= 2) {
                    this.f5603aO.f5660g = reader7.ReadInt();
                    this.f5603aO.f5661h = reader7.m1285g();
                    this.f5603aO.f5662i = reader7.ReadBool();
                    this.f5603aO.f5663j = reader7.ReadBool();
                }
                if (m1289d2 >= 3 && reader7.ReadBool()) {
                    try {
                        C0453l.m3542a(reader7);
                        this.f5568x = true;
                    } catch (C0401bb e3) {
                        m1491b("Missing unit:" + e3.getMessage() + " d:" + e3.f2631b);
                        m1490b("Connection Failed", e3.getMessage());
                        if (!LoggerMaybe.m995au()) {
                            m1072A.m954i(e3.getMessage());
                        }
                        m1072A.m968d("Connection Failed", e3.getMessage());
                        return;
                    }
                }
                if (m1289d2 >= 4) {
                    this.f5603aO.f5652l = reader7.ReadBool();
                }
                if (m1289d2 >= 5) {
                    this.f5515al = reader7.ReadBool();
                }
                ActivityC0122n.m5091o();
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
                if (this.IsServer && !steam9.f5778q) {
                    LogError("we are a server! skipping: " + packet.MsgId);
                    return;
                }
                Reader reader9 = new Reader(packet);
                reader9.m1289d();
                int ReadInt5 = reader9.ReadInt();
                String ReadUTF2 = reader9.ReadUTF();
                C0841ae c0841ae = new C0841ae();
                c0841ae.f5643d = true;
                c0841ae.f5642c = ReadInt5;
                c0841ae.f5641b = ReadUTF2;
                m1563a(c0841ae);
                return;
            case 118:
                return;
            case 120:
                if (this.IsServer) {
                    LogError("error, we are a server but got: PACKET_START_GAME");
                    return;
                }
                Reader reader10 = new Reader(packet);
                reader10.m1289d();
                this.f5603aO.f5654a = (EnumC0846ai) reader10.m1293b(EnumC0846ai.class);
                if (this.f5603aO.f5654a == EnumC0846ai.f5671c) {
                    this.f5524aQ = reader10.m1271u();
                } else if (this.f5603aO.f5654a == EnumC0846ai.f5670b) {
                    this.f5525aR = reader10.m1271u();
                }
                this.f5604aP = reader10.ReadUTF();
                m1533aB();
                return;
            case 122:
                if (this.IsServer) {
                    LogError("error, we are a server but got: PACKET_RETURN_TO_BATTLEROOM");
                    return;
                } else {
                    m1532aC();
                    return;
                }
            case 140:
                if (!this.IsServer) {
                    LogError("we are not a server! skipping");
                    return;
                }
                Steam steam10 = packet.steam;
                Reader reader11 = new Reader(packet);
                C0187e c0187e2 = steam10.f5787z;
                if (c0187e2 == null) {
                    if (steam10.f5778q) {
                        LogError("Allowing message from non player on forwarding connection");
                        c0187e2 = this.f5548bA;
                    } else {
                        LogError("player is null for message, skipping");
                        return;
                    }
                }
                String ReadUTF3 = reader11.ReadUTF();
                reader11.m1289d();
                String m1437i = m1437i(ReadUTF3);
                if (this.f5562d.mo410a(steam10, c0187e2.f1316u, m1437i)) {
                    if (this.f5605aS.m1616a(steam10, 60000) > this.f5563h) {
                        if (C0758f.m2146a(steam10.f5769g, System.nanoTime()) > 60000) {
                            steam10.f5769g = System.nanoTime();
                            m1435j("Anti-spam: Too many messages from '" + steam10.m1330e() + "'");
                        }
                        if (this.f5476g) {
                            LoggerMaybe.LogDebug2("extraDebug:" + m1437i);
                            return;
                        }
                        return;
                    }
                    m1555a(steam10, c0187e2, c0187e2.f1316u, m1437i);
                    this.f5562d.mo403b(steam10, c0187e2.f1316u, m1437i);
                    m1493b(steam10, c0187e2, c0187e2.f1316u, m1437i);
                    return;
                }
                return;
            case 141:
                if (this.IsServer && !packet.steam.f5778q) {
                    LogError("error, we are a server but got: PACKET_RECEIVE_CHAT_FROM_SERVER");
                    return;
                }
                Reader reader12 = new Reader(packet);
                String ReadUTF4 = reader12.ReadUTF();
                byte m1289d3 = reader12.m1289d();
                String ReadString2 = reader12.ReadString();
                reader12.ReadInt();
                int i7 = -1;
                if (m1289d3 >= 3) {
                    i7 = reader12.ReadInt();
                }
                m1494b((Steam) null, i7, ReadString2, ReadUTF4);
                return;
            case 150:
                if (this.IsServer) {
                    LogError("error, we are a server but got: PACKET_SEND_KICK");
                    return;
                }
                String m1683c = C0820a.m1683c(new Reader(packet).ReadUTF());
                LogError("we got kicked, reason:" + m1683c);
                m1491b("I was kicked");
                m1490b("Kicked", "Kicked: " + m1683c);
                m1072A.m968d("Kicked", "Kicked: " + m1683c);
                m1072A.m954i("Kicked: " + m1683c);
                return;
            case 151:
                Steam steam11 = packet.steam;
                if (this.IsServer && !steam11.f5778q) {
                    LogError("error, we are a server but got: 151");
                    return;
                }
                long m2388a = C0727bl.m2388a();
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
                    str9 = m1453g(C0857ap.f5725i);
                }
                if (ReadInt7 == 3) {
                    str9 = C0758f.m2079c(C0857ap.f5725i + "|" + C0857ap.f5726j);
                }
                if (ReadInt7 == 4) {
                    str9 = C0758f.m2079c(C0857ap.f5725i + "|" + C0857ap.f5726j);
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
                                if (!C0758f.m2079c(ReadUTF6 + i8).equals(ReadUTF5)) {
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
                float m2386a = C0727bl.m2386a(m2388a);
                StreamWriter streamWriter2 = new StreamWriter();
                streamWriter2.WriteInteger(ReadInt6);
                streamWriter2.WriteInteger(ReadInt7);
                streamWriter2.WriteUTF(str9);
                streamWriter2.mo1320a(m2386a);
                SendPacket(steam11, streamWriter2.mo1360b(152));
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
                    LoggerMaybe.LogDebug2("steam: request info packet");
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
                    if (LoggerMaybe.m993aw()) {
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
                    LoggerMaybe.LogDebug2("steam: got info packet");
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
                m1444h(steam13);
                return;
            case 163:
                if (this.IsServer) {
                    LogError("we are already a server");
                    return;
                }
                Reader reader16 = new Reader(packet);
                reader16.m1289d();
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
                byte m1289d4 = reader17.m1289d();
                boolean ReadBool2 = reader17.ReadBool();
                boolean ReadBool3 = reader17.ReadBool();
                String ReadString3 = reader17.ReadString();
                boolean ReadBool4 = reader17.ReadBool();
                boolean ReadBool5 = reader17.ReadBool();
                String ReadString4 = reader17.ReadString();
                boolean z4 = false;
                if (m1289d4 >= 1) {
                    z4 = reader17.ReadBool();
                }
                String str10 = null;
                if (m1289d4 >= 2) {
                    str10 = reader17.ReadString();
                }
                LogError("Multicast:" + z4);
                steam14.f5779r = z4;
                if (ReadBool2) {
                    steam14.f5778q = true;
                }
                if (ReadBool3) {
                    steam14.f5780s = true;
                }
                this.f5492D = true;
                this.f5493E = ReadString4;
                m1072A.f6122bX.f5481n = null;
                m1072A.f6122bX.f5482o = ReadBool4;
                m1072A.f6122bX.f5484q = ReadBool5;
                m1477c(false);
                if (str10 != null) {
                    if (this.f5489z != null) {
                        this.f5489z.f1339O = str10;
                    } else {
                        LoggerMaybe.LogDebug2("Become server: No local team");
                    }
                }
                if (m1072A.f6122bX.f5484q) {
                }
                if (ReadString3 != null) {
                    m1072A.f6115bQ.networkServerId = ReadString3;
                }
                if (m1072A.f6239bx > 60) {
                    this.f5506aa = true;
                }
                if (!this.f5568x && !this.f5539bm) {
                    LoggerMaybe.LogDebug2("enableAllCustomUnitsPossible mods:" + this.f5482o);
                    C0348af.m4068b(this.f5482o);
                    this.f5568x = true;
                    return;
                }
                return;
            case 172:
                Steam steam15 = packet.steam;
                if (!steam15.f5778q) {
                    LogError("forwarding not allowed on this connection");
                    return;
                }
                LogError("got FORWARD_CLIENT_ADD");
                Reader reader18 = new Reader(packet);
                byte m1289d5 = reader18.m1289d();
                int ReadInt11 = reader18.ReadInt();
                String ReadUTF8 = reader18.ReadUTF();
                String ReadString5 = reader18.ReadString();
                String str11 = null;
                if (m1289d5 >= 1) {
                    str11 = reader18.ReadString();
                }
                if (m1557a(steam15, ReadInt11) != null) {
                    LogError("Not adding client:" + ReadInt11 + " already exists");
                    return;
                } else if (m1556a(steam15, ReadInt11, ReadUTF8, str11) != null && ReadString5 != null) {
                    C0187e m4605b = AbstractC0197n.m4605b(ReadUTF8);
                    if (m4605b == null) {
                        LogError("PACKET_FORWARD_CLIENT_ADD: Failed to find existing player with id:" + ReadUTF8);
                        Iterator it2 = AbstractC0197n.m4603c().iterator();
                        while (it2.hasNext()) {
                            AbstractC0197n abstractC0197n2 = (AbstractC0197n) it2.next();
                            if (abstractC0197n2 != null) {
                                LogError("option: " + abstractC0197n2.f1316u + " - " + abstractC0197n2.f1339O + " - localPlayer:" + (this.f5489z == abstractC0197n2));
                            }
                        }
                        return;
                    }
                    m4605b.f1338N = ReadString5;
                    return;
                } else {
                    return;
                }
            case 173:
                Steam steam16 = packet.steam;
                if (!steam16.f5778q) {
                    LogError("forwarding not allowed on this connection");
                    return;
                }
                LogError("got FORWARD_CLIENT_REMOVE");
                Reader reader19 = new Reader(packet);
                reader19.m1289d();
                Steam m1557a = m1557a(steam16, reader19.ReadInt());
                if (m1557a != null) {
                    m1492b(m1557a, (String) null);
                    return;
                }
                return;
            case 174:
                Steam steam17 = packet.steam;
                if (!steam17.f5778q) {
                    LogError("forwarding not allowed on this connection");
                    return;
                }
                Reader reader20 = new Reader(packet);
                int ReadInt12 = reader20.ReadInt();
                byte[] m1272t = reader20.m1272t();
                Steam m1557a2 = m1557a(steam17, ReadInt12);
                if (m1557a2 == null) {
                    LogError("PACKET_FORWARD_CLIENT_FROM failed, cannot find client");
                    return;
                } else if (!(m1557a2.f5767d instanceof C0873h)) {
                    LogError("PACKET_FORWARD_CLIENT_FROM failed, socket is wrong type");
                    return;
                } else {
                    ((C0873h) m1557a2.f5767d).f5853d.m1305a(m1272t);
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
                if (this.IsServer && !steam18.f5778q) {
                    LogError("we are a server, ");
                    return;
                }
                Reader reader21 = new Reader(packet);
                reader21.m1289d();
                reader21.ReadInt();
                boolean ReadBool6 = reader21.ReadBool();
                int ReadInt13 = reader21.ReadInt();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < ReadInt13; i10++) {
                    arrayList.add(reader21.ReadUTF());
                }
                m1540a(arrayList, ReadBool6);
                return;
        }
    }

    /* renamed from: i */
    public static String m1437i(String str) {
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
    public void m1594J() {
        LoggerMaybe.m1072A().f6117bS.f5112d.m1975n();
    }

    /* renamed from: K */
    public void m1593K() {
        m1490b((String) null, (String) null);
    }

    /* renamed from: b */
    public void m1490b(String str, String str2) {
        ActivityC0122n.m5096a(str, str2);
        this.f5562d.mo399d();
    }

    /* renamed from: L */
    public synchronized void m1592L() {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5777p) {
                m1481c(steam);
            }
        }
    }

    /* renamed from: c */
    public synchronized void m1481c(Steam steam) {
        if (!this.IsServer) {
            LogError("sendServerInfo: we are not a server!");
            return;
        }
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.WriteUTF("com.corrodinggames.rts");
            streamWriter.WriteInteger(this.GameVersion);
            streamWriter.mo1363a(this.f5603aO.f5654a);
            if (this.f5566v) {
                streamWriter.WriteUTF("<CHAT ONLY>");
            } else {
                streamWriter.WriteUTF(this.f5603aO.f5655b == null ? "<NULL>" : C0750a.m2213n(this.f5603aO.f5655b));
            }
            streamWriter.WriteInteger(this.f5603aO.f5656c);
            streamWriter.WriteInteger(this.f5603aO.f5657d);
            streamWriter.mo1314a(this.f5603aO.f5658e);
            streamWriter.WriteInteger(this.f5603aO.f5659f);
            streamWriter.mo1355c(8);
            streamWriter.mo1314a(this.f5562d.m1608a(steam));
            streamWriter.mo1314a(this.f5562d.m1605b(steam));
            streamWriter.WriteInteger(this.f5601aM);
            streamWriter.WriteInteger(this.f5602aN);
            streamWriter.WriteInteger(this.f5603aO.f5660g);
            streamWriter.mo1320a(this.f5603aO.f5661h);
            streamWriter.mo1314a(this.f5603aO.f5662i);
            streamWriter.mo1314a(this.f5603aO.f5663j);
            if (this.f5566v) {
                streamWriter.mo1314a(false);
            } else {
                streamWriter.mo1314a(true);
                C0453l.m3543a(streamWriter);
            }
            streamWriter.mo1314a(this.f5603aO.f5652l);
            streamWriter.mo1314a(this.f5603aO.f5665m);
            streamWriter.mo1314a(this.f5603aO.f5666n);
            streamWriter.mo1314a(this.f5603aO.f5667o);
            streamWriter.mo1314a(this.f5603aO.f5668p);
            streamWriter.WriteInteger(this.f5603aO.f5653q);
            SendPacket(steam, streamWriter.mo1360b(106));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public synchronized void m1552a(Steam steam, String str) {
        if (!this.IsServer) {
            LogError("sendKick: we are not a server!");
            return;
        }
        LogError("kicking client reason:" + str);
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.WriteUTF(str);
            SendPacket(steam, streamWriter.mo1360b(150));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public synchronized void m1471d(Steam steam) {
        if (!this.IsServer) {
            LogError("sendIncorrectPassword: we are not a server!");
            return;
        }
        LogError("sendIncorrectPassword");
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.WriteInteger(0);
            SendPacket(steam, streamWriter.mo1360b(113));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: M */
    public void m1591M() {
        if (this.IsServer) {
            for (int i = 0; i < AbstractC0197n.f1368f; i++) {
                AbstractC0197n m4562k = AbstractC0197n.m4562k(i);
                if (m4562k != null) {
                    if (this.f5566v) {
                        m4562k.f1352ab = 0;
                    } else if (m4562k.m4619b()) {
                        m4562k.f1352ab = 100;
                    } else {
                        m4562k.f1352ab = m4562k.f1312q;
                    }
                    if (m4562k.m4619b()) {
                        m4562k.f1324C = -1;
                    } else {
                        int m4649P = m4562k.m4649P();
                        if (m4562k.f1323B != null) {
                            m4649P = m4562k.f1323B.intValue();
                        } else if (m1572a(m4649P, (AbstractC0197n) null)) {
                            m4649P = -1;
                        }
                        m4562k.f1324C = m4649P;
                    }
                }
            }
            for (int i2 = 0; i2 < AbstractC0197n.f1368f; i2++) {
                AbstractC0197n m4562k2 = AbstractC0197n.m4562k(i2);
                if (m4562k2 != null && m4562k2.f1324C == -1 && !m4562k2.m4619b()) {
                    m4562k2.f1324C = m1590N();
                }
            }
        }
    }

    /* renamed from: N */
    public int m1590N() {
        for (int i = 0; i < 10; i++) {
            if (!m1459f(i)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public boolean m1459f(int i) {
        for (int i2 = 0; i2 < AbstractC0197n.f1368f; i2++) {
            AbstractC0197n m4562k = AbstractC0197n.m4562k(i2);
            if (m4562k != null && m4562k.f1324C == i && !m4562k.m4619b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1572a(int i, AbstractC0197n abstractC0197n) {
        for (int i2 = 0; i2 < AbstractC0197n.f1368f; i2++) {
            AbstractC0197n m4562k = AbstractC0197n.m4562k(i2);
            if (m4562k != null && m4562k != abstractC0197n && m4562k.f1323B != null && m4562k.f1323B.intValue() == i && !m4562k.m4619b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public void m1589O() {
        if (this.IsServer) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = LoggerMaybe.m1072A().f6102by;
            if (this.f5489z != null && !this.f5492D) {
                this.f5489z.f1346V = -99;
                this.f5489z.f1347W = currentTimeMillis;
            }
            m1591M();
            for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                AbstractC0197n m4562k = AbstractC0197n.m4562k(i2);
                if (m4562k != null) {
                    m4562k.m4591c(this.f5489z == m4562k);
                    if (!this.f5539bm) {
                    }
                    if (this.f5539bm && !this.f5571F && !m4562k.f1317v) {
                        boolean z = false;
                        if (m4562k.m4547z()) {
                            z = true;
                        }
                        long j = 60000;
                        if (m4562k.f1349Y > 180000) {
                            j = 160000;
                        }
                        boolean z2 = false;
                        if (this.f5506aa) {
                            if (m4562k.f1348X == -1) {
                                m4562k.f1348X = currentTimeMillis;
                                m4562k.f1349Y = i;
                            }
                            if ((this.f5514ak || this.f5515al) && !m4562k.f1351aa) {
                                m4562k.f1348X = currentTimeMillis;
                                m4562k.f1349Y = i;
                            }
                            if (m4562k.f1348X + j < currentTimeMillis) {
                                z2 = true;
                            }
                        }
                        if (m4562k.f1351aa != z2) {
                            m4562k.f1351aa = z2;
                        }
                        if (z2) {
                            z = true;
                            if (!m4562k.f1350Z) {
                                if (!(m4562k.f1330F || m4562k.f1329E || m4562k.f1333I || m4562k.m4619b())) {
                                    m4562k.f1350Z = true;
                                }
                            }
                        }
                        if (m4562k.f1333I != z) {
                            if (z && !m4562k.f1330F && !m4562k.f1329E && !m4562k.f1332H && !m4562k.m4619b()) {
                                String str = "-t [Sharing control due to disconnect]";
                                if (z2) {
                                    str = "-t [Sharing control due to afk]";
                                }
                                LoggerMaybe.LogDebug2(m4562k.f1316u + " - " + str);
                                if (AbstractC0197n.m4637a(m4562k.f1312q, true) > 1) {
                                    m1555a((Steam) null, m4562k, m4562k.f1316u, str);
                                }
                            }
                            m4562k.f1333I = z;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: P */
    public void m1588P() {
        if (this.f5522aK == 0) {
            this.f5522aK = System.currentTimeMillis();
        }
    }

    /* renamed from: Q */
    public void m1587Q() {
        this.f5522aK = 0L;
        m1463e((Steam) null);
    }

    /* renamed from: e */
    public void m1463e(Steam steam) {
        if (!this.IsServer) {
            LogError("sendUpdatePlayer: we are not a server!");
            return;
        }
        m1589O();
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam2 = (Steam) it.next();
            if (steam2.f5777p) {
                StreamWriter streamWriter = new StreamWriter(steam2.GameVersion);
                try {
                    streamWriter.WriteInteger(steam2.m1334c());
                    int i = AbstractC0197n.f1365c;
                    boolean z = false;
                    if (streamWriter.m1379g() >= 90) {
                        boolean z2 = false;
                        if (streamWriter.m1379g() >= 141) {
                            z2 = true;
                            if (this.f5539bm && steam2.f5797Q) {
                                z = true;
                            }
                            streamWriter.mo1314a(z);
                        }
                        streamWriter.WriteInteger(i);
                        streamWriter.mo1316a("teams", z2);
                    } else {
                        i = 8;
                        if (!this.f5566v) {
                            LogError("sendUpdatePlayer: warning saving with lower team count");
                        }
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        AbstractC0197n m4562k = AbstractC0197n.m4562k(i2);
                        streamWriter.mo1314a(m4562k != null);
                        if (m4562k != null) {
                            int i3 = 0;
                            if (m4562k instanceof C0136a) {
                                i3 = 1;
                            }
                            streamWriter.WriteInteger(i3);
                            if (z) {
                                m4562k.m4594c(streamWriter);
                            } else {
                                m4562k.m4609b(streamWriter);
                            }
                        }
                    }
                    if (streamWriter.m1379g() >= 90) {
                        streamWriter.mo1317a("teams");
                    }
                    streamWriter.WriteInteger(this.f5603aO.f5657d);
                    streamWriter.WriteInteger(this.f5603aO.f5656c);
                    streamWriter.mo1314a(this.f5603aO.f5658e);
                    streamWriter.WriteInteger(this.f5603aO.f5659f);
                    streamWriter.mo1355c(5);
                    streamWriter.WriteInteger(this.f5601aM);
                    streamWriter.WriteInteger(this.f5602aN);
                    streamWriter.WriteInteger(this.f5603aO.f5660g);
                    streamWriter.mo1320a(this.f5603aO.f5661h);
                    streamWriter.mo1314a(this.f5603aO.f5662i);
                    streamWriter.mo1314a(this.f5603aO.f5663j);
                    streamWriter.mo1314a(false);
                    streamWriter.mo1314a(this.f5603aO.f5652l);
                    streamWriter.mo1314a(this.f5515al);
                    int i4 = -1;
                    if (steam == steam2 && steam2.GameVersion <= 26) {
                        i4 = 1000;
                    }
                    steam2.f5797Q = true;
                    SendPacket(steam2, streamWriter.mo1374a(115, i4));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: R */
    public synchronized boolean m1586R() {
        if (m1585S()) {
            this.f5483p = true;
            this.f5603aO.f5657d = 0;
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public synchronized boolean m1585S() {
        if (this.lock1) {
            m1491b("Started singleplayer");
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1421r();
        this.lock1 = true;
        this.IsServer = true;
        this.f5571F = true;
        this.f5603aO.f5654a = m1072A.m1003am();
        this.f5603aO.f5655b = m1072A.m1004al();
        m1529aa();
        this.f5489z = m1072A.f6099bs;
        ActivityC0122n.m5091o();
        this.socketPort = m1072A.f6115bQ.networkPort;
        LogError("singleplayer server started");
        return true;
    }

    /* renamed from: aA */
    private void m1534aA() {
        this.f5603aO.f5653q = C0758f.m2151a(1, 1000000000);
    }

    /* renamed from: b */
    public synchronized boolean m1488b(boolean z) {
        if (this.lock1) {
            throw new RuntimeException("networking already started");
        }
        m1422q();
        this.lock1 = true;
        this.IsServer = true;
        m1529aa();
        m1534aA();
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1477c(z);
        ActivityC0122n.m5091o();
        this.socketPort = m1072A.f6115bQ.networkPort;
        C1058a.m734a().mo280i();
        this.f5527aU = new RunnableC0854an(this);
        try {
            this.f5527aU.m1395a(false);
            this.f5526aT = new Thread(this.f5527aU);
            this.f5526aT.setDaemon(true);
            this.f5526aT.start();
            if (1 != 0) {
                this.f5529aW = new RunnableC0854an(this);
                try {
                    this.f5529aW.m1395a(true);
                    this.f5528aV = new Thread(this.f5529aW);
                    this.f5528aV.start();
                } catch (IOException e) {
                    e.printStackTrace();
                    m1072A.m1030a("Could not open udp port:" + this.socketPort + ", check this port is not in use or change the port in the game settings", 1);
                    m1491b("Could not open udp port");
                    return false;
                }
            }
            m1517am();
            if (this.f5484q) {
                C0879n.m1250b();
            }
            this.f5538bl = null;
            if (f5560r) {
                C0879n.m1266a();
            }
            LogError("server started");
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            m1072A.m1030a("Could not open tcp port:" + this.socketPort + ", check this port is not in use or change the port in the game settings", 1);
            m1491b("Could not open tcp port");
            return false;
        }
    }

    /* renamed from: c */
    public void m1477c(boolean z) {
        int i;
        this.IsServer = true;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f5489z == null) {
            C0187e c0187e = null;
            if (!z) {
                i = AbstractC0197n.m4660E();
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
                m1072A.f6099bs = c0187e;
            }
            this.f5489z = c0187e;
        }
        if (this.f5531aY == null) {
            LoggerMaybe.LogDebug2("pingerTask starting");
            this.f5531aY = new C0862au(this);
            this.f5530aX = new Timer();
            this.f5530aX.schedule(this.f5531aY, 100L, 100L);
        } else {
            LoggerMaybe.LogDebug2("pingerTask already active");
        }
        ActivityC0122n.m5091o();
    }

    /* renamed from: T */
    public boolean m1584T() {
        return LoggerMaybe.m1072A().f6115bQ.udpInMultiplayer;
    }

    /* renamed from: a */
    public RunnableC0853am m1542a(String str, boolean z, Runnable runnable) {
        RunnableC0853am runnableC0853am = new RunnableC0853am(str, z, runnable);
        runnableC0853am.m1398b();
        return runnableC0853am;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.net.Socket] */
    /* renamed from: b */
    public static Socket m1489b(String str, boolean z) {
        C0017h c0017h;
        String str2;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        LoggerMaybe.LogDebug2("Connect to server: " + str + " (force tcp:" + z + ")");
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
                    m1072A.f6122bX.f5481n = null;
                    final Object obj = new Object();
                    C0841ae c0841ae = new C0841ae() { // from class: com.corrodinggames.rts.gameFramework.i.ad.1
                        @Override // com.corrodinggames.rts.gameFramework.p041i.C0841ae
                        /* renamed from: a */
                        public void mo3096a(String str5) {
                            LoggerMaybe m1072A2 = LoggerMaybe.m1072A();
                            LoggerMaybe.LogDebug2("Entered password");
                            if (m1072A2.f6122bX.IsServer) {
                                LoggerMaybe.m1031a("Cannot enter a password when we are a server");
                            } else {
                                m1072A2.f6122bX.f5481n = str5;
                            }
                            synchronized (obj) {
                                obj.notify();
                            }
                        }

                        @Override // com.corrodinggames.rts.gameFramework.p041i.C0841ae
                        /* renamed from: a */
                        public void mo3097a() {
                            synchronized (obj) {
                                obj.notify();
                            }
                        }
                    };
                    LoggerMaybe.LogDebug2("Asking for password..");
                    synchronized (obj) {
                        m1563a(c0841ae);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (m1072A.f6122bX.f5481n == null) {
                        LoggerMaybe.m983b("No password entered");
                        throw new C0844ag();
                    }
                    LoggerMaybe.LogDebug2("Password has been entered");
                }
                String str5 = null;
                if (parseBoolean) {
                    str5 = m1072A.f6122bX.f5481n;
                    if (str5 == null) {
                        throw new IOException("This server requires a password but no password was provided");
                    }
                }
                final Object obj2 = new Object();
                C0890w c0890w = new C0890w() { // from class: com.corrodinggames.rts.gameFramework.i.ad.2
                    @Override // com.corrodinggames.rts.gameFramework.p041i.C0890w
                    /* renamed from: a */
                    public void mo1239a(String str6) {
                        super.mo1239a(str6);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }

                    @Override // com.corrodinggames.rts.gameFramework.p041i.C0890w
                    /* renamed from: a */
                    public void mo1238a(String str6, EnumC0891x enumC0891x, Exception exc) {
                        super.mo1238a(str6, enumC0891x, exc);
                        synchronized (obj2) {
                            obj2.notify();
                        }
                    }
                };
                synchronized (obj2) {
                    C0879n.m1263a(c0890w, str4, parseInt, str5);
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
                return m1489b(c0890w.f5903a, z);
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
            LoggerMaybe.LogDebug2("Converting connect string to: " + str6);
            trim = str6;
        }
        m1072A.f6122bX.f5497L = null;
        if (trim.contains("/") || trim.contains("\\")) {
            int indexOf = trim.indexOf("/");
            int indexOf2 = trim.indexOf("\\");
            if (indexOf == -1) {
                indexOf = trim.length();
            }
            if (indexOf2 == -1) {
                indexOf2 = trim.length();
            }
            int m2080c = C0758f.m2080c(indexOf, indexOf2);
            String trim2 = trim.substring(m2080c + 1).trim();
            if (!trim2.equals(VariableScope.nullOrMissingString)) {
                m1072A.f6122bX.f5497L = trim2;
            }
            trim = trim.substring(0, m2080c);
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
        if (!z && m1072A.f6122bX.m1584T()) {
            z2 = true;
        }
        int i3 = 7000;
        LoggerMaybe.LogDebug2(VariableScope.nullOrMissingString);
        LoggerMaybe.LogDebug2("===============================");
        LoggerMaybe.LogDebug2("Connect to: " + trim);
        if (!z2) {
            c0017h = new Socket();
            LoggerMaybe.LogDebug2("connecting to Server.. (tcp)");
        } else {
            c0017h = new C0017h();
            LoggerMaybe.LogDebug2("connecting to Server.. (udp)");
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
                LoggerMaybe.LogDebug2("UnknownHostException.." + str10);
                e5.printStackTrace();
                throw new IOException(str10, e5);
            } catch (IOException e6) {
                String str11 = "Failed to connect to host";
                if (z2) {
                    str11 = str11 + " (udp)";
                }
                String str12 = str11 + " - " + e6.getMessage();
                LoggerMaybe.LogDebug2("IOException.." + str12);
                e6.printStackTrace();
                throw new IOException(str12, e6);
            }
        } catch (IllegalArgumentException e7) {
            LoggerMaybe.m983b("IllegalArgumentException..Incorrect server format");
            e7.printStackTrace();
            throw new IOException("Incorrect server format", e7);
        }
    }

    /* renamed from: U */
    public void m1583U() {
        final LoggerMaybe m1072A = LoggerMaybe.m1072A();
        final C0767e m1961a = C0767e.m1961a(C0820a.m1687a("menus.ingame.multiplayerReconnect.message", new Object[0]), false);
        m1961a.m1962a(C0820a.m1687a("menus.ingame.resume", new Object[0]), new AbstractC0772i() { // from class: com.corrodinggames.rts.gameFramework.i.ad.3
            @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i
            /* renamed from: a */
            public boolean mo1412a(C0765c c0765c) {
                m1961a.m1927i();
                return true;
            }
        });
        m1961a.m1962a(C0820a.m1687a("menus.ingame.reconnect", new Object[0]), new AbstractC0772i() { // from class: com.corrodinggames.rts.gameFramework.i.ad.4
            @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i
            /* renamed from: a */
            public boolean mo1412a(C0765c c0765c) {
                m1961a.m1927i();
                C0831ad.this.m1582V();
                return true;
            }
        });
        m1961a.m1962a(C0820a.m1687a("menus.ingame.disconnect", new Object[0]), new AbstractC0772i() { // from class: com.corrodinggames.rts.gameFramework.i.ad.5
            @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i
            /* renamed from: a */
            public boolean mo1412a(C0765c c0765c) {
                m1961a.m1927i();
                m1072A.m1032a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.i.ad.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C0831ad.this.m1491b("already disconnected");
                        m1072A.f6117bS.f5112d.m1976m();
                    }
                });
                return true;
            }
        });
        m1072A.f6117bS.m1829a(m1961a);
        this.f5553bL = true;
    }

    /* renamed from: V */
    public synchronized boolean m1582V() {
        Socket socket = this.globalSocket;
        if (socket == null) {
            LoggerMaybe.LogDebug2("reconnectToServer: lastConnectedTo==null");
            return false;
        }
        LoggerMaybe.LogDebug2("reconnectToServer attempted");
        if (this.lock1) {
            LoggerMaybe.LogDebug2("reconnectToServer: disconnecting");
            m1491b("reconnecting");
        }
        if (socket.getInetAddress() == null) {
            LoggerMaybe.LogDebug2("reconnectToServer: lastConnectedTo.getInetAddress()==null");
            return false;
        }
        String str = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
        LoggerMaybe.LogDebug2("reconnectToServer: connecting to: " + str);
        try {
            return m1541a(m1489b(str, false));
        } catch (C0844ag e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public synchronized boolean m1541a(Socket socket) {
        if (this.lock1) {
            m1491b("starting new");
        }
        if (socket == null) {
            throw new RuntimeException("connectedSocket==null");
        }
        m1422q();
        LoggerMaybe.m1072A();
        this.socketPort = socket.getPort();
        this.lock1 = true;
        this.IsServer = false;
        LogError("connected to Server..");
        Steam steam = new Steam(this, socket);
        steam.f5777p = true;
        steam.m1332d();
        this.f5606bc.add(steam);
        m1456f(steam);
        m1517am();
        this.globalSocket = socket;
        return true;
    }

    /* renamed from: c */
    public Steam m1484c(AbstractC0197n abstractC0197n) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5787z == abstractC0197n) {
                return steam;
            }
        }
        return null;
    }

    /* renamed from: d */
    public Steam m1473d(AbstractC0197n abstractC0197n) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (!steam.f5803a && steam.f5787z == abstractC0197n) {
                return steam;
            }
        }
        return null;
    }

    /* renamed from: W */
    public Steam m1581W() {
        if (this.IsServer) {
            return null;
        }
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (!steam.f5803a) {
                return steam;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m1472d(Packet packet) {
        if (!this.lock1) {
            LoggerMaybe.LogDebug2("Skipping sendPacketToAll, not networked");
        } else {
            m1439i(packet);
        }
    }

    /* renamed from: i */
    private void m1439i(Packet packet) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5777p && !steam.f5803a && !steam.f5780s) {
                steam.m1343a(packet);
            }
        }
    }

    /* renamed from: e */
    public void m1464e(Packet packet) {
        if (!this.lock1) {
            LoggerMaybe.LogDebug2("Skipping sendPacketToAllIncludingRelay, not networked");
            return;
        }
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5777p && !steam.f5803a) {
                steam.m1343a(packet);
            }
        }
    }

    /* renamed from: f */
    public void sendPacketToServer(Packet packet) {
        if (!this.lock1) {
            LoggerMaybe.LogDebug2("Skipping sendPacketToServer, not networked");
        } else if (this.IsServer) {
            throw new RuntimeException("We are a server");
        } else {
            m1472d(packet);
        }
    }

    /* renamed from: g */
    public void m1451g(Packet packet) {
        if (!this.lock1) {
            LoggerMaybe.LogDebug2("Skipping sendPacketToClients, not networked");
        } else if (!this.IsServer) {
            throw new RuntimeException("We are not a server");
        } else {
            m1464e(packet);
        }
    }

    /* renamed from: h */
    public void m1445h(Packet packet) {
        if (!this.lock1) {
            LoggerMaybe.LogDebug2("Skipping sendPacketToClients, not networked");
        } else if (!this.IsServer) {
            throw new RuntimeException("We are not a server");
        } else {
            m1472d(packet);
        }
    }

    /* renamed from: a */
    public void SendPacket(Steam steam, Packet packet) {
        if (!this.lock1) {
            LoggerMaybe.LogDebug2("Skipping sendPacketOnConnection, not networked");
        } else {
            steam.m1343a(packet);
        }
    }

    /* renamed from: X */
    public void m1580X() {
        if (this.IsServer) {
            LogError("registerConnection: We are a server");
        }
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            m1444h((Steam) it.next());
        }
    }

    /* renamed from: Y */
    public void m1579Y() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6115bQ.networkClientId = null;
        if (this.ServerUUID == null) {
            LoggerMaybe.LogDebug2("generateNewClientId: serverUUID==null");
            this.ServerUUID = "x";
        }
        m1578Z();
        m1072A.f6115bQ.save();
    }

    /* renamed from: Z */
    public String m1578Z() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        boolean z = false;
        if (m1072A.f6115bQ.networkClientId == null) {
            z = true;
        }
        if (!this.f5621bM) {
            this.f5621bM = true;
            if (LoggerMaybe.m995au()) {
                String m1519ak = m1519ak();
                if (!m1519ak.equals(m1072A.f6115bQ.networkClientIdMachineKey)) {
                    if (m1072A.f6115bQ.networkClientIdMachineKey != null) {
                        LoggerMaybe.LogDebug2("Machine appears to have changed: " + m1072A.f6115bQ.networkClientIdMachineKey + " vs " + m1519ak);
                    }
                    m1072A.f6115bQ.networkClientIdMachineKey = m1519ak;
                    z = true;
                }
            }
        }
        if (z) {
            LoggerMaybe.LogDebug2("new networkClientId needed");
            m1072A.f6115bQ.networkClientId = UUID.randomUUID().toString();
            m1072A.f6115bQ.save();
        }
        String str = m1072A.f6115bQ.networkClientId;
        if (this.ServerUUID == null) {
            throw new RuntimeException("getOwnClientIdHashed: serverUUID==null");
        }
        return C0758f.m2061e(str + this.ServerUUID);
    }

    /* renamed from: aa */
    public void m1529aa() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6115bQ.networkServerId = UUID.randomUUID().toString();
        m1072A.f6115bQ.save();
    }

    /* renamed from: ab */
    public String m1528ab() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6115bQ.networkServerId == null) {
            m1529aa();
        }
        return m1072A.f6115bQ.networkServerId;
    }

    /* renamed from: ac */
    public String m1527ac() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.IsServer) {
            return m1072A.f6115bQ.networkServerId;
        }
        return this.ServerUUID;
    }

    /* renamed from: f */
    public void m1456f(Steam steam) {
        StreamWriter streamWriter = new StreamWriter();
        try {
            int i = 1;
            if (LoggerMaybe.m995au()) {
                i = 2;
            }
            if (LoggerMaybe.f6210aZ) {
                i = 3;
            }
            streamWriter.WriteUTF("com.corrodinggames.rts");
            streamWriter.WriteInteger(4);
            streamWriter.WriteInteger(this.GameVersion);
            streamWriter.WriteInteger(i);
            streamWriter.mo1357b(this.f5497L);
            streamWriter.WriteUTF(this.f5487y);
            streamWriter.WriteUTF(C0820a.m1684c());
            String str = VariableScope.nullOrMissingString;
            if (LoggerMaybe.f6204aT) {
                str = str + "d";
            }
            streamWriter.WriteUTF(str);
            SendPacket(steam, streamWriter.mo1360b(160));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void SendRegisterConnection(Steam steam) {
        StreamWriter streamWriter = new StreamWriter();
        try {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            streamWriter.WriteUTF("com.corrodinggames.rts"); // Server id
            streamWriter.WriteInteger(2); // Protocol version
            streamWriter.WriteInteger(this.GameVersion); // Game version
            streamWriter.WriteInteger(m1072A.mo973c(true)); // Another game version
            streamWriter.WriteUTF(m1072A.mo951k()); // Pkg name
            streamWriter.WriteUTF(m1528ab());
            streamWriter.WriteInteger(steam.f5793M);
            streamWriter.WriteInteger(this.ServerKey);
            streamWriter.WriteInteger(0);
            SendPacket(steam, streamWriter.mo1360b(161));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public void m1444h(Steam steam) {
        LoggerMaybe.LogDebug2("sendRegisterConnection...");
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.WriteUTF("com.corrodinggames.rts");
            streamWriter.WriteInteger(5);
            streamWriter.WriteInteger(this.GameVersion);
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            streamWriter.WriteInteger(m1072A.mo973c(true));
            streamWriter.WriteUTF(this.f5487y);
            String str = null;
            if (this.f5481n != null) {
                str = C0758f.m2061e(this.f5481n);
            }
            streamWriter.mo1357b(str);
            streamWriter.WriteUTF(m1072A.mo951k());
            streamWriter.WriteUTF(m1578Z());
            streamWriter.WriteInteger(m1072A.mo934y());
            streamWriter.WriteUTF(m1453g(this.RemoteServerKey));
            streamWriter.WriteUTF(m1447h(this.f5577U));
            SendPacket(steam, streamWriter.mo1360b(110));
            this.f5622bN = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public String m1453g(int i) {
        String str = (((((((((((VariableScope.nullOrMissingString + "c:" + i) + "m:" + ((i * 87) + 24)) + "0:" + (m1466e(0) * 11 * i)) + "1:" + ((m1466e(1) * 12) + i)) + "2:" + (m1466e(2) * 13 * i)) + "3:" + ((m1466e(3) * 14) + i)) + "4:" + (m1466e(4) * 15 * i)) + "5:" + ((m1466e(5) * 16) + i)) + "6:" + (m1466e(6) * 17 * i)) + "7:" + (m1466e(7) * 18 * i)) + "8:" + (m1466e(8) * 19 * i)) + "t1:" + (AbstractC0197n.f1373j.f1310o * 11.0d * i);
        int i2 = 5 * i;
        if (m1434k() != m1466e(this.f5603aO.f5656c)) {
            i2 = 7 * i;
        }
        return str + "d:" + i2;
    }

    /* renamed from: h */
    public String m1447h(int i) {
        return C0758f.m2043h(i);
    }

    /* renamed from: ad */
    public void m1526ad() {
        if (this.IsServer) {
            throw new RuntimeException("We are a server");
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        StreamWriter streamWriter = new StreamWriter();
        try {
            streamWriter.mo1314a(this.f5488bT);
            streamWriter.mo1314a(m1072A.f6235bq);
            sendPacketToServer(streamWriter.mo1360b(112));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public void m1435j(String str) {
        if (!this.IsServer) {
            LogError("cannot send sendSystemMessage:" + str + ", we are not a server");
        } else if (!this.lock1 || this.f5571F) {
            LogError("cannot send sendSystemMessage:" + str + ", not networked");
        } else {
            LoggerMaybe.LogDebug2("sendSystemMessage:" + str);
            m1555a((Steam) null, (AbstractC0197n) null, (String) null, str);
        }
    }

    /* renamed from: k */
    public void m1433k(String str) {
        m1429m("-qc " + str);
    }

    /* renamed from: l */
    public void m1431l(String str) {
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
        m1429m(str);
    }

    /* renamed from: m */
    public void m1429m(String str) {
        if (!this.lock1) {
            LoggerMaybe.LogDebug2("sendChatMessage: not networked:" + str);
            m1494b((Steam) null, -1, (String) null, str);
        } else if (this.IsServer) {
            m1555a((Steam) null, this.f5489z, this.f5487y, str);
            m1493b((Steam) null, this.f5489z, this.f5487y, str);
        } else {
            try {
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.WriteUTF(str);
                streamWriter.mo1355c(0);
                sendPacketToServer(streamWriter.mo1360b(140));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public void m1555a(Steam steam, AbstractC0197n abstractC0197n, String str, String str2) {
        m1554a(steam, abstractC0197n, str, str2, null);
    }

    /* renamed from: a */
    public void m1554a(Steam steam, AbstractC0197n abstractC0197n, String str, String str2, Steam steam2) {
        C0187e c0187e;
        try {
            boolean z = false;
            boolean z2 = false;
            String m1427n = m1427n(str2);
            if ("t".equalsIgnoreCase(m1427n)) {
                if (abstractC0197n != null) {
                    z = true;
                    str2 = "[TEAM] " + str2.substring("-t".length());
                } else {
                    LoggerMaybe.m983b("toOnlyTeams failed team==null");
                }
            }
            if (abstractC0197n != null && "surrender".equalsIgnoreCase(m1427n)) {
                z = true;
                str2 = "[TEAM] " + str2;
            }
            if (abstractC0197n != null && "i".equalsIgnoreCase(m1427n)) {
                z2 = true;
                str2 = "[INFO] " + str2.substring("-i".length());
            }
            if (abstractC0197n != null && "qc".equalsIgnoreCase(m1427n)) {
                z2 = true;
                str2 = "[COMMAND] " + str2.substring("-qc".length());
            }
            if (!z2 && abstractC0197n != null && abstractC0197n != this.f5547bz && abstractC0197n != this.f5548bA && !this.f5562d.m1607a(steam, abstractC0197n, str2, z)) {
                z2 = true;
            }
            StreamWriter streamWriter = new StreamWriter();
            streamWriter.WriteUTF(str2);
            streamWriter.mo1355c(3);
            streamWriter.mo1357b(str);
            streamWriter.mo1368a(steam);
            int i = -1;
            if (abstractC0197n != null) {
                i = abstractC0197n.f1306k;
            }
            streamWriter.WriteInteger(i);
            Packet mo1360b = streamWriter.mo1360b(141);
            if (z) {
                Iterator it = this.f5606bc.iterator();
                while (it.hasNext()) {
                    Steam steam3 = (Steam) it.next();
                    if (steam3.f5777p && !steam3.f5803a && (c0187e = steam3.f5787z) != null && c0187e.m4587d(abstractC0197n)) {
                        steam3.m1343a(mo1360b);
                    }
                }
                AbstractC0197n abstractC0197n2 = this.f5489z;
                if (abstractC0197n2 != null && abstractC0197n2.m4587d(abstractC0197n)) {
                    m1494b(steam, i, str, str2);
                }
            } else if (z2) {
                LoggerMaybe.m983b("info message:" + m1478c(str, str2));
            } else {
                if (steam2 != null) {
                    SendPacket(steam2, mo1360b);
                } else {
                    m1451g(mo1360b);
                }
                m1494b(steam, i, str, str2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public static String m1427n(String str) {
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
    public static String m1478c(String str, String str2) {
        if (str != null) {
            return str + ": " + str2;
        }
        return str2;
    }

    /* renamed from: b */
    private void m1494b(Steam steam, int i, String str, String str2) {
        if (!this.lock1 && str2.startsWith("-i ")) {
            return;
        }
        if (!this.lock1 && str2.startsWith("-qc ")) {
            return;
        }
        String m1683c = C0820a.m1683c(str2);
        if (str != null) {
            m1469d("New Message", str + ": " + m1683c);
        }
        Steam steam2 = null;
        if (this.IsServer) {
            steam2 = steam;
        }
        this.f5605aS.m1617a(i, str, m1683c, steam2);
        this.f5562d.mo413a(i, str, m1683c, steam);
        boolean z = false;
        if (this.f5539bm) {
            z = true;
        }
        if (!this.lock1) {
            z = true;
        }
        if (z) {
            m1544a(str, m1683c);
            return;
        }
        String m1478c = m1478c(str, m1683c);
        if (!LoggerMaybe.f6205aU) {
            ActivityC0122n.m5095d(m1478c);
        }
    }

    /* renamed from: a */
    public void m1549a(Steam steam, byte[] bArr, boolean z, boolean z2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        try {
            StreamWriter streamWriter = new StreamWriter();
            streamWriter.mo1355c(0);
            streamWriter.WriteInteger(m1072A.f6239bx);
            streamWriter.WriteInteger(m1072A.f6102by);
            streamWriter.mo1320a(m1487c());
            streamWriter.mo1320a(1.0f);
            streamWriter.mo1314a(z);
            streamWriter.mo1314a(z2);
            streamWriter.mo1350e("gameSave");
            streamWriter.m1380b(bArr);
            streamWriter.mo1317a("gameSave");
            SendPacket(steam, streamWriter.mo1360b(35));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m1536a(boolean z, boolean z2, boolean z3) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        try {
            StreamWriter streamWriter = new StreamWriter();
            streamWriter.mo1355c(0);
            streamWriter.WriteInteger(m1072A.f6239bx);
            streamWriter.WriteInteger(m1072A.f6102by);
            streamWriter.mo1320a(m1487c());
            streamWriter.mo1320a(1.0f);
            streamWriter.mo1314a(z);
            streamWriter.mo1314a(z2);
            streamWriter.mo1350e("gameSave");
            m1072A.f6125ca.m428a(streamWriter);
            streamWriter.mo1317a("gameSave");
            if (z) {
            }
            Packet mo1360b = streamWriter.mo1360b(35);
            m1472d(mo1360b);
            if (z3) {
                if (!this.IsServer) {
                    throw new RuntimeException("sendResyncSave: reloadCreatedSave: We are not a server");
                }
                mo1360b.steam = this.f5626bb;
                m1559a(mo1360b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ae */
    public boolean m1525ae() {
        m1587Q();
        m1592L();
        return m1550a((Steam) null, false);
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
    public boolean m1550a(com.corrodinggames.rts.gameFramework.p041i.Steam r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p041i.C0831ad.m1550a(com.corrodinggames.rts.gameFramework.i.c, boolean):boolean");
    }

    /* renamed from: af */
    public void m1524af() {
        this.f5542bs = true;
        LoggerMaybe.LogDebug2("onStartGameFailed");
        if (this.IsServer) {
            this.f5539bm = false;
            m1435j("Map load failed.");
            return;
        }
        m1491b("Map load failed");
    }

    /* renamed from: aB */
    private void m1533aB() {
        this.f5611bo = false;
        this.f5539bm = true;
        this.f5542bs = false;
        this.f5543bt = false;
        LoggerMaybe.LogDebug2("Starting new network game (" + m1527ac() + ")");
        if (this.f5484q && this.IsServer) {
            C0879n.m1247c();
        }
        if (!LoggerMaybe.f6205aU) {
            ActivityC0122n.m5090p();
        }
        this.f5562d.mo405b();
    }

    /* renamed from: ag */
    public void m1523ag() {
        m1486c(5.0f);
    }

    /* renamed from: c */
    public void m1486c(float f) {
        if (!this.IsServer) {
            throw new RuntimeException("We are not a server");
        }
        if (this.f5612bp) {
            return;
        }
        LoggerMaybe.LogDebug2("Setting up return to battleroom timer...");
        this.f5540bq = f;
        this.f5612bp = true;
        m1435j("Game ended by host. Returning to battleroom in " + ((int) f) + " seconds...");
    }

    /* renamed from: i */
    public void m1438i(Steam steam) {
        if (!this.IsServer) {
            throw new RuntimeException("We are not a server");
        }
        try {
            StreamWriter streamWriter = new StreamWriter();
            streamWriter.mo1355c(0);
            Packet mo1360b = streamWriter.mo1360b(122);
            if (steam == null) {
                m1445h(mo1360b);
            } else {
                SendPacket(steam, mo1360b);
            }
            m1532aC();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: aC */
    private void m1532aC() {
        this.f5611bo = true;
    }

    /* renamed from: aD */
    private void m1531aD() {
        LoggerMaybe.LogDebug2("----- returnToBattleroom -----");
        this.f5611bo = false;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6126cb.m2417d();
        AbstractC0197n abstractC0197n = this.f5489z;
        m1420s();
        this.f5489z = abstractC0197n;
        m1072A.f6239bx = 0;
        m1072A.f6102by = 0;
        AbstractC0197n.m4559n();
        if (this.IsServer) {
            m1534aA();
        }
        m1594J();
        if (this.f5484q && this.IsServer) {
            C0879n.m1247c();
        }
        if (!LoggerMaybe.f6205aU) {
        }
    }

    /* renamed from: ah */
    public String m1522ah() {
        ArrayList m1520aj = m1520aj();
        if (m1520aj == null || m1520aj.size() == 0) {
            return null;
        }
        return (String) m1520aj.get(0);
    }

    /* renamed from: ai */
    public String m1521ai() {
        ArrayList m1520aj = m1520aj();
        if (m1520aj == null || m1520aj.size() == 0) {
            return null;
        }
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = m1520aj.iterator();
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
    public ArrayList m1520aj() {
        ArrayList m1468d;
        if (f5554bO != null) {
            return new ArrayList(f5554bO);
        }
        long m2388a = C0727bl.m2388a();
        ArrayList m1468d2 = m1468d(true);
        if (m1468d2 != null && m1468d2.size() > 0) {
            m1468d = m1468d2;
        } else {
            m1468d = m1468d(false);
        }
        double m2386a = C0727bl.m2386a(m2388a);
        if (m2386a > 2.0d) {
            LoggerMaybe.m983b("getLocalIpAddressList was slow, taking:" + C0727bl.m2387a(m2386a));
        }
        if (m2386a > 10.0d && m1468d != null && m1468d.size() > 0) {
            LoggerMaybe.LogDebug2("getLocalIpAddressList: creating cache");
            f5554bO = new ArrayList(m1468d);
        }
        return m1468d;
    }

    /* renamed from: ak */
    public String m1519ak() {
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
            return C0758f.m2079c(str);
        }
        return "[blank]";
    }

    /* renamed from: d */
    public ArrayList m1468d(boolean z) {
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
            Log.m5262d("RustedWarfare", e.toString());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: al */
    public InetAddress m1518al() {
        try {
            DhcpInfo dhcpInfo = ((WifiManager) LoggerMaybe.m1072A().f6227am.mo5501c("wifi")).getDhcpInfo();
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
    public void m1469d(String str, String str2) {
        if (LoggerMaybe.f6205aU) {
            return;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f5571F || m1072A.f6126cb.m2411h()) {
            return;
        }
        if (ActivityC0122n.m5094l()) {
            m1441i(2);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) m1072A.f6227am.mo5501c("notification");
        PendingIntent activity = PendingIntent.getActivity(m1072A.f6227am, 0, new Intent(m1072A.f6227am, ActivityC0088a.class), 2);
        if (Build.VERSION.SDK_INT >= 11) {
            Notification.Builder builder = new Notification.Builder(m1072A.f6227am);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText(str + ": " + str2);
            builder.setSmallIcon(C0067R.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(false);
            builder.setAutoCancel(true);
            m1569a(notificationManager);
            m1570a(builder, "multiplayerChatId");
            notificationManager.notify(2, builder.getNotification());
        }
    }

    /* renamed from: am */
    public void m1517am() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.lock1 && m1072A != null && m1072A.m1061L()) {
            m1530aE();
        } else {
            m1441i(1);
        }
    }

    /* renamed from: a */
    private void m1570a(Notification.Builder builder, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                builder.getClass().getDeclaredMethod("setChannelId", String.class).invoke(builder, str);
            } catch (Exception e) {
                LoggerMaybe.m1026a("setChannelId failed", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private void m1569a(NotificationManager notificationManager) {
        m1568a(notificationManager, "multiplayerChatId", "Multiplayer Chat");
        m1568a(notificationManager, "multiplayerStatusId", "Multiplayer Status");
    }

    /* renamed from: a */
    private void m1568a(NotificationManager notificationManager, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls = Class.forName("android.app.NotificationChannel");
                notificationManager.getClass().getDeclaredMethod("createNotificationChannel", cls).invoke(notificationManager, cls.getDeclaredConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance(str, str2, 3));
            } catch (Exception e) {
                LoggerMaybe.m1026a("Creating notification channel failed", (Throwable) e);
            }
        }
    }

    /* renamed from: aE */
    private void m1530aE() {
        if (LoggerMaybe.f6205aU) {
            return;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        PendingIntent activity = PendingIntent.getActivity(m1072A.f6227am, 0, new Intent(m1072A.f6227am, ActivityC0088a.class), 2);
        NotificationManager notificationManager = (NotificationManager) m1072A.f6227am.mo5501c("notification");
        if (Build.VERSION.SDK_INT >= 11) {
            if (Build.VERSION.SDK_INT >= 26) {
            }
            Notification.Builder builder = new Notification.Builder(m1072A.f6227am);
            builder.setContentTitle("Rusted Warfare Multiplayer");
            builder.setContentText("A multiplayer game is in progress");
            builder.setSmallIcon(C0067R.drawable.icon);
            builder.setContentIntent(activity);
            builder.setOngoing(true);
            m1569a(notificationManager);
            m1570a(builder, "multiplayerStatusId");
            if (Build.VERSION.SDK_INT >= 16) {
                builder.build();
            }
            notificationManager.notify(1, builder.getNotification());
        }
    }

    /* renamed from: i */
    private void m1441i(int i) {
        if (LoggerMaybe.f6205aU) {
            return;
        }
        ((NotificationManager) LoggerMaybe.m1072A().f6227am.mo5501c("notification")).cancel(i);
    }

    /* renamed from: an */
    public int m1516an() {
        int i = 0;
        for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
            AbstractC0197n m4562k = AbstractC0197n.m4562k(i2);
            if (m4562k != null && !m4562k.f1317v) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: ao */
    public int m1515ao() {
        int i = 0;
        for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
            if (AbstractC0197n.m4562k(i2) != null) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public void m1465e(AbstractC0197n abstractC0197n) {
        if (this.IsServer) {
            m1458f(abstractC0197n);
        } else if (this.f5495H) {
            m1433k("-kick " + (abstractC0197n.f1306k + 1));
        } else {
            LoggerMaybe.m983b("kickTeamAndAttachedPlayer: but not server or proxy controller");
        }
    }

    /* renamed from: f */
    public void m1458f(AbstractC0197n abstractC0197n) {
        if (abstractC0197n instanceof C0136a) {
            abstractC0197n.m4658G();
        } else if (this.f5489z == abstractC0197n) {
            LoggerMaybe.m982b("kickTeamAndAttachedPlayer", "Cannot kick self");
            return;
        } else {
            Steam m1484c = m1484c(abstractC0197n);
            if (m1484c == null) {
                m1449g("Kick player: cannot find connection for team");
            } else {
                int i = LoggerMaybe.m1072A().f6115bQ.banTimeInSecondsAfterKick;
                if (i > 0) {
                    m1551a(m1484c, "Temporarily banned due to recent kick", i);
                }
                m1552a(m1484c, "Kicked by host");
                m1484c.m1340a("Kicked by host");
            }
            abstractC0197n.m4658G();
        }
        m1588P();
        ActivityC0122n.m5091o();
    }

    /* renamed from: ap */
    public void m1514ap() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!this.IsServer) {
            LoggerMaybe.m982b("addAIToGame", "We are not a server");
            return;
        }
        int m4660E = AbstractC0197n.m4660E();
        if (m4660E == -1) {
            m1072A.m1030a("No free slots for AI", 1);
        }
        C0136a c0136a = new C0136a(m4660E);
        c0136a.f1316u = "AI";
        c0136a.f1312q = m4660E % 2;
        c0136a.f1318w = this.f5603aO.f5659f;
        m1513aq();
        m1072A.f6122bX.f5562d.m1609a(c0136a);
        m1072A.f6122bX.m1463e((Steam) null);
        ActivityC0122n.m5091o();
    }

    /* renamed from: aq */
    public boolean m1513aq() {
        if (!this.IsServer && this.lock1) {
            LoggerMaybe.m982b("updateNamesOfAI", "We are not a server");
            return false;
        }
        boolean z = false;
        for (int i = 0; i < AbstractC0197n.f1365c; i++) {
            AbstractC0197n m4562k = AbstractC0197n.m4562k(i);
            if (m4562k != null && m1500b(m4562k)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m1566a(AbstractC0197n abstractC0197n, int i) {
        synchronized (this.f5623bP) {
            m1483c(abstractC0197n, i);
        }
    }

    /* renamed from: c */
    private void m1483c(AbstractC0197n abstractC0197n, int i) {
        if (abstractC0197n.f1306k != i) {
            int i2 = abstractC0197n.f1306k;
            int i3 = abstractC0197n.f1312q;
            boolean z = false;
            if (i == -3) {
                z = true;
                i = AbstractC0197n.m4659F();
                if (i == -1) {
                    m1462e("No free spectator slots");
                    return;
                }
            }
            AbstractC0197n m4562k = AbstractC0197n.m4562k(i);
            abstractC0197n.m4574f(i);
            abstractC0197n.f1312q = i3;
            if (z) {
                abstractC0197n.f1312q = -3;
            }
            if (m4562k != null) {
                int i4 = m4562k.f1312q;
                m4562k.m4574f(i2);
                if (i4 == -3) {
                    m4562k.f1312q = -3;
                } else {
                    m4562k.f1312q = i3;
                }
            }
            m1591M();
            m1588P();
        }
    }

    /* renamed from: a */
    public void m1561a(EnumC0852al enumC0852al) {
        synchronized (this.f5623bP) {
            m1497b(enumC0852al);
        }
    }

    /* renamed from: b */
    private synchronized void m1497b(EnumC0852al enumC0852al) {
        if (!LoggerMaybe.m1072A().f6122bX.IsServer) {
            LoggerMaybe.LogDebug2("Not server");
            return;
        }
        if (enumC0852al == EnumC0852al.f5680a) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < AbstractC0197n.f1365c; i++) {
                AbstractC0197n m4562k = AbstractC0197n.m4562k(i);
                if (m4562k != null) {
                    arrayList.add(m4562k);
                }
            }
            Collections.shuffle(arrayList);
            int size = arrayList.size() / 2;
            if (arrayList.size() % 2 != 0) {
                size += C0758f.m2151a(0, 1);
            }
            if (size >= arrayList.size()) {
                size = arrayList.size();
            }
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0197n) arrayList.get(i3)).m4574f(i2);
                i2 += 2;
                ((AbstractC0197n) arrayList.get(i3)).f1312q = 0;
            }
            int i4 = 1;
            for (int i5 = 0 + size; i5 < arrayList.size(); i5++) {
                ((AbstractC0197n) arrayList.get(i5)).m4574f(i4);
                i4 += 2;
                ((AbstractC0197n) arrayList.get(i5)).f1312q = 1;
            }
        } else if (enumC0852al == EnumC0852al.f5681b) {
            ArrayList arrayList2 = new ArrayList();
            for (int i6 = 0; i6 < AbstractC0197n.f1365c; i6++) {
                AbstractC0197n m4562k2 = AbstractC0197n.m4562k(i6);
                if (m4562k2 != null) {
                    arrayList2.add(m4562k2);
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
                abstractC0197n.m4574f(i7);
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
                abstractC0197n2.m4574f(i10);
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
                    abstractC0197n3.m4574f(i13);
                    abstractC0197n3.f1312q = 2;
                    i13 += 3;
                    arrayList2.set(i14, null);
                }
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                AbstractC0197n abstractC0197n4 = (AbstractC0197n) arrayList2.get(i15);
                if (abstractC0197n4 != null) {
                    for (int i16 = 0; i16 < AbstractC0197n.f1365c; i16++) {
                        if (AbstractC0197n.m4562k(i16) == null) {
                            abstractC0197n4.m4574f(i16);
                            abstractC0197n4.f1312q = 2;
                            arrayList2.set(i15, null);
                        }
                    }
                }
            }
        } else if (enumC0852al == EnumC0852al.f5682c) {
            ArrayList arrayList3 = new ArrayList();
            for (int i17 = 0; i17 < AbstractC0197n.f1365c; i17++) {
                AbstractC0197n m4562k3 = AbstractC0197n.m4562k(i17);
                if (m4562k3 != null) {
                    arrayList3.add(m4562k3);
                }
            }
            Collections.shuffle(arrayList3);
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ((AbstractC0197n) arrayList3.get(i19)).m4574f(i18);
                ((AbstractC0197n) arrayList3.get(i19)).f1312q = i18;
                i18++;
            }
        } else if (enumC0852al == EnumC0852al.f5683d) {
            ArrayList arrayList4 = new ArrayList();
            for (int i20 = 0; i20 < AbstractC0197n.f1365c; i20++) {
                AbstractC0197n m4562k4 = AbstractC0197n.m4562k(i20);
                if (m4562k4 != null) {
                    arrayList4.add(m4562k4);
                }
            }
            Collections.shuffle(arrayList4);
            int i21 = 0;
            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                int m4659F = AbstractC0197n.m4659F();
                if (m4659F != -1) {
                    ((AbstractC0197n) arrayList4.get(i22)).m4574f(m4659F);
                }
                ((AbstractC0197n) arrayList4.get(i22)).f1312q = -3;
                i21++;
            }
        } else {
            throw new RuntimeException("overrideTeamLayout: unhandled layout: " + enumC0852al);
        }
        m1591M();
    }

    /* renamed from: a */
    public void m1565a(AbstractC0197n abstractC0197n, int i, Integer num) {
        String str = VariableScope.nullOrMissingString;
        if (num != null) {
            str = " " + num;
        }
        if (!this.f5495H && this.f5489z == abstractC0197n) {
            m1433k("-self_move " + (i + 1) + str);
        } else {
            m1433k("-move " + (abstractC0197n.f1306k + 1) + " " + (i + 1) + str);
        }
    }

    /* renamed from: b */
    public void m1499b(AbstractC0197n abstractC0197n, int i) {
        if (i != -1) {
            i++;
        }
        if (!this.f5495H && this.f5489z == abstractC0197n) {
            m1433k("-self_team " + i);
        } else {
            m1433k("-team " + (abstractC0197n.f1306k + 1) + " " + i);
        }
    }

    /* renamed from: g */
    public void m1452g(AbstractC0197n abstractC0197n) {
        if (!abstractC0197n.f1331G) {
            abstractC0197n.f1331G = true;
            String str = abstractC0197n.f1316u;
            if (str == null) {
                str = "Player - " + (abstractC0197n.f1306k + 1) + VariableScope.nullOrMissingString;
            }
            m1435j(str + " is victorious!");
        }
    }

    /* renamed from: h */
    public void m1446h(AbstractC0197n abstractC0197n) {
        String str;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        boolean z = false;
        String str2 = abstractC0197n.f1316u;
        if (str2 == null) {
            str2 = "Player - " + (abstractC0197n.f1306k + 1) + VariableScope.nullOrMissingString;
        }
        String str3 = str2 + " was defeated";
        if (!this.f5541br) {
            str = str3 + " (Team: " + abstractC0197n.m4570h() + ")";
        } else {
            int m4573g = AbstractC0197n.m4573g();
            str = str3 + " (" + m4573g + " players remaining)";
            if (m4573g == 1) {
                z = true;
            }
        }
        if (!m1072A.m1060M() && m1072A.f6239bx < 60) {
            LoggerMaybe.LogDebug2("Not showing defeated message: " + str);
            str = null;
        }
        if (abstractC0197n.f1327D) {
            str = null;
        }
        if (str != null) {
            m1435j(str);
        }
        if (z) {
            AbstractC0197n.m4651N();
        }
    }

    /* renamed from: i */
    public void m1440i(AbstractC0197n abstractC0197n) {
        String str;
        String str2;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        String str3 = abstractC0197n.f1316u;
        if (str3 == null) {
            str3 = "Player - " + (abstractC0197n.f1306k + 1) + VariableScope.nullOrMissingString;
        }
        boolean z = false;
        if (m1072A.f6239bx < 10) {
            str = str3 + " had no starting units";
        } else {
            str = str3 + " has been wiped out";
        }
        if (!this.f5541br) {
            str2 = str + " (Team: " + abstractC0197n.m4570h() + ")";
        } else {
            int m4573g = AbstractC0197n.m4573g();
            str2 = str + " (" + m4573g + " players remaining)";
            if (m4573g == 1) {
                z = true;
            }
        }
        if (!m1072A.m1060M() && m1072A.f6239bx < 60) {
            LoggerMaybe.LogDebug2("Not showing defeated message: " + str2);
            str2 = null;
        }
        if (abstractC0197n.f1327D) {
            str2 = null;
        }
        if (abstractC0197n.m4619b()) {
            str2 = null;
        }
        if (str2 != null) {
            m1435j(str2);
        }
        if (z) {
            AbstractC0197n.m4651N();
        }
    }

    /* renamed from: ar */
    public synchronized void m1512ar() {
        if (this.f5555bQ != null) {
            this.f5555bQ.cancel();
            this.f5555bQ = null;
        }
    }

    /* renamed from: as */
    public synchronized void m1511as() {
        if (this.f5484q && this.IsServer && this.f5555bQ == null) {
            this.f5555bQ = new Timer();
            this.f5555bQ.schedule(new TimerTask() { // from class: com.corrodinggames.rts.gameFramework.i.ad.6
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    C0879n.m1247c();
                }
            }, 60000L, 60000L);
        }
    }

    /* renamed from: at */
    public String m1510at() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        String str = VariableScope.nullOrMissingString;
        if (m1072A.f6122bX.IsServer && !m1072A.f6122bX.f5571F) {
            String m1521ai = m1072A.f6122bX.m1521ai();
            if (this.f5492D) {
                if (this.f5493E != null) {
                    str = str + this.f5493E;
                }
            } else if (m1521ai != null) {
                String str2 = "Local IP address: " + m1521ai + " port: " + m1072A.f6122bX.socketPort;
                if (m1072A.f6122bX.f5538bl != null) {
                    if (!m1072A.f6122bX.f5538bl.booleanValue()) {
                        str2 = str2 + "\nUnable to get a public IP address, check your internet connection";
                    } else if (m1072A.f6122bX.f5536bj != null && m1072A.f6122bX.f5537bk != null) {
                        str2 = str2 + "\nYour public address is " + (m1072A.f6122bX.f5537bk.booleanValue() ? "<Open>" : "<CLOSED>") + " to the internet";
                    }
                } else {
                    str2 = str2 + "\nRetrieving your public IP...";
                }
                str = str + str2;
            } else {
                str = str + "You do not have a network connection";
            }
        }
        if (m1072A.m1058O()) {
            if (this.f5483p) {
                str = str + "SandBox Mode!\nPlace any unit, Control all teams, Special powers";
            } else {
                str = str + "Local skirmish";
            }
        }
        boolean z = true;
        if (LoggerMaybe.m997as() && m1072A.f6122bX.IsServer) {
            z = false;
        }
        if (str.length() != 0) {
            str = str + "\n";
            if (LoggerMaybe.m995au()) {
                str = str + "\n";
            }
        }
        if (m1072A.f6122bX.f5523aL || m1072A.f6122bX.IsServer) {
            if (z) {
                if (m1072A.f6122bX.f5603aO.f5654a != null) {
                    str = str + "Game Mode: " + m1072A.f6122bX.f5603aO.f5654a.mo1402a();
                }
                if (m1072A.f6122bX.f5603aO.f5655b != null) {
                    str = str + "\nMap: " + ActivityC0117i.m5112e(m1072A.f6122bX.f5603aO.f5655b);
                }
            }
            str = (str + "\nStarting Credits: " + m1072A.f6122bX.m1436j()) + "\nFog: " + m1072A.f6122bX.m1454g();
            if (m1072A.f6122bX.f5603aO.f5660g != 1) {
                str = str + "\nStarting Units: " + m1072A.f6122bX.m1448h();
            }
            if (m1072A.f6122bX.f5603aO.f5661h != 1.0f) {
                str = str + "\n" + C0758f.m2154a(m1072A.f6122bX.f5603aO.f5661h, 1) + "X income";
            }
            if (m1072A.f6122bX.f5603aO.f5662i) {
                str = str + "\nNo nukes";
            }
            if (m1072A.f6122bX.f5603aO.f5652l) {
                str = str + "\nShared control: On";
            }
            if (this.IsServer) {
                if (m1072A.f6122bX.f5481n != null) {
                    str = str + "\nPassword Protection: On";
                }
                if (!m1072A.f6122bX.f5484q && !m1072A.f6122bX.f5571F) {
                    str = str + "\nServer Visibility: Hidden";
                }
                if (m1072A.f6122bX.f5482o && !m1072A.f6122bX.f5571F) {
                    ArrayList m1652j = m1072A.f6124bZ.m1652j();
                    str = str + "\n-- Required Mods: --\n";
                    int i = 0;
                    Iterator it = m1652j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0824b c0824b = (C0824b) it.next();
                        if (i > 2 && i < m1652j.size() - 1) {
                            str = str + VariableScope.nullOrMissingString + (m1652j.size() - i) + " more mods...";
                            break;
                        }
                        i++;
                        String m1642b = c0824b.m1642b();
                        m1642b.replace("\"", "'");
                        m1642b.replace(";", ".");
                        str = str + " mod: \"" + m1642b + "\"\n";
                    }
                }
            }
        }
        return str;
    }

    /* renamed from: au */
    public String m1509au() {
        if (!this.f5482o) {
            return null;
        }
        ArrayList m1652j = LoggerMaybe.m1072A().f6124bZ.m1652j();
        String str = VariableScope.nullOrMissingString;
        int i = 0;
        Iterator it = m1652j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0824b c0824b = (C0824b) it.next();
            if (i != 0) {
                str = str + "; ";
            }
            if (i > 1 && i < m1652j.size() - 1) {
                str = str + VariableScope.nullOrMissingString + (m1652j.size() - i) + " more...";
                break;
            }
            i++;
            String m1642b = c0824b.m1642b();
            m1642b.replace(";", ".");
            str = str + m1642b;
        }
        return str;
    }

    /* renamed from: av */
    public String m1508av() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6122bX.f5603aO.f5655b == null || m1072A.f6122bX.f5603aO.f5654a == null) {
            return null;
        }
        if (m1072A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5669a) {
            return "maps/skirmish/" + m1072A.f6122bX.f5603aO.f5655b;
        }
        if (m1072A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5670b) {
            return "/SD/rusted_warfare_maps/" + m1072A.f6122bX.f5603aO.f5655b;
        }
        LoggerMaybe.LogDebug2("getNetworkMapPath: unhandled type:" + m1072A.f6122bX.f5603aO.f5654a);
        return null;
    }

    /* renamed from: aw */
    public boolean m1507aw() {
        return this.IsServer || this.f5495H;
    }

    /* renamed from: a */
    public void m1545a(String str, Steam steam) {
        LoggerMaybe.LogDebug2("sendCommandError: " + str);
        if (steam == null) {
            m1494b((Steam) null, -1, (String) null, str);
        } else {
            m1554a(null, null, null, str, steam);
        }
    }

    /* renamed from: b */
    public boolean m1493b(Steam steam, AbstractC0197n abstractC0197n, String str, String str2) {
        int i;
        AbstractC0197n m4562k;
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
                m1545a("[Could not find player]", steam);
                return true;
            } else if ((!this.IsServer || abstractC0197n != this.f5489z) && !this.f5562d.m1605b(steam)) {
                m1545a("[Only the host can change pause state]", steam);
                return true;
            } else if (!this.f5539bm) {
                m1545a("[Game not yet started]", steam);
                return true;
            } else {
                boolean z2 = !this.f5515al;
                if ("unpause".equals(str3)) {
                    z2 = false;
                }
                m1461e(z2);
                return true;
            }
        } else if ("endgame".equals(str3)) {
            if (abstractC0197n == null) {
                m1545a("[Could not find player]", steam);
                return true;
            } else if (!this.IsServer || abstractC0197n != this.f5489z) {
                m1545a("[Only the host can end game]", steam);
                return true;
            } else if (!this.f5539bm) {
                m1545a("[Game not yet started]", steam);
                return true;
            } else {
                m1523ag();
                return true;
            }
        } else if ("teamlock".equals(str3)) {
            if (abstractC0197n == null) {
                m1545a("[Could not find player]", steam);
                return true;
            } else if ((!this.IsServer || abstractC0197n != this.f5489z) && !this.f5562d.m1605b(steam)) {
                m1545a("[Only the host can change teamlock]", steam);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                this.f5603aO.f5665m = true;
                m1545a("[teams are locked]", steam);
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                this.f5603aO.f5665m = false;
                m1545a("[teams are unlocked]", steam);
                return true;
            } else {
                m1545a("[Expected true or false]", steam);
                return true;
            }
        } else if ("roomlock".equals(str3)) {
            if (abstractC0197n == null) {
                m1545a("[Could not find player]", steam);
                return true;
            } else if (!this.IsServer || abstractC0197n != this.f5489z) {
                m1545a("[Only the host can change roomlock]", steam);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                this.f5603aO.f5668p = true;
                m1545a("[room is locked]", steam);
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                this.f5603aO.f5668p = false;
                m1545a("[room is unlocked]", steam);
                return true;
            } else {
                m1545a("[Expected true or false]", steam);
                return true;
            }
        } else if ("share".equals(str3)) {
            if (abstractC0197n == null) {
                m1545a("[Could not find player]", steam);
                return true;
            } else if (!this.f5603aO.f5652l) {
                m1545a("[Shared control is not enabled in this game]", steam);
                return true;
            } else if ("true".equalsIgnoreCase(str4) || "on".equalsIgnoreCase(str4)) {
                if (!abstractC0197n.f1332H) {
                    abstractC0197n.f1332H = true;
                    m1435j("[shared control now on for " + str + "]");
                    return true;
                }
                m1435j("[shared control already on for " + str + "]");
                return true;
            } else if ("false".equalsIgnoreCase(str4) || "off".equalsIgnoreCase(str4)) {
                if (abstractC0197n.f1332H) {
                    abstractC0197n.f1332H = false;
                    m1435j("[shared control now off for " + str + "]");
                    return true;
                }
                m1435j("[shared control already off for " + str + "]");
                return true;
            } else {
                m1545a("[Expected true or false]", steam);
                return true;
            }
        } else if ("self_move".equals(str3)) {
            if (abstractC0197n == null) {
                m1545a("[Cannot Move - Player not found]", steam);
                return true;
            } else if (this.f5539bm) {
                m1545a("[Cannot Move '" + abstractC0197n.f1316u + "' - Game has been started]", steam);
                return true;
            } else if (m1426o()) {
                m1545a("[Cannot Move '" + abstractC0197n.f1316u + "' - Game is starting]", steam);
                return true;
            } else if (this.f5603aO.f5665m) {
                m1545a("[Cannot Move '" + abstractC0197n.f1316u + "' - Teams locked]", steam);
                return true;
            } else if (strArr.length > 0) {
                try {
                    int intValue = Integer.valueOf(strArr[0]).intValue();
                    Integer num = null;
                    if (strArr.length > 1) {
                        try {
                            num = Integer.valueOf(strArr[1]);
                            if (num.intValue() != -1 && (num.intValue() < 1 || num.intValue() > 99)) {
                                m1545a("[Cannot Move Team - Ally group - Out of range]", steam);
                                return true;
                            }
                        } catch (NumberFormatException e) {
                            m1545a("[Cannot Move '" + abstractC0197n.f1316u + "' - ally group '" + strArr[1] + "' is not a number]", steam);
                            return true;
                        }
                    }
                    boolean z3 = false;
                    if (intValue - 1 == -3) {
                        if (!this.f5603aO.f5667o) {
                            m1545a("[Spectators are disabled on this server]", steam);
                            return true;
                        }
                        synchronized (this.f5623bP) {
                            intValue = AbstractC0197n.m4659F();
                            if (intValue != -1) {
                                m1566a(abstractC0197n, -3);
                            }
                        }
                        z3 = true;
                    }
                    int i2 = abstractC0197n.f1312q;
                    boolean z4 = i2 == -3;
                    if (!z3) {
                        if (intValue < 1 || intValue > AbstractC0197n.f1365c) {
                            m1545a("[Cannot Move '" + abstractC0197n.f1316u + "' - target slotId must between 1-" + AbstractC0197n.f1365c + "]", steam);
                            return true;
                        }
                        synchronized (this.f5623bP) {
                            if (this.f5489z != abstractC0197n && (m4562k = AbstractC0197n.m4562k(intValue - 1)) != null && !m4562k.f1317v && !m4562k.m4619b()) {
                                m1545a("[Cannot move '" + abstractC0197n.f1316u + "' to slot: " + intValue + " - Player: " + m4562k.f1316u + " is in that slot.]", steam);
                                return true;
                            }
                            m1566a(abstractC0197n, intValue - 1);
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
                            m1435j("Player '" + abstractC0197n.f1316u + "' is now a spectator");
                        }
                    } else {
                        m1435j("Player '" + abstractC0197n.f1316u + "' moved themselves to: " + intValue);
                    }
                    m1588P();
                    ActivityC0122n.m5091o();
                    return true;
                } catch (NumberFormatException e2) {
                    m1545a("[Cannot Move '" + abstractC0197n.f1316u + "' - team '" + strArr[0] + "' is not a number]", steam);
                    return true;
                }
            } else {
                m1545a("[Cannot Move '" + abstractC0197n.f1316u + "' - No target]", steam);
                return true;
            }
        } else if ("self_team".equals(str3)) {
            if (abstractC0197n == null) {
                m1545a("[Cannot Set Team - Player not found]", steam);
                return true;
            } else if (this.f5539bm) {
                m1545a("[" + abstractC0197n.f1316u + ": Cannot Set Team - Game has been started]", steam);
                return true;
            } else if (m1426o()) {
                m1545a("[" + abstractC0197n.f1316u + ": Cannot Set Team - Game is starting]", steam);
                return true;
            } else if (this.f5603aO.f5665m) {
                m1545a("[" + abstractC0197n.f1316u + ": Cannot Set Team - Teams locked]", steam);
                return true;
            } else if (this.f5603aO.f5666n) {
                return true;
            } else {
                try {
                    int intValue2 = Integer.valueOf(str4).intValue();
                    if (intValue2 == -1) {
                        i = abstractC0197n.f1306k % 2;
                    } else if (intValue2 < 1 || intValue2 > 99) {
                        m1545a("[Cannot Set Team - Out of range]", steam);
                        return true;
                    } else {
                        i = intValue2 - 1;
                    }
                    if (abstractC0197n.f1312q != i) {
                        abstractC0197n.f1312q = i;
                        m1545a("Player '" + abstractC0197n.f1316u + "' team changed to: " + intValue2, steam);
                    }
                    m1588P();
                    ActivityC0122n.m5091o();
                    return true;
                } catch (NumberFormatException e3) {
                    m1429m("'" + str4 + "' is not a number");
                    return true;
                }
            }
        } else if ("surrender".equals(str3)) {
            if (!this.f5539bm) {
                m1545a("[Cannot Surrender - Game has not started]", steam);
                return true;
            } else if (abstractC0197n == null) {
                m1545a("[Could not find player]", steam);
                return true;
            } else if (!abstractC0197n.m4563k()) {
                LoggerMaybe.LogDebug2(str + ": Is voting to surrender");
                abstractC0197n.m4561l();
                m1555a(steam, abstractC0197n, str, "-t [Votes to surrender " + (AbstractC0197n.m4617b(abstractC0197n.f1312q) + "/" + AbstractC0197n.m4601c(abstractC0197n.f1312q)) + "]");
                return true;
            } else {
                LoggerMaybe.LogDebug2(str + ": Is already voting to surrender but updating timestamp");
                abstractC0197n.m4561l();
                return true;
            }
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static void m1563a(final C0841ae c0841ae) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6122bX != null) {
            m1072A.f6122bX.f5562d.mo412a(c0841ae);
        }
        if (LoggerMaybe.f6205aU) {
            return;
        }
        C0090c.m5133a(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.i.ad.7
            @Override // java.lang.Runnable
            public void run() {
                ActivityC0122n.m5097a(C0841ae.this);
            }
        });
    }

    /* renamed from: ax */
    public ArrayList m1506ax() {
        ArrayList m4603c;
        synchronized (this.f5623bP) {
            m4603c = AbstractC0197n.m4603c();
        }
        return m4603c;
    }

    /* renamed from: e */
    public void m1461e(boolean z) {
        this.f5515al = z;
        if (this.f5515al) {
            m1435j("Game Paused");
        } else {
            m1435j("Game unpaused");
        }
    }

    /* renamed from: b */
    public void m1492b(Steam steam, String str) {
        steam.m1337a(false, false, str);
    }

    /* renamed from: c */
    public void m1480c(Steam steam, String str) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam2 = (Steam) it.next();
            if (steam2.f5772j == steam) {
                m1492b(steam2, str);
            }
        }
    }

    /* renamed from: a */
    public Steam m1556a(Steam steam, int i, String str, String str2) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        Steam steam2 = new Steam(this, new C0873h(steam, i));
        steam2.f5806k = i;
        steam2.f5772j = steam;
        steam2.f5774m = str;
        steam2.f5775n = str2;
        try {
            steam2.m1332d();
            m1072A.f6122bX.f5606bc.add(steam2);
            m1072A.f6122bX.m1587Q();
            return steam2;
        } catch (IOException e) {
            e.printStackTrace();
            steam2.m1340a("crash");
            return null;
        }
    }

    /* renamed from: a */
    public Steam m1557a(Steam steam, int i) {
        Iterator it = this.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam2 = (Steam) it.next();
            if (steam2.f5806k == i && steam2.f5772j == steam) {
                return steam2;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static String m1425o(String str) {
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
    public void m1540a(ArrayList arrayList, final boolean z) {
        if (this.f5556bS != null) {
            LoggerMaybe.LogDebug2("startJoinServerInternalThread: Already joining");
        } else if (arrayList.size() == 0) {
            LoggerMaybe.LogDebug2("startJoinServerInternalThread: no servers");
        } else {
            this.f5556bS = m1542a((String) arrayList.get(0), false, new Runnable() { // from class: com.corrodinggames.rts.gameFramework.i.ad.8
                @Override // java.lang.Runnable
                public void run() {
                    LoggerMaybe m1072A = LoggerMaybe.m1072A();
                    LoggerMaybe.LogDebug2("startJoinServerInternalThread callback");
                    RunnableC0853am runnableC0853am = C0831ad.this.f5556bS;
                    C0831ad.this.f5556bS = null;
                    if (runnableC0853am == null) {
                        LoggerMaybe.LogDebug2("startJoinServerInternalThread callback gameConnector==null");
                    } else if (runnableC0853am.f5689e != null) {
                        LoggerMaybe.LogDebug2("startJoinServerInternalThread failed to connect: " + runnableC0853am.f5689e);
                        if (z) {
                            m1072A.f6122bX.m1491b("Reconnect failed: " + runnableC0853am.f5689e);
                            C0831ad.this.m1490b("Reconnect failed", "reconnect failed");
                            m1072A.m968d("Reconnect failed", "Reconnect failed: " + runnableC0853am.f5689e);
                            m1072A.m954i("Reconnect failed: " + runnableC0853am.f5689e);
                        }
                    } else {
                        try {
                            m1072A.f6122bX.m1491b("starting new");
                            m1072A.f6122bX.m1541a(runnableC0853am.f5691g);
                        } catch (IOException e) {
                            m1072A.m975c(e.getMessage(), "Connection failed");
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }
}
