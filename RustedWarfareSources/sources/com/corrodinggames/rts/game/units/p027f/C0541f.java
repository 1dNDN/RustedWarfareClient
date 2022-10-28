package com.corrodinggames.rts.game.units.p027f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.f.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/f.class */
public class C0541f implements Iterable, Iterator {

    /* renamed from: a */
    int f3733a;

    /* renamed from: b */
    AbstractC0244am[] f3734b;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3733a > 0;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public AbstractC0244am next() {
        this.f3733a--;
        return this.f3734b[this.f3733a];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new RuntimeException("Not supported");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    /* renamed from: a */
    public void m3087a(C1112u c1112u) {
        this.f3734b = c1112u.m498a();
        this.f3733a = c1112u.f6922b;
    }
}
