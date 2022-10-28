package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.Core;
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
    public static void m789a(C1049f c1049f, C1030a c1030a) {
        Integer m804d;
        Integer m804d2;
        Core m1087A = Core.m1087A();
        boolean z = false;
        if (!c1030a.f6606j) {
            z = true;
        }
        c1049f.m781a(c1030a);
        c1030a.f6605i = true;
        c1030a.f6606j = true;
        c1030a.f6607k = m1087A.f6102by;
        boolean z2 = false;
        if (c1030a.f6623A != null) {
            C0801j m1794a = m1087A.f6117bS.f5115e.m1794a(null, c1030a.f6623A.m4224b());
            if (m1794a != null) {
                String m810b = c1030a.m810b("globalMessage_delayPerChar");
                if (m810b != null) {
                    if (m810b.equals("slow")) {
                        m1794a.f5278e = 18;
                    } else {
                        int m809b = c1030a.m809b("globalMessage_delayPerChar", -1);
                        if (m809b != -1) {
                            m1794a.f5278e = m809b;
                        }
                    }
                }
                int m806c = c1030a.m806c("globalMessage_textColor", -1);
                if (m806c != -1) {
                    m1794a.f5279f = m806c;
                }
            }
            z2 = true;
        }
        String m810b2 = c1030a.m810b("debugMessage");
        if (m810b2 != null) {
            c1030a.m800h("Debug: " + m810b2);
            if (m1087A.f6100bv && m1087A.f6231bl) {
                C0831ad.m1588a((String) null, "Debug: " + m810b2);
            }
            z2 = true;
        }
        if (c1030a.m813a("showOnMap", false)) {
            m1087A.f6121bW.m1784a(c1030a.m812b(), c1030a.m808c(), EnumC0806n.message);
            z2 = true;
        }
        if (c1030a.f6602f.f6894a > 0) {
            Iterator it = c1030a.f6602f.iterator();
            while (it.hasNext()) {
                if (((AbstractC1031a) it.next()).m798c(c1030a)) {
                    z2 = true;
                }
            }
        }
        if (c1030a.f6603g == EnumC1037e.f6646a) {
            if (z) {
                c1030a.m800h("objective met");
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
            m1087A.m1003b(c1030a.m812b(), c1030a.m808c());
        }
        if (c1030a.f6603g == EnumC1037e.f6650e) {
            float m812b = c1030a.m812b();
            float m808c = c1030a.m808c();
            AbstractC0197n m823a = c1030a.m823a();
            if (m823a == null) {
                c1030a.m801g("No team set, cannot spawn");
            } else if (c1030a.f6618v != null) {
                c1030a.f6618v.m4152a(m812b, m808c, 0.0f, 0.0f, m823a, false, null, null, false);
            } else {
                c1030a.m801g("No valid unit list to spawn");
            }
            z2 = true;
        }
        if (c1030a.f6603g == EnumC1037e.f6648c) {
            AbstractC0197n m823a2 = c1030a.m823a();
            if (m823a2 == null) {
                c1030a.m801g("Team not set for changeCredits");
                return;
            }
            if (c1030a.m804d("set") != null) {
                m823a2.f1310o = m804d.intValue();
            }
            if (c1030a.m804d("add") != null) {
                m823a2.m5044d(m804d2.intValue());
            }
        } else if (c1030a.f6603g == EnumC1037e.f6649d) {
            AbstractC0197n m823a3 = c1030a.m823a();
            if (m823a3 == null) {
                c1030a.m801g("Team not set for event_teamTags");
                return;
            }
            String m815a = c1030a.m815a("addTeamTags", (String) null);
            if (m815a != null) {
                m823a3.m5066b(C0448g.m3957a(m815a));
            }
            String m815a2 = c1030a.m815a("removeTeamTags", (String) null);
            if (m815a2 != null) {
                m823a3.m5050c(C0448g.m3957a(m815a2));
            }
        } else if (c1030a.f6603g == EnumC1037e.f6647b) {
            String m810b3 = c1030a.m810b("target");
            if (m810b3 == null) {
                C1049f.m756i("Move trigger has no target id:" + c1030a.f6597a);
                return;
            }
            PointF m761f = c1049f.m761f(m810b3);
            if (m761f == null) {
                C1049f.m756i("Move trigger: Cannot find target for:" + c1030a.f6597a + " target:" + m810b3);
                return;
            }
            AbstractC0197n m823a4 = c1030a.m823a();
            if (m823a4 == null) {
                C1049f.m756i("Team not set map trigger:" + c1030a.f6597a);
                return;
            }
            int i = 0;
            C0749e m2419b = m1087A.f6130cf.m2419b(m823a4);
            Iterator it2 = AbstractC0244am.f1590bD.iterator();
            while (it2.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it2.next();
                if (abstractC0244am.f1609bV == m823a4 && (abstractC0244am instanceof AbstractC0623y) && c1030a.m822a(abstractC0244am) && c1030a.m811b(abstractC0244am)) {
                    m2419b.m2319a((AbstractC0623y) abstractC0244am);
                    i++;
                }
            }
            m2419b.m2329a(m761f.f227a, m761f.f228b);
            if (z) {
                c1049f.m772b("firstActivation: move at:" + m1087A.f6102by + " for teamId:" + m823a4.f1306k + " to targetId:" + m810b3 + " (#units:" + i + ")");
            }
            if (c1030a.m810b("unload") != null) {
                Iterator it3 = AbstractC0244am.f1590bD.iterator();
                while (it3.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it3.next();
                    if (abstractC0244am2.f1609bV == m823a4 && (abstractC0244am2 instanceof AbstractC0623y) && c1030a.m822a(abstractC0244am2) && c1030a.m811b(abstractC0244am2) && abstractC0244am2.m4691cq()) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am2;
                        C0749e m2419b2 = m1087A.f6130cf.m2419b(m823a4);
                        m2419b2.f4842e = true;
                        m2419b2.m2319a(abstractC0623y);
                        m2419b2.m2324a(abstractC0623y.m4693co());
                    }
                }
            }
        } else {
            if (c1030a.f6603g == EnumC1037e.f6651f) {
                C1101m c1101m = new C1101m();
                Iterator it4 = AbstractC0244am.f1590bD.iterator();
                while (it4.hasNext()) {
                    AbstractC0244am abstractC0244am3 = (AbstractC0244am) it4.next();
                    if ((abstractC0244am3 instanceof AbstractC0623y) && c1030a.m822a(abstractC0244am3) && c1030a.m811b(abstractC0244am3)) {
                        c1101m.add(abstractC0244am3);
                    }
                }
                if (c1101m.size() > 0) {
                    Iterator it5 = c1101m.iterator();
                    while (it5.hasNext()) {
                        AbstractC0244am abstractC0244am4 = (AbstractC0244am) it5.next();
                        abstractC0244am4.m4700ch();
                        if ((abstractC0244am4 instanceof AbstractC0623y) && abstractC0244am4.m4758bI()) {
                            m1087A.f6119bU.m1165a((AbstractC0623y) abstractC0244am4);
                        }
                    }
                }
                z2 = true;
            }
            if (!z2) {
                c1030a.m800h("Trigger activated with no effect");
            }
        }
    }
}
