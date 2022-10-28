package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ah.class */
public abstract class AbstractC0687ah extends AbstractC0690b {

    /* renamed from: l */
    private static HashMap f4337l = new HashMap();

    /* renamed from: o */
    private static C0689ai f4338o = new C0689ai();

    /* renamed from: p */
    private boolean f4339p;

    /* renamed from: q */
    private boolean f4340q;

    /* renamed from: r */
    private boolean f4341r;

    /* renamed from: s */
    private boolean f4342s;

    /* renamed from: t */
    private boolean f4343t;

    /* renamed from: u */
    private static int f4344u;

    /* renamed from: m */
    protected Bitmap f4345m;

    /* renamed from: v */
    private int f4346v;

    /* renamed from: n */
    int f4347n;

    /* renamed from: k */
    protected abstract Bitmap mo2536k();

    /* renamed from: a */
    protected abstract void mo2537a(Bitmap bitmap);

    protected AbstractC0687ah() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0687ah(boolean z) {
        super(null, 0, 0);
        this.f4339p = true;
        this.f4340q = false;
        this.f4341r = false;
        this.f4342s = false;
        this.f4343t = false;
        this.f4347n = 9729;
        if (z) {
            m2547a(true);
            this.f4346v = 1;
        }
    }

    /* renamed from: a */
    private static Bitmap m2561a(boolean z, Bitmap.Config config, int i) {
        Bitmap m5147a;
        C0689ai c0689ai = f4338o;
        c0689ai.f4348a = z;
        c0689ai.f4349b = config;
        c0689ai.f4350c = i;
        Bitmap bitmap = (Bitmap) f4337l.get(c0689ai);
        if (bitmap == null) {
            if (z) {
                m5147a = Bitmap.m5147a(1, i, config);
            } else {
                m5147a = Bitmap.m5147a(i, 1, config);
            }
            bitmap = m5147a;
            f4337l.put(c0689ai.clone(), bitmap);
        }
        return bitmap;
    }

    /* renamed from: n */
    private Bitmap m2556n() {
        if (this.f4345m == null) {
            this.f4345m = mo2536k();
            int m5138b = this.f4345m.m5138b() + (this.f4346v * 2);
            int m5135c = this.f4345m.m5135c() + (this.f4346v * 2);
            if (this.f4353c == -1) {
                m2551a(m5138b, m5135c);
            }
        }
        return this.f4345m;
    }

    /* renamed from: o */
    private void m2555o() {
        mo2537a(this.f4345m);
        this.f4345m = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public int mo2546b() {
        if (this.f4353c == -1) {
            m2556n();
        }
        return this.f4353c;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: c */
    public int mo2545c() {
        if (this.f4353c == -1) {
            m2556n();
        }
        return this.f4354d;
    }

    /* renamed from: l */
    public void m2558l() {
        if (this.f4345m != null) {
            m2555o();
        }
        this.f4339p = false;
    }

    /* renamed from: m */
    public boolean m2557m() {
        return m2541i() && this.f4339p;
    }

    /* renamed from: d */
    public void m2560d(InterfaceC0700k interfaceC0700k) {
        int i;
        if (!m2541i()) {
            if (this.f4343t) {
                int i2 = f4344u + 1;
                f4344u = i2;
                if (i2 > 100) {
                    return;
                }
            }
            m2559e(interfaceC0700k);
        } else if (!this.f4339p) {
            Bitmap m2556n = m2556n();
            int internalFormat = GLUtils.getInternalFormat(m2556n);
            try {
                i = GLUtils.getType(m2556n);
            } catch (IllegalArgumentException e) {
                AbstractC0916l.m1025a("updateContent: GLUtils.getType failed, defaulting to GL_UNSIGNED_BYTE", (Throwable) e);
                i = 5121;
            }
            interfaceC0700k.mo2490a(this, this.f4346v, this.f4346v, m2556n, internalFormat, i);
            m2555o();
            this.f4339p = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public void mo2431b(int i) {
        if (this.f4347n != i) {
            if (this.f4339p) {
                int mo2428g = mo2428g();
                GLES20.glTexParameterf(mo2428g, 10241, i);
                GLES20.glTexParameterf(mo2428g, 10240, i);
            }
            this.f4347n = i;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: h */
    public int mo2427h() {
        return this.f4347n;
    }

    /* renamed from: e */
    private void m2559e(InterfaceC0700k interfaceC0700k) {
        int i;
        Bitmap m2556n = m2556n();
        if (m2556n != null) {
            try {
                int m5138b = m2556n.m5138b();
                int m5135c = m2556n.m5135c();
                int i2 = m5138b + (this.f4346v * 2);
                int i3 = m5135c + (this.f4346v * 2);
                int d = m2544d();
                int e = m2543e();
                this.f4351a = interfaceC0700k.mo2512a().mo2439a();
                this.f4339p = true;
                interfaceC0700k.mo2460d(this);
                if (m5138b == d && m5135c == e) {
                    interfaceC0700k.mo2489a(this, m2556n, 0);
                    C0703n.m2448o();
                } else {
                    int internalFormat = GLUtils.getInternalFormat(m2556n);
                    try {
                        i = GLUtils.getType(m2556n);
                    } catch (IllegalArgumentException e2) {
                        AbstractC0916l.m1025a("uploadToCanvas: GLUtils.getType failed, defaulting to GL_UNSIGNED_BYTE", (Throwable) e2);
                        i = 5121;
                    }
                    Bitmap.Config m5133d = m2556n.m5133d();
                    interfaceC0700k.mo2492a(this, internalFormat, i, internalFormat);
                    C0703n.m2448o();
                    interfaceC0700k.mo2490a(this, this.f4346v, this.f4346v, m2556n, internalFormat, i);
                    C0703n.m2448o();
                    if (this.f4346v > 0) {
                        interfaceC0700k.mo2490a(this, 0, 0, m2561a(true, m5133d, e), internalFormat, i);
                        interfaceC0700k.mo2490a(this, 0, 0, m2561a(false, m5133d, d), internalFormat, i);
                    }
                    if (this.f4346v > 0) {
                        if (this.f4346v + m5138b < d) {
                            interfaceC0700k.mo2490a(this, this.f4346v + m5138b, 0, m2561a(true, m5133d, e), internalFormat, i);
                        }
                        if (this.f4346v + m5135c < e) {
                            interfaceC0700k.mo2490a(this, 0, this.f4346v + m5135c, m2561a(false, m5133d, d), internalFormat, i);
                        }
                    }
                }
                m2548a(interfaceC0700k);
                this.f4352b = 1;
                this.f4339p = true;
                return;
            } finally {
                m2555o();
            }
        }
        this.f4352b = -1;
        throw new RuntimeException("Texture load fail, no bitmap");
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: c */
    public boolean mo2429c(InterfaceC0700k interfaceC0700k) {
        m2560d(interfaceC0700k);
        this.f4361i++;
        return m2557m();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: b */
    public void mo2430b(InterfaceC0700k interfaceC0700k) {
        this.f4351a = interfaceC0700k.mo2512a().mo2439a();
        if (3553 == 3553) {
            interfaceC0700k.mo2492a(this, 6408, 5121, 6408);
        }
        interfaceC0700k.mo2460d(this);
        this.f4352b = 1;
        m2548a(interfaceC0700k);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: g */
    public int mo2428g() {
        return 3553;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0690b
    /* renamed from: j */
    public void mo2540j() {
        super.mo2540j();
        if (this.f4345m != null) {
            m2555o();
        }
    }
}
