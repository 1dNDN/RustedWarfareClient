package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aq.class */
public class C0359aq implements Cloneable {

    /* renamed from: a */
    public boolean f2238a;

    /* renamed from: b */
    public float f2239b;

    /* renamed from: c */
    public int f2240c;

    /* renamed from: d */
    public float f2241d;

    /* renamed from: e */
    public float f2242e = 1.0f;

    /* renamed from: f */
    public float f2243f = 1.0f;

    /* renamed from: g */
    public int f2244g;

    /* renamed from: h */
    public float f2245h;

    /* renamed from: i */
    public float f2246i;

    /* renamed from: j */
    public float f2247j;

    /* renamed from: k */
    public float f2248k;

    /* renamed from: l */
    public float f2249l;

    /* renamed from: m */
    public boolean f2250m;

    /* renamed from: n */
    public int f2251n;

    /* renamed from: o */
    public int f2252o;

    /* renamed from: p */
    public float f2253p;

    /* renamed from: q */
    static LinkedHashMap f2254q = new LinkedHashMap();

    /* renamed from: r */
    static LinkedHashMap f2255r;

    public C0359aq(boolean z) {
        this.f2238a = z;
    }

    /* renamed from: a */
    public static VariableScope.CachedWriter m4246a(String str, C0453l c0453l, String str2, String str3) {
        try {
            return VariableScope.CachedWriter.create(str, new C0378as(c0453l));
        } catch (C0412bm e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public C0359aq clone() {
        try {
            C0359aq c0359aq = (C0359aq) super.clone();
            c0359aq.f2238a = false;
            return c0359aq;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static void m4244a(LinkedHashMap linkedHashMap, AbstractC0377ar abstractC0377ar) {
        linkedHashMap.put(abstractC0377ar.f2257b, abstractC0377ar);
    }

    static {
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "mass") { // from class: com.corrodinggames.rts.game.units.custom.aq.1
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2239b;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2239b = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "maxenergy") { // from class: com.corrodinggames.rts.game.units.custom.aq.10
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2241d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2241d = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0381av(f2254q.size(), "energy") { // from class: com.corrodinggames.rts.game.units.custom.aq.11
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: a */
            public double mo4238a(C0451j c0451j) {
                return c0451j.f1639cz;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: b */
            public void mo4234b(C0451j c0451j, double d) {
                c0451j.f1639cz = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4237a(C0451j c0451j, double d) {
                super.mo4237a(c0451j, d);
                c0451j.f1639cz = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "maxhp") { // from class: com.corrodinggames.rts.game.units.custom.aq.12
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2240c;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2240c = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4237a(C0451j c0451j, double d) {
                super.mo4237a(c0451j, d);
                c0451j.f1633ct = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0381av(f2254q.size(), "hp") { // from class: com.corrodinggames.rts.game.units.custom.aq.13
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: a */
            public double mo4238a(C0451j c0451j) {
                return c0451j.f1632cs;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: b */
            public void mo4234b(C0451j c0451j, double d) {
                c0451j.f1632cs = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4237a(C0451j c0451j, double d) {
                super.mo4237a(c0451j, d);
                c0451j.m4650o((float) d);
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "maxshield") { // from class: com.corrodinggames.rts.game.units.custom.aq.14
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2244g;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2244g = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4237a(C0451j c0451j, double d) {
                super.mo4237a(c0451j, d);
                c0451j.f1638cy = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0381av(f2254q.size(), "shield") { // from class: com.corrodinggames.rts.game.units.custom.aq.15
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: a */
            public double mo4238a(C0451j c0451j) {
                return c0451j.f1635cv;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: b */
            public void mo4234b(C0451j c0451j, double d) {
                c0451j.f1635cv = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4237a(C0451j c0451j, double d) {
                super.mo4237a(c0451j, d);
                c0451j.f1635cv = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "shieldregen") { // from class: com.corrodinggames.rts.game.units.custom.aq.16
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2245h;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2245h = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4237a(C0451j c0451j, double d) {
                super.mo4237a(c0451j, d);
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "armour") { // from class: com.corrodinggames.rts.game.units.custom.aq.17
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2249l;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2249l = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "maxattackrange") { // from class: com.corrodinggames.rts.game.units.custom.aq.2
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2246i;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2246i = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "shootdelaymultiplier") { // from class: com.corrodinggames.rts.game.units.custom.aq.3
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2242e;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2242e = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4237a(C0451j c0451j, double d) {
                super.mo4237a(c0451j, d);
                c0451j.m2931aW();
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "shootdamagemultiplier") { // from class: com.corrodinggames.rts.game.units.custom.aq.4
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2243f;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2243f = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "movespeed") { // from class: com.corrodinggames.rts.game.units.custom.aq.5
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2247j;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2247j = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "maxturnspeed") { // from class: com.corrodinggames.rts.game.units.custom.aq.6
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2248k;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2248k = (float) d;
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "fogofwarsightrange") { // from class: com.corrodinggames.rts.game.units.custom.aq.7
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2251n;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2251n = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4237a(C0451j c0451j, double d) {
                int m3753s = c0451j.m3753s();
                super.mo4237a(c0451j, d);
                if (c0451j.m3753s() > m3753s && !c0451j.f3943aw) {
                    c0451j.m3838c(false);
                }
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "nanorange") { // from class: com.corrodinggames.rts.game.units.custom.aq.8
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2252o;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2252o = (int) d;
            }
        });
        m4244a(f2254q, new AbstractC0380au(f2254q.size(), "selfregenrate") { // from class: com.corrodinggames.rts.game.units.custom.aq.9
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4240a(C0359aq c0359aq) {
                return c0359aq.f2253p;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4239a(C0359aq c0359aq, double d) {
                c0359aq.f2253p = (float) d;
            }
        });
        f2255r = new LinkedHashMap();
        for (String str : f2254q.keySet()) {
            if (!str.equals(str.toLowerCase(Locale.ROOT))) {
                throw new RuntimeException(str);
            }
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2254q.get(str);
            if (!abstractC0377ar.mo4235b()) {
                f2255r.put(str, abstractC0377ar);
            }
        }
    }

    /* renamed from: b */
    public C0359aq m4243b() {
        C0359aq m4253a = m4253a();
        m4253a.f2238a = false;
        return m4253a;
    }

    /* renamed from: a */
    public static AbstractC0377ar m4252a(int i) {
        for (AbstractC0377ar abstractC0377ar : f2254q.values()) {
            if (i == abstractC0377ar.f2256a) {
                return abstractC0377ar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m4249a(C0451j c0451j, C0359aq c0359aq, AbstractC0377ar[] abstractC0377arArr) {
        for (AbstractC0377ar abstractC0377ar : abstractC0377arArr) {
            double mo4236a = abstractC0377ar.mo4236a(c0451j, c0451j.f2864y);
            double mo4236a2 = abstractC0377ar.mo4236a(c0451j, c0359aq);
            if (mo4236a != mo4236a2) {
                c0451j.m3793dH();
                abstractC0377ar.mo4237a(c0451j, mo4236a2);
            }
        }
    }

    /* renamed from: a */
    public static void m4250a(C0451j c0451j, C0359aq c0359aq, C0453l c0453l) {
        if (!(c0359aq != c0453l.f3246cJ)) {
            return;
        }
        for (String str : f2255r.keySet()) {
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2255r.get(str);
            double mo4236a = abstractC0377ar.mo4236a(c0451j, c0453l.f3246cJ);
            double mo4236a2 = abstractC0377ar.mo4236a(c0451j, c0359aq);
            if (mo4236a != mo4236a2) {
                c0451j.m3793dH();
                abstractC0377ar.mo4237a(c0451j, mo4236a2);
            }
        }
    }

    /* renamed from: a */
    public static void m4251a(C0359aq c0359aq, C0451j c0451j, StreamWriter streamWriter) {
        C0453l c0453l = c0451j.f2863x;
        if (!(c0359aq != c0453l.f3246cJ)) {
            streamWriter.mo1329a(true);
            return;
        }
        streamWriter.mo1329a(false);
        short s = 0;
        for (String str : f2255r.keySet()) {
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2255r.get(str);
            if (abstractC0377ar.mo4236a(c0451j, c0453l.f3246cJ) != abstractC0377ar.mo4236a(c0451j, c0359aq)) {
                s = (short) (s + 1);
            }
        }
        streamWriter.mo1330a(s);
        int i = 0;
        for (String str2 : f2255r.keySet()) {
            AbstractC0377ar abstractC0377ar2 = (AbstractC0377ar) f2255r.get(str2);
            double mo4236a = abstractC0377ar2.mo4236a(c0451j, c0453l.f3246cJ);
            double mo4236a2 = abstractC0377ar2.mo4236a(c0451j, c0359aq);
            if (mo4236a != mo4236a2) {
                i++;
                if (s < i) {
                    throw new IOException("numberOfChangedFields>fieldsWritten: " + ((int) s) + ">" + i);
                }
                streamWriter.mo1330a((short) abstractC0377ar2.f2256a);
                streamWriter.m1426a(mo4236a2);
                streamWriter.m1426a(mo4236a);
            }
        }
    }

    /* renamed from: a */
    public static void m4248a(C0451j c0451j, Reader reader, int i) {
        C0453l c0453l = c0451j.f2863x;
        if (reader.ReadBool()) {
            return;
        }
        int m1285v = reader.m1285v();
        for (int i2 = 0; i2 < m1285v; i2++) {
            short m1285v2 = reader.m1285v();
            double m1299h = reader.m1299h();
            reader.m1299h();
            AbstractC0377ar m4252a = m4252a(m1285v2);
            if (m4252a == null) {
                throw new IOException("Field " + ((int) m1285v2) + " doesn't exist");
            }
            c0451j.m3793dH();
            m4252a.mo4237a(c0451j, m1299h);
        }
    }

    /* renamed from: a */
    public static AbstractC0377ar[] m4247a(C1072ab c1072ab, String str, String str2, AbstractC0377ar[] abstractC0377arArr) {
        try {
            return m4245a(c1072ab.m656b(str, str2, (String) null), abstractC0377arArr);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static AbstractC0377ar[] m4245a(String str, AbstractC0377ar[] abstractC0377arArr) {
        if (str == null) {
            return abstractC0377arArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : C0758f.m2130c(str, ',')) {
            String lowerCase = str2.trim().toLowerCase(Locale.ROOT);
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2255r.get(lowerCase);
            if (arrayList.contains(abstractC0377ar)) {
                throw new RuntimeException("Value: " + lowerCase + " is repeated");
            }
            if (abstractC0377ar == null) {
                String str3 = VariableScope.nullOrMissingString;
                for (String str4 : f2255r.keySet()) {
                    if (!str3.equals(VariableScope.nullOrMissingString)) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + str4;
                }
                throw new RuntimeException("Unknown value: " + lowerCase + " (Expected: " + C0758f.m2144b(str3, 100) + ")");
            }
            arrayList.add(abstractC0377ar);
        }
        return (AbstractC0377ar[]) arrayList.toArray(new AbstractC0377ar[0]);
    }
}
