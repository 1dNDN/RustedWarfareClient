package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/q.class */
public class RunnableC0883q implements Runnable {

    /* renamed from: a */
    Runnable f5885a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0883q(Runnable runnable) {
        this.f5885a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        final AbstractC0916l m1071A = AbstractC0916l.m1071A();
        AbstractC0916l.m981b("LoadFromMasterServer", "Starting load");
        final int i = C0879n.f5877e;
        C0879n.f5877e++;
        try {
            new Timer().schedule(new C0881o(i), 5000L);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "list"));
            arrayList.add(new BasicNameValuePair("game_version", Integer.toString(m1071A.mo972c(true))));
            arrayList.add(new BasicNameValuePair("game_version_beta", C0758f.m2106a(m1071A.mo945m())));
            C0879n.m1248a((List) arrayList, false, new AbstractC0886s() { // from class: com.corrodinggames.rts.gameFramework.i.q.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.corrodinggames.rts.gameFramework.p041i.AbstractC0886s
                /* renamed from: a */
                public void mo1234a(BufferedReader bufferedReader, int i2, String str) {
                    AbstractC0916l m1071A2 = AbstractC0916l.m1071A();
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                        String str2 = i2 + ": Unknown header from the master server: '" + C0758f.m2115a(readLine, 30) + "'";
                        AbstractC0916l.m981b("LoadFromMasterServer", str2);
                        this.f5890d = str2;
                        try {
                            String str3 = VariableScope.nullOrMissingString + readLine + "\n";
                            AbstractC0916l.m963e("----------- Full response ----------");
                            AbstractC0916l.m981b("LoadFromMasterServer", "line:" + readLine);
                            while (true) {
                                String readLine2 = bufferedReader.readLine();
                                if (readLine2 != null) {
                                    AbstractC0916l.m981b("LoadFromMasterServer", "line:" + readLine2);
                                    str3 = str3 + readLine2 + "\n";
                                } else {
                                    AbstractC0916l.m963e("------------------------------------");
                                    C0879n.f5879g = str3;
                                    return;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        AbstractC0916l.m981b("LoadFromMasterServer", i2 + ": Starting load");
                        int i3 = 0;
                        while (true) {
                            String readLine3 = bufferedReader.readLine();
                            if (readLine3 == null) {
                                break;
                            }
                            String[] split = readLine3.split(",", -1);
                            if (split.length <= 21) {
                                AbstractC0916l.m981b("LoadFromMasterServer", i2 + ": columns.length too short at:" + split.length);
                                AbstractC0916l.m981b("LoadFromMasterServer", i2 + ": short line is:" + readLine3);
                            } else {
                                String str4 = split[0];
                                String str5 = split[1];
                                String str6 = split[2];
                                String str7 = split[3];
                                String str8 = split[4];
                                String str9 = split[5];
                                String str10 = split[6];
                                String str11 = split[7];
                                String str12 = split[8];
                                String str13 = split[9];
                                String str14 = split[10];
                                String str15 = split[11];
                                String str16 = split[12];
                                String str17 = split[13];
                                String str18 = split[15];
                                String str19 = split[16];
                                String str20 = split[17];
                                String str21 = split[18];
                                String str22 = split[19];
                                String str23 = split[20];
                                String str24 = split[21];
                                String str25 = null;
                                String str26 = null;
                                if (str7 != null && str7.startsWith("url:") && Boolean.parseBoolean(str20)) {
                                    str25 = str7.substring(4);
                                    str26 = str5;
                                    if (!C0758f.m2069c(str25 + ";" + str26).equals(str8)) {
                                        AbstractC0916l.m963e("Skipping " + str21);
                                    }
                                }
                                if (str21 == null || str21.trim().length() == 0) {
                                    str21 = str4;
                                }
                                try {
                                    String str27 = str21;
                                    synchronized (C0879n.f5878f) {
                                        C0872g m1240c = C0879n.m1240c(str27);
                                        m1240c.f5825c = str7;
                                        m1240c.f5826d = str8;
                                        m1240c.f5827e = str25;
                                        m1240c.f5828f = str26;
                                        m1240c.f5829g = Integer.valueOf(str9).intValue();
                                        m1240c.f5830h = Boolean.parseBoolean(str10);
                                        m1240c.f5835m = Boolean.parseBoolean(str12);
                                        m1240c.f5832j = str6;
                                        try {
                                            m1240c.f5834l = Integer.parseInt(m1240c.f5832j);
                                        } catch (NumberFormatException e2) {
                                            AbstractC0916l.m982b("game_version_int:" + e2.getMessage());
                                        }
                                        m1240c.f5836n = str11;
                                        m1240c.f5839q = str13;
                                        m1240c.f5840r = str14;
                                        m1240c.f5841s = str15;
                                        m1240c.f5833k = str16;
                                        m1240c.f5823a = Boolean.parseBoolean(str17);
                                        m1240c.f5842t = str18;
                                        m1240c.f5843u = str19;
                                        m1240c.f5847y = Boolean.parseBoolean(str22);
                                        if (VariableScope.nullOrMissingString.equals(str23)) {
                                            str23 = null;
                                        }
                                        m1240c.f5848z = str23;
                                        if (!str24.trim().equals(VariableScope.nullOrMissingString)) {
                                            m1240c.f5849A = Integer.valueOf(str24).intValue();
                                        }
                                        try {
                                            m1240c.f5844v = Integer.parseInt(m1240c.f5842t);
                                        } catch (NumberFormatException e3) {
                                            AbstractC0916l.m982b("game_player_count_int:" + e3.getMessage());
                                        }
                                        try {
                                            m1240c.f5845w = Integer.parseInt(m1240c.f5843u);
                                        } catch (NumberFormatException e4) {
                                            AbstractC0916l.m982b("game_max_player_count_int:" + e4.getMessage());
                                        }
                                        m1240c.f5846x = Boolean.parseBoolean(str20);
                                        if (m1240c.f5838p < i) {
                                            m1240c.f5838p = i;
                                        }
                                        if (C0879n.m1243b(m1240c.f5824b) == null) {
                                            m1071A2.f6170bX.f5606by.add(m1240c);
                                        }
                                        i3++;
                                    }
                                } catch (NumberFormatException e5) {
                                    AbstractC0916l.m981b("LoadFromMasterServer", i2 + ": failed to load server");
                                    e5.printStackTrace();
                                }
                            }
                        }
                        AbstractC0916l.m981b("LoadFromMasterServer", "[" + i2 + "]: Found " + i3 + " servers");
                        if (i3 == 0) {
                            try {
                                Thread.sleep(2000L);
                            } catch (InterruptedException e6) {
                                e6.printStackTrace();
                            }
                        }
                        this.f5891e = true;
                        RunnableC0883q.this.f5885a.run();
                        try {
                            Thread.sleep(2000L);
                        } catch (InterruptedException e7) {
                            e7.printStackTrace();
                        }
                        C0879n.m1258a(i, i2);
                        AbstractC0916l.m981b("LoadFromMasterServer", i2 + ": Completed load from master server without error");
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.corrodinggames.rts.gameFramework.p041i.AbstractC0886s
                /* renamed from: a */
                public void mo1235a() {
                    if (!this.f5891e) {
                        m1071A.f6170bX.f5605bx = this.f5890d;
                        RunnableC0883q.this.f5885a.run();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            m1071A.m1029a("Error getting game list from server", 1);
        }
    }
}
