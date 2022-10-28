package com.corrodinggames.rts.gameFramework.p036e;

/* renamed from: com.corrodinggames.rts.gameFramework.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/d.class */
public class C0753d extends C0752c {

    /* renamed from: g */
    String f4879g;

    /* renamed from: h */
    String f4880h;

    /* renamed from: i */
    String f4881i;

    public C0753d(String str, String str2) {
        this.f4879g = str;
        this.f4880h = str2;
        if (!this.f4879g.endsWith("/") && !this.f4879g.endsWith("\\")) {
            this.f4879g += "/";
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: b */
    public String mo2171b() {
        return this.f4879g;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: d */
    public String mo2170d() {
        return this.f4880h;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: e */
    public boolean mo2169e() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: e */
    public String mo2183e(String str) {
        String mo2183e = super.mo2183e(str);
        if (this.f4881i != null && mo2183e != null && mo2183e.startsWith(this.f4879g)) {
            String substring = mo2183e.substring(this.f4879g.length());
            if (substring.startsWith("/") || substring.startsWith("\\")) {
                substring = substring.substring(1);
            }
            mo2183e = this.f4881i + substring;
        }
        return mo2183e;
    }
}
