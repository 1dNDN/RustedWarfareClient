package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p037f.C0813u;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/h.class */
public class C0213h extends AbstractC0224s {

    /* renamed from: a */
    AbstractC0224s f1437a;

    /* renamed from: b */
    C0207b f1438b;

    /* renamed from: c */
    boolean f1439c;

    /* renamed from: d */
    public int f1440d;

    /* renamed from: e */
    public boolean f1441e;

    /* renamed from: f */
    public final int f1442f;

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j_ */
    public float mo4156j_() {
        return this.f1437a.mo4156j_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s, java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AbstractC0224s abstractC0224s) {
        return this.f1437a.compareTo(abstractC0224s);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo2986b() {
        return this.f1437a.mo2986b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3945d(AbstractC0244am abstractC0244am) {
        return this.f1437a.mo3945d(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo2989a() {
        return this.f1437a.mo2989a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public String mo3943e(AbstractC0244am abstractC0244am) {
        return this.f1437a.mo3943e(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo2983c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo2984b(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1437a.mo2984b(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: k_ */
    public boolean mo4165k_() {
        return this.f1437a.mo4165k_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo2987a(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f1439c) {
            return this.f1437a.mo2987a(abstractC0244am, z);
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public int mo4164t() {
        return this.f1437a.mo4164t();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public void mo3320f(AbstractC0244am abstractC0244am) {
        this.f1437a.mo3320f(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    public boolean equals(Object obj) {
        if (obj instanceof C0213h) {
            return this.f1437a.equals(((C0213h) obj).f1437a);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3942g(AbstractC0244am abstractC0244am) {
        return this.f1437a.mo3942g(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo2985b(AbstractC0244am abstractC0244am) {
        if (!this.f1438b.isAvailable(this, abstractC0244am)) {
            return false;
        }
        return this.f1437a.mo2985b(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo3930u() {
        return this.f1437a.mo3930u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public boolean mo2978h() {
        return this.f1437a.mo2978h();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo2977i() {
        return this.f1437a.mo2977i();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo2979g() {
        return this.f1437a.mo2979g();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo2982e() {
        return this.f1437a.mo2982e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo2980f() {
        return this.f1437a.mo2980f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3014d() {
        return this.f1437a.mo3014d();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e_ */
    public boolean mo2981e_() {
        return this.f1437a.mo2981e_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4179a(AbstractC0244am abstractC0244am, C0813u c0813u, Paint paint, Paint paint2) {
        this.f1437a.mo4179a(abstractC0244am, c0813u, paint, paint2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4180a(AbstractC0244am abstractC0244am, C0813u c0813u) {
        this.f1437a.mo4180a(abstractC0244am, c0813u);
        InterfaceC0303as mo2977i = this.f1437a.mo2977i();
        if (mo2977i != null && (mo2977i instanceof C0453l)) {
            C0453l c0453l = (C0453l) mo2977i;
            if (c0453l.f2937I != null) {
                c0813u.m1698a("\n(mod: " + C0758f.m2115a(c0453l.f2937I.m1641a(), 30) + ")", this.f1442f, true);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public C0934e mo3041j() {
        return this.f1437a.mo3041j();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public C0934e mo3941h(AbstractC0244am abstractC0244am) {
        return this.f1437a.mo3941h(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: v */
    public Rect mo4169v() {
        return this.f1437a.mo4169v();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public AbstractC0244am mo3940i(AbstractC0244am abstractC0244am) {
        return this.f1437a.mo3940i(abstractC0244am);
    }

    public int hashCode() {
        return this.f1437a.hashCode();
    }

    public String toString() {
        return this.f1437a.toString();
    }

    public C0213h(AbstractC0224s abstractC0224s, C0207b c0207b) {
        this(abstractC0224s, c0207b, false);
    }

    public C0213h(AbstractC0224s abstractC0224s, C0207b c0207b, boolean z) {
        super(abstractC0224s.m4185N());
        this.f1438b = C0207b.emptyActionFilter;
        this.f1440d = 0;
        this.f1442f = Color.m5106a(255, 50, 50, 50);
        this.f1437a = abstractC0224s;
        this.f1438b = c0207b;
        m4173e(this.f1437a.m4185N());
        this.f1460g = this.f1437a.f1460g;
        this.f1439c = z;
    }

    /* renamed from: n_ */
    public AbstractC0224s m4199n_() {
        return this.f1437a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: x */
    public boolean mo4168x() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4154s() {
        if (!this.f1438b.isAvailable(this, null)) {
            return false;
        }
        if (this.f1439c) {
            return this.f1437a.mo4154s();
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: y */
    public InterfaceC0303as mo3928y() {
        return this.f1437a.mo3928y();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public boolean mo3042c(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1437a.mo3042c(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3043a(AbstractC0244am abstractC0244am) {
        return this.f1437a.mo3043a(abstractC0244am);
    }
}
