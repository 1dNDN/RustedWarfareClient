package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a.class */
class C0320a implements Comparable {

    /* renamed from: a */
    public float f1907a;

    /* renamed from: b */
    public float f1908b;

    /* renamed from: c */
    public float f1909c;

    /* renamed from: d */
    public float f1910d;

    public C0320a(float f, float f2) {
        this.f1907a = f;
        this.f1908b = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C0320a c0320a) {
        if (this.f1907a == c0320a.f1907a) {
            return 0;
        }
        return this.f1907a > c0320a.f1907a ? 1 : -1;
    }
}
