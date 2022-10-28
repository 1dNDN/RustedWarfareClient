package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0657ar;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.java.audio.Music;
import com.corrodinggames.rts.java.audio.p050a.C1130a;

/* renamed from: com.corrodinggames.rts.java.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/m.class */
public class C1183m extends AbstractC0657ar {

    /* renamed from: a */
    C1182l f7233a;

    /* renamed from: c */
    Music f7234c;

    public C1183m(String str, C1182l c1182l) {
        super(str, c1182l);
        this.f7233a = c1182l;
        synchronized (c1182l.m91f()) {
            this.f7233a = c1182l;
            String m2213e = C0750a.m2213e(str);
            if (m2213e.contains(".rwmod")) {
                this.f7234c = c1182l.f7231b.newMusic(new C1130a(C0750a.m2207j(str), m2213e));
            } else {
                this.f7234c = c1182l.f7231b.newMusic(new C1130a(m2213e));
            }
        }
    }
}
