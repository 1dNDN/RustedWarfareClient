package com.corrodinggames.rts.gameFramework.p031b;

/* renamed from: com.corrodinggames.rts.gameFramework.b.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/w.class */
public class C0712w {

    /* renamed from: a */
    private int[] f4444a;

    /* renamed from: b */
    private int f4445b;

    /* renamed from: a */
    public void m2432a(int i) {
        if (this.f4444a.length == this.f4445b) {
            int[] iArr = new int[this.f4445b + this.f4445b];
            System.arraycopy(this.f4444a, 0, iArr, 0, this.f4445b);
            this.f4444a = iArr;
        }
        int[] iArr2 = this.f4444a;
        int i2 = this.f4445b;
        this.f4445b = i2 + 1;
        iArr2[i2] = i;
    }
}
