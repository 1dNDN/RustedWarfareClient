package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.be */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/be.class */
public final class C0404be {

    /* renamed from: a */
    String f2498a;

    /* renamed from: b */
    C0448g f2499b;

    /* renamed from: c */
    C0449h f2500c;

    /* renamed from: d */
    EnumC0200q f2501d;

    /* renamed from: e */
    float f2502e;

    /* renamed from: f */
    float f2503f;

    /* renamed from: g */
    float f2504g;

    /* renamed from: h */
    float f2505h;

    /* renamed from: i */
    boolean f2506i;

    /* renamed from: j */
    boolean f2507j;

    /* renamed from: k */
    int f2508k;

    /* renamed from: l */
    int f2509l;

    /* renamed from: m */
    boolean f2510m;

    /* renamed from: n */
    boolean f2511n;

    /* renamed from: o */
    C0385az f2512o;

    /* renamed from: p */
    boolean f2513p;

    /* renamed from: a */
    public boolean m3787a() {
        return this.f2511n || this.f2510m;
    }

    /* renamed from: a */
    public void m3786a(C0453l c0453l, C1072ab c1072ab, String str) {
        this.f2499b = c1072ab.m665a(str, "anyRuleInGroup", (C0448g) null);
        this.f2500c = c1072ab.m683a(c0453l, str, "searchTags", (C0449h) null);
        this.f2501d = (EnumC0200q) c1072ab.m662a(str, "searchTeam", EnumC0200q.own, EnumC0200q.class);
        this.f2502e = c1072ab.m621i(str, "searchDistance");
        this.f2503f = this.f2502e * this.f2502e;
        this.f2504g = c1072ab.m661a(str, "searchOffsetX", Float.valueOf(0.0f)).floatValue();
        this.f2505h = c1072ab.m661a(str, "searchOffsetY", Float.valueOf(0.0f)).floatValue();
        this.f2506i = c1072ab.m663a(str, "excludeIncompleteBuildings", (Boolean) false).booleanValue();
        this.f2507j = c1072ab.m663a(str, "excludeNonBuildings", (Boolean) false).booleanValue();
        this.f2508k = c1072ab.m645b(str, "minCount", (Integer) Integer.MIN_VALUE).intValue();
        this.f2509l = c1072ab.m645b(str, "maxCount", (Integer) Integer.MAX_VALUE).intValue();
        this.f2513p = c1072ab.m663a(str, "checkEachTile", (Boolean) true).booleanValue();
        this.f2510m = c1072ab.m663a(str, "aiSuggestionOnly", (Boolean) false).booleanValue();
        this.f2511n = c1072ab.m663a(str, "blocksPlacement", Boolean.valueOf(!this.f2510m)).booleanValue();
        if (this.f2510m && this.f2511n) {
            throw new C0412bm("[" + str + "]: Cannot use aiSuggestionOnly and blocksPlacement at the same time");
        }
        this.f2512o = C0348af.m3911a(c1072ab, str, "cannotPlaceMessage", (String) null);
    }
}
