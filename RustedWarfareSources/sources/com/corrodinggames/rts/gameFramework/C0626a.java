package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a.class */
public class C0626a {

    /* renamed from: n */
    ArrayList f4017n = new ArrayList();

    /* renamed from: a */
    public C0669b f4004a = m2710a((byte) 1);

    /* renamed from: b */
    public C0669b f4005b = m2710a((byte) 2);

    /* renamed from: c */
    public C0669b f4006c = m2710a((byte) 3);

    /* renamed from: d */
    public C0669b f4007d = m2710a((byte) 4);

    /* renamed from: e */
    public C0669b f4008e = m2710a((byte) 10);

    /* renamed from: f */
    public C0669b f4009f = m2710a((byte) 11);

    /* renamed from: g */
    public C0669b f4010g = m2710a((byte) 13);

    /* renamed from: h */
    public C0669b f4011h = m2710a((byte) 21);

    /* renamed from: i */
    public C0669b f4012i = m2710a((byte) 35);

    /* renamed from: j */
    public C0669b f4013j = m2710a((byte) 40);

    /* renamed from: k */
    public C0669b f4014k = m2710a((byte) 45);

    /* renamed from: l */
    public C0669b f4015l = m2710a((byte) 52);

    /* renamed from: m */
    public C0669b f4016m = m2710a((byte) 60);

    public C0626a() {
        C0669b c0669b = this.f4004a;
        c0669b.m2614a(c0669b);
        c0669b.m2614a(m2710a((byte) 3));
        c0669b.m2614a(m2710a((byte) 4));
        c0669b.m2614a(m2710a((byte) 10));
        c0669b.m2614a(m2710a((byte) 11));
        c0669b.m2614a(m2710a((byte) 13));
        c0669b.m2614a(m2710a((byte) 21));
        this.f4014k.m2614a(m2710a((byte) 52));
        C0669b c0669b2 = this.f4016m;
        c0669b2.m2614a(c0669b2);
        c0669b2.m2614a(m2710a((byte) 3));
        c0669b2.m2614a(m2710a((byte) 4));
        c0669b2.m2614a(m2710a((byte) 10));
        c0669b2.m2614a(m2710a((byte) 11));
        c0669b2.m2614a(m2710a((byte) 13));
        c0669b2.m2614a(m2710a((byte) 21));
        C0669b m2710a = m2710a((byte) 10);
        m2710a.m2614a(m2710a((byte) 3));
        m2710a.m2614a(m2710a((byte) 4));
        m2710a.m2614a(m2710a((byte) 10));
        m2710a.m2614a(m2710a((byte) 13));
        m2710a.m2614a(m2710a((byte) 40));
        C0669b m2710a2 = m2710a((byte) 11);
        m2710a2.m2614a(m2710a((byte) 3));
        m2710a2.m2614a(m2710a((byte) 10));
        m2710a2.m2614a(m2710a((byte) 13));
        m2710a2.m2614a(m2710a((byte) 40));
        C0669b m2710a3 = m2710a((byte) 3);
        m2710a3.m2614a(m2710a((byte) 3));
        m2710a3.m2614a(m2710a((byte) 4));
        m2710a3.m2614a(m2710a((byte) 10));
        m2710a3.m2614a(m2710a((byte) 13));
        C0669b m2710a4 = m2710a((byte) 4);
        m2710a4.m2614a(m2710a((byte) 3));
        m2710a4.m2614a(m2710a((byte) 4));
        m2710a4.m2614a(m2710a((byte) 10));
        m2710a4.m2614a(m2710a((byte) 13));
        C0669b m2710a5 = m2710a((byte) 13);
        m2710a5.m2614a(m2710a((byte) 3));
        m2710a5.m2614a(m2710a((byte) 4));
        m2710a5.m2614a(m2710a((byte) 10));
        m2710a5.m2614a(m2710a((byte) 13));
        C0669b m2710a6 = m2710a((byte) 21);
        m2710a6.m2614a(m2710a((byte) 3));
        m2710a6.m2614a(m2710a((byte) 4));
        m2710a6.m2614a(m2710a((byte) 10));
        m2710a6.m2614a(m2710a((byte) 13));
        C0669b c0669b3 = this.f4012i;
        c0669b3.m2614a(m2710a((byte) 10));
        c0669b3.m2614a(m2710a((byte) 13));
    }

    /* renamed from: a */
    public C0669b m2710a(byte b) {
        Iterator it = this.f4017n.iterator();
        while (it.hasNext()) {
            C0669b c0669b = (C0669b) it.next();
            if (c0669b.f4234a == b) {
                return c0669b;
            }
        }
        C0669b c0669b2 = new C0669b();
        c0669b2.f4234a = b;
        this.f4017n.add(c0669b2);
        return c0669b2;
    }
}
