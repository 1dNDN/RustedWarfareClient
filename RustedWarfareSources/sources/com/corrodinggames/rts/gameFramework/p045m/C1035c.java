package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0172a;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p045m.p046a.C1032b;
import com.corrodinggames.rts.gameFramework.p045m.p046a.C1033c;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/c.class */
public class C1035c {
    /* renamed from: a */
    public static C1030a m782a(C1049f c1049f, C0172a c0172a) {
        try {
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            String str = c0172a.f767b;
            if (str == null) {
                str = "NULL";
            }
            String m4966b = c0172a.m4966b("id");
            if (m4966b != null && !m4966b.equals(VariableScope.nullOrMissingString)) {
                str = m4966b;
            }
            String trim = str.trim();
            String str2 = c0172a.f769d;
            if (str2 != null) {
                EnumC1037e m780a = EnumC1037e.m780a(str2);
                if (m780a == null) {
                    C1049f.m760c("Error: Unknown type:" + str2 + " found on " + trim);
                    return null;
                }
                C1030a c1030a = new C1030a();
                c1030a.f6616t = c0172a;
                c1030a.f6603g = m780a;
                c1030a.f6598b = trim;
                int i = 0;
                Iterator it = c1049f.f6693J.iterator();
                while (it.hasNext()) {
                    if (((C1030a) it.next()).f6598b.equalsIgnoreCase(c1030a.f6598b)) {
                        i++;
                    }
                }
                c1030a.f6599c = c1030a.f6598b;
                if (i != 0) {
                    c1030a.f6599c += "_" + i;
                }
                c1030a.f6597a = c0172a.f767b;
                Integer m796d = c1030a.m796d("team");
                if (m796d != null) {
                    c1030a.f6621y = AbstractC0197n.m4638k(m796d.intValue());
                    if (c1030a.f6621y == null) {
                        c1030a.m793g("Cannot find team:" + m796d);
                        return null;
                    }
                }
                c1030a.f6614r = c1030a.m801b("delay", c1030a.f6614r);
                c1030a.f6612p = c1030a.m801b("repeatDelay", c1030a.f6612p);
                c1030a.f6611o = c1030a.m810a("repeatCount", c1030a.f6611o);
                c1030a.f6613q = c1030a.m801b("resetActivationAfter", c1030a.f6613q);
                c1030a.f6604h = c1030a.m805a("allToActivate", false);
                c1030a.f6600d.f6645b = c1030a.f6604h;
                c1030a.f6615s = c1030a.m801b("warmup", c1030a.f6615s);
                c1030a.f6623A = c1030a.m809a("globalMessage", (C0385az) null);
                c1030a.f6619w = c1030a.m811a("textOffsetX", 0.0f);
                c1030a.f6620x = c1030a.m811a("textOffsetY", 0.0f);
                if (c1030a.f6603g == EnumC1037e.f6652g || c1030a.f6603g == EnumC1037e.f6646a) {
                    c1030a.f6622z = c1030a.m809a("text", (C0385az) null);
                }
                if (c1030a.f6603g == EnumC1037e.f6652g) {
                    c1049f.f6666i = true;
                    c1030a.f6624B = new Paint();
                    c1030a.f6624B.mo900a(true);
                    c1030a.f6624B.m5519a(Paint.Align.f196b);
                    c1030a.f6624B.mo902a(Typeface.m5433a(Typeface.f246c, 1));
                    c1030a.f6624B.m5501b(c1030a.m798c("textColor", -1));
                    m1079A.m1042a(c1030a.f6624B, c1030a.m810a("textSize", 20));
                    if (c1030a.f6624B.m5487f() == 0) {
                        c1030a.m793g("Text has an alpha of 0");
                    }
                    String m802b = c1030a.m802b("style");
                    if (m802b != null && !m802b.equals(VariableScope.nullOrMissingString)) {
                        if (m802b.equalsIgnoreCase("arrow")) {
                            c1030a.f6625C = true;
                        } else {
                            c1030a.m793g("Unknown style: " + m802b);
                        }
                    }
                }
                if (c1030a.f6603g == EnumC1037e.f6650e) {
                    try {
                        c1030a.f6618v = C0413bn.m3923a(c1030a.m802b("spawnUnits"), "<unitAdd>", "spawnUnits");
                        if (c1030a.m815a() == null) {
                            c1030a.m793g("No team set");
                        }
                    } catch (C0412bm e) {
                        C1049f.m760c(e.getMessage());
                        return null;
                    }
                }
                if (c1030a.f6603g == EnumC1037e.f6649d) {
                    c1030a.m812a("addTeamTags");
                    c1030a.m812a("removeTeamTags");
                }
                if (c1030a.f6603g == EnumC1037e.f6648c) {
                    c1030a.m812a("add");
                    c1030a.m812a("set");
                }
                if (c1030a.f6603g == EnumC1037e.f6654i) {
                    c1030a.m813a(C1033c.m787d(c1030a));
                }
                if (c1030a.f6603g == EnumC1037e.f6655j) {
                    c1030a.m813a(C1032b.m789d(c1030a));
                }
                c1030a.m812a("comment");
                c1030a.m812a("team");
                c1030a.m812a("globalMessage");
                c1030a.m812a("globalMessage_delayPerChar");
                c1030a.m812a("globalMessage_textColor");
                c1030a.m812a("debugMessage");
                c1030a.m812a("showOnMap");
                c1030a.m812a("text");
                c1030a.m812a("target");
                c1030a.m812a("onlyIfEmpty");
                if (c1030a.f6603g == EnumC1037e.f6647b) {
                    c1030a.m812a("unload");
                }
                if (c1030a.f6603g == EnumC1037e.f6651f) {
                    c1030a.m812a("onlyIfEmpty");
                }
                return c1030a;
            }
            C1049f.m760c("Error: no type field set for: " + trim);
            return null;
        } catch (RuntimeException e2) {
            throw new C0179f("Error while reading: " + c0172a.m4967b(), e2);
        }
    }
}
