package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0657ar;
import com.corrodinggames.rts.gameFramework.AbstractC0658as;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.java.audio.Music;

/* renamed from: com.corrodinggames.rts.java.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/n.class */
public class C1184n extends AbstractC0658as {

    /* renamed from: a */
    C1183m f7235a;

    /* renamed from: b */
    C1182l f7236b;

    /* renamed from: c */
    Music f7237c;

    /* renamed from: d */
    boolean f7238d = false;

    /* renamed from: e */
    boolean f7239e = false;

    /* renamed from: f */
    boolean f7240f = false;

    public C1184n(C1182l c1182l) {
        this.f7236b = c1182l;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0658as
    /* renamed from: a */
    public void mo88a(AbstractC0657ar abstractC0657ar) {
        this.f7235a = (C1183m) abstractC0657ar;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0658as
    /* renamed from: a */
    public void mo87a(boolean z) {
        synchronized (this.f7236b.m91f()) {
            this.f7238d = true;
            this.f7239e = z;
            this.f7240f = false;
            AbstractC0916l.m963e("Queued:" + this.f7235a.f4217b);
            if (this.f7237c != null) {
                AbstractC0916l.m963e("startPlaying: Stopping old music");
                this.f7237c.stop();
            }
            this.f7237c = this.f7235a.f7234c;
        }
    }

    /* renamed from: f */
    public void m82f() {
        if (this.f7240f) {
            return;
        }
        synchronized (this.f7236b.m91f()) {
            if (this.f7237c != null) {
                AbstractC0916l.m963e("Now playing:" + this.f7235a.f4217b);
                if (this.f7239e) {
                    this.f7237c.setVolume(this.f7237c.getVolume());
                    this.f7237c.setLooping(true);
                    this.f7237c.play();
                } else {
                    this.f7237c.setVolume(this.f7237c.getVolume());
                    this.f7237c.play();
                }
                this.f7240f = true;
            } else {
                AbstractC0916l.m963e("realPlay: playingMusic==null");
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0658as
    /* renamed from: a */
    public void mo90a() {
        synchronized (this.f7236b.m91f()) {
            if (this.f7237c != null) {
                this.f7237c.pause();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0658as
    /* renamed from: b */
    public void mo86b() {
        synchronized (this.f7236b.m91f()) {
            if (this.f7237c != null && !this.f7237c.isPlaying()) {
                this.f7237c.play();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0658as
    /* renamed from: d */
    public void mo84d() {
        synchronized (this.f7236b.m91f()) {
            if (this.f7237c != null) {
                this.f7237c.stop();
                this.f7240f = false;
                this.f7238d = false;
                this.f7237c = null;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0658as
    /* renamed from: e */
    public void mo83e() {
        synchronized (this.f7236b.m91f()) {
            if (this.f7237c != null) {
                this.f7237c.stop();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0658as
    /* renamed from: c */
    public boolean mo85c() {
        synchronized (this.f7236b.m91f()) {
            if (this.f7240f && this.f7237c != null) {
                return this.f7237c.isPlaying();
            }
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0658as
    /* renamed from: a */
    public void mo89a(float f) {
        synchronized (this.f7236b.m91f()) {
            if (this.f7237c != null) {
                if (f > 0.05f && !this.f7240f && this.f7238d) {
                    m82f();
                }
                this.f7237c.setVolume(f);
            } else {
                AbstractC0916l.m963e("setVolume: playingMusic==null");
            }
        }
    }
}
