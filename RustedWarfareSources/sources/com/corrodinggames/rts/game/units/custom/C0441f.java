package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f.class */
public class C0441f {

    /* renamed from: a */
    public String f2805a;

    /* renamed from: b */
    public int f2806b;

    /* renamed from: c */
    public int f2807c;

    /* renamed from: d */
    public float f2808d;

    /* renamed from: e */
    public float f2809e;

    /* renamed from: f */
    public float f2810f;

    /* renamed from: g */
    public boolean f2811g;

    /* renamed from: h */
    public float f2812h;

    /* renamed from: i */
    public float f2813i;

    /* renamed from: j */
    public LogicBoolean f2814j;

    /* renamed from: k */
    public C0455m f2815k;

    /* renamed from: n */
    public float f2818n;

    /* renamed from: o */
    public boolean f2819o;

    /* renamed from: q */
    public float f2821q;

    /* renamed from: l */
    public C1101m f2816l = new C1101m();

    /* renamed from: m */
    public boolean f2817m = true;

    /* renamed from: p */
    public ArrayList f2820p = new ArrayList();

    public C0441f(String str) {
        this.f2805a = str;
    }

    /* renamed from: a */
    public void m3595a(C0453l c0453l) {
        Iterator it = this.f2816l.iterator();
        while (it.hasNext()) {
            C0415c c0415c = (C0415c) it.next();
            if (c0415c.f2658a == EnumC0422d.legX || c0415c.f2658a == EnumC0422d.legY || c0415c.f2658a == EnumC0422d.legHeight || c0415c.f2658a == EnumC0422d.legDir || c0415c.f2658a == EnumC0422d.legAlpha) {
                boolean z = false;
                C0384ay[] c0384ayArr = c0453l.f2977aw;
                int length = c0384ayArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C0384ay c0384ay = c0384ayArr[i];
                    if (!c0415c.f2660c.equals(c0384ay.f2273b)) {
                        i++;
                    } else {
                        c0415c.f2659b = c0384ay.f2272a;
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new C0412bm("Cannot find leg:" + c0415c.f2660c + " for animation:" + this.f2805a);
                }
            }
            if (c0415c.f2659b < 0) {
                throw new C0412bm("Cannot find target for:" + c0415c.f2660c + " for animation:" + this.f2805a);
            }
        }
    }

    /* renamed from: a */
    public boolean m3592a(EnumC0456n enumC0456n) {
        Iterator it = this.f2820p.iterator();
        while (it.hasNext()) {
            if (((EnumC0456n) it.next()) == enumC0456n) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3596a() {
        return this.f2819o;
    }

    /* renamed from: a */
    public void m3594a(C0453l c0453l, C1072ab c1072ab, String str, String str2) {
        C0441f m3442a;
        boolean z = false;
        String str3 = null;
        String m644b = c1072ab.m644b(str, str2 + "onActions", (String) null);
        if (m644b != null) {
            for (String str4 : m644b.split(",")) {
                String trim = str4.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    EnumC0456n m3372a = EnumC0456n.m3372a(trim);
                    if (m3372a == null) {
                        throw new C0412bm("Unknown action type: " + trim + " on animation:" + this.f2805a);
                    }
                    if (c0453l.m3442a(m3372a) != null) {
                        throw new C0412bm("Cannot add action: " + trim + " to:" + this.f2805a + " it already exists on:" + m3442a.f2805a);
                    }
                    this.f2820p.add(m3372a);
                }
            }
        }
        this.f2821q = c1072ab.m661a(str, str2 + "onActionsQueuedUnitPlayAt", Float.valueOf(0.0f)).floatValue();
        this.f2806b = c1072ab.m645b(str, str2 + "start", (Integer) 0).intValue();
        this.f2807c = c1072ab.m645b(str, str2 + "end", (Integer) (-1)).intValue();
        if (this.f2807c != -1 && this.f2807c < this.f2806b) {
            throw new RuntimeException("animationEnd cannot before animationStart on animation:" + this.f2805a);
        }
        this.f2815k = C0455m.m3373a(c0453l, c1072ab, str, VariableScope.nullOrMissingString, true);
        this.f2812h = c1072ab.m634d(str, str2 + "blendIn", Float.valueOf(-1.0f)).floatValue();
        this.f2813i = c1072ab.m634d(str, str2 + "blendOut", Float.valueOf(-1.0f)).floatValue();
        this.f2814j = c1072ab.m681a(c0453l, str, str2 + "playbackRate", (LogicBoolean) null, LogicBoolean.ReturnType.number);
        this.f2808d = c1072ab.m661a(str, str2 + "scale_start", Float.valueOf(1.0f)).floatValue();
        this.f2809e = c1072ab.m661a(str, str2 + "scale_end", Float.valueOf(1.0f)).floatValue();
        Float m661a = c1072ab.m661a(str, str2 + "speed", (Float) null);
        if (m661a != null) {
            this.f2810f = m661a.floatValue();
            z = true;
            str3 = "speed";
        } else {
            this.f2810f = 40.0f;
        }
        this.f2811g = c1072ab.m663a(str, str2 + "pingPong", (Boolean) false).booleanValue();
        float f = 1.0f * this.f2810f;
        float floatValue = c1072ab.m661a(str, str2 + "KeyframeTimeScale", Float.valueOf(1.0f)).floatValue();
        if (this.f2807c != -1) {
            z = true;
            str3 = "animationEnd";
            C0415c c0415c = new C0415c();
            c0415c.f2658a = EnumC0422d.frame;
            this.f2816l.add(c0415c);
            f *= (this.f2807c - this.f2806b) + 1;
            c0415c.m3753a(0.0f, this.f2806b);
            c0415c.m3753a(f, this.f2807c + 0.99f);
        }
        if (this.f2808d != 1.0f || this.f2809e != 1.0f) {
            z = true;
            str3 = "animationScaleX";
            C0415c c0415c2 = new C0415c();
            c0415c2.f2658a = EnumC0422d.scale;
            this.f2816l.add(c0415c2);
            c0415c2.m3753a(0.0f, this.f2808d);
            c0415c2.m3753a(f, this.f2809e);
        }
        if (z) {
            this.f2818n = f;
        }
        C1101m m627f = c1072ab.m627f(str, str2 + "leg", str2 + "arm");
        m627f.addAll(c1072ab.m617k(str, str2 + "turret"));
        m627f.addAll(c1072ab.m617k(str, str2 + "body"));
        m627f.addAll(c1072ab.m617k(str, str2 + "effect"));
        Iterator it = m627f.iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (0 == 0) {
                if (z) {
                    throw new C0412bm("Cannot mix new (" + str5 + ") and old style (" + str3 + ") animations on:" + this.f2805a);
                }
                m3593a(c0453l, c1072ab, str, str2, str5);
            }
        }
        C1101m c1101m = new C1101m();
        this.f2817m = false;
        Iterator it2 = this.f2816l.iterator();
        while (it2.hasNext()) {
            C0415c c0415c3 = (C0415c) it2.next();
            c0415c3.m3754a(floatValue);
            c0415c3.m3748c();
            if (this.f2818n < c0415c3.f2661d) {
                this.f2818n = c0415c3.f2661d;
            }
            if (c0415c3.f2662e.length > 0) {
                this.f2819o = true;
                if (c0415c3.f2658a != EnumC0422d.frame && c0415c3.f2658a != EnumC0422d.scale) {
                    this.f2817m = true;
                }
                c1101m.add(c0415c3);
            }
        }
        this.f2816l = c1101m;
    }

    /* renamed from: a */
    public C0415c m3591a(String str, String str2) {
        int i;
        EnumC0422d enumC0422d;
        if (str2.startsWith("leg") || str2.startsWith("arm")) {
            i = -1;
            if (str.equalsIgnoreCase("x")) {
                enumC0422d = EnumC0422d.legX;
            } else if (str.equalsIgnoreCase("y")) {
                enumC0422d = EnumC0422d.legY;
            } else if (str.equalsIgnoreCase("dir")) {
                enumC0422d = EnumC0422d.legDir;
            } else if (str.equalsIgnoreCase("height")) {
                enumC0422d = EnumC0422d.legHeight;
            } else if (str.equalsIgnoreCase("alpha")) {
                enumC0422d = EnumC0422d.legAlpha;
            } else {
                throw new C0412bm("Unknown leg/arm animation type:" + str + " on animation:" + this.f2805a);
            }
        } else if (str2.startsWith("turret")) {
            i = Integer.parseInt(str2.substring("turret".length())) - 1;
            if (str.equalsIgnoreCase("x")) {
                enumC0422d = EnumC0422d.turretX;
            } else if (str.equalsIgnoreCase("y")) {
                enumC0422d = EnumC0422d.turretY;
            } else {
                throw new C0412bm("Unknown turret animation type:" + str + " on animation:" + this.f2805a);
            }
        } else if (str2.startsWith("body")) {
            i = 0;
            if (str.equalsIgnoreCase("scale")) {
                enumC0422d = EnumC0422d.scale;
            } else if (str.equalsIgnoreCase("frame")) {
                enumC0422d = EnumC0422d.frame;
            } else {
                throw new C0412bm("Unknown body animation type:" + str + " on animation:" + this.f2805a);
            }
        } else if (str2.startsWith("effect")) {
            i = 0;
            enumC0422d = EnumC0422d.event;
            str2 = "event";
        } else {
            throw new C0412bm("Unknown animation target:" + str2 + " on animation:" + this.f2805a);
        }
        Iterator it = this.f2816l.iterator();
        while (it.hasNext()) {
            C0415c c0415c = (C0415c) it.next();
            if (c0415c.f2658a == enumC0422d && str2.equals(c0415c.f2660c)) {
                return c0415c;
            }
        }
        C0415c c0415c2 = new C0415c();
        c0415c2.f2658a = enumC0422d;
        c0415c2.f2659b = i;
        c0415c2.f2660c = str2;
        this.f2816l.add(c0415c2);
        return c0415c2;
    }

    /* renamed from: a */
    public void m3593a(C0453l c0453l, C1072ab c1072ab, String str, String str2, String str3) {
        String[] split;
        String str4 = str3.substring(str2.length()).split("_")[0];
        String substring = str3.substring((str2 + str4 + "_").length());
        try {
            float m651a = C1072ab.m651a(substring, false, str, str3);
            String m631e = c1072ab.m631e(str, str3);
            if (!m631e.startsWith("{") || !m631e.endsWith("}")) {
                throw new C0412bm("Unknown format:" + m631e, str, str3);
            }
            String substring2 = m631e.substring(1, m631e.length() - 1);
            C0415c c0415c = null;
            for (String str5 : substring2.split(",")) {
                String[] split2 = str5.split(":");
                if (split2.length != 2) {
                    throw new C0412bm("Unknown format on part:" + str5 + " of: " + substring2, str, str3);
                }
                String trim = split2[0].trim();
                String trim2 = split2[1].trim();
                C0415c m3591a = m3591a(trim, str4);
                if (c0415c != m3591a) {
                    if (c0415c != null) {
                        c0415c.m3750b();
                    }
                    c0415c = m3591a;
                }
                try {
                    m3591a.m3751a(c0453l, m651a, trim, trim2);
                } catch (C0412bm e) {
                    throw new C0412bm(e.getMessage() + " (as part of key:" + str3 + " section:" + str + ")", e);
                }
            }
            if (c0415c != null) {
                c0415c.m3750b();
            }
        } catch (NumberFormatException e2) {
            throw new C0412bm("Failed to read time:" + substring + " in key:" + str3 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }
}
