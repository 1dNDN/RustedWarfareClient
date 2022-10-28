package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.Core;

/* renamed from: com.corrodinggames.rts.gameFramework.l.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/ag.class */
public class C0930ag extends Paint {

    /* renamed from: r */
    public static final C0930ag f6372r = new C0930ag();

    /* renamed from: t */
    C0928ae f6374t;

    /* renamed from: s */
    boolean f6373s = false;

    /* renamed from: u */
    boolean f6375u = false;

    static {
        f6372r.m5908b(-1);
        f6372r.m903o();
    }

    /* renamed from: o */
    public void m903o() {
        this.f6375u = true;
    }

    /* renamed from: c */
    public void m904c(float f) {
        super.mo5909b(f);
    }

    /* renamed from: b */
    public void mo5909b(float f) {
        if (this.f6375u) {
            Core.m998b("UniquePaint changed when locked down:");
            Core.m998b("from:" + m5888k() + " to: " + f);
            Core.m1069S();
        }
        super.mo5909b(f);
    }

    /* renamed from: a */
    public Typeface mo5924a(Typeface typeface) {
        if (this.f6375u) {
            Core.m998b("UniquePaint changed when locked down:");
            Core.m1069S();
        }
        return super.mo5924a(typeface);
    }

    /* renamed from: b */
    public static void m905b(Paint paint) {
        ((C0930ag) paint).m903o();
    }

    /* renamed from: p */
    public boolean m902p() {
        return this.f6373s;
    }

    /* renamed from: a */
    public void mo5914a(boolean z) {
        this.f6373s = z;
        super.mo5914a(z);
    }

    /* renamed from: q */
    public C0928ae m901q() {
        return this.f6374t;
    }

    /* renamed from: a */
    public void m908a(C0928ae c0928ae) {
        this.f6374t = c0928ae;
    }
}
