package com.corrodinggames.rts.gameFramework.p036e;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;

/* renamed from: com.corrodinggames.rts.gameFramework.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/e.class */
public class C0754e extends C0752c {

    /* renamed from: g */
    C0752c f4882g;

    /* renamed from: h */
    C0752c f4883h;

    /* renamed from: i */
    String f4884i;

    /* renamed from: j */
    String f4885j;

    public C0754e(C0752c c0752c, String str, C0752c c0752c2, String str2) {
        this.f4882g = c0752c;
        this.f4884i = str;
        this.f4883h = c0752c2;
        this.f4885j = str2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: a */
    public String mo2190a() {
        String mo2190a = this.f4882g.mo2190a();
        String mo2190a2 = this.f4883h.mo2190a();
        if (mo2190a != null) {
            return mo2190a;
        }
        return mo2190a2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: a */
    public void mo2189a(String str) {
        this.f4882g.mo2189a(str);
        this.f4883h.mo2189a(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: a */
    public String mo2188a(String str, String str2) {
        return m2173t(str).mo2188a(str, str2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: b */
    public boolean mo2186b(String str) {
        return m2173t(str).mo2186b(m2175r(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: c */
    public boolean mo2185c(String str) {
        return m2173t(str).mo2185c(m2175r(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: d */
    public String mo2184d(String str) {
        return m2173t(str).mo2184d(m2175r(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: f */
    public String mo2182f(String str) {
        return m2173t(str).mo2182f(m2175r(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: e */
    public String mo2183e(String str) {
        return m2173t(str).mo2183e(m2175r(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: g */
    public boolean mo2181g(String str) {
        C0752c m2174s = m2174s(str);
        String m2175r = m2175r(str);
        if (m2174s != null) {
            return m2174s.mo2181g(m2175r(m2175r));
        }
        boolean mo2181g = this.f4882g.mo2181g(m2175r(m2175r));
        if (this.f4883h.mo2181g(m2175r(m2175r))) {
            mo2181g = true;
        }
        return mo2181g;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: h */
    public boolean mo2180h(String str) {
        return m2173t(str).mo2180h(m2175r(str));
    }

    /* renamed from: r */
    private String m2175r(String str) {
        int indexOf;
        int indexOf2;
        if (str == null) {
            return null;
        }
        if (str.indexOf(this.f4884i) != -1) {
            String str2 = str.substring(0, indexOf) + str.substring(indexOf + this.f4884i.length());
            if (str2.contains(this.f4884i) || str2.contains(this.f4885j)) {
                AbstractC0916l.m963e("fixPath: double tag for: " + str);
            }
            return str2;
        }
        if (str.indexOf(this.f4885j) != -1) {
            String str3 = str.substring(0, indexOf2) + str.substring(indexOf2 + this.f4885j.length());
            if (str3.contains(this.f4884i) || str3.contains(this.f4885j)) {
                AbstractC0916l.m963e("fixPath: double tag for: " + str);
            }
            return str3;
        }
        return str;
    }

    /* renamed from: s */
    private C0752c m2174s(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(this.f4884i)) {
            return this.f4882g;
        }
        if (str.contains(this.f4885j)) {
            return this.f4883h;
        }
        return null;
    }

    /* renamed from: t */
    private C0752c m2173t(String str) {
        C0752c m2174s = m2174s(str);
        if (m2174s != null) {
            return m2174s;
        }
        return this.f4882g;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: a */
    public String[] mo2172a(String str, boolean z) {
        C0752c m2174s = m2174s(str);
        String m2175r = m2175r(str);
        if (m2174s != null) {
            return m2174s.mo2172a(m2175r, z);
        }
        String[] mo2172a = this.f4882g.mo2172a(m2175r, z);
        String[] mo2172a2 = this.f4883h.mo2172a(m2175r, z);
        if (mo2172a == null && mo2172a2 == null) {
            return null;
        }
        if (mo2172a == null) {
            mo2172a = new String[0];
        }
        if (mo2172a2 == null) {
            mo2172a2 = new String[0];
        }
        String[] strArr = new String[mo2172a.length + mo2172a2.length];
        for (int i = 0; i < mo2172a.length; i++) {
            strArr[i] = this.f4884i + mo2172a[i];
        }
        for (int i2 = 0; i2 < mo2172a2.length; i2++) {
            strArr[i2 + mo2172a.length] = this.f4885j + mo2172a2[i2];
        }
        return strArr;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: j */
    public C1098j mo2179j(String str) {
        return this.f4882g.mo2179j(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: k */
    public C1098j mo2178k(String str) {
        return m2173t(str).mo2178k(m2175r(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: b */
    public String mo2171b() {
        return this.f4882g.mo2171b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: a */
    public File mo2187a(String str, String str2, boolean z) {
        return m2173t(str).mo2187a(m2175r(str), str2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: n */
    public String mo2177n(String str) {
        return m2173t(str).mo2177n(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: d */
    public String mo2170d() {
        String mo2170d = this.f4882g.mo2170d();
        if (this.f4883h.mo2170d() != null) {
            mo2170d = mo2170d + " and " + this.f4883h.mo2170d();
        }
        return mo2170d;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: e */
    public boolean mo2169e() {
        return this.f4882g.mo2169e() || this.f4883h.mo2169e();
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: p */
    public String mo2176p(String str) {
        if (str.startsWith("/") && this.f4884i.endsWith("/")) {
            return "/" + this.f4884i + str.substring(1);
        }
        return this.f4884i + str;
    }
}
