package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.p029h.C0586d;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Properties;

/* renamed from: com.corrodinggames.rts.game.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/g.class */
public final class C0180g {

    /* renamed from: a */
    public C0183j f914a;

    /* renamed from: b */
    public int f915b;

    /* renamed from: c */
    public int f916c = -2;

    /* renamed from: d */
    public short f917d = -1;

    /* renamed from: e */
    public boolean f918e;

    /* renamed from: f */
    public boolean f919f;

    /* renamed from: g */
    public boolean f920g;

    /* renamed from: h */
    public boolean f921h;

    /* renamed from: i */
    public boolean f922i;

    /* renamed from: j */
    public byte f923j;

    /* renamed from: k */
    public boolean f924k;

    /* renamed from: l */
    public boolean f925l;

    /* renamed from: m */
    public C0180g[] f926m;

    /* renamed from: n */
    static final Rect f927n = new Rect();

    /* renamed from: a */
    public static boolean m4859a(C0180g c0180g, C0180g c0180g2) {
        if (c0180g == c0180g2) {
            return true;
        }
        return c0180g != null && c0180g2 != null && c0180g.f914a == c0180g2.f914a && c0180g.f915b == c0180g2.f915b;
    }

    /* renamed from: a */
    public C0180g clone() {
        C0180g c0180g = new C0180g();
        c0180g.f914a = this.f914a;
        c0180g.f915b = this.f915b;
        c0180g.f918e = this.f918e;
        c0180g.f919f = this.f919f;
        c0180g.f920g = this.f920g;
        c0180g.f921h = this.f921h;
        c0180g.f922i = this.f922i;
        c0180g.f923j = this.f923j;
        c0180g.f924k = this.f924k;
        c0180g.f925l = this.f925l;
        return c0180g;
    }

    /* renamed from: a */
    public static void m4857a(String str) {
        LoggerMaybe.m990b(str);
        LoggerMaybe.m1079A().m1037a("Missing unit data while loading map: " + str, 1);
        try {
            Thread.sleep(2L);
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public static C0180g m4860a(C0173b c0173b, C0178e c0178e, C0183j c0183j, int i, short s, short s2, boolean z) {
        String str;
        AbstractC0197n m4638k;
        Properties m4842a = c0183j.m4842a(c0183j.f959l + i);
        if (m4842a != null) {
            String property = m4842a.getProperty("showFog");
            if (property != null) {
                int parseInt = Integer.parseInt(property);
                LoggerMaybe m1079A = LoggerMaybe.m1079A();
                c0173b.m4957a((int) s, (int) s2);
                m1079A.f6110bL.m4960a(c0173b.f801T + c0173b.f787p, c0173b.f802U + c0173b.f788q, parseInt, m1079A.f6099bs, false);
                return null;
            }
            String property2 = m4842a.getProperty("unit");
            String property3 = m4842a.getProperty("customUnit");
            if (property2 != null || property3 != null) {
                String property4 = m4842a.getProperty("team");
                if ("none".equalsIgnoreCase(property4)) {
                    m4638k = AbstractC0197n.m4638k(-1);
                } else if (property4 == null) {
                    LoggerMaybe.m989b("map", "warning: unit has no team property:" + property2 + " at: " + ((int) s) + "," + ((int) s2));
                    return null;
                } else {
                    m4638k = AbstractC0197n.m4638k(Integer.valueOf(property4).intValue());
                    if (m4638k == null) {
                        LoggerMaybe.m989b("map", "skipping unit without player:" + property2 + " at: " + ((int) s) + "," + ((int) s2) + " team:" + property4);
                        return null;
                    } else if (m4638k.m4695b()) {
                        LoggerMaybe.m989b("map", "Unit team is marked as spectator:" + property2 + " (skipping unit)");
                        return null;
                    }
                }
                C0451j c0451j = null;
                if (property3 != null) {
                    C0453l m3497n = C0453l.m3497n(property3);
                    if (m3497n == null) {
                        String str2 = "Could not find custom unit of:" + property3 + " at x:" + ((int) s) + ", y:" + ((int) s2);
                        m4857a(str2);
                        throw new C0179f(str2);
                    }
                    InterfaceC0303as m3522c = C0453l.m3522c(m3497n);
                    if (m3522c != null) {
                        if (m3522c instanceof C0453l) {
                            m3497n = (C0453l) m3522c;
                        } else {
                            LoggerMaybe.m990b("replacement not a custom unit:" + m3522c.mo4223i());
                        }
                    }
                    c0451j = C0453l.m3531a(false, m3497n);
                    if (c0451j == null) {
                        String str3 = "Metadata unit is null for:" + property3;
                        m4857a(str3);
                        throw new C0179f(str3);
                    }
                } else {
                    InterfaceC0303as m4372a = AbstractC0249ar.m4372a(property2);
                    if (m4372a != null) {
                        c0451j = m4372a.mo4234a();
                    }
                    if (c0451j == null && "scoutShip".equalsIgnoreCase(property2)) {
                        c0451j = new C0586d(false);
                    }
                    if (c0451j == null) {
                        String str4 = "Could not find unit:" + property2 + " at: " + ((int) s) + "," + ((int) s2);
                        m4857a(str4);
                        throw new C0179f(str4);
                    }
                }
                c0173b.m4957a((int) s, (int) s2);
                c0451j.f6957el = c0173b.f801T + c0451j.mo3299cX();
                c0451j.f6958em = c0173b.f802U + c0451j.mo3298cY();
                if (m4638k != null) {
                    c0451j.m4492b(m4638k);
                    if (m4842a.getProperty("type") != null) {
                        c0451j.m4495a_(m4842a.getProperty("type"));
                    }
                    if (m4842a.getProperty("randomRotate") != null) {
                        c0451j.f1618ce = C0758f.m2140a(c0451j, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
                    }
                    c0451j.f1601bN = "builder".equalsIgnoreCase(property2) || "builder".equalsIgnoreCase(property3);
                    c0451j.f1602bO = "commandCenter".equalsIgnoreCase(property2) || "commandCenter".equalsIgnoreCase(property3);
                    c0451j.f1599bL = true;
                    c0451j.mo3260n();
                    AbstractC0197n.m4674c(c0451j);
                    AbstractC1120w.m439dJ();
                    return null;
                }
                throw new C0179f("team has not been set for:" + property2);
            } else if (c0178e != null && c0178e.f902l.equals("units")) {
                Log.m5365d("RustedWarfare", "non unit on units layer at:" + ((int) s) + "," + ((int) s2));
                return null;
            }
        }
        C0180g c0180g = new C0180g();
        c0180g.f914a = c0183j;
        c0183j.f967p = true;
        if (c0178e != null && !c0178e.f908r) {
            c0183j.f969r = true;
        }
        if (z) {
            c0183j.f968q = true;
        }
        c0180g.f915b = i;
        if (m4842a != null) {
            if (m4842a.getProperty("water") != null) {
                c0180g.f918e = true;
            }
            if (m4842a.getProperty("water-bridge") != null) {
                c0180g.f919f = true;
            }
            if (m4842a.getProperty("lava") != null || m4842a.getProperty("lava-cliff") != null) {
                c0180g.f920g = true;
                if (m4842a.getProperty("lava-cliff") != null) {
                    c0180g.f921h = true;
                }
            }
            if (m4842a.getProperty("cliff-soft") != null) {
                c0180g.f921h = true;
            }
            if (m4842a.getProperty("cliff") != null) {
                c0180g.f921h = true;
            }
            if (m4842a.getProperty("large-cliff") != null) {
                c0180g.f924k = true;
            }
            if (m4842a.getProperty("trees") != null) {
                c0180g.f924k = true;
            }
            if (m4842a.getProperty("res_pool") != null) {
                c0180g.f922i = true;
            }
            if (m4842a.getProperty("tree") != null) {
            }
            if (m4842a.getProperty("small-rock") != null) {
                c0180g.f923j = (byte) 40;
            }
            if (m4842a.getProperty("large-rock") != null) {
                c0180g.f923j = (byte) -1;
            }
            if (m4842a.getProperty("block-land") != null) {
                c0180g.f923j = (byte) -1;
            }
            if (m4842a.getProperty("block-buildings") != null) {
                c0180g.f925l = true;
            }
        }
        int i2 = 0;
        int i3 = 0;
        if (c0180g.f914a != null && (str = c0180g.f914a.f952c) != null) {
            if (c0180g.f915b == 0 && str.equals("shallowwater.png")) {
                i2 = 5;
            }
            if (c0180g.f915b == 0 && str.equals("deepwater.png")) {
                i2 = 2;
            }
            if (c0180g.f915b == 0 && str.equals("water.png")) {
                i2 = 2;
            }
            if (c0180g.f915b == 0 && str.equals("longgrass.png")) {
                i2 = 3;
            }
            if (c0180g.f915b == 0 && str.equals("mountain.png")) {
                i2 = 3;
            }
            if (c0180g.f915b == 7 && str.equals("stone.png")) {
                i2 = 4;
                i3 = 23;
            }
            if (c0180g.f915b != 0 || str.equals("lava.png")) {
            }
            if (c0180g.f915b == 0 && str.equals("snow.png")) {
                i2 = 2;
            }
        }
        if (m4842a != null && m4842a.getProperty("randomTileBy") != null) {
            try {
                i2 = Integer.parseInt(m4842a.getProperty("randomTileBy"));
                if (m4842a.getProperty("randomTileFixedOffset") != null) {
                    try {
                        i3 = Integer.parseInt(m4842a.getProperty("randomTileFixedOffset"));
                    } catch (NumberFormatException e) {
                        throw new C0179f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileFixedOffset: Unexpected integer value:'" + m4842a.getProperty("randomTileBy") + "'");
                    }
                }
            } catch (NumberFormatException e2) {
                throw new C0179f("(x:" + ((int) s) + "y:" + ((int) s2) + ") - randomTileBy: Unexpected integer value:'" + m4842a.getProperty("randomTileBy") + "'");
            }
        }
        if (i2 > 0) {
            C0180g[] c0180gArr = new C0180g[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                c0180gArr[i4] = c0180g.clone();
                c0180gArr[i4].f915b += i4 + 1 + i3;
            }
            c0180g.f926m = c0180gArr;
        }
        return c0180g;
    }

    C0180g() {
    }

    /* renamed from: a */
    public void m4858a(InterfaceC1027y interfaceC1027y, RectF rectF, float f, Paint paint) {
        C0183j c0183j = this.f914a;
        interfaceC1027y.mo197a(c0183j.f951b, c0183j.m4833b(this.f915b), rectF, paint);
    }
}
