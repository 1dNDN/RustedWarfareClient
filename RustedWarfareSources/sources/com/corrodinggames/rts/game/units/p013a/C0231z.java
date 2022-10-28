package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/z.class */
public class C0231z extends AbstractC0224s {

    /* renamed from: a */
    InterfaceC0303as f1492a;

    /* renamed from: b */
    ArrayList f1493b;

    /* renamed from: c */
    int f1494c;

    /* renamed from: d */
    boolean f1495d;

    /* renamed from: e */
    AbstractC0623y f1496e;

    /* renamed from: f */
    int f1497f;

    public C0231z(InterfaceC0303as interfaceC0303as) {
        super("s_" + interfaceC0303as.mo3379v());
        this.f1493b = new ArrayList();
        this.f1494c = 0;
        this.f1496e = null;
        this.f1460g = -9999.0f;
        this.f1492a = interfaceC0303as;
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
        return this.f1492a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        return EnumC0226u.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        if (AbstractC0916l.m996as() && !C0797f.f5247bA) {
            return EnumC0225t.infoOnlyNoBox;
        }
        return EnumC0225t.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public boolean mo3042c(AbstractC0244am abstractC0244am, boolean z) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (!z) {
            if (m1071A.f6165bS.m1760p() == 1) {
                return false;
            }
            boolean z2 = false;
            Iterator it = AbstractC0244am.f1590bD.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
                if (abstractC0244am2.f1644cE && abstractC0244am2.mo1708r() != this.f1492a) {
                    m1071A.f6165bS.m1767l(abstractC0244am2);
                    z2 = true;
                }
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        Iterator it2 = AbstractC0244am.f1590bD.iterator();
        while (it2.hasNext()) {
            AbstractC0244am abstractC0244am3 = (AbstractC0244am) it2.next();
            if (abstractC0244am3.f1644cE && abstractC0244am3.mo1708r() == this.f1492a) {
                m1071A.f6165bS.m1767l(abstractC0244am3);
            }
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        AbstractC0916l.m1071A();
        if (this.f1496e instanceof C0555h) {
            return "Editor";
        }
        return VariableScope.nullOrMissingString + this.f1492a.mo3411e() + " x" + this.f1494c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: w */
    public String mo4153w(AbstractC0244am abstractC0244am) {
        if (this.f1496e instanceof C0555h) {
            return "Editor";
        }
        return this.f1492a.mo3411e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e_ */
    public boolean mo2981e_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4154s() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo3930u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: C */
    public boolean mo4159C() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        String str = VariableScope.nullOrMissingString;
        if (this.f1496e instanceof C0555h) {
            return VariableScope.nullOrMissingString;
        }
        if (this.f1495d) {
            str = "(Left click to exclusively select / Right click to unselect)\n";
        }
        return str + this.f1492a.mo3409f();
    }

    /* renamed from: K */
    public void m4157K() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (this.f1497f == m1071A.f6165bS.f5155S) {
            return;
        }
        this.f1497f = m1071A.f6165bS.f5155S;
        this.f1494c = 0;
        this.f1495d = false;
        this.f1496e = null;
        AbstractC0244am[] m498a = m1071A.f6165bS.f5258bL.m498a();
        int size = m1071A.f6165bS.f5258bL.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE) {
                    if (abstractC0623y.mo1708r() == this.f1492a) {
                        this.f1494c++;
                        if (this.f1496e == null) {
                            this.f1496e = abstractC0623y;
                        }
                    } else {
                        this.f1495d = true;
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j_ */
    public float mo4156j_() {
        return this.f1460g - this.f1494c;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: G */
    public boolean mo4158G() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l_ */
    public boolean mo4155l_() {
        return true;
    }
}
