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
import com.corrodinggames.rts.gameFramework.Core;
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
    public abstract EnumC0246ao mo3039h();

    /* renamed from: i */
    public abstract boolean mo3038i();

    /* renamed from: Q */
    public abstract boolean mo3054Q();

    /* renamed from: aj */
    public abstract boolean m4770aj();

    /* renamed from: ak */
    public abstract boolean m4769ak();

    /* renamed from: p_ */
    public abstract boolean mo3348p_();

    /* renamed from: r */
    public abstract InterfaceC0303as mo1758r();

    /* renamed from: l */
    public abstract boolean mo3036l();

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f1599bL);
        streamWriter.mo1333a(this.f1603bP);
        streamWriter.mo1333a(this.f1604bQ);
        streamWriter.mo1335a(this.f1605bR);
        streamWriter.mo1329a(this.f1606bS);
        streamWriter.mo1329a(this.f1607bT);
        streamWriter.m1424a(this.f1608bU);
        streamWriter.m1422a(this.f1609bV);
        streamWriter.mo1335a(this.f1611bX);
        streamWriter.mo1335a(this.f1612bY);
        streamWriter.mo1335a(this.f1614ca);
        streamWriter.mo1335a(this.f1615cb);
        streamWriter.mo1335a(this.f1617cd);
        streamWriter.mo1335a(this.f1618ce);
        streamWriter.mo1335a(this.f1621ch);
        streamWriter.mo1335a(this.f1622ci);
        streamWriter.mo1335a(this.f1623cj);
        streamWriter.mo1335a(this.f1624ck);
        streamWriter.mo1329a(this.f1627cn);
        streamWriter.mo1329a(this.f1630cq);
        streamWriter.mo1335a(this.f1632cs);
        streamWriter.mo1335a(this.f1633ct);
        streamWriter.mo1329a(this.f1648cI);
        streamWriter.mo1335a(this.f1649cJ[0].f1712a);
        streamWriter.mo1335a(this.f1649cJ[0].f1715d);
        streamWriter.mo1333a(this.f1651cL);
        streamWriter.m1401c(26);
        streamWriter.WriteInteger(this.f1658cS);
        streamWriter.mo1335a(this.f1659cT);
        streamWriter.mo1335a(this.f1616cc);
        streamWriter.mo1335a(this.f1619cf);
        int mo3169bl = mo3169bl();
        streamWriter.WriteInteger(mo3169bl);
        for (int i = 0; i < mo3169bl; i++) {
            C0247ap c0247ap = this.f1649cJ[i];
            streamWriter.mo1335a(c0247ap.f1712a);
            streamWriter.mo1335a(c0247ap.f1714c);
            streamWriter.mo1335a(c0247ap.f1715d);
            streamWriter.mo1335a(c0247ap.f1716e);
            streamWriter.mo1335a(c0247ap.f1717f);
            streamWriter.mo1335a(c0247ap.f1719h);
            streamWriter.mo1335a(c0247ap.f1720i);
            AbstractC0244am abstractC0244am = c0247ap.f1721j;
            if (abstractC0244am != null && abstractC0244am.f1607bT) {
                abstractC0244am = null;
            }
            streamWriter.mo1333a(abstractC0244am);
            streamWriter.mo1329a(this.f1650cK);
        }
        streamWriter.WriteInteger(this.f1578br);
        streamWriter.mo1335a(this.f1635cv);
        streamWriter.mo1335a(this.f1636cw);
        streamWriter.mo1335a(this.f1637cx);
        streamWriter.mo1335a(this.f1638cy);
        streamWriter.mo1329a(this.f1628co);
        streamWriter.mo1329a(this.f1629cp);
        streamWriter.mo1329a(this.f1631cr);
        streamWriter.mo1329a(this.f1600bM);
        streamWriter.mo1335a(this.f1639cz);
        streamWriter.mo1329a(this.f1620cg);
        streamWriter.mo1329a(this.f1695dD != null);
        if (this.f1695dD != null) {
            streamWriter.WriteInteger(this.f1695dD.length);
            for (int i2 = 0; i2 < this.f1695dD.length; i2++) {
                C0245an c0245an = this.f1695dD[i2];
                streamWriter.mo1329a(c0245an.f1700a);
                streamWriter.WriteInteger(c0245an.f1701b);
            }
        }
        streamWriter.mo1335a(this.f1634cu);
        streamWriter.m1406b(this.f1579bs);
        streamWriter.WriteInteger(this.f1642cC);
        streamWriter.WriteInteger(this.f1643cD);
        streamWriter.WriteInteger(this.f1585by);
        streamWriter.WriteInteger(this.f1586bz);
        streamWriter.WriteInteger(this.f1587bA);
        streamWriter.WriteInteger(this.f1588bB);
        streamWriter.mo1329a(this.f1601bN);
        streamWriter.mo1329a(this.f1602bO);
        this.f1697dF.m4012a(streamWriter);
        this.f1698dG.m4130a(streamWriter);
        streamWriter.m1406b((AbstractC0244am) this.f1652cM);
        short s = -1;
        if (this.f1652cM != null && this.f1653cN != null) {
            s = this.f1653cN.m4184a();
        }
        streamWriter.mo1330a(s);
        streamWriter.WriteInteger(this.f1654cO);
        VariableScope.writeOutUnitOrPlaceholder(streamWriter, this.f1580bt);
        VariableScope.writeOutUnitOrPlaceholder(streamWriter, this.f1581bu);
        VariableScope.writeOut(streamWriter, this.f1582bv);
        C0424b.m4109a(streamWriter, this.f1583bw);
        C0424b.m4109a(streamWriter, this.f1584bx);
        streamWriter.mo1335a(this.f1625cl);
        super.mo2441a(streamWriter);
    }

    /* renamed from: a */
    public void m4779a(Reader reader) {
        C0399m m2956a;
        this.f1599bL = reader.ReadBool();
        this.f1603bP = reader.m1292o();
        this.f1604bQ = reader.m1292o();
        this.f1605bR = reader.m1300g();
        this.f1606bS = reader.ReadBool();
        this.f1607bT = reader.ReadBool();
        this.f1608bU = reader.m1298i();
        m4768b(reader.m1289r());
        this.f1611bX = reader.m1300g();
        this.f1612bY = reader.m1300g();
        this.f1614ca = reader.m1300g();
        this.f1615cb = reader.m1300g();
        this.f1617cd = reader.m1300g();
        this.f1618ce = reader.m1300g();
        reader.m1300g();
        reader.m1300g();
        this.f1623cj = reader.m1300g();
        this.f1624ck = reader.m1300g();
        this.f1627cn = reader.ReadBool();
        this.f1630cq = reader.ReadBool();
        m4650o(reader.m1300g());
        this.f1633ct = reader.m1300g();
        this.f1648cI = reader.ReadBool();
        this.f1649cJ[0].f1712a = reader.m1300g();
        this.f1649cJ[0].f1715d = reader.m1300g();
        this.f1651cL = reader.m1292o();
        byte m1304d = reader.m1304d();
        if (m1304d >= 1) {
            this.f1658cS = reader.ReadInt();
            this.f1659cT = reader.m1300g();
        }
        if (m1304d >= 2) {
            this.f1616cc = reader.m1300g();
            this.f1619cf = reader.m1300g();
            int ReadInt = reader.ReadInt();
            m4799O(ReadInt);
            for (int i = 0; i < ReadInt; i++) {
                C0247ap c0247ap = this.f1649cJ[i];
                c0247ap.f1712a = reader.m1300g();
                c0247ap.f1714c = reader.m1300g();
                c0247ap.f1715d = reader.m1300g();
                c0247ap.f1716e = reader.m1300g();
                c0247ap.f1717f = reader.m1300g();
                if (m1304d >= 8) {
                    c0247ap.f1719h = reader.m1300g();
                    c0247ap.f1720i = reader.m1300g();
                    c0247ap.f1721j = reader.m1292o();
                }
                if (m1304d >= 12) {
                    this.f1650cK = reader.ReadBool();
                }
            }
        }
        if (m1304d >= 3) {
            this.f1578br = reader.ReadInt();
        }
        if (m1304d >= 4) {
            this.f1635cv = reader.m1300g();
            this.f1636cw = reader.m1300g();
            this.f1637cx = reader.m1300g();
            this.f1638cy = reader.m1300g();
        }
        if (m1304d >= 5) {
            this.f1628co = reader.ReadBool();
            this.f1629cp = reader.ReadBool();
        }
        if (m1304d >= 6) {
            this.f1631cr = reader.ReadBool();
        }
        if (m1304d >= 7) {
            this.f1600bM = reader.ReadBool();
        }
        if (m1304d >= 9) {
            this.f1639cz = reader.m1300g();
        }
        if (m1304d >= 10) {
            this.f1620cg = reader.ReadBool();
        }
        if (m1304d >= 11 && reader.ReadBool()) {
            this.f1695dD = new C0245an[reader.ReadInt()];
            for (int i2 = 0; i2 < this.f1695dD.length; i2++) {
                this.f1695dD[i2] = new C0245an();
                C0245an c0245an = this.f1695dD[i2];
                c0245an.f1700a = reader.ReadBool();
                c0245an.f1701b = reader.ReadInt();
            }
        }
        if (m1304d >= 13) {
            this.f1634cu = reader.m1300g();
        }
        if (m1304d >= 14) {
            this.f1579bs = reader.m1292o();
        }
        if (m1304d >= 15) {
            this.f1642cC = reader.ReadInt();
            this.f1643cD = reader.ReadInt();
        }
        if (m1304d >= 16) {
            this.f1585by = reader.ReadInt();
            this.f1586bz = reader.ReadInt();
            this.f1587bA = reader.ReadInt();
        }
        if (m1304d >= 17) {
            this.f1588bB = reader.ReadInt();
        }
        if (m1304d >= 18) {
            this.f1601bN = reader.ReadBool();
            this.f1602bO = reader.ReadBool();
        }
        if (m1304d >= 19) {
            this.f1697dF.m4011a(reader);
            this.f1698dG.m4134a(this, reader);
        }
        if (m1304d >= 20) {
            AbstractC0623y m1291p = reader.m1291p();
            short m1285v = reader.m1285v();
            if (m1285v != -1) {
                boolean z = false;
                if (m1291p != null && (this instanceof AbstractC0623y) && (m2956a = m1291p.m2956a(m1285v)) != null && m1291p.m2963a((AbstractC0623y) this, m2956a)) {
                    z = true;
                }
                if (!z) {
                    m4699ci();
                }
            }
        }
        if (m1304d >= 21) {
            this.f1654cO = reader.ReadInt();
        }
        if (m1304d >= 22) {
            if (m1304d < 24) {
                throw new IOException("extension >=22 but <24");
            }
            this.f1580bt = VariableScope.readInUnitOrPlaceholder(reader);
            this.f1581bu = VariableScope.readInUnitOrPlaceholder(reader);
        }
        if (m1304d >= 23) {
            this.f1582bv = VariableScope.readIn(reader);
        }
        if (m1304d >= 25) {
            this.f1583bw = C0424b.m4108a(reader);
            this.f1584bx = C0424b.m4108a(reader);
        }
        if (m1304d >= 26) {
            this.f1625cl = reader.m1300g();
        }
        if (this.f1607bT) {
            Core m1087A = Core.m1087A();
            f1590bD.remove(this);
            m1087A.f6127cc.m3253a(this);
        }
        super.m2686a(reader);
    }

    /* renamed from: a */
    public static C0934e m4778a(C0934e c0934e) {
        return m4777a(c0934e, c0934e.mo386m(), c0934e.mo387l());
    }

    /* renamed from: a */
    public static C0934e m4777a(C0934e c0934e, int i, int i2) {
        C0934e mo61a = c0934e.mo61a(i, i2, false);
        c0934e.mo43x();
        mo61a.mo52j();
        int mo386m = mo61a.mo386m();
        int mo387l = mo61a.mo387l();
        for (int i3 = 0; i3 < mo386m; i3++) {
            for (int i4 = 0; i4 < mo387l; i4++) {
                mo61a.mo62a(i3, i4, Color.m5948a(Color.m5950a(c0934e.mo63a(i3, i4)), 0, 0, 0));
            }
        }
        mo61a.mo48p();
        mo61a.mo45s();
        c0934e.mo42y();
        mo61a.m895a("shadow:" + c0934e.mo64a());
        mo61a.f6401n = true;
        return mo61a;
    }

    static {
        f1595bH.mo5914a(true);
        f1595bH.m5933a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_8);
        f1596bI = new C0930ag();
        f1596bI.mo5914a(true);
        f1597bJ = new LightingColorFilter(Color.m5949a(255, 255, 255), Color.m5949a(100, 100, 100));
        f1596bI.m5933a(255, 255, 255, 255);
        f1596bI.m5930a(f1597bJ);
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
        f1660cU.m5926a(Paint.Style.f220b);
        f1660cU.m5936a(2.0f);
        m4793a(f1660cU);
        f1661cV.m5933a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1661cV.m5926a(Paint.Style.f220b);
        f1661cV.m5936a(2.0f);
        m4792a(f1661cV, true);
        f1662cW.m5933a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 255, 0);
        f1662cW.m5926a(Paint.Style.f220b);
        f1662cW.m5936a(2.0f);
        m4793a(f1662cW);
        f1663cX.m5933a(130, 0, 255, 0);
        f1663cX.m5926a(Paint.Style.f220b);
        f1663cX.m5936a(2.0f);
        m4793a(f1663cX);
        f1667db.m5933a(70, 0, 255, 0);
        f1667db.m5926a(Paint.Style.f220b);
        f1667db.m5936a(1.0f);
        m4793a(f1667db);
        f1664cY.m5933a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 0, 0);
        f1664cY.m5926a(Paint.Style.f220b);
        f1664cY.m5936a(2.0f);
        m4793a(f1664cY);
        f1668dc.m5933a(70, 255, 0, 0);
        f1668dc.m5926a(Paint.Style.f220b);
        f1668dc.m5936a(1.0f);
        m4793a(f1668dc);
        f1666da.m5933a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 0);
        f1666da.m5926a(Paint.Style.f220b);
        f1666da.m5936a(2.0f);
        m4793a(f1666da);
        f1669dd.m5933a(70, 255, 255, 0);
        f1669dd.m5926a(Paint.Style.f220b);
        f1669dd.m5936a(1.0f);
        m4793a(f1669dd);
        f1665cZ.m5933a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 255, 255, 255);
        f1665cZ.m5926a(Paint.Style.f220b);
        f1665cZ.m5936a(2.0f);
        m4793a(f1665cZ);
        f1670de.m5933a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1670de.m5926a(Paint.Style.f220b);
        f1670de.m5936a(1.0f);
        m4793a(f1670de);
        f1671df.m5933a(100, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
        f1671df.m5926a(Paint.Style.f220b);
        f1671df.m5936a(2.0f);
        m4793a(f1671df);
        f1672dg.m5933a(90, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 0, 0);
        f1672dg.m5926a(Paint.Style.f220b);
        f1672dg.m5936a(1.0f);
        m4793a(f1672dg);
        f1673dh.m5926a(Paint.Style.f220b);
        f1674di.m5926a(Paint.Style.f220b);
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
    public static C1104o m4761bF() {
        f1591a.m524a();
        return f1591a;
    }

    /* renamed from: bG */
    public static void m4760bG() {
        f1591a.m524a();
    }

    /* renamed from: bH */
    public static void m4759bH() {
        AbstractC0529j.m3291dq();
        AbstractC0488d.m3529dq();
        AbstractC0525h.m3315K();
        AbstractC0590f.m3134L();
        AbstractC0309b.m4426K();
        if (Core.m1087A().m1013ar()) {
            Iterator it = EnumSet.allOf(EnumC0249ar.class).iterator();
            while (it.hasNext()) {
                ((EnumC0249ar) it.next()).m4616b();
            }
        } else {
            C0519b.m3344K();
            C0505p.m3409b();
            C0510r.m3380dr();
            C0243al.m4808b();
        }
        EnumC0249ar.m4612t();
    }

    /* renamed from: bI */
    public boolean m4758bI() {
        return false;
    }

    /* renamed from: bJ */
    public boolean m4757bJ() {
        return false;
    }

    /* renamed from: bK */
    public static HashMap m4756bK() {
        HashMap hashMap = new HashMap();
        if (Core.m1087A().m1013ar()) {
            Iterator it = EnumSet.allOf(EnumC0249ar.class).iterator();
            while (it.hasNext()) {
                EnumC0249ar enumC0249ar = (EnumC0249ar) it.next();
                AbstractC0244am m4617a = enumC0249ar.m4617a(true);
                m4617a.mo2689a();
                m4617a.m4768b(AbstractC0197n.f1371i);
                m4617a.f1627cn = true;
                hashMap.put(enumC0249ar, m4617a);
            }
        }
        Iterator it2 = C0453l.f3188d.iterator();
        while (it2.hasNext()) {
            C0453l c0453l = (C0453l) it2.next();
            AbstractC0244am m3708a = c0453l.m3708a(true);
            m3708a.mo2689a();
            m3708a.m4768b(AbstractC0197n.f1371i);
            m3708a.f1627cn = true;
            hashMap.put(c0453l, m3708a);
        }
        return hashMap;
    }

    /* renamed from: bL */
    public static void m4755bL() {
        f1593bF = m4756bK();
        f1594bG = m4756bK();
        f1592bE = m4756bK();
    }

    /* renamed from: a */
    public static AbstractC0244am m4785a(InterfaceC0303as interfaceC0303as) {
        return (AbstractC0244am) f1592bE.get(interfaceC0303as);
    }

    /* renamed from: b */
    public static AbstractC0244am m4763b(InterfaceC0303as interfaceC0303as) {
        return m4736c(interfaceC0303as);
    }

    /* renamed from: c */
    public static AbstractC0244am m4736c(InterfaceC0303as interfaceC0303as) {
        AbstractC0244am abstractC0244am = (AbstractC0244am) f1593bF.get(interfaceC0303as);
        if (abstractC0244am == null) {
            if (C0453l.f2903b == null) {
                Core.LogDebug2("Could not find:" + interfaceC0303as.mo4474i() + " and missing place holder is null");
                return null;
            }
            abstractC0244am = (AbstractC0244am) f1593bF.get(C0453l.f2903b);
            if (abstractC0244am == null) {
                Core.LogDebug2("name: " + C0453l.f2903b.f2922L);
                Core.LogDebug2("contains:" + f1593bF.containsKey(C0453l.f2903b));
                Iterator it = f1593bF.keySet().iterator();
                while (it.hasNext()) {
                    Core.LogDebug2("has:" + ((InterfaceC0303as) it.next()).mo4474i());
                }
                Core.LogDebug2("Could not find:" + interfaceC0303as.mo4474i() + " and missing place holder could not be found");
            }
        }
        return abstractC0244am;
    }

    /* renamed from: d */
    public static AbstractC0244am m4679d(InterfaceC0303as interfaceC0303as) {
        AbstractC0244am abstractC0244am = (AbstractC0244am) f1594bG.get(interfaceC0303as);
        if (abstractC0244am == null) {
            abstractC0244am = (AbstractC0244am) f1594bG.get(C0453l.f2903b);
        }
        return abstractC0244am;
    }

    /* renamed from: bM */
    public static int m4754bM() {
        int i = 0;
        if (Core.m1087A().m1013ar()) {
            Iterator it = EnumSet.allOf(EnumC0249ar.class).iterator();
            while (it.hasNext()) {
                i = (i * 31) + m4785a((EnumC0249ar) it.next()).m4740bw();
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
        m4752bR();
        if (!z) {
            this.f1598bK = true;
            f1590bD.mo494a(this);
            f1591a.m520a(this);
        }
        this.f1585by = Core.m1087A().f6102by;
        this.f1689dx = mo1758r();
    }

    /* renamed from: a */
    public void mo2689a() {
        AbstractC0197n.m5089a(this);
        if (this.f1598bK) {
            f1590bD.remove(this);
            f1591a.m517b(this);
        }
        Core.m1087A().f6117bS.m1818l(this);
        super.mo2689a();
    }

    /* renamed from: bN */
    public float mo3158bN() {
        return 3000.0f;
    }

    /* renamed from: s */
    public int m4646s(AbstractC0244am abstractC0244am) {
        return 0;
    }

    /* renamed from: bO */
    public boolean mo4386bO() {
        return false;
    }

    /* renamed from: bP */
    public boolean mo4385bP() {
        return false;
    }

    /* renamed from: bQ */
    public float m4753bQ() {
        return -1.0f;
    }

    /* renamed from: o */
    public void m4650o(float f) {
        this.f1632cs = f;
    }

    /* renamed from: bR */
    public void m4752bR() {
        m4799O(1);
    }

    /* renamed from: O */
    public void m4799O(int i) {
        int length;
        int mo3169bl = mo3169bl();
        if (mo3169bl < i) {
            mo3169bl = i;
        }
        if (this.f1649cJ == null) {
            length = 0;
            this.f1649cJ = new C0247ap[mo3169bl];
        } else if (this.f1649cJ.length < mo3169bl) {
            length = this.f1649cJ.length;
            this.f1649cJ = (C0247ap[]) Arrays.copyOf(this.f1649cJ, mo3169bl);
        } else {
            return;
        }
        for (int i2 = length; i2 < this.f1649cJ.length; i2++) {
            this.f1649cJ[i2] = new C0247ap();
        }
    }

    /* renamed from: a */
    public static void m4793a(Paint paint) {
        m4792a(paint, false);
    }

    /* renamed from: a */
    public static void m4792a(Paint paint, boolean z) {
        if (!Core.m1010au() && z) {
            paint.m5936a(0.0f);
        }
    }

    /* renamed from: d */
    public float mo3317d(boolean z) {
        return this.f1618ce + 90.0f;
    }

    /* renamed from: bS */
    public final boolean m4751bS() {
        return this.f1651cL == null && this.f1624ck >= 1.0f;
    }

    /* renamed from: a_ */
    public float m4772a_() {
        if (this.f1632cs < this.f1633ct) {
            return this.f1632cs / this.f1633ct;
        }
        return -1.0f;
    }

    /* renamed from: bT */
    public boolean m4750bT() {
        return true;
    }

    /* renamed from: bU */
    public float m4749bU() {
        if (this.f1624ck < 1.0f) {
            if (this.f1652cM == null || this.f1652cM.f1624ck >= 1.0f) {
                return this.f1624ck;
            }
            return -1.0f;
        }
        return -1.0f;
    }

    /* renamed from: bV */
    public float mo3289bV() {
        return -1.0f;
    }

    /* renamed from: bW */
    public boolean mo3288bW() {
        return false;
    }

    /* renamed from: bX */
    public int m4748bX() {
        return -1;
    }

    /* renamed from: bY */
    public int m4747bY() {
        return -1;
    }

    /* renamed from: a */
    public void mo3053a(float f, boolean z) {
        float f2;
        int m2152b;
        int m2152b2;
        int m2152b3;
        int m2152b4;
        if (this.f1607bT || this.f1651cL != null) {
            return;
        }
        Core m1087A = Core.m1087A();
        float f3 = this.f1621ch;
        if (z) {
            return;
        }
        boolean z2 = false;
        int m4748bX = m4748bX();
        if (m4749bU() >= 0.0f) {
            z2 = true;
        }
        if (mo3289bV() >= 0.0f) {
            z2 = true;
        }
        if (this.f1644cE || m1087A.settingEngine.showHp) {
            if (m4772a_() >= 0.0f) {
                z2 = true;
            }
            if (m4748bX >= 0) {
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        float f4 = this.f6958el - m1087A.f6144cv;
        float f5 = (this.f6959em - m1087A.f6145cw) - this.f6960en;
        float f6 = f3 + 4.0f;
        int i = 4;
        float f7 = 2.0f * f3;
        if (this.f1626cm) {
            f2 = 1.0f;
        } else {
            f2 = m1087A.f6256cW;
        }
        if (f2 < 1.0f) {
            m1087A.f6113bO.mo135k();
            m1087A.m1070R();
            f4 *= m1087A.f6256cW;
            f5 *= m1087A.f6256cW;
            f6 *= m1087A.f6256cW;
        }
        float f8 = 3.0f;
        if (this.f1644cE || m1087A.settingEngine.showHp) {
            if (m4772a_() >= 0.0f) {
                boolean z3 = false;
                boolean z4 = false;
                C0399m m4668dl = m4668dl();
                if (m4668dl != null) {
                    z3 = m4668dl.f2471p;
                    z4 = m4668dl.f2472q;
                }
                if (!z4) {
                    if (m1087A.f6099bs.m5054c(this.f1609bV)) {
                        m2152b = C0758f.m2152b(200, 183, 44, 44);
                        m2152b2 = C0758f.m2152b(120, 255, 60, 60);
                    } else {
                        m2152b = C0758f.m2152b(200, 0, 150, 0);
                        m2152b2 = C0758f.m2152b(120, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0);
                    }
                    Paint m473a = C1117y.m473a(m2152b, Paint.Style.f219a);
                    Paint m473a2 = C1117y.m473a(m2152b2, Paint.Style.f220b);
                    int i2 = 4;
                    if (z3) {
                        i2 = 1;
                    }
                    f1681dp.m5861a(f4 - f3, f5 + f6, (f4 - f3) + (f7 * m4772a_()), f5 + f6 + i2);
                    m1087A.f6113bO.mo205a(f1681dp, m473a);
                    f1681dp.m5861a(f4 - f3, f5 + f6, (f4 - f3) + f7, f5 + f6 + i2);
                    m1087A.f6113bO.mo205a(f1681dp, m473a2);
                    if (this.f1640cA != 0.0f && m4750bT() && m1087A.settingEngine.showHpChanges) {
                        float m4772a_ = m4772a_();
                        float f9 = m4772a_ + ((-this.f1640cA) / this.f1633ct);
                        if (f9 < 0.0f) {
                            f9 = 0.0f;
                        }
                        if (f9 >= 1.0f) {
                            f9 = 1.0f;
                        }
                        Paint m473a3 = C1117y.m473a(C0758f.m2152b(100, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 208, 26), Paint.Style.f219a);
                        f1681dp.m5861a((f4 - f3) + (f7 * m4772a_), f5 + f6, (f4 - f3) + (f7 * f9), f5 + f6 + i2);
                        m1087A.f6113bO.mo205a(f1681dp, m473a3);
                    }
                }
            }
            if (m4748bX >= 0) {
                int m4747bY = m4747bY();
                float f10 = f7;
                if (m4747bY > 10) {
                    f10 += 20.0f;
                }
                float f11 = f4 - (f10 / 2.0f);
                float f12 = (int) ((f10 / m4747bY) + 0.5f);
                float f13 = f12 - 2.0f;
                for (int i3 = 1; i3 <= m4747bY; i3++) {
                    float f14 = f11 + ((i3 - 1) * f12);
                    f1681dp.m5861a(f14, f5 + f6 + 3.0f, f14 + f13, f5 + f6 + 3.0f + 3.0f);
                    if (m4748bX >= i3) {
                        m1087A.f6113bO.mo205a(f1681dp, C1117y.m474a((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 0, 0, 255, Paint.Style.f219a));
                    }
                    m1087A.f6113bO.mo205a(f1681dp, C1117y.m474a(110, 0, 0, 210, Paint.Style.f220b));
                }
                f8 = 3.0f + 5.0f;
            }
        }
        if (mo3289bV() >= 0.0f) {
            int i4 = 2 + 1;
            boolean mo3288bW = mo3288bW();
            f1681dp.m5861a(f4 - f3, f5 + f6 + i4 + f8, (f4 - f3) + (f7 * mo3289bV()), f5 + f6 + i4 + 2 + f8);
            if (mo3288bW) {
                m2152b3 = C0758f.m2152b((int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 103, 117, 119);
            } else {
                m2152b3 = C0758f.m2152b(200, 23, 179, 207);
            }
            m1087A.f6113bO.mo205a(f1681dp, C1117y.m473a(m2152b3, Paint.Style.f219a));
            f1681dp.m5861a(f4 - f3, f5 + f6 + i4 + f8, (f4 - f3) + f7, f5 + f6 + i4 + 2 + f8);
            if (mo3288bW) {
                m2152b4 = C0758f.m2152b(105, 123, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_6);
            } else {
                m2152b4 = C0758f.m2152b(120, 45, 211, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_NETWORK);
            }
            m1087A.f6113bO.mo205a(f1681dp, C1117y.m473a(m2152b4, Paint.Style.f220b));
            f8 += 2;
            i = 4;
        }
        if (m4749bU() >= 0.0f) {
            int i5 = i + 1;
            f1681dp.m5861a(f4 - f3, f5 + f6 + i5 + f8, (f4 - f3) + (f7 * m4749bU()), f5 + f6 + i5 + i + f8);
            m1087A.f6113bO.mo205a(f1681dp, C1117y.m474a(200, 0, 0, 150, Paint.Style.f219a));
            f1681dp.m5861a(f4 - f3, f5 + f6 + i5 + f8, (f4 - f3) + f7, f5 + f6 + i5 + i + f8);
            m1087A.f6113bO.mo205a(f1681dp, C1117y.m474a(120, 0, 0, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, Paint.Style.f220b));
            float f15 = f8 + i;
        }
        if (f2 < 1.0f) {
            m1087A.f6113bO.mo134l();
        }
    }

    /* renamed from: d */
    public void m4682d(float f) {
    }

    /* renamed from: p */
    public void m4649p(float f) {
        if (!this.f1607bT && this.f1651cL == null && this.f1644cE) {
            Core m1087A = Core.m1087A();
            if (this.f1609bV == m1087A.f6099bs || m1087A.f6117bS.m1816m(this)) {
                if (m1087A.settingEngine.showUnitWaypoints && m1087A.f6170dv <= 40) {
                    m1087A.f6170dv++;
                    m4800O();
                }
                m4746bZ();
            }
            if (C1117y.m471a(this)) {
                m4707ca();
            }
        }
    }

    /* renamed from: bZ */
    public void m4746bZ() {
    }

    /* renamed from: O */
    public void m4800O() {
        Core m1087A = Core.m1087A();
        C0305au c0305au = null;
        C0305au c0305au2 = null;
        if (this instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) this;
            int m2905av = abstractC0623y.m2905av();
            float f = this.f6958el;
            float f2 = this.f6959em;
            for (int i = 0; i < m2905av; i++) {
                C0305au m2816k = abstractC0623y.m2816k(i);
                if (m2816k != null) {
                    if (Core.m1010au()) {
                        f1682dq.m5936a(2.0f);
                    } else {
                        f1682dq.m5936a(0.0f);
                    }
                    if (m2816k.m4444d() == EnumC0306av.f1812b) {
                        f1682dq.m5908b(Color.m5948a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 0));
                    } else if (m2816k.m4444d() == EnumC0306av.f1818h) {
                        f1682dq.m5908b(Color.m5948a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    } else if (m2816k.m4444d() == EnumC0306av.f1813c) {
                        f1682dq.m5908b(Color.m5948a(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m2816k.m4444d() == EnumC0306av.f1814d) {
                        f1682dq.m5908b(Color.m5948a(160, 0, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m2816k.m4444d() == EnumC0306av.f1815e || m2816k.m4444d() == EnumC0306av.f1819i) {
                        f1682dq.m5908b(Color.m5948a(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    } else if (m2816k.m4444d() == EnumC0306av.f1817g) {
                        f1682dq.m5908b(Color.m5948a(160, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0, 42));
                    } else if (m2816k.m4444d() == EnumC0306av.f1821k || m2816k.m4444d() == EnumC0306av.f1822l) {
                        f1682dq.m5908b(Color.m5948a(160, 97, 20, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL));
                    } else if (m2816k.m4444d() == EnumC0306av.f1820j) {
                        f1682dq.m5908b(Color.m5948a(160, 0, 210, 210));
                        if (c0305au == null) {
                            c0305au = m2816k;
                        } else {
                            c0305au2 = m2816k;
                        }
                    } else {
                        f1682dq.m5908b(Color.m5948a(160, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0));
                    }
                    float m4438g = m2816k.m4438g();
                    float m4436h = m2816k.m4436h();
                    AbstractC0244am m4434i = m2816k.m4434i();
                    if (m4434i != null && m2816k.m4440f() && !m4434i.m4758bI() && !m4434i.m4681d(m1087A.f6099bs)) {
                        float m2123d = C0758f.m2123d(f, f2, m4438g, m4436h);
                        m4438g = f + (C0758f.m2092i(m2123d) * 400.0f);
                        m4436h = f2 + (C0758f.m2097h(m2123d) * 400.0f);
                    }
                    m1087A.f6113bO.mo225a(f - m1087A.f6144cv, f2 - m1087A.f6145cw, m4438g - m1087A.f6144cv, m4436h - m1087A.f6145cw, f1682dq);
                    if (0 != 0) {
                        float m2157b = C0758f.m2157b(f, f2, m4438g, m4436h);
                        float m2123d2 = C0758f.m2123d(f, f2, m4438g, m4436h);
                        float f3 = m1087A.f6117bS.f5202aN * m2157b;
                        float m2092i = f + (C0758f.m2092i(m2123d2) * f3);
                        float m2097h = f2 + (C0758f.m2097h(m2123d2) * f3);
                        f1681dp.m5861a(m2092i - 1.0f, m2097h - 1.0f, m2092i + 1.0f, m2097h + 1.0f);
                        f1681dp.m5862a(-m1087A.f6144cv, -m1087A.f6145cw);
                        m1087A.f6113bO.mo205a(f1681dp, f1682dq);
                    }
                    f = m4438g;
                    f2 = m4436h;
                }
            }
        }
        if (c0305au != null && c0305au2 != null && c0305au != c0305au2) {
            f1682dq.m5908b(Color.m5948a(50, 0, 210, 210));
            C0305au c0305au3 = c0305au;
            m1087A.f6113bO.mo225a(c0305au2.m4438g() - m1087A.f6144cv, c0305au2.m4436h() - m1087A.f6145cw, c0305au3.m4438g() - m1087A.f6144cv, c0305au3.m4436h() - m1087A.f6145cw, f1682dq);
        }
    }

    /* renamed from: ca */
    public void m4707ca() {
    }

    /* renamed from: e */
    public void mo3151e(float f) {
        Paint paint;
        boolean z = false;
        if (this.f1647cH != 0.0f) {
            this.f1647cH = C0758f.m2211a(this.f1647cH, f);
            if (this.f1647cH % 15.0f < 7.0f) {
                z = true;
            }
        }
        if (this.f1644cE || z) {
            Core m1087A = Core.m1087A();
            if (m4666dn()) {
                float f2 = this.f6958el - m1087A.f6144cv;
                float f3 = (this.f6959em - m1087A.f6145cw) - this.f6960en;
                AbstractC0197n abstractC0197n = m1087A.f6099bs;
                if (abstractC0197n == this.f1609bV) {
                    if (this.f1622ci < 8.0f) {
                        paint = f1661cV;
                    } else {
                        paint = f1662cW;
                    }
                } else if (abstractC0197n.m5054c(this.f1609bV)) {
                    paint = f1664cY;
                } else if (this.f1609bV != null && m1087A.f6126cb.m2464h()) {
                    f1660cU.m5908b(AbstractC0197n.m5021i(this.f1609bV.f1312q));
                    paint = f1660cU;
                } else {
                    paint = f1666da;
                }
                if (z) {
                    paint = f1665cZ;
                }
                if (m4758bI()) {
                    if (paint == f1662cW) {
                        paint = f1663cX;
                    }
                    Rect m4704cd = m4704cd();
                    if (m4704cd != null) {
                        f1681dp.m5860a(m4704cd);
                        f1681dp.f235b *= m1087A.f6110bL.f786o;
                        f1681dp.f237d *= m1087A.f6110bL.f786o;
                        f1681dp.f234a *= m1087A.f6110bL.f785n;
                        f1681dp.f236c *= m1087A.f6110bL.f785n;
                        float m4708cZ = m4708cZ();
                        f1681dp.m5862a(-(m4710cX() - m1087A.f6110bL.f787p), -(m4709cY() - m1087A.f6110bL.f788q));
                        C0758f.m2192a(f1681dp, m4708cZ);
                        f1681dp.m5862a(f2, f3);
                        m1087A.f6113bO.mo225a(f1681dp.f234a - 11.0f, f1681dp.f235b, f1681dp.f236c + 11.0f, f1681dp.f235b, paint);
                        m1087A.f6113bO.mo225a(f1681dp.f234a - 11.0f, f1681dp.f237d, f1681dp.f236c + 11.0f, f1681dp.f237d, paint);
                        m1087A.f6113bO.mo225a(f1681dp.f234a, f1681dp.f235b - 11.0f, f1681dp.f234a, f1681dp.f237d + 11.0f, paint);
                        m1087A.f6113bO.mo225a(f1681dp.f236c, f1681dp.f235b - 11.0f, f1681dp.f236c, f1681dp.f237d + 11.0f, paint);
                        return;
                    }
                    return;
                }
                float m1806r = this.f1622ci + m1087A.f6117bS.m1806r(this);
                if (m1087A.m1059a(f2, f3, m1806r)) {
                    m1087A.f6113bO.mo223a(f2, f3, m1806r, paint);
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo3049c(float f) {
        return true;
    }

    /* renamed from: cb */
    public Rect m4706cb() {
        return f1686du;
    }

    /* renamed from: cc */
    public Rect m4705cc() {
        return f1686du;
    }

    /* renamed from: cd */
    public Rect m4704cd() {
        return m4706cb();
    }

    /* renamed from: v */
    public C0934e mo3034v() {
        return null;
    }

    /* renamed from: f */
    public boolean m4658f(float f) {
        Paint paint;
        C0934e mo3034v = mo3034v();
        if (mo3034v == null) {
            return false;
        }
        if (this.f1607bT) {
            return true;
        }
        Core m1087A = Core.m1087A();
        m1087A.f6113bO.mo134l();
        float f2 = (int) (this.f6958el - m1087A.f6144cv);
        float f3 = (int) (this.f6959em - m1087A.f6145cw);
        float f4 = f2 * m1087A.f6256cW;
        float f5 = f3 * m1087A.f6256cW;
        if (this.f1644cE) {
            paint = f1596bI;
        } else {
            paint = f1595bH;
        }
        m1087A.f6113bO.mo198a(mo3034v, f4, f5, paint);
        m1087A.f6113bO.mo135k();
        m1087A.m1071Q();
        return true;
    }

    /* renamed from: a */
    public boolean m4776a(Core core) {
        if (!core.f6251cN.m5855b(this.f6958el, this.f6959em) || this.f1651cL != null) {
            return false;
        }
        if ((this.f1653cN != null && (this.f1653cN.f2483I || this.f1653cN.f2480C)) || !m4681d(core.f6099bs)) {
            return false;
        }
        return true;
    }

    /* renamed from: b_ */
    public boolean m4745b_() {
        return true;
    }

    /* renamed from: ce */
    public final boolean m4703ce() {
        return m4681d(Core.m1087A().f6099bs);
    }

    /* renamed from: d */
    public boolean m4681d(AbstractC0197n abstractC0197n) {
        C0173b c0173b = Core.m1087A().f6110bL;
        if ((this.f1609bV != abstractC0197n || this.f1652cM != null) && c0173b.f841E && abstractC0197n.f1337M != null) {
            c0173b.m5344a(this.f6958el, this.f6959em);
            int i = c0173b.f801T;
            int i2 = c0173b.f802U;
            if (c0173b.m5300c(i, i2) && abstractC0197n.f1337M[i][i2] >= 5) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: cf */
    public boolean m4702cf() {
        return true;
    }

    /* renamed from: c_ */
    public void mo3047c_() {
        if (this.f1607bT) {
            this.f1606bS = false;
        } else {
            this.f1606bS = true;
        }
    }

    /* renamed from: a */
    public void mo1762a(float f) {
        C0745e m2365b;
        if (!this.f1607bT) {
            if (this.f1634cu > 0.0f) {
                if (this.f1634cu > this.f1633ct * 2.0f) {
                    this.f1634cu = this.f1633ct * 2.0f;
                }
                this.f1634cu = C0758f.m2211a(this.f1634cu, f);
            }
            if (this.f1632cs < this.f1633ct * 0.33f && this.f6960en > -1.0f) {
                Core m1087A = Core.m1087A();
                this.f1678dm += f;
                this.f1679dn += f;
                this.f1680do += f;
                if (this.f1678dm > 10.0f && this.f1679dn < 300.0f && !m4670dj()) {
                    this.f1678dm = 0.0f;
                    if (this.f6955ei && m1087A.f6259dc && (m2365b = m1087A.f6116bR.m2365b(this.f6958el, this.f6959em, this.f6960en, EnumC0744d.f4707a, false, EnumC0748h.f4832a)) != null) {
                        C0746f.m2339b(m2365b, true);
                        m2365b.f4753J = this.f6958el;
                        m2365b.f4754K = this.f6959em;
                        m2365b.f4755L = this.f6960en;
                        m2365b.f4760Q += C0758f.m2136c(-0.1f, 0.1f) + this.f1614ca;
                        m2365b.f4761R += C0758f.m2136c(-0.1f, 0.1f) + this.f1615cb;
                        m2365b.f4753J += C0758f.m2136c(-4.0f, 4.0f);
                        m2365b.f4754K += C0758f.m2136c(-4.0f, 4.0f);
                    }
                }
                if (this.f1680do > 30.0f && this.f1679dn < 600.0f && !m4669dk()) {
                    this.f1680do = 0.0f;
                    m1087A.f6116bR.m2394a();
                    C0745e m2365b2 = m1087A.f6116bR.m2365b(this.f6958el, this.f6959em, this.f6960en, EnumC0744d.f4707a, false, EnumC0748h.f4832a);
                    if (m2365b2 != null) {
                        C0746f.m2345a(m2365b2, true);
                        m2365b2.f4753J = this.f6958el;
                        m2365b2.f4754K = this.f6959em;
                        m2365b2.f4755L = this.f6960en;
                        m2365b2.f4760Q += C0758f.m2136c(-0.1f, 0.1f);
                        m2365b2.f4761R += C0758f.m2136c(-0.1f, 0.1f);
                        m2365b2.f4753J += C0758f.m2136c(-4.0f, 4.0f);
                        m2365b2.f4754K += C0758f.m2136c(-4.0f, 4.0f);
                    }
                }
            } else if (this.f1679dn != 0.0f) {
                this.f1679dn = 0.0f;
            }
            if (this.f1640cA != 0.0f) {
                this.f1640cA = C0758f.m2211a(this.f1640cA, this.f1633ct * this.f1641cB * 0.005f * f);
                this.f1641cB += f + (0.2f * this.f1641cB * f);
                if (this.f1640cA == 0.0f) {
                    this.f1641cB = 0.0f;
                }
            }
            if (this.f1632cs <= 0.0f) {
                m4701cg();
            }
        }
    }

    /* renamed from: b */
    public float m4764b(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
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
                m4650o(this.f1632cs + f7);
                return 0.0f;
            }
            m4650o(this.f1633ct);
            float f9 = f2 - f8;
            return 0.0f;
        }
        return 0.0f;
    }

    /* renamed from: J */
    public boolean mo3056J() {
        return false;
    }

    /* renamed from: a */
    public float mo3052a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        Core m1087A = Core.m1087A();
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
                m4650o(0.0f);
                this.f1640cA += this.f1632cs;
            } else {
                m4650o(this.f1632cs - f8);
                float f10 = f6 + f8;
                f5 -= f8;
                this.f1640cA -= f8;
            }
        }
        this.f1578br = m1087A.f6102by;
        if (abstractC0244am != null) {
            this.f1579bs = abstractC0244am;
        } else {
            this.f1579bs = null;
        }
        m4701cg();
        return f5;
    }

    /* renamed from: q */
    public AbstractC0244am m4648q(float f) {
        if (Core.m1087A().f6102by - (f * 1000.0f) < this.f1578br) {
            return this.f1579bs;
        }
        return null;
    }

    /* renamed from: cg */
    public void m4701cg() {
        if (!this.f1607bT && this.f1632cs <= 0.0f) {
            m4741bv();
        }
    }

    /* renamed from: n */
    public void mo3351n() {
    }

    /* renamed from: e */
    public boolean mo3043e() {
        Core.m1087A().f6116bR.m2370b(this.f6958el, this.f6959em, this.f6960en);
        return false;
    }

    /* renamed from: bt */
    public void m4743bt() {
    }

    /* renamed from: bu */
    public void m4742bu() {
        Core m1087A = Core.m1087A();
        m1087A.f6117bS.m1818l(this);
        AbstractC0197n.m5089a(this);
        if (f1590bD.remove(this)) {
        }
        this.f1607bT = true;
        this.f1608bU = m1087A.f6102by;
        if (this.f1632cs > 0.0f) {
            this.f1632cs = 0.0f;
        }
        if (this.f1649cJ != null) {
            int mo3169bl = mo3169bl();
            for (int i = 0; i < mo3169bl; i++) {
                this.f1649cJ[i].f1721j = null;
            }
        }
        m1087A.f6127cc.m3253a(this);
    }

    /* renamed from: ch */
    public void m4700ch() {
        m4742bu();
        mo2689a();
        m4743bt();
    }

    /* renamed from: ci */
    public void m4699ci() {
        this.f1632cs = -1.0f;
    }

    /* renamed from: bv */
    public void m4741bv() {
        m4742bu();
        if (!mo3043e()) {
            mo2689a();
        }
        m4743bt();
    }

    /* renamed from: a */
    public boolean m4791a(RectF rectF) {
        if (this.f6958el + this.f1621ch > rectF.f234a && this.f6958el - this.f1621ch < rectF.f236c && this.f6959em + this.f1621ch > rectF.f235b && this.f6959em - this.f1621ch < rectF.f237d) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m4739c(float f, float f2, float f3) {
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, f, f2);
        float f4 = this.f1621ch + f3;
        if (m2209a < f4 * f4) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m4645t(AbstractC0244am abstractC0244am) {
        float m2209a = C0758f.m2209a(this.f6958el, this.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em);
        float f = this.f1621ch + abstractC0244am.f1621ch;
        if (m2209a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final void m4798P(int i) {
        AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
        if (m5017k == null) {
            throw new C0179f("Could not find team with id: " + i);
        }
        m4663e(m5017k);
    }

    /* renamed from: e */
    public void m4663e(AbstractC0197n abstractC0197n) {
        if (this.f1609bV == abstractC0197n) {
            return;
        }
        if (abstractC0197n == null) {
            throw new RuntimeException("Could not set team to null");
        }
        if (this.f1609bV != null) {
            AbstractC0197n.m5069b(this);
            this.f1609bV.m5041d(this);
        }
        m4768b(abstractC0197n);
        AbstractC0197n.m5053c(this);
        if (abstractC0197n != AbstractC0197n.f1371i) {
            m4734c(false);
        }
    }

    /* renamed from: b */
    public void m4768b(AbstractC0197n abstractC0197n) {
        if (abstractC0197n == null) {
            throw new RuntimeException("Could not set team to null");
        }
        this.f1609bV = abstractC0197n;
    }

    /* renamed from: Q */
    public final void m4797Q(int i) {
        this.f1609bV = AbstractC0197n.m5017k(i);
        if (this.f1609bV == null) {
            throw new C0179f("Could not find team with id: " + i);
        }
        m4768b(this.f1609bV);
    }

    /* renamed from: N */
    public ArrayList mo3174N() {
        return f1687dv;
    }

    /* renamed from: V */
    public int m4796V() {
        return 1;
    }

    /* renamed from: a */
    public void mo3173a(AbstractC0224s abstractC0224s, boolean z) {
    }

    /* renamed from: a */
    public void m4787a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        mo3173a(abstractC0224s, z);
    }

    /* renamed from: b */
    public void m4766b(AbstractC0224s abstractC0224s, boolean z) {
    }

    /* renamed from: b */
    public void m4767b(AbstractC0224s abstractC0224s) {
    }

    /* renamed from: a */
    public AbstractC0224s m4788a(C0208c c0208c) {
        ArrayList mo3174N = mo3174N();
        int size = mo3174N.size();
        for (int i = 0; i < size; i++) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) mo3174N.get(i);
            if (abstractC0224s.m4893d(c0208c)) {
                return abstractC0224s;
            }
        }
        return null;
    }

    /* renamed from: cj */
    public boolean m4698cj() {
        if (m4758bI()) {
            return AbstractC0224s.m4896c(m4696cl());
        }
        return false;
    }

    /* renamed from: ck */
    public boolean m4697ck() {
        return false;
    }

    /* renamed from: cl */
    public C0208c m4696cl() {
        return AbstractC0224s.f1462i;
    }

    /* renamed from: cm */
    public float m4695cm() {
        return -1.0f;
    }

    /* renamed from: cn */
    public boolean m4694cn() {
        return false;
    }

    /* renamed from: a */
    public void m4775a(ArrayList arrayList) {
        arrayList.clear();
    }

    /* renamed from: co */
    public C0208c m4693co() {
        return AbstractC0224s.f1462i;
    }

    /* renamed from: e */
    public AbstractC0224s m4661e(InterfaceC0303as interfaceC0303as) {
        return null;
    }

    /* renamed from: cp */
    public final int m4692cp() {
        int i = 0;
        Iterator it = mo3174N().iterator();
        while (it.hasNext()) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
            if (abstractC0224s.mo3084b(this) || abstractC0224s.mo4924s()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public boolean m4737c(AbstractC0244am abstractC0244am, boolean z) {
        AbstractC0244am abstractC0244am2 = abstractC0244am.f1651cL;
        AbstractC0623y abstractC0623y = abstractC0244am.f1652cM;
        abstractC0244am.f1651cL = null;
        abstractC0244am.f1652cM = null;
        boolean m4680d = m4680d(abstractC0244am, z);
        abstractC0244am.f1651cL = abstractC0244am2;
        abstractC0244am.f1652cM = abstractC0623y;
        return m4680d;
    }

    /* renamed from: d */
    public boolean m4680d(AbstractC0244am abstractC0244am, boolean z) {
        return false;
    }

    /* renamed from: e */
    public boolean m4662e(AbstractC0244am abstractC0244am, boolean z) {
        return false;
    }

    /* renamed from: cq */
    public boolean m4691cq() {
        return false;
    }

    /* renamed from: cr */
    public boolean m4690cr() {
        return mo3038i();
    }

    /* renamed from: cs */
    public boolean m4689cs() {
        return false;
    }

    /* renamed from: ct */
    public boolean m4688ct() {
        return false;
    }

    /* renamed from: P */
    public boolean mo3055P() {
        return false;
    }

    /* renamed from: cu */
    public int mo3328cu() {
        return 1;
    }

    /* renamed from: y */
    public int mo3161y() {
        return 85;
    }

    /* renamed from: f */
    public float mo3167f(InterfaceC0303as interfaceC0303as) {
        return interfaceC0303as.mo4483a(this) + mo3161y();
    }

    /* renamed from: u */
    public int mo3164u(AbstractC0244am abstractC0244am) {
        return mo3161y() + abstractC0244am.mo1758r().mo4483a(this);
    }

    /* renamed from: v */
    public int mo3163v(AbstractC0244am abstractC0244am) {
        return mo3161y() + abstractC0244am.mo1758r().mo4483a(this);
    }

    /* renamed from: w */
    public boolean m4644w(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: x */
    public boolean m4643x(AbstractC0244am abstractC0244am) {
        return false;
    }

    /* renamed from: b */
    public float m4765b(AbstractC0244am abstractC0244am) {
        return 1.0f;
    }

    /* renamed from: c */
    public float m4738c(AbstractC0244am abstractC0244am) {
        return 0.2f;
    }

    /* renamed from: y */
    public boolean m4642y(AbstractC0244am abstractC0244am) {
        boolean z = false;
        if (abstractC0244am.mo3352g() > 0.0f) {
            z = true;
        }
        return z;
    }

    /* renamed from: z */
    public float m4641z(AbstractC0244am abstractC0244am) {
        float m4738c = m4738c(abstractC0244am) * 5.1f;
        if (abstractC0244am.mo3352g() > 0.0f) {
            m4738c = abstractC0244am.mo3352g();
        }
        return m4738c;
    }

    /* renamed from: cv */
    public float m4687cv() {
        return 1.0f;
    }

    /* renamed from: cw */
    public float m4686cw() {
        return 0.0f;
    }

    /* renamed from: cx */
    public C0439f m4685cx() {
        float m4686cw = m4686cw();
        if (m4686cw == 0.0f) {
            return C0439f.f2801a;
        }
        C0439f c0439f = new C0439f();
        c0439f.m4006b(C0428a.f2762B, m4686cw);
        return c0439f;
    }

    /* renamed from: cy */
    public C0439f m4684cy() {
        return C0439f.f2801a;
    }

    /* renamed from: cz */
    public String m4683cz() {
        return mo1758r().mo4474i() + "(id:" + this.f6951ee + ")";
    }

    /* renamed from: f */
    public static String m4655f(AbstractC0244am abstractC0244am, boolean z) {
        if (abstractC0244am != null) {
            return abstractC0244am.mo1758r().mo4478e();
        }
        return "No unit";
    }

    /* renamed from: A */
    public static String m4802A(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null) {
            return abstractC0244am.m4733cA();
        }
        return "<null unit>";
    }

    /* renamed from: cA */
    public String m4733cA() {
        String str = mo1758r().mo4474i() + "(pos:" + ((int) this.f6958el) + "," + ((int) this.f6959em) + " id:" + this.f6951ee + VariableScope.nullOrMissingString;
        if (this.f1609bV != null) {
            str = str + " t:" + this.f1609bV.f1306k;
        }
        if (this.f1607bT) {
            str = str + " [dead]";
        }
        if (this.f6953eg) {
            str = str + " [deleted]";
        }
        return str + ")";
    }

    /* renamed from: cB */
    public String m4732cB() {
        String str = (mo1758r().mo4474i() + "(pos:" + ((int) this.f6958el) + "," + ((int) this.f6959em) + " id:" + this.f6951ee + VariableScope.nullOrMissingString) + ", hp:" + this.f1632cs + ", dead:" + this.f1607bT + ", deleted:" + this.f6953eg + " tags:" + m4676dc();
        if (this.f1609bV != null) {
            str = str + " t:" + this.f1609bV.f1306k;
        }
        return str + ")";
    }

    /* renamed from: cC */
    public float m4731cC() {
        return 1.0f;
    }

    /* renamed from: cD */
    public RectF m4730cD() {
        Core m1087A = Core.m1087A();
        float m4731cC = m4731cC();
        f1690dy.m5861a((this.f6958el - (this.f4230er * m4731cC)) - m1087A.f6144cv, (this.f6959em - (this.f4231es * m4731cC)) - m1087A.f6145cw, (this.f6958el + (this.f4230er * m4731cC)) - m1087A.f6144cv, (this.f6959em + (this.f4231es * m4731cC)) - m1087A.f6145cw);
        return f1690dy;
    }

    /* renamed from: cE */
    public RectF m4729cE() {
        Core m1087A = Core.m1087A();
        RectF rectF = f1690dy;
        float f = m1087A.f6144cv;
        float f2 = m1087A.f6145cw;
        float f3 = this.f4230er;
        float f4 = this.f4231es;
        rectF.f234a = (this.f6958el - f3) - f;
        rectF.f236c = (this.f6958el + f3) - f;
        rectF.f235b = (this.f6959em - f4) - f2;
        rectF.f237d = (this.f6959em + f4) - f2;
        return rectF;
    }

    /* renamed from: cF */
    public boolean m4728cF() {
        return false;
    }

    /* renamed from: a_ */
    public Rect mo3282a_(boolean z) {
        f1692dA.f230a = 0;
        f1692dA.f231b = 0;
        f1692dA.f232c = 0 + this.f4228ep;
        f1692dA.f233d = 0 + this.f4229eq;
        return f1692dA;
    }

    /* renamed from: a */
    public Rect m4774a(boolean z, int i) {
        int i2 = 0 + (i * this.f4228ep);
        f1692dA.m5874a(i2, 0, i2 + this.f4228ep, 0 + this.f4229eq);
        return f1692dA;
    }

    /* renamed from: a */
    public Rect m4773a(boolean z, int i, int i2) {
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
    public boolean m4786a(AbstractC0244am abstractC0244am, float f) {
        return false;
    }

    /* renamed from: a_ */
    public void m4771a_(String str) {
    }

    /* renamed from: cG */
    public final boolean m4727cG() {
        if (!m4725cI() || this.f6960en > 2.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: cH */
    public boolean m4726cH() {
        return C1117y.m456b(this.f6958el, this.f6959em);
    }

    /* renamed from: cI */
    public boolean m4725cI() {
        return C1117y.m451c(this.f6958el, this.f6959em);
    }

    /* renamed from: cJ */
    public boolean m4724cJ() {
        return C1117y.m449d(this.f6958el, this.f6959em);
    }

    /* renamed from: bw */
    public int m4740bw() {
        return (((0 * 31) + ((int) mo3158bN())) * 31) + ((int) this.f1633ct);
    }

    /* renamed from: cK */
    public int m4723cK() {
        return mo1758r().mo4482b(m4796V());
    }

    /* renamed from: cL */
    public C0424b m4722cL() {
        return mo1758r().mo4479d(m4796V());
    }

    /* renamed from: cM */
    public C0424b m4721cM() {
        return null;
    }

    /* renamed from: a */
    public PointF m4795a(float f, float f2, float f3, float f4, float f5) {
        float f6 = 0.0f;
        if (f3 > 0.1d && this.f1648cI) {
            float f7 = 1.0f / f3;
            for (int i = 0; i < 3; i++) {
                PointF m4651m = m4651m(f6);
                f6 = C0758f.m2157b(f, f2, m4651m.f227a, m4651m.f228b) * f7;
            }
        }
        if (f6 > f4) {
            f6 = f4;
        }
        PointF m4651m2 = m4651m(f6);
        float m2209a = C0758f.m2209a(f, f2, m4651m2.f227a, m4651m2.f228b);
        if (f5 >= 0.0f && f5 * f5 < m2209a) {
            float m2123d = C0758f.m2123d(f, f2, m4651m2.f227a, m4651m2.f228b);
            m4651m2.f227a = f + (C0758f.m2092i(m2123d) * f5);
            m4651m2.f228b = f2 + (C0758f.m2097h(m2123d) * f5);
        }
        f1693dB.m5878a(m4651m2);
        return f1693dB;
    }

    /* renamed from: m */
    PointF m4651m(float f) {
        f1694dC.m5879a(this.f6958el + (this.f1614ca * f), this.f6959em + (this.f1615cb * f));
        return f1694dC;
    }

    /* renamed from: o */
    public boolean mo3350o() {
        return false;
    }

    /* renamed from: p */
    public boolean mo3349p() {
        return false;
    }

    /* renamed from: cN */
    public boolean m4720cN() {
        return false;
    }

    /* renamed from: f */
    public void m4656f(AbstractC0197n abstractC0197n) {
        if (mo3349p()) {
            m4768b(AbstractC0197n.f1371i);
        } else {
            m4768b(abstractC0197n);
        }
    }

    /* renamed from: B */
    public void m4801B(AbstractC0244am abstractC0244am) {
        if (abstractC0244am instanceof C0555h) {
            abstractC0244am = null;
        }
        this.f1580bt = abstractC0244am;
    }

    /* renamed from: cO */
    public void m4719cO() {
    }

    /* renamed from: g */
    public float mo3352g() {
        return 0.0f;
    }

    /* renamed from: cP */
    public int m4718cP() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: cQ */
    public C0449h m4717cQ() {
        return null;
    }

    /* renamed from: g */
    public boolean mo3166g(AbstractC0244am abstractC0244am, boolean z) {
        return false;
    }

    /* renamed from: h */
    public boolean m4652h(AbstractC0244am abstractC0244am, boolean z) {
        return mo3166g(abstractC0244am, z);
    }

    /* renamed from: cR */
    public int m4716cR() {
        return 500;
    }

    /* renamed from: c */
    public boolean m4735c(AbstractC0623y abstractC0623y) {
        int m4718cP = m4718cP();
        if (m4718cP < Integer.MAX_VALUE && m4678d(abstractC0623y) >= m4718cP) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public int m4678d(AbstractC0623y abstractC0623y) {
        C0305au m2909ar;
        int i = 0;
        AbstractC0197n abstractC0197n = abstractC0623y.f1609bV;
        AbstractC0244am[] m498a = f1590bD.m498a();
        int size = f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == abstractC0197n && (abstractC0244am instanceof AbstractC0623y) && (m2909ar = ((AbstractC0623y) abstractC0244am).m2909ar()) != null && m2909ar.m4444d() == EnumC0306av.f1817g && m2909ar.f1804h == this && abstractC0244am != abstractC0623y) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m4660e(AbstractC0623y abstractC0623y) {
        C0305au m2909ar;
        int i = 0;
        AbstractC0197n abstractC0197n = abstractC0623y.f1609bV;
        AbstractC0244am[] m498a = f1590bD.m498a();
        int size = f1590bD.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m498a[i2];
            if (abstractC0244am.f1609bV == abstractC0197n && (abstractC0244am instanceof AbstractC0623y) && (m2909ar = ((AbstractC0623y) abstractC0244am).m2909ar()) != null && m2909ar.m4444d() == EnumC0306av.f1814d && m2909ar.f1804h == this && abstractC0244am != abstractC0623y) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: bl */
    public int mo3169bl() {
        return 1;
    }

    /* renamed from: u */
    public boolean mo1756u() {
        return false;
    }

    /* renamed from: cS */
    public boolean m4715cS() {
        return mo1756u() || this.f1624ck < 1.0f || this.f1609bV == AbstractC0197n.f1370h;
    }

    /* renamed from: t */
    public boolean mo1757t() {
        return false;
    }

    /* renamed from: cT */
    public boolean m4714cT() {
        return mo1757t();
    }

    /* renamed from: cU */
    public boolean m4713cU() {
        return false;
    }

    /* renamed from: d */
    public boolean mo3044d(AbstractC0244am abstractC0244am) {
        return true;
    }

    /* renamed from: g */
    public void m4654g(AbstractC0197n abstractC0197n) {
        if (this.f1695dD == null || this.f1695dD.length != AbstractC0197n.f1365c) {
            this.f1695dD = new C0245an[AbstractC0197n.f1365c];
            for (int i = 0; i < this.f1695dD.length; i++) {
                this.f1695dD[i] = new C0245an();
            }
        }
        C0245an c0245an = this.f1695dD[abstractC0197n.f1306k];
        if (this.f1607bT) {
            if (c0245an.f1700a && m4681d(abstractC0197n)) {
                c0245an.f1700a = false;
            }
        } else if (m4681d(abstractC0197n)) {
            c0245an.f1700a = true;
            c0245an.f1701b = m4796V();
        }
    }

    /* renamed from: cV */
    public void m4712cV() {
        Core m1087A = Core.m1087A();
        if (m1087A.f6099bs != null && this.f1609bV != m1087A.f6099bs && m1087A.f6099bs.f1306k >= 0 && m1087A.f6099bs.f1306k < AbstractC0197n.f1365c) {
            C0245an c0245an = this.f1695dD[m1087A.f6099bs.f1306k];
            if (c0245an.f1702c != null && c0245an.f1702c.f4648c) {
                c0245an.f1702c = null;
            }
            if (c0245an.f1702c == null && c0245an.f1700a && !m4681d(m1087A.f6099bs)) {
                C0741a c0741a = new C0741a();
                c0245an.f1702c = c0741a;
                c0741a.f4649d = mo1758r();
                c0741a.f4652g = this.f6958el;
                c0741a.f4653h = this.f6959em;
                c0741a.f4659n = false;
                c0741a.f4650e = this.f1609bV;
                c0741a.f4651f = c0245an.f1701b;
                c0741a.f4655j = m1087A.f6099bs;
                c0741a.f4666u = m4745b_();
                c0741a.f4667v = this;
            }
        }
    }

    /* renamed from: cW */
    public PointF m4711cW() {
        f1696dE.m5879a(0.0f, 0.0f);
        return f1696dE;
    }

    /* renamed from: cX */
    public float m4710cX() {
        return Core.m1087A().f6110bL.f787p;
    }

    /* renamed from: cY */
    public float m4709cY() {
        return Core.m1087A().f6110bL.f788q;
    }

    /* renamed from: cZ */
    public float m4708cZ() {
        Core m1087A = Core.m1087A();
        return m1087A.f6110bL.f787p + 2 + m1087A.f6117bS.m1806r(this);
    }

    /* renamed from: a */
    public Point m4790a(C0173b c0173b, Point point) {
        point.f224a = (int) (((this.f6958el - m4710cX()) + 1.0f) * c0173b.f789r);
        point.f225b = (int) (((this.f6959em - m4709cY()) + 1.0f) * c0173b.f790s);
        return point;
    }

    /* renamed from: a */
    public RectF m4789a(C0173b c0173b, RectF rectF) {
        c0173b.m5340a((int) (((this.f6958el - m4710cX()) + 1.0f) * c0173b.f789r), (int) (((this.f6959em - m4709cY()) + 1.0f) * c0173b.f790s));
        float f = c0173b.f801T;
        float f2 = c0173b.f802U;
        Rect m4705cc = m4705cc();
        rectF.m5861a(f + (m4705cc.f230a * c0173b.f785n), f2 + (m4705cc.f231b * c0173b.f786o), f + ((m4705cc.f232c + 1) * c0173b.f785n), f2 + ((m4705cc.f233d + 1) * c0173b.f786o));
        return rectF;
    }

    /* renamed from: da */
    public void m4677da() {
    }

    /* renamed from: db */
    public boolean mo3327db() {
        return false;
    }

    /* renamed from: q */
    public boolean mo3347q() {
        return false;
    }

    /* renamed from: dc */
    public C0449h m4676dc() {
        return null;
    }

    /* renamed from: dd */
    public C0439f mo1759dd() {
        return this.f1697dF;
    }

    /* renamed from: a */
    public double m4781a(C0428a c0428a) {
        return this.f1697dF.m4022a(c0428a);
    }

    /* renamed from: de */
    public C0418c m4675de() {
        return this.f1698dG;
    }

    /* renamed from: df */
    public C0449h m4674df() {
        return null;
    }

    /* renamed from: bd */
    public float m4744bd() {
        return 0.0f;
    }

    /* renamed from: dg */
    public void m4673dg() {
    }

    /* renamed from: dh */
    public void m4672dh() {
    }

    /* renamed from: di */
    public boolean m4671di() {
        return false;
    }

    /* renamed from: dj */
    public boolean m4670dj() {
        return mo4386bO();
    }

    /* renamed from: dk */
    public boolean m4669dk() {
        return mo4386bO();
    }

    /* renamed from: dl */
    public final C0399m m4668dl() {
        return this.f1653cN;
    }

    public String toString() {
        return "unit(id=" + this.f6951ee + ",type=" + mo1758r().mo4474i() + ")";
    }

    /* renamed from: r */
    public void m4647r(float f) {
        if (f >= 1.0f) {
            if (!(this.f1624ck >= 1.0f)) {
                AbstractC0197n.m5069b(this);
                this.f1624ck = 1.0f;
                AbstractC0197n.m5053c(this);
                return;
            }
            return;
        }
        if (this.f1624ck >= 1.0f) {
            AbstractC0197n.m5069b(this);
            this.f1624ck = f;
            AbstractC0197n.m5053c(this);
            return;
        }
        this.f1624ck = f;
    }

    /* renamed from: a */
    public final void m4784a(EnumC0347ae enumC0347ae) {
        m4782a(enumC0347ae, (AbstractC0244am) null, (C0449h) null, (VariableScope) null);
    }

    /* renamed from: a */
    public final void m4783a(EnumC0347ae enumC0347ae, AbstractC0244am abstractC0244am) {
        m4782a(enumC0347ae, abstractC0244am, (C0449h) null, (VariableScope) null);
    }

    /* renamed from: a */
    public void m4782a(EnumC0347ae enumC0347ae, AbstractC0244am abstractC0244am, C0449h c0449h, VariableScope variableScope) {
    }

    /* renamed from: h */
    public void m4653h(float f) {
        this.f1618ce = f;
    }

    /* renamed from: a */
    public int m4780a(C0448g c0448g) {
        return 0;
    }

    /* renamed from: e */
    public C1101m m4659e(boolean z) {
        return null;
    }

    /* renamed from: a */
    public boolean m4794a(int i, int i2) {
        return false;
    }

    /* renamed from: c */
    public void m4734c(boolean z) {
    }

    /* renamed from: dm */
    public float m4667dm() {
        return this.f1621ch;
    }

    /* renamed from: dn */
    public boolean m4666dn() {
        return true;
    }

    /* renamed from: bC */
    public void m4762bC() {
    }

    /* renamed from: do */
    public final C0424b m4665do() {
        return this.f1699dH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.corrodinggames.rts.game.units.am] */
    /* renamed from: dp */
    public final AbstractC0244am m4664dp() {
        AbstractC0623y abstractC0623y = this.f1652cM;
        if (abstractC0623y == null && this.f1651cL != null) {
            abstractC0623y = this.f1651cL;
        }
        return abstractC0623y;
    }

    /* renamed from: f */
    public void m4657f(float f, float f2) {
        this.f6958el = f;
        this.f6959em = f2;
        m4734c(true);
    }
}
