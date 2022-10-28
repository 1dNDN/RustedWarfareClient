package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.Core;
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
        super("s_" + interfaceC0303as.mo4464v());
        this.f1493b = new ArrayList();
        this.f1494c = 0;
        this.f1496e = null;
        this.f1460g = -9999.0f;
        this.f1492a = interfaceC0303as;
    }

    /* renamed from: b */
    public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    /* renamed from: c */
    public int mo3082c() {
        return 0;
    }

    /* renamed from: i */
    public InterfaceC0303as mo6163i() {
        return this.f1492a;
    }

    /* renamed from: e */
    public EnumC0226u mo3081e() {
        return EnumC0226u.f1483i;
    }

    /* renamed from: f */
    public EnumC0225t mo3079f() {
        if (Core.m1012as() && !C0797f.f5247bA) {
            return EnumC0225t.f1472h;
        }
        return EnumC0225t.f1471g;
    }

    /* renamed from: g */
    public boolean mo3078g() {
        return false;
    }

    /* renamed from: c */
    public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
        Core m1087A = Core.m1087A();
        if (!z) {
            if (m1087A.f6117bS.m1811p() == 1) {
                return false;
            }
            boolean z2 = false;
            Iterator it = AbstractC0244am.f1590bD.iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
                if (abstractC0244am2.f1644cE && abstractC0244am2.mo1758r() != this.f1492a) {
                    m1087A.f6117bS.m1818l(abstractC0244am2);
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
            if (abstractC0244am3.f1644cE && abstractC0244am3.mo1758r() == this.f1492a) {
                m1087A.f6117bS.m1818l(abstractC0244am3);
            }
        }
        return true;
    }

    /* renamed from: d */
    public String mo3129d() {
        Core.m1087A();
        if (this.f1496e instanceof C0555h) {
            return "Editor";
        }
        return VariableScope.nullOrMissingString + this.f1492a.mo4478e() + " x" + this.f1494c;
    }

    /* renamed from: b */
    public String mo3085b() {
        return "UnitInfo";
    }

    /* renamed from: w */
    public String m4840w(AbstractC0244am abstractC0244am) {
        if (this.f1496e instanceof C0555h) {
            return "Editor";
        }
        return this.f1492a.mo4478e();
    }

    /* renamed from: e_ */
    public boolean mo3080e_() {
        return true;
    }

    /* renamed from: s */
    public boolean mo4924s() {
        return true;
    }

    /* renamed from: u */
    public boolean mo4857u() {
        return true;
    }

    /* renamed from: C */
    public boolean m4848C() {
        return true;
    }

    /* renamed from: a */
    public String mo3088a() {
        String str = VariableScope.nullOrMissingString;
        if (this.f1496e instanceof C0555h) {
            return VariableScope.nullOrMissingString;
        }
        if (this.f1495d) {
            str = "(Left click to exclusively select / Right click to unselect)\n";
        }
        return str + this.f1492a.mo4477f();
    }

    /* renamed from: K */
    public void m4846K() {
        Core m1087A = Core.m1087A();
        if (this.f1497f == m1087A.f6117bS.f5155S) {
            return;
        }
        this.f1497f = m1087A.f6117bS.f5155S;
        this.f1494c = 0;
        this.f1495d = false;
        this.f1496e = null;
        AbstractC0244am[] m498a = m1087A.f6117bS.f5258bL.m498a();
        int size = m1087A.f6117bS.f5258bL.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE) {
                    if (abstractC0623y.mo1758r() == this.f1492a) {
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

    /* renamed from: j_ */
    public float mo4946j_() {
        return this.f1460g - this.f1494c;
    }

    /* renamed from: G */
    public boolean mo4927G() {
        return true;
    }

    /* renamed from: l_ */
    public boolean mo4943l_() {
        return true;
    }
}
