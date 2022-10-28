package com.corrodinggames.librocket;

import android.graphics.Rect;
import android.graphics.RectF;
import com.Element;
import com.ElementDocument;
import com.LibRocket;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0734bn;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.librocket.b */
/* loaded from: game-lib.jar:com/corrodinggames/librocket/b.class */
public abstract class AbstractC0048b extends LibRocket {

    /* renamed from: a */
    public static C0734bn f356a = new C0734bn("LoadResources");

    /* renamed from: b */
    public static String f357b = VariableScope.nullOrMissingString;

    /* renamed from: e */
    public boolean f360e;

    /* renamed from: j */
    private C0050d f364j;

    /* renamed from: k */
    private C0050d f365k;

    /* renamed from: d */
    protected int f359d = 0;

    /* renamed from: f */
    protected Rect f361f = new Rect();

    /* renamed from: g */
    protected RectF f362g = new RectF();

    /* renamed from: h */
    protected boolean f363h = false;

    /* renamed from: i */
    Pattern f366i = Pattern.compile("\\$\\{([^\\}]*?)\\}");

    /* renamed from: c */
    public ScriptEngine f358c = ScriptEngine.createScriptEngine(this);

    public abstract void EnableScissorRegion(boolean z);

    /* renamed from: a */
    public void mo238a() {
        this.f359d = 0;
    }

    /* renamed from: a */
    public static String m5319a(String str) {
        LoggerMaybe.LogDebug2("convertTexturePath for: " + str);
        String m2034o = C0758f.m2034o(str);
        if (m2034o.startsWith("base:")) {
            return f357b + m2034o.substring("base:".length());
        }
        if (m2034o.startsWith("drawable:")) {
            return f357b + "res/drawable/" + m2034o.substring("drawable:".length());
        }
        if (m2034o.startsWith("assets:")) {
            String substring = m2034o.substring("assets:".length());
            String m2226e = C0750a.m2226e(substring);
            boolean z = true;
            if (LoggerMaybe.f6210aZ && m2226e != null && m2226e.startsWith(f357b)) {
                z = false;
            }
            if (LoggerMaybe.f6210aZ && m2226e != null && m2226e.startsWith("/private")) {
                z = false;
            }
            LoggerMaybe.LogDebug2("convertTexturePath  (basePath:" + z + "):" + substring + " > " + m2226e);
            if (z) {
                return f357b + m2226e;
            }
            return m2226e;
        } else if (m2034o.startsWith(f357b + "assets/gui/")) {
            LoggerMaybe.LogDebug2("convertTexturePath already had path:" + m2034o);
            return m2034o;
        } else {
            return f357b + "assets/gui/" + m2034o;
        }
    }

    /* renamed from: a */
    public Matcher m5317a(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public void ReleaseTexture(int i) {
        removeTextureHolder(i);
    }

    public boolean LoadTexture(int i, String str) {
        f356a.m2379a();
        AbstractC0049c abstractC0049c = (AbstractC0049c) findTextureHolder(i);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        InterfaceC0303as interfaceC0303as = null;
        if (str.startsWith("lazy:")) {
            str = str.substring("lazy:".length());
            z = true;
        }
        if (str.startsWith("nocolor:")) {
            str = str.substring("nocolor:".length());
            z2 = true;
        }
        if (str.startsWith("unit:")) {
            str = str.substring("unit:".length());
            interfaceC0303as = AbstractC0249ar.m4372a(str);
            z = true;
        }
        if (str.startsWith("thumbnail:")) {
            str = str.substring("thumbnail:".length());
            z3 = true;
        }
        Matcher m5317a = m5317a("^(alpha\\((.*)\\):).*", str);
        if (m5317a != null) {
            String group = m5317a.group(1);
            String group2 = m5317a.group(2);
            LoggerMaybe.LogDebug2("alpha=" + group2);
            abstractC0049c.f371e = Float.parseFloat(group2);
            str = str.substring(group.length());
        }
        String m5319a = m5319a(str);
        abstractC0049c.f368b = z;
        abstractC0049c.f369c = z3;
        abstractC0049c.f370d = z2;
        abstractC0049c.f372f = interfaceC0303as;
        abstractC0049c.f367a = m5319a;
        if (!z && !abstractC0049c.mo236a()) {
            f356a.m2378b();
            return false;
        }
        f356a.m2378b();
        return true;
    }

    public void SetScissorRegion(int i, int i2, int i3, int i4) {
        this.f361f.m5467a(i, i2, i + i3, i2 + i4);
        this.f362g.m5454a(i, i2, i + i3, i2 + i4);
        EnableScissorRegion(true);
    }

    /* renamed from: b */
    public boolean m5313b() {
        if (getActiveDocument() != null || this.f365k != null || this.f364j != null) {
            return false;
        }
        return true;
    }

    public void HandleEvent(String str) {
        this.f360e = true;
        try {
            this.f358c.processScript(str);
        } finally {
            this.f360e = false;
        }
    }

    /* renamed from: b */
    public Object m5310b(String str) {
        HashMap activeDocumentMetadata = getActiveDocumentMetadata();
        if (activeDocumentMetadata == null) {
            return null;
        }
        return activeDocumentMetadata.get(str);
    }

    public void newDocumentLoaded(ElementDocument elementDocument) {
        this.f358c.getRootNoCheck().convertTextOnPage();
    }

    public void newDocumentShown(ElementDocument elementDocument) {
        if (this.f365k != null) {
            this.f365k.f374a.pullToFront();
        }
        if (this.f364j != null) {
            this.f364j.f374a.pullToFront();
        }
    }

    /* renamed from: c */
    public ElementDocument m5308c() {
        if (this.f365k != null) {
            return this.f365k.f374a;
        }
        return null;
    }

    /* renamed from: d */
    public ElementDocument m5305d() {
        if (this.f364j != null) {
            return this.f364j.f374a;
        }
        return null;
    }

    /* renamed from: e */
    public ElementDocument m5303e() {
        ElementDocument m5305d = m5305d();
        if (m5305d != null) {
            return m5305d;
        }
        return m5308c();
    }

    /* renamed from: f */
    public ElementDocument m5302f() {
        ElementDocument m5308c = m5308c();
        if (m5308c != null) {
            return m5308c;
        }
        return getActiveDocument();
    }

    /* renamed from: g */
    public ElementDocument m5301g() {
        ElementDocument m5305d = m5305d();
        if (m5305d != null) {
            return m5305d;
        }
        ElementDocument m5308c = m5308c();
        if (m5308c != null) {
            return m5308c;
        }
        return getActiveDocument();
    }

    /* renamed from: c */
    public void m5306c(String str) {
        C0050d c0050d = new C0050d();
        c0050d.f375b = null;
        c0050d.f376c = str;
        m5320a(c0050d);
    }

    /* renamed from: b */
    public void m5309b(String str, String str2) {
        C0050d c0050d = new C0050d();
        c0050d.f375b = str;
        c0050d.f376c = str2;
        m5320a(c0050d);
    }

    /* renamed from: a */
    public void m5314a(String str, String str2, String str3, String str4, String str5, boolean z) {
        C0050d c0050d = new C0050d();
        c0050d.f375b = str;
        c0050d.f376c = str2;
        c0050d.f377d = str3;
        c0050d.f378e = str4;
        c0050d.f379f = str5;
        c0050d.f381h = z;
        m5320a(c0050d);
    }

    /* renamed from: a */
    public void m5316a(String str, String str2, String str3, C0051e c0051e, C0051e c0051e2, boolean z) {
        C0050d c0050d = new C0050d();
        c0050d.f375b = str;
        c0050d.f376c = str2;
        c0050d.f377d = str3;
        c0050d.f378e = c0051e;
        c0050d.f379f = c0051e2;
        c0050d.f381h = z;
        m5320a(c0050d);
    }

    /* renamed from: a */
    public ElementDocument m5315a(String str, String str2, String str3, Object obj, Object obj2, boolean z, boolean z2) {
        C0050d c0050d = new C0050d();
        c0050d.f375b = str;
        c0050d.f376c = str2;
        c0050d.f377d = str3;
        c0050d.f378e = obj;
        c0050d.f379f = obj2;
        c0050d.f380g = z;
        c0050d.f381h = z2;
        return m5320a(c0050d);
    }

    /* renamed from: a */
    public ElementDocument m5320a(C0050d c0050d) {
        ScriptEngine.checkThreadAccess();
        ElementDocument createPopup = createPopup("messagebox.rml", null);
        HashMap metadataMap = createPopup.getMetadataMap();
        createPopup.getElementById("message").setTextWithNewlines(c0050d.f376c);
        if (c0050d.f375b == null) {
            c0050d.f375b = VariableScope.nullOrMissingString;
        }
        createPopup.getElementById("title").setText(c0050d.f375b);
        m5321a(createPopup, "button_1", c0050d.f378e, metadataMap);
        m5321a(createPopup, "button_2", c0050d.f379f, metadataMap);
        Element elementById = createPopup.getElementById("button_back");
        elementById.loadCharsetIfNeededWithCurrentText();
        String str = "closePopup();";
        if (c0050d.f377d != null) {
            str = str + "hideKeyboard();";
        }
        elementById.setAttribute("onclick", str);
        if (!c0050d.f381h) {
            elementById.hide();
        }
        if (c0050d.f378e == null && c0050d.f379f == null) {
            elementById.setText(C0820a.m1689a("menus.common.ok", new Object[0]));
            elementById.focus();
        }
        if (c0050d.f377d != null) {
            createPopup.getElementById("textInputWrapper").show();
            Element elementById2 = createPopup.getElementById("textInput");
            elementById2.setAttribute("value", c0050d.f377d);
            elementById2.focus();
        }
        c0050d.f374a = createPopup;
        if (c0050d.f380g) {
            if (m5311b(c0050d)) {
                return createPopup;
            }
            closeDocument(createPopup);
            return null;
        }
        return createPopup;
    }

    /* renamed from: b */
    public boolean m5311b(C0050d c0050d) {
        if (this.f364j != null) {
            LoggerMaybe.LogDebug2("AlertPopup already visible closing");
            closeDocument(this.f364j.f374a);
            this.f364j = null;
        }
        this.f364j = c0050d;
        LoggerMaybe.LogDebug2("Showing popup: " + c0050d.f375b);
        if (!this.f360e) {
            update();
        } else {
            LoggerMaybe.LogDebug2("insideEvent");
        }
        LoggerMaybe.LogDebug2("popup ready..");
        c0050d.f374a.show(4);
        LoggerMaybe.LogDebug2("Popup shown..");
        return true;
    }

    /* renamed from: a */
    public boolean m5322a(ElementDocument elementDocument) {
        return m5307c(new C0050d(elementDocument));
    }

    /* renamed from: c */
    public boolean m5307c(C0050d c0050d) {
        if (this.f365k != null) {
            LoggerMaybe.LogDebug2("Popup already visible, cannot show: " + c0050d.f374a.getMetadata("sourceDocumentId"));
            if (this.f364j != null) {
                this.f364j.f374a.pullToFront();
                return false;
            }
            this.f365k.f374a.pullToFront();
            return false;
        }
        this.f365k = c0050d;
        LoggerMaybe.LogDebug2("Showing popup: " + c0050d.f375b);
        if (!this.f360e) {
            update();
        } else {
            LoggerMaybe.LogDebug2("insideEvent");
        }
        LoggerMaybe.LogDebug2("popup ready..");
        c0050d.f374a.show(4);
        LoggerMaybe.LogDebug2("Popup shown..");
        return true;
    }

    /* renamed from: a */
    public ElementDocument m5318a(String str, Object obj, String str2, boolean z) {
        ScriptEngine.checkThreadAccess();
        ElementDocument createPopup = createPopup("messagebox.rml", obj);
        createPopup.setMetadata("sourceDocumentId", str);
        String m2138a = C0758f.m2138a(new File(m5319a(str)));
        createPopup.getElementById("mainButtons").hide();
        Element elementById = createPopup.getElementById("message");
        elementById.setInnerRML(m2138a);
        m5323a(elementById, false);
        if (str2 == null) {
            str2 = VariableScope.nullOrMissingString;
        }
        createPopup.getElementById("title").setText(str2);
        if (z) {
            if (m5312b(createPopup)) {
                return createPopup;
            }
            return null;
        }
        return createPopup;
    }

    /* renamed from: b */
    public boolean m5312b(ElementDocument elementDocument) {
        if (m5307c(new C0050d(elementDocument))) {
            return true;
        }
        closeDocument(elementDocument);
        return false;
    }

    /* renamed from: a */
    public void m5323a(Element element, boolean z) {
        if (element == null) {
            LoggerMaybe.LogDebug2("loadCharsetIfNeededOnChildren: root is null");
            return;
        }
        Iterator it = element.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element2 = (Element) it.next();
            boolean z2 = false;
            String tagName = element2.getTagName();
            if (tagName.equals("p") || tagName.startsWith("h") || tagName.startsWith("label") || tagName.startsWith("button") || tagName.startsWith("select")) {
                z2 = true;
            }
            if (z && tagName.equals("option")) {
                z2 = true;
            }
            if (z2) {
                element2.loadCharsetIfNeededWithCurrentText();
            }
        }
    }

    /* renamed from: a */
    public void m5321a(ElementDocument elementDocument, String str, Object obj, HashMap hashMap) {
        Element elementById = elementDocument.getElementById(str);
        if (obj == null) {
            elementById.hide();
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            int indexOf = str2.indexOf(":");
            String substring = str2.substring(0, indexOf);
            String str3 = VariableScope.nullOrMissingString;
            if (indexOf + 1 < str2.length()) {
                str3 = str2.substring(indexOf + 1);
            }
            if (substring.startsWith("[onenter]")) {
                substring = substring.substring("[onenter]".length());
                elementDocument.getElementById("textInput").setAttribute("onenter", str3);
            }
            elementById.setText(substring);
            elementById.setAttribute("onclick", str3);
        } else if (obj instanceof C0051e) {
            C0051e c0051e = (C0051e) obj;
            String str4 = "action_" + str;
            hashMap.put(str4, c0051e.f384b);
            elementById.setText(c0051e.f383a);
            elementById.setAttribute("onclick", "runRunnable(" + str4 + ");");
            if (c0051e.f385c) {
                elementDocument.getElementById("textInput").setAttribute("onenter", "runRunnable(" + str4 + ");");
            }
        } else {
            LoggerMaybe.m965g("Unhandled type:" + obj);
        }
    }

    /* renamed from: h */
    public boolean m5300h() {
        if (m5299i() || m5298j()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m5299i() {
        C0050d c0050d = this.f364j;
        if (c0050d != null) {
            LoggerMaybe.LogDebug2("Closing alert");
            closeDocument(c0050d.f374a);
            this.f364j = null;
            if (c0050d.f382i != null) {
                c0050d.f382i.run();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m5298j() {
        C0050d c0050d = this.f365k;
        if (c0050d != null) {
            LoggerMaybe.LogDebug2("Closing popup");
            closeDocument(c0050d.f374a);
            this.f365k = null;
            if (c0050d.f382i != null) {
                c0050d.f382i.run();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public String m5297k() {
        return m5303e().getElementById("textInput").getAttribute("value");
    }

    /* renamed from: d */
    public String m5304d(String str) {
        String replaceFirst;
        Object processArg;
        String str2 = null;
        if (str != null && str.contains("class=\"log-entry\"")) {
            System.out.println("parseText: skipping log line:" + str);
            return null;
        }
        int i = 0;
        Matcher matcher = this.f366i.matcher(str);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                System.out.println("parseText too many loops!!");
                return null;
            }
            String group = matcher.group(1);
            String str3 = null;
            if (this.debug) {
                System.out.println("parseText:" + group);
            }
            if (group.startsWith("i:")) {
                str3 = C0820a.m1689a(group.substring(2), new Object[0]);
            }
            if (str3 == null && (processArg = this.f358c.processArg(group)) != null) {
                str3 = processArg.toString();
            }
            if (str3 == null) {
                replaceFirst = matcher.replaceFirst("(unhandled:" + group + ")");
            } else {
                replaceFirst = matcher.replaceFirst(str3);
            }
            if (str3 != null) {
                ElementDocument activeDocument = getActiveDocument();
                if (activeDocument != null && !activeDocument.translatedToUnicode && C0758f.m2035n(str3)) {
                    activeDocument.translatedToUnicode = true;
                }
                ElementDocument m5301g = m5301g();
                if (m5301g != null && !m5301g.translatedToUnicode && C0758f.m2035n(str3)) {
                    m5301g.translatedToUnicode = true;
                }
            }
            matcher = this.f366i.matcher(replaceFirst);
            str2 = replaceFirst;
        }
        return str2;
    }

    public String TranslateString(String str) {
        try {
            String m5304d = m5304d(str);
            if (m5304d != null) {
                return m5304d;
            }
            return null;
        } catch (Exception e) {
            ScriptEngine.throwDelayedException("TranslateString exception on: " + str, e);
            LoggerMaybe.m1033a("Exception in TranslateString", (Throwable) e);
            LoggerMaybe.m990b("start");
            e.printStackTrace();
            LoggerMaybe.m990b("end");
            LoggerMaybe.m990b("start logStack");
            LoggerMaybe.m1061S();
            LoggerMaybe.m990b("end logStack");
            System.err.flush();
            System.out.flush();
            return null;
        }
    }

    public long getFileLastModified(String str) {
        return C0894j.m1237a(str, false);
    }

    public void postUpdate() {
        boolean z = this.queueExtraUpdate;
        super.postUpdate();
        if (z) {
            this.f358c.checkForErrors();
        }
    }
}
