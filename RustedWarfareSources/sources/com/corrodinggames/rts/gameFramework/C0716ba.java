package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0851ak;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.ba */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ba.class */
public class C0716ba {

    /* renamed from: b */
    public static boolean f4473b = true;

    /* renamed from: c */
    public static boolean f4474c = true;

    /* renamed from: d */
    public static boolean f4475d = true;

    /* renamed from: e */
    public static boolean f4476e = true;

    /* renamed from: f */
    public boolean f4477f;

    /* renamed from: g */
    int f4478g;

    /* renamed from: h */
    int f4479h;

    /* renamed from: i */
    boolean f4480i;

    /* renamed from: j */
    int f4481j;

    /* renamed from: k */
    boolean f4482k;

    /* renamed from: m */
    public int f4483m;

    /* renamed from: n */
    public int f4484n;

    /* renamed from: o */
    public int f4485o;

    /* renamed from: p */
    public String f4486p;

    /* renamed from: q */
    boolean f4487q;

    /* renamed from: N */
    private volatile boolean f4488N;

    /* renamed from: r */
    String f4489r;

    /* renamed from: s */
    boolean f4490s;

    /* renamed from: u */
    C0719bd f4491u;

    /* renamed from: v */
    C0719bd f4492v;

    /* renamed from: w */
    int f4493w;

    /* renamed from: x */
    int f4494x;

    /* renamed from: y */
    int f4495y;

    /* renamed from: z */
    int f4496z;

    /* renamed from: A */
    InputStream f4497A;

    /* renamed from: B */
    BufferedInputStream f4498B;

    /* renamed from: C */
    DataInputStream f4499C;

    /* renamed from: D */
    Reader f4500D;

    /* renamed from: E */
    OutputStream f4501E;

    /* renamed from: F */
    BufferedOutputStream f4502F;

    /* renamed from: G */
    DataOutputStream f4503G;

    /* renamed from: H */
    StreamWriter f4504H;

    /* renamed from: I */
    RunnableC0717bb f4505I;

    /* renamed from: J */
    Thread f4506J;

    /* renamed from: M */
    public boolean f4507M;

    /* renamed from: a */
    String f4508a = "replays/";

    /* renamed from: l */
    public boolean f4509l = false;

    /* renamed from: t */
    public int f4510t = 1;

    /* renamed from: K */
    Object f4511K = new Object();

    /* renamed from: L */
    public boolean f4512L = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m2483a(C0716ba c0716ba) {
        return c0716ba.f4488N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m2482a(C0716ba c0716ba, boolean z) {
        c0716ba.f4488N = z;
        return z;
    }

    /* renamed from: a */
    public static void m2480a(String str) {
        Core.LogDebug2("Replay: " + str);
    }

    /* renamed from: b */
    public static void m2473b(String str) {
        Core.m998b("Replay: " + str);
    }

    /* renamed from: a */
    public static void m2478a(String str, Exception exc) {
        Core.m1041a("Replay: " + str, (Throwable) exc);
    }

    /* renamed from: a */
    public File m2477a(String str, boolean z) {
        return C0750a.m2289a(str, this.f4508a, z);
    }

    /* renamed from: a */
    public void m2484a(Context context) {
    }

    /* renamed from: a */
    public void m2487a() {
        Core m1087A = Core.m1087A();
        if (m1087A.f6237bt != 0.0f) {
            m1087A.f6237bt = 0.0f;
        } else {
            m1087A.f6237bt = 1.0f;
        }
    }

    /* renamed from: b */
    public void m2474b() {
        Core m1087A = Core.m1087A();
        if (m1087A.f6237bt == 1.0f) {
            m1087A.f6237bt = 2.0f;
        } else if (m1087A.f6237bt == 2.0f) {
            m1087A.f6237bt = 4.0f;
        } else if (m1087A.f6237bt == 4.0f) {
            m1087A.f6237bt = 8.0f;
        } else if (m1087A.f6237bt == 8.0f) {
            m1087A.f6237bt = 16.0f;
        } else if (m1087A.f6237bt == 16.0f) {
            m1087A.f6237bt = 32.0f;
        } else if (m1087A.f6237bt == 32.0f) {
            m1087A.f6237bt = 64.0f;
        } else if (m1087A.f6237bt == 64.0f) {
            m1087A.f6237bt = 1.0f;
        } else {
            m1087A.f6237bt = 1.0f;
        }
    }

    /* renamed from: a */
    public void m2485a(int i, String str, String str2, int i2) {
        RunnableC0717bb runnableC0717bb = this.f4505I;
        if (this.f4488N && !this.f4490s) {
            if (str2.startsWith("-t ")) {
            }
            C0719bd c0719bd = new C0719bd();
            c0719bd.f4527a = i2;
            c0719bd.f4533g = new C0718bc();
            c0719bd.f4533g.f4524a = i;
            c0719bd.f4533g.f4525b = str;
            c0719bd.f4533g.f4526c = str2;
            if (runnableC0717bb == null) {
                Core.m973g("Failed to record chat message, replay might have already stopped");
            } else {
                runnableC0717bb.m2460a(c0719bd);
            }
        }
    }

    /* renamed from: a */
    public void m2475a(byte[] bArr, int i, int i2, int i3, float f, float f2) {
        RunnableC0717bb runnableC0717bb = this.f4505I;
        if (this.f4488N && !this.f4490s) {
            C0719bd c0719bd = new C0719bd();
            c0719bd.f4527a = i;
            c0719bd.f4532f = bArr;
            c0719bd.f4534h = i2;
            c0719bd.f4535i = i3;
            c0719bd.f4536j = f;
            c0719bd.f4537k = f2;
            if (runnableC0717bb == null) {
                Core.m973g("Failed to save resync, replay might have already stopped");
            } else {
                runnableC0717bb.m2460a(c0719bd);
            }
        }
    }

    /* renamed from: a */
    public void m2481a(C0749e c0749e, int i) {
        RunnableC0717bb runnableC0717bb = this.f4505I;
        if (this.f4488N && !this.f4490s) {
            if (runnableC0717bb == null) {
                Core.m973g("Failed to record command, replay might have already stopped");
                return;
            }
            C0719bd c0719bd = new C0719bd();
            c0719bd.f4531e = c0749e.m2305f();
            c0719bd.f4527a = i;
            runnableC0717bb.m2460a(c0719bd);
            this.f4479h++;
            if (this.f4479h > 5) {
                this.f4479h = 0;
                Core m1087A = Core.m1087A();
                C0719bd c0719bd2 = new C0719bd();
                c0719bd2.f4529c = Long.valueOf(m2468e());
                c0719bd2.f4527a = m1087A.f6239bx;
                runnableC0717bb.m2460a(c0719bd2);
            }
        }
    }

    /* renamed from: c */
    public void m2472c() {
        if (this.f4488N && !this.f4490s) {
            Core m1087A = Core.m1087A();
            C0719bd c0719bd = new C0719bd();
            StreamWriter streamWriter = new StreamWriter();
            try {
                streamWriter.m1401c(0);
                streamWriter.WriteInteger(m1087A.f6122bX.f5583an.size());
                Iterator it = m1087A.f6122bX.f5583an.iterator();
                while (it.hasNext()) {
                    streamWriter.m1424a(((C0851ak) it.next()).f5677b);
                }
                c0719bd.f4530d = streamWriter.m1399d();
                c0719bd.f4527a = m1087A.f6239bx;
                this.f4505I.m2460a(c0719bd);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: d */
    public void m2470d() {
        synchronized (this.f4511K) {
            try {
                if (this.f4505I != null) {
                    this.f4505I.m2461a();
                    try {
                        this.f4506J.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.f4488N = false;
                    this.f4505I = null;
                    this.f4506J = null;
                }
                if (this.f4501E != null) {
                    this.f4503G.flush();
                    this.f4503G.close();
                    this.f4502F.flush();
                    this.f4502F.close();
                    this.f4501E.flush();
                    this.f4501E.close();
                }
                this.f4501E = null;
                this.f4502F = null;
                this.f4503G = null;
                this.f4504H = null;
            } catch (IOException e2) {
                e2.printStackTrace();
                this.f4501E = null;
                this.f4502F = null;
                this.f4503G = null;
                this.f4504H = null;
            }
            this.f4487q = false;
            this.f4488N = false;
            this.f4490s = false;
            this.f4489r = null;
            this.f4478g = 0;
            this.f4479h = 0;
            this.f4480i = false;
            this.f4481j = 0;
            this.f4482k = false;
            this.f4493w = 0;
            this.f4510t = 1;
            this.f4494x = 0;
            this.f4495y = 0;
            this.f4496z = 0;
            this.f4483m = -1;
            this.f4484n = 0;
            this.f4485o = -1;
            this.f4486p = null;
            try {
                if (this.f4497A != null) {
                    this.f4499C.close();
                    this.f4498B.close();
                    this.f4497A.close();
                }
                this.f4497A = null;
                this.f4498B = null;
                this.f4499C = null;
                this.f4500D = null;
            } catch (IOException e3) {
                e3.printStackTrace();
                this.f4497A = null;
                this.f4498B = null;
                this.f4499C = null;
                this.f4500D = null;
            }
        }
    }

    /* renamed from: e */
    public long m2468e() {
        AbstractC0623y abstractC0623y;
        long j = 0;
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                j = ((float) j) + (abstractC0623y.f6958el * 1000.0f) + (abstractC0623y.f6959em * 1000.0f) + (abstractC0623y.f1632cs * 1.0f) + ((AbstractC0623y) abstractC1120w).f6951ee;
            }
        }
        return j;
    }

    /* renamed from: f */
    public void m2466f() {
        if (!this.f4512L) {
            m2470d();
        }
    }

    /* renamed from: c */
    public boolean m2471c(String str) {
        return m2479a(str, m2477a(str, false));
    }

    /* renamed from: j */
    private void m2462j() {
        for (int i = 0; i < AbstractC0197n.f1365c; i++) {
            AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
            if (m5017k != null && (m5017k instanceof C0136a)) {
                ((C0136a) m5017k).f584aW = true;
            }
        }
    }

    /* renamed from: a */
    public boolean m2479a(String str, File file) {
        if (this.f4488N) {
            if (this.f4490s) {
                Core.m998b("startReplayingFile: A replay is already playing");
            } else {
                Core.m998b("startReplayingFile: A replay is already saving");
            }
        }
        m2470d();
        Core m1087A = Core.m1087A();
        m1087A.m982e();
        m1087A.f6122bX.m1466q();
        this.f4491u = null;
        this.f4487q = false;
        this.f4488N = true;
        this.f4490s = true;
        this.f4489r = str;
        try {
            if (file.isDirectory()) {
                Core.LogDebug2("File is a directory: " + file.getAbsolutePath());
                Core.LogDebug2("Cannot load replay: Target is a folder, instead of a file");
                m1087A.m1045a("Cannot load replay: Target is a folder, instead of a file", 1);
                return false;
            }
            this.f4497A = C0750a.m2294a(file);
            if (this.f4497A == null) {
                Core.LogDebug2("Cannot load replay: Failed to read replay file");
                m1087A.m1045a("Cannot load replay: Failed to read replay file", 1);
                return false;
            }
            this.f4498B = new BufferedInputStream(this.f4497A);
            this.f4499C = new DataInputStream(this.f4498B);
            this.f4500D = new Reader(this.f4499C);
            String ReadUTF = this.f4500D.ReadUTF();
            if (!ReadUTF.equals("rustedWarfareReplay")) {
                Core.LogDebug2("Header is not correct:" + ReadUTF);
                Core.LogDebug2("Cannot load replay: File is missing header (check if this file is a replay)");
                m1087A.m1045a("Cannot load replay: File is missing header (check if this file is a replay)", 1);
                return false;
            }
            int ReadInt = this.f4500D.ReadInt();
            int ReadInt2 = this.f4500D.ReadInt();
            m2480a("Loading save from version: " + ReadInt2);
            this.f4500D.m1318a(ReadInt2);
            String ReadUTF2 = this.f4500D.ReadUTF();
            if ((ReadInt2 != 95 || ReadInt != m1087A.m988c(true)) && !this.f4509l) {
                String str2 = "Cannot load replay: This replay was recording with a different version: " + ReadUTF2;
                if (Core.m1010au()) {
                    str2 = str2 + " (You can use the beta tab in steam to switch to old versions)";
                }
                m1087A.m1045a(str2, 1);
                m2480a("Replay version: " + ReadInt2 + " (" + ReadInt + ")");
                m2480a("GameSaver.thisSaveVersion: 95 (" + m1087A.m988c(true) + ")");
                if (!Core.f6091aG) {
                    this.f4488N = false;
                    return false;
                }
            }
            this.f4485o = ReadInt2;
            this.f4486p = ReadUTF2;
            this.f4500D.ReadBool();
            this.f4500D.m1307b("gamesave");
            this.f4507M = false;
            this.f4512L = true;
            m2480a("Loading replay initial save");
            m1087A.f6125ca.m427a(this.f4500D, false, false, false);
            this.f4512L = false;
            this.f4500D.m1303d("gamesave");
            if (!this.f4507M) {
                m2480a("ReplayEngine: --- No game setup read ----");
                m1087A.f6122bX.f5603aO.f5662i = true;
                m1087A.f6106bC = m1087A.settingEngine.teamUnitCapHostedGame;
                m1087A.f6105bB = m1087A.f6106bC;
            }
            if (!this.f4477f) {
                m2462j();
            }
            m2480a("--- Reply settings ---");
            m2480a("Unit cap: " + m1087A.f6106bC);
            m2480a(m1087A.f6122bX.f5603aO.m1446b());
            m2480a("Starting frame:" + m1087A.f6239bx);
            if (!this.f4477f) {
                for (int i = 0; i < AbstractC0197n.f1365c; i++) {
                    AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
                    if (m5017k != null && m5017k.f1316u != null) {
                        m1087A.f6117bS.f5115e.m1794a(VariableScope.nullOrMissingString, "Player '" + m5017k.f1316u + "' playing as " + m5017k.m5109K().toLowerCase() + " (team:" + m5017k.m5025h() + ")");
                    }
                }
            }
            if (Core.f6193aw) {
                C0831ad.m1493g("Warning: editor will desync checksums.");
                m1087A.f6100bv = true;
                m1087A.f6231bl = true;
                m1087A.f6233bn = true;
            }
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m2476a(boolean z) {
        if (Core.f6207aW) {
            if (!Core.f6214bd) {
                return;
            }
        } else if (!Core.f6213bc) {
            return;
        }
        Core m1087A = Core.m1087A();
        if (m1087A.f6122bX.lock1 && !z && !this.f4512L && m1087A.settingEngine.saveMultiplayerReplays) {
            m2469d(m1087A.m1020ak() + " [v" + m1087A.m951u() + "] (" + C0758f.m2179a("d MMM yyyy HH.mm.ss") + ").replay");
        }
    }

    /* renamed from: d */
    public void m2469d(String str) {
        m2480a("Recording replay to: " + str);
        if (this.f4488N) {
            if (this.f4490s) {
                m2473b("startSaving: A replay is already playing");
            } else {
                m2473b("startSaving: A replay is already saving");
            }
        }
        m2470d();
        Core m1087A = Core.m1087A();
        this.f4487q = false;
        this.f4488N = true;
        this.f4490s = false;
        this.f4489r = str;
        try {
            File m2477a = m2477a(str, true);
            this.f4501E = C0750a.m2292a(m2477a, false);
            if (this.f4501E == null) {
                m2473b("Failed to create replay file at:" + m2477a.getAbsolutePath());
                Core.m1087A().m969i("Failed to create replay file (Replay recording will be disabled)");
                m2470d();
                return;
            }
            this.f4502F = new BufferedOutputStream(this.f4501E);
            this.f4503G = new DataOutputStream(this.f4502F);
            this.f4504H = new StreamWriter(this.f4503G);
            this.f4504H.WriteUTF("rustedWarfareReplay");
            this.f4504H.WriteInteger(m1087A.m988c(true));
            this.f4504H.WriteInteger(95);
            this.f4504H.WriteUTF(m1087A.m951u());
            this.f4504H.mo1329a(m1087A.f6228ar);
            this.f4504H.m1396e("gamesave");
            m1087A.f6125ca.m428a(this.f4504H);
            this.f4504H.mo1332a("gamesave");
            this.f4503G.flush();
            this.f4505I = new RunnableC0717bb(this);
            this.f4506J = new Thread(this.f4505I);
            this.f4506J.start();
        } catch (IOException e) {
            m2478a("Failed to start recording replay", e);
            Core.m1087A().m969i("Failed to start recording replay: " + e.getMessage());
            m2470d();
        } catch (Exception e2) {
            m2478a("Failed to start recording replay (Non IOException)", e2);
            Core.m1087A().m969i("Failed to start recording replay (Non IOException): " + e2.getMessage());
            m2470d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x05fe, code lost:
        r0.f6099bs = r0.f1609bV;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0607, code lost:
        r6.f4503D.m1288d("end");
        com.corrodinggames.rts.gameFramework.Core.LogDebug2("number of replay commands issued:" + r6.f4497x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0629, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x05b6, code lost:
        com.corrodinggames.rts.gameFramework.Core.m982b("replay:updateGameFrame", "end of replay block found");
        r0.f6117bS.f5115e.m1750a(com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.nullOrMissingString, "Replay has ended");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x05d0, code lost:
        if (r0.f6100bv != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05d3, code lost:
        r6.f4489q = true;
        r0.f6237bt = 0.25f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x05e1, code lost:
        r6.f4489q = false;
        r6.f4490N = false;
        r6.f4492s = false;
        r0 = r0.f6117bS.m1781i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x05fb, code lost:
        if (r0 == null) goto L197;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2486a(float r7) {
        /*
            Method dump skipped, instructions count: 2432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.C0716ba.m2486a(float):void");
    }

    /* renamed from: e */
    public void m2467e(String str) {
        Core.LogDebug2("ReplayEngine deleteGame: " + str);
        String m2265n = C0750a.m2265n(str);
        if (m2265n.contains("\\") || m2265n.contains("/")) {
            Core.LogDebug2("Cannot get replay with path: " + str);
            return;
        }
        File m2477a = m2477a(str, true);
        Core.LogDebug2("ReplayEngine path: " + m2477a.getAbsolutePath());
        if (!m2477a.exists()) {
            Core.LogDebug2("ReplayEngine deleteGame: file doesn't exist");
        }
        if (!C0750a.m2285b(m2477a)) {
            Core.LogDebug2("ReplayEngine deleteGame: failed to delete: " + m2477a.getAbsolutePath());
        }
        File m2477a2 = m2477a(str + ".map", true);
        if (m2477a2.exists()) {
            C0750a.m2285b(m2477a2);
        }
    }

    /* renamed from: g */
    public boolean m2465g() {
        return this.f4488N;
    }

    /* renamed from: h */
    public boolean m2464h() {
        return this.f4488N && this.f4490s;
    }

    /* renamed from: i */
    public boolean m2463i() {
        return this.f4488N && !this.f4490s;
    }
}
