package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/ThreadedWrappingAudioInputStream.class */
public class ThreadedWrappingAudioInputStream extends InputStream {
    InputStream source;
    PipedInputStream bufferInputStream;
    PipedOutputStream bufferOutputStream;
    byte[] transferBuffer = new byte[1024];
    boolean isClosed = false;
    boolean sourceEnded = false;
    final int bufferSize = 60000;
    int totalBytesRead;

    public ThreadedWrappingAudioInputStream(InputStream inputStream) {
        this.source = inputStream;
        try {
            this.bufferOutputStream = new PipedOutputStream();
            this.bufferInputStream = new PipedInputStream(this.bufferOutputStream, 60000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void backgroundFillBuffer() {
        AbstractC0916l.m963e("at backgroundFillBuffer with: " + this.bufferInputStream.available());
        if (this.sourceEnded) {
            return;
        }
        while (!this.isClosed && 59999 - this.bufferInputStream.available() >= this.transferBuffer.length) {
            int read = this.source.read(this.transferBuffer);
            if (read == -1) {
                this.sourceEnded = true;
                this.bufferOutputStream.close();
                return;
            }
            this.totalBytesRead += read;
            this.bufferOutputStream.write(this.transferBuffer, 0, read);
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            if (this.bufferInputStream.available() == 0 && !this.sourceEnded) {
                AbstractC0916l.m963e("Exhausted stream");
            }
            return this.bufferInputStream.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            if (this.bufferInputStream.available() == 0 && !this.sourceEnded) {
                AbstractC0916l.m963e("Exhausted stream");
            }
            return this.bufferInputStream.read(bArr, i, i2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed = true;
    }
}
