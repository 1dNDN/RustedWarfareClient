package com.corrodinggames.rts.java.p052c;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.corrodinggames.rts.java.c.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/l.class */
public class C1168l extends InputStream {

    /* renamed from: a */
    LinkedBlockingDeque f7139a = new LinkedBlockingDeque();

    /* renamed from: b */
    boolean f7140b = true;

    /* renamed from: c */
    byte[] f7141c = new byte[1];

    /* renamed from: d */
    final /* synthetic */ C1167k f7142d;

    public C1168l(C1167k c1167k) {
        this.f7142d = c1167k;
    }

    /* renamed from: a */
    public void m256a(byte[] bArr) {
        this.f7139a.add(ByteBuffer.wrap(bArr));
    }

    @Override // java.io.InputStream
    public int read() {
        do {
        } while (read(this.f7141c, 0, 1) <= 0);
        return this.f7141c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f7142d.f7135b) {
            throw new IOException("closed");
        }
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (!this.f7142d.f7135b) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f7139a.take();
                if (byteBuffer != null) {
                    if (this.f7140b) {
                        this.f7140b = false;
                        AbstractC0916l.m963e("First packet from:" + this.f7142d.f7138e);
                    }
                    if (byteBuffer.remaining() <= i5) {
                        i3 = byteBuffer.remaining();
                        byteBuffer.get(bArr, i6, i3);
                    } else {
                        i3 = i5;
                        byteBuffer.get(bArr, i6, i5);
                        this.f7139a.addFirst(byteBuffer);
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
