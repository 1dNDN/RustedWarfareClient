package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c.class */
public final class C0415c {

    /* renamed from: a */
    EnumC0422d f2658a;

    /* renamed from: b */
    int f2659b;

    /* renamed from: c */
    String f2660c;

    /* renamed from: d */
    float f2661d;

    /* renamed from: e */
    public C0320a[] f2662e;

    /* renamed from: g */
    private C1101m f2663g = new C1101m();

    /* renamed from: f */
    public final boolean f2664f = false;

    /* renamed from: a */
    public C0386b m3755a() {
        C0386b c0386b = null;
        if (this.f2663g.size() > 0) {
            c0386b = (C0386b) this.f2663g.get(this.f2663g.size() - 1);
            if (c0386b.f2326h) {
                c0386b = null;
            }
        }
        return c0386b;
    }

    /* renamed from: a */
    public void m3752a(C0451j c0451j, float f, float f2, boolean z) {
        if (z || f2 <= f) {
            return;
        }
        C0320a[] c0320aArr = this.f2662e;
        int length = c0320aArr.length;
        int i = -1;
        while (i + 1 < length && f > c0320aArr[i + 1].f1907a) {
            i++;
        }
        int i2 = i;
        while (i2 + 1 < length && f2 > c0320aArr[i2 + 1].f1907a) {
            i2++;
        }
        if (i2 <= i) {
            return;
        }
        for (int i3 = i + 1; i3 <= i2; i3++) {
            ((C0386b) c0320aArr[i3]).m3828a(c0451j);
        }
    }

    /* renamed from: b */
    public void m3750b() {
        C0386b m3755a;
        if (this.f2658a == EnumC0422d.event && (m3755a = m3755a()) != null) {
            m3755a.finalize();
        }
    }

    /* renamed from: a */
    public void m3751a(C0453l c0453l, float f, String str, String str2) {
        if (this.f2658a == EnumC0422d.event) {
            C0386b m3755a = m3755a();
            if (m3755a == null) {
                m3755a = new C0386b(f, 0.0f);
                this.f2663g.add(m3755a);
            }
            m3755a.m3827a(c0453l, str, str2);
            return;
        }
        try {
            m3753a(f, Float.parseFloat(str2));
        } catch (NumberFormatException e) {
            throw new C0412bm("Failed to parse float:" + str2);
        }
    }

    /* renamed from: a */
    public void m3753a(float f, float f2) {
        if (this.f2658a == EnumC0422d.event) {
            throw new C0412bm("Adding key frame value to event set");
        }
        if (this.f2663g.size() == 0 && f > 0.0f && f2 != 0.0f) {
            this.f2663g.add(new C0320a(0.0f, 0.0f));
        }
        this.f2663g.add(new C0320a(f, f2));
    }

    /* renamed from: a */
    public void m3754a(float f) {
        Iterator it = this.f2663g.iterator();
        while (it.hasNext()) {
            ((C0320a) it.next()).f1907a *= f;
        }
    }

    /* renamed from: c */
    public void m3748c() {
        Collections.sort(this.f2663g);
        C0320a c0320a = null;
        Iterator it = this.f2663g.iterator();
        while (it.hasNext()) {
            C0320a c0320a2 = (C0320a) it.next();
            if (c0320a != null) {
                c0320a2.f1909c = 1.0f / (c0320a2.f1907a - c0320a.f1907a);
                c0320a2.f1910d = c0320a2.f1908b - c0320a.f1908b;
            }
            c0320a = c0320a2;
            this.f2661d = c0320a2.f1907a;
        }
        this.f2662e = (C0320a[]) this.f2663g.toArray(new C0320a[0]);
        this.f2663g = null;
    }

    /* renamed from: b */
    public float m3749b(float f) {
        C0320a[] c0320aArr = this.f2662e;
        int length = c0320aArr.length;
        if (length == 1 || f <= c0320aArr[0].f1907a) {
            return c0320aArr[0].f1908b;
        }
        if (f >= this.f2661d) {
            return c0320aArr[length - 1].f1908b;
        }
        int i = 1;
        while (f > c0320aArr[i].f1907a) {
            i++;
            if (i >= length) {
                return c0320aArr[length - 1].f1908b;
            }
        }
        C0320a c0320a = c0320aArr[i - 1];
        C0320a c0320a2 = c0320aArr[i];
        return c0320a.f1908b + (c0320a2.f1910d * (f - c0320a.f1907a) * c0320a2.f1909c);
    }
}
