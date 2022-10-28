package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/y.class */
public class RunnableC0892y implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        long m1051U = AbstractC0916l.m1051U();
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        AbstractC0916l.m981b("StartCreateOnMasterServer", "Starting create");
        try {
            try {
                ArrayList arrayList = new ArrayList(2);
                C0879n.m1250a(arrayList, "action", "add");
                String str = "u_" + C0758f.m2102b();
                C0879n.m1250a(arrayList, "user_id", str);
                C0857ap.f5717a.m1384a(str, arrayList);
                C0879n.m1250a(arrayList, "game_name", "Unnamed");
                C0879n.m1250a(arrayList, "game_version", Integer.toString(m1071A.mo972c(true)));
                if (m1071A.f6170bX.f5496v) {
                    C0879n.m1250a(arrayList, "game_version_string", "ANY");
                } else {
                    C0879n.m1250a(arrayList, "game_version_string", m1071A.mo935u());
                }
                C0879n.m1250a(arrayList, "game_version_beta", C0758f.m2106a(m1071A.mo945m()));
                String m1503au = m1071A.f6170bX.m1503au();
                if (m1503au != null) {
                    C0879n.m1250a(arrayList, "game_mods", m1503au);
                }
                C0879n.m1250a(arrayList, "private_token", m1071A.f6170bX.f5589bh);
                C0879n.m1250a(arrayList, "private_token_2", C0758f.m2084b(C0758f.m2084b(m1071A.f6170bX.f5589bh)));
                C0879n.m1250a(arrayList, "confirm", C0758f.m2084b("a" + C0758f.m2084b(m1071A.f6170bX.f5589bh)));
                C0879n.m1242b(arrayList);
                BufferedReader m1252a = C0879n.m1252a(arrayList, 15);
                String readLine = m1252a.readLine();
                if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                    AbstractC0916l.m981b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                    AbstractC0916l.m981b("StartCreateOnMasterServer", "create took: " + (((float) (AbstractC0916l.m1051U() - m1051U)) / 1000000.0f) + " seconds");
                    return;
                }
                String[] split = m1252a.readLine().split(",");
                if (split.length < 1) {
                    AbstractC0916l.m981b("StartCreateOnMasterServer", "columns.length too short at:" + split.length);
                }
                String str2 = split[0];
                try {
                    AbstractC0916l.m981b("StartCreateOnMasterServer", "Created server is:" + str2);
                    m1071A.f6170bX.f5590bi = str2;
                } catch (NumberFormatException e) {
                    AbstractC0916l.m981b("StartCreateOnMasterServer", "failed to load server");
                    e.printStackTrace();
                }
                if (split.length >= 2) {
                    try {
                        C0857ap.f5722f = Integer.parseInt(split[1]);
                    } catch (NumberFormatException e2) {
                        C0857ap.f5722f = -1;
                    }
                }
                AbstractC0916l.m981b("StartCreateOnMasterServer", "Completed create from master server without error");
                AbstractC0916l.m981b("StartCreateOnMasterServer", "create took: " + (((float) (AbstractC0916l.m1051U() - m1051U)) / 1000000.0f) + " seconds");
            } catch (IOException e3) {
                e3.printStackTrace();
                AbstractC0916l.m981b("StartCreateOnMasterServer", "create took: " + (((float) (AbstractC0916l.m1051U() - m1051U)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            AbstractC0916l.m981b("StartCreateOnMasterServer", "create took: " + (((float) (AbstractC0916l.m1051U() - m1051U)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}
