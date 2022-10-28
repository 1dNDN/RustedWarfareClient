package com.corrodinggames.rts.game.units.custom.p016a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0351ai;
import com.corrodinggames.rts.game.units.custom.C0458p;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.C0206a;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/c.class */
public class C0338c extends C0206a {

    /* renamed from: b */
    public LogicBoolean f2036b;

    /* renamed from: c */
    public LogicBoolean f2037c;

    /* renamed from: d */
    public C0351ai f2038d;

    /* renamed from: e */
    public LogicBoolean f2039e;

    /* renamed from: f */
    public C0351ai f2040f;

    /* renamed from: g */
    public LogicBoolean f2041g;

    /* renamed from: h */
    public C0351ai f2042h;

    /* renamed from: i */
    public boolean f2043i;

    /* renamed from: j */
    public LogicBoolean f2044j;

    /* renamed from: k */
    public C0424b f2045k;

    /* renamed from: l */
    public C0424b f2046l;

    /* renamed from: m */
    public C0424b f2047m;

    /* renamed from: a */
    public static C0206a m3965a(C0339d c0339d) {
        boolean z = false;
        if (c0339d.f2072y != null && c0339d.f2072y != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2074A != null && c0339d.f2074A != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2076C != null && c0339d.f2076C != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2068u != null && c0339d.f2068u != LogicBoolean.trueBoolean) {
            z = true;
        }
        if (c0339d.f2128aC != null && c0339d.f2128aC != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (c0339d.f2103ad != null) {
            z = true;
        }
        if (c0339d.f2063p != null) {
            z = true;
        }
        if (!z) {
            return C0206a.f1426a;
        }
        C0338c c0338c = new C0338c();
        c0338c.f2037c = c0339d.f2072y;
        c0338c.f2038d = c0339d.f2073z;
        c0338c.f2039e = c0339d.f2074A;
        c0338c.f2040f = c0339d.f2075B;
        c0338c.f2041g = c0339d.f2076C;
        c0338c.f2042h = c0339d.f2077D;
        c0338c.f2036b = c0339d.f2068u;
        c0338c.f2044j = c0339d.f2128aC;
        c0338c.f2046l = c0339d.f2103ad;
        c0338c.f2045k = c0339d.f2063p;
        c0338c.f2047m = c0339d.f2064q;
        c0338c.f2043i = c0339d.f2071x;
        return c0338c;
    }

    /* renamed from: a */
    public static C0206a m3964a(C0458p c0458p) {
        boolean z = false;
        if (c0458p.f3334f != null && c0458p.f3334f != LogicBoolean.falseBoolean) {
            z = true;
        }
        if (!z) {
            return C0206a.f1426a;
        }
        C0338c c0338c = new C0338c();
        c0338c.f2037c = c0458p.f3334f;
        c0338c.f2038d = C0351ai.m3868a(c0458p.f3335g);
        return c0338c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public boolean mo3969a(AbstractC0244am abstractC0244am) {
        return this.f2043i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: b */
    public boolean mo3962b(AbstractC0244am abstractC0244am) {
        return m3968a(abstractC0244am, -1);
    }

    /* renamed from: a */
    public boolean m3968a(AbstractC0244am abstractC0244am, int i) {
        if (this.f2037c != null && (i == -1 || i == 1)) {
            if (!(abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0916l.m943n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1708r().mo3403i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.f2037c.read((AbstractC0623y) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2039e != null && (i == -1 || i == 2)) {
            if (!(abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0916l.m943n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1708r().mo3403i() + " is not a OrderableUnit unit");
                return false;
            } else if (this.f2039e.read((AbstractC0623y) abstractC0244am)) {
                return true;
            }
        }
        if (this.f2041g != null) {
            if (i == -1 || i == 3) {
                if (!(abstractC0244am instanceof AbstractC0623y)) {
                    AbstractC0916l.m943n("CustomActionConfig lockedInGame:" + abstractC0244am.mo1708r().mo3403i() + " is not a OrderableUnit unit");
                    return false;
                } else if (this.f2041g.read((AbstractC0623y) abstractC0244am)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: c */
    public String mo3961c(AbstractC0244am abstractC0244am) {
        if (m3968a(abstractC0244am, 1) && this.f2038d != null) {
            return this.f2038d.m3863b(abstractC0244am);
        }
        if (m3968a(abstractC0244am, 2) && this.f2040f != null) {
            return this.f2040f.m3863b(abstractC0244am);
        }
        if (m3968a(abstractC0244am, 3) && this.f2042h != null) {
            return this.f2042h.m3863b(abstractC0244am);
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public boolean mo3966a(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2036b != null) {
            if (!(abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0916l.m943n("CustomActionConfig isAvailable:" + abstractC0244am.mo1708r().mo3403i() + " is not a OrderableUnit unit");
                return true;
            } else if (z) {
                return C0785ad.m1902a(this.f2036b, (AbstractC0623y) abstractC0244am);
            } else {
                return this.f2036b.read((AbstractC0623y) abstractC0244am);
            }
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: d */
    public boolean mo3960d(AbstractC0244am abstractC0244am) {
        if (this.f2044j != null) {
            if (!(abstractC0244am instanceof AbstractC0623y)) {
                AbstractC0916l.m943n("CustomActionConfig isGuiBlinking:" + abstractC0244am.mo1708r().mo3403i() + " is not a OrderableUnit unit");
                return true;
            }
            return this.f2044j.read((AbstractC0623y) abstractC0244am);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public void mo3967a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        if (this.f2046l != null) {
            this.f2046l.m3696h(abstractC0244am);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: a */
    public C0424b mo3970a() {
        return this.f2045k;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.C0206a
    /* renamed from: b */
    public C0424b mo3963b() {
        return this.f2047m;
    }
}
