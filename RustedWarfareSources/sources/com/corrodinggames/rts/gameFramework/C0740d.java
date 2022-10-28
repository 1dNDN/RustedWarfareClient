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
    public void m2359a(StreamWriter streamWriter) {
        streamWriter.mo1373a(this.f4639b);
        streamWriter.mo1320a(this.f4640c);
        streamWriter.mo1320a(this.f4641d);
        streamWriter.mo1320a(this.f4642e);
        streamWriter.mo1320a(this.f4643f);
        streamWriter.WriteInteger(this.f4644g);
        streamWriter.mo1363a(this.f4645h);
        streamWriter.mo1314a(this.f4638a != null);
        if (this.f4638a != null) {
            this.f4638a.m1167a(streamWriter);
        }
    }

    /* renamed from: a */
    public void m2358a(Reader reader) {
        this.f4639b = reader.m1283i();
        this.f4640c = reader.m1285g();
        this.f4641d = reader.m1285g();
        this.f4642e = reader.m1285g();
        this.f4643f = reader.m1285g();
        this.f4644g = reader.ReadInt();
        this.f4645h = (EnumC0246ao) reader.m1293b(EnumC0246ao.class);
        if (reader.ReadBool()) {
            this.f4638a = new C0906k(null, false);
            this.f4638a.m1166a(reader);
        }
    }
}
