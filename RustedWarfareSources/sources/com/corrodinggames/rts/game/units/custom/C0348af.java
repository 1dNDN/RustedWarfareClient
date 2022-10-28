package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
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
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    static int f2192b;

    /* renamed from: c */
    static int f2193c;

    /* renamed from: d */
    public static int f2194d;

    /* renamed from: e */
    static C0824b f2195e;

    /* renamed from: f */
    static boolean f2196f;

    /* renamed from: i */
    static int f2199i;

    /* renamed from: j */
    static int f2200j;

    /* renamed from: k */
    static boolean f2201k;

    /* renamed from: l */
    static int f2202l;

    /* renamed from: a */
    static boolean f2191a = false;

    /* renamed from: g */
    public static HashMap f2197g = new HashMap();

    /* renamed from: h */
    public static HashMap f2198h = new HashMap();

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
    public static void m4089a(int i) {
        if (f2195e != null) {
            f2195e.f5449G += i;
        }
    }

    /* renamed from: a */
    public static void m4090a() {
        m4041i();
        m4040j();
    }

    /* renamed from: a */
    public static void m4076a(C0934e c0934e) {
        if (c0934e != null && !c0934e.f6408v) {
            if (LoggerMaybe.m998ay() && (c0934e instanceof C0937h)) {
                return;
            }
            c0934e.f6408v = true;
            m4089a(c0934e.mo389u());
        }
    }

    /* renamed from: a */
    public static void m4058a(C0934e[] c0934eArr) {
        if (c0934eArr != null) {
            C0934e c0934e = null;
            for (C0934e c0934e2 : c0934eArr) {
                if (c0934e2 != c0934e) {
                    m4076a(c0934e2);
                }
                if (c0934e == null) {
                    c0934e = c0934e2;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4078a(AbstractC0635i abstractC0635i) {
        if (!abstractC0635i.f4069g) {
            abstractC0635i.f4069g = true;
            if (f2195e != null) {
                f2195e.f5450H += abstractC0635i.mo81a();
            }
        }
    }

    /* renamed from: a */
    public static boolean m4074a(C1101m c1101m) {
        C0453l c0453l;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList(C0453l.f2905c);
        ArrayList arrayList2 = new ArrayList(C0453l.f2906d);
        C1101m c1101m2 = new C1101m();
        String str = null;
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            C0453l m4085a = m4085a((C0453l) it.next());
            if (m4085a == null) {
                LoggerMaybe.LogDebug2("Failed to apply changes to unit type: " + c0453l.f2940L);
                z = true;
                if (str == null && f2209s != null) {
                    str = f2209s;
                }
            } else {
                LoggerMaybe.LogDebug2("Changes applied to unit type: " + c0453l.f2940L);
                z2 = true;
                c1101m2.add(m4085a);
            }
        }
        if (str != null && LoggerMaybe.m1004as()) {
            m1079A.m982c("Unit errors", str);
        }
        if (z2 && !m4047c(false)) {
            z = true;
        }
        if (z2 && !z) {
            C0453l.f2907e = null;
            m4045e();
            f2209s = null;
            AbstractC0197n.m4728M();
            C0797f.m1870J();
            z3 = true;
            if (!z) {
                Iterator it2 = c1101m2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0453l c0453l2 = (C0453l) it2.next();
                    if (c0453l2.f3283gq.size() > 0) {
                        m1079A.m1037a(c0453l2.f3283gq.size() + " Warning(s) loading: " + c0453l2.m3530b() + " \n" + ((String) c0453l2.f3283gq.get(0)), 1);
                        c0453l2.f3283gq.clear();
                        z3 = false;
                        break;
                    }
                }
            }
        }
        if (z) {
            LoggerMaybe.LogDebug2("Failed to load some units, keeping old config");
            synchronized (C0453l.f2905c) {
                C0453l.f2905c.clear();
                C0453l.f2905c.addAll(arrayList);
            }
            C0453l.f2906d = arrayList2;
        }
        return z3;
    }

    /* renamed from: b */
    public static void m4057b() {
        C1101m c1101m = new C1101m();
        f2192b = 0;
        f2193c = 0;
        f2194d = 0;
        Iterator it = AbstractC0244am.m4488bF().iterator();
        while (it.hasNext()) {
            InterfaceC0303as mo5755r = ((AbstractC0244am) it.next()).mo5755r();
            if ((mo5755r instanceof C0453l) && !c1101m.contains(mo5755r)) {
                c1101m.add((C0453l) mo5755r);
            }
        }
        if (c1101m.size() > 0) {
            m4074a(c1101m);
        }
    }

    /* renamed from: c */
    public static void m4050c() {
        boolean z = false;
        C1101m c1101m = new C1101m();
        Iterator it = C0453l.f2905c.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            boolean z2 = false;
            Iterator it2 = c0453l.f2913k.iterator();
            while (it2.hasNext()) {
                C0468z c0468z = (C0468z) it2.next();
                long m3458a = c0468z.m3458a(false);
                if (m3458a != c0468z.f3360a) {
                    z2 = true;
                    c0468z.f3360a = m3458a;
                }
            }
            if (z2) {
                if (!z) {
                    LoggerMaybe.LogDebug2("Detected unit changes");
                    z = true;
                }
                c1101m.add(c0453l);
            }
        }
        if (c1101m.size() > 0) {
            m4074a(c1101m);
        }
    }

    /* renamed from: d */
    public static void m4046d() {
        if (C0453l.f2907e != null) {
            LoggerMaybe.LogDebug2("applyPendingNetworkUnits: Applying new network units from server (" + C0453l.f2907e.size() + " units)");
            C0453l.f2906d = C0453l.f2907e;
            C0453l.f2907e = null;
            m4045e();
            return;
        }
        LoggerMaybe.LogDebug2("applyPendingNetworkUnits: no server units list found");
    }

    /* renamed from: a */
    public static ArrayList m4059a(boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (C0453l.f2905c) {
            Iterator it = C0453l.f2905c.iterator();
            while (it.hasNext()) {
                C0453l c0453l = (C0453l) it.next();
                if (c0453l.f2937I == null || (c0453l.f2937I.m1631m() && z)) {
                    arrayList.add(c0453l);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C1072ab m4073a(String str) {
        synchronized (f2204n) {
            C1072ab c1072ab = (C1072ab) f2204n.get(str);
            if (c1072ab != null) {
                return c1072ab;
            }
            C1098j m4054b = m4054b(str);
            if (m4054b == null) {
                return null;
            }
            try {
                C1072ab c1072ab2 = new C1072ab(new BufferedInputStream(m4054b), str);
                c1072ab2.m691a();
                c1072ab2.f6827f = m4054b.m545d();
                f2204n.put(str, c1072ab2);
                return c1072ab2;
            } catch (IOException e) {
                e.printStackTrace();
                throw new C0412bm("Load of '" + str + "' failed: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m4080a(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        C1072ab m4073a = m4073a(str);
        if (m4073a == null) {
            if (z) {
                return;
            }
            throw new C0412bm("[" + str2 + "] Could not find conf target:" + str);
        }
        c0453l.m3495o(m4073a.f6827f);
        c1072ab.m683a(m4073a);
        m4084a(c0453l, c1072ab, m4073a, str, 1);
    }

    /* renamed from: a */
    public static void m4084a(C0453l c0453l, C1072ab c1072ab, C1072ab c1072ab2, String str, int i) {
        String m4066a;
        String str2;
        if (i > 10) {
            throw new C0412bm("copyFrom can only be 10 levels deep, maybe you have a loop?");
        }
        String m649b = c1072ab2.m649b("core", "copyFrom", (String) null);
        if (m649b != null) {
            String[] split = m649b.split(",");
            Collections.reverse(Arrays.asList(split));
            for (String str3 : split) {
                String trim = str3.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    if (trim.contains("..")) {
                        throw new C0412bm("'..' not supported in copyFrom");
                    }
                    if (trim.startsWith("ROOT:")) {
                        String substring = trim.substring("ROOT:".length());
                        if (c0453l.f2937I == null) {
                            str2 = "units/common.ini";
                        } else {
                            str2 = c0453l.f2937I.f5433q + "/common.ini";
                        }
                        m4066a = m4066a(C0758f.m2045h(str2), substring);
                    } else if (trim.startsWith("CORE:")) {
                        m4066a = m4066a(C0758f.m2045h("units/common.ini"), trim.substring("CORE:".length()));
                    } else {
                        m4066a = m4066a(C0758f.m2045h(str), trim);
                    }
                    C1072ab m4073a = m4073a(m4066a);
                    if (m4073a == null) {
                        String str4 = "Could not find copyFrom target:" + m4066a;
                        if (i != 0) {
                            str4 = str4 + " (while loading: " + str + ")";
                        }
                        throw new C0412bm(str4);
                    }
                    c0453l.m3495o(m4073a.f6827f);
                    c1072ab.m683a(m4073a);
                    m4084a(c0453l, c1072ab, m4073a, m4066a, i + 1);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4083a(C0453l c0453l, C1072ab c1072ab, String str, String str2, int i) {
        if (i > 10) {
            throw new C0412bm("@copyFromSection can only be 10 levels deep, maybe you have a loop?");
        }
        String m649b = c1072ab.m649b(str2, "@copyFromSection", (String) null);
        if (m649b == null || m649b.equals(VariableScope.nullOrMissingString)) {
            return;
        }
        String[] split = m649b.split(",");
        Collections.reverse(Arrays.asList(split));
        for (String str3 : split) {
            String trim = str3.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                C1101m m622k = c1072ab.m622k(trim, VariableScope.nullOrMissingString);
                if (m622k.size() == 0) {
                    throw new C0412bm("[" + str2 + "]@copyFromSection: Could not find keys in target section: " + trim);
                }
                Iterator it = m622k.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String m652b = c1072ab.m652b(trim, str4);
                    if (m652b != null) {
                        c1072ab.m638d(str, str4, m652b);
                    }
                }
                m4083a(c0453l, c1072ab, str, trim, i + 1);
            }
        }
    }

    /* renamed from: a */
    public static C0385az m4075a(C1072ab c1072ab, String str, String str2, String str3) {
        return c1072ab.m659a(str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0351ai m4082a(C0453l c0453l, C1072ab c1072ab, String str, String str2, String str3) {
        return c1072ab.m684a(c0453l, str, str2, str3);
    }

    /* renamed from: a */
    public static C0453l m4085a(C0453l c0453l) {
        String str = c0453l.f2931C;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0453l c0453l2 = null;
        String str2 = null;
        if (c0453l.f2937I != null) {
            str2 = c0453l.f2937I.f5460R;
        }
        synchronized (f2204n) {
            f2204n.clear();
        }
        f2209s = null;
        try {
            c0453l2 = m4071a(str, c0453l.f2937I, c0453l.f2938J, c0453l.f2939K);
        } catch (RuntimeException e) {
            e.printStackTrace();
            if (f2209s == null) {
                m1079A.m1037a("Error loading unit:" + m4077a(c0453l.f2937I, str, true) + "\n" + e.getMessage(), 1);
            }
        }
        if (c0453l2 == null && c0453l.f2937I != null) {
            c0453l.f2937I.f5460R = str2;
        }
        if (c0453l2 != null) {
            synchronized (C0453l.f2905c) {
                C0453l.f2905c.remove(c0453l);
            }
            m4086a((InterfaceC0303as) c0453l, c0453l2, true);
            if (C0453l.f2906d.remove(c0453l)) {
                C0453l.f2906d.add(c0453l2);
                if (c0453l.f2935G != c0453l2.f2935G) {
                    f2194d++;
                }
            } else {
                LoggerMaybe.LogDebug2("Changed unit was not enabled (original not found in customUnitTypes)");
            }
            AbstractC0197n.m4728M();
            C0797f.m1870J();
        }
        return c0453l2;
    }

    /* renamed from: a */
    public static void m4086a(InterfaceC0303as interfaceC0303as, C0453l c0453l, boolean z) {
        Iterator it = AbstractC0244am.m4488bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof C0451j) {
                C0451j c0451j = (C0451j) abstractC0244am;
                if (c0451j.f2863x == interfaceC0303as) {
                    AbstractC0197n.m4690b((AbstractC0244am) c0451j);
                    c0451j.m3684a(c0453l, false, z);
                    c0451j.mo3309S();
                    if (c0451j.m4422de() != null) {
                        c0451j.m4422de().m3907a(c0453l);
                    }
                    AbstractC0197n.m4674c(c0451j);
                }
                if (c0451j.f2865z == interfaceC0303as) {
                    c0451j.f2865z = c0453l;
                }
            }
        }
    }

    /* renamed from: b */
    public static String m4051b(boolean z) {
        ArrayList m4059a = m4059a(z);
        C0453l.f2907e = null;
        C0453l.f2906d = m4059a;
        f2209s = null;
        m4045e();
        return f2209s;
    }

    /* renamed from: c */
    public static boolean m4047c(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = C0453l.f2906d;
        if (z) {
            arrayList = m4059a(true);
        } else {
            arrayList = C0453l.f2906d;
        }
        boolean z2 = true;
        f2209s = null;
        C0453l.f2906d = arrayList;
        m4043g();
        if (f2209s != null) {
            z2 = false;
        }
        C0453l.f2906d = arrayList2;
        m4043g();
        return z2;
    }

    /* renamed from: e */
    public static void m4045e() {
        synchronized (f2205o) {
            m4036n();
        }
    }

    /* renamed from: n */
    private static void m4036n() {
        C0453l c0453l = null;
        ArrayList arrayList = new ArrayList();
        if (LoggerMaybe.m1079A().m1005ar()) {
            for (AbstractC0249ar abstractC0249ar : AbstractC0249ar.values()) {
                arrayList.add(abstractC0249ar);
            }
        }
        Iterator it = C0453l.f2906d.iterator();
        while (it.hasNext()) {
            C0453l c0453l2 = (C0453l) it.next();
            arrayList.add(c0453l2);
            if (c0453l2.f2940L.equals("missing") && c0453l2.f2937I == null) {
                c0453l = c0453l2;
            }
        }
        AbstractC0249ar.f1739ae = arrayList;
        AbstractC0244am.m4483bL();
        m4043g();
        m4044f();
        C0428a.m3823d();
        if (c0453l == null) {
            LoggerMaybe.LogDebug2("missingPlaceHolder is not an active unit, searching for new target");
            Iterator it2 = C0453l.f2906d.iterator();
            while (it2.hasNext()) {
                C0453l c0453l3 = (C0453l) it2.next();
                if (c0453l3.f2940L.equals("missing")) {
                    LoggerMaybe.LogDebug2("Found a missing placeholder");
                    c0453l = c0453l3;
                }
            }
        }
        C0453l.f2904b = c0453l;
    }

    /* renamed from: f */
    public static void m4044f() {
        float f = 50.0f;
        float f2 = 50.0f;
        Iterator it = C0453l.f2906d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            float f3 = c0453l.f3105cU;
            if (f3 > 250.0f) {
                f3 = 250.0f;
            }
            if (f < f3) {
                f = f3;
            }
            if (c0453l.f2987aG && f2 < f3) {
                f2 = f3;
            }
        }
        f2206p = f;
        f2207q = f2;
    }

    /* renamed from: b */
    public static C1098j m4054b(String str) {
        return C0750a.m2220j(VariableScope.nullOrMissingString + str);
    }

    /* renamed from: a */
    public static void m4060a(ArrayList arrayList) {
        Collections.sort(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v140, types: [com.corrodinggames.rts.game.units.a.v] */
    /* JADX WARN: Type inference failed for: r0v144, types: [com.corrodinggames.rts.game.units.a.l] */
    /* JADX WARN: Type inference failed for: r0v260, types: [com.corrodinggames.rts.game.units.a.l] */
    /* renamed from: a */
    public static void m4087a(InterfaceC0303as interfaceC0303as) {
        C0342g c0342g;
        C0227v c0227v;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        try {
            interfaceC0303as.mo4224h();
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l = (C0453l) interfaceC0303as;
                if (c0453l.f3247fG != null) {
                    InterfaceC0303as m3487s = C0453l.m3487s(c0453l.f3247fG);
                    if (m3487s == null) {
                        throw new C0412bm("Could not find [ai]upgradedFrom target:" + c0453l.f3247fG);
                    }
                    c0453l.m3528b(m3487s);
                }
                Iterator it = c0453l.f2918p.iterator();
                while (it.hasNext()) {
                    ((C0463u) it.next()).mo3466a();
                }
                if (c0453l.f3194eF) {
                    C0453l.f2909g.add(c0453l);
                }
            }
            Iterator it2 = C0453l.f2906d.iterator();
            while (it2.hasNext()) {
                C0453l c0453l2 = (C0453l) it2.next();
                if (interfaceC0303as instanceof C0453l) {
                    C0453l c0453l3 = (C0453l) interfaceC0303as;
                    if (c0453l2.f3247fG != null && c0453l2.f3247fG.equalsIgnoreCase(c0453l3.mo4223i())) {
                        c0453l3.m3528b(c0453l2);
                    }
                }
                Iterator it3 = c0453l2.f3270gd.iterator();
                while (it3.hasNext()) {
                    C0458p c0458p = (C0458p) it3.next();
                    if (c0458p.f3329a.equalsIgnoreCase(interfaceC0303as.mo4223i())) {
                        c0458p.f3333e = true;
                        boolean z = false;
                        for (int i = c0453l2.f3068cj; i <= 3; i++) {
                            ArrayList mo4233a = interfaceC0303as.mo4233a(i);
                            if (c0453l2.f2987aG || c0458p.f3331c) {
                                c0227v = new C0227v(c0453l2);
                            } else {
                                c0227v = new C0217l(c0453l2, null);
                            }
                            if (c0458p.f3330b != -999.0f) {
                                c0227v.f1460g = c0458p.f3330b;
                            }
                            if (c0458p.f3334f != null) {
                                boolean z2 = false;
                                if (!(interfaceC0303as instanceof C0453l) && !(AbstractC0244am.m4505a(interfaceC0303as) instanceof AbstractC0623y)) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    c0227v.f1461h = C0338c.m4128a(c0458p);
                                } else if (!z) {
                                    z = true;
                                    c0453l2.m3489r("builtFrom isLocked currently cannot be used when targeting old-style unit:" + interfaceC0303as.mo4223i());
                                }
                            }
                            boolean z3 = false;
                            Iterator it4 = mo4233a.iterator();
                            while (it4.hasNext()) {
                                if (c0227v.equals((AbstractC0224s) it4.next())) {
                                    z3 = true;
                                }
                            }
                            if (!z3) {
                                mo4233a.add(c0227v);
                            }
                            m4060a(mo4233a);
                        }
                    }
                }
            }
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l4 = (C0453l) interfaceC0303as;
                Iterator it5 = c0453l4.f3271ge.iterator();
                while (it5.hasNext()) {
                    C0339d c0339d = (C0339d) it5.next();
                    if (c0339d.f2056j != null && c0339d.f2056j.equalsIgnoreCase("setRally")) {
                        for (int i2 = 1; i2 <= 3; i2++) {
                            ArrayList mo4233a2 = interfaceC0303as.mo4233a(i2);
                            C0220o c0220o = new C0220o();
                            if (c0339d.f2123o != -999.0f) {
                                c0220o.f1460g = c0339d.f2123o;
                            }
                            mo4233a2.add(c0220o);
                            c0453l4.f3111da = true;
                            m4060a(mo4233a2);
                        }
                    } else if (c0339d.f2056j != null && c0339d.f2056j.equalsIgnoreCase("reclaim")) {
                        for (int i3 = 1; i3 <= 3; i3++) {
                            ArrayList mo4233a3 = interfaceC0303as.mo4233a(i3);
                            C0218m c0218m = new C0218m(true);
                            if (c0339d.f2123o != -999.0f) {
                                c0218m.f1460g = c0339d.f2123o;
                            }
                            mo4233a3.add(c0218m);
                            m4060a(mo4233a3);
                        }
                    } else if (c0339d.f2056j != null && c0339d.f2056j.equalsIgnoreCase("repair")) {
                        for (int i4 = 1; i4 <= 3; i4++) {
                            ArrayList mo4233a4 = interfaceC0303as.mo4233a(i4);
                            C0219n c0219n = new C0219n();
                            if (c0339d.f2123o != -999.0f) {
                                c0219n.f1460g = c0339d.f2123o;
                            }
                            mo4233a4.add(c0219n);
                            m4060a(mo4233a4);
                        }
                    } else {
                        InterfaceC0303as interfaceC0303as2 = null;
                        if (c0339d.f2056j != null) {
                            interfaceC0303as2 = AbstractC0249ar.m4372a(c0339d.f2056j);
                            if (interfaceC0303as2 == null) {
                                throw new C0412bm("Could not find canBuild target:" + c0339d.f2056j);
                            }
                        } else if (c0339d.f2135aJ != EnumC0341f.convert) {
                            throw new C0412bm("'Target' required for action:" + c0339d.m4123a());
                        }
                        for (int i5 = 1; i5 <= 3; i5++) {
                            ArrayList mo4233a5 = interfaceC0303as.mo4233a(i5);
                            if (c0339d.f2135aJ == EnumC0341f.build) {
                                if (interfaceC0303as2.mo4222j() || c0339d.f2120aH) {
                                    c0342g = new C0227v(interfaceC0303as2, c0339d.f2119aG, null);
                                    c0342g.f1461h = C0338c.m4129a(c0339d);
                                } else {
                                    c0342g = new C0217l(interfaceC0303as2, null);
                                    c0342g.f1461h = C0338c.m4129a(c0339d);
                                }
                            } else if (c0339d.f2135aJ == EnumC0341f.convert) {
                                c0342g = new C0342g(c0339d, C0453l.m3554a(interfaceC0303as2));
                            } else {
                                throw new C0412bm("Could not find actionType:" + c0339d.f2135aJ);
                            }
                            if (c0339d.f2123o != -999.0f) {
                                c0342g.f1460g = c0339d.f2123o;
                            }
                            boolean z4 = false;
                            Iterator it6 = mo4233a5.iterator();
                            while (it6.hasNext()) {
                                if (c0342g.equals((AbstractC0224s) it6.next())) {
                                    z4 = true;
                                }
                            }
                            if (!z4) {
                                mo4233a5.add(c0342g);
                            }
                            m4060a(mo4233a5);
                        }
                    }
                }
            }
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l5 = (C0453l) interfaceC0303as;
                c0453l5.f3233fs = false;
                for (int i6 = 1; i6 <= 3; i6++) {
                    Iterator it7 = interfaceC0303as.mo4233a(i6).iterator();
                    while (it7.hasNext()) {
                        AbstractC0224s abstractC0224s = (AbstractC0224s) it7.next();
                        if (!(abstractC0224s instanceof C0342g) && abstractC0224s.mo5754i() != null) {
                            c0453l5.f3233fs = true;
                        }
                    }
                }
                Iterator it8 = c0453l5.f2918p.iterator();
                while (it8.hasNext()) {
                    ((C0463u) it8.next()).mo3465b();
                }
            }
            boolean z5 = m1079A.m1066N() && m1079A.f6122bX.f5603aO.f5664k;
            for (int i7 = 1; i7 <= 3; i7++) {
                Iterator it9 = interfaceC0303as.mo4233a(i7).iterator();
                while (it9.hasNext()) {
                    AbstractC0224s abstractC0224s2 = (AbstractC0224s) it9.next();
                    if (abstractC0224s2.f1461h instanceof C0337b) {
                        LoggerMaybe.m1038a("=== ChainedActionConfig already on: " + interfaceC0303as.mo4223i() + " action:" + abstractC0224s2.mo3037b());
                        abstractC0224s2.f1461h = ((C0337b) abstractC0224s2.f1461h).f2033b;
                    }
                    if (z5) {
                        C0424b mo4121B = abstractC0224s2.mo4121B();
                        C0424b mo4098o_ = abstractC0224s2.mo4098o_();
                        if (!mo4121B.m3882b() && mo4098o_ == null) {
                            C0337b c0337b = new C0337b(abstractC0224s2.f1461h);
                            abstractC0224s2.f1461h = c0337b;
                            c0337b.f2034c = C0424b.f2710a;
                            c0337b.f2035d = mo4121B;
                        }
                    }
                }
            }
        } catch (C0412bm e) {
            m4068a(interfaceC0303as.mo4223i(), e, interfaceC0303as);
        } catch (RuntimeException e2) {
            m4068a(interfaceC0303as.mo4223i(), e2, interfaceC0303as);
        }
    }

    /* renamed from: g */
    public static void m4043g() {
        synchronized (f2205o) {
            m4035o();
        }
    }

    /* renamed from: o */
    private static void m4035o() {
        C0458p c0458p;
        C0453l.f2909g.clear();
        C0453l.f2908f.clear();
        Iterator it = C0453l.f2906d.iterator();
        while (it.hasNext()) {
            C0453l c0453l = (C0453l) it.next();
            Iterator it2 = c0453l.f3270gd.iterator();
            while (it2.hasNext()) {
                ((C0458p) it2.next()).f3333e = false;
            }
            c0453l.f3250fJ.clear();
        }
        Iterator it3 = C0453l.f2906d.iterator();
        while (it3.hasNext()) {
            C0453l c0453l2 = (C0453l) it3.next();
            try {
                if (c0453l2.f2944P != null) {
                    for (String str : c0453l2.f2944P.split(",")) {
                        String trim = str.trim();
                        InterfaceC0303as m3534a = C0453l.m3534a(trim, false);
                        if (m3534a == null) {
                            throw new C0412bm("Could not find overrideAndReplace target:" + trim);
                            break;
                        }
                        if (m3534a instanceof C0453l) {
                            LoggerMaybe.LogDebug2("Replacing:" + m3534a.mo4223i() + " with " + c0453l2.mo4223i());
                        }
                        C0453l.f2908f.put(m3534a, c0453l2);
                    }
                }
            } catch (C0412bm e) {
                m4068a(c0453l2.mo4223i(), e, c0453l2);
            }
        }
        for (AbstractC0249ar abstractC0249ar : AbstractC0249ar.values()) {
            m4087a(abstractC0249ar);
        }
        Iterator it4 = C0453l.f2906d.iterator();
        while (it4.hasNext()) {
            m4087a((InterfaceC0303as) ((C0453l) it4.next()));
        }
        Iterator it5 = C0453l.f2906d.iterator();
        while (it5.hasNext()) {
            C0453l c0453l3 = (C0453l) it5.next();
            Iterator it6 = c0453l3.f3270gd.iterator();
            while (it6.hasNext()) {
                if (!((C0458p) it6.next()).f3333e) {
                    String str2 = c0458p.f3332d + " failed to find target:" + c0458p.f3329a;
                    c0453l3.m3491q(str2);
                    if (c0453l3.f2945Q >= 1) {
                        LoggerMaybe.LogDebug2("Converting warning to error (meta.strictLevel=" + c0453l3.f2945Q + ")");
                        c0453l3.m3493p(str2);
                    }
                }
            }
            if (c0453l3.f3279gm != null && c0453l3.f3279gm.size() > 0) {
                Iterator it7 = c0453l3.f3279gm.iterator();
                while (it7.hasNext()) {
                    try {
                        ((C0462t) it7.next()).m3469b(c0453l3);
                    } catch (C0412bm e2) {
                        m4068a(c0453l3.mo4223i(), e2, c0453l3);
                    }
                }
            }
        }
        Iterator it8 = C0453l.f2906d.iterator();
        while (it8.hasNext()) {
            ((C0453l) it8.next()).m3490r();
        }
        Collections.sort(C0453l.f2909g, new C0459q());
    }

    /* renamed from: a */
    public static C0453l m4071a(String str, C0824b c0824b, String str2, String str3) {
        try {
            long m2390a = C0727bl.m2390a();
            C1098j m4054b = m4054b(str);
            if (m4054b == null) {
                throw new RuntimeException("Failed to open unit config file:" + str);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m4054b);
            m4088a(m2390a, EnumC0349ag.iniOpen);
            f2192b++;
            if (c0824b != null) {
                f2193c++;
            }
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            String str4 = "core units";
            if (c0824b != null) {
                str4 = c0824b.m1649a();
            }
            m1079A.m963h("Loading units - " + f2192b + " (" + str4 + ")");
            C0453l m4069a = m4069a(str, bufferedInputStream, m4054b.m546c(), c0824b, m4054b, str2, str3);
            long m2390a2 = C0727bl.m2390a();
            try {
                bufferedInputStream.close();
                m4054b.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            m4088a(m2390a2, EnumC0349ag.iniClose);
            return m4069a;
        } catch (RuntimeException e2) {
            m4067a(str, e2, c0824b);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139, types: [byte[]] */
    /* renamed from: h */
    public static void m4042h() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ArrayList m1653k = m1079A.f6124bZ.m1653k();
        f2200j = 0;
        f2199i = 0;
        f2202l = 0;
        f2201k = false;
        long m2390a = C0727bl.m2390a();
        for (C0934e c0934e : f2197g.values()) {
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
        for (AbstractC0635i abstractC0635i : f2198h.values()) {
            abstractC0635i.f4069g = false;
        }
        byte[] bArr = null;
        byte[][] bArr2 = null;
        ByteBuffer[] byteBufferArr = null;
        try {
            bArr = new byte[8000000];
            bArr[0] = m1079A.f6286dY;
            m1079A.f6287dZ = bArr[1];
            bArr2 = new byte[]{new byte[3000000], new byte[3000000]};
            bArr2[0][0] = m1079A.f6286dY;
            bArr2[1][0] = m1079A.f6286dY;
            if (!LoggerMaybe.m1004as()) {
                byteBufferArr = new ByteBuffer[]{ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000)};
            }
        } catch (OutOfMemoryError e) {
            System.gc();
            LoggerMaybe.LogDebug2("Failed to reserve memory pre-mod load");
        }
        synchronized (C0453l.f2905c) {
            C0453l.f2905c.clear();
        }
        C0453l.f2906d.clear();
        C0453l.f2907e = null;
        C0453l.f2908f.clear();
        m1079A.f6124bZ.m1650n();
        f2192b = 0;
        f2193c = 0;
        synchronized (f2204n) {
            f2204n.clear();
        }
        m4072a(C0750a.m2215o("units"), 1, false, (C0824b) null, C0750a.m2215o("units"), (String) null);
        if (!LoggerMaybe.f6092aJ && !m1079A.f6228ar) {
            String m4037m = m4037m();
            if (!C0750a.m2224f(m4037m)) {
                LoggerMaybe.LogDebug2("Modded Custom '" + m4037m + "' directory not found");
            }
            Iterator it = m1653k.iterator();
            while (it.hasNext()) {
                C0824b c0824b = (C0824b) it.next();
                if (!c0824b.f5441y && c0824b.f5433q != null) {
                    String m1634j = c0824b.m1634j();
                    if (c0824b.f5429m) {
                        m1634j = C0750a.m2215o(m1634j);
                    }
                    LoggerMaybe.LogDebug2("Loading mod at:" + m1634j);
                    m4072a(m1634j, 2, true, c0824b, m1634j, (String) null);
                }
            }
            Iterator it2 = m1653k.iterator();
            while (it2.hasNext()) {
                C0824b c0824b2 = (C0824b) it2.next();
                if (c0824b2.f5441y && c0824b2.f5433q != null) {
                    String m1635i = c0824b2.m1635i();
                    LoggerMaybe.LogDebug2("Loading workshop mod at:" + m1635i);
                    m4072a(m1635i, 2, true, c0824b2, m1635i, (String) null);
                }
            }
        }
        m4090a();
        m4051b(true);
        LoggerMaybe.LogDebug2("Done loading custom units. image cacheHits:" + f2200j + " image cacheMisses:" + f2199i + " (in: " + C0727bl.m2388a(m2390a) + "ms)");
        LoggerMaybe.LogDebug2("========= Mods data loaded ===========");
        LoggerMaybe.LogDebug2("Number of mods:" + m1653k.size());
        Iterator it3 = m1653k.iterator();
        while (it3.hasNext()) {
            ((C0824b) it3.next()).m1624t();
        }
        LoggerMaybe.LogDebug2("================================");
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
            bArr[1] = m1079A.f6286dY;
            m1079A.f6287dZ = bArr[1];
            System.gc();
            System.gc();
        }
    }

    /* renamed from: a */
    public static void m4072a(String str, int i, boolean z, C0824b c0824b, String str2, String str3) {
        boolean z2 = z && i == 1;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (c0824b != null) {
            if (c0824b.f5422f && !m1079A.f6115bQ.loadDisabledModData) {
                c0824b.f5445C = true;
                LoggerMaybe.LogDebug2("unitDataSkipped for: " + str);
                return;
            }
            c0824b.f5445C = false;
        }
        C0750a.m2232c();
        String[] m2223g = C0750a.m2223g(str);
        if (m2223g == null) {
            String m2232c = C0750a.m2232c();
            LoggerMaybe.m990b("readAllCustomUnitConfigs: ERROR");
            LoggerMaybe.m990b("readAllCustomUnitConfigs: Failed to load:" + str);
            if (c0824b != null) {
                if (!c0824b.f5446D) {
                    if (m2232c == null) {
                        c0824b.f5460R = "Failed to list directory, check file permissions";
                        return;
                    } else {
                        c0824b.f5460R = "Failed to list directory: " + m2232c;
                        return;
                    }
                }
                c0824b.f5461S = "Failed to list subdirectory: '" + str + "' check file permissions";
                if (m2232c != null) {
                    c0824b.f5461S += ": " + m2232c;
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
            for (String str4 : m2223g) {
                if (str4.equalsIgnoreCase("all-units.template")) {
                    str3 = str;
                }
            }
        }
        for (String str5 : m2223g) {
            if (!str5.equals("custom_units_here.txt") && !str5.equals("mods_here_will_be_enabled_by_default.txt") && !str5.equals("__MACOSX")) {
                boolean z3 = false;
                C0824b c0824b2 = c0824b;
                if (z && i == 1 && c0824b2 == null) {
                    c0824b2 = m1079A.f6124bZ.m1663d(str5);
                    if (c0824b2 == null) {
                        LoggerMaybe.m990b("readAllCustomUnitConfigs: Could not find linked mod:" + str5);
                        c0824b2 = m1079A.f6124bZ.f5413c;
                    }
                    z3 = true;
                }
                if (str5.toLowerCase(Locale.ENGLISH).endsWith(".ini") && !z2) {
                    String str6 = str + "/" + str5;
                    if (f2208r != c0824b2 && c0824b2 != null) {
                        f2208r = c0824b2;
                        m4090a();
                        LoggerMaybe.LogDebug2("Loading units from mod: " + c0824b2.f5419c);
                    }
                    if (str5.equalsIgnoreCase("desktop.ini")) {
                        LoggerMaybe.LogDebug2("Skipping possible system file: " + str6);
                    } else {
                        long m2390a = C0727bl.m2390a();
                        m4071a(str6, c0824b2, str2, str3);
                        m4088a(m2390a, EnumC0349ag.unitParse);
                    }
                } else if (str5.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                    String str7 = str + "/" + str5;
                    LoggerMaybe.LogDebug2("Found map: " + str7);
                    if (c0824b2 != null && c0824b2.f5444B) {
                        m1079A.f6124bZ.m1675a(str7, c0824b2);
                    } else {
                        LoggerMaybe.LogDebug2("Skipping map due to mod settings");
                    }
                } else {
                    String str8 = str + "/" + str5;
                    if (i < 10) {
                        if (C0750a.m2224f(str8)) {
                            String str9 = str2;
                            if (str9 == null) {
                                str9 = str8;
                            }
                            long j = -1;
                            if (z3) {
                                j = C0727bl.m2390a();
                                LoggerMaybe.LogDebug2("============");
                                LoggerMaybe.LogDebug2(">>> Mod '" + c0824b2.m1642c() + "'" + (c0824b2.m1631m() ? VariableScope.nullOrMissingString : " (disabled)"));
                            }
                            m4072a(str8, i + 1, z, c0824b2, str9, str3);
                            if (z3 && c0824b2 != null && c0824b2.m1631m()) {
                                LoggerMaybe.LogDebug2("Mod '" + c0824b2.m1642c() + "' load took:" + C0727bl.m2389a(C0727bl.m2388a(j)));
                            }
                        }
                    } else {
                        LoggerMaybe.LogDebug2("Too many levels:" + str8);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C0453l m4069a(String str, InputStream inputStream, long j, C0824b c0824b, C1098j c1098j, String str2, String str3) {
        boolean z;
        C0359aq c0359aq;
        String substring;
        boolean z2;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        try {
            if (f2191a) {
                String str4 = "CORE";
                if (c0824b != null) {
                    str4 = c0824b.m1634j();
                }
                LoggerMaybe.LogDebug2("Loading unit config: " + str + " [" + str4 + "]");
            }
            m1079A.f6113bO.mo150e();
            long m2390a = C0727bl.m2390a();
            try {
                C1072ab c1072ab = new C1072ab(inputStream, str);
                m4088a(m2390a, EnumC0349ag.iniParse);
                C0453l c0453l = new C0453l();
                if (c1072ab.m668a("core", "dont_load", (Boolean) false).booleanValue()) {
                    return null;
                }
                c0453l.f2931C = str;
                c0453l.f2932D = c1098j.m545d();
                c0453l.f2933E = c0453l.f2931C;
                c0453l.f2937I = c0824b;
                c0453l.f2938J = str2;
                c0453l.f2939K = str3;
                f2195e = c0824b;
                f2196f = false;
                if (c0453l.f2937I != null) {
                }
                long m2390a2 = C0727bl.m2390a();
                m4084a(c0453l, c1072ab, c1072ab, str, 0);
                if (c0453l.f2939K != null) {
                    m4080a(c0453l, c1072ab, c0453l.f2939K + "/all-units.template", "AUTO units.template", true);
                }
                c1072ab.m675a("core", "copyFrom");
                c0453l.f2945Q = c1072ab.m650b("core", "strictLevel", (Integer) 0).intValue();
                if (c0453l.f2945Q < 0) {
                    throw new C0412bm("[core]strictLevel cannot be < 0");
                }
                if (c0453l.f2945Q > 1) {
                    throw new C0412bm("[core]strictLevel cannot yet be > 1");
                }
                c0453l.f3282gp = c1072ab.m668a("core", "logIfCreditResourceUsed", (Boolean) false).booleanValue();
                c1072ab.m675a("core", "dont_load");
                c1072ab.m649b("core", "class", "CustomUnitMetadata");
                Iterator it = c1072ab.m646c("@copyFrom_skipThisSection").iterator();
                while (it.hasNext()) {
                    c1072ab.m675a((String) it.next(), "@copyFrom_skipThisSection");
                }
                Iterator it2 = c1072ab.m646c("@copyFromSection").iterator();
                while (it2.hasNext()) {
                    String str5 = (String) it2.next();
                    m4083a(c0453l, c1072ab, str5, str5, 0);
                }
                C0442a.m3754a(c0453l, c1072ab);
                String m649b = c1072ab.m649b("core", "overrideResourceLoadPath", (String) null);
                if (m649b != null) {
                    c0453l.f2933E = m4079a(c0453l, str, m649b);
                }
                m4088a(m2390a2, EnumC0349ag.iniSetup);
                c0453l.f2940L = c1072ab.m636e("core", "name");
                c0453l.f2935G = c1072ab.m648c();
                if (c0453l.f2940L.equals("self")) {
                    throw new C0412bm("Unit name: " + c0453l.f2940L + " is reserved");
                }
                if (c0453l.f2940L.startsWith("self.")) {
                    throw new C0412bm("Unit name cannot start with self.");
                }
                String m649b2 = c1072ab.m649b("core", "altNames", (String) null);
                if (m649b2 != null && !m649b2.equalsIgnoreCase("NONE")) {
                    for (String str6 : m649b2.split(",")) {
                        c0453l.f2941M.add(str6.trim());
                    }
                }
                c0453l.f2942N = C0448g.m3733a(c1072ab.m649b("core", "tags", (String) null));
                if (c0453l.f2945Q >= 1 && c0453l.f2942N != null) {
                    for (C0448g c0448g : c0453l.f2942N.f2838a) {
                        if (c0448g.f2834a.contains(" ")) {
                            throw new C0412bm("(strictLevel 1) [core]tags: space in tag: '" + c0448g.f2834a + "'");
                        }
                    }
                }
                c0453l.f2944P = c1072ab.m649b("core", "overrideAndReplace", (String) null);
                if (c0453l.f2944P != null && c0453l.f2944P.equalsIgnoreCase("NONE")) {
                    c0453l.f2944P = null;
                }
                String m649b3 = c1072ab.m649b("core", "defineUnitMemory", (String) null);
                if (m649b3 != null) {
                    c0453l.f2919q.addDefineValue(c0453l, "core", "defineUnitMemory", m649b3);
                }
                Iterator it3 = c1072ab.m622k("core", "@memory ").iterator();
                while (it3.hasNext()) {
                    String str7 = (String) it3.next();
                    String trim = str7.substring("@memory ".length()).trim();
                    String m649b4 = c1072ab.m649b("core", str7, (String) null);
                    if (m649b4 != null) {
                        if (!m649b4.contains(",")) {
                            c0453l.f2919q.addSingleDefine(c0453l, trim, m649b4, "core", str7);
                        } else {
                            throw new C0412bm("[core]" + str7 + ": Only a single variable can be defined per @memory");
                        }
                    }
                }
                c0453l.f2947S = (EnumC0345ac) c1072ab.m667a("core", "onNewMapSpawn", (Enum) null, EnumC0345ac.class);
                c0453l.f2986aF = c1072ab.m666a("core", "globalScale", Float.valueOf(1.0f)).floatValue();
                c0453l.m3495o(c0453l.f2932D);
                if (c0453l.f2940L.equals("missing")) {
                    if (c0824b == null) {
                        LoggerMaybe.LogDebug2("Setting missingPlaceHolder");
                        C0453l.f2904b = c0453l;
                    } else {
                        LoggerMaybe.LogDebug2("Not setting missingPlaceHolder, as we are in a mod");
                    }
                }
                c0453l.f2984aD = c1072ab.m649b("core", "displayLocaleKey", (String) null);
                c0453l.f2982aB = m4075a(c1072ab, "core", "displayText", (String) null);
                c0453l.f2983aC = m4075a(c1072ab, "core", "displayDescription", (String) null);
                c0453l.f3190eB = c1072ab.m668a("core", "isBio", (Boolean) false).booleanValue();
                c0453l.f3191eC = c1072ab.m668a("core", "isBug", (Boolean) false).booleanValue();
                c0453l.f3194eF = c1072ab.m668a("core", "isPickableStartingUnit", (Boolean) false).booleanValue();
                c0453l.f3195eG = c1072ab.m668a("core", "startFallingWhenStartingUnit", (Boolean) false).booleanValue();
                c0453l.f3081cw = c1072ab.m668a("core", "stayNeutral", (Boolean) false).booleanValue();
                c0453l.f3082cx = c1072ab.m668a("core", "createNeutral", (Boolean) false).booleanValue();
                c0453l.f3083cy = c1072ab.m668a("core", "allowCaptureWhenNeutralByAI", (Boolean) false).booleanValue();
                if (c1072ab.m668a("core", "createOnNeutralTeam", (Boolean) false).booleanValue()) {
                    c0453l.f3082cx = true;
                }
                c0453l.f3084cz = c1072ab.m668a("core", "whileNeutralTransportAnyTeam", (Boolean) false).booleanValue();
                c0453l.f3085cA = c1072ab.m668a("core", "whileNeutralConvertToTransportedTeam", (Boolean) false).booleanValue();
                c0453l.f3086cB = c1072ab.m668a("core", "convertToNeutralIfNotTransporting", (Boolean) false).booleanValue();
                if (c0453l.f3086cB) {
                    c0453l.f3081cw = true;
                }
                c0453l.f3087cC = c1072ab.m668a("core", "createOnAggressiveTeam", (Boolean) false).booleanValue();
                c0453l.f2985aE = c1072ab.m668a("core", "showInEditor", (Boolean) true).booleanValue();
                c0453l.f2948T = c1072ab.m650b("graphics", "total_frames", (Integer) 1).intValue();
                if (c0453l.f2948T < 1) {
                    throw new C0412bm("TOTAL_FRAMES cannot be: " + c0453l.f2948T + " (must be 1 or more)");
                }
                c0453l.f2950V = c1072ab.m650b("graphics", "frame_width", (Integer) (-1)).intValue();
                c0453l.f2951W = c1072ab.m650b("graphics", "frame_height", (Integer) (-1)).intValue();
                c0453l.f2952X = c1072ab.m650b("graphics", "default_frame", (Integer) 0).intValue();
                c0453l.f2961ag = c1072ab.m650b("graphics", "image_offsetX", (Integer) 0).intValue();
                c0453l.f2962ah = c1072ab.m650b("graphics", "image_offsetY", (Integer) 0).intValue();
                c0453l.f2963ai = c1072ab.m666a("graphics", "image_offsetH", Float.valueOf(0.0f)).floatValue();
                if (c0453l.f2961ag != 0 || c0453l.f2962ah != 0 || c0453l.f2963ai != 0.0f) {
                    c0453l.f2964aj = true;
                }
                c0453l.f2956ab = EnumC0198o.f1379a;
                if (c1072ab.m668a("graphics", "teamColorsUseHue", (Boolean) false).booleanValue()) {
                    c0453l.f2956ab = EnumC0198o.f1380b;
                }
                String m649b5 = c1072ab.m649b("graphics", "teamColoringMode", (String) null);
                if (m649b5 != null) {
                    if (c1072ab.m668a("graphics", "teamColorsUseHue", (Boolean) null) != null) {
                        throw new C0412bm("Cannot use teamColoringMode and teamColorsUseHue at the same time");
                    }
                    if (m649b5.equalsIgnoreCase("pureGreen")) {
                        c0453l.f2956ab = EnumC0198o.f1379a;
                    } else if (m649b5.equalsIgnoreCase("hueAdd")) {
                        c0453l.f2956ab = EnumC0198o.f1380b;
                    } else if (m649b5.equalsIgnoreCase("hueShift")) {
                        c0453l.f2956ab = EnumC0198o.f1382d;
                    } else if (m649b5.equalsIgnoreCase("disabled")) {
                        c0453l.f2956ab = EnumC0198o.f1383e;
                    } else {
                        throw new C0412bm("Unknown teamColoringMode:" + m649b5);
                    }
                }
                c0453l.f2955aa = c1072ab.m668a("graphics", "imageSmoothing", (Boolean) false).booleanValue();
                c0453l.f2954Z = c1072ab.m668a("graphics", "imageSmoothingWhenZoomedIn", (Boolean) false).booleanValue();
                c0453l.f2953Y = c1072ab.m687a(c0453l, "graphics", "isVisible", (LogicBoolean) null);
                if (c0453l.f2953Y == LogicBoolean.trueBoolean) {
                    c0453l.f2953Y = null;
                }
                c0453l.f3094cJ.f2250m = c1072ab.m668a("graphics", "isVisibleToEnemies", (Boolean) true).booleanValue();
                c0453l.f2957ac = c0453l.m3535a(c0453l.f2933E, c1072ab.m636e("graphics", "image"), c0453l.f2955aa, "graphics", "image");
                if (c0453l.f2957ac == null) {
                    throw new C0412bm("Main unit image must be set on custom unit");
                }
                c0453l.f2958ad = c1072ab.m668a("graphics", "image_floatingPointSize", (Boolean) false).booleanValue();
                c0453l.f2959ae = c0453l.f2957ac.mo390m() / c0453l.f2948T;
                c0453l.f2960af = c0453l.f2957ac.mo391l();
                if (c0453l.f2959ae < 1) {
                    c0453l.f2959ae = 1;
                }
                if (c0453l.f2950V > 0) {
                    c0453l.f2959ae = c0453l.f2950V;
                }
                if (c0453l.f2951W > 0) {
                    c0453l.f2960af = c0453l.f2951W;
                    if (c0453l.f2960af < c0453l.f2957ac.mo391l()) {
                        c0453l.f2949U = c0453l.f2957ac.mo390m() / c0453l.f2959ae;
                        if (c0453l.f2949U < 1) {
                            c0453l.f2949U = 1;
                        }
                    }
                }
                c0453l.f2965ak = c0453l.m3542a(c1072ab, "graphics", "image_back");
                c0453l.f2966al = c1072ab.m668a("graphics", "image_back_always_use_full_image", (Boolean) false).booleanValue();
                c0453l.f2967am = c0453l.m3542a(c1072ab, "graphics", "image_wreak");
                c0453l.f2968an = c0453l.m3542a(c1072ab, "graphics", "image_turret");
                c0453l.f2972ar = AbstractC0529j.f3650dL;
                String m649b6 = c1072ab.m649b("graphics", "image_shadow", "NONE");
                if (m649b6.equalsIgnoreCase("AUTO")) {
                    String str8 = "[autoShadow:" + c0453l.f2959ae + "," + c0453l.f2960af + "]" + c0453l.f2957ac.f6392d + "-" + c0453l.f2957ac.f6393e;
                    C0934e m4049c = m4049c(str8);
                    if (m4049c != null) {
                        c0453l.f2969ao = m4049c;
                    } else {
                        c0453l.f2969ao = AbstractC0244am.m4499a(c0453l.f2957ac, c0453l.f2959ae, c0453l.f2960af);
                        m4076a(c0453l.f2969ao);
                        if (c0453l.f2969ao != null) {
                            m4070a(str8, c0453l.f2969ao);
                        }
                    }
                } else if (m649b6.equalsIgnoreCase("AUTO_ANIMATED")) {
                    String str9 = "[autoShadowAnimated:" + c0453l.f2959ae + "," + c0453l.f2960af + "]" + c0453l.f2957ac.f6392d + "-" + c0453l.f2957ac.f6393e;
                    C0934e m4049c2 = m4049c(str9);
                    if (m4049c2 != null) {
                        c0453l.f2969ao = m4049c2;
                    } else {
                        c0453l.f2969ao = AbstractC0244am.m4499a(c0453l.f2957ac, c0453l.f2957ac.mo390m(), c0453l.f2957ac.mo391l());
                        m4076a(c0453l.f2969ao);
                        if (c0453l.f2969ao != null) {
                            m4070a(str9, c0453l.f2969ao);
                        }
                    }
                    c0453l.f2970ap = true;
                } else {
                    c0453l.f2969ao = c0453l.m3535a(c0453l.f2933E, m649b6, c0453l.f2955aa, "graphics", "image_shadow");
                }
                if (c1072ab.m668a("graphics", "image_shadow_frames", (Boolean) false).booleanValue()) {
                    c0453l.f2970ap = true;
                }
                c0453l.f2971aq = c0453l.m3543a(c0453l.f2957ac, c0453l.f2956ab);
                c0453l.f2920r = c1072ab.m668a("graphics", "teamColorsOnTurret", (Boolean) false).booleanValue();
                if (c0453l.f2920r && c0453l.f2968an != null) {
                    c0453l.f2973as = c0453l.m3543a(c0453l.f2968an, c0453l.f2956ab);
                }
                float floatValue = c1072ab.m666a("graphics", "scaleImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue > 0.0f) {
                    c0453l.f3040bH = (floatValue * c0453l.f2986aF) / c0453l.f2959ae;
                }
                float floatValue2 = c1072ab.m666a("graphics", "imageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue2 != 1.0f) {
                    c0453l.f3040bH *= floatValue2;
                }
                float floatValue3 = c1072ab.m666a("graphics", "scaleTurretImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue3 > 0.0f) {
                    float f = floatValue3 * c0453l.f2986aF;
                    if (c0453l.f2968an == null) {
                        throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
                    }
                    c0453l.f3041bI = f / c0453l.f2968an.f6402p;
                }
                float floatValue4 = c1072ab.m666a("graphics", "turretImageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue4 != 1.0f) {
                    c0453l.f3041bI *= floatValue4;
                }
                c0453l.f2974at = C0520c.f3599e;
                C0934e m3542a = c0453l.m3542a(c1072ab, "graphics", "image_shield");
                if (m3542a != null) {
                    c0453l.f2974at = m3542a;
                    c0453l.f2975au = true;
                }
                c0453l.f2976av = c0453l.m3541a(c1072ab, "graphics", "icon_build", false);
                float mo390m = c0453l.f2957ac.mo390m() * c0453l.f3040bH;
                float mo391l = c0453l.f2957ac.mo391l() * c0453l.f3040bH;
                if (mo390m / 2.0f > 90.0f || mo391l / 2.0f > 90.0f) {
                    c0453l.f2930B = new Rect();
                    c0453l.f2930B.f230a = (int) ((-mo390m) / 2.0f);
                    c0453l.f2930B.f232c = (int) (mo390m / 2.0f);
                    c0453l.f2930B.f231b = (int) ((-mo391l) / 2.0f);
                    c0453l.f2930B.f233d = (int) (mo391l / 2.0f);
                    c0453l.f2929A = true;
                }
                Iterator it4 = c1072ab.m620m("resource_", "global_resource_").iterator();
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
                    c0437d.m3805a(c0453l, c1072ab, str10, trim2);
                    if (c0453l.m3503k(c0437d.f2772a) != null) {
                        throw new RuntimeException("[" + str10 + "] resource with name:" + c0437d.f2772a + " already exists in this file");
                    }
                    c0453l.f2912j.add(c0437d);
                }
                Iterator it5 = c0453l.f2912j.iterator();
                while (it5.hasNext()) {
                    ((C0437d) it5.next()).m3806a(c0453l);
                }
                if (m1079A.m950o()) {
                    C0397k.m3975a(c0453l, c1072ab);
                    C0395i.m3979a(c0453l, c1072ab);
                }
                C0398l.m3964a(c0453l, c1072ab);
                c0453l.f3059ca = c1072ab.m651b("core", "autoTriggerCooldownTime", Float.valueOf(60.0f)).floatValue();
                if (c0453l.f3059ca < 0.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be < 0");
                }
                if (c0453l.f3059ca > 120.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be more than 2 seconds");
                }
                if (!c1072ab.m668a("core", "autoTriggerCooldownTime_allowDangerousHighCPU", (Boolean) false).booleanValue() && c0453l.f3059ca < 5.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be this low (without override). Note this cooldown is only applied after triggering an action not for the detection.");
                }
                c0453l.f3060cb = (EnumC0461s) c1072ab.m667a("core", "autoTriggerCheckRate", EnumC0461s.everyFrame, EnumC0461s.class);
                c0453l.f3094cJ.f2239b = c1072ab.m630g("core", "mass");
                c0453l.f3061cc = c1072ab.m668a("core", "availableInDemo", (Boolean) true).booleanValue();
                c0453l.f3062cd = c1072ab.m668a("core", "isLocked", (Boolean) false).booleanValue();
                c0453l.f3063ce = c1072ab.m668a("core", "isLockedIfGameModeNoNuke", (Boolean) false).booleanValue();
                c0453l.f3064cf = C0424b.m3890a(c0453l, c1072ab, "core", "price", false);
                c0453l.f3065cg = C0424b.m3891a(c0453l, c1072ab, "core", "reclaimPrice", (C0424b) null);
                c0453l.f3066ch = C0424b.m3876b(c0453l, c1072ab, "core", "streamingCost", null);
                boolean booleanValue = c1072ab.m668a("core", "switchPriceWithStreamingCost", (Boolean) false).booleanValue();
                if (booleanValue) {
                    if (c0453l.f3066ch != null) {
                        throw new RuntimeException("[core]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                    }
                    c0453l.f3066ch = C0424b.m3876b(c0453l, c1072ab, "core", "price", null);
                    c0453l.f3064cf = C0424b.f2710a;
                }
                c0453l.f3067ci = c1072ab.m639d("core", "buildSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3068cj = c1072ab.m650b("core", "techLevel", (Integer) 1).intValue();
                if (c0453l.f3068cj > 3) {
                    throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
                }
                if (c0453l.f3068cj < 1) {
                    throw new RuntimeException("techLevel cannot be less than 1, it is:" + c0453l.f3068cj);
                }
                c0453l.f3069ck = c1072ab.m668a("core", "experimental", (Boolean) false).booleanValue();
                c0453l.f3078ct = C0424b.m3890a(c0453l, c1072ab, "core", "borrowResourcesWhileAlive", true);
                c0453l.f3079cu = C0424b.m3890a(c0453l, c1072ab, "core", "borrowResourcesWhileBuilt", true);
                c0453l.f3071cm = C0424b.m3890a(c0453l, c1072ab, "core", "generation_resources", true);
                int intValue = c1072ab.m650b("core", "generation_credits", (Integer) 0).intValue();
                if (intValue != 0) {
                    c0453l.f3071cm = C0424b.m3892a(c0453l.f3071cm, C0424b.m3901a(intValue));
                }
                c0453l.f3074cp = c1072ab.m650b("core", "generation_delay", (Integer) 40).intValue();
                if (c0453l.f3074cp == 0) {
                    c0453l.f3074cp = 1;
                }
                if (c0453l.f3074cp < 0) {
                    throw new RuntimeException("[core]generation_delay cannot be < 0");
                }
                c0453l.f3075cq = 40.0f / c0453l.f3074cp;
                if (!c0453l.f3071cm.m3882b()) {
                    c0453l.f3072cn = new C0439f();
                    c0453l.f3072cn.m3800a(c0453l.f3071cm);
                    c0453l.f3072cn.m3803a(c0453l.f3075cq);
                    c0453l.f3070cl = true;
                }
                if (!c0453l.f3072cn.m3775c()) {
                    Iterator it6 = c0453l.f3072cn.f2802b.iterator();
                    while (it6.hasNext()) {
                        C0438e c0438e = (C0438e) it6.next();
                        if (!c0438e.f2799a.m3827b() && c0438e.f2799a.m3824c()) {
                            if (c0453l.f3073co == C0439f.f2801a) {
                                c0453l.f3073co = new C0439f();
                            }
                            c0453l.f3073co.m3782b(c0438e.f2799a, c0438e.f2800b);
                        }
                    }
                }
                c0453l.f3080cv = c1072ab.m687a(c0453l, "core", "generation_active", LogicBoolean.trueBoolean);
                c0453l.m3551a(c0453l.f3071cm);
                c0453l.f3088cD = c1072ab.m666a("core", "resourceRate", Float.valueOf(0.0f)).floatValue();
                if (booleanValue && c0453l.f3088cD != 0.0f) {
                    throw new RuntimeException("To avoid mistakes [core]resourceRate cannot be used with switchPriceWithStreamingCost=true");
                }
                String m649b7 = c1072ab.m649b("core", "updateUnitMemory", (String) null);
                if (m649b7 != null) {
                    c0453l.f3076cr = VariableScope.createMemoryWriter(m649b7, c0453l, "core", "updateUnitMemory");
                }
                c0453l.f3077cs = c1072ab.m651b("core", "updateUnitMemoryRate", Float.valueOf(60.0f)).floatValue();
                c0453l.f3089cE = c1072ab.m650b("core", "resourceMaxConcurrentReclaimingThis", (Integer) Integer.MAX_VALUE).intValue();
                c0453l.f3090cF = c1072ab.m688a(c0453l, "core", "similarResourcesHaveTag", (C0449h) null);
                c0453l.f3123dm = C0409bj.m3935a(c0453l, c1072ab.m649b("core", "soundOnAttackOrder", (String) null));
                c0453l.f3124dn = C0409bj.m3935a(c0453l, c1072ab.m649b("core", "soundOnMoveOrder", (String) null));
                c0453l.f3125do = C0409bj.m3935a(c0453l, c1072ab.m649b("core", "soundOnNewSelection", (String) null));
                String m649b8 = c1072ab.m649b("graphics", "drawLayer", (String) null);
                if (m649b8 != null) {
                    if (m649b8.equals("experimentals")) {
                        c0453l.f3091cG = 4;
                    } else if (m649b8.equals("underwater")) {
                        c0453l.f3091cG = 1;
                    } else if (m649b8.equals("bottom")) {
                        c0453l.f3091cG = 1;
                    } else if (m649b8.equals("ground")) {
                        c0453l.f3091cG = 2;
                    } else if (m649b8.equals("ground2")) {
                        c0453l.f3091cG = 3;
                    } else if (m649b8.equals("air")) {
                        c0453l.f3091cG = 5;
                    } else if (m649b8.equals("top")) {
                        c0453l.f3091cG = 10;
                    } else if (m649b8.equals("wreaks")) {
                        c0453l.f3091cG = 0;
                    } else {
                        throw new RuntimeException("unknown drawLayer:" + m649b8);
                    }
                }
                c0453l.f3092cH = c1072ab.m666a("graphics", "shadowOffsetX", Float.valueOf(0.0f)).floatValue();
                c0453l.f3093cI = c1072ab.m666a("graphics", "shadowOffsetY", Float.valueOf(0.0f)).floatValue();
                c0453l.f3136dz = c1072ab.m668a("graphics", "rotate_with_direction", (Boolean) true).booleanValue();
                c0453l.f3137dA = c1072ab.m668a("graphics", "lock_body_rotation_with_main_turret", (Boolean) false).booleanValue();
                c0453l.f3138dB = c1072ab.m668a("graphics", "lock_shadow_rotation_with_main_turret", Boolean.valueOf(c0453l.f3137dA)).booleanValue();
                c0453l.f3139dC = c1072ab.m668a("graphics", "lock_leg_rotation_with_main_turret", (Boolean) false).booleanValue();
                c0453l.f3141dE = c1072ab.m666a("graphics", "whenBeingBuiltMakeTransparentTill", Float.valueOf(1.0f)).floatValue();
                c0453l.f3142dF = C0455m.m3478a(c0453l, c1072ab, "graphics", "animation_", false);
                Iterator it7 = c1072ab.m637e("effect_").iterator();
                while (it7.hasNext()) {
                    String str11 = (String) it7.next();
                    C0382aw c0382aw = new C0382aw(str11.substring("effect_".length()));
                    c0382aw.m4000a(c0453l, c1072ab, str11);
                    c0453l.f3267ga.add(c0382aw);
                }
                Iterator it8 = c0453l.f3267ga.iterator();
                while (it8.hasNext()) {
                    C0382aw c0382aw2 = (C0382aw) it8.next();
                    if (c0382aw2.alsoEmitEffects != null) {
                        c0382aw2.alsoEmitEffects.m3459c();
                    }
                    if (c0382aw2.alsoEmitEffectsOnDeath != null) {
                        c0382aw2.alsoEmitEffectsOnDeath.m3459c();
                    }
                    if (c0382aw2.ifSpawnFailsEmitEffects != null) {
                        c0382aw2.ifSpawnFailsEmitEffects.m3459c();
                    }
                    if (c0382aw2.trailEffect != null) {
                        c0382aw2.trailEffect.m3459c();
                    }
                }
                c0453l.f3042bJ = c1072ab.m668a("graphics", "splastEffect", (Boolean) false).booleanValue();
                c0453l.f3045bM = c1072ab.m668a("graphics", "dustEffect", (Boolean) false).booleanValue();
                c0453l.f3043bK = c1072ab.m668a("graphics", "splastEffectReverse", (Boolean) true).booleanValue();
                c0453l.f3046bN = c1072ab.m668a("graphics", "dustEffectReverse", (Boolean) true).booleanValue();
                c0453l.f3044bL = c0453l.f3045bM || c0453l.f3042bJ;
                String m649b9 = c1072ab.m649b("graphics", "movementEffect", (String) null);
                if (m649b9 != null) {
                    c0453l.f3047bO = c0453l.m3537a(m649b9, (C0467y) null);
                    if (c0453l.f3047bO != null && c0453l.f3047bO.m3463a()) {
                        c0453l.f3044bL = true;
                    }
                }
                String m649b10 = c1072ab.m649b("graphics", "movementEffectReverse", (String) null);
                if (m649b10 != null) {
                    c0453l.f3048bP = c0453l.m3537a(m649b10, (C0467y) null);
                    if (c0453l.f3048bP != null && c0453l.f3048bP.m3463a()) {
                        c0453l.f3044bL = true;
                    }
                }
                c0453l.f3050bR = c1072ab.m666a("graphics", "movementEffectRate", Float.valueOf(11.0f)).floatValue();
                c0453l.f3049bQ = c1072ab.m668a("graphics", "movementEffectReverseFlipEffects", (Boolean) false).booleanValue();
                c0453l.f3052bT = c1072ab.m666a("graphics", "repairEffectRate", Float.valueOf(5.0f)).floatValue();
                String m649b11 = c1072ab.m649b("graphics", "repairEffect", (String) null);
                if (m649b11 != null) {
                    c0453l.f3053bU = c0453l.m3537a(m649b11, (C0467y) null);
                    if (c0453l.f3053bU != null && c0453l.f3053bU.m3460b()) {
                        c0453l.f3051bS = true;
                    }
                }
                String m649b12 = c1072ab.m649b("graphics", "repairEffectAtTarget", (String) null);
                if (m649b12 != null) {
                    c0453l.f3054bV = c0453l.m3537a(m649b12, (C0467y) null);
                    if (c0453l.f3054bV != null && c0453l.f3054bV.m3460b()) {
                        c0453l.f3051bS = true;
                    }
                }
                c0453l.f3056bX = c1072ab.m666a("graphics", "reclaimEffectRate", Float.valueOf(5.0f)).floatValue();
                String m649b13 = c1072ab.m649b("graphics", "reclaimEffect", (String) null);
                if (m649b13 != null) {
                    c0453l.f3057bY = c0453l.m3537a(m649b13, (C0467y) null);
                    if (c0453l.f3057bY != null && c0453l.f3057bY.m3460b()) {
                        c0453l.f3055bW = true;
                    }
                }
                String m649b14 = c1072ab.m649b("graphics", "reclaimEffectAtTarget", (String) null);
                if (m649b14 != null) {
                    c0453l.f3058bZ = c0453l.m3537a(m649b14, (C0467y) null);
                    if (c0453l.f3058bZ != null && c0453l.f3058bZ.m3460b()) {
                        c0453l.f3055bW = true;
                    }
                }
                c0453l.f3127dq.m3758a(c0453l, c1072ab, "graphics", "animation_" + c0453l.f3127dq.f2805a + "_");
                c0453l.f3128dr.m3758a(c0453l, c1072ab, "graphics", "animation_" + c0453l.f3128dr.f2805a + "_");
                c0453l.f3129ds.m3758a(c0453l, c1072ab, "graphics", "animation_" + c0453l.f3129ds.f2805a + "_");
                Iterator it9 = c1072ab.m637e("animation_").iterator();
                while (it9.hasNext()) {
                    String str12 = (String) it9.next();
                    C0441f c0441f = new C0441f(str12.substring("animation_".length()));
                    c0441f.m3758a(c0453l, c1072ab, str12, VariableScope.nullOrMissingString);
                    c0453l.f3126dp.add(c0441f);
                }
                c0453l.f3127dq = c0453l.m3546a(EnumC0456n.move, c0453l.f3127dq, true);
                c0453l.f3128dr = c0453l.m3546a(EnumC0456n.idle, c0453l.f3128dr, true);
                c0453l.f3129ds = c0453l.m3546a(EnumC0456n.attack, c0453l.f3129ds, true);
                c0453l.f3131du = c0453l.m3547a(EnumC0456n.underConstruction);
                c0453l.f3132dv = c0453l.m3547a(EnumC0456n.underConstructionWithLinkedBuiltTime);
                if (c0453l.f3131du != null && c0453l.f3132dv != null) {
                    throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
                }
                c0453l.f3130dt = c0453l.m3547a(EnumC0456n.created);
                c0453l.f3133dw = c0453l.m3547a(EnumC0456n.queuedUnits);
                if (c0453l.f3133dw != null) {
                    c0453l.f3013bg = true;
                }
                c0453l.f3134dx = c0453l.m3547a(EnumC0456n.repair);
                c0453l.f3135dy = c0453l.m3547a(EnumC0456n.reclaim);
                c0453l.f3094cJ.f2240c = c1072ab.m630g("core", "maxHp");
                c0453l.f3094cJ.f2244g = c1072ab.m650b("core", "maxShield", (Integer) 0).intValue();
                c0453l.f3095cK = c1072ab.m668a("core", "startShieldAtZero", (Boolean) false).booleanValue();
                c0453l.f3094cJ.f2245h = c1072ab.m666a("core", "shieldRegen", Float.valueOf(0.25f)).floatValue();
                c0453l.f3103cS = c1072ab.m668a("core", "shieldDisplayOnlyDeflection", (Boolean) false).booleanValue();
                c0453l.f3104cT = c1072ab.m666a("core", "shieldDeflectionDisplayRate", Float.valueOf(4.0f)).floatValue();
                c0453l.f3094cJ.f2249l = c1072ab.m666a("core", "armour", Float.valueOf(0.0f)).floatValue();
                c0453l.f3096cL = c1072ab.m666a("core", "armourMinDamageToKeep", Float.valueOf(1.0f)).floatValue();
                c0453l.f3094cJ.f2241d = c1072ab.m666a("core", "energyMax", Float.valueOf(0.0f)).floatValue();
                c0453l.f3097cM = c1072ab.m668a("core", "startEnergyAtZero", (Boolean) false).booleanValue();
                c0453l.f3098cN = c1072ab.m666a("core", "energyRegen", Float.valueOf(0.0f)).floatValue();
                c0453l.f3101cQ = c1072ab.m666a("core", "energyStartingPercentage", Float.valueOf(1.0f)).floatValue();
                c0453l.f3100cP = c1072ab.m668a("core", "energyNeedsToRechargeToFull", (Boolean) false).booleanValue();
                c0453l.f3099cO = c1072ab.m666a("core", "energyRegenWhenRecharging", Float.valueOf(c0453l.f3098cN)).floatValue();
                c0453l.f3102cR = m4075a(c1072ab, "core", "energyDisplayName", (String) null);
                c0453l.f3105cU = c1072ab.m630g("core", "radius");
                c0453l.f3112db = c1072ab.m650b("core", "displayRadius", Integer.valueOf(c0453l.f3105cU)).intValue();
                float f2 = c0453l.f3105cU;
                if (f2 < 6.0f) {
                    f2 = 6.0f;
                }
                c0453l.f3113dc = c1072ab.m666a("core", "uiTargetRadius", Float.valueOf(f2)).floatValue();
                c0453l.f3114dd = c1072ab.m650b("core", "shieldRenderRadius", Integer.valueOf(c0453l.f3105cU)).intValue();
                c0453l.f3115de = c1072ab.m650b("core", "buildingSelectionOffset", (Integer) 0).intValue();
                c0453l.f3106cV = c1072ab.m671a("core", "footprint", c0453l.f3106cV);
                c0453l.f3107cW = c1072ab.m671a("core", "constructionFootprint", c0453l.f3107cW);
                c0453l.f3108cX.m5466a(c0453l.f3106cV);
                c0453l.f3108cX = c1072ab.m671a("core", "displayFootprint", c0453l.f3108cX);
                c0453l.f3109cY = c1072ab.m666a("core", "buildingToFootprintOffsetX", Float.valueOf(10.0f)).floatValue();
                c0453l.f3110cZ = c1072ab.m666a("core", "buildingToFootprintOffsetY", Float.valueOf(10.0f)).floatValue();
                c0453l.f3105cU = (int) (c0453l.f3105cU * c0453l.f2986aF);
                c0453l.f3112db = (int) (c0453l.f3112db * c0453l.f2986aF);
                c0453l.f3094cJ.f2251n = c1072ab.m650b("core", "fogOfWarSightRange", (Integer) 15).intValue();
                c0453l.f3116df = c1072ab.m650b("core", "fogOfWarSightRangeWhileNotBuilt", (Integer) (-1)).intValue();
                c0453l.f3117dg = c1072ab.m666a("core", "exit_x", Float.valueOf(0.0f)).floatValue();
                c0453l.f3118dh = c1072ab.m666a("core", "exit_y", Float.valueOf(9.0f)).floatValue();
                c0453l.f3119di = c1072ab.m666a("core", "exit_dirOffset", (Float) null);
                c0453l.f3120dj = c1072ab.m666a("core", "exit_heightOffset", Float.valueOf(0.0f)).floatValue();
                c0453l.f3121dk = c1072ab.m668a("core", "exitHeightIgnoreParent", (Boolean) false).booleanValue();
                c0453l.f3122dl = c1072ab.m666a("core", "exit_moveAwayAmount", Float.valueOf(70.0f));
                c0453l.f3188ez = c1072ab.m650b("core", "softCollisionOnAll", (Integer) 0).intValue();
                c0453l.f3189eA = c1072ab.m668a("core", "disableAllUnitCollisions", (Boolean) false).booleanValue();
                if (c0453l.f3189eA) {
                    c0453l.f3106cV.m5467a(0, 0, -1, -1);
                }
                c0453l.f3196eH = c1072ab.m668a("core", "hideScorchMark", (Boolean) false).booleanValue();
                c0453l.f3197eI = c1072ab.m668a("graphics", "disableLowHpFire", Boolean.valueOf(c0453l.f3190eB)).booleanValue();
                c0453l.f3198eJ = c1072ab.m668a("graphics", "disableLowHpSmoke", Boolean.valueOf(c0453l.f3190eB)).booleanValue();
                c0453l.f2987aG = c1072ab.m668a("core", "isBuilding", (Boolean) false).booleanValue();
                c0453l.f2988aH = c1072ab.m668a("core", "ignoreInUnitCapCalculation", Boolean.valueOf(c0453l.f2987aG)).booleanValue();
                c0453l.f2989aI = c1072ab.m668a("core", "placeOnlyOnResPool", (Boolean) false).booleanValue();
                c0453l.f2990aJ = c1072ab.m668a("core", "isUnrepairableUnit", (Boolean) false).booleanValue();
                c0453l.f2991aK = c1072ab.m666a("core", "extraBuildRangeWhenBuildingThis", Float.valueOf(0.0f)).floatValue();
                c0453l.f2992aL = c1072ab.m668a("core", "isUnselectable", (Boolean) false).booleanValue();
                c0453l.f2993aM = c1072ab.m668a("core", "isUnselectableAsTarget", Boolean.valueOf(c0453l.f2992aL)).booleanValue();
                c0453l.f3253fM = c1072ab.m688a(c0453l, "core", "showActionsWithMixedSelectionIfOtherUnitsHaveTag", (C0449h) null);
                c0453l.f2994aN = c1072ab.m668a("core", "canNotBeDirectlyAttacked", (Boolean) false).booleanValue();
                c0453l.f2995aO = c1072ab.m668a("core", "canNotBeDamaged", Boolean.valueOf(c0453l.f2994aN)).booleanValue();
                c0453l.f2996aP = c1072ab.m668a("core", "showOnMinimap", (Boolean) true).booleanValue();
                c0453l.f2997aQ = c1072ab.m668a("core", "showOnMinimapToEnemies", Boolean.valueOf(c0453l.f3094cJ.f2250m)).booleanValue();
                c0453l.f2998aR = c1072ab.m688a(c0453l, "core", "canOnlyBeAttackedByUnitsWithTags", (C0449h) null);
                if (c0453l.f2994aN && c0453l.f2998aR != null) {
                    throw new RuntimeException("canNotBeDirectlyAttacked and canOnlyBeAttackedByUnitsWithTags cannot be used at the same time");
                }
                c0453l.f2999aS = c1072ab.m668a("core", "canNotBeGivenOrdersByPlayer", (Boolean) false).booleanValue();
                c0453l.f3000aT = c1072ab.m668a("core", "canRepairBuildings", (Boolean) false).booleanValue();
                c0453l.f3001aU = c1072ab.m668a("core", "canRepairUnits", (Boolean) false).booleanValue();
                c0453l.f3002aV = c1072ab.m668a("core", "autoRepair", (Boolean) false).booleanValue();
                if (c0453l.f3002aV) {
                    c0453l.m3552a(C0388b.f2327a);
                }
                c0453l.f3094cJ.f2252o = c1072ab.m650b("core", "nanoRange", (Integer) (-1)).intValue();
                if (c0453l.f3094cJ.f2252o != -1) {
                    c0453l.f3094cJ.f2252o = (int) (c0359aq.f2252o * c0453l.f2986aF);
                }
                c0453l.f3004aX = c1072ab.m668a("core", "nanoRangeForRepairIsMelee", (Boolean) false).booleanValue();
                if (c0453l.f3004aX) {
                    c0453l.f3003aW = 5;
                }
                int intValue2 = c1072ab.m650b("core", "nanoRangeForRepair", (Integer) (-1)).intValue();
                if (intValue2 != -1) {
                    c0453l.f3003aW = intValue2;
                    c0453l.f3003aW = (int) (c0453l.f3003aW * c0453l.f2986aF);
                }
                c0453l.f3006aZ = c1072ab.m668a("core", "nanoRangeForReclaimIsMelee", (Boolean) false).booleanValue();
                if (c0453l.f3006aZ) {
                    c0453l.f3005aY = 5;
                }
                int intValue3 = c1072ab.m650b("core", "nanoRangeForReclaim", (Integer) (-1)).intValue();
                if (intValue3 != -1) {
                    c0453l.f3005aY = intValue3;
                    c0453l.f3005aY = (int) (c0453l.f3005aY * c0453l.f2986aF);
                }
                c0453l.f3007ba = c1072ab.m666a("core", "nanoRepairSpeed", Float.valueOf(0.2f)).floatValue();
                c0453l.f3008bb = c1072ab.m666a("core", "nanoReclaimSpeed", Float.valueOf(c0453l.f3007ba * 5.1f)).floatValue();
                c0453l.f3009bc = c1072ab.m666a("core", "resourceReclaimMultiplier", Float.valueOf(1.0f)).floatValue();
                c0453l.f3010bd = c1072ab.m666a("core", "nanoUnbuildSpeed", Float.valueOf(1.0f)).floatValue() * 0.001f * 5.1f;
                c0453l.f3011be = c1072ab.m666a("core", "nanoBuildSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3012bf = c1072ab.m666a("core", "nanoFactorySpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3094cJ.f2253p = c1072ab.m666a("core", "selfRegenRate", Float.valueOf(0.0f)).floatValue();
                c0453l.f3014bh = c1072ab.m639d("core", "selfBuildRate", Float.valueOf(0.0f)).floatValue();
                c0453l.f3015bi = c1072ab.m668a("core", "dieOnConstruct", (Boolean) false).booleanValue();
                c0453l.f3017bk = c1072ab.m668a("core", "dieOnZeroEnergy", (Boolean) false).booleanValue();
                int i = 4;
                if (c0453l.f3094cJ.f2239b > 30000.0f) {
                    i = 8;
                }
                if (c0453l.f2987aG) {
                    i = 7;
                }
                c0453l.f3023bq = c1072ab.m650b("core", "numBitsOnDeath", Integer.valueOf(i)).intValue();
                c0453l.f3020bn = c1072ab.m668a("core", "nukeOnDeath", (Boolean) false).booleanValue();
                c0453l.f3021bo = c1072ab.m666a("core", "nukeOnDeathRange", Float.valueOf(250.0f)).floatValue();
                c0453l.f3022bp = c1072ab.m666a("core", "nukeOnDeathDamage", Float.valueOf(5400.0f)).floatValue();
                c0453l.f3024br = c1072ab.m668a("core", "nukeOnDeathDisableWhenNoNuke", (Boolean) false).booleanValue();
                c0453l.f3019bm = c1072ab.m650b("core", "fireOnDeath", (Integer) 0).intValue();
                c0453l.f3026bt = (EnumC0233ab) c1072ab.m667a("core", "explodeTypeOnDeath", (Enum) null, EnumC0233ab.class);
                c0453l.f3027bu = c1072ab.m668a("core", "explodeOnDeath", (Boolean) true).booleanValue();
                c0453l.f3025bs = c1072ab.m668a("core", "disableDeathOnZeroHp", (Boolean) false).booleanValue();
                c0453l.f3028bv = c1072ab.m668a("core", "explodeOnDeathGroundCollision", Boolean.valueOf(c1072ab.m668a("core", "explodeOnDeathGroundCollosion", (Boolean) true).booleanValue())).booleanValue();
                c0453l.f3031by = c0453l.m3537a(c1072ab.m649b("core", "effectOnDeath", (String) null), (C0467y) null);
                c0453l.f3030bx = c0453l.m3537a(c1072ab.m649b("core", "effectOnDeathIfUnbuilt", (String) null), (C0467y) null);
                c0453l.f3032bz = C0409bj.m3935a(c0453l, c1072ab.m649b("core", "soundOnDeath", (String) null));
                c0453l.f3029bw = c0453l.m3537a(c1072ab.m649b("core", "effectOnDeathGroundCollision", c1072ab.m649b("core", "effectOnDeathGroundCollosion", (String) null)), (C0467y) null);
                c0453l.f3035bC = C0413bn.m3927a(c0453l, c1072ab, "core", "unitsSpawnedOnDeath");
                c0453l.f3036bD = c1072ab.m668a("core", "unitsSpawnedOnDeath_setToTeamOfLastAttacker", (Boolean) false).booleanValue();
                c0453l.f3223fi = c1072ab.m668a("core", "canReclaimResources", (Boolean) false).booleanValue();
                c0453l.f3224fj = c1072ab.m688a(c0453l, "core", "canReclaimResourcesOnlyWithTags", (C0449h) null);
                c0453l.f3225fk = c1072ab.m650b("core", "canReclaimResourcesNextSearchRange", (Integer) 500).intValue();
                c0453l.f3226fl = c1072ab.m688a(c0453l, "core", "canReclaimUnitsOnlyWithTags", (C0449h) null);
                c0453l.f3227fm = c1072ab.m688a(c0453l, "core", "canRepairUnitsOnlyWithTags", (C0449h) null);
                if (c0453l.f3226fl != null && !c0453l.f3001aU && !c0453l.f3000aT) {
                    throw new RuntimeException("canReclaimUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                if (c0453l.f3227fm != null && !c0453l.f3001aU && !c0453l.f3000aT) {
                    throw new RuntimeException("canRepairUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                c0453l.f3199eK = c1072ab.m650b("core", "maxTransportingUnits", (Integer) 0).intValue();
                if (c0453l.f3199eK < 0) {
                    throw new RuntimeException("maxTransportingUnits cannot be < 0");
                }
                c0453l.f3200eL = c1072ab.m651b("core", "transportUnitsUnloadDelayBetweenEachUnit", Float.valueOf(30.0f)).floatValue();
                c0453l.f3202eN = C0448g.m3733a(c1072ab.m649b("core", "transportUnitsRequireTag", (String) null));
                String m649b15 = c1072ab.m649b("core", "transportUnitsRequireMovementType", (String) null);
                if (m649b15 != null) {
                    for (String str13 : m649b15.split(",")) {
                        c0453l.f3203eO.add(EnumC0246ao.m4389a(str13.trim(), "transportUnitsRequireMovementType"));
                    }
                }
                c0453l.f3201eM = c1072ab.m668a("core", "transportUnitsEachUnitAlwaysUsesSingleSlot", (Boolean) false).booleanValue();
                c0453l.f3204eP = c1072ab.m668a("core", "transportUnitsBlockAirAndWaterUnits", Boolean.valueOf(c0453l.f3203eO.size() == 0)).booleanValue();
                c0453l.f3205eQ = c1072ab.m668a("core", "transportUnitsBlockOtherTransports", (Boolean) true).booleanValue();
                c0453l.f3207eS = c1072ab.m687a(c0453l, "core", "transportUnitsKeepBuiltUnits", LogicBoolean.falseBoolean);
                c0453l.f3208eT = c1072ab.m687a(c0453l, "core", "transportUnitsKillOnDeath", LogicBoolean.trueBoolean);
                c0453l.f3209eU = c1072ab.m687a(c0453l, "core", "transportUnitsKeepWaypoints", LogicBoolean.falseBoolean);
                c0453l.f3211eW = c1072ab.m666a("core", "transportUnitsHealBy", Float.valueOf(0.0f)).floatValue();
                c0453l.f3215fa = c1072ab.m687a(c0453l, "core", "transportUnitsCanUnloadUnits", (LogicBoolean) null);
                if (c0453l.f3215fa != null) {
                    c0453l.f3216fb = c0453l.f3215fa;
                } else {
                    c0453l.f3215fa = C0453l.f3213eY;
                    c0453l.f3216fb = C0453l.f3214eZ;
                }
                c0453l.f3206eR = c1072ab.m668a("core", "transportUnitsAddUnloadOption", Boolean.valueOf(c0453l.f3215fa != LogicBoolean.falseBoolean)).booleanValue();
                c0453l.f3210eV = c1072ab.m668a("core", "transportUnitsOnTeamChangeKeepCurrentTeam", Boolean.valueOf(c0453l.f3210eV)).booleanValue();
                c0453l.f3212eX = c1072ab.m650b("core", "transportSlotsNeeded", (Integer) 1).intValue();
                for (int i2 = -1; i2 <= 29; i2++) {
                    String str14 = "builtFrom_" + i2 + "_";
                    if (i2 == -1) {
                        str14 = "builtFrom_";
                    }
                    String str15 = str14 + "name";
                    String m649b16 = c1072ab.m649b("core", str15, (String) null);
                    if (m649b16 != null) {
                        for (String str16 : m649b16.split(",")) {
                            String trim3 = str16.trim();
                            if (!trim3.equals(VariableScope.nullOrMissingString)) {
                                C0458p c0458p = new C0458p();
                                c0458p.f3329a = trim3;
                                c0458p.f3330b = c1072ab.m666a("core", str14 + "pos", Float.valueOf(999.0f)).floatValue();
                                c0458p.f3331c = c1072ab.m668a("core", str14 + "forceNano", (Boolean) false).booleanValue();
                                c0458p.f3332d = "[core]" + str15;
                                c0458p.f3334f = c1072ab.m687a(c0453l, "core", str14 + "isLocked", (LogicBoolean) null);
                                c0458p.f3335g = m4075a(c1072ab, "core", str14 + "isLockedMessage", (String) null);
                                if (c0458p.f3334f == LogicBoolean.falseBoolean) {
                                    c0458p.f3334f = null;
                                }
                                if (!"NONE".equalsIgnoreCase(trim3)) {
                                    c0453l.f3270gd.add(c0458p);
                                }
                            }
                        }
                    }
                }
                for (int i3 = 0; i3 <= 50; i3++) {
                    if (c1072ab.m649b("core", "canBuild_" + i3 + "_name", (String) null) != null) {
                        m4055b(c0453l, c1072ab, "core", "canBuild_" + i3 + "_", false);
                    }
                }
                Iterator it10 = c1072ab.m637e("canBuild_").iterator();
                while (it10.hasNext()) {
                    m4055b(c0453l, c1072ab, (String) it10.next(), VariableScope.nullOrMissingString, true);
                }
                c0453l.f3218fd = C0402bc.m3957a(c0453l, c1072ab);
                c0453l.f3219fe = EnumC0246ao.m4389a(c1072ab.m636e("movement", "movementType"), "movementType");
                if (!c0453l.f2987aG) {
                    c0453l.f3220ff = c0453l.f3219fe;
                } else {
                    c0453l.f3220ff = EnumC0246ao.f1703a;
                }
                Boolean m668a = c1072ab.m668a("ai", "useAsBuilder", (Boolean) null);
                c0453l.f3231fq = c1072ab.m668a("ai", "useAsAttacker", (Boolean) true).booleanValue();
                Boolean m668a2 = c1072ab.m668a("core", "isBuilder", (Boolean) null);
                if (m668a2 == null) {
                    m668a2 = m668a == null ? false : m668a;
                } else if (m668a == null) {
                    m668a = m668a2;
                }
                if (m668a == null) {
                    m668a = false;
                }
                c0453l.f3228fn = m668a2.booleanValue();
                c0453l.f3229fo = m668a.booleanValue();
                if (!c0453l.f3228fn && c0453l.f3229fo) {
                    throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + c0453l.f3229fo + " [core]isBuilder:" + c0453l.f3228fn);
                }
                if (c0453l.f3223fi) {
                    c0453l.f3230fp = true;
                }
                Boolean m668a3 = c1072ab.m668a("ai", "useAsHarvester", (Boolean) null);
                if (m668a3 != null) {
                    c0453l.f3230fp = m668a3.booleanValue();
                }
                Boolean m668a4 = c1072ab.m668a("ai", "useAsTransport", (Boolean) null);
                if (m668a4 == null) {
                    m668a4 = Boolean.valueOf((c0453l.f3199eK <= 0 || c0453l.f3229fo || c0453l.f2987aG) ? false : true);
                    if (!c0453l.f3206eR) {
                        m668a4 = false;
                    }
                }
                c0453l.f3232fr = m668a4.booleanValue();
                if (c0453l.f2987aG) {
                    c0453l.f2972ar = AbstractC0488d.f3429q;
                } else if (c0453l.f3219fe == EnumC0246ao.f1706d) {
                    c0453l.f2972ar = AbstractC0309b.f1847n;
                } else if (c0453l.f3219fe == EnumC0246ao.f1707e) {
                    c0453l.f2972ar = AbstractC0590f.f3849q;
                } else if (c0453l.f3219fe == EnumC0246ao.f1708f) {
                    if (c0453l.f3069ck) {
                        c0453l.f2972ar = AbstractC0529j.f3651dM;
                    } else if (c0453l.mo4220l()) {
                        c0453l.f2972ar = C0519b.f3593h;
                    } else {
                        c0453l.f2972ar = AbstractC0525h.f3635n;
                    }
                } else if (c0453l.f3069ck) {
                    c0453l.f2972ar = AbstractC0529j.f3651dM;
                } else if (c0453l.mo4220l()) {
                    c0453l.f2972ar = C0519b.f3593h;
                } else {
                    c0453l.f2972ar = AbstractC0529j.f3650dL;
                }
                C0934e m3541a = c0453l.m3541a(c1072ab, "graphics", "icon_zoomed_out", false);
                if (m3541a != null) {
                    c0453l.f2972ar = c0453l.m3543a(m3541a, c0453l.f2956ab);
                }
                if (c1072ab.m668a("graphics", "icon_zoomed_out_neverShow", (Boolean) false).booleanValue()) {
                    c0453l.f2972ar = null;
                }
                c0453l.f2921s = c1072ab.m668a("graphics", "showHealthBar", (Boolean) true).booleanValue();
                c0453l.f2922t = c1072ab.m668a("graphics", "showHealthBarChanges", (Boolean) true).booleanValue();
                c0453l.f2923u = c1072ab.m668a("graphics", "showEnergyBar", (Boolean) true).booleanValue();
                c0453l.f2924v = c1072ab.m668a("graphics", "showShotDelayBar", (Boolean) true).booleanValue();
                c0453l.f2925w = c1072ab.m668a("graphics", "showTransportBar", (Boolean) true).booleanValue();
                c0453l.f2926x = c1072ab.m668a("graphics", "showShieldBar", (Boolean) true).booleanValue();
                c0453l.f2927y = c1072ab.m668a("graphics", "showQueueBar", (Boolean) true).booleanValue();
                c0453l.f2928z = c1072ab.m668a("graphics", "showSelectionIndicator", (Boolean) true).booleanValue();
                c0453l.f3221fg = c1072ab.m668a("movement", "slowDeathFall", (Boolean) false).booleanValue();
                c0453l.f3222fh = c1072ab.m668a("movement", "slowDeathFallSmoke", (Boolean) true).booleanValue();
                c0453l.f3094cJ.f2247j = c1072ab.m666a("movement", "moveSpeed", Float.valueOf(1.0f)).floatValue() * c0453l.f2986aF;
                c0453l.f3147dK = c1072ab.m666a("movement", "moveAccelerationSpeed", Float.valueOf(1.0f)).floatValue() * c0453l.f2986aF;
                c0453l.f3148dL = c1072ab.m666a("movement", "moveDecelerationSpeed", Float.valueOf(1.0f)).floatValue() * c0453l.f2986aF;
                Boolean m668a5 = c1072ab.m668a("movement", "ignoreMoveOrders", (Boolean) null);
                if (c0453l.f2987aG) {
                    c0453l.f3149dM = true;
                }
                if (m668a5 != null) {
                    if (m668a5.booleanValue()) {
                        c0453l.f3149dM = true;
                        if (c0453l.f3094cJ.f2247j > 0.0f) {
                            throw new RuntimeException("[movement]ignoreMoveOrders expects moveSpeed=0");
                        }
                    } else if (c0453l.f2987aG) {
                        throw new RuntimeException("[movement]ignoreMoveOrders=false not yet supported on buildings");
                    }
                }
                c0453l.f3170eh = c1072ab.m666a("movement", "moveYAxisScaling", Float.valueOf(1.0f)).floatValue();
                if (c0453l.f3170eh <= 0.0f) {
                    throw new RuntimeException("[movement]moveYAxisScaling must be > 0");
                }
                c0453l.f3171ei = 1.0f / c0453l.f3170eh;
                c0453l.f3172ej = c1072ab.m666a("movement", "reverseSpeedPercentage", Float.valueOf(0.6f)).floatValue();
                String m649b17 = c1072ab.m649b("movement", "landOnGround", "false");
                if (m649b17.equalsIgnoreCase("false")) {
                    c0453l.f3150dN = false;
                } else if (m649b17.equalsIgnoreCase("onlyIdle")) {
                    c0453l.f3150dN = true;
                    c0453l.f3151dO = true;
                } else if (m649b17.equalsIgnoreCase("true")) {
                    c0453l.f3150dN = true;
                } else {
                    throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + m649b17);
                }
                float f3 = 0.0f;
                float f4 = 0.0f;
                if (c0453l.f3219fe == EnumC0246ao.f1706d) {
                    f3 = 35.0f;
                    f4 = 1.5f;
                }
                c0453l.f3152dP = c1072ab.m666a("movement", "startingHeightOffset", Float.valueOf(0.0f)).floatValue();
                c0453l.f3153dQ = c1072ab.m666a("movement", "targetHeight", Float.valueOf(f3)).floatValue();
                c0453l.f3154dR = c1072ab.m666a("movement", "targetHeightDrift", Float.valueOf(f4)).floatValue();
                if (c0453l.f3153dQ > 80.0f) {
                    c0453l.f2929A = true;
                }
                c0453l.f3155dS = c1072ab.m666a("movement", "heightChangeRate", Float.valueOf(c0453l.f3155dS)).floatValue();
                c0453l.f3156dT = c1072ab.m666a("movement", "fallingAcceleration", Float.valueOf(c0453l.f3156dT)).floatValue();
                c0453l.f3157dU = c1072ab.m666a("movement", "fallingAccelerationDead", Float.valueOf(c0453l.f3157dU)).floatValue();
                c0453l.f3094cJ.f2248k = c1072ab.m666a("movement", "maxTurnSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3175em = c1072ab.m666a("movement", "turnAcceleration", Float.valueOf(1.0f)).floatValue();
                c0453l.f3158dV = c1072ab.m668a("movement", "moveSlidingMode", (Boolean) false).booleanValue();
                c0453l.f3159dW = c1072ab.m668a("movement", "moveIgnoringBody", (Boolean) false).booleanValue();
                c0453l.f3160dX = c1072ab.m650b("movement", "moveSlidingDir", (Integer) (-1)).intValue();
                c0453l.f3169eg = c1072ab.m668a("movement", "joinsGroupFormations", (Boolean) true).booleanValue();
                c0453l.f3161dY = c1072ab.m666a("attack", "turretSize", Float.valueOf(1.0f)).floatValue() * c0453l.f2986aF;
                c0453l.f3162dZ = c1072ab.m666a("attack", "turretTurnSpeed", Float.valueOf(8.0f)).floatValue();
                c0453l.f3145dI = c1072ab.m668a("attack", "turretRotateWithBody", (Boolean) true).booleanValue();
                String m649b18 = c1072ab.m649b("attack", "attackMovement", "normal");
                c0453l.f3163ea = EnumC0307b.normal;
                if (m649b18.equalsIgnoreCase("normal")) {
                    c0453l.f3163ea = EnumC0307b.normal;
                }
                if (m649b18.equalsIgnoreCase("strafing")) {
                    c0453l.f3163ea = EnumC0307b.strafing;
                }
                if (m649b18.equalsIgnoreCase("bomber")) {
                    c0453l.f3163ea = EnumC0307b.bomber;
                }
                c0453l.f3166ed = c1072ab.m668a("attack", "disablePassiveTargeting", (Boolean) false).booleanValue();
                c0453l.f3167ee = c1072ab.m668a("attack", "stopTargetingAfterFiring", (Boolean) false).booleanValue();
                c0453l.f3168ef = c1072ab.m668a("attack", "turretMultiTargeting", (Boolean) false).booleanValue();
                c0453l.f3164eb = c1072ab.m666a("attack", "attackMovementSpeed", Float.valueOf(1.0f)).floatValue();
                c0453l.f3165ec = c1072ab.m666a("attack", "attackMovementSpread", Float.valueOf(1.0f)).floatValue();
                Float m666a = c1072ab.m666a("attack", "maxAttackRange", (Float) null);
                if (m666a != null) {
                    z = true;
                    c0453l.f3094cJ.f2246i = m666a.floatValue() * c0453l.f2986aF;
                } else {
                    z = false;
                    c0453l.f3094cJ.f2246i = 100.0f * c0453l.f2986aF;
                }
                c0453l.f3186ex = c1072ab.m666a("attack", "aimOffsetSpread", Float.valueOf(0.6f)).floatValue();
                c0453l.f3146dJ = c1072ab.m651b("attack", "shootDelay", Float.valueOf(50.0f)).floatValue();
                c0453l.f3094cJ.f2242e = c1072ab.m666a("attack", "shootDelayMultiplier", Float.valueOf(1.0f)).floatValue();
                c0453l.f3094cJ.f2243f = c1072ab.m666a("attack", "shootDamageMultiplier", Float.valueOf(1.0f)).floatValue();
                c0453l.f3144dH = c1072ab.m668a("attack", "showRangeUIGuide", (Boolean) null);
                c0453l.f3192eD = c1072ab.m668a("attack", "isMelee", (Boolean) false).booleanValue();
                c0453l.f3193eE = 0.0f;
                Float m666a2 = c1072ab.m666a("attack", "meleeEngangementDistance", (Float) null);
                if (c0453l.f3192eD) {
                    c0453l.f3193eE = 250.0f;
                    if (m666a2 != null) {
                        c0453l.f3193eE = m666a2.floatValue();
                    }
                } else if (m666a2 != null) {
                    throw new RuntimeException("[attack]meleeEngangementDistance can only be used with isMelee:true");
                }
                m4088a(m2390a, EnumC0349ag.unitParsePartA);
                Iterator it11 = c1072ab.m637e("projectile_").iterator();
                while (it11.hasNext()) {
                    String str17 = (String) it11.next();
                    String substring2 = str17.substring("projectile_".length());
                    if (c0453l.m3513f(substring2) != null) {
                        throw new RuntimeException("Two projectiles found with the same name:" + substring2);
                    }
                    C0405bf c0405bf = new C0405bf();
                    c0405bf.f2514bh = substring2;
                    c0405bf.f2516bj = c0453l;
                    C0405bf.m3948a(c0405bf, c0453l, c1072ab, str17);
                }
                int size = c0453l.f3258fR.size();
                if (size < 1) {
                    size = 1;
                }
                c0453l.f3256fP = new C0405bf[size];
                for (int i4 = 0; i4 < c0453l.f3258fR.size(); i4++) {
                    C0405bf c0405bf2 = (C0405bf) c0453l.f3258fR.get(i4);
                    c0405bf2.f2515bi = i4;
                    c0453l.f3256fP[i4] = c0405bf2;
                }
                for (int i5 = 0; i5 < c0453l.f3256fP.length; i5++) {
                    C0405bf c0405bf3 = c0453l.f3256fP[i5];
                    if (c0405bf3 != null) {
                        c0405bf3.f1165w *= c0453l.f2986aF;
                        c0405bf3.f1189au *= c0453l.f2986aF;
                        c0405bf3.f1198aF *= c0453l.f2986aF;
                    }
                }
                if (c0453l.f3256fP[0] == null) {
                    C0405bf c0405bf4 = new C0405bf();
                    c0405bf4.f2515bi = 0;
                    c0405bf4.f2514bh = "1";
                    c0405bf4.f1100b = 10;
                    c0453l.f3258fR.add(c0405bf4);
                    c0453l.f3256fP[0] = c0405bf4;
                }
                ArrayList arrayList = c0453l.f3257fQ;
                Iterator it12 = c1072ab.m637e("turret_").iterator();
                while (it12.hasNext()) {
                    String str18 = (String) it12.next();
                    String substring3 = str18.substring("turret_".length());
                    if (c0453l.m3515e(substring3) != null) {
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
                    C0411bl.m3932a(c0411bl2, c0453l, c1072ab, c0411bl2.f2544b);
                }
                if (arrayList.size() == 0) {
                    C0411bl c0411bl3 = new C0411bl();
                    c0411bl3.f2548f = 0.0f;
                    c0411bl3.f2549g = 0.0f;
                    c0411bl3.f2543a = "1";
                    c0411bl3.f2601m = c0453l.f3146dJ;
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
                c0453l.f3255fO = (C0411bl[]) arrayList.toArray(new C0411bl[0]);
                c0453l.f3143dG = c0453l.f3094cJ.f2246i;
                float f5 = -1.0f;
                boolean z3 = true;
                boolean z4 = false;
                Iterator it14 = arrayList.iterator();
                while (it14.hasNext()) {
                    C0411bl c0411bl5 = (C0411bl) it14.next();
                    c0411bl5.f2575X *= c0453l.f2986aF;
                    c0411bl5.f2548f *= c0453l.f2986aF;
                    c0411bl5.f2549g *= c0453l.f2986aF;
                    c0411bl5.f2576Y *= c0453l.f2986aF;
                    c0411bl5.f2617Z *= c0453l.f2986aF;
                    boolean z5 = false;
                    if (c0411bl5.f2611B) {
                        if (c0411bl5.f2618ab >= 99999.0f) {
                            z3 = false;
                        } else {
                            z4 = true;
                            if (c0453l.f3143dG > c0411bl5.f2618ab) {
                                c0453l.f3143dG = c0411bl5.f2618ab;
                            }
                            if (f5 < c0411bl5.f2618ab) {
                                f5 = c0411bl5.f2618ab;
                            }
                            if (C0758f.m2088c(c0411bl5.f2618ab - c0453l.f3094cJ.f2246i) > 5.0f) {
                                boolean z6 = false;
                                Iterator it15 = c0453l.f2917o.iterator();
                                while (it15.hasNext()) {
                                    if (C0758f.m2088c(c0411bl5.f2618ab - ((C0466x) it15.next()).f3356a) < 5.0f) {
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
                        c0453l.f2917o.add(c0466x);
                    }
                }
                if (z4 && z3) {
                    if (!z) {
                        c0453l.f3094cJ.f2246i = f5;
                    } else if (f5 < c0453l.f3094cJ.f2246i) {
                        throw new RuntimeException("limitingRange as been applied to all turrets but is less than maxAttackRange (hint: unset maxAttackRange or a limitingRange, or make values match)");
                    }
                }
                String m649b19 = c1072ab.m649b("attack", "setMainTurretAs", (String) null);
                if (m649b19 != null) {
                    c0453l.f3140dD = c0453l.m3515e(m649b19);
                    if (c0453l.f3140dD == null) {
                        throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + m649b19);
                    }
                } else {
                    c0453l.f3140dD = c0453l.m3515e("1");
                    if (c0453l.f3140dD == null) {
                        c0453l.f3140dD = c0453l.f3255fO[0];
                    }
                }
                m4088a(m2390a, EnumC0349ag.unitParsePartB);
                long m2390a3 = C0727bl.m2390a();
                if (c1072ab.m621l("core", "action_")) {
                    for (int i6 = 0; i6 <= 50; i6++) {
                        m4081a(c0453l, c1072ab, "core", "action_" + i6 + "_", VariableScope.nullOrMissingString + i6, false, false);
                    }
                }
                Iterator it16 = c1072ab.m637e("action_").iterator();
                while (it16.hasNext()) {
                    String str19 = (String) it16.next();
                    String substring4 = str19.substring("action_".length());
                    if (c0453l.m3511g(substring4) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring4);
                    }
                    m4081a(c0453l, c1072ab, str19, VariableScope.nullOrMissingString, substring4, true, false);
                }
                Iterator it17 = c1072ab.m637e("hiddenAction_").iterator();
                while (it17.hasNext()) {
                    String str20 = (String) it17.next();
                    String substring5 = str20.substring("hiddenAction_".length());
                    if (c0453l.m3511g(substring5) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring5);
                    }
                    m4081a(c0453l, c1072ab, str20, VariableScope.nullOrMissingString, substring5, true, true);
                }
                m4088a(m2390a3, EnumC0349ag.actionParse);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i7 = 0;
                while (i7 <= 1) {
                    boolean z7 = i7 == 0;
                    ArrayList arrayList4 = z7 ? arrayList2 : arrayList3;
                    for (int i8 = 1; i8 < 21; i8++) {
                        String str21 = z7 ? "leg_" + i8 : "arm_" + i8;
                        if (c1072ab.m631g(str21)) {
                            C0384ay c0384ay = new C0384ay();
                            C0384ay.m3998a(c0384ay, c0453l, c1072ab, str21, z7, arrayList4);
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
                c0453l.f2977aw = (C0384ay[]) arrayList5.toArray(new C0384ay[0]);
                if (c0453l.f2977aw.length > 0) {
                    c0453l.m3552a(C0393g.f2410a);
                }
                Iterator it20 = c0453l.f3126dp.iterator();
                while (it20.hasNext()) {
                    ((C0441f) it20.next()).m3759a(c0453l);
                }
                m4056b(c0453l);
                String m649b20 = c1072ab.m649b("core", "fireTurretXAtSelfOnDeath", (String) null);
                if (m649b20 != null && !"NONE".equalsIgnoreCase(m649b20)) {
                    C0411bl m3515e = c0453l.m3515e(m649b20);
                    if (m3515e == null) {
                        throw new RuntimeException("Cannot find turret:" + m649b20 + " for [core]fireTurretXAtSelfOnDeath");
                    }
                    c0453l.f3034bB = m3515e.f2547e;
                }
                C0389c.m3987a(c0453l, c1072ab);
                c0453l.f3016bj = c1072ab.m668a("attack", "dieOnAttack", (Boolean) false).booleanValue();
                c0453l.f3018bl = c1072ab.m668a("attack", "removeOnAttack", (Boolean) false).booleanValue();
                c0453l.f3176en = c1072ab.m640d("attack", "canAttack");
                if (c0453l.f3176en) {
                    c0453l.f3177eo = c1072ab.m690a(c0453l, "attack", "canAttackFlyingUnits");
                    c0453l.f3178ep = c1072ab.m690a(c0453l, "attack", "canAttackLandUnits");
                    c0453l.f3179eq = c1072ab.m690a(c0453l, "attack", "canAttackUnderwaterUnits");
                } else {
                    c0453l.f3177eo = c1072ab.m687a(c0453l, "attack", "canAttackFlyingUnits", LogicBoolean.falseBoolean);
                    c0453l.f3178ep = c1072ab.m687a(c0453l, "attack", "canAttackLandUnits", LogicBoolean.falseBoolean);
                    c0453l.f3179eq = c1072ab.m687a(c0453l, "attack", "canAttackUnderwaterUnits", LogicBoolean.falseBoolean);
                }
                c0453l.f3180er = c1072ab.m687a(c0453l, "attack", "canAttackNotTouchingWaterUnits", (LogicBoolean) null);
                if (LogicBoolean.isStaticTrue(c0453l.f3180er)) {
                    c0453l.f3180er = null;
                }
                c0453l.f3182et = c1072ab.m688a(c0453l, "attack", "canOnlyAttackUnitsWithTags", (C0449h) null);
                c0453l.f3183eu = c1072ab.m688a(c0453l, "attack", "canOnlyAttackUnitsWithoutTags", (C0449h) null);
                if (c0453l.f3182et != null || c0453l.f3183eu != null) {
                    c0453l.f3181es = true;
                }
                boolean z8 = false;
                boolean z9 = false;
                Iterator it21 = arrayList.iterator();
                while (it21.hasNext()) {
                    C0411bl c0411bl6 = (C0411bl) it21.next();
                    if (c0411bl6.f2571O != null && c0411bl6.f2571O.m3727a(c0453l.f3182et)) {
                        c0411bl6.f2571O = null;
                    }
                    if (c0411bl6.f2572P != null && c0411bl6.f2572P.m3727a(c0453l.f3183eu)) {
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
                    c0453l.f3184ev = true;
                    c0453l.f3181es = true;
                }
                c0453l.f3185ew = c1072ab.m668a("attack", "isFixedFiring", (Boolean) false).booleanValue();
                c0453l.f3251fK = c1072ab.m668a("ai", "lowPriorityTargetForOtherUnits", (Boolean) false).booleanValue();
                c0453l.f3252fL = c1072ab.m668a("ai", "notPassivelyTargetedByOtherUnits", (Boolean) false).booleanValue();
                if (c0453l.f3176en && c0453l.f3252fL) {
                    throw new RuntimeException("[ai]notPassivelyTargetedByOtherUnits is cannot currently supported on units that can attack");
                }
                c0453l.f3234ft = c1072ab.m688a(c0453l, "ai", "aiTags", (C0449h) null);
                c0453l.f3235fu = c1072ab.m668a("ai", "disableUse", (Boolean) false).booleanValue();
                c0453l.f3238fx = c1072ab.m666a("ai", "buildPriority", Float.valueOf(0.05f)).floatValue();
                c0453l.f3239fy = c1072ab.m650b("ai", "recommendedInEachBaseNum", (Integer) 0).intValue();
                c0453l.f3240fz = c1072ab.m666a("ai", "recommendedInEachBasePriorityIfUnmet", Float.valueOf(0.5f)).floatValue();
                c0453l.f3237fw = c1072ab.m650b("ai", "maxEachBase", Integer.valueOf(C0758f.m2105b(2, c0453l.f3239fy))).intValue();
                c0453l.f3236fv = c1072ab.m650b("ai", "maxGlobal", (Integer) (-1)).intValue();
                if (c0453l.f3237fw < c0453l.f3239fy) {
                    throw new RuntimeException("[ai]recommendedInEachBaseNum is smaller than maxEachBase");
                }
                if (!c0453l.f2987aG) {
                    if (c1072ab.m619n("ai", "recommendedInEachBaseNum")) {
                        throw new RuntimeException("[ai]recommendedInEachBaseNum currently only applies to buildings");
                    }
                    if (c1072ab.m619n("ai", "recommendedInEachBasePriorityIfUnmet")) {
                        throw new RuntimeException("[ai]recommendedInEachBasePriorityIfUnmet currently only applies to buildings");
                    }
                }
                c0453l.f3243fC = c1072ab.m650b("ai", "whenUsingAsHarvester_recommendedInEachBase", (Integer) (-1)).intValue();
                c0453l.f3244fD = c1072ab.m650b("ai", "whenUsingAsHarvester_recommendedGlobal", (Integer) (-1)).intValue();
                c0453l.f3245fE = c1072ab.m668a("ai", "whenUsingAsHarvester_includeOtherHarvesterCounts", (Boolean) false).booleanValue();
                c0453l.f3246fF = c1072ab.m688a(c0453l, "ai", "onlyUseAsHarvester_ifBaseHasUnitTagged", (C0449h) null);
                c0453l.f3241fA = c1072ab.m666a("ai", "nonInBaseExtraPriority", Float.valueOf(0.04f)).floatValue();
                c0453l.f3241fA = c1072ab.m666a("ai", "noneInBaseExtraPriority", Float.valueOf(c0453l.f3241fA)).floatValue();
                c0453l.f3242fB = c1072ab.m666a("ai", "nonGlobalExtraPriority", Float.valueOf(0.0f)).floatValue();
                c0453l.f3242fB = c1072ab.m666a("ai", "noneGlobalExtraPriority", Float.valueOf(c0453l.f3242fB)).floatValue();
                c0453l.f3247fG = c1072ab.m649b("ai", "upgradedFrom", (String) null);
                Float m666a3 = c1072ab.m666a("ai", "ai_upgradePriority", (Float) null);
                if (m666a3 != null && m666a3.floatValue() != -1.0f) {
                    if (m666a3.floatValue() >= 0.0f && m666a3.floatValue() <= 1.0f) {
                        c0453l.f3249fI = m666a3.floatValue() * 100.0f;
                    } else {
                        throw new RuntimeException("[ai]ai_upgradePriority: " + c0453l.f3249fI + " must be between 0-1 or -1 for default");
                    }
                }
                if (c0453l.f3176en) {
                    for (int i9 = 0; i9 < c0453l.f3255fO.length; i9++) {
                        C0411bl c0411bl7 = c0453l.f3255fO[i9];
                        if (c0411bl7.f2611B && c0411bl7.f2584ao == null && c0453l.f2924v) {
                            if (c0411bl7.f2601m > 140.0f && (c0453l.f3173ek == -1 || c0453l.f3255fO[c0453l.f3173ek].f2601m < c0411bl7.f2601m)) {
                                c0453l.f3173ek = i9;
                            }
                            if (c0411bl7.f2602n > 80.0f) {
                                c0453l.f3174el = i9;
                            }
                        }
                    }
                }
                if (c0453l.f3091cG == -2) {
                    if (c0453l.f3219fe == EnumC0246ao.f1706d) {
                        c0453l.f3091cG = 5;
                    } else if (c0453l.mo4222j()) {
                        if (c0453l.f2965ak != null) {
                            c0453l.f3091cG = 3;
                        } else {
                            c0453l.f3091cG = 2;
                        }
                    } else if (c0453l.f3153dQ < -2.0f) {
                        c0453l.f3091cG = 1;
                    } else if (c0453l.f3199eK > 0) {
                        c0453l.f3091cG = 3;
                    } else {
                        c0453l.f3091cG = 2;
                    }
                }
                if (c0453l.f3261fU.size() > 0) {
                    c0453l.f3262fV = true;
                    C1101m c1101m = new C1101m();
                    C1101m c1101m2 = new C1101m();
                    C1101m c1101m3 = new C1101m();
                    Iterator it22 = c0453l.f3261fU.iterator();
                    while (it22.hasNext()) {
                        C0460r c0460r = (C0460r) it22.next();
                        if (c0460r.f3338c == EnumC0461s.everyFrame) {
                            c1101m.add(c0460r);
                        } else if (c0460r.f3338c == EnumC0461s.every4Frames) {
                            c1101m2.add(c0460r);
                        } else if (c0460r.f3338c == EnumC0461s.every8Frames) {
                            c1101m3.add(c0460r);
                        } else {
                            throw new RuntimeException("Unknown check rate:" + c0460r.f3338c);
                        }
                    }
                    c0453l.f3263fW = (C0460r[]) c1101m.toArray(new C0460r[0]);
                    c0453l.f3264fX = (C0460r[]) c1101m2.toArray(new C0460r[0]);
                    c0453l.f3265fY = (C0460r[]) c1101m3.toArray(new C0460r[0]);
                }
                if (c0453l.f3279gm != null && c0453l.f3279gm.size() > 0) {
                    Iterator it23 = c0453l.f3279gm.iterator();
                    while (it23.hasNext()) {
                        ((C0462t) it23.next()).m3470a(c0453l);
                    }
                }
                m4088a(m2390a, EnumC0349ag.unitParsePartC);
                c1072ab.m655b();
                Iterator it24 = c1072ab.f6831d.iterator();
                while (it24.hasNext()) {
                    C1073ac c1073ac = (C1073ac) it24.next();
                    if (c1073ac.m618a() != null && (c1073ac.m618a().startsWith("hiddenAction_") || c1073ac.m618a().startsWith("canBuild_"))) {
                        throw new RuntimeException("Error [" + c1073ac.m618a() + "]" + c1073ac.m617b() + " has been repeated");
                    }
                    String str22 = "Repeated key " + c1073ac;
                    c0453l.m3489r(str22);
                    if (c0453l.f2945Q >= 1) {
                        LoggerMaybe.LogDebug2("Converting warning to error (meta.strictLevel=" + c0453l.f2945Q + ")");
                        throw new C0412bm(str22);
                    }
                }
                Iterator it25 = c1072ab.f6832e.iterator();
                while (it25.hasNext()) {
                    String str23 = "Skipping line, unexpected format: '" + ((String) it25.next()) + "'";
                    c0453l.m3489r(str23);
                    if (c0453l.f2945Q >= 1) {
                        LoggerMaybe.LogDebug2("Converting warning to error (meta.strictLevel=" + c0453l.f2945Q + ")");
                        throw new C0412bm(str23);
                    }
                }
                if (c0824b != null) {
                    c0824b.f5447E++;
                }
                synchronized (C0453l.f2905c) {
                    C0453l.f2905c.add(c0453l);
                }
                m4088a(m2390a, EnumC0349ag.unitParsePartD);
                return c0453l;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (C0412bm e2) {
            m4067a(str, e2, c0824b);
            return null;
        } catch (OutOfMemoryError e3) {
            f2202l++;
            m4067a(str, new RuntimeException(e3), c0824b);
            return null;
        } catch (RuntimeException e4) {
            m4067a(str, e4, c0824b);
            return null;
        }
    }

    /* renamed from: a */
    public static void m4068a(String str, Exception exc, InterfaceC0303as interfaceC0303as) {
        C0824b c0824b = null;
        if (interfaceC0303as instanceof C0453l) {
            c0824b = ((C0453l) interfaceC0303as).f2937I;
        }
        m4067a(str, exc, c0824b);
    }

    /* renamed from: a */
    public static String m4077a(C0824b c0824b, String str, boolean z) {
        if (c0824b != null) {
            String m2216n = C0750a.m2216n(c0824b.f5433q);
            str = C0750a.m2216n(str);
            if (str.startsWith(m2216n)) {
                str = str.substring(m2216n.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            if (z) {
                str = str + " (in mod " + c0824b.m1649a() + ")";
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m4067a(String str, Exception exc, C0824b c0824b) {
        String m2098b;
        String str2;
        LoggerMaybe.m990b("Error while loading unit:" + str);
        LoggerMaybe.m981c(exc);
        if (str == null) {
            str = "<null>";
        }
        if (exc instanceof C0412bm) {
            m2098b = exc.getMessage();
        } else {
            m2098b = C0758f.m2098b(exc);
        }
        if (m2098b == null) {
            m2098b = "<No error cause>";
        }
        if (!m2098b.contains("unit config file")) {
            m2098b = m2098b.replace(str + ": ", VariableScope.nullOrMissingString).replace(str, VariableScope.nullOrMissingString);
        }
        String m4077a = m4077a(c0824b, str, true);
        if (c0824b != null) {
            str2 = "Error loading unit: " + m4077a + ": \n" + m2098b;
        } else if (m2098b.contains("Error loading core unit")) {
            str2 = m2098b;
        } else {
            str2 = "Error loading core unit: " + m4077a + ": \n" + m2098b + " (This might be from placing a mod in 'assets/', they should go under 'mods/')";
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
            c0824b.m1646a(str2);
        } else {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException e) {
            }
            throw new RuntimeException(str2, exc);
        }
    }

    /* renamed from: b */
    public static void m4055b(C0453l c0453l, C1072ab c1072ab, String str, String str2, boolean z) {
        String m649b = c1072ab.m649b(str, str2 + "name", (String) null);
        if (m649b == null) {
            return;
        }
        for (String str3 : m649b.split(",")) {
            String trim = str3.trim();
            C0339d c0339d = new C0339d();
            c0339d.f2056j = trim;
            c0339d.f2060n = c1072ab.m668a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0339d.f2123o = c1072ab.m666a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0339d.f2119aG = c1072ab.m650b(str, str2 + "tech", (Integer) 1).intValue();
            c0339d.f2120aH = c1072ab.m668a(str, str2 + "forceNano", (Boolean) false).booleanValue();
            c0339d.f2121aI = c1072ab.m649b(str, str2 + "type", (String) null);
            c0339d.f2061p = C0424b.m3891a(c0453l, c1072ab, str, str2 + "price", (C0424b) null);
            c0339d.f2116aC = c1072ab.m687a(c0453l, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0339d.f2066u = c1072ab.m687a(c0453l, str, str2 + "isVisible", (LogicBoolean) null);
            c0339d.f2070y = c1072ab.m687a(c0453l, str, str2 + "isLocked", (LogicBoolean) null);
            c0339d.f2071z = m4082a(c0453l, c1072ab, str, str2 + "isLockedMessage", (String) null);
            if (c0339d.f2070y != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2070y == LogicBoolean.falseBoolean) {
                c0339d.f2070y = null;
            }
            c0339d.f2072A = c1072ab.m687a(c0453l, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0339d.f2073B = m4082a(c0453l, c1072ab, str, str2 + "isLockedAltMessage", (String) null);
            if (c0339d.f2072A != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2072A == LogicBoolean.falseBoolean) {
                c0339d.f2072A = null;
            }
            c0339d.f2074C = c1072ab.m687a(c0453l, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0339d.f2075D = m4082a(c0453l, c1072ab, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0339d.f2074C != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2074C == LogicBoolean.falseBoolean) {
                c0339d.f2074C = null;
            }
            C0424b m3890a = C0424b.m3890a(c0453l, c1072ab, str, str2 + "addResources", true);
            if (m3890a != null && m3890a.m3872c()) {
                c0339d.f2091ad = m3890a;
            }
            c0339d.f2135aJ = EnumC0341f.build;
            if (!"NONE".equalsIgnoreCase(trim)) {
                c0453l.f3271ge.add(c0339d);
            }
        }
    }

    /* renamed from: a */
    public static void m4081a(C0453l c0453l, C1072ab c1072ab, String str, String str2, String str3, boolean z, boolean z2) {
        ArrayList m4064a;
        C0339d c0339d = new C0339d();
        String m649b = c1072ab.m649b(str, str2 + "convertTo", (String) null);
        String m649b2 = c1072ab.m649b(str, str2 + "whenBuilding_temporarilyConvertTo", (String) null);
        AbstractC0377ar[] m4017a = C0359aq.m4017a(c1072ab, str, str2 + "whenBuilding_temporarilyConvertTo_keepFields", (AbstractC0377ar[]) null);
        Float m666a = c1072ab.m666a(str, str2 + "addEnergy", (Float) null);
        C0424b m3890a = C0424b.m3890a(c0453l, c1072ab, str, str2 + "addResources", true);
        c0453l.m3551a(m3890a);
        C0424b m3890a2 = C0424b.m3890a(c0453l, c1072ab, str, str2 + "addResourcesScaledByAIHandicaps", true);
        c0453l.m3551a(m3890a2);
        String m649b3 = c1072ab.m649b(str, str2 + "fireTurretXAtGround", (String) null);
        LogicBoolean m654b = c1072ab.m654b(c0453l, str, str2 + "alsoTriggerOrQueueActionWithTarget", null);
        LogicBoolean m687a = c1072ab.m687a(c0453l, str, str2 + "alsoTriggerOrQueueActionConditional", (LogicBoolean) null);
        String m649b4 = c1072ab.m649b(str, str2 + "alsoTriggerAction", (String) null);
        String m649b5 = c1072ab.m649b(str, str2 + "alsoQueueAction", (String) null);
        String m649b6 = c1072ab.m649b(str, str2 + "spawnEffects", (String) null);
        String m649b7 = c1072ab.m649b(str, str2 + "spawnEffectsOnQueue", (String) null);
        String m649b8 = c1072ab.m649b(str, str2 + "playSoundAtUnit", (String) null);
        String m649b9 = c1072ab.m649b(str, str2 + "playSoundGlobally", (String) null);
        String m649b10 = c1072ab.m649b(str, str2 + "playSoundToPlayer", (String) null);
        String m649b11 = c1072ab.m649b(str, str2 + "playSoundToPlayerOnQueue", (String) null);
        C0336o.m4135a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0326e.m4146a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0329h.m4142a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0322a.m4150a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0332k.m4139a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0323b.m4148a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0325d.m4147a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0333l.m4138a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0328g.m4143a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0334m.m4137a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0327f.m4144a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0331j.m4140a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        C0330i.m4141a(c0453l, c1072ab, str, str2, c0339d, str3, z);
        LogicBoolean m687a2 = c1072ab.m687a(c0453l, str, str2 + "resetCustomTimer", (LogicBoolean) null);
        boolean z3 = false;
        if (z) {
            z3 = true;
        } else {
            z3 = (m649b == null && m649b2 == null && m666a == null && m649b3 == null) ? true : true;
            z3 = (m3890a.m3872c() || m3890a2.m3872c()) ? true : true;
            z3 = (m649b4 == null && m649b5 == null && m649b6 == null && 0 == 0) ? true : true;
            z3 = (m649b8 == null && m649b9 == null && m649b10 == null && m649b11 == null) ? true : true;
            if (c0339d.f2133ab.size() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if ("NONE".equalsIgnoreCase(m649b)) {
                m649b = null;
            }
            if ("NONE".equalsIgnoreCase(m649b2)) {
                m649b2 = null;
            }
            if (m649b3 != null && m649b3.equalsIgnoreCase("NONE")) {
                m649b3 = null;
            }
            c0339d.f2048a = c0453l.f3271ge.size();
            c0339d.f2049b = str3;
            c0339d.f2060n = c1072ab.m668a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0339d.f2063r = C0448g.m3733a(c1072ab.m649b(str, str2 + "tags", (String) null));
            c0339d.f2123o = c1072ab.m666a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0339d.f2061p = C0424b.m3890a(c0453l, c1072ab, str, str2 + "price", true);
            c0339d.f2062q = C0424b.m3876b(c0453l, c1072ab, str, str2 + "streamingCost", null);
            if (c1072ab.m668a(str, str2 + "switchPriceWithStreamingCost", (Boolean) false).booleanValue()) {
                if (c0339d.f2062q != null) {
                    throw new RuntimeException("[" + str + "]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                }
                c0339d.f2062q = C0424b.m3876b(c0453l, c1072ab, str, str2 + "price", null);
                c0339d.f2061p = C0424b.f2710a;
            }
            c0453l.m3551a(c0339d.f2061p);
            if (c0339d.f2062q != null) {
                c0453l.m3551a(c0339d.f2062q);
            }
            c0339d.f2124J = c1072ab.m668a(str, str2 + "highPriorityQueue", (Boolean) false).booleanValue();
            c0339d.f2125K = c1072ab.m668a(str, str2 + "onlyOneUnitAtATime", (Boolean) false).booleanValue();
            c0339d.f2126L = c1072ab.m668a(str, str2 + "canPlayerCancel", (Boolean) true).booleanValue();
            c0339d.f2128N = c1072ab.m668a(str, str2 + "alwaysSinglePress", (Boolean) false).booleanValue();
            c0339d.f2127M = c1072ab.m668a(str, str2 + "allowMultipleInQueue", (Boolean) true).booleanValue();
            if (!c0339d.f2126L && !c0339d.f2127M && c0339d.f2128N) {
                c0339d.f2129O = true;
            }
            if (!c0339d.f2126L) {
                c0339d.f2122i = EnumC0226u.none;
            } else {
                c0339d.f2122i = EnumC0226u.popupQueue;
            }
            c0339d.f2064s = c1072ab.m687a(c0453l, str, str2 + "requireConditional", (LogicBoolean) null);
            c0339d.f2065t = c1072ab.m687a(c0453l, str, str2 + "isActive", (LogicBoolean) null);
            c0339d.f2066u = c1072ab.m687a(c0453l, str, str2 + "isVisible", (LogicBoolean) null);
            c0339d.f2068w = c1072ab.m668a(str, str2 + "isAlsoViewableByEnemies", (Boolean) false).booleanValue();
            c0339d.f2067v = c1072ab.m668a(str, str2 + "isAlsoViewableByAllies", Boolean.valueOf(c0339d.f2068w)).booleanValue();
            if (z2) {
                if (c0339d.f2066u != null && !LogicBoolean.isStaticFalse(c0339d.f2066u)) {
                    throw new RuntimeException("[" + str + "]isVisible doesn't make sense to use in hidden actions");
                }
                c0339d.f2066u = LogicBoolean.falseBoolean;
            }
            c0339d.f2070y = c1072ab.m687a(c0453l, str, str2 + "isLocked", (LogicBoolean) null);
            c0339d.f2071z = m4082a(c0453l, c1072ab, str, str2 + "isLockedMessage", (String) null);
            if (c0339d.f2070y != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2070y == LogicBoolean.falseBoolean) {
                c0339d.f2070y = null;
            }
            c0339d.f2072A = c1072ab.m687a(c0453l, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0339d.f2073B = m4082a(c0453l, c1072ab, str, str2 + "isLockedAltMessage", (String) null);
            if (c0339d.f2072A != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2072A == LogicBoolean.falseBoolean) {
                c0339d.f2072A = null;
            }
            c0339d.f2074C = c1072ab.m687a(c0453l, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0339d.f2075D = m4082a(c0453l, c1072ab, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0339d.f2074C != null) {
                c0339d.f2069x = true;
            }
            if (c0339d.f2074C == LogicBoolean.falseBoolean) {
                c0339d.f2074C = null;
            }
            c0339d.f2076E = LogicBoolean.create(c0453l, c1072ab.m649b(str, str2 + "ai_isHighPriority", (String) null), null);
            if (c0339d.f2076E == LogicBoolean.falseBoolean) {
                c0339d.f2076E = null;
            }
            if (c0339d.f2076E != null) {
                c0453l.f3248fH = true;
            }
            c0339d.f2077F = c1072ab.m687a(c0453l, str, str2 + "ai_isDisabled", LogicBoolean.falseBoolean);
            c0339d.f2136aK = (EnumC0340e) c1072ab.m667a(str, str2 + "aiUse", c0339d.f2136aK, EnumC0340e.class);
            c0339d.f2080I = c0453l.m3536a(c1072ab.m649b(str, str2 + "guiBuildUnit", (String) null), str2 + "guiBuildUnit", str);
            if (c0339d.f2080I != null) {
                c0339d.f2122i = EnumC0226u.placeBuilding;
                if (m649b != null) {
                    throw new RuntimeException("[" + str + "]guiBuildUnit and convertTo cannot currently be used the same action");
                }
            }
            c0339d.f2079H = c0453l.m3536a(c1072ab.m649b(str, str2 + "ai_considerSameAsBuilding", (String) null), str2 + "ai_considerSameAsBuilding", str);
            c0339d.f2116aC = c1072ab.m687a(c0453l, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0339d.f2109av = m4061a(c0453l.f2933E, c1072ab.m649b(str, str2 + "iconImage", "NONE"), c0453l.f2955aa, c0453l, str, str2 + "iconImage");
            c0339d.f2112ay = c1072ab.m687a(c0453l, str, str2 + "iconExtraIsVisible", (LogicBoolean) null);
            if (c0339d.f2112ay == LogicBoolean.trueBoolean) {
                c0339d.f2112ay = null;
            }
            c0339d.f2110aw = c0453l.m3542a(c1072ab, str, str2 + "iconExtraImage");
            c0339d.f2111ax = c1072ab.m664a(str, str2 + "iconExtraColor", Integer.valueOf(Color.m5538a(100, 255, 255, 255))).intValue();
            c0339d.f2113az = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "unitShownInUI", null);
            if (c0339d.f2113az != null && c0339d.f2109av != null) {
                throw new RuntimeException("[" + str + "]unitShownInUI and iconImage: doesn't make sense to use both at the same time");
            }
            c0339d.f2114aA = c1072ab.m668a(str, str2 + "unitShownInUIWithHpBar", (Boolean) true).booleanValue();
            c0339d.f2115aB = c1072ab.m668a(str, str2 + "unitShownInUIWithProgressBar", (Boolean) true).booleanValue();
            c0339d.f2134aD = (EnumC0225t) c1072ab.m667a(str, str2 + "displayType", c0339d.f2134aD, EnumC0225t.class);
            c0339d.f2118aF = c1072ab.m668a(str, str2 + "displayRemainingStockpile", (Boolean) false).booleanValue();
            c0339d.f2050c = m4082a(c0453l, c1072ab, str, str2 + "text", VariableScope.nullOrMissingString);
            c0339d.f2051d = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "textAddUnitName", null);
            c0339d.f2054g = m4075a(c1072ab, str, str2 + "textPostFix", (String) null);
            c0339d.f2052e = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "descriptionAddFromUnit", null);
            c0339d.f2053f = UnitReference.parseUnitTypeOrReferenceFromConf(c0453l, c1072ab, str, str2 + "descriptionAddUnitStats", null);
            c0339d.f2055h = m4082a(c0453l, c1072ab, str, str2 + "description", VariableScope.nullOrMissingString);
            c0339d.f2130R = c1072ab.m639d(str, str2 + "buildSpeed", Float.valueOf(c0339d.f2130R)).floatValue();
            if (c0339d.f2130R == 0.0f) {
                c0339d.f2130R = 50.0f;
            }
            c0339d.f2131S = c1072ab.m668a(str, str2 + "buildSpeed_ignoreFactorySpeedModifiers", Boolean.valueOf(c0339d.f2131S)).booleanValue();
            boolean z4 = false;
            c0339d.f2132T = c1072ab.m668a(str, str2 + "whenBuilding_cannotMove", Boolean.valueOf(c0339d.f2132T)).booleanValue();
            c0339d.f2083U = c0453l.m3538a(c1072ab.m649b(str, str2 + "whenBuilding_playAnimation", (String) null), c0339d.f2083U);
            c0339d.f2084V = c1072ab.m666a(str, str2 + "whenBuilding_rotateTo", c0339d.f2084V);
            c0339d.f2085W = c1072ab.m668a(str, str2 + "whenBuilding_rotateTo_orBackwards", Boolean.valueOf(c0339d.f2085W)).booleanValue();
            c0339d.f2086X = c1072ab.m668a(str, str2 + "whenBuilding_rotateTo_waitTillRotated", Boolean.valueOf(c0339d.f2086X)).booleanValue();
            c0339d.f2087Y = c1072ab.m668a(str, str2 + "whenBuilding_rotateTo_aimAtActionTarget", Boolean.valueOf(c0339d.f2087Y)).booleanValue();
            String m649b12 = c1072ab.m649b(str, str2 + "whenBuilding_rotateTo_rotateTurretX", (String) null);
            if (m649b12 != null) {
                c0339d.f2088Z = c0453l.m3515e(m649b12);
                if (c0339d.f2088Z == null) {
                    throw new RuntimeException("Cannot find turret:" + m649b12 + " for [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
                if (c0339d.f2085W) {
                    throw new RuntimeException("whenBuilding_rotateTo_orBackwards:true not supported with [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
            }
            if (c0339d.f2087Y && c0339d.f2084V == null) {
                c0339d.f2084V = Float.valueOf(0.0f);
            }
            c0339d.f2089aa = c1072ab.m685a(c0453l, str, str2 + "whenBuilding_triggerAction", (C0462t) null);
            c0339d.f2081P = c1072ab.m668a(str, str2 + "convertTo_keepCurrentTags", Boolean.valueOf(c0339d.f2081P)).booleanValue();
            c0339d.f2082Q = C0359aq.m4017a(c1072ab, str, str2 + "convertTo_keepCurrentFields", (AbstractC0377ar[]) null);
            if (m649b2 != null && !"NONE".equalsIgnoreCase(m649b2)) {
                c0339d.f2057k = c0453l.m3536a(m649b2, str2 + "whenBuilding_temporarilyConvertTo", str);
                c0339d.f2058l = m4017a;
                z4 = true;
            }
            if (c0339d.f2132T || c0339d.f2083U != null || c0339d.f2084V != null || c0339d.f2057k != null || c0339d.f2089aa != null) {
                c0453l.f3013bg = true;
            }
            c0339d.f2135aJ = EnumC0341f.convert;
            if (m649b != null && !"NONE".equalsIgnoreCase(m649b)) {
                c0339d.f2078G = c0453l.m3536a(m649b, str2 + "convertTo", str);
                c0339d.f2056j = m649b;
                c0339d.f2127M = false;
                z4 = true;
            }
            if (m666a != null) {
                c0339d.f2090ac = m666a;
                z4 = true;
            }
            if (m3890a != null && m3890a.m3872c()) {
                c0339d.f2091ad = m3890a;
                z4 = true;
            }
            if (m3890a2 != null && m3890a2.m3872c()) {
                c0339d.f2092ae = m3890a2;
                z4 = true;
            }
            c0339d.f2094ag = c1072ab.m672a(str, str2 + "fireTurretXAtGround_withOffset", (PointF) null);
            c0339d.f2095ah = c1072ab.m654b(c0453l, str, str2 + "fireTurretXAtGround_withTarget", null);
            c0339d.f2097aj = c1072ab.m650b(str, str2 + "fireTurretXAtGround_count", (Integer) 1).intValue();
            if (c0339d.f2095ah != null && c0339d.f2094ag == null) {
                c0339d.f2094ag = new PointF(0.0f, 0.0f);
            }
            String m649b13 = c1072ab.m649b(str, str2 + "fireTurretXAtGround_withProjectile", (String) null);
            if (m649b13 != null) {
                c0339d.f2096ai = c0453l.m3513f(m649b13);
                if (c0339d.f2096ai == null) {
                    throw new RuntimeException("Cannot find projectile:" + m649b13 + " for [" + str + "]" + str2 + "fireTurretXAtGround_withProjectile");
                }
            }
            String m649b14 = c1072ab.m649b(str, str2 + "fireTurretXAtGround_onlyOverPassableTileOf", (String) null);
            if (m649b14 != null) {
                c0339d.f2098ak = EnumC0246ao.m4389a(m649b14, str2 + "fireTurretXAtGround_overPassableTileOf");
            }
            if (m649b3 != null) {
                C0411bl m3515e = c0453l.m3515e(m649b3);
                if (m3515e == null) {
                    throw new RuntimeException("Cannot find turret:" + m649b3 + " for [" + str + "]" + str2 + "fireTurretXAtGround");
                }
                c0339d.f2093af = Integer.valueOf(m3515e.f2547e);
                if (c0339d.f2094ag == null) {
                    c0339d.f2122i = EnumC0226u.targetGround;
                    if (c0339d.f2080I != null) {
                        throw new RuntimeException("[" + str + "]guiBuildUnit and fireTurretXAtGround (without withOffset) cannot be used in the same action");
                    }
                }
                z4 = true;
            }
            c0339d.f2099al = m654b;
            c0339d.f2100am = m687a;
            if (m649b4 != null && !"NONE".equalsIgnoreCase(m649b4)) {
                c0339d.f2101an = c0453l.m3520c(m649b4, "alsoTriggerAction", str);
                z4 = true;
            }
            if (m649b5 != null && !"NONE".equalsIgnoreCase(m649b5)) {
                c0339d.f2102ao = c0453l.m3520c(m649b5, "alsoQueueAction", str);
                z4 = true;
            }
            if (m649b6 != null) {
                c0339d.f2103ap = c0453l.m3537a(m649b6, (C0467y) null);
                z4 = true;
            }
            if (m649b7 != null) {
                c0339d.f2104aq = c0453l.m3537a(m649b7, (C0467y) null);
                z4 = true;
            }
            if (m649b8 != null) {
                c0339d.f2105ar = C0409bj.m3935a(c0453l, m649b8);
                z4 = true;
            }
            if (m649b9 != null) {
                c0339d.f2106as = C0409bj.m3935a(c0453l, m649b9);
                z4 = true;
            }
            if (m649b10 != null) {
                c0339d.f2107at = C0409bj.m3935a(c0453l, m649b10);
                z4 = true;
            }
            if (m649b11 != null) {
                c0339d.f2108au = C0409bj.m3935a(c0453l, m649b11);
                z4 = true;
            }
            if (m687a2 != null) {
                c0339d.f2117aE = m687a2;
                z4 = true;
            }
            if (c0339d.f2133ab.size() > 0) {
                z4 = true;
            }
            ArrayList arrayList = null;
            String m649b15 = c1072ab.m649b(str, str2 + "autoTriggerOnEvent", (String) null);
            if (m649b15 != null && (m4064a = m4064a(str, str2 + "autoTriggerOnEvent", m649b15)) != null) {
                if (m4064a.size() < 1) {
                    throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: Expected 1 or more options, got:" + m4064a.size());
                }
                Iterator it = m4064a.iterator();
                while (it.hasNext()) {
                    C0350ah c0350ah = (C0350ah) it.next();
                    try {
                        EnumC0347ae enumC0347ae = (EnumC0347ae) C1072ab.m676a(c0350ah.f2226a, (Enum) null, EnumC0347ae.class);
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
                                    String m2033p = C0758f.m2033p(str5);
                                    if (m2033p == null) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2168a.name() + " expected quoted string, got: " + str5);
                                    }
                                    if (c0346ad.f2171d != null) {
                                        throw new C0412bm("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0346ad.f2168a.name() + " tag was set twice");
                                    }
                                    c0346ad.f2171d = C1072ab.m623j(str, str2 + "autoTriggerOnEvent", m2033p);
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
            LogicBoolean m687a3 = c1072ab.m687a(c0453l, str, str2 + "autoTrigger", (LogicBoolean) null);
            String m649b16 = c1072ab.m649b(str, str2 + "autoTrigger", (String) null);
            EnumC0461s enumC0461s = (EnumC0461s) c1072ab.m667a(str, str2 + "autoTriggerCheckRate", c0453l.f3060cb, EnumC0461s.class);
            c0339d.f2059m = z4;
            if (z4 || c0339d.f2066u != null) {
                if (m687a3 != null && z4) {
                    C0460r c0460r = new C0460r();
                    c0460r.f3336a = m687a3;
                    c0460r.f3337b = m649b16;
                    c0460r.f3338c = enumC0461s;
                    c0460r.f3339d = new C0342g(c0339d, c0453l.m3536a(c0339d.f2056j, "[" + str + "]" + str2, str));
                    c0453l.f3261fU.add(c0460r);
                }
                if (arrayList != null && z4) {
                    C0342g c0342g = new C0342g(c0339d, c0453l.m3536a(c0339d.f2056j, "[" + str + "]" + str2, str));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0346ad c0346ad2 = (C0346ad) it2.next();
                        c0346ad2.f2169b = c0342g;
                        c0346ad2.f2170c = c0453l;
                        c0453l.f3280gn.add(c0346ad2);
                    }
                }
                if (c0339d.f2056j != null && c0339d.f2061p != null && c0339d.f2061p.f2699b > 0) {
                    c0453l.f3272gf = true;
                }
                c0453l.f3271ge.add(c0339d);
            }
        }
    }

    /* renamed from: a */
    public static String m4079a(C0453l c0453l, String str, String str2) {
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
            if (c0453l.f2937I == null) {
                str = "units/common.ini";
            } else {
                str = c0453l.f2937I.f5433q + "/common.ini";
            }
        }
        String str3 = C0758f.m2045h(str) + "/";
        while (true) {
            if (str2.startsWith("/") || str2.startsWith("\\")) {
                str2 = str2.substring(1);
            } else {
                return str3 + str2;
            }
        }
    }

    /* renamed from: a */
    public static void m4088a(long j, EnumC0349ag enumC0349ag) {
        enumC0349ag.f2224o += C0727bl.m2388a(j);
    }

    /* renamed from: i */
    public static void m4041i() {
        EnumC0349ag[] values;
        LoggerMaybe.LogDebug2("==Timing==");
        for (EnumC0349ag enumC0349ag : EnumC0349ag.values()) {
            LoggerMaybe.LogDebug2(enumC0349ag.name() + ": " + C0727bl.m2389a(enumC0349ag.f2224o));
        }
    }

    /* renamed from: j */
    public static void m4040j() {
        for (EnumC0349ag enumC0349ag : EnumC0349ag.values()) {
            enumC0349ag.f2224o = 0.0d;
        }
    }

    /* renamed from: a */
    public static C0934e m4061a(String str, String str2, boolean z, C0453l c0453l, String str3, String str4) {
        try {
            return m4062a(str, str2, z, c0453l);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("[" + str3 + "]" + str4 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static C0934e m4062a(String str, String str2, boolean z, C0453l c0453l) {
        long m2390a = C0727bl.m2390a();
        C0934e m4052b = m4052b(str, str2, z, c0453l);
        m4088a(m2390a, EnumC0349ag.imageLoadOrGet);
        return m4052b;
    }

    /* renamed from: b */
    public static C0934e m4052b(String str, String str2, boolean z, C0453l c0453l) {
        C0934e mo188a;
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
            if (c0453l.f2937I == null) {
                str = "units/common.ini";
            } else {
                str = c0453l.f2937I.f5433q + "/common.ini";
            }
        }
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        String str3 = C0758f.m2045h(str) + "/";
        String str4 = "[" + z + "," + z2 + "]" + str3 + str2;
        C0934e m4049c = m4049c(str4);
        if (m4049c != null) {
            return m4049c;
        }
        C1098j m4048c = m4048c(str3, str2, c0453l);
        int i = 0;
        if (f2195e != null) {
            i = f2195e.f5451I;
        }
        if (i > 5) {
            LoggerMaybe.LogDebug2("Fast failing to oom image for this mod");
            mo188a = m1079A.f6113bO.mo134r();
        } else {
            long m2390a = C0727bl.m2390a();
            try {
                mo188a = m1079A.f6113bO.mo188a((InputStream) m4048c, true);
                m4088a(m2390a, EnumC0349ag.imageLoad);
                if (mo188a.mo399A()) {
                    LoggerMaybe.LogDebug2("oomErrors:" + f2202l);
                    f2202l++;
                    if (f2195e != null) {
                        f2195e.f5451I++;
                        f2195e.f5452J++;
                    }
                } else if (f2195e != null && !f2195e.f5442z && LoggerMaybe.f6210aZ) {
                    mo188a.m883z();
                }
            } catch (RuntimeException e) {
                LoggerMaybe.LogDebug2("imageStream:" + m4048c);
                throw new RuntimeException("Error decode image from: " + C0750a.m2228d(str3 + str2), e);
            }
        }
        try {
            m4048c.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (mo188a == null) {
            throw new RuntimeException("Failed to decode image: " + C0750a.m2226e(str3 + str2));
        }
        mo188a.mo396a(z);
        if (z2) {
            mo188a = AbstractC0244am.m4499a(mo188a, mo188a.f6402p, mo188a.f6403q);
        }
        m4076a(mo188a);
        m4070a(str4, mo188a);
        return mo188a;
    }

    /* renamed from: a */
    public static void m4070a(String str, C0934e c0934e) {
        f2197g.put(str, c0934e);
    }

    /* renamed from: c */
    public static C0934e m4049c(String str) {
        C0934e c0934e = (C0934e) f2197g.get(str);
        if (c0934e != null) {
            f2200j++;
            m4076a(c0934e);
            c0934e.mo50t();
            return c0934e;
        }
        if (f2201k) {
            LoggerMaybe.LogDebug2("loadImageInConf: cache miss: " + str);
        }
        f2199i++;
        return null;
    }

    /* renamed from: a */
    public static AbstractC0635i m4065a(String str, String str2, C0453l c0453l) {
        long m2390a = C0727bl.m2390a();
        AbstractC0635i m4053b = m4053b(str, str2, c0453l);
        m4088a(m2390a, EnumC0349ag.soundLoadOrGet);
        return m4053b;
    }

    /* renamed from: b */
    public static AbstractC0635i m4053b(String str, String str2, C0453l c0453l) {
        if (str2 == null || str2.equalsIgnoreCase("NONE")) {
            return null;
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (!str2.contains(".")) {
            return m1079A.f6111bM.m2726a(str2);
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (c0453l.f2937I == null) {
                str = "units/common.ini";
            } else {
                str = c0453l.f2937I.f5433q + "/common.ini";
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
        String str3 = C0758f.m2045h(str) + "/";
        String str4 = str3 + str2;
        AbstractC0635i abstractC0635i = (AbstractC0635i) f2198h.get(str4);
        if (abstractC0635i != null) {
            m4078a(abstractC0635i);
            return abstractC0635i;
        } else if (!str2.toLowerCase(Locale.ROOT).endsWith(".ogg") && !str2.toLowerCase(Locale.ROOT).endsWith(".wav")) {
            throw new RuntimeException("Failed to open sound: " + str3 + VariableScope.nullOrMissingString + str2 + " only the ogg & wav sound formats are supported.");
        } else {
            C1098j m4048c = m4048c(str3, str2, c0453l);
            long m2390a = C0727bl.m2390a();
            AbstractC0635i m2725a = m1079A.f6111bM.m2725a(str2, m4048c, false);
            try {
                m4048c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            m4088a(m2390a, EnumC0349ag.soundLoad);
            if (m2725a == null) {
                String str5 = "Sound file found but failed to load: " + str4;
                if (str2.toLowerCase(Locale.ROOT).endsWith(".ogg")) {
                    str5 = str5 + " - Check if this file is truly a ogg";
                }
                c0453l.m3489r(str5);
                return m1079A.f6111bM.m2721b("Failed to load");
            }
            m4078a(m2725a);
            f2198h.put(str4, m2725a);
            return m2725a;
        }
    }

    /* renamed from: a */
    public static boolean m4063a(String str, String str2, String str3, C0824b c0824b) {
        if (str2 == null || !str2.contains("..") || LoggerMaybe.m1004as()) {
            return true;
        }
        String canonicalPath = new File(C0750a.m2226e(str3)).getCanonicalPath();
        if (canonicalPath.startsWith(new File(C0750a.m2226e("units")).getCanonicalPath())) {
            return true;
        }
        String m1633k = c0824b.m1633k();
        boolean startsWith = canonicalPath.startsWith(m1633k);
        if (!startsWith) {
            LoggerMaybe.m990b("File: '" + canonicalPath + "' is not within mod: '" + m1633k + "'");
        }
        return startsWith;
    }

    /* renamed from: a */
    public static String m4066a(String str, String str2) {
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
    public static C1098j m4048c(String str, String str2, C0453l c0453l) {
        String m4066a = m4066a(str, str2);
        C0824b c0824b = null;
        if (c0453l != null) {
            c0824b = c0453l.f2937I;
        } else {
            LoggerMaybe.m965g("findAssetSteam meta==null");
        }
        if (c0824b != null) {
            try {
                if (!m4063a(str, str2, m4066a, c0824b)) {
                    throw new RuntimeException("File is outside mod: " + m4066a);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        C1098j m2220j = C0750a.m2220j(m4066a);
        if (m2220j == null) {
            LoggerMaybe.LogDebug2("Orginal path: " + m4066a);
            throw new RuntimeException("IO Error: Failed to open: " + m4077a(c0824b, m4066a, true));
        }
        return m2220j;
    }

    /* renamed from: b */
    public static void m4056b(C0453l c0453l) {
        C0384ay[] c0384ayArr = c0453l.f2977aw;
        for (C0384ay c0384ay : c0384ayArr) {
            float f = -1.0f;
            C0384ay c0384ay2 = null;
            float f2 = 1.0f;
            if (c0384ay.f2300o) {
                f2 = 0.1f;
            }
            for (C0384ay c0384ay3 : c0384ayArr) {
                if (c0384ay != c0384ay3 && !c0384ay3.f2280l) {
                    float m2160a = C0758f.m2160a(c0384ay.f2275d * f2, c0384ay.f2276e, c0384ay3.f2275d * f2, c0384ay3.f2276e);
                    if (c0384ay2 == null || m2160a < f) {
                        f = m2160a;
                        c0384ay2 = c0384ay3;
                    }
                }
            }
            float m2163a = C0758f.m2163a(f) + 2.0f;
            float f3 = m2163a * m2163a;
            ArrayList arrayList = new ArrayList();
            for (C0384ay c0384ay4 : c0384ayArr) {
                if (c0384ay != c0384ay4 && !c0384ay4.f2280l && C0758f.m2160a(c0384ay.f2275d * f2, c0384ay.f2276e, c0384ay4.f2275d * f2, c0384ay4.f2276e) <= f3) {
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
    public static String m4039k() {
        return "builtin_mods";
    }

    /* renamed from: l */
    public static String m4038l() {
        return "builtin_mods_enabled";
    }

    /* renamed from: m */
    public static String m4037m() {
        String str;
        if (LoggerMaybe.f6205aU) {
            str = "/SD/mods/units";
        } else {
            str = "/SD/rustedWarfare/units";
        }
        return str;
    }

    /* renamed from: a */
    public static ArrayList m4064a(String str, String str2, String str3) {
        if (str3 == null || VariableScope.nullOrMissingString.equals(str3) || "NONE".equalsIgnoreCase(str3)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C0758f.m2092b(str3, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] m2054f = C0758f.m2054f(trim, "(");
                    if (m2054f == null) {
                        throw new C0412bm("[" + str + "]" + str2 + ": Unexpected format for '" + trim + "' of " + str3);
                    }
                    trim = m2054f[0];
                    str4 = m2054f[1].trim();
                }
                C0350ah c0350ah = new C0350ah();
                c0350ah.f2226a = trim;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0412bm("[" + str + "]" + str2 + ": Expected ')' in '" + trim + "' of " + str3);
                    }
                    Iterator it2 = C0758f.m2120a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str5 = (String) it2.next();
                        if (!str5.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] m2054f2 = C0758f.m2054f(str5, "=");
                            if (m2054f2 == null) {
                                throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected key format for '" + trim + "' of " + str3);
                            }
                            String trim2 = m2054f2[0].trim();
                            String trim3 = m2054f2[1].trim();
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
