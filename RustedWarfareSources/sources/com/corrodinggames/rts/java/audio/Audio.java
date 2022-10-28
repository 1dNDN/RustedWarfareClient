package com.corrodinggames.rts.java.audio;

import com.corrodinggames.rts.java.audio.p050a.C1130a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/Audio.class */
public interface Audio {
    AudioDevice newAudioDevice(int i, boolean z);

    AudioRecorder newAudioRecorder(int i, boolean z);

    Sound newSound(C1130a c1130a);

    Music newMusic(C1130a c1130a);
}
