package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.ActivityC0118j;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0845ah;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0852al;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Multiplayer.class */
public class Multiplayer extends ScriptContext {
    Root root;
    String[] currentDropdownRawArray;
    Root.TableData lastPlayerTable;
    boolean useMapDropdown = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Multiplayer(Root root) {
        this.root = root;
    }

    void updateMapDropdown(Element element, String str, String str2) {
        String[] strArr;
        String[] strArr2;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        int intValue = element.getElementById(str2).getValueAsInt(0).intValue();
        this.currentDropdownRawArray = null;
        ArrayList arrayList = new ArrayList();
        if (intValue == 0) {
            this.currentDropdownRawArray = C0750a.m2239a("maps/skirmish", true);
            Arrays.sort(this.currentDropdownRawArray);
            for (String str3 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0117i.m5215e(str3));
            }
        } else if (intValue == 1) {
            this.currentDropdownRawArray = C0750a.m2239a("/SD/rusted_warfare_maps", true);
            if (this.currentDropdownRawArray == null) {
                m1079A.m1037a("Could not find folder: /SD/rusted_warfare_maps", 1);
                this.currentDropdownRawArray = new String[0];
            }
            Arrays.sort(this.currentDropdownRawArray);
            for (String str4 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0117i.m5215e(str4));
            }
        } else if (intValue == 2) {
            this.currentDropdownRawArray = ActivityC0118j.m5211l();
            if (this.currentDropdownRawArray == null) {
                m1079A.m1037a("Could not find a save folder on SD card", 1);
                this.currentDropdownRawArray = new String[0];
            }
            for (String str5 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0117i.m5215e(str5));
            }
        } else {
            throw new RuntimeException("Unknown typeIndex:" + intValue);
        }
        String str6 = VariableScope.nullOrMissingString;
        int i = 0;
        int i2 = 1;
        for (String str7 : this.currentDropdownRawArray) {
            i++;
            if (intValue == 0 && str7.equalsIgnoreCase("[p8]Many Islands (8p).tmx")) {
                i2 = i;
            }
        }
        int i3 = 0;
        for (String str8 : this.currentDropdownRawArray) {
            i3++;
            str6 = str6 + generateOption(str8, this.root.convertMapName(str8), i3 == i2) + "\n";
        }
        LoggerMaybe.LogDebug2("mapList:" + str6);
        if (intValue != 2) {
        }
        element.getElementById("mapsSelectorParent").setInnerRML("<p data-workaround='this stops disappearing select'></p><select id='mapsSelector' class='mapsSelector'><option value='0'>...</option></select>");
        getMapDropdown().setInnerRML(str6);
    }

    String generateOption(String str, String str2, boolean z) {
        return generateOption(str, str2, z, null, false);
    }

    String generateOption(String str, String str2, boolean z, Integer num, boolean z2) {
        String str3 = VariableScope.nullOrMissingString;
        if (z) {
            str3 = str3 + " selected='selected'";
        }
        String htmlString = this.root.htmlString(str2);
        String str4 = VariableScope.nullOrMissingString;
        if (num != null) {
            str4 = str4 + " style='color:" + C0758f.m2046h(num.intValue()) + ";'";
        }
        if (z2) {
            str4 = str4 + " class='disabled-option'";
        }
        if (str4 != null && !VariableScope.nullOrMissingString.equals(str4)) {
            htmlString = "<span " + str4 + ">" + htmlString + "</span>";
        }
        return "<option value=" + this.root.escapedString(str) + " " + str3 + ">" + htmlString + "</option>";
    }

    Element getMapDropdown() {
        return this.libRocket.m5308c().findByClassName("mapsSelector");
    }

    String getMapDropdownSelected() {
        return getMapDropdown().getAttribute("value");
    }

    void readInterfaceIntoNetworkSettings() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6122bX.IsServer) {
            String mapDropdownSelected = getMapDropdownSelected();
            if (mapDropdownSelected == null) {
                mapDropdownSelected = "<No Map>";
            }
            m1079A.f6122bX.f5603aO.f5655b = mapDropdownSelected;
            m1079A.f6122bX.f5603aO.f5654a = EnumC0846ai.values()[0];
        }
    }

    public void multiplayerStart() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6122bX.IsServer) {
            if (m1079A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5669a) {
                m1079A.f6122bX.f5604aP = "maps/skirmish/" + m1079A.f6122bX.f5603aO.f5655b;
            } else if (m1079A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5670b) {
                m1079A.f6122bX.f5604aP = "/SD/rusted_warfare_maps/" + m1079A.f6122bX.f5603aO.f5655b;
            } else if (m1079A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5671c) {
                m1079A.f6122bX.f5604aP = null;
            } else {
                this.libRocket.m5306c("Error: No map type selected");
                return;
            }
            if (m1079A.f6122bX.f5603aO.f5655b == null || VariableScope.nullOrMissingString.equals(m1079A.f6122bX.f5603aO.f5655b) || m1079A.f6122bX.f5603aO.f5655b.equals("<No Map>")) {
                this.libRocket.m5306c("Error: No map selected");
            } else {
                m1079A.f6122bX.m1527ae();
            }
        } else if (m1079A.f6122bX.f5495H) {
            m1079A.f6122bX.m1435k("-start");
        } else {
            LoggerMaybe.m989b("startNetButton.setOnClickListener", "Clicked but not server or proxy controller");
        }
    }

    public void battleroomSetup() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        this.lastPlayerTable = null;
        refreshUI();
        this.root.refreshChat();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument != null && m1079A.f6122bX.f5571F) {
            activeDocument.addClass("singlePlayer");
        }
        m1079A.f6122bX.m1513as();
    }

    public void refreshUI() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        Element activeElementById = this.libRocket.getActiveElementById("infoDiv");
        if (activeElementById == null) {
            LoggerMaybe.LogDebug2("refreshUI: infoTextElement==null");
            return;
        }
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = m1079A.f6122bX.IsServer || m1079A.f6122bX.f5495H;
        boolean z2 = m1079A.f6122bX.IsServer;
        boolean z3 = (z || m1079A.f6122bX.f5603aO.f5665m) ? false : true;
        Iterator it = activeDocument.findElementsByClassName("forHostOnly").iterator();
        while (it.hasNext()) {
            ((Element) it.next()).show(z);
        }
        Iterator it2 = activeDocument.findElementsByClassName("forLocalHostOnly").iterator();
        while (it2.hasNext()) {
            ((Element) it2.next()).show(z2);
        }
        Iterator it3 = activeDocument.findElementsByClassName("forUnlockedTeamsNonHost").iterator();
        while (it3.hasNext()) {
            ((Element) it3.next()).show(z3);
        }
        if (m1079A.m1065O()) {
            Iterator it4 = activeDocument.findElementsByClassName("forRealNetworkOnly").iterator();
            while (it4.hasNext()) {
                ((Element) it4.next()).show(false);
            }
        }
        activeElementById.compareAndSetText(m1079A.f6122bX.m1512at());
        String m1510av = m1079A.f6122bX.m1510av();
        if (m1079A.f6122bX.f5603aO.f5654a == EnumC0846ai.f5671c) {
            m1510av = "saves/" + m1079A.f6122bX.f5603aO.f5655b;
        }
        Element activeElementById2 = this.libRocket.getActiveElementById("mapImage");
        if (m1079A.f6122bX.f5566v) {
            activeElementById2.hide();
        }
        String attribute = activeElementById2.getAttribute("src");
        if (m1510av == null) {
            if (!VariableScope.nullOrMissingString.equals(attribute)) {
                activeElementById2.setAttribute("src", VariableScope.nullOrMissingString);
            }
        } else {
            String mapThumbnail = this.root.getMapThumbnail(m1510av);
            if (mapThumbnail == null) {
                mapThumbnail = VariableScope.nullOrMissingString;
            }
            if (!mapThumbnail.equals(attribute)) {
                activeElementById2.setAttribute("src", mapThumbnail);
            }
        }
        refreshPlayerTable();
    }

    public void refreshPlayerTable() {
        Root.TableData playerTable = getPlayerTable();
        if (this.lastPlayerTable != null) {
            if (this.lastPlayerTable.same(playerTable, false)) {
                return;
            }
            if (this.lastPlayerTable.same(playerTable, true)) {
                this.root.updateTableTextOnly("playersDiv", playerTable, this.lastPlayerTable);
                return;
            }
        }
        this.root.refreshTable("playersDiv", playerTable);
        this.lastPlayerTable = playerTable;
    }

    public Root.TableData getPlayerTable() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        Root.TableData tableData = new Root.TableData();
        ArrayList arrayList = tableData.rows;
        int i = -1;
        int i2 = 0;
        ArrayList m4697a = AbstractC0197n.m4697a(true);
        Iterator it = m4697a.iterator();
        while (it.hasNext()) {
            AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
            if (abstractC0197n != null) {
                if (i != -1 && i != abstractC0197n.f1312q) {
                    i2++;
                }
                i = abstractC0197n.f1312q;
            }
        }
        int i3 = -1;
        Iterator it2 = m4697a.iterator();
        while (it2.hasNext()) {
            AbstractC0197n abstractC0197n2 = (AbstractC0197n) it2.next();
            if (abstractC0197n2 != null) {
                if (i3 != -1 && i3 != abstractC0197n2.f1312q && i2 <= 3) {
                    Root.TableRow tableRow = new Root.TableRow();
                    for (int i4 = 0; i4 < 4; i4++) {
                        tableRow.addCell(VariableScope.nullOrMissingString).addClass("spacer");
                    }
                    arrayList.add(tableRow);
                }
                i3 = abstractC0197n2.f1312q;
                String str = "unnamed";
                if (abstractC0197n2.f1316u != null) {
                    str = abstractC0197n2.f1316u;
                }
                String m4625x = abstractC0197n2.m4625x();
                String num = Integer.toString(abstractC0197n2.f1306k + 1);
                boolean m4695b = abstractC0197n2.m4695b();
                if (m4695b) {
                    num = "S";
                }
                if (!m4695b && abstractC0197n2.f1321z != null && abstractC0197n2.f1321z.intValue() != m1079A.f6122bX.f5603aO.f5660g) {
                    num = num + " - " + m1079A.f6122bX.m1476d(abstractC0197n2.f1321z.intValue());
                }
                String m4646h = abstractC0197n2.m4646h();
                Root.TableRow tableRow2 = new Root.TableRow();
                Root.TableCell addCell = tableRow2.addCell(str);
                if (abstractC0197n2.f1323B != null) {
                    addCell.color = Integer.valueOf(AbstractC0197n.m4642i(abstractC0197n2.f1323B.intValue()));
                }
                if (abstractC0197n2 == m1079A.f6122bX.f5489z) {
                    addCell.addClass("boldText");
                }
                tableRow2.addCell(num).color = Integer.valueOf(abstractC0197n2.m4731J());
                tableRow2.addCell(m4646h).color = Integer.valueOf(AbstractC0197n.m4642i(abstractC0197n2.f1312q));
                tableRow2.addCell(m4625x);
                tableRow2.setLibrocketOnClick("mp.showPlayerConfig('" + abstractC0197n2.f1306k + "')");
                arrayList.add(tableRow2);
            }
        }
        if (!m1079A.f6122bX.IsServer && m1079A.f6122bX.ServerUUID == null) {
            arrayList.clear();
            String str2 = "Connecting...";
            if (m1079A.f6122bX.f5606bc.size() == 0) {
                str2 = "Disconnected";
            }
            Root.TableRow tableRow3 = new Root.TableRow();
            tableRow3.addCell(str2);
            tableRow3.addCell(VariableScope.nullOrMissingString);
            tableRow3.addCell(VariableScope.nullOrMissingString);
            tableRow3.addCell(VariableScope.nullOrMissingString);
            arrayList.add(tableRow3);
        }
        return tableData;
    }

    public void showSetTeamsDialog() {
        LoggerMaybe.m1079A();
        if (this.root.createAndShowPopup("battleroom_setTeams.rml", null, "Set Teams") != null) {
        }
    }

    public void showPlayerConfigForSelf() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6122bX.f5489z != null) {
            showPlayerConfig(VariableScope.nullOrMissingString + m1079A.f6122bX.f5489z.f1306k);
        }
    }

    public void showPlayerConfig(String str) {
        LoggerMaybe.m1079A();
        this.scriptEngine.addRunnableToQueue(new RunnableC00541(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Multiplayer$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Multiplayer$1.class */
    public class RunnableC00541 implements Runnable {
        final /* synthetic */ String val$teamIdString;

        RunnableC00541(String str) {
            this.val$teamIdString = str;
        }

        public void run() {
            Multiplayer.this.showPlayerConfigNow(this.val$teamIdString);
        }
    }

    public void showPlayerConfigNow(String str) {
        ElementDocument createAndShowPopup;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        AbstractC0197n m4638k = AbstractC0197n.m4638k(Integer.parseInt(str));
        if (m4638k == null) {
            this.root.logWarn("showPlayerConfig: " + str + "==null");
        } else if ((m1079A.f6122bX.m1509aw() || (m1079A.f6122bX.f5489z == m4638k && !m1079A.f6122bX.f5603aO.f5665m)) && (createAndShowPopup = this.root.createAndShowPopup("battleroom_player.rml", m4638k, m4638k.f1316u)) != null) {
            Element elementById = createAndShowPopup.getElementById("team_id");
            Element elementById2 = createAndShowPopup.getElementById("spawnPoint");
            Element elementById3 = createAndShowPopup.getElementById("allyTeam");
            Element elementById4 = createAndShowPopup.getElementById("aiDifficulty");
            Element elementById5 = createAndShowPopup.getElementById("startingUnits");
            Element elementById6 = createAndShowPopup.getElementById("playerColor");
            Element elementById7 = createAndShowPopup.getElementById("playerOverridesSection");
            Element elementById8 = createAndShowPopup.getElementById("aiDifficultySelection");
            if (!LoggerMaybe.m949o("sd")) {
                setupStartingUnitDropDown(elementById5, true);
                setupPlayerColorDropDown(elementById6, true, true, m4638k);
            } else {
                LoggerMaybe.LogDebug2("sd");
            }
            elementById.setValue(VariableScope.nullOrMissingString + m4638k.f1306k);
            String str2 = VariableScope.nullOrMissingString + (m4638k.f1306k + 1);
            if (m4638k.m4695b()) {
                str2 = "-2";
            }
            elementById2.setValue(str2);
            if (m4638k.f1315t) {
                elementById3.setValue(VariableScope.nullOrMissingString + (m4638k.f1312q + 1));
            } else {
                elementById3.setValue("fromSpawn2");
            }
            if (elementById7 == null) {
                throw new RuntimeException("playerOverridesSection==null");
            }
            if (!m1079A.f6122bX.IsServer) {
                elementById7.hide();
            }
            if (elementById8 == null) {
                throw new RuntimeException("aiDifficultySelection==null");
            }
            if (!LoggerMaybe.m949o("s1")) {
                if (m4638k.f1317v) {
                    if (m4638k.f1320y == null) {
                        elementById4.setValue("-99");
                    } else {
                        elementById4.setValue(VariableScope.nullOrMissingString + m4638k.f1320y);
                    }
                } else {
                    elementById8.hide();
                }
            } else {
                LoggerMaybe.LogDebug2("s1");
            }
            if (!LoggerMaybe.m949o("s2")) {
                if (m4638k.f1321z == null) {
                    elementById5.setValue("-99");
                } else {
                    LoggerMaybe.LogDebug2("startingUnitOverride: " + m4638k.f1321z);
                    elementById5.setValue(VariableScope.nullOrMissingString + m4638k.f1321z);
                }
            } else {
                LoggerMaybe.LogDebug2("s2");
            }
            if (!LoggerMaybe.m949o("s3")) {
                if (m4638k.f1323B == null) {
                    elementById6.setValue("-99");
                    return;
                }
                LoggerMaybe.LogDebug2("playerColor: " + m4638k.f1323B);
                elementById6.setValue(VariableScope.nullOrMissingString + m4638k.f1323B);
                return;
            }
            LoggerMaybe.LogDebug2("s3");
        }
    }

    public void teamsSet_apply() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (!m1079A.f6122bX.IsServer) {
            LoggerMaybe.LogDebug2("Not server");
            return;
        }
        LoggerMaybe.LogDebug2("playerConfig_kick");
        String value = this.libRocket.m5308c().getElementById("teamLayout").getValue();
        if ("2t".equalsIgnoreCase(value)) {
            m1079A.f6122bX.m1563a(EnumC0852al.f5680a);
        } else if ("3t".equalsIgnoreCase(value)) {
            m1079A.f6122bX.m1563a(EnumC0852al.f5681b);
        } else if ("FFA".equalsIgnoreCase(value)) {
            m1079A.f6122bX.m1563a(EnumC0852al.f5682c);
        } else if ("spectators".equalsIgnoreCase(value)) {
            m1079A.f6122bX.m1563a(EnumC0852al.f5683d);
        } else {
            LoggerMaybe.m990b("teamsSet_apply: unknown layout: " + value);
        }
        refreshUI();
    }

    public void playerConfig_kick() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        LoggerMaybe.LogDebug2("playerConfig_kick");
        String value = this.libRocket.m5308c().getElementById("team_id").getValue();
        AbstractC0197n m4638k = AbstractC0197n.m4638k(Integer.parseInt(value));
        if (m4638k == null) {
            this.root.logWarn("playerConfig_kick: " + value + "==null");
        } else {
            m1079A.f6122bX.m1467e(m4638k);
        }
    }

    public void playerConfig_apply() {
        boolean z;
        int i;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        LoggerMaybe.LogDebug2("playerConfig_kick");
        String value = this.libRocket.m5308c().getElementById("team_id").getValue();
        AbstractC0197n m4638k = AbstractC0197n.m4638k(Integer.parseInt(value));
        if (m4638k == null) {
            this.root.logWarn("playerConfig_apply: " + value + "==null");
            return;
        }
        ElementDocument m5308c = this.libRocket.m5308c();
        Element elementById = m5308c.getElementById("spawnPoint");
        Element elementById2 = m5308c.getElementById("allyTeam");
        Element elementById3 = m5308c.getElementById("aiDifficulty");
        Element elementById4 = m5308c.getElementById("startingUnits");
        Element elementById5 = m5308c.getElementById("playerColor");
        String value2 = elementById.getValue();
        String value3 = elementById2.getValue();
        int intValue = Integer.valueOf(value2).intValue() - 1;
        boolean z2 = false;
        if (intValue == -3) {
            z2 = true;
        } else {
            if (intValue < 0) {
                intValue = 1;
            }
            if (intValue > AbstractC0197n.f1365c - 1) {
                intValue = AbstractC0197n.f1365c - 1;
            }
        }
        boolean z3 = false;
        if (z2) {
            i = -3;
            z = true;
        } else if (value3.equals("fromSpawn2")) {
            i = intValue % 2;
            m4638k.f1315t = false;
            z = true;
        } else {
            z = false;
            i = m4638k.f1312q;
            try {
                i = Integer.valueOf(value3).intValue() - 1;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            m4638k.f1315t = true;
        }
        if (m4638k.f1312q != i) {
            if (m1079A.f6122bX.IsServer) {
                z3 = true;
            } else if (m1079A.f6122bX.f5495H || m1079A.f6122bX.f5489z == m4638k) {
                z3 = true;
            } else {
                LoggerMaybe.m989b("row.setOnClickListener", "Clicked but not server or proxy controller");
            }
        }
        try {
            if (m4638k.f1306k != intValue) {
                if (m1079A.f6122bX.IsServer) {
                    z3 = false;
                    m1079A.f6122bX.m1568a(m4638k, intValue);
                    m4638k.f1312q = i;
                } else if (m1079A.f6122bX.f5495H || m1079A.f6122bX.f5489z == m4638k) {
                    z3 = false;
                    int i2 = i;
                    if (z) {
                        i2 = -1;
                    }
                    m1079A.f6122bX.m1567a(m4638k, intValue, Integer.valueOf(i2));
                } else {
                    LoggerMaybe.m989b("row.setOnClickListener", "Clicked but not server or proxy controller");
                }
            }
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
        if (m4638k.f1317v) {
            int intValue2 = elementById3.getValueAsInt(-99).intValue();
            if (intValue2 == -99) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(intValue2);
            }
            if (m4638k.f1320y != valueOf3) {
                if (m1079A.f6122bX.IsServer) {
                    m4638k.f1320y = valueOf3;
                } else {
                    LoggerMaybe.LogDebug2("aiDifficultyOverride: not server or proxy controller");
                }
            }
        }
        int intValue3 = elementById4.getValueAsInt(-99).intValue();
        LoggerMaybe.LogDebug2("startingUnits now: " + intValue3);
        if (intValue3 == -99) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(intValue3);
        }
        if (m4638k.f1321z != valueOf) {
            if (m1079A.f6122bX.IsServer) {
                m4638k.f1321z = valueOf;
            } else {
                LoggerMaybe.LogDebug2("startingUnitOverride: not server or proxy controller");
            }
        }
        int intValue4 = elementById5.getValueAsInt(-99).intValue();
        LoggerMaybe.LogDebug2("playerColor now: " + intValue4);
        if (intValue4 == -99) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(intValue4);
        }
        if (m4638k.f1323B != valueOf2) {
            if (m1079A.f6122bX.IsServer) {
                m4638k.f1323B = valueOf2;
            } else {
                LoggerMaybe.LogDebug2("colorOverride: not server or proxy controller");
            }
        }
        if (z3) {
            if (m1079A.f6122bX.IsServer) {
                m4638k.f1312q = i;
            } else if (z) {
                m1079A.f6122bX.m1501b(m4638k, -1);
            } else {
                m1079A.f6122bX.m1501b(m4638k, i);
            }
        }
        m1079A.f6122bX.m1462f();
        m1079A.f6122bX.m1593M();
        refreshUI();
    }

    public void disconnect(String str) {
        LoggerMaybe.m1079A().f6122bX.m1493b(str);
    }

    public void multiplayerBackPrompt() {
        this.root.showPopup(C0820a.m1689a("menus.ingame.multiplayerClose.title", new Object[0]), "What would you like to do?", true, (C0820a.m1689a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); back();", null);
    }

    public void surrenderPrompt() {
        this.root.showPopup(C0820a.m1689a("menus.ingame.surrender.title", new Object[0]), C0820a.m1689a("menus.ingame.surrender.message", new Object[0]), true, (C0820a.m1689a("menus.ingame.surrender.surrenderButton", new Object[0]) + ":") + "closePopup(); mp.surrender();", null);
    }

    public void surrender() {
        LoggerMaybe.LogDebug2("Surrender requested");
        this.root.sendChatMessage("-surrender");
    }

    public void multiplayerExitPrompt() {
        String m1689a = C0820a.m1689a("menus.ingame.multiplayerClose.titleDisconnect", new Object[0]);
        String m1689a2 = C0820a.m1689a("menus.ingame.multiplayerClose.messageDisconnect", new Object[0]);
        String str = (C0820a.m1689a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); showMainMenu();";
        String str2 = null;
        if (LoggerMaybe.m1079A().f6122bX.IsServer) {
            m1689a = C0820a.m1689a("menus.ingame.multiplayerClose.title", new Object[0]);
            m1689a2 = C0820a.m1689a("menus.ingame.multiplayerClose.messageEndGame", new Object[0]);
            str = (C0820a.m1689a("menus.ingame.exitGame", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); showMainMenu();";
            str2 = (C0820a.m1689a("menus.ingame.multiplayerClose.returnToBattleroom", new Object[0]) + ":") + "closePopup(); mp.sendReturnToBattleroomEvent();";
        }
        this.root.showPopup(m1689a, m1689a2, true, str, str2);
    }

    public void sendReturnToBattleroomEvent() {
        LoggerMaybe.LogDebug2("mp.sendReturnToBattleroomEvent()");
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6122bX.m1525ag();
        m1079A.f6117bS.f5126p = false;
    }

    public void addAI() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6122bX.IsServer) {
            m1079A.f6122bX.m1516ap();
        } else if (m1079A.f6122bX.f5495H) {
            m1079A.f6122bX.m1435k("-addai");
        } else {
            this.root.logWarn("addAI(): Clicked but not server or proxy controller");
        }
    }

    public String _getRandomDefaultPlayerName() {
        return "Unnamed" + C0758f.m2154a(0, 999);
    }

    public void loadUsername() {
        LoggerMaybe.LogDebug2("mp.loadUsername()");
        String str = LoggerMaybe.m1079A().f6115bQ.lastNetworkPlayerName;
        Element activeElementById = this.libRocket.getActiveElementById("username");
        String mo289c = C1058a.m739a().mo289c();
        LoggerMaybe.LogDebug2("steamName:" + mo289c);
        if (mo289c != null && str == null) {
            str = mo289c;
        }
        if (str == null || VariableScope.nullOrMissingString.equals(str)) {
            str = _getRandomDefaultPlayerName();
        }
        activeElementById.loadCharsetIfNeeded(str);
        activeElementById.setAttribute("value", str);
    }

    public void getUsernameFromInterface() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        String valueById = this.root.getValueById("username");
        if (valueById == null) {
            LoggerMaybe.m990b("getUsernameFromInterface: Cannot find username");
            return;
        }
        String trim = valueById.trim();
        LoggerMaybe.LogDebug2("set username:" + trim);
        if (trim.equals(VariableScope.nullOrMissingString)) {
            trim = _getRandomDefaultPlayerName();
        }
        m1079A.f6122bX.m1548a(trim);
    }

    public void gameOptionsGet() {
        gameOptionsGetOrPush(false);
    }

    public void gameOptionsPush() {
        gameOptionsGetOrPush(true);
    }

    public void gameOptionsRefreshTypes() {
        LoggerMaybe.m1079A();
        ElementDocument m5308c = this.libRocket.m5308c();
        if (this.useMapDropdown) {
            updateMapDropdown(m5308c, "mapsSelector", "typeSelector");
        }
    }

    public void gameOptionsGetOrPush(boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ElementDocument m5308c = this.libRocket.m5308c();
        Element elementById = m5308c.getElementById("fogMode");
        Element elementById2 = m5308c.getElementById("startingCredits");
        Element elementById3 = m5308c.getElementById("incomeMultiplier");
        Element elementById4 = m5308c.getElementById("noNukes");
        Element elementById5 = m5308c.getElementById("sharedControl");
        Element elementById6 = m5308c.getElementById("aiDifficulty");
        Element elementById7 = m5308c.getElementById("startingUnits");
        if (!z) {
            setupStartingUnitDropDown(elementById7, false);
        }
        Element elementById8 = m5308c.getElementById("typeSelector");
        Element mapDropdown = getMapDropdown();
        if (!z) {
            if (m1079A.f6122bX.f5603aO.f5654a == null) {
                LoggerMaybe.LogDebug2("gameOptionsGetOrPush: game.network.setup.currentType==null");
            } else {
                elementById8.setValue(VariableScope.nullOrMissingString + m1079A.f6122bX.f5603aO.f5654a.ordinal());
            }
            if (this.useMapDropdown) {
                updateMapDropdown(m5308c, "mapsSelector", "typeSelector");
                Element mapDropdown2 = getMapDropdown();
                LoggerMaybe.LogDebug2("new currentMapSelection=" + m1079A.f6122bX.f5603aO.f5655b);
                mapDropdown2.setValue(VariableScope.nullOrMissingString + m1079A.f6122bX.f5603aO.f5655b);
            }
            m5308c.getElementById("typeSelector");
            elementById.setValue(VariableScope.nullOrMissingString + m1079A.f6122bX.f5603aO.f5657d);
            elementById2.setValue(VariableScope.nullOrMissingString + m1079A.f6122bX.f5603aO.f5656c);
            elementById7.setValue(VariableScope.nullOrMissingString + m1079A.f6122bX.f5603aO.f5660g);
            m1079A.f6122bX.f5603aO.f5658e = true;
            elementById4.setCheckbox(m1079A.f6122bX.f5603aO.f5662i);
            elementById5.setCheckbox(m1079A.f6122bX.f5603aO.f5652l);
            elementById3.setValue(VariableScope.nullOrMissingString + C0758f.m2157a(m1079A.f6122bX.f5603aO.f5661h, 1) + "x");
            elementById6.setValue(VariableScope.nullOrMissingString + m1079A.f6122bX.f5603aO.f5659f);
            return;
        }
        C0845ah m1469e = m1079A.f6122bX.m1469e();
        if (m1469e != null) {
            String str = null;
            if (this.useMapDropdown) {
                str = mapDropdown.getValue();
                if (str == null) {
                    LoggerMaybe.LogDebug2("gameOptionsGetOrPush: mapDropdownSelected==null");
                    str = "<No Map>";
                }
            }
            int intValue = elementById8.getValueAsInt(0).intValue();
            EnumC0846ai enumC0846ai = m1469e.f5654a;
            m1469e.f5654a = EnumC0846ai.values()[intValue];
            if (this.useMapDropdown) {
                m1469e.f5655b = str;
            } else if (enumC0846ai != m1469e.f5654a) {
                m1469e.f5655b = null;
            }
            m1469e.f5657d = elementById.getValueAsInt(null).intValue();
            m1469e.f5656c = elementById2.getValueAsInt(null).intValue();
            float f = 1.0f;
            try {
                f = Float.parseFloat(elementById3.getValue().replace("x", VariableScope.nullOrMissingString));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            m1469e.f5661h = f;
            m1469e.f5662i = elementById4.getCheckbox();
            m1469e.f5652l = elementById5.getCheckbox();
            m1469e.f5659f = elementById6.getValueAsInt(null).intValue();
            m1469e.f5660g = elementById7.getValueAsInt(1).intValue();
            m1079A.f6122bX.m1564a(m1469e);
        }
    }

    public void closeBattleroomIfOpen() {
        LoggerMaybe.m1079A();
        if (this.libRocket.getActiveElementById("battleroomPage") == null) {
            LoggerMaybe.LogDebug2("closeBattleroomIfOpen: battleroomPage==null");
        } else {
            this.libRocket.backToLastDocument();
        }
    }

    public void reinviteAsk() {
        this.root.showPopup(C0820a.m1689a("menus.ingame.multiplayerReinvite.title", new Object[0]), "While in-game you can only reinvite players who were in-game before but dropped out", true, "reInvite:closePopup(); mp.showSteamInviteDialog();", null);
    }

    public void showSteamInviteDialog() {
        C1058a.m739a().mo285g();
    }

    public void setMapFromPopup(String str) {
        if (!isInControlOfServer()) {
            this.root.sendChatMessage("clicked on '" + this.root.getMapNameFromPath(str) + "'");
            this.root.closePopup();
            return;
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0845ah m1469e = m1079A.f6122bX.m1469e();
        if (m1469e != null) {
            String str2 = str;
            if (!str2.contains("MOD|")) {
                str2 = C0758f.m2038k(str2);
            }
            m1469e.f5655b = str2;
            m1079A.f6122bX.m1564a(m1469e);
        }
        this.root.closePopup();
    }

    public void showMapSelect() {
        this.root.showMapPopup(this.root.getModeMapPath(null, null), "mp.setMapFromPopup");
    }

    public boolean isInControlOfServer() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        return m1079A.f6122bX.IsServer || m1079A.f6122bX.f5495H;
    }

    public void askPassword() {
        LoggerMaybe.LogDebug2("mp.askPassword()");
        LoggerMaybe.m1079A();
        this.root.showInputPopupNonClose("Password Required", "This server requires a password to join", VariableScope.nullOrMissingString, "Close:mp.cancelPaswordAsk()", "[onenter]Join:mp.askPasswordEntered(getPopupText())");
    }

    public void askPasswordEntered(String str) {
        LoggerMaybe.LogDebug2("mp.askPasswordEntered()");
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1079A.f6122bX.f5481n = str;
        m1079A.f6122bX.m1582X();
        this.root.closePopup();
    }

    public void cancelPaswordAsk() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (m1079A.f6122bX.IsServer) {
            this.root.logWarn("cancelPaswordAsk: we are the server");
        } else {
            m1079A.f6122bX.m1493b("Cancel password");
            closeBattleroomIfOpen();
        }
        this.root.closePopup();
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Multiplayer$DropdownOption.class */
    public class DropdownOption {
        String key;
        String value;

        public DropdownOption(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public void setupStartingUnitDropDown(Element element, boolean z) {
        String str = VariableScope.nullOrMissingString;
        if (z) {
            str = str + generateOption("-99", C0820a.m1689a("menus.settings.option.default", new Object[0]), false);
        }
        Iterator it = getStartingUnitOptions().iterator();
        while (it.hasNext()) {
            DropdownOption dropdownOption = (DropdownOption) it.next();
            str = str + generateOption(dropdownOption.key, dropdownOption.value, false);
        }
        element.setInnerRML(str);
    }

    public void setupPlayerColorDropDown(Element element, boolean z, boolean z2, AbstractC0197n abstractC0197n) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        String str = VariableScope.nullOrMissingString;
        if (z) {
            str = str + generateOption("-99", C0820a.m1689a("menus.settings.option.default", new Object[0]), false);
        }
        for (int i = 0; i < 10; i++) {
            boolean z3 = false;
            if (z2 && m1079A.f6122bX.m1574a(i, abstractC0197n)) {
                z3 = true;
            }
            String m2026w = C0758f.m2026w(AbstractC0197n.m4640j(i));
            int i2 = i;
            int i3 = i;
            if (z3) {
                m2026w = m2026w + " (used)";
                i2 = -7829368;
                i3 = -99;
            }
            str = str + generateOption(VariableScope.nullOrMissingString + i3, m2026w, false, Integer.valueOf(AbstractC0197n.m4642i(i2)), z3);
        }
        element.setInnerRML(str);
    }

    public ArrayList getStartingUnitOptions() {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        ArrayList arrayList = new ArrayList();
        Iterator it = m1079A.f6122bX.m1444i().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            arrayList.add(new DropdownOption(num.toString(), m1079A.f6122bX.m1476d(num.intValue())));
        }
        return arrayList;
    }
}
