package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.custom.C0402bc;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0231z;
import com.corrodinggames.rts.game.units.p014b.C0308a;
import com.corrodinggames.rts.game.units.p014b.C0310c;
import com.corrodinggames.rts.game.units.p014b.C0313d;
import com.corrodinggames.rts.game.units.p014b.C0316e;
import com.corrodinggames.rts.game.units.p014b.C0317f;
import com.corrodinggames.rts.game.units.p015c.C0319a;
import com.corrodinggames.rts.game.units.p024d.C0470a;
import com.corrodinggames.rts.game.units.p024d.C0485c;
import com.corrodinggames.rts.game.units.p024d.C0489e;
import com.corrodinggames.rts.game.units.p024d.C0490f;
import com.corrodinggames.rts.game.units.p024d.C0492g;
import com.corrodinggames.rts.game.units.p024d.C0495h;
import com.corrodinggames.rts.game.units.p024d.C0502m;
import com.corrodinggames.rts.game.units.p024d.C0505p;
import com.corrodinggames.rts.game.units.p024d.C0507q;
import com.corrodinggames.rts.game.units.p024d.C0510r;
import com.corrodinggames.rts.game.units.p024d.C0512t;
import com.corrodinggames.rts.game.units.p024d.C0514v;
import com.corrodinggames.rts.game.units.p024d.C0516w;
import com.corrodinggames.rts.game.units.p024d.p025a.C0471a;
import com.corrodinggames.rts.game.units.p024d.p025a.C0473b;
import com.corrodinggames.rts.game.units.p026e.C0518a;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.game.units.p026e.C0520c;
import com.corrodinggames.rts.game.units.p026e.C0521d;
import com.corrodinggames.rts.game.units.p026e.C0522e;
import com.corrodinggames.rts.game.units.p026e.C0523f;
import com.corrodinggames.rts.game.units.p026e.C0524g;
import com.corrodinggames.rts.game.units.p026e.C0526i;
import com.corrodinggames.rts.game.units.p026e.C0530k;
import com.corrodinggames.rts.game.units.p026e.C0531l;
import com.corrodinggames.rts.game.units.p026e.C0532m;
import com.corrodinggames.rts.game.units.p026e.C0533n;
import com.corrodinggames.rts.game.units.p026e.C0534o;
import com.corrodinggames.rts.game.units.p029h.C0583a;
import com.corrodinggames.rts.game.units.p029h.C0584b;
import com.corrodinggames.rts.game.units.p029h.C0585c;
import com.corrodinggames.rts.game.units.p029h.C0586d;
import com.corrodinggames.rts.game.units.p029h.C0587e;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.corrodinggames.rts.game.units.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar.class */
public abstract class AbstractC0249ar implements InterfaceC0303as {

    /* renamed from: aa */
    C0231z f1735aa;

    /* renamed from: ab */
    int f1736ab;

    /* renamed from: ac */
    String f1737ac;

    /* renamed from: ad */
    String f1738ad;

    /* renamed from: ae */
    public static ArrayList f1739ae;

    /* renamed from: af */
    C0304at[] f1740af;

    /* renamed from: ag */
    public static boolean f1741ag;

    /* renamed from: ah */
    C0424b f1742ah;

    /* renamed from: a */
    public static final AbstractC0249ar f1743a = new C02501("extractor", 0);

    /* renamed from: b */
    public static final AbstractC0249ar f1744b = new C025312("landFactory", 1);

    /* renamed from: c */
    public static final AbstractC0249ar f1745c = new C026523("airFactory", 2);

    /* renamed from: d */
    public static final AbstractC0249ar f1746d = new C027734("seaFactory", 3);

    /* renamed from: e */
    public static final AbstractC0249ar f1747e = new C028945("commandCenter", 4);

    /* renamed from: f */
    public static final AbstractC0249ar f1748f = new C029550("turret", 5);

    /* renamed from: g */
    public static final AbstractC0249ar f1749g = new C029651("antiAirTurret", 6);

    /* renamed from: h */
    public static final AbstractC0249ar f1750h = new C029752("builder", 7);

    /* renamed from: i */
    public static final AbstractC0249ar f1751i = new C029853("tank", 8);

    /* renamed from: j */
    public static final AbstractC0249ar f1752j = new C02612("hoverTank", 9);

    /* renamed from: k */
    public static final AbstractC0249ar f1753k = new C02723("artillery", 10);

    /* renamed from: l */
    public static final AbstractC0249ar f1754l = new C02834("helicopter", 11);

    /* renamed from: m */
    public static final AbstractC0249ar f1755m = new C02945("airShip", 12);

    /* renamed from: n */
    public static final AbstractC0249ar f1756n = new C02996("gunShip", 13);

    /* renamed from: o */
    public static final AbstractC0249ar f1757o = new C03007("missileShip", 14);

    /* renamed from: p */
    public static final AbstractC0249ar f1758p = new C03018("gunBoat", 15);

    /* renamed from: q */
    public static final AbstractC0249ar f1759q = new C03029("megaTank", 16);

    /* renamed from: r */
    public static final AbstractC0249ar f1760r = new C025110("laserTank", 17);

    /* renamed from: s */
    public static final AbstractC0249ar f1761s = new C025211("hovercraft", 18);

    /* renamed from: t */
    public static final AbstractC0249ar f1762t = new C025413("ladybug", 19);

    /* renamed from: u */
    public static final AbstractC0249ar f1763u = new C025514("battleShip", 20);

    /* renamed from: v */
    public static final AbstractC0249ar f1764v = new C025615("tankDestroyer", 21);

    /* renamed from: w */
    public static final AbstractC0249ar f1765w = new C025716("heavyTank", 22);

    /* renamed from: x */
    public static final AbstractC0249ar f1766x = new C025817("heavyHoverTank", 23);

    /* renamed from: y */
    public static final AbstractC0249ar f1767y = new C025918("laserDefence", 24);

    /* renamed from: z */
    public static final AbstractC0249ar f1768z = new C026019("dropship", 25);

    /* renamed from: A */
    public static final AbstractC0249ar f1769A = new C026220("tree", 26);

    /* renamed from: B */
    public static final AbstractC0249ar f1770B = new C026321("repairbay", 27);

    /* renamed from: C */
    public static final AbstractC0249ar f1771C = new C026422("NukeLaucher", 28);

    /* renamed from: D */
    public static final AbstractC0249ar f1772D = new C026624("AntiNukeLaucher", 29);

    /* renamed from: E */
    public static final AbstractC0249ar f1773E = new C026725("mammothTank", 30);

    /* renamed from: F */
    public static final AbstractC0249ar f1774F = new C026826("experimentalTank", 31);

    /* renamed from: G */
    public static final AbstractC0249ar f1775G = new C026927("experimentalLandFactory", 32);

    /* renamed from: H */
    public static final AbstractC0249ar f1776H = new C027028("crystalResource", 33);

    /* renamed from: I */
    public static final AbstractC0249ar f1777I = new C027129("wall_v", 34);

    /* renamed from: J */
    public static final AbstractC0249ar f1778J = new C027330("fabricator", 35);

    /* renamed from: K */
    public static final AbstractC0249ar f1779K = new C027431("attackSubmarine", 36);

    /* renamed from: L */
    public static final AbstractC0249ar f1780L = new C027532("builderShip", 37);

    /* renamed from: M */
    public static final AbstractC0249ar f1781M = new C027633("amphibiousJet", 38);

    /* renamed from: N */
    public static final AbstractC0249ar f1782N = new C027835("supplyDepot", 39);

    /* renamed from: O */
    public static final AbstractC0249ar f1783O = new C027936("experimentalHoverTank", 40);

    /* renamed from: P */
    public static final AbstractC0249ar f1784P = new C028037("turret_artillery", 41);

    /* renamed from: Q */
    public static final AbstractC0249ar f1785Q = new C028138("turret_flamethrower", 42);

    /* renamed from: R */
    public static final AbstractC0249ar f1786R = new C028239("fogRevealer", 43);

    /* renamed from: S */
    public static final AbstractC0249ar f1787S = new C028440("spreadingFire", 44);

    /* renamed from: T */
    public static final AbstractC0249ar f1788T = new C028541("antiAirTurretT2", 45);

    /* renamed from: U */
    public static final AbstractC0249ar f1789U = new C028642("turretT2", 46);

    /* renamed from: V */
    public static final AbstractC0249ar f1790V = new C028743("turretT3", 47);

    /* renamed from: W */
    public static final AbstractC0249ar f1791W = new C028844("damagingBorder", 48);

    /* renamed from: X */
    public static final AbstractC0249ar f1792X = new C029046("zoneMarker", 49);

    /* renamed from: Y */
    public static final AbstractC0249ar f1793Y = new C029147("editorOrBuilder", 50);

    /* renamed from: Z */
    public static final AbstractC0249ar f1794Z = new C029248("dummyNonUnitWithTeam", 51);

    /* renamed from: ai */
    private static final /* synthetic */ AbstractC0249ar[] f1795ai = {f1743a, f1744b, f1745c, f1746d, f1747e, f1748f, f1749g, f1750h, f1751i, f1752j, f1753k, f1754l, f1755m, f1756n, f1757o, f1758p, f1759q, f1760r, f1761s, f1762t, f1763u, f1764v, f1765w, f1766x, f1767y, f1768z, f1769A, f1770B, f1771C, f1772D, f1773E, f1774F, f1775G, f1776H, f1777I, f1778J, f1779K, f1780L, f1781M, f1782N, f1783O, f1784P, f1785Q, f1786R, f1787S, f1788T, f1789U, f1790V, f1791W, f1792X, f1793Y, f1794Z};

    /* renamed from: a */
    public abstract AbstractC0244am m4366a(boolean z);

    /* renamed from: b */
    public abstract void m4365b();

    /* renamed from: c */
    public abstract int mo4230c();

    public static AbstractC0249ar[] values() {
        return (AbstractC0249ar[]) f1795ai.clone();
    }

    public static AbstractC0249ar valueOf(String str) {
        return (AbstractC0249ar) Enum.valueOf(AbstractC0249ar.class, str);
    }

    private AbstractC0249ar(String str, int i) {
        this.f1735aa = new C0231z(this);
        this.f1736ab = -1;
    }

    /* synthetic */ AbstractC0249ar(String str, int i, C02501 c02501) {
        this(str, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.ar$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$1.class */
    public enum C02501 extends AbstractC0249ar {
        C02501(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4360a(boolean z) {
            return new C0492g(z);
        }

        /* renamed from: b */
        public void m4359b() {
            C0492g.m3366c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 700;
        }

        /* renamed from: c */
        public int m4358c(int i) {
            if (i == 2) {
                return 1200;
            }
            if (i == 3) {
                return 2500;
            }
            return 0;
        }

        /* renamed from: p */
        public boolean mo4216p() {
            return true;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }

        /* renamed from: a */
        public int mo4232a(AbstractC0244am abstractC0244am) {
            if (abstractC0244am.m4460cI()) {
                return 110;
            }
            return 0;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$12.class */
    enum C025312 extends AbstractC0249ar {
        C025312(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4352a(boolean z) {
            return new C0502m(z);
        }

        /* renamed from: b */
        public void m4351b() {
            C0502m.m3307b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 700;
        }

        /* renamed from: c */
        public int m4350c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }

        /* renamed from: a */
        public void m4353a(ArrayList arrayList, int i) {
            C0502m.m3308a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$23 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$23.class */
    enum C026523 extends AbstractC0249ar {
        C026523(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4325a(boolean z) {
            return new C0470a(z);
        }

        /* renamed from: b */
        public void m4324b() {
            C0470a.m3456b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1000;
        }

        /* renamed from: c */
        public int m4323c(int i) {
            if (i == 2) {
                return 1500;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }

        /* renamed from: a */
        public void m4326a(ArrayList arrayList, int i) {
            C0470a.m3457a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$34 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$34.class */
    enum C027734 extends AbstractC0249ar {
        C027734(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4296a(boolean z) {
            return new C0512t(z);
        }

        /* renamed from: b */
        public void m4295b() {
            C0512t.m3279b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1000;
        }

        /* renamed from: c */
        public int m4294c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 7.0E-4f;
        }

        /* renamed from: a */
        public void m4297a(ArrayList arrayList, int i) {
            C0512t.m3280a(arrayList, i);
        }

        /* renamed from: a */
        public int mo4232a(AbstractC0244am abstractC0244am) {
            return 110;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$45 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$45.class */
    enum C028945 extends AbstractC0249ar {
        C028945(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4269a(boolean z) {
            return new C0489e(z);
        }

        /* renamed from: b */
        public void m4268b() {
            C0489e.m3376b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 3000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 5.0E-4f;
        }

        /* renamed from: a */
        public void m4270a(ArrayList arrayList, int i) {
            C0489e.m3377a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$50 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$50.class */
    enum C029550 extends AbstractC0249ar {
        C029550(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4254a(boolean z) {
            return new C0473b(z);
        }

        /* renamed from: b */
        public void m4253b() {
            C0473b.m3426dy();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 500;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$51 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$51.class */
    enum C029651 extends AbstractC0249ar {
        C029651(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4252a(boolean z) {
            return new C0471a(z);
        }

        /* renamed from: b */
        public void m4251b() {
            C0471a.m3453b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 600;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 8.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$52 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$52.class */
    enum C029752 extends AbstractC0249ar {
        C029752(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4249a(boolean z) {
            return new C0519b(z);
        }

        /* renamed from: b */
        public void m4248b() {
            C0519b.m3253K();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 500;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.002f;
        }

        /* renamed from: l */
        public boolean mo4220l() {
            return true;
        }

        /* renamed from: m */
        public boolean mo4219m() {
            return true;
        }

        /* renamed from: n */
        public boolean mo4218n() {
            return true;
        }

        /* renamed from: a */
        public void m4250a(ArrayList arrayList, int i) {
            C0519b.m3251a(arrayList, i);
            C0555h.m3127a((ArrayList) null, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$53 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$53.class */
    enum C029853 extends AbstractC0249ar {
        C029853(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4247a(boolean z) {
            return new C0533n(z);
        }

        /* renamed from: b */
        public void m4246b() {
            C0533n.m3191c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 350;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.002f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$2.class */
    enum C02612 extends AbstractC0249ar {
        C02612(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4334a(boolean z) {
            return new C0524g(z);
        }

        /* renamed from: b */
        public void m4333b() {
            C0524g.m3228c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 450;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.002f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$3.class */
    enum C02723 extends AbstractC0249ar {
        C02723(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4309a(boolean z) {
            return new C0518a(z);
        }

        /* renamed from: b */
        public void m4308b() {
            C0518a.m3254c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 900;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.0014f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$4.class */
    enum C02834 extends AbstractC0249ar {
        C02834(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4283a(boolean z) {
            return new C0317f(z);
        }

        /* renamed from: b */
        public void m4282b() {
            C0317f.m4156c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 650;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.0012f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$5.class */
    enum C02945 extends AbstractC0249ar {
        C02945(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4256a(boolean z) {
            return new C0308a(z);
        }

        /* renamed from: b */
        public void m4255b() {
            C0308a.m4177c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 600;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.002f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$6.class */
    enum C02996 extends AbstractC0249ar {
        C02996(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4245a(boolean z) {
            return new C0316e(z);
        }

        /* renamed from: b */
        public void m4244b() {
            C0316e.m4158c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }

        /* renamed from: g */
        public int mo4225g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$7.class */
    enum C03007 extends AbstractC0249ar {
        C03007(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4243a(boolean z) {
            return new C0586d(z);
        }

        /* renamed from: b */
        public void m4242b() {
            C0586d.m3083c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 900;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$8.class */
    enum C03018 extends AbstractC0249ar {
        C03018(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4241a(boolean z) {
            return new C0585c(z);
        }

        /* renamed from: b */
        public void m4240b() {
            C0585c.m3087c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 300;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.005f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$9.class */
    enum C03029 extends AbstractC0249ar {
        C03029(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4239a(boolean z) {
            return new C0532m(z);
        }

        /* renamed from: b */
        public void m4238b() {
            C0532m.m3194c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.0015f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$10.class */
    enum C025110 extends AbstractC0249ar {
        C025110(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4357a(boolean z) {
            return new C0530k(z);
        }

        /* renamed from: b */
        public void m4356b() {
            C0530k.m3198c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1300;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.0013f;
        }

        /* renamed from: g */
        public int mo4225g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$11.class */
    enum C025211 extends AbstractC0249ar {
        C025211(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4355a(boolean z) {
            return new C0526i(z);
        }

        /* renamed from: b */
        public void m4354b() {
            C0526i.m3211c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 600;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.003f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$13.class */
    enum C025413 extends AbstractC0249ar {
        C025413(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4349a(boolean z) {
            return new C0319a(z);
        }

        /* renamed from: b */
        public void m4348b() {
            C0319a.m4152c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 400;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.004f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$14 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$14.class */
    enum C025514 extends AbstractC0249ar {
        C025514(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4347a(boolean z) {
            return new C0583a(z);
        }

        /* renamed from: b */
        public void m4346b() {
            C0583a.m3103c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1500;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$15 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$15.class */
    enum C025615 extends AbstractC0249ar {
        C025615(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4345a(boolean z) {
            return new C0534o(z);
        }

        /* renamed from: b */
        public void m4344b() {
            C0534o.m3188c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.003f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$16 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$16.class */
    enum C025716 extends AbstractC0249ar {
        C025716(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4343a(boolean z) {
            return new C0523f(z);
        }

        /* renamed from: b */
        public void m4342b() {
            C0523f.m3233c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.0011f;
        }

        /* renamed from: g */
        public int mo4225g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$17 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$17.class */
    enum C025817 extends AbstractC0249ar {
        C025817(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4341a(boolean z) {
            return new C0522e(z);
        }

        /* renamed from: b */
        public void m4340b() {
            C0522e.m3235c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }

        /* renamed from: g */
        public int mo4225g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$18 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$18.class */
    enum C025918 extends AbstractC0249ar {
        C025918(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4339a(boolean z) {
            return new C0505p(z);
        }

        /* renamed from: b */
        public void m4338b() {
            C0505p.m3302b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1200;
        }

        /* renamed from: c */
        public int m4337c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$19 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$19.class */
    enum C026019 extends AbstractC0249ar {
        C026019(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4336a(boolean z) {
            return new C0313d(z);
        }

        /* renamed from: b */
        public void m4335b() {
            C0313d.m4162c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }

        /* renamed from: g */
        public int mo4225g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$20 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$20.class */
    enum C026220 extends AbstractC0249ar {
        C026220(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4332a(boolean z) {
            return new C0243al(z);
        }

        /* renamed from: b */
        public void m4331b() {
            C0243al.m4524b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 0;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.0025f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$21 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$21.class */
    enum C026321 extends AbstractC0249ar {
        C026321(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4330a(boolean z) {
            return new C0510r(z);
        }

        /* renamed from: b */
        public void m4329b() {
            C0510r.m3283dr();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1500;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$22 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$22.class */
    enum C026422 extends AbstractC0249ar {
        C026422(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4328a(boolean z) {
            return new C0507q(z);
        }

        /* renamed from: b */
        public void m4327b() {
            C0507q.m3292b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 45000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 1.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$24 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$24.class */
    enum C026624 extends AbstractC0249ar {
        C026624(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4322a(boolean z) {
            return new C0485c(z);
        }

        /* renamed from: b */
        public void m4321b() {
            C0485c.m3396b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 15000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 7.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$25 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$25.class */
    enum C026725 extends AbstractC0249ar {
        C026725(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4320a(boolean z) {
            return new C0531l(z);
        }

        /* renamed from: b */
        public void m4319b() {
            C0531l.m3196c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 3900;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 9.0E-4f;
        }

        /* renamed from: g */
        public int mo4225g() {
            return 3;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$26 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$26.class */
    enum C026826 extends AbstractC0249ar {
        C026826(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4318a(boolean z) {
            return new C0521d(z);
        }

        /* renamed from: b */
        public void m4317b() {
            C0521d.m3239c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 14000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 2.0E-4f;
        }

        /* renamed from: g */
        public int mo4225g() {
            return 3;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$27 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$27.class */
    enum C026927 extends AbstractC0249ar {
        C026927(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4315a(boolean z) {
            return new C0490f(z);
        }

        /* renamed from: b */
        public void m4314b() {
            C0490f.m3371b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 11000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 3.5E-4f;
        }

        /* renamed from: a */
        public void m4316a(ArrayList arrayList, int i) {
            C0490f.m3372a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$28 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$28.class */
    enum C027028 extends AbstractC0249ar {
        C027028(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4313a(boolean z) {
            return new C0517e(z);
        }

        /* renamed from: b */
        public void m4312b() {
            C0517e.m3263c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 5000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$29 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$29.class */
    enum C027129 extends AbstractC0249ar {
        C027129(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4311a(boolean z) {
            return new C0516w(z);
        }

        /* renamed from: b */
        public void m4310b() {
            C0516w.m3266b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 100;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.003f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$30 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$30.class */
    enum C027330 extends AbstractC0249ar {
        C027330(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4307a(boolean z) {
            return new C0495h(z);
        }

        /* renamed from: b */
        public void m4306b() {
            C0495h.m3360c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1500;
        }

        /* renamed from: c */
        public int m4305c(int i) {
            if (i == 2) {
                return 3000;
            }
            if (i == 3) {
                return 5000;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$31 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$31.class */
    enum C027431 extends AbstractC0249ar {
        C027431(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4304a(boolean z) {
            return new C0587e(z);
        }

        /* renamed from: b */
        public void m4303b() {
            C0587e.m3075b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$32 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$32.class */
    enum C027532 extends AbstractC0249ar {
        C027532(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4301a(boolean z) {
            return new C0584b(z);
        }

        /* renamed from: b */
        public void m4300b() {
            C0584b.m3101K();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 500;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }

        /* renamed from: l */
        public boolean mo4220l() {
            return true;
        }

        /* renamed from: m */
        public boolean mo4219m() {
            return false;
        }

        /* renamed from: a */
        public void m4302a(ArrayList arrayList, int i) {
            C0584b.m3099a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$33 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$33.class */
    enum C027633 extends AbstractC0249ar {
        C027633(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4299a(boolean z) {
            return new C0310c(z);
        }

        /* renamed from: b */
        public void m4298b() {
            C0310c.m4169f();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 2000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }

        /* renamed from: g */
        public int mo4225g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$35 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$35.class */
    enum C027835 extends AbstractC0249ar {
        C027835(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4293a(boolean z) {
            return new C0514v(z);
        }

        /* renamed from: b */
        public void m4292b() {
            C0514v.m3270c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$36 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$36.class */
    enum C027936 extends AbstractC0249ar {
        C027936(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4291a(boolean z) {
            return new C0520c(z);
        }

        /* renamed from: b */
        public void m4290b() {
            C0520c.m3244c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 21000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 2.0E-4f;
        }

        /* renamed from: g */
        public int mo4225g() {
            return 3;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$37 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$37.class */
    enum C028037 extends AbstractC0249ar {
        C028037(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4289a(boolean z) {
            C0473b c0473b = new C0473b(z);
            c0473b.m4495a_("artillery");
            return c0473b;
        }

        /* renamed from: b */
        public void m4288b() {
        }

        /* renamed from: c */
        public int mo4230c() {
            return AbstractC0249ar.f1748f.mo4230c() + C0473b.f3404dM.mo3034c();
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$38 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$38.class */
    enum C028138 extends AbstractC0249ar {
        C028138(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4287a(boolean z) {
            C0473b c0473b = new C0473b(z);
            c0473b.m4495a_("flamethrower");
            return c0473b;
        }

        /* renamed from: b */
        public void m4286b() {
        }

        /* renamed from: c */
        public int mo4230c() {
            return AbstractC0249ar.f1748f.mo4230c() + C0473b.f3405dN.mo3034c();
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$39 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$39.class */
    enum C028239 extends AbstractC0249ar {
        C028239(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4285a(boolean z) {
            return new C0619u(z);
        }

        /* renamed from: b */
        public void m4284b() {
            C0619u.m3019c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$40 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$40.class */
    enum C028440 extends AbstractC0249ar {
        C028440(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4281a(boolean z) {
            return new C0240ai(z);
        }

        /* renamed from: b */
        public void m4280b() {
            C0240ai.m4537b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$41 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$41.class */
    enum C028541 extends AbstractC0249ar {
        C028541(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4279a(boolean z) {
            C0471a c0471a = new C0471a(z);
            c0471a.mo3185a(2);
            return c0471a;
        }

        /* renamed from: b */
        public void m4278b() {
        }

        /* renamed from: c */
        public int mo4230c() {
            return AbstractC0249ar.f1748f.mo4230c() + C0471a.f3374e.mo3034c();
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$42 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$42.class */
    enum C028642 extends AbstractC0249ar {
        C028642(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4277a(boolean z) {
            C0473b c0473b = new C0473b(z);
            c0473b.m4495a_("gunT2");
            return c0473b;
        }

        /* renamed from: b */
        public void m4276b() {
        }

        /* renamed from: c */
        public int mo4230c() {
            return AbstractC0249ar.f1748f.mo4230c() + C0473b.f3402dK.mo3034c();
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$43 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$43.class */
    enum C028743 extends AbstractC0249ar {
        C028743(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4222j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4275a(boolean z) {
            C0473b c0473b = new C0473b(z);
            c0473b.m4495a_("gunT3");
            return c0473b;
        }

        /* renamed from: b */
        public void m4274b() {
        }

        /* renamed from: c */
        public int mo4230c() {
            return AbstractC0249ar.f1748f.mo4230c() + C0473b.f3402dK.mo3034c() + C0473b.f3403dL.mo3034c();
        }

        /* renamed from: D */
        public float mo4235D() {
            return 3.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$44 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$44.class */
    enum C028844 extends AbstractC0249ar {
        C028844(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: A */
        public boolean m4273A() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4272a(boolean z) {
            return new C0535f(z);
        }

        /* renamed from: b */
        public void m4271b() {
            C0535f.m3181c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$46 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$46.class */
    enum C029046 extends AbstractC0249ar {
        C029046(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: A */
        public boolean m4267A() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4266a(boolean z) {
            C0535f c0535f = new C0535f(z);
            c0535f.f3702q = true;
            return c0535f;
        }

        /* renamed from: b */
        public void m4265b() {
            C0535f.m3181c();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$47 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$47.class */
    enum C029147 extends AbstractC0249ar {
        C029147(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: A */
        public boolean m4264A() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4262a(boolean z) {
            return new C0555h(z);
        }

        /* renamed from: b */
        public void m4261b() {
            C0555h.m3135K();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 500;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 0.002f;
        }

        /* renamed from: l */
        public boolean mo4220l() {
            return true;
        }

        /* renamed from: m */
        public boolean mo4219m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo4218n() {
            return false;
        }

        /* renamed from: a */
        public void m4263a(ArrayList arrayList, int i) {
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$48 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$48.class */
    enum C029248 extends AbstractC0249ar {
        C029248(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: e */
        public String mo4227e() {
            return mo4223i();
        }

        /* renamed from: i */
        public String mo4223i() {
            return "marker";
        }

        /* renamed from: A */
        public boolean m4260A() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4236C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4259a(boolean z) {
            return new C0618t(z);
        }

        /* renamed from: b */
        public void m4258b() {
            C0618t.m3022b();
        }

        /* renamed from: c */
        public int mo4230c() {
            return 9999;
        }

        /* renamed from: D */
        public float mo4235D() {
            return 1.0f;
        }
    }

    /* renamed from: a */
    public AbstractC0244am mo4234a() {
        return m4366a(false);
    }

    /* renamed from: d */
    public C0231z mo4229d() {
        return this.f1735aa;
    }

    /* renamed from: e */
    public String mo4227e() {
        if (this.f1736ab != C0820a.f5401c || this.f1737ac == null) {
            this.f1736ab = C0820a.f5401c;
            String str = "units." + name() + ".name";
            this.f1737ac = C0820a.m1692a(str, null, new Object[0]);
            if (this.f1737ac == null) {
                if (LoggerMaybe.m1079A().m1005ar() && !m4377A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.f1737ac = name();
            }
        }
        return this.f1737ac;
    }

    /* renamed from: f */
    public String mo4226f() {
        if (this.f1736ab != C0820a.f5401c || this.f1738ad == null) {
            this.f1736ab = C0820a.f5401c;
            String str = "units." + name() + ".description";
            this.f1738ad = C0820a.m1692a(str, null, new Object[0]);
            if (this.f1738ad == null) {
                if (LoggerMaybe.m1079A().m1005ar() && !m4377A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.f1738ad = VariableScope.nullOrMissingString;
            }
        }
        return this.f1738ad;
    }

    /* renamed from: g */
    public int mo4225g() {
        return 1;
    }

    /* renamed from: a */
    public void m4367a(ArrayList arrayList, int i) {
    }

    /* renamed from: h */
    public void mo4224h() {
        C0304at[] c0304atArr = new C0304at[3];
        for (int i = 1; i <= 3; i++) {
            C0304at c0304at = new C0304at();
            m4367a(c0304at.f1796a, i);
            c0304atArr[i - 1] = c0304at;
        }
        this.f1740af = c0304atArr;
    }

    /* renamed from: a */
    public ArrayList mo4233a(int i) {
        if (i > 3) {
            throw new RuntimeException("Tech level:" + i + " greater than maxTechLevel");
        }
        return this.f1740af[i - 1].f1796a;
    }

    /* renamed from: i */
    public String mo4223i() {
        return name();
    }

    /* renamed from: j */
    public boolean mo4222j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo4221k() {
        return mo4222j();
    }

    /* renamed from: l */
    public boolean mo4220l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo4219m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo4218n() {
        return false;
    }

    /* renamed from: o */
    public EnumC0246ao mo4217o() {
        AbstractC0244am m4505a = AbstractC0244am.m4505a(this);
        if (m4505a == null) {
            throw new RuntimeException("Shared unit is null for:" + name());
        }
        return m4505a.mo2991h();
    }

    /* renamed from: p */
    public boolean mo4216p() {
        return false;
    }

    /* renamed from: q */
    public C0402bc mo4215q() {
        return null;
    }

    /* renamed from: a */
    public static InterfaceC0303as m4372a(String str) {
        return m4368a(str, true);
    }

    /* renamed from: a */
    public static InterfaceC0303as m4368a(String str, boolean z) {
        AbstractC0249ar[] values;
        InterfaceC0303as m3499m;
        if (z && (m3499m = C0453l.m3499m(str)) != null) {
            return m3499m;
        }
        for (AbstractC0249ar abstractC0249ar : values()) {
            if (abstractC0249ar.name().equalsIgnoreCase(str)) {
                return abstractC0249ar;
            }
        }
        C0453l m3497n = C0453l.m3497n(str);
        if (m3497n != null) {
            return m3497n;
        }
        return null;
    }

    /* renamed from: a */
    private static String m4371a(String str, float f) {
        return m4370a(str, f, VariableScope.nullOrMissingString);
    }

    /* renamed from: a */
    private static String m4370a(String str, float f, String str2) {
        String str3 = VariableScope.nullOrMissingString + f;
        if (f % 1.0f == 0.0f) {
            str3 = VariableScope.nullOrMissingString + ((int) f);
        }
        return m4369a(str, str3, str2);
    }

    /* renamed from: a */
    private static String m4369a(String str, String str2, String str3) {
        return str + ": " + str2 + str3 + "\n";
    }

    /* renamed from: a */
    private static int m4373a(AbstractC0623y abstractC0623y) {
        AbstractC0224s a;
        C0208c cl = abstractC0623y.mo3269cl();
        if (cl != null && (a = abstractC0623y.m4507a(cl)) != null) {
            return a.mo3034c();
        }
        return 0;
    }

    /* renamed from: r */
    public static void m4363r() {
        new File("output_all_unit_images/").mkdirs();
        for (int i = 0; i < 50; i++) {
            LoggerMaybe.m1038a("running outputUnitImages()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        Iterator it = f1739ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it.next();
            AbstractC0244am m4505a = AbstractC0244am.m4505a(interfaceC0303as);
            if ((m4505a instanceof AbstractC0623y) && !interfaceC0303as.mo4223i().startsWith("bug") && C0453l.m3522c(interfaceC0303as) == null && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2985aE)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) m4505a;
                boolean z = false;
                for (String str : strArr) {
                    if (str.equals(interfaceC0303as.mo4223i())) {
                        z = true;
                    }
                }
                if (!z) {
                    String str2 = "output_all_unit_images/" + interfaceC0303as.mo4223i().replace("/", "_").replace("\\", "_") + ".png";
                    LoggerMaybe m1079A = LoggerMaybe.m1079A();
                    C0934e mo170b = m1079A.f6113bO.mo170b(100, 100, true);
                    InterfaceC1027y mo5760b = m1079A.f6113bO.mo5760b(mo170b);
                    InterfaceC1027y interfaceC1027y = m1079A.f6113bO;
                    m1079A.f6113bO = mo5760b;
                    m4374a(interfaceC0303as, mo170b.f6404r, mo170b.f6405s, 0.0f, 0.0f, AbstractC0197n.m4638k(0), 20.0f, 100, false, false, 1, true, null);
                    m1079A.f6113bO = interfaceC1027y;
                    mo5760b.mo136p();
                    m1079A.f6113bO.mo195a(mo170b, new File(str2));
                }
            }
        }
    }

    /* renamed from: s */
    public static void m4362s() {
        int m4373a;
        int m4373a2;
        for (int i = 0; i < 50; i++) {
            LoggerMaybe.m1038a("running printForHelp()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        String str = VariableScope.nullOrMissingString;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f1739ae);
        Collections.sort(arrayList, new C029349());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it.next();
            AbstractC0244am m4505a = AbstractC0244am.m4505a(interfaceC0303as);
            if ((m4505a instanceof AbstractC0623y) && !interfaceC0303as.mo4223i().startsWith("bug") && C0453l.m3522c(interfaceC0303as) == null && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2985aE)) {
                if (interfaceC0303as != f1793Y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) m4505a;
                    boolean z = false;
                    for (String str2 : strArr) {
                        if (str2.equals(interfaceC0303as.mo4223i())) {
                            z = true;
                        }
                    }
                    if (!z) {
                        String str3 = ((((((str + "\n") + "<div class=\"unit\">\n") + "<img src=\"unit:" + interfaceC0303as.mo4223i() + "\" />\n") + "<h4>" + interfaceC0303as.mo4227e() + "</h4>\n") + "<p>" + interfaceC0303as.mo4226f().replace("\n", "<br/>") + "</p>\n") + "<pre>") + m4369a("Price", "$" + interfaceC0303as.mo4230c(), VariableScope.nullOrMissingString);
                        if (m4373a(abstractC0623y) > 0) {
                            str3 = str3 + m4369a("T2 Upgrade Price", "$" + m4373a, VariableScope.nullOrMissingString);
                            AbstractC0623y abstractC0623y2 = (AbstractC0623y) interfaceC0303as.mo4234a();
                            abstractC0623y2.mo3185a(2);
                            if (abstractC0623y2.mo3281V() == 2 && (m4373a2 = m4373a(abstractC0623y2)) > 0) {
                                str3 = str3 + m4369a("T3 Upgrade Price", "$" + m4373a2, VariableScope.nullOrMissingString);
                            }
                        }
                        String str4 = (((str3 + m4371a("Hp", abstractC0623y.f1633ct)) + m4371a("Speed", abstractC0623y.mo2985z())) + m4371a("Turn speed", abstractC0623y.mo3017A())) + m4371a("Mass", abstractC0623y.mo3088bN());
                        if (abstractC0623y.mo2988l()) {
                            str4 = (str4 + m4371a("Shoot Delay", abstractC0623y.mo3002b(0))) + m4371a("Attack Range", abstractC0623y.mo2987m());
                            float f = 0.0f;
                            float f2 = 0.0f;
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            int mo3097bl = abstractC0623y.mo3097bl();
                            for (int i2 = 0; i2 < mo3097bl; i2++) {
                                int i3 = C0188f.f1083a.f6894a;
                                abstractC0623y.mo3003a((AbstractC0244am) abstractC0623y, i2);
                                if (i3 != C0188f.f1083a.f6894a) {
                                    C0188f c0188f = (C0188f) C0188f.f1083a.get(C0188f.f1083a.f6894a - 1);
                                    if (c0188f.f1021U > f) {
                                        f = c0188f.f1021U;
                                    }
                                    if (c0188f.f1025Y > f2) {
                                        f2 = c0188f.f1025Y;
                                    }
                                    f3 += c0188f.f1021U;
                                    f4 += c0188f.f1025Y;
                                }
                            }
                            if (f3 != 0.0f) {
                                String str5 = VariableScope.nullOrMissingString;
                                if (f3 != f) {
                                    str5 = " (total:" + f3 + ")";
                                }
                                str4 = str4 + m4370a("Direct Damage", f, str5);
                            }
                            if (f4 != 0.0f) {
                                String str6 = VariableScope.nullOrMissingString;
                                if (f4 != f2) {
                                    str6 = " (total:" + f4 + ")";
                                }
                                str4 = str4 + m4370a("Area Damage", f2, str6);
                            }
                        }
                        str = (str4 + "</pre>") + "</div>\n";
                    }
                }
            }
        }
        LoggerMaybe.LogDebug2(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.ar$49 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$49.class */
    public final class C029349 implements Comparator {
        C029349() {
        }

        /* renamed from: a */
        public int mo4236a(InterfaceC0303as interfaceC0303as, InterfaceC0303as interfaceC0303as2) {
            return interfaceC0303as.mo4214u().mo3894a(interfaceC0303as2.mo4214u());
        }
    }

    /* renamed from: t */
    public static void m4361t() {
        AbstractC0249ar[] values;
        for (AbstractC0249ar abstractC0249ar : values()) {
            abstractC0249ar.name();
            abstractC0249ar.mo4227e();
            abstractC0249ar.mo4226f();
        }
    }

    /* renamed from: a */
    public static boolean m4376a(InterfaceC0303as interfaceC0303as, float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n) {
        LoggerMaybe.m1079A();
        AbstractC0244am m4505a = AbstractC0244am.m4505a(interfaceC0303as);
        if (m4505a == null) {
            LoggerMaybe.LogDebug2("isValidHere: Failed to get unit from type:" + interfaceC0303as);
            return false;
        }
        m4505a.m4492b(abstractC0197n);
        m4505a.f6959en = f4;
        m4505a.f6957el = f;
        m4505a.f6958em = f2;
        if (!m4505a.m4485bI()) {
            m4505a.f1618ce = f3;
            if (m4505a instanceof AbstractC0623y) {
                ((AbstractC0623y) m4505a).m2773j(f3);
            }
        }
        boolean z = true;
        if (m4505a instanceof AbstractC0623y) {
            z = ((AbstractC0623y) m4505a).m2800c(abstractC0197n);
        }
        m4505a.f6959en = 0.0f;
        m4505a.f1618ce = 0.0f;
        return z;
    }

    /* renamed from: a */
    public static void m4375a(InterfaceC0303as interfaceC0303as, float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n, float f5, float f6, boolean z, boolean z2, int i, AbstractC0244am abstractC0244am) {
        m4374a(interfaceC0303as, f, f2, f3, f4, abstractC0197n, f5, f6, z, z2, i, true, abstractC0244am);
    }

    /* renamed from: a */
    public static void m4374a(InterfaceC0303as interfaceC0303as, float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n, float f5, float f6, boolean z, boolean z2, int i, boolean z3, AbstractC0244am abstractC0244am) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        AbstractC0244am m4471c = AbstractC0244am.m4471c(interfaceC0303as);
        boolean m4485bI = m4471c.m4485bI();
        m4471c.m4492b(abstractC0197n);
        if (m4471c instanceof AbstractC0623y) {
            ((AbstractC0623y) m4471c).mo3185a(i);
        }
        m4471c.f6959en = f4;
        if (m4471c.mo2991h() == EnumC0246ao.f1708f || m4471c.mo2991h() == EnumC0246ao.f1709g || m4471c.mo2991h() == EnumC0246ao.f1710h) {
            m4471c.f6959en += 4.0f;
        }
        if (m4471c.mo2991h() == EnumC0246ao.f1706d) {
            m4471c.f6959en += 10.0f;
        }
        if (!m4485bI) {
            m4471c.f1618ce = f3;
            if (m4471c instanceof AbstractC0623y) {
                ((AbstractC0623y) m4471c).m2773j(f3);
            }
        } else {
            m4471c.f1618ce = -90.0f;
        }
        boolean z4 = true;
        boolean z5 = m4471c.f1627cn;
        m4471c.f1627cn = true;
        m4471c.f1630cq = false;
        m4471c.f1631cr = false;
        if (!z3) {
            m4471c.f1631cr = true;
        }
        m4471c.f1626cm = false;
        m4471c.f1628co = false;
        m4471c.f1629cp = false;
        if (z || z2) {
            m4471c.f1628co = z2;
            m4471c.f1629cp = z;
            z4 = false;
        } else {
            m4471c.f1626cm = true;
        }
        if (!z4) {
            m4471c.f6957el = f;
            m4471c.f6958em = f2;
        } else {
            m4471c.f6957el = m1079A.f6144cv + f;
            m4471c.f6958em = m1079A.f6145cw + f2;
        }
        float f7 = m4471c.f1621ch * 2.0f * 0.8f;
        if (m4471c instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m4471c;
            if (abstractC0623y.f3885L != null) {
                float cC = abstractC0623y.f4229eq * abstractC0623y.m4466cC();
                if (cC > f7) {
                    f7 = cC;
                }
            }
        }
        float f8 = 1.0f;
        if (f7 < f5) {
            f8 = f5 / f7;
        }
        if (f7 > f6) {
            f8 = f6 / f7;
        }
        m1079A.f6113bO.mo141k();
        if (z4) {
        }
        if (f8 != 1.0f) {
            m1079A.f6113bO.mo230a(f8, f8, f, f2);
        }
        if (f8 < 1.0f) {
            f1741ag = true;
        } else {
            f1741ag = false;
        }
        if (abstractC0244am != null) {
            C0439f c0439f = m4471c.f1697dF;
            m4471c.f1697dF = abstractC0244am.f1697dF;
            int i2 = m4471c.f1642cC;
            m4471c.f1642cC = abstractC0244am.f1642cC;
            float f9 = m4471c.f1632cs;
            m4471c.f1632cs = abstractC0244am.f1632cs;
            float f10 = m4471c.f1639cz;
            m4471c.f1639cz = abstractC0244am.f1639cz;
            VariableScope variableScope = m4471c.f1582bv;
            m4471c.f1582bv = abstractC0244am.f1582bv;
            m4471c.m4428d(0.0f);
            m4471c.mo3001c(0.0f);
            m4471c.mo3005a(0.0f, false);
            m4471c.f1697dF = c0439f;
            m4471c.f1642cC = i2;
            m4471c.f1632cs = f9;
            m4471c.f1639cz = f10;
            m4471c.f1582bv = variableScope;
        } else {
            m4471c.m4428d(0.0f);
            m4471c.mo3001c(0.0f);
            m4471c.mo3005a(0.0f, false);
        }
        m1079A.f6113bO.mo140l();
        m4471c.f6959en = 0.0f;
        if (!m4485bI) {
            m4471c.f1618ce = 0.0f;
        } else {
            m4471c.f1618ce = -90.0f;
        }
        if (m4471c instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) m4471c;
            abstractC0623y2.m2773j(0.0f);
            abstractC0623y2.mo3185a(1);
        }
        m4471c.f1628co = false;
        m4471c.f1629cp = false;
        m4471c.f1627cn = z5;
        m4471c.f1626cm = false;
    }

    /* renamed from: b */
    public int mo4231b(int i) {
        int mo4230c = mo4230c();
        if (i >= 2) {
            mo4230c += m4364c(2);
        }
        if (i >= 3) {
            mo4230c += m4364c(2);
        }
        return mo4230c;
    }

    /* renamed from: c */
    public int m4364c(int i) {
        return 0;
    }

    /* renamed from: u */
    public C0424b mo4214u() {
        int mo4230c = mo4230c();
        if (mo4230c == 0) {
            return C0424b.f2710a;
        }
        if (this.f1742ah == null || this.f1742ah.m3902a() != mo4230c) {
            this.f1742ah = C0424b.m3901a(mo4230c);
        }
        return this.f1742ah;
    }

    /* renamed from: d */
    public C0424b mo4228d(int i) {
        return C0424b.m3901a(mo4231b(i));
    }

    /* renamed from: v */
    public String mo4213v() {
        return name();
    }

    /* renamed from: w */
    public boolean mo4212w() {
        return false;
    }

    /* renamed from: x */
    public C0449h mo4211x() {
        return null;
    }

    /* renamed from: y */
    public boolean mo4210y() {
        return true;
    }

    /* renamed from: z */
    public C0934e mo4209z() {
        return null;
    }

    /* renamed from: a */
    public int mo4232a(AbstractC0244am abstractC0244am) {
        return 0;
    }

    /* renamed from: A */
    public boolean m4377A() {
        return false;
    }

    /* renamed from: B */
    public C0424b mo4237B() {
        return null;
    }
}
