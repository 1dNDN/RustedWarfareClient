package com.corrodinggames.rts.gameFramework.p037f;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p044l.AbstractC0942m;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/k.class */
public class C0802k {

    /* renamed from: a */
    float f5280a;

    /* renamed from: b */
    float f5281b;

    /* renamed from: e */
    public boolean f5284e;

    /* renamed from: f */
    public boolean f5285f;

    /* renamed from: g */
    public int f5286g;

    /* renamed from: h */
    public int f5287h;

    /* renamed from: i */
    public float f5288i;

    /* renamed from: j */
    public float f5289j;

    /* renamed from: k */
    int f5290k;

    /* renamed from: l */
    int f5291l;

    /* renamed from: m */
    boolean f5292m;

    /* renamed from: F */
    C0934e f5311F;

    /* renamed from: G */
    InterfaceC1027y f5312G;

    /* renamed from: H */
    C0934e f5313H;

    /* renamed from: I */
    InterfaceC1027y f5314I;

    /* renamed from: J */
    public C0934e f5315J;

    /* renamed from: K */
    InterfaceC1027y f5316K;

    /* renamed from: M */
    float f5318M;

    /* renamed from: N */
    float f5319N;

    /* renamed from: T */
    public C0934e f5325T;

    /* renamed from: U */
    public C0934e f5326U;

    /* renamed from: W */
    C0930ag[] f5328W;

    /* renamed from: X */
    C0930ag f5329X;

    /* renamed from: Y */
    float f5330Y;

    /* renamed from: ac */
    static ArrayList f5335ac = new ArrayList();

    /* renamed from: c */
    public float f5282c = 120.0f;

    /* renamed from: d */
    public float f5283d = 120.0f;

    /* renamed from: n */
    final Paint f5293n = new Paint();

    /* renamed from: o */
    final Paint f5294o = new Paint();

    /* renamed from: p */
    final Paint f5295p = new Paint();

    /* renamed from: q */
    float f5296q = 0.0f;

    /* renamed from: r */
    float f5297r = 0.0f;

    /* renamed from: s */
    final Paint f5298s = new C0930ag();

    /* renamed from: t */
    final Paint f5299t = new Paint();

    /* renamed from: u */
    final Paint f5300u = new Paint();

    /* renamed from: v */
    final Paint f5301v = new Paint();

    /* renamed from: w */
    public final Rect f5302w = new Rect();

    /* renamed from: x */
    final Paint f5303x = new C0930ag();

    /* renamed from: y */
    final Paint f5304y = new C0930ag();

    /* renamed from: z */
    final Paint f5305z = new C0930ag();

    /* renamed from: A */
    final Paint f5306A = new C0930ag();

    /* renamed from: B */
    final Paint f5307B = new C0930ag();

    /* renamed from: C */
    final Paint f5308C = new C0930ag();

    /* renamed from: D */
    final Paint f5309D = new C0930ag();

    /* renamed from: E */
    final Rect f5310E = new Rect();

    /* renamed from: L */
    float f5317L = 0.0f;

    /* renamed from: O */
    public boolean f5320O = false;

    /* renamed from: P */
    public boolean f5321P = false;

    /* renamed from: Q */
    public float f5322Q = 0.0f;

    /* renamed from: R */
    int f5323R = 30;

    /* renamed from: S */
    int f5324S = -1;

    /* renamed from: V */
    final Rect f5327V = new Rect();

    /* renamed from: Z */
    public final ArrayList f5331Z = new ArrayList();

    /* renamed from: aa */
    public final ArrayList f5332aa = new ArrayList();

    /* renamed from: ag */
    private final ArrayList f5333ag = new ArrayList();

    /* renamed from: ab */
    Rect f5334ab = new Rect();

    /* renamed from: ad */
    Point f5336ad = new Point();

    /* renamed from: ae */
    AbstractC0942m f5337ae = new C08031();

    /* renamed from: af */
    ArrayList f5338af = new ArrayList();

    /* renamed from: a */
    public void m1785a(int i, int i2, float f, AbstractC0244am abstractC0244am) {
        boolean z = abstractC0244am != null && abstractC0244am.m4758bI();
        Iterator it = this.f5331Z.iterator();
        while (it.hasNext()) {
            C0805m c0805m = (C0805m) it.next();
            if (c0805m.f5346a == z && C0758f.m2122d(i - c0805m.f5347b) < 40 && C0758f.m2122d(i2 - c0805m.f5348c) < 40) {
                c0805m.f5349d += f;
                return;
            }
        }
        this.f5331Z.add(new C0805m(this, f, i, i2, z));
    }

    /* renamed from: a */
    public void m1782a(Context context) {
        this.f5294o.m5926a(Paint.Style.f220b);
        this.f5294o.m5936a(1.0f);
        this.f5298s.m5933a(255, 255, 255, 255);
        this.f5298s.m5926a(Paint.Style.f220b);
        this.f5298s.m5936a(1.0f);
        this.f5328W = new C0930ag[11];
        for (int i = 0; i <= 10; i++) {
            this.f5328W[i] = new C0930ag();
            this.f5328W[i].m5908b(-16777216);
            this.f5328W[i].m5926a(Paint.Style.f219a);
            this.f5328W[i].m5903c(i * 25);
        }
        this.f5329X = new C0930ag();
        this.f5329X.m5908b(-16777216);
        this.f5329X.m5926a(Paint.Style.f219a);
        this.f5299t.m5933a(255, 255, 0, 0);
        this.f5299t.m5926a(Paint.Style.f220b);
        this.f5299t.m5936a(2.0f);
        this.f5300u.m5933a(155, 255, 0, 0);
        this.f5300u.m5926a(Paint.Style.f220b);
        this.f5300u.m5936a(2.0f);
        this.f5301v.m5933a(200, 12, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_11, 219);
        this.f5301v.m5926a(Paint.Style.f220b);
        this.f5301v.m5936a(2.0f);
        this.f5303x.m5908b(-16711936);
        this.f5304y.m5908b(-256);
        this.f5305z.m5908b(-65536);
        this.f5306A.m5908b(m1786a(this.f5303x.m5896e()));
        this.f5307B.m5908b(m1786a(this.f5304y.m5896e()));
        this.f5308C.m5908b(m1786a(this.f5305z.m5896e()));
        this.f5309D.m5933a(210, 255, 255, 255);
    }

    /* renamed from: a */
    public static int m1786a(int i) {
        return Color.m5948a(Color.m5950a(i), (int) (Color.m5946b(i) * 0.5f), (int) (Color.m5945c(i) * 0.5f), (int) (Color.m5944d(i) * 0.5f));
    }

    /* renamed from: a */
    public void m1789a() {
        Core m1087A = Core.m1087A();
        if (!C0797f.f5250bD) {
            this.f5280a = (int) (m1087A.f6134ck - (this.f5282c + 0.0f));
            this.f5281b = 0.0f;
            return;
        }
        this.f5280a = 0.0f;
        this.f5281b = (int) (m1087A.f6135cl - (this.f5283d + 0.0f));
    }

    /* renamed from: b */
    public int m1777b() {
        return (int) (this.f5281b + this.f5283d);
    }

    /* renamed from: a */
    public void m1781a(C0173b c0173b, boolean z) {
        this.f5338af.clear();
        if (z) {
            this.f5292m = true;
            return;
        }
        this.f5286g = 1;
        this.f5287h = 1;
        this.f5288i = 1.0f;
        this.f5289j = 1.0f;
        this.f5285f = false;
        this.f5284e = false;
    }

    /* renamed from: c */
    public void m1774c() {
        if (this.f5315J != null) {
            this.f5315J.mo49o();
            this.f5315J = null;
        }
        if (this.f5311F != null) {
            this.f5311F.mo49o();
            this.f5311F = null;
        }
        if (this.f5325T != null) {
            this.f5325T.mo49o();
            this.f5325T = null;
        }
        if (this.f5326U != null) {
            this.f5326U.mo49o();
            this.f5326U = null;
        }
        if (this.f5314I != null) {
            this.f5314I.mo129q();
            this.f5314I = null;
        }
        if (this.f5313H != null) {
            this.f5313H.mo49o();
            this.f5313H = null;
        }
        this.f5316K = null;
        this.f5284e = false;
    }

    /* renamed from: d */
    public float m1771d() {
        return Core.m1087A().f6138cp;
    }

    /* renamed from: e */
    public void m1769e() {
        Core m1087A = Core.m1087A();
        m1767f();
        Core.LogDebug2("Creating minimap image buffers..");
        if (this.f5311F == null) {
            this.f5311F = m1087A.f6113bO.mo218a((int) this.f5282c, (int) this.f5283d, false);
            this.f5312G = m1087A.f6113bO.mo160b(this.f5311F);
        }
        if (this.f5315J == null) {
            this.f5315J = m1087A.f6113bO.mo218a((int) this.f5282c, (int) this.f5283d, false);
            this.f5316K = m1087A.f6113bO.mo160b(this.f5315J);
        }
        if (this.f5313H == null) {
            this.f5313H = m1087A.f6113bO.mo218a((int) this.f5282c, (int) this.f5283d, false);
            this.f5314I = m1087A.f6113bO.mo160b(this.f5313H);
        }
    }

    /* renamed from: f */
    public void m1767f() {
        this.f5282c = m1771d();
        this.f5283d = this.f5282c;
        m1789a();
    }

    /* renamed from: g */
    public void m1766g() {
        long m2440a = C0727bl.m2440a();
        Core.LogDebug2("--setting up minimap--");
        Core m1087A = Core.m1087A();
        m1767f();
        this.f5286g = m1087A.f6110bL.f792C * m1087A.f6110bL.f785n;
        this.f5287h = m1087A.f6110bL.f793D * m1087A.f6110bL.f786o;
        if (this.f5286g <= 0) {
            this.f5286g = 1;
        }
        if (this.f5287h <= 0) {
            this.f5287h = 1;
        }
        this.f5288i = 1.0f / this.f5286g;
        this.f5289j = 1.0f / this.f5287h;
        this.f5285f = true;
        m1769e();
        this.f5331Z.clear();
        this.f5332aa.clear();
        this.f5333ag.clear();
        Iterator it = m1087A.f6110bL.f838A.iterator();
        while (it.hasNext()) {
            Point point = (Point) it.next();
            this.f5333ag.add(new C0808p(this, point.f224a, point.f225b));
        }
        this.f5312G.mo166b(-16777216);
        this.f5316K.mo166b(-16777216);
        if (1 == 0) {
            Rect rect = new Rect(0, 0, (int) this.f5282c, (int) this.f5283d);
            m1087A.f6110bL.f833u.m5250a(this.f5312G, 0.0f, 0.0f, 0.0f, 0.0f, this.f5286g, this.f5287h, this.f5282c / this.f5286g, this.f5283d / this.f5287h, false, false, false);
            Paint paint = new Paint();
            paint.m5933a(50, 0, 0, 0);
            this.f5312G.mo162b(rect, paint);
        } else {
            for (int i = 0; i < 2; i++) {
                for (int i2 = 0; i2 < 2; i2++) {
                    this.f5314I.mo166b(-16777216);
                    int i3 = ((int) this.f5282c) / 2;
                    int i4 = ((int) this.f5283d) / 2;
                    int i5 = this.f5286g / 2;
                    int i6 = this.f5287h / 2;
                    m1087A.f6110bL.f833u.m5250a(this.f5314I, i5 * i, i6 * i2, i5 * i, i6 * i2, i5, i6, this.f5282c / i5, this.f5283d / i6, false, false, false);
                    Rect rect2 = new Rect(0, 0, (int) this.f5282c, (int) this.f5283d);
                    Rect rect3 = new Rect(i3 * i, i4 * i2, i3 * (i + 1), i4 * (i2 + 1));
                    Paint paint2 = new Paint();
                    paint2.mo5914a(true);
                    paint2.m5897d(true);
                    paint2.m5905b(true);
                    this.f5316K.mo193a(this.f5313H, rect2, rect3, paint2);
                }
            }
            Rect rect4 = new Rect(0, 0, (int) this.f5282c, (int) this.f5283d);
            this.f5312G.mo166b(-16777216);
            Paint paint3 = new Paint();
            paint3.mo5914a(true);
            paint3.m5897d(true);
            paint3.m5905b(true);
            paint3.m5933a(200, 255, 255, 255);
            this.f5312G.mo193a(this.f5315J, rect4, rect4, paint3);
        }
        this.f5314I.mo166b(-16777216);
        this.f5316K.mo166b(-16777216);
        this.f5318M = 50.0f;
        m1787a(0.0f, 1.0f);
        this.f5284e = true;
        Core.LogDebug2("Minimap map render took:" + C0727bl.m2439a(C0727bl.m2438a(m2440a)));
    }

    /* renamed from: a */
    void m1787a(float f, float f2) {
        C0930ag c0930ag;
        Core m1087A = Core.m1087A();
        this.f5334ab.m5874a(0, (int) (f * this.f5283d), (int) this.f5282c, (int) (f2 * this.f5283d));
        this.f5314I.mo193a(this.f5311F, this.f5334ab, this.f5334ab, (Paint) null);
        C0173b c0173b = m1087A.f6110bL;
        if (c0173b.f841E) {
            boolean z = c0173b.f843G;
            C0930ag c0930ag2 = this.f5328W[5];
            C0930ag c0930ag3 = this.f5328W[10];
            C0930ag c0930ag4 = this.f5329X;
            c0930ag4.m5903c(255);
            if (z) {
                c0930ag4.m5903c((int) ((1.0f - ((1.0f - (c0930ag2.m5894f() / 255.0f)) * (1.0f - (this.f5328W[7].m5894f() / 255.0f)))) * 255.0f));
            }
            float f3 = this.f5282c / c0173b.f792C;
            float f4 = this.f5283d / c0173b.f793D;
            int i = ((int) (f * c0173b.f793D)) - 1;
            int i2 = ((int) (f2 * c0173b.f793D)) + 1;
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (i > m1087A.f6110bL.f793D) {
                i = c0173b.f793D;
            }
            if (i2 > m1087A.f6110bL.f793D) {
                i2 = c0173b.f793D;
            }
            int i3 = 0;
            byte[][] bArr = m1087A.f6099bs.f1337M;
            if (bArr != null) {
                int i4 = c0173b.f792C;
                Rect rect = this.f5327V;
                for (int i5 = i; i5 < i2; i5++) {
                    int i6 = 0;
                    while (i6 < i4) {
                        byte b = bArr[i6][i5];
                        if (b != 0) {
                            int i7 = i6;
                            int i8 = i6;
                            while (i8 < i4 - 1 && bArr[i8][i5] == b) {
                                i8++;
                            }
                            i6 = i8;
                            rect.m5874a(0 + ((int) (i7 * f3)), 0 + ((int) (i5 * f4)), 0 + ((int) ((i8 + 1) * f3)), 0 + ((int) ((i5 + 1) * f4)));
                            if (b == 10) {
                                c0930ag = c0930ag4;
                            } else {
                                c0930ag = c0930ag2;
                            }
                            this.f5314I.mo162b(rect, c0930ag);
                            i3++;
                            if (i3 > 2) {
                                i3 = 0;
                            }
                        }
                        i6++;
                    }
                }
            }
        }
        this.f5316K.mo193a(this.f5313H, this.f5334ab, this.f5334ab, (Paint) null);
        this.f5315J.mo48p();
        if (Core.f6209aY) {
        }
    }

    /* renamed from: a */
    static C0807o m1783a(int i, Paint paint) {
        synchronized (f5335ac) {
            C0807o c0807o = null;
            Iterator it = f5335ac.iterator();
            while (it.hasNext()) {
                C0807o c0807o2 = (C0807o) it.next();
                if (c0807o2.f5360d >= i && (c0807o == null || c0807o2.f5360d < c0807o.f5360d)) {
                    c0807o = c0807o2;
                }
            }
            if (c0807o != null) {
                f5335ac.remove(c0807o);
                c0807o.f5359c = paint;
                return c0807o;
            }
            return new C0807o(i + 15, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1779a(C0807o c0807o) {
        c0807o.f5359c = null;
        c0807o.f5358b = 0;
        synchronized (f5335ac) {
            if (f5335ac.size() < 20) {
                f5335ac.add(c0807o);
                return;
            }
            Iterator it = f5335ac.iterator();
            while (it.hasNext()) {
                if (((C0807o) it.next()).f5360d < c0807o.f5360d) {
                    it.remove();
                    f5335ac.add(c0807o);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    void m1778a(InterfaceC1027y interfaceC1027y, int i, int i2, float f, float f2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Core m1087A = Core.m1087A();
        if (this.f5282c < 50.0f) {
            i3 = 0;
            i4 = 0;
            i5 = 1;
            i6 = 1;
            i7 = 1;
        } else if (this.f5282c < 120.0f) {
            i3 = 0;
            i4 = 0;
            i5 = 2;
            i6 = 2;
            i7 = 2;
        } else {
            i3 = -1;
            i4 = -1;
            i5 = 2;
            i6 = 2;
            i7 = 3;
        }
        int i8 = i4 + i;
        int i9 = i5 + i;
        int i10 = i6 + i2;
        int i11 = i3 + i2;
        boolean z = false;
        z = (m1087A.f6099bs.m5074b() || m1087A.f6126cb.m2464h()) ? true : true;
        for (int i12 = -1; i12 < AbstractC0197n.f1365c; i12++) {
            AbstractC0197n m5017k = AbstractC0197n.m5017k(i12);
            if (m5017k != null) {
                Paint paint = m5017k.f1354ad;
                if (m1087A.settingEngine.useMinimapAllyColors) {
                    if (z) {
                        this.f5295p.m5908b(AbstractC0197n.m5021i(m5017k.f1312q));
                        paint = this.f5295p;
                    } else if (m1087A.f6099bs == m5017k) {
                        paint = this.f5303x;
                    } else if (m1087A.f6099bs.m5042d(m5017k)) {
                        paint = this.f5304y;
                    } else if (m1087A.f6099bs.m5054c(m5017k)) {
                        paint = this.f5305z;
                    }
                }
                int i13 = 0;
                if (m5017k.m5075a(true, false) > 0) {
                    AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
                    int size = AbstractC0244am.f1590bD.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        AbstractC0244am abstractC0244am = m498a[i14];
                        if (abstractC0244am.f1609bV == m5017k && abstractC0244am.f1655cP) {
                            i13++;
                        }
                    }
                }
                if (i13 > 0) {
                    paint.m5936a(i7);
                    C0807o m1783a = m1783a(i13, paint);
                    AbstractC0244am[] m498a2 = AbstractC0244am.f1590bD.m498a();
                    int size2 = AbstractC0244am.f1590bD.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        AbstractC0244am abstractC0244am2 = m498a2[i15];
                        if (abstractC0244am2.f1609bV == m5017k && abstractC0244am2.f1655cP) {
                            m1783a.m1764a(abstractC0244am2.f1656cQ, abstractC0244am2.f1657cR);
                        }
                    }
                    if (m1783a.f5358b != 0) {
                        m1087A.f6113bO.mo188a(m1783a);
                    }
                }
                Paint paint2 = m5017k.f1355ae;
                if (m1087A.settingEngine.useMinimapAllyColors) {
                    if (z) {
                        this.f5295p.m5908b(AbstractC0197n.m5021i(m5017k.f1312q));
                        Paint paint3 = this.f5295p;
                    } else if (m1087A.f6099bs == m5017k) {
                        paint2 = this.f5306A;
                    } else if (m1087A.f6099bs.m5042d(m5017k)) {
                        paint2 = this.f5307B;
                    } else if (m1087A.f6099bs.m5054c(m5017k)) {
                        paint2 = this.f5308C;
                    }
                }
                int i16 = 0;
                Object[] m519b = C0741a.f4668w.m519b();
                int size3 = C0741a.f4668w.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    C0741a c0741a = (C0741a) m519b[i17];
                    if (c0741a.f4650e == m5017k && c0741a.f4656k) {
                        i16++;
                    }
                }
                if (i16 > 0) {
                    paint2.m5936a(i7);
                    C0807o m1783a2 = m1783a(i16, paint2);
                    Object[] m519b2 = C0741a.f4668w.m519b();
                    int size4 = C0741a.f4668w.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        C0741a c0741a2 = (C0741a) m519b2[i18];
                        if (c0741a2.f4650e == m5017k && c0741a2.f4656k) {
                            m1783a2.m1764a(c0741a2.f4657l, c0741a2.f4658m);
                        }
                    }
                    if (m1783a2.f5358b != 0) {
                        m1087A.f6113bO.mo188a(m1783a2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1784a(int i, int i2, EnumC0806n enumC0806n) {
        C0804l c0804l = new C0804l(this);
        c0804l.f5340a = i;
        c0804l.f5341b = i2;
        c0804l.f5344e = enumC0806n;
        c0804l.f5342c = 0.9f;
        c0804l.f5343d = 0.9f;
        this.f5332aa.add(c0804l);
    }

    /* renamed from: h */
    public void m1765h() {
        Core m1087A = Core.m1087A();
        this.f5292m = false;
        this.f5290k = (int) this.f5280a;
        this.f5291l = (int) this.f5281b;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (!abstractC0244am.f1607bT && abstractC0244am.f1651cL == null && abstractC0244am.m4703ce() && abstractC0244am.m4745b_() && !abstractC0244am.mo1756u()) {
                Point m1775b = m1775b(abstractC0244am.f6958el, abstractC0244am.f6959em);
                abstractC0244am.f1656cQ = m1775b.f224a;
                abstractC0244am.f1657cR = m1775b.f225b;
                abstractC0244am.f1655cP = true;
            } else {
                abstractC0244am.f1655cP = false;
            }
        }
        Object[] m519b = C0741a.f4668w.m519b();
        int size2 = C0741a.f4668w.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0741a c0741a = (C0741a) m519b[i2];
            if (!c0741a.f4659n && c0741a.f4666u) {
                Point m1775b2 = m1775b(c0741a.f4652g, c0741a.f4653h);
                c0741a.f4657l = m1775b2.f224a;
                c0741a.f4658m = m1775b2.f225b;
                c0741a.f4656k = true;
            }
        }
        AbstractC0197n abstractC0197n = m1087A.f6099bs;
        Iterator it = this.f5333ag.iterator();
        while (it.hasNext()) {
            C0808p c0808p = (C0808p) it.next();
            c0808p.f5365e = false;
            if (m1087A.f6110bL.m5329a(abstractC0197n, c0808p.f5361a, c0808p.f5362b)) {
                c0808p.f5365e = true;
                Point m1775b3 = m1775b(c0808p.f5361a * m1087A.f6110bL.f785n, c0808p.f5362b * m1087A.f6110bL.f786o);
                c0808p.f5363c = m1775b3.f224a;
                c0808p.f5364d = m1775b3.f225b;
            }
        }
    }

    /* renamed from: a */
    public void m1788a(float f) {
        if (Core.f6205aU && !Core.f6207aW) {
            return;
        }
        Core m1087A = Core.m1087A();
        this.f5317L = C0758f.m2211a(this.f5317L, f);
        if (this.f5317L == 0.0f) {
            this.f5317L = 15.0f;
            m1765h();
        }
        this.f5330Y += f;
        if (this.f5330Y > 15.0f) {
            C0805m c0805m = null;
            Iterator it = this.f5331Z.iterator();
            while (it.hasNext()) {
                C0805m c0805m2 = (C0805m) it.next();
                if (c0805m2.f5350e != 0.0f) {
                    c0805m2.f5349d = 0.0f;
                } else if (c0805m2.f5349d > 15.0f) {
                    c0805m2.f5349d = 0.0f;
                    c0805m2.f5350e = 300.0f;
                    C0804l c0804l = new C0804l(this);
                    c0804l.f5340a = c0805m2.f5347b;
                    c0804l.f5341b = c0805m2.f5348c;
                    if (c0805m2.f5346a) {
                        c0804l.f5344e = EnumC0806n.base;
                    } else {
                        c0804l.f5344e = EnumC0806n.unit;
                        c0804l.f5342c = 0.4f;
                        c0804l.f5343d = 0.8f;
                    }
                    this.f5332aa.add(c0804l);
                }
                c0805m2.f5349d = C0758f.m2211a(c0805m2.f5349d, 2.0f * this.f5330Y);
                c0805m2.f5350e = C0758f.m2211a(c0805m2.f5350e, this.f5330Y);
                if (c0805m2.f5349d == 0.0f && c0805m2.f5350e == 0.0f) {
                    c0805m = c0805m2;
                }
            }
            if (c0805m != null) {
                this.f5331Z.remove(c0805m);
            }
            Iterator it2 = this.f5332aa.iterator();
            while (it2.hasNext()) {
                C0804l c0804l2 = (C0804l) it2.next();
                if (c0804l2.f5344e != EnumC0806n.message && m1087A.f6253cP.m5871b(c0804l2.f5340a, c0804l2.f5341b)) {
                    c0804l2.f5342c = 0.0f;
                    c0804l2.f5343d = 0.0f;
                }
            }
            this.f5330Y = 0.0f;
        }
    }

    /* renamed from: b */
    public float m1776b(float f) {
        return f * this.f5288i * this.f5282c;
    }

    /* renamed from: b */
    public Point m1775b(float f, float f2) {
        if (!this.f5285f) {
            this.f5336ad.m5883a(-1, -1);
            return this.f5336ad;
        }
        this.f5336ad.m5883a((int) ((f * this.f5288i * this.f5282c) + this.f5280a), (int) ((f2 * this.f5289j * this.f5283d) + this.f5281b));
        return this.f5336ad;
    }

    /* renamed from: c */
    public Point m1772c(float f, float f2) {
        if (f < this.f5280a || f2 < this.f5281b || f > this.f5280a + this.f5282c || f2 > this.f5281b + this.f5283d) {
            return null;
        }
        this.f5336ad.m5883a((int) (((f - this.f5280a) / this.f5282c) * this.f5286g), (int) (((f2 - this.f5281b) / this.f5283d) * this.f5287h));
        return this.f5336ad;
    }

    /* renamed from: c */
    public float m1773c(float f) {
        return f < this.f5280a ? this.f5280a : f > this.f5280a + this.f5282c ? this.f5280a + this.f5282c : f;
    }

    /* renamed from: d */
    public float m1770d(float f) {
        return f < this.f5281b ? this.f5281b : f > this.f5281b + this.f5283d ? this.f5281b + this.f5283d : f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f.k$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/k$1.class */
    public class C08031 extends AbstractC0942m {
        C08031() {
        }

        /* renamed from: a */
        public void mo868a(InterfaceC1027y interfaceC1027y) {
            C0802k.this.m1778a(interfaceC1027y, 0, 0, 0.0f, 1.0f);
        }
    }

    /* renamed from: e */
    public void m1768e(float f) {
        Paint paint;
        Core m1087A = Core.m1087A();
        InterfaceC1027y interfaceC1027y = m1087A.f6113bO;
        m1789a();
        if (this.f5315J != null && !C0758f.m2115e(this.f5282c, m1771d(), 5.0f)) {
            Core.m997b("minimap", "minimap size has changed, reseting");
            m1774c();
        }
        if (!this.f5284e || this.f5315J == null) {
            m1766g();
        }
        if (this.f5290k != ((int) this.f5280a) || this.f5291l != ((int) this.f5281b) || this.f5292m) {
            m1765h();
        }
        if (m1087A.f6110bL.f841E) {
            if (this.f5320O && !this.f5321P) {
                this.f5318M = C0758f.m2211a(this.f5318M, 1.0f);
                if (this.f5318M == 0.0f) {
                    this.f5318M = 40.0f;
                    this.f5320O = false;
                    this.f5322Q = 0.0f;
                    this.f5321P = true;
                }
            }
            if (this.f5321P) {
                this.f5319N = C0758f.m2211a(this.f5319N, 1.0f);
                if (this.f5319N == 0.0f) {
                    this.f5319N = 3.0f;
                    if (this.f5315J != null) {
                        float f2 = this.f5322Q - 0.005f;
                        this.f5322Q = (float) (this.f5322Q + 0.04d);
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        if (this.f5322Q >= 1.0f) {
                            this.f5322Q = 1.0f;
                            this.f5321P = false;
                        }
                        m1787a(f2, this.f5322Q);
                    }
                }
            }
        }
        interfaceC1027y.mo159b(this.f5315J, this.f5280a, this.f5281b, this.f5293n);
        this.f5302w.m5874a((int) this.f5280a, (int) this.f5281b, (int) (this.f5280a + this.f5282c), (int) ((this.f5281b + this.f5283d) - 0.4d));
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Object[] m534a = C0188f.f1083a.m534a();
        int i = C0188f.f1083a.f6894a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0188f) m534a[i2]).f1004D) {
                z3 = true;
                z2 = true;
            }
        }
        Iterator it = this.f5332aa.iterator();
        while (it.hasNext()) {
            C0804l c0804l = (C0804l) it.next();
            if (c0804l.f5344e != EnumC0806n.unit) {
                z = true;
                if (c0804l.f5344e != EnumC0806n.message) {
                    z2 = true;
                }
            }
        }
        if (!z && !z3) {
            this.f5294o.m5933a(255, 100, 100, 100);
            this.f5294o.m5936a(1.0f);
            if (C0797f.f5247bA) {
                this.f5294o.m5933a(115, 0, 0, 0);
                this.f5294o.m5936a(2.0f);
            }
        } else {
            this.f5296q += 5.0f * f;
            if (this.f5296q > 180.0f) {
                this.f5296q -= 180.0f;
            }
            float m2097h = C0758f.m2097h(this.f5296q);
            if (z3) {
                this.f5294o.m5933a(255, 0, (int) (0.0f + (m2097h * 230.0f)), 0);
            } else if (!z2) {
                this.f5294o.m5933a(255, 12, (int) (0.0f + (m2097h * 220.0f)), (int) (0.0f + (m2097h * 220.0f)));
            } else {
                this.f5294o.m5933a(255, (int) (0.0f + (m2097h * 230.0f)), 0, 0);
            }
            this.f5294o.m5936a(2.0f);
        }
        interfaceC1027y.mo162b(this.f5302w, this.f5294o);
        Iterator it2 = this.f5333ag.iterator();
        while (it2.hasNext()) {
            C0808p c0808p = (C0808p) it2.next();
            if (c0808p.f5365e) {
                this.f5327V.m5874a(c0808p.f5363c, c0808p.f5364d, c0808p.f5363c + 2, c0808p.f5364d + 2);
                interfaceC1027y.mo162b(this.f5327V, this.f5309D);
            }
        }
        m1778a(interfaceC1027y, 0, 0, 0.0f, 1.0f);
        if (this.f5338af.size() != 0) {
            Iterator it3 = this.f5338af.iterator();
            while (it3.hasNext()) {
                C0809q c0809q = (C0809q) it3.next();
                if (c0809q.f5367a.f1607bT) {
                    it3.remove();
                } else {
                    AbstractC0244am abstractC0244am = c0809q.f5367a;
                    Point m1775b = m1775b(abstractC0244am.f6958el, abstractC0244am.f6959em);
                    if (!abstractC0244am.m4794a(m1775b.f224a, m1775b.f225b)) {
                        interfaceC1027y.mo223a(m1775b.f224a, m1775b.f225b, 4.0f, abstractC0244am.f1609bV.f1354ad);
                    }
                }
            }
        }
        int i3 = C0188f.f1083a.f6894a;
        for (int i4 = 0; i4 < i3; i4++) {
            C0188f c0188f = (C0188f) m534a[i4];
            if ((c0188f.f1004D || (c0188f.f991q != null && c0188f.f991q.f1004D)) && c0188f.f984j != null) {
                Point m1775b2 = m1775b(c0188f.f6958el, c0188f.f6959em);
                float f3 = 2.0f;
                if (c0188f.f1004D) {
                    f3 = 4.0f;
                }
                interfaceC1027y.mo223a(m1775b2.f224a, m1775b2.f225b, f3, c0188f.f984j.f1609bV.f1354ad);
            }
        }
        Point m1775b3 = m1775b(m1087A.f6144cv, m1087A.f6145cw);
        this.f5310E.f230a = m1775b3.f224a;
        this.f5310E.f231b = m1775b3.f225b;
        Point m1775b4 = m1775b(m1087A.f6144cv + m1087A.f6148cz, m1087A.f6145cw + m1087A.f6149cA);
        this.f5310E.f232c = m1775b4.f224a;
        this.f5310E.f233d = m1775b4.f225b;
        if (this.f5310E.f230a < this.f5302w.f230a) {
            this.f5310E.f230a = this.f5302w.f230a;
        }
        if (this.f5310E.f232c > this.f5302w.f232c) {
            this.f5310E.f232c = this.f5302w.f232c;
        }
        if (this.f5310E.f231b < this.f5302w.f231b) {
            this.f5310E.f231b = this.f5302w.f231b;
        }
        if (this.f5310E.f233d > this.f5302w.f233d) {
            this.f5310E.f233d = this.f5302w.f233d;
        }
        interfaceC1027y.mo162b(this.f5310E, this.f5298s);
        this.f5297r += 6.0f * f;
        if (this.f5297r > 180.0f) {
            this.f5297r -= 180.0f;
        }
        Iterator it4 = this.f5332aa.iterator();
        while (it4.hasNext()) {
            C0804l c0804l2 = (C0804l) it4.next();
            Point m1775b5 = m1775b(c0804l2.f5340a, c0804l2.f5341b);
            float f4 = c0804l2.f5342c;
            float f5 = 0.05f;
            if (c0804l2.f5344e == EnumC0806n.unit) {
                paint = this.f5300u;
                f5 = 0.03f;
                float m2097h2 = C0758f.m2097h(this.f5297r);
                paint.m5933a((int) (50.0f + (m2097h2 * 190.0f)), (int) (50.0f + (m2097h2 * 190.0f)), 0, 0);
            } else if (c0804l2.f5344e == EnumC0806n.message) {
                paint = this.f5301v;
            } else {
                paint = this.f5299t;
                float m2097h3 = C0758f.m2097h(this.f5297r);
                paint.m5933a((int) (50.0f + (m2097h3 * 190.0f)), (int) (50.0f + (m2097h3 * 190.0f)), 0, 0);
            }
            float m2158b = C0758f.m2158b(f4, f5, 1.0f);
            if (c0804l2.f5344e == EnumC0806n.unit) {
                float f6 = this.f5282c * m2158b;
                float f7 = this.f5283d * m2158b;
                interfaceC1027y.mo225a(m1773c(m1775b5.f224a - f6), m1770d(m1775b5.f225b - f7), m1773c(m1775b5.f224a + f6), m1770d(m1775b5.f225b + f7), paint);
                interfaceC1027y.mo225a(m1773c(m1775b5.f224a + f6), m1770d(m1775b5.f225b - f7), m1773c(m1775b5.f224a - f6), m1770d(m1775b5.f225b + f7), paint);
            } else {
                interfaceC1027y.mo225a(m1773c(m1775b5.f224a - (this.f5282c * m2158b)), m1770d(m1775b5.f225b), m1773c(m1775b5.f224a + (this.f5282c * m2158b)), m1770d(m1775b5.f225b), paint);
                interfaceC1027y.mo225a(m1773c(m1775b5.f224a), m1770d(m1775b5.f225b - (this.f5283d * m2158b)), m1773c(m1775b5.f224a), m1770d(m1775b5.f225b + (this.f5283d * m2158b)), paint);
            }
            c0804l2.f5342c = C0758f.m2211a(c0804l2.f5342c, 0.04f * f);
            if (c0804l2.f5342c == 0.0f) {
                c0804l2.f5343d = C0758f.m2211a(c0804l2.f5343d, 0.005f * f);
                if (c0804l2.f5343d == 0.0f) {
                    it4.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public void m1780a(AbstractC0244am abstractC0244am) {
        if (this.f5338af.contains(abstractC0244am)) {
            return;
        }
        C0809q c0809q = new C0809q(this);
        c0809q.f5367a = abstractC0244am;
        this.f5338af.add(c0809q);
    }
}
