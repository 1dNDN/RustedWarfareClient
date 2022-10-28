package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.Core;

/* renamed from: com.corrodinggames.rts.gameFramework.i.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/g.class */
public class C0872g {

    /* renamed from: a */
    public boolean f5823a;

    /* renamed from: b */
    public String f5824b;

    /* renamed from: c */
    public String f5825c;

    /* renamed from: d */
    public String f5826d;

    /* renamed from: e */
    public String f5827e;

    /* renamed from: f */
    public String f5828f;

    /* renamed from: g */
    public int f5829g;

    /* renamed from: h */
    public boolean f5830h;

    /* renamed from: j */
    public String f5832j;

    /* renamed from: k */
    public String f5833k;

    /* renamed from: l */
    public int f5834l;

    /* renamed from: m */
    public boolean f5835m;

    /* renamed from: n */
    public String f5836n;

    /* renamed from: o */
    public long f5837o;

    /* renamed from: p */
    public int f5838p;

    /* renamed from: q */
    public String f5839q;

    /* renamed from: r */
    public String f5840r;

    /* renamed from: s */
    public String f5841s;

    /* renamed from: t */
    public String f5842t;

    /* renamed from: u */
    public String f5843u;

    /* renamed from: x */
    public boolean f5846x;

    /* renamed from: y */
    public boolean f5847y;

    /* renamed from: z */
    public String f5848z;

    /* renamed from: A */
    public int f5849A;

    /* renamed from: i */
    public long f5831i = -1;

    /* renamed from: v */
    public int f5844v = -1;

    /* renamed from: w */
    public int f5845w = 8;

    /* renamed from: a */
    public boolean m1328a() {
        String str = Core.m1087A().f6122bX.f5620bK;
        if (str != null && str.equals(this.f5824b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String m1327b() {
        String str;
        String m1326c = m1326c();
        if (m1326c != null) {
            String str2 = this.f5828f;
            if (str2 != null) {
                str2 = str2.replace("\\n", "\n");
            }
            return (VariableScope.nullOrMissingString + str2 + "\n") + "Url: " + m1326c + "\n";
        }
        String str3 = VariableScope.nullOrMissingString;
        if (this.f5823a) {
            str3 = str3 + "Lan: " + this.f5826d + ":" + this.f5829g + "\n";
        }
        String str4 = (str3 + "User: " + this.f5836n + "\n") + "Map: " + ActivityC0117i.m5622e(this.f5839q) + "\n";
        if (this.f5835m) {
            str4 = str4 + "Password Required\n";
        }
        if (!this.f5830h && !this.f5823a) {
            str4 = str4 + "Port: not open (Connecting over the internet may fail)\n";
        }
        if ("ANY".equalsIgnoreCase(this.f5833k)) {
            str = str4 + "Version: " + this.f5833k + "\n";
        } else {
            str = str4 + "Version: v" + this.f5833k + (m1322g() ? VariableScope.nullOrMissingString : " (different game version!)") + "\n";
        }
        if (this.f5848z != null && !this.f5848z.equals(VariableScope.nullOrMissingString)) {
            str = str + "Mods Needed: " + this.f5848z + "\n";
        }
        return str;
    }

    /* renamed from: c */
    public String m1326c() {
        return this.f5827e;
    }

    /* renamed from: d */
    public boolean m1325d() {
        return this.f5827e != null;
    }

    /* renamed from: e */
    public String m1324e() {
        if (this.f5849A == 0) {
            return this.f5825c + ":" + this.f5829g;
        }
        return "get|" + this.f5824b.replace("|", ".") + "|" + this.f5849A + "|" + this.f5835m + "|" + this.f5829g;
    }

    /* renamed from: f */
    public String m1323f() {
        return this.f5826d + ":" + this.f5829g;
    }

    /* renamed from: g */
    public boolean m1322g() {
        Core m1087A = Core.m1087A();
        if (this.f5846x && "ANY".equals(this.f5833k)) {
            return true;
        }
        return (this.f5846x && this.f5833k != null && this.f5833k.contains("+") && m1087A.m988c(true) >= this.f5834l) || m1087A.m988c(true) == this.f5834l;
    }
}
