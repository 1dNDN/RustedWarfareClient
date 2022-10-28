package com.corrodinggames.rts.java;

import android.content.Context;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i;
import com.corrodinggames.rts.gameFramework.utility.C1074ad;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.audio.p050a.C1130a;
import com.corrodinggames.rts.java.audio.p050a.C1132c;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.corrodinggames.rts.java.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/o.class */
public class C1185o extends AbstractC0634h {

    /* renamed from: a */
    final int f7241a = 15;

    /* renamed from: b */
    LinkedBlockingQueue f7242b = new LinkedBlockingQueue();

    /* renamed from: c */
    C1074ad f7243c = new C1074ad(15);

    /* renamed from: d */
    C1188r f7244d;

    /* renamed from: e */
    Context f7245e;

    /* renamed from: f */
    public OpenALAudio f7246f;

    /* renamed from: b */
    public Object m77b() {
        return this.f7246f;
    }

    public C1185o(OpenALAudio openALAudio) {
        for (int i = 0; i < 15; i++) {
            this.f7243c.m610a(new C1186p());
        }
        this.f7246f = openALAudio;
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public void mo79a(Context context) {
        if (this.f7245e != null) {
            AbstractC0916l.m963e("SlickSoundFactory:setContext context already set");
        } else {
            this.f7245e = context;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public AbstractC0635i mo80a(int i) {
        C1187q c1187q = new C1187q(this, C0758f.m2044f(i), this);
        String m2044f = C0758f.m2044f(i);
        if (m2044f == null) {
            throw new RuntimeException("Failed to find sound for res id:" + i);
        }
        synchronized (m77b()) {
            c1187q.f7253a = this.f7246f.newSound(new C1130a(m2044f));
        }
        return c1187q;
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public AbstractC0635i mo78a(String str, C1098j c1098j, boolean z) {
        C1185o c1185o = this;
        if (!z) {
            c1185o = null;
        }
        C1187q c1187q = new C1187q(this, str, c1185o);
        try {
            synchronized (m77b()) {
                c1187q.f7253a = this.f7246f.newSound(new C1130a(c1098j, c1098j.m540d()));
            }
            return c1187q;
        } catch (C1132c e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public void mo81a() {
        if (this.f7244d != null) {
            throw new RuntimeException("startThreads: soundThread!=null");
        }
        this.f7244d = new C1188r(this);
        this.f7244d.start();
    }
}
