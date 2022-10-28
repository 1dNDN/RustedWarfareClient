package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;

/* renamed from: com.corrodinggames.rts.gameFramework.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ac.class */
public class C0638ac {

    /* renamed from: a */
    public static AbstractC0645aj f4082a = new C0647al();

    /* renamed from: b */
    public static C0644ai f4083b = new C0644ai();

    /* renamed from: c */
    public C0639ad f4084c;

    /* renamed from: d */
    public C0639ad f4085d;

    /* renamed from: e */
    public C0639ad f4086e;

    /* renamed from: f */
    public C0639ad f4087f;

    /* renamed from: g */
    public C0639ad f4088g;

    /* renamed from: h */
    public C0639ad f4089h;

    /* renamed from: i */
    public C0639ad f4090i;

    /* renamed from: j */
    public C0639ad f4091j;

    /* renamed from: k */
    public C0639ad f4092k;

    /* renamed from: l */
    public C0639ad f4093l = m2744a("Debug Left");

    /* renamed from: m */
    public C0639ad f4094m = m2744a("Debug Right");

    /* renamed from: n */
    public C0639ad f4095n = m2741b("Camera Up");

    /* renamed from: o */
    public C0639ad f4096o = m2741b("Camera Down");

    /* renamed from: p */
    public C0639ad f4097p = m2741b("Camera Left");

    /* renamed from: q */
    public C0639ad f4098q = m2741b("Camera Right");

    /* renamed from: r */
    public C0639ad f4099r = m2741b("Zoom In");

    /* renamed from: s */
    public C0639ad f4100s = m2741b("Zoom Out");

    /* renamed from: t */
    public C0639ad f4101t = m2741b("Send Chat");

    /* renamed from: u */
    public C0639ad f4102u = m2741b("Send Team Chat");

    /* renamed from: v */
    public C0639ad f4103v = m2741b("Ping Map");

    /* renamed from: w */
    public C0639ad f4104w = m2741b("Show Menu");

    /* renamed from: x */
    public C0639ad f4105x = m2741b("Save Game");

    /* renamed from: y */
    public C0639ad f4106y = m2741b("Deselect units");

    /* renamed from: z */
    public C0639ad f4107z = m2741b("Go to notification");

    /* renamed from: A */
    public C0639ad f4108A = m2741b("Select Whole Army");

    /* renamed from: B */
    public C0639ad f4109B = m2741b("Select Command Center");

    /* renamed from: C */
    public C0639ad f4110C = m2741b("Cycle Builders");

    /* renamed from: D */
    public C0639ad f4111D = m2741b("Cycle Extractors");

    /* renamed from: E */
    public C0639ad f4112E = m2741b("Cycle Upgradable Fabricators");

    /* renamed from: F */
    public C0639ad f4113F = m2741b("Cycle Land Factories");

    /* renamed from: G */
    public C0639ad f4114G = m2741b("Cycle Air Factories");

    /* renamed from: H */
    public C0639ad f4115H = m2741b("Next Music Track");

    /* renamed from: I */
    public C0640ae f4116I = m2740c("Game Speed (Single player)");

    /* renamed from: J */
    public C0639ad f4117J = m2741b("Slower");

    /* renamed from: K */
    public C0639ad f4118K = m2741b("Faster");

    /* renamed from: L */
    public C0639ad f4119L = m2741b("Pause Game");

    /* renamed from: M */
    public C0640ae f4120M = m2740c("Unit Actions");

    /* renamed from: N */
    public C0639ad f4121N = m2741b("Attack Move");

    /* renamed from: O */
    public C0639ad f4122O = m2741b("Stop");

    /* renamed from: P */
    public C0639ad f4123P = m2741b("Guard Unit");

    /* renamed from: Q */
    public C0639ad f4124Q = m2741b("Patrol");

    /* renamed from: R */
    public C0639ad f4125R = m2741b("Reclaim");

    /* renamed from: S */
    public C0639ad f4126S = m2741b("Action - Upgrade");

    /* renamed from: T */
    public C0639ad f4127T = m2741b("Action - Set Rally");

    /* renamed from: U */
    public C0639ad f4128U = m2744a("Debug Editor");

    /* renamed from: V */
    public C0639ad f4129V = m2744a("Debug Pause");

    /* renamed from: W */
    public C0639ad f4130W = m2744a("Debug Slow");

    /* renamed from: X */
    public C0639ad f4131X = m2744a("Debug HideInterface");

    /* renamed from: Y */
    public C0639ad f4132Y = m2744a("Debug HideInterface Temp");

    /* renamed from: Z */
    public C0639ad f4133Z = m2744a("Debug InvincibleUnits");

    /* renamed from: aa */
    public C0639ad f4134aa = m2744a("debugPrintSelectedUnit");

    /* renamed from: ab */
    public C0639ad f4135ab = m2744a("debugDevModeSwitch");

    /* renamed from: ac */
    public C0639ad f4136ac = m2744a("debugAIViewSwitch");

    /* renamed from: ad */
    public C0639ad f4137ad = m2744a("debugMapSwitch");

    /* renamed from: ae */
    public C0639ad f4138ae = m2744a("Debug Take Screenshot");

    /* renamed from: af */
    public C0639ad f4139af = m2744a("Debug Take Screenshot High");

    /* renamed from: ag */
    public C0639ad[] f4140ag;

    /* renamed from: ah */
    public C0640ae f4141ah;

    /* renamed from: ai */
    public C0639ad[] f4142ai;

    /* renamed from: aj */
    public C0639ad[] f4143aj;

    /* renamed from: ak */
    public C0639ad[] f4144ak;

    /* renamed from: al */
    public ArrayList f4145al;

    /* renamed from: am */
    Properties f4146am;

    /* renamed from: an */
    int f4147an;

    /* renamed from: ao */
    int f4148ao;

    public C0638ac() {
        this.f4095n.m2734a("UP").m2734a("NUMPAD8");
        this.f4096o.m2734a("DOWN").m2734a("NUMPAD2");
        this.f4097p.m2734a("LEFT").m2734a("NUMPAD4");
        this.f4098q.m2734a("RIGHT").m2734a("NUMPAD6");
        this.f4093l.m2734a("F5");
        this.f4094m.m2734a("F6");
        this.f4105x.m2734a("CTRL+S");
        this.f4101t.m2734a("ENTER").m2734a("T");
        this.f4102u.m2734a("SHIFT+ENTER").m2734a("Y");
        this.f4103v.m2734a("CTRL+M").m2734a("CTRL+P");
        this.f4104w.m2734a("ESCAPE").m2734a("F10");
        this.f4106y.m2734a("SPACE");
        this.f4107z.m2734a("CTRL+SPACE");
        this.f4108A.m2734a("CTRL+A");
        this.f4110C.m2734a("CTRL+B");
        this.f4111D.m2734a("CTRL+E");
        this.f4112E.m2734a("CTRL+F");
        this.f4113F.m2734a("CTRL+L");
        this.f4114G.m2734a("CTRL+K");
        this.f4109B.m2734a("CTRL+C");
        this.f4115H.m2734a("CTRL+N");
        this.f4121N.m2734a("A");
        this.f4119L.m2734a("BREAK");
        this.f4123P.m2734a("G");
        this.f4124Q.m2734a("P");
        this.f4126S.m2734a("U");
        this.f4127T.m2734a("R");
        this.f4128U.m2734a("CTRL+SHIFT+E");
        this.f4129V.m2734a("CTRL+SHIFT+P");
        this.f4130W.m2734a("CTRL+SHIFT+S");
        this.f4131X.m2734a("CTRL+SHIFT+H");
        this.f4132Y.m2734a("CTRL+H");
        this.f4133Z.m2734a("CTRL+SHIFT+I");
        this.f4134aa.m2734a("CTRL+SHIFT+L");
        this.f4135ab.m2734a("CTRL+SHIFT+D");
        this.f4136ac.m2734a("SHIFT+F3");
        this.f4137ad.m2734a("SHIFT+F4");
        this.f4138ae.m2734a("CTRL+SHIFT+ALT+S");
        this.f4139af.m2734a("CTRL+SHIFT+ALT+D");
        this.f4117J.m2734a("minus").m2734a("NUMPADSUBTRACT");
        this.f4118K.m2734a("equals").m2734a("NUMPADADD");
        int[] iArr = {54, 52, 31, 50, 30, 42, 41, 38, 39, 40, 37, 43};
        this.f4140ag = new C0639ad[10];
        for (int i = 0; i < this.f4140ag.length; i++) {
            this.f4140ag[i] = m2741b("unit action " + (i + 1));
            this.f4140ag[i].m2728c(iArr[i]);
        }
        this.f4141ah = m2740c("Unit Groups");
        this.f4144ak = new C0639ad[10];
        int i2 = 0;
        while (i2 < this.f4144ak.length) {
            this.f4144ak[i2] = m2741b("create group " + (i2 + 1));
            this.f4144ak[i2].m2736a(m2747a(i2 == 9 ? 0 : i2 + 1), 0, 1, false);
            i2++;
        }
        this.f4142ai = new C0639ad[10];
        int i3 = 0;
        while (i3 < this.f4142ai.length) {
            this.f4142ai[i3] = m2741b("select group " + (i3 + 1));
            this.f4142ai[i3].m2728c(m2747a(i3 == 9 ? 0 : i3 + 1));
            i3++;
        }
        this.f4143aj = new C0639ad[10];
        int i4 = 0;
        while (i4 < this.f4143aj.length) {
            this.f4143aj[i4] = m2741b("Add group to selection " + (i4 + 1));
            this.f4143aj[i4].m2736a(m2747a(i4 == 9 ? 0 : i4 + 1), 0, 2, false);
            i4++;
        }
        this.f4146am = new Properties();
        this.f4147an = 0;
        this.f4148ao = 0;
    }

    /* renamed from: a */
    public int m2747a(int i) {
        if (i >= 10) {
            throw new RuntimeException("number:" + i + " too high");
        }
        if (i == 0) {
            return 7;
        }
        return 8 + (i - 1);
    }

    /* renamed from: a */
    public C0639ad m2744a(String str) {
        if (this.f4145al == null) {
            this.f4145al = new ArrayList();
        }
        C0639ad c0639ad = new C0639ad();
        c0639ad.f4149a = str;
        c0639ad.f4150b = false;
        this.f4145al.add(c0639ad);
        return c0639ad;
    }

    /* renamed from: b */
    public C0639ad m2741b(String str) {
        if (this.f4145al == null) {
            this.f4145al = new ArrayList();
        }
        C0639ad c0639ad = new C0639ad();
        c0639ad.f4149a = str;
        c0639ad.f4150b = true;
        this.f4145al.add(c0639ad);
        return c0639ad;
    }

    /* renamed from: c */
    public C0640ae m2740c(String str) {
        if (this.f4145al == null) {
            this.f4145al = new ArrayList();
        }
        C0640ae c0640ae = new C0640ae();
        c0640ae.f4149a = str;
        c0640ae.f4150b = true;
        this.f4145al.add(c0640ae);
        return c0640ae;
    }

    /* renamed from: a */
    public void m2743a(String str, String str2) {
        String trim = str.toLowerCase(Locale.ENGLISH).trim();
        C0639ad c0639ad = null;
        Iterator it = this.f4145al.iterator();
        while (it.hasNext()) {
            C0639ad c0639ad2 = (C0639ad) it.next();
            if (c0639ad2.f4149a != null && c0639ad2.m2727e().equals(trim)) {
                c0639ad = c0639ad2;
            }
        }
        if (c0639ad == null) {
            Core.m998b("loadKey: could not find:" + trim);
            return;
        }
        String[] split = str2.split(",");
        for (int i = 0; i <= 1 && i < split.length; i++) {
            String str3 = split[i];
            if (!str3.equalsIgnoreCase("DEFAULT")) {
                c0639ad.m2733a(str3, i);
                if (c0639ad.f4151c.size() > i && c0639ad.f4151c.get(i) != null) {
                    ((AbstractC0641af) c0639ad.f4151c.get(i)).f4156d = true;
                } else {
                    Core.m973g("out of range");
                }
            }
        }
    }

    /* renamed from: a */
    public String m2746a(C0639ad c0639ad) {
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = c0639ad.f4151c.iterator();
        while (it.hasNext()) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) it.next();
            if (z) {
                z = false;
            } else {
                str = str + ",";
            }
            if (abstractC0641af.f4156d) {
                if (abstractC0641af.mo2719d()) {
                    str = str + "CLEARED";
                } else {
                    str = str + abstractC0641af.mo2720c();
                }
            } else {
                str = str + "DEFAULT";
            }
        }
        return str;
    }

    /* renamed from: a */
    public boolean m2745a(C0639ad c0639ad, int i) {
        Core m1087A = Core.m1087A();
        AbstractC0641af m2737a = c0639ad.m2737a(i);
        if (m2737a == null) {
            return false;
        }
        ArrayList arrayList = m1087A.f6118bT.f4145al;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C0639ad c0639ad2 = (C0639ad) arrayList.get(i2);
            if (c0639ad2 != c0639ad) {
                Iterator it = c0639ad2.f4151c.iterator();
                while (it.hasNext()) {
                    if (m2737a.mo2722a((AbstractC0641af) it.next())) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m2748a() {
        this.f4084c = m2744a("shoot");
        this.f4085d = m2744a("move up");
        this.f4086e = m2744a("move down");
        this.f4087f = m2744a("move left");
        this.f4088g = m2744a("move right");
        this.f4089h = m2744a("aim up");
        this.f4090i = m2744a("aim down");
        this.f4091j = m2744a("aim left");
        this.f4092k = m2744a("aim right");
        this.f4084c.m2735a(0, "enter", -1);
        this.f4084c.m2735a(0, "space", -1);
        this.f4085d.m2735a(0, "w", -1);
        this.f4086e.m2735a(0, "s", -1);
        this.f4087f.m2735a(0, "a", -1);
        this.f4088g.m2735a(0, "d", -1);
        this.f4089h.m2735a(0, "UP", -1);
        this.f4090i.m2735a(0, "DOWN", -1);
        this.f4091j.m2735a(0, "LEFT", -1);
        this.f4092k.m2735a(0, "RIGHT", -1);
        Core.LogDebug2("getControllerCount:" + f4083b.mo19a());
        this.f4085d.m2730b(0, 1, 0, true);
        this.f4086e.m2730b(0, 1, 0, false);
        this.f4087f.m2730b(0, 1, 1, true);
        this.f4088g.m2730b(0, 1, 1, false);
        this.f4089h.m2730b(0, 1, 2, true);
        this.f4090i.m2730b(0, 1, 2, false);
        this.f4091j.m2730b(0, 1, 3, true);
        this.f4092k.m2730b(0, 1, 3, false);
        this.f4084c.m2730b(0, 1, 4, true);
    }

    /* renamed from: b */
    public void m2742b() {
        if (f4083b.mo19a() != this.f4148ao) {
            this.f4148ao = f4083b.mo19a();
            Core.LogDebug2("Number of controllers changed, now:" + this.f4148ao);
        }
    }

    /* renamed from: d */
    public static int m2739d(String str) {
        if (str.equalsIgnoreCase("CLEARED")) {
            return 0;
        }
        return SlickToAndroidKeycodes.m737a(str);
    }
}
