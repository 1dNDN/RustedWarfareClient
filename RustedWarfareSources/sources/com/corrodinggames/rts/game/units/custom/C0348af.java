package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.C0337b;
import com.corrodinggames.rts.game.units.custom.p016a.C0338c;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0341f;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0322a;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0323b;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0325d;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0326e;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0327f;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0328g;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0329h;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0330i;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0331j;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0332k;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0333l;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0334m;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0336o;
import com.corrodinggames.rts.game.units.custom.p018b.C0388b;
import com.corrodinggames.rts.game.units.custom.p018b.C0389c;
import com.corrodinggames.rts.game.units.custom.p018b.C0393g;
import com.corrodinggames.rts.game.units.custom.p018b.C0395i;
import com.corrodinggames.rts.game.units.custom.p018b.C0397k;
import com.corrodinggames.rts.game.units.custom.p018b.C0398l;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0437d;
import com.corrodinggames.rts.game.units.custom.p021e.C0438e;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.custom.p023f.C0442a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p014b.AbstractC0309b;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.game.units.p026e.AbstractC0525h;
import com.corrodinggames.rts.game.units.p026e.AbstractC0529j;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.game.units.p026e.C0520c;
import com.corrodinggames.rts.game.units.p029h.AbstractC0590f;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0635i;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.C0937h;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1073ac;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/af.class */
public class C0348af {

    /* renamed from: b */
    static int f2191b;

    /* renamed from: c */
    static int f2192c;

    /* renamed from: d */
    public static int f2193d;

    /* renamed from: e */
    static C0824b f2194e;

    /* renamed from: f */
    static boolean f2195f;

    /* renamed from: i */
    static int f2196i;

    /* renamed from: j */
    static int f2197j;

    /* renamed from: k */
    static boolean f2198k;

    /* renamed from: l */
    static int f2199l;

    /* renamed from: a */
    static boolean f2200a = false;

    /* renamed from: g */
    public static HashMap f2201g = new HashMap();

    /* renamed from: h */
    public static HashMap f2202h = new HashMap();

    /* renamed from: m */
    public static C1101m f2203m = new C1101m();

    /* renamed from: n */
    static HashMap f2204n = new HashMap();

    /* renamed from: o */
    static final Object f2205o = new Object();

    /* renamed from: p */
    public static float f2206p = 50.0f;

    /* renamed from: q */
    public static float f2207q = 50.0f;

    /* renamed from: r */
    static C0824b f2208r = null;

    /* renamed from: s */
    static String f2209s = null;

    /* renamed from: a */
    public static void m4319a(int i) {
        if (f2194e != null) {
            f2194e.f5449G += i;
        }
    }

    /* renamed from: a */
    public static void m4320a() {
        m4271i();
        m4270j();
    }

    /* renamed from: a */
    public static void m4306a(C0934e c0934e) {
        if (c0934e != null && !c0934e.f6408v) {
            if (Core.m1006ay() && (c0934e instanceof C0937h)) {
                return;
            }
            c0934e.f6408v = true;
            m4319a(c0934e.mo385u());
        }
    }

    /* renamed from: a */
    public static void m4288a(C0934e[] c0934eArr) {
        if (c0934eArr != null) {
            C0934e c0934e = null;
            for (C0934e c0934e2 : c0934eArr) {
                if (c0934e2 != c0934e) {
                    m4306a(c0934e2);
                }
                if (c0934e == null) {
                    c0934e = c0934e2;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4308a(AbstractC0635i abstractC0635i) {
        if (!abstractC0635i.f4069g) {
            abstractC0635i.f4069g = true;
            if (f2194e != null) {
                f2194e.f5450H += abstractC0635i.mo75a();
            }
        }
    }

    /* renamed from: a */
    public static boolean m4304a(C1101m c1101m) {
        C0453l c0453l;
        Core m1087A = Core.m1087A();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList(C0453l.f3187c);
        ArrayList arrayList2 = new ArrayList(C0453l.f3188d);
        C1101m c1101m2 = new C1101m();
        String str = null;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            C0453l m4315a = m4315a((C0453l) it.next());
            if (m4315a == null) {
                Core.LogDebug2("Failed to apply changes to unit type: " + c0453l.f2922L);
                z = true;
                if (str == null && f2209s != null) {
                    str = f2209s;
                }
            } else {
                Core.LogDebug2("Changes applied to unit type: " + c0453l.f2922L);
                z2 = true;
                c1101m2.add(m4315a);
            }
        }
        if (str != null && Core.m1012as()) {
            m1087A.m990c("Unit errors", str);
        }
        if (z2 && !m4277c(false)) {
            z = true;
        }
        if (z2 && !z) {
            C0453l.f3189e = null;
            m4275e();
            f2209s = null;
            AbstractC0197n.m5107M();
            C0797f.m1912J();
            z3 = true;
            if (!z) {
                Iterator it2 = c1101m2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0453l c0453l2 = (C0453l) it2.next();
                    if (c0453l2.f3283gq.size() > 0) {
                        m1087A.m1045a(c0453l2.f3283gq.size() + " Warning(s) loading: " + c0453l2.m3706b() + " \n" + ((String) c0453l2.f3283gq.get(0)), 1);
                        c0453l2.f3283gq.clear();
                        z3 = false;
                        break;
                    }
                }
            }
        }
        if (z) {
            Core.LogDebug2("Failed to load some units, keeping old config");
            synchronized (C0453l.f3187c) {
                C0453l.f3187c.clear();
                C0453l.f3187c.addAll(arrayList);
            }
            C0453l.f3188d = arrayList2;
        }
        return z3;
    }

    /* renamed from: b */
    public static void m4287b() {
        C1101m c1101m = new C1101m();
        f2191b = 0;
        f2192c = 0;
        f2193d = 0;
        Iterator it = AbstractC0244am.m4761bF().iterator();
        while (it.hasNext()) {
            InterfaceC0303as mo1758r = ((AbstractC0244am) it.next()).mo1758r();
            if ((mo1758r instanceof C0453l) && !c1101m.contains(mo1758r)) {
                c1101m.add((C0453l) mo1758r);
            }
        }
        if (c1101m.size() > 0) {
            m4304a(c1101m);
        }
    }

    /* renamed from: c */
    public static void m4280c() {
        boolean z = false;
        C1101m c1101m = new C1101m();
        Iterator it = C0453l.f3187c.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            boolean z2 = false;
            Iterator it2 = c0453l.f3199k.iterator();
            while (it2.hasNext()) {
                C0468z c0468z = (C0468z) it2.next();
                long m3633a = c0468z.m3633a(false);
                if (m3633a != c0468z.f3360a) {
                    z2 = true;
                    c0468z.f3360a = m3633a;
                }
            }
            if (z2) {
                if (!z) {
                    Core.LogDebug2("Detected unit changes");
                    z = true;
                }
                c1101m.add(c0453l);
            }
        }
        if (c1101m.size() > 0) {
            m4304a(c1101m);
        }
    }

    /* renamed from: d */
    public static void m4276d() {
        if (C0453l.f3189e != null) {
            Core.LogDebug2("applyPendingNetworkUnits: Applying new network units from server (" + C0453l.f3189e.size() + " units)");
            C0453l.f3188d = C0453l.f3189e;
            C0453l.f3189e = null;
            m4275e();
            return;
        }
        Core.LogDebug2("applyPendingNetworkUnits: no server units list found");
    }

    /* renamed from: a */
    public static ArrayList m4289a(boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (C0453l.f3187c) {
            Iterator it = C0453l.f3187c.iterator();
            while (it.hasNext()) {
                C0453l c0453l = (C0453l) it.next();
                if (c0453l.f2919I == null || (c0453l.f2919I.m1673m() && z)) {
                    arrayList.add(c0453l);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C1072ab m4303a(String str) {
        synchronized (f2204n) {
            C1072ab c1072ab = (C1072ab) f2204n.get(str);
            if (c1072ab != null) {
                return c1072ab;
            }
            C1098j m4284b = m4284b(str);
            if (m4284b == null) {
                return null;
            }
            try {
                C1072ab c1072ab2 = new C1072ab(new BufferedInputStream(m4284b), str);
                c1072ab2.m698a();
                c1072ab2.f6832f = m4284b.m540d();
                f2204n.put(str, c1072ab2);
                return c1072ab2;
            } catch (IOException e) {
                e.printStackTrace();
                throw new C0412bm("Load of '" + str + "' failed: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m4310a(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        C1072ab m4303a = m4303a(str);
        if (m4303a == null) {
            if (z) {
                return;
            }
            throw new C0412bm("[" + str2 + "] Could not find conf target:" + str);
        }
        c0453l.m3671o(m4303a.f6832f);
        c1072ab.m690a(m4303a);
        m4314a(c0453l, c1072ab, m4303a, str, 1);
    }

    /* renamed from: a */
    public static void m4314a(C0453l c0453l, C1072ab c1072ab, C1072ab c1072ab2, String str, int i) {
        String m4296a;
        String str2;
        if (i > 10) {
            throw new C0412bm("copyFrom can only be 10 levels deep, maybe you have a loop?");
        }
        String m656b = c1072ab2.m656b("core", "copyFrom", (String) null);
        if (m656b != null) {
            String[] split = m656b.split(",");
            Collections.reverse(Arrays.asList(split));
            for (String str3 : split) {
                String trim = str3.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    if (trim.contains("..")) {
                        throw new C0412bm("'..' not supported in copyFrom");
                    }
                    if (trim.startsWith("ROOT:")) {
                        String substring = trim.substring("ROOT:".length());
                        if (c0453l.f2919I == null) {
                            str2 = "units/common.ini";
                        } else {
                            str2 = c0453l.f2919I.f5433q + "/common.ini";
                        }
                        m4296a = m4296a(C0758f.m2094h(str2), substring);
                    } else if (trim.startsWith("CORE:")) {
                        m4296a = m4296a(C0758f.m2094h("units/common.ini"), trim.substring("CORE:".length()));
                    } else {
                        m4296a = m4296a(C0758f.m2094h(str), trim);
                    }
                    C1072ab m4303a = m4303a(m4296a);
                    if (m4303a == null) {
                        String str4 = "Could not find copyFrom target:" + m4296a;
                        if (i != 0) {
                            str4 = str4 + " (while loading: " + str + ")";
                        }
                        throw new C0412bm(str4);
                    }
                    c0453l.m3671o(m4303a.f6832f);
                    c1072ab.m690a(m4303a);
                    m4314a(c0453l, c1072ab, m4303a, m4296a, i + 1);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4313a(C0453l c0453l, C1072ab c1072ab, String str, String str2, int i) {
        if (i > 10) {
            throw new C0412bm("@copyFromSection can only be 10 levels deep, maybe you have a loop?");
        }
        String m656b = c1072ab.m656b(str2, "@copyFromSection", (String) null);
        if (m656b == null || m656b.equals(VariableScope.nullOrMissingString)) {
            return;
        }
        String[] split = m656b.split(",");
        Collections.reverse(Arrays.asList(split));
        for (String str3 : split) {
            String trim = str3.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                C1101m m629k = c1072ab.m629k(trim, VariableScope.nullOrMissingString);
                if (m629k.size() == 0) {
                    throw new C0412bm("[" + str2 + "]@copyFromSection: Could not find keys in target section: " + trim);
                }
                Iterator it = m629k.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String m659b = c1072ab.m659b(trim, str4);
                    if (m659b != null) {
                        c1072ab.m645d(str, str4, m659b);
                    }
                }
                m4313a(c0453l, c1072ab, str, trim, i + 1);
            }
        }
    }

    /* renamed from: a */
    public static C0385az m4305a(C1072ab c1072ab, String str, String str2, String str3) {
        return c1072ab.m666a(str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0351ai m4312a(C0453l c0453l, C1072ab c1072ab, String str, String str2, String str3) {
        return c1072ab.m691a(c0453l, str, str2, str3);
    }

    /* renamed from: a */
    public static C0453l m4315a(C0453l c0453l) {
        String str = c0453l.f2914C;
        Core m1087A = Core.m1087A();
        C0453l c0453l2 = null;
        String str2 = null;
        if (c0453l.f2919I != null) {
            str2 = c0453l.f2919I.f5460R;
        }
        synchronized (f2204n) {
            f2204n.clear();
        }
        f2209s = null;
        try {
            c0453l2 = m4301a(str, c0453l.f2919I, c0453l.f2920J, c0453l.f2921K);
        } catch (RuntimeException e) {
            e.printStackTrace();
            if (f2209s == null) {
                m1087A.m1045a("Error loading unit:" + m4307a(c0453l.f2919I, str, true) + "\n" + e.getMessage(), 1);
            }
        }
        if (c0453l2 == null && c0453l.f2919I != null) {
            c0453l.f2919I.f5460R = str2;
        }
        if (c0453l2 != null) {
            synchronized (C0453l.f3187c) {
                C0453l.f3187c.remove(c0453l);
            }
            m4316a((InterfaceC0303as) c0453l, c0453l2, true);
            if (C0453l.f3188d.remove(c0453l)) {
                C0453l.f3188d.add(c0453l2);
                if (c0453l.f2917G != c0453l2.f2917G) {
                    f2193d++;
                }
            } else {
                Core.LogDebug2("Changed unit was not enabled (original not found in customUnitTypes)");
            }
            AbstractC0197n.m5107M();
            C0797f.m1912J();
        }
        return c0453l2;
    }

    /* renamed from: a */
    public static void m4316a(InterfaceC0303as interfaceC0303as, C0453l c0453l, boolean z) {
        Iterator it = AbstractC0244am.m4761bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof C0451j) {
                C0451j c0451j = (C0451j) abstractC0244am;
                if (c0451j.f2863x == interfaceC0303as) {
                    AbstractC0197n.m5069b((AbstractC0244am) c0451j);
                    c0451j.m3902a(c0453l, false, z);
                    c0451j.m3008S();
                    if (c0451j.m4675de() != null) {
                        c0451j.m4675de().m4131a(c0453l);
                    }
                    AbstractC0197n.m5053c(c0451j);
                }
                if (c0451j.f2865z == interfaceC0303as) {
                    c0451j.f2865z = c0453l;
                }
            }
        }
    }

    /* renamed from: b */
    public static String m4281b(boolean z) {
        ArrayList m4289a = m4289a(z);
        C0453l.f3189e = null;
        C0453l.f3188d = m4289a;
        f2209s = null;
        m4275e();
        return f2209s;
    }

    /* renamed from: c */
    public static boolean m4277c(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = C0453l.f3188d;
        if (z) {
            arrayList = m4289a(true);
        } else {
            arrayList = C0453l.f3188d;
        }
        boolean z2 = true;
        f2209s = null;
        C0453l.f3188d = arrayList;
        m4273g();
        if (f2209s != null) {
            z2 = false;
        }
        C0453l.f3188d = arrayList2;
        m4273g();
        return z2;
    }

    /* renamed from: e */
    public static void m4275e() {
        synchronized (f2205o) {
            m4266n();
        }
    }

    /* renamed from: n */
    private static void m4266n() {
        C0453l c0453l = null;
        ArrayList arrayList = new ArrayList();
        if (Core.m1087A().m1013ar()) {
            for (EnumC0249ar enumC0249ar : EnumC0249ar.values()) {
                arrayList.add(enumC0249ar);
            }
        }
        Iterator it = C0453l.f3188d.iterator();
        while (it.hasNext()) {
            C0453l c0453l2 = (C0453l) it.next();
            arrayList.add(c0453l2);
            if (c0453l2.f2922L.equals("missing") && c0453l2.f2919I == null) {
                c0453l = c0453l2;
            }
        }
        EnumC0249ar.f1791ae = arrayList;
        AbstractC0244am.m4755bL();
        m4273g();
        m4274f();
        C0428a.m4047d();
        if (c0453l == null) {
            Core.LogDebug2("missingPlaceHolder is not an active unit, searching for new target");
            Iterator it2 = C0453l.f3188d.iterator();
            while (it2.hasNext()) {
                C0453l c0453l3 = (C0453l) it2.next();
                if (c0453l3.f2922L.equals("missing")) {
                    Core.LogDebug2("Found a missing placeholder");
                    c0453l = c0453l3;
                }
            }
        }
        C0453l.f2903b = c0453l;
    }

    /* renamed from: f */
    public static void m4274f() {
        float f = 50.0f;
        float f2 = 50.0f;
        Iterator it = C0453l.f3188d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            float f3 = c0453l.f3048cU;
            if (f3 > 250.0f) {
                f3 = 250.0f;
            }
            if (f < f3) {
                f = f3;
            }
            if (c0453l.f2949aG && f2 < f3) {
                f2 = f3;
            }
        }
        f2206p = f;
        f2207q = f2;
    }

    /* renamed from: b */
    public static C1098j m4284b(String str) {
        return C0750a.m2269j(VariableScope.nullOrMissingString + str);
    }

    /* renamed from: a */
    public static void m4290a(ArrayList arrayList) {
        Collections.sort(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v140, types: [com.corrodinggames.rts.game.units.a.v] */
    /* JADX WARN: Type inference failed for: r0v144, types: [com.corrodinggames.rts.game.units.a.l] */
    /* JADX WARN: Type inference failed for: r0v260, types: [com.corrodinggames.rts.game.units.a.l] */
    /* renamed from: a */
    public static void m4317a(InterfaceC0303as interfaceC0303as) {
        C0342g c0342g;
        C0227v c0227v;
        Core m1087A = Core.m1087A();
        try {
            interfaceC0303as.mo4475h();
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l = (C0453l) interfaceC0303as;
                if (c0453l.f3168fG != null) {
                    InterfaceC0303as m3663s = C0453l.m3663s(c0453l.f3168fG);
                    if (m3663s == null) {
                        throw new C0412bm("Could not find [ai]upgradedFrom target:" + c0453l.f3168fG);
                    }
                    c0453l.m3704b(m3663s);
                }
                Iterator it = c0453l.f3204p.iterator();
                while (it.hasNext()) {
                    ((C0463u) it.next()).mo3641a();
                }
                if (c0453l.f3124eF) {
                    C0453l.f3191g.add(c0453l);
                }
            }
            Iterator it2 = C0453l.f3188d.iterator();
            while (it2.hasNext()) {
                C0453l c0453l2 = (C0453l) it2.next();
                if (interfaceC0303as instanceof C0453l) {
                    C0453l c0453l3 = (C0453l) interfaceC0303as;
                    if (c0453l2.f3168fG != null && c0453l2.f3168fG.equalsIgnoreCase(c0453l3.mo4474i())) {
                        c0453l3.m3704b(c0453l2);
                    }
                }
                Iterator it3 = c0453l2.f3277gd.iterator();
                while (it3.hasNext()) {
                    C0458p c0458p = (C0458p) it3.next();
                    if (c0458p.f3329a.equalsIgnoreCase(interfaceC0303as.mo4474i())) {
                        c0458p.f3333e = true;
                        boolean z = false;
                        for (int i = c0453l2.f3020cj; i <= 3; i++) {
                            ArrayList mo4484a = interfaceC0303as.mo4484a(i);
                            if (c0453l2.f2949aG || c0458p.f3331c) {
                                c0227v = new C0227v(c0453l2);
                            } else {
                                c0227v = new C0217l(c0453l2, null);
                            }
                            if (c0458p.f3330b != -999.0f) {
                                c0227v.f1460g = c0458p.f3330b;
                            }
                            if (c0458p.f3334f != null) {
                                boolean z2 = false;
                                if (!(interfaceC0303as instanceof C0453l) && !(AbstractC0244am.m4785a(interfaceC0303as) instanceof AbstractC0623y)) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    c0227v.f1461h = C0338c.m4360a(c0458p);
                                } else if (!z) {
                                    z = true;
                                    c0453l2.m3665r("builtFrom isLocked currently cannot be used when targeting old-style unit:" + interfaceC0303as.mo4474i());
                                }
                            }
                            boolean z3 = false;
                            Iterator it4 = mo4484a.iterator();
                            while (it4.hasNext()) {
                                if (c0227v.equals((AbstractC0224s) it4.next())) {
                                    z3 = true;
                                }
                            }
                            if (!z3) {
                                mo4484a.add(c0227v);
                            }
                            m4290a(mo4484a);
                        }
                    }
                }
            }
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l4 = (C0453l) interfaceC0303as;
                Iterator it5 = c0453l4.f3278ge.iterator();
                while (it5.hasNext()) {
                    C0339d c0339d = (C0339d) it5.next();
                    if (c0339d.f2056j != null && c0339d.f2056j.equalsIgnoreCase("setRally")) {
                        for (int i2 = 1; i2 <= 3; i2++) {
                            ArrayList mo4484a2 = interfaceC0303as.mo4484a(i2);
                            C0220o c0220o = new C0220o();
                            if (c0339d.f2123o != -999.0f) {
                                c0220o.f1460g = c0339d.f2123o;
                            }
                            mo4484a2.add(c0220o);
                            c0453l4.f3051da = true;
                            m4290a(mo4484a2);
                        }
                    } else if (c0339d.f2056j != null && c0339d.f2056j.equalsIgnoreCase("reclaim")) {
                        for (int i3 = 1; i3 <= 3; i3++) {
                            ArrayList mo4484a3 = interfaceC0303as.mo4484a(i3);
                            C0218m c0218m = new C0218m(true);
                            if (c0339d.f2123o != -999.0f) {
                                c0218m.f1460g = c0339d.f2123o;
                            }
                            mo4484a3.add(c0218m);
                            m4290a(mo4484a3);
                        }
                    } else if (c0339d.f2056j != null && c0339d.f2056j.equalsIgnoreCase("repair")) {
                        for (int i4 = 1; i4 <= 3; i4++) {
                            ArrayList mo4484a4 = interfaceC0303as.mo4484a(i4);
                            C0219n c0219n = new C0219n();
                            if (c0339d.f2123o != -999.0f) {
                                c0219n.f1460g = c0339d.f2123o;
                            }
                            mo4484a4.add(c0219n);
                            m4290a(mo4484a4);
                        }
                    } else {
                        InterfaceC0303as interfaceC0303as2 = null;
                        if (c0339d.f2056j != null) {
                            interfaceC0303as2 = EnumC0249ar.m4623a(c0339d.f2056j);
                            if (interfaceC0303as2 == null) {
                                throw new C0412bm("Could not find canBuild target:" + c0339d.f2056j);
                            }
                        } else if (c0339d.f2135aJ != EnumC0341f.convert) {
                            throw new C0412bm("'Target' required for action:" + c0339d.m4355a());
                        }
                        for (int i5 = 1; i5 <= 3; i5++) {
                            ArrayList mo4484a5 = interfaceC0303as.mo4484a(i5);
                            if (c0339d.f2135aJ == EnumC0341f.build) {
                                if (interfaceC0303as2.mo4473j() || c0339d.f2120aH) {
                                    c0342g = new C0227v(interfaceC0303as2, c0339d.f2119aG, null);
                                    c0342g.f1461h = C0338c.m4361a(c0339d);
                                } else {
                                    c0342g = new C0217l(interfaceC0303as2, null);
                                    c0342g.f1461h = C0338c.m4361a(c0339d);
                                }
                            } else if (c0339d.f2135aJ == EnumC0341f.convert) {
                                c0342g = new C0342g(c0339d, C0453l.m3730a(interfaceC0303as2));
                            } else {
                                throw new C0412bm("Could not find actionType:" + c0339d.f2135aJ);
                            }
                            if (c0339d.f2123o != -999.0f) {
                                c0342g.f1460g = c0339d.f2123o;
                            }
                            boolean z4 = false;
                            Iterator it6 = mo4484a5.iterator();
                            while (it6.hasNext()) {
                                if (c0342g.equals((AbstractC0224s) it6.next())) {
                                    z4 = true;
                                }
                            }
                            if (!z4) {
                                mo4484a5.add(c0342g);
                            }
                            m4290a(mo4484a5);
                        }
                    }
                }
            }
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l5 = (C0453l) interfaceC0303as;
                c0453l5.f3154fs = false;
                for (int i6 = 1; i6 <= 3; i6++) {
                    Iterator it7 = interfaceC0303as.mo4484a(i6).iterator();
                    while (it7.hasNext()) {
                        AbstractC0224s abstractC0224s = (AbstractC0224s) it7.next();
                        if (!(abstractC0224s instanceof C0342g) && abstractC0224s.mo6163i() != null) {
                            c0453l5.f3154fs = true;
                        }
                    }
                }
                Iterator it8 = c0453l5.f3204p.iterator();
                while (it8.hasNext()) {
                    ((C0463u) it8.next()).mo3640b();
                }
            }
            boolean z5 = m1087A.m1074N() && m1087A.f6122bX.f5603aO.f5664k;
            for (int i7 = 1; i7 <= 3; i7++) {
                Iterator it9 = interfaceC0303as.mo4484a(i7).iterator();
                while (it9.hasNext()) {
                    AbstractC0224s abstractC0224s2 = (AbstractC0224s) it9.next();
                    if (abstractC0224s2.f1461h instanceof C0337b) {
                        Core.m1046a("=== ChainedActionConfig already on: " + interfaceC0303as.mo4474i() + " action:" + abstractC0224s2.mo3085b());
                        abstractC0224s2.f1461h = ((C0337b) abstractC0224s2.f1461h).f2033b;
                    }
                    if (z5) {
                        C0424b mo4866B = abstractC0224s2.mo4866B();
                        C0424b mo4862o_ = abstractC0224s2.mo4862o_();
                        if (!mo4866B.m4106b() && mo4862o_ == null) {
                            C0337b c0337b = new C0337b(abstractC0224s2.f1461h);
                            abstractC0224s2.f1461h = c0337b;
                            c0337b.f2034c = C0424b.f2710a;
                            c0337b.f2035d = mo4866B;
                        }
                    }
                }
            }
        } catch (C0412bm e) {
            m4298a(interfaceC0303as.mo4474i(), e, interfaceC0303as);
        } catch (RuntimeException e2) {
            m4298a(interfaceC0303as.mo4474i(), e2, interfaceC0303as);
        }
    }

    /* renamed from: g */
    public static void m4273g() {
        synchronized (f2205o) {
            m4265o();
        }
    }

    /* renamed from: o */
    private static void m4265o() {
        C0458p c0458p;
        C0453l.f3191g.clear();
        C0453l.f3190f.clear();
        Iterator it = C0453l.f3188d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            Iterator it2 = c0453l.f3277gd.iterator();
            while (it2.hasNext()) {
                ((C0458p) it2.next()).f3333e = false;
            }
            c0453l.f3268fJ.clear();
        }
        Iterator it3 = C0453l.f3188d.iterator();
        while (it3.hasNext()) {
            C0453l c0453l2 = (C0453l) it3.next();
            try {
                if (c0453l2.f2925P != null) {
                    for (String str : c0453l2.f2925P.split(",")) {
                        String trim = str.trim();
                        InterfaceC0303as m3710a = C0453l.m3710a(trim, false);
                        if (m3710a == null) {
                            throw new C0412bm("Could not find overrideAndReplace target:" + trim);
                            break;
                        }
                        if (m3710a instanceof C0453l) {
                            Core.LogDebug2("Replacing:" + m3710a.mo4474i() + " with " + c0453l2.mo4474i());
                        }
                        C0453l.f3190f.put(m3710a, c0453l2);
                    }
                }
            } catch (C0412bm e) {
                m4298a(c0453l2.mo4474i(), e, c0453l2);
            }
        }
        for (EnumC0249ar enumC0249ar : EnumC0249ar.values()) {
            m4317a(enumC0249ar);
        }
        Iterator it4 = C0453l.f3188d.iterator();
        while (it4.hasNext()) {
            m4317a((InterfaceC0303as) ((C0453l) it4.next()));
        }
        Iterator it5 = C0453l.f3188d.iterator();
        while (it5.hasNext()) {
            C0453l c0453l3 = (C0453l) it5.next();
            Iterator it6 = c0453l3.f3277gd.iterator();
            while (it6.hasNext()) {
                if (!((C0458p) it6.next()).f3333e) {
                    String str2 = c0458p.f3332d + " failed to find target:" + c0458p.f3329a;
                    c0453l3.m3667q(str2);
                    if (c0453l3.f2926Q >= 1) {
                        Core.LogDebug2("Converting warning to error (meta.strictLevel=" + c0453l3.f2926Q + ")");
                        c0453l3.m3669p(str2);
                    }
                }
            }
            if (c0453l3.f3281gm != null && c0453l3.f3281gm.size() > 0) {
                Iterator it7 = c0453l3.f3281gm.iterator();
                while (it7.hasNext()) {
                    try {
                        ((C0462t) it7.next()).m3645b(c0453l3);
                    } catch (C0412bm e2) {
                        m4298a(c0453l3.mo4474i(), e2, c0453l3);
                    }
                }
            }
        }
        Iterator it8 = C0453l.f3188d.iterator();
        while (it8.hasNext()) {
            ((C0453l) it8.next()).m3666r();
        }
        Collections.sort(C0453l.f3191g, new C0459q());
    }

    /* renamed from: a */
    public static C0453l m4301a(String str, C0824b c0824b, String str2, String str3) {
        try {
            long m2440a = C0727bl.m2440a();
            C1098j m4284b = m4284b(str);
            if (m4284b == null) {
                throw new RuntimeException("Failed to open unit config file:" + str);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m4284b);
            m4318a(m2440a, EnumC0349ag.iniOpen);
            f2191b++;
            if (c0824b != null) {
                f2192c++;
            }
            Core m1087A = Core.m1087A();
            String str4 = "core units";
            if (c0824b != null) {
                str4 = c0824b.m1691a();
            }
            m1087A.m971h("Loading units - " + f2191b + " (" + str4 + ")");
            C0453l m4299a = m4299a(str, bufferedInputStream, m4284b.m541c(), c0824b, m4284b, str2, str3);
            long m2440a2 = C0727bl.m2440a();
            try {
                bufferedInputStream.close();
                m4284b.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            m4318a(m2440a2, EnumC0349ag.iniClose);
            return m4299a;
        } catch (RuntimeException e2) {
            m4297a(str, e2, c0824b);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139, types: [byte[]] */
    /* renamed from: h */
    public static void m4272h() {
        Core m1087A = Core.m1087A();
        ArrayList m1695k = m1087A.f6124bZ.m1695k();
        f2197j = 0;
        f2196i = 0;
        f2199l = 0;
        f2198k = false;
        long m2440a = C0727bl.m2440a();
        for (C0934e c0934e : f2201g.values()) {
            c0934e.f6408v = false;
            if (c0934e.f6388a != null) {
                for (C0934e c0934e2 : c0934e.f6388a) {
                    c0934e2.f6408v = false;
                }
            }
            if (c0934e.f6389b != null) {
                for (C0934e c0934e3 : c0934e.f6389b) {
                    c0934e3.f6408v = false;
                }
            }
            if (c0934e.f6390c != null) {
                for (C0934e c0934e4 : c0934e.f6390c) {
                    c0934e4.f6408v = false;
                }
            }
        }
        for (AbstractC0635i abstractC0635i : f2202h.values()) {
            abstractC0635i.f4069g = false;
        }
        byte[] bArr = null;
        byte[][] bArr2 = null;
        ByteBuffer[] byteBufferArr = null;
        try {
            bArr = new byte[8000000];
            bArr[0] = m1087A.f6286dY;
            m1087A.f6287dZ = bArr[1];
            bArr2 = new byte[]{new byte[3000000], new byte[3000000]};
            bArr2[0][0] = m1087A.f6286dY;
            bArr2[1][0] = m1087A.f6286dY;
            if (!Core.m1012as()) {
                byteBufferArr = new ByteBuffer[]{ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000)};
            }
        } catch (OutOfMemoryError e) {
            System.gc();
            Core.LogDebug2("Failed to reserve memory pre-mod load");
        }
        synchronized (C0453l.f3187c) {
            C0453l.f3187c.clear();
        }
        C0453l.f3188d.clear();
        C0453l.f3189e = null;
        C0453l.f3190f.clear();
        m1087A.f6124bZ.m1692n();
        f2191b = 0;
        f2192c = 0;
        synchronized (f2204n) {
            f2204n.clear();
        }
        m4302a(C0750a.m2264o("units"), 1, false, (C0824b) null, C0750a.m2264o("units"), (String) null);
        if (!Core.f6092aJ && !m1087A.f6228ar) {
            String m4267m = m4267m();
            if (!C0750a.m2273f(m4267m)) {
                Core.LogDebug2("Modded Custom '" + m4267m + "' directory not found");
            }
            Iterator it = m1695k.iterator();
            while (it.hasNext()) {
                C0824b c0824b = (C0824b) it.next();
                if (!c0824b.f5441y && c0824b.f5433q != null) {
                    String m1676j = c0824b.m1676j();
                    if (c0824b.f5429m) {
                        m1676j = C0750a.m2264o(m1676j);
                    }
                    Core.LogDebug2("Loading mod at:" + m1676j);
                    m4302a(m1676j, 2, true, c0824b, m1676j, (String) null);
                }
            }
            Iterator it2 = m1695k.iterator();
            while (it2.hasNext()) {
                C0824b c0824b2 = (C0824b) it2.next();
                if (c0824b2.f5441y && c0824b2.f5433q != null) {
                    String m1677i = c0824b2.m1677i();
                    Core.LogDebug2("Loading workshop mod at:" + m1677i);
                    m4302a(m1677i, 2, true, c0824b2, m1677i, (String) null);
                }
            }
        }
        m4320a();
        m4281b(true);
        Core.LogDebug2("Done loading custom units. image cacheHits:" + f2197j + " image cacheMisses:" + f2196i + " (in: " + C0727bl.m2438a(m2440a) + "ms)");
        Core.LogDebug2("========= Mods data loaded ===========");
        Core.LogDebug2("Number of mods:" + m1695k.size());
        Iterator it3 = m1695k.iterator();
        while (it3.hasNext()) {
            ((C0824b) it3.next()).m1666t();
        }
        Core.LogDebug2("================================");
        if (byteBufferArr != null) {
            byteBufferArr[0] = null;
            byteBufferArr[1] = null;
            byteBufferArr[2] = null;
            byteBufferArr[3] = null;
        }
        if (bArr2 != null) {
            bArr2[0] = null;
            bArr2[1] = null;
        }
        if (bArr != null) {
            bArr[1] = m1087A.f6286dY;
            m1087A.f6287dZ = bArr[1];
            System.gc();
            System.gc();
        }
    }

    /* renamed from: a */
    public static void m4302a(String str, int i, boolean z, C0824b c0824b, String str2, String str3) {
        boolean z2 = z && i == 1;
        Core m1087A = Core.m1087A();
        if (c0824b != null) {
            if (c0824b.f5422f && !m1087A.settingEngine.loadDisabledModData) {
                c0824b.f5445C = true;
                Core.LogDebug2("unitDataSkipped for: " + str);
                return;
            }
            c0824b.f5445C = false;
        }
        C0750a.m2281c();
        String[] m2272g = C0750a.m2272g(str);
        if (m2272g == null) {
            String m2281c = C0750a.m2281c();
            Core.m998b("readAllCustomUnitConfigs: ERROR");
            Core.m998b("readAllCustomUnitConfigs: Failed to load:" + str);
            if (c0824b != null) {
                if (!c0824b.f5446D) {
                    if (m2281c == null) {
                        c0824b.f5460R = "Failed to list directory, check file permissions";
                        return;
                    } else {
                        c0824b.f5460R = "Failed to list directory: " + m2281c;
                        return;
                    }
                }
                c0824b.f5461S = "Failed to list subdirectory: '" + str + "' check file permissions";
                if (m2281c != null) {
                    c0824b.f5461S += ": " + m2281c;
                    return;
                }
                return;
            }
            return;
        }
        if (c0824b != null) {
            c0824b.f5446D = true;
        }
        if (!z2) {
            for (String str4 : m2272g) {
                if (str4.equalsIgnoreCase("all-units.template")) {
                    str3 = str;
                }
            }
        }
        for (String str5 : m2272g) {
            if (!str5.equals("custom_units_here.txt") && !str5.equals("mods_here_will_be_enabled_by_default.txt") && !str5.equals("__MACOSX")) {
                boolean z3 = false;
                C0824b c0824b2 = c0824b;
                if (z && i == 1 && c0824b2 == null) {
                    c0824b2 = m1087A.f6124bZ.m1705d(str5);
                    if (c0824b2 == null) {
                        Core.m998b("readAllCustomUnitConfigs: Could not find linked mod:" + str5);
                        c0824b2 = m1087A.f6124bZ.f5413c;
                    }
                    z3 = true;
                }
                if (str5.toLowerCase(Locale.ENGLISH).endsWith(".ini") && !z2) {
                    String str6 = str + "/" + str5;
                    if (f2208r != c0824b2 && c0824b2 != null) {
                        f2208r = c0824b2;
                        m4320a();
                        Core.LogDebug2("Loading units from mod: " + c0824b2.f5419c);
                    }
                    if (str5.equalsIgnoreCase("desktop.ini")) {
                        Core.LogDebug2("Skipping possible system file: " + str6);
                    } else {
                        long m2440a = C0727bl.m2440a();
                        m4301a(str6, c0824b2, str2, str3);
                        m4318a(m2440a, EnumC0349ag.unitParse);
                    }
                } else if (str5.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                    String str7 = str + "/" + str5;
                    Core.LogDebug2("Found map: " + str7);
                    if (c0824b2 != null && c0824b2.f5444B) {
                        m1087A.f6124bZ.m1717a(str7, c0824b2);
                    } else {
                        Core.LogDebug2("Skipping map due to mod settings");
                    }
                } else {
                    String str8 = str + "/" + str5;
                    if (i < 10) {
                        if (C0750a.m2273f(str8)) {
                            String str9 = str2;
                            if (str9 == null) {
                                str9 = str8;
                            }
                            long j = -1;
                            if (z3) {
                                j = C0727bl.m2440a();
                                Core.LogDebug2("============");
                                Core.LogDebug2(">>> Mod '" + c0824b2.m1684c() + "'" + (c0824b2.m1673m() ? VariableScope.nullOrMissingString : " (disabled)"));
                            }
                            m4302a(str8, i + 1, z, c0824b2, str9, str3);
                            if (z3 && c0824b2 != null && c0824b2.m1673m()) {
                                Core.LogDebug2("Mod '" + c0824b2.m1684c() + "' load took:" + C0727bl.m2439a(C0727bl.m2438a(j)));
                            }
                        }
                    } else {
                        Core.LogDebug2("Too many levels:" + str8);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C0453l m4299a(String str, InputStream inputStream, long j, C0824b c0824b, C1098j c1098j, String str2, String str3) {
        boolean z;
        C0359aq c0359aq;
        String substring;
        boolean z2;
        Core m1087A = Core.m1087A();
        try {
            if (f2200a) {
                String str4 = "CORE";
                if (c0824b != null) {
                    str4 = c0824b.m1676j();
                }
                Core.LogDebug2("Loading unit config: " + str + " [" + str4 + "]");
            }
            m1087A.f6113bO.mo144e();
            long m2440a = C0727bl.m2440a();
            try {
                C1072ab c1072ab = new C1072ab(inputStream, str);
                m4318a(m2440a, EnumC0349ag.iniParse);
                C0453l c0453l = new C0453l();
                if (c1072ab.m675a("core", "dont_load", (Boolean) false).booleanValue()) {
                    return null;
                }
                c0453l.f2914C = str;
                c0453l.f2915D = c1098j.m540d();
                c0453l.f2916E = c0453l.f2914C;
                c0453l.f2919I = c0824b;
                c0453l.f2920J = str2;
                c0453l.f2921K = str3;
                f2194e = c0824b;
                f2195f = false;
                if (c0453l.f2919I != null) {
                }
                long m2440a2 = C0727bl.m2440a();
                m4314a(c0453l, c1072ab, c1072ab, str, 0);
                if (c0453l.f2921K != null) {
                    m4310a(c0453l, c1072ab, c0453l.f2921K + "/all-units.template", "AUTO units.template", true);
                }
                c1072ab.m682a("core", "copyFrom");
                c0453l.f2926Q = c1072ab.m657b("core", "strictLevel", (Integer) 0).intValue();
                if (c0453l.f2926Q < 0) {
                    throw new C0412bm("[core]strictLevel cannot be < 0");
                }
                if (c0453l.f2926Q > 1) {
                    throw new C0412bm("[core]strictLevel cannot yet be > 1");
                }
                c0453l.f3185gp = c1072ab.m675a("core", "logIfCreditResourceUsed", (Boolean) false).booleanValue();
                c1072ab.m682a("core", "dont_load");
                c1072ab.m656b("core", "class", "CustomUnitMetadata");
                Iterator it = c1072ab.m653c("@copyFrom_skipThisSection").iterator();
                while (it.hasNext()) {
                    c1072ab.m682a((String) it.next(), "@copyFrom_skipThisSection");
                }
                Iterator it2 = c1072ab.m653c("@copyFromSection").iterator();
                while (it2.hasNext()) {
                    String str5 = (String) it2.next();
                    m4313a(c0453l, c1072ab, str5, str5, 0);
                }
                C0442a.m3978a(c0453l, c1072ab);
                String m656b = c1072ab.m656b("core", "overrideResourceLoadPath", (String) null);
                if (m656b != null) {
                    c0453l.f2916E = m4309a(c0453l, str, m656b);
                }
                m4318a(m2440a2, EnumC0349ag.iniSetup);
                c0453l.f2922L = c1072ab.m643e("core", "name");
                c0453l.f2917G = c1072ab.m655c();
                if (c0453l.f2922L.equals("self")) {
                    throw new C0412bm("Unit name: " + c0453l.f2922L + " is reserved");
                }
                if (c0453l.f2922L.startsWith("self.")) {
                    throw new C0412bm("Unit name cannot start with self.");
                }
                String m656b2 = c1072ab.m656b("core", "altNames", (String) null);
                if (m656b2 != null && !m656b2.equalsIgnoreCase("NONE")) {
                    for (String str6 : m656b2.split(",")) {
                        c0453l.f3208M.add(str6.trim());
                    }
                }
                c0453l.f2923N = C0448g.m3957a(c1072ab.m656b("core", "tags", (String) null));
                if (c0453l.f2926Q >= 1 && c0453l.f2923N != null) {
                    for (C0448g c0448g : c0453l.f2923N.f2838a) {
                        if (c0448g.f2834a.contains(" ")) {
                            throw new C0412bm("(strictLevel 1) [core]tags: space in tag: '" + c0448g.f2834a + "'");
                        }
                    }
                }
                c0453l.f2925P = c1072ab.m656b("core", "overrideAndReplace", (String) null);
                if (c0453l.f2925P != null && c0453l.f2925P.equalsIgnoreCase("NONE")) {
                    c0453l.f2925P = null;
                }
                String m656b3 = c1072ab.m656b("core", "defineUnitMemory", (String) null);
                if (m656b3 != null) {
                    c0453l.f3205q.addDefineValue(c0453l, "core", "defineUnitMemory", m656b3);
                }
                Iterator it3 = c1072ab.m629k("core", "@memory ").iterator();
                while (it3.hasNext()) {
                    String str7 = (String) it3.next();
                    String trim = str7.substring("@memory ".length()).trim();
                    String m656b4 = c1072ab.m656b("core", str7, (String) null);
                    if (m656b4 != null) {
                        if (!m656b4.contains(",")) {
                            c0453l.f3205q.addSingleDefine(c0453l, trim, m656b4, "core", str7);
                        } else {
                            throw new C0412bm("[core]" + str7 + ": Only a single variable can be defined per @memory");
                        }
                    }
                }
                c0453l.f2928S = (EnumC0345ac) c1072ab.m674a("core", "onNewMapSpawn", (Enum) null, EnumC0345ac.class);
                c0453l.f3227aF = c1072ab.m673a("core", "globalScale", Float.valueOf(1.0f)).floatValue();
                c0453l.m3671o(c0453l.f2915D);
                if (c0453l.f2922L.equals("missing")) {
                    if (c0824b == null) {
                        Core.LogDebug2("Setting missingPlaceHolder");
                        C0453l.f2903b = c0453l;
                    } else {
                        Core.LogDebug2("Not setting missingPlaceHolder, as we are in a mod");
                    }
                }
                c0453l.f2947aD = c1072ab.m656b("core", "displayLocaleKey", (String) null);
                c0453l.f2945aB = m4305a(c1072ab, "core", "displayText", (String) null);
                c0453l.f2946aC = m4305a(c1072ab, "core", "displayDescription", (String) null);
                c0453l.f3120eB = c1072ab.m675a("core", "isBio", (Boolean) false).booleanValue();
                c0453l.f3121eC = c1072ab.m675a("core", "isBug", (Boolean) false).booleanValue();
                c0453l.f3124eF = c1072ab.m675a("core", "isPickableStartingUnit", (Boolean) false).booleanValue();
                c0453l.f3125eG = c1072ab.m675a("core", "startFallingWhenStartingUnit", (Boolean) false).booleanValue();
                c0453l.f3026cw = c1072ab.m675a("core", "stayNeutral", (Boolean) false).booleanValue();
                c0453l.f3027cx = c1072ab.m675a("core", "createNeutral", (Boolean) false).booleanValue();
                c0453l.f3028cy = c1072ab.m675a("core", "allowCaptureWhenNeutralByAI", (Boolean) false).booleanValue();
                if (c1072ab.m675a("core", "createOnNeutralTeam", (Boolean) false).booleanValue()) {
                    c0453l.f3027cx = true;
                }
                c0453l.f3029cz = c1072ab.m675a("core", "whileNeutralTransportAnyTeam", (Boolean) false).booleanValue();
                c0453l.f3030cA = c1072ab.m675a("core", "whileNeutralConvertToTransportedTeam", (Boolean) false).booleanValue();
                c0453l.f3031cB = c1072ab.m675a("core", "convertToNeutralIfNotTransporting", (Boolean) false).booleanValue();
                if (c0453l.f3031cB) {
                    c0453l.f3026cw = true;
                }
                c0453l.f3032cC = c1072ab.m675a("core", "createOnAggressiveTeam", (Boolean) false).booleanValue();
                c0453l.f2948aE = c1072ab.m675a("core", "showInEditor", (Boolean) true).booleanValue();
                c0453l.f3209T = c1072ab.m657b("graphics", "total_frames", (Integer) 1).intValue();
                if (c0453l.f3209T < 1) {
                    throw new C0412bm("TOTAL_FRAMES cannot be: " + c0453l.f3209T + " (must be 1 or more)");
                }
                c0453l.f3211V = c1072ab.m657b("graphics", "frame_width", (Integer) (-1)).intValue();
                c0453l.f3212W = c1072ab.m657b("graphics", "frame_height", (Integer) (-1)).intValue();
                c0453l.f2929X = c1072ab.m657b("graphics", "default_frame", (Integer) 0).intValue();
                c0453l.f2936ag = c1072ab.m657b("graphics", "image_offsetX", (Integer) 0).intValue();
                c0453l.f2937ah = c1072ab.m657b("graphics", "image_offsetY", (Integer) 0).intValue();
                c0453l.f2938ai = c1072ab.m673a("graphics", "image_offsetH", Float.valueOf(0.0f)).floatValue();
                if (c0453l.f2936ag != 0 || c0453l.f2937ah != 0 || c0453l.f2938ai != 0.0f) {
                    c0453l.f2939aj = true;
                }
                c0453l.f2933ab = EnumC0198o.f1379a;
                if (c1072ab.m675a("graphics", "teamColorsUseHue", (Boolean) false).booleanValue()) {
                    c0453l.f2933ab = EnumC0198o.f1380b;
                }
                String m656b5 = c1072ab.m656b("graphics", "teamColoringMode", (String) null);
                if (m656b5 != null) {
                    if (c1072ab.m675a("graphics", "teamColorsUseHue", (Boolean) null) != null) {
                        throw new C0412bm("Cannot use teamColoringMode and teamColorsUseHue at the same time");
                    }
                    if (m656b5.equalsIgnoreCase("pureGreen")) {
                        c0453l.f2933ab = EnumC0198o.f1379a;
                    } else if (m656b5.equalsIgnoreCase("hueAdd")) {
                        c0453l.f2933ab = EnumC0198o.f1380b;
                    } else if (m656b5.equalsIgnoreCase("hueShift")) {
                        c0453l.f2933ab = EnumC0198o.f1382d;
                    } else if (m656b5.equalsIgnoreCase("disabled")) {
                        c0453l.f2933ab = EnumC0198o.f1383e;
                    } else {
                        throw new C0412bm("Unknown teamColoringMode:" + m656b5);
                    }
                }
                c0453l.f2932aa = c1072ab.m675a("graphics", "imageSmoothing", (Boolean) false).booleanValue();
                c0453l.f2931Z = c1072ab.m675a("graphics", "imageSmoothingWhenZoomedIn", (Boolean) false).booleanValue();
                c0453l.f2930Y = c1072ab.m694a(c0453l, "graphics", "isVisible", (LogicBoolean) null);
                if (c0453l.f2930Y == LogicBoolean.trueBoolean) {
                    c0453l.f2930Y = null;
                }
                c0453l.f3246cJ.f2250m = c1072ab.m675a("graphics", "isVisibleToEnemies", (Boolean) true).booleanValue();
                c0453l.f3213ac = c0453l.m3711a(c0453l.f2916E, c1072ab.m643e("graphics", "image"), c0453l.f2932aa, "graphics", "image");
                if (c0453l.f3213ac == null) {
                    throw new C0412bm("Main unit image must be set on custom unit");
                }
                c0453l.f3214ad = c1072ab.m675a("graphics", "image_floatingPointSize", (Boolean) false).booleanValue();
                c0453l.f2934ae = c0453l.f3213ac.mo386m() / c0453l.f3209T;
                c0453l.f2935af = c0453l.f3213ac.mo387l();
                if (c0453l.f2934ae < 1) {
                    c0453l.f2934ae = 1;
                }
                if (c0453l.f3211V > 0) {
                    c0453l.f2934ae = c0453l.f3211V;
                }
                if (c0453l.f3212W > 0) {
                    c0453l.f2935af = c0453l.f3212W;
                    if (c0453l.f2935af < c0453l.f3213ac.mo387l()) {
                        c0453l.f3210U = c0453l.f3213ac.mo386m() / c0453l.f2934ae;
                        if (c0453l.f3210U < 1) {
                            c0453l.f3210U = 1;
                        }
                    }
                }
                c0453l.f3215ak = c0453l.m3718a(c1072ab, "graphics", "image_back");
                c0453l.f2940al = c1072ab.m675a("graphics", "image_back_always_use_full_image", (Boolean) false).booleanValue();
                c0453l.f3216am = c0453l.m3718a(c1072ab, "graphics", "image_wreak");
                c0453l.f3217an = c0453l.m3718a(c1072ab, "graphics", "image_turret");
                c0453l.f2942ar = AbstractC0529j.f3650dL;
                String m656b6 = c1072ab.m656b("graphics", "image_shadow", "NONE");
                if (m656b6.equalsIgnoreCase("AUTO")) {
                    String str8 = "[autoShadow:" + c0453l.f2934ae + "," + c0453l.f2935af + "]" + c0453l.f3213ac.f6392d + "-" + c0453l.f3213ac.f6393e;
                    C0934e m4279c = m4279c(str8);
                    if (m4279c != null) {
                        c0453l.f3218ao = m4279c;
                    } else {
                        c0453l.f3218ao = AbstractC0244am.m4777a(c0453l.f3213ac, c0453l.f2934ae, c0453l.f2935af);
                        m4306a(c0453l.f3218ao);
                        if (c0453l.f3218ao != null) {
                            m4300a(str8, c0453l.f3218ao);
                        }
                    }
                } else if (m656b6.equalsIgnoreCase("AUTO_ANIMATED")) {
                    String str9 = "[autoShadowAnimated:" + c0453l.f2934ae + "," + c0453l.f2935af + "]" + c0453l.f3213ac.f6392d + "-" + c0453l.f3213ac.f6393e;
                    C0934e m4279c2 = m4279c(str9);
                    if (m4279c2 != null) {
                        c0453l.f3218ao = m4279c2;
                    } else {
                        c0453l.f3218ao = AbstractC0244am.m4777a(c0453l.f3213ac, c0453l.f3213ac.mo386m(), c0453l.f3213ac.mo387l());
                        m4306a(c0453l.f3218ao);
                        if (c0453l.f3218ao != null) {
                            m4300a(str9, c0453l.f3218ao);
                        }
                    }
                    c0453l.f2941ap = true;
                } else {
                    c0453l.f3218ao = c0453l.m3711a(c0453l.f2916E, m656b6, c0453l.f2932aa, "graphics", "image_shadow");
                }
                if (c1072ab.m675a("graphics", "image_shadow_frames", (Boolean) false).booleanValue()) {
                    c0453l.f2941ap = true;
                }
                c0453l.f3219aq = c0453l.m3719a(c0453l.f3213ac, c0453l.f2933ab);
                c0453l.f2904r = c1072ab.m675a("graphics", "teamColorsOnTurret", (Boolean) false).booleanValue();
                if (c0453l.f2904r && c0453l.f3217an != null) {
                    c0453l.f3220as = c0453l.m3719a(c0453l.f3217an, c0453l.f2933ab);
                }
                float floatValue = c1072ab.m673a("graphics", "scaleImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue > 0.0f) {
                    c0453l.f3233bH = (floatValue * c0453l.f3227aF) / c0453l.f2934ae;
                }
                float floatValue2 = c1072ab.m673a("graphics", "imageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue2 != 1.0f) {
                    c0453l.f3233bH *= floatValue2;
                }
                float floatValue3 = c1072ab.m673a("graphics", "scaleTurretImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue3 > 0.0f) {
                    float f = floatValue3 * c0453l.f3227aF;
                    if (c0453l.f3217an == null) {
                        throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
                    }
                    c0453l.f3234bI = f / c0453l.f3217an.f6402p;
                }
                float floatValue4 = c1072ab.m673a("graphics", "turretImageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue4 != 1.0f) {
                    c0453l.f3234bI *= floatValue4;
                }
                c0453l.f3221at = C0520c.f3599e;
                C0934e m3718a = c0453l.m3718a(c1072ab, "graphics", "image_shield");
                if (m3718a != null) {
                    c0453l.f3221at = m3718a;
                    c0453l.f3222au = true;
                }
                c0453l.f2943av = c0453l.m3717a(c1072ab, "graphics", "icon_build", false);
                float mo386m = c0453l.f3213ac.mo386m() * c0453l.f3233bH;
                float mo387l = c0453l.f3213ac.mo387l() * c0453l.f3233bH;
                if (mo386m / 2.0f > 90.0f || mo387l / 2.0f > 90.0f) {
                    c0453l.f2913B = new Rect();
                    c0453l.f2913B.f230a = (int) ((-mo386m) / 2.0f);
                    c0453l.f2913B.f232c = (int) (mo386m / 2.0f);
                    c0453l.f2913B.f231b = (int) ((-mo387l) / 2.0f);
                    c0453l.f2913B.f233d = (int) (mo387l / 2.0f);
                    c0453l.f2912A = true;
                }
                Iterator it4 = c1072ab.m627m("resource_", "global_resource_").iterator();
                while (it4.hasNext()) {
                    String str10 = (String) it4.next();
                    if (str10.startsWith("resource_")) {
                        substring = str10.substring("resource_".length());
                        z2 = false;
                    } else {
                        substring = str10.substring("global_resource_".length());
                        z2 = true;
                    }
                    String trim2 = substring.trim();
                    if (trim2.contains(" ")) {
                        throw new RuntimeException("[" + str10 + "] resource codename cannot contain a space");
                    }
                    if (trim2.contains("=") || trim2.contains("|") || trim2.contains(":") || trim2.contains(",") || trim2.contains("(") || trim2.contains(")") || trim2.contains("<") || trim2.contains(">") || trim2.contains("$")) {
                        throw new RuntimeException("[" + str10 + "] resource codename cannot contain the symbols: =|:,()<>$");
                    }
                    C0437d c0437d = new C0437d(z2);
                    c0437d.m4029a(c0453l, c1072ab, str10, trim2);
                    if (c0453l.m3679k(c0437d.f2772a) != null) {
                        throw new RuntimeException("[" + str10 + "] resource with name:" + c0437d.f2772a + " already exists in this file");
                    }
                    c0453l.f3198j.add(c0437d);
                }
                Iterator it5 = c0453l.f3198j.iterator();
                while (it5.hasNext()) {
                    ((C0437d) it5.next()).m4030a(c0453l);
                }
                if (m1087A.m958o()) {
                    C0397k.m4200a(c0453l, c1072ab);
                    C0395i.m4204a(c0453l, c1072ab);
                }
                C0398l.m4188a(c0453l, c1072ab);
                c0453l.f3235ca = c1072ab.m658b("core", "autoTriggerCooldownTime", Float.valueOf(60.0f)).floatValue();
                if (c0453l.f3235ca < 0.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be < 0");
                }
                if (c0453l.f3235ca > 120.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be more than 2 seconds");
                }
                if (!c1072ab.m675a("core", "autoTriggerCooldownTime_allowDangerousHighCPU", (Boolean) false).booleanValue() && c0453l.f3235ca < 5.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be this low (without override). Note this cooldown is only applied after triggering an action not for the detection.");
                }
                c0453l.f3236cb = (EnumC0461s) c1072ab.m674a("core", "autoTriggerCheckRate", EnumC0461s.f3340a, EnumC0461s.class);
                c0453l.f3246cJ.f2239b = c1072ab.m637g("core", "mass");
                c0453l.f3014cc = c1072ab.m675a("core", "availableInDemo", (Boolean) true).booleanValue();
                c0453l.f3015cd = c1072ab.m675a("core", "isLocked", (Boolean) false).booleanValue();
                c0453l.f3016ce = c1072ab.m675a("core", "isLockedIfGameModeNoNuke", (Boolean) false).booleanValue();
                c0453l.f3017cf = C0424b.m4114a(c0453l, c1072ab, "core", "price", false);
                c0453l.f3018cg = C0424b.m4115a(c0453l, c1072ab, "core", "reclaimPrice", (C0424b) null);
                c0453l.f3019ch = C0424b.m4100b(c0453l, c1072ab, "core", "streamingCost", null);
                boolean booleanValue = c1072ab.m675a("core", "switchPriceWithStreamingCost", (Boolean) false).booleanValue();
                if (booleanValue) {
                    if (c0453l.f3019ch != null) {
                        throw new RuntimeException("[core]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                    }
                    c0453l.f3019ch = C0424b.m4100b(c0453l, c1072ab, "core", "price", null);
                    c0453l.f3017cf = C0424b.f2710a;
                }
                c0453l.f3237ci = c1072ab.m646d("core", "buildSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3020cj = c1072ab.m657b("core", "techLevel", (Integer) 1).intValue();
                if (c0453l.f3020cj > 3) {
                    throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
                }
                if (c0453l.f3020cj < 1) {
                    throw new RuntimeException("techLevel cannot be less than 1, it is:" + c0453l.f3020cj);
                }
                c0453l.f3021ck = c1072ab.m675a("core", "experimental", (Boolean) false).booleanValue();
                c0453l.f3243ct = C0424b.m4114a(c0453l, c1072ab, "core", "borrowResourcesWhileAlive", true);
                c0453l.f3244cu = C0424b.m4114a(c0453l, c1072ab, "core", "borrowResourcesWhileBuilt", true);
                c0453l.f3238cm = C0424b.m4114a(c0453l, c1072ab, "core", "generation_resources", true);
                int intValue = c1072ab.m657b("core", "generation_credits", (Integer) 0).intValue();
                if (intValue != 0) {
                    c0453l.f3238cm = C0424b.m4116a(c0453l.f3238cm, C0424b.m4125a(intValue));
                }
                c0453l.f3023cp = c1072ab.m657b("core", "generation_delay", (Integer) 40).intValue();
                if (c0453l.f3023cp == 0) {
                    c0453l.f3023cp = 1;
                }
                if (c0453l.f3023cp < 0) {
                    throw new RuntimeException("[core]generation_delay cannot be < 0");
                }
                c0453l.f3024cq = 40.0f / c0453l.f3023cp;
                if (!c0453l.f3238cm.m4106b()) {
                    c0453l.f3239cn = new C0439f();
                    c0453l.f3239cn.m4024a(c0453l.f3238cm);
                    c0453l.f3239cn.m4027a(c0453l.f3024cq);
                    c0453l.f3022cl = true;
                }
                if (!c0453l.f3239cn.m3999c()) {
                    Iterator it6 = c0453l.f3239cn.f2802b.iterator();
                    while (it6.hasNext()) {
                        C0438e c0438e = (C0438e) it6.next();
                        if (!c0438e.f2799a.m4051b() && c0438e.f2799a.m4048c()) {
                            if (c0453l.f3240co == C0439f.f2801a) {
                                c0453l.f3240co = new C0439f();
                            }
                            c0453l.f3240co.m4006b(c0438e.f2799a, c0438e.f2800b);
                        }
                    }
                }
                c0453l.f3025cv = c1072ab.m694a(c0453l, "core", "generation_active", LogicBoolean.trueBoolean);
                c0453l.m3727a(c0453l.f3238cm);
                c0453l.f3033cD = c1072ab.m673a("core", "resourceRate", Float.valueOf(0.0f)).floatValue();
                if (booleanValue && c0453l.f3033cD != 0.0f) {
                    throw new RuntimeException("To avoid mistakes [core]resourceRate cannot be used with switchPriceWithStreamingCost=true");
                }
                String m656b7 = c1072ab.m656b("core", "updateUnitMemory", (String) null);
                if (m656b7 != null) {
                    c0453l.f3241cr = VariableScope.createMemoryWriter(m656b7, c0453l, "core", "updateUnitMemory");
                }
                c0453l.f3242cs = c1072ab.m658b("core", "updateUnitMemoryRate", Float.valueOf(60.0f)).floatValue();
                c0453l.f3034cE = c1072ab.m657b("core", "resourceMaxConcurrentReclaimingThis", (Integer) Integer.MAX_VALUE).intValue();
                c0453l.f3035cF = c1072ab.m695a(c0453l, "core", "similarResourcesHaveTag", (C0449h) null);
                c0453l.f3063dm = C0409bj.m4159a(c0453l, c1072ab.m656b("core", "soundOnAttackOrder", (String) null));
                c0453l.f3064dn = C0409bj.m4159a(c0453l, c1072ab.m656b("core", "soundOnMoveOrder", (String) null));
                c0453l.f3065do = C0409bj.m4159a(c0453l, c1072ab.m656b("core", "soundOnNewSelection", (String) null));
                String m656b8 = c1072ab.m656b("graphics", "drawLayer", (String) null);
                if (m656b8 != null) {
                    if (m656b8.equals("experimentals")) {
                        c0453l.f3245cG = 4;
                    } else if (m656b8.equals("underwater")) {
                        c0453l.f3245cG = 1;
                    } else if (m656b8.equals("bottom")) {
                        c0453l.f3245cG = 1;
                    } else if (m656b8.equals("ground")) {
                        c0453l.f3245cG = 2;
                    } else if (m656b8.equals("ground2")) {
                        c0453l.f3245cG = 3;
                    } else if (m656b8.equals("air")) {
                        c0453l.f3245cG = 5;
                    } else if (m656b8.equals("top")) {
                        c0453l.f3245cG = 10;
                    } else if (m656b8.equals("wreaks")) {
                        c0453l.f3245cG = 0;
                    } else {
                        throw new RuntimeException("unknown drawLayer:" + m656b8);
                    }
                }
                c0453l.f3036cH = c1072ab.m673a("graphics", "shadowOffsetX", Float.valueOf(0.0f)).floatValue();
                c0453l.f3037cI = c1072ab.m673a("graphics", "shadowOffsetY", Float.valueOf(0.0f)).floatValue();
                c0453l.f3072dz = c1072ab.m675a("graphics", "rotate_with_direction", (Boolean) true).booleanValue();
                c0453l.f3073dA = c1072ab.m675a("graphics", "lock_body_rotation_with_main_turret", (Boolean) false).booleanValue();
                c0453l.f3074dB = c1072ab.m675a("graphics", "lock_shadow_rotation_with_main_turret", Boolean.valueOf(c0453l.f3073dA)).booleanValue();
                c0453l.f3075dC = c1072ab.m675a("graphics", "lock_leg_rotation_with_main_turret", (Boolean) false).booleanValue();
                c0453l.f3077dE = c1072ab.m673a("graphics", "whenBeingBuiltMakeTransparentTill", Float.valueOf(1.0f)).floatValue();
                c0453l.f3078dF = C0455m.m3654a(c0453l, c1072ab, "graphics", "animation_", false);
                Iterator it7 = c1072ab.m644e("effect_").iterator();
                while (it7.hasNext()) {
                    String str11 = (String) it7.next();
                    C0382aw c0382aw = new C0382aw(str11.substring("effect_".length()));
                    c0382aw.m4230a(c0453l, c1072ab, str11);
                    c0453l.f3276ga.add(c0382aw);
                }
                Iterator it8 = c0453l.f3276ga.iterator();
                while (it8.hasNext()) {
                    C0382aw c0382aw2 = (C0382aw) it8.next();
                    if (c0382aw2.alsoEmitEffects != null) {
                        c0382aw2.alsoEmitEffects.m3634c();
                    }
                    if (c0382aw2.alsoEmitEffectsOnDeath != null) {
                        c0382aw2.alsoEmitEffectsOnDeath.m3634c();
                    }
                    if (c0382aw2.ifSpawnFailsEmitEffects != null) {
                        c0382aw2.ifSpawnFailsEmitEffects.m3634c();
                    }
                    if (c0382aw2.trailEffect != null) {
                        c0382aw2.trailEffect.m3634c();
                    }
                }
                c0453l.f2997bJ = c1072ab.m675a("graphics", "splastEffect", (Boolean) false).booleanValue();
                c0453l.f3000bM = c1072ab.m675a("graphics", "dustEffect", (Boolean) false).booleanValue();
                c0453l.f2998bK = c1072ab.m675a("graphics", "splastEffectReverse", (Boolean) true).booleanValue();
                c0453l.f3001bN = c1072ab.m675a("graphics", "dustEffectReverse", (Boolean) true).booleanValue();
                c0453l.f2999bL = c0453l.f3000bM || c0453l.f2997bJ;
                String m656b9 = c1072ab.m656b("graphics", "movementEffect", (String) null);
                if (m656b9 != null) {
                    c0453l.f3002bO = c0453l.m3713a(m656b9, (C0467y) null);
                    if (c0453l.f3002bO != null && c0453l.f3002bO.m3638a()) {
                        c0453l.f2999bL = true;
                    }
                }
                String m656b10 = c1072ab.m656b("graphics", "movementEffectReverse", (String) null);
                if (m656b10 != null) {
                    c0453l.f3003bP = c0453l.m3713a(m656b10, (C0467y) null);
                    if (c0453l.f3003bP != null && c0453l.f3003bP.m3638a()) {
                        c0453l.f2999bL = true;
                    }
                }
                c0453l.f3005bR = c1072ab.m673a("graphics", "movementEffectRate", Float.valueOf(11.0f)).floatValue();
                c0453l.f3004bQ = c1072ab.m675a("graphics", "movementEffectReverseFlipEffects", (Boolean) false).booleanValue();
                c0453l.f3007bT = c1072ab.m673a("graphics", "repairEffectRate", Float.valueOf(5.0f)).floatValue();
                String m656b11 = c1072ab.m656b("graphics", "repairEffect", (String) null);
                if (m656b11 != null) {
                    c0453l.f3008bU = c0453l.m3713a(m656b11, (C0467y) null);
                    if (c0453l.f3008bU != null && c0453l.f3008bU.m3635b()) {
                        c0453l.f3006bS = true;
                    }
                }
                String m656b12 = c1072ab.m656b("graphics", "repairEffectAtTarget", (String) null);
                if (m656b12 != null) {
                    c0453l.f3009bV = c0453l.m3713a(m656b12, (C0467y) null);
                    if (c0453l.f3009bV != null && c0453l.f3009bV.m3635b()) {
                        c0453l.f3006bS = true;
                    }
                }
                c0453l.f3011bX = c1072ab.m673a("graphics", "reclaimEffectRate", Float.valueOf(5.0f)).floatValue();
                String m656b13 = c1072ab.m656b("graphics", "reclaimEffect", (String) null);
                if (m656b13 != null) {
                    c0453l.f3012bY = c0453l.m3713a(m656b13, (C0467y) null);
                    if (c0453l.f3012bY != null && c0453l.f3012bY.m3635b()) {
                        c0453l.f3010bW = true;
                    }
                }
                String m656b14 = c1072ab.m656b("graphics", "reclaimEffectAtTarget", (String) null);
                if (m656b14 != null) {
                    c0453l.f3013bZ = c0453l.m3713a(m656b14, (C0467y) null);
                    if (c0453l.f3013bZ != null && c0453l.f3013bZ.m3635b()) {
                        c0453l.f3010bW = true;
                    }
                }
                c0453l.f3251dq.m3982a(c0453l, c1072ab, "graphics", "animation_" + c0453l.f3251dq.f2805a + "_");
                c0453l.f3252dr.m3982a(c0453l, c1072ab, "graphics", "animation_" + c0453l.f3252dr.f2805a + "_");
                c0453l.f3253ds.m3982a(c0453l, c1072ab, "graphics", "animation_" + c0453l.f3253ds.f2805a + "_");
                Iterator it9 = c1072ab.m644e("animation_").iterator();
                while (it9.hasNext()) {
                    String str12 = (String) it9.next();
                    C0441f c0441f = new C0441f(str12.substring("animation_".length()));
                    c0441f.m3982a(c0453l, c1072ab, str12, VariableScope.nullOrMissingString);
                    c0453l.f3250dp.add(c0441f);
                }
                c0453l.f3251dq = c0453l.m3722a(EnumC0456n.f3316a, c0453l.f3251dq, true);
                c0453l.f3252dr = c0453l.m3722a(EnumC0456n.f3318c, c0453l.f3252dr, true);
                c0453l.f3253ds = c0453l.m3722a(EnumC0456n.f3317b, c0453l.f3253ds, true);
                c0453l.f3067du = c0453l.m3723a(EnumC0456n.f3320e);
                c0453l.f3068dv = c0453l.m3723a(EnumC0456n.f3321f);
                if (c0453l.f3067du != null && c0453l.f3068dv != null) {
                    throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
                }
                c0453l.f3066dt = c0453l.m3723a(EnumC0456n.f3319d);
                c0453l.f3069dw = c0453l.m3723a(EnumC0456n.f3322g);
                if (c0453l.f3069dw != null) {
                    c0453l.f2972bg = true;
                }
                c0453l.f3070dx = c0453l.m3723a(EnumC0456n.f3323h);
                c0453l.f3071dy = c0453l.m3723a(EnumC0456n.f3324i);
                c0453l.f3246cJ.f2240c = c1072ab.m637g("core", "maxHp");
                c0453l.f3246cJ.f2244g = c1072ab.m657b("core", "maxShield", (Integer) 0).intValue();
                c0453l.f3038cK = c1072ab.m675a("core", "startShieldAtZero", (Boolean) false).booleanValue();
                c0453l.f3246cJ.f2245h = c1072ab.m673a("core", "shieldRegen", Float.valueOf(0.25f)).floatValue();
                c0453l.f3046cS = c1072ab.m675a("core", "shieldDisplayOnlyDeflection", (Boolean) false).booleanValue();
                c0453l.f3047cT = c1072ab.m673a("core", "shieldDeflectionDisplayRate", Float.valueOf(4.0f)).floatValue();
                c0453l.f3246cJ.f2249l = c1072ab.m673a("core", "armour", Float.valueOf(0.0f)).floatValue();
                c0453l.f3039cL = c1072ab.m673a("core", "armourMinDamageToKeep", Float.valueOf(1.0f)).floatValue();
                c0453l.f3246cJ.f2241d = c1072ab.m673a("core", "energyMax", Float.valueOf(0.0f)).floatValue();
                c0453l.f3040cM = c1072ab.m675a("core", "startEnergyAtZero", (Boolean) false).booleanValue();
                c0453l.f3041cN = c1072ab.m673a("core", "energyRegen", Float.valueOf(0.0f)).floatValue();
                c0453l.f3044cQ = c1072ab.m673a("core", "energyStartingPercentage", Float.valueOf(1.0f)).floatValue();
                c0453l.f3043cP = c1072ab.m675a("core", "energyNeedsToRechargeToFull", (Boolean) false).booleanValue();
                c0453l.f3042cO = c1072ab.m673a("core", "energyRegenWhenRecharging", Float.valueOf(c0453l.f3041cN)).floatValue();
                c0453l.f3045cR = m4305a(c1072ab, "core", "energyDisplayName", (String) null);
                c0453l.f3048cU = c1072ab.m637g("core", "radius");
                c0453l.f3052db = c1072ab.m657b("core", "displayRadius", Integer.valueOf(c0453l.f3048cU)).intValue();
                float f2 = c0453l.f3048cU;
                if (f2 < 6.0f) {
                    f2 = 6.0f;
                }
                c0453l.f3053dc = c1072ab.m673a("core", "uiTargetRadius", Float.valueOf(f2)).floatValue();
                c0453l.f3054dd = c1072ab.m657b("core", "shieldRenderRadius", Integer.valueOf(c0453l.f3048cU)).intValue();
                c0453l.f3055de = c1072ab.m657b("core", "buildingSelectionOffset", (Integer) 0).intValue();
                c0453l.f3247cV = c1072ab.m678a("core", "footprint", c0453l.f3247cV);
                c0453l.f3248cW = c1072ab.m678a("core", "constructionFootprint", c0453l.f3248cW);
                c0453l.f3249cX.m5873a(c0453l.f3247cV);
                c0453l.f3249cX = c1072ab.m678a("core", "displayFootprint", c0453l.f3249cX);
                c0453l.f3049cY = c1072ab.m673a("core", "buildingToFootprintOffsetX", Float.valueOf(10.0f)).floatValue();
                c0453l.f3050cZ = c1072ab.m673a("core", "buildingToFootprintOffsetY", Float.valueOf(10.0f)).floatValue();
                c0453l.f3048cU = (int) (c0453l.f3048cU * c0453l.f3227aF);
                c0453l.f3052db = (int) (c0453l.f3052db * c0453l.f3227aF);
                c0453l.f3246cJ.f2251n = c1072ab.m657b("core", "fogOfWarSightRange", (Integer) 15).intValue();
                c0453l.f3056df = c1072ab.m657b("core", "fogOfWarSightRangeWhileNotBuilt", (Integer) (-1)).intValue();
                c0453l.f3057dg = c1072ab.m673a("core", "exit_x", Float.valueOf(0.0f)).floatValue();
                c0453l.f3058dh = c1072ab.m673a("core", "exit_y", Float.valueOf(9.0f)).floatValue();
                c0453l.f3059di = c1072ab.m673a("core", "exit_dirOffset", (Float) null);
                c0453l.f3060dj = c1072ab.m673a("core", "exit_heightOffset", Float.valueOf(0.0f)).floatValue();
                c0453l.f3061dk = c1072ab.m675a("core", "exitHeightIgnoreParent", (Boolean) false).booleanValue();
                c0453l.f3062dl = c1072ab.m673a("core", "exit_moveAwayAmount", Float.valueOf(70.0f));
                c0453l.f3118ez = c1072ab.m657b("core", "softCollisionOnAll", (Integer) 0).intValue();
                c0453l.f3119eA = c1072ab.m675a("core", "disableAllUnitCollisions", (Boolean) false).booleanValue();
                if (c0453l.f3119eA) {
                    c0453l.f3247cV.m5874a(0, 0, -1, -1);
                }
                c0453l.f3260eH = c1072ab.m675a("core", "hideScorchMark", (Boolean) false).booleanValue();
                c0453l.f3261eI = c1072ab.m675a("graphics", "disableLowHpFire", Boolean.valueOf(c0453l.f3120eB)).booleanValue();
                c0453l.f3262eJ = c1072ab.m675a("graphics", "disableLowHpSmoke", Boolean.valueOf(c0453l.f3120eB)).booleanValue();
                c0453l.f2949aG = c1072ab.m675a("core", "isBuilding", (Boolean) false).booleanValue();
                c0453l.f2950aH = c1072ab.m675a("core", "ignoreInUnitCapCalculation", Boolean.valueOf(c0453l.f2949aG)).booleanValue();
                c0453l.f2951aI = c1072ab.m675a("core", "placeOnlyOnResPool", (Boolean) false).booleanValue();
                c0453l.f2952aJ = c1072ab.m675a("core", "isUnrepairableUnit", (Boolean) false).booleanValue();
                c0453l.f2953aK = c1072ab.m673a("core", "extraBuildRangeWhenBuildingThis", Float.valueOf(0.0f)).floatValue();
                c0453l.f2954aL = c1072ab.m675a("core", "isUnselectable", (Boolean) false).booleanValue();
                c0453l.f2955aM = c1072ab.m675a("core", "isUnselectableAsTarget", Boolean.valueOf(c0453l.f2954aL)).booleanValue();
                c0453l.f3172fM = c1072ab.m695a(c0453l, "core", "showActionsWithMixedSelectionIfOtherUnitsHaveTag", (C0449h) null);
                c0453l.f2956aN = c1072ab.m675a("core", "canNotBeDirectlyAttacked", (Boolean) false).booleanValue();
                c0453l.f2957aO = c1072ab.m675a("core", "canNotBeDamaged", Boolean.valueOf(c0453l.f2956aN)).booleanValue();
                c0453l.f2958aP = c1072ab.m675a("core", "showOnMinimap", (Boolean) true).booleanValue();
                c0453l.f2959aQ = c1072ab.m675a("core", "showOnMinimapToEnemies", Boolean.valueOf(c0453l.f3246cJ.f2250m)).booleanValue();
                c0453l.f2960aR = c1072ab.m695a(c0453l, "core", "canOnlyBeAttackedByUnitsWithTags", (C0449h) null);
                if (c0453l.f2956aN && c0453l.f2960aR != null) {
                    throw new RuntimeException("canNotBeDirectlyAttacked and canOnlyBeAttackedByUnitsWithTags cannot be used at the same time");
                }
                c0453l.f2961aS = c1072ab.m675a("core", "canNotBeGivenOrdersByPlayer", (Boolean) false).booleanValue();
                c0453l.f2962aT = c1072ab.m675a("core", "canRepairBuildings", (Boolean) false).booleanValue();
                c0453l.f2963aU = c1072ab.m675a("core", "canRepairUnits", (Boolean) false).booleanValue();
                c0453l.f2964aV = c1072ab.m675a("core", "autoRepair", (Boolean) false).booleanValue();
                if (c0453l.f2964aV) {
                    c0453l.m3728a(C0388b.f2327a);
                }
                c0453l.f3246cJ.f2252o = c1072ab.m657b("core", "nanoRange", (Integer) (-1)).intValue();
                if (c0453l.f3246cJ.f2252o != -1) {
                    c0453l.f3246cJ.f2252o = (int) (c0359aq.f2252o * c0453l.f3227aF);
                }
                c0453l.f2965aX = c1072ab.m675a("core", "nanoRangeForRepairIsMelee", (Boolean) false).booleanValue();
                if (c0453l.f2965aX) {
                    c0453l.f3228aW = 5;
                }
                int intValue2 = c1072ab.m657b("core", "nanoRangeForRepair", (Integer) (-1)).intValue();
                if (intValue2 != -1) {
                    c0453l.f3228aW = intValue2;
                    c0453l.f3228aW = (int) (c0453l.f3228aW * c0453l.f3227aF);
                }
                c0453l.f2966aZ = c1072ab.m675a("core", "nanoRangeForReclaimIsMelee", (Boolean) false).booleanValue();
                if (c0453l.f2966aZ) {
                    c0453l.f3229aY = 5;
                }
                int intValue3 = c1072ab.m657b("core", "nanoRangeForReclaim", (Integer) (-1)).intValue();
                if (intValue3 != -1) {
                    c0453l.f3229aY = intValue3;
                    c0453l.f3229aY = (int) (c0453l.f3229aY * c0453l.f3227aF);
                }
                c0453l.f2967ba = c1072ab.m673a("core", "nanoRepairSpeed", Float.valueOf(0.2f)).floatValue();
                c0453l.f2968bb = c1072ab.m673a("core", "nanoReclaimSpeed", Float.valueOf(c0453l.f2967ba * 5.1f)).floatValue();
                c0453l.f3230bc = c1072ab.m673a("core", "resourceReclaimMultiplier", Float.valueOf(1.0f)).floatValue();
                c0453l.f2969bd = c1072ab.m673a("core", "nanoUnbuildSpeed", Float.valueOf(1.0f)).floatValue() * 0.001f * 5.1f;
                c0453l.f2970be = c1072ab.m673a("core", "nanoBuildSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f2971bf = c1072ab.m673a("core", "nanoFactorySpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3246cJ.f2253p = c1072ab.m673a("core", "selfRegenRate", Float.valueOf(0.0f)).floatValue();
                c0453l.f2973bh = c1072ab.m646d("core", "selfBuildRate", Float.valueOf(0.0f)).floatValue();
                c0453l.f2974bi = c1072ab.m675a("core", "dieOnConstruct", (Boolean) false).booleanValue();
                c0453l.f2976bk = c1072ab.m675a("core", "dieOnZeroEnergy", (Boolean) false).booleanValue();
                int i = 4;
                if (c0453l.f3246cJ.f2239b > 30000.0f) {
                    i = 8;
                }
                if (c0453l.f2949aG) {
                    i = 7;
                }
                c0453l.f2982bq = c1072ab.m657b("core", "numBitsOnDeath", Integer.valueOf(i)).intValue();
                c0453l.f2979bn = c1072ab.m675a("core", "nukeOnDeath", (Boolean) false).booleanValue();
                c0453l.f2980bo = c1072ab.m673a("core", "nukeOnDeathRange", Float.valueOf(250.0f)).floatValue();
                c0453l.f2981bp = c1072ab.m673a("core", "nukeOnDeathDamage", Float.valueOf(5400.0f)).floatValue();
                c0453l.f2983br = c1072ab.m675a("core", "nukeOnDeathDisableWhenNoNuke", (Boolean) false).booleanValue();
                c0453l.f2978bm = c1072ab.m657b("core", "fireOnDeath", (Integer) 0).intValue();
                c0453l.f2985bt = (EnumC0233ab) c1072ab.m674a("core", "explodeTypeOnDeath", (Enum) null, EnumC0233ab.class);
                c0453l.f2986bu = c1072ab.m675a("core", "explodeOnDeath", (Boolean) true).booleanValue();
                c0453l.f2984bs = c1072ab.m675a("core", "disableDeathOnZeroHp", (Boolean) false).booleanValue();
                c0453l.f2987bv = c1072ab.m675a("core", "explodeOnDeathGroundCollision", Boolean.valueOf(c1072ab.m675a("core", "explodeOnDeathGroundCollosion", (Boolean) true).booleanValue())).booleanValue();
                c0453l.f2990by = c0453l.m3713a(c1072ab.m656b("core", "effectOnDeath", (String) null), (C0467y) null);
                c0453l.f2989bx = c0453l.m3713a(c1072ab.m656b("core", "effectOnDeathIfUnbuilt", (String) null), (C0467y) null);
                c0453l.f2991bz = C0409bj.m4159a(c0453l, c1072ab.m656b("core", "soundOnDeath", (String) null));
                c0453l.f2988bw = c0453l.m3713a(c1072ab.m656b("core", "effectOnDeathGroundCollision", c1072ab.m656b("core", "effectOnDeathGroundCollosion", (String) null)), (C0467y) null);
                c0453l.f2992bC = C0413bn.m4151a(c0453l, c1072ab, "core", "unitsSpawnedOnDeath");
                c0453l.f2993bD = c1072ab.m675a("core", "unitsSpawnedOnDeath_setToTeamOfLastAttacker", (Boolean) false).booleanValue();
                c0453l.f3144fi = c1072ab.m675a("core", "canReclaimResources", (Boolean) false).booleanValue();
                c0453l.f3145fj = c1072ab.m695a(c0453l, "core", "canReclaimResourcesOnlyWithTags", (C0449h) null);
                c0453l.f3146fk = c1072ab.m657b("core", "canReclaimResourcesNextSearchRange", (Integer) 500).intValue();
                c0453l.f3147fl = c1072ab.m695a(c0453l, "core", "canReclaimUnitsOnlyWithTags", (C0449h) null);
                c0453l.f3148fm = c1072ab.m695a(c0453l, "core", "canRepairUnitsOnlyWithTags", (C0449h) null);
                if (c0453l.f3147fl != null && !c0453l.f2963aU && !c0453l.f2962aT) {
                    throw new RuntimeException("canReclaimUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                if (c0453l.f3148fm != null && !c0453l.f2963aU && !c0453l.f2962aT) {
                    throw new RuntimeException("canRepairUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                c0453l.f3263eK = c1072ab.m657b("core", "maxTransportingUnits", (Integer) 0).intValue();
                if (c0453l.f3263eK < 0) {
                    throw new RuntimeException("maxTransportingUnits cannot be < 0");
                }
                c0453l.f3126eL = c1072ab.m658b("core", "transportUnitsUnloadDelayBetweenEachUnit", Float.valueOf(30.0f)).floatValue();
                c0453l.f3128eN = C0448g.m3957a(c1072ab.m656b("core", "transportUnitsRequireTag", (String) null));
                String m656b15 = c1072ab.m656b("core", "transportUnitsRequireMovementType", (String) null);
                if (m656b15 != null) {
                    for (String str13 : m656b15.split(",")) {
                        c0453l.f3264eO.add(EnumC0246ao.m4640a(str13.trim(), "transportUnitsRequireMovementType"));
                    }
                }
                c0453l.f3127eM = c1072ab.m675a("core", "transportUnitsEachUnitAlwaysUsesSingleSlot", (Boolean) false).booleanValue();
                c0453l.f3129eP = c1072ab.m675a("core", "transportUnitsBlockAirAndWaterUnits", Boolean.valueOf(c0453l.f3264eO.size() == 0)).booleanValue();
                c0453l.f3130eQ = c1072ab.m675a("core", "transportUnitsBlockOtherTransports", (Boolean) true).booleanValue();
                c0453l.f3132eS = c1072ab.m694a(c0453l, "core", "transportUnitsKeepBuiltUnits", LogicBoolean.falseBoolean);
                c0453l.f3133eT = c1072ab.m694a(c0453l, "core", "transportUnitsKillOnDeath", LogicBoolean.trueBoolean);
                c0453l.f3134eU = c1072ab.m694a(c0453l, "core", "transportUnitsKeepWaypoints", LogicBoolean.falseBoolean);
                c0453l.f3136eW = c1072ab.m673a("core", "transportUnitsHealBy", Float.valueOf(0.0f)).floatValue();
                c0453l.f3137fa = c1072ab.m694a(c0453l, "core", "transportUnitsCanUnloadUnits", (LogicBoolean) null);
                if (c0453l.f3137fa != null) {
                    c0453l.f3138fb = c0453l.f3137fa;
                } else {
                    c0453l.f3137fa = C0453l.f3192eY;
                    c0453l.f3138fb = C0453l.f3193eZ;
                }
                c0453l.f3131eR = c1072ab.m675a("core", "transportUnitsAddUnloadOption", Boolean.valueOf(c0453l.f3137fa != LogicBoolean.falseBoolean)).booleanValue();
                c0453l.f3135eV = c1072ab.m675a("core", "transportUnitsOnTeamChangeKeepCurrentTeam", Boolean.valueOf(c0453l.f3135eV)).booleanValue();
                c0453l.f3265eX = c1072ab.m657b("core", "transportSlotsNeeded", (Integer) 1).intValue();
                for (int i2 = -1; i2 <= 29; i2++) {
                    String str14 = "builtFrom_" + i2 + "_";
                    if (i2 == -1) {
                        str14 = "builtFrom_";
                    }
                    String str15 = str14 + "name";
                    String m656b16 = c1072ab.m656b("core", str15, (String) null);
                    if (m656b16 != null) {
                        for (String str16 : m656b16.split(",")) {
                            String trim3 = str16.trim();
                            if (!trim3.equals(VariableScope.nullOrMissingString)) {
                                C0458p c0458p = new C0458p();
                                c0458p.f3329a = trim3;
                                c0458p.f3330b = c1072ab.m673a("core", str14 + "pos", Float.valueOf(999.0f)).floatValue();
                                c0458p.f3331c = c1072ab.m675a("core", str14 + "forceNano", (Boolean) false).booleanValue();
                                c0458p.f3332d = "[core]" + str15;
                                c0458p.f3334f = c1072ab.m694a(c0453l, "core", str14 + "isLocked", (LogicBoolean) null);
                                c0458p.f3335g = m4305a(c1072ab, "core", str14 + "isLockedMessage", (String) null);
                                if (c0458p.f3334f == LogicBoolean.falseBoolean) {
                                    c0458p.f3334f = null;
                                }
                                if (!"NONE".equalsIgnoreCase(trim3)) {
                                    c0453l.f3277gd.add(c0458p);
                                }
                            }
                        }
                    }
                }
                for (int i3 = 0; i3 <= 50; i3++) {
                    if (c1072ab.m656b("core", "canBuild_" + i3 + "_name", (String) null) != null) {
                        m4285b(c0453l, c1072ab, "core", "canBuild_" + i3 + "_", false);
                    }
                }
                Iterator it10 = c1072ab.m644e("canBuild_").iterator();
                while (it10.hasNext()) {
                    m4285b(c0453l, c1072ab, (String) it10.next(), VariableScope.nullOrMissingString, true);
                }
                c0453l.f3139fd = C0402bc.m4181a(c0453l, c1072ab);
                c0453l.f3140fe = EnumC0246ao.m4640a(c1072ab.m643e("movement", "movementType"), "movementType");
                if (!c0453l.f2949aG) {
                    c0453l.f3141ff = c0453l.f3140fe;
                } else {
                    c0453l.f3141ff = EnumC0246ao.f1703a;
                }
                Boolean m675a = c1072ab.m675a("ai", "useAsBuilder", (Boolean) null);
                c0453l.f3152fq = c1072ab.m675a("ai", "useAsAttacker", (Boolean) true).booleanValue();
                Boolean m675a2 = c1072ab.m675a("core", "isBuilder", (Boolean) null);
                if (m675a2 == null) {
                    m675a2 = m675a == null ? false : m675a;
                } else if (m675a == null) {
                    m675a = m675a2;
                }
                if (m675a == null) {
                    m675a = false;
                }
                c0453l.f3149fn = m675a2.booleanValue();
                c0453l.f3150fo = m675a.booleanValue();
                if (!c0453l.f3149fn && c0453l.f3150fo) {
                    throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + c0453l.f3150fo + " [core]isBuilder:" + c0453l.f3149fn);
                }
                if (c0453l.f3144fi) {
                    c0453l.f3151fp = true;
                }
                Boolean m675a3 = c1072ab.m675a("ai", "useAsHarvester", (Boolean) null);
                if (m675a3 != null) {
                    c0453l.f3151fp = m675a3.booleanValue();
                }
                Boolean m675a4 = c1072ab.m675a("ai", "useAsTransport", (Boolean) null);
                if (m675a4 == null) {
                    m675a4 = Boolean.valueOf((c0453l.f3263eK <= 0 || c0453l.f3150fo || c0453l.f2949aG) ? false : true);
                    if (!c0453l.f3131eR) {
                        m675a4 = false;
                    }
                }
                c0453l.f3153fr = m675a4.booleanValue();
                if (c0453l.f2949aG) {
                    c0453l.f2942ar = AbstractC0488d.f3429q;
                } else if (c0453l.f3140fe == EnumC0246ao.f1706d) {
                    c0453l.f2942ar = AbstractC0309b.f1847n;
                } else if (c0453l.f3140fe == EnumC0246ao.f1707e) {
                    c0453l.f2942ar = AbstractC0590f.f3849q;
                } else if (c0453l.f3140fe == EnumC0246ao.f1708f) {
                    if (c0453l.f3021ck) {
                        c0453l.f2942ar = AbstractC0529j.f3651dM;
                    } else if (c0453l.mo4471l()) {
                        c0453l.f2942ar = C0519b.f3588h;
                    } else {
                        c0453l.f2942ar = AbstractC0525h.f3635n;
                    }
                } else if (c0453l.f3021ck) {
                    c0453l.f2942ar = AbstractC0529j.f3651dM;
                } else if (c0453l.mo4471l()) {
                    c0453l.f2942ar = C0519b.f3588h;
                } else {
                    c0453l.f2942ar = AbstractC0529j.f3650dL;
                }
                C0934e m3717a = c0453l.m3717a(c1072ab, "graphics", "icon_zoomed_out", false);
                if (m3717a != null) {
                    c0453l.f2942ar = c0453l.m3719a(m3717a, c0453l.f2933ab);
                }
                if (c1072ab.m675a("graphics", "icon_zoomed_out_neverShow", (Boolean) false).booleanValue()) {
                    c0453l.f2942ar = null;
                }
                c0453l.f2905s = c1072ab.m675a("graphics", "showHealthBar", (Boolean) true).booleanValue();
                c0453l.f2906t = c1072ab.m675a("graphics", "showHealthBarChanges", (Boolean) true).booleanValue();
                c0453l.f2907u = c1072ab.m675a("graphics", "showEnergyBar", (Boolean) true).booleanValue();
                c0453l.f2908v = c1072ab.m675a("graphics", "showShotDelayBar", (Boolean) true).booleanValue();
                c0453l.f2909w = c1072ab.m675a("graphics", "showTransportBar", (Boolean) true).booleanValue();
                c0453l.f2910x = c1072ab.m675a("graphics", "showShieldBar", (Boolean) true).booleanValue();
                c0453l.f2911y = c1072ab.m675a("graphics", "showQueueBar", (Boolean) true).booleanValue();
                c0453l.f3206z = c1072ab.m675a("graphics", "showSelectionIndicator", (Boolean) true).booleanValue();
                c0453l.f3142fg = c1072ab.m675a("movement", "slowDeathFall", (Boolean) false).booleanValue();
                c0453l.f3143fh = c1072ab.m675a("movement", "slowDeathFallSmoke", (Boolean) true).booleanValue();
                c0453l.f3246cJ.f2247j = c1072ab.m673a("movement", "moveSpeed", Float.valueOf(1.0f)).floatValue() * c0453l.f3227aF;
                c0453l.f3083dK = c1072ab.m673a("movement", "moveAccelerationSpeed", Float.valueOf(1.0f)).floatValue() * c0453l.f3227aF;
                c0453l.f3084dL = c1072ab.m673a("movement", "moveDecelerationSpeed", Float.valueOf(1.0f)).floatValue() * c0453l.f3227aF;
                Boolean m675a5 = c1072ab.m675a("movement", "ignoreMoveOrders", (Boolean) null);
                if (c0453l.f2949aG) {
                    c0453l.f3085dM = true;
                }
                if (m675a5 != null) {
                    if (m675a5.booleanValue()) {
                        c0453l.f3085dM = true;
                        if (c0453l.f3246cJ.f2247j > 0.0f) {
                            throw new RuntimeException("[movement]ignoreMoveOrders expects moveSpeed=0");
                        }
                    } else if (c0453l.f2949aG) {
                        throw new RuntimeException("[movement]ignoreMoveOrders=false not yet supported on buildings");
                    }
                }
                c0453l.f3102eh = c1072ab.m673a("movement", "moveYAxisScaling", Float.valueOf(1.0f)).floatValue();
                if (c0453l.f3102eh <= 0.0f) {
                    throw new RuntimeException("[movement]moveYAxisScaling must be > 0");
                }
                c0453l.f3103ei = 1.0f / c0453l.f3102eh;
                c0453l.f3104ej = c1072ab.m673a("movement", "reverseSpeedPercentage", Float.valueOf(0.6f)).floatValue();
                String m656b17 = c1072ab.m656b("movement", "landOnGround", "false");
                if (m656b17.equalsIgnoreCase("false")) {
                    c0453l.f3086dN = false;
                } else if (m656b17.equalsIgnoreCase("onlyIdle")) {
                    c0453l.f3086dN = true;
                    c0453l.f3087dO = true;
                } else if (m656b17.equalsIgnoreCase("true")) {
                    c0453l.f3086dN = true;
                } else {
                    throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + m656b17);
                }
                float f3 = 0.0f;
                float f4 = 0.0f;
                if (c0453l.f3140fe == EnumC0246ao.f1706d) {
                    f3 = 35.0f;
                    f4 = 1.5f;
                }
                c0453l.f3254dP = c1072ab.m673a("movement", "startingHeightOffset", Float.valueOf(0.0f)).floatValue();
                c0453l.f3088dQ = c1072ab.m673a("movement", "targetHeight", Float.valueOf(f3)).floatValue();
                c0453l.f3089dR = c1072ab.m673a("movement", "targetHeightDrift", Float.valueOf(f4)).floatValue();
                if (c0453l.f3088dQ > 80.0f) {
                    c0453l.f2912A = true;
                }
                c0453l.f3255dS = c1072ab.m673a("movement", "heightChangeRate", Float.valueOf(c0453l.f3255dS)).floatValue();
                c0453l.f3256dT = c1072ab.m673a("movement", "fallingAcceleration", Float.valueOf(c0453l.f3256dT)).floatValue();
                c0453l.f3257dU = c1072ab.m673a("movement", "fallingAccelerationDead", Float.valueOf(c0453l.f3257dU)).floatValue();
                c0453l.f3246cJ.f2248k = c1072ab.m673a("movement", "maxTurnSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3105em = c1072ab.m673a("movement", "turnAcceleration", Float.valueOf(1.0f)).floatValue();
                c0453l.f3090dV = c1072ab.m675a("movement", "moveSlidingMode", (Boolean) false).booleanValue();
                c0453l.f3091dW = c1072ab.m675a("movement", "moveIgnoringBody", (Boolean) false).booleanValue();
                c0453l.f3092dX = c1072ab.m657b("movement", "moveSlidingDir", (Integer) (-1)).intValue();
                c0453l.f3101eg = c1072ab.m675a("movement", "joinsGroupFormations", (Boolean) true).booleanValue();
                c0453l.f3093dY = c1072ab.m673a("attack", "turretSize", Float.valueOf(1.0f)).floatValue() * c0453l.f3227aF;
                c0453l.f3094dZ = c1072ab.m673a("attack", "turretTurnSpeed", Float.valueOf(8.0f)).floatValue();
                c0453l.f3081dI = c1072ab.m675a("attack", "turretRotateWithBody", (Boolean) true).booleanValue();
                String m656b18 = c1072ab.m656b("attack", "attackMovement", "normal");
                c0453l.f3095ea = EnumC0307b.f1829a;
                if (m656b18.equalsIgnoreCase("normal")) {
                    c0453l.f3095ea = EnumC0307b.f1829a;
                }
                if (m656b18.equalsIgnoreCase("strafing")) {
                    c0453l.f3095ea = EnumC0307b.f1830b;
                }
                if (m656b18.equalsIgnoreCase("bomber")) {
                    c0453l.f3095ea = EnumC0307b.f1832d;
                }
                c0453l.f3098ed = c1072ab.m675a("attack", "disablePassiveTargeting", (Boolean) false).booleanValue();
                c0453l.f3099ee = c1072ab.m675a("attack", "stopTargetingAfterFiring", (Boolean) false).booleanValue();
                c0453l.f3100ef = c1072ab.m675a("attack", "turretMultiTargeting", (Boolean) false).booleanValue();
                c0453l.f3096eb = c1072ab.m673a("attack", "attackMovementSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3097ec = c1072ab.m673a("attack", "attackMovementSpread", Float.valueOf(1.0f)).floatValue();
                Float m673a = c1072ab.m673a("attack", "maxAttackRange", (Float) null);
                if (m673a != null) {
                    z = true;
                    c0453l.f3246cJ.f2246i = m673a.floatValue() * c0453l.f3227aF;
                } else {
                    z = false;
                    c0453l.f3246cJ.f2246i = 100.0f * c0453l.f3227aF;
                }
                c0453l.f3116ex = c1072ab.m673a("attack", "aimOffsetSpread", Float.valueOf(0.6f)).floatValue();
                c0453l.f3082dJ = c1072ab.m658b("attack", "shootDelay", Float.valueOf(50.0f)).floatValue();
                c0453l.f3246cJ.f2242e = c1072ab.m673a("attack", "shootDelayMultiplier", Float.valueOf(1.0f)).floatValue();
                c0453l.f3246cJ.f2243f = c1072ab.m673a("attack", "shootDamageMultiplier", Float.valueOf(1.0f)).floatValue();
                c0453l.f3080dH = c1072ab.m675a("attack", "showRangeUIGuide", (Boolean) null);
                c0453l.f3122eD = c1072ab.m675a("attack", "isMelee", (Boolean) false).booleanValue();
                c0453l.f3123eE = 0.0f;
                Float m673a2 = c1072ab.m673a("attack", "meleeEngangementDistance", (Float) null);
                if (c0453l.f3122eD) {
                    c0453l.f3123eE = 250.0f;
                    if (m673a2 != null) {
                        c0453l.f3123eE = m673a2.floatValue();
                    }
                } else if (m673a2 != null) {
                    throw new RuntimeException("[attack]meleeEngangementDistance can only be used with isMelee:true");
                }
                m4318a(m2440a, EnumC0349ag.unitParsePartA);
                Iterator it11 = c1072ab.m644e("projectile_").iterator();
                while (it11.hasNext()) {
                    String str17 = (String) it11.next();
                    String substring2 = str17.substring("projectile_".length());
                    if (c0453l.m3689f(substring2) != null) {
                        throw new RuntimeException("Two projectiles found with the same name:" + substring2);
                    }
                    C0405bf c0405bf = new C0405bf();
                    c0405bf.f2514bh = substring2;
                    c0405bf.f2516bj = c0453l;
                    C0405bf.m4172a(c0405bf, c0453l, c1072ab, str17);
                }
                int size = c0453l.f3271fR.size();
                if (size < 1) {
                    size = 1;
                }
                c0453l.f3174fP = new C0405bf[size];
                for (int i4 = 0; i4 < c0453l.f3271fR.size(); i4++) {
                    C0405bf c0405bf2 = (C0405bf) c0453l.f3271fR.get(i4);
                    c0405bf2.f2515bi = i4;
                    c0453l.f3174fP[i4] = c0405bf2;
                }
                for (int i5 = 0; i5 < c0453l.f3174fP.length; i5++) {
                    C0405bf c0405bf3 = c0453l.f3174fP[i5];
                    if (c0405bf3 != null) {
                        c0405bf3.f1165w *= c0453l.f3227aF;
                        c0405bf3.f1189au *= c0453l.f3227aF;
                        c0405bf3.f1198aF *= c0453l.f3227aF;
                    }
                }
                if (c0453l.f3174fP[0] == null) {
                    C0405bf c0405bf4 = new C0405bf();
                    c0405bf4.f2515bi = 0;
                    c0405bf4.f2514bh = "1";
                    c0405bf4.f1100b = 10;
                    c0453l.f3271fR.add(c0405bf4);
                    c0453l.f3174fP[0] = c0405bf4;
                }
                ArrayList arrayList = c0453l.f3270fQ;
                Iterator it12 = c1072ab.m644e("turret_").iterator();
                while (it12.hasNext()) {
                    String str18 = (String) it12.next();
                    String substring3 = str18.substring("turret_".length());
                    if (c0453l.m3691e(substring3) != null) {
                        throw new RuntimeException("Two turrets found with the same name:" + substring3);
                    }
                    C0411bl c0411bl = new C0411bl();
                    c0411bl.f2543a = substring3;
                    c0411bl.f2544b = str18;
                    arrayList.add(c0411bl);
                }
                Iterator it13 = arrayList.iterator();
                while (it13.hasNext()) {
                    C0411bl c0411bl2 = (C0411bl) it13.next();
                    C0411bl.m4156a(c0411bl2, c0453l, c1072ab, c0411bl2.f2544b);
                }
                if (arrayList.size() == 0) {
                    C0411bl c0411bl3 = new C0411bl();
                    c0411bl3.f2548f = 0.0f;
                    c0411bl3.f2549g = 0.0f;
                    c0411bl3.f2543a = "1";
                    c0411bl3.f2601m = c0453l.f3082dJ;
                    arrayList.add(c0411bl3);
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    if (arrayList.get(size2) != null) {
                        ((C0411bl) arrayList.get(size2)).f2547e = size2;
                    }
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    if (arrayList.get(size3) != null) {
                        C0411bl c0411bl4 = (C0411bl) arrayList.get(size3);
                        if (c0411bl4.f2556y != null) {
                            c0411bl4.f2609w = c0411bl4.f2556y.f2547e;
                            if (c0411bl4.f2556y.f2556y != null) {
                                throw new RuntimeException(c0411bl4.f2543a + ": Turret can not be attached to turret that is also attached to a turret");
                            }
                        }
                        if (c0411bl4.f2557z != null) {
                            c0411bl4.f2610x = c0411bl4.f2557z.f2547e;
                        }
                        if (c0411bl4.f2616W < 0.0f) {
                            c0411bl4.f2616W = c0411bl4.f2615V;
                        }
                    }
                }
                if (arrayList.size() > 31) {
                    throw new RuntimeException("Turret max count per unit is: 31");
                }
                c0453l.f3269fO = (C0411bl[]) arrayList.toArray(new C0411bl[0]);
                c0453l.f3079dG = c0453l.f3246cJ.f2246i;
                float f5 = -1.0f;
                boolean z3 = true;
                boolean z4 = false;
                Iterator it14 = arrayList.iterator();
                while (it14.hasNext()) {
                    C0411bl c0411bl5 = (C0411bl) it14.next();
                    c0411bl5.f2575X *= c0453l.f3227aF;
                    c0411bl5.f2548f *= c0453l.f3227aF;
                    c0411bl5.f2549g *= c0453l.f3227aF;
                    c0411bl5.f2576Y *= c0453l.f3227aF;
                    c0411bl5.f2617Z *= c0453l.f3227aF;
                    boolean z5 = false;
                    if (c0411bl5.f2611B) {
                        if (c0411bl5.f2618ab >= 99999.0f) {
                            z3 = false;
                        } else {
                            z4 = true;
                            if (c0453l.f3079dG > c0411bl5.f2618ab) {
                                c0453l.f3079dG = c0411bl5.f2618ab;
                            }
                            if (f5 < c0411bl5.f2618ab) {
                                f5 = c0411bl5.f2618ab;
                            }
                            if (C0758f.m2137c(c0411bl5.f2618ab - c0453l.f3246cJ.f2246i) > 5.0f) {
                                boolean z6 = false;
                                Iterator it15 = c0453l.f3203o.iterator();
                                while (it15.hasNext()) {
                                    if (C0758f.m2137c(c0411bl5.f2618ab - ((C0466x) it15.next()).f3356a) < 5.0f) {
                                        z6 = true;
                                    }
                                }
                                if (!z6) {
                                    z5 = true;
                                }
                            }
                        }
                    }
                    if (c0411bl5.f2578ac != null) {
                        z5 = c0411bl5.f2578ac.booleanValue();
                    }
                    if (z5) {
                        C0466x c0466x = new C0466x();
                        c0466x.f3356a = c0411bl5.f2618ab;
                        c0453l.f3203o.add(c0466x);
                    }
                }
                if (z4 && z3) {
                    if (!z) {
                        c0453l.f3246cJ.f2246i = f5;
                    } else if (f5 < c0453l.f3246cJ.f2246i) {
                        throw new RuntimeException("limitingRange as been applied to all turrets but is less than maxAttackRange (hint: unset maxAttackRange or a limitingRange, or make values match)");
                    }
                }
                String m656b19 = c1072ab.m656b("attack", "setMainTurretAs", (String) null);
                if (m656b19 != null) {
                    c0453l.f3076dD = c0453l.m3691e(m656b19);
                    if (c0453l.f3076dD == null) {
                        throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + m656b19);
                    }
                } else {
                    c0453l.f3076dD = c0453l.m3691e("1");
                    if (c0453l.f3076dD == null) {
                        c0453l.f3076dD = c0453l.f3269fO[0];
                    }
                }
                m4318a(m2440a, EnumC0349ag.unitParsePartB);
                long m2440a3 = C0727bl.m2440a();
                if (c1072ab.m628l("core", "action_")) {
                    for (int i6 = 0; i6 <= 50; i6++) {
                        m4311a(c0453l, c1072ab, "core", "action_" + i6 + "_", VariableScope.nullOrMissingString + i6, false, false);
                    }
                }
                Iterator it16 = c1072ab.m644e("action_").iterator();
                while (it16.hasNext()) {
                    String str19 = (String) it16.next();
                    String substring4 = str19.substring("action_".length());
                    if (c0453l.m3687g(substring4) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring4);
                    }
                    m4311a(c0453l, c1072ab, str19, VariableScope.nullOrMissingString, substring4, true, false);
                }
                Iterator it17 = c1072ab.m644e("hiddenAction_").iterator();
                while (it17.hasNext()) {
                    String str20 = (String) it17.next();
                    String substring5 = str20.substring("hiddenAction_".length());
                    if (c0453l.m3687g(substring5) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring5);
                    }
                    m4311a(c0453l, c1072ab, str20, VariableScope.nullOrMissingString, substring5, true, true);
                }
                m4318a(m2440a3, EnumC0349ag.actionParse);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i7 = 0;
                while (i7 <= 1) {
                    boolean z7 = i7 == 0;
                    ArrayList arrayList4 = z7 ? arrayList2 : arrayList3;
                    for (int i8 = 1; i8 < 21; i8++) {
                        String str21 = z7 ? "leg_" + i8 : "arm_" + i8;
                        if (c1072ab.m638g(str21)) {
                            C0384ay c0384ay = new C0384ay();
                            C0384ay.m4228a(c0384ay, c0453l, c1072ab, str21, z7, arrayList4);
                            arrayList4.add(c0384ay);
                        } else {
                            arrayList4.add(null);
                        }
                    }
                    i7++;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it18 = arrayList2.iterator();
                while (it18.hasNext()) {
                    C0384ay c0384ay2 = (C0384ay) it18.next();
                    if (c0384ay2 != null) {
                        arrayList5.add(c0384ay2);
                    }
                }
                Iterator it19 = arrayList3.iterator();
                while (it19.hasNext()) {
                    C0384ay c0384ay3 = (C0384ay) it19.next();
                    if (c0384ay3 != null) {
                        arrayList5.add(c0384ay3);
                    }
                }
                for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                    ((C0384ay) arrayList5.get(size4)).f2272a = size4;
                }
                c0453l.f3223aw = (C0384ay[]) arrayList5.toArray(new C0384ay[0]);
                if (c0453l.f3223aw.length > 0) {
                    c0453l.m3728a(C0393g.f2410a);
                }
                Iterator it20 = c0453l.f3250dp.iterator();
                while (it20.hasNext()) {
                    ((C0441f) it20.next()).m3983a(c0453l);
                }
                m4286b(c0453l);
                String m656b20 = c1072ab.m656b("core", "fireTurretXAtSelfOnDeath", (String) null);
                if (m656b20 != null && !"NONE".equalsIgnoreCase(m656b20)) {
                    C0411bl m3691e = c0453l.m3691e(m656b20);
                    if (m3691e == null) {
                        throw new RuntimeException("Cannot find turret:" + m656b20 + " for [core]fireTurretXAtSelfOnDeath");
                    }
                    c0453l.f3232bB = m3691e.f2547e;
                }
                C0389c.m4212a(c0453l, c1072ab);
                c0453l.f2975bj = c1072ab.m675a("attack", "dieOnAttack", (Boolean) false).booleanValue();
                c0453l.f2977bl = c1072ab.m675a("attack", "removeOnAttack", (Boolean) false).booleanValue();
                c0453l.f3106en = c1072ab.m647d("attack", "canAttack");
                if (c0453l.f3106en) {
                    c0453l.f3107eo = c1072ab.m697a(c0453l, "attack", "canAttackFlyingUnits");
                    c0453l.f3108ep = c1072ab.m697a(c0453l, "attack", "canAttackLandUnits");
                    c0453l.f3109eq = c1072ab.m697a(c0453l, "attack", "canAttackUnderwaterUnits");
                } else {
                    c0453l.f3107eo = c1072ab.m694a(c0453l, "attack", "canAttackFlyingUnits", LogicBoolean.falseBoolean);
                    c0453l.f3108ep = c1072ab.m694a(c0453l, "attack", "canAttackLandUnits", LogicBoolean.falseBoolean);
                    c0453l.f3109eq = c1072ab.m694a(c0453l, "attack", "canAttackUnderwaterUnits", LogicBoolean.falseBoolean);
                }
                c0453l.f3110er = c1072ab.m694a(c0453l, "attack", "canAttackNotTouchingWaterUnits", (LogicBoolean) null);
                if (LogicBoolean.isStaticTrue(c0453l.f3110er)) {
                    c0453l.f3110er = null;
                }
                c0453l.f3112et = c1072ab.m695a(c0453l, "attack", "canOnlyAttackUnitsWithTags", (C0449h) null);
                c0453l.f3113eu = c1072ab.m695a(c0453l, "attack", "canOnlyAttackUnitsWithoutTags", (C0449h) null);
                if (c0453l.f3112et != null || c0453l.f3113eu != null) {
                    c0453l.f3111es = true;
                }
                boolean z8 = false;
                boolean z9 = false;
                Iterator it21 = arrayList.iterator();
                while (it21.hasNext()) {
                    C0411bl c0411bl6 = (C0411bl) it21.next();
                    if (c0411bl6.f2571O != null && c0411bl6.f2571O.m3951a(c0453l.f3112et)) {
                        c0411bl6.f2571O = null;
                    }
                    if (c0411bl6.f2572P != null && c0411bl6.f2572P.m3951a(c0453l.f3113eu)) {
                        c0411bl6.f2572P = null;
                    }
                    if (c0411bl6.f2611B) {
                        if (c0411bl6.f2571O != null || c0411bl6.f2572P != null) {
                            z8 = true;
                        } else {
                            z9 = true;
                        }
                    }
                }
                if (z8 && !z9) {
                    c0453l.f3114ev = true;
                    c0453l.f3111es = true;
                }
                c0453l.f3115ew = c1072ab.m675a("attack", "isFixedFiring", (Boolean) false).booleanValue();
                c0453l.f3170fK = c1072ab.m675a("ai", "lowPriorityTargetForOtherUnits", (Boolean) false).booleanValue();
                c0453l.f3171fL = c1072ab.m675a("ai", "notPassivelyTargetedByOtherUnits", (Boolean) false).booleanValue();
                if (c0453l.f3106en && c0453l.f3171fL) {
                    throw new RuntimeException("[ai]notPassivelyTargetedByOtherUnits is cannot currently supported on units that can attack");
                }
                c0453l.f3155ft = c1072ab.m695a(c0453l, "ai", "aiTags", (C0449h) null);
                c0453l.f3156fu = c1072ab.m675a("ai", "disableUse", (Boolean) false).booleanValue();
                c0453l.f3159fx = c1072ab.m673a("ai", "buildPriority", Float.valueOf(0.05f)).floatValue();
                c0453l.f3160fy = c1072ab.m657b("ai", "recommendedInEachBaseNum", (Integer) 0).intValue();
                c0453l.f3161fz = c1072ab.m673a("ai", "recommendedInEachBasePriorityIfUnmet", Float.valueOf(0.5f)).floatValue();
                c0453l.f3158fw = c1072ab.m657b("ai", "maxEachBase", Integer.valueOf(C0758f.m2154b(2, c0453l.f3160fy))).intValue();
                c0453l.f3157fv = c1072ab.m657b("ai", "maxGlobal", (Integer) (-1)).intValue();
                if (c0453l.f3158fw < c0453l.f3160fy) {
                    throw new RuntimeException("[ai]recommendedInEachBaseNum is smaller than maxEachBase");
                }
                if (!c0453l.f2949aG) {
                    if (c1072ab.m626n("ai", "recommendedInEachBaseNum")) {
                        throw new RuntimeException("[ai]recommendedInEachBaseNum currently only applies to buildings");
                    }
                    if (c1072ab.m626n("ai", "recommendedInEachBasePriorityIfUnmet")) {
                        throw new RuntimeException("[ai]recommendedInEachBasePriorityIfUnmet currently only applies to buildings");
                    }
                }
                c0453l.f3164fC = c1072ab.m657b("ai", "whenUsingAsHarvester_recommendedInEachBase", (Integer) (-1)).intValue();
                c0453l.f3165fD = c1072ab.m657b("ai", "whenUsingAsHarvester_recommendedGlobal", (Integer) (-1)).intValue();
                c0453l.f3166fE = c1072ab.m675a("ai", "whenUsingAsHarvester_includeOtherHarvesterCounts", (Boolean) false).booleanValue();
                c0453l.f3167fF = c1072ab.m695a(c0453l, "ai", "onlyUseAsHarvester_ifBaseHasUnitTagged", (C0449h) null);
                c0453l.f3162fA = c1072ab.m673a("ai", "nonInBaseExtraPriority", Float.valueOf(0.04f)).floatValue();
                c0453l.f3162fA = c1072ab.m673a("ai", "noneInBaseExtraPriority", Float.valueOf(c0453l.f3162fA)).floatValue();
                c0453l.f3163fB = c1072ab.m673a("ai", "nonGlobalExtraPriority", Float.valueOf(0.0f)).floatValue();
                c0453l.f3163fB = c1072ab.m673a("ai", "noneGlobalExtraPriority", Float.valueOf(c0453l.f3163fB)).floatValue();
                c0453l.f3168fG = c1072ab.m656b("ai", "upgradedFrom", (String) null);
                Float m673a3 = c1072ab.m673a("ai", "ai_upgradePriority", (Float) null);
                if (m673a3 != null && m673a3.floatValue() != -1.0f) {
                    if (m673a3.floatValue() >= 0.0f && m673a3.floatValue() <= 1.0f) {
                        c0453l.f3267fI = m673a3.floatValue() * 100.0f;
                    } else {
                        throw new RuntimeException("[ai]ai_upgradePriority: " + c0453l.f3267fI + " must be between 0-1 or -1 for default");
                    }
                }
                if (c0453l.f3106en) {
                    for (int i9 = 0; i9 < c0453l.f3269fO.length; i9++) {
                        C0411bl c0411bl7 = c0453l.f3269fO[i9];
                        if (c0411bl7.f2611B && c0411bl7.f2584ao == null && c0453l.f2908v) {
                            if (c0411bl7.f2601m > 140.0f && (c0453l.f3258ek == -1 || c0453l.f3269fO[c0453l.f3258ek].f2601m < c0411bl7.f2601m)) {
                                c0453l.f3258ek = i9;
                            }
                            if (c0411bl7.f2602n > 80.0f) {
                                c0453l.f3259el = i9;
                            }
                        }
                    }
                }
                if (c0453l.f3245cG == -2) {
                    if (c0453l.f3140fe == EnumC0246ao.f1706d) {
                        c0453l.f3245cG = 5;
                    } else if (c0453l.mo4473j()) {
                        if (c0453l.f3215ak != null) {
                            c0453l.f3245cG = 3;
                        } else {
                            c0453l.f3245cG = 2;
                        }
                    } else if (c0453l.f3088dQ < -2.0f) {
                        c0453l.f3245cG = 1;
                    } else if (c0453l.f3263eK > 0) {
                        c0453l.f3245cG = 3;
                    } else {
                        c0453l.f3245cG = 2;
                    }
                }
                if (c0453l.f3274fU.size() > 0) {
                    c0453l.f3175fV = true;
                    C1101m c1101m = new C1101m();
                    C1101m c1101m2 = new C1101m();
                    C1101m c1101m3 = new C1101m();
                    Iterator it22 = c0453l.f3274fU.iterator();
                    while (it22.hasNext()) {
                        C0460r c0460r = (C0460r) it22.next();
                        if (c0460r.f3338c == EnumC0461s.f3340a) {
                            c1101m.add(c0460r);
                        } else if (c0460r.f3338c == EnumC0461s.f3341b) {
                            c1101m2.add(c0460r);
                        } else if (c0460r.f3338c == EnumC0461s.f3342c) {
                            c1101m3.add(c0460r);
                        } else {
                            throw new RuntimeException("Unknown check rate:" + c0460r.f3338c);
                        }
                    }
                    c0453l.f3176fW = (C0460r[]) c1101m.toArray(new C0460r[0]);
                    c0453l.f3177fX = (C0460r[]) c1101m2.toArray(new C0460r[0]);
                    c0453l.f3178fY = (C0460r[]) c1101m3.toArray(new C0460r[0]);
                }
                if (c0453l.f3281gm != null && c0453l.f3281gm.size() > 0) {
                    Iterator it23 = c0453l.f3281gm.iterator();
                    while (it23.hasNext()) {
                        ((C0462t) it23.next()).m3646a(c0453l);
                    }
                }
                m4318a(m2440a, EnumC0349ag.unitParsePartC);
                c1072ab.m662b();
                Iterator it24 = c1072ab.f6829d.iterator();
                while (it24.hasNext()) {
                    C1073ac c1073ac = (C1073ac) it24.next();
                    if (c1073ac.m625a() != null && (c1073ac.m625a().startsWith("hiddenAction_") || c1073ac.m625a().startsWith("canBuild_"))) {
                        throw new RuntimeException("Error [" + c1073ac.m625a() + "]" + c1073ac.m624b() + " has been repeated");
                    }
                    String str22 = "Repeated key " + c1073ac;
                    c0453l.m3665r(str22);
                    if (c0453l.f2926Q >= 1) {
                        Core.LogDebug2("Converting warning to error (meta.strictLevel=" + c0453l.f2926Q + ")");
                        throw new C0412bm(str22);
                    }
                }
                Iterator it25 = c1072ab.f6830e.iterator();
                while (it25.hasNext()) {
                    String str23 = "Skipping line, unexpected format: '" + ((String) it25.next()) + "'";
                    c0453l.m3665r(str23);
                    if (c0453l.f2926Q >= 1) {
                        Core.LogDebug2("Converting warning to error (meta.strictLevel=" + c0453l.f2926Q + ")");
                        throw new C0412bm(str23);
                    }
                }
                if (c0824b != null) {
                    c0824b.f5447E++;
                }
                synchronized (C0453l.f3187c) {
                    C0453l.f3187c.add(c0453l);
                }
                m4318a(m2440a, EnumC0349ag.unitParsePartD);
                return c0453l;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (C0412bm e2) {
            m4297a(str, e2, c0824b);
            return null;
        } catch (OutOfMemoryError e3) {
            f2199l++;
            m4297a(str, new RuntimeException(e3), c0824b);
            return null;
        } catch (RuntimeException e4) {
            m4297a(str, e4, c0824b);
            return null;
        }
    }

    /* renamed from: a */
    public static void m4298a(String str, Exception exc, InterfaceC0303as interfaceC0303as) {
        C0824b c0824b = null;
        if (interfaceC0303as instanceof C0453l) {
            c0824b = ((C0453l) interfaceC0303as).f2919I;
        }
        m4297a(str, exc, c0824b);
    }

    /* renamed from: a */
    public static String m4307a(C0824b c0824b, String str, boolean z) {
        if (c0824b != null) {
            String m2265n = C0750a.m2265n(c0824b.f5433q);
            str = C0750a.m2265n(str);
            if (str.startsWith(m2265n)) {
                str = str.substring(m2265n.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            if (z) {
                str = str + " (in mod " + c0824b.m1691a() + ")";
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m4297a(String str, Exception exc, C0824b c0824b) {
        String m2147b;
        String str2;
        Core.m998b("Error while loading unit:" + str);
        Core.m989c(exc);
        if (str == null) {
            str = "<null>";
        }
        if (exc instanceof C0412bm) {
            m2147b = exc.getMessage();
        } else {
            m2147b = C0758f.m2147b(exc);
        }
        if (m2147b == null) {
            m2147b = "<No error cause>";
        }
        if (!m2147b.contains("unit config file")) {
            m2147b = m2147b.replace(str + ": ", VariableScope.nullOrMissingString).replace(str, VariableScope.nullOrMissingString);
        }
        String m4307a = m4307a(c0824b, str, true);
        if (c0824b != null) {
            str2 = "Error loading unit: " + m4307a + ": \n" + m2147b;
        } else if (m2147b.contains("Error loading core unit")) {
            str2 = m2147b;
        } else {
            str2 = "Error loading core unit: " + m4307a + ": \n" + m2147b + " (This might be from placing a mod in 'assets/', they should go under 'mods/')";
        }
        if (exc instanceof C0412bm) {
            C0412bm c0412bm = (C0412bm) exc;
            if (c0412bm.f2632c != null || c0412bm.f2633d != null) {
                str2 = str2 + " (section:" + c0412bm.f2632c + ", key:" + c0412bm.f2633d + ")";
            }
        }
        boolean z = false;
        if (c0824b != null) {
            z = c0824b.f5422f;
        }
        if (!z) {
        }
        if (f2209s != null) {
            f2209s = str2;
        }
        if (c0824b != null) {
            c0824b.m1688a(str2);
        } else {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException e) {
            }
            throw new RuntimeException(str2, exc);
        }
    }

    /* renamed from: b */
    public static void m4285b(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        String m656b = c1072ab.m656b(str, str2 + "name", (String) null);
        if (m656b == null) {
            return;
        }
        for (String str3 : m656b.split(",")) {
            String trim = str3.trim();
            C0339d c0339d = new C0339d();
            c0339d.f2056j = trim;
            c0339d.f2060n = c1072ab.m675a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0339d.f2123o = c1072ab.m673a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0339d.f2119aG = c1072ab.m657b(str, str2 + "tech", (Integer) 1).intValue();
            c0339d.f2120aH = c1072ab.m675a(str, str2 + "forceNano", (Boolean) false).booleanValue();
            c0339d.f2121aI = c1072ab.m656b(str, str2 + "type", (String) null);
            c0339d.f2061p = C0424b.m4115a(c0453l, c1072ab, str, str2 + "price", (C0424b) null);
            c0339d.f2116aC = c1072ab.m694a(c0453l, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0339d.f2066u = c1072ab.m694a(c0453l, str, str2 + "isVisible", (LogicBoolean) null);
            c0339d.f2070y = c1072ab.m694a(c0453l, str, str2 + "isLocked", (LogicBoolean) null);
            c0339d.f2071z = m4312a(c0453l, c1072ab, str, str2 + "isLockedMessage", (String) null);
            if (c0339d.f2070y != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2070y == LogicBoolean.falseBoolean) {
                c0339d.f2070y = null;
            }
            c0339d.f2072A = c1072ab.m694a(c0453l, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0339d.f2073B = m4312a(c0453l, c1072ab, str, str2 + "isLockedAltMessage", (String) null);
            if (c0339d.f2072A != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2072A == LogicBoolean.falseBoolean) {
                c0339d.f2072A = null;
            }
            c0339d.f2074C = c1072ab.m694a(c0453l, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0339d.f2075D = m4312a(c0453l, c1072ab, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0339d.f2074C != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2074C == LogicBoolean.falseBoolean) {
                c0339d.f2074C = null;
            }
            C0424b m4114a = C0424b.m4114a(c0453l, c1072ab, str, str2 + "addResources", true);
            if (m4114a != null && m4114a.m4096c()) {
                c0339d.f2091ad = m4114a;
            }
            c0339d.f2135aJ = EnumC0341f.build;
            if (!"NONE".equalsIgnoreCase(trim)) {
                c0453l.f3278ge.add(c0339d);
            }
        }
    }

    /* renamed from: a */
    public static void m4311a(C0453l c0453l, C1072ab c1072ab, String str, String str2, String str3, boolean z, boolean z2) {
        ArrayList m4294a;
        C0339d c0339d = new C0339d();
        String m656b = c1072ab.m656b(str, str2 + "convertTo", (String) null);
        String m656b2 = c1072ab.m656b(str, str2 + "whenBuilding_temporarilyConvertTo", (String) null);
        AbstractC0377ar[] m4247a = C0359aq.m4247a(c1072ab, str, str2 + "whenBuilding_temporarilyConvertTo_keepFields", (AbstractC0377ar[]) null);
        Float m673a = c1072ab.m673a(str, str2 + "addEnergy", (Float) null);
        C0424b m4114a = C0424b.m4114a(c0453l, c1072ab, str, str2 + "addResources", true);
        c0453l.m3727a(m4114a);
        C0424b m4114a2 = C0424b.m4114a(c0453l, c1072ab, str, str2 + "addResourcesScaledByAIHandicaps", true);
        c0453l.m3727a(m4114a2);
        String m656b3 = c1072ab.m656b(str, str2 + "fireTurretXAtGround", (String) null);
        LogicBoolean m661b = c1072ab.m661b(c0453l, str, str2 + "alsoTriggerOrQueueActionWithTarget", null);
        LogicBoolean m694a = c1072ab.m694a(c0453l, str, str2 + "alsoTriggerOrQueueActionConditional", (LogicBoolean) null);
        String m656b4 = c1072ab.m656b(str, str2 + "alsoTriggerAction", (String) null);
        String m656b5 = c1072ab.m656b(str, str2 + "alsoQueueAction", (String) null);
        String m656b6 = c1072ab.m656b(str, str2 + "spawnEffects", (String) null);
        String m656b7 = c1072ab.m656b(str, str2 + "spawnEffectsOnQueue", (String) null);
        String m656b8 = c1072ab.m656b(str, str2 + "playSoundAtUnit", (String) null);
        String m656b9 = c1072ab.m656b(str, str2 + "playSoundGlobally", (String) null);
        String m656b10 = c1072ab.m656b(str, str2 + "playSoundToPlayer", (String) null);
        String m656b11 = c1072ab.m656b(str, str2 + "playSoundToPlayerOnQueue", (String) null);
        C0336o.m4367a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0326e.m4378a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0329h.m4374a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0322a.m4382a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0332k.m4371a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0323b.m4380a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0325d.m4379a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0333l.m4370a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0328g.m4375a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0334m.m4369a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0327f.m4376a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0331j.m4372a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0330i.m4373a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        LogicBoolean m694a2 = c1072ab.m694a(c0453l, str, str2 + "resetCustomTimer", (LogicBoolean) null);
        boolean z3 = false;
        if (z) {
            z3 = true;
        } else {
            z3 = (m656b == null && m656b2 == null && m673a == null && m656b3 == null) ? true : true;
            z3 = (m4114a.m4096c() || m4114a2.m4096c()) ? true : true;
            z3 = (m656b4 == null && m656b5 == null && m656b6 == null && 0 == 0) ? true : true;
            z3 = (m656b8 == null && m656b9 == null && m656b10 == null && m656b11 == null) ? true : true;
            if (c0339d.f2133ab.size() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if ("NONE".equalsIgnoreCase(m656b)) {
                m656b = null;
            }
            if ("NONE".equalsIgnoreCase(m656b2)) {
                m656b2 = null;
            }
            if (m656b3 != null && m656b3.equalsIgnoreCase("NONE")) {
                m656b3 = null;
            }
            c0339d.f2048a = c0453l.f3278ge.size();
            c0339d.f2049b = str3;
            c0339d.f2060n = c1072ab.m675a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0339d.f2063r = C0448g.m3957a(c1072ab.m656b(str, str2 + "tags", (String) null));
            c0339d.f2123o = c1072ab.m673a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0339d.f2061p = C0424b.m4114a(c0453l, c1072ab, str, str2 + "price", true);
            c0339d.f2062q = C0424b.m4100b(c0453l, c1072ab, str, str2 + "streamingCost", null);
            if (c1072ab.m675a(str, str2 + "switchPriceWithStreamingCost", (Boolean) false).booleanValue()) {
                if (c0339d.f2062q != null) {
                    throw new RuntimeException("[" + str + "]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                }
                c0339d.f2062q = C0424b.m4100b(c0453l, c1072ab, str, str2 + "price", null);
                c0339d.f2061p = C0424b.f2710a;
            }
            c0453l.m3727a(c0339d.f2061p);
            if (c0339d.f2062q != null) {
                c0453l.m3727a(c0339d.f2062q);
            }
            c0339d.f2124J = c1072ab.m675a(str, str2 + "highPriorityQueue", (Boolean) false).booleanValue();
            c0339d.f2125K = c1072ab.m675a(str, str2 + "onlyOneUnitAtATime", (Boolean) false).booleanValue();
            c0339d.f2126L = c1072ab.m675a(str, str2 + "canPlayerCancel", (Boolean) true).booleanValue();
            c0339d.f2128N = c1072ab.m675a(str, str2 + "alwaysSinglePress", (Boolean) false).booleanValue();
            c0339d.f2127M = c1072ab.m675a(str, str2 + "allowMultipleInQueue", (Boolean) true).booleanValue();
            if (!c0339d.f2126L && !c0339d.f2127M && c0339d.f2128N) {
                c0339d.f2129O = true;
            }
            if (!c0339d.f2126L) {
                c0339d.f2122i = EnumC0226u.f1475a;
            } else {
                c0339d.f2122i = EnumC0226u.f1477c;
            }
            c0339d.f2064s = c1072ab.m694a(c0453l, str, str2 + "requireConditional", (LogicBoolean) null);
            c0339d.f2065t = c1072ab.m694a(c0453l, str, str2 + "isActive", (LogicBoolean) null);
            c0339d.f2066u = c1072ab.m694a(c0453l, str, str2 + "isVisible", (LogicBoolean) null);
            c0339d.f2068w = c1072ab.m675a(str, str2 + "isAlsoViewableByEnemies", (Boolean) false).booleanValue();
            c0339d.f2067v = c1072ab.m675a(str, str2 + "isAlsoViewableByAllies", Boolean.valueOf(c0339d.f2068w)).booleanValue();
            if (z2) {
                if (c0339d.f2066u != null && !LogicBoolean.isStaticFalse(c0339d.f2066u)) {
                    throw new RuntimeException("[" + str + "]isVisible doesn't make sense to use in hidden actions");
                }
                c0339d.f2066u = LogicBoolean.falseBoolean;
            }
            c0339d.f2070y = c1072ab.m694a(c0453l, str, str2 + "isLocked", (LogicBoolean) null);
            c0339d.f2071z = m4312a(c0453l, c1072ab, str, str2 + "isLockedMessage", (String) null);
            if (c0339d.f2070y != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2070y == LogicBoolean.falseBoolean) {
                c0339d.f2070y = null;
            }
            c0339d.f2072A = c1072ab.m694a(c0453l, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0339d.f2073B = m4312a(c0453l, c1072ab, str, str2 + "isLockedAltMessage", (String) null);
            if (c0339d.f2072A != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2072A == LogicBoolean.falseBoolean) {
                c0339d.f2072A = null;
            }
            c0339d.f2074C = c1072ab.m694a(c0453l, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0339d.f2075D = m4312a(c0453l, c1072ab, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0339d.f2074C != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2074C == LogicBoolean.falseBoolean) {
                c0339d.f2074C = null;
            }
            c0339d.f2076E = LogicBoolean.create(c0453l, c1072ab.m656b(str, str2 + "ai_isHighPriority", (String) null), null);
            if (c0339d.f2076E == LogicBoolean.falseBoolean) {
                c0339d.f2076E = null;
            }
            if (c0339d.f2076E != null) {
                c0453l.f3169fH = true;
            }
            c0339d.f2077F = c1072ab.m694a(c0453l, str, str2 + "ai_isDisabled", LogicBoolean.falseBoolean);
            c0339d.f2136aK = (EnumC0340e) c1072ab.m674a(str, str2 + "aiUse", c0339d.f2136aK, EnumC0340e.class);
            c0339d.f2080I = c0453l.m3712a(c1072ab.m656b(str, str2 + "guiBuildUnit", (String) null), str2 + "guiBuildUnit", str);
            if (c0339d.f2080I != null) {
                c0339d.f2122i = EnumC0226u.f1476b;
                if (m656b != null) {
                    throw new RuntimeException("[" + str + "]guiBuildUnit and convertTo cannot currently be used the same action");
                }
            }
            c0339d.f2079H = c0453l.m3712a(c1072ab.m656b(str, str2 + "ai_considerSameAsBuilding", (String) null), str2 + "ai_considerSameAsBuilding", str);
            c0339d.f2116aC = c1072ab.m694a(c0453l, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0339d.f2109av = m4291a(c0453l.f2916E, c1072ab.m656b(str, str2 + "iconImage", "NONE"), c0453l.f2932aa, c0453l, str, str2 + "iconImage");
            c0339d.f2112ay = c1072ab.m694a(c0453l, str, str2 + "iconExtraIsVisible", (LogicBoolean) null);
            if (c0339d.f2112ay == LogicBoolean.trueBoolean) {
                c0339d.f2112ay = null;
            }
            c0339d.f2110aw = c0453l.m3718a(c1072ab, str, str2 + "iconExtraImage");
            c0339d.f2111ax = c1072ab.m671a(str, str2 + "iconExtraColor", Integer.valueOf(Color.m5948a(100, 255, 255, 255))).intValue();
            c0339d.f2113az = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "unitShownInUI", null);
            if (c0339d.f2113az != null && c0339d.f2109av != null) {
                throw new RuntimeException("[" + str + "]unitShownInUI and iconImage: doesn't make sense to use both at the same time");
            }
            c0339d.f2114aA = c1072ab.m675a(str, str2 + "unitShownInUIWithHpBar", (Boolean) true).booleanValue();
            c0339d.f2115aB = c1072ab.m675a(str, str2 + "unitShownInUIWithProgressBar", (Boolean) true).booleanValue();
            c0339d.f2134aD = (EnumC0225t) c1072ab.m674a(str, str2 + "displayType", c0339d.f2134aD, EnumC0225t.class);
            c0339d.f2118aF = c1072ab.m675a(str, str2 + "displayRemainingStockpile", (Boolean) false).booleanValue();
            c0339d.f2050c = m4312a(c0453l, c1072ab, str, str2 + "text", VariableScope.nullOrMissingString);
            c0339d.f2051d = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "textAddUnitName", null);
            c0339d.f2054g = m4305a(c1072ab, str, str2 + "textPostFix", (String) null);
            c0339d.f2052e = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "descriptionAddFromUnit", null);
            c0339d.f2053f = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "descriptionAddUnitStats", null);
            c0339d.f2055h = m4312a(c0453l, c1072ab, str, str2 + "description", VariableScope.nullOrMissingString);
            c0339d.f2130R = c1072ab.m646d(str, str2 + "buildSpeed", Float.valueOf(c0339d.f2130R)).floatValue();
            if (c0339d.f2130R == 0.0f) {
                c0339d.f2130R = 50.0f;
            }
            c0339d.f2131S = c1072ab.m675a(str, str2 + "buildSpeed_ignoreFactorySpeedModifiers", Boolean.valueOf(c0339d.f2131S)).booleanValue();
            boolean z4 = false;
            c0339d.f2132T = c1072ab.m675a(str, str2 + "whenBuilding_cannotMove", Boolean.valueOf(c0339d.f2132T)).booleanValue();
            c0339d.f2083U = c0453l.m3714a(c1072ab.m656b(str, str2 + "whenBuilding_playAnimation", (String) null), c0339d.f2083U);
            c0339d.f2084V = c1072ab.m673a(str, str2 + "whenBuilding_rotateTo", c0339d.f2084V);
            c0339d.f2085W = c1072ab.m675a(str, str2 + "whenBuilding_rotateTo_orBackwards", Boolean.valueOf(c0339d.f2085W)).booleanValue();
            c0339d.f2086X = c1072ab.m675a(str, str2 + "whenBuilding_rotateTo_waitTillRotated", Boolean.valueOf(c0339d.f2086X)).booleanValue();
            c0339d.f2087Y = c1072ab.m675a(str, str2 + "whenBuilding_rotateTo_aimAtActionTarget", Boolean.valueOf(c0339d.f2087Y)).booleanValue();
            String m656b12 = c1072ab.m656b(str, str2 + "whenBuilding_rotateTo_rotateTurretX", (String) null);
            if (m656b12 != null) {
                c0339d.f2088Z = c0453l.m3691e(m656b12);
                if (c0339d.f2088Z == null) {
                    throw new RuntimeException("Cannot find turret:" + m656b12 + " for [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
                if (c0339d.f2085W) {
                    throw new RuntimeException("whenBuilding_rotateTo_orBackwards:true not supported with [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
            }
            if (c0339d.f2087Y && c0339d.f2084V == null) {
                c0339d.f2084V = Float.valueOf(0.0f);
            }
            c0339d.f2089aa = c1072ab.m692a(c0453l, str, str2 + "whenBuilding_triggerAction", (C0462t) null);
            c0339d.f2081P = c1072ab.m675a(str, str2 + "convertTo_keepCurrentTags", Boolean.valueOf(c0339d.f2081P)).booleanValue();
            c0339d.f2082Q = C0359aq.m4247a(c1072ab, str, str2 + "convertTo_keepCurrentFields", (AbstractC0377ar[]) null);
            if (m656b2 != null && !"NONE".equalsIgnoreCase(m656b2)) {
                c0339d.f2057k = c0453l.m3712a(m656b2, str2 + "whenBuilding_temporarilyConvertTo", str);
                c0339d.f2058l = m4247a;
                z4 = true;
            }
            if (c0339d.f2132T || c0339d.f2083U != null || c0339d.f2084V != null || c0339d.f2057k != null || c0339d.f2089aa != null) {
                c0453l.f2972bg = true;
            }
            c0339d.f2135aJ = EnumC0341f.convert;
            if (m656b != null && !"NONE".equalsIgnoreCase(m656b)) {
                c0339d.f2078G = c0453l.m3712a(m656b, str2 + "convertTo", str);
                c0339d.f2056j = m656b;
                c0339d.f2127M = false;
                z4 = true;
            }
            if (m673a != null) {
                c0339d.f2090ac = m673a;
                z4 = true;
            }
            if (m4114a != null && m4114a.m4096c()) {
                c0339d.f2091ad = m4114a;
                z4 = true;
            }
            if (m4114a2 != null && m4114a2.m4096c()) {
                c0339d.f2092ae = m4114a2;
                z4 = true;
            }
            c0339d.f2094ag = c1072ab.m679a(str, str2 + "fireTurretXAtGround_withOffset", (PointF) null);
            c0339d.f2095ah = c1072ab.m661b(c0453l, str, str2 + "fireTurretXAtGround_withTarget", null);
            c0339d.f2097aj = c1072ab.m657b(str, str2 + "fireTurretXAtGround_count", (Integer) 1).intValue();
            if (c0339d.f2095ah != null && c0339d.f2094ag == null) {
                c0339d.f2094ag = new PointF(0.0f, 0.0f);
            }
            String m656b13 = c1072ab.m656b(str, str2 + "fireTurretXAtGround_withProjectile", (String) null);
            if (m656b13 != null) {
                c0339d.f2096ai = c0453l.m3689f(m656b13);
                if (c0339d.f2096ai == null) {
                    throw new RuntimeException("Cannot find projectile:" + m656b13 + " for [" + str + "]" + str2 + "fireTurretXAtGround_withProjectile");
                }
            }
            String m656b14 = c1072ab.m656b(str, str2 + "fireTurretXAtGround_onlyOverPassableTileOf", (String) null);
            if (m656b14 != null) {
                c0339d.f2098ak = EnumC0246ao.m4640a(m656b14, str2 + "fireTurretXAtGround_overPassableTileOf");
            }
            if (m656b3 != null) {
                C0411bl m3691e = c0453l.m3691e(m656b3);
                if (m3691e == null) {
                    throw new RuntimeException("Cannot find turret:" + m656b3 + " for [" + str + "]" + str2 + "fireTurretXAtGround");
                }
                c0339d.f2093af = Integer.valueOf(m3691e.f2547e);
                if (c0339d.f2094ag == null) {
                    c0339d.f2122i = EnumC0226u.f1481g;
                    if (c0339d.f2080I != null) {
                        throw new RuntimeException("[" + str + "]guiBuildUnit and fireTurretXAtGround (without withOffset) cannot be used in the same action");
                    }
                }
                z4 = true;
            }
            c0339d.f2099al = m661b;
            c0339d.f2100am = m694a;
            if (m656b4 != null && !"NONE".equalsIgnoreCase(m656b4)) {
                c0339d.f2101an = c0453l.m3696c(m656b4, "alsoTriggerAction", str);
                z4 = true;
            }
            if (m656b5 != null && !"NONE".equalsIgnoreCase(m656b5)) {
                c0339d.f2102ao = c0453l.m3696c(m656b5, "alsoQueueAction", str);
                z4 = true;
            }
            if (m656b6 != null) {
                c0339d.f2103ap = c0453l.m3713a(m656b6, (C0467y) null);
                z4 = true;
            }
            if (m656b7 != null) {
                c0339d.f2104aq = c0453l.m3713a(m656b7, (C0467y) null);
                z4 = true;
            }
            if (m656b8 != null) {
                c0339d.f2105ar = C0409bj.m4159a(c0453l, m656b8);
                z4 = true;
            }
            if (m656b9 != null) {
                c0339d.f2106as = C0409bj.m4159a(c0453l, m656b9);
                z4 = true;
            }
            if (m656b10 != null) {
                c0339d.f2107at = C0409bj.m4159a(c0453l, m656b10);
                z4 = true;
            }
            if (m656b11 != null) {
                c0339d.f2108au = C0409bj.m4159a(c0453l, m656b11);
                z4 = true;
            }
            if (m694a2 != null) {
                c0339d.f2117aE = m694a2;
                z4 = true;
            }
            if (c0339d.f2133ab.size() > 0) {
                z4 = true;
            }
            ArrayList arrayList = null;
            String m656b15 = c1072ab.m656b(str, str2 + "autoTriggerOnEvent", (String) null);
            if (m656b15 != null && (m4294a = m4294a(str, str2 + "autoTriggerOnEvent", m656b15)) != null) {
                if (m4294a.size() < 1) {
                    throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: Expected 1 or more options, got:" + m4294a.size());
                }
                Iterator it = m4294a.iterator();
                while (it.hasNext()) {
                    C0350ah c0350ah = (C0350ah) it.next();
                    try {
                        EnumC0347ae enumC0347ae = (EnumC0347ae) C1072ab.m683a(c0350ah.f2226a, (Enum) null, EnumC0347ae.class);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        C0346ad c0346ad = new C0346ad();
                        c0346ad.f2168a = enumC0347ae;
                        if (c0350ah.f2227b != null) {
                            for (String str4 : c0350ah.f2227b.keySet()) {
                                String str5 = (String) c0350ah.f2227b.get(str4);
                                boolean z5 = false;
                                if (str4.equalsIgnoreCase("withtag")) {
                                    if (c0346ad.f2168a != EnumC0347ae.f2185n && c0346ad.f2168a != EnumC0347ae.f2188q) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2168a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (str4.equalsIgnoreCase("withprojectiletag")) {
                                    if (c0346ad.f2168a != EnumC0347ae.f2185n) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2168a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (str4.equalsIgnoreCase("withactiontag")) {
                                    if (c0346ad.f2168a != EnumC0347ae.f2177f && c0346ad.f2168a != EnumC0347ae.f2178g) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2168a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (z5) {
                                    String m2082p = C0758f.m2082p(str5);
                                    if (m2082p == null) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2168a.name() + " expected quoted string, got: " + str5);
                                    }
                                    if (c0346ad.f2171d != null) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2168a.name() + " tag was set twice");
                                    }
                                    c0346ad.f2171d = C1072ab.m630j(str, str2 + "autoTriggerOnEvent", m2082p);
                                } else {
                                    throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: Unknown parameter: " + str4);
                                }
                            }
                            continue;
                        }
                        arrayList.add(c0346ad);
                    } catch (C0412bm e) {
                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + e.getMessage(), e);
                    }
                }
            }
            LogicBoolean m694a3 = c1072ab.m694a(c0453l, str, str2 + "autoTrigger", (LogicBoolean) null);
            String m656b16 = c1072ab.m656b(str, str2 + "autoTrigger", (String) null);
            EnumC0461s enumC0461s = (EnumC0461s) c1072ab.m674a(str, str2 + "autoTriggerCheckRate", c0453l.f3236cb, EnumC0461s.class);
            c0339d.f2059m = z4;
            if (z4 || c0339d.f2066u != null) {
                if (m694a3 != null && z4) {
                    C0460r c0460r = new C0460r();
                    c0460r.f3336a = m694a3;
                    c0460r.f3337b = m656b16;
                    c0460r.f3338c = enumC0461s;
                    c0460r.f3339d = new C0342g(c0339d, c0453l.m3712a(c0339d.f2056j, "[" + str + "]" + str2, str));
                    c0453l.f3274fU.add(c0460r);
                }
                if (arrayList != null && z4) {
                    C0342g c0342g = new C0342g(c0339d, c0453l.m3712a(c0339d.f2056j, "[" + str + "]" + str2, str));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0346ad c0346ad2 = (C0346ad) it2.next();
                        c0346ad2.f2169b = c0342g;
                        c0346ad2.f2170c = c0453l;
                        c0453l.f3282gn.add(c0346ad2);
                    }
                }
                if (c0339d.f2056j != null && c0339d.f2061p != null && c0339d.f2061p.f2699b > 0) {
                    c0453l.f3179gf = true;
                }
                c0453l.f3278ge.add(c0339d);
            }
        }
    }

    /* renamed from: a */
    public static String m4309a(C0453l c0453l, String str, String str2) {
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (c0453l.f2919I == null) {
                str = "units/common.ini";
            } else {
                str = c0453l.f2919I.f5433q + "/common.ini";
            }
        }
        String str3 = C0758f.m2094h(str) + "/";
        while (true) {
            if (str2.startsWith("/") || str2.startsWith("\\")) {
                str2 = str2.substring(1);
            } else {
                return str3 + str2;
            }
        }
    }

    /* renamed from: a */
    public static void m4318a(long j, EnumC0349ag enumC0349ag) {
        enumC0349ag.f2224o += C0727bl.m2438a(j);
    }

    /* renamed from: i */
    public static void m4271i() {
        EnumC0349ag[] values;
        Core.LogDebug2("==Timing==");
        for (EnumC0349ag enumC0349ag : EnumC0349ag.values()) {
            Core.LogDebug2(enumC0349ag.name() + ": " + C0727bl.m2439a(enumC0349ag.f2224o));
        }
    }

    /* renamed from: j */
    public static void m4270j() {
        for (EnumC0349ag enumC0349ag : EnumC0349ag.values()) {
            enumC0349ag.f2224o = 0.0d;
        }
    }

    /* renamed from: a */
    public static C0934e m4291a(String str, String str2, boolean z, C0453l c0453l, String str3, String str4) {
        try {
            return m4292a(str, str2, z, c0453l);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("[" + str3 + "]" + str4 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static C0934e m4292a(String str, String str2, boolean z, C0453l c0453l) {
        long m2440a = C0727bl.m2440a();
        C0934e m4282b = m4282b(str, str2, z, c0453l);
        m4318a(m2440a, EnumC0349ag.imageLoadOrGet);
        return m4282b;
    }

    /* renamed from: b */
    public static C0934e m4282b(String str, String str2, boolean z, C0453l c0453l) {
        C0934e mo183a;
        if (str2 == null || str2.equalsIgnoreCase("NONE") || str2.equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        boolean z2 = false;
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (c0453l.f2919I == null) {
                str = "units/common.ini";
            } else {
                str = c0453l.f2919I.f5433q + "/common.ini";
            }
        }
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        Core m1087A = Core.m1087A();
        String str3 = C0758f.m2094h(str) + "/";
        String str4 = "[" + z + "," + z2 + "]" + str3 + str2;
        C0934e m4279c = m4279c(str4);
        if (m4279c != null) {
            return m4279c;
        }
        C1098j m4278c = m4278c(str3, str2, c0453l);
        int i = 0;
        if (f2194e != null) {
            i = f2194e.f5451I;
        }
        if (i > 5) {
            Core.LogDebug2("Fast failing to oom image for this mod");
            mo183a = m1087A.f6113bO.mo128r();
        } else {
            long m2440a = C0727bl.m2440a();
            try {
                mo183a = m1087A.f6113bO.mo183a((InputStream) m4278c, true);
                m4318a(m2440a, EnumC0349ag.imageLoad);
                if (mo183a.mo394A()) {
                    Core.LogDebug2("oomErrors:" + f2199l);
                    f2199l++;
                    if (f2194e != null) {
                        f2194e.f5451I++;
                        f2194e.f5452J++;
                    }
                } else if (f2194e != null && !f2194e.f5442z && Core.f6210aZ) {
                    mo183a.m891z();
                }
            } catch (RuntimeException e) {
                Core.LogDebug2("imageStream:" + m4278c);
                throw new RuntimeException("Error decode image from: " + C0750a.m2277d(str3 + str2), e);
            }
        }
        try {
            m4278c.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (mo183a == null) {
            throw new RuntimeException("Failed to decode image: " + C0750a.m2275e(str3 + str2));
        }
        mo183a.mo391a(z);
        if (z2) {
            mo183a = AbstractC0244am.m4777a(mo183a, mo183a.f6402p, mo183a.f6403q);
        }
        m4306a(mo183a);
        m4300a(str4, mo183a);
        return mo183a;
    }

    /* renamed from: a */
    public static void m4300a(String str, C0934e c0934e) {
        f2201g.put(str, c0934e);
    }

    /* renamed from: c */
    public static C0934e m4279c(String str) {
        C0934e c0934e = (C0934e) f2201g.get(str);
        if (c0934e != null) {
            f2197j++;
            m4306a(c0934e);
            c0934e.mo44t();
            return c0934e;
        }
        if (f2198k) {
            Core.LogDebug2("loadImageInConf: cache miss: " + str);
        }
        f2196i++;
        return null;
    }

    /* renamed from: a */
    public static AbstractC0635i m4295a(String str, String str2, C0453l c0453l) {
        long m2440a = C0727bl.m2440a();
        AbstractC0635i m4283b = m4283b(str, str2, c0453l);
        m4318a(m2440a, EnumC0349ag.soundLoadOrGet);
        return m4283b;
    }

    /* renamed from: b */
    public static AbstractC0635i m4283b(String str, String str2, C0453l c0453l) {
        if (str2 == null || str2.equalsIgnoreCase("NONE")) {
            return null;
        }
        Core m1087A = Core.m1087A();
        if (!str2.contains(".")) {
            return m1087A.f6111bM.m2774a(str2);
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (c0453l.f2919I == null) {
                str = "units/common.ini";
            } else {
                str = c0453l.f2919I.f5433q + "/common.ini";
            }
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        String str3 = C0758f.m2094h(str) + "/";
        String str4 = str3 + str2;
        AbstractC0635i abstractC0635i = (AbstractC0635i) f2202h.get(str4);
        if (abstractC0635i != null) {
            m4308a(abstractC0635i);
            return abstractC0635i;
        } else if (!str2.toLowerCase(Locale.ROOT).endsWith(".ogg") && !str2.toLowerCase(Locale.ROOT).endsWith(".wav")) {
            throw new RuntimeException("Failed to open sound: " + str3 + VariableScope.nullOrMissingString + str2 + " only the ogg & wav sound formats are supported.");
        } else {
            C1098j m4278c = m4278c(str3, str2, c0453l);
            long m2440a = C0727bl.m2440a();
            AbstractC0635i m2773a = m1087A.f6111bM.m2773a(str2, m4278c, false);
            try {
                m4278c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            m4318a(m2440a, EnumC0349ag.soundLoad);
            if (m2773a == null) {
                String str5 = "Sound file found but failed to load: " + str4;
                if (str2.toLowerCase(Locale.ROOT).endsWith(".ogg")) {
                    str5 = str5 + " - Check if this file is truly a ogg";
                }
                c0453l.m3665r(str5);
                return m1087A.f6111bM.m2769b("Failed to load");
            }
            m4308a(m2773a);
            f2202h.put(str4, m2773a);
            return m2773a;
        }
    }

    /* renamed from: a */
    public static boolean m4293a(String str, String str2, String str3, C0824b c0824b) {
        if (str2 == null || !str2.contains("..") || Core.m1012as()) {
            return true;
        }
        String canonicalPath = new File(C0750a.m2275e(str3)).getCanonicalPath();
        if (canonicalPath.startsWith(new File(C0750a.m2275e("units")).getCanonicalPath())) {
            return true;
        }
        String m1675k = c0824b.m1675k();
        boolean startsWith = canonicalPath.startsWith(m1675k);
        if (!startsWith) {
            Core.m998b("File: '" + canonicalPath + "' is not within mod: '" + m1675k + "'");
        }
        return startsWith;
    }

    /* renamed from: a */
    public static String m4296a(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        while (true) {
            if (str2.startsWith("/") || str2.startsWith("\\")) {
                str2 = str2.substring(1);
            } else {
                return str + str2;
            }
        }
    }

    /* renamed from: c */
    public static C1098j m4278c(String str, String str2, C0453l c0453l) {
        String m4296a = m4296a(str, str2);
        C0824b c0824b = null;
        if (c0453l != null) {
            c0824b = c0453l.f2919I;
        } else {
            Core.m973g("findAssetSteam meta==null");
        }
        if (c0824b != null) {
            try {
                if (!m4293a(str, str2, m4296a, c0824b)) {
                    throw new RuntimeException("File is outside mod: " + m4296a);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        C1098j m2269j = C0750a.m2269j(m4296a);
        if (m2269j == null) {
            Core.LogDebug2("Orginal path: " + m4296a);
            throw new RuntimeException("IO Error: Failed to open: " + m4307a(c0824b, m4296a, true));
        }
        return m2269j;
    }

    /* renamed from: b */
    public static void m4286b(C0453l c0453l) {
        C0384ay[] c0384ayArr = c0453l.f3223aw;
        for (C0384ay c0384ay : c0384ayArr) {
            float f = -1.0f;
            C0384ay c0384ay2 = null;
            float f2 = 1.0f;
            if (c0384ay.f2300o) {
                f2 = 0.1f;
            }
            for (C0384ay c0384ay3 : c0384ayArr) {
                if (c0384ay != c0384ay3 && !c0384ay3.f2280l) {
                    float m2209a = C0758f.m2209a(c0384ay.f2275d * f2, c0384ay.f2276e, c0384ay3.f2275d * f2, c0384ay3.f2276e);
                    if (c0384ay2 == null || m2209a < f) {
                        f = m2209a;
                        c0384ay2 = c0384ay3;
                    }
                }
            }
            float m2212a = C0758f.m2212a(f) + 2.0f;
            float f3 = m2212a * m2212a;
            ArrayList arrayList = new ArrayList();
            for (C0384ay c0384ay4 : c0384ayArr) {
                if (c0384ay != c0384ay4 && !c0384ay4.f2280l && C0758f.m2209a(c0384ay.f2275d * f2, c0384ay.f2276e, c0384ay4.f2275d * f2, c0384ay4.f2276e) <= f3) {
                    arrayList.add(Integer.valueOf(c0384ay4.f2272a));
                }
            }
            c0384ay.f2293S = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                c0384ay.f2293S[i] = ((Integer) arrayList.get(i)).intValue();
            }
        }
    }

    /* renamed from: k */
    public static String m4269k() {
        return "builtin_mods";
    }

    /* renamed from: l */
    public static String m4268l() {
        return "builtin_mods_enabled";
    }

    /* renamed from: m */
    public static String m4267m() {
        String str;
        if (Core.f6205aU) {
            str = "/SD/mods/units";
        } else {
            str = "/SD/rustedWarfare/units";
        }
        return str;
    }

    /* renamed from: a */
    public static ArrayList m4294a(String str, String str2, String str3) {
        if (str3 == null || VariableScope.nullOrMissingString.equals(str3) || "NONE".equalsIgnoreCase(str3)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C0758f.m2141b(str3, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] m2103f = C0758f.m2103f(trim, "(");
                    if (m2103f == null) {
                        throw new C0412bm("[" + str + "]" + str2 + ": Unexpected format for '" + trim + "' of " + str3);
                    }
                    trim = m2103f[0];
                    str4 = m2103f[1].trim();
                }
                C0350ah c0350ah = new C0350ah();
                c0350ah.f2226a = trim;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0412bm("[" + str + "]" + str2 + ": Expected ')' in '" + trim + "' of " + str3);
                    }
                    Iterator it2 = C0758f.m2169a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str5 = (String) it2.next();
                        if (!str5.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] m2103f2 = C0758f.m2103f(str5, "=");
                            if (m2103f2 == null) {
                                throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected key format for '" + trim + "' of " + str3);
                            }
                            String trim2 = m2103f2[0].trim();
                            String trim3 = m2103f2[1].trim();
                            if (c0350ah.f2227b == null) {
                                c0350ah.f2227b = new HashMap();
                            }
                            c0350ah.f2227b.put(trim2, trim3);
                        }
                    }
                }
                arrayList.add(c0350ah);
            }
        }
        return arrayList;
    }
}
