package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.C0648am;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.corrodinggames.rts.gameFramework.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at.class */
public abstract class EnumC0659at {

    /* renamed from: d */
    String[] f4221d;

    /* renamed from: a */
    public static final EnumC0659at f4218a = new C06601("starting", 0);

    /* renamed from: b */
    public static final EnumC0659at f4219b = new C06612("buildup", 1);

    /* renamed from: c */
    public static final EnumC0659at f4220c = new C06623("attacked", 2);

    /* renamed from: e */
    private static final /* synthetic */ EnumC0659at[] f4222e = {f4218a, f4219b, f4220c};

    /* renamed from: d */
    abstract String m2646d();

    public static EnumC0659at[] values() {
        return (EnumC0659at[]) f4222e.clone();
    }

    public static EnumC0659at valueOf(String str) {
        return (EnumC0659at) Enum.valueOf(EnumC0659at.class, str);
    }

    private EnumC0659at(String str, int i) {
    }

    /* synthetic */ EnumC0659at(String str, int i, C0648am.C06491 c06491) {
        this(str, i);
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.at$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at$1.class */
    enum C06601 extends EnumC0659at {
        C06601(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: d */
        String m2645d() {
            return "music/starting";
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.at$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at$2.class */
    enum C06612 extends EnumC0659at {
        C06612(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: d */
        String m2644d() {
            return "music/buildup";
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.at$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at$3.class */
    enum C06623 extends EnumC0659at {
        C06623(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: d */
        String m2643d() {
            return "music/attacked";
        }
    }

    /* renamed from: a */
    void m2650a() {
        this.f4221d = C0750a.m2239a(m2646d(), false);
        if (this.f4221d == null) {
            this.f4221d = new String[0];
            LoggerMaybe.m951n("Failed to open music folder: " + m2646d());
            return;
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ArrayList arrayList = new ArrayList();
        for (String str : this.f4221d) {
            String m2216n = C0750a.m2216n(str);
            if (C0648am.m2664a(m2649a(m2216n), true) != null) {
                LoggerMaybe.LogDebug2("Loaded track:" + m2216n);
                arrayList.add(m2216n);
            } else {
                LoggerMaybe.m990b("Skipping track:" + m2216n);
            }
            m1079A.m1032a("music", false);
        }
        this.f4221d = (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String[] m2648b() {
        return this.f4221d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m2647c() {
        f4218a.m2650a();
        f4219b.m2650a();
        f4220c.m2650a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m2649a(String str) {
        return m2646d() + "/" + str;
    }
}
