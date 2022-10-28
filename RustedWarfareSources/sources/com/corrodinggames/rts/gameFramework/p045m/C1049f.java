package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.p012b.C0172a;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.p012b.C0182i;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0243al;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p024d.C0489e;
import com.corrodinggames.rts.game.units.p024d.C0492g;
import com.corrodinggames.rts.game.units.p024d.p025a.C0473b;
import com.corrodinggames.rts.gameFramework.AbstractC0726bk;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0747g;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/f.class */
public class C1049f extends AbstractC0726bk {

    /* renamed from: a */
    public static boolean f6658a = false;

    /* renamed from: b */
    int f6659b;

    /* renamed from: c */
    int f6660c;

    /* renamed from: d */
    AbstractC0197n f6661d;

    /* renamed from: e */
    EnumC1055l f6662e;

    /* renamed from: h */
    public C0385az f6665h;

    /* renamed from: i */
    boolean f6666i;

    /* renamed from: j */
    boolean f6667j;

    /* renamed from: k */
    public boolean f6668k;

    /* renamed from: l */
    public boolean f6669l;

    /* renamed from: m */
    boolean f6670m;

    /* renamed from: n */
    boolean f6671n;

    /* renamed from: o */
    boolean f6672o;

    /* renamed from: p */
    boolean f6673p;

    /* renamed from: q */
    public boolean f6674q;

    /* renamed from: E */
    public Paint f6688E;

    /* renamed from: F */
    public Paint f6689F;

    /* renamed from: G */
    public Paint f6690G;

    /* renamed from: H */
    public Paint f6691H;

    /* renamed from: N */
    public boolean f6697N;

    /* renamed from: f */
    EnumC1055l f6663f = EnumC1055l.f6725b;

    /* renamed from: g */
    public ArrayList f6664g = new ArrayList();

    /* renamed from: r */
    public int f6675r = 0;

    /* renamed from: s */
    String f6676s = null;

    /* renamed from: t */
    String f6677t = null;

    /* renamed from: u */
    int f6678u = 0;

    /* renamed from: v */
    int f6679v = 2;

    /* renamed from: w */
    int f6680w = 1;

    /* renamed from: x */
    int f6681x = 0;

    /* renamed from: y */
    public int f6682y = 0;

    /* renamed from: z */
    float f6683z = 3000.0f;

    /* renamed from: A */
    float f6684A = 0.0f;

    /* renamed from: B */
    float f6685B = 0.0f;

    /* renamed from: C */
    EnumC1051h f6686C = EnumC1051h.f6713a;

    /* renamed from: D */
    ArrayList f6687D = new ArrayList();

    /* renamed from: I */
    final boolean f6692I = true;

    /* renamed from: J */
    public ArrayList f6693J = new ArrayList();

    /* renamed from: K */
    PointF f6694K = new PointF();

    /* renamed from: L */
    int f6695L = 0;

    /* renamed from: M */
    float f6696M = 0.0f;

    /* renamed from: O */
    public ArrayList f6698O = new ArrayList();

    /* renamed from: P */
    PointF f6699P = new PointF();

    /* renamed from: Q */
    boolean f6700Q = false;

    /* renamed from: R */
    boolean f6701R = false;

    /* renamed from: S */
    ArrayList f6702S = new ArrayList();

    /* renamed from: T */
    ArrayList f6703T = new ArrayList();

    /* renamed from: a */
    public void m765a(String str) {
        LoggerMaybe.m982b("MissionEngine", "Map warning: " + str);
        C0831ad.m1544a((String) null, "Map error: " + str);
    }

    /* renamed from: a */
    public void mo2292a(StreamWriter streamWriter) {
        streamWriter.mo1314a(this.f6667j);
        streamWriter.WriteInteger(this.f6675r);
        streamWriter.WriteInteger(this.f6678u);
        streamWriter.WriteInteger(this.f6679v);
        streamWriter.WriteInteger(this.f6680w);
        streamWriter.WriteInteger(this.f6681x);
        streamWriter.mo1320a(this.f6683z);
        streamWriter.mo1320a(this.f6684A);
        streamWriter.mo1320a(this.f6685B);
        streamWriter.mo1314a(this.f6670m);
        streamWriter.WriteInteger(6);
        streamWriter.WriteInteger(this.f6693J.size());
        Iterator it = this.f6693J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            streamWriter.WriteUTF(c1030a.f6599c);
            streamWriter.mo1314a(c1030a.f6603j);
            streamWriter.WriteInteger(c1030a.f6604k);
            streamWriter.WriteInteger(c1030a.f6605l);
            streamWriter.mo1314a(c1030a.f6606m);
            streamWriter.WriteInteger(c1030a.f6620n);
        }
        streamWriter.WriteInteger(this.f6682y);
        streamWriter.mo1314a(this.f6669l);
    }

    /* renamed from: a */
    public void m769a(Reader reader) {
        this.f6667j = reader.ReadBool();
        this.f6675r = reader.ReadInt();
        this.f6678u = reader.ReadInt();
        this.f6679v = reader.ReadInt();
        this.f6680w = reader.ReadInt();
        this.f6681x = reader.ReadInt();
        this.f6683z = reader.m1285g();
        this.f6684A = reader.m1285g();
        this.f6685B = reader.m1285g();
        this.f6670m = reader.ReadBool();
        int ReadInt = reader.ReadInt();
        if (ReadInt >= 1) {
            int ReadInt2 = reader.ReadInt();
            for (int i = 0; i < ReadInt2; i++) {
                String ReadUTF = reader.ReadUTF();
                boolean ReadBool = reader.ReadBool();
                int i2 = 0;
                int i3 = 0;
                boolean z = false;
                int i4 = 0;
                if (ReadInt >= 2) {
                    i2 = reader.ReadInt();
                    i3 = reader.ReadInt();
                }
                if (ReadInt >= 3) {
                    z = reader.ReadBool();
                }
                if (ReadInt >= 4) {
                    i4 = reader.ReadInt();
                }
                C1030a m750e = m750e(ReadUTF);
                if (m750e == null) {
                    LoggerMaybe.m983b("MissionEngine:readIn: Could not find saved trigger:" + ReadUTF + " for de/activation");
                } else {
                    m750e.f6603j = ReadBool;
                    m750e.f6604k = i2;
                    m750e.f6605l = i3;
                    m750e.f6606m = z;
                    m750e.f6620n = i4;
                }
            }
        }
        if (ReadInt >= 5) {
            this.f6682y = reader.ReadInt();
        }
        if (ReadInt >= 6) {
            this.f6669l = reader.ReadBool();
        } else {
            this.f6669l = true;
        }
    }

    /* renamed from: b */
    public void m759b(String str) {
        LoggerMaybe.m982b("MissionEngine:triggerLog", str);
    }

    /* renamed from: a */
    public boolean m773a() {
        return this.f6671n;
    }

    /* renamed from: b */
    public boolean m761b() {
        return this.f6672o;
    }

    /* renamed from: a */
    public void m762a(boolean z) {
        String[] m4869a;
        String[] split;
        String[] split2;
        Integer m4861c;
        Integer m4861c2;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        this.f6674q = false;
        this.f6659b = m1072A.f6102by - 1000;
        this.f6660c = m1072A.f6102by - 1000;
        this.f6688E = new Paint();
        this.f6688E.m5420a(255, 255, 255, 255);
        this.f6688E.mo894a(true);
        this.f6688E.m5416a(Paint.Align.f196b);
        this.f6688E.mo896a(Typeface.m5330a(Typeface.f246c, 1));
        m1072A.m1035a(this.f6688E, 24.0f);
        this.f6690G = new Paint();
        this.f6690G.m5420a(255, 255, 255, 255);
        this.f6690G.mo894a(true);
        this.f6690G.m5416a(Paint.Align.f196b);
        m1072A.m1035a(this.f6690G, 18.0f);
        this.f6691H = new Paint();
        this.f6691H.m5420a(255, 255, 255, 255);
        this.f6691H.mo894a(true);
        this.f6691H.m5416a(Paint.Align.f196b);
        m1072A.m1035a(this.f6691H, 14.0f);
        this.f6689F = new Paint();
        this.f6689F.m5412a(this.f6691H);
        m1072A.m1035a(this.f6689F, 18.0f);
        this.f6667j = true;
        boolean z2 = false;
        C0172a c0172a = null;
        if (m1072A.f6110bL.f798Q == null) {
            LoggerMaybe.m982b("MissionEngine", "Error: 'triggers' object layer is missing from this map");
            z2 = true;
        } else {
            c0172a = m1072A.f6110bL.f798Q.m4740a("map_info");
        }
        if (c0172a == null) {
            LoggerMaybe.m982b("MissionEngine", "Error: map_info is missing from this map");
            z2 = true;
        }
        if (c0172a != null && c0172a.m4862b("type") == null) {
            m765a("type is missing from map_info");
            z2 = true;
        }
        if (z2) {
            LoggerMaybe.m982b("MissionEngine", "Defaulting to skirmish");
            this.f6671n = true;
            this.f6662e = EnumC1055l.f6729f;
            return;
        }
        this.f6668k = "survival".equalsIgnoreCase(c0172a.m4862b("type"));
        if (this.f6668k) {
            this.f6669l = "true".equalsIgnoreCase(c0172a.m4862b("survivalWavesClassic"));
            if (this.f6669l) {
                LoggerMaybe.LogDebug2("Classic survial waves selected");
            }
            m749f();
            this.f6673p = false;
            this.f6682y = m1072A.f6115bQ.aiDifficulty;
            if (!this.f6669l) {
                this.f6683z = 1200.0f;
                if (this.f6682y < 0) {
                    this.f6683z = 3000.0f;
                }
            } else {
                this.f6683z = 3000.0f;
            }
        }
        String m4862b = c0172a.m4862b("survivalWaves");
        if (m4862b != null) {
            m746g(m4862b);
        }
        String m4862b2 = c0172a.m4862b("startWithMusic");
        if (m4862b2 != null) {
            m1072A.f6112bN.m2659a(m4862b2);
        }
        this.f6671n = "skirmish".equalsIgnoreCase(c0172a.m4862b("type"));
        if (this.f6671n) {
            this.f6662e = EnumC1055l.f6729f;
        }
        this.f6672o = "true".equalsIgnoreCase(c0172a.m4862b("shareFogWithAllies"));
        String m4862b3 = c0172a.m4862b("winCondition");
        if (m4862b3 == null && !this.f6671n) {
            throw new C0179f("win condition not set");
        }
        if (m4862b3 != null) {
            if (m4862b3.equalsIgnoreCase("none")) {
                this.f6662e = EnumC1055l.f6724a;
            } else if (m4862b3.equalsIgnoreCase("allUnitsAndBuildings")) {
                this.f6662e = EnumC1055l.f6725b;
            } else if (m4862b3.equalsIgnoreCase("allBuildings")) {
                this.f6662e = EnumC1055l.f6726c;
            } else if (m4862b3.equalsIgnoreCase("mainBuilings")) {
                this.f6662e = EnumC1055l.f6727d;
            } else if (m4862b3.equalsIgnoreCase("mainBuildings")) {
                this.f6662e = EnumC1055l.f6727d;
            } else if (m4862b3.equalsIgnoreCase("commandCenter")) {
                this.f6662e = EnumC1055l.f6728e;
            } else if (m4862b3.equalsIgnoreCase("requiredObjectives")) {
                this.f6662e = EnumC1055l.f6730g;
            } else {
                throw new C0179f("unknown win condition:" + m4862b3);
            }
        }
        if (this.f6671n) {
            this.f6663f = this.f6662e;
        }
        this.f6665h = c0172a.m4866a("introText", (C0385az) null);
        if (this.f6665h != null) {
            this.f6665h.m4012a("\\\\n", "\n");
            if (this.f6665h.m4014a()) {
                this.f6665h = null;
            }
        }
        if (!m1072A.m992ax() && !this.f6671n) {
            this.f6661d = AbstractC0197n.m4562k(3);
            if (this.f6661d != null) {
                this.f6661d.f1312q = 0;
            }
        }
        if (m1072A.m992ax()) {
        }
        Iterator it = m1072A.f6110bL.f798Q.f946c.iterator();
        while (it.hasNext()) {
            C0172a c0172a2 = (C0172a) it.next();
            if ("team_info".equalsIgnoreCase(c0172a2.f769d)) {
                int parseInt = Integer.parseInt(c0172a2.m4865a("team", "-2"));
                if (parseInt == -2) {
                    throw new RuntimeException("cannot find team for:" + c0172a2.f767b);
                }
                AbstractC0197n m4562k = AbstractC0197n.m4562k(parseInt);
                if (m4562k == null) {
                    LoggerMaybe.m983b("No team loaded for:" + parseInt + " skipping");
                } else {
                    if (c0172a2.m4861c("credits") != null) {
                        m4562k.f1310o = m4861c2.intValue();
                    }
                    if (c0172a2.m4862b("basicAI") != null && m1072A.m1058O() && (m4562k instanceof C0136a)) {
                        LoggerMaybe.m983b("Using basic AI:" + parseInt + " by map request");
                        ((C0136a) m4562k).f585aX = true;
                    }
                    String m4862b4 = c0172a2.m4862b("lockAiDifficulty");
                    if (m4862b4 != null && (m4562k instanceof C0136a)) {
                        LoggerMaybe.m983b("Locking lockAiDifficulty:" + parseInt + " by map request to: " + m4862b4);
                        C0136a c0136a = (C0136a) m4562k;
                        c0136a.f1318w = Integer.parseInt(m4862b4);
                        c0136a.f1319x = true;
                        m1072A.f6122bX.m1513aq();
                    }
                    if (c0172a2.m4862b("disabledAI") != null && m1072A.m1058O() && (m4562k instanceof C0136a)) {
                        LoggerMaybe.m983b("Disabling AI:" + parseInt + " by map request");
                        ((C0136a) m4562k).f584aW = true;
                    }
                    String m4862b5 = c0172a2.m4862b("allyGroup");
                    if (m4862b5 != null && m1072A.m1058O()) {
                        m4562k.f1312q = Integer.parseInt(m4862b5);
                    }
                    String m4862b6 = c0172a2.m4862b("ai");
                    if (m4862b6 != null) {
                        m4562k.f1344T = m4862b6.equalsIgnoreCase("survival");
                    }
                }
            }
            if ("camera_start".equalsIgnoreCase(c0172a2.f767b) && !z) {
                m1072A.m988b(c0172a2.f770e, c0172a2.f771f);
                this.f6674q = true;
                if (c0172a2.m4861c("zoomTo") != null) {
                    m1072A.f6254cU = m4861c.intValue();
                }
            }
            if ("attack_point".equalsIgnoreCase(c0172a2.f767b)) {
                this.f6687D.add(new PointF(c0172a2.f770e, c0172a2.f771f));
            }
            if ("rotate".equalsIgnoreCase(c0172a2.f769d)) {
                float parseFloat = Float.parseFloat(c0172a2.m4862b("dir"));
                Iterator it2 = AbstractC0244am.f1590bD.iterator();
                while (it2.hasNext()) {
                    AbstractC0244am abstractC0244am = (AbstractC0244am) it2.next();
                    if ((abstractC0244am instanceof AbstractC0623y) && !abstractC0244am.m4402bI() && c0172a2.m4868a(abstractC0244am)) {
                        abstractC0244am.f1618ce = parseFloat;
                    }
                }
            }
            if ("fall".equalsIgnoreCase(c0172a2.f769d)) {
                Iterator it3 = AbstractC0244am.f1590bD.iterator();
                while (it3.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it3.next();
                    if ((abstractC0244am2 instanceof AbstractC0623y) && !abstractC0244am2.m4402bI() && c0172a2.m4868a(abstractC0244am2)) {
                        abstractC0244am2.m4332da();
                    }
                }
            }
            if ("set_team".equalsIgnoreCase(c0172a2.f769d)) {
                int parseInt2 = Integer.parseInt(c0172a2.m4862b("team"));
                Iterator it4 = AbstractC0244am.f1590bD.iterator();
                while (it4.hasNext()) {
                    AbstractC0244am abstractC0244am3 = (AbstractC0244am) it4.next();
                    if ((abstractC0244am3 instanceof AbstractC0623y) && c0172a2.m4868a(abstractC0244am3)) {
                        abstractC0244am3.m4435P(parseInt2);
                    }
                }
            }
            if ("ai_allow_full_use".equalsIgnoreCase(c0172a2.f769d)) {
                Iterator it5 = AbstractC0244am.f1590bD.iterator();
                while (it5.hasNext()) {
                    AbstractC0244am abstractC0244am4 = (AbstractC0244am) it5.next();
                    if ((abstractC0244am4 instanceof AbstractC0623y) && c0172a2.m4868a(abstractC0244am4)) {
                        ((AbstractC0623y) abstractC0244am4).f1599bL = false;
                    }
                }
            }
            if ("disable_unit_ai".equalsIgnoreCase(c0172a2.f769d)) {
                Iterator it6 = AbstractC0244am.f1590bD.iterator();
                while (it6.hasNext()) {
                    AbstractC0244am abstractC0244am5 = (AbstractC0244am) it6.next();
                    if ((abstractC0244am5 instanceof AbstractC0623y) && c0172a2.m4868a(abstractC0244am5)) {
                        abstractC0244am5.f1600bM = true;
                    }
                }
            }
        }
        Iterator it7 = AbstractC0244am.f1590bD.iterator();
        while (it7.hasNext()) {
            AbstractC0244am abstractC0244am6 = (AbstractC0244am) it7.next();
            if (!abstractC0244am6.mo1712u() && !(abstractC0244am6 instanceof C0243al) && !abstractC0244am6.m4402bI() && abstractC0244am6.f1651cL == null && abstractC0244am6.f1652cM == null) {
                AbstractC0244am abstractC0244am7 = null;
                float f = 4900.0f;
                Iterator it8 = AbstractC0244am.f1590bD.iterator();
                while (it8.hasNext()) {
                    AbstractC0244am abstractC0244am8 = (AbstractC0244am) it8.next();
                    if (abstractC0244am8.m4343cq() && abstractC0244am6 != abstractC0244am8 && (abstractC0244am6.f1609bV == AbstractC0197n.f1371i || abstractC0244am8.f1609bV.m4587d(abstractC0244am6.f1609bV))) {
                        float m2157a = C0758f.m2157a(abstractC0244am8.f6957el, abstractC0244am8.f6958em, abstractC0244am6.f6957el, abstractC0244am6.f6958em);
                        if (m2157a < f && abstractC0244am8.m4335d(abstractC0244am6, true)) {
                            abstractC0244am7 = abstractC0244am8;
                            f = m2157a;
                        }
                    }
                }
                if (abstractC0244am7 != null) {
                    abstractC0244am7.m4317e(abstractC0244am6, true);
                }
            }
        }
        this.f6693J.clear();
        Iterator it9 = m1072A.f6110bL.f798Q.f946c.iterator();
        while (it9.hasNext()) {
            C0172a c0172a3 = (C0172a) it9.next();
            if (!"team_info".equalsIgnoreCase(c0172a3.f769d) && !"point".equalsIgnoreCase(c0172a3.f769d) && !"camera_pan".equalsIgnoreCase(c0172a3.f769d) && !"camera_start".equalsIgnoreCase(c0172a3.f767b) && !"map_info".equalsIgnoreCase(c0172a3.f767b) && !"attack_point".equalsIgnoreCase(c0172a3.f767b) && !"rotate".equalsIgnoreCase(c0172a3.f769d) && !"fall".equalsIgnoreCase(c0172a3.f769d) && !"set_team".equalsIgnoreCase(c0172a3.f769d) && !"ai_allow_full_use".equalsIgnoreCase(c0172a3.f769d) && !"disable_unit_ai".equalsIgnoreCase(c0172a3.f769d) && !"info".equalsIgnoreCase(c0172a3.f769d)) {
                if (c0172a3.f780n == null) {
                    m755c("Error: Skipping trigger:" + c0172a3.f767b + " - no properties found");
                } else {
                    C1030a m777a = C1035c.m777a(this, c0172a3);
                    if (m777a != null) {
                        this.f6693J.add(m777a);
                    }
                }
            }
        }
        Iterator it10 = this.f6693J.iterator();
        while (it10.hasNext()) {
            C1030a c1030a = (C1030a) it10.next();
            String m797b = c1030a.m797b("activateIds");
            if (m797b == null) {
                m797b = c1030a.m797b("alsoActivate");
            }
            if (m797b != null) {
                for (String str : m797b.split(",")) {
                    C1030a m752d = m752d(str);
                    if (m752d == null) {
                        c1030a.m788g("linkedTo target not found: " + m797b);
                        LoggerMaybe.LogDebug2("Possible IDs:");
                        Iterator it11 = this.f6693J.iterator();
                        while (it11.hasNext()) {
                            C1030a c1030a2 = (C1030a) it11.next();
                            if (c1030a2.f6598b != null) {
                                LoggerMaybe.LogDebug2(c1030a2.f6598b);
                            }
                        }
                        LoggerMaybe.LogDebug2("--------");
                    } else {
                        m752d.f6617d.m779a(c1030a);
                    }
                }
            }
            String m797b2 = c1030a.m797b("whenActivatedIds");
            if (m797b2 == null) {
                m797b2 = c1030a.m797b("activatedBy");
            }
            if (m797b2 != null) {
                for (String str2 : m797b2.split(",")) {
                    C1030a m752d2 = m752d(str2);
                    if (m752d2 == null) {
                        c1030a.m788g("linkedFrom target not found: " + str2);
                    } else {
                        c1030a.f6617d.m779a(m752d2);
                    }
                }
            }
            String m797b3 = c1030a.m797b("deactivatedBy");
            if (m797b3 != null) {
                for (String str3 : m797b3.split(",")) {
                    C1030a m752d3 = m752d(str3);
                    if (m752d3 == null) {
                        c1030a.m788g("deactivatedBy: target not found: " + str3);
                    } else {
                        c1030a.f6618e.m779a(m752d3);
                    }
                }
            }
        }
        LoggerMaybe.LogDebug2("Found " + this.f6693J.size() + " map triggers");
        Iterator it12 = this.f6693J.iterator();
        while (it12.hasNext()) {
            C1030a c1030a3 = (C1030a) it12.next();
            int length = c1030a3.f6608t.m4869a().length;
            for (int i = 0; i < length; i++) {
                c1030a3.m788g("Key was not used: " + m4869a[i]);
            }
        }
        m757c();
    }

    /* renamed from: c */
    public void m757c() {
        Iterator it = this.f6693J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6600g == EnumC1037e.f6646a) {
                boolean z = false;
                Iterator it2 = this.f6664g.iterator();
                while (it2.hasNext()) {
                    if (((C1056m) it2.next()).f6732a == c1030a) {
                        z = true;
                    }
                }
                if (!z) {
                    C1056m c1056m = new C1056m();
                    c1056m.f6732a = c1030a;
                    this.f6664g.add(c1056m);
                    LoggerMaybe.LogDebug2("Found objective: " + c1056m.m737a());
                }
            }
        }
    }

    /* renamed from: c */
    public static void m755c(String str) {
        LoggerMaybe.m1072A();
        LoggerMaybe.m982b("MissionEngine", str);
        C0831ad.m1449g(str);
    }

    /* renamed from: d */
    public C1030a m752d(String str) {
        String trim = str.trim();
        Iterator it = this.f6693J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6598b != null && c1030a.f6598b.equalsIgnoreCase(trim)) {
                return c1030a;
            }
        }
        return null;
    }

    /* renamed from: e */
    public C1030a m750e(String str) {
        String trim = str.trim();
        Iterator it = this.f6693J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6599c.equalsIgnoreCase(trim)) {
                return c1030a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public PointF m748f(String str) {
        C0182i c0182i = LoggerMaybe.m1072A().f6110bL.f798Q;
        if (c0182i != null) {
            Iterator it = c0182i.f946c.iterator();
            while (it.hasNext()) {
                C0172a c0172a = (C0172a) it.next();
                if ("point".equalsIgnoreCase(c0172a.f769d) && c0172a.f768c != null && c0172a.f768c.equalsIgnoreCase(str)) {
                    this.f6694K.m5369a(c0172a.f770e, c0172a.f771f);
                    return this.f6694K;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m772a(float f) {
        LoggerMaybe.m1072A();
    }

    /* renamed from: b */
    public void m760b(float f) {
        C1050g m753d;
        C1052i m754c;
        String m4011b;
        C0747g c0747g;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        if (this.f6666i) {
            Iterator it = this.f6693J.iterator();
            while (it.hasNext()) {
                C1030a c1030a = (C1030a) it.next();
                if (c1030a.f6600g == EnumC1037e.f6652g && c1030a.f6603j) {
                    float m799b = c1030a.m799b() - m1072A.f6144cv;
                    float m795c = c1030a.m795c() - m1072A.f6145cw;
                    float f2 = m799b * m1072A.f6256cW;
                    float f3 = m795c * m1072A.f6256cW;
                    float f4 = f2 + c1030a.f6610w;
                    float f5 = f3 + c1030a.f6611x;
                    if (c1030a.f6616C) {
                        C0743c.f4689s[9].m2280a(2, f4, f5, c1030a.f6615B);
                        f5 -= c0747g.f4821c - 2;
                    }
                    if (c1030a.f6613z != null && (m4011b = c1030a.f6613z.m4011b()) != null && !m4011b.equals(VariableScope.nullOrMissingString)) {
                        m1072A.f6113bO.mo181a(m4011b, f4, f5, c1030a.f6615B);
                    }
                }
            }
        }
        if (this.f6668k && !this.f6697N) {
            boolean z = false;
            this.f6685B = C0758f.m2159a(this.f6685B, f);
            if (this.f6685B == 0.0f && this.f6684A != 0.0f) {
                this.f6684A = C0758f.m2159a(this.f6684A, f);
                z = true;
            }
            if (1 != 0) {
                if (z) {
                    int m5378k = (int) (23.0f + (this.f6688E.m5378k() / 2.0f));
                    m1072A.f6113bO.mo181a("- Wave " + this.f6675r + " -", m1072A.f6153cE / 2.0f, m5378k, this.f6688E);
                    if (this.f6676s != null) {
                        m1072A.f6113bO.mo181a(this.f6676s, m1072A.f6153cE / 2.0f, m5378k + this.f6688E.m5378k() + 2.0f, this.f6689F);
                    }
                } else {
                    int m5378k2 = (int) (23.0f + (this.f6690G.m5378k() / 2.0f));
                    String str = "Wave " + (this.f6675r + 1) + " in " + C0758f.m2052f(String.valueOf((int) (this.f6683z / 60.0d)), 3);
                    if (this.f6670m) {
                        str = "Defeat - Wave " + this.f6675r;
                    }
                    m1072A.f6113bO.mo181a(str, m1072A.f6153cE / 2.0f, m5378k2, this.f6690G);
                    if (this.f6677t == null) {
                        if (!this.f6669l) {
                            m754c = m758b(false);
                        } else {
                            m754c = m754c(false);
                        }
                        this.f6677t = m754c.toString();
                    }
                    m1072A.f6113bO.mo181a(this.f6677t, m1072A.f6153cE / 2.0f, m5378k2 + this.f6690G.m5378k() + 2.0f, this.f6691H);
                }
            }
        }
        if (this.f6668k && this.f6697N && (m753d = m753d()) != null) {
            int i = m753d.f6708e - (m1072A.f6102by / 1000);
            int m5378k3 = (int) (23.0f + (this.f6690G.m5378k() / 2.0f));
            String str2 = "Wave " + (this.f6675r + 1) + " in " + C0758f.m2052f(String.valueOf(i), 3);
            if (this.f6670m) {
                str2 = "Defeat - Wave " + this.f6675r;
            }
            m1072A.f6113bO.mo181a(str2, m1072A.f6153cE / 2.0f, m5378k3, this.f6690G);
            String str3 = m753d.f6709f;
            if (str3 != null) {
                m1072A.f6113bO.mo181a(str3, m1072A.f6153cE / 2.0f, m5378k3 + this.f6690G.m5378k() + 2.0f, this.f6691H);
            }
        }
    }

    /* renamed from: g */
    public void m746g(String str) {
        String[] split;
        LoggerMaybe.LogDebug2("Loading survival waves");
        this.f6697N = true;
        int i = 0;
        int i2 = 0;
        for (String str2 : str.split("\n")) {
            i2++;
            C1050g c1050g = new C1050g(this);
            if (c1050g.m741a(str2)) {
                c1050g.f6708e = i + ((int) c1050g.f6707d);
                i = c1050g.f6708e;
                LoggerMaybe.LogDebug2("Adding wave " + i2 + " at " + c1050g.f6708e);
                this.f6698O.add(c1050g);
            }
        }
    }

    /* renamed from: d */
    public C1050g m753d() {
        if (this.f6675r < this.f6698O.size()) {
            return (C1050g) this.f6698O.get(this.f6675r);
        }
        return null;
    }

    /* renamed from: e */
    public void m751e() {
        this.f6701R = true;
        this.f6699P.m5368a((PointF) this.f6687D.get(C0758f.m2149a(0, this.f6687D.size() - 1, this.f6675r)));
    }

    /* renamed from: f */
    public void m749f() {
        this.f6702S.clear();
        m763a(this.f6702S, "scout", 0.7f);
        m764a(this.f6702S, EnumC0249ar.f1743i, 2.1f);
        m763a(this.f6702S, "mechGun", 1.0f);
        m763a(this.f6702S, "lightGunship", 2.8f);
        m764a(this.f6702S, EnumC0249ar.f1744j, 1.9f);
        m764a(this.f6702S, EnumC0249ar.f1746l, 0.8f);
        m764a(this.f6702S, EnumC0249ar.f1757w, 1.0f);
        m764a(this.f6702S, EnumC0249ar.f1758x, 0.8f);
        m764a(this.f6702S, EnumC0249ar.f1748n, 0.7f);
        m763a(this.f6702S, "plasmaTank", 0.6f);
        m763a(this.f6702S, "missileAirship", 0.4f);
        this.f6703T.clear();
        m764a(this.f6703T, EnumC0249ar.f1766F, 1.0f);
        m764a(this.f6703T, EnumC0249ar.f1775O, 0.5f);
    }

    /* renamed from: a */
    public void m763a(ArrayList arrayList, String str, float f) {
        m764a(arrayList, C0453l.m3485s(str), f);
    }

    /* renamed from: a */
    public void m764a(ArrayList arrayList, InterfaceC0303as interfaceC0303as, float f) {
        if (interfaceC0303as == null) {
            interfaceC0303as = EnumC0249ar.f1743i;
        }
        InterfaceC0303as m3520c = C0453l.m3520c(interfaceC0303as);
        if (m3520c != null) {
            interfaceC0303as = m3520c;
        }
        C1054k c1054k = new C1054k(this);
        c1054k.f6721a = interfaceC0303as;
        c1054k.f6722b = f;
        arrayList.add(c1054k);
    }

    /* renamed from: a */
    public void m767a(C1052i c1052i, int i, float f) {
        if (i < 0) {
            i = 0;
        }
        int size = this.f6702S.size();
        if (size == 0) {
            LoggerMaybe.m983b("error maxTypeNum: " + size);
            return;
        }
        C1054k c1054k = (C1054k) this.f6702S.get(i % size);
        int m2064e = (int) C0758f.m2064e((int) ((i + 3) * 0.5d * c1054k.f6722b * f), 0.8f);
        if (m2064e < 1) {
            m2064e = 1;
        }
        c1052i.m738b(c1054k.f6721a, m2064e);
    }

    /* renamed from: b */
    public C1052i m758b(boolean z) {
        C1052i c1052i = new C1052i(this);
        boolean z2 = false;
        if (this.f6678u > 50 && (this.f6678u + 1) % 100 == 0) {
            int size = this.f6703T.size();
            int i = this.f6678u / 100;
            if (size == 0) {
                LoggerMaybe.m983b("error maxTypeNum: " + size);
            } else {
                C1054k c1054k = (C1054k) this.f6703T.get(i % size);
                int i2 = (int) (i * c1054k.f6722b);
                if (i2 < 1) {
                    i2 = 1;
                }
                c1052i.m738b(c1054k.f6721a, i2);
            }
            z2 = true;
        }
        int i3 = 0;
        if (this.f6682y > 0) {
            i3 = this.f6682y;
        }
        m767a(c1052i, this.f6678u + i3, 1.0f);
        if (this.f6678u > 15 && !z2) {
            m767a(c1052i, ((int) ((this.f6678u + i3) * 1.1f)) - 11, 0.5f);
        }
        if (z) {
            this.f6678u++;
            this.f6679v++;
        }
        return c1052i;
    }

    /* renamed from: c */
    public C1052i m754c(boolean z) {
        C1052i c1052i = new C1052i(this);
        c1052i.f6715a = false;
        int i = this.f6679v;
        EnumC0249ar enumC0249ar = null;
        if (this.f6673p) {
            enumC0249ar = EnumC0249ar.f1754t;
        } else {
            if (this.f6678u == 0) {
                i++;
                enumC0249ar = EnumC0249ar.f1743i;
            }
            if (this.f6678u == 1) {
                enumC0249ar = EnumC0249ar.f1744j;
            }
            if (this.f6678u == 2) {
                enumC0249ar = EnumC0249ar.f1746l;
            }
            if (this.f6678u == 3) {
                i = this.f6680w;
                enumC0249ar = EnumC0249ar.f1757w;
            }
            if (this.f6678u == 4) {
                i = this.f6680w;
                enumC0249ar = EnumC0249ar.f1758x;
                if (this.f6680w % 2 == 0) {
                    enumC0249ar = EnumC0249ar.f1748n;
                }
            }
            if (this.f6678u == 5) {
                c1052i.f6715a = true;
                i = 1;
                enumC0249ar = EnumC0249ar.f1766F;
            }
            if (z) {
                this.f6678u++;
                boolean z2 = false;
                if (this.f6680w == 1) {
                    if (this.f6678u > 2) {
                        z2 = true;
                    }
                } else if (this.f6680w < 5) {
                    if (this.f6678u > 4) {
                        z2 = true;
                    }
                } else {
                    if (this.f6678u > 5) {
                        z2 = true;
                    }
                    if (this.f6678u > 4 && this.f6680w % 2 == 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.f6678u = 0;
                    this.f6679v += 2;
                    this.f6680w++;
                }
            }
        }
        c1052i.m739a(enumC0249ar, i);
        return c1052i;
    }

    /* renamed from: c */
    public void m756c(float f) {
        C1052i m754c;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        int i = m1072A.f6102by;
        this.f6696M = C0758f.m2159a(this.f6696M, f);
        if (m1072A.f6081aq && m1072A.f6243bH) {
            C0172a c0172a = null;
            if (m1072A.f6110bL.f798Q != null) {
                Iterator it = m1072A.f6110bL.f798Q.f946c.iterator();
                while (it.hasNext()) {
                    C0172a c0172a2 = (C0172a) it.next();
                    if ("camera_pan".equalsIgnoreCase(c0172a2.f769d) && this.f6695L == Integer.parseInt(c0172a2.m4865a("index", "-1"))) {
                        c0172a = c0172a2;
                    }
                }
            }
            if (c0172a == null) {
                this.f6695L = 0;
            } else {
                float f2 = c0172a.f770e;
                float f3 = c0172a.f771f;
                if (f2 < m1072A.f6156cH + 2.0f) {
                    f2 = m1072A.f6156cH + 2.0f;
                }
                if (f3 < m1072A.f6157cI + 2.0f) {
                    f3 = m1072A.f6157cI + 2.0f;
                }
                if (f2 > (m1072A.f6110bL.m4794i() - m1072A.f6156cH) - 2.0f) {
                    f2 = (m1072A.f6110bL.m4794i() - m1072A.f6156cH) - 2.0f;
                }
                if (f3 > (m1072A.f6110bL.m4793j() - m1072A.f6157cI) - 2.0f) {
                    f3 = (m1072A.f6110bL.m4793j() - m1072A.f6157cI) - 2.0f;
                }
                float m2071d = C0758f.m2071d(m1072A.f6146cx + m1072A.f6156cH, m1072A.f6147cy + m1072A.f6157cI, f2, f3);
                float m2157a = C0758f.m2157a(m1072A.f6146cx + m1072A.f6156cH, m1072A.f6147cy + m1072A.f6157cI, f2, f3);
                if (this.f6696M == 0.0f && (m2157a < 225.0f || m1072A.f6141cs)) {
                    this.f6695L++;
                    this.f6696M = 50.0f;
                }
                float f4 = 0.45f * f;
                m1072A.f6146cx += C0758f.m2040i(m2071d) * f4;
                m1072A.f6147cy += C0758f.m2045h(m2071d) * f4;
                m1072A.m1045a(m1072A.f6146cx, m1072A.f6147cy);
                m1072A.m1057P();
            }
        }
        if (this.f6668k) {
            if (!this.f6697N) {
                if (!this.f6670m) {
                    this.f6683z = C0758f.m2159a(this.f6683z, f);
                }
                if (this.f6683z == 0.0f && !this.f6670m) {
                    this.f6675r++;
                    this.f6684A = 180.0f;
                    PointF pointF = (PointF) this.f6687D.get(C0758f.m2149a(0, this.f6687D.size() - 1, this.f6675r));
                    if (!this.f6669l) {
                        this.f6676s = m758b(false).toString();
                        m754c = m758b(true);
                    } else {
                        this.f6676s = m754c(false).toString();
                        m754c = m754c(true);
                    }
                    this.f6683z = 1800.0f;
                    if (!this.f6669l) {
                        if (this.f6682y > 0) {
                            this.f6683z -= (this.f6682y * 3) * 60;
                        } else {
                            this.f6683z -= (this.f6682y * 9) * 60;
                        }
                    }
                    m754c.m740a(pointF.f227a, pointF.f228b);
                    this.f6677t = null;
                }
            } else if (!this.f6670m) {
                C1050g m753d = m753d();
                if (m753d != null) {
                    if (m753d.f6708e * 1000 < m1072A.f6102by) {
                        m753d.m742a();
                        this.f6675r++;
                    }
                } else if (!m1072A.f6267dp && !m1072A.f6126cb.m2411h()) {
                    m1072A.f6117bS.m1872F();
                }
            }
        }
        if (this.f6667j) {
            this.f6667j = false;
            if (this.f6665h != null) {
                m1072A.m1029a("Briefing", this.f6665h);
            }
        }
        if (i > this.f6659b + 250) {
            this.f6659b = i;
            m771a(i);
        }
        if (i > this.f6660c + 1000) {
            this.f6660c = i;
            if (m745h()) {
                m745h();
                m745h();
            }
            boolean z = false;
            boolean z2 = false;
            if (m1072A.f6099bs != null) {
                if (m1072A.f6099bs.m4565j()) {
                    z = true;
                }
                if (m1072A.f6099bs.m4619b()) {
                    z2 = true;
                }
            }
            if (!m1072A.f6267dp && !m1072A.f6270ds && !m1072A.f6126cb.m2411h() && !z && !z2) {
                boolean z3 = true;
                boolean z4 = true;
                if (this.f6662e == EnumC1055l.f6724a) {
                    z3 = false;
                } else if (this.f6662e == EnumC1055l.f6730g) {
                    Iterator it2 = this.f6664g.iterator();
                    while (it2.hasNext()) {
                        if (!((C1056m) it2.next()).m736b()) {
                            z3 = false;
                        }
                    }
                } else if (m1072A.f6099bs != null) {
                    Iterator it3 = AbstractC0244am.f1590bD.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        AbstractC0244am abstractC0244am = (AbstractC0244am) it3.next();
                        if (m1072A.f6099bs.m4599c(abstractC0244am.f1609bV) && m766a(this.f6662e, abstractC0244am)) {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (this.f6663f == EnumC1055l.f6724a) {
                    z4 = false;
                } else if (this.f6663f == EnumC1055l.f6730g) {
                    z4 = false;
                } else if (m1072A.f6099bs != null) {
                    Iterator it4 = AbstractC0244am.f1590bD.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        AbstractC0244am abstractC0244am2 = (AbstractC0244am) it4.next();
                        if (m1072A.f6099bs.m4587d(abstractC0244am2.f1609bV) && m766a(this.f6663f, abstractC0244am2)) {
                            z4 = false;
                            break;
                        }
                    }
                }
                if (z4 && !z3) {
                    m1072A.f6117bS.m1871G();
                }
                if (z3) {
                    m1072A.f6117bS.m1872F();
                    if (m1072A.f6102by > 1500) {
                        m1072A.f6115bQ.numberOfWins++;
                        m1072A.f6115bQ.save();
                    }
                }
            }
            if (this.f6668k && !this.f6670m) {
                boolean z5 = true;
                Iterator it5 = AbstractC0244am.f1590bD.iterator();
                while (it5.hasNext()) {
                    AbstractC0244am abstractC0244am3 = (AbstractC0244am) it5.next();
                    if ((abstractC0244am3 instanceof C0489e) || abstractC0244am3.f1602bO) {
                        if (!abstractC0244am3.f1607bT && !abstractC0244am3.mo1712u() && abstractC0244am3.f1609bV == m1072A.f6099bs) {
                            z5 = false;
                        }
                    }
                }
                if (z5) {
                    this.f6670m = true;
                    m1072A.f6117bS.m1871G();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m766a(EnumC1055l enumC1055l, AbstractC0244am abstractC0244am) {
        if (!(abstractC0244am instanceof AbstractC0623y) || abstractC0244am.f1607bT || abstractC0244am.m4363cS() || enumC1055l == EnumC1055l.f6724a) {
            return false;
        }
        if (enumC1055l == EnumC1055l.f6725b) {
            return true;
        }
        if (enumC1055l == EnumC1055l.f6726c) {
            return abstractC0244am.m4402bI();
        }
        if (enumC1055l == EnumC1055l.f6728e) {
            return (abstractC0244am instanceof C0489e) || abstractC0244am.f1602bO;
        } else if (enumC1055l == EnumC1055l.f6727d) {
            return abstractC0244am.m4402bI() && abstractC0244am.mo3269bJ() && !(abstractC0244am instanceof C0473b) && !(abstractC0244am instanceof C0492g);
        } else if (enumC1055l == EnumC1055l.f6729f) {
            if (abstractC0244am.mo3269bJ() || abstractC0244am.m4412ak()) {
                return true;
            }
            return false;
        } else if (enumC1055l == EnumC1055l.f6730g) {
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: h */
    public void m744h(String str) {
        LoggerMaybe.LogDebug2("Map Script: " + str);
    }

    /* renamed from: a */
    public void m768a(C1030a c1030a) {
        if (m747g()) {
            m744h("Activiated trigger:" + c1030a.f6597a + " (id:" + c1030a.f6598b + ")");
        }
    }

    /* renamed from: g */
    public boolean m747g() {
        return f6658a && LoggerMaybe.m1072A().f6231bl;
    }

    /* renamed from: i */
    public static void m743i(String str) {
        C0831ad.m1449g("Map ScriptError: " + str);
    }

    /* renamed from: a */
    public void m771a(int i) {
        Iterator it = this.f6693J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6603j && c1030a.f6622q != -1 && i >= c1030a.f6604k + c1030a.f6622q) {
                c1030a.f6603j = false;
                c1030a.f6625u = false;
            }
            if (!c1030a.f6603j && !c1030a.f6625u && c1030a.m792d()) {
                c1030a.f6625u = true;
            }
            if ((c1030a.f6603j || c1030a.f6625u) && c1030a.f6618e.m778b()) {
                c1030a.f6603j = false;
                c1030a.f6625u = false;
                c1030a.f6606m = true;
            }
            if (c1030a.f6603j && c1030a.f6607p > 0 && i >= c1030a.f6604k + c1030a.f6607p) {
                c1030a.f6625u = true;
            }
            if (c1030a.f6625u) {
                c1030a.f6625u = false;
                try {
                    C1036d.m776a(this, c1030a);
                } catch (C0179f e) {
                    e.printStackTrace();
                    c1030a.m788g("Error activating trigger: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: h */
    public boolean m745h() {
        boolean z;
        boolean z2 = false;
        LoggerMaybe m1072A = LoggerMaybe.m1072A();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == AbstractC0197n.f1371i && (abstractC0244am instanceof AbstractC0623y) && abstractC0244am.m4396bS() && !abstractC0244am.mo3248o()) {
                int i2 = 0;
                int size2 = AbstractC0244am.f1590bD.size();
                while (true) {
                    if (i2 < size2) {
                        AbstractC0244am abstractC0244am2 = m498a[i2];
                        if (!m1072A.m992ax()) {
                            z = abstractC0244am2.f1609bV == m1072A.f6099bs;
                        } else {
                            z = !abstractC0244am2.f1609bV.f1317v;
                            if (abstractC0244am.m4368cN()) {
                                z = true;
                            }
                        }
                        if (abstractC0244am2.f1609bV != null && abstractC0244am2.f1609bV.f1306k < 0) {
                            z = false;
                        }
                        if (!z || abstractC0244am2.f1609bV == abstractC0244am.f1609bV || !(abstractC0244am2 instanceof AbstractC0623y) || abstractC0244am2.mo2981i() || !abstractC0244am2.m4396bS() || C0758f.m2157a(abstractC0244am2.f6957el, abstractC0244am2.f6958em, abstractC0244am.f6957el, abstractC0244am.f6958em) >= 28900.0f) {
                            i2++;
                        } else {
                            abstractC0244am.m4318e(abstractC0244am2.f1609bV);
                            abstractC0244am.f1647cH = 60.0f;
                            z2 = true;
                            break;
                        }
                    }
                }
            }
        }
        return z2;
    }
}
