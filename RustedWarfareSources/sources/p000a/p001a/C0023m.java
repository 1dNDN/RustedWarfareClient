package p000a.p001a;

import java.io.IOException;
import p000a.p001a.p002a.AbstractC0008h;
import p000a.p001a.p002a.C0001a;
import p000a.p001a.p002a.C0003c;
import p000a.p001a.p002a.C0007g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.m */
/* loaded from: game-lib.jar:a/a/m.class */
public class C0023m extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0017h f91a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023m(C0017h c0017h) {
        super("ReliableSocket");
        this.f91a = c0017h;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        AbstractC0008h m5234i;
        while (true) {
            try {
                m5234i = this.f91a.m5234i();
                if (m5234i != null) {
                    if (m5234i instanceof C0007g) {
                        this.f91a.m5269a((C0007g) m5234i);
                    } else if (m5234i instanceof C0003c) {
                        this.f91a.m5270a((C0003c) m5234i);
                    } else if (!(m5234i instanceof C0001a)) {
                        this.f91a.m5239g(m5234i);
                    }
                    this.f91a.m5252c(m5234i);
                } else {
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
