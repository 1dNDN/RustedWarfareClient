package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamFriends;
import com.codedisaster.steamworks.SteamFriendsCallback;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.java.c.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/d.class */
public class C1160d implements SteamFriendsCallback {

    /* renamed from: a */
    C1157b f7113a;

    public C1160d(C1157b c1157b) {
        this.f7113a = c1157b;
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onSetPersonaNameResponse(boolean z, boolean z2, SteamResult steamResult) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onPersonaStateChange(SteamID steamID, SteamFriends.PersonaChange personaChange) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onGameOverlayActivated(boolean z) {
        AbstractC0916l.m963e("onGameOverlayActivated");
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onGameLobbyJoinRequested(SteamID steamID, SteamID steamID2) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onAvatarImageLoaded(SteamID steamID, int i, int i2, int i3) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onFriendRichPresenceUpdate(SteamID steamID, int i) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onGameRichPresenceJoinRequested(SteamID steamID, String str) {
    }
}
