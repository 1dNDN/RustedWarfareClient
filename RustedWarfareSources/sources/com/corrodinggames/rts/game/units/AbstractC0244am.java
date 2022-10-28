package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.EnumC0347ae;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p019c.C0418c;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p014b.AbstractC0309b;
import com.corrodinggames.rts.game.units.p024d.AbstractC0488d;
import com.corrodinggames.rts.game.units.p024d.C0505p;
import com.corrodinggames.rts.game.units.p024d.C0510r;
import com.corrodinggames.rts.game.units.p026e.AbstractC0525h;
import com.corrodinggames.rts.game.units.p026e.AbstractC0529j;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.game.units.p029h.AbstractC0590f;
import com.corrodinggames.rts.gameFramework.AbstractC0667ay;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p035d.C0741a;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import com.corrodinggames.rts.gameFramework.utility.C1112u;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/am.class */
public abstract class AbstractC0244am extends AbstractC0667ay {

    /* renamed from: bq */
    public float f1577bq;

    /* renamed from: br */
    public int f1578br;

    /* renamed from: bs */
    public AbstractC0244am f1579bs;

    /* renamed from: bt */
    public AbstractC0244am f1580bt;

    /* renamed from: bu */
    public AbstractC0244am f1581bu;

    /* renamed from: bv */
    public VariableScope f1582bv;

    /* renamed from: bw */
    public C0424b f1583bw;

    /* renamed from: bx */
    public C0424b f1584bx;

    /* renamed from: by */
    public int f1585by;

    /* renamed from: bz */
    public int f1586bz;

    /* renamed from: bA */
    public int f1587bA;

    /* renamed from: bB */
    public int f1588bB;

    /* renamed from: bC */
    public boolean f1589bC;

    /* renamed from: bD */
    public static final C1112u f1590bD = new C1112u();

    /* renamed from: a */
    private static final C1104o f1591a = new C1104o();

    /* renamed from: bE */
    public static HashMap f1592bE = new HashMap();

    /* renamed from: bF */
    public static HashMap f1593bF = new HashMap();

    /* renamed from: bG */
    public static HashMap f1594bG = new HashMap();

    /* renamed from: bH */
    public static final Paint f1595bH = new C0930ag();

    /* renamed from: bI */
    public static final Paint f1596bI;

    /* renamed from: bJ */
    static final LightingColorFilter f1597bJ;

    /* renamed from: bK */
    public boolean f1598bK;

    /* renamed from: bL */
    public boolean f1599bL;

    /* renamed from: bM */
    public boolean f1600bM;

    /* renamed from: bN */
    public boolean f1601bN;

    /* renamed from: bO */
    public boolean f1602bO;

    /* renamed from: bP */
    public AbstractC0244am f1603bP;

    /* renamed from: bQ */
    public AbstractC0244am f1604bQ;

    /* renamed from: bR */
    public float f1605bR;

    /* renamed from: bS */
    public boolean f1606bS;

    /* renamed from: bT */
    public boolean f1607bT;

    /* renamed from: bU */
    public long f1608bU;

    /* renamed from: bV */
    public AbstractC0197n f1609bV;

    /* renamed from: bW */
    public boolean f1610bW;

    /* renamed from: bX */
    public float f1611bX;

    /* renamed from: bY */
    public float f1612bY;

    /* renamed from: bZ */
    public boolean f1613bZ;

    /* renamed from: ca */
    public float f1614ca;

    /* renamed from: cb */
    public float f1615cb;

    /* renamed from: cc */
    public float f1616cc;

    /* renamed from: cd */
    public float f1617cd;

    /* renamed from: ce */
    public float f1618ce;

    /* renamed from: cf */
    public float f1619cf;

    /* renamed from: cg */
    public boolean f1620cg;

    /* renamed from: ch */
    public float f1621ch;

    /* renamed from: ci */
    public float f1622ci;

    /* renamed from: cj */
    public float f1623cj;

    /* renamed from: ck */
    public float f1624ck;

    /* renamed from: cl */
    public float f1625cl;

    /* renamed from: cm */
    public boolean f1626cm;

    /* renamed from: cn */
    public boolean f1627cn;

    /* renamed from: co */
    public boolean f1628co;

    /* renamed from: cp */
    public boolean f1629cp;

    /* renamed from: cq */
    public boolean f1630cq;

    /* renamed from: cr */
    public boolean f1631cr;

    /* renamed from: cs */
    public float f1632cs;

    /* renamed from: ct */
    public float f1633ct;

    /* renamed from: cu */
    public float f1634cu;

    /* renamed from: cv */
    public float f1635cv;

    /* renamed from: cw */
    public float f1636cw;

    /* renamed from: cx */
    public float f1637cx;

    /* renamed from: cy */
    public float f1638cy;

    /* renamed from: cz */
    public float f1639cz;

    /* renamed from: cA */
    public float f1640cA;

    /* renamed from: cB */
    public float f1641cB;

    /* renamed from: cC */
    public int f1642cC;

    /* renamed from: cD */
    public int f1643cD;

    /* renamed from: cE */
    public boolean f1644cE;

    /* renamed from: cF */
    public int f1645cF;

    /* renamed from: cG */
    public boolean f1646cG;

    /* renamed from: cH */
    public float f1647cH;

    /* renamed from: cI */
    public boolean f1648cI;

    /* renamed from: cJ */
    public C0247ap[] f1649cJ;

    /* renamed from: cK */
    public boolean f1650cK;

    /* renamed from: cL */
    public AbstractC0244am f1651cL;

    /* renamed from: cM */
    public AbstractC0623y f1652cM;

    /* renamed from: cN */
    public C0399m f1653cN;

    /* renamed from: cO */
    public int f1654cO;

    /* renamed from: cP */
    public boolean f1655cP;

    /* renamed from: cQ */
    public int f1656cQ;

    /* renamed from: cR */
    public int f1657cR;

    /* renamed from: cS */
    public int f1658cS;

    /* renamed from: cT */
    public float f1659cT;

    /* renamed from: cU */
    public static final Paint f1660cU;

    /* renamed from: cV */
    public static final Paint f1661cV;

    /* renamed from: cW */
    public static final Paint f1662cW;

    /* renamed from: cX */
    public static final Paint f1663cX;

    /* renamed from: cY */
    public static final Paint f1664cY;

    /* renamed from: cZ */
    public static final Paint f1665cZ;

    /* renamed from: da */
    public static final Paint f1666da;

    /* renamed from: db */
    public static final Paint f1667db;

    /* renamed from: dc */
    public static final Paint f1668dc;

    /* renamed from: dd */
    public static final Paint f1669dd;

    /* renamed from: de */
    public static final Paint f1670de;

    /* renamed from: df */
    public static final Paint f1671df;

    /* renamed from: dg */
    public static final Paint f1672dg;

    /* renamed from: dh */
    public static final Paint f1673dh;

    /* renamed from: di */
    public static final Paint f1674di;

    /* renamed from: dj */
    public int f1675dj;

    /* renamed from: dk */
    public int f1676dk;

    /* renamed from: dl */
    public int f1677dl;

    /* renamed from: dm */
    public float f1678dm;

    /* renamed from: dn */
    public float f1679dn;

    /* renamed from: do */
    public float f1680do;

    /* renamed from: dp */
    static final RectF f1681dp;

    /* renamed from: dq */
    static Paint f1682dq;

    /* renamed from: dr */
    static Paint f1683dr;

    /* renamed from: ds */
    public static final RectF f1684ds;

    /* renamed from: dt */
    public static final Rect f1685dt;

    /* renamed from: du */
    static final Rect f1686du;

    /* renamed from: dv */
    static final ArrayList f1687dv;

    /* renamed from: dw */
    static ArrayList f1688dw;

    /* renamed from: dx */
    public InterfaceC0303as f1689dx;

    /* renamed from: dy */
    static final RectF f1690dy;

    /* renamed from: dz */
    static final RectF f1691dz;

    /* renamed from: dA */
    static final Rect f1692dA;

    /* renamed from: dB */
    static final PointF f1693dB;

    /* renamed from: dC */
    static final PointF f1694dC;

    /* renamed from: dD */
    C0245an[] f1695dD;

    /* renamed from: dE */
    static final PointF f1696dE;

    /* renamed from: dF */
    C0439f f1697dF;

    /* renamed from: dG */
    public C0418c f1698dG;

    /* renamed from: dH */
    C0424b f1699dH;

    /* renamed from: h */
    public abstract EnumC0246ao mo2982h();

    /* renamed from: i */
    public abstract boolean mo2981i();

    /* renamed from: Q */
    public abstract boolean mo2995Q();

    /* renamed from: aj */
    public abstract boolean m4413aj();

    /* renamed from: ak */
    public abstract boolean m4412ak();

    /* renamed from: p_ */
    public abstract boolean mo3246p_();

    /* renamed from: r */
    public abstract InterfaceC0303as mo5649r();

    /* renamed from: l */
    public abstract boolean mo2979l();

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1314a(this.f1599bL);
        streamWriter.mo1318a(this.f1603bP);
        streamWriter.mo1318a(this.f1604bQ);
        streamWriter.mo1320a(this.f1605bR);
        streamWriter.mo1314a(this.f1606bS);
        streamWriter.mo1314a(this.f1607bT);
        streamWriter.mo1373a(this.f1608bU);
        streamWriter.mo1371a(this.f1609bV);
        streamWriter.mo1320a(this.f1611bX);
        streamWriter.mo1320a(this.f1612bY);
        streamWriter.mo1320a(this.f1614ca);
        streamWriter.mo1320a(this.f1615cb);
        streamWriter.mo1320a(this.f1617cd);
        streamWriter.mo1320a(this.f1618ce);
        streamWriter.mo1320a(this.f1621ch);
        streamWriter.mo1320a(this.f1622ci);
        streamWriter.mo1320a(this.f1623cj);
        streamWriter.mo1320a(this.f1624ck);
        streamWriter.mo1314a(this.f1627cn);
        streamWriter.mo1314a(this.f1630cq);
        streamWriter.mo1320a(this.f1632cs);
        streamWriter.mo1320a(this.f1633ct);
        streamWriter.mo1314a(this.f1648cI);
        streamWriter.mo1320a(this.f1649cJ[0].f1712a);
        streamWriter.mo1320a(this.f1649cJ[0].f1715d);
        streamWriter.mo1318a(this.f1651cL);
        streamWriter.mo1355c(26);
        streamWriter.WriteInteger(this.f1658cS);
        streamWriter.mo1320a(this.f1659cT);
        streamWriter.mo1320a(this.f1616cc);
        streamWriter.mo1320a(this.f1619cf);
        int mo3084bl = mo3084bl();
        streamWriter.WriteInteger(mo3084bl);
        for (int i = 0; i < mo3084bl; i++) {
            C0247ap c0247ap = this.f1649cJ[i];
            streamWriter.mo1320a(c0247ap.f1712a);
            streamWriter.mo1320a(c0247ap.f1714c);
            streamWriter.mo1320a(c0247ap.f1715d);
            streamWriter.mo1320a(c0247ap.f1716e);
            streamWriter.mo1320a(c0247ap.f1717f);
            streamWriter.mo1320a(c0247ap.f1719h);
            streamWriter.mo1320a(c0247ap.f1720i);
            AbstractC0244am abstractC0244am = c0247ap.f1721j;
            if (abstractC0244am != null && abstractC0244am.f1607bT) {
                abstractC0244am = null;
            }
            streamWriter.mo1318a(abstractC0244am);
            streamWriter.mo1314a(this.f1650cK);
        }
        streamWriter.WriteInteger(this.f1578br);
        streamWriter.mo1320a(this.f1635cv);
        streamWriter.mo1320a(this.f1636cw);
        streamWriter.mo1320a(this.f1637cx);
        streamWriter.mo1320a(this.f1638cy);
        streamWriter.mo1314a(this.f1628co);
        streamWriter.mo1314a(this.f1629cp);
        streamWriter.mo1314a(this.f1631cr);
        streamWriter.mo1314a(this.f1600bM);
        streamWriter.mo1320a(this.f1639cz);
        streamWriter.mo1314a(this.f1620cg);
        streamWriter.mo1314a(this.f1695dD != null);
        if (this.f1695dD != null) {
            streamWriter.WriteInteger(this.f1695dD.length);
            for (int i2 = 0; i2 < this.f1695dD.length; i2++) {
                C0245an c0245an = this.f1695dD[i2];
                streamWriter.mo1314a(c0245an.f1700a);
                streamWriter.WriteInteger(c0245an.f1701b);
            }
        }
        streamWriter.mo1320a(this.f1634cu);
        streamWriter.mo1359b(this.f1579bs);
        streamWriter.WriteInteger(this.f1642cC);
        streamWriter.WriteInteger(this.f1643cD);
        streamWriter.WriteInteger(this.f1585by);
        streamWriter.WriteInteger(this.f1586bz);
        streamWriter.WriteInteger(this.f1587bA);
        streamWriter.WriteInteger(this.f1588bB);
        streamWriter.mo1314a(this.f1601bN);
        streamWriter.mo1314a(this.f1602bO);
        this.f1697dF.m3805a(streamWriter);
        this.f1698dG.m3923a(streamWriter);
        streamWriter.mo1359b((AbstractC0244am) this.f1652cM);
        short s = -1;
        if (this.f1652cM != null && this.f1653cN != null) {
            s = this.f1653cN.m3977a();
        }
        streamWriter.mo1315a(s);
        streamWriter.WriteInteger(this.f1654cO);
        VariableScope.writeOutUnitOrPlaceholder(streamWriter, this.f1580bt);
        VariableScope.writeOutUnitOrPlaceholder(streamWriter, this.f1581bu);
        VariableScope.writeOut(streamWriter, this.f1582bv);
        C0424b.m3902a(streamWriter, this.f1583bw);
        C0424b.m3902a(streamWriter, this.f1584bx);
        streamWriter.mo1320a(this.f1625cl);
        super.mo2292a(streamWriter);
    }

    /* renamed from: a */
    public void mo2291a(Reader reader) {
        C0399m m2900a;
        this.f1599bL = reader.ReadBool();
        this.f1603bP = reader.m1277o();
        this.f1604bQ = reader.m1277o();
        this.f1605bR = reader.m1285g();
        this.f1606bS = reader.ReadBool();
        this.f1607bT = reader.ReadBool();
        this.f1608bU = reader.m1283i();
        m4411b(reader.m1274r());
        this.f1611bX = reader.m1285g();
        this.f1612bY = reader.m1285g();
        this.f1614ca = reader.m1285g();
        this.f1615cb = reader.m1285g();
        this.f1617cd = reader.m1285g();
        this.f1618ce = reader.m1285g();
        reader.m1285g();
        reader.m1285g();
        this.f1623cj = reader.m1285g();
        this.f1624ck = reader.m1285g();
        this.f1627cn = reader.ReadBool();
        this.f1630cq = reader.ReadBool();
        m4306o(reader.m1285g());
        this.f1633ct = reader.m1285g();
        this.f1648cI = reader.ReadBool();
        this.f1649cJ[0].f1712a = reader.m1285g();
        this.f1649cJ[0].f1715d = reader.m1285g();
        this.f1651cL = reader.m1277o();
        byte m1289d = reader.m1289d();
        if (m1289d >= 1) {
            this.f1658cS = reader.ReadInt();
            this.f1659cT = reader.m1285g();
        }
        if (m1289d >= 2) {
            this.f1616cc = reader.m1285g();
            this.f1619cf = reader.m1285g();
            int ReadInt = reader.ReadInt();
            m4436O(ReadInt);
            for (int i = 0; i < ReadInt; i++) {
                C0247ap c0247ap = this.f1649cJ[i];
                c0247ap.f1712a = reader.m1285g();
                c0247ap.f1714c = reader.m1285g();
                c0247ap.f1715d = reader.m1285g();
                c0247ap.f1716e = reader.m1285g();
                c0247ap.f1717f = reader.m1285g();
                if (m1289d >= 8) {
                    c0247ap.f1719h = reader.m1285g();
                    c0247ap.f1720i = reader.m1285g();
                    c0247ap.f1721j = reader.m1277o();
                }
                if (m1289d >= 12) {
                    this.f1650cK = reader.ReadBool();
                }
            }
        }
        if (m1289d >= 3) {
            this.f1578br = reader.ReadInt();
        }
        if (m1289d >= 4) {
            this.f1635cv = reader.m1285g();
            this.f1636cw = reader.m1285g();
            this.f1637cx = reader.m1285g();
            this.f1638cy = reader.m1285g();
        }
        if (m1289d >= 5) {
            this.f1628co = reader.ReadBool();
            this.f1629cp = reader.ReadBool();
        }
        if (m1289d >= 6) {
            this.f1631cr = reader.ReadBool();
        }
        if (m1289d >= 7) {
            this.f1600bM = reader.ReadBool();
        }
        if (m1289d >= 9) {
            this.f1639cz = reader.m1285g();
        }
        if (m1289d >= 10) {
            this.f1620cg = reader.ReadBool();
        }
        if (m1289d >= 11 && reader.ReadBool()) {
            this.f1695dD = new C0245an[reader.ReadInt()];
            for (int i2 = 0; i2 < this.f1695dD.length; i2++) {
                this.f1695dD[i2] = new C0245an();
                C0245an c0245an = this.f1695dD[i2];
                c0245an.f1700a = reader.ReadBool();
                c0245an.f1701b = reader.ReadInt();
            }
        }
        if (m1289d >= 13) {
            this.f1634cu = reader.m1285g();
        }
        if (m1289d >= 14) {
            this.f1579bs = reader.m1277o();
        }
        if (m1289d >= 15) {
            this.f1642cC = reader.ReadInt();
            this.f1643cD = reader.ReadInt();
        }
        if (m1289d >= 16) {
            this.f1585by = reader.ReadInt();
            this.f1586bz = reader.ReadInt();
            this.f1587bA = reader.ReadInt();
        }
        if (m1289d >= 17) {
            this.f1588bB = reader.ReadInt();
        }
        if (m1289d >= 18) {
            this.f1601bN = reader.ReadBool();
            this.f1602bO = reader.ReadBool();
        }
        if (m1289d >= 19) {
            this.f1697dF.m3804a(reader);
            this.f1698dG.m3927a(this, reader);
        }
        if (m1289d >= 20) {
            AbstractC0623y m1276p = reader.m1276p();
            short m1270v = reader.m1270v();
            if (m1270v != -1) {
                boolean z = false;
                if (m1276p != null && (this instanceof AbstractC0623y) && (m2900a = m1276p.m2900a(m1270v)) != null && m1276p.m2906a((AbstractC0623y) this, m2900a)) {
                    z = true;
                }
                if (!z) {
                    m4350ci();
                }
            }
        }
        if (m1289d >= 21) {
            this.f1654cO = reader.ReadInt();
        }
        if (m1289d >= 22) {
            if (m1289d < 24) {
                throw new IOException("extension >=22 but <24");
            }
            this.f1580bt = VariableScope.readInUnitOrPlaceholder(reader);
            this.f1581bu = VariableScope.readInUnitOrPlaceholder(reader);
        }
        if (m1289d >= 23) {
            this.f1582bv = VariableScope.readIn(reader);
        }
        if (m1289d >= 25) {
            this.f1583bw = C0424b.m3901a(reader);
            this.f1584bx = C0424b.m3901a(reader);
        }
        if (m1289d >= 26) {
            this.f1625cl = reader.m1285g();
        }
        if (this.f1607bT) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            f1590bD.remove(this);
            m1072A.f6127cc.m3155a(this);
        }
        super.mo2291a(reader);
    }

    /* renamed from: a */
    public static C0934e m4419a(C0934e c0934e) {
        return m4418a(c0934e, c0934e.mo386m(), c0934e.mo387l());
    }

    /* renamed from: a */
    public static C0934e m4418a(C0934e c0934e, int i, int i2) {
        C0934e mo61a = c0934e.mo61a(i, i2, false);
        c0934e.mo43x();
        mo61a.mo52j();
        int mo386m = mo61a.mo386m();
        int mo387l = mo61a.mo387l();
        for (int i3 = 0; i3 < mo386m; i3++) {
            for (int i4 = 0; i4 < mo387l; i4++) {
                mo61a.mo62a(i3, i4, Color.m5435a(Color.m5437a(c0934e.mo63a(i3, i4)), 0, 0, 0));
            }
        }
        mo61a.mo48p();
        mo61a.mo45s();
        c0934e.mo42y();
        mo61a.m882a("shadow:" + c0934e.mo64a());
        mo61a.f6401n = true;
        return mo61a;
    }

    static {
        f1595bH.mo894a(true);
        f1595bH.m5420a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
        f1596bI = new C0930ag();
        f1596bI.mo894a(true);
        f1597bJ = new LightingColorFilter(Color.m5436a(255, 255, 255), Color.m5436a(100, 100, 100));
        f1596bI.m5420a(255, 255, 255, 255);
        f1596bI.m5417a(f1597bJ);
        f1660cU = new Paint();
        f1661cV = new C0930ag();
        f1662cW = new C0930ag();
        f1663cX = new C0930ag();
        f1664cY = new C0930ag();
        f1665cZ = new C0930ag();
        f1666da = new C0930ag();
        f1667db = new Paint();
        f1668dc = new Paint();
        f1669dd = new Paint();
        f1670de = new C0930ag();
        f1671df = new C0930ag();
        f1672dg = new C0930ag();
        f1673dh = new C0930ag();
        f1674di = new Paint();
        f1660cU.m5413a(Paint.Style.f220b);
        f1660cU.m5423a(2.0f);
        m4432a(f1660cU);
        f1661cV.m5420a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1661cV.m5413a(Paint.Style.f220b);
        f1661cV.m5423a(2.0f);
        m4431a(f1661cV, true);
        f1662cW.m5420a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1662cW.m5413a(Paint.Style.f220b);
        f1662cW.m5423a(2.0f);
        m4432a(f1662cW);
        f1663cX.m5420a(130, 0, 255, 0);
        f1663cX.m5413a(Paint.Style.f220b);
        f1663cX.m5423a(2.0f);
        m4432a(f1663cX);
        f1667db.m5420a(70, 0, 255, 0);
        f1667db.m5413a(Paint.Style.f220b);
        f1667db.m5423a(1.0f);
        m4432a(f1667db);
        f1664cY.m5420a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 0, 0);
        f1664cY.m5413a(Paint.Style.f220b);
        f1664cY.m5423a(2.0f);
        m4432a(f1664cY);
        f1668dc.m5420a(70, 255, 0, 0);
        f1668dc.m5413a(Paint.Style.f220b);
        f1668dc.m5423a(1.0f);
        m4432a(f1668dc);
        f1666da.m5420a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 0);
        f1666da.m5413a(Paint.Style.f220b);
        f1666da.m5423a(2.0f);
        m4432a(f1666da);
        f1669dd.m5420a(70, 255, 255, 0);
        f1669dd.m5413a(Paint.Style.f220b);
        f1669dd.m5423a(1.0f);
        m4432a(f1669dd);
        f1665cZ.m5420a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 255);
        f1665cZ.m5413a(Paint.Style.f220b);
        f1665cZ.m5423a(2.0f);
        m4432a(f1665cZ);
        f1670de.m5420a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1670de.m5413a(Paint.Style.f220b);
        f1670de.m5423a(1.0f);
        m4432a(f1670de);
        f1671df.m5420a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1671df.m5413a(Paint.Style.f220b);
        f1671df.m5423a(2.0f);
        m4432a(f1671df);
        f1672dg.m5420a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 0, 0);
        f1672dg.m5413a(Paint.Style.f220b);
        f1672dg.m5423a(1.0f);
        m4432a(f1672dg);
        f1673dh.m5413a(Paint.Style.f220b);
        f1674di.m5413a(Paint.Style.f220b);
        f1681dp = new RectF();
        f1682dq = new Paint();
        f1683dr = new Paint();
        f1684ds = new RectF();
        f1685dt = new Rect();
        f1686du = new Rect();
        f1687dv = new ArrayList();
        f1688dw = new ArrayList();
        f1690dy = new RectF();
        f1691dz = new RectF();
        f1692dA = new Rect();
        f1693dB = new PointF();
        f1694dC = new PointF();
        f1696dE = new PointF();
    }

    /* renamed from: bF */
    public static C1104o m4405bF() {
        f1591a.m524a();
        return f1591a;
    }

    /* renamed from: bG */
    public static void m4404bG() {
        f1591a.m524a();
    }

    /* renamed from: bH */
    public static void m4403bH() {
        AbstractC0529j.m3191dq();
        AbstractC0488d.m3375dq();
        AbstractC0525h.m3214K();
        AbstractC0590f.m3058L();
        AbstractC0309b.m4205K();
        if (LoggerMaybe.m1072A().m998ar()) {
            Iterator it = EnumSet.allOf(EnumC0249ar.class).iterator();
            while (it.hasNext()) {
                ((EnumC0249ar) it.next()).mo4267b();
            }
        } else {
            C0519b.m3242K();
            C0505p.m3296b();
            C0510r.m3276dr();
            C0243al.m4444b();
        }
        EnumC0249ar.m4273t();
    }

    /* renamed from: bI */
    public boolean m4402bI() {
        return false;
    }

    /* renamed from: bJ */
    public boolean mo3269bJ() {
        return false;
    }

    /* renamed from: bK */
    public static HashMap m4401bK() {
        HashMap hashMap = new HashMap();
        if (LoggerMaybe.m1072A().m998ar()) {
            Iterator it = EnumSet.allOf(EnumC0249ar.class).iterator();
            while (it.hasNext()) {
                EnumC0249ar enumC0249ar = (EnumC0249ar) it.next();
                AbstractC0244am mo4268a = enumC0249ar.mo4268a(true);
                mo4268a.mo2635a();
                mo4268a.m4411b(AbstractC0197n.f1371i);
                mo4268a.f1627cn = true;
                hashMap.put(enumC0249ar, mo4268a);
            }
        }
        Iterator it2 = C0453l.f3188d.iterator();
        while (it2.hasNext()) {
            C0453l c0453l = (C0453l) it2.next();
            AbstractC0244am m3530a = c0453l.m3530a(true);
            m3530a.mo2635a();
            m3530a.m4411b(AbstractC0197n.f1371i);
            m3530a.f1627cn = true;
            hashMap.put(c0453l, m3530a);
        }
        return hashMap;
    }

    /* renamed from: bL */
    public static void m4400bL() {
        f1593bF = m4401bK();
        f1594bG = m4401bK();
        f1592bE = m4401bK();
    }

    /* renamed from: a */
    public static AbstractC0244am m4425a(InterfaceC0303as interfaceC0303as) {
        return (AbstractC0244am) f1592bE.get(interfaceC0303as);
    }

    /* renamed from: b */
    public static AbstractC0244am m4407b(InterfaceC0303as interfaceC0303as) {
        return m4383c(interfaceC0303as);
    }

    /* renamed from: c */
    public static AbstractC0244am m4383c(InterfaceC0303as interfaceC0303as) {
        AbstractC0244am abstractC0244am = (AbstractC0244am) f1593bF.get(interfaceC0303as);
        if (abstractC0244am == null) {
            if (C0453l.f2903b == null) {
                LoggerMaybe.LogDebug2("Could not find:" + interfaceC0303as.mo4252i() + " and missing place holder is null");
                return null;
            }
            abstractC0244am = (AbstractC0244am) f1593bF.get(C0453l.f2903b);
            if (abstractC0244am == null) {
                LoggerMaybe.LogDebug2("name: " + C0453l.f2903b.f2922L);
                LoggerMaybe.LogDebug2("contains:" + f1593bF.containsKey(C0453l.f2903b));
                Iterator it = f1593bF.keySet().iterator();
                while (it.hasNext()) {
                    LoggerMaybe.LogDebug2("has:" + ((InterfaceC0303as) it.next()).mo4252i());
                }
                LoggerMaybe.LogDebug2("Could not find:" + interfaceC0303as.mo4252i() + " and missing place holder could not be found");
            }
        }
        return abstractC0244am;
    }

    /* renamed from: d */
    public static AbstractC0244am m4334d(InterfaceC0303as interfaceC0303as) {
        AbstractC0244am abstractC0244am = (AbstractC0244am) f1594bG.get(interfaceC0303as);
        if (abstractC0244am == null) {
            abstractC0244am = (AbstractC0244am) f1594bG.get(C0453l.f2903b);
        }
        return abstractC0244am;
    }

    /* renamed from: bM */
    public static int m4399bM() {
        int i = 0;
        if (LoggerMaybe.m1072A().m998ar()) {
            Iterator it = EnumSet.allOf(EnumC0249ar.class).iterator();
            while (it.hasNext()) {
                i = (i * 31) + m4425a((EnumC0249ar) it.next()).m4386bw();
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0244am(boolean z) {
        super(z);
        this.f1578br = -9999;
        this.f1579bs = null;
        this.f1580bt = null;
        this.f1581bu = null;
        this.f1585by = -9999;
        this.f1586bz = -9999;
        this.f1587bA = -9999;
        this.f1599bL = false;
        this.f1600bM = false;
        this.f1601bN = false;
        this.f1602bO = false;
        this.f1603bP = null;
        this.f1606bS = true;
        this.f1607bT = false;
        this.f1608bU = 0L;
        this.f1611bX = 0.0f;
        this.f1612bY = 0.0f;
        this.f1613bZ = false;
        this.f1614ca = 0.0f;
        this.f1615cb = 0.0f;
        this.f1616cc = 0.0f;
        this.f1617cd = 0.0f;
        this.f1624ck = 1.0f;
        this.f1625cl = 1.0f;
        this.f1626cm = false;
        this.f1627cn = false;
        this.f1628co = false;
        this.f1629cp = false;
        this.f1630cq = false;
        this.f1631cr = false;
        this.f1645cF = -9999;
        this.f1647cH = 0.0f;
        this.f1648cI = true;
        this.f1651cL = null;
        this.f1652cM = null;
        this.f1653cN = null;
        this.f1654cO = -9999;
        this.f1675dj = -1;
        this.f1676dk = -1;
        this.f1677dl = -99;
        this.f1680do = 70.0f;
        this.f1697dF = new C0439f();
        this.f1698dG = new C0418c();
        this.f1699dH = null;
        m4397bR();
        if (!z) {
            this.f1598bK = true;
            f1590bD.mo494a(this);
            f1591a.m520a(this);
        }
        this.f1585by = LoggerMaybe.m1072A().f6102by;
        this.f1689dx = mo5649r();
    }

    /* renamed from: a */
    public void mo2635a() {
        AbstractC0197n.m4634a(this);
        if (this.f1598bK) {
            f1590bD.remove(this);
            f1591a.m517b(this);
        }
        LoggerMaybe.m1072A().f6117bS.m1774l(this);
        super.mo2635a();
    }

    /* renamed from: bN */
    public float mo3075bN() {
        return 3000.0f;
    }

    /* renamed from: s */
    public int m4302s(AbstractC0244am abstractC0244am) {
        return 0;
    }

    /* renamed from: bO */
    public boolean mo4171bO() {
        return false;
    }

    /* renamed from: bP */
    public boolean mo4170bP() {
        return false;
    }

    /* renamed from: bQ */
    public float m4398bQ() {
        return -1.0f;
    }

    /* renamed from: o */
    public void m4306o(float f) {
        this.f1632cs = f;
    }

    /* renamed from: bR */
    public void m4397bR() {
        m4436O(1);
    }

    /* renamed from: O */
    public void m4436O(int i) {
        int length;
        int mo3084bl = mo3084bl();
        if (mo3084bl < i) {
            mo3084bl = i;
        }
        if (this.f1649cJ == null) {
            length = 0;
            this.f1649cJ = new C0247ap[mo3084bl];
        } else if (this.f1649cJ.length < mo3084bl) {
            length = this.f1649cJ.length;
            this.f1649cJ = (C0247ap[]) Arrays.copyOf(this.f1649cJ, mo3084bl);
        } else {
            return;
        }
        for (int i2 = length; i2 < this.f1649cJ.length; i2++) {
            this.f1649cJ[i2] = new C0247ap();
        }
    }

    /* renamed from: a */
    public static void m4432a(Paint paint) {
        m4431a(paint, false);
    }

    /* renamed from: a */
    public static void m4431a(Paint paint, boolean z) {
        if (!LoggerMaybe.m995au() && z) {
            paint.m5423a(0.0f);
        }
    }

    /* renamed from: d */
    public float mo3216d(boolean z) {
        return this.f1618ce + 90.0f;
    }

    /* renamed from: bS */
    public final boolean m4396bS() {
        return this.f1651cL == null && this.f1624ck >= 1.0f;
    }

    /* renamed from: a_ */
    public float m4415a_() {
        if (this.f1632cs < this.f1633ct) {
            return this.f1632cs / this.f1633ct;
        }
        return -1.0f;
    }

    /* renamed from: bT */
    public boolean m4395bT() {
        return true;
    }

    /* renamed from: bU */
    public float m4394bU() {
        if (this.f1624ck < 1.0f) {
            if (this.f1652cM == null || this.f1652cM.f1624ck >= 1.0f) {
                return this.f1624ck;
            }
            return -1.0f;
        }
        return -1.0f;
    }

    /* renamed from: bV */
    public float mo3189bV() {
        return -1.0f;
    }

    /* renamed from: bW */
    public boolean mo3188bW() {
        return false;
    }

    /* renamed from: bX */
    public int m4393bX() {
        return -1;
    }

    /* renamed from: bY */
    public int m4392bY() {
        return -1;
    }

    /* renamed from: a */
    public void mo2294a(float f, boolean z) {
        float f2;
        int m2100b;
        int m2100b2;
        int m2100b3;
        int m2100b4;
        if (this.f1607bT || this.f1651cL != null) {
            return;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float f3 = this.f1621ch;
        if (z) {
            return;
        }
        boolean z2 = false;
        int m4393bX = m4393bX();
        if (m4394bU() >= 0.0f) {
            z2 = true;
        }
        if (mo3189bV() >= 0.0f) {
            z2 = true;
        }
        if (this.f1644cE || m1072A.f6115bQ.showHp) {
            if (m4415a_() >= 0.0f) {
                z2 = true;
            }
            if (m4393bX >= 0) {
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        float f4 = this.f6957el - m1072A.f6144cv;
        float f5 = (this.f6958em - m1072A.f6145cw) - this.f6959en;
        float f6 = f3 + 4.0f;
        int i = 4;
        float f7 = 2.0f * f3;
        if (this.f1626cm) {
            f2 = 1.0f;
        } else {
            f2 = m1072A.f6256cW;
        }
        if (f2 < 1.0f) {
            m1072A.f6113bO.mo135k();
            m1072A.m1055R();
            f4 *= m1072A.f6256cW;
            f5 *= m1072A.f6256cW;
            f6 *= m1072A.f6256cW;
        }
        float f8 = 3.0f;
        if (this.f1644cE || m1072A.f6115bQ.showHp) {
            if (m4415a_() >= 0.0f) {
                boolean z3 = false;
                boolean z4 = false;
                C0399m m4323dl = m4323dl();
                if (m4323dl != null) {
                    z3 = m4323dl.f2460p;
                    z4 = m4323dl.f2461q;
                }
                if (!z4) {
                    if (m1072A.f6099bs.m4599c(this.f1609bV)) {
                        m2100b = C0758f.m2100b(200, 183, 44, 44);
                        m2100b2 = C0758f.m2100b(120, 255, 60, 60);
                    } else {
                        m2100b = C0758f.m2100b(200, 0, 150, 0);
                        m2100b2 = C0758f.m2100b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                    }
                    Paint m473a = C1117y.m473a(m2100b, Paint.Style.f219a);
                    Paint m473a2 = C1117y.m473a(m2100b2, Paint.Style.f220b);
                    int i2 = 4;
                    if (z3) {
                        i2 = 1;
                    }
                    f1681dp.m5351a(f4 - f3, f5 + f6, (f4 - f3) + (f7 * m4415a_()), f5 + f6 + i2);
                    m1072A.f6113bO.mo205a(f1681dp, m473a);
                    f1681dp.m5351a(f4 - f3, f5 + f6, (f4 - f3) + f7, f5 + f6 + i2);
                    m1072A.f6113bO.mo205a(f1681dp, m473a2);
                    if (this.f1640cA != 0.0f && m4395bT() && m1072A.f6115bQ.showHpChanges) {
                        float m4415a_ = m4415a_();
                        float f9 = m4415a_ + ((-this.f1640cA) / this.f1633ct);
                        if (f9 < 0.0f) {
                            f9 = 0.0f;
                        }
                        if (f9 >= 1.0f) {
                            f9 = 1.0f;
                        }
                        Paint m473a3 = C1117y.m473a(C0758f.m2100b(100, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 208, 26), Paint.Style.f219a);
                        f1681dp.m5351a((f4 - f3) + (f7 * m4415a_), f5 + f6, (f4 - f3) + (f7 * f9), f5 + f6 + i2);
                        m1072A.f6113bO.mo205a(f1681dp, m473a3);
                    }
                }
            }
            if (m4393bX >= 0) {
                int m4392bY = m4392bY();
                float f10 = f7;
                if (m4392bY > 10) {
                    f10 += 20.0f;
                }
                float f11 = f4 - (f10 / 2.0f);
                float f12 = (int) ((f10 / m4392bY) + 0.5f);
                float f13 = f12 - 2.0f;
                for (int i3 = 1; i3 <= m4392bY; i3++) {
                    float f14 = f11 + ((i3 - 1) * f12);
                    f1681dp.m5351a(f14, f5 + f6 + 3.0f, f14 + f13, f5 + f6 + 3.0f + 3.0f);
                    if (m4393bX >= i3) {
                        m1072A.f6113bO.mo205a(f1681dp, C1117y.m474a((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0, 0, 255, Paint.Style.f219a));
                    }
                    m1072A.f6113bO.mo205a(f1681dp, C1117y.m474a(110, 0, 0, 210, Paint.Style.f220b));
                }
                f8 = 3.0f + 5.0f;
            }
        }
        if (mo3189bV() >= 0.0f) {
            int i4 = 2 + 1;
            boolean mo3188bW = mo3188bW();
            f1681dp.m5351a(f4 - f3, f5 + f6 + i4 + f8, (f4 - f3) + (f7 * mo3189bV()), f5 + f6 + i4 + 2 + f8);
            if (mo3188bW) {
                m2100b3 = C0758f.m2100b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 103, 117, 119);
            } else {
                m2100b3 = C0758f.m2100b(200, 23, 179, 207);
            }
            m1072A.f6113bO.mo205a(f1681dp, C1117y.m473a(m2100b3, Paint.Style.f219a));
            f1681dp.m5351a(f4 - f3, f5 + f6 + i4 + f8, (f4 - f3) + f7, f5 + f6 + i4 + 2 + f8);
            if (mo3188bW) {
                m2100b4 = C0758f.m2100b(105, 123, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_6);
            } else {
                m2100b4 = C0758f.m2100b(120, 45, 211, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_NETWORK);
            }
            m1072A.f6113bO.mo205a(f1681dp, C1117y.m473a(m2100b4, Paint.Style.f220b));
            f8 += 2;
            i = 4;
        }
        if (m4394bU() >= 0.0f) {
            int i5 = i + 1;
            f1681dp.m5351a(f4 - f3, f5 + f6 + i5 + f8, (f4 - f3) + (f7 * m4394bU()), f5 + f6 + i5 + i + f8);
            m1072A.f6113bO.mo205a(f1681dp, C1117y.m474a(200, 0, 0, 150, Paint.Style.f219a));
            f1681dp.m5351a(f4 - f3, f5 + f6 + i5 + f8, (f4 - f3) + f7, f5 + f6 + i5 + i + f8);
            m1072A.f6113bO.mo205a(f1681dp, C1117y.m474a(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, Paint.Style.f220b));
            float f15 = f8 + i;
        }
        if (f2 < 1.0f) {
            m1072A.f6113bO.mo134l();
        }
    }

    /* renamed from: d */
    public void mo2284d(float f) {
    }

    /* renamed from: p */
    public void m4305p(float f) {
        if (!this.f1607bT && this.f1651cL == null && this.f1644cE) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            if (this.f1609bV == m1072A.f6099bs || m1072A.f6117bS.m1772m(this)) {
                if (m1072A.f6115bQ.showUnitWaypoints && m1072A.f6170dv <= 40) {
                    m1072A.f6170dv++;
                    mo3119O();
                }
                m4391bZ();
            }
            if (C1117y.m471a(this)) {
                m4358ca();
            }
        }
    }

    /* renamed from: bZ */
    public void m4391bZ() {
    }

    /* renamed from: O */
    public void mo3119O() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        C0305au c0305au = null;
        C0305au c0305au2 = null;
        if (this instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) this;
            int m2849av = abstractC0623y.m2849av();
            float f = this.f6957el;
            float f2 = this.f6958em;
            for (int i = 0; i < m2849av; i++) {
                C0305au m2762k = abstractC0623y.m2762k(i);
                if (m2762k != null) {
                    if (LoggerMaybe.m995au()) {
                        f1682dq.m5423a(2.0f);
                    } else {
                        f1682dq.m5423a(0.0f);
                    }
                    if (m2762k.m4222d() == EnumC0306av.attack) {
                        f1682dq.m5398b(Color.m5435a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 0));
                    } else if (m2762k.m4222d() == EnumC0306av.attackMove) {
                        f1682dq.m5398b(Color.m5435a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    } else if (m2762k.m4222d() == EnumC0306av.build) {
                        f1682dq.m5398b(Color.m5435a(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m2762k.m4222d() == EnumC0306av.repair) {
                        f1682dq.m5398b(Color.m5435a(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m2762k.m4222d() == EnumC0306av.loadInto || m2762k.m4222d() == EnumC0306av.loadUp) {
                        f1682dq.m5398b(Color.m5435a(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m2762k.m4222d() == EnumC0306av.reclaim) {
                        f1682dq.m5398b(Color.m5435a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 42));
                    } else if (m2762k.m4222d() == EnumC0306av.guard || m2762k.m4222d() == EnumC0306av.guardAt) {
                        f1682dq.m5398b(Color.m5435a(160, 97, 20, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL));
                    } else if (m2762k.m4222d() == EnumC0306av.patrol) {
                        f1682dq.m5398b(Color.m5435a(160, 0, 210, 210));
                        if (c0305au == null) {
                            c0305au = m2762k;
                        } else {
                            c0305au2 = m2762k;
                        }
                    } else {
                        f1682dq.m5398b(Color.m5435a(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    }
                    float m4216g = m2762k.m4216g();
                    float m4214h = m2762k.m4214h();
                    AbstractC0244am m4212i = m2762k.m4212i();
                    if (m4212i != null && m2762k.m4218f() && !m4212i.m4402bI() && !m4212i.m4336d(m1072A.f6099bs)) {
                        float m2071d = C0758f.m2071d(f, f2, m4216g, m4214h);
                        m4216g = f + (C0758f.m2040i(m2071d) * 400.0f);
                        m4214h = f2 + (C0758f.m2045h(m2071d) * 400.0f);
                    }
                    m1072A.f6113bO.mo225a(f - m1072A.f6144cv, f2 - m1072A.f6145cw, m4216g - m1072A.f6144cv, m4214h - m1072A.f6145cw, f1682dq);
                    if (0 != 0) {
                        float m2105b = C0758f.m2105b(f, f2, m4216g, m4214h);
                        float m2071d2 = C0758f.m2071d(f, f2, m4216g, m4214h);
                        float f3 = m1072A.f6117bS.f5168aN * m2105b;
                        float m2040i = f + (C0758f.m2040i(m2071d2) * f3);
                        float m2045h = f2 + (C0758f.m2045h(m2071d2) * f3);
                        f1681dp.m5351a(m2040i - 1.0f, m2045h - 1.0f, m2040i + 1.0f, m2045h + 1.0f);
                        f1681dp.m5352a(-m1072A.f6144cv, -m1072A.f6145cw);
                        m1072A.f6113bO.mo205a(f1681dp, f1682dq);
                    }
                    f = m4216g;
                    f2 = m4214h;
                }
            }
        }
        if (c0305au != null && c0305au2 != null && c0305au != c0305au2) {
            f1682dq.m5398b(Color.m5435a(50, 0, 210, 210));
            C0305au c0305au3 = c0305au;
            m1072A.f6113bO.mo225a(c0305au2.m4216g() - m1072A.f6144cv, c0305au2.m4214h() - m1072A.f6145cw, c0305au3.m4216g() - m1072A.f6144cv, c0305au3.m4214h() - m1072A.f6145cw, f1682dq);
        }
    }

    /* renamed from: ca */
    public void m4358ca() {
    }

    /* renamed from: e */
    public void mo2283e(float f) {
        Paint paint;
        boolean z = false;
        if (this.f1647cH != 0.0f) {
            this.f1647cH = C0758f.m2159a(this.f1647cH, f);
            if (this.f1647cH % 15.0f < 7.0f) {
                z = true;
            }
        }
        if (this.f1644cE || z) {
            LoggerMaybe m1072A = LoggerMaybe.m1072A();
            if (m4321dn()) {
                float f2 = this.f6957el - m1072A.f6144cv;
                float f3 = (this.f6958em - m1072A.f6145cw) - this.f6959en;
                AbstractC0197n abstractC0197n = m1072A.f6099bs;
                if (abstractC0197n == this.f1609bV) {
                    if (this.f1622ci < 8.0f) {
                        paint = f1661cV;
                    } else {
                        paint = f1662cW;
                    }
                } else if (abstractC0197n.m4599c(this.f1609bV)) {
                    paint = f1664cY;
                } else if (this.f1609bV != null && m1072A.f6126cb.m2411h()) {
                    f1660cU.m5398b(AbstractC0197n.m4566i(this.f1609bV.f1312q));
                    paint = f1660cU;
                } else {
                    paint = f1666da;
                }
                if (z) {
                    paint = f1665cZ;
                }
                if (m4402bI()) {
                    if (paint == f1662cW) {
                        paint = f1663cX;
                    }
                    Rect m4355cd = m4355cd();
                    if (m4355cd != null) {
                        f1681dp.m5350a(m4355cd);
                        f1681dp.f235b *= m1072A.f6110bL.f786o;
                        f1681dp.f237d *= m1072A.f6110bL.f786o;
                        f1681dp.f234a *= m1072A.f6110bL.f785n;
                        f1681dp.f236c *= m1072A.f6110bL.f785n;
                        float mo3290cZ = mo3290cZ();
                        f1681dp.m5352a(-(mo3292cX() - m1072A.f6110bL.f787p), -(mo3291cY() - m1072A.f6110bL.f788q));
                        C0758f.m2140a(f1681dp, mo3290cZ);
                        f1681dp.m5352a(f2, f3);
                        m1072A.f6113bO.mo225a(f1681dp.f234a - 11.0f, f1681dp.f235b, f1681dp.f236c + 11.0f, f1681dp.f235b, paint);
                        m1072A.f6113bO.mo225a(f1681dp.f234a - 11.0f, f1681dp.f237d, f1681dp.f236c + 11.0f, f1681dp.f237d, paint);
                        m1072A.f6113bO.mo225a(f1681dp.f234a, f1681dp.f235b - 11.0f, f1681dp.f234a, f1681dp.f237d + 11.0f, paint);
                        m1072A.f6113bO.mo225a(f1681dp.f236c, f1681dp.f235b - 11.0f, f1681dp.f236c, f1681dp.f237d + 11.0f, paint);
                        return;
                    }
                    return;
                }
                float m1762r = this.f1622ci + m1072A.f6117bS.m1762r(this);
                if (m1072A.m1044a(f2, f3, m1762r)) {
                    m1072A.f6113bO.mo223a(f2, f3, m1762r, paint);
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo2285c(float f) {
        return true;
    }

    /* renamed from: cb */
    public Rect m4357cb() {
        return f1686du;
    }

    /* renamed from: cc */
    public Rect m4356cc() {
        return f1686du;
    }

    /* renamed from: cd */
    public Rect m4355cd() {
        return m4357cb();
    }

    /* renamed from: v */
    public C0934e mo2977v() {
        return null;
    }

    /* renamed from: f */
    public boolean mo2282f(float f) {
        Paint paint;
        C0934e mo2977v = mo2977v();
        if (mo2977v == null) {
            return false;
        }
        if (this.f1607bT) {
            return true;
        }
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6113bO.mo134l();
        float f2 = (int) (this.f6957el - m1072A.f6144cv);
        float f3 = (int) (this.f6958em - m1072A.f6145cw);
        float f4 = f2 * m1072A.f6256cW;
        float f5 = f3 * m1072A.f6256cW;
        if (this.f1644cE) {
            paint = f1596bI;
        } else {
            paint = f1595bH;
        }
        m1072A.f6113bO.mo198a(mo2977v, f4, f5, paint);
        m1072A.f6113bO.mo135k();
        m1072A.m1056Q();
        return true;
    }

    /* renamed from: a */
    public boolean mo2290a(LoggerMaybe loggerMaybe) {
        if (!loggerMaybe.f6251cN.m5345b(this.f6957el, this.f6958em) || this.f1651cL != null) {
            return false;
        }
        if ((this.f1653cN != null && (this.f1653cN.f2479I || this.f1653cN.f2473C)) || !m4336d(loggerMaybe.f6099bs)) {
            return false;
        }
        return true;
    }

    /* renamed from: b_ */
    public boolean m4390b_() {
        return true;
    }

    /* renamed from: ce */
    public final boolean m4354ce() {
        return m4336d(LoggerMaybe.m1072A().f6099bs);
    }

    /* renamed from: d */
    public boolean m4336d(AbstractC0197n abstractC0197n) {
        C0173b c0173b = LoggerMaybe.m1072A().f6110bL;
        if ((this.f1609bV != abstractC0197n || this.f1652cM != null) && c0173b.f841E && abstractC0197n.f1337M != null) {
            c0173b.m4857a(this.f6957el, this.f6958em);
            int i = c0173b.f801T;
            int i2 = c0173b.f802U;
            if (c0173b.m4813c(i, i2) && abstractC0197n.f1337M[i][i2] >= 5) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: cf */
    public boolean m4353cf() {
        return true;
    }

    /* renamed from: c_ */
    public void mo2990c_() {
        if (this.f1607bT) {
            this.f1606bS = false;
        } else {
            this.f1606bS = true;
        }
    }

    /* renamed from: a */
    public void mo1718a(float f) {
        C0745e m2313b;
        if (!this.f1607bT) {
            if (this.f1634cu > 0.0f) {
                if (this.f1634cu > this.f1633ct * 2.0f) {
                    this.f1634cu = this.f1633ct * 2.0f;
                }
                this.f1634cu = C0758f.m2159a(this.f1634cu, f);
            }
            if (this.f1632cs < this.f1633ct * 0.33f && this.f6959en > -1.0f) {
                LoggerMaybe m1072A = LoggerMaybe.m1072A();
                this.f1678dm += f;
                this.f1679dn += f;
                this.f1680do += f;
                if (this.f1678dm > 10.0f && this.f1679dn < 300.0f && !m4325dj()) {
                    this.f1678dm = 0.0f;
                    if (this.f6954ei && m1072A.f6259dc && (m2313b = m1072A.f6116bR.m2313b(this.f6957el, this.f6958em, this.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4832a)) != null) {
                        C0746f.m2287b(m2313b, true);
                        m2313b.f4737J = this.f6957el;
                        m2313b.f4738K = this.f6958em;
                        m2313b.f4739L = this.f6959en;
                        m2313b.f4744Q += C0758f.m2084c(-0.1f, 0.1f) + this.f1614ca;
                        m2313b.f4745R += C0758f.m2084c(-0.1f, 0.1f) + this.f1615cb;
                        m2313b.f4737J += C0758f.m2084c(-4.0f, 4.0f);
                        m2313b.f4738K += C0758f.m2084c(-4.0f, 4.0f);
                    }
                }
                if (this.f1680do > 30.0f && this.f1679dn < 600.0f && !m4324dk()) {
                    this.f1680do = 0.0f;
                    m1072A.f6116bR.m2342a();
                    C0745e m2313b2 = m1072A.f6116bR.m2313b(this.f6957el, this.f6958em, this.f6959en, EnumC0744d.f4707a, false, EnumC0748h.f4832a);
                    if (m2313b2 != null) {
                        C0746f.m2293a(m2313b2, true);
                        m2313b2.f4737J = this.f6957el;
                        m2313b2.f4738K = this.f6958em;
                        m2313b2.f4739L = this.f6959en;
                        m2313b2.f4744Q += C0758f.m2084c(-0.1f, 0.1f);
                        m2313b2.f4745R += C0758f.m2084c(-0.1f, 0.1f);
                        m2313b2.f4737J += C0758f.m2084c(-4.0f, 4.0f);
                        m2313b2.f4738K += C0758f.m2084c(-4.0f, 4.0f);
                    }
                }
            } else if (this.f1679dn != 0.0f) {
                this.f1679dn = 0.0f;
            }
            if (this.f1640cA != 0.0f) {
                this.f1640cA = C0758f.m2159a(this.f1640cA, this.f1633ct * this.f1641cB * 0.005f * f);
                this.f1641cB += f + (0.2f * this.f1641cB * f);
                if (this.f1640cA == 0.0f) {
                    this.f1641cB = 0.0f;
                }
            }
            if (this.f1632cs <= 0.0f) {
                m4352cg();
            }
        }
    }

    /* renamed from: b */
    public float m4408b(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        float f2 = f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        if (c0188f != null) {
            f3 = c0188f.f1037ak;
            f4 = c0188f.f1038al;
            f5 = c0188f.f1039am;
        }
        if (this.f1635cv < this.f1638cy) {
            float f6 = f2 * f3;
            if (this.f1638cy - this.f1635cv > f6) {
                this.f1635cv += f6;
                f2 -= f6 * f4;
            } else {
                this.f1635cv = this.f1638cy;
                f2 -= f6 * f4;
            }
        }
        if (f2 > 0.0f && this.f1632cs < this.f1633ct) {
            float f7 = f2 * f5;
            float f8 = this.f1633ct - this.f1632cs;
            if (f8 > f7) {
                m4306o(this.f1632cs + f7);
                return 0.0f;
            }
            m4306o(this.f1633ct);
            float f9 = f2 - f8;
            return 0.0f;
        }
        return 0.0f;
    }

    /* renamed from: J */
    public boolean mo2997J() {
        return false;
    }

    /* renamed from: a */
    public float mo2994a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f1624ck < 1.0f) {
            f *= 1.75f;
        }
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        if (c0188f != null) {
            f2 = c0188f.f1037ak;
            f3 = c0188f.f1038al;
            f4 = c0188f.f1039am;
        }
        float f5 = f;
        float f6 = 0.0f;
        if (this.f1637cx == 0.0f && this.f1635cv > 0.0f) {
            float f7 = f5 * f2;
            if (this.f1635cv < f7) {
                f5 -= this.f1635cv * f3;
                f6 = 0.0f + this.f1635cv;
                this.f1636cw += this.f1635cv;
                this.f1635cv = 0.0f;
            } else {
                this.f1635cv -= f7;
                this.f1636cw += f7;
                f6 = 0.0f + f7;
                f5 -= f5 * f3;
            }
        }
        if (f5 > 0.0f) {
            float f8 = f5 * f4;
            if (this.f1632cs < f8) {
                f5 -= this.f1632cs;
                float f9 = f6 + this.f1632cs;
                m4306o(0.0f);
                this.f1640cA += this.f1632cs;
            } else {
                m4306o(this.f1632cs - f8);
                float f10 = f6 + f8;
                f5 -= f8;
                this.f1640cA -= f8;
            }
        }
        this.f1578br = m1072A.f6102by;
        if (abstractC0244am != null) {
            this.f1579bs = abstractC0244am;
        } else {
            this.f1579bs = null;
        }
        m4352cg();
        return f5;
    }

    /* renamed from: q */
    public AbstractC0244am m4304q(float f) {
        if (LoggerMaybe.m1072A().f6102by - (f * 1000.0f) < this.f1578br) {
            return this.f1579bs;
        }
        return null;
    }

    /* renamed from: cg */
    public void m4352cg() {
        if (!this.f1607bT && this.f1632cs <= 0.0f) {
            m4387bv();
        }
    }

    /* renamed from: n */
    public void mo3249n() {
    }

    /* renamed from: e */
    public boolean mo2986e() {
        LoggerMaybe.m1072A().f6116bR.m2318b(this.f6957el, this.f6958em, this.f6959en);
        return false;
    }

    /* renamed from: bt */
    public void m4389bt() {
    }

    /* renamed from: bu */
    public void m4388bu() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        m1072A.f6117bS.m1774l(this);
        AbstractC0197n.m4634a(this);
        if (f1590bD.remove(this)) {
        }
        this.f1607bT = true;
        this.f1608bU = m1072A.f6102by;
        if (this.f1632cs > 0.0f) {
            this.f1632cs = 0.0f;
        }
        if (this.f1649cJ != null) {
            int mo3084bl = mo3084bl();
            for (int i = 0; i < mo3084bl; i++) {
                this.f1649cJ[i].f1721j = null;
            }
        }
        m1072A.f6127cc.m3155a(this);
    }

    /* renamed from: ch */
    public void m4351ch() {
        m4388bu();
        mo2635a();
        m4389bt();
    }

    /* renamed from: ci */
    public void m4350ci() {
        this.f1632cs = -1.0f;
    }

    /* renamed from: bv */
    public void m4387bv() {
        m4388bu();
        if (!mo2986e()) {
            mo2635a();
        }
        m4389bt();
    }

    /* renamed from: a */
    public boolean m4430a(RectF rectF) {
        if (this.f6957el + this.f1621ch > rectF.f234a && this.f6957el - this.f1621ch < rectF.f236c && this.f6958em + this.f1621ch > rectF.f235b && this.f6958em - this.f1621ch < rectF.f237d) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m4385c(float f, float f2, float f3) {
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, f, f2);
        float f4 = this.f1621ch + f3;
        if (m2157a < f4 * f4) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m4301t(AbstractC0244am abstractC0244am) {
        float m2157a = C0758f.m2157a(this.f6957el, this.f6958em, abstractC0244am.f6957el, abstractC0244am.f6958em);
        float f = this.f1621ch + abstractC0244am.f1621ch;
        if (m2157a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final void m4435P(int i) {
        AbstractC0197n m4562k = AbstractC0197n.m4562k(i);
        if (m4562k == null) {
            throw new C0179f("Could not find team with id: " + i);
        }
        m4318e(m4562k);
    }

    /* renamed from: e */
    public void m4318e(AbstractC0197n abstractC0197n) {
        if (this.f1609bV == abstractC0197n) {
            return;
        }
        if (abstractC0197n == null) {
            throw new RuntimeException("Could not set team to null");
        }
        if (this.f1609bV != null) {
            AbstractC0197n.m4614b(this);
            this.f1609bV.m4586d(this);
        }
        m4411b(abstractC0197n);
        AbstractC0197n.m4598c(this);
        if (abstractC0197n != AbstractC0197n.f1371i) {
            m4381c(false);
        }
    }

    /* renamed from: b */
    public void m4411b(AbstractC0197n abstractC0197n) {
        if (abstractC0197n == null) {
            throw new RuntimeException("Could not set team to null");
        }
        this.f1609bV = abstractC0197n;
    }

    /* renamed from: Q */
    public final void m4434Q(int i) {
        this.f1609bV = AbstractC0197n.m4562k(i);
        if (this.f1609bV == null) {
            throw new C0179f("Could not find team with id: " + i);
        }
        m4411b(this.f1609bV);
    }

    /* renamed from: N */
    public ArrayList mo3068N() {
        return f1687dv;
    }

    /* renamed from: V */
    public int mo3273V() {
        return 1;
    }

    /* renamed from: a */
    public void mo3067a(AbstractC0224s abstractC0224s, boolean z) {
    }

    /* renamed from: a */
    public void mo3116a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        mo3067a(abstractC0224s, z);
    }

    /* renamed from: b */
    public void m4409b(AbstractC0224s abstractC0224s, boolean z) {
    }

    /* renamed from: b */
    public void m4410b(AbstractC0224s abstractC0224s) {
    }

    /* renamed from: a */
    public AbstractC0224s m4427a(C0208c c0208c) {
        ArrayList mo3068N = mo3068N();
        int size = mo3068N.size();
        for (int i = 0; i < size; i++) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) mo3068N.get(i);
            if (abstractC0224s.m4496d(c0208c)) {
                return abstractC0224s;
            }
        }
        return null;
    }

    /* renamed from: cj */
    public boolean m4349cj() {
        if (m4402bI()) {
            return AbstractC0224s.m4498c(mo3267cl());
        }
        return false;
    }

    /* renamed from: ck */
    public boolean m4348ck() {
        return false;
    }

    /* renamed from: cl */
    public C0208c mo3267cl() {
        return AbstractC0224s.f1462i;
    }

    /* renamed from: cm */
    public float m4347cm() {
        return -1.0f;
    }

    /* renamed from: cn */
    public boolean m4346cn() {
        return false;
    }

    /* renamed from: a */
    public void mo3451a(ArrayList arrayList) {
        arrayList.clear();
    }

    /* renamed from: co */
    public C0208c m4345co() {
        return AbstractC0224s.f1462i;
    }

    /* renamed from: e */
    public AbstractC0224s m4316e(InterfaceC0303as interfaceC0303as) {
        return null;
    }

    /* renamed from: cp */
    public final int m4344cp() {
        int i = 0;
        Iterator it = mo3068N().iterator();
        while (it.hasNext()) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
            if (abstractC0224s.mo3025b(this) || abstractC0224s.mo4475s()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public boolean m4384c(AbstractC0244am abstractC0244am, boolean z) {
        AbstractC0244am abstractC0244am2 = abstractC0244am.f1651cL;
        AbstractC0623y abstractC0623y = abstractC0244am.f1652cM;
        abstractC0244am.f1651cL = null;
        abstractC0244am.f1652cM = null;
        boolean m4335d = m4335d(abstractC0244am, z);
        abstractC0244am.f1651cL = abstractC0244am2;
        abstractC0244am.f1652cM = abstractC0623y;
        return m4335d;
    }

    /* renamed from: d */
    public boolean m4335d(AbstractC0244am abstractC0244am, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean m4317e(AbstractC0244am abstractC0244am, boolean z) {
        return false;
    }

    /* renamed from: cq */
    public boolean m4343cq() {
        return false;
    }

    /* renamed from: cr */
    public boolean m4342cr() {
        return mo2981i();
    }

    /* renamed from: cs */
    public boolean m4341cs() {
        return false;
    }

    /* renamed from: ct */
    public boolean mo3057ct() {
        return false;
    }

    /* renamed from: P */
    public boolean mo2996P() {
        return false;
    }

    /* renamed from: cu */
    public int mo3227cu() {
        return 1;
    }

    /* renamed from: y */
    public int mo3077y() {
        return 85;
    }

    /* renamed from: f */
    public float mo3082f(InterfaceC0303as interfaceC0303as) {
        return interfaceC0303as.mo4261a(this) + mo3077y();
    }

    /* renamed from: u */
    public int mo3079u(AbstractC0244am abstractC0244am) {
        return mo3077y() + abstractC0244am.mo5649r().mo4261a(this);
    }

    /* renamed from: v */
    public int mo3078v(AbstractC0244am abstractC0244am) {
        return mo3077y() + abstractC0244am.mo5649r().mo4261a(this);
    }

    /* renamed from: w */
    public boolean m4300w(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: x */
    public boolean m4299x(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: b */
    public float mo3113b(AbstractC0244am abstractC0244am) {
        return 1.0f;
    }

    /* renamed from: c */
    public float mo3112c(AbstractC0244am abstractC0244am) {
        return 0.2f;
    }

    /* renamed from: y */
    public boolean m4298y(AbstractC0244am abstractC0244am) {
        boolean z = false;
        if (abstractC0244am.mo3250g() > 0.0f) {
            z = true;
        }
        return z;
    }

    /* renamed from: z */
    public float m4297z(AbstractC0244am abstractC0244am) {
        float mo3112c = mo3112c(abstractC0244am) * 5.1f;
        if (abstractC0244am.mo3250g() > 0.0f) {
            mo3112c = abstractC0244am.mo3250g();
        }
        return mo3112c;
    }

    /* renamed from: cv */
    public float m4340cv() {
        return 1.0f;
    }

    /* renamed from: cw */
    public float mo3354cw() {
        return 0.0f;
    }

    /* renamed from: cx */
    public C0439f m4339cx() {
        float mo3354cw = mo3354cw();
        if (mo3354cw == 0.0f) {
            return C0439f.f2801a;
        }
        C0439f c0439f = new C0439f();
        c0439f.m3799b(C0428a.f2762B, mo3354cw);
        return c0439f;
    }

    /* renamed from: cy */
    public C0439f m4338cy() {
        return C0439f.f2801a;
    }

    /* renamed from: cz */
    public String m4337cz() {
        return mo5649r().mo4252i() + "(id:" + this.f6951ee + ")";
    }

    /* renamed from: f */
    public static String m4311f(AbstractC0244am abstractC0244am, boolean z) {
        if (abstractC0244am != null) {
            return abstractC0244am.mo5649r().mo4256e();
        }
        return "No unit";
    }

    /* renamed from: A */
    public static String m4438A(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null) {
            return abstractC0244am.m4380cA();
        }
        return "<null unit>";
    }

    /* renamed from: cA */
    public String m4380cA() {
        String str = mo5649r().mo4252i() + "(pos:" + ((int) this.f6957el) + "," + ((int) this.f6958em) + " id:" + this.f6951ee + VariableScope.nullOrMissingString;
        if (this.f1609bV != null) {
            str = str + " t:" + this.f1609bV.f1306k;
        }
        if (this.f1607bT) {
            str = str + " [dead]";
        }
        if (this.f6952eg) {
            str = str + " [deleted]";
        }
        return str + ")";
    }

    /* renamed from: cB */
    public String m4379cB() {
        String str = (mo5649r().mo4252i() + "(pos:" + ((int) this.f6957el) + "," + ((int) this.f6958em) + " id:" + this.f6951ee + VariableScope.nullOrMissingString) + ", hp:" + this.f1632cs + ", dead:" + this.f1607bT + ", deleted:" + this.f6952eg + " tags:" + m4331dc();
        if (this.f1609bV != null) {
            str = str + " t:" + this.f1609bV.f1306k;
        }
        return str + ")";
    }

    /* renamed from: cC */
    public float m4378cC() {
        return 1.0f;
    }

    /* renamed from: cD */
    public RectF m4377cD() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        float m4378cC = m4378cC();
        f1690dy.m5351a((this.f6957el - (this.f4230er * m4378cC)) - m1072A.f6144cv, (this.f6958em - (this.f4231es * m4378cC)) - m1072A.f6145cw, (this.f6957el + (this.f4230er * m4378cC)) - m1072A.f6144cv, (this.f6958em + (this.f4231es * m4378cC)) - m1072A.f6145cw);
        return f1690dy;
    }

    /* renamed from: cE */
    public RectF mo3370cE() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        RectF rectF = f1690dy;
        float f = m1072A.f6144cv;
        float f2 = m1072A.f6145cw;
        float f3 = this.f4230er;
        float f4 = this.f4231es;
        rectF.f234a = (this.f6957el - f3) - f;
        rectF.f236c = (this.f6957el + f3) - f;
        rectF.f235b = (this.f6958em - f4) - f2;
        rectF.f237d = (this.f6958em + f4) - f2;
        return rectF;
    }

    /* renamed from: cF */
    public boolean m4376cF() {
        return false;
    }

    /* renamed from: a_ */
    public Rect mo3182a_(boolean z) {
        f1692dA.f230a = 0;
        f1692dA.f231b = 0;
        f1692dA.f232c = 0 + this.f4228ep;
        f1692dA.f233d = 0 + this.f4229eq;
        return f1692dA;
    }

    /* renamed from: a */
    public Rect m4417a(boolean z, int i) {
        int i2 = 0 + (i * this.f4228ep);
        f1692dA.m5364a(i2, 0, i2 + this.f4228ep, 0 + this.f4229eq);
        return f1692dA;
    }

    /* renamed from: a */
    public Rect m4416a(boolean z, int i, int i2) {
        int i3 = this.f4228ep;
        int i4 = this.f4229eq;
        int i5 = i * i3;
        int i6 = i2 * i4;
        f1692dA.f230a = i5;
        f1692dA.f231b = i6;
        f1692dA.f232c = i5 + i3;
        f1692dA.f233d = i6 + i4;
        return f1692dA;
    }

    /* renamed from: a */
    public boolean m4426a(AbstractC0244am abstractC0244am, float f) {
        return false;
    }

    /* renamed from: a_ */
    public void m4414a_(String str) {
    }

    /* renamed from: cG */
    public final boolean m4375cG() {
        if (!m4373cI() || this.f6959en > 2.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: cH */
    public boolean m4374cH() {
        return C1117y.m456b(this.f6957el, this.f6958em);
    }

    /* renamed from: cI */
    public boolean m4373cI() {
        return C1117y.m451c(this.f6957el, this.f6958em);
    }

    /* renamed from: cJ */
    public boolean m4372cJ() {
        return C1117y.m449d(this.f6957el, this.f6958em);
    }

    /* renamed from: bw */
    public int m4386bw() {
        return (((0 * 31) + ((int) mo3075bN())) * 31) + ((int) this.f1633ct);
    }

    /* renamed from: cK */
    public int m4371cK() {
        return mo5649r().mo4260b(mo3273V());
    }

    /* renamed from: cL */
    public C0424b m4370cL() {
        return mo5649r().mo4257d(mo3273V());
    }

    /* renamed from: cM */
    public C0424b m4369cM() {
        return null;
    }

    /* renamed from: a */
    public PointF m4433a(float f, float f2, float f3, float f4, float f5) {
        float f6 = 0.0f;
        if (f3 > 0.1d && this.f1648cI) {
            float f7 = 1.0f / f3;
            for (int i = 0; i < 3; i++) {
                PointF m4307m = m4307m(f6);
                f6 = C0758f.m2105b(f, f2, m4307m.f227a, m4307m.f228b) * f7;
            }
        }
        if (f6 > f4) {
            f6 = f4;
        }
        PointF m4307m2 = m4307m(f6);
        float m2157a = C0758f.m2157a(f, f2, m4307m2.f227a, m4307m2.f228b);
        if (f5 >= 0.0f && f5 * f5 < m2157a) {
            float m2071d = C0758f.m2071d(f, f2, m4307m2.f227a, m4307m2.f228b);
            m4307m2.f227a = f + (C0758f.m2040i(m2071d) * f5);
            m4307m2.f228b = f2 + (C0758f.m2045h(m2071d) * f5);
        }
        f1693dB.m5368a(m4307m2);
        return f1693dB;
    }

    /* renamed from: m */
    PointF m4307m(float f) {
        f1694dC.m5369a(this.f6957el + (this.f1614ca * f), this.f6958em + (this.f1615cb * f));
        return f1694dC;
    }

    /* renamed from: o */
    public boolean mo3248o() {
        return false;
    }

    /* renamed from: p */
    public boolean mo3247p() {
        return false;
    }

    /* renamed from: cN */
    public boolean m4368cN() {
        return false;
    }

    /* renamed from: f */
    public void m4312f(AbstractC0197n abstractC0197n) {
        if (mo3247p()) {
            m4411b(AbstractC0197n.f1371i);
        } else {
            m4411b(abstractC0197n);
        }
    }

    /* renamed from: B */
    public void m4437B(AbstractC0244am abstractC0244am) {
        if (abstractC0244am instanceof C0555h) {
            abstractC0244am = null;
        }
        this.f1580bt = abstractC0244am;
    }

    /* renamed from: cO */
    public void m4367cO() {
    }

    /* renamed from: g */
    public float mo3250g() {
        return 0.0f;
    }

    /* renamed from: cP */
    public int m4366cP() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: cQ */
    public C0449h m4365cQ() {
        return null;
    }

    /* renamed from: g */
    public boolean mo3081g(AbstractC0244am abstractC0244am, boolean z) {
        return false;
    }

    /* renamed from: h */
    public boolean m4308h(AbstractC0244am abstractC0244am, boolean z) {
        return mo3081g(abstractC0244am, z);
    }

    /* renamed from: cR */
    public int m4364cR() {
        return 500;
    }

    /* renamed from: c */
    public boolean m4382c(AbstractC0623y abstractC0623y) {
        int m4366cP = m4366cP();
        if (m4366cP < Integer.MAX_VALUE && m4333d(abstractC0623y) >= m4366cP) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public int m4333d(AbstractC0623y abstractC0623y) {
        C0305au m2853ar;
        int i = 0;
        AbstractC0197n abstractC0197n = abstractC0623y.f1609bV;
        AbstractC0244am[] m498a = f1590bD.m498a();
        int size = f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == abstractC0197n && (abstractC0244am instanceof AbstractC0623y) && (m2853ar = ((AbstractC0623y) abstractC0244am).m2853ar()) != null && m2853ar.m4222d() == EnumC0306av.reclaim && m2853ar.f1801h == this && abstractC0244am != abstractC0623y) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m4315e(AbstractC0623y abstractC0623y) {
        C0305au m2853ar;
        int i = 0;
        AbstractC0197n abstractC0197n = abstractC0623y.f1609bV;
        AbstractC0244am[] m498a = f1590bD.m498a();
        int size = f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == abstractC0197n && (abstractC0244am instanceof AbstractC0623y) && (m2853ar = ((AbstractC0623y) abstractC0244am).m2853ar()) != null && m2853ar.m4222d() == EnumC0306av.repair && m2853ar.f1801h == this && abstractC0244am != abstractC0623y) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: bl */
    public int mo3084bl() {
        return 1;
    }

    /* renamed from: u */
    public boolean mo1712u() {
        return false;
    }

    /* renamed from: cS */
    public boolean m4363cS() {
        return mo1712u() || this.f1624ck < 1.0f || this.f1609bV == AbstractC0197n.f1370h;
    }

    /* renamed from: t */
    public boolean mo1713t() {
        return false;
    }

    /* renamed from: cT */
    public boolean m4362cT() {
        return mo1713t();
    }

    /* renamed from: cU */
    public boolean m4361cU() {
        return false;
    }

    /* renamed from: d */
    public boolean mo2987d(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: g */
    public void m4310g(AbstractC0197n abstractC0197n) {
        if (this.f1695dD == null || this.f1695dD.length != AbstractC0197n.f1365c) {
            this.f1695dD = new C0245an[AbstractC0197n.f1365c];
            for (int i = 0; i < this.f1695dD.length; i++) {
                this.f1695dD[i] = new C0245an();
            }
        }
        C0245an c0245an = this.f1695dD[abstractC0197n.f1306k];
        if (this.f1607bT) {
            if (c0245an.f1700a && m4336d(abstractC0197n)) {
                c0245an.f1700a = false;
            }
        } else if (m4336d(abstractC0197n)) {
            c0245an.f1700a = true;
            c0245an.f1701b = mo3273V();
        }
    }

    /* renamed from: cV */
    public void m4360cV() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6099bs != null && this.f1609bV != m1072A.f6099bs && m1072A.f6099bs.f1306k >= 0 && m1072A.f6099bs.f1306k < AbstractC0197n.f1365c) {
            C0245an c0245an = this.f1695dD[m1072A.f6099bs.f1306k];
            if (c0245an.f1702c != null && c0245an.f1702c.f4648c) {
                c0245an.f1702c = null;
            }
            if (c0245an.f1702c == null && c0245an.f1700a && !m4336d(m1072A.f6099bs)) {
                C0741a c0741a = new C0741a();
                c0245an.f1702c = c0741a;
                c0741a.f4649d = mo5649r();
                c0741a.f4652g = this.f6957el;
                c0741a.f4653h = this.f6958em;
                c0741a.f4659n = false;
                c0741a.f4650e = this.f1609bV;
                c0741a.f4651f = c0245an.f1701b;
                c0741a.f4655j = m1072A.f6099bs;
                c0741a.f4666u = m4390b_();
                c0741a.f4667v = this;
            }
        }
    }

    /* renamed from: cW */
    public PointF m4359cW() {
        f1696dE.m5369a(0.0f, 0.0f);
        return f1696dE;
    }

    /* renamed from: cX */
    public float mo3292cX() {
        return LoggerMaybe.m1072A().f6110bL.f787p;
    }

    /* renamed from: cY */
    public float mo3291cY() {
        return LoggerMaybe.m1072A().f6110bL.f788q;
    }

    /* renamed from: cZ */
    public float mo3290cZ() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        return m1072A.f6110bL.f787p + 2 + m1072A.f6117bS.m1762r(this);
    }

    /* renamed from: a */
    public Point m4429a(C0173b c0173b, Point point) {
        point.f224a = (int) (((this.f6957el - mo3292cX()) + 1.0f) * c0173b.f789r);
        point.f225b = (int) (((this.f6958em - mo3291cY()) + 1.0f) * c0173b.f790s);
        return point;
    }

    /* renamed from: a */
    public RectF m4428a(C0173b c0173b, RectF rectF) {
        c0173b.m4853a((int) (((this.f6957el - mo3292cX()) + 1.0f) * c0173b.f789r), (int) (((this.f6958em - mo3291cY()) + 1.0f) * c0173b.f790s));
        float f = c0173b.f801T;
        float f2 = c0173b.f802U;
        Rect m4356cc = m4356cc();
        rectF.m5351a(f + (m4356cc.f230a * c0173b.f785n), f2 + (m4356cc.f231b * c0173b.f786o), f + ((m4356cc.f232c + 1) * c0173b.f785n), f2 + ((m4356cc.f233d + 1) * c0173b.f786o));
        return rectF;
    }

    /* renamed from: da */
    public void m4332da() {
    }

    /* renamed from: db */
    public boolean mo3226db() {
        return false;
    }

    /* renamed from: q */
    public boolean mo3245q() {
        return false;
    }

    /* renamed from: dc */
    public C0449h m4331dc() {
        return null;
    }

    /* renamed from: dd */
    public C0439f mo1715dd() {
        return this.f1697dF;
    }

    /* renamed from: a */
    public double m4421a(C0428a c0428a) {
        return this.f1697dF.m3815a(c0428a);
    }

    /* renamed from: de */
    public C0418c m4330de() {
        return this.f1698dG;
    }

    /* renamed from: df */
    public C0449h m4329df() {
        return null;
    }

    /* renamed from: bd */
    public float mo3294bd() {
        return 0.0f;
    }

    /* renamed from: dg */
    public void m4328dg() {
    }

    /* renamed from: dh */
    public void m4327dh() {
    }

    /* renamed from: di */
    public boolean m4326di() {
        return false;
    }

    /* renamed from: dj */
    public boolean m4325dj() {
        return mo4171bO();
    }

    /* renamed from: dk */
    public boolean m4324dk() {
        return mo4171bO();
    }

    /* renamed from: dl */
    public final C0399m m4323dl() {
        return this.f1653cN;
    }

    public String toString() {
        return "unit(id=" + this.f6951ee + ",type=" + mo5649r().mo4252i() + ")";
    }

    /* renamed from: r */
    public void m4303r(float f) {
        if (f >= 1.0f) {
            if (!(this.f1624ck >= 1.0f)) {
                AbstractC0197n.m4614b(this);
                this.f1624ck = 1.0f;
                AbstractC0197n.m4598c(this);
                return;
            }
            return;
        }
        if (this.f1624ck >= 1.0f) {
            AbstractC0197n.m4614b(this);
            this.f1624ck = f;
            AbstractC0197n.m4598c(this);
            return;
        }
        this.f1624ck = f;
    }

    /* renamed from: a */
    public final void m4424a(EnumC0347ae enumC0347ae) {
        m4422a(enumC0347ae, (AbstractC0244am) null, (C0449h) null, (VariableScope) null);
    }

    /* renamed from: a */
    public final void m4423a(EnumC0347ae enumC0347ae, AbstractC0244am abstractC0244am) {
        m4422a(enumC0347ae, abstractC0244am, (C0449h) null, (VariableScope) null);
    }

    /* renamed from: a */
    public void m4422a(EnumC0347ae enumC0347ae, AbstractC0244am abstractC0244am, C0449h c0449h, VariableScope variableScope) {
    }

    /* renamed from: h */
    public void m4309h(float f) {
        this.f1618ce = f;
    }

    /* renamed from: a */
    public int m4420a(C0448g c0448g) {
        return 0;
    }

    /* renamed from: e */
    public C1101m m4314e(boolean z) {
        return null;
    }

    /* renamed from: a */
    public boolean mo3173a(int i, int i2) {
        return false;
    }

    /* renamed from: c */
    public void m4381c(boolean z) {
    }

    /* renamed from: dm */
    public float m4322dm() {
        return this.f1621ch;
    }

    /* renamed from: dn */
    public boolean m4321dn() {
        return true;
    }

    /* renamed from: bC */
    public void m4406bC() {
    }

    /* renamed from: do */
    public final C0424b m4320do() {
        return this.f1699dH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.corrodinggames.rts.game.units.am] */
    /* renamed from: dp */
    public final AbstractC0244am m4319dp() {
        AbstractC0623y abstractC0623y = this.f1652cM;
        if (abstractC0623y == null && this.f1651cL != null) {
            abstractC0623y = this.f1651cL;
        }
        return abstractC0623y;
    }

    /* renamed from: f */
    public void m4313f(float f, float f2) {
        this.f6957el = f;
        this.f6958em = f2;
        m4381c(true);
    }
}
