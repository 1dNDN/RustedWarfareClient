package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0172a;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p045m.p046a.AbstractC1031a;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/a.class */
public class C1030a {

    /* renamed from: a */
    public String f6597a;

    /* renamed from: b */
    public String f6598b;

    /* renamed from: c */
    public String f6599c;

    /* renamed from: g */
    public EnumC1037e f6603g;

    /* renamed from: h */
    public boolean f6604h;

    /* renamed from: i */
    public boolean f6605i;

    /* renamed from: j */
    public boolean f6606j;

    /* renamed from: k */
    public int f6607k;

    /* renamed from: l */
    public int f6608l;

    /* renamed from: m */
    public boolean f6609m;

    /* renamed from: p */
    public int f6612p;

    /* renamed from: t */
    public C0172a f6616t;

    /* renamed from: v */
    public C0413bn f6618v;

    /* renamed from: w */
    public float f6619w;

    /* renamed from: x */
    public float f6620x;

    /* renamed from: y */
    public AbstractC0197n f6621y;

    /* renamed from: z */
    public C0385az f6622z;

    /* renamed from: A */
    public C0385az f6623A;

    /* renamed from: B */
    public Paint f6624B;

    /* renamed from: C */
    public boolean f6625C;

    /* renamed from: d */
    public C1034b f6600d = new C1034b();

    /* renamed from: e */
    public C1034b f6601e = new C1034b();

    /* renamed from: f */
    public C1101m f6602f = new C1101m();

    /* renamed from: n */
    public int f6610n = -1;

    /* renamed from: o */
    public int f6611o = Integer.MAX_VALUE;

    /* renamed from: q */
    public int f6613q = -1;

    /* renamed from: r */
    public int f6614r = -1;

    /* renamed from: s */
    public int f6615s = -1;

    /* renamed from: u */
    public boolean f6617u = false;

    /* renamed from: a */
    public void m813a(AbstractC1031a abstractC1031a) {
        this.f6602f.add(abstractC1031a);
    }

    /* renamed from: a */
    public void m812a(String str) {
        this.f6616t.m4966b(str);
    }

    /* renamed from: b */
    public String m802b(String str) {
        return this.f6616t.m4966b(str);
    }

    /* renamed from: a */
    public String m807a(String str, String str2) {
        return this.f6616t.m4969a(str, str2);
    }

    /* renamed from: c */
    public boolean m799c(String str) {
        return this.f6616t.m4966b(str) != null;
    }

    /* renamed from: a */
    public int m810a(String str, int i) {
        String m807a = m807a(str, (String) null);
        if (m807a == null) {
            return i;
        }
        try {
            return Integer.parseInt(m807a);
        } catch (NumberFormatException e) {
            throw m794f(str + ": Unexpected integer value:'" + m807a + "'");
        }
    }

    /* renamed from: b */
    public int m801b(String str, int i) {
        double d;
        String m802b = m802b(str);
        if (m802b == null) {
            return i;
        }
        if (m802b.endsWith("ms")) {
            m802b = m802b.substring(0, m802b.length() - 2);
            d = 1.0d;
        } else if (m802b.endsWith("s")) {
            m802b = m802b.substring(0, m802b.length() - 1);
            d = 1000.0d;
        } else {
            d = 1.0d;
        }
        try {
            return (int) (Double.parseDouble(m802b) * d);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw m794f(str + ": Unexpected time:'" + m802b + "'");
        }
    }

    /* renamed from: a */
    public float m811a(String str, float f) {
        String m807a = m807a(str, (String) null);
        if (m807a == null) {
            return f;
        }
        try {
            return Float.parseFloat(m807a);
        } catch (NumberFormatException e) {
            throw m794f(str + ": Unexpected float value:'" + m807a + "'");
        }
    }

    /* renamed from: d */
    public Integer m796d(String str) {
        String m807a = m807a(str, (String) null);
        if (m807a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m807a));
        } catch (NumberFormatException e) {
            throw m794f(str + ": Unexpected integer value:'" + m807a + "'");
        }
    }

    /* renamed from: e */
    public Boolean m795e(String str) {
        String m807a = m807a(str, (String) null);
        if (m807a == null) {
            return null;
        }
        if (m807a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m807a.equalsIgnoreCase("false")) {
            return false;
        }
        throw m794f(str + ": Unexpected boolean value:'" + m807a + "'");
    }

    /* renamed from: a */
    public boolean m806a(String str, String str2, boolean z) {
        Boolean m795e = m795e(str);
        if (m795e != null) {
            return m795e.booleanValue();
        }
        Boolean m795e2 = m795e(str2);
        if (m795e2 != null) {
            return m795e2.booleanValue();
        }
        return z;
    }

    /* renamed from: a */
    public boolean m805a(String str, boolean z) {
        String m807a = m807a(str, (String) null);
        if (m807a == null) {
            return z;
        }
        if (m807a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m807a.equalsIgnoreCase("false")) {
            return false;
        }
        throw m794f(str + ": Unexpected boolean value:'" + m807a + "'");
    }

    /* renamed from: c */
    public int m798c(String str, int i) {
        String m802b = m802b(str);
        if (m802b == null) {
            return i;
        }
        if (m802b.equals(VariableScope.nullOrMissingString)) {
            throw m794f(str + ": Unknown color:" + m802b);
        }
        try {
            return Color.m5537a(m802b);
        } catch (IllegalArgumentException e) {
            throw m794f(str + ": Unknown color:" + m802b);
        }
    }

    /* renamed from: a */
    public C0385az m809a(String str, C0385az c0385az) {
        return this.f6616t.m4970a(str, c0385az);
    }

    /* renamed from: a */
    public boolean m814a(AbstractC0244am abstractC0244am) {
        return this.f6616t.m4972a(abstractC0244am);
    }

    /* renamed from: f */
    public C0179f m794f(String str) {
        return m808a(str, (Exception) null);
    }

    /* renamed from: a */
    public C0179f m808a(String str, Exception exc) {
        String str2 = "MapTrigger-Error (" + this.f6597a + " id:" + this.f6598b + "): " + str;
        C0831ad.m1451g(str2);
        if (exc == null) {
            return new C0179f(str2);
        }
        return new C0179f(str2, exc);
    }

    /* renamed from: g */
    public void m793g(String str) {
        C0831ad.m1451g("MapTrigger-Error (" + this.f6597a + " id:" + this.f6598b + " type:" + this.f6603g + "): " + str);
    }

    /* renamed from: h */
    public void m792h(String str) {
        LoggerMaybe.LogDebug2("MapTrigger-Debug (" + this.f6598b + " type:" + this.f6603g + "): " + str);
    }

    /* renamed from: a */
    public AbstractC0197n m815a() {
        return this.f6621y;
    }

    /* renamed from: b */
    public int m804b() {
        return (int) this.f6616t.f776j.m5443d();
    }

    /* renamed from: c */
    public int m800c() {
        return (int) this.f6616t.f776j.m5442e();
    }

    /* renamed from: b */
    public boolean m803b(AbstractC0244am abstractC0244am) {
        AbstractC0197n m815a = m815a();
        if (m815a != null && abstractC0244am.f1609bV != m815a) {
            return false;
        }
        if (m799c("onlyIfEmpty") && abstractC0244am.mo3209cq() && (abstractC0244am instanceof InterfaceC0242ak) && ((InterfaceC0242ak) abstractC0244am).mo3215bB() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m797d() {
        boolean z;
        int i = LoggerMaybe.m1079A().f6102by;
        boolean z2 = true;
        boolean z3 = false;
        if (!this.f6609m && this.f6614r != -1) {
            if (this.f6614r <= i) {
                z3 = true;
                this.f6609m = true;
            } else {
                z2 = false;
            }
        }
        if (this.f6600d.m785a()) {
            if (this.f6600d.m783b()) {
                z3 = true;
            } else {
                z2 = false;
            }
        }
        if (this.f6602f.f6894a > 0) {
            Iterator it = this.f6602f.iterator();
            while (it.hasNext()) {
                AbstractC1031a abstractC1031a = (AbstractC1031a) it.next();
                if (abstractC1031a.m791a(this)) {
                    if (abstractC1031a.mo788b(this)) {
                        z3 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        if (this.f6604h) {
            z = z3 && z2;
        } else {
            z = z3;
            if (z2) {
                z = true;
            }
        }
        if (z) {
            if (this.f6610n == -1) {
                this.f6610n = i;
            }
            if (this.f6615s <= 0 || i >= this.f6610n + this.f6615s) {
                return true;
            }
            return false;
        }
        this.f6610n = -1;
        return false;
    }
}
