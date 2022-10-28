package com.corrodinggames.rts.gameFramework.p042j;

import com.corrodinggames.rts.gameFramework.Core;

/* renamed from: com.corrodinggames.rts.gameFramework.j.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/p.class */
public final class C0911p {

    /* renamed from: a */
    public short f6074a;

    /* renamed from: b */
    public short f6075b;

    public C0911p() {
    }

    public C0911p(short s, short s2) {
        m1104a(s, s2);
    }

    /* renamed from: a */
    public final C0911p m1104a(short s, short s2) {
        this.f6074a = s;
        this.f6075b = s2;
        return this;
    }

    /* renamed from: a */
    public final C0911p m1105a(C0911p c0911p) {
        this.f6074a = c0911p.f6074a;
        this.f6075b = c0911p.f6075b;
        return this;
    }

    /* renamed from: a */
    public final C0911p m1113a(C0909n c0909n) {
        this.f6074a = c0909n.f6041a;
        this.f6075b = c0909n.f6042b;
        return this;
    }

    /* renamed from: a */
    public final int m1112a(RunnableC0910o runnableC0910o) {
        short s = this.f6074a;
        short s2 = this.f6075b;
        if (runnableC0910o.f6046b[(s * runnableC0910o.f6053h) + s2] == -1 || runnableC0910o.f6047c[(s * runnableC0910o.f6053h) + s2] == -1 || runnableC0910o.f6048d[(s * runnableC0910o.f6053h) + s2] == -1) {
            return -1;
        }
        return runnableC0910o.f6046b[(s * runnableC0910o.f6053h) + s2] + runnableC0910o.f6047c[(s * runnableC0910o.f6053h) + s2] + (runnableC0910o.f6048d[(s * runnableC0910o.f6053h) + s2] * 10);
    }

    /* renamed from: a */
    public final int m1111a(RunnableC0910o runnableC0910o, byte b) {
        return runnableC0910o.f6057l[b][(this.f6074a * runnableC0910o.f6053h) + this.f6075b];
    }

    /* renamed from: a */
    public final void m1108a(RunnableC0910o runnableC0910o, byte b, int i) {
        runnableC0910o.f6057l[b][(this.f6074a * runnableC0910o.f6053h) + this.f6075b] = i;
    }

    /* renamed from: a */
    public final void m1106a(RunnableC0910o runnableC0910o, byte b, boolean z) {
        if (z) {
            byte[] bArr = runnableC0910o.f6058m[b];
            int i = (this.f6074a * runnableC0910o.f6053h) + this.f6075b;
            bArr[i] = (byte) (bArr[i] | 16);
            return;
        }
        byte[] bArr2 = runnableC0910o.f6058m[b];
        int i2 = (this.f6074a * runnableC0910o.f6053h) + this.f6075b;
        bArr2[i2] = (byte) (bArr2[i2] & (-17));
    }

    /* renamed from: b */
    public final boolean m1103b(RunnableC0910o runnableC0910o, byte b) {
        return runnableC0910o.f6057l[b][(this.f6074a * runnableC0910o.f6053h) + this.f6075b] >= runnableC0910o.f6054i && (runnableC0910o.f6058m[b][(this.f6074a * runnableC0910o.f6053h) + this.f6075b] & 16) != 0;
    }

    /* renamed from: c */
    public final byte m1101c(RunnableC0910o runnableC0910o, byte b) {
        return (byte) (runnableC0910o.f6058m[b][(this.f6074a * runnableC0910o.f6053h) + this.f6075b] & 7);
    }

    /* renamed from: d */
    public final boolean m1100d(RunnableC0910o runnableC0910o, byte b) {
        return (runnableC0910o.f6058m[b][(this.f6074a * runnableC0910o.f6053h) + this.f6075b] & 8) != 0;
    }

    /* renamed from: b */
    public final void m1102b(RunnableC0910o runnableC0910o, byte b, boolean z) {
        if (z) {
            byte[] bArr = runnableC0910o.f6058m[b];
            int i = (this.f6074a * runnableC0910o.f6053h) + this.f6075b;
            bArr[i] = (byte) (bArr[i] | 8);
            return;
        }
        byte[] bArr2 = runnableC0910o.f6058m[b];
        int i2 = (this.f6074a * runnableC0910o.f6053h) + this.f6075b;
        bArr2[i2] = (byte) (bArr2[i2] & (-9));
    }

    /* renamed from: a */
    public final void m1110a(RunnableC0910o runnableC0910o, byte b, byte b2) {
        byte[] bArr = runnableC0910o.f6058m[b];
        int i = (this.f6074a * runnableC0910o.f6053h) + this.f6075b;
        bArr[i] = (byte) (bArr[i] & (-16));
        byte[] bArr2 = runnableC0910o.f6058m[b];
        int i2 = (this.f6074a * runnableC0910o.f6053h) + this.f6075b;
        bArr2[i2] = (byte) (bArr2[i2] | (b2 & 15));
    }

    /* renamed from: a */
    public final void m1109a(RunnableC0910o runnableC0910o, byte b, float f) {
        int i = (int) (((f / 360.0f) * 8.0f) + 0.5f);
        if (i < 0) {
            i += 8;
        }
        if (i > 7) {
            i -= 8;
        }
        if (i < 0) {
            i += 8;
        }
        if (i > 7) {
            i -= 8;
        }
        if (i < 0 || i > 7) {
            Core.LogDebug2("setCurrentDirectionFromAngle: dir:" + i + " direction:" + f);
            i = 0;
        }
        m1110a(runnableC0910o, b, (byte) i);
    }

    /* renamed from: e */
    public final boolean m1099e(RunnableC0910o runnableC0910o, byte b) {
        if (runnableC0910o.f6057l[b][(this.f6074a * runnableC0910o.f6053h) + this.f6075b] >= runnableC0910o.f6054i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C0911p m1098f(RunnableC0910o runnableC0910o, byte b) {
        C0911p c0911p = new C0911p();
        if (m1107a(runnableC0910o, b, c0911p)) {
            return c0911p;
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m1107a(RunnableC0910o runnableC0910o, byte b, C0911p c0911p) {
        if (!m1099e(runnableC0910o, b)) {
            c0911p.m1104a((short) -1, (short) -1);
            return false;
        }
        byte m1101c = m1101c(runnableC0910o, b);
        if (m1100d(runnableC0910o, b)) {
            c0911p.m1104a((short) -1, (short) -1);
            return false;
        }
        int i = 0;
        int i2 = 0;
        if (m1101c == 0) {
            i = 0 + 1;
        }
        if (m1101c == 1) {
            i++;
            i2 = 0 + 1;
        }
        if (m1101c == 2) {
            i2++;
        }
        if (m1101c == 3) {
            i2++;
            i--;
        }
        if (m1101c == 4) {
            i--;
        }
        if (m1101c == 5) {
            i--;
            i2--;
        }
        if (m1101c == 6) {
            i2--;
        }
        if (m1101c == 7) {
            i2--;
            i++;
        }
        c0911p.m1104a((short) (this.f6074a - i), (short) (this.f6075b - i2));
        return true;
    }
}
