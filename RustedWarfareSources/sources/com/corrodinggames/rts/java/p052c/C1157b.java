package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamFriends;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking;
import com.codedisaster.steamworks.SteamNetworking;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUtils;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.Steam;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.c.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/b.class */
public class C1157b extends C1058a {

    /* renamed from: b */
    C1160d f7095b;

    /* renamed from: c */
    SteamFriends f7096c;

    /* renamed from: d */
    SteamMatchmaking f7097d;

    /* renamed from: e */
    C1161e f7098e;

    /* renamed from: f */
    C1162f f7099f;

    /* renamed from: g */
    C1163g f7100g;

    /* renamed from: h */
    SteamNetworking f7101h;

    /* renamed from: i */
    C1159c f7102i;

    /* renamed from: j */
    SteamUtils f7103j;

    /* renamed from: k */
    boolean f7104k = false;

    /* renamed from: l */
    HashMap f7105l = new HashMap();

    /* renamed from: m */
    ByteBuffer f7106m;

    /* renamed from: n */
    SteamID f7107n;

    /* renamed from: o */
    boolean f7108o;

    /* renamed from: p */
    SteamID f7109p;

    /* renamed from: n */
    public C1163g m279n() {
        return this.f7100g;
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: b */
    public void mo293b() {
        if (this.f7104k) {
            LoggerMaybe.LogDebug2("SteamEngine - init already called");
            return;
        }
        this.f7104k = true;
        LoggerMaybe.LogDebug2("SteamEngine - java steamEngine init()");
        try {
            if (!SteamAPI.init()) {
                LoggerMaybe.m993b("steamAPI init failed");
                mo287d();
                return;
            }
            this.f7106m = ByteBuffer.allocateDirect(100000);
            this.f7095b = new C1160d(this);
            this.f7096c = new SteamFriends(this.f7095b);
            this.f7098e = new C1161e(this);
            this.f7097d = new SteamMatchmaking(this.f7098e);
            this.f7099f = new C1162f(this);
            this.f7101h = new SteamNetworking(this.f7099f, SteamNetworking.API.Client);
            this.f7100g = new C1163g(this);
            try {
                this.f7100g.m276a(new SteamUGC(this.f7100g.m278a()));
                this.f7102i = new C1159c(this);
                this.f7103j = new SteamUtils(this.f7102i);
            } catch (RuntimeException e) {
                e.printStackTrace();
                throw new SteamException("Failed to create workshop");
            }
        } catch (SteamException e2) {
            e2.printStackTrace();
            mo287d();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: a */
    public void mo298a(float f) {
        SteamAPI.runCallbacks();
        if (this.f7101h != null) {
            if (LoggerMaybe.f6197aK != null) {
                LoggerMaybe.LogDebug2("Joining game from commandline invite:" + LoggerMaybe.f6197aK);
                long parseLong = Long.parseLong(LoggerMaybe.f6197aK);
                LoggerMaybe.f6197aK = null;
                this.f7097d.joinLobby(SteamID.createFromNativeHandle(parseLong));
            }
            while (true) {
                int isP2PPacketAvailable = this.f7101h.isP2PPacketAvailable(0);
                if (isP2PPacketAvailable != 0) {
                    if (isP2PPacketAvailable > this.f7106m.capacity()) {
                        LoggerMaybe.m993b("nextPacketSize:" + isP2PPacketAvailable + " larger then byteBuffer:" + this.f7106m.capacity() + " resizing");
                        this.f7106m = ByteBuffer.allocateDirect(isP2PPacketAvailable);
                    }
                    SteamID steamID = new SteamID();
                    try {
                        this.f7106m.clear();
                        int readP2PPacket = this.f7101h.readP2PPacket(steamID, this.f7106m, 0);
                        if (readP2PPacket == 0) {
                            LoggerMaybe.m993b("readP2PPacket with rtn==" + readP2PPacket);
                        }
                        C1167k c1167k = (C1167k) this.f7105l.get(steamID);
                        if (c1167k != null && c1167k.isClosed()) {
                            LoggerMaybe.m993b("Removing stale steam socket");
                            this.f7105l.remove(steamID);
                            c1167k = null;
                        }
                        if (c1167k == null) {
                            m292b(steamID);
                            c1167k = (C1167k) this.f7105l.get(steamID);
                        }
                        if (c1167k == null) {
                            LoggerMaybe.LogDebug2("Could not find remote ID steamSocket: " + steamID);
                        } else {
                            byte[] bArr = new byte[this.f7106m.limit()];
                            this.f7106m.get(bArr);
                            c1167k.f7136c.m260a(bArr);
                        }
                    } catch (SteamException e) {
                        e.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: d */
    public void mo287d() {
        LoggerMaybe.m993b("JavaSteamEngine: disableSteam");
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        if (m1082A != null) {
            m1082A.m964i("Steam connection failed.");
        } else {
            LoggerMaybe.LogDebug2("cannot show alert game has not been created");
        }
        C1058a.f6733a = new C1058a();
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: c */
    public String mo289c() {
        return this.f7096c.getPersonaName();
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: f */
    public boolean mo286f() {
        return false;
    }

    /* renamed from: a */
    public void m294a(String str) {
        LoggerMaybe.LogDebug2("Steam: " + str);
    }

    /* renamed from: b */
    public void m290b(String str) {
        LoggerMaybe.m993b("Steam: " + str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: i */
    public void mo284i() {
        m294a("createLobby");
        if (this.f7107n != null) {
            m290b("createLobby: activeLobby!=null");
        }
        this.f7097d.createLobby(SteamMatchmaking.LobbyType.FriendsOnly, 10);
    }

    /* renamed from: a */
    public synchronized void m297a(SteamID steamID) {
        LoggerMaybe.m1082A();
        this.f7107n = steamID;
    }

    /* renamed from: b */
    public Steam m292b(SteamID steamID) {
        LoggerMaybe.LogDebug2("addPeer: " + steamID);
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        C1167k c1167k = (C1167k) this.f7105l.get(steamID);
        if (c1167k != null) {
            if (c1167k.isClosed()) {
                this.f7105l.remove(steamID);
            } else {
                m290b("addPeer, user already exists");
                try {
                    c1167k.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        C1167k c1167k2 = new C1167k(this, steamID);
        Steam steam = new Steam(m1082A.f6122bX, c1167k2);
        try {
            steam.Connected = true;
            steam.m1337d();
            m1082A.f6122bX.f5606bc.add(steam);
            this.f7105l.put(steamID, c1167k2);
            m1082A.f6122bX.m1594Q();
            return steam;
        } catch (IOException e2) {
            e2.printStackTrace();
            steam.m1345a("crash");
            return null;
        }
    }

    /* renamed from: c */
    public void m288c(final SteamID steamID) {
        LoggerMaybe.LogDebug2("connectTo: " + steamID);
        C1167k c1167k = (C1167k) this.f7105l.get(steamID);
        if (c1167k != null) {
            if (c1167k.isClosed()) {
                this.f7105l.remove(steamID);
            } else {
                m290b("connectTo, user already exists");
                try {
                    c1167k.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        LoggerMaybe.m1082A();
        if (!this.f7108o) {
            ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    LoggerMaybe m1082A = LoggerMaybe.m1082A();
                    try {
                        C1157b.this.m294a("connectTo runnable start");
                        Root root = ScriptEngine.getInstance().getRoot();
                        m1082A.f6122bX.m1498b("starting new");
                        C1157b.this.f7107n = steamID;
                        C1157b.this.f7109p = C1157b.this.f7097d.getLobbyOwner(C1157b.this.f7107n);
                        String str = m1082A.f6115bQ.lastNetworkPlayerName;
                        String mo289c = C1058a.m740a().mo289c();
                        if (mo289c != null && str == null) {
                            str = C0758f.m2133a(mo289c.replace(" ", "_"), 20);
                        }
                        m1082A.f6122bX.f5487y = str;
                        C1167k c1167k2 = new C1167k(C1157b.this, C1157b.this.f7109p);
                        C1157b.this.f7105l.put(C1157b.this.f7109p, c1167k2);
                        m1082A.f6122bX.m1548a(c1167k2);
                        Iterator it = m1082A.f6122bX.f5606bc.iterator();
                        while (it.hasNext()) {
                            ((Steam) it.next()).Connected = true;
                        }
                        C1157b.this.m294a("connected");
                        root.showBattleroom();
                        C1157b.this.m294a("connectTo runnable end");
                    } catch (IOException e2) {
                        m1082A.m985c(e2.getMessage(), "Connection failed");
                        e2.printStackTrace();
                    }
                }
            });
            return;
        }
        m294a("connectTo as server?");
        m292b(steamID);
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: j */
    public void mo283j() {
        m294a("stopLobby");
        if (this.f7107n == null) {
            m290b("stopLobby: activeLobby==null");
        } else {
            this.f7097d.leaveLobby(this.f7107n);
        }
        m294a("stopLobby: activeSteamSockets:" + this.f7105l.size());
        for (C1167k c1167k : this.f7105l.values()) {
            try {
                c1167k.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.f7105l.clear();
        this.f7107n = null;
        this.f7109p = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: g */
    public void mo285g() {
        if (this.f7107n == null) {
        }
        if (this.f7107n == null) {
            LoggerMaybe.m1082A().m964i("Error: No steam lobby has been started");
        } else {
            this.f7096c.activateGameOverlayInviteDialog(this.f7107n);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: k */
    public void mo282k() {
        this.f7100g.m269c();
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: l */
    public void mo281l() {
        this.f7100g.m266d();
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: m */
    public void mo280m() {
        m279n().m272b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: a */
    public void mo296a(C0824b c0824b) {
        m279n().m267c(c0824b);
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: b */
    public void mo291b(C0824b c0824b) {
        m279n().m270b(c0824b);
    }

    @Override // com.corrodinggames.rts.gameFramework.p047n.C1058a
    /* renamed from: a */
    public void mo295a(C0824b c0824b, boolean z, String str) {
        m279n().m273a(c0824b, z, str);
    }
}
