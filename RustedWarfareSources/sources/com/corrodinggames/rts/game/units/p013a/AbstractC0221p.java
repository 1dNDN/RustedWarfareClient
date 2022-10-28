package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/p.class */
public abstract class AbstractC0221p extends AbstractC0224s {
    public AbstractC0221p(String str) {
        super("c__cut_" + str);
        this.f1460g = 0.0f;
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
    /* renamed from: i */
    public InterfaceC0303as mo2977i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        return EnumC0226u.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        return EnumC0225t.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        return false;
    }

    /* renamed from: K */
    public AbstractC0623y m4188K() {
        AbstractC0623y abstractC0623y = null;
        Iterator it = AbstractC1120w.f6962eo.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w;
                if (abstractC0623y2.f1644cE) {
                    abstractC0623y = abstractC0623y2;
                }
            }
        }
        return abstractC0623y;
    }

    /* renamed from: L */
    public boolean m4187L() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        AbstractC0623y m4188K = m4188K();
        if (m4188K != null) {
            return (m4188K instanceof C0555h) || m1071A.f6139bs == m4188K.f1609bV;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        return mo2986b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e_ */
    public boolean mo2981e_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4154s() {
        if (!m4187L()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: G */
    public boolean mo4158G() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public float mo3013l() {
        if (!C0797f.f5248bB) {
            return 1.0f;
        }
        return 1.0f;
    }
}
