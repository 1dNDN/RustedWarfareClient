package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/z.class */
public class RunnableC0893z implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m999ap();
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        AbstractC0916l.m981b("startRemoveOnMasterServer", "Starting remove");
        try {
            ArrayList arrayList = new ArrayList(2);
            C0879n.m1250a(arrayList, "action", "remove");
            String str = m1071A.f6170bX.f5590bi;
            if (str == null) {
                AbstractC0916l.m981b("startRemoveOnMasterServer", "No game id");
                return;
            }
            C0879n.m1250a(arrayList, "id", str);
            C0879n.m1250a(arrayList, "private_token", m1071A.f6170bX.f5589bh);
            BufferedReader m1253a = C0879n.m1253a(arrayList);
            String readLine = m1253a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                AbstractC0916l.m981b("startRemoveOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            AbstractC0916l.m981b("startRemoveOnMasterServer", "Remove server response was:" + m1253a.readLine());
            AbstractC0916l.m981b("startRemoveOnMasterServer", "Completed load from master server without error");
        } catch (IOException e) {
            AbstractC0916l.m981b("startRemoveOnMasterServer", "Remove failed");
            e.printStackTrace();
        }
    }
}
