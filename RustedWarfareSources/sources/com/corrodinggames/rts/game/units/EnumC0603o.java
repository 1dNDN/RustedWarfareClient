package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.game.units.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o.class */
public enum EnumC0603o {
    land { // from class: com.corrodinggames.rts.game.units.o.1
        @Override // com.corrodinggames.rts.game.units.EnumC0603o
        /* renamed from: a */
        public boolean mo3001a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            AbstractC0244am m4100c = AbstractC0244am.m4100c(interfaceC0303as);
            return (m4100c.mo3522bO() || interfaceC0303as.mo3401j() || m4100c.mo2960h() == EnumC0246ao.AIR || m4100c.mo2960h() == EnumC0246ao.WATER) ? false : true;
        }
    },
    air { // from class: com.corrodinggames.rts.game.units.o.2
        @Override // com.corrodinggames.rts.game.units.EnumC0603o
        /* renamed from: a */
        public boolean mo3001a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            AbstractC0244am m4100c = AbstractC0244am.m4100c(interfaceC0303as);
            return (m4100c.mo3522bO() || interfaceC0303as.mo3401j() || m4100c.mo2960h() != EnumC0246ao.AIR) ? false : true;
        }
    },
    sea { // from class: com.corrodinggames.rts.game.units.o.3
        @Override // com.corrodinggames.rts.game.units.EnumC0603o
        /* renamed from: a */
        public boolean mo3001a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            AbstractC0244am m4100c = AbstractC0244am.m4100c(interfaceC0303as);
            return (m4100c.mo3522bO() || interfaceC0303as.mo3401j() || m4100c.mo2960h() != EnumC0246ao.WATER) ? false : true;
        }
    },
    buildings { // from class: com.corrodinggames.rts.game.units.o.4
        @Override // com.corrodinggames.rts.game.units.EnumC0603o
        /* renamed from: a */
        public boolean mo3001a(InterfaceC0303as interfaceC0303as) {
            return (interfaceC0303as == null || AbstractC0244am.m4100c(interfaceC0303as).mo3522bO() || !interfaceC0303as.mo3401j()) ? false : true;
        }
    },
    bio { // from class: com.corrodinggames.rts.game.units.o.5
        @Override // com.corrodinggames.rts.game.units.EnumC0603o
        /* renamed from: a */
        public boolean mo3001a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            return AbstractC0244am.m4100c(interfaceC0303as).mo3522bO();
        }
    };

    /* renamed from: a */
    public abstract boolean mo3001a(InterfaceC0303as interfaceC0303as);

    /* renamed from: a */
    public String m3005a() {
        return name();
    }

    /* renamed from: a */
    public EnumC0603o m3003a(boolean z) {
        if (!z) {
            return m3004a(1, 0);
        }
        return m3004a(-1, 0);
    }

    /* renamed from: a */
    public EnumC0603o m3004a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        EnumC0603o enumC0603o = values()[ordinal];
        if (!enumC0603o.m3002b()) {
            if (i2 > 30) {
                AbstractC0916l.m963e("jumpBy recursion limit hit");
                return enumC0603o;
            }
            enumC0603o = enumC0603o.m3004a(i, i2 + 1);
        }
        return enumC0603o;
    }

    /* renamed from: b */
    public boolean m3002b() {
        return true;
    }
}
