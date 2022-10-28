package com.corrodinggames.rts.java;

import java.nio.ByteBuffer;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.util.MiscUtils;

/* renamed from: com.corrodinggames.rts.java.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/t.class */
public class C1190t implements ImageData {

    /* renamed from: a */
    int f7270a;

    /* renamed from: c */
    private int f7271c;

    /* renamed from: d */
    private int f7272d;

    /* renamed from: e */
    private int f7273e;

    /* renamed from: f */
    private int f7274f;

    /* renamed from: g */
    private byte[] f7275g;

    /* renamed from: b */
    final /* synthetic */ C1189s f7276b;

    public C1190t(C1189s c1189s, Image image) {
        this.f7276b = c1189s;
        Texture texture = image.getTexture();
        this.f7275g = texture.getTextureData();
        this.f7270a = texture.hasAlpha() ? 32 : 24;
        this.f7271c = texture.getImageWidth();
        this.f7272d = texture.getImageHeight();
        this.f7273e = texture.getTextureWidth();
        this.f7274f = texture.getTextureHeight();
    }

    public int getDepth() {
        return this.f7270a;
    }

    public int getWidth() {
        return this.f7271c;
    }

    public int getHeight() {
        return this.f7272d;
    }

    public int getTexWidth() {
        return this.f7273e;
    }

    public int getTexHeight() {
        return this.f7274f;
    }

    public ByteBuffer getImageBufferData() {
        ByteBuffer createByteBuffer = MiscUtils.createByteBuffer(this.f7275g.length);
        createByteBuffer.put(this.f7275g);
        createByteBuffer.flip();
        return createByteBuffer;
    }

    /* renamed from: a */
    public byte[] m41a() {
        return this.f7275g;
    }
}
