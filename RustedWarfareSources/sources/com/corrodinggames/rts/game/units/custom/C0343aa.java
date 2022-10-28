package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;

/* renamed from: com.corrodinggames.rts.game.units.custom.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aa.class */
public class C0343aa {

    /* renamed from: a */
    String f2152a;

    /* renamed from: b */
    String f2153b;

    /* renamed from: c */
    int f2154c;

    /* renamed from: d */
    int f2155d;

    /* renamed from: e */
    String f2156e;

    /* renamed from: f */
    C0453l f2157f;

    /* renamed from: a */
    public String m3927a() {
        String str = "from internal units";
        if (this.f2152a != null) {
            str = "from mod:'" + this.f2152a + "'";
        }
        C0824b m1653e = AbstractC0916l.m1071A().f6172bZ.m1653e(this.f2152a);
        if (m1653e != null) {
            if (!m1653e.m1623m()) {
                str = str + " (You seem to have this mod but it is not enabled)";
            } else {
                str = str + " (You seem to have this mod but it might be a different version)";
            }
        }
        String str2 = VariableScope.nullOrMissingString;
        if (this.f2157f != null && this.f2156e != null) {
            if (this.f2157f.f2936H == null) {
                str2 = " (Extra debug not enabled)";
            } else {
                String[] split = this.f2156e.split("\n");
                String[] split2 = this.f2157f.f2936H.split("\n");
                int m2070c = C0758f.m2070c(split.length, split2.length);
                if (split.length != split2.length) {
                    str2 = str2 + "Line length difference: " + split.length + " vs " + split2.length;
                }
                int i = 0;
                while (true) {
                    if (i >= m2070c) {
                        break;
                    } else if (split[i].equals(split2[i])) {
                        i++;
                    } else {
                        str2 = str2 + "Difference on line " + i + ": '" + split[i] + "' vs '" + split2[i] + "'";
                        break;
                    }
                }
            }
        }
        if (this.f2155d == -1) {
            return "The server requires the unit:" + this.f2153b + " that was not found " + str + str2;
        }
        return "Found unit:" + this.f2153b + " but it does not match the server's copy " + str + str2 + " (checksum c:" + this.f2155d + " s:" + this.f2154c + ")";
    }
}
