package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.EnumC0347ae;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/i.class */
public class C0330i extends AbstractC0321a {

    /* renamed from: a */
    VariableScope.MemoryWriter f1977a;

    /* renamed from: b */
    LogicBoolean f1978b;

    /* renamed from: c */
    C0449h f1979c;

    /* renamed from: a */
    public static void m3977a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        LogicBoolean m649b = c1072ab.m649b(c0453l, str, str2 + "sendMessageTo", null);
        VariableScope.MemoryWriter memoryWriter = null;
        String m644b = c1072ab.m644b(str, str2 + "sendMessageWithData", (String) null);
        if (m644b != null) {
            memoryWriter = VariableScope.createGenericKeyValueWriter(m644b, c0453l, str, str2 + "sendMessageWithData");
        }
        C0449h m683a = c1072ab.m683a(c0453l, str, str2 + "sendMessageWithTags", (C0449h) null);
        if (m649b != null) {
            C0330i c0330i = new C0330i();
            c0330i.f1978b = m649b;
            c0330i.f1977a = memoryWriter;
            c0330i.f1979c = m683a;
            c0339d.f2101ab.add(c0330i);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        AbstractC0244am readUnit;
        if (this.f1978b != null && (readUnit = this.f1978b.readUnit(c0451j)) != null) {
            VariableScope variableScope = null;
            if (this.f1977a != null) {
                variableScope = new VariableScope();
                this.f1977a.writeToMemory(variableScope, c0451j);
            }
            readUnit.mo3538a(EnumC0347ae.newMessage, c0451j, this.f1979c, variableScope);
            return true;
        }
        return true;
    }
}
