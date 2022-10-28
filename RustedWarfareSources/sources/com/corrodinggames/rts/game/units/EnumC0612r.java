package com.corrodinggames.rts.game.units;

/* renamed from: com.corrodinggames.rts.game.units.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/r.class */
public enum EnumC0612r {
    grass { // from class: com.corrodinggames.rts.game.units.r.1
        @Override // com.corrodinggames.rts.game.units.EnumC0612r
        /* renamed from: b */
        public String mo2972b() {
            return "terrain/Long Grass.tsx";
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0612r
        /* renamed from: a */
        public String mo2973a() {
            return null;
        }
    },
    sea { // from class: com.corrodinggames.rts.game.units.r.2
        @Override // com.corrodinggames.rts.game.units.EnumC0612r
        /* renamed from: b */
        public String mo2972b() {
            return "terrain/Water.tsx";
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0612r
        /* renamed from: a */
        public String mo2973a() {
            return null;
        }
    },
    sand { // from class: com.corrodinggames.rts.game.units.r.3
        @Override // com.corrodinggames.rts.game.units.EnumC0612r
        /* renamed from: b */
        public String mo2972b() {
            return "terrain/Sand.tsx";
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0612r
        /* renamed from: a */
        public String mo2973a() {
            return "ridges/Sand Nothing - Flat.tsx";
        }
    },
    dust { // from class: com.corrodinggames.rts.game.units.r.4
        @Override // com.corrodinggames.rts.game.units.EnumC0612r
        /* renamed from: b */
        public String mo2972b() {
            return "terrain/Dust.tsx";
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0612r
        /* renamed from: a */
        public String mo2973a() {
            return "ridges/Nothing Dust - Flat.tsx";
        }
    };

    /* renamed from: a */
    public abstract String mo2973a();

    /* renamed from: b */
    public abstract String mo2972b();
}
