package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ad.class */
public class C0785ad {

    /* renamed from: a */
    static C1101m f5075a = new C1101m();

    /* renamed from: b */
    static final C0812t f5076b = new C0812t();

    /* renamed from: a */
    public static C0786ae m1957a(long j) {
        Object[] m534a = f5075a.m534a();
        for (int i = f5075a.f6894a - 1; i >= 0; i--) {
            C0786ae c0786ae = (C0786ae) m534a[i];
            if (c0786ae.f5077a == j) {
                return c0786ae;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0786ae m1956a(AbstractC0244am abstractC0244am) {
        C0786ae m1957a = m1957a(abstractC0244am.f6951ee);
        if (m1957a == null) {
            m1957a = new C0786ae();
            m1957a.f5077a = abstractC0244am.f6951ee;
            m1957a.f5078b = abstractC0244am.f1642cC;
            m1957a.f5079c = abstractC0244am.f1643cD;
            m1957a.f5080d = Core.m1087A().f6122bX.f5580X;
            f5075a.add(m1957a);
        }
        return m1957a;
    }

    /* renamed from: a */
    public static void m1955a(AbstractC0244am abstractC0244am, C0424b c0424b) {
        if (!Core.m1087A().f6122bX.lock1) {
            return;
        }
        C0786ae m1956a = m1956a(abstractC0244am);
        m1956a.f5078b += c0424b.f2703f;
        m1956a.f5079c = c0424b.m4095c(m1956a.f5079c);
        if (!c0424b.f2708k.m3999c()) {
            m1956a.f5081e = C0439f.m4000b(m1956a.f5081e, c0424b.f2708k);
        }
    }

    /* renamed from: b */
    public static void m1952b(AbstractC0244am abstractC0244am, C0424b c0424b) {
        if (!Core.m1087A().f6122bX.lock1) {
            return;
        }
        C0786ae m1956a = m1956a(abstractC0244am);
        m1956a.f5078b -= c0424b.f2703f;
        m1956a.f5079c = c0424b.m4095c(m1956a.f5079c);
        if (!c0424b.f2708k.m3999c()) {
            m1956a.f5081e = C0439f.m4014a(m1956a.f5081e, c0424b.f2708k);
        }
        if (f5075a.f6894a > 0) {
        }
    }

    /* renamed from: c */
    public static boolean m1951c(AbstractC0244am abstractC0244am, C0424b c0424b) {
        C0786ae m1957a = m1957a(abstractC0244am.f6951ee);
        if (m1957a != null) {
            f5076b.f1609bV = abstractC0244am.f1609bV;
            f5076b.f1642cC = m1957a.f5078b;
            f5076b.f1643cD = m1957a.f5079c;
            C0439f mo1759dd = f5076b.mo1759dd();
            f5076b.m1761a(m1957a.f5081e);
            boolean mo4075b = c0424b.mo4075b(f5076b);
            f5076b.m1761a(mo1759dd);
            return mo4075b;
        }
        return c0424b.mo4075b(abstractC0244am);
    }

    /* renamed from: a */
    public static boolean m1954a(LogicBoolean logicBoolean, AbstractC0623y abstractC0623y) {
        C0786ae m1957a = m1957a(abstractC0623y.f6951ee);
        if (m1957a != null) {
            int i = abstractC0623y.f1642cC;
            int i2 = abstractC0623y.f1643cD;
            abstractC0623y.f1642cC = m1957a.f5078b;
            abstractC0623y.f1643cD = m1957a.f5079c;
            boolean read = logicBoolean.read(abstractC0623y);
            abstractC0623y.f1642cC = i;
            abstractC0623y.f1643cD = i2;
            return read;
        }
        return logicBoolean.read(abstractC0623y);
    }

    /* renamed from: a */
    public static void m1958a() {
        if (f5075a.f6894a > 0) {
            Core.LogDebug2("LagHiding: clearing: " + f5075a.f6894a);
        }
        f5075a.clear();
    }

    /* renamed from: a */
    public static void m1953a(AbstractC0623y abstractC0623y, AbstractC0224s abstractC0224s) {
        if (f5075a.size() == 0) {
            return;
        }
        int i = Core.m1087A().f6122bX.f5580X;
        for (int size = f5075a.size() - 1; size >= 0; size--) {
            C0786ae c0786ae = (C0786ae) f5075a.get(size);
            if (c0786ae.f5077a == abstractC0623y.f6951ee) {
                f5075a.remove(size);
                return;
            } else if (c0786ae.f5080d < i + 80) {
                f5075a.remove(size);
                return;
            }
        }
    }
}
