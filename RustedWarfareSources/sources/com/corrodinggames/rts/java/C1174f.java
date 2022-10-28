package com.corrodinggames.rts.java;

import org.newdawn.slick.Font;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.java.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/f.class */
public class C1174f {

    /* renamed from: a */
    int f7208a;

    /* renamed from: b */
    boolean f7209b;

    /* renamed from: c */
    boolean f7210c;

    /* renamed from: d */
    Font f7211d;

    /* renamed from: e */
    int f7212e;

    /* renamed from: f */
    String[] f7213f = new String[30];

    /* renamed from: g */
    final /* synthetic */ C1173e f7214g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1174f(C1173e c1173e) {
        this.f7214g = c1173e;
    }

    /* renamed from: a */
    public C1174f clone() {
        C1174f c1174f = new C1174f(this.f7214g);
        c1174f.f7208a = this.f7208a;
        c1174f.f7209b = this.f7209b;
        c1174f.f7210c = this.f7210c;
        return c1174f;
    }

    public String toString() {
        return "FontKey:(size:" + this.f7208a + ",  bold:" + this.f7209b + " fallback:" + this.f7210c + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m118a(String str) {
        if (str == null || !C1173e.m182a(str)) {
            return true;
        }
        for (int i = 0; i < this.f7213f.length; i++) {
            String str2 = this.f7213f[i];
            if (str2 != null && str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m117b(String str) {
        this.f7213f[this.f7212e] = str;
        this.f7212e++;
        if (this.f7212e >= this.f7213f.length) {
            this.f7212e = 0;
        }
    }
}
