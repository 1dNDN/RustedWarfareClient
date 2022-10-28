package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am.class */
public class C0648am {

    /* renamed from: e */
    C0663au f4164e;

    /* renamed from: k */
    AbstractC0658as f4165k;

    /* renamed from: l */
    boolean f4166l;

    /* renamed from: m */
    String f4167m;

    /* renamed from: n */
    boolean f4168n;

    /* renamed from: o */
    boolean f4169o;

    /* renamed from: p */
    float f4170p;

    /* renamed from: q */
    float f4171q;

    /* renamed from: r */
    float f4172r;

    /* renamed from: s */
    public boolean f4173s;

    /* renamed from: t */
    public String f4174t;

    /* renamed from: u */
    public boolean f4175u;

    /* renamed from: v */
    String f4176v;

    /* renamed from: w */
    Context f4177w;

    /* renamed from: x */
    boolean f4178x;

    /* renamed from: y */
    boolean f4179y;

    /* renamed from: z */
    int f4180z;

    /* renamed from: A */
    AbstractC0658as f4181A;

    /* renamed from: B */
    boolean f4182B;

    /* renamed from: C */
    boolean f4183C;

    /* renamed from: D */
    float f4184D;

    /* renamed from: H */
    float f4185H;

    /* renamed from: L */
    boolean f4186L;

    /* renamed from: M */
    boolean f4187M;

    /* renamed from: a */
    public static AbstractC0656aq f4188a = new C0651an();

    /* renamed from: J */
    static HashMap f4189J = new HashMap();

    /* renamed from: K */
    static int f4190K = 0;

    /* renamed from: b */
    Object f4191b = new Object();

    /* renamed from: c */
    Object f4192c = new Object();

    /* renamed from: d */
    volatile float f4193d = 1.0f;

    /* renamed from: f */
    volatile boolean f4194f = false;

    /* renamed from: g */
    volatile boolean f4195g = true;

    /* renamed from: h */
    float f4196h = 0.0f;

    /* renamed from: i */
    int f4197i = 0;

    /* renamed from: j */
    boolean f4198j = false;

    /* renamed from: E */
    boolean f4199E = false;

    /* renamed from: F */
    public boolean f4200F = false;

    /* renamed from: G */
    boolean f4201G = false;

    /* renamed from: I */
    ArrayList f4202I = new ArrayList();

    /* renamed from: N */
    long f4203N = -1;

    /* renamed from: a */
    public float m2670a() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        return m1079A.f6115bQ.musicVolume * m1079A.f6115bQ.masterVolume;
    }

    /* renamed from: b */
    public boolean m2663b() {
        return (LoggerMaybe.m1000aw() || this.f4175u || m2670a() <= 0.01f) ? false : true;
    }

    /* renamed from: a */
    public void m2668a(Context context) {
        this.f4177w = context;
        if (LoggerMaybe.m1000aw()) {
            return;
        }
        f4188a.mo103a(this);
        this.f4165k = f4188a.mo106a();
        this.f4181A = f4188a.mo106a();
        EnumC0659at.m2647c();
        if (f4188a.mo99d()) {
            this.f4164e = new C0663au(this);
            this.f4164e.start();
        }
    }

    /* renamed from: c */
    public void m2660c() {
        if (!LoggerMaybe.m1002au()) {
            this.f4166l = false;
            this.f4167m = null;
            this.f4178x = true;
            this.f4182B = false;
        }
        this.f4179y = true;
        this.f4175u = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC0657ar m2664a(String str, boolean z) {
        AbstractC0657ar abstractC0657ar = (AbstractC0657ar) f4189J.get(str);
        if (abstractC0657ar != null) {
            return abstractC0657ar;
        }
        try {
            AbstractC0657ar mo102a = f4188a.mo102a(str);
            if (z) {
                f4189J.put(str, mo102a);
            }
            return mo102a;
        } catch (ArithmeticException e) {
            f4190K++;
            LoggerMaybe.m1033a("Error loading:" + str, (Throwable) e);
            if (f4190K > 2 && f4190K <= 4) {
                LoggerMaybe.m1079A().m961i("Failed to load music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e);
            }
            return null;
        } catch (Exception e2) {
            f4190K++;
            LoggerMaybe.m1033a("Exception loading:" + str, (Throwable) e2);
            if (f4190K > 2 && f4190K <= 4) {
                LoggerMaybe.m1079A().m961i("Unknown error loading music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e2);
            }
            return null;
        } catch (OutOfMemoryError e3) {
            f4190K++;
            LoggerMaybe.m1033a("OutOfMemoryError loading:" + str, e3);
            LoggerMaybe.m1026aB();
            System.gc();
            LoggerMaybe.m1026aB();
            if (f4190K < 3) {
                LoggerMaybe.m1079A().m961i("Ran out of memory loading music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e3);
            }
            return null;
        }
    }

    /* renamed from: d */
    public ArrayList m2658d() {
        ArrayList arrayList = new ArrayList();
        for (String str : EnumC0659at.f4218a.m2648b()) {
            arrayList.add(str);
        }
        for (String str2 : EnumC0659at.f4219b.m2648b()) {
            arrayList.add(str2);
        }
        for (String str3 : EnumC0659at.f4218a.m2648b()) {
            arrayList.add(str3);
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m2667a(EnumC0659at enumC0659at) {
        return m2666a(enumC0659at, enumC0659at);
    }

    /* renamed from: a */
    public String m2666a(EnumC0659at enumC0659at, EnumC0659at enumC0659at2) {
        EnumC0659at enumC0659at3;
        LoggerMaybe.m1079A();
        if (C0758f.m2084c(enumC0659at.m2648b().length + enumC0659at2.m2648b().length) < enumC0659at.m2648b().length) {
            enumC0659at3 = enumC0659at;
        } else {
            enumC0659at3 = enumC0659at2;
        }
        String[] m2648b = enumC0659at3.m2648b();
        return enumC0659at3.m2649a(m2648b[C0758f.m2084c(m2648b.length)]);
    }

    /* renamed from: e */
    public synchronized void m2657e() {
        this.f4173s = true;
        this.f4175u = false;
        this.f4174t = null;
    }

    /* renamed from: a */
    public synchronized void m2665a(String str) {
        this.f4173s = true;
        this.f4175u = false;
        this.f4174t = str;
    }

    /* renamed from: a */
    public synchronized void m2669a(float f) {
        if (LoggerMaybe.m1000aw()) {
            return;
        }
        if (!f4188a.mo99d()) {
            if (!this.f4186L) {
                m2662b(f);
            }
            this.f4195g = true;
        }
        this.f4203N = LoggerMaybe.m1059U();
        if (LoggerMaybe.m1079A().f6118bT.f4115H.m2690a()) {
            m2657e();
        }
        if (this.f4176v != null) {
            C0831ad.m1546a((String) null, this.f4176v);
            this.f4176v = null;
        }
        if (this.f4170p != m2670a()) {
            this.f4170p = m2670a();
            this.f4169o = true;
        }
        synchronized (this.f4192c) {
            this.f4193d = f;
            if (this.f4186L) {
                if (!this.f4187M) {
                    this.f4187M = true;
                    LoggerMaybe.m951n("Music subsystem crashed, music has been disabled to keep your game running. Please send your logs.");
                }
                return;
            }
            if (!this.f4195g) {
                this.f4196h += f;
                this.f4197i++;
                if (this.f4196h > 320.0f && this.f4197i > 80 && !this.f4198j) {
                    this.f4198j = true;
                    LoggerMaybe.m951n("Lockup detected in music subsystem");
                }
            } else {
                this.f4196h = 0.0f;
                this.f4197i = 0;
            }
            this.f4195g = false;
            this.f4194f = true;
            this.f4192c.notifyAll();
        }
    }

    /* renamed from: b */
    public String m2661b(String str) {
        return C0758f.m2050g(C0758f.m2038k(str)).replace("[noloop]", VariableScope.nullOrMissingString).replace("_", " ");
    }

    /* renamed from: b */
    public boolean m2662b(float f) {
        try {
            m2659c(f);
            return true;
        } catch (Exception e) {
            LoggerMaybe.m1033a("Music system crashed", (Throwable) e);
            this.f4186L = true;
            LoggerMaybe.LogDebug2("Stopping music");
            try {
                m2655g();
                return false;
            } catch (Exception e2) {
                LoggerMaybe.m1033a("crash stopping music", (Throwable) e2);
                return false;
            }
        }
    }

    /* renamed from: c */
    public void m2659c(float f) {
        float m2670a;
        float m2670a2;
        if (LoggerMaybe.m1000aw()) {
            return;
        }
        f4188a.mo105a(f);
        if (!m2663b()) {
            if (this.f4166l && this.f4165k.mo91c()) {
                m2655g();
                this.f4166l = false;
                this.f4182B = false;
                return;
            }
            return;
        }
        boolean z = false;
        if (!this.f4166l) {
            z = true;
        }
        if (this.f4168n) {
            if (!this.f4183C) {
                this.f4171q += f;
            }
            if (this.f4171q > 600.0f) {
                this.f4172r += f;
                if (this.f4172r > 100.0f) {
                    this.f4172r = 0.0f;
                    if (!this.f4166l || !this.f4165k.mo91c()) {
                        z = true;
                        this.f4171q = 0.0f;
                    }
                }
            }
        } else {
            this.f4171q += f;
            if (this.f4171q > 3600.0f) {
                LoggerMaybe.LogDebug2("Next music track, timer:" + this.f4171q);
                z = true;
                this.f4171q = 0.0f;
            }
        }
        if (this.f4179y) {
            C0824b m1757y = C0797f.m1757y();
            if (m1757y != null && m1757y.f5456N) {
                z = true;
            }
            this.f4179y = false;
        }
        if (z || this.f4173s) {
            boolean z2 = this.f4173s;
            String str = this.f4174t;
            if (this.f4173s) {
                LoggerMaybe.LogDebug2("Next music track requested");
                this.f4173s = false;
                this.f4171q = 0.0f;
                this.f4174t = null;
            }
            String str2 = null;
            boolean z3 = false;
            C0824b c0824b = null;
            if (str != null) {
                ArrayList m1655i = LoggerMaybe.m1079A().f6124bZ.m1655i();
                m1655i.addAll(m2658d());
                if (str.endsWith(".ogg") || str.endsWith(".wav")) {
                    m2661b(str);
                }
                Iterator it = m1655i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str3 = (String) it.next();
                    if (m2661b(str3).equalsIgnoreCase(str)) {
                        z3 = true;
                        str2 = str3;
                        break;
                    }
                }
                if (str2 == null) {
                    LoggerMaybe.LogDebug2("Failed to find requested music: " + str);
                }
            }
            C0824b m1757y2 = C0797f.m1757y();
            if (str2 == null && m1757y2 != null && m1757y2.f5458P < 10 && m1757y2.f5456N) {
                ArrayList m1627q = m1757y2.m1627q();
                if (m1627q.size() > 0) {
                    z3 = true;
                    c0824b = m1757y2;
                    str2 = (String) m1627q.get(C0758f.m2154a(0, m1627q.size() - 1));
                    if (z2 || this.f4202I.contains(str2)) {
                        for (int i = 0; i < 30 && (str2.equals(this.f4167m) || this.f4202I.contains(str2)); i++) {
                            str2 = (String) m1627q.get(C0758f.m2154a(0, m1627q.size() - 1));
                            if (i > 20) {
                                this.f4202I.clear();
                            }
                        }
                    }
                    LoggerMaybe.LogDebug2("Playing music from mod:" + m1757y2.m1649a() + " - '" + str2 + "'");
                }
            }
            if (str2 == null) {
                if (this.f4178x) {
                    str2 = m2667a(EnumC0659at.f4218a);
                } else {
                    str2 = m2666a(EnumC0659at.f4219b, EnumC0659at.f4218a);
                }
                if (z2 || this.f4202I.contains(str2)) {
                    for (int i2 = 0; i2 < 30 && (str2.equals(this.f4167m) || this.f4202I.contains(str2)); i2++) {
                        str2 = m2666a(EnumC0659at.f4219b, EnumC0659at.f4218a);
                        if (i2 > 20) {
                            this.f4202I.clear();
                        }
                    }
                }
            }
            if (!str2.equals(this.f4167m)) {
                this.f4167m = str2;
                this.f4178x = false;
                this.f4171q = 0.0f;
                this.f4168n = z3 || str2.contains("[noloop]");
                this.f4202I.add(str2);
                if (this.f4202I.size() > 4) {
                    this.f4202I.remove(0);
                }
                if (z2) {
                    this.f4176v = "Now playing: " + m2661b(str2);
                }
                AbstractC0658as abstractC0658as = this.f4165k;
                this.f4165k = this.f4181A;
                this.f4181A = abstractC0658as;
                try {
                    try {
                        this.f4165k.mo94a(m2664a(str2, false));
                        this.f4165k.mo93a(!this.f4168n);
                        this.f4199E = false;
                        if (!z2 && this.f4182B) {
                            this.f4199E = true;
                        }
                        if (this.f4166l) {
                            this.f4182B = true;
                        }
                        this.f4183C = true;
                        this.f4201G = false;
                        this.f4184D = 1.0f;
                        this.f4166l = true;
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                        if (this.f4180z < 3) {
                            this.f4176v = "Failed to play music track: " + str2;
                            this.f4180z++;
                        }
                        if (c0824b != null) {
                            c0824b.f5458P++;
                            return;
                        }
                        return;
                    }
                } catch (RuntimeException e2) {
                    e2.printStackTrace();
                    if (this.f4180z < 3) {
                        this.f4176v = "Failed to open music track: " + str2;
                        this.f4180z++;
                    }
                    if (c0824b != null) {
                        c0824b.f5458P++;
                        return;
                    }
                    return;
                }
            } else if (z2) {
                LoggerMaybe.LogDebug2("Same music found");
            }
        }
        if (this.f4183C || this.f4169o) {
            boolean mo100c = f4188a.mo100c();
            if (!mo100c) {
                if (this.f4200F) {
                    this.f4184D -= f * 0.1f;
                } else {
                    this.f4184D -= f * 0.006f;
                }
            } else if (this.f4200F) {
                this.f4184D -= f * 0.1f;
            } else if (this.f4199E) {
                this.f4184D -= f * 0.003f;
            } else {
                this.f4184D -= f * 0.008f;
            }
            if (!mo100c) {
                m2670a = this.f4184D * m2670a();
                m2670a2 = (1.0f - this.f4184D) * m2670a();
            } else {
                m2670a = ((this.f4184D * 2.0f) - 1.0f) * m2670a();
                m2670a2 = (1.0f - (this.f4184D * 2.0f)) * m2670a();
            }
            float m2109b = C0758f.m2109b(m2670a, 0.0f, 1.0f);
            float m2109b2 = C0758f.m2109b(m2670a2, 0.0f, 1.0f);
            if (this.f4183C) {
                if (this.f4184D <= 0.0f) {
                    this.f4183C = false;
                    this.f4199E = false;
                    if (this.f4182B && !this.f4201G) {
                        this.f4201G = true;
                        this.f4181A.mo90d();
                    }
                    if (this.f4166l) {
                        this.f4165k.m2651a(m2670a(), m2670a());
                    }
                } else {
                    this.f4185H += f;
                    if (this.f4185H > 10.0f) {
                        this.f4185H = 0.0f;
                        if (this.f4182B && !this.f4201G) {
                            this.f4181A.m2651a(m2109b, m2109b);
                            if (m2109b < 0.02f) {
                                this.f4201G = true;
                                this.f4181A.mo90d();
                            }
                        }
                        if (this.f4166l) {
                            this.f4165k.m2651a(m2109b2, m2109b2);
                        }
                    }
                }
            } else if (this.f4166l) {
                this.f4165k.m2651a(m2109b2, m2109b2);
            }
        }
        this.f4169o = false;
    }

    /* renamed from: f */
    public void m2656f() {
        Log.LogVerbose("RustedWarfare", "Music:pause()");
        new C06491().start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.am$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am$1.class */
    public class C06491 extends Thread {
        C06491() {
        }

        public void run() {
            if (C0648am.this.f4198j) {
                Log.LogVerbose("RustedWarfare", "Music:pause() unsynchronized");
                C0648am.this.m2655g();
                return;
            }
            synchronized (C0648am.this.f4191b) {
                Log.LogVerbose("RustedWarfare", "Music:pause() synchronized");
                C0648am.this.m2655g();
            }
        }
    }

    /* renamed from: g */
    public void m2655g() {
        if (this.f4166l) {
            this.f4165k.mo96a();
        }
        if (this.f4182B) {
            this.f4181A.mo96a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.am$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am$2.class */
    public class C06502 extends Thread {
        C06502() {
        }

        public void run() {
            synchronized (C0648am.this.f4191b) {
                if (C0648am.this.f4166l) {
                    C0648am.this.f4165k.mo92b();
                    if (!C0648am.this.f4183C) {
                        C0648am.this.f4165k.m2651a(C0648am.this.m2670a(), C0648am.this.m2670a());
                    }
                }
                if (C0648am.this.f4182B) {
                    C0648am.this.f4181A.mo92b();
                }
            }
        }
    }

    /* renamed from: h */
    public void m2654h() {
        new C06502().start();
    }

    /* renamed from: i */
    public void m2653i() {
        f4188a.mo101b();
        if (this.f4182B) {
            this.f4181A.mo90d();
            this.f4181A.mo89e();
        }
        if (this.f4165k != null) {
            this.f4165k.mo90d();
            this.f4165k.mo89e();
        }
        this.f4165k = null;
        this.f4167m = null;
        this.f4166l = false;
    }

    /* renamed from: j */
    public boolean m2652j() {
        if (this.f4183C) {
            return true;
        }
        return false;
    }
}
