package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.Core;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.custom.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/z.class */
public class C0468z {

    /* renamed from: a */
    public long f3360a = m3633a(true);

    /* renamed from: b */
    public String f3361b;

    public C0468z(String str) {
        this.f3361b = str;
    }

    /* renamed from: a */
    public long m3633a(boolean z) {
        if (Core.m1011at()) {
            return 0L;
        }
        long m1250a = C0894j.m1250a(this.f3361b, z);
        if (z && m1250a == 0) {
            Core.LogDebug2("Failed to watch: " + this.f3361b);
        }
        return m1250a;
    }
}
