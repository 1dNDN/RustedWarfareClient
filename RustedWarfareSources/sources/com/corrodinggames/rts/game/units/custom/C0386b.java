package com.corrodinggames.rts.game.units.custom;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.custom.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b.class */
public class C0386b extends C0320a {

    /* renamed from: e */
    public C0467y f2323e;

    /* renamed from: f */
    public float f2324f;

    /* renamed from: g */
    public float f2325g;

    /* renamed from: h */
    public boolean f2326h;

    public C0386b(float f, float f2) {
        super(f, f2);
    }

    /* renamed from: a */
    public void m3827a(C0453l c0453l, String str, String str2) {
        try {
            if (str.equalsIgnoreCase("x")) {
                this.f2324f = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("y")) {
                this.f2325g = Float.parseFloat(str2);
            } else if (str.equalsIgnoreCase("name")) {
                this.f2323e = c0453l.m3432a(str2, (C0467y) null);
            } else {
                throw new C0412bm("Unknown event key:" + str + " on animation");
            }
        } catch (NumberFormatException e) {
            throw new C0412bm("Failed to parse float:" + str2);
        }
    }

    public void finalize() {
        this.f2326h = true;
        if (this.f2323e == null) {
            throw new C0412bm("Animation effect missing key 'name'");
        }
    }

    /* renamed from: a */
    public void m3828a(C0451j c0451j) {
        if (this.f2323e != null) {
            float f = c0451j.f6958el;
            float f2 = c0451j.f6959em;
            this.f2323e.m3356a(f + this.f2324f, f2 + this.f2325g, c0451j.f6960en, c0451j.f1618ce, c0451j);
        }
    }
}
