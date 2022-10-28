package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.bb */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bb.class */
public class RunnableC0717bb implements Runnable {

    /* renamed from: b */
    volatile int f4514b;

    /* renamed from: c */
    int f4515c;

    /* renamed from: d */
    int f4516d;

    /* renamed from: e */
    int f4517e;

    /* renamed from: f */
    int f4518f;

    /* renamed from: g */
    int f4519g;

    /* renamed from: k */
    final /* synthetic */ C0716ba f4523k;

    /* renamed from: a */
    volatile boolean f4513a = true;

    /* renamed from: h */
    boolean f4520h = false;

    /* renamed from: i */
    public ConcurrentLinkedQueue f4521i = new ConcurrentLinkedQueue();

    /* renamed from: j */
    public long f4522j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0717bb(C0716ba c0716ba) {
        this.f4523k = c0716ba;
    }

    /* renamed from: a */
    public synchronized void m2389a(C0719bd c0719bd) {
        if (this.f4520h) {
            AbstractC0916l.m963e("Replay:addCommand skipped due to stopped recording");
        }
        this.f4521i.add(c0719bd);
        this.f4518f = c0719bd.f4527a;
        if (c0719bd.f4531e != null) {
            this.f4523k.f4498y++;
        }
        if (c0719bd.f4532f != null) {
            this.f4523k.f4499z++;
        }
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void m2390a() {
        boolean z;
        this.f4513a = false;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        C0716ba.m2409a("stop requested at:" + m1071A.f6144bx);
        z = this.f4523k.f4490N;
        if (!z) {
            C0716ba.m2409a("Replay stop: warning: active==false");
        }
        if (this.f4523k.f4492s) {
            C0716ba.m2409a("Replay stop: warning: replaying==true");
        }
        this.f4514b = m1071A.f6144bx;
        this.f4515c = m1071A.f6145by;
        this.f4516d = this.f4523k.f4498y;
        this.f4517e = this.f4523k.f4499z;
        if (this.f4514b < this.f4518f) {
            AbstractC0916l.m963e("Replay: stoppedFrame<lastCommandFrame: " + this.f4514b + "<" + this.f4518f);
            this.f4514b = this.f4518f;
        }
        this.f4522j = 0L;
        notifyAll();
    }

    /* renamed from: b */
    private synchronized void m2388b() {
        try {
            if (this.f4513a) {
                wait();
            }
        } catch (InterruptedException e) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        while (this.f4513a) {
            if (this.f4521i.size() > 0) {
                C0719bd c0719bd = (C0719bd) this.f4521i.remove();
                try {
                    if (c0719bd.f4531e != null) {
                        this.f4523k.f4507H.mo1344e("rc");
                        this.f4523k.f4507H.mo1313a(c0719bd.f4527a);
                        c0719bd.f4531e.m2256a(this.f4523k.f4507H);
                        this.f4523k.f4507H.mo1311a("rc");
                        this.f4519g = c0719bd.f4527a;
                    } else if (c0719bd.f4529c != null) {
                        this.f4523k.f4507H.mo1344e("cs");
                        this.f4523k.f4507H.mo1313a(c0719bd.f4527a);
                        this.f4523k.f4507H.mo1367a(c0719bd.f4529c.longValue());
                        this.f4523k.f4507H.mo1311a("cs");
                    } else if (c0719bd.f4530d != null) {
                        this.f4523k.f4507H.mo1344e("wait");
                        this.f4523k.f4507H.mo1313a(c0719bd.f4527a);
                        this.f4523k.f4507H.mo1311a("wait");
                        this.f4523k.f4507H.mo1344e("es");
                        this.f4523k.f4507H.mo1313a(c0719bd.f4527a);
                        this.f4523k.f4507H.mo1356a(c0719bd.f4530d);
                        this.f4523k.f4507H.mo1311a("es");
                    } else if (c0719bd.f4532f != null) {
                        this.f4523k.f4507H.mo1344e("wait");
                        this.f4523k.f4507H.mo1313a(c0719bd.f4527a);
                        this.f4523k.f4507H.mo1311a("wait");
                        this.f4523k.f4507H.mo1344e("resync");
                        this.f4523k.f4507H.mo1313a(c0719bd.f4527a);
                        this.f4523k.f4507H.mo1313a(c0719bd.f4534h);
                        this.f4523k.f4507H.mo1313a(c0719bd.f4535i);
                        this.f4523k.f4507H.mo1314a(c0719bd.f4536j);
                        this.f4523k.f4507H.mo1314a(c0719bd.f4537k);
                        this.f4523k.f4507H.mo1356a(c0719bd.f4532f);
                        this.f4523k.f4507H.mo1311a("resync");
                    } else if (c0719bd.f4533g != null) {
                        this.f4523k.f4507H.mo1344e("chat");
                        this.f4523k.f4507H.mo1313a(c0719bd.f4527a);
                        this.f4523k.f4507H.mo1313a(c0719bd.f4533g.f4524a);
                        this.f4523k.f4507H.mo1351b(c0719bd.f4533g.f4525b);
                        this.f4523k.f4507H.mo1351b(c0719bd.f4533g.f4526c);
                        this.f4523k.f4507H.mo1311a("chat");
                    } else {
                        throw new RuntimeException("Unknown saved command");
                    }
                    if (this.f4522j == 0 || this.f4522j + 3000 < System.currentTimeMillis()) {
                        this.f4522j = System.currentTimeMillis();
                        this.f4523k.f4507H.mo1369a();
                    }
                } catch (IOException e) {
                    AbstractC0916l m1071A = AbstractC0916l.m1071A();
                    AbstractC0916l.m1025a("Replay error", (Throwable) e);
                    m1071A.f6165bS.f5115e.m1743a(VariableScope.nullOrMissingString, "IO error recording replay, disabling record");
                    this.f4523k.f4490N = false;
                    this.f4520h = true;
                    return;
                }
            }
            if (this.f4521i.size() == 0) {
                m2388b();
            }
        }
        try {
            this.f4523k.f4507H.mo1344e("wait");
            this.f4523k.f4507H.mo1313a(this.f4514b);
            this.f4523k.f4507H.mo1311a("wait");
            this.f4523k.f4507H.mo1344e("end");
            this.f4523k.f4507H.mo1311a("end");
            this.f4523k.f4507H.mo1344e("endReplayMetaData");
            this.f4523k.f4507H.mo1349c(0);
            this.f4523k.f4507H.mo1313a(this.f4514b);
            this.f4523k.f4507H.mo1313a(this.f4515c);
            this.f4523k.f4507H.mo1313a(this.f4516d);
            this.f4523k.f4507H.mo1313a(this.f4517e);
            this.f4523k.f4507H.mo1348c("{frames:" + this.f4514b + ",time:" + this.f4515c + ",commandCount:" + this.f4516d + ",resyncCount:" + this.f4517e + "}");
            this.f4523k.f4507H.mo1311a("endReplayMetaData");
            this.f4523k.f4507H.mo1369a();
            C0716ba.m2409a("Background writer stopping");
            C0716ba.m2409a("Remainding commands: " + this.f4521i.size());
            C0716ba.m2409a("last command: " + this.f4518f);
            C0716ba.m2409a("last command write: " + this.f4519g);
            C0716ba.m2409a("Commands issued: " + this.f4516d);
            this.f4520h = true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
