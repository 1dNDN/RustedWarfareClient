package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;

/* renamed from: com.corrodinggames.rts.gameFramework.bg */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bg.class */
public class C0722bg {

    /* renamed from: a */
    C0725bj f4553a = new C0725bj(this);

    /* renamed from: b */
    C0725bj[] f4554b = new C0725bj[AbstractC0197n.f1367e];

    /* renamed from: c */
    public static C0724bi f4555c = new C0724bi();

    /* renamed from: a */
    public void m2394a(StreamWriter streamWriter) {
        streamWriter.mo1350e("stats");
        streamWriter.mo1355c(0);
        int i = AbstractC0197n.f1365c;
        streamWriter.WriteInteger(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f4554b[i2].m2390a(streamWriter);
        }
        streamWriter.mo1317a("stats");
    }

    /* renamed from: a */
    public void m2393a(Reader reader, boolean z) {
        reader.m1292b("stats");
        reader.m1289d();
        int ReadInt = reader.ReadInt();
        this.f4554b = new C0725bj[AbstractC0197n.f1367e];
        for (int i = 0; i < ReadInt; i++) {
            this.f4554b[i] = new C0725bj(this);
            this.f4554b[i].m2389a(reader);
        }
        reader.m1288d("stats");
    }

    /* renamed from: a */
    public void m2398a() {
        this.f4553a = new C0725bj(this);
        this.f4554b = new C0725bj[AbstractC0197n.f1367e];
        for (int i = 0; i < this.f4554b.length; i++) {
            this.f4554b[i] = new C0725bj(this);
        }
    }

    /* renamed from: a */
    public C0725bj m2396a(AbstractC0244am abstractC0244am) {
        return m2397a(abstractC0244am.f1609bV);
    }

    /* renamed from: a */
    public C0725bj m2397a(AbstractC0197n abstractC0197n) {
        int i = abstractC0197n.f1306k;
        if (i < 0 || i >= this.f4554b.length) {
            return this.f4553a;
        }
        C0725bj c0725bj = this.f4554b[i];
        if (c0725bj == null) {
            return this.f4553a;
        }
        return c0725bj;
    }

    /* renamed from: a */
    public void m2395a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, float f) {
        if (abstractC0244am != null) {
            boolean z = abstractC0244am2.f1607bT;
            C0725bj m2396a = m2396a(abstractC0244am);
            C0725bj m2396a2 = m2396a(abstractC0244am2);
            if (z) {
                f4555c.m2391a(abstractC0244am, abstractC0244am2);
                if (abstractC0244am2.m4402bI()) {
                    m2396a.f4560d++;
                    m2396a2.f4563g++;
                } else if (abstractC0244am2.mo3226db()) {
                    m2396a.f4561e++;
                    m2396a2.f4564h++;
                } else {
                    m2396a.f4559c++;
                    m2396a2.f4562f++;
                }
            }
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (abstractC0244am2.f1609bV == m1072A.f6099bs) {
            m1072A.m1034a(abstractC0244am2, f);
        }
    }
}
