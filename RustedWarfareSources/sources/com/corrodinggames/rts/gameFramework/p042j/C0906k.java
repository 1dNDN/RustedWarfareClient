package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Paint;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/k.class */
public class C0906k {

    /* renamed from: a */
    private C0907l f5973a;

    /* renamed from: e */
    protected int f5974e;

    /* renamed from: f */
    protected static int f5975f;

    /* renamed from: g */
    public int f5976g;

    /* renamed from: h */
    protected short f5977h;

    /* renamed from: i */
    protected short f5978i;

    /* renamed from: j */
    protected Float f5979j;

    /* renamed from: k */
    protected boolean f5980k;

    /* renamed from: l */
    protected short f5981l;

    /* renamed from: m */
    protected short f5982m;

    /* renamed from: n */
    protected short f5983n;

    /* renamed from: o */
    protected EnumC0246ao f5984o;

    /* renamed from: p */
    public boolean f5985p;

    /* renamed from: q */
    public int f5986q;

    /* renamed from: r */
    public boolean f5987r;

    /* renamed from: s */
    public float f5988s;

    /* renamed from: t */
    public float f5989t;

    /* renamed from: u */
    public boolean f5990u;

    /* renamed from: v */
    protected boolean f5991v;

    /* renamed from: w */
    protected boolean f5992w;

    /* renamed from: x */
    protected LinkedList f5993x;

    /* renamed from: y */
    public byte[] f5994y;

    /* renamed from: z */
    public byte[] f5995z;

    /* renamed from: A */
    public byte[] f5996A;

    /* renamed from: B */
    public short[] f5997B;

    /* renamed from: C */
    public byte[] f5998C;

    public C0906k(C0907l c0907l, boolean z) {
        this.f5973a = c0907l;
        if (z) {
            int i = f5975f;
            f5975f = i + 1;
            this.f5974e = i;
        }
        this.f5976g = Core.m1087A().f6239bx;
    }

    /* renamed from: a */
    public void m1182a(StreamWriter streamWriter) {
        int i;
        if (this.f5993x == null) {
            streamWriter.mo1329a(false);
            return;
        }
        streamWriter.mo1329a(true);
        streamWriter.mo1331a("p", true);
        streamWriter.WriteInteger(this.f5993x.size());
        if (this.f5993x.size() != 0) {
            C0911p c0911p = (C0911p) this.f5993x.get(0);
            streamWriter.mo1330a(c0911p.f6074a);
            streamWriter.mo1330a(c0911p.f6075b);
            for (int i2 = 1; i2 < this.f5993x.size(); i2++) {
                C0911p c0911p2 = (C0911p) this.f5993x.get(i2);
                int i3 = c0911p2.f6074a - c0911p.f6074a;
                int i4 = c0911p2.f6075b - c0911p.f6075b;
                boolean z = C0758f.m2122d(i3) > 1 || C0758f.m2122d(i4) > 1;
                if (z) {
                    Core.LogDebug2("writeOutCompressedPath: out of range:" + i3 + "," + i4);
                    i = 128;
                } else {
                    i = i3 + 1 + ((i4 + 1) << 2);
                }
                streamWriter.m1401c(i);
                if (z) {
                    streamWriter.mo1330a(c0911p2.f6074a);
                    streamWriter.mo1330a(c0911p2.f6075b);
                }
                c0911p = c0911p2;
            }
        }
        streamWriter.mo1332a("p");
    }

    /* renamed from: a */
    public void m1181a(Reader reader) {
        if (!reader.ReadBool()) {
            this.f5993x = null;
            return;
        }
        reader.m1313a("p", true);
        int ReadInt = reader.ReadInt();
        if (ReadInt > 160000 || ReadInt < 0) {
            Core.LogDebug2("readInCompressedPath: Path too big at:" + ReadInt);
            ReadInt = -1;
        }
        if (ReadInt != -1) {
            this.f5990u = true;
            if (this.f5993x == null) {
                this.f5993x = new LinkedList();
            }
            this.f5993x.clear();
        }
        if (ReadInt > 0) {
            short m1285v = reader.m1285v();
            short m1285v2 = reader.m1285v();
            this.f5993x.add(new C0911p(m1285v, m1285v2));
            for (int i = 1; i < ReadInt; i++) {
                byte m1304d = reader.m1304d();
                if (m1304d < 128) {
                    int i2 = (m1304d & 3) - 1;
                    int i3 = ((m1304d & 12) >> 2) - 1;
                    if (C0758f.m2122d(i2) > 1 || C0758f.m2122d(i3) > 1) {
                        Core.LogDebug2("readInCompressedPath: out of range but shouldn't be:" + i2 + "," + i3 + " for: " + ((int) m1304d));
                    }
                    m1285v = (short) (m1285v + i2);
                    m1285v2 = (short) (m1285v2 + i3);
                    this.f5993x.add(new C0911p(m1285v, m1285v2));
                } else {
                    Core.LogDebug2("readInCompressedPath: out of range unpack:" + ((int) m1285v) + "," + ((int) m1285v2));
                    m1285v = reader.m1285v();
                    m1285v2 = reader.m1285v();
                    this.f5993x.add(new C0911p(m1285v, m1285v2));
                }
            }
        }
        reader.m1303d("p");
    }

    /* renamed from: e */
    public void m1175e() {
        C0904i m1167a = this.f5973a.m1167a(this.f5984o);
        if (m1167a == null) {
            throw new RuntimeException("Could not get costs for:" + this.f5984o.toString());
        }
        this.f5994y = m1167a.f5960d;
        this.f5995z = m1167a.f5961e;
        this.f5996A = m1167a.f5962f;
        this.f5997B = m1167a.f5963g;
        this.f5998C = m1167a.f5966j;
    }

    /* renamed from: f */
    public void m1174f() {
        this.f5994y = null;
        this.f5995z = null;
        this.f5996A = null;
        this.f5997B = null;
        this.f5998C = null;
    }

    /* renamed from: a */
    public void m1183a(EnumC0246ao enumC0246ao, short s, short s2, Float f, boolean z) {
        if (enumC0246ao == null) {
            throw new RuntimeException("MovementType is null");
        }
        this.f5984o = enumC0246ao;
        this.f5977h = s;
        this.f5978i = s2;
        this.f5979j = f;
        this.f5980k = z;
        if (this.f5977h < 0) {
            this.f5977h = (short) 0;
        }
        if (this.f5978i < 0) {
            this.f5978i = (short) 0;
        }
        if (this.f5977h > this.f5973a.f6014s - 1) {
            this.f5977h = (short) (this.f5973a.f6014s - 1);
        }
        if (this.f5978i > this.f5973a.f6015t - 1) {
            this.f5978i = (short) (this.f5973a.f6015t - 1);
        }
        if (this.f5973a.m1167a(enumC0246ao) == null) {
            throw new RuntimeException("Could not get costs for:" + enumC0246ao.toString());
        }
    }

    /* renamed from: a */
    public void m1178a(short s, short s2, short s3) {
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s > this.f5973a.f6014s - 1) {
            s = (short) (this.f5973a.f6014s - 1);
        }
        if (s2 > this.f5973a.f6015t - 1) {
            s2 = (short) (this.f5973a.f6015t - 1);
        }
        this.f5981l = s;
        this.f5982m = s2;
        this.f5983n = s3;
    }

    /* renamed from: b */
    public boolean mo1216b() {
        return false;
    }

    /* renamed from: a */
    public boolean mo1217a(C0906k c0906k) {
        return this == c0906k;
    }

    /* renamed from: a */
    public AbstractC0898c mo1218a(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: a */
    public LinkedList mo1221a() {
        Core m1087A = Core.m1087A();
        if (m1087A.f6122bX.lock1 || m1087A.f6126cb.m2465g()) {
            if (this.f5990u) {
                return this.f5993x;
            }
            return null;
        }
        return this.f5993x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1215c() {
        return this.f5993x != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m1179a(LinkedList linkedList) {
        this.f5993x = linkedList;
    }

    /* renamed from: g */
    public void m1173g() {
        Core m1087A = Core.m1087A();
        C0173b c0173b = m1087A.f6110bL;
        Paint paint = new Paint();
        paint.m5936a(2.0f);
        paint.m5933a(100, 0, 100, 0);
        m1087A.f6113bO.mo223a(((this.f5981l * c0173b.f785n) + c0173b.f787p) - Core.m1087A().f6142ct, ((this.f5982m * c0173b.f786o) + c0173b.f788q) - Core.m1087A().f6143cu, this.f5983n * c0173b.f785n, paint);
        paint.m5933a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0, 0, 255);
        m1087A.f6113bO.mo225a(((this.f5977h * c0173b.f785n) + c0173b.f787p) - Core.m1087A().f6142ct, ((this.f5978i * c0173b.f786o) + c0173b.f788q) - Core.m1087A().f6143cu, ((this.f5981l * c0173b.f785n) + c0173b.f787p) - Core.m1087A().f6142ct, ((this.f5982m * c0173b.f786o) + c0173b.f788q) - Core.m1087A().f6143cu, paint);
    }

    /* renamed from: h */
    public void m1172h() {
        if (this.f5993x != null) {
            Core m1087A = Core.m1087A();
            C0173b c0173b = m1087A.f6110bL;
            if (this.f5993x.size() >= 1) {
                for (int i = 1; i < this.f5993x.size(); i++) {
                    C0911p c0911p = (C0911p) this.f5993x.get(i);
                    C0911p c0911p2 = (C0911p) this.f5993x.get(i - 1);
                    Paint paint = new Paint();
                    paint.m5933a(255, 0, 255, 0);
                    paint.m5936a(2.0f);
                    m1087A.f6113bO.mo225a(((c0911p.f6074a * c0173b.f785n) + c0173b.f787p) - Core.m1087A().f6142ct, ((c0911p.f6075b * c0173b.f786o) + c0173b.f788q) - Core.m1087A().f6143cu, ((c0911p2.f6074a * c0173b.f785n) + c0173b.f787p) - Core.m1087A().f6142ct, ((c0911p2.f6075b * c0173b.f786o) + c0173b.f788q) - Core.m1087A().f6143cu, paint);
                }
            }
        }
    }
}
