package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a.class */
public class C0470a extends AbstractC0498i {

    /* renamed from: f */
    int f3367f;

    /* renamed from: g */
    float f3368g;

    /* renamed from: a */
    static C0934e f3362a = null;

    /* renamed from: b */
    static C0934e f3363b = null;

    /* renamed from: c */
    static C0934e[] f3364c = new C0934e[10];

    /* renamed from: d */
    static C0934e[] f3365d = new C0934e[10];

    /* renamed from: e */
    static C0934e f3366e = null;

    /* renamed from: h */
    static final C0208c f3369h = C0208c.m4533a(String.valueOf(110));

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f3367f);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        if (reader.m1295b() >= 17) {
            mo3174a(reader.ReadInt());
        }
        super.mo2291a(reader);
    }

    /* renamed from: b */
    public static void m3453b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3362a = m1072A.f6113bO.mo221a(C0067R.drawable.air_factory);
        f3363b = m1072A.f6113bO.mo221a(C0067R.drawable.air_factory_t2);
        f3366e = m1072A.f6113bO.mo221a(C0067R.drawable.air_factory_dead);
        f3364c = AbstractC0197n.m4627a(f3362a);
        f3365d = AbstractC0197n.m4627a(f3363b);
    }

    /* renamed from: c */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1737c;
    }

    /* renamed from: K */
    public boolean mo3274K() {
        this.f3885L = f3366e;
        m447S(0);
        this.f1606bS = false;
        m2924a(EnumC0233ab.f1505d);
        return true;
    }

    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3366e;
        }
        if (this.f1609bV == null) {
            return f3364c[f3364c.length - 1];
        }
        if (this.f3367f == 1) {
            return f3364c[this.f1609bV.m4650O()];
        }
        return f3365d[this.f1609bV.m4650O()];
    }

    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    public C0470a(boolean z) {
        super(z);
        this.f3367f = 1;
        this.f3368g = 0.0f;
        this.f3885L = f3362a;
        m2639T(40);
        m2638U(61);
        this.f1621ch = 30.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1000.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5364a(-1, -1, 1, 1);
        this.f3427o.m5364a(-1, -1, 1, 2);
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
            return;
        }
        this.f3368g = C0758f.m2159a(this.f3368g, f);
        if (this.f3368g == 0.0f) {
            this.f3368g = 27.0f;
            this.f3431s++;
            if (this.f3431s > 4) {
                this.f3431s = 0;
            }
        }
    }

    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        if (c0499j.f3494j.equals(f3369h)) {
            mo3174a(2);
            m2947W();
            return;
        }
        super.mo3272a(c0499j);
    }

    /* renamed from: V */
    public int mo3273V() {
        return this.f3367f;
    }

    /* renamed from: a */
    public void mo3174a(int i) {
        if (i == 1) {
            this.f3367f = 1;
        } else if (i == 2 && this.f3367f == 1) {
            this.f3367f = 2;
        }
        mo3303S();
    }

    /* renamed from: cl */
    public C0208c mo3267cl() {
        if (this.f3367f == 1) {
            return f3369h;
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public static void m3454a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        if (i == 1) {
            arrayList.add(new C0484b());
        }
        if (i > 1) {
            arrayList.add(new C0217l(EnumC0249ar.f1760z, 3));
            arrayList.add(new C0217l(EnumC0249ar.f1748n, 4));
            arrayList.add(new C0217l(EnumC0249ar.f1773M, 5));
        }
    }

    /* renamed from: N */
    public ArrayList mo3068N() {
        return mo5649r().mo4262a(mo3273V());
    }

    /* renamed from: bJ */
    public boolean mo3269bJ() {
        return true;
    }
}
