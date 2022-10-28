package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.Core;
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
    public DataOutputStream f5738e;

    /* renamed from: f */
    public boolean f5739f = false;

    /* renamed from: d */
    public ByteArrayOutputStream f5737d = new ByteArrayOutputStream();

    /* renamed from: a */
    public void m1392a() {
        this.f5738e.flush();
        if (this.f5735b != null) {
            this.f5735b.flush();
        }
        if (this.f5734a != null) {
            this.f5734a.finish();
        }
    }

    /* renamed from: b */
    public void m1391b() {
        if (!this.f5739f) {
            this.f5738e.close();
        } else {
            Core.m973g("TODO: Cannot yet close wrapped stream");
        }
    }

    public C0860as(boolean z) {
        OutputStream outputStream;
        if (z) {
            this.f5734a = new GZIPOutputStream(this.f5737d);
            this.f5735b = new BufferedOutputStream(this.f5734a);
            outputStream = this.f5735b;
        } else {
            outputStream = this.f5737d;
        }
        this.f5738e = new DataOutputStream(outputStream);
    }
}
