package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.custom.C0411bl;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/c.class */
public class C0389c extends AbstractC0387a {

    /* renamed from: c */
    C1101m f2330c = new C1101m();

    /* renamed from: d */
    C1101m f2331d = new C1101m();

    /* renamed from: e */
    C1101m f2332e = new C1101m();

    /* renamed from: f */
    C1101m f2333f = new C1101m();

    /* renamed from: g */
    C1101m f2334g = new C1101m();

    /* renamed from: h */
    boolean f2335h;

    /* renamed from: a */
    static Paint f2328a = new Paint();

    /* renamed from: b */
    static C0930ag f2329b = new C0930ag();

    /* renamed from: i */
    static final Rect f2336i = new Rect();

    /* renamed from: j */
    static final RectF f2337j = new RectF();

    /* renamed from: a */
    public static void m3823a(C0453l c0453l, C1072ab c1072ab) {
        String str;
        C1101m c1101m;
        C0389c c0389c = null;
        Iterator it = c1072ab.m632e("decal_").iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            c0453l.m3434a("1.15p9", 115009, str2, "decals");
            str2.substring("decal_".length());
            C0390d c0390d = new C0390d();
            c0390d.f2369F = (EnumC0392f) c1072ab.m662a(str2, "layer", EnumC0392f.onTop, EnumC0392f.class);
            c0390d.f2370G = c1072ab.m661a(str2, "order", Float.valueOf(0.0f)).floatValue();
            c0390d.f2339b = c1072ab.m663a(str2, "onlyWhenSelectedByOwnPlayer", (Boolean) false).booleanValue();
            c0390d.f2340c = c1072ab.m663a(str2, "onlyWhenSelectedByEnemyPlayer", (Boolean) false).booleanValue();
            c0390d.f2341d = c1072ab.m663a(str2, "onlyWhenSelectedByAllyNotOwnPlayer", (Boolean) false).booleanValue();
            c0390d.f2342e = c1072ab.m663a(str2, "onlyWhenSelectedByAnyPlayer", (Boolean) false).booleanValue();
            int i = c0390d.f2339b ? 0 + 1 : 0;
            if (c0390d.f2340c) {
                i++;
            }
            if (c0390d.f2341d) {
                i++;
            }
            if (c0390d.f2342e) {
                i++;
            }
            if (i >= 2) {
                throw new C0412bm("[" + str2 + "]Doesn't make sense to set more than one onlyWhenSelectedBy* to true at a time.");
            }
            if (i > 0) {
                c0390d.f2338a = true;
            } else {
                c0390d.f2338a = false;
            }
            c0390d.f2343f = c1072ab.m663a(str2, "includeParentsSelection", (Boolean) false).booleanValue();
            c0390d.f2344g = (EnumC0200q) c1072ab.m662a(str2, "onlyTeam", EnumC0200q.any, EnumC0200q.class);
            c0390d.f2345h = c1072ab.m663a(str2, "onlyPlayersWithUnitControl", (Boolean) false).booleanValue();
            c0390d.f2346i = c1072ab.m661a(str2, "onlyWithZoomLevelOrMore", Float.valueOf(0.0f)).floatValue();
            boolean z = false;
            if (c0390d.f2369F == EnumC0392f.beforeUI) {
                z = true;
            }
            c0390d.f2347j = c1072ab.m663a(str2, "onlyWhileActive", (Boolean) false).booleanValue();
            c0390d.f2348k = c1072ab.m663a(str2, "onlyWhileAlive", Boolean.valueOf(z)).booleanValue();
            c0390d.f2349l = c1072ab.m663a(str2, "onlyInPreview", (Boolean) false).booleanValue();
            c0390d.f2350m = c1072ab.m663a(str2, "onlyOnNonPreview", (Boolean) false).booleanValue();
            if (c0390d.f2349l && c0390d.f2350m) {
                throw new C0412bm("[" + str2 + "]decal with both onlyInPreview and onlyOnNonPreview will never be visible");
            }
            if (c0390d.f2346i > 5.0f) {
                throw new C0412bm("[" + str2 + "]decal with onlyWithZoomLevelOrMore:" + c0390d.f2346i + " will never be visible");
            }
            if (c0390d.f2346i < 0.0f) {
                throw new C0412bm("[" + str2 + "]onlyWithZoomLevelOrMore:" + c0390d.f2346i + " cannot be less than zero");
            }
            Integer m645b = c1072ab.m645b(str2, "onlyOnBodyFrameOf", (Integer) null);
            if (m645b != null) {
                c0390d.f2351n = m645b.intValue();
                if (c0390d.f2351n < 0) {
                    throw new C0412bm("[" + str2 + "]onlyOnBodyFrameOf cannot be: " + c0390d.f2351n);
                }
            }
            LogicBoolean m642c = c1072ab.m642c(c0453l, str2, "imageScale", null);
            if (m642c != null) {
                if (LogicBoolean.isStaticNumber(m642c)) {
                    c0390d.f2352o = LogicBoolean.getKnownStaticNumber(m642c);
                } else {
                    c0390d.f2353p = true;
                    c0390d.f2354q = m642c;
                }
            }
            LogicBoolean m642c2 = c1072ab.m642c(c0453l, str2, "imageScaleX", null);
            LogicBoolean m642c3 = c1072ab.m642c(c0453l, str2, "imageScaleY", null);
            if (m642c2 != null || m642c3 != null) {
                c0390d.f2353p = true;
                c0390d.f2355r = m642c2;
                c0390d.f2356s = m642c3;
            }
            Integer m645b2 = c1072ab.m645b(str2, "total_frames", (Integer) null);
            if (m645b2 != null) {
                c0390d.f2372I = m645b2.intValue();
                if (c0390d.f2372I < 1) {
                    throw new C0412bm("[" + str2 + "] TOTAL_FRAMES cannot be: " + c0390d.f2372I + " (must be 1 or more)");
                }
            }
            c0390d.f2375L = c1072ab.m663a(str2, "frame_verticalOrdering", (Boolean) false).booleanValue();
            c0390d.f2373J = c1072ab.m645b(str2, "frame_width", (Integer) (-1)).intValue();
            c0390d.f2374K = c1072ab.m645b(str2, "frame_height", (Integer) (-1)).intValue();
            if (c0390d.f2373J != -1 && c0390d.f2372I != -1) {
                throw new C0412bm("[" + str2 + "]TOTAL_FRAMES and frame_width cannot be both set");
            }
            if (c0390d.f2374K != -1 && c0390d.f2374K <= 0) {
                throw new C0412bm("[" + str2 + "]frame_height cannot be: " + c0390d.f2374K);
            }
            if (c0390d.f2373J != -1 && c0390d.f2373J <= 0) {
                throw new C0412bm("[" + str2 + "]frame_width cannot be: " + c0390d.f2373J);
            }
            if (c0390d.f2372I != -1 && c0390d.f2372I <= 0) {
                throw new C0412bm("[" + str2 + "]TOTAL_FRAMES cannot be: " + c0390d.f2372I);
            }
            if (c0390d.f2374K != -1 || c0390d.f2373J != -1 || c0390d.f2372I != -1) {
                c0390d.f2371H = true;
            }
            boolean booleanValue = c1072ab.m663a(str2, "teamColors", (Boolean) false).booleanValue();
            C0934e m3437a = c0453l.m3437a(c1072ab, str2, "image");
            if (m3437a != null) {
                C0391e c0391e = new C0391e();
                c0391e.f2398a = m3437a;
                if (c0391e.f2398a != null && booleanValue) {
                    c0391e.f2399b = c0453l.m3438a(m3437a, c0453l.f2956ab);
                }
                c0391e.m3817a(c0390d);
                c0390d.f2358u = c0391e;
                c0390d.f2357t = true;
            }
            String m644b = c1072ab.m644b(str2, "imageStack", (String) null);
            if (m644b != null && !m644b.equals(VariableScope.nullOrMissingString)) {
                c0390d.f2357t = true;
                ArrayList arrayList = new ArrayList();
                for (String str3 : m644b.split(",")) {
                    String trim = str3.trim();
                    boolean z2 = booleanValue;
                    String str4 = null;
                    if (trim.contains("(") && trim.contains(")")) {
                        String[] m2041f = C0758f.m2041f(trim, "(");
                        if (m2041f == null) {
                            throw new C0412bm("[" + str2 + "]imageStack: Unexpected format for: " + m644b);
                        }
                        trim = m2041f[0];
                        str4 = m2041f[1].trim();
                    }
                    String[] split = trim.split("\\*");
                    String str5 = split[0];
                    int i2 = 1;
                    if (split.length >= 2) {
                        i2 = Integer.parseInt(split[1]);
                    }
                    if (str4 != null) {
                        if (!str4.endsWith(")")) {
                            throw new C0412bm("[" + str2 + "]imageStack: Missing ')' in: " + m644b);
                        }
                        Iterator it2 = C0758f.m2107a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                        while (it2.hasNext()) {
                            String str6 = (String) it2.next();
                            if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                                String[] m2041f2 = C0758f.m2041f(str6, "=");
                                if (m2041f2 == null) {
                                    throw new RuntimeException("[" + str2 + "]imageStack: Unexpected key format for: " + m644b);
                                }
                                String trim2 = m2041f2[0].trim();
                                String trim3 = m2041f2[1].trim();
                                if (trim2.equalsIgnoreCase("teamColors")) {
                                    z2 = C1072ab.m624g(str2, "imageStack", trim3);
                                } else if (trim2.equalsIgnoreCase("teamColor")) {
                                    z2 = C1072ab.m624g(str2, "imageStack", trim3);
                                } else {
                                    throw new RuntimeException("[" + str2 + "]imageStack: Unknown parameter: " + trim2);
                                }
                            }
                        }
                    }
                    C0391e c0391e2 = new C0391e();
                    c0391e2.f2398a = c0453l.m3430a(c0453l.f2933E, str5, c0453l.f2955aa, str2, "imageStack");
                    if (c0391e2.f2398a == null) {
                        throw new C0412bm("[" + str2 + "]failed to load image " + str5);
                    }
                    if (z2) {
                        c0391e2.f2399b = c0453l.m3438a(c0391e2.f2398a, c0453l.f2956ab);
                    }
                    c0391e2.m3817a(c0390d);
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList.add(c0391e2);
                    }
                }
                if (arrayList.size() > 0) {
                    c0390d.f2359v = (C0391e[]) arrayList.toArray(new C0391e[0]);
                }
            }
            c0390d.f2360w = c1072ab.m661a(str2, "stack_hOffset", Float.valueOf(1.0f)).floatValue();
            c0390d.f2361x = c1072ab.m645b(str2, "stack_frameOffset", (Integer) 0).intValue();
            c0390d.f2363z = c1072ab.m642c(c0453l, str2, "stack_indexStart", null);
            c0390d.f2364A = c1072ab.m642c(c0453l, str2, "stack_indexCount", null);
            Boolean m663a = c1072ab.m663a(str2, "stack_drawInReverseOrder", (Boolean) null);
            if ((m663a != null && m663a.booleanValue()) || (m663a == null && c0390d.f2360w < 0.0f)) {
                c0390d.f2362y = true;
            }
            c0390d.f2376M = c1072ab.m681a(c0453l, str2, "frame", (LogicBoolean) null, LogicBoolean.ReturnType.number);
            c0390d.f2377N = c1072ab.m645b(str2, "addBodyFrameMultipliedBy", (Integer) 0).intValue();
            c0390d.f2368E = c1072ab.m682a(c0453l, str2, "isVisible", (LogicBoolean) null);
            c0390d.f2380Q = c1072ab.m661a(str2, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
            c0390d.f2381R = c1072ab.m661a(str2, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
            c0390d.f2385V = c1072ab.m642c(c0453l, str2, "xOffsetAbsolute", null);
            c0390d.f2386W = c1072ab.m642c(c0453l, str2, "yOffsetAbsolute", null);
            if (LogicBoolean.isStaticNumber(c0390d.f2385V)) {
                c0390d.f2382S = LogicBoolean.getKnownStaticNumber(c0390d.f2385V);
                c0390d.f2385V = null;
            }
            if (LogicBoolean.isStaticNumber(c0390d.f2386W)) {
                c0390d.f2383T = LogicBoolean.getKnownStaticNumber(c0390d.f2386W);
                c0390d.f2386W = null;
            }
            c0390d.f2384U = c1072ab.m661a(str2, "hOffset", Float.valueOf(0.0f)).floatValue();
            c0390d.f2389Z = c1072ab.m661a(str2, "dirOffset", Float.valueOf(0.0f)).floatValue();
            c0390d.f2390aa = c1072ab.m661a(str2, "pivotOffset", Float.valueOf(0.0f)).floatValue();
            c0390d.f2387X = c1072ab.m656a(str2, "alwaysStartDirAtZero", "alwayStartDirAtZero", (Boolean) false).booleanValue();
            c0390d.f2388Y = c1072ab.m663a(str2, "alwaysStartHeightAtZero", (Boolean) false).booleanValue();
            if (c0390d.f2380Q != 0.0f) {
            }
            c0390d.f2391ab = c1072ab.m649b(c0453l, str2, "basePosition", null);
            c0390d.f2392ac = c1072ab.m649b(c0453l, str2, "drawLineTo", null);
            String m644b2 = c1072ab.m644b(str2, "basePositionFromLegEnd", (String) null);
            if (m644b2 != null || 0 != 0) {
                if (m644b2 != null && 0 != 0) {
                    throw new C0412bm("[" + str2 + "]basePositionFromLegEnd and basePositionFromLegMiddle cannot be used at the same time");
                }
                if (0 != 0) {
                    str = null;
                    c0390d.f2394ae = true;
                } else {
                    str = m644b2;
                }
                c0390d.f2393ad = c0453l.m3421b(str);
                if (c0390d.f2393ad == -1) {
                    throw new C0412bm("[" + str2 + "]basePositionFromLeg* failed to find: " + str);
                }
            }
            String m644b3 = c1072ab.m644b(str2, "basePositionFromTurret", (String) null);
            if (m644b3 != null) {
                C0411bl m3410e = c0453l.m3410e(m644b3);
                if (m3410e == null) {
                    throw new C0412bm("[" + str2 + "]basePositionFromTurret failed to find: " + m644b3);
                }
                c0390d.f2395af = m3410e.f2547e;
            }
            if (c0390d.f2393ad != -1 && c0390d.f2395af != -1) {
                throw new C0412bm("[" + str2 + "]basePositionFromTurret and basePositionFromLeg cannot be used at the same time");
            }
            if ((c0390d.f2393ad != -1 || c0390d.f2395af != -1) && c0390d.f2391ab != null) {
                throw new C0412bm("[" + str2 + "]basePositionFromTurret/basePositionFromLeg cannot be used at the same time as basePosition");
            }
            c0390d.f2365B = c0453l.m3437a(c1072ab, str2, "image_shadow");
            c0390d.f2366C = c1072ab.m661a(str2, "shadowOffsetX", Float.valueOf(1.0f)).floatValue();
            c0390d.f2367D = c1072ab.m661a(str2, "shadowOffsetY", Float.valueOf(1.0f)).floatValue();
            c0390d.f2378O = c1072ab.m659a(str2, "color", (Integer) (-1)).intValue();
            c0390d.f2379P = c1072ab.m661a(str2, "lineWidth", Float.valueOf(1.0f)).floatValue();
            float f = 1.0f;
            LogicBoolean m642c4 = c1072ab.m642c(c0453l, str2, "alpha", null);
            if (m642c4 != null) {
                if (LogicBoolean.isStaticNumber(m642c4)) {
                    float knownStaticNumber = LogicBoolean.getKnownStaticNumber(m642c4);
                    if (knownStaticNumber < 0.0f || knownStaticNumber > 1.0f) {
                        throw new C0412bm("[" + str2 + "]alpha should be between 0-1");
                    }
                    f = knownStaticNumber;
                } else {
                    c0390d.f2397ah = m642c4;
                }
            }
            if (c0390d.f2378O != -1 || c0390d.f2379P != 1.0f || f != 1.0f) {
                c0390d.f2396ag = new C0930ag();
                c0390d.f2396ag.m5069b(c0390d.f2378O);
                int f2 = (int) (c0390d.f2396ag.m5055f() * f);
                if (f2 < 0) {
                    f2 = 0;
                }
                if (f2 > 255) {
                    f2 = 255;
                }
                c0390d.f2396ag.m5064c(f2);
                c0390d.f2396ag.m5094a(c0390d.f2379P);
            }
            boolean z3 = true;
            if (LogicBoolean.isStaticFalse(c0390d.f2368E)) {
                z3 = false;
            }
            if (c0390d.f2392ac == null && !c0390d.f2357t) {
                z3 = false;
            }
            if (f == 0.0f) {
                z3 = false;
            }
            if (z3) {
                if (c0389c == null) {
                    c0389c = new C0389c();
                    c0453l.m3422b(c0389c);
                }
                if (!c0390d.f2338a) {
                    c0389c.f2335h = true;
                }
                if (c0390d.f2365B != null && c0390d.f2369F != EnumC0392f.shadow) {
                    c0389c.f2330c.add(c0390d);
                }
                if (c0390d.f2369F == EnumC0392f.afterBody) {
                    c1101m = c0389c.f2333f;
                } else if (c0390d.f2369F == EnumC0392f.beforeBody) {
                    c1101m = c0389c.f2332e;
                } else if (c0390d.f2369F == EnumC0392f.beforeUI) {
                    c1101m = c0389c.f2334g;
                } else if (c0390d.f2369F == EnumC0392f.shadow) {
                    c1101m = c0389c.f2330c;
                } else {
                    c1101m = c0389c.f2331d;
                }
                C1101m c1101m2 = c1101m;
                c1101m2.add(c0390d);
                Collections.sort(c1101m2);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: b */
    public void mo3798b(C0451j c0451j, float f) {
        AbstractC0916l.m1071A();
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: a */
    public void mo3808a(C0451j c0451j) {
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: d */
    public void mo3821d(C0451j c0451j, float f) {
        m3824a(c0451j, f, EnumC0392f.shadow, this.f2330c);
        m3824a(c0451j, f, EnumC0392f.beforeBody, this.f2332e);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: e */
    public void mo3820e(C0451j c0451j, float f) {
        m3824a(c0451j, f, EnumC0392f.afterBody, this.f2333f);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: c */
    public void mo3822c(C0451j c0451j, float f) {
        m3824a(c0451j, f, EnumC0392f.onTop, this.f2331d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0387a
    /* renamed from: f */
    public void mo3819f(C0451j c0451j, float f) {
        m3824a(c0451j, f, EnumC0392f.beforeUI, this.f2334g);
    }

    /* renamed from: a */
    public Rect m3825a(C0390d c0390d, C0391e c0391e, C0934e c0934e, int i) {
        int i2 = c0391e.f2400c;
        int i3 = c0391e.f2401d;
        int i4 = 0;
        int i5 = 0;
        if (i > 0) {
            if (!c0390d.f2375L) {
                int i6 = 0;
                int i7 = i;
                int i8 = c0391e.f2403f;
                if (i >= i8) {
                    i6 = 0 + (i / i8);
                    i7 = i % i8;
                }
                i4 = i7 * i2;
                i5 = i6 * i3;
            } else {
                int i9 = i;
                int i10 = 0;
                int i11 = c0391e.f2402e;
                if (i >= i11) {
                    i10 = 0 + (i / i11);
                    i9 = i % i11;
                }
                i4 = i10 * i2;
                i5 = i9 * i3;
            }
        }
        Rect rect = f2336i;
        rect.f230a = i4;
        rect.f231b = i5;
        rect.f232c = i4 + i2;
        rect.f233d = i5 + i3;
        return rect;
    }

    /* renamed from: a */
    public RectF m3826a(C0390d c0390d, C0391e c0391e, C0934e c0934e, float f, float f2) {
        int i = c0391e.f2400c;
        int i2 = c0391e.f2401d;
        float f3 = f - (i / 2);
        float f4 = f2 - (i2 / 2);
        RectF rectF = f2337j;
        rectF.f234a = f3;
        rectF.f236c = f3 + i;
        rectF.f235b = f4;
        rectF.f237d = f4 + i2;
        return rectF;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0968 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3824a(com.corrodinggames.rts.game.units.custom.C0451j r9, float r10, com.corrodinggames.rts.game.units.custom.p018b.EnumC0392f r11, com.corrodinggames.rts.gameFramework.utility.C1101m r12) {
        /*
            Method dump skipped, instructions count: 2415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.custom.p018b.C0389c.m3824a(com.corrodinggames.rts.game.units.custom.j, float, com.corrodinggames.rts.game.units.custom.b.f, com.corrodinggames.rts.gameFramework.utility.m):void");
    }
}
