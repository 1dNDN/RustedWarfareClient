package com.corrodinggames.rts.gameFramework.p045m;

/* renamed from: com.corrodinggames.rts.gameFramework.m.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/e.class */
public enum EnumC1037e {
    objective { // from class: com.corrodinggames.rts.gameFramework.m.e.1
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "objective";
        }
    },
    event_move { // from class: com.corrodinggames.rts.gameFramework.m.e.4
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "move";
        }
    },
    event_changeCredits { // from class: com.corrodinggames.rts.gameFramework.m.e.5
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "changeCredits";
        }
    },
    event_teamTags { // from class: com.corrodinggames.rts.gameFramework.m.e.6
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "teamTags";
        }
    },
    event_unitAdd { // from class: com.corrodinggames.rts.gameFramework.m.e.7
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "unitAdd";
        }
    },
    event_unitRemove { // from class: com.corrodinggames.rts.gameFramework.m.e.8
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "unitRemove";
        }
    },
    mapText { // from class: com.corrodinggames.rts.gameFramework.m.e.9
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "mapText";
        }
    },
    moveCamera { // from class: com.corrodinggames.rts.gameFramework.m.e.10
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "moveCamera";
        }
    },
    trigger_unitDetect { // from class: com.corrodinggames.rts.gameFramework.m.e.11
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "unitDetect";
        }
    },
    trigger_teamTagDetect { // from class: com.corrodinggames.rts.gameFramework.m.e.2
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "teamTagDetect";
        }
    },
    trigger_basic { // from class: com.corrodinggames.rts.gameFramework.m.e.3
        @Override // com.corrodinggames.rts.gameFramework.p045m.EnumC1037e
        /* renamed from: a */
        public String mo773a() {
            return "basic";
        }
    };

    /* renamed from: a */
    public abstract String mo773a();

    /* renamed from: a */
    public static EnumC1037e m774a(String str) {
        EnumC1037e[] values;
        for (EnumC1037e enumC1037e : values()) {
            if (enumC1037e.mo773a().equalsIgnoreCase(str)) {
                return enumC1037e;
            }
        }
        return null;
    }
}
