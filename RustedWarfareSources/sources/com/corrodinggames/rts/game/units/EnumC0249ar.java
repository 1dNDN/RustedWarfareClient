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
import com.corrodinggames.rts.gameFramework.Core;
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
public abstract class EnumC0249ar implements InterfaceC0303as {

    /* renamed from: aa */
    C0231z f1787aa;

    /* renamed from: ab */
    int f1788ab;

    /* renamed from: ac */
    String f1789ac;

    /* renamed from: ad */
    String f1790ad;

    /* renamed from: ae */
    public static ArrayList f1791ae;

    /* renamed from: af */
    C0304at[] f1792af;

    /* renamed from: ag */
    public static boolean f1793ag;

    /* renamed from: ah */
    C0424b f1794ah;

    /* renamed from: a */
    public static final EnumC0249ar f1735a = new C02501("extractor", 0);

    /* renamed from: b */
    public static final EnumC0249ar f1736b = new C025312("landFactory", 1);

    /* renamed from: c */
    public static final EnumC0249ar f1737c = new C026523("airFactory", 2);

    /* renamed from: d */
    public static final EnumC0249ar f1738d = new C027734("seaFactory", 3);

    /* renamed from: e */
    public static final EnumC0249ar f1739e = new C028945("commandCenter", 4);

    /* renamed from: f */
    public static final EnumC0249ar f1740f = new C029550("turret", 5);

    /* renamed from: g */
    public static final EnumC0249ar f1741g = new C029651("antiAirTurret", 6);

    /* renamed from: h */
    public static final EnumC0249ar f1742h = new C029752("builder", 7);

    /* renamed from: i */
    public static final EnumC0249ar f1743i = new C029853("tank", 8);

    /* renamed from: j */
    public static final EnumC0249ar f1744j = new C02612("hoverTank", 9);

    /* renamed from: k */
    public static final EnumC0249ar f1745k = new C02723("artillery", 10);

    /* renamed from: l */
    public static final EnumC0249ar f1746l = new C02834("helicopter", 11);

    /* renamed from: m */
    public static final EnumC0249ar f1747m = new C02945("airShip", 12);

    /* renamed from: n */
    public static final EnumC0249ar f1748n = new C02996("gunShip", 13);

    /* renamed from: o */
    public static final EnumC0249ar f1749o = new C03007("missileShip", 14);

    /* renamed from: p */
    public static final EnumC0249ar f1750p = new C03018("gunBoat", 15);

    /* renamed from: q */
    public static final EnumC0249ar f1751q = new C03029("megaTank", 16);

    /* renamed from: r */
    public static final EnumC0249ar f1752r = new C025110("laserTank", 17);

    /* renamed from: s */
    public static final EnumC0249ar f1753s = new C025211("hovercraft", 18);

    /* renamed from: t */
    public static final EnumC0249ar f1754t = new C025413("ladybug", 19);

    /* renamed from: u */
    public static final EnumC0249ar f1755u = new C025514("battleShip", 20);

    /* renamed from: v */
    public static final EnumC0249ar f1756v = new C025615("tankDestroyer", 21);

    /* renamed from: w */
    public static final EnumC0249ar f1757w = new C025716("heavyTank", 22);

    /* renamed from: x */
    public static final EnumC0249ar f1758x = new C025817("heavyHoverTank", 23);

    /* renamed from: y */
    public static final EnumC0249ar f1759y = new C025918("laserDefence", 24);

    /* renamed from: z */
    public static final EnumC0249ar f1760z = new C026019("dropship", 25);

    /* renamed from: A */
    public static final EnumC0249ar f1761A = new C026220("tree", 26);

    /* renamed from: B */
    public static final EnumC0249ar f1762B = new C026321("repairbay", 27);

    /* renamed from: C */
    public static final EnumC0249ar f1763C = new C026422("NukeLaucher", 28);

    /* renamed from: D */
    public static final EnumC0249ar f1764D = new C026624("AntiNukeLaucher", 29);

    /* renamed from: E */
    public static final EnumC0249ar f1765E = new C026725("mammothTank", 30);

    /* renamed from: F */
    public static final EnumC0249ar f1766F = new C026826("experimentalTank", 31);

    /* renamed from: G */
    public static final EnumC0249ar f1767G = new C026927("experimentalLandFactory", 32);

    /* renamed from: H */
    public static final EnumC0249ar f1768H = new C027028("crystalResource", 33);

    /* renamed from: I */
    public static final EnumC0249ar f1769I = new C027129("wall_v", 34);

    /* renamed from: J */
    public static final EnumC0249ar f1770J = new C027330("fabricator", 35);

    /* renamed from: K */
    public static final EnumC0249ar f1771K = new C027431("attackSubmarine", 36);

    /* renamed from: L */
    public static final EnumC0249ar f1772L = new C027532("builderShip", 37);

    /* renamed from: M */
    public static final EnumC0249ar f1773M = new C027633("amphibiousJet", 38);

    /* renamed from: N */
    public static final EnumC0249ar f1774N = new C027835("supplyDepot", 39);

    /* renamed from: O */
    public static final EnumC0249ar f1775O = new C027936("experimentalHoverTank", 40);

    /* renamed from: P */
    public static final EnumC0249ar f1776P = new C028037("turret_artillery", 41);

    /* renamed from: Q */
    public static final EnumC0249ar f1777Q = new C028138("turret_flamethrower", 42);

    /* renamed from: R */
    public static final EnumC0249ar f1778R = new C028239("fogRevealer", 43);

    /* renamed from: S */
    public static final EnumC0249ar f1779S = new C028440("spreadingFire", 44);

    /* renamed from: T */
    public static final EnumC0249ar f1780T = new C028541("antiAirTurretT2", 45);

    /* renamed from: U */
    public static final EnumC0249ar f1781U = new C028642("turretT2", 46);

    /* renamed from: V */
    public static final EnumC0249ar f1782V = new C028743("turretT3", 47);

    /* renamed from: W */
    public static final EnumC0249ar f1783W = new C028844("damagingBorder", 48);

    /* renamed from: X */
    public static final EnumC0249ar f1784X = new C029046("zoneMarker", 49);

    /* renamed from: Y */
    public static final EnumC0249ar f1785Y = new C029147("editorOrBuilder", 50);

    /* renamed from: Z */
    public static final EnumC0249ar f1786Z = new C029248("dummyNonUnitWithTeam", 51);

    /* renamed from: ai */
    private static final /* synthetic */ EnumC0249ar[] f1795ai = {f1735a, f1736b, f1737c, f1738d, f1739e, f1740f, f1741g, f1742h, f1743i, f1744j, f1745k, f1746l, f1747m, f1748n, f1749o, f1750p, f1751q, f1752r, f1753s, f1754t, f1755u, f1756v, f1757w, f1758x, f1759y, f1760z, f1761A, f1762B, f1763C, f1764D, f1765E, f1766F, f1767G, f1768H, f1769I, f1770J, f1771K, f1772L, f1773M, f1774N, f1775O, f1776P, f1777Q, f1778R, f1779S, f1780T, f1781U, f1782V, f1783W, f1784X, f1785Y, f1786Z};

    /* renamed from: a */
    public abstract AbstractC0244am m4617a(boolean z);

    /* renamed from: b */
    public abstract void m4616b();

    /* renamed from: c */
    public abstract int mo4481c();

    public static EnumC0249ar[] values() {
        return (EnumC0249ar[]) f1795ai.clone();
    }

    public static EnumC0249ar valueOf(String str) {
        return (EnumC0249ar) Enum.valueOf(EnumC0249ar.class, str);
    }

    private EnumC0249ar(String str, int i) {
        this.f1787aa = new C0231z(this);
        this.f1788ab = -1;
    }

    /* synthetic */ EnumC0249ar(String str, int i, C02501 c02501) {
        this(str, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.ar$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$1.class */
    public enum C02501 extends EnumC0249ar {
        C02501(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4611a(boolean z) {
            return new C0492g(z);
        }

        /* renamed from: b */
        public void m4610b() {
            C0492g.m3497c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 700;
        }

        /* renamed from: c */
        public int m4609c(int i) {
            if (i == 2) {
                return 1200;
            }
            if (i == 3) {
                return 2500;
            }
            return 0;
        }

        /* renamed from: p */
        public boolean mo4467p() {
            return true;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }

        /* renamed from: a */
        public int mo4483a(AbstractC0244am abstractC0244am) {
            if (abstractC0244am.m4725cI()) {
                return 110;
            }
            return 0;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$12.class */
    enum C025312 extends EnumC0249ar {
        C025312(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4603a(boolean z) {
            return new C0502m(z);
        }

        /* renamed from: b */
        public void m4602b() {
            C0502m.m3421b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 700;
        }

        /* renamed from: c */
        public int m4601c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }

        /* renamed from: a */
        public void m4604a(ArrayList arrayList, int i) {
            C0502m.m3422a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$23 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$23.class */
    enum C026523 extends EnumC0249ar {
        C026523(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4576a(boolean z) {
            return new C0470a(z);
        }

        /* renamed from: b */
        public void m4575b() {
            C0470a.m3628b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1000;
        }

        /* renamed from: c */
        public int m4574c(int i) {
            if (i == 2) {
                return 1500;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }

        /* renamed from: a */
        public void m4577a(ArrayList arrayList, int i) {
            C0470a.m3629a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$34 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$34.class */
    enum C027734 extends EnumC0249ar {
        C027734(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4547a(boolean z) {
            return new C0512t(z);
        }

        /* renamed from: b */
        public void m4546b() {
            C0512t.m3374b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1000;
        }

        /* renamed from: c */
        public int m4545c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 7.0E-4f;
        }

        /* renamed from: a */
        public void m4548a(ArrayList arrayList, int i) {
            C0512t.m3375a(arrayList, i);
        }

        /* renamed from: a */
        public int mo4483a(AbstractC0244am abstractC0244am) {
            return 110;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$45 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$45.class */
    enum C028945 extends EnumC0249ar {
        C028945(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4520a(boolean z) {
            return new C0489e(z);
        }

        /* renamed from: b */
        public void m4519b() {
            C0489e.m3522b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 3000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 5.0E-4f;
        }

        /* renamed from: a */
        public void m4521a(ArrayList arrayList, int i) {
            C0489e.m3523a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$50 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$50.class */
    enum C029550 extends EnumC0249ar {
        C029550(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4505a(boolean z) {
            return new C0473b(z);
        }

        /* renamed from: b */
        public void m4504b() {
            C0473b.m3586dy();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 500;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$51 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$51.class */
    enum C029651 extends EnumC0249ar {
        C029651(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4503a(boolean z) {
            return new C0471a(z);
        }

        /* renamed from: b */
        public void m4502b() {
            C0471a.m3622b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 600;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 8.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$52 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$52.class */
    enum C029752 extends EnumC0249ar {
        C029752(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4500a(boolean z) {
            return new C0519b(z);
        }

        /* renamed from: b */
        public void m4499b() {
            C0519b.m3344K();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 500;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.002f;
        }

        /* renamed from: l */
        public boolean mo4471l() {
            return true;
        }

        /* renamed from: m */
        public boolean mo4470m() {
            return true;
        }

        /* renamed from: n */
        public boolean mo4469n() {
            return true;
        }

        /* renamed from: a */
        public void m4501a(ArrayList arrayList, int i) {
            C0519b.m3342a(arrayList, i);
            C0555h.m3208a((ArrayList) null, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$53 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$53.class */
    enum C029853 extends EnumC0249ar {
        C029853(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4498a(boolean z) {
            return new C0533n(z);
        }

        /* renamed from: b */
        public void m4497b() {
            C0533n.m3280c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 350;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.002f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$2.class */
    enum C02612 extends EnumC0249ar {
        C02612(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4585a(boolean z) {
            return new C0524g(z);
        }

        /* renamed from: b */
        public void m4584b() {
            C0524g.m3318c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 450;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.002f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$3.class */
    enum C02723 extends EnumC0249ar {
        C02723(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4560a(boolean z) {
            return new C0518a(z);
        }

        /* renamed from: b */
        public void m4559b() {
            C0518a.m3345c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 900;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.0014f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$4.class */
    enum C02834 extends EnumC0249ar {
        C02834(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4534a(boolean z) {
            return new C0317f(z);
        }

        /* renamed from: b */
        public void m4533b() {
            C0317f.m4388c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 650;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.0012f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$5.class */
    enum C02945 extends EnumC0249ar {
        C02945(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4507a(boolean z) {
            return new C0308a(z);
        }

        /* renamed from: b */
        public void m4506b() {
            C0308a.m4427c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 600;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.002f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$6.class */
    enum C02996 extends EnumC0249ar {
        C02996(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4496a(boolean z) {
            return new C0316e(z);
        }

        /* renamed from: b */
        public void m4495b() {
            C0316e.m4391c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }

        /* renamed from: g */
        public int mo4476g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$7.class */
    enum C03007 extends EnumC0249ar {
        C03007(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4494a(boolean z) {
            return new C0586d(z);
        }

        /* renamed from: b */
        public void m4493b() {
            C0586d.m3152c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 900;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$8.class */
    enum C03018 extends EnumC0249ar {
        C03018(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4492a(boolean z) {
            return new C0585c(z);
        }

        /* renamed from: b */
        public void m4491b() {
            C0585c.m3157c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 300;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.005f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$9.class */
    enum C03029 extends EnumC0249ar {
        C03029(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4490a(boolean z) {
            return new C0532m(z);
        }

        /* renamed from: b */
        public void m4489b() {
            C0532m.m3283c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.0015f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$10.class */
    enum C025110 extends EnumC0249ar {
        C025110(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4608a(boolean z) {
            return new C0530k(z);
        }

        /* renamed from: b */
        public void m4607b() {
            C0530k.m3287c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1300;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.0013f;
        }

        /* renamed from: g */
        public int mo4476g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$11.class */
    enum C025211 extends EnumC0249ar {
        C025211(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4606a(boolean z) {
            return new C0526i(z);
        }

        /* renamed from: b */
        public void m4605b() {
            C0526i.m3300c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 600;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.003f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$13.class */
    enum C025413 extends EnumC0249ar {
        C025413(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4600a(boolean z) {
            return new C0319a(z);
        }

        /* renamed from: b */
        public void m4599b() {
            C0319a.m4384c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 400;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.004f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$14 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$14.class */
    enum C025514 extends EnumC0249ar {
        C025514(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4598a(boolean z) {
            return new C0583a(z);
        }

        /* renamed from: b */
        public void m4597b() {
            C0583a.m3177c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1500;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$15 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$15.class */
    enum C025615 extends EnumC0249ar {
        C025615(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4596a(boolean z) {
            return new C0534o(z);
        }

        /* renamed from: b */
        public void m4595b() {
            C0534o.m3277c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.003f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$16 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$16.class */
    enum C025716 extends EnumC0249ar {
        C025716(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4594a(boolean z) {
            return new C0523f(z);
        }

        /* renamed from: b */
        public void m4593b() {
            C0523f.m3323c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.0011f;
        }

        /* renamed from: g */
        public int mo4476g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$17 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$17.class */
    enum C025817 extends EnumC0249ar {
        C025817(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4592a(boolean z) {
            return new C0522e(z);
        }

        /* renamed from: b */
        public void m4591b() {
            C0522e.m3325c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }

        /* renamed from: g */
        public int mo4476g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$18 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$18.class */
    enum C025918 extends EnumC0249ar {
        C025918(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4590a(boolean z) {
            return new C0505p(z);
        }

        /* renamed from: b */
        public void m4589b() {
            C0505p.m3409b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1200;
        }

        /* renamed from: c */
        public int m4588c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$19 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$19.class */
    enum C026019 extends EnumC0249ar {
        C026019(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4587a(boolean z) {
            return new C0313d(z);
        }

        /* renamed from: b */
        public void m4586b() {
            C0313d.m4402c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }

        /* renamed from: g */
        public int mo4476g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$20 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$20.class */
    enum C026220 extends EnumC0249ar {
        C026220(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4583a(boolean z) {
            return new C0243al(z);
        }

        /* renamed from: b */
        public void m4582b() {
            C0243al.m4808b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 0;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.0025f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$21 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$21.class */
    enum C026321 extends EnumC0249ar {
        C026321(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4581a(boolean z) {
            return new C0510r(z);
        }

        /* renamed from: b */
        public void m4580b() {
            C0510r.m3380dr();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1500;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$22 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$22.class */
    enum C026422 extends EnumC0249ar {
        C026422(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4579a(boolean z) {
            return new C0507q(z);
        }

        /* renamed from: b */
        public void m4578b() {
            C0507q.m3393b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 45000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 1.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$24 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$24.class */
    enum C026624 extends EnumC0249ar {
        C026624(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4573a(boolean z) {
            return new C0485c(z);
        }

        /* renamed from: b */
        public void m4572b() {
            C0485c.m3552b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 15000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 7.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$25 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$25.class */
    enum C026725 extends EnumC0249ar {
        C026725(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4571a(boolean z) {
            return new C0531l(z);
        }

        /* renamed from: b */
        public void m4570b() {
            C0531l.m3285c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 3900;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 9.0E-4f;
        }

        /* renamed from: g */
        public int mo4476g() {
            return 3;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$26 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$26.class */
    enum C026826 extends EnumC0249ar {
        C026826(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4569a(boolean z) {
            return new C0521d(z);
        }

        /* renamed from: b */
        public void m4568b() {
            C0521d.m3329c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 14000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 2.0E-4f;
        }

        /* renamed from: g */
        public int mo4476g() {
            return 3;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$27 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$27.class */
    enum C026927 extends EnumC0249ar {
        C026927(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4566a(boolean z) {
            return new C0490f(z);
        }

        /* renamed from: b */
        public void m4565b() {
            C0490f.m3509b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 11000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 3.5E-4f;
        }

        /* renamed from: a */
        public void m4567a(ArrayList arrayList, int i) {
            C0490f.m3510a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$28 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$28.class */
    enum C027028 extends EnumC0249ar {
        C027028(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4564a(boolean z) {
            return new C0517e(z);
        }

        /* renamed from: b */
        public void m4563b() {
            C0517e.m3354c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 5000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$29 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$29.class */
    enum C027129 extends EnumC0249ar {
        C027129(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4562a(boolean z) {
            return new C0516w(z);
        }

        /* renamed from: b */
        public void m4561b() {
            C0516w.m3358b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 100;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.003f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$30 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$30.class */
    enum C027330 extends EnumC0249ar {
        C027330(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4558a(boolean z) {
            return new C0495h(z);
        }

        /* renamed from: b */
        public void m4557b() {
            C0495h.m3485c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1500;
        }

        /* renamed from: c */
        public int m4556c(int i) {
            if (i == 2) {
                return 3000;
            }
            if (i == 3) {
                return 5000;
            }
            return 0;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$31 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$31.class */
    enum C027431 extends EnumC0249ar {
        C027431(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4555a(boolean z) {
            return new C0587e(z);
        }

        /* renamed from: b */
        public void m4554b() {
            C0587e.m3141b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 800;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$32 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$32.class */
    enum C027532 extends EnumC0249ar {
        C027532(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4552a(boolean z) {
            return new C0584b(z);
        }

        /* renamed from: b */
        public void m4551b() {
            C0584b.m3175K();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 500;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }

        /* renamed from: l */
        public boolean mo4471l() {
            return true;
        }

        /* renamed from: m */
        public boolean mo4470m() {
            return false;
        }

        /* renamed from: a */
        public void m4553a(ArrayList arrayList, int i) {
            C0584b.m3171a(arrayList, i);
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$33 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$33.class */
    enum C027633 extends EnumC0249ar {
        C027633(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4550a(boolean z) {
            return new C0310c(z);
        }

        /* renamed from: b */
        public void m4549b() {
            C0310c.m4415f();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 2000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }

        /* renamed from: g */
        public int mo4476g() {
            return 2;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$35 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$35.class */
    enum C027835 extends EnumC0249ar {
        C027835(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4544a(boolean z) {
            return new C0514v(z);
        }

        /* renamed from: b */
        public void m4543b() {
            C0514v.m3362c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.001f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$36 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$36.class */
    enum C027936 extends EnumC0249ar {
        C027936(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return false;
        }

        /* renamed from: a */
        public AbstractC0244am m4542a(boolean z) {
            return new C0520c(z);
        }

        /* renamed from: b */
        public void m4541b() {
            C0520c.m3334c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 21000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 2.0E-4f;
        }

        /* renamed from: g */
        public int mo4476g() {
            return 3;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$37 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$37.class */
    enum C028037 extends EnumC0249ar {
        C028037(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4540a(boolean z) {
            C0473b c0473b = new C0473b(z);
            c0473b.m4771a_("artillery");
            return c0473b;
        }

        /* renamed from: b */
        public void m4539b() {
        }

        /* renamed from: c */
        public int mo4481c() {
            return EnumC0249ar.f1740f.mo4481c() + C0473b.f3404dM.mo3082c();
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$38 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$38.class */
    enum C028138 extends EnumC0249ar {
        C028138(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4538a(boolean z) {
            C0473b c0473b = new C0473b(z);
            c0473b.m4771a_("flamethrower");
            return c0473b;
        }

        /* renamed from: b */
        public void m4537b() {
        }

        /* renamed from: c */
        public int mo4481c() {
            return EnumC0249ar.f1740f.mo4481c() + C0473b.f3405dN.mo3082c();
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$39 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$39.class */
    enum C028239 extends EnumC0249ar {
        C028239(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4536a(boolean z) {
            return new C0619u(z);
        }

        /* renamed from: b */
        public void m4535b() {
            C0619u.m3067c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$40 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$40.class */
    enum C028440 extends EnumC0249ar {
        C028440(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4532a(boolean z) {
            return new C0240ai(z);
        }

        /* renamed from: b */
        public void m4531b() {
            C0240ai.m4827b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$41 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$41.class */
    enum C028541 extends EnumC0249ar {
        C028541(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4530a(boolean z) {
            C0471a c0471a = new C0471a(z);
            c0471a.mo3356a(2);
            return c0471a;
        }

        /* renamed from: b */
        public void m4529b() {
        }

        /* renamed from: c */
        public int mo4481c() {
            return EnumC0249ar.f1740f.mo4481c() + C0471a.f3374e.mo3082c();
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$42 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$42.class */
    enum C028642 extends EnumC0249ar {
        C028642(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4528a(boolean z) {
            C0473b c0473b = new C0473b(z);
            c0473b.m4771a_("gunT2");
            return c0473b;
        }

        /* renamed from: b */
        public void m4527b() {
        }

        /* renamed from: c */
        public int mo4481c() {
            return EnumC0249ar.f1740f.mo4481c() + C0473b.f3402dK.mo3082c();
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$43 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$43.class */
    enum C028743 extends EnumC0249ar {
        C028743(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: j */
        public boolean mo4473j() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4526a(boolean z) {
            C0473b c0473b = new C0473b(z);
            c0473b.m4771a_("gunT3");
            return c0473b;
        }

        /* renamed from: b */
        public void m4525b() {
        }

        /* renamed from: c */
        public int mo4481c() {
            return EnumC0249ar.f1740f.mo4481c() + C0473b.f3402dK.mo3082c() + C0473b.f3403dL.mo3082c();
        }

        /* renamed from: D */
        public float mo4486D() {
            return 3.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$44 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$44.class */
    enum C028844 extends EnumC0249ar {
        C028844(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: A */
        public boolean m4524A() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4523a(boolean z) {
            return new C0535f(z);
        }

        /* renamed from: b */
        public void m4522b() {
            C0535f.m3269c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$46 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$46.class */
    enum C029046 extends EnumC0249ar {
        C029046(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: A */
        public boolean m4518A() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4517a(boolean z) {
            C0535f c0535f = new C0535f(z);
            c0535f.f3702q = true;
            return c0535f;
        }

        /* renamed from: b */
        public void m4516b() {
            C0535f.m3269c();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 1000;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 6.0E-4f;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$47 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$47.class */
    enum C029147 extends EnumC0249ar {
        C029147(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: A */
        public boolean m4515A() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4513a(boolean z) {
            return new C0555h(z);
        }

        /* renamed from: b */
        public void m4512b() {
            C0555h.m3217K();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 500;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 0.002f;
        }

        /* renamed from: l */
        public boolean mo4471l() {
            return true;
        }

        /* renamed from: m */
        public boolean mo4470m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo4469n() {
            return false;
        }

        /* renamed from: a */
        public void m4514a(ArrayList arrayList, int i) {
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.ar$48 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$48.class */
    enum C029248 extends EnumC0249ar {
        C029248(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: e */
        public String mo4478e() {
            return mo4474i();
        }

        /* renamed from: i */
        public String mo4474i() {
            return "marker";
        }

        /* renamed from: A */
        public boolean m4511A() {
            return true;
        }

        /* renamed from: C */
        public boolean mo4487C() {
            return true;
        }

        /* renamed from: a */
        public AbstractC0244am m4510a(boolean z) {
            return new C0618t(z);
        }

        /* renamed from: b */
        public void m4509b() {
            C0618t.m3070b();
        }

        /* renamed from: c */
        public int mo4481c() {
            return 9999;
        }

        /* renamed from: D */
        public float mo4486D() {
            return 1.0f;
        }
    }

    /* renamed from: a */
    public AbstractC0244am mo4485a() {
        return m4617a(false);
    }

    /* renamed from: d */
    public C0231z mo4480d() {
        return this.f1787aa;
    }

    /* renamed from: e */
    public String mo4478e() {
        if (this.f1788ab != C0820a.f5400c || this.f1789ac == null) {
            this.f1788ab = C0820a.f5400c;
            String str = "units." + name() + ".name";
            this.f1789ac = C0820a.m1734a(str, null, new Object[0]);
            if (this.f1789ac == null) {
                if (Core.m1087A().m1013ar() && !m4628A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.f1789ac = name();
            }
        }
        return this.f1789ac;
    }

    /* renamed from: f */
    public String mo4477f() {
        if (this.f1788ab != C0820a.f5400c || this.f1790ad == null) {
            this.f1788ab = C0820a.f5400c;
            String str = "units." + name() + ".description";
            this.f1790ad = C0820a.m1734a(str, null, new Object[0]);
            if (this.f1790ad == null) {
                if (Core.m1087A().m1013ar() && !m4628A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.f1790ad = VariableScope.nullOrMissingString;
            }
        }
        return this.f1790ad;
    }

    /* renamed from: g */
    public int mo4476g() {
        return 1;
    }

    /* renamed from: a */
    public void m4618a(ArrayList arrayList, int i) {
    }

    /* renamed from: h */
    public void mo4475h() {
        C0304at[] c0304atArr = new C0304at[3];
        for (int i = 1; i <= 3; i++) {
            C0304at c0304at = new C0304at();
            m4618a(c0304at.f1796a, i);
            c0304atArr[i - 1] = c0304at;
        }
        this.f1792af = c0304atArr;
    }

    /* renamed from: a */
    public ArrayList mo4484a(int i) {
        if (i > 3) {
            throw new RuntimeException("Tech level:" + i + " greater than maxTechLevel");
        }
        return this.f1792af[i - 1].f1796a;
    }

    /* renamed from: i */
    public String mo4474i() {
        return name();
    }

    /* renamed from: j */
    public boolean mo4473j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo4472k() {
        return mo4473j();
    }

    /* renamed from: l */
    public boolean mo4471l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo4470m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo4469n() {
        return false;
    }

    /* renamed from: o */
    public EnumC0246ao mo4468o() {
        AbstractC0244am m4785a = AbstractC0244am.m4785a(this);
        if (m4785a == null) {
            throw new RuntimeException("Shared unit is null for:" + name());
        }
        return m4785a.mo3039h();
    }

    /* renamed from: p */
    public boolean mo4467p() {
        return false;
    }

    /* renamed from: q */
    public C0402bc mo4466q() {
        return null;
    }

    /* renamed from: a */
    public static InterfaceC0303as m4623a(String str) {
        return m4619a(str, true);
    }

    /* renamed from: a */
    public static InterfaceC0303as m4619a(String str, boolean z) {
        EnumC0249ar[] values;
        InterfaceC0303as m3675m;
        if (z && (m3675m = C0453l.m3675m(str)) != null) {
            return m3675m;
        }
        for (EnumC0249ar enumC0249ar : values()) {
            if (enumC0249ar.name().equalsIgnoreCase(str)) {
                return enumC0249ar;
            }
        }
        C0453l m3673n = C0453l.m3673n(str);
        if (m3673n != null) {
            return m3673n;
        }
        return null;
    }

    /* renamed from: a */
    private static String m4622a(String str, float f) {
        return m4621a(str, f, VariableScope.nullOrMissingString);
    }

    /* renamed from: a */
    private static String m4621a(String str, float f, String str2) {
        String str3 = VariableScope.nullOrMissingString + f;
        if (f % 1.0f == 0.0f) {
            str3 = VariableScope.nullOrMissingString + ((int) f);
        }
        return m4620a(str, str3, str2);
    }

    /* renamed from: a */
    private static String m4620a(String str, String str2, String str3) {
        return str + ": " + str2 + str3 + "\n";
    }

    /* renamed from: a */
    private static int m4624a(AbstractC0623y abstractC0623y) {
        AbstractC0224s a;
        C0208c cl = abstractC0623y.m4696cl();
        if (cl != null && (a = abstractC0623y.m4788a(cl)) != null) {
            return a.mo3082c();
        }
        return 0;
    }

    /* renamed from: r */
    public static void m4614r() {
        new File("output_all_unit_images/").mkdirs();
        for (int i = 0; i < 50; i++) {
            Core.m1046a("running outputUnitImages()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        Iterator it = f1791ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it.next();
            AbstractC0244am m4785a = AbstractC0244am.m4785a(interfaceC0303as);
            if ((m4785a instanceof AbstractC0623y) && !interfaceC0303as.mo4474i().startsWith("bug") && C0453l.m3698c(interfaceC0303as) == null && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2948aE)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) m4785a;
                boolean z = false;
                for (String str : strArr) {
                    if (str.equals(interfaceC0303as.mo4474i())) {
                        z = true;
                    }
                }
                if (!z) {
                    String str2 = "output_all_unit_images/" + interfaceC0303as.mo4474i().replace("/", "_").replace("\\", "_") + ".png";
                    Core m1087A = Core.m1087A();
                    C0934e mo165b = m1087A.f6113bO.mo165b(100, 100, true);
                    InterfaceC1027y mo160b = m1087A.f6113bO.mo160b(mo165b);
                    InterfaceC1027y interfaceC1027y = m1087A.f6113bO;
                    m1087A.f6113bO = mo160b;
                    m4625a(interfaceC0303as, mo165b.f6404r, mo165b.f6405s, 0.0f, 0.0f, AbstractC0197n.m5017k(0), 20.0f, 100, false, false, 1, true, null);
                    m1087A.f6113bO = interfaceC1027y;
                    mo160b.mo130p();
                    m1087A.f6113bO.mo190a(mo165b, new File(str2));
                }
            }
        }
    }

    /* renamed from: s */
    public static void m4613s() {
        int m4624a;
        int m4624a2;
        for (int i = 0; i < 50; i++) {
            Core.m1046a("running printForHelp()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        String str = VariableScope.nullOrMissingString;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f1791ae);
        Collections.sort(arrayList, new C029349());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it.next();
            AbstractC0244am m4785a = AbstractC0244am.m4785a(interfaceC0303as);
            if ((m4785a instanceof AbstractC0623y) && !interfaceC0303as.mo4474i().startsWith("bug") && C0453l.m3698c(interfaceC0303as) == null && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2948aE)) {
                if (interfaceC0303as != f1785Y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) m4785a;
                    boolean z = false;
                    for (String str2 : strArr) {
                        if (str2.equals(interfaceC0303as.mo4474i())) {
                            z = true;
                        }
                    }
                    if (!z) {
                        String str3 = ((((((str + "\n") + "<div class=\"unit\">\n") + "<img src=\"unit:" + interfaceC0303as.mo4474i() + "\" />\n") + "<h4>" + interfaceC0303as.mo4478e() + "</h4>\n") + "<p>" + interfaceC0303as.mo4477f().replace("\n", "<br/>") + "</p>\n") + "<pre>") + m4620a("Price", "$" + interfaceC0303as.mo4481c(), VariableScope.nullOrMissingString);
                        if (m4624a(abstractC0623y) > 0) {
                            str3 = str3 + m4620a("T2 Upgrade Price", "$" + m4624a, VariableScope.nullOrMissingString);
                            AbstractC0623y abstractC0623y2 = (AbstractC0623y) interfaceC0303as.mo4485a();
                            abstractC0623y2.mo3356a(2);
                            if (abstractC0623y2.m3005V() == 2 && (m4624a2 = m4624a(abstractC0623y2)) > 0) {
                                str3 = str3 + m4620a("T3 Upgrade Price", "$" + m4624a2, VariableScope.nullOrMissingString);
                            }
                        }
                        String str4 = (((str3 + m4622a("Hp", abstractC0623y.f1633ct)) + m4622a("Speed", abstractC0623y.mo3033z())) + m4622a("Turn speed", abstractC0623y.mo3065A())) + m4622a("Mass", abstractC0623y.mo3158bN());
                        if (abstractC0623y.mo3036l()) {
                            str4 = (str4 + m4622a("Shoot Delay", abstractC0623y.mo3050b(0))) + m4622a("Attack Range", abstractC0623y.mo3035m());
                            float f = 0.0f;
                            float f2 = 0.0f;
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            int mo3169bl = abstractC0623y.mo3169bl();
                            for (int i2 = 0; i2 < mo3169bl; i2++) {
                                int i3 = C0188f.f1083a.f6894a;
                                abstractC0623y.mo3051a((AbstractC0244am) abstractC0623y, i2);
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
                                str4 = str4 + m4621a("Direct Damage", f, str5);
                            }
                            if (f4 != 0.0f) {
                                String str6 = VariableScope.nullOrMissingString;
                                if (f4 != f2) {
                                    str6 = " (total:" + f4 + ")";
                                }
                                str4 = str4 + m4621a("Area Damage", f2, str6);
                            }
                        }
                        str = (str4 + "</pre>") + "</div>\n";
                    }
                }
            }
        }
        Core.LogDebug2(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.units.ar$49 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar$49.class */
    public final class C029349 implements Comparator {
        C029349() {
        }

        /* renamed from: a */
        public int mo4300a(InterfaceC0303as interfaceC0303as, InterfaceC0303as interfaceC0303as2) {
            return interfaceC0303as.mo4465u().m4118a(interfaceC0303as2.mo4465u());
        }
    }

    /* renamed from: t */
    public static void m4612t() {
        EnumC0249ar[] values;
        for (EnumC0249ar enumC0249ar : values()) {
            enumC0249ar.name();
            enumC0249ar.mo4478e();
            enumC0249ar.mo4477f();
        }
    }

    /* renamed from: a */
    public static boolean m4627a(InterfaceC0303as interfaceC0303as, float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n) {
        Core.m1087A();
        AbstractC0244am m4785a = AbstractC0244am.m4785a(interfaceC0303as);
        if (m4785a == null) {
            Core.LogDebug2("isValidHere: Failed to get unit from type:" + interfaceC0303as);
            return false;
        }
        m4785a.m4768b(abstractC0197n);
        m4785a.f6960en = f4;
        m4785a.f6958el = f;
        m4785a.f6959em = f2;
        if (!m4785a.m4758bI()) {
            m4785a.f1618ce = f3;
            if (m4785a instanceof AbstractC0623y) {
                ((AbstractC0623y) m4785a).m2821j(f3);
            }
        }
        boolean z = true;
        if (m4785a instanceof AbstractC0623y) {
            z = ((AbstractC0623y) m4785a).m2848c(abstractC0197n);
        }
        m4785a.f6960en = 0.0f;
        m4785a.f1618ce = 0.0f;
        return z;
    }

    /* renamed from: a */
    public static void m4626a(InterfaceC0303as interfaceC0303as, float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n, float f5, float f6, boolean z, boolean z2, int i, AbstractC0244am abstractC0244am) {
        m4625a(interfaceC0303as, f, f2, f3, f4, abstractC0197n, f5, f6, z, z2, i, true, abstractC0244am);
    }

    /* renamed from: a */
    public static void m4625a(InterfaceC0303as interfaceC0303as, float f, float f2, float f3, float f4, AbstractC0197n abstractC0197n, float f5, float f6, boolean z, boolean z2, int i, boolean z3, AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        AbstractC0244am m4736c = AbstractC0244am.m4736c(interfaceC0303as);
        boolean m4758bI = m4736c.m4758bI();
        m4736c.m4768b(abstractC0197n);
        if (m4736c instanceof AbstractC0623y) {
            ((AbstractC0623y) m4736c).mo3356a(i);
        }
        m4736c.f6960en = f4;
        if (m4736c.mo3039h() == EnumC0246ao.f1708f || m4736c.mo3039h() == EnumC0246ao.f1709g || m4736c.mo3039h() == EnumC0246ao.f1710h) {
            m4736c.f6960en += 4.0f;
        }
        if (m4736c.mo3039h() == EnumC0246ao.f1706d) {
            m4736c.f6960en += 10.0f;
        }
        if (!m4758bI) {
            m4736c.f1618ce = f3;
            if (m4736c instanceof AbstractC0623y) {
                ((AbstractC0623y) m4736c).m2821j(f3);
            }
        } else {
            m4736c.f1618ce = -90.0f;
        }
        boolean z4 = true;
        boolean z5 = m4736c.f1627cn;
        m4736c.f1627cn = true;
        m4736c.f1630cq = false;
        m4736c.f1631cr = false;
        if (!z3) {
            m4736c.f1631cr = true;
        }
        m4736c.f1626cm = false;
        m4736c.f1628co = false;
        m4736c.f1629cp = false;
        if (z || z2) {
            m4736c.f1628co = z2;
            m4736c.f1629cp = z;
            z4 = false;
        } else {
            m4736c.f1626cm = true;
        }
        if (!z4) {
            m4736c.f6958el = f;
            m4736c.f6959em = f2;
        } else {
            m4736c.f6958el = m1087A.f6144cv + f;
            m4736c.f6959em = m1087A.f6145cw + f2;
        }
        float f7 = m4736c.f1621ch * 2.0f * 0.8f;
        if (m4736c instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m4736c;
            if (abstractC0623y.f3885L != null) {
                float cC = abstractC0623y.f4229eq * abstractC0623y.m4731cC();
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
        m1087A.f6113bO.mo135k();
        if (z4) {
        }
        if (f8 != 1.0f) {
            m1087A.f6113bO.mo226a(f8, f8, f, f2);
        }
        if (f8 < 1.0f) {
            f1793ag = true;
        } else {
            f1793ag = false;
        }
        if (abstractC0244am != null) {
            C0439f c0439f = m4736c.f1697dF;
            m4736c.f1697dF = abstractC0244am.f1697dF;
            int i2 = m4736c.f1642cC;
            m4736c.f1642cC = abstractC0244am.f1642cC;
            float f9 = m4736c.f1632cs;
            m4736c.f1632cs = abstractC0244am.f1632cs;
            float f10 = m4736c.f1639cz;
            m4736c.f1639cz = abstractC0244am.f1639cz;
            VariableScope variableScope = m4736c.f1582bv;
            m4736c.f1582bv = abstractC0244am.f1582bv;
            m4736c.m4682d(0.0f);
            m4736c.mo3049c(0.0f);
            m4736c.mo3053a(0.0f, false);
            m4736c.f1697dF = c0439f;
            m4736c.f1642cC = i2;
            m4736c.f1632cs = f9;
            m4736c.f1639cz = f10;
            m4736c.f1582bv = variableScope;
        } else {
            m4736c.m4682d(0.0f);
            m4736c.mo3049c(0.0f);
            m4736c.mo3053a(0.0f, false);
        }
        m1087A.f6113bO.mo134l();
        m4736c.f6960en = 0.0f;
        if (!m4758bI) {
            m4736c.f1618ce = 0.0f;
        } else {
            m4736c.f1618ce = -90.0f;
        }
        if (m4736c instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) m4736c;
            abstractC0623y2.m2821j(0.0f);
            abstractC0623y2.mo3356a(1);
        }
        m4736c.f1628co = false;
        m4736c.f1629cp = false;
        m4736c.f1627cn = z5;
        m4736c.f1626cm = false;
    }

    /* renamed from: b */
    public int mo4482b(int i) {
        int mo4481c = mo4481c();
        if (i >= 2) {
            mo4481c += m4615c(2);
        }
        if (i >= 3) {
            mo4481c += m4615c(2);
        }
        return mo4481c;
    }

    /* renamed from: c */
    public int m4615c(int i) {
        return 0;
    }

    /* renamed from: u */
    public C0424b mo4465u() {
        int mo4481c = mo4481c();
        if (mo4481c == 0) {
            return C0424b.f2710a;
        }
        if (this.f1794ah == null || this.f1794ah.m4126a() != mo4481c) {
            this.f1794ah = C0424b.m4125a(mo4481c);
        }
        return this.f1794ah;
    }

    /* renamed from: d */
    public C0424b mo4479d(int i) {
        return C0424b.m4125a(mo4482b(i));
    }

    /* renamed from: v */
    public String mo4464v() {
        return name();
    }

    /* renamed from: w */
    public boolean mo4463w() {
        return false;
    }

    /* renamed from: x */
    public C0449h mo4462x() {
        return null;
    }

    /* renamed from: y */
    public boolean mo4461y() {
        return true;
    }

    /* renamed from: z */
    public C0934e mo4460z() {
        return null;
    }

    /* renamed from: a */
    public int mo4483a(AbstractC0244am abstractC0244am) {
        return 0;
    }

    /* renamed from: A */
    public boolean m4628A() {
        return false;
    }

    /* renamed from: B */
    public C0424b mo4488B() {
        return null;
    }
}
