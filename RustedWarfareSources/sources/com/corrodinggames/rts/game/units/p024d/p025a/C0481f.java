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
/* renamed from: com.corrodinggames.rts.game.units.d.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/f.class */
public class C0481f extends AbstractC0478c {

    /* renamed from: b */
    final /* synthetic */ C0473b f3410b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0481f(C0473b c0473b) {
        super(c0473b);
        this.f3410b = c0473b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public String mo3307c() {
        return C0473b.f3388u;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public int mo3306d() {
        return EnumC0249ar.turret.mo3419c() + C0473b.f3402dK.mo2983c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public C0934e mo3305d(int i) {
        C0934e c0934e;
        c0934e = C0473b.f3378b;
        return c0934e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3314a() {
        return 185.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3312a(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public float mo3308b(int i) {
        return 44.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: g */
    public float mo3304g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public PointF mo3315c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.mo2947E(i);
        float f = (this.f3410b.mo2948E() ? this.f3410b.f1618ce : this.f3410b.f1649cJ[i].f1712a) + (this.f3410b.f3385k == 1 ? -90 : 90);
        E.f227a += C0758f.m2030i(f) * 4.0f;
        E.f228b += C0758f.m2035h(f) * 4.0f;
        return E;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3311a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3315c = mo3315c(i);
        C0188f m4395a = C0188f.m4395a(this.f3410b, mo3315c.f227a, mo3315c.f228b);
        PointF K = this.f3410b.mo2937K(i);
        m4395a.f1018K = K.f227a;
        m4395a.f1019L = K.f228b;
        m4395a.f993l = abstractC0244am;
        m4395a.f989h = 60.0f;
        m4395a.f1001t = 6.0f;
        m4395a.f1051ar = Color.m5106a(255, 40, 30, 110);
        m4395a.f1028U = mo3308b(i);
        m4395a.f1023P = (short) 5;
        m4395a.f1005x = 1.0f;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2315a(mo3315c.f227a, mo3315c.f228b, this.f3410b.f6960en, -1127220);
        m1071A.f6164bR.m2320a(mo3315c.f227a, mo3315c.f228b, this.f3410b.f6960en, this.f3410b.f1649cJ[i].f1712a);
        m1071A.f6159bM.m2702a(C0631e.f4054t, 0.3f, 1.0f + C0758f.m2074c(-0.07f, 0.07f), mo3315c.f227a, mo3315c.f228b);
        this.f3410b.f3385k = this.f3410b.f3385k == 1 ? 0 : 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public int mo3309b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3310a(AbstractC0478c abstractC0478c) {
        this.f3410b.f1633ct += 400.0f;
        this.f3410b.f1632cs += 400.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3313a(float f) {
        this.f3410b.mo3325s(f);
    }
}
