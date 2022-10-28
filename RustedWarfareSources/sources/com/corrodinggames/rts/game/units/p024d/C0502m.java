package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/m.class */
public class C0502m extends AbstractC0498i {

    /* renamed from: g */
    boolean f3511g;

    /* renamed from: a */
    static C0934e f3505a = null;

    /* renamed from: b */
    static C0934e f3506b = null;

    /* renamed from: c */
    static C0934e f3507c = null;

    /* renamed from: d */
    static C0934e[] f3508d = new C0934e[10];

    /* renamed from: e */
    static C0934e[] f3509e = new C0934e[10];

    /* renamed from: f */
    static C0934e f3510f = null;

    /* renamed from: h */
    static final C0208c f3512h = C0208c.m4988a(String.valueOf(110));

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f3511g);
        streamWriter.m1401c(0);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3423a(Reader reader) {
        if (reader.ReadBool()) {
            mo3356a(2);
        }
        reader.m1304d();
        super.m3478a(reader);
    }

    /* renamed from: b */
    public static void m3421b() {
        Core m1087A = Core.m1087A();
        f3505a = m1087A.f6113bO.mo221a(C0067R.drawable.land_factory_front);
        f3506b = m1087A.f6113bO.mo221a(C0067R.drawable.land_factory_front_t2);
        f3507c = m1087A.f6113bO.mo221a(C0067R.drawable.land_factory_back);
        f3510f = m1087A.f6113bO.mo221a(C0067R.drawable.land_factory_dead);
        f3508d = AbstractC0197n.m5082a(f3505a);
        f3509e = AbstractC0197n.m5082a(f3506b);
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1736b;
    }

    /* renamed from: K */
    public boolean m3427K() {
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2391a(this.f6958el, this.f6959em, this.f6960en);
        this.f3425m = null;
        this.f3885L = f3510f;
        m447S(0);
        this.f1606bS = false;
        m1087A.f6111bM.m2776a(C0631e.f4050p, 0.8f, this.f6958el, this.f6959em);
        return true;
    }

    /* renamed from: S */
    public void m3426S() {
        super.m3008S();
        if (this.f1607bT) {
            this.f3425m = null;
        } else {
            this.f3425m = f3507c;
        }
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3510f;
        }
        if (this.f1609bV == null) {
            return f3508d[f3508d.length - 1];
        }
        if (!this.f3511g) {
            return f3508d[this.f1609bV.m5105O()];
        }
        return f3509e[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    public C0502m(boolean z) {
        super(z);
        this.f3885L = f3505a;
        this.f3425m = f3507c;
        m2687b(this.f3885L);
        this.f1621ch = 30.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1200.0f;
        this.f1632cs = this.f1633ct;
        m447S(3);
        this.f3426n.m5874a(-1, -1, 1, 1);
        this.f3427o.m5874a(-1, -1, 1, 3);
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        if (f3512h.m4991a(c0499j.f3496j)) {
            mo3356a(2);
            m3004W();
            return;
        }
        super.mo3437a(c0499j);
    }

    /* renamed from: a */
    public void mo3356a(int i) {
        if (i == 1) {
            this.f3511g = false;
        } else if (i == 2 && !this.f3511g) {
            this.f3511g = true;
        }
        m3426S();
    }

    /* renamed from: cl */
    public C0208c m3417cl() {
        if (!this.f3511g) {
            return f3512h;
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: a */
    public static void m3422a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        if (i == 1) {
            arrayList.add(new C0503n());
        }
        arrayList.add(new C0217l(EnumC0249ar.f1742h, 1));
        arrayList.add(new C0217l(EnumC0249ar.f1743i, 2));
        arrayList.add(new C0217l(EnumC0249ar.f1744j, 3));
        arrayList.add(new C0217l(EnumC0249ar.f1745k, 4));
        if (i >= 2) {
            arrayList.add(new C0217l(EnumC0249ar.f1753s, 5));
            arrayList.add(new C0217l(EnumC0249ar.f1757w, 6));
            arrayList.add(new C0217l(EnumC0249ar.f1758x, 7));
            arrayList.add(new C0217l(EnumC0249ar.f1752r, 8));
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return mo1758r().mo4484a(m3425V());
    }

    /* renamed from: V */
    public int m3425V() {
        if (this.f3511g) {
            return 2;
        }
        return 1;
    }

    /* renamed from: dr */
    public C0500k m3416dr() {
        return new C0504o(this);
    }

    /* renamed from: bJ */
    public boolean m3420bJ() {
        return true;
    }

    /* renamed from: cZ */
    public float m3418cZ() {
        return super.m4708cZ() - 8.0f;
    }
}
