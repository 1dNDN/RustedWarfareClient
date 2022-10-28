package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/c.class */
public class C0794c {

    /* renamed from: a */
    AbstractC0244am f5097a;

    /* renamed from: b */
    AbstractC0224s f5098b;

    /* renamed from: c */
    float f5099c;

    /* renamed from: d */
    boolean f5100d;

    /* renamed from: e */
    boolean f5101e;

    /* renamed from: f */
    static C1101m f5102f = new C1101m();

    C0794c() {
    }

    /* renamed from: a */
    public static void m1878a(AbstractC0244am abstractC0244am, AbstractC0224s abstractC0224s, boolean z, boolean z2) {
        C0794c m1879a = m1879a(abstractC0244am, abstractC0224s, z2);
        if (m1879a == null) {
            m1879a = new C0794c();
            f5102f.add(m1879a);
        }
        m1879a.f5097a = abstractC0244am;
        m1879a.f5098b = abstractC0224s;
        m1879a.f5099c = 10.0f;
        m1879a.f5100d = z;
        m1879a.f5101e = z2;
    }

    /* renamed from: a */
    public static C0794c m1879a(AbstractC0244am abstractC0244am, AbstractC0224s abstractC0224s, boolean z) {
        Iterator it = f5102f.iterator();
        while (it.hasNext()) {
            C0794c c0794c = (C0794c) it.next();
            if (c0794c.f5097a == abstractC0244am && c0794c.f5098b == abstractC0224s && c0794c.f5101e == z) {
                return c0794c;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static float m1877b(AbstractC0244am abstractC0244am, AbstractC0224s abstractC0224s, boolean z) {
        C0794c m1879a = m1879a(abstractC0244am, abstractC0224s, z);
        if (m1879a != null) {
            float f = m1879a.f5099c / 10.0f;
            if (m1879a.f5100d) {
                f = -f;
            }
            return f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m1880a(float f) {
        for (int size = f5102f.size() - 1; size >= 0; size--) {
            C0794c c0794c = (C0794c) f5102f.get(size);
            c0794c.f5099c -= f;
            if (c0794c.f5099c <= 0.0f) {
                f5102f.remove(size);
            }
        }
    }
}
