package com.corrodinggames.rts.game.units.p028g;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.units.g.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/c.class */
public final class C0552c {
    /* renamed from: a */
    public static void m3139a(AbstractC0623y abstractC0623y, float f) {
        C1101m c1101m = abstractC0623y.f3994bo;
        if (c1101m == null) {
            return;
        }
        int i = LoggerMaybe.m1072A().f6102by;
        Object[] m534a = c1101m.m534a();
        for (int i2 = c1101m.f6894a - 1; i2 >= 0; i2--) {
            AbstractC0547a abstractC0547a = (AbstractC0547a) m534a[i2];
            if (abstractC0547a.f3755a <= i) {
                c1101m.remove(i2);
            } else {
                abstractC0547a.m3141a(abstractC0623y, f);
            }
        }
    }

    /* renamed from: a */
    public static void m3138a(AbstractC0623y abstractC0623y, AbstractC0547a abstractC0547a) {
        if (abstractC0623y.f3994bo == null) {
            abstractC0623y.f3994bo = new C1101m();
        }
        if (abstractC0623y.f3994bo.size() > 1000) {
            abstractC0623y.m2901a("status effect limit reached");
        } else {
            abstractC0623y.f3994bo.add(abstractC0547a);
        }
    }

    /* renamed from: a */
    public static void m3137a(AbstractC0623y abstractC0623y, StreamWriter streamWriter) {
        int size;
        C1101m c1101m = abstractC0623y.f3994bo;
        if (c1101m == null) {
            size = 0;
        } else {
            size = c1101m.size();
        }
        streamWriter.mo1315a((short) size);
        if (size == 0) {
            return;
        }
        streamWriter.mo1350e("s");
        Object[] m534a = c1101m.m534a();
        for (int i = 0; i < c1101m.f6894a; i++) {
            AbstractC0547a abstractC0547a = (AbstractC0547a) m534a[i];
            streamWriter.mo1363a(abstractC0547a.mo3133b());
            abstractC0547a.mo3135a(abstractC0623y, streamWriter);
        }
        streamWriter.mo1317a("s");
    }

    /* renamed from: a */
    public static void m3136a(AbstractC0623y abstractC0623y, Reader reader) {
        int m1270v = reader.m1270v();
        if (m1270v <= 0) {
            abstractC0623y.f3994bo = null;
            return;
        }
        if (abstractC0623y.f3994bo == null) {
            abstractC0623y.f3994bo = new C1101m();
        } else {
            abstractC0623y.f3994bo.clear();
        }
        C1101m c1101m = abstractC0623y.f3994bo;
        reader.m1292b("s");
        for (int i = 0; i < m1270v; i++) {
            EnumC0549b enumC0549b = (EnumC0549b) reader.m1293b(EnumC0549b.class);
            if (enumC0549b == null) {
                throw new IOException("Unknown status effect type");
            }
            AbstractC0547a mo3140a = enumC0549b.mo3140a();
            mo3140a.mo3134a(abstractC0623y, reader);
            c1101m.add(mo3140a);
        }
        reader.m1288d("s");
    }
}
