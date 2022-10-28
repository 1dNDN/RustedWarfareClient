package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/f.class */
public class C1135f extends C1137h implements Iterable, Iterator {

    /* renamed from: f */
    private C1136g f7027f;

    @Override // com.corrodinggames.rts.java.audio.p050a.C1137h
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo352b() {
        super.mo352b();
    }

    public C1135f(C1134e c1134e) {
        super(c1134e);
        this.f7027f = new C1136g();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C1136g next() {
        if (this.f7030a) {
            if (this.f7034e) {
                int[] iArr = this.f7031b.f7013b;
                if (this.f7032c == -1) {
                    this.f7027f.f7028a = 0;
                    this.f7027f.f7029b = this.f7031b.f7017f;
                } else {
                    this.f7027f.f7028a = iArr[this.f7032c];
                    this.f7027f.f7029b = this.f7031b.f7014c[this.f7032c];
                }
                this.f7033d = this.f7032c;
                m351c();
                return this.f7027f;
            }
            throw new C1132c("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7034e) {
            return this.f7030a;
        }
        throw new C1132c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.p050a.C1137h, java.util.Iterator
    public void remove() {
        super.remove();
    }
}
