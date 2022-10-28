package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.i.as */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/as.class */
public class C0860as {

    /* renamed from: a */
    public GZIPOutputStream f5734a;

    /* renamed from: b */
    public BufferedOutputStream f5735b;

    /* renamed from: c */
    public String f5736c;

    /* renamed from: e */
    public DataOutputStream f5737e;

    /* renamed from: f */
    public boolean f5738f = false;

    /* renamed from: d */
    public ByteArrayOutputStream f5739d = new ByteArrayOutputStream();

    /* renamed from: a */
    public void m1379a() {
        this.f5737e.flush();
        if (this.f5735b != null) {
            this.f5735b.flush();
        }
        if (this.f5734a != null) {
            this.f5734a.finish();
        }
    }

    /* renamed from: b */
    public void m1378b() {
        if (!this.f5738f) {
            this.f5737e.close();
        } else {
            LoggerMaybe.m965g("TODO: Cannot yet close wrapped stream");
        }
    }

    public C0860as(boolean z) {
        OutputStream outputStream;
        if (z) {
            this.f5734a = new GZIPOutputStream(this.f5739d);
            this.f5735b = new BufferedOutputStream(this.f5734a);
            outputStream = this.f5735b;
        } else {
            outputStream = this.f5739d;
        }
        this.f5737e = new DataOutputStream(outputStream);
    }
}
