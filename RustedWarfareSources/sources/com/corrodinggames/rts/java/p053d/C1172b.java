package com.corrodinggames.rts.java.p053d;

import com.corrodinggames.librocket.AbstractC0049c;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1076af;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import com.corrodinggames.rts.java.C1173e;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.PNGImageData;

/* renamed from: com.corrodinggames.rts.java.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d/b.class */
public class C1172b extends AbstractC0049c {

    /* renamed from: h */
    Image f7154h;

    /* renamed from: i */
    boolean f7155i;

    /* renamed from: j */
    ImageBuffer f7156j;

    /* renamed from: k */
    final /* synthetic */ C1171a f7157k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172b(C1171a c1171a) {
        super(c1171a);
        this.f7157k = c1171a;
    }

    @Override // com.corrodinggames.librocket.AbstractC0049c
    /* renamed from: a */
    public boolean mo232a() {
        InputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        AbstractC1076af m608a = C1075ae.m608a(this.f367a);
        if (m608a != null) {
            fileInputStream = m608a.mo599b(this.f367a, true);
            if (fileInputStream == null) {
                AbstractC0916l.m957g("Failed to open zipped file: " + this.f367a);
                return false;
            }
        } else {
            try {
                fileInputStream = new FileInputStream(this.f367a);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            bufferedInputStream = new BufferedInputStream(fileInputStream);
        } catch (IOException e2) {
            AbstractC0916l.m1025a("Exception loading image: " + this.f367a, (Throwable) e2);
            this.f7154h = C1173e.f7177s.mo72C();
            this.f7155i = true;
        } catch (OutOfMemoryError e3) {
            AbstractC0916l.m1032a(EnumC1065u.uiImage, e3);
            this.f7154h = C1173e.f7176r.mo72C();
            this.f7155i = true;
        } catch (UnsupportedOperationException e4) {
            e4.printStackTrace();
            AbstractC0916l.m1025a("Exception loading image: " + this.f367a, (Throwable) e4);
            this.f7154h = C1173e.f7177s.mo72C();
            this.f7155i = true;
        }
        try {
            PNGImageData pNGImageData = new PNGImageData();
            pNGImageData.loadImage(bufferedInputStream);
            bufferedInputStream.close();
            this.f7154h = new Image(pNGImageData);
            this.width = this.f7154h.getWidth();
            this.height = this.f7154h.getHeight();
            if (this.f369c) {
                if (this.width > 500 || this.height > 500) {
                    AbstractC0916l.m963e("Map thumbnail is too large. Size:(" + this.width + "," + this.height + ") (max:500 pixels)");
                    this.f7154h = C1173e.f7178t.mo72C();
                    this.f7155i = true;
                    this.width = this.f7154h.getWidth();
                    this.height = this.f7154h.getHeight();
                    return true;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    @Override // com.LibRocket.TextureHolder
    public void remove() {
        if (this.f7154h != null && !this.f7155i) {
            try {
                this.f7154h.destroy();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
        this.f367a = null;
        this.f7156j = null;
        this.f7154h = null;
        this.f7155i = false;
    }
}
