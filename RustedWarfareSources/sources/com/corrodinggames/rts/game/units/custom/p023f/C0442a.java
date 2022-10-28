package com.corrodinggames.rts.game.units.custom.p023f;

import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/a.class */
public class C0442a {

    /* renamed from: a */
    static final Pattern f2822a = Pattern.compile("\\$\\{([^\\}]*)\\}");

    /* renamed from: b */
    static final Pattern f2823b = Pattern.compile("[A-Za-z_][A-Za-z_.0-9]*");

    /* renamed from: c */
    static C0443b f2824c = new C0443b();

    /* renamed from: a */
    public static void m3590a(C0453l c0453l, C1072ab c1072ab) {
        int i = 0;
        f2824c.m3589a();
        Iterator it = c1072ab.m636d("@global ").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = c1072ab.m617k(str, "@global ").iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                String trim = str2.substring("@global ".length()).trim();
                try {
                    C0447e.m3574a(trim);
                    if (c1072ab.m629f(trim)) {
                        throw new C0412bm("[" + str + "]" + str2 + ": A section already has that name");
                    }
                    String m631e = c1072ab.m631e(str, str2);
                    if (m631e.contains("${")) {
                        throw new C0412bm("[" + str + "]" + str2 + " has dynamic value: '" + m631e + "', this is not yet supported");
                    }
                    f2824c.f2825a.m3575a(trim, m631e);
                } catch (C0412bm e) {
                    throw new C0412bm("[" + str + "]" + str2 + ": " + e.getMessage());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap m637d = c1072ab.m637d();
        for (String str3 : m637d.keySet()) {
            if (str3 != null && !str3.startsWith("comment_") && !str3.startsWith("template_")) {
                C0443b m3586b = f2824c.m3586b();
                Iterator it3 = c1072ab.m617k(str3, "@define ").iterator();
                while (it3.hasNext()) {
                    String str4 = (String) it3.next();
                    String trim2 = str4.substring("@define ".length()).trim();
                    try {
                        C0447e.m3574a(trim2);
                        if (c1072ab.m629f(trim2)) {
                            throw new C0412bm("[" + str3 + "]" + str4 + ": A section already has that name");
                        }
                        String m631e2 = c1072ab.m631e(str3, str4);
                        if (m631e2.contains("${")) {
                            throw new C0412bm("[" + str3 + "]" + str4 + " has dynamic value: '" + m631e2 + "', this is not yet supported");
                        }
                        m3586b.f2826b.m3575a(trim2, m631e2);
                    } catch (C0412bm e2) {
                        throw new C0412bm("[" + str3 + "]" + str4 + ": " + e2.getMessage());
                    }
                }
                Map map = (Map) m637d.get(str3);
                for (String str5 : map.keySet()) {
                    String str6 = (String) map.get(str5);
                    if (str6 != null && str6.contains("${")) {
                        int i2 = 0;
                        StringBuffer stringBuffer = new StringBuffer();
                        Matcher matcher = f2822a.matcher(str6);
                        while (matcher.find()) {
                            i2++;
                            if (i2 > 100) {
                                throw new C0412bm("[" + str3 + "]" + str5 + ": Too many loops while parsing");
                            }
                            String group = matcher.group(1);
                            i++;
                            try {
                                String m3588a = m3586b.m3588a(c0453l, c1072ab, str3, group);
                                if (!group.equals(m3588a)) {
                                }
                                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(m3588a));
                            } catch (C0412bm e3) {
                                e3.printStackTrace();
                                throw new C0412bm("[" + str3 + "]" + str5 + ": " + e3.getMessage());
                            }
                        }
                        matcher.appendTail(stringBuffer);
                        arrayList.add(new C0445c(str3, str5, stringBuffer.toString()));
                    }
                }
                continue;
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C0445c c0445c = (C0445c) it4.next();
            c1072ab.m630e(c0445c.f2830a, c0445c.f2831b, c0445c.f2832c);
        }
        arrayList.clear();
    }
}
