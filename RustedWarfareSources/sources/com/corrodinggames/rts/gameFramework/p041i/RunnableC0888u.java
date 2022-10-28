package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import com.corrodinggames.rts.gameFramework.C0758f;
import java.io.BufferedReader;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/u.class */
public class RunnableC0888u implements Runnable {

    /* renamed from: a */
    int f5896a;

    /* renamed from: b */
    List f5897b;

    /* renamed from: c */
    AbstractC0886s f5898c;

    /* renamed from: d */
    String f5899d;

    /* renamed from: e */
    boolean f5900e;

    public RunnableC0888u(List list, AbstractC0886s abstractC0886s, String str, boolean z, int i) {
        this.f5896a = i;
        this.f5897b = list;
        this.f5898c = abstractC0886s;
        this.f5899d = str;
        this.f5900e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0916l m1071A = AbstractC0916l.m1071A();
        try {
            if (C0879n.f5873a) {
                AbstractC0916l.m981b("LoadFromMasterServer", this.f5896a + ": Started doSingleRequest");
            }
            BufferedReader bufferedReader = C0879n.m1249a(this.f5897b, this.f5899d, this.f5900e).f5893a;
            if (C0879n.f5873a) {
                AbstractC0916l.m981b("LoadFromMasterServer", this.f5896a + ": Ended doSingleRequest");
            }
            this.f5898c.mo1234a(bufferedReader, this.f5896a, this.f5899d);
        } catch (Exception e) {
            e.printStackTrace();
            String m2119a = C0758f.m2119a(e, true);
            if (e instanceof UnknownHostException) {
                m2119a = "DNS lookup failed, check your internet connection";
            }
            if (m2119a != null && m2119a.contains("Cleartext HTTP traffic")) {
                m2119a = m2119a + " ( Broken apk file? - " + m1071A.mo950k() + ")";
            }
            this.f5898c.f5890d = "#" + this.f5896a + ": " + m2119a;
            AbstractC0916l.m963e("Error getting game list from server #" + this.f5896a);
            if (m1071A.mo942o()) {
                m1071A.m1029a("Error getting game list from server #" + this.f5896a, 1);
            }
        }
        synchronized (this.f5898c) {
            this.f5898c.f5892f--;
            if (this.f5898c.f5892f == 0) {
                this.f5898c.mo1235a();
            }
        }
    }
}
