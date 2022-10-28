package com.corrodinggames.rts.gameFramework.p037f.p038a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/c.class */
public class C0765c {

    /* renamed from: a */
    public int f5006a;

    /* renamed from: b */
    public int f5007b;

    /* renamed from: c */
    public EnumC0766d f5008c;

    /* renamed from: d */
    public int f5009d = -1;

    /* renamed from: a */
    public static C0765c m1957a(int i, int i2) {
        C0765c c0765c = new C0765c();
        c0765c.f5006a = i;
        c0765c.f5007b = i2;
        c0765c.f5008c = EnumC0766d.mouseClick;
        c0765c.f5009d = 1;
        return c0765c;
    }

    /* renamed from: b */
    public static C0765c m1955b(int i, int i2) {
        C0765c c0765c = new C0765c();
        c0765c.f5006a = i;
        c0765c.f5007b = i2;
        c0765c.f5008c = EnumC0766d.mouseMove;
        c0765c.f5009d = 1;
        return c0765c;
    }

    /* renamed from: a */
    public boolean m1958a() {
        return this.f5008c == EnumC0766d.mouseClick;
    }

    /* renamed from: b */
    public boolean m1956b() {
        return this.f5008c == EnumC0766d.mouseMove;
    }
}
