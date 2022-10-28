package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.l.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/h.class */
public class C0937h extends C0934e {

    /* renamed from: x */
    public static C0928ae f6431x;

    /* renamed from: y */
    public static C0928ae f6432y;

    /* renamed from: z */
    public static C0928ae f6433z;

    /* renamed from: A */
    public static boolean f6434A;

    /* renamed from: B */
    boolean f6435B = false;

    /* renamed from: C */
    boolean f6436C = false;

    /* renamed from: H */
    private C0934e f6437H;

    /* renamed from: I */
    private C0934e f6438I;

    /* renamed from: D */
    int f6439D;

    /* renamed from: E */
    int f6440E;

    /* renamed from: F */
    EnumC0198o f6441F;

    /* renamed from: G */
    public static float f6442G;

    /* renamed from: C */
    public static synchronized void m882C() {
        if (f6434A) {
            return;
        }
        try {
            Core.LogDebug2("Loading team shaders...");
            f6431x = new C0938i("assets/shaders/pureGreenTeamColor.frag", true);
            f6431x.m923a("teamColor", -1);
            f6431x.mo876c();
            f6432y = new C0938i("assets/shaders/hueAddTeamColor.frag", false);
            f6432y.m925a("teamColorAmount", 0.15f);
            f6432y.m923a("teamColor", -1);
            f6432y.mo876c();
            f6433z = new C0938i("assets/shaders/hueShiftTeamColor.frag", false);
            f6433z.m923a("teamColor", -1);
            f6433z.mo876c();
            f6434A = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: D */
    public void m881D() {
        if (!f6434A) {
            m882C();
        }
    }

    /* renamed from: a */
    public String mo64a() {
        if (this.f6437H == null) {
            return "LazyColoring (error sourceBitmap==null)";
        }
        return "LazyColoring(" + this.f6440E + "):" + this.f6437H.mo64a();
    }

    public C0937h(C0934e c0934e, int i, EnumC0198o enumC0198o, int i2) {
        if (c0934e == null) {
            throw new RuntimeException("baseImage==null");
        }
        this.f6437H = c0934e;
        this.f6439D = i;
        this.f6441F = enumC0198o;
        this.f6440E = i2;
        this.f6437H.mo392a(this);
        this.f6399k = null;
    }

    /* renamed from: c */
    public void m880c(boolean z) {
        if (Core.m1006ay()) {
            if (z) {
            }
            m881D();
            if (this.f6441F == EnumC0198o.f1380b) {
                mo927a(f6432y);
            } else if (this.f6441F == EnumC0198o.f1382d) {
                mo927a(f6433z);
            } else {
                mo927a(f6431x);
            }
            this.f6438I = this.f6437H;
            this.f6436C = true;
        } else if (this.f6437H.mo394A()) {
            Core.LogDebug2("Lazy loaded bitmap using errored image: " + this.f6437H.mo64a());
            this.f6438I = this.f6437H;
        } else {
            if (z) {
                try {
                    Core.LogDebug2("Loading in lazy loaded bitmap:" + this.f6437H.mo64a() + " team:" + this.f6440E);
                } catch (OutOfMemoryError e) {
                    Core.LogDebug2("Colouring failed with OOM");
                    Core.m1048a(EnumC1065u.f6747c, e);
                    this.f6438I = Core.m1087A().f6113bO.mo128r();
                    return;
                }
            }
            long m2440a = C0727bl.m2440a();
            this.f6437H.mo53i();
            this.f6438I = this.f6437H.mo54h();
            this.f6438I.mo52j();
            C0934e[] c0934eArr = {this.f6438I};
            int[] iArr = {this.f6439D};
            int[] iArr2 = {this.f6440E};
            long m2440a2 = C0727bl.m2440a();
            if (this.f6441F == EnumC0198o.f1380b) {
                AbstractC0197n.m5061b(this.f6437H, c0934eArr, iArr);
            } else if (this.f6441F == EnumC0198o.f1382d) {
                AbstractC0197n.m5078a(this.f6437H, c0934eArr, iArr, iArr2);
            } else {
                AbstractC0197n.m5079a(this.f6437H, c0934eArr, iArr);
            }
            double m2438a = C0727bl.m2438a(m2440a2);
            this.f6438I.mo48p();
            this.f6438I.mo45s();
            this.f6437H.mo47q();
            this.f6437H = null;
            double m2438a2 = C0727bl.m2438a(m2440a);
            if (m2438a2 > 1.0d) {
                Core.LogDebug2((this.f6441F == EnumC0198o.f1379a ? "Standard " : "Hue ") + "Colouring took:" + C0727bl.m2439a(m2438a2) + " (" + C0727bl.m2439a(m2438a) + ")");
            }
            f6442G = (float) (f6442G + m2438a2);
        }
    }

    /* renamed from: b */
    public Bitmap mo390b() {
        if (this.f6436C && !Core.m1006ay()) {
            Core.LogDebug2("Team shader coloring now disabled. Recoloring image: " + this.f6437H.mo64a());
            this.f6435B = false;
            this.f6436C = false;
            mo927a((C0928ae) null);
        }
        if (!this.f6435B) {
            m880c(true);
            this.f6435B = true;
        }
        return this.f6438I.f6399k;
    }

    /* renamed from: c */
    public C0934e mo389c() {
        if (this.f6436C && !Core.m1006ay()) {
            Core.LogDebug2("Team shader coloring now disabled. Recoloring image: " + this.f6437H.mo64a());
            this.f6435B = false;
            this.f6436C = false;
            mo927a((C0928ae) null);
        }
        if (!this.f6435B) {
            if (f6442G > 60.0f) {
            }
            m880c(true);
            this.f6435B = true;
        }
        if (this.f6438I == null) {
            throw new RuntimeException("coloredBitmap==null");
        }
        return this.f6438I;
    }

    /* renamed from: w */
    public void mo383w() {
        if (!this.f6435B) {
            m880c(false);
            this.f6435B = true;
        }
    }

    /* renamed from: u */
    public int mo385u() {
        if ((!this.f6435B) & (this.f6437H != null)) {
            return this.f6437H.mo385u();
        }
        return super.mo385u();
    }
}
