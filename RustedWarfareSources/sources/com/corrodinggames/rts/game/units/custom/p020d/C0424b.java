package com.corrodinggames.rts.game.units.custom.p020d;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/b.class */
public class C0424b extends AbstractC0423a implements Comparable {

    /* renamed from: b */
    public int f2699b;

    /* renamed from: c */
    public float f2700c;

    /* renamed from: d */
    public float f2701d;

    /* renamed from: e */
    public float f2702e;

    /* renamed from: f */
    public int f2703f;

    /* renamed from: g */
    public int f2704g;

    /* renamed from: h */
    public int f2705h;

    /* renamed from: i */
    public int f2706i;

    /* renamed from: j */
    public int f2707j;

    /* renamed from: k */
    public C0439f f2708k = f2709m;

    /* renamed from: m */
    private static final C0439f f2709m = new C0439f().m3821a();

    /* renamed from: a */
    public static final C0424b f2710a = m3918a(0);

    /* renamed from: l */
    static final int f2711l = Color.m5435a(255, 0, 100, 0);

    /* renamed from: a */
    public int m3919a() {
        return this.f2699b;
    }

    /* renamed from: a */
    public static C0424b m3909a(C0424b c0424b, C0424b c0424b2) {
        C0424b c0424b3 = new C0424b();
        c0424b3.f2699b = c0424b.f2699b + c0424b2.f2699b;
        c0424b3.f2700c = c0424b.f2700c + c0424b2.f2700c;
        c0424b3.f2701d = c0424b.f2701d + c0424b2.f2701d;
        c0424b3.f2702e = c0424b.f2702e + c0424b2.f2702e;
        c0424b3.f2703f = c0424b.f2703f + c0424b2.f2703f;
        if (!c0424b.f2708k.m3792c() || !c0424b2.f2708k.m3792c()) {
            c0424b3.f2708k = C0439f.m3807a(c0424b.f2708k, c0424b2.f2708k);
        }
        return c0424b3;
    }

    /* renamed from: a */
    public static C0424b m3910a(C0424b c0424b, float f) {
        C0424b c0424b2 = new C0424b();
        c0424b2.f2699b = (int) (c0424b.f2699b * f);
        c0424b2.f2700c = c0424b.f2700c * f;
        c0424b2.f2701d = c0424b.f2701d * f;
        c0424b2.f2702e = c0424b.f2702e * f;
        c0424b2.f2703f = (int) (c0424b.f2703f * f);
        if (!c0424b.f2708k.m3792c()) {
            c0424b2.f2708k = C0439f.m3797b(c0424b.f2708k, f);
        }
        return c0424b2;
    }

    /* renamed from: a */
    public static C0424b m3918a(int i) {
        C0424b c0424b = new C0424b();
        c0424b.f2699b = i;
        return c0424b;
    }

    /* renamed from: a */
    public static C0424b m3907a(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        String m644b = c1072ab.m644b(str, str2, (String) null);
        if (m644b == null && !z) {
            throw new RuntimeException("Could not find " + str2 + " in configuration file under:" + str);
        }
        try {
            return m3892b(c0453l, m644b);
        } catch (C0412bm e) {
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static C0424b m3908a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0424b c0424b) {
        String m644b = c1072ab.m644b(str, str2, (String) null);
        if (m644b == null) {
            return c0424b;
        }
        try {
            return m3892b(c0453l, m644b);
        } catch (C0412bm e) {
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static C0424b m3893b(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0424b c0424b) {
        String m644b = c1072ab.m644b(str, str2, (String) null);
        if (m644b == null) {
            return c0424b;
        }
        try {
            return m3906a(c0453l, m644b);
        } catch (C0412bm e) {
            throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m3898b(int i) {
        if (i < 0 || i > 31) {
            throw new C0412bm("Flag id must be between 0-31 (is:" + i + ")");
        }
    }

    /* renamed from: a */
    public static int m3916a(int i, String str) {
        if (str.contains("-")) {
            String[] m2078c = C0758f.m2078c(str, '-');
            if (m2078c.length != 2) {
                throw new C0412bm("Unexpected flag id: " + str);
            }
            int parseInt = Integer.parseInt(m2078c[0]);
            int parseInt2 = Integer.parseInt(m2078c[1]);
            m3898b(parseInt);
            m3898b(parseInt2);
            if (parseInt2 < parseInt) {
                throw new C0412bm("end<start in flag id: " + str);
            }
            for (int i2 = parseInt; i2 <= parseInt2; i2++) {
                i |= 1 << i2;
            }
            return i;
        }
        int parseInt3 = Integer.parseInt(str);
        m3898b(parseInt3);
        return i | (1 << parseInt3);
    }

    /* renamed from: a */
    public static C0424b m3906a(C0453l c0453l, String str) {
        C0424b m3892b = m3892b(c0453l, str);
        if (m3892b != null && m3892b.f2703f != 0) {
            throw new C0412bm("Ammo not supported on streaming price:" + str);
        }
        return m3892b;
    }

    /* renamed from: b */
    public static C0424b m3892b(C0453l c0453l, String str) {
        String trim;
        String trim2;
        if (str == null) {
            return f2710a;
        }
        C0424b c0424b = new C0424b();
        for (String str2 : str.split(",|\\|")) {
            String trim3 = str2.trim();
            if (!trim3.equals(VariableScope.nullOrMissingString)) {
                String[] split = trim3.split("=|:");
                if (split.length == 1) {
                    trim = "credits";
                    trim2 = split[0];
                } else if (split.length == 2) {
                    trim = split[0].trim();
                    trim2 = split[1].trim();
                } else {
                    throw new C0412bm("Unknown price format:" + str);
                }
                try {
                    if (trim.equals("credits")) {
                        c0424b.f2699b = Integer.parseInt(trim2);
                    } else if (trim.equals("energy")) {
                        c0424b.f2700c = Float.parseFloat(trim2);
                    } else if (trim.equals("hp")) {
                        c0424b.f2701d = Float.parseFloat(trim2);
                    } else if (trim.equals("shield")) {
                        c0424b.f2702e = Float.parseFloat(trim2);
                    } else if (trim.equals("ammo")) {
                        c0424b.f2703f = Integer.parseInt(trim2);
                    } else if (trim.equals("hasFlag")) {
                        c0424b.f2706i = m3916a(c0424b.f2706i, trim2);
                    } else if (trim.equals("hasMissingFlag")) {
                        c0424b.f2707j = m3916a(c0424b.f2707j, trim2);
                    } else if (trim.equals("setFlag")) {
                        c0424b.f2704g = m3916a(c0424b.f2704g, trim2);
                    } else if (trim.equals("unsetFlag")) {
                        c0424b.f2705h = m3916a(c0424b.f2705h, trim2);
                    } else {
                        C0428a m3501k = c0453l.m3501k(trim);
                        if (m3501k != null) {
                            float parseFloat = Float.parseFloat(trim2);
                            if (c0424b.f2708k == f2709m) {
                                c0424b.f2708k = new C0439f();
                            }
                            c0424b.f2708k.m3814a(m3501k, parseFloat);
                        } else {
                            throw new C0412bm("Unknown price type:" + trim);
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    String str3 = "Bad price number:" + trim2 + " in " + str;
                    if (0 != 0) {
                        str3 = str3 + " (Hint: A whole number was expected)";
                    }
                    throw new C0412bm(str3);
                }
            }
        }
        if (c0424b.f2708k != f2709m) {
            c0424b.f2708k.m3821a();
        }
        if (!c0424b.m3889c()) {
            return f2710a;
        }
        return c0424b;
    }

    /* renamed from: a */
    public int m3912a(AbstractC0244am abstractC0244am, boolean z) {
        int i = 9999;
        if (!z && this.f2699b > 0) {
            i = C0758f.m2080c(9999, (int) (abstractC0244am.f1609bV.f1310o / this.f2699b));
        }
        if (this.f2700c > 0.0f) {
            i = C0758f.m2080c(i, (int) (abstractC0244am.f1639cz / this.f2700c));
        }
        if (this.f2701d > 0.0f) {
            i = C0758f.m2080c(i, (int) (abstractC0244am.f1632cs / this.f2701d));
        }
        if (this.f2702e > 0.0f) {
            i = C0758f.m2080c(i, (int) (abstractC0244am.f1635cv / this.f2702e));
        }
        if (this.f2703f > 0) {
            i = C0758f.m2080c(i, abstractC0244am.f1642cC / this.f2703f);
        }
        if (!this.f2708k.m3792c()) {
            i = C0758f.m2080c(i, C0439f.m3810a(this.f2708k, abstractC0244am));
        }
        if (!m3879f(abstractC0244am)) {
            i = 0;
        }
        return i;
    }

    /* renamed from: b */
    public boolean mo3867b(AbstractC0244am abstractC0244am, double d) {
        if (this.f2699b > 0 && !abstractC0244am.f1609bV.m4639a(this.f2699b * d)) {
            return false;
        }
        if (this.f2700c > 0.0f && abstractC0244am.f1639cz < this.f2700c * d) {
            return false;
        }
        if (this.f2701d > 0.0f && abstractC0244am.f1632cs < this.f2701d * d) {
            return false;
        }
        if (this.f2702e > 0.0f && abstractC0244am.f1635cv < this.f2702e * d) {
            return false;
        }
        if ((this.f2703f > 0 && abstractC0244am.f1642cC < this.f2703f * d) || !m3879f(abstractC0244am)) {
            return false;
        }
        if (!this.f2708k.m3792c() && !C0439f.m3809a(this.f2708k, abstractC0244am, d)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo3868b(AbstractC0244am abstractC0244am) {
        if (this.f2699b > 0 && !abstractC0244am.f1609bV.m4639a(this.f2699b)) {
            return false;
        }
        if (this.f2700c > 0.0f && abstractC0244am.f1639cz < this.f2700c) {
            return false;
        }
        if (this.f2701d > 0.0f && abstractC0244am.f1632cs < this.f2701d) {
            return false;
        }
        if (this.f2702e > 0.0f && abstractC0244am.f1635cv < this.f2702e) {
            return false;
        }
        if ((this.f2703f > 0 && abstractC0244am.f1642cC < this.f2703f) || !m3879f(abstractC0244am)) {
            return false;
        }
        if (!this.f2708k.m3792c() && !C0439f.m3795b(this.f2708k, abstractC0244am)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m3913a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        boolean z = false;
        if (!this.f2708k.m3792c() && C0439f.m3808a(this.f2708k, abstractC0244am, abstractC0244am2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public static void m3883d(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1639cz < 0.0f) {
            abstractC0244am.f1639cz = 0.0f;
        }
        if (abstractC0244am.f1639cz > abstractC0244am.mo3294bd()) {
            abstractC0244am.f1639cz = abstractC0244am.mo3294bd();
        }
        if (abstractC0244am.f1635cv < 0.0f) {
            abstractC0244am.f1635cv = 0.0f;
        }
        if (abstractC0244am.f1635cv > abstractC0244am.f1638cy) {
            abstractC0244am.f1635cv = abstractC0244am.f1638cy;
        }
        if (abstractC0244am.f1632cs > abstractC0244am.f1633ct) {
            abstractC0244am.f1632cs = abstractC0244am.f1633ct;
        }
        if (abstractC0244am.f1642cC < 0) {
            abstractC0244am.f1642cC = 0;
        }
    }

    /* renamed from: e */
    public void m3881e(AbstractC0244am abstractC0244am) {
        if (this.f2705h != 0) {
            abstractC0244am.f1643cD &= this.f2705h ^ (-1);
        }
        if (this.f2704g != 0) {
            abstractC0244am.f1643cD |= this.f2704g;
        }
    }

    /* renamed from: c */
    public int m3888c(int i) {
        if (this.f2705h != 0) {
            i &= this.f2705h ^ (-1);
        }
        if (this.f2704g != 0) {
            i |= this.f2704g;
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m3917a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* renamed from: f */
    public boolean m3879f(AbstractC0244am abstractC0244am) {
        if (this.f2706i != 0 && !m3897b(abstractC0244am.f1643cD, this.f2706i)) {
            return false;
        }
        if (this.f2707j != 0 && m3887c(abstractC0244am.f1643cD, this.f2707j)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m3897b(int i, int i2) {
        return (i2 & i) == i2;
    }

    /* renamed from: c */
    public static boolean m3887c(int i, int i2) {
        return (i2 & i) != 0;
    }

    /* renamed from: a */
    public void mo3874a(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1609bV.f1310o -= this.f2699b;
        abstractC0244am.f1639cz -= this.f2700c;
        abstractC0244am.f1632cs -= this.f2701d;
        abstractC0244am.f1635cv -= this.f2702e;
        abstractC0244am.f1642cC -= this.f2703f;
        m3881e(abstractC0244am);
        if (!this.f2708k.m3792c()) {
            C0439f.m3788c(this.f2708k, abstractC0244am);
        }
        m3883d(abstractC0244am);
    }

    /* renamed from: a */
    public void mo3873a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1609bV.f1310o -= this.f2699b * d;
        abstractC0244am.f1639cz = (float) (abstractC0244am.f1639cz - (this.f2700c * d));
        abstractC0244am.f1632cs = (float) (abstractC0244am.f1632cs - (this.f2701d * d));
        abstractC0244am.f1635cv = (float) (abstractC0244am.f1635cv - (this.f2702e * d));
        abstractC0244am.f1642cC = (int) (abstractC0244am.f1642cC - (this.f2703f * d));
        m3881e(abstractC0244am);
        if (!this.f2708k.m3792c()) {
            C0439f.m3794b(this.f2708k, abstractC0244am, d);
        }
        m3883d(abstractC0244am);
    }

    /* renamed from: g */
    public void m3878g(AbstractC0244am abstractC0244am) {
        if (this.f2699b > 0) {
            abstractC0244am.f1609bV.m4618b(this.f2699b);
        } else {
            abstractC0244am.f1609bV.f1310o += this.f2699b;
        }
        abstractC0244am.f1639cz += this.f2700c;
        abstractC0244am.f1632cs += this.f2701d;
        abstractC0244am.f1635cv += this.f2702e;
        abstractC0244am.f1642cC += this.f2703f;
        m3881e(abstractC0244am);
        if (!this.f2708k.m3792c()) {
            C0439f.m3783d(this.f2708k, abstractC0244am);
        }
        m3883d(abstractC0244am);
    }

    /* renamed from: h */
    public void m3877h(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1609bV.f1310o += this.f2699b;
        abstractC0244am.f1639cz += this.f2700c;
        abstractC0244am.f1632cs += this.f2701d;
        abstractC0244am.f1635cv += this.f2702e;
        abstractC0244am.f1642cC += this.f2703f;
        m3881e(abstractC0244am);
        if (!this.f2708k.m3792c()) {
            C0439f.m3783d(this.f2708k, abstractC0244am);
        }
        m3883d(abstractC0244am);
    }

    /* renamed from: a */
    public void m3915a(AbstractC0244am abstractC0244am, double d, boolean z) {
        if (z) {
            abstractC0244am.f1609bV.f1310o += this.f2699b * d;
        }
        abstractC0244am.f1639cz = (float) (abstractC0244am.f1639cz + (this.f2700c * d));
        abstractC0244am.f1632cs = (float) (abstractC0244am.f1632cs + (this.f2701d * d));
        abstractC0244am.f1635cv = (float) (abstractC0244am.f1635cv + (this.f2702e * d));
        abstractC0244am.f1642cC = (int) (abstractC0244am.f1642cC + (this.f2703f * d));
        m3881e(abstractC0244am);
        if (!this.f2708k.m3792c()) {
            C0439f.m3787c(this.f2708k, abstractC0244am, d);
        }
        m3883d(abstractC0244am);
    }

    /* renamed from: b */
    public boolean m3899b() {
        if (this == f2710a) {
            return true;
        }
        if (this.f2699b != 0 || this.f2700c != 0.0f || this.f2701d != 0.0f || this.f2702e != 0.0f || this.f2703f != 0 || !this.f2708k.m3792c()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m3889c() {
        if (this == f2710a) {
            return false;
        }
        if (this.f2699b != 0 || this.f2700c != 0.0f || this.f2701d != 0.0f || this.f2702e != 0.0f || this.f2703f != 0 || this.f2704g != 0 || this.f2705h != 0 || this.f2706i != 0 || this.f2707j != 0 || !this.f2708k.m3792c()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m3884d() {
        if (this == f2710a) {
            return false;
        }
        if (this.f2699b != 0 || this.f2700c != 0.0f || this.f2701d != 0.0f || this.f2702e != 0.0f || this.f2703f != 0 || this.f2704g != 0 || this.f2705h != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String m3900a(boolean z, boolean z2, int i, boolean z3) {
        C0813u c0813u = new C0813u();
        m3905a(c0813u, z, z2, i, z3);
        return c0813u.m1711a();
    }

    /* renamed from: a */
    public void m3904a(C0813u c0813u, boolean z, boolean z2, int i, boolean z3, AbstractC0244am abstractC0244am, int i2) {
        m3891b(c0813u, z, z2, i, z3, abstractC0244am, i2);
    }

    /* renamed from: a */
    private void m3905a(C0813u c0813u, boolean z, boolean z2, int i, boolean z3) {
        m3891b(c0813u, z, z2, i, z3, null, 0);
    }

    /* renamed from: b */
    private void m3891b(C0813u c0813u, boolean z, boolean z2, int i, boolean z3, AbstractC0244am abstractC0244am, int i2) {
        String str;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i3 = 0;
        if (this.f2699b > 0 && 0 < i) {
            int i4 = f2711l;
            if (abstractC0244am != null && abstractC0244am.f1609bV.f1310o < this.f2699b) {
                i4 = i2;
            }
            c0813u.m1705a("$" + this.f2699b + str, i4);
            i3 = 0 + 1;
        }
        if (z2) {
            if (this.f2700c > 0.0f && i3 < i) {
                c0813u.m1700b(C0758f.m2057f(this.f2700c) + " energy" + str);
                i3++;
            }
            if (this.f2701d > 0.0f && i3 < i) {
                c0813u.m1700b(C0758f.m2057f(this.f2701d) + " hp" + str);
                i3++;
            }
            if (this.f2702e > 0.0f && i3 < i) {
                c0813u.m1700b(C0758f.m2057f(this.f2702e) + " shield" + str);
                i3++;
            }
            if (this.f2703f > 0 && i3 < i) {
                c0813u.m1700b(C0758f.m2057f(this.f2703f) + " ammo" + str);
                i3++;
            }
        }
        if (!this.f2708k.m3792c()) {
            this.f2708k.m3806a(c0813u, z, z2, i - i3, z3, false, abstractC0244am, i2);
        }
        c0813u.m1706a(str);
    }

    /* renamed from: i */
    public C0424b m3876i(AbstractC0244am abstractC0244am) {
        C0424b c0424b = new C0424b();
        if (this.f2699b > 0 && abstractC0244am.f1609bV.f1310o < this.f2699b) {
            c0424b.f2699b = this.f2699b - ((int) abstractC0244am.f1609bV.f1310o);
        }
        if (!this.f2708k.m3792c()) {
            c0424b.f2708k = this.f2708k.m3819a(abstractC0244am);
        }
        return c0424b;
    }

    /* renamed from: a */
    public String m3914a(AbstractC0244am abstractC0244am, int i, boolean z) {
        String m3818a;
        String str = null;
        if (this.f2699b > 0 && 0 < i && abstractC0244am.f1609bV.f1310o < this.f2699b) {
            if (0 == 0) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + "credits, ";
            int i2 = 0 + 1;
        }
        if (!this.f2708k.m3792c() && (m3818a = this.f2708k.m3818a(abstractC0244am, ", ", i, z)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + m3818a;
        }
        if (str != null) {
            return C0758f.m2122a(str, ", ");
        }
        return null;
    }

    /* renamed from: a */
    public int compareTo(C0424b c0424b) {
        return this.f2699b - c0424b.f2699b;
    }

    /* renamed from: a */
    public static void m3902a(StreamWriter streamWriter, C0424b c0424b) {
        streamWriter.mo1314a(c0424b != null);
        if (c0424b != null) {
            c0424b.m3903a(streamWriter);
        }
    }

    /* renamed from: a */
    public void m3903a(StreamWriter streamWriter) {
        boolean z = false;
        boolean z2 = false;
        if (this.f2700c != 0.0f || this.f2701d != 0.0f || this.f2702e != 0.0f || this.f2703f != 0) {
            z = true;
        }
        if (this.f2704g != 0 || this.f2705h != 0 || this.f2706i != 0 || this.f2707j != 0) {
            z = true;
        }
        if (!this.f2708k.m3792c()) {
            z2 = true;
        }
        byte b = 0;
        if (z) {
            b = (byte) (0 | 1);
        }
        if (z2) {
            b = (byte) (b | 2);
        }
        streamWriter.mo1355c(b);
        streamWriter.WriteInteger(this.f2699b);
        if (z) {
            streamWriter.mo1320a(this.f2700c);
            streamWriter.mo1320a(this.f2701d);
            streamWriter.mo1320a(this.f2702e);
            streamWriter.WriteInteger(this.f2703f);
            streamWriter.WriteInteger(this.f2704g);
            streamWriter.WriteInteger(this.f2705h);
            streamWriter.WriteInteger(this.f2706i);
            streamWriter.WriteInteger(this.f2707j);
        }
        if (z2) {
            this.f2708k.m3805a(streamWriter);
        }
    }

    /* renamed from: a */
    public static C0424b m3901a(Reader reader) {
        if (reader.ReadBool()) {
            return m3890b(reader);
        }
        return null;
    }

    /* renamed from: b */
    public static C0424b m3890b(Reader reader) {
        C0424b c0424b = new C0424b();
        byte m1289d = reader.m1289d();
        boolean m3897b = m3897b(m1289d, 1);
        boolean m3897b2 = m3897b(m1289d, 2);
        c0424b.f2699b = reader.ReadInt();
        if (m3897b) {
            c0424b.f2700c = reader.m1285g();
            c0424b.f2701d = reader.m1285g();
            c0424b.f2702e = reader.m1285g();
            c0424b.f2703f = reader.ReadInt();
            c0424b.f2704g = reader.ReadInt();
            c0424b.f2705h = reader.ReadInt();
            c0424b.f2706i = reader.ReadInt();
            c0424b.f2707j = reader.ReadInt();
        }
        if (m3897b2) {
            c0424b.f2708k = new C0439f();
            c0424b.f2708k.m3804a(reader);
        }
        return c0424b;
    }

    /* renamed from: b */
    public boolean m3896b(AbstractC0244am abstractC0244am, boolean z) {
        if (m3886c(abstractC0244am, z)) {
            m3882d(abstractC0244am, z);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m3886c(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2699b > 0 && !abstractC0244am.f1609bV.m4571g(this.f2699b)) {
            return false;
        }
        if (z) {
            return C0785ad.m1907c(abstractC0244am, this);
        }
        return mo3868b(abstractC0244am);
    }

    /* renamed from: d */
    public void m3882d(AbstractC0244am abstractC0244am, boolean z) {
        abstractC0244am.f1609bV.f1311p -= this.f2699b;
        if (z) {
            C0785ad.m1911a(abstractC0244am, this);
        }
    }

    /* renamed from: e */
    public void m3880e(AbstractC0244am abstractC0244am, boolean z) {
        abstractC0244am.f1609bV.f1311p += this.f2699b;
        if (z) {
            C0785ad.m1908b(abstractC0244am, this);
        }
    }

    /* renamed from: b */
    public static boolean m3894b(C0424b c0424b, C0424b c0424b2) {
        if (c0424b2 == c0424b) {
            return true;
        }
        if (c0424b2 == null || c0424b == null) {
            return false;
        }
        return c0424b2.m3895b(c0424b);
    }

    /* renamed from: b */
    public boolean m3895b(C0424b c0424b) {
        if (this.f2699b != c0424b.f2699b || this.f2701d != c0424b.f2701d || this.f2702e != c0424b.f2702e || this.f2703f != c0424b.f2703f || this.f2708k.m3792c() != c0424b.f2708k.m3792c()) {
            return false;
        }
        if (!this.f2708k.m3792c() && !c0424b.f2708k.m3792c() && !this.f2708k.m3781e(c0424b.f2708k)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m3885c(C0424b c0424b) {
        if (this.f2699b > 0 && c0424b.f2699b > 0) {
            return true;
        }
        if (this.f2701d > 0.0f && c0424b.f2701d > 0.0f) {
            return true;
        }
        if (this.f2702e > 0.0f && c0424b.f2702e > 0.0f) {
            return true;
        }
        if (this.f2703f > 0 && c0424b.f2703f > 0) {
            return true;
        }
        if (!this.f2708k.m3792c() && !c0424b.f2708k.m3792c() && this.f2708k.m3780f(c0424b.f2708k)) {
            return true;
        }
        return false;
    }
}
