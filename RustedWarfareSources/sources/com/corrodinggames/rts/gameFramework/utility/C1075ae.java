package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.p048a.C1068a;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ae.class */
public class C1075ae {

    /* renamed from: a */
    static Object f6838a = new Object();

    /* renamed from: b */
    static C1077ag f6839b = new C1077ag();

    /* renamed from: c */
    static AbstractC1076af f6840c;

    /* renamed from: a */
    public static boolean m609a() {
        if (AbstractC0916l.m996as()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static AbstractC1076af m608a(String str) {
        if (C1077ag.m589i(str)) {
            return f6839b;
        }
        if (m609a() && C1068a.m708l(str)) {
            if (f6840c == null) {
                synchronized (f6838a) {
                    if (f6840c == null) {
                        f6840c = new C1068a();
                    }
                }
            }
            return f6840c;
        }
        return null;
    }

    /* renamed from: b */
    public static AbstractC1076af m606b(String str) {
        if (m609a() && C1068a.m708l(str)) {
            if (f6840c == null) {
                synchronized (f6838a) {
                    if (f6840c == null) {
                        f6840c = new C1068a();
                    }
                }
            }
            return f6840c;
        }
        return null;
    }

    /* renamed from: c */
    public static void m605c(String str) {
        if (f6839b != null && C1077ag.m589i(str)) {
            f6839b.m587k(str);
        }
    }

    /* renamed from: b */
    public static void m607b() {
        if (f6839b != null) {
            f6839b.mo604a();
        }
        if (f6840c != null) {
            f6840c.mo604a();
        }
    }
}
