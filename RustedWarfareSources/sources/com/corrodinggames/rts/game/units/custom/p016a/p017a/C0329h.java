package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/h.class */
public class C0329h extends AbstractC0321a {

    /* renamed from: a */
    VariableScope.CachedWriter f1973a;

    /* renamed from: b */
    boolean f1974b;

    /* renamed from: c */
    LogicBoolean f1975c;

    /* renamed from: d */
    LogicBoolean f1976d;

    /* renamed from: a */
    public static void m3978a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m663a(str, str2 + "swapCustomTarget1And2", (Boolean) false).booleanValue();
        LogicBoolean m649b = c1072ab.m649b(c0453l, str, str2 + "setCustomTarget1", null);
        LogicBoolean m649b2 = c1072ab.m649b(c0453l, str, str2 + "setCustomTarget2", null);
        VariableScope.MemoryWriter memoryWriter = null;
        String m644b = c1072ab.m644b(str, str2 + "setUnitMemory", (String) null);
        if (m644b != null) {
            memoryWriter = VariableScope.createMemoryWriter(m644b, c0453l, str, str2 + "setUnitMemory");
        }
        if (booleanValue || m649b != null || m649b2 != null || memoryWriter != null) {
            C0329h c0329h = new C0329h();
            c0329h.f1973a = memoryWriter;
            c0329h.f1974b = booleanValue;
            c0329h.f1975c = m649b;
            c0329h.f1976d = m649b2;
            c0339d.f2101ab.add(c0329h);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f1973a != null) {
            this.f1973a.writeToUnit(c0451j);
        }
        if (this.f1974b) {
            AbstractC0244am abstractC0244am2 = c0451j.f1580bt;
            c0451j.f1580bt = c0451j.f1581bu;
            c0451j.f1581bu = abstractC0244am2;
        }
        if (this.f1975c != null) {
            c0451j.f1580bt = VariableScope.getSafeUnitReferenceForStorage(this.f1975c.readUnit(c0451j));
        }
        if (this.f1976d != null) {
            c0451j.f1581bu = VariableScope.getSafeUnitReferenceForStorage(this.f1976d.readUnit(c0451j));
            return true;
        }
        return true;
    }
}
