package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.Core;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bj.class */
public class C0409bj {

    /* renamed from: a */
    ArrayList f2538a = new ArrayList();

    /* renamed from: b */
    int f2539b;

    /* renamed from: a */
    public void m4162a(float f) {
        Iterator it = this.f2538a.iterator();
        while (it.hasNext()) {
            ((C0410bk) it.next()).f2541b = f;
        }
    }

    /* renamed from: a */
    public boolean m4163a() {
        return m4160a(0.0f, 0.0f, 1.0f, true);
    }

    /* renamed from: a */
    public boolean m4161a(float f, float f2, float f3) {
        return m4160a(f, f2, f3, false);
    }

    /* renamed from: a */
    public boolean m4160a(float f, float f2, float f3, boolean z) {
        if (this.f2538a.size() == 0) {
            return false;
        }
        if (this.f2539b >= this.f2538a.size()) {
            this.f2539b = 0;
        }
        C0410bk c0410bk = (C0410bk) this.f2538a.get(this.f2539b);
        Core m1087A = Core.m1087A();
        if (z) {
            m1087A.f6111bM.m2768c(c0410bk.f2540a, c0410bk.f2541b);
        } else {
            m1087A.f6111bM.m2776a(c0410bk.f2540a, c0410bk.f2541b, f, f2);
        }
        this.f2539b++;
        return true;
    }

    /* renamed from: a */
    public static C0409bj m4159a(C0453l c0453l, String str) {
        return m4158a(c0453l, str, (C0409bj) null);
    }

    /* renamed from: a */
    public static C0409bj m4158a(C0453l c0453l, String str, C0409bj c0409bj) {
        if ((str == null || str.equals(VariableScope.nullOrMissingString)) && c0409bj != null) {
            return c0409bj;
        }
        return new C0409bj(c0453l, str);
    }

    public C0409bj() {
    }

    public C0409bj(C0453l c0453l, String str) {
        String[] split;
        if (str == null || str.equals(VariableScope.nullOrMissingString) || str.equalsIgnoreCase("NONE")) {
            return;
        }
        for (String str2 : str.split(",")) {
            C0410bk c0410bk = new C0410bk(this);
            String trim = str2.trim();
            String str3 = VariableScope.nullOrMissingString;
            if (trim.startsWith("ROOT:")) {
                trim = trim.substring("ROOT:".length());
                str3 = str3 + "ROOT:";
            }
            if (trim.startsWith("SHARED:")) {
                trim = trim.substring("SHARED:".length());
                str3 = str3 + "SHARED:";
            }
            String[] split2 = trim.split(":");
            String str4 = null;
            String trim2 = split2[0].trim();
            if (split2.length != 1) {
                if (split2.length == 2) {
                    str4 = split2[1].trim();
                } else {
                    throw new RuntimeException("Unknown sound format:" + trim);
                }
            }
            if (str4 != null) {
                try {
                    c0410bk.f2541b = Float.parseFloat(str4);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Failed to parse volume float: '" + str4 + "' of sound: '" + trim + "'");
                }
            }
            c0410bk.f2540a = C0348af.m4295a(c0453l.f2916E, str3 + trim2, c0453l);
            if (c0410bk.f2540a != null) {
                this.f2538a.add(c0410bk);
            }
        }
    }
}
