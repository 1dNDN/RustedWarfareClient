package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Mods.class */
public class Mods extends ScriptContext {
    Root root;
    Runnable updateModsRunnable = new RunnableC00531();
    int checkWorkshopSkip = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Mods(Root root) {
        this.root = root;
    }

    public C1058a getSteam() {
        C1058a m739a = C1058a.m739a();
        if (!m739a.m738e()) {
            m739a.m737h();
            return null;
        }
        return m739a;
    }

    public void openWorkshop() {
        LoggerMaybe.m1079A();
        C1058a steam = getSteam();
        if (steam == null) {
            return;
        }
        steam.mo280m();
    }

    public void uploadModAsk(String str) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.m953m()) {
            this.root.showAlert("Workshop uploading is disabled in BETA versions to ensure compatibility for others. Please test and upload this mod with a released version or wait till beta finishes.");
        } else if (m1079A.f6124bZ.m1665c(str) == null) {
            this.root.showAlert("Could not find mod:" + str);
        } else if (getSteam() == null) {
        } else {
            this.root.showPopup("Are you sure you want to upload to the workshop?", VariableScope.nullOrMissingString, true, "[onenter]Upload:closePopup(); mods.uploadMod('" + str + "');", null);
        }
    }

    public void uploadMod(String str) {
        C0824b m1665c = LoggerMaybe.m1079A().f6124bZ.m1665c(str);
        if (m1665c == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        C1058a steam = getSteam();
        if (steam == null) {
            return;
        }
        if (m1665c.f5427k == 0) {
            steam.mo291b(m1665c);
        } else {
            steam.mo295a(m1665c, false, "Changes.");
        }
    }

    public void viewMod(String str) {
        C0824b m1665c = LoggerMaybe.m1079A().f6124bZ.m1665c(str);
        if (m1665c == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        C1058a steam = getSteam();
        if (steam == null) {
            return;
        }
        steam.mo296a(m1665c);
    }

    public void deleteModPopup(String str) {
        C0824b m1665c = LoggerMaybe.m1079A().f6124bZ.m1665c(str);
        if (m1665c == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        this.root.showPopup(VariableScope.nullOrMissingString, "Are you sure you want to permanently delete '" + m1665c.m1644b() + "'? (Note: You can instead disable the mod by unticking it)", true, "[onenter]Delete:closePopup(); mods.deleteMod('" + str + "');", null);
    }

    public void deleteMod(String str) {
        C0824b m1665c = LoggerMaybe.m1079A().f6124bZ.m1665c(str);
        if (m1665c == null) {
            this.root.showAlert("Could not find mod:" + str);
        } else if (m1665c.m1623u()) {
            reloadModData();
        } else {
            this.root.showAlert("Error failed to delete mod");
        }
    }

    public void setModFilter(String str) {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            LoggerMaybe.LogDebug2("loadMods: No Active Document");
            return;
        }
        activeDocument.setMetadata("modFilter", str);
        applyModFilter();
    }

    public void applyModFilter() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            LoggerMaybe.LogDebug2("loadMods: No Active Document");
            return;
        }
        String str = (String) activeDocument.getMetadata("modFilter");
        Element elementById = activeDocument.getElementById("modList");
        if (elementById == null) {
            LoggerMaybe.LogDebug2("loadMods: Failed to find modList, wrong page?");
            return;
        }
        boolean checkbox = activeDocument.getElementById("onlyEnabledMods").getCheckbox();
        ArrayList findElementsByClassName = elementById.findElementsByClassName("modItem");
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            str = null;
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT).trim();
        }
        int i = 0;
        int i2 = 0;
        Iterator it = findElementsByClassName.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            boolean z = false;
            int intValue = C0758f.m2037l(element.getAttribute("data_sessionid")).intValue();
            C0824b m1679a = m1079A.f6124bZ.m1679a(intValue);
            if (m1679a == null) {
                LoggerMaybe.LogDebug2("Could not find mod with mod session id: " + intValue);
            } else {
                if (str != null) {
                    boolean z2 = false;
                    if (m1679a.m1649a() != null && m1679a.m1649a().toLowerCase(Locale.ROOT).contains(str)) {
                        z2 = true;
                    }
                    if (m1679a.m1639e() != null && m1679a.m1639e().toLowerCase(Locale.ROOT).contains(str)) {
                        z2 = true;
                    }
                    if (!z2) {
                        z = true;
                    }
                }
                if (checkbox && m1679a.f5422f) {
                    z = true;
                }
            }
            if (z) {
                i++;
                element.compareAndAddClass("modItemFilteredOut");
            } else {
                i2++;
                element.removeClass("modItemFilteredOut");
            }
        }
        String str2 = VariableScope.nullOrMissingString;
        if (i > 0 && i2 == 0) {
            str2 = "< No mods found with active filter (" + i + " hidden) >";
        } else if (i > 0) {
            str2 = "< " + i + " mods hidden with active filter >";
        }
        activeDocument.getElementById("filterStatus").setText(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Mods$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Mods$1.class */
    public class RunnableC00531 implements Runnable {
        RunnableC00531() {
        }

        public void run() {
            Mods.this.updateMods();
        }
    }

    public void updateMods() {
        this.checkWorkshopSkip++;
        if (this.checkWorkshopSkip > 100) {
            this.checkWorkshopSkip = 0;
            C1058a m739a = C1058a.m739a();
            if (m739a != null) {
                m739a.mo282k();
            }
        }
    }

    public void refreshModList() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            LoggerMaybe.LogDebug2("refreshModList: No Active Document");
            return;
        }
        LoggerMaybe.LogDebug2("refreshModList");
        if (activeDocument.getElementById("modTemplate") == null) {
            LoggerMaybe.LogDebug2("refreshModList: Failed to find modTemplate, wrong page?");
            return;
        }
        LoggerMaybe.m1079A().f6124bZ.m1664d();
        _rememberTempModSelection();
        loadMods();
        _restoreTempModSelection();
    }

    public void loadMods() {
        ArrayList m1653k = LoggerMaybe.m1079A().f6124bZ.m1653k();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            LoggerMaybe.LogDebug2("loadMods: No Active Document");
            return;
        }
        LoggerMaybe.LogDebug2("loadMods");
        Element elementById = activeDocument.getElementById("modTemplate");
        Element elementById2 = activeDocument.getElementById("modList");
        if (elementById == null) {
            LoggerMaybe.LogDebug2("loadMods: Failed to find modTemplate, wrong page?");
        } else if (elementById2 == null) {
            LoggerMaybe.LogDebug2("loadMods: Failed to find modList, wrong page?");
        } else {
            this.root.setDocumentUpdate(activeDocument, this.updateModsRunnable);
            String innerRML = elementById.getInnerRML();
            String str = VariableScope.nullOrMissingString;
            int i = 0;
            Iterator it = m1653k.iterator();
            while (it.hasNext()) {
                C0824b c0824b = (C0824b) it.next();
                String m1649a = c0824b.m1649a();
                String str2 = VariableScope.nullOrMissingString;
                String replace = innerRML.replace("_NAME_", this.root.htmlString(m1649a)).replace("_ID_", c0824b.f5421e);
                String str3 = c0824b.f5460R;
                if (str3 == null) {
                    str3 = VariableScope.nullOrMissingString;
                } else {
                    str2 = str2 + " modItemError";
                }
                if (c0824b.m1622v()) {
                    str2 = str2 + " modItemCanBeDeleted";
                }
                if (c0824b.f5427k == 0) {
                    if (!c0824b.f5441y && !c0824b.f5442z) {
                        str2 = str2 + " modItemCanBePublished";
                    }
                } else {
                    if (!c0824b.f5441y) {
                        str2 = str2 + " modItemIsOwner";
                    }
                    str2 = str2 + " modItemIsPublished";
                }
                if (c0824b.f5443A) {
                    str2 = str2 + " modItemHasMaps";
                }
                String m1632l = c0824b.m1632l();
                if (m1632l == null) {
                    m1632l = VariableScope.nullOrMissingString;
                }
                i++;
                str = str + replace.replace("_ERROR_", this.root.htmlString(str3)).replace("_MESSAGE_", this.root.htmlStringWithNewlines(m1632l)).replace("_DESCRIPTION_", this.root.htmlString(c0824b.m1639e())).replace("_CLASS_", str2).replace("_SESSIONID_", VariableScope.nullOrMissingString + c0824b.m1640d());
            }
            elementById2.setInnerRML(str);
            elementById2.loadCharsetIfNeeded(str);
            Iterator it2 = m1653k.iterator();
            while (it2.hasNext()) {
                C0824b c0824b2 = (C0824b) it2.next();
                Element elementById3 = activeDocument.getElementById(c0824b2.f5421e);
                if (elementById3 == null) {
                    LoggerMaybe.m990b("Could not find:" + c0824b2.f5419c);
                } else {
                    elementById3.setCheckbox(!c0824b2.f5422f);
                }
            }
            applyModFilter();
        }
    }

    public void saveMods() {
        _saveModsCommon(true);
    }

    private void _rememberTempModSelection() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        LoggerMaybe.LogDebug2("temp save");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (!id.equals("_ID_")) {
                C0824b m1665c = m1079A.f6124bZ.m1665c(id);
                if (m1665c == null) {
                    LoggerMaybe.m1038a("Could not find mod:" + element.getInnerRML());
                } else {
                    boolean z = !element.getCheckbox();
                    if (m1665c.f5423g != z) {
                    }
                    m1665c.f5423g = z;
                    m1665c.f5424h = true;
                }
            }
        }
    }

    private void _restoreTempModSelection() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        LoggerMaybe.LogDebug2("temp restore");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (id != null && !id.equals(VariableScope.nullOrMissingString) && !id.equals("_ID_")) {
                C0824b m1665c = m1079A.f6124bZ.m1665c(id);
                if (m1665c == null) {
                    LoggerMaybe.m1038a("Could not find mod:" + element.getInnerRML() + " id:" + id);
                } else if (m1665c.f5424h) {
                    if (m1665c.f5423g != (!element.getCheckbox())) {
                        element.setCheckbox(!m1665c.f5423g);
                    }
                }
            }
        }
    }

    private void _saveModsCommon(boolean z) {
        boolean z2 = false;
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        LoggerMaybe.LogDebug2("savesMods");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (!id.equals("_ID_")) {
                C0824b m1665c = m1079A.f6124bZ.m1665c(id);
                if (m1665c == null) {
                    this.root.showAlert("Could not find mod:" + element.getInnerRML());
                } else {
                    boolean z3 = !element.getCheckbox();
                    if (m1665c.f5422f != z3) {
                        z2 = true;
                    }
                    m1665c.f5422f = z3;
                    m1665c.f5423g = z3;
                }
            }
        }
        if (z2) {
            LoggerMaybe.LogDebug2("mod changes made");
        } else {
            LoggerMaybe.LogDebug2("no mod changes made");
        }
        m1079A.f6124bZ.m1662e();
        m1079A.f6115bQ.save();
        if (z) {
            _saveModsMessages(false);
        }
    }

    private void _saveModsMessages(boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int m1671a = m1079A.f6124bZ.m1671a(false);
        int m1668b = m1079A.f6124bZ.m1668b();
        if (m1079A.f6122bX.lock1) {
            LoggerMaybe.LogDebug2("savesMods: in network game");
            this.root.showAlert("You are currently in a network game, changes will be checked and applied on next game");
        } else if (C0348af.m4047c(true)) {
            if (m1671a == 0) {
                this.root.showAlert("Mod changes saved. Will be used in the next game.");
            } else if (z) {
                String str = "Note: " + m1671a + " selected mods are still not loaded after reload";
                if (m1668b > 0) {
                    str = "Warning: " + m1668b + " selected mods had errors after reload";
                }
                this.root.showAlert(str);
            } else {
                String str2 = "Mod selection saved. But " + m1671a + " mod(s) aren't loaded. Load them now?";
                if (!m1079A.m1072H()) {
                    str2 = str2 + " (This will end your current game).";
                }
                this.root.showPopup("Reload needed", str2, true, "[onenter]Reload:closePopup(); mods.reloadModData();", null);
            }
        } else {
            LoggerMaybe.LogDebug2("Errors found");
        }
    }

    public void disableAllAsk() {
        this.root.showPopup("Disable all mods?", VariableScope.nullOrMissingString, true, "[onenter]Disable All:closePopup(); mods.disableAll();", null);
    }

    public void disableAll() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6124bZ.m1658g();
        m1079A.f6124bZ.m1662e();
        m1079A.f6115bQ.save();
        m1079A.f6124bZ.m1652l();
        loadMods();
    }

    public void reloadModDataAsk() {
        if (LoggerMaybe.m1079A().m1072H()) {
            LoggerMaybe.LogDebug2("Menu active, reloading without asking");
            reloadModData();
            return;
        }
        this.root.showPopup("Reload all mod data?", VariableScope.nullOrMissingString + "Warning! this will end your current game.", true, "[onenter]Reload:closePopup(); mods.reloadModData();", null);
    }

    public void reloadModData() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        _saveModsCommon(false);
        m1079A.f6124bZ.m1652l();
        _saveModsMessages(true);
        loadMods();
    }
}
