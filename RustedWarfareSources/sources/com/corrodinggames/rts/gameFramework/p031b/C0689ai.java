package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ai.class */
class C0689ai implements Cloneable {

    /* renamed from: a */
    public boolean f4348a;

    /* renamed from: b */
    public Bitmap.Config f4349b;

    /* renamed from: c */
    public int f4350c;

    private C0689ai() {
    }

    public int hashCode() {
        int hashCode = this.f4349b.hashCode() ^ this.f4350c;
        return this.f4348a ? hashCode : -hashCode;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0689ai) {
            C0689ai c0689ai = (C0689ai) obj;
            return this.f4348a == c0689ai.f4348a && this.f4349b == c0689ai.f4349b && this.f4350c == c0689ai.f4350c;
        }
        return false;
    }

    /* renamed from: a */
    public C0689ai clone() {
        try {
            return (C0689ai) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
