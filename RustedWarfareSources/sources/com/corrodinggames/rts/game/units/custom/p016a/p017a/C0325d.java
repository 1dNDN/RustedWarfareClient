package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0457o;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/d.class */
public class C0325d extends AbstractC0321a {

    /* renamed from: a */
    boolean f1948a;

    /* renamed from: b */
    boolean f1949b;

    /* renamed from: c */
    C0457o f1950c;

    /* renamed from: d */
    C0457o f1951d;

    /* renamed from: e */
    boolean f1952e;

    /* renamed from: f */
    int f1953f = Integer.MIN_VALUE;

    /* renamed from: g */
    int f1954g = Integer.MIN_VALUE;

    /* renamed from: a */
    public static void m3983a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m663a(str, str2 + "finishPlayingLastAnimation", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1072ab.m663a(str, str2 + "stopLastAnimation", (Boolean) false).booleanValue();
        C0457o m3433a = c0453l.m3433a(c1072ab.m644b(str, str2 + "playAnimation", (String) null), (C0457o) null);
        C0457o m3433a2 = c0453l.m3433a(c1072ab.m644b(str, str2 + "playAnimationIfNotPlaying", (String) null), (C0457o) null);
        if (m3433a != null && m3433a2 != null) {
            throw new RuntimeException("Cannot use playAnimation and playAnimationIfNotPlaying at same time");
        }
        if (booleanValue2 && booleanValue) {
            throw new RuntimeException("Cannot use stopLastAnimation and finishPlayingLastAnimation at same time");
        }
        if (m3433a != null || m3433a2 != null || booleanValue || booleanValue2) {
            C0325d c0325d = new C0325d();
            c0325d.f1948a = booleanValue;
            c0325d.f1949b = booleanValue2;
            c0325d.f1950c = m3433a;
            c0325d.f1951d = m3433a2;
            c0325d.f1952e = c1072ab.m663a(str, str2 + "playAnimation_lowPriority", (Boolean) false).booleanValue();
            c0339d.f2101ab.add(c0325d);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f1948a) {
            c0451j.f2841b.m3675b();
        }
        if (this.f1949b) {
            c0451j.f2841b.m3681a();
        }
        if (this.f1950c != null) {
            int i2 = 15;
            if (this.f1952e) {
                i2 = 4;
            }
            c0451j.f2841b.m3677a(this.f1950c.m3370b(), i2, true);
        }
        if (this.f1951d != null) {
            int i3 = 15;
            if (this.f1952e) {
                i3 = 4;
            }
            if (!c0451j.f2841b.m3679a(this.f1951d.m3370b())) {
                c0451j.f2841b.m3677a(this.f1951d.m3370b(), i3, true);
                return true;
            }
            return true;
        }
        return true;
    }
}
