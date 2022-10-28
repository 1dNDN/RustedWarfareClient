package com.corrodinggames.rts.game.p010a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a;
import com.corrodinggames.rts.game.p010a.p011a.EnumC0152b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.C0535f;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p014b.C0310c;
import com.corrodinggames.rts.game.units.p024d.C0470a;
import com.corrodinggames.rts.game.units.p024d.C0489e;
import com.corrodinggames.rts.game.units.p024d.C0502m;
import com.corrodinggames.rts.game.units.p024d.C0512t;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.game.units.p029h.C0587e;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.Core;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.game.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a.class */
public final class C0136a extends AbstractC0197n {

    /* renamed from: ar */
    public static boolean f553ar;

    /* renamed from: as */
    final int f554as = 3000;

    /* renamed from: at */
    int f555at;

    /* renamed from: au */
    int f556au;

    /* renamed from: av */
    int f557av;

    /* renamed from: aw */
    int f558aw;

    /* renamed from: ax */
    int f559ax;

    /* renamed from: ay */
    int f560ay;

    /* renamed from: az */
    int f561az;

    /* renamed from: aA */
    int f562aA;

    /* renamed from: aB */
    int f563aB;

    /* renamed from: aC */
    int f564aC;

    /* renamed from: aD */
    int f565aD;

    /* renamed from: aE */
    int f566aE;

    /* renamed from: aF */
    int f567aF;

    /* renamed from: aG */
    int f568aG;

    /* renamed from: aH */
    public int f569aH;

    /* renamed from: aI */
    int f570aI;

    /* renamed from: aJ */
    boolean f571aJ;

    /* renamed from: aK */
    float f572aK;

    /* renamed from: aL */
    float f573aL;

    /* renamed from: aM */
    float f574aM;

    /* renamed from: aN */
    float f575aN;

    /* renamed from: aO */
    float f576aO;

    /* renamed from: aP */
    float f577aP;

    /* renamed from: aQ */
    float f578aQ;

    /* renamed from: aR */
    float f579aR;

    /* renamed from: aS */
    float f580aS;

    /* renamed from: aT */
    float f581aT;

    /* renamed from: aU */
    int f582aU;

    /* renamed from: aV */
    float f583aV;

    /* renamed from: aW */
    public boolean f584aW;

    /* renamed from: aX */
    public boolean f585aX;

    /* renamed from: aY */
    public boolean f586aY;

    /* renamed from: aZ */
    int f587aZ;

    /* renamed from: ba */
    int f588ba;

    /* renamed from: bb */
    int f589bb;

    /* renamed from: bc */
    boolean f590bc;

    /* renamed from: bd */
    boolean f591bd;

    /* renamed from: be */
    boolean f592be;

    /* renamed from: bf */
    C0535f f593bf;

    /* renamed from: bg */
    boolean f594bg;

    /* renamed from: bh */
    boolean f595bh;

    /* renamed from: bi */
    boolean f596bi;

    /* renamed from: bj */
    boolean f597bj;

    /* renamed from: bk */
    int f598bk;

    /* renamed from: bl */
    ConcurrentLinkedQueue f599bl;

    /* renamed from: bm */
    ArrayList f600bm;

    /* renamed from: bn */
    PointF f601bn;

    /* renamed from: bo */
    Paint f602bo;

    /* renamed from: bp */
    ArrayList f603bp;

    /* renamed from: bq */
    AbstractC0159d f604bq;

    /* renamed from: br */
    AbstractC0159d f605br;

    /* renamed from: bs */
    AbstractC0159d f606bs;

    /* renamed from: bt */
    AbstractC0159d f607bt;

    /* renamed from: bu */
    AbstractC0159d f608bu;

    /* renamed from: bv */
    AbstractC0159d f609bv;

    /* renamed from: bw */
    AbstractC0159d f610bw;

    /* renamed from: bx */
    AbstractC0159d f611bx;

    /* renamed from: by */
    AbstractC0159d f612by;

    /* renamed from: bz */
    AbstractC0159d f613bz;

    /* renamed from: bA */
    AbstractC0159d f614bA;

    /* renamed from: bB */
    AbstractC0159d f615bB;

    /* renamed from: bC */
    AbstractC0159d f616bC;

    /* renamed from: bD */
    public C0158c f617bD;

    /* renamed from: bE */
    int f618bE;

    /* renamed from: bF */
    public float f619bF;

    /* renamed from: bG */
    ArrayList f620bG;

    /* renamed from: bJ */
    private static ArrayList f621bJ = new ArrayList();

    /* renamed from: bH */
    public static final C1112u f622bH = new C1112u();

    /* renamed from: bI */
    public final C1101m f623bI;

    /* renamed from: a */
    static /* synthetic */ boolean m5578a(C0136a c0136a, InterfaceC0303as interfaceC0303as) {
        return c0136a.m5568a(interfaceC0303as);
    }

    /* renamed from: Y */
    public boolean m5585Y() {
        return m5555ac() == 3 || m5555ac() > 300;
    }

    /* renamed from: Z */
    public boolean m5584Z() {
        return m5555ac() >= 2;
    }

    /* renamed from: aa */
    public boolean m5557aa() {
        return (1 & this.f570aI) == 1;
    }

    /* renamed from: ab */
    public boolean m5556ab() {
        return m5557aa();
    }

    /* renamed from: ac */
    public int m5555ac() {
        return this.f618bE;
    }

    /* renamed from: ad */
    public boolean m5554ad() {
        if (Core.m1087A().f6119bU.f6019A.f5965i > 3000) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public boolean m5553ae() {
        if (m5554ad() || !this.f594bg || !this.f595bh || !this.f596bi || !this.f597bj) {
            return true;
        }
        return false;
    }

    /* renamed from: af */
    public boolean m5552af() {
        if (this.f597bj && m5553ae() && this.f595bh) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m5581a(float f, float f2, AbstractC0170o abstractC0170o, EnumC0246ao enumC0246ao) {
        if (m5582a(f, f2, abstractC0170o.f761S, abstractC0170o.f762T, enumC0246ao)) {
            return true;
        }
        float f3 = -180.0f;
        while (true) {
            float f4 = f3;
            if (f4 < 180.0f) {
                if (!m5582a(f, f2, abstractC0170o.f761S + (C0758f.m2092i(f4) * abstractC0170o.f763U * 0.4f), abstractC0170o.f762T + (C0758f.m2097h(f4) * abstractC0170o.f763U * 0.4f), enumC0246ao)) {
                    f3 = f4 + 90.0f;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public boolean m5582a(float f, float f2, float f3, float f4, EnumC0246ao enumC0246ao) {
        if (enumC0246ao == EnumC0246ao.f1706d || enumC0246ao == EnumC0246ao.f1703a) {
            return true;
        }
        short m455b = C1117y.m455b(f, f2, enumC0246ao);
        short m455b2 = C1117y.m455b(f3, f4, enumC0246ao);
        if (m455b == -3 || m455b2 == -3) {
            String str = "null";
            if (enumC0246ao != null) {
                str = enumC0246ao.name();
            }
            m5529d("pathPossible: no isolatedGroups found! (" + str + ")");
            Core.m1069S();
        }
        if (m455b != -1 && m455b2 != -1 && m455b != -2 && m455b2 != -2 && m455b == m455b2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m5572a(AbstractC0244am abstractC0244am, float f, float f2) {
        return m5582a(abstractC0244am.f6958el, abstractC0244am.f6959em, f, f2, abstractC0244am.mo3039h());
    }

    /* renamed from: b */
    public boolean m5536b(AbstractC0244am abstractC0244am, float f, float f2) {
        EnumC0246ao mo3039h = abstractC0244am.mo3039h();
        return m5582a(abstractC0244am.f6958el, abstractC0244am.f6959em, f, f2, mo3039h) || m5582a(abstractC0244am.f6958el, abstractC0244am.f6959em, f + 60.0f, f2, mo3039h) || m5582a(abstractC0244am.f6958el, abstractC0244am.f6959em, f - 60.0f, f2, mo3039h) || m5582a(abstractC0244am.f6958el, abstractC0244am.f6959em, f, f2 + 60.0f, mo3039h) || m5582a(abstractC0244am.f6958el, abstractC0244am.f6959em, f, f2 - 60.0f, mo3039h);
    }

    /* renamed from: a */
    public boolean m5570a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        return m5536b(abstractC0244am, abstractC0244am2.f6958el, abstractC0244am2.f6959em);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        int i;
        streamWriter.mo1329a(this.f571aJ);
        streamWriter.mo1335a(this.f572aK);
        streamWriter.mo1335a(this.f573aL);
        streamWriter.mo1335a(this.f574aM);
        streamWriter.mo1335a(this.f575aN);
        streamWriter.mo1335a(this.f580aS);
        streamWriter.WriteInteger(this.f582aU);
        streamWriter.mo1335a(this.f583aV);
        streamWriter.mo1329a(this.f584aW);
        streamWriter.WriteInteger(this.f587aZ);
        streamWriter.WriteInteger(this.f599bl.size());
        Iterator it = this.f599bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                i = 1;
            } else if (abstractC0170o instanceof C0162g) {
                i = 2;
            } else if (abstractC0170o instanceof C0169n) {
                i = 3;
            } else if (abstractC0170o instanceof C0168m) {
                i = 4;
            } else if (abstractC0170o instanceof C0167l) {
                i = 5;
            } else {
                throw new RuntimeException("zone not instance not supported:" + abstractC0170o.getClass().getName());
            }
            streamWriter.m1401c(i);
            streamWriter.WriteInteger(abstractC0170o.f759Q);
        }
        Iterator it2 = this.f599bl.iterator();
        while (it2.hasNext()) {
            AbstractC0170o abstractC0170o2 = (AbstractC0170o) it2.next();
            streamWriter.WriteInteger(abstractC0170o2.f759Q);
            abstractC0170o2.mo2441a(streamWriter);
        }
        streamWriter.m1401c(9);
        streamWriter.WriteInteger(this.f569aH);
        streamWriter.mo1329a(this.f590bc);
        streamWriter.mo1329a(this.f594bg);
        streamWriter.mo1329a(this.f595bh);
        streamWriter.mo1329a(this.f596bi);
        streamWriter.mo1329a(this.f597bj);
        streamWriter.mo1335a(this.f581aT);
        streamWriter.WriteInteger(this.f598bk);
        streamWriter.WriteInteger(this.f555at);
        streamWriter.WriteInteger(this.f556au);
        streamWriter.WriteInteger(this.f557av);
        streamWriter.mo1329a(this.f585aX);
        streamWriter.WriteInteger(this.f570aI);
        streamWriter.m1397e();
        streamWriter.WriteInteger(this.f623bI.f6894a);
        for (int i2 = 0; i2 < this.f623bI.f6894a; i2++) {
            AbstractC0150a abstractC0150a = (AbstractC0150a) this.f623bI.get(i2);
            streamWriter.m1411a(abstractC0150a.mo5493a());
            abstractC0150a.mo5496a(streamWriter);
        }
        streamWriter.m1397e();
        super.mo2441a(streamWriter);
    }

    /* renamed from: l */
    public AbstractC0170o m5516l(int i) {
        if (i == 1) {
            return new C0164i(this, -1.0f, -1.0f);
        }
        if (i == 2) {
            return new C0162g(this);
        }
        if (i == 3) {
            return new C0169n(this);
        }
        if (i == 4) {
            return new C0168m(this);
        }
        if (i == 5) {
            return new C0167l(this);
        }
        if (i == 0) {
            Core.m998b("Found zone type 0, loading PlainZone instead");
            return new C0168m(this);
        }
        throw new RuntimeException("Unknown zone type:" + i);
    }

    /* renamed from: c */
    public void m5532c(Reader reader) {
        AbstractC0170o m5514m;
        this.f571aJ = reader.ReadBool();
        this.f572aK = reader.m1300g();
        this.f573aL = reader.m1300g();
        this.f574aM = reader.m1300g();
        this.f575aN = reader.m1300g();
        this.f580aS = reader.m1300g();
        this.f582aU = reader.ReadInt();
        this.f583aV = reader.m1300g();
        this.f584aW = reader.ReadBool();
        this.f587aZ = reader.ReadInt();
        int ReadInt = reader.ReadInt();
        this.f599bl.clear();
        boolean z = false;
        if (reader.m1310b() >= 20) {
            z = true;
            for (int i = 0; i < ReadInt; i++) {
                m5516l((int) reader.m1304d()).f759Q = reader.ReadInt();
            }
        }
        for (int i2 = 0; i2 < ReadInt; i2++) {
            if (!z) {
                m5514m = m5516l((int) reader.m1304d());
            } else {
                m5514m = m5514m(reader.ReadInt());
            }
            m5514m.m5364a(reader);
        }
        byte m1304d = reader.m1304d();
        if (m1304d >= 1) {
            this.f569aH = reader.ReadInt();
        }
        this.f600bm.clear();
        this.f600bm.addAll(this.f599bl);
        if (m1304d >= 2) {
            this.f590bc = reader.ReadBool();
            this.f594bg = reader.ReadBool();
            this.f595bh = reader.ReadBool();
        }
        if (m1304d >= 3) {
            this.f596bi = reader.ReadBool();
            this.f597bj = reader.ReadBool();
        }
        if (m1304d >= 4) {
            this.f581aT = reader.m1300g();
        }
        if (m1304d >= 5) {
            this.f598bk = reader.ReadInt();
        }
        if (m1304d >= 6) {
            this.f555at = reader.ReadInt();
            this.f556au = reader.ReadInt();
            this.f557av = reader.ReadInt();
        }
        if (m1304d >= 7) {
            this.f585aX = reader.ReadBool();
        }
        if (m1304d >= 8) {
            this.f570aI = reader.ReadInt();
        }
        if (m1304d >= 9) {
            reader.m1314a("ai-c s");
            this.f623bI.clear();
            int ReadInt2 = reader.ReadInt();
            for (int i3 = 0; i3 < ReadInt2; i3++) {
                AbstractC0150a mo5498a = ((EnumC0152b) reader.m1308b(EnumC0152b.class)).mo5498a();
                mo5498a.mo5495a(reader);
                m5579a(mo5498a);
            }
            reader.m1314a("ai-c e");
        }
        super.m5048c(reader);
        m5551ag();
    }

    /* renamed from: m */
    public AbstractC0170o m5514m(int i) {
        Iterator it = this.f599bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o.f759Q == i) {
                return abstractC0170o;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m5575a(AbstractC0170o abstractC0170o) {
        if (abstractC0170o == null) {
            return -1;
        }
        return abstractC0170o.f759Q;
    }

    /* renamed from: ag */
    void m5551ag() {
        this.f560ay = 0;
        this.f563aB = 0;
        this.f564aC = 0;
        this.f565aD = 0;
        this.f561az = 0;
        this.f562aA = 0;
        this.f566aE = 0;
        this.f567aF = 0;
        this.f558aw = 0;
        this.f559ax = 0;
        this.f568aG = 0;
        Iterator it = this.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i = (C0164i) abstractC0170o;
                this.f558aw++;
                if (c0164i.m5383u() >= 2) {
                    this.f559ax++;
                }
                if (c0164i.f702n) {
                    this.f568aG++;
                }
            }
            if (abstractC0170o instanceof C0162g) {
                C0162g c0162g = (C0162g) abstractC0170o;
                if (!c0162g.f656a) {
                    if (c0162g.f663h) {
                        this.f560ay++;
                        if (!c0162g.f677v && !c0162g.m5451d()) {
                            if (!c0162g.f683B) {
                                this.f561az++;
                            } else {
                                this.f562aA++;
                            }
                        }
                    } else {
                        this.f563aB++;
                        if (c0162g.m5451d()) {
                            this.f564aC++;
                        }
                        this.f565aD += c0162g.m5435l();
                    }
                }
            }
            if (abstractC0170o instanceof C0169n) {
                this.f566aE++;
                if (((AbstractC0163h) abstractC0170o).m5435l() > 0) {
                    this.f567aF++;
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m5568a(InterfaceC0303as interfaceC0303as) {
        AbstractC0244am m4763b = AbstractC0244am.m4763b(interfaceC0303as);
        if (!m4763b.m4758bI() && (m4763b instanceof AbstractC0623y) && !m5524g(m4763b) && !m4763b.m4770aj() && ((AbstractC0623y) m4763b).mo3036l()) {
            if (interfaceC0303as instanceof C0453l) {
                C0453l c0453l = (C0453l) interfaceC0303as;
                if (c0453l.f3156fu || !c0453l.f3152fq) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$1.class */
    public class C01371 extends AbstractC0159d {
        C01371(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5512a(InterfaceC0303as interfaceC0303as) {
            return C0136a.m5578a(C0136a.this, interfaceC0303as) && m5476a(interfaceC0303as, EnumC0246ao.f1704b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$6.class */
    public class C01466 extends AbstractC0159d {
        C01466(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5503a(InterfaceC0303as interfaceC0303as) {
            return C0136a.m5578a(C0136a.this, interfaceC0303as) && m5476a(interfaceC0303as, EnumC0246ao.f1708f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$7.class */
    public class C01477 extends AbstractC0159d {
        C01477(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5502a(InterfaceC0303as interfaceC0303as) {
            return C0136a.m5578a(C0136a.this, interfaceC0303as) && m5476a(interfaceC0303as, EnumC0246ao.f1706d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$8.class */
    public class C01488 extends AbstractC0159d {
        C01488(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5501a(InterfaceC0303as interfaceC0303as) {
            return C0136a.m5578a(C0136a.this, interfaceC0303as) && m5476a(interfaceC0303as, EnumC0246ao.f1707e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$9.class */
    public class C01499 extends AbstractC0159d {
        C01499(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5500a(InterfaceC0303as interfaceC0303as) {
            if (AbstractC0244am.m4763b(interfaceC0303as).m4758bI()) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3156fu) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$10.class */
    public class C013810 extends AbstractC0159d {
        C013810(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5511a(InterfaceC0303as interfaceC0303as) {
            if (C0136a.this.m5524g(AbstractC0244am.m4763b(interfaceC0303as))) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3156fu) {
                    return false;
                }
                if (interfaceC0303as.mo4468o() == EnumC0246ao.f1706d || interfaceC0303as.mo4468o() == EnumC0246ao.f1708f || interfaceC0303as.mo4468o() == EnumC0246ao.f1710h) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$11.class */
    public class C013911 extends AbstractC0159d {
        C013911(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5510a(InterfaceC0303as interfaceC0303as) {
            if (C0136a.this.f609bv.m5477a(interfaceC0303as) && interfaceC0303as.mo4468o() == EnumC0246ao.f1706d) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$12 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$12.class */
    public class C014012 extends AbstractC0159d {
        C014012(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5509a(InterfaceC0303as interfaceC0303as) {
            if (C0136a.this.f609bv.m5477a(interfaceC0303as) && interfaceC0303as.mo4468o() != EnumC0246ao.f1706d) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$13 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$13.class */
    public class C014113 extends AbstractC0159d {
        C014113(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5508a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as.mo4470m()) {
                if ((!(interfaceC0303as instanceof C0453l) || !((C0453l) interfaceC0303as).f3156fu) && interfaceC0303as.mo4468o() != EnumC0246ao.f1707e) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$2.class */
    public class C01422 extends AbstractC0159d {
        C01422(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5507a(InterfaceC0303as interfaceC0303as) {
            AbstractC0244am.m4763b(interfaceC0303as);
            if (interfaceC0303as.mo4469n()) {
                if ((!(interfaceC0303as instanceof C0453l) || !((C0453l) interfaceC0303as).f3156fu) && interfaceC0303as.mo4468o() != EnumC0246ao.f1707e) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$3.class */
    public class C01433 extends AbstractC0159d {
        C01433(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5506a(InterfaceC0303as interfaceC0303as) {
            if (AbstractC0244am.m4763b(interfaceC0303as).m4758bI() && interfaceC0303as.mo4467p()) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3156fu) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$4.class */
    public class C01444 extends AbstractC0159d {
        C01444(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5505a(InterfaceC0303as interfaceC0303as) {
            InterfaceC0303as i;
            AbstractC0244am m4763b = AbstractC0244am.m4763b(interfaceC0303as);
            if (m4763b.m4758bI()) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3156fu) {
                    return false;
                }
                boolean z = false;
                Iterator it = m4763b.mo3174N().iterator();
                while (it.hasNext()) {
                    AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                    if (abstractC0224s != null && (abstractC0224s instanceof AbstractC0228w)) {
                        AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
                        if (!abstractC0228w.m4916F() && (i = abstractC0228w.mo6163i()) != null && !i.mo4473j()) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.a.a$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a$5.class */
    public class C01455 extends AbstractC0159d {
        C01455(String str) {
            super(C0136a.this, str);
        }

        /* renamed from: a */
        public boolean m5504a(InterfaceC0303as interfaceC0303as) {
            InterfaceC0303as i;
            AbstractC0244am m4763b = AbstractC0244am.m4763b(interfaceC0303as);
            if (m4763b.m4758bI()) {
                if ((interfaceC0303as instanceof C0453l) && ((C0453l) interfaceC0303as).f3156fu) {
                    return false;
                }
                boolean z = false;
                Iterator it = m4763b.mo3174N().iterator();
                while (it.hasNext()) {
                    AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                    if (abstractC0224s != null && (abstractC0224s instanceof AbstractC0228w)) {
                        AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
                        if (!abstractC0228w.m4916F() && (i = abstractC0228w.mo6163i()) != null && !i.mo4473j() && i.mo4470m()) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public C0136a(int i) {
        this(i, true);
    }

    public C0136a(int i, boolean z) {
        super(i, z);
        this.f554as = 3000;
        this.f570aI = 0;
        this.f578aQ = 0.0f;
        this.f579aR = 0.0f;
        this.f590bc = true;
        this.f591bd = true;
        this.f592be = false;
        this.f599bl = new ConcurrentLinkedQueue();
        this.f600bm = new ArrayList();
        this.f601bn = new PointF();
        this.f603bp = new ArrayList();
        this.f604bq = new C01371("attackingUnitsLand");
        this.f605br = new C01466("attackingUnitsHover");
        this.f606bs = new C01477("attackingUnitsAir");
        this.f607bt = new C01488("attackingUnitsWater");
        this.f608bu = new C01499("buildingUnits");
        this.f609bv = new C013810("transportUnits");
        this.f610bw = new C013911("transportUnitsFlying");
        this.f611bx = new C014012("transportUnitsNonFlying");
        this.f612by = new C014113("builderUnits");
        this.f613bz = new C01422("harvesterUnits");
        this.f614bA = new C01433("extractorUnits");
        this.f615bB = new C01444("buildingFactories");
        this.f616bC = new C01455("buildingFactoriesForBuilders");
        this.f617bD = new C0158c();
        this.f619bF = 0.0f;
        this.f620bG = new ArrayList();
        this.f623bI = new C1101m();
        m5540ar();
    }

    /* renamed from: ar */
    private void m5540ar() {
        Core m1087A = Core.m1087A();
        this.f572aK = 100 + (this.f1306k * 9);
        this.f574aM = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_15 + (this.f1306k * 19);
        this.f576aO = 50 + (this.f1306k * 2);
        this.f583aV = 4200 + (this.f1306k * 5);
        this.f580aS = 3500 + (this.f1306k * 5);
        this.f581aT = 7500 + (this.f1306k * 5);
        this.f602bo = new Paint();
        this.f602bo.m5908b(Color.m5949a(0, 255, 0));
        this.f602bo.m5926a(Paint.Style.f220b);
        this.f602bo.mo5914a(true);
        m1087A.m1050a(this.f602bo, 14.0f);
        m5550ah();
    }

    /* renamed from: ah */
    public void m5550ah() {
        Iterator it = this.f603bp.iterator();
        while (it.hasNext()) {
            ((AbstractC0159d) it.next()).m5475b();
        }
    }

    /* renamed from: d */
    public void m5529d(String str) {
        Core.m997b("ai_debug(" + this.f1306k + ")", str);
    }

    /* renamed from: ai */
    public PointF m5549ai() {
        Core m1087A = Core.m1087A();
        m1087A.f6110bL.m5340a(C0758f.m2203a(0, m1087A.f6110bL.f792C), C0758f.m2203a(0, m1087A.f6110bL.f793D));
        this.f601bn.m5879a(m1087A.f6110bL.f801T, m1087A.f6110bL.f802U);
        return this.f601bn;
    }

    /* renamed from: aj */
    public PointF m5548aj() {
        Core m1087A = Core.m1087A();
        if (m1087A.f6110bL.f838A.size() == 0) {
            return null;
        }
        Point point = (Point) m1087A.f6110bL.f838A.get(C0758f.m2133c(m1087A.f6110bL.f838A.size()));
        m1087A.f6110bL.m5340a(point.f224a, point.f225b);
        this.f601bn.m5879a(m1087A.f6110bL.f801T, m1087A.f6110bL.f802U);
        return this.f601bn;
    }

    /* renamed from: a */
    public PointF m5583a(float f, float f2) {
        Core m1087A = Core.m1087A();
        float f3 = -1.0f;
        PointF pointF = new PointF();
        for (int i = 0; i < m1087A.f6110bL.f838A.size(); i++) {
            Point point = (Point) m1087A.f6110bL.f838A.get(i);
            m1087A.f6110bL.m5340a(point.f224a, point.f225b);
            this.f601bn.m5879a(m1087A.f6110bL.f801T, m1087A.f6110bL.f802U);
            PointF pointF2 = this.f601bn;
            float m2209a = C0758f.m2209a(pointF2.f227a, pointF2.f228b, f, f2);
            if (m2209a < f3 || f3 == -1.0f) {
                f3 = m2209a;
                pointF.m5878a(pointF2);
            }
        }
        if (f3 == -1.0f) {
            return null;
        }
        return pointF;
    }

    /* renamed from: e */
    C0164i m5527e(AbstractC0244am abstractC0244am) {
        Iterator it = this.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i = (C0164i) abstractC0170o;
                if (c0164i.m5363b(abstractC0244am)) {
                    return c0164i;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    C0164i m5539b(float f, float f2) {
        Iterator it = this.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i = (C0164i) abstractC0170o;
                if (c0164i.m5362c(f, f2)) {
                    return c0164i;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    C0164i m5525f(AbstractC0244am abstractC0244am) {
        return m5534c(abstractC0244am.f6958el, abstractC0244am.f6959em);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C0164i m5534c(float f, float f2) {
        float f3 = -1.0f;
        C0164i c0164i = null;
        Iterator it = this.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                float d = c0164i2.m5360d(f, f2);
                if (c0164i == null || d < f3) {
                    f3 = d;
                    c0164i = c0164i2;
                }
            }
        }
        return c0164i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0164i m5569a(EnumC0246ao enumC0246ao, float f, float f2, boolean z) {
        float f3 = -1.0f;
        C0164i c0164i = null;
        Iterator it = this.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                float d = c0164i2.m5360d(f, f2);
                if (m5581a(f, f2, c0164i2, enumC0246ao) && (!z || !c0164i2.f708t)) {
                    if (c0164i == null || d < f3) {
                        f3 = d;
                        c0164i = c0164i2;
                    }
                }
            }
        }
        return c0164i;
    }

    /* renamed from: a */
    public static boolean m5571a(AbstractC0244am abstractC0244am, float f, float f2, float f3) {
        if (C0758f.m2209a(abstractC0244am.f6958el, abstractC0244am.f6959em, f, f2) < f3 * f3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m5580a(PointF pointF) {
        if (m5574a(this, pointF.f227a, pointF.f228b, 290.0f) != null) {
            return false;
        }
        C0164i m5534c = m5534c(pointF.f227a, pointF.f228b);
        if (m5534c != null && m5534c.m5360d(pointF.f227a, pointF.f228b) < 490000.0f) {
            return false;
        }
        PointF m5583a = m5583a(pointF.f227a, pointF.f228b);
        if ((m5583a != null && C0758f.m2209a(pointF.f227a, pointF.f228b, m5583a.f227a, m5583a.f228b) < 160000.0f) || C1117y.m449d(pointF.f227a, pointF.f228b) || C1117y.m449d(pointF.f227a + 60.0f, pointF.f228b) || C1117y.m449d(pointF.f227a, pointF.f228b + 60.0f) || C1117y.m449d(pointF.f227a - 60.0f, pointF.f228b) || C1117y.m449d(pointF.f227a, pointF.f228b + 60.0f)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m5538b(PointF pointF) {
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am.f1609bV != this && (abstractC0244am instanceof C0489e)) {
                if (abstractC0244am.f1609bV.m5054c(this) && m5571a(abstractC0244am, pointF.f227a, pointF.f228b, 300.0f)) {
                    return false;
                }
                if (abstractC0244am.f1609bV.m5042d(this) && m5571a(abstractC0244am, pointF.f227a, pointF.f228b, 320.0f)) {
                    return false;
                }
            }
        }
        if (m5537b(this, pointF.f227a, pointF.f228b, 360.0f) >= 4 || m5573a((AbstractC0197n) this, pointF.f227a, pointF.f228b, 360.0f, true) >= 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int m5576a(AbstractC0159d abstractC0159d, EnumC0157b enumC0157b) {
        int i = 0;
        Iterator it = abstractC0159d.f650c.iterator();
        while (it.hasNext()) {
            i += m5566a(((C0160e) it.next()).f653a, enumC0157b);
        }
        return i;
    }

    /* renamed from: a */
    public int m5566a(InterfaceC0303as interfaceC0303as, EnumC0157b enumC0157b) {
        return m5565a(interfaceC0303as, true, enumC0157b);
    }

    /* renamed from: a */
    public int m5565a(InterfaceC0303as interfaceC0303as, boolean z, EnumC0157b enumC0157b) {
        boolean mo4473j = interfaceC0303as.mo4473j();
        Integer m5483a = this.f617bD.m5483a(mo4473j, interfaceC0303as, z);
        if (m5483a != null) {
            return m5483a.intValue();
        }
        int i = 0;
        if (mo4473j) {
            z = false;
        }
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == this && (enumC0157b == EnumC0157b.f643a || !abstractC0244am.f1599bL)) {
                if (abstractC0244am.f1689dx == interfaceC0303as) {
                    i++;
                }
                if (z && (abstractC0244am instanceof InterfaceC0501l)) {
                    i += ((InterfaceC0501l) abstractC0244am).mo3428h(interfaceC0303as);
                }
            }
        }
        this.f617bD.m5482a(mo4473j, interfaceC0303as, z, Integer.valueOf(i));
        return i;
    }

    /* renamed from: ak */
    public int m5547ak() {
        int i = 0;
        Iterator it = this.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0162g) {
                i += ((C0162g) abstractC0170o).f688G.size();
            }
        }
        return i;
    }

    /* renamed from: g */
    public boolean m5524g(AbstractC0244am abstractC0244am) {
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
            if (abstractC0623y.m4691cq()) {
                InterfaceC0303as r = abstractC0623y.mo1758r();
                if ((r instanceof C0453l) && !((C0453l) r).f3153fr) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m5523h(AbstractC0244am abstractC0244am) {
        if (abstractC0244am instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
            if (!abstractC0623y.m4758bI() && abstractC0623y.mo3036l() && !m5524g(abstractC0623y) && !abstractC0623y.m2917aj()) {
                InterfaceC0303as r = abstractC0623y.mo1758r();
                if ((r instanceof C0453l) && !((C0453l) r).f3152fq) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m5535b(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        if (this.f1344T) {
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.m2910aq() && C0248aq.m4631a(abstractC0623y, abstractC0244am2)) {
                    return true;
                }
                return false;
            }
            return false;
        } else if (m5523h(abstractC0244am) && (abstractC0244am instanceof AbstractC0623y) && C0248aq.m4631a((AbstractC0623y) abstractC0244am, abstractC0244am2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i */
    public void m5522i(float f) {
        String[] split;
        C0169n c0169n;
        String[] split2;
        if (!f553ar || !Core.m1087A().f6231bl || this.f586aY || this.f584aW) {
            return;
        }
        Core m1087A = Core.m1087A();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == this && m1087A.f6250cM.m5870b((int) (abstractC0244am.f6958el - 200.0f), (int) (abstractC0244am.f6959em - 200.0f), (int) (abstractC0244am.f6958el + 200.0f), (int) (abstractC0244am.f6959em + 200.0f))) {
                if (abstractC0244am instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                }
                String str = VariableScope.nullOrMissingString;
                float f2 = (abstractC0244am.f6959em - m1087A.f6145cw) - 60.0f;
                this.f602bo.m5908b(Color.m5949a(0, 255, 0));
                if (abstractC0244am instanceof C0489e) {
                    f2 -= 80.0f;
                    str = ((((((str + "Base ( Team:" + this.f1306k + " )") + "\nuseTransportsOnThisMap: " + m5553ae()) + "\nuseHoverTransportsOnThisMap: " + m5552af()) + "\nattackingCount: " + this.f587aZ) + "\ndefendingCount: " + this.f588ba) + "\nnumOfUnitsNeedingTransport: " + m5547ak()) + "\ntransport: " + this.f567aF;
                    if (m5557aa()) {
                        str = str + "\nTurtling: true";
                    }
                    this.f602bo.m5908b(Color.m5949a(255, 255, 255));
                }
                if (str.length() != 0) {
                    for (String str2 : str.split("\n")) {
                        float f3 = abstractC0244am.f6958el - m1087A.f6144cv;
                        float f4 = f2;
                        float m5886m = (-this.f602bo.m5887l()) + this.f602bo.m5886m();
                        m1087A.f6113bO.mo135k();
                        if (m1087A.f6256cW > 1.0f) {
                            m1087A.m1070R();
                            f3 *= m1087A.f6256cW;
                            f4 *= m1087A.f6256cW;
                            m5886m /= m1087A.f6256cW;
                        }
                        m1087A.f6113bO.mo181a(str2, f3, f4, this.f602bo);
                        m1087A.f6113bO.mo134l();
                        f2 += m5886m;
                    }
                }
            }
        }
        Iterator it = this.f599bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (m1087A.f6250cM.m5870b((int) (abstractC0170o.f761S - abstractC0170o.f763U), (int) (abstractC0170o.f762T - abstractC0170o.f763U), (int) (abstractC0170o.f761S + abstractC0170o.f763U), (int) (abstractC0170o.f762T + abstractC0170o.f763U))) {
                this.f602bo.m5908b(m5112H());
                m1087A.f6113bO.mo223a(abstractC0170o.f761S - m1087A.f6144cv, abstractC0170o.f762T - m1087A.f6145cw, abstractC0170o.f763U + 2.0f, this.f602bo);
                int m5949a = Color.m5949a(0, 255, 0);
                String str3 = VariableScope.nullOrMissingString + "\n" + abstractC0170o.getClass().getSimpleName() + " ( Team:" + this.f1306k + " )";
                float f5 = abstractC0170o.f762T - m1087A.f6145cw;
                if (abstractC0170o instanceof C0164i) {
                    f5 -= 50.0f;
                    C0164i c0164i = (C0164i) abstractC0170o;
                    String str4 = (((str3 + "\nState: " + c0164i.f690b.name() + "(id:" + c0164i.f759Q + ")") + "\nunsafe: " + c0164i.m5399f() + " (" + c0164i.f707s + ")") + "\nunsafeBaseTimer: " + c0164i.f710v) + "\nallowedUnits: " + c0164i.f692d;
                    if (c0164i.f714z != null) {
                        str4 = str4 + "\nlastAttemptedBuilding: " + c0164i.f714z.mo4474i();
                    }
                    if (c0164i.f715A != null) {
                        str4 = str4 + "\nlastAttemptedBuilding-cannotAffordPrice: " + c0164i.f715A.m4107a(false, true, 4, true);
                    }
                    if (c0164i.f716B != null) {
                        str4 = str4 + "\nlastAttemptedBuilding-cannotAffordBy: " + c0164i.f716B.m4107a(false, true, 4, true);
                    }
                    String str5 = ((((str4 + "\nlastAttemptedBuildingCount: " + c0164i.f717C) + "\nlastAttemptedBuildingFailed: " + c0164i.f718D) + "\nlastUnitAttempt: " + c0164i.f719E + " (" + c0164i.f720F + " - " + c0164i.f721G + ")") + "\nbuildBuildingDelay: " + c0164i.f693e) + "\ncredits: " + C0758f.m2138c(this.f1310o) + " (x" + C0758f.m2109f(m5117C()) + ")";
                    if (c0164i.f690b == EnumC0165j.f731a) {
                        str5 = str5 + "\nclaimedBaseTimer: " + c0164i.f700l;
                    }
                    if (c0164i.f699k > 100.0f) {
                        str5 = str5 + "\nabandonedTimer: " + c0164i.f699k;
                    }
                    if (c0164i.f695g > 0.0f) {
                        str5 = str5 + "\nrequestedBuildersDelay: " + c0164i.f695g + " (" + c0164i.f696h + ")";
                    }
                    str3 = (str5 + "\nBuilders: " + c0164i.f724J) + "\nIdle Builders: " + c0164i.f725K;
                }
                if (abstractC0170o instanceof C0162g) {
                    C0162g c0162g = (C0162g) abstractC0170o;
                    if (c0162g.f658c) {
                        str3 = str3 + "\nVIP Mode";
                    }
                    String str6 = (((str3 + "\n" + (c0162g.m5456b() ? "Defensive Type" : "Attack Type")) + "\nUnits: " + c0162g.f687F.size() + " / " + c0162g.f682A) + "\nStagingForAttack: " + c0162g.f672q) + "\nAttackDelay: " + c0162g.f667l;
                    if (c0162g.f676u != 0.0f) {
                        str6 = str6 + "\nStagingTimer: " + c0162g.f676u;
                    }
                    String str7 = str6 + "\nStagingTargetFound: " + c0162g.f673r;
                    if (c0162g.f670o != 0.0f) {
                        str7 = str7 + "\nattackingFor: " + c0162g.f670o;
                    }
                    str3 = str7 + "\ncommonMovement: " + c0162g.m5444i().name();
                    if (c0162g.f683B) {
                        str3 = str3 + " (seaGroup)";
                    }
                    if (c0162g.f688G.size() > 0) {
                        str3 = str3 + "\nunitsNeedingTransport:" + c0162g.f688G.size();
                    }
                    if (c0162g.f657b != null) {
                        str3 = str3 + "\nlast action:" + c0162g.f657b;
                    }
                    if (!c0162g.f677v && !c0162g.f672q) {
                        str3 = str3 + "\nnext move:" + ((int) m5518k(c0162g.f669n)) + "s";
                    }
                }
                if (abstractC0170o instanceof C0169n) {
                    str3 = ((str3 + "\nUnitsWanted: " + c0169n.f751l) + "\nunits: " + c0169n.f687F.size()) + "\nreadyToMoveOut: " + c0169n.f756q;
                    if (((C0169n) abstractC0170o).f752m != null) {
                        str3 = str3 + "\nCurrentlyHelping: " + c0169n.f752m.f759Q;
                    }
                }
                if (abstractC0170o instanceof C0167l) {
                    str3 = str3 + "\nneedsTransportGroup: " + ((C0167l) abstractC0170o).f739a;
                }
                this.f602bo.m5908b(m5112H());
                for (String str8 : str3.split("\n")) {
                    if (!str8.trim().equals(VariableScope.nullOrMissingString)) {
                        float f6 = abstractC0170o.f761S - m1087A.f6144cv;
                        float f7 = f5;
                        float m5886m2 = (-this.f602bo.m5887l()) + this.f602bo.m5886m();
                        m1087A.f6113bO.mo135k();
                        if (m1087A.f6256cW > 1.0f) {
                            m1087A.m1070R();
                            f6 *= m1087A.f6256cW;
                            f7 *= m1087A.f6256cW;
                            m5886m2 /= m1087A.f6256cW;
                        }
                        m1087A.f6113bO.mo181a(str8, f6, f7, this.f602bo);
                        m1087A.f6113bO.mo134l();
                        f5 += m5886m2;
                        this.f602bo.m5908b(m5949a);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public AbstractC0244am m5528e(AbstractC0197n abstractC0197n) {
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am.f1609bV == abstractC0197n && ((abstractC0244am instanceof C0489e) || abstractC0244am.f1602bO)) {
                return abstractC0244am;
            }
        }
        Iterator it2 = AbstractC0244am.f1590bD.iterator();
        while (it2.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it2.next();
            if (abstractC0244am2.f1609bV == abstractC0197n && abstractC0244am2.f1601bN) {
                return abstractC0244am2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo4993a(float f) {
        AbstractC0244am m5528e;
        super.mo4993a(f);
        Core m1087A = Core.m1087A();
        if (this.f584aW || this.f586aY) {
            return;
        }
        if (m1087A.f6122bX.lock1 && (!m1087A.f6122bX.IsServer || m1087A.f6126cb.m2464h())) {
            return;
        }
        if (this.f619bF > 0.0f) {
            this.f619bF -= f;
            return;
        }
        this.f618bE = m5119A();
        if (this.f591bd && m1087A.f6102by > 3000) {
            this.f591bd = false;
            AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
            int i = 0;
            int size = AbstractC0244am.f1590bD.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                AbstractC0244am abstractC0244am = m498a[i];
                if (!(abstractC0244am instanceof C0535f)) {
                    i++;
                } else {
                    m5529d("firstRunDelayed: Found damagingBorder");
                    this.f593bf = (C0535f) abstractC0244am;
                    break;
                }
            }
        }
        if (this.f590bc) {
            this.f590bc = false;
            this.f594bg = true;
            this.f595bh = true;
            this.f596bi = true;
            this.f597bj = true;
            AbstractC0244am m5528e2 = m5528e(this);
            if (m5528e2 == null) {
                m5529d("firstRun: no command center found");
            }
            if (m5528e2 != null) {
                for (int i2 = 0; i2 < AbstractC0197n.f1365c; i2++) {
                    AbstractC0197n m5017k = AbstractC0197n.m5017k(i2);
                    if (m5017k != null && m5017k != this && (m5528e = m5528e(m5017k)) != null) {
                        if (!m5582a(m5528e2.f6958el, m5528e2.f6959em, m5528e.f6958el, m5528e.f6959em, EnumC0246ao.f1704b)) {
                            this.f594bg = false;
                        }
                        if (!m5582a(m5528e2.f6958el, m5528e2.f6959em, m5528e.f6958el, m5528e.f6959em, EnumC0246ao.f1708f)) {
                            this.f595bh = false;
                        }
                    }
                }
                Iterator it = m1087A.f6110bL.f838A.iterator();
                while (it.hasNext()) {
                    PointF m5334a = m1087A.f6110bL.m5334a((Point) it.next());
                    if (!m5582a(m5528e2.f6958el, m5528e2.f6959em, m5334a.f227a, m5334a.f228b + m1087A.f6110bL.f786o, EnumC0246ao.f1704b)) {
                        this.f596bi = false;
                    }
                    if (!m5582a(m5528e2.f6958el, m5528e2.f6959em, m5334a.f227a, m5334a.f228b + m1087A.f6110bL.f786o, EnumC0246ao.f1708f)) {
                        this.f597bj = false;
                    }
                }
            }
        }
        this.f576aO += f;
        this.f577aP += f;
        if (this.f576aO > 25.0f) {
            this.f576aO -= 25.0f;
            if (this.f576aO > 25.0f) {
                this.f576aO = 25.0f;
            }
            if (this.f576aO < -1.0f) {
                this.f576aO = -1.0f;
            }
            Iterator it2 = this.f599bl.iterator();
            while (it2.hasNext()) {
                AbstractC0170o abstractC0170o = (AbstractC0170o) it2.next();
                if (abstractC0170o instanceof C0164i) {
                    ((C0164i) abstractC0170o).f689a += this.f577aP;
                }
            }
            for (int i3 = 0; i3 < 2; i3++) {
                C0164i c0164i = null;
                Iterator it3 = this.f599bl.iterator();
                while (it3.hasNext()) {
                    AbstractC0170o abstractC0170o2 = (AbstractC0170o) it3.next();
                    if (abstractC0170o2 instanceof C0164i) {
                        C0164i c0164i2 = (C0164i) abstractC0170o2;
                        if (c0164i == null || c0164i.f689a < c0164i2.f689a) {
                            c0164i = c0164i2;
                        }
                    }
                }
                if (c0164i == null || c0164i.f689a < 50.0f) {
                    break;
                }
                C0164i c0164i3 = c0164i;
                c0164i3.m5408b(c0164i3.f689a);
                c0164i3.m5402d(c0164i3.f689a);
                c0164i3.f689a = 0.0f;
            }
            this.f577aP = 0.0f;
        }
        this.f572aK += f;
        this.f573aL += f;
        if (this.f572aK > 80.0f) {
            m5513n(this.f573aL);
            this.f572aK -= 80.0f;
            if (this.f572aK > 80.0f) {
                this.f572aK = 80.0f;
            }
            if (this.f572aK < -1.0f) {
                this.f572aK = -1.0f;
            }
            this.f573aL = 0.0f;
        }
        this.f574aM += f;
        this.f575aN += f;
        if (this.f574aM > 250.0f) {
            m5515m(this.f575aN);
            this.f574aM -= 250.0f;
            if (this.f574aM > 250.0f) {
                this.f574aM = 250.0f;
            }
            if (this.f574aM < -1.0f) {
                this.f574aM = -1.0f;
            }
            this.f575aN = 0.0f;
        }
    }

    /* renamed from: j */
    public float m5520j(float f) {
        return (f / 60.0f) * 1000.0f;
    }

    /* renamed from: k */
    public float m5518k(float f) {
        return f / 60.0f;
    }

    /* renamed from: a */
    public void m5561a(AbstractC0623y abstractC0623y, C0208c c0208c) {
        C0749e m2422a = Core.m1087A().f6130cf.m2422a(this);
        m2422a.m2319a(abstractC0623y);
        m2422a.m2324a(c0208c);
    }

    /* renamed from: l */
    public void m5517l(float f) {
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am.f1609bV == this && (abstractC0244am instanceof AbstractC0623y) && m5521i(abstractC0244am)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y instanceof C0587e) {
                    boolean z = false;
                    AbstractC0244am m2925ab = abstractC0623y.m2925ab();
                    if (m2925ab != null && abstractC0623y.m2826h(m2925ab)) {
                        z = !m2925ab.m4727cG();
                    }
                    boolean z2 = !abstractC0623y.mo3054Q();
                    if (z && z != z2) {
                        m5561a(abstractC0623y, C0587e.f3842j.m4910N());
                    }
                    if (!z && z != z2) {
                        m5561a(abstractC0623y, C0587e.f3843k.m4910N());
                    }
                }
                if (abstractC0623y instanceof C0310c) {
                    boolean z3 = true;
                    AbstractC0244am m2925ab2 = abstractC0623y.m2925ab();
                    if (m2925ab2 != null && abstractC0623y.m2826h(m2925ab2)) {
                        z3 = !m2925ab2.mo3054Q();
                    }
                    boolean z4 = !abstractC0623y.mo3054Q();
                    if (z3 && z3 != z4) {
                        m5561a(abstractC0623y, C0310c.f1865y.m4910N());
                    }
                    if (!z3 && z3 != z4) {
                        m5561a(abstractC0623y, C0310c.f1866z.m4910N());
                    }
                }
                if (abstractC0623y.m2874be() == EnumC0307b.f1832d && abstractC0623y.m2910aq() && abstractC0623y.m2925ab() != null) {
                    C0749e m2422a = Core.m1087A().f6130cf.m2422a(this);
                    m2422a.m2319a(abstractC0623y);
                    m2422a.m2321a(abstractC0623y.m2925ab());
                }
            }
        }
    }

    /* renamed from: c */
    public EnumC0205a m5533c(AbstractC0623y abstractC0623y) {
        if (abstractC0623y.m2935aS()) {
            boolean z = true;
            if (abstractC0623y.m2917aj()) {
                z = false;
            }
            if (m5524g(abstractC0623y)) {
                z = false;
            }
            if (z) {
                if (this.f585aX) {
                    return EnumC0205a.f1423f;
                }
                return EnumC0205a.f1418a;
            }
        }
        return EnumC0205a.f1419b;
    }

    /* renamed from: al */
    public ArrayList m5546al() {
        f621bJ.clear();
        return f621bJ;
    }

    /* renamed from: d */
    public void m5530d(AbstractC0623y abstractC0623y) {
        Iterator it = this.f623bI.iterator();
        while (it.hasNext()) {
            ((AbstractC0150a) it.next()).mo5497a(this, abstractC0623y);
        }
    }

    /* renamed from: e */
    public void m5526e(AbstractC0623y abstractC0623y) {
        Iterator it = this.f623bI.iterator();
        while (it.hasNext()) {
            ((AbstractC0150a) it.next()).mo5494b(this, abstractC0623y);
        }
    }

    /* renamed from: m */
    public void m5515m(float f) {
        boolean z;
        AbstractC0244am m5544an;
        Core m1087A = Core.m1087A();
        this.f617bD.m5481b();
        Iterator it = this.f623bI.iterator();
        while (it.hasNext()) {
            ((AbstractC0150a) it.next()).mo5491b(m5520j(f), this);
        }
        int i = 0;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == this && !abstractC0244am.mo1756u()) {
                i++;
                if (abstractC0244am instanceof AbstractC0623y) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                    if (!abstractC0623y.f1589bC) {
                        abstractC0623y.f1589bC = true;
                        m5530d(abstractC0623y);
                    }
                    if (abstractC0244am.f1651cL == null) {
                        C0164i c0164i = abstractC0623y.f3948aB;
                        abstractC0623y.f3948aB = m5525f(abstractC0623y);
                        if (abstractC0623y.f3948aB != null && c0164i != abstractC0623y.f3948aB) {
                            if (abstractC0623y.m4758bI()) {
                                abstractC0623y.f3949aC = m5582a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0623y.f3948aB.f761S, abstractC0623y.f3948aB.f762T, EnumC0246ao.f1704b);
                                if (!abstractC0623y.f3949aC && abstractC0623y.mo1758r().mo4467p()) {
                                    abstractC0623y.f3949aC = m5582a(abstractC0244am.f6958el, abstractC0244am.f6959em + 15.0f, abstractC0623y.f3948aB.f761S, abstractC0623y.f3948aB.f762T, EnumC0246ao.f1704b);
                                }
                            } else {
                                abstractC0623y.f3949aC = m5582a(abstractC0244am.f6958el, abstractC0244am.f6959em, abstractC0623y.f3948aB.f761S, abstractC0623y.f3948aB.f762T, EnumC0246ao.f1704b);
                            }
                        }
                    }
                }
            }
        }
        m5517l(f);
        Iterator it2 = AbstractC0244am.f1590bD.iterator();
        while (it2.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it2.next();
            if (abstractC0244am2.f1609bV == this && (abstractC0244am2 instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am2;
                EnumC0205a m5533c = m5533c(abstractC0623y2);
                if (abstractC0623y2.f3894O != m5533c && m5521i(abstractC0623y2)) {
                    C0749e m2422a = m1087A.f6130cf.m2422a(this);
                    m2422a.m2319a(abstractC0623y2);
                    m2422a.m2322a(m5533c);
                }
                if (abstractC0623y2.m2917aj() && abstractC0623y2.mo3327db() && abstractC0623y2.f3947aA == null && m5521i(abstractC0623y2)) {
                    C0162g.m5463a(this, abstractC0623y2);
                }
            }
        }
        if (i == 0 && !this.f1344T) {
            this.f586aY = true;
        }
        this.f581aT = C0758f.m2211a(this.f581aT, f);
        this.f580aS = C0758f.m2211a(this.f580aS, f);
        if (m5585Y()) {
            this.f580aS = C0758f.m2211a(this.f580aS, 4.0f * f);
        }
        if (this.f580aS == 0.0f) {
            int i3 = 0;
            Iterator it3 = this.f600bm.iterator();
            while (it3.hasNext()) {
                AbstractC0170o abstractC0170o = (AbstractC0170o) it3.next();
                if ((abstractC0170o instanceof C0164i) && ((C0164i) abstractC0170o).f690b == EnumC0165j.f731a) {
                    i3++;
                }
            }
            boolean z2 = false;
            if (i3 > 2) {
                z2 = true;
            }
            if (z2) {
                this.f580aS = 300.0f;
            } else {
                PointF m5548aj = m5548aj();
                if (m5548aj != null) {
                    m5548aj.f228b += m1087A.f6110bL.f786o;
                    if (m5539b(m5548aj.f227a, m5548aj.f228b) == null && m5538b(m5548aj)) {
                        this.f580aS = 2000.0f;
                        C0164i c0164i2 = new C0164i(this, m5548aj.f227a, m5548aj.f228b);
                        c0164i2.f763U = 360.0f;
                        c0164i2.f690b = EnumC0165j.f731a;
                        c0164i2.f691c = EnumC0166k.f736b;
                        this.f557av++;
                    }
                }
            }
        }
        if (this.f581aT == 0.0f) {
            this.f581aT = 100.0f;
            int i4 = 0;
            Iterator it4 = this.f600bm.iterator();
            while (it4.hasNext()) {
                AbstractC0170o abstractC0170o2 = (AbstractC0170o) it4.next();
                if ((abstractC0170o2 instanceof C0164i) && ((C0164i) abstractC0170o2).f691c == EnumC0166k.f737c) {
                    i4++;
                }
            }
            if (i4 < 3 && (m5544an = m5544an()) != null) {
                PointF pointF = new PointF();
                pointF.f227a = m5544an.f6958el;
                pointF.f228b = m5544an.f6959em;
                if (pointF != null && m5539b(pointF.f227a, pointF.f228b) == null && m5580a(pointF)) {
                    this.f581aT = 5000.0f;
                    C0164i c0164i3 = new C0164i(this, pointF.f227a, pointF.f228b);
                    c0164i3.f763U = 310.0f;
                    c0164i3.f690b = EnumC0165j.f731a;
                    c0164i3.f691c = EnumC0166k.f737c;
                    this.f557av++;
                }
            }
        }
        this.f589bb = 0;
        this.f587aZ = 0;
        this.f588ba = 0;
        AbstractC0244am[] m498a2 = AbstractC0244am.f1590bD.m498a();
        int size2 = AbstractC0244am.f1590bD.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AbstractC0244am abstractC0244am3 = m498a2[i5];
            if (abstractC0244am3.f1609bV == this && (abstractC0244am3 instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) abstractC0244am3;
                if (!abstractC0244am3.m4758bI()) {
                    if (abstractC0623y3.f3947aA != null && abstractC0623y3.f3947aA.m5439b()) {
                        this.f588ba++;
                    } else if (m5523h(abstractC0623y3) && !abstractC0623y3.f1599bL) {
                        if (abstractC0623y3.mo3039h() == EnumC0246ao.f1707e) {
                            this.f589bb++;
                        } else {
                            this.f587aZ++;
                        }
                    }
                }
            }
        }
        this.f578aQ = C0758f.m2211a(this.f578aQ, f);
        this.f579aR += f;
        if (this.f578aQ == 0.0f) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            Iterator it5 = AbstractC0244am.f1590bD.iterator();
            while (it5.hasNext()) {
                AbstractC0244am abstractC0244am4 = (AbstractC0244am) it5.next();
                if (abstractC0244am4.f1609bV == this && abstractC0244am4.m4751bS()) {
                    if (((abstractC0244am4 instanceof C0502m) || (abstractC0244am4 instanceof C0470a) || (abstractC0244am4 instanceof C0512t)) && (abstractC0244am4 instanceof C0470a)) {
                        i7++;
                        if (((C0470a) abstractC0244am4).m3631V() > 1) {
                            i6++;
                        }
                    }
                    if (abstractC0244am4.mo1758r().mo4467p()) {
                        i8++;
                        if (AbstractC0224s.m4896c(abstractC0244am4.m4696cl())) {
                            i9++;
                        }
                    }
                }
            }
            if (m5094a(4100.0d) || this.f579aR > 2400.0f || this.f568aG == 0) {
                Iterator it6 = AbstractC0244am.f1590bD.iterator();
                while (it6.hasNext()) {
                    AbstractC0244am abstractC0244am5 = (AbstractC0244am) it6.next();
                    if (abstractC0244am5.f1609bV == this && (abstractC0244am5 instanceof AbstractC0623y)) {
                        AbstractC0623y abstractC0623y4 = (AbstractC0623y) abstractC0244am5;
                        if (abstractC0623y4.m4697ck()) {
                            ArrayList N = abstractC0623y4.mo3174N();
                            ArrayList m5546al = m5546al();
                            Iterator it7 = N.iterator();
                            while (it7.hasNext()) {
                                AbstractC0224s abstractC0224s = (AbstractC0224s) it7.next();
                                if (abstractC0224s.m4878n(abstractC0623y4)) {
                                    m5546al.add(abstractC0224s);
                                }
                            }
                            if (m5546al.size() > 0) {
                                m5560a(abstractC0623y4, (AbstractC0224s) C0161f.m5468a(m5546al));
                            }
                        }
                    }
                }
                boolean z3 = false;
                if (m5094a(30000.0d)) {
                    z3 = true;
                }
                Iterator it8 = AbstractC0244am.f1590bD.iterator();
                while (it8.hasNext()) {
                    AbstractC0244am abstractC0244am6 = (AbstractC0244am) it8.next();
                    if (abstractC0244am6.f1609bV == this && (abstractC0244am6 instanceof AbstractC0623y)) {
                        AbstractC0623y abstractC0623y5 = (AbstractC0623y) abstractC0244am6;
                        C0208c cl = abstractC0623y5.m4696cl();
                        if (AbstractC0224s.m4896c(cl)) {
                            float cm = abstractC0623y5.m4695cm();
                            if (cm < 0.0f) {
                                cm = 6.0f;
                                z = false;
                            } else {
                                z = true;
                            }
                            if (cm == 0.0f) {
                                continue;
                            } else {
                                int m2133c = C0758f.m2133c(100);
                                float f2 = 100.0f - cm;
                                if (z3) {
                                    f2 -= 4.0f;
                                }
                                if (!z) {
                                    if (abstractC0244am6.mo1758r().mo4467p() && i9 > 0) {
                                        f2 = 50.0f;
                                    }
                                    if (i7 > 0 && i6 == 0) {
                                        f2 = 99.0f;
                                        if (abstractC0244am6 instanceof C0470a) {
                                            f2 = 40.0f;
                                        }
                                    }
                                }
                                if (f2 < 10.0f) {
                                    f2 = 10.0f;
                                }
                                if (((float) m2133c) > f2) {
                                    if (abstractC0623y5.m4694cn()) {
                                    }
                                    if (C0758f.m2133c(100) > 50) {
                                        abstractC0623y5.m4775a(this.f620bG);
                                        if (this.f620bG.size() != 0) {
                                            cl = (C0208c) this.f620bG.get(new Random().nextInt(this.f620bG.size()));
                                        }
                                    }
                                    boolean z4 = false;
                                    AbstractC0224s a = abstractC0623y5.m4788a(cl);
                                    if (a != null) {
                                        if (a.m4879m(abstractC0623y5)) {
                                            z4 = true;
                                        }
                                        if (a.mo3081e() == EnumC0226u.f1481g) {
                                            z4 = true;
                                        }
                                        if (!a.mo3084b(abstractC0623y5)) {
                                            z4 = true;
                                        }
                                        if (!a.mo3086a((AbstractC0244am) abstractC0623y5, false)) {
                                            z4 = true;
                                        }
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        m5561a(abstractC0623y5, cl);
                                        m5558a(abstractC0623y5, a.mo4866B(), true);
                                        this.f578aQ = 900.0f;
                                        this.f579aR = 0.0f;
                                        if (!z3) {
                                            break;
                                        } else if (m5094a(40000.0d)) {
                                            if (C0758f.m2133c(100) > 95) {
                                                break;
                                            }
                                        } else if (C0758f.m2133c(100) > 80) {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        Iterator it9 = this.f599bl.iterator();
        while (it9.hasNext()) {
            AbstractC0170o abstractC0170o3 = (AbstractC0170o) it9.next();
            if (abstractC0170o3 instanceof AbstractC0163h) {
                ((AbstractC0163h) abstractC0170o3).m5438b(f);
            }
        }
    }

    /* renamed from: a */
    public boolean m5560a(AbstractC0623y abstractC0623y, AbstractC0224s abstractC0224s) {
        Core m1087A = Core.m1087A();
        if (abstractC0224s.mo3084b(abstractC0623y) && abstractC0224s.mo3086a((AbstractC0244am) abstractC0623y, false)) {
            C0749e m2422a = m1087A.f6130cf.m2422a(this);
            m2422a.m2319a(abstractC0623y);
            m2422a.m2324a(abstractC0224s.m4867z());
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m5559a(AbstractC0623y abstractC0623y, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am) {
        Core m1087A = Core.m1087A();
        if (abstractC0224s.mo3084b(abstractC0623y) && abstractC0224s.mo3086a((AbstractC0244am) abstractC0623y, false)) {
            C0749e m2422a = m1087A.f6130cf.m2422a(this);
            m2422a.m2319a(abstractC0623y);
            m2422a.m2323a(abstractC0224s.m4867z(), pointF, abstractC0244am);
            return true;
        }
        return false;
    }

    /* renamed from: am */
    public void m5545am() {
        Iterator it = this.f599bl.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                ((C0164i) abstractC0170o).m5384t();
            }
        }
        Iterator it2 = this.f599bl.iterator();
        while (it2.hasNext()) {
            AbstractC0170o abstractC0170o2 = (AbstractC0170o) it2.next();
            Iterator it3 = this.f599bl.iterator();
            while (it3.hasNext()) {
                AbstractC0170o abstractC0170o3 = (AbstractC0170o) it3.next();
                if (abstractC0170o2 != abstractC0170o3 && abstractC0170o2.f759Q == abstractC0170o3.f759Q) {
                    Core.m1046a("Id overlap on:" + abstractC0170o2.f759Q);
                    Core.m1046a("zone x:" + abstractC0170o2.f761S);
                    Core.m1046a("zone y:" + abstractC0170o2.f762T);
                    Core.m1046a("zone radius:" + abstractC0170o2.f763U);
                    Core.m1046a("zone type:" + abstractC0170o2.getClass().getName());
                }
            }
        }
        int i = 0;
        Iterator it4 = this.f599bl.iterator();
        while (it4.hasNext()) {
            if (((AbstractC0170o) it4.next()) instanceof C0164i) {
                i++;
            }
        }
        int i2 = 0;
        Iterator it5 = this.f599bl.iterator();
        while (it5.hasNext()) {
            AbstractC0170o abstractC0170o4 = (AbstractC0170o) it5.next();
            if (abstractC0170o4 instanceof C0164i) {
                Iterator it6 = this.f599bl.iterator();
                while (it6.hasNext()) {
                    AbstractC0170o abstractC0170o5 = (AbstractC0170o) it6.next();
                    if ((abstractC0170o5 instanceof C0164i) && abstractC0170o4 != abstractC0170o5 && C0758f.m2209a(abstractC0170o4.f761S, abstractC0170o4.f762T, abstractC0170o5.f761S, abstractC0170o5.f762T) < 400.0f) {
                        i2++;
                    }
                }
            }
        }
        if (i2 > 0) {
            m5529d("baseOverlapCount:" + i2);
        }
    }

    /* renamed from: a */
    public void m5562a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y.f1609bV == this) {
            this.f617bD.m5484a(abstractC0623y);
        }
    }

    /* renamed from: n */
    public void m5513n(float f) {
        int i;
        C0305au m2909ar;
        C0164i m5525f;
        Core m1087A = Core.m1087A();
        this.f617bD.m5486a();
        Iterator it = this.f623bI.iterator();
        while (it.hasNext()) {
            ((AbstractC0150a) it.next()).m5499a(m5520j(f), this);
        }
        Iterator it2 = this.f599bl.iterator();
        while (it2.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it2.next();
            if (abstractC0170o instanceof AbstractC0163h) {
                ((AbstractC0163h) abstractC0170o).m5436c(f);
            }
        }
        if (this.f593bf != null) {
            Iterator it3 = this.f599bl.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AbstractC0170o abstractC0170o2 = (AbstractC0170o) it3.next();
                if (this.f593bf.m3276a(abstractC0170o2.f761S, abstractC0170o2.f762T)) {
                    if (abstractC0170o2 instanceof C0164i) {
                        abstractC0170o2.m5358p();
                        break;
                    } else if (abstractC0170o2 instanceof C0162g) {
                        PointF m3275a = this.f593bf.m3275a(abstractC0170o2.f761S, abstractC0170o2.f762T, abstractC0170o2.f763U + 20.0f);
                        abstractC0170o2.f761S = m3275a.f227a;
                        abstractC0170o2.f762T = m3275a.f228b;
                    }
                }
            }
        }
        this.f583aV = C0758f.m2211a(this.f583aV, f);
        int i2 = 0;
        Iterator it4 = this.f600bm.iterator();
        while (it4.hasNext()) {
            if (((AbstractC0170o) it4.next()) instanceof C0164i) {
                i2++;
            }
        }
        if (i2 < 1) {
            Iterator it5 = AbstractC0244am.f1590bD.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                AbstractC0244am abstractC0244am = (AbstractC0244am) it5.next();
                if (abstractC0244am.f1609bV == this && (abstractC0244am instanceof C0489e)) {
                    C0164i c0164i = new C0164i(this, abstractC0244am.f6958el, abstractC0244am.f6959em);
                    c0164i.f763U = 420.0f;
                    c0164i.f690b = EnumC0165j.f733c;
                    c0164i.f691c = EnumC0166k.f735a;
                    i2++;
                    break;
                }
            }
            if (i2 < 1) {
                Iterator it6 = AbstractC0244am.f1590bD.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it6.next();
                    if (abstractC0244am2.f1609bV == this && this.f612by.m5474b(abstractC0244am2.mo1758r())) {
                        C0164i c0164i2 = new C0164i(this, abstractC0244am2.f6958el, abstractC0244am2.f6959em);
                        c0164i2.f763U = 420.0f;
                        c0164i2.f690b = EnumC0165j.f733c;
                        c0164i2.f691c = EnumC0166k.f735a;
                        i2++;
                        break;
                    }
                }
            }
            if (i2 < 1) {
                Iterator it7 = AbstractC0244am.f1590bD.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    AbstractC0244am abstractC0244am3 = (AbstractC0244am) it7.next();
                    if (abstractC0244am3.f1609bV == this && (abstractC0244am3 instanceof AbstractC0623y)) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am3;
                        boolean z = false;
                        Iterator it8 = this.f612by.f650c.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                if (abstractC0623y.m2890b(((C0160e) it8.next()).f653a, true)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            C0164i c0164i3 = new C0164i(this, abstractC0244am3.f6958el, abstractC0244am3.f6959em);
                            c0164i3.f763U = 420.0f;
                            c0164i3.f690b = EnumC0165j.f733c;
                            c0164i3.f691c = EnumC0166k.f735a;
                            i2++;
                            break;
                        }
                    }
                }
            }
            if (i2 < 1) {
                Iterator it9 = AbstractC0244am.f1590bD.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    AbstractC0244am abstractC0244am4 = (AbstractC0244am) it9.next();
                    if (abstractC0244am4.f1609bV == this && (abstractC0244am4 instanceof AbstractC0623y) && ((AbstractC0623y) abstractC0244am4).m2918ai()) {
                        C0164i c0164i4 = new C0164i(this, abstractC0244am4.f6958el, abstractC0244am4.f6959em);
                        c0164i4.f763U = 420.0f;
                        c0164i4.f690b = EnumC0165j.f733c;
                        c0164i4.f691c = EnumC0166k.f735a;
                        int i3 = i2 + 1;
                        break;
                    }
                }
            }
            if (!this.f592be) {
                this.f592be = true;
                if (m5576a(this.f614bA, EnumC0157b.f643a) >= 1) {
                    for (int i4 = 0; i4 < m1087A.f6110bL.f838A.size(); i4++) {
                        Point point = (Point) m1087A.f6110bL.f838A.get(i4);
                        m1087A.f6110bL.m5340a(point.f224a, point.f225b);
                        this.f601bn.m5879a(m1087A.f6110bL.f801T, m1087A.f6110bL.f802U);
                        PointF pointF = this.f601bn;
                        pointF.f228b += m1087A.f6110bL.f786o;
                        if (m5539b(pointF.f227a, pointF.f228b) == null && m5577a(this.f614bA, pointF.f227a, pointF.f228b, 200) >= 1 && m5538b(pointF)) {
                            C0164i c0164i5 = new C0164i(this, pointF.f227a, pointF.f228b);
                            c0164i5.f763U = 360.0f;
                            c0164i5.f690b = EnumC0165j.f731a;
                            c0164i5.f691c = EnumC0166k.f736b;
                        }
                    }
                }
            }
        }
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC0244am abstractC0244am5 = m498a[i5];
            if (abstractC0244am5.f1609bV == this && abstractC0244am5.f1651cL == null && (abstractC0244am5 instanceof AbstractC0623y) && abstractC0244am5.m4770aj() && m5521i(abstractC0244am5)) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am5;
                if (m5527e((AbstractC0244am) abstractC0623y2) != null) {
                    if (abstractC0623y2.m2910aq()) {
                    }
                } else if (abstractC0623y2.m2910aq() && (m5525f = m5525f(abstractC0623y2)) != null) {
                    PointF w = m5525f.m5357w();
                    C0749e m2422a = m1087A.f6130cf.m2422a(this);
                    m2422a.m2319a(abstractC0623y2);
                    m2422a.m2329a(w.f227a, w.f228b);
                }
            }
        }
        int size2 = AbstractC0244am.f1590bD.size();
        for (int i6 = 0; i6 < size2; i6++) {
            AbstractC0244am abstractC0244am6 = m498a[i6];
            if (abstractC0244am6.f1609bV == this && (abstractC0244am6 instanceof AbstractC0623y)) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) abstractC0244am6;
                if (abstractC0623y3.f3902U > 2400.0f && m5521i(abstractC0623y3)) {
                    if (!abstractC0623y3.f3966aM || abstractC0623y3.f3902U >= 24000.0f) {
                        C0749e m2422a2 = m1087A.f6130cf.m2422a(this);
                        m2422a2.m2319a(abstractC0623y3);
                        m2422a2.m2302h();
                    }
                }
                if (abstractC0623y3.m2917aj() && m5521i(abstractC0623y3) && (m2909ar = abstractC0623y3.m2909ar()) != null && m2909ar.m4444d() == EnumC0306av.f1813c && abstractC0623y3.f3902U > 700.0f) {
                    C0749e m2422a3 = m1087A.f6130cf.m2422a(this);
                    m2422a3.m2319a(abstractC0623y3);
                    m2422a3.m2302h();
                }
            }
        }
        if (!this.f1344T) {
            m5551ag();
            int i7 = 1;
            boolean z2 = true;
            if (m5556ab()) {
                i7 = 1 + 1;
                z2 = false;
            }
            if (this.f559ax > 6) {
                i7 = 2;
            }
            if (this.f559ax > 11) {
                i7 = 3;
            }
            if (this.f563aB < i7) {
                C0162g c0162g = new C0162g(this, false);
                c0162g.f682A = 8;
                if (m5585Y()) {
                    c0162g.f682A = 10;
                }
                c0162g.m5442k();
                this.f556au++;
            }
            if ((this.f564aC >= i7 || this.f565aD > 6) && this.f561az < 1 && z2) {
                C0162g c0162g2 = new C0162g(this, true);
                if (this.f555at < 2) {
                    c0162g2.f682A = 3;
                } else if (this.f555at < 5) {
                    c0162g2.f682A = 5;
                } else {
                    c0162g2.f682A = 7;
                    if (m5585Y()) {
                        if (this.f555at < 25) {
                            c0162g2.f682A = 14;
                        } else {
                            c0162g2.f682A = 18;
                        }
                    }
                }
                c0162g2.m5442k();
                this.f555at++;
            }
            if (m5554ad() && this.f562aA < 1 && z2) {
                C0162g c0162g3 = new C0162g(this, true);
                c0162g3.f683B = true;
                c0162g3.f682A = 5;
                if (m5585Y()) {
                    c0162g3.f682A = 10;
                }
                c0162g3.m5442k();
            }
            if (m5553ae() && this.f566aE < 3) {
                C0169n c0169n = new C0169n(this);
                c0169n.f751l = 1;
                c0169n.m5367f();
            }
        }
        if (this.f1344T) {
            if (this.f583aV > 30.0f) {
                this.f583aV = 30.0f;
            }
            if (this.f583aV == 0.0f) {
                this.f582aU++;
                if (this.f582aU == 1) {
                    this.f583aV = 1000.0f;
                } else if (this.f582aU == 2) {
                    this.f583aV = 3000.0f;
                    AbstractC0244am m5543ao = m5543ao();
                    if (m5543ao != null) {
                        if (this.f1344T) {
                            i = 0;
                        } else {
                            i = 2;
                            if (this.f587aZ < 4) {
                                i = 5;
                            }
                        }
                        C0749e m2422a4 = m1087A.f6130cf.m2422a(this);
                        int size3 = AbstractC0244am.f1590bD.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            AbstractC0244am abstractC0244am7 = m498a[i8];
                            if (abstractC0244am7.f1609bV == this && (abstractC0244am7 instanceof AbstractC0623y)) {
                                AbstractC0623y abstractC0623y4 = (AbstractC0623y) abstractC0244am7;
                                if (!abstractC0623y4.f1599bL && m5535b(abstractC0623y4, m5543ao)) {
                                    if (i <= 0) {
                                        m2422a4.m2319a(abstractC0623y4);
                                    } else {
                                        i--;
                                    }
                                }
                            }
                        }
                        m2422a4.m2314b(m5543ao.f6958el, m5543ao.f6959em);
                    }
                } else {
                    this.f582aU = 0;
                }
            }
        }
    }

    /* renamed from: i */
    public boolean m5521i(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo1756u() || abstractC0244am.mo1757t() || abstractC0244am.m4713cU() || abstractC0244am.f1600bM) {
            return false;
        }
        return true;
    }

    /* renamed from: an */
    public AbstractC0244am m5544an() {
        AbstractC0244am abstractC0244am = null;
        int i = 0;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am2 = m498a[i2];
            if (!abstractC0244am2.f1607bT && abstractC0244am2.f1651cL == null && this == abstractC0244am2.f1609bV && m5523h(abstractC0244am2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0244am abstractC0244am3 = (AbstractC0244am) it.next();
            if (!abstractC0244am3.f1607bT && abstractC0244am3.f1651cL == null && this == abstractC0244am3.f1609bV && m5523h(abstractC0244am3)) {
                if (i3 == random) {
                    abstractC0244am = abstractC0244am3;
                    break;
                }
                i3++;
            }
        }
        return abstractC0244am;
    }

    /* renamed from: ao */
    public AbstractC0244am m5543ao() {
        AbstractC0244am abstractC0244am = null;
        int i = 0;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am2 = m498a[i2];
            if (!abstractC0244am2.f1607bT && abstractC0244am2.f1651cL == null && !abstractC0244am2.mo1756u() && m5054c(abstractC0244am2.f1609bV) && m5519j(abstractC0244am2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0244am abstractC0244am3 = (AbstractC0244am) it.next();
            if (!abstractC0244am3.f1607bT && abstractC0244am3.f1651cL == null && !abstractC0244am3.mo1756u() && m5054c(abstractC0244am3.f1609bV) && m5519j(abstractC0244am3)) {
                if (i3 == random) {
                    abstractC0244am = abstractC0244am3;
                    break;
                }
                i3++;
            }
        }
        return abstractC0244am;
    }

    /* renamed from: ap */
    public PointF m5542ap() {
        AbstractC0244am abstractC0244am = null;
        int i = 0;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am2 = m498a[i2];
            if (!abstractC0244am2.f1607bT && abstractC0244am2.f1651cL == null && !abstractC0244am2.mo1756u() && m5054c(abstractC0244am2.f1609bV) && m5519j(abstractC0244am2)) {
                i++;
            }
        }
        int random = (int) (Math.random() * i);
        int i3 = 0;
        Iterator it = AbstractC0244am.f1590bD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0244am abstractC0244am3 = (AbstractC0244am) it.next();
            if (!abstractC0244am3.f1607bT && abstractC0244am3.f1651cL == null && !abstractC0244am3.mo1756u() && m5054c(abstractC0244am3.f1609bV) && m5519j(abstractC0244am3)) {
                if (i3 == random) {
                    abstractC0244am = abstractC0244am3;
                    break;
                }
                i3++;
            }
        }
        if (abstractC0244am != null) {
            return new PointF(abstractC0244am.f6958el, abstractC0244am.f6959em);
        }
        return null;
    }

    /* renamed from: a */
    public static AbstractC0244am m5574a(AbstractC0197n abstractC0197n, float f, float f2, float f3) {
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f6958el + f3 > f && abstractC0244am.f6958el - f3 < f && abstractC0244am.f6959em + f3 > f2 && abstractC0244am.f6959em - f3 < f2 && abstractC0244am.f1609bV != abstractC0197n && m5571a(abstractC0244am, f, f2, f3) && abstractC0244am.f1609bV.m5054c(abstractC0197n)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m5573a(AbstractC0197n abstractC0197n, float f, float f2, float f3, boolean z) {
        int i = 0;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f6958el + f3 > f && abstractC0244am.f6958el - f3 < f && abstractC0244am.f6959em + f3 > f2 && abstractC0244am.f6959em - f3 < f2 && abstractC0244am.f1609bV != abstractC0197n && m5571a(abstractC0244am, f, f2, f3) && abstractC0244am.f1609bV.m5042d(abstractC0197n) && (!z || abstractC0244am.m4758bI())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m5537b(AbstractC0197n abstractC0197n, float f, float f2, float f3) {
        int i = 0;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f6958el + f3 > f && abstractC0244am.f6958el - f3 < f && abstractC0244am.f6959em + f3 > f2 && abstractC0244am.f6959em - f3 < f2 && abstractC0244am.f1609bV != abstractC0197n && m5571a(abstractC0244am, f, f2, f3) && abstractC0244am.f1609bV.m5054c(abstractC0197n)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m5577a(AbstractC0159d abstractC0159d, float f, float f2, int i) {
        int i2 = 0;
        Iterator it = abstractC0159d.f650c.iterator();
        while (it.hasNext()) {
            i2 += m5567a(((C0160e) it.next()).f653a, f, f2, i);
        }
        return i2;
    }

    /* renamed from: a */
    public int m5567a(InterfaceC0303as interfaceC0303as, float f, float f2, int i) {
        int i2 = 0;
        Core m1087A = Core.m1087A();
        f622bH.clear();
        m1087A.f6127cc.m3254a(this, f, f2, i, f622bH);
        AbstractC0244am[] m498a = f622bH.m498a();
        int size = f622bH.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0244am abstractC0244am = m498a[i3];
            if (abstractC0244am.f1609bV == this && abstractC0244am.f1689dx == interfaceC0303as && m5571a(abstractC0244am, f, f2, i)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: aq */
    public int m5541aq() {
        int i = 0;
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            i++;
        }
        return i;
    }

    /* renamed from: Q */
    public void m5586Q() {
        if (this.f586aY && m5541aq() != 0) {
            Core.LogDebug2("waking up AI");
            this.f586aY = false;
        }
    }

    /* renamed from: d */
    public void m5531d(AbstractC0244am abstractC0244am) {
        if (!(abstractC0244am instanceof AbstractC0623y)) {
            return;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
        abstractC0623y.f1589bC = false;
        if (abstractC0623y.f3948aB != null) {
            abstractC0623y.f3948aB.m5415a(abstractC0623y);
            abstractC0623y.f3948aB = null;
        }
        if (abstractC0623y.f3947aA != null) {
            abstractC0623y.f3947aA.m5437b(abstractC0623y);
            abstractC0623y.f3947aA = null;
        }
        m5526e(abstractC0623y);
    }

    /* renamed from: a */
    public void m5558a(AbstractC0623y abstractC0623y, C0424b c0424b, boolean z) {
        if (abstractC0623y.f3948aB != null) {
            abstractC0623y.f3948aB.m5413a(abstractC0623y, c0424b, z);
        }
    }

    /* renamed from: j */
    public boolean m5519j(AbstractC0244am abstractC0244am) {
        if (!abstractC0244am.m4702cf() && m5054c(abstractC0244am.f1609bV)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m5564a(C0424b c0424b, AbstractC0244am abstractC0244am) {
        return m5563a(c0424b, abstractC0244am, false);
    }

    /* renamed from: a */
    public boolean m5563a(C0424b c0424b, AbstractC0244am abstractC0244am, boolean z) {
        return c0424b.mo4075b(abstractC0244am);
    }

    /* renamed from: a */
    public void m5579a(AbstractC0150a abstractC0150a) {
        if (!this.f623bI.contains(abstractC0150a)) {
            this.f623bI.add(abstractC0150a);
        } else {
            m5047c("Skipping add of component: " + abstractC0150a.mo5493a().name());
        }
    }
}
