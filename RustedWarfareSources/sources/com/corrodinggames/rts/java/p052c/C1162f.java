package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamNetworking;
import com.codedisaster.steamworks.SteamNetworkingCallback;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.java.c.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/f.class */
public class C1162f implements SteamNetworkingCallback {

    /* renamed from: a */
    C1157b f7115a;

    public C1162f(C1157b c1157b) {
        this.f7115a = c1157b;
    }

    @Override // com.codedisaster.steamworks.SteamNetworkingCallback
    public void onP2PSessionConnectFail(SteamID steamID, SteamNetworking.P2PSessionError p2PSessionError) {
        AbstractC0916l.m963e("onP2PSessionConnectFail:" + p2PSessionError);
        C1167k c1167k = (C1167k) this.f7115a.f7105l.get(steamID);
        if (c1167k != null && !c1167k.isClosed()) {
            AbstractC0916l.m963e("onP2PSessionConnectFail: closing active socket");
            try {
                c1167k.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.codedisaster.steamworks.SteamNetworkingCallback
    public void onP2PSessionRequest(SteamID steamID) {
        AbstractC0916l.m963e("onP2PSessionRequest:" + steamID);
        this.f7115a.f7101h.acceptP2PSessionWithUser(steamID);
    }
}
