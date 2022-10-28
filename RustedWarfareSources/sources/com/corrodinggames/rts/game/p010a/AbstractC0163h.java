package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.Core;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/h.class */
public abstract class AbstractC0163h extends AbstractC0170o {

    /* renamed from: F */
    ArrayList f687F;

    /* renamed from: G */
    ArrayList f688G;

    /* renamed from: c */
    public abstract void m5436c(float f);

    /* renamed from: l */
    public int m5435l() {
        return this.f687F.size();
    }

    /* renamed from: a */
    public boolean m5441a() {
        return false;
    }

    /* renamed from: b */
    public boolean m5439b() {
        return false;
    }

    public AbstractC0163h(C0136a c0136a) {
        super(c0136a);
        this.f687F = new ArrayList();
        this.f688G = new ArrayList();
    }

    /* renamed from: m */
    public boolean m5434m() {
        Iterator it = this.f760R.f599bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0169n) && ((C0169n) abstractC0170o).f752m == this) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void m5433n() {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y == null || abstractC0623y.f1607bT) {
                if (abstractC0623y != null && abstractC0623y.f3947aA == this) {
                    abstractC0623y.f3947aA = null;
                }
                if (abstractC0623y != null) {
                    this.f688G.remove(abstractC0623y);
                }
                it.remove();
            }
        }
    }

    /* renamed from: o */
    public void m5432o() {
        Iterator it = this.f688G.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y == null || abstractC0623y.f1607bT || abstractC0623y.f1651cL != null || abstractC0623y.f1652cM != null) {
                it.remove();
            }
        }
    }

    /* renamed from: p */
    public void m5431p() {
        m5430q();
        this.f688G.clear();
        super.m5358p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5440a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y.f3947aA != null) {
            abstractC0623y.f3947aA.m5437b(abstractC0623y);
        }
        if (abstractC0623y.f1609bV != null && abstractC0623y.f1609bV != this.f760R) {
            Core.m973g("unit.team:" + abstractC0623y.f1609bV.f1306k + ", ai:" + this.f760R.f1306k);
        }
        this.f687F.add(abstractC0623y);
        abstractC0623y.f3947aA = this;
    }

    /* renamed from: b */
    public void m5437b(AbstractC0623y abstractC0623y) {
        this.f687F.remove(abstractC0623y);
        this.f688G.remove(abstractC0623y);
        if (abstractC0623y.f3947aA == this) {
            abstractC0623y.f3947aA = null;
        }
    }

    /* renamed from: q */
    public void m5430q() {
        Iterator it = this.f687F.iterator();
        while (it.hasNext()) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
            if (abstractC0623y != null && abstractC0623y.f3947aA == this) {
                abstractC0623y.f3947aA = null;
            }
        }
        this.f687F.clear();
    }

    /* renamed from: b */
    public void m5438b(float f) {
    }
}
