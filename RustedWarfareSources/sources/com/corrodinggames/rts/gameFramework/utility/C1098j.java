package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.gameFramework.Core;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/j.class */
public class C1098j extends InputStream {

    /* renamed from: a */
    InputStream f6882a;

    /* renamed from: b */
    String f6883b;

    /* renamed from: c */
    String f6884c;

    /* renamed from: d */
    boolean f6885d;

    /* renamed from: e */
    String f6886e;

    /* renamed from: a */
    public boolean m543a() {
        if (this.f6882a instanceof FileInputStream) {
            return true;
        }
        if (!Core.m1010au() && this.f6884c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public FileDescriptor m542b() {
        if (this.f6882a instanceof FileInputStream) {
            return ((FileInputStream) this.f6882a).getFD();
        }
        if (!Core.m1010au() && this.f6884c != null) {
            return C0090c.m5652a().mo6013d().m5998b(this.f6884c).getFileDescriptor();
        }
        throw new RuntimeException("AssetInputStream: unexpected stream for: " + this.f6883b);
    }

    private C1098j() {
    }

    public C1098j(InputStream inputStream, String str, String str2) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.f6882a = inputStream;
        this.f6883b = str;
        this.f6884c = str2;
        this.f6886e = Core.m1068T();
    }

    public C1098j(FileInputStream fileInputStream, String str) {
        if (fileInputStream == null) {
            throw new FileNotFoundException();
        }
        this.f6882a = fileInputStream;
        this.f6883b = str;
        this.f6886e = Core.m1068T();
    }

    public C1098j(InputStream inputStream, String str) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.f6882a = inputStream;
        this.f6883b = str;
        this.f6886e = Core.m1068T();
    }

    /* renamed from: c */
    public long m541c() {
        if (!Core.m1010au()) {
            return -1L;
        }
        if (this.f6883b == null) {
            return -2L;
        }
        return new File(this.f6883b).lastModified();
    }

    /* renamed from: d */
    public String m540d() {
        return this.f6883b;
    }

    public int available() {
        return this.f6882a.available();
    }

    public void close() {
        this.f6885d = true;
        this.f6882a.close();
    }

    protected void finalize() {
        if (!this.f6885d) {
            Core.m998b("AssetInputStream was finalized with being closed");
            Core.m998b(this.f6886e);
        }
    }

    public boolean equals(Object obj) {
        return this.f6882a.equals(obj);
    }

    public int hashCode() {
        return this.f6882a.hashCode();
    }

    public void mark(int i) {
        this.f6882a.mark(i);
    }

    public boolean markSupported() {
        return this.f6882a.markSupported();
    }

    public int read() {
        return this.f6882a.read();
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.f6882a.read(bArr, i, i2);
    }

    public int read(byte[] bArr) {
        return this.f6882a.read(bArr);
    }

    public void reset() {
        this.f6882a.reset();
    }

    public long skip(long j) {
        return this.f6882a.skip(j);
    }

    public String toString() {
        return this.f6882a.toString();
    }
}
