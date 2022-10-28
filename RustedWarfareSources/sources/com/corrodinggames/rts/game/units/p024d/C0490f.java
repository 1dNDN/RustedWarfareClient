package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f.class */
public class C0490f extends AbstractC0498i {

    /* renamed from: f */
    boolean f3449f;

    /* renamed from: a */
    static C0934e f3444a = null;

    /* renamed from: b */
    static C0934e f3445b = null;

    /* renamed from: c */
    static C0934e[] f3446c = new C0934e[10];

    /* renamed from: d */
    static C0934e[] f3447d = new C0934e[10];

    /* renamed from: e */
    static C0934e f3448e = null;

    /* renamed from: g */
    static AbstractC0224s f3450g = new C04911(110);

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f3449f);
        streamWriter.m1401c(0);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3511a(Reader reader) {
        if (reader.ReadBool()) {
            m3513L();
        }
        reader.m1304d();
        super.m3478a(reader);
    }

    /* renamed from: b */
    public static void m3509b() {
        Core m1087A = Core.m1087A();
        f3444a = m1087A.f6113bO.mo221a(C0067R.drawable.experimental_unit_factory_front);
        f3445b = m1087A.f6113bO.mo221a(C0067R.drawable.experimental_unit_factory_base);
        f3448e = m1087A.f6113bO.mo221a(C0067R.drawable.experimental_unit_factory_dead);
        f3446c = AbstractC0197n.m5082a(f3444a);
    }

    /* renamed from: c */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1767G;
    }

    /* renamed from: K */
    public boolean m3514K() {
        Core.m1087A();
        this.f3425m = null;
        this.f3885L = f3448e;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1509h);
        return true;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3448e;
        }
        if (this.f1609bV == null) {
            return f3446c[f3446c.length - 1];
        }
        if (!this.f3449f) {
            return f3446c[this.f1609bV.m5105O()];
        }
        return f3447d[this.f1609bV.m5105O()];
    }

    /* renamed from: S */
    public void m3512S() {
        super.m3008S();
        if (this.f1607bT) {
            this.f3425m = null;
        } else {
            this.f3425m = f3445b;
        }
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    public C0490f(boolean z) {
        super(z);
        this.f3885L = f3444a;
        this.f3425m = f3445b;
        m2687b(this.f3885L);
        this.f1621ch = 55.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 3200.0f;
        this.f1632cs = this.f1633ct;
        m447S(4);
        this.f3426n.m5874a(-2, -2, 2, 2);
        this.f3427o.m5874a(-2, -2, 2, 4);
    }

    /* renamed from: a */
    public void mo3437a(C0499j c0499j) {
        if (c0499j.f3496j.equals(f3450g.m4910N())) {
            m3513L();
        } else {
            super.mo3437a(c0499j);
        }
    }

    /* renamed from: L */
    public void m3513L() {
        if (!this.f3449f) {
            this.f3449f = true;
            m3512S();
        }
    }

    /* renamed from: cl */
    public C0208c m3506cl() {
        return AbstractC0224s.f1462i;
    }

    /* renamed from: com.corrodinggames.rts.game.units.d.f$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/f$1.class */
    final class C04911 extends AbstractC0228w {
        C04911(int i) {
            super(i);
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public String mo3088a() {
            return "-Allows factory to build Tech 2 units";
        }

        /* renamed from: b */
        public String mo3085b() {
            return C0820a.m1731a("gui.actions.upgradeT2", new Object[0]);
        }

        /* renamed from: c */
        public int mo3082c() {
            return 1500;
        }

        /* renamed from: K */
        public float mo3369K() {
            return 5.0E-4f;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            C0490f c0490f = (C0490f) abstractC0244am;
            if (c0490f.f3449f || c0490f.mo3438a(m4910N(), z) > 0) {
                return false;
            }
            return super.mo3086a(abstractC0244am, z);
        }

        /* renamed from: L */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1467c;
        }
    }

    /* renamed from: a */
    public static void m3510a(ArrayList arrayList, int i) {
        arrayList.add(new C0220o());
        arrayList.add(new C0217l(EnumC0249ar.f1766F, 2));
        arrayList.add(new C0217l(EnumC0249ar.f1775O, 3));
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return mo1758r().mo4484a(m3005V());
    }

    /* renamed from: bJ */
    public boolean m3508bJ() {
        return true;
    }
}
