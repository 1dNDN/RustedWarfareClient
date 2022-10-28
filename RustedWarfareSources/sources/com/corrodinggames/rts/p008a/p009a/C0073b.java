package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/b.class */
public class C0073b extends AbstractC0083l {
    /* renamed from: a */
    public void m4856a() {
        m4855b();
    }

    /* renamed from: b */
    public void m4855b() {
        AbstractC0916l.m963e("networkSocks");
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        for (int i = 0; i < 10000; i++) {
            m1071A.f6170bX.m1482b(false);
            try {
                Thread.sleep(50L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            m1071A.f6170bX.m1485b("test");
        }
        AbstractC0916l.m963e("done");
        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
