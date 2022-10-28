package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ap.class */
public class C0857ap {

    /* renamed from: a */
    public static C0857ap f5717a = new C0857ap();

    /* renamed from: b */
    public static int f5718b = 2;

    /* renamed from: c */
    static int f5719c = 3;

    /* renamed from: d */
    static int f5720d = 2;

    /* renamed from: e */
    static int f5721e = 3;

    /* renamed from: f */
    public static int f5722f = 4;

    /* renamed from: g */
    static String f5723g = "tx";

    /* renamed from: h */
    static String f5724h = "_";

    /* renamed from: i */
    public static int f5725i = 55;

    /* renamed from: j */
    public static int f5726j = 66;

    /* renamed from: k */
    public static int f5727k = 100;

    /* renamed from: l */
    public static boolean f5728l = true;

    /* renamed from: a */
    public static float m1394a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public void m1392a(String str, List list) {
        long m1059U = LoggerMaybe.m1059U();
        C0879n.m1258a(list, f5724h + "1", VariableScope.nullOrMissingString + m1059U);
        C0879n.m1258a(list, f5723g + "2", C0758f.m2072d("_" + str + (f5718b + f5719c)));
        C0879n.m1258a(list, f5723g + "3", C0758f.m2072d("_" + str + (f5718b + f5719c + m1059U)));
    }

    /* renamed from: b */
    public void m1391b(String str, List list) {
        C0879n.m1258a(list, f5723g + "3", C0758f.m2072d("-" + str + (f5720d + f5721e) + f5722f));
    }

    /* renamed from: c */
    public void m1390c(String str, List list) {
        if (f5722f > 1000) {
            C0879n.m1258a(list, f5723g + "4", C0758f.m2072d("+" + str + (f5720d + f5721e) + f5722f));
        }
    }

    /* renamed from: a */
    public static void m1393a(Steam steam) {
        if (steam.f5805N) {
            LoggerMaybe.m1059U();
            if (LoggerMaybe.m1079A().f6239bx > -5) {
                steam.f5806O = C0758f.m2160a(0.0f, 0.0f, (float) f5727k, 0.0f) > 10.0f;
            }
        }
    }
}
