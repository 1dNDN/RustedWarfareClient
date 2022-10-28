package com.corrodinggames.rts.game.units.p015c;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p026e.AbstractC0529j;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.game.units.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/c/a.class */
public class C0319a extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f1899a = null;

    /* renamed from: b */
    static C0934e f1900b = null;

    /* renamed from: c */
    static C0934e f1901c = null;

    /* renamed from: d */
    static C0934e[] f1902d = new C0934e[10];

    /* renamed from: e */
    int f1903e;

    /* renamed from: f */
    float f1904f;

    /* renamed from: g */
    Rect f1905g;

    /* renamed from: h */
    Rect f1906h;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1708r() {
        return EnumC0249ar.ladybug;
    }

    /* renamed from: c */
    public static void m3988c() {
        f1900b = AbstractC0916l.m1071A().f6161bO.mo221a(C0067R.drawable.ladybug);
        f1902d = AbstractC0197n.m4304a(f1900b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2771d() {
        if (this.f1607bT) {
            return f1899a;
        }
        return f1902d[this.f1609bV.m4327O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo2745k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo2768d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo2961e() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (m1071A.f6164bR.m2295b(this.f6958el, this.f6959em, this.f6960en, EnumC0744d.blood, false, EnumC0748h.high) != null) {
        }
        m1071A.f6159bM.m2703a(C0631e.f4061A, 0.8f, this.f6958el, this.f6959em);
        C0195l.m4347a(this, 1);
        return false;
    }

    public C0319a(boolean z) {
        super(z);
        this.f1903e = 0;
        this.f1904f = 0.0f;
        this.f1905g = new Rect();
        this.f1906h = new Rect();
        m2620T(17);
        m2619U(26);
        this.f1621ch = 5.0f;
        this.f1622ci = this.f1621ch + 3.0f;
        this.f1633ct = 130.0f;
        this.f1632cs = this.f1633ct;
        this.f3886L = f1900b;
        this.f3896O = EnumC0205a.outOfRange;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3119a_(boolean z) {
        int i = this.f1903e * this.f4228ep;
        this.f1905g.m5035a(i, 0, i + this.f4228ep, 0 + this.f4229eq);
        return this.f1905g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bP */
    public boolean mo3521bP() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bO */
    public boolean mo3522bO() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(float f) {
        super.mo445a(f);
        if (this.f1648cI) {
            if (this.f1903e == 0) {
                this.f1903e = 1;
            } else {
                this.f1903e = 0;
            }
        }
        if (this.f1904f != 0.0f) {
            this.f1904f = C0758f.m2149a(this.f1904f, f);
            this.f1903e = 2;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo2899a(AbstractC0244am abstractC0244am, int i) {
        C0188f.m4392a((AbstractC0244am) this, abstractC0244am, 14.0f, (C0188f) null, false);
        this.f1904f = 4.0f;
        PointF E = mo2947E(i);
        AbstractC0916l.m1071A().f6159bM.m2703a(C0631e.f4062B, 0.3f, E.f227a, E.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo2738m() {
        return 43.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo2821b(int i) {
        return 17.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo2713z() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo2956A() {
        return 5.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo2775c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo437c(float f) {
        return super.mo437c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo2952C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo2950D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo2958l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo2846af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo2758g(int i) {
        return 7.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo2948E() {
        return true;
    }
}
