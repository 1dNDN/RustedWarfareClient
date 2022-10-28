package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;

/* renamed from: com.corrodinggames.rts.game.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/d.class */
public class C0177d {

    /* renamed from: a */
    public InterfaceC1027y f871a;

    /* renamed from: b */
    int f872b;

    /* renamed from: c */
    int f873c;

    /* renamed from: d */
    public C0934e f874d;

    /* renamed from: e */
    public C0934e f875e;

    /* renamed from: f */
    public InterfaceC1027y f876f;

    /* renamed from: g */
    public float f877g;

    /* renamed from: i */
    public int f879i;

    /* renamed from: j */
    public int f880j;

    /* renamed from: s */
    final /* synthetic */ C0176c f889s;

    /* renamed from: h */
    public Paint f878h = new C0930ag();

    /* renamed from: k */
    public boolean f881k = true;

    /* renamed from: l */
    public boolean f882l = true;

    /* renamed from: m */
    public int f883m = 0;

    /* renamed from: n */
    public boolean f884n = false;

    /* renamed from: o */
    public final Rect f885o = new Rect();

    /* renamed from: p */
    public final Rect f886p = new Rect();

    /* renamed from: q */
    public final RectF f887q = new RectF();

    /* renamed from: r */
    public final Rect f888r = new Rect();

    /* renamed from: a */
    public void m4447a() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        this.f875e = m1071A.f6161bO.mo218a(this.f874d.f6404p, this.f874d.f6405q, true);
        if (this.f875e != null && !this.f875e.mo394A()) {
            this.f875e.m881a("fadeOutBitmap");
        }
        if (this.f875e == null || this.f875e.mo394A()) {
            throw new OutOfMemoryError("Failed to create fade out bitmap");
        }
        this.f875e.m880b(true);
        this.f876f = m1071A.f6161bO.mo160b(this.f875e);
    }

    /* renamed from: b */
    public Rect m4446b() {
        this.f888r.m5035a(m4445c(), m4444d(), m4445c() + this.f889s.f863i, m4444d() + this.f889s.f863i);
        return this.f888r;
    }

    public C0177d(C0176c c0176c, int i, int i2) {
        this.f889s = c0176c;
        this.f879i = i;
        this.f880j = i2;
    }

    /* renamed from: c */
    public int m4445c() {
        return this.f889s.f860f + (this.f879i * this.f889s.f865k);
    }

    /* renamed from: d */
    public int m4444d() {
        return this.f889s.f861g + (this.f880j * this.f889s.f865k);
    }
}
