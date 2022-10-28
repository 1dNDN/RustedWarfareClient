package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ah.class */
public class C0789ah extends AbstractC0792ak {

    /* renamed from: a */
    InterfaceC0303as f5085a;

    /* renamed from: b */
    int f5086b;

    public C0789ah(float f, float f2, InterfaceC0303as interfaceC0303as) {
        super(f, f2);
        this.f5085a = interfaceC0303as;
        this.f5086b = 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: a */
    public boolean mo1886a(AbstractC0792ak abstractC0792ak) {
        return super.mo1886a(abstractC0792ak) && (abstractC0792ak instanceof C0789ah) && ((C0789ah) abstractC0792ak).f5085a == this.f5085a;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: b */
    public void mo1884b(AbstractC0792ak abstractC0792ak) {
        this.f5088c = abstractC0792ak.f5088c;
        this.f5086b++;
        this.f5092g = null;
        this.f5093h = false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: a */
    public String mo1887a() {
        if (this.f5092g == null) {
            String str = "gui.log.unitCreated";
            if (this.f5085a.mo3401j()) {
                str = "gui.log.buildingConstructed";
            }
            this.f5092g = String.format(C0820a.m1681a(str, new Object[0]), this.f5085a.mo3411e(), Integer.valueOf(this.f5086b));
        }
        return this.f5092g;
    }
}
