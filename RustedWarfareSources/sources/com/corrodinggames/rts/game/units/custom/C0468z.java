package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0894j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.custom.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/z.class */
public class C0468z {

    /* renamed from: a */
    public long f3360a = m3352a(true);

    /* renamed from: b */
    public String f3361b;

    public C0468z(String str) {
        this.f3361b = str;
    }

    /* renamed from: a */
    public long m3352a(boolean z) {
        if (AbstractC0916l.m995at()) {
            return 0L;
        }
        long m1229a = C0894j.m1229a(this.f3361b, z);
        if (z && m1229a == 0) {
            AbstractC0916l.m963e("Failed to watch: " + this.f3361b);
        }
        return m1229a;
    }
}
