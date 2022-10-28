package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.game.units.g.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/a.class */
public abstract class AbstractC0547a {

    /* renamed from: a */
    int f3755a;

    /* renamed from: b */
    public abstract EnumC0549b mo3228b();

    public AbstractC0547a() {
    }

    public AbstractC0547a(int i) {
        this.f3755a = i;
    }

    /* renamed from: a */
    public int m3237a() {
        return this.f3755a;
    }

    /* renamed from: a */
    public void m3236a(AbstractC0623y abstractC0623y, float f) {
    }

    /* renamed from: a */
    public void mo3230a(AbstractC0623y abstractC0623y, StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f3755a);
    }

    /* renamed from: a */
    public void mo3229a(AbstractC0623y abstractC0623y, Reader reader) {
        this.f3755a = reader.ReadInt();
    }
}
