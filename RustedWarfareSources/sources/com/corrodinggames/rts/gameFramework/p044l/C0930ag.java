package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;

/* renamed from: com.corrodinggames.rts.gameFramework.l.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/ag.class */
public class C0930ag extends Paint {

    /* renamed from: r */
    public static final C0930ag f6372r = new C0930ag();

    /* renamed from: t */
    C0928ae f6373t;

    /* renamed from: s */
    boolean f6374s = false;

    /* renamed from: u */
    boolean f6375u = false;

    static {
        f6372r.m5501b(-1);
        f6372r.m896o();
    }

    /* renamed from: o */
    public void m896o() {
        this.f6375u = true;
    }

    /* renamed from: c */
    public void m897c(float f) {
        super.mo899b(f);
    }

    /* renamed from: b */
    public void mo899b(float f) {
        if (this.f6375u) {
            LoggerMaybe.m990b("UniquePaint changed when locked down:");
            LoggerMaybe.m990b("from:" + m5481k() + " to: " + f);
            LoggerMaybe.m1061S();
        }
        super.mo899b(f);
    }

    /* renamed from: a */
    public Typeface mo902a(Typeface typeface) {
        if (this.f6375u) {
            LoggerMaybe.m990b("UniquePaint changed when locked down:");
            LoggerMaybe.m1061S();
        }
        return super.mo902a(typeface);
    }

    /* renamed from: b */
    public static void m898b(Paint paint) {
        ((C0930ag) paint).m896o();
    }

    /* renamed from: p */
    public boolean m895p() {
        return this.f6374s;
    }

    /* renamed from: a */
    public void mo900a(boolean z) {
        this.f6374s = z;
        super.mo900a(z);
    }

    /* renamed from: q */
    public C0928ae m894q() {
        return this.f6373t;
    }

    /* renamed from: a */
    public void m901a(C0928ae c0928ae) {
        this.f6373t = c0928ae;
    }
}
