package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n.class */
public enum EnumC0596n {
    all { // from class: com.corrodinggames.rts.game.units.n.1
        @Override // com.corrodinggames.rts.game.units.EnumC0596n
        /* renamed from: a */
        public boolean mo3006a(InterfaceC0303as interfaceC0303as) {
            return true;
        }
    },
    types { // from class: com.corrodinggames.rts.game.units.n.2
        @Override // com.corrodinggames.rts.game.units.EnumC0596n
        /* renamed from: a */
        public boolean mo3006a(InterfaceC0303as interfaceC0303as) {
            C0555h m3063L = C0555h.m3063L();
            if (m3063L != null && m3063L.f3792E != null) {
                return m3063L.f3792E.mo3001a(interfaceC0303as);
            }
            return false;
        }
    },
    terrain { // from class: com.corrodinggames.rts.game.units.n.3
        @Override // com.corrodinggames.rts.game.units.EnumC0596n
        /* renamed from: a */
        public boolean mo3006a(InterfaceC0303as interfaceC0303as) {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0596n
        /* renamed from: b */
        public boolean mo3007b() {
            return false;
        }
    },
    modded { // from class: com.corrodinggames.rts.game.units.n.4
        @Override // com.corrodinggames.rts.game.units.EnumC0596n
        /* renamed from: a */
        public boolean mo3006a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as != null && (interfaceC0303as instanceof C0453l)) {
                C0453l c0453l = (C0453l) interfaceC0303as;
                if (c0453l.f2937I == null) {
                    return false;
                }
                C0555h m3063L = C0555h.m3063L();
                if (m3063L != null && m3063L.f3791D != null && c0453l.f2937I != m3063L.f3791D) {
                    return false;
                }
                return true;
            }
            return false;
        }
    },
    search { // from class: com.corrodinggames.rts.game.units.n.5
        @Override // com.corrodinggames.rts.game.units.EnumC0596n
        /* renamed from: a */
        public boolean mo3006a(InterfaceC0303as interfaceC0303as) {
            C0555h m3063L = C0555h.m3063L();
            if (m3063L == null || m3063L.f3794G == null) {
                return false;
            }
            if (m3063L.f3795H) {
                m3063L.f3795H = false;
                m3063L.f3796I = m3063L.f3794G.toLowerCase().trim();
            }
            if (interfaceC0303as == null) {
                return false;
            }
            if (interfaceC0303as.mo3403i() != null && interfaceC0303as.mo3403i().toLowerCase(Locale.ROOT).contains(m3063L.f3796I)) {
                return true;
            }
            if (interfaceC0303as.mo3403i() != null && interfaceC0303as.mo3411e().toLowerCase(Locale.ROOT).contains(m3063L.f3796I)) {
                return true;
            }
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0596n
        /* renamed from: b */
        public boolean mo3007b() {
            C0555h m3063L = C0555h.m3063L();
            return (m3063L == null || m3063L.f3794G == null) ? false : true;
        }
    },
    actions { // from class: com.corrodinggames.rts.game.units.n.6
        @Override // com.corrodinggames.rts.game.units.EnumC0596n
        /* renamed from: a */
        public boolean mo3006a(InterfaceC0303as interfaceC0303as) {
            return interfaceC0303as == null;
        }
    };

    /* renamed from: a */
    public abstract boolean mo3006a(InterfaceC0303as interfaceC0303as);

    /* renamed from: a */
    public String m3010a() {
        return name();
    }

    /* renamed from: b */
    public boolean mo3007b() {
        return true;
    }

    /* renamed from: a */
    public EnumC0596n m3008a(boolean z) {
        if (!z) {
            return m3009a(1, 0);
        }
        return m3009a(-1, 0);
    }

    /* renamed from: a */
    public EnumC0596n m3009a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        EnumC0596n enumC0596n = values()[ordinal];
        if (!enumC0596n.mo3007b()) {
            if (i2 > 30) {
                AbstractC0916l.m963e("jumpBy recursion limit hit");
                return enumC0596n;
            }
            enumC0596n = enumC0596n.m3009a(i, i2 + 1);
        }
        return enumC0596n;
    }
}
