package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.Core;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.corrodinggames.rts.game.units.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n.class */
public abstract class EnumC0596n {

    /* renamed from: a */
    public static final EnumC0596n f3858a = new C05971("all", 0);

    /* renamed from: b */
    public static final EnumC0596n f3859b = new C05982("types", 1);

    /* renamed from: c */
    public static final EnumC0596n f3860c = new C05993("terrain", 2);

    /* renamed from: d */
    public static final EnumC0596n f3861d = new C06004("modded", 3);

    /* renamed from: e */
    public static final EnumC0596n f3862e = new C06015("search", 4);

    /* renamed from: f */
    public static final EnumC0596n f3863f = new C06026("actions", 5);

    /* renamed from: g */
    private static final /* synthetic */ EnumC0596n[] f3864g = {f3858a, f3859b, f3860c, f3861d, f3862e, f3863f};

    /* renamed from: a */
    public abstract boolean m3120a(InterfaceC0303as interfaceC0303as);

    public static EnumC0596n[] values() {
        return (EnumC0596n[]) f3864g.clone();
    }

    public static EnumC0596n valueOf(String str) {
        return (EnumC0596n) Enum.valueOf(EnumC0596n.class, str);
    }

    private EnumC0596n(String str, int i) {
    }

    /* synthetic */ EnumC0596n(String str, int i, C0555h.C05561 c05561) {
        this(str, i);
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$1.class */
    enum C05971 extends EnumC0596n {
        C05971(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3117a(InterfaceC0303as interfaceC0303as) {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$2.class */
    enum C05982 extends EnumC0596n {
        C05982(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3116a(InterfaceC0303as interfaceC0303as) {
            C0555h m3216L = C0555h.m3216L();
            if (m3216L != null && m3216L.f3792E != null) {
                return m3216L.f3792E.m3107a(interfaceC0303as);
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$3.class */
    enum C05993 extends EnumC0596n {
        C05993(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3115a(InterfaceC0303as interfaceC0303as) {
            return false;
        }

        /* renamed from: b */
        public boolean m3114b() {
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$4.class */
    enum C06004 extends EnumC0596n {
        C06004(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3113a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as != null && (interfaceC0303as instanceof C0453l)) {
                C0453l c0453l = (C0453l) interfaceC0303as;
                if (c0453l.f2919I == null) {
                    return false;
                }
                C0555h m3216L = C0555h.m3216L();
                if (m3216L != null && m3216L.f3791D != null && c0453l.f2919I != m3216L.f3791D) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$5.class */
    enum C06015 extends EnumC0596n {
        C06015(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3112a(InterfaceC0303as interfaceC0303as) {
            C0555h m3216L = C0555h.m3216L();
            if (m3216L == null || m3216L.f3794G == null) {
                return false;
            }
            if (m3216L.f3795H) {
                m3216L.f3795H = false;
                m3216L.f3796I = m3216L.f3794G.toLowerCase().trim();
            }
            if (interfaceC0303as == null) {
                return false;
            }
            if (interfaceC0303as.mo4474i() != null && interfaceC0303as.mo4474i().toLowerCase(Locale.ROOT).contains(m3216L.f3796I)) {
                return true;
            }
            if (interfaceC0303as.mo4474i() != null && interfaceC0303as.mo4478e().toLowerCase(Locale.ROOT).contains(m3216L.f3796I)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m3111b() {
            C0555h m3216L = C0555h.m3216L();
            return (m3216L == null || m3216L.f3794G == null) ? false : true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$6.class */
    enum C06026 extends EnumC0596n {
        C06026(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3110a(InterfaceC0303as interfaceC0303as) {
            return interfaceC0303as == null;
        }
    }

    /* renamed from: a */
    public String m3122a() {
        return name();
    }

    /* renamed from: b */
    public boolean m3118b() {
        return true;
    }

    /* renamed from: a */
    public EnumC0596n m3119a(boolean z) {
        if (!z) {
            return m3121a(1, 0);
        }
        return m3121a(-1, 0);
    }

    /* renamed from: a */
    public EnumC0596n m3121a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        EnumC0596n enumC0596n = values()[ordinal];
        if (!enumC0596n.m3118b()) {
            if (i2 > 30) {
                Core.LogDebug2("jumpBy recursion limit hit");
                return enumC0596n;
            }
            enumC0596n = enumC0596n.m3121a(i, i2 + 1);
        }
        return enumC0596n;
    }
}
