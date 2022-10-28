package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/h.class */
public class C0483h extends AbstractC0478c {

    /* renamed from: b */
    final /* synthetic */ C0473b f3412b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0483h(C0473b c0473b) {
        super(c0473b);
        this.f3412b = c0473b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public String mo3307c() {
        return C0473b.f3387t;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public int mo3306d() {
        return EnumC0249ar.turret.mo3419c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public C0934e mo3305d(int i) {
        C0934e c0934e;
        c0934e = C0473b.f3377a;
        return c0934e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3314a() {
        return 165.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public float mo3308b(int i) {
        return 41.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3312a(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: g */
    public float mo3304g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3311a(AbstractC0244am abstractC0244am, int i) {
        PointF c = mo3315c(i);
        C0188f m4395a = C0188f.m4395a(this.f3412b, c.f227a, c.f228b);
        PointF K = this.f3412b.mo2937K(i);
        m4395a.f1018K = K.f227a;
        m4395a.f1019L = K.f228b;
        m4395a.f993l = abstractC0244am;
        m4395a.f989h = 60.0f;
        m4395a.f1001t = 5.0f;
        m4395a.f1051ar = Color.m5106a(255, 100, 30, 30);
        m4395a.f1028U = mo3308b(i);
        m4395a.f1023P = (short) 5;
        m4395a.f1005x = 1.0f;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2315a(c.f227a, c.f228b, this.f3412b.f6960en, -1127220);
        m1071A.f6164bR.m2320a(c.f227a, c.f228b, this.f3412b.f6960en, this.f3412b.f1649cJ[i].f1712a);
        m1071A.f6159bM.m2702a(C0631e.f4054t, 0.3f, 1.0f + C0758f.m2074c(-0.07f, 0.07f), c.f227a, c.f228b);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public int mo3309b() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3310a(AbstractC0478c abstractC0478c) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3313a(float f) {
        this.f3412b.mo3325s(f);
    }
}
