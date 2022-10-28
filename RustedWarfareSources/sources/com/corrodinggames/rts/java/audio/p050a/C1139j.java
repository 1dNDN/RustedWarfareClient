package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/j.class */
public class C1139j extends C1141l implements Iterable, Iterator {

    /* renamed from: f */
    private C1140k f7050f;

    @Override // com.corrodinggames.rts.java.audio.p050a.C1141l
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo333b() {
        super.mo333b();
    }

    public C1139j(C1138i c1138i) {
        super(c1138i);
        this.f7050f = new C1140k();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C1140k next() {
        if (this.f7053a) {
            if (this.f7057e) {
                long[] jArr = this.f7054b.f7036b;
                if (this.f7055c == -1) {
                    this.f7050f.f7051a = 0L;
                    this.f7050f.f7052b = this.f7054b.f7040f;
                } else {
                    this.f7050f.f7051a = jArr[this.f7055c];
                    this.f7050f.f7052b = this.f7054b.f7037c[this.f7055c];
                }
                this.f7056d = this.f7055c;
                m332c();
                return this.f7050f;
            }
            throw new C1132c("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7057e) {
            return this.f7053a;
        }
        throw new C1132c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.p050a.C1141l, java.util.Iterator
    public void remove() {
        super.remove();
    }
}
