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
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p045m.p046a.C1032b;
import com.corrodinggames.rts.gameFramework.p045m.p046a.C1033c;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/c.class */
public class C1035c {
    /* renamed from: a */
    public static C1030a m790a(C1049f c1049f, C0172a c0172a) {
        try {
            Core m1087A = Core.m1087A();
            String str = c0172a.f767b;
            if (str == null) {
                str = "NULL";
            }
            String m5349b = c0172a.m5349b("id");
            if (m5349b != null && !m5349b.equals(VariableScope.nullOrMissingString)) {
                str = m5349b;
            }
            String trim = str.trim();
            String str2 = c0172a.f769d;
            if (str2 != null) {
                EnumC1037e m788a = EnumC1037e.m788a(str2);
                if (m788a == null) {
                    C1049f.m768c("Error: Unknown type:" + str2 + " found on " + trim);
                    return null;
                }
                C1030a c1030a = new C1030a();
                c1030a.f6616t = c0172a;
                c1030a.f6603g = m788a;
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
                Integer m804d = c1030a.m804d("team");
                if (m804d != null) {
                    c1030a.f6621y = AbstractC0197n.m5017k(m804d.intValue());
                    if (c1030a.f6621y == null) {
                        c1030a.m801g("Cannot find team:" + m804d);
                        return null;
                    }
                }
                c1030a.f6614r = c1030a.m809b("delay", c1030a.f6614r);
                c1030a.f6612p = c1030a.m809b("repeatDelay", c1030a.f6612p);
                c1030a.f6611o = c1030a.m818a("repeatCount", c1030a.f6611o);
                c1030a.f6613q = c1030a.m809b("resetActivationAfter", c1030a.f6613q);
                c1030a.f6604h = c1030a.m813a("allToActivate", false);
                c1030a.f6600d.f6645b = c1030a.f6604h;
                c1030a.f6615s = c1030a.m809b("warmup", c1030a.f6615s);
                c1030a.f6623A = c1030a.m817a("globalMessage", (C0385az) null);
                c1030a.f6619w = c1030a.m819a("textOffsetX", 0.0f);
                c1030a.f6620x = c1030a.m819a("textOffsetY", 0.0f);
                if (c1030a.f6603g == EnumC1037e.f6652g || c1030a.f6603g == EnumC1037e.f6646a) {
                    c1030a.f6622z = c1030a.m817a("text", (C0385az) null);
                }
                if (c1030a.f6603g == EnumC1037e.f6652g) {
                    c1049f.f6666i = true;
                    c1030a.f6624B = new Paint();
                    c1030a.f6624B.mo5914a(true);
                    c1030a.f6624B.m5929a(Paint.Align.f196b);
                    c1030a.f6624B.mo5924a(Typeface.m5840a(Typeface.f246c, 1));
                    c1030a.f6624B.m5908b(c1030a.m806c("textColor", -1));
                    m1087A.m1050a(c1030a.f6624B, c1030a.m818a("textSize", 20));
                    if (c1030a.f6624B.m5894f() == 0) {
                        c1030a.m801g("Text has an alpha of 0");
                    }
                    String m810b = c1030a.m810b("style");
                    if (m810b != null && !m810b.equals(VariableScope.nullOrMissingString)) {
                        if (m810b.equalsIgnoreCase("arrow")) {
                            c1030a.f6625C = true;
                        } else {
                            c1030a.m801g("Unknown style: " + m810b);
                        }
                    }
                }
                if (c1030a.f6603g == EnumC1037e.f6650e) {
                    try {
                        c1030a.f6618v = C0413bn.m4147a(c1030a.m810b("spawnUnits"), "<unitAdd>", "spawnUnits");
                        if (c1030a.m823a() == null) {
                            c1030a.m801g("No team set");
                        }
                    } catch (C0412bm e) {
                        C1049f.m768c(e.getMessage());
                        return null;
                    }
                }
                if (c1030a.f6603g == EnumC1037e.f6649d) {
                    c1030a.m820a("addTeamTags");
                    c1030a.m820a("removeTeamTags");
                }
                if (c1030a.f6603g == EnumC1037e.f6648c) {
                    c1030a.m820a("add");
                    c1030a.m820a("set");
                }
                if (c1030a.f6603g == EnumC1037e.f6654i) {
                    c1030a.m821a(C1033c.m795d(c1030a));
                }
                if (c1030a.f6603g == EnumC1037e.f6655j) {
                    c1030a.m821a(C1032b.m797d(c1030a));
                }
                c1030a.m820a("comment");
                c1030a.m820a("team");
                c1030a.m820a("globalMessage");
                c1030a.m820a("globalMessage_delayPerChar");
                c1030a.m820a("globalMessage_textColor");
                c1030a.m820a("debugMessage");
                c1030a.m820a("showOnMap");
                c1030a.m820a("text");
                c1030a.m820a("target");
                c1030a.m820a("onlyIfEmpty");
                if (c1030a.f6603g == EnumC1037e.f6647b) {
                    c1030a.m820a("unload");
                }
                if (c1030a.f6603g == EnumC1037e.f6651f) {
                    c1030a.m820a("onlyIfEmpty");
                }
                return c1030a;
            }
            C1049f.m768c("Error: no type field set for: " + trim);
            return null;
        } catch (RuntimeException e2) {
            throw new C0179f("Error while reading: " + c0172a.m5350b(), e2);
        }
    }
}
