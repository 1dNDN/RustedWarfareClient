package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;

/* renamed from: com.corrodinggames.rts.gameFramework.i.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/b.class */
public class C0866b {

    /* renamed from: a */
    int f5759a;

    /* renamed from: b */
    String f5760b;

    /* renamed from: c */
    String f5761c;

    /* renamed from: d */
    C0867c f5762d;

    /* renamed from: e */
    long f5763e = System.nanoTime();

    /* renamed from: f */
    final /* synthetic */ C0827a f5764f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0866b(C0827a c0827a, int i, String str, String str2, C0867c c0867c) {
        this.f5764f = c0827a;
        this.f5759a = i;
        this.f5760b = str;
        this.f5761c = str2;
        this.f5762d = c0867c;
    }

    /* renamed from: a */
    public String m1340a() {
        String str;
        if (this.f5760b != null) {
            str = this.f5760b + ": " + this.f5761c;
        } else {
            str = this.f5761c;
        }
        return str;
    }

    /* renamed from: b */
    public String m1339b() {
        String str = VariableScope.nullOrMissingString;
        if (this.f5760b != null) {
            int i = -1;
            if (this.f5759a != -1) {
                i = AbstractC0197n.m4243i(this.f5759a);
            }
            str = "<strong> <font color='" + C0758f.m2033h(i) + "'>" + this.f5764f.m1609a(this.f5760b) + ": </font></strong>";
        }
        boolean z = true;
        for (String str2 : this.f5761c.split("\n")) {
            if (!str2.trim().equals(VariableScope.nullOrMissingString)) {
                if (z) {
                    z = false;
                } else {
                    str = str + "<br/>";
                }
                str = str + this.f5764f.m1609a(str2);
            }
        }
        return str;
    }
}
