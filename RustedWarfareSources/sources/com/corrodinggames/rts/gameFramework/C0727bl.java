package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.bl */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bl.class */
public final class C0727bl {

    /* renamed from: a */
    Core f4569a;

    /* renamed from: c */
    public static int f4571c = 40;

    /* renamed from: b */
    public int f4570b = 0;

    /* renamed from: d */
    public int f4572d = 0;

    /* renamed from: e */
    C0735bo f4573e = new C0735bo(this);

    /* renamed from: f */
    Paint f4574f = new Paint();

    /* renamed from: g */
    Rect f4575g = new Rect();

    /* renamed from: h */
    int f4576h = -1;

    public C0727bl(Core core) {
        this.f4569a = core;
    }

    /* renamed from: a */
    public static final long m2440a() {
        return System.nanoTime();
    }

    /* renamed from: a */
    public static final float m2438a(long j) {
        return ((float) (System.nanoTime() - j)) / 1000000.0f;
    }

    /* renamed from: a */
    public static final double m2437a(long j, long j2) {
        return (j2 - j) / 1000000.0d;
    }

    /* renamed from: a */
    public static final void m2435a(String str, long j) {
        Core.LogDebug2(str + VariableScope.nullOrMissingString + m2439a(m2438a(j)));
    }

    /* renamed from: a */
    public final void m2436a(EnumC0729bm enumC0729bm) {
    }

    /* renamed from: b */
    public final void m2431b(EnumC0729bm enumC0729bm) {
    }

    /* renamed from: a */
    public static final String m2439a(double d) {
        return VariableScope.nullOrMissingString + C0758f.m2213a(d, 3) + "ms";
    }

    /* renamed from: b */
    public static final String m2432b(double d) {
        return VariableScope.nullOrMissingString + (d / 1000000.0d) + "ms";
    }

    /* renamed from: b */
    public final void m2433b() {
    }

    /* renamed from: c */
    public final void m2430c() {
    }

    /* renamed from: a */
    public final void m2434a(boolean z, boolean z2) {
    }
}
