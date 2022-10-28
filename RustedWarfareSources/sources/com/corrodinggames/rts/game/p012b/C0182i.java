package com.corrodinggames.rts.game.p012b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/i.class */
public class C0182i {

    /* renamed from: a */
    public int f944a;

    /* renamed from: b */
    public String f945b;

    /* renamed from: c */
    public ArrayList f946c;

    /* renamed from: d */
    public int f947d;

    /* renamed from: e */
    public int f948e;

    /* renamed from: f */
    public Properties f949f;

    /* renamed from: a */
    public C0172a m4417a(String str) {
        if (this.f946c != null) {
            Iterator it = this.f946c.iterator();
            while (it.hasNext()) {
                C0172a c0172a = (C0172a) it.next();
                if (str.equalsIgnoreCase(c0172a.f767b)) {
                    return c0172a;
                }
            }
            return null;
        }
        return null;
    }

    public C0182i(Element element, C0173b c0173b) {
        NodeList elementsByTagName;
        this.f945b = element.getAttribute("name");
        if (element.hasAttribute("width")) {
            this.f947d = Integer.parseInt(element.getAttribute("width"));
        }
        if (element.hasAttribute("height")) {
            this.f948e = Integer.parseInt(element.getAttribute("height"));
        }
        this.f946c = new ArrayList();
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null && (elementsByTagName = element2.getElementsByTagName("property")) != null) {
            this.f949f = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                this.f949f.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        NodeList elementsByTagName2 = element.getElementsByTagName("object");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            C0172a c0172a = new C0172a((Element) elementsByTagName2.item(i2), c0173b, this);
            c0172a.f766a = i2;
            this.f946c.add(c0172a);
        }
    }
}
