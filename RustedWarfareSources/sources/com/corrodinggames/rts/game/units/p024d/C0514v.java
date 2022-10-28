package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/v.class */
public class C0514v extends AbstractC0498i {

    /* renamed from: f */
    int f3565f;

    /* renamed from: g */
    float f3566g;

    /* renamed from: h */
    int f3567h;

    /* renamed from: a */
    static C0934e f3560a = null;

    /* renamed from: b */
    static C0934e f3561b = null;

    /* renamed from: c */
    static C0934e[] f3562c = new C0934e[10];

    /* renamed from: d */
    static C0934e[] f3563d = new C0934e[10];

    /* renamed from: e */
    static C0934e f3564e = null;

    /* renamed from: i */
    public static int f3568i = 0;

    /* renamed from: j */
    static AbstractC0224s f3569j = new C05151(102);

    /* renamed from: k */
    static ArrayList f3570k = new ArrayList();

    static {
        f3570k.add(f3569j);
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.WriteInteger(this.f3565f);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        mo3174a(reader.ReadInt());
        super.mo2291a(reader);
    }

    /* renamed from: b */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1774N;
    }

    /* renamed from: c */
    public static void m3259c() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3560a = m1072A.f6113bO.mo221a(C0067R.drawable.supply_depot);
        f3561b = m1072A.f6113bO.mo221a(C0067R.drawable.supply_depot_t2);
        f3562c = AbstractC0197n.m4627a(f3560a);
        f3563d = AbstractC0197n.m4627a(f3561b);
        f3564e = m1072A.f6113bO.mo221a(C0067R.drawable.supply_depot_dead);
    }

    /* renamed from: K */
    public boolean mo3274K() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6116bR.m2339a(this.f6957el, this.f6958em, this.f6959en);
        this.f3885L = f3564e;
        m447S(0);
        this.f1606bS = false;
        m1072A.f6111bM.m2722a(C0631e.f4050p, 0.8f, this.f6957el, this.f6958em);
        return false;
    }

    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3564e;
        }
        if (this.f1609bV == null) {
            return f3562c[f3562c.length - 1];
        }
        if (this.f3565f == 1) {
            return f3562c[this.f1609bV.m4650O()];
        }
        return f3563d[this.f1609bV.m4650O()];
    }

    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    public C0514v(boolean z) {
        super(z);
        this.f3565f = 1;
        this.f3566g = 0.0f;
        this.f3567h = 0;
        this.f3885L = f3560a;
        m2634a(this.f3885L, 1);
        this.f1621ch = 20.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 800.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5364a(-1, -1, 0, 0);
        this.f3427o.m5363a(this.f3426n);
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
        }
    }

    /* renamed from: a */
    public void mo3272a(C0499j c0499j) {
        if (c0499j.f3494j.equals(f3569j.m4507N())) {
            m3262L();
            m2947W();
        }
    }

    /* renamed from: a */
    public void mo3174a(int i) {
        this.f3565f = i;
    }

    /* renamed from: L */
    public void m3262L() {
        if (this.f3565f == 1) {
            this.f3565f = 2;
            mo3303S();
        }
    }

    /* renamed from: cl */
    public C0208c mo3267cl() {
        if (this.f3565f == 1) {
            return f3569j.m4507N();
        }
        return AbstractC0224s.f1462i;
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.v$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/v$1.class */
    final class C05151 extends AbstractC0228w {
        C05151(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3019g() {
            return false;
        }

        /* renamed from: a */
        public String mo3029a() {
            return C0820a.m1687a("units.supplyDepot.upgrade.description", new Object[0]);
        }

        /* renamed from: b */
        public String mo3026b() {
            return C0820a.m1687a("units.supplyDepot.upgrade.name", new Object[0]);
        }

        /* renamed from: c */
        public int mo3023c() {
            return 1000;
        }

        /* renamed from: K */
        public float mo3265K() {
            return 4.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3027a(AbstractC0244am abstractC0244am, boolean z) {
            C0514v c0514v = (C0514v) abstractC0244am;
            if (c0514v.f3565f != 1 || c0514v.mo3313a(m4507N(), z) > 0) {
                return false;
            }
            return super.mo3027a(abstractC0244am, z);
        }

        /* renamed from: L */
        public EnumC0249ar mo5648i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3020f() {
            return EnumC0225t.f1467c;
        }
    }

    /* renamed from: N */
    public ArrayList mo3068N() {
        return f3570k;
    }
}
