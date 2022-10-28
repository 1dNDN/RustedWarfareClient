package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.appFramework.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/b.class */
public class ActivityC0089b extends Activity {

    /* renamed from: b */
    ArrayList f421b = new ArrayList();

    /* renamed from: a */
    public void m4814a(Runnable runnable) {
        synchronized (this.f421b) {
            this.f421b.add(runnable);
        }
    }
}
