package com.corrodinggames.rts.gameFramework.p044l;

/* renamed from: com.corrodinggames.rts.gameFramework.l.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/af.class */
public class C0929af {

    /* renamed from: a */
    public String f6365a;

    /* renamed from: c */
    public boolean f6367c;

    /* renamed from: d */
    public boolean f6368d;

    /* renamed from: f */
    public C0934e f6370f;

    /* renamed from: g */
    public boolean f6371g;

    /* renamed from: b */
    public int f6366b = -1;

    /* renamed from: e */
    public float[] f6369e = new float[1];

    /* renamed from: a */
    public void m900a(float f) {
        if (this.f6369e.length != 1) {
            this.f6369e = new float[1];
        }
        if (this.f6369e[0] == f) {
            return;
        }
        this.f6369e[0] = f;
        this.f6367c = true;
    }

    /* renamed from: a */
    public void m899a(float f, float f2) {
        if (this.f6369e.length != 2) {
            this.f6369e = new float[2];
        }
        if (this.f6369e[0] == f && this.f6369e[1] == f2) {
            return;
        }
        this.f6369e[0] = f;
        this.f6369e[1] = f2;
        this.f6367c = true;
    }

    /* renamed from: a */
    public void m898a(float f, float f2, float f3, float f4) {
        if (this.f6369e.length != 4) {
            this.f6369e = new float[4];
        }
        if (this.f6369e[0] == f && this.f6369e[1] == f2 && this.f6369e[2] == f3 && this.f6369e[3] == f4) {
            return;
        }
        this.f6369e[0] = f;
        this.f6369e[1] = f2;
        this.f6369e[2] = f3;
        this.f6369e[3] = f4;
        this.f6367c = true;
    }

    /* renamed from: a */
    public void m897a(C0934e c0934e) {
        if (this.f6370f != c0934e) {
            this.f6370f = c0934e;
            this.f6367c = true;
        }
    }

    /* renamed from: b */
    public void m896b(C0934e c0934e) {
        this.f6371g = true;
        if (this.f6370f != c0934e) {
            this.f6370f = c0934e;
            this.f6367c = true;
        }
    }
}
