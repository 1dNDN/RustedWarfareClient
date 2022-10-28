package com.corrodinggames.rts.gameFramework.p045m.p046a;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p045m.C1030a;

/* renamed from: com.corrodinggames.rts.gameFramework.m.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/a/b.class */
public class C1032b extends AbstractC1031a {

    /* renamed from: a */
    AbstractC0197n f6626a;

    /* renamed from: b */
    C0448g f6627b;

    /* renamed from: d */
    public static C1032b m783d(C1030a c1030a) {
        C1032b c1032b = new C1032b();
        c1032b.f6626a = c1030a.m809a();
        if (c1032b.f6626a == null) {
            throw new C0179f("teamTagDetect requires a team set");
        }
        String m796b = c1030a.m796b("teamTag");
        if (m796b != null && !m796b.equals(VariableScope.nullOrMissingString)) {
            try {
                c1032b.f6627b = C0448g.m3566b(m796b);
                return c1032b;
            } catch (C0412bm e) {
                throw new C0179f(e.getMessage());
            }
        }
        throw new C0179f("teamTagDetect requires a teamTag set");
    }

    @Override // com.corrodinggames.rts.gameFramework.p045m.p046a.AbstractC1031a
    /* renamed from: b */
    public boolean mo782b(C1030a c1030a) {
        if (C0448g.m3573a(this.f6627b, this.f6626a.m4324R())) {
            return true;
        }
        return false;
    }
}
