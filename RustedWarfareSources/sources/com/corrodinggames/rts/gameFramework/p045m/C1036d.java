package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p037f.C0801j;
import com.corrodinggames.rts.gameFramework.p037f.EnumC0806n;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p045m.p046a.AbstractC1031a;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/d.class */
public class C1036d {
    /* renamed from: a */
    public static void m781a(C1049f c1049f, C1030a c1030a) {
        Integer m796d;
        Integer m796d2;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        boolean z = false;
        if (!c1030a.f6606j) {
            z = true;
        }
        c1049f.m773a(c1030a);
        c1030a.f6605i = true;
        c1030a.f6606j = true;
        c1030a.f6607k = m1079A.f6102by;
        boolean z2 = false;
        if (c1030a.f6623A != null) {
            C0801j m1752a = m1079A.f6117bS.f5115e.m1752a(null, c1030a.f6623A.m3994b());
            if (m1752a != null) {
                String m802b = c1030a.m802b("globalMessage_delayPerChar");
                if (m802b != null) {
                    if (m802b.equals("slow")) {
                        m1752a.f5278e = 18;
                    } else {
                        int m801b = c1030a.m801b("globalMessage_delayPerChar", -1);
                        if (m801b != -1) {
                            m1752a.f5278e = m801b;
                        }
                    }
                }
                int m798c = c1030a.m798c("globalMessage_textColor", -1);
                if (m798c != -1) {
                    m1752a.f5279f = m798c;
                }
            }
            z2 = true;
        }
        String m802b2 = c1030a.m802b("debugMessage");
        if (m802b2 != null) {
            c1030a.m792h("Debug: " + m802b2);
            if (m1079A.f6100bv && m1079A.f6231bl) {
                C0831ad.m1546a((String) null, "Debug: " + m802b2);
            }
            z2 = true;
        }
        if (c1030a.m805a("showOnMap", false)) {
            m1079A.f6121bW.m1742a(c1030a.m804b(), c1030a.m800c(), EnumC0806n.message);
            z2 = true;
        }
        if (c1030a.f6602f.f6894a > 0) {
            Iterator it = c1030a.f6602f.iterator();
            while (it.hasNext()) {
                if (((AbstractC1031a) it.next()).m790c(c1030a)) {
                    z2 = true;
                }
            }
        }
        if (c1030a.f6603g == EnumC1037e.f6646a) {
            if (z) {
                c1030a.m792h("objective met");
            }
            z2 = true;
        }
        if (c1030a.f6603g == EnumC1037e.f6656k) {
            z2 = true;
        }
        if (c1030a.f6603g == EnumC1037e.f6654i) {
            z2 = true;
        }
        if (c1030a.f6603g == EnumC1037e.f6655j) {
            z2 = true;
        }
        if (c1030a.f6603g == EnumC1037e.f6652g) {
            z2 = true;
        }
        if (c1030a.f6603g == EnumC1037e.f6653h) {
            z2 = true;
            m1079A.m995b(c1030a.m804b(), c1030a.m800c());
        }
        if (c1030a.f6603g == EnumC1037e.f6650e) {
            float m804b = c1030a.m804b();
            float m800c = c1030a.m800c();
            AbstractC0197n m815a = c1030a.m815a();
            if (m815a == null) {
                c1030a.m793g("No team set, cannot spawn");
            } else if (c1030a.f6618v != null) {
                c1030a.f6618v.m3928a(m804b, m800c, 0.0f, 0.0f, m815a, false, null, null, false);
            } else {
                c1030a.m793g("No valid unit list to spawn");
            }
            z2 = true;
        }
        if (c1030a.f6603g == EnumC1037e.f6648c) {
            AbstractC0197n m815a2 = c1030a.m815a();
            if (m815a2 == null) {
                c1030a.m793g("Team not set for changeCredits");
                return;
            }
            if (c1030a.m796d("set") != null) {
                m815a2.f1310o = m796d.intValue();
            }
            if (c1030a.m796d("add") != null) {
                m815a2.m4665d(m796d2.intValue());
            }
        } else if (c1030a.f6603g == EnumC1037e.f6649d) {
            AbstractC0197n m815a3 = c1030a.m815a();
            if (m815a3 == null) {
                c1030a.m793g("Team not set for event_teamTags");
                return;
            }
            String m807a = c1030a.m807a("addTeamTags", (String) null);
            if (m807a != null) {
                m815a3.m4687b(C0448g.m3733a(m807a));
            }
            String m807a2 = c1030a.m807a("removeTeamTags", (String) null);
            if (m807a2 != null) {
                m815a3.m4671c(C0448g.m3733a(m807a2));
            }
        } else if (c1030a.f6603g == EnumC1037e.f6647b) {
            String m802b3 = c1030a.m802b("target");
            if (m802b3 == null) {
                C1049f.m748i("Move trigger has no target id:" + c1030a.f6597a);
                return;
            }
            PointF m753f = c1049f.m753f(m802b3);
            if (m753f == null) {
                C1049f.m748i("Move trigger: Cannot find target for:" + c1030a.f6597a + " target:" + m802b3);
                return;
            }
            AbstractC0197n m815a4 = c1030a.m815a();
            if (m815a4 == null) {
                C1049f.m748i("Team not set map trigger:" + c1030a.f6597a);
                return;
            }
            int i = 0;
            C0749e m2369b = m1079A.f6130cf.m2369b(m815a4);
            Iterator it2 = AbstractC0244am.f1590bD.iterator();
            while (it2.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it2.next();
                if (abstractC0244am.f1609bV == m815a4 && (abstractC0244am instanceof AbstractC0623y) && c1030a.m814a(abstractC0244am) && c1030a.m803b(abstractC0244am)) {
                    m2369b.m2270a((AbstractC0623y) abstractC0244am);
                    i++;
                }
            }
            m2369b.m2280a(m753f.f227a, m753f.f228b);
            if (z) {
                c1049f.m764b("firstActivation: move at:" + m1079A.f6102by + " for teamId:" + m815a4.f1306k + " to targetId:" + m802b3 + " (#units:" + i + ")");
            }
            if (c1030a.m802b("unload") != null) {
                Iterator it3 = AbstractC0244am.f1590bD.iterator();
                while (it3.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it3.next();
                    if (abstractC0244am2.f1609bV == m815a4 && (abstractC0244am2 instanceof AbstractC0623y) && c1030a.m814a(abstractC0244am2) && c1030a.m803b(abstractC0244am2) && abstractC0244am2.mo3209cq()) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                        C0749e m2369b2 = m1079A.f6130cf.m2369b(m815a4);
                        m2369b2.f4842e = true;
                        m2369b2.m2270a(abstractC0623y);
                        m2369b2.m2275a(abstractC0623y.mo3210co());
                    }
                }
            }
        } else {
            if (c1030a.f6603g == EnumC1037e.f6651f) {
                C1101m c1101m = new C1101m();
                Iterator it4 = AbstractC0244am.f1590bD.iterator();
                while (it4.hasNext()) {
                    AbstractC0244am abstractC0244am3 = (AbstractC0244am) it4.next();
                    if ((abstractC0244am3 instanceof AbstractC0623y) && c1030a.m814a(abstractC0244am3) && c1030a.m803b(abstractC0244am3)) {
                        c1101m.add(abstractC0244am3);
                    }
                }
                if (c1101m.size() > 0) {
                    Iterator it5 = c1101m.iterator();
                    while (it5.hasNext()) {
                        AbstractC0244am abstractC0244am4 = (AbstractC0244am) it5.next();
                        abstractC0244am4.m4439ch();
                        if ((abstractC0244am4 instanceof AbstractC0623y) && abstractC0244am4.m4485bI()) {
                            m1079A.f6119bU.m1157a((AbstractC0623y) abstractC0244am4);
                        }
                    }
                }
                z2 = true;
            }
            if (!z2) {
                c1030a.m792h("Trigger activated with no effect");
            }
        }
    }
}
