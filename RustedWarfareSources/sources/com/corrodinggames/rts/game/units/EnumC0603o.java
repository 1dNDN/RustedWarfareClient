package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.gameFramework.Core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.corrodinggames.rts.game.units.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o.class */
public abstract class EnumC0603o {

    /* renamed from: a */
    public static final EnumC0603o f3865a = new C06041("land", 0);

    /* renamed from: b */
    public static final EnumC0603o f3866b = new C06052("air", 1);

    /* renamed from: c */
    public static final EnumC0603o f3867c = new C06063("sea", 2);

    /* renamed from: d */
    public static final EnumC0603o f3868d = new C06074("buildings", 3);

    /* renamed from: e */
    public static final EnumC0603o f3869e = new C06085("bio", 4);

    /* renamed from: f */
    private static final /* synthetic */ EnumC0603o[] f3870f = {f3865a, f3866b, f3867c, f3868d, f3869e};

    /* renamed from: a */
    public abstract boolean m3107a(InterfaceC0303as interfaceC0303as);

    public static EnumC0603o[] values() {
        return (EnumC0603o[]) f3870f.clone();
    }

    public static EnumC0603o valueOf(String str) {
        return (EnumC0603o) Enum.valueOf(EnumC0603o.class, str);
    }

    private EnumC0603o(String str, int i) {
    }

    /* synthetic */ EnumC0603o(String str, int i, C0555h.C05561 c05561) {
        this(str, i);
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$1.class */
    enum C06041 extends EnumC0603o {
        C06041(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3104a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            AbstractC0244am m4736c = AbstractC0244am.m4736c(interfaceC0303as);
            return (m4736c.mo4386bO() || interfaceC0303as.mo4473j() || m4736c.mo3039h() == EnumC0246ao.f1706d || m4736c.mo3039h() == EnumC0246ao.f1707e) ? false : true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$2.class */
    enum C06052 extends EnumC0603o {
        C06052(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3103a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            AbstractC0244am m4736c = AbstractC0244am.m4736c(interfaceC0303as);
            return (m4736c.mo4386bO() || interfaceC0303as.mo4473j() || m4736c.mo3039h() != EnumC0246ao.f1706d) ? false : true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$3.class */
    enum C06063 extends EnumC0603o {
        C06063(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3102a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            AbstractC0244am m4736c = AbstractC0244am.m4736c(interfaceC0303as);
            return (m4736c.mo4386bO() || interfaceC0303as.mo4473j() || m4736c.mo3039h() != EnumC0246ao.f1707e) ? false : true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$4.class */
    enum C06074 extends EnumC0603o {
        C06074(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3101a(InterfaceC0303as interfaceC0303as) {
            return (interfaceC0303as == null || AbstractC0244am.m4736c(interfaceC0303as).mo4386bO() || !interfaceC0303as.mo4473j()) ? false : true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$5.class */
    enum C06085 extends EnumC0603o {
        C06085(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3100a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            return AbstractC0244am.m4736c(interfaceC0303as).mo4386bO();
        }
    }

    /* renamed from: a */
    public String m3109a() {
        return name();
    }

    /* renamed from: a */
    public EnumC0603o m3106a(boolean z) {
        if (!z) {
            return m3108a(1, 0);
        }
        return m3108a(-1, 0);
    }

    /* renamed from: a */
    public EnumC0603o m3108a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        EnumC0603o enumC0603o = values()[ordinal];
        if (!enumC0603o.m3105b()) {
            if (i2 > 30) {
                Core.LogDebug2("jumpBy recursion limit hit");
                return enumC0603o;
            }
            enumC0603o = enumC0603o.m3108a(i, i2 + 1);
        }
        return enumC0603o;
    }

    /* renamed from: b */
    public boolean m3105b() {
        return true;
    }
}
