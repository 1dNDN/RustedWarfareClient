package com.corrodinggames.rts.gameFramework.p036e;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1077ag;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.corrodinggames.rts.gameFramework.e.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/g.class */
public class C0756g {

    /* renamed from: a */
    public static boolean f4886a = true;

    /* renamed from: a */
    public static final String m2168a(char c) {
        return String.valueOf((int) c);
    }

    /* renamed from: a */
    public static String m2166a(String str, char c) {
        if (C0758f.m2083b(str, c)) {
            str = C0758f.m2110a(str, String.valueOf(c), "%" + m2168a(c));
        }
        return str;
    }

    /* renamed from: a */
    public static String m2167a(String str) {
        if (str == null) {
            return "null";
        }
        String m2166a = m2166a(m2166a(m2166a(m2166a(m2166a(m2166a(m2166a(m2166a(m2166a(m2166a(m2166a(C0758f.m2110a(str, "%", "%%"), '/'), '\\'), ':'), '\"'), '\''), '|'), '?'), '*'), '<'), '>'), (char) 0);
        if (m2166a.contains("/")) {
            throw new IllegalArgumentException();
        }
        if (m2166a.contains("\\")) {
            throw new IllegalArgumentException();
        }
        return m2166a;
    }

    /* renamed from: a */
    public static String m2162a(String str, String str2, boolean z) {
        String str3 = C0750a.m2214e() + m2167a(str) + ".cachedata";
        if (z) {
            File file = new File(str3);
            if (!file.isDirectory() && !file.mkdirs()) {
                AbstractC0916l.m963e("Failed to create folder for:" + file.getAbsolutePath());
            }
        }
        return str3 + "/" + m2167a(str2);
    }

    /* renamed from: a */
    public static boolean m2163a(String str, String str2, String str3) {
        try {
            return m2164a(str, str2, new ByteArrayInputStream(str3.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m2164a(String str, String str2, InputStream inputStream) {
        try {
            String m2162a = m2162a(str, str2, true);
            File file = new File(m2162a);
            File file2 = new File(m2162a + ".tmp");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            C0758f.m2123a(inputStream, fileOutputStream);
            fileOutputStream.close();
            if (!C0750a.m2231a(file2, file)) {
                AbstractC0916l.m982b("AddToCache: Failed to rename to final file: " + m2162a);
                return false;
            } else if (f4886a) {
                AbstractC0916l.m963e("Wrote cache file at: " + file.getAbsolutePath());
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static FileInputStream m2165a(String str, String str2) {
        try {
            File file = new File(m2162a(str, str2, false));
            if (!file.exists()) {
                return null;
            }
            file.setLastModified(System.currentTimeMillis());
            return new FileInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m2161b(String str, String str2) {
        FileInputStream m2165a = m2165a(str, str2);
        if (m2165a == null) {
            return null;
        }
        return C0758f.m2124a(m2165a);
    }

    /* renamed from: c */
    public static void m2159c(String str, String str2) {
        String m2162a = m2162a(str, str2, false);
        File file = new File(m2162a);
        if (file.exists() && !file.delete()) {
            AbstractC0916l.m957g("Failed to delete: " + m2162a);
        }
    }

    /* renamed from: b */
    private static C0757h m2160b(String str, String str2, String str3) {
        String[] m2041f;
        String str4 = str2 + ".data";
        String m2161b = m2161b(str, str2 + ".meta");
        if (m2161b != null && (m2041f = C0758f.m2041f(m2161b, ":")) != null) {
            Long m2023m = C0758f.m2023m(m2041f[0]);
            long m2205l = C0750a.m2205l(str2);
            String str5 = m2041f[1];
            if (m2023m == null) {
                if (f4886a) {
                    AbstractC0916l.m963e("openAssetCached: Bad meta data for: " + str2);
                    return null;
                }
                return null;
            } else if (m2023m.longValue() != m2205l) {
                if (f4886a) {
                    AbstractC0916l.m963e("openAssetCached: Stale timestamp for: " + str2 + " (" + m2023m + "!=" + m2205l + ")");
                    return null;
                }
                return null;
            } else if (str5.startsWith("null")) {
                if (f4886a) {
                    AbstractC0916l.m963e("openAssetCached: Cache hit (null-type) for: " + str2 + " (" + m2023m + "!=" + m2205l + ")");
                }
                return new C0757h(null);
            } else if (!str5.startsWith(str3)) {
                if (f4886a) {
                    AbstractC0916l.m963e("openAssetCached: Unsupported type " + str5 + " for: " + str2 + " expected: " + str3);
                }
                return new C0757h(null);
            } else {
                FileInputStream m2165a = m2165a(str, str4);
                if (m2165a != null) {
                    if (f4886a) {
                        AbstractC0916l.m963e("openAssetCached: Cache hit for: " + str2);
                    }
                    return new C0757h(m2165a);
                } else if (f4886a) {
                    AbstractC0916l.m963e("openAssetCached: meta file but not data for: " + str2);
                    return null;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String[] m2158d(String str, String str2) {
        String str3;
        long m2205l;
        if (!C1077ag.m589i(str2)) {
            return C0750a.m2210g(str2);
        }
        String str4 = str2 + ".data";
        String str5 = str2 + ".meta";
        C0757h m2160b = m2160b(str, str2, "list");
        if (m2160b != null) {
            if (m2160b.f4887a == null) {
                return null;
            }
            String m2124a = C0758f.m2124a(m2160b.f4887a);
            m2160b.m2155a();
            return C0758f.m2018r(m2124a);
        }
        String[] m2210g = C0750a.m2210g(str2);
        if (m2210g != null) {
            if (f4886a) {
                AbstractC0916l.m963e("listDirCached: Listing count: " + m2210g.length);
            }
            str3 = "list";
            m2205l = C0750a.m2205l(str2);
            if (m2205l == 0) {
                if (f4886a) {
                    AbstractC0916l.m963e("openAssetCached: Got 0 timestamp for: " + str2 + " cannot cache");
                }
                return m2210g;
            }
            m2163a(str, str4, C0758f.m2103a(m2210g));
        } else {
            if (f4886a) {
                AbstractC0916l.m963e("listDirCached: Null");
            }
            str3 = "null";
            m2205l = C0750a.m2205l(str2);
        }
        m2163a(str, str5, m2205l + ":" + str3);
        return m2210g;
    }

    /* renamed from: e */
    public static InputStream m2157e(String str, String str2) {
        String str3;
        long m2205l;
        String str4 = str2 + ".data";
        String str5 = str2 + ".meta";
        C0757h m2160b = m2160b(str, str2, "data");
        if (m2160b != null) {
            return m2160b.f4887a;
        }
        if (f4886a) {
            AbstractC0916l.m963e("openAssetCached: Cache miss for: " + str2);
        }
        C1098j m2207j = C0750a.m2207j(str2);
        if (m2207j != null) {
            if (f4886a) {
                AbstractC0916l.m963e("openAssetCached: Reading: " + str2);
            }
            str3 = "data";
            m2205l = C0750a.m2205l(str2);
            if (m2205l == 0) {
                if (f4886a) {
                    AbstractC0916l.m963e("openAssetCached: Got 0 timestamp for: " + str2 + " cannot cache");
                }
                return m2207j;
            } else if (!m2164a(str, str4, m2207j)) {
            }
        } else {
            if (f4886a) {
                AbstractC0916l.m963e("openAssetCached: Got null for: " + str2);
            }
            str3 = "null";
            m2205l = C0750a.m2205l(str2);
        }
        m2163a(str, str5, m2205l + ":" + str3);
        if (m2207j == null) {
            return null;
        }
        try {
            m2207j.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream m2165a = m2165a(str, str4);
        if (m2165a == null) {
            AbstractC0916l.m982b("openAssetCached: Error. Failed to reopen cache: " + str2);
            return C0750a.m2207j(str2);
        }
        return m2165a;
    }

    /* renamed from: f */
    public static boolean m2156f(String str, String str2) {
        InputStream m2157e = m2157e(str, str2);
        if (m2157e == null) {
            return false;
        }
        try {
            m2157e.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return true;
        }
    }
}
