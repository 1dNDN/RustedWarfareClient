package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.C0462t;
import com.corrodinggames.rts.game.units.custom.C0463u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/b.class */
public class C0323b extends AbstractC0321a {

    /* renamed from: a */
    public boolean f1917a;

    /* renamed from: b */
    public boolean f1918b;

    /* renamed from: c */
    public EnumC0306av f1919c;

    /* renamed from: d */
    public C0463u f1920d;

    /* renamed from: e */
    public boolean f1921e;

    /* renamed from: f */
    public C0449h f1922f;

    /* renamed from: g */
    public EnumC0200q f1923g;

    /* renamed from: h */
    public float f1924h;

    /* renamed from: i */
    public boolean f1925i;

    /* renamed from: j */
    public C0449h f1926j;

    /* renamed from: k */
    public EnumC0200q f1927k;

    /* renamed from: l */
    public float f1928l;

    /* renamed from: m */
    public boolean f1929m;

    /* renamed from: n */
    public boolean f1930n;

    /* renamed from: o */
    public PointF f1931o;

    /* renamed from: p */
    public PointF f1932p;

    /* renamed from: q */
    public PointF f1933q;

    /* renamed from: r */
    public LogicBoolean f1934r;

    /* renamed from: s */
    public float f1935s = -1.0f;

    /* renamed from: t */
    public C0462t f1936t;

    /* renamed from: u */
    public C0462t f1937u;

    /* renamed from: v */
    public static C0305au f1938v = new C0305au();

    /* renamed from: w */
    public static final C0324c f1939w = new C0324c();

    /* renamed from: a */
    public static void m3984a(C0453l c0453l, C1072ab c1072ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean z2 = false;
        boolean booleanValue = c1072ab.m663a(str, str2 + "clearAllWaypoints", (Boolean) false).booleanValue();
        if (booleanValue) {
            z2 = true;
        }
        boolean booleanValue2 = c1072ab.m663a(str, str2 + "clearActiveWaypoint", (Boolean) false).booleanValue();
        if (booleanValue2) {
            z2 = true;
        }
        EnumC0306av enumC0306av = (EnumC0306av) c1072ab.m662a(str, "addWaypoint_type", (Enum) null, EnumC0306av.class);
        boolean booleanValue3 = c1072ab.m663a(str, str2 + "addWaypoint_prepend", (Boolean) false).booleanValue();
        C0449h m683a = c1072ab.m683a(c0453l, str, str2 + "addWaypoint_target_nearestUnit_tagged", (C0449h) null);
        EnumC0200q enumC0200q = (EnumC0200q) c1072ab.m662a(str, "addWaypoint_target_nearestUnit_team", EnumC0200q.own, EnumC0200q.class);
        float floatValue = c1072ab.m661a(str, str2 + "addWaypoint_target_nearestUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        C0449h m683a2 = c1072ab.m683a(c0453l, str, str2 + "addWaypoint_target_randomUnit_tagged", (C0449h) null);
        EnumC0200q enumC0200q2 = (EnumC0200q) c1072ab.m662a(str, "addWaypoint_target_randomUnit_team", EnumC0200q.own, EnumC0200q.class);
        float floatValue2 = c1072ab.m661a(str, str2 + "addWaypoint_target_randomUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        float floatValue3 = c1072ab.m646b(str, str2 + "addWaypoint_maxTime", Float.valueOf(-1.0f)).floatValue();
        C0462t m680a = c1072ab.m680a(c0453l, str, str2 + "addWaypoint_triggerActionIfFailed", (C0462t) null);
        C0462t m680a2 = c1072ab.m680a(c0453l, str, str2 + "addWaypoint_triggerActionIfMatched", (C0462t) null);
        PointF m667a = c1072ab.m667a(str, str2 + "addWaypoint_position_offsetFromSelf", (PointF) null);
        PointF m667a2 = c1072ab.m667a(str, str2 + "addWaypoint_position_relativeOffsetFromSelf", (PointF) null);
        PointF m667a3 = c1072ab.m667a(str, str2 + "addWaypoint_position_randomOffsetFromSelf", (PointF) null);
        boolean z3 = (m667a == null && m667a2 == null && m667a3 == null) ? false : true;
        boolean z4 = m683a != null;
        boolean z5 = m683a2 != null;
        boolean booleanValue4 = c1072ab.m663a(str, str2 + "addWaypoint_position_fromAction", (Boolean) false).booleanValue();
        LogicBoolean m649b = c1072ab.m649b(c0453l, str, str2 + "addWaypoint_target_fromReference", null);
        if (m649b != null) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit/randomUnit and addWaypoint_target_fromReference cannot be used together");
            }
            if (z3) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_offset* and addWaypoint_target_fromReference cannot be used together");
            }
            if (booleanValue4) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_fromAction and addWaypoint_target_fromReference cannot be used together");
            }
        }
        if (booleanValue4) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_* and addWaypoint_position_fromAction cannot be used together");
            }
            if (z3) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_offset* and addWaypoint_position_fromAction cannot be used together");
            }
        }
        if ((z4 || z5 || z3 || m649b != null) && enumC0306av == null) {
            throw new RuntimeException("[" + str + "] addWaypoint_type is required when using addWaypoint_*");
        }
        if (enumC0306av != null) {
            z2 = true;
            if (!z4 && !z5 && !z3 && !booleanValue4 && m649b == null) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_tagged, addWaypoint_position_offsetFromSelf or addWaypoint_target_fromReference is required when using addWaypoint_*");
            }
        }
        if (z3) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_* and addWaypoint_position_* cannot be used together");
            }
            if (enumC0306av != EnumC0306av.move && enumC0306av != EnumC0306av.attackMove) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_* only supports position based waypoints (eg: move, attackMove)");
            }
        }
        if (z4 && z5) {
            throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_* and addWaypoint_target_randomUnit_* cannot be used together");
        }
        if (z2) {
            C0323b c0323b = new C0323b();
            c0323b.f1917a = booleanValue;
            c0323b.f1918b = booleanValue2;
            if (enumC0306av != null) {
                c0323b.f1919c = enumC0306av;
                if (c0323b.f1919c == EnumC0306av.build) {
                    c0323b.f1920d = c0453l.m3431a(c1072ab.m644b(str, str2 + "addWaypoint_unitType", (String) null), str2 + "addWaypoint_unitType", str);
                    if (c0323b.f1920d == null) {
                        throw new RuntimeException("[" + str + "] addWaypoint_type: build requires addWaypoint_unitType");
                    }
                }
                c0323b.f1921e = booleanValue3;
                c0323b.f1922f = m683a;
                c0323b.f1923g = enumC0200q;
                c0323b.f1924h = floatValue;
                c0323b.f1926j = m683a2;
                c0323b.f1927k = enumC0200q2;
                c0323b.f1928l = floatValue2;
                if (z5) {
                    c0323b.f1925i = true;
                }
                c0323b.f1929m = c1072ab.m663a(str, str2 + "addWaypoint_target_mapMustBeReachable", (Boolean) true).booleanValue();
                c0323b.f1931o = m667a;
                c0323b.f1932p = m667a2;
                c0323b.f1933q = m667a3;
                c0323b.f1930n = booleanValue4;
                c0323b.f1934r = m649b;
                c0323b.f1935s = floatValue3;
                c0323b.f1936t = m680a;
                c0323b.f1937u = m680a2;
            }
            c0339d.f2101ab.add(c0323b);
        }
    }

    /* renamed from: a */
    public C0305au m3985a(C0451j c0451j, float f, float f2, AbstractC0244am abstractC0244am, int i) {
        C0305au ap;
        if (this.f1935s == 0.0f) {
            ap = f1938v;
            ap.m4021e();
        } else if (this.f1921e) {
            ap = c0451j.m2837ao();
            c0451j.m2875aD();
            c0451j.m2877aB();
        } else {
            ap = c0451j.m2836ap();
        }
        if (this.f1919c == EnumC0306av.move) {
            ap.m4037a(f, f2);
        } else if (this.f1919c == EnumC0306av.attackMove) {
            ap.m4030b(f, f2);
        } else if (this.f1919c == EnumC0306av.guard && abstractC0244am != null) {
            ap.m4025c(abstractC0244am);
        } else if (this.f1919c == EnumC0306av.follow && abstractC0244am != null) {
            ap.m4020e(abstractC0244am);
        } else if (this.f1919c == EnumC0306av.loadInto && abstractC0244am != null) {
            ap.m4016g(abstractC0244am);
        } else if (this.f1919c == EnumC0306av.loadUp && abstractC0244am != null) {
            ap.m4014h(abstractC0244am);
        } else if (this.f1919c == EnumC0306av.attack && abstractC0244am != null) {
            ap.m4035a(abstractC0244am);
        } else if (this.f1919c == EnumC0306av.reclaim && abstractC0244am != null) {
            ap.m4018f(abstractC0244am);
        } else if (this.f1919c == EnumC0306av.repair && abstractC0244am != null) {
            ap.m4029b(abstractC0244am);
        } else if (this.f1919c == EnumC0306av.touchTarget && abstractC0244am != null) {
            ap.m4022d(abstractC0244am);
        } else if (this.f1919c == EnumC0306av.build) {
            ap.m4036a(f, f2, this.f1920d.mo3362c(), 1);
        } else {
            c0451j.m2827ay();
        }
        ap.f1808l = this.f1935s;
        ap.f1810n = true;
        if (this.f1937u != null) {
            this.f1937u.m3366a(c0451j, new PointF(ap.m4017g(), ap.m4015h()), ap.m4013i(), i + 1);
        }
        return ap;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo3972a(C0451j c0451j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f1917a) {
            c0451j.m2826az();
        } else if (this.f1918b) {
            c0451j.m2827ay();
        }
        if (this.f1919c != null) {
            if (this.f1934r != null) {
                AbstractC0244am readUnit = this.f1934r.readUnit(c0451j);
                if (readUnit != null) {
                    m3985a(c0451j, readUnit.f6958el, readUnit.f6959em, readUnit, i);
                    return true;
                } else if (this.f1936t != null) {
                    this.f1936t.m3366a(c0451j, pointF, abstractC0244am, i + 1);
                    return true;
                } else {
                    return true;
                }
            } else if (this.f1930n) {
                if (pointF == null) {
                    if (this.f1936t != null) {
                        this.f1936t.m3366a(c0451j, pointF, abstractC0244am, i + 1);
                        return true;
                    }
                    return true;
                }
                m3985a(c0451j, pointF.f227a, pointF.f228b, (AbstractC0244am) null, i);
                return true;
            } else if (this.f1931o != null || this.f1932p != null || this.f1933q != null) {
                float f = c0451j.f6958el;
                float f2 = c0451j.f6959em;
                if (this.f1931o != null) {
                    f += this.f1931o.f227a;
                    f2 += this.f1931o.f228b;
                }
                if (this.f1932p != null) {
                    float f3 = this.f1932p.f227a;
                    float f4 = this.f1932p.f228b;
                    float m2030i = C0758f.m2030i(c0451j.f1618ce);
                    float m2035h = C0758f.m2035h(c0451j.f1618ce);
                    f += (m2030i * f4) - (m2035h * f3);
                    f2 += (m2035h * f4) + (m2030i * f3);
                }
                if (this.f1933q != null) {
                    f += C0758f.m2126a((AbstractC1120w) c0451j, -((int) this.f1933q.f227a), (int) this.f1933q.f227a, i + 1);
                    f2 += C0758f.m2126a((AbstractC1120w) c0451j, -((int) this.f1933q.f228b), (int) this.f1933q.f228b, i + 2);
                }
                m3985a(c0451j, f, f2, (AbstractC0244am) null, i);
                return true;
            } else if (this.f1925i) {
                f1939w.f1942c = this.f1928l * this.f1928l;
                f1939w.f1941b = this.f1926j;
                f1939w.f1943d = false;
                f1939w.f1947h = null;
                f1939w.f1944e = this.f1927k;
                f1939w.f1940a = this.f1929m;
                f1939w.f1945f = true;
                f1939w.f1946g.clear();
                AbstractC0916l.m1071A().f6175cc.m3099a(c0451j.f6958el, c0451j.f6959em, this.f1928l, c0451j, 0.0f, f1939w);
                if (f1939w.f1946g.size() == 0) {
                    if (this.f1936t != null) {
                        this.f1936t.m3366a(c0451j, pointF, abstractC0244am, i + 1);
                        return true;
                    }
                    return true;
                }
                C1101m c1101m = f1939w.f1946g;
                int m2126a = C0758f.m2126a((AbstractC1120w) c0451j, 0, c1101m.size(), 0);
                c0451j.f1588bB++;
                if (m2126a > c1101m.size() - 1) {
                    m2126a = c1101m.size() - 1;
                }
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) c1101m.get(m2126a);
                m3985a(c0451j, abstractC0244am2.f6958el, abstractC0244am2.f6959em, abstractC0244am2, i);
                return true;
            } else {
                f1939w.f1942c = this.f1924h * this.f1924h;
                f1939w.f1941b = this.f1922f;
                f1939w.f1943d = false;
                f1939w.f1947h = null;
                f1939w.f1944e = this.f1923g;
                f1939w.f1940a = this.f1929m;
                f1939w.f1945f = false;
                AbstractC0916l.m1071A().f6175cc.m3099a(c0451j.f6958el, c0451j.f6959em, this.f1924h, c0451j, 0.0f, f1939w);
                if (f1939w.f1947h == null) {
                    if (this.f1936t != null) {
                        this.f1936t.m3366a(c0451j, pointF, abstractC0244am, i + 1);
                        return true;
                    }
                    return true;
                }
                AbstractC0244am abstractC0244am3 = f1939w.f1947h;
                m3985a(c0451j, abstractC0244am3.f6958el, abstractC0244am3.f6959em, abstractC0244am3, i);
                return true;
            }
        }
        return true;
    }
}
