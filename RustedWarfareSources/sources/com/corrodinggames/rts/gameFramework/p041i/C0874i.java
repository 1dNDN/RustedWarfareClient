package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.corrodinggames.rts.gameFramework.i.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/i.class */
public class C0874i extends InputStream {

    /* renamed from: a */
    LinkedBlockingDeque f5855a = new LinkedBlockingDeque();

    /* renamed from: b */
    boolean f5856b = true;

    /* renamed from: c */
    byte[] f5857c = new byte[1];

    /* renamed from: d */
    final /* synthetic */ C0873h f5858d;

    public C0874i(C0873h c0873h) {
        this.f5858d = c0873h;
    }

    /* renamed from: a */
    public void m1307a(byte[] bArr) {
        this.f5855a.add(ByteBuffer.wrap(bArr));
    }

    public int read() {
        do {
        } while (read(this.f5857c, 0, 1) <= 0);
        return this.f5857c[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f5858d.f5852c) {
            throw new IOException("closed");
        }
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (!this.f5858d.f5852c) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f5855a.take();
                if (byteBuffer != null) {
                    if (this.f5856b) {
                        this.f5856b = false;
                        LoggerMaybe.LogDebug2("First packet from forwarded:" + this.f5858d.f5851b);
                    }
                    if (byteBuffer.remaining() <= i5) {
                        i3 = byteBuffer.remaining();
                        byteBuffer.get(bArr, i6, i3);
                    } else {
                        i3 = i5;
                        byteBuffer.get(bArr, i6, i5);
                        this.f5855a.addFirst(byteBuffer);
                    }
                    i4 += i3;
                    i5 -= i3;
                    i6 += i3;
                    if (i5 < 0) {
                        throw new IOException("bytesNeeded<0:" + i5);
                    }
                    if (i5 == 0) {
                        return i4;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return i4;
            }
        }
        throw new IOException("Closed");
    }
}
