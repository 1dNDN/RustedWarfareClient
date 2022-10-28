package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.p039g.C0820a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ai.class */
public class C0790ai extends AbstractC0792ak {

    /* renamed from: a */
    private boolean f5087a;

    public C0790ai(float f, float f2, boolean z) {
        super(f, f2);
        this.f5087a = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: a */
    public boolean mo1886a(AbstractC0792ak abstractC0792ak) {
        return super.mo1886a(abstractC0792ak) && (abstractC0792ak instanceof C0790ai) && ((C0790ai) abstractC0792ak).f5087a == this.f5087a;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: b */
    public void mo1884b(AbstractC0792ak abstractC0792ak) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: b */
    protected long mo1885b() {
        return 20000L;
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.AbstractC0792ak
    /* renamed from: a */
    public String mo1887a() {
        if (this.f5092g == null) {
            if (this.f5087a) {
                this.f5092g = C0820a.m1681a("gui.log.baseDamaged", new Object[0]);
            } else {
                this.f5092g = C0820a.m1681a("gui.log.unitDamaged", new Object[0]);
            }
        }
        return this.f5092g;
    }
}
