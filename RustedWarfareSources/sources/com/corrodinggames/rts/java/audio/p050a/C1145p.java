package com.corrodinggames.rts.java.audio.p050a;

import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/p.class */
public class C1145p extends AbstractC1147r {

    /* renamed from: a */
    C1146q f7073a;

    @Override // com.corrodinggames.rts.java.audio.p050a.AbstractC1147r, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // com.corrodinggames.rts.java.audio.p050a.AbstractC1147r
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo308c() {
        super.mo308c();
    }

    public C1145p(C1144o c1144o) {
        super(c1144o);
        this.f7073a = new C1146q();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C1146q next() {
        if (this.f7076b) {
            if (this.f7080f) {
                Object[] objArr = this.f7077c.f7061b;
                this.f7073a.f7074a = objArr[this.f7078d];
                this.f7073a.f7075b = this.f7077c.f7062c[this.f7078d];
                this.f7079e = this.f7078d;
                m307d();
                return this.f7073a;
            }
            throw new C1132c("#iterator() cannot be used nested.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f7080f) {
            return this.f7076b;
        }
        throw new C1132c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    /* renamed from: b */
    public C1145p iterator() {
        return this;
    }
}
