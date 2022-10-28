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
import com.corrodinggames.rts.gameFramework.Core;
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
    C0173b f6012q;

    /* renamed from: r */
    int f6013r;

    /* renamed from: s */
    short f6014s;

    /* renamed from: t */
    short f6015t;

    /* renamed from: x */
    public C0904i f6016x;

    /* renamed from: y */
    public C0904i f6017y;

    /* renamed from: z */
    public C0904i f6018z;

    /* renamed from: A */
    public C0904i f6019A;

    /* renamed from: B */
    public C0904i f6020B;

    /* renamed from: C */
    public C0904i f6021C;

    /* renamed from: D */
    public C0904i f6022D;

    /* renamed from: E */
    public C0904i f6023E;

    /* renamed from: n */
    public boolean f6024n = true;

    /* renamed from: o */
    RunnableC0910o f6025o = new RunnableC0910o(this);

    /* renamed from: p */
    boolean f6026p = true;

    /* renamed from: u */
    ArrayList f6027u = new ArrayList();

    /* renamed from: v */
    C0904i[] f6028v = new C0904i[0];

    /* renamed from: w */
    public Paint f6029w = new Paint();

    /* renamed from: F */
    Paint f6030F = new Paint();

    /* renamed from: G */
    Object f6031G = new Object();

    /* renamed from: I */
    LinkedList f6032I = new LinkedList();

    /* renamed from: J */
    LinkedList f6033J = new LinkedList();

    /* renamed from: K */
    Object f6034K = new Object();

    /* renamed from: H */
    ArrayList f6035H = new ArrayList();

    static {
        f6000b = !Core.f6190as;
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
    public C0904i m1167a(EnumC0246ao enumC0246ao) {
        C0904i[] c0904iArr;
        for (C0904i c0904i : this.f6028v) {
            if (c0904i.f5957a == enumC0246ao) {
                return c0904i;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m1166a(EnumC0246ao enumC0246ao, int i, int i2) {
        return m1164a(m1167a(enumC0246ao), i, i2);
    }

    /* renamed from: b */
    public boolean m1153b(EnumC0246ao enumC0246ao, int i, int i2) {
        return m1163a(m1167a(enumC0246ao), i, i2, true);
    }

    /* renamed from: a */
    public boolean m1164a(C0904i c0904i, int i, int i2) {
        return m1163a(c0904i, i, i2, false);
    }

    /* renamed from: a */
    public boolean m1163a(C0904i c0904i, int i, int i2, boolean z) {
        if (!this.f6012q.m5300c(i, i2)) {
            return true;
        }
        if (c0904i.f5957a == EnumC0246ao.f1706d) {
            return false;
        }
        int i3 = (i * this.f6015t) + i2;
        if ((!z && c0904i.f5961e[i3] == -1) || c0904i.f5960d[i3] == -1 || c0904i.f5962f[i3] == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m1152b(C0904i c0904i, int i, int i2) {
        if (!this.f6012q.m5300c(i, i2)) {
            return -1;
        }
        if (c0904i.f5957a == EnumC0246ao.f1706d) {
            return 0;
        }
        int i3 = (i * this.f6015t) + i2;
        if (c0904i.f5960d[i3] == -1 || c0904i.f5961e[i3] == -1 || c0904i.f5962f[i3] == -1) {
            return -1;
        }
        return c0904i.f5960d[i3] + c0904i.f5961e[i3] + (c0904i.f5962f[i3] * 10);
    }

    /* renamed from: c */
    public final int m1148c(C0904i c0904i, int i, int i2) {
        if (!this.f6012q.m5300c(i, i2)) {
            return -1;
        }
        if (c0904i.f5957a == EnumC0246ao.f1706d) {
            return 4;
        }
        if (c0904i.f5966j == null) {
            return -1;
        }
        return c0904i.f5966j[(i * this.f6015t) + i2];
    }

    /* renamed from: a */
    public boolean m1169a(int i, int i2) {
        if (!this.f6012q.m5300c(i, i2)) {
            return true;
        }
        int i3 = (i * this.f6015t) + i2;
        if (this.f6022D.f5960d[i3] != -1 || this.f6019A.f5960d[i3] == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m1154b(int i, int i2) {
        if (!this.f6012q.m5300c(i, i2)) {
            return true;
        }
        int i3 = (i * this.f6015t) + i2;
        if (this.f6021C.f5960d[i3] != -1 || this.f6023E.f5960d[i3] == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void m1168a(C0173b c0173b, boolean z) {
        m1147d();
        Core.LogDebug2("PathEngine: Setting up map costs");
        boolean z2 = false;
        if (z && this.f6012q != null && this.f6012q == c0173b && this.f6014s == c0173b.f833u.f904n && this.f6015t == c0173b.f833u.f905o) {
            if (this.f6013r == C0904i.m1200a(c0173b)) {
                Core.LogDebug2("PathEngine: Keeping existing map costs");
                z2 = true;
            } else {
                Core.LogDebug2("PathEngine: Error: Map checksum does not match!!!");
            }
        }
        if (z2) {
        }
        this.f6012q = c0173b;
        this.f6013r = C0904i.m1200a(c0173b);
        this.f6014s = (short) c0173b.f833u.f904n;
        this.f6015t = (short) c0173b.f833u.f905o;
        f6003e = null;
        this.f6027u.clear();
        this.f6028v = new C0904i[0];
        this.f6016x = new C0904i(this, EnumC0246ao.f1703a, this.f6014s, this.f6015t);
        this.f6017y = new C0904i(this, EnumC0246ao.f1704b, this.f6014s, this.f6015t);
        this.f6017y.m1194b();
        this.f6017y.m1197a((AbstractC0623y) null);
        this.f6018z = new C0904i(this, EnumC0246ao.f1705c, this.f6014s, this.f6015t);
        this.f6019A = new C0904i(this, EnumC0246ao.f1707e, this.f6014s, this.f6015t);
        this.f6019A.m1194b();
        this.f6019A.m1197a((AbstractC0623y) null);
        this.f6020B = new C0904i(this, EnumC0246ao.f1706d, this.f6014s, this.f6015t);
        this.f6021C = new C0904i(this, EnumC0246ao.f1708f, this.f6014s, this.f6015t);
        this.f6021C.m1194b();
        this.f6021C.m1197a((AbstractC0623y) null);
        this.f6022D = new C0904i(this, EnumC0246ao.f1709g, this.f6014s, this.f6015t);
        this.f6022D.m1194b();
        this.f6022D.m1197a((AbstractC0623y) null);
        this.f6023E = new C0904i(this, EnumC0246ao.f1710h, this.f6014s, this.f6015t);
        this.f6023E.m1194b();
        this.f6023E.m1197a((AbstractC0623y) null);
        Iterator it = this.f6035H.iterator();
        while (it.hasNext()) {
            ((RunnableC0910o) it.next()).m1127a(c0173b);
        }
        this.f6025o.m1127a(c0173b);
        Core.LogDebug2("PathEngine: Ready");
    }

    /* renamed from: a */
    public void m1171a() {
        int i;
        int i2;
        int i3;
        Core m1087A = Core.m1087A();
        C0904i c0904i = this.f6017y;
        Rect rect = new Rect();
        float f = m1087A.f6144cv;
        float f2 = m1087A.f6145cw;
        float f3 = m1087A.f6148cz;
        float f4 = m1087A.f6149cA;
        C0178e c0178e = m1087A.f6110bL.f833u;
        int i4 = (int) ((f * this.f6012q.f789r) - 1.0f);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) ((f2 * this.f6012q.f790s) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) (((f + f3) * this.f6012q.f789r) + 1.0f);
        if (i6 > this.f6014s - 1) {
            i6 = this.f6014s - 1;
        }
        int i7 = (int) (((f2 + f4) * this.f6012q.f790s) + 1.0f);
        if (i7 > this.f6015t - 1) {
            i7 = this.f6015t - 1;
        }
        for (int i8 = i4; i8 < i6 + 1; i8++) {
            for (int i9 = i5; i9 < i7 + 1; i9++) {
                if (c0178e.m5252a(i8, i9) != null) {
                    int i10 = i8 * this.f6012q.f785n;
                    int i11 = i9 * this.f6012q.f786o;
                    rect.m5874a(i10, i11, i10 + this.f6012q.f785n, i11 + this.f6012q.f786o);
                    rect.m5875a((int) (-f), (int) (-f2));
                    boolean m5871b = rect.m5871b((int) (m1087A.f6117bS.f5129s / m1087A.f6256cW), (int) (m1087A.f6117bS.f5130t / m1087A.f6256cW));
                    if (!f6005g || m5871b) {
                        byte b = c0904i.f5960d[(i8 * this.f6015t) + i9];
                        byte b2 = c0904i.f5961e[(i8 * this.f6015t) + i9];
                        int i12 = c0904i.f5962f[(i8 * this.f6015t) + i9];
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
                        this.f6030F.m5933a(128, i, i2, i3);
                        m1087A.f6113bO.mo162b(rect, this.f6030F);
                        if (m5871b && c0904i.f5962f != null) {
                            m1087A.f6113bO.mo181a("o:" + ((int) c0904i.f5962f[(i8 * this.f6015t) + i9]), rect.m5867d(), rect.m5866e(), m1087A.f6169do);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1165a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y != null) {
            AbstractC0197n.m5065b(abstractC0623y);
        }
        for (C0904i c0904i : this.f6028v) {
            c0904i.m1191c(abstractC0623y);
        }
        this.f6017y.m1197a(abstractC0623y);
        this.f6021C.m1197a(abstractC0623y);
        this.f6022D.m1197a(abstractC0623y);
        this.f6023E.m1197a(abstractC0623y);
    }

    /* renamed from: b */
    public void m1156b() {
        for (C0904i c0904i : this.f6028v) {
            c0904i.m1189e();
        }
    }

    public C0907l() {
        this.f6035H.add(new RunnableC0910o(this));
        int m2139c = C0758f.m2139c();
        if (m2139c > 1) {
            Core.m997b("PathEngine", "We have " + m2139c + " cores, creating extra solvers");
            this.f6035H.add(new RunnableC0910o(this));
        } else {
            Core.m997b("PathEngine", "We only have one core, using single solver");
        }
        Iterator it = this.f6035H.iterator();
        while (it.hasNext()) {
            ((RunnableC0910o) it.next()).m1119c();
        }
    }

    /* renamed from: c */
    public void m1150c() {
        Iterator it = this.f6032I.iterator();
        while (it.hasNext()) {
            ((C0906k) it.next()).f5992w = true;
        }
        this.f6032I.clear();
        m1142h();
    }

    /* renamed from: d */
    public void m1147d() {
        Iterator it = this.f6032I.iterator();
        while (it.hasNext()) {
            m1161a((C0906k) it.next());
        }
        this.f6032I.clear();
        m1142h();
    }

    /* renamed from: a */
    public void m1162a(C0904i c0904i, boolean z) {
        Core m1087A = Core.m1087A();
        if (!z) {
            if (c0904i.f5970k + 50 < m1087A.f6239bx) {
                c0904i.f5970k = m1087A.f6239bx - 40;
                c0904i.m1189e();
            }
            c0904i.m1195a(z);
            return;
        }
        if (c0904i.f5970k + 30 < m1087A.f6239bx) {
            c0904i.f5970k = m1087A.f6239bx;
            c0904i.m1189e();
        }
        c0904i.m1195a(z);
    }

    /* renamed from: a */
    public C0906k m1157a(boolean z) {
        C0901f c0906k;
        if (AbstractC0623y.f3996K) {
            c0906k = new C0901f(this, z);
        } else {
            c0906k = new C0906k(this, z);
        }
        return c0906k;
    }

    /* renamed from: a */
    public void m1160a(C0906k c0906k, boolean z) {
        m1159a(c0906k, z, false);
    }

    /* renamed from: a */
    public void m1159a(C0906k c0906k, boolean z, boolean z2) {
        if (!this.f6026p) {
            Core.m997b("PathEngine", "Cannot start new path, not running");
            return;
        }
        Core m1087A = Core.m1087A();
        m1162a(m1167a(c0906k.f5984o), z);
        c0906k.m1175e();
        c0906k.f5989t = 300.0f;
        int m2122d = C0758f.m2122d(c0906k.f5977h - c0906k.f5981l);
        int m2122d2 = C0758f.m2122d(c0906k.f5978i - c0906k.f5982m);
        if (m2122d < 15 && m2122d2 < 15) {
            c0906k.f5989t = 12.0f;
        } else if (m2122d < 50 && m2122d2 < 50) {
            c0906k.f5989t = 16.0f;
        } else if (m2122d < 200 && m2122d2 < 200) {
            c0906k.f5989t = 24.0f;
        } else if (m2122d < 400 && m2122d2 < 400) {
            c0906k.f5989t = 50.0f;
        } else if (m2122d < 1000 && m2122d2 < 1000) {
            c0906k.f5989t = 100.0f;
        } else if (m2122d < 2000 && m2122d2 < 2000) {
            c0906k.f5989t = 200.0f;
        }
        if (!m1087A.f6122bX.lock1 && !m1087A.f6126cb.m2465g()) {
            if (m2122d < 1000 && m2122d2 < 1000) {
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
        if (!this.f6024n || z2) {
            this.f6025o.m1124a(c0906k);
            this.f6025o.m1121b();
            this.f6032I.add(c0906k);
            return;
        }
        m1151b(c0906k);
        this.f6032I.add(c0906k);
    }

    /* renamed from: a */
    public void m1170a(float f) {
        m1141i();
    }

    /* renamed from: b */
    public void m1155b(float f) {
        C0904i[] c0904iArr;
        for (C0904i c0904i : this.f6028v) {
            c0904i.f5969p = 0;
            if (c0904i.f5968o) {
                c0904i.f5968o = false;
                c0904i.m1191c(null);
            }
        }
        m1141i();
        m1146d(f);
    }

    /* renamed from: c */
    public void m1149c(float f) {
        if (f6008j) {
            Iterator it = f6009k.iterator();
            while (it.hasNext()) {
                C0906k c0906k = (C0906k) it.next();
                c0906k.m1172h();
                c0906k.m1173g();
            }
        }
        if (f6002d) {
            boolean z = true;
            Core m1087A = Core.m1087A();
            if (m1087A.f6117bS.f5258bL.f6922b > 0) {
                AbstractC0244am mo497a = m1087A.f6117bS.f5258bL.mo497a(0);
                if (mo497a instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) mo497a;
                    if (abstractC0623y.f3937at != null) {
                        abstractC0623y.f3937at.mo1203d(abstractC0623y);
                        z = false;
                    }
                }
            }
            if (z) {
            }
        }
        if (f6004f) {
            m1171a();
        }
        if (f6006h) {
        }
    }

    /* renamed from: e */
    public boolean m1145e() {
        Iterator it = this.f6032I.iterator();
        while (it.hasNext()) {
            C0906k c0906k = (C0906k) it.next();
            if (c0906k.f5989t <= 0.0f && !c0906k.mo1215c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String m1144f() {
        Iterator it = this.f6032I.iterator();
        String str = null;
        int i = 0;
        while (it.hasNext()) {
            C0906k c0906k = (C0906k) it.next();
            if (c0906k.f5989t <= 0.0f && !c0906k.mo1215c()) {
                if (str == null) {
                    str = "[distance:" + C0758f.m2157b(c0906k.f5977h, c0906k.f5978i, c0906k.f5981l, c0906k.f5982m) + ", allowedDelay:" + c0906k.f5988s + " lowPriority:" + c0906k.f5987r + "]";
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
    private void m1146d(float f) {
        Iterator it = this.f6032I.iterator();
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
                if (!c0906k.mo1215c()) {
                    if (Core.m1087A().m1007ax()) {
                        Core.m997b("PathEngine", "updateUnfinishedPaths: path wasn't solved, isGoingToBlockThisFrame did not protect");
                    }
                    m1161a(c0906k);
                }
                if (c0906k.mo1215c()) {
                    it.remove();
                }
            } else {
                c0906k.f5989t -= f;
            }
        }
    }

    /* renamed from: g */
    private C0906k m1143g() {
        C0906k c0906k = null;
        Iterator it = this.f6033J.iterator();
        while (it.hasNext()) {
            C0906k c0906k2 = (C0906k) it.next();
            if (c0906k == null || c0906k.f5989t > c0906k2.f5989t) {
                c0906k = c0906k2;
            }
        }
        if (c0906k == null) {
            throw new RuntimeException("Failed to find any paths");
        }
        if (!this.f6033J.remove(c0906k)) {
            throw new RuntimeException("Failed remove found path");
        }
        return c0906k;
    }

    /* renamed from: b */
    private void m1151b(C0906k c0906k) {
        synchronized (this.f6034K) {
            this.f6033J.add(c0906k);
        }
    }

    /* renamed from: h */
    private void m1142h() {
        synchronized (this.f6034K) {
            this.f6033J.clear();
        }
    }

    /* renamed from: i */
    private void m1141i() {
        RunnableC0910o m1140j;
        LinkedList linkedList = this.f6033J;
        if (linkedList.size() > 0) {
            synchronized (this.f6034K) {
                while (linkedList.size() > 0 && (m1140j = m1140j()) != null) {
                    C0906k m1143g = m1143g();
                    if (!m1143g.f5991v) {
                        m1158a(m1140j, m1143g);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private RunnableC0910o m1140j() {
        Iterator it = this.f6035H.iterator();
        while (it.hasNext()) {
            RunnableC0910o runnableC0910o = (RunnableC0910o) it.next();
            if (runnableC0910o.f6064s) {
                return runnableC0910o;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m1161a(C0906k c0906k) {
        RunnableC0910o m1140j;
        if (!c0906k.f5991v) {
            while (true) {
                synchronized (this.f6031G) {
                    m1140j = m1140j();
                    if (m1140j != null) {
                        break;
                    }
                    try {
                        this.f6031G.wait(2000L);
                    } catch (InterruptedException e) {
                    }
                }
            }
            m1158a(m1140j, c0906k);
        }
        boolean z = false;
        long m1067U = Core.m1067U();
        while (true) {
            synchronized (this.f6031G) {
                if (c0906k.mo1215c()) {
                    break;
                }
                z = true;
                m1141i();
                try {
                    this.f6031G.wait(2000L);
                } catch (InterruptedException e2) {
                }
            }
            if (!z && f6000b) {
                Core.m997b("PathEngine", "We were blocked path(" + c0906k.f5974e + ") for:" + (Core.m1067U() - m1067U));
                return;
            }
        }
        if (!z) {
        }
    }

    /* renamed from: a */
    private void m1158a(RunnableC0910o runnableC0910o, C0906k c0906k) {
        synchronized (c0906k) {
            if (!c0906k.f5991v) {
                runnableC0910o.m1124a(c0906k);
                runnableC0910o.m1130a();
            }
        }
    }
}
