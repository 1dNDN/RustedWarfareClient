package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ag.class */
public class C0642ag extends AbstractC0641af {

    /* renamed from: e */
    int f4157e;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: a */
    public boolean mo2649a(AbstractC0641af abstractC0641af) {
        if (!(abstractC0641af instanceof C0642ag) || this.f4157e != ((C0642ag) abstractC0641af).f4157e) {
            return false;
        }
        return super.mo2649a(abstractC0641af);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: a */
    public boolean mo2650a() {
        if (C0638ac.f4083b.mo17a(this.f4157e, this.f4154b, false)) {
            if (!this.f4155c) {
                this.f4155c = true;
                return true;
            }
            return false;
        } else if (C0638ac.f4083b.mo17a(this.f4157e, this.f4154b, true)) {
            this.f4155c = true;
            return false;
        } else if (this.f4155c) {
            this.f4155c = false;
            return false;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: b */
    public boolean mo2648b() {
        return C0638ac.f4083b.mo17a(this.f4157e, this.f4154b, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: c */
    public String mo2647c() {
        if (this.f4157e == 0) {
            return VariableScope.nullOrMissingString;
        }
        return C0638ac.f4083b.mo15c(this.f4157e, this.f4154b);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0641af
    /* renamed from: d */
    public boolean mo2646d() {
        if (this.f4157e == 0) {
            return true;
        }
        return false;
    }
}
