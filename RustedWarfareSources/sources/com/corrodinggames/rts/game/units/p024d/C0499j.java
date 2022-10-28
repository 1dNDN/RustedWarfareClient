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
    public C0449h f3489e;

    /* renamed from: f */
    public boolean f3490f;

    /* renamed from: g */
    public InterfaceC0303as f3491g;

    /* renamed from: h */
    public PointF f3492h;

    /* renamed from: i */
    public AbstractC0244am f3493i;

    /* renamed from: k */
    public boolean f3495k;

    /* renamed from: l */
    public boolean f3496l;

    /* renamed from: c */
    public C0424b f3487c = C0424b.f2710a;

    /* renamed from: d */
    public C0424b f3488d = null;

    /* renamed from: j */
    public C0208c f3494j = AbstractC0224s.f1462i;

    /* renamed from: m */
    public float f3497m = -1.0f;

    /* renamed from: n */
    public double f3498n = 0.0d;

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(-1);
        streamWriter.WriteInteger(this.f3485a);
        streamWriter.mo1320a(this.f3486b);
        streamWriter.WriteInteger(-1);
        streamWriter.WriteInteger(this.f3487c.m3919a());
        streamWriter.mo1314a(this.f3490f);
        streamWriter.WriteUTF(this.f3494j.m4537a());
        streamWriter.WriteUTF(this.f3494j.m4537a());
        streamWriter.mo1359b(this.f3493i);
        streamWriter.mo1372a(this.f3492h);
        streamWriter.mo1314a(this.f3496l);
        streamWriter.mo1320a(this.f3497m);
        streamWriter.mo1370a(this.f3491g);
        this.f3487c.m3903a(streamWriter);
        C0424b.m3902a(streamWriter, this.f3488d);
        C0448g.m3752a(this.f3489e, streamWriter);
    }

    /* renamed from: a */
    public void m3343a(Reader reader) {
        String.valueOf(reader.ReadInt());
        this.f3485a = reader.ReadInt();
        this.f3486b = reader.m1285g();
        int i = 0;
        if (reader.m1295b() >= 4) {
            this.f3494j = C0208c.m4533a(String.valueOf(reader.ReadInt()));
        }
        if (reader.m1295b() >= 6) {
            i = reader.ReadInt();
        }
        if (reader.m1295b() >= 25) {
            this.f3490f = reader.ReadBool();
        }
        if (reader.m1295b() >= 33) {
            reader.ReadUTF();
            this.f3494j = C0208c.m4533a(reader.ReadUTF());
        }
        if (reader.m1295b() >= 61) {
            this.f3493i = reader.m1277o();
            this.f3492h = reader.m1267y();
        }
        if (reader.m1295b() >= 64) {
            this.f3496l = reader.ReadBool();
            this.f3497m = reader.m1285g();
        }
        if (reader.m1295b() >= 71) {
            this.f3491g = reader.m1275q();
        }
        if (reader.m1295b() >= 73) {
            this.f3487c = C0424b.m3890b(reader);
        } else {
            this.f3487c = C0424b.m3918a(i);
        }
        if (reader.m1295b() >= 91) {
            this.f3488d = C0424b.m3901a(reader);
        }
        if (reader.m1295b() >= 95) {
            this.f3489e = C0448g.m3751a(reader);
        }
    }
}
