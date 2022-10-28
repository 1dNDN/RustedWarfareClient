package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: com.corrodinggames.rts.gameFramework.i.aw */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/aw.class */
public class C0864aw {

    /* renamed from: a */
    public BufferedOutputStream f5752a;

    /* renamed from: b */
    public String f5753b;

    /* renamed from: d */
    public PrintStream f5754d;

    /* renamed from: e */
    public boolean f5755e = false;

    /* renamed from: c */
    public ByteArrayOutputStream f5756c = new ByteArrayOutputStream();

    /* renamed from: a */
    public void m1350a() {
        this.f5754d.flush();
        if (this.f5752a != null) {
            this.f5752a.flush();
        }
    }

    /* renamed from: b */
    public void m1349b() {
        if (!this.f5755e) {
            this.f5754d.close();
        } else {
            LoggerMaybe.m965g("TODO: Cannot yet close wrapped stream");
        }
    }

    public C0864aw(boolean z) {
        OutputStream outputStream;
        if (z) {
            this.f5752a = new BufferedOutputStream(this.f5756c);
            outputStream = this.f5752a;
        } else {
            outputStream = this.f5756c;
        }
        this.f5754d = new PrintStream(outputStream);
    }
}
