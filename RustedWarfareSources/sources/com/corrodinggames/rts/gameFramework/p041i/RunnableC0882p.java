package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/p.class */
public class RunnableC0882p implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l.m1006ap();
        AbstractC0916l m1078A = AbstractC0916l.m1078A();
        AbstractC0916l.m988b("GetOwnInfoRunnable", "Starting getOwnInfoFromMasterServer");
        try {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "self_info"));
            C0879n.m1257a(arrayList, "port", Integer.toString(m1078A.f6122bX.socketPort));
            C0879n.m1257a(arrayList, "id", m1078A.f6122bX.f5535bi);
            C0857ap.f5717a.m1390b(m1078A.f6122bX.f5535bi, arrayList);
            C0857ap.f5717a.m1389c(m1078A.f6122bX.f5535bi, arrayList);
            BufferedReader m1260a = C0879n.m1260a(arrayList);
            String readLine = m1260a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                AbstractC0916l.m988b("GetOwnInfoRunnable", "Error bad header returned from the master server: " + readLine);
                return;
            }
            while (true) {
                String readLine2 = m1260a.readLine();
                if (readLine2 != null) {
                    String[] split = readLine2.split(",");
                    if (split.length <= 1) {
                        AbstractC0916l.m988b("GetOwnInfoRunnable", "columns.length too short at:" + split.length);
                    } else {
                        String str = split[0];
                        String str2 = split[1];
                        try {
                            AbstractC0916l.m988b("GetOwnInfoRunnable", "got info");
                            m1078A.f6122bX.m1538a(true, str, Boolean.valueOf(Boolean.parseBoolean(str2)));
                        } catch (NumberFormatException e) {
                            AbstractC0916l.m988b("GetOwnInfoRunnable", "failed to load server");
                            e.printStackTrace();
                        }
                    }
                } else {
                    ActivityC0129p.m4764l();
                    AbstractC0916l.m988b("GetOwnInfoRunnable", "Completed load from master server without error");
                    return;
                }
            }
        } catch (ClientProtocolException e2) {
            m1078A.f6122bX.m1538a(false, (String) null, (Boolean) null);
            e2.printStackTrace();
        } catch (IOException e3) {
            m1078A.f6122bX.m1538a(false, (String) null, (Boolean) null);
            e3.printStackTrace();
        } catch (Exception e4) {
            m1078A.f6122bX.m1538a(false, (String) null, (Boolean) null);
            AbstractC0916l.m1034a("GetOwnInfoRunnable Failed", e4);
        }
    }
}
