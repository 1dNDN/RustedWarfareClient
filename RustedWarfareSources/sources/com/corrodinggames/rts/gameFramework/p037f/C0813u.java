package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/u.class */
public class C0813u {

    /* renamed from: h */
    static Paint f5374h;

    /* renamed from: a */
    static C0930ag f5375a = new C0930ag();

    /* renamed from: b */
    static C0930ag f5376b = new C0930ag();

    /* renamed from: c */
    static C0930ag f5377c = new C0930ag();

    /* renamed from: f */
    static Paint f5378f = new Paint();

    /* renamed from: d */
    public Paint f5379d = f5375a;

    /* renamed from: e */
    public Paint f5380e = f5375a;

    /* renamed from: g */
    public Paint f5381g = this.f5379d;

    /* renamed from: i */
    C1101m f5382i = new C1101m();

    static {
        f5377c.mo900a(true);
        f5374h = new Paint();
        f5374h.m5501b(-65536);
        f5374h.m5516a(Paint.Style.f220b);
    }

    /* renamed from: a */
    public void m1711a(Paint paint) {
        if (paint == null) {
            this.f5381g = this.f5379d;
        } else {
            this.f5381g = paint;
        }
    }

    /* renamed from: a */
    public void m1704a(boolean z) {
        if (z) {
            this.f5381g = this.f5380e;
        } else {
            this.f5381g = this.f5379d;
        }
    }

    /* renamed from: a */
    public String m1713a() {
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
    public void m1708a(String str) {
        if (this.f5382i.size() > 0) {
            int size = this.f5382i.size() - 1;
            C0814v c0814v = (C0814v) this.f5382i.get(size);
            if (c0814v instanceof C0817y) {
                C0817y c0817y = (C0817y) c0814v;
                String m2125a = C0758f.m2125a(c0817y.f5391d, str);
                if (!c0817y.f5391d.equals(m2125a)) {
                    this.f5382i.set(size, c0817y.mo5757b(m2125a));
                }
            }
        }
    }

    /* renamed from: b */
    public void m1703b() {
        this.f5382i.clear();
    }

    /* renamed from: a */
    public void m1710a(C0814v c0814v) {
        this.f5382i.add(c0814v);
    }

    /* renamed from: b */
    public void m1702b(String str) {
        if (this.f5381g != null && this.f5381g != this.f5379d) {
            m1705a(str, this.f5381g);
        } else {
            m1710a(new C0817y(this, str));
        }
    }

    /* renamed from: a */
    public void m1705a(String str, Paint paint) {
        m1710a(new C0815w(this, str, paint));
    }

    /* renamed from: a */
    public void m1707a(String str, int i) {
        if (this.f5381g != null && this.f5381g != this.f5379d) {
            m1710a(new C0815w(this, str, this.f5381g, i));
        } else {
            m1710a(new C0815w(this, str, null, i));
        }
    }

    /* renamed from: a */
    public void m1706a(String str, int i, boolean z) {
        Paint paint = this.f5379d;
        if (z) {
            paint = this.f5380e;
        }
        m1710a(new C0815w(this, str, paint, i));
    }

    /* renamed from: a */
    public void m1709a(C0934e c0934e, int i, int i2) {
        C0816x c0816x = new C0816x(this);
        c0816x.f5386a = c0934e;
        float m1885a = C0795d.m1885a(c0934e, i, i2);
        c0816x.f5388c = (int) (c0934e.f6402p * m1885a);
        c0816x.f5389d = (int) (c0934e.f6403q * m1885a);
        c0816x.f5387b = m1885a;
        this.f5382i.add(c0816x);
    }

    /* renamed from: c */
    public int m1701c() {
        return LoggerMaybe.m1079A().f6113bO.mo184a("A", this.f5381g);
    }

    /* renamed from: a */
    public C0818z m1712a(int i, boolean z) {
        int lastIndexOf;
        LoggerMaybe.m1079A();
        Rect rect = new Rect((-i) / 2, 0, i / 2, 10);
        C1101m c1101m = new C1101m();
        C0776aa c0776aa = new C0776aa();
        Paint paint = this.f5379d;
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
                c0776aa.m1927a(c0814v);
                c0776aa.f5059b += c0814v.mo1699a(this.f5379d);
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
                        int m5513a = paint.m5513a((CharSequence) str, i3, str.length(), true, i2 - c0776aa.f5059b, (float[]) null);
                        if (m5513a == 0) {
                            break;
                        }
                        boolean z2 = true;
                        int indexOf = str.indexOf("\n", i3 + 1);
                        if (indexOf != -1 && indexOf < i3 + m5513a) {
                            m5513a = indexOf - i3;
                        } else {
                            if (i3 + m5513a < str.length() && (lastIndexOf = str.substring(i3, i3 + m5513a).lastIndexOf(" ")) != -1 && lastIndexOf != 0) {
                                m5513a = lastIndexOf;
                            }
                            if (i3 + m5513a == str.length()) {
                                z2 = false;
                            }
                        }
                        String substring = str.substring(i3, i3 + m5513a);
                        if (C0758f.m2079c(substring, "\\n")) {
                            substring = substring.replaceAll("(\\n)", VariableScope.nullOrMissingString);
                        }
                        C0817y mo5757b = c0817y.mo5757b(substring);
                        c0776aa.m1927a(mo5757b);
                        c0776aa.f5059b += mo5757b.mo1699a(this.f5379d);
                        i3 += m5513a;
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
        rect.f233d = rect.f231b + (c1101m.size() * C0795d.m1886a(paint));
        if (z) {
            float m5460d = rect.m5460d();
            float f = 0.0f;
            Iterator it2 = c1101m.iterator();
            while (it2.hasNext()) {
                C0776aa c0776aa2 = (C0776aa) it2.next();
                if (c0776aa2.f5059b > f) {
                    f = c0776aa2.f5059b;
                }
            }
            float f2 = f;
            if (f2 < rect.m5465b()) {
                rect.f230a = (int) (m5460d - (f2 / 2.0f));
                rect.f232c = (int) (m5460d + (f2 / 2.0f));
            }
        }
        C0818z c0818z = new C0818z();
        c0818z.f5393a = c1101m;
        c0818z.f5394b = rect;
        c0818z.f5395c = this.f5379d;
        c0818z.f5396d = this.f5380e;
        return c0818z;
    }
}
