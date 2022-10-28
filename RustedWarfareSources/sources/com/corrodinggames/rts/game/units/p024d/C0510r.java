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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        super.mo2292a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2291a(Reader reader) {
        super.mo2291a(reader);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: L */
    public EnumC0249ar mo5649r() {
        return EnumC0249ar.f1762B;
    }

    static {
        f3542h.add(new C0218m(true));
        f3542h.add(new C0219n());
    }

    /* renamed from: dr */
    public static void m3276dr() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3535a = m1072A.f6113bO.mo221a(C0067R.drawable.repair_bay);
        f3537c = m1072A.f6113bO.mo221a(C0067R.drawable.repair_bay_dead);
        f3536b = AbstractC0197n.m4627a(f3535a);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3274K() {
        this.f3885L = f3537c;
        m447S(0);
        this.f1606bS = false;
        m2924a(EnumC0233ab.f1504c);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2989d() {
        if (this.f1607bT) {
            return f3537c;
        }
        if (this.f1609bV == null) {
            return f3536b[f3536b.length - 1];
        }
        return f3536b[this.f1609bV.m4650O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2980k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3174a(int i) {
    }

    public C0510r(boolean z) {
        super(z);
        this.f3540f = new Rect();
        this.f3541g = new Rect();
        this.f3543i = new PointF[6];
        this.f3544j = new PointF[this.f3543i.length];
        this.f3885L = f3535a;
        m2633b(f3535a);
        this.f1621ch = 30.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 1000.0f;
        this.f1632cs = this.f1633ct;
        this.f3426n.m5364a(-1, -1, 1, 1);
        this.f3427o.m5364a(-1, -1, 1, 1);
        for (int i = 0; i < this.f3543i.length; i++) {
            this.f3543i[i] = new PointF();
            this.f3544j[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: y */
    public int mo3077y() {
        return SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public float mo3112c(AbstractC0244am abstractC0244am) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo3087a(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3245q()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C0305au m3277a(AbstractC0623y abstractC0623y, float f, float f2, boolean z) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        f3539e.m3275a(abstractC0623y.mo3077y() + f2, z);
        m1072A.f6127cc.m3160a(abstractC0623y.f6957el, abstractC0623y.f6958em, abstractC0623y.mo3077y() + f2, abstractC0623y, f, f3539e);
        AbstractC0244am abstractC0244am = f3539e.f3549e;
        if (abstractC0244am != null) {
            C0305au m2856ao = abstractC0623y.m2856ao();
            m2856ao.m4228b(abstractC0244am);
            if (m2856ao != null) {
                m2856ao.f1809k = f2;
                m2856ao.f1804m = true;
                return m2856ao;
            }
            return null;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1718a(float f) {
        super.mo1718a(f);
        if (!m4396bS() || this.f1607bT) {
            return;
        }
        this.f3538d += f;
        if (m2854aq() && this.f3538d > 40.0f) {
            this.f3538d = 0.0f;
            m3277a((AbstractC0623y) this, f, 0.0f, false);
        }
        if (!this.f1607bT) {
            C0519b.m3241a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo2285c(float f) {
        return super.mo2285c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2294a(float f, boolean z) {
        super.mo2294a(f, z);
        if (!this.f1607bT) {
            C0519b.m3239b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2979l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2993a(AbstractC0244am abstractC0244am, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2992b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2991c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo3073E(int i) {
        PointF G = mo3089G(i);
        f3985bf.m5369a(G.f227a + 0.0f, G.f228b - 33.0f);
        return f3985bf;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3068N() {
        return f3542h;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3085b() {
        return this.f3543i;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3083c() {
        return this.f3544j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2978m() {
        return mo3077y();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo2283e(float f) {
        super.mo2283e(f);
        C1117y.m470a(this, mo3077y());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: g */
    public boolean mo3081g(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }
}
