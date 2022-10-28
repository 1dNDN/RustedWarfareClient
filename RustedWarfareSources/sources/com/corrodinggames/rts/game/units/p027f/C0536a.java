package com.corrodinggames.rts.game.units.p027f;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/a.class */
public class C0536a {

    /* renamed from: a */
    public final C0537b f3704a = new C0537b();

    /* renamed from: b */
    public final C0537b[] f3705b = new C0537b[AbstractC0197n.f1310e];

    /* renamed from: c */
    public final C0537b f3706c = new C0537b();

    /* renamed from: d */
    public final C0537b f3707d = new C0537b();

    /* renamed from: e */
    float f3708e;

    public C0536a() {
        for (int i = 0; i < this.f3705b.length; i++) {
            this.f3705b[i] = new C0537b();
        }
    }

    /* renamed from: a */
    public void m3107a(AbstractC0244am abstractC0244am) {
        this.f3704a.m3104a(abstractC0244am);
        int i = abstractC0244am.f1677dl;
        if (i >= 0) {
            this.f3705b[i].m3104a(abstractC0244am);
        } else if (i == -1) {
            this.f3707d.m3104a(abstractC0244am);
        } else if (i == -2) {
            this.f3706c.m3104a(abstractC0244am);
        }
        if (abstractC0244am.f1621ch > this.f3708e) {
            this.f3708e = abstractC0244am.f1621ch;
        }
    }

    /* renamed from: b */
    public void m3106b(AbstractC0244am abstractC0244am) {
        this.f3704a.m3103b(abstractC0244am);
        int i = abstractC0244am.f1677dl;
        if (i >= 0) {
            this.f3705b[i].m3103b(abstractC0244am);
        } else if (i == -1) {
            this.f3707d.m3103b(abstractC0244am);
        } else if (i == -2) {
            this.f3706c.m3103b(abstractC0244am);
        }
        if (this.f3704a.f3710b == 0) {
            this.f3708e = 0.0f;
        }
    }
}
