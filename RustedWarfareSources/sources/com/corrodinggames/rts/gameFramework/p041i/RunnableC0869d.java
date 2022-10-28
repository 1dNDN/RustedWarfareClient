package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Steam;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/d.class */
public final class RunnableC0869d implements Runnable {

    /* renamed from: a */
    Boolean f5814a;

    /* renamed from: b */
    final /* synthetic */ Steam f5815b;

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC0869d(Steam steam) {
        this.f5815b = steam;
        this.f5814a = true;
    }

    /* synthetic */ RunnableC0869d(Steam steam, Steam.C08681 c08681) {
        this(steam);
    }

    public void run() {
        String message;
        Core.m1015ap();
        Thread.currentThread().setName("ReceiveWorker-" + this.f5815b.m1343g());
        try {
            m1339a();
        } catch (EOFException e) {
            this.f5815b.m1354a("network:ReceiveWorker: EOF reading packet", e);
        } catch (IOException e2) {
            if (!this.f5815b.f5766a) {
                e2.printStackTrace();
            }
            if (Core.f6210aZ && (e2 instanceof SocketException) && !this.f5815b.f5766a) {
                Core m1087A = Core.m1087A();
                if (!m1087A.f6122bX.IsServer && m1087A.f6122bX.f5539bm && (message = e2.getMessage()) != null && message.contains("EBADF")) {
                    m1087A.m969i("Warning: This disconnect likely due to iOS removing sockets of background apps. Avoid minimising the game in multiplayer. Note: Games can be rejoined.");
                }
            }
            this.f5815b.LogDebug("network:ReceiveWorker: " + e2.getMessage());
        } catch (OutOfMemoryError e3) {
            Core.m989c(e3);
            this.f5815b.LogDebug("network:ReceiveWorker OutOfMemoryError: " + e3.getMessage());
        }
        Steam.m1356a(this.f5815b, true, false);
    }

    /* renamed from: a */
    void m1339a() {
        DataInputStream dataInputStream = new DataInputStream(this.f5815b.f5769d.getInputStream());
        while (this.f5814a.booleanValue() && !this.f5815b.f5766a && !this.f5815b.f5769d.isClosed()) {
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            if (readInt > 20000000) {
                this.f5815b.m1350b("readData(): new packet of type:" + readInt2 + " has size of:" + readInt);
            }
            if (readInt > 10000) {
                int i = 50000000;
                if (Steam.m1357a(this.f5815b).IsServer) {
                    i = 1000000;
                }
                if (!this.f5815b.f5781p) {
                    i = 10000;
                }
                if (readInt > i) {
                    this.f5815b.m1350b("Requested packet too large rejecting (max:" + i + ")");
                    return;
                }
            }
            if (readInt < 0) {
                this.f5815b.m1350b("Requested packet negative size:" + readInt + " rejecting");
                return;
            }
            Packet packet = new Packet(readInt2);
            packet.Data = new byte[readInt];
            this.f5815b.f5813V = 0;
            this.f5815b.f5812U = readInt;
            int i2 = 0;
            packet.steam = this.f5815b;
            while (i2 < readInt && !this.f5815b.f5766a) {
                int read = dataInputStream.read(packet.Data, i2, readInt - i2);
                if (read == -1) {
                    this.f5815b.m1350b("we got to the end of the stream?!?");
                    return;
                }
                i2 += read;
                this.f5815b.f5807P++;
                this.f5815b.f5813V = i2;
            }
            this.f5815b.f5812U = 0;
            this.f5815b.f5813V = 0;
            if (!this.f5815b.f5766a) {
                if (packet.MsgId > 100) {
                    Steam.m1357a(this.f5815b).HandlePacket(packet);
                } else {
                    Steam.m1357a(this.f5815b).f5607bd.add(packet);
                }
            }
        }
    }
}
