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
import com.corrodinggames.rts.gameFramework.Core;
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
    public abstract String mo3085b();

    /* renamed from: a */
    public abstract String mo3088a();

    /* renamed from: c */
    public abstract int mo3082c();

    /* renamed from: b */
    public abstract int mo3083b(AbstractC0244am abstractC0244am, boolean z);

    /* renamed from: i */
    public abstract InterfaceC0303as mo6163i();

    /* renamed from: g */
    public abstract boolean mo3078g();

    /* renamed from: e */
    public abstract EnumC0226u mo3081e();

    /* renamed from: f */
    public abstract EnumC0225t mo3079f();

    /* renamed from: j_ */
    public float mo4946j_() {
        if (this instanceof C0220o) {
            return -100.0f;
        }
        if (this.f1460g != -999.0f) {
            return this.f1460g;
        }
        InterfaceC0303as mo6163i = mo6163i();
        if (mo6163i != null && mo3078g()) {
            return mo6163i.mo4476g();
        }
        return 1.0f;
    }

    /* renamed from: a */
    public int mo4956a(AbstractC0224s abstractC0224s) {
        if (abstractC0224s == null) {
            return 0;
        }
        float mo4946j_ = mo4946j_() - abstractC0224s.mo4946j_();
        if (mo4946j_ < 0.0f) {
            return -1;
        }
        return mo4946j_ > 0.0f ? 1 : 0;
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
    public static final boolean m4897b(C0208c c0208c) {
        if (c0208c == null || c0208c == f1462i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m4896c(C0208c c0208c) {
        return !m4897b(c0208c);
    }

    /* renamed from: a */
    public static boolean m4905a(AbstractC0224s abstractC0224s, AbstractC0224s abstractC0224s2) {
        return abstractC0224s == abstractC0224s2;
    }

    /* renamed from: d */
    public final boolean m4893d(C0208c c0208c) {
        return this.f1463a == c0208c;
    }

    public AbstractC0224s(int i) {
        m4898a(String.valueOf(i));
    }

    public AbstractC0224s(String str) {
        m4898a(str);
    }

    public AbstractC0224s(C0208c c0208c) {
        m4890e(c0208c);
    }

    /* renamed from: a */
    public final void m4898a(String str) {
        this.f1463a = C0208c.m4988a(str);
    }

    /* renamed from: e */
    public final void m4890e(C0208c c0208c) {
        this.f1463a = c0208c;
    }

    /* renamed from: N */
    public final C0208c m4910N() {
        return this.f1463a;
    }

    /* renamed from: z */
    public C0208c m4867z() {
        return m4910N();
    }

    /* renamed from: O */
    public final String m4909O() {
        if (this.f1463a == null) {
            return "<null index>";
        }
        return this.f1463a.m4992a();
    }

    /* renamed from: P */
    public C0449h m4908P() {
        return null;
    }

    /* renamed from: d */
    public String mo4951d(AbstractC0244am abstractC0244am) {
        return mo3085b();
    }

    /* renamed from: e */
    public String mo4950e(AbstractC0244am abstractC0244am) {
        return mo3088a();
    }

    /* renamed from: B */
    public C0424b mo4866B() {
        C0424b mo4366a = this.f1461h.mo4366a();
        if (mo4366a != null) {
            return mo4366a;
        }
        int mo3082c = mo3082c();
        if (mo3082c == 0) {
            return C0424b.f2710a;
        }
        if (this.f1464b == null || this.f1464b.m4126a() != mo3082c) {
            this.f1464b = C0424b.m4125a(mo3082c);
        }
        return this.f1464b;
    }

    /* renamed from: o_ */
    public C0424b mo4862o_() {
        if (this.f1461h.mo4359b() != null) {
            return this.f1461h.mo4359b();
        }
        return null;
    }

    /* renamed from: k_ */
    public boolean mo4863k_() {
        return false;
    }

    /* renamed from: g */
    public boolean mo4864g(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4358b(abstractC0244am);
    }

    /* renamed from: j */
    public String m4884j(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4357c(abstractC0244am);
    }

    /* renamed from: a */
    public void m4902a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        this.f1461h.mo4363a(abstractC0244am, abstractC0244am2);
    }

    /* renamed from: d */
    public boolean m4891d(AbstractC0244am abstractC0244am, boolean z) {
        return true;
    }

    /* renamed from: k */
    public boolean m4882k(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: l */
    public boolean m4881l(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
        if (mo4864g(abstractC0244am) || C0554e.m3226a(abstractC0244am, m4910N()) > 0) {
            return false;
        }
        if (z) {
            return mo4866B().m4093c(abstractC0244am, m4907Q());
        }
        return mo4866B().mo4075b(abstractC0244am);
    }

    /* renamed from: r */
    public boolean mo4861r(AbstractC0244am abstractC0244am) {
        return mo3084b(abstractC0244am);
    }

    /* renamed from: u */
    public boolean m4872u(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4365a(abstractC0244am);
    }

    /* renamed from: b */
    public boolean mo3084b(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4362a(abstractC0244am, false);
    }

    /* renamed from: a */
    public boolean m4903a(AbstractC0244am abstractC0244am, AbstractC0197n abstractC0197n) {
        return false;
    }

    /* renamed from: u */
    public boolean mo4857u() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3077h() {
        return false;
    }

    /* renamed from: C */
    public boolean m4918C() {
        return false;
    }

    /* renamed from: D */
    public boolean mo4865D() {
        return true;
    }

    /* renamed from: A */
    public boolean m4919A() {
        return false;
    }

    /* renamed from: y */
    public InterfaceC0303as mo4859y() {
        return null;
    }

    /* renamed from: E */
    public InterfaceC0303as m4917E() {
        return null;
    }

    /* renamed from: F */
    public boolean m4916F() {
        return false;
    }

    /* renamed from: t */
    public int mo4860t() {
        return 1;
    }

    /* renamed from: o */
    public boolean mo3075o() {
        return false;
    }

    /* renamed from: m */
    public boolean m4879m(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: n */
    public boolean m4878n(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: v */
    public EnumC0340e m4870v(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: d */
    public String mo3129d() {
        String str = null;
        Core m1087A = Core.m1087A();
        int i = 0;
        AbstractC0244am[] m498a = m1087A.f6117bS.f5258bL.m498a();
        int size = m1087A.f6117bS.f5258bL.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (str == null) {
                    str = mo4951d(abstractC0623y);
                }
                int mo3083b = mo3083b(abstractC0623y, true);
                if (mo3083b != -1 && mo3083b != 0) {
                    i += mo3083b;
                }
            }
        }
        if (str == null) {
            str = mo3085b();
        }
        if (i != -1 && i != 0) {
            str = str + " (" + i + ")";
        }
        return str;
    }

    /* renamed from: e_ */
    public boolean mo3080e_() {
        return true;
    }

    /* renamed from: w */
    public String m4869w(AbstractC0244am abstractC0244am) {
        return mo4951d(abstractC0244am);
    }

    /* renamed from: a */
    public void mo4953a(AbstractC0244am abstractC0244am, C0813u c0813u, Paint paint, Paint paint2) {
        String m4869w;
        Paint paint3 = c0813u.f5380g;
        if (paint != null) {
            c0813u.m1753a(paint);
        }
        if (mo3080e_() && (m4869w = m4869w(abstractC0244am)) != null && !m4869w.equals(VariableScope.nullOrMissingString)) {
            c0813u.m1744b(m4869w);
        }
        if (paint != null) {
            c0813u.m1753a(paint3);
        }
        EnumC0225t mo3079f = mo3079f();
        C0424b mo4866B = mo4866B();
        if (!mo4866B.m4106b() && mo3079f != EnumC0225t.f1473i) {
            c0813u.m1744b(" (");
            AbstractC0244am abstractC0244am2 = null;
            int i = 0;
            if (paint2 != null) {
                abstractC0244am2 = abstractC0244am;
                i = paint2.m5896e();
            }
            mo4866B.m4111a(c0813u, false, true, 5, true, abstractC0244am2, i);
            c0813u.m1744b(")");
        }
        C0424b mo4862o_ = mo4862o_();
        if (mo4862o_ != null && !mo4862o_.m4106b() && mo3079f != EnumC0225t.f1473i) {
            c0813u.m1744b(" (");
            mo4862o_.m4111a(c0813u, false, true, 5, true, null, 0);
            c0813u.m1744b(")");
        }
    }

    /* renamed from: a */
    public void mo4954a(AbstractC0244am abstractC0244am, C0813u c0813u) {
        String m2063a = C0760a.m2063a(this, false);
        if (m2063a != null && !VariableScope.nullOrMissingString.equals(m2063a)) {
            c0813u.m1744b("\n" + m2063a.trim());
        }
        String mo4950e = mo4950e(abstractC0244am);
        if (mo4950e != null && !VariableScope.nullOrMissingString.equals(mo4950e)) {
            c0813u.m1744b("\n" + mo4950e.trim());
        }
    }

    /* renamed from: c */
    public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
        return false;
    }

    /* renamed from: f */
    public void mo4949f(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: j */
    public C0934e mo4939j() {
        if (mo3079f() == EnumC0225t.f1467c) {
            return Core.m1087A().f6117bS.f5219be;
        }
        return null;
    }

    /* renamed from: h */
    public C0934e mo4948h(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: J */
    public int m4912J() {
        return Color.m5948a(100, 255, 255, 255);
    }

    /* renamed from: v */
    public Rect mo4937v() {
        return null;
    }

    /* renamed from: i */
    public AbstractC0244am mo4947i(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: s */
    public boolean m4874s(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: t */
    public boolean m4873t(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: a */
    public boolean mo4955a(AbstractC0244am abstractC0244am) {
        return this.f1461h.mo4356d(abstractC0244am);
    }

    /* renamed from: s */
    public boolean mo4924s() {
        return false;
    }

    /* renamed from: o */
    public boolean mo4931o(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: G */
    public boolean mo4927G() {
        return false;
    }

    /* renamed from: c */
    public void m4895c(AbstractC0244am abstractC0244am) {
    }

    /* renamed from: l */
    public float mo3128l() {
        return 1.0f;
    }

    /* renamed from: m */
    public int mo3127m() {
        return -1;
    }

    /* renamed from: H */
    public boolean m4914H() {
        return false;
    }

    /* renamed from: I */
    public boolean m4913I() {
        return false;
    }

    /* renamed from: x */
    public boolean mo4944x() {
        return false;
    }

    /* renamed from: p */
    public float mo4858p(AbstractC0244am abstractC0244am) {
        return -1.0f;
    }

    /* renamed from: q */
    public ArrayList mo4938q(AbstractC0244am abstractC0244am) {
        return null;
    }

    /* renamed from: M */
    public C0639ad m4911M() {
        return null;
    }

    /* renamed from: l_ */
    public boolean mo4943l_() {
        return false;
    }

    /* renamed from: Q */
    public boolean m4907Q() {
        return false;
    }

    /* renamed from: a */
    public void m4899a(AbstractC0623y abstractC0623y) {
    }

    /* renamed from: a */
    public boolean mo3087a(float f, float f2) {
        return false;
    }

    /* renamed from: p */
    public boolean mo3074p() {
        return false;
    }
}
