package com.corrodinggames.rts.game.p012b;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/j.class */
public class C0183j {

    /* renamed from: a */
    public String f950a;

    /* renamed from: b */
    public C0934e f951b;

    /* renamed from: c */
    public String f952c;

    /* renamed from: d */
    int f953d;

    /* renamed from: e */
    int f954e;

    /* renamed from: f */
    int f955f;

    /* renamed from: g */
    int f956g;

    /* renamed from: j */
    int f959j;

    /* renamed from: k */
    float f960k;

    /* renamed from: l */
    public int f961l;

    /* renamed from: n */
    public short f963n;

    /* renamed from: o */
    public C0173b f964o;

    /* renamed from: t */
    static String f970t = "[EMBED]";

    /* renamed from: u */
    static ArrayList f971u = new ArrayList();

    /* renamed from: h */
    int f957h = 0;

    /* renamed from: i */
    int f958i = 0;

    /* renamed from: m */
    public int f962m = Integer.MAX_VALUE;

    /* renamed from: p */
    public boolean f965p = false;

    /* renamed from: q */
    public boolean f966q = false;

    /* renamed from: r */
    public boolean f967r = false;

    /* renamed from: s */
    public boolean f968s = false;

    /* renamed from: x */
    private HashMap f969x = new HashMap();

    /* renamed from: v */
    Rect f972v = new Rect();

    /* renamed from: w */
    int f973w = -1;

    /* renamed from: a */
    public String m4411a(C0173b c0173b, Element element) {
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null) {
            NodeList elementsByTagName = element2.getElementsByTagName("property");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                if (element3.getAttribute("name").equals("embedded_png")) {
                    String attribute = element3.getAttribute("value");
                    if (attribute != null && !attribute.equals(VariableScope.nullOrMissingString)) {
                        return attribute;
                    }
                    Node firstChild = element3.getFirstChild();
                    if (firstChild != null) {
                        return firstChild.getNodeValue();
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public static Element m4412a(C0173b c0173b, String str) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(c0173b.m4483d("tilesets/", str)).getDocumentElement();
        } catch (Exception e) {
            AbstractC0916l.m1071A().m1029a("Unable to load or parse sourced tileset: tilesets/" + str, 1);
            throw new C0179f("Unable to load or parse sourced tileset: tilesets/" + str, e);
        }
    }

    public C0183j(C0173b c0173b, String str, int i) {
        this.f964o = c0173b;
        this.f961l = i;
        Element m4412a = m4412a(c0173b, str);
        this.f950a = str;
        m4408a(m4412a);
    }

    public C0183j(C0173b c0173b, Element element) {
        this.f964o = c0173b;
        this.f961l = Integer.parseInt(element.getAttribute("firstgid"));
        String attribute = element.getAttribute("source");
        if (attribute != null && !attribute.equals(VariableScope.nullOrMissingString)) {
            element = m4412a(c0173b, attribute);
            this.f950a = attribute;
        }
        m4408a(element);
    }

    /* renamed from: a */
    public void m4408a(Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("image");
        if (elementsByTagName.getLength() > 0) {
            this.f952c = AbstractC0916l.m948k(((Element) elementsByTagName.item(0)).getAttribute("source").trim());
        }
        String m4411a = m4411a(this.f964o, element);
        if (m4411a != null) {
            this.f952c = m4409a(m4411a, this.f952c);
        }
        if (this.f952c == null) {
            throw new C0179f("Map tileset is missing an image tag or embedded image data");
        }
        this.f953d = this.f964o.f795n;
        this.f954e = this.f964o.f796o;
        if (element.hasAttribute("tilewidth")) {
            this.f953d = Integer.parseInt(element.getAttribute("tilewidth"));
            this.f954e = Integer.parseInt(element.getAttribute("tileheight"));
        }
        if (AbstractC0916l.m1070B()) {
            this.f953d = this.f964o.f795n;
            this.f954e = this.f964o.f796o;
        }
        int i = 0;
        if (element.hasAttribute("spacing")) {
            i = Integer.parseInt(element.getAttribute("spacing"));
        }
        this.f955f = this.f953d + i;
        this.f956g = this.f954e + i;
        NodeList elementsByTagName2 = element.getElementsByTagName("tile");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName2.item(i2);
            int parseInt = Integer.parseInt(element2.getAttribute("id")) + this.f961l;
            Properties properties = new Properties();
            Element element3 = (Element) element2.getElementsByTagName("properties").item(0);
            if (element3 != null) {
                NodeList elementsByTagName3 = element3.getElementsByTagName("property");
                for (int i3 = 0; i3 < elementsByTagName3.getLength(); i3++) {
                    Element element4 = (Element) elementsByTagName3.item(i3);
                    String attribute = element4.getAttribute("name");
                    String attribute2 = element4.getAttribute("value");
                    if ("unit".equalsIgnoreCase(attribute) || "customUnit".equalsIgnoreCase(attribute)) {
                        this.f968s = true;
                    }
                    properties.setProperty(attribute, attribute2);
                }
            }
            this.f969x.put(new Integer(parseInt), properties);
        }
    }

    /* renamed from: a */
    public static String m4409a(String str, String str2) {
        Iterator it = f971u.iterator();
        while (it.hasNext()) {
            C0184k c0184k = (C0184k) it.next();
            if (str.equalsIgnoreCase(c0184k.f979f)) {
                return c0184k.f977d;
            }
        }
        C0184k c0184k2 = new C0184k();
        c0184k2.f975b = false;
        c0184k2.f978e = null;
        c0184k2.f979f = str;
        c0184k2.f976c = f970t;
        c0184k2.f977d = f970t + C0184k.f974a;
        c0184k2.f980g = str2;
        C0184k.f974a++;
        f971u.add(c0184k2);
        return c0184k2.f977d;
    }

    /* renamed from: a */
    public static C0934e m4410a(String str) {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        String str2 = "tilesets/bitmaps/";
        if (str.startsWith(f970t)) {
            str2 = f970t;
        }
        C0184k c0184k = null;
        Iterator it = f971u.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0184k c0184k2 = (C0184k) it.next();
            if (str.equalsIgnoreCase(c0184k2.f977d) && str2.equalsIgnoreCase(c0184k2.f976c)) {
                c0184k = c0184k2;
                break;
            }
        }
        if (c0184k != null) {
            if (c0184k.f979f != null) {
                try {
                    C0934e mo183a = m1071A.f6161bO.mo183a((InputStream) new BufferedInputStream(C0178e.m4437a(c0184k.f979f, "base64", VariableScope.nullOrMissingString)), false);
                    if (mo183a == null) {
                        throw new C0179f("Embedded tilesetBitmap is null for: " + str);
                    }
                    c0184k.f978e = mo183a;
                    c0184k.f979f = null;
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    throw new C0179f("Error loading embedded base64 image:" + c0184k.f980g + " - " + e.getMessage());
                }
            }
            c0184k.f975b = true;
            return c0184k.f978e;
        }
        try {
            InputStream m4483d = m1071A.f6158bL.m4483d(str2, str);
            C0934e mo183a2 = m1071A.f6161bO.mo183a(m4483d, false);
            if (m4483d != null) {
                try {
                    m4483d.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (mo183a2 == null) {
                throw new RuntimeException("tilesetBitmap is null for: " + str);
            }
            mo183a2.m881a("tilesets/" + str);
            C0184k c0184k3 = new C0184k();
            c0184k3.f975b = true;
            c0184k3.f978e = mo183a2;
            c0184k3.f976c = str2;
            c0184k3.f977d = str;
            f971u.add(c0184k3);
            return c0184k3.f978e;
        } catch (IOException e3) {
            throw new C0179f("Image file could not be found or loaded: " + str2 + str, e3);
        }
    }

    /* renamed from: a */
    public static void m4416a() {
        Iterator it = f971u.iterator();
        while (it.hasNext()) {
            ((C0184k) it.next()).f975b = false;
        }
    }

    /* renamed from: b */
    public static void m4407b() {
        Iterator it = f971u.iterator();
        while (it.hasNext()) {
            C0184k c0184k = (C0184k) it.next();
            if (!c0184k.f975b) {
                if (c0184k.f978e != null) {
                    c0184k.f978e.mo49o();
                    c0184k.f978e = null;
                }
                c0184k.f979f = null;
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m4404c() {
        this.f951b = m4410a(this.f952c);
        this.f959j = this.f951b.mo386m() / this.f955f;
        if (this.f959j == 0) {
            this.f959j = 1;
        }
        this.f960k = 1.0f / this.f959j;
    }

    /* renamed from: a */
    public Properties m4415a(int i) {
        return (Properties) this.f969x.get(new Integer(i));
    }

    /* renamed from: a */
    public final void m4413a(int i, Rect rect) {
        int i2 = i % this.f959j;
        int i3 = (int) (i * this.f960k);
        int i4 = this.f957h + (i2 * this.f955f);
        int i5 = this.f958i + (i3 * this.f956g);
        rect.f230a = i4;
        rect.f231b = i5;
        rect.f232c = i4 + this.f953d;
        rect.f233d = i5 + this.f954e;
    }

    /* renamed from: b */
    public final Rect m4406b(int i) {
        if (this.f973w == i) {
            return this.f972v;
        }
        this.f973w = i;
        m4413a(i, this.f972v);
        return this.f972v;
    }

    /* renamed from: c */
    public void m4403c(int i) {
        this.f962m = i;
    }

    /* renamed from: d */
    public boolean m4401d(int i) {
        return i >= this.f961l && i <= this.f962m;
    }

    /* renamed from: d */
    public void m4402d() {
        this.f951b = null;
        this.f964o = null;
        this.f969x = null;
    }

    /* renamed from: b */
    public Integer m4405b(String str, String str2) {
        for (Map.Entry entry : this.f969x.entrySet()) {
            Integer num = (Integer) entry.getKey();
            String property = ((Properties) entry.getValue()).getProperty(str);
            if (property != null && property.equals(str2)) {
                return num;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m4414a(int i, int i2) {
        int mo386m;
        if (this.f951b == null) {
            AbstractC0916l.m963e("getIndexOffsetByPosition tilesetBitmap == null");
            mo386m = 3;
        } else if (this.f953d == 0) {
            AbstractC0916l.m963e("getIndexOffsetByPosition tileWidth==0");
            mo386m = 3;
        } else {
            mo386m = this.f951b.mo386m() / this.f953d;
        }
        return i + (i2 * mo386m);
    }
}
