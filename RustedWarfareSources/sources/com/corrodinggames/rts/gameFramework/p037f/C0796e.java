package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0725bj;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/e.class */
public class C0796e {

    /* renamed from: a */
    public String f5107a;

    /* renamed from: b */
    public String f5108b;

    /* renamed from: c */
    public float f5109c;

    /* renamed from: d */
    public float f5110d;

    public C0796e(String str, String str2) {
        this.f5107a = str;
        this.f5108b = str2;
    }

    public C0796e(String str, float f) {
        this.f5107a = str;
        this.f5109c = f;
        this.f5108b = null;
    }

    /* renamed from: a */
    public static ArrayList m1922a() {
        Core m1087A = Core.m1087A();
        ArrayList arrayList = new ArrayList();
        C0725bj c0725bj = null;
        if (m1087A.f6099bs != null) {
            c0725bj = m1087A.f6123bY.m2450a(m1087A.f6099bs);
        }
        if (c0725bj != null) {
            if (m1087A.f6129ce != null && m1087A.f6129ce.f6668k) {
                arrayList.add(new C0796e("Lasted till wave: " + m1087A.f6129ce.f6675r, VariableScope.nullOrMissingString));
                if (!m1087A.f6129ce.f6669l) {
                    arrayList.add(new C0796e("Wave difficulty: " + m1087A.f6122bX.m1529c(m1087A.f6129ce.f6682y), VariableScope.nullOrMissingString));
                }
            }
            arrayList.add(new C0796e("Game Time", C0758f.m2199a(m1087A.f6102by / 1000)));
            arrayList.add(new C0796e("=============================", VariableScope.nullOrMissingString));
            arrayList.add(new C0796e("Units Killed", c0725bj.f4559c));
            arrayList.add(new C0796e("Buildings Killed", c0725bj.f4560d));
            arrayList.add(new C0796e("Experimentals Killed", c0725bj.f4561e));
            arrayList.add(new C0796e("=============================", VariableScope.nullOrMissingString));
            arrayList.add(new C0796e("Units Lost", c0725bj.f4562f));
            arrayList.add(new C0796e("Buildings Lost", c0725bj.f4563g));
            arrayList.add(new C0796e("Experimentals Lost", c0725bj.f4564h));
            arrayList.add(new C0796e("=============================", VariableScope.nullOrMissingString));
        }
        return arrayList;
    }
}
