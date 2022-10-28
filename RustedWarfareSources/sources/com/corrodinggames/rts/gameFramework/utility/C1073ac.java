package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ac.class */
public final class C1073ac {

    /* renamed from: a */
    String f6833a;

    /* renamed from: b */
    String f6834b;

    public C1073ac(String str, String str2) {
        this.f6833a = str;
        this.f6834b = str2;
    }

    public String toString() {
        return "[" + this.f6833a + "]" + this.f6834b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1073ac)) {
            return false;
        }
        C1073ac c1073ac = (C1073ac) obj;
        return this.f6834b.equals(c1073ac.f6834b) && this.f6833a.equals(c1073ac.f6833a);
    }

    /* renamed from: a */
    public String m613a() {
        return this.f6833a;
    }

    /* renamed from: b */
    public String m612b() {
        return this.f6834b;
    }
}
