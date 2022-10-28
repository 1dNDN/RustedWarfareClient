package com.corrodinggames.rts.gameFramework;

import android.media.MediaPlayer;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/an.class */
public class C0651an extends AbstractC0656aq {

    /* renamed from: a */
    ArrayList f4206a = new ArrayList();

    /* renamed from: b */
    ArrayList f4207b = new ArrayList();

    /* renamed from: c */
    ArrayList f4208c = new ArrayList();

    /* renamed from: d */
    boolean f4209d = false;

    /* renamed from: a */
    public AbstractC0657ar mo102a(String str) {
        return new C0652ao(str, this);
    }

    /* renamed from: a */
    public AbstractC0658as mo106a() {
        return new C0653ap(this);
    }

    /* renamed from: a */
    public void mo103a(C0648am c0648am) {
        this.f4216e = c0648am;
        if (this.f4209d) {
            LoggerMaybe.LogDebug2("AndroidMusicFactory already loaded");
        }
        LoggerMaybe.LogDebug2("AndroidMusicFactory - load");
        this.f4209d = true;
        this.f4206a.add(new MediaPlayer());
        this.f4206a.add(new MediaPlayer());
        this.f4207b.addAll(this.f4206a);
    }

    /* renamed from: b */
    public void mo101b() {
    }
}
