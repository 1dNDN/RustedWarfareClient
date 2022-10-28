package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.librocket.C0051e;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.java.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/a.class */
public class RunnableC1155a implements Runnable {

    /* renamed from: a */
    C1157b f7088a;

    /* renamed from: b */
    String f7089b;

    /* renamed from: c */
    SteamID f7090c;

    /* renamed from: d */
    SteamID f7091d;

    /* renamed from: e */
    long f7092e;

    /* renamed from: f */
    Thread f7093f;

    public RunnableC1155a(C1157b c1157b, SteamID steamID, SteamID steamID2, long j) {
        this.f7088a = c1157b;
        this.f7090c = steamID;
        this.f7091d = steamID2;
        this.f7092e = j;
        this.f7089b = c1157b.f7096c.getFriendPersonaName(steamID);
    }

    /* renamed from: a */
    public void m295a() {
        if (this.f7093f != null) {
            throw new RuntimeException("already started");
        }
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                ScriptEngine.getInstance().getRoot().showPopupWithButtons("Invite", "'" + RunnableC1155a.this.f7089b + "' has invited you to join a game", true, new C0051e("Join", RunnableC1155a.this), null);
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m963e("Join clicked");
        ScriptEngine.getInstance().getRoot().closePopup();
        AbstractC0916l.m1071A();
        this.f7088a.f7097d.joinLobby(this.f7091d);
    }
}
