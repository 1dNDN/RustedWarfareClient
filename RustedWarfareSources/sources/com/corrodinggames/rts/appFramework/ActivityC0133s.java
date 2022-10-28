package com.corrodinggames.rts.appFramework;

import android.net.Uri;

/* renamed from: com.corrodinggames.rts.appFramework.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/s.class */
public class ActivityC0133s extends ActivityC0089b {

    /* renamed from: d */
    static boolean f545d = false;

    /* renamed from: c */
    boolean f544c = true;

    /* renamed from: e */
    int[] f546e = {100, 250, 500, 1000, 2000, 5000, 10000};

    /* renamed from: f */
    AbstractC0094d f547f = new AbstractC0094d() { // from class: com.corrodinggames.rts.appFramework.s.1
    };

    /* renamed from: l */
    public void m4748l() {
        C0090c.m4811a(this, 9, true, "Select a Rusted Warfare Folder to use", Uri.parse("content://com.android.externalstorage.documents/document/primary%3A" + "rustedWarfare".replace("//", "%2F")));
    }
}
