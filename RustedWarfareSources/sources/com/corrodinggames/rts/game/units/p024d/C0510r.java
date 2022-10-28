package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/r.class */
public class C0510r extends AbstractC0488d implements InterfaceC0469d {

    /* renamed from: d */
    float f3538d;

    /* renamed from: f */
    Rect f3540f;

    /* renamed from: g */
    Rect f3541g;

    /* renamed from: i */
    PointF[] f3543i;

    /* renamed from: j */
    PointF[] f3544j;

    /* renamed from: a */
    static C0934e f3535a = null;

    /* renamed from: b */
    static C0934e[] f3536b = new C0934e[10];

    /* renamed from: c */
    static C0934e f3537c = null;

    /* renamed from: e */
    public static C0511s f3539e = new C0511s(true);

    /* renamed from: h */
    static ArrayList f3542h = new ArrayList();

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3382a(Reader reader) {
        super.m3535a(reader);
    }

    /* renamed from: L */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1762B;
    }

    static {
        f3542h.add(new C0218m(true));
        f3542h.add(new C0219n());
    }

    /* renamed from: dr */
    public static void m3380dr() {
        Core m1087A = Core.m1087A();
        f3535a = m1087A.f6113bO.mo221a(C0067R.drawable.repair_bay);
        f3537c = m1087A.f6113bO.mo221a(C0067R.drawable.repair_bay_dead);
        f3536b = AbstractC0197n.m5082a(f3535a);
    }

    /* renamed from: K */
    public boolean m3385K() {
        this.f3885L = f3537c;
        m447S(0);
        this.f1606bS = false;
        m2981a(EnumC0233ab.f1504c);
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return f3537c;
        }
        if (this.f1609bV == null) {
            return f3536b[f3536b.length - 1];
        }
        return f3536b[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    /* renamed from: a */
    public void mo3356a(int i) {
    }

    public C0510r(boolean z) {
        super(z);
        this.f3540f = new Rect();
        this.f3541g = new Rect();
        this.f3543i = new PointF[6];
        this.f3544j = new PointF[this.f3543i.length];
        this.f3885L = f3535a;
        m2687b(f3535a);
        this.f1621ch = 30.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1000.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5874a(-1, -1, 1, 1);
        this.f3427o.m5874a(-1, -1, 1, 1);
        for (int i = 0; i < this.f3543i.length; i++) {
            this.f3543i[i] = new PointF();
            this.f3544j[i] = new PointF();
        }
    }

    /* renamed from: y */
    public int mo3161y() {
        return SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE;
    }

    /* renamed from: c */
    public float m3381c(AbstractC0244am abstractC0244am) {
        return 0.2f;
    }

    /* renamed from: a */
    public boolean mo3172a(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3347q()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C0305au m3383a(AbstractC0623y abstractC0623y, float f, float f2, boolean z) {
        Core m1087A = Core.m1087A();
        f3539e.m3379a(abstractC0623y.mo3161y() + f2, z);
        m1087A.f6127cc.m3258a(abstractC0623y.f6958el, abstractC0623y.f6959em, abstractC0623y.mo3161y() + f2, abstractC0623y, f, f3539e);
        AbstractC0244am abstractC0244am = f3539e.f3549e;
        if (abstractC0244am != null) {
            C0305au m2912ao = abstractC0623y.m2912ao();
            m2912ao.m4450b(abstractC0244am);
            if (m2912ao != null) {
                m2912ao.f1807k = f2;
                m2912ao.f1809m = true;
                return m2912ao;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        super.mo1762a(f);
        if (!m4751bS() || this.f1607bT) {
            return;
        }
        this.f3538d += f;
        if (m2910aq() && this.f3538d > 40.0f) {
            this.f3538d = 0.0f;
            m3383a((AbstractC0623y) this, f, 0.0f, false);
        }
        if (!this.f1607bT) {
            C0519b.m3343a(f, this);
        }
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        return super.mo3049c(f);
    }

    /* renamed from: a */
    public void mo3053a(float f, boolean z) {
        super.mo3053a(f, z);
        if (!this.f1607bT) {
            C0519b.m3341b(f, this);
        }
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 0.0f;
    }

    /* renamed from: E */
    public PointF mo3156E(int i) {
        PointF G = mo3176G(i);
        f3985bf.m5879a(G.f227a + 0.0f, G.f228b - 33.0f);
        return f3985bf;
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f3542h;
    }

    /* renamed from: b */
    public PointF[] mo3170b() {
        return this.f3543i;
    }

    /* renamed from: c */
    public PointF[] mo3168c() {
        return this.f3544j;
    }

    /* renamed from: m */
    public float mo3035m() {
        return mo3161y();
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        super.mo3151e(f);
        C1117y.m470a(this, mo3161y());
    }

    /* renamed from: g */
    public boolean mo3166g(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }
}
