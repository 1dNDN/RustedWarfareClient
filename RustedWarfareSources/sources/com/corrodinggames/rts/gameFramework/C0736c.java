package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.AbstractC0197n;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c.class */
public class C0736c {

    /* renamed from: a */
    static final boolean f4620a = false;

    /* renamed from: b */
    public ArrayList f4621b = new ArrayList();

    /* renamed from: c */
    public ArrayList f4622c = new ArrayList();

    /* renamed from: d */
    public ArrayList f4623d = new ArrayList();

    /* renamed from: e */
    static int f4624e;

    /* renamed from: a */
    public static void m2421a(String str) {
        f4624e++;
        if (f4624e == 5) {
            Core.LogDebug2("(Rate Limiting...)");
        }
        if (f4624e >= 5) {
            return;
        }
        Core.LogDebug2(str);
    }

    /* renamed from: a */
    public void m2423a() {
        this.f4621b.clear();
        this.f4622c.clear();
        this.f4623d.clear();
    }

    /* renamed from: b */
    public C0749e m2420b() {
        C0749e c0749e = new C0749e(this);
        if (f4620a) {
            Core.LogDebug2("Tracing source");
            c0749e.f4839b = Core.m1039a(new Exception("Test"));
        }
        return c0749e;
    }

    /* renamed from: a */
    public C0749e m2422a(AbstractC0197n abstractC0197n) {
        return m2419b(abstractC0197n);
    }

    /* renamed from: b */
    public C0749e m2419b(AbstractC0197n abstractC0197n) {
        if (abstractC0197n == null) {
            throw new RuntimeException("team==null");
        }
        Core m1087A = Core.m1087A();
        C0749e c0749e = new C0749e(this);
        c0749e.f4846i = abstractC0197n;
        c0749e.f4841d = m1087A.f6102by;
        if (f4620a) {
            Core.LogDebug2("Tracing source");
            c0749e.f4839b = Core.m1039a(new Exception("Test"));
        }
        if (!m1087A.f6122bX.lock1) {
            if (!c0749e.m2298l()) {
                Core.m998b("Command failed prepareAndCheckOnServer()");
            }
            this.f4621b.add(c0749e);
        } else {
            this.f4623d.add(c0749e);
        }
        return c0749e;
    }

    /* renamed from: c */
    public void m2418c() {
        Core m1087A = Core.m1087A();
        f4624e = 0;
        if (!m1087A.f6122bX.lock1) {
            m2417d();
        } else {
            m2416e();
        }
    }

    /* renamed from: d */
    public void m2417d() {
        Core m1087A = Core.m1087A();
        int i = m1087A.f6239bx;
        Iterator it = this.f4621b.iterator();
        while (it.hasNext()) {
            C0749e c0749e = (C0749e) it.next();
            m1087A.f6126cb.m2481a(c0749e, i);
            c0749e.m2299k();
        }
        this.f4621b.clear();
    }

    /* renamed from: e */
    public void m2416e() {
        Core m1087A = Core.m1087A();
        int i = m1087A.f6239bx;
        Iterator it = this.f4621b.iterator();
        while (it.hasNext()) {
            C0749e c0749e = (C0749e) it.next();
            if (c0749e.f4840c == i) {
                m1087A.f6126cb.m2481a(c0749e, i);
                c0749e.m2299k();
                it.remove();
            }
        }
    }
}
