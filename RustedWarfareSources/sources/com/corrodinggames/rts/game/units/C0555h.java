package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.C0207b;
import com.corrodinggames.rts.game.units.p013a.C0213h;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p024d.C0507q;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.game.units.p026e.AbstractC0529j;
import com.corrodinggames.rts.game.units.p026e.C0519b;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.LoggerMaybe;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0765c;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0767e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0841ae;
import com.corrodinggames.rts.gameFramework.p041i.Reader;
import com.corrodinggames.rts.gameFramework.p041i.StreamWriter;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h.class */
public class C0555h extends AbstractC0529j implements InterfaceC0469d {

    /* renamed from: a */
    PointF[] f3762a;

    /* renamed from: b */
    PointF[] f3763b;

    /* renamed from: c */
    boolean f3764c;

    /* renamed from: d */
    static Paint f3765d;

    /* renamed from: e */
    static Paint f3766e;

    /* renamed from: f */
    static Paint f3767f;

    /* renamed from: g */
    static C0934e f3768g;

    /* renamed from: r */
    String f3769r;

    /* renamed from: C */
    static ArrayList f3770C;

    /* renamed from: D */
    C0824b f3771D;

    /* renamed from: E */
    EnumC0603o f3772E;

    /* renamed from: F */
    EnumC0596n f3773F;

    /* renamed from: G */
    String f3774G;

    /* renamed from: H */
    boolean f3775H;

    /* renamed from: I */
    String f3776I;

    /* renamed from: h */
    static AbstractC0224s f3777h = new AbstractC0224s("reloadUnits") { // from class: com.corrodinggames.rts.game.units.h.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            if (C0555h.m3168w()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Reload all unit data from disk (for modding)";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Reload units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3070c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3071b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: d_ */
        public AbstractC0249ar mo5979i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e */
        public EnumC0226u mo3069e() {
            return EnumC0226u.f1475a;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3067f() {
            return EnumC0225t.f1470f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3066g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: h */
        public boolean mo3065h() {
            return true;
        }
    };

    /* renamed from: i */
    static AbstractC0224s f3778i = new AbstractC0224s("reloadOnlyActiveUnits") { // from class: com.corrodinggames.rts.game.units.h.12
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            if (C0555h.m3168w()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Reload data only for active units on map (for modding). This is a faster than reload but will be incomplete.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Quick reload";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3070c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3071b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: k */
        public AbstractC0249ar mo5979i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e */
        public EnumC0226u mo3069e() {
            return EnumC0226u.f1475a;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3067f() {
            return EnumC0225t.f1470f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3066g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: h */
        public boolean mo3065h() {
            return true;
        }
    };

    /* renamed from: j */
    static AbstractC0224s f3779j = new AbstractC0224s("unitClone") { // from class: com.corrodinggames.rts.game.units.h.16
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Clones units at point x50";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Unit Clone";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3070c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3071b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: k */
        public AbstractC0249ar mo5979i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e */
        public EnumC0226u mo3069e() {
            return EnumC0226u.f1481g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3067f() {
            return EnumC0225t.f1470f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3066g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: h */
        public boolean mo3065h() {
            return true;
        }
    };

    /* renamed from: k */
    static AbstractC0224s f3780k = new AbstractC0224s("removeUnits") { // from class: com.corrodinggames.rts.game.units.h.17
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Delete all units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Delete units at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e_ */
        public boolean mo3068e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3070c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3071b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f_ */
        public AbstractC0249ar mo5979i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e */
        public EnumC0226u mo3069e() {
            return EnumC0226u.f1481g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3067f() {
            return EnumC0225t.f1470f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3066g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: h */
        public boolean mo3065h() {
            return true;
        }
    };

    /* renamed from: l */
    static AbstractC0224s f3781l = new AbstractC0224s("killUnits") { // from class: com.corrodinggames.rts.game.units.h.18
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Kill units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Kill units at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e_ */
        public boolean mo3068e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3070c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3071b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g_ */
        public AbstractC0249ar mo5979i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e */
        public EnumC0226u mo3069e() {
            return EnumC0226u.f1481g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3067f() {
            return EnumC0225t.f1470f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3066g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: h */
        public boolean mo3065h() {
            return true;
        }
    };

    /* renamed from: m */
    static AbstractC0224s f3782m = new AbstractC0224s("finishQueue") { // from class: com.corrodinggames.rts.game.units.h.19
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Finish all unit queues at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Finish queue at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e_ */
        public boolean mo3068e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3070c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3071b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: h_ */
        public AbstractC0249ar mo5979i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e */
        public EnumC0226u mo3069e() {
            return EnumC0226u.f1481g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3067f() {
            return EnumC0225t.f1470f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3066g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: h */
        public boolean mo3065h() {
            return true;
        }
    };

    /* renamed from: n */
    static AbstractC0224s f3783n = new AbstractC0224s("nukeAt") { // from class: com.corrodinggames.rts.game.units.h.20
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Create a nuke at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Nuke at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e_ */
        public boolean mo3068e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public int mo3070c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3071b(AbstractC0244am abstractC0244am, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: i_ */
        public AbstractC0249ar mo5979i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: e */
        public EnumC0226u mo3069e() {
            return EnumC0226u.f1481g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: f */
        public EnumC0225t mo3067f() {
            return EnumC0225t.f1470f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: g */
        public boolean mo3066g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: h */
        public boolean mo3065h() {
            return true;
        }
    };

    /* renamed from: o */
    static AbstractC0224s f3784o = new AbstractC0229x("freezeAI") { // from class: com.corrodinggames.rts.game.units.h.21
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Freeze high level AI logic (120secs)";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: d */
        public String mo3101d() {
            String str = "Freeze AI";
            LoggerMaybe.m1082A();
            C0555h m3179L = C0555h.m3179L();
            if (m3179L != null) {
                int i = -1;
                if (m3179L.f1609bV instanceof C0136a) {
                    i = ((int) ((C0136a) m3179L.f1609bV).f619bF) / 60;
                }
                if (i > 0) {
                    str = str + "(" + i + ")";
                }
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            return abstractC0244am.f1609bV instanceof C0136a;
        }
    };

    /* renamed from: p */
    static AbstractC0224s f3785p = new AbstractC0229x("changeAlliance") { // from class: com.corrodinggames.rts.game.units.h.22
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Change selected player's alliance (players with the same letter are allied)";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Ally:";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: d */
        public String mo3101d() {
            C0555h m3179L;
            String str = "Ally";
            if (C0555h.m3179L() != null) {
                str = "Ally: " + m3179L.f1609bV.m4850h();
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }
    };

    /* renamed from: q */
    static AbstractC0224s f3786q = new AbstractC0229x("startRecording") { // from class: com.corrodinggames.rts.game.units.h.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Start recording a replay to file";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Start Recording";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: d */
        public String mo3101d() {
            String str;
            if (!LoggerMaybe.m1082A().f6126cb.m2449i()) {
                str = "Start Recording";
            } else {
                str = "Stop Recording";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            if (LoggerMaybe.m1082A().f6126cb.m2450h()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo4276a(AbstractC0244am abstractC0244am) {
            return LoggerMaybe.m1082A().f6126cb.m2449i();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public boolean mo4745c(AbstractC0244am abstractC0244am, boolean z) {
            LoggerMaybe m1082A = LoggerMaybe.m1082A();
            LoggerMaybe.LogDebug2("Start recording clicked");
            if (m1082A.f6126cb.m2450h()) {
                LoggerMaybe.LogDebug2("Already in a replay");
                return false;
            }
            m1082A.m1042a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.2.1
                @Override // java.lang.Runnable
                public void run() {
                    LoggerMaybe m1082A2 = LoggerMaybe.m1082A();
                    if (!m1082A2.f6126cb.m2449i()) {
                        C0555h m3179L = C0555h.m3179L();
                        m1082A2.f6117bS.f5197b = true;
                        if (!m1082A2.f6122bX.lock1) {
                            long j = m1082A2.f6122bX.f5567w;
                            m1082A2.f6122bX.f5482o = true;
                            m1082A2.f6122bX.m1623R();
                            m1082A2.f6122bX.f5567w = j;
                            m1082A2.f6122bX.f5539bm = true;
                            m1082A2.f6239bx = 0;
                            m1082A2.f6122bX.f5580X = m1082A2.f6239bx + 1;
                            m1082A2.f6122bX.m1453w();
                        }
                        String str = "[sandbox]" + m1082A2.m1015ak() + " [v" + m1082A2.m946u() + "] (" + C0758f.m2166a("d MMM yyyy HH.mm.ss") + ").replay";
                        m1082A2.f6126cb.m2455d(str);
                        m1082A2.f6117bS.f5197b = false;
                        LoggerMaybe.m970f(null, "Replay started as: " + str);
                        C0555h m3179L2 = C0555h.m3179L();
                        if (m3179L2 != null && m3179L != null) {
                            m3179L2.m3173a(m3179L);
                            m3179L2.f3769r = str;
                            return;
                        }
                        LoggerMaybe.m993b("Failed copySettingsFromAnotherEditor");
                        return;
                    }
                    m1082A2.f6126cb.m2456d();
                }
            });
            return false;
        }
    };

    /* renamed from: s */
    static AbstractC0224s f3787s = new AbstractC0229x("startReplayPlayback") { // from class: com.corrodinggames.rts.game.units.h.3
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Start playback of last a replay";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Start Playback";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: d */
        public String mo3101d() {
            String str;
            if (!LoggerMaybe.m1082A().f6126cb.m2450h()) {
                str = "Start Playback";
            } else {
                str = "Stop Playback";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            boolean m2449i = LoggerMaybe.m1082A().f6126cb.m2449i();
            C0555h m3179L = C0555h.m3179L();
            return (m3179L == null || m3179L.f3769r == null || m2449i) ? false : true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3072b(AbstractC0244am abstractC0244am) {
            C0555h m3179L = C0555h.m3179L();
            return (m3179L == null || m3179L.f3769r == null) ? false : true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo4276a(AbstractC0244am abstractC0244am) {
            return LoggerMaybe.m1082A().f6126cb.m2450h();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public boolean mo4745c(AbstractC0244am abstractC0244am, boolean z) {
            final LoggerMaybe m1082A = LoggerMaybe.m1082A();
            final String str = C0555h.m3179L().f3769r;
            if (str == null) {
                m1082A.m964i("No last replay found");
                return false;
            } else if (!m1082A.f6126cb.m2450h()) {
                final Runnable runnable = new Runnable() { // from class: com.corrodinggames.rts.game.units.h.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        LoggerMaybe m1082A2 = LoggerMaybe.m1082A();
                        if (!m1082A2.f6126cb.m2450h()) {
                            boolean z2 = m1082A2.f6110bL.f841E;
                            C0555h m3179L = C0555h.m3179L();
                            boolean z3 = m1082A2.f6267dp;
                            boolean z4 = m1082A2.f6268dq;
                            m1082A2.f6126cb.f4477f = true;
                            m1082A2.f6126cb.m2457c(str);
                            m1082A2.f6126cb.f4477f = false;
                            m1082A2.f6267dp = z3;
                            m1082A2.f6268dq = z4;
                            C0555h m3179L2 = C0555h.m3179L();
                            if (m3179L2 != null && m3179L != null) {
                                m3179L2.m3173a(m3179L);
                            } else {
                                LoggerMaybe.m993b("Failed copySettingsFromAnotherEditor");
                            }
                            m1082A2.f6100bv = true;
                            if (m1082A2.f6110bL != null) {
                                m1082A2.f6110bL.f841E = z2;
                            }
                            m1082A2.f6161cT = true;
                            if (m3179L2 != null) {
                                m3179L2.m3178M();
                                return;
                            }
                            return;
                        }
                        LoggerMaybe.LogDebug2("stopPlaybackRunnable: Already started");
                    }
                };
                final C0767e m2000a = C0767e.m2000a("Start playback of last recording?", true);
                m2000a.m2001a(C0820a.m1724a("menus.common.ok", new Object[0]), new AbstractC0772i() { // from class: com.corrodinggames.rts.game.units.h.3.2
                    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i
                    /* renamed from: a */
                    public boolean mo1449a(C0765c c0765c) {
                        m2000a.m1964i();
                        m1082A.m1042a(runnable);
                        return true;
                    }
                });
                m1082A.f6117bS.m1866a(m2000a);
                return false;
            } else {
                m1082A.m1042a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.3.3
                    @Override // java.lang.Runnable
                    public void run() {
                        LoggerMaybe m1082A2 = LoggerMaybe.m1082A();
                        if (!m1082A2.f6126cb.m2450h()) {
                            LoggerMaybe.LogDebug2("stopPlaybackRunnable: Already stopped");
                            return;
                        }
                        m1082A2.f6126cb.m2456d();
                        m1082A2.f6237bt = 1.0f;
                        m1082A2.f6100bv = true;
                        C0555h m3179L = C0555h.m3179L();
                        if (m3179L != null) {
                            m1082A2.f6099bs = m3179L.f1609bV;
                        }
                    }
                });
                return false;
            }
        }
    };

    /* renamed from: t */
    static AbstractC0224s f3788t = new AbstractC0229x("hideInterface") { // from class: com.corrodinggames.rts.game.units.h.4
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            String str = "Hide interface till the screen is clicked/pressed";
            if (LoggerMaybe.m1005au()) {
                str = str + "\n-Enable mouse capture to also hide the mouse";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Hide interface";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public boolean mo4745c(AbstractC0244am abstractC0244am, boolean z) {
            LoggerMaybe.m1082A().f6161cT = true;
            return false;
        }
    };

    /* renamed from: u */
    static AbstractC0224s f3789u = new AbstractC0229x("freezeAllAI") { // from class: com.corrodinggames.rts.game.units.h.5
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Freeze full high level logic for all AI forever";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: d */
        public String mo3101d() {
            String str = "Freeze AI";
            C0555h m3179L = C0555h.m3179L();
            if (m3179L != null && m3179L.f3764c) {
                str = "Unfreeze AIs";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3074a(AbstractC0244am abstractC0244am, boolean z) {
            return true;
        }
    };

    /* renamed from: v */
    static AbstractC0224s f3790v = new AbstractC0229x("pauseGame") { // from class: com.corrodinggames.rts.game.units.h.6
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Pause Game";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            if (LoggerMaybe.m1082A().f6237bt != 0.0f) {
                return "Pause: Off";
            }
            return "Pause: On";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public boolean mo4745c(AbstractC0244am abstractC0244am, boolean z) {
            LoggerMaybe m1082A = LoggerMaybe.m1082A();
            if (m1082A.f6126cb.m2450h()) {
            }
            if (m1082A.f6237bt != 0.0f) {
                m1082A.f6237bt = 0.0f;
                return false;
            }
            m1082A.f6237bt = 1.0f;
            return false;
        }
    };

    /* renamed from: w */
    static AbstractC0224s f3791w = new AbstractC0229x("slowGame") { // from class: com.corrodinggames.rts.game.units.h.7
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Slow motion";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            if (LoggerMaybe.m1082A().f6237bt != 0.1f) {
                return "Slow motion: Off";
            }
            return "Slow motion: On";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public boolean mo4745c(AbstractC0244am abstractC0244am, boolean z) {
            LoggerMaybe m1082A = LoggerMaybe.m1082A();
            if (m1082A.f6126cb.m2450h()) {
            }
            if (m1082A.f6237bt == 1.0f) {
                m1082A.f6237bt = 0.1f;
                return false;
            }
            m1082A.f6237bt = 1.0f;
            return false;
        }
    };

    /* renamed from: x */
    static AbstractC0224s f3792x = new AbstractC0229x("fastForward") { // from class: com.corrodinggames.rts.game.units.h.8
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Fast Forward 1-5x";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            return "Fast Forward: " + LoggerMaybe.m1082A().f6237bt;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public boolean mo4745c(AbstractC0244am abstractC0244am, boolean z) {
            LoggerMaybe m1082A = LoggerMaybe.m1082A();
            if (m1082A.f6126cb.m2450h()) {
            }
            if (m1082A.f6237bt == 1.0f) {
                m1082A.f6237bt = 2.0f;
                return false;
            } else if (m1082A.f6237bt == 2.0f) {
                m1082A.f6237bt = 3.0f;
                return false;
            } else if (m1082A.f6237bt == 3.0f) {
                m1082A.f6237bt = 4.0f;
                return false;
            } else if (m1082A.f6237bt == 4.0f) {
                m1082A.f6237bt = 5.0f;
                return false;
            } else if (m1082A.f6237bt == 5.0f) {
                m1082A.f6237bt = 10.0f;
                return false;
            } else {
                m1082A.f6237bt = 1.0f;
                return false;
            }
        }
    };

    /* renamed from: y */
    static AbstractC0224s f3793y = new AbstractC0229x("search") { // from class: com.corrodinggames.rts.game.units.h.9
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: j */
        public C0934e mo4266j() {
            return C0555h.f3768g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Search for units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            LoggerMaybe.m1082A();
            C0555h m3179L = C0555h.m3179L();
            if (m3179L != null && m3179L.f3773F == EnumC0596n.f3862e) {
                return "Search: " + C0758f.m2131b(m3179L.f3774G, 8);
            }
            return "Search units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: c */
        public boolean mo4745c(AbstractC0244am abstractC0244am, boolean z) {
            LoggerMaybe m1082A = LoggerMaybe.m1082A();
            if (m1082A.f6126cb.m2451g()) {
                m1082A.m985c("Reply active", "Changing search filter is currently not supported while recording a replay");
                return false;
            }
            C0841ae c0841ae = new C0841ae() { // from class: com.corrodinggames.rts.game.units.h.9.1
                @Override // com.corrodinggames.rts.gameFramework.p041i.C0841ae
                /* renamed from: a */
                public void mo1447a(String str) {
                    LoggerMaybe.LogDebug2("Searching for: " + str);
                    LoggerMaybe m1082A2 = LoggerMaybe.m1082A();
                    if (m1082A2.f6126cb.m2451g()) {
                        m1082A2.m985c("Reply active", "Changing search filter is currently not supported while recording a replay");
                        return;
                    }
                    C0555h m3179L = C0555h.m3179L();
                    if (m3179L == null) {
                        LoggerMaybe.LogDebug2("search: No editor");
                    } else if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
                        LoggerMaybe.LogDebug2("search: No text entered");
                        if (m3179L.f3773F == EnumC0596n.f3862e) {
                            m3179L.f3773F = EnumC0596n.f3858a;
                        }
                        m3179L.f3774G = null;
                        m3179L.f3775H = true;
                        C0797f.m1905J();
                    } else {
                        m3179L.f3773F = EnumC0596n.f3862e;
                        m3179L.f3774G = str;
                        m3179L.f3775H = true;
                        C0797f.m1905J();
                    }
                }

                @Override // com.corrodinggames.rts.gameFramework.p041i.C0841ae
                /* renamed from: a */
                public void mo1448a() {
                }
            };
            c0841ae.f5641b = "Search units by internal name or text title.";
            c0841ae.f5644e = "Search units";
            c0841ae.f5645f = "Search";
            c0841ae.f5646g = "Cancel";
            C0831ad.m1600a(c0841ae);
            return false;
        }
    };

    /* renamed from: z */
    static AbstractC0224s f3794z = new AbstractC0229x("enableDebug") { // from class: com.corrodinggames.rts.game.units.h.10
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "Show hidden unit information in tooltips including flags, ammo, tags and resources";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            if (!LoggerMaybe.m1082A().f6231bl) {
                return "Debug: Off";
            }
            return "Debug: On";
        }
    };

    /* renamed from: A */
    static AbstractC0224s f3795A = new AbstractC0229x("enableAIDebug") { // from class: com.corrodinggames.rts.game.units.h.11
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "AI debug view";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            LoggerMaybe.m1082A();
            if (!C0136a.f553ar) {
                return "AI Debug: Off";
            }
            return "AI Debug: On";
        }
    };

    /* renamed from: B */
    static AbstractC0224s f3796B = new AbstractC0229x("enableTriggerDebug") { // from class: com.corrodinggames.rts.game.units.h.13
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3076a() {
            return "For debugging autoTriggers. When enabled will log a message when any auto triggers fire on any selected units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3073b() {
            if (!LoggerMaybe.m1082A().f6233bn) {
                return "Trigger Debug: Off";
            }
            return "Trigger Debug: On";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3072b(AbstractC0244am abstractC0244am) {
            return LoggerMaybe.m1082A().f6231bl;
        }
    };

    /* renamed from: J */
    static C0207b f3797J = new C0207b() { // from class: com.corrodinggames.rts.game.units.h.15
        @Override // com.corrodinggames.rts.game.units.p013a.C0207b
        public boolean isAvailable(AbstractC0224s abstractC0224s, AbstractC0244am abstractC0244am) {
            if (abstractC0224s instanceof C0213h) {
                abstractC0224s = ((C0213h) abstractC0224s).m4794n_();
            }
            C0555h m3179L = C0555h.m3179L();
            if (m3179L == null) {
                return true;
            }
            EnumC0596n enumC0596n = m3179L.f3773F;
            if (enumC0596n == null) {
                enumC0596n = EnumC0596n.f3858a;
            }
            if (enumC0596n == EnumC0596n.f3858a && C0555h.m3175a(abstractC0224s, abstractC0244am)) {
                return false;
            }
            if (enumC0596n == EnumC0596n.f3861d && abstractC0224s == C0555h.f3777h) {
                return true;
            }
            if (enumC0596n == EnumC0596n.f3861d && abstractC0224s == C0555h.f3778i) {
                return true;
            }
            if (enumC0596n == EnumC0596n.f3862e && abstractC0224s == C0555h.f3793y) {
                return true;
            }
            if (abstractC0224s == C0555h.f3796B && !C0555h.f3796B.mo3072b(abstractC0244am)) {
                return false;
            }
            return enumC0596n.mo3093a(abstractC0224s.mo5979i());
        }
    };

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public AbstractC0249ar mo5980r() {
        return AbstractC0249ar.f1793Y;
    }

    /* renamed from: w */
    public static boolean m3168w() {
        if (LoggerMaybe.m1082A().f6126cb.m2451g()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3144b() {
        return this.f3762a;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3142c() {
        return this.f3763b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0934e mo3021v() {
        if (this.f1609bV.f1306k == -1) {
            return null;
        }
        return f3650dL[this.f1609bV.m4930O()];
    }

    /* renamed from: K */
    public static void m3180K() {
        f3768g = LoggerMaybe.m1082A().f6113bO.mo225a(C0067R.drawable.icon_search);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo3146a(AbstractC0244am abstractC0244am) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3033d() {
        if (this.f1607bT) {
            return C0519b.f3587b;
        }
        return C0519b.f3589d[this.f1609bV.m4930O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3024k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3032d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3030e() {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        m1082A.f6116bR.m2357b(this.f6957el, this.f6958em, this.f6959en);
        this.f3885L = C0519b.f3587b;
        m452S(0);
        this.f1606bS = false;
        m1082A.f6111bM.m2765a(C0631e.f4049o, 0.8f, this.f6957el, this.f6958em);
        m2850bq();
        return true;
    }

    public C0555h(boolean z) {
        super(z);
        this.f3762a = new PointF[6];
        this.f3763b = new PointF[this.f3762a.length];
        f3765d = new Paint();
        f3765d.m5749a(40, 0, 255, 0);
        f3765d.mo5730a(true);
        f3765d.m5752a(2.0f);
        f3765d.m5744a(Paint.Cap.f201b);
        f3766e = new Paint();
        f3766e.m5741a(f3765d);
        f3766e.m5749a(55, 255, 60, 60);
        f3767f = new Paint();
        f3767f.m5749a(60, 255, 255, 255);
        this.f3771D = null;
        this.f3772E = EnumC0603o.f3865a;
        this.f3773F = EnumC0596n.f3858a;
        this.f3775H = true;
        m2678T(20);
        m2677U(20);
        this.f1621ch = 10.0f;
        this.f6957el = -1000.0f;
        this.f6958em = -1000.0f;
        this.f1622ci = this.f1621ch;
        this.f1633ct = 170000.0f;
        this.f1632cs = this.f1633ct;
        this.f3885L = C0519b.f3587b;
        for (int i = 0; i < this.f3762a.length; i++) {
            this.f3762a[i] = new PointF();
            this.f3763b[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3176a(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        PointF[] mo3144b = interfaceC0469d.mo3144b();
        PointF[] mo3142c = interfaceC0469d.mo3142c();
        AbstractC0244am m2990X = abstractC0623y.m2990X();
        abstractC0623y.f3966aM = m2990X != null;
        if (m2990X != null) {
            for (int i = 0; i < mo3144b.length; i++) {
                PointF pointF = mo3144b[i];
                PointF pointF2 = mo3142c[i];
                pointF.f227a = C0758f.m2197a(pointF.f227a, pointF2.f227a, 0.1f * f);
                pointF.f228b = C0758f.m2197a(pointF.f228b, pointF2.f228b, 0.1f * f);
                pointF.f227a += (pointF2.f227a - pointF.f227a) * 0.04f * f;
                pointF.f228b += (pointF2.f228b - pointF.f228b) * 0.04f * f;
                float f2 = m2990X.f1621ch * 0.75f;
                if (C0758f.m2124c(pointF.f227a - pointF2.f227a) < 1.0f) {
                    pointF2.f227a = C0758f.m2112d(-f2, f2);
                }
                if (C0758f.m2124c(pointF.f228b - pointF2.f228b) < 1.0f) {
                    pointF2.f228b = C0758f.m2112d(-f2, f2);
                }
            }
        } else if (mo3144b[0].f227a != 0.0f || mo3144b[0].f228b != 0.0f) {
            for (int i2 = 0; i2 < mo3144b.length; i2++) {
                PointF pointF3 = mo3144b[i2];
                PointF pointF4 = mo3142c[i2];
                pointF3.f227a = 0.0f;
                pointF3.f228b = 0.0f;
                pointF4.f227a = 0.0f;
                pointF4.f228b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo1755a(float f) {
        if (f < 0.3f) {
            f = 0.3f;
        }
        if (this.f3943aw && this.f1609bV.m4899b()) {
            int i = 0;
            while (true) {
                if (i < AbstractC0197n.f1365c) {
                    AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
                    if (m4842k == null || m4842k.m4899b()) {
                        i++;
                    } else {
                        m4570e(m4842k);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        super.mo1755a(f);
        if (!this.f1607bT) {
            m3176a(f, this);
        }
        this.f1632cs = this.f1633ct;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo3040a(float f, boolean z) {
        if (!this.f1607bT) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3029e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: f */
    public float mo3028f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo3036c(float f) {
        if (!super.mo3036c(f)) {
            return false;
        }
        LoggerMaybe.m1082A();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3038a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: x */
    public boolean mo3201x() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: y */
    public int mo3135y() {
        return 850000;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public float mo3205b(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public float mo3204c(AbstractC0244am abstractC0244am) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3022m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3037b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3020z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3052A() {
        return 9.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3051B() {
        return 9.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3035c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3023l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3050C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3049D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3147a(AbstractC0224s abstractC0224s, boolean z) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        if (abstractC0224s instanceof C0593k) {
            C0593k c0593k = (C0593k) abstractC0224s;
            boolean z2 = true;
            if (z) {
                z2 = 1 == 0;
            }
            if (c0593k.f3852a) {
                z2 = !z2;
            }
            if (z2) {
                C0136a c0136a = null;
                int i = this.f1609bV.f1306k + 1;
                while (true) {
                    if (i < AbstractC0197n.f1365c) {
                        AbstractC0197n m4842k = AbstractC0197n.m4842k(i);
                        if (m4842k == null || m4842k.m4899b()) {
                            i++;
                        } else {
                            c0136a = m4842k;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (c0136a == null && this.f1609bV.f1306k < 4) {
                    c0136a = AbstractC0197n.m4842k(this.f1609bV.f1306k + 1);
                    if (c0136a == null) {
                        LoggerMaybe.LogDebug2("Sandbox adding new team:" + this.f1609bV.f1306k);
                        C0136a c0136a2 = new C0136a(this.f1609bV.f1306k + 1);
                        c0136a = c0136a2;
                        c0136a.f1312q = 1;
                        c0136a.f1329E = true;
                        c0136a.f1330F = true;
                        if (!this.f3764c) {
                            c0136a2.f619bF = 0.0f;
                        } else {
                            c0136a2.f619bF = Float.MAX_VALUE;
                        }
                    }
                }
                if (c0136a == null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < AbstractC0197n.f1365c) {
                            AbstractC0197n m4842k2 = AbstractC0197n.m4842k(i2);
                            if (m4842k2 == null || m4842k2.m4899b()) {
                                i2++;
                            } else {
                                c0136a = m4842k2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (c0136a != null) {
                    m4570e(c0136a);
                    if (!m1082A.f6126cb.m2450h()) {
                        m1082A.f6099bs = c0136a;
                    }
                }
            } else {
                AbstractC0197n abstractC0197n = null;
                int i3 = this.f1609bV.f1306k - 1;
                while (true) {
                    if (i3 >= 0) {
                        AbstractC0197n m4842k3 = AbstractC0197n.m4842k(i3);
                        if (m4842k3 == null || m4842k3.m4899b()) {
                            i3--;
                        } else {
                            abstractC0197n = m4842k3;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (abstractC0197n == null) {
                    int i4 = AbstractC0197n.f1365c - 1;
                    while (true) {
                        if (i4 >= 0) {
                            AbstractC0197n m4842k4 = AbstractC0197n.m4842k(i4);
                            if (m4842k4 == null || m4842k4.m4899b()) {
                                i4--;
                            } else {
                                abstractC0197n = m4842k4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (abstractC0197n != null) {
                    m4570e(abstractC0197n);
                    if (!m1082A.f6126cb.m2450h()) {
                        m1082A.f6099bs = abstractC0197n;
                    }
                }
            }
        }
        if (abstractC0224s instanceof C0592j) {
            C0592j c0592j = (C0592j) abstractC0224s;
            boolean z3 = true;
            if (z) {
                z3 = 1 == 0;
            }
            if (c0592j.f3850a) {
                z3 = !z3;
            }
            ArrayList m1689j = m1082A.f6124bZ.m1689j();
            if (m1689j.size() == 0) {
                this.f3771D = null;
            } else if (z3) {
                if (this.f3771D == null) {
                    this.f3771D = (C0824b) m1689j.get(0);
                } else {
                    C0824b c0824b = null;
                    boolean z4 = false;
                    Iterator it = m1689j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0824b c0824b2 = (C0824b) it.next();
                        if (z4) {
                            c0824b = c0824b2;
                            break;
                        } else if (c0824b2 == this.f3771D) {
                            z4 = true;
                        }
                    }
                    this.f3771D = c0824b;
                }
            } else if (this.f3771D == null) {
                this.f3771D = (C0824b) m1689j.get(m1689j.size() - 1);
            } else {
                C0824b c0824b3 = null;
                boolean z5 = false;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m1689j);
                Collections.reverse(arrayList);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0824b c0824b4 = (C0824b) it2.next();
                    if (z5) {
                        c0824b3 = c0824b4;
                        break;
                    } else if (c0824b4 == this.f3771D) {
                        z5 = true;
                    }
                }
                this.f3771D = c0824b3;
            }
        }
        if (abstractC0224s instanceof C0594l) {
            C0594l c0594l = (C0594l) abstractC0224s;
            boolean z6 = true;
            if (z) {
                z6 = 1 == 0;
            }
            if (c0594l.f3854a) {
                z6 = !z6;
            }
            this.f3772E = this.f3772E.m3090a(!z6);
        }
        if (abstractC0224s instanceof C0591i) {
            this.f1609bV.m4869d(10000.0f);
        }
        if (abstractC0224s instanceof C0595m) {
            ((C0595m) abstractC0224s).m3098n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static C0555h m3179L() {
        return LoggerMaybe.m1082A().f6117bS.m1818i();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3174a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        LoggerMaybe m1082A = LoggerMaybe.m1082A();
        if (abstractC0224s instanceof C0213h) {
            abstractC0224s = ((C0213h) abstractC0224s).m4794n_();
        }
        if (abstractC0224s == f3777h) {
            if (m3168w()) {
                LoggerMaybe.m993b("Not reloading units: Need to keep network sync");
                m1082A.f6117bS.m1843b("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (m1082A.f6124bZ.m1691h() == 0) {
                    m1082A.f6117bS.m1843b("No custom units to reload");
                    return;
                }
                LoggerMaybe.LogDebug2("Reload units requested");
                m1082A.f6124bZ.m1705a(true, false);
                Iterator it = AbstractC0197n.m4883c().iterator();
                while (it.hasNext()) {
                    AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
                    if (abstractC0197n instanceof C0136a) {
                        ((C0136a) abstractC0197n).m5364ah();
                    }
                }
                m1082A.f6117bS.m1843b("All custom unit files reloaded");
            }
        }
        if (abstractC0224s == f3778i) {
            if (m3168w()) {
                LoggerMaybe.m993b("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (m1082A.f6124bZ.m1691h() == 0) {
                    m1082A.f6117bS.m1843b("No custom units to reload");
                    return;
                }
                LoggerMaybe.LogDebug2("Reload active only requested");
                m1082A.f6124bZ.m1705a(true, true);
                Iterator it2 = AbstractC0197n.m4883c().iterator();
                while (it2.hasNext()) {
                    AbstractC0197n abstractC0197n2 = (AbstractC0197n) it2.next();
                    if (abstractC0197n2 instanceof C0136a) {
                        ((C0136a) abstractC0197n2).m5364ah();
                    }
                }
                int i = C0348af.f2193d;
                int i2 = 100;
                String str = "Quick reloaded changed data for " + i + " units active on map.";
                if (m1082A.f6115bQ.liveReloading && i == 0) {
                    str = str + " (Note: Live reloading is currently enabled, so changed units may have already be reloaded)";
                    i2 = 170;
                }
                m1082A.f6117bS.m1858a(str, i2);
            }
        }
        if (abstractC0224s == f3780k || abstractC0224s == f3781l || abstractC0224s == f3779j) {
            int i3 = 0;
            if (z) {
                return;
            }
            Iterator it3 = AbstractC0244am.m4665bF().iterator();
            while (it3.hasNext()) {
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) it3.next();
                if ((abstractC0244am2 instanceof AbstractC0244am) && C0758f.m2196a(abstractC0244am2.f6957el, abstractC0244am2.f6958em, pointF.f227a, pointF.f228b) < 2500.0f) {
                    if (abstractC0224s == f3780k) {
                        if (abstractC0244am2.f1651cL == null && abstractC0244am2.f1652cM == null) {
                            abstractC0244am2.m4606ch();
                            if ((abstractC0244am2 instanceof AbstractC0623y) && abstractC0244am2.m4662bI()) {
                                m1082A.f6119bU.m1160a((AbstractC0623y) abstractC0244am2);
                            }
                        }
                    } else if (abstractC0224s == f3781l) {
                        if (abstractC0244am2.f1651cL == null && abstractC0244am2.f1652cM == null) {
                            abstractC0244am2.f1632cs = -1.0f;
                        }
                    } else if (abstractC0224s != f3779j) {
                        continue;
                    } else if (i3 <= 4) {
                        if (!abstractC0244am2.m4662bI() && !(abstractC0244am2 instanceof C0243al) && !abstractC0244am2.f1607bT && abstractC0244am2.f1651cL == null && abstractC0244am2.f1652cM == null) {
                            i3++;
                            InterfaceC0303as mo5980r = abstractC0244am2.mo5980r();
                            for (int i4 = -25; i4 < 25; i4++) {
                                AbstractC0244am mo3676a = mo5980r.mo3676a();
                                mo3676a.f6957el = abstractC0244am2.f6957el + (i4 * 0.5f) + 1.0f;
                                mo3676a.f6958em = abstractC0244am2.f6958em + (i4 * 0.5f) + 1.0f;
                                mo3676a.m4671b(abstractC0244am2.f1609bV);
                                AbstractC0197n.m4878c(mo3676a);
                                mo3676a.f1618ce = C0758f.m2175a((AbstractC1120w) abstractC0244am2, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 25 + i4);
                                if (mo3676a instanceof AbstractC0623y) {
                                    ((AbstractC0623y) mo3676a).f3944ax = true;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        if (abstractC0224s == f3783n) {
            if (z) {
                return;
            }
            C0188f m3361a = C0507q.m3361a(this, pointF.f227a, pointF.f228b, pointF.f227a, pointF.f228b);
            if (m3361a != null) {
                m3361a.f6959en = 100.0f;
                m3361a.f984j = null;
            }
        }
        if (abstractC0224s == f3782m) {
            if (z) {
                return;
            }
            Iterator it4 = AbstractC0244am.m4665bF().iterator();
            while (it4.hasNext()) {
                AbstractC1120w abstractC1120w = (AbstractC1120w) it4.next();
                if ((abstractC1120w instanceof AbstractC0623y) && (abstractC1120w instanceof InterfaceC0501l) && C0758f.m2196a(abstractC1120w.f6957el, abstractC1120w.f6958em, pointF.f227a, pointF.f228b) < 2500.0f) {
                    ((InterfaceC0501l) abstractC1120w).mo3388dw();
                }
            }
            return;
        }
        if (abstractC0224s == f3784o) {
            AbstractC0197n abstractC0197n3 = this.f1609bV;
            if (abstractC0197n3 instanceof C0136a) {
                C0136a c0136a = (C0136a) abstractC0197n3;
                if (c0136a.f619bF > 0.0f) {
                    c0136a.f619bF = 0.0f;
                } else {
                    c0136a.f619bF = 10800.0f;
                }
            }
        }
        if (abstractC0224s == f3785p) {
            AbstractC0197n abstractC0197n4 = this.f1609bV;
            abstractC0197n4.f1312q++;
            if (abstractC0197n4.f1312q > 4) {
                abstractC0197n4.f1312q = 0;
            }
        }
        if (abstractC0224s == f3789u) {
            boolean z2 = false;
            boolean z3 = false;
            Iterator it5 = AbstractC0197n.m4883c().iterator();
            while (it5.hasNext()) {
                AbstractC0197n abstractC0197n5 = (AbstractC0197n) it5.next();
                if (abstractC0197n5 instanceof C0136a) {
                    if (((C0136a) abstractC0197n5).f619bF > 0.0f) {
                        z2 = true;
                    }
                    z3 = true;
                }
            }
            boolean z4 = !z2;
            if (!z3) {
                z4 = !this.f3764c;
            }
            this.f3764c = z4;
            m3178M();
        }
        if (abstractC0224s == f3790v) {
        }
        if (abstractC0224s == f3791w) {
        }
        if (abstractC0224s == f3792x) {
        }
        if (abstractC0224s == f3794z) {
            m1082A.f6231bl = !m1082A.f6231bl;
        }
        if (abstractC0224s == f3795A) {
            C0136a.f553ar = !C0136a.f553ar;
        }
        if (abstractC0224s == f3796B) {
            m1082A.f6233bn = !m1082A.f6233bn;
        }
        if (abstractC0224s instanceof C0611q) {
            C0609p.m3083a(((C0611q) abstractC0224s).f3875a, pointF);
        }
        super.mo3174a(abstractC0224s, z, pointF, abstractC0244am);
    }

    /* renamed from: M */
    public void m3178M() {
        Iterator it = AbstractC0197n.m4883c().iterator();
        while (it.hasNext()) {
            AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
            if (abstractC0197n instanceof C0136a) {
                C0136a c0136a = (C0136a) abstractC0197n;
                if (!this.f3764c) {
                    c0136a.f619bF = 0.0f;
                } else {
                    c0136a.f619bF = Float.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m3175a(AbstractC0224s abstractC0224s, AbstractC0244am abstractC0244am) {
        if (abstractC0224s instanceof C0213h) {
            abstractC0224s = ((C0213h) abstractC0224s).m4794n_();
        }
        if (abstractC0224s == f3784o || abstractC0224s == f3791w || abstractC0224s == f3792x || abstractC0224s == f3782m || abstractC0224s == f3780k || abstractC0224s == f3779j || abstractC0224s == f3794z || abstractC0224s == f3785p || abstractC0224s == f3786q || abstractC0224s == f3787s || abstractC0224s == f3788t || abstractC0224s == f3796B) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m3172a(ArrayList arrayList, int i) {
        if (i != 1) {
            return;
        }
        f3770C = new ArrayList();
        f3770C.add(new C0593k(true, false));
        f3770C.add(new C0593k(true, true));
        f3770C.add(new C0593k(false, false));
        f3770C.add(new C0595m(true, false));
        f3770C.add(new C0595m(true, true));
        f3770C.add(new C0595m(false, false));
        f3770C.add(new C0592j(true, false));
        f3770C.add(new C0592j(true, true));
        f3770C.add(new C0592j(false, false));
        f3770C.add(new C0594l(true, false));
        f3770C.add(new C0594l(true, true));
        f3770C.add(new C0594l(false, false));
        f3770C.add(new C0611q(EnumC0612r.f3876a));
        f3770C.add(new C0611q(EnumC0612r.f3877b));
        f3770C.add(new C0611q(EnumC0612r.f3878c));
        f3770C.add(new C0611q(EnumC0612r.f3879d));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0591i());
        arrayList2.add(f3793y);
        arrayList2.add(f3777h);
        arrayList2.add(f3778i);
        arrayList2.add(f3780k);
        arrayList2.add(f3779j);
        arrayList2.add(f3781l);
        arrayList2.add(f3783n);
        arrayList2.add(f3782m);
        arrayList2.add(f3789u);
        arrayList2.add(f3790v);
        arrayList2.add(f3791w);
        arrayList2.add(f3792x);
        arrayList2.add(f3794z);
        arrayList2.add(f3785p);
        arrayList2.add(f3786q);
        arrayList2.add(f3787s);
        arrayList2.add(f3788t);
        if (LoggerMaybe.f6191at) {
            arrayList2.add(f3795A);
        }
        arrayList2.add(f3796B);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            f3770C.add(new C0213h((AbstractC0224s) it.next(), f3797J, true));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(AbstractC0249ar.f1739ae);
        Collections.sort(arrayList3, new Comparator() { // from class: com.corrodinggames.rts.game.units.h.14
            @Override // java.util.Comparator
            /* renamed from: a */
            public int mo3165a(InterfaceC0303as interfaceC0303as, InterfaceC0303as interfaceC0303as2) {
                AbstractC0244am m4642c = AbstractC0244am.m4642c(interfaceC0303as);
                AbstractC0244am m4642c2 = AbstractC0244am.m4642c(interfaceC0303as2);
                int compareTo = Boolean.valueOf(m4642c.mo4317bP()).compareTo(Boolean.valueOf(m4642c2.mo4317bP()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(interfaceC0303as.mo3624j()).compareTo(Boolean.valueOf(interfaceC0303as2.mo3624j()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                int compareTo3 = Boolean.valueOf(m4642c.mo4318bO()).compareTo(Boolean.valueOf(m4642c2.mo4318bO()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
                C0424b mo3603u = interfaceC0303as.mo3603u();
                C0424b mo3603u2 = interfaceC0303as2.mo3603u();
                C0424b mo3680B = interfaceC0303as.mo3680B();
                C0424b mo3680B2 = interfaceC0303as2.mo3680B();
                if (mo3680B != null) {
                    mo3603u = C0424b.m4054a(mo3603u, mo3680B);
                }
                if (mo3680B2 != null) {
                    mo3603u2 = C0424b.m4054a(mo3603u2, mo3680B2);
                }
                int m4056a = mo3603u.m4056a(mo3603u2);
                if (m4056a != 0) {
                    return m4056a;
                }
                return 0;
            }
        });
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it2.next();
            if (interfaceC0303as != AbstractC0249ar.f1777I && !interfaceC0303as.mo3626i().equals("test_tank") && !interfaceC0303as.mo3626i().equals("missing") && interfaceC0303as != AbstractC0249ar.f1764v && interfaceC0303as != AbstractC0249ar.f1759q && interfaceC0303as != AbstractC0249ar.f1786R && interfaceC0303as != AbstractC0249ar.f1776H && interfaceC0303as != AbstractC0249ar.f1791W && interfaceC0303as != AbstractC0249ar.f1792X && interfaceC0303as != AbstractC0249ar.f1793Y && interfaceC0303as != AbstractC0249ar.f1794Z && (AbstractC0244am.m4642c(interfaceC0303as) instanceof AbstractC0623y) && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2948aE)) {
                C0213h c0213h = new C0213h(new C0227v(interfaceC0303as, 1, null), f3797J);
                boolean z = false;
                Iterator it3 = f3770C.iterator();
                while (it3.hasNext()) {
                    if (((AbstractC0224s) it3.next()).equals(c0213h)) {
                        z = true;
                    }
                }
                if (!z) {
                    f3770C.add(c0213h);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3148N() {
        LoggerMaybe.m1082A();
        return f3770C;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo3048E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3027g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3047F() {
        return LoggerMaybe.m1082A().f6115bQ.renderExtraShadows && !this.f1607bT;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3046G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3045H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public boolean mo1749u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: I */
    public boolean mo3044I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public boolean mo3031d(AbstractC0244am abstractC0244am) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: J */
    public boolean mo3043J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public float mo3039a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        return super.mo3039a(abstractC0244am, 0.0f, c0188f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: O */
    public void mo3177O() {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: P */
    public boolean mo3042P() {
        return true;
    }

    /* renamed from: a */
    public void m3173a(C0555h c0555h) {
        this.f3769r = c0555h.f3769r;
        this.f3764c = c0555h.f3764c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo446a(StreamWriter streamWriter) {
        streamWriter.m1396c(1);
        streamWriter.m1406a(this.f3773F);
        streamWriter.m1399b(this.f3774G);
        super.mo446a(streamWriter);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo445a(Reader reader) {
        byte m1299d = reader.m1299d();
        this.f3773F = (EnumC0596n) reader.m1303b(EnumC0596n.class);
        if (this.f3773F == null) {
            this.f3773F = EnumC0596n.f3858a;
        }
        if (m1299d >= 1) {
            this.f3774G = reader.ReadString();
        }
        super.mo445a(reader);
    }
}
