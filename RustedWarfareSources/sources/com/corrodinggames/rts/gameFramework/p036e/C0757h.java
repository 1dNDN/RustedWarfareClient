package com.corrodinggames.rts.gameFramework.p036e;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.e.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/h.class */
class C0757h {

    /* renamed from: a */
    public InputStream f4887a;

    public C0757h(InputStream inputStream) {
        this.f4887a = inputStream;
    }

    /* renamed from: a */
    public void m2155a() {
        try {
            if (this.f4887a != null) {
                this.f4887a.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
