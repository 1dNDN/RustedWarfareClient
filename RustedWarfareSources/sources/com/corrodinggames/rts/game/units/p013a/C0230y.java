package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3024b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3023c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo5648i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3022e() {
        return EnumC0226u.f1483i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3020f() {
        return EnumC0225t.f1471g;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3019g() {
        return false;
    }

    /* renamed from: K */
    public AbstractC0623y m4482K() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0244am[] m498a = m1072A.f6117bS.f5261bL.m498a();
        int size = m1072A.f6117bS.f5261bL.size();
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
    public boolean m4481L() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0623y m4482K = m4482K();
        if (m4482K != null) {
            return (m4482K instanceof C0555h) || m1072A.f6099bs == m4482K.f1609bV;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3054d() {
        String str = "UnitInfo";
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0623y m4482K = m4482K();
        if (m4482K != null) {
            if (m4482K instanceof C0555h) {
                return "Editor";
            }
            if (!this.f1491a) {
                str = m1072A.f6117bS.f5112d.m2008a((AbstractC0244am) m4482K, false);
            } else {
                str = m1072A.f6117bS.f5112d.m2015a(m4482K.f1609bV);
            }
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e_ */
    public boolean mo3021e_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3026b() {
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo4126d(AbstractC0244am abstractC0244am) {
        if (this.f1491a) {
            return VariableScope.nullOrMissingString;
        }
        if (abstractC0244am != null) {
            return abstractC0244am.mo5649r().mo4256e();
        }
        return "UnitInfo";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4475s() {
        if (!this.f1491a || !m4481L()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo4111u() {
        if (this.f1491a) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: C */
    public boolean mo4480C() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3029a() {
        C0871f c0871f;
        if (this.f1491a) {
            return VariableScope.nullOrMissingString;
        }
        AbstractC0623y m4482K = m4482K();
        if (m4482K != null) {
            String m2007a = C0760a.m2007a(m4482K, false, true, false);
            if (0 != 0) {
                try {
                    m4482K.mo2292a(new C0871f());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                m2007a = m2007a + "\n" + c0871f.f5822a;
            }
            return m2007a;
        }
        return VariableScope.nullOrMissingString;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: G */
    public boolean mo4479G() {
        return true;
    }
}
