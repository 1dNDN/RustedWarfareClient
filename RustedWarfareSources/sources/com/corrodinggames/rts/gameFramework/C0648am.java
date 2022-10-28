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
    C0663au f4168e;

    /* renamed from: k */
    AbstractC0658as f4174k;

    /* renamed from: l */
    boolean f4175l;

    /* renamed from: m */
    String f4176m;

    /* renamed from: n */
    boolean f4177n;

    /* renamed from: o */
    boolean f4178o;

    /* renamed from: p */
    float f4179p;

    /* renamed from: q */
    float f4180q;

    /* renamed from: r */
    float f4181r;

    /* renamed from: s */
    public boolean f4182s;

    /* renamed from: t */
    public String f4183t;

    /* renamed from: u */
    public boolean f4184u;

    /* renamed from: v */
    String f4185v;

    /* renamed from: w */
    Context f4186w;

    /* renamed from: x */
    boolean f4187x;

    /* renamed from: y */
    boolean f4188y;

    /* renamed from: z */
    int f4189z;

    /* renamed from: A */
    AbstractC0658as f4190A;

    /* renamed from: B */
    boolean f4191B;

    /* renamed from: C */
    boolean f4192C;

    /* renamed from: D */
    float f4193D;

    /* renamed from: H */
    float f4197H;

    /* renamed from: L */
    boolean f4201L;

    /* renamed from: M */
    boolean f4202M;

    /* renamed from: a */
    public static AbstractC0656aq f4164a = new C0651an();

    /* renamed from: J */
    static HashMap f4199J = new HashMap();

    /* renamed from: K */
    static int f4200K = 0;

    /* renamed from: b */
    Object f4165b = new Object();

    /* renamed from: c */
    Object f4166c = new Object();

    /* renamed from: d */
    volatile float f4167d = 1.0f;

    /* renamed from: f */
    volatile boolean f4169f = false;

    /* renamed from: g */
    volatile boolean f4170g = true;

    /* renamed from: h */
    float f4171h = 0.0f;

    /* renamed from: i */
    int f4172i = 0;

    /* renamed from: j */
    boolean f4173j = false;

    /* renamed from: E */
    boolean f4194E = false;

    /* renamed from: F */
    public boolean f4195F = false;

    /* renamed from: G */
    boolean f4196G = false;

    /* renamed from: I */
    ArrayList f4198I = new ArrayList();

    /* renamed from: N */
    long f4203N = -1;

    /* renamed from: a */
    public float m2718a() {
        Core m1087A = Core.m1087A();
        return m1087A.settingEngine.musicVolume * m1087A.settingEngine.masterVolume;
    }

    /* renamed from: b */
    public boolean m2711b() {
        return (Core.m1008aw() || this.f4184u || m2718a() <= 0.01f) ? false : true;
    }

    /* renamed from: a */
    public void m2716a(Context context) {
        this.f4186w = context;
        if (Core.m1008aw()) {
            return;
        }
        f4164a.mo97a(this);
        this.f4174k = f4164a.mo100a();
        this.f4190A = f4164a.mo100a();
        EnumC0659at.m2695c();
        if (f4164a.mo93d()) {
            this.f4168e = new C0663au(this);
            this.f4168e.start();
        }
    }

    /* renamed from: c */
    public void m2708c() {
        if (!Core.m1010au()) {
            this.f4175l = false;
            this.f4176m = null;
            this.f4187x = true;
            this.f4191B = false;
        }
        this.f4188y = true;
        this.f4184u = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC0657ar m2712a(String str, boolean z) {
        AbstractC0657ar abstractC0657ar = (AbstractC0657ar) f4199J.get(str);
        if (abstractC0657ar != null) {
            return abstractC0657ar;
        }
        try {
            AbstractC0657ar mo96a = f4164a.mo96a(str);
            if (z) {
                f4199J.put(str, mo96a);
            }
            return mo96a;
        } catch (ArithmeticException e) {
            f4200K++;
            Core.m1041a("Error loading:" + str, (Throwable) e);
            if (f4200K > 2 && f4200K <= 4) {
                Core.m1087A().m969i("Failed to load music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e);
            }
            return null;
        } catch (Exception e2) {
            f4200K++;
            Core.m1041a("Exception loading:" + str, (Throwable) e2);
            if (f4200K > 2 && f4200K <= 4) {
                Core.m1087A().m969i("Unknown error loading music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e2);
            }
            return null;
        } catch (OutOfMemoryError e3) {
            f4200K++;
            Core.m1041a("OutOfMemoryError loading:" + str, e3);
            Core.m1034aB();
            System.gc();
            Core.m1034aB();
            if (f4200K < 3) {
                Core.m1087A().m969i("Ran out of memory loading music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e3);
            }
            return null;
        }
    }

    /* renamed from: d */
    public ArrayList m2706d() {
        ArrayList arrayList = new ArrayList();
        for (String str : EnumC0659at.starting.m2696b()) {
            arrayList.add(str);
        }
        for (String str2 : EnumC0659at.buildup.m2696b()) {
            arrayList.add(str2);
        }
        for (String str3 : EnumC0659at.starting.m2696b()) {
            arrayList.add(str3);
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m2715a(EnumC0659at enumC0659at) {
        return m2714a(enumC0659at, enumC0659at);
    }

    /* renamed from: a */
    public String m2714a(EnumC0659at enumC0659at, EnumC0659at enumC0659at2) {
        EnumC0659at enumC0659at3;
        Core.m1087A();
        if (C0758f.m2133c(enumC0659at.m2696b().length + enumC0659at2.m2696b().length) < enumC0659at.m2696b().length) {
            enumC0659at3 = enumC0659at;
        } else {
            enumC0659at3 = enumC0659at2;
        }
        String[] m2696b = enumC0659at3.m2696b();
        return enumC0659at3.m2697a(m2696b[C0758f.m2133c(m2696b.length)]);
    }

    /* renamed from: e */
    public synchronized void m2705e() {
        this.f4182s = true;
        this.f4184u = false;
        this.f4183t = null;
    }

    /* renamed from: a */
    public synchronized void m2713a(String str) {
        this.f4182s = true;
        this.f4184u = false;
        this.f4183t = str;
    }

    /* renamed from: a */
    public synchronized void m2717a(float f) {
        if (Core.m1008aw()) {
            return;
        }
        if (!f4164a.mo93d()) {
            if (!this.f4201L) {
                m2710b(f);
            }
            this.f4170g = true;
        }
        this.f4203N = Core.m1067U();
        if (Core.m1087A().f6118bT.f4115H.m2738a()) {
            m2705e();
        }
        if (this.f4185v != null) {
            C0831ad.m1588a((String) null, this.f4185v);
            this.f4185v = null;
        }
        if (this.f4179p != m2718a()) {
            this.f4179p = m2718a();
            this.f4178o = true;
        }
        synchronized (this.f4166c) {
            this.f4167d = f;
            if (this.f4201L) {
                if (!this.f4202M) {
                    this.f4202M = true;
                    Core.m959n("Music subsystem crashed, music has been disabled to keep your game running. Please send your logs.");
                }
                return;
            }
            if (!this.f4170g) {
                this.f4171h += f;
                this.f4172i++;
                if (this.f4171h > 320.0f && this.f4172i > 80 && !this.f4173j) {
                    this.f4173j = true;
                    Core.m959n("Lockup detected in music subsystem");
                }
            } else {
                this.f4171h = 0.0f;
                this.f4172i = 0;
            }
            this.f4170g = false;
            this.f4169f = true;
            this.f4166c.notifyAll();
        }
    }

    /* renamed from: b */
    public String m2709b(String str) {
        return C0758f.m2099g(C0758f.m2087k(str)).replace("[noloop]", VariableScope.nullOrMissingString).replace("_", " ");
    }

    /* renamed from: b */
    public boolean m2710b(float f) {
        try {
            m2707c(f);
            return true;
        } catch (Exception e) {
            Core.m1041a("Music system crashed", (Throwable) e);
            this.f4201L = true;
            Core.LogDebug2("Stopping music");
            try {
                m2703g();
                return false;
            } catch (Exception e2) {
                Core.m1041a("crash stopping music", (Throwable) e2);
                return false;
            }
        }
    }

    /* renamed from: c */
    public void m2707c(float f) {
        float m2718a;
        float m2718a2;
        if (Core.m1008aw()) {
            return;
        }
        f4164a.mo99a(f);
        if (!m2711b()) {
            if (this.f4175l && this.f4174k.mo85c()) {
                m2703g();
                this.f4175l = false;
                this.f4191B = false;
                return;
            }
            return;
        }
        boolean z = false;
        if (!this.f4175l) {
            z = true;
        }
        if (this.f4177n) {
            if (!this.f4192C) {
                this.f4180q += f;
            }
            if (this.f4180q > 600.0f) {
                this.f4181r += f;
                if (this.f4181r > 100.0f) {
                    this.f4181r = 0.0f;
                    if (!this.f4175l || !this.f4174k.mo85c()) {
                        z = true;
                        this.f4180q = 0.0f;
                    }
                }
            }
        } else {
            this.f4180q += f;
            if (this.f4180q > 3600.0f) {
                Core.LogDebug2("Next music track, timer:" + this.f4180q);
                z = true;
                this.f4180q = 0.0f;
            }
        }
        if (this.f4188y) {
            C0824b m1799y = C0797f.m1799y();
            if (m1799y != null && m1799y.f5456N) {
                z = true;
            }
            this.f4188y = false;
        }
        if (z || this.f4182s) {
            boolean z2 = this.f4182s;
            String str = this.f4183t;
            if (this.f4182s) {
                Core.LogDebug2("Next music track requested");
                this.f4182s = false;
                this.f4180q = 0.0f;
                this.f4183t = null;
            }
            String str2 = null;
            boolean z3 = false;
            C0824b c0824b = null;
            if (str != null) {
                ArrayList m1697i = Core.m1087A().f6124bZ.m1697i();
                m1697i.addAll(m2706d());
                if (str.endsWith(".ogg") || str.endsWith(".wav")) {
                    m2709b(str);
                }
                Iterator it = m1697i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str3 = (String) it.next();
                    if (m2709b(str3).equalsIgnoreCase(str)) {
                        z3 = true;
                        str2 = str3;
                        break;
                    }
                }
                if (str2 == null) {
                    Core.LogDebug2("Failed to find requested music: " + str);
                }
            }
            C0824b m1799y2 = C0797f.m1799y();
            if (str2 == null && m1799y2 != null && m1799y2.f5458P < 10 && m1799y2.f5456N) {
                ArrayList m1669q = m1799y2.m1669q();
                if (m1669q.size() > 0) {
                    z3 = true;
                    c0824b = m1799y2;
                    str2 = (String) m1669q.get(C0758f.m2203a(0, m1669q.size() - 1));
                    if (z2 || this.f4198I.contains(str2)) {
                        for (int i = 0; i < 30 && (str2.equals(this.f4176m) || this.f4198I.contains(str2)); i++) {
                            str2 = (String) m1669q.get(C0758f.m2203a(0, m1669q.size() - 1));
                            if (i > 20) {
                                this.f4198I.clear();
                            }
                        }
                    }
                    Core.LogDebug2("Playing music from mod:" + m1799y2.m1691a() + " - '" + str2 + "'");
                }
            }
            if (str2 == null) {
                if (this.f4187x) {
                    str2 = m2715a(EnumC0659at.starting);
                } else {
                    str2 = m2714a(EnumC0659at.buildup, EnumC0659at.starting);
                }
                if (z2 || this.f4198I.contains(str2)) {
                    for (int i2 = 0; i2 < 30 && (str2.equals(this.f4176m) || this.f4198I.contains(str2)); i2++) {
                        str2 = m2714a(EnumC0659at.buildup, EnumC0659at.starting);
                        if (i2 > 20) {
                            this.f4198I.clear();
                        }
                    }
                }
            }
            if (!str2.equals(this.f4176m)) {
                this.f4176m = str2;
                this.f4187x = false;
                this.f4180q = 0.0f;
                this.f4177n = z3 || str2.contains("[noloop]");
                this.f4198I.add(str2);
                if (this.f4198I.size() > 4) {
                    this.f4198I.remove(0);
                }
                if (z2) {
                    this.f4185v = "Now playing: " + m2709b(str2);
                }
                AbstractC0658as abstractC0658as = this.f4174k;
                this.f4174k = this.f4190A;
                this.f4190A = abstractC0658as;
                try {
                    try {
                        this.f4174k.mo88a(m2712a(str2, false));
                        this.f4174k.mo87a(!this.f4177n);
                        this.f4194E = false;
                        if (!z2 && this.f4191B) {
                            this.f4194E = true;
                        }
                        if (this.f4175l) {
                            this.f4191B = true;
                        }
                        this.f4192C = true;
                        this.f4196G = false;
                        this.f4193D = 1.0f;
                        this.f4175l = true;
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                        if (this.f4189z < 3) {
                            this.f4185v = "Failed to play music track: " + str2;
                            this.f4189z++;
                        }
                        if (c0824b != null) {
                            c0824b.f5458P++;
                            return;
                        }
                        return;
                    }
                } catch (RuntimeException e2) {
                    e2.printStackTrace();
                    if (this.f4189z < 3) {
                        this.f4185v = "Failed to open music track: " + str2;
                        this.f4189z++;
                    }
                    if (c0824b != null) {
                        c0824b.f5458P++;
                        return;
                    }
                    return;
                }
            } else if (z2) {
                Core.LogDebug2("Same music found");
            }
        }
        if (this.f4192C || this.f4178o) {
            boolean mo94c = f4164a.mo94c();
            if (!mo94c) {
                if (this.f4195F) {
                    this.f4193D -= f * 0.1f;
                } else {
                    this.f4193D -= f * 0.006f;
                }
            } else if (this.f4195F) {
                this.f4193D -= f * 0.1f;
            } else if (this.f4194E) {
                this.f4193D -= f * 0.003f;
            } else {
                this.f4193D -= f * 0.008f;
            }
            if (!mo94c) {
                m2718a = this.f4193D * m2718a();
                m2718a2 = (1.0f - this.f4193D) * m2718a();
            } else {
                m2718a = ((this.f4193D * 2.0f) - 1.0f) * m2718a();
                m2718a2 = (1.0f - (this.f4193D * 2.0f)) * m2718a();
            }
            float m2158b = C0758f.m2158b(m2718a, 0.0f, 1.0f);
            float m2158b2 = C0758f.m2158b(m2718a2, 0.0f, 1.0f);
            if (this.f4192C) {
                if (this.f4193D <= 0.0f) {
                    this.f4192C = false;
                    this.f4194E = false;
                    if (this.f4191B && !this.f4196G) {
                        this.f4196G = true;
                        this.f4190A.mo84d();
                    }
                    if (this.f4175l) {
                        this.f4174k.m2699a(m2718a(), m2718a());
                    }
                } else {
                    this.f4197H += f;
                    if (this.f4197H > 10.0f) {
                        this.f4197H = 0.0f;
                        if (this.f4191B && !this.f4196G) {
                            this.f4190A.m2699a(m2158b, m2158b);
                            if (m2158b < 0.02f) {
                                this.f4196G = true;
                                this.f4190A.mo84d();
                            }
                        }
                        if (this.f4175l) {
                            this.f4174k.m2699a(m2158b2, m2158b2);
                        }
                    }
                }
            } else if (this.f4175l) {
                this.f4174k.m2699a(m2158b2, m2158b2);
            }
        }
        this.f4178o = false;
    }

    /* renamed from: f */
    public void m2704f() {
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
            if (C0648am.this.f4173j) {
                Log.LogVerbose("RustedWarfare", "Music:pause() unsynchronized");
                C0648am.this.m2703g();
                return;
            }
            synchronized (C0648am.this.f4165b) {
                Log.LogVerbose("RustedWarfare", "Music:pause() synchronized");
                C0648am.this.m2703g();
            }
        }
    }

    /* renamed from: g */
    public void m2703g() {
        if (this.f4175l) {
            this.f4174k.mo90a();
        }
        if (this.f4191B) {
            this.f4190A.mo90a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.am$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am$2.class */
    public class C06502 extends Thread {
        C06502() {
        }

        public void run() {
            synchronized (C0648am.this.f4165b) {
                if (C0648am.this.f4175l) {
                    C0648am.this.f4174k.mo86b();
                    if (!C0648am.this.f4192C) {
                        C0648am.this.f4174k.m2699a(C0648am.this.m2718a(), C0648am.this.m2718a());
                    }
                }
                if (C0648am.this.f4191B) {
                    C0648am.this.f4190A.mo86b();
                }
            }
        }
    }

    /* renamed from: h */
    public void m2702h() {
        new C06502().start();
    }

    /* renamed from: i */
    public void m2701i() {
        f4164a.mo95b();
        if (this.f4191B) {
            this.f4190A.mo84d();
            this.f4190A.mo83e();
        }
        if (this.f4174k != null) {
            this.f4174k.mo84d();
            this.f4174k.mo83e();
        }
        this.f4174k = null;
        this.f4176m = null;
        this.f4175l = false;
    }

    /* renamed from: j */
    public boolean m2700j() {
        if (this.f4192C) {
            return true;
        }
        return false;
    }
}
