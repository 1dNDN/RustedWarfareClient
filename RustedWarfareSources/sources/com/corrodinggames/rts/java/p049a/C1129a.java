package com.corrodinggames.rts.java.p049a;

import java.nio.ByteBuffer;
import org.newdawn.slick.opengl.ImageData;

/* renamed from: com.corrodinggames.rts.java.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/a/a.class */
public class C1129a implements ImageData {

    /* renamed from: a */
    ImageData f7001a;

    /* renamed from: b */
    ByteBuffer f7002b;

    public C1129a(ImageData imageData, ByteBuffer byteBuffer) {
        this.f7001a = imageData;
        this.f7002b = byteBuffer;
    }

    public int getDepth() {
        return this.f7001a.getDepth();
    }

    public int getHeight() {
        return this.f7001a.getHeight();
    }

    public ByteBuffer getImageBufferData() {
        return this.f7002b;
    }

    public int getTexHeight() {
        return this.f7001a.getTexHeight();
    }

    public int getTexWidth() {
        return this.f7001a.getTexWidth();
    }

    public int getWidth() {
        return this.f7001a.getWidth();
    }
}
