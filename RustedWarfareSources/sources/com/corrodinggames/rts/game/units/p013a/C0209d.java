package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0749e;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/d.class */
public class C0209d extends AbstractC0224s {

    /* renamed from: a */
    int f1430a;

    /* renamed from: b */
    EnumC0205a f1431b;

    public C0209d() {
        super("c_7");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo2984b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo2983c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n */
    public EnumC0249ar mo2977i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        return EnumC0226u.directToAction;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        return EnumC0225t.none;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return "Attack Mode";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        EnumC0205a m4207q = m4207q();
        if (m4207q != null) {
            return m4207q.name();
        }
        return "NA";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e_ */
    public boolean mo2981e_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public void mo4175c(AbstractC0244am abstractC0244am) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        EnumC0205a m4209a = m4209a(m4206r());
        C0749e m2349b = m1071A.f6178cf.m2349b(abstractC0244am.f1609bV);
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (abstractC0244am2 instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                if (abstractC0623y.f1644cE) {
                    m2349b.m2257a(abstractC0623y);
                }
            }
        }
        m2349b.m2260a(m4209a);
        this.f1430a = m1071A.f6165bS.f5155S;
        this.f1431b = m4209a;
    }

    /* renamed from: a */
    public EnumC0205a m4209a(EnumC0205a enumC0205a) {
        if (enumC0205a == EnumC0205a.onlyInRange) {
            return EnumC0205a.guardArea;
        }
        if (enumC0205a == EnumC0205a.onlyInRange) {
            return EnumC0205a.aggressive;
        }
        return EnumC0205a.onlyInRange;
    }

    /* renamed from: q */
    public EnumC0205a m4207q() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        EnumC0205a m4206r = m4206r();
        this.f1430a = m1071A.f6165bS.f5155S;
        this.f1431b = m4206r;
        return m4206r;
    }

    /* renamed from: r */
    public EnumC0205a m4206r() {
        if (this.f1430a == AbstractC0916l.m1071A().f6165bS.f5155S && this.f1431b != null) {
            return this.f1431b;
        }
        EnumC0205a enumC0205a = null;
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE) {
                    if (enumC0205a == null || enumC0205a == abstractC0623y.f3896O) {
                        enumC0205a = abstractC0623y.f3896O;
                    } else {
                        enumC0205a = EnumC0205a.mixed;
                    }
                }
            }
        }
        return enumC0205a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo2985b(AbstractC0244am abstractC0244am) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        return mo2986b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4154s() {
        return true;
    }
}
