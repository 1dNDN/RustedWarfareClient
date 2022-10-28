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
    public static VariableScope.CachedWriter m4033a(String str, C0453l c0453l, String str2, String str3) {
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
    static void m4031a(LinkedHashMap linkedHashMap, AbstractC0377ar abstractC0377ar) {
        linkedHashMap.put(abstractC0377ar.f2257b, abstractC0377ar);
    }

    static {
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "mass") { // from class: com.corrodinggames.rts.game.units.custom.aq.1
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2239b;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2239b = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "maxenergy") { // from class: com.corrodinggames.rts.game.units.custom.aq.10
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2241d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2241d = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0381av(f2254q.size(), "energy") { // from class: com.corrodinggames.rts.game.units.custom.aq.11
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: a */
            public double mo4025a(C0451j c0451j) {
                return c0451j.f1639cz;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: b */
            public void mo4021b(C0451j c0451j, double d) {
                c0451j.f1639cz = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4024a(C0451j c0451j, double d) {
                super.mo4024a(c0451j, d);
                c0451j.f1639cz = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "maxhp") { // from class: com.corrodinggames.rts.game.units.custom.aq.12
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2240c;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2240c = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4024a(C0451j c0451j, double d) {
                super.mo4024a(c0451j, d);
                c0451j.f1633ct = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0381av(f2254q.size(), "hp") { // from class: com.corrodinggames.rts.game.units.custom.aq.13
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: a */
            public double mo4025a(C0451j c0451j) {
                return c0451j.f1632cs;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: b */
            public void mo4021b(C0451j c0451j, double d) {
                c0451j.f1632cs = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4024a(C0451j c0451j, double d) {
                super.mo4024a(c0451j, d);
                c0451j.m4306o((float) d);
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "maxshield") { // from class: com.corrodinggames.rts.game.units.custom.aq.14
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2244g;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2244g = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4024a(C0451j c0451j, double d) {
                super.mo4024a(c0451j, d);
                c0451j.f1638cy = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0381av(f2254q.size(), "shield") { // from class: com.corrodinggames.rts.game.units.custom.aq.15
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: a */
            public double mo4025a(C0451j c0451j) {
                return c0451j.f1635cv;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av
            /* renamed from: b */
            public void mo4021b(C0451j c0451j, double d) {
                c0451j.f1635cv = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0381av, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4024a(C0451j c0451j, double d) {
                super.mo4024a(c0451j, d);
                c0451j.f1635cv = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "shieldregen") { // from class: com.corrodinggames.rts.game.units.custom.aq.16
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2245h;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2245h = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4024a(C0451j c0451j, double d) {
                super.mo4024a(c0451j, d);
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "armour") { // from class: com.corrodinggames.rts.game.units.custom.aq.17
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2249l;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2249l = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "maxattackrange") { // from class: com.corrodinggames.rts.game.units.custom.aq.2
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2246i;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2246i = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "shootdelaymultiplier") { // from class: com.corrodinggames.rts.game.units.custom.aq.3
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2242e;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2242e = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4024a(C0451j c0451j, double d) {
                super.mo4024a(c0451j, d);
                c0451j.m2875aW();
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "shootdamagemultiplier") { // from class: com.corrodinggames.rts.game.units.custom.aq.4
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2243f;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2243f = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "movespeed") { // from class: com.corrodinggames.rts.game.units.custom.aq.5
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2247j;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2247j = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "maxturnspeed") { // from class: com.corrodinggames.rts.game.units.custom.aq.6
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2248k;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2248k = (float) d;
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "fogofwarsightrange") { // from class: com.corrodinggames.rts.game.units.custom.aq.7
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2251n;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2251n = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au, com.corrodinggames.rts.game.units.custom.AbstractC0377ar
            /* renamed from: a */
            public void mo4024a(C0451j c0451j, double d) {
                int mo3169s = c0451j.mo3169s();
                super.mo4024a(c0451j, d);
                if (c0451j.mo3169s() > mo3169s && !c0451j.f3943aw) {
                    c0451j.m3647c(false);
                }
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "nanorange") { // from class: com.corrodinggames.rts.game.units.custom.aq.8
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2252o;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2252o = (int) d;
            }
        });
        m4031a(f2254q, new AbstractC0380au(f2254q.size(), "selfregenrate") { // from class: com.corrodinggames.rts.game.units.custom.aq.9
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public double mo4027a(C0359aq c0359aq) {
                return c0359aq.f2253p;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0380au
            /* renamed from: a */
            public void mo4026a(C0359aq c0359aq, double d) {
                c0359aq.f2253p = (float) d;
            }
        });
        f2255r = new LinkedHashMap();
        for (String str : f2254q.keySet()) {
            if (!str.equals(str.toLowerCase(Locale.ROOT))) {
                throw new RuntimeException(str);
            }
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2254q.get(str);
            if (!abstractC0377ar.mo4022b()) {
                f2255r.put(str, abstractC0377ar);
            }
        }
    }

    /* renamed from: b */
    public C0359aq m4030b() {
        C0359aq clone = clone();
        clone.f2238a = false;
        return clone;
    }

    /* renamed from: a */
    public static AbstractC0377ar m4039a(int i) {
        for (AbstractC0377ar abstractC0377ar : f2254q.values()) {
            if (i == abstractC0377ar.f2256a) {
                return abstractC0377ar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m4036a(C0451j c0451j, C0359aq c0359aq, AbstractC0377ar[] abstractC0377arArr) {
        for (AbstractC0377ar abstractC0377ar : abstractC0377arArr) {
            double mo4023a = abstractC0377ar.mo4023a(c0451j, c0451j.f2864y);
            double mo4023a2 = abstractC0377ar.mo4023a(c0451j, c0359aq);
            if (mo4023a != mo4023a2) {
                c0451j.m3610dH();
                abstractC0377ar.mo4024a(c0451j, mo4023a2);
            }
        }
    }

    /* renamed from: a */
    public static void m4037a(C0451j c0451j, C0359aq c0359aq, C0453l c0453l) {
        if (!(c0359aq != c0453l.f3246cJ)) {
            return;
        }
        for (String str : f2255r.keySet()) {
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2255r.get(str);
            double mo4023a = abstractC0377ar.mo4023a(c0451j, c0453l.f3246cJ);
            double mo4023a2 = abstractC0377ar.mo4023a(c0451j, c0359aq);
            if (mo4023a != mo4023a2) {
                c0451j.m3610dH();
                abstractC0377ar.mo4024a(c0451j, mo4023a2);
            }
        }
    }

    /* renamed from: a */
    public static void m4038a(C0359aq c0359aq, C0451j c0451j, StreamWriter streamWriter) {
        C0453l c0453l = c0451j.f2863x;
        if (!(c0359aq != c0453l.f3246cJ)) {
            streamWriter.mo1314a(true);
            return;
        }
        streamWriter.mo1314a(false);
        short s = 0;
        for (String str : f2255r.keySet()) {
            AbstractC0377ar abstractC0377ar = (AbstractC0377ar) f2255r.get(str);
            if (abstractC0377ar.mo4023a(c0451j, c0453l.f3246cJ) != abstractC0377ar.mo4023a(c0451j, c0359aq)) {
                s = (short) (s + 1);
            }
        }
        streamWriter.mo1315a(s);
        int i = 0;
        for (String str2 : f2255r.keySet()) {
            AbstractC0377ar abstractC0377ar2 = (AbstractC0377ar) f2255r.get(str2);
            double mo4023a = abstractC0377ar2.mo4023a(c0451j, c0453l.f3246cJ);
            double mo4023a2 = abstractC0377ar2.mo4023a(c0451j, c0359aq);
            if (mo4023a != mo4023a2) {
                i++;
                if (s < i) {
                    throw new IOException("numberOfChangedFields>fieldsWritten: " + ((int) s) + ">" + i);
                }
                streamWriter.mo1315a((short) abstractC0377ar2.f2256a);
                streamWriter.m1385a(mo4023a2);
                streamWriter.m1385a(mo4023a);
            }
        }
    }

    /* renamed from: a */
    public static void m4035a(C0451j c0451j, Reader reader, int i) {
        C0453l c0453l = c0451j.f2863x;
        if (reader.ReadBool()) {
            return;
        }
        int m1270v = reader.m1270v();
        for (int i2 = 0; i2 < m1270v; i2++) {
            short m1270v2 = reader.m1270v();
            double m1284h = reader.m1284h();
            reader.m1284h();
            AbstractC0377ar m4039a = m4039a(m1270v2);
            if (m4039a == null) {
                throw new IOException("Field " + ((int) m1270v2) + " doesn't exist");
            }
            c0451j.m3610dH();
            m4039a.mo4024a(c0451j, m1284h);
        }
    }

    /* renamed from: a */
    public static AbstractC0377ar[] m4034a(C1072ab c1072ab, String str, String str2, AbstractC0377ar[] abstractC0377arArr) {
        try {
            return m4032a(c1072ab.m644b(str, str2, (String) null), abstractC0377arArr);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static AbstractC0377ar[] m4032a(String str, AbstractC0377ar[] abstractC0377arArr) {
        if (str == null) {
            return abstractC0377arArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : C0758f.m2078c(str, ',')) {
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
                throw new RuntimeException("Unknown value: " + lowerCase + " (Expected: " + C0758f.m2092b(str3, 100) + ")");
            }
            arrayList.add(abstractC0377ar);
        }
        return (AbstractC0377ar[]) arrayList.toArray(new AbstractC0377ar[0]);
    }
}
