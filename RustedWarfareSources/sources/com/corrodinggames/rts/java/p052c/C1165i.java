package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.java.c.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/i.class */
public class C1165i {

    /* renamed from: a */
    SteamPublishedFileID f7131a;

    /* renamed from: b */
    Runnable f7132b;

    /* renamed from: a */
    public void m258a(SteamResult steamResult) {
        AbstractC0916l.m982b("PendingDownload onFinish for: " + this.f7131a);
        if (this.f7132b != null) {
            this.f7132b.run();
        }
    }
}
