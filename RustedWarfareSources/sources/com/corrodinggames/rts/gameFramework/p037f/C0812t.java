package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0622x;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.gameFramework.f.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/t.class */
public class C0812t extends AbstractC0622x {

    /* renamed from: a */
    C0439f f5373a;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.fogRevealer;
    }

    public C0812t() {
        super(true);
        this.f5373a = new C0439f();
        this.f1609bV = AbstractC0197n.f1314i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0622x, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        AbstractC0916l.m1030a("PlaceholderUnit was updated");
        m4088ch();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: t */
    public boolean mo1707t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0622x, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public boolean mo1706u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dd */
    public C0439f mo1709dd() {
        return this.f5373a;
    }

    /* renamed from: a */
    public void m1711a(C0439f c0439f) {
        this.f5373a = c0439f;
    }
}
