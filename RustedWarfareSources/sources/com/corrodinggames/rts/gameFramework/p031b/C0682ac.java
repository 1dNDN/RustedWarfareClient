package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ac.class */
public class C0682ac {

    /* renamed from: a */
    public InterfaceC0700k f4319a;

    /* renamed from: b */
    public C0683ad f4320b;

    /* renamed from: c */
    public static Bitmap f4321c = Bitmap.m5147a(64, 64, Bitmap.Config.ARGB_8888);

    /* renamed from: g */
    boolean f4325g;

    /* renamed from: d */
    HashMap f4322d = new HashMap();

    /* renamed from: e */
    ArrayList f4323e = new ArrayList();

    /* renamed from: f */
    int f4324f = 0;

    /* renamed from: h */
    boolean f4326h = false;

    /* renamed from: i */
    int f4327i = 0;

    /* renamed from: j */
    int f4328j = 0;

    /* renamed from: k */
    int f4329k = 0;

    /* renamed from: l */
    int f4330l = 1;

    public C0682ac(InterfaceC0700k interfaceC0700k, int i, int i2) {
        this.f4319a = interfaceC0700k;
        this.f4320b = new C0683ad(interfaceC0700k, i, i2);
    }

    /* renamed from: a */
    public AbstractC0690b m2565a(Bitmap bitmap) {
        C0684ae c0684ae = (C0684ae) this.f4322d.get(bitmap);
        if (c0684ae != null) {
            if (this.f4326h) {
                this.f4323e.add(bitmap);
            }
            return c0684ae;
        }
        int m5138b = bitmap.m5138b();
        int m5135c = bitmap.m5135c();
        int b = this.f4320b.mo2546b();
        int c = this.f4320b.mo2545c();
        if (this.f4327i + m5138b > b) {
            this.f4327i = 0;
            this.f4328j += this.f4329k + this.f4330l;
            this.f4329k = 0;
        }
        if (this.f4328j + m5135c > c) {
            if (!this.f4325g) {
                this.f4325g = true;
                return null;
            }
            return null;
        }
        C0684ae c0684ae2 = new C0684ae();
        c0684ae2.f4351a = this.f4320b.f4351a;
        c0684ae2.f4332l = this.f4320b;
        int i = this.f4327i;
        int i2 = this.f4328j;
        this.f4327i += m5138b + this.f4330l;
        if (this.f4329k < m5135c) {
            this.f4329k = m5135c;
        }
        this.f4320b.m2563a(this.f4319a, bitmap, i, i2);
        c0684ae2.f4335o = i;
        c0684ae2.f4336p = i2;
        c0684ae2.f4333m = i / this.f4320b.f4355e;
        c0684ae2.f4334n = i2 / this.f4320b.f4356f;
        c0684ae2.f4355e = this.f4320b.f4355e;
        c0684ae2.f4356f = this.f4320b.f4356f;
        c0684ae2.f4357g = this.f4320b.f4357g;
        c0684ae2.f4358h = this.f4320b.f4358h;
        c0684ae2.f4353c = m5138b;
        c0684ae2.f4354d = m5135c;
        this.f4324f++;
        this.f4322d.put(bitmap, c0684ae2);
        return c0684ae2;
    }

    /* renamed from: b */
    public void m2564b(Bitmap bitmap) {
        if (((C0684ae) this.f4322d.get(bitmap)) != null) {
            this.f4322d.remove(bitmap);
        }
    }
}
