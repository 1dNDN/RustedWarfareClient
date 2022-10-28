package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/g.class */
public class C0770g {

    /* renamed from: a */
    public static final C0770g f5017a;

    /* renamed from: b */
    public static final C0770g f5018b;

    /* renamed from: c */
    public static final C0770g f5019c;

    /* renamed from: d */
    public static final C0770g f5020d;

    /* renamed from: e */
    public static final C0770g f5021e;

    /* renamed from: g */
    C0934e f5023g;

    /* renamed from: f */
    Paint f5022f = new C0930ag();

    /* renamed from: h */
    Paint f5024h = new C0930ag();

    /* renamed from: a */
    public C0770g clone() {
        C0770g c0770g = new C0770g();
        c0770g.f5023g = this.f5023g;
        if (this.f5022f != null) {
            c0770g.f5022f = new Paint(c0770g.f5022f);
        } else {
            c0770g.f5022f = null;
        }
        if (this.f5024h != null) {
            c0770g.f5024h = new Paint(c0770g.f5024h);
        } else {
            c0770g.f5024h = null;
        }
        return c0770g;
    }

    static {
        C0770g c0770g = new C0770g();
        f5017a = c0770g;
        c0770g.f5022f.m5069b(Color.m5106a(140, 100, 100, 100));
        c0770g.f5024h.m5069b(-16777216);
        c0770g.f5024h.m5084a(Paint.Style.STROKE);
        C0770g c0770g2 = new C0770g();
        f5018b = c0770g2;
        c0770g2.f5022f.m5069b(Color.m5106a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 100, 100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3));
        c0770g2.f5024h.m5069b(-16777216);
        c0770g2.f5024h.m5084a(Paint.Style.STROKE);
        C0770g c0770g3 = new C0770g();
        f5019c = c0770g3;
        c0770g3.f5022f = null;
        c0770g3.f5024h = null;
        C0770g c0770g4 = new C0770g();
        f5020d = c0770g4;
        c0770g4.f5022f = null;
        c0770g4.f5024h.m5069b(-65536);
        c0770g4.f5024h.m5064c(127);
        c0770g4.f5024h.m5084a(Paint.Style.STROKE);
        C0770g c0770g5 = new C0770g();
        f5021e = c0770g5;
        c0770g5.f5022f.m5064c(255);
        c0770g5.f5023g = AbstractC0916l.m1071A().f6165bS.f5220bf;
        c0770g5.f5024h.m5069b(-7829368);
        c0770g5.f5024h.m5064c(255);
        c0770g5.f5024h.m5084a(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void m1948a(InterfaceC1027y interfaceC1027y, RectF rectF) {
        m1947a(interfaceC1027y, rectF, null);
    }

    /* renamed from: a */
    public void m1947a(InterfaceC1027y interfaceC1027y, RectF rectF, String str) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        if (this.f5023g != null) {
            m1071A.f6161bO.mo191a(this.f5023g, rectF, this.f5022f, 0.0f, 0.0f, 0, 0);
        } else if (this.f5022f != null) {
            interfaceC1027y.mo205a(rectF, this.f5022f);
        }
        if (this.f5024h != null) {
            interfaceC1027y.mo205a(rectF, this.f5024h);
        }
        if (str != null) {
        }
    }
}
