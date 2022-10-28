package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/af.class */
public final class RunnableC0842af implements Runnable {

    /* renamed from: a */
    boolean f5647a;

    /* renamed from: b */
    DatagramSocket f5648b;

    /* renamed from: c */
    Timer f5649c;

    /* renamed from: d */
    final /* synthetic */ C0831ad f5650d;

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f5650d.LogError("starting socket for broadcast..");
            this.f5648b = new DatagramSocket((SocketAddress) null);
            this.f5648b.setReuseAddress(true);
            this.f5648b.bind(new InetSocketAddress(this.f5650d.f5565t));
            this.f5650d.LogError("reading..");
            byte[] bArr = new byte[1500];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            TimerTask timerTask = new TimerTask() { // from class: com.corrodinggames.rts.gameFramework.i.af.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (!RunnableC0842af.this.f5650d.IsServer) {
                        RunnableC0842af.this.m1409a();
                    }
                }
            };
            this.f5649c = new Timer();
            this.f5649c.scheduleAtFixedRate(timerTask, 20L, 5000L);
            while (this.f5647a) {
                this.f5648b.receive(datagramPacket);
                String str = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
                this.f5650d.LogError("accepted udp socket..");
                Reader reader = new Reader(str);
                if (!reader.ReadUTF().equals("com.corrodinggames.rts")) {
                    this.f5650d.LogError("ignoring udp packet: MAGIC_GAME_ID doesn't match");
                } else {
                    int ReadInt = reader.ReadInt();
                    reader.ReadInt();
                    String ReadUTF = reader.ReadUTF();
                    if (ReadUTF.equals("ping")) {
                        this.f5650d.LogError("got ping");
                        if (this.f5650d.IsServer) {
                            StreamWriter streamWriter = new StreamWriter();
                            streamWriter.WriteUTF("com.corrodinggames.rts");
                            streamWriter.WriteInteger(this.f5650d.GameVersion);
                            streamWriter.WriteInteger(0);
                            streamWriter.WriteUTF("pong");
                            streamWriter.WriteInteger(this.f5650d.socketPort);
                            String mo1356c = streamWriter.mo1356c();
                            this.f5648b.send(new DatagramPacket(mo1356c.getBytes(), mo1356c.length(), datagramPacket.getAddress(), this.f5650d.f5565t));
                        } else {
                            this.f5650d.LogError("not server");
                        }
                    } else if (!ReadUTF.equals("pong")) {
                        this.f5650d.LogError("got pong");
                        C0872g c0872g = new C0872g();
                        c0872g.f5823a = true;
                        c0872g.f5829g = reader.ReadInt();
                        c0872g.f5825c = datagramPacket.getAddress().toString();
                        c0872g.f5831j = VariableScope.nullOrMissingString + ReadInt;
                        this.f5650d.m1548a(c0872g);
                    } else {
                        this.f5650d.LogError("ignoring udp packet: unknown mode:" + ReadUTF);
                    }
                }
            }
        } catch (SocketException e) {
            if (this.f5647a) {
                throw new RuntimeException(e);
            }
            e.printStackTrace();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public void m1409a() {
        this.f5650d.LogError("sending ping");
        if (this.f5648b == null) {
            this.f5650d.LogError("failed to send a broadcast ping: datagramSocket is null");
            return;
        }
        InetAddress m1518al = this.f5650d.m1518al();
        if (m1518al == null) {
            this.f5650d.LogError("failed to send a broadcast ping: could not get a broadcast address");
            return;
        }
        try {
            StreamWriter streamWriter = new StreamWriter();
            streamWriter.WriteUTF("com.corrodinggames.rts");
            streamWriter.WriteInteger(this.f5650d.GameVersion);
            streamWriter.WriteInteger(0);
            streamWriter.WriteUTF("ping");
            String mo1356c = streamWriter.mo1356c();
            this.f5650d.LogError("sending ping on :" + m1518al.toString());
            this.f5648b.send(new DatagramPacket(mo1356c.getBytes(), mo1356c.length(), m1518al, this.f5650d.f5565t));
        } catch (IOException e) {
            e.printStackTrace();
            this.f5650d.LogError("failed to send a broadcast ping, IOException");
        }
    }

    /* renamed from: b */
    public void m1408b() {
        this.f5647a = false;
        if (this.f5648b != null) {
            this.f5648b.close();
        }
        if (this.f5649c != null) {
            this.f5649c.cancel();
        }
    }
}
