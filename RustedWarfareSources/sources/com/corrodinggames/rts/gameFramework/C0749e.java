package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.C0546g;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0215j;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.gameFramework.p037f.C0785ad;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e.class */
public class C0749e {

    /* renamed from: a */
    public boolean f4838a;

    /* renamed from: b */
    public String f4839b;

    /* renamed from: c */
    public int f4840c;

    /* renamed from: d */
    public int f4841d;

    /* renamed from: i */
    public AbstractC0197n f4846i;

    /* renamed from: j */
    public C0305au f4847j;

    /* renamed from: l */
    public PointF f4849l;

    /* renamed from: m */
    public AbstractC0244am f4850m;

    /* renamed from: n */
    public EnumC0205a f4851n;

    /* renamed from: z */
    private PointF f4852z;

    /* renamed from: p */
    public AbstractC0197n f4854p;

    /* renamed from: q */
    public short f4855q;

    /* renamed from: r */
    public boolean f4856r;

    /* renamed from: s */
    public float f4857s;

    /* renamed from: t */
    public float f4858t;

    /* renamed from: u */
    public int f4859u;

    /* renamed from: y */
    final /* synthetic */ C0736c f4864y;

    /* renamed from: e */
    public boolean f4842e = false;

    /* renamed from: f */
    public boolean f4843f = false;

    /* renamed from: g */
    public boolean f4844g = false;

    /* renamed from: h */
    public boolean f4845h = false;

    /* renamed from: k */
    public C0208c f4848k = AbstractC0224s.f1462i;

    /* renamed from: o */
    public boolean f4853o = false;

    /* renamed from: A */
    private C1101m f4860A = new C1101m();

    /* renamed from: v */
    C1101m f4861v = new C1101m();

    /* renamed from: w */
    C1101m f4862w = new C1101m();

    /* renamed from: x */
    public boolean f4863x = false;

    public C0749e(C0736c c0736c) {
        this.f4864y = c0736c;
    }

    /* renamed from: a */
    public boolean m2330a() {
        Iterator it = this.f4862w.iterator();
        while (it.hasNext()) {
            if (((C0740d) it.next()).f4638a.mo1221a() == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public void m2315b() {
        Core m1087A = Core.m1087A();
        this.f4863x = true;
        C0637ab m2758c = m1087A.f6120bV.m2758c();
        Iterator it = this.f4861v.iterator();
        while (it.hasNext()) {
            m2758c.f4074a.add((AbstractC0623y) it.next());
        }
        if (this.f4847j != null) {
            float m4438g = this.f4847j.m4438g();
            float m4436h = this.f4847j.m4436h();
            if (this.f4847j.m4444d() != EnumC0306av.f1811a && this.f4847j.m4444d() != EnumC0306av.f1818h && this.f4847j.m4444d() != EnumC0306av.f1812b) {
                return;
            }
            Iterator it2 = m2758c.m2756a(m4438g, m4436h, this.f4847j.f1806j).iterator();
            while (it2.hasNext()) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) it2.next();
                if (!abstractC0623y.m2943aK() && abstractC0623y.mo3057I() && (!this.f4842e || abstractC0623y.m2909ar() == null)) {
                    int i = 0;
                    if (this.f4847j.m4444d() == EnumC0306av.f1812b) {
                        i = abstractC0623y.m2798q(this.f4847j.m4434i());
                    }
                    C0740d c0740d = new C0740d();
                    c0740d.f4639b = abstractC0623y.f6951ee;
                    c0740d.f4640c = abstractC0623y.f6958el;
                    c0740d.f4641d = abstractC0623y.f6959em;
                    c0740d.f4642e = m4438g;
                    c0740d.f4643f = m4436h;
                    c0740d.f4644g = m1087A.f6239bx;
                    c0740d.f4645h = abstractC0623y.mo3039h();
                    c0740d.f4638a = abstractC0623y.m2997a(m4438g, m4436h, i, true, false, false);
                    c0740d.f4638a.f5989t = 120.0f;
                    c0740d.f4638a.f5988s = c0740d.f4638a.f5989t;
                    c0740d.f4638a.f5990u = true;
                    this.f4862w.add(c0740d);
                }
            }
        }
    }

    /* renamed from: c */
    public AbstractC0197n m2312c() {
        return this.f4846i;
    }

    /* renamed from: d */
    public int m2309d() {
        return this.f4860A.size() + this.f4861v.size();
    }

    /* renamed from: e */
    public boolean m2307e() {
        if (!AbstractC0224s.m4896c(this.f4848k) && m2309d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public synchronized C0749e m2305f() {
        try {
            StreamWriter streamWriter = new StreamWriter();
            m2318a(streamWriter);
            Reader reader = new Reader(streamWriter.m1399d());
            C0749e c0749e = new C0749e(this.f4864y);
            c0749e.f4840c = this.f4840c;
            c0749e.m2317a(reader);
            return c0749e;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void m2303g() {
        if (this.f4847j != null) {
            Iterator it = this.f4861v.iterator();
            while (it.hasNext()) {
                this.f4860A.add(Long.valueOf(((AbstractC0623y) it.next()).f6951ee));
            }
            this.f4861v.clear();
            this.f4847j.m4432k();
        }
    }

    /* renamed from: a */
    public synchronized void m2318a(StreamWriter streamWriter) {
        streamWriter.m1396e("c");
        streamWriter.m1401c(this.f4846i.f1306k);
        streamWriter.mo1329a(this.f4847j != null);
        if (this.f4847j != null) {
            this.f4847j.m4454a(streamWriter);
        }
        streamWriter.mo1329a(this.f4842e);
        streamWriter.mo1329a(this.f4844g);
        streamWriter.WriteInteger(-1);
        streamWriter.m1411a(this.f4851n);
        streamWriter.mo1329a(this.f4852z != null);
        if (this.f4852z != null) {
            streamWriter.mo1335a(this.f4852z.f227a);
            streamWriter.mo1335a(this.f4852z.f228b);
        }
        streamWriter.mo1329a(this.f4853o);
        streamWriter.WriteInteger(this.f4861v.size() + this.f4860A.size());
        Iterator it = this.f4861v.iterator();
        while (it.hasNext()) {
            streamWriter.m1424a(((AbstractC0623y) it.next()).f6951ee);
        }
        Iterator it2 = this.f4860A.iterator();
        while (it2.hasNext()) {
            streamWriter.m1424a(((Long) it2.next()).longValue());
        }
        streamWriter.mo1329a(this.f4854p != null);
        if (this.f4854p != null) {
            streamWriter.m1422a(this.f4854p);
        }
        streamWriter.mo1329a(this.f4849l != null);
        if (this.f4849l != null) {
            streamWriter.mo1335a(this.f4849l.f227a);
            streamWriter.mo1335a(this.f4849l.f228b);
        }
        streamWriter.mo1333a(this.f4850m);
        streamWriter.WriteUTF(this.f4848k.m4992a());
        streamWriter.mo1329a(this.f4843f);
        streamWriter.mo1330a(this.f4855q);
        streamWriter.mo1329a(this.f4856r);
        if (this.f4856r) {
            streamWriter.m1401c(0);
            streamWriter.mo1335a(this.f4857s);
            streamWriter.mo1335a(this.f4858t);
            streamWriter.WriteInteger(this.f4859u);
        }
        streamWriter.WriteInteger(this.f4862w.size());
        for (int i = 0; i < this.f4862w.size(); i++) {
            ((C0740d) this.f4862w.get(i)).m2411a(streamWriter);
        }
        streamWriter.mo1329a(this.f4845h);
        streamWriter.mo1332a("c");
    }

    /* renamed from: a */
    public void m2317a(Reader reader) {
        reader.m1307b("c");
        this.f4846i = AbstractC0197n.m5017k(reader.m1304d());
        if (this.f4846i == null) {
            throw new IOException("team==null");
        }
        if (reader.ReadBool()) {
            this.f4847j = new C0305au();
            this.f4847j.m4453a(reader);
        }
        this.f4842e = reader.ReadBool();
        this.f4844g = reader.ReadBool();
        this.f4848k = C0208c.m4988a(String.valueOf(reader.ReadInt()));
        this.f4851n = (EnumC0205a) reader.m1308b(EnumC0205a.class);
        if (reader.ReadBool()) {
            this.f4852z = new PointF();
            this.f4852z.f227a = reader.m1300g();
            this.f4852z.f228b = reader.m1300g();
        }
        this.f4853o = reader.ReadBool();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            this.f4860A.add(Long.valueOf(reader.m1293n()));
        }
        if (reader.m1310b() >= 16) {
            this.f4854p = null;
            if (reader.ReadBool()) {
                this.f4854p = reader.m1288s();
            }
        }
        if (reader.m1310b() >= 29) {
            if (reader.ReadBool()) {
                this.f4849l = new PointF();
                this.f4849l.f227a = reader.m1300g();
                this.f4849l.f228b = reader.m1300g();
            }
            this.f4850m = reader.m1292o();
        }
        if (reader.m1310b() >= 33) {
            this.f4848k = C0208c.m4988a(reader.ReadUTF());
        }
        if (reader.m1310b() >= 37) {
            this.f4843f = reader.ReadBool();
        }
        if (reader.m1310b() >= 52) {
            this.f4855q = reader.m1285v();
        }
        if (reader.m1310b() >= 53) {
            this.f4856r = reader.ReadBool();
            if (this.f4856r) {
                reader.m1304d();
                this.f4857s = reader.m1300g();
                this.f4858t = reader.m1300g();
                this.f4859u = reader.ReadInt();
            }
            int ReadInt2 = reader.ReadInt();
            this.f4862w.clear();
            for (int i2 = 0; i2 < ReadInt2; i2++) {
                C0740d c0740d = new C0740d();
                c0740d.m2410a(reader);
                this.f4862w.add(c0740d);
            }
        }
        if (reader.m1310b() >= 80) {
            this.f4845h = reader.ReadBool();
        }
        reader.m1303d("c");
    }

    /* renamed from: a */
    public void m2316a(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            m2319a((AbstractC0623y) it.next());
        }
    }

    /* renamed from: a */
    public void m2319a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y == null) {
            throw new RuntimeException("unit cannot be null");
        }
        if (abstractC0623y.f1609bV != this.f4846i) {
        }
        if (this.f4846i.f1317v) {
            if (abstractC0623y.f1609bV != this.f4846i && Core.m1087A().f6099bs != this.f4846i) {
                Core.m997b("CommandController", "Warning AI: " + this.f4846i.f1306k + " gave an order to unit with team:" + abstractC0623y.f1609bV.f1306k + " type:" + abstractC0623y.mo1758r().mo4474i());
                Core.m973g(VariableScope.nullOrMissingString);
            }
            if (abstractC0623y.m4713cU()) {
                Core.m997b("CommandController", "Warning AI: " + this.f4846i.f1306k + " gave an order to unit with canNotBeGivenOrdersByPlayer: " + abstractC0623y.mo1758r().mo4474i());
            }
        }
        this.f4861v.add(abstractC0623y);
    }

    /* renamed from: h */
    public void m2302h() {
        this.f4853o = true;
    }

    /* renamed from: a */
    public void m2329a(float f, float f2) {
        this.f4847j = new C0305au();
        this.f4847j.m4458a(f, f2);
    }

    /* renamed from: b */
    public void m2314b(float f, float f2) {
        this.f4847j = new C0305au();
        this.f4847j.m4451b(f, f2);
    }

    /* renamed from: a */
    public void m2321a(AbstractC0244am abstractC0244am) {
        this.f4847j = new C0305au();
        this.f4847j.m4456a(abstractC0244am);
    }

    /* renamed from: a */
    public void m2327a(float f, float f2, boolean z) {
        this.f4847j = new C0305au();
        this.f4847j.m4451b(f, f2);
        this.f4847j.f1806j = z;
    }

    /* renamed from: a */
    public void m2320a(AbstractC0244am abstractC0244am, boolean z) {
        this.f4847j = new C0305au();
        this.f4847j.m4456a(abstractC0244am);
        this.f4847j.f1806j = z;
    }

    /* renamed from: a */
    public void m2328a(float f, float f2, InterfaceC0303as interfaceC0303as, int i) {
        this.f4847j = new C0305au();
        this.f4847j.m4457a(f, f2, interfaceC0303as, i);
    }

    /* renamed from: b */
    public void m2313b(AbstractC0244am abstractC0244am) {
        this.f4847j = new C0305au();
        this.f4847j.m4450b(abstractC0244am);
    }

    /* renamed from: c */
    public void m2310c(AbstractC0244am abstractC0244am) {
        this.f4847j = new C0305au();
        this.f4847j.m4446c(abstractC0244am);
    }

    /* renamed from: c */
    public void m2311c(float f, float f2) {
        this.f4847j = new C0305au();
        this.f4847j.m4447c(f, f2);
    }

    /* renamed from: d */
    public void m2308d(AbstractC0244am abstractC0244am) {
        this.f4847j = new C0305au();
        this.f4847j.m4439f(abstractC0244am);
    }

    /* renamed from: e */
    public void m2306e(AbstractC0244am abstractC0244am) {
        this.f4847j = new C0305au();
        this.f4847j.m4437g(abstractC0244am);
    }

    /* renamed from: f */
    public void m2304f(AbstractC0244am abstractC0244am) {
        this.f4847j = new C0305au();
        this.f4847j.m4435h(abstractC0244am);
    }

    /* renamed from: a */
    public void m2324a(C0208c c0208c) {
        this.f4848k = c0208c;
    }

    /* renamed from: a */
    public void m2323a(C0208c c0208c, PointF pointF, AbstractC0244am abstractC0244am) {
        this.f4848k = c0208c;
        this.f4849l = pointF;
        this.f4850m = abstractC0244am;
    }

    /* renamed from: a */
    public void m2322a(EnumC0205a enumC0205a) {
        this.f4851n = enumC0205a;
    }

    /* renamed from: a */
    public void m2326a(PointF pointF) {
        this.f4852z = pointF;
    }

    /* renamed from: i */
    public synchronized void m2301i() {
        Iterator it = this.f4860A.iterator();
        while (it.hasNext()) {
            AbstractC0623y m438b = AbstractC1120w.m438b(((Long) it.next()).longValue(), true);
            if (m438b != null) {
                this.f4861v.add(m438b);
            }
        }
        this.f4860A.clear();
        Iterator it2 = this.f4861v.iterator();
        while (it2.hasNext()) {
            if (((AbstractC0623y) it2.next()).f1607bT) {
                it2.remove();
            }
        }
    }

    /* renamed from: j */
    public void m2300j() {
        if (AbstractC0224s.m4896c(this.f4848k)) {
            Iterator it = this.f4861v.iterator();
            while (it.hasNext()) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
                abstractC0623y.m4766b(abstractC0623y.m4788a(this.f4848k), this.f4844g);
            }
        }
    }

    /* renamed from: k */
    public void m2299k() {
        C0305au m2907at;
        String str;
        Core m1087A = Core.m1087A();
        if (m1087A.f6126cb.m2464h() && !this.f4838a) {
            return;
        }
        m2301i();
        if (this.f4856r) {
            if (this.f4857s != 0.0f) {
                Core.LogDebug2("issueCommand: changeStepRate:" + this.f4857s);
                m1087A.f6122bX.m1619a(this.f4857s, "command");
                return;
            } else if (this.f4859u != 0) {
                Core.LogDebug2("system action:" + this.f4859u);
                if (this.f4859u == 1) {
                    Core.LogDebug2("new DebugDesyncDetector");
                    new C0546g(false).m4768b(AbstractC0197n.f1371i);
                    return;
                } else if (this.f4859u == 2) {
                    Core.LogDebug2("new DebugDesyncDetector (stress test)");
                    C0546g c0546g = new C0546g(false);
                    c0546g.m2894b(AbstractC0197n.f1371i);
                    c0546g.f3745a = true;
                    return;
                } else if (this.f4859u == 100) {
                    Core.LogDebug2("team surrender");
                    if (this.f4846i == null) {
                        Core.LogDebug2("team not found");
                        return;
                    }
                    if (m1087A.f6122bX.IsServer) {
                        m1087A.f6122bX.m1479j("'" + this.f4846i.f1316u + "' has surrendered");
                    }
                    this.f4846i.f1327D = true;
                    Iterator it = AbstractC0244am.f1590bD.iterator();
                    while (it.hasNext()) {
                        AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                        if (abstractC0244am.f1609bV == this.f4846i && (abstractC0244am instanceof AbstractC0623y)) {
                            ((AbstractC0623y) abstractC0244am).m2846c(false);
                        }
                    }
                    return;
                } else if (this.f4859u == 200) {
                    Core.LogDebug2("queue quick resync");
                    m1087A.f6122bX.f5498N = true;
                    return;
                } else if (this.f4859u == 5) {
                    Core.LogDebug2("system command spawn");
                    if (this.f4847j == null || this.f4847j.m4444d() != EnumC0306av.f1813c || this.f4847j.m4459a() == null) {
                        Core.LogDebug2("system command spawn - failed");
                        return;
                    }
                    int m4452b = this.f4847j.m4452b();
                    InterfaceC0303as m4459a = this.f4847j.m4459a();
                    boolean z = false;
                    if (this.f4846i != null && this.f4846i == m1087A.f6099bs && m1087A.f6099bs.m5075a(false, false) == 0) {
                        z = true;
                    }
                    AbstractC0244am mo4485a = m4459a.mo4485a();
                    mo4485a.f6958el = this.f4847j.m4438g();
                    mo4485a.f6959em = this.f4847j.m4436h();
                    if (this.f4846i != null) {
                        mo4485a.m4656f(this.f4846i);
                    } else {
                        mo4485a.m4656f(AbstractC0197n.f1371i);
                    }
                    mo4485a.m4801B(null);
                    if (m4452b != 1 && (mo4485a instanceof AbstractC0623y)) {
                        ((AbstractC0623y) mo4485a).mo3356a(m4452b);
                    }
                    mo4485a.m4719cO();
                    if (mo4485a instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) mo4485a;
                        abstractC0623y.m2861br();
                        if (mo4485a.m4758bI()) {
                            m1087A.f6119bU.m1165a(abstractC0623y);
                        }
                    }
                    AbstractC0197n.m5053c(mo4485a);
                    if (m1087A.f6099bs == mo4485a.f1609bV && mo4485a.f1609bV != AbstractC0197n.f1371i && !mo4485a.mo1756u() && z) {
                        m1087A.m1003b(mo4485a.f6958el, mo4485a.f6959em);
                        m1087A.f6117bS.m1822j(mo4485a);
                        return;
                    }
                    return;
                } else {
                    Core.LogDebug2("issueCommand: unknown system action:" + this.f4859u);
                    return;
                }
            } else {
                Core.LogDebug2("issueCommand: Null System action");
                return;
            }
        }
        if (this.f4854p != null) {
            this.f4854p.f1348X = System.currentTimeMillis();
            this.f4854p.f1349Y = m1087A.f6102by;
        }
        if (this.f4854p != null) {
            String str2 = null;
            AbstractC0623y abstractC0623y2 = null;
            Iterator it2 = this.f4861v.iterator();
            while (it2.hasNext()) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) it2.next();
                if (abstractC0623y3.f1609bV != this.f4854p && !m2325a(this.f4854p, abstractC0623y3.f1609bV)) {
                    if (str2 == null) {
                        str = VariableScope.nullOrMissingString;
                    } else {
                        str = str2 + ", ";
                    }
                    if (abstractC0623y2 == null) {
                        abstractC0623y2 = abstractC0623y3;
                    }
                    str2 = str + abstractC0623y3.f6951ee;
                    it2.remove();
                } else if (abstractC0623y3.m4713cU()) {
                    C0736c.m2421a("Warning unit: " + abstractC0623y3.f6951ee + " has canNotBeGivenOrdersByPlayer set");
                    it2.remove();
                }
            }
            if (str2 != null) {
                C0831ad.m1587a("Player(" + this.f4854p.f1306k + ") " + this.f4854p.f1316u + " cannot control units: " + str2, true);
                if (abstractC0623y2 != null) {
                    String str3 = VariableScope.nullOrMissingString;
                    if (abstractC0623y2.f1609bV != null) {
                        str3 = str3 + " targetUnitTeamId: " + abstractC0623y2.f1609bV.f1306k + " targetUnitTeamName: " + abstractC0623y2.f1609bV.f1316u;
                    }
                    C0736c.m2421a(str3);
                }
            }
        }
        if (this.f4853o) {
            Iterator it3 = this.f4861v.iterator();
            while (it3.hasNext()) {
                AbstractC0623y abstractC0623y4 = (AbstractC0623y) it3.next();
                abstractC0623y4.m2901az();
                abstractC0623y4.f3896Q = null;
            }
        }
        if (this.f4847j != null) {
            this.f4847j.m4448c();
            C0637ab m2759b = m1087A.f6120bV.m2759b();
            m2759b.f4080g = this.f4862w;
            int i = 0;
            while (i <= 1) {
                boolean z2 = i == 1;
                Iterator it4 = this.f4861v.iterator();
                while (it4.hasNext()) {
                    AbstractC0623y abstractC0623y5 = (AbstractC0623y) it4.next();
                    if (abstractC0623y5.f3922ad == z2) {
                        if (this.f4843f) {
                            abstractC0623y5.m2953aA();
                        } else if (!this.f4842e) {
                            abstractC0623y5.m2901az();
                        } else if (this.f4845h && this.f4847j != null && (m2907at = abstractC0623y5.m2907at()) != null && this.f4847j.m4455a(m2907at) && (m2907at.m4444d() == EnumC0306av.f1818h || m2907at.m4444d() == EnumC0306av.f1811a)) {
                            if (this.f4847j.m4444d() == EnumC0306av.f1818h || this.f4847j.m4444d() == EnumC0306av.f1811a) {
                                abstractC0623y5.m2906au();
                            }
                        }
                    }
                }
                i++;
            }
            Iterator it5 = this.f4861v.iterator();
            while (it5.hasNext()) {
                AbstractC0623y abstractC0623y6 = (AbstractC0623y) it5.next();
                if (!abstractC0623y6.m2967a(this.f4847j, C0736c.f4624e < 5)) {
                    String str4 = VariableScope.nullOrMissingString;
                    if (this.f4854p != null) {
                        str4 = "Player(" + this.f4854p.f1306k + ") " + this.f4854p.f1316u + ": ";
                    }
                    C0736c.m2421a(str4 + "isValidNewWaypoint==false on: " + abstractC0623y6.m4733cA());
                } else {
                    C0305au m2840d = abstractC0623y6.m2840d(this.f4847j);
                    m2759b.m2753a(abstractC0623y6, m2840d);
                    abstractC0623y6.m2969a(m2840d);
                }
            }
            m2759b.m2750b();
            return;
        }
        if (AbstractC0224s.m4896c(this.f4848k)) {
            Iterator it6 = this.f4861v.iterator();
            while (it6.hasNext()) {
                AbstractC0623y abstractC0623y7 = (AbstractC0623y) it6.next();
                AbstractC0224s a = abstractC0623y7.m4788a(this.f4848k);
                if (a == null) {
                    C0736c.m2421a("Could not find specialAction:" + this.f4848k.m4992a() + " on " + abstractC0623y7.mo1758r().mo4474i());
                } else if (!a.mo3084b(abstractC0623y7)) {
                    C0736c.m2421a("!isAvailable specialAction:" + this.f4848k.m4992a() + " on " + abstractC0623y7.mo1758r().mo4474i() + " (action being skipped)");
                    if (C0736c.f4620a) {
                        C0736c.m2421a("Command source:" + this.f4839b);
                    }
                } else {
                    abstractC0623y7.m4767b(a);
                    C0785ad.m1953a(abstractC0623y7, a);
                    abstractC0623y7.m4787a(a, this.f4844g, this.f4849l, this.f4850m);
                }
            }
            C0215j m4940a = C0215j.m4940a(this.f4848k);
            if (m4940a != null) {
                if (m1087A.f6099bs != null && this.f4846i != null) {
                    if (this.f4846i.m5042d(m1087A.f6099bs)) {
                        m1087A.f6117bS.m1902a(this.f4849l.f227a, this.f4849l.f228b, this.f4846i, m4940a);
                    }
                } else {
                    C0736c.m2421a("PingMapAction failed: game.playerTeam==null or this.team==null");
                }
            }
        }
        if (this.f4851n != null) {
            Iterator it7 = this.f4861v.iterator();
            while (it7.hasNext()) {
                ((AbstractC0623y) it7.next()).f3894O = this.f4851n;
            }
        }
        if (this.f4852z != null) {
            Iterator it8 = this.f4861v.iterator();
            while (it8.hasNext()) {
                AbstractC0623y abstractC0623y8 = (AbstractC0623y) it8.next();
                if (abstractC0623y8 instanceof InterfaceC0501l) {
                    ((InterfaceC0501l) abstractC0623y8).mo3439a(this.f4852z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m2325a(AbstractC0197n abstractC0197n, AbstractC0197n abstractC0197n2) {
        if (abstractC0197n != null && abstractC0197n2 != null && abstractC0197n2.m5042d(abstractC0197n) && (this.f4855q & (1 << abstractC0197n2.f1306k)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m2298l() {
        InterfaceC0303as m4459a;
        AbstractC0244am m4785a;
        this.f4855q = (short) 0;
        for (int i = 0; i < AbstractC0197n.f1365c; i++) {
            AbstractC0197n m5017k = AbstractC0197n.m5017k(i);
            if (m5017k != null && m5017k.m5012p()) {
                this.f4855q = (short) (this.f4855q | (1 << i));
            }
        }
        if (Core.m1087A().m988c(true) < 127 && this.f4847j != null && this.f4847j.m4444d() == EnumC0306av.f1813c && (m4459a = this.f4847j.m4459a()) != null && (m4785a = AbstractC0244am.m4785a(m4459a)) != null && !(m4785a instanceof AbstractC0623y)) {
            Core.LogDebug2("Rejecting non OrderableUnit build order: " + m4459a.mo4474i());
            return false;
        } else if (this.f4847j != null && this.f4847j.f1810n) {
            Core.LogDebug2("Rejecting waypoint with addedByAction true");
            return false;
        } else {
            return true;
        }
    }
}
