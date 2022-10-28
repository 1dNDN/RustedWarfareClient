package com.corrodinggames.rts.gameFramework.utility;

import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/w.class */
public class C1115w extends OutputStream {

    /* renamed from: a */
    public byte[] f6928a;

    /* renamed from: b */
    protected int f6929b;

    public C1115w() {
        this.f6928a = new byte[32];
    }

    public C1115w(int i) {
        if (i >= 0) {
            this.f6928a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("size < 0");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    /* renamed from: a */
    private void m483a(int i) {
        if (this.f6929b + i <= this.f6928a.length) {
            return;
        }
        byte[] bArr = new byte[(this.f6929b + i) * 2];
        System.arraycopy(this.f6928a, 0, bArr, 0, this.f6929b);
        this.f6928a = bArr;
    }

    /* renamed from: a */
    public synchronized void m484a() {
        this.f6929b = 0;
    }

    /* renamed from: b */
    public int m481b() {
        return this.f6929b;
    }

    public String toString() {
        return new String(this.f6928a, 0, this.f6929b);
    }

    /* renamed from: a */
    public static void m482a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m482a(bArr.length, i, i2);
        if (i2 == 0) {
            return;
        }
        m483a(i2);
        System.arraycopy(bArr, i, this.f6928a, this.f6929b, i2);
        this.f6929b += i2;
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        if (this.f6929b == this.f6928a.length) {
            m483a(1);
        }
        byte[] bArr = this.f6928a;
        int i2 = this.f6929b;
        this.f6929b = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
