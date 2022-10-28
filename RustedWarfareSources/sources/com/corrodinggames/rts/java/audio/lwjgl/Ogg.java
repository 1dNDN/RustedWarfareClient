package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.java.audio.p050a.C1130a;
import com.corrodinggames.rts.java.audio.p050a.C1148s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg.class */
public class Ogg {

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$Music.class */
    public class Music extends OpenALMusic {
        private OggInputStream input;
        private OggInputStream previousInput;

        public Music(OpenALAudio openALAudio, C1130a c1130a) {
            super(openALAudio, c1130a);
            if (openALAudio.noDevice) {
                return;
            }
            this.input = new OggInputStream(c1130a.m382a());
            setup(this.input.getChannels(), this.input.getSampleRate());
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public int read(byte[] bArr) {
            if (this.input == null) {
                this.input = new OggInputStream(this.file.m382a(), this.previousInput);
                setup(this.input.getChannels(), this.input.getSampleRate());
                this.previousInput = null;
            }
            return this.input.read(bArr);
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void reset() {
            C1148s.m306a(this.input);
            this.previousInput = null;
            this.input = null;
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        protected void loop() {
            C1148s.m306a(this.input);
            this.previousInput = this.input;
            this.input = null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$MusicWithThreadedLoader.class */
    public class MusicWithThreadedLoader extends OpenALMusic {
        private OggInputStream input;
        private OggInputStream previousInput;
        ThreadedWrappingAudioInputStream backgroundInput;

        public MusicWithThreadedLoader(OpenALAudio openALAudio, C1130a c1130a) {
            super(openALAudio, c1130a);
            if (openALAudio.noDevice) {
                return;
            }
            this.input = new OggInputStream(c1130a.m382a());
            setup(this.input.getChannels(), this.input.getSampleRate());
            this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public int read(byte[] bArr) {
            double m2368a;
            if (this.input == null) {
                this.input = new OggInputStream(this.file.m382a(), this.previousInput);
                setup(this.input.getChannels(), this.input.getSampleRate());
                this.previousInput = null;
                this.backgroundInput = new ThreadedWrappingAudioInputStream(this.input);
            }
            long m2370a = C0727bl.m2370a();
            int read = this.backgroundInput.read(bArr);
            if (C0727bl.m2368a(m2370a) > 0.5d) {
                AbstractC0916l.m963e("ogg read took:" + C0727bl.m2369a(m2368a));
            }
            return read;
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void backgroundUpdate() {
            try {
                if (this.input != null && this.backgroundInput != null) {
                    this.backgroundInput.backgroundFillBuffer();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        public void reset() {
            C1148s.m306a(this.input);
            this.previousInput = null;
            this.input = null;
            this.backgroundInput.close();
        }

        @Override // com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic
        protected void loop() {
            C1148s.m306a(this.input);
            this.previousInput = this.input;
            this.input = null;
            this.backgroundInput.close();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/Ogg$Sound.class */
    public class Sound extends OpenALSound {
        public Sound(OpenALAudio openALAudio, C1130a c1130a) {
            super(openALAudio);
            int read;
            if (openALAudio.noDevice) {
                return;
            }
            OggInputStream oggInputStream = null;
            try {
                oggInputStream = new OggInputStream(c1130a.m382a());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
                byte[] bArr = new byte[2048];
                while (!oggInputStream.atEnd() && (read = oggInputStream.read(bArr)) != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                setup(byteArrayOutputStream.toByteArray(), oggInputStream.getChannels(), oggInputStream.getSampleRate());
                C1148s.m306a(oggInputStream);
            } catch (Throwable th) {
                C1148s.m306a(oggInputStream);
                throw th;
            }
        }
    }
}
