package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.game.units.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/af.class */
public class C0237af {

    /* renamed from: a */
    public float f1528a;

    /* renamed from: b */
    public float f1529b;

    /* renamed from: a */
    public void m4470a(StreamWriter streamWriter) {
        streamWriter.mo1320a(this.f1528a);
        streamWriter.mo1320a(this.f1529b);
    }

    /* renamed from: a */
    public void m4469a(Reader reader) {
        this.f1528a = reader.m1285g();
        this.f1529b = reader.m1285g();
    }
}
