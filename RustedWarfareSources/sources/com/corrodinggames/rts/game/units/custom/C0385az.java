package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.az */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/az.class */
public class C0385az {

    /* renamed from: a */
    public static final C0385az f2318a = m3996a(VariableScope.nullOrMissingString);

    /* renamed from: b */
    public C0400ba[] f2319b;

    /* renamed from: c */
    public String f2320c;

    /* renamed from: d */
    public int f2321d = -1;

    /* renamed from: e */
    public String f2322e;

    /* renamed from: a */
    public static C0385az m3996a(String str) {
        C0385az c0385az = new C0385az();
        ArrayList arrayList = new ArrayList();
        C0400ba c0400ba = new C0400ba();
        c0400ba.f2486a = null;
        c0400ba.f2487b = str;
        arrayList.add(c0400ba);
        c0385az.f2319b = (C0400ba[]) arrayList.toArray(new C0400ba[0]);
        c0385az.m3994b();
        return c0385az;
    }

    /* renamed from: b */
    public static C0385az m3993b(String str) {
        C0385az c0385az = new C0385az();
        c0385az.f2322e = str;
        c0385az.m3994b();
        return c0385az;
    }

    public C0385az() {
    }

    public C0385az(C0400ba[] c0400baArr) {
        this.f2319b = c0400baArr;
    }

    /* renamed from: a */
    public boolean m3997a() {
        C0400ba[] c0400baArr;
        if (this.f2319b != null) {
            for (C0400ba c0400ba : this.f2319b) {
                if (c0400ba.f2487b != null && !VariableScope.nullOrMissingString.equals(c0400ba.f2487b)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m3995a(String str, String str2) {
        if (this.f2319b != null) {
            for (C0400ba c0400ba : this.f2319b) {
                c0400ba.m3958a(str, str2);
            }
        } else {
            LoggerMaybe.m990b("LocaleString: replaceAll with null strings");
        }
        this.f2321d = -1;
    }

    /* renamed from: b */
    public String m3994b() {
        C0400ba[] c0400baArr;
        C0400ba[] c0400baArr2;
        if (this.f2321d == C0820a.f5401c) {
            return this.f2320c;
        }
        if (this.f2322e != null) {
            this.f2321d = C0820a.f5401c;
            this.f2320c = C0820a.m1689a(this.f2322e, new Object[0]);
            return this.f2320c;
        }
        String m1686c = C0820a.m1686c();
        for (C0400ba c0400ba : this.f2319b) {
            if (m1686c.equals(c0400ba.f2486a)) {
                this.f2321d = C0820a.f5401c;
                this.f2320c = c0400ba.f2487b;
                return this.f2320c;
            }
        }
        for (C0400ba c0400ba2 : this.f2319b) {
            if (c0400ba2.f2486a == null) {
                this.f2321d = C0820a.f5401c;
                this.f2320c = c0400ba2.f2487b;
                return this.f2320c;
            }
        }
        this.f2321d = C0820a.f5401c;
        this.f2320c = "<NO DEFAULT TEXT FOUND>";
        return this.f2320c;
    }
}
