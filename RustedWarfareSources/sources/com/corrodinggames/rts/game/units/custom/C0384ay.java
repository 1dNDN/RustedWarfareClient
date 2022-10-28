package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ay */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ay.class */
public class C0384ay {

    /* renamed from: a */
    int f2272a;

    /* renamed from: b */
    String f2273b;

    /* renamed from: c */
    boolean f2274c;

    /* renamed from: d */
    public float f2275d;

    /* renamed from: e */
    public float f2276e;

    /* renamed from: i */
    public float f2280i;

    /* renamed from: j */
    public float f2281j;

    /* renamed from: k */
    public float f2282k;

    /* renamed from: l */
    public boolean f2283l;

    /* renamed from: p */
    public boolean f2287p;

    /* renamed from: q */
    public LogicBoolean f2288q;

    /* renamed from: w */
    public float f2294w;

    /* renamed from: x */
    public C0934e f2295x;

    /* renamed from: y */
    public C0934e[] f2296y;

    /* renamed from: z */
    public boolean f2297z;

    /* renamed from: A */
    public float f2298A;

    /* renamed from: B */
    public C0934e f2299B;

    /* renamed from: C */
    public C0934e[] f2300C;

    /* renamed from: D */
    public C0934e f2301D;

    /* renamed from: E */
    public boolean f2302E;

    /* renamed from: H */
    public boolean f2305H;

    /* renamed from: S */
    public int[] f2316S;

    /* renamed from: T */
    public float f2317T;

    /* renamed from: f */
    public float f2277f = 2.0f;

    /* renamed from: g */
    public float f2278g = 0.0f;

    /* renamed from: h */
    public boolean f2279h = true;

    /* renamed from: m */
    public float f2284m = 1.0f;

    /* renamed from: n */
    public boolean f2285n = true;

    /* renamed from: o */
    public boolean f2286o = false;

    /* renamed from: r */
    public float f2289r = 1.0f;

    /* renamed from: s */
    public float f2290s = 1.0f;

    /* renamed from: t */
    public float f2291t = 0.0f;

    /* renamed from: u */
    public float f2292u = 3.0f;

    /* renamed from: v */
    public float f2293v = 0.3f;

    /* renamed from: F */
    public boolean f2303F = true;

    /* renamed from: G */
    public boolean f2304G = true;

    /* renamed from: I */
    public boolean f2306I = true;

    /* renamed from: J */
    public boolean f2307J = true;

    /* renamed from: K */
    public float f2308K = 7.0f;

    /* renamed from: L */
    public int f2309L = 3;

    /* renamed from: M */
    public boolean f2310M = true;

    /* renamed from: N */
    public float f2311N = 16.0f;

    /* renamed from: O */
    public float f2312O = 50.0f;

    /* renamed from: P */
    public boolean f2313P = false;

    /* renamed from: Q */
    public boolean f2314Q = false;

    /* renamed from: R */
    public float f2315R = 0.0f;

    /* renamed from: a */
    public void m3835a(C0384ay c0384ay) {
        this.f2275d = c0384ay.f2275d;
        this.f2276e = c0384ay.f2276e;
        this.f2280i = c0384ay.f2280i;
        this.f2281j = c0384ay.f2281j;
        this.f2282k = c0384ay.f2282k;
        this.f2277f = c0384ay.f2277f;
        this.f2278g = c0384ay.f2278g;
        this.f2279h = c0384ay.f2279h;
        this.f2283l = c0384ay.f2283l;
        this.f2284m = c0384ay.f2284m;
        this.f2285n = c0384ay.f2285n;
        this.f2286o = c0384ay.f2286o;
        this.f2291t = c0384ay.f2291t;
        this.f2287p = c0384ay.f2287p;
        this.f2289r = c0384ay.f2289r;
        this.f2290s = c0384ay.f2290s;
        this.f2292u = c0384ay.f2292u;
        this.f2294w = c0384ay.f2294w;
        this.f2295x = c0384ay.f2295x;
        this.f2296y = c0384ay.f2296y;
        this.f2298A = c0384ay.f2298A;
        this.f2297z = c0384ay.f2297z;
        this.f2299B = c0384ay.f2299B;
        this.f2300C = c0384ay.f2300C;
        this.f2301D = c0384ay.f2301D;
        this.f2302E = c0384ay.f2302E;
        this.f2303F = c0384ay.f2303F;
        this.f2304G = c0384ay.f2304G;
        this.f2293v = c0384ay.f2293v;
        this.f2305H = c0384ay.f2305H;
        this.f2306I = c0384ay.f2306I;
        this.f2307J = c0384ay.f2307J;
        this.f2308K = c0384ay.f2308K;
        this.f2309L = c0384ay.f2309L;
        this.f2310M = c0384ay.f2310M;
        this.f2311N = c0384ay.f2311N;
        this.f2312O = c0384ay.f2312O;
        this.f2313P = c0384ay.f2313P;
        this.f2314Q = c0384ay.f2314Q;
        this.f2315R = c0384ay.f2315R;
        this.f2317T = c0384ay.f2317T;
    }

    /* renamed from: a */
    public static void m3834a(C0384ay c0384ay, C0453l c0453l, C1072ab c1072ab, String str, boolean z, ArrayList arrayList) {
        if (!z) {
            c0384ay.f2283l = true;
            c0384ay.f2307J = false;
        }
        int intValue = c1072ab.m645b(str, "copyFrom", (Integer) 0).intValue();
        if (intValue != 0) {
            if (intValue - 1 >= arrayList.size()) {
                throw new RuntimeException("copyFrom: Leg/Arm copy target not loaded yet: " + intValue);
            }
            c0384ay.m3835a((C0384ay) arrayList.get(intValue - 1));
        }
        c0384ay.f2275d = c1072ab.m621i(str, "x");
        c0384ay.f2276e = c1072ab.m621i(str, "y");
        c0384ay.f2273b = str.replace("_", VariableScope.nullOrMissingString);
        c0384ay.f2274c = z;
        Float m661a = c1072ab.m661a(str, "attach_x", (Float) null);
        if (m661a != null) {
            c0384ay.f2281j = m661a.floatValue();
        }
        Float m661a2 = c1072ab.m661a(str, "attach_y", (Float) null);
        if (m661a2 != null) {
            c0384ay.f2282k = m661a2.floatValue();
        }
        c0384ay.f2277f = c1072ab.m661a(str, "liftingHeightOffset", Float.valueOf(c0384ay.f2277f)).floatValue();
        c0384ay.f2278g = c1072ab.m661a(str, "targetHeight", Float.valueOf(c0384ay.f2278g)).floatValue();
        c0384ay.f2279h = c1072ab.m663a(str, "targetHeightRelative", Boolean.valueOf(c0384ay.f2279h)).booleanValue();
        c0384ay.f2280i = c1072ab.m661a(str, "endDirOffset", Float.valueOf(0.0f)).floatValue();
        c0384ay.f2283l = c1072ab.m663a(str, "lockMovement", Boolean.valueOf(c0384ay.f2283l)).booleanValue();
        c0384ay.f2284m = c1072ab.m661a(str, "estimatingPositionMultiplier", Float.valueOf(c0384ay.f2284m)).floatValue();
        c0384ay.f2288q = c1072ab.m682a(c0453l, str, "hidden", c0384ay.f2288q);
        c0384ay.f2287p = c0384ay.f2288q == LogicBoolean.trueBoolean;
        c0384ay.f2289r = c1072ab.m661a(str, "alpha", Float.valueOf(c0384ay.f2289r)).floatValue();
        Float m661a3 = c1072ab.m661a(str, "moveSpeed", (Float) null);
        if (m661a3 != null) {
            c0384ay.f2290s = m661a3.floatValue();
        }
        c0384ay.f2291t = c1072ab.m646b(str, "moveWarmUp", Float.valueOf(c0384ay.f2291t)).floatValue();
        c0384ay.f2292u = c1072ab.m661a(str, "rotateSpeed", Float.valueOf(c0384ay.f2292u)).floatValue();
        Float m661a4 = c1072ab.m661a(str, "resetAngle", (Float) null);
        if (m661a4 != null) {
            c0384ay.f2294w = m661a4.floatValue();
        }
        boolean booleanValue = c1072ab.m663a(str, "image_end_teamColors", (Boolean) false).booleanValue();
        C0934e m3437a = c0453l.m3437a(c1072ab, str, "image_foot");
        if (m3437a != null) {
            c0384ay.f2299B = m3437a;
            if (booleanValue) {
                c0384ay.f2300C = c0453l.m3438a(c0384ay.f2299B, c0453l.f2956ab);
            } else {
                c0384ay.f2300C = null;
            }
        }
        C0934e m3437a2 = c0453l.m3437a(c1072ab, str, "image_end");
        if (m3437a2 != null) {
            c0384ay.f2299B = m3437a2;
            if (booleanValue) {
                c0384ay.f2300C = c0453l.m3438a(c0384ay.f2299B, c0453l.f2956ab);
            } else {
                c0384ay.f2300C = null;
            }
        }
        C0934e m3437a3 = c0453l.m3437a(c1072ab, str, "image_foot_shadow");
        if (m3437a3 != null) {
            c0384ay.f2301D = m3437a3;
        }
        C0934e m3437a4 = c0453l.m3437a(c1072ab, str, "image_end_shadow");
        if (m3437a4 != null) {
            c0384ay.f2301D = m3437a4;
        }
        C0934e m3437a5 = c0453l.m3437a(c1072ab, str, "image_leg");
        if (m3437a5 != null) {
            c0384ay.f2295x = m3437a5;
        }
        C0934e m3437a6 = c0453l.m3437a(c1072ab, str, "image_middle");
        if (m3437a6 != null) {
            c0384ay.f2295x = m3437a6;
        }
        boolean booleanValue2 = c1072ab.m663a(str, "image_middle_teamColors", (Boolean) false).booleanValue();
        if (c0384ay.f2295x != null && booleanValue2) {
            c0384ay.f2296y = c0453l.m3438a(c0384ay.f2295x, c0453l.f2956ab);
        } else {
            c0384ay.f2296y = null;
        }
        Float m661a5 = c1072ab.m661a(str, "heightSpeed", (Float) null);
        if (m661a5 != null) {
            c0384ay.f2293v = m661a5.floatValue();
        }
        Boolean m663a = c1072ab.m663a(str, "draw_foot_on_top", (Boolean) null);
        if (m663a != null) {
            c0384ay.f2305H = m663a.booleanValue();
        }
        Boolean m663a2 = c1072ab.m663a(str, "dust_effect", (Boolean) null);
        if (m663a2 != null) {
            c0384ay.f2306I = m663a2.booleanValue();
        }
        Boolean m663a3 = c1072ab.m663a(str, "drawLegWhenZoomedOut", (Boolean) null);
        if (m663a3 != null) {
            c0384ay.f2303F = m663a3.booleanValue();
            c0384ay.f2302E = true;
        }
        Boolean m663a4 = c1072ab.m663a(str, "drawFootWhenZoomedOut", (Boolean) null);
        if (m663a4 != null) {
            c0384ay.f2304G = m663a4.booleanValue();
            c0384ay.f2302E = true;
        }
        if (!c0384ay.f2302E && !c0384ay.f2283l && !c0384ay.f2313P) {
            if (c0453l.f3105cU < 30) {
                c0384ay.f2303F = false;
            }
            if (c0453l.f3105cU < 20) {
                c0384ay.f2304G = false;
            }
        }
        Boolean m663a5 = c1072ab.m663a(str, "explodeOnDeath", (Boolean) null);
        if (m663a5 != null) {
            c0384ay.f2307J = m663a5.booleanValue();
        }
        Float m661a6 = c1072ab.m661a(str, "holdDisMin", (Float) null);
        if (m661a6 != null) {
            c0384ay.f2308K = m661a6.floatValue();
        }
        c0384ay.f2309L = c1072ab.m645b(str, "holdDisMin_maxMovingLegs", Integer.valueOf(c0384ay.f2309L)).intValue();
        c0384ay.f2310M = c1072ab.m663a(str, "hold_moveOnlyIfFurthest", Boolean.valueOf(c0384ay.f2310M)).booleanValue();
        c0384ay.f2285n = c1072ab.m663a(str, "holdDisMin_checkNeighbours", Boolean.valueOf(c0384ay.f2285n)).booleanValue();
        c0384ay.f2286o = c1072ab.m663a(str, "favourOppositeSideNeighbours", Boolean.valueOf(c0384ay.f2286o)).booleanValue();
        Float m661a7 = c1072ab.m661a(str, "holdDisMax", (Float) null);
        if (m661a7 != null) {
            c0384ay.f2311N = m661a7.floatValue();
        }
        Float m661a8 = c1072ab.m661a(str, "hardLimit", (Float) null);
        if (m661a8 != null) {
            c0384ay.f2312O = m661a8.floatValue();
        }
        c0384ay.f2313P = c1072ab.m663a(str, "drawOverBody", Boolean.valueOf(c0384ay.f2313P)).booleanValue();
        if (c0384ay.f2313P) {
            c0453l.f2978ax = true;
        }
        c0384ay.f2314Q = c1072ab.m663a(str, "drawUnderAllUnits", Boolean.valueOf(c0384ay.f2314Q)).booleanValue();
        if (c0384ay.f2314Q) {
            c0453l.f2979ay = true;
        }
        if (c0384ay.f2314Q && c0384ay.f2313P) {
            throw new RuntimeException("Both drawUnderAllUnits and drawOverBody can not be set true at the same time in leg/arm");
        }
        c0384ay.f2315R = c1072ab.m661a(str, "drawDirOffset", Float.valueOf(c0384ay.f2315R)).floatValue();
        c0384ay.f2317T = c1072ab.m661a(str, "spinRate", Float.valueOf(c0384ay.f2317T)).floatValue();
    }
}
