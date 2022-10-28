package com.corrodinggames.rts.game.units.custom.p023f;

import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/d.class */
public class C0446d {

    /* renamed from: a */
    HashMap f2833a = new HashMap();

    /* renamed from: a */
    public void m3575a(String str, String str2) {
        this.f2833a.put(str, str2);
    }

    /* renamed from: a */
    public String m3576a(String str) {
        return (String) this.f2833a.get(str);
    }

    /* renamed from: a */
    public void m3577a() {
        this.f2833a.clear();
    }
}
