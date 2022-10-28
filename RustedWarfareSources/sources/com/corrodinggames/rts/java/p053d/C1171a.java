package com.corrodinggames.rts.java.p053d;

import android.graphics.Rect;
import android.graphics.RectF;
import com.LibRocket;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

/* renamed from: com.corrodinggames.rts.java.d.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d/a.class */
public class C1171a extends AbstractC0048b {

    /* renamed from: k */
    private static SGL f7152k = Renderer.get();

    /* renamed from: j */
    Graphics f7153j;

    @Override // com.corrodinggames.librocket.AbstractC0048b
    /* renamed from: a */
    public void mo234a() {
        throw new RuntimeException("startNewFrame() not supported on SlickLibRocket");
    }

    /* renamed from: a */
    public void m233a(Graphics graphics) {
        this.f7153j = graphics;
        super.mo234a();
    }

    @Override // com.LibRocket
    public boolean GenerateTexture(int i, byte[] bArr) {
        try {
            C1172b c1172b = (C1172b) findTextureHolder(i);
            ImageBuffer imageBuffer = new ImageBuffer(c1172b.width, c1172b.height);
            byte[] rgba = imageBuffer.getRGBA();
            for (int i2 = 0; i2 < bArr.length; i2++) {
                rgba[i2] = bArr[i2];
            }
            c1172b.f7154h = new Image(imageBuffer);
            if (c1172b.f7154h == null) {
                throw new RuntimeException("slickTextureHolder.image==null");
            }
            return true;
        } catch (OutOfMemoryError e) {
            AbstractC0916l.m1032a(EnumC1065u.uiImage, e);
            return false;
        } catch (Throwable th) {
            ScriptEngine.throwDelayedException("GenerateTexture Failed", th);
            return true;
        }
    }

    @Override // com.LibRocket
    public void RenderGeometryPossiblyCompiled(float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int i, float f, float f2, LibRocket.CompiledGeometry compiledGeometry) {
        try {
            if (this.debug) {
                System.out.println("SlickLibRocket:RenderGeometry(" + fArr.length + "," + i + ")");
                System.out.println("indices.length=" + iArr2.length + VariableScope.nullOrMissingString);
            }
            C1172b c1172b = null;
            if (i != 0) {
                c1172b = (C1172b) findTextureHolder(i);
            }
            RectF rectF = null;
            if (compiledGeometry != null) {
                rectF = (RectF) compiledGeometry.bbox;
            }
            if (rectF == null) {
                rectF = new RectF();
                for (int i2 = 0; i2 < iArr2.length; i2 += 3) {
                    int i3 = iArr2[i2];
                    for (int i4 = 0; i4 <= 2; i4++) {
                        int i5 = iArr2[i2 + i4];
                        float f3 = fArr[(i5 * 2) + 0];
                        float f4 = fArr[(i5 * 2) + 1];
                        if (rectF.m5024a()) {
                            rectF.m5022a(f3, f4, f3 + 1.0f, f4 + 1.0f);
                        } else {
                            rectF.m5012c(f3, f4);
                        }
                    }
                }
                rectF.m5008g();
                if (compiledGeometry != null) {
                    compiledGeometry.bbox = rectF;
                }
            }
            RectF rectF2 = new RectF(rectF);
            rectF2.m5023a(f, f2);
            if (this.f363h && !C0758f.m2129a(rectF2, this.f362g)) {
                boolean z = true;
                if (c1172b != null && c1172b.f7154h == null && c1172b.f368b && c1172b.f372f == null) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            if (c1172b != null && c1172b.f7156j != null) {
                System.out.println("Loading image for: " + c1172b.index);
                c1172b.f7154h = new Image(c1172b.f7156j);
                if (c1172b.f7154h == null) {
                    throw new RuntimeException("slickTextureHolder.image==null");
                }
                c1172b.f7156j = null;
            }
            this.f7153j.pushTransform();
            this.f7153j.setDrawMode(Graphics.MODE_NORMAL);
            this.f7153j.translate(f, f2);
            float f5 = 1.0f;
            float f6 = 1.0f;
            boolean z2 = false;
            float f7 = 1.0f;
            boolean z3 = false;
            if (c1172b != null) {
                z2 = c1172b.f370d;
                f7 = c1172b.f371e;
                TextureImpl.getLastBind();
                if (c1172b.f7154h == null && c1172b.f368b) {
                    if (c1172b.f372f != null) {
                        InterfaceC1027y interfaceC1027y = AbstractC0916l.m1071A().f6161bO;
                        this.f7153j.pushTransform();
                        interfaceC1027y.mo137i();
                        float f8 = (((AbstractC0916l.m1071A().f6147bA / 1000.0f) / 10.0f) * 360.0f) % 360.0f;
                        this.f7153j.translate(-f, -f2);
                        Rect rect = new Rect(this.f361f.f230a, this.f361f.f231b, this.f361f.f232c, this.f361f.f233d);
                        this.f7153j.setClip((Rectangle) null);
                        this.f7153j.setWorldClip((Rectangle) null);
                        interfaceC1027y.mo208a(rect);
                        AbstractC0197n m4239k = AbstractC0197n.m4239k(0);
                        if (m4239k == null) {
                            m4239k = AbstractC0197n.f1314i;
                        }
                        EnumC0249ar.m4055a(c1172b.f372f, rectF2.m5011d(), rectF2.m5010e(), f8, 3.0f, m4239k, rectF2.m5013c() * 0.6f, rectF2.m5013c(), false, false, 1, null);
                        interfaceC1027y.mo130p();
                        f7 = 0.0f;
                        interfaceC1027y.mo136j();
                        this.f7153j.popTransform();
                    } else if (this.f359d < 1) {
                        c1172b.mo232a();
                        this.f359d++;
                    }
                }
                if (c1172b.f7154h != null) {
                    c1172b.f7154h.getTexture().bind();
                    f5 = c1172b.f7154h.getTextureWidth();
                    f6 = c1172b.f7154h.getTextureHeight();
                    z3 = true;
                } else if (c1172b.f368b) {
                    f7 = 0.1f;
                }
            }
            if (!z3) {
                TextureImpl.bindNone();
            }
            Color color = new Color(1.0f, 1.0f, 1.0f, f7);
            this.f7153j.setColor(color);
            f7152k.glBegin(4);
            for (int i6 = 0; i6 < iArr2.length; i6 += 3) {
                int i7 = iArr2[i6];
                if (!z2) {
                    int i8 = iArr[i7];
                    color.r = ((i8 >> 24) & 255) / 255.0f;
                    color.g = ((i8 >> 16) & 255) / 255.0f;
                    color.b = ((i8 >> 8) & 255) / 255.0f;
                    color.a = (i8 & 255) / 255.0f;
                    color.a *= f7;
                    color.bind();
                }
                for (int i9 = 0; i9 <= 2; i9++) {
                    int i10 = iArr2[i6 + i9];
                    f7152k.glTexCoord2f(fArr2[(i10 * 2) + 0] * f5, fArr2[(i10 * 2) + 1] * f6);
                    f7152k.glVertex2f(fArr[(i10 * 2) + 0], fArr[(i10 * 2) + 1]);
                }
            }
            f7152k.glEnd();
            this.f7153j.popTransform();
        } catch (Throwable th) {
            ScriptEngine.throwDelayedException("UI Render Failed", th);
        }
    }

    @Override // com.LibRocket
    public LibRocket.TextureHolder getFromTextureHolderFactory() {
        return new C1172b(this);
    }

    @Override // com.corrodinggames.librocket.AbstractC0048b, com.LibRocket
    public void EnableScissorRegion(boolean z) {
        if (z) {
            this.f7153j.setWorldClip(this.f361f.f230a, this.f361f.f231b, this.f361f.m5033b(), this.f361f.m5029c());
            this.f363h = true;
            return;
        }
        this.f7153j.clearWorldClip();
        this.f363h = false;
    }
}
