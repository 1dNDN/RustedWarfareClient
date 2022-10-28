package com.corrodinggames.rts.gameFramework.utility;

import java.io.IOException;
import java.io.Reader;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/l.class */
public class C1100l extends Reader {

    /* renamed from: a */
    private Reader f6888a;

    /* renamed from: b */
    private char[] f6889b;

    /* renamed from: c */
    private int f6890c;

    /* renamed from: d */
    private int f6891d;

    /* renamed from: e */
    private int f6892e;

    /* renamed from: f */
    private int f6893f;

    public C1100l(Reader reader) {
        this(reader, 8192);
    }

    public C1100l(Reader reader, int i) {
        super(reader);
        this.f6892e = -1;
        this.f6893f = -1;
        if (i <= 0) {
            throw new IllegalArgumentException("size <= 0");
        }
        this.f6888a = reader;
        this.f6889b = new char[i];
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (!m536c()) {
                this.f6888a.close();
                this.f6889b = null;
            }
        }
    }

    /* renamed from: b */
    private int m537b() {
        if (this.f6892e == -1 || this.f6890c - this.f6892e >= this.f6893f) {
            int read = this.f6888a.read(this.f6889b, 0, this.f6889b.length);
            if (read > 0) {
                this.f6892e = -1;
                this.f6890c = 0;
                this.f6891d = read;
            }
            return read;
        }
        if (this.f6892e == 0 && this.f6893f > this.f6889b.length) {
            int length = this.f6889b.length * 2;
            if (length > this.f6893f) {
                length = this.f6893f;
            }
            char[] cArr = new char[length];
            System.arraycopy(this.f6889b, 0, cArr, 0, this.f6889b.length);
            this.f6889b = cArr;
        } else if (this.f6892e > 0) {
            System.arraycopy(this.f6889b, this.f6892e, this.f6889b, 0, this.f6889b.length - this.f6892e);
            this.f6890c -= this.f6892e;
            this.f6891d -= this.f6892e;
            this.f6892e = 0;
        }
        int read2 = this.f6888a.read(this.f6889b, this.f6890c, this.f6889b.length - this.f6890c);
        if (read2 != -1) {
            this.f6891d += read2;
        }
        return read2;
    }

    /* renamed from: c */
    private boolean m536c() {
        return this.f6889b == null;
    }

    @Override // java.io.Reader
    public void mark(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        synchronized (this.lock) {
            m535d();
            this.f6893f = i;
            this.f6892e = this.f6890c;
        }
    }

    /* renamed from: d */
    private void m535d() {
        if (m536c()) {
            throw new IOException("BufferedReader is closed");
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        synchronized (this.lock) {
            m535d();
            if (this.f6890c < this.f6891d || m537b() != -1) {
                char[] cArr = this.f6889b;
                int i = this.f6890c;
                this.f6890c = i + 1;
                return cArr[i];
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static void m538a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        int i3;
        synchronized (this.lock) {
            m535d();
            m538a(cArr.length, i, i2);
            int i4 = i2;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                int i5 = this.f6891d - this.f6890c;
                if (i5 > 0) {
                    int i6 = i5 >= i4 ? i4 : i5;
                    System.arraycopy(this.f6889b, this.f6890c, cArr, i, i6);
                    this.f6890c += i6;
                    i += i6;
                    i4 -= i6;
                }
                if (i4 == 0 || (i4 < i2 && !this.f6888a.ready())) {
                    break;
                } else if ((this.f6892e == -1 || this.f6890c - this.f6892e >= this.f6893f) && i4 >= this.f6889b.length) {
                    int read = this.f6888a.read(cArr, i, i4);
                    if (read > 0) {
                        i4 -= read;
                        this.f6892e = -1;
                    }
                } else if (m537b() == -1) {
                    break;
                }
            }
            int i7 = i2 - i4;
            i3 = (i7 > 0 || i7 == i2) ? i7 : -1;
        }
        return i3;
    }

    /* renamed from: a */
    public String m539a() {
        synchronized (this.lock) {
            m535d();
            if (this.f6890c == this.f6891d && m537b() == -1) {
                return null;
            }
            for (int i = this.f6890c; i < this.f6891d; i++) {
                char c = this.f6889b[i];
                if (c <= '\r') {
                    if (c == '\n') {
                        String str = new String(this.f6889b, this.f6890c, i - this.f6890c);
                        this.f6890c = i + 1;
                        return str;
                    } else if (c == '\r') {
                        String str2 = new String(this.f6889b, this.f6890c, i - this.f6890c);
                        this.f6890c = i + 1;
                        if ((this.f6890c < this.f6891d || m537b() != -1) && this.f6889b[this.f6890c] == '\n') {
                            this.f6890c++;
                        }
                        return str2;
                    }
                }
            }
            char c2 = 0;
            StringBuilder sb = new StringBuilder(80);
            sb.append(this.f6889b, this.f6890c, this.f6891d - this.f6890c);
            while (true) {
                this.f6890c = this.f6891d;
                if (c2 == '\n') {
                    return sb.toString();
                } else if (m537b() == -1) {
                    return (sb.length() > 0 || c2 != 0) ? sb.toString() : null;
                } else {
                    for (int i2 = this.f6890c; i2 < this.f6891d; i2++) {
                        char c3 = this.f6889b[i2];
                        if (c2 == 0) {
                            if (c3 == '\n' || c3 == '\r') {
                                c2 = c3;
                            }
                        } else if (c2 == '\r' && c3 == '\n') {
                            if (i2 > this.f6890c) {
                                sb.append(this.f6889b, this.f6890c, (i2 - this.f6890c) - 1);
                            }
                            this.f6890c = i2 + 1;
                            return sb.toString();
                        } else {
                            if (i2 > this.f6890c) {
                                sb.append(this.f6889b, this.f6890c, (i2 - this.f6890c) - 1);
                            }
                            this.f6890c = i2;
                            return sb.toString();
                        }
                    }
                    if (c2 == 0) {
                        sb.append(this.f6889b, this.f6890c, this.f6891d - this.f6890c);
                    } else {
                        sb.append(this.f6889b, this.f6890c, (this.f6891d - this.f6890c) - 1);
                    }
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    @Override // java.io.Reader
    public boolean ready() {
        boolean z;
        synchronized (this.lock) {
            m535d();
            z = this.f6891d - this.f6890c > 0 || this.f6888a.ready();
        }
        return z;
    }

    @Override // java.io.Reader
    public void reset() {
        synchronized (this.lock) {
            m535d();
            if (this.f6892e == -1) {
                throw new IOException("Invalid mark");
            }
            this.f6890c = this.f6892e;
        }
    }

    @Override // java.io.Reader
    public long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        synchronized (this.lock) {
            m535d();
            if (j < 1) {
                return 0L;
            }
            if (this.f6891d - this.f6890c >= j) {
                this.f6890c = (int) (this.f6890c + j);
                return j;
            }
            long j2 = this.f6891d - this.f6890c;
            this.f6890c = this.f6891d;
            while (j2 < j) {
                if (m537b() == -1) {
                    return j2;
                } else if (this.f6891d - this.f6890c >= j - j2) {
                    this.f6890c = (int) (this.f6890c + (j - j2));
                    return j;
                } else {
                    j2 += this.f6891d - this.f6890c;
                    this.f6890c = this.f6891d;
                }
            }
            return j;
        }
    }
}
