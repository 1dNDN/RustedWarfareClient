package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;

/* renamed from: com.corrodinggames.rts.appFramework.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/o.class */
public class C0128o {

    /* renamed from: a */
    String f532a;

    /* renamed from: b */
    int f533b = 0;

    /* renamed from: c */
    int f534c = 0;

    /* renamed from: d */
    AbstractC0197n f535d = null;

    /* renamed from: e */
    AbstractC0197n f536e = null;

    /* renamed from: f */
    int f537f;

    /* renamed from: g */
    int f538g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0128o(String str) {
        this.f532a = str;
    }

    /* renamed from: a */
    public void m4757a(AbstractC0197n abstractC0197n, int i) {
        if (i < this.f533b || this.f535d == null) {
            this.f533b = i;
            this.f535d = abstractC0197n;
            this.f537f = 1;
        } else if (i == this.f533b) {
            this.f537f++;
        }
        if (i > this.f534c || this.f536e == null) {
            this.f534c = i;
            this.f536e = abstractC0197n;
            this.f538g = 1;
        } else if (i == this.f534c) {
            this.f538g++;
        }
    }

    /* renamed from: a */
    public boolean m4758a() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (this.f533b == this.f534c) {
            return false;
        }
        if (this.f535d == null && this.f536e == null) {
            return false;
        }
        if (this.f538g == 1) {
            m1071A.f6165bS.f5115e.m1743a(null, "Warning: Uneven map - Player " + (this.f536e.f1317k + 1) + " on team " + this.f536e.m4247h() + ": " + this.f532a + " is " + this.f534c + " vs " + this.f533b);
            return true;
        }
        m1071A.f6165bS.f5115e.m1743a(null, "Warning: Uneven map - " + this.f538g + " players including player " + (this.f536e.f1317k + 1) + " on team " + (this.f536e.f1323q + 1) + ": " + this.f532a + " is " + this.f534c + " vs " + this.f533b);
        return true;
    }
}
