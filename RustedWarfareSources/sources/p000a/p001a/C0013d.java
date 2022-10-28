package p000a.p001a;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000a.p001a.p002a.AbstractC0008h;
import p000a.p001a.p002a.C0001a;
import p000a.p001a.p002a.C0007g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.d */
/* loaded from: game-lib.jar:a/a/d.class */
public class C0013d extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0010b f40a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013d(C0010b c0010b) {
        super("ReliableServerSocket");
        this.f40a = c0010b;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2;
        DatagramSocket datagramSocket3;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        C0014e c0014e;
        HashMap hashMap5;
        HashMap hashMap6;
        HashMap hashMap7;
        HashMap hashMap8;
        DatagramSocket datagramSocket4;
        HashMap hashMap9;
        HashMap hashMap10;
        HashMap hashMap11;
        HashMap hashMap12;
        AbstractC0012c abstractC0012c;
        byte[] bArr = new byte[65535];
        while (true) {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            try {
                try {
                    datagramSocket3 = this.f40a.f29d;
                    datagramSocket3.receive(datagramPacket);
                    SocketAddress socketAddress = datagramPacket.getSocketAddress();
                    hashMap = this.f40a.f34i;
                    synchronized (hashMap) {
                        hashMap2 = this.f40a.f36k;
                        AbstractC0000a abstractC0000a = (AbstractC0000a) hashMap2.get(socketAddress);
                        if (abstractC0000a == null) {
                            hashMap3 = this.f40a.f34i;
                            synchronized (hashMap3) {
                                hashMap4 = this.f40a.f34i;
                                c0014e = (C0014e) hashMap4.get(socketAddress);
                            }
                            if (c0014e != null || (abstractC0012c = this.f40a.f28a) == null || abstractC0012c.mo1387a(socketAddress)) {
                                AbstractC0008h m5300b = AbstractC0008h.m5300b(datagramPacket.getData(), 0, datagramPacket.getLength());
                                if (!this.f40a.isClosed() && c0014e == null) {
                                    if (m5300b instanceof C0007g) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        hashMap7 = this.f40a.f35j;
                                        if (hashMap7.size() > 0) {
                                            int i = 10000;
                                            hashMap10 = this.f40a.f35j;
                                            if (hashMap10.size() > 20) {
                                                i = 5000;
                                            }
                                            hashMap11 = this.f40a.f35j;
                                            if (hashMap11.size() > 200) {
                                                i = 3000;
                                            }
                                            hashMap12 = this.f40a.f35j;
                                            Iterator it = hashMap12.entrySet().iterator();
                                            while (it.hasNext()) {
                                                if (((C0016g) ((Map.Entry) it.next()).getValue()).f45a + i < currentTimeMillis) {
                                                    it.remove();
                                                }
                                            }
                                        }
                                        hashMap8 = this.f40a.f35j;
                                        C0016g c0016g = (C0016g) hashMap8.get(socketAddress);
                                        if (c0016g != null) {
                                            c0016g.f46b.m5269a((C0007g) m5300b);
                                        } else {
                                            C0016g c0016g2 = new C0016g();
                                            c0016g2.f45a = currentTimeMillis;
                                            C0010b c0010b = this.f40a;
                                            datagramSocket4 = this.f40a.f29d;
                                            c0016g2.f46b = new C0014e(c0010b, datagramSocket4, socketAddress);
                                            c0016g2.f46b.m5269a((C0007g) m5300b);
                                            hashMap9 = this.f40a.f35j;
                                            hashMap9.put(socketAddress, c0016g2);
                                        }
                                    }
                                    if (m5300b instanceof C0001a) {
                                        hashMap5 = this.f40a.f35j;
                                        C0016g c0016g3 = (C0016g) hashMap5.get(socketAddress);
                                        if (c0016g3 != null) {
                                            C0014e c0014e2 = c0016g3.f46b;
                                            if (!c0014e2.m5257b(m5300b)) {
                                                this.f40a.m5282a("lightweight ack failed ack:" + m5300b.m5297n());
                                            } else {
                                                this.f40a.m5279a(socketAddress, c0014e2);
                                                c0014e = c0014e2;
                                                hashMap6 = this.f40a.f35j;
                                                hashMap6.remove(socketAddress);
                                            }
                                        }
                                    }
                                }
                                if (c0014e != null) {
                                    c0014e.m5274a(m5300b);
                                }
                            }
                        } else {
                            abstractC0000a.m5318a(datagramPacket.getData(), datagramPacket.getLength());
                        }
                    }
                } catch (IOException e) {
                    C0010b c0010b2 = this.f40a;
                    StringBuilder append = new StringBuilder().append("IOException receiving packet:").append(e.getMessage()).append(" isConnected:");
                    datagramSocket = this.f40a.f29d;
                    c0010b2.m5282a(append.append(datagramSocket.isConnected()).toString());
                    datagramSocket2 = this.f40a.f29d;
                    if (!datagramSocket2.isConnected()) {
                        this.f40a.close();
                    }
                    throw new IOException(e);
                    break;
                }
            } catch (IOException e2) {
                if (!this.f40a.isClosed()) {
                    this.f40a.m5282a("IOException client " + ((Object) null) + " - " + e2.getMessage());
                } else {
                    return;
                }
            } catch (IllegalArgumentException e3) {
                if (!this.f40a.isClosed()) {
                    this.f40a.m5282a("IllegalArgumentException " + ((Object) null) + " - " + e3.getMessage());
                } else {
                    return;
                }
            }
        }
    }
}
