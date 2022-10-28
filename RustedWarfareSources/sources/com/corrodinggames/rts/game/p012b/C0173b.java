package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0243al;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.p045m.C1049f;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1076af;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.locks.ReentrantLock;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: com.corrodinggames.rts.game.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/b.class */
public final class C0173b {

    /* renamed from: f */
    static boolean f782f;

    /* renamed from: l */
    public static C0181h f783l;

    /* renamed from: m */
    public static C0181h f784m;

    /* renamed from: n */
    public int f785n;

    /* renamed from: o */
    public int f786o;

    /* renamed from: p */
    public int f787p;

    /* renamed from: q */
    public int f788q;

    /* renamed from: r */
    public float f789r;

    /* renamed from: s */
    public float f790s;

    /* renamed from: x */
    public C0178e f791x;

    /* renamed from: C */
    public int f792C;

    /* renamed from: D */
    public int f793D;

    /* renamed from: K */
    public static C0934e f794K;

    /* renamed from: L */
    public static InterfaceC1027y f795L;

    /* renamed from: M */
    public byte[][] f796M;

    /* renamed from: N */
    public byte[][] f797N;

    /* renamed from: Q */
    public C0182i f798Q;

    /* renamed from: R */
    public boolean f799R;

    /* renamed from: S */
    public boolean f800S;

    /* renamed from: T */
    public int f801T;

    /* renamed from: U */
    public int f802U;

    /* renamed from: W */
    public boolean f803W;

    /* renamed from: X */
    public boolean f804X;

    /* renamed from: Y */
    public int f805Y;

    /* renamed from: Z */
    public int f806Z;

    /* renamed from: ab */
    Paint f807ab;

    /* renamed from: ac */
    Paint f808ac;

    /* renamed from: ad */
    Paint f809ad;

    /* renamed from: ae */
    Paint f810ae;

    /* renamed from: af */
    Paint f811af;

    /* renamed from: ag */
    Paint f812ag;

    /* renamed from: ah */
    HashMap f813ah;

    /* renamed from: ai */
    float f814ai;

    /* renamed from: ap */
    long f815ap;

    /* renamed from: aq */
    float f816aq;

    /* renamed from: ar */
    float f817ar;

    /* renamed from: a */
    static final boolean f818a = false;

    /* renamed from: b */
    static final boolean f819b = false;

    /* renamed from: c */
    static final boolean f820c = false;

    /* renamed from: d */
    public static boolean f821d = false;

    /* renamed from: e */
    static ReentrantLock f822e = new ReentrantLock();

    /* renamed from: g */
    static Paint f823g = new Paint();

    /* renamed from: h */
    static Paint f824h = new Paint();

    /* renamed from: i */
    static Paint f825i = new Paint();

    /* renamed from: j */
    static Paint f826j = new Paint();

    /* renamed from: H */
    public static boolean f827H = false;

    /* renamed from: I */
    public static boolean f828I = false;

    /* renamed from: J */
    public static boolean f829J = false;

    /* renamed from: al */
    public static C0176c f830al = new C0176c();

    /* renamed from: k */
    boolean[] f831k = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];

    /* renamed from: t */
    public ArrayList f832t = new ArrayList();

    /* renamed from: u */
    public C0178e f833u = null;

    /* renamed from: v */
    public C0178e f834v = null;

    /* renamed from: w */
    public C0178e f835w = null;

    /* renamed from: y */
    public C0178e f836y = null;

    /* renamed from: z */
    public ArrayList f837z = new ArrayList();

    /* renamed from: A */
    public ArrayList f838A = new ArrayList();

    /* renamed from: as */
    private int f839as = 1;

    /* renamed from: B */
    public C0180g[] f840B = new C0180g[0];

    /* renamed from: E */
    public boolean f841E = true;

    /* renamed from: F */
    public boolean f842F = false;

    /* renamed from: G */
    public boolean f843G = false;

    /* renamed from: O */
    Rect f844O = new Rect();

    /* renamed from: P */
    protected ArrayList f845P = new ArrayList();

    /* renamed from: V */
    public PointF f846V = new PointF();

    /* renamed from: aa */
    float f847aa = 0.0f;

    /* renamed from: aj */
    float f848aj = 1.0f;

    /* renamed from: ak */
    int f849ak = 0;

    /* renamed from: am */
    Paint f850am = new Paint();

    /* renamed from: an */
    Rect f851an = new Rect();

    /* renamed from: ao */
    Rect f852ao = new Rect();

    /* renamed from: a */
    public static void m5346a() {
        if (f782f) {
            return;
        }
        f822e.lock();
    }

    /* renamed from: b */
    public static void m5311b() {
        if (f782f) {
            return;
        }
        f822e.unlock();
    }

    /* renamed from: c */
    public static void m5303c() {
        Core m1087A = Core.m1087A();
        f823g.m5933a(150, 255, 255, 255);
        f823g.m5926a(Paint.Style.f220b);
        f823g.m5936a(1.0f);
        m1087A.m1050a(f823g, 16.0f);
        f824h.m5933a(150, 255, 0, 0);
        f824h.m5926a(Paint.Style.f220b);
        f824h.m5936a(1.0f);
        f825i.m5933a(150, 0, 255, 0);
        f825i.m5926a(Paint.Style.f220b);
        f825i.m5936a(1.0f);
        f826j.m5933a(150, 255, 0, 0);
        long m2440a = C0727bl.m2440a();
        C0934e mo221a = m1087A.f6113bO.mo221a(C0067R.drawable.fog_smooth);
        f794K = m1087A.f6113bO.mo165b(((20 + 2) * 16) + 1, ((20 + 2) * 16) + 1, true);
        f794K.f6400m = true;
        f794K.m894b(true);
        f795L = m1087A.f6113bO.mo160b(f794K);
        C0934e mo165b = m1087A.f6113bO.mo165b(20 + 1, 20 + 1, true);
        InterfaceC1027y mo160b = m1087A.f6113bO.mo160b(mo165b);
        m5313a(m5307b(1), 2, 5, true, mo165b, mo160b, mo221a);
        m5313a(m5307b(2), 0, 5, true, mo165b, mo160b, mo221a);
        m5313a(m5307b(4), 0, 3, true, mo165b, mo160b, mo221a);
        m5313a(m5307b(8), 2, 3, true, mo165b, mo160b, mo221a);
        m5313a(m5335a(16, 1, 2), 1, 0, true, mo165b, mo160b, mo221a);
        m5313a(m5335a(32, 2, 4), 2, 1, true, mo165b, mo160b, mo221a);
        m5313a(m5335a(64, 8, 4), 1, 2, true, mo165b, mo160b, mo221a);
        m5313a(m5335a(-128, 1, 8), 0, 1, true, mo165b, mo160b, mo221a);
        m5313a(m5335a(16 + 32, 2, 1, 4), 2, 0, true, mo165b, mo160b, mo221a);
        m5313a(m5335a(32 + 64, 4, 8, 2), 2, 2, true, mo165b, mo160b, mo221a);
        m5313a(m5335a(64 - 128, 8, 4, 1), 0, 2, true, mo165b, mo160b, mo221a);
        m5313a(m5335a((-128) + 16, 1, 8, 2), 0, 0, true, mo165b, mo160b, mo221a);
        m5312a(m5307b(1 + 2), m5314a(2, 5, 0, 5), true, mo165b, mo160b, mo221a);
        m5312a(m5307b(2 + 4), m5314a(0, 5, 0, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5307b(4 + 8), m5314a(0, 3, 2, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5307b(8 + 1), m5314a(2, 3, 2, 5), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(16 + 32 + 64, 1, 2, 4, 8), m5314a(2, 0, 2, 2), true, mo165b, mo160b, mo221a);
        m5312a(m5335a((32 + 64) - 128, 1, 2, 4, 8), m5314a(2, 2, 0, 2), true, mo165b, mo160b, mo221a);
        m5312a(m5335a((64 - 128) + 16, 1, 2, 4, 8), m5314a(0, 2, 0, 0), true, mo165b, mo160b, mo221a);
        m5312a(m5335a((-128) + 16 + 32, 1, 2, 4, 8), m5314a(0, 0, 2, 0), true, mo165b, mo160b, mo221a);
        m5312a(m5307b(16 + 64), m5314a(1, 0, 1, 2), true, mo165b, mo160b, mo221a);
        m5312a(m5307b((-128) + 32), m5314a(0, 1, 2, 1), true, mo165b, mo160b, mo221a);
        m5312a(m5307b(1 + 4), m5314a(2, 5, 0, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5307b(2 + 8), m5314a(0, 5, 2, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(16 + 4, 2, 1), m5314a(1, 0, 0, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(64 + 2, 4, 8), m5314a(1, 2, 0, 5), true, mo165b, mo160b, mo221a);
        m5312a(m5335a((-128) + 2, 1, 8), m5314a(0, 1, 0, 5), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(32 + 1, 2, 4), m5314a(2, 1, 2, 5), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(16 + 8, 2, 1), m5314a(1, 0, 2, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(64 + 1, 4, 8), m5314a(1, 2, 2, 5), true, mo165b, mo160b, mo221a);
        m5312a(m5335a((-128) + 4, 1, 8), m5314a(0, 1, 0, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(32 + 8, 2, 4), m5314a(2, 1, 2, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(16 + 4 + 8, 2, 1), m5314a(1, 0, 0, 3, 2, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(64 + 2 + 1, 4, 8), m5314a(1, 2, 0, 5, 2, 5), true, mo165b, mo160b, mo221a);
        m5312a(m5335a((-128) + 2 + 4, 1, 8), m5314a(0, 1, 2, 5, 2, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5335a(32 + 1 + 8, 2, 4), m5314a(2, 1, 0, 5, 0, 3), true, mo165b, mo160b, mo221a);
        m5312a(m5307b(-1), m5314a(1, 4), true, mo165b, mo160b, mo221a);
        f795L.mo130p();
        f795L.mo129q();
        f795L = null;
        mo160b.mo129q();
        C0727bl.m2435a("smoothFog load took:", m2440a);
        m5297d();
        f783l = new C0181h(1.0f, false);
        f783l.m5239a();
        f784m = new C0181h(0.5f, false);
        f784m.m5239a();
    }

    /* renamed from: d */
    public static void m5297d() {
        if (f827H) {
            return;
        }
        f827H = true;
        f828I = Core.m1087A().settingEngine.softFogFading;
        if (Core.m1012as() && Build.VERSION.SDK_INT > 26) {
            long maxMemory = Runtime.getRuntime().maxMemory() / 1048576;
            Core.LogDebug2("MaxHeapSizeInMB:" + maxMemory);
            if (maxMemory > 200) {
                Core.LogDebug2("enabling softFades");
                f828I = true;
            }
        }
    }

    /* renamed from: b */
    private static int[] m5307b(int i) {
        return new int[]{i};
    }

    /* renamed from: a */
    private static int[] m5335a(int i, int... iArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        if (iArr.length == 1) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
        } else if (iArr.length == 2) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
        } else if (iArr.length == 3) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
        } else if (iArr.length == 4) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[2] + iArr[3]));
        } else {
            throw new RuntimeException("unhandled:" + iArr.length);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private static int[] m5314a(int... iArr) {
        return iArr;
    }

    /* renamed from: a */
    private static void m5313a(int[] iArr, int i, int i2, boolean z, C0934e c0934e, InterfaceC1027y interfaceC1027y, C0934e c0934e2) {
        m5312a(iArr, m5314a(i, i2), z, c0934e, interfaceC1027y, c0934e2);
    }

    /* renamed from: a */
    private static void m5312a(int[] iArr, int[] iArr2, boolean z, C0934e c0934e, InterfaceC1027y interfaceC1027y, C0934e c0934e2) {
        if (z) {
            interfaceC1027y.mo131o();
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        rect.m5874a(0, 0, 20, 20);
        for (int i = 0; i < iArr2.length; i += 2) {
            int i2 = iArr2[i + 0] * 20;
            int i3 = iArr2[i + 1] * 20;
            rect2.m5874a(i2, i3, i2 + 20, i3 + 20);
            interfaceC1027y.mo193a(c0934e2, rect2, rect, (Paint) null);
            rect4.m5874a(rect2.f232c - 1, rect2.f231b, rect2.f232c, rect2.f233d);
            rect3.m5874a(rect.f232c, rect.f231b, rect.f232c + 1, rect.f233d);
            interfaceC1027y.mo193a(c0934e2, rect4, rect3, (Paint) null);
            rect4.m5874a(rect2.f230a, rect2.f233d - 1, rect2.f232c, rect2.f233d);
            rect3.m5874a(rect.f230a, rect.f233d, rect.f232c, rect.f233d + 1);
            interfaceC1027y.mo193a(c0934e2, rect4, rect3, (Paint) null);
        }
        interfaceC1027y.mo130p();
        for (int i4 : iArr) {
            m5336a(i4 + 128, c0934e);
        }
    }

    /* renamed from: a */
    public static void m5336a(int i, C0934e c0934e) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        rect2.m5874a(0, 0, 20, 20);
        m5337a(i, rect);
        C0181h.m5231a(f795L, c0934e, rect2, rect, (Paint) null);
    }

    /* renamed from: a */
    public static void m5337a(int i, Rect rect) {
        int i2 = ((i % 16) * (20 + 2)) + 1;
        int i3 = (((int) (i * 0.0625f)) * (20 + 2)) + 1;
        rect.f230a = i2;
        rect.f231b = i3;
        rect.f232c = i2 + 20;
        rect.f233d = i3 + 20;
    }

    /* renamed from: a */
    public final short m5332a(C0180g c0180g) {
        if (this.f839as >= this.f840B.length) {
            C0180g[] c0180gArr = new C0180g[C0758f.m2132c(this.f840B.length + 100, 32767)];
            System.arraycopy(this.f840B, 0, c0180gArr, 0, this.f840B.length);
            this.f840B = c0180gArr;
        }
        int i = this.f839as;
        if (this.f839as < 32766) {
            this.f839as++;
        } else {
            Core.m998b("Max unique tile limit reached at: " + this.f839as);
        }
        this.f840B[i] = c0180g;
        return (short) i;
    }

    /* renamed from: a */
    public final C0180g m5315a(short s) {
        return this.f840B[s];
    }

    /* renamed from: a */
    public C0180g m5331a(C0180g c0180g, int i, int i2) {
        int length;
        if (c0180g != null && c0180g.f926m != null && (((i * 13) + (i2 * 1313)) % (c0180g.f926m.length + 1)) - 1 >= 0) {
            return c0180g.f926m[length];
        }
        return c0180g;
    }

    /* renamed from: a */
    public boolean m5342a(float f, float f2, AbstractC0197n abstractC0197n) {
        if (this.f841E) {
            int i = (int) (f * this.f789r);
            int i2 = (int) (f2 * this.f790s);
            if (abstractC0197n.f1337M != null && m5300c(i, i2) && abstractC0197n.f1337M[i][i2] >= 5) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m5339a(int i, int i2, AbstractC0197n abstractC0197n) {
        if (this.f841E && abstractC0197n.f1337M != null && m5300c(i, i2) && abstractC0197n.f1337M[i][i2] >= 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m5344a(float f, float f2) {
        this.f801T = (int) (f * this.f789r);
        this.f802U = (int) (f2 * this.f790s);
    }

    /* renamed from: a */
    public void m5340a(int i, int i2) {
        this.f801T = i * this.f785n;
        this.f802U = i2 * this.f786o;
    }

    /* renamed from: b */
    public void m5306b(int i, int i2) {
        this.f801T = (i * this.f785n) + this.f787p;
        this.f802U = (i2 * this.f786o) + this.f788q;
    }

    /* renamed from: a */
    public PointF m5334a(Point point) {
        this.f846V.m5879a(point.f224a * this.f785n, point.f225b * this.f786o);
        return this.f846V;
    }

    /* renamed from: b */
    public void m5309b(float f, float f2) {
        m5344a(f, f2);
        m5340a(this.f801T, this.f802U);
    }

    /* renamed from: a */
    public float m5345a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > m5281i()) {
            f = m5281i();
        }
        return f;
    }

    /* renamed from: b */
    public float m5310b(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > m5280j()) {
            f = m5280j();
        }
        return f;
    }

    /* renamed from: c */
    public final boolean m5300c(int i, int i2) {
        return i >= 0 && i < this.f792C && i2 >= 0 && i2 < this.f793D;
    }

    /* renamed from: c */
    public C0180g m5301c(float f, float f2) {
        int i = (int) (f * this.f789r);
        int i2 = (int) (f2 * this.f790s);
        if (i < 0 || i >= this.f792C || i2 < 0 || i2 >= this.f793D) {
            return null;
        }
        return this.f833u.m5252a(i, i2);
    }

    /* renamed from: d */
    public C0180g m5295d(int i, int i2) {
        if (m5300c(i, i2)) {
            return this.f833u.m5252a(i, i2);
        }
        return null;
    }

    /* renamed from: e */
    public C0180g m5290e(int i, int i2) {
        if (!m5300c(i, i2) || this.f836y == null) {
            return null;
        }
        return this.f836y.m5252a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5333a(RectF rectF) {
        if (Core.m1086B()) {
            rectF.f234a *= this.f785n / 20;
            rectF.f236c *= this.f785n / 20;
            rectF.f235b *= this.f786o / 20;
            rectF.f237d *= this.f786o / 20;
        }
    }

    public C0173b() {
        this.f785n = 20;
        this.f786o = 20;
        if (Core.m1086B()) {
            this.f785n = 60;
            this.f786o = 60;
        }
        this.f787p = this.f785n / 2;
        this.f788q = this.f786o / 2;
        this.f789r = 1.0f / this.f785n;
        this.f790s = 1.0f / this.f786o;
        this.f807ab = new C0930ag();
        this.f807ab.m5933a(100, 255, 0, 0);
        this.f807ab.mo5909b(16.0f);
        this.f808ac = new C0930ag();
        this.f808ac.m5926a(Paint.Style.f220b);
        this.f808ac.m5936a(1.0f);
        this.f808ac.m5933a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0);
        this.f809ad = new C0930ag();
        this.f809ad.m5926a(Paint.Style.f220b);
        this.f809ad.m5936a(1.0f);
        this.f809ad.m5933a(100, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 0);
        this.f810ae = new C0930ag();
        this.f810ae.m5926a(Paint.Style.f220b);
        this.f810ae.m5936a(1.0f);
        this.f810ae.m5933a(255, 175, 0, 0);
        this.f811af = new C0930ag();
        this.f811af.m5933a(155, 175, 0, 0);
        this.f812ag = new C0930ag();
        this.f812ag.m5923a(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: a */
    public static void m5320a(String str, StreamWriter streamWriter) {
        InputStream m5305b = m5305b(str);
        if (m5305b == null) {
            throw new IOException("writeMapStream: Could not find map:" + str);
        }
        int m5322a = (int) m5322a(str);
        if (m5322a == -1) {
            new IOException("writeMapStream: Failed to get map size");
        }
        if (m5322a == 0) {
            new IOException("writeMapStream: Got empty map size");
        }
        Core.LogDebug2("Sending map stream of size: " + m5322a);
        streamWriter.m1412a(m5305b, m5322a);
    }

    /* renamed from: a */
    public static long m5322a(String str) {
        String str2 = VariableScope.nullOrMissingString + str;
        String m2275e = C0750a.m2275e(str2);
        AbstractC1076af m620a = C1075ae.m620a(m2275e);
        if (m620a != null && !m2275e.endsWith(".rwmod")) {
            long mo613a = m620a.mo613a(m2275e, false);
            if (mo613a == -1) {
            }
            return mo613a;
        } else if (C0750a.m2279c(str2)) {
            try {
                return Core.m1087A().f6227am.mo6013d().m5998b(m2275e).getLength();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return new File(m2275e).length();
        }
    }

    /* renamed from: b */
    public static InputStream m5305b(String str) {
        InputStream m5294d;
        InputStream m5294d2 = m5294d(str);
        if (m5294d2 == null && (m5294d = m5294d(str.replace(".tmx", VariableScope.nullOrMissingString) + "_moved")) != null) {
            String trim = C0758f.m2186a(m5294d).trim();
            Core.LogDebug2("Found moved map at:" + trim);
            m5294d2 = m5294d(trim);
        }
        return m5294d2;
    }

    /* renamed from: c */
    public static String m5299c(String str) {
        if (str == null) {
            return null;
        }
        return C0750a.m2275e(str);
    }

    /* renamed from: d */
    public static InputStream m5294d(String str) {
        String m5299c = m5299c(VariableScope.nullOrMissingString + str);
        Core.LogDebug2("Mapfile: " + m5299c);
        return C0750a.m2269j(m5299c);
    }

    /* renamed from: a */
    public void m5316a(Document document, OutputStream outputStream) {
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        newTransformer.setOutputProperty("indent", "yes");
        newTransformer.transform(new DOMSource(document), new StreamResult(outputStream));
    }

    /* renamed from: a */
    public void m5324a(InputStream inputStream, OutputStream outputStream) {
        float f;
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(false);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        newDocumentBuilder.setEntityResolver(new C01741());
        Document parse = newDocumentBuilder.parse(inputStream);
        Element documentElement = parse.getDocumentElement();
        String attribute = documentElement.getAttribute("orientation");
        if (!attribute.equals("orthogonal")) {
            throw new C0179f("Only orthogonal maps are supported, found: " + attribute);
        }
        NodeList elementsByTagName = documentElement.getElementsByTagName("SOMETHING");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
        }
        NodeList elementsByTagName2 = documentElement.getElementsByTagName("layer");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName2.item(i2);
            if ("units".equalsIgnoreCase(element2.getAttribute("name"))) {
                element2.getParentNode().removeChild(element2);
            }
        }
        NodeList elementsByTagName3 = documentElement.getElementsByTagName("objectgroup");
        for (int i3 = 0; i3 < elementsByTagName3.getLength(); i3++) {
            Element element3 = (Element) elementsByTagName3.item(i3);
            if ("UnitObjects".equalsIgnoreCase(element3.getAttribute("name"))) {
                element3.getParentNode().removeChild(element3);
            }
        }
        Element createElement = parse.createElement("objectgroup");
        createElement.setAttribute("name", "UnitObjects");
        Iterator it = AbstractC0244am.m4761bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if ((abstractC0244am instanceof AbstractC0244am) && (!(abstractC0244am instanceof C0243al) || !((C0243al) abstractC0244am).f1599bL)) {
                if (!abstractC0244am.f1607bT && !abstractC0244am.mo1756u()) {
                    C0399m m4668dl = abstractC0244am.m4668dl();
                    if (abstractC0244am.f1652cM != null && m4668dl != null) {
                        if (!m4668dl.f2481D) {
                        }
                    } else {
                        Element createElement2 = parse.createElement("object");
                        int i4 = 20;
                        if (20 < abstractC0244am.f1621ch) {
                            i4 = (int) abstractC0244am.f1621ch;
                        }
                        createElement2.setAttribute("name", abstractC0244am.mo1758r().mo4474i() + " (t:" + abstractC0244am.f1609bV.f1306k + ")");
                        createElement2.setAttribute("x", VariableScope.nullOrMissingString + (abstractC0244am.f6958el - (i4 / 2)));
                        createElement2.setAttribute("y", VariableScope.nullOrMissingString + (abstractC0244am.f6959em - (i4 / 2)));
                        createElement2.setAttribute("width", VariableScope.nullOrMissingString + i4);
                        createElement2.setAttribute("height", VariableScope.nullOrMissingString + i4);
                        if (abstractC0244am.m4758bI()) {
                            f = abstractC0244am.f1618ce;
                        } else {
                            f = abstractC0244am.f1618ce + 90.0f;
                        }
                        createElement2.setAttribute("rotation", VariableScope.nullOrMissingString + f);
                        Integer m5328a = m5328a(abstractC0244am.mo1758r());
                        if (m5328a != null) {
                            createElement2.setAttribute("gid", VariableScope.nullOrMissingString + m5328a);
                        }
                        Element createElement3 = parse.createElement("properties");
                        Element createElement4 = parse.createElement("property");
                        createElement4.setAttribute("name", "unit");
                        createElement4.setAttribute("value", abstractC0244am.mo1758r().mo4474i());
                        createElement3.appendChild(createElement4);
                        Element createElement5 = parse.createElement("property");
                        createElement5.setAttribute("name", "team");
                        createElement5.setAttribute("value", VariableScope.nullOrMissingString + abstractC0244am.f1609bV.f1306k);
                        createElement3.appendChild(createElement5);
                        createElement2.appendChild(createElement3);
                        createElement.appendChild(createElement2);
                    }
                }
            }
        }
        documentElement.appendChild(createElement);
        m5316a(parse, outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.b.b$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/b$1.class */
    public class C01741 implements EntityResolver {
        C01741() {
        }

        public InputSource resolveEntity(String str, String str2) {
            return new InputSource(new ByteArrayInputStream(new byte[0]));
        }
    }

    /* renamed from: a */
    public boolean m5319a(String str, String str2) {
        Core m1087A = Core.m1087A();
        try {
            m5304b(str, str2);
            m1087A.f6117bS.f5115e.m1794a(null, "Map exported.");
            return true;
        } catch (C0179f e) {
            m1087A.m990c("Error exporting map", "Failed to export map. error: " + e.getMessage());
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            m1087A.m990c("Error exporting map", "Failed to export map. IO error: " + e2.getMessage());
            return false;
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
            m1087A.m990c("Error exporting map", "Failed to export map. Class not found: " + e3.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public void m5304b(String str, String str2) {
        Core.LogDebug2(" --- Saving map:" + str + " to: " + str2);
        InputStream m5305b = m5305b(str);
        if (m5305b == null) {
            throw new IOException("Could not find orginal map: " + str);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(m5305b);
        String m2275e = C0750a.m2275e(str2);
        File parentFile = new File(m2275e).getParentFile();
        if (!C0750a.m2271h(parentFile.getAbsolutePath())) {
            C0750a.m2268k(parentFile.getAbsolutePath());
        }
        if (!C0750a.m2273f(parentFile.getAbsolutePath())) {
            Core.m998b("Save Map: Could not create parent directory");
        }
        try {
            OutputStream m2282b = C0750a.m2282b(m2275e, false);
            if (m2282b == null) {
                throw new IOException("Failed to get save target:" + m2275e);
            }
            try {
                m5324a(bufferedInputStream, m2282b);
                try {
                    m2282b.close();
                    bufferedInputStream.close();
                    m5305b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                throw new IOException(e2);
            } catch (ParserConfigurationException e3) {
                throw new IOException(e3);
            } catch (TransformerException e4) {
                throw new IOException(e4);
            } catch (SAXException e5) {
                throw new IOException(e5);
            }
        } catch (FileNotFoundException e6) {
            throw new IOException("Failed to open save target:" + m2275e);
        }
    }

    /* renamed from: a */
    public void m5317a(String str, boolean z) {
        Core.LogDebug2(" --- Loading map ---");
        InputStream m5305b = m5305b(str);
        if (m5305b == null) {
            throw new C0179f("Could not find map: " + C0750a.m2277d(m5299c(str)));
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(m5305b);
        m5323a(bufferedInputStream, z);
        try {
            bufferedInputStream.close();
            m5305b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public C0183j m5289e(String str) {
        C0183j c0183j = null;
        Iterator it = this.f832t.iterator();
        while (it.hasNext()) {
            C0183j c0183j2 = (C0183j) it.next();
            if (str.equals(c0183j2.f950a)) {
                c0183j = c0183j2;
            }
        }
        if (c0183j == null) {
            int i = 1;
            if (this.f832t.size() > 0) {
                C0183j c0183j3 = (C0183j) this.f832t.get(this.f832t.size() - 1);
                i = c0183j3.f961l + 100;
                c0183j3.m5213c(i);
            }
            C0183j c0183j4 = new C0183j(this, str, i + 1);
            this.f832t.add(c0183j4);
            c0183j = c0183j4;
        }
        if (c0183j.f951b == null) {
            c0183j.m5214c();
        }
        return c0183j;
    }

    /* renamed from: a */
    public C0180g m5321a(String str, int i, int i2) {
        C0183j m5289e = m5289e(str);
        if (this.f813ah == null) {
            this.f813ah = new HashMap();
        }
        int m5224a = m5289e.f961l + m5289e.m5224a(i, i2);
        C0180g c0180g = (C0180g) this.f813ah.get(Integer.valueOf(m5224a));
        if (c0180g != null) {
            return c0180g;
        }
        C0180g m5243a = C0180g.m5243a(this, this.f833u, m5289e, m5224a - m5289e.f961l, (short) 0, (short) 0, true);
        this.f813ah.put(Integer.valueOf(m5224a), m5243a);
        return m5243a;
    }

    /* renamed from: a */
    public void m5323a(InputStream inputStream, boolean z) {
        int m5233a;
        NodeList elementsByTagName;
        this.f838A.clear();
        f783l.m5230b();
        f784m.m5230b();
        try {
            Core.LogDebug2("---- Loading map data ----");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setValidating(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(new C01752());
            Element documentElement = newDocumentBuilder.parse(inputStream).getDocumentElement();
            String attribute = documentElement.getAttribute("orientation");
            if (!attribute.equals("orthogonal")) {
                throw new C0179f("Only orthogonal maps are supported, found: " + attribute);
            }
            int parseInt = Integer.parseInt(documentElement.getAttribute("width"));
            int parseInt2 = Integer.parseInt(documentElement.getAttribute("height"));
            this.f792C = parseInt;
            this.f793D = parseInt2;
            Core.LogDebug2("Map size: " + this.f792C + ", " + this.f793D);
            this.f817ar = 150.0f;
            if (this.f841E) {
                Core.LogDebug2("Setting up team fog..");
                for (int i = 0; i < AbstractC0197n.f1365c; i++) {
                    AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
                    if (m5017k != null) {
                        m5017k.f1335K = this.f792C;
                        m5017k.f1336L = this.f793D;
                        m5017k.f1337M = new byte[this.f792C][this.f793D];
                        for (int i2 = 0; i2 < this.f792C; i2++) {
                            for (int i3 = 0; i3 < this.f793D; i3++) {
                                m5017k.f1337M[i2][i3] = 10;
                            }
                        }
                    }
                }
            } else {
                Core.LogDebug2("No team fog on this map..");
                for (int i4 = 0; i4 < AbstractC0197n.f1365c; i4++) {
                    AbstractC0197n m5017k2 = AbstractC0197n.m5017k(i4);
                    if (m5017k2 != null) {
                        m5017k2.f1337M = null;
                    }
                }
            }
            Element element = (Element) documentElement.getElementsByTagName("properties").item(0);
            if (element != null && (elementsByTagName = element.getElementsByTagName("property")) != null) {
                Properties properties = new Properties();
                for (int i5 = 0; i5 < elementsByTagName.getLength(); i5++) {
                    Element element2 = (Element) elementsByTagName.item(i5);
                    properties.setProperty(element2.getAttribute("name"), element2.getAttribute("value"));
                }
            }
            C0183j c0183j = null;
            NodeList elementsByTagName2 = documentElement.getElementsByTagName("tileset");
            for (short s = 0; s < elementsByTagName2.getLength(); s = (short) (s + 1)) {
                C0183j c0183j2 = new C0183j(this, (Element) elementsByTagName2.item(s));
                c0183j2.f963n = s;
                if (c0183j != null) {
                    c0183j.m5213c(c0183j2.f961l - 1);
                }
                c0183j = c0183j2;
                this.f832t.add(c0183j2);
            }
            NodeList elementsByTagName3 = documentElement.getElementsByTagName("layer");
            for (int i6 = 0; i6 < elementsByTagName3.getLength(); i6++) {
                Element element3 = (Element) elementsByTagName3.item(i6);
                String attribute2 = element3.getAttribute("name");
                if (!"set".equalsIgnoreCase(attribute2) && !"set-disabled".equalsIgnoreCase(attribute2)) {
                    C0178e c0178e = new C0178e(this, element3);
                    c0178e.f900j = i6;
                    this.f837z.add(c0178e);
                }
            }
            Iterator it = this.f837z.iterator();
            while (it.hasNext()) {
                C0178e c0178e2 = (C0178e) it.next();
                if (c0178e2.f908r) {
                    this.f833u = c0178e2;
                }
                if (c0178e2.f901k.equalsIgnoreCase("grounddetails")) {
                    this.f834v = c0178e2;
                }
                if (c0178e2.f901k.equalsIgnoreCase("grounddetails2")) {
                    this.f835w = c0178e2;
                }
                if (c0178e2.f901k.equalsIgnoreCase("Items") || c0178e2.f901k.equalsIgnoreCase("Objects")) {
                    this.f836y = c0178e2;
                }
                if (c0178e2.f901k.equalsIgnoreCase("PathingOverride")) {
                    this.f791x = c0178e2;
                }
            }
            if (this.f833u == null) {
                throw new C0179f("'Ground' layer was not found in map, this layer is required");
            }
            if (this.f840B == null || this.f840B.length == 0) {
                throw new C0179f("Invalid map, no tiles have been set");
            }
            if (!Core.m1086B() && !Core.m1085C()) {
                for (int i7 = 0; i7 < this.f792C; i7++) {
                    for (int i8 = 0; i8 < this.f793D; i8++) {
                        if (this.f833u.m5252a(i7, i8) == null) {
                            throw new C0179f("An empty tile on the Ground layer at " + i7 + "," + i8 + " all tiles must be filled");
                        }
                    }
                }
            }
            if (this.f836y == null) {
                throw new C0179f("'Items' layer was not found in map, this layer is required");
            }
            NodeList elementsByTagName4 = documentElement.getElementsByTagName("objectgroup");
            for (int i9 = 0; i9 < elementsByTagName4.getLength(); i9++) {
                C0182i c0182i = new C0182i((Element) elementsByTagName4.item(i9), this);
                c0182i.f944a = i9;
                this.f845P.add(c0182i);
            }
            C0183j.m5226a();
            Iterator it2 = this.f832t.iterator();
            while (it2.hasNext()) {
                C0183j c0183j3 = (C0183j) it2.next();
                if (c0183j3.f966q) {
                    c0183j3.m5214c();
                }
            }
            C0183j.m5217b();
            int i10 = 0;
            while (i10 <= 1) {
                Iterator it3 = this.f837z.iterator();
                while (it3.hasNext()) {
                    C0178e c0178e3 = (C0178e) it3.next();
                    if ((c0178e3 == this.f833u) == (i10 == 0)) {
                        c0178e3.f913w = false;
                        if (c0178e3.f909s) {
                            for (int i11 = 0; i11 < this.f792C; i11++) {
                                for (int i12 = 0; i12 < this.f793D; i12++) {
                                    C0180g m5252a = c0178e3.m5252a(i11, i12);
                                    if (m5252a != null && m5252a.f916c == -2) {
                                        m5252a.f916c = f783l.m5233a(m5252a.f914a, m5252a.f915b);
                                        if (m5252a.f916c >= 0 && (m5233a = f784m.m5233a(m5252a.f914a, m5252a.f915b)) != m5252a.f916c) {
                                            throw new RuntimeException("Meta index mismatch: " + m5233a + " vs " + m5252a.f916c);
                                        }
                                        if (m5252a.f916c < 0) {
                                            c0178e3.f913w = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i10++;
            }
            f783l.m5228c();
            f784m.m5228c();
            this.f798Q = m5285f("triggers");
            C0172a c0172a = null;
            if (this.f798Q != null) {
                c0172a = this.f798Q.m5227a("map_info");
            }
            boolean z2 = false;
            boolean z3 = false;
            Core m1087A = Core.m1087A();
            m1087A.f6129ce = null;
            String str = null;
            String str2 = null;
            if (c0172a != null) {
                String m5349b = c0172a.m5349b("type");
                str2 = c0172a.m5349b("fog");
                if ("mission".equalsIgnoreCase(m5349b) || "survival".equalsIgnoreCase(m5349b) || "challenge".equalsIgnoreCase(m5349b) || "skirmish".equalsIgnoreCase(m5349b)) {
                    str = m5349b;
                } else {
                    Core.m998b("Unknown map type:" + m5349b);
                }
            } else {
                Core.m998b("Map type not found on mapInfo");
            }
            if (str == null) {
                Core.m998b("Defaulting to skirmish map type");
                str = "skirmish";
            } else {
                Core.m998b("Map type: " + str);
            }
            m1087A.f6129ce = new C1049f();
            m1087A.f6129ce.m775a(z);
            if (str2 != null && !VariableScope.nullOrMissingString.equals(str2)) {
                if (!str2.equalsIgnoreCase("none")) {
                    z2 = true;
                    if (str2.equalsIgnoreCase("los")) {
                        z3 = true;
                    } else if (!str2.equalsIgnoreCase("map")) {
                        Core.LogDebug2("Unknown map fog type: " + str2);
                    }
                }
            } else if (Core.m1010au() && !m1087A.m1075M()) {
                z2 = true;
                if (str != null && str.equalsIgnoreCase("skirmish")) {
                    z3 = true;
                }
            }
            if (!z2) {
                this.f841E = false;
            }
            if (z2 && z3) {
                this.f842F = true;
            }
            this.f803W = true;
        } catch (IOException e) {
            throw new C0179f("Failed to parse map", e);
        } catch (ParserConfigurationException e2) {
            throw new RuntimeException("Failed to parse map", e2);
        } catch (SAXException e3) {
            Core.LogDebug2(" --- SAXException: Failed to parse map - " + e3.getMessage() + " ---");
            try {
                Core.LogDebug2("available:" + inputStream.available());
                inputStream.reset();
                Core.LogDebug2("after reset:" + inputStream.available());
            } catch (IOException e4) {
                Core.LogDebug2("-- error writing debug info --");
                e4.printStackTrace();
            }
            throw new C0179f("Failed to parse map - " + e3.getMessage(), e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.b.b$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/b$2.class */
    public class C01752 implements EntityResolver {
        C01752() {
        }

        public InputSource resolveEntity(String str, String str2) {
            return new InputSource(new ByteArrayInputStream(new byte[0]));
        }
    }

    /* renamed from: e */
    public void m5292e() {
    }

    /* renamed from: a */
    public void m5330a(C0195l c0195l) {
        if (Core.f6205aU && !Core.f6207aW) {
            return;
        }
        f830al.m5270a(c0195l);
    }

    /* renamed from: a */
    public void m5327a(AbstractC0623y abstractC0623y, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC1027y interfaceC1027y, boolean z, int i7) {
        Core m1087A = Core.m1087A();
        C0173b c0173b = m1087A.f6110bL;
        InterfaceC0303as mo6163i = m1087A.f6117bS.f5159W.mo6163i();
        EnumC0246ao mo4468o = mo6163i.mo4468o();
        for (int i8 = i; i8 <= i3; i8++) {
            for (int i9 = i2; i9 <= i4; i9++) {
                boolean m3538a = AbstractC0488d.m3538a(abstractC0623y, mo6163i, mo4468o, i8, i9, i7);
                int i10 = (i8 * c0173b.f785n) - i5;
                int i11 = (i9 * c0173b.f786o) - i6;
                this.f851an.m5874a(i10, i11, (i10 + c0173b.f785n) - 1, (i11 + c0173b.f786o) - 1);
                if (z) {
                    if (m3538a) {
                        interfaceC1027y.mo162b(this.f851an, c0173b.f809ad);
                    } else {
                        interfaceC1027y.mo162b(this.f851an, c0173b.f811af);
                        interfaceC1027y.mo162b(this.f851an, c0173b.f810ae);
                    }
                } else if (m3538a) {
                    interfaceC1027y.mo162b(this.f851an, c0173b.f808ac);
                } else {
                    interfaceC1027y.mo162b(this.f851an, c0173b.f810ae);
                }
            }
        }
    }

    /* renamed from: f */
    public static void m5288f() {
        f830al.m5261d();
    }

    /* renamed from: c */
    public void m5302c(float f) {
        f830al.m5276a(f);
    }

    /* renamed from: g */
    public void m5284g() {
        f830al.m5265c();
    }

    /* renamed from: d */
    public void m5296d(float f) {
        Core m1087A = Core.m1087A();
        boolean m1012as = Core.m1012as();
        if (m1012as) {
            m1087A.f6113bO.mo178a(f822e);
        }
        m5302c(f);
        if (m1012as) {
            m1087A.f6113bO.mo156b(f822e);
        }
        if (this.f804X) {
            new Rect();
            Rect rect = new Rect();
            int i = this.f805Y * this.f785n;
            int i2 = this.f806Z * this.f786o;
            rect.m5874a(i, i2, i + this.f785n, i2 + this.f786o);
            rect.m5875a(-Core.m1087A().f6142ct, -Core.m1087A().f6143cu);
        }
    }

    /* renamed from: e */
    public void m5291e(float f) {
        Core.m1087A();
        m5287f(f);
    }

    /* renamed from: h */
    public void m5282h() {
        Iterator it = this.f832t.iterator();
        while (it.hasNext()) {
            ((C0183j) it.next()).m5212d();
        }
        this.f832t.clear();
        Iterator it2 = this.f837z.iterator();
        while (it2.hasNext()) {
            ((C0178e) it2.next()).m5245b();
        }
        this.f837z.clear();
        this.f845P.clear();
        this.f798Q = null;
        f830al.m5265c();
    }

    /* renamed from: a */
    public C0183j m5341a(int i) {
        for (int i2 = 0; i2 < this.f832t.size(); i2++) {
            C0183j c0183j = (C0183j) this.f832t.get(i2);
            if (c0183j.m5211d(i)) {
                return c0183j;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Integer m5328a(InterfaceC0303as interfaceC0303as) {
        String mo4474i = interfaceC0303as.mo4474i();
        Integer m5298c = m5298c("unit", mo4474i);
        if (m5298c == null) {
            m5298c = m5298c("customUnit", mo4474i);
        }
        return m5298c;
    }

    /* renamed from: c */
    public Integer m5298c(String str, String str2) {
        for (int i = 0; i < this.f832t.size(); i++) {
            Integer m5215b = ((C0183j) this.f832t.get(i)).m5215b(str, str2);
            if (m5215b != null) {
                return m5215b;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C0182i m5285f(String str) {
        Iterator it = this.f845P.iterator();
        while (it.hasNext()) {
            C0182i c0182i = (C0182i) it.next();
            if (str.equalsIgnoreCase(c0182i.f945b)) {
                return c0182i;
            }
        }
        return null;
    }

    /* renamed from: i */
    public float m5281i() {
        return this.f792C * this.f785n;
    }

    /* renamed from: j */
    public float m5280j() {
        return this.f793D * this.f786o;
    }

    /* renamed from: a */
    public void m5343a(float f, float f2, int i, AbstractC0197n abstractC0197n, boolean z) {
        C1049f c1049f;
        Core m1087A = Core.m1087A();
        if (this.f841E) {
            long j = 0;
            if (f818a) {
                j = C0727bl.m2440a();
            }
            boolean z2 = true;
            boolean z3 = abstractC0197n.f1327D;
            if (!m1087A.m1007ax() && (c1049f = m1087A.f6129ce) != null && !c1049f.m786a() && !c1049f.m774b()) {
                z2 = false;
            }
            if (!z2) {
                m5308b(f, f2, i, abstractC0197n, z);
            } else {
                for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                    AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
                    if (m5017k != null && (m5017k == abstractC0197n || (!m5017k.f1317v && (m5017k.m5042d(abstractC0197n) || z3)))) {
                        m5308b(f, f2, i, m5017k, z);
                    }
                }
            }
            if (f818a) {
                this.f815ap += C0727bl.m2440a() - j;
            }
        }
    }

    /* renamed from: a */
    public byte m5338a(int i, int i2, byte[][] bArr, byte b) {
        byte b2 = 0;
        int i3 = this.f792C;
        int i4 = this.f793D;
        if (i >= 1) {
            if (bArr[i - 1][i2] >= b) {
                b2 = (byte) (0 - 128);
            }
            if (i2 >= 1 && bArr[i - 1][i2 - 1] >= b) {
                b2 = (byte) (b2 + 1);
            }
            if (i2 < i4 - 1 && bArr[i - 1][i2 + 1] >= b) {
                b2 = (byte) (b2 + 8);
            }
        }
        if (i2 >= 1) {
            if (bArr[i][i2 - 1] >= b) {
                b2 = (byte) (b2 + 16);
            }
            if (i < i3 - 1 && bArr[i + 1][i2 - 1] >= b) {
                b2 = (byte) (b2 + 2);
            }
        }
        if (i < i3 - 1 && bArr[i + 1][i2] >= b) {
            b2 = (byte) (b2 + 32);
        }
        if (i2 < i4 - 1) {
            if (bArr[i][i2 + 1] >= b) {
                b2 = (byte) (b2 + 64);
            }
            if (i < i3 - 1 && bArr[i + 1][i2 + 1] >= b) {
                b2 = (byte) (b2 + 4);
            }
        }
        if (b2 == Byte.MAX_VALUE) {
            b2 = -1;
        }
        return b2;
    }

    /* renamed from: k */
    public void m5279k() {
        m5278l();
        for (int i = 0; i < this.f792C; i++) {
            for (int i2 = 0; i2 < this.f793D; i2++) {
                this.f796M[i][i2] = 0;
                this.f797N[i][i2] = 0;
            }
        }
    }

    /* renamed from: f */
    public void m5286f(int i, int i2) {
        this.f796M[i][i2] = 0;
        this.f797N[i][i2] = 0;
    }

    /* renamed from: g */
    public void m5283g(int i, int i2) {
        int i3 = i - 1;
        int i4 = i2 - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i + 1;
        int i6 = i2 + 1;
        if (i5 > this.f792C - 1) {
            i5 = this.f792C - 1;
        }
        if (i6 > this.f793D - 1) {
            i6 = this.f793D - 1;
        }
        for (int i7 = i3; i7 <= i5; i7++) {
            for (int i8 = i4; i8 <= i6; i8++) {
                if (this.f796M[i7][i8] != 0) {
                    this.f796M[i7][i8] = Byte.MAX_VALUE;
                }
                if (this.f797N[i7][i8] != 0) {
                    this.f797N[i7][i8] = Byte.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: l */
    public void m5278l() {
        boolean z = false;
        if (this.f796M == null) {
            z = true;
        } else if (this.f796M.length != this.f792C || this.f796M[0].length != this.f793D) {
            Core.LogDebug2("smoothFog_cache: Size mismatch");
            z = true;
        }
        if (z) {
            Core.LogDebug2("Building smoothFog_cache");
            this.f796M = new byte[this.f792C][this.f793D];
            this.f797N = new byte[this.f792C][this.f793D];
            for (int i = 0; i < this.f792C; i++) {
                for (int i2 = 0; i2 < this.f793D; i2++) {
                    this.f796M[i][i2] = Byte.MAX_VALUE;
                    this.f797N[i][i2] = Byte.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: b */
    public void m5308b(float f, float f2, int i, AbstractC0197n abstractC0197n, boolean z) {
        byte b;
        Core m1087A = Core.m1087A();
        if (this.f841E && abstractC0197n.f1337M != null) {
            m5278l();
            float f3 = (i - 5) * (i - 5);
            float f4 = (i - 3) * (i - 3);
            float f5 = i * i;
            float f6 = (1.0f / (f5 - f4)) * 10.0f;
            m5344a(f, f2);
            int i2 = this.f801T;
            int i3 = this.f802U;
            float f7 = f * this.f789r;
            float f8 = f2 * this.f790s;
            byte[][] bArr = abstractC0197n.f1337M;
            int i4 = i - 1;
            int i5 = i2 - i4;
            int i6 = i3 - i4;
            if (i5 < 0) {
                i5 = 0;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            int i7 = i2 + i4;
            int i8 = i3 + i4;
            if (i7 > this.f792C - 1) {
                i7 = this.f792C - 1;
            }
            if (i8 > this.f793D - 1) {
                i8 = this.f793D - 1;
            }
            C0176c c0176c = f830al;
            boolean z2 = false;
            boolean m5011q = abstractC0197n.m5011q();
            for (int i9 = i5; i9 <= i7; i9++) {
                for (int i10 = i6; i10 <= i8; i10++) {
                    byte b2 = bArr[i9][i10];
                    if (b2 != 0) {
                        float m2209a = C0758f.m2209a(f7, f8, i9, i10);
                        if (m2209a <= f4) {
                            if (b2 > 0) {
                                bArr[i9][i10] = 0;
                                if (m5011q) {
                                    c0176c.m5271a(i9, i10, true);
                                    z2 = true;
                                    if (m2209a <= f3 && z) {
                                        m5286f(i9, i10);
                                    } else {
                                        m5283g(i9, i10);
                                    }
                                }
                            }
                        } else if (m2209a <= f5 && b2 > (b = (byte) ((m2209a - f4) * f6))) {
                            bArr[i9][i10] = b;
                            if (m5011q) {
                                c0176c.m5271a(i9, i10, true);
                                z2 = true;
                                m5283g(i9, i10);
                            }
                        }
                    }
                }
            }
            if (z2) {
                m1087A.f6121bW.f5320O = true;
            }
        }
    }

    /* renamed from: f */
    public void m5287f(float f) {
        Core m1087A = Core.m1087A();
        if (f818a) {
            this.f816aq += f;
            if (this.f816aq > 60.0f) {
                this.f816aq = 0.0f;
                if (this.f815ap > 0) {
                    Core.LogDebug2("seeThoughFogOfWarTimes: " + C0727bl.m2432b(this.f815ap));
                    this.f815ap = 0L;
                }
                if (this.f815ap < 0) {
                    Core.LogDebug2("seeThoughFogOfWarTimes negative: " + C0727bl.m2432b(this.f815ap));
                    this.f815ap = 0L;
                }
            }
        }
        if (this.f841E && this.f842F) {
            m5278l();
            this.f817ar += f;
            if (this.f817ar > 260.0f) {
                this.f817ar = 0.0f;
                AbstractC1120w[] m514a = AbstractC0244am.f6962eo.m514a();
                int size = AbstractC1120w.f6962eo.size();
                boolean z = false;
                for (int i = 0; i < AbstractC0197n.f1365c; i++) {
                    AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
                    if (m5017k != null && !m5017k.f1330F) {
                        z = true;
                        for (int i2 = 0; i2 < size; i2++) {
                            AbstractC1120w abstractC1120w = m514a[i2];
                            if (abstractC1120w instanceof AbstractC0623y) {
                                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                                if (abstractC0623y.m4758bI()) {
                                    abstractC0623y.m4654g(m5017k);
                                }
                            }
                        }
                        if (m5017k.f1337M == null) {
                            Core.m998b("fogOfWar_map==null for:" + i);
                        }
                        boolean z2 = false;
                        boolean m5011q = m5017k.m5011q();
                        byte[][] bArr = m5017k.f1337M;
                        byte[][] bArr2 = this.f797N;
                        for (int i3 = 0; i3 < this.f792C; i3++) {
                            for (int i4 = 0; i4 < this.f793D; i4++) {
                                if (bArr[i3][i4] < 5) {
                                    bArr[i3][i4] = 5;
                                    if (m5011q) {
                                        f830al.m5271a(i3, i4, true);
                                        z2 = true;
                                        bArr2[i3][i4] = Byte.MAX_VALUE;
                                    }
                                }
                            }
                        }
                        if (z2) {
                            m1087A.f6121bW.f5320O = true;
                        }
                    }
                }
                for (int i5 = 0; i5 < size; i5++) {
                    AbstractC1120w abstractC1120w2 = m514a[i5];
                    if (abstractC1120w2 instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w2;
                        if (!abstractC0623y2.f1607bT) {
                            abstractC0623y2.m2846c(false);
                        }
                    }
                }
                if (z) {
                    for (int i6 = 0; i6 < size; i6++) {
                        AbstractC1120w abstractC1120w3 = m514a[i6];
                        if (abstractC1120w3 instanceof AbstractC0623y) {
                            AbstractC0623y abstractC0623y3 = (AbstractC0623y) abstractC1120w3;
                            if (abstractC0623y3.m4758bI()) {
                                abstractC0623y3.m4712cV();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m5326a(StreamWriter streamWriter) {
        streamWriter.mo1329a(false);
    }

    /* renamed from: a */
    public void m5325a(Reader reader) {
        if (reader.ReadBool()) {
            int ReadInt = reader.ReadInt();
            int ReadInt2 = reader.ReadInt();
            for (int i = 0; i < ReadInt; i++) {
                for (int i2 = 0; i2 < ReadInt2; i2++) {
                    reader.m1304d();
                }
            }
        }
    }

    /* renamed from: a */
    private InputStream m5318a(String str, String str2, int i) {
        String[] split = str2.split("/");
        if (split.length >= i) {
            String str3 = VariableScope.nullOrMissingString;
            boolean z = true;
            for (int length = split.length - i; length < split.length; length++) {
                if (!z) {
                    str3 = str3 + "/";
                }
                z = false;
                str3 = str3 + split[length];
            }
            return C0750a.m2270i(str + str3);
        }
        return null;
    }

    /* renamed from: d */
    public InputStream m5293d(String str, String str2) {
        C1098j m2270i = C0750a.m2270i(str + str2);
        if (m2270i == null) {
            m2270i = m5318a(str, str2, 3);
        }
        if (m2270i == null) {
            m2270i = m5318a(str, str2, 2);
        }
        if (m2270i == null) {
            m2270i = m5318a(str, str2, 1);
        }
        if (m2270i == null) {
            throw new IOException("File could not be found:" + str + str2);
        }
        return m2270i;
    }

    /* renamed from: a */
    public boolean m5329a(AbstractC0197n abstractC0197n, int i, int i2) {
        if (!this.f843G && this.f841E && abstractC0197n.f1337M != null && m5300c(i, i2) && abstractC0197n.f1337M[i][i2] == 10) {
            return false;
        }
        return true;
    }
}
