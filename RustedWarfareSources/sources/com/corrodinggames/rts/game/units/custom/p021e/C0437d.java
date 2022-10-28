package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/d.class */
public class C0437d {

    /* renamed from: a */
    public String f2772a;

    /* renamed from: b */
    public C0428a f2773b;

    /* renamed from: c */
    public float f2774c;

    /* renamed from: d */
    public Integer f2775d;

    /* renamed from: e */
    public boolean f2776e;

    /* renamed from: f */
    public boolean f2777f;

    /* renamed from: g */
    C0385az f2778g;

    /* renamed from: h */
    C0385az f2779h;

    /* renamed from: i */
    boolean f2780i;

    /* renamed from: j */
    boolean f2781j;

    /* renamed from: k */
    public boolean f2782k;

    /* renamed from: l */
    public boolean f2783l;

    /* renamed from: m */
    public boolean f2784m;

    /* renamed from: n */
    public boolean f2785n;

    /* renamed from: o */
    public boolean f2786o;

    /* renamed from: p */
    public EnumC0435b f2787p = EnumC0435b.none;

    /* renamed from: q */
    public int f2788q;

    /* renamed from: r */
    public C0385az f2789r;

    /* renamed from: s */
    public C0385az f2790s;

    /* renamed from: t */
    public String f2791t;

    /* renamed from: u */
    public C0428a f2792u;

    /* renamed from: v */
    public boolean f2793v;

    /* renamed from: w */
    public boolean f2794w;

    /* renamed from: x */
    public String f2795x;

    /* renamed from: y */
    public C0428a f2796y;

    /* renamed from: z */
    public C0934e f2797z;

    /* renamed from: A */
    public boolean f2798A;

    public C0437d(boolean z) {
        this.f2777f = z;
    }

    /* renamed from: a */
    public void m3641a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        this.f2772a = str2;
        this.f2778g = C0348af.m3911a(c1072ab, str, "displayName", (String) null);
        this.f2779h = C0348af.m3911a(c1072ab, str, "displayNameShort", (String) null);
        if (this.f2779h == null) {
            this.f2779h = this.f2778g;
        }
        this.f2780i = c1072ab.m663a(str, "displayNameHideWhenIconShownInHUD", (Boolean) false).booleanValue();
        this.f2781j = c1072ab.m663a(str, "displayNameHideWhenIconShownInText", (Boolean) false).booleanValue();
        this.f2783l = c1072ab.m663a(str, "hidden", (Boolean) false).booleanValue();
        this.f2782k = c1072ab.m663a(str, "stackHorizontal", (Boolean) false).booleanValue();
        this.f2774c = c1072ab.m661a(str, "priority", Float.valueOf(0.0f)).floatValue();
        this.f2775d = c1072ab.m659a(str, "displayColor", (Integer) null);
        this.f2776e = c1072ab.m663a(str, "displayColorUseInText", (Boolean) true).booleanValue();
        this.f2784m = c1072ab.m663a(str, "displayWithRounding", (Boolean) true).booleanValue();
        this.f2785n = c1072ab.m663a(str, "displayRoundedDown", (Boolean) false).booleanValue();
        this.f2786o = c1072ab.m663a(str, "displayWhenZero", (Boolean) false).booleanValue();
        this.f2788q = c1072ab.m645b(str, "displayPos", (Integer) 0).intValue();
        this.f2787p = (EnumC0435b) c1072ab.m662a(str, "displayDigitGrouping", EnumC0435b.none, EnumC0435b.class);
        this.f2789r = C0348af.m3911a(c1072ab, str, "displayTextPrefix", (String) null);
        this.f2790s = C0348af.m3911a(c1072ab, str, "displayTextPostfix", (String) null);
        C0385az m3911a = C0348af.m3911a(c1072ab, str, "displayPrefixInHUD", (String) null);
        if (m3911a != null) {
            if (this.f2789r != null) {
                throw new C0412bm("[" + str + "]displayPrefixInHUD and displayTextPrefix are aliases, don't use both");
            }
            this.f2789r = m3911a;
        }
        C0385az m3911a2 = C0348af.m3911a(c1072ab, str, "displayPostfixInHUD", (String) null);
        if (m3911a2 != null) {
            if (this.f2790s != null) {
                throw new C0412bm("[" + str + "]displayPostfixInHUD and displayTextPostfix are aliases, don't use both");
            }
            this.f2790s = m3911a2;
        }
        this.f2791t = c1072ab.m644b(str, "displayTextAppendResource", (String) null);
        String m644b = c1072ab.m644b(str, "appendResourceInHUD", (String) null);
        if (m644b != null) {
            if (this.f2791t != null) {
                throw new C0412bm("[" + str + "]displayTextAppendResource and appendResourceInHUD are aliases, don't use both");
            }
            this.f2791t = m644b;
        }
        this.f2793v = c1072ab.m663a(str, "displayTextAppendResourceWithGap", (Boolean) false).booleanValue();
        this.f2794w = c1072ab.m663a(str, "appendResourceInHUD_whenThisZero", (Boolean) true).booleanValue();
        this.f2797z = c0453l.m3436a(c1072ab, str, "iconImage", true);
        if (this.f2797z != null && (this.f2797z.mo386m() > 100 || this.f2797z.mo387l() > 100)) {
            throw new C0412bm("[" + str + "]iconImage: Image is too big, keep under 100x100");
        }
        this.f2798A = c1072ab.m663a(str, "iconImageUseInText", (Boolean) true).booleanValue();
        if (this.f2780i && this.f2797z == null) {
            throw new C0412bm("[" + str + "]displayNameHideWhenIconShownInHUD: Cannot use without iconImage");
        }
        if (this.f2781j && this.f2797z == null) {
            throw new C0412bm("[" + str + "]displayNameHideWhenIconShownInText: Cannot use without iconImage");
        }
        String str3 = (this.f2777f ? "g_" : "l_") + this.f2772a;
        this.f2773b = C0428a.m3664a(str3, false, this.f2777f);
        if (this.f2773b.f2753s) {
            throw new RuntimeException("Cannot define resource with a built-in name: " + str3);
        }
        if (!this.f2777f) {
            this.f2795x = c1072ab.m644b(str, "equivalentGlobalResourceForAI", (String) null);
        }
    }

    /* renamed from: a */
    public void m3642a(C0453l c0453l) {
        if (this.f2795x != null) {
            this.f2796y = c0453l.m3398k(this.f2795x);
            if (this.f2796y == null) {
                throw new C0412bm("[resource]equivalentGlobalResourceForAI: Failed to find resource: " + this.f2795x);
            }
            if (!this.f2796y.f2752r) {
                throw new C0412bm("[resource]equivalentGlobalResourceForAI: Expected global resource for: " + this.f2795x);
            }
        }
        if (this.f2791t != null) {
            this.f2792u = c0453l.m3398k(this.f2791t);
            if (this.f2792u == null) {
                throw new C0412bm("[resource]displayTextAppendResource: Failed to find resource: " + this.f2791t);
            }
        }
    }
}
