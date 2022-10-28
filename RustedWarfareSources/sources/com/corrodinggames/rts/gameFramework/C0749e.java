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
    public AbstractC0197n f4842i;

    /* renamed from: j */
    public C0305au f4843j;

    /* renamed from: l */
    public PointF f4844l;

    /* renamed from: m */
    public AbstractC0244am f4845m;

    /* renamed from: n */
    public EnumC0205a f4846n;

    /* renamed from: z */
    private PointF f4847z;

    /* renamed from: p */
    public AbstractC0197n f4848p;

    /* renamed from: q */
    public short f4849q;

    /* renamed from: r */
    public boolean f4850r;

    /* renamed from: s */
    public float f4851s;

    /* renamed from: t */
    public float f4852t;

    /* renamed from: u */
    public int f4853u;

    /* renamed from: y */
    final /* synthetic */ C0736c f4854y;

    /* renamed from: e */
    public boolean f4855e = false;

    /* renamed from: f */
    public boolean f4856f = false;

    /* renamed from: g */
    public boolean f4857g = false;

    /* renamed from: h */
    public boolean f4858h = false;

    /* renamed from: k */
    public C0208c f4859k = AbstractC0224s.f1462i;

    /* renamed from: o */
    public boolean f4860o = false;

    /* renamed from: A */
    private C1101m f4861A = new C1101m();

    /* renamed from: v */
    C1101m f4862v = new C1101m();

    /* renamed from: w */
    C1101m f4863w = new C1101m();

    /* renamed from: x */
    public boolean f4864x = false;

    public C0749e(C0736c c0736c) {
        this.f4854y = c0736c;
    }

    /* renamed from: a */
    public boolean m2278a() {
        Iterator it = this.f4863w.iterator();
        while (it.hasNext()) {
            if (((C0740d) it.next()).f4638a.mo1206a() == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public void m2263b() {
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f4864x = true;
        C0637ab m2704c = m1072A.f6120bV.m2704c();
        Iterator it = this.f4862v.iterator();
        while (it.hasNext()) {
            m2704c.f4074a.add((AbstractC0623y) it.next());
        }
        if (this.f4843j != null) {
            float m4216g = this.f4843j.m4216g();
            float m4214h = this.f4843j.m4214h();
            if (this.f4843j.m4222d() != EnumC0306av.move && this.f4843j.m4222d() != EnumC0306av.attackMove && this.f4843j.m4222d() != EnumC0306av.attack) {
                return;
            }
            Iterator it2 = m2704c.m2702a(m4216g, m4214h, this.f4843j.f1803j).iterator();
            while (it2.hasNext()) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) it2.next();
                if (!abstractC0623y.m2887aK() && abstractC0623y.mo2998I() && (!this.f4855e || abstractC0623y.m2853ar() == null)) {
                    int i = 0;
                    if (this.f4843j.m4222d() == EnumC0306av.attack) {
                        i = abstractC0623y.m2744q(this.f4843j.m4212i());
                    }
                    C0740d c0740d = new C0740d();
                    c0740d.f4639b = abstractC0623y.f6951ee;
                    c0740d.f4640c = abstractC0623y.f6957el;
                    c0740d.f4641d = abstractC0623y.f6958em;
                    c0740d.f4642e = m4216g;
                    c0740d.f4643f = m4214h;
                    c0740d.f4644g = m1072A.f6239bx;
                    c0740d.f4645h = abstractC0623y.mo2982h();
                    c0740d.f4638a = abstractC0623y.m2940a(m4216g, m4214h, i, true, false, false);
                    c0740d.f4638a.f5989t = 120.0f;
                    c0740d.f4638a.f5988s = c0740d.f4638a.f5989t;
                    c0740d.f4638a.f5990u = true;
                    this.f4863w.add(c0740d);
                }
            }
        }
    }

    /* renamed from: c */
    public AbstractC0197n m2260c() {
        return this.f4842i;
    }

    /* renamed from: d */
    public int m2257d() {
        return this.f4861A.size() + this.f4862v.size();
    }

    /* renamed from: e */
    public boolean m2255e() {
        if (!AbstractC0224s.m4498c(this.f4859k) && m2257d() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public synchronized C0749e m2253f() {
        try {
            StreamWriter streamWriter = new StreamWriter();
            m2266a(streamWriter);
            Reader reader = new Reader(streamWriter.mo1353d());
            C0749e c0749e = new C0749e(this.f4854y);
            c0749e.f4840c = this.f4840c;
            c0749e.m2265a(reader);
            return c0749e;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public void m2251g() {
        if (this.f4843j != null) {
            Iterator it = this.f4862v.iterator();
            while (it.hasNext()) {
                this.f4861A.add(Long.valueOf(((AbstractC0623y) it.next()).f6951ee));
            }
            this.f4862v.clear();
            this.f4843j.m4210k();
        }
    }

    /* renamed from: a */
    public synchronized void m2266a(StreamWriter streamWriter) {
        streamWriter.mo1350e("c");
        streamWriter.mo1355c(this.f4842i.f1306k);
        streamWriter.mo1314a(this.f4843j != null);
        if (this.f4843j != null) {
            this.f4843j.m4232a(streamWriter);
        }
        streamWriter.mo1314a(this.f4855e);
        streamWriter.mo1314a(this.f4857g);
        streamWriter.WriteInteger(-1);
        streamWriter.mo1363a(this.f4846n);
        streamWriter.mo1314a(this.f4847z != null);
        if (this.f4847z != null) {
            streamWriter.mo1320a(this.f4847z.f227a);
            streamWriter.mo1320a(this.f4847z.f228b);
        }
        streamWriter.mo1314a(this.f4860o);
        streamWriter.WriteInteger(this.f4862v.size() + this.f4861A.size());
        Iterator it = this.f4862v.iterator();
        while (it.hasNext()) {
            streamWriter.mo1373a(((AbstractC0623y) it.next()).f6951ee);
        }
        Iterator it2 = this.f4861A.iterator();
        while (it2.hasNext()) {
            streamWriter.mo1373a(((Long) it2.next()).longValue());
        }
        streamWriter.mo1314a(this.f4848p != null);
        if (this.f4848p != null) {
            streamWriter.mo1371a(this.f4848p);
        }
        streamWriter.mo1314a(this.f4844l != null);
        if (this.f4844l != null) {
            streamWriter.mo1320a(this.f4844l.f227a);
            streamWriter.mo1320a(this.f4844l.f228b);
        }
        streamWriter.mo1318a(this.f4845m);
        streamWriter.WriteUTF(this.f4859k.m4537a());
        streamWriter.mo1314a(this.f4856f);
        streamWriter.mo1315a(this.f4849q);
        streamWriter.mo1314a(this.f4850r);
        if (this.f4850r) {
            streamWriter.mo1355c(0);
            streamWriter.mo1320a(this.f4851s);
            streamWriter.mo1320a(this.f4852t);
            streamWriter.WriteInteger(this.f4853u);
        }
        streamWriter.WriteInteger(this.f4863w.size());
        for (int i = 0; i < this.f4863w.size(); i++) {
            ((C0740d) this.f4863w.get(i)).m2359a(streamWriter);
        }
        streamWriter.mo1314a(this.f4858h);
        streamWriter.mo1317a("c");
    }

    /* renamed from: a */
    public void m2265a(Reader reader) {
        reader.m1292b("c");
        this.f4842i = AbstractC0197n.m4562k(reader.m1289d());
        if (this.f4842i == null) {
            throw new IOException("team==null");
        }
        if (reader.ReadBool()) {
            this.f4843j = new C0305au();
            this.f4843j.m4231a(reader);
        }
        this.f4855e = reader.ReadBool();
        this.f4857g = reader.ReadBool();
        this.f4859k = C0208c.m4533a(String.valueOf(reader.ReadInt()));
        this.f4846n = (EnumC0205a) reader.m1293b(EnumC0205a.class);
        if (reader.ReadBool()) {
            this.f4847z = new PointF();
            this.f4847z.f227a = reader.m1285g();
            this.f4847z.f228b = reader.m1285g();
        }
        this.f4860o = reader.ReadBool();
        int ReadInt = reader.ReadInt();
        for (int i = 0; i < ReadInt; i++) {
            this.f4861A.add(Long.valueOf(reader.m1278n()));
        }
        if (reader.m1295b() >= 16) {
            this.f4848p = null;
            if (reader.ReadBool()) {
                this.f4848p = reader.m1273s();
            }
        }
        if (reader.m1295b() >= 29) {
            if (reader.ReadBool()) {
                this.f4844l = new PointF();
                this.f4844l.f227a = reader.m1285g();
                this.f4844l.f228b = reader.m1285g();
            }
            this.f4845m = reader.m1277o();
        }
        if (reader.m1295b() >= 33) {
            this.f4859k = C0208c.m4533a(reader.ReadUTF());
        }
        if (reader.m1295b() >= 37) {
            this.f4856f = reader.ReadBool();
        }
        if (reader.m1295b() >= 52) {
            this.f4849q = reader.m1270v();
        }
        if (reader.m1295b() >= 53) {
            this.f4850r = reader.ReadBool();
            if (this.f4850r) {
                reader.m1289d();
                this.f4851s = reader.m1285g();
                this.f4852t = reader.m1285g();
                this.f4853u = reader.ReadInt();
            }
            int ReadInt2 = reader.ReadInt();
            this.f4863w.clear();
            for (int i2 = 0; i2 < ReadInt2; i2++) {
                C0740d c0740d = new C0740d();
                c0740d.m2358a(reader);
                this.f4863w.add(c0740d);
            }
        }
        if (reader.m1295b() >= 80) {
            this.f4858h = reader.ReadBool();
        }
        reader.m1288d("c");
    }

    /* renamed from: a */
    public void m2264a(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            m2267a((AbstractC0623y) it.next());
        }
    }

    /* renamed from: a */
    public void m2267a(AbstractC0623y abstractC0623y) {
        if (abstractC0623y == null) {
            throw new RuntimeException("unit cannot be null");
        }
        if (abstractC0623y.f1609bV != this.f4842i) {
        }
        if (this.f4842i.f1317v) {
            if (abstractC0623y.f1609bV != this.f4842i && LoggerMaybe.m1072A().f6099bs != this.f4842i) {
                LoggerMaybe.m982b("CommandController", "Warning AI: " + this.f4842i.f1306k + " gave an order to unit with team:" + abstractC0623y.f1609bV.f1306k + " type:" + abstractC0623y.mo5649r().mo4252i());
                LoggerMaybe.m958g(VariableScope.nullOrMissingString);
            }
            if (abstractC0623y.m4361cU()) {
                LoggerMaybe.m982b("CommandController", "Warning AI: " + this.f4842i.f1306k + " gave an order to unit with canNotBeGivenOrdersByPlayer: " + abstractC0623y.mo5649r().mo4252i());
            }
        }
        this.f4862v.add(abstractC0623y);
    }

    /* renamed from: h */
    public void m2250h() {
        this.f4860o = true;
    }

    /* renamed from: a */
    public void m2277a(float f, float f2) {
        this.f4843j = new C0305au();
        this.f4843j.m4236a(f, f2);
    }

    /* renamed from: b */
    public void m2262b(float f, float f2) {
        this.f4843j = new C0305au();
        this.f4843j.m4229b(f, f2);
    }

    /* renamed from: a */
    public void m2269a(AbstractC0244am abstractC0244am) {
        this.f4843j = new C0305au();
        this.f4843j.m4234a(abstractC0244am);
    }

    /* renamed from: a */
    public void m2275a(float f, float f2, boolean z) {
        this.f4843j = new C0305au();
        this.f4843j.m4229b(f, f2);
        this.f4843j.f1803j = z;
    }

    /* renamed from: a */
    public void m2268a(AbstractC0244am abstractC0244am, boolean z) {
        this.f4843j = new C0305au();
        this.f4843j.m4234a(abstractC0244am);
        this.f4843j.f1803j = z;
    }

    /* renamed from: a */
    public void m2276a(float f, float f2, InterfaceC0303as interfaceC0303as, int i) {
        this.f4843j = new C0305au();
        this.f4843j.m4235a(f, f2, interfaceC0303as, i);
    }

    /* renamed from: b */
    public void m2261b(AbstractC0244am abstractC0244am) {
        this.f4843j = new C0305au();
        this.f4843j.m4228b(abstractC0244am);
    }

    /* renamed from: c */
    public void m2258c(AbstractC0244am abstractC0244am) {
        this.f4843j = new C0305au();
        this.f4843j.m4224c(abstractC0244am);
    }

    /* renamed from: c */
    public void m2259c(float f, float f2) {
        this.f4843j = new C0305au();
        this.f4843j.m4225c(f, f2);
    }

    /* renamed from: d */
    public void m2256d(AbstractC0244am abstractC0244am) {
        this.f4843j = new C0305au();
        this.f4843j.m4217f(abstractC0244am);
    }

    /* renamed from: e */
    public void m2254e(AbstractC0244am abstractC0244am) {
        this.f4843j = new C0305au();
        this.f4843j.m4215g(abstractC0244am);
    }

    /* renamed from: f */
    public void m2252f(AbstractC0244am abstractC0244am) {
        this.f4843j = new C0305au();
        this.f4843j.m4213h(abstractC0244am);
    }

    /* renamed from: a */
    public void m2272a(C0208c c0208c) {
        this.f4859k = c0208c;
    }

    /* renamed from: a */
    public void m2271a(C0208c c0208c, PointF pointF, AbstractC0244am abstractC0244am) {
        this.f4859k = c0208c;
        this.f4844l = pointF;
        this.f4845m = abstractC0244am;
    }

    /* renamed from: a */
    public void m2270a(EnumC0205a enumC0205a) {
        this.f4846n = enumC0205a;
    }

    /* renamed from: a */
    public void m2274a(PointF pointF) {
        this.f4847z = pointF;
    }

    /* renamed from: i */
    public synchronized void m2249i() {
        Iterator it = this.f4861A.iterator();
        while (it.hasNext()) {
            AbstractC0623y m438b = AbstractC1120w.m438b(((Long) it.next()).longValue(), true);
            if (m438b != null) {
                this.f4862v.add(m438b);
            }
        }
        this.f4861A.clear();
        Iterator it2 = this.f4862v.iterator();
        while (it2.hasNext()) {
            if (((AbstractC0623y) it2.next()).f1607bT) {
                it2.remove();
            }
        }
    }

    /* renamed from: j */
    public void m2248j() {
        if (AbstractC0224s.m4498c(this.f4859k)) {
            Iterator it = this.f4862v.iterator();
            while (it.hasNext()) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) it.next();
                abstractC0623y.m4409b(abstractC0623y.m4427a(this.f4859k), this.f4857g);
            }
        }
    }

    /* renamed from: k */
    public void m2247k() {
        C0305au m2851at;
        String str;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (m1072A.f6126cb.m2411h() && !this.f4838a) {
            return;
        }
        m2249i();
        if (this.f4850r) {
            if (this.f4851s != 0.0f) {
                LoggerMaybe.LogDebug2("issueCommand: changeStepRate:" + this.f4851s);
                m1072A.f6122bX.m1575a(this.f4851s, "command");
                return;
            } else if (this.f4853u != 0) {
                LoggerMaybe.LogDebug2("system action:" + this.f4853u);
                if (this.f4853u == 1) {
                    LoggerMaybe.LogDebug2("new DebugDesyncDetector");
                    new C0546g(false).m4411b(AbstractC0197n.f1371i);
                    return;
                } else if (this.f4853u == 2) {
                    LoggerMaybe.LogDebug2("new DebugDesyncDetector (stress test)");
                    C0546g c0546g = new C0546g(false);
                    c0546g.m2838b(AbstractC0197n.f1371i);
                    c0546g.f3745a = true;
                    return;
                } else if (this.f4853u == 100) {
                    LoggerMaybe.LogDebug2("team surrender");
                    if (this.f4842i == null) {
                        LoggerMaybe.LogDebug2("team not found");
                        return;
                    }
                    if (m1072A.f6122bX.IsServer) {
                        m1072A.f6122bX.m1435j("'" + this.f4842i.f1316u + "' has surrendered");
                    }
                    this.f4842i.f1327D = true;
                    Iterator it = AbstractC0244am.f1590bD.iterator();
                    while (it.hasNext()) {
                        AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                        if (abstractC0244am.f1609bV == this.f4842i && (abstractC0244am instanceof AbstractC0623y)) {
                            ((AbstractC0623y) abstractC0244am).m2791c(false);
                        }
                    }
                    return;
                } else if (this.f4853u == 200) {
                    LoggerMaybe.LogDebug2("queue quick resync");
                    m1072A.f6122bX.f5498N = true;
                    return;
                } else if (this.f4853u == 5) {
                    LoggerMaybe.LogDebug2("system command spawn");
                    if (this.f4843j == null || this.f4843j.m4222d() != EnumC0306av.build || this.f4843j.m4237a() == null) {
                        LoggerMaybe.LogDebug2("system command spawn - failed");
                        return;
                    }
                    int m4230b = this.f4843j.m4230b();
                    InterfaceC0303as m4237a = this.f4843j.m4237a();
                    boolean z = false;
                    if (this.f4842i != null && this.f4842i == m1072A.f6099bs && m1072A.f6099bs.m4620a(false, false) == 0) {
                        z = true;
                    }
                    AbstractC0244am mo4263a = m4237a.mo4263a();
                    mo4263a.f6957el = this.f4843j.m4216g();
                    mo4263a.f6958em = this.f4843j.m4214h();
                    if (this.f4842i != null) {
                        mo4263a.m4312f(this.f4842i);
                    } else {
                        mo4263a.m4312f(AbstractC0197n.f1371i);
                    }
                    mo4263a.m4437B(null);
                    if (m4230b != 1 && (mo4263a instanceof AbstractC0623y)) {
                        ((AbstractC0623y) mo4263a).mo3174a(m4230b);
                    }
                    mo4263a.m4367cO();
                    if (mo4263a instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y = (AbstractC0623y) mo4263a;
                        abstractC0623y.m2805br();
                        if (mo4263a.m4402bI()) {
                            m1072A.f6119bU.m1150a(abstractC0623y);
                        }
                    }
                    AbstractC0197n.m4598c(mo4263a);
                    if (m1072A.f6099bs == mo4263a.f1609bV && mo4263a.f1609bV != AbstractC0197n.f1371i && !mo4263a.mo1712u() && z) {
                        m1072A.m988b(mo4263a.f6957el, mo4263a.f6958em);
                        m1072A.f6117bS.m1778j(mo4263a);
                        return;
                    }
                    return;
                } else {
                    LoggerMaybe.LogDebug2("issueCommand: unknown system action:" + this.f4853u);
                    return;
                }
            } else {
                LoggerMaybe.LogDebug2("issueCommand: Null System action");
                return;
            }
        }
        if (this.f4848p != null) {
            this.f4848p.f1348X = System.currentTimeMillis();
            this.f4848p.f1349Y = m1072A.f6102by;
        }
        if (this.f4848p != null) {
            String str2 = null;
            AbstractC0623y abstractC0623y2 = null;
            Iterator it2 = this.f4862v.iterator();
            while (it2.hasNext()) {
                AbstractC0623y abstractC0623y3 = (AbstractC0623y) it2.next();
                if (abstractC0623y3.f1609bV != this.f4848p && !m2273a(this.f4848p, abstractC0623y3.f1609bV)) {
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
                } else if (abstractC0623y3.m4361cU()) {
                    C0736c.m2369a("Warning unit: " + abstractC0623y3.f6951ee + " has canNotBeGivenOrdersByPlayer set");
                    it2.remove();
                }
            }
            if (str2 != null) {
                C0831ad.m1543a("Player(" + this.f4848p.f1306k + ") " + this.f4848p.f1316u + " cannot control units: " + str2, true);
                if (abstractC0623y2 != null) {
                    String str3 = VariableScope.nullOrMissingString;
                    if (abstractC0623y2.f1609bV != null) {
                        str3 = str3 + " targetUnitTeamId: " + abstractC0623y2.f1609bV.f1306k + " targetUnitTeamName: " + abstractC0623y2.f1609bV.f1316u;
                    }
                    C0736c.m2369a(str3);
                }
            }
        }
        if (this.f4860o) {
            Iterator it3 = this.f4862v.iterator();
            while (it3.hasNext()) {
                AbstractC0623y abstractC0623y4 = (AbstractC0623y) it3.next();
                abstractC0623y4.m2845az();
                abstractC0623y4.f3896Q = null;
            }
        }
        if (this.f4843j != null) {
            this.f4843j.m4226c();
            C0637ab m2705b = m1072A.f6120bV.m2705b();
            m2705b.f4080g = this.f4863w;
            int i = 0;
            while (i <= 1) {
                boolean z2 = i == 1;
                Iterator it4 = this.f4862v.iterator();
                while (it4.hasNext()) {
                    AbstractC0623y abstractC0623y5 = (AbstractC0623y) it4.next();
                    if (abstractC0623y5.f3922ad == z2) {
                        if (this.f4856f) {
                            abstractC0623y5.m2897aA();
                        } else if (!this.f4855e) {
                            abstractC0623y5.m2845az();
                        } else if (this.f4858h && this.f4843j != null && (m2851at = abstractC0623y5.m2851at()) != null && this.f4843j.m4233a(m2851at) && (m2851at.m4222d() == EnumC0306av.attackMove || m2851at.m4222d() == EnumC0306av.move)) {
                            if (this.f4843j.m4222d() == EnumC0306av.attackMove || this.f4843j.m4222d() == EnumC0306av.move) {
                                abstractC0623y5.m2850au();
                            }
                        }
                    }
                }
                i++;
            }
            Iterator it5 = this.f4862v.iterator();
            while (it5.hasNext()) {
                AbstractC0623y abstractC0623y6 = (AbstractC0623y) it5.next();
                if (!abstractC0623y6.m2910a(this.f4843j, C0736c.f4624e < 5)) {
                    String str4 = VariableScope.nullOrMissingString;
                    if (this.f4848p != null) {
                        str4 = "Player(" + this.f4848p.f1306k + ") " + this.f4848p.f1316u + ": ";
                    }
                    C0736c.m2369a(str4 + "isValidNewWaypoint==false on: " + abstractC0623y6.m4380cA());
                } else {
                    C0305au m2786d = abstractC0623y6.m2786d(this.f4843j);
                    m2705b.m2699a(abstractC0623y6, m2786d);
                    abstractC0623y6.m2912a(m2786d);
                }
            }
            m2705b.m2696b();
            return;
        }
        if (AbstractC0224s.m4498c(this.f4859k)) {
            Iterator it6 = this.f4862v.iterator();
            while (it6.hasNext()) {
                AbstractC0623y abstractC0623y7 = (AbstractC0623y) it6.next();
                AbstractC0224s a = abstractC0623y7.m4427a(this.f4859k);
                if (a == null) {
                    C0736c.m2369a("Could not find specialAction:" + this.f4859k.m4537a() + " on " + abstractC0623y7.mo5649r().mo4252i());
                } else if (!a.mo3025b(abstractC0623y7)) {
                    C0736c.m2369a("!isAvailable specialAction:" + this.f4859k.m4537a() + " on " + abstractC0623y7.mo5649r().mo4252i() + " (action being skipped)");
                    if (C0736c.f4620a) {
                        C0736c.m2369a("Command source:" + this.f4839b);
                    }
                } else {
                    abstractC0623y7.m4410b(a);
                    C0785ad.m1909a(abstractC0623y7, a);
                    abstractC0623y7.mo3116a(a, this.f4857g, this.f4844l, this.f4845m);
                }
            }
            C0215j m4518a = C0215j.m4518a(this.f4859k);
            if (m4518a != null) {
                if (m1072A.f6099bs != null && this.f4842i != null) {
                    if (this.f4842i.m4587d(m1072A.f6099bs)) {
                        m1072A.f6117bS.m1858a(this.f4844l.f227a, this.f4844l.f228b, this.f4842i, m4518a);
                    }
                } else {
                    C0736c.m2369a("PingMapAction failed: game.playerTeam==null or this.team==null");
                }
            }
        }
        if (this.f4846n != null) {
            Iterator it7 = this.f4862v.iterator();
            while (it7.hasNext()) {
                ((AbstractC0623y) it7.next()).f3894O = this.f4846n;
            }
        }
        if (this.f4847z != null) {
            Iterator it8 = this.f4862v.iterator();
            while (it8.hasNext()) {
                AbstractC0623y abstractC0623y8 = (AbstractC0623y) it8.next();
                if (abstractC0623y8 instanceof InterfaceC0501l) {
                    ((InterfaceC0501l) abstractC0623y8).mo3314a(this.f4847z);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m2273a(AbstractC0197n abstractC0197n, AbstractC0197n abstractC0197n2) {
        if (abstractC0197n != null && abstractC0197n2 != null && abstractC0197n2.m4587d(abstractC0197n) && (this.f4849q & (1 << abstractC0197n2.f1306k)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m2246l() {
        InterfaceC0303as m4237a;
        AbstractC0244am m4425a;
        this.f4849q = (short) 0;
        for (int i = 0; i < AbstractC0197n.f1365c; i++) {
            AbstractC0197n m4562k = AbstractC0197n.m4562k(i);
            if (m4562k != null && m4562k.m4557p()) {
                this.f4849q = (short) (this.f4849q | (1 << i));
            }
        }
        if (LoggerMaybe.m1072A().mo973c(true) < 127 && this.f4843j != null && this.f4843j.m4222d() == EnumC0306av.build && (m4237a = this.f4843j.m4237a()) != null && (m4425a = AbstractC0244am.m4425a(m4237a)) != null && !(m4425a instanceof AbstractC0623y)) {
            LoggerMaybe.LogDebug2("Rejecting non OrderableUnit build order: " + m4237a.mo4252i());
            return false;
        } else if (this.f4843j != null && this.f4843j.f1805n) {
            LoggerMaybe.LogDebug2("Rejecting waypoint with addedByAction true");
            return false;
        } else {
            return true;
        }
    }
}
