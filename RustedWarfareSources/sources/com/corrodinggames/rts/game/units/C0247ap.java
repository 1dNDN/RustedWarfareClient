package com.corrodinggames.rts.game.units;

/* renamed from: com.corrodinggames.rts.game.units.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ap.class */
public final class C0247ap {

    /* renamed from: a */
    public float f1712a;

    /* renamed from: b */
    public float f1713b;

    /* renamed from: c */
    public float f1714c;

    /* renamed from: d */
    public float f1715d;

    /* renamed from: e */
    public float f1716e;

    /* renamed from: f */
    public float f1717f;

    /* renamed from: g */
    public boolean f1718g;

    /* renamed from: h */
    public float f1719h;

    /* renamed from: i */
    public float f1720i;

    /* renamed from: j */
    public AbstractC0244am f1721j;

    /* renamed from: k */
    public float f1722k;

    /* renamed from: l */
    public float f1723l;

    /* renamed from: m */
    public boolean f1724m;

    /* renamed from: a */
    public void m4066a(float f) {
        this.f1712a = f;
        this.f1713b = this.f1712a;
        this.f1714c = 0.0f;
        this.f1715d = 0.0f;
        this.f1716e = 0.0f;
        this.f1717f = 0.0f;
        this.f1718g = false;
        this.f1719h = 0.0f;
        this.f1720i = 0.0f;
        this.f1721j = null;
        this.f1722k = 0.0f;
        this.f1723l = 0.0f;
        this.f1724m = false;
    }

    /* renamed from: a */
    public final void m4065a(int i) {
        if (this.f1715d < i && this.f1715d >= 0.0f) {
            this.f1715d = i;
        }
    }

    /* renamed from: b */
    public final void m4063b(int i) {
        if (this.f1715d > (-i)) {
            this.f1715d = -i;
        }
    }

    /* renamed from: a */
    public final boolean m4067a() {
        return this.f1715d == 0.0f;
    }

    /* renamed from: b */
    public final boolean m4064b() {
        return this.f1715d < 0.0f;
    }
}
