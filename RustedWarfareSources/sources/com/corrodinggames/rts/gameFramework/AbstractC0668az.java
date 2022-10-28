package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.gameFramework.az */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/az.class */
public abstract class AbstractC0668az extends AbstractC1120w {

    /* renamed from: eu */
    public int f4233eu;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0668az(boolean z) {
        super(z);
        this.f4233eu = 0;
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1352d("xy is:");
        streamWriter.mo1320a(this.f6957el);
        streamWriter.mo1320a(this.f6958em);
        streamWriter.mo1320a(this.f6959en);
        streamWriter.WriteInteger(this.f4233eu);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        this.f6957el = reader.m1285g();
        this.f6958em = reader.m1285g();
        this.f6959en = reader.m1285g();
        this.f4233eu = reader.ReadInt();
        super.mo2291a(reader);
    }
}
