package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.gameFramework.bj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bj.class */
public class C0725bj {

    /* renamed from: a */
    public int f4557a;

    /* renamed from: b */
    public int f4558b;

    /* renamed from: c */
    public int f4559c;

    /* renamed from: d */
    public int f4560d;

    /* renamed from: e */
    public int f4561e;

    /* renamed from: f */
    public int f4562f;

    /* renamed from: g */
    public int f4563g;

    /* renamed from: h */
    public int f4564h;

    /* renamed from: i */
    public int f4565i;

    /* renamed from: j */
    public int f4566j;

    /* renamed from: k */
    public long f4567k;

    /* renamed from: l */
    final /* synthetic */ C0722bg f4568l;

    public C0725bj(C0722bg c0722bg) {
        this.f4568l = c0722bg;
    }

    /* renamed from: a */
    public void m2390a(StreamWriter streamWriter) {
        streamWriter.mo1355c(0);
        streamWriter.mo1351e();
        streamWriter.WriteInteger(this.f4557a);
        streamWriter.WriteInteger(this.f4558b);
        streamWriter.WriteInteger(this.f4559c);
        streamWriter.WriteInteger(this.f4560d);
        streamWriter.WriteInteger(this.f4561e);
        streamWriter.WriteInteger(this.f4562f);
        streamWriter.WriteInteger(this.f4563g);
        streamWriter.WriteInteger(this.f4564h);
        streamWriter.WriteInteger(this.f4565i);
        streamWriter.WriteInteger(this.f4566j);
        streamWriter.mo1373a(this.f4567k);
    }

    /* renamed from: a */
    public void m2389a(Reader reader) {
        reader.m1289d();
        reader.m1299a("stats start");
        this.f4557a = reader.ReadInt();
        this.f4558b = reader.ReadInt();
        this.f4559c = reader.ReadInt();
        this.f4560d = reader.ReadInt();
        this.f4561e = reader.ReadInt();
        this.f4562f = reader.ReadInt();
        this.f4563g = reader.ReadInt();
        this.f4564h = reader.ReadInt();
        this.f4565i = reader.ReadInt();
        this.f4566j = reader.ReadInt();
        this.f4567k = reader.m1283i();
    }
}
