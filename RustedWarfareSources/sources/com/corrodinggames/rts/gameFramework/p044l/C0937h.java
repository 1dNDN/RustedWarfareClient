package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
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
    public static synchronized void m874C() {
        if (f6434A) {
            return;
        }
        try {
            LoggerMaybe.LogDebug2("Loading team shaders...");
            f6431x = new C0938i("assets/shaders/pureGreenTeamColor.frag", true);
            f6431x.m916a("teamColor", -1);
            f6431x.mo868c();
            f6432y = new C0938i("assets/shaders/hueAddTeamColor.frag", false);
            f6432y.m918a("teamColorAmount", 0.15f);
            f6432y.m916a("teamColor", -1);
            f6432y.mo868c();
            f6433z = new C0938i("assets/shaders/hueShiftTeamColor.frag", false);
            f6433z.m916a("teamColor", -1);
            f6433z.mo868c();
            f6434A = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: D */
    public void m873D() {
        if (!f6434A) {
            m874C();
        }
    }

    /* renamed from: a */
    public String mo70a() {
        if (this.f6437H == null) {
            return "LazyColoring (error sourceBitmap==null)";
        }
        return "LazyColoring(" + this.f6440E + "):" + this.f6437H.mo70a();
    }

    public C0937h(C0934e c0934e, int i, EnumC0198o enumC0198o, int i2) {
        if (c0934e == null) {
            throw new RuntimeException("baseImage==null");
        }
        this.f6437H = c0934e;
        this.f6439D = i;
        this.f6441F = enumC0198o;
        this.f6440E = i2;
        this.f6437H.mo397a(this);
        this.f6399k = null;
    }

    /* renamed from: c */
    public void m872c(boolean z) {
        if (LoggerMaybe.m998ay()) {
            if (z) {
            }
            m873D();
            if (this.f6441F == EnumC0198o.f1380b) {
                mo889a(f6432y);
            } else if (this.f6441F == EnumC0198o.f1382d) {
                mo889a(f6433z);
            } else {
                mo889a(f6431x);
            }
            this.f6438I = this.f6437H;
            this.f6436C = true;
        } else if (this.f6437H.mo399A()) {
            LoggerMaybe.LogDebug2("Lazy loaded bitmap using errored image: " + this.f6437H.mo70a());
            this.f6438I = this.f6437H;
        } else {
            if (z) {
                try {
                    LoggerMaybe.LogDebug2("Loading in lazy loaded bitmap:" + this.f6437H.mo70a() + " team:" + this.f6440E);
                } catch (OutOfMemoryError e) {
                    LoggerMaybe.LogDebug2("Colouring failed with OOM");
                    LoggerMaybe.m1040a(EnumC1065u.f6747c, e);
                    this.f6438I = LoggerMaybe.m1079A().f6113bO.mo134r();
                    return;
                }
            }
            long m2390a = C0727bl.m2390a();
            this.f6437H.mo59i();
            this.f6438I = this.f6437H.mo5758clone();
            this.f6438I.mo58j();
            C0934e[] c0934eArr = {this.f6438I};
            int[] iArr = {this.f6439D};
            int[] iArr2 = {this.f6440E};
            long m2390a2 = C0727bl.m2390a();
            if (this.f6441F == EnumC0198o.f1380b) {
                AbstractC0197n.m4682b(this.f6437H, c0934eArr, iArr);
            } else if (this.f6441F == EnumC0198o.f1382d) {
                AbstractC0197n.m4699a(this.f6437H, c0934eArr, iArr, iArr2);
            } else {
                AbstractC0197n.m4700a(this.f6437H, c0934eArr, iArr);
            }
            double m2388a = C0727bl.m2388a(m2390a2);
            this.f6438I.mo54p();
            this.f6438I.mo51s();
            this.f6437H.mo53q();
            this.f6437H = null;
            double m2388a2 = C0727bl.m2388a(m2390a);
            if (m2388a2 > 1.0d) {
                LoggerMaybe.LogDebug2((this.f6441F == EnumC0198o.f1379a ? "Standard " : "Hue ") + "Colouring took:" + C0727bl.m2389a(m2388a2) + " (" + C0727bl.m2389a(m2388a) + ")");
            }
            f6442G = (float) (f6442G + m2388a2);
        }
    }

    /* renamed from: b */
    public Bitmap mo395b() {
        if (this.f6436C && !LoggerMaybe.m998ay()) {
            LoggerMaybe.LogDebug2("Team shader coloring now disabled. Recoloring image: " + this.f6437H.mo70a());
            this.f6435B = false;
            this.f6436C = false;
            mo889a((C0928ae) null);
        }
        if (!this.f6435B) {
            m872c(true);
            this.f6435B = true;
        }
        return this.f6438I.f6399k;
    }

    /* renamed from: c */
    public C0934e mo394c() {
        if (this.f6436C && !LoggerMaybe.m998ay()) {
            LoggerMaybe.LogDebug2("Team shader coloring now disabled. Recoloring image: " + this.f6437H.mo70a());
            this.f6435B = false;
            this.f6436C = false;
            mo889a((C0928ae) null);
        }
        if (!this.f6435B) {
            if (f6442G > 60.0f) {
            }
            m872c(true);
            this.f6435B = true;
        }
        if (this.f6438I == null) {
            throw new RuntimeException("coloredBitmap==null");
        }
        return this.f6438I;
    }

    /* renamed from: w */
    public void mo387w() {
        if (!this.f6435B) {
            m872c(false);
            this.f6435B = true;
        }
    }

    /* renamed from: u */
    public int mo389u() {
        if ((!this.f6435B) & (this.f6437H != null)) {
            return this.f6437H.mo389u();
        }
        return super.mo389u();
    }
}
