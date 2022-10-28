package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0656aq;
import com.corrodinggames.rts.gameFramework.AbstractC0657ar;
import com.corrodinggames.rts.gameFramework.AbstractC0658as;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0648am;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;

/* renamed from: com.corrodinggames.rts.java.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/l.class */
public class C1182l extends AbstractC0656aq {

    /* renamed from: a */
    volatile boolean f7230a;

    /* renamed from: b */
    public OpenALAudio f7231b;

    /* renamed from: c */
    boolean f7232c = false;

    /* renamed from: f */
    public Object m91f() {
        return this.f7231b;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0656aq
    /* renamed from: a */
    public void mo99a(float f) {
        double m2368a;
        synchronized (m91f()) {
            if (this.f7230a) {
                return;
            }
            long m2370a = C0727bl.m2370a();
            this.f7231b.update();
            if (C0727bl.m2368a(m2370a) > 16.0d) {
                AbstractC0916l.m963e("music poll took:" + C0727bl.m2369a(m2368a));
            }
            super.mo99a(f);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0656aq
    /* renamed from: a */
    public void mo98a(int i) {
    }

    public C1182l(OpenALAudio openALAudio) {
        this.f7231b = openALAudio;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0656aq
    /* renamed from: a */
    public AbstractC0657ar mo96a(String str) {
        return new C1183m(str, this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0656aq
    /* renamed from: a */
    public AbstractC0658as mo100a() {
        return new C1184n(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0656aq
    /* renamed from: a */
    public void mo97a(C0648am c0648am) {
        this.f4216e = c0648am;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0656aq
    /* renamed from: b */
    public void mo95b() {
        synchronized (m91f()) {
            this.f7230a = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0656aq
    /* renamed from: c */
    public boolean mo94c() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0656aq
    /* renamed from: d */
    public boolean mo93d() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0656aq
    /* renamed from: e */
    public int mo92e() {
        return 100;
    }
}
