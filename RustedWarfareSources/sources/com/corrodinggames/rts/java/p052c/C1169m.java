package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamNetworking;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.corrodinggames.rts.java.c.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/m.class */
public class C1169m extends OutputStream {

    /* renamed from: a */
    boolean f7143a = true;

    /* renamed from: b */
    final /* synthetic */ C1167k f7144b;

    public C1169m(C1167k c1167k) {
        this.f7144b = c1167k;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        AbstractC0916l.m957g("SteamSocketOutputStream: Slow write: " + i);
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f7144b.f7135b) {
            AbstractC0916l.m963e("cannot write steam socket closed");
        } else if (i2 > 307200) {
            AbstractC0916l.m963e("Steam spliting large packet to:" + this.f7144b.f7138e + " len:" + i2);
            int i3 = i2;
            do {
                int i4 = i3;
                if (i4 > 256000) {
                    i4 = 256000;
                }
                write(bArr, i, i4);
                i += i4;
                i3 -= i4;
            } while (i3 > 0);
        } else {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
            allocateDirect.put(bArr, i, i2);
            allocateDirect.flip();
            synchronized (this.f7144b.f7134a) {
                try {
                    if (this.f7143a) {
                        this.f7143a = false;
                        AbstractC0916l.m963e("First packet to:" + this.f7144b.f7138e);
                    }
                    if (!this.f7144b.f7134a.f7101h.sendP2PPacket(this.f7144b.f7138e, allocateDirect, SteamNetworking.P2PSend.Reliable, 0)) {
                        AbstractC0916l.m963e("steam sendP2PPacket failed (size: " + i2 + " to:" + this.f7144b.f7138e + ")");
                    }
                } catch (SteamException e) {
                    throw new IOException(e);
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
