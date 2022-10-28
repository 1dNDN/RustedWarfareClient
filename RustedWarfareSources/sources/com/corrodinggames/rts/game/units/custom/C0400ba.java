package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.ba */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ba.class */
public class C0400ba {

    /* renamed from: a */
    public String f2486a;

    /* renamed from: b */
    public String f2487b;

    public C0400ba() {
    }

    public C0400ba(String str, String str2) {
        this.f2486a = str;
        this.f2487b = str2;
    }

    /* renamed from: a */
    public void m3794a(String str, String str2) {
        if (this.f2487b != null) {
            this.f2487b = this.f2487b.replaceAll(str, str2);
        }
    }
}
