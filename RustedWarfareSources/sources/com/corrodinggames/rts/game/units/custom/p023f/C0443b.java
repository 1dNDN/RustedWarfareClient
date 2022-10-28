package com.corrodinggames.rts.game.units.custom.p023f;

import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import java.util.regex.Matcher;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/b.class */
public class C0443b {

    /* renamed from: a */
    public C0446d f2825a;

    /* renamed from: b */
    public C0446d f2826b;

    public C0443b() {
        this.f2825a = new C0446d();
        this.f2826b = new C0446d();
    }

    public C0443b(C0446d c0446d, C0446d c0446d2) {
        this.f2825a = c0446d;
        this.f2826b = c0446d2;
    }

    /* renamed from: a */
    public void m3589a() {
        this.f2825a.m3577a();
        this.f2826b.m3577a();
    }

    /* renamed from: b */
    public C0443b m3586b() {
        return new C0443b(this.f2825a, new C0446d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.corrodinggames.rts.game.units.custom.f.b$1] */
    /* renamed from: a */
    public static double m3587a(final String str) {
        return new Object() { // from class: com.corrodinggames.rts.game.units.custom.f.b.1

            /* renamed from: a */
            int f2827a = -1;

            /* renamed from: b */
            int f2828b;

            /* renamed from: a */
            void m3583a() {
                int i = this.f2827a + 1;
                this.f2827a = i;
                this.f2828b = i < str.length() ? str.charAt(this.f2827a) : (char) 65535;
            }

            /* renamed from: a */
            boolean m3582a(int i) {
                while (this.f2828b == 32) {
                    m3583a();
                }
                if (this.f2828b == i) {
                    m3583a();
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            double m3581b() {
                m3583a();
                double m3580c = m3580c();
                if (this.f2827a < str.length()) {
                    throw new RuntimeException("Unexpected: " + ((char) this.f2828b));
                }
                return m3580c;
            }

            /* renamed from: c */
            double m3580c() {
                double m3579d = m3579d();
                while (true) {
                    double d = m3579d;
                    if (m3582a(43)) {
                        m3579d = d + m3579d();
                    } else if (!m3582a(45)) {
                        return d;
                    } else {
                        m3579d = d - m3579d();
                    }
                }
            }

            /* renamed from: d */
            double m3579d() {
                double m3578e = m3578e();
                while (true) {
                    double d = m3578e;
                    if (m3582a(42)) {
                        m3578e = d * m3578e();
                    } else if (m3582a(47)) {
                        m3578e = d / m3578e();
                    } else if (!m3582a(37)) {
                        return d;
                    } else {
                        m3578e = d % m3578e();
                    }
                }
            }

            /* renamed from: e */
            double m3578e() {
                double d;
                if (m3582a(43)) {
                    return m3578e();
                }
                if (m3582a(45)) {
                    return -m3578e();
                }
                int i = this.f2827a;
                if (m3582a(40)) {
                    d = m3580c();
                    m3582a(41);
                } else if ((this.f2828b >= 48 && this.f2828b <= 57) || this.f2828b == 46) {
                    while (true) {
                        if ((this.f2828b < 48 || this.f2828b > 57) && this.f2828b != 46) {
                            break;
                        }
                        m3583a();
                    }
                    d = Double.parseDouble(str.substring(i, this.f2827a));
                } else if (this.f2828b >= 97 && this.f2828b <= 122) {
                    while (this.f2828b >= 97 && this.f2828b <= 122) {
                        m3583a();
                    }
                    String substring = str.substring(i, this.f2827a);
                    double m3578e = m3578e();
                    if (substring.equals("sqrt")) {
                        d = Math.sqrt(m3578e);
                    } else if (substring.equals("sin")) {
                        d = Math.sin(Math.toRadians(m3578e));
                    } else if (substring.equals("cos")) {
                        d = Math.cos(Math.toRadians(m3578e));
                    } else if (substring.equals("tan")) {
                        d = Math.tan(Math.toRadians(m3578e));
                    } else if (!substring.equals("int")) {
                        throw new RuntimeException("Unknown function: " + substring);
                    } else {
                        d = (int) m3578e;
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + ((char) this.f2828b));
                }
                if (m3582a(94)) {
                    d = Math.pow(d, m3578e());
                }
                return d;
            }
        }.m3581b();
    }

    /* renamed from: b */
    public boolean m3584b(String str) {
        return str.contains("*") || str.contains("/") || str.contains("+") || str.contains("-") || str.contains("(") || str.contains(")") || str.contains("^") || str.contains("%");
    }

    /* renamed from: a */
    public String m3588a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        String trim = str2.trim();
        boolean m3584b = m3584b(trim);
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = C0442a.f2823b.matcher(trim);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                throw new C0412bm("Too many loops while parsing");
            }
            String group = matcher.group(0);
            if (!C0758f.m2015u(group) && !group.equals("int") && !group.equals("cos") && !group.equals("sin") && !group.equals("sqrt")) {
                String m3585b = m3585b(c0453l, c1072ab, str, group);
                if (m3584b && !C0758f.m2015u(m3585b)) {
                    throw new C0412bm("Cannot do maths on '" + m3585b + "' from " + group + " (not a number)");
                }
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(m3585b));
            }
        }
        matcher.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        if (m3584b) {
            stringBuffer2 = C0758f.m2101b(m3587a(stringBuffer2));
        }
        return stringBuffer2;
    }

    /* renamed from: b */
    public String m3585b(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        if (str2.contains(".")) {
            String[] m2068c = C0758f.m2068c(str2, '.');
            if (m2068c.length != 2) {
                throw new C0412bm("Unexpected key format: " + str2);
            }
            String str3 = m2068c[0];
            String str4 = m2068c[1];
            if (str3.equals("section")) {
                str3 = str;
            }
            String m644b = c1072ab.m644b(str3, str4, (String) null);
            if (m644b == null) {
                if (str3.equalsIgnoreCase("self")) {
                    throw new C0412bm("Static $ block: Could not find: [" + str3 + "]" + str4 + " in this conf file. Hint: You might have wanted % instead of $ for a dynamic string");
                }
                throw new C0412bm("Static $ block: Could not find: [" + str3 + "]" + str4 + " in this conf file");
            } else if (m644b.contains("${")) {
                throw new C0412bm("Reference [" + str3 + "]" + str4 + " is dynamic, chaining is not yet supported");
            } else {
                return m644b;
            }
        }
        String m3576a = this.f2826b.m3576a(str2);
        if (m3576a != null) {
            return m3576a;
        }
        String m3576a2 = this.f2825a.m3576a(str2);
        if (m3576a2 != null) {
            return m3576a2;
        }
        throw new C0412bm("Could not find variable with name: " + str2);
    }
}
