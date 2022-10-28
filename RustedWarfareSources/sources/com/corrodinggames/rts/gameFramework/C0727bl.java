package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.bl */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bl.class */
public final class C0727bl {

    /* renamed from: a */
    LoggerMaybe f4569a;

    /* renamed from: c */
    public static int f4570c = 40;

    /* renamed from: b */
    public int f4571b = 0;

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

    public C0727bl(LoggerMaybe loggerMaybe) {
        this.f4569a = loggerMaybe;
    }

    /* renamed from: a */
    public static final long m2390a() {
        return System.nanoTime();
    }

    /* renamed from: a */
    public static final float m2388a(long j) {
        return ((float) (System.nanoTime() - j)) / 1000000.0f;
    }

    /* renamed from: a */
    public static final double m2387a(long j, long j2) {
        return (j2 - j) / 1000000.0d;
    }

    /* renamed from: a */
    public static final void m2385a(String str, long j) {
        LoggerMaybe.LogDebug2(str + VariableScope.nullOrMissingString + m2389a(m2388a(j)));
    }

    /* renamed from: a */
    public final void m2386a(EnumC0729bm enumC0729bm) {
    }

    /* renamed from: b */
    public final void m2381b(EnumC0729bm enumC0729bm) {
    }

    /* renamed from: a */
    public static final String m2389a(double d) {
        return VariableScope.nullOrMissingString + C0758f.m2164a(d, 3) + "ms";
    }

    /* renamed from: b */
    public static final String m2382b(double d) {
        return VariableScope.nullOrMissingString + (d / 1000000.0d) + "ms";
    }

    /* renamed from: b */
    public final void m2383b() {
    }

    /* renamed from: c */
    public final void m2380c() {
    }

    /* renamed from: a */
    public final void m2384a(boolean z, boolean z2) {
    }
}
