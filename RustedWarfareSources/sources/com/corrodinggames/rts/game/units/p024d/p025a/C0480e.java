package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/e.class */
public class C0480e extends AbstractC0478c {

    /* renamed from: b */
    final /* synthetic */ C0473b f3409b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0480e(C0473b c0473b) {
        super(c0473b);
        this.f3409b = c0473b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public String mo3307c() {
        return C0473b.f3391x;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public int mo3306d() {
        return EnumC0249ar.turret.mo3419c() + C0473b.f3405dN.mo2983c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public C0934e mo3305d(int i) {
        C0934e c0934e;
        c0934e = C0473b.f3381e;
        return c0934e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3314a() {
        return 155.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3312a(int i) {
        return 5.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public float mo3308b(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3311a(AbstractC0244am abstractC0244am, int i) {
        PointF c = mo3315c(i);
        C0188f m4395a = C0188f.m4395a(this.f3409b, c.f227a, c.f228b);
        m4395a.f989h = 60.0f;
        m4395a.f1001t = 3.0f + ((this.f3409b.f3385k * 13) % 2.0f);
        m4395a.f1077aR = false;
        m4395a.f1014G = true;
        m4395a.f1051ar = Color.m5106a(105, 255, 255, 255);
        m4395a.f1023P = (short) 3;
        m4395a.f1005x = 1.3f;
        PointF m4128a = abstractC0244am.m4128a(c.f227a, c.f228b, m4395a.f1001t, m4395a.f989h, mo3314a());
        m4395a.f1062aC = true;
        m4395a.f994m = true;
        m4395a.f995n = m4128a.f227a;
        m4395a.f996o = m4128a.f228b;
        m4395a.f995n += (-15) + ((this.f3409b.f3385k * 13) % 30);
        m4395a.f996o += (-15) + ((63 + (this.f3409b.f3385k * 33)) % 30);
        m4395a.f6956ej = 3;
        m4395a.f1032Y = mo3308b(i);
        m4395a.f1033Z = 65.0f;
        m4395a.f1034aa = true;
        m4395a.f1010C = true;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        this.f3409b.f3385k++;
        if (this.f3409b.f3385k > 10) {
            this.f3409b.f3385k = 0;
            m1071A.f6164bR.m2320a(c.f227a, c.f228b, this.f3409b.f6960en, this.f3409b.f1649cJ[i].f1712a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public int mo3309b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3310a(AbstractC0478c abstractC0478c) {
        this.f3409b.f1633ct += 900.0f;
        this.f3409b.f1632cs += 900.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3313a(float f) {
        if (this.f3409b.f1632cs < this.f3409b.f1633ct) {
            this.f3409b.f1632cs += 0.15f * f;
            if (this.f3409b.f1632cs > this.f3409b.f1633ct) {
                this.f3409b.f1632cs = this.f3409b.f1633ct;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: e */
    public float mo3318e(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: f */
    public float mo3317f(int i) {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: g */
    public float mo3304g(int i) {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: h */
    public float mo3316h(int i) {
        return 0.0f;
    }
}
