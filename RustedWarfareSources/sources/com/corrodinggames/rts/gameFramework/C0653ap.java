package com.corrodinggames.rts.gameFramework;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap.class */
public class C0653ap extends AbstractC0658as {

    /* renamed from: a */
    MediaPlayer f4211a;

    /* renamed from: b */
    C0652ao f4212b;

    /* renamed from: c */
    C0651an f4213c;

    public C0653ap(C0651an c0651an) {
        this.f4213c = c0651an;
        if (c0651an.f4207b.size() == 0) {
            throw new RuntimeException("Music player pool empty");
        }
        MediaPlayer mediaPlayer = (MediaPlayer) c0651an.f4207b.remove(0);
        c0651an.f4208c.add(this);
        this.f4211a = mediaPlayer;
    }

    /* renamed from: a */
    public void mo94a(AbstractC0657ar abstractC0657ar) {
        this.f4212b = (C0652ao) abstractC0657ar;
    }

    /* renamed from: a */
    public void mo93a(boolean z) {
        try {
            MediaPlayer mediaPlayer = this.f4211a;
            mediaPlayer.reset();
            AssetFileDescriptor assetFileDescriptor = null;
            if (this.f4212b.f4217b.startsWith("music")) {
                try {
                    assetFileDescriptor = this.f4213c.f4216e.f4177w.mo5603d().m5588b(C0750a.m2226e(this.f4212b.f4217b));
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                String m2226e = C0750a.m2226e(this.f4212b.f4217b);
                if (C1075ae.m613a(m2226e) == null) {
                    mediaPlayer.setDataSource(m2226e);
                } else {
                    C1098j m2220j = C0750a.m2220j(m2226e);
                    if (m2220j == null) {
                        throw new RuntimeException("openAssetSteam() null for '" + m2226e + "'");
                    }
                    File m2246a = C0750a.m2246a(this.f4213c.f4216e.f4177w, "music", "ogg");
                    LoggerMaybe.LogDebug2("Temp file needed for this music from zipped/abstract mod file");
                    FileOutputStream fileOutputStream = new FileOutputStream(m2246a);
                    C0758f.m2136a(m2220j, fileOutputStream);
                    fileOutputStream.close();
                    m2220j.close();
                    FileInputStream fileInputStream = new FileInputStream(m2246a);
                    try {
                        mediaPlayer.setDataSource(fileInputStream.getFD(), 0L, fileInputStream.available());
                        fileInputStream.close();
                        m2246a.delete();
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                }
            }
            if (z) {
                mediaPlayer.setLooping(true);
            }
            mediaPlayer.setVolume(0.0f, 0.0f);
            mediaPlayer.setOnInfoListener(new C06541());
            mediaPlayer.setOnPreparedListener(new C06552());
            mediaPlayer.prepareAsync();
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.ap$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap$1.class */
    class C06541 implements MediaPlayer.OnInfoListener {
        C06541() {
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.ap$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ap$2.class */
    class C06552 implements MediaPlayer.OnPreparedListener {
        C06552() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.start();
        }
    }

    /* renamed from: a */
    public void mo96a() {
        this.f4211a.pause();
    }

    /* renamed from: b */
    public void mo92b() {
        this.f4211a.start();
    }

    /* renamed from: c */
    public boolean mo91c() {
        return this.f4211a.isPlaying();
    }

    /* renamed from: d */
    public void mo90d() {
        if (this.f4211a != null) {
            this.f4211a.stop();
        }
    }

    /* renamed from: e */
    public void mo89e() {
        if (this.f4211a != null) {
            this.f4211a.stop();
        }
        this.f4211a = null;
        this.f4213c.f4208c.remove(this);
        this.f4213c.f4207b.add(this.f4211a);
    }

    /* renamed from: a */
    public void mo95a(float f) {
        this.f4211a.setVolume(f, f);
    }
}
