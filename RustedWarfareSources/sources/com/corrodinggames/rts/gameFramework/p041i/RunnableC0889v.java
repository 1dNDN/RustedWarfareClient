package com.corrodinggames.rts.gameFramework.p041i;

import android.os.Build;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/v.class */
public class RunnableC0889v implements Runnable {

    /* renamed from: a */
    String f5901a;

    /* renamed from: b */
    String f5902b;

    @Override // java.lang.Runnable
    public void run() {
        long m1051U = AbstractC0916l.m1051U();
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        AbstractC0916l.m981b("SendErrorReport", "Starting");
        try {
            try {
                try {
                    ArrayList arrayList = new ArrayList(2);
                    C0879n.m1250a(arrayList, "action", "error_report");
                    C0879n.m1250a(arrayList, "game_version", Integer.toString(m1071A.mo972c(false)));
                    C0879n.m1250a(arrayList, "game_version_internal", Integer.toString(m1071A.mo972c(true)));
                    C0879n.m1250a(arrayList, "game_version_string", m1071A.mo939q());
                    C0879n.m1250a(arrayList, "package_name", m1071A.mo950k());
                    C0879n.m1250a(arrayList, "installation_source", m1071A.mo947l());
                    String str = VariableScope.nullOrMissingString + Build.VERSION.SDK_INT;
                    if (AbstractC0916l.m994au()) {
                        str = "s:0;";
                        if (C1058a.m734a().m733e()) {
                            str = "s:1;";
                        }
                    }
                    if (AbstractC0916l.m994au() || AbstractC0916l.f6120aZ) {
                        C0879n.m1250a(arrayList, "system_version", System.getProperty("os.name") + " - " + System.getProperty("os.version"));
                    }
                    C0879n.m1250a(arrayList, "sdk_version", str);
                    C0879n.m1250a(arrayList, "device_model", m1071A.m1066F());
                    C0879n.m1250a(arrayList, "build_version", m1071A.m1065G());
                    C0879n.m1250a(arrayList, "release_version", C0758f.m2106a(AbstractC0916l.f6087as));
                    C0879n.m1250a(arrayList, "dedicated_server", C0758f.m2106a(AbstractC0916l.f6115aU));
                    String str2 = m1071A.f6170bX != null ? m1071A.f6170bX.f5589bh : "NA";
                    C0879n.m1250a(arrayList, "private_token", str2);
                    C0879n.m1250a(arrayList, "private_token_2", C0758f.m2084b(C0758f.m2084b(str2)));
                    C0879n.m1250a(arrayList, "message", this.f5901a);
                    C0879n.m1250a(arrayList, "stacktrace", this.f5902b);
                    AbstractC0916l.m981b("SendErrorReport", "making request");
                    String readLine = C0879n.m1253a(arrayList).readLine();
                    if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                        AbstractC0916l.m981b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                        AbstractC0916l.m981b("SendErrorReport", "took: " + (((float) (AbstractC0916l.m1051U() - m1051U)) / 1000000.0f) + " seconds");
                        return;
                    }
                    AbstractC0916l.m981b("SendErrorReport", "Send trace successfully");
                    AbstractC0916l.m981b("SendErrorReport", "took: " + (((float) (AbstractC0916l.m1051U() - m1051U)) / 1000000.0f) + " seconds");
                } catch (Exception e) {
                    e.printStackTrace();
                    AbstractC0916l.m981b("SendErrorReport", "took: " + (((float) (AbstractC0916l.m1051U() - m1051U)) / 1000000.0f) + " seconds");
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                AbstractC0916l.m981b("SendErrorReport", "took: " + (((float) (AbstractC0916l.m1051U() - m1051U)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            AbstractC0916l.m981b("SendErrorReport", "took: " + (((float) (AbstractC0916l.m1051U() - m1051U)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}
