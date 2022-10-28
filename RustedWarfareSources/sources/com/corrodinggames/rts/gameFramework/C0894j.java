package com.corrodinggames.rts.gameFramework;

import java.io.File;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j.class */
public class C0894j {

    /* renamed from: a */
    static ConcurrentHashMap f5909a = new ConcurrentHashMap();

    /* renamed from: b */
    static C0912k f5910b;

    /* renamed from: a */
    public static long m1237a(String str, boolean z) {
        Long l = (Long) f5909a.get(str);
        if (l != null) {
            return l.longValue();
        }
        Long valueOf = Long.valueOf(m1238a(str));
        if (!z) {
            f5909a.put(str, valueOf);
            if (f5910b == null) {
            }
        }
        return valueOf.longValue();
    }

    /* renamed from: a */
    private static long m1238a(String str) {
        return new File(str).lastModified();
    }

    /* renamed from: a */
    public static synchronized void m1239a() {
        m1236a(LoggerMaybe.m1079A().f6115bQ.liveReloading);
    }

    /* renamed from: a */
    public static synchronized void m1236a(boolean z) {
        if (!LoggerMaybe.m1002au()) {
            return;
        }
        if (z) {
            if (f5910b != null) {
                LoggerMaybe.LogDebug2("FileChangeEngine: Already running");
                return;
            }
            LoggerMaybe.LogDebug2("FileChangeEngine: Starting");
            f5910b = new C0912k();
            f5910b.start();
        } else if (f5910b != null) {
            f5910b.f6076a = false;
            f5910b = null;
        }
    }

    /* renamed from: b */
    public static void m1235b() {
        int i = 0;
        Enumeration keys = f5909a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            long m1238a = m1238a(str);
            Long l = (Long) f5909a.get(str);
            if (l == null) {
                LoggerMaybe.LogDebug2("FileChangeEngine: old lastModified null for " + str);
            } else if (l.longValue() != m1238a) {
                LoggerMaybe.LogDebug2("FileChangeEngine: Detected change to:" + str + " now " + m1238a);
            }
            f5909a.put(str, Long.valueOf(m1238a));
            i++;
            if (i > 50) {
                i = 0;
                try {
                    Thread.sleep(2L);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
