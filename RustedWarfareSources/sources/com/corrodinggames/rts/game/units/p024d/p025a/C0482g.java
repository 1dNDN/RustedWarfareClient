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
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/g.class */
public class C0482g extends AbstractC0478c {

    /* renamed from: b */
    final /* synthetic */ C0473b f3411b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0482g(C0473b c0473b) {
        super(c0473b);
        this.f3411b = c0473b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public String mo3307c() {
        return C0473b.f3389v;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public int mo3306d() {
        return EnumC0249ar.turret.mo3419c() + C0473b.f3402dK.mo2983c() + C0473b.f3403dL.mo2983c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public C0934e mo3305d(int i) {
        C0934e c0934e;
        c0934e = C0473b.f3379c;
        return c0934e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3314a() {
        return 320.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3312a(int i) {
        return 13.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public float mo3308b(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public PointF mo3315c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.mo2947E(i);
        float f = (this.f3411b.mo2948E() ? this.f3411b.f1618ce : this.f3411b.f1649cJ[i].f1712a) + (this.f3411b.f3385k == 1 ? -90 : 90);
        E.f227a += C0758f.m2030i(f) * 4.0f;
        E.f228b += C0758f.m2035h(f) * 4.0f;
        return E;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3311a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3315c = mo3315c(i);
        C0188f m4395a = C0188f.m4395a(this.f3411b, mo3315c.f227a, mo3315c.f228b);
        PointF K = this.f3411b.mo2937K(i);
        m4395a.f1018K = K.f227a;
        m4395a.f1019L = K.f228b;
        m4395a.f993l = abstractC0244am;
        m4395a.f989h = 60.0f;
        m4395a.f1001t = 9.0f;
        m4395a.f1051ar = Color.m5106a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 30, 30);
        m4395a.f1028U = mo3308b(i);
        m4395a.f1023P = (short) 5;
        m4395a.f1005x = 1.0f;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6164bR.m2315a(mo3315c.f227a, mo3315c.f228b, this.f3411b.f6960en, -1127220);
        m1071A.f6164bR.m2320a(mo3315c.f227a, mo3315c.f228b, this.f3411b.f6960en, this.f3411b.f1649cJ[i].f1712a);
        m1071A.f6159bM.m2702a(C0631e.f4054t, 0.15f, 1.0f + C0758f.m2074c(-0.07f, 0.07f), mo3315c.f227a, mo3315c.f228b);
        this.f3411b.f3385k = this.f3411b.f3385k == 1 ? 0 : 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3313a(float f) {
        if (this.f3411b.f1632cs < this.f3411b.f1633ct) {
            this.f3411b.f1632cs += 0.1f * f;
            if (this.f3411b.f1632cs > this.f3411b.f1633ct) {
                this.f3411b.f1632cs = this.f3411b.f1633ct;
            }
        }
        this.f3411b.mo3325s(f);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public int mo3309b() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3310a(AbstractC0478c abstractC0478c) {
        if (!(abstractC0478c instanceof C0481f)) {
            this.f3411b.f1633ct += 400.0f;
            this.f3411b.f1632cs += 400.0f;
        }
        this.f3411b.f1633ct += 2800.0f;
        this.f3411b.f1632cs += 2800.0f;
    }
}
