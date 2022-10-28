package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.Core;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

/* renamed from: com.corrodinggames.rts.gameFramework.i.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/h.class */
public class C0873h extends Socket {

    /* renamed from: a */
    Steam f5850a;

    /* renamed from: b */
    int f5851b;

    /* renamed from: c */
    boolean f5852c = false;

    /* renamed from: d */
    C0874i f5853d = new C0874i(this);

    /* renamed from: e */
    C0875j f5854e = new C0875j(this);

    /* renamed from: a */
    public void m1321a(Packet packet) {
        this.f5850a.m1358a(new C0865ax(this.f5851b, packet));
    }

    public C0873h(Steam steam, int i) {
        this.f5850a = steam;
        this.f5851b = i;
    }

    public void bind(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    public synchronized void close() {
        if (!this.f5852c) {
            this.f5852c = true;
            Core.LogDebug2("Closing steam socket");
        }
        if (this.f5853d != null) {
            this.f5853d.m1320a(new byte[0]);
        }
    }

    public void connect(SocketAddress socketAddress, int i) {
        throw new RuntimeException("Not supported");
    }

    public void connect(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    public SocketChannel getChannel() {
        throw new RuntimeException("Not supported");
    }

    public InetAddress getInetAddress() {
        return null;
    }

    public InetAddress getLocalAddress() {
        return null;
    }

    public SocketAddress getLocalSocketAddress() {
        return null;
    }

    public SocketAddress getRemoteSocketAddress() {
        return null;
    }

    public InputStream getInputStream() {
        return this.f5853d;
    }

    public boolean getKeepAlive() {
        return true;
    }

    public int getLocalPort() {
        return 5555;
    }

    public boolean getOOBInline() {
        return false;
    }

    public OutputStream getOutputStream() {
        return this.f5854e;
    }

    public int getPort() {
        return 5555;
    }

    public synchronized int getReceiveBufferSize() {
        return 512;
    }

    public boolean getReuseAddress() {
        return false;
    }

    public synchronized int getSendBufferSize() {
        return 512;
    }

    public int getSoLinger() {
        return 0;
    }

    public synchronized int getSoTimeout() {
        return 0;
    }

    public boolean getTcpNoDelay() {
        return true;
    }

    public int getTrafficClass() {
        return 0;
    }

    public boolean isBound() {
        return true;
    }

    public boolean isClosed() {
        return this.f5852c;
    }

    public boolean isConnected() {
        return true;
    }

    public boolean isInputShutdown() {
        return this.f5853d != null;
    }

    public boolean isOutputShutdown() {
        return this.f5854e != null;
    }

    public void sendUrgentData(int i) {
    }

    public void setKeepAlive(boolean z) {
    }

    public void setOOBInline(boolean z) {
    }

    public void setPerformancePreferences(int i, int i2, int i3) {
    }

    public synchronized void setReceiveBufferSize(int i) {
    }

    public void setReuseAddress(boolean z) {
    }

    public synchronized void setSendBufferSize(int i) {
    }

    public void setSoLinger(boolean z, int i) {
    }

    public synchronized void setSoTimeout(int i) {
    }

    public void setTcpNoDelay(boolean z) {
    }

    public void setTrafficClass(int i) {
    }

    public void shutdownInput() {
    }

    public void shutdownOutput() {
    }

    public String toString() {
        return "<ForwardedSocket>";
    }
}
