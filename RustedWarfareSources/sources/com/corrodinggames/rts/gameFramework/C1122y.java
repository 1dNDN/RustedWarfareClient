package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0185c;
import com.corrodinggames.rts.game.C0187e;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0555h;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0401bb;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0863av;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p045m.C1049f;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/y.class */
public class C1122y {

    /* renamed from: a */
    public static boolean f6963a = false;

    /* renamed from: b */
    final boolean f6964b;

    /* renamed from: c */
    int f6965c;

    /* renamed from: d */
    int f6966d;

    public C1122y() {
        if (!Core.f6190as) {
        }
        this.f6964b = false;
        this.f6965c = -9999;
        this.f6966d = -9999;
    }

    /* renamed from: a */
    public File m423a(String str, boolean z) {
        return m424a(str, "saves/", z);
    }

    /* renamed from: a */
    public static File m424a(String str, String str2, boolean z) {
        return C0750a.m2289a(str, str2, z);
    }

    /* renamed from: b */
    public void m419b(String str, boolean z) {
        File m423a;
        File m423a2;
        Core m1087A = Core.m1087A();
        String str2 = str;
        if (str2 != null && !str2.endsWith(".rwsave")) {
            str2 = str2 + ".rwsave";
        }
        File file = null;
        boolean z2 = false;
        try {
            m423a = m423a(str2 + ".tmp", true);
            if (m423a.exists()) {
                m423a = m423a(str2 + ".tmp2", true);
            }
            m423a2 = m423a(str2, true);
            Core.LogDebug2("Saving game to: " + m423a2.getAbsolutePath());
            OutputStream m2292a = C0750a.m2292a(m423a, false);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m2292a);
            if (!f6963a) {
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                try {
                    m428a(new StreamWriter(dataOutputStream));
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    m2292a.close();
                } catch (Throwable th) {
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    m2292a.close();
                    throw th;
                }
            } else {
                PrintStream printStream = new PrintStream(bufferedOutputStream);
                try {
                    m428a(new C0863av(printStream));
                    printStream.close();
                    bufferedOutputStream.close();
                    m2292a.close();
                    Core.m959n("DEBUG plain text save created");
                } catch (Throwable th2) {
                    printStream.close();
                    bufferedOutputStream.close();
                    m2292a.close();
                    throw th2;
                }
            }
            if (z && Core.m1012as() && C0750a.m2271h(m423a2.getAbsolutePath())) {
                Core.LogDebug2("Autosave file already exists: " + m423a2.getAbsolutePath());
                if (!C0750a.m2285b(m423a2)) {
                    Core.LogDebug2("Old autosave failed to delete");
                }
            }
            Core.LogDebug2("Finished writing save, renaming to final filename");
        } catch (Exception e) {
            if (z) {
                Core.LogDebug2("Auto save failed: " + e.getMessage());
                return;
            }
            e.printStackTrace();
            m1087A.m1045a("Error saving game to SD card, please check permissions, disk space, etc. (" + C0758f.m2147b(e) + ")", 1);
            if (0 != 0 && C0750a.m2271h(file.getAbsolutePath())) {
                Core.LogDebug2("saveGame: Removing temp save file after crash");
                C0750a.m2285b((File) null);
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            m1087A.m1045a("Error. Run out of memory error while saving game to SD card.", 1);
            if (0 != 0 && C0750a.m2271h(file.getAbsolutePath())) {
                Core.LogDebug2("saveGame: Removing temp save file after crash");
                C0750a.m2285b((File) null);
            }
        }
        if (!C0750a.m2284b(m423a, m423a2)) {
            Core.LogDebug2("Failed to rename to final file");
            throw new IOException("Failed to rename to final file. Check file permissions of storage.");
        }
        C0750a.m2280c(m423a2);
        z2 = true;
        if (z2) {
            if (z) {
                m1087A.f6117bS.f5116f.m1945a("Auto Saved", 1000);
            } else {
                m1087A.f6117bS.f5115e.m1794a(null, "Game saved");
            }
        }
    }

    /* renamed from: a */
    public void m428a(StreamWriter streamWriter) {
        Core m1087A = Core.m1087A();
        Core.m997b("GameSaver", "saveCurrentMap took:" + (System.currentTimeMillis() - System.currentTimeMillis()));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            streamWriter.WriteUTF("rustedWarfareSave");
            streamWriter.WriteInteger(m1087A.m988c(true));
            streamWriter.WriteInteger(95);
            streamWriter.mo1329a(m1087A.f6228ar);
            streamWriter.mo1331a("saveCompression", true);
            streamWriter.m1396e("customUnitsBlock");
            C0453l.m3721a(streamWriter);
            streamWriter.mo1332a("customUnitsBlock");
            streamWriter.m1396e("gameSetup");
            boolean z = m1087A.f6122bX.lock1 || m1087A.f6122bX.f5571F;
            streamWriter.mo1329a(m1087A.f6122bX.lock1);
            streamWriter.mo1329a(m1087A.f6122bX.f5571F);
            streamWriter.mo1329a(z);
            if (z) {
                m1087A.f6122bX.m1604a(streamWriter);
            }
            streamWriter.mo1332a("gameSetup");
            streamWriter.WriteUTF(m1087A.f6165dk);
            boolean z2 = m1087A.f6166dl != null;
            streamWriter.mo1329a(z2);
            if (z2) {
                Core.LogDebug2("Writing remote map steam into save");
                streamWriter.m1417a(m1087A.f6166dl);
            }
            streamWriter.WriteInteger(m1087A.f6102by);
            streamWriter.mo1335a(m1087A.f6146cx + m1087A.f6156cH);
            streamWriter.mo1335a(m1087A.f6147cy + m1087A.f6157cI);
            streamWriter.mo1335a(m1087A.f6254cU);
            streamWriter.WriteInteger(m1087A.f6120bV.f4072a);
            streamWriter.WriteInteger(0);
            streamWriter.m1397e();
            m1087A.f6110bL.m5326a(streamWriter);
            streamWriter.mo1329a(m1087A.f6100bv);
            streamWriter.mo1329a(m1087A.f6110bL.f841E);
            streamWriter.mo1329a(m1087A.f6110bL.f842F);
            streamWriter.mo1329a(m1087A.f6110bL.f843G);
            streamWriter.mo1329a(m1087A.f6129ce != null);
            if (m1087A.f6129ce != null) {
                m1087A.f6129ce.mo2441a(streamWriter);
            }
            streamWriter.m1397e();
            int i = -1;
            if (m1087A.f6099bs != null) {
                i = m1087A.f6099bs.f1306k;
            }
            streamWriter.WriteInteger(i);
            streamWriter.WriteInteger(AbstractC0197n.f1365c);
            for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
                streamWriter.mo1329a(m5017k instanceof C0136a);
                streamWriter.mo1329a(m5017k instanceof C0185c);
                streamWriter.mo1329a(m5017k != null);
                if (m5017k != null) {
                    m5017k.m5064b(streamWriter);
                }
            }
            if (!m1087A.f6117bS.f5112b) {
            }
            streamWriter.m1398d("Section: unit shells");
            streamWriter.WriteInteger(AbstractC1120w.f6962eo.size());
            Iterator it = AbstractC1120w.f6962eo.iterator();
            while (it.hasNext()) {
                AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                if (abstractC1120w == null) {
                    throw new RuntimeException("Found null in fastGameObjectList");
                }
                if (abstractC1120w instanceof AbstractC0244am) {
                    AbstractC0244am abstractC0244am = (AbstractC0244am) abstractC1120w;
                    if (abstractC0244am.mo1758r() instanceof EnumC0249ar) {
                        streamWriter.m1401c(1);
                        streamWriter.m1411a((Enum) ((EnumC0249ar) abstractC0244am.mo1758r()));
                    } else if (abstractC0244am.mo1758r() instanceof C0453l) {
                        streamWriter.m1401c(3);
                        streamWriter.WriteUTF(((C0453l) abstractC0244am.mo1758r()).f2922L);
                    } else {
                        throw new IOException("Unhandled getUnitType on save:" + abstractC0244am.mo1758r().getClass().toString());
                    }
                } else {
                    streamWriter.m1401c(2);
                    if (abstractC1120w instanceof C0195l) {
                        streamWriter.m1401c(1);
                    } else if (abstractC1120w instanceof C0188f) {
                        streamWriter.m1401c(2);
                    } else if (abstractC1120w instanceof C0746f) {
                        streamWriter.m1401c(3);
                    } else {
                        String str = null;
                        if (abstractC1120w.getClass() != null) {
                            str = abstractC1120w.getClass().toString();
                        }
                        throw new IOException("Unhandled class on save: " + str);
                    }
                }
                streamWriter.m1424a(abstractC1120w.f6951ee);
            }
            streamWriter.m1398d("Section: CurrentUnitId");
            streamWriter.m1424a(m1087A.f6122bX.m1457z());
            m1087A.f6120bV.mo2441a(streamWriter);
            m1087A.f6117bS.mo2441a(streamWriter);
            m1087A.f6123bY.m2447a(streamWriter);
            for (int i3 = 0; i3 < AbstractC0197n.f1365c; i3++) {
                AbstractC0197n m5017k2 = AbstractC0197n.m5017k(i3);
                if (m5017k2 != null) {
                    m5017k2.mo2441a(streamWriter);
                }
            }
            streamWriter.m1397e();
            Iterator it2 = AbstractC1120w.f6962eo.iterator();
            while (it2.hasNext()) {
                AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                if (streamWriter.m1395f()) {
                    String simpleName = abstractC1120w2.getClass().getSimpleName();
                    if (abstractC1120w2 instanceof AbstractC0244am) {
                        simpleName = ((AbstractC0244am) abstractC1120w2).mo1758r().mo4474i();
                    }
                    streamWriter.m1398d("Saving unit:" + simpleName + " (id" + abstractC1120w2.f6951ee + ")");
                }
                abstractC1120w2.mo2441a(streamWriter);
                streamWriter.m1397e();
            }
            streamWriter.mo1332a("saveCompression");
            streamWriter.m1397e();
            streamWriter.WriteUTF("<SAVE END>");
        } catch (Exception e) {
            e.printStackTrace();
            m1087A.m1045a("Error saving game to SD card, please email the logs.", 1);
        }
        Core.m997b("GameSaver", "saveGame took:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    public String m426a(String str) {
        if (str == null) {
            return null;
        }
        return str.equals("maps/normal/l010;mission_1__-__Dividing_River.tmx") ? "maps/normal/l010;[demo]mission_1__-__Dividing_River.tmx" : str.equals("maps/normal/l030;mission_3__-__Crossfire.tmx") ? "maps/normal/l030;[demo]mission_3__-__Crossfire.tmx" : str;
    }

    /* renamed from: c */
    public boolean m417c(String str, boolean z) {
        Core m1087A = Core.m1087A();
        try {
            File m423a = m423a(str, false);
            if (m423a.isDirectory()) {
                m1087A.m1045a("Could not load, is a directory", 1);
                return false;
            }
            C1098j m2269j = C0750a.m2269j(m423a.getAbsolutePath());
            if (m2269j == null) {
                m1087A.m1045a("Could not load, failed to open: " + C0750a.m2277d(m423a.getAbsolutePath()), 1);
                return false;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m2269j);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean m427a = m427a(new Reader(dataInputStream), z, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            m2269j.close();
            return m427a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m425a(String str, StreamWriter streamWriter) {
        File m423a = m423a(str, false);
        if (m423a == null) {
            throw new IOException("Failed to get game save: " + str);
        }
        streamWriter.m1413a(m423a);
    }

    /* renamed from: a */
    public synchronized boolean m427a(Reader reader, boolean z, boolean z2, boolean z3) {
        AbstractC1120w abstractC1120w;
        AbstractC1120w c0746f;
        AbstractC0197n m5017k;
        Core m1087A = Core.m1087A();
        try {
            C0727bl c0727bl = m1087A.f6128cd;
            if (this.f6964b) {
                c0727bl.m2436a(EnumC0729bm.f4601y);
            }
            ArrayList arrayList = null;
            if (z3) {
                arrayList = new ArrayList();
                Iterator it = m1087A.f6117bS.f5258bL.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((AbstractC0244am) it.next()).f6951ee));
                }
            }
            try {
                try {
                    String ReadUTF = reader.ReadUTF();
                    if (!ReadUTF.equals("rustedWarfareSave")) {
                        Core.m998b("Map Load: Header is not correct:" + ReadUTF.substring(0, Math.min(ReadUTF.length(), 50)));
                        String str = "Failed to load save. (Could not find correct header)";
                        if (ReadUTF.equals("rustedWarfareReplay")) {
                            str = "Failed to load save. (This file appears to be a replay file, not a save file)";
                        }
                        Core.m998b(str);
                        m1087A.m1045a(str, 1);
                        return false;
                    }
                    reader.ReadInt();
                    int ReadInt = reader.ReadInt();
                    Core.m997b("gameSaver", "Loading save from version: " + ReadInt);
                    reader.m1318a(ReadInt);
                    if (ReadInt > 95) {
                        m1087A.m1045a("Cannot load: This save was made with a newer game", 1);
                        return false;
                    }
                    if (ReadInt >= 5) {
                        reader.ReadBool();
                    }
                    if (ReadInt >= 23) {
                        c0727bl.m2436a(EnumC0729bm.f4604B);
                        reader.m1313a("saveCompression", true);
                        c0727bl.m2431b(EnumC0729bm.f4604B);
                    }
                    if (ReadInt >= 54) {
                        reader.m1307b("customUnitsBlock");
                        if (m1087A.f6126cb.m2464h() && !z3) {
                            Core.LogDebug2("Loading mods from replay");
                            try {
                                C0453l.m3720a(reader);
                                C0348af.m4276d();
                            } catch (C0401bb e) {
                                Core.LogDebug2("Replay load: Missing unit:" + e.getMessage() + " d:" + e.f2631b);
                                m1087A.m969i(e.getMessage() + ", this is likely to cause the replay to desync (reverting to default units & mods)");
                                C0348af.m4281b(true);
                            }
                        }
                        reader.m1303d("customUnitsBlock");
                    }
                    Integer num = null;
                    Integer num2 = null;
                    if (m1087A.f6126cb.m2464h() && z3) {
                        num = Integer.valueOf(m1087A.f6105bB);
                        num2 = Integer.valueOf(m1087A.f6106bC);
                    }
                    if (ReadInt >= 56) {
                        reader.m1307b("gameSetup");
                        boolean ReadBool = reader.ReadBool();
                        boolean z4 = ReadBool;
                        boolean z5 = false;
                        if (ReadInt >= 94) {
                            z5 = reader.ReadBool();
                            z4 = reader.ReadBool();
                        }
                        if ((m1087A.f6126cb.m2464h() || !m1087A.f6122bX.lock1) && !z3 && z4) {
                            Core.LogDebug2("Using game rules from save");
                            m1087A.f6126cb.f4507M = true;
                            m1087A.f6122bX.m1591a(reader);
                            num = Integer.valueOf(m1087A.f6105bB);
                            num2 = Integer.valueOf(m1087A.f6106bC);
                            if ((ReadBool || z5) && !m1087A.f6122bX.f5571F && !m1087A.f6122bX.lock1 && !m1087A.f6126cb.m2464h()) {
                                Core.LogDebug2("Enabling use of singlePlayer rules from saved game.");
                                m1087A.f6122bX.f5571F = true;
                            }
                        }
                        reader.m1303d("gameSetup");
                    }
                    m1087A.f6166dl = null;
                    m1087A.f6165dk = m426a(C0750a.m2265n(reader.ReadUTF()));
                    boolean z6 = false;
                    if (ReadInt >= 72) {
                        z6 = reader.ReadBool();
                        if (z6) {
                            Core.LogDebug2("Reading remote map stream");
                            m1087A.f6166dl = reader.m1286u();
                        }
                    }
                    if (m1087A.f6122bX.lock1 && !m1087A.f6122bX.IsServer && z3 && m1087A.f6122bX.f5525aR != null && !z6) {
                        m1087A.f6165dk = VariableScope.nullOrMissingString;
                        m1087A.f6166dl = m1087A.f6122bX.f5525aR;
                    }
                    c0727bl.m2436a(EnumC0729bm.f4602z);
                    if (z3) {
                        m1087A.m1036a(true, true, EnumC1063s.f6741c);
                        if (Core.m1012as()) {
                            m1087A.f6272du = true;
                        }
                    } else {
                        m1087A.m1037a(true, EnumC1063s.f6741c);
                    }
                    if (!m1087A.f6110bL.f803W) {
                        Core.LogDebug2("Not loading save because map failed to load");
                        return false;
                    }
                    if (num != null) {
                        m1087A.f6105bB = num.intValue();
                    }
                    if (num2 != null) {
                        Integer.valueOf(m1087A.f6106bC);
                    }
                    synchronized (m1087A) {
                        c0727bl.m2431b(EnumC0729bm.f4602z);
                        m1087A.f6102by = reader.ReadInt();
                        float m1300g = reader.m1300g();
                        float m1300g2 = reader.m1300g();
                        float m1300g3 = reader.m1300g();
                        if (!z3) {
                            m1087A.m1003b(m1300g, m1300g2);
                            m1087A.f6254cU = m1300g3;
                        }
                        if (ReadInt >= 18) {
                            m1087A.f6120bV.f4072a = reader.ReadInt();
                        }
                        reader.ReadInt();
                        if (ReadInt >= 19) {
                            reader.m1314a("end of setup");
                        }
                        m1087A.f6110bL.m5325a(reader);
                        if (ReadInt >= 86) {
                            boolean ReadBool2 = reader.ReadBool();
                            boolean ReadBool3 = reader.ReadBool();
                            boolean ReadBool4 = reader.ReadBool();
                            boolean ReadBool5 = reader.ReadBool();
                            if (!z && !ReadBool2) {
                                m1087A.f6110bL.f841E = ReadBool3;
                                m1087A.f6110bL.f842F = ReadBool4;
                                m1087A.f6110bL.f843G = ReadBool5;
                            }
                        }
                        if (reader.ReadBool()) {
                            if (m1087A.f6129ce == null) {
                                Core.m997b("gameSaver", "making new mission engine on load, this shouldn't happen");
                                m1087A.f6129ce = new C1049f();
                                m1087A.f6129ce.m775a(false);
                            }
                            m1087A.f6129ce.m782a(reader);
                        }
                        if (ReadInt >= 19) {
                            reader.m1314a("start of teams");
                        }
                        Core.m997b("gameSaver", "loading teams");
                        AbstractC0197n[] abstractC0197nArr = new AbstractC0197n[AbstractC0197n.f1367e];
                        int i = -1;
                        if (ReadInt >= 36) {
                            i = reader.ReadInt();
                        }
                        int i2 = 8;
                        if (ReadInt >= 49) {
                            i2 = reader.ReadInt();
                            AbstractC0197n.m5071b(i2, false);
                            for (int i3 = 0; i3 < AbstractC0197n.f1365c; i3++) {
                                if (i3 >= i2 && !z && (m5017k = AbstractC0197n.m5017k(i3)) != null) {
                                    m5017k.m5113G();
                                }
                            }
                        }
                        for (int i4 = 0; i4 < i2; i4++) {
                            C0136a m5017k2 = AbstractC0197n.m5017k(i4);
                            boolean ReadBool6 = reader.ReadBool();
                            boolean z7 = false;
                            if (ReadInt >= 7) {
                                z7 = reader.ReadBool();
                            }
                            if (reader.ReadBool()) {
                                if (ReadBool6) {
                                    if (m5017k2 == null || !(m5017k2 instanceof C0136a)) {
                                        if (z && !z3 && m5017k2 != null) {
                                            Core.m998b("Would replace team:" + i4 + " with AI, writing to dummy AI");
                                            m5017k2 = new C0136a(i4, false);
                                            abstractC0197nArr[i4] = m5017k2;
                                        } else {
                                            if (z3) {
                                                Core.m998b("Adding new AI " + i4 + " on resync");
                                            }
                                            m5017k2 = new C0136a(i4);
                                        }
                                    }
                                } else if (z7) {
                                    if (m5017k2 == null || !(m5017k2 instanceof C0185c)) {
                                        if (z) {
                                            Core.m998b("Replacing team:" + i4 + " with NetworkedPlayer");
                                        }
                                        m5017k2 = new C0185c(i4);
                                    }
                                } else if (m5017k2 == null || !(m5017k2 instanceof C0187e)) {
                                    if (z) {
                                        Core.m998b("Replacing team:" + i4 + " with Player");
                                        if (m5017k2 != null) {
                                            m5017k2.m5047c("Existing");
                                        }
                                    }
                                    m5017k2 = new C0187e(i4);
                                }
                                Integer num3 = m5017k2.f1320y;
                                if (ReadInt >= 2) {
                                    m5017k2.m5063b(reader);
                                } else {
                                    m5017k2.m5048c(reader);
                                }
                                if (!z3) {
                                    m5017k2.m5022i();
                                    if (z) {
                                        m5017k2.f1320y = num3;
                                        m5017k2.m5047c("networkLoad aiDifficultyOverride=" + num3);
                                        m1087A.f6122bX.m1611a(m5017k2);
                                        m1087A.f6122bX.m1544b(m5017k2);
                                    }
                                    if (m5017k2 != null && m5017k2 != m5017k2) {
                                        m5017k2.m5047c("Transfering team stats");
                                        m5017k2.f1310o = m5017k2.f1310o;
                                        m5017k2.m5101S().m4020a(m5017k2.m5101S());
                                    }
                                }
                            } else if (z && !m1087A.f6126cb.m2464h()) {
                                Core.m998b("GameSaver: Would normally remove team:" + i4 + VariableScope.nullOrMissingString);
                                abstractC0197nArr[i4] = AbstractC0197n.f1369g;
                            } else {
                                AbstractC0197n m5017k3 = AbstractC0197n.m5017k(i4);
                                if (m5017k3 != null) {
                                    m5017k3.m5113G();
                                }
                            }
                        }
                        boolean z8 = false;
                        m1087A.f6122bX.m1557aq();
                        if (m1087A.f6126cb.m2464h()) {
                            m1087A.f6099bs = AbstractC0197n.f1371i;
                        } else if (m1087A.f6122bX.lock1) {
                            if (m1087A.f6122bX.f5489z != null) {
                                int i5 = m1087A.f6122bX.f5489z.f1306k;
                                if (i5 != -3) {
                                    AbstractC0197n m5017k4 = AbstractC0197n.m5017k(i5);
                                    if (m5017k4 == null) {
                                        throw new RuntimeException("GameSaver: Cannot relink player team: " + i5);
                                    }
                                    m1087A.f6099bs = m5017k4;
                                }
                            }
                        } else if (i != -1 && i != -3) {
                            m1087A.f6099bs = AbstractC0197n.m5017k(i);
                        } else {
                            for (int i6 = 0; i6 < AbstractC0197n.f1365c; i6++) {
                                if (AbstractC0197n.m5017k(i6) instanceof C0187e) {
                                    m1087A.f6099bs = AbstractC0197n.m5017k(i6);
                                }
                            }
                        }
                        Iterator it2 = AbstractC1120w.m435dI().iterator();
                        while (it2.hasNext()) {
                            ((AbstractC1120w) it2.next()).mo2689a();
                        }
                        if (m1087A.m1062Z()) {
                            Iterator it3 = AbstractC1120w.m435dI().iterator();
                            while (it3.hasNext()) {
                                AbstractC1120w abstractC1120w2 = (AbstractC1120w) it3.next();
                                if (abstractC1120w2.f6951ee == 0) {
                                    if (abstractC1120w2 instanceof AbstractC0244am) {
                                        Core.LogDebug2("object: " + ((AbstractC0244am) abstractC1120w2).m4733cA());
                                    }
                                    throw new RuntimeException("GameLoad preload: Found object in list with id:0");
                                }
                            }
                        }
                        boolean z9 = false;
                        int ReadInt2 = reader.ReadInt();
                        for (int i7 = 0; i7 < ReadInt2; i7++) {
                            byte m1304d = reader.m1304d();
                            if (m1304d == 1) {
                                EnumC0249ar enumC0249ar = (EnumC0249ar) reader.m1308b(EnumC0249ar.class);
                                if (enumC0249ar == EnumC0249ar.f1785Y) {
                                    if (m1087A.f6126cb.m2464h() || m1087A.f6100bv) {
                                        Core.LogDebug2("Creating DebugEditorBuilder for replay");
                                        c0746f = new C0555h(false);
                                        C0555h m1825i = m1087A.f6117bS.m1825i();
                                        if (m1825i == null || m1825i.f6953eg) {
                                            Core.LogDebug2("Relinking editor");
                                            m1087A.f6117bS.m1879a((C0555h) c0746f);
                                        }
                                    } else {
                                        Core.LogDebug2("Creating DebugEditorBuilder for load");
                                        c0746f = new C0555h(false);
                                        z8 = true;
                                    }
                                } else {
                                    c0746f = enumC0249ar.mo4485a();
                                }
                            } else if (m1304d == 3) {
                                String ReadUTF2 = reader.ReadUTF();
                                C0453l m3673n = C0453l.m3673n(ReadUTF2);
                                if (m3673n == null) {
                                    String str2 = "Could not find custom unit:" + ReadUTF2;
                                    Core.LogDebug2(str2);
                                    if (!z9) {
                                        z9 = true;
                                        C0831ad.m1493g(str2);
                                    }
                                    m3673n = C0453l.f2903b;
                                    if (m3673n == null) {
                                        throw new RuntimeException("Could not find custom unit:" + ReadUTF2 + " and missingPlaceHolder is null");
                                    }
                                }
                                InterfaceC0303as m3698c = C0453l.m3698c(m3673n);
                                if (m3698c != null) {
                                    if (m3698c instanceof C0453l) {
                                        m3673n = (C0453l) m3698c;
                                    } else {
                                        Core.m998b("replacement not a custom unit:" + m3698c.mo4474i());
                                    }
                                }
                                c0746f = m3673n.mo4485a();
                            } else if (m1304d == 2) {
                                byte m1304d2 = reader.m1304d();
                                if (m1304d2 == 1) {
                                    c0746f = new C0195l();
                                } else if (m1304d2 == 2) {
                                    c0746f = new C0188f(false);
                                } else if (m1304d2 == 3) {
                                    c0746f = new C0746f(m1087A.f6116bR);
                                } else {
                                    throw new IOException("Unhandled gameType on load:" + ((int) m1304d2));
                                }
                            } else {
                                throw new IOException("Unhandled basic type on load:" + ((int) m1304d));
                            }
                            c0746f.f6951ee = reader.m1298i();
                            if (c0746f.f6951ee == 0) {
                                Core.m998b("GameSaver: Adding object with id==0");
                                if (c0746f instanceof AbstractC0244am) {
                                    Core.m998b(((AbstractC0244am) c0746f).m4732cB());
                                }
                            }
                            AbstractC1120w.m434dJ();
                        }
                        if (ReadInt >= 3) {
                            long m1298i = reader.m1298i();
                            if (m1298i <= 0) {
                                Core.m1046a("GameLoad: Trying to set next unit id <= 0: " + m1298i);
                                m1298i = 100000;
                            }
                            m1087A.f6122bX.m1615a(m1298i);
                        } else {
                            m1087A.f6122bX.m1615a(100000L);
                        }
                        if (ReadInt >= 24) {
                            m1087A.f6120bV.m2762a(reader);
                        }
                        if (ReadInt >= 4) {
                            m1087A.f6117bS.m1871a(reader, z3);
                        }
                        if (ReadInt >= 57) {
                            m1087A.f6123bY.m2446a(reader, z3);
                        }
                        if (ReadInt >= 7) {
                            for (int i8 = 0; i8 < i2; i8++) {
                                AbstractC0197n m5017k5 = AbstractC0197n.m5017k(i8);
                                if (abstractC0197nArr[i8] != null) {
                                    m5017k5 = abstractC0197nArr[i8];
                                    if (m5017k5 == AbstractC0197n.f1369g) {
                                        m5017k5 = null;
                                    }
                                }
                                if (m5017k5 != null) {
                                    Integer num4 = m5017k5.f1320y;
                                    m5017k5.m5048c(reader);
                                    if (!z3) {
                                        if (z) {
                                            m5017k5.f1320y = num4;
                                            m5017k5.m5047c("networkLoad2 aiDifficultyOverride=" + num4);
                                        }
                                        m1087A.f6122bX.m1611a(m5017k5);
                                        m1087A.f6122bX.m1544b(m5017k5);
                                    }
                                }
                            }
                        } else if (ReadInt >= 2) {
                        }
                        if (ReadInt >= 10) {
                            reader.m1314a("Pre-unit data");
                        }
                        c0727bl.m2436a(EnumC0729bm.f4603A);
                        C1104o m435dI = AbstractC1120w.m435dI();
                        Core.m997b("gameSaver", "Loading unit data for " + m435dI.size() + " objects.");
                        Iterator it4 = m435dI.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC1120w) it4.next()).m440a(reader);
                            if (ReadInt >= 10) {
                                reader.m1314a("post unit: " + abstractC1120w.getClass().toString() + " with id:" + abstractC1120w.f6951ee);
                            }
                        }
                        Core.m997b("gameSaver", "Loading unit data done.");
                        c0727bl.m2431b(EnumC0729bm.f4603A);
                        if (z8) {
                            Iterator it5 = AbstractC1120w.m435dI().iterator();
                            while (it5.hasNext()) {
                                AbstractC1120w abstractC1120w3 = (AbstractC1120w) it5.next();
                                if (abstractC1120w3 instanceof AbstractC0244am) {
                                    AbstractC0244am abstractC0244am = (AbstractC0244am) abstractC1120w3;
                                    if (!m1087A.f6126cb.m2464h() && !m1087A.f6100bv && abstractC0244am.mo1758r() == EnumC0249ar.f1785Y) {
                                        abstractC0244am.m4700ch();
                                    }
                                }
                            }
                        }
                        if (ReadInt >= 23) {
                            reader.m1303d("saveCompression");
                        }
                        if (ReadInt >= 19) {
                            reader.m1314a("End of Save");
                            reader.ReadUTF();
                        }
                        Core.m997b("gameSaver", "Checking for ID overlaps");
                        int i9 = 0;
                        if (1 != 0) {
                            AbstractC1120w[] m514a = AbstractC1120w.f6962eo.m514a();
                            int size = AbstractC1120w.f6962eo.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                AbstractC1120w abstractC1120w4 = m514a[i10];
                                if (abstractC1120w4.f6951ee == 0) {
                                    Core.m998b("GameSaver: Fixing object with zero id.");
                                    abstractC1120w4.f6951ee = m1087A.f6122bX.m1458y();
                                }
                                for (int i11 = i10 + 1; i11 < size; i11++) {
                                    AbstractC1120w abstractC1120w5 = m514a[i11];
                                    if (abstractC1120w4 != abstractC1120w5 && abstractC1120w4.f6951ee == abstractC1120w5.f6951ee) {
                                        i9++;
                                        abstractC1120w5.f6951ee = m1087A.f6122bX.m1458y();
                                    }
                                }
                            }
                        }
                        Core.m997b("gameSaver", "clearing out dead units.");
                        Core.LogDebug2("Unit.fastLiveUnitList before:" + AbstractC0244am.f1590bD.size());
                        Iterator it6 = AbstractC0244am.f1590bD.iterator();
                        while (it6.hasNext()) {
                            if (((AbstractC0244am) it6.next()).f1607bT) {
                                it6.remove();
                            }
                        }
                        Core.LogDebug2("Unit.fastLiveUnitList after:" + AbstractC0244am.f1590bD.size());
                        if (i9 > 0) {
                            if (ReadInt <= 2) {
                                m1087A.m1045a("Warning: " + i9 + " errors were found in this save, this is due to a bug in the old version", 1);
                            } else {
                                m1087A.m1045a("Warning: " + i9 + " errors were found in this save", 1);
                            }
                        }
                        Core.m997b("gameSaver", "Fixing map cost.");
                        m1087A.f6119bU.m1165a((AbstractC0623y) null);
                        m1087A.f6119bU.m1156b();
                        Core.m997b("gameSaver", "Fixing map cost done.");
                        AbstractC0197n.m5108L();
                        for (int i12 = 0; i12 < AbstractC0197n.f1365c; i12++) {
                            AbstractC0197n m5017k6 = AbstractC0197n.m5017k(i12);
                            if (m5017k6 != null) {
                                m5017k6.m5037d(false);
                            }
                        }
                        AbstractC0197n.m5036e();
                        Core.m997b("gameSaver", "Rebuilt unit caches");
                        AbstractC0197n.m5108L();
                        AbstractC0197n.m5099U();
                        for (int i13 = 0; i13 < AbstractC0197n.f1365c; i13++) {
                            AbstractC0197n m5017k7 = AbstractC0197n.m5017k(i13);
                            if (m5017k7 != null && (m5017k7 instanceof C0136a)) {
                                ((C0136a) m5017k7).m5545am();
                            }
                        }
                        if (arrayList != null) {
                            m1087A.f6117bS.m1800x();
                            Iterator it7 = arrayList.iterator();
                            while (it7.hasNext()) {
                                AbstractC0244am m442a = AbstractC1120w.m442a(((Long) it7.next()).longValue(), true);
                                if (m442a != null) {
                                    m1087A.f6117bS.m1820k(m442a);
                                }
                            }
                        }
                        if (m1087A.m1062Z()) {
                            Iterator it8 = AbstractC1120w.m435dI().iterator();
                            while (it8.hasNext()) {
                                AbstractC1120w abstractC1120w6 = (AbstractC1120w) it8.next();
                                if (abstractC1120w6.f6951ee == 0) {
                                    if (abstractC1120w6 instanceof AbstractC0244am) {
                                        Core.LogDebug2("object: " + ((AbstractC0244am) abstractC1120w6).m4733cA());
                                    }
                                    throw new RuntimeException("GameLoad postload: Found object in list with id:0");
                                }
                            }
                        }
                        Core.LogDebug2("--- Save file load complete ---");
                        Core.LogDebug2("GameObject.fastGameObjectList:" + AbstractC1120w.f6962eo.size());
                        Core.LogDebug2("Unit.fastLiveUnitList:" + AbstractC0244am.f1590bD.size());
                        if (!z3) {
                            m1087A.f6126cb.m2476a(z3);
                        }
                        if (this.f6964b) {
                            c0727bl.m2431b(EnumC0729bm.f4601y);
                            c0727bl.m2434a(true, true);
                        }
                    }
                    return true;
                } catch (EOFException e2) {
                    e2.printStackTrace();
                    Core.m998b("Failed to load save. (End of file trying to read header)");
                    m1087A.m1045a("Failed to load save. (End of file trying to read header)", 1);
                    return false;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                String str3 = "Failed to load save. (Failed to read header: " + e3.getMessage() + ")";
                Core.m998b(str3);
                m1087A.m1045a(str3, 1);
                return false;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            Core.LogDebug2("Save load error, clearing all units");
            Iterator it9 = AbstractC1120w.m435dI().iterator();
            while (it9.hasNext()) {
                AbstractC1120w abstractC1120w7 = (AbstractC1120w) it9.next();
                if (abstractC1120w7.f6951ee == 0) {
                    abstractC1120w7.f6951ee = m1087A.f6122bX.m1458y();
                }
                abstractC1120w7.mo2689a();
            }
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    public boolean m420b(String str) {
        Core.LogDebug2("Deleting: " + str);
        String m2265n = C0750a.m2265n(str);
        if (m2265n.contains("\\") || m2265n.contains("/")) {
            Core.LogDebug2("Cannot get save with path: " + str);
            return false;
        }
        File m423a = m423a(str, true);
        boolean m2285b = C0750a.m2285b(m423a);
        C0750a.m2285b(m423a(str + ".map", true));
        if (!m2285b) {
            Core.LogDebug2("Failed to delete: " + m423a.getAbsolutePath());
            Core.m1087A().m969i("Failed to delete: " + m423a.getAbsolutePath());
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m422a(boolean z) {
        Core.m1087A();
        if (!z) {
            this.f6965c = -9999;
            this.f6966d = -9999;
        }
    }

    /* renamed from: a */
    public boolean m429a() {
        Core m1087A = Core.m1087A();
        if (!m1087A.settingEngine.autosaving || Core.m1008aw() || !m1087A.f6242bG || m1087A.f6243bH || m1087A.f6126cb.m2464h() || m1087A.m1076L()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m421b() {
        Core m1087A = Core.m1087A();
        if (!m429a()) {
            return;
        }
        if (this.f6966d == -9999) {
            this.f6965c = m1087A.f6102by;
            this.f6966d = m1087A.f6102by;
        }
        if (this.f6966d + 300000 < m1087A.f6102by) {
            this.f6966d = m1087A.f6102by;
            long m2440a = C0727bl.m2440a();
            m418c();
            Core.LogDebug2("Autosaved (" + C0727bl.m2439a(C0727bl.m2438a(m2440a)) + ")");
        }
    }

    /* renamed from: c */
    public void m418c() {
        m419b("autosave", true);
    }
}
