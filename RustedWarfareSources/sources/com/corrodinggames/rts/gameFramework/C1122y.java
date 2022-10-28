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
        if (!LoggerMaybe.f6190as) {
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
        return C0750a.m2237a(str, str2, z);
    }

    /* renamed from: b */
    public void m419b(String str, boolean z) {
        File m423a;
        File m423a2;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
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
            LoggerMaybe.LogDebug2("Saving game to: " + m423a2.getAbsolutePath());
            OutputStream m2240a = C0750a.m2240a(m423a, false);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m2240a);
            if (!f6963a) {
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                try {
                    m428a(new StreamWriter(dataOutputStream));
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    m2240a.close();
                } catch (Throwable th) {
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    m2240a.close();
                    throw th;
                }
            } else {
                PrintStream printStream = new PrintStream(bufferedOutputStream);
                try {
                    m428a(new C0863av(printStream));
                    printStream.close();
                    bufferedOutputStream.close();
                    m2240a.close();
                    LoggerMaybe.m944n("DEBUG plain text save created");
                } catch (Throwable th2) {
                    printStream.close();
                    bufferedOutputStream.close();
                    m2240a.close();
                    throw th2;
                }
            }
            if (z && LoggerMaybe.m997as() && C0750a.m2219h(m423a2.getAbsolutePath())) {
                LoggerMaybe.LogDebug2("Autosave file already exists: " + m423a2.getAbsolutePath());
                if (!C0750a.m2233b(m423a2)) {
                    LoggerMaybe.LogDebug2("Old autosave failed to delete");
                }
            }
            LoggerMaybe.LogDebug2("Finished writing save, renaming to final filename");
        } catch (Exception e) {
            if (z) {
                LoggerMaybe.LogDebug2("Auto save failed: " + e.getMessage());
                return;
            }
            e.printStackTrace();
            m1072A.m1030a("Error saving game to SD card, please check permissions, disk space, etc. (" + C0758f.m2095b(e) + ")", 1);
            if (0 != 0 && C0750a.m2219h(file.getAbsolutePath())) {
                LoggerMaybe.LogDebug2("saveGame: Removing temp save file after crash");
                C0750a.m2233b((File) null);
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            m1072A.m1030a("Error. Run out of memory error while saving game to SD card.", 1);
            if (0 != 0 && C0750a.m2219h(file.getAbsolutePath())) {
                LoggerMaybe.LogDebug2("saveGame: Removing temp save file after crash");
                C0750a.m2233b((File) null);
            }
        }
        if (!C0750a.m2232b(m423a, m423a2)) {
            LoggerMaybe.LogDebug2("Failed to rename to final file");
            throw new IOException("Failed to rename to final file. Check file permissions of storage.");
        }
        C0750a.m2228c(m423a2);
        z2 = true;
        if (z2) {
            if (z) {
                m1072A.f6117bS.f5114f.m1901a("Auto Saved", 1000);
            } else {
                m1072A.f6117bS.f5113e.m1750a(null, "Game saved");
            }
        }
    }

    /* renamed from: a */
    public void m428a(StreamWriter streamWriter) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        LoggerMaybe.m982b("GameSaver", "saveCurrentMap took:" + (System.currentTimeMillis() - System.currentTimeMillis()));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            streamWriter.WriteUTF("rustedWarfareSave");
            streamWriter.WriteInteger(m1072A.mo973c(true));
            streamWriter.WriteInteger(95);
            streamWriter.mo1314a(m1072A.f6228ar);
            streamWriter.mo1316a("saveCompression", true);
            streamWriter.mo1350e("customUnitsBlock");
            C0453l.m3543a(streamWriter);
            streamWriter.mo1317a("customUnitsBlock");
            streamWriter.mo1350e("gameSetup");
            boolean z = m1072A.f6122bX.lock1 || m1072A.f6122bX.f5571F;
            streamWriter.mo1314a(m1072A.f6122bX.lock1);
            streamWriter.mo1314a(m1072A.f6122bX.f5571F);
            streamWriter.mo1314a(z);
            if (z) {
                m1072A.f6122bX.m1560a(streamWriter);
            }
            streamWriter.mo1317a("gameSetup");
            streamWriter.WriteUTF(m1072A.f6165dk);
            boolean z2 = m1072A.f6166dl != null;
            streamWriter.mo1314a(z2);
            if (z2) {
                LoggerMaybe.LogDebug2("Writing remote map steam into save");
                streamWriter.m1383a(m1072A.f6166dl);
            }
            streamWriter.WriteInteger(m1072A.f6102by);
            streamWriter.mo1320a(m1072A.f6146cx + m1072A.f6156cH);
            streamWriter.mo1320a(m1072A.f6147cy + m1072A.f6157cI);
            streamWriter.mo1320a(m1072A.f6254cU);
            streamWriter.WriteInteger(m1072A.f6120bV.f4072a);
            streamWriter.WriteInteger(0);
            streamWriter.mo1351e();
            m1072A.f6110bL.m4839a(streamWriter);
            streamWriter.mo1314a(m1072A.f6100bv);
            streamWriter.mo1314a(m1072A.f6110bL.f841E);
            streamWriter.mo1314a(m1072A.f6110bL.f842F);
            streamWriter.mo1314a(m1072A.f6110bL.f843G);
            streamWriter.mo1314a(m1072A.f6129ce != null);
            if (m1072A.f6129ce != null) {
                m1072A.f6129ce.mo2292a(streamWriter);
            }
            streamWriter.mo1351e();
            int i = -1;
            if (m1072A.f6099bs != null) {
                i = m1072A.f6099bs.f1306k;
            }
            streamWriter.WriteInteger(i);
            streamWriter.WriteInteger(AbstractC0197n.f1365c);
            for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                AbstractC0197n m4562k = AbstractC0197n.m4562k(i2);
                streamWriter.mo1314a(m4562k instanceof C0136a);
                streamWriter.mo1314a(m4562k instanceof C0185c);
                streamWriter.mo1314a(m4562k != null);
                if (m4562k != null) {
                    m4562k.m4609b(streamWriter);
                }
            }
            if (!m1072A.f6117bS.f5197b) {
            }
            streamWriter.mo1352d("Section: unit shells");
            streamWriter.WriteInteger(AbstractC1120w.f6962eo.size());
            Iterator it = AbstractC1120w.f6962eo.iterator();
            while (it.hasNext()) {
                AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                if (abstractC1120w == null) {
                    throw new RuntimeException("Found null in fastGameObjectList");
                }
                if (abstractC1120w instanceof AbstractC0244am) {
                    AbstractC0244am abstractC0244am = (AbstractC0244am) abstractC1120w;
                    if (abstractC0244am.mo5649r() instanceof EnumC0249ar) {
                        streamWriter.mo1355c(1);
                        streamWriter.mo1363a((Enum) ((EnumC0249ar) abstractC0244am.mo5649r()));
                    } else if (abstractC0244am.mo5649r() instanceof C0453l) {
                        streamWriter.mo1355c(3);
                        streamWriter.WriteUTF(((C0453l) abstractC0244am.mo5649r()).f2922L);
                    } else {
                        throw new IOException("Unhandled getUnitType on save:" + abstractC0244am.mo5649r().getClass().toString());
                    }
                } else {
                    streamWriter.mo1355c(2);
                    if (abstractC1120w instanceof C0195l) {
                        streamWriter.mo1355c(1);
                    } else if (abstractC1120w instanceof C0188f) {
                        streamWriter.mo1355c(2);
                    } else if (abstractC1120w instanceof C0746f) {
                        streamWriter.mo1355c(3);
                    } else {
                        String str = null;
                        if (abstractC1120w.getClass() != null) {
                            str = abstractC1120w.getClass().toString();
                        }
                        throw new IOException("Unhandled class on save: " + str);
                    }
                }
                streamWriter.mo1373a(abstractC1120w.f6951ee);
            }
            streamWriter.mo1352d("Section: CurrentUnitId");
            streamWriter.mo1373a(m1072A.f6122bX.m1413z());
            m1072A.f6120bV.mo2292a(streamWriter);
            m1072A.f6117bS.mo2292a(streamWriter);
            m1072A.f6123bY.m2394a(streamWriter);
            for (int i3 = 0; i3 < AbstractC0197n.f1365c; i3++) {
                AbstractC0197n m4562k2 = AbstractC0197n.m4562k(i3);
                if (m4562k2 != null) {
                    m4562k2.mo2292a(streamWriter);
                }
            }
            streamWriter.mo1351e();
            Iterator it2 = AbstractC1120w.f6962eo.iterator();
            while (it2.hasNext()) {
                AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                if (streamWriter.mo1349f()) {
                    String simpleName = abstractC1120w2.getClass().getSimpleName();
                    if (abstractC1120w2 instanceof AbstractC0244am) {
                        simpleName = ((AbstractC0244am) abstractC1120w2).mo5649r().mo4252i();
                    }
                    streamWriter.mo1352d("Saving unit:" + simpleName + " (id" + abstractC1120w2.f6951ee + ")");
                }
                abstractC1120w2.mo2292a(streamWriter);
                streamWriter.mo1351e();
            }
            streamWriter.mo1317a("saveCompression");
            streamWriter.mo1351e();
            streamWriter.WriteUTF("<SAVE END>");
        } catch (Exception e) {
            e.printStackTrace();
            m1072A.m1030a("Error saving game to SD card, please email the logs.", 1);
        }
        LoggerMaybe.m982b("GameSaver", "saveGame took:" + (System.currentTimeMillis() - currentTimeMillis));
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
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        try {
            File m423a = m423a(str, false);
            if (m423a.isDirectory()) {
                m1072A.m1030a("Could not load, is a directory", 1);
                return false;
            }
            C1098j m2217j = C0750a.m2217j(m423a.getAbsolutePath());
            if (m2217j == null) {
                m1072A.m1030a("Could not load, failed to open: " + C0750a.m2225d(m423a.getAbsolutePath()), 1);
                return false;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m2217j);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean m427a = m427a(new Reader(dataInputStream), z, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            m2217j.close();
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
        streamWriter.mo1365a(m423a);
    }

    /* renamed from: a */
    public synchronized boolean m427a(Reader reader, boolean z, boolean z2, boolean z3) {
        AbstractC1120w abstractC1120w;
        AbstractC1120w c0746f;
        AbstractC0197n m4562k;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        try {
            C0727bl c0727bl = m1072A.f6128cd;
            if (this.f6964b) {
                c0727bl.m2384a(EnumC0729bm.load_total);
            }
            ArrayList arrayList = null;
            if (z3) {
                arrayList = new ArrayList();
                Iterator it = m1072A.f6117bS.f5261bL.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((AbstractC0244am) it.next()).f6951ee));
                }
            }
            try {
                try {
                    String ReadUTF = reader.ReadUTF();
                    if (!ReadUTF.equals("rustedWarfareSave")) {
                        LoggerMaybe.m983b("Map Load: Header is not correct:" + ReadUTF.substring(0, Math.min(ReadUTF.length(), 50)));
                        String str = "Failed to load save. (Could not find correct header)";
                        if (ReadUTF.equals("rustedWarfareReplay")) {
                            str = "Failed to load save. (This file appears to be a replay file, not a save file)";
                        }
                        LoggerMaybe.m983b(str);
                        m1072A.m1030a(str, 1);
                        return false;
                    }
                    reader.ReadInt();
                    int ReadInt = reader.ReadInt();
                    LoggerMaybe.m982b("gameSaver", "Loading save from version: " + ReadInt);
                    reader.m1303a(ReadInt);
                    if (ReadInt > 95) {
                        m1072A.m1030a("Cannot load: This save was made with a newer game", 1);
                        return false;
                    }
                    if (ReadInt >= 5) {
                        reader.ReadBool();
                    }
                    if (ReadInt >= 23) {
                        c0727bl.m2384a(EnumC0729bm.load_compression);
                        reader.m1298a("saveCompression", true);
                        c0727bl.m2379b(EnumC0729bm.load_compression);
                    }
                    if (ReadInt >= 54) {
                        reader.m1292b("customUnitsBlock");
                        if (m1072A.f6126cb.m2411h() && !z3) {
                            LoggerMaybe.LogDebug2("Loading mods from replay");
                            try {
                                C0453l.m3542a(reader);
                                C0348af.m4063d();
                            } catch (C0401bb e) {
                                LoggerMaybe.LogDebug2("Replay load: Missing unit:" + e.getMessage() + " d:" + e.f2631b);
                                m1072A.m954i(e.getMessage() + ", this is likely to cause the replay to desync (reverting to default units & mods)");
                                C0348af.m4068b(true);
                            }
                        }
                        reader.m1288d("customUnitsBlock");
                    }
                    Integer num = null;
                    Integer num2 = null;
                    if (m1072A.f6126cb.m2411h() && z3) {
                        num = Integer.valueOf(m1072A.f6105bB);
                        num2 = Integer.valueOf(m1072A.f6106bC);
                    }
                    if (ReadInt >= 56) {
                        reader.m1292b("gameSetup");
                        boolean ReadBool = reader.ReadBool();
                        boolean z4 = ReadBool;
                        boolean z5 = false;
                        if (ReadInt >= 94) {
                            z5 = reader.ReadBool();
                            z4 = reader.ReadBool();
                        }
                        if ((m1072A.f6126cb.m2411h() || !m1072A.f6122bX.lock1) && !z3 && z4) {
                            LoggerMaybe.LogDebug2("Using game rules from save");
                            m1072A.f6126cb.f4507M = true;
                            m1072A.f6122bX.m1547a(reader);
                            num = Integer.valueOf(m1072A.f6105bB);
                            num2 = Integer.valueOf(m1072A.f6106bC);
                            if ((ReadBool || z5) && !m1072A.f6122bX.f5571F && !m1072A.f6122bX.lock1 && !m1072A.f6126cb.m2411h()) {
                                LoggerMaybe.LogDebug2("Enabling use of singlePlayer rules from saved game.");
                                m1072A.f6122bX.f5571F = true;
                            }
                        }
                        reader.m1288d("gameSetup");
                    }
                    m1072A.f6166dl = null;
                    m1072A.f6165dk = m426a(C0750a.m2213n(reader.ReadUTF()));
                    boolean z6 = false;
                    if (ReadInt >= 72) {
                        z6 = reader.ReadBool();
                        if (z6) {
                            LoggerMaybe.LogDebug2("Reading remote map stream");
                            m1072A.f6166dl = reader.m1271u();
                        }
                    }
                    if (m1072A.f6122bX.lock1 && !m1072A.f6122bX.IsServer && z3 && m1072A.f6122bX.f5525aR != null && !z6) {
                        m1072A.f6165dk = VariableScope.nullOrMissingString;
                        m1072A.f6166dl = m1072A.f6122bX.f5525aR;
                    }
                    c0727bl.m2384a(EnumC0729bm.load_map);
                    if (z3) {
                        m1072A.mo1021a(true, true, EnumC1063s.normalSave);
                        if (LoggerMaybe.m997as()) {
                            m1072A.f6272du = true;
                        }
                    } else {
                        m1072A.mo1022a(true, EnumC1063s.normalSave);
                    }
                    if (!m1072A.f6110bL.f803W) {
                        LoggerMaybe.LogDebug2("Not loading save because map failed to load");
                        return false;
                    }
                    if (num != null) {
                        m1072A.f6105bB = num.intValue();
                    }
                    if (num2 != null) {
                        Integer.valueOf(m1072A.f6106bC);
                    }
                    synchronized (m1072A) {
                        c0727bl.m2379b(EnumC0729bm.load_map);
                        m1072A.f6102by = reader.ReadInt();
                        float m1285g = reader.m1285g();
                        float m1285g2 = reader.m1285g();
                        float m1285g3 = reader.m1285g();
                        if (!z3) {
                            m1072A.m988b(m1285g, m1285g2);
                            m1072A.f6254cU = m1285g3;
                        }
                        if (ReadInt >= 18) {
                            m1072A.f6120bV.f4072a = reader.ReadInt();
                        }
                        reader.ReadInt();
                        if (ReadInt >= 19) {
                            reader.m1299a("end of setup");
                        }
                        m1072A.f6110bL.m4838a(reader);
                        if (ReadInt >= 86) {
                            boolean ReadBool2 = reader.ReadBool();
                            boolean ReadBool3 = reader.ReadBool();
                            boolean ReadBool4 = reader.ReadBool();
                            boolean ReadBool5 = reader.ReadBool();
                            if (!z && !ReadBool2) {
                                m1072A.f6110bL.f841E = ReadBool3;
                                m1072A.f6110bL.f842F = ReadBool4;
                                m1072A.f6110bL.f843G = ReadBool5;
                            }
                        }
                        if (reader.ReadBool()) {
                            if (m1072A.f6129ce == null) {
                                LoggerMaybe.m982b("gameSaver", "making new mission engine on load, this shouldn't happen");
                                m1072A.f6129ce = new C1049f();
                                m1072A.f6129ce.m762a(false);
                            }
                            m1072A.f6129ce.m769a(reader);
                        }
                        if (ReadInt >= 19) {
                            reader.m1299a("start of teams");
                        }
                        LoggerMaybe.m982b("gameSaver", "loading teams");
                        AbstractC0197n[] abstractC0197nArr = new AbstractC0197n[AbstractC0197n.f1367e];
                        int i = -1;
                        if (ReadInt >= 36) {
                            i = reader.ReadInt();
                        }
                        int i2 = 8;
                        if (ReadInt >= 49) {
                            i2 = reader.ReadInt();
                            AbstractC0197n.m4616b(i2, false);
                            for (int i3 = 0; i3 < AbstractC0197n.f1365c; i3++) {
                                if (i3 >= i2 && !z && (m4562k = AbstractC0197n.m4562k(i3)) != null) {
                                    m4562k.m4658G();
                                }
                            }
                        }
                        for (int i4 = 0; i4 < i2; i4++) {
                            C0136a m4562k2 = AbstractC0197n.m4562k(i4);
                            boolean ReadBool6 = reader.ReadBool();
                            boolean z7 = false;
                            if (ReadInt >= 7) {
                                z7 = reader.ReadBool();
                            }
                            if (reader.ReadBool()) {
                                if (ReadBool6) {
                                    if (m4562k2 == null || !(m4562k2 instanceof C0136a)) {
                                        if (z && !z3 && m4562k2 != null) {
                                            LoggerMaybe.m983b("Would replace team:" + i4 + " with AI, writing to dummy AI");
                                            m4562k2 = new C0136a(i4, false);
                                            abstractC0197nArr[i4] = m4562k2;
                                        } else {
                                            if (z3) {
                                                LoggerMaybe.m983b("Adding new AI " + i4 + " on resync");
                                            }
                                            m4562k2 = new C0136a(i4);
                                        }
                                    }
                                } else if (z7) {
                                    if (m4562k2 == null || !(m4562k2 instanceof C0185c)) {
                                        if (z) {
                                            LoggerMaybe.m983b("Replacing team:" + i4 + " with NetworkedPlayer");
                                        }
                                        m4562k2 = new C0185c(i4);
                                    }
                                } else if (m4562k2 == null || !(m4562k2 instanceof C0187e)) {
                                    if (z) {
                                        LoggerMaybe.m983b("Replacing team:" + i4 + " with Player");
                                        if (m4562k2 != null) {
                                            m4562k2.m4592c("Existing");
                                        }
                                    }
                                    m4562k2 = new C0187e(i4);
                                }
                                Integer num3 = m4562k2.f1320y;
                                if (ReadInt >= 2) {
                                    m4562k2.m4608b(reader);
                                } else {
                                    m4562k2.m4593c(reader);
                                }
                                if (!z3) {
                                    m4562k2.m4567i();
                                    if (z) {
                                        m4562k2.f1320y = num3;
                                        m4562k2.m4592c("networkLoad aiDifficultyOverride=" + num3);
                                        m1072A.f6122bX.m1567a(m4562k2);
                                        m1072A.f6122bX.m1500b(m4562k2);
                                    }
                                    if (m4562k2 != null && m4562k2 != m4562k2) {
                                        m4562k2.m4592c("Transfering team stats");
                                        m4562k2.f1310o = m4562k2.f1310o;
                                        m4562k2.m4646S().m3813a(m4562k2.m4646S());
                                    }
                                }
                            } else if (z && !m1072A.f6126cb.m2411h()) {
                                LoggerMaybe.m983b("GameSaver: Would normally remove team:" + i4 + VariableScope.nullOrMissingString);
                                abstractC0197nArr[i4] = AbstractC0197n.f1369g;
                            } else {
                                AbstractC0197n m4562k3 = AbstractC0197n.m4562k(i4);
                                if (m4562k3 != null) {
                                    m4562k3.m4658G();
                                }
                            }
                        }
                        boolean z8 = false;
                        m1072A.f6122bX.m1513aq();
                        if (m1072A.f6126cb.m2411h()) {
                            m1072A.f6099bs = AbstractC0197n.f1371i;
                        } else if (m1072A.f6122bX.lock1) {
                            if (m1072A.f6122bX.f5489z != null) {
                                int i5 = m1072A.f6122bX.f5489z.f1306k;
                                if (i5 != -3) {
                                    AbstractC0197n m4562k4 = AbstractC0197n.m4562k(i5);
                                    if (m4562k4 == null) {
                                        throw new RuntimeException("GameSaver: Cannot relink player team: " + i5);
                                    }
                                    m1072A.f6099bs = m4562k4;
                                }
                            }
                        } else if (i != -1 && i != -3) {
                            m1072A.f6099bs = AbstractC0197n.m4562k(i);
                        } else {
                            for (int i6 = 0; i6 < AbstractC0197n.f1365c; i6++) {
                                if (AbstractC0197n.m4562k(i6) instanceof C0187e) {
                                    m1072A.f6099bs = AbstractC0197n.m4562k(i6);
                                }
                            }
                        }
                        Iterator it2 = AbstractC1120w.m435dI().iterator();
                        while (it2.hasNext()) {
                            ((AbstractC1120w) it2.next()).mo2635a();
                        }
                        if (m1072A.m1047Z()) {
                            Iterator it3 = AbstractC1120w.m435dI().iterator();
                            while (it3.hasNext()) {
                                AbstractC1120w abstractC1120w2 = (AbstractC1120w) it3.next();
                                if (abstractC1120w2.f6951ee == 0) {
                                    if (abstractC1120w2 instanceof AbstractC0244am) {
                                        LoggerMaybe.LogDebug2("object: " + ((AbstractC0244am) abstractC1120w2).m4380cA());
                                    }
                                    throw new RuntimeException("GameLoad preload: Found object in list with id:0");
                                }
                            }
                        }
                        boolean z9 = false;
                        int ReadInt2 = reader.ReadInt();
                        for (int i7 = 0; i7 < ReadInt2; i7++) {
                            byte m1289d = reader.m1289d();
                            if (m1289d == 1) {
                                EnumC0249ar enumC0249ar = (EnumC0249ar) reader.m1293b(EnumC0249ar.class);
                                if (enumC0249ar == EnumC0249ar.f1785Y) {
                                    if (m1072A.f6126cb.m2411h() || m1072A.f6100bv) {
                                        LoggerMaybe.LogDebug2("Creating DebugEditorBuilder for replay");
                                        c0746f = new C0555h(false);
                                        C0555h m1781i = m1072A.f6117bS.m1781i();
                                        if (m1781i == null || m1781i.f6952eg) {
                                            LoggerMaybe.LogDebug2("Relinking editor");
                                            m1072A.f6117bS.m1835a((C0555h) c0746f);
                                        }
                                    } else {
                                        LoggerMaybe.LogDebug2("Creating DebugEditorBuilder for load");
                                        c0746f = new C0555h(false);
                                        z8 = true;
                                    }
                                } else {
                                    c0746f = enumC0249ar.mo4263a();
                                }
                            } else if (m1289d == 3) {
                                String ReadUTF2 = reader.ReadUTF();
                                C0453l m3495n = C0453l.m3495n(ReadUTF2);
                                if (m3495n == null) {
                                    String str2 = "Could not find custom unit:" + ReadUTF2;
                                    LoggerMaybe.LogDebug2(str2);
                                    if (!z9) {
                                        z9 = true;
                                        C0831ad.m1449g(str2);
                                    }
                                    m3495n = C0453l.f2903b;
                                    if (m3495n == null) {
                                        throw new RuntimeException("Could not find custom unit:" + ReadUTF2 + " and missingPlaceHolder is null");
                                    }
                                }
                                InterfaceC0303as m3520c = C0453l.m3520c(m3495n);
                                if (m3520c != null) {
                                    if (m3520c instanceof C0453l) {
                                        m3495n = (C0453l) m3520c;
                                    } else {
                                        LoggerMaybe.m983b("replacement not a custom unit:" + m3520c.mo4252i());
                                    }
                                }
                                c0746f = m3495n.mo4263a();
                            } else if (m1289d == 2) {
                                byte m1289d2 = reader.m1289d();
                                if (m1289d2 == 1) {
                                    c0746f = new C0195l();
                                } else if (m1289d2 == 2) {
                                    c0746f = new C0188f(false);
                                } else if (m1289d2 == 3) {
                                    c0746f = new C0746f(m1072A.f6116bR);
                                } else {
                                    throw new IOException("Unhandled gameType on load:" + ((int) m1289d2));
                                }
                            } else {
                                throw new IOException("Unhandled basic type on load:" + ((int) m1289d));
                            }
                            c0746f.f6951ee = reader.m1283i();
                            if (c0746f.f6951ee == 0) {
                                LoggerMaybe.m983b("GameSaver: Adding object with id==0");
                                if (c0746f instanceof AbstractC0244am) {
                                    LoggerMaybe.m983b(((AbstractC0244am) c0746f).m4379cB());
                                }
                            }
                            AbstractC1120w.m434dJ();
                        }
                        if (ReadInt >= 3) {
                            long m1283i = reader.m1283i();
                            if (m1283i <= 0) {
                                LoggerMaybe.m1031a("GameLoad: Trying to set next unit id <= 0: " + m1283i);
                                m1283i = 100000;
                            }
                            m1072A.f6122bX.m1571a(m1283i);
                        } else {
                            m1072A.f6122bX.m1571a(100000L);
                        }
                        if (ReadInt >= 24) {
                            m1072A.f6120bV.m2708a(reader);
                        }
                        if (ReadInt >= 4) {
                            m1072A.f6117bS.m1827a(reader, z3);
                        }
                        if (ReadInt >= 57) {
                            m1072A.f6123bY.m2393a(reader, z3);
                        }
                        if (ReadInt >= 7) {
                            for (int i8 = 0; i8 < i2; i8++) {
                                AbstractC0197n m4562k5 = AbstractC0197n.m4562k(i8);
                                if (abstractC0197nArr[i8] != null) {
                                    m4562k5 = abstractC0197nArr[i8];
                                    if (m4562k5 == AbstractC0197n.f1369g) {
                                        m4562k5 = null;
                                    }
                                }
                                if (m4562k5 != null) {
                                    Integer num4 = m4562k5.f1320y;
                                    m4562k5.m4593c(reader);
                                    if (!z3) {
                                        if (z) {
                                            m4562k5.f1320y = num4;
                                            m4562k5.m4592c("networkLoad2 aiDifficultyOverride=" + num4);
                                        }
                                        m1072A.f6122bX.m1567a(m4562k5);
                                        m1072A.f6122bX.m1500b(m4562k5);
                                    }
                                }
                            }
                        } else if (ReadInt >= 2) {
                        }
                        if (ReadInt >= 10) {
                            reader.m1299a("Pre-unit data");
                        }
                        c0727bl.m2384a(EnumC0729bm.load_units);
                        C1104o m435dI = AbstractC1120w.m435dI();
                        LoggerMaybe.m982b("gameSaver", "Loading unit data for " + m435dI.size() + " objects.");
                        Iterator it4 = m435dI.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC1120w) it4.next()).mo2291a(reader);
                            if (ReadInt >= 10) {
                                reader.m1299a("post unit: " + abstractC1120w.getClass().toString() + " with id:" + abstractC1120w.f6951ee);
                            }
                        }
                        LoggerMaybe.m982b("gameSaver", "Loading unit data done.");
                        c0727bl.m2379b(EnumC0729bm.load_units);
                        if (z8) {
                            Iterator it5 = AbstractC1120w.m435dI().iterator();
                            while (it5.hasNext()) {
                                AbstractC1120w abstractC1120w3 = (AbstractC1120w) it5.next();
                                if (abstractC1120w3 instanceof AbstractC0244am) {
                                    AbstractC0244am abstractC0244am = (AbstractC0244am) abstractC1120w3;
                                    if (!m1072A.f6126cb.m2411h() && !m1072A.f6100bv && abstractC0244am.mo5649r() == EnumC0249ar.f1785Y) {
                                        abstractC0244am.m4351ch();
                                    }
                                }
                            }
                        }
                        if (ReadInt >= 23) {
                            reader.m1288d("saveCompression");
                        }
                        if (ReadInt >= 19) {
                            reader.m1299a("End of Save");
                            reader.ReadUTF();
                        }
                        LoggerMaybe.m982b("gameSaver", "Checking for ID overlaps");
                        int i9 = 0;
                        if (1 != 0) {
                            AbstractC1120w[] m514a = AbstractC1120w.f6962eo.m514a();
                            int size = AbstractC1120w.f6962eo.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                AbstractC1120w abstractC1120w4 = m514a[i10];
                                if (abstractC1120w4.f6951ee == 0) {
                                    LoggerMaybe.m983b("GameSaver: Fixing object with zero id.");
                                    abstractC1120w4.f6951ee = m1072A.f6122bX.m1414y();
                                }
                                for (int i11 = i10 + 1; i11 < size; i11++) {
                                    AbstractC1120w abstractC1120w5 = m514a[i11];
                                    if (abstractC1120w4 != abstractC1120w5 && abstractC1120w4.f6951ee == abstractC1120w5.f6951ee) {
                                        i9++;
                                        abstractC1120w5.f6951ee = m1072A.f6122bX.m1414y();
                                    }
                                }
                            }
                        }
                        LoggerMaybe.m982b("gameSaver", "clearing out dead units.");
                        LoggerMaybe.LogDebug2("Unit.fastLiveUnitList before:" + AbstractC0244am.f1590bD.size());
                        Iterator it6 = AbstractC0244am.f1590bD.iterator();
                        while (it6.hasNext()) {
                            if (((AbstractC0244am) it6.next()).f1607bT) {
                                it6.remove();
                            }
                        }
                        LoggerMaybe.LogDebug2("Unit.fastLiveUnitList after:" + AbstractC0244am.f1590bD.size());
                        if (i9 > 0) {
                            if (ReadInt <= 2) {
                                m1072A.m1030a("Warning: " + i9 + " errors were found in this save, this is due to a bug in the old version", 1);
                            } else {
                                m1072A.m1030a("Warning: " + i9 + " errors were found in this save", 1);
                            }
                        }
                        LoggerMaybe.m982b("gameSaver", "Fixing map cost.");
                        m1072A.f6119bU.m1150a((AbstractC0623y) null);
                        m1072A.f6119bU.m1141b();
                        LoggerMaybe.m982b("gameSaver", "Fixing map cost done.");
                        AbstractC0197n.m4653L();
                        for (int i12 = 0; i12 < AbstractC0197n.f1365c; i12++) {
                            AbstractC0197n m4562k6 = AbstractC0197n.m4562k(i12);
                            if (m4562k6 != null) {
                                m4562k6.m4582d(false);
                            }
                        }
                        AbstractC0197n.m4581e();
                        LoggerMaybe.m982b("gameSaver", "Rebuilt unit caches");
                        AbstractC0197n.m4653L();
                        AbstractC0197n.m4644U();
                        for (int i13 = 0; i13 < AbstractC0197n.f1365c; i13++) {
                            AbstractC0197n m4562k7 = AbstractC0197n.m4562k(i13);
                            if (m4562k7 != null && (m4562k7 instanceof C0136a)) {
                                ((C0136a) m4562k7).m5035am();
                            }
                        }
                        if (arrayList != null) {
                            m1072A.f6117bS.m1756x();
                            Iterator it7 = arrayList.iterator();
                            while (it7.hasNext()) {
                                AbstractC0244am m442a = AbstractC1120w.m442a(((Long) it7.next()).longValue(), true);
                                if (m442a != null) {
                                    m1072A.f6117bS.m1776k(m442a);
                                }
                            }
                        }
                        if (m1072A.m1047Z()) {
                            Iterator it8 = AbstractC1120w.m435dI().iterator();
                            while (it8.hasNext()) {
                                AbstractC1120w abstractC1120w6 = (AbstractC1120w) it8.next();
                                if (abstractC1120w6.f6951ee == 0) {
                                    if (abstractC1120w6 instanceof AbstractC0244am) {
                                        LoggerMaybe.LogDebug2("object: " + ((AbstractC0244am) abstractC1120w6).m4380cA());
                                    }
                                    throw new RuntimeException("GameLoad postload: Found object in list with id:0");
                                }
                            }
                        }
                        LoggerMaybe.LogDebug2("--- Save file load complete ---");
                        LoggerMaybe.LogDebug2("GameObject.fastGameObjectList:" + AbstractC1120w.f6962eo.size());
                        LoggerMaybe.LogDebug2("Unit.fastLiveUnitList:" + AbstractC0244am.f1590bD.size());
                        if (!z3) {
                            m1072A.f6126cb.m2423a(z3);
                        }
                        if (this.f6964b) {
                            c0727bl.m2379b(EnumC0729bm.load_total);
                            c0727bl.m2382a(true, true);
                        }
                    }
                    return true;
                } catch (EOFException e2) {
                    e2.printStackTrace();
                    LoggerMaybe.m983b("Failed to load save. (End of file trying to read header)");
                    m1072A.m1030a("Failed to load save. (End of file trying to read header)", 1);
                    return false;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                String str3 = "Failed to load save. (Failed to read header: " + e3.getMessage() + ")";
                LoggerMaybe.m983b(str3);
                m1072A.m1030a(str3, 1);
                return false;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            LoggerMaybe.LogDebug2("Save load error, clearing all units");
            Iterator it9 = AbstractC1120w.m435dI().iterator();
            while (it9.hasNext()) {
                AbstractC1120w abstractC1120w7 = (AbstractC1120w) it9.next();
                if (abstractC1120w7.f6951ee == 0) {
                    abstractC1120w7.f6951ee = m1072A.f6122bX.m1414y();
                }
                abstractC1120w7.mo2635a();
            }
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    public boolean m420b(String str) {
        LoggerMaybe.LogDebug2("Deleting: " + str);
        String m2213n = C0750a.m2213n(str);
        if (m2213n.contains("\\") || m2213n.contains("/")) {
            LoggerMaybe.LogDebug2("Cannot get save with path: " + str);
            return false;
        }
        File m423a = m423a(str, true);
        boolean m2233b = C0750a.m2233b(m423a);
        C0750a.m2233b(m423a(str + ".map", true));
        if (!m2233b) {
            LoggerMaybe.LogDebug2("Failed to delete: " + m423a.getAbsolutePath());
            LoggerMaybe.m1072A().m954i("Failed to delete: " + m423a.getAbsolutePath());
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m422a(boolean z) {
        LoggerMaybe.m1072A();
        if (!z) {
            this.f6965c = -9999;
            this.f6966d = -9999;
        }
    }

    /* renamed from: a */
    public boolean m429a() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!m1072A.f6115bQ.autosaving || LoggerMaybe.m993aw() || !m1072A.f6242bG || m1072A.f6243bH || m1072A.f6126cb.m2411h() || m1072A.m1061L()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m421b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (!m429a()) {
            return;
        }
        if (this.f6966d == -9999) {
            this.f6965c = m1072A.f6102by;
            this.f6966d = m1072A.f6102by;
        }
        if (this.f6966d + 300000 < m1072A.f6102by) {
            this.f6966d = m1072A.f6102by;
            long m2388a = C0727bl.m2388a();
            m418c();
            LoggerMaybe.LogDebug2("Autosaved (" + C0727bl.m2387a(C0727bl.m2386a(m2388a)) + ")");
        }
    }

    /* renamed from: c */
    public void m418c() {
        m419b("autosave", true);
    }
}
