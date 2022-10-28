package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.a.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/n.class */
public class C0085n {
    /* renamed from: a */
    public void m4823a() {
        AbstractC0916l.m963e("Running unit tests");
        new C0075d().m4840a();
        new C0082k().m4831a();
        new C0076e().m4839a();
        new C0072a().m4857a();
        new C0077f().m4834a();
        new C0074c().m4854a();
        new C0084m().m4828a();
    }

    /* renamed from: a */
    public static void m4818a(boolean z) {
        if (!z) {
            throw new RuntimeException("Asset failed");
        }
    }

    /* renamed from: b */
    public static void m4816b(boolean z) {
        if (z) {
            throw new RuntimeException("Asset failed");
        }
    }

    /* renamed from: a */
    public static void m4821a(int i, int i2) {
        if (i != i2) {
            throw new RuntimeException("Asset failed (int):" + i + "!=" + i2);
        }
    }

    /* renamed from: a */
    public static void m4822a(float f, float f2) {
        if (C0758f.m2075c(f - f2) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + f + "!=" + f2);
        }
    }

    /* renamed from: a */
    public static void m4819a(String str, String str2) {
        if (!str.equals(str2)) {
            throw new RuntimeException("Asset failed:" + str + "!=" + str2);
        }
    }

    /* renamed from: b */
    public static void m4817b(String str, String str2) {
        AbstractC0916l.m963e("assertEqualDebug:'" + str + "' vs '" + str2 + "'");
        m4819a(str, str2);
    }

    /* renamed from: c */
    public static void m4815c(String str, String str2) {
        m4822a(Float.valueOf(Float.parseFloat(str)).floatValue(), Float.valueOf(Float.parseFloat(str2)).floatValue());
    }

    /* renamed from: a */
    public static void m4820a(Object obj, Object obj2) {
        if (obj != obj2) {
            throw new RuntimeException("Asset failed:" + obj + "!=" + obj2);
        }
    }
}
