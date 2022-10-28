package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ad.class */
public class C0639ad {

    /* renamed from: a */
    public String f4149a;

    /* renamed from: b */
    public boolean f4150b = false;

    /* renamed from: c */
    public ArrayList f4151c = new ArrayList();

    /* renamed from: d */
    public ArrayList f4152d = new ArrayList();

    /* renamed from: a */
    public boolean m2690a() {
        Iterator it = this.f4151c.iterator();
        while (it.hasNext()) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) it.next();
            if (abstractC0641af.f4153a == -1 && abstractC0641af.mo2675a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m2684b() {
        Iterator it = this.f4151c.iterator();
        while (it.hasNext()) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) it.next();
            if (abstractC0641af != null && abstractC0641af.f4153a == -1 && abstractC0641af.mo2673b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String m2681c() {
        Iterator it = this.f4151c.iterator();
        while (it.hasNext()) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) it.next();
            if (abstractC0641af != null) {
                return abstractC0641af.mo2672c().toUpperCase();
            }
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: a */
    public AbstractC0641af m2689a(int i) {
        if (this.f4151c.size() > i) {
            return (AbstractC0641af) this.f4151c.get(i);
        }
        return null;
    }

    /* renamed from: b */
    public String m2683b(int i) {
        if (this.f4151c.size() > i) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) this.f4151c.get(i);
            if (abstractC0641af == null) {
                return "<null>";
            }
            return abstractC0641af.mo2672c().toUpperCase();
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: c */
    public C0639ad m2680c(int i) {
        return m2688a(i, 0, 0, false);
    }

    /* renamed from: a */
    public C0639ad m2688a(int i, int i2, int i3, boolean z) {
        C0642ag c0642ag = new C0642ag();
        c0642ag.f4157e = i;
        c0642ag.f4153a = -1;
        c0642ag.f4154b = i3;
        if (z) {
            c0642ag.f4156d = true;
        }
        if (this.f4151c.size() <= i2) {
            this.f4151c.add(new C0646ak());
        }
        if (this.f4151c.size() <= i2) {
            this.f4151c.add(new C0646ak());
        }
        this.f4151c.set(i2, c0642ag);
        return this;
    }

    /* renamed from: a */
    public C0639ad m2686a(String str) {
        return m2685a(str, -1);
    }

    /* renamed from: a */
    public C0639ad m2685a(String str, int i) {
        if (str == null) {
            throw new RuntimeException("key==null");
        }
        return m2687a(-1, str, i);
    }

    /* renamed from: a */
    public C0639ad m2687a(int i, String str, int i2) {
        if (str == null) {
            throw new RuntimeException("key==null");
        }
        C0642ag c0642ag = new C0642ag();
        c0642ag.f4153a = i;
        c0642ag.f4154b = 0;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.contains("alt+")) {
            lowerCase = lowerCase.replace("alt+", VariableScope.nullOrMissingString);
            c0642ag.f4154b += 4;
        }
        if (lowerCase.contains("ctrl+")) {
            lowerCase = lowerCase.replace("ctrl+", VariableScope.nullOrMissingString);
            c0642ag.f4154b++;
        }
        if (lowerCase.contains("shift+")) {
            lowerCase = lowerCase.replace("shift+", VariableScope.nullOrMissingString);
            c0642ag.f4154b += 2;
        }
        try {
            c0642ag.f4157e = C0638ac.m2691d(lowerCase);
            if (i2 == -1) {
                this.f4151c.add(c0642ag);
            } else {
                if (this.f4151c.size() <= i2) {
                    this.f4151c.add(new C0646ak());
                }
                if (this.f4151c.size() <= i2) {
                    this.f4151c.add(new C0646ak());
                }
                this.f4151c.set(i2, c0642ag);
            }
        } catch (SlickToAndroidKeycodes.MissingKey e) {
            e.printStackTrace();
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            if (m1079A != null) {
                m1079A.m1037a(e.getMessage(), 1);
            }
        }
        return this;
    }

    /* renamed from: b */
    public C0639ad m2682b(int i, int i2, int i3, boolean z) {
        C0643ah c0643ah = new C0643ah();
        c0643ah.f4153a = i;
        c0643ah.f4160e = i2;
        c0643ah.f4161f = i3;
        c0643ah.f4158g = z;
        try {
            c0643ah.f4159i = c0643ah.m2677a(true);
            this.f4151c.add(c0643ah);
            return this;
        } catch (IndexOutOfBoundsException e) {
            LoggerMaybe.m990b("Failed to bind Axis:" + i3 + " on joystick:" + i2);
            return this;
        }
    }

    /* renamed from: d */
    public boolean mo2678d() {
        return false;
    }

    /* renamed from: e */
    public String m2679e() {
        return this.f4149a.replace("-", VariableScope.nullOrMissingString).replace("  ", " ").replace("  ", " ").replace(" ", "_").toLowerCase(Locale.ENGLISH);
    }
}
