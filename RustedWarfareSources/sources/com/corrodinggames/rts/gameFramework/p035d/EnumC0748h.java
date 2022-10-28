package com.corrodinggames.rts.gameFramework.p035d;

/* renamed from: com.corrodinggames.rts.gameFramework.d.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/h.class */
public enum EnumC0748h {
    verylow,
    low,
    high,
    veryhigh,
    critical;

    /* renamed from: a */
    public boolean m2269a(EnumC0748h enumC0748h) {
        return enumC0748h == null || ordinal() < enumC0748h.ordinal();
    }
}
