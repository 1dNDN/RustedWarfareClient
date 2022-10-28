package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0430b;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0431c;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0432d;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0433e;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0434f;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a.class */
public class C0428a {

    /* renamed from: a */
    public boolean f2735a;

    /* renamed from: b */
    protected String f2736b;

    /* renamed from: c */
    protected C0385az f2737c;

    /* renamed from: d */
    protected C0385az f2738d;

    /* renamed from: e */
    protected boolean f2739e;

    /* renamed from: f */
    protected boolean f2740f;

    /* renamed from: g */
    protected C0385az f2741g;

    /* renamed from: h */
    protected C0385az f2742h;

    /* renamed from: i */
    public C0428a f2743i;

    /* renamed from: j */
    public boolean f2744j;

    /* renamed from: k */
    public boolean f2745k;

    /* renamed from: l */
    Integer f2746l;

    /* renamed from: m */
    public boolean f2747m;

    /* renamed from: n */
    public boolean f2748n;

    /* renamed from: o */
    public boolean f2749o;

    /* renamed from: p */
    public EnumC0435b f2750p = EnumC0435b.f2767a;

    /* renamed from: q */
    boolean f2751q;

    /* renamed from: r */
    protected boolean f2752r;

    /* renamed from: s */
    protected boolean f2753s;

    /* renamed from: t */
    C0428a f2754t;

    /* renamed from: u */
    public boolean f2755u;

    /* renamed from: v */
    public float f2756v;

    /* renamed from: w */
    public C0934e f2757w;

    /* renamed from: x */
    public boolean f2758x;

    /* renamed from: y */
    static ArrayList f2759y = new ArrayList();

    /* renamed from: z */
    static ArrayList f2760z = new ArrayList();

    /* renamed from: A */
    public static ArrayList f2761A = new ArrayList();

    /* renamed from: B */
    public static final C0428a f2762B = m4055a(new C0431c());

    /* renamed from: C */
    public static final C0428a f2763C = m4055a(new C0432d());

    /* renamed from: D */
    public static final C0428a f2764D = m4055a(new C0430b());

    /* renamed from: F */
    public static final C0428a f2766F = m4055a(new C0434f());

    /* renamed from: E */
    public static final C0428a f2765E = m4055a(new C0433e());

    /* renamed from: a */
    public boolean m4060a() {
        return this.f2751q;
    }

    /* renamed from: b */
    public boolean m4051b() {
        return this.f2753s;
    }

    /* renamed from: c */
    public boolean m4048c() {
        return this.f2752r;
    }

    /* renamed from: d */
    public static void m4047d() {
        Iterator it = f2759y.iterator();
        while (it.hasNext()) {
            ((C0428a) it.next()).m4045f();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = f2759y.iterator();
        while (it2.hasNext()) {
            C0428a c0428a = (C0428a) it2.next();
            if (c0428a.f2735a) {
                arrayList.add(c0428a);
            }
        }
        f2760z = arrayList;
    }

    /* renamed from: e */
    public static ArrayList m4046e() {
        return f2760z;
    }

    /* renamed from: f */
    public void m4045f() {
        if (this.f2753s) {
            this.f2735a = true;
            return;
        }
        C0437d c0437d = null;
        Iterator it = C0453l.f3188d.iterator();
        while (it.hasNext()) {
            C0437d m3726a = ((C0453l) it.next()).m3726a(this);
            if (m3726a != null && (c0437d == null || c0437d.f2774c < m3726a.f2774c)) {
                c0437d = m3726a;
            }
        }
        this.f2735a = c0437d != null;
        if (c0437d != null) {
            this.f2737c = c0437d.f2778g;
            this.f2738d = c0437d.f2779h;
            this.f2739e = c0437d.f2780i;
            this.f2740f = c0437d.f2781j;
            this.f2746l = c0437d.f2775d;
            this.f2747m = c0437d.f2776e;
            this.f2748n = c0437d.f2785n;
            this.f2749o = c0437d.f2786o;
            this.f2750p = c0437d.f2787p;
            this.f2741g = c0437d.f2789r;
            this.f2742h = c0437d.f2790s;
            this.f2743i = c0437d.f2792u;
            this.f2744j = c0437d.f2794w;
            this.f2745k = c0437d.f2793v;
            this.f2751q = c0437d.f2783l;
            this.f2754t = c0437d.f2796y;
            this.f2755u = c0437d.f2782k;
            this.f2756v = c0437d.f2788q;
            this.f2757w = c0437d.f2797z;
            this.f2758x = c0437d.f2798A;
        }
    }

    /* renamed from: g */
    public Integer m4044g() {
        return this.f2746l;
    }

    /* renamed from: h */
    public String m4043h() {
        if (this.f2737c == null) {
            return this.f2736b;
        }
        return this.f2737c.m4224b();
    }

    /* renamed from: i */
    public String m4042i() {
        if (this.f2738d != null) {
            return this.f2738d.m4224b();
        }
        return m4043h();
    }

    /* renamed from: a */
    public String m4058a(double d, boolean z) {
        String m2138c;
        if (this.f2748n) {
            m2138c = VariableScope.nullOrMissingString + ((int) d);
        } else {
            m2138c = C0758f.m2138c(d);
        }
        return mo4040a(z) + m4053a(m2138c, this.f2750p) + m4049b(z);
    }

    /* renamed from: a */
    public static String m4053a(String str, EnumC0435b enumC0435b) {
        String str2;
        if (enumC0435b == EnumC0435b.f2767a) {
            return str;
        }
        if (Core.m1087A().settingEngine.disableDigitGrouping) {
            return str;
        }
        String str3 = str;
        String str4 = VariableScope.nullOrMissingString;
        int indexOf = str3.indexOf(".");
        if (indexOf != -1) {
            str4 = str3.substring(indexOf);
            str3 = str3.substring(0, indexOf);
        }
        if (str3.length() <= 3) {
            return str;
        }
        if (enumC0435b == EnumC0435b.f2768b) {
            str2 = " ";
        } else if (enumC0435b == EnumC0435b.f2769c) {
            str2 = ",";
        } else {
            throw new RuntimeException("Unhandled grouping style: " + enumC0435b);
        }
        StringBuilder sb = new StringBuilder();
        int length = str3.length() % 3;
        if (length != 0) {
            sb.append(str3.substring(0, length));
        }
        for (int i = length; i < str3.length(); i += 3) {
            if (i != 0) {
                sb.append(str2);
            }
            sb.append(str3.substring(i, i + 3));
        }
        if (str4 == VariableScope.nullOrMissingString) {
            return sb.toString();
        }
        return sb.toString() + str4;
    }

    /* renamed from: a */
    public static String m4056a(long j, EnumC0435b enumC0435b) {
        if (enumC0435b == EnumC0435b.f2767a) {
            return VariableScope.nullOrMissingString + j;
        }
        if (enumC0435b == EnumC0435b.f2768b) {
            return String.format(Locale.US, "%,d", Long.valueOf(j)).replace(",", " ");
        }
        if (enumC0435b == EnumC0435b.f2769c) {
            return String.format(Locale.US, "%,d", Long.valueOf(j));
        }
        throw new RuntimeException("Unhandled grouping style: " + enumC0435b);
    }

    /* renamed from: a */
    public String mo4040a(boolean z) {
        if (this.f2741g != null) {
            return this.f2741g.m4224b();
        }
        if (z && this.f2739e) {
            return VariableScope.nullOrMissingString;
        }
        return m4043h() + ": ";
    }

    /* renamed from: b */
    public String m4049b(boolean z) {
        if (this.f2742h != null) {
            return this.f2742h.m4224b();
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: j */
    public C0934e m4041j() {
        return this.f2757w;
    }

    /* renamed from: a */
    public static C0428a m4054a(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        Iterator it = f2761A.iterator();
        while (it.hasNext()) {
            C0428a c0428a = (C0428a) it.next();
            if (c0428a.f2736b.equalsIgnoreCase(lowerCase)) {
                return c0428a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0428a m4055a(C0428a c0428a) {
        Iterator it = f2759y.iterator();
        while (it.hasNext()) {
            if (((C0428a) it.next()).f2736b.equals(c0428a.f2736b)) {
                throw new RuntimeException("Built in resource already exists:" + c0428a.f2736b);
            }
        }
        f2759y.add(c0428a);
        f2761A.add(c0428a);
        return c0428a;
    }

    /* renamed from: a */
    public static C0428a m4052a(String str, boolean z, boolean z2) {
        Iterator it = f2759y.iterator();
        while (it.hasNext()) {
            C0428a c0428a = (C0428a) it.next();
            if (c0428a.f2736b.equals(str)) {
                return c0428a;
            }
        }
        C0428a c0428a2 = new C0428a();
        c0428a2.f2736b = str;
        c0428a2.f2753s = z;
        c0428a2.f2752r = z2;
        f2759y.add(c0428a2);
        return c0428a2;
    }

    /* renamed from: b */
    public static C0428a m4050b(String str) {
        Iterator it = f2759y.iterator();
        while (it.hasNext()) {
            C0428a c0428a = (C0428a) it.next();
            if (c0428a.f2736b.equals(str)) {
                return c0428a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m4059a(double d) {
        return m4053a(C0758f.m2213a(d, 1), this.f2750p);
    }

    /* renamed from: a */
    public String m4057a(double d, boolean z, boolean z2) {
        String str;
        if (z2 && this.f2740f) {
            str = VariableScope.nullOrMissingString;
        } else {
            str = m4042i() + ": ";
        }
        if (this == f2762B) {
            str = "$";
        }
        if (z) {
            if (d > 0.0d) {
                return "+" + str + m4059a(d);
            }
            return "-" + str + m4059a(-d);
        } else if (d > 0.0d) {
            return str + m4059a(d);
        } else {
            return str + m4059a(d);
        }
    }

    public String toString() {
        return "resource(" + this.f2736b + ")";
    }

    /* renamed from: a */
    public double mo4039a(AbstractC0244am abstractC0244am) {
        if (this.f2752r) {
            return abstractC0244am.f1609bV.m5052c(this);
        }
        return abstractC0244am.m4781a(this);
    }

    /* renamed from: a */
    public void mo4038a(AbstractC0244am abstractC0244am, double d) {
        if (this.f2752r) {
            abstractC0244am.f1609bV.m5101S().m4021a(this, d);
        } else {
            abstractC0244am.mo1759dd().m4021a(this, d);
        }
    }

    /* renamed from: b */
    public void mo4037b(AbstractC0244am abstractC0244am, double d) {
        if (this.f2752r) {
            abstractC0244am.f1609bV.m5101S().m4006b(this, d);
        } else {
            abstractC0244am.mo1759dd().m4006b(this, d);
        }
    }
}
