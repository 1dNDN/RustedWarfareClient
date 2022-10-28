package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/u.class */
public class C0813u {

    /* renamed from: h */
    static Paint f5381h;

    /* renamed from: a */
    static C0930ag f5374a = new C0930ag();

    /* renamed from: b */
    static C0930ag f5375b = new C0930ag();

    /* renamed from: c */
    static C0930ag f5376c = new C0930ag();

    /* renamed from: f */
    static Paint f5379f = new Paint();

    /* renamed from: d */
    public Paint f5377d = f5374a;

    /* renamed from: e */
    public Paint f5378e = f5374a;

    /* renamed from: g */
    public Paint f5380g = this.f5377d;

    /* renamed from: i */
    C1101m f5382i = new C1101m();

    static {
        f5376c.mo5914a(true);
        f5381h = new Paint();
        f5381h.m5908b(-65536);
        f5381h.m5926a(Paint.Style.f220b);
    }

    /* renamed from: a */
    public void m1753a(Paint paint) {
        if (paint == null) {
            this.f5380g = this.f5377d;
        } else {
            this.f5380g = paint;
        }
    }

    /* renamed from: a */
    public void m1746a(boolean z) {
        if (z) {
            this.f5380g = this.f5378e;
        } else {
            this.f5380g = this.f5377d;
        }
    }

    /* renamed from: a */
    public String m1755a() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f5382i.iterator();
        while (it.hasNext()) {
            C0814v c0814v = (C0814v) it.next();
            if (c0814v instanceof C0817y) {
                sb.append(((C0817y) c0814v).f5391d);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m1750a(String str) {
        if (this.f5382i.size() > 0) {
            int size = this.f5382i.size() - 1;
            C0814v c0814v = (C0814v) this.f5382i.get(size);
            if (c0814v instanceof C0817y) {
                C0817y c0817y = (C0817y) c0814v;
                String m2174a = C0758f.m2174a(c0817y.f5391d, str);
                if (!c0817y.f5391d.equals(m2174a)) {
                    this.f5382i.set(size, c0817y.mo1739b(m2174a));
                }
            }
        }
    }

    /* renamed from: b */
    public void m1745b() {
        this.f5382i.clear();
    }

    /* renamed from: a */
    public void m1752a(C0814v c0814v) {
        this.f5382i.add(c0814v);
    }

    /* renamed from: b */
    public void m1744b(String str) {
        if (this.f5380g != null && this.f5380g != this.f5377d) {
            m1747a(str, this.f5380g);
        } else {
            m1752a(new C0817y(this, str));
        }
    }

    /* renamed from: a */
    public void m1747a(String str, Paint paint) {
        m1752a(new C0815w(this, str, paint));
    }

    /* renamed from: a */
    public void m1749a(String str, int i) {
        if (this.f5380g != null && this.f5380g != this.f5377d) {
            m1752a(new C0815w(this, str, this.f5380g, i));
        } else {
            m1752a(new C0815w(this, str, null, i));
        }
    }

    /* renamed from: a */
    public void m1748a(String str, int i, boolean z) {
        Paint paint = this.f5377d;
        if (z) {
            paint = this.f5378e;
        }
        m1752a(new C0815w(this, str, paint, i));
    }

    /* renamed from: a */
    public void m1751a(C0934e c0934e, int i, int i2) {
        C0816x c0816x = new C0816x(this);
        c0816x.f5386a = c0934e;
        float m1927a = C0795d.m1927a(c0934e, i, i2);
        c0816x.f5388c = (int) (c0934e.f6402p * m1927a);
        c0816x.f5389d = (int) (c0934e.f6403q * m1927a);
        c0816x.f5387b = m1927a;
        this.f5382i.add(c0816x);
    }

    /* renamed from: c */
    public int m1743c() {
        return Core.m1087A().f6113bO.mo179a("A", this.f5380g);
    }

    /* renamed from: a */
    public C0818z m1754a(int i, boolean z) {
        int lastIndexOf;
        Core.m1087A();
        Rect rect = new Rect((-i) / 2, 0, i / 2, 10);
        C1101m c1101m = new C1101m();
        C0776aa c0776aa = new C0776aa();
        Paint paint = this.f5377d;
        int i2 = i - 5;
        Iterator it = this.f5382i.iterator();
        while (it.hasNext()) {
            C0814v c0814v = (C0814v) it.next();
            if (c0776aa.f5059b >= i2 - 5) {
                if (c0776aa.f5058a.size() > 0) {
                    c1101m.add(c0776aa);
                }
                c0776aa = new C0776aa();
            }
            if (!(c0814v instanceof C0817y)) {
                c0776aa.m1975a(c0814v);
                c0776aa.f5059b += c0814v.mo1741a(this.f5377d);
            } else {
                C0817y c0817y = (C0817y) c0814v;
                String str = c0817y.f5391d;
                int i3 = 0;
                while (i3 < str.length()) {
                    if (str.charAt(i3) == '\n') {
                        i3++;
                        c1101m.add(c0776aa);
                        c0776aa = new C0776aa();
                    } else {
                        int m5922a = paint.m5922a((CharSequence) str, i3, str.length(), true, i2 - c0776aa.f5059b, (float[]) null);
                        if (m5922a == 0) {
                            break;
                        }
                        boolean z2 = true;
                        int indexOf = str.indexOf("\n", i3 + 1);
                        if (indexOf != -1 && indexOf < i3 + m5922a) {
                            m5922a = indexOf - i3;
                        } else {
                            if (i3 + m5922a < str.length() && (lastIndexOf = str.substring(i3, i3 + m5922a).lastIndexOf(" ")) != -1 && lastIndexOf != 0) {
                                m5922a = lastIndexOf;
                            }
                            if (i3 + m5922a == str.length()) {
                                z2 = false;
                            }
                        }
                        String substring = str.substring(i3, i3 + m5922a);
                        if (C0758f.m2128c(substring, "\\n")) {
                            substring = substring.replaceAll("(\\n)", VariableScope.nullOrMissingString);
                        }
                        C0817y mo1739b = c0817y.mo1739b(substring);
                        c0776aa.m1975a(mo1739b);
                        c0776aa.f5059b += mo1739b.mo1741a(this.f5377d);
                        i3 += m5922a;
                        if (i3 < str.length() && str.charAt(i3) == '\n') {
                            i3++;
                        }
                        if (z2 || c0776aa.f5059b >= i2 - 5) {
                            if (c0776aa.f5058a.size() > 0) {
                                c1101m.add(c0776aa);
                            }
                            c0776aa = new C0776aa();
                        }
                    }
                }
            }
        }
        if (c0776aa.f5058a.size() > 0) {
            c1101m.add(c0776aa);
        }
        if (c1101m.size() > 0 && ((C0776aa) c1101m.get(c1101m.size() - 1)).f5058a.size() == 0) {
            c1101m.remove(c1101m.size() - 1);
        }
        rect.f233d = rect.f231b + (c1101m.size() * C0795d.m1928a(paint));
        if (z) {
            float m5867d = rect.m5867d();
            float f = 0.0f;
            Iterator it2 = c1101m.iterator();
            while (it2.hasNext()) {
                C0776aa c0776aa2 = (C0776aa) it2.next();
                if (c0776aa2.f5059b > f) {
                    f = c0776aa2.f5059b;
                }
            }
            float f2 = f;
            if (f2 < rect.m5872b()) {
                rect.f230a = (int) (m5867d - (f2 / 2.0f));
                rect.f232c = (int) (m5867d + (f2 / 2.0f));
            }
        }
        C0818z c0818z = new C0818z();
        c0818z.f5393a = c1101m;
        c0818z.f5394b = rect;
        c0818z.f5395c = this.f5377d;
        c0818z.f5396d = this.f5378e;
        return c0818z;
    }
}
