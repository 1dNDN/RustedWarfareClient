package com.corrodinggames.rts.game.p012b;

import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0400ba;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1116x;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/a.class */
public class C0172a {

    /* renamed from: a */
    public int f766a;

    /* renamed from: b */
    public String f767b;

    /* renamed from: c */
    public String f768c;

    /* renamed from: d */
    public String f769d;

    /* renamed from: e */
    public float f770e;

    /* renamed from: f */
    public float f771f;

    /* renamed from: g */
    public float f772g;

    /* renamed from: h */
    public float f773h;

    /* renamed from: i */
    public float f774i;

    /* renamed from: p */
    private String f775p;

    /* renamed from: j */
    public RectF f776j;

    /* renamed from: k */
    public int f777k;

    /* renamed from: l */
    public C0183j f778l;

    /* renamed from: m */
    public int f779m;

    /* renamed from: n */
    public Properties f780n;

    /* renamed from: o */
    public C1101m f781o = new C1101m();

    /* renamed from: a */
    static float m5351a(Element element, String str) {
        String attribute = element.getAttribute(str);
        try {
            return Float.parseFloat(attribute);
        } catch (NumberFormatException e) {
            throw new C0179f("Invalid map: Error reading '" + str + "' invalid float: " + attribute, e);
        }
    }

    public C0172a(Element element, C0173b c0173b, C0182i c0182i) {
        AbstractC0197n m5017k;
        C0451j mo4485a;
        NodeList elementsByTagName;
        String textContent;
        this.f777k = -1;
        this.f779m = -1;
        this.f767b = element.getAttribute("name");
        if (this.f767b != null) {
            this.f768c = this.f767b.trim().toLowerCase(Locale.ENGLISH);
        }
        this.f769d = element.getAttribute("type");
        this.f770e = Float.parseFloat(element.getAttribute("x"));
        this.f771f = Float.parseFloat(element.getAttribute("y"));
        if (element.hasAttribute("rotation")) {
            this.f774i = Float.parseFloat(element.getAttribute("rotation")) - 90.0f;
        }
        if (!element.getAttribute("width").equals(VariableScope.nullOrMissingString)) {
            this.f772g = m5351a(element, "width");
        }
        if (!element.getAttribute("height").equals(VariableScope.nullOrMissingString)) {
            this.f773h = m5351a(element, "height");
        }
        Element element2 = (Element) element.getElementsByTagName("image").item(0);
        if (element2 != null) {
            this.f775p = element2.getAttribute("source");
        }
        Element element3 = (Element) element.getElementsByTagName("properties").item(0);
        if (element3 != null && (elementsByTagName = element3.getElementsByTagName("property")) != null) {
            this.f780n = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element4 = (Element) elementsByTagName.item(i);
                String attribute = element4.getAttribute("name");
                if (element4.hasAttribute("value")) {
                    textContent = element4.getAttribute("value");
                } else {
                    textContent = element4.getTextContent();
                }
                this.f780n.setProperty(attribute, textContent);
            }
        }
        if (element.hasAttribute("gid")) {
            this.f777k = Integer.parseInt(element.getAttribute("gid"));
            this.f778l = c0173b.m5341a(this.f777k);
            if (this.f778l != null) {
                this.f778l.f965p = true;
                this.f778l.f967r = true;
                this.f779m = this.f777k - this.f778l.f961l;
            } else {
                throw new RuntimeException("Unable to decode base 64 block, could not find tileId:" + this.f777k);
            }
        }
        Properties properties = this.f780n;
        this.f776j = new RectF(this.f770e, this.f771f, this.f770e + this.f772g, this.f771f + this.f773h);
        c0173b.m5333a(this.f776j);
        this.f770e = this.f776j.f234a;
        this.f771f = this.f776j.f235b;
        this.f772g = this.f776j.m5856b();
        this.f773h = this.f776j.m5852c();
        float m5850d = this.f776j.m5850d();
        float m5849e = this.f776j.m5849e();
        String attribute2 = element.getAttribute("type");
        if (attribute2 != null && !attribute2.equals(VariableScope.nullOrMissingString) && !attribute2.equals("unit") && !attribute2.equals("comment") && !c0182i.f945b.equalsIgnoreCase("triggers")) {
            m5347d("Triggers should be on triggers layer");
        }
        if (properties != null) {
            String property = properties.getProperty("unit");
            String property2 = properties.getProperty("customUnit");
            if (property != null || property2 != null) {
                String property3 = properties.getProperty("team");
                if (property3 == null) {
                    throw new C0179f("Unit object team missing for:" + (property != null ? property : property2));
                }
                if ("none".equalsIgnoreCase(property3)) {
                    m5017k = AbstractC0197n.m5017k(-1);
                } else {
                    try {
                        m5017k = AbstractC0197n.m5017k(Integer.valueOf(property3).intValue());
                        if (m5017k == null) {
                            Core.m997b("map", "Unit object without team:" + property + " (skipping unit)");
                            return;
                        } else if (m5017k.m5074b()) {
                            Core.m997b("map", "Unit team is marked as spectator:" + property + " (skipping unit)");
                            return;
                        }
                    } catch (NumberFormatException e) {
                        throw new C0179f("Unit object team invalid: " + e.getMessage(), e);
                    }
                }
                if (property2 != null) {
                    C0453l m3673n = C0453l.m3673n(property2);
                    if (m3673n == null) {
                        throw new C0179f("Could not find custom unit of:" + property2 + " at x:" + this.f770e + ", y:" + this.f771f);
                    }
                    InterfaceC0303as m3698c = C0453l.m3698c(m3673n);
                    if (m3698c != null) {
                        if (m3698c instanceof C0453l) {
                            m3673n = (C0453l) m3698c;
                        } else {
                            Core.m998b("replacement not a custom unit:" + m3698c.mo4474i());
                        }
                    }
                    mo4485a = C0453l.m3707a(false, m3673n);
                    if (mo4485a == null) {
                        throw new RuntimeException("Metadata unit is null for:" + property2);
                    }
                } else {
                    InterfaceC0303as m4623a = EnumC0249ar.m4623a(property);
                    if (m4623a != null) {
                        mo4485a = m4623a.mo4485a();
                    } else {
                        throw new C0179f("Could not find unit type of:" + property + " at x:" + this.f770e + ", y:" + this.f771f);
                    }
                }
                mo4485a.f6958el = m5850d;
                mo4485a.f6959em = m5849e;
                if (!mo4485a.m4758bI()) {
                    mo4485a.m4653h(this.f774i);
                }
                if (m5017k != null) {
                    mo4485a.m4768b(m5017k);
                    if (properties.getProperty("type") != null) {
                        mo4485a.m4771a_(properties.getProperty("type"));
                    }
                    if (properties.getProperty("randomRotate") != null && !mo4485a.m4758bI()) {
                        mo4485a.m4653h(C0758f.m2189a(mo4485a, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    }
                    mo4485a.f1601bN = "builder".equalsIgnoreCase(property) || "builder".equalsIgnoreCase(property2);
                    mo4485a.f1602bO = "commandCenter".equalsIgnoreCase(property) || "commandCenter".equalsIgnoreCase(property2);
                    mo4485a.f1599bL = true;
                    mo4485a.mo3351n();
                    AbstractC0197n.m5053c(mo4485a);
                    AbstractC1120w.m434dJ();
                    return;
                }
                throw new C0179f("team is null:" + property);
            }
        }
    }

    /* renamed from: a */
    public boolean m5355a(AbstractC0244am abstractC0244am) {
        return this.f776j.m5855b((int) abstractC0244am.f6958el, (int) abstractC0244am.f6959em);
    }

    /* renamed from: a */
    public void m5354a(String str) {
        if (!this.f781o.contains(str)) {
            this.f781o.add(str);
        }
    }

    /* renamed from: a */
    public String[] m5356a() {
        if (this.f780n == null) {
            return C1116x.f6937h;
        }
        C1101m c1101m = new C1101m();
        Enumeration<?> propertyNames = this.f780n.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            if (!this.f781o.contains(str)) {
                c1101m.add(str);
            }
        }
        return (String[]) c1101m.toArray(C1116x.f6937h);
    }

    /* renamed from: b */
    public String m5349b(String str) {
        m5354a(str);
        if (this.f780n == null) {
            return null;
        }
        return this.f780n.getProperty(str);
    }

    /* renamed from: a */
    public String m5352a(String str, String str2) {
        m5354a(str);
        if (this.f780n == null) {
            return null;
        }
        return this.f780n.getProperty(str, str2);
    }

    /* renamed from: c */
    public Integer m5348c(String str) {
        String m5352a = m5352a(str, (String) null);
        if (m5352a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m5352a));
        } catch (NumberFormatException e) {
            throw new C0179f(str + ": Unexpected integer value:'" + m5352a + "'");
        }
    }

    /* renamed from: a */
    public C0385az m5353a(String str, C0385az c0385az) {
        String m5352a = m5352a(str, (String) null);
        if (m5352a == null) {
            return c0385az;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0400ba(null, m5352a));
        String str2 = str + "_";
        C1101m c1101m = new C1101m();
        for (Object obj : this.f780n.keySet()) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (str3.startsWith(str2)) {
                    c1101m.add(str3);
                }
            } else {
                Core.m998b("createLocaleStringFromProperty: Non string:" + obj);
            }
        }
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            String lowerCase = str4.substring(str2.length()).toLowerCase(Locale.ROOT);
            Core.m998b("createLocaleStringFromProperty checking: " + str4);
            if (lowerCase.length() <= 4) {
                String m5349b = m5349b(str4);
                Core.m998b("createLocaleStringFromProperty got: " + m5349b);
                Core.m998b("createLocaleStringFromProperty code: " + lowerCase);
                arrayList.add(new C0400ba(lowerCase, m5349b));
            }
        }
        C0385az c0385az2 = new C0385az((C0400ba[]) arrayList.toArray(new C0400ba[0]));
        c0385az2.m4224b();
        Core.m998b("createLocaleStringFromProperty final: " + c0385az2.m4224b());
        Core.m998b("createLocaleStringFromProperty locate: " + C0820a.m1728c());
        return c0385az2;
    }

    /* renamed from: d */
    public void m5347d(String str) {
        C0831ad.m1493g("(Map trigger: " + this.f767b + ", type:" + this.f769d + "): " + str);
    }

    /* renamed from: b */
    public String m5350b() {
        return "(Map trigger: " + this.f767b + ", type:" + this.f769d + ")";
    }
}
