package p000a.p001a;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.ArrayList;
import p000a.p001a.p002a.AbstractC0008h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.e */
/* loaded from: game-lib.jar:a/a/e.class */
public class C0014e extends C0017h {

    /* renamed from: a */
    boolean f41a;

    /* renamed from: i */
    private ArrayList f42i;

    /* renamed from: b */
    final /* synthetic */ C0010b f43b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014e(C0010b c0010b, DatagramSocket datagramSocket, SocketAddress socketAddress) {
        super(datagramSocket);
        this.f43b = c0010b;
        this.f48d = socketAddress;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p000a.p001a.C0017h
    /* renamed from: a */
    public void mo5262a(DatagramSocket datagramSocket, C0028r c0028r) {
        this.f42i = new ArrayList();
        this.f47c = datagramSocket;
        this.f65g = c0028r;
    }

    @Override // p000a.p001a.C0017h
    /* renamed from: a */
    protected AbstractC0008h mo5273a() {
        AbstractC0008h abstractC0008h;
        synchronized (this.f42i) {
            while (this.f42i.isEmpty()) {
                try {
                    this.f42i.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            abstractC0008h = (AbstractC0008h) this.f42i.remove(0);
        }
        return abstractC0008h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5274a(AbstractC0008h abstractC0008h) {
        synchronized (this.f42i) {
            if (!this.f41a) {
                this.f41a = true;
                super.mo5262a(this.f47c, this.f65g);
            }
            this.f42i.add(abstractC0008h);
            this.f42i.notify();
        }
    }

    @Override // p000a.p001a.C0017h
    /* renamed from: b */
    protected void mo5259b() {
        synchronized (this.f42i) {
            this.f42i.clear();
            this.f42i.add(null);
            this.f42i.notify();
        }
    }

    @Override // p000a.p001a.C0017h
    /* renamed from: a */
    protected void mo5263a(String str) {
        System.out.println(getPort() + ": " + str);
    }
}
