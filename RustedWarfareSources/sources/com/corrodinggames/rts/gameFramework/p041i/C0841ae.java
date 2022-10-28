package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.Core;
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
    public void mo1455a(String str) {
        Core m1087A = Core.m1087A();
        if (this.f5643d) {
            try {
                StreamWriter streamWriter = new StreamWriter();
                streamWriter.m1401c(1);
                streamWriter.WriteInteger(this.f5642c);
                streamWriter.WriteUTF(str);
                m1087A.f6122bX.m1516d(streamWriter.m1407b(118));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (m1087A.f6122bX.IsServer) {
            Core.m1046a("Cannot enter a password when we are a server");
        } else {
            m1087A.f6122bX.f5481n = str;
            m1087A.f6122bX.m1624X();
        }
    }

    /* renamed from: a */
    public void mo1456a() {
        Core m1087A = Core.m1087A();
        m1087A.f6122bX.m1535b("exited password");
        m1087A.f6122bX.m1637K();
    }
}
