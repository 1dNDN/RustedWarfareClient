package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.java.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/r.class */
public class C1188r extends Thread {

    /* renamed from: a */
    final /* synthetic */ C1185o f7255a;

    public C1188r(C1185o c1185o) {
        this.f7255a = c1185o;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        while (true) {
            try {
                C1186p c1186p = (C1186p) this.f7255a.f7242b.take();
                c1186p.m76a();
                this.f7255a.f7243c.m610a(c1186p);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
