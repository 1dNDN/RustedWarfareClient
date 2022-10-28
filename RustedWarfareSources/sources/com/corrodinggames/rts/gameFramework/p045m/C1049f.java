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
import com.corrodinggames.rts.gameFramework.Core;
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
    public void m778a(String str) {
        Core.m997b("MissionEngine", "Map warning: " + str);
        C0831ad.m1588a((String) null, "Map error: " + str);
    }

    /* renamed from: a */
    public void mo2441a(StreamWriter streamWriter) {
        streamWriter.mo1329a(this.f6667j);
        streamWriter.WriteInteger(this.f6675r);
        streamWriter.WriteInteger(this.f6678u);
        streamWriter.WriteInteger(this.f6679v);
        streamWriter.WriteInteger(this.f6680w);
        streamWriter.WriteInteger(this.f6681x);
        streamWriter.mo1335a(this.f6683z);
        streamWriter.mo1335a(this.f6684A);
        streamWriter.mo1335a(this.f6685B);
        streamWriter.mo1329a(this.f6670m);
        streamWriter.WriteInteger(6);
        streamWriter.WriteInteger(this.f6693J.size());
        Iterator it = this.f6693J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            streamWriter.WriteUTF(c1030a.f6599c);
            streamWriter.mo1329a(c1030a.f6606j);
            streamWriter.WriteInteger(c1030a.f6607k);
            streamWriter.WriteInteger(c1030a.f6608l);
            streamWriter.mo1329a(c1030a.f6609m);
            streamWriter.WriteInteger(c1030a.f6610n);
        }
        streamWriter.WriteInteger(this.f6682y);
        streamWriter.mo1329a(this.f6669l);
    }

    /* renamed from: a */
    public void m782a(Reader reader) {
        this.f6667j = reader.ReadBool();
        this.f6675r = reader.ReadInt();
        this.f6678u = reader.ReadInt();
        this.f6679v = reader.ReadInt();
        this.f6680w = reader.ReadInt();
        this.f6681x = reader.ReadInt();
        this.f6683z = reader.m1300g();
        this.f6684A = reader.m1300g();
        this.f6685B = reader.m1300g();
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
                C1030a m763e = m763e(ReadUTF);
                if (m763e == null) {
                    Core.m998b("MissionEngine:readIn: Could not find saved trigger:" + ReadUTF + " for de/activation");
                } else {
                    m763e.f6606j = ReadBool;
                    m763e.f6607k = i2;
                    m763e.f6608l = i3;
                    m763e.f6609m = z;
                    m763e.f6610n = i4;
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
    public void m772b(String str) {
        Core.m997b("MissionEngine:triggerLog", str);
    }

    /* renamed from: a */
    public boolean m786a() {
        return this.f6671n;
    }

    /* renamed from: b */
    public boolean m774b() {
        return this.f6672o;
    }

    /* renamed from: a */
    public void m775a(boolean z) {
        String[] m5356a;
        String[] split;
        String[] split2;
        Integer m5348c;
        Integer m5348c2;
        Core m1087A = Core.m1087A();
        this.f6674q = false;
        this.f6659b = m1087A.f6102by - 1000;
        this.f6660c = m1087A.f6102by - 1000;
        this.f6688E = new Paint();
        this.f6688E.m5933a(255, 255, 255, 255);
        this.f6688E.mo5914a(true);
        this.f6688E.m5929a(Paint.Align.f196b);
        this.f6688E.mo5924a(Typeface.m5840a(Typeface.f246c, 1));
        m1087A.m1050a(this.f6688E, 24.0f);
        this.f6690G = new Paint();
        this.f6690G.m5933a(255, 255, 255, 255);
        this.f6690G.mo5914a(true);
        this.f6690G.m5929a(Paint.Align.f196b);
        m1087A.m1050a(this.f6690G, 18.0f);
        this.f6691H = new Paint();
        this.f6691H.m5933a(255, 255, 255, 255);
        this.f6691H.mo5914a(true);
        this.f6691H.m5929a(Paint.Align.f196b);
        m1087A.m1050a(this.f6691H, 14.0f);
        this.f6689F = new Paint();
        this.f6689F.m5925a(this.f6691H);
        m1087A.m1050a(this.f6689F, 18.0f);
        this.f6667j = true;
        boolean z2 = false;
        C0172a c0172a = null;
        if (m1087A.f6110bL.f798Q == null) {
            Core.m997b("MissionEngine", "Error: 'triggers' object layer is missing from this map");
            z2 = true;
        } else {
            c0172a = m1087A.f6110bL.f798Q.m5227a("map_info");
        }
        if (c0172a == null) {
            Core.m997b("MissionEngine", "Error: map_info is missing from this map");
            z2 = true;
        }
        if (c0172a != null && c0172a.m5349b("type") == null) {
            m778a("type is missing from map_info");
            z2 = true;
        }
        if (z2) {
            Core.m997b("MissionEngine", "Defaulting to skirmish");
            this.f6671n = true;
            this.f6662e = EnumC1055l.f6729f;
            return;
        }
        this.f6668k = "survival".equalsIgnoreCase(c0172a.m5349b("type"));
        if (this.f6668k) {
            this.f6669l = "true".equalsIgnoreCase(c0172a.m5349b("survivalWavesClassic"));
            if (this.f6669l) {
                Core.LogDebug2("Classic survial waves selected");
            }
            m762f();
            this.f6673p = false;
            this.f6682y = m1087A.settingEngine.aiDifficulty;
            if (!this.f6669l) {
                this.f6683z = 1200.0f;
                if (this.f6682y < 0) {
                    this.f6683z = 3000.0f;
                }
            } else {
                this.f6683z = 3000.0f;
            }
        }
        String m5349b = c0172a.m5349b("survivalWaves");
        if (m5349b != null) {
            m759g(m5349b);
        }
        String m5349b2 = c0172a.m5349b("startWithMusic");
        if (m5349b2 != null) {
            m1087A.f6112bN.m2713a(m5349b2);
        }
        this.f6671n = "skirmish".equalsIgnoreCase(c0172a.m5349b("type"));
        if (this.f6671n) {
            this.f6662e = EnumC1055l.f6729f;
        }
        this.f6672o = "true".equalsIgnoreCase(c0172a.m5349b("shareFogWithAllies"));
        String m5349b3 = c0172a.m5349b("winCondition");
        if (m5349b3 == null && !this.f6671n) {
            throw new C0179f("win condition not set");
        }
        if (m5349b3 != null) {
            if (m5349b3.equalsIgnoreCase("none")) {
                this.f6662e = EnumC1055l.f6724a;
            } else if (m5349b3.equalsIgnoreCase("allUnitsAndBuildings")) {
                this.f6662e = EnumC1055l.f6725b;
            } else if (m5349b3.equalsIgnoreCase("allBuildings")) {
                this.f6662e = EnumC1055l.f6726c;
            } else if (m5349b3.equalsIgnoreCase("mainBuilings")) {
                this.f6662e = EnumC1055l.f6727d;
            } else if (m5349b3.equalsIgnoreCase("mainBuildings")) {
                this.f6662e = EnumC1055l.f6727d;
            } else if (m5349b3.equalsIgnoreCase("commandCenter")) {
                this.f6662e = EnumC1055l.f6728e;
            } else if (m5349b3.equalsIgnoreCase("requiredObjectives")) {
                this.f6662e = EnumC1055l.f6730g;
            } else {
                throw new C0179f("unknown win condition:" + m5349b3);
            }
        }
        if (this.f6671n) {
            this.f6663f = this.f6662e;
        }
        this.f6665h = c0172a.m5353a("introText", (C0385az) null);
        if (this.f6665h != null) {
            this.f6665h.m4225a("\\\\n", "\n");
            if (this.f6665h.m4227a()) {
                this.f6665h = null;
            }
        }
        if (!m1087A.m1007ax() && !this.f6671n) {
            this.f6661d = AbstractC0197n.m5017k(3);
            if (this.f6661d != null) {
                this.f6661d.f1312q = 0;
            }
        }
        if (m1087A.m1007ax()) {
        }
        Iterator it = m1087A.f6110bL.f798Q.f946c.iterator();
        while (it.hasNext()) {
            C0172a c0172a2 = (C0172a) it.next();
            if ("team_info".equalsIgnoreCase(c0172a2.f769d)) {
                int parseInt = Integer.parseInt(c0172a2.m5352a("team", "-2"));
                if (parseInt == -2) {
                    throw new RuntimeException("cannot find team for:" + c0172a2.f767b);
                }
                AbstractC0197n m5017k = AbstractC0197n.m5017k(parseInt);
                if (m5017k == null) {
                    Core.m998b("No team loaded for:" + parseInt + " skipping");
                } else {
                    if (c0172a2.m5348c("credits") != null) {
                        m5017k.f1310o = m5348c2.intValue();
                    }
                    if (c0172a2.m5349b("basicAI") != null && m1087A.m1073O() && (m5017k instanceof C0136a)) {
                        Core.m998b("Using basic AI:" + parseInt + " by map request");
                        ((C0136a) m5017k).f585aX = true;
                    }
                    String m5349b4 = c0172a2.m5349b("lockAiDifficulty");
                    if (m5349b4 != null && (m5017k instanceof C0136a)) {
                        Core.m998b("Locking lockAiDifficulty:" + parseInt + " by map request to: " + m5349b4);
                        C0136a c0136a = (C0136a) m5017k;
                        c0136a.f1318w = Integer.parseInt(m5349b4);
                        c0136a.f1319x = true;
                        m1087A.f6122bX.m1557aq();
                    }
                    if (c0172a2.m5349b("disabledAI") != null && m1087A.m1073O() && (m5017k instanceof C0136a)) {
                        Core.m998b("Disabling AI:" + parseInt + " by map request");
                        ((C0136a) m5017k).f584aW = true;
                    }
                    String m5349b5 = c0172a2.m5349b("allyGroup");
                    if (m5349b5 != null && m1087A.m1073O()) {
                        m5017k.f1312q = Integer.parseInt(m5349b5);
                    }
                    String m5349b6 = c0172a2.m5349b("ai");
                    if (m5349b6 != null) {
                        m5017k.f1344T = m5349b6.equalsIgnoreCase("survival");
                    }
                }
            }
            if ("camera_start".equalsIgnoreCase(c0172a2.f767b) && !z) {
                m1087A.m1003b(c0172a2.f770e, c0172a2.f771f);
                this.f6674q = true;
                if (c0172a2.m5348c("zoomTo") != null) {
                    m1087A.f6254cU = m5348c.intValue();
                }
            }
            if ("attack_point".equalsIgnoreCase(c0172a2.f767b)) {
                this.f6687D.add(new PointF(c0172a2.f770e, c0172a2.f771f));
            }
            if ("rotate".equalsIgnoreCase(c0172a2.f769d)) {
                float parseFloat = Float.parseFloat(c0172a2.m5349b("dir"));
                Iterator it2 = AbstractC0244am.f1590bD.iterator();
                while (it2.hasNext()) {
                    AbstractC0244am abstractC0244am = (AbstractC0244am) it2.next();
                    if ((abstractC0244am instanceof AbstractC0623y) && !abstractC0244am.m4758bI() && c0172a2.m5355a(abstractC0244am)) {
                        abstractC0244am.f1618ce = parseFloat;
                    }
                }
            }
            if ("fall".equalsIgnoreCase(c0172a2.f769d)) {
                Iterator it3 = AbstractC0244am.f1590bD.iterator();
                while (it3.hasNext()) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) it3.next();
                    if ((abstractC0244am2 instanceof AbstractC0623y) && !abstractC0244am2.m4758bI() && c0172a2.m5355a(abstractC0244am2)) {
                        abstractC0244am2.m4677da();
                    }
                }
            }
            if ("set_team".equalsIgnoreCase(c0172a2.f769d)) {
                int parseInt2 = Integer.parseInt(c0172a2.m5349b("team"));
                Iterator it4 = AbstractC0244am.f1590bD.iterator();
                while (it4.hasNext()) {
                    AbstractC0244am abstractC0244am3 = (AbstractC0244am) it4.next();
                    if ((abstractC0244am3 instanceof AbstractC0623y) && c0172a2.m5355a(abstractC0244am3)) {
                        abstractC0244am3.m4798P(parseInt2);
                    }
                }
            }
            if ("ai_allow_full_use".equalsIgnoreCase(c0172a2.f769d)) {
                Iterator it5 = AbstractC0244am.f1590bD.iterator();
                while (it5.hasNext()) {
                    AbstractC0244am abstractC0244am4 = (AbstractC0244am) it5.next();
                    if ((abstractC0244am4 instanceof AbstractC0623y) && c0172a2.m5355a(abstractC0244am4)) {
                        ((AbstractC0623y) abstractC0244am4).f1599bL = false;
                    }
                }
            }
            if ("disable_unit_ai".equalsIgnoreCase(c0172a2.f769d)) {
                Iterator it6 = AbstractC0244am.f1590bD.iterator();
                while (it6.hasNext()) {
                    AbstractC0244am abstractC0244am5 = (AbstractC0244am) it6.next();
                    if ((abstractC0244am5 instanceof AbstractC0623y) && c0172a2.m5355a(abstractC0244am5)) {
                        abstractC0244am5.f1600bM = true;
                    }
                }
            }
        }
        Iterator it7 = AbstractC0244am.f1590bD.iterator();
        while (it7.hasNext()) {
            AbstractC0244am abstractC0244am6 = (AbstractC0244am) it7.next();
            if (!abstractC0244am6.mo1756u() && !(abstractC0244am6 instanceof C0243al) && !abstractC0244am6.m4758bI() && abstractC0244am6.f1651cL == null && abstractC0244am6.f1652cM == null) {
                AbstractC0244am abstractC0244am7 = null;
                float f = 4900.0f;
                Iterator it8 = AbstractC0244am.f1590bD.iterator();
                while (it8.hasNext()) {
                    AbstractC0244am abstractC0244am8 = (AbstractC0244am) it8.next();
                    if (abstractC0244am8.m4691cq() && abstractC0244am6 != abstractC0244am8 && (abstractC0244am6.f1609bV == AbstractC0197n.f1371i || abstractC0244am8.f1609bV.m5042d(abstractC0244am6.f1609bV))) {
                        float m2209a = C0758f.m2209a(abstractC0244am8.f6958el, abstractC0244am8.f6959em, abstractC0244am6.f6958el, abstractC0244am6.f6959em);
                        if (m2209a < f && abstractC0244am8.m4680d(abstractC0244am6, true)) {
                            abstractC0244am7 = abstractC0244am8;
                            f = m2209a;
                        }
                    }
                }
                if (abstractC0244am7 != null) {
                    abstractC0244am7.m4662e(abstractC0244am6, true);
                }
            }
        }
        this.f6693J.clear();
        Iterator it9 = m1087A.f6110bL.f798Q.f946c.iterator();
        while (it9.hasNext()) {
            C0172a c0172a3 = (C0172a) it9.next();
            if (!"team_info".equalsIgnoreCase(c0172a3.f769d) && !"point".equalsIgnoreCase(c0172a3.f769d) && !"camera_pan".equalsIgnoreCase(c0172a3.f769d) && !"camera_start".equalsIgnoreCase(c0172a3.f767b) && !"map_info".equalsIgnoreCase(c0172a3.f767b) && !"attack_point".equalsIgnoreCase(c0172a3.f767b) && !"rotate".equalsIgnoreCase(c0172a3.f769d) && !"fall".equalsIgnoreCase(c0172a3.f769d) && !"set_team".equalsIgnoreCase(c0172a3.f769d) && !"ai_allow_full_use".equalsIgnoreCase(c0172a3.f769d) && !"disable_unit_ai".equalsIgnoreCase(c0172a3.f769d) && !"info".equalsIgnoreCase(c0172a3.f769d)) {
                if (c0172a3.f780n == null) {
                    m768c("Error: Skipping trigger:" + c0172a3.f767b + " - no properties found");
                } else {
                    C1030a m790a = C1035c.m790a(this, c0172a3);
                    if (m790a != null) {
                        this.f6693J.add(m790a);
                    }
                }
            }
        }
        Iterator it10 = this.f6693J.iterator();
        while (it10.hasNext()) {
            C1030a c1030a = (C1030a) it10.next();
            String m810b = c1030a.m810b("activateIds");
            if (m810b == null) {
                m810b = c1030a.m810b("alsoActivate");
            }
            if (m810b != null) {
                for (String str : m810b.split(",")) {
                    C1030a m765d = m765d(str);
                    if (m765d == null) {
                        c1030a.m801g("linkedTo target not found: " + m810b);
                        Core.LogDebug2("Possible IDs:");
                        Iterator it11 = this.f6693J.iterator();
                        while (it11.hasNext()) {
                            C1030a c1030a2 = (C1030a) it11.next();
                            if (c1030a2.f6598b != null) {
                                Core.LogDebug2(c1030a2.f6598b);
                            }
                        }
                        Core.LogDebug2("--------");
                    } else {
                        m765d.f6600d.m792a(c1030a);
                    }
                }
            }
            String m810b2 = c1030a.m810b("whenActivatedIds");
            if (m810b2 == null) {
                m810b2 = c1030a.m810b("activatedBy");
            }
            if (m810b2 != null) {
                for (String str2 : m810b2.split(",")) {
                    C1030a m765d2 = m765d(str2);
                    if (m765d2 == null) {
                        c1030a.m801g("linkedFrom target not found: " + str2);
                    } else {
                        c1030a.f6600d.m792a(m765d2);
                    }
                }
            }
            String m810b3 = c1030a.m810b("deactivatedBy");
            if (m810b3 != null) {
                for (String str3 : m810b3.split(",")) {
                    C1030a m765d3 = m765d(str3);
                    if (m765d3 == null) {
                        c1030a.m801g("deactivatedBy: target not found: " + str3);
                    } else {
                        c1030a.f6601e.m792a(m765d3);
                    }
                }
            }
        }
        Core.LogDebug2("Found " + this.f6693J.size() + " map triggers");
        Iterator it12 = this.f6693J.iterator();
        while (it12.hasNext()) {
            C1030a c1030a3 = (C1030a) it12.next();
            int length = c1030a3.f6616t.m5356a().length;
            for (int i = 0; i < length; i++) {
                c1030a3.m801g("Key was not used: " + m5356a[i]);
            }
        }
        m770c();
    }

    /* renamed from: c */
    public void m770c() {
        Iterator it = this.f6693J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6603g == EnumC1037e.f6646a) {
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
                    Core.LogDebug2("Found objective: " + c1056m.m750a());
                }
            }
        }
    }

    /* renamed from: c */
    public static void m768c(String str) {
        Core.m1087A();
        Core.m997b("MissionEngine", str);
        C0831ad.m1493g(str);
    }

    /* renamed from: d */
    public C1030a m765d(String str) {
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
    public C1030a m763e(String str) {
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
    public PointF m761f(String str) {
        C0182i c0182i = Core.m1087A().f6110bL.f798Q;
        if (c0182i != null) {
            Iterator it = c0182i.f946c.iterator();
            while (it.hasNext()) {
                C0172a c0172a = (C0172a) it.next();
                if ("point".equalsIgnoreCase(c0172a.f769d) && c0172a.f768c != null && c0172a.f768c.equalsIgnoreCase(str)) {
                    this.f6694K.m5879a(c0172a.f770e, c0172a.f771f);
                    return this.f6694K;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m785a(float f) {
        Core.m1087A();
    }

    /* renamed from: b */
    public void m773b(float f) {
        C1050g m766d;
        C1052i m767c;
        String m4224b;
        C0747g c0747g;
        Core m1087A = Core.m1087A();
        if (this.f6666i) {
            Iterator it = this.f6693J.iterator();
            while (it.hasNext()) {
                C1030a c1030a = (C1030a) it.next();
                if (c1030a.f6603g == EnumC1037e.f6652g && c1030a.f6606j) {
                    float m812b = c1030a.m812b() - m1087A.f6144cv;
                    float m808c = c1030a.m808c() - m1087A.f6145cw;
                    float f2 = m812b * m1087A.f6256cW;
                    float f3 = m808c * m1087A.f6256cW;
                    float f4 = f2 + c1030a.f6619w;
                    float f5 = f3 + c1030a.f6620x;
                    if (c1030a.f6625C) {
                        C0743c.f4701s[9].m2332a(2, f4, f5, c1030a.f6624B);
                        f5 -= c0747g.f4821c - 2;
                    }
                    if (c1030a.f6622z != null && (m4224b = c1030a.f6622z.m4224b()) != null && !m4224b.equals(VariableScope.nullOrMissingString)) {
                        m1087A.f6113bO.mo181a(m4224b, f4, f5, c1030a.f6624B);
                    }
                }
            }
        }
        if (this.f6668k && !this.f6697N) {
            boolean z = false;
            this.f6685B = C0758f.m2211a(this.f6685B, f);
            if (this.f6685B == 0.0f && this.f6684A != 0.0f) {
                this.f6684A = C0758f.m2211a(this.f6684A, f);
                z = true;
            }
            if (1 != 0) {
                if (z) {
                    int m5888k = (int) (23.0f + (this.f6688E.m5888k() / 2.0f));
                    m1087A.f6113bO.mo181a("- Wave " + this.f6675r + " -", m1087A.f6153cE / 2.0f, m5888k, this.f6688E);
                    if (this.f6676s != null) {
                        m1087A.f6113bO.mo181a(this.f6676s, m1087A.f6153cE / 2.0f, m5888k + this.f6688E.m5888k() + 2.0f, this.f6689F);
                    }
                } else {
                    int m5888k2 = (int) (23.0f + (this.f6690G.m5888k() / 2.0f));
                    String str = "Wave " + (this.f6675r + 1) + " in " + C0758f.m2104f(String.valueOf((int) (this.f6683z / 60.0d)), 3);
                    if (this.f6670m) {
                        str = "Defeat - Wave " + this.f6675r;
                    }
                    m1087A.f6113bO.mo181a(str, m1087A.f6153cE / 2.0f, m5888k2, this.f6690G);
                    if (this.f6677t == null) {
                        if (!this.f6669l) {
                            m767c = m771b(false);
                        } else {
                            m767c = m767c(false);
                        }
                        this.f6677t = m767c.toString();
                    }
                    m1087A.f6113bO.mo181a(this.f6677t, m1087A.f6153cE / 2.0f, m5888k2 + this.f6690G.m5888k() + 2.0f, this.f6691H);
                }
            }
        }
        if (this.f6668k && this.f6697N && (m766d = m766d()) != null) {
            int i = m766d.f6708e - (m1087A.f6102by / 1000);
            int m5888k3 = (int) (23.0f + (this.f6690G.m5888k() / 2.0f));
            String str2 = "Wave " + (this.f6675r + 1) + " in " + C0758f.m2104f(String.valueOf(i), 3);
            if (this.f6670m) {
                str2 = "Defeat - Wave " + this.f6675r;
            }
            m1087A.f6113bO.mo181a(str2, m1087A.f6153cE / 2.0f, m5888k3, this.f6690G);
            String str3 = m766d.f6709f;
            if (str3 != null) {
                m1087A.f6113bO.mo181a(str3, m1087A.f6153cE / 2.0f, m5888k3 + this.f6690G.m5888k() + 2.0f, this.f6691H);
            }
        }
    }

    /* renamed from: g */
    public void m759g(String str) {
        String[] split;
        Core.LogDebug2("Loading survival waves");
        this.f6697N = true;
        int i = 0;
        int i2 = 0;
        for (String str2 : str.split("\n")) {
            i2++;
            C1050g c1050g = new C1050g(this);
            if (c1050g.m754a(str2)) {
                c1050g.f6708e = i + ((int) c1050g.f6707d);
                i = c1050g.f6708e;
                Core.LogDebug2("Adding wave " + i2 + " at " + c1050g.f6708e);
                this.f6698O.add(c1050g);
            }
        }
    }

    /* renamed from: d */
    public C1050g m766d() {
        if (this.f6675r < this.f6698O.size()) {
            return (C1050g) this.f6698O.get(this.f6675r);
        }
        return null;
    }

    /* renamed from: e */
    public void m764e() {
        this.f6701R = true;
        this.f6699P.m5878a((PointF) this.f6687D.get(C0758f.m2201a(0, this.f6687D.size() - 1, this.f6675r)));
    }

    /* renamed from: f */
    public void m762f() {
        this.f6702S.clear();
        m776a(this.f6702S, "scout", 0.7f);
        m777a(this.f6702S, EnumC0249ar.f1743i, 2.1f);
        m776a(this.f6702S, "mechGun", 1.0f);
        m776a(this.f6702S, "lightGunship", 2.8f);
        m777a(this.f6702S, EnumC0249ar.f1744j, 1.9f);
        m777a(this.f6702S, EnumC0249ar.f1746l, 0.8f);
        m777a(this.f6702S, EnumC0249ar.f1757w, 1.0f);
        m777a(this.f6702S, EnumC0249ar.f1758x, 0.8f);
        m777a(this.f6702S, EnumC0249ar.f1748n, 0.7f);
        m776a(this.f6702S, "plasmaTank", 0.6f);
        m776a(this.f6702S, "missileAirship", 0.4f);
        this.f6703T.clear();
        m777a(this.f6703T, EnumC0249ar.f1766F, 1.0f);
        m777a(this.f6703T, EnumC0249ar.f1775O, 0.5f);
    }

    /* renamed from: a */
    public void m776a(ArrayList arrayList, String str, float f) {
        m777a(arrayList, C0453l.m3663s(str), f);
    }

    /* renamed from: a */
    public void m777a(ArrayList arrayList, InterfaceC0303as interfaceC0303as, float f) {
        if (interfaceC0303as == null) {
            interfaceC0303as = EnumC0249ar.f1743i;
        }
        InterfaceC0303as m3698c = C0453l.m3698c(interfaceC0303as);
        if (m3698c != null) {
            interfaceC0303as = m3698c;
        }
        C1054k c1054k = new C1054k(this);
        c1054k.f6721a = interfaceC0303as;
        c1054k.f6722b = f;
        arrayList.add(c1054k);
    }

    /* renamed from: a */
    public void m780a(C1052i c1052i, int i, float f) {
        if (i < 0) {
            i = 0;
        }
        int size = this.f6702S.size();
        if (size == 0) {
            Core.m998b("error maxTypeNum: " + size);
            return;
        }
        C1054k c1054k = (C1054k) this.f6702S.get(i % size);
        int m2116e = (int) C0758f.m2116e((int) ((i + 3) * 0.5d * c1054k.f6722b * f), 0.8f);
        if (m2116e < 1) {
            m2116e = 1;
        }
        c1052i.m751b(c1054k.f6721a, m2116e);
    }

    /* renamed from: b */
    public C1052i m771b(boolean z) {
        C1052i c1052i = new C1052i(this);
        boolean z2 = false;
        if (this.f6678u > 50 && (this.f6678u + 1) % 100 == 0) {
            int size = this.f6703T.size();
            int i = this.f6678u / 100;
            if (size == 0) {
                Core.m998b("error maxTypeNum: " + size);
            } else {
                C1054k c1054k = (C1054k) this.f6703T.get(i % size);
                int i2 = (int) (i * c1054k.f6722b);
                if (i2 < 1) {
                    i2 = 1;
                }
                c1052i.m751b(c1054k.f6721a, i2);
            }
            z2 = true;
        }
        int i3 = 0;
        if (this.f6682y > 0) {
            i3 = this.f6682y;
        }
        m780a(c1052i, this.f6678u + i3, 1.0f);
        if (this.f6678u > 15 && !z2) {
            m780a(c1052i, ((int) ((this.f6678u + i3) * 1.1f)) - 11, 0.5f);
        }
        if (z) {
            this.f6678u++;
            this.f6679v++;
        }
        return c1052i;
    }

    /* renamed from: c */
    public C1052i m767c(boolean z) {
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
        c1052i.m752a(enumC0249ar, i);
        return c1052i;
    }

    /* renamed from: c */
    public void m769c(float f) {
        C1052i m767c;
        Core m1087A = Core.m1087A();
        int i = m1087A.f6102by;
        this.f6696M = C0758f.m2211a(this.f6696M, f);
        if (m1087A.f6081aq && m1087A.f6243bH) {
            C0172a c0172a = null;
            if (m1087A.f6110bL.f798Q != null) {
                Iterator it = m1087A.f6110bL.f798Q.f946c.iterator();
                while (it.hasNext()) {
                    C0172a c0172a2 = (C0172a) it.next();
                    if ("camera_pan".equalsIgnoreCase(c0172a2.f769d) && this.f6695L == Integer.parseInt(c0172a2.m5352a("index", "-1"))) {
                        c0172a = c0172a2;
                    }
                }
            }
            if (c0172a == null) {
                this.f6695L = 0;
            } else {
                float f2 = c0172a.f770e;
                float f3 = c0172a.f771f;
                if (f2 < m1087A.f6156cH + 2.0f) {
                    f2 = m1087A.f6156cH + 2.0f;
                }
                if (f3 < m1087A.f6157cI + 2.0f) {
                    f3 = m1087A.f6157cI + 2.0f;
                }
                if (f2 > (m1087A.f6110bL.m5281i() - m1087A.f6156cH) - 2.0f) {
                    f2 = (m1087A.f6110bL.m5281i() - m1087A.f6156cH) - 2.0f;
                }
                if (f3 > (m1087A.f6110bL.m5280j() - m1087A.f6157cI) - 2.0f) {
                    f3 = (m1087A.f6110bL.m5280j() - m1087A.f6157cI) - 2.0f;
                }
                float m2123d = C0758f.m2123d(m1087A.f6146cx + m1087A.f6156cH, m1087A.f6147cy + m1087A.f6157cI, f2, f3);
                float m2209a = C0758f.m2209a(m1087A.f6146cx + m1087A.f6156cH, m1087A.f6147cy + m1087A.f6157cI, f2, f3);
                if (this.f6696M == 0.0f && (m2209a < 225.0f || m1087A.f6141cs)) {
                    this.f6695L++;
                    this.f6696M = 50.0f;
                }
                float f4 = 0.45f * f;
                m1087A.f6146cx += C0758f.m2092i(m2123d) * f4;
                m1087A.f6147cy += C0758f.m2097h(m2123d) * f4;
                m1087A.m1060a(m1087A.f6146cx, m1087A.f6147cy);
                m1087A.m1072P();
            }
        }
        if (this.f6668k) {
            if (!this.f6697N) {
                if (!this.f6670m) {
                    this.f6683z = C0758f.m2211a(this.f6683z, f);
                }
                if (this.f6683z == 0.0f && !this.f6670m) {
                    this.f6675r++;
                    this.f6684A = 180.0f;
                    PointF pointF = (PointF) this.f6687D.get(C0758f.m2201a(0, this.f6687D.size() - 1, this.f6675r));
                    if (!this.f6669l) {
                        this.f6676s = m771b(false).toString();
                        m767c = m771b(true);
                    } else {
                        this.f6676s = m767c(false).toString();
                        m767c = m767c(true);
                    }
                    this.f6683z = 1800.0f;
                    if (!this.f6669l) {
                        if (this.f6682y > 0) {
                            this.f6683z -= (this.f6682y * 3) * 60;
                        } else {
                            this.f6683z -= (this.f6682y * 9) * 60;
                        }
                    }
                    m767c.m753a(pointF.f227a, pointF.f228b);
                    this.f6677t = null;
                }
            } else if (!this.f6670m) {
                C1050g m766d = m766d();
                if (m766d != null) {
                    if (m766d.f6708e * 1000 < m1087A.f6102by) {
                        m766d.m755a();
                        this.f6675r++;
                    }
                } else if (!m1087A.f6267dp && !m1087A.f6126cb.m2464h()) {
                    m1087A.f6117bS.m1916F();
                }
            }
        }
        if (this.f6667j) {
            this.f6667j = false;
            if (this.f6665h != null) {
                m1087A.m1044a("Briefing", this.f6665h);
            }
        }
        if (i > this.f6659b + 250) {
            this.f6659b = i;
            m784a(i);
        }
        if (i > this.f6660c + 1000) {
            this.f6660c = i;
            if (m758h()) {
                m758h();
                m758h();
            }
            boolean z = false;
            boolean z2 = false;
            if (m1087A.f6099bs != null) {
                if (m1087A.f6099bs.m5020j()) {
                    z = true;
                }
                if (m1087A.f6099bs.m5074b()) {
                    z2 = true;
                }
            }
            if (!m1087A.f6267dp && !m1087A.f6270ds && !m1087A.f6126cb.m2464h() && !z && !z2) {
                boolean z3 = true;
                boolean z4 = true;
                if (this.f6662e == EnumC1055l.f6724a) {
                    z3 = false;
                } else if (this.f6662e == EnumC1055l.f6730g) {
                    Iterator it2 = this.f6664g.iterator();
                    while (it2.hasNext()) {
                        if (!((C1056m) it2.next()).m749b()) {
                            z3 = false;
                        }
                    }
                } else if (m1087A.f6099bs != null) {
                    Iterator it3 = AbstractC0244am.f1590bD.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        AbstractC0244am abstractC0244am = (AbstractC0244am) it3.next();
                        if (m1087A.f6099bs.m5054c(abstractC0244am.f1609bV) && m779a(this.f6662e, abstractC0244am)) {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (this.f6663f == EnumC1055l.f6724a) {
                    z4 = false;
                } else if (this.f6663f == EnumC1055l.f6730g) {
                    z4 = false;
                } else if (m1087A.f6099bs != null) {
                    Iterator it4 = AbstractC0244am.f1590bD.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        AbstractC0244am abstractC0244am2 = (AbstractC0244am) it4.next();
                        if (m1087A.f6099bs.m5042d(abstractC0244am2.f1609bV) && m779a(this.f6663f, abstractC0244am2)) {
                            z4 = false;
                            break;
                        }
                    }
                }
                if (z4 && !z3) {
                    m1087A.f6117bS.m1915G();
                }
                if (z3) {
                    m1087A.f6117bS.m1916F();
                    if (m1087A.f6102by > 1500) {
                        m1087A.settingEngine.numberOfWins++;
                        m1087A.settingEngine.save();
                    }
                }
            }
            if (this.f6668k && !this.f6670m) {
                boolean z5 = true;
                Iterator it5 = AbstractC0244am.f1590bD.iterator();
                while (it5.hasNext()) {
                    AbstractC0244am abstractC0244am3 = (AbstractC0244am) it5.next();
                    if ((abstractC0244am3 instanceof C0489e) || abstractC0244am3.f1602bO) {
                        if (!abstractC0244am3.f1607bT && !abstractC0244am3.mo1756u() && abstractC0244am3.f1609bV == m1087A.f6099bs) {
                            z5 = false;
                        }
                    }
                }
                if (z5) {
                    this.f6670m = true;
                    m1087A.f6117bS.m1915G();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m779a(EnumC1055l enumC1055l, AbstractC0244am abstractC0244am) {
        if (!(abstractC0244am instanceof AbstractC0623y) || abstractC0244am.f1607bT || abstractC0244am.m4715cS() || enumC1055l == EnumC1055l.f6724a) {
            return false;
        }
        if (enumC1055l == EnumC1055l.f6725b) {
            return true;
        }
        if (enumC1055l == EnumC1055l.f6726c) {
            return abstractC0244am.m4758bI();
        }
        if (enumC1055l == EnumC1055l.f6728e) {
            return (abstractC0244am instanceof C0489e) || abstractC0244am.f1602bO;
        } else if (enumC1055l == EnumC1055l.f6727d) {
            return abstractC0244am.m4758bI() && abstractC0244am.m4757bJ() && !(abstractC0244am instanceof C0473b) && !(abstractC0244am instanceof C0492g);
        } else if (enumC1055l == EnumC1055l.f6729f) {
            if (abstractC0244am.m4757bJ() || abstractC0244am.m4769ak()) {
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
    public void m757h(String str) {
        Core.LogDebug2("Map Script: " + str);
    }

    /* renamed from: a */
    public void m781a(C1030a c1030a) {
        if (m760g()) {
            m757h("Activiated trigger:" + c1030a.f6597a + " (id:" + c1030a.f6598b + ")");
        }
    }

    /* renamed from: g */
    public boolean m760g() {
        return f6658a && Core.m1087A().f6231bl;
    }

    /* renamed from: i */
    public static void m756i(String str) {
        C0831ad.m1493g("Map ScriptError: " + str);
    }

    /* renamed from: a */
    public void m784a(int i) {
        Iterator it = this.f6693J.iterator();
        while (it.hasNext()) {
            C1030a c1030a = (C1030a) it.next();
            if (c1030a.f6606j && c1030a.f6613q != -1 && i >= c1030a.f6607k + c1030a.f6613q) {
                c1030a.f6606j = false;
                c1030a.f6617u = false;
            }
            if (!c1030a.f6606j && !c1030a.f6617u && c1030a.m805d()) {
                c1030a.f6617u = true;
            }
            if ((c1030a.f6606j || c1030a.f6617u) && c1030a.f6601e.m791b()) {
                c1030a.f6606j = false;
                c1030a.f6617u = false;
                c1030a.f6609m = true;
            }
            if (c1030a.f6606j && c1030a.f6612p > 0 && i >= c1030a.f6607k + c1030a.f6612p) {
                c1030a.f6617u = true;
            }
            if (c1030a.f6617u) {
                c1030a.f6617u = false;
                try {
                    C1036d.m789a(this, c1030a);
                } catch (C0179f e) {
                    e.printStackTrace();
                    c1030a.m801g("Error activating trigger: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: h */
    public boolean m758h() {
        boolean z;
        boolean z2 = false;
        Core m1087A = Core.m1087A();
        AbstractC0244am[] m498a = AbstractC0244am.f1590bD.m498a();
        int size = AbstractC0244am.f1590bD.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m498a[i];
            if (abstractC0244am.f1609bV == AbstractC0197n.f1371i && (abstractC0244am instanceof AbstractC0623y) && abstractC0244am.m4751bS() && !abstractC0244am.mo3350o()) {
                int i2 = 0;
                int size2 = AbstractC0244am.f1590bD.size();
                while (true) {
                    if (i2 < size2) {
                        AbstractC0244am abstractC0244am2 = m498a[i2];
                        if (!m1087A.m1007ax()) {
                            z = abstractC0244am2.f1609bV == m1087A.f6099bs;
                        } else {
                            z = !abstractC0244am2.f1609bV.f1317v;
                            if (abstractC0244am.m4720cN()) {
                                z = true;
                            }
                        }
                        if (abstractC0244am2.f1609bV != null && abstractC0244am2.f1609bV.f1306k < 0) {
                            z = false;
                        }
                        if (!z || abstractC0244am2.f1609bV == abstractC0244am.f1609bV || !(abstractC0244am2 instanceof AbstractC0623y) || abstractC0244am2.mo3038i() || !abstractC0244am2.m4751bS() || C0758f.m2209a(abstractC0244am2.f6958el, abstractC0244am2.f6959em, abstractC0244am.f6958el, abstractC0244am.f6959em) >= 28900.0f) {
                            i2++;
                        } else {
                            abstractC0244am.m4663e(abstractC0244am2.f1609bV);
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
