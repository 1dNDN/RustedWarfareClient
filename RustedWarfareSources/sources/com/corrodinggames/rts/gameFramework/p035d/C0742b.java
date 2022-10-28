package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;

/* renamed from: com.corrodinggames.rts.gameFramework.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/b.class */
public class C0742b {

    /* renamed from: a */
    boolean f4677a = false;

    /* renamed from: b */
    C0934e f4678b = null;

    /* renamed from: c */
    Paint f4679c = new C0930ag();

    /* renamed from: d */
    RectF f4680d = new RectF();

    /* renamed from: e */
    float f4681e = 0.0f;

    /* renamed from: f */
    float f4682f = 0.0f;

    /* renamed from: a */
    public boolean m2348a() {
        return LoggerMaybe.m1079A().f6115bQ.renderClouds;
    }

    /* renamed from: b */
    public void m2346b() {
        this.f4678b = LoggerMaybe.m1079A().f6113bO.mo219a(C0067R.drawable.noise, false);
        this.f4677a = true;
    }

    /* renamed from: a */
    public void m2347a(float f) {
        if (!m2348a()) {
            return;
        }
        if (!this.f4677a) {
            m2346b();
        }
        this.f4681e += 0.2f * f;
        this.f4682f += 0.07f * f;
        this.f4681e %= this.f4678b.mo390m();
        this.f4682f %= this.f4678b.mo391l();
    }

    /* renamed from: b */
    public void m2345b(float f) {
        if (!m2348a()) {
            return;
        }
        if (!this.f4677a) {
            m2346b();
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6113bO.mo143i();
        m1079A.f6113bO.mo232a(3.0f, 3.0f);
        float m2059f = (int) C0758f.m2059f((-m1079A.f6144cv) / 3.0f, 0.0f);
        float m2059f2 = (int) C0758f.m2059f((-m1079A.f6145cw) / 3.0f, 0.0f);
        this.f4680d.m5454a(m2059f, m2059f2, ((int) (m1079A.f6148cz / 3.0f)) + 1, ((int) (m1079A.f6149cA / 3.0f)) + 1);
        this.f4679c.m5501b(-16777216);
        this.f4679c.m5496c(40);
        m1079A.f6113bO.mo196a(this.f4678b, this.f4680d, this.f4679c, (m1079A.f6144cv / 3.0f) + m2059f + this.f4681e, (m1079A.f6145cw / 3.0f) + m2059f2 + this.f4682f, 0, 0);
        m1079A.f6113bO.mo142j();
    }
}
