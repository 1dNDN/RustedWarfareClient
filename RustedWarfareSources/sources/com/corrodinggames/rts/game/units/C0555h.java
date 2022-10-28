package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.C0207b;
import com.corrodinggames.rts.game.units.p013a.C0213h;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p024d.C0507q;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.game.units.p026e.AbstractC0529j;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0765c;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0767e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0841ae;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h.class */
public class C0555h extends AbstractC0529j implements InterfaceC0469d {

    /* renamed from: a */
    PointF[] f3762a;

    /* renamed from: b */
    PointF[] f3763b;

    /* renamed from: c */
    boolean f3764c;

    /* renamed from: d */
    static Paint f3765d;

    /* renamed from: e */
    static Paint f3766e;

    /* renamed from: f */
    static Paint f3767f;

    /* renamed from: g */
    static C0934e f3768g;

    /* renamed from: r */
    String f3779r;

    /* renamed from: C */
    static ArrayList f3790C;

    /* renamed from: D */
    C0824b f3791D;

    /* renamed from: E */
    EnumC0603o f3792E;

    /* renamed from: F */
    EnumC0596n f3793F;

    /* renamed from: G */
    String f3794G;

    /* renamed from: H */
    boolean f3795H;

    /* renamed from: I */
    String f3796I;

    /* renamed from: h */
    static AbstractC0224s f3769h = new C05561("reloadUnits");

    /* renamed from: i */
    static AbstractC0224s f3770i = new C055912("reloadOnlyActiveUnits");

    /* renamed from: j */
    static AbstractC0224s f3771j = new C056316("unitClone");

    /* renamed from: k */
    static AbstractC0224s f3772k = new C056417("removeUnits");

    /* renamed from: l */
    static AbstractC0224s f3773l = new C056518("killUnits");

    /* renamed from: m */
    static AbstractC0224s f3774m = new C056619("finishQueue");

    /* renamed from: n */
    static AbstractC0224s f3775n = new C056920("nukeAt");

    /* renamed from: o */
    static AbstractC0224s f3776o = new C057021("freezeAI");

    /* renamed from: p */
    static AbstractC0224s f3777p = new C057122("changeAlliance");

    /* renamed from: q */
    static AbstractC0224s f3778q = new C05672("startRecording");

    /* renamed from: s */
    static AbstractC0224s f3780s = new C05723("startReplayPlayback");

    /* renamed from: t */
    static AbstractC0224s f3781t = new C05764("hideInterface");

    /* renamed from: u */
    static AbstractC0224s f3782u = new C05775("freezeAllAI");

    /* renamed from: v */
    static AbstractC0224s f3783v = new C05786("pauseGame");

    /* renamed from: w */
    static AbstractC0224s f3784w = new C05797("slowGame");

    /* renamed from: x */
    static AbstractC0224s f3785x = new C05808("fastForward");

    /* renamed from: y */
    static AbstractC0224s f3786y = new C05819("search");

    /* renamed from: z */
    static AbstractC0224s f3787z = new C055710("enableDebug");

    /* renamed from: A */
    static AbstractC0224s f3788A = new C055811("enableAIDebug");

    /* renamed from: B */
    static AbstractC0224s f3789B = new C056013("enableTriggerDebug");

    /* renamed from: J */
    static C0207b f3797J = new C056215();

    /* renamed from: f */
    public EnumC0249ar mo1758r() {
        return EnumC0249ar.f1785Y;
    }

    /* renamed from: w */
    public static boolean m3204w() {
        if (Core.m1087A().f6126cb.m2465g()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public PointF[] mo3170b() {
        return this.f3762a;
    }

    /* renamed from: c */
    public PointF[] mo3168c() {
        return this.f3763b;
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3650dL[this.f1609bV.m5105O()];
    }

    /* renamed from: K */
    public static void m3217K() {
        f3768g = Core.m1087A().f6113bO.mo221a(C0067R.drawable.icon_search);
    }

    /* renamed from: a */
    public boolean mo3172a(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: d */
    public C0934e mo3046d() {
        if (this.f1607bT) {
            return C0519b.f3582b;
        }
        return C0519b.f3584d[this.f1609bV.m5105O()];
    }

    /* renamed from: k */
    public C0934e mo3037k() {
        return null;
    }

    /* renamed from: d */
    public C0934e mo3045d(int i) {
        return null;
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core m1087A = Core.m1087A();
        m1087A.f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
        this.f3885L = C0519b.f3582b;
        m447S(0);
        this.f1606bS = false;
        m1087A.f6111bM.m2776a(C0631e.f4049o, 0.8f, this.f6958el, this.f6959em);
        m2862bq();
        return true;
    }

    public C0555h(boolean z) {
        super(z);
        this.f3762a = new PointF[6];
        this.f3763b = new PointF[this.f3762a.length];
        f3765d = new Paint();
        f3765d.m5933a(40, 0, 255, 0);
        f3765d.mo5914a(true);
        f3765d.m5936a(2.0f);
        f3765d.m5928a(Paint.Cap.f201b);
        f3766e = new Paint();
        f3766e.m5925a(f3765d);
        f3766e.m5933a(55, 255, 60, 60);
        f3767f = new Paint();
        f3767f.m5933a(60, 255, 255, 255);
        this.f3791D = null;
        this.f3792E = EnumC0603o.f3865a;
        this.f3793F = EnumC0596n.f3858a;
        this.f3795H = true;
        m2693T(20);
        m2692U(20);
        this.f1621ch = 10.0f;
        this.f6958el = -1000.0f;
        this.f6959em = -1000.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 170000.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = C0519b.f3582b;
        for (int i = 0; i < this.f3762a.length; i++) {
            this.f3762a[i] = new PointF();
            this.f3763b[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3213a(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        PointF[] mo3170b = interfaceC0469d.mo3170b();
        PointF[] mo3168c = interfaceC0469d.mo3168c();
        AbstractC0244am m3003X = abstractC0623y.m3003X();
        abstractC0623y.f3966aM = m3003X != null;
        if (m3003X != null) {
            for (int i = 0; i < mo3170b.length; i++) {
                PointF pointF = mo3170b[i];
                PointF pointF2 = mo3168c[i];
                pointF.f227a = C0758f.m2210a(pointF.f227a, pointF2.f227a, 0.1f * f);
                pointF.f228b = C0758f.m2210a(pointF.f228b, pointF2.f228b, 0.1f * f);
                pointF.f227a += (pointF2.f227a - pointF.f227a) * 0.04f * f;
                pointF.f228b += (pointF2.f228b - pointF.f228b) * 0.04f * f;
                float f2 = m3003X.f1621ch * 0.75f;
                if (C0758f.m2137c(pointF.f227a - pointF2.f227a) < 1.0f) {
                    pointF2.f227a = C0758f.m2125d(-f2, f2);
                }
                if (C0758f.m2137c(pointF.f228b - pointF2.f228b) < 1.0f) {
                    pointF2.f228b = C0758f.m2125d(-f2, f2);
                }
            }
        } else if (mo3170b[0].f227a != 0.0f || mo3170b[0].f228b != 0.0f) {
            for (int i2 = 0; i2 < mo3170b.length; i2++) {
                PointF pointF3 = mo3170b[i2];
                PointF pointF4 = mo3168c[i2];
                pointF3.f227a = 0.0f;
                pointF3.f228b = 0.0f;
                pointF4.f227a = 0.0f;
                pointF4.f228b = 0.0f;
            }
        }
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        if (f < 0.3f) {
            f = 0.3f;
        }
        if (this.f3943aw && this.f1609bV.m5074b()) {
            int i = 0;
            while (true) {
                if (i < AbstractC0197n.f1365c) {
                    AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
                    if (m5017k == null || m5017k.m5074b()) {
                        i++;
                    } else {
                        m4663e(m5017k);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        super.mo1762a(f);
        if (!this.f1607bT) {
            m3213a(f, this);
        }
        this.f1632cs = this.f1633ct;
    }

    /* renamed from: a */
    public void mo3053a(float f, boolean z) {
        if (!this.f1607bT) {
        }
    }

    /* renamed from: e */
    public float mo3042e(int i) {
        return 0.0f;
    }

    /* renamed from: f */
    public float mo3041f(int i) {
        return 0.0f;
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        if (!super.mo3049c(f)) {
            return false;
        }
        Core.m1087A();
        return true;
    }

    /* renamed from: a */
    public void mo3051a(AbstractC0244am abstractC0244am, int i) {
    }

    /* renamed from: x */
    public boolean m3203x() {
        return false;
    }

    /* renamed from: y */
    public int mo3161y() {
        return 850000;
    }

    /* renamed from: b */
    public float m3207b(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
    }

    /* renamed from: c */
    public float m3206c(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
    }

    /* renamed from: m */
    public float mo3035m() {
        return 30.0f;
    }

    /* renamed from: b */
    public float mo3050b(int i) {
        return 100.0f;
    }

    /* renamed from: z */
    public float mo3033z() {
        return 0.0f;
    }

    /* renamed from: A */
    public float mo3065A() {
        return 9.8f;
    }

    /* renamed from: B */
    public float mo3064B() {
        return 9.35f;
    }

    /* renamed from: c */
    public float mo3048c(int i) {
        return 99.0f;
    }

    /* renamed from: l */
    public boolean mo3036l() {
        return false;
    }

    /* renamed from: C */
    public float mo3063C() {
        return 0.04f;
    }

    /* renamed from: D */
    public float mo3062D() {
        return 0.1f;
    }

    /* renamed from: a */
    public void mo3173a(AbstractC0224s abstractC0224s, boolean z) {
        Core m1087A = Core.m1087A();
        if (abstractC0224s instanceof C0593k) {
            C0593k c0593k = (C0593k) abstractC0224s;
            boolean z2 = true;
            if (z) {
                z2 = 1 == 0;
            }
            if (c0593k.f3852a) {
                z2 = !z2;
            }
            if (z2) {
                C0136a c0136a = null;
                int i = this.f1609bV.f1306k + 1;
                while (true) {
                    if (i < AbstractC0197n.f1365c) {
                        AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
                        if (m5017k == null || m5017k.m5074b()) {
                            i++;
                        } else {
                            c0136a = m5017k;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (c0136a == null && this.f1609bV.f1306k < 4) {
                    c0136a = AbstractC0197n.m5017k(this.f1609bV.f1306k + 1);
                    if (c0136a == null) {
                        Core.LogDebug2("Sandbox adding new team:" + this.f1609bV.f1306k);
                        C0136a c0136a2 = new C0136a(this.f1609bV.f1306k + 1);
                        c0136a = c0136a2;
                        c0136a.f1312q = 1;
                        c0136a.f1329E = true;
                        c0136a.f1330F = true;
                        if (!this.f3764c) {
                            c0136a2.f619bF = 0.0f;
                        } else {
                            c0136a2.f619bF = Float.MAX_VALUE;
                        }
                    }
                }
                if (c0136a == null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < AbstractC0197n.f1365c) {
                            AbstractC0197n m5017k2 = AbstractC0197n.m5017k(i2);
                            if (m5017k2 == null || m5017k2.m5074b()) {
                                i2++;
                            } else {
                                c0136a = m5017k2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (c0136a != null) {
                    m4663e(c0136a);
                    if (!m1087A.f6126cb.m2464h()) {
                        m1087A.f6099bs = c0136a;
                    }
                }
            } else {
                AbstractC0197n abstractC0197n = null;
                int i3 = this.f1609bV.f1306k - 1;
                while (true) {
                    if (i3 >= 0) {
                        AbstractC0197n m5017k3 = AbstractC0197n.m5017k(i3);
                        if (m5017k3 == null || m5017k3.m5074b()) {
                            i3--;
                        } else {
                            abstractC0197n = m5017k3;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (abstractC0197n == null) {
                    int i4 = AbstractC0197n.f1365c - 1;
                    while (true) {
                        if (i4 >= 0) {
                            AbstractC0197n m5017k4 = AbstractC0197n.m5017k(i4);
                            if (m5017k4 == null || m5017k4.m5074b()) {
                                i4--;
                            } else {
                                abstractC0197n = m5017k4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (abstractC0197n != null) {
                    m4663e(abstractC0197n);
                    if (!m1087A.f6126cb.m2464h()) {
                        m1087A.f6099bs = abstractC0197n;
                    }
                }
            }
        }
        if (abstractC0224s instanceof C0592j) {
            C0592j c0592j = (C0592j) abstractC0224s;
            boolean z3 = true;
            if (z) {
                z3 = 1 == 0;
            }
            if (c0592j.f3850a) {
                z3 = !z3;
            }
            ArrayList m1696j = m1087A.f6124bZ.m1696j();
            if (m1696j.size() == 0) {
                this.f3791D = null;
            } else if (z3) {
                if (this.f3791D == null) {
                    this.f3791D = (C0824b) m1696j.get(0);
                } else {
                    C0824b c0824b = null;
                    boolean z4 = false;
                    Iterator it = m1696j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0824b c0824b2 = (C0824b) it.next();
                        if (z4) {
                            c0824b = c0824b2;
                            break;
                        } else if (c0824b2 == this.f3791D) {
                            z4 = true;
                        }
                    }
                    this.f3791D = c0824b;
                }
            } else if (this.f3791D == null) {
                this.f3791D = (C0824b) m1696j.get(m1696j.size() - 1);
            } else {
                C0824b c0824b3 = null;
                boolean z5 = false;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m1696j);
                Collections.reverse(arrayList);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0824b c0824b4 = (C0824b) it2.next();
                    if (z5) {
                        c0824b3 = c0824b4;
                        break;
                    } else if (c0824b4 == this.f3791D) {
                        z5 = true;
                    }
                }
                this.f3791D = c0824b3;
            }
        }
        if (abstractC0224s instanceof C0594l) {
            C0594l c0594l = (C0594l) abstractC0224s;
            boolean z6 = true;
            if (z) {
                z6 = 1 == 0;
            }
            if (c0594l.f3854a) {
                z6 = !z6;
            }
            this.f3792E = this.f3792E.m3106a(!z6);
        }
        if (abstractC0224s instanceof C0591i) {
            this.f1609bV.m5044d(10000.0f);
        }
        if (abstractC0224s instanceof C0595m) {
            ((C0595m) abstractC0224s).m3123n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static C0555h m3216L() {
        return Core.m1087A().f6117bS.m1825i();
    }

    /* renamed from: a */
    public void m3211a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        if (abstractC0224s instanceof C0213h) {
            abstractC0224s = ((C0213h) abstractC0224s).m4945n_();
        }
        if (abstractC0224s == f3769h) {
            if (m3204w()) {
                Core.m998b("Not reloading units: Need to keep network sync");
                m1087A.f6117bS.m1850b("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (m1087A.f6124bZ.m1698h() == 0) {
                    m1087A.f6117bS.m1850b("No custom units to reload");
                    return;
                }
                Core.LogDebug2("Reload units requested");
                m1087A.f6124bZ.m1712a(true, false);
                Iterator it = AbstractC0197n.m5058c().iterator();
                while (it.hasNext()) {
                    AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
                    if (abstractC0197n instanceof C0136a) {
                        ((C0136a) abstractC0197n).m5550ah();
                    }
                }
                m1087A.f6117bS.m1850b("All custom unit files reloaded");
            }
        }
        if (abstractC0224s == f3770i) {
            if (m3204w()) {
                Core.m998b("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (m1087A.f6124bZ.m1698h() == 0) {
                    m1087A.f6117bS.m1850b("No custom units to reload");
                    return;
                }
                Core.LogDebug2("Reload active only requested");
                m1087A.f6124bZ.m1712a(true, true);
                Iterator it2 = AbstractC0197n.m5058c().iterator();
                while (it2.hasNext()) {
                    AbstractC0197n abstractC0197n2 = (AbstractC0197n) it2.next();
                    if (abstractC0197n2 instanceof C0136a) {
                        ((C0136a) abstractC0197n2).m5550ah();
                    }
                }
                int i = C0348af.f2193d;
                int i2 = 100;
                String str = "Quick reloaded changed data for " + i + " units active on map.";
                if (m1087A.settingEngine.liveReloading && i == 0) {
                    str = str + " (Note: Live reloading is currently enabled, so changed units may have already be reloaded)";
                    i2 = 170;
                }
                m1087A.f6117bS.m1865a(str, i2);
            }
        }
        if (abstractC0224s == f3772k || abstractC0224s == f3773l || abstractC0224s == f3771j) {
            int i3 = 0;
            if (z) {
                return;
            }
            Iterator it3 = AbstractC0244am.m4761bF().iterator();
            while (it3.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it3.next();
                if ((abstractC0244am2 instanceof AbstractC0244am) && C0758f.m2209a(abstractC0244am2.f6958el, abstractC0244am2.f6959em, pointF.f227a, pointF.f228b) < 2500.0f) {
                    if (abstractC0224s == f3772k) {
                        if (abstractC0244am2.f1651cL == null && abstractC0244am2.f1652cM == null) {
                            abstractC0244am2.m4700ch();
                            if ((abstractC0244am2 instanceof AbstractC0623y) && abstractC0244am2.m4758bI()) {
                                m1087A.f6119bU.m1165a((AbstractC0623y) abstractC0244am2);
                            }
                        }
                    } else if (abstractC0224s == f3773l) {
                        if (abstractC0244am2.f1651cL == null && abstractC0244am2.f1652cM == null) {
                            abstractC0244am2.f1632cs = -1.0f;
                        }
                    } else if (abstractC0224s != f3771j) {
                        continue;
                    } else if (i3 <= 4) {
                        if (!abstractC0244am2.m4758bI() && !(abstractC0244am2 instanceof C0243al) && !abstractC0244am2.f1607bT && abstractC0244am2.f1651cL == null && abstractC0244am2.f1652cM == null) {
                            i3++;
                            InterfaceC0303as mo1758r = abstractC0244am2.mo1758r();
                            for (int i4 = -25; i4 < 25; i4++) {
                                AbstractC0244am mo4485a = mo1758r.mo4485a();
                                mo4485a.f6958el = abstractC0244am2.f6958el + (i4 * 0.5f) + 1.0f;
                                mo4485a.f6959em = abstractC0244am2.f6959em + (i4 * 0.5f) + 1.0f;
                                mo4485a.m4768b(abstractC0244am2.f1609bV);
                                AbstractC0197n.m5053c(mo4485a);
                                mo4485a.f1618ce = C0758f.m2188a((AbstractC1120w) abstractC0244am2, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 25 + i4);
                                if (mo4485a instanceof AbstractC0623y) {
                                    ((AbstractC0623y) mo4485a).f3944ax = true;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        if (abstractC0224s == f3775n) {
            if (z) {
                return;
            }
            C0188f m3396a = C0507q.m3396a(this, pointF.f227a, pointF.f228b, pointF.f227a, pointF.f228b);
            if (m3396a != null) {
                m3396a.f6960en = 100.0f;
                m3396a.f984j = null;
            }
        }
        if (abstractC0224s == f3774m) {
            if (z) {
                return;
            }
            Iterator it4 = AbstractC0244am.m4761bF().iterator();
            while (it4.hasNext()) {
                AbstractC1120w abstractC1120w = (AbstractC1120w) it4.next();
                if ((abstractC1120w instanceof AbstractC0623y) && (abstractC1120w instanceof InterfaceC0501l) && C0758f.m2209a(abstractC1120w.f6958el, abstractC1120w.f6959em, pointF.f227a, pointF.f228b) < 2500.0f) {
                    ((InterfaceC0501l) abstractC1120w).mo3431dw();
                }
            }
            return;
        }
        if (abstractC0224s == f3776o) {
            AbstractC0197n abstractC0197n3 = this.f1609bV;
            if (abstractC0197n3 instanceof C0136a) {
                C0136a c0136a = (C0136a) abstractC0197n3;
                if (c0136a.f619bF > 0.0f) {
                    c0136a.f619bF = 0.0f;
                } else {
                    c0136a.f619bF = 10800.0f;
                }
            }
        }
        if (abstractC0224s == f3777p) {
            AbstractC0197n abstractC0197n4 = this.f1609bV;
            abstractC0197n4.f1312q++;
            if (abstractC0197n4.f1312q > 4) {
                abstractC0197n4.f1312q = 0;
            }
        }
        if (abstractC0224s == f3782u) {
            boolean z2 = false;
            boolean z3 = false;
            Iterator it5 = AbstractC0197n.m5058c().iterator();
            while (it5.hasNext()) {
                AbstractC0197n abstractC0197n5 = (AbstractC0197n) it5.next();
                if (abstractC0197n5 instanceof C0136a) {
                    if (((C0136a) abstractC0197n5).f619bF > 0.0f) {
                        z2 = true;
                    }
                    z3 = true;
                }
            }
            boolean z4 = !z2;
            if (!z3) {
                z4 = !this.f3764c;
            }
            this.f3764c = z4;
            m3215M();
        }
        if (abstractC0224s == f3783v) {
        }
        if (abstractC0224s == f3784w) {
        }
        if (abstractC0224s == f3785x) {
        }
        if (abstractC0224s == f3787z) {
            m1087A.f6231bl = !m1087A.f6231bl;
        }
        if (abstractC0224s == f3788A) {
            C0136a.f553ar = !C0136a.f553ar;
        }
        if (abstractC0224s == f3789B) {
            m1087A.f6233bn = !m1087A.f6233bn;
        }
        if (abstractC0224s instanceof C0611q) {
            C0609p.m3095a(((C0611q) abstractC0224s).f3875a, pointF);
        }
        super.m4787a(abstractC0224s, z, pointF, abstractC0244am);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$1.class */
    public final class C05561 extends AbstractC0224s {
        C05561(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            if (C0555h.m3204w()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Reload all unit data from disk (for modding)";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Reload units";
        }

        /* renamed from: c */
        public int mo3082c() {
            return 0;
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        /* renamed from: d_ */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3081e() {
            return EnumC0226u.f1475a;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1470f;
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: h */
        public boolean mo3077h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$12.class */
    final class C055912 extends AbstractC0224s {
        C055912(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            if (C0555h.m3204w()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Reload data only for active units on map (for modding). This is a faster than reload but will be incomplete.";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Quick reload";
        }

        /* renamed from: c */
        public int mo3082c() {
            return 0;
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        /* renamed from: k */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3081e() {
            return EnumC0226u.f1475a;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1470f;
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: h */
        public boolean mo3077h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$16 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$16.class */
    final class C056316 extends AbstractC0224s {
        C056316(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Clones units at point x50";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Unit Clone";
        }

        /* renamed from: c */
        public int mo3082c() {
            return 0;
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        /* renamed from: k */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3081e() {
            return EnumC0226u.f1481g;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1470f;
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean mo3077h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$17 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$17.class */
    final class C056417 extends AbstractC0224s {
        C056417(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Delete all units at a point";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Delete units at";
        }

        /* renamed from: e_ */
        public boolean mo3080e_() {
            return false;
        }

        /* renamed from: c */
        public int mo3082c() {
            return 0;
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        /* renamed from: f_ */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3081e() {
            return EnumC0226u.f1481g;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1470f;
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean mo3077h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$18 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$18.class */
    final class C056518 extends AbstractC0224s {
        C056518(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Kill units at a point";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Kill units at";
        }

        /* renamed from: e_ */
        public boolean mo3080e_() {
            return false;
        }

        /* renamed from: c */
        public int mo3082c() {
            return 0;
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        /* renamed from: g_ */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3081e() {
            return EnumC0226u.f1481g;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1470f;
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean mo3077h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$19 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$19.class */
    final class C056619 extends AbstractC0224s {
        C056619(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Finish all unit queues at";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Finish queue at";
        }

        /* renamed from: e_ */
        public boolean mo3080e_() {
            return false;
        }

        /* renamed from: c */
        public int mo3082c() {
            return 0;
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        /* renamed from: h_ */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3081e() {
            return EnumC0226u.f1481g;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1470f;
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean mo3077h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$20 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$20.class */
    final class C056920 extends AbstractC0224s {
        C056920(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Create a nuke at a point";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Nuke at";
        }

        /* renamed from: e_ */
        public boolean mo3080e_() {
            return false;
        }

        /* renamed from: c */
        public int mo3082c() {
            return 0;
        }

        /* renamed from: b */
        public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        /* renamed from: i_ */
        public EnumC0249ar mo6163i() {
            return null;
        }

        /* renamed from: e */
        public EnumC0226u mo3081e() {
            return EnumC0226u.f1481g;
        }

        /* renamed from: f */
        public EnumC0225t mo3079f() {
            return EnumC0225t.f1470f;
        }

        /* renamed from: g */
        public boolean mo3078g() {
            return false;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        /* renamed from: h */
        public boolean mo3077h() {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$21 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$21.class */
    final class C057021 extends AbstractC0229x {
        C057021(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Freeze high level AI logic (120secs)";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Freeze AI";
        }

        /* renamed from: d */
        public String mo3129d() {
            String str = "Freeze AI";
            Core.m1087A();
            C0555h m3216L = C0555h.m3216L();
            if (m3216L != null) {
                int i = -1;
                if (m3216L.f1609bV instanceof C0136a) {
                    i = ((int) ((C0136a) m3216L.f1609bV).f619bF) / 60;
                }
                if (i > 0) {
                    str = str + "(" + i + ")";
                }
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return abstractC0244am.f1609bV instanceof C0136a;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$22 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$22.class */
    final class C057122 extends AbstractC0229x {
        C057122(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Change selected player's alliance (players with the same letter are allied)";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Ally:";
        }

        /* renamed from: d */
        public String mo3129d() {
            C0555h m3216L;
            String str = "Ally";
            if (C0555h.m3216L() != null) {
                str = "Ally: " + m3216L.f1609bV.m5025h();
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$2.class */
    public final class C05672 extends AbstractC0229x {
        C05672(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Start recording a replay to file";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Start Recording";
        }

        /* renamed from: d */
        public String mo3129d() {
            String str;
            if (!Core.m1087A().f6126cb.m2463i()) {
                str = "Start Recording";
            } else {
                str = "Stop Recording";
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            if (Core.m1087A().f6126cb.m2464h()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo4955a(AbstractC0244am abstractC0244am) {
            return Core.m1087A().f6126cb.m2463i();
        }

        /* renamed from: c */
        public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
            Core m1087A = Core.m1087A();
            Core.LogDebug2("Start recording clicked");
            if (m1087A.f6126cb.m2464h()) {
                Core.LogDebug2("Already in a replay");
                return false;
            }
            m1087A.m1047a(new RunnableC05681());
            return false;
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$2$1.class */
        class RunnableC05681 implements Runnable {
            RunnableC05681() {
            }

            public void run() {
                Core m1087A = Core.m1087A();
                if (!m1087A.f6126cb.m2463i()) {
                    C0555h m3216L = C0555h.m3216L();
                    m1087A.f6117bS.f5112b = true;
                    if (!m1087A.f6122bX.lock1) {
                        long j = m1087A.f6122bX.f5567w;
                        m1087A.f6122bX.f5482o = true;
                        m1087A.f6122bX.m1630R();
                        m1087A.f6122bX.f5567w = j;
                        m1087A.f6122bX.f5539bm = true;
                        m1087A.f6239bx = 0;
                        m1087A.f6122bX.f5580X = m1087A.f6239bx + 1;
                        m1087A.f6122bX.m1460w();
                    }
                    String str = "[sandbox]" + m1087A.m1020ak() + " [v" + m1087A.m951u() + "] (" + C0758f.m2179a("d MMM yyyy HH.mm.ss") + ").replay";
                    m1087A.f6126cb.m2469d(str);
                    m1087A.f6117bS.f5112b = false;
                    Core.m975f(null, "Replay started as: " + str);
                    C0555h m3216L2 = C0555h.m3216L();
                    if (m3216L2 != null && m3216L != null) {
                        m3216L2.m3210a(m3216L);
                        m3216L2.f3779r = str;
                        return;
                    }
                    Core.m998b("Failed copySettingsFromAnotherEditor");
                    return;
                }
                m1087A.f6126cb.m2470d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3.class */
    public final class C05723 extends AbstractC0229x {
        C05723(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Start playback of last a replay";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Start Playback";
        }

        /* renamed from: d */
        public String mo3129d() {
            String str;
            if (!Core.m1087A().f6126cb.m2464h()) {
                str = "Start Playback";
            } else {
                str = "Stop Playback";
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            boolean m2463i = Core.m1087A().f6126cb.m2463i();
            C0555h m3216L = C0555h.m3216L();
            return (m3216L == null || m3216L.f3779r == null || m2463i) ? false : true;
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            C0555h m3216L = C0555h.m3216L();
            return (m3216L == null || m3216L.f3779r == null) ? false : true;
        }

        /* renamed from: a */
        public boolean mo4955a(AbstractC0244am abstractC0244am) {
            return Core.m1087A().f6126cb.m2464h();
        }

        /* renamed from: c */
        public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
            Core m1087A = Core.m1087A();
            String str = C0555h.m3216L().f3779r;
            if (str == null) {
                m1087A.m969i("No last replay found");
                return false;
            } else if (!m1087A.f6126cb.m2464h()) {
                RunnableC05731 runnableC05731 = new RunnableC05731(str);
                C0767e m2013a = C0767e.m2013a("Start playback of last recording?", true);
                m2013a.m2014a(C0820a.m1731a("menus.common.ok", new Object[0]), new C05742(m2013a, m1087A, runnableC05731));
                m1087A.f6117bS.m1873a(m2013a);
                return false;
            } else {
                m1087A.m1047a(new RunnableC05753());
                return false;
            }
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$3$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3$1.class */
        class RunnableC05731 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f3799a;

            RunnableC05731(String str) {
                this.f3799a = str;
            }

            public void run() {
                Core m1087A = Core.m1087A();
                if (!m1087A.f6126cb.m2464h()) {
                    boolean z = m1087A.f6110bL.f841E;
                    C0555h m3216L = C0555h.m3216L();
                    boolean z2 = m1087A.f6267dp;
                    boolean z3 = m1087A.f6268dq;
                    m1087A.f6126cb.f4477f = true;
                    m1087A.f6126cb.m2471c(this.f3799a);
                    m1087A.f6126cb.f4477f = false;
                    m1087A.f6267dp = z2;
                    m1087A.f6268dq = z3;
                    C0555h m3216L2 = C0555h.m3216L();
                    if (m3216L2 != null && m3216L != null) {
                        m3216L2.m3210a(m3216L);
                    } else {
                        Core.m998b("Failed copySettingsFromAnotherEditor");
                    }
                    m1087A.f6100bv = true;
                    if (m1087A.f6110bL != null) {
                        m1087A.f6110bL.f841E = z;
                    }
                    m1087A.f6161cT = true;
                    if (m3216L2 != null) {
                        m3216L2.m3215M();
                        return;
                    }
                    return;
                }
                Core.LogDebug2("stopPlaybackRunnable: Already started");
            }
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$3$2 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3$2.class */
        class C05742 extends AbstractC0772i {

            /* renamed from: a */
            final /* synthetic */ C0767e f3801a;

            /* renamed from: b */
            final /* synthetic */ Core f3802b;

            /* renamed from: c */
            final /* synthetic */ Runnable f3803c;

            C05742(C0767e c0767e, Core core, Runnable runnable) {
                this.f3801a = c0767e;
                this.f3802b = core;
                this.f3803c = runnable;
            }

            /* renamed from: a */
            public boolean mo1454a(C0765c c0765c) {
                this.f3801a.m1977i();
                this.f3802b.m1047a(this.f3803c);
                return true;
            }
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$3$3 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$3$3.class */
        class RunnableC05753 implements Runnable {
            RunnableC05753() {
            }

            public void run() {
                Core m1087A = Core.m1087A();
                if (!m1087A.f6126cb.m2464h()) {
                    Core.LogDebug2("stopPlaybackRunnable: Already stopped");
                    return;
                }
                m1087A.f6126cb.m2470d();
                m1087A.f6237bt = 1.0f;
                m1087A.f6100bv = true;
                C0555h m3216L = C0555h.m3216L();
                if (m3216L != null) {
                    m1087A.f6099bs = m3216L.f1609bV;
                }
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$4.class */
    final class C05764 extends AbstractC0229x {
        C05764(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            String str = "Hide interface till the screen is clicked/pressed";
            if (Core.m1010au()) {
                str = str + "\n-Enable mouse capture to also hide the mouse";
            }
            return str;
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Hide interface";
        }

        /* renamed from: c */
        public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
            Core.m1087A().f6161cT = true;
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$5.class */
    final class C05775 extends AbstractC0229x {
        C05775(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Freeze full high level logic for all AI forever";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Freeze AI";
        }

        /* renamed from: d */
        public String mo3129d() {
            String str = "Freeze AI";
            C0555h m3216L = C0555h.m3216L();
            if (m3216L != null && m3216L.f3764c) {
                str = "Unfreeze AIs";
            }
            return str;
        }

        /* renamed from: a */
        public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }
    }

    /* renamed from: M */
    public void m3215M() {
        Iterator it = AbstractC0197n.m5058c().iterator();
        while (it.hasNext()) {
            AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
            if (abstractC0197n instanceof C0136a) {
                C0136a c0136a = (C0136a) abstractC0197n;
                if (!this.f3764c) {
                    c0136a.f619bF = 0.0f;
                } else {
                    c0136a.f619bF = Float.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$6.class */
    final class C05786 extends AbstractC0229x {
        C05786(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Pause Game";
        }

        /* renamed from: b */
        public String mo3085b() {
            if (Core.m1087A().f6237bt != 0.0f) {
                return "Pause: Off";
            }
            return "Pause: On";
        }

        /* renamed from: c */
        public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
            Core m1087A = Core.m1087A();
            if (m1087A.f6126cb.m2464h()) {
            }
            if (m1087A.f6237bt != 0.0f) {
                m1087A.f6237bt = 0.0f;
                return false;
            }
            m1087A.f6237bt = 1.0f;
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$7.class */
    final class C05797 extends AbstractC0229x {
        C05797(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Slow motion";
        }

        /* renamed from: b */
        public String mo3085b() {
            if (Core.m1087A().f6237bt != 0.1f) {
                return "Slow motion: Off";
            }
            return "Slow motion: On";
        }

        /* renamed from: c */
        public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
            Core m1087A = Core.m1087A();
            if (m1087A.f6126cb.m2464h()) {
            }
            if (m1087A.f6237bt == 1.0f) {
                m1087A.f6237bt = 0.1f;
                return false;
            }
            m1087A.f6237bt = 1.0f;
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$8.class */
    final class C05808 extends AbstractC0229x {
        C05808(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Fast Forward 1-5x";
        }

        /* renamed from: b */
        public String mo3085b() {
            return "Fast Forward: " + Core.m1087A().f6237bt;
        }

        /* renamed from: c */
        public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
            Core m1087A = Core.m1087A();
            if (m1087A.f6126cb.m2464h()) {
            }
            if (m1087A.f6237bt == 1.0f) {
                m1087A.f6237bt = 2.0f;
                return false;
            } else if (m1087A.f6237bt == 2.0f) {
                m1087A.f6237bt = 3.0f;
                return false;
            } else if (m1087A.f6237bt == 3.0f) {
                m1087A.f6237bt = 4.0f;
                return false;
            } else if (m1087A.f6237bt == 4.0f) {
                m1087A.f6237bt = 5.0f;
                return false;
            } else if (m1087A.f6237bt == 5.0f) {
                m1087A.f6237bt = 10.0f;
                return false;
            } else {
                m1087A.f6237bt = 1.0f;
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$9.class */
    public final class C05819 extends AbstractC0229x {
        C05819(String str) {
            super(str);
        }

        /* renamed from: j */
        public C0934e mo4939j() {
            return C0555h.f3768g;
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Search for units";
        }

        /* renamed from: b */
        public String mo3085b() {
            Core.m1087A();
            C0555h m3216L = C0555h.m3216L();
            if (m3216L != null && m3216L.f3793F == EnumC0596n.f3862e) {
                return "Search: " + C0758f.m2144b(m3216L.f3794G, 8);
            }
            return "Search units";
        }

        /* renamed from: c */
        public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
            Core m1087A = Core.m1087A();
            if (m1087A.f6126cb.m2465g()) {
                m1087A.m990c("Reply active", "Changing search filter is currently not supported while recording a replay");
                return false;
            }
            C05821 c05821 = new C05821();
            c05821.f5641b = "Search units by internal name or text title.";
            c05821.f5644e = "Search units";
            c05821.f5645f = "Search";
            c05821.f5646g = "Cancel";
            C0831ad.m1607a(c05821);
            return false;
        }

        /* renamed from: com.corrodinggames.rts.game.units.h$9$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$9$1.class */
        class C05821 extends C0841ae {
            C05821() {
            }

            /* renamed from: a */
            public void m3183a(String str) {
                Core.LogDebug2("Searching for: " + str);
                Core m1087A = Core.m1087A();
                if (m1087A.f6126cb.m2465g()) {
                    m1087A.m990c("Reply active", "Changing search filter is currently not supported while recording a replay");
                    return;
                }
                C0555h m3216L = C0555h.m3216L();
                if (m3216L == null) {
                    Core.LogDebug2("search: No editor");
                } else if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
                    Core.LogDebug2("search: No text entered");
                    if (m3216L.f3793F == EnumC0596n.f3862e) {
                        m3216L.f3793F = EnumC0596n.f3858a;
                    }
                    m3216L.f3794G = null;
                    m3216L.f3795H = true;
                    C0797f.m1912J();
                } else {
                    m3216L.f3793F = EnumC0596n.f3862e;
                    m3216L.f3794G = str;
                    m3216L.f3795H = true;
                    C0797f.m1912J();
                }
            }

            /* renamed from: a */
            public void m3184a() {
            }
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$10.class */
    final class C055710 extends AbstractC0229x {
        C055710(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "Show hidden unit information in tooltips including flags, ammo, tags and resources";
        }

        /* renamed from: b */
        public String mo3085b() {
            if (!Core.m1087A().f6231bl) {
                return "Debug: Off";
            }
            return "Debug: On";
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$11.class */
    final class C055811 extends AbstractC0229x {
        C055811(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "AI debug view";
        }

        /* renamed from: b */
        public String mo3085b() {
            Core.m1087A();
            if (!C0136a.f553ar) {
                return "AI Debug: Off";
            }
            return "AI Debug: On";
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$13.class */
    final class C056013 extends AbstractC0229x {
        C056013(String str) {
            super(str);
        }

        /* renamed from: a */
        public String mo3088a() {
            return "For debugging autoTriggers. When enabled will log a message when any auto triggers fire on any selected units";
        }

        /* renamed from: b */
        public String mo3085b() {
            if (!Core.m1087A().f6233bn) {
                return "Trigger Debug: Off";
            }
            return "Trigger Debug: On";
        }

        /* renamed from: b */
        public boolean mo3084b(AbstractC0244am abstractC0244am) {
            return Core.m1087A().f6231bl;
        }
    }

    /* renamed from: a */
    public static boolean m3212a(AbstractC0224s abstractC0224s, AbstractC0244am abstractC0244am) {
        if (abstractC0224s instanceof C0213h) {
            abstractC0224s = ((C0213h) abstractC0224s).m4945n_();
        }
        if (abstractC0224s == f3776o || abstractC0224s == f3784w || abstractC0224s == f3785x || abstractC0224s == f3774m || abstractC0224s == f3772k || abstractC0224s == f3771j || abstractC0224s == f3787z || abstractC0224s == f3777p || abstractC0224s == f3778q || abstractC0224s == f3780s || abstractC0224s == f3781t || abstractC0224s == f3789B) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m3208a(ArrayList arrayList, int i) {
        if (i != 1) {
            return;
        }
        f3790C = new ArrayList();
        f3790C.add(new C0593k(true, false));
        f3790C.add(new C0593k(true, true));
        f3790C.add(new C0593k(false, false));
        f3790C.add(new C0595m(true, false));
        f3790C.add(new C0595m(true, true));
        f3790C.add(new C0595m(false, false));
        f3790C.add(new C0592j(true, false));
        f3790C.add(new C0592j(true, true));
        f3790C.add(new C0592j(false, false));
        f3790C.add(new C0594l(true, false));
        f3790C.add(new C0594l(true, true));
        f3790C.add(new C0594l(false, false));
        f3790C.add(new C0611q(EnumC0612r.f3876a));
        f3790C.add(new C0611q(EnumC0612r.f3877b));
        f3790C.add(new C0611q(EnumC0612r.f3878c));
        f3790C.add(new C0611q(EnumC0612r.f3879d));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0591i());
        arrayList2.add(f3786y);
        arrayList2.add(f3769h);
        arrayList2.add(f3770i);
        arrayList2.add(f3772k);
        arrayList2.add(f3771j);
        arrayList2.add(f3773l);
        arrayList2.add(f3775n);
        arrayList2.add(f3774m);
        arrayList2.add(f3782u);
        arrayList2.add(f3783v);
        arrayList2.add(f3784w);
        arrayList2.add(f3785x);
        arrayList2.add(f3787z);
        arrayList2.add(f3777p);
        arrayList2.add(f3778q);
        arrayList2.add(f3780s);
        arrayList2.add(f3781t);
        if (Core.f6191at) {
            arrayList2.add(f3788A);
        }
        arrayList2.add(f3789B);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            f3790C.add(new C0213h((AbstractC0224s) it.next(), f3797J, true));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(EnumC0249ar.f1791ae);
        Collections.sort(arrayList3, new C056114());
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it2.next();
            if (interfaceC0303as != EnumC0249ar.f1769I && !interfaceC0303as.mo4474i().equals("test_tank") && !interfaceC0303as.mo4474i().equals("missing") && interfaceC0303as != EnumC0249ar.f1756v && interfaceC0303as != EnumC0249ar.f1751q && interfaceC0303as != EnumC0249ar.f1778R && interfaceC0303as != EnumC0249ar.f1768H && interfaceC0303as != EnumC0249ar.f1783W && interfaceC0303as != EnumC0249ar.f1784X && interfaceC0303as != EnumC0249ar.f1785Y && interfaceC0303as != EnumC0249ar.f1786Z && (AbstractC0244am.m4736c(interfaceC0303as) instanceof AbstractC0623y) && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2948aE)) {
                C0213h c0213h = new C0213h(new C0227v(interfaceC0303as, 1, null), f3797J);
                boolean z = false;
                Iterator it3 = f3790C.iterator();
                while (it3.hasNext()) {
                    if (((AbstractC0224s) it3.next()).equals(c0213h)) {
                        z = true;
                    }
                }
                if (!z) {
                    f3790C.add(c0213h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.h$14 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$14.class */
    public final class C056114 implements Comparator {
        C056114() {
        }

        /* renamed from: a */
        public int mo3106a(InterfaceC0303as interfaceC0303as, InterfaceC0303as interfaceC0303as2) {
            AbstractC0244am m4736c = AbstractC0244am.m4736c(interfaceC0303as);
            AbstractC0244am m4736c2 = AbstractC0244am.m4736c(interfaceC0303as2);
            int compareTo = Boolean.valueOf(m4736c.mo4385bP()).compareTo(Boolean.valueOf(m4736c2.mo4385bP()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(interfaceC0303as.mo4473j()).compareTo(Boolean.valueOf(interfaceC0303as2.mo4473j()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            int compareTo3 = Boolean.valueOf(m4736c.mo4386bO()).compareTo(Boolean.valueOf(m4736c2.mo4386bO()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            C0424b mo4465u = interfaceC0303as.mo4465u();
            C0424b mo4465u2 = interfaceC0303as2.mo4465u();
            C0424b mo4488B = interfaceC0303as.mo4488B();
            C0424b mo4488B2 = interfaceC0303as2.mo4488B();
            if (mo4488B != null) {
                mo4465u = C0424b.m4116a(mo4465u, mo4488B);
            }
            if (mo4488B2 != null) {
                mo4465u2 = C0424b.m4116a(mo4465u2, mo4488B2);
            }
            int m4118a = mo4465u.m4118a(mo4465u2);
            if (m4118a != 0) {
                return m4118a;
            }
            return 0;
        }
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        Core.m1087A();
        return f3790C;
    }

    /* renamed from: E */
    public boolean mo3061E() {
        return true;
    }

    /* renamed from: g */
    public float mo3040g(int i) {
        return 10.0f;
    }

    /* renamed from: F */
    public boolean mo3060F() {
        return Core.m1087A().settingEngine.renderExtraShadows && !this.f1607bT;
    }

    /* renamed from: G */
    public float mo3059G() {
        return 1.0f;
    }

    /* renamed from: H */
    public float mo3058H() {
        return 1.0f;
    }

    /* renamed from: u */
    public boolean mo1756u() {
        return true;
    }

    /* renamed from: I */
    public boolean mo3057I() {
        return false;
    }

    /* renamed from: d */
    public boolean mo3044d(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: J */
    public boolean mo3056J() {
        return true;
    }

    /* renamed from: a */
    public float mo3052a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        return super.mo3052a(abstractC0244am, 0.0f, c0188f);
    }

    /* renamed from: com.corrodinggames.rts.game.units.h$15 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h$15.class */
    final class C056215 extends C0207b {
        C056215() {
        }

        public boolean isAvailable(AbstractC0224s abstractC0224s, AbstractC0244am abstractC0244am) {
            if (abstractC0224s instanceof C0213h) {
                abstractC0224s = ((C0213h) abstractC0224s).m4945n_();
            }
            C0555h m3216L = C0555h.m3216L();
            if (m3216L == null) {
                return true;
            }
            EnumC0596n enumC0596n = m3216L.f3793F;
            if (enumC0596n == null) {
                enumC0596n = EnumC0596n.f3858a;
            }
            if (enumC0596n == EnumC0596n.f3858a && C0555h.m3212a(abstractC0224s, abstractC0244am)) {
                return false;
            }
            if (enumC0596n == EnumC0596n.f3861d && abstractC0224s == C0555h.f3769h) {
                return true;
            }
            if (enumC0596n == EnumC0596n.f3861d && abstractC0224s == C0555h.f3770i) {
                return true;
            }
            if (enumC0596n == EnumC0596n.f3862e && abstractC0224s == C0555h.f3786y) {
                return true;
            }
            if (abstractC0224s == C0555h.f3789B && !C0555h.f3789B.mo3084b(abstractC0244am)) {
                return false;
            }
            return enumC0596n.m3120a(abstractC0224s.mo6163i());
        }
    }

    /* renamed from: O */
    public void m3214O() {
    }

    /* renamed from: P */
    public boolean mo3055P() {
        return true;
    }

    /* renamed from: a */
    public void m3210a(C0555h c0555h) {
        this.f3779r = c0555h.f3779r;
        this.f3764c = c0555h.f3764c;
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.m1401c(1);
        streamWriter.m1411a(this.f3793F);
        streamWriter.m1404b(this.f3794G);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m3209a(Reader reader) {
        byte m1304d = reader.m1304d();
        this.f3793F = (EnumC0596n) reader.m1308b(EnumC0596n.class);
        if (this.f3793F == null) {
            this.f3793F = EnumC0596n.f3858a;
        }
        if (m1304d >= 1) {
            this.f3794G = reader.ReadString();
        }
        super.m2961a(reader);
    }
}
