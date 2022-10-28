package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.corrodinggames.rts.gameFramework.l.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/ae.class */
public class C0928ae {

    /* renamed from: c */
    public String f6348c;

    /* renamed from: d */
    public String f6349d;

    /* renamed from: e */
    public String f6350e;

    /* renamed from: f */
    public String f6351f;

    /* renamed from: g */
    public int f6352g;

    /* renamed from: h */
    public int f6353h;

    /* renamed from: i */
    String f6354i;

    /* renamed from: j */
    String f6355j;

    /* renamed from: k */
    long f6356k;

    /* renamed from: l */
    long f6357l;

    /* renamed from: m */
    public boolean f6358m;

    /* renamed from: n */
    public int f6359n;

    /* renamed from: o */
    public int f6360o;

    /* renamed from: p */
    public C0929af[] f6361p;

    /* renamed from: q */
    public Object f6362q;

    /* renamed from: r */
    public int f6363r;

    /* renamed from: s */
    int f6364s;

    /* renamed from: a */
    public void m918a(String str, float f) {
        m919a(str).m907a(f);
    }

    /* renamed from: a */
    public void m917a(String str, float f, float f2) {
        m919a(str).m906a(f, f2);
    }

    /* renamed from: a */
    public void m916a(String str, int i) {
        m919a(str).m905a(((i >> 16) & 255) * 0.003921569f, ((i >> 8) & 255) * 0.003921569f, (i & 255) * 0.003921569f, (i >>> 24) * 0.003921569f);
    }

    /* renamed from: a */
    public void m915a(String str, C0934e c0934e) {
        m919a(str).m904a(c0934e);
    }

    /* renamed from: b */
    public void m912b(String str, C0934e c0934e) {
        m919a(str).m903b(c0934e);
    }

    /* renamed from: a */
    public C0929af m919a(String str) {
        C0929af[] c0929afArr;
        for (C0929af c0929af : this.f6361p) {
            if (c0929af.f6365a.equals(str)) {
                return c0929af;
            }
        }
        C0929af c0929af2 = new C0929af();
        c0929af2.f6365a = str;
        C0929af[] c0929afArr2 = (C0929af[]) Arrays.copyOf(this.f6361p, this.f6361p.length + 1);
        c0929afArr2[c0929afArr2.length - 1] = c0929af2;
        this.f6361p = c0929afArr2;
        return c0929af2;
    }

    public C0928ae(String str) {
        this.f6349d = VariableScope.nullOrMissingString;
        this.f6361p = new C0929af[0];
        m914a(LoggerMaybe.f6209aY ? "assets/shaders/plainGDX.vert" : "assets/shaders/plain.vert", str);
    }

    /* renamed from: a */
    public void m914a(String str, String str2) {
        this.f6348c = C0758f.m2050g(str2);
        this.f6354i = str;
        this.f6355j = str2;
        m910d();
        m909e();
    }

    public C0928ae() {
        this.f6349d = VariableScope.nullOrMissingString;
        this.f6361p = new C0929af[0];
        this.f6348c = "Invalid";
        this.f6360o = 1;
    }

    /* renamed from: d */
    public void m910d() {
        C1098j m2220j = C0750a.m2220j(this.f6354i);
        if (m2220j == null) {
            throw new IOException("Cannot find: " + this.f6354i);
        }
        this.f6350e = C0758f.m2137a(m2220j);
        C1098j m2220j2 = C0750a.m2220j(this.f6355j);
        if (m2220j2 == null) {
            throw new IOException("Cannot find: " + this.f6355j);
        }
        this.f6351f = C0758f.m2137a(m2220j2);
    }

    /* renamed from: b */
    public void m913b(String str) {
        LoggerMaybe.LogDebug2("shader(" + this.f6348c + "): " + str);
    }

    /* renamed from: c */
    public void m911c(String str) {
        if (this.f6363r < 3) {
            this.f6363r++;
            LoggerMaybe.m948p("shader(" + this.f6348c + "): " + str);
        }
        LoggerMaybe.m1038a("shader(" + this.f6348c + "): " + str);
        this.f6360o = 1;
    }

    /* renamed from: a */
    public boolean mo871a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo869b() {
        return false;
    }

    /* renamed from: a */
    public boolean mo870a(Paint paint, C0934e c0934e) {
        return false;
    }

    /* renamed from: e */
    public boolean m909e() {
        long m1237a = C0894j.m1237a(this.f6354i, false);
        long m1237a2 = C0894j.m1237a(this.f6355j, false);
        boolean z = (m1237a == this.f6356k && m1237a2 == this.f6357l) ? false : true;
        this.f6356k = m1237a;
        this.f6357l = m1237a2;
        return z;
    }

    /* renamed from: f */
    public void m908f() {
        C0929af[] c0929afArr;
        this.f6364s++;
        if (this.f6364s < 100) {
            return;
        }
        this.f6364s = 0;
        if (m909e()) {
            m913b("Reloading shader");
            try {
                m910d();
                this.f6358m = true;
                this.f6360o = 0;
                for (C0929af c0929af : this.f6361p) {
                    c0929af.f6366c = true;
                    c0929af.f6370b = -1;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo868c() {
        LoggerMaybe.m1079A().f6113bO.mo207a(this);
    }
}
