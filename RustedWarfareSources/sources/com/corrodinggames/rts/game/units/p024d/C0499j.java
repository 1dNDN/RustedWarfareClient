package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.game.units.d.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/j.class */
public class C0499j extends AbstractC0726bk {

    /* renamed from: a */
    public int f3485a;

    /* renamed from: b */
    public float f3486b;

    /* renamed from: e */
    public C0449h f3487e;

    /* renamed from: f */
    public boolean f3488f;

    /* renamed from: g */
    public InterfaceC0303as f3489g;

    /* renamed from: h */
    public PointF f3490h;

    /* renamed from: i */
    public AbstractC0244am f3491i;

    /* renamed from: k */
    public boolean f3492k;

    /* renamed from: l */
    public boolean f3493l;

    /* renamed from: c */
    public C0424b f3494c = C0424b.f2710a;

    /* renamed from: d */
    public C0424b f3495d = null;

    /* renamed from: j */
    public C0208c f3496j = AbstractC0224s.f1462i;

    /* renamed from: m */
    public float f3497m = -1.0f;

    /* renamed from: n */
    public double f3498n = 0.0d;

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(-1);
        streamWriter.WriteInteger(this.f3485a);
        streamWriter.mo1335a(this.f3486b);
        streamWriter.WriteInteger(-1);
        streamWriter.WriteInteger(this.f3494c.m4126a());
        streamWriter.mo1329a(this.f3488f);
        streamWriter.WriteUTF(this.f3496j.m4992a());
        streamWriter.WriteUTF(this.f3496j.m4992a());
        streamWriter.m1406b(this.f3491i);
        streamWriter.m1423a(this.f3490h);
        streamWriter.mo1329a(this.f3493l);
        streamWriter.mo1335a(this.f3497m);
        streamWriter.m1421a(this.f3489g);
        this.f3494c.m4110a(streamWriter);
        C0424b.m4109a(streamWriter, this.f3495d);
        C0448g.m3959a(this.f3487e, streamWriter);
    }

    /* renamed from: a */
    public void m3468a(Reader reader) {
        String.valueOf(reader.ReadInt());
        this.f3485a = reader.ReadInt();
        this.f3486b = reader.m1300g();
        int i = 0;
        if (reader.m1310b() >= 4) {
            this.f3496j = C0208c.m4988a(String.valueOf(reader.ReadInt()));
        }
        if (reader.m1310b() >= 6) {
            i = reader.ReadInt();
        }
        if (reader.m1310b() >= 25) {
            this.f3488f = reader.ReadBool();
        }
        if (reader.m1310b() >= 33) {
            reader.ReadUTF();
            this.f3496j = C0208c.m4988a(reader.ReadUTF());
        }
        if (reader.m1310b() >= 61) {
            this.f3491i = reader.m1292o();
            this.f3490h = reader.m1282y();
        }
        if (reader.m1310b() >= 64) {
            this.f3493l = reader.ReadBool();
            this.f3497m = reader.m1300g();
        }
        if (reader.m1310b() >= 71) {
            this.f3489g = reader.m1290q();
        }
        if (reader.m1310b() >= 73) {
            this.f3494c = C0424b.m4097b(reader);
        } else {
            this.f3494c = C0424b.m4125a(i);
        }
        if (reader.m1310b() >= 91) {
            this.f3495d = C0424b.m4108a(reader);
        }
        if (reader.m1310b() >= 95) {
            this.f3487e = C0448g.m3958a(reader);
        }
    }
}
