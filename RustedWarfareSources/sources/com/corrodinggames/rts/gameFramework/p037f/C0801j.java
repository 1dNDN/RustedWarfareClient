package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;

/* renamed from: com.corrodinggames.rts.gameFramework.f.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/j.class */
public class C0801j {

    /* renamed from: a */
    String f5274a;

    /* renamed from: b */
    String f5275b;

    /* renamed from: c */
    long f5276c;

    /* renamed from: d */
    String f5277d;

    /* renamed from: e */
    public int f5278e = -1;

    /* renamed from: f */
    public int f5279f = -1;

    /* renamed from: a */
    public int m1749a() {
        return (int) (System.currentTimeMillis() - this.f5276c);
    }

    /* renamed from: b */
    public boolean m1748b() {
        if (LoggerMaybe.m1079A().m1053a() || this.f5276c + 14000 > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
