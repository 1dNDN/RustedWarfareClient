package com.corrodinggames.rts.game;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/k.class */
public class RunnableC0194k implements Runnable {

    /* renamed from: a */
    public Bitmap f1286a;

    /* renamed from: b */
    public int f1287b;

    /* renamed from: c */
    final /* synthetic */ C0191i f1288c;

    public void run() {
        synchronized (this) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f1288c.f1224h + "image_" + String.format("%07d", Integer.valueOf(this.f1287b)) + ".jpg"));
                this.f1286a.m5577a(Bitmap.CompressFormat.f135a, 85, fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                this.f1288c.f6234bo = false;
                this.f1288c.m1037a("Error saving jpg, recording has stopped. Is there free space remaining on the SD card?", 1);
            }
        }
    }
}
