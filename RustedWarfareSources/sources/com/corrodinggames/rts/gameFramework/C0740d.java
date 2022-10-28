package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p042j.C0906k;

/* renamed from: com.corrodinggames.rts.gameFramework.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d.class */
public class C0740d {

    /* renamed from: a */
    public C0906k f4638a;

    /* renamed from: b */
    public long f4639b;

    /* renamed from: c */
    public float f4640c;

    /* renamed from: d */
    public float f4641d;

    /* renamed from: e */
    public float f4642e;

    /* renamed from: f */
    public float f4643f;

    /* renamed from: g */
    public int f4644g;

    /* renamed from: h */
    public EnumC0246ao f4645h;

    /* renamed from: a */
    public void m2411a(StreamWriter streamWriter) {
        streamWriter.m1424a(this.f4639b);
        streamWriter.mo1335a(this.f4640c);
        streamWriter.mo1335a(this.f4641d);
        streamWriter.mo1335a(this.f4642e);
        streamWriter.mo1335a(this.f4643f);
        streamWriter.WriteInteger(this.f4644g);
        streamWriter.m1411a(this.f4645h);
        streamWriter.mo1329a(this.f4638a != null);
        if (this.f4638a != null) {
            this.f4638a.m1182a(streamWriter);
        }
    }

    /* renamed from: a */
    public void m2410a(Reader reader) {
        this.f4639b = reader.m1298i();
        this.f4640c = reader.m1300g();
        this.f4641d = reader.m1300g();
        this.f4642e = reader.m1300g();
        this.f4643f = reader.m1300g();
        this.f4644g = reader.ReadInt();
        this.f4645h = (EnumC0246ao) reader.m1308b(EnumC0246ao.class);
        if (reader.ReadBool()) {
            this.f4638a = new C0906k(null, false);
            this.f4638a.m1181a(reader);
        }
    }
}
