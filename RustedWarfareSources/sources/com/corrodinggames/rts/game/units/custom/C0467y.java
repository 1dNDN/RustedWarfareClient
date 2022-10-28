package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/y.class */
public class C0467y {

    /* renamed from: a */
    public String f3357a;

    /* renamed from: b */
    public C0382aw[] f3358b;

    /* renamed from: c */
    final /* synthetic */ C0453l f3359c;

    /* renamed from: a */
    public boolean m3357a() {
        return (this.f3358b == null || this.f3358b.length == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m3354b() {
        return this.f3358b != null && (this.f3358b.length != 0 || this.f3358b == C0453l.f3269gc);
    }

    private C0467y(C0453l c0453l, String str) {
        this.f3359c = c0453l;
        this.f3357a = str;
        c0453l.f3266fZ.add(this);
    }

    /* renamed from: c */
    public void m3353c() {
        if (this.f3357a == null || this.f3357a.equals(VariableScope.nullOrMissingString)) {
            this.f3358b = C0453l.f3268gb;
        } else if (this.f3357a.equalsIgnoreCase("NONE")) {
            this.f3358b = C0453l.f3269gc;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f3357a.split(",")) {
                String[] split = str.trim().split("\\*");
                String str2 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                C0382aw m3412d = this.f3359c.m3412d(str2);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(m3412d);
                }
            }
            this.f3358b = (C0382aw[]) arrayList.toArray(C0453l.f3268gb);
        }
    }

    /* renamed from: a */
    public C0745e m3356a(float f, float f2, float f3, float f4, AbstractC1120w abstractC1120w) {
        return m3355a(f, f2, f3, f4, abstractC1120w, 0, (short) 0);
    }

    /* renamed from: a */
    public C0745e m3355a(float f, float f2, float f3, float f4, AbstractC1120w abstractC1120w, int i, short s) {
        C0745e c0745e = null;
        for (C0382aw c0382aw : this.f3358b) {
            C0745e m3837a = c0382aw.m3837a(f, f2, f3, f4, abstractC1120w, i, s);
            if (m3837a != null && c0745e == null) {
                c0745e = m3837a;
            }
        }
        return c0745e;
    }
}
