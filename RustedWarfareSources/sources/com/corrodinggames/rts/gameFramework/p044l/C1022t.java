package com.corrodinggames.rts.gameFramework.p044l;

/* renamed from: com.corrodinggames.rts.gameFramework.l.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/t.class */
public final class C1022t {

    /* renamed from: a */
    public int f6557a;

    /* renamed from: b */
    public C1021s[] f6558b;

    public C1022t(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.f6558b = i == 0 ? new C1021s[0] : new C1021s[i];
    }

    /* renamed from: a */
    public final boolean m819a(C1021s c1021s) {
        C1021s[] c1021sArr = this.f6558b;
        int i = this.f6557a;
        if (i == c1021sArr.length) {
            C1021s[] c1021sArr2 = new C1021s[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(c1021sArr, 0, c1021sArr2, 0, i);
            c1021sArr = c1021sArr2;
            this.f6558b = c1021sArr2;
        }
        c1021sArr[i] = c1021s;
        this.f6557a = i + 1;
        return true;
    }
}
