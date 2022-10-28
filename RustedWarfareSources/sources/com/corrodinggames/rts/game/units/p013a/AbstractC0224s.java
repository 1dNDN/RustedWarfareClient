package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p028g.C0554e;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p037f.C0760a;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.a.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/s.class */
public abstract class AbstractC0224s implements Comparable {

    /* renamed from: g */
    public float f1460g = -999.0f;

    /* renamed from: h */
    public C0206a f1461h = C0206a.f1426a;

    /* renamed from: i */
    public static final C0208c f1462i = C0208c.f1428a;

    /* renamed from: a */
    private C0208c f1463a;

    /* renamed from: b */
    private C0424b f1464b;

    /* renamed from: b */
    public abstract String mo3037b();

    /* renamed from: a */
    public abstract String mo3040a();

    /* renamed from: c */
    public abstract int mo3034c();

    /* renamed from: b */
    public abstract int mo3035b(AbstractC0244am abstractC0244am, boolean z);

    /* renamed from: i */
    public abstract InterfaceC0303as mo5754i();

    /* renamed from: g */
    public abstract boolean mo3030g();

    /* renamed from: e */
    public abstract EnumC0226u mo3033e();

    /* renamed from: f */
    public abstract EnumC0225t mo3031f();

    /* renamed from: j_ */
    public float mo4552j_() {
        if (this instanceof C0220o) {
            return -100.0f;
        }
        if (this.f1460g != -999.0f) {
            return this.f1460g;
        }
        InterfaceC0303as mo5754i = mo5754i();
        if (mo5754i != null && mo3030g()) {
            return mo5754i.mo4225g();
        }
        return 1.0f;
    }

    /* renamed from: a */
    public int mo4599a(AbstractC0224s abstractC0224s) {
        if (abstractC0224s == null) {
            return 0;
        }
        float mo4552j_ = mo4552j_() - abstractC0224s.mo4552j_();
        if (mo4552j_ < 0.0f) {
            return -1;
        }
        return mo4552j_ > 0.0f ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass() || !this.f1463a.equals(((AbstractC0224s) obj).f1463a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m4574b(C0208c c0208c) {
        if (c0208c == null || c0208c == f1462i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m4573c(C0208c c0208c) {
        return !m4574b(c0208c);
    }

    /* renamed from: a */
    public static boolean m4579a(AbstractC0224s abstractC0224s, AbstractC0224s abstractC0224s2) {
        return abstractC0224s == abstractC0224s2;
    }

    /* renamed from: d */
    public final boolean m4571d(C0208c c0208c) {
        return this.f1463a == c0208c;
    }

    public AbstractC0224s(int i) {
        m4575a(String.valueOf(i));
    }

    public AbstractC0224s(String str) {
        m4575a(str);
    }

    public AbstractC0224s(C0208c c0208c) {
        m4570e(c0208c);
    }

    /* renamed from: a */
    public final void m4575a(String str) {
        this.f1463a = C0208c.m4609a(str);
    }

    /* renamed from: e */
    public final void m4570e(C0208c c0208c) {
        this.f1463a = c0208c;
    }

    /* renamed from: N */
    public final C0208c m4582N() {
        return this.f1463a;
    }

    /* renamed from: z */
    public C0208c mo4563z() {
        return m4582N();
    }

    /* renamed from: O */
    public final String m4581O() {
        if (this.f1463a == null) {
            return "<null index>";
        }
        return this.f1463a.m4613a();
    }

    /* renamed from: P */
    public C0449h mo4114P() {
        return null;
    }

    /* renamed from: d */
    public String mo4109d(AbstractC0244am abstractC0244am) {
        return mo3037b();
    }

    /* renamed from: e */
    public String mo4107e(AbstractC0244am abstractC0244am) {
        return mo3040a();
    }

    /* renamed from: B */
    public C0424b mo4121B() {
        C0424b mo4134a = this.f1461h.mo4134a();
        if (mo4134a != null) {
            return mo4134a;
        }
        int mo3034c = mo3034c();
        if (mo3034c == 0) {
            return C0424b.f2710a;
        }
        if (this.f1464b == null || this.f1464b.m3902a() != mo3034c) {
            this.f1464b = C0424b.m3901a(mo3034c);
        }
        return this.f1464b;
    }

    /* renamed from: o_ */
    public C0424b mo4098o_() {
        if (this.f1461h.mo4127b() != null) {
            return this.f1461h.mo4127b();
        }
        return null;
    }

    /* renamed from: k_ */
    public boolean mo4561k_() {
        return false;
    }

    /* renamed from: g */
    public boolean mo4106g(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4126b(abstractC0244am);
    }

    /* renamed from: j */
    public String mo4103j(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4125c(abstractC0244am);
    }

    /* renamed from: a */
    public void mo4578a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        this.f1461h.mo4131a(abstractC0244am, abstractC0244am2);
    }

    /* renamed from: d */
    public boolean mo4108d(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }

    /* renamed from: k */
    public boolean mo4102k(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: l */
    public boolean mo4101l(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3038a(AbstractC0244am abstractC0244am, boolean z) {
        if (mo4106g(abstractC0244am) || C0554e.m3144a(abstractC0244am, m4582N()) > 0) {
            return false;
        }
        if (z) {
            return mo4121B().m3869c(abstractC0244am, mo4113Q());
        }
        return mo4121B().mo3851b(abstractC0244am);
    }

    /* renamed from: r */
    public boolean mo4097r(AbstractC0244am abstractC0244am) {
        return mo3036b(abstractC0244am);
    }

    /* renamed from: u */
    public boolean m4566u(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4133a(abstractC0244am);
    }

    /* renamed from: b */
    public boolean mo3036b(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4130a(abstractC0244am, false);
    }

    /* renamed from: a */
    public boolean mo4111a(AbstractC0244am abstractC0244am, AbstractC0197n abstractC0197n) {
        return false;
    }

    /* renamed from: u */
    public boolean mo4094u() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3029h() {
        return false;
    }

    /* renamed from: C */
    public boolean mo4555C() {
        return false;
    }

    /* renamed from: D */
    public boolean mo4562D() {
        return true;
    }

    /* renamed from: A */
    public boolean mo4122A() {
        return false;
    }

    /* renamed from: y */
    public InterfaceC0303as mo4092y() {
        return null;
    }

    /* renamed from: E */
    public InterfaceC0303as mo4120E() {
        return null;
    }

    /* renamed from: F */
    public boolean mo4119F() {
        return false;
    }

    /* renamed from: t */
    public int mo4560t() {
        return 1;
    }

    /* renamed from: o */
    public boolean mo3027o() {
        return false;
    }

    /* renamed from: m */
    public boolean mo4100m(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: n */
    public boolean mo4099n(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: v */
    public EnumC0340e mo4093v(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: d */
    public String mo3065d() {
        String str = null;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int i = 0;
        AbstractC0244am[] m503a = m1079A.f6117bS.f5258bL.m503a();
        int size = m1079A.f6117bS.f5258bL.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m503a[i2];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (str == null) {
                    str = mo4109d(abstractC0623y);
                }
                int mo3035b = mo3035b(abstractC0623y, true);
                if (mo3035b != -1 && mo3035b != 0) {
                    i += mo3035b;
                }
            }
        }
        if (str == null) {
            str = mo3037b();
        }
        if (i != -1 && i != 0) {
            str = str + " (" + i + ")";
        }
        return str;
    }

    /* renamed from: e_ */
    public boolean mo3032e_() {
        return true;
    }

    /* renamed from: w */
    public String mo4549w(AbstractC0244am abstractC0244am) {
        return mo4109d(abstractC0244am);
    }

    /* renamed from: a */
    public void mo4576a(AbstractC0244am abstractC0244am, C0813u c0813u, Paint paint, Paint paint2) {
        String mo4549w;
        Paint paint3 = c0813u.f5381g;
        if (paint != null) {
            c0813u.m1711a(paint);
        }
        if (mo3032e_() && (mo4549w = mo4549w(abstractC0244am)) != null && !mo4549w.equals(VariableScope.nullOrMissingString)) {
            c0813u.m1702b(mo4549w);
        }
        if (paint != null) {
            c0813u.m1711a(paint3);
        }
        EnumC0225t mo3031f = mo3031f();
        C0424b mo4121B = mo4121B();
        if (!mo4121B.m3882b() && mo3031f != EnumC0225t.f1473i) {
            c0813u.m1702b(" (");
            AbstractC0244am abstractC0244am2 = null;
            int i = 0;
            if (paint2 != null) {
                abstractC0244am2 = abstractC0244am;
                i = paint2.m5489e();
            }
            mo4121B.m3887a(c0813u, false, true, 5, true, abstractC0244am2, i);
            c0813u.m1702b(")");
        }
        C0424b mo4098o_ = mo4098o_();
        if (mo4098o_ != null && !mo4098o_.m3882b() && mo3031f != EnumC0225t.f1473i) {
            c0813u.m1702b(" (");
            mo4098o_.m3887a(c0813u, false, true, 5, true, null, 0);
            c0813u.m1702b(")");
        }
    }

    /* renamed from: a */
    public void mo4577a(AbstractC0244am abstractC0244am, C0813u c0813u) {
        String m2014a = C0760a.m2014a(this, false);
        if (m2014a != null && !VariableScope.nullOrMissingString.equals(m2014a)) {
            c0813u.m1702b("\n" + m2014a.trim());
        }
        String mo4107e = mo4107e(abstractC0244am);
        if (mo4107e != null && !VariableScope.nullOrMissingString.equals(mo4107e)) {
            c0813u.m1702b("\n" + mo4107e.trim());
        }
    }

    /* renamed from: c */
    public boolean mo3112c(AbstractC0244am abstractC0244am, boolean z) {
        return false;
    }

    /* renamed from: f */
    public void mo4569f(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: j */
    public C0934e mo3111j() {
        if (mo3031f() == EnumC0225t.f1467c) {
            return LoggerMaybe.m1079A().f6117bS.f5219be;
        }
        return null;
    }

    /* renamed from: h */
    public C0934e mo4105h(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: J */
    public int mo4116J() {
        return Color.m5538a(100, 255, 255, 255);
    }

    /* renamed from: v */
    public Rect mo4565v() {
        return null;
    }

    /* renamed from: i */
    public AbstractC0244am mo4104i(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: s */
    public boolean mo4096s(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: t */
    public boolean mo4095t(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: a */
    public boolean mo3113a(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4124d(abstractC0244am);
    }

    /* renamed from: s */
    public boolean mo4550s() {
        return false;
    }

    /* renamed from: o */
    public boolean mo4568o(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: G */
    public boolean mo4554G() {
        return false;
    }

    /* renamed from: c */
    public void mo4572c(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: l */
    public float mo3064l() {
        return 1.0f;
    }

    /* renamed from: m */
    public int mo3063m() {
        return -1;
    }

    /* renamed from: H */
    public boolean mo4118H() {
        return false;
    }

    /* renamed from: I */
    public boolean mo4117I() {
        return false;
    }

    /* renamed from: x */
    public boolean mo4564x() {
        return false;
    }

    /* renamed from: p */
    public float mo4559p(AbstractC0244am abstractC0244am) {
        return -1.0f;
    }

    /* renamed from: q */
    public ArrayList mo4567q(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: M */
    public C0639ad mo4583M() {
        return null;
    }

    /* renamed from: l_ */
    public boolean mo4551l_() {
        return false;
    }

    /* renamed from: Q */
    public boolean mo4113Q() {
        return false;
    }

    /* renamed from: a */
    public void mo4110a(AbstractC0623y abstractC0623y) {
    }

    /* renamed from: a */
    public boolean mo3039a(float f, float f2) {
        return false;
    }

    /* renamed from: p */
    public boolean mo3026p() {
        return false;
    }
}
