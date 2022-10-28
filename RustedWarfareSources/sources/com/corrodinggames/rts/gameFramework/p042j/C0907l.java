package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/l.class */
public final class C0907l {

    /* renamed from: a */
    static final boolean f5999a = false;

    /* renamed from: b */
    static boolean f6000b;

    /* renamed from: c */
    static boolean f6001c;

    /* renamed from: d */
    static boolean f6002d;

    /* renamed from: e */
    public static C0901f f6003e;

    /* renamed from: f */
    static boolean f6004f;

    /* renamed from: g */
    static boolean f6005g;

    /* renamed from: h */
    static boolean f6006h;

    /* renamed from: i */
    static int f6007i;

    /* renamed from: j */
    static boolean f6008j;

    /* renamed from: k */
    static ArrayList f6009k;

    /* renamed from: l */
    static boolean f6010l;

    /* renamed from: m */
    public static final boolean f6011m;

    /* renamed from: q */
    C0173b f6015q;

    /* renamed from: r */
    int f6016r;

    /* renamed from: s */
    short f6017s;

    /* renamed from: t */
    short f6018t;

    /* renamed from: x */
    public C0904i f6022x;

    /* renamed from: y */
    public C0904i f6023y;

    /* renamed from: z */
    public C0904i f6024z;

    /* renamed from: A */
    public C0904i f6025A;

    /* renamed from: B */
    public C0904i f6026B;

    /* renamed from: C */
    public C0904i f6027C;

    /* renamed from: D */
    public C0904i f6028D;

    /* renamed from: E */
    public C0904i f6029E;

    /* renamed from: n */
    public boolean f6012n = true;

    /* renamed from: o */
    RunnableC0910o f6013o = new RunnableC0910o(this);

    /* renamed from: p */
    boolean f6014p = true;

    /* renamed from: u */
    ArrayList f6019u = new ArrayList();

    /* renamed from: v */
    C0904i[] f6020v = new C0904i[0];

    /* renamed from: w */
    public Paint f6021w = new Paint();

    /* renamed from: F */
    Paint f6030F = new Paint();

    /* renamed from: G */
    Object f6031G = new Object();

    /* renamed from: I */
    LinkedList f6033I = new LinkedList();

    /* renamed from: J */
    LinkedList f6034J = new LinkedList();

    /* renamed from: K */
    Object f6035K = new Object();

    /* renamed from: H */
    ArrayList f6032H = new ArrayList();

    static {
        f6000b = !LoggerMaybe.f6190as;
        f6001c = false;
        f6002d = false;
        f6004f = false;
        f6005g = false;
        f6006h = false;
        f6007i = 20;
        f6008j = false;
        f6009k = new ArrayList();
        f6010l = false;
        f6011m = false;
    }

    /* renamed from: a */
    public C0904i m1159a(EnumC0246ao enumC0246ao) {
        C0904i[] c0904iArr;
        for (C0904i c0904i : this.f6020v) {
            if (c0904i.f5957a == enumC0246ao) {
                return c0904i;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m1158a(EnumC0246ao enumC0246ao, int i, int i2) {
        return m1156a(m1159a(enumC0246ao), i, i2);
    }

    /* renamed from: b */
    public boolean m1145b(EnumC0246ao enumC0246ao, int i, int i2) {
        return m1155a(m1159a(enumC0246ao), i, i2, true);
    }

    /* renamed from: a */
    public boolean m1156a(C0904i c0904i, int i, int i2) {
        return m1155a(c0904i, i, i2, false);
    }

    /* renamed from: a */
    public boolean m1155a(C0904i c0904i, int i, int i2, boolean z) {
        if (!this.f6015q.m4917c(i, i2)) {
            return true;
        }
        if (c0904i.f5957a == EnumC0246ao.f1706d) {
            return false;
        }
        int i3 = (i * this.f6018t) + i2;
        if ((!z && c0904i.f5961e[i3] == -1) || c0904i.f5960d[i3] == -1 || c0904i.f5962f[i3] == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m1144b(C0904i c0904i, int i, int i2) {
        if (!this.f6015q.m4917c(i, i2)) {
            return -1;
        }
        if (c0904i.f5957a == EnumC0246ao.f1706d) {
            return 0;
        }
        int i3 = (i * this.f6018t) + i2;
        if (c0904i.f5960d[i3] == -1 || c0904i.f5961e[i3] == -1 || c0904i.f5962f[i3] == -1) {
            return -1;
        }
        return c0904i.f5960d[i3] + c0904i.f5961e[i3] + (c0904i.f5962f[i3] * 10);
    }

    /* renamed from: c */
    public final int m1140c(C0904i c0904i, int i, int i2) {
        if (!this.f6015q.m4917c(i, i2)) {
            return -1;
        }
        if (c0904i.f5957a == EnumC0246ao.f1706d) {
            return 4;
        }
        if (c0904i.f5966j == null) {
            return -1;
        }
        return c0904i.f5966j[(i * this.f6018t) + i2];
    }

    /* renamed from: a */
    public boolean m1161a(int i, int i2) {
        if (!this.f6015q.m4917c(i, i2)) {
            return true;
        }
        int i3 = (i * this.f6018t) + i2;
        if (this.f6028D.f5960d[i3] != -1 || this.f6025A.f5960d[i3] == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m1146b(int i, int i2) {
        if (!this.f6015q.m4917c(i, i2)) {
            return true;
        }
        int i3 = (i * this.f6018t) + i2;
        if (this.f6027C.f5960d[i3] != -1 || this.f6029E.f5960d[i3] == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void m1160a(C0173b c0173b, boolean z) {
        m1139d();
        LoggerMaybe.LogDebug2("PathEngine: Setting up map costs");
        boolean z2 = false;
        if (z && this.f6015q != null && this.f6015q == c0173b && this.f6017s == c0173b.f833u.f904n && this.f6018t == c0173b.f833u.f905o) {
            if (this.f6016r == C0904i.m1192a(c0173b)) {
                LoggerMaybe.LogDebug2("PathEngine: Keeping existing map costs");
                z2 = true;
            } else {
                LoggerMaybe.LogDebug2("PathEngine: Error: Map checksum does not match!!!");
            }
        }
        if (z2) {
        }
        this.f6015q = c0173b;
        this.f6016r = C0904i.m1192a(c0173b);
        this.f6017s = (short) c0173b.f833u.f904n;
        this.f6018t = (short) c0173b.f833u.f905o;
        f6003e = null;
        this.f6019u.clear();
        this.f6020v = new C0904i[0];
        this.f6022x = new C0904i(this, EnumC0246ao.f1703a, this.f6017s, this.f6018t);
        this.f6023y = new C0904i(this, EnumC0246ao.f1704b, this.f6017s, this.f6018t);
        this.f6023y.m1186b();
        this.f6023y.m1189a((AbstractC0623y) null);
        this.f6024z = new C0904i(this, EnumC0246ao.f1705c, this.f6017s, this.f6018t);
        this.f6025A = new C0904i(this, EnumC0246ao.f1707e, this.f6017s, this.f6018t);
        this.f6025A.m1186b();
        this.f6025A.m1189a((AbstractC0623y) null);
        this.f6026B = new C0904i(this, EnumC0246ao.f1706d, this.f6017s, this.f6018t);
        this.f6027C = new C0904i(this, EnumC0246ao.f1708f, this.f6017s, this.f6018t);
        this.f6027C.m1186b();
        this.f6027C.m1189a((AbstractC0623y) null);
        this.f6028D = new C0904i(this, EnumC0246ao.f1709g, this.f6017s, this.f6018t);
        this.f6028D.m1186b();
        this.f6028D.m1189a((AbstractC0623y) null);
        this.f6029E = new C0904i(this, EnumC0246ao.f1710h, this.f6017s, this.f6018t);
        this.f6029E.m1186b();
        this.f6029E.m1189a((AbstractC0623y) null);
        Iterator it = this.f6032H.iterator();
        while (it.hasNext()) {
            ((RunnableC0910o) it.next()).m1119a(c0173b);
        }
        this.f6013o.m1119a(c0173b);
        LoggerMaybe.LogDebug2("PathEngine: Ready");
    }

    /* renamed from: a */
    public void m1163a() {
        int i;
        int i2;
        int i3;
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        C0904i c0904i = this.f6023y;
        Rect rect = new Rect();
        float f = m1079A.f6144cv;
        float f2 = m1079A.f6145cw;
        float f3 = m1079A.f6148cz;
        float f4 = m1079A.f6149cA;
        C0178e c0178e = m1079A.f6110bL.f833u;
        int i4 = (int) ((f * this.f6015q.f789r) - 1.0f);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) ((f2 * this.f6015q.f790s) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) (((f + f3) * this.f6015q.f789r) + 1.0f);
        if (i6 > this.f6017s - 1) {
            i6 = this.f6017s - 1;
        }
        int i7 = (int) (((f2 + f4) * this.f6015q.f790s) + 1.0f);
        if (i7 > this.f6018t - 1) {
            i7 = this.f6018t - 1;
        }
        for (int i8 = i4; i8 < i6 + 1; i8++) {
            for (int i9 = i5; i9 < i7 + 1; i9++) {
                if (c0178e.m4869a(i8, i9) != null) {
                    int i10 = i8 * this.f6015q.f785n;
                    int i11 = i9 * this.f6015q.f786o;
                    rect.m5467a(i10, i11, i10 + this.f6015q.f785n, i11 + this.f6015q.f786o);
                    rect.m5468a((int) (-f), (int) (-f2));
                    boolean m5464b = rect.m5464b((int) (m1079A.f6117bS.f5129s / m1079A.f6256cW), (int) (m1079A.f6117bS.f5130t / m1079A.f6256cW));
                    if (!f6005g || m5464b) {
                        byte b = c0904i.f5960d[(i8 * this.f6018t) + i9];
                        byte b2 = c0904i.f5961e[(i8 * this.f6018t) + i9];
                        int i12 = c0904i.f5962f[(i8 * this.f6018t) + i9];
                        if (b == -1) {
                            i = 255;
                        } else {
                            i = b * 2;
                        }
                        if (b2 == -1) {
                            i2 = 255;
                        } else {
                            i2 = b2 * 2;
                        }
                        if (i12 == -1) {
                            i3 = 255;
                        } else {
                            if (i12 != 0) {
                                i12 += 30;
                            }
                            i3 = i12 * 2;
                        }
                        this.f6030F.m5523a(128, i, i2, i3);
                        m1079A.f6113bO.mo167b(rect, this.f6030F);
                        if (m5464b && c0904i.f5962f != null) {
                            m1079A.f6113bO.mo186a("o:" + ((int) c0904i.f5962f[(i8 * this.f6018t) + i9]), rect.m5460d(), rect.m5459e(), m1079A.f6169do);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1157a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y != null) {
            AbstractC0197n.m4686b(abstractC0623y);
        }
        for (C0904i c0904i : this.f6020v) {
            c0904i.m1183c(abstractC0623y);
        }
        this.f6023y.m1189a(abstractC0623y);
        this.f6027C.m1189a(abstractC0623y);
        this.f6028D.m1189a(abstractC0623y);
        this.f6029E.m1189a(abstractC0623y);
    }

    /* renamed from: b */
    public void m1148b() {
        for (C0904i c0904i : this.f6020v) {
            c0904i.m1181e();
        }
    }

    public C0907l() {
        this.f6032H.add(new RunnableC0910o(this));
        int m2090c = C0758f.m2090c();
        if (m2090c > 1) {
            LoggerMaybe.m989b("PathEngine", "We have " + m2090c + " cores, creating extra solvers");
            this.f6032H.add(new RunnableC0910o(this));
        } else {
            LoggerMaybe.m989b("PathEngine", "We only have one core, using single solver");
        }
        Iterator it = this.f6032H.iterator();
        while (it.hasNext()) {
            ((RunnableC0910o) it.next()).m1111c();
        }
    }

    /* renamed from: c */
    public void m1142c() {
        Iterator it = this.f6033I.iterator();
        while (it.hasNext()) {
            ((C0906k) it.next()).f5992w = true;
        }
        this.f6033I.clear();
        m1134h();
    }

    /* renamed from: d */
    public void m1139d() {
        Iterator it = this.f6033I.iterator();
        while (it.hasNext()) {
            m1153a((C0906k) it.next());
        }
        this.f6033I.clear();
        m1134h();
    }

    /* renamed from: a */
    public void m1154a(C0904i c0904i, boolean z) {
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        if (!z) {
            if (c0904i.f5967k + 50 < m1079A.f6239bx) {
                c0904i.f5967k = m1079A.f6239bx - 40;
                c0904i.m1181e();
            }
            c0904i.m1187a(z);
            return;
        }
        if (c0904i.f5967k + 30 < m1079A.f6239bx) {
            c0904i.f5967k = m1079A.f6239bx;
            c0904i.m1181e();
        }
        c0904i.m1187a(z);
    }

    /* renamed from: a */
    public C0906k m1149a(boolean z) {
        C0901f c0906k;
        if (AbstractC0623y.f3996K) {
            c0906k = new C0901f(this, z);
        } else {
            c0906k = new C0906k(this, z);
        }
        return c0906k;
    }

    /* renamed from: a */
    public void m1152a(C0906k c0906k, boolean z) {
        m1151a(c0906k, z, false);
    }

    /* renamed from: a */
    public void m1151a(C0906k c0906k, boolean z, boolean z2) {
        if (!this.f6014p) {
            LoggerMaybe.m989b("PathEngine", "Cannot start new path, not running");
            return;
        }
        LoggerMaybe m1079A = LoggerMaybe.m1079A();
        m1154a(m1159a(c0906k.f5984o), z);
        c0906k.m1167e();
        c0906k.f5989t = 300.0f;
        int m2073d = C0758f.m2073d(c0906k.f5977h - c0906k.f5981l);
        int m2073d2 = C0758f.m2073d(c0906k.f5978i - c0906k.f5982m);
        if (m2073d < 15 && m2073d2 < 15) {
            c0906k.f5989t = 12.0f;
        } else if (m2073d < 50 && m2073d2 < 50) {
            c0906k.f5989t = 16.0f;
        } else if (m2073d < 200 && m2073d2 < 200) {
            c0906k.f5989t = 24.0f;
        } else if (m2073d < 400 && m2073d2 < 400) {
            c0906k.f5989t = 50.0f;
        } else if (m2073d < 1000 && m2073d2 < 1000) {
            c0906k.f5989t = 100.0f;
        } else if (m2073d < 2000 && m2073d2 < 2000) {
            c0906k.f5989t = 200.0f;
        }
        if (!m1079A.f6122bX.lock1 && !m1079A.f6126cb.m2414g()) {
            if (m2073d < 1000 && m2073d2 < 1000) {
                c0906k.f5989t = 180.0f;
            } else {
                c0906k.f5989t = 360.0f;
            }
        }
        if (c0906k.f5987r) {
            c0906k.f5989t *= 2.0f;
            c0906k.f5989t += 50.0f;
        }
        c0906k.f5988s = c0906k.f5989t;
        if (!this.f6012n || z2) {
            this.f6013o.m1116a(c0906k);
            this.f6013o.m1113b();
            this.f6033I.add(c0906k);
            return;
        }
        m1143b(c0906k);
        this.f6033I.add(c0906k);
    }

    /* renamed from: a */
    public void m1162a(float f) {
        m1133i();
    }

    /* renamed from: b */
    public void m1147b(float f) {
        C0904i[] c0904iArr;
        for (C0904i c0904i : this.f6020v) {
            c0904i.f5972p = 0;
            if (c0904i.f5971o) {
                c0904i.f5971o = false;
                c0904i.m1183c(null);
            }
        }
        m1133i();
        m1138d(f);
    }

    /* renamed from: c */
    public void m1141c(float f) {
        if (f6008j) {
            Iterator it = f6009k.iterator();
            while (it.hasNext()) {
                C0906k c0906k = (C0906k) it.next();
                c0906k.m1164h();
                c0906k.m1165g();
            }
        }
        if (f6002d) {
            boolean z = true;
            LoggerMaybe m1079A = LoggerMaybe.m1079A();
            if (m1079A.f6117bS.f5258bL.f6922b > 0) {
                AbstractC0244am mo502a = m1079A.f6117bS.f5258bL.mo502a(0);
                if (mo502a instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) mo502a;
                    if (abstractC0623y.f3937at != null) {
                        abstractC0623y.f3937at.mo1195d(abstractC0623y);
                        z = false;
                    }
                }
            }
            if (z) {
            }
        }
        if (f6004f) {
            m1163a();
        }
        if (f6006h) {
        }
    }

    /* renamed from: e */
    public boolean m1137e() {
        Iterator it = this.f6033I.iterator();
        while (it.hasNext()) {
            C0906k c0906k = (C0906k) it.next();
            if (c0906k.f5989t <= 0.0f && !c0906k.mo1168c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String m1136f() {
        Iterator it = this.f6033I.iterator();
        String str = null;
        int i = 0;
        while (it.hasNext()) {
            C0906k c0906k = (C0906k) it.next();
            if (c0906k.f5989t <= 0.0f && !c0906k.mo1168c()) {
                if (str == null) {
                    str = "[distance:" + C0758f.m2108b(c0906k.f5977h, c0906k.f5978i, c0906k.f5981l, c0906k.f5982m) + ", allowedDelay:" + c0906k.f5988s + " lowPriority:" + c0906k.f5987r + "]";
                }
                i++;
            }
        }
        String str2 = "(total:" + i + ") ";
        if (str != null) {
            str2 = str2 + str;
        }
        return str2;
    }

    /* renamed from: d */
    private void m1138d(float f) {
        Iterator it = this.f6033I.iterator();
        while (it.hasNext()) {
            C0906k c0906k = (C0906k) it.next();
            if (c0906k.f5989t <= 0.0f) {
                c0906k.f5989t = 0.0f;
                c0906k.f5990u = true;
                if (f6008j) {
                    f6009k.add(c0906k);
                    if (f6009k.size() > 10) {
                        f6009k.remove(0);
                    }
                }
                if (!c0906k.mo1168c()) {
                    if (LoggerMaybe.m1079A().m999ax()) {
                        LoggerMaybe.m989b("PathEngine", "updateUnfinishedPaths: path wasn't solved, isGoingToBlockThisFrame did not protect");
                    }
                    m1153a(c0906k);
                }
                if (c0906k.mo1168c()) {
                    it.remove();
                }
            } else {
                c0906k.f5989t -= f;
            }
        }
    }

    /* renamed from: g */
    private C0906k m1135g() {
        C0906k c0906k = null;
        Iterator it = this.f6034J.iterator();
        while (it.hasNext()) {
            C0906k c0906k2 = (C0906k) it.next();
            if (c0906k == null || c0906k.f5989t > c0906k2.f5989t) {
                c0906k = c0906k2;
            }
        }
        if (c0906k == null) {
            throw new RuntimeException("Failed to find any paths");
        }
        if (!this.f6034J.remove(c0906k)) {
            throw new RuntimeException("Failed remove found path");
        }
        return c0906k;
    }

    /* renamed from: b */
    private void m1143b(C0906k c0906k) {
        synchronized (this.f6035K) {
            this.f6034J.add(c0906k);
        }
    }

    /* renamed from: h */
    private void m1134h() {
        synchronized (this.f6035K) {
            this.f6034J.clear();
        }
    }

    /* renamed from: i */
    private void m1133i() {
        RunnableC0910o m1132j;
        LinkedList linkedList = this.f6034J;
        if (linkedList.size() > 0) {
            synchronized (this.f6035K) {
                while (linkedList.size() > 0 && (m1132j = m1132j()) != null) {
                    C0906k m1135g = m1135g();
                    if (!m1135g.f5991v) {
                        m1150a(m1132j, m1135g);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private RunnableC0910o m1132j() {
        Iterator it = this.f6032H.iterator();
        while (it.hasNext()) {
            RunnableC0910o runnableC0910o = (RunnableC0910o) it.next();
            if (runnableC0910o.f6070s) {
                return runnableC0910o;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m1153a(C0906k c0906k) {
        RunnableC0910o m1132j;
        if (!c0906k.f5991v) {
            while (true) {
                synchronized (this.f6031G) {
                    m1132j = m1132j();
                    if (m1132j != null) {
                        break;
                    }
                    try {
                        this.f6031G.wait(2000L);
                    } catch (InterruptedException e) {
                    }
                }
            }
            m1150a(m1132j, c0906k);
        }
        boolean z = false;
        long m1059U = LoggerMaybe.m1059U();
        while (true) {
            synchronized (this.f6031G) {
                if (c0906k.mo1168c()) {
                    break;
                }
                z = true;
                m1133i();
                try {
                    this.f6031G.wait(2000L);
                } catch (InterruptedException e2) {
                }
            }
            if (!z && f6000b) {
                LoggerMaybe.m989b("PathEngine", "We were blocked path(" + c0906k.f5974e + ") for:" + (LoggerMaybe.m1059U() - m1059U));
                return;
            }
        }
        if (!z) {
        }
    }

    /* renamed from: a */
    private void m1150a(RunnableC0910o runnableC0910o, C0906k c0906k) {
        synchronized (c0906k) {
            if (!c0906k.f5991v) {
                runnableC0910o.m1116a(c0906k);
                runnableC0910o.m1122a();
            }
        }
    }
}
