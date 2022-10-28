package com.corrodinggames.rts.gameFramework.p041i;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.i.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/l.class */
public class C0877l {

    /* renamed from: a */
    public String f5867a;

    /* renamed from: b */
    public ByteArrayInputStream f5868b;

    /* renamed from: c */
    public DataInputStream f5869c;

    public C0877l(byte[] bArr, boolean z, boolean z2) {
        InputStream inputStream;
        this.f5868b = new ByteArrayInputStream(bArr);
        if (z) {
            inputStream = new BufferedInputStream(new GZIPInputStream(this.f5868b));
        } else {
            inputStream = this.f5868b;
        }
        this.f5869c = new DataInputStream(inputStream);
    }
}
