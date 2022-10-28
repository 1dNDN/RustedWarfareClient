package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.C0206a;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/b.class */
public class C0337b extends C0206a {

    /* renamed from: b */
    public C0206a f2033b;

    /* renamed from: c */
    public C0424b f2034c;

    /* renamed from: d */
    public C0424b f2035d;

    public C0337b(C0206a c0206a) {
        this.f2033b = c0206a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: b */
    public boolean mo3962b(AbstractC0244am abstractC0244am) {
        return this.f2033b.mo3962b(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: c */
    public String mo3961c(AbstractC0244am abstractC0244am) {
        return this.f2033b.mo3961c(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public boolean mo3966a(AbstractC0244am abstractC0244am, boolean z) {
        return this.f2033b.mo3966a(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: d */
    public boolean mo3960d(AbstractC0244am abstractC0244am) {
        return this.f2033b.mo3960d(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public C0424b mo3970a() {
        if (this.f2034c != null) {
            return this.f2034c;
        }
        return this.f2033b.mo3970a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: b */
    public C0424b mo3963b() {
        if (this.f2035d != null) {
            return this.f2035d;
        }
        return this.f2033b.mo3963b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public void mo3967a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        this.f2033b.mo3967a(abstractC0244am, abstractC0244am2);
    }
}
