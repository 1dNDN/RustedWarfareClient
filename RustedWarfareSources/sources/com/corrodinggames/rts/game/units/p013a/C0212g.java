package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/g.class */
public class C0212g extends AbstractC0224s {

    /* renamed from: a */
    public AbstractC0224s f1432a;

    /* renamed from: b */
    public AbstractC0623y f1433b;

    /* renamed from: c */
    public C0207b f1434c;

    /* renamed from: d */
    static C1112u f1435d;

    /* renamed from: e */
    static final C1112u f1436e = new C1112u();

    /* renamed from: K */
    private void m4973K() {
        Core m1087A = Core.m1087A();
        if (f1435d != null) {
            throw new RuntimeException("savedSelectedUnitsCache!=null");
        }
        f1435d = m1087A.f6117bS.f5258bL;
        f1436e.clear();
        f1436e.mo494a(this.f1433b);
        m1087A.f6117bS.f5258bL = f1436e;
    }

    /* renamed from: L */
    private void m4972L() {
        Core m1087A = Core.m1087A();
        if (f1435d == null) {
            throw new RuntimeException("savedSelectedUnitsCache==null");
        }
        m1087A.f6117bS.f5258bL = f1435d;
        f1435d = null;
        f1436e.clear();
    }

    /* renamed from: j_ */
    public float mo4946j_() {
        return super.mo4946j_();
    }

    /* renamed from: a */
    public int mo4956a(AbstractC0224s abstractC0224s) {
        return super.m4906a(abstractC0224s);
    }

    /* renamed from: b */
    public String mo3085b() {
        return this.f1432a.mo3085b();
    }

    /* renamed from: d */
    public String mo4951d(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4951d(this.f1433b);
    }

    /* renamed from: a */
    public String mo3088a() {
        return this.f1432a.mo3088a();
    }

    /* renamed from: e */
    public String mo4950e(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4950e(this.f1433b);
    }

    /* renamed from: c */
    public int mo3082c() {
        return this.f1432a.mo3082c();
    }

    /* renamed from: b */
    public int mo3083b(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1432a.mo3083b(this.f1433b, z);
    }

    /* renamed from: k_ */
    public boolean mo4863k_() {
        return this.f1432a.mo4863k_();
    }

    /* renamed from: a */
    public boolean mo3086a(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1432a.mo3086a(this.f1433b, z);
    }

    /* renamed from: t */
    public int mo4860t() {
        return this.f1432a.mo4860t();
    }

    /* renamed from: f */
    public void mo4949f(AbstractC0244am abstractC0244am) {
        this.f1432a.mo4949f(this.f1433b);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public boolean mo4864g(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4864g(this.f1433b);
    }

    /* renamed from: u */
    public boolean mo4857u() {
        return this.f1432a.mo4857u();
    }

    /* renamed from: h */
    public boolean mo3077h() {
        return this.f1432a.mo3077h();
    }

    /* renamed from: i */
    public InterfaceC0303as mo6163i() {
        return this.f1432a.mo6163i();
    }

    /* renamed from: g */
    public boolean mo3078g() {
        return this.f1432a.mo3078g();
    }

    /* renamed from: e */
    public EnumC0226u mo3081e() {
        return this.f1432a.mo3081e();
    }

    /* renamed from: f */
    public EnumC0225t mo3079f() {
        return this.f1432a.mo3079f();
    }

    /* renamed from: d */
    public String mo3129d() {
        m4973K();
        String mo3129d = this.f1432a.mo3129d();
        m4972L();
        return mo3129d;
    }

    /* renamed from: e_ */
    public boolean mo3080e_() {
        return this.f1432a.mo3080e_();
    }

    /* renamed from: a */
    public void mo4953a(AbstractC0244am abstractC0244am, C0813u c0813u, Paint paint, Paint paint2) {
        m4973K();
        this.f1432a.mo4953a(this.f1433b, c0813u, paint, paint2);
        m4972L();
    }

    /* renamed from: a */
    public void mo4954a(AbstractC0244am abstractC0244am, C0813u c0813u) {
        m4973K();
        this.f1432a.mo4954a(this.f1433b, c0813u);
        m4972L();
    }

    /* renamed from: j */
    public C0934e mo4939j() {
        return this.f1432a.mo4939j();
    }

    /* renamed from: h */
    public C0934e mo4948h(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4948h(abstractC0244am);
    }

    /* renamed from: v */
    public Rect mo4937v() {
        return this.f1432a.mo4937v();
    }

    /* renamed from: i */
    public AbstractC0244am mo4947i(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4947i(this.f1433b);
    }

    public int hashCode() {
        return this.f1432a.hashCode();
    }

    public String toString() {
        return this.f1432a.toString();
    }

    public C0212g(AbstractC0224s abstractC0224s, AbstractC0623y abstractC0623y, C0208c c0208c) {
        super(c0208c);
        this.f1434c = C0207b.emptyActionFilter;
        this.f1432a = abstractC0224s;
        this.f1433b = abstractC0623y;
        this.f1460g = this.f1432a.f1460g;
    }

    /* renamed from: m_ */
    public AbstractC0224s m4961m_() {
        return this.f1432a;
    }

    /* renamed from: x */
    public boolean mo4944x() {
        return this.f1432a.mo4944x();
    }

    /* renamed from: s */
    public boolean mo4924s() {
        return this.f1432a.mo4924s();
    }

    /* renamed from: y */
    public InterfaceC0303as mo4859y() {
        return this.f1432a.mo4859y();
    }

    /* renamed from: z */
    public C0208c m4957z() {
        return this.f1432a.m4910N();
    }

    /* renamed from: a */
    public void m4968a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        super.m4902a(abstractC0244am, abstractC0244am2);
    }

    /* renamed from: a */
    public boolean m4969a(AbstractC0244am abstractC0244am, AbstractC0197n abstractC0197n) {
        return this.f1432a.m4903a(this.f1433b, abstractC0197n);
    }

    /* renamed from: A */
    public boolean m4980A() {
        return this.f1432a.m4919A();
    }

    /* renamed from: a */
    public boolean mo4955a(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4955a((AbstractC0244am) this.f1433b);
    }

    /* renamed from: B */
    public C0424b mo4866B() {
        return this.f1432a.mo4866B();
    }

    /* renamed from: j */
    public String m4965j(AbstractC0244am abstractC0244am) {
        return this.f1432a.m4884j(this.f1433b);
    }

    /* renamed from: d */
    public boolean m4966d(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1432a.m4891d(this.f1433b, z);
    }

    /* renamed from: k */
    public boolean m4964k(AbstractC0244am abstractC0244am) {
        return this.f1432a.m4882k(this.f1433b);
    }

    /* renamed from: l */
    public boolean m4963l(AbstractC0244am abstractC0244am) {
        return this.f1432a.m4881l(this.f1433b);
    }

    /* renamed from: C */
    public boolean m4979C() {
        return this.f1432a.m4918C();
    }

    /* renamed from: D */
    public boolean mo4865D() {
        return this.f1432a.mo4865D();
    }

    /* renamed from: E */
    public InterfaceC0303as m4978E() {
        return this.f1432a.m4917E();
    }

    /* renamed from: F */
    public boolean m4977F() {
        return this.f1432a.m4916F();
    }

    /* renamed from: m */
    public boolean m4962m(AbstractC0244am abstractC0244am) {
        return this.f1432a.m4879m(this.f1433b);
    }

    /* renamed from: n */
    public boolean m4960n(AbstractC0244am abstractC0244am) {
        return this.f1432a.m4878n(this.f1433b);
    }

    /* renamed from: c */
    public boolean mo4952c(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1432a.mo4952c(this.f1433b, z);
    }

    /* renamed from: o */
    public boolean mo4931o(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4931o(this.f1433b);
    }

    /* renamed from: G */
    public boolean mo4927G() {
        return this.f1432a.mo4927G();
    }

    /* renamed from: c */
    public void m4967c(AbstractC0244am abstractC0244am) {
        this.f1432a.m4895c(this.f1433b);
    }

    /* renamed from: l */
    public float mo3128l() {
        return this.f1432a.mo3128l();
    }

    /* renamed from: m */
    public int mo3127m() {
        return this.f1432a.mo3127m();
    }

    /* renamed from: H */
    public boolean m4976H() {
        return this.f1432a.m4914H();
    }

    /* renamed from: I */
    public boolean m4975I() {
        return this.f1432a.m4913I();
    }

    /* renamed from: p */
    public float mo4858p(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4858p(this.f1433b);
    }

    /* renamed from: q */
    public ArrayList mo4938q(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4938q(this.f1433b);
    }

    /* renamed from: r */
    public boolean mo4861r(AbstractC0244am abstractC0244am) {
        if (!this.f1434c.isAvailable(this, abstractC0244am)) {
            return false;
        }
        return this.f1432a.mo4861r(this.f1433b);
    }

    /* renamed from: b */
    public boolean mo3084b(AbstractC0244am abstractC0244am) {
        if (!this.f1434c.isAvailable(this, abstractC0244am)) {
            return false;
        }
        return this.f1432a.mo3084b(this.f1433b);
    }

    /* renamed from: J */
    public int m4974J() {
        return this.f1432a.m4912J();
    }

    /* renamed from: s */
    public boolean m4959s(AbstractC0244am abstractC0244am) {
        return this.f1432a.m4874s(this.f1433b);
    }

    /* renamed from: t */
    public boolean m4958t(AbstractC0244am abstractC0244am) {
        return this.f1432a.m4873t(this.f1433b);
    }

    /* renamed from: a */
    public boolean m4971a(C0212g c0212g) {
        return this.f1432a == c0212g.f1432a && this.f1433b == c0212g.f1433b && m4910N() == c0212g.m4910N() && this.f1434c == c0212g.f1434c;
    }
}
