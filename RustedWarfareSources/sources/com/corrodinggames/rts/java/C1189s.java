package com.corrodinggames.rts.java;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;

/* renamed from: com.corrodinggames.rts.java.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/s.class */
public class C1189s extends C0934e {

    /* renamed from: y */
    public static ArrayList f7256y;

    /* renamed from: x */
    private Image f7257x;

    /* renamed from: z */
    ImageData f7258z;

    /* renamed from: A */
    ByteBuffer f7259A;

    /* renamed from: B */
    int f7260B;

    /* renamed from: C */
    String f7261C;

    /* renamed from: H */
    boolean f7266H;

    /* renamed from: F */
    static boolean f7264F = true;

    /* renamed from: K */
    static int f7269K = 1000;

    /* renamed from: D */
    boolean f7262D = false;

    /* renamed from: E */
    int f7263E = 1;

    /* renamed from: G */
    boolean f7265G = false;

    /* renamed from: I */
    boolean f7267I = false;

    /* renamed from: J */
    long f7268J = -1;

    /* renamed from: C */
    public Image mo72C() {
        return this.f7257x;
    }

    /* renamed from: a */
    private void m58a(ImageData imageData) {
        this.f7258z = imageData;
        if (this.f7258z instanceof ImageBuffer) {
            this.f7259A = ByteBuffer.wrap(((ImageBuffer) imageData).getRGBA());
        } else {
            this.f7259A = imageData.getImageBufferData();
        }
        this.f7260B = imageData.getDepth() / 8;
        if (this.f7260B == 4) {
            int texHeight = imageData.getTexHeight();
            int texWidth = imageData.getTexWidth();
            int height = imageData.getHeight();
            int width = imageData.getWidth();
            for (int i = 0; i < height; i++) {
                for (int i2 = 0; i2 < width; i2++) {
                    int i3 = (i2 * 4) + (i * texWidth * 4);
                    try {
                        if (this.f7259A.get(i3 + 3) == 0) {
                            this.f7259A.put(i3 + 0, (byte) 0);
                            this.f7259A.put(i3 + 1, (byte) 0);
                            this.f7259A.put(i3 + 2, (byte) 0);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        throw new IndexOutOfBoundsException("offset:" + i3 + " x:" + i2 + " y:" + i + " height:" + height + " width:" + width + " texHeight:" + texHeight + " texWidth:" + texWidth);
                    }
                }
            }
        }
        if (f7264F) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: a */
    public String mo64a() {
        if (this.f6395g != null) {
            return this.f6395g;
        }
        return this.f7261C;
    }

    public C1189s() {
        if (f7256y == null) {
            f7256y = new ArrayList();
        }
        f7256y.add(this);
    }

    /* renamed from: D */
    public void mo71D() {
        if (this.f7258z == null && this.f7257x != null) {
            AbstractC0916l.m982b("reloadFromImageData: slickImageData==null and slickImage!=null. Ignoring");
            return;
        }
        if (this.f7257x != null) {
            try {
                this.f7257x.destroy();
            } catch (SlickException e) {
                throw new RuntimeException((Throwable) e);
            }
        }
        Image image = null;
        if (0 == 0) {
            image = new Image(this.f7258z);
        }
        this.f7257x = image;
        mo70E();
        this.f6404p = this.f7257x.getWidth();
        this.f6405q = this.f7257x.getHeight();
        mo388g();
        mo384v();
    }

    /* renamed from: a */
    public void mo59a(Image image, String str) {
        if (this.f7257x != null) {
            AbstractC0916l.m957g("this.slickImage!=null");
        }
        this.f7257x = image;
        mo70E();
        this.f6404p = this.f7257x.getWidth();
        this.f6405q = this.f7257x.getHeight();
        mo388g();
        this.f7261C = str;
        if (this.f7261C != null) {
            if (!new File(this.f7261C).exists()) {
                throw new RuntimeException(this.f7261C + " does not exist");
            }
            this.f7268J = mo56c(true);
        }
    }

    /* renamed from: a */
    public void mo57a(ImageData imageData, String str, boolean z) {
        m58a(imageData);
        if (!z) {
            mo71D();
        }
        this.f7261C = str;
        if (this.f7261C != null && !this.f7261C.contains(".rwmod")) {
            if (!new File(this.f7261C).exists()) {
                throw new RuntimeException(this.f7261C + " does not exist");
            }
            this.f7268J = mo56c(true);
        }
        mo388g();
    }

    /* renamed from: a */
    public static ByteBuffer m60a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer.rewind();
        byteBuffer2.put(byteBuffer);
        byteBuffer.rewind();
        byteBuffer2.flip();
        return byteBuffer2;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: a */
    public C0934e mo61a(int i, int i2, boolean z) {
        C1189s c1189s = new C1189s();
        c1189s.mo57a((ImageData) new ImageBuffer(i, i2), (String) null, true);
        if (z) {
            if (1 != 0 && this.f7260B == 4) {
                m67H();
                m60a(this.f7258z.getImageBufferData(), c1189s.f7259A);
            } else {
                m67H();
                for (int i3 = 0; i3 < i2; i3++) {
                    for (int i4 = 0; i4 < i; i4++) {
                        c1189s.mo62a(i4, i3, mo63a(i4, i3));
                    }
                }
            }
        }
        c1189s.f6404p = i;
        c1189s.f6405q = i2;
        c1189s.mo388g();
        c1189s.f7262D = true;
        return c1189s;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: i */
    public void mo53i() {
        if (!this.f7265G) {
            mo52j();
        } else if (f7264F && this.f7259A == null) {
            mo52j();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: x */
    public void mo43x() {
        m67H();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: y */
    public void mo42y() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: j */
    public void mo52j() {
        this.f7265G = true;
        if (this.f7266H) {
            mo68G();
            throw new RuntimeException("Cannot buffer pixels, we have discarded the PixelBuffer");
        } else {
            m67H();
        }
    }

    /* renamed from: H */
    public void m67H() {
        if (f7264F && this.f7259A == null) {
            m65J();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: q */
    public void mo47q() {
        m66I();
    }

    /* renamed from: I */
    public void m66I() {
        if (f7264F) {
            this.f7258z = null;
            this.f7259A = null;
        }
    }

    /* renamed from: J */
    public void m65J() {
        if (this.f7257x == null) {
            throw new RuntimeException("Cannot buffer pixels, we have no slickImage");
        }
        long m2370a = C0727bl.m2370a();
        C1190t c1190t = new C1190t(this, this.f7257x);
        this.f7258z = c1190t;
        this.f7259A = ByteBuffer.wrap(c1190t.m41a());
        AbstractC0916l.m963e("Recreating image data from texture: " + mo64a() + " (" + C0727bl.m2369a(C0727bl.m2368a(m2370a)) + ")");
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: k */
    public boolean mo51k() {
        if (this.f7258z == null) {
            if (f7264F && this.f7257x != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: a */
    public int mo63a(int i, int i2) {
        try {
            return C1173e.m174a(this.f7258z, this.f7259A, i, i2, this.f7260B);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("getPixel out of bounds (x:" + i + " y:" + i2 + " perPixel:" + this.f7260B + " TexWidth:" + this.f7258z.getTexWidth() + " TexHeight:" + this.f7258z.getTexHeight() + " imageByteBuffer:" + this.f7259A.limit() + " width:" + this.f6404p + " height:" + this.f6405q + ")", e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: a */
    public void mo62a(int i, int i2, int i3) {
        try {
            C1173e.m173a(this.f7258z, this.f7259A, i, i2, Color.m5104b(i3), Color.m5103c(i3), Color.m5102d(i3), Color.m5108a(i3), this.f7260B);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("setPixel out of bounds (x:" + i + " y:" + i2 + " perPixel:" + this.f7260B + " TexWidth:" + this.f7258z.getTexWidth() + " TexHeight:" + this.f7258z.getTexHeight() + " imageByteBuffer:" + this.f7259A.limit() + " width:" + this.f6404p + " height:" + this.f6405q + ")", e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: p */
    public void mo48p() {
        if (this.f7265G) {
            this.f7265G = false;
            mo71D();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: r */
    public void mo46r() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: s */
    public void mo45s() {
        this.f7266H = true;
        this.f7258z = null;
        this.f7259A = null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: n */
    public void mo50n() {
        this.f7267I = true;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: o */
    public void mo49o() {
        this.f7258z = null;
        this.f7259A = null;
        if (f7256y != null) {
            f7256y.remove(this);
        }
        if (this.f7257x != null) {
            try {
                this.f7257x.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
            this.f7257x = null;
        }
    }

    protected void finalize() {
        if (this.f7267I) {
            mo49o();
        }
        if (this.f7257x != null) {
            AbstractC0916l.m982b("SlickBitmapOrTexture: Leak detection: finalize called with slickImage!=null");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: h */
    public C0934e clone() {
        return mo61a(this.f6404p, this.f6405q, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: e */
    protected void mo55e() {
        mo70E();
    }

    /* renamed from: E */
    public void mo70E() {
        if (this.f7257x == null) {
            AbstractC0916l.m982b("slickImage==null");
            AbstractC0916l.m1053S();
        }
        if (!this.f6403o) {
            this.f7263E = 2;
            this.f7257x.setFilter(2);
            return;
        }
        this.f7263E = 1;
        this.f7257x.setFilter(1);
    }

    /* renamed from: F */
    public void mo69F() {
        FileInputStream fileInputStream;
        if (this.f7262D) {
            AbstractC0916l.m963e("reloadImage: skipping cloned image:" + this.f7261C);
        } else if (this.f7261C == null) {
            AbstractC0916l.m963e("reloadImage: filepath is null, skipping");
        } else {
            try {
                AbstractC0916l.m963e("reloadImage: reloading:" + this.f7261C);
                if (this.f7257x != null) {
                    this.f7257x.destroy();
                } else {
                    AbstractC0916l.m963e("slickImage==null cannot free");
                }
                f7269K++;
                fileInputStream = new FileInputStream(this.f7261C);
            } catch (IOException e) {
                AbstractC0916l.m963e("reloadImage: failed");
                e.printStackTrace();
            } catch (SlickException e2) {
                AbstractC0916l.m963e("reloadImage: failed");
                e2.printStackTrace();
            }
            try {
                this.f7257x = new Image(fileInputStream, "reload_" + f7269K, false);
                mo384v();
                mo70E();
                this.f6404p = this.f7257x.getWidth();
                this.f6405q = this.f7257x.getHeight();
                mo388g();
                fileInputStream.close();
                AbstractC0916l m1071A = AbstractC0916l.m1071A();
                if (m1071A != null && m1071A.f6158bL != null) {
                    m1071A.f6158bL.m4474g();
                }
            } catch (NullPointerException e3) {
                throw new IOException("Failed to reload", e3);
            }
        }
    }

    /* renamed from: c */
    public long mo56c(boolean z) {
        if (this.f7261C == null) {
            return -2L;
        }
        return C0894j.m1229a(this.f7261C, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0934e
    /* renamed from: t */
    public void mo44t() {
        long mo56c = mo56c(false);
        if (this.f7268J == -1) {
            this.f7268J = mo56c;
        } else if (this.f7268J != mo56c) {
            AbstractC0916l.m963e("reloadImage: '" + this.f7261C + "' reloading current now:" + mo56c);
            mo69F();
            this.f7268J = mo56c;
        }
    }

    /* renamed from: G */
    public void mo68G() {
        AbstractC0916l.m963e("SlickBitmapOrTexture: " + mo64a());
        AbstractC0916l.m963e(" className:" + getClass().getSimpleName());
        AbstractC0916l.m963e(" filepath:" + this.f7261C);
        AbstractC0916l.m963e(" slickImage:" + (this.f7257x != null));
        AbstractC0916l.m963e(" cloned:" + this.f7262D);
    }
}
