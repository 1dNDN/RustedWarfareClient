package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;

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
    public String f5831j;

    /* renamed from: k */
    public String f5832k;

    /* renamed from: l */
    public int f5833l;

    /* renamed from: m */
    public boolean f5834m;

    /* renamed from: n */
    public String f5835n;

    /* renamed from: o */
    public long f5836o;

    /* renamed from: p */
    public int f5837p;

    /* renamed from: q */
    public String f5838q;

    /* renamed from: r */
    public String f5839r;

    /* renamed from: s */
    public String f5840s;

    /* renamed from: t */
    public String f5841t;

    /* renamed from: u */
    public String f5842u;

    /* renamed from: x */
    public boolean f5843x;

    /* renamed from: y */
    public boolean f5844y;

    /* renamed from: z */
    public String f5845z;

    /* renamed from: A */
    public int f5846A;

    /* renamed from: i */
    public long f5847i = -1;

    /* renamed from: v */
    public int f5848v = -1;

    /* renamed from: w */
    public int f5849w = 8;

    /* renamed from: a */
    public boolean m1315a() {
        String str = LoggerMaybe.m1079A().f6122bX.f5620bK;
        if (str != null && str.equals(this.f5824b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String m1314b() {
        String str;
        String m1313c = m1313c();
        if (m1313c != null) {
            String str2 = this.f5828f;
            if (str2 != null) {
                str2 = str2.replace("\\n", "\n");
            }
            return (VariableScope.nullOrMissingString + str2 + "\n") + "Url: " + m1313c + "\n";
        }
        String str3 = VariableScope.nullOrMissingString;
        if (this.f5823a) {
            str3 = str3 + "Lan: " + this.f5826d + ":" + this.f5829g + "\n";
        }
        String str4 = (str3 + "User: " + this.f5835n + "\n") + "Map: " + ActivityC0117i.m5215e(this.f5838q) + "\n";
        if (this.f5834m) {
            str4 = str4 + "Password Required\n";
        }
        if (!this.f5830h && !this.f5823a) {
            str4 = str4 + "Port: not open (Connecting over the internet may fail)\n";
        }
        if ("ANY".equalsIgnoreCase(this.f5832k)) {
            str = str4 + "Version: " + this.f5832k + "\n";
        } else {
            str = str4 + "Version: v" + this.f5832k + (m1309g() ? VariableScope.nullOrMissingString : " (different game version!)") + "\n";
        }
        if (this.f5845z != null && !this.f5845z.equals(VariableScope.nullOrMissingString)) {
            str = str + "Mods Needed: " + this.f5845z + "\n";
        }
        return str;
    }

    /* renamed from: c */
    public String m1313c() {
        return this.f5827e;
    }

    /* renamed from: d */
    public boolean m1312d() {
        return this.f5827e != null;
    }

    /* renamed from: e */
    public String m1311e() {
        if (this.f5846A == 0) {
            return this.f5825c + ":" + this.f5829g;
        }
        return "get|" + this.f5824b.replace("|", ".") + "|" + this.f5846A + "|" + this.f5834m + "|" + this.f5829g;
    }

    /* renamed from: f */
    public String m1310f() {
        return this.f5826d + ":" + this.f5829g;
    }

    /* renamed from: g */
    public boolean m1309g() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (this.f5843x && "ANY".equals(this.f5832k)) {
            return true;
        }
        return (this.f5843x && this.f5832k != null && this.f5832k.contains("+") && m1079A.m980c(true) >= this.f5833l) || m1079A.m980c(true) == this.f5833l;
    }
}
