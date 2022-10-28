package com.corrodinggames.rts.gameFramework.p036e;

import android.content.Context;
import android.os.Build;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/a.class */
public class C0750a {

    /* renamed from: a */
    public static final C0752c f4865a = new C0752c();

    /* renamed from: b */
    public static C0752c f4866b = f4865a;

    /* renamed from: c */
    public static Boolean f4867c;

    /* renamed from: d */
    public static String f4868d;

    /* renamed from: e */
    public static String f4869e;

    /* renamed from: a */
    protected static String m2297a() {
        File mo6016b = C0090c.m5652a().mo6016b(null);
        if (mo6016b != null) {
            return mo6016b.getAbsolutePath();
        }
        Core.m998b("Failed to get an internal path.");
        return null;
    }

    /* renamed from: b */
    public static void m2286b() {
        f4869e = null;
        if (Core.m1012as()) {
            if (Build.VERSION.SDK_INT < 19) {
                f4869e = "Android version too old for new file system support";
                Core.LogDebug2("FileLoader: SDK too old, not changing FileLoader");
                return;
            }
            int i = Core.m1087A().settingEngine.storageType;
            Core.LogDebug2("FileLoader: storageBehaviour:" + i);
            C0752c m2296a = m2296a(i);
            Core.LogDebug2("Using file loader: " + m2296a.mo2232d());
            f4866b = m2296a;
        }
    }

    /* renamed from: a */
    public static boolean m2291a(String str) {
        return f4866b.m2253q(str);
    }

    /* renamed from: a */
    public static C0751b m2287a(boolean z) {
        C0751b c0751b = new C0751b();
        if (!Core.m1012as()) {
            c0751b.f4871b = false;
            c0751b.f4872c = true;
            return c0751b;
        } else if (Build.VERSION.SDK_INT < 19) {
            c0751b.f4871b = false;
            c0751b.f4872c = true;
            return c0751b;
        } else {
            c0751b.f4871b = true;
            c0751b.f4870a = false;
            if (f4868d != null) {
                c0751b.f4870a = true;
            }
            if (f4867c != null && !f4867c.booleanValue()) {
                c0751b.f4872c = true;
                c0751b.f4871b = false;
                c0751b.f4870a = false;
            }
            if (Build.VERSION.SDK_INT <= 28 && f4867c == null) {
                Core.m998b("FileLoader using direct external access due to sdk: " + Build.VERSION.SDK_INT);
                c0751b.f4872c = true;
                c0751b.f4871b = false;
                c0751b.f4870a = false;
            }
            return c0751b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.corrodinggames.rts.gameFramework.e.c] */
    /* renamed from: a */
    public static C0752c m2296a(int i) {
        C0753d c0753d;
        C0754e c0754e;
        if (!Core.m1012as()) {
            return new C0752c();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            String m2297a = m2297a();
            C0753d c0753d2 = null;
            if (m2297a == null) {
                f4869e = "Failed to get internal app path (is it unmounted?).";
                i = 3;
            } else {
                c0753d2 = new C0753d(m2297a, "internal");
                c0753d2.f4881i = "Internal: ";
            }
            C0751b m2287a = m2287a(false);
            if (!m2287a.f4870a) {
                if (!m2287a.f4872c) {
                    Core.m998b("Not using direct external backend: As direct reads will cause problems");
                    c0753d = null;
                    i = 0;
                } else {
                    Core.m998b("FileLoader using direct external file access! SDK:" + Build.VERSION.SDK_INT);
                    c0753d = new C0752c();
                }
            } else {
                Core.LogDebug2("FileLoader using overriddenExternalPath:" + f4868d);
                c0753d = new C0753d(f4868d, "external");
            }
            C0755f c0755f = new C0755f();
            if (i != 3 && c0753d2 == null) {
                Core.m998b("No available file backends!!");
                return c0755f;
            }
            if (i == 1) {
                c0754e = new C0754e(c0753d2, "[INTERNAL-PATH]/", c0753d, "[EXTERNAL-PATH]/");
            } else if (i == 2) {
                c0754e = new C0754e(c0753d, "[EXTERNAL-PATH]/", c0753d2, "[INTERNAL-PATH]/");
            } else if (i == 3) {
                c0754e = new C0754e(c0753d, "[EXTERNAL-PATH]/", c0755f, "[NULL-PATH]/");
            } else {
                c0754e = new C0754e(c0753d2, "[INTERNAL-PATH]/", c0755f, "[NULL-PATH]/");
            }
            c0754e.f4883h.f4876d = true;
            return c0754e;
        }
        Core.LogDebug2("FileLoader: SDK too old, not changing FileLoader");
        return new C0752c();
    }

    /* renamed from: c */
    public static String m2281c() {
        return f4866b.mo2252a();
    }

    /* renamed from: b */
    public static void m2283b(String str) {
        f4866b.mo2251a(str);
    }

    /* renamed from: a */
    public static String m2290a(String str, String str2) {
        return f4866b.mo2250a(str, str2);
    }

    /* renamed from: c */
    public static boolean m2279c(String str) {
        return f4866b.mo2248b(str);
    }

    /* renamed from: d */
    public static String m2277d(String str) {
        return f4866b.mo2245e(str);
    }

    /* renamed from: e */
    public static String m2275e(String str) {
        return f4866b.mo2244f(str);
    }

    /* renamed from: f */
    public static boolean m2273f(String str) {
        return f4866b.mo2243g(str);
    }

    /* renamed from: g */
    public static String[] m2272g(String str) {
        return f4866b.mo2234a(str, false);
    }

    /* renamed from: a */
    public static String[] m2288a(String str, boolean z) {
        return f4866b.mo2234a(str, z);
    }

    /* renamed from: h */
    public static boolean m2271h(String str) {
        return f4866b.mo2242h(str);
    }

    /* renamed from: i */
    public static C1098j m2270i(String str) {
        return f4866b.mo2241j(str);
    }

    /* renamed from: a */
    public static C1098j m2294a(File file) {
        return f4866b.mo2240k(file.getAbsolutePath());
    }

    /* renamed from: j */
    public static C1098j m2269j(String str) {
        return f4866b.mo2240k(str);
    }

    /* renamed from: a */
    public static OutputStream m2292a(File file, boolean z) {
        return f4866b.m2260b(file.getAbsolutePath(), z);
    }

    /* renamed from: b */
    public static OutputStream m2282b(String str, boolean z) {
        return f4866b.m2260b(str, z);
    }

    /* renamed from: k */
    public static boolean m2268k(String str) {
        return f4866b.m2256l(str);
    }

    /* renamed from: d */
    public static String m2278d() {
        return f4866b.mo2233b();
    }

    /* renamed from: e */
    public static String m2276e() {
        return f4866b.m2259c();
    }

    /* renamed from: l */
    public static long m2267l(String str) {
        return f4866b.m2255m(str);
    }

    /* renamed from: a */
    public static File m2289a(String str, String str2, boolean z) {
        return f4866b.mo2249a(str, str2, z);
    }

    /* renamed from: a */
    public static boolean m2293a(File file, File file2) {
        if (Core.m1010au() && file2.exists()) {
            file2.delete();
        }
        if (!file.renameTo(file2)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m2284b(File file, File file2) {
        return f4866b.m2262a(file, file2);
    }

    /* renamed from: b */
    public static boolean m2285b(File file) {
        return f4866b.m2261b(file);
    }

    /* renamed from: m */
    public static String m2266m(String str) {
        return f4866b.mo2239n(str);
    }

    /* renamed from: f */
    public static boolean m2274f() {
        return f4866b.mo2231e();
    }

    /* renamed from: n */
    public static String m2265n(String str) {
        return f4866b.m2254o(str);
    }

    /* renamed from: o */
    public static String m2264o(String str) {
        return f4866b.mo2238p(str);
    }

    /* renamed from: a */
    public static File m2295a(Context context, String str, String str2) {
        try {
            return File.createTempFile(str, str2, context.mo6008i());
        } catch (IOException e) {
            try {
                return File.createTempFile(str, str2, context.mo6007j());
            } catch (IOException e2) {
                e.printStackTrace();
                throw e2;
            }
        }
    }

    /* renamed from: c */
    public static void m2280c(File file) {
        f4866b.m2263a(file);
    }
}
