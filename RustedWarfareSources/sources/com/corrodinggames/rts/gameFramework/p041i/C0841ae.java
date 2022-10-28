package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ae.class */
public class C0841ae {

    /* renamed from: b */
    public String f5641b;

    /* renamed from: c */
    public int f5642c;

    /* renamed from: d */
    public boolean f5643d;

    /* renamed from: e */
    public String f5644e;

    /* renamed from: f */
    public String f5645f;

    /* renamed from: g */
    public String f5646g;

    /* renamed from: a */
    public void mo3096a(String str) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f5643d) {
            try {
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.mo1355c(1);
                streamWriter.WriteInteger(this.f5642c);
                streamWriter.WriteUTF(str);
                m1072A.f6122bX.m1472d(streamWriter.mo1360b(118));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (m1072A.f6122bX.IsServer) {
            LoggerMaybe.m1031a("Cannot enter a password when we are a server");
        } else {
            m1072A.f6122bX.f5481n = str;
            m1072A.f6122bX.m1580X();
        }
    }

    /* renamed from: a */
    public void mo3097a() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6122bX.m1491b("exited password");
        m1072A.f6122bX.m1593K();
    }
}
