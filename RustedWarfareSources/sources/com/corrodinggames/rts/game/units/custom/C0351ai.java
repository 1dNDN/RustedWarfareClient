package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ai.class */
public class C0351ai {

    /* renamed from: a */
    public static final C0351ai f2228a = m3867a(VariableScope.nullOrMissingString);

    /* renamed from: b */
    public AbstractC0352aj[] f2229b;

    /* renamed from: c */
    public C0400ba[] f2230c;

    /* renamed from: d */
    public String f2231d;

    /* renamed from: e */
    public int f2232e = -1;

    /* renamed from: f */
    public String f2233f;

    /* renamed from: g */
    public String f2234g;

    /* renamed from: h */
    C0453l f2235h;

    /* renamed from: a */
    public static C0351ai m3867a(String str) {
        C0351ai c0351ai = new C0351ai();
        ArrayList arrayList = new ArrayList();
        C0400ba c0400ba = new C0400ba();
        c0400ba.f2486a = null;
        c0400ba.f2487b = str;
        arrayList.add(c0400ba);
        c0351ai.f2230c = (C0400ba[]) arrayList.toArray(new C0400ba[0]);
        c0351ai.m3870a();
        return c0351ai;
    }

    /* renamed from: a */
    public static C0351ai m3868a(C0385az c0385az) {
        if (c0385az == null) {
            return null;
        }
        C0351ai c0351ai = new C0351ai();
        c0351ai.f2235h = C0453l.f2904b;
        c0351ai.f2230c = c0385az.f2319b;
        c0351ai.f2233f = c0385az.f2322e;
        if (c0351ai.f2230c != null) {
            C0400ba[] c0400baArr = c0351ai.f2230c;
            int length = c0400baArr.length;
            int i = 0;
            while (i < length) {
                C0400ba c0400ba = c0400baArr[i];
                i = (c0400ba.f2487b == null || c0400ba.f2487b.contains("%{")) ? i + 1 : i + 1;
            }
        }
        c0351ai.m3862c();
        return c0351ai;
    }

    public C0351ai() {
    }

    public C0351ai(C0453l c0453l, C0385az c0385az) {
        C0400ba[] c0400baArr;
        this.f2235h = c0453l;
        this.f2230c = c0385az.f2319b;
        this.f2233f = c0385az.f2322e;
        if (this.f2230c != null) {
            for (C0400ba c0400ba : this.f2230c) {
                if (c0400ba.f2487b != null && c0400ba.f2487b.contains("%{")) {
                    m3866a(c0400ba.f2487b, true);
                }
            }
        }
        m3870a();
    }

    /* renamed from: a */
    public void m3870a() {
        m3865a(true);
    }

    /* renamed from: a */
    public void m3865a(boolean z) {
        m3862c();
        if (this.f2231d != null && this.f2231d.contains("%{")) {
            this.f2229b = m3866a(this.f2231d, z);
        } else {
            this.f2229b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x012f, code lost:
        return (com.corrodinggames.rts.game.units.custom.AbstractC0352aj[]) r0.toArray(new com.corrodinggames.rts.game.units.custom.AbstractC0352aj[0]);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.corrodinggames.rts.game.units.custom.AbstractC0352aj[] m3866a(java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.custom.C0351ai.m3866a(java.lang.String, boolean):com.corrodinggames.rts.game.units.custom.aj[]");
    }

    /* renamed from: a */
    public String m3869a(AbstractC0244am abstractC0244am) {
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            return "<No unit>:" + this.f2231d;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        StringBuffer stringBuffer = new StringBuffer();
        for (AbstractC0352aj abstractC0352aj : this.f2229b) {
            stringBuffer.append(abstractC0352aj.mo3860a(abstractC0623y));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String m3863b(AbstractC0244am abstractC0244am) {
        if (this.f2232e == C0820a.f5400c) {
            if (this.f2229b != null) {
                return m3869a(abstractC0244am);
            }
            return this.f2231d;
        }
        m3865a(false);
        if (this.f2229b != null) {
            return m3869a(abstractC0244am);
        }
        return this.f2231d;
    }

    /* renamed from: b */
    public String m3864b() {
        if (this.f2232e == C0820a.f5400c) {
            return this.f2231d;
        }
        m3865a(false);
        return this.f2231d;
    }

    /* renamed from: c */
    public void m3862c() {
        C0400ba[] c0400baArr;
        C0400ba[] c0400baArr2;
        if (this.f2233f != null) {
            this.f2232e = C0820a.f5400c;
            this.f2231d = C0820a.m1681a(this.f2233f, new Object[0]);
            return;
        }
        String m1678c = C0820a.m1678c();
        for (C0400ba c0400ba : this.f2230c) {
            if (m1678c.equals(c0400ba.f2486a)) {
                this.f2232e = C0820a.f5400c;
                this.f2231d = c0400ba.f2487b;
                return;
            }
        }
        for (C0400ba c0400ba2 : this.f2230c) {
            if (c0400ba2.f2486a == null) {
                this.f2232e = C0820a.f5400c;
                this.f2231d = c0400ba2.f2487b;
                return;
            }
        }
        this.f2232e = C0820a.f5400c;
        this.f2231d = "<NO DEFAULT TEXT FOUND>";
    }
}
