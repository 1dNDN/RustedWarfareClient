package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;
import com.corrodinggames.rts.gameFramework.p041i.C0871f;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.units.a.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/y.class */
public class C0230y extends AbstractC0224s {

    /* renamed from: a */
    public boolean f1491a;

    public C0230y(boolean z) {
        super("c_5");
        this.f1460g = -9990.0f;
        this.f1491a = z;
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
        return null;
    }

    /* renamed from: e */
    public EnumC0226u mo3081e() {
        return EnumC0226u.f1483i;
    }

    /* renamed from: f */
    public EnumC0225t mo3079f() {
        return EnumC0225t.f1471g;
    }

    /* renamed from: g */
    public boolean mo3078g() {
        return false;
    }

    /* renamed from: K */
    public AbstractC0623y m4853K() {
        Core m1087A = Core.m1087A();
        AbstractC0244am[] m498a = m1087A.f6117bS.f5258bL.m498a();
        int size = m1087A.f6117bS.f5258bL.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1644cE) {
                    return abstractC0623y;
                }
            }
        }
        return null;
    }

    /* renamed from: L */
    public boolean m4852L() {
        Core m1087A = Core.m1087A();
        AbstractC0623y m4853K = m4853K();
        if (m4853K != null) {
            return (m4853K instanceof C0555h) || m1087A.f6099bs == m4853K.f1609bV;
        }
        return false;
    }

    /* renamed from: d */
    public String mo3129d() {
        String str = "UnitInfo";
        Core m1087A = Core.m1087A();
        AbstractC0623y m4853K = m4853K();
        if (m4853K != null) {
            if (m4853K instanceof C0555h) {
                return "Editor";
            }
            if (!this.f1491a) {
                str = m1087A.f6117bS.f5114d.m2060a((AbstractC0244am) m4853K, false);
            } else {
                str = m1087A.f6117bS.f5114d.m2067a(m4853K.f1609bV);
            }
        }
        return str;
    }

    /* renamed from: e_ */
    public boolean mo3080e_() {
        return true;
    }

    /* renamed from: b */
    public String mo3085b() {
        return "UnitInfo";
    }

    /* renamed from: d */
    public String mo4951d(AbstractC0244am abstractC0244am) {
        if (this.f1491a) {
            return VariableScope.nullOrMissingString;
        }
        if (abstractC0244am != null) {
            return abstractC0244am.mo1758r().mo4478e();
        }
        return "UnitInfo";
    }

    /* renamed from: s */
    public boolean mo4924s() {
        if (!this.f1491a || !m4852L()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public boolean mo4857u() {
        if (this.f1491a) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public boolean m4855C() {
        return true;
    }

    /* renamed from: a */
    public String mo3088a() {
        C0871f c0871f;
        if (this.f1491a) {
            return VariableScope.nullOrMissingString;
        }
        AbstractC0623y m4853K = m4853K();
        if (m4853K != null) {
            String m2059a = C0760a.m2059a(m4853K, false, true, false);
            if (0 != 0) {
                try {
                    m4853K.mo2441a(new C0871f());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                m2059a = m2059a + "\n" + c0871f.f5822a;
            }
            return m2059a;
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: G */
    public boolean mo4927G() {
        return true;
    }
}
