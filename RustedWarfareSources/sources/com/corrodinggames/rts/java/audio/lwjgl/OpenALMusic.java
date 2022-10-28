package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.Music;
import com.corrodinggames.rts.java.audio.p050a.C1130a;
import com.corrodinggames.rts.java.audio.p050a.C1131b;
import com.corrodinggames.rts.java.audio.p050a.C1132c;
import com.corrodinggames.rts.java.audio.p050a.C1142m;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/OpenALMusic.class */
public abstract class OpenALMusic implements Music {
    private static final int bufferCount = 3;
    private static final int bytesPerSample = 2;
    private final OpenALAudio audio;
    private IntBuffer buffers;
    private int format;
    private int sampleRate;
    private boolean isLooping;
    private boolean isPlaying;
    private float renderedSeconds;
    private float maxSecondsPerBuffer;
    protected final C1130a file;
    private static final int bufferSize = 40960;
    private static final byte[] tempBytes = new byte[bufferSize];
    private static final ByteBuffer tempBuffer = BufferUtils.createByteBuffer((int) bufferSize);
    private C1131b renderedSecondsQueue = new C1131b(3);
    private int sourceID = -1;
    private float volume = 1.0f;
    private float pan = 0.0f;
    protected int bufferOverhead = 0;
    private Music.OnCompletionListener onCompletionListener = null;

    public abstract int read(byte[] bArr);

    public OpenALMusic(OpenALAudio openALAudio, C1130a c1130a) {
        this.audio = openALAudio;
        this.file = c1130a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setup(int i, int i2) {
        this.format = i > 1 ? 4355 : 4353;
        this.sampleRate = i2;
        this.maxSecondsPerBuffer = (bufferSize - this.bufferOverhead) / ((2 * i) * i2);
    }

    public void playWhenReady() {
        if (this.audio.noDevice) {
        }
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public void play() {
        if (this.audio.noDevice) {
            return;
        }
        if (this.sourceID == -1) {
            this.sourceID = this.audio.obtainSource(true);
            if (this.sourceID == -1) {
                return;
            }
            this.audio.music.add(this);
            if (this.buffers == null) {
                this.buffers = BufferUtils.createIntBuffer(3);
                AL10.alGenBuffers(this.buffers);
                int alGetError = AL10.alGetError();
                if (alGetError != 0) {
                    throw new C1132c("Unable to allocate audio buffers. AL Error: " + alGetError);
                }
            }
            AL10.alSourcei(this.sourceID, 4103, 0);
            setPan(this.pan, this.volume);
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                int i2 = this.buffers.get(i);
                if (!fill(i2)) {
                    break;
                }
                z = true;
                AL10.alSourceQueueBuffers(this.sourceID, i2);
            }
            if (!z && this.onCompletionListener != null) {
                this.onCompletionListener.onCompletion(this);
            }
            if (AL10.alGetError() != 0) {
                stop();
                return;
            }
        }
        if (!this.isPlaying) {
            AL10.alSourcePlay(this.sourceID);
            this.isPlaying = true;
        }
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public void stop() {
        if (this.audio.noDevice || this.sourceID == -1) {
            return;
        }
        this.audio.music.remove(this);
        reset();
        this.audio.freeSource(this.sourceID);
        this.sourceID = -1;
        this.renderedSeconds = 0.0f;
        this.renderedSecondsQueue.m374c();
        this.isPlaying = false;
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public void pause() {
        if (this.audio.noDevice) {
            return;
        }
        if (this.sourceID != -1) {
            AL10.alSourcePause(this.sourceID);
        }
        this.isPlaying = false;
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public boolean isPlaying() {
        if (this.audio.noDevice || this.sourceID == -1) {
            return false;
        }
        return this.isPlaying;
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public void setLooping(boolean z) {
        this.isLooping = z;
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public boolean isLooping() {
        return this.isLooping;
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public void setVolume(float f) {
        this.volume = f;
        if (!this.audio.noDevice && this.sourceID != -1) {
            AL10.alSourcef(this.sourceID, 4106, f);
        }
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public float getVolume() {
        return this.volume;
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public void setPan(float f, float f2) {
        this.volume = f2;
        this.pan = f;
        if (this.audio.noDevice || this.sourceID == -1) {
            return;
        }
        AL10.alSource3f(this.sourceID, 4100, C1142m.m328b(((f - 1.0f) * 3.1415927f) / 2.0f), 0.0f, C1142m.m331a(((f + 1.0f) * 3.1415927f) / 2.0f));
        AL10.alSourcef(this.sourceID, 4106, f2);
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public void setPosition(float f) {
        if (this.audio.noDevice || this.sourceID == -1) {
            return;
        }
        boolean z = this.isPlaying;
        this.isPlaying = false;
        AL10.alSourceStop(this.sourceID);
        AL10.alSourceUnqueueBuffers(this.sourceID, this.buffers);
        while (this.renderedSecondsQueue.f7007b > 0) {
            this.renderedSeconds = this.renderedSecondsQueue.m380a();
        }
        if (f <= this.renderedSeconds) {
            reset();
            this.renderedSeconds = 0.0f;
        }
        while (this.renderedSeconds < f - this.maxSecondsPerBuffer && read(tempBytes) > 0) {
            this.renderedSeconds += this.maxSecondsPerBuffer;
        }
        this.renderedSecondsQueue.m379a(this.renderedSeconds);
        boolean z2 = false;
        for (int i = 0; i < 3; i++) {
            int i2 = this.buffers.get(i);
            if (!fill(i2)) {
                break;
            }
            z2 = true;
            AL10.alSourceQueueBuffers(this.sourceID, i2);
        }
        this.renderedSecondsQueue.m380a();
        if (!z2) {
            stop();
            if (this.onCompletionListener != null) {
                this.onCompletionListener.onCompletion(this);
            }
        }
        AL10.alSourcef(this.sourceID, 4132, f - this.renderedSeconds);
        if (z) {
            AL10.alSourcePlay(this.sourceID);
            this.isPlaying = true;
        }
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public float getPosition() {
        if (this.audio.noDevice || this.sourceID == -1) {
            return 0.0f;
        }
        return this.renderedSeconds + AL10.alGetSourcef(this.sourceID, 4132);
    }

    public void reset() {
    }

    protected void loop() {
        reset();
    }

    public int getChannels() {
        return this.format == 4355 ? 2 : 1;
    }

    public int getRate() {
        return this.sampleRate;
    }

    public void backgroundUpdate() {
    }

    public void update() {
        int alSourceUnqueueBuffers;
        if (this.audio.noDevice || this.sourceID == -1) {
            return;
        }
        boolean z = false;
        int alGetSourcei = AL10.alGetSourcei(this.sourceID, 4118);
        while (true) {
            int i = alGetSourcei;
            alGetSourcei--;
            if (i <= 0 || (alSourceUnqueueBuffers = AL10.alSourceUnqueueBuffers(this.sourceID)) == 40963) {
                break;
            }
            this.renderedSeconds = this.renderedSecondsQueue.m380a();
            if (!z) {
                if (fill(alSourceUnqueueBuffers)) {
                    AL10.alSourceQueueBuffers(this.sourceID, alSourceUnqueueBuffers);
                } else {
                    z = true;
                }
            }
        }
        if (z && AL10.alGetSourcei(this.sourceID, 4117) == 0) {
            stop();
            if (this.onCompletionListener != null) {
                this.onCompletionListener.onCompletion(this);
            }
        }
        if (!this.isPlaying || AL10.alGetSourcei(this.sourceID, 4112) == 4114) {
            return;
        }
        AL10.alSourcePlay(this.sourceID);
    }

    private boolean fill(int i) {
        tempBuffer.clear();
        int read = read(tempBytes);
        if (read <= 0) {
            if (this.isLooping) {
                loop();
                read = read(tempBytes);
                if (read <= 0) {
                    return false;
                }
                if (this.renderedSecondsQueue.f7007b > 0) {
                    this.renderedSecondsQueue.m377a(0, 0.0f);
                }
            } else {
                return false;
            }
        }
        this.renderedSecondsQueue.m375b(0, (this.renderedSecondsQueue.f7007b > 0 ? this.renderedSecondsQueue.m376b() : 0.0f) + ((this.maxSecondsPerBuffer * read) / 40960.0f));
        tempBuffer.put(tempBytes, 0, read).flip();
        AL10.alBufferData(i, this.format, tempBuffer, this.sampleRate);
        return true;
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public void dispose() {
        stop();
        if (this.audio.noDevice || this.buffers == null) {
            return;
        }
        AL10.alDeleteBuffers(this.buffers);
        this.buffers = null;
        this.onCompletionListener = null;
    }

    @Override // com.corrodinggames.rts.java.audio.Music
    public void setOnCompletionListener(Music.OnCompletionListener onCompletionListener) {
        this.onCompletionListener = onCompletionListener;
    }

    public int getSourceId() {
        return this.sourceID;
    }
}
