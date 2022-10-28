package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import android.media.SoundPool;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1074ad;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/a.class */
public class C0627a extends AbstractC0634h {

    /* renamed from: d */
    C0630d f4021d;

    /* renamed from: f */
    Context f4023f;

    /* renamed from: g */
    SoundPool f4024g;

    /* renamed from: a */
    LinkedBlockingQueue f4018a = new LinkedBlockingQueue();

    /* renamed from: b */
    final int f4019b = 15;

    /* renamed from: c */
    C1074ad f4020c = new C1074ad(15);

    /* renamed from: e */
    int f4022e = 1000;

    public C0627a() {
        for (int i = 0; i < 15; i++) {
            this.f4020c.m610a(new C0629c());
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public void mo79a(Context context) {
        if (this.f4023f != null) {
            AbstractC0916l.m963e("AndroidSoundFactory:setContext context already set");
            return;
        }
        this.f4023f = context;
        this.f4024g = new SoundPool(16, 3, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public void mo81a() {
        if (this.f4021d != null) {
            throw new RuntimeException("soundThread!=null");
        }
        this.f4021d = new C0630d(this);
        this.f4021d.start();
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public AbstractC0635i mo80a(int i) {
        C0628b c0628b = new C0628b(this, C0758f.m2121a(C0067R.raw.class, i), this);
        c0628b.f4025a = this;
        c0628b.f4026b = this.f4024g.load(this.f4023f, i, 1);
        return c0628b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0634h
    /* renamed from: a */
    public AbstractC0635i mo78a(String str, C1098j c1098j, boolean z) {
        int load;
        C0627a c0627a = this;
        if (!z) {
            c0627a = null;
        }
        if (!c1098j.m543a()) {
            try {
                File m2233a = C0750a.m2233a(this.f4023f, "audio", "ogg");
                FileOutputStream fileOutputStream = new FileOutputStream(m2233a);
                C0758f.m2123a(c1098j, fileOutputStream);
                fileOutputStream.close();
                try {
                    c1098j.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                FileInputStream fileInputStream = new FileInputStream(m2233a);
                try {
                    load = this.f4024g.load(fileInputStream.getFD(), 0L, fileInputStream.available(), 1);
                    fileInputStream.close();
                    m2233a.delete();
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        } else {
            try {
                load = this.f4024g.load(c1098j.m542b(), 0L, c1098j.available(), 1);
                try {
                    c1098j.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                return null;
            }
        }
        C0628b c0628b = new C0628b(this, str, c0627a);
        c0628b.f4025a = this;
        c0628b.f4026b = load;
        return c0628b;
    }
}
