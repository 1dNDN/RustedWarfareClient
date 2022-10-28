package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.i.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/f.class */
public class C0871f extends C0859ar {

    /* renamed from: a */
    public String f5822a = VariableScope.nullOrMissingString;

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1313a(int i) {
        this.f5822a += "|" + i;
        super.mo1313a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1314a(float f) {
        this.f5822a += "|" + f;
        super.mo1314a(f);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1309a(short s) {
        this.f5822a += "|" + ((int) s);
        super.mo1309a(s);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1308a(boolean z) {
        this.f5822a += "|" + z;
        super.mo1308a(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1310a(String str, boolean z) {
        this.f5822a += "<" + str + ">";
        super.mo1310a(str, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1311a(String str) {
        this.f5822a += "</" + str + ">";
        super.mo1311a(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1312a(AbstractC0244am abstractC0244am) {
        this.f5822a += "|u:" + abstractC0244am;
        super.mo1312a(abstractC0244am);
    }
}
