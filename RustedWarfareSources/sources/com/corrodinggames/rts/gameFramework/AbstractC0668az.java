package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.gameFramework.az */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/az.class */
public abstract class AbstractC0668az extends AbstractC1120w {

    /* renamed from: eu */
    public int f4233eu;

    public AbstractC0668az(boolean z) {
        super(z);
        this.f4233eu = 0;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.m1398d("xy is:");
        streamWriter.mo1335a(this.f6958el);
        streamWriter.mo1335a(this.f6959em);
        streamWriter.mo1335a(this.f6960en);
        streamWriter.WriteInteger(this.f4233eu);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m2686a(Reader reader) {
        this.f6958el = reader.m1300g();
        this.f6959em = reader.m1300g();
        this.f6960en = reader.m1300g();
        this.f4233eu = reader.ReadInt();
        super.m440a(reader);
    }
}
