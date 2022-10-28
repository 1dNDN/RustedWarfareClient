package com.corrodinggames.rts.game.units.p028g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.g.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/b.class */
public enum EnumC0549b {
    movementSpeed { // from class: com.corrodinggames.rts.game.units.g.b.1
        @Override // com.corrodinggames.rts.game.units.p028g.EnumC0549b
        /* renamed from: a */
        AbstractC0547a mo3079a() {
            return new C0553d();
        }
    },
    specialActionBlock { // from class: com.corrodinggames.rts.game.units.g.b.2
        @Override // com.corrodinggames.rts.game.units.p028g.EnumC0549b
        /* renamed from: a */
        AbstractC0547a mo3079a() {
            return new C0554e();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract AbstractC0547a mo3079a();
}
