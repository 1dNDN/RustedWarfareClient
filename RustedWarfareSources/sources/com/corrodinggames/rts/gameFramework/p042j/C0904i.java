package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0243al;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.utility.C1082ak;
import com.corrodinggames.rts.gameFramework.utility.C1093g;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.j.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/i.class */
public final class C0904i {

    /* renamed from: q */
    private final C0907l f5956q;

    /* renamed from: a */
    EnumC0246ao f5957a;

    /* renamed from: b */
    public final int f5958b;

    /* renamed from: c */
    public final int f5959c;

    /* renamed from: d */
    public byte[] f5960d;

    /* renamed from: e */
    public byte[] f5961e;

    /* renamed from: f */
    public byte[] f5962f;

    /* renamed from: g */
    public short[] f5963g;

    /* renamed from: h */
    public HashMap f5964h;

    /* renamed from: i */
    public int f5965i;

    /* renamed from: j */
    public byte[] f5966j;

    /* renamed from: m */
    public boolean f5967m;

    /* renamed from: o */
    public boolean f5968o;

    /* renamed from: p */
    public int f5969p;

    /* renamed from: k */
    public int f5970k = -99;

    /* renamed from: l */
    public int f5971l = 0;

    /* renamed from: n */
    Point f5972n = new Point();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0904i(C0907l c0907l, EnumC0246ao enumC0246ao, int i, int i2) {
        this.f5958b = i;
        this.f5959c = i2;
        this.f5956q = c0907l;
        this.f5957a = enumC0246ao;
        this.f5960d = new byte[i * i2];
        this.f5956q.f6027u.add(this);
        this.f5956q.f6028v = (C0904i[]) this.f5956q.f6027u.toArray(new C0904i[0]);
        m1201a();
    }

    /* renamed from: a */
    void m1201a() {
        m1190d();
        m1191c(null);
        m1189e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1197a(AbstractC0623y abstractC0623y) {
        double m2438a;
        if (abstractC0623y != null) {
            this.f5971l++;
            if (this.f5971l > 50) {
                if (!this.f5967m) {
                    Core.LogDebug2("buildAndReplaceClearanceCost being skipped");
                }
                this.f5967m = true;
                return;
            }
        }
        if (abstractC0623y != null) {
            m1193b(abstractC0623y);
            return;
        }
        long j = 0;
        if (abstractC0623y == null) {
            j = C0727bl.m2440a();
        }
        C0173b c0173b = this.f5956q.f6012q;
        byte[] bArr = this.f5966j;
        if (this.f5966j == null) {
            abstractC0623y = null;
        }
        this.f5966j = new byte[this.f5958b * this.f5959c];
        short s = 0;
        short s2 = 0;
        short s3 = this.f5956q.f6014s;
        short s4 = this.f5956q.f6015t;
        if (abstractC0623y != null) {
            if (bArr != null) {
                C0758f.m2166a(bArr, this.f5966j);
            }
            c0173b.m5344a(abstractC0623y.f6958el, abstractC0623y.f6959em);
            Rect cb = abstractC0623y.m4706cb();
            short s5 = (short) c0173b.f801T;
            short s6 = (short) c0173b.f802U;
            s = (short) ((s5 - 5) + cb.f230a);
            s2 = (short) ((s6 - 5) + cb.f231b);
            s3 = (short) (s5 + 5 + cb.f232c);
            s4 = (short) (s6 + 5 + cb.f233d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.f5956q.f6014s) {
            s3 = this.f5956q.f6014s;
        }
        if (s4 > this.f5956q.f6015t) {
            s4 = this.f5956q.f6015t;
        }
        short s7 = s;
        while (true) {
            short s8 = s7;
            if (s8 >= s3) {
                break;
            }
            short s9 = s2;
            while (true) {
                short s10 = s9;
                if (s10 < s4) {
                    boolean z = false;
                    if (this.f5960d[(s8 * this.f5959c) + s10] == -1) {
                        z = true;
                    }
                    if (this.f5961e[(s8 * this.f5959c) + s10] == -1) {
                        z = true;
                    }
                    if (z) {
                        this.f5966j[(s8 * this.f5959c) + s10] = 0;
                    } else {
                        this.f5966j[(s8 * this.f5959c) + s10] = 4;
                    }
                    s9 = (short) (s10 + 1);
                }
            }
            s7 = (short) (s8 + 1);
        }
        short s11 = s;
        while (true) {
            short s12 = s11;
            if (s12 >= s3) {
                break;
            }
            short s13 = s2;
            while (true) {
                short s14 = s13;
                if (s14 < s4) {
                    if (this.f5966j[(s12 * this.f5959c) + s14] == 0) {
                        m1198a(c0173b, s12, s14, this.f5966j);
                    }
                    s13 = (short) (s14 + 1);
                }
            }
            s11 = (short) (s12 + 1);
        }
        short s15 = s;
        while (true) {
            short s16 = s15;
            if (s16 >= s3) {
                break;
            }
            m1198a(c0173b, s16, (short) -1, this.f5966j);
            m1198a(c0173b, s16, (short) (this.f5956q.f6015t + 1), this.f5966j);
            s15 = (short) (s16 + 1);
        }
        short s17 = s2;
        while (true) {
            short s18 = s17;
            if (s18 >= s4) {
                break;
            }
            m1198a(c0173b, (short) -1, s18, this.f5966j);
            m1198a(c0173b, (short) (this.f5956q.f6014s + 1), s18, this.f5966j);
            s17 = (short) (s18 + 1);
        }
        if (abstractC0623y == null) {
            if (C0727bl.m2438a(j) > 30.0d) {
                Core.LogDebug2("buildAndReplaceClearanceCostNew took:" + C0727bl.m2439a(m2438a) + " for:" + this.f5957a);
            }
        }
    }

    /* renamed from: a */
    final void m1198a(C0173b c0173b, short s, short s2, byte[] bArr) {
        int m2200a;
        int i = s - 3;
        int i2 = s2 - 3;
        int i3 = s + 3;
        int i4 = s2 + 3;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > c0173b.f792C - 1) {
            i3 = c0173b.f792C - 1;
        }
        if (i4 > c0173b.f793D - 1) {
            i4 = c0173b.f793D - 1;
        }
        for (int i5 = i; i5 <= i3; i5++) {
            for (int i6 = i2; i6 <= i4; i6++) {
                byte b = bArr[(i5 * this.f5959c) + i6];
                if (b != 0 && (m2200a = C0758f.m2200a((int) s, (int) s2, i5, i6)) < b) {
                    bArr[(i5 * this.f5959c) + i6] = (byte) m2200a;
                }
            }
        }
    }

    /* renamed from: b */
    void m1193b(AbstractC0623y abstractC0623y) {
        long j = 0;
        if (abstractC0623y == null) {
            j = C0727bl.m2440a();
        }
        C0173b c0173b = this.f5956q.f6012q;
        byte[] bArr = this.f5966j;
        if (this.f5966j == null) {
            abstractC0623y = null;
        }
        this.f5966j = new byte[this.f5958b * this.f5959c];
        short s = 0;
        short s2 = 0;
        short s3 = this.f5956q.f6014s;
        short s4 = this.f5956q.f6015t;
        if (abstractC0623y != null) {
            if (bArr != null) {
                C0758f.m2166a(bArr, this.f5966j);
            }
            c0173b.m5344a(abstractC0623y.f6958el, abstractC0623y.f6959em);
            Rect cb = abstractC0623y.m4706cb();
            short s5 = (short) c0173b.f801T;
            short s6 = (short) c0173b.f802U;
            s = (short) ((s5 - 5) + cb.f230a);
            s2 = (short) ((s6 - 5) + cb.f231b);
            s3 = (short) (s5 + 5 + cb.f232c);
            s4 = (short) (s6 + 5 + cb.f233d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.f5956q.f6014s) {
            s3 = this.f5956q.f6014s;
        }
        if (s4 > this.f5956q.f6015t) {
            s4 = this.f5956q.f6015t;
        }
        short s7 = s;
        while (true) {
            short s8 = s7;
            if (s8 >= s3) {
                break;
            }
            short s9 = s2;
            while (true) {
                short s10 = s9;
                if (s10 < s4) {
                    this.f5966j[(s8 * this.f5959c) + s10] = m1199a(c0173b, s8, s10);
                    s9 = (short) (s10 + 1);
                }
            }
            s7 = (short) (s8 + 1);
        }
        if (abstractC0623y == null) {
            Core.LogDebug2("buildAndReplaceClearanceCost took:" + C0727bl.m2439a(C0727bl.m2438a(j)) + " for:" + this.f5957a);
        }
    }

    /* renamed from: a */
    final byte m1199a(C0173b c0173b, short s, short s2) {
        int m2200a;
        if (this.f5960d[(s * this.f5959c) + s2] == -1) {
            return (byte) 0;
        }
        int i = s2 - 3;
        int i2 = s + 3;
        int i3 = s2 + 3;
        int i4 = 4;
        for (int i5 = s - 3; i5 <= i2; i5++) {
            for (int i6 = i; i6 <= i3; i6++) {
                boolean z = false;
                if (c0173b.m5300c(i5, i6)) {
                    if (this.f5960d[(i5 * this.f5959c) + i6] == -1) {
                        z = true;
                    }
                    if (this.f5961e[(i5 * this.f5959c) + i6] == -1) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                if (z && (m2200a = C0758f.m2200a((int) s, (int) s2, i5, i6)) < i4) {
                    i4 = m2200a;
                }
            }
        }
        return (byte) i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1194b() {
        int i = this.f5958b;
        int i2 = this.f5959c;
        this.f5963g = new short[i * i2];
        this.f5964h = new HashMap();
        short s = 1;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 < i) {
                short s4 = 0;
                while (true) {
                    short s5 = s4;
                    if (s5 < i2) {
                        if (this.f5963g[(s3 * i2) + s5] == 0) {
                            if (s <= 0) {
                                Log.m5772d("RustedWarfare", "warning buildIsolatedGroups looped, ending");
                                return;
                            }
                            int m1196a = m1196a(s3, s5, s);
                            if (m1196a > 0) {
                                this.f5964h.put(Short.valueOf(s), Integer.valueOf(m1196a));
                                if (this.f5965i < m1196a) {
                                    this.f5965i = m1196a;
                                }
                                s = (short) (s + 1);
                            }
                        }
                        s4 = (short) (s5 + 1);
                    }
                }
            } else {
                return;
            }
            s2 = (short) (s3 + 1);
        }
    }

    /* renamed from: a */
    int m1196a(short s, short s2, short s3) {
        int i = this.f5959c;
        C0173b c0173b = this.f5956q.f6012q;
        short[] sArr = this.f5963g;
        byte[] bArr = this.f5960d;
        if (bArr[(s * i) + s2] == -1) {
            sArr[(s * i) + s2] = -1;
            return 0;
        } else if (s3 == 0) {
            throw new RuntimeException("id cannot be 0 is will cause can endless loop");
        } else {
            int i2 = 0;
            C1093g c1093g = new C1093g();
            c1093g.add(new C1082ak(s, s2));
            while (!c1093g.isEmpty()) {
                C1082ak c1082ak = (C1082ak) c1093g.m561a();
                short s4 = c1082ak.f6853a;
                short s5 = c1082ak.f6854b;
                if (c0173b.m5300c((int) s4, (int) s5)) {
                    int i3 = (s4 * i) + s5;
                    if (sArr[i3] == 0 && bArr[i3] != -1) {
                        sArr[i3] = s3;
                        i2++;
                        c1093g.add(new C1082ak((short) (s4 - 1), s5));
                        c1093g.add(new C1082ak((short) (s4 + 1), s5));
                        c1093g.add(new C1082ak(s4, (short) (s5 - 1)));
                        c1093g.add(new C1082ak(s4, (short) (s5 + 1)));
                    }
                }
            }
            return i2;
        }
    }

    /* renamed from: c */
    boolean m1192c() {
        return (this.f5957a.equals(EnumC0246ao.f1706d) || this.f5957a.equals(EnumC0246ao.f1703a)) ? false : true;
    }

    /* renamed from: a */
    public static int m1200a(C0173b c0173b) {
        C0178e c0178e = c0173b.f833u;
        int i = 0;
        for (int i2 = 0; i2 < c0178e.f904n; i2++) {
            for (int i3 = 0; i3 < c0178e.f905o; i3++) {
                C0180g m5252a = c0178e.m5252a(i2, i3);
                if (m5252a != null) {
                    i += (0 + (m5252a.f918e ? 1 : 0) + (m5252a.f921h ? 2 : 0) + (m5252a.f924k ? 4 : 0) + (m5252a.f920g ? 8 : 0) + (m5252a.f919f ? 16 : 0)) * (i2 + i3);
                }
            }
        }
        return i;
    }

    /* renamed from: d */
    void m1190d() {
        C0173b c0173b = this.f5956q.f6012q;
        byte[] bArr = this.f5960d;
        short[] m5253a = c0173b.f833u.m5253a();
        C0180g[] c0180gArr = c0173b.f840B;
        EnumC0246ao enumC0246ao = this.f5957a;
        int i = this.f5958b;
        int i2 = this.f5959c;
        if (!m1192c()) {
            return;
        }
        boolean z = enumC0246ao.equals(EnumC0246ao.f1707e) || enumC0246ao.equals(EnumC0246ao.f1708f) || enumC0246ao.equals(EnumC0246ao.f1710h);
        boolean z2 = enumC0246ao.equals(EnumC0246ao.f1708f) || enumC0246ao.equals(EnumC0246ao.f1709g) || enumC0246ao.equals(EnumC0246ao.f1710h);
        boolean z3 = enumC0246ao.equals(EnumC0246ao.f1709g) || enumC0246ao.equals(EnumC0246ao.f1710h);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (i3 * i2) + i4;
                bArr[i5] = 0;
                C0180g c0180g = c0180gArr[m5253a[i5]];
                if (c0180g != null) {
                    if (c0180g.f918e && !z) {
                        bArr[i5] = -1;
                    }
                    if (c0180g.f921h && !z2) {
                        bArr[i5] = -1;
                    }
                    if (c0180g.f924k && !z3) {
                        bArr[i5] = -1;
                    }
                    if (c0180g.f920g && 0 == 0) {
                        bArr[i5] = -1;
                    }
                    if (enumC0246ao == EnumC0246ao.f1707e && !c0180g.f918e && !c0180g.f919f) {
                        bArr[i5] = -1;
                    }
                }
                C0180g m5290e = c0173b.m5290e(i3, i4);
                if (m5290e != null) {
                    if (enumC0246ao == EnumC0246ao.f1704b && m5290e.f922i) {
                        bArr[i5] = -1;
                    }
                    if (m5290e.f924k && !z3) {
                        bArr[i5] = -1;
                    }
                    if (bArr[i5] == 0) {
                        bArr[i5] = m5290e.f923j;
                    }
                }
                if (c0180g != null && bArr[i5] == 0) {
                    bArr[i5] = c0180g.f923j;
                }
            }
        }
        if (c0173b.f791x != null) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 < i2; i7++) {
                    C0180g m5252a = c0173b.f791x.m5252a(i6, i7);
                    if (m5252a != null) {
                        bArr[(i6 * i2) + i7] = 0;
                        if (m5252a.f918e && !z) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (m5252a.f921h && !z2) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (m5252a.f924k && !z3) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (m5252a.f920g && 0 == 0) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (bArr[(i6 * i2) + i7] == 0) {
                            bArr[(i6 * i2) + i7] = m5252a.f923j;
                        }
                        if (enumC0246ao == EnumC0246ao.f1707e && !m5252a.f918e && !m5252a.f919f) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m1191c(AbstractC0623y abstractC0623y) {
        Rect m4706cb;
        if (abstractC0623y != null) {
            this.f5969p++;
            if (this.f5969p > 50) {
                this.f5968o = true;
                return;
            }
        }
        Core.m1067U();
        this.f5961e = new byte[this.f5958b * this.f5959c];
        byte[] bArr = this.f5961e;
        if (this.f5957a.equals(EnumC0246ao.f1706d)) {
            return;
        }
        C0173b c0173b = this.f5956q.f6012q;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.m4758bI() && !abstractC0244am.f1607bT) {
                Point m4790a = abstractC0244am.m4790a(c0173b, this.f5972n);
                int i2 = m4790a.f224a;
                int i3 = m4790a.f225b;
                if (this.f5957a.equals(EnumC0246ao.f1705c)) {
                    m4706cb = abstractC0244am.m4705cc();
                } else {
                    m4706cb = abstractC0244am.m4706cb();
                }
                for (int i4 = i2 + m4706cb.f230a; i4 <= i2 + m4706cb.f232c; i4++) {
                    for (int i5 = i3 + m4706cb.f231b; i5 <= i3 + m4706cb.f233d; i5++) {
                        if (c0173b.m5300c(i4, i5)) {
                            bArr[(i4 * this.f5959c) + i5] = -1;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m1189e() {
        byte[] bArr;
        Core.m1067U();
        int i = this.f5959c;
        this.f5962f = new byte[this.f5958b * i];
        if (this.f5957a.equals(EnumC0246ao.f1706d)) {
            return;
        }
        C0173b c0173b = this.f5956q.f6012q;
        int i2 = c0173b.f787p;
        int i3 = c0173b.f788q;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0244am abstractC0244am = m498a[i4];
            if (abstractC0244am.f1606bS && !abstractC0244am.m4758bI() && !abstractC0244am.f1648cI && !(abstractC0244am instanceof C0243al) && !abstractC0244am.f1607bT && !abstractC0244am.mo3038i() && abstractC0244am.f1651cL == null && !abstractC0244am.mo3054Q()) {
                int i5 = 2;
                c0173b.m5344a(abstractC0244am.f6958el, abstractC0244am.f6959em);
                int i6 = c0173b.f801T;
                int i7 = c0173b.f802U;
                float f = abstractC0244am.f1621ch + 5.0f;
                float f2 = abstractC0244am.f1621ch + 10.0f;
                if (f2 < 10.0f) {
                    i5 = 0;
                } else if (f2 < 20.0f) {
                    i5 = 1;
                }
                for (int i8 = i6 - i5; i8 <= i6 + i5; i8++) {
                    for (int i9 = i7 - i5; i9 <= i7 + i5; i9++) {
                        if (c0173b.m5300c(i8, i9)) {
                            c0173b.m5340a(i8, i9);
                            float m2209a = C0758f.m2209a(c0173b.f801T + i2, c0173b.f802U + i3, abstractC0244am.f6958el, abstractC0244am.f6959em);
                            int i10 = (i8 * i) + i9;
                            if (m2209a < f * f) {
                                byte[] bArr2 = this.f5962f;
                                bArr2[i10] = (byte) (bArr2[i10] + 6);
                            } else if (m2209a < f2 * f2) {
                                this.f5962f[i10] = (byte) (bArr[i10] + (6 * 0.333d));
                            }
                            if (this.f5962f[i10] < -1) {
                                this.f5962f[i10] = Byte.MAX_VALUE;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1195a(boolean z) {
        if (!z) {
            return;
        }
        if (this.f5967m) {
            this.f5971l = 0;
            this.f5967m = false;
            m1191c(null);
            if (this.f5966j != null) {
                m1197a((AbstractC0623y) null);
            }
        }
        this.f5971l = 0;
    }
}
