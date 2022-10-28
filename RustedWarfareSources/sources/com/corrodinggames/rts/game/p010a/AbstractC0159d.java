package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/d.class */
public abstract class AbstractC0159d {

    /* renamed from: b */
    String f649b;

    /* renamed from: c */
    public ArrayList f650c = new ArrayList();

    /* renamed from: a */
    private ArrayList f651a = new ArrayList();

    /* renamed from: d */
    final /* synthetic */ C0136a f652d;

    /* renamed from: a */
    public abstract boolean mo4655a(InterfaceC0303as interfaceC0303as);

    public AbstractC0159d(C0136a c0136a, String str) {
        this.f652d = c0136a;
        this.f649b = str;
        c0136a.f603bp.add(this);
    }

    /* renamed from: b */
    public boolean m4652b(InterfaceC0303as interfaceC0303as) {
        Iterator it = this.f650c.iterator();
        while (it.hasNext()) {
            if (((C0160e) it.next()).f653a == interfaceC0303as) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public float m4650c(InterfaceC0303as interfaceC0303as) {
        return 10.0f;
    }

    /* renamed from: a */
    public ArrayList m4658a() {
        Collections.shuffle(this.f651a);
        return this.f651a;
    }

    /* renamed from: b */
    public void m4653b() {
        this.f650c = new ArrayList();
        float f = 0.0f;
        Iterator it = EnumC0249ar.f1791ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it.next();
            if (mo4655a(interfaceC0303as)) {
                float m4650c = m4650c(interfaceC0303as);
                f += m4650c;
                this.f650c.add(new C0160e(this, interfaceC0303as, m4650c));
            }
        }
        this.f651a = new ArrayList(this.f650c);
        if (this.f650c.size() == 0) {
            AbstractC0916l.m963e("AI: rebuildUnitMix: no units in unitMix:" + this.f649b);
        }
    }

    /* renamed from: c */
    public InterfaceC0303as m4651c() {
        return m4656a((EnumC0246ao) null, -1);
    }

    /* renamed from: a */
    public InterfaceC0303as m4657a(EnumC0246ao enumC0246ao) {
        return m4656a(enumC0246ao, -1);
    }

    /* renamed from: a */
    public boolean m4654a(InterfaceC0303as interfaceC0303as, EnumC0246ao enumC0246ao) {
        if (enumC0246ao == null) {
            return true;
        }
        EnumC0246ao mo3391o = interfaceC0303as.mo3391o();
        if (mo3391o == EnumC0246ao.OVER_CLIFF) {
            mo3391o = EnumC0246ao.LAND;
        }
        if (mo3391o == EnumC0246ao.OVER_CLIFF_WATER) {
            mo3391o = EnumC0246ao.HOVER;
        }
        if (mo3391o == enumC0246ao) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public InterfaceC0303as m4656a(EnumC0246ao enumC0246ao, int i) {
        if (this.f650c.size() == 0) {
            AbstractC0916l.m963e("AI: getRandomUnitType: no units in unitMix:" + this.f649b);
            return null;
        }
        float f = 0.0f;
        int i2 = 0;
        Iterator it = this.f650c.iterator();
        while (it.hasNext()) {
            C0160e c0160e = (C0160e) it.next();
            if (m4654a(c0160e.f653a, enumC0246ao) && (i == -1 || c0160e.f653a.mo3419c() <= i)) {
                f += c0160e.f654b;
                i2++;
            }
        }
        if (i2 == 0) {
            return null;
        }
        float m2074c = C0758f.m2074c(0.0f, f);
        float f2 = 0.0f;
        Iterator it2 = this.f650c.iterator();
        while (it2.hasNext()) {
            C0160e c0160e2 = (C0160e) it2.next();
            if (m4654a(c0160e2.f653a, enumC0246ao) && (i == -1 || c0160e2.f653a.mo3419c() <= i)) {
                f2 += c0160e2.f654b;
                if (f2 > m2074c) {
                    return c0160e2.f653a;
                }
            }
        }
        AbstractC0916l.m963e("Did not find getRandomUnit, this should only happen very rarely, name:" + this.f649b + " unitMix.size:" + this.f650c.size() + " minPrice:" + i + " movementType:" + enumC0246ao + " totalUnits:" + i2);
        return ((C0160e) this.f650c.get(this.f650c.size() - 1)).f653a;
    }
}
