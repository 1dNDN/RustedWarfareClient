package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.game.units.d.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/d.class */
public class C0479d extends AbstractC0478c {

    /* renamed from: b */
    final /* synthetic */ C0473b f3408b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479d(C0473b c0473b) {
        super(c0473b);
        this.f3408b = c0473b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: c */
    public String mo3307c() {
        return C0473b.f3390w;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public int mo3306d() {
        return EnumC0249ar.turret.mo3419c() + C0473b.f3404dM.mo2983c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: d */
    public C0934e mo3305d(int i) {
        C0934e c0934e;
        c0934e = C0473b.f3380d;
        return c0934e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3314a() {
        return 350.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public float mo3312a(int i) {
        return 220.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: b */
    public float mo3308b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: a */
    public void mo3311a(AbstractC0244am abstractC0244am, int i) {
        PointF c = mo3315c(i);
        C0188f m4395a = C0188f.m4395a(this.f3408b, c.f227a, c.f228b);
        PointF K = this.f3408b.mo2937K(i);
        m4395a.f1018K = K.f227a;
        m4395a.f1019L = K.f228b;
        m4395a.f989h = 150.0f;
        m4395a.f1001t = 4.0f;
        m4395a.f1076aQ = true;
        m4395a.f1051ar = Color.m5106a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        m4395a.f1025R = (short) 2;
        m4395a.f1023P = (short) 0;
        m4395a.f1005x = 0.9f;
        PointF m4128a = abstractC0244am.m4128a(c.f227a, c.f228b, m4395a.f1001t, m4395a.f989h, mo3314a());
        m4395a.f1062aC = true;
        m4395a.f994m = true;
        m4395a.f995n = m4128a.f227a;
        m4395a.f996o = m4128a.f228b;
        m4395a.f1032Y = mo3308b(i);
        m4395a.f1033Z = 55.0f;
        m4395a.f1034aa = true;
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        m1071A.f6159bM.m2703a(C0631e.f4052r, 0.3f, c.f227a, c.f228b);
        m1071A.f6164bR.m2320a(c.f227a, c.f228b, this.f3408b.f6960en, this.f3408b.f1649cJ[i].f1712a);
        m1071A.f6164bR.m2307a(m4395a, -1118482);
        C0745e m2315a = m1071A.f6164bR.m2315a(c.f227a, c.f228b, this.f3408b.f6960en, -1118482);
        if (m2315a != null) {
            m2315a.f4766W = 15.0f;
            m2315a.f4767X = m2315a.f4766W;
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
        this.f3408b.f1633ct += 300.0f;
        this.f3408b.f1632cs += 300.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: e */
    public float mo3318e(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: f */
    public float mo3317f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0478c
    /* renamed from: h */
    public float mo3316h(int i) {
        return -2.0f;
    }
}
