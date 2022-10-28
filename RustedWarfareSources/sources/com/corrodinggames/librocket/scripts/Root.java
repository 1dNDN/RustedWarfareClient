package com.corrodinggames.librocket.scripts;

import android.graphics.Color;
import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.librocket.C0051e;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.ActivityC0118j;
import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.appFramework.ActivityC0131q;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.C0734bn;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.C0819g;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.EnumC0822h;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0845ah;
import com.corrodinggames.rts.gameFramework.p041i.C0866b;
import com.corrodinggames.rts.gameFramework.p041i.C0872g;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import com.corrodinggames.rts.gameFramework.p041i.RunnableC0853am;
import com.corrodinggames.rts.gameFramework.p041i.Steam;
import com.corrodinggames.rts.gameFramework.p043k.AbstractC0914b;
import com.corrodinggames.rts.gameFramework.p043k.C0913a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.RunnableC0069a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root.class */
public class Root extends ScriptContext {
    public static final boolean DEBUG_TIMING = true;
    public Multiplayer multiplayer;
    public Mods mods;
    C0734bn openDocumentTimer = new C0734bn("openDocument", true);
    RunnableC0853am threadedGameConnector;
    ElementDocument lastConnectingPopup;
    static C0734bn convertTextStopwatch = new C0734bn("ConvertText", true);
    static C0734bn loadSettingsStopwatch = new C0734bn("LoadSettings", true);
    ArrayList lastSortedDiscoveredServers;

    public void logDebug(String str) {
        LoggerMaybe.LogDebug2("ui[debug]: " + str);
    }

    public void logWarn(String str) {
        LoggerMaybe.LogDebug2("ui[warn]: " + str);
    }

    public void back() {
        this.libRocket.backToLastDocument();
        if (this.libRocket.getActiveDocument() == null) {
            LoggerMaybe.m990b("back: libRocket.getActiveDocument()==null");
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            if (m1079A == null || !m1079A.f6235bq) {
                LoggerMaybe.m990b("back: showing main menu!");
                showMainMenu();
                return;
            }
            LoggerMaybe.m990b("back: resuming game");
            this.guiEngine.m5337a(false);
        }
    }

    public void backOrClose() {
        if (closePopup()) {
            return;
        }
        this.libRocket.backToLastDocument();
    }

    public String fullVersionOnlyStyle() {
        if (LoggerMaybe.m1079A().f6228ar) {
            return "notInDemo";
        }
        return VariableScope.nullOrMissingString;
    }

    public void openIfNotDemo(String str, Object obj, String str2) {
        if (LoggerMaybe.m1079A().f6228ar) {
            alert(str2);
        } else {
            open(str, obj);
        }
    }

    public String getVersionName() {
        return LoggerMaybe.m1079A().m945s();
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$1.class */
    class RunnableC00551 implements Runnable {
        final /* synthetic */ String val$level;

        RunnableC00551(String str) {
            this.val$level = str;
        }

        public void run() {
            Root.this.libRocket.setDocument(this.val$level, null, false);
            Root.this.onShowNewScreen();
        }
    }

    public void delayedOpenNoHistory(String str, Object obj) {
        this.scriptEngine.addRunnableToQueue(new RunnableC00551(str)).framesDelay = 1;
    }

    public void openAfterHelpPopup(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (LoggerMaybe.m1003at() && !m1079A.f6115bQ.hasPlayedGameOrSeenHelp) {
            m1079A.f6115bQ.hasPlayedGameOrSeenHelp = true;
            m1079A.f6115bQ.save();
            showPopup(VariableScope.nullOrMissingString, "First time playing? Would you like to view the quick help slides?", false, "[onenter]View Help:closePopup(); open('help_quick_mobile.rml');", "Skip:closePopup(); open(" + restrictedString(str) + ");");
            return;
        }
        open(str, null);
    }

    public void open(String str, Object obj) {
        this.openDocumentTimer.m2379a();
        AbstractC0048b.f356a.m2374f();
        HashMap hashMap = null;
        if (obj != null) {
            hashMap = new HashMap();
            hashMap.put("mode", obj);
        }
        this.libRocket.setDocument(str, hashMap);
        onShowNewScreen();
        this.openDocumentTimer.m2376d();
        AbstractC0048b.f356a.m2375e();
    }

    public void onShowNewScreen() {
        this.guiEngine.m5337a(true);
    }

    public void resume() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.m5330e();
    }

    public void resumeNonMenu() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.m5337a(false);
    }

    public void startNew(String str) {
        this.guiEngine.m5338a(str);
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void showRangeValue(String str, String str2, boolean z) {
        String num;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return;
        }
        String attribute = activeElementById.getAttribute("value");
        if (z) {
            num = new Float(attribute).toString();
        } else {
            num = Integer.toString((int) Float.parseFloat(attribute));
        }
        Element activeElementById2 = this.libRocket.getActiveElementById(str2);
        if (activeElementById2 == null) {
            logWarn("Could not find:" + str2);
        } else {
            activeElementById2.setText(num);
        }
    }

    public String getValueById(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return null;
        }
        return activeElementById.getAttribute("value");
    }

    public void setValueById(String str, String str2) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
        } else {
            activeElementById.setAttribute("value", str2);
        }
    }

    public Element getElementById(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return null;
        }
        return activeElementById;
    }

    public boolean clickElement(Element element) {
        if (element == null) {
            logWarn("element is null");
            return false;
        }
        element.click();
        return true;
    }

    public void directJoinPopup() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        String str = VariableScope.nullOrMissingString;
        if (m1079A.f6115bQ.lastNetworkIP != null) {
            str = m1079A.f6115bQ.lastNetworkIP;
        }
        showInputPopup("Direct Join", "Enter IP address or host name", str, "[onenter]Join:joinServerFromPopup(getPopupText())", null);
    }

    public void joinServerFromPopup(String str) {
        closePopup();
        hideKeyboard();
        if (str == null) {
            logDebug("joinAddress==null");
            return;
        }
        String trim = str.trim();
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6115bQ.lastNetworkIP = trim;
        m1079A.f6115bQ.save();
        joinServerWithId(trim, null);
    }

    public void joinServerWithId(String str, String str2) {
        LoggerMaybe.m1079A().f6122bX.f5620bK = str2;
        joinServer(str);
    }

    public void joinServer(String str) {
        if (ScriptEngine.inDebugScript && !RunnableC0069a.f389d) {
            return;
        }
        logDebug("joinAddress=" + str);
        this.threadedGameConnector = LoggerMaybe.m1079A().f6122bX.m1544a(str, false, (Runnable) new RunnableC00582());
        this.lastConnectingPopup = createAndShowPopup("multiplayerLobby_connecting.rml", null, "Please wait");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Root$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$2.class */
    public class RunnableC00582 implements Runnable {
        RunnableC00582() {
        }

        public void run() {
            ScriptEngine.getInstance().addScriptToQueue("joinServerCallback();");
        }
    }

    public void joinServerCallback() {
        logDebug("joinServerCallback");
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (this.threadedGameConnector == null) {
            logDebug("threadedGameConnector==null");
            return;
        }
        closePopupOnly();
        if (this.threadedGameConnector.f5689e != null) {
            if (this.threadedGameConnector.f5689e.equals("CANCELLED")) {
                logDebug("Server join cancelled");
                return;
            } else {
                logWarn("Server join failed");
                showPopup("Connection failed", this.threadedGameConnector.f5689e, true, null, null);
            }
        } else {
            try {
                m1079A.f6122bX.m1493b("starting new");
                m1079A.f6122bX.m1543a(this.threadedGameConnector.f5691g);
                logDebug("connected");
                showBattleroom();
            } catch (IOException e) {
                m1079A.m982c(e.getMessage(), "Connection failed");
                e.printStackTrace();
            }
        }
        this.threadedGameConnector = null;
    }

    public void cancelJoinServer() {
        if (this.threadedGameConnector != null) {
            if (this.threadedGameConnector.m1401a()) {
                closePopup();
                return;
            }
            return;
        }
        closePopup();
    }

    public void alert(String str) {
        showAlert(str);
    }

    public void showAlert(String str) {
        logDebug("alert:" + str);
        if (str == null) {
            str = "null";
        }
        this.libRocket.m5306c(str);
    }

    public void showPopupWithButtons(String str, String str2, boolean z, C0051e c0051e, C0051e c0051e2) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m5316a(str, str2, (String) null, c0051e, c0051e2, z);
    }

    public void showPopupWithButtonsAndInput(String str, String str2, boolean z, String str3, C0051e c0051e, C0051e c0051e2) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        if (str3 == null) {
            str3 = VariableScope.nullOrMissingString;
        }
        if (VariableScope.nullOrMissingString.equals(str3)) {
            this.guiEngine.m5327k();
        }
        this.libRocket.m5315a(str, str2, str3, c0051e, c0051e2, true, z);
    }

    public void showPopup(String str, String str2, boolean z, String str3, String str4) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m5314a(str, str2, (String) null, str3, str4, z);
    }

    public void showInputPopup(String str, String str2, String str3, String str4, String str5) {
        logDebug("showInputPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        String str6 = str3;
        if (str6 == null) {
            str6 = VariableScope.nullOrMissingString;
        }
        if (VariableScope.nullOrMissingString.equals(str6)) {
            this.guiEngine.m5327k();
        }
        this.libRocket.m5314a(str, str2, str6, str4, str5, true);
    }

    public void showInputPopupNonClose(String str, String str2, String str3, String str4, String str5) {
        logDebug("showInputPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        String str6 = str3;
        if (str6 == null) {
            str6 = VariableScope.nullOrMissingString;
        }
        if (VariableScope.nullOrMissingString.equals(str6)) {
            this.guiEngine.m5327k();
        }
        this.libRocket.m5315a(str, str2, str6, str4, str5, true, false);
    }

    public ElementDocument getPopup() {
        return this.libRocket.m5308c();
    }

    public ElementDocument getAlertOrPopup() {
        return this.libRocket.m5303e();
    }

    public boolean closePopup() {
        return this.libRocket.m5300h();
    }

    public boolean closePopupOnly() {
        return this.libRocket.m5298j();
    }

    public boolean closeAlertOnly() {
        return this.libRocket.m5299i();
    }

    public String getPopupText() {
        return this.libRocket.m5297k();
    }

    public void showHostOptions() {
        this.libRocket.m5314a("Host game", m5296i("menus.hostgame.info_pc"), (String) null, "Host Private:closePopup();hostStart(false);", "Host Public:closePopup();hostStart(true);", true);
    }

    public void hostStartFromPopup(boolean z) {
        ElementDocument m5301g = this.libRocket.m5301g();
        Element elementById = m5301g.getElementById("password");
        String str = null;
        if (elementById == null) {
            logWarn("hostStartFromPopup: password==null");
        } else {
            String value = elementById.getValue();
            if (value != null && !value.trim().equals(VariableScope.nullOrMissingString)) {
                str = value;
            }
        }
        boolean checkbox = m5301g.getElementById("useMods").getCheckbox();
        closePopup();
        hostStartWithPasswordAndMods(z, str, checkbox);
    }

    public void hostStart(boolean z) {
        LoggerMaybe.m990b("old version of hostStart");
        hostStartWithPassword(z, null);
    }

    public void hostStartWithPassword(boolean z, String str) {
        LoggerMaybe.m990b("old version of hostStartWithPassword");
        hostStartWithPasswordAndMods(z, str, true);
    }

    public void hostStartWithPasswordAndMods(boolean z, String str, boolean z2) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6122bX.m1493b("starting new");
        m1079A.f6122bX.f5481n = str;
        m1079A.f6122bX.f5482o = z2;
        m1079A.f6122bX.f5484q = z;
        if (m1079A.f6122bX.m1490b(false)) {
            logDebug("-Hosting-");
            logDebug("using password: " + (m1079A.f6122bX.f5481n != null));
            logDebug("using mods: " + (m1079A.f6122bX.f5482o));
            logDebug("public: " + (m1079A.f6122bX.f5484q));
            String m1510av = m1079A.f6122bX.m1510av();
            if (m1510av != null && !C0750a.m2222h(m1510av)) {
                LoggerMaybe.m990b("hostStart: map does not exist: " + m1510av + " reseting");
                m1510av = null;
            }
            if (m1510av == null) {
                m1079A.f6122bX.f5603aO.f5654a = EnumC0846ai.values()[0];
                m1079A.f6122bX.f5604aP = "maps/skirmish/[p8]Many Islands (8p).tmx";
                m1079A.f6122bX.f5603aO.f5655b = "[p8]Many Islands (8p).tmx";
            }
            this.libRocket.setDocument("battleroom.rml", null);
            return;
        }
        logWarn("hosting failed");
    }

    public void exit() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6115bQ.numLoadsSinceRunningGameOrNormalExit != 0) {
            m1079A.f6115bQ.numLoadsSinceRunningGameOrNormalExit = 0;
            m1079A.f6115bQ.save();
        }
        this.scriptEngine.addRunnableToQueue(new RunnableC00593());
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$3.class */
    class RunnableC00593 implements Runnable {
        RunnableC00593() {
        }

        public void run() {
            Root.this.guiEngine.mo304d(true);
        }
    }

    public String getMapDetails(String str) {
        return "hello 123";
    }

    public String getHTMLMapNameFromPath(String str) {
        return htmlString(getMapNameFromPath(str));
    }

    public String getMapNameFromPath(String str) {
        return convertMapName(new File(str).getName());
    }

    public String convertMapName(String str) {
        return C0820a.m1687b(convertMapNameWithoutTranslation(str));
    }

    public String convertMapNameWithoutTranslation(String str) {
        return ActivityC0117i.m5215e(str);
    }

    public String getHTMLMapThumbnail(String str) {
        return escapedString(getMapThumbnail(str));
    }

    public String getMapThumbnail(String str) {
        if (str.startsWith("saves/")) {
        }
        String m5230c = C0090c.m5230c(str);
        String str2 = "thumbnail:assets:" + m5230c;
        if (!C0750a.m2222h(m5230c)) {
            if (LoggerMaybe.f6210aZ) {
                LoggerMaybe.m1038a("getMapThumbnail: Failed to find: " + m5230c);
                return "drawable:error_missingmap.png";
            }
            return "drawable:error_missingmap.png";
        }
        return str2;
    }

    public boolean isMapSkirmish(String str) {
        return ActivityC0117i.m5214f(str);
    }

    public void showLevelOptions() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        String str = (String) this.libRocket.m5310b("mode");
        if (str == null) {
            LoggerMaybe.m965g("levelPath==null");
            return;
        }
        boolean z = true;
        if (!isMapSkirmish(str)) {
            z = false;
        }
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        Iterator it = activeDocument.findElementsByClassName("skirmishOnly").iterator();
        while (it.hasNext()) {
            ((Element) it.next()).show(z);
        }
        Element elementById = activeDocument.getElementById("advancedButton");
        if (elementById != null) {
            elementById.show(z || ActivityC0117i.m5213g(str));
        }
        activeDocument.getElementById("aiDifficulty").setValue(VariableScope.nullOrMissingString + m1079A.f6115bQ.aiDifficulty);
    }

    public void loadConfigAndStartSwitchToAdvanced(String str) {
        LoggerMaybe.m1079A().f6100bv = false;
        loadConfigCommon(str, true);
        _startAdvancedMode(false);
    }

    private void _startAdvancedMode(boolean z) {
        boolean m1587S;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6122bX.m1493b("starting singleplayer");
        m1079A.f6122bX.f5487y = "You";
        m1079A.f6122bX.f5482o = true;
        if (z) {
            m1587S = m1079A.f6122bX.m1588R();
        } else {
            m1587S = m1079A.f6122bX.m1587S();
        }
        if (m1587S) {
            logDebug("started startSinglePlayerServer");
            C0845ah m1469e = m1079A.f6122bX.m1469e();
            if (m1469e != null) {
                m1469e.f5659f = m1079A.f6115bQ.aiDifficulty;
                m1079A.f6122bX.m1564a(m1469e);
            }
            this.libRocket.setDocument("battleroom.rml", null);
            return;
        }
        logWarn("failed startSinglePlayerServer");
    }

    public void loadConfigAndStartNewSandbox(String str) {
        _loadConfigAndStartNewSandboxCommon(str, true);
    }

    public void loadConfigAndStartNewSandboxInAdvanced(String str) {
        LoggerMaybe.LogDebug2("loadConfigAndStartNewSandboxInAdvanced");
        _loadConfigAndStartNewSandboxCommon(str, false);
        _startAdvancedMode(true);
        LoggerMaybe.LogDebug2("editorMode:" + LoggerMaybe.m1079A().f6100bv);
    }

    private void _loadConfigAndStartNewSandboxCommon(String str, boolean z) {
        if (str.startsWith("saves/")) {
            LoggerMaybe.LogDebug2("Starting sandbox from save: " + str);
            loadGame(str.substring("saves/".length()));
        } else {
            LoggerMaybe.LogDebug2("Starting sandbox from map: " + str);
            loadConfigCommon(str, false);
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6110bL.f841E = false;
        m1079A.f6117bS.m1758x();
        m1079A.f6100bv = true;
        if (z) {
            this.guiEngine.m5330e();
        }
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigAndStartNew(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6100bv = false;
        m1079A.f6122bX.m1493b("starting singleplayer");
        loadConfigCommon(str, false);
        this.guiEngine.m5330e();
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigCommon(String str, boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        m1079A.f6115bQ.aiDifficulty = activeDocument.getElementById("aiDifficulty").getValueAsInt(0).intValue();
        m1079A.f6115bQ.save();
        this.guiEngine.m5334b(true);
        this.guiEngine.m5332c(false);
        boolean isMapSkirmish = isMapSkirmish(str);
        int intValue = activeDocument.getElementById("numberOfAIs").getValueAsInt(4).intValue();
        boolean z2 = true;
        int intValue2 = activeDocument.getElementById("aiTeams").getValueAsInt(1).intValue();
        int i = intValue2 - 1;
        if (intValue2 == 5) {
            i = 0;
            z2 = false;
        }
        ActivityC0117i.m5217a(str, isMapSkirmish, intValue, i, z2, z);
    }

    public void showMapPopup(String str, String str2) {
        ElementDocument m5318a = this.libRocket.m5318a("levelSelect.rml", (Object) str, "Map Select", false);
        if (m5318a != null) {
            m5318a.setMetadata("mapClickFunction", str2);
            Iterator it = m5318a.findElementsByClassName("noStyleInPopup").iterator();
            while (it.hasNext()) {
                ((Element) it.next()).setAttribute("class", VariableScope.nullOrMissingString);
            }
            if (showMapsWithDoc(m5318a)) {
                LoggerMaybe.LogDebug2("showMapsWithDoc passed");
                this.libRocket.m5300h();
                this.libRocket.m5322a(m5318a);
            }
        }
    }

    public void refreshAfterFileImport() {
        LoggerMaybe.LogDebug2("refreshAfterFileImport");
        LoggerMaybe.m1079A().f6124bZ.m1653k();
        this.libRocket.reloadDocument();
    }

    public boolean showMaps() {
        return showMapsWithDoc(this.libRocket.m5302f());
    }

    public boolean showMapsWithDoc(ElementDocument elementDocument) {
        String[] m1669a;
        String[] strArr;
        String str;
        String str2;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        LoggerMaybe.LogDebug2("showMaps");
        if (elementDocument == null) {
            LoggerMaybe.LogDebug2("showMaps: elementDocument==null");
            return false;
        }
        Element elementById = elementDocument.getElementById("mapTemplateHolder");
        Element elementById2 = elementDocument.getElementById("mapHolder");
        String innerRML = elementById.getInnerRML();
        String str3 = VariableScope.nullOrMissingString;
        String str4 = (String) elementDocument.getMetadata("mode");
        String str5 = (String) elementDocument.getMetadata("mapClickFunction");
        boolean equals = str4.equals("saves");
        boolean equals2 = str4.equals("replays");
        boolean startsWith = str4.startsWith("/SD/");
        if (equals) {
            m1669a = ActivityC0118j.m5211l();
            if (m1669a == null) {
                m1079A.m1037a("No saves", 1);
                return false;
            }
        } else if (equals2) {
            m1669a = ActivityC0131q.m5182l();
            if (!m1079A.f6115bQ.saveMultiplayerReplays) {
                alert("Note: Multiplayer replay recordings are not turned on. You can enable them in the settings.");
            }
            if (m1669a == null) {
                if (m1079A.f6115bQ.saveMultiplayerReplays) {
                    m1079A.m1037a("No replays yet", 1);
                    return false;
                }
                return false;
            }
        } else {
            m1669a = m1079A.f6124bZ.m1669a(C0750a.m2239a(str4, true), str4);
            if (m1669a == null) {
                m1079A.m1037a("Could not find folder: " + C0750a.m2226e(str4), 1);
                return false;
            }
        }
        String str6 = str4 + "/";
        int i = 0;
        for (String str7 : m1669a) {
            String convertMapName = convertMapName(str7);
            boolean m5218a = ActivityC0117i.m5218a(str7, str6 + str7);
            String str8 = convertMapName + VariableScope.nullOrMissingString;
            if (m1079A.f6228ar && !m5218a) {
                str8 = "[LOCKED] " + str8;
            }
            String replace = innerRML.replace("_NAME_", htmlString(str8));
            if (equals) {
                str = "loadGame(" + escapedString(str7) + ")";
                str2 = "loadGameEdit(" + escapedString(str7) + ")";
            } else if (equals2) {
                str = "loadReplay(" + escapedString(str7) + ")";
                str2 = "loadReplayEdit(" + escapedString(str7) + ")";
            } else {
                str = "open('levelOptions.rml', " + escapedString(str6 + str7) + ")";
                str2 = VariableScope.nullOrMissingString;
            }
            if (str5 != null) {
                str = str5 + "(" + escapedString(str6 + str7) + ")";
                str2 = VariableScope.nullOrMissingString;
            }
            String replace2 = replace.replace("_ONCLICK_", str).replace("_ONCLICKEDIT_", str2);
            String str9 = "thumbnail:assets:";
            int i2 = 18;
            if (startsWith) {
                i2 = 2;
            }
            if (i > i2) {
                str9 = "lazy:" + str9;
            }
            String m5230c = C0090c.m5230c(str6 + str7);
            if (LoggerMaybe.f6210aZ) {
            }
            String str10 = str9 + m5230c;
            if (!C0750a.m2222h(m5230c)) {
                if (LoggerMaybe.f6210aZ) {
                    LoggerMaybe.m1038a("List: Failed to find: " + m5230c + " after converting:" + m5230c + " ( " + str10 + " )");
                }
                str10 = "drawable:error_missingmap.png";
            }
            if (equals || equals2) {
                str10 = VariableScope.nullOrMissingString;
            }
            i++;
            str3 = str3 + replace2.replace("_IMG_", htmlString(str10));
        }
        elementById2.setInnerRML(str3);
        elementById2.loadCharsetIfNeeded(str3);
        if (equals || equals2) {
            elementById2.addClass("savesOnly");
        } else {
            elementById2.addClass("notSavesOnly");
        }
        if (startsWith && str5 == null && LoggerMaybe.m1003at()) {
            elementDocument.addClass("showImportButton");
            return true;
        }
        return true;
    }

    public void convertTextOnPage() {
        LoggerMaybe.m1079A();
        logDebug("convertTextOnPage");
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (isMobile()) {
            activeDocument.addClass("mobile");
        }
        if (this.libRocket.getHeight() < 800) {
            activeDocument.addClass("smallScreen");
        }
        convertTextStopwatch.m2379a();
        Iterator it = activeDocument.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            int numAttributes = element.getNumAttributes();
            for (int i = 0; i < numAttributes; i++) {
                String attributeKey = element.getAttributeKey(i);
                String attributeValue = element.getAttributeValue(i);
                if (attributeKey != null) {
                    if (attributeKey.equals("nestedclone") && !attributeValue.equalsIgnoreCase("false")) {
                        LoggerMaybe.LogDebug2("nested clone:" + element.getId());
                        element.setAttribute(attributeKey, "false");
                        Element m5348clone = element.m5348clone();
                        element.prependChild(m5348clone);
                        m5348clone.removeReference();
                    } else if (attributeKey.equals("childclone") && !attributeValue.equalsIgnoreCase("false")) {
                        element.setAttribute(attributeKey, "false");
                        if (element.getNumChildren() < 1) {
                            LoggerMaybe.LogDebug2("child clone failed no children:" + element.getId());
                        }
                        Element m5348clone2 = element.getChild(0).m5348clone();
                        m5348clone2.addClass("clone");
                        element.prependChild(m5348clone2);
                        m5348clone2.removeReference();
                    } else {
                        String m5304d = this.libRocket.m5304d(attributeValue);
                        if (m5304d != null) {
                            LoggerMaybe.LogDebug2("convertTextOnPage:" + attributeKey + ": '" + attributeValue + "' to '" + m5304d + "'");
                            if (attributeKey.equals("_html")) {
                                LoggerMaybe.LogDebug2("setting html:" + attributeKey);
                                element.setInnerRML(m5304d);
                            } else {
                                if (attributeKey.startsWith("_")) {
                                    attributeKey = attributeKey.substring("_".length());
                                    LoggerMaybe.LogDebug2("converted key to:" + attributeKey);
                                }
                                element.setAttribute(attributeKey, m5304d);
                            }
                        }
                    }
                }
            }
            if (activeDocument.translatedToUnicode) {
                String tagName = element.getTagName();
                if (tagName.equals("p") || tagName.startsWith("h") || tagName.startsWith("label") || tagName.startsWith("button") || tagName.startsWith("select")) {
                    element.loadCharsetIfNeededWithCurrentText();
                }
            }
        }
        convertTextStopwatch.m2376d();
    }

    public void keyBindingPopup_apply(boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ElementDocument m5308c = this.libRocket.m5308c();
        if (m5308c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        String[] split = ((String) m5308c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        C0639ad c0639ad = (C0639ad) m1079A.f6118bT.f4145al.get(parseInt);
        if (!z) {
            Object metadata = m5308c.getMetadata("lastKeyPressed");
            if (metadata == null) {
                logWarn("keyBindingPopup_apply: no last key entered");
                return;
            }
            int intValue = ((Integer) metadata).intValue();
            int i = 0;
            Object metadata2 = m5308c.getMetadata("lastKeyModifiersPressed");
            if (metadata2 != null) {
                i = ((Integer) metadata2).intValue();
            }
            c0639ad.m2688a(intValue, parseInt2, i, true);
        } else {
            c0639ad.m2688a(0, parseInt2, 0, true);
        }
        showKeyBinding();
        closePopup();
    }

    public void keyBindingPopup_onKeydown(int i) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ElementDocument m5308c = this.libRocket.m5308c();
        if (m5308c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = m5308c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        int mo301h = this.guiEngine.mo301h();
        String str = VariableScope.nullOrMissingString + LoggerMaybe.m960j(mo301h);
        if (i == 111) {
        }
        if (i == 0) {
            logWarn("keyBindingPopup_onKeydown: skipping keycode 0");
        } else if (!m1079A.m962i(i)) {
            m5308c.setMetadata("lastKeyPressed", Integer.valueOf(i));
            m5308c.setMetadata("lastKeyModifiersPressed", Integer.valueOf(mo301h));
            String str2 = str + SlickToAndroidKeycodes.m732a(i);
            keyBindingPopup_apply(false);
        } else {
            elementById.setText("Key: " + str);
        }
    }

    public void showKeyBindingPopup() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ElementDocument m5308c = this.libRocket.m5308c();
        if (m5308c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = m5308c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        String[] split = ((String) m5308c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        Integer.parseInt(split[1]);
        C0639ad c0639ad = (C0639ad) m1079A.f6118bT.f4145al.get(parseInt);
        elementById.setText("Press a key..");
    }

    public String getKeyBindingAction(int i, C0639ad c0639ad, int i2) {
        return "createAndShowPopup('settingsKeyBindingSet.rml', " + escapedString(i + ":" + i2) + ", " + escapedString(c0639ad.f4149a) + "); showKeyBindingPopup();";
    }

    public void backWarnIfOverlappingKeyBinding() {
        if (((Boolean) this.libRocket.getActiveDocument().getMetadata("hasOverlappingKeys", false)).booleanValue()) {
            showPopupWithButtons(null, "One or more keys are overlapping and have been highlighted in red. These can cause problems.", false, new C0051e("Ignore", new RunnableC00604()), new C0051e("Fix", new RunnableC00615()));
        } else {
            back();
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$4.class */
    class RunnableC00604 implements Runnable {
        RunnableC00604() {
        }

        public void run() {
            Root.this.closePopup();
            Root.this.back();
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$5.class */
    class RunnableC00615 implements Runnable {
        RunnableC00615() {
        }

        public void run() {
            Root.this.closePopup();
        }
    }

    public void showKeyBinding() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        activeDocument.setMetadata("event_onkeydown", "keyBindingPopup_onKeydown");
        TableData tableData = new TableData();
        ArrayList arrayList = tableData.rows;
        ArrayList arrayList2 = m1079A.f6118bT.f4145al;
        boolean z = false;
        for (int i = 0; i < arrayList2.size(); i++) {
            C0639ad c0639ad = (C0639ad) arrayList2.get(i);
            if (c0639ad.f4150b) {
                TableRow tableRow = new TableRow();
                tableRow.addCell(c0639ad.f4149a);
                if (c0639ad.mo2678d()) {
                    tableRow.addClass("rowHeader");
                } else {
                    for (int i2 = 0; i2 <= 1; i2++) {
                        boolean m2697a = m1079A.f6118bT.m2697a(c0639ad, i2);
                        TableCell addCell = tableRow.addCell(c0639ad.m2683b(i2));
                        addCell.setLibrocketOnClick(getKeyBindingAction(i, c0639ad, i2));
                        if (m2697a) {
                            addCell.color = -65536;
                            z = true;
                        }
                    }
                }
                arrayList.add(tableRow);
            }
        }
        activeDocument.setMetadata("hasOverlappingKeys", Boolean.valueOf(z));
        refreshTable("keysDiv", tableData);
    }

    public void loadSettings() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        loadSettingsStopwatch.m2379a();
        logDebug("loadSettings");
        Iterator it = this.libRocket.getActiveElementById("body").getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.getAttribute("data-settings") != null) {
                String id = element.getId();
                String attribute = element.getAttribute("type", "unknown");
                String valueDynamic = m1079A.f6115bQ.getValueDynamic(id);
                if (attribute.equals("checkbox")) {
                    if (Boolean.parseBoolean(valueDynamic)) {
                        element.setAttribute("checked", VariableScope.nullOrMissingString);
                    } else {
                        element.setAttribute("checked", null);
                    }
                } else {
                    element.setAttribute("value", valueDynamic);
                }
            }
        }
        loadSettingsStopwatch.m2376d();
    }

    public void applyResolution() {
        this.guiEngine.mo303f();
    }

    public void updateRenderScaleInSettings(boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        Element activeElementById = this.libRocket.getActiveElementById("uiRenderScale");
        if (activeElementById == null) {
            logDebug("updateRenderScaleInSettings: uiRenderScale==null");
            return;
        }
        Float valueAsFloat = activeElementById.getValueAsFloat(Float.valueOf(1.0f));
        this.libRocket.getActiveElementById("uiRenderScaleDisplay").compareAndSetText("x" + C0758f.m2112b(valueAsFloat.floatValue() + 0.01f, 1));
        if (z) {
            float f = m1079A.f6115bQ.uiRenderScale;
            m1079A.f6115bQ.uiRenderScale = valueAsFloat.floatValue();
            try {
                applyResolution();
                m1079A.f6115bQ.uiRenderScale = f;
            } catch (Throwable th) {
                m1079A.f6115bQ.uiRenderScale = f;
                throw th;
            }
        }
    }

    public void closeSettings() {
        applyResolution();
    }

    public void saveSettings() {
        String attribute;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        logDebug("saveSettings");
        Iterator it = this.libRocket.getActiveElementById("body").getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.getAttribute("data-settings") != null) {
                String id = element.getId();
                if (element.getAttribute("type", "unknown").equals("checkbox")) {
                    String attribute2 = element.getAttribute("checked");
                    if (attribute2 == null || "false".equals(attribute2)) {
                        attribute = "false";
                    } else {
                        attribute = "true";
                    }
                } else {
                    attribute = element.getAttribute("value");
                }
                try {
                    m1079A.f6115bQ.setValueDynamic(id, attribute);
                } catch (NumberFormatException e) {
                    alert("Error:" + e.getMessage());
                }
            }
        }
        this.guiEngine.mo303f();
        C0894j.m1239a();
        C0820a.m1682e();
        this.guiEngine.mo302g();
    }

    public String hideStyle(boolean z) {
        if (z) {
            return VariableScope.nullOrMissingString;
        }
        return "display:none;";
    }

    public String hideIf(boolean z) {
        return hideClass(!z);
    }

    public String hideUnless(boolean z) {
        return hideClass(z);
    }

    public String hideClass(boolean z) {
        if (z) {
            return VariableScope.nullOrMissingString;
        }
        return "hide";
    }

    public String hideIfMobile() {
        if (LoggerMaybe.m1003at()) {
            return "hide";
        }
        return VariableScope.nullOrMissingString;
    }

    public boolean canResume() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A != null && m1079A.f6242bG && !m1079A.f6243bH) {
            return true;
        }
        return false;
    }

    public boolean isMobile() {
        return LoggerMaybe.m1003at();
    }

    public boolean isIOS() {
        return LoggerMaybe.f6210aZ;
    }

    public boolean isDesktop() {
        return LoggerMaybe.m1002au();
    }

    public boolean isMac() {
        return C0191i.f1219c;
    }

    public boolean hasModSupport() {
        return !LoggerMaybe.f6210aZ;
    }

    public boolean usingMods() {
        if (!LoggerMaybe.f6210aZ || LoggerMaybe.m1079A().f6124bZ.m1666c() > 0) {
            return true;
        }
        return false;
    }

    public boolean hasWorkshopSupport() {
        return LoggerMaybe.m1002au();
    }

    public boolean hasReloadSupport() {
        return !LoggerMaybe.f6210aZ;
    }

    String restrictedString(String str) {
        if (str == null) {
            return null;
        }
        return "'" + str.replace("'", ".").replace("\"", ".").replace("(", ".").replace(")", ".").replace(",", ".").replace("<", ".").replace(">", ".") + "'";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String escapedString(String str) {
        return "'" + str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("'", "&apos;").replace("\"", "&quot;").replace("${", "$ {") + "'";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String htmlString(String str) {
        return VariableScope.nullOrMissingString + str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("${", "$ {") + VariableScope.nullOrMissingString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String htmlStringWithNewlines(String str) {
        return VariableScope.nullOrMissingString + htmlString(str).replace("\n", "<br/>") + VariableScope.nullOrMissingString;
    }

    public void checkServerListScroll() {
        Element activeElementById = this.libRocket.getActiveElementById("serverScrollDiv");
        if (activeElementById == null) {
            logWarn("serverScrollDiv==null");
            return;
        }
        Boolean bool = (Boolean) this.libRocket.m5310b("showFullServerList");
        if (bool == null) {
            bool = false;
        }
        if (!bool.booleanValue() && activeElementById.getScrollTop() > 200.0f) {
            this.libRocket.getActiveDocument().setMetadata("showFullServerList", true);
            this.scriptEngine.addScriptToQueue("displayServerList()");
        }
    }

    public void refreshServerList() {
        refreshServerListRaw("serverListData", "serverRowTemplateHolder", "refreshButton");
    }

    public void displayServerList() {
        displayServerListRaw("serverListData", "serverRowTemplateHolder", "refreshButton");
    }

    public void refreshServerListRaw(String str, String str2, String str3) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refreshing");
        }
        RunnableC00626 runnableC00626 = new RunnableC00626(str, str2, str3);
        m1079A.f6122bX.f5613bx = null;
        C0879n.m1264a(runnableC00626);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Root$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$6.class */
    public class RunnableC00626 implements Runnable {
        final /* synthetic */ String val$serverListDataId;
        final /* synthetic */ String val$serverRowTemplateId;
        final /* synthetic */ String val$refreshButton;

        RunnableC00626(String str, String str2, String str3) {
            this.val$serverListDataId = str;
            this.val$serverRowTemplateId = str2;
            this.val$refreshButton = str3;
        }

        public void run() {
            Root.this.scriptEngine.addScriptToQueue("displayServerListRaw(" + Root.this.restrictedString(this.val$serverListDataId) + "," + Root.this.restrictedString(this.val$serverRowTemplateId) + "," + Root.this.restrictedString(this.val$refreshButton) + ")");
        }
    }

    public void displayServerListRaw(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        Element activeElementById = this.libRocket.getActiveElementById(str);
        Element activeElementById2 = this.libRocket.getActiveElementById(str2);
        if (activeElementById == null) {
            LoggerMaybe.m990b("serverListData is null, we may have changed page");
            return;
        }
        ArrayList m5186m = ActivityC0129p.m5186m();
        this.lastSortedDiscoveredServers = m5186m;
        String m1689a = C0820a.m1689a("menus.lobby.gameState.battleroom", new Object[0]);
        String m1689a2 = C0820a.m1689a("menus.lobby.gameState.ingame", new Object[0]);
        String m1689a3 = C0820a.m1689a("menus.lobby.gameState.chat", new Object[0]);
        if (activeElementById.getNumChildren() > m5186m.size()) {
            for (int numChildren = activeElementById.getNumChildren() - 1; numChildren >= m5186m.size(); numChildren--) {
                LoggerMaybe.LogDebug2("removing rowIndex:" + numChildren);
                activeElementById.removeChild(activeElementById.getChild(numChildren));
            }
            if (activeElementById.getNumChildren() != m5186m.size()) {
                LoggerMaybe.m990b("-- Non matching size after clean up:" + activeElementById.getNumChildren() + " vs " + m5186m.size());
            }
        }
        Boolean bool = (Boolean) this.libRocket.m5310b("showFullServerList");
        if (bool == null) {
            bool = false;
        }
        int i = 0;
        if (!bool.booleanValue() && m5186m.size() > 50) {
            ArrayList arrayList = new ArrayList();
            Iterator it = m5186m.iterator();
            while (it.hasNext()) {
                arrayList.add((C0872g) it.next());
                if (arrayList.size() > 50) {
                    break;
                }
            }
            i = m5186m.size() - arrayList.size();
            m5186m = arrayList;
        }
        int i2 = 0;
        Iterator it2 = m5186m.iterator();
        while (it2.hasNext()) {
            C0872g c0872g = (C0872g) it2.next();
            Element element = null;
            if (i2 < activeElementById.getNumChildren()) {
                element = activeElementById.getChild(i2);
            }
            if (element != null && element.hasClassName("serverRowMessage")) {
                LoggerMaybe.LogDebug2("removing non rowIndex:" + i2);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element != null && element.findByClassName("rState") == null) {
                LoggerMaybe.LogDebug2("removing non rowIndex with no rState:" + i2);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element == null) {
                element = activeElementById2.m5348clone();
                activeElementById.appendChild(element);
                element.removeReference();
                element.setAttribute("onclick", "clickedServerRow(" + i2 + ")");
            }
            String str7 = c0872g.f5840s;
            if (str7 != null) {
                str7 = str7.replace("battleroom", m1689a).replace("ingame", m1689a2).replace("chat", m1689a3);
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            if (c0872g != null && c0872g.f5843x) {
                z = true;
                if ("chat".equalsIgnoreCase(c0872g.f5840s)) {
                    z2 = true;
                }
                if (c0872g.m1312d()) {
                    z4 = true;
                }
            }
            int m5538a = Color.m5538a(255, 255, 255, 255);
            String str8 = "serverRow serverRowData realServerRow ";
            if (c0872g != null) {
                if (z) {
                    str8 = str8 + "dedicatedServerRow ";
                    if (z2 || z4) {
                        m5538a = Color.m5538a(255, 152, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_DIGITAL, 249);
                        str8 = str8 + "chatRow ";
                    }
                } else {
                    if (c0872g.f5830h) {
                        m5538a = Color.m5538a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
                        str8 = str8 + "openRow ";
                    }
                    if (c0872g.f5823a) {
                        m5538a = Color.m5538a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL, 149, 35);
                        str8 = str8 + "lanRow ";
                    }
                }
                if (c0872g.m1315a()) {
                    str8 = str8 + "lastConnectedRow ";
                }
                if (!z2 && !z4 && !(VariableScope.nullOrMissingString + m1079A.m980c(true)).equals(c0872g.f5831j)) {
                    z3 = true;
                }
            }
            String str9 = VariableScope.nullOrMissingString + "color:" + C0758f.m2046h(m5538a) + ";";
            if (0 != 0) {
                String str10 = str9 + "font-weight: bold;";
                str8 = str8 + "boldRow ";
            }
            element.compareAndSetClassNames(str8);
            element.findByClassName("rState").compareAndSetText(str7);
            element.findByClassName("rHost").compareAndSetText(C0758f.m2128a(c0872g.f5835n, 15));
            if (c0872g.f5841t == "?") {
                str4 = "?";
            } else {
                str4 = c0872g.f5841t + "\\" + c0872g.f5842u;
            }
            element.findByClassName("rPlayers").compareAndSetText(C0758f.m2128a(str4, 15));
            String m2128a = C0758f.m2128a(ActivityC0117i.m5215e(c0872g.f5838q), 40);
            if (m2128a == null) {
                m2128a = VariableScope.nullOrMissingString;
            }
            element.findByClassName("rMap").compareAndSetText(m2128a);
            if ("ANY".equalsIgnoreCase(c0872g.f5832k)) {
                str5 = c0872g.f5832k;
            } else {
                str5 = "v" + C0758f.m2128a(c0872g.f5832k, 8);
            }
            Element findByClassName = element.findByClassName("rVersion");
            findByClassName.compareAndSetText(str5);
            String str11 = "cell rVersion ";
            if (z3) {
                String str12 = "color:" + C0758f.m2046h(Color.m5538a(255, 155, 147, 147)) + ";";
                str11 = str11 + "nonMatchingRow ";
            } else {
                String str13 = "color:" + C0758f.m2046h(m5538a) + ";";
            }
            findByClassName.compareAndSetClassNames(str11);
            if (c0872g.f5830h) {
                if (c0872g.f5834m) {
                    str6 = "P";
                } else {
                    str6 = "Y";
                }
            } else {
                str6 = "N";
            }
            if (c0872g.f5823a) {
                str6 = "L";
            }
            Element findByClassName2 = element.findByClassName("rOpen");
            findByClassName2.compareAndSetText(str6);
            String str14 = "cell rOpen ";
            if (!c0872g.f5830h && !c0872g.f5823a) {
                String str15 = "color:" + C0758f.m2046h(Color.m5538a(255, 155, 147, 147)) + ";";
                str14 = str14 + "notOpenRow ";
            } else {
                String str16 = "color:" + C0758f.m2046h(m5538a) + ";";
            }
            findByClassName2.compareAndSetClassNames(str14);
            i2++;
        }
        if (m5186m.size() == 0 && m1079A.f6122bX.f5613bx != null) {
            String str17 = "ERROR: " + m1079A.f6122bX.f5613bx;
            Element m5348clone = activeElementById2.m5348clone();
            activeElementById.appendChild(m5348clone);
            m5348clone.removeReference();
            m5348clone.setText(str17);
        }
        Element activeElementById3 = this.libRocket.getActiveElementById("padding");
        if (activeElementById3 == null && i > 0) {
            activeElementById3 = activeElementById2.m5348clone();
            activeElementById.appendChild(activeElementById3);
            activeElementById3.removeReference();
            activeElementById3.setAttribute("id", "padding");
            activeElementById3.addClass("serverRowMessage");
        }
        if (activeElementById3 != null && i > 0) {
            activeElementById3.setStyle("height:" + (18 * i) + "px;");
        }
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refresh");
        }
        LoggerMaybe.m990b("DONE");
    }

    public void clickedServerRow(int i) {
        clickedServer(((C0872g) this.lastSortedDiscoveredServers.get(i)).f5824b);
    }

    public void clickedServer(String str) {
        String str2;
        if (getAlertOrPopup() != null) {
            logWarn("clickedServer: getAlertOrPopup!=null");
            return;
        }
        try {
            C0872g m1251b = C0879n.m1251b(str);
            if (m1251b == null) {
                logWarn("clickedServer: server==null");
                alert("That server no longer exists");
                return;
            }
            String m1314b = m1251b.m1314b();
            if (m1251b.m1312d()) {
                str2 = "[onenter]Open Link:closePopup(); openWhitelistedLink(" + restrictedString(m1251b.m1313c()) + ");";
            } else if (!m1251b.f5823a) {
                str2 = "[onenter]Join:closePopup(); joinServerWithId(" + restrictedString(m1251b.m1311e()) + "," + restrictedString(m1251b.f5824b) + ");";
            } else {
                str2 = "[onenter]Join over LAN:closePopup(); joinServerWithId(" + restrictedString(m1251b.m1310f()) + "," + restrictedString(m1251b.f5824b) + ");";
            }
            showPopup(null, m1314b, true, str2, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void hideKeyboard() {
        this.guiEngine.m5326l();
    }

    public void saveGame(String str) {
        closePopup();
        hideKeyboard();
        LoggerMaybe.m1079A().f6125ca.m424b(str.replace(".", "_").replace("/", "_").replace("\\", "_"), false);
    }

    public void exportMap(String str) {
        closePopup();
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        try {
            m1079A.f6110bL.m4921b(m1079A.f6165dk, "/SD/rusted_warfare_maps/" + str.replace(".", "_").replace("/", "_").replace("\\", "_").replace("|", "_").replace("?", "_") + ".tmx");
            showAlert("Map exported");
        } catch (C0179f e) {
            showAlert("Failed to export map. error: " + e.getMessage());
        } catch (IOException e2) {
            showAlert("Failed to export map. IO error: " + e2.getMessage());
        }
    }

    public void loadGame(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6122bX.m1493b("loading new save");
        m1079A.f6100bv = false;
        if (m1079A.f6125ca.m422c(str, false)) {
            resumeNonMenu();
        }
    }

    public void loadGameEdit(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0051e c0051e = null;
        if (C0913a.m1086b()) {
            c0051e = new C0051e("Share", new RunnableC00637(m1079A, str));
        }
        showPopupWithButtons(null, str, true, c0051e, new C0051e("Delete", new RunnableC00648(m1079A, str)));
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$7.class */
    class RunnableC00637 implements Runnable {
        final /* synthetic */ LoggerMaybe val$game;
        final /* synthetic */ String val$saveName;

        RunnableC00637(LoggerMaybe loggerMaybe, String str) {
            this.val$game = loggerMaybe;
            this.val$saveName = str;
        }

        public void run() {
            Root.this.closePopup();
            C0913a.m1087a(this.val$game.f6125ca.m428a(this.val$saveName, false));
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$8.class */
    class RunnableC00648 implements Runnable {
        final /* synthetic */ LoggerMaybe val$game;
        final /* synthetic */ String val$saveName;

        RunnableC00648(LoggerMaybe loggerMaybe, String str) {
            this.val$game = loggerMaybe;
            this.val$saveName = str;
        }

        public void run() {
            this.val$game.f6125ca.m425b(this.val$saveName);
            Root.this.closePopup();
            Root.this.showMaps();
        }
    }

    public void loadReplay(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6100bv = false;
        if (m1079A.f6126cb.m2420c(str)) {
            resumeNonMenu();
        }
    }

    public void loadReplayEdit(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0051e c0051e = null;
        if (C0913a.m1086b()) {
            c0051e = new C0051e("Share", new RunnableC00659(m1079A, str));
        }
        showPopupWithButtons(null, str, true, c0051e, new C0051e("Delete", new RunnableC005610(m1079A, str)));
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$9.class */
    class RunnableC00659 implements Runnable {
        final /* synthetic */ LoggerMaybe val$game;
        final /* synthetic */ String val$replayName;

        RunnableC00659(LoggerMaybe loggerMaybe, String str) {
            this.val$game = loggerMaybe;
            this.val$replayName = str;
        }

        public void run() {
            Root.this.closePopup();
            C0913a.m1087a(this.val$game.f6126cb.m2426a(this.val$replayName, false));
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$10.class */
    class RunnableC005610 implements Runnable {
        final /* synthetic */ LoggerMaybe val$game;
        final /* synthetic */ String val$replayName;

        RunnableC005610(LoggerMaybe loggerMaybe, String str) {
            this.val$game = loggerMaybe;
            this.val$replayName = str;
        }

        public void run() {
            this.val$game.f6126cb.m2416e(this.val$replayName);
            Root.this.closePopup();
            Root.this.showMaps();
        }
    }

    public void makeSaveGamePopup(String str) {
        String str2;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (str == null) {
            str2 = (m1079A.m1012ak() + " (" + C0758f.m2130a("d MMM yyyy HH-mm-ss") + ")").replace("  ", " ");
        } else {
            str2 = str;
        }
        showInputPopup("Save Game", "Enter a name to save the game under", str2, "[onenter]Save:saveGame(getPopupText())", null);
    }

    public void makeExportMapGamePopup(String str) {
        String str2;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (str == null) {
            str2 = ("New " + m1079A.m1012ak() + " - " + C0758f.m2130a("d MMM yyyy")).replace("  ", " ");
        } else {
            str2 = str;
        }
        showInputPopup("Export Map", "Enter a name to export the map as", str2, "[onenter]Export:exportMap(getPopupText())", null);
    }

    public void makeSendMessagePopup() {
        LoggerMaybe.m1079A();
        showInputPopup("Send Message", VariableScope.nullOrMissingString, VariableScope.nullOrMissingString, "[onenter]Send: sendChatMessage(getPopupText()); closePopup();", "Switch - Team only: makeSendTeamMessagePopupWithDefaultText(getPopupText()); ");
    }

    public void makeSendTeamMessagePopup() {
        makeSendTeamMessagePopupWithDefaultText(VariableScope.nullOrMissingString);
    }

    public void makeSendTeamMessagePopupWithDefaultText(String str) {
        LoggerMaybe.m1079A();
        showInputPopup("Send Team Message", VariableScope.nullOrMissingString, str, "[onenter]Send Team:sendTeamChatMessage(getPopupText()); closePopup();", "+ Ping Map:sendTeamChatMessageAndPing(getPopupText()); closePopup();");
    }

    public void sendChatMessage(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        this.guiEngine.m5326l();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        m1079A.f6122bX.m1431m(str);
        m1079A.f6117bS.f5126p = false;
    }

    public void sendTeamChatMessageAndPing(String str) {
        sendTeamChatMessage(str);
        LoggerMaybe.m1079A().f6117bS.m1872H();
    }

    public void sendTeamChatMessage(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        this.guiEngine.m5326l();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        m1079A.f6122bX.m1433l(str);
    }

    public void receiveChatMessage(int i, String str, String str2, Steam steam) {
        refreshChat();
    }

    public void refreshChat() {
        Element activeElementById;
        Element activeElementById2;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (this.libRocket.getActiveDocument() == null || (activeElementById = this.libRocket.getActiveElementById("chatLogHistory")) == null) {
            return;
        }
        boolean attributeBoolean = activeElementById.getAttributeBoolean("reversed", false);
        if (m1079A.f6122bX.f5571F && (activeElementById2 = this.libRocket.getActiveElementById("chatBox")) != null) {
            activeElementById2.hide();
        }
        activeElementById.setInnerRML(VariableScope.nullOrMissingString);
        ConcurrentLinkedQueue m1615b = m1079A.f6122bX.f5605aS.m1615b();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = m1615b.iterator();
        while (it.hasNext()) {
            C0866b c0866b = (C0866b) it.next();
            if (attributeBoolean) {
                stringBuffer.insert(0, "<div>" + c0866b.m1347b() + "</div>");
            } else {
                stringBuffer.append("<div>" + c0866b.m1347b() + "</div>");
            }
        }
        stringBuffer.append("<div id='chatLastRowSpacer'></div>");
        activeElementById.setInnerRML(stringBuffer.toString());
        activeElementById.loadCharsetIfNeededWithCurrentText();
        Element activeElementById3 = this.libRocket.getActiveElementById("chatLastRowSpacer");
        if (activeElementById3 != null) {
            activeElementById3.scrollIntoView(false);
        }
    }

    public void trace(String str) {
        LoggerMaybe.LogDebug2("Trace:" + str);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$TableData.class */
    public class TableData {
        public ArrayList rows = new ArrayList();

        public boolean same(TableData tableData, boolean z) {
            if (this.rows.size() != tableData.rows.size()) {
                return false;
            }
            for (int i = 0; i < this.rows.size(); i++) {
                if (!((TableRow) this.rows.get(i)).same((TableRow) tableData.rows.get(i), z)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$TableRow.class */
    public class TableRow {
        public ArrayList tableCells = new ArrayList();
        public Runnable androidOnclick;
        public String librocketOnClick;
        public String extraClasses;

        public void addClass(String str) {
            if (this.extraClasses == null) {
                this.extraClasses = str;
            } else {
                this.extraClasses += " " + str;
            }
        }

        public TableCell addCell(String str) {
            TableCell tableCell = new TableCell(str);
            this.tableCells.add(tableCell);
            return tableCell;
        }

        public void setLibrocketOnClick(String str) {
            this.librocketOnClick = str;
        }

        public void setAndroidOnClick(Runnable runnable) {
            this.androidOnclick = runnable;
        }

        public boolean same(TableRow tableRow, boolean z) {
            if (!C0758f.m2061e(this.librocketOnClick, tableRow.librocketOnClick) || !C0758f.m2061e(this.extraClasses, tableRow.extraClasses) || this.tableCells.size() != tableRow.tableCells.size()) {
                return false;
            }
            for (int i = 0; i < this.tableCells.size(); i++) {
                if (!((TableCell) this.tableCells.get(i)).same((TableCell) tableRow.tableCells.get(i), z)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$TableCell.class */
    public class TableCell {
        public String text;
        public String classes;
        public String librocketOnClick;
        public Integer color;

        public void setLibrocketOnClick(String str) {
            this.librocketOnClick = str;
        }

        public TableCell(String str) {
            this.text = str;
        }

        public void addClass(String str) {
            if (this.classes != null) {
                this.classes += " " + str;
            } else {
                this.classes = str;
            }
        }

        public boolean same(TableCell tableCell, boolean z) {
            if (!C0758f.m2061e(this.classes, tableCell.classes) || !C0758f.m2061e(this.librocketOnClick, tableCell.librocketOnClick) || !C0758f.m2131a(this.color, tableCell.color)) {
                return false;
            }
            if (!z && !C0758f.m2061e(this.text, tableCell.text)) {
                return false;
            }
            return true;
        }
    }

    public void updateTableTextOnly(String str, TableData tableData, TableData tableData2) {
        ArrayList arrayList = tableData.rows;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            LoggerMaybe.m990b("updateTableText: tableElement:" + str + " is null, we may have changed page");
            return;
        }
        Element elementById = activeElementById.getElementById("tableListData");
        for (int i = 0; i < arrayList.size(); i++) {
            TableRow tableRow = (TableRow) arrayList.get(i);
            for (int i2 = 0; i2 < tableRow.tableCells.size(); i2++) {
                TableCell tableCell = (TableCell) tableRow.tableCells.get(i2);
                Element child = elementById.getChild(i);
                if (child == null) {
                    LoggerMaybe.m990b("updateTableText failed to get row " + i);
                    return;
                }
                Element child2 = child.getChild(i2);
                if (child2 == null) {
                    LoggerMaybe.m990b("updateTableText failed to get cell " + i2);
                    return;
                }
                child2.compareAndSetText(tableCell.text);
            }
        }
    }

    public void refreshTable(String str, TableData tableData) {
        ArrayList arrayList = tableData.rows;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            LoggerMaybe.m990b("refreshTable: tableElement:" + str + " is null, we may have changed page");
            return;
        }
        Element elementById = activeElementById.getElementById("tableRowTemplateHolder");
        Element elementById2 = activeElementById.getElementById("tableListData");
        Element child = elementById.findByClassName("rowTemplate").getChild(0);
        Element child2 = elementById.findByClassName("cellTemplate").getChild(0);
        elementById2.setInnerRML(VariableScope.nullOrMissingString);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TableRow tableRow = (TableRow) it.next();
            Element cloneAndFix = child.cloneAndFix();
            if (tableRow.librocketOnClick != null) {
                cloneAndFix.setAttribute("onclick", tableRow.librocketOnClick);
            }
            if (tableRow.extraClasses != null) {
                cloneAndFix.addClass(tableRow.extraClasses);
            }
            Iterator it2 = tableRow.tableCells.iterator();
            while (it2.hasNext()) {
                TableCell tableCell = (TableCell) it2.next();
                Element cloneAndFix2 = child2.cloneAndFix();
                cloneAndFix2.compareAndSetText(tableCell.text);
                if (tableCell.librocketOnClick != null) {
                    cloneAndFix2.setAttribute("onclick", tableCell.librocketOnClick);
                    cloneAndFix2.addClass("clickablecell");
                }
                if (tableCell.classes != null) {
                    cloneAndFix2.addClass(tableCell.classes);
                }
                if (tableCell.color != null) {
                    cloneAndFix2.setAttribute("style", "color:" + C0758f.m2046h(tableCell.color.intValue()) + ";");
                }
                cloneAndFix.appendChild(cloneAndFix2);
                cloneAndFix2.removeReference();
            }
            elementById2.appendChild(cloneAndFix);
            cloneAndFix.removeReference();
        }
    }

    public ElementDocument createAndShowPopup(String str, Object obj, String str2) {
        return this.libRocket.m5318a(str, obj, str2, true);
    }

    public ElementDocument createPopupHidden(String str, Object obj, String str2) {
        return this.libRocket.m5318a(str, obj, str2, false);
    }

    public boolean tryToShowPopupDocument(ElementDocument elementDocument) {
        return this.libRocket.m5312b(elementDocument);
    }

    public void showMainMenu() {
        LoggerMaybe.m1079A().f6117bS.f5126p = false;
        AbstractC0043a.m5342a().m5336b();
    }

    public void onEnter() {
        ElementDocument m5301g = this.libRocket.m5301g();
        if (m5301g == null) {
            LoggerMaybe.LogDebug2("onEnter: elementDocument==null");
            return;
        }
        Iterator it = m5301g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String attribute = element.getAttribute("onenter");
            if (attribute != null && element.isFocused()) {
                this.scriptEngine.processScript(attribute);
            }
        }
    }

    public void scrollFromFocusedElement(float f) {
        ElementDocument m5301g = this.libRocket.m5301g();
        if (m5301g == null) {
            LoggerMaybe.LogDebug2("onEnter: elementDocument==null");
            return;
        }
        Element topLevelFocusedElement = m5301g.getTopLevelFocusedElement();
        if (topLevelFocusedElement == null) {
            LoggerMaybe.LogDebug2("focusedElement: Not found");
            return;
        }
        ArrayList chainFromChildElement = m5301g.getChainFromChildElement(topLevelFocusedElement);
        if (chainFromChildElement == null) {
            LoggerMaybe.LogDebug2("scrollFromFocusedElement: Failed to find chain");
            return;
        }
        Iterator it = chainFromChildElement.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            boolean z = false;
            if ("scrollDiv".equals(element.getId())) {
                z = true;
            }
            if (element.hasClassName("slider")) {
                z = true;
            }
            if (z) {
                element.setScrollTop(element.getScrollTop() + f);
                return;
            }
        }
        LoggerMaybe.LogDebug2("Found no slider element to offset");
    }

    public boolean isSliderOrUIElementSelected() {
        ElementDocument m5301g = this.libRocket.m5301g();
        if (m5301g == null) {
            LoggerMaybe.LogDebug2("onEnter: elementDocument==null");
            return false;
        }
        Element topLevelFocusedElement = m5301g.getTopLevelFocusedElement();
        if (topLevelFocusedElement != null) {
            String tagName = topLevelFocusedElement.getTagName();
            boolean z = false;
            if ("scrollDiv".equals(topLevelFocusedElement.getId())) {
                z = true;
            }
            if (topLevelFocusedElement.hasClassName("slider")) {
                z = true;
            }
            if ("input".equals(tagName) && "range".equals(topLevelFocusedElement.getAttribute("type", "text"))) {
                z = true;
            }
            if (z) {
                LoggerMaybe.LogDebug2("Slider element: true");
                return true;
            }
            LoggerMaybe.LogDebug2("Slider element: false");
        }
        LoggerMaybe.LogDebug2("Slider element: no element focused");
        return false;
    }

    public void onTouch() {
        ElementDocument m5301g = this.libRocket.m5301g();
        if (m5301g == null) {
            LoggerMaybe.LogDebug2("onEnter: elementDocument==null");
            return;
        }
        Iterator it = m5301g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if ("text".equals(element.getAttribute("type")) && element.isFocused()) {
                this.guiEngine.m5327k();
            }
        }
    }

    public void onEscape() {
        ElementDocument m5301g = this.libRocket.m5301g();
        if (m5301g == null) {
            LoggerMaybe.LogDebug2("onEscape: elementDocument==null");
            return;
        }
        boolean z = false;
        Iterator it = m5301g.getAllNestedChildren().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Element element = (Element) it.next();
            if (element.getAttribute("click_on_escape") != null) {
                element.click();
                z = true;
                break;
            }
        }
        if (!z && closePopup()) {
        }
    }

    public void askQuitGame() {
        closePopup();
        showPopup("Are you sure you want to quit?", VariableScope.nullOrMissingString, true, "[onenter]Quit:closePopup(); exit();", null);
    }

    public String getCurrentDocumentPath() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            return null;
        }
        return activeDocument.documentPath;
    }

    public String getCurrentPopupPath() {
        ElementDocument m5308c = this.libRocket.m5308c();
        if (m5308c == null) {
            return null;
        }
        return m5308c.documentPath;
    }

    public String getCreditsText() {
        return "Credits goes here";
    }

    public void runRunnable(Runnable runnable) {
        logDebug("runRunnable");
        if (runnable == null) {
            logDebug("runnable==null");
        }
        runnable.run();
    }

    public boolean isLinux() {
        return C0819g.m1695a() == EnumC0822h.f5408c;
    }

    public boolean not(boolean z) {
        return !z;
    }

    public boolean and(boolean z, boolean z2) {
        return z && z2;
    }

    /* renamed from: or */
    public boolean m5295or(boolean z, boolean z2) {
        return z || z2;
    }

    public void showBattleroom() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = true;
        if (activeDocument != null && "battleroom.rml".equals(activeDocument.documentPath)) {
            LoggerMaybe.LogDebug2("Already on battleroom page");
            z = false;
        }
        this.libRocket.setDocument("battleroom.rml", null, z);
    }

    public void setDocument(String str) {
        this.libRocket.setDocument(str);
    }

    public void playNextMusicTrack() {
        LoggerMaybe.m1079A().f6112bN.m2657e();
    }

    public void toggleMusic() {
        LoggerMaybe.m1079A().f6112bN.f4175u = !LoggerMaybe.m1079A().f6112bN.f4175u;
    }

    public void updateMusicButton(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById != null) {
            if (LoggerMaybe.m1079A().f6112bN.f4175u) {
                activeElementById.setText(">");
            } else {
                activeElementById.setText("||");
            }
        }
    }

    public void setSandboxMapFromPopup(String str) {
        LoggerMaybe.m1079A();
        closePopup();
        this.libRocket.getActiveDocument().setMetadata("mode", str);
        showLevelOptions();
        this.libRocket.getActiveDocument().findByClassName("mapImage").setAttribute("src", getMapThumbnail(str));
        this.libRocket.getActiveDocument().findByClassName("mapText").setText(getMapNameFromPath(str));
    }

    public void showSandboxMapSelectOnChange() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        int parseInt = Integer.parseInt(activeDocument.getElementById("typeSelector").getValue());
        int intValue = ((Integer) activeDocument.getMetadata("lastTypeSelector", 0)).intValue();
        this.libRocket.getActiveDocument().setMetadata("lastTypeSelector", Integer.valueOf(parseInt));
        if (parseInt != intValue) {
            showSandboxMapSelect();
        }
    }

    public void showSandboxMapSelect() {
        showMapPopup(getModeMapPath(this.libRocket.getActiveDocument(), "typeSelector"), "setSandboxMapFromPopup");
    }

    public String getModeMapPath(Element element, String str) {
        int intValue;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (str == null) {
            if (m1079A.f6122bX.f5603aO.f5654a == null) {
                LoggerMaybe.m990b("getModeMapPath: currentType==0");
                intValue = 0;
            } else {
                intValue = m1079A.f6122bX.f5603aO.f5654a.ordinal();
            }
        } else {
            Element elementById = element.getElementById(str);
            if (elementById == null) {
                LoggerMaybe.m965g("getModeMapPath: typeSelector==null");
                intValue = 0;
            } else {
                intValue = elementById.getValueAsInt(0).intValue();
            }
        }
        if (intValue == 0) {
            return "maps/skirmish";
        }
        if (intValue == 1) {
            return "/SD/rusted_warfare_maps";
        }
        if (intValue == 2) {
            return "saves";
        }
        throw new RuntimeException("Unknown typeIndex:" + intValue);
    }

    public void event_unicodeEntered() {
        ElementDocument m5301g = this.libRocket.m5301g();
        if (m5301g != null) {
            Element findByClassName = m5301g.findByClassName("textinputUnicodeWrap");
            if (findByClassName != null) {
                findByClassName.compareAndAddClass("unicodeWasTyped");
                return;
            } else {
                LoggerMaybe.LogDebug2("event_unicodeEntered: missing textinput");
                return;
            }
        }
        LoggerMaybe.LogDebug2("event_unicodeEntered: missing document");
    }

    public boolean isVersionBeta() {
        return LoggerMaybe.m1079A().m953m();
    }

    public Object ifCondition(boolean z, Object obj, Object obj2) {
        return z ? obj : obj2;
    }

    /* renamed from: i */
    public String m5296i(String str) {
        return C0820a.m1689a(str, new Object[0]);
    }

    public void openLinkToCG(String str) {
        openWhitelistedLink("http://corrodinggames.com/" + str);
    }

    public void openWhitelistedLink(String str) {
        LoggerMaybe.LogDebug2("Opening link:" + str);
        if (!str.startsWith("http://corrodinggames.com/") && !str.startsWith("https://corrodinggames.com/") && !str.startsWith("http://corrodinggames.net/") && !str.startsWith("https://corrodinggames.net/")) {
            LoggerMaybe.LogDebug2("Not in whitelist");
        } else if (this.guiEngine.m5335b(str)) {
            alert("Opened link: " + str);
        } else {
            alert("Sorry couldn't load browser to: " + str + " please navigate manually");
        }
    }

    public void writeGameLog(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        LinkedList m5328j = AbstractC0043a.m5342a().m5328j();
        if (m5328j == null) {
            z = true;
        } else {
            synchronized (m5328j) {
                ListIterator listIterator = m5328j.listIterator(C0758f.m2105b(0, m5328j.size() - 3000));
                while (listIterator.hasNext()) {
                    stringBuffer.append(Element.excapeHTML((String) listIterator.next()));
                    stringBuffer.append("<br/>");
                }
            }
        }
        if (z) {
            alert("Internal game logging not active");
            return;
        }
        LoggerMaybe.LogDebug2("writeGameLog ready");
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            LoggerMaybe.LogDebug2("Failed to find: " + str);
        } else {
            activeElementById.setInnerRML(stringBuffer.toString());
        }
    }

    public void exportGameLog() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        LinkedList m5328j = AbstractC0043a.m5342a().m5328j();
        if (m5328j == null) {
            z = true;
        } else {
            synchronized (m5328j) {
                ListIterator listIterator = m5328j.listIterator(C0758f.m2105b(0, m5328j.size() - 3000));
                while (listIterator.hasNext()) {
                    stringBuffer.append(Element.excapeHTML((String) listIterator.next()));
                    stringBuffer.append("\n");
                }
            }
        }
        if (z) {
            alert("Internal game logging not active");
            return;
        }
        try {
            File file = new File(C0750a.m2226e("/SD/rustedWarfare/RustedWarfareLog-" + C0758f.m2130a("d_MMM_yyyy_HH.mm.ss") + ".txt"));
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append((CharSequence) stringBuffer.toString());
            fileWriter.flush();
            fileWriter.close();
            C0913a.m1087a(file);
            file.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            alert("Failed to export logs: " + e.getMessage());
        }
    }

    public void setPageMinWidthAndHeight(float f, float f2) {
        LoggerMaybe.LogDebug2("setPageMinWidthAndHeight(" + f + ", " + f2 + ")");
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            LoggerMaybe.LogDebug2("setPageMinWidthAndHeight - no page");
            return;
        }
        activeDocument.setMetadataFloat("minWidth", Float.valueOf(f));
        activeDocument.setMetadataFloat("minHeight", Float.valueOf(f2));
        this.guiEngine.m5325m();
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$11.class */
    class C005711 extends AbstractC0914b {
        C005711() {
        }

        public void onFileSelected() {
            LoggerMaybe.LogDebug2("importFilePopup: onFileSelected");
        }

        public void onCancelled() {
            LoggerMaybe.LogDebug2("importFilePopup: onCancelled");
        }
    }

    public void importFilePopup() {
        C0913a.m1088a(new C005711());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setDocumentUpdate(ElementDocument elementDocument, Runnable runnable) {
        elementDocument.setMetadata("onUpdateFunction", runnable);
    }

    public void onFrameUpdate(float f) {
        Object metadata;
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument != null && (metadata = activeDocument.getMetadata("onUpdateFunction")) != null) {
            ((Runnable) metadata).run();
        }
    }
}
