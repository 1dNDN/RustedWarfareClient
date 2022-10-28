package com.corrodinggames.librocket.scripts;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0243al;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.C1122y;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0845ah;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.RunnableC0854an;
import com.corrodinggames.rts.gameFramework.p041i.Steam;
import com.corrodinggames.rts.gameFramework.p042j.C0899d;
import com.corrodinggames.rts.gameFramework.p042j.C0906k;
import com.corrodinggames.rts.gameFramework.p042j.C0908m;
import com.corrodinggames.rts.gameFramework.p042j.C0911p;
import com.corrodinggames.rts.p008a.RunnableC0069a;
import com.corrodinggames.rts.p008a.p009a.C0073b;
import com.corrodinggames.rts.p008a.p009a.C0085n;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import p000a.p001a.C0017h;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Debug.class */
public class Debug extends ScriptContext {
    Root root;
    boolean allFeatures;
    ConcurrentLinkedQueue backgroundClientConnections;
    Thread backgroundConnectionThread;
    Runnable backgroundConnectionRunnable = new Runnable() { // from class: com.corrodinggames.librocket.scripts.Debug.1
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = Debug.this.backgroundClientConnections.iterator();
            while (it.hasNext()) {
                Steam steam = (Steam) it.next();
            }
        }
    };
    boolean forceNonThreaded = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Debug(Root root) {
        this.root = root;
    }

    public void setLocalPlayerName(String str) {
        LoggerMaybe.m1082A().f6122bX.m1583a(str);
    }

    public void setDdosProtection(boolean z) {
        RunnableC0854an.f5693b = z;
    }

    public void lookAt(float f, float f2) {
        LoggerMaybe.m1082A().m998b(f, f2);
    }

    public void createManyUnits(String str, float f, float f2, int i, boolean z, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < i2) {
            i3 += 9;
            if (i3 > 400) {
                i3 = 0;
                i4 += 9;
            }
            createUnit(str, f + i3, f2 + i4, i, i5 == 0 ? z : false);
            i5++;
        }
    }

    public Long createUnit(String str, float f, float f2, int i, boolean z) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        InterfaceC0303as m4530a = AbstractC0249ar.m4530a(str);
        if (m4530a == null) {
            this.root.logWarn("Could not find type:" + str);
            return null;
        }
        AbstractC0244am mo3676a = m4530a.mo3676a();
        mo3676a.f6957el = f;
        mo3676a.f6958em = f2;
        try {
            mo3676a.m4697Q(i);
            AbstractC0197n.m4878c(mo3676a);
            mo3676a.f1648cI = true;
            if (z) {
                m1082A.m998b(f, f2);
            }
            return Long.valueOf(mo3676a.f6951ee);
        } catch (C0179f e) {
            throw new RuntimeException(e);
        }
    }

    public int getMaxCustomUnitTypeId() {
        return C0453l.f3188d.size();
    }

    public Long createCustomUnitFromTypeId(int i, float f, float f2, int i2, boolean z) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        AbstractC0244am mo3676a = ((C0453l) C0453l.f3188d.get(i)).mo3676a();
        mo3676a.f6957el = f;
        mo3676a.f6958em = f2;
        try {
            mo3676a.m4697Q(i2);
            AbstractC0197n.m4878c(mo3676a);
            mo3676a.f1648cI = true;
            if (z) {
                m1082A.m998b(f, f2);
            }
            return Long.valueOf(mo3676a.f6951ee);
        } catch (C0179f e) {
            throw new RuntimeException(e);
        }
    }

    public void enableFeatures(String str) {
        if (C0758f.m2100e(str).startsWith("221FC410BD29D786")) {
            this.allFeatures = true;
            RunnableC0069a.f389d = true;
            return;
        }
        throw new RuntimeException("unknown");
    }

    public void selectNextUnit() {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        AbstractC0244am abstractC0244am = null;
        boolean z = false;
        Iterator it = AbstractC0244am.m4665bF().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if ((abstractC0244am2 instanceof AbstractC0244am) && !(abstractC0244am2 instanceof C0243al) && !abstractC0244am2.mo1750t()) {
                if (abstractC0244am == null) {
                    abstractC0244am = abstractC0244am2;
                }
                if (z) {
                    abstractC0244am = abstractC0244am2;
                    break;
                }
                z = abstractC0244am2.f1644cE;
            }
        }
        m1082A.f6117bS.m1793x();
        if (abstractC0244am != null) {
            m1082A.f6117bS.m1815j(abstractC0244am);
        }
    }

    public void removeAllUnits() {
        Iterator it = AbstractC1120w.m440dI().iterator();
        while (it.hasNext()) {
            ((AbstractC1120w) it.next()).mo2674a();
        }
    }

    public void killAllUnits() {
        Iterator it = AbstractC0244am.m4665bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0244am) {
                abstractC0244am.f1632cs = -1.0f;
            }
        }
    }

    public boolean backgroundCurrentClientConnection() {
        if (this.allFeatures) {
            LoggerMaybe m1082A = LoggerMaybe.m1082A();
            if (!m1082A.f6122bX.lock1) {
                LoggerMaybe.LogDebug2("Not networked");
                return false;
            } else if (m1082A.f6122bX.IsServer) {
                throw new RuntimeException("server=true");
            } else {
                if (this.backgroundConnectionThread == null) {
                    this.backgroundConnectionThread = new Thread(this.backgroundConnectionRunnable);
                    this.backgroundConnectionThread.start();
                }
                if (this.backgroundClientConnections == null) {
                    this.backgroundClientConnections = new ConcurrentLinkedQueue();
                }
                Iterator it = m1082A.f6122bX.f5606bc.iterator();
                while (it.hasNext()) {
                    Steam steam = (Steam) it.next();
                    steam.f5781t = true;
                    this.backgroundClientConnections.add(steam);
                    m1082A.f6122bX.f5606bc.remove(steam);
                }
                m1082A.f6122bX.m1528b("backgrounded");
                m1082A.f6122bX.lock1 = true;
                return true;
            }
        }
        return false;
    }

    public boolean isTeamWipedOut(int i) {
        AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
        if (m4842k == null) {
            this.root.logWarn("Could not find team:" + i);
            return true;
        }
        return m4842k.f1330F;
    }

    public boolean isTeamDefeated(int i) {
        AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
        if (m4842k == null) {
            this.root.logWarn("Could not find team:" + i);
            return true;
        }
        return m4842k.f1330F;
    }

    public boolean isTeamInVictory(int i) {
        AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
        if (m4842k == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        return m4842k.f1331G;
    }

    public String getPlayerName(int i) {
        AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
        if (m4842k == null) {
            this.root.logWarn("Could not find team:" + i);
            return null;
        }
        return m4842k.f1316u;
    }

    public String getQueryStringOfPlayer(int i) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
        if (m4842k == null) {
            this.root.logWarn("Could not find team:" + i);
            return null;
        }
        Steam m1521c = m1082A.f6122bX.m1521c(m4842k);
        if (m1521c == null) {
            this.root.logWarn("Found team but could not find connection for team:" + i);
            return null;
        }
        return m1521c.RelayId;
    }

    public boolean setTeamCredits(int i, int i2) {
        AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
        if (m4842k == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        m4842k.f1310o = i2;
        return true;
    }

    public boolean setTeamAllyGroup(int i, int i2) {
        AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
        if (m4842k == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        m4842k.f1312q = i2;
        return true;
    }

    public void giveUpgradeToAllUnits() {
        Iterator it = AbstractC0244am.m4665bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                AbstractC0224s a = abstractC0623y.m4689a(abstractC0623y.mo3338cl());
                if (a != null) {
                    abstractC0623y.mo3147a(a, false);
                }
            }
        }
    }

    public void giveAllActionsToAllUnits() {
        Iterator it = AbstractC0244am.m4665bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                Iterator it2 = abstractC0623y.mo3148N().iterator();
                while (it2.hasNext()) {
                    abstractC0623y.mo3147a((AbstractC0224s) it2.next(), false);
                }
            }
        }
    }

    public void completeAllUnitsQueues() {
        Iterator it = AbstractC0244am.m4665bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof InterfaceC0501l) {
                ((InterfaceC0501l) abstractC0244am).mo3388dw();
            }
        }
    }

    public boolean moveAllUnitsOnTeam(int i, float f, float f2) {
        AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
        if (m4842k == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        C0749e m2406b = LoggerMaybe.m1082A().f6130cf.m2406b(m4842k);
        Iterator it = AbstractC0244am.m4665bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1609bV == m4842k) {
                    m2406b.m2306a(abstractC0623y);
                }
            }
        }
        m2406b.m2316a(f, f2);
        return true;
    }

    public void showMessage(String str) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        m1082A.f6122bX.m1466m(str.replace("\\n", "\n"));
    }

    public String unicodeTest1() {
        return "start ¥123 \u061c end";
    }

    public void setZoom(float f) {
        LoggerMaybe.m1082A().f6254cU = f;
    }

    public boolean isNetworkGameActive() {
        return LoggerMaybe.m1082A().m1070M();
    }

    public int getLocalPlayerId() {
        return LoggerMaybe.m1082A().f6122bX.f5489z.f1306k;
    }

    public int numberOfHumanPlayers() {
        return LoggerMaybe.m1082A().f6122bX.m1553an();
    }

    public int numberOfPlayersPlusAI() {
        return LoggerMaybe.m1082A().f6122bX.m1552ao();
    }

    public int numberOfPlayerConnections() {
        return LoggerMaybe.m1082A().f6122bX.m1640A();
    }

    public boolean enableFastSync() {
        LoggerMaybe.m1082A().f6122bX.f5582ai = 30;
        return true;
    }

    public boolean enableExtraNetworkDebug() {
        LoggerMaybe.m1082A().f6122bX.f5476g = true;
        return true;
    }

    public boolean throwIfAnyPlayerNotInSync() {
        LoggerMaybe.m1082A().f6122bX.m1452x();
        return true;
    }

    public boolean enableFastResyncTimer() {
        C0831ad.f5559c = true;
        return true;
    }

    public boolean enablePauseOnDesync() {
        LoggerMaybe.m1082A().f6122bX.f5513aj = true;
        return true;
    }

    public boolean networkSetIncomeMultiplier(float f) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        C0845ah m1504e = m1082A.f6122bX.m1504e();
        m1504e.f5661h = f;
        m1082A.f6122bX.m1599a(m1504e);
        return true;
    }

    public boolean networkSetPortNumber(int i) {
        LoggerMaybe.m1082A().f6115bQ.networkPort = i;
        return true;
    }

    public boolean networkSetUdp(boolean z) {
        LoggerMaybe.m1082A().f6115bQ.udpInMultiplayer = z;
        return true;
    }

    public boolean networkDisconnect() {
        LoggerMaybe.m1082A().f6122bX.m1528b("debug");
        return true;
    }

    public boolean networkAbort() {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        Iterator it = m1082A.f6122bX.f5606bc.iterator();
        while (it.hasNext()) {
            Steam steam = (Steam) it.next();
            if (steam.f5767d instanceof C0017h) {
                LoggerMaybe.LogDebug2("Closing: " + steam.m1338g());
                ((C0017h) steam.f5767d).m5908d();
            }
        }
        m1082A.f6122bX.m1528b("debug");
        return true;
    }

    public boolean disableNetworkOwnInfo() {
        C0831ad.f5560r = false;
        return true;
    }

    public boolean networkPause() {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        m1082A.f6122bX.f5513aj = true;
        m1082A.f6122bX.f5514ak = true;
        return true;
    }

    public boolean plainTextDebugSave(boolean z) {
        LoggerMaybe.m1082A();
        C1122y.f6963a = z;
        return true;
    }

    public boolean checkDesync(int i) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        if (m1082A.f6122bX.f5518aF != 0) {
            throw new RuntimeException("numberOfDesyncErrors==" + m1082A.f6122bX.f5518aF);
        }
        if (m1082A.f6122bX.f5519aG < i) {
            throw new RuntimeException("game.network.numberOfDesyncPasses:" + m1082A.f6122bX.f5519aG + "<" + i);
        }
        this.root.logDebug("numberOfDesyncPasses:" + m1082A.f6122bX.f5519aG);
        return true;
    }

    public int getNumberOfDesyncErrors() {
        return LoggerMaybe.m1082A().f6122bX.f5518aF;
    }

    public int getNumberOfDesyncPasses() {
        return LoggerMaybe.m1082A().f6122bX.f5519aG;
    }

    public int getNumberOfResyncSendsOrRecv() {
        return LoggerMaybe.m1082A().f6122bX.f5520aH;
    }

    public boolean setMultiplayerMap(int i, String str) {
        C0845ah c0845ah = LoggerMaybe.m1082A().f6122bX.f5603aO;
        c0845ah.f5654a = EnumC0846ai.values()[i];
        c0845ah.f5655b = str;
        return true;
    }

    public boolean setMultiplayerSave(String str) {
        C0845ah c0845ah = LoggerMaybe.m1082A().f6122bX.f5603aO;
        c0845ah.f5654a = EnumC0846ai.f5671c;
        c0845ah.f5655b = str;
        return true;
    }

    public void generateNewClientId() {
        LoggerMaybe.m1082A().f6122bX.m1616Y();
    }

    public void disableFog() {
        LoggerMaybe.m1082A();
    }

    public void overrideDeltaSpeed(float f) {
        LoggerMaybe.m1082A().f6238bu = f;
    }

    public void setGameSetting(String str, String str2) {
        LoggerMaybe.m1082A().f6115bQ.setValueDynamic(str, str2);
    }

    public void setNetworkaiDifficulty(int i) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        C0845ah m1504e = m1082A.f6122bX.m1504e();
        m1504e.f5659f = i;
        m1082A.f6122bX.m1599a(m1504e);
    }

    public void setNetworkStartingUnits(int i) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        C0845ah m1504e = m1082A.f6122bX.m1504e();
        m1504e.f5660g = i;
        m1082A.f6122bX.m1599a(m1504e);
    }

    public void startRandomUnitDesyncTest() {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        C0749e m2407b = m1082A.f6130cf.m2407b();
        m2407b.f4842i = AbstractC0197n.f1371i;
        m2407b.f4850r = true;
        m2407b.f4853u = 1;
        m1082A.f6122bX.m1601a(m2407b);
    }

    public void startRandomUnitStressTest() {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        C0749e m2407b = m1082A.f6130cf.m2407b();
        m2407b.f4842i = AbstractC0197n.f1371i;
        m2407b.f4850r = true;
        m2407b.f4853u = 2;
        m1082A.f6122bX.m1601a(m2407b);
    }

    public void runAllUnitTests() {
        this.root.logWarn("Running unit tests..");
        new C0085n().m5478a();
    }

    public void runAllLeakTests() {
        this.root.logWarn("Running leak tests..");
        new C0073b().m5511a();
    }

    public boolean loadSaveFromSystemPath(String str) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean m432a = m1082A.f6125ca.m432a(new Reader(dataInputStream), false, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
            return m432a;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkTeamCaches() {
        Iterator it = AbstractC0197n.m4883c().iterator();
        while (it.hasNext()) {
            AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
            if (abstractC0197n.m4833t()) {
                throw new RuntimeException("Team cache difference on team:" + abstractC0197n.f1306k);
            }
        }
    }

    public void setPathSpeedConf(boolean z) {
        this.forceNonThreaded = z;
    }

    public float getPathSpeed(int i, float f, float f2, float f3, float f4) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        C0173b c0173b = m1082A.f6110bL;
        ArrayList arrayList = new ArrayList();
        c0173b.m5171a(f3, f4);
        int i2 = c0173b.f801T;
        int i3 = c0173b.f802U;
        long m2427a = C0727bl.m2427a();
        C0899d.f5918a = 0;
        C0899d.f5919b = 0;
        C0899d.f5920c = 0;
        C0899d.f5921d = 0;
        C0899d.f5922e = 0;
        C0899d.f5923f = 0;
        C0899d.f5924g = 0;
        C0899d.f5925h = 0.0d;
        C0899d.f5926i = 0.0d;
        C0908m.f6038c = 0;
        C0899d.f5938u = 0;
        for (int i4 = 0; i4 < i; i4++) {
            C0906k m1152a = m1082A.f6119bU.m1152a(false);
            c0173b.m5171a(f, f2);
            m1152a.m1178a(EnumC0246ao.f1704b, (short) c0173b.f801T, (short) c0173b.f802U, null, false);
            c0173b.m5171a(f3, f4);
            m1152a.m1173a((short) c0173b.f801T, (short) c0173b.f802U, (short) 0);
            m1152a.f5985p = true;
            m1152a.f5986q = 0;
            m1152a.f5987r = false;
            m1082A.f6119bU.m1154a(m1152a, false, this.forceNonThreaded);
            arrayList.add(m1152a);
        }
        if (!this.forceNonThreaded) {
            return -1.0f;
        }
        float m2425a = C0727bl.m2425a(m2427a);
        int i5 = -1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LinkedList mo1216a = ((C0906k) it.next()).mo1216a();
            int i6 = 0;
            Iterator it2 = mo1216a.iterator();
            while (it2.hasNext()) {
                C0911p c0911p = (C0911p) it2.next();
                i6++;
            }
            if (i5 != -1 && i5 != i6) {
                LoggerMaybe.m993b("pathDistance inconsistency detected:" + i5 + "!=" + i6);
            }
            C0911p c0911p2 = (C0911p) mo1216a.getLast();
            if (c0911p2.f6074a != i2 || c0911p2.f6075b != i3) {
                LoggerMaybe.m993b("path did not react goal, got to:" + ((int) c0911p2.f6074a) + "," + ((int) c0911p2.f6075b) + " (vs " + i2 + ", " + i3 + ")");
            }
            i5 = i6;
        }
        LoggerMaybe.m993b("hotBufferWatermark:" + C0899d.f5918a + ", nodesAdded:" + C0899d.f5921d + ", mainQueueWatermark:" + C0899d.f5919b + ", backlogWatermark:" + C0899d.f5920c + ", scannedA:" + C0899d.f5922e + ", scannedB:" + C0899d.f5923f + ", scannedC:" + C0899d.f5924g + ", time:" + C0727bl.m2426a(C0899d.f5926i) + "/" + C0727bl.m2426a(C0899d.f5925h) + ", dirtyPeak:" + C0899d.f5938u + ", dis:" + i5);
        if (C0908m.f6038c != 0) {
            LoggerMaybe.m993b("newNodesCreated:" + C0908m.f6038c);
        }
        return m2425a;
    }

    public void muteSounds() {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        m1082A.f6111bM.f4036b = true;
        m1082A.f6112bN.m2692f();
    }

    public void pong() {
    }
}
