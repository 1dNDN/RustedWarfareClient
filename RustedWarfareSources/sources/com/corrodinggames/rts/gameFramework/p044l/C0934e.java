package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;

/* renamed from: com.corrodinggames.rts.gameFramework.l.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/e.class */
public class C0934e {

    /* renamed from: a */
    public C0934e[] f6388a;

    /* renamed from: b */
    public C0934e[] f6389b;

    /* renamed from: c */
    public C0934e[] f6390c;

    /* renamed from: x */
    private static int f6391x;

    /* renamed from: d */
    public int f6392d;

    /* renamed from: e */
    public int f6393e;

    /* renamed from: f */
    public int f6394f;

    /* renamed from: g */
    public String f6395g;

    /* renamed from: h */
    public Integer f6396h;

    /* renamed from: i */
    C0928ae f6397i;

    /* renamed from: j */
    public int[] f6398j;

    /* renamed from: k */
    protected Bitmap f6399k;

    /* renamed from: m */
    public boolean f6400m;

    /* renamed from: n */
    public boolean f6401n;

    /* renamed from: p */
    public int f6402p;

    /* renamed from: q */
    public int f6403q;

    /* renamed from: r */
    public int f6404r;

    /* renamed from: s */
    public int f6405s;

    /* renamed from: t */
    public float f6406t;

    /* renamed from: u */
    public float f6407u;

    /* renamed from: v */
    public boolean f6408v;

    /* renamed from: l */
    public boolean f6409l = true;

    /* renamed from: o */
    public boolean f6410o = false;

    /* renamed from: w */
    boolean f6411w = false;

    public C0934e() {
        int i = f6391x;
        f6391x = i + 1;
        this.f6392d = i;
        this.f6393e = 1;
    }

    /* renamed from: a */
    public C0934e[] m891a(EnumC0198o enumC0198o) {
        if (enumC0198o == EnumC0198o.f1379a) {
            return this.f6388a;
        }
        if (enumC0198o == EnumC0198o.f1380b) {
            return this.f6389b;
        }
        if (enumC0198o == EnumC0198o.f1382d) {
            return this.f6390c;
        }
        LoggerMaybe.m990b("getTeamImageCache coloringMode:" + enumC0198o);
        return this.f6388a;
    }

    /* renamed from: a */
    public void m890a(EnumC0198o enumC0198o, C0934e[] c0934eArr) {
        if (enumC0198o == EnumC0198o.f1379a) {
            this.f6388a = c0934eArr;
        } else if (enumC0198o == EnumC0198o.f1380b) {
            this.f6389b = c0934eArr;
        } else if (enumC0198o == EnumC0198o.f1382d) {
            this.f6390c = c0934eArr;
        } else {
            LoggerMaybe.m990b("setTeamImageCache coloringMode:" + enumC0198o);
            this.f6388a = c0934eArr;
        }
    }

    /* renamed from: a */
    public void m888a(String str) {
        this.f6395g = str;
    }

    /* renamed from: a */
    public String mo70a() {
        return this.f6395g;
    }

    /* renamed from: b */
    public Bitmap mo395b() {
        return this.f6399k;
    }

    /* renamed from: c */
    public C0934e mo394c() {
        return this;
    }

    /* renamed from: a */
    public void mo396a(boolean z) {
        this.f6410o = z;
        mo61e();
    }

    /* renamed from: b */
    public void m887b(boolean z) {
        this.f6411w = z;
    }

    /* renamed from: d */
    public boolean m886d() {
        return this.f6411w;
    }

    /* renamed from: e */
    protected void mo61e() {
    }

    /* renamed from: f */
    public boolean m885f() {
        return this.f6400m;
    }

    /* renamed from: a */
    public void mo398a(Bitmap bitmap) {
        this.f6399k = bitmap;
        this.f6402p = this.f6399k.m5570b();
        this.f6403q = this.f6399k.m5567c();
        mo393g();
    }

    /* renamed from: g */
    public void mo393g() {
        this.f6404r = this.f6402p / 2;
        this.f6405s = this.f6403q / 2;
        this.f6406t = this.f6402p / 2.0f;
        this.f6407u = this.f6403q / 2.0f;
    }

    /* renamed from: a */
    public void mo397a(C0934e c0934e) {
        c0934e.f6410o = this.f6410o;
        c0934e.f6402p = this.f6402p;
        c0934e.f6403q = this.f6403q;
        c0934e.f6404r = this.f6404r;
        c0934e.f6405s = this.f6405s;
        c0934e.f6406t = this.f6406t;
        c0934e.f6407u = this.f6407u;
    }

    /* renamed from: h */
    public C0934e mo5758clone() {
        C0934e c0934e = new C0934e();
        c0934e.f6410o = this.f6410o;
        if (this.f6399k != null) {
            Bitmap m5576a = this.f6399k.m5576a(this.f6399k.m5565d(), true);
            if (m5576a == null) {
                throw new OutOfMemoryError("Failed to copy bitmap: " + this.f6399k.m5565d());
            }
            c0934e.mo398a(m5576a);
        }
        return c0934e;
    }

    /* renamed from: a */
    public C0934e mo67a(int i, int i2, boolean z) {
        C0934e c0934e = new C0934e();
        c0934e.f6410o = this.f6410o;
        if (this.f6399k != null) {
            Bitmap m5579a = Bitmap.m5579a(i, i2, this.f6399k.m5565d());
            c0934e.mo398a(m5579a);
            if (z) {
                for (int i3 = 0; i3 < m5579a.m5570b(); i3++) {
                    for (int i4 = 0; i4 < m5579a.m5567c(); i4++) {
                        m5579a.m5581a(i3, i4, this.f6399k.m5582a(i3, i4));
                    }
                }
            }
        }
        return c0934e;
    }

    /* renamed from: i */
    public void mo59i() {
        if (this.f6398j == null) {
            mo58j();
        }
    }

    /* renamed from: j */
    public void mo58j() {
        if (this.f6399k == null && LoggerMaybe.f6205aU && !LoggerMaybe.f6208aX) {
            return;
        }
        if (this.f6398j == null) {
            this.f6398j = new int[this.f6402p * this.f6403q];
        }
        this.f6399k.m5571a(this.f6398j, 0, this.f6402p, 0, 0, this.f6402p, this.f6403q);
    }

    /* renamed from: k */
    public boolean mo57k() {
        return true;
    }

    /* renamed from: a */
    public int mo69a(int i, int i2) {
        if (this.f6398j != null) {
            return this.f6398j[i + (i2 * this.f6402p)];
        }
        return this.f6399k.m5582a(i, i2);
    }

    /* renamed from: a */
    public void mo68a(int i, int i2, int i3) {
        if (this.f6398j != null) {
            this.f6398j[i + (i2 * this.f6402p)] = i3;
        } else {
            this.f6399k.m5581a(i, i2, i3);
        }
    }

    /* renamed from: l */
    public int mo391l() {
        return this.f6403q;
    }

    /* renamed from: m */
    public int mo390m() {
        return this.f6402p;
    }

    /* renamed from: n */
    public void mo56n() {
    }

    /* renamed from: o */
    public void mo55o() {
        if (this.f6399k != null) {
            this.f6399k = null;
        }
        if (this.f6411w) {
            LoggerMaybe.m990b("remove with keepInGPUMemory=true");
        }
    }

    /* renamed from: p */
    public void mo54p() {
        if (this.f6399k == null && LoggerMaybe.f6205aU && !LoggerMaybe.f6207aW) {
            return;
        }
        if (this.f6398j != null) {
            this.f6399k.m5568b(this.f6398j, 0, this.f6402p, 0, 0, this.f6402p, this.f6403q);
            this.f6398j = null;
        }
        this.f6393e++;
    }

    /* renamed from: q */
    public void mo53q() {
    }

    /* renamed from: r */
    public void mo52r() {
        this.f6398j = null;
    }

    /* renamed from: s */
    public void mo51s() {
        mo52r();
    }

    /* renamed from: t */
    public void mo50t() {
    }

    /* renamed from: u */
    public int mo389u() {
        return this.f6402p * this.f6403q * 8;
    }

    /* renamed from: v */
    public void mo388v() {
        this.f6388a = null;
        this.f6389b = null;
        this.f6390c = null;
        this.f6393e++;
    }

    /* renamed from: w */
    public void mo387w() {
    }

    /* renamed from: x */
    public void mo49x() {
    }

    /* renamed from: y */
    public void mo48y() {
    }

    /* renamed from: z */
    public void m883z() {
    }

    /* renamed from: A */
    public boolean mo399A() {
        return false;
    }

    /* renamed from: B */
    public C0928ae mo892B() {
        return this.f6397i;
    }

    /* renamed from: a */
    public void mo889a(C0928ae c0928ae) {
        this.f6397i = c0928ae;
    }
}
