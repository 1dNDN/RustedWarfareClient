package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.g.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/e.class */
public class C0554e extends AbstractC0547a {

    /* renamed from: b */
    int f3760b;

    /* renamed from: c */
    C0208c f3761c;

    public C0554e() {
        this.f3761c = C0208c.f1428a;
    }

    public C0554e(int i, C0208c c0208c) {
        super(i);
        this.f3761c = C0208c.f1428a;
        this.f3761c = c0208c;
        this.f3760b = LoggerMaybe.m1072A().f6102by;
    }

    /* renamed from: b */
    public EnumC0549b mo3133b() {
        return EnumC0549b.f3757b;
    }

    /* renamed from: a */
    public boolean m3132a(C0208c c0208c) {
        return this.f3761c == C0208c.f1428a || this.f3761c == c0208c;
    }

    /* renamed from: c */
    public float m3125c() {
        int i = this.f3755a - this.f3760b;
        if (i <= 0) {
            return 1.0f;
        }
        return (this.f3755a - LoggerMaybe.m1072A().f6102by) / i;
    }

    /* renamed from: a */
    public static void m3130a(AbstractC0623y abstractC0623y, C0208c c0208c, int i) {
        C0552c.m3138a(abstractC0623y, new C0554e(LoggerMaybe.m1072A().f6102by + i, c0208c));
    }

    /* renamed from: a */
    public static int m3131a(AbstractC0244am abstractC0244am, C0208c c0208c) {
        C0554e m3126b;
        if (!(abstractC0244am instanceof AbstractC0623y) || ((AbstractC0623y) abstractC0244am).f3994bo == null || (m3126b = m3126b(abstractC0244am, c0208c)) == null) {
            return 0;
        }
        return m3126b.m3123d();
    }

    /* renamed from: d */
    public int m3123d() {
        return this.f3755a - LoggerMaybe.m1072A().f6102by;
    }

    /* renamed from: b */
    public static C0554e m3126b(AbstractC0244am abstractC0244am, C0208c c0208c) {
        C1101m c1101m;
        if (!(abstractC0244am instanceof AbstractC0623y) || (c1101m = ((AbstractC0623y) abstractC0244am).f3994bo) == null) {
            return null;
        }
        int i = LoggerMaybe.m1072A().f6102by;
        C0554e c0554e = null;
        Object[] m534a = c1101m.m534a();
        for (int i2 = c1101m.f6894a - 1; i2 >= 0; i2--) {
            AbstractC0547a abstractC0547a = (AbstractC0547a) m534a[i2];
            if (abstractC0547a instanceof C0554e) {
                C0554e c0554e2 = (C0554e) abstractC0547a;
                if (c0554e2.m3132a(c0208c) && c0554e2.f3755a > i) {
                    i = c0554e2.f3755a;
                    c0554e = c0554e2;
                }
            }
        }
        if (c0554e == null) {
            return null;
        }
        return c0554e;
    }

    /* renamed from: a */
    public void mo3135a(AbstractC0623y abstractC0623y, StreamWriter streamWriter) {
        C0208c.m4535a(streamWriter, this.f3761c);
        streamWriter.WriteInteger(this.f3760b);
        super.mo3135a(abstractC0623y, streamWriter);
    }

    /* renamed from: a */
    public void mo3134a(AbstractC0623y abstractC0623y, Reader reader) {
        this.f3761c = C0208c.m4534a(reader);
        if (this.f3761c == null) {
            this.f3761c = C0208c.f1428a;
        }
        this.f3760b = reader.ReadInt();
        super.mo3134a(abstractC0623y, reader);
    }

    /* renamed from: c */
    public static void m3124c(AbstractC0244am abstractC0244am, C0208c c0208c) {
        C1101m c1101m;
        if (!(abstractC0244am instanceof AbstractC0623y) || (c1101m = ((AbstractC0623y) abstractC0244am).f3994bo) == null) {
            return;
        }
        int i = LoggerMaybe.m1072A().f6102by;
        Object[] m534a = c1101m.m534a();
        for (int i2 = c1101m.f6894a - 1; i2 >= 0; i2--) {
            AbstractC0547a abstractC0547a = (AbstractC0547a) m534a[i2];
            if (abstractC0547a instanceof C0554e) {
                C0554e c0554e = (C0554e) abstractC0547a;
                if (c0208c == C0208c.f1428a || c0554e.m3132a(c0208c)) {
                    c0554e.f3755a = i - 1;
                }
            }
        }
    }
}
