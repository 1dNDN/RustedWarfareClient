package com.corrodinggames.rts.gameFramework.p036e;

import android.content.Context;
import android.os.Build;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    protected static String m2248a() {
        File mo5606b = C0090c.m5245a().mo5606b(null);
        if (mo5606b != null) {
            return mo5606b.getAbsolutePath();
        }
        LoggerMaybe.m990b("Failed to get an internal path.");
        return null;
    }

    /* renamed from: b */
    public static void m2237b() {
        f4869e = null;
        if (LoggerMaybe.m1004as()) {
            if (Build.VERSION.SDK_INT < 19) {
                f4869e = "Android version too old for new file system support";
                LoggerMaybe.LogDebug2("FileLoader: SDK too old, not changing FileLoader");
                return;
            }
            int i = LoggerMaybe.m1079A().f6115bQ.storageType;
            LoggerMaybe.LogDebug2("FileLoader: storageBehaviour:" + i);
            C0752c m2247a = m2247a(i);
            LoggerMaybe.LogDebug2("Using file loader: " + m2247a.mo2183d());
            f4866b = m2247a;
        }
    }

    /* renamed from: a */
    public static boolean m2242a(String str) {
        return f4866b.m2204q(str);
    }

    /* renamed from: a */
    public static C0751b m2238a(boolean z) {
        C0751b c0751b = new C0751b();
        if (!LoggerMaybe.m1004as()) {
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
                LoggerMaybe.m990b("FileLoader using direct external access due to sdk: " + Build.VERSION.SDK_INT);
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
    public static C0752c m2247a(int i) {
        C0753d c0753d;
        C0754e c0754e;
        if (!LoggerMaybe.m1004as()) {
            return new C0752c();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            String m2248a = m2248a();
            C0753d c0753d2 = null;
            if (m2248a == null) {
                f4869e = "Failed to get internal app path (is it unmounted?).";
                i = 3;
            } else {
                c0753d2 = new C0753d(m2248a, "internal");
                c0753d2.f4881i = "Internal: ";
            }
            C0751b m2238a = m2238a(false);
            if (!m2238a.f4870a) {
                if (!m2238a.f4872c) {
                    LoggerMaybe.m990b("Not using direct external backend: As direct reads will cause problems");
                    c0753d = null;
                    i = 0;
                } else {
                    LoggerMaybe.m990b("FileLoader using direct external file access! SDK:" + Build.VERSION.SDK_INT);
                    c0753d = new C0752c();
                }
            } else {
                LoggerMaybe.LogDebug2("FileLoader using overriddenExternalPath:" + f4868d);
                c0753d = new C0753d(f4868d, "external");
            }
            C0755f c0755f = new C0755f();
            if (i != 3 && c0753d2 == null) {
                LoggerMaybe.m990b("No available file backends!!");
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
        LoggerMaybe.LogDebug2("FileLoader: SDK too old, not changing FileLoader");
        return new C0752c();
    }

    /* renamed from: c */
    public static String m2232c() {
        return f4866b.mo2203a();
    }

    /* renamed from: b */
    public static void m2234b(String str) {
        f4866b.mo2202a(str);
    }

    /* renamed from: a */
    public static String m2241a(String str, String str2) {
        return f4866b.mo2201a(str, str2);
    }

    /* renamed from: c */
    public static boolean m2230c(String str) {
        return f4866b.mo2199b(str);
    }

    /* renamed from: d */
    public static String m2228d(String str) {
        return f4866b.mo2196e(str);
    }

    /* renamed from: e */
    public static String m2226e(String str) {
        return f4866b.mo2195f(str);
    }

    /* renamed from: f */
    public static boolean m2224f(String str) {
        return f4866b.mo2194g(str);
    }

    /* renamed from: g */
    public static String[] m2223g(String str) {
        return f4866b.mo2185a(str, false);
    }

    /* renamed from: a */
    public static String[] m2239a(String str, boolean z) {
        return f4866b.mo2185a(str, z);
    }

    /* renamed from: h */
    public static boolean m2222h(String str) {
        return f4866b.mo2193h(str);
    }

    /* renamed from: i */
    public static C1098j m2221i(String str) {
        return f4866b.mo2192j(str);
    }

    /* renamed from: a */
    public static C1098j m2245a(File file) {
        return f4866b.mo2191k(file.getAbsolutePath());
    }

    /* renamed from: j */
    public static C1098j m2220j(String str) {
        return f4866b.mo2191k(str);
    }

    /* renamed from: a */
    public static OutputStream m2243a(File file, boolean z) {
        return f4866b.m2211b(file.getAbsolutePath(), z);
    }

    /* renamed from: b */
    public static OutputStream m2233b(String str, boolean z) {
        return f4866b.m2211b(str, z);
    }

    /* renamed from: k */
    public static boolean m2219k(String str) {
        return f4866b.m2207l(str);
    }

    /* renamed from: d */
    public static String m2229d() {
        return f4866b.mo2184b();
    }

    /* renamed from: e */
    public static String m2227e() {
        return f4866b.m2210c();
    }

    /* renamed from: l */
    public static long m2218l(String str) {
        return f4866b.m2206m(str);
    }

    /* renamed from: a */
    public static File m2240a(String str, String str2, boolean z) {
        return f4866b.mo2200a(str, str2, z);
    }

    /* renamed from: a */
    public static boolean m2244a(File file, File file2) {
        if (LoggerMaybe.m1002au() && file2.exists()) {
            file2.delete();
        }
        if (!file.renameTo(file2)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m2235b(File file, File file2) {
        return f4866b.m2213a(file, file2);
    }

    /* renamed from: b */
    public static boolean m2236b(File file) {
        return f4866b.m2212b(file);
    }

    /* renamed from: m */
    public static String m2217m(String str) {
        return f4866b.mo2190n(str);
    }

    /* renamed from: f */
    public static boolean m2225f() {
        return f4866b.mo2182e();
    }

    /* renamed from: n */
    public static String m2216n(String str) {
        return f4866b.m2205o(str);
    }

    /* renamed from: o */
    public static String m2215o(String str) {
        return f4866b.mo2189p(str);
    }

    /* renamed from: a */
    public static File m2246a(Context context, String str, String str2) {
        try {
            return File.createTempFile(str, str2, context.mo5598i());
        } catch (IOException e) {
            try {
                return File.createTempFile(str, str2, context.mo5597j());
            } catch (IOException e2) {
                e.printStackTrace();
                throw e2;
            }
        }
    }

    /* renamed from: c */
    public static void m2231c(File file) {
        f4866b.m2214a(file);
    }
}
