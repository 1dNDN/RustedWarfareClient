package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j;
import com.corrodinggames.rts.gameFramework.p042j.C0899d;
import com.corrodinggames.rts.gameFramework.p042j.C0900e;
import com.corrodinggames.rts.gameFramework.p042j.C0909n;

/* renamed from: com.corrodinggames.rts.a.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/k.class */
public class C0082k extends AbstractC0083l {
    /* renamed from: a */
    public C0909n m4830a(int i) {
        C0909n c0909n = new C0909n();
        c0909n.m1115a((short) i, (short) 0);
        c0909n.m1117a(0, 0, 0);
        return c0909n;
    }

    /* renamed from: a */
    public void m4831a() {
        AbstractC0916l.m963e("== Testing FastNodeQueue ==");
        m4829a(new C0899d());
        AbstractC0916l.m963e("== Testing FastNodeQueue2 ==");
        m4829a(new C0900e());
    }

    /* renamed from: a */
    public void m4829a(AbstractC0905j abstractC0905j) {
        C0909n m4830a = m4830a(1);
        C0909n m4830a2 = m4830a(2);
        C0909n m4830a3 = m4830a(3);
        C0909n m4830a4 = m4830a(4);
        AbstractC0916l.m963e("sequential");
        abstractC0905j.mo1170b();
        abstractC0905j.mo1171a(m4830a);
        abstractC0905j.mo1171a(m4830a2);
        abstractC0905j.mo1171a(m4830a3);
        abstractC0905j.mo1171a(m4830a4);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a2);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a3);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a4);
        AbstractC0916l.m963e("reverse sequence");
        abstractC0905j.mo1170b();
        abstractC0905j.mo1171a(m4830a4);
        abstractC0905j.mo1171a(m4830a3);
        abstractC0905j.mo1171a(m4830a2);
        abstractC0905j.mo1171a(m4830a);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a2);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a3);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a4);
        AbstractC0916l.m963e("sequential with noise");
        abstractC0905j.mo1170b();
        abstractC0905j.mo1171a(m4830a);
        for (int i = 0; i < 1000; i++) {
            abstractC0905j.mo1171a(m4830a(100 + i));
        }
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a);
        abstractC0905j.mo1171a(m4830a2);
        abstractC0905j.mo1171a(m4830a3);
        for (int i2 = 0; i2 < 1000; i2++) {
            abstractC0905j.mo1171a(m4830a(100 + i2));
        }
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a2);
        abstractC0905j.mo1171a(m4830a4);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a3);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a4);
        AbstractC0916l.m963e("reverse sequence with noise");
        abstractC0905j.mo1170b();
        abstractC0905j.mo1171a(m4830a4);
        abstractC0905j.mo1171a(m4830a3);
        for (int i3 = 0; i3 < 1000; i3++) {
            abstractC0905j.mo1171a(m4830a(100 + i3));
        }
        abstractC0905j.mo1171a(m4830a2);
        for (int i4 = 0; i4 < 1000; i4++) {
            abstractC0905j.mo1171a(m4830a(100 + i4));
        }
        abstractC0905j.mo1171a(m4830a);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a2);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a3);
        C0085n.m4820a(abstractC0905j.mo1172a(), m4830a4);
    }
}
