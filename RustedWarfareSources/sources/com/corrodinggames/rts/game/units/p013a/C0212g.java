package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
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
    private void m4203K() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (f1435d != null) {
            throw new RuntimeException("savedSelectedUnitsCache!=null");
        }
        f1435d = m1071A.f6165bS.f5258bL;
        f1436e.clear();
        f1436e.add(this.f1433b);
        m1071A.f6165bS.f5258bL = f1436e;
    }

    /* renamed from: L */
    private void m4202L() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (f1435d == null) {
            throw new RuntimeException("savedSelectedUnitsCache==null");
        }
        m1071A.f6165bS.f5258bL = f1435d;
        f1435d = null;
        f1436e.clear();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j_ */
    public float mo4156j_() {
        return super.mo4156j_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s, java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AbstractC0224s abstractC0224s) {
        return super.compareTo(abstractC0224s);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        return this.f1432a.mo2986b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3945d(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3945d(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return this.f1432a.mo2989a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public String mo3943e(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3943e(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo2983c() {
        return this.f1432a.mo2983c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo2984b(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1432a.mo2984b(this.f1433b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: k_ */
    public boolean mo4165k_() {
        return this.f1432a.mo4165k_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo2987a(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1432a.mo2987a(this.f1433b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public int mo4164t() {
        return this.f1432a.mo4164t();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public void mo3320f(AbstractC0244am abstractC0244am) {
        this.f1432a.mo3320f(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3942g(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3942g(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo3930u() {
        return this.f1432a.mo3930u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public boolean mo2978h() {
        return this.f1432a.mo2978h();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo2977i() {
        return this.f1432a.mo2977i();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        return this.f1432a.mo2979g();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        return this.f1432a.mo2982e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        return this.f1432a.mo2980f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        m4203K();
        String mo3014d = this.f1432a.mo3014d();
        m4202L();
        return mo3014d;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e_ */
    public boolean mo2981e_() {
        return this.f1432a.mo2981e_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4179a(AbstractC0244am abstractC0244am, C0813u c0813u, Paint paint, Paint paint2) {
        m4203K();
        this.f1432a.mo4179a(this.f1433b, c0813u, paint, paint2);
        m4202L();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4180a(AbstractC0244am abstractC0244am, C0813u c0813u) {
        m4203K();
        this.f1432a.mo4180a(this.f1433b, c0813u);
        m4202L();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public C0934e mo3041j() {
        return this.f1432a.mo3041j();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public C0934e mo3941h(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3941h(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: v */
    public Rect mo4169v() {
        return this.f1432a.mo4169v();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public AbstractC0244am mo3940i(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3940i(this.f1433b);
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
    public AbstractC0224s m4200m_() {
        return this.f1432a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: x */
    public boolean mo4168x() {
        return this.f1432a.mo4168x();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4154s() {
        return this.f1432a.mo4154s();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: y */
    public InterfaceC0303as mo3928y() {
        return this.f1432a.mo3928y();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: z */
    public C0208c mo4167z() {
        return this.f1432a.m4185N();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4181a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        super.mo4181a(abstractC0244am, abstractC0244am2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3947a(AbstractC0244am abstractC0244am, AbstractC0197n abstractC0197n) {
        return this.f1432a.mo3947a(this.f1433b, abstractC0197n);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: A */
    public boolean mo3958A() {
        return this.f1432a.mo3958A();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3043a(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3043a((AbstractC0244am) this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: B */
    public C0424b mo3957B() {
        return this.f1432a.mo3957B();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public String mo3939j(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3939j(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public boolean mo3944d(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1432a.mo3944d(this.f1433b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: k */
    public boolean mo3938k(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3938k(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public boolean mo3937l(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3937l(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: C */
    public boolean mo4159C() {
        return this.f1432a.mo4159C();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: D */
    public boolean mo4166D() {
        return this.f1432a.mo4166D();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: E */
    public InterfaceC0303as mo3956E() {
        return this.f1432a.mo3956E();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: F */
    public boolean mo3955F() {
        return this.f1432a.mo3955F();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public boolean mo3936m(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3936m(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n */
    public boolean mo3935n(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3935n(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public boolean mo3042c(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1432a.mo3042c(this.f1433b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: o */
    public boolean mo4172o(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4172o(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: G */
    public boolean mo4158G() {
        return this.f1432a.mo4158G();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public void mo4175c(AbstractC0244am abstractC0244am) {
        this.f1432a.mo4175c(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public float mo3013l() {
        return this.f1432a.mo3013l();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public int mo3012m() {
        return this.f1432a.mo3012m();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: H */
    public boolean mo3954H() {
        return this.f1432a.mo3954H();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: I */
    public boolean mo3953I() {
        return this.f1432a.mo3953I();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: p */
    public float mo4163p(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4163p(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: q */
    public ArrayList mo4171q(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo4171q(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: r */
    public boolean mo3933r(AbstractC0244am abstractC0244am) {
        if (!this.f1434c.isAvailable(this, abstractC0244am)) {
            return false;
        }
        return this.f1432a.mo3933r(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo2985b(AbstractC0244am abstractC0244am) {
        if (!this.f1434c.isAvailable(this, abstractC0244am)) {
            return false;
        }
        return this.f1432a.mo2985b(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: J */
    public int mo3952J() {
        return this.f1432a.mo3952J();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo3932s(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3932s(this.f1433b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public boolean mo3931t(AbstractC0244am abstractC0244am) {
        return this.f1432a.mo3931t(this.f1433b);
    }

    /* renamed from: a */
    public boolean m4201a(C0212g c0212g) {
        return this.f1432a == c0212g.f1432a && this.f1433b == c0212g.f1433b && m4185N() == c0212g.m4185N() && this.f1434c == c0212g.f1434c;
    }
}
