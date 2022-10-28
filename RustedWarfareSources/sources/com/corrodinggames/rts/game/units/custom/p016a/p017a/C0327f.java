package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0351ai;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/f.class */
public class C0327f extends AbstractC0321a {

    /* renamed from: a */
    C0351ai f1961a;

    /* renamed from: b */
    C0351ai f1962b;

    /* renamed from: c */
    C0351ai f1963c;

    /* renamed from: d */
    C0351ai f1964d;

    /* renamed from: e */
    C0351ai f1965e;

    /* renamed from: f */
    C0351ai f1966f;

    /* renamed from: g */
    static final Pattern f1967g = Pattern.compile("%\\{([^\\]]*?)\\}");

    /* renamed from: a */
    public static void m3980a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0351ai m3918a = C0348af.m3918a(c0453l, c1072ab, str, "showMessageToPlayer", (String) null);
        C0351ai m3918a2 = C0348af.m3918a(c0453l, c1072ab, str, "showMessageToAllPlayers", (String) null);
        C0351ai m3918a3 = C0348af.m3918a(c0453l, c1072ab, str, "showMessageToAllEnemyPlayers", (String) null);
        C0351ai m3918a4 = C0348af.m3918a(c0453l, c1072ab, str, "showQuickWarLogToPlayer", (String) null);
        C0351ai m3918a5 = C0348af.m3918a(c0453l, c1072ab, str, "showQuickWarLogToAllPlayers", (String) null);
        C0351ai m3918a6 = C0348af.m3918a(c0453l, c1072ab, str, "debugMessage", (String) null);
        if (m3918a != null || m3918a2 != null || m3918a3 != null || m3918a4 != null || m3918a5 != null || m3918a6 != null) {
            C0327f c0327f = new C0327f();
            c0327f.f1961a = m3918a;
            c0327f.f1962b = m3918a2;
            c0327f.f1963c = m3918a3;
            c0327f.f1964d = m3918a4;
            c0327f.f1965e = m3918a5;
            c0327f.f1966f = m3918a6;
            c0339d.f2101ab.add(c0327f);
        }
    }

    /* renamed from: a */
    public String m3981a(C0451j c0451j, String str) {
        if (str == null) {
            str = null;
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (this.f1961a != null && c0451j.f1609bV == m1071A.f6139bs) {
            C0831ad.m1538a((String) null, m3981a(c0451j, this.f1961a.m3863b(c0451j)));
        }
        if (this.f1962b != null) {
            C0831ad.m1538a((String) null, m3981a(c0451j, this.f1962b.m3863b(c0451j)));
        }
        if (this.f1963c != null && m1071A.f6139bs != null && c0451j.f1609bV.m4276c(m1071A.f6139bs)) {
            C0831ad.m1538a((String) null, m3981a(c0451j, this.f1963c.m3863b(c0451j)));
        }
        if (this.f1964d != null && c0451j.f1609bV == m1071A.f6139bs) {
            m1071A.f6165bS.f5116f.m1894a(m3981a(c0451j, this.f1964d.m3863b(c0451j)));
        }
        if (this.f1965e != null) {
            m1071A.f6165bS.f5116f.m1894a(m3981a(c0451j, this.f1965e.m3863b(c0451j)));
        }
        if (this.f1966f != null && m1071A.f6142bv && m1071A.f6132bl) {
            C0831ad.m1538a((String) null, c0451j.mo1708r().mo3403i() + "(" + c0451j.f6951ee + ") Debug: " + m3981a(c0451j, this.f1966f.m3863b(c0451j)));
            return true;
        }
        return true;
    }
}
