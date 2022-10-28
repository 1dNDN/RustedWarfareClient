package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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

    private RunnableC0869d(Steam steam) {
        this.f5815b = steam;
        this.f5814a = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        String message;
        LoggerMaybe.m999ap();
        Thread.currentThread().setName("ReceiveWorker-" + this.f5815b.m1322g());
        try {
            m1318a();
        } catch (EOFException e) {
            this.f5815b.m1333a("network:ReceiveWorker: EOF reading packet", e);
        } catch (IOException e2) {
            if (!this.f5815b.f5803a) {
                e2.printStackTrace();
            }
            if (LoggerMaybe.f6210aZ && (e2 instanceof SocketException) && !this.f5815b.f5803a) {
                LoggerMaybe m1071A = LoggerMaybe.m1071A();
                if (!m1071A.f6122bX.IsServer && m1071A.f6122bX.f5539bm && (message = e2.getMessage()) != null && message.contains("EBADF")) {
                    m1071A.m953i("Warning: This disconnect likely due to iOS removing sockets of background apps. Avoid minimising the game in multiplayer. Note: Games can be rejoined.");
                }
            }
            this.f5815b.LogDebug("network:ReceiveWorker: " + e2.getMessage());
        } catch (OutOfMemoryError e3) {
            LoggerMaybe.m973c(e3);
            this.f5815b.LogDebug("network:ReceiveWorker OutOfMemoryError: " + e3.getMessage());
        }
        this.f5815b.m1332a(true, false);
    }

    /* renamed from: a */
    void m1318a() {
        C0831ad c0831ad;
        C0831ad c0831ad2;
        C0831ad c0831ad3;
        DataInputStream dataInputStream = new DataInputStream(this.f5815b.f5767d.getInputStream());
        while (this.f5814a.booleanValue() && !this.f5815b.f5803a && !this.f5815b.f5767d.isClosed()) {
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            if (readInt > 20000000) {
                this.f5815b.m1329b("readData(): new packet of type:" + readInt2 + " has size of:" + readInt);
            }
            if (readInt > 10000) {
                int i = 50000000;
                c0831ad3 = this.f5815b.f5765W;
                if (c0831ad3.IsServer) {
                    i = 1000000;
                }
                if (!this.f5815b.f5777p) {
                    i = 10000;
                }
                if (readInt > i) {
                    this.f5815b.m1329b("Requested packet too large rejecting (max:" + i + ")");
                    return;
                }
            }
            if (readInt < 0) {
                this.f5815b.m1329b("Requested packet negative size:" + readInt + " rejecting");
                return;
            }
            Packet packet = new Packet(readInt2);
            packet.Data = new byte[readInt];
            this.f5815b.f5802V = 0;
            this.f5815b.f5801U = readInt;
            int i2 = 0;
            packet.steam = this.f5815b;
            while (i2 < readInt && !this.f5815b.f5803a) {
                int read = dataInputStream.read(packet.Data, i2, readInt - i2);
                if (read == -1) {
                    this.f5815b.m1329b("we got to the end of the stream?!?");
                    return;
                }
                i2 += read;
                this.f5815b.f5796P++;
                this.f5815b.f5802V = i2;
            }
            this.f5815b.f5801U = 0;
            this.f5815b.f5802V = 0;
            if (!this.f5815b.f5803a) {
                if (packet.MsgId > 100) {
                    c0831ad = this.f5815b.f5765W;
                    c0831ad.HandlePacket(packet);
                } else {
                    c0831ad2 = this.f5815b.f5765W;
                    c0831ad2.f5607bd.add(packet);
                }
            }
        }
    }
}
