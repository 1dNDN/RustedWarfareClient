package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/d.class */
public class C0390d implements Comparable {

    /* renamed from: b */
    boolean f2339b;

    /* renamed from: c */
    boolean f2340c;

    /* renamed from: d */
    boolean f2341d;

    /* renamed from: e */
    boolean f2342e;

    /* renamed from: f */
    boolean f2343f;

    /* renamed from: h */
    boolean f2345h;

    /* renamed from: i */
    public float f2346i;

    /* renamed from: j */
    public boolean f2347j;

    /* renamed from: k */
    public boolean f2348k;

    /* renamed from: l */
    public boolean f2349l;

    /* renamed from: m */
    public boolean f2350m;

    /* renamed from: p */
    public boolean f2353p;

    /* renamed from: q */
    public LogicBoolean f2354q;

    /* renamed from: r */
    public LogicBoolean f2355r;

    /* renamed from: s */
    public LogicBoolean f2356s;

    /* renamed from: t */
    public boolean f2357t;

    /* renamed from: u */
    public C0391e f2358u;

    /* renamed from: v */
    public C0391e[] f2359v;

    /* renamed from: w */
    public float f2360w;

    /* renamed from: x */
    public int f2361x;

    /* renamed from: y */
    public boolean f2362y;

    /* renamed from: z */
    LogicBoolean f2363z;

    /* renamed from: A */
    LogicBoolean f2364A;

    /* renamed from: B */
    public C0934e f2365B;

    /* renamed from: C */
    public float f2366C;

    /* renamed from: D */
    public float f2367D;

    /* renamed from: E */
    public LogicBoolean f2368E;

    /* renamed from: F */
    public EnumC0392f f2369F;

    /* renamed from: G */
    public float f2370G;

    /* renamed from: H */
    public boolean f2371H;

    /* renamed from: L */
    public boolean f2375L;

    /* renamed from: M */
    public LogicBoolean f2376M;

    /* renamed from: N */
    public int f2377N;

    /* renamed from: O */
    public int f2378O;

    /* renamed from: P */
    public float f2379P;

    /* renamed from: Q */
    public float f2380Q;

    /* renamed from: R */
    public float f2381R;

    /* renamed from: S */
    public float f2382S;

    /* renamed from: T */
    public float f2383T;

    /* renamed from: U */
    public float f2384U;

    /* renamed from: V */
    public LogicBoolean f2385V;

    /* renamed from: W */
    public LogicBoolean f2386W;

    /* renamed from: X */
    public boolean f2387X;

    /* renamed from: Y */
    public boolean f2388Y;

    /* renamed from: Z */
    public float f2389Z;

    /* renamed from: aa */
    public float f2390aa;

    /* renamed from: ab */
    public LogicBoolean f2391ab;

    /* renamed from: ac */
    public LogicBoolean f2392ac;

    /* renamed from: ae */
    public boolean f2394ae;

    /* renamed from: ag */
    public C0930ag f2396ag;

    /* renamed from: ah */
    public LogicBoolean f2397ah;

    /* renamed from: a */
    boolean f2338a = false;

    /* renamed from: g */
    EnumC0200q f2344g = EnumC0200q.any;

    /* renamed from: n */
    public int f2351n = -1;

    /* renamed from: o */
    public float f2352o = 1.0f;

    /* renamed from: I */
    public int f2372I = -1;

    /* renamed from: J */
    public int f2373J = -1;

    /* renamed from: K */
    public int f2374K = -1;

    /* renamed from: ad */
    public int f2393ad = -1;

    /* renamed from: af */
    public int f2395af = -1;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C0390d c0390d) {
        if (c0390d == null) {
            return 0;
        }
        float f = this.f2370G - c0390d.f2370G;
        if (f < 0.0f) {
            return -1;
        }
        return f > 0.0f ? 1 : 0;
    }
}
