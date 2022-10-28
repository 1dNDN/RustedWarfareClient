package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0467y;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;

/* renamed from: com.corrodinggames.rts.game.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/h.class */
public class C0190h {

    /* renamed from: a */
    public C0449h f1210a;

    /* renamed from: b */
    public C0449h f1211b;

    /* renamed from: c */
    public float f1212c;

    /* renamed from: d */
    public float f1213d;

    /* renamed from: e */
    public C0424b f1214e;

    /* renamed from: f */
    public C0424b f1215f;

    /* renamed from: g */
    public C0467y f1216g;

    /* renamed from: a */
    public boolean m4380a(AbstractC0244am abstractC0244am) {
        if (this.f1211b != null && C0448g.m3572a(this.f1211b, abstractC0244am.mo3487dc())) {
            return false;
        }
        if (this.f1210a != null && !C0448g.m3572a(this.f1210a, abstractC0244am.mo3487dc())) {
            return false;
        }
        return true;
    }
}
