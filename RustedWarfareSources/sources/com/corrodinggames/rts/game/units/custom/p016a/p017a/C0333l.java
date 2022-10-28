package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/l.class */
public class C0333l extends AbstractC0321a {

    /* renamed from: a */
    boolean f1997a;

    /* renamed from: b */
    C0449h f1998b;

    /* renamed from: c */
    C0449h f1999c;

    /* renamed from: d */
    C0449h f2000d;

    /* renamed from: e */
    C0449h f2001e;

    /* renamed from: a */
    public static void m3974a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1072ab.m663a(str, str2 + "resetToDefaultTags", (Boolean) false).booleanValue();
        C0449h m683a = c1072ab.m683a(c0453l, str, str2 + "temporarilyAddTags", (C0449h) null);
        C0449h m683a2 = c1072ab.m683a(c0453l, str, str2 + "temporarilyRemoveTags", (C0449h) null);
        if (booleanValue || m683a != null || m683a2 != null) {
            C0333l c0333l = new C0333l();
            c0333l.f1997a = booleanValue;
            c0333l.f1998b = m683a;
            c0333l.f1999c = m683a2;
            c0339d.f2101ab.add(c0333l);
        }
        C0449h m683a3 = c1072ab.m683a(c0453l, str, str2 + "addGlobalTeamTags", (C0449h) null);
        C0449h m683a4 = c1072ab.m683a(c0453l, str, str2 + "removeGlobalTeamTags", (C0449h) null);
        if (m683a3 != null || m683a4 != null) {
            C0333l c0333l2 = new C0333l();
            c0333l2.f2000d = m683a3;
            c0333l2.f2001e = m683a4;
            c0339d.f2101ab.add(c0333l2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f1997a) {
            c0451j.m3465j(false);
        }
        if (this.f1999c != null) {
            c0451j.m3523b(this.f1999c);
        }
        if (this.f1998b != null) {
            c0451j.m3533a(this.f1998b);
        }
        if (this.f2000d != null) {
            c0451j.f1609bV.m4288b(this.f2000d);
        }
        if (this.f2001e != null) {
            c0451j.f1609bV.m4272c(this.f2001e);
            return true;
        }
        return true;
    }
}
