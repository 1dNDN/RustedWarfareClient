package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bg */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bg.class */
public class C0406bg {

    /* renamed from: a */
    C1101m f2517a;

    /* renamed from: b */
    public static final C0407bh f2518b = new C0407bh();

    /* renamed from: a */
    public static C0406bg m4166a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0406bg c0406bg) {
        String m656b = c1072ab.m656b(str, str2, (String) null);
        if (m656b == null) {
            return c0406bg;
        }
        return m4165a(c0453l, m656b, str, str2, false);
    }

    /* renamed from: a */
    public static C0406bg m4165a(C0453l c0453l, String str, String str2, String str3, boolean z) {
        if (c0453l == null) {
            throw new RuntimeException("meta==null");
        }
        return m4164b(c0453l, str, str2, str3, z);
    }

    /* renamed from: b */
    public static C0406bg m4164b(C0453l c0453l, String str, String str2, String str3, boolean z) {
        int m4169a;
        String[] split;
        C0406bg c0406bg = new C0406bg();
        if (str == null || VariableScope.nullOrMissingString.equals(str) || "NONE".equalsIgnoreCase(str)) {
            return c0406bg;
        }
        if (c0453l == null) {
            throw new C0412bm("meta required");
        }
        Iterator it = C0758f.m2141b(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] split2 = trim.split("\\(");
                    if (split2.length != 2) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
                    }
                    trim = split2[0];
                    str4 = split2[1].trim();
                }
                String[] split3 = trim.split("\\*");
                String str5 = split3[0];
                int i = 1;
                if (split3.length >= 2) {
                    i = Integer.parseInt(split3[1]);
                }
                C0408bi c0408bi = new C0408bi(c0453l.m3701b(str5, str3, str2));
                if (c0406bg.f2517a == null) {
                    c0406bg.f2517a = new C1101m();
                }
                c0408bi.f2525b = i;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0412bm("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                    for (String str6 : str4.substring(0, str4.length() - 1).split("\\,")) {
                        if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] split4 = str6.split("\\=");
                            if (split4.length != 2) {
                                throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                            }
                            String trim2 = split4[0].trim();
                            String trim3 = split4[1].trim();
                            if (trim2.equalsIgnoreCase("spawnChance")) {
                                c0408bi.f2526c = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                c0408bi.f2527d = C1072ab.m632i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("recursionLimit")) {
                                c0408bi.f2537n = C1072ab.m632i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetX") || trim2.equalsIgnoreCase("xOffsetAbsolute")) {
                                c0408bi.f2528e = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetY") || trim2.equalsIgnoreCase("yOffsetAbsolute")) {
                                c0408bi.f2529f = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("xOffsetRelative")) {
                                c0408bi.f2532i = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("yOffsetRelative")) {
                                c0408bi.f2533j = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                float m634h = C1072ab.m634h(str2, str3, trim3);
                                c0408bi.f2534k = m634h;
                                c0408bi.f2535l = m634h;
                            } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                c0408bi.f2534k = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                c0408bi.f2535l = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                c0408bi.f2530g = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                c0408bi.f2536m = C1072ab.m634h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                c0408bi.f2531h = C1072ab.m634h(str2, str3, trim3);
                            } else {
                                throw new C0412bm("[" + str2 + "]" + str3 + " ProjectileList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                            }
                        }
                    }
                }
                c0406bg.f2517a.add(c0408bi);
            }
        }
        if (z && (m4169a = c0406bg.m4169a()) > 1) {
            throw new C0412bm("[" + str2 + "]" + str3 + " Too many units: " + m4169a + ", only single unit is allowed here");
        }
        return c0406bg;
    }

    /* renamed from: a */
    public int m4169a() {
        if (this.f2517a == null || this.f2517a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f2517a.iterator();
        while (it.hasNext()) {
            i += ((C0408bi) it.next()).f2525b;
        }
        return i;
    }

    /* renamed from: a */
    public void m4168a(float f, float f2, float f3, float f4, AbstractC0244am abstractC0244am, C1101m c1101m, boolean z, int i, C0188f c0188f, AbstractC0244am abstractC0244am2) {
        if (this.f2517a == null || this.f2517a.size() == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        if (abstractC0244am == null) {
            Core.LogDebug2("projectile spawn At: Skipping, source unit required");
            return;
        }
        Iterator it = this.f2517a.iterator();
        while (it.hasNext()) {
            C0408bi c0408bi = (C0408bi) it.next();
            C0405bf m3639f = c0408bi.f2524a.m3639f();
            if (m3639f == null) {
                Core.LogDebug2("projectile spawn At: Skipping, projectileType==null");
            } else {
                for (int i4 = 0; i4 < c0408bi.f2525b; i4++) {
                    i3++;
                    if ((c0408bi.f2526c >= 1.0f || C0758f.m2190a(abstractC0244am, 0.0f, 1.0f, i3) <= c0408bi.f2526c) && i2 < c0408bi.f2527d && i <= c0408bi.f2537n) {
                        float f5 = f + c0408bi.f2528e;
                        float f6 = f2 + c0408bi.f2529f;
                        float f7 = f3 + c0408bi.f2530g;
                        float f8 = f4 + c0408bi.f2531h;
                        if (c0408bi.f2536m != 0.0f) {
                            f8 += C0758f.m2190a(abstractC0244am, -c0408bi.f2536m, c0408bi.f2536m, (i3 * 4) + 3);
                        }
                        if (c0408bi.f2534k != 0.0f) {
                            f5 += C0758f.m2190a(abstractC0244am, -c0408bi.f2534k, c0408bi.f2534k, (i3 * 2) + 1);
                        }
                        if (c0408bi.f2535l != 0.0f) {
                            f6 += C0758f.m2190a(abstractC0244am, -c0408bi.f2535l, c0408bi.f2535l, (i3 * 3) + 2);
                        }
                        if (c0408bi.f2532i != 0.0f || c0408bi.f2533j != 0.0f) {
                            float m2092i = C0758f.m2092i(f4);
                            float m2097h = C0758f.m2097h(f4);
                            float f9 = c0408bi.f2532i;
                            float f10 = c0408bi.f2533j;
                            f5 += (m2092i * f10) - (m2097h * f9);
                            f6 += (m2097h * f10) + (m2092i * f9);
                        }
                        C0188f m3913a = C0451j.m3913a(abstractC0244am, -1, m3639f, f5, f6, f7, f8);
                        m3913a.f1055aD = i;
                        if (c0188f != null && abstractC0244am != null) {
                            m3639f.m4173a(abstractC0244am, m3913a, c0188f.f986l, c0188f.f988n, c0188f.f989o, -1.0f);
                        }
                        m4167a(m3913a, c0408bi, abstractC0244am, c0188f, abstractC0244am2);
                        i2++;
                        if (c1101m != null) {
                            c1101m.add(m3913a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m4167a(C0188f c0188f, C0408bi c0408bi, AbstractC0244am abstractC0244am, C0188f c0188f2, AbstractC0244am abstractC0244am2) {
        Core m1087A = Core.m1087A();
        f2518b.f2519a = c0188f;
        f2518b.f2520b = c0408bi;
        f2518b.f2521c = abstractC0244am;
        f2518b.f2522d = c0188f2;
        f2518b.f2523e = abstractC0244am2;
        m1087A.f6127cc.m3258a(c0188f.f6958el, c0188f.f6959em, 100.0f, null, 0.0f, f2518b);
    }
}
