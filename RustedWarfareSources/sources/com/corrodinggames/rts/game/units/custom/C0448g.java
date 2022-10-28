package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/g.class */
public final class C0448g {

    /* renamed from: a */
    final String f2834a;

    /* renamed from: b */
    public static ArrayList f2835b = new ArrayList();

    /* renamed from: c */
    public static final C0448g[] f2836c = new C0448g[0];

    /* renamed from: d */
    public static final C0449h f2837d = new C0449h(f2836c);

    private C0448g(String str) {
        this.f2834a = str;
    }

    public String toString() {
        return this.f2834a;
    }

    /* renamed from: a */
    public static C0449h m3895a(String str) {
        return m3894a(str, (C0449h) null);
    }

    /* renamed from: a */
    public static C0449h m3894a(String str, C0449h c0449h) {
        if (str == null) {
            return c0449h;
        }
        if (str.trim().equals(VariableScope.nullOrMissingString)) {
            return c0449h;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            String trim = str2.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                C0448g m3891c = m3891c(trim);
                if (!arrayList.contains(m3891c)) {
                    arrayList.add(m3891c);
                }
            }
        }
        if (arrayList.size() == 0) {
            return c0449h;
        }
        return new C0449h((C0448g[]) arrayList.toArray(new C0448g[0]));
    }

    /* renamed from: b */
    public static C0448g m3892b(String str) {
        String trim = str.trim();
        if (trim.contains(",")) {
            throw new C0412bm("Expected single tag, got:" + trim);
        }
        return m3891c(trim);
    }

    /* renamed from: c */
    public static C0448g m3891c(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        Iterator it = f2835b.iterator();
        while (it.hasNext()) {
            C0448g c0448g = (C0448g) it.next();
            if (c0448g.f2834a.equals(lowerCase)) {
                return c0448g;
            }
        }
        C0448g c0448g2 = new C0448g(lowerCase);
        f2835b.add(c0448g2);
        return c0448g2;
    }

    /* renamed from: a */
    public static void m3897a(C0449h c0449h, StreamWriter streamWriter) {
        C0448g[] c0448gArr;
        if (c0449h == null) {
            streamWriter.m1399b((String) null);
        } else if (c0449h.f2838a.length == 0) {
            streamWriter.m1399b(VariableScope.nullOrMissingString);
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (C0448g c0448g : c0449h.f2838a) {
                if (!z) {
                    sb.append(",");
                }
                z = false;
                sb.append(c0448g.f2834a);
            }
            streamWriter.m1399b(sb.toString());
        }
    }

    /* renamed from: a */
    public static C0449h m3896a(Reader reader) {
        String ReadString = reader.ReadString();
        if (ReadString == null) {
            return null;
        }
        return m3894a(ReadString, f2837d);
    }

    /* renamed from: a */
    public static boolean m3898a(C0449h c0449h, C0449h c0449h2) {
        if (c0449h2 == null) {
            return false;
        }
        C0448g[] c0448gArr = c0449h.f2838a;
        C0448g[] c0448gArr2 = c0449h2.f2838a;
        for (C0448g c0448g : c0448gArr) {
            for (C0448g c0448g2 : c0448gArr2) {
                if (c0448g == c0448g2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3899a(C0448g c0448g, C0449h c0449h) {
        if (c0449h == null) {
            return false;
        }
        for (C0448g c0448g2 : c0449h.f2838a) {
            if (c0448g2 == c0448g) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3893b(C0449h c0449h, C0449h c0449h2) {
        if (c0449h2 == null) {
            if (c0449h == null || c0449h.m3888b() == 0) {
                return true;
            }
            return false;
        }
        C0448g[] c0448gArr = c0449h.f2838a;
        C0448g[] c0448gArr2 = c0449h2.f2838a;
        int length = c0448gArr2.length;
        for (C0448g c0448g : c0448gArr) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c0448g != c0448gArr2[i]) {
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
