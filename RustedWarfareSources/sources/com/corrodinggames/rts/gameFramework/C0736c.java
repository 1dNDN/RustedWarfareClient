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
    public static void m2371a(String str) {
        f4624e++;
        if (f4624e == 5) {
            LoggerMaybe.LogDebug2("(Rate Limiting...)");
        }
        if (f4624e >= 5) {
            return;
        }
        LoggerMaybe.LogDebug2(str);
    }

    /* renamed from: a */
    public void m2373a() {
        this.f4621b.clear();
        this.f4622c.clear();
        this.f4623d.clear();
    }

    /* renamed from: b */
    public C0749e m2370b() {
        C0749e c0749e = new C0749e(this);
        if (f4620a) {
            LoggerMaybe.LogDebug2("Tracing source");
            c0749e.f4839b = LoggerMaybe.m1031a(new Exception("Test"));
        }
        return c0749e;
    }

    /* renamed from: a */
    public C0749e m2372a(AbstractC0197n abstractC0197n) {
        return m2369b(abstractC0197n);
    }

    /* renamed from: b */
    public C0749e m2369b(AbstractC0197n abstractC0197n) {
        if (abstractC0197n == null) {
            throw new RuntimeException("team==null");
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0749e c0749e = new C0749e(this);
        c0749e.f4846i = abstractC0197n;
        c0749e.f4841d = m1079A.f6102by;
        if (f4620a) {
            LoggerMaybe.LogDebug2("Tracing source");
            c0749e.f4839b = LoggerMaybe.m1031a(new Exception("Test"));
        }
        if (!m1079A.f6122bX.lock1) {
            if (!c0749e.m2249l()) {
                LoggerMaybe.m990b("Command failed prepareAndCheckOnServer()");
            }
            this.f4621b.add(c0749e);
        } else {
            this.f4623d.add(c0749e);
        }
        return c0749e;
    }

    /* renamed from: c */
    public void m2368c() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        f4624e = 0;
        if (!m1079A.f6122bX.lock1) {
            m2367d();
        } else {
            m2366e();
        }
    }

    /* renamed from: d */
    public void m2367d() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int i = m1079A.f6239bx;
        Iterator it = this.f4621b.iterator();
        while (it.hasNext()) {
            C0749e c0749e = (C0749e) it.next();
            m1079A.f6126cb.m2430a(c0749e, i);
            c0749e.m2250k();
        }
        this.f4621b.clear();
    }

    /* renamed from: e */
    public void m2366e() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int i = m1079A.f6239bx;
        Iterator it = this.f4621b.iterator();
        while (it.hasNext()) {
            C0749e c0749e = (C0749e) it.next();
            if (c0749e.f4840c == i) {
                m1079A.f6126cb.m2430a(c0749e, i);
                c0749e.m2250k();
                it.remove();
            }
        }
    }
}
