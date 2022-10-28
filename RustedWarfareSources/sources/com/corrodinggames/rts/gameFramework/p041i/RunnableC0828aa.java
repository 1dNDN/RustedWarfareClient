package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/aa.class */
public class RunnableC0828aa implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        try {
            ArrayList arrayList = new ArrayList(2);
            C0879n.m1250a(arrayList, "action", "update");
            String str = m1071A.f6170bX.f5590bi;
            if (str == null) {
                AbstractC0916l.m981b("startUpdateOnMasterServer", "No game id");
                return;
            }
            C0879n.m1250a(arrayList, "id", str);
            C0879n.m1250a(arrayList, "private_token", m1071A.f6170bX.f5589bh);
            if (AbstractC0916l.m992aw()) {
                C0879n.m1250a(arrayList, "check_port", "false");
            }
            C0879n.m1242b(arrayList);
            BufferedReader m1253a = C0879n.m1253a(arrayList);
            String readLine = m1253a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                AbstractC0916l.m981b("startUpdateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            String readLine2 = m1253a.readLine();
            if (!"GAME UPDATED".equals(readLine2)) {
                AbstractC0916l.m981b("startUpdateOnMasterServer", "Update server response was:" + readLine2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
