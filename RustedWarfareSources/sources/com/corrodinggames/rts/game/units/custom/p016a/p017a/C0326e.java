package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/e.class */
public class C0326e extends AbstractC0321a {

    /* renamed from: a */
    public C0413bn f1955a;

    /* renamed from: b */
    public ArrayList f1956b;

    /* renamed from: c */
    public int f1957c;

    /* renamed from: d */
    public boolean f1958d;

    /* renamed from: e */
    public boolean f1959e;

    /* renamed from: f */
    public boolean f1960f;

    /* renamed from: a */
    public static void m3982a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0413bn m3763a = C0413bn.m3763a(c0453l, c1072ab, str, str2 + "attachments_addNewUnits");
        int intValue = c1072ab.m645b(str, str2 + "attachments_deleteNumUnits", (Integer) 0).intValue();
        boolean booleanValue = c1072ab.m663a(str, str2 + "attachments_disconnect", (Boolean) false).booleanValue();
        boolean booleanValue2 = c1072ab.m663a(str, str2 + "attachments_unload", (Boolean) false).booleanValue();
        boolean booleanValue3 = c1072ab.m663a(str, str2 + "disconnectFromParent", (Boolean) false).booleanValue();
        if (!m3763a.m3758b() || intValue != 0 || booleanValue3 || booleanValue || booleanValue2) {
            C0326e c0326e = new C0326e();
            c0326e.f1955a = m3763a;
            String m644b = c1072ab.m644b(str, "attachments_onlyOnSlots", (String) null);
            if (m644b != null) {
                for (String str4 : m644b.split(",")) {
                    String trim = str4.trim();
                    if (!trim.equals(VariableScope.nullOrMissingString)) {
                        C0399m m3402i = c0453l.m3402i(trim);
                        if (c0326e.f1956b == null) {
                            c0326e.f1956b = new ArrayList();
                        }
                        if (m3402i == null) {
                            throw new C0412bm("[" + str + "]attachments_onlyOnSlots: Could not find attachment slot with name: " + trim);
                        }
                        c0326e.f1956b.add(m3402i);
                    }
                }
            }
            c0326e.f1957c = intValue;
            c0326e.f1960f = booleanValue3;
            c0326e.f1958d = booleanValue;
            c0326e.f1959e = booleanValue2;
            c0339d.f2101ab.add(c0326e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if ((this.f1958d || this.f1959e) && c0451j.f2868C != null && c0451j.f2868C.size() > 0) {
            int size = c0451j.f2868C.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) c0451j.f2868C.get(size);
                if (abstractC0244am2 != null) {
                    if (this.f1956b != null) {
                        boolean z = false;
                        Iterator it = this.f1956b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C0399m) it.next()).m3796a() == size) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (!z) {
                            continue;
                        }
                    }
                    if (!(abstractC0244am2 instanceof AbstractC0623y)) {
                        AbstractC0916l.m963e("Failed to deattach unit:" + abstractC0244am2.mo1708r().mo3403i() + " is not an OrderableUnit");
                    } else {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                        if (this.f1959e) {
                            c0451j.m3539a((AbstractC0244am) abstractC0623y, true, c0451j.f2867B.size() % 2 == 0);
                        } else {
                            abstractC0623y.m2780bx();
                        }
                    }
                }
                size--;
            }
        }
        if (this.f1957c != 0) {
            for (int i2 = 0; i2 < this.f1957c; i2++) {
                if (c0451j.f2868C != null && c0451j.f2868C.size() > 0) {
                    for (int size2 = c0451j.f2868C.size() - 1; size2 >= 0; size2--) {
                        AbstractC0244am abstractC0244am3 = (AbstractC0244am) c0451j.f2868C.get(size2);
                        if (abstractC0244am3 != null) {
                            if (this.f1956b != null) {
                                boolean z2 = false;
                                Iterator it2 = this.f1956b.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((C0399m) it2.next()).m3796a() == size2) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (!z2) {
                                }
                            }
                            abstractC0244am3.m4088ch();
                            break;
                        }
                    }
                }
            }
        }
        if (this.f1955a != null) {
            C1101m c1101m = new C1101m();
            this.f1955a.m3760a(c1101m, c0451j.f1609bV, (AbstractC0244am) c0451j, true);
            Iterator it3 = c1101m.iterator();
            while (it3.hasNext()) {
                AbstractC0244am abstractC0244am4 = (AbstractC0244am) it3.next();
                boolean z3 = false;
                if (!(abstractC0244am4 instanceof AbstractC0623y)) {
                    AbstractC0916l.m963e("Failed to attach unit:" + abstractC0244am4.mo1708r().mo3403i() + " is not an OrderableUnit");
                } else {
                    AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am4;
                    if (this.f1956b != null) {
                        Iterator it4 = this.f1956b.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            C0399m c0399m = (C0399m) it4.next();
                            if (c0451j.m3537a(c0399m) == null && c0451j.mo2887a(abstractC0623y2, c0399m)) {
                                abstractC0623y2.f1654cO = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    } else {
                        Iterator it5 = c0451j.f2863x.f2980az.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            C0399m c0399m2 = (C0399m) it5.next();
                            if (c0451j.m3537a(c0399m2) == null && c0451j.mo2887a(abstractC0623y2, c0399m2)) {
                                abstractC0623y2.f1654cO = -9999;
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (!z3) {
                        abstractC0623y2.mo446a();
                    }
                }
            }
        }
        if (this.f1960f) {
            if (c0451j.f1652cM != null) {
                c0451j.m2780bx();
            }
            if (c0451j.f1651cL != null) {
                if (c0451j.f1651cL instanceof InterfaceC0242ak) {
                    ((InterfaceC0242ak) c0451j.f1651cL).mo3133e(c0451j);
                    return true;
                }
                AbstractC0916l.m957g("transportedBy is not a TransportInterface");
                c0451j.f1651cL = null;
                return true;
            }
            return true;
        }
        return true;
    }
}
