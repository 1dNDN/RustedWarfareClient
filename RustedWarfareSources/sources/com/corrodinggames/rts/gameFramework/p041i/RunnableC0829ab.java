package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ab.class */
public class RunnableC0829ab implements Runnable {

    /* renamed from: a */
    C0890w f5471a;

    /* renamed from: b */
    String f5472b;

    /* renamed from: c */
    int f5473c;

    /* renamed from: d */
    String f5474d;

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        AbstractC0916l.m1071A();
        AbstractC0916l.m981b("getGameServerInfoFromMasterServer", "Starting getGameServerInfoFromMasterServer");
        String m1259a = C0879n.m1259a(this.f5473c);
        String str = null;
        if (this.f5474d != null) {
            str = C0758f.m2067c(this.f5472b + this.f5474d, 3);
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "get"));
            arrayList.add(new BasicNameValuePair("game_id", this.f5472b));
            arrayList.add(new BasicNameValuePair("c", m1259a));
            arrayList.add(new BasicNameValuePair("p_hash", str));
            BufferedReader m1253a = C0879n.m1253a(arrayList);
            String readLine = m1253a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                AbstractC0916l.m981b("getGameServerInfoFromMasterServerRunnable", "Error bad header returned from the master server: " + readLine);
                this.f5471a.mo1232a("Unexpected header from master server", EnumC0891x.unknown, null);
                return;
            }
            String readLine2 = m1253a.readLine();
            if (readLine2 == null) {
                throw new IOException("Unexpected end of response");
            }
            if (readLine.contains("[FAILED]")) {
                AbstractC0916l.m982b("Got failed header with status:" + readLine2);
                String str2 = "Failed to get server connection data - unknown";
                EnumC0891x enumC0891x = EnumC0891x.unknown;
                if (readLine2.startsWith("ERROR_OTHER")) {
                    String[] split = readLine2.split(",");
                    if (split.length >= 2) {
                        str2 = split[1];
                    }
                    enumC0891x = EnumC0891x.unknown;
                } else if (readLine2.startsWith("ERROR_MISSING")) {
                    str2 = "Request missing required fields";
                } else if (!readLine2.startsWith("ERROR_WRONG_C")) {
                    if (readLine2.startsWith("ERROR_MISSING_PASSWORD")) {
                        str2 = "Missing password";
                        enumC0891x = EnumC0891x.unknown;
                    } else if (readLine2.startsWith("ERROR_WRONG_PASSWORD")) {
                        str2 = "Wrong password";
                        enumC0891x = EnumC0891x.wrongPassword;
                    }
                }
                this.f5471a.mo1232a(str2, enumC0891x, null);
                return;
            }
            String readLine3 = m1253a.readLine();
            if (readLine3 == null) {
                throw new IOException("Unexpected end of response");
            }
            if (!readLine3.toLowerCase(Locale.ROOT).contains(C0758f.m2069c("game_" + m1259a).toLowerCase(Locale.ROOT))) {
                AbstractC0916l.m981b("getGameServerInfoFromMasterServerRunnable", "Error bad header returned from the master server: " + readLine3);
                this.f5471a.mo1232a("Unexpected return from master server", EnumC0891x.unknown, null);
                return;
            }
            m1253a.readLine();
            String readLine4 = m1253a.readLine();
            if (readLine4 == null) {
                throw new IOException("Unexpected end of response");
            }
            String[] split2 = readLine4.split(",");
            if (split2.length <= 18) {
                throw new RuntimeException("getGameServerInfoFromMasterServerRunnable: columns.length too short at:" + split2.length);
            }
            String str3 = split2[3];
            String str4 = split2[4];
            String str5 = split2[5];
            String str6 = split2[6];
            String str7 = split2[7];
            String str8 = split2[8];
            String str9 = split2[9];
            String str10 = split2[10];
            String str11 = split2[11];
            String str12 = split2[12];
            String str13 = split2[13];
            String str14 = split2[15];
            String str15 = split2[16];
            String str16 = split2[17];
            String str17 = split2[18];
            AbstractC0916l.m981b("getGameServerInfoFromMasterServerRunnable", "got ");
            AbstractC0916l.m981b("getGameServerInfoFromMasterServerRunnable", "Completed get from master server without error");
            this.f5471a.mo1233a(str3 + ":" + str5);
        } catch (IOException e) {
            AbstractC0916l.m1027a("getGameServerInfoFromMasterServerRunnable Failed", (Exception) e);
            this.f5471a.mo1232a(e.getMessage(), EnumC0891x.unknown, e);
        }
    }
}
