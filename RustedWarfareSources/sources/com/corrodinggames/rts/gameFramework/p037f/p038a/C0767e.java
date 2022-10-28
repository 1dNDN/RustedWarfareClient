package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/e.class */
public class C0767e extends C0775l {

    /* renamed from: a */
    C0769f f5015a;

    /* renamed from: a */
    public static C0767e m1952a(String str, boolean z) {
        C0767e c0767e = new C0767e();
        c0767e.f5057b = C0770g.f5021e;
        c0767e.f5033i = 200.0f;
        c0767e.f5034j = 200.0f;
        C0771h c0771h = new C0771h();
        c0771h.m1944a(str);
        c0771h.m1923e(5.0f);
        c0771h.m1921f(5.0f);
        c0771h.m1945a(-1);
        c0767e.m1935a(c0771h);
        c0767e.f5015a = new C0769f(EnumC0774k.horizontal);
        c0767e.m1935a(c0767e.f5015a);
        if (z) {
            c0767e.m1951b(C0820a.m1681a("menus.common.cancel", new Object[0])).m1936a(new AbstractC0772i() { // from class: com.corrodinggames.rts.gameFramework.f.a.e.1
                @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i
                /* renamed from: a */
                public boolean mo1406a(C0765c c0765c) {
                    C0767e.this.m1918i();
                    return true;
                }
            });
        }
        return c0767e;
    }

    /* renamed from: a */
    public C0764b m1954a(String str) {
        C0764b c0764b = new C0764b();
        c0764b.m1944a(str);
        c0764b.m1923e(5.0f);
        c0764b.m1921f(5.0f);
        c0764b.m1945a(Color.m5106a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30));
        return c0764b;
    }

    /* renamed from: b */
    public C0764b m1951b(String str) {
        return m1953a(str, (AbstractC0772i) null);
    }

    /* renamed from: a */
    public C0764b m1953a(String str, AbstractC0772i abstractC0772i) {
        C0764b m1954a = m1954a(str);
        m1954a.m1936a(abstractC0772i);
        this.f5015a.m1935a(m1954a);
        return m1954a;
    }

    /* renamed from: r_ */
    public void m1950r_() {
        if (!this.f5043s) {
            return;
        }
        mo1933b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0773j
    /* renamed from: b */
    public void mo1933b() {
        super.mo1933b();
        m1926d();
        this.f5033i = this.f5050z;
        this.f5034j = this.f5049y;
        this.f5033i += this.f5037m + this.f5038n;
        this.f5034j += this.f5035k + this.f5036l;
    }
}
